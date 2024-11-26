B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.2
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private btnPrintLabel As Button
	Private btnReturn As Button
	Private btnSave As Button
	Private btnViewHeaderInfo As Button
	Private Label1 As Label
	Private Panel1 As Panel
	Private txtScan As EditText
	Private ulv As UltimateListView
	
	Private InputTemplate As B4XInputTemplate
	Dim x As PoListype
	Private lblWarehouse As Label
	Private BtnPrintPopup As Button
	Private chkPrintAllTheSamePopup As CheckBox
	Private lblCodePopup As Label
	Private lblDescPopup As Label
	Private lblQtyPopup As Label
	Private txtPrintOnLabelPopup As EditText
	Private txtQtyToPrintPopup As EditText
	Private dialog As B4XDialog
	Private chkAutoScale As CheckBox
	Private chkPrintAllSetValueEach As CheckBox
	Dim blndontrun As Boolean
	Private LStockForSapyLive As List
	Type   OrderInfo (id As Int, idInvoiceLines As Int, sapyLiveOrderNo As String, onHandQty As Double, dispatchPlanHeaderId As Int, freightCostFor As String, userCaptured As String, orderNo As String, description As String, itemCode As String, frieghtCompany As String,scannedQty As Double, qtyToProcess As Double, name As String, account As String,StockLink  As Int)
	Dim PrintertoPrinton As String
	Dim chkPrintAllTheSamePopup1 As Boolean
	Dim chkAutoScale1 As Boolean
	Dim chkPrintAllSetValueEach1 As Boolean
	Private ValueToPrint As Int
	Dim x As PoListype
	
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("GrvStockMainPage")
	'load the layout to Root
	dialog.Initialize(Root)
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub B4XPage_Appear
	If txtScan.Text = "" Then 
		txtScan.RequestFocus
		Else
		'x = Main.PoListypel.Get(Main.CurrentPoLine)
		PopulateULV
		
	End If
End Sub


Private Sub txtScan_EnterPressed
	
	If txtScan.Text = "" Then
		Return
	End If
	
	txtScan.Text = txtScan.Text.ToUpperCase
	If LStockForSapyLive.IsInitialized = True Then 
	LStockForSapyLive.Clear
	End If
	LoadDetails
End Sub

private Sub LoadDetails
	
	

	
	
Dim j As HttpJob
	

