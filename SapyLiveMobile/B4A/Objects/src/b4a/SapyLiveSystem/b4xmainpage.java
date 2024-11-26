package b4a.SapyLiveSystem;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.SapyLiveSystem.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.SapyLiveSystem.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _edittext2 = null;
public anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
public anywheresoftware.b4a.phone.Phone _p = null;
public b4a.SapyLiveSystem.mainmenu _mainmenu = null;
public b4a.SapyLiveSystem.grvstockin _grvstockin = null;
public b4a.SapyLiveSystem.grvheaderinfo _grvheaderinfo = null;
public b4a.SapyLiveSystem.grvstockdetailline _grvstockdetailline = null;
public b4a.SapyLiveSystem.stocktransfer _stocktransfer = null;
public b4a.SapyLiveSystem.drawrawmaterial _drawrawmaterial = null;
public b4a.SapyLiveSystem.linkdispatchplantostock _linkdispatchplantostock1 = null;
public b4a.SapyLiveSystem.dispatchplandetails _dispatchplandetails = null;
public b4a.SapyLiveSystem.trucksheets _trucksheets = null;
public b4a.example.dateutils _dateutils = null;
public b4a.SapyLiveSystem.main _main = null;
public b4a.SapyLiveSystem.starter _starter = null;
public b4a.SapyLiveSystem.b4xpages _b4xpages = null;
public b4a.SapyLiveSystem.b4xcollections _b4xcollections = null;
public b4a.SapyLiveSystem.httputils2service _httputils2service = null;
public b4a.SapyLiveSystem.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 34;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 35;BA.debugLine="Root.LoadLayout(\"MainPage\")";
_root.LoadLayout("MainPage",ba);
 //BA.debugLineNum = 37;BA.debugLine="B4XPages.AddPage(\"MainMenu\",MainMenu)";
_b4xpages._addpage /*String*/ (ba,"MainMenu",(Object)(_mainmenu));
 //BA.debugLineNum = 38;BA.debugLine="MainMenu.Initialize";
_mainmenu._initialize /*Object*/ (ba);
 //BA.debugLineNum = 41;BA.debugLine="B4XPages.AddPage(\"LinkDispatchPlanToStock\",LinkDi";
_b4xpages._addpage /*String*/ (ba,"LinkDispatchPlanToStock",(Object)(_linkdispatchplantostock1));
 //BA.debugLineNum = 42;BA.debugLine="LinkDispatchPlanToStock1.Initialize";
_linkdispatchplantostock1._initialize /*Object*/ (ba);
 //BA.debugLineNum = 45;BA.debugLine="B4XPages.AddPage(\"GrvHeaderInfo\",GrvHeaderInfo)";
_b4xpages._addpage /*String*/ (ba,"GrvHeaderInfo",(Object)(_grvheaderinfo));
 //BA.debugLineNum = 46;BA.debugLine="GrvHeaderInfo.Initialize";
_grvheaderinfo._initialize /*Object*/ (ba);
 //BA.debugLineNum = 48;BA.debugLine="B4XPages.AddPage(\"GrvStockIn\",GrvStockIn)";
_b4xpages._addpage /*String*/ (ba,"GrvStockIn",(Object)(_grvstockin));
 //BA.debugLineNum = 49;BA.debugLine="GrvStockIn.Initialize";
_grvstockin._initialize /*Object*/ (ba);
 //BA.debugLineNum = 52;BA.debugLine="B4XPages.AddPage(\"GrvStockDetailLine\",GrvStockDet";
_b4xpages._addpage /*String*/ (ba,"GrvStockDetailLine",(Object)(_grvstockdetailline));
 //BA.debugLineNum = 53;BA.debugLine="GrvStockDetailLine.Initialize";
_grvstockdetailline._initialize /*Object*/ (ba);
 //BA.debugLineNum = 55;BA.debugLine="B4XPages.AddPage(\"StockTransfer\",StockTransfer)";
_b4xpages._addpage /*String*/ (ba,"StockTransfer",(Object)(_stocktransfer));
 //BA.debugLineNum = 56;BA.debugLine="StockTransfer.Initialize";
