package b4a.SapyLiveSystem.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_drawstockpage{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
views.get("txtscan").vw.setTop((int)((0d / 100 * height)));
views.get("txtscan").vw.setHeight((int)((10d / 100 * height) - ((0d / 100 * height))));
views.get("txtscan").vw.setLeft((int)((26d / 100 * width)));
views.get("txtscan").vw.setWidth((int)((100d / 100 * width) - ((26d / 100 * width))));
views.get("label2").vw.setTop((int)((0d / 100 * height)));
views.get("label2").vw.setHeight((int)((10d / 100 * height) - ((0d / 100 * height))));
views.get("label2").vw.setLeft((int)((0d / 100 * width)));
views.get("label2").vw.setWidth((int)((25d / 100 * width) - ((0d / 100 * width))));
views.get("label1").vw.setTop((int)((15d / 100 * height)));
views.get("label1").vw.setHeight((int)((22d / 100 * height) - ((15d / 100 * height))));
views.get("label1").vw.setLeft((int)((0d / 100 * width)));
views.get("label1").vw.setWidth((int)((25d / 100 * width) - ((0d / 100 * width))));
views.get("lblcode").vw.setTop((int)((15d / 100 * height)));
views.get("lblcode").vw.setHeight((int)((22d / 100 * height) - ((15d / 100 * height))));
views.get("lblcode").vw.setLeft((int)((26d / 100 * width)));
views.get("lblcode").vw.setWidth((int)((100d / 100 * width) - ((26d / 100 * width))));
views.get("label3").vw.setTop((int)((22d / 100 * height)));
views.get("label3").vw.setHeight((int)((29d / 100 * height) - ((22d / 100 * height))));
views.get("label3").vw.setLeft((int)((0d / 100 * width)));
views.get("label3").vw.setWidth((int)((25d / 100 * width) - ((0d / 100 * width))));
views.get("lbldesc").vw.setTop((int)((22d / 100 * height)));
views.get("lbldesc").vw.setHeight((int)((29d / 100 * height) - ((22d / 100 * height))));
views.get("lbldesc").vw.setLeft((int)((26d / 100 * width)));
views.get("lbldesc").vw.setWidth((int)((100d / 100 * width) - ((26d / 100 * width))));
views.get("label5").vw.setTop((int)((29d / 100 * height)));
views.get("label5").vw.setHeight((int)((36d / 100 * height) - ((29d / 100 * height))));
views.get("label5").vw.setLeft((int)((0d / 100 * width)));
views.get("label5").vw.setWidth((int)((25d / 100 * width) - ((0d / 100 * width))));
views.get("lblorginalqty").vw.setTop((int)((29d / 100 * height)));
views.get("lblorginalqty").vw.setHeight((int)((36d / 100 * height) - ((29d / 100 * height))));
views.get("lblorginalqty").vw.setLeft((int)((26d / 100 * width)));
views.get("lblorginalqty").vw.setWidth((int)((100d / 100 * width) - ((26d / 100 * width))));
views.get("label7").vw.setTop((int)((36d / 100 * height)));
views.get("label7").vw.setHeight((int)((43d / 100 * height) - ((36d / 100 * height))));
views.get("label7").vw.setLeft((int)((0d / 100 * width)));
views.get("label7").vw.setWidth((int)((25d / 100 * width) - ((0d / 100 * width))));
views.get("lblcurrentqty").vw.setTop((int)((36d / 100 * height)));
views.get("lblcurrentqty").vw.setHeight((int)((43d / 100 * height) - ((36d / 100 * height))));
views.get("lblcurrentqty").vw.setLeft((int)((26d / 100 * width)));
views.get("lblcurrentqty").vw.setWidth((int)((100d / 100 * width) - ((26d / 100 * width))));
views.get("label9").vw.setTop((int)((43d / 100 * height)));
views.get("label9").vw.setHeight((int)((50d / 100 * height) - ((43d / 100 * height))));
views.get("label9").vw.setLeft((int)((0d / 100 * width)));
views.get("label9").vw.setWidth((int)((25d / 100 * width) - ((0d / 100 * width))));
views.get("txtenterqty").vw.setTop((int)((43d / 100 * height)));
views.get("txtenterqty").vw.setHeight((int)((50d / 100 * height) - ((43d / 100 * height))));
views.get("txtenterqty").vw.setLeft((int)((26d / 100 * width)));
views.get("txtenterqty").vw.setWidth((int)((100d / 100 * width) - ((26d / 100 * width))));
views.get("label10").vw.setTop((int)((50d / 100 * height)));
views.get("label10").vw.setHeight((int)((57d / 100 * height) - ((50d / 100 * height))));
views.get("label10").vw.setLeft((int)((0d / 100 * width)));
views.get("label10").vw.setWidth((int)((25d / 100 * width) - ((0d / 100 * width))));
views.get("lblremainingqty").vw.setTop((int)((50d / 100 * height)));
views.get("lblremainingqty").vw.setHeight((int)((57d / 100 * height) - ((50d / 100 * height))));
views.get("lblremainingqty").vw.setLeft((int)((26d / 100 * width)));
views.get("lblremainingqty").vw.setWidth((int)((100d / 100 * width) - ((26d / 100 * width))));
views.get("btnreturn").vw.setTop((int)((70d / 100 * height)));
views.get("btnreturn").vw.setHeight((int)((85d / 100 * height) - ((70d / 100 * height))));
views.get("btnreturn").vw.setLeft((int)((0d / 100 * width)));
views.get("btnreturn").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("btnsubmit").vw.setTop((int)((85d / 100 * height)));
views.get("btnsubmit").vw.setHeight((int)((100d / 100 * height) - ((85d / 100 * height))));
views.get("btnsubmit").vw.setLeft((int)((0d / 100 * width)));
views.get("btnsubmit").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));

}
}