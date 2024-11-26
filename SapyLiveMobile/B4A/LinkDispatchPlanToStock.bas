B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.2
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private btnSubmit As Button
	Private lblItemScanned As Label
	Private Panel1 As Panel
	Private txtScanItem As EditText
	Private txtScanPlan As EditText
	Private ScanningID As Int
	Private Ulv As UltimateListView
	Private DispatchPlanDetailId As Int
	Private StockLink As Int
	
	
	Private lblCustomer As Label
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("DispatchPlanLinking")
	'load the layout to Root
	
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub btnSubmit_Click
	txtScanItem.Enabled = False
	txtScanPlan.Enabled = True
	PrepareList
End Sub

Private Sub txtScanPlan_EnterPressed
	'txtScanItem.Enabled = True
	'txtScanPlan.Enabled = False
	PrepareList
	
End Sub

Private Sub PrepareList
	'http://192.168.88.2:20577/api/DispatchPlan/header/invoice-mobile/3
	
	
	
	
	Dim j As HttpJob
	

	Try
	
	
	
	
	
		
		j.Initialize("", Me)
		Dim k As String
		'	Public Server As String = "http://192.168.0.173:20577"
		'http://192.168.0.173:20577/api/SagePo/bypo/PO040167
		Dim downloadstring As String = Main.Server & "/api/DispatchPlan/header/invoice-mobile/" & txtScanPlan.Text	
		'Dim downloadstring As String = "http://localhost:63129/WebService.asmx/LoadDeliverySchedule"
		
		Log(downloadstring)
		j.Download( downloadstring)
		'j.GetRequest.SetContentType("application/json")
		J.GetRequest.SetHeader("Authorization","Bearer " & Main.Token)
		Main.OrderList.Initialize
		Wait For (j) JobDone(j As HttpJob)
		If j.Success Then
			Log(j.GetString)
			Dim parser As JSONParser
		
			parser.Initialize(j.GetString)
			Dim jRoot As List = parser.NextArray
			
			For Each coljRoot As Map In jRoot
				Dim qtyToProcess As Double = coljRoot.Get("qtyToProcess")
				Dim scannedQty As Double = coljRoot.Get("scannedQtyActual")
				Dim frieghtCompany As String = coljRoot.Get("frieghtCompany")
				Dim itemCode As String = coljRoot.Get("itemCode")
				Dim description As String = coljRoot.Get("description")
				Dim orderNo As String = coljRoot.Get("orderNum")
				Dim userCaptured As String = coljRoot.Get("userCaptured")
				Dim freightCostFor As String = coljRoot.Get("freightCostFor")
				Dim dispatchPlanHeaderId As Int = coljRoot.Get("dispatchPlanHeaderId")
				Dim onHandQty As Int = coljRoot.Get("onHandQty")
				Dim idInvoiceLines As Int = coljRoot.Get("idInvoiceLines")
				Dim id As Int = coljRoot.Get("id")
				Dim sapyLiveOrderNo As String = coljRoot.Get("sapyLiveOrderNo")
				Dim account As String = coljRoot.Get("account")
				Dim name As String = coljRoot.Get("name")
				Dim StockLink1 As Int = coljRoot.Get("stockLink")
				
				Dim a As OrderInfo
				a.qtyToProcess = qtyToProcess
				a.scannedQty = scannedQty
				a.frieghtCompany = frieghtCompany
				a.freightCostFor = freightCostFor
				a.id = id
				a.itemCode = itemCode
				a.description = description
				a.orderNo = orderNo
				a.userCaptured = userCaptured
				a.dispatchPlanHeaderId = dispatchPlanHeaderId
				a.onHandQty = onHandQty
				a.idInvoiceLines = idInvoiceLines
				a.sapyLiveOrderNo = sapyLiveOrderNo
				a.name = name
				a.account = account
				a.StockLink = StockLink1
				
				Main.OrderList.Add(a)
	
	
	If scannedQty> qtyToProcess Then 
		displaymessagewarning = True
	End If
				
				
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
	
	Ulv.Initialize(0,0,"","ULV")
	Ulv.DividerHeight = 3dip

	Ulv.FastScroller(True)
	Ulv.Color=Colors.Black
	Ulv.SelectionMode = Ulv.SELECTION_SINGLE
	Ulv.Tag = "ReceiptHeader"

	Dim cellwidths() As Int = Array As Int(30%x,30%x,13%x,13%x,13%x)
	
	Ulv.AddRowLayout("ReceiptHeader","ReceiptHeader_Layout","ReceiptHeader_filler",50dip,cellwidths.Length,cellwidths,0,Colors.White,True)
	
	Panel1.AddView(Ulv,0%x,0%y,Panel1.Width-2dip,Panel1.Height-2dip)

	
	Ulv.BulkAddItems(Main.OrderList.Size,"ReceiptHeader",0)
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
			
		Case 4:
			Dim lbl As Label
			lbl.Initialize("")
			lbl.Gravity = Gravity.CENTER_VERTICAL
			lbl.TextColor =  Colors.Black
			lbl.TextSize = 10
			CellPanel.AddView(lbl, 5dip, 5dip, CellPanel.Width - 10dip, CellPanel.Height - 2dip)
		Case 5:
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
	
	
	
	Dim x As OrderInfo =Main.OrderList.Get(RowID)
	
	Select CellIndex
		
		
		Case 0:
			Dim lbl As Label = CellPanel.GetView(0)
			lbl.TextColor = Colors.Black
			lbl.Text=x.account
		
		
		Case 1:
			'Positions the cursor on the requested item
			
			Try
				Dim lbl As Label = CellPanel.GetView(0)
				lbl.TextColor = Colors.Black
				lbl.Text=x.itemCode
			Catch
				Log("Error : " & LastException)
			End Try
			
			
			
			
		Case 2:
			Dim lbl As Label = CellPanel.GetView(0)
			lbl.TextColor = Colors.Black
			lbl.Text=x.qtyToProcess
		Case 3:
			Dim lbl As Label = CellPanel.GetView(0)
			If x.qtyToProcess> x.scannedQty  Then 
				
				lbl.TextColor = Colors.Green
			Else
				lbl.TextColor = Colors.Red
			End If
			lbl.Text=x.scannedQty
			
		Case 4:
			Dim lbl As Label = CellPanel.GetView(0)
			lbl.TextColor = Colors.Blue
			lbl.Text=x.onHandQty
			
		Case 5:
			Dim lbl As Label = CellPanel.GetView(0)
			lbl.TextColor = Colors.Blue
			lbl.Text=x.onHandQty
			
		
			
			
			'
