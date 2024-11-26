package b4a.SapyLiveSystem;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class linkdispatchplantostock extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.SapyLiveSystem.linkdispatchplantostock");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.SapyLiveSystem.linkdispatchplantostock.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsubmit = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblitemscanned = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtscanitem = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtscanplan = null;
public int _scanningid = 0;
public flm.b4a.ultimatelistview.UltimateListViewWrapper _ulv = null;
public int _dispatchplandetailid = 0;
public int _stocklink = 0;
public anywheresoftware.b4a.objects.LabelWrapper _lblcustomer = null;
public b4a.example.dateutils _dateutils = null;
public b4a.SapyLiveSystem.main _main = null;
public b4a.SapyLiveSystem.starter _starter = null;
public b4a.SapyLiveSystem.b4xpages _b4xpages = null;
public b4a.SapyLiveSystem.b4xcollections _b4xcollections = null;
public b4a.SapyLiveSystem.httputils2service _httputils2service = null;
public b4a.SapyLiveSystem.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 25;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 26;BA.debugLine="Root.LoadLayout(\"DispatchPlanLinking\")";
_root.LoadLayout("DispatchPlanLinking",ba);
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public String  _btnsubmit_click() throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Private Sub btnSubmit_Click";
 //BA.debugLineNum = 34;BA.debugLine="txtScanItem.Enabled = False";
_txtscanitem.setEnabled(__c.False);
 //BA.debugLineNum = 35;BA.debugLine="txtScanPlan.Enabled = True";
_txtscanplan.setEnabled(__c.True);
 //BA.debugLineNum = 36;BA.debugLine="PrepareList";
_preparelist();
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 5;BA.debugLine="Private lblItemScanned As Label";
_lblitemscanned = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private txtScanItem As EditText";
_txtscanitem = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private txtScanPlan As EditText";
_txtscanplan = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private ScanningID As Int";
_scanningid = 0;
 //BA.debugLineNum = 10;BA.debugLine="Private Ulv As UltimateListView";
_ulv = new flm.b4a.ultimatelistview.UltimateListViewWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private DispatchPlanDetailId As Int";
_dispatchplandetailid = 0;
 //BA.debugLineNum = 12;BA.debugLine="Private StockLink As Int";
_stocklink = 0;
 //BA.debugLineNum = 15;BA.debugLine="Private lblCustomer As Label";