_stocktransfer._initialize /*Object*/ (ba);
 //BA.debugLineNum = 58;BA.debugLine="B4XPages.AddPage(\"DrawRawMaterial\",DrawRawMateria";
_b4xpages._addpage /*String*/ (ba,"DrawRawMaterial",(Object)(_drawrawmaterial));
 //BA.debugLineNum = 59;BA.debugLine="DrawRawMaterial.Initialize";
_drawrawmaterial._initialize /*Object*/ (ba);
 //BA.debugLineNum = 61;BA.debugLine="B4XPages.AddPage(\"DispatchPlanDetails\",DispatchPl";
_b4xpages._addpage /*String*/ (ba,"DispatchPlanDetails",(Object)(_dispatchplandetails));
 //BA.debugLineNum = 62;BA.debugLine="DispatchPlanDetails.Initialize";
_dispatchplandetails._initialize /*Object*/ (ba);
 //BA.debugLineNum = 64;BA.debugLine="B4XPages.AddPage(\"TruckSheets\",TruckSheets)";
_b4xpages._addpage /*String*/ (ba,"TruckSheets",(Object)(_trucksheets));
 //BA.debugLineNum = 65;BA.debugLine="TruckSheets.Initialize";
_trucksheets._initialize /*Object*/ (ba);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public String  _button1_click() throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Private Sub Button1_Click";
 //BA.debugLineNum = 73;BA.debugLine="If p.SdkVersion >= 29 Then";
if (_p.getSdkVersion()>=29) { 
 //BA.debugLineNum = 75;BA.debugLine="Main.IMENo =	p.getSettings(\"android_id\")";
_main._imeno /*String*/  = _p.GetSettings("android_id");
 }else {
 //BA.debugLineNum = 77;BA.debugLine="Main.IMENo =	p.getSettings(\"android_id\")";
_main._imeno /*String*/  = _p.GetSettings("android_id");
 };
 //BA.debugLineNum = 87;BA.debugLine="GetToken(EditText1.Text,EditText2.Text)";
_gettoken(_edittext1.getText(),_edittext2.getText());
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 12;BA.debugLine="Private Button1 As Button";
_button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private EditText1 As EditText";
_edittext1 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private EditText2 As EditText";
_edittext2 = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Dim rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 16;BA.debugLine="Dim p As Phone";
_p = new anywheresoftware.b4a.phone.Phone();
 //BA.debugLineNum = 17;BA.debugLine="Public MainMenu As MainMenu";
_mainmenu = new b4a.SapyLiveSystem.mainmenu();
 //BA.debugLineNum = 18;BA.debugLine="Public GrvStockIn As GrvStockIn";
_grvstockin = new b4a.SapyLiveSystem.grvstockin();
 //BA.debugLineNum = 19;BA.debugLine="Public GrvHeaderInfo As GrvHeaderInfo";
_grvheaderinfo = new b4a.SapyLiveSystem.grvheaderinfo();
 //BA.debugLineNum = 20;BA.debugLine="Public GrvStockDetailLine As GrvStockDetailLine";
_grvstockdetailline = new b4a.SapyLiveSystem.grvstockdetailline();
 //BA.debugLineNum = 21;BA.debugLine="Public StockTransfer As StockTransfer";
_stocktransfer = new b4a.SapyLiveSystem.stocktransfer();
 //BA.debugLineNum = 22;BA.debugLine="Public DrawRawMaterial As DrawRawMaterial";
_drawrawmaterial = new b4a.SapyLiveSystem.drawrawmaterial();
 //BA.debugLineNum = 23;BA.debugLine="Public LinkDispatchPlanToStock1 As LinkDispatchPl";
_linkdispatchplantostock1 = new b4a.SapyLiveSystem.linkdispatchplantostock();
 //BA.debugLineNum = 24;BA.debugLine="Public DispatchPlanDetails As DispatchPlanDetails";
_dispatchplandetails = new b4a.SapyLiveSystem.dispatchplandetails();
 //BA.debugLineNum = 25;BA.debugLine="Public TruckSheets As TruckSheets";
