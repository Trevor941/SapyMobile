package b4a.SapyLiveSystem.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_truckcontrolsheet{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("txttrucksheet").vw.setTop((int)((0d / 100 * height)));
views.get("txttrucksheet").vw.setHeight((int)((10d / 100 * height) - ((0d / 100 * height))));
views.get("txttrucksheet").vw.setLeft((int)((35d / 100 * width)));
views.get("txttrucksheet").vw.setWidth((int)((95d / 100 * width) - ((35d / 100 * width))));
views.get("label1").vw.setTop((int)((0d / 100 * height)));
views.get("label1").vw.setHeight((int)((10d / 100 * height) - ((0d / 100 * height))));
views.get("label1").vw.setLeft((int)((3d / 100 * width)));
views.get("label1").vw.setWidth((int)((34d / 100 * width) - ((3d / 100 * width))));
views.get("label2").vw.setTop((int)((10d / 100 * height)));
views.get("label2").vw.setHeight((int)((20d / 100 * height) - ((10d / 100 * height))));
views.get("label2").vw.setLeft((int)((3d / 100 * width)));
views.get("label2").vw.setWidth((int)((34d / 100 * width) - ((3d / 100 * width))));
views.get("txtinvoice").vw.setTop((int)((10d / 100 * height)));
views.get("txtinvoice").vw.setHeight((int)((20d / 100 * height) - ((10d / 100 * height))));
views.get("txtinvoice").vw.setLeft((int)((35d / 100 * width)));
views.get("txtinvoice").vw.setWidth((int)((95d / 100 * width) - ((35d / 100 * width))));
views.get("btnclear").vw.setTop((int)((21d / 100 * height)));
views.get("btnclear").vw.setHeight((int)((30d / 100 * height) - ((21d / 100 * height))));
views.get("btnclear").vw.setLeft((int)((3d / 100 * width)));
views.get("btnclear").vw.setWidth((int)((95d / 100 * width) - ((3d / 100 * width))));
views.get("panel1").vw.setTop((int)((31d / 100 * height)));
views.get("panel1").vw.setHeight((int)((100d / 100 * height) - ((31d / 100 * height))));
views.get("panel1").vw.setLeft((int)((0d / 100 * width)));
views.get("panel1").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));

}
}