_lblcustomer = new anywheresoftware.b4a.objects.LabelWrapper();
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
public String  _populateulv() throws Exception{
int[] _cellwidths = null;
 //BA.debugLineNum = 146;BA.debugLine="Sub PopulateULV";
 //BA.debugLineNum = 147;BA.debugLine="Panel1.RemoveAllViews";
_panel1.RemoveAllViews();
 //BA.debugLineNum = 149;BA.debugLine="Ulv.Initialize(0,0,\"\",\"ULV\")";
_ulv.Initialize(ba,(byte) (0),(int) (0),"","ULV");
 //BA.debugLineNum = 150;BA.debugLine="Ulv.DividerHeight = 3dip";
_ulv.setDividerHeight(__c.DipToCurrent((int) (3)));
 //BA.debugLineNum = 152;BA.debugLine="Ulv.FastScroller(True)";
_ulv.FastScroller(__c.True);
 //BA.debugLineNum = 153;BA.debugLine="Ulv.Color=Colors.Black";
_ulv.setColor(__c.Colors.Black);
 //BA.debugLineNum = 154;BA.debugLine="Ulv.SelectionMode = Ulv.SELECTION_SINGLE";
_ulv.setSelectionMode(_ulv.SELECTION_SINGLE);
 //BA.debugLineNum = 155;BA.debugLine="Ulv.Tag = \"ReceiptHeader\"";
_ulv.setTag((Object)("ReceiptHeader"));
 //BA.debugLineNum = 157;BA.debugLine="Dim cellwidths() As Int = Array As Int(30%x,30%x,";
_cellwidths = new int[]{__c.PerXToCurrent((float) (30),ba),__c.PerXToCurrent((float) (30),ba),__c.PerXToCurrent((float) (13),ba),__c.PerXToCurrent((float) (13),ba),__c.PerXToCurrent((float) (13),ba)};
 //BA.debugLineNum = 159;BA.debugLine="Ulv.AddRowLayout(\"ReceiptHeader\",\"ReceiptHeader_L";
_ulv.AddRowLayout("ReceiptHeader","ReceiptHeader_Layout","ReceiptHeader_filler",__c.DipToCurrent((int) (50)),(byte) (_cellwidths.length),_cellwidths,(int) (0),__c.Colors.White,__c.True);
 //BA.debugLineNum = 161;BA.debugLine="Panel1.AddView(Ulv,0%x,0%y,Panel1.Width-2dip,Pane";
_panel1.AddView((android.view.View)(_ulv.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (0),ba),(int) (_panel1.getWidth()-__c.DipToCurrent((int) (2))),(int) (_panel1.getHeight()-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 164;BA.debugLine="Ulv.BulkAddItems(Main.OrderList.Size,\"ReceiptHead";
_ulv.BulkAddItems(_main._orderlist /*anywheresoftware.b4a.objects.collections.List*/ .getSize(),"ReceiptHeader",(int) (0));
 //BA.debugLineNum = 166;BA.debugLine="Log(\"End popULVProduct\")";
__c.LogImpl("61900564","End popULVProduct",0);
 //BA.debugLineNum = 168;BA.debugLine="End Sub";
return "";
}
public void  _preparelist() throws Exception{
ResumableSub_PrepareList rsub = new ResumableSub_PrepareList(this);
rsub.resume(ba, null);
}
public static class ResumableSub_PrepareList extends BA.ResumableSub {
public ResumableSub_PrepareList(b4a.SapyLiveSystem.linkdispatchplantostock parent) {
this.parent = parent;
}
b4a.SapyLiveSystem.linkdispatchplantostock parent;
b4a.SapyLiveSystem.httpjob _j = null;
String _k = "";
String _downloadstring = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _jroot = null;
anywheresoftware.b4a.objects.collections.Map _coljroot = null;
double _qtytoprocess = 0;
double _scannedqty = 0;
String _frieghtcompany = "";
String _itemcode = "";
String _description = "";
String _orderno = "";
String _usercaptured = "";
String _freightcostfor = "";
int _dispatchplanheaderid = 0;
int _onhandqty = 0;
int _idinvoicelines = 0;
int _id = 0;
String _sapyliveorderno = "";
String _account = "";
String _name = "";
int _stocklink1 = 0;
b4a.SapyLiveSystem.grvstockin._orderinfo _a = null;
String _displaymessagewarning = "";
anywheresoftware.b4a.BA.IterableList group16;
int index16;
int groupLen16;

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
 //BA.debugLineNum = 52;BA.debugLine="Dim j As HttpJob";
_j = new b4a.SapyLiveSystem.httpjob();
 //BA.debugLineNum = 55;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 18;
this.catchState = 17;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 17;
 //BA.debugLineNum = 62;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 63;BA.debugLine="Dim k As String";
_k = "";
 //BA.debugLineNum = 66;BA.debugLine="Dim downloadstring As String = Main.Server & \"/a";
_downloadstring = parent._main._server /*String*/ +"/api/DispatchPlan/header/invoice-mobile/"+parent._txtscanplan.getText();
 //BA.debugLineNum = 69;BA.debugLine="Log(downloadstring)";
parent.__c.LogImpl("61835031",_downloadstring,0);
 //BA.debugLineNum = 70;BA.debugLine="j.Download( downloadstring)";
_j._download /*String*/ (_downloadstring);
 //BA.debugLineNum = 72;BA.debugLine="J.GetRequest.SetHeader(\"Authorization\",\"Bearer \"";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+parent._main._token /*String*/ );
 //BA.debugLineNum = 73;BA.debugLine="Main.OrderList.Initialize";
parent._main._orderlist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 74;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 19;
return;
case 19:
//C
this.state = 4;
_j = (b4a.SapyLiveSystem.httpjob) result[0];
;
 //BA.debugLineNum = 75;BA.debugLine="If j.Success Then";
if (true) break;

case 4:
//if
this.state = 15;
if (_j._success /*boolean*/ ) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 76;BA.debugLine="Log(j.GetString)";
parent.__c.LogImpl("61835038",_j._getstring /*String*/ (),0);
 //BA.debugLineNum = 77;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 79;BA.debugLine="parser.Initialize(j.GetString)";
_parser.Initialize(_j._getstring /*String*/ ());
 //BA.debugLineNum = 80;BA.debugLine="Dim jRoot As List = parser.NextArray";
_jroot = new anywheresoftware.b4a.objects.collections.List();
_jroot = _parser.NextArray();
 //BA.debugLineNum = 82;BA.debugLine="For Each coljRoot As Map In jRoot";
if (true) break;

case 7:
//for
this.state = 14;
_coljroot = new anywheresoftware.b4a.objects.collections.Map();
group16 = _jroot;
index16 = 0;
groupLen16 = group16.getSize();
this.state = 20;
if (true) break;

case 20:
//C
this.state = 14;
if (index16 < groupLen16) {
this.state = 9;
_coljroot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group16.Get(index16)));}
if (true) break;

case 21:
//C
this.state = 20;
index16++;
if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 83;BA.debugLine="Dim qtyToProcess As Double = coljRoot.Get(\"qty";
_qtytoprocess = (double)(BA.ObjectToNumber(_coljroot.Get((Object)("qtyToProcess"))));
 //BA.debugLineNum = 84;BA.debugLine="Dim scannedQty As Double = coljRoot.Get(\"scann";
_scannedqty = (double)(BA.ObjectToNumber(_coljroot.Get((Object)("scannedQtyActual"))));
 //BA.debugLineNum = 85;BA.debugLine="Dim frieghtCompany As String = coljRoot.Get(\"f";
_frieghtcompany = BA.ObjectToString(_coljroot.Get((Object)("frieghtCompany")));
 //BA.debugLineNum = 86;BA.debugLine="Dim itemCode As String = coljRoot.Get(\"itemCod";
_itemcode = BA.ObjectToString(_coljroot.Get((Object)("itemCode")));
 //BA.debugLineNum = 87;BA.debugLine="Dim description As String = coljRoot.Get(\"desc";
_description = BA.ObjectToString(_coljroot.Get((Object)("description")));
 //BA.debugLineNum = 88;BA.debugLine="Dim orderNo As String = coljRoot.Get(\"orderNum";
_orderno = BA.ObjectToString(_coljroot.Get((Object)("orderNum")));
 //BA.debugLineNum = 89;BA.debugLine="Dim userCaptured As String = coljRoot.Get(\"use";
_usercaptured = BA.ObjectToString(_coljroot.Get((Object)("userCaptured")));
 //BA.debugLineNum = 90;BA.debugLine="Dim freightCostFor As String = coljRoot.Get(\"f";
_freightcostfor = BA.ObjectToString(_coljroot.Get((Object)("freightCostFor")));
 //BA.debugLineNum = 91;BA.debugLine="Dim dispatchPlanHeaderId As Int = coljRoot.Get";
_dispatchplanheaderid = (int)(BA.ObjectToNumber(_coljroot.Get((Object)("dispatchPlanHeaderId"))));
 //BA.debugLineNum = 92;BA.debugLine="Dim onHandQty As Int = coljRoot.Get(\"onHandQty";
_onhandqty = (int)(BA.ObjectToNumber(_coljroot.Get((Object)("onHandQty"))));
 //BA.debugLineNum = 93;BA.debugLine="Dim idInvoiceLines As Int = coljRoot.Get(\"idIn";
_idinvoicelines = (int)(BA.ObjectToNumber(_coljroot.Get((Object)("idInvoiceLines"))));
 //BA.debugLineNum = 94;BA.debugLine="Dim id As Int = coljRoot.Get(\"id\")";
_id = (int)(BA.ObjectToNumber(_coljroot.Get((Object)("id"))));
 //BA.debugLineNum = 95;BA.debugLine="Dim sapyLiveOrderNo As String = coljRoot.Get(\"";
_sapyliveorderno = BA.ObjectToString(_coljroot.Get((Object)("sapyLiveOrderNo")));
 //BA.debugLineNum = 96;BA.debugLine="Dim account As String = coljRoot.Get(\"account\"";
_account = BA.ObjectToString(_coljroot.Get((Object)("account")));
 //BA.debugLineNum = 97;BA.debugLine="Dim name As String = coljRoot.Get(\"name\")";
_name = BA.ObjectToString(_coljroot.Get((Object)("name")));
 //BA.debugLineNum = 98;BA.debugLine="Dim StockLink1 As Int = coljRoot.Get(\"stockLin";
_stocklink1 = (int)(BA.ObjectToNumber(_coljroot.Get((Object)("stockLink"))));
 //BA.debugLineNum = 100;BA.debugLine="Dim a As OrderInfo";
_a = new b4a.SapyLiveSystem.grvstockin._orderinfo();
 //BA.debugLineNum = 101;BA.debugLine="a.qtyToProcess = qtyToProcess";
_a.qtyToProcess /*double*/  = _qtytoprocess;
 //BA.debugLineNum = 102;BA.debugLine="a.scannedQty = scannedQty";
_a.scannedQty /*double*/  = _scannedqty;
 //BA.debugLineNum = 103;BA.debugLine="a.frieghtCompany = frieghtCompany";
_a.frieghtCompany /*String*/  = _frieghtcompany;
 //BA.debugLineNum = 104;BA.debugLine="a.freightCostFor = freightCostFor";
_a.freightCostFor /*String*/  = _freightcostfor;
 //BA.debugLineNum = 105;BA.debugLine="a.id = id";
_a.id /*int*/  = _id;
 //BA.debugLineNum = 106;BA.debugLine="a.itemCode = itemCode";
_a.itemCode /*String*/  = _itemcode;
 //BA.debugLineNum = 107;BA.debugLine="a.description = description";
_a.description /*String*/  = _description;
 //BA.debugLineNum = 108;BA.debugLine="a.orderNo = orderNo";
_a.orderNo /*String*/  = _orderno;
 //BA.debugLineNum = 109;BA.debugLine="a.userCaptured = userCaptured";
_a.userCaptured /*String*/  = _usercaptured;
 //BA.debugLineNum = 110;BA.debugLine="a.dispatchPlanHeaderId = dispatchPlanHeaderId";
_a.dispatchPlanHeaderId /*int*/  = _dispatchplanheaderid;
 //BA.debugLineNum = 111;BA.debugLine="a.onHandQty = onHandQty";
_a.onHandQty /*double*/  = _onhandqty;
 //BA.debugLineNum = 112;BA.debugLine="a.idInvoiceLines = idInvoiceLines";
_a.idInvoiceLines /*int*/  = _idinvoicelines;
 //BA.debugLineNum = 113;BA.debugLine="a.sapyLiveOrderNo = sapyLiveOrderNo";
_a.sapyLiveOrderNo /*String*/  = _sapyliveorderno;
 //BA.debugLineNum = 114;BA.debugLine="a.name = name";
_a.name /*String*/  = _name;
 //BA.debugLineNum = 115;BA.debugLine="a.account = account";
_a.account /*String*/  = _account;
 //BA.debugLineNum = 116;BA.debugLine="a.StockLink = StockLink1";
_a.StockLink /*int*/  = _stocklink1;
 //BA.debugLineNum = 118;BA.debugLine="Main.OrderList.Add(a)";
parent._main._orderlist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_a));
 //BA.debugLineNum = 121;BA.debugLine="If scannedQty> qtyToProcess Then";
