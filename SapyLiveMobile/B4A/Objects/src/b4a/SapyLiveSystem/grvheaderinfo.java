package b4a.SapyLiveSystem;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class grvheaderinfo extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.SapyLiveSystem.grvheaderinfo");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.SapyLiveSystem.grvheaderinfo.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsaveandreturn = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _hmvtyreblockno = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _hmvtyreblockyes = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblddate = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblpono = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsupplier = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _rdlbiologicalno = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _rdlbiologicalyes = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _rdldamageno = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _rdldamageyes = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _rdlfoodno = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _rdlfoodsyes = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _rdloilwaterleakno = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _rdloilwaterleakyes = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _rdltransportingoodno = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _rdltransportingoodyes = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _rdlcoano = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper _rdlcoayes = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtnotes = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnpictures = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsignature = null;
public Object _ion = null;
public b4a.SapyLiveSystem.fileprovider _provider = null;
public boolean _picturetaken = false;
public String _tempimagefile = "";
public b4a.SapyLiveSystem.b4xdialog _dialog = null;
public boolean _signaturesigned = false;
public b4a.SapyLiveSystem.b4xsignaturetemplate _signaturetemplate = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
public String _invoiceiud = "";
public b4a.SapyLiveSystem.main._polistype _x = null;
public b4a.SapyLiveSystem.b4xlongtexttemplate _longtexttemplate = null;
public b4a.SapyLiveSystem.b4xinputtemplate _inputtemplate = null;
public b4a.example.dateutils _dateutils = null;
public b4a.SapyLiveSystem.main _main = null;
public b4a.SapyLiveSystem.starter _starter = null;
public b4a.SapyLiveSystem.b4xpages _b4xpages = null;
public b4a.SapyLiveSystem.b4xcollections _b4xcollections = null;
public b4a.SapyLiveSystem.httputils2service _httputils2service = null;
public b4a.SapyLiveSystem.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_appear() throws Exception{
String _ddate = "";
 //BA.debugLineNum = 62;BA.debugLine="Private Sub B4XPage_Appear";
 //BA.debugLineNum = 64;BA.debugLine="x= Main.PoListypel.Get(0)";
_x = (b4a.SapyLiveSystem.main._polistype)(_main._polistypel /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0)));
 //BA.debugLineNum = 65;BA.debugLine="Dim ddate As String = x.deliveryDate";
_ddate = _x.deliveryDate /*String*/ ;
 //BA.debugLineNum = 66;BA.debugLine="ddate = ddate.SubString2(0,10)";
_ddate = _ddate.substring((int) (0),(int) (10));
 //BA.debugLineNum = 70;BA.debugLine="InvoiceIUd = x.autoIndex";
_invoiceiud = BA.NumberToString(_x.autoIndex /*int*/ );
 //BA.debugLineNum = 71;BA.debugLine="lbldDate.Text =  ddate";
_lblddate.setText(BA.ObjectToCharSequence(_ddate));
 //BA.debugLineNum = 72;BA.debugLine="lblPoNo.Text = x.orderNum";
_lblpono.setText(BA.ObjectToCharSequence(_x.orderNum /*String*/ ));
 //BA.debugLineNum = 73;BA.debugLine="lblSupplier.Text = x.name";
_lblsupplier.setText(BA.ObjectToCharSequence(_x.name /*String*/ ));
 //BA.debugLineNum = 74;BA.debugLine="txtNotes.Text = x.PoNotesFromMobile";
_txtnotes.setText(BA.ObjectToCharSequence(_x.PoNotesFromMobile /*String*/ ));
 //BA.debugLineNum = 75;BA.debugLine="If txtNotes.Text = \"null\" Then";
if ((_txtnotes.getText()).equals("null")) { 
 //BA.debugLineNum = 76;BA.debugLine="txtNotes.Text = \"\"";
_txtnotes.setText(BA.ObjectToCharSequence(""));
 };
 //BA.debugLineNum = 80;BA.debugLine="If x.biological = False Then";
if (_x.biological /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 81;BA.debugLine="rdlBiologicalNo.Checked = True";
_rdlbiologicalno.setChecked(__c.True);
 }else {
 //BA.debugLineNum = 83;BA.debugLine="rdlBiologicalYes.Checked=  True";
_rdlbiologicalyes.setChecked(__c.True);
 };
 //BA.debugLineNum = 87;BA.debugLine="If x.transportCondition = False Then";
