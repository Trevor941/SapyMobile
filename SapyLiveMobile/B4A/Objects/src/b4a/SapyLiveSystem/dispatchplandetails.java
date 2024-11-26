package b4a.SapyLiveSystem;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class dispatchplandetails extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.SapyLiveSystem.dispatchplandetails");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.SapyLiveSystem.dispatchplandetails.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsubmit = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcustomer = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfreightcostfor = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblfrieghtcompany = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblinvoice = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblitemcode = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblitemcodeee = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblonhand = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblorderno = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblqty = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblscannedqty = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblusercaptured = null;
public b4a.example.dateutils _dateutils = null;
public b4a.SapyLiveSystem.main _main = null;
public b4a.SapyLiveSystem.starter _starter = null;
public b4a.SapyLiveSystem.b4xpages _b4xpages = null;
public b4a.SapyLiveSystem.b4xcollections _b4xcollections = null;
public b4a.SapyLiveSystem.httputils2service _httputils2service = null;
public b4a.SapyLiveSystem.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_appear() throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Private Sub B4XPage_Appear";
 //BA.debugLineNum = 35;BA.debugLine="lblCustomer.Text = Main.x.name";
_lblcustomer.setText(BA.ObjectToCharSequence(_main._x /*b4a.SapyLiveSystem.grvstockin._orderinfo*/ .name /*String*/ ));
 //BA.debugLineNum = 36;BA.debugLine="lblFreightCostFor.Text = Main.x.freightCostFor";
_lblfreightcostfor.setText(BA.ObjectToCharSequence(_main._x /*b4a.SapyLiveSystem.grvstockin._orderinfo*/ .freightCostFor /*String*/ ));
 //BA.debugLineNum = 37;BA.debugLine="lblFrieghtCompany.Text = Main.x.frieghtCompany";
_lblfrieghtcompany.setText(BA.ObjectToCharSequence(_main._x /*b4a.SapyLiveSystem.grvstockin._orderinfo*/ .frieghtCompany /*String*/ ));
 //BA.debugLineNum = 38;BA.debugLine="lblInvoice.Text = Main.x.orderNo";
_lblinvoice.setText(BA.ObjectToCharSequence(_main._x /*b4a.SapyLiveSystem.grvstockin._orderinfo*/ .orderNo /*String*/ ));
 //BA.debugLineNum = 39;BA.debugLine="lblItemCode.Text = Main.x.itemCode";
_lblitemcode.setText(BA.ObjectToCharSequence(_main._x /*b4a.SapyLiveSystem.grvstockin._orderinfo*/ .itemCode /*String*/ ));
 //BA.debugLineNum = 40;BA.debugLine="lblOnHand.Text = Main.x.onHandQty";
_lblonhand.setText(BA.ObjectToCharSequence(_main._x /*b4a.SapyLiveSystem.grvstockin._orderinfo*/ .onHandQty /*double*/ ));
 //BA.debugLineNum = 41;BA.debugLine="lblOrderNo.Text= Main.x.orderNo";
_lblorderno.setText(BA.ObjectToCharSequence(_main._x /*b4a.SapyLiveSystem.grvstockin._orderinfo*/ .orderNo /*String*/ ));
 //BA.debugLineNum = 42;BA.debugLine="lblQty.Text = Main.x.qtyToProcess";
_lblqty.setText(BA.ObjectToCharSequence(_main._x /*b4a.SapyLiveSystem.grvstockin._orderinfo*/ .qtyToProcess /*double*/ ));
 //BA.debugLineNum = 43;BA.debugLine="lblScannedQty.Text =Main.x.scannedQty";
_lblscannedqty.setText(BA.ObjectToCharSequence(_main._x /*b4a.SapyLiveSystem.grvstockin._orderinfo*/ .scannedQty /*double*/ ));
 //BA.debugLineNum = 44;BA.debugLine="lblUserCaptured.Text= Main.x.userCaptured";
_lblusercaptured.setText(BA.ObjectToCharSequence(_main._x /*b4a.SapyLiveSystem.grvstockin._orderinfo*/ .userCaptured /*String*/ ));
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 25;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 26;BA.debugLine="Root.LoadLayout(\"DispatchPlanDetailPage\")";
_root.LoadLayout("DispatchPlanDetailPage",ba);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public String  _btnsubmit_click() throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Private Sub btnSubmit_Click";
 //BA.debugLineNum = 49;BA.debugLine="B4XPages.ShowPage(\"LinkDispatchPlanToStock\")";
_b4xpages._showpage /*String*/ (ba,"LinkDispatchPlanToStock");
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Private btnSubmit As Button";
_btnsubmit = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private lblCustomer As Label";
_lblcustomer = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private lblFreightCostFor As Label";
_lblfreightcostfor = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private lblFrieghtCompany As Label";
_lblfrieghtcompany = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private lblInvoice As Label";
_lblinvoice = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private lblItemCode As Label";
_lblitemcode = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private lblItemCodeee As Label";
_lblitemcodeee = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private lblOnHand As Label";
_lblonhand = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private lblOrderNo As Label";
_lblorderno = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private lblQty As Label";
_lblqty = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private lblScannedQty As Label";
_lblscannedqty = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private lblUserCaptured As Label";
_lblusercaptured = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