if (true) break;

case 10:
//if
this.state = 13;
if (_scannedqty>_qtytoprocess) { 
this.state = 12;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 122;BA.debugLine="displaymessagewarning = True";
_displaymessagewarning = BA.ObjectToString(parent.__c.True);
 if (true) break;

case 13:
//C
this.state = 21;
;
 if (true) break;
if (true) break;

case 14:
//C
this.state = 15;
;
 if (true) break;

case 15:
//C
this.state = 18;
;
 //BA.debugLineNum = 135;BA.debugLine="j.Release";
_j._release /*String*/ ();
 if (true) break;

case 17:
//C
this.state = 18;
this.catchState = 0;
 //BA.debugLineNum = 137;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("61835099",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 18:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 142;BA.debugLine="PopulateULV";
parent._populateulv();
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
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
public String  _receiptheader_filler(long _rowid,String _layoutname,anywheresoftware.b4a.objects.PanelWrapper _cellpanel,byte _cellindex,int _position) throws Exception{
b4a.SapyLiveSystem.grvstockin._orderinfo _x = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
 //BA.debugLineNum = 227;BA.debugLine="Sub ReceiptHeader_filler(RowID As Long, LayoutName";
 //BA.debugLineNum = 231;BA.debugLine="Dim x As OrderInfo =Main.OrderList.Get(RowID)";
_x = (b4a.SapyLiveSystem.grvstockin._orderinfo)(_main._orderlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_rowid)));
 //BA.debugLineNum = 233;BA.debugLine="Select CellIndex";
