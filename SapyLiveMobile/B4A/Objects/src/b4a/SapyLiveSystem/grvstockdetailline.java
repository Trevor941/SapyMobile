package b4a.SapyLiveSystem;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class grvstockdetailline extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new BA(_ba, this, htSubs, "b4a.SapyLiveSystem.grvstockdetailline");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.SapyLiveSystem.grvstockdetailline.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnpicture = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnreturn = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsignature = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcode = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldesc = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbllinenotes = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblqty = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblsageno = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtamountoflabelstoprint = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtqtydamages = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtqtytoprocess = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtrecnotes = null;
public Object _ion = null;
public b4a.SapyLiveSystem.fileprovider _provider = null;
public boolean _picturetaken = false;
public String _tempimagefile = "";
public b4a.SapyLiveSystem.b4xdatetemplate _datetemplate = null;
public b4a.SapyLiveSystem.b4xdialog _dialog = null;
public boolean _signaturesigned = false;
public b4a.SapyLiveSystem.b4xsignaturetemplate _signaturetemplate = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _base = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldateexpirydate = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtsupplierbatchno = null;
public b4a.SapyLiveSystem.b4xinputtemplate _inputtemplate = null;
public b4a.SapyLiveSystem.b4xlongtexttemplate _longtexttemplate = null;
public String _startdate = "";
public b4a.SapyLiveSystem.main._polistype _x = null;
public b4a.example.dateutils _dateutils = null;
public b4a.SapyLiveSystem.main _main = null;
public b4a.SapyLiveSystem.starter _starter = null;
public b4a.SapyLiveSystem.b4xpages _b4xpages = null;
public b4a.SapyLiveSystem.b4xcollections _b4xcollections = null;
public b4a.SapyLiveSystem.httputils2service _httputils2service = null;
public b4a.SapyLiveSystem.xuiviewsutils _xuiviewsutils = null;
public String  _b4xpage_appear() throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Private Sub B4XPage_Appear";
 //BA.debugLineNum = 75;BA.debugLine="x = Main.PoListypel.Get(Main.CurrentPoLine)";
_x = (b4a.SapyLiveSystem.main._polistype)(_main._polistypel /*anywheresoftware.b4a.objects.collections.List*/ .Get(_main._currentpoline /*int*/ ));
 //BA.debugLineNum = 77;BA.debugLine="lblCode.Text = x.Code";
_lblcode.setText(BA.ObjectToCharSequence(_x.Code /*String*/ ));
 //BA.debugLineNum = 78;BA.debugLine="lblDesc.Text = x.description_1";
_lbldesc.setText(BA.ObjectToCharSequence(_x.description_1 /*String*/ ));
 //BA.debugLineNum = 79;BA.debugLine="lblQty.Text = x.fQtyChange";
_lblqty.setText(BA.ObjectToCharSequence(_x.fQtyChange /*double*/ ));
 //BA.debugLineNum = 80;BA.debugLine="lblLinenotes.Text = x.ClineNotes";
_lbllinenotes.setText(BA.ObjectToCharSequence(_x.ClineNotes /*String*/ ));
 //BA.debugLineNum = 81;BA.debugLine="lblSageNo.Text = x.idInvoiceLines";
_lblsageno.setText(BA.ObjectToCharSequence(_x.IdInvoiceLines /*int*/ ));
 //BA.debugLineNum = 82;BA.debugLine="txtQtyToProcess.Text = x.fQtyToProcess";
_txtqtytoprocess.setText(BA.ObjectToCharSequence(_x.fQtyToProcess /*double*/ ));
 //BA.debugLineNum = 83;BA.debugLine="txtAmountOfLabelsToPrint.Text = txtQtyToProcess.T";
_txtamountoflabelstoprint.setText(BA.ObjectToCharSequence(_txtqtytoprocess.getText()));
 //BA.debugLineNum = 84;BA.debugLine="txtQtyDamages.Text = x.DamgeQty";
