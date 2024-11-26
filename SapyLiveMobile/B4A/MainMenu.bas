B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.2
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private btnGrvStock As Button
	Private btnTransferStock As Button
	Private btnDrawStock As Button
	Private btnDispatchPlan As Button
	Private btnTruckSheet As Button
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainMenuPage")
	'load the layout to Root
	
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub btnGrvStock_Click
	B4XPages.ShowPage("GrvStockIn")
	
End Sub

Private Sub btnTransferStock_Click
	B4XPages.ShowPage("StockTransfer")
End Sub

Private Sub btnDrawStock_Click
	B4XPages.ShowPage("DrawRawMaterial")
End Sub

Private Sub btnDispatchPlan_Click
	B4XPages.ShowPage("LinkDispatchPlanToStock")
End Sub

Private Sub btnTruckSheet_Click
	B4XPages.ShowPage("TruckSheets")
End Sub