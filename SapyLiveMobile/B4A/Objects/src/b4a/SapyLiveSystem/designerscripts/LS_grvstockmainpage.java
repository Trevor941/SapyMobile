package b4a.SapyLiveSystem.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_grvstockmainpage{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("panel1").vw.setTop((int)((10d / 100 * height)));
views.get("panel1").vw.setHeight((int)((90d / 100 * height) - ((10d / 100 * height))));
views.get("panel1").vw.setLeft((int)((0d / 100 * width)));
views.get("panel1").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("btnreturn").vw.setTop((int)((90d / 100 * height)));
views.get("btnreturn").vw.setHeight((int)((100d / 100 * height) - ((90d / 100 * height))));
views.get("btnreturn").vw.setLeft((int)((0d / 100 * width)));
views.get("btnreturn").vw.setWidth((int)((33d / 100 * width) - ((0d / 100 * width))));
views.get("btnprintlabel").vw.setTop((int)((90d / 100 * height)));
views.get("btnprintlabel").vw.setHeight((int)((100d / 100 * height) - ((90d / 100 * height))));
views.get("btnprintlabel").vw.setLeft((int)((66d / 100 * width)));
views.get("btnprintlabel").vw.setWidth((int)((100d / 100 * width) - ((66d / 100 * width))));
views.get("btnsave").vw.setTop((int)((90d / 100 * height)));
views.get("btnsave").vw.setHeight((int)((100d / 100 * height) - ((90d / 100 * height))));
views.get("btnsave").vw.setLeft((int)((33d / 100 * width)));
views.get("btnsave").vw.setWidth((int)((66d / 100 * width) - ((33d / 100 * width))));
views.get("lblwarehouse").vw.setTop((int)((0d / 100 * height)));
views.get("lblwarehouse").vw.setHeight((int)((10d / 100 * height) - ((0d / 100 * height))));
views.get("lblwarehouse").vw.setLeft((int)((0d / 100 * width)));
views.get("lblwarehouse").vw.setWidth((int)((30d / 100 * width) - ((0d / 100 * width))));
views.get("txtscan").vw.setTop((int)((0d / 100 * height)));
views.get("txtscan").vw.setHeight((int)((10d / 100 * height) - ((0d / 100 * height))));
views.get("txtscan").vw.setLeft((int)((30d / 100 * width)));
views.get("txtscan").vw.setWidth((int)((70d / 100 * width) - ((30d / 100 * width))));
views.get("btnviewheaderinfo").vw.setTop((int)((0d / 100 * height)));
views.get("btnviewheaderinfo").vw.setHeight((int)((10d / 100 * height) - ((0d / 100 * height))));
views.get("btnviewheaderinfo").vw.setLeft((int)((70d / 100 * width)));
views.get("btnviewheaderinfo").vw.setWidth((int)((100d / 100 * width) - ((70d / 100 * width))));

}
}