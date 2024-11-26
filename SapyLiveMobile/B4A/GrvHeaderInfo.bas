B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.2
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private btnSaveAndReturn As Button
	Private HMvTyreBlockNo As RadioButton
	Private HMvTyreBlockYes As RadioButton
	Private lbldDate As Label
	Private lblPoNo As Label
	Private lblSupplier As Label
	Private rdlBiologicalNo As RadioButton
	Private rdlBiologicalYes As RadioButton
	Private rdlDamageNo As RadioButton
	Private rdlDamageYes As RadioButton
	Private rdlFoodNo As RadioButton
	Private rdlFoodsYes As RadioButton
	Private rdlOilWaterLeakNo As RadioButton
	Private rdlOilWaterLeakYes As RadioButton
	Private rdlTransportInGoodNo As RadioButton
	Private rdlTransportInGoodYes As RadioButton
	Private rdlCoaNo As RadioButton
	Private rdlCoaYes As RadioButton
	Private txtNotes As EditText
	Private btnPictures As Button
	Private btnSignature As Button
	Private ion As Object
	Private Provider As FileProvider
	Private PictureTaken As Boolean
	Private const tempImageFile As String = "tempimage.jpg"
	Private Dialog As B4XDialog
	Private Root As B4XView
	Private SignatureSigned As Boolean
	Private SignatureTemplate As B4XSignatureTemplate
	Private Base As B4XView
	Public InvoiceIUd As String
	Dim x As PoListype
	Private LongTextTemplate As B4XLongTextTemplate
	Private InputTemplate As B4XInputTemplate
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("grvHeaderPage")
	'load the layout to Root
	Dialog.Initialize (Base)
	
	
	LongTextTemplate.Initialize
	SignatureTemplate.Initialize
	InputTemplate.Initialize
	Provider.Initialize
	btnSignature.text = "Signature"
	
End Sub


Private Sub B4XPage_Appear
	
x= Main.PoListypel.Get(0)
	Dim ddate As String = x.deliveryDate
	ddate = ddate.SubString2(0,10)
	
	
	
	InvoiceIUd = x.autoIndex
	lbldDate.Text =  ddate
	lblPoNo.Text = x.orderNum
	lblSupplier.Text = x.name
	txtNotes.Text = x.PoNotesFromMobile
If txtNotes.Text = "null" Then 
	txtNotes.Text = ""
	 
End If

If x.biological = False Then 
		rdlBiologicalNo.Checked = True	
	Else
		rdlBiologicalYes.Checked=  True
End If


If x.transportCondition = False Then 
		rdlTransportInGoodNo.Checked = False
	Else
		rdlTransportInGoodYes.Checked = True
End If


	If x.allergens = False Then 
			rdlFoodNo.Checked = False
		Else
			rdlFoodNo.Checked = True
	End If


If x.biological = False Then 
		rdlBiologicalNo.Checked = False
	Else
		rdlBiologicalYes.Checked = True

End If

If x.chemical = False Then 
		rdlOilWaterLeakNo.Checked = False
	
	Else
		rdlOilWaterLeakYes.Checked = False
End If



If x.hmvTypeBlock = False	 Then 
		HMvTyreBlockNo.Checked = False
	Else
		HMvTyreBlockYes.Checked = True
End If


If x.coa = False Then 
		rdlCoaNo.Checked = False
	Else
		rdlCoaYes.Checked = True
End If


'rdlDamageNo.Checked = Null
'rdlDamageYes.Checked = Null


'rdlTransportInGoodNo.Checked = Null
'rdlTransportInGoodYes.Checked =Null


	
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub HMvTyreBlockYes_CheckedChange(Checked As Boolean)
	
End Sub

Private Sub HMvTyreBlockNo_CheckedChange(Checked As Boolean)
	
End Sub

Private Sub btnSaveAndReturn_Click
	
	If HMvTyreBlockNo.Checked = True Then 
			x.hmvTyreBlock = False
			x.hmvTypeBlock = False
	Else
			x.hmvTyreBlock = True
			x.hmvTypeBlock=True
	End If
	
	If rdlOilWaterLeakNo.Checked = True Then 
				x.chemical = False
		Else
				x.chemical = True
	End If
	
	If rdlBiologicalNo.Checked = False Then 
			x.biological = False
		Else
			x.biological = True
		
	End If
	
	If rdlCoaNo.Checked = False Then 
		
			x.coa = False
		Else
			x.coa = True
	End If
	
	If rdlDamageNo.Checked = True Then 
		x.physical = False
	
		Else
			x.physical = True
	End If
	
	
	If rdlFoodNo.Checked = True Then 
		x.allergens = False
		Else
		x.allergens=  True
	End If
	
	
	If rdlOilWaterLeakNo.Checked = True Then 
		x.chemical = False
		Else
		x.chemical = True
	End If
	
	
	
B4XPages.ShowPageAndRemovePreviousPages("GrvStockIn")	
End Sub

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
		
		
		Log("After ")
		
		Dim a As PictureUpload
		a.Initialize
	
		a.Content = b
		a.DocumentType = "PoHeader"
		a.FileName =InvoiceIUd &  "-I-Sig.JPG"
		a.IdInvoiceLines= 0
		a.InvoiceId = InvoiceIUd
		
		CallSub2(Main,"PostPicture",a)
		Sleep(1000)
		
		
	End If
	Dialog.Close(xui.DialogResponse_Cancel)
End Sub

Private Sub btnPictures_Click
	Private rp As RuntimePermissions
	rp.CheckAndRequest(rp.PERMISSION_CAMERA)
	'Wait For Activity_PermissionResult  (Permission As String, Result As Boolean)
	
	
	TakePicture (1920, 1080)
	Wait For Image_Available(Success As Boolean, bmp As B4XBitmap)
	If Success Then
		''btnPicture.SetBitmap(bmp)
		PictureTaken= True
		Main.BitmapPicture= bmp
		
		btnPictures.SetBackgroundImage(Main.BitmapPicture)
		Dim a As PictureUpload
		a.Initialize
	
		a.Content = bmp ' Array As Object(ImageToBytes(bmp))
		a.DocumentType = "PoHeader Picture"
		a.FileName = InvoiceIUd & "-PH.JPG"
		a.IdInvoiceLines= 0
		a.InvoiceId = InvoiceIUd
		
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
