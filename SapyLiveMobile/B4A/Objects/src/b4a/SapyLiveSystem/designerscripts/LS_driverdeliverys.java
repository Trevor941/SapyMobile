package b4a.SapyLiveSystem.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_driverdeliverys{

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
views.get("btnreturn").vw.setWidth((int)((50d / 100 * width) - ((0d / 100 * width))));
views.get("btnrefresh").vw.setTop((int)((90d / 100 * height)));
views.get("btnrefresh").vw.setHeight((int)((100d / 100 * height) - ((90d / 100 * height))));
views.get("btnrefresh").vw.setLeft((int)((50d / 100 * width)));
views.get("btnrefresh").vw.setWidth((int)((100d / 100 * width) - ((50d / 100 * width))));
views.get("label1").vw.setTop((int)((0d / 100 * height)));
views.get("label1").vw.setHeight((int)((10d / 100 * height) - ((0d / 100 * height))));
views.get("label1").vw.setLeft((int)((0d / 100 * width)));
views.get("label1").vw.setWidth((int)((30d / 100 * width) - ((0d / 100 * width))));
views.get("txtscan").vw.setTop((int)((0d / 100 * height)));
views.get("txtscan").vw.setHeight((int)((10d / 100 * height) - ((0d / 100 * height))));
views.get("txtscan").vw.setLeft((int)((40d / 100 * width)));
views.get("txtscan").vw.setWidth((int)((100d / 100 * width) - ((40d / 100 * width))));

}
}