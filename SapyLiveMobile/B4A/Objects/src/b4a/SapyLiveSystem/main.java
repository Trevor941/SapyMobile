package b4a.SapyLiveSystem;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = true;
    public static WeakReference<Activity> previousOne;
    public static boolean dontPause;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new BA(this.getApplicationContext(), null, null, "b4a.SapyLiveSystem", "b4a.SapyLiveSystem.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "b4a.SapyLiveSystem", "b4a.SapyLiveSystem.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "b4a.SapyLiveSystem.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create " + (isFirst ? "(first time)" : "") + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        if (!dontPause)
            BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        else
            BA.LogInfo("** Activity (main) Pause event (activity is not paused). **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        if (!dontPause) {
            processBA.setActivityPaused(true);
            mostCurrent = null;
        }

        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }

public anywheresoftware.b4a.keywords.Common __c = null;
public static boolean _actionbarhomeclicked = false;
public static String _server = "";
public static String _token = "";
public static String _userlogin = "";
public static String _imeno = "";
public static anywheresoftware.b4a.phone.Phone.PhoneWakeState _awake = null;
public static anywheresoftware.b4a.objects.collections.List _polistypel = null;
public static int _currentpoline = 0;
public static anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bitmappicture = null;
public static String _picturecontenttype = "";
public static anywheresoftware.b4a.objects.collections.List _orderlist = null;
public static anywheresoftware.b4a.objects.collections.List _truckcontrolsheetlist = null;
public static b4a.SapyLiveSystem.grvstockin._orderinfo _x = null;
public static anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public static com.simplysoftware.base64convert.base64convert _base64con = null;
public b4a.example.dateutils _dateutils = null;
public b4a.SapyLiveSystem.starter _starter = null;
public b4a.SapyLiveSystem.b4xpages _b4xpages = null;
public b4a.SapyLiveSystem.b4xcollections _b4xcollections = null;
public b4a.SapyLiveSystem.httputils2service _httputils2service = null;
public b4a.SapyLiveSystem.xuiviewsutils _xuiviewsutils = null;

