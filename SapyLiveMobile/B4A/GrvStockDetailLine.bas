B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.2
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private btnPicture As Button
	Private btnReturn As Button
	Private btnSignature As Button
	Private lblCode As Label
	Private lblDesc As Label
	Private lblLinenotes As Label
	Private lblQty As Label
	Private lblSageNo As Label
	Private txtAmountOfLabelsToPrint As EditText
	Private txtQtyDamages As EditText
	Private txtQtyToProcess As EditText
	Private txtrecNotes As EditText
	
	'Take a pciture
	Private ion As Object
	Private Provider As FileProvider
	Private PictureTaken As Boolean
	
	Private const tempImageFile As String = "tempimage.jpg"
	Private DateTemplate As B4XDateTemplate
	
	Private Dialog As B4XDialog
	Private Root As B4XView
	Private SignatureSigned As Boolean
	Private SignatureTemplate As B4XSignatureTemplate
	Private Base As B4XView
	Private lblDateExpiryDate As Label
	Private txtSupplierBatchNo As EditText
	Private InputTemplate As B4XInputTemplate
	Private LongTextTemplate As B4XLongTextTemplate
	Private StartDate As String
	Dim x As PoListype 
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("GrvStockDetailLinePage")
	'grvstockdetaillinepage
	'load the layout to Root
	
	
	Dialog.Initialize (Root)
	
	DateTemplate.Initialize
	DateTemplate.MinYear = 2020
	DateTemplate.MaxYear = 2030

	DateTemplate.Initialize
	DateTemplate.MinYear = 2020
	DateTemplate.MaxYear = 2030
	
	
	LongTextTemplate.Initialize
	SignatureTemplate.Initialize
	InputTemplate.Initialize
	Provider.Initialize
	btnSignature.text = "Signature"
	
	
	
End Sub



Private Sub B4XPage_Appear
	x = Main.PoListypel.Get(Main.CurrentPoLine)
	
	lblCode.Text = x.Code
	lblDesc.Text = x.description_1
	lblQty.Text = x.fQtyChange
	lblLinenotes.Text = x.ClineNotes
	lblSageNo.Text = x.idInvoiceLines
	txtQtyToProcess.Text = x.fQtyToProcess
	txtAmountOfLabelsToPrint.Text = txtQtyToProcess.Text
	txtQtyDamages.Text = x.DamgeQty

	
	
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub btnSignature_Click
	Base = Root
	Dialog.Initialize (Base)
	
	Dialog.Title = "Customer Signature"
	Dialog.ButtonsFont = xui.CreateFontAwesome(20)
	Dim rs As ResumableSub = Dialog.ShowTemplate(SignatureTemplate, Chr(0xF00C), "", Chr(0xF00D))
	Dialog.GetButton(xui.DialogResponse_Positive).TextColor = xui.Color_Green
	Dialog.GetButton(xui.DialogResponse_Cancel).TextColor = xui.Color_Red
	Dialog.ButtonsFont = xui.CreateDefaultBoldFont(15) 'return it to the default font. It will no longer affect the current dialog
	Wait For (rs) Complete (Result As Int)

	If Result = xui.DialogResponse_Positive Then
		Dim b As Bitmap  = SignatureTemplate.Bitmap.Resize(  btnSignature.Width,   btnSignature.Height,True)
		Dim cs As CSBuilder
		cs.Initialize
		cs.Image(b,  btnSignature.Width, btnSignature.Height, False)
		cs.PopAll
		btnSignature.Text=cs
		
		Log("Before ")
		
		SignatureSigned = True
		
		
		Dim a As PictureUpload
		a.Initialize
	
		a.Content = b ' Array As Object(ImageToBytes(b))
		a.DocumentType = "Podetail Signature"
		a.FileName = x.IdInvoiceLines & "-Sig.JPG"
		a.IdInvoiceLines= x.IdInvoiceLines
		a.InvoiceId = x.autoIndex
		
		CallSub2(Main,"PostPicture",a)
		Sleep(1000)
		
		
		
		Log("After ")
	End If
	Dialog.Close(xui.DialogResponse_Cancel)
End Sub

Private Sub btnReturn_Click
	x.SupplierExpiryDate = lblDateExpiryDate.Text
	x.SupplierBatchNo = txtSupplierBatchNo.Text
	x.fQtyToProcess = txtQtyToProcess.Text
	x.DamgeQty  = txtQtyDamages.Text


	 Main.PoListypel.Set(Main.CurrentPoLine,x)
	Try
	btnPicture.Background = Null
	btnSignature.Background = Null
	Catch
		
		End Try
	btnPicture.Text = "Take A Picture"
	btnSignature.Text = "Signature"
	B4XPages.ShowPage("GrvStockIn")
