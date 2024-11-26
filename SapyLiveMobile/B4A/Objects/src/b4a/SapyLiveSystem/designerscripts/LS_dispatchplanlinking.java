package b4a.SapyLiveSystem.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_dispatchplanlinking{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("label1").vw.setTop((int)((0d / 100 * height)));
views.get("label1").vw.setHeight((int)((7d / 100 * height) - ((0d / 100 * height))));
views.get("label1").vw.setLeft((int)((0d / 100 * width)));
views.get("label1").vw.setWidth((int)((30d / 100 * width) - ((0d / 100 * width))));
views.get("txtscanplan").vw.setTop((int)((0d / 100 * height)));
views.get("txtscanplan").vw.setHeight((int)((7d / 100 * height) - ((0d / 100 * height))));
views.get("txtscanplan").vw.setLeft((int)((30.5d / 100 * width)));
views.get("txtscanplan").vw.setWidth((int)((100d / 100 * width) - ((30.5d / 100 * width))));
views.get("label2").vw.setTop((int)((7d / 100 * height)));
views.get("label2").vw.setHeight((int)((14d / 100 * height) - ((7d / 100 * height))));
views.get("label2").vw.setLeft((int)((0d / 100 * width)));
views.get("label2").vw.setWidth((int)((30d / 100 * width) - ((0d / 100 * width))));
views.get("lblitemscanned").vw.setTop((int)((7d / 100 * height)));
views.get("lblitemscanned").vw.setHeight((int)((14d / 100 * height) - ((7d / 100 * height))));
views.get("lblitemscanned").vw.setLeft((int)((30.5d / 100 * width)));
views.get("lblitemscanned").vw.setWidth((int)((100d / 100 * width) - ((30.5d / 100 * width))));
views.get("label3").vw.setTop((int)((14d / 100 * height)));
views.get("label3").vw.setHeight((int)((21d / 100 * height) - ((14d / 100 * height))));
views.get("label3").vw.setLeft((int)((0d / 100 * width)));
views.get("label3").vw.setWidth((int)((30d / 100 * width) - ((0d / 100 * width))));
views.get("lblcustomer").vw.setTop((int)((21d / 100 * height)));
views.get("lblcustomer").vw.setHeight((int)((28d / 100 * height) - ((21d / 100 * height))));
views.get("lblcustomer").vw.setLeft((int)((30d / 100 * width)));
views.get("lblcustomer").vw.setWidth((int)((100d / 100 * width) - ((30d / 100 * width))));
views.get("label5").vw.setTop((int)((21d / 100 * height)));
views.get("label5").vw.setHeight((int)((28d / 100 * height) - ((21d / 100 * height))));
views.get("label5").vw.setLeft((int)((0d / 100 * width)));
views.get("label5").vw.setWidth((int)((30d / 100 * width) - ((0d / 100 * width))));
views.get("label5").vw.setTop((int)((21d / 100 * height)));
views.get("label5").vw.setHeight((int)((28d / 100 * height) - ((21d / 100 * height))));
views.get("label5").vw.setLeft((int)((0d / 100 * width)));
views.get("label5").vw.setWidth((int)((30d / 100 * width) - ((0d / 100 * width))));
views.get("label4").vw.setTop((int)((28d / 100 * height)));
views.get("label4").vw.setHeight((int)((35d / 100 * height) - ((28d / 100 * height))));
views.get("label4").vw.setLeft((int)((0d / 100 * width)));
views.get("label4").vw.setWidth((int)((30d / 100 * width) - ((0d / 100 * width))));
views.get("label7").vw.setTop((int)((28d / 100 * height)));
views.get("label7").vw.setHeight((int)((35d / 100 * height) - ((28d / 100 * height))));
views.get("label7").vw.setLeft((int)((60d / 100 * width)));
views.get("label7").vw.setWidth((int)((73d / 100 * width) - ((60d / 100 * width))));
views.get("label8").vw.setTop((int)((28d / 100 * height)));
views.get("label8").vw.setHeight((int)((35d / 100 * height) - ((28d / 100 * height))));
views.get("label8").vw.setLeft((int)((73d / 100 * width)));
views.get("label8").vw.setWidth((int)((86d / 100 * width) - ((73d / 100 * width))));
views.get("label9").vw.setTop((int)((28d / 100 * height)));
views.get("label9").vw.setHeight((int)((35d / 100 * height) - ((28d / 100 * height))));
views.get("label9").vw.setLeft((int)((86d / 100 * width)));
views.get("label9").vw.setWidth((int)((100d / 100 * width) - ((86d / 100 * width))));
views.get("label6").vw.setTop((int)((28d / 100 * height)));
views.get("label6").vw.setHeight((int)((35d / 100 * height) - ((28d / 100 * height))));
views.get("label6").vw.setLeft((int)((30d / 100 * width)));
views.get("label6").vw.setWidth((int)((60d / 100 * width) - ((30d / 100 * width))));
views.get("txtscanitem").vw.setTop((int)((14d / 100 * height)));
views.get("txtscanitem").vw.setHeight((int)((21d / 100 * height) - ((14d / 100 * height))));
views.get("txtscanitem").vw.setLeft((int)((30.5d / 100 * width)));
views.get("txtscanitem").vw.setWidth((int)((100d / 100 * width) - ((30.5d / 100 * width))));
views.get("panel1").vw.setTop((int)((35d / 100 * height)));
views.get("panel1").vw.setHeight((int)((90d / 100 * height) - ((35d / 100 * height))));
views.get("panel1").vw.setLeft((int)((0d / 100 * width)));
views.get("panel1").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("btncomplete").vw.setTop((int)((90d / 100 * height)));
views.get("btncomplete").vw.setHeight((int)((100d / 100 * height) - ((90d / 100 * height))));
views.get("btncomplete").vw.setLeft((int)((0d / 100 * width)));
views.get("btncomplete").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));

}
}