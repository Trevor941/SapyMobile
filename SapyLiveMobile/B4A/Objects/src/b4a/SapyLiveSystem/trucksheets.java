package b4a.SapyLiveSystem;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class trucksheets extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.SapyLiveSystem.trucksheets");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.SapyLiveSystem.trucksheets.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnclear = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtinvoice = null;
public flm.b4a.ultimatelistview.UltimateListViewWrapper _ulv = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txttrucksheet = null;
public b4a.example.dateutils _dateutils = null;
public b4a.SapyLiveSystem.main _main = null;
public b4a.SapyLiveSystem.starter _starter = null;
public b4a.SapyLiveSystem.b4xpages _b4xpages = null;
public b4a.SapyLiveSystem.b4xcollections _b4xcollections = null;
public b4a.SapyLiveSystem.httputils2service _httputils2service = null;
public b4a.SapyLiveSystem.xuiviewsutils _xuiviewsutils = null;
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _addtotrucksheet() throws Exception{
ResumableSub_AddToTruckSheet rsub = new ResumableSub_AddToTruckSheet(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_AddToTruckSheet extends BA.ResumableSub {
public ResumableSub_AddToTruckSheet(b4a.SapyLiveSystem.trucksheets parent) {
this.parent = parent;
}
b4a.SapyLiveSystem.trucksheets parent;
b4a.SapyLiveSystem.httpjob _j = null;
String _k = "";
String _downloadstring = "";

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
try {

        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 64;BA.debugLine="Dim j As HttpJob";
_j = new b4a.SapyLiveSystem.httpjob();
 //BA.debugLineNum = 65;BA.debugLine="Try";
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
 //BA.debugLineNum = 66;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 67;BA.debugLine="Dim k As String";
_k = "";
 //BA.debugLineNum = 68;BA.debugLine="Dim downloadstring As String = Main.Server & \"/a";
_downloadstring = parent._main._server /*String*/ +"/api/StockItems/UpdateTruckSheetStockItemByInvoice?InvoiceNo="+parent._txtinvoice.getText()+"&TruckSheetNo="+parent._txttrucksheet.getText()+"&User="+parent._main._userlogin /*String*/ ;
 //BA.debugLineNum = 69;BA.debugLine="Log(downloadstring)";
parent.__c.LogImpl("65046279",_downloadstring,0);
 //BA.debugLineNum = 70;BA.debugLine="j.PostString( downloadstring,\"\")";
_j._poststring /*String*/ (_downloadstring,"");
 //BA.debugLineNum = 72;BA.debugLine="J.GetRequest.SetHeader(\"Authorization\",\"Bearer \"";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+parent._main._token /*String*/ );
 //BA.debugLineNum = 73;BA.debugLine="Main.TruckControlSheetList.Initialize";
parent._main._truckcontrolsheetlist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 75;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 11;
return;
case 11:
//C
this.state = 4;
_j = (b4a.SapyLiveSystem.httpjob) result[0];
;
 //BA.debugLineNum = 76;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 78;BA.debugLine="Return 1";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(1));return;};
 if (true) break;

case 7:
//C
this.state = 10;
;
 if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 0;
 //BA.debugLineNum = 81;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("65046291",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 10:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 83;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
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
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 19;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 20;BA.debugLine="Root.LoadLayout(\"TruckControlSheet\")";
_root.LoadLayout("TruckControlSheet",ba);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public String  _btnclear_click() throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Private Sub btnClear_Click";
 //BA.debugLineNum = 55;BA.debugLine="Panel1.RemoveAllViews";
_panel1.RemoveAllViews();
 //BA.debugLineNum = 56;BA.debugLine="txtTruckSheet.Enabled = True";
_txttrucksheet.setEnabled(__c.True);
 //BA.debugLineNum = 57;BA.debugLine="txtTruckSheet.Text = \"\"";
_txttrucksheet.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 58;BA.debugLine="txtInvoice.Text = \"\"";
_txtinvoice.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Private btnClear As Button";
_btnclear = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private txtInvoice As EditText";
_txtinvoice = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private Ulv As UltimateListView";
_ulv = new flm.b4a.ultimatelistview.UltimateListViewWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private txtTruckSheet As EditText";
_txttrucksheet = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 14;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return null;
}
public void  _loadtruckcontrolsheet() throws Exception{
ResumableSub_LoadTruckControlSheet rsub = new ResumableSub_LoadTruckControlSheet(this);
rsub.resume(ba, null);
}
public static class ResumableSub_LoadTruckControlSheet extends BA.ResumableSub {
public ResumableSub_LoadTruckControlSheet(b4a.SapyLiveSystem.trucksheets parent) {
this.parent = parent;
}
b4a.SapyLiveSystem.trucksheets parent;
b4a.SapyLiveSystem.httpjob _j = null;
String _k = "";
String _downloadstring = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _jroot = null;
String _invoiceno = "";
String _itemcode = "";
String _id = "";
double _qty = 0;
anywheresoftware.b4a.objects.collections.Map _coljroot = null;
b4a.SapyLiveSystem.main._trucksheettype _a = null;
anywheresoftware.b4a.BA.IterableList group20;
int index20;
int groupLen20;

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
 //BA.debugLineNum = 88;BA.debugLine="Dim j As HttpJob";
_j = new b4a.SapyLiveSystem.httpjob();
 //BA.debugLineNum = 89;BA.debugLine="Try";
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
 //BA.debugLineNum = 90;BA.debugLine="j.Initialize(\"\", Me)";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 91;BA.debugLine="Dim k As String";
_k = "";
 //BA.debugLineNum = 95;BA.debugLine="Dim downloadstring As String = Main.Server & \"/a";
_downloadstring = parent._main._server /*String*/ +"/api/StockItems/GetStockItemFromTruckSheetNo?TruckSheetNo="+parent._txttrucksheet.getText();
 //BA.debugLineNum = 97;BA.debugLine="Log(downloadstring)";
parent.__c.LogImpl("65111818",_downloadstring,0);
 //BA.debugLineNum = 98;BA.debugLine="j.Download( downloadstring)";
_j._download /*String*/ (_downloadstring);
 //BA.debugLineNum = 100;BA.debugLine="J.GetRequest.SetHeader(\"Authorization\",\"Bearer \"";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+parent._main._token /*String*/ );
 //BA.debugLineNum = 101;BA.debugLine="Main.TruckControlSheetList.Initialize";
parent._main._truckcontrolsheetlist /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 103;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 15;
return;
case 15:
//C
this.state = 4;
_j = (b4a.SapyLiveSystem.httpjob) result[0];
;
 //BA.debugLineNum = 104;BA.debugLine="If j.Success Then";
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
 //BA.debugLineNum = 105;BA.debugLine="Log(j.GetString)";
parent.__c.LogImpl("65111826",_j._getstring /*String*/ (),0);
 //BA.debugLineNum = 106;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 108;BA.debugLine="parser.Initialize(j.GetString)";
_parser.Initialize(_j._getstring /*String*/ ());
 //BA.debugLineNum = 109;BA.debugLine="Dim jRoot As List = parser.NextArray";
_jroot = new anywheresoftware.b4a.objects.collections.List();
_jroot = _parser.NextArray();
 //BA.debugLineNum = 110;BA.debugLine="Dim invoiceno As String";
_invoiceno = "";
 //BA.debugLineNum = 111;BA.debugLine="Dim ItemCode As String";
_itemcode = "";
 //BA.debugLineNum = 112;BA.debugLine="Dim Id As String";
_id = "";
 //BA.debugLineNum = 113;BA.debugLine="Dim Qty As Double";
_qty = 0;
 //BA.debugLineNum = 114;BA.debugLine="For Each coljRoot As Map In jRoot";
if (true) break;

case 7:
//for
this.state = 10;
_coljroot = new anywheresoftware.b4a.objects.collections.Map();
group20 = _jroot;
index20 = 0;
groupLen20 = group20.getSize();
this.state = 16;
if (true) break;

case 16:
//C
this.state = 10;
if (index20 < groupLen20) {
this.state = 9;
_coljroot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group20.Get(index20)));}
if (true) break;

case 17:
//C
this.state = 16;
index20++;
if (true) break;

case 9:
//C
this.state = 17;
 //BA.debugLineNum = 116;BA.debugLine="Id = coljRoot.Get(\"id\")";
_id = BA.ObjectToString(_coljroot.Get((Object)("id")));
 //BA.debugLineNum = 117;BA.debugLine="invoiceno = coljRoot.Get(\"invoiceNo\")";
_invoiceno = BA.ObjectToString(_coljroot.Get((Object)("invoiceNo")));
 //BA.debugLineNum = 118;BA.debugLine="Qty = coljRoot.Get(\"qty\")";
_qty = (double)(BA.ObjectToNumber(_coljroot.Get((Object)("qty"))));
 //BA.debugLineNum = 119;BA.debugLine="ItemCode = coljRoot.Get(\"itemCode\")";
_itemcode = BA.ObjectToString(_coljroot.Get((Object)("itemCode")));
 //BA.debugLineNum = 121;BA.debugLine="Dim a As TruckSheetType";
_a = new b4a.SapyLiveSystem.main._trucksheettype();
 //BA.debugLineNum = 122;BA.debugLine="a.InvoiceNo = invoiceno";
_a.InvoiceNo /*String*/  = _invoiceno;
 //BA.debugLineNum = 123;BA.debugLine="a.qty =  Qty";
_a.qty /*double*/  = _qty;
 //BA.debugLineNum = 124;BA.debugLine="a.Code = ItemCode";
_a.Code /*String*/  = _itemcode;
 //BA.debugLineNum = 125;BA.debugLine="a.ID = Id";
_a.ID /*int*/  = (int)(Double.parseDouble(_id));
 //BA.debugLineNum = 126;BA.debugLine="Main.TruckControlSheetList.Add(a)";
parent._main._truckcontrolsheetlist /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_a));
 if (true) break;
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
 //BA.debugLineNum = 130;BA.debugLine="j.Release";
