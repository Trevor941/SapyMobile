B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.2
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private btnChangeWarehouse As Button
	Private btnSubmit As Button
	Private lblResult As Label
	Private txtStockId As EditText
	Private txtWarehouse As EditText
	Private lblWarehouse As Label
	Dim whseLink As Int
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("StockTransferPage")
	'load the layout to Root
	
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub txtWarehouse_EnterPressed
	
Dim j As HttpJob
	

Try
	
	
	
	
	
		
	j.Initialize(txtWarehouse.Text, Me)
	Dim k As String
	'	Public Server As String = "http://192.168.0.173:20577"
	'http://192.168.0.173:20577/api/SagePo/bypo/PO040167
		Dim downloadstring As String = Main.Server & "/api/Warehouses/Code/" & txtWarehouse.Text
	'Dim downloadstring As String = "http://localhost:63129/WebService.asmx/LoadDeliverySchedule"
		'http://192.168.0.37:51758/api/Warehouses/code/BGT
		
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
	ToastMessageShow("Invalid Warehouse",True)
	Return
	End If


	For Each coljRoot As Map In jRoot
		Dim code As String = coljRoot.Get("code")
		Dim name As String = coljRoot.Get("name")
				whseLink = coljRoot.Get("whseLink")
		lblWarehouse.Text = name
		txtWarehouse.Enabled = False
		txtStockId.Enabled = True
		txtStockId.RequestFocus
	Next
	
	Else
		lblWarehouse.Text = ""
		
	
	
	End If
	
	j.Release
	
	
	Catch
		
		
	End Try
End Sub

Private Sub txtStockId_EnterPressed
Dim j As HttpJob
	

Try
	
	
	
	
	
		
	j.Initialize(txtWarehouse.Text, Me)
	Dim k As String
	
		'http://192.168.88.2:20577/api/StockItems/UpdateWareHouse?WareHouseID=1&StockId=4&UserName=sdfsdfGG
		Dim downloadstring As String = Main.Server & "/api/StockItems/UpdateWareHouse?StockId=" & txtStockId.Text & "&WareHouseID=" & whseLink &"&UserName=" & Main.UserLogin
		'Dim downloadstring As String = "http://localhost:63129/WebService.asmx/LoadDeliverySchedule"
		Log(downloadstring)
		'http://192.168.0.37:51758/api/StockItems/UpdateWareHouse?WareHouseID=2&StockId=289&UserName=james
		'http://sapy.dyndns.org:51758/api/StockItems/UpdateWareHouse?StockId=289&WareHouseID=BGT&UserName=james@webbis.co.za
		
		j.PostString( downloadstring,"")
		'j.GetRequest.SetContentType("application/json")
	J.GetRequest.SetHeader("Authorization","Bearer " & Main.Token)
		
		Wait For (j) JobDone(j As HttpJob)
		If j.Success Then
			Dim parser As JSONParser
			parser.Initialize(j.GetString)
			Dim jRoot As Map = parser.NextObject
			
			Dim Id As Int  = jRoot.Get("id")
			Dim idInvoiceLines As Int = jRoot.Get("idInvoiceLines")
			Dim wareHouseID As Int = jRoot.Get("wareHouseID")
			Dim pDescription As String = jRoot.Get("pDescription")
			Dim customerOrSupplierDesc As String = jRoot.Get("customerOrSupplierDesc")
			Dim binNo As String = jRoot.Get("binNo")
			Dim WarehouseCode As String = jRoot.Get("warehouseCode")
			
			lblResult.Text =   txtStockId.Text & " has been Transfered to " & WarehouseCode
			lblResult.TextColor = Colors.RGB(46, 135, 102)
			ToastMessageShow( txtStockId.Text & " has been Transfered to " & WarehouseCode,True)
			txtStockId.Text = ""
			txtStockId.RequestFocus
			Else
				
			lblResult.Text = txtStockId.Text & " has been Failed " & WarehouseCode
			lblResult.TextColor = Colors.Red
				
	End If
	
	j.Release
	
	Catch
	
	
	End Try
	
End Sub

Private Sub lblResult_Click
	
End Sub

Private Sub btnSubmit_Click
	lblResult.Text = ""
	txtStockId.Enabled = False
	txtWarehouse.Enabled = True
	txtWarehouse.Text = ""
	txtStockId.Text = ""
	'lblWarehouse.Text = ""
	B4XPages.ShowPageAndRemovePreviousPages("MainMenu")
End Sub

Private Sub btnChangeWarehouse_Click
	lblResult.Text = ""
	txtStockId.Enabled = False
	txtWarehouse.Enabled = True
	txtWarehouse.Text = ""
	'lblWarehouse.Text = ""
	txtStockId.Text = ""
End Sub