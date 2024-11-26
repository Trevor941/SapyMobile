package b4a.SapyLiveSystem;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class grvstockin extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.SapyLiveSystem.grvstockin");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.SapyLiveSystem.grvstockin.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnprintlabel = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnreturn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsave = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnviewheaderinfo = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtscan = null;
public flm.b4a.ultimatelistview.UltimateListViewWrapper _ulv = null;
public b4a.SapyLiveSystem.b4xinputtemplate _inputtemplate = null;
public b4a.SapyLiveSystem.main._polistype _x = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblwarehouse = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnprintpopup = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chkprintallthesamepopup = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcodepopup = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldescpopup = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblqtypopup = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtprintonlabelpopup = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtqtytoprintpopup = null;
public b4a.SapyLiveSystem.b4xdialog _dialog = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chkautoscale = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chkprintallsetvalueeach = null;
public boolean _blndontrun = false;
public anywheresoftware.b4a.objects.collections.List _lstockforsapylive = null;
public String _printertoprinton = "";
public boolean _chkprintallthesamepopup1 = false;
public boolean _chkautoscale1 = false;
public boolean _chkprintallsetvalueeach1 = false;
public int _valuetoprint = 0;
public b4a.example.dateutils _dateutils = null;
public b4a.SapyLiveSystem.main _main = null;
public b4a.SapyLiveSystem.starter _starter = null;
public b4a.SapyLiveSystem.b4xpages _b4xpages = null;
public b4a.SapyLiveSystem.b4xcollections _b4xcollections = null;
public b4a.SapyLiveSystem.httputils2service _httputils2service = null;
public b4a.SapyLiveSystem.xuiviewsutils _xuiviewsutils = null;
public static class _orderinfo{
public boolean IsInitialized;
public int id;
public int idInvoiceLines;
public String sapyLiveOrderNo;
public double onHandQty;
public int dispatchPlanHeaderId;
public String freightCostFor;
public String userCaptured;
public String orderNo;
public String description;
public String itemCode;
public String frieghtCompany;
public double scannedQty;
public double qtyToProcess;
public String name;
public String account;
public int StockLink;
public void Initialize() {
IsInitialized = true;
id = 0;
idInvoiceLines = 0;
sapyLiveOrderNo = "";
onHandQty = 0;
dispatchPlanHeaderId = 0;
freightCostFor = "";
userCaptured = "";
orderNo = "";
description = "";
itemCode = "";
frieghtCompany = "";
scannedQty = 0;
qtyToProcess = 0;
name = "";
account = "";
StockLink = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _b4xpage_appear() throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Private Sub B4XPage_Appear";
 //BA.debugLineNum = 54;BA.debugLine="If txtScan.Text = \"\" Then";
if ((_txtscan.getText()).equals("")) { 
 //BA.debugLineNum = 55;BA.debugLine="txtScan.RequestFocus";
_txtscan.RequestFocus();
 }else {
 //BA.debugLineNum = 58;BA.debugLine="PopulateULV";
_populateulv();
 };
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 45;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 46;BA.debugLine="Root.LoadLayout(\"GrvStockMainPage\")";
_root.LoadLayout("GrvStockMainPage",ba);
 //BA.debugLineNum = 48;BA.debugLine="dialog.Initialize(Root)";
_dialog._initialize /*String*/ (ba,_root);
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public void  _btnprintlabel_click() throws Exception{
ResumableSub_btnPrintLabel_Click rsub = new ResumableSub_btnPrintLabel_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnPrintLabel_Click extends BA.ResumableSub {
public ResumableSub_btnPrintLabel_Click(b4a.SapyLiveSystem.grvstockin parent) {
this.parent = parent;
}
b4a.SapyLiveSystem.grvstockin parent;
int _result = 0;
int _result2 = 0;
b4a.SapyLiveSystem.main._polistype _a = null;
anywheresoftware.b4a.objects.B4XViewWrapper _p = null;
int _i = 0;
int _result213 = 0;
double _df = 0;
double _qty22 = 0;
double _total = 0;
int _result214 = 0;
int _result215 = 0;
anywheresoftware.b4a.BA.IterableList group16;
int index16;
int groupLen16;
int step38;
int limit38;
int step50;
int limit50;
int step60;
int limit60;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 577;BA.debugLine="dialog.Initialize (Root)";
parent._dialog._initialize /*String*/ (ba,parent._root);
 //BA.debugLineNum = 578;BA.debugLine="InputTemplate.Initialize";
parent._inputtemplate._initialize /*String*/ (ba);
 //BA.debugLineNum = 579;BA.debugLine="InputTemplate.lblTitle.Text = \"Please Scan Printe";
parent._inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Please Scan Printer or type Printer Code"));
 //BA.debugLineNum = 580;BA.debugLine="InputTemplate.Text=\"\"";
parent._inputtemplate._text /*String*/  = "";
 //BA.debugLineNum = 581;BA.debugLine="InputTemplate.lblTitle.TextColor = Colors.White";
parent._inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(parent.__c.Colors.White);
 //BA.debugLineNum = 584;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 56;
return;
case 56:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 585;BA.debugLine="If Result = xui.DialogResponse_Cancel Then";
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
 //BA.debugLineNum = 586;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
 //BA.debugLineNum = 590;BA.debugLine="If lblWarehouse.Text = \"No Warehouse\" Then";

case 4:
//if
this.state = 7;
if ((parent._lblwarehouse.getText()).equals("No Warehouse")) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 591;BA.debugLine="Msgbox(\"Please scan or enter a warehouse Id befo";
parent.__c.Msgbox(BA.ObjectToCharSequence("Please scan or enter a warehouse Id before proceeding"),BA.ObjectToCharSequence(parent.__c.True),ba);
 //BA.debugLineNum = 592;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
 //BA.debugLineNum = 595;BA.debugLine="Wait For(postprint ) Complete (Result2 As Int)";
parent.__c.WaitFor("complete", ba, this, parent._postprint());
this.state = 57;
return;
case 57:
//C
this.state = 8;
_result2 = (Integer) result[0];
;
 //BA.debugLineNum = 598;BA.debugLine="PrintertoPrinton=InputTemplate.Text";
parent._printertoprinton = parent._inputtemplate._text /*String*/ ;
 //BA.debugLineNum = 599;BA.debugLine="For Each a As PoListype In Main.PoListypel";
if (true) break;

case 8:
//for
this.state = 55;
group16 = parent._main._polistypel /*anywheresoftware.b4a.objects.collections.List*/ ;
index16 = 0;
groupLen16 = group16.getSize();
this.state = 58;
if (true) break;

case 58:
//C
this.state = 55;
if (index16 < groupLen16) {
this.state = 10;
_a = (b4a.SapyLiveSystem.main._polistype)(group16.Get(index16));}
if (true) break;

case 59:
//C
this.state = 58;
index16++;
if (true) break;

case 10:
//C
this.state = 11;
 //BA.debugLineNum = 618;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = new anywheresoftware.b4a.objects.B4XViewWrapper();
_p = parent._xui.CreatePanel(ba,"");
 //BA.debugLineNum = 619;BA.debugLine="p.SetLayoutAnimated(0,0,0,100%x,100%x)";
_p.SetLayoutAnimated((int) (0),(int) (0),(int) (0),parent.__c.PerXToCurrent((float) (100),ba),parent.__c.PerXToCurrent((float) (100),ba));
 //BA.debugLineNum = 620;BA.debugLine="p.LoadLayout(\"FrmPrintPopUp\")";
_p.LoadLayout("FrmPrintPopUp",ba);
 //BA.debugLineNum = 621;BA.debugLine="dialog.PutAtTop = True";
parent._dialog._putattop /*boolean*/  = parent.__c.True;
 //BA.debugLineNum = 625;BA.debugLine="lblCodePopup.Text = a.Code";
parent._lblcodepopup.setText(BA.ObjectToCharSequence(_a.Code /*String*/ ));
 //BA.debugLineNum = 626;BA.debugLine="lblDescPopup.Text = a.description_1";
parent._lbldescpopup.setText(BA.ObjectToCharSequence(_a.description_1 /*String*/ ));
 //BA.debugLineNum = 627;BA.debugLine="lblQtyPopup.Text = a.fQtyToProcess";
parent._lblqtypopup.setText(BA.ObjectToCharSequence(_a.fQtyToProcess /*double*/ ));
 //BA.debugLineNum = 628;BA.debugLine="txtQtyToPrintPopup.Text =   1 '  a.NoOfPrints";
parent._txtqtytoprintpopup.setText(BA.ObjectToCharSequence(1));
 //BA.debugLineNum = 629;BA.debugLine="txtPrintOnLabelPopup.Text =   a.fQtyToProcess";
parent._txtprintonlabelpopup.setText(BA.ObjectToCharSequence(_a.fQtyToProcess /*double*/ ));
 //BA.debugLineNum = 632;BA.debugLine="If txtQtyToPrintPopup.Text < 0 Then";
if (true) break;

case 11:
//if
this.state = 14;
if ((double)(Double.parseDouble(parent._txtqtytoprintpopup.getText()))<0) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 //BA.debugLineNum = 633;BA.debugLine="txtQtyToPrintPopup.Text = 0";
parent._txtqtytoprintpopup.setText(BA.ObjectToCharSequence(0));
 if (true) break;

case 14:
//C
this.state = 15;
;
 //BA.debugLineNum = 636;BA.debugLine="chkPrintAllTheSamePopup.Checked = False";
parent._chkprintallthesamepopup.setChecked(parent.__c.False);
 //BA.debugLineNum = 637;BA.debugLine="chkPrintAllSetValueEach.Checked = False";
parent._chkprintallsetvalueeach.setChecked(parent.__c.False);
 //BA.debugLineNum = 638;BA.debugLine="chkAutoScale.Checked = True";
parent._chkautoscale.setChecked(parent.__c.True);
 //BA.debugLineNum = 639;BA.debugLine="chkAutoScale.Checked = True";
parent._chkautoscale.setChecked(parent.__c.True);
 //BA.debugLineNum = 641;BA.debugLine="Wait For (dialog.ShowCustom(p, \"PRINT\", \"\", \"Don";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showcustom /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (_p,(Object)("PRINT"),(Object)(""),(Object)("Dont Print")));
this.state = 60;
return;
case 60:
//C
this.state = 15;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 644;BA.debugLine="If txtPrintOnLabelPopup.Text =\"\" Then txtPrintOn";
if (true) break;

case 15:
//if
this.state = 20;
if ((parent._txtprintonlabelpopup.getText()).equals("")) { 
this.state = 17;
;}if (true) break;

case 17:
//C
this.state = 20;
parent._txtprintonlabelpopup.setText(BA.ObjectToCharSequence(1));
if (true) break;

case 20:
//C
this.state = 21;
;
 //BA.debugLineNum = 646;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 21:
//if
this.state = 54;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 23;
}if (true) break;

case 23:
//C
this.state = 24;
 //BA.debugLineNum = 650;BA.debugLine="If chkPrintAllTheSamePopup1 = True Then";
if (true) break;

case 24:
//if
this.state = 31;
if (parent._chkprintallthesamepopup1==parent.__c.True) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 //BA.debugLineNum = 651;BA.debugLine="chkPrintAllTheSamePopup1 = False";
parent._chkprintallthesamepopup1 = parent.__c.False;
 //BA.debugLineNum = 652;BA.debugLine="For i = 1 To txtQtyToPrintPopup.Text";
if (true) break;

case 27:
//for
this.state = 30;
step38 = 1;
limit38 = (int)(Double.parseDouble(parent._txtqtytoprintpopup.getText()));
_i = (int) (1) ;
this.state = 61;
if (true) break;

case 61:
//C
this.state = 30;
if ((step38 > 0 && _i <= limit38) || (step38 < 0 && _i >= limit38)) this.state = 29;
if (true) break;

case 62:
//C
this.state = 61;
_i = ((int)(0 + _i + step38)) ;
if (true) break;

case 29:
//C
this.state = 62;
 //BA.debugLineNum = 654;BA.debugLine="Log(\"Iteration \" & i)";
parent.__c.LogImpl("63604562","Iteration "+BA.NumberToString(_i),0);
 //BA.debugLineNum = 655;BA.debugLine="x= a";
parent._x = _a;
 //BA.debugLineNum = 656;BA.debugLine="Wait For(CreateStock (txtPrintOnLabelPopup.Te";
parent.__c.WaitFor("complete", ba, this, parent._createstock((double)(Double.parseDouble(parent._txtprintonlabelpopup.getText())),parent._printertoprinton));
this.state = 63;
return;
case 63:
//C
this.state = 62;
_result213 = (Integer) result[0];
;
 if (true) break;
if (true) break;

case 30:
//C
this.state = 31;
;
 if (true) break;
;
 //BA.debugLineNum = 667;BA.debugLine="If chkAutoScale1 = True Then";

case 31:
//if
this.state = 42;
if (parent._chkautoscale1==parent.__c.True) { 
this.state = 33;
}if (true) break;

case 33:
//C
this.state = 34;
 //BA.debugLineNum = 668;BA.debugLine="chkAutoScale1 = False";
parent._chkautoscale1 = parent.__c.False;
 //BA.debugLineNum = 669;BA.debugLine="Dim df As Double =  lblQtyPopup.Text / txtQtyT";
_df = (double)(Double.parseDouble(parent._lblqtypopup.getText()))/(double)(double)(Double.parseDouble(parent._txtqtytoprintpopup.getText()));
 //BA.debugLineNum = 670;BA.debugLine="df =Round2(df,2)";
_df = parent.__c.Round2(_df,(int) (2));
 //BA.debugLineNum = 672;BA.debugLine="Dim qty22 As Double = df  'Round2(df,2)";
_qty22 = _df;
 //BA.debugLineNum = 675;BA.debugLine="Dim Total As Double = a.fQuantity";
_total = _a.fQuantity /*double*/ ;
 //BA.debugLineNum = 678;BA.debugLine="For i = 1 To txtQtyToPrintPopup.Text";
if (true) break;

case 34:
//for
this.state = 41;
step50 = 1;
limit50 = (int)(Double.parseDouble(parent._txtqtytoprintpopup.getText()));
_i = (int) (1) ;
this.state = 64;
if (true) break;

case 64:
//C
this.state = 41;
if ((step50 > 0 && _i <= limit50) || (step50 < 0 && _i >= limit50)) this.state = 36;
if (true) break;

case 65:
//C
this.state = 64;
_i = ((int)(0 + _i + step50)) ;
if (true) break;

case 36:
//C
this.state = 37;
 //BA.debugLineNum = 682;BA.debugLine="Log(\"Iteration \" & qty22)";
parent.__c.LogImpl("63604590","Iteration "+BA.NumberToString(_qty22),0);
 //BA.debugLineNum = 685;BA.debugLine="x=a";
parent._x = _a;
 //BA.debugLineNum = 686;BA.debugLine="Wait For(CreateStock (qty22,PrintertoPrinton)";
parent.__c.WaitFor("complete", ba, this, parent._createstock(_qty22,parent._printertoprinton));
this.state = 66;
return;
case 66:
//C
this.state = 37;
_result213 = (Integer) result[0];
;
 //BA.debugLineNum = 687;BA.debugLine="If Result213 = 0 Then";
if (true) break;

case 37:
//if
this.state = 40;
if (_result213==0) { 
this.state = 39;
}if (true) break;

case 39:
//C
this.state = 40;
 if (true) break;

case 40:
//C
this.state = 65;
;
 if (true) break;
if (true) break;

case 41:
//C
this.state = 42;
;
 if (true) break;
;
 //BA.debugLineNum = 694;BA.debugLine="If chkPrintAllSetValueEach1 = True Then";

case 42:
//if
this.state = 53;
if (parent._chkprintallsetvalueeach1==parent.__c.True) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
 //BA.debugLineNum = 695;BA.debugLine="chkPrintAllSetValueEach1 = False";
parent._chkprintallsetvalueeach1 = parent.__c.False;
 //BA.debugLineNum = 696;BA.debugLine="For i = 1 To ValueToPrint";
if (true) break;

case 45:
//for
this.state = 52;
step60 = 1;
limit60 = parent._valuetoprint;
_i = (int) (1) ;
this.state = 67;
if (true) break;

case 67:
//C
this.state = 52;
if ((step60 > 0 && _i <= limit60) || (step60 < 0 && _i >= limit60)) this.state = 47;
if (true) break;

case 68:
//C
this.state = 67;
_i = ((int)(0 + _i + step60)) ;
if (true) break;

case 47:
//C
this.state = 48;
 //BA.debugLineNum = 698;BA.debugLine="txtQtyToPrintPopup.Enabled = False";
parent._txtqtytoprintpopup.setEnabled(parent.__c.False);
 //BA.debugLineNum = 702;BA.debugLine="InputTemplate.Initialize";
parent._inputtemplate._initialize /*String*/ (ba);
 //BA.debugLineNum = 703;BA.debugLine="InputTemplate.ConfigureForNumbers(True, False";
parent._inputtemplate._configurefornumbers /*String*/ (parent.__c.True,parent.__c.False);
 //BA.debugLineNum = 704;BA.debugLine="InputTemplate.lblTitle.Text = \"Please enter V";
parent._inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Please enter Value to Print"));
 //BA.debugLineNum = 705;BA.debugLine="InputTemplate.Text=\"\"";
parent._inputtemplate._text /*String*/  = "";
 //BA.debugLineNum = 706;BA.debugLine="InputTemplate.lblTitle.TextColor = Colors.Whi";
parent._inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(parent.__c.Colors.White);
 //BA.debugLineNum = 711;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate,";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 69;
return;
case 69:
//C
this.state = 48;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 712;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 48:
//if
this.state = 51;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 50;
}if (true) break;

case 50:
//C
this.state = 51;
 //BA.debugLineNum = 713;BA.debugLine="Log(\"Iteration \" & InputTemplate.Text)";
parent.__c.LogImpl("63604621","Iteration "+parent._inputtemplate._text /*String*/ ,0);
 if (true) break;

case 51:
//C
this.state = 68;
;
 //BA.debugLineNum = 715;BA.debugLine="Log(\"Before Create Stock\")";
parent.__c.LogImpl("63604623","Before Create Stock",0);
 //BA.debugLineNum = 716;BA.debugLine="x = a";
parent._x = _a;
 //BA.debugLineNum = 717;BA.debugLine="Wait For(CreateStock (InputTemplate.Text,Prin";
parent.__c.WaitFor("complete", ba, this, parent._createstock((double)(Double.parseDouble(parent._inputtemplate._text /*String*/ )),parent._printertoprinton));
this.state = 70;
return;
case 70:
//C
this.state = 68;
_result214 = (Integer) result[0];
;
 if (true) break;
if (true) break;

case 52:
//C
this.state = 53;
;
 //BA.debugLineNum = 721;BA.debugLine="txtQtyToPrintPopup.Enabled = True";
parent._txtqtytoprintpopup.setEnabled(parent.__c.True);
 if (true) break;

case 53:
//C
this.state = 54;
;
 if (true) break;

case 54:
//C
this.state = 59;
;
 if (true) break;
if (true) break;

case 55:
//C
this.state = -1;
;
 //BA.debugLineNum = 734;BA.debugLine="Wait For(WriteToSapyLiveStock) Complete (Result21";
parent.__c.WaitFor("complete", ba, this, parent._writetosapylivestock());
this.state = 71;
return;
case 71:
//C
this.state = -1;
_result215 = (Integer) result[0];
;
 //BA.debugLineNum = 738;BA.debugLine="SavePo(InputTemplate.Text,True)";
parent._savepo(parent._inputtemplate._text /*String*/ ,parent.__c.True);
 //BA.debugLineNum = 740;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(int _result) throws Exception{
}
public String  _btnreturn_click() throws Exception{
 //BA.debugLineNum = 568;BA.debugLine="Private Sub btnReturn_Click";
 //BA.debugLineNum = 569;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"MainMenu";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"MainMenu");
 //BA.debugLineNum = 570;BA.debugLine="End Sub";
return "";
}
public String  _btnsave_click() throws Exception{
 //BA.debugLineNum = 373;BA.debugLine="Private Sub btnSave_Click";
 //BA.debugLineNum = 376;BA.debugLine="SavePo(\"\",False)";
_savepo("",__c.False);
 //BA.debugLineNum = 379;BA.debugLine="End Sub";
return "";
}
public String  _btnviewheaderinfo_click() throws Exception{
 //BA.debugLineNum = 355;BA.debugLine="Private Sub btnViewHeaderInfo_Click";
 //BA.debugLineNum = 358;BA.debugLine="Try";
try { //BA.debugLineNum = 360;BA.debugLine="If Main.PoListypel.Size = 0 Then";
if (_main._polistypel /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
 //BA.debugLineNum = 361;BA.debugLine="ToastMessageShow(\"No valid rows\",True)";
__c.ToastMessageShow(BA.ObjectToCharSequence("No valid rows"),__c.True);
 //BA.debugLineNum = 362;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 365;BA.debugLine="B4XPages.ShowPage(\"GrvHeaderInfo\")";
_b4xpages._showpage /*String*/ (ba,"GrvHeaderInfo");
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 367;BA.debugLine="ToastMessageShow(\"No valid rows\",True)";
__c.ToastMessageShow(BA.ObjectToCharSequence("No valid rows"),__c.True);
 };
 //BA.debugLineNum = 371;BA.debugLine="End Sub";
return "";
}
public void  _chkautoscale_checkedchange(boolean _checked) throws Exception{
ResumableSub_chkAutoScale_CheckedChange rsub = new ResumableSub_chkAutoScale_CheckedChange(this,_checked);
rsub.resume(ba, null);
}
public static class ResumableSub_chkAutoScale_CheckedChange extends BA.ResumableSub {
public ResumableSub_chkAutoScale_CheckedChange(b4a.SapyLiveSystem.grvstockin parent,boolean _checked) {
this.parent = parent;
this._checked = _checked;
}
b4a.SapyLiveSystem.grvstockin parent;
boolean _checked;

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
 //BA.debugLineNum = 892;BA.debugLine="chkPrintAllTheSamePopup1 = False";
parent._chkprintallthesamepopup1 = parent.__c.False;
 //BA.debugLineNum = 893;BA.debugLine="chkPrintAllSetValueEach1 = False";
parent._chkprintallsetvalueeach1 = parent.__c.False;
 //BA.debugLineNum = 894;BA.debugLine="chkAutoScale1 = True";
parent._chkautoscale1 = parent.__c.True;
 //BA.debugLineNum = 896;BA.debugLine="If blndontrun = True Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._blndontrun==parent.__c.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 897;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 899;BA.debugLine="blndontrun = True";
parent._blndontrun = parent.__c.True;
 //BA.debugLineNum = 900;BA.debugLine="chkPrintAllSetValueEach.Checked = False";
parent._chkprintallsetvalueeach.setChecked(parent.__c.False);
 //BA.debugLineNum = 901;BA.debugLine="chkPrintAllTheSamePopup.Checked = False";
parent._chkprintallthesamepopup.setChecked(parent.__c.False);
 //BA.debugLineNum = 902;BA.debugLine="blndontrun = False";
parent._blndontrun = parent.__c.False;
 //BA.debugLineNum = 903;BA.debugLine="Sleep(50)";
parent.__c.Sleep(ba,this,(int) (50));
this.state = 11;
return;
case 11:
//C
this.state = 5;
;
 //BA.debugLineNum = 904;BA.debugLine="chkAutoScale1 = True";
parent._chkautoscale1 = parent.__c.True;
 //BA.debugLineNum = 905;BA.debugLine="chkPrintAllTheSamePopup1 = False";
parent._chkprintallthesamepopup1 = parent.__c.False;
 //BA.debugLineNum = 906;BA.debugLine="chkPrintAllSetValueEach1 = False";
parent._chkprintallsetvalueeach1 = parent.__c.False;
 //BA.debugLineNum = 908;BA.debugLine="Try";
if (true) break;

case 5:
//try
this.state = 10;
this.catchState = 9;
this.state = 7;
if (true) break;

case 7:
//C
this.state = 10;
this.catchState = 9;
 //BA.debugLineNum = 909;BA.debugLine="txtPrintOnLabelPopup	.Text = lblQtyPopup.Text /";
parent._txtprintonlabelpopup.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(parent._lblqtypopup.getText()))/(double)(double)(Double.parseDouble(parent._txtqtytoprintpopup.getText()))));
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
 //BA.debugLineNum = 913;BA.debugLine="End Sub";
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
public void  _chkprintallsetvalueeach_checkedchange(boolean _checked) throws Exception{
ResumableSub_chkPrintAllSetValueEach_CheckedChange rsub = new ResumableSub_chkPrintAllSetValueEach_CheckedChange(this,_checked);
rsub.resume(ba, null);
}
public static class ResumableSub_chkPrintAllSetValueEach_CheckedChange extends BA.ResumableSub {
public ResumableSub_chkPrintAllSetValueEach_CheckedChange(b4a.SapyLiveSystem.grvstockin parent,boolean _checked) {
this.parent = parent;
this._checked = _checked;
}
b4a.SapyLiveSystem.grvstockin parent;
boolean _checked;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 870;BA.debugLine="chkPrintAllTheSamePopup1 = False";
parent._chkprintallthesamepopup1 = parent.__c.False;
 //BA.debugLineNum = 871;BA.debugLine="chkPrintAllSetValueEach1 = True";
parent._chkprintallsetvalueeach1 = parent.__c.True;
 //BA.debugLineNum = 872;BA.debugLine="chkAutoScale1 = False";
parent._chkautoscale1 = parent.__c.False;
 //BA.debugLineNum = 874;BA.debugLine="If blndontrun = True Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._blndontrun==parent.__c.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 875;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 877;BA.debugLine="blndontrun = True";
parent._blndontrun = parent.__c.True;
 //BA.debugLineNum = 878;BA.debugLine="chkPrintAllTheSamePopup.Checked = False";
parent._chkprintallthesamepopup.setChecked(parent.__c.False);
 //BA.debugLineNum = 879;BA.debugLine="chkAutoScale.Checked = False";
parent._chkautoscale.setChecked(parent.__c.False);
 //BA.debugLineNum = 880;BA.debugLine="blndontrun = False";
parent._blndontrun = parent.__c.False;
 //BA.debugLineNum = 881;BA.debugLine="Sleep(50)";
parent.__c.Sleep(ba,this,(int) (50));
this.state = 5;
return;
case 5:
//C
this.state = -1;
;
 //BA.debugLineNum = 882;BA.debugLine="chkPrintAllSetValueEach1 = True";
parent._chkprintallsetvalueeach1 = parent.__c.True;
 //BA.debugLineNum = 883;BA.debugLine="chkAutoScale1 = False";
parent._chkautoscale1 = parent.__c.False;
 //BA.debugLineNum = 884;BA.debugLine="chkPrintAllTheSamePopup1 = False";
parent._chkprintallthesamepopup1 = parent.__c.False;
 //BA.debugLineNum = 888;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _chkprintallthesamepopup_checkedchange(boolean _checked) throws Exception{
ResumableSub_chkPrintAllTheSamePopup_CheckedChange rsub = new ResumableSub_chkPrintAllTheSamePopup_CheckedChange(this,_checked);
rsub.resume(ba, null);
}
public static class ResumableSub_chkPrintAllTheSamePopup_CheckedChange extends BA.ResumableSub {
public ResumableSub_chkPrintAllTheSamePopup_CheckedChange(b4a.SapyLiveSystem.grvstockin parent,boolean _checked) {
this.parent = parent;
this._checked = _checked;
}
b4a.SapyLiveSystem.grvstockin parent;
boolean _checked;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 849;BA.debugLine="chkPrintAllTheSamePopup1 = True";
parent._chkprintallthesamepopup1 = parent.__c.True;
 //BA.debugLineNum = 850;BA.debugLine="chkPrintAllSetValueEach1 = False";
parent._chkprintallsetvalueeach1 = parent.__c.False;
 //BA.debugLineNum = 851;BA.debugLine="chkAutoScale1 = False";
parent._chkautoscale1 = parent.__c.False;
 //BA.debugLineNum = 852;BA.debugLine="If blndontrun = True Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._blndontrun==parent.__c.True) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 853;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 855;BA.debugLine="blndontrun = True";
parent._blndontrun = parent.__c.True;
 //BA.debugLineNum = 856;BA.debugLine="chkPrintAllSetValueEach.Checked = False";
parent._chkprintallsetvalueeach.setChecked(parent.__c.False);
 //BA.debugLineNum = 857;BA.debugLine="chkAutoScale.Checked = False";
parent._chkautoscale.setChecked(parent.__c.False);
 //BA.debugLineNum = 858;BA.debugLine="blndontrun = False";
parent._blndontrun = parent.__c.False;
 //BA.debugLineNum = 859;BA.debugLine="Sleep(50)";
parent.__c.Sleep(ba,this,(int) (50));
this.state = 5;
return;
case 5:
//C
this.state = -1;
;
 //BA.debugLineNum = 860;BA.debugLine="chkPrintAllTheSamePopup1 = True";
parent._chkprintallthesamepopup1 = parent.__c.True;
 //BA.debugLineNum = 861;BA.debugLine="chkPrintAllSetValueEach1 = False";
parent._chkprintallsetvalueeach1 = parent.__c.False;
 //BA.debugLineNum = 862;BA.debugLine="chkAutoScale1 = False";
parent._chkautoscale1 = parent.__c.False;
 //BA.debugLineNum = 863;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Private btnPrintLabel As Button";
_btnprintlabel = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private btnReturn As Button";
_btnreturn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private btnSave As Button";
_btnsave = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private btnViewHeaderInfo As Button";
_btnviewheaderinfo = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private Panel1 As Panel";
_panel1 = new anywheresoftware.b4a.objects.PanelWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private txtScan As EditText";
_txtscan = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private ulv As UltimateListView";
_ulv = new flm.b4a.ultimatelistview.UltimateListViewWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private InputTemplate As B4XInputTemplate";
_inputtemplate = new b4a.SapyLiveSystem.b4xinputtemplate();
 //BA.debugLineNum = 14;BA.debugLine="Dim x As PoListype";
_x = new b4a.SapyLiveSystem.main._polistype();
 //BA.debugLineNum = 15;BA.debugLine="Private lblWarehouse As Label";
_lblwarehouse = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private BtnPrintPopup As Button";
_btnprintpopup = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private chkPrintAllTheSamePopup As CheckBox";
_chkprintallthesamepopup = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private lblCodePopup As Label";
_lblcodepopup = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private lblDescPopup As Label";
_lbldescpopup = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private lblQtyPopup As Label";
_lblqtypopup = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private txtPrintOnLabelPopup As EditText";
_txtprintonlabelpopup = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private txtQtyToPrintPopup As EditText";
_txtqtytoprintpopup = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private dialog As B4XDialog";
_dialog = new b4a.SapyLiveSystem.b4xdialog();
 //BA.debugLineNum = 24;BA.debugLine="Private chkAutoScale As CheckBox";
_chkautoscale = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private chkPrintAllSetValueEach As CheckBox";
_chkprintallsetvalueeach = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Dim blndontrun As Boolean";
_blndontrun = false;
 //BA.debugLineNum = 27;BA.debugLine="Private LStockForSapyLive As List";
_lstockforsapylive = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 28;BA.debugLine="Type   OrderInfo (id As Int, idInvoiceLines As In";
;
 //BA.debugLineNum = 29;BA.debugLine="Dim PrintertoPrinton As String";
_printertoprinton = "";
 //BA.debugLineNum = 30;BA.debugLine="Dim chkPrintAllTheSamePopup1 As Boolean";
_chkprintallthesamepopup1 = false;
 //BA.debugLineNum = 31;BA.debugLine="Dim chkAutoScale1 As Boolean";
_chkautoscale1 = false;
 //BA.debugLineNum = 32;BA.debugLine="Dim chkPrintAllSetValueEach1 As Boolean";
_chkprintallsetvalueeach1 = false;
 //BA.debugLineNum = 33;BA.debugLine="Private ValueToPrint As Int";
_valuetoprint = 0;
 //BA.debugLineNum = 34;BA.debugLine="Dim x As PoListype";
_x = new b4a.SapyLiveSystem.main._polistype();
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _createstock(double _qty,String _printerpath) throws Exception{
ResumableSub_CreateStock rsub = new ResumableSub_CreateStock(this,_qty,_printerpath);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_CreateStock extends BA.ResumableSub {
public ResumableSub_CreateStock(b4a.SapyLiveSystem.grvstockin parent,double _qty,String _printerpath) {
this.parent = parent;
this._qty = _qty;
this._printerpath = _printerpath;
}
b4a.SapyLiveSystem.grvstockin parent;
double _qty;
String _printerpath;
anywheresoftware.b4a.objects.collections.Map _map = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 746;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 747;BA.debugLine="map.Initialize";
_map.Initialize();
 //BA.debugLineNum = 749;BA.debugLine="map.Put(\"idInvoiceLines\", x.IdInvoiceLines)";
_map.Put((Object)("idInvoiceLines"),(Object)(parent._x.IdInvoiceLines /*int*/ ));
 //BA.debugLineNum = 750;BA.debugLine="map.Put(\"fQuantity\", qty)";
_map.Put((Object)("fQuantity"),(Object)(_qty));
 //BA.debugLineNum = 751;BA.debugLine="map.Put(\"fQtyChange\", qty)";
_map.Put((Object)("fQtyChange"),(Object)(_qty));
 //BA.debugLineNum = 752;BA.debugLine="map.Put(\"fQtyToProcess\", qty)";
_map.Put((Object)("fQtyToProcess"),(Object)(_qty));
 //BA.debugLineNum = 753;BA.debugLine="map.Put(\"fQtyLastProcess\", qty)";
_map.Put((Object)("fQtyLastProcess"),(Object)(_qty));
 //BA.debugLineNum = 754;BA.debugLine="map.Put(\"code\", x.code)";
_map.Put((Object)("code"),(Object)(parent._x.Code /*String*/ ));
 //BA.debugLineNum = 755;BA.debugLine="map.Put(\"description_1\", x.description_1)";
_map.Put((Object)("description_1"),(Object)(parent._x.description_1 /*String*/ ));
 //BA.debugLineNum = 756;BA.debugLine="map.Put(\"invNumber\", x.invNumber)";
_map.Put((Object)("invNumber"),(Object)(parent._x.InvNumber /*String*/ ));
 //BA.debugLineNum = 757;BA.debugLine="map.Put(\"invDate\", x.invDate)";
_map.Put((Object)("invDate"),(Object)(parent._x.invDate /*String*/ ));
 //BA.debugLineNum = 758;BA.debugLine="map.Put(\"orderDate\", x.orderDate)";
_map.Put((Object)("orderDate"),(Object)(parent._x.orderDate /*String*/ ));
 //BA.debugLineNum = 759;BA.debugLine="map.Put(\"dueDate\", x.dueDate)";
_map.Put((Object)("dueDate"),(Object)(parent._x.dueDate /*String*/ ));
 //BA.debugLineNum = 760;BA.debugLine="map.Put(\"deliveryDate\", x.deliveryDate)";
_map.Put((Object)("deliveryDate"),(Object)(parent._x.deliveryDate /*String*/ ));
 //BA.debugLineNum = 761;BA.debugLine="map.Put(\"orderNum\", x.orderNum)";
_map.Put((Object)("orderNum"),(Object)(parent._x.orderNum /*String*/ ));
 //BA.debugLineNum = 762;BA.debugLine="map.Put(\"invTotalIncl\", x.invTotalIncl)";
_map.Put((Object)("invTotalIncl"),(Object)(parent._x.invTotalIncl /*double*/ ));
 //BA.debugLineNum = 763;BA.debugLine="map.Put(\"ordTotExcl\", x.ordTotExcl)";
_map.Put((Object)("ordTotExcl"),(Object)(parent._x.OrdTotExcl /*double*/ ));
 //BA.debugLineNum = 764;BA.debugLine="map.Put(\"ordTotIncl\", x.ordTotIncl)";
_map.Put((Object)("ordTotIncl"),(Object)(parent._x.OrdTotIncl /*double*/ ));
 //BA.debugLineNum = 765;BA.debugLine="map.Put(\"invTotExcl\", x.invTotExcl)";
_map.Put((Object)("invTotExcl"),(Object)(parent._x.invTotExcl /*double*/ ));
 //BA.debugLineNum = 766;BA.debugLine="map.Put(\"invDiscAmnt\", x.invDiscAmnt)";
_map.Put((Object)("invDiscAmnt"),(Object)(parent._x.invDiscAmnt /*double*/ ));
 //BA.debugLineNum = 767;BA.debugLine="map.Put(\"invDisc\", x.invDisc)";
_map.Put((Object)("invDisc"),(Object)(parent._x.invDisc /*double*/ ));
 //BA.debugLineNum = 768;BA.debugLine="map.Put(\"extOrderNum\", x.extOrderNum)";
_map.Put((Object)("extOrderNum"),(Object)(parent._x.extOrderNum /*String*/ ));
 //BA.debugLineNum = 769;BA.debugLine="map.Put(\"account\", x.account)";
_map.Put((Object)("account"),(Object)(parent._x.account /*String*/ ));
 //BA.debugLineNum = 770;BA.debugLine="map.Put(\"name\", x.name)";
_map.Put((Object)("name"),(Object)(parent._x.name /*String*/ ));
 //BA.debugLineNum = 771;BA.debugLine="map.Put(\"autoIndex\", x.autoIndex)";
_map.Put((Object)("autoIndex"),(Object)(parent._x.autoIndex /*int*/ ));
 //BA.debugLineNum = 772;BA.debugLine="map.Put(\"fUnitPriceExcl\", x.fUnitPriceExcl)";
_map.Put((Object)("fUnitPriceExcl"),(Object)(parent._x.fUnitPriceExcl /*double*/ ));
 //BA.debugLineNum = 773;BA.debugLine="map.Put(\"fUnitPriceIncl\", x.fUnitPriceIncl)";
_map.Put((Object)("fUnitPriceIncl"),(Object)(parent._x.fUnitPriceIncl /*double*/ ));
 //BA.debugLineNum = 774;BA.debugLine="map.Put(\"biological\", x.biological)";
_map.Put((Object)("biological"),(Object)(parent._x.biological /*boolean*/ ));
 //BA.debugLineNum = 775;BA.debugLine="map.Put(\"chemical\", x.chemical)";
_map.Put((Object)("chemical"),(Object)(parent._x.chemical /*boolean*/ ));
 //BA.debugLineNum = 776;BA.debugLine="map.Put(\"physical\", x.physical)";
_map.Put((Object)("physical"),(Object)(parent._x.physical /*boolean*/ ));
 //BA.debugLineNum = 777;BA.debugLine="map.Put(\"allergens\", x.allergens)";
_map.Put((Object)("allergens"),(Object)(parent._x.allergens /*boolean*/ ));
 //BA.debugLineNum = 778;BA.debugLine="map.Put(\"transportCondition\", x.transportConditio";
_map.Put((Object)("transportCondition"),(Object)(parent._x.transportCondition /*boolean*/ ));
 //BA.debugLineNum = 779;BA.debugLine="map.Put(\"hmvTyreBlock\", x.hmvTyreBlock)";
_map.Put((Object)("hmvTyreBlock"),(Object)(parent._x.hmvTyreBlock /*boolean*/ ));
 //BA.debugLineNum = 780;BA.debugLine="map.Put(\"coa\", x.coa)";
_map.Put((Object)("coa"),(Object)(parent._x.coa /*boolean*/ ));
 //BA.debugLineNum = 781;BA.debugLine="map.Put(\"coapAth\", x.coapAth)";
_map.Put((Object)("coapAth"),(Object)(parent._x.Coapath /*String*/ ));
 //BA.debugLineNum = 782;BA.debugLine="map.Put(\"poNotesFromMobile\", x.poNotesFromMobile)";
_map.Put((Object)("poNotesFromMobile"),(Object)(parent._x.PoNotesFromMobile /*String*/ ));
 //BA.debugLineNum = 783;BA.debugLine="map.Put(\"NoOfPrints\",x.NoOfPrints)";
_map.Put((Object)("NoOfPrints"),(Object)(parent._x.NoOfPrints /*int*/ ));
 //BA.debugLineNum = 784;BA.debugLine="map.Put(\"UserName\",Main.UserLogin)";
_map.Put((Object)("UserName"),(Object)(parent._main._userlogin /*String*/ ));
 //BA.debugLineNum = 785;BA.debugLine="map.Put(\"MustPrint\",True)";
_map.Put((Object)("MustPrint"),(Object)(parent.__c.True));
 //BA.debugLineNum = 786;BA.debugLine="map.Put(\"PrinterPath\",PrinterPath)";
_map.Put((Object)("PrinterPath"),(Object)(_printerpath));
 //BA.debugLineNum = 787;BA.debugLine="map.Put(\"DCLink\",x.DCLink)";
_map.Put((Object)("DCLink"),(Object)(parent._x.DCLink /*int*/ ));
 //BA.debugLineNum = 791;BA.debugLine="If x.SupplierExpiryDate =Null Then";
if (true) break;

case 1:
//if
this.state = 6;
if (parent._x.SupplierExpiryDate /*String*/ == null) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 792;BA.debugLine="map.Put(\"SupplierExpiryDate\",\"2001-01-01\")";
_map.Put((Object)("SupplierExpiryDate"),(Object)("2001-01-01"));
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 794;BA.debugLine="map.Put(\"SupplierExpiryDate\",x.SupplierExpiryDat";
_map.Put((Object)("SupplierExpiryDate"),(Object)(parent._x.SupplierExpiryDate /*String*/ ));
 if (true) break;
;
 //BA.debugLineNum = 796;BA.debugLine="If lblWarehouse.Text = \"No Warehouse\" Then";

case 6:
//if
this.state = 11;
if ((parent._lblwarehouse.getText()).equals("No Warehouse")) { 
this.state = 8;
}else {
this.state = 10;
}if (true) break;

case 8:
//C
this.state = 11;
 if (true) break;

case 10:
//C
this.state = 11;
 //BA.debugLineNum = 799;BA.debugLine="map.Put(\"WarehouseId\",lblWarehouse.Text)";
_map.Put((Object)("WarehouseId"),(Object)(parent._lblwarehouse.getText()));
 if (true) break;
;
 //BA.debugLineNum = 803;BA.debugLine="If LStockForSapyLive.IsInitialized Then";

case 11:
//if
this.state = 16;
if (parent._lstockforsapylive.IsInitialized()) { 
this.state = 13;
}else {
this.state = 15;
}if (true) break;

case 13:
//C
this.state = 16;
 if (true) break;

case 15:
//C
this.state = 16;
 //BA.debugLineNum = 805;BA.debugLine="LStockForSapyLive.Initialize";
parent._lstockforsapylive.Initialize();
 if (true) break;

case 16:
//C
this.state = -1;
;
 //BA.debugLineNum = 808;BA.debugLine="LStockForSapyLive.Add(map)";
parent._lstockforsapylive.Add((Object)(_map.getObject()));
 //BA.debugLineNum = 809;BA.debugLine="Return 1";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(1));return;};
 //BA.debugLineNum = 810;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 39;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public void  _lblwarehouse_longclick() throws Exception{
ResumableSub_lblWarehouse_LongClick rsub = new ResumableSub_lblWarehouse_LongClick(this);
rsub.resume(ba, null);
}
public static class ResumableSub_lblWarehouse_LongClick extends BA.ResumableSub {
public ResumableSub_lblWarehouse_LongClick(b4a.SapyLiveSystem.grvstockin parent) {
this.parent = parent;
}
b4a.SapyLiveSystem.grvstockin parent;
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
 //BA.debugLineNum = 830;BA.debugLine="dialog.Initialize (Root)";
parent._dialog._initialize /*String*/ (ba,parent._root);
 //BA.debugLineNum = 831;BA.debugLine="InputTemplate.Initialize";
parent._inputtemplate._initialize /*String*/ (ba);
 //BA.debugLineNum = 832;BA.debugLine="InputTemplate.lblTitle.Text = \"Please Scan or Typ";
parent._inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Please Scan or Type Warehouse Id"));
 //BA.debugLineNum = 833;BA.debugLine="InputTemplate.Text=\"\"";
parent._inputtemplate._text /*String*/  = "";
 //BA.debugLineNum = 834;BA.debugLine="InputTemplate.lblTitle.TextColor = Colors.White";
parent._inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(parent.__c.Colors.White);
 //BA.debugLineNum = 836;BA.debugLine="InputTemplate.ConfigureForNumbers(False,False)";
parent._inputtemplate._configurefornumbers /*String*/ (parent.__c.False,parent.__c.False);
 //BA.debugLineNum = 837;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 838;BA.debugLine="If Result = xui.DialogResponse_Cancel Then";
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
 //BA.debugLineNum = 839;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 842;BA.debugLine="lblWarehouse.Text = InputTemplate.Text";
parent._lblwarehouse.setText(BA.ObjectToCharSequence(parent._inputtemplate._text /*String*/ ));
 //BA.debugLineNum = 844;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _loaddetails() throws Exception{
ResumableSub_LoadDetails rsub = new ResumableSub_LoadDetails(this);
rsub.resume(ba, null);
}
public static class ResumableSub_LoadDetails extends BA.ResumableSub {
public ResumableSub_LoadDetails(b4a.SapyLiveSystem.grvstockin parent) {
this.parent = parent;
}
b4a.SapyLiveSystem.grvstockin parent;
b4a.SapyLiveSystem.httpjob _j = null;
String _k = "";
String _downloadstring = "";
anywheresoftware.b4a.objects.collections.JSONParser _parser = null;
anywheresoftware.b4a.objects.collections.List _jroot = null;
anywheresoftware.b4a.objects.collections.Map _coljroot = null;
b4a.SapyLiveSystem.main._polistype _a = null;
double _fqtychange = 0;
double _invtotalincl = 0;
String _code = "";
double _invdisc = 0;
String _duedate = "";
String _ordernum = "";
String _description_1 = "";
double _invdiscamnt = 0;
String _extordernum = "";
double _invtotexcl = 0;
int _autoindex = 0;
String _invnumber = "";
double _fquantity = 0;
String _name = "";
double _fqtytoprocess = 0;
int _idinvoicelines = 0;
String _deliverydate = "";
double _fqtylastprocess = 0;
String _invdate = "";
String _orderdate = "";
String _account = "";
double _funitpriceexcl = 0;
double _funitpriceincl = 0;
double _ordtotexcl = 0;
double _ordtotincl = 0;
boolean _hmvtyreblock = false;
String _transportcondition = "";
boolean _coa = false;
boolean _chemical = false;
String _coapath = "";
boolean _biological = false;
boolean _physical = false;
boolean _allergens = false;
String _ponotesfrommobile = "";
String _clinenotes = "";
int _dclink = 0;
anywheresoftware.b4a.BA.IterableList group23;
int index23;
int groupLen23;

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
 //BA.debugLineNum = 83;BA.debugLine="Dim j As HttpJob";
_j = new b4a.SapyLiveSystem.httpjob();
 //BA.debugLineNum = 86;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 35;
this.catchState = 34;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 34;
 //BA.debugLineNum = 93;BA.debugLine="j.Initialize(txtScan.Text, Me)";
_j._initialize /*String*/ (ba,parent._txtscan.getText(),parent);
 //BA.debugLineNum = 94;BA.debugLine="Dim k As String";
_k = "";
 //BA.debugLineNum = 97;BA.debugLine="Dim downloadstring As String = Main.Server & \"/a";
_downloadstring = parent._main._server /*String*/ +"/api/SagePo/bypo/"+parent._txtscan.getText();
 //BA.debugLineNum = 100;BA.debugLine="Log(downloadstring)";
parent.__c.LogImpl("63014679",_downloadstring,0);
 //BA.debugLineNum = 101;BA.debugLine="j.Download( downloadstring)";
_j._download /*String*/ (_downloadstring);
 //BA.debugLineNum = 103;BA.debugLine="J.GetRequest.SetHeader(\"Authorization\",\"Bearer \"";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+parent._main._token /*String*/ );
 //BA.debugLineNum = 105;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 36;
return;
case 36:
//C
this.state = 4;
_j = (b4a.SapyLiveSystem.httpjob) result[0];
;
 //BA.debugLineNum = 106;BA.debugLine="If j.Success Then";
if (true) break;

case 4:
//if
this.state = 32;
if (_j._success /*boolean*/ ) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 107;BA.debugLine="Dim parser As JSONParser";
_parser = new anywheresoftware.b4a.objects.collections.JSONParser();
 //BA.debugLineNum = 108;BA.debugLine="parser.Initialize(j.GetString)";
_parser.Initialize(_j._getstring /*String*/ ());
 //BA.debugLineNum = 109;BA.debugLine="Dim jRoot As List = parser.NextArray";
_jroot = new anywheresoftware.b4a.objects.collections.List();
_jroot = _parser.NextArray();
 //BA.debugLineNum = 111;BA.debugLine="If jRoot.Size = 0 Then";
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
 //BA.debugLineNum = 112;BA.debugLine="ToastMessageShow(\"Invalid Po\",True)";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Invalid Po"),parent.__c.True);
 //BA.debugLineNum = 114;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
 //BA.debugLineNum = 116;BA.debugLine="If Main.PoListypel.IsInitialized Then";

case 10:
//if
this.state = 15;
if (parent._main._polistypel /*anywheresoftware.b4a.objects.collections.List*/ .IsInitialized()) { 
this.state = 12;
}else {
this.state = 14;
}if (true) break;

case 12:
//C
this.state = 15;
 if (true) break;

case 14:
//C
this.state = 15;
 //BA.debugLineNum = 120;BA.debugLine="Main.PoListypel.Initialize";
parent._main._polistypel /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 if (true) break;

case 15:
//C
this.state = 16;
;
 //BA.debugLineNum = 124;BA.debugLine="Main.PoListypel.Clear";
parent._main._polistypel /*anywheresoftware.b4a.objects.collections.List*/ .Clear();
 //BA.debugLineNum = 127;BA.debugLine="For Each coljRoot As Map In jRoot";
if (true) break;

case 16:
//for
this.state = 31;
_coljroot = new anywheresoftware.b4a.objects.collections.Map();
group23 = _jroot;
index23 = 0;
groupLen23 = group23.getSize();
this.state = 37;
if (true) break;

case 37:
//C
this.state = 31;
if (index23 < groupLen23) {
this.state = 18;
_coljroot = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(group23.Get(index23)));}
if (true) break;

case 38:
//C
this.state = 37;
index23++;
if (true) break;

case 18:
//C
this.state = 19;
 //BA.debugLineNum = 128;BA.debugLine="Dim a As PoListype";
_a = new b4a.SapyLiveSystem.main._polistype();
 //BA.debugLineNum = 129;BA.debugLine="Dim fQtyChange As Double = coljRoot.Get(\"fQtyC";
_fqtychange = (double)(BA.ObjectToNumber(_coljroot.Get((Object)("fQtyChange"))));
 //BA.debugLineNum = 130;BA.debugLine="Dim invTotalIncl As Double = coljRoot.Get(\"inv";
_invtotalincl = (double)(BA.ObjectToNumber(_coljroot.Get((Object)("invTotalIncl"))));
 //BA.debugLineNum = 131;BA.debugLine="Dim code As String = coljRoot.Get(\"code\")";
_code = BA.ObjectToString(_coljroot.Get((Object)("code")));
 //BA.debugLineNum = 132;BA.debugLine="Dim invDisc As Double = coljRoot.Get(\"invDisc\"";
_invdisc = (double)(BA.ObjectToNumber(_coljroot.Get((Object)("invDisc"))));
 //BA.debugLineNum = 133;BA.debugLine="Dim dueDate As String = coljRoot.Get(\"dueDate\"";
_duedate = BA.ObjectToString(_coljroot.Get((Object)("dueDate")));
 //BA.debugLineNum = 134;BA.debugLine="Dim orderNum As String = coljRoot.Get(\"orderNu";
_ordernum = BA.ObjectToString(_coljroot.Get((Object)("orderNum")));
 //BA.debugLineNum = 135;BA.debugLine="Dim description_1 As String = coljRoot.Get(\"de";
_description_1 = BA.ObjectToString(_coljroot.Get((Object)("description_1")));
 //BA.debugLineNum = 136;BA.debugLine="Dim invDiscAmnt As Double = coljRoot.Get(\"invD";
_invdiscamnt = (double)(BA.ObjectToNumber(_coljroot.Get((Object)("invDiscAmnt"))));
 //BA.debugLineNum = 137;BA.debugLine="Dim extOrderNum As String = coljRoot.Get(\"extO";
_extordernum = BA.ObjectToString(_coljroot.Get((Object)("extOrderNum")));
 //BA.debugLineNum = 138;BA.debugLine="Dim invTotExcl As Double = coljRoot.Get(\"invTo";
_invtotexcl = (double)(BA.ObjectToNumber(_coljroot.Get((Object)("invTotExcl"))));
 //BA.debugLineNum = 139;BA.debugLine="Dim autoIndex As Int = coljRoot.Get(\"autoIndex";
_autoindex = (int)(BA.ObjectToNumber(_coljroot.Get((Object)("autoIndex"))));
 //BA.debugLineNum = 140;BA.debugLine="Dim invNumber As String = coljRoot.Get(\"invNum";
_invnumber = BA.ObjectToString(_coljroot.Get((Object)("invNumber")));
 //BA.debugLineNum = 141;BA.debugLine="Dim fQuantity As Double = coljRoot.Get(\"fQuant";
_fquantity = (double)(BA.ObjectToNumber(_coljroot.Get((Object)("fQuantity"))));
 //BA.debugLineNum = 142;BA.debugLine="Dim name As String = coljRoot.Get(\"name\")";
_name = BA.ObjectToString(_coljroot.Get((Object)("name")));
 //BA.debugLineNum = 143;BA.debugLine="Dim fQtyToProcess As Double = coljRoot.Get(\"fQ";
_fqtytoprocess = (double)(BA.ObjectToNumber(_coljroot.Get((Object)("fQtyToProcess"))));
 //BA.debugLineNum = 144;BA.debugLine="Dim idInvoiceLines As Int = coljRoot.Get(\"idIn";
_idinvoicelines = (int)(BA.ObjectToNumber(_coljroot.Get((Object)("idInvoiceLines"))));
 //BA.debugLineNum = 145;BA.debugLine="Dim deliveryDate As String = coljRoot.Get(\"del";
_deliverydate = BA.ObjectToString(_coljroot.Get((Object)("deliveryDate")));
 //BA.debugLineNum = 146;BA.debugLine="Dim fQtyLastProcess As Double = coljRoot.Get(\"";
_fqtylastprocess = (double)(BA.ObjectToNumber(_coljroot.Get((Object)("fQtyLastProcess"))));
 //BA.debugLineNum = 147;BA.debugLine="Dim invDate As String = coljRoot.Get(\"invDate\"";
_invdate = BA.ObjectToString(_coljroot.Get((Object)("invDate")));
 //BA.debugLineNum = 148;BA.debugLine="Dim orderDate As String = coljRoot.Get(\"orderD";
_orderdate = BA.ObjectToString(_coljroot.Get((Object)("orderDate")));
 //BA.debugLineNum = 149;BA.debugLine="Dim account As String = coljRoot.Get(\"account\"";
_account = BA.ObjectToString(_coljroot.Get((Object)("account")));
 //BA.debugLineNum = 150;BA.debugLine="Dim fUnitPriceExcl As Double = coljRoot.Get(\"f";
_funitpriceexcl = (double)(BA.ObjectToNumber(_coljroot.Get((Object)("fUnitPriceExcl"))));
 //BA.debugLineNum = 151;BA.debugLine="Dim fUnitPriceIncl As Double = coljRoot.Get(\"f";
_funitpriceincl = (double)(BA.ObjectToNumber(_coljroot.Get((Object)("fUnitPriceIncl"))));
 //BA.debugLineNum = 152;BA.debugLine="Dim OrdTotExcl As Double = coljRoot.Get(\"ordTo";
_ordtotexcl = (double)(BA.ObjectToNumber(_coljroot.Get((Object)("ordTotExcl"))));
 //BA.debugLineNum = 153;BA.debugLine="Dim OrdTotIncl As Double = coljRoot.Get(\"ordTo";
_ordtotincl = (double)(BA.ObjectToNumber(_coljroot.Get((Object)("ordTotIncl"))));
 //BA.debugLineNum = 154;BA.debugLine="Dim hmvTyreBlock As Boolean = coljRoot.Get(\"hm";
_hmvtyreblock = BA.ObjectToBoolean(_coljroot.Get((Object)("hmvTyreBlock")));
 //BA.debugLineNum = 156;BA.debugLine="Dim transportCondition As String = coljRoot.Ge";
_transportcondition = BA.ObjectToString(_coljroot.Get((Object)("transportCondition")));
 //BA.debugLineNum = 157;BA.debugLine="Dim coa As Boolean = coljRoot.Get(\"coa\")";
_coa = BA.ObjectToBoolean(_coljroot.Get((Object)("coa")));
 //BA.debugLineNum = 158;BA.debugLine="Dim chemical As Boolean = coljRoot.Get(\"chemic";
_chemical = BA.ObjectToBoolean(_coljroot.Get((Object)("chemical")));
 //BA.debugLineNum = 159;BA.debugLine="Dim coapAth As String = coljRoot.Get(\"coapAth\"";
_coapath = BA.ObjectToString(_coljroot.Get((Object)("coapAth")));
 //BA.debugLineNum = 160;BA.debugLine="Dim hmvTyreBlock As Boolean = coljRoot.Get(\"hm";
_hmvtyreblock = BA.ObjectToBoolean(_coljroot.Get((Object)("hmvTyreBlock")));
 //BA.debugLineNum = 161;BA.debugLine="Dim biological As Boolean = coljRoot.Get(\"biol";
_biological = BA.ObjectToBoolean(_coljroot.Get((Object)("biological")));
 //BA.debugLineNum = 162;BA.debugLine="Dim physical As Boolean = coljRoot.Get(\"physic";
_physical = BA.ObjectToBoolean(_coljroot.Get((Object)("physical")));
 //BA.debugLineNum = 163;BA.debugLine="Dim allergens As Boolean = coljRoot.Get(\"aller";
_allergens = BA.ObjectToBoolean(_coljroot.Get((Object)("allergens")));
 //BA.debugLineNum = 164;BA.debugLine="Dim PoNotesFromMobile As String = coljRoot.Get";
_ponotesfrommobile = BA.ObjectToString(_coljroot.Get((Object)("PoNotesFromMobile")));
 //BA.debugLineNum = 165;BA.debugLine="Dim ClineNotes As String = coljRoot.Get(\"Cline";
_clinenotes = BA.ObjectToString(_coljroot.Get((Object)("ClineNotes")));
 //BA.debugLineNum = 167;BA.debugLine="Dim DCLink As Int";
_dclink = 0;
 //BA.debugLineNum = 168;BA.debugLine="Try";
if (true) break;

case 19:
//try
this.state = 24;
this.catchState = 23;
this.state = 21;
if (true) break;

case 21:
//C
this.state = 24;
this.catchState = 23;
 //BA.debugLineNum = 169;BA.debugLine="DCLink= coljRoot.Get(\"dcLink\")";
_dclink = (int)(BA.ObjectToNumber(_coljroot.Get((Object)("dcLink"))));
 if (true) break;

case 23:
//C
this.state = 24;
this.catchState = 34;
 //BA.debugLineNum = 171;BA.debugLine="DCLink = 0";
_dclink = (int) (0);
 if (true) break;
if (true) break;

case 24:
//C
this.state = 25;
this.catchState = 34;
;
 //BA.debugLineNum = 174;BA.debugLine="a.DCLink = DCLink";
_a.DCLink /*int*/  = _dclink;
 //BA.debugLineNum = 175;BA.debugLine="a.invTotalIncl = invTotalIncl";
_a.invTotalIncl /*double*/  = _invtotalincl;
 //BA.debugLineNum = 176;BA.debugLine="a.code = code";
_a.Code /*String*/  = _code;
 //BA.debugLineNum = 177;BA.debugLine="a.invDisc = invDisc";
_a.invDisc /*double*/  = _invdisc;
 //BA.debugLineNum = 178;BA.debugLine="a.dueDate = dueDate";
_a.dueDate /*String*/  = _duedate;
 //BA.debugLineNum = 179;BA.debugLine="a.orderNum = orderNum";
_a.orderNum /*String*/  = _ordernum;
 //BA.debugLineNum = 180;BA.debugLine="a.description_1 = description_1";
_a.description_1 /*String*/  = _description_1;
 //BA.debugLineNum = 181;BA.debugLine="a.invDiscAmnt = invDiscAmnt";
_a.invDiscAmnt /*double*/  = _invdiscamnt;
 //BA.debugLineNum = 182;BA.debugLine="a.extOrderNum = extOrderNum";
_a.extOrderNum /*String*/  = _extordernum;
 //BA.debugLineNum = 183;BA.debugLine="a.invTotExcl = invTotExcl";
_a.invTotExcl /*double*/  = _invtotexcl;
 //BA.debugLineNum = 184;BA.debugLine="a.autoIndex = autoIndex";
_a.autoIndex /*int*/  = _autoindex;
 //BA.debugLineNum = 185;BA.debugLine="a.invNumber = invNumber";
_a.InvNumber /*String*/  = _invnumber;
 //BA.debugLineNum = 186;BA.debugLine="a.fQuantity = fQuantity";
_a.fQuantity /*double*/  = _fquantity;
 //BA.debugLineNum = 187;BA.debugLine="a.name = name";
_a.name /*String*/  = _name;
 //BA.debugLineNum = 188;BA.debugLine="a.ClineNotes = ClineNotes";
_a.ClineNotes /*String*/  = _clinenotes;
 //BA.debugLineNum = 190;BA.debugLine="a.hmvTyreBlock= hmvTyreBlock";
_a.hmvTyreBlock /*boolean*/  = _hmvtyreblock;
 //BA.debugLineNum = 193;BA.debugLine="If a.fQtyToProcess =0 Then";
if (true) break;

case 25:
//if
this.state = 30;
if (_a.fQtyToProcess /*double*/ ==0) { 
this.state = 27;
}else {
this.state = 29;
}if (true) break;

case 27:
//C
this.state = 30;
 //BA.debugLineNum = 195;BA.debugLine="a.fQtyToProcess = fQuantity";
_a.fQtyToProcess /*double*/  = _fquantity;
 if (true) break;

case 29:
//C
this.state = 30;
 //BA.debugLineNum = 197;BA.debugLine="a.fQtyToProcess = fQtyToProcess";
_a.fQtyToProcess /*double*/  = _fqtytoprocess;
 if (true) break;

case 30:
//C
this.state = 38;
;
 //BA.debugLineNum = 202;BA.debugLine="a.idInvoiceLines = idInvoiceLines";
_a.IdInvoiceLines /*int*/  = _idinvoicelines;
 //BA.debugLineNum = 203;BA.debugLine="a.deliveryDate = deliveryDate";
_a.deliveryDate /*String*/  = _deliverydate;
 //BA.debugLineNum = 204;BA.debugLine="a.fQtyLastProcess = fQtyLastProcess";
_a.fQtyLastProcess /*double*/  = _fqtylastprocess;
 //BA.debugLineNum = 205;BA.debugLine="a.invDate = invDate";
_a.invDate /*String*/  = _invdate;
 //BA.debugLineNum = 206;BA.debugLine="a.orderDate = orderDate";
_a.orderDate /*String*/  = _orderdate;
 //BA.debugLineNum = 207;BA.debugLine="a.account = account";
_a.account /*String*/  = _account;
 //BA.debugLineNum = 208;BA.debugLine="a.OrdTotExcl = OrdTotExcl";
_a.OrdTotExcl /*double*/  = _ordtotexcl;
 //BA.debugLineNum = 209;BA.debugLine="a.OrdTotIncl = OrdTotIncl";
_a.OrdTotIncl /*double*/  = _ordtotincl;
 //BA.debugLineNum = 210;BA.debugLine="a.fUnitPriceExcl = fUnitPriceExcl";
_a.fUnitPriceExcl /*double*/  = _funitpriceexcl;
 //BA.debugLineNum = 211;BA.debugLine="a.fUnitPriceIncl = fUnitPriceIncl";
_a.fUnitPriceIncl /*double*/  = _funitpriceincl;
 //BA.debugLineNum = 212;BA.debugLine="a.transportCondition= transportCondition";
_a.transportCondition /*boolean*/  = BA.ObjectToBoolean(_transportcondition);
 //BA.debugLineNum = 213;BA.debugLine="a.coa= coa";
_a.coa /*boolean*/  = _coa;
 //BA.debugLineNum = 214;BA.debugLine="a.chemical= chemical";
_a.chemical /*boolean*/  = _chemical;
 //BA.debugLineNum = 215;BA.debugLine="a.Coapath= coapAth";
_a.Coapath /*String*/  = _coapath;
 //BA.debugLineNum = 216;BA.debugLine="a.hmvTypeBlock= hmvTyreBlock";
_a.hmvTypeBlock /*boolean*/  = _hmvtyreblock;
 //BA.debugLineNum = 217;BA.debugLine="a.biological= biological";
_a.biological /*boolean*/  = _biological;
 //BA.debugLineNum = 218;BA.debugLine="a.physical= physical";
_a.physical /*boolean*/  = _physical;
 //BA.debugLineNum = 219;BA.debugLine="a.allergens= allergens";
_a.allergens /*boolean*/  = _allergens;
 //BA.debugLineNum = 220;BA.debugLine="a.PoNotesFromMobile = PoNotesFromMobile";
_a.PoNotesFromMobile /*String*/  = _ponotesfrommobile;
 //BA.debugLineNum = 221;BA.debugLine="a.NoOfPrints = Round2(fQuantity,0)";
_a.NoOfPrints /*int*/  = (int) (parent.__c.Round2(_fquantity,(int) (0)));
 //BA.debugLineNum = 223;BA.debugLine="Main.PoListypel.Add(a)";
parent._main._polistypel /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_a));
 if (true) break;
