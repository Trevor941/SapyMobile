package b4a.SapyLiveSystem;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class stocktransfer extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.SapyLiveSystem.stocktransfer");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.SapyLiveSystem.stocktransfer.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnchangewarehouse = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsubmit = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblresult = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtstockid = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtwarehouse = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblwarehouse = null;
public int _whselink = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.SapyLiveSystem.main _main = null;
public b4a.SapyLiveSystem.starter _starter = null;
public b4a.SapyLiveSystem.b4xpages _b4xpages = null;
public b4a.SapyLiveSystem.b4xcollections _b4xcollections = null;
public b4a.SapyLiveSystem.httputils2service _httputils2service = null;
public b4a.SapyLiveSystem.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 20;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 21;BA.debugLine="Root.LoadLayout(\"StockTransferPage\")";
_root.LoadLayout("StockTransferPage",ba);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public String  _btnchangewarehouse_click() throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Private Sub btnChangeWarehouse_Click";
 //BA.debugLineNum = 169;BA.debugLine="lblResult.Text = \"\"";
_lblresult.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 170;BA.debugLine="txtStockId.Enabled = False";
_txtstockid.setEnabled(__c.False);
 //BA.debugLineNum = 171;BA.debugLine="txtWarehouse.Enabled = True";
_txtwarehouse.setEnabled(__c.True);
 //BA.debugLineNum = 172;BA.debugLine="txtWarehouse.Text = \"\"";
_txtwarehouse.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 174;BA.debugLine="txtStockId.Text = \"\"";
_txtstockid.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return "";
}
public String  _btnsubmit_click() throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Private Sub btnSubmit_Click";
 //BA.debugLineNum = 159;BA.debugLine="lblResult.Text = \"\"";
_lblresult.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 160;BA.debugLine="txtStockId.Enabled = False";
_txtstockid.setEnabled(__c.False);
 //BA.debugLineNum = 161;BA.debugLine="txtWarehouse.Enabled = True";
_txtwarehouse.setEnabled(__c.True);
 //BA.debugLineNum = 162;BA.debugLine="txtWarehouse.Text = \"\"";
_txtwarehouse.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 163;BA.debugLine="txtStockId.Text = \"\"";
_txtstockid.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 165;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"MainMenu";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"MainMenu");
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Private btnChangeWarehouse As Button";
_btnchangewarehouse = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private btnSubmit As Button";
_btnsubmit = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private lblResult As Label";
_lblresult = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private txtStockId As EditText";
_txtstockid = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private txtWarehouse As EditText";
_txtwarehouse = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private lblWarehouse As Label";
_lblwarehouse = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Dim whseLink As Int";
_whselink = 0;
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 15;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return null;
}
public String  _lblresult_click() throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Private Sub lblResult_Click";
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return "";
}
public void  _txtstockid_enterpressed() throws Exception{
ResumableSub_txtStockId_EnterPressed rsub = new ResumableSub_txtStockId_EnterPressed(this);
rsub.resume(ba, null);
}
public static class ResumableSub_txtStockId_EnterPressed extends BA.ResumableSub {
public ResumableSub_txtStockId_EnterPressed(b4a.SapyLiveSystem.stocktransfer parent) {
this.parent = parent;
}
b4a.SapyLiveSystem.stocktransfer parent;
b4a.SapyLiveSystem.httpjob _j = null;
String _k = "";
String _downloadstring = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _jroot = null;
int _id = 0;
int _idinvoicelines = 0;
int _warehouseid = 0;
String _pdescription = "";
String _customerorsupplierdesc = "";
String _binno = "";
String _warehousecode = "";

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
 //BA.debugLineNum = 95;BA.debugLine="Dim j As HttpJob";
_j = new b4a.SapyLiveSystem.httpjob();
 //BA.debugLineNum = 98;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 12;
this.catchState = 11;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 11;
 //BA.debugLineNum = 105;BA.debugLine="j.Initialize(txtWarehouse.Text, Me)";
_j._initialize /*String*/ (ba,parent._txtwarehouse.getText(),parent);
 //BA.debugLineNum = 106;BA.debugLine="Dim k As String";
_k = "";
 //BA.debugLineNum = 109;BA.debugLine="Dim downloadstring As String = Main.Server & \"/a";
_downloadstring = parent._main._server /*String*/ +"/api/StockItems/UpdateWareHouse?StockId="+parent._txtstockid.getText()+"&WareHouseID="+BA.NumberToString(parent._whselink)+"&UserName="+parent._main._userlogin /*String*/ ;
 //BA.debugLineNum = 111;BA.debugLine="Log(downloadstring)";
parent.__c.LogImpl("611730961",_downloadstring,0);
 //BA.debugLineNum = 115;BA.debugLine="j.PostString( downloadstring,\"\")";
_j._poststring /*String*/ (_downloadstring,"");
 //BA.debugLineNum = 117;BA.debugLine="J.GetRequest.SetHeader(\"Authorization\",\"Bearer \"";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+parent._main._token /*String*/ );
 //BA.debugLineNum = 119;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 13;
return;
case 13:
//C
this.state = 4;
_j = (b4a.SapyLiveSystem.httpjob) result[0];
;
 //BA.debugLineNum = 120;BA.debugLine="If j.Success Then";
if (true) break;

case 4:
//if
this.state = 9;
if (_j._success /*boolean*/ ) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 //BA.debugLineNum = 121;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 122;BA.debugLine="parser.Initialize(j.GetString)";
_parser.Initialize(_j._getstring /*String*/ ());
 //BA.debugLineNum = 123;BA.debugLine="Dim jRoot As Map = parser.NextObject";
_jroot = new anywheresoftware.b4a.objects.collections.Map();
_jroot = _parser.NextObject();
 //BA.debugLineNum = 125;BA.debugLine="Dim Id As Int  = jRoot.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_jroot.Get((Object)("id"))));
 //BA.debugLineNum = 126;BA.debugLine="Dim idInvoiceLines As Int = jRoot.Get(\"idInvoic";
_idinvoicelines = (int)(BA.ObjectToNumber(_jroot.Get((Object)("idInvoiceLines"))));
 //BA.debugLineNum = 127;BA.debugLine="Dim wareHouseID As Int = jRoot.Get(\"wareHouseID";
_warehouseid = (int)(BA.ObjectToNumber(_jroot.Get((Object)("wareHouseID"))));
 //BA.debugLineNum = 128;BA.debugLine="Dim pDescription As String = jRoot.Get(\"pDescri";
_pdescription = BA.ObjectToString(_jroot.Get((Object)("pDescription")));
 //BA.debugLineNum = 129;BA.debugLine="Dim customerOrSupplierDesc As String = jRoot.Ge";
_customerorsupplierdesc = BA.ObjectToString(_jroot.Get((Object)("customerOrSupplierDesc")));
 //BA.debugLineNum = 130;BA.debugLine="Dim binNo As String = jRoot.Get(\"binNo\")";
_binno = BA.ObjectToString(_jroot.Get((Object)("binNo")));
 //BA.debugLineNum = 131;BA.debugLine="Dim WarehouseCode As String = jRoot.Get(\"wareho";
_warehousecode = BA.ObjectToString(_jroot.Get((Object)("warehouseCode")));
 //BA.debugLineNum = 133;BA.debugLine="lblResult.Text =   txtStockId.Text & \" has been";
parent._lblresult.setText(BA.ObjectToCharSequence(parent._txtstockid.getText()+" has been Transfered to "+_warehousecode));
 //BA.debugLineNum = 134;BA.debugLine="lblResult.TextColor = Colors.RGB(46, 135, 102)";
parent._lblresult.setTextColor(parent.__c.Colors.RGB((int) (46),(int) (135),(int) (102)));
 //BA.debugLineNum = 135;BA.debugLine="ToastMessageShow( txtStockId.Text & \" has been";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence(parent._txtstockid.getText()+" has been Transfered to "+_warehousecode),parent.__c.True);
 //BA.debugLineNum = 136;BA.debugLine="txtStockId.Text = \"\"";
parent._txtstockid.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 137;BA.debugLine="txtStockId.RequestFocus";
parent._txtstockid.RequestFocus();
 if (true) break;

case 8:
//C
this.state = 9;
 //BA.debugLineNum = 140;BA.debugLine="lblResult.Text = txtStockId.Text & \" has been F";
parent._lblresult.setText(BA.ObjectToCharSequence(parent._txtstockid.getText()+" has been Failed "+_warehousecode));
 //BA.debugLineNum = 141;BA.debugLine="lblResult.TextColor = Colors.Red";
parent._lblresult.setTextColor(parent.__c.Colors.Red);
 if (true) break;

case 9:
//C
this.state = 12;
;
 //BA.debugLineNum = 145;BA.debugLine="j.Release";
_j._release /*String*/ ();
 if (true) break;

case 11:
//C
this.state = 12;
this.catchState = 0;
 if (true) break;
if (true) break;

case 12:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
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
public void  _txtwarehouse_enterpressed() throws Exception{
ResumableSub_txtWarehouse_EnterPressed rsub = new ResumableSub_txtWarehouse_EnterPressed(this);
rsub.resume(ba, null);
}
public static class ResumableSub_txtWarehouse_EnterPressed extends BA.ResumableSub {
public ResumableSub_txtWarehouse_EnterPressed(b4a.SapyLiveSystem.stocktransfer parent) {
this.parent = parent;
}
b4a.SapyLiveSystem.stocktransfer parent;
b4a.SapyLiveSystem.httpjob _j = null;
String _k = "";
String _downloadstring = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _jroot = null;
anywheresoftware.b4a.objects.collections.Map _coljroot = null;
String _code = "";
String _name = "";
anywheresoftware.b4a.BA.IterableList group18;
int index18;
int groupLen18;

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
 //BA.debugLineNum = 30;BA.debugLine="Dim j As HttpJob";
_j = new b4a.SapyLiveSystem.httpjob();
 //BA.debugLineNum = 33;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 19;
this.catchState = 18;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 18;
 //BA.debugLineNum = 40;BA.debugLine="j.Initialize(txtWarehouse.Text, Me)";
_j._initialize /*String*/ (ba,parent._txtwarehouse.getText(),parent);
 //BA.debugLineNum = 41;BA.debugLine="Dim k As String";
_k = "";
 //BA.debugLineNum = 44;BA.debugLine="Dim downloadstring As String = Main.Server & \"/a";
_downloadstring = parent._main._server /*String*/ +"/api/Warehouses/Code/"+parent._txtwarehouse.getText();
 //BA.debugLineNum = 48;BA.debugLine="Log(downloadstring)";
parent.__c.LogImpl("611665428",_downloadstring,0);
 //BA.debugLineNum = 49;BA.debugLine="j.Download( downloadstring)";
_j._download /*String*/ (_downloadstring);
 //BA.debugLineNum = 51;BA.debugLine="J.GetRequest.SetHeader(\"Authorization\",\"Bearer \"";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+parent._main._token /*String*/ );
 //BA.debugLineNum = 53;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 20;
return;
case 20:
//C
this.state = 4;
_j = (b4a.SapyLiveSystem.httpjob) result[0];
;
 //BA.debugLineNum = 54;BA.debugLine="If j.Success Then";
if (true) break;

case 4:
//if
this.state = 16;
if (_j._success /*boolean*/ ) { 
this.state = 6;
}else {
this.state = 15;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 58;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 59;BA.debugLine="parser.Initialize(j.GetString)";
_parser.Initialize(_j._getstring /*String*/ ());
 //BA.debugLineNum = 60;BA.debugLine="Dim jRoot As List = parser.NextArray";
_jroot = new anywheresoftware.b4a.objects.collections.List();
_jroot = _parser.NextArray();
 //BA.debugLineNum = 62;BA.debugLine="If jRoot.Size = 0 Then";
if (true) break;

case 7:
//if
this.state = 10;
if (_jroot.getSize()==0) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 63;BA.debugLine="ToastMessageShow(\"Invalid Warehouse\",True)";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Invalid Warehouse"),parent.__c.True);
 //BA.debugLineNum = 64;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
 //BA.debugLineNum = 68;BA.debugLine="For Each coljRoot As Map In jRoot";

case 10:
//for
this.state = 13;
_coljroot = new anywheresoftware.b4a.objects.collections.Map();
group18 = _jroot;
index18 = 0;
groupLen18 = group18.getSize();
this.state = 21;
if (true) break;

case 21:
//C
this.state = 13;
if (index18 < groupLen18) {
this.state = 12;
_coljroot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group18.Get(index18)));}
if (true) break;

case 22:
//C
this.state = 21;
index18++;
if (true) break;

case 12:
//C
this.state = 22;
 //BA.debugLineNum = 69;BA.debugLine="Dim code As String = coljRoot.Get(\"code\")";
_code = BA.ObjectToString(_coljroot.Get((Object)("code")));
 //BA.debugLineNum = 70;BA.debugLine="Dim name As String = coljRoot.Get(\"name\")";
_name = BA.ObjectToString(_coljroot.Get((Object)("name")));
 //BA.debugLineNum = 71;BA.debugLine="whseLink = coljRoot.Get(\"whseLink\")";
parent._whselink = (int)(BA.ObjectToNumber(_coljroot.Get((Object)("whseLink"))));
 //BA.debugLineNum = 72;BA.debugLine="lblWarehouse.Text = name";
parent._lblwarehouse.setText(BA.ObjectToCharSequence(_name));
 //BA.debugLineNum = 73;BA.debugLine="txtWarehouse.Enabled = False";
parent._txtwarehouse.setEnabled(parent.__c.False);
 //BA.debugLineNum = 74;BA.debugLine="txtStockId.Enabled = True";
parent._txtstockid.setEnabled(parent.__c.True);
 //BA.debugLineNum = 75;BA.debugLine="txtStockId.RequestFocus";
parent._txtstockid.RequestFocus();
 if (true) break;
if (true) break;

case 13:
//C
this.state = 16;
;
 if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 79;BA.debugLine="lblWarehouse.Text = \"\"";
parent._lblwarehouse.setText(BA.ObjectToCharSequence(""));
 if (true) break;

case 16:
//C
this.state = 19;
;
 //BA.debugLineNum = 85;BA.debugLine="j.Release";
_j._release /*String*/ ();
 if (true) break;

case 18:
//C
this.state = 19;
this.catchState = 0;
 if (true) break;
if (true) break;

case 19:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
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
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