Try
	
	
	
	
	
		
	j.Initialize(txtScan.Text, Me)
	Dim k As String 
		'	Public Server As String = "http://192.168.0.173:20577"
		'http://192.168.0.173:20577/api/SagePo/bypo/PO040167
		Dim downloadstring As String = Main.Server & "/api/SagePo/bypo/" & txtScan.Text
		'Dim downloadstring As String = "http://localhost:63129/WebService.asmx/LoadDeliverySchedule"
		
		Log(downloadstring)
		j.Download( downloadstring)
		'j.GetRequest.SetContentType("application/json")
		J.GetRequest.SetHeader("Authorization","Bearer " & Main.Token)
			
		Wait For (j) JobDone(j As HttpJob)
		If j.Success Then 
			Dim parser As JSONParser
			parser.Initialize(j.GetString)
			Dim jRoot As List = parser.NextArray
		
			If jRoot.Size = 0 Then 
				ToastMessageShow("Invalid Po",True)
				
				Return
			End If
			If Main.PoListypel.IsInitialized Then
				
				
			Else
				Main.PoListypel.Initialize
			End If
			
			
			Main.PoListypel.Clear
			
			
			For Each coljRoot As Map In jRoot
				Dim a As PoListype
				Dim fQtyChange As Double = coljRoot.Get("fQtyChange")
				Dim invTotalIncl As Double = coljRoot.Get("invTotalIncl")
				Dim code As String = coljRoot.Get("code")
				Dim invDisc As Double = coljRoot.Get("invDisc")
				Dim dueDate As String = coljRoot.Get("dueDate")
				Dim orderNum As String = coljRoot.Get("orderNum")
				Dim description_1 As String = coljRoot.Get("description_1")
				Dim invDiscAmnt As Double = coljRoot.Get("invDiscAmnt")
				Dim extOrderNum As String = coljRoot.Get("extOrderNum")
				Dim invTotExcl As Double = coljRoot.Get("invTotExcl")
				Dim autoIndex As Int = coljRoot.Get("autoIndex")
				Dim invNumber As String = coljRoot.Get("invNumber")
				Dim fQuantity As Double = coljRoot.Get("fQuantity")
				Dim name As String = coljRoot.Get("name")
				Dim fQtyToProcess As Double = coljRoot.Get("fQtyToProcess")
				Dim idInvoiceLines As Int = coljRoot.Get("idInvoiceLines")
				Dim deliveryDate As String = coljRoot.Get("deliveryDate")
				Dim fQtyLastProcess As Double = coljRoot.Get("fQtyLastProcess")
				Dim invDate As String = coljRoot.Get("invDate")
				Dim orderDate As String = coljRoot.Get("orderDate")
				Dim account As String = coljRoot.Get("account")
				Dim fUnitPriceExcl As Double = coljRoot.Get("fUnitPriceExcl")
				Dim fUnitPriceIncl As Double = coljRoot.Get("fUnitPriceIncl")
				Dim OrdTotExcl As Double = coljRoot.Get("ordTotExcl")
				Dim OrdTotIncl As Double = coljRoot.Get("ordTotIncl")
				Dim hmvTyreBlock As Boolean = coljRoot.Get("hmvTyreBlock")
				
				Dim transportCondition As String = coljRoot.Get("transportCondition")
				Dim coa As Boolean = coljRoot.Get("coa")
				Dim chemical As Boolean = coljRoot.Get("chemical")
				Dim coapAth As String = coljRoot.Get("coapAth")
				Dim hmvTyreBlock As Boolean = coljRoot.Get("hmvTyreBlock")
				Dim biological As Boolean = coljRoot.Get("biological")
				Dim physical As Boolean = coljRoot.Get("physical")
				Dim allergens As Boolean = coljRoot.Get("allergens")
				Dim PoNotesFromMobile As String = coljRoot.Get("PoNotesFromMobile")
				Dim ClineNotes As String = coljRoot.Get("ClineNotes")
				
				Dim DCLink As Int 
				Try
				DCLink= coljRoot.Get("dcLink")
				Catch	
					DCLink = 0
					End Try
				
				a.DCLink = DCLink
				a.invTotalIncl = invTotalIncl
				a.code = code
				a.invDisc = invDisc
				a.dueDate = dueDate
				a.orderNum = orderNum
				a.description_1 = description_1
				a.invDiscAmnt = invDiscAmnt
				a.extOrderNum = extOrderNum
				a.invTotExcl = invTotExcl
				a.autoIndex = autoIndex
				a.invNumber = invNumber
				a.fQuantity = fQuantity
				a.name = name
				a.ClineNotes = ClineNotes
			
				a.hmvTyreBlock= hmvTyreBlock
				
				
				If a.fQtyToProcess =0 Then 
					
					a.fQtyToProcess = fQuantity
				Else
					a.fQtyToProcess = fQtyToProcess
					
				End If
				
				
				a.idInvoiceLines = idInvoiceLines
				a.deliveryDate = deliveryDate
				a.fQtyLastProcess = fQtyLastProcess
				a.invDate = invDate
				a.orderDate = orderDate
				a.account = account
				a.OrdTotExcl = OrdTotExcl
				a.OrdTotIncl = OrdTotIncl
				a.fUnitPriceExcl = fUnitPriceExcl
				a.fUnitPriceIncl = fUnitPriceIncl
				a.transportCondition= transportCondition
				a.coa= coa
				a.chemical= chemical
				a.Coapath= coapAth
				a.hmvTypeBlock= hmvTyreBlock
				a.biological= biological
				a.physical= physical
				a.allergens= allergens
				a.PoNotesFromMobile = PoNotesFromMobile
				a.NoOfPrints = Round2(fQuantity,0)
				
				Main.PoListypel.Add(a)
				
			Next
		
		
	End If
	j.Release
	Catch
		Log(LastException)
		
		
	End Try
	PopulateULV
End Sub

Sub PopulateULV
	Panel1.RemoveAllViews
	
	ulv.Initialize(0,0,"","ULV")
	ulv.DividerHeight = 3dip

	ulv.FastScroller(True)
	ulv.Color=Colors.Black
	ulv.SelectionMode = ulv.SELECTION_SINGLE
	ulv.Tag = "ReceiptHeader"

	Dim cellwidths() As Int = Array As Int(15%x,55%x,15%x,15%x)
	
	ulv.AddRowLayout("ReceiptHeader","ReceiptHeader_Layout","ReceiptHeader_filler",50dip,cellwidths.Length,cellwidths,0,Colors.White,True)
	
	Panel1.AddView(ulv,0%x,0%y,Panel1.Width-2dip,Panel1.Height-2dip)

	
	ulv.BulkAddItems(Main.PoListypel.Size,"ReceiptHeader",0)
	'IME.Initialize("")
	Log("End popULVProduct")
		