_trucksheets = new b4a.SapyLiveSystem.trucksheets();
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public String  _edittext1_enterpressed() throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Private Sub EditText1_EnterPressed";
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public String  _edittext2_enterpressed() throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Private Sub EditText2_EnterPressed";
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public void  _gettoken(String _username,String _password) throws Exception{
ResumableSub_GetToken rsub = new ResumableSub_GetToken(this,_username,_password);
rsub.resume(ba, null);
}
public static class ResumableSub_GetToken extends BA.ResumableSub {
public ResumableSub_GetToken(b4a.SapyLiveSystem.b4xmainpage parent,String _username,String _password) {
this.parent = parent;
this._username = _username;
this._password = _password;
}
b4a.SapyLiveSystem.b4xmainpage parent;
String _username;
String _password;
b4a.SapyLiveSystem.httpjob _j = null;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";
String _strserver = "";
anywheresoftware.b4a.objects.collections.JSONParser _jsonx = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 105;BA.debugLine="Dim j As HttpJob";
_j = new b4a.SapyLiveSystem.httpjob();
 //BA.debugLineNum = 106;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 108;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 109;BA.debugLine="Map1.Initialize";
_map1.Initialize();
 //BA.debugLineNum = 110;BA.debugLine="Map1.Clear";
_map1.Clear();
 //BA.debugLineNum = 112;BA.debugLine="Map1.Put(\"userName\",UserName)";
_map1.Put((Object)("userName"),(Object)(_username));
 //BA.debugLineNum = 113;BA.debugLine="Map1.Put(\"password\",Password)";
_map1.Put((Object)("password"),(Object)(_password));
 //BA.debugLineNum = 115;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 116;BA.debugLine="JSON.Initialize(Map1)";
_json.Initialize(_map1);
 //BA.debugLineNum = 118;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
 //BA.debugLineNum = 123;BA.debugLine="Dim strserver As String =Main.server & \"/api/Logi";
_strserver = parent._main._server /*String*/ +"/api/Login";
 //BA.debugLineNum = 127;BA.debugLine="j.PostString(strserver,data )";
_j._poststring /*String*/ (_strserver,_data);
 //BA.debugLineNum = 128;BA.debugLine="j.GetRequest.SetContentType(\"application/json\")";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 129;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 13;
return;
case 13:
//C
this.state = 1;
_j = (b4a.SapyLiveSystem.httpjob) result[0];
;
 //BA.debugLineNum = 130;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 12;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 11;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 131;BA.debugLine="Dim JSONx As JSONParser";
_jsonx = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 132;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 133;BA.debugLine="Log(j.GetString)";
parent.__c.LogImpl("62621472",_j._getstring /*String*/ (),0);
 //BA.debugLineNum = 134;BA.debugLine="JSONx.Initialize(j.GetString)";
_jsonx.Initialize(_j._getstring /*String*/ ());
 //BA.debugLineNum = 135;BA.debugLine="Try";
if (true) break;

case 4:
//try
this.state = 9;
this.catchState = 8;
this.state = 6;
if (true) break;

case 6:
//C
this.state = 9;
this.catchState = 8;
 //BA.debugLineNum = 137;BA.debugLine="Main.Token = j.GetString";
parent._main._token /*String*/  = _j._getstring /*String*/ ();
 //BA.debugLineNum = 141;BA.debugLine="Main.UserLogin = UserName";
parent._main._userlogin /*String*/  = _username;
 //BA.debugLineNum = 143;BA.debugLine="B4XPages.ShowPage(\"MainMenu\")";
parent._b4xpages._showpage /*String*/ (ba,"MainMenu");
 if (true) break;

case 8:
//C
this.state = 9;
this.catchState = 0;
 //BA.debugLineNum = 145;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("62621484",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 9:
//C
this.state = 12;
this.catchState = 0;
;
 if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 150;BA.debugLine="ToastMessageShow(\"Unsuccessfuly Login\",True)";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Unsuccessfuly Login"),parent.__c.True);
 if (true) break;

case 12:
//C
this.state = -1;
;
 //BA.debugLineNum = 156;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
if (true) break;
}} 
       catch (Exception e0) {
			
if (catchState == 0)
    throw e0;
else {
    state = catchState;
ba.setLastException(e0);}
            }
        }
    }
}
public void  _jobdone(b4a.SapyLiveSystem.httpjob _j) throws Exception{
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 28;BA.debugLine="Public Sub Initialize";
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