_txtqtydamages.setText(BA.ObjectToCharSequence(_x.DamgeQty /*double*/ ));
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public String  _b4xpage_created(anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
 //BA.debugLineNum = 45;BA.debugLine="Root = Root1";
_root = _root1;
 //BA.debugLineNum = 46;BA.debugLine="Root.LoadLayout(\"GrvStockDetailLinePage\")";
_root.LoadLayout("GrvStockDetailLinePage",ba);
 //BA.debugLineNum = 51;BA.debugLine="Dialog.Initialize (Root)";
_dialog._initialize /*String*/ (ba,_root);
 //BA.debugLineNum = 53;BA.debugLine="DateTemplate.Initialize";
_datetemplate._initialize /*String*/ (ba);
 //BA.debugLineNum = 54;BA.debugLine="DateTemplate.MinYear = 2020";
_datetemplate._minyear /*int*/  = (int) (2020);
 //BA.debugLineNum = 55;BA.debugLine="DateTemplate.MaxYear = 2030";
_datetemplate._maxyear /*int*/  = (int) (2030);
 //BA.debugLineNum = 57;BA.debugLine="DateTemplate.Initialize";
_datetemplate._initialize /*String*/ (ba);
 //BA.debugLineNum = 58;BA.debugLine="DateTemplate.MinYear = 2020";
_datetemplate._minyear /*int*/  = (int) (2020);
 //BA.debugLineNum = 59;BA.debugLine="DateTemplate.MaxYear = 2030";
_datetemplate._maxyear /*int*/  = (int) (2030);
 //BA.debugLineNum = 62;BA.debugLine="LongTextTemplate.Initialize";
_longtexttemplate._initialize /*String*/ (ba);
 //BA.debugLineNum = 63;BA.debugLine="SignatureTemplate.Initialize";
_signaturetemplate._initialize /*String*/ (ba);
 //BA.debugLineNum = 64;BA.debugLine="InputTemplate.Initialize";
_inputtemplate._initialize /*String*/ (ba);
 //BA.debugLineNum = 65;BA.debugLine="Provider.Initialize";
_provider._initialize /*String*/ (ba);
 //BA.debugLineNum = 66;BA.debugLine="btnSignature.text = \"Signature\"";
_btnsignature.setText(BA.ObjectToCharSequence("Signature"));
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public void  _btnpicture_click() throws Exception{
ResumableSub_btnPicture_Click rsub = new ResumableSub_btnPicture_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnPicture_Click extends BA.ResumableSub {
public ResumableSub_btnPicture_Click(b4a.SapyLiveSystem.grvstockdetailline parent) {
this.parent = parent;
}
b4a.SapyLiveSystem.grvstockdetailline parent;
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
 //BA.debugLineNum = 156;BA.debugLine="Private rp As RuntimePermissions";
_rp = new anywheresoftware.b4a.objects.RuntimePermissions();
 //BA.debugLineNum = 157;BA.debugLine="rp.CheckAndRequest(rp.PERMISSION_CAMERA)";
_rp.CheckAndRequest(ba,_rp.PERMISSION_CAMERA);
 //BA.debugLineNum = 160;BA.debugLine="TakePicture (1920, 1080)";
parent._takepicture((int) (1920),(int) (1080));
 //BA.debugLineNum = 162;BA.debugLine="Wait For Image_Available(Success As Boolean, bmp";
parent.__c.WaitFor("image_available", ba, this, null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_success = (Boolean) result[0];
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) result[1];
;
 //BA.debugLineNum = 163;BA.debugLine="If Success Then";
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
 //BA.debugLineNum = 165;BA.debugLine="PictureTaken= True";
parent._picturetaken = parent.__c.True;
 //BA.debugLineNum = 166;BA.debugLine="Main.BitmapPicture= bmp";
parent._main._bitmappicture /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 168;BA.debugLine="btnPicture.SetBackgroundImage(Main.BitmapPicture";
parent._btnpicture.SetBackgroundImageNew((android.graphics.Bitmap)(parent._main._bitmappicture /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
 //BA.debugLineNum = 171;BA.debugLine="Dim a As PictureUpload";
_a = new b4a.SapyLiveSystem.main._pictureupload();
 //BA.debugLineNum = 172;BA.debugLine="a.Initialize";
_a.Initialize();
 //BA.debugLineNum = 174;BA.debugLine="a.Content = bmp 'Array As Object(ImageToBytes(bm";
_a.Content /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(_bmp.getObject()));
 //BA.debugLineNum = 175;BA.debugLine="a.DocumentType = \"Podetail Picture\"";
_a.DocumentType /*String*/  = "Podetail Picture";
 //BA.debugLineNum = 176;BA.debugLine="a.FileName = x.IdInvoiceLines & \".JPG\"";
_a.FileName /*String*/  = BA.NumberToString(parent._x.IdInvoiceLines /*int*/ )+".JPG";
 //BA.debugLineNum = 177;BA.debugLine="a.IdInvoiceLines= x.IdInvoiceLines";
_a.IdInvoiceLines /*int*/  = parent._x.IdInvoiceLines /*int*/ ;
 //BA.debugLineNum = 178;BA.debugLine="a.InvoiceId = x.autoIndex";
_a.InvoiceId /*int*/  = parent._x.autoIndex /*int*/ ;
 //BA.debugLineNum = 180;BA.debugLine="CallSub2(Main,\"PostPicture\",a)";
parent.__c.CallSubNew2(ba,(Object)(parent._main.getObject()),"PostPicture",(Object)(_a));
 //BA.debugLineNum = 181;BA.debugLine="Sleep(1000)";
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
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _image_available(boolean _success,anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp) throws Exception{
}
public String  _btnreturn_click() throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Private Sub btnReturn_Click";
 //BA.debugLineNum = 137;BA.debugLine="x.SupplierExpiryDate = lblDateExpiryDate.Text";
_x.SupplierExpiryDate /*String*/  = _lbldateexpirydate.getText();
 //BA.debugLineNum = 138;BA.debugLine="x.SupplierBatchNo = txtSupplierBatchNo.Text";
_x.SupplierBatchNo /*String*/  = _txtsupplierbatchno.getText();
 //BA.debugLineNum = 139;BA.debugLine="x.fQtyToProcess = txtQtyToProcess.Text";
_x.fQtyToProcess /*double*/  = (double)(Double.parseDouble(_txtqtytoprocess.getText()));
 //BA.debugLineNum = 140;BA.debugLine="x.DamgeQty  = txtQtyDamages.Text";
_x.DamgeQty /*double*/  = (double)(Double.parseDouble(_txtqtydamages.getText()));
 //BA.debugLineNum = 143;BA.debugLine="Main.PoListypel.Set(Main.CurrentPoLine,x)";
_main._polistypel /*anywheresoftware.b4a.objects.collections.List*/ .Set(_main._currentpoline /*int*/ ,(Object)(_x));
 //BA.debugLineNum = 144;BA.debugLine="Try";
try { //BA.debugLineNum = 145;BA.debugLine="btnPicture.Background = Null";
_btnpicture.setBackground((android.graphics.drawable.Drawable)(__c.Null));
 //BA.debugLineNum = 146;BA.debugLine="btnSignature.Background = Null";
_btnsignature.setBackground((android.graphics.drawable.Drawable)(__c.Null));
 } 
       catch (Exception e10) {
			ba.setLastException(e10); };
 //BA.debugLineNum = 150;BA.debugLine="btnPicture.Text = \"Take A Picture\"";
_btnpicture.setText(BA.ObjectToCharSequence("Take A Picture"));
 //BA.debugLineNum = 151;BA.debugLine="btnSignature.Text = \"Signature\"";
_btnsignature.setText(BA.ObjectToCharSequence("Signature"));
 //BA.debugLineNum = 152;BA.debugLine="B4XPages.ShowPage(\"GrvStockIn\")";
_b4xpages._showpage /*String*/ (ba,"GrvStockIn");
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return "";
}
public void  _btnsignature_click() throws Exception{
ResumableSub_btnSignature_Click rsub = new ResumableSub_btnSignature_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_btnSignature_Click extends BA.ResumableSub {
public ResumableSub_btnSignature_Click(b4a.SapyLiveSystem.grvstockdetailline parent) {
this.parent = parent;
}
b4a.SapyLiveSystem.grvstockdetailline parent;
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
 //BA.debugLineNum = 93;BA.debugLine="Base = Root";
parent._base = parent._root;
 //BA.debugLineNum = 94;BA.debugLine="Dialog.Initialize (Base)";
parent._dialog._initialize /*String*/ (ba,parent._base);
 //BA.debugLineNum = 96;BA.debugLine="Dialog.Title = \"Customer Signature\"";
parent._dialog._title /*Object*/  = (Object)("Customer Signature");
 //BA.debugLineNum = 97;BA.debugLine="Dialog.ButtonsFont = xui.CreateFontAwesome(20)";
parent._dialog._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = parent._xui.CreateFontAwesome((float) (20));
 //BA.debugLineNum = 98;BA.debugLine="Dim rs As ResumableSub = Dialog.ShowTemplate(Sign";
_rs = new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper();
_rs = parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._signaturetemplate),(Object)(parent.__c.Chr(((int)0xf00c))),(Object)(""),(Object)(parent.__c.Chr(((int)0xf00d))));
 //BA.debugLineNum = 99;BA.debugLine="Dialog.GetButton(xui.DialogResponse_Positive).Tex";
parent._dialog._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (parent._xui.DialogResponse_Positive).setTextColor(parent._xui.Color_Green);
 //BA.debugLineNum = 100;BA.debugLine="Dialog.GetButton(xui.DialogResponse_Cancel).TextC";
parent._dialog._getbutton /*anywheresoftware.b4a.objects.B4XViewWrapper*/ (parent._xui.DialogResponse_Cancel).setTextColor(parent._xui.Color_Red);
 //BA.debugLineNum = 101;BA.debugLine="Dialog.ButtonsFont = xui.CreateDefaultBoldFont(15";
parent._dialog._buttonsfont /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XFont*/  = parent._xui.CreateDefaultBoldFont((float) (15));
 //BA.debugLineNum = 102;BA.debugLine="Wait For (rs) Complete (Result As Int)";
parent.__c.WaitFor("complete", ba, this, _rs);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 104;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 105;BA.debugLine="Dim b As Bitmap  = SignatureTemplate.Bitmap.Resi";
_b = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
_b = (anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper(), (android.graphics.Bitmap)(parent._signaturetemplate._getbitmap /*anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper*/ ().Resize(parent._btnsignature.getWidth(),parent._btnsignature.getHeight(),parent.__c.True).getObject()));
 //BA.debugLineNum = 106;BA.debugLine="Dim cs As CSBuilder";
_cs = new anywheresoftware.b4a.objects.CSBuilder();
 //BA.debugLineNum = 107;BA.debugLine="cs.Initialize";
_cs.Initialize();
 //BA.debugLineNum = 108;BA.debugLine="cs.Image(b,  btnSignature.Width, btnSignature.He";
_cs.Image((android.graphics.Bitmap)(_b.getObject()),parent._btnsignature.getWidth(),parent._btnsignature.getHeight(),parent.__c.False);
 //BA.debugLineNum = 109;BA.debugLine="cs.PopAll";
_cs.PopAll();
 //BA.debugLineNum = 110;BA.debugLine="btnSignature.Text=cs";
parent._btnsignature.setText(BA.ObjectToCharSequence(_cs.getObject()));
 //BA.debugLineNum = 112;BA.debugLine="Log(\"Before \")";
parent.__c.LogImpl("611010068","Before ",0);
 //BA.debugLineNum = 114;BA.debugLine="SignatureSigned = True";
parent._signaturesigned = parent.__c.True;
 //BA.debugLineNum = 117;BA.debugLine="Dim a As PictureUpload";
_a = new b4a.SapyLiveSystem.main._pictureupload();
 //BA.debugLineNum = 118;BA.debugLine="a.Initialize";
_a.Initialize();
 //BA.debugLineNum = 120;BA.debugLine="a.Content = b ' Array As Object(ImageToBytes(b))";
_a.Content /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = _b;
 //BA.debugLineNum = 121;BA.debugLine="a.DocumentType = \"Podetail Signature\"";
_a.DocumentType /*String*/  = "Podetail Signature";
 //BA.debugLineNum = 122;BA.debugLine="a.FileName = x.IdInvoiceLines & \"-Sig.JPG\"";
_a.FileName /*String*/  = BA.NumberToString(parent._x.IdInvoiceLines /*int*/ )+"-Sig.JPG";
 //BA.debugLineNum = 123;BA.debugLine="a.IdInvoiceLines= x.IdInvoiceLines";
_a.IdInvoiceLines /*int*/  = parent._x.IdInvoiceLines /*int*/ ;
 //BA.debugLineNum = 124;BA.debugLine="a.InvoiceId = x.autoIndex";
_a.InvoiceId /*int*/  = parent._x.autoIndex /*int*/ ;
 //BA.debugLineNum = 126;BA.debugLine="CallSub2(Main,\"PostPicture\",a)";
parent.__c.CallSubNew2(ba,(Object)(parent._main.getObject()),"PostPicture",(Object)(_a));
 //BA.debugLineNum = 127;BA.debugLine="Sleep(1000)";
parent.__c.Sleep(ba,this,(int) (1000));
this.state = 6;
return;
case 6:
//C
this.state = 4;
;
 //BA.debugLineNum = 131;BA.debugLine="Log(\"After \")";
parent.__c.LogImpl("611010087","After ",0);
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 133;BA.debugLine="Dialog.Close(xui.DialogResponse_Cancel)";
parent._dialog._close /*boolean*/ (parent._xui.DialogResponse_Cancel);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 4;BA.debugLine="Private btnPicture As Button";
_btnpicture = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private btnReturn As Button";
_btnreturn = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private btnSignature As Button";
_btnsignature = new anywheresoftware.b4a.objects.ButtonWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private lblCode As Label";
_lblcode = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private lblDesc As Label";
_lbldesc = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private lblLinenotes As Label";
_lbllinenotes = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private lblQty As Label";
_lblqty = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private lblSageNo As Label";
_lblsageno = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private txtAmountOfLabelsToPrint As EditText";
_txtamountoflabelstoprint = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private txtQtyDamages As EditText";
_txtqtydamages = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private txtQtyToProcess As EditText";
_txtqtytoprocess = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private txtrecNotes As EditText";
_txtrecnotes = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private ion As Object";
_ion = new Object();
 //BA.debugLineNum = 19;BA.debugLine="Private Provider As FileProvider";
_provider = new b4a.SapyLiveSystem.fileprovider();
 //BA.debugLineNum = 20;BA.debugLine="Private PictureTaken As Boolean";
_picturetaken = false;
 //BA.debugLineNum = 22;BA.debugLine="Private const tempImageFile As String = \"tempimag";
_tempimagefile = "tempimage.jpg";
 //BA.debugLineNum = 23;BA.debugLine="Private DateTemplate As B4XDateTemplate";
_datetemplate = new b4a.SapyLiveSystem.b4xdatetemplate();
 //BA.debugLineNum = 25;BA.debugLine="Private Dialog As B4XDialog";
_dialog = new b4a.SapyLiveSystem.b4xdialog();
 //BA.debugLineNum = 26;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 27;BA.debugLine="Private SignatureSigned As Boolean";
_signaturesigned = false;
 //BA.debugLineNum = 28;BA.debugLine="Private SignatureTemplate As B4XSignatureTemplate";
_signaturetemplate = new b4a.SapyLiveSystem.b4xsignaturetemplate();
 //BA.debugLineNum = 29;BA.debugLine="Private Base As B4XView";
_base = new anywheresoftware.b4a.objects.B4XViewWrapper();
 //BA.debugLineNum = 30;BA.debugLine="Private lblDateExpiryDate As Label";
_lbldateexpirydate = new anywheresoftware.b4a.objects.LabelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="Private txtSupplierBatchNo As EditText";
_txtsupplierbatchno = new anywheresoftware.b4a.objects.EditTextWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Private InputTemplate As B4XInputTemplate";
_inputtemplate = new b4a.SapyLiveSystem.b4xinputtemplate();
 //BA.debugLineNum = 33;BA.debugLine="Private LongTextTemplate As B4XLongTextTemplate";
_longtexttemplate = new b4a.SapyLiveSystem.b4xlongtexttemplate();
 //BA.debugLineNum = 34;BA.debugLine="Private StartDate As String";
_startdate = "";
 //BA.debugLineNum = 35;BA.debugLine="Dim x As PoListype";
_x = new b4a.SapyLiveSystem.main._polistype();
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public byte[]  _imagetobytes(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _image) throws Exception{
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
 //BA.debugLineNum = 255;BA.debugLine="Public Sub ImageToBytes(Image As Bitmap) As Byte()";
 //BA.debugLineNum = 256;BA.debugLine="If Image.IsInitialized Then";
if (_image.IsInitialized()) { 
 //BA.debugLineNum = 257;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
 //BA.debugLineNum = 258;BA.debugLine="out.InitializeToBytesArray(0)";
_out.InitializeToBytesArray((int) (0));
 //BA.debugLineNum = 259;BA.debugLine="Image.WriteToStream(out, 100, \"JPEG\")";
_image.WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (100),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"JPEG"));
 //BA.debugLineNum = 260;BA.debugLine="out.Close";
_out.Close();
 //BA.debugLineNum = 261;BA.debugLine="Return out.ToBytesArray";
if (true) return _out.ToBytesArray();
 }else {
 //BA.debugLineNum = 263;BA.debugLine="Return Null";
if (true) return (byte[])(__c.Null);
 };
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return null;
}
public Object  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 39;BA.debugLine="Public Sub Initialize As Object";
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return this;
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public void  _lbldateexpirydate_click() throws Exception{
ResumableSub_lblDateExpiryDate_Click rsub = new ResumableSub_lblDateExpiryDate_Click(this);
rsub.resume(ba, null);
}
public static class ResumableSub_lblDateExpiryDate_Click extends BA.ResumableSub {
public ResumableSub_lblDateExpiryDate_Click(b4a.SapyLiveSystem.grvstockdetailline parent) {
this.parent = parent;
}
b4a.SapyLiveSystem.grvstockdetailline parent;
String _origformat = "";
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
 //BA.debugLineNum = 241;BA.debugLine="DateTemplate.Initialize";
parent._datetemplate._initialize /*String*/ (ba);
 //BA.debugLineNum = 242;BA.debugLine="Dim OrigFormat As String=DateTime.DateFormat  'sa";
_origformat = parent.__c.DateTime.getDateFormat();
 //BA.debugLineNum = 243;BA.debugLine="DateTime.DateFormat=\"yyyy-MM-dd\"";
parent.__c.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 244;BA.debugLine="Dialog.Title = \"Start Date\"";
parent._dialog._title /*Object*/  = (Object)("Start Date");
 //BA.debugLineNum = 245;BA.debugLine="Wait For (Dialog.ShowTemplate(DateTemplate, \"\", \"";
parent.__c.WaitFor("complete", ba, this, parent._dialog._showtemplate /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ ((Object)(parent._datetemplate),(Object)(""),(Object)(""),(Object)("CANCEL")));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_result = (Integer) result[0];
;
 //BA.debugLineNum = 246;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
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
 //BA.debugLineNum = 247;BA.debugLine="lblDateExpiryDate.Text = DateTime.Date(DateTempl";
parent._lbldateexpirydate.setText(BA.ObjectToCharSequence(parent.__c.DateTime.Date(parent._datetemplate._getdate /*long*/ ())));
 //BA.debugLineNum = 248;BA.debugLine="StartDate = DateTime.Date(DateTemplate.Date)";
parent._startdate = parent.__c.DateTime.Date(parent._datetemplate._getdate /*long*/ ());
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 250;BA.debugLine="Dialog.Close(xui.DialogResponse_Cancel)";
parent._dialog._close /*boolean*/ (parent._xui.DialogResponse_Cancel);
 //BA.debugLineNum = 251;BA.debugLine="DateTime.DateFormat=OrigFormat";
parent.__c.DateTime.setDateFormat(_origformat);
 //BA.debugLineNum = 252;BA.debugLine="x.SupplierExpiryDate = lblDateExpiryDate.Text";
parent._x.SupplierExpiryDate /*String*/  = parent._lbldateexpirydate.getText();
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _startactivityforresult(anywheresoftware.b4a.objects.IntentWrapper _i) throws Exception{
anywheresoftware.b4j.object.JavaObject _jo = null;
 //BA.debugLineNum = 231;BA.debugLine="Sub StartActivityForResult(i As Intent)";
 //BA.debugLineNum = 232;BA.debugLine="Dim jo As JavaObject = Me";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(this));
 //BA.debugLineNum = 233;BA.debugLine="jo = jo.RunMethod(\"getBA\", Null)";
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_jo.RunMethod("getBA",(Object[])(__c.Null))));
 //BA.debugLineNum = 234;BA.debugLine="ion = jo.CreateEvent(\"anywheresoftware.b4a.IOnAct";
_ion = _jo.CreateEvent(ba,"anywheresoftware.b4a.IOnActivityResult","ion",__c.Null);
 //BA.debugLineNum = 235;BA.debugLine="jo.RunMethod(\"startActivityForResult\", Array(ion,";
_jo.RunMethod("startActivityForResult",new Object[]{_ion,(Object)(_i.getObject())});
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return "";
}
public void  _takepicture(int _targetwidth,int _targetheight) throws Exception{
ResumableSub_TakePicture rsub = new ResumableSub_TakePicture(this,_targetwidth,_targetheight);
rsub.resume(ba, null);
}
public static class ResumableSub_TakePicture extends BA.ResumableSub {
public ResumableSub_TakePicture(b4a.SapyLiveSystem.grvstockdetailline parent,int _targetwidth,int _targetheight) {
this.parent = parent;
this._targetwidth = _targetwidth;
this._targetheight = _targetheight;
}
b4a.SapyLiveSystem.grvstockdetailline parent;
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
 //BA.debugLineNum = 188;BA.debugLine="Dim i As Intent";
_i = new anywheresoftware.b4a.objects.IntentWrapper();
 //BA.debugLineNum = 189;BA.debugLine="i.Initialize(\"android.media.action.IMAGE_CAPTURE\"";
_i.Initialize("android.media.action.IMAGE_CAPTURE","");
 //BA.debugLineNum = 190;BA.debugLine="File.Delete(Provider.SharedFolder, tempImageFile)";
parent.__c.File.Delete(parent._provider._sharedfolder /*String*/ ,parent._tempimagefile);
 //BA.debugLineNum = 191;BA.debugLine="Dim u As Object = Provider.GetFileUri(tempImageFi";
_u = parent._provider._getfileuri /*Object*/ (parent._tempimagefile);
 //BA.debugLineNum = 192;BA.debugLine="i.PutExtra(\"output\", u) 'the image will be saved";
_i.PutExtra("output",_u);
 //BA.debugLineNum = 193;BA.debugLine="Try";
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
 //BA.debugLineNum = 194;BA.debugLine="StartActivityForResult(i)";
parent._startactivityforresult(_i);
 //BA.debugLineNum = 195;BA.debugLine="Wait For ion_Event (MethodName As String, Args()";
parent.__c.WaitFor("ion_event", ba, this, null);
this.state = 31;
return;
case 31:
//C
this.state = 4;
_methodname = (String) result[0];
_args = (Object[]) result[1];
;
 //BA.debugLineNum = 196;BA.debugLine="Dim bmp As B4XBitmap";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
 //BA.debugLineNum = 197;BA.debugLine="If -1 = Args(0) Then";
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
 //BA.debugLineNum = 198;BA.debugLine="Try";
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
 //BA.debugLineNum = 199;BA.debugLine="Dim in As Intent = Args(1)";
_in = new anywheresoftware.b4a.objects.IntentWrapper();
_in = (anywheresoftware.b4a.objects.IntentWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.IntentWrapper(), (android.content.Intent)(_args[(int) (1)]));
 //BA.debugLineNum = 200;BA.debugLine="If File.Exists(Provider.SharedFolder, tempImag";
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
 //BA.debugLineNum = 201;BA.debugLine="Dim Exif As ExifData";
_exif = new anywheresoftware.b4a.agraham.jpegutils.ExifUtils();
 //BA.debugLineNum = 202;BA.debugLine="Exif.Initialize(Provider.SharedFolder, tempIm";
_exif.Initialize(parent._provider._sharedfolder /*String*/ ,parent._tempimagefile);
 //BA.debugLineNum = 203;BA.debugLine="bmp = LoadBitmapSample(Provider.SharedFolder,";
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(parent.__c.LoadBitmapSample(parent._provider._sharedfolder /*String*/ ,parent._tempimagefile,(int) (parent.__c.Max(_targetwidth,_targetheight)),(int) (parent.__c.Max(_targetwidth,_targetheight))).getObject()));
 //BA.debugLineNum = 204;BA.debugLine="Log(\"Orientation: \" & Exif.getAttribute(Exif.";