if (true) break;

case 31:
//C
this.state = 32;
;
 if (true) break;

case 32:
//C
this.state = 35;
;
 //BA.debugLineNum = 229;BA.debugLine="j.Release";
_j._release /*String*/ ();
 if (true) break;

case 34:
//C
this.state = 35;
this.catchState = 0;
 //BA.debugLineNum = 231;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("63014810",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 35:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 235;BA.debugLine="PopulateULV";
parent._populateulv();
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
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
public String  _populateulv() throws Exception{
int[] _cellwidths = null;
 //BA.debugLineNum = 238;BA.debugLine="Sub PopulateULV";
 //BA.debugLineNum = 239;BA.debugLine="Panel1.RemoveAllViews";
_panel1.RemoveAllViews();
 //BA.debugLineNum = 241;BA.debugLine="ulv.Initialize(0,0,\"\",\"ULV\")";
_ulv.Initialize(ba,(byte) (0),(int) (0),"","ULV");
 //BA.debugLineNum = 242;BA.debugLine="ulv.DividerHeight = 3dip";
_ulv.setDividerHeight(__c.DipToCurrent((int) (3)));
 //BA.debugLineNum = 244;BA.debugLine="ulv.FastScroller(True)";
_ulv.FastScroller(__c.True);
 //BA.debugLineNum = 245;BA.debugLine="ulv.Color=Colors.Black";
_ulv.setColor(__c.Colors.Black);
 //BA.debugLineNum = 246;BA.debugLine="ulv.SelectionMode = ulv.SELECTION_SINGLE";
_ulv.setSelectionMode(_ulv.SELECTION_SINGLE);
 //BA.debugLineNum = 247;BA.debugLine="ulv.Tag = \"ReceiptHeader\"";
_ulv.setTag((Object)("ReceiptHeader"));
 //BA.debugLineNum = 249;BA.debugLine="Dim cellwidths() As Int = Array As Int(15%x,55%x,";
_cellwidths = new int[]{__c.PerXToCurrent((float) (15),ba),__c.PerXToCurrent((float) (55),ba),__c.PerXToCurrent((float) (15),ba),__c.PerXToCurrent((float) (15),ba)};
 //BA.debugLineNum = 251;BA.debugLine="ulv.AddRowLayout(\"ReceiptHeader\",\"ReceiptHeader_L";
_ulv.AddRowLayout("ReceiptHeader","ReceiptHeader_Layout","ReceiptHeader_filler",__c.DipToCurrent((int) (50)),(byte) (_cellwidths.length),_cellwidths,(int) (0),__c.Colors.White,__c.True);
 //BA.debugLineNum = 253;BA.debugLine="Panel1.AddView(ulv,0%x,0%y,Panel1.Width-2dip,Pane";
_panel1.AddView((android.view.View)(_ulv.getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (0),ba),(int) (_panel1.getWidth()-__c.DipToCurrent((int) (2))),(int) (_panel1.getHeight()-__c.DipToCurrent((int) (2))));
 //BA.debugLineNum = 256;BA.debugLine="ulv.BulkAddItems(Main.PoListypel.Size,\"ReceiptHea";
_ulv.BulkAddItems(_main._polistypel /*anywheresoftware.b4a.objects.collections.List*/ .getSize(),"ReceiptHeader",(int) (0));
 //BA.debugLineNum = 258;BA.debugLine="Log(\"End popULVProduct\")";
__c.LogImpl("63080212","End popULVProduct",0);
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _postprint() throws Exception{
ResumableSub_postprint rsub = new ResumableSub_postprint(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_postprint extends BA.ResumableSub {
public ResumableSub_postprint(b4a.SapyLiveSystem.grvstockin parent) {
this.parent = parent;
}
b4a.SapyLiveSystem.grvstockin parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
 //BA.debugLineNum = 817;BA.debugLine="Return 1";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(1));return;};
 //BA.debugLineNum = 818;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _receiptheader_filler(long _rowid,String _layoutname,anywheresoftware.b4a.objects.PanelWrapper _cellpanel,byte _cellindex,int _position) throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
 //BA.debugLineNum = 303;BA.debugLine="Sub ReceiptHeader_filler(RowID As Long, LayoutName";
 //BA.debugLineNum = 307;BA.debugLine="Dim x As PoListype = Main.PoListypel.Get(RowID)";
_x = (b4a.SapyLiveSystem.main._polistype)(_main._polistypel /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (_rowid)));
 //BA.debugLineNum = 309;BA.debugLine="Select CellIndex";
switch (BA.switchObjectToInt(_cellindex,(byte) (0),(byte) (1),(byte) (2),(byte) (3))) {
case 0: {
 //BA.debugLineNum = 313;BA.debugLine="Try";
try { //BA.debugLineNum = 314;BA.debugLine="Dim lbl As Label = CellPanel.GetView(0)";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_cellpanel.GetView((int) (0)).getObject()));
 //BA.debugLineNum = 315;BA.debugLine="lbl.TextColor = Colors.Black";
_lbl.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 316;BA.debugLine="lbl.Text=x.Code";
_lbl.setText(BA.ObjectToCharSequence(_x.Code /*String*/ ));
 } 
       catch (Exception e9) {
			ba.setLastException(e9); //BA.debugLineNum = 318;BA.debugLine="Log(\"Error : \" & LastException)";
__c.LogImpl("63211279","Error : "+BA.ObjectToString(__c.LastException(ba)),0);
 };
 break; }
case 1: {
 //BA.debugLineNum = 325;BA.debugLine="Dim lbl As Label = CellPanel.GetView(0)";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_cellpanel.GetView((int) (0)).getObject()));
 //BA.debugLineNum = 326;BA.debugLine="lbl.TextColor = Colors.Black";
_lbl.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 327;BA.debugLine="lbl.Text=x.description_1";
_lbl.setText(BA.ObjectToCharSequence(_x.description_1 /*String*/ ));
 break; }
case 2: {
 //BA.debugLineNum = 329;BA.debugLine="Dim lbl As Label = CellPanel.GetView(0)";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_cellpanel.GetView((int) (0)).getObject()));
 //BA.debugLineNum = 330;BA.debugLine="lbl.TextColor = Colors.Black";
_lbl.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 331;BA.debugLine="lbl.Text=x.fQuantity";
_lbl.setText(BA.ObjectToCharSequence(_x.fQuantity /*double*/ ));
 break; }
case 3: {
 //BA.debugLineNum = 334;BA.debugLine="Dim lbl As Label = CellPanel.GetView(0)";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
_lbl = (anywheresoftware.b4a.objects.LabelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.LabelWrapper(), (android.widget.TextView)(_cellpanel.GetView((int) (0)).getObject()));
 //BA.debugLineNum = 335;BA.debugLine="lbl.TextColor = Colors.Black";
_lbl.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 336;BA.debugLine="lbl.Text=x.fQtyToProcess";
_lbl.setText(BA.ObjectToCharSequence(_x.fQtyToProcess /*double*/ ));
 break; }
}
;
 //BA.debugLineNum = 351;BA.debugLine="End Sub";
return "";
}
public String  _receiptheader_layout(String _layoutname,anywheresoftware.b4a.objects.PanelWrapper _cellpanel,byte _cellindex) throws Exception{
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
 //BA.debugLineNum = 262;BA.debugLine="Sub ReceiptHeader_Layout(LayoutName As String, Cel";
 //BA.debugLineNum = 263;BA.debugLine="Select CellIndex";
switch (BA.switchObjectToInt(_cellindex,(byte) (0),(byte) (1),(byte) (2),(byte) (3))) {
case 0: {
 //BA.debugLineNum = 267;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 268;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
 //BA.debugLineNum = 269;BA.debugLine="lbl.Gravity = Gravity.CENTER_VERTICAL";
_lbl.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 270;BA.debugLine="lbl.TextColor =  Colors.Black";
_lbl.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 271;BA.debugLine="lbl.TextSize = 10";
_lbl.setTextSize((float) (10));
 //BA.debugLineNum = 273;BA.debugLine="CellPanel.AddView(lbl, 5dip, 5dip, CellPanel.Wi";
_cellpanel.AddView((android.view.View)(_lbl.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5)),(int) (_cellpanel.getWidth()-__c.DipToCurrent((int) (10))),(int) (_cellpanel.getHeight()-__c.DipToCurrent((int) (2))));
 break; }
case 1: {
 //BA.debugLineNum = 275;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 276;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
 //BA.debugLineNum = 277;BA.debugLine="lbl.Gravity = Gravity.CENTER_VERTICAL";
_lbl.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 278;BA.debugLine="lbl.TextColor =  Colors.Black";
_lbl.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 279;BA.debugLine="lbl.TextSize = 10";
_lbl.setTextSize((float) (10));
 //BA.debugLineNum = 281;BA.debugLine="CellPanel.AddView(lbl, 5dip, 5dip, CellPanel.Wi";
_cellpanel.AddView((android.view.View)(_lbl.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5)),(int) (_cellpanel.getWidth()-__c.DipToCurrent((int) (10))),(int) (_cellpanel.getHeight()-__c.DipToCurrent((int) (2))));
 break; }
case 2: {
 //BA.debugLineNum = 284;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 285;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
 //BA.debugLineNum = 286;BA.debugLine="lbl.Gravity = Gravity.CENTER_VERTICAL";
_lbl.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 287;BA.debugLine="lbl.TextColor =  Colors.Black";
_lbl.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 288;BA.debugLine="lbl.TextSize = 10";
_lbl.setTextSize((float) (10));
 //BA.debugLineNum = 289;BA.debugLine="CellPanel.AddView(lbl, 5dip, 5dip, CellPanel.Wi";
_cellpanel.AddView((android.view.View)(_lbl.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5)),(int) (_cellpanel.getWidth()-__c.DipToCurrent((int) (10))),(int) (_cellpanel.getHeight()-__c.DipToCurrent((int) (2))));
 break; }
case 3: {
 //BA.debugLineNum = 292;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 293;BA.debugLine="lbl.Initialize(\"\")";
_lbl.Initialize(ba,"");
 //BA.debugLineNum = 294;BA.debugLine="lbl.Gravity = Gravity.CENTER_VERTICAL";
_lbl.setGravity(__c.Gravity.CENTER_VERTICAL);
 //BA.debugLineNum = 295;BA.debugLine="lbl.TextColor =  Colors.Black";
_lbl.setTextColor(__c.Colors.Black);
 //BA.debugLineNum = 296;BA.debugLine="lbl.TextSize = 10";
_lbl.setTextSize((float) (10));
 //BA.debugLineNum = 297;BA.debugLine="CellPanel.AddView(lbl, 5dip, 5dip, CellPanel.Wi";
_cellpanel.AddView((android.view.View)(_lbl.getObject()),__c.DipToCurrent((int) (5)),__c.DipToCurrent((int) (5)),(int) (_cellpanel.getWidth()-__c.DipToCurrent((int) (10))),(int) (_cellpanel.getHeight()-__c.DipToCurrent((int) (2))));
 break; }
}
;
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return "";
}
public void  _savepo(String _printerpath,boolean _mustprint) throws Exception{
ResumableSub_SavePo rsub = new ResumableSub_SavePo(this,_printerpath,_mustprint);
rsub.resume(ba, null);
}
public static class ResumableSub_SavePo extends BA.ResumableSub {
public ResumableSub_SavePo(b4a.SapyLiveSystem.grvstockin parent,String _printerpath,boolean _mustprint) {
this.parent = parent;
this._printerpath = _printerpath;
this._mustprint = _mustprint;
}
b4a.SapyLiveSystem.grvstockin parent;
String _printerpath;
boolean _mustprint;
String _supplinv = "";
int _result = 0;
int _rowid = 0;
anywheresoftware.b4a.objects.collections.List _l = null;
Object _row = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
String _data = "";
b4a.SapyLiveSystem.httpjob _j = null;
String _strwww = "";
String _strpolocy = "";
anywheresoftware.b4a.BA.IterableList group18;
int index18;
int groupLen18;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 426;BA.debugLine="Dim supplInv As String";
_supplinv = "";
 //BA.debugLineNum = 427;BA.debugLine="dialog.Initialize (Root)";
parent._dialog._initialize /*String*/ (ba,parent._root);
 //BA.debugLineNum = 428;BA.debugLine="InputTemplate.Initialize";
parent._inputtemplate._initialize /*String*/ (ba);
 //BA.debugLineNum = 429;BA.debugLine="InputTemplate.lblTitle.Text = \"Please enter the s";
parent._inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setText(BA.ObjectToCharSequence("Please enter the supplier Invoice No"));
 //BA.debugLineNum = 430;BA.debugLine="InputTemplate.Text=\"\"";
parent._inputtemplate._text /*String*/  = "";
 //BA.debugLineNum = 431;BA.debugLine="InputTemplate.lblTitle.TextColor = Colors.White";
parent._inputtemplate._lbltitle /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .setTextColor(parent.__c.Colors.White);
 //BA.debugLineNum = 432;BA.debugLine="Wait For (dialog.ShowTemplate(InputTemplate, \"OK\"";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._inputtemplate),(Object)("OK"),(Object)(""),(Object)("CANCEL")));
this.state = 30;
return;
case 30:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 433;BA.debugLine="If Result = xui.DialogResponse_Cancel Then";
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
 //BA.debugLineNum = 434;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = 5;
;
 //BA.debugLineNum = 436;BA.debugLine="supplInv = InputTemplate.Text";
_supplinv = parent._inputtemplate._text /*String*/ ;
 //BA.debugLineNum = 438;BA.debugLine="If supplInv=\"\" Then";
if (true) break;

case 5:
//if
this.state = 8;
if ((_supplinv).equals("")) { 
this.state = 7;
}if (true) break;

case 7:
//C
this.state = 8;
 //BA.debugLineNum = 439;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
this.state = 9;
;
 //BA.debugLineNum = 443;BA.debugLine="Dim RowId As Int = 0";
_rowid = (int) (0);
 //BA.debugLineNum = 446;BA.debugLine="Dim l As List";
_l = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 447;BA.debugLine="l.Initialize";
_l.Initialize();
 //BA.debugLineNum = 449;BA.debugLine="For Each Row In Main.PoListypel";
if (true) break;

case 9:
//for
this.state = 23;
group18 = parent._main._polistypel /*anywheresoftware.b4a.objects.collections.List*/ ;
index18 = 0;
groupLen18 = group18.getSize();
this.state = 31;
if (true) break;

case 31:
//C
this.state = 23;
if (index18 < groupLen18) {
this.state = 11;
_row = group18.Get(index18);}
if (true) break;

case 32:
//C
this.state = 31;
index18++;
if (true) break;

case 11:
//C
this.state = 12;
 //BA.debugLineNum = 452;BA.debugLine="Dim x As PoListype = Main.PoListypel.Get(RowId)";
parent._x = (b4a.SapyLiveSystem.main._polistype)(parent._main._polistypel /*anywheresoftware.b4a.objects.collections.List*/ .Get(_rowid));
 //BA.debugLineNum = 455;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 456;BA.debugLine="map.Initialize";
_map.Initialize();
 //BA.debugLineNum = 458;BA.debugLine="map.Put(\"idInvoiceLines\", x.IdInvoiceLines)";
_map.Put((Object)("idInvoiceLines"),(Object)(parent._x.IdInvoiceLines /*int*/ ));
 //BA.debugLineNum = 459;BA.debugLine="map.Put(\"fQuantity\", x.fQuantity)";
_map.Put((Object)("fQuantity"),(Object)(parent._x.fQuantity /*double*/ ));
 //BA.debugLineNum = 460;BA.debugLine="map.Put(\"fQtyChange\", x.fQtyChange)";
_map.Put((Object)("fQtyChange"),(Object)(parent._x.fQtyChange /*double*/ ));
 //BA.debugLineNum = 461;BA.debugLine="map.Put(\"fQtyToProcess\", x.fQtyToProcess)";
_map.Put((Object)("fQtyToProcess"),(Object)(parent._x.fQtyToProcess /*double*/ ));
 //BA.debugLineNum = 462;BA.debugLine="map.Put(\"fQtyLastProcess\", x.fQtyLastProcess)";
_map.Put((Object)("fQtyLastProcess"),(Object)(parent._x.fQtyLastProcess /*double*/ ));
 //BA.debugLineNum = 463;BA.debugLine="map.Put(\"code\", x.code)";
_map.Put((Object)("code"),(Object)(parent._x.Code /*String*/ ));
 //BA.debugLineNum = 464;BA.debugLine="map.Put(\"description_1\", x.description_1)";
_map.Put((Object)("description_1"),(Object)(parent._x.description_1 /*String*/ ));
 //BA.debugLineNum = 465;BA.debugLine="map.Put(\"invNumber\", x.invNumber)";
_map.Put((Object)("invNumber"),(Object)(parent._x.InvNumber /*String*/ ));
 //BA.debugLineNum = 466;BA.debugLine="map.Put(\"invDate\", x.invDate)";
_map.Put((Object)("invDate"),(Object)(parent._x.invDate /*String*/ ));
 //BA.debugLineNum = 467;BA.debugLine="map.Put(\"orderDate\", x.orderDate)";
_map.Put((Object)("orderDate"),(Object)(parent._x.orderDate /*String*/ ));
 //BA.debugLineNum = 468;BA.debugLine="map.Put(\"dueDate\", x.dueDate)";
_map.Put((Object)("dueDate"),(Object)(parent._x.dueDate /*String*/ ));
 //BA.debugLineNum = 469;BA.debugLine="map.Put(\"deliveryDate\", x.deliveryDate)";
_map.Put((Object)("deliveryDate"),(Object)(parent._x.deliveryDate /*String*/ ));
 //BA.debugLineNum = 470;BA.debugLine="map.Put(\"orderNum\", x.orderNum)";
_map.Put((Object)("orderNum"),(Object)(parent._x.orderNum /*String*/ ));
 //BA.debugLineNum = 471;BA.debugLine="map.Put(\"invTotalIncl\", x.invTotalIncl)";
_map.Put((Object)("invTotalIncl"),(Object)(parent._x.invTotalIncl /*double*/ ));
 //BA.debugLineNum = 472;BA.debugLine="map.Put(\"ordTotExcl\", x.ordTotExcl)";
_map.Put((Object)("ordTotExcl"),(Object)(parent._x.OrdTotExcl /*double*/ ));
 //BA.debugLineNum = 473;BA.debugLine="map.Put(\"ordTotIncl\", x.ordTotIncl)";
_map.Put((Object)("ordTotIncl"),(Object)(parent._x.OrdTotIncl /*double*/ ));
 //BA.debugLineNum = 474;BA.debugLine="map.Put(\"invTotExcl\", x.invTotExcl)";
_map.Put((Object)("invTotExcl"),(Object)(parent._x.invTotExcl /*double*/ ));
 //BA.debugLineNum = 475;BA.debugLine="map.Put(\"invDiscAmnt\", x.invDiscAmnt)";
_map.Put((Object)("invDiscAmnt"),(Object)(parent._x.invDiscAmnt /*double*/ ));
 //BA.debugLineNum = 476;BA.debugLine="map.Put(\"invDisc\", x.invDisc)";
_map.Put((Object)("invDisc"),(Object)(parent._x.invDisc /*double*/ ));
 //BA.debugLineNum = 477;BA.debugLine="map.Put(\"extOrderNum\", x.extOrderNum)";
_map.Put((Object)("extOrderNum"),(Object)(parent._x.extOrderNum /*String*/ ));
 //BA.debugLineNum = 478;BA.debugLine="map.Put(\"account\", x.account)";
_map.Put((Object)("account"),(Object)(parent._x.account /*String*/ ));
 //BA.debugLineNum = 479;BA.debugLine="map.Put(\"name\", x.name)";
_map.Put((Object)("name"),(Object)(parent._x.name /*String*/ ));
 //BA.debugLineNum = 480;BA.debugLine="map.Put(\"autoIndex\", x.autoIndex)";
_map.Put((Object)("autoIndex"),(Object)(parent._x.autoIndex /*int*/ ));
 //BA.debugLineNum = 481;BA.debugLine="map.Put(\"fUnitPriceExcl\", x.fUnitPriceExcl)";
_map.Put((Object)("fUnitPriceExcl"),(Object)(parent._x.fUnitPriceExcl /*double*/ ));
 //BA.debugLineNum = 482;BA.debugLine="map.Put(\"fUnitPriceIncl\", x.fUnitPriceIncl)";
_map.Put((Object)("fUnitPriceIncl"),(Object)(parent._x.fUnitPriceIncl /*double*/ ));
 //BA.debugLineNum = 483;BA.debugLine="map.Put(\"biological\", x.biological)";
_map.Put((Object)("biological"),(Object)(parent._x.biological /*boolean*/ ));
 //BA.debugLineNum = 484;BA.debugLine="map.Put(\"chemical\", x.chemical)";
_map.Put((Object)("chemical"),(Object)(parent._x.chemical /*boolean*/ ));
 //BA.debugLineNum = 485;BA.debugLine="map.Put(\"physical\", x.physical)";
_map.Put((Object)("physical"),(Object)(parent._x.physical /*boolean*/ ));
 //BA.debugLineNum = 486;BA.debugLine="map.Put(\"allergens\", x.allergens)";
_map.Put((Object)("allergens"),(Object)(parent._x.allergens /*boolean*/ ));
 //BA.debugLineNum = 487;BA.debugLine="map.Put(\"transportCondition\", x.transportConditi";
_map.Put((Object)("transportCondition"),(Object)(parent._x.transportCondition /*boolean*/ ));
 //BA.debugLineNum = 488;BA.debugLine="map.Put(\"hmvTyreBlock\", x.hmvTyreBlock)";
_map.Put((Object)("hmvTyreBlock"),(Object)(parent._x.hmvTyreBlock /*boolean*/ ));
 //BA.debugLineNum = 489;BA.debugLine="map.Put(\"coa\", x.coa)";
_map.Put((Object)("coa"),(Object)(parent._x.coa /*boolean*/ ));
 //BA.debugLineNum = 490;BA.debugLine="map.Put(\"coapAth\", x.coapAth)";
_map.Put((Object)("coapAth"),(Object)(parent._x.Coapath /*String*/ ));
 //BA.debugLineNum = 491;BA.debugLine="map.Put(\"poNotesFromMobile\", x.poNotesFromMobile";
_map.Put((Object)("poNotesFromMobile"),(Object)(parent._x.PoNotesFromMobile /*String*/ ));
 //BA.debugLineNum = 492;BA.debugLine="map.Put(\"NoOfPrints\",x.NoOfPrints)";
_map.Put((Object)("NoOfPrints"),(Object)(parent._x.NoOfPrints /*int*/ ));
 //BA.debugLineNum = 493;BA.debugLine="map.Put(\"UserName\",Main.UserLogin)";
_map.Put((Object)("UserName"),(Object)(parent._main._userlogin /*String*/ ));
 //BA.debugLineNum = 494;BA.debugLine="map.Put(\"MustPrint\",MustPrint)";
_map.Put((Object)("MustPrint"),(Object)(_mustprint));
 //BA.debugLineNum = 495;BA.debugLine="map.Put(\"PrinterPath\",PrinterPath)";
_map.Put((Object)("PrinterPath"),(Object)(_printerpath));
 //BA.debugLineNum = 496;BA.debugLine="map.Put(\"DCLink\",x.DCLink)";
_map.Put((Object)("DCLink"),(Object)(parent._x.DCLink /*int*/ ));
 //BA.debugLineNum = 500;BA.debugLine="If x.SupplierExpiryDate =Null Then";
if (true) break;

case 12:
//if
this.state = 17;
if (parent._x.SupplierExpiryDate /*String*/ == null) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
 //BA.debugLineNum = 501;BA.debugLine="map.Put(\"SupplierExpiryDate\",\"2001-01-01\")";
_map.Put((Object)("SupplierExpiryDate"),(Object)("2001-01-01"));
 if (true) break;

case 16:
//C
this.state = 17;
 //BA.debugLineNum = 503;BA.debugLine="map.Put(\"SupplierExpiryDate\",x.SupplierExpiryDa";
_map.Put((Object)("SupplierExpiryDate"),(Object)(parent._x.SupplierExpiryDate /*String*/ ));
 if (true) break;
;
 //BA.debugLineNum = 505;BA.debugLine="If lblWarehouse.Text = \"No Warehouse\" Then";

case 17:
//if
this.state = 22;
if ((parent._lblwarehouse.getText()).equals("No Warehouse")) { 
this.state = 19;
}else {
this.state = 21;
}if (true) break;

case 19:
//C
this.state = 22;
 if (true) break;

case 21:
//C
this.state = 22;
 //BA.debugLineNum = 508;BA.debugLine="map.Put(\"WarehouseId\",lblWarehouse.Text)";
_map.Put((Object)("WarehouseId"),(Object)(parent._lblwarehouse.getText()));
 if (true) break;

case 22:
//C
this.state = 32;
;
 //BA.debugLineNum = 514;BA.debugLine="l.Add(map)";
_l.Add((Object)(_map.getObject()));
 //BA.debugLineNum = 516;BA.debugLine="RowId = RowId +1";
_rowid = (int) (_rowid+1);
 if (true) break;
if (true) break;

case 23:
//C
this.state = 24;
;
 //BA.debugLineNum = 524;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 525;BA.debugLine="JSON.Initialize2(l)";
_json.Initialize2(_l);
 //BA.debugLineNum = 527;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
 //BA.debugLineNum = 529;BA.debugLine="Dim j As HttpJob";
_j = new b4a.SapyLiveSystem.httpjob();
 //BA.debugLineNum = 530;BA.debugLine="j.Initialize(\"\", Me) 'name is empty as it is no l";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 531;BA.debugLine="Dim strwww As String =Main.Server";
_strwww = parent._main._server /*String*/ ;
 //BA.debugLineNum = 534;BA.debugLine="Dim strPolocy As String";
_strpolocy = "";
 //BA.debugLineNum = 535;BA.debugLine="Log(\"After jdownload\")";
parent.__c.LogImpl("63473521","After jdownload",0);
 //BA.debugLineNum = 536;BA.debugLine="strwww = Main.Server & \"/api/SagePo/update?Suppli";
_strwww = parent._main._server /*String*/ +"/api/SagePo/update?SupplierInvNoo="+_supplinv;
 //BA.debugLineNum = 541;BA.debugLine="j.PostString( strwww,data)";
_j._poststring /*String*/ (_strwww,_data);
 //BA.debugLineNum = 543;BA.debugLine="J.GetRequest.SetHeader(\"Authorization\",\"Bearer \"";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+parent._main._token /*String*/ );
 //BA.debugLineNum = 544;BA.debugLine="j.GetRequest.SetContentType(\"application/json\")";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 548;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 33;
return;
case 33:
//C
this.state = 24;
_j = (b4a.SapyLiveSystem.httpjob) result[0];
;
 //BA.debugLineNum = 549;BA.debugLine="If j.Success Then";
if (true) break;

case 24:
//if
this.state = 29;
if (_j._success /*boolean*/ ) { 
this.state = 26;
}else {
this.state = 28;
}if (true) break;

case 26:
//C
this.state = 29;
 //BA.debugLineNum = 551;BA.debugLine="ToastMessageShow(\"Success \" & j.GetString,True)";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Success "+_j._getstring /*String*/ ()),parent.__c.True);
 //BA.debugLineNum = 553;BA.debugLine="Panel1.RemoveAllViews";
parent._panel1.RemoveAllViews();
 //BA.debugLineNum = 554;BA.debugLine="txtScan.Text=\"\"";
parent._txtscan.setText(BA.ObjectToCharSequence(""));
 //BA.debugLineNum = 555;BA.debugLine="lblWarehouse.Text=\"No Warehouse\"";
parent._lblwarehouse.setText(BA.ObjectToCharSequence("No Warehouse"));
 if (true) break;

case 28:
//C
this.state = 29;
 //BA.debugLineNum = 558;BA.debugLine="Log(j.GetString)";
parent.__c.LogImpl("63473544",_j._getstring /*String*/ (),0);
 //BA.debugLineNum = 559;BA.debugLine="j.GetString";
_j._getstring /*String*/ ();
 if (true) break;

case 29:
//C
this.state = -1;
;
 //BA.debugLineNum = 565;BA.debugLine="lblWarehouse.Text = \"No Warehouse\"";
parent._lblwarehouse.setText(BA.ObjectToCharSequence("No Warehouse"));
 //BA.debugLineNum = 566;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _txtqtytoprintpopup_textchanged(String _old,String _new) throws Exception{
 //BA.debugLineNum = 915;BA.debugLine="Private Sub txtQtyToPrintPopup_TextChanged (Old As";
 //BA.debugLineNum = 916;BA.debugLine="Try";
try { //BA.debugLineNum = 918;BA.debugLine="If chkAutoScale.Checked = True Then";
if (_chkautoscale.getChecked()==__c.True) { 
 //BA.debugLineNum = 920;BA.debugLine="If txtQtyToPrintPopup.Text = \"\" Then";
if ((_txtqtytoprintpopup.getText()).equals("")) { 
 //BA.debugLineNum = 921;BA.debugLine="ValueToPrint = 0";
_valuetoprint = (int) (0);
 }else {
 //BA.debugLineNum = 923;BA.debugLine="ValueToPrint = txtQtyToPrintPopup.Text";
_valuetoprint = (int)(Double.parseDouble(_txtqtytoprintpopup.getText()));
 //BA.debugLineNum = 924;BA.debugLine="txtPrintOnLabelPopup	.Text =Round2( lblQtyPopup";
_txtprintonlabelpopup.setText(BA.ObjectToCharSequence(__c.Round2((double)(Double.parseDouble(_lblqtypopup.getText()))/(double)(double)(Double.parseDouble(_txtqtytoprintpopup.getText())),(int) (3))));
 };
 };
 } 
       catch (Exception e11) {
			ba.setLastException(e11); };
 //BA.debugLineNum = 935;BA.debugLine="End Sub";
return "";
}
public String  _txtscan_enterpressed() throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Private Sub txtScan_EnterPressed";
 //BA.debugLineNum = 66;BA.debugLine="If txtScan.Text = \"\" Then";