switch (BA.switchObjectToInt(_cellindex,(byte) (0),(byte) (1),(byte) (2),(byte) (3),(byte) (4),(byte) (5))) {
case 0: {
 //BA.debugLineNum = 237;BA.debugLine="Dim lbl As Label = CellPanel.GetView(0)";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_cellpanel.GetView((int) (0)).getObject()));
 //BA.debugLineNum = 238;BA.debugLine="lbl.TextColor = Colors.Black";
_lbl.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 239;BA.debugLine="lbl.Text=x.account";
_lbl.setText(BA.ObjectToCharSequence(_x.account /*String*/ ));
 break; }
case 1: {
 //BA.debugLineNum = 245;BA.debugLine="Try";
try { //BA.debugLineNum = 246;BA.debugLine="Dim lbl As Label = CellPanel.GetView(0)";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_cellpanel.GetView((int) (0)).getObject()));
 //BA.debugLineNum = 247;BA.debugLine="lbl.TextColor = Colors.Black";
_lbl.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 248;BA.debugLine="lbl.Text=x.itemCode";
_lbl.setText(BA.ObjectToCharSequence(_x.itemCode /*String*/ ));
 } 
       catch (Exception e13) {
			ba.setLastException(e13); //BA.debugLineNum = 250;BA.debugLine="Log(\"Error : \" & LastException)";
__c.LogImpl("62031639","Error : "+BA.ObjectToString(__c.LastException(ba)),0);
 };
 break; }
case 2: {
 //BA.debugLineNum = 257;BA.debugLine="Dim lbl As Label = CellPanel.GetView(0)";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_cellpanel.GetView((int) (0)).getObject()));
 //BA.debugLineNum = 258;BA.debugLine="lbl.TextColor = Colors.Black";
_lbl.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 259;BA.debugLine="lbl.Text=x.qtyToProcess";
_lbl.setText(BA.ObjectToCharSequence(_x.qtyToProcess /*double*/ ));
 break; }
case 3: {
 //BA.debugLineNum = 261;BA.debugLine="Dim lbl As Label = CellPanel.GetView(0)";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_cellpanel.GetView((int) (0)).getObject()));
 //BA.debugLineNum = 262;BA.debugLine="If x.qtyToProcess> x.scannedQty  Then";
if (_x.qtyToProcess /*double*/ >_x.scannedQty /*double*/ ) { 
 //BA.debugLineNum = 264;BA.debugLine="lbl.TextColor = Colors.Green";
_lbl.setTextColor(__c.Colors.Green);
 }else {
 //BA.debugLineNum = 266;BA.debugLine="lbl.TextColor = Colors.Red";
_lbl.setTextColor(__c.Colors.Red);
 };
 //BA.debugLineNum = 268;BA.debugLine="lbl.Text=x.scannedQty";
_lbl.setText(BA.ObjectToCharSequence(_x.scannedQty /*double*/ ));
 break; }
case 4: {
 //BA.debugLineNum = 271;BA.debugLine="Dim lbl As Label = CellPanel.GetView(0)";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_cellpanel.GetView((int) (0)).getObject()));
 //BA.debugLineNum = 272;BA.debugLine="lbl.TextColor = Colors.Blue";
_lbl.setTextColor(__c.Colors.Blue);
 //BA.debugLineNum = 273;BA.debugLine="lbl.Text=x.onHandQty";
_lbl.setText(BA.ObjectToCharSequence(_x.onHandQty /*double*/ ));
 break; }
case 5: {
 //BA.debugLineNum = 276;BA.debugLine="Dim lbl As Label = CellPanel.GetView(0)";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_cellpanel.GetView((int) (0)).getObject()));
 //BA.debugLineNum = 277;BA.debugLine="lbl.TextColor = Colors.Blue";
_lbl.setTextColor(__c.Colors.Blue);
 //BA.debugLineNum = 278;BA.debugLine="lbl.Text=x.onHandQty";
_lbl.setText(BA.ObjectToCharSequence(_x.onHandQty /*double*/ ));
 break; }
}
;
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return "";
}
public String  _receiptheader_layout(String _layoutname,anywheresoftware.b4a.objects.PanelWrapper _cellpanel,byte _cellindex) throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
 //BA.debugLineNum = 170;BA.debugLine="Sub ReceiptHeader_Layout(LayoutName As String, Cel";
 //BA.debugLineNum = 171;BA.debugLine="Select CellIndex";
