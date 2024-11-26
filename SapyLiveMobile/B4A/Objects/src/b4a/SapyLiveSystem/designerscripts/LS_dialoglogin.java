package b4a.SapyLiveSystem.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_dialoglogin{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 1;BA.debugLine="Label1.SetLeftAndRight(1%x,29%x)"[DialogLogin/General script]
views.get("label1").vw.setLeft((int)((1d / 100 * width)));
views.get("label1").vw.setWidth((int)((29d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 2;BA.debugLine="Label2.SetLeftAndRight(1%x,29%x)"[DialogLogin/General script]
views.get("label2").vw.setLeft((int)((1d / 100 * width)));
views.get("label2").vw.setWidth((int)((29d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 3;BA.debugLine="EditText1.SetLeftAndRight(30%x,99%x)"[DialogLogin/General script]
views.get("edittext1").vw.setLeft((int)((30d / 100 * width)));
views.get("edittext1").vw.setWidth((int)((99d / 100 * width) - ((30d / 100 * width))));
//BA.debugLineNum = 4;BA.debugLine="EditText2.SetLeftAndRight(30%x,99%x)"[DialogLogin/General script]
views.get("edittext2").vw.setLeft((int)((30d / 100 * width)));
views.get("edittext2").vw.setWidth((int)((99d / 100 * width) - ((30d / 100 * width))));
//BA.debugLineNum = 5;BA.debugLine="Label1.SetTopAndBottom(5%y,15%y)"[DialogLogin/General script]
views.get("label1").vw.setTop((int)((5d / 100 * height)));
views.get("label1").vw.setHeight((int)((15d / 100 * height) - ((5d / 100 * height))));
//BA.debugLineNum = 6;BA.debugLine="EditText1.SetTopAndBottom(5%y,15%y)"[DialogLogin/General script]
views.get("edittext1").vw.setTop((int)((5d / 100 * height)));
views.get("edittext1").vw.setHeight((int)((15d / 100 * height) - ((5d / 100 * height))));
//BA.debugLineNum = 8;BA.debugLine="Label2.SetTopAndBottom(20%y,30%y)"[DialogLogin/General script]
views.get("label2").vw.setTop((int)((20d / 100 * height)));
views.get("label2").vw.setHeight((int)((30d / 100 * height) - ((20d / 100 * height))));
//BA.debugLineNum = 9;BA.debugLine="EditText2.SetTopAndBottom(20%y,30%y)"[DialogLogin/General script]
views.get("edittext2").vw.setTop((int)((20d / 100 * height)));
views.get("edittext2").vw.setHeight((int)((30d / 100 * height) - ((20d / 100 * height))));
//BA.debugLineNum = 12;BA.debugLine="Button1.SetTopAndBottom(35%y,50%y)"[DialogLogin/General script]
views.get("button1").vw.setTop((int)((35d / 100 * height)));
views.get("button1").vw.setHeight((int)((50d / 100 * height) - ((35d / 100 * height))));
//BA.debugLineNum = 13;BA.debugLine="Button1.SetLeftAndRight(25%x,75%x)"[DialogLogin/General script]
views.get("button1").vw.setLeft((int)((25d / 100 * width)));
views.get("button1").vw.setWidth((int)((75d / 100 * width) - ((25d / 100 * width))));

}
}