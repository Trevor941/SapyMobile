B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.2
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private lblCode As Label
	Private lblCurrentQty As Label
	Private lblDesc As Label
	Private lblOrginalQty As Label
	Private lblRemainingQty As Label
	Private txtEnterQty As EditText
	Private txtScan As EditText
	Private btnReturn As Button
	Private btnSubmit As Button
	Private dialog As B4XDialog
	Private InputTemplate As B4XInputTemplate
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("DrawStockPage")
	dialog.Initialize(Root)
	'load the layout to Root
	
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub txtScan_EnterPressed
Dim j As HttpJob
	

Try
	
	
	
	
	
		
	j.Initialize(txtScan.Text, Me)
	Dim k As String
	'	Public Server As String = "http://192.168.0.173:20577"
	'http://192.168.0.173:20577/api/SagePo/bypo/PO040167
		Dim downloadstring As String = Main.Server & "/api/StockItems/" & txtScan.Text
	'Dim downloadstring As String = "http://localhost:63129/WebService.asmx/LoadDeliverySchedule"
		
	Log(downloadstring)
	j.Download( downloadstring)
	'j.GetRequest.SetContentType("application/json")
	J.GetRequest.SetHeader("Authorization","Bearer " & Main.Token)
			
		Wait For (j) JobDone(j As HttpJob)
		If j.Success Then
			Dim parser As JSONParser
			parser.Initialize(j.GetString)
			Dim jRoot As Map = parser.NextObject
			Dim consumed As String = jRoot.Get("consumed")
			Dim rowNo As String = jRoot.Get("rowNo")
			Dim dateIn As String = jRoot.Get("dateIn")
			Dim notes As String = jRoot.Get("notes")
			Dim packingSlipId As Int = jRoot.Get("packingSlipId")
			Dim orderId As String = jRoot.Get("orderId")
			Dim exportedToAccounting As String = jRoot.Get("exportedToAccounting")
			Dim itemCode As String = jRoot.Get("itemCode")
			Dim dateOut As String = jRoot.Get("dateOut")
			Dim createTruckSheet As String = jRoot.Get("createTruckSheet")
			Dim sellingPriceExVatPrice As Int = jRoot.Get("sellingPriceExVatPrice")
			Dim freightCostFor As String = jRoot.Get("freightCostFor")
			Dim stockCheckedForCount As String = jRoot.Get("stockCheckedForCount")
			Dim warehouseCode As String = jRoot.Get("warehouseCode")
			Dim toSendToAccounting As String = jRoot.Get("toSendToAccounting")
			Dim originalQty As Int = jRoot.Get("originalQty")
			Dim previosQty As Int = jRoot.Get("previosQty")
			Dim consolodateStock As String = jRoot.Get("consolodateStock")
			Dim id As Int = jRoot.Get("id")
			Dim invoiceNo As String = jRoot.Get("invoiceNo")
			Dim salesOrderNo As String = jRoot.Get("salesOrderNo")
			Dim reservedForStock As String = jRoot.Get("reservedForStock")
			Dim stockLink As Int = jRoot.Get("stockLink")
			Dim batchNo As String = jRoot.Get("batchNo")
			Dim grnNo As String = jRoot.Get("grnNo")
			
			Dim qty As Int = jRoot.Get("qty")
	
			Dim pDescription As String = jRoot.Get("pDescription")
			Dim customerOrSupplierDesc As String = jRoot.Get("customerOrSupplierDesc")
			Dim binNo As String = jRoot.Get("binNo")
			
			lblCode.Text = itemCode
			lblDesc.Text = pDescription
			lblOrginalQty.Text = originalQty
			lblCurrentQty.Text = qty
			txtEnterQty.Text = ""
			lblRemainingQty.Text = lblCurrentQty.Text
			
			
	End If
	j.Release
	Catch
		
		End Try
End Sub



Private Sub txtEnterQty_TextChanged (Old As String, New As String)
	Try
		If txtEnterQty.Text ="" Then 
			lblRemainingQty.Text=  lblOrginalQty.Text
			Return
		End If
		
		lblRemainingQty.Text = lblCurrentQty.Text - txtEnterQty.Text
		
	Catch
		Log(LastException)
	End Try
End Sub

Private Sub btnReturn_Click
	txtEnterQty.Text = ""
	lblCode.Text = ""
	lblDesc.Text = ""
	lblOrginalQty.Text = ""
	lblCurrentQty.Text = ""
	txtEnterQty.Text = ""
	lblRemainingQty.Text = ""
	txtScan.Text=""
	B4XPages.ShowPage("MainMenu")
	
			
	
End Sub



Private Sub btnSubmit_Click
	
	
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
	
	
	
	
	Dim l As List
	l.Initialize
	Dim map1 As Map
	
	
	
	
	Dim JSON As JSONGenerator
	JSON.Initialize2(l)
 
	Dim data As String =   JSON.ToPrettyString(1)

	Dim j As HttpJob
	j.Initialize("", Me) 'name is empty as it is no longer needed
	Dim strwww As String =Main.Server
	'Dim k As String =  "Policy?PolicyNumber=" & txtLookupPolocy.Text

	Dim strPolocy As String
	Log("After jdownload")
	strwww = Main.Server & "/api/StockItems/SplitStockQty?StockID=" &  txtScan.Text & "&Qty=" &  txtEnterQty.Text  &"&User=" & Main.UserLogin & "&Printer=" & InputTemplate.Text
	
	
	
	j.PostString( strwww,data)
	'j.GetRequest.SetContentType("application/json")
	J.GetRequest.SetHeader("Authorization","Bearer " & Main.Token)
	j.GetRequest.SetContentType("application/json")
	
	
	
	Wait For (j) JobDone(j As HttpJob)
	If j.Success Then
		Log(j.GetString)
		ToastMessageShow("Successful",True)
		txtEnterQty.Text = ""
		lblCode.Text = ""
		lblDesc.Text = ""
		lblOrginalQty.Text = ""
		lblCurrentQty.Text = ""
		txtEnterQty.Text = ""
		lblRemainingQty.Text = ""
		txtScan.Text=""
		txtScan.RequestFocus
	Else
		
		ToastMessageShow("Unsuccessful check that period in Sage is open " ,True)
	
	
	End If
	
	j.Release
	
End Sub