if ((_txtscan.getText()).equals("")) { 
 //BA.debugLineNum = 67;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 70;BA.debugLine="txtScan.Text = txtScan.Text.ToUpperCase";
_txtscan.setText(BA.ObjectToCharSequence(_txtscan.getText().toUpperCase()));
 //BA.debugLineNum = 71;BA.debugLine="If LStockForSapyLive.IsInitialized = True Then";
if (_lstockforsapylive.IsInitialized()==__c.True) { 
 //BA.debugLineNum = 72;BA.debugLine="LStockForSapyLive.Clear";
_lstockforsapylive.Clear();
 };
 //BA.debugLineNum = 74;BA.debugLine="LoadDetails";
_loaddetails();
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public String  _ulv_cellclick(long _rowid,byte _cellindex,int _position,anywheresoftware.b4a.objects.PanelWrapper _clickedpanel) throws Exception{
 //BA.debugLineNum = 822;BA.debugLine="Sub ulv_CellClick(RowID As Long, CellIndex As Byte";
 //BA.debugLineNum = 823;BA.debugLine="Main.CurrentPoLine = RowID";
_main._currentpoline /*int*/  = (int) (_rowid);
 //BA.debugLineNum = 825;BA.debugLine="B4XPages.ShowPage(\"GrvStockDetailLine\")";
_b4xpages._showpage /*String*/ (ba,"GrvStockDetailLine");
 //BA.debugLineNum = 826;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _writetosapylivestock() throws Exception{
ResumableSub_WriteToSapyLiveStock rsub = new ResumableSub_WriteToSapyLiveStock(this);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_WriteToSapyLiveStock extends BA.ResumableSub {
public ResumableSub_WriteToSapyLiveStock(b4a.SapyLiveSystem.grvstockin parent) {
this.parent = parent;
}
b4a.SapyLiveSystem.grvstockin parent;
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
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
 //BA.debugLineNum = 384;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 385;BA.debugLine="JSON.Initialize2(LStockForSapyLive)";
_json.Initialize2(parent._lstockforsapylive);
 //BA.debugLineNum = 387;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
 //BA.debugLineNum = 389;BA.debugLine="Dim j As HttpJob";
_j = new b4a.SapyLiveSystem.httpjob();
 //BA.debugLineNum = 390;BA.debugLine="j.Initialize(\"\", Me) 'name is empty as it is no l";
_j._initialize /*String*/ (ba,"",parent);
 //BA.debugLineNum = 391;BA.debugLine="Dim strwww As String =Main.Server";
_strwww = parent._main._server /*String*/ ;
 //BA.debugLineNum = 394;BA.debugLine="Dim strPolocy As String";
_strpolocy = "";
 //BA.debugLineNum = 395;BA.debugLine="Log(\"After jdownload\")";
parent.__c.LogImpl("63407885","After jdownload",0);
 //BA.debugLineNum = 396;BA.debugLine="strwww = Main.Server & \"/api/SagePo/CreateStockFr";
_strwww = parent._main._server /*String*/ +"/api/SagePo/CreateStockFromPo";
 //BA.debugLineNum = 398;BA.debugLine="j.PostString( strwww,data)";
_j._poststring /*String*/ (_strwww,_data);
 //BA.debugLineNum = 400;BA.debugLine="J.GetRequest.SetHeader(\"Authorization\",\"Bearer \"";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+parent._main._token /*String*/ );
 //BA.debugLineNum = 401;BA.debugLine="j.GetRequest.SetContentType(\"application/json\")";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 405;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
parent.__c.WaitFor("jobdone", ba, this, (Object)(_j));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_j = (b4a.SapyLiveSystem.httpjob) result[0];
;
 //BA.debugLineNum = 406;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 //BA.debugLineNum = 408;BA.debugLine="ToastMessageShow(\"Success \" & j.GetString,True)";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Success "+_j._getstring /*String*/ ()),parent.__c.True);
 //BA.debugLineNum = 411;BA.debugLine="Return 1";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(1));return;};
 if (true) break;

case 5:
//C
this.state = 6;
 //BA.debugLineNum = 413;BA.debugLine="Log(j.GetString)";
parent.__c.LogImpl("63407903",_j._getstring /*String*/ (),0);
 //BA.debugLineNum = 414;BA.debugLine="j.GetString";
_j._getstring /*String*/ ();
 //BA.debugLineNum = 416;BA.debugLine="Return 0";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(0));return;};
 if (true) break;

case 6:
//C
this.state = -1;
;
 //BA.debugLineNum = 419;BA.debugLine="End Sub";
if (true) break;

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