_j._release /*String*/ ();
 if (true) break;

case 13:
//C
this.state = 14;
this.catchState = 0;
 //BA.debugLineNum = 132;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("65111853",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 14:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 136;BA.debugLine="PopulateULV";
parent._populateulv();
 //BA.debugLineNum = 137;BA.debugLine="End Sub";
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
public String  _populateulv() throws Exception{
int[] _cellwidths = null;
 //BA.debugLineNum = 138;BA.debugLine="Sub PopulateULV";
 //BA.debugLineNum = 139;BA.debugLine="Panel1.RemoveAllViews";
_panel1.RemoveAllViews();
 //BA.debugLineNum = 140;BA.debugLine="Ulv.Initialize(0,0,\"\",\"ULV\")";
_ulv.Initialize(ba,(byte) (0),(int) (0),"","ULV");
 //BA.debugLineNum = 141;BA.debugLine="Ulv.DividerHeight = 3dip";
_ulv.setDividerHeight(__c.DipToCurrent((int) (3)));
 //BA.debugLineNum = 142;BA.debugLine="Ulv.FastScroller(True)";
_ulv.FastScroller(__c.True);
 //BA.debugLineNum = 143;BA.debugLine="Ulv.Color=Colors.Black";
_ulv.setColor(__c.Colors.Black);
 //BA.debugLineNum = 144;BA.debugLine="Ulv.SelectionMode = Ulv.SELECTION_SINGLE";
_ulv.setSelectionMode(_ulv.SELECTION_SINGLE);
 //BA.debugLineNum = 145;BA.debugLine="Ulv.Tag = \"ReceiptHeader\"";
_ulv.setTag((Object)("ReceiptHeader"));
 //BA.debugLineNum = 146;BA.debugLine="Dim cellwidths() As Int = Array As Int(25%x,25%x,";
_cellwidths = new int[]{__c.PerXToCurrent((float) (25),ba),__c.PerXToCurrent((float) (25),ba),__c.PerXToCurrent((float) (30),ba),__c.PerXToCurrent((float) (20),ba)};
 //BA.debugLineNum = 147;BA.debugLine="Ulv.AddRowLayout(\"ReceiptHeader\",\"ReceiptHeader_L";
_ulv.AddRowLayout("ReceiptHeader","ReceiptHeader_Layout","ReceiptHeader_filler",__c.DipToCurrent((int) (50)),(byte) (_cellwidths.length),_cellwidths,(int) (0),__c.Colors.White,__c.True);
 //BA.debugLineNum = 148;BA.debugLine="Panel1.AddView(Ulv,0%x,0%y,Panel1.Width-2dip,Pane";
_panel1.AddView((android.view.View)(_ulv.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (0),ba),(int) (_panel1.getWidth()-__c.DipToCurrent((int) (2))),(int) (_panel1.getHeight()-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 149;BA.debugLine="Ulv.BulkAddItems(Main.TruckControlSheetList.Size,";
_ulv.BulkAddItems(_main._truckcontrolsheetlist /*anywheresoftware.b4a.objects.collections.List*/ .getSize(),"ReceiptHeader",(int) (0));
 //BA.debugLineNum = 151;BA.debugLine="Log(\"End popULVProduct\")";
__c.LogImpl("65177357","End popULVProduct",0);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}
public String  _receiptheader_filler(long _rowid,String _layoutname,anywheresoftware.b4a.objects.PanelWrapper _cellpanel,byte _cellindex,int _position) throws Exception{
b4a.SapyLiveSystem.main._trucksheettype _x = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
 //BA.debugLineNum = 197;BA.debugLine="Sub ReceiptHeader_filler(RowID As Long, LayoutName";
 //BA.debugLineNum = 201;BA.debugLine="Dim x As TruckSheetType =Main.TruckControlSheetLi";
_x = (b4a.SapyLiveSystem.main._trucksheettype)(_main._truckcontrolsheetlist /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_rowid)));
 //BA.debugLineNum = 203;BA.debugLine="Select CellIndex";
switch (BA.switchObjectToInt(_cellindex,(byte) (0),(byte) (1),(byte) (2),(byte) (3))) {
case 0: {
 //BA.debugLineNum = 207;BA.debugLine="Dim lbl As Label = CellPanel.GetView(0)";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_cellpanel.GetView((int) (0)).getObject()));
 //BA.debugLineNum = 208;BA.debugLine="lbl.TextColor = Colors.Black";
_lbl.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 209;BA.debugLine="lbl.Text=x.InvoiceNo";
_lbl.setText(BA.ObjectToCharSequence(_x.InvoiceNo /*String*/ ));
 break; }
case 1: {
 //BA.debugLineNum = 216;BA.debugLine="Dim lbl As Label = CellPanel.GetView(0)";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_cellpanel.GetView((int) (0)).getObject()));
 //BA.debugLineNum = 217;BA.debugLine="lbl.TextColor = Colors.Black";
_lbl.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 218;BA.debugLine="lbl.Text=x.Code";
_lbl.setText(BA.ObjectToCharSequence(_x.Code /*String*/ ));
 break; }
case 2: {
 //BA.debugLineNum = 225;BA.debugLine="Dim lbl As Label = CellPanel.GetView(0)";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_cellpanel.GetView((int) (0)).getObject()));
 //BA.debugLineNum = 226;BA.debugLine="lbl.TextColor = Colors.Black";
_lbl.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 227;BA.debugLine="lbl.Text=x.qty";
_lbl.setText(BA.ObjectToCharSequence(_x.qty /*double*/ ));
 break; }
case 3: {
 //BA.debugLineNum = 231;BA.debugLine="Dim lbl As Label = CellPanel.GetView(0)";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_cellpanel.GetView((int) (0)).getObject()));
 //BA.debugLineNum = 232;BA.debugLine="lbl.TextColor = Colors.Black";
_lbl.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 233;BA.debugLine="lbl.Text=x.ID";
_lbl.setText(BA.ObjectToCharSequence(_x.ID /*int*/ ));
 break; }
}
;
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return "";
}
public String  _receiptheader_layout(String _layoutname,anywheresoftware.b4a.objects.PanelWrapper _cellpanel,byte _cellindex) throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
 //BA.debugLineNum = 155;BA.debugLine="Sub ReceiptHeader_Layout(LayoutName As String, Cel";
 //BA.debugLineNum = 156;BA.debugLine="Select CellIndex";