End Sub

Sub ReceiptHeader_Layout(LayoutName As String, CellPanel As Panel, CellIndex As Byte)
	Select CellIndex
		
		Case 0:
			'Image: an ImageView
			Dim lbl As Label
			lbl.Initialize("")
			lbl.Gravity = Gravity.CENTER_VERTICAL
			lbl.TextColor =  Colors.Black
			lbl.TextSize = 10
		
			CellPanel.AddView(lbl, 5dip, 5dip, CellPanel.Width - 10dip, CellPanel.Height - 2dip)
		Case 1:
			Dim lbl As Label
			lbl.Initialize("")
			lbl.Gravity = Gravity.CENTER_VERTICAL
			lbl.TextColor =  Colors.Black
			lbl.TextSize = 10
		
			CellPanel.AddView(lbl, 5dip, 5dip, CellPanel.Width - 10dip, CellPanel.Height - 2dip)
		
		Case 2:
			Dim lbl As Label
			lbl.Initialize("")
			lbl.Gravity = Gravity.CENTER_VERTICAL
			lbl.TextColor =  Colors.Black
			lbl.TextSize = 10
			CellPanel.AddView(lbl, 5dip, 5dip, CellPanel.Width - 10dip, CellPanel.Height - 2dip)
			
		Case 3:
			Dim lbl As Label
			lbl.Initialize("")
			lbl.Gravity = Gravity.CENTER_VERTICAL
			lbl.TextColor =  Colors.Black
			lbl.TextSize = 10
			CellPanel.AddView(lbl, 5dip, 5dip, CellPanel.Width - 10dip, CellPanel.Height - 2dip)
		
	End Select
	'Panel1.LoadLayout("cells")
End Sub

Sub ReceiptHeader_filler(RowID As Long, LayoutName As String, CellPanel As Panel, CellIndex As Byte, Position As Int)
	
	
	
	Dim x As PoListype = Main.PoListypel.Get(RowID)
	
	Select CellIndex
		Case 0:
			'Positions the cursor on the requested item
			
			Try
				Dim lbl As Label = CellPanel.GetView(0)
				lbl.TextColor = Colors.Black
				lbl.Text=x.Code
			Catch
				Log("Error : " & LastException)
			End Try
			
			
			
			
		Case 1:
			Dim lbl As Label = CellPanel.GetView(0)
			lbl.TextColor = Colors.Black
			lbl.Text=x.description_1
		Case 2:
			Dim lbl As Label = CellPanel.GetView(0)
			lbl.TextColor = Colors.Black
			lbl.Text=x.fQuantity
			
		Case 3:
			Dim lbl As Label = CellPanel.GetView(0)
			lbl.TextColor = Colors.Black
			lbl.Text=x.fQtyToProcess
			
		
			
			
			'
'			Dim AR As AndroidResources
'			Dim ETxt As JavaObject = lbl
'			ETxt.RunMethod("setCompoundDrawablesWithIntrinsicBounds",Array As Object(Null,Null,AR.GetAndroidDrawable("heart_minus"),Null))
'	
	End Select
	
	
	
	
End Sub



Private Sub btnViewHeaderInfo_Click
	
	
Try
	
	If Main.PoListypel.Size = 0 Then 
		ToastMessageShow("No valid rows",True)
		Return
	End If
	
	B4XPages.ShowPage("GrvHeaderInfo")
Catch
		ToastMessageShow("No valid rows",True)

End Try

End Sub

Private Sub btnSave_Click
	
	
	SavePo("",False)
	
	
