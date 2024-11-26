package b4a.SapyLiveSystem.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_stocktransferpage{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("txtwarehouse").vw.setTop((int)((3d / 100 * height)));
views.get("txtwarehouse").vw.setHeight((int)((13d / 100 * height) - ((3d / 100 * height))));
views.get("txtwarehouse").vw.setLeft((int)((4d / 100 * width)));
views.get("txtwarehouse").vw.setWidth((int)((90d / 100 * width) - ((4d / 100 * width))));
views.get("btnchangewarehouse").vw.setTop((int)((15d / 100 * height)));
views.get("btnchangewarehouse").vw.setHeight((int)((25d / 100 * height) - ((15d / 100 * height))));
views.get("btnchangewarehouse").vw.setLeft((int)((4d / 100 * width)));
views.get("btnchangewarehouse").vw.setWidth((int)((90d / 100 * width) - ((4d / 100 * width))));
views.get("txtstockid").vw.setTop((int)((29d / 100 * height)));
views.get("txtstockid").vw.setHeight((int)((39d / 100 * height) - ((29d / 100 * height))));
views.get("txtstockid").vw.setLeft((int)((4d / 100 * width)));
views.get("txtstockid").vw.setWidth((int)((70d / 100 * width) - ((4d / 100 * width))));
views.get("lblresult").vw.setTop((int)((50d / 100 * height)));
views.get("lblresult").vw.setHeight((int)((70d / 100 * height) - ((50d / 100 * height))));
views.get("lblresult").vw.setLeft((int)((20d / 100 * width)));
views.get("lblresult").vw.setWidth((int)((80d / 100 * width) - ((20d / 100 * width))));
views.get("btnsubmit").vw.setLeft((int)((0d / 100 * width)));
views.get("btnsubmit").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("btnsubmit").vw.setTop((int)((80d / 100 * height)));
views.get("btnsubmit").vw.setHeight((int)((100d / 100 * height) - ((80d / 100 * height))));

}
}