if (_x.transportCondition /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 88;BA.debugLine="rdlTransportInGoodNo.Checked = False";
_rdltransportingoodno.setChecked(__c.False);
 }else {
 //BA.debugLineNum = 90;BA.debugLine="rdlTransportInGoodYes.Checked = True";
_rdltransportingoodyes.setChecked(__c.True);
 };
 //BA.debugLineNum = 94;BA.debugLine="If x.allergens = False Then";
if (_x.allergens /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 95;BA.debugLine="rdlFoodNo.Checked = False";
_rdlfoodno.setChecked(__c.False);
 }else {
 //BA.debugLineNum = 97;BA.debugLine="rdlFoodNo.Checked = True";
_rdlfoodno.setChecked(__c.True);
 };
 //BA.debugLineNum = 101;BA.debugLine="If x.biological = False Then";
if (_x.biological /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 102;BA.debugLine="rdlBiologicalNo.Checked = False";
_rdlbiologicalno.setChecked(__c.False);
 }else {
 //BA.debugLineNum = 104;BA.debugLine="rdlBiologicalYes.Checked = True";
_rdlbiologicalyes.setChecked(__c.True);
 };
 //BA.debugLineNum = 108;BA.debugLine="If x.chemical = False Then";
if (_x.chemical /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 109;BA.debugLine="rdlOilWaterLeakNo.Checked = False";
_rdloilwaterleakno.setChecked(__c.False);
 }else {
 //BA.debugLineNum = 112;BA.debugLine="rdlOilWaterLeakYes.Checked = False";
_rdloilwaterleakyes.setChecked(__c.False);
 };
 //BA.debugLineNum = 117;BA.debugLine="If x.hmvTypeBlock = False	 Then";
if (_x.hmvTypeBlock /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 118;BA.debugLine="HMvTyreBlockNo.Checked = False";
_hmvtyreblockno.setChecked(__c.False);
 }else {
 //BA.debugLineNum = 120;BA.debugLine="HMvTyreBlockYes.Checked = True";
_hmvtyreblockyes.setChecked(__c.True);
 };
 //BA.debugLineNum = 124;BA.debugLine="If x.coa = False Then";
if (_x.coa /*boolean*/ ==__c.False) { 
 //BA.debugLineNum = 125;BA.debugLine="rdlCoaNo.Checked = False";
_rdlcoano.setChecked(__c.False);
 }else {
 //BA.debugLineNum = 127;BA.debugLine="rdlCoaYes.Checked = True";
_rdlcoayes.setChecked(__c.True);
 };
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 47;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 48;BA.debugLine="Root.LoadLayout(\"grvHeaderPage\")";
_root.LoadLayout("grvHeaderPage",ba);
 //BA.debugLineNum = 50;BA.debugLine="Dialog.Initialize (Base)";
_dialog._initialize /*String*/ (ba,_base);
 //BA.debugLineNum = 53;BA.debugLine="LongTextTemplate.Initialize";
_longtexttemplate._initialize /*String*/ (ba);
 //BA.debugLineNum = 54;BA.debugLine="SignatureTemplate.Initialize";
_signaturetemplate._initialize /*String*/ (ba);
 //BA.debugLineNum = 55;BA.debugLine="InputTemplate.Initialize";
_inputtemplate._initialize /*String*/ (ba);
 //BA.debugLineNum = 56;BA.debugLine="Provider.Initialize";
_provider._initialize /*String*/ (ba);
 //BA.debugLineNum = 57;BA.debugLine="btnSignature.text = \"Signature\"";