switch (BA.switchObjectToInt(_cellindex,(byte) (0),(byte) (1),(byte) (2),(byte) (3))) {
case 0: {
 //BA.debugLineNum = 160;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 161;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
 //BA.debugLineNum = 162;BA.debugLine="lbl.Gravity = Gravity.CENTER_VERTICAL";
_lbl.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 163;BA.debugLine="lbl.TextColor =  Colors.Black";
_lbl.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 164;BA.debugLine="lbl.TextSize = 10";
_lbl.setTextSize((float) (10));
 //BA.debugLineNum = 166;BA.debugLine="CellPanel.AddView(lbl, 5dip, 5dip, CellPanel.Wi";
_cellpanel.AddView((android.view.View)(_lbl.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5)),(int) (_cellpanel.getWidth()-__c.DipToCurrent((int) (10))),(int) (_cellpanel.getHeight()-__c.DipToCurrent((int) (2))));
 break; }
case 1: {
 //BA.debugLineNum = 168;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 169;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
 //BA.debugLineNum = 170;BA.debugLine="lbl.Gravity = Gravity.CENTER_VERTICAL";
_lbl.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 171;BA.debugLine="lbl.TextColor =  Colors.Black";
_lbl.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 172;BA.debugLine="lbl.TextSize = 10";
_lbl.setTextSize((float) (10));
 //BA.debugLineNum = 174;BA.debugLine="CellPanel.AddView(lbl, 5dip, 5dip, CellPanel.Wi";
_cellpanel.AddView((android.view.View)(_lbl.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5)),(int) (_cellpanel.getWidth()-__c.DipToCurrent((int) (10))),(int) (_cellpanel.getHeight()-__c.DipToCurrent((int) (2))));
 break; }