public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
return vis;}
public static class _polistype{
public boolean IsInitialized;
public double fQtyChange;
public double invTotalIncl;
public String Code;
public double invDisc;
public String dueDate;
public String orderNum;
public String description_1;
public double invDiscAmnt;
public String extOrderNum;
public double invTotExcl;
public int autoIndex;
public String InvNumber;
public double fQuantity;
public String name;
public double fQtyToProcess;
public int IdInvoiceLines;
public String deliveryDate;
public double fQtyLastProcess;
public String invDate;
public String orderDate;
public String account;
public double fUnitPriceIncl;
public double fUnitPriceExcl;
public double OrdTotExcl;
public double OrdTotIncl;
public boolean transportCondition;
public boolean coa;
public boolean chemical;
public String Coapath;
public boolean hmvTypeBlock;
public boolean biological;
public boolean physical;
public boolean allergens;
public String PoNotesFromMobile;
public int NoOfPrints;
public String ClineNotes;
public String SupplierExpiryDate;
public String SupplierBatchNo;
public double DamgeQty;
public boolean hmvTyreBlock;
public int DCLink;
public boolean Printed;
public void Initialize() {
IsInitialized = true;
fQtyChange = 0;
invTotalIncl = 0;
Code = "";
invDisc = 0;
dueDate = "";
orderNum = "";
description_1 = "";
invDiscAmnt = 0;
extOrderNum = "";
invTotExcl = 0;
autoIndex = 0;
InvNumber = "";
fQuantity = 0;
name = "";
fQtyToProcess = 0;
IdInvoiceLines = 0;
deliveryDate = "";
fQtyLastProcess = 0;
invDate = "";
orderDate = "";
account = "";
fUnitPriceIncl = 0;
fUnitPriceExcl = 0;
OrdTotExcl = 0;
OrdTotIncl = 0;
transportCondition = false;
coa = false;
chemical = false;
Coapath = "";
hmvTypeBlock = false;
biological = false;
physical = false;
allergens = false;
PoNotesFromMobile = "";
NoOfPrints = 0;
ClineNotes = "";
SupplierExpiryDate = "";
SupplierBatchNo = "";
DamgeQty = 0;
hmvTyreBlock = false;
DCLink = 0;
Printed = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _trucksheettype{
public boolean IsInitialized;
public String InvoiceNo;
public int ID;
public String Code;
public double qty;
public void Initialize() {
IsInitialized = true;
InvoiceNo = "";
ID = 0;
Code = "";
qty = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _pictureupload{
public boolean IsInitialized;
public String FileName;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper Content;
public int InvoiceId;
public int IdInvoiceLines;
public String DocumentType;
public String CustVendor;
public String POorInvoice;
public void Initialize() {
IsInitialized = true;
FileName = "";
Content = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
InvoiceId = 0;
IdInvoiceLines = 0;
DocumentType = "";
CustVendor = "";
POorInvoice = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static String  _activity_actionbarhomeclick() throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub Activity_ActionBarHomeClick";
 //BA.debugLineNum = 59;BA.debugLine="ActionBarHomeClicked = True";
_actionbarhomeclicked = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 60;BA.debugLine="B4XPages.Delegate.Activity_ActionBarHomeClick";
mostCurrent._b4xpages._delegate /*b4a.SapyLiveSystem.b4xpagesdelegator*/ ._activity_actionbarhomeclick /*String*/ ();
 //BA.debugLineNum = 61;BA.debugLine="ActionBarHomeClicked = False";
_actionbarhomeclicked = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return "";
}
public static String  _activity_create(boolean _firsttime) throws Exception{
b4a.SapyLiveSystem.b4xpagesmanager _pm = null;
 //BA.debugLineNum = 48;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
 //BA.debugLineNum = 49;BA.debugLine="Awake.KeepAlive(True)";
_awake.KeepAlive(processBA,anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 50;BA.debugLine="Dim pm As B4XPagesManager";
_pm = new b4a.SapyLiveSystem.b4xpagesmanager();
 //BA.debugLineNum = 51;BA.debugLine="pm.Initialize(Activity)";
_pm._initialize /*String*/ (mostCurrent.activityBA,mostCurrent._activity);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
 //BA.debugLineNum = 65;BA.debugLine="Return B4XPages.Delegate.Activity_KeyPress(KeyCod";
if (true) return mostCurrent._b4xpages._delegate /*b4a.SapyLiveSystem.b4xpagesdelegator*/ ._activity_keypress /*boolean*/ (_keycode);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
 //BA.debugLineNum = 73;BA.debugLine="B4XPages.Delegate.Activity_Pause";
mostCurrent._b4xpages._delegate /*b4a.SapyLiveSystem.b4xpagesdelegator*/ ._activity_pause /*String*/ ();
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public static String  _activity_permissionresult(String _permission,boolean _result) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub Activity_PermissionResult (Permission As Strin";
 //BA.debugLineNum = 77;BA.debugLine="B4XPages.Delegate.Activity_PermissionResult(Permi";
mostCurrent._b4xpages._delegate /*b4a.SapyLiveSystem.b4xpagesdelegator*/ ._activity_permissionresult /*String*/ (_permission,_result);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub Activity_Resume";
 //BA.debugLineNum = 69;BA.debugLine="B4XPages.Delegate.Activity_Resume";
mostCurrent._b4xpages._delegate /*b4a.SapyLiveSystem.b4xpagesdelegator*/ ._activity_resume /*String*/ ();
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public static String  _create_menu(Object _menu) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub Create_Menu (Menu As Object)";
 //BA.debugLineNum = 81;BA.debugLine="B4XPages.Delegate.Create_Menu(Menu)";
mostCurrent._b4xpages._delegate /*b4a.SapyLiveSystem.b4xpagesdelegator*/ ._create_menu /*String*/ (_menu);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public static String  _globals() throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public static byte[]  _imagetobytes(anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _image) throws Exception{
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
 //BA.debugLineNum = 149;BA.debugLine="Public Sub ImageToBytes(Image As Bitmap) As Byte()";
 //BA.debugLineNum = 150;BA.debugLine="If Image.IsInitialized Then";
if (_image.IsInitialized()) { 
 //BA.debugLineNum = 151;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
 //BA.debugLineNum = 152;BA.debugLine="out.InitializeToBytesArray(0)";
_out.InitializeToBytesArray((int) (0));
 //BA.debugLineNum = 153;BA.debugLine="Image.WriteToStream(out, 100, \"JPEG\")";
_image.WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (100),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"JPEG"));
 //BA.debugLineNum = 154;BA.debugLine="out.Close";
_out.Close();
 //BA.debugLineNum = 155;BA.debugLine="Return out.ToBytesArray";
if (true) return _out.ToBytesArray();
 }else {
 //BA.debugLineNum = 157;BA.debugLine="Return Null";
if (true) return (byte[])(anywheresoftware.b4a.keywords.Common.Null);
 };
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return null;
}
public static void  _postpicture(b4a.SapyLiveSystem.main._pictureupload _a) throws Exception{
ResumableSub_PostPicture rsub = new ResumableSub_PostPicture(null,_a);
rsub.resume(processBA, null);
}
public static class ResumableSub_PostPicture extends BA.ResumableSub {
public ResumableSub_PostPicture(b4a.SapyLiveSystem.main parent,b4a.SapyLiveSystem.main._pictureupload _a) {
this.parent = parent;
this._a = _a;
}
b4a.SapyLiveSystem.main parent;
b4a.SapyLiveSystem.main._pictureupload _a;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
String _scommand = "";
anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
String _base = "";
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
 //BA.debugLineNum = 88;BA.debugLine="Dim map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 89;BA.debugLine="map1.Initialize";
_map1.Initialize();
 //BA.debugLineNum = 90;BA.debugLine="map1.Clear";
_map1.Clear();
 //BA.debugLineNum = 91;BA.debugLine="map1.Put(\"ContentType\",a.DocumentType)";
_map1.Put((Object)("ContentType"),(Object)(_a.DocumentType /*String*/ ));
 //BA.debugLineNum = 92;BA.debugLine="map1.Put(\"FileName\", a.FileName)";
_map1.Put((Object)("FileName"),(Object)(_a.FileName /*String*/ ));
 //BA.debugLineNum = 93;BA.debugLine="Dim scommand As String";
_scommand = "";
 //BA.debugLineNum = 98;BA.debugLine="Dim bmp As B4XBitmap  =a.Content";
_bmp = new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper();
_bmp = (anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper(), (android.graphics.Bitmap)(_a.Content /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/ .getObject()));
 //BA.debugLineNum = 100;BA.debugLine="Dim out As OutputStream = File.OpenOutput(xui.Def";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
_out = anywheresoftware.b4a.keywords.Common.File.OpenOutput(parent._xui.getDefaultFolder(),"1.jpg",anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 101;BA.debugLine="bmp.WriteToStream(out, 100, \"JPEG\")";
_bmp.WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (100),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"JPEG"));
 //BA.debugLineNum = 102;BA.debugLine="out.Close";
_out.Close();
 //BA.debugLineNum = 103;BA.debugLine="Base64Con.Initialize()";
parent._base64con._initialize(processBA);
 //BA.debugLineNum = 104;BA.debugLine="Dim base As String = Base64Con.EncodeFromImage(xu";
_base = parent._base64con._v6(parent._xui.getDefaultFolder(),"1.jpg");
 //BA.debugLineNum = 107;BA.debugLine="map1.Put(\"id\",0)";
_map1.Put((Object)("id"),(Object)(0));
 //BA.debugLineNum = 109;BA.debugLine="map1.Put(\"content\",base)";
_map1.Put((Object)("content"),(Object)(_base));
 //BA.debugLineNum = 110;BA.debugLine="map1.Put(\"InvoiceId\", a.InvoiceId)";
_map1.Put((Object)("InvoiceId"),(Object)(_a.InvoiceId /*int*/ ));
 //BA.debugLineNum = 111;BA.debugLine="map1.Put(\"IdInvoiceLines\", a.IdInvoiceLines)";
_map1.Put((Object)("IdInvoiceLines"),(Object)(_a.IdInvoiceLines /*int*/ ));
 //BA.debugLineNum = 112;BA.debugLine="map1.Put(\"DocumentType\", a.DocumentType)";
_map1.Put((Object)("DocumentType"),(Object)(_a.DocumentType /*String*/ ));
 //BA.debugLineNum = 113;BA.debugLine="map1.Put(\"CreatedBy\", UserLogin)";
_map1.Put((Object)("CreatedBy"),(Object)(parent._userlogin));
 //BA.debugLineNum = 114;BA.debugLine="map1.Put(\"POorInvoice\",a.POorInvoice)";
_map1.Put((Object)("POorInvoice"),(Object)(_a.POorInvoice /*String*/ ));
 //BA.debugLineNum = 115;BA.debugLine="map1.Put(\"CustVendor\",a.CustVendor)";
_map1.Put((Object)("CustVendor"),(Object)(_a.CustVendor /*String*/ ));
 //BA.debugLineNum = 119;BA.debugLine="Dim JSON As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
 //BA.debugLineNum = 120;BA.debugLine="JSON.Initialize(map1)";
_json.Initialize(_map1);
 //BA.debugLineNum = 122;BA.debugLine="Dim data As String =   JSON.ToPrettyString(1)";
_data = _json.ToPrettyString((int) (1));
 //BA.debugLineNum = 124;BA.debugLine="Dim j As HttpJob";
_j = new b4a.SapyLiveSystem.httpjob();
 //BA.debugLineNum = 125;BA.debugLine="j.Initialize(\"\", Me) 'name is empty as it is no l";
_j._initialize /*String*/ (processBA,"",main.getObject());
 //BA.debugLineNum = 126;BA.debugLine="Dim strwww As String =Server";
_strwww = parent._server;
 //BA.debugLineNum = 129;BA.debugLine="Dim strPolocy As String";
_strpolocy = "";
 //BA.debugLineNum = 130;BA.debugLine="Log(\"After jdownload\")";
anywheresoftware.b4a.keywords.Common.LogImpl("6589870","After jdownload",0);
 //BA.debugLineNum = 132;BA.debugLine="strwww =Server & \"/api/Attachments\"";
_strwww = parent._server+"/api/Attachments";
 //BA.debugLineNum = 135;BA.debugLine="j.PostString( strwww,data)";
_j._poststring /*String*/ (_strwww,_data);
 //BA.debugLineNum = 137;BA.debugLine="J.GetRequest.SetHeader(\"Authorization\",\"Bearer \"";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetHeader("Authorization","Bearer "+parent._token);
 //BA.debugLineNum = 138;BA.debugLine="j.GetRequest.SetContentType(\"application/json\")";
_j._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ ().SetContentType("application/json");
 //BA.debugLineNum = 141;BA.debugLine="Wait For (j) JobDone(j As HttpJob)";
anywheresoftware.b4a.keywords.Common.WaitFor("jobdone", processBA, this, (Object)(_j));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_j = (b4a.SapyLiveSystem.httpjob) result[0];
;
 //BA.debugLineNum = 142;BA.debugLine="If j.Success Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_j._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 //BA.debugLineNum = 143;BA.debugLine="ToastMessageShow(\"Picture Uploaded\",True)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Picture Uploaded"),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 4:
//C
this.state = -1;
;
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _jobdone(b4a.SapyLiveSystem.httpjob _j) throws Exception{
}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4a.example.dateutils._process_globals();
main._process_globals();
starter._process_globals();
b4xpages._process_globals();
b4xcollections._process_globals();
httputils2service._process_globals();
xuiviewsutils._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 18;BA.debugLine="Public ActionBarHomeClicked As Boolean";
_actionbarhomeclicked = false;
 //BA.debugLineNum = 24;BA.debugLine="Public Server As String = \"http://sapy.dyndns.org";
_server = "http://sapy.dyndns.org:51758";
 //BA.debugLineNum = 25;BA.debugLine="Public Token As String";
_token = "";
 //BA.debugLineNum = 26;BA.debugLine="Public UserLogin As String";
_userlogin = "";
 //BA.debugLineNum = 27;BA.debugLine="Public IMENo As String";
_imeno = "";
 //BA.debugLineNum = 28;BA.debugLine="Dim Awake As PhoneWakeState";
_awake = new anywheresoftware.b4a.phone.Phone.PhoneWakeState();
 //BA.debugLineNum = 29;BA.debugLine="Dim PoListypel As List";
_polistypel = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 30;BA.debugLine="Dim CurrentPoLine As Int";
_currentpoline = 0;
 //BA.debugLineNum = 31;BA.debugLine="Dim BitmapPicture As Bitmap";
_bitmappicture = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Public PictureContentType As String";
_picturecontenttype = "";
 //BA.debugLineNum = 33;BA.debugLine="Type PoListype (fQtyChange  As Double, invTotalIn";
;
 //BA.debugLineNum = 34;BA.debugLine="Type TruckSheetType (InvoiceNo  As String, ID  As";
;
 //BA.debugLineNum = 35;BA.debugLine="Type PictureUpload(FileName As String, Content As";
;
 //BA.debugLineNum = 36;BA.debugLine="Public OrderList As List";
_orderlist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 37;BA.debugLine="Public TruckControlSheetList As List";
_truckcontrolsheetlist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 38;BA.debugLine="Public  x As OrderInfo";
_x = new b4a.SapyLiveSystem.grvstockin._orderinfo();
 //BA.debugLineNum = 39;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
 //BA.debugLineNum = 40;BA.debugLine="Dim Base64Con As Base64Convert";
_base64con = new com.simplysoftware.base64convert.base64convert();
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public boolean _onCreateOptionsMenu(android.view.Menu menu) {
	 processBA.raiseEvent(null, "create_menu", menu);
	 return true;
	
}
}
