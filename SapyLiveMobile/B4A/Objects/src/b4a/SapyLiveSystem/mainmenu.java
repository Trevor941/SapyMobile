package b4a.SapyLiveSystem;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class mainmenu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.SapyLiveSystem.mainmenu");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.SapyLiveSystem.mainmenu.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btngrvstock = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btntransferstock = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btndrawstock = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btndispatchplan = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btntrucksheet = null;
public b4a.example.dateutils _dateutils = null;
public b4a.SapyLiveSystem.main _main = null;
public b4a.SapyLiveSystem.starter _starter = null;
public b4a.SapyLiveSystem.b4xpages _b4xpages = null;
public b4a.SapyLiveSystem.b4xcollections _b4xcollections = null;
public b4a.SapyLiveSystem.httputils2service _httputils2service = null;
public b4a.SapyLiveSystem.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 18;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 19;BA.debugLine="Root.LoadLayout(\"MainMenuPage\")";
_root.LoadLayout("MainMenuPage",ba);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public String  _btndispatchplan_click() throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Private Sub btnDispatchPlan_Click";
 //BA.debugLineNum = 40;BA.debugLine="B4XPages.ShowPage(\"LinkDispatchPlanToStock\")";
_b4xpages._showpage /*String*/ (ba,"LinkDispatchPlanToStock");
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public String  _btndrawstock_click() throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Private Sub btnDrawStock_Click";
 //BA.debugLineNum = 36;BA.debugLine="B4XPages.ShowPage(\"DrawRawMaterial\")";
_b4xpages._showpage /*String*/ (ba,"DrawRawMaterial");
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public String  _btngrvstock_click() throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Private Sub btnGrvStock_Click";
 //BA.debugLineNum = 27;BA.debugLine="B4XPages.ShowPage(\"GrvStockIn\")";
_b4xpages._showpage /*String*/ (ba,"GrvStockIn");
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public String  _btntransferstock_click() throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Private Sub btnTransferStock_Click";
 //BA.debugLineNum = 32;BA.debugLine="B4XPages.ShowPage(\"StockTransfer\")";
_b4xpages._showpage /*String*/ (ba,"StockTransfer");
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public String  _btntrucksheet_click() throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Private Sub btnTruckSheet_Click";
 //BA.debugLineNum = 44;BA.debugLine="B4XPages.ShowPage(\"TruckSheets\")";
_b4xpages._showpage /*String*/ (ba,"TruckSheets");
 //BA.debugLineNum = 45;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Private btnGrvStock As Button";
_btngrvstock = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private btnTransferStock As Button";
_btntransferstock = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private btnDrawStock As Button";
_btndrawstock = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private btnDispatchPlan As Button";
_btndispatchplan = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private btnTruckSheet As Button";
_btntrucksheet = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 13;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