switch (BA.switchObjectToInt(_cellindex,(byte) (0),(byte) (1),(byte) (2),(byte) (3),(byte) (4),(byte) (5))) {
case 0: {
 //BA.debugLineNum = 175;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 176;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
 //BA.debugLineNum = 177;BA.debugLine="lbl.Gravity = Gravity.CENTER_VERTICAL";
_lbl.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 178;BA.debugLine="lbl.TextColor =  Colors.Black";
_lbl.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 179;BA.debugLine="lbl.TextSize = 10";
_lbl.setTextSize((float) (10));
 //BA.debugLineNum = 181;BA.debugLine="CellPanel.AddView(lbl, 5dip, 5dip, CellPanel.Wi";
_cellpanel.AddView((android.view.View)(_lbl.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5)),(int) (_cellpanel.getWidth()-__c.DipToCurrent((int) (10))),(int) (_cellpanel.getHeight()-__c.DipToCurrent((int) (2))));
 break; }
case 1: {
 //BA.debugLineNum = 183;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 184;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
 //BA.debugLineNum = 185;BA.debugLine="lbl.Gravity = Gravity.CENTER_VERTICAL";
_lbl.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 186;BA.debugLine="lbl.TextColor =  Colors.Black";
_lbl.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 187;BA.debugLine="lbl.TextSize = 10";
_lbl.setTextSize((float) (10));
 //BA.debugLineNum = 189;BA.debugLine="CellPanel.AddView(lbl, 5dip, 5dip, CellPanel.Wi";
_cellpanel.AddView((android.view.View)(_lbl.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5)),(int) (_cellpanel.getWidth()-__c.DipToCurrent((int) (10))),(int) (_cellpanel.getHeight()-__c.DipToCurrent((int) (2))));
 break; }
