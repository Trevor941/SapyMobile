package b4a.SapyLiveSystem.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_mainpage{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("label1").vw.setLeft((int)((1d / 100 * width)));
views.get("label1").vw.setWidth((int)((29d / 100 * width) - ((1d / 100 * width))));
views.get("label2").vw.setLeft((int)((1d / 100 * width)));
views.get("label2").vw.setWidth((int)((29d / 100 * width) - ((1d / 100 * width))));
views.get("edittext1").vw.setLeft((int)((30d / 100 * width)));
views.get("edittext1").vw.setWidth((int)((99d / 100 * width) - ((30d / 100 * width))));
views.get("edittext2").vw.setLeft((int)((30d / 100 * width)));
views.get("edittext2").vw.setWidth((int)((99d / 100 * width) - ((30d / 100 * width))));
views.get("label1").vw.setTop((int)((5d / 100 * height)));
views.get("label1").vw.setHeight((int)((15d / 100 * height) - ((5d / 100 * height))));
views.get("edittext1").vw.setTop((int)((5d / 100 * height)));
views.get("edittext1").vw.setHeight((int)((15d / 100 * height) - ((5d / 100 * height))));
views.get("label2").vw.setTop((int)((20d / 100 * height)));
views.get("label2").vw.setHeight((int)((30d / 100 * height) - ((20d / 100 * height))));
views.get("edittext2").vw.setTop((int)((20d / 100 * height)));
views.get("edittext2").vw.setHeight((int)((30d / 100 * height) - ((20d / 100 * height))));
views.get("button1").vw.setTop((int)((35d / 100 * height)));
views.get("button1").vw.setHeight((int)((50d / 100 * height) - ((35d / 100 * height))));
views.get("button1").vw.setLeft((int)((25d / 100 * width)));
views.get("button1").vw.setWidth((int)((75d / 100 * width) - ((25d / 100 * width))));
views.get("imageview1").vw.setLeft((int)((0d / 100 * width)));
views.get("imageview1").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("imageview1").vw.setTop((int)((60d / 100 * height)));
views.get("imageview1").vw.setHeight((int)((100d / 100 * height) - ((60d / 100 * height))));
views.get("label3").vw.setLeft((int)((0d / 100 * width)));
views.get("label3").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("label3").vw.setTop((int)((50d / 100 * height)));
views.get("label3").vw.setHeight((int)((60d / 100 * height) - ((50d / 100 * height))));

}
}