End Sub

Private Sub btnPicture_Click
	Private rp As RuntimePermissions
	rp.CheckAndRequest(rp.PERMISSION_CAMERA)
	'Wait For Activity_PermissionResult  (Permission As String, Result As Boolean)
	
	TakePicture (1920, 1080)
	'TakePicture (btnPicture.Width, btnPicture.Height)
	Wait For Image_Available(Success As Boolean, bmp As B4XBitmap)
	If Success Then
	''btnPicture.SetBitmap(bmp)
	PictureTaken= True
	Main.BitmapPicture= bmp
		
		btnPicture.SetBackgroundImage(Main.BitmapPicture)
	
	
		Dim a As PictureUpload
		a.Initialize
	
		a.Content = bmp 'Array As Object(ImageToBytes(bmp))
		a.DocumentType = "Podetail Picture"
		a.FileName = x.IdInvoiceLines & ".JPG"
		a.IdInvoiceLines= x.IdInvoiceLines
		a.InvoiceId = x.autoIndex
		
		CallSub2(Main,"PostPicture",a)
		Sleep(1000)
	
	
	End If
End Sub

Private Sub TakePicture (TargetWidth As Int, TargetHeight As Int)
	Dim i As Intent
	i.Initialize("android.media.action.IMAGE_CAPTURE", "")
	File.Delete(Provider.SharedFolder, tempImageFile)
	Dim u As Object = Provider.GetFileUri(tempImageFile)
	i.PutExtra("output", u) 'the image will be saved to this path
	Try
		StartActivityForResult(i)
		Wait For ion_Event (MethodName As String, Args() As Object)
		Dim bmp As B4XBitmap
		If -1 = Args(0) Then
			Try
				Dim in As Intent = Args(1)
				If File.Exists(Provider.SharedFolder, tempImageFile) Then
					Dim Exif As ExifData
					Exif.Initialize(Provider.SharedFolder, tempImageFile)
					bmp = LoadBitmapSample(Provider.SharedFolder, tempImageFile, Max(TargetWidth, TargetHeight), Max(TargetWidth, TargetHeight))
					Log("Orientation: " & Exif.getAttribute(Exif.TAG_ORIENTATION))
					Select Exif.getAttribute(Exif.TAG_ORIENTATION)
						Case Exif.ORIENTATION_ROTATE_180 '3
							bmp = bmp.Rotate(180)
						Case Exif.ORIENTATION_ROTATE_90 '6
							bmp = bmp.Rotate(90)
						Case Exif.ORIENTATION_ROTATE_270 '8
							bmp = bmp.Rotate(270)
					End Select
					bmp = bmp.Resize(TargetWidth, TargetHeight, True)
				Else If in.HasExtra("data") Then 'try to get thumbnail instead
					Dim jo As JavaObject = in
					bmp = jo.RunMethodJO("getExtras", Null).RunMethod("get", Array("data"))
				End If
			Catch
				Log(LastException)
			End Try
		End If
		CallSubDelayed3(Me, "Image_Available", bmp.IsInitialized, bmp)
	Catch
		ToastMessageShow("Camera is not available.", True)
		Log(LastException)
		CallSubDelayed3(Me, "Image_Available", False, Null)
	End Try
End Sub


Sub StartActivityForResult(i As Intent)
	Dim jo As JavaObject = Me
	jo = jo.RunMethod("getBA", Null)
	ion = jo.CreateEvent("anywheresoftware.b4a.IOnActivityResult", "ion", Null)
	jo.RunMethod("startActivityForResult", Array(ion, i))
End Sub



Private Sub lblDateExpiryDate_Click
	DateTemplate.Initialize
	Dim OrigFormat As String=DateTime.DateFormat  'save orig date format
	DateTime.DateFormat="yyyy-MM-dd"
	Dialog.Title = "Start Date"
	Wait For (Dialog.ShowTemplate(DateTemplate, "", "", "CANCEL")) Complete (Result As Int)
	If Result = xui.DialogResponse_Positive Then
		lblDateExpiryDate.Text = DateTime.Date(DateTemplate.Date)
		StartDate = DateTime.Date(DateTemplate.Date)
	End If
	Dialog.Close(xui.DialogResponse_Cancel)
	DateTime.DateFormat=OrigFormat
	x.SupplierExpiryDate = lblDateExpiryDate.Text
End Sub

Public Sub ImageToBytes(Image As Bitmap) As Byte()
	If Image.IsInitialized Then
		Dim out As OutputStream
		out.InitializeToBytesArray(0)
		Image.WriteToStream(out, 100, "JPEG")
		out.Close
		Return out.ToBytesArray
	Else
		Return Null
	End If
End Sub