End Sub
	
	
private Sub WriteToSapyLiveStock As ResumableSub
	
	Dim JSON As JSONGenerator
	JSON.Initialize2(LStockForSapyLive)
 
	Dim data As String =   JSON.ToPrettyString(1)

	Dim j As HttpJob
	j.Initialize("", Me) 'name is empty as it is no longer needed
	Dim strwww As String =Main.Server
	'Dim k As String =  "Policy?PolicyNumber=" & txtLookupPolocy.Text

	Dim strPolocy As String
	Log("After jdownload")
	strwww = Main.Server & "/api/SagePo/CreateStockFromPo"

	j.PostString( strwww,data)
	'j.GetRequest.SetContentType("application/json")
	J.GetRequest.SetHeader("Authorization","Bearer " & Main.Token)
	j.GetRequest.SetContentType("application/json")
	
	
	
	Wait For (j) JobDone(j As HttpJob)
		If j.Success Then
		
		ToastMessageShow("Success " & j.GetString,True)
		
		
		Return 1
	Else
		Log(j.GetString)
		j.GetString
		'ToastMessageShow("Unsuccessful check that period in Sage is open " & j.GetString,True)
	Return 0
	
	End If
End Sub
	
	
Private Sub SavePo(PrinterPath As String,MustPrint As Boolean)
	
	
	
	Dim supplInv As String
	dialog.Initialize (Root)
	InputTemplate.Initialize
	InputTemplate.lblTitle.Text = "Please enter the supplier Invoice No"
	InputTemplate.Text=""
	InputTemplate.lblTitle.TextColor = Colors.White
	Wait For (dialog.ShowTemplate(InputTemplate, "OK", "", "CANCEL")) Complete (Result As Int)
	If Result = xui.DialogResponse_Cancel Then
		Return
	End If
	supplInv = InputTemplate.Text
	
	If supplInv="" Then
		Return
	End If
	
	
	Dim RowId As Int = 0
	
	
	Dim l As List
	l.Initialize
	
	For Each Row In Main.PoListypel
		
	
	Dim x As PoListype = Main.PoListypel.Get(RowId)
	
	
		Dim map As Map
		map.Initialize

		map.Put("idInvoiceLines", x.IdInvoiceLines)
		map.Put("fQuantity", x.fQuantity)
		map.Put("fQtyChange", x.fQtyChange)
		map.Put("fQtyToProcess", x.fQtyToProcess)
		map.Put("fQtyLastProcess", x.fQtyLastProcess)
		map.Put("code", x.code)
		map.Put("description_1", x.description_1)
		map.Put("invNumber", x.invNumber)
		map.Put("invDate", x.invDate)
		map.Put("orderDate", x.orderDate)
		map.Put("dueDate", x.dueDate)
		map.Put("deliveryDate", x.deliveryDate)
		map.Put("orderNum", x.orderNum)
		map.Put("invTotalIncl", x.invTotalIncl)
		map.Put("ordTotExcl", x.ordTotExcl)
		map.Put("ordTotIncl", x.ordTotIncl)
		map.Put("invTotExcl", x.invTotExcl)
		map.Put("invDiscAmnt", x.invDiscAmnt)
		map.Put("invDisc", x.invDisc)
		map.Put("extOrderNum", x.extOrderNum)
		map.Put("account", x.account)
		map.Put("name", x.name)
		map.Put("autoIndex", x.autoIndex)
		map.Put("fUnitPriceExcl", x.fUnitPriceExcl)
		map.Put("fUnitPriceIncl", x.fUnitPriceIncl)
		map.Put("biological", x.biological)
		map.Put("chemical", x.chemical)
		map.Put("physical", x.physical)
		map.Put("allergens", x.allergens)
		map.Put("transportCondition", x.transportCondition)
		map.Put("hmvTyreBlock", x.hmvTyreBlock)
		map.Put("coa", x.coa)
		map.Put("coapAth", x.coapAth)
		map.Put("poNotesFromMobile", x.poNotesFromMobile)
		map.Put("NoOfPrints",x.NoOfPrints)
		map.Put("UserName",Main.UserLogin)
		map.Put("MustPrint",MustPrint)
		map.Put("PrinterPath",PrinterPath)
		map.Put("DCLink",x.DCLink)
		'map.Put("SupplierInvoiceNo","")
		