case 2: {
 //BA.debugLineNum = 177;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 178;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
 //BA.debugLineNum = 179;BA.debugLine="lbl.Gravity = Gravity.CENTER_VERTICAL";
_lbl.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 180;BA.debugLine="lbl.TextColor =  Colors.Black";
_lbl.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 181;BA.debugLine="lbl.TextSize = 10";
_lbl.setTextSize((float) (10));
 //BA.debugLineNum = 182;BA.debugLine="CellPanel.AddView(lbl, 5dip, 5dip, CellPanel.Wi";
_cellpanel.AddView((android.view.View)(_lbl.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5)),(int) (_cellpanel.getWidth()-__c.DipToCurrent((int) (10))),(int) (_cellpanel.getHeight()-__c.DipToCurrent((int) (2))));
 break; }
case 3: {
 //BA.debugLineNum = 185;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 186;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
 //BA.debugLineNum = 187;BA.debugLine="lbl.Gravity = Gravity.CENTER_VERTICAL";
_lbl.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 188;BA.debugLine="lbl.TextColor =  Colors.Black";
_lbl.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 189;BA.debugLine="lbl.TextSize = 10";
_lbl.setTextSize((float) (10));
 //BA.debugLineNum = 190;BA.debugLine="CellPanel.AddView(lbl, 5dip, 5dip, CellPanel.Wi";
_cellpanel.AddView((android.view.View)(_lbl.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5)),(int) (_cellpanel.getWidth()-__c.DipToCurrent((int) (10))),(int) (_cellpanel.getHeight()-__c.DipToCurrent((int) (2))));
 break; }
}
;
 //BA.debugLineNum = 195;BA.debugLine="End Sub";