case 2: {
 //BA.debugLineNum = 192;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 193;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
 //BA.debugLineNum = 194;BA.debugLine="lbl.Gravity = Gravity.CENTER_VERTICAL";
_lbl.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 195;BA.debugLine="lbl.TextColor =  Colors.Black";
_lbl.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 196;BA.debugLine="lbl.TextSize = 10";
_lbl.setTextSize((float) (10));
 //BA.debugLineNum = 197;BA.debugLine="CellPanel.AddView(lbl, 5dip, 5dip, CellPanel.Wi";
_cellpanel.AddView((android.view.View)(_lbl.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5)),(int) (_cellpanel.getWidth()-__c.DipToCurrent((int) (10))),(int) (_cellpanel.getHeight()-__c.DipToCurrent((int) (2))));
 break; }
case 3: {
 //BA.debugLineNum = 200;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 201;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
 //BA.debugLineNum = 202;BA.debugLine="lbl.Gravity = Gravity.CENTER_VERTICAL";
_lbl.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 203;BA.debugLine="lbl.TextColor =  Colors.Black";
_lbl.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 204;BA.debugLine="lbl.TextSize = 10";
_lbl.setTextSize((float) (10));
 //BA.debugLineNum = 205;BA.debugLine="CellPanel.AddView(lbl, 5dip, 5dip, CellPanel.Wi";
_cellpanel.AddView((android.view.View)(_lbl.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5)),(int) (_cellpanel.getWidth()-__c.DipToCurrent((int) (10))),(int) (_cellpanel.getHeight()-__c.DipToCurrent((int) (2))));
 break; }