'		
		If x.SupplierExpiryDate =Null Then
			map.Put("SupplierExpiryDate","2001-01-01")
		Else
			map.Put("SupplierExpiryDate",x.SupplierExpiryDate)
		End If
		If lblWarehouse.Text = "No Warehouse" Then 
		
		Else
			map.Put("WarehouseId",lblWarehouse.Text)
		
			
		End If
		
	
	l.Add(map)
	
		RowId = RowId +1
		
		
		

	Next
	
	
	Dim JSON As JSONGenerator
	JSON.Initialize2(l)
 
	Dim data As String =   JSON.ToPrettyString(1)

	Dim j As HttpJob
	j.Initialize("", Me) 'name is empty as it is no longer needed
	Dim strwww As String =Main.Server
	'Dim k As String =  "Policy?PolicyNumber=" & txtLookupPolocy.Text

	Dim strPolocy As String
	Log("After jdownload")
	strwww = Main.Server & "/api/SagePo/update?SupplierInvNoo=" & supplInv
	'http://192.168.0.187:20577/api/SagePo/update?SupplierInvNoo=ttttttretrrtt
	'http://192.168.0.187:20577/api/SagePo/update?SupplierInvNoo=Inv101
	
	
	j.PostString( strwww,data)
	'j.GetRequest.SetContentType("application/json")
	J.GetRequest.SetHeader("Authorization","Bearer " & Main.Token)
	j.GetRequest.SetContentType("application/json")
	
	
	
	Wait For (j) JobDone(j As HttpJob)
	If j.Success Then
		
		ToastMessageShow("Success " & j.GetString,True)
		
	Panel1.RemoveAllViews
	txtScan.Text=""
	lblWarehouse.Text="No Warehouse"
		
	Else
		Log(j.GetString)
		j.GetString
		'ToastMessageShow("Unsuccessful check that period in Sage is open " & j.GetString,True)
	
	
	End If
	
	lblWarehouse.Text = "No Warehouse"
End Sub

Private Sub btnReturn_Click
	B4XPages.ShowPageAndRemovePreviousPages("MainMenu")
End Sub

Private Sub btnPrintLabel_Click
	
	'chkPrintAllTheSamePopup1 = True
	
	
	dialog.Initialize (Root)
	InputTemplate.Initialize
	InputTemplate.lblTitle.Text = "Please Scan Printer or type Printer Code"
	InputTemplate.Text=""
	InputTemplate.lblTitle.TextColor = Colors.White

	'InputTemplate.ConfigureForNumbers(True,False)
	Wait For (dialog.ShowTemplate(InputTemplate, "OK", "", "CANCEL")) Complete (Result As Int)
	If Result = xui.DialogResponse_Cancel Then
		Return
	End If
	
	
	If lblWarehouse.Text = "No Warehouse" Then 
		Msgbox("Please scan or enter a warehouse Id before proceeding",True)
		Return
	End If
	
	Wait For(postprint ) Complete (Result2 As Int)
	

	PrintertoPrinton=InputTemplate.Text
		For Each a As PoListype In Main.PoListypel
		
		
