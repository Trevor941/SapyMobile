package b4a.SapyLiveSystem.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_mainmenupage{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("btngrvstock").vw.setTop((int)((0d / 100 * height)));
views.get("btngrvstock").vw.setHeight((int)((15d / 100 * height) - ((0d / 100 * height))));
views.get("btngrvstock").vw.setLeft((int)((25d / 100 * width)));
views.get("btngrvstock").vw.setWidth((int)((75d / 100 * width) - ((25d / 100 * width))));
views.get("btntransferstock").vw.setTop((int)((15d / 100 * height)));
views.get("btntransferstock").vw.setHeight((int)((30d / 100 * height) - ((15d / 100 * height))));
views.get("btntransferstock").vw.setLeft((int)((25d / 100 * width)));
views.get("btntransferstock").vw.setWidth((int)((75d / 100 * width) - ((25d / 100 * width))));
views.get("btndrawstock").vw.setTop((int)((30d / 100 * height)));
views.get("btndrawstock").vw.setHeight((int)((45d / 100 * height) - ((30d / 100 * height))));
views.get("btndrawstock").vw.setLeft((int)((25d / 100 * width)));
views.get("btndrawstock").vw.setWidth((int)((75d / 100 * width) - ((25d / 100 * width))));
views.get("btndispatchplan").vw.setTop((int)((45d / 100 * height)));
views.get("btndispatchplan").vw.setHeight((int)((60d / 100 * height) - ((45d / 100 * height))));
views.get("btndispatchplan").vw.setLeft((int)((25d / 100 * width)));
views.get("btndispatchplan").vw.setWidth((int)((75d / 100 * width) - ((25d / 100 * width))));
views.get("btnreciepts").vw.setTop((int)((60d / 100 * height)));
views.get("btnreciepts").vw.setHeight((int)((75d / 100 * height) - ((60d / 100 * height))));
views.get("btnreciepts").vw.setLeft((int)((25d / 100 * width)));
views.get("btnreciepts").vw.setWidth((int)((75d / 100 * width) - ((25d / 100 * width))));
views.get("btntrucksheet").vw.setTop((int)((60d / 100 * height)));
views.get("btntrucksheet").vw.setHeight((int)((75d / 100 * height) - ((60d / 100 * height))));
views.get("btntrucksheet").vw.setLeft((int)((25d / 100 * width)));
views.get("btntrucksheet").vw.setWidth((int)((75d / 100 * width) - ((25d / 100 * width))));
views.get("btnsetup").vw.setTop((int)((75d / 100 * height)));
views.get("btnsetup").vw.setHeight((int)((90d / 100 * height) - ((75d / 100 * height))));
views.get("btnsetup").vw.setLeft((int)((25d / 100 * width)));
views.get("btnsetup").vw.setWidth((int)((75d / 100 * width) - ((25d / 100 * width))));
views.get("btnlogout").vw.setTop((int)((90d / 100 * height)));
views.get("btnlogout").vw.setHeight((int)((100d / 100 * height) - ((90d / 100 * height))));
views.get("btnlogout").vw.setLeft((int)((25d / 100 * width)));
views.get("btnlogout").vw.setWidth((int)((75d / 100 * width) - ((25d / 100 * width))));

}
}