'			Dim AR As AndroidResources
'			Dim ETxt As JavaObject = lbl
'			ETxt.RunMethod("setCompoundDrawablesWithIntrinsicBounds",Array As Object(Null,Null,AR.GetAndroidDrawable("heart_minus"),Null))
'	
	End Select
	
	
	
	
End Sub

Private Sub txtScanItem_EnterPressed
'http://192.168.88.2:20577/api/DispatchPlan/header/LinkStock-mobile?DispatchPlanDetailId=1&StockLink=1&StockId=1
	
	
	
	
Dim j As HttpJob
	

Try
	
	
	
	
	
		
	j.Initialize(txtScanItem.Text, Me)
	Dim k As String
	'	Public Server As String = "http://192.168.0.173:20577"
	'http://192.168.0.173:20577/api/SagePo/bypo/PO040167
		Dim downloadstring As String = Main.Server & "/api/DispatchPlan/header/LinkStock-mobile?DispatchPlanDetailId=" & DispatchPlanDetailId & "&StockLink=" & StockLink & "&StockId=" & txtScanItem.Text
	'Dim downloadstring As String = "http://localhost:63129/WebService.asmx/LoadDeliverySchedule"
		
	Log(downloadstring)
	j.PostString( downloadstring,"")
	'j.GetRequest.SetContentType("application/json")
	J.GetRequest.SetHeader("Authorization","Bearer " & Main.Token)
			
	Wait For (j) JobDone(j As HttpJob)
	If j.Success Then
		
		Log(j.GetString)
	If j.GetString = "false" Then 
		Msgbox("Not updated invalid product",True)
		End If
	 
	End If
	
	
	Catch
		
	End Try
	
	PrepareList
	txtScanItem.Text = ""
	txtScanItem.RequestFocus
	
	
	
	
End Sub

Sub ulv_CellClick(RowID As Long, CellIndex As Byte, Position As Int, ClickedPanel As Panel)
	
	If CellIndex = 0 Then 
		Main.x = Main.OrderList.Get(RowID)
		lblItemScanned.Text = 	Main.x.itemCode
		lblCustomer.Text	 = Main.x.account
		DispatchPlanDetailId = Main.x.id
		StockLink= Main.x.StockLink
		
	End If
	
	If CellIndex > 1 Then
		B4XPages.ShowPage("DispatchPlanDetails")
	End If
	
	
	
End Sub