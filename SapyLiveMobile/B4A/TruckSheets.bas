B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.2
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private btnClear As Button
	Private Panel1 As Panel
	Private txtInvoice As EditText
	Private Ulv As UltimateListView
	Private txtTruckSheet As EditText
	
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("TruckControlSheet")
	'grvstockdetaillinepage
	'load the layout to Root
	
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub txtTruckSheet_EnterPressed
	
	If txtTruckSheet.Text = "" Then 
		Return
	End If
	
	LoadTruckControlSheet
	txtTruckSheet.Enabled = False
End Sub

Private Sub txtInvoice_EnterPressed
	
	
	If txtTruckSheet.Text = "" Then 
		Return
	End If
	
	Wait For (AddToTruckSheet) Complete (Result As Int)
	
	LoadTruckControlSheet
	
	txtInvoice.Text = ""
	txtInvoice.RequestFocus
	
End Sub

Private Sub btnClear_Click
	Panel1.RemoveAllViews
	txtTruckSheet.Enabled = True
	txtTruckSheet.Text = ""
	txtInvoice.Text = ""
	
End Sub

private Sub AddToTruckSheet As ResumableSub
	
Dim j As HttpJob
Try
	j.Initialize("", Me)
	Dim k As String
		Dim downloadstring As String = Main.Server & "/api/StockItems/UpdateTruckSheetStockItemByInvoice?InvoiceNo=" & txtInvoice.Text & "&TruckSheetNo=" & txtTruckSheet.Text & "&User=" & Main.UserLogin
	Log(downloadstring)
	j.PostString( downloadstring,"")
		
	J.GetRequest.SetHeader("Authorization","Bearer " & Main.Token)
	Main.TruckControlSheetList.Initialize
		
	Wait For (j) JobDone(j As HttpJob)
	If j.Success Then
		
		Return 1
	End If
Catch
	Log(LastException)	
End Try
	Return 0
End Sub


Private Sub LoadTruckControlSheet
	Dim j As HttpJob	
	Try	
	j.Initialize("", Me)
	Dim k As String	
	
		'http://192.168.88.2:5270/api/StockItems/UpdateTruckSheetStockItemByInvoice?InvoiceNo=INV123&TruckSheetNo=2&User=james
		
		Dim downloadstring As String = Main.Server & "/api/StockItems/GetStockItemFromTruckSheetNo?TruckSheetNo="& txtTruckSheet.Text
		
		Log(downloadstring)
		j.Download( downloadstring)
		
		J.GetRequest.SetHeader("Authorization","Bearer " & Main.Token)
		Main.TruckControlSheetList.Initialize
		
		Wait For (j) JobDone(j As HttpJob)
		If j.Success Then
			Log(j.GetString)
			Dim parser As JSONParser
		
			parser.Initialize(j.GetString)
			Dim jRoot As List = parser.NextArray
			Dim invoiceno As String
			Dim ItemCode As String
			Dim Id As String
			Dim Qty As Double
				For Each coljRoot As Map In jRoot
					
					Id = coljRoot.Get("id")
					invoiceno = coljRoot.Get("invoiceNo")
					Qty = coljRoot.Get("qty")
					ItemCode = coljRoot.Get("itemCode")
					
					Dim a As TruckSheetType
					a.InvoiceNo = invoiceno
					a.qty =  Qty
					a.Code = ItemCode
					a.ID = Id				
					Main.TruckControlSheetList.Add(a)				
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
	Dim cellwidths() As Int = Array As Int(25%x,25%x,30%x,20%x)	
	Ulv.AddRowLayout("ReceiptHeader","ReceiptHeader_Layout","ReceiptHeader_filler",50dip,cellwidths.Length,cellwidths,0,Colors.White,True)	
	Panel1.AddView(Ulv,0%x,0%y,Panel1.Width-2dip,Panel1.Height-2dip)	
	Ulv.BulkAddItems(Main.TruckControlSheetList.Size,"ReceiptHeader",0)
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
	
	
	
	Dim x As TruckSheetType =Main.TruckControlSheetList.Get(RowID)
	
	Select CellIndex
		
		
		Case 0:
			Dim lbl As Label = CellPanel.GetView(0)
			lbl.TextColor = Colors.Black
			lbl.Text=x.InvoiceNo
		
		
		Case 1:
			'Positions the cursor on the requested item
			
			
				Dim lbl As Label = CellPanel.GetView(0)
				lbl.TextColor = Colors.Black
				lbl.Text=x.Code
			
			
			
			
			
		Case 2:
			Dim lbl As Label = CellPanel.GetView(0)
			lbl.TextColor = Colors.Black
			lbl.Text=x.qty
			
			
		Case 3:
			Dim lbl As Label = CellPanel.GetView(0)
			lbl.TextColor = Colors.Black
			lbl.Text=x.ID
		
	End Select
	
	
	
	
End Sub

