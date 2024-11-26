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
	Private lblCustomer As Label
	Private lblFreightCostFor As Label
	Private lblFrieghtCompany As Label
	Private lblInvoice As Label
	Private lblItemCode As Label
	Private lblItemCodeee As Label
	Private lblOnHand As Label
	Private lblOrderNo As Label
	Private lblQty As Label
	Private lblScannedQty As Label
	Private lblUserCaptured As Label
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("DispatchPlanDetailPage")
	'load the layout to Root
	
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.


Private Sub B4XPage_Appear
	lblCustomer.Text = Main.x.name
	lblFreightCostFor.Text = Main.x.freightCostFor
	lblFrieghtCompany.Text = Main.x.frieghtCompany
	lblInvoice.Text = Main.x.orderNo
	lblItemCode.Text = Main.x.itemCode
	lblOnHand.Text = Main.x.onHandQty
	lblOrderNo.Text= Main.x.orderNo
	lblQty.Text = Main.x.qtyToProcess
	lblScannedQty.Text =Main.x.scannedQty
	lblUserCaptured.Text= Main.x.userCaptured

End Sub

Private Sub btnSubmit_Click
	B4XPages.ShowPage("LinkDispatchPlanToStock")
End Sub