'		
'		
'		lblCodePopup.Initialize("lblCodePopup")
'		
'		
'		lblDescPopup.Initialize("lblDescPopup")
'		lblQtyPopup.Initialize("lblQtyPopup")
'		txtQtyToPrintPopup.Initialize("txtQtyToPrintPopup")
'		txtPrintOnLabelPopup.Initialize("txtPrintOnLabelPopup")
'		chkPrintAllTheSamePopup.Initialize("chkPrintAllTheSamePopup")
		
		
		
	
		
		
		Dim p As B4XView = xui.CreatePanel("")
		p.SetLayoutAnimated(0,0,0,100%x,100%x)
		p.LoadLayout("FrmPrintPopUp")
		dialog.PutAtTop = True 
		
		
			
		lblCodePopup.Text = a.Code
		lblDescPopup.Text = a.description_1
		lblQtyPopup.Text = a.fQtyToProcess
		txtQtyToPrintPopup.Text =   1 '  a.NoOfPrints
		txtPrintOnLabelPopup.Text =   a.fQtyToProcess
		
		
		If txtQtyToPrintPopup.Text < 0 Then 
			txtQtyToPrintPopup.Text = 0
		End If
		
		chkPrintAllTheSamePopup.Checked = False
		chkPrintAllSetValueEach.Checked = False
		chkAutoScale.Checked = True
		chkAutoScale.Checked = True
		'put the dialog at the top of the screen
		Wait For (dialog.ShowCustom(p, "PRINT", "", "Dont Print")) Complete (Result As Int)
		
		
		If txtPrintOnLabelPopup.Text ="" Then txtPrintOnLabelPopup.Text = 1
		
		If Result = xui.DialogResponse_Positive Then
			'
			
			''' Senarios 1  chkPrintAllTheSamePopup1
			If chkPrintAllTheSamePopup1 = True Then
				chkPrintAllTheSamePopup1 = False
					For i = 1 To txtQtyToPrintPopup.Text
						' Code to be executed for each iteration
						Log("Iteration " & i)
						x= a
					Wait For(CreateStock (txtPrintOnLabelPopup.Text,PrintertoPrinton)) Complete (Result213 As Int)
						
					Next
			End If

		  ''''Sanrio 1 end 
		  
		  
		  
		  ''''Senarios 2
		  
			If chkAutoScale1 = True Then
				chkAutoScale1 = False
				Dim df As Double =  lblQtyPopup.Text / txtQtyToPrintPopup.Text
				df =Round2(df,2)
				
				Dim qty22 As Double = df  'Round2(df,2)
				
				
				Dim Total As Double = a.fQuantity
			'If qty = 0 Then qty =1
			
				For i = 1 To txtQtyToPrintPopup.Text
					
					
					' Code to be executed for each iteration
					Log("Iteration " & qty22)
					
					
					x=a
					Wait For(CreateStock (qty22,PrintertoPrinton)) Complete (Result213 As Int)
					If Result213 = 0 Then
						
					End If
				Next
			End If
		  
		  
			If chkPrintAllSetValueEach1 = True Then
				chkPrintAllSetValueEach1 = False
				For i = 1 To ValueToPrint
					
					txtQtyToPrintPopup.Enabled = False
					'txtQtyToPrintPopup.Text = 1
					
					
					InputTemplate.Initialize
					InputTemplate.ConfigureForNumbers(True, False)
					InputTemplate.lblTitle.Text = "Please enter Value to Print"
					InputTemplate.Text=""
					InputTemplate.lblTitle.TextColor = Colors.White
					
					
					
					
					Wait For (dialog.ShowTemplate(InputTemplate, "OK", "", "CANCEL")) Complete (Result As Int)
					If Result = xui.DialogResponse_Positive Then
						Log("Iteration " & InputTemplate.Text)
					End If
					Log("Before Create Stock")
					x = a
					Wait For(CreateStock (InputTemplate.Text,PrintertoPrinton)) Complete (Result214 As Int)
					
				Next
			
				txtQtyToPrintPopup.Enabled = True
			
		End If
		  


		End If
		
		
		
	Next
	 
	
	Wait For(WriteToSapyLiveStock) Complete (Result215 As Int)
	
	
	
	SavePo(InputTemplate.Text,True)
	
End Sub

private Sub CreateStock(qty As Double,PrinterPath As String) As ResumableSub
	'Dim x As PoListype = Main.PoListypel.Get(Rowid)
	
	
	Dim map As Map
	map.Initialize

	map.Put("idInvoiceLines", x.IdInvoiceLines)
	map.Put("fQuantity", qty)
	map.Put("fQtyChange", qty)
	map.Put("fQtyToProcess", qty)
	map.Put("fQtyLastProcess", qty)
	map.Put("code", x.code)
	map.Put("description_1", x.description_1)
	map.Put("invNumber", x.invNumber)
	map.Put("invDate", x.invDate)
	map.Put("orderDate", x.orderDate)
	map.Put("dueDate", x.dueDate)
	map.Put("deliveryDate", x.deliveryDate)
	map.Put("orderNum", x.orderNum)
	map.Put("invTotalIncl", x.invTotalIncl)
	map.Put("ordTotExcl", x.ordTotExcl)
	map.Put("ordTotIncl", x.ordTotIncl)
	map.Put("invTotExcl", x.invTotExcl)
	map.Put("invDiscAmnt", x.invDiscAmnt)
	map.Put("invDisc", x.invDisc)
	map.Put("extOrderNum", x.extOrderNum)
	map.Put("account", x.account)
	map.Put("name", x.name)
	map.Put("autoIndex", x.autoIndex)
	map.Put("fUnitPriceExcl", x.fUnitPriceExcl)
	map.Put("fUnitPriceIncl", x.fUnitPriceIncl)
	map.Put("biological", x.biological)
	map.Put("chemical", x.chemical)
	map.Put("physical", x.physical)
	map.Put("allergens", x.allergens)
	map.Put("transportCondition", x.transportCondition)
	map.Put("hmvTyreBlock", x.hmvTyreBlock)
	map.Put("coa", x.coa)
	map.Put("coapAth", x.coapAth)
	map.Put("poNotesFromMobile", x.poNotesFromMobile)
	map.Put("NoOfPrints",x.NoOfPrints)
	map.Put("UserName",Main.UserLogin)
	map.Put("MustPrint",True)
	map.Put("PrinterPath",PrinterPath)
	map.Put("DCLink",x.DCLink)
	'map.Put("SupplierInvoiceNo","")
		
'		
	If x.SupplierExpiryDate =Null Then
		map.Put("SupplierExpiryDate","2001-01-01")
	Else
		map.Put("SupplierExpiryDate",x.SupplierExpiryDate)
	End If
	If lblWarehouse.Text = "No Warehouse" Then
		
	Else
		map.Put("WarehouseId",lblWarehouse.Text)
		
			
	End If
	If LStockForSapyLive.IsInitialized Then 
		Else
		LStockForSapyLive.Initialize
	End If
	
	LStockForSapyLive.Add(map)
	Return 1
End Sub



private Sub postprint As ResumableSub
	
	
	Return 1
End Sub



Sub ulv_CellClick(RowID As Long, CellIndex As Byte, Position As Int, ClickedPanel As Panel)
	Main.CurrentPoLine = RowID
	'Sleep(100)
	B4XPages.ShowPage("GrvStockDetailLine")
End Sub

Private Sub lblWarehouse_LongClick
		
	dialog.Initialize (Root)
	InputTemplate.Initialize
	InputTemplate.lblTitle.Text = "Please Scan or Type Warehouse Id"
	InputTemplate.Text=""
	InputTemplate.lblTitle.TextColor = Colors.White

	InputTemplate.ConfigureForNumbers(False,False)
	Wait For (dialog.ShowTemplate(InputTemplate, "OK", "", "CANCEL")) Complete (Result As Int)
	If Result = xui.DialogResponse_Cancel Then
		Return
	End If
	
	lblWarehouse.Text = InputTemplate.Text
	
End Sub

Private Sub chkPrintAllTheSamePopup_CheckedChange(Checked As Boolean)
	
	
	chkPrintAllTheSamePopup1 = True
	chkPrintAllSetValueEach1 = False
	chkAutoScale1 = False
	If blndontrun = True Then
		Return
	End If
	blndontrun = True
	chkPrintAllSetValueEach.Checked = False
	chkAutoScale.Checked = False
	blndontrun = False
	Sleep(50)
	chkPrintAllTheSamePopup1 = True
	chkPrintAllSetValueEach1 = False
	chkAutoScale1 = False
End Sub

Private Sub chkPrintAllSetValueEach_CheckedChange(Checked As Boolean)
	
	
	
	
	chkPrintAllTheSamePopup1 = False
	chkPrintAllSetValueEach1 = True
	chkAutoScale1 = False
	
	If blndontrun = True Then
		Return
	End If
	blndontrun = True
	chkPrintAllTheSamePopup.Checked = False
	chkAutoScale.Checked = False
	blndontrun = False
	Sleep(50)
	chkPrintAllSetValueEach1 = True
	chkAutoScale1 = False
	chkPrintAllTheSamePopup1 = False
	
	
	
End Sub

Private Sub chkAutoScale_CheckedChange(Checked As Boolean)
	
	chkPrintAllTheSamePopup1 = False
	chkPrintAllSetValueEach1 = False
	chkAutoScale1 = True
	
	If blndontrun = True Then
		Return
	End If
	blndontrun = True
	chkPrintAllSetValueEach.Checked = False
	chkPrintAllTheSamePopup.Checked = False
	blndontrun = False
	Sleep(50)
	chkAutoScale1 = True
	chkPrintAllTheSamePopup1 = False
	chkPrintAllSetValueEach1 = False
	
	Try
		txtPrintOnLabelPopup	.Text = lblQtyPopup.Text / txtQtyToPrintPopup.Text
	Catch
		
	End Try
End Sub

Private Sub txtQtyToPrintPopup_TextChanged (Old As String, New As String)
Try
	
If chkAutoScale.Checked = True Then	
	
If txtQtyToPrintPopup.Text = "" Then 
		ValueToPrint = 0
	Else
		ValueToPrint = txtQtyToPrintPopup.Text
			txtPrintOnLabelPopup	.Text =Round2( lblQtyPopup.Text / txtQtyToPrintPopup.Text,3)
End If
End If

Catch
	
End Try
	
	


End Sub