package b4a.SapyLiveSystem;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class drawrawmaterial extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.SapyLiveSystem.drawrawmaterial");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.SapyLiveSystem.drawrawmaterial.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcode = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcurrentqty = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldesc = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblorginalqty = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblremainingqty = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtenterqty = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtscan = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnreturn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsubmit = null;
public b4a.SapyLiveSystem.b4xdialog _dialog = null;
public b4a.SapyLiveSystem.b4xinputtemplate _inputtemplate = null;
public b4a.example.dateutils _dateutils = null;
public b4a.SapyLiveSystem.main _main = null;
public b4a.SapyLiveSystem.starter _starter = null;
public b4a.SapyLiveSystem.b4xpages _b4xpages = null;
public b4a.SapyLiveSystem.b4xcollections _b4xcollections = null;
public b4a.SapyLiveSystem.httputils2service _httputils2service = null;
public b4a.SapyLiveSystem.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 24;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 25;BA.debugLine="Root.LoadLayout(\"DrawStockPage\")";
_root.LoadLayout("DrawStockPage",ba);
 //BA.debugLineNum = 26;BA.debugLine="dialog.Initialize(Root)";
_dialog._initialize /*String*/ (ba,_root);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public String  _btnreturn_click() throws Exception{
 //BA.debugLineNum = 124;BA.debugLine="Private Sub btnReturn_Click";
 //BA.debugLineNum = 125;BA.debugLine="txtEnterQty.Text = \"\"";
_txtenterqty.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 126;BA.debugLine="lblCode.Text = \"\"";
_lblcode.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 127;BA.debugLine="lblDesc.Text = \"\"";
_lbldesc.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 128;BA.debugLine="lblOrginalQty.Text = \"\"";
_lblorginalqty.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 129;BA.debugLine="lblCurrentQty.Text = \"\"";
_lblcurrentqty.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 130;BA.debugLine="txtEnterQty.Text = \"\"";
_txtenterqty.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 131;BA.debugLine="lblRemainingQty.Text = \"\"";
_lblremainingqty.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 132;BA.debugLine="txtScan.Text=\"\"";
_txtscan.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 133;BA.debugLine="B4XPages.ShowPage(\"MainMenu\")";
_b4xpages._showpage /*String*/ (ba,"MainMenu");
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
return "";
}
public void  _btnsubmit_click() throws Exception{
ResumableSub_btnSubmit_Click rsub = new ResumableSub_btnSubmit_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSubmit_Click extends BA.ResumableSub {
public ResumableSub_btnSubmit_Click(b4a.SapyLiveSystem.drawrawmaterial parent) {
this.parent = parent;
}
b4a.SapyLiveSystem.drawrawmaterial parent;
int _result = 0;
anywheresoftware.b4a.objects.collections.List _l = null;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";
b4a.SapyLiveSystem.httpjob _j = null;
String _strwww = "";
String _strpolocy = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 144;BA.debugLine="dialog.Initialize (Root)";
parent._dialog._initialize /*String*/ (ba,parent._root);
 //BA.debugLineNum = 145;BA.debugLine="InputTemplate.Initialize";
parent._inputtemplate._initialize /*String*/ (ba);
 //BA.debugLineNum = 146;BA.debugLine="InputTemplate.lblTitle.Text = \"Please Scan Printe";
parent._inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Please Scan Printer or type Printer Code"));
 //BA.debugLineNum = 147;BA.debugLine="InputTemplate.Text=\"\"";
parent._inputtemplate._text /*String*/  = "";
 //BA.debugLineNum = 148;BA.debugLine="InputTemplate.lblTitle.TextColor = Colors.White";
parent._inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(parent.__c.Colors.White);
 //BA.debugLineNum = 151;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 11;
return;
case 11:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 152;BA.debugLine="If Result = xui.DialogResponse_Cancel Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==parent._xui.DialogResponse_Cancel) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 153;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 159;BA.debugLine="Dim l As List";
_l = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 160;BA.debugLine="l.Initialize";
_l.Initialize();
 //BA.debugLineNum = 161;BA.debugLine="Dim map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 166;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 167;BA.debugLine="JSON.Initialize2(l)";
_json.Initialize2(_l);
 //BA.debugLineNum = 169;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
 //BA.debugLineNum = 171;BA.debugLine="Dim j As HttpJob";
_j = new b4a.SapyLiveSystem.httpjob();
 //BA.debugLineNum = 172;BA.debugLine="j.Initialize(\"\", Me) 'name is empty as it is no l";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 173;BA.debugLine="Dim strwww As String =Main.Server";
_strwww = parent._main._server /*String*/ ;
 //BA.debugLineNum = 176;BA.debugLine="Dim strPolocy As String";
_strpolocy = "";
 //BA.debugLineNum = 177;BA.debugLine="Log(\"After jdownload\")";
parent.__c.LogImpl("66619172","After jdownload",0);
 //BA.debugLineNum = 178;BA.debugLine="strwww = Main.Server & \"/api/StockItems/SplitStoc";
_strwww = parent._main._server /*String*/ +"/api/StockItems/SplitStockQty?StockID="+parent._txtscan.getText()+"&Qty="+parent._txtenterqty.getText()+"&User="+parent._main._userlogin /*String*/ +"&Printer="+parent._inputtemplate._text /*String*/ ;
 //BA.debugLineNum = 182;BA.debugLine="j.PostString( strwww,data)";
_j._poststring /*String*/ (_strwww,_data);
 //BA.debugLineNum = 184;BA.debugLine="J.GetRequest.SetHeader(\"Authorization\",\"Bearer \"";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+parent._main._token /*String*/ );
 //BA.debugLineNum = 185;BA.debugLine="j.GetRequest.SetContentType(\"application/json\")";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 189;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 12;
return;
case 12:
//C
this.state = 5;
_j = (b4a.SapyLiveSystem.httpjob) result[0];
;
 //BA.debugLineNum = 190;BA.debugLine="If j.Success Then";
if (true) break;

case 5:
//if
this.state = 10;
if (_j._success /*boolean*/ ) { 
this.state = 7;
}else {
this.state = 9;
}if (true) break;

case 7:
//C
this.state = 10;
 //BA.debugLineNum = 191;BA.debugLine="Log(j.GetString)";
parent.__c.LogImpl("66619186",_j._getstring /*String*/ (),0);
 //BA.debugLineNum = 192;BA.debugLine="ToastMessageShow(\"Successful\",True)";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Successful"),parent.__c.True);
 //BA.debugLineNum = 193;BA.debugLine="txtEnterQty.Text = \"\"";
parent._txtenterqty.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 194;BA.debugLine="lblCode.Text = \"\"";
parent._lblcode.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 195;BA.debugLine="lblDesc.Text = \"\"";
parent._lbldesc.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 196;BA.debugLine="lblOrginalQty.Text = \"\"";
parent._lblorginalqty.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 197;BA.debugLine="lblCurrentQty.Text = \"\"";
parent._lblcurrentqty.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 198;BA.debugLine="txtEnterQty.Text = \"\"";
parent._txtenterqty.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 199;BA.debugLine="lblRemainingQty.Text = \"\"";
parent._lblremainingqty.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 200;BA.debugLine="txtScan.Text=\"\"";
parent._txtscan.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 201;BA.debugLine="txtScan.RequestFocus";
parent._txtscan.RequestFocus();
 if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 204;BA.debugLine="ToastMessageShow(\"Unsuccessful check that period";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Unsuccessful check that period in Sage is open "),parent.__c.True);
 if (true) break;

case 10:
//C
this.state = -1;
;
 //BA.debugLineNum = 209;BA.debugLine="j.Release";
_j._release /*String*/ ();
 //BA.debugLineNum = 211;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(int _result) throws Exception{
}
public void  _jobdone(b4a.SapyLiveSystem.httpjob _j) throws Exception{
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Private lblCode As Label";
_lblcode = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private lblCurrentQty As Label";
_lblcurrentqty = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private lblDesc As Label";
_lbldesc = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private lblOrginalQty As Label";
_lblorginalqty = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private lblRemainingQty As Label";
_lblremainingqty = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private txtEnterQty As EditText";
_txtenterqty = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private txtScan As EditText";
_txtscan = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private btnReturn As Button";
_btnreturn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private btnSubmit As Button";
_btnsubmit = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private dialog As B4XDialog";
_dialog = new b4a.SapyLiveSystem.b4xdialog();
 //BA.debugLineNum = 14;BA.debugLine="Private InputTemplate As B4XInputTemplate";
_inputtemplate = new b4a.SapyLiveSystem.b4xinputtemplate();
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public String  _txtenterqty_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Private Sub txtEnterQty_TextChanged (Old As String";
 //BA.debugLineNum = 111;BA.debugLine="Try";
try { //BA.debugLineNum = 112;BA.debugLine="If txtEnterQty.Text =\"\" Then";
if ((_txtenterqty.getText()).equals("")) { 
 //BA.debugLineNum = 113;BA.debugLine="lblRemainingQty.Text=  lblOrginalQty.Text";
_lblremainingqty.setText(BA.ObjectToCharSequence(_lblorginalqty.getText()));
 //BA.debugLineNum = 114;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 117;BA.debugLine="lblRemainingQty.Text = lblCurrentQty.Text - txtE";
_lblremainingqty.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(_lblcurrentqty.getText()))-(double)(Double.parseDouble(_txtenterqty.getText()))));
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 120;BA.debugLine="Log(LastException)";
__c.LogImpl("66488074",BA.ObjectToString(__c.LastException(ba)),0);
 };
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return "";
}
public void  _txtscan_enterpressed() throws Exception{
ResumableSub_txtScan_EnterPressed rsub = new ResumableSub_txtScan_EnterPressed(this);
rsub.resume(ba, null);
}
public static class ResumableSub_txtScan_EnterPressed extends BA.ResumableSub {
public ResumableSub_txtScan_EnterPressed(b4a.SapyLiveSystem.drawrawmaterial parent) {
this.parent = parent;
}
b4a.SapyLiveSystem.drawrawmaterial parent;
b4a.SapyLiveSystem.httpjob _j = null;
String _k = "";
String _downloadstring = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.Map _jroot = null;
String _consumed = "";
String _rowno = "";
String _datein = "";
String _notes = "";
int _packingslipid = 0;
String _orderid = "";
String _exportedtoaccounting = "";
String _itemcode = "";
String _dateout = "";
String _createtrucksheet = "";
int _sellingpriceexvatprice = 0;
String _freightcostfor = "";
String _stockcheckedforcount = "";
String _warehousecode = "";
String _tosendtoaccounting = "";
int _originalqty = 0;
int _previosqty = 0;
String _consolodatestock = "";
int _id = 0;
String _invoiceno = "";
String _salesorderno = "";
String _reservedforstock = "";
int _stocklink = 0;
String _batchno = "";
String _grnno = "";
int _qty = 0;
String _pdescription = "";
String _customerorsupplierdesc = "";
String _binno = "";

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
 //BA.debugLineNum = 34;BA.debugLine="Dim j As HttpJob";
_j = new b4a.SapyLiveSystem.httpjob();
 //BA.debugLineNum = 37;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 10;
this.catchState = 9;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 9;
 //BA.debugLineNum = 44;BA.debugLine="j.Initialize(txtScan.Text, Me)";
_j._initialize /*String*/ (ba,parent._txtscan.getText(),parent);
 //BA.debugLineNum = 45;BA.debugLine="Dim k As String";
_k = "";
 //BA.debugLineNum = 48;BA.debugLine="Dim downloadstring As String = Main.Server & \"/a";
_downloadstring = parent._main._server /*String*/ +"/api/StockItems/"+parent._txtscan.getText();
 //BA.debugLineNum = 51;BA.debugLine="Log(downloadstring)";
parent.__c.LogImpl("66422546",_downloadstring,0);
 //BA.debugLineNum = 52;BA.debugLine="j.Download( downloadstring)";
_j._download /*String*/ (_downloadstring);
 //BA.debugLineNum = 54;BA.debugLine="J.GetRequest.SetHeader(\"Authorization\",\"Bearer \"";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+parent._main._token /*String*/ );
 //BA.debugLineNum = 56;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 11;
return;
case 11:
//C
this.state = 4;
_j = (b4a.SapyLiveSystem.httpjob) result[0];
;
 //BA.debugLineNum = 57;BA.debugLine="If j.Success Then";
if (true) break;

case 4:
//if
this.state = 7;
if (_j._success /*boolean*/ ) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 58;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 59;BA.debugLine="parser.Initialize(j.GetString)";
_parser.Initialize(_j._getstring /*String*/ ());
 //BA.debugLineNum = 60;BA.debugLine="Dim jRoot As Map = parser.NextObject";
_jroot = new anywheresoftware.b4a.objects.collections.Map();
_jroot = _parser.NextObject();
 //BA.debugLineNum = 61;BA.debugLine="Dim consumed As String = jRoot.Get(\"consumed\")";
_consumed = BA.ObjectToString(_jroot.Get((Object)("consumed")));
 //BA.debugLineNum = 62;BA.debugLine="Dim rowNo As String = jRoot.Get(\"rowNo\")";
_rowno = BA.ObjectToString(_jroot.Get((Object)("rowNo")));
 //BA.debugLineNum = 63;BA.debugLine="Dim dateIn As String = jRoot.Get(\"dateIn\")";
_datein = BA.ObjectToString(_jroot.Get((Object)("dateIn")));
 //BA.debugLineNum = 64;BA.debugLine="Dim notes As String = jRoot.Get(\"notes\")";
_notes = BA.ObjectToString(_jroot.Get((Object)("notes")));
 //BA.debugLineNum = 65;BA.debugLine="Dim packingSlipId As Int = jRoot.Get(\"packingSl";
_packingslipid = (int)(BA.ObjectToNumber(_jroot.Get((Object)("packingSlipId"))));
 //BA.debugLineNum = 66;BA.debugLine="Dim orderId As String = jRoot.Get(\"orderId\")";
_orderid = BA.ObjectToString(_jroot.Get((Object)("orderId")));
 //BA.debugLineNum = 67;BA.debugLine="Dim exportedToAccounting As String = jRoot.Get(";
_exportedtoaccounting = BA.ObjectToString(_jroot.Get((Object)("exportedToAccounting")));
 //BA.debugLineNum = 68;BA.debugLine="Dim itemCode As String = jRoot.Get(\"itemCode\")";
_itemcode = BA.ObjectToString(_jroot.Get((Object)("itemCode")));
 //BA.debugLineNum = 69;BA.debugLine="Dim dateOut As String = jRoot.Get(\"dateOut\")";
_dateout = BA.ObjectToString(_jroot.Get((Object)("dateOut")));
 //BA.debugLineNum = 70;BA.debugLine="Dim createTruckSheet As String = jRoot.Get(\"cre";
_createtrucksheet = BA.ObjectToString(_jroot.Get((Object)("createTruckSheet")));
 //BA.debugLineNum = 71;BA.debugLine="Dim sellingPriceExVatPrice As Int = jRoot.Get(\"";
_sellingpriceexvatprice = (int)(BA.ObjectToNumber(_jroot.Get((Object)("sellingPriceExVatPrice"))));
 //BA.debugLineNum = 72;BA.debugLine="Dim freightCostFor As String = jRoot.Get(\"freig";
_freightcostfor = BA.ObjectToString(_jroot.Get((Object)("freightCostFor")));
 //BA.debugLineNum = 73;BA.debugLine="Dim stockCheckedForCount As String = jRoot.Get(";
_stockcheckedforcount = BA.ObjectToString(_jroot.Get((Object)("stockCheckedForCount")));
 //BA.debugLineNum = 74;BA.debugLine="Dim warehouseCode As String = jRoot.Get(\"wareho";
_warehousecode = BA.ObjectToString(_jroot.Get((Object)("warehouseCode")));
 //BA.debugLineNum = 75;BA.debugLine="Dim toSendToAccounting As String = jRoot.Get(\"t";
_tosendtoaccounting = BA.ObjectToString(_jroot.Get((Object)("toSendToAccounting")));
 //BA.debugLineNum = 76;BA.debugLine="Dim originalQty As Int = jRoot.Get(\"originalQty";
_originalqty = (int)(BA.ObjectToNumber(_jroot.Get((Object)("originalQty"))));
 //BA.debugLineNum = 77;BA.debugLine="Dim previosQty As Int = jRoot.Get(\"previosQty\")";
_previosqty = (int)(BA.ObjectToNumber(_jroot.Get((Object)("previosQty"))));
 //BA.debugLineNum = 78;BA.debugLine="Dim consolodateStock As String = jRoot.Get(\"con";
_consolodatestock = BA.ObjectToString(_jroot.Get((Object)("consolodateStock")));
 //BA.debugLineNum = 79;BA.debugLine="Dim id As Int = jRoot.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_jroot.Get((Object)("id"))));
 //BA.debugLineNum = 80;BA.debugLine="Dim invoiceNo As String = jRoot.Get(\"invoiceNo\"";
_invoiceno = BA.ObjectToString(_jroot.Get((Object)("invoiceNo")));
 //BA.debugLineNum = 81;BA.debugLine="Dim salesOrderNo As String = jRoot.Get(\"salesOr";
_salesorderno = BA.ObjectToString(_jroot.Get((Object)("salesOrderNo")));
 //BA.debugLineNum = 82;BA.debugLine="Dim reservedForStock As String = jRoot.Get(\"res";
_reservedforstock = BA.ObjectToString(_jroot.Get((Object)("reservedForStock")));
 //BA.debugLineNum = 83;BA.debugLine="Dim stockLink As Int = jRoot.Get(\"stockLink\")";
_stocklink = (int)(BA.ObjectToNumber(_jroot.Get((Object)("stockLink"))));
 //BA.debugLineNum = 84;BA.debugLine="Dim batchNo As String = jRoot.Get(\"batchNo\")";
_batchno = BA.ObjectToString(_jroot.Get((Object)("batchNo")));
 //BA.debugLineNum = 85;BA.debugLine="Dim grnNo As String = jRoot.Get(\"grnNo\")";
_grnno = BA.ObjectToString(_jroot.Get((Object)("grnNo")));
 //BA.debugLineNum = 87;BA.debugLine="Dim qty As Int = jRoot.Get(\"qty\")";
_qty = (int)(BA.ObjectToNumber(_jroot.Get((Object)("qty"))));
 //BA.debugLineNum = 89;BA.debugLine="Dim pDescription As String = jRoot.Get(\"pDescri";
_pdescription = BA.ObjectToString(_jroot.Get((Object)("pDescription")));
 //BA.debugLineNum = 90;BA.debugLine="Dim customerOrSupplierDesc As String = jRoot.Ge";
_customerorsupplierdesc = BA.ObjectToString(_jroot.Get((Object)("customerOrSupplierDesc")));
 //BA.debugLineNum = 91;BA.debugLine="Dim binNo As String = jRoot.Get(\"binNo\")";
_binno = BA.ObjectToString(_jroot.Get((Object)("binNo")));
 //BA.debugLineNum = 93;BA.debugLine="lblCode.Text = itemCode";
parent._lblcode.setText(BA.ObjectToCharSequence(_itemcode));
 //BA.debugLineNum = 94;BA.debugLine="lblDesc.Text = pDescription";
parent._lbldesc.setText(BA.ObjectToCharSequence(_pdescription));
 //BA.debugLineNum = 95;BA.debugLine="lblOrginalQty.Text = originalQty";
parent._lblorginalqty.setText(BA.ObjectToCharSequence(_originalqty));
 //BA.debugLineNum = 96;BA.debugLine="lblCurrentQty.Text = qty";
parent._lblcurrentqty.setText(BA.ObjectToCharSequence(_qty));
 //BA.debugLineNum = 97;BA.debugLine="txtEnterQty.Text = \"\"";
parent._txtenterqty.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 98;BA.debugLine="lblRemainingQty.Text = lblCurrentQty.Text";
parent._lblremainingqty.setText(BA.ObjectToCharSequence(parent._lblcurrentqty.getText()));
 if (true) break;

case 7:
//C
this.state = 10;
;
 //BA.debugLineNum = 102;BA.debugLine="j.Release";
_j._release /*String*/ ();
 if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
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