case 4: {
 //BA.debugLineNum = 208;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 209;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
 //BA.debugLineNum = 210;BA.debugLine="lbl.Gravity = Gravity.CENTER_VERTICAL";
_lbl.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 211;BA.debugLine="lbl.TextColor =  Colors.Black";
_lbl.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 212;BA.debugLine="lbl.TextSize = 10";
_lbl.setTextSize((float) (10));
 //BA.debugLineNum = 213;BA.debugLine="CellPanel.AddView(lbl, 5dip, 5dip, CellPanel.Wi";
_cellpanel.AddView((android.view.View)(_lbl.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5)),(int) (_cellpanel.getWidth()-__c.DipToCurrent((int) (10))),(int) (_cellpanel.getHeight()-__c.DipToCurrent((int) (2))));
 break; }
case 5: {
 //BA.debugLineNum = 215;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 216;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
 //BA.debugLineNum = 217;BA.debugLine="lbl.Gravity = Gravity.CENTER_VERTICAL";
_lbl.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 218;BA.debugLine="lbl.TextColor =  Colors.Black";
_lbl.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 219;BA.debugLine="lbl.TextSize = 10";
_lbl.setTextSize((float) (10));
 //BA.debugLineNum = 220;BA.debugLine="CellPanel.AddView(lbl, 5dip, 5dip, CellPanel.Wi";
_cellpanel.AddView((android.view.View)(_lbl.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5)),(int) (_cellpanel.getWidth()-__c.DipToCurrent((int) (10))),(int) (_cellpanel.getHeight()-__c.DipToCurrent((int) (2))));
 break; }
}
;
 //BA.debugLineNum = 225;BA.debugLine="End Sub";