parent.__c.LogImpl("611206673","Orientation: "+_exif.getAttribute(_exif.TAG_ORIENTATION),0);
 //BA.debugLineNum = 205;BA.debugLine="Select Exif.getAttribute(Exif.TAG_ORIENTATION";
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
 //BA.debugLineNum = 207;BA.debugLine="bmp = bmp.Rotate(180)";
_bmp = _bmp.Rotate((int) (180));
 if (true) break;

case 17:
//C
this.state = 20;
 //BA.debugLineNum = 209;BA.debugLine="bmp = bmp.Rotate(90)";
_bmp = _bmp.Rotate((int) (90));
 if (true) break;

case 19:
//C
this.state = 20;
 //BA.debugLineNum = 211;BA.debugLine="bmp = bmp.Rotate(270)";
_bmp = _bmp.Rotate((int) (270));
 if (true) break;

case 20:
//C
this.state = 23;
;
 //BA.debugLineNum = 213;BA.debugLine="bmp = bmp.Resize(TargetWidth, TargetHeight, T";
_bmp = _bmp.Resize(_targetwidth,_targetheight,parent.__c.True);
 if (true) break;

case 22:
//C
this.state = 23;
 //BA.debugLineNum = 215;BA.debugLine="Dim jo As JavaObject = in";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo = (anywheresoftware.b4j.object.JavaObject) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4j.object.JavaObject(), (java.lang.Object)(_in.getObject()));
 //BA.debugLineNum = 216;BA.debugLine="bmp = jo.RunMethodJO(\"getExtras\", Null).RunMe";
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
 //BA.debugLineNum = 219;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("611206688",BA.ObjectToString(parent.__c.LastException(ba)),0);
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
 //BA.debugLineNum = 222;BA.debugLine="CallSubDelayed3(Me, \"Image_Available\", bmp.IsIni";
parent.__c.CallSubDelayed3(ba,parent,"Image_Available",(Object)(_bmp.IsInitialized()),(Object)(_bmp));
 if (true) break;

case 29:
//C
this.state = 30;
this.catchState = 0;
 //BA.debugLineNum = 224;BA.debugLine="ToastMessageShow(\"Camera is not available.\", Tru";
parent.__c.ToastMessageShow(BA.ObjectToCharSequence("Camera is not available."),parent.__c.True);
 //BA.debugLineNum = 225;BA.debugLine="Log(LastException)";
parent.__c.LogImpl("611206694",BA.ObjectToString(parent.__c.LastException(ba)),0);
 //BA.debugLineNum = 226;BA.debugLine="CallSubDelayed3(Me, \"Image_Available\", False, Nu";
parent.__c.CallSubDelayed3(ba,parent,"Image_Available",(Object)(parent.__c.False),parent.__c.Null);
 if (true) break;
if (true) break;

case 30:
//C
this.state = -1;
this.catchState = 0;
;
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
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