return "";
}
public void  _txtinvoice_enterpressed() throws Exception{
ResumableSub_txtInvoice_EnterPressed rsub = new ResumableSub_txtInvoice_EnterPressed(this);
rsub.resume(ba, null);
}
public static class ResumableSub_txtInvoice_EnterPressed extends BA.ResumableSub {
public ResumableSub_txtInvoice_EnterPressed(b4a.SapyLiveSystem.trucksheets parent) {
this.parent = parent;
}
b4a.SapyLiveSystem.trucksheets parent;
int _result = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 41;BA.debugLine="If txtTruckSheet.Text = \"\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((parent._txttrucksheet.getText()).equals("")) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 42;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 45;BA.debugLine="Wait For (AddToTruckSheet) Complete (Result As In";
parent.__c.WaitFor("complete", ba, this, parent._addtotrucksheet());
this.state = 5;
return;
case 5:
//C
this.state = -1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 47;BA.debugLine="LoadTruckControlSheet";
parent._loadtruckcontrolsheet();
 //BA.debugLineNum = 49;BA.debugLine="txtInvoice.Text = \"\"";
parent._txtinvoice.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 50;BA.debugLine="txtInvoice.RequestFocus";
parent._txtinvoice.RequestFocus();
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(int _result) throws Exception{
}
public String  _txttrucksheet_enterpressed() throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Private Sub txtTruckSheet_EnterPressed";
 //BA.debugLineNum = 30;BA.debugLine="If txtTruckSheet.Text = \"\" Then";
if ((_txttrucksheet.getText()).equals("")) { 
 //BA.debugLineNum = 31;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 34;BA.debugLine="LoadTruckControlSheet";
_loadtruckcontrolsheet();
 //BA.debugLineNum = 35;BA.debugLine="txtTruckSheet.Enabled = False";
_txttrucksheet.setEnabled(__c.False);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