return "";
}
public void  _txtscanitem_enterpressed() throws Exception{
ResumableSub_txtScanItem_EnterPressed rsub = new ResumableSub_txtScanItem_EnterPressed(this);
rsub.resume(ba, null);
}
public static class ResumableSub_txtScanItem_EnterPressed extends BA.ResumableSub {
public ResumableSub_txtScanItem_EnterPressed(b4a.SapyLiveSystem.linkdispatchplantostock parent) {
this.parent = parent;
}
b4a.SapyLiveSystem.linkdispatchplantostock parent;
b4a.SapyLiveSystem.httpjob _j = null;
String _k = "";
String _downloadstring = "";

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
 //BA.debugLineNum = 301;BA.debugLine="Dim j As HttpJob";
_j = new b4a.SapyLiveSystem.httpjob();
 //BA.debugLineNum = 304;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 14;
this.catchState = 13;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 13;
 //BA.debugLineNum = 311;BA.debugLine="j.Initialize(txtScanItem.Text, Me)";
_j._initialize /*String*/ (ba,parent._txtscanitem.getText(),parent);
 //BA.debugLineNum = 312;BA.debugLine="Dim k As String";
_k = "";
 //BA.debugLineNum = 315;BA.debugLine="Dim downloadstring As String = Main.Server & \"/a";
_downloadstring = parent._main._server /*String*/ +"/api/DispatchPlan/header/LinkStock-mobile?DispatchPlanDetailId="+BA.NumberToString(parent._dispatchplandetailid)+"&StockLink="+BA.NumberToString(parent._stocklink)+"&StockId="+parent._txtscanitem.getText();
 //BA.debugLineNum = 318;BA.debugLine="Log(downloadstring)";
parent.__c.LogImpl("62097175",_downloadstring,0);
 //BA.debugLineNum = 319;BA.debugLine="j.PostString( downloadstring,\"\")";
_j._poststring /*String*/ (_downloadstring,"");
 //BA.debugLineNum = 321;BA.debugLine="J.GetRequest.SetHeader(\"Authorization\",\"Bearer \"";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+parent._main._token /*String*/ );
 //BA.debugLineNum = 323;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 15;
return;
case 15:
//C
this.state = 4;
_j = (b4a.SapyLiveSystem.httpjob) result[0];
;
 //BA.debugLineNum = 324;BA.debugLine="If j.Success Then";
if (true) break;

case 4:
//if
this.state = 11;
if (_j._success /*boolean*/ ) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 326;BA.debugLine="Log(j.GetString)";
parent.__c.LogImpl("62097183",_j._getstring /*String*/ (),0);
 //BA.debugLineNum = 327;BA.debugLine="If j.GetString = \"false\" Then";
if (true) break;

case 7:
//if
this.state = 10;
if ((_j._getstring /*String*/ ()).equals("false")) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 //BA.debugLineNum = 328;BA.debugLine="Msgbox(\"Not updated invalid product\",True)";
parent.__c.Msgbox(BA.ObjectToCharSequence("Not updated invalid product"),BA.ObjectToCharSequence(parent.__c.True),ba);
 if (true) break;

case 10:
//C
this.state = 11;
;
 if (true) break;

case 11:
//C
this.state = 14;
;
 if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
 if (true) break;
if (true) break;

case 14:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 338;BA.debugLine="PrepareList";
parent._preparelist();
 //BA.debugLineNum = 339;BA.debugLine="txtScanItem.Text = \"\"";
parent._txtscanitem.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 340;BA.debugLine="txtScanItem.RequestFocus";
parent._txtscanitem.RequestFocus();
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
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
public String  _txtscanplan_enterpressed() throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Private Sub txtScanPlan_EnterPressed";
 //BA.debugLineNum = 42;BA.debugLine="PrepareList";
_preparelist();
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public String  _ulv_cellclick(long _rowid,byte _cellindex,int _position,anywheresoftware.b4a.objects.PanelWrapper _clickedpanel) throws Exception{
 //BA.debugLineNum = 347;BA.debugLine="Sub ulv_CellClick(RowID As Long, CellIndex As Byte";
 //BA.debugLineNum = 349;BA.debugLine="If CellIndex = 0 Then";
if (_cellindex==0) { 
 //BA.debugLineNum = 350;BA.debugLine="Main.x = Main.OrderList.Get(RowID)";
_main._x /*b4a.SapyLiveSystem.grvstockin._orderinfo*/  = (b4a.SapyLiveSystem.grvstockin._orderinfo)(_main._orderlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_rowid)));
 //BA.debugLineNum = 351;BA.debugLine="lblItemScanned.Text = 	Main.x.itemCode";
_lblitemscanned.setText(BA.ObjectToCharSequence(_main._x /*b4a.SapyLiveSystem.grvstockin._orderinfo*/ .itemCode /*String*/ ));
 //BA.debugLineNum = 352;BA.debugLine="lblCustomer.Text	 = Main.x.account";
_lblcustomer.setText(BA.ObjectToCharSequence(_main._x /*b4a.SapyLiveSystem.grvstockin._orderinfo*/ .account /*String*/ ));
 //BA.debugLineNum = 353;BA.debugLine="DispatchPlanDetailId = Main.x.id";
_dispatchplandetailid = _main._x /*b4a.SapyLiveSystem.grvstockin._orderinfo*/ .id /*int*/ ;
 //BA.debugLineNum = 354;BA.debugLine="StockLink= Main.x.StockLink";
_stocklink = _main._x /*b4a.SapyLiveSystem.grvstockin._orderinfo*/ .StockLink /*int*/ ;
 };
 //BA.debugLineNum = 358;BA.debugLine="If CellIndex > 1 Then";
if (_cellindex>1) { 
 //BA.debugLineNum = 359;BA.debugLine="B4XPages.ShowPage(\"DispatchPlanDetails\")";
_b4xpages._showpage /*String*/ (ba,"DispatchPlanDetails");
 };
 //BA.debugLineNum = 364;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