_btnsignature.setText(BA.ObjectToCharSequence("Signature"));
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public void  _btnpictures_click() throws Exception{
ResumableSub_btnPictures_Click rsub = new ResumableSub_btnPictures_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnPictures_Click extends BA.ResumableSub {
public ResumableSub_btnPictures_Click(b4a.SapyLiveSystem.grvheaderinfo parent) {
this.parent = parent;
}
b4a.SapyLiveSystem.grvheaderinfo parent;
anywheresoftware.b4a.objects.RuntimePermissions _rp = null;
boolean _success = false;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
b4a.SapyLiveSystem.main._pictureupload _a = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 253;BA.debugLine="Private rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 254;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_CAMERA)";
_rp.CheckAndRequest(ba,_rp.PERMISSION_CAMERA);
 //BA.debugLineNum = 258;BA.debugLine="TakePicture (1920, 1080)";
parent._takepicture((int) (1920),(int) (1080));
 //BA.debugLineNum = 259;BA.debugLine="Wait For Image_Available(Success As Boolean, bmp";
parent.__c.WaitFor("image_available", ba, this, null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_success = (Boolean) result[0];
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) result[1];
;
 //BA.debugLineNum = 260;BA.debugLine="If Success Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_success) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 262;BA.debugLine="PictureTaken= True";
parent._picturetaken = parent.__c.True;
 //BA.debugLineNum = 263;BA.debugLine="Main.BitmapPicture= bmp";
parent._main._bitmappicture /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 265;BA.debugLine="btnPictures.SetBackgroundImage(Main.BitmapPictur";
parent._btnpictures.SetBackgroundImageNew((android.graphics.Bitmap)(parent._main._bitmappicture /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
 //BA.debugLineNum = 266;BA.debugLine="Dim a As PictureUpload";
_a = new b4a.SapyLiveSystem.main._pictureupload();
 //BA.debugLineNum = 267;BA.debugLine="a.Initialize";
_a.Initialize();
 //BA.debugLineNum = 269;BA.debugLine="a.Content = bmp ' Array As Object(ImageToBytes(b";
_a.Content /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 270;BA.debugLine="a.DocumentType = \"PoHeader Picture\"";
_a.DocumentType /*String*/  = "PoHeader Picture";
 //BA.debugLineNum = 271;BA.debugLine="a.FileName = InvoiceIUd & \"-PH.JPG\"";
_a.FileName /*String*/  = parent._invoiceiud+"-PH.JPG";
 //BA.debugLineNum = 272;BA.debugLine="a.IdInvoiceLines= 0";
_a.IdInvoiceLines /*int*/  = (int) (0);
 //BA.debugLineNum = 273;BA.debugLine="a.InvoiceId = InvoiceIUd";
_a.InvoiceId /*int*/  = (int)(Double.parseDouble(parent._invoiceiud));
 //BA.debugLineNum = 275;BA.debugLine="CallSub2(Main,\"PostPicture\",a)";
parent.__c.CallSubNew2(ba,(Object)(parent._main.getObject()),"PostPicture",(Object)(_a));
 //BA.debugLineNum = 276;BA.debugLine="Sleep(1000)";
parent.__c.Sleep(ba,this,(int) (1000));
this.state = 6;
return;
case 6:
//C
this.state = 4;
;
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _image_available(boolean _success,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
}
public String  _btnsaveandreturn_click() throws Exception{
 //BA.debugLineNum = 152;BA.debugLine="Private Sub btnSaveAndReturn_Click";
 //BA.debugLineNum = 154;BA.debugLine="If HMvTyreBlockNo.Checked = True Then";
if (_hmvtyreblockno.getChecked()==__c.True) { 
 //BA.debugLineNum = 155;BA.debugLine="x.hmvTyreBlock = False";
_x.hmvTyreBlock /*boolean*/  = __c.False;
 //BA.debugLineNum = 156;BA.debugLine="x.hmvTypeBlock = False";
_x.hmvTypeBlock /*boolean*/  = __c.False;
 }else {
 //BA.debugLineNum = 158;BA.debugLine="x.hmvTyreBlock = True";
_x.hmvTyreBlock /*boolean*/  = __c.True;
 //BA.debugLineNum = 159;BA.debugLine="x.hmvTypeBlock=True";
_x.hmvTypeBlock /*boolean*/  = __c.True;
 };
 //BA.debugLineNum = 162;BA.debugLine="If rdlOilWaterLeakNo.Checked = True Then";
if (_rdloilwaterleakno.getChecked()==__c.True) { 
 //BA.debugLineNum = 163;BA.debugLine="x.chemical = False";
_x.chemical /*boolean*/  = __c.False;
 }else {
 //BA.debugLineNum = 165;BA.debugLine="x.chemical = True";
_x.chemical /*boolean*/  = __c.True;
 };
 //BA.debugLineNum = 168;BA.debugLine="If rdlBiologicalNo.Checked = False Then";
if (_rdlbiologicalno.getChecked()==__c.False) { 
 //BA.debugLineNum = 169;BA.debugLine="x.biological = False";
_x.biological /*boolean*/  = __c.False;
 }else {
 //BA.debugLineNum = 171;BA.debugLine="x.biological = True";
_x.biological /*boolean*/  = __c.True;
 };
 //BA.debugLineNum = 175;BA.debugLine="If rdlCoaNo.Checked = False Then";
if (_rdlcoano.getChecked()==__c.False) { 
 //BA.debugLineNum = 177;BA.debugLine="x.coa = False";
_x.coa /*boolean*/  = __c.False;
 }else {
 //BA.debugLineNum = 179;BA.debugLine="x.coa = True";
_x.coa /*boolean*/  = __c.True;
 };
 //BA.debugLineNum = 182;BA.debugLine="If rdlDamageNo.Checked = True Then";
if (_rdldamageno.getChecked()==__c.True) { 
 //BA.debugLineNum = 183;BA.debugLine="x.physical = False";
_x.physical /*boolean*/  = __c.False;
 }else {
 //BA.debugLineNum = 186;BA.debugLine="x.physical = True";
_x.physical /*boolean*/  = __c.True;
 };
 //BA.debugLineNum = 190;BA.debugLine="If rdlFoodNo.Checked = True Then";
if (_rdlfoodno.getChecked()==__c.True) { 
 //BA.debugLineNum = 191;BA.debugLine="x.allergens = False";
_x.allergens /*boolean*/  = __c.False;
 }else {
 //BA.debugLineNum = 193;BA.debugLine="x.allergens=  True";
_x.allergens /*boolean*/  = __c.True;
 };
 //BA.debugLineNum = 197;BA.debugLine="If rdlOilWaterLeakNo.Checked = True Then";
if (_rdloilwaterleakno.getChecked()==__c.True) { 
 //BA.debugLineNum = 198;BA.debugLine="x.chemical = False";
_x.chemical /*boolean*/  = __c.False;
 }else {
 //BA.debugLineNum = 200;BA.debugLine="x.chemical = True";
_x.chemical /*boolean*/  = __c.True;
 };
 //BA.debugLineNum = 205;BA.debugLine="B4XPages.ShowPageAndRemovePreviousPages(\"GrvStockI";
_b4xpages._showpageandremovepreviouspages /*String*/ (ba,"GrvStockIn");
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return "";
}
public void  _btnsignature_click() throws Exception{
ResumableSub_btnSignature_Click rsub = new ResumableSub_btnSignature_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSignature_Click extends BA.ResumableSub {
public ResumableSub_btnSignature_Click(b4a.SapyLiveSystem.grvheaderinfo parent) {
this.parent = parent;
}
b4a.SapyLiveSystem.grvheaderinfo parent;
anywheresoftware.b4a.keywords.Common.ResumableSubWrapper _rs = null;
int _result = 0;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _b = null;
anywheresoftware.b4a.objects.CSBuilder _cs = null;
b4a.SapyLiveSystem.main._pictureupload _a = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 //BA.debugLineNum = 209;BA.debugLine="Base = Root";
parent._base = parent._root;
 //BA.debugLineNum = 210;BA.debugLine="Dialog.Initialize (Base)";
parent._dialog._initialize /*String*/ (ba,parent._base);
 //BA.debugLineNum = 212;BA.debugLine="Dialog.Title = \"Customer Signature\"";
parent._dialog._title /*Object*/  = (Object)("Customer Signature");
 //BA.debugLineNum = 213;BA.debugLine="Dialog.ButtonsFont = xui.CreateFontAwesome(20)";
parent._dialog._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = parent._xui.CreateFontAwesome((float) (20));
 //BA.debugLineNum = 214;BA.debugLine="Dim rs As ResumableSub = Dialog.ShowTemplate(Sign";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._signaturetemplate),(Object)(parent.__c.Chr(((int)0xf00c))),(Object)(""),(Object)(parent.__c.Chr(((int)0xf00d))));
 //BA.debugLineNum = 215;BA.debugLine="Dialog.GetButton(xui.DialogResponse_Positive).Tex";
parent._dialog._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (parent._xui.DialogResponse_Positive).setTextColor(parent._xui.Color_Green);
 //BA.debugLineNum = 216;BA.debugLine="Dialog.GetButton(xui.DialogResponse_Cancel).TextC";
parent._dialog._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (parent._xui.DialogResponse_Cancel).setTextColor(parent._xui.Color_Red);
 //BA.debugLineNum = 217;BA.debugLine="Dialog.ButtonsFont = xui.CreateDefaultBoldFont(15";
parent._dialog._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = parent._xui.CreateDefaultBoldFont((float) (15));
 //BA.debugLineNum = 218;BA.debugLine="Wait For (rs) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, this, _rs);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 220;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_result==parent._xui.DialogResponse_Positive) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 221;BA.debugLine="Dim b As Bitmap  = SignatureTemplate.Bitmap.Resi";
_b = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_b = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent._signaturetemplate._getbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ().Resize(parent._btnsignature.getWidth(),parent._btnsignature.getHeight(),parent.__c.True).getObject()));
 //BA.debugLineNum = 222;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
 //BA.debugLineNum = 223;BA.debugLine="cs.Initialize";
_cs.Initialize();
 //BA.debugLineNum = 224;BA.debugLine="cs.Image(b,  btnSignature.Width, btnSignature.He";
_cs.Image((android.graphics.Bitmap)(_b.getObject()),parent._btnsignature.getWidth(),parent._btnsignature.getHeight(),parent.__c.False);
 //BA.debugLineNum = 225;BA.debugLine="cs.PopAll";
_cs.PopAll();
 //BA.debugLineNum = 226;BA.debugLine="btnSignature.Text=cs";
parent._btnsignature.setText(BA.ObjectToCharSequence(_cs.getObject()));
 //BA.debugLineNum = 228;BA.debugLine="Log(\"Before \")";
parent.__c.LogImpl("61179668","Before ",0);
 //BA.debugLineNum = 230;BA.debugLine="SignatureSigned = True";
parent._signaturesigned = parent.__c.True;
 //BA.debugLineNum = 233;BA.debugLine="Log(\"After \")";
parent.__c.LogImpl("61179673","After ",0);
 //BA.debugLineNum = 235;BA.debugLine="Dim a As PictureUpload";
_a = new b4a.SapyLiveSystem.main._pictureupload();
 //BA.debugLineNum = 236;BA.debugLine="a.Initialize";
_a.Initialize();
 //BA.debugLineNum = 238;BA.debugLine="a.Content = b";
_a.Content /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = _b;
 //BA.debugLineNum = 239;BA.debugLine="a.DocumentType = \"PoHeader\"";
_a.DocumentType /*String*/  = "PoHeader";
 //BA.debugLineNum = 240;BA.debugLine="a.FileName =InvoiceIUd &  \"-I-Sig.JPG\"";
_a.FileName /*String*/  = parent._invoiceiud+"-I-Sig.JPG";
 //BA.debugLineNum = 241;BA.debugLine="a.IdInvoiceLines= 0";
_a.IdInvoiceLines /*int*/  = (int) (0);
 //BA.debugLineNum = 242;BA.debugLine="a.InvoiceId = InvoiceIUd";
_a.InvoiceId /*int*/  = (int)(Double.parseDouble(parent._invoiceiud));
 //BA.debugLineNum = 244;BA.debugLine="CallSub2(Main,\"PostPicture\",a)";
parent.__c.CallSubNew2(ba,(Object)(parent._main.getObject()),"PostPicture",(Object)(_a));
 //BA.debugLineNum = 245;BA.debugLine="Sleep(1000)";
parent.__c.Sleep(ba,this,(int) (1000));
this.state = 6;
return;
case 6:
//C
this.state = 4;
;
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 249;BA.debugLine="Dialog.Close(xui.DialogResponse_Cancel)";
parent._dialog._close /*boolean*/ (parent._xui.DialogResponse_Cancel);
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _complete(int _result) throws Exception{
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 4;BA.debugLine="Private btnSaveAndReturn As Button";
_btnsaveandreturn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private HMvTyreBlockNo As RadioButton";
_hmvtyreblockno = new anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private HMvTyreBlockYes As RadioButton";
_hmvtyreblockyes = new anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private lbldDate As Label";
_lblddate = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private lblPoNo As Label";
_lblpono = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private lblSupplier As Label";
_lblsupplier = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private rdlBiologicalNo As RadioButton";
_rdlbiologicalno = new anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private rdlBiologicalYes As RadioButton";
_rdlbiologicalyes = new anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private rdlDamageNo As RadioButton";
_rdldamageno = new anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private rdlDamageYes As RadioButton";
_rdldamageyes = new anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private rdlFoodNo As RadioButton";
_rdlfoodno = new anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private rdlFoodsYes As RadioButton";
_rdlfoodsyes = new anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private rdlOilWaterLeakNo As RadioButton";
_rdloilwaterleakno = new anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private rdlOilWaterLeakYes As RadioButton";
_rdloilwaterleakyes = new anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private rdlTransportInGoodNo As RadioButton";
_rdltransportingoodno = new anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private rdlTransportInGoodYes As RadioButton";
_rdltransportingoodyes = new anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Private rdlCoaNo As RadioButton";
_rdlcoano = new anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Private rdlCoaYes As RadioButton";
_rdlcoayes = new anywheresoftware.b4a.objects.CompoundButtonWrapper.RadioButtonWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Private txtNotes As EditText";
_txtnotes = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private btnPictures As Button";
_btnpictures = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Private btnSignature As Button";
_btnsignature = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Private ion As Object";
_ion = new Object();
 //BA.debugLineNum = 26;BA.debugLine="Private Provider As FileProvider";
_provider = new b4a.SapyLiveSystem.fileprovider();
 //BA.debugLineNum = 27;BA.debugLine="Private PictureTaken As Boolean";
_picturetaken = false;
 //BA.debugLineNum = 28;BA.debugLine="Private const tempImageFile As String = \"tempimag";
_tempimagefile = "tempimage.jpg";
 //BA.debugLineNum = 29;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4a.SapyLiveSystem.b4xdialog();
 //BA.debugLineNum = 30;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private SignatureSigned As Boolean";
_signaturesigned = false;
 //BA.debugLineNum = 32;BA.debugLine="Private SignatureTemplate As B4XSignatureTemplate";
_signaturetemplate = new b4a.SapyLiveSystem.b4xsignaturetemplate();
 //BA.debugLineNum = 33;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 34;BA.debugLine="Public InvoiceIUd As String";
_invoiceiud = "";
 //BA.debugLineNum = 35;BA.debugLine="Dim x As PoListype";
_x = new b4a.SapyLiveSystem.main._polistype();
 //BA.debugLineNum = 36;BA.debugLine="Private LongTextTemplate As B4XLongTextTemplate";
_longtexttemplate = new b4a.SapyLiveSystem.b4xlongtexttemplate();
 //BA.debugLineNum = 37;BA.debugLine="Private InputTemplate As B4XInputTemplate";
_inputtemplate = new b4a.SapyLiveSystem.b4xinputtemplate();
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public String  _hmvtyreblockno_checkedchange(boolean _checked) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Private Sub HMvTyreBlockNo_CheckedChange(Checked A";
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}
public String  _hmvtyreblockyes_checkedchange(boolean _checked) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Private Sub HMvTyreBlockYes_CheckedChange(Checked";
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public byte[]  _imagetobytes(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _image) throws Exception{
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
 //BA.debugLineNum = 334;BA.debugLine="Public Sub ImageToBytes(Image As Bitmap) As Byte()";
 //BA.debugLineNum = 335;BA.debugLine="If Image.IsInitialized Then";
if (_image.IsInitialized()) { 
 //BA.debugLineNum = 336;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
 //BA.debugLineNum = 337;BA.debugLine="out.InitializeToBytesArray(0)";
_out.InitializeToBytesArray((int) (0));
 //BA.debugLineNum = 338;BA.debugLine="Image.WriteToStream(out, 100, \"JPEG\")";
_image.WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (100),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"JPEG"));
 //BA.debugLineNum = 339;BA.debugLine="out.Close";
_out.Close();
 //BA.debugLineNum = 340;BA.debugLine="Return out.ToBytesArray";
if (true) return _out.ToBytesArray();
 }else {
 //BA.debugLineNum = 342;BA.debugLine="Return Null";
if (true) return (byte[])(__c.Null);
 };
 //BA.debugLineNum = 344;BA.debugLine="End Sub";
return null;
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 41;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public String  _startactivityforresult(anywheresoftware.b4a.objects.IntentWrapper _i) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 327;BA.debugLine="Sub StartActivityForResult(i As Intent)";
 //BA.debugLineNum = 328;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
 //BA.debugLineNum = 329;BA.debugLine="jo = jo.RunMethod(\"getBA\", Null)";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("getBA",(Object[])(__c.Null))));
 //BA.debugLineNum = 330;BA.debugLine="ion = jo.CreateEvent(\"anywheresoftware.b4a.IOnAct";
_ion = _jo.CreateEvent(ba,"anywheresoftware.b4a.IOnActivityResult","ion",__c.Null);
 //BA.debugLineNum = 331;BA.debugLine="jo.RunMethod(\"startActivityForResult\", Array(ion,";
_jo.RunMethod("startActivityForResult",new Object[]{_ion,(Object)(_i.getObject())});
 //BA.debugLineNum = 332;BA.debugLine="End Sub";
return "";
}
public void  _takepicture(int _targetwidth,int _targetheight) throws Exception{
ResumableSub_TakePicture rsub = new ResumableSub_TakePicture(this,_targetwidth,_targetheight);
rsub.resume(ba, null);
}
public static class ResumableSub_TakePicture extends BA.ResumableSub {
public ResumableSub_TakePicture(b4a.SapyLiveSystem.grvheaderinfo parent,int _targetwidth,int _targetheight) {
this.parent = parent;
this._targetwidth = _targetwidth;
this._targetheight = _targetheight;
}
b4a.SapyLiveSystem.grvheaderinfo parent;
int _targetwidth;
int _targetheight;
anywheresoftware.b4a.objects.IntentWrapper _i = null;
Object _u = null;
String _methodname = "";
Object[] _args = null;
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.IntentWrapper _in = null;
anywheresoftware.b4a.agraham.jpegutils.ExifUtils _exif = null;
anywheresoftware.b4j.object.JavaObject _jo = null;

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
 //BA.debugLineNum = 283;BA.debugLine="Dim i As Intent";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
 //BA.debugLineNum = 284;BA.debugLine="i.Initialize(\"android.media.action.IMAGE_CAPTURE\"";
_i.Initialize("android.media.action.IMAGE_CAPTURE","");
 //BA.debugLineNum = 286;BA.debugLine="File.Delete(Provider.SharedFolder, tempImageFile)";
parent.__c.File.Delete(parent._provider._sharedfolder /*String*/ ,parent._tempimagefile);
 //BA.debugLineNum = 287;BA.debugLine="Dim u As Object = Provider.GetFileUri(tempImageFi";
_u = parent._provider._getfileuri /*Object*/ (parent._tempimagefile);
 //BA.debugLineNum = 288;BA.debugLine="i.PutExtra(\"output\", u) 'the image will be saved";
_i.PutExtra("output",_u);
 //BA.debugLineNum = 289;BA.debugLine="Try";
if (true) break;

case 1:
//try
this.state = 30;
this.catchState = 29;
this.state = 3;
if (true) break;

case 3:
//C
this.state = 4;
this.catchState = 29;
 //BA.debugLineNum = 290;BA.debugLine="StartActivityForResult(i)";
parent._startactivityforresult(_i);
 //BA.debugLineNum = 291;BA.debugLine="Wait For ion_Event (MethodName As String, Args()";
parent.__c.WaitFor("ion_event", ba, this, null);
this.state = 31;
return;
case 31:
//C
this.state = 4;
_methodname = (String) result[0];
_args = (Object[]) result[1];
;
 //BA.debugLineNum = 292;BA.debugLine="Dim bmp As B4XBitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
 //BA.debugLineNum = 293;BA.debugLine="If -1 = Args(0) Then";
if (true) break;

case 4:
//if
this.state = 27;
if (-1==(double)(BA.ObjectToNumber(_args[(int) (0)]))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 //BA.debugLineNum = 294;BA.debugLine="Try";
if (true) break;

case 7:
//try
this.state = 26;
this.catchState = 25;
this.state = 9;
if (true) break;

case 9:
//C
this.state = 10;
this.catchState = 25;
 //BA.debugLineNum = 295;BA.debugLine="Dim in As Intent = Args(1)";
_in = new anywheresoftware.b4a.objects.IntentWrapper();
_in = (anywheresoftware.b4a.objects.IntentWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.IntentWrapper(), (android.content.Intent)(_args[(int) (1)]));
 //BA.debugLineNum = 296;BA.debugLine="If File.Exists(Provider.SharedFolder, tempImag";
if (true) break;

case 10:
//if
this.state = 23;
if (parent.__c.File.Exists(parent._provider._sharedfolder /*String*/ ,parent._tempimagefile)) { 
this.state = 12;
}else if(_in.HasExtra("data")) { 
this.state = 22;
}if (true) break;

case 12:
//C
this.state = 13;
 //BA.debugLineNum = 297;BA.debugLine="Dim Exif As ExifData";
_exif = new anywheresoftware.b4a.agraham.jpegutils.ExifUtils();
 //BA.debugLineNum = 298;BA.debugLine="Exif.Initialize(Provider.SharedFolder, tempIm";
_exif.Initialize(parent._provider._sharedfolder /*String*/ ,parent._tempimagefile);
 //BA.debugLineNum = 299;BA.debugLine="bmp = LoadBitmapSample(Provider.SharedFolder,";
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(parent.__c.LoadBitmapSample(parent._provider._sharedfolder /*String*/ ,parent._tempimagefile,(int) (parent.__c.Max(_targetwidth,_targetheight)),(int) (parent.__c.Max(_targetwidth,_targetheight))).getObject()));
 //BA.debugLineNum = 300;BA.debugLine="Log(\"Orientation: \" & Exif.getAttribute(Exif.";
parent.__c.LogImpl("61310738","Orientation: "+_exif.getAttribute(_exif.TAG_ORIENTATION),0);
 //BA.debugLineNum = 301;BA.debugLine="Select Exif.getAttribute(Exif.TAG_ORIENTATION";
if (true) break;

case 13:
//select
this.state = 20;
switch (BA.switchObjectToInt(_exif.getAttribute(_exif.TAG_ORIENTATION),BA.NumberToString(_exif.ORIENTATION_ROTATE_180),BA.NumberToString(_exif.ORIENTATION_ROTATE_90),BA.NumberToString(_exif.ORIENTATION_ROTATE_270))) {
case 0: {
this.state = 15;
if (true) break;
}
case 1: {
this.state = 17;
if (true) break;
}
case 2: {
this.state = 19;
if (true) break;
}
}
if (true) break;

case 15:
//C
this.state = 20;
 //BA.debugLineNum = 303;BA.debugLine="bmp = bmp.Rotate(180)";
_bmp = _bmp.Rotate((int) (180));
 if (true) break;

case 17:
//C
this.state = 20;
 //BA.debugLineNum = 305;BA.debugLine="bmp = bmp.Rotate(90)";
_bmp = _bmp.Rotate((int) (90));
 if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 307;BA.debugLine="bmp = bmp.Rotate(270)";
_bmp = _bmp.Rotate((int) (270));
 if (true) break;

case 20:
//C
this.state = 23;
;
 //BA.debugLineNum = 309;BA.debugLine="bmp = bmp.Resize(TargetWidth, TargetHeight, T";
_bmp = _bmp.Resize(_targetwidth,_targetheight,parent.__c.True);
 if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 311;BA.debugLine="Dim jo As JavaObject = in";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_in.getObject()));
 //BA.debugLineNum = 312;BA.debugLine="bmp = jo.RunMethodJO(\"getExtras\", Null).RunMe";
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_jo.RunMethodJO("getExtras",(Object[])(parent.__c.Null)).RunMethod("get",new Object[]{(Object)("data")})));
 if (true) break;

case 23:
//C
this.state = 26;
;
 if (true) break;

case 25:
//C
this.state = 26;
this.catchState = 29;
 //BA.debugLineNum = 315;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("61310753",BA.ObjectToString(parent.__c.LastException(ba)),0);
 if (true) break;
if (true) break;

case 26:
//C
this.state = 27;
this.catchState = 29;
;
 if (true) break;

case 27:
//C
this.state = 30;
;
 //BA.debugLineNum = 318;BA.debugLine="CallSubDelayed3(Me, \"Image_Available\", bmp.IsIni";
parent.__c.CallSubDelayed3(ba,parent,"Image_Available",(Object)(_bmp.IsInitialized()),(Object)(_bmp));
 if (true) break;

case 29:
//C
this.state = 30;
this.catchState = 0;
 //BA.debugLineNum = 320;BA.debugLine="ToastMessageShow(\"Camera is not available.\", Tru";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Camera is not available."),parent.__c.True);
 //BA.debugLineNum = 321;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("61310759",BA.ObjectToString(parent.__c.LastException(ba)),0);
 //BA.debugLineNum = 322;BA.debugLine="CallSubDelayed3(Me, \"Image_Available\", False, Nu";
parent.__c.CallSubDelayed3(ba,parent,"Image_Available",(Object)(parent.__c.False),parent.__c.Null);
 if (true) break;
if (true) break;

case 30:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 324;BA.debugLine="End Sub";
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
public void  _ion_event(String _methodname,Object[] _args) throws Exception{
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "B4XPAGE_CREATED"))
	return _b4xpage_created((anywheresoftware.b4a.objects.B4XViewWrapper) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
