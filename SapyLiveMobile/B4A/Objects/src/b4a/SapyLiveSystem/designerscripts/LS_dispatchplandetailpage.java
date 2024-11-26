package b4a.SapyLiveSystem.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_dispatchplandetailpage{

public static void LS_general(anywheresoftware.b4a.BA ba, android.view.View parent, anywheresoftware.b4a.keywords.LayoutValues lv, java.util.Map props,
java.util.Map<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) throws Exception {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("label1").vw.setTop((int)((0d / 100 * height)));
views.get("label1").vw.setHeight((int)((7d / 100 * height) - ((0d / 100 * height))));
views.get("label1").vw.setLeft((int)((0d / 100 * width)));
views.get("label1").vw.setWidth((int)((30d / 100 * width) - ((0d / 100 * width))));
views.get("lblinvoice").vw.setTop((int)((0d / 100 * height)));
views.get("lblinvoice").vw.setHeight((int)((7d / 100 * height) - ((0d / 100 * height))));
views.get("lblinvoice").vw.setLeft((int)((30d / 100 * width)));
views.get("lblinvoice").vw.setWidth((int)((100d / 100 * width) - ((30d / 100 * width))));
views.get("lblcustomer").vw.setTop((int)((7d / 100 * height)));
views.get("lblcustomer").vw.setHeight((int)((14d / 100 * height) - ((7d / 100 * height))));
views.get("lblcustomer").vw.setLeft((int)((30d / 100 * width)));
views.get("lblcustomer").vw.setWidth((int)((100d / 100 * width) - ((30d / 100 * width))));
views.get("label3").vw.setTop((int)((7d / 100 * height)));
views.get("label3").vw.setHeight((int)((14d / 100 * height) - ((7d / 100 * height))));
views.get("label3").vw.setLeft((int)((0d / 100 * width)));
views.get("label3").vw.setWidth((int)((30d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 16;BA.debugLine="Label5.SetTopAndBottom(14%y,21%y)"[DispatchPlanDetailPage/General script]
views.get("label5").vw.setTop((int)((14d / 100 * height)));
views.get("label5").vw.setHeight((int)((21d / 100 * height) - ((14d / 100 * height))));
//BA.debugLineNum = 17;BA.debugLine="Label5.SetLeftAndRight(0%x,30%x)"[DispatchPlanDetailPage/General script]
views.get("label5").vw.setLeft((int)((0d / 100 * width)));
views.get("label5").vw.setWidth((int)((30d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 19;BA.debugLine="lblFrieghtCompany.SetTopAndBottom(14%y,21%y)"[DispatchPlanDetailPage/General script]
views.get("lblfrieghtcompany").vw.setTop((int)((14d / 100 * height)));
views.get("lblfrieghtcompany").vw.setHeight((int)((21d / 100 * height) - ((14d / 100 * height))));
//BA.debugLineNum = 20;BA.debugLine="lblFrieghtCompany.SetLeftAndRight(30%x,100%x)"[DispatchPlanDetailPage/General script]
views.get("lblfrieghtcompany").vw.setLeft((int)((30d / 100 * width)));
views.get("lblfrieghtcompany").vw.setWidth((int)((100d / 100 * width) - ((30d / 100 * width))));
//BA.debugLineNum = 23;BA.debugLine="Label7.SetTopAndBottom(21%y,28%y)"[DispatchPlanDetailPage/General script]
views.get("label7").vw.setTop((int)((21d / 100 * height)));
views.get("label7").vw.setHeight((int)((28d / 100 * height) - ((21d / 100 * height))));
//BA.debugLineNum = 24;BA.debugLine="Label7.SetLeftAndRight(0%x,30%x)"[DispatchPlanDetailPage/General script]
views.get("label7").vw.setLeft((int)((0d / 100 * width)));
views.get("label7").vw.setWidth((int)((30d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 27;BA.debugLine="lblFreightCostFor.SetTopAndBottom(21%y,28%y)"[DispatchPlanDetailPage/General script]
views.get("lblfreightcostfor").vw.setTop((int)((21d / 100 * height)));
views.get("lblfreightcostfor").vw.setHeight((int)((28d / 100 * height) - ((21d / 100 * height))));
//BA.debugLineNum = 28;BA.debugLine="lblFreightCostFor.SetLeftAndRight(30%x,100%x)"[DispatchPlanDetailPage/General script]
views.get("lblfreightcostfor").vw.setLeft((int)((30d / 100 * width)));
views.get("lblfreightcostfor").vw.setWidth((int)((100d / 100 * width) - ((30d / 100 * width))));
//BA.debugLineNum = 31;BA.debugLine="Label9.SetTopAndBottom(28%y,35%y)"[DispatchPlanDetailPage/General script]
views.get("label9").vw.setTop((int)((28d / 100 * height)));
views.get("label9").vw.setHeight((int)((35d / 100 * height) - ((28d / 100 * height))));
//BA.debugLineNum = 32;BA.debugLine="Label9.SetLeftAndRight(0%x,30%x)"[DispatchPlanDetailPage/General script]
views.get("label9").vw.setLeft((int)((0d / 100 * width)));
views.get("label9").vw.setWidth((int)((30d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 35;BA.debugLine="lblOrderNo.SetTopAndBottom(28%y,35%y)"[DispatchPlanDetailPage/General script]
views.get("lblorderno").vw.setTop((int)((28d / 100 * height)));
views.get("lblorderno").vw.setHeight((int)((35d / 100 * height) - ((28d / 100 * height))));
//BA.debugLineNum = 36;BA.debugLine="lblOrderNo.SetLeftAndRight(30%x,100%x)"[DispatchPlanDetailPage/General script]
views.get("lblorderno").vw.setLeft((int)((30d / 100 * width)));
views.get("lblorderno").vw.setWidth((int)((100d / 100 * width) - ((30d / 100 * width))));
//BA.debugLineNum = 39;BA.debugLine="lblItemCodeee.SetTopAndBottom(35%y,42%y)"[DispatchPlanDetailPage/General script]
views.get("lblitemcodeee").vw.setTop((int)((35d / 100 * height)));
views.get("lblitemcodeee").vw.setHeight((int)((42d / 100 * height) - ((35d / 100 * height))));
//BA.debugLineNum = 40;BA.debugLine="lblItemCodeee.SetLeftAndRight(0%x,30%x)"[DispatchPlanDetailPage/General script]
views.get("lblitemcodeee").vw.setLeft((int)((0d / 100 * width)));
views.get("lblitemcodeee").vw.setWidth((int)((30d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 44;BA.debugLine="lblItemCode.SetTopAndBottom(35%y,42%y)"[DispatchPlanDetailPage/General script]
views.get("lblitemcode").vw.setTop((int)((35d / 100 * height)));
views.get("lblitemcode").vw.setHeight((int)((42d / 100 * height) - ((35d / 100 * height))));
//BA.debugLineNum = 45;BA.debugLine="lblItemCode.SetLeftAndRight(30%x,100%x)"[DispatchPlanDetailPage/General script]
views.get("lblitemcode").vw.setLeft((int)((30d / 100 * width)));
views.get("lblitemcode").vw.setWidth((int)((100d / 100 * width) - ((30d / 100 * width))));
//BA.debugLineNum = 48;BA.debugLine="lblQty2.SetTopAndBottom(42%y,49%y)"[DispatchPlanDetailPage/General script]
views.get("lblqty2").vw.setTop((int)((42d / 100 * height)));
views.get("lblqty2").vw.setHeight((int)((49d / 100 * height) - ((42d / 100 * height))));
//BA.debugLineNum = 49;BA.debugLine="lblQty2.SetLeftAndRight(0%x,30%x)"[DispatchPlanDetailPage/General script]
views.get("lblqty2").vw.setLeft((int)((0d / 100 * width)));
views.get("lblqty2").vw.setWidth((int)((30d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 52;BA.debugLine="lblQty.SetTopAndBottom(42%y,49%y)"[DispatchPlanDetailPage/General script]
views.get("lblqty").vw.setTop((int)((42d / 100 * height)));
views.get("lblqty").vw.setHeight((int)((49d / 100 * height) - ((42d / 100 * height))));
//BA.debugLineNum = 53;BA.debugLine="lblQty.SetLeftAndRight(30%x,100%x)"[DispatchPlanDetailPage/General script]
views.get("lblqty").vw.setLeft((int)((30d / 100 * width)));
views.get("lblqty").vw.setWidth((int)((100d / 100 * width) - ((30d / 100 * width))));
//BA.debugLineNum = 56;BA.debugLine="Label2.SetTopAndBottom(49%y,56%y)"[DispatchPlanDetailPage/General script]
views.get("label2").vw.setTop((int)((49d / 100 * height)));
views.get("label2").vw.setHeight((int)((56d / 100 * height) - ((49d / 100 * height))));
//BA.debugLineNum = 57;BA.debugLine="Label2.SetLeftAndRight(0%x,30%x)"[DispatchPlanDetailPage/General script]
views.get("label2").vw.setLeft((int)((0d / 100 * width)));
views.get("label2").vw.setWidth((int)((30d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 60;BA.debugLine="lblOnHand.SetTopAndBottom(49%y,56%y)"[DispatchPlanDetailPage/General script]
views.get("lblonhand").vw.setTop((int)((49d / 100 * height)));
views.get("lblonhand").vw.setHeight((int)((56d / 100 * height) - ((49d / 100 * height))));
//BA.debugLineNum = 61;BA.debugLine="lblOnHand.SetLeftAndRight(30%x,100%x)"[DispatchPlanDetailPage/General script]
views.get("lblonhand").vw.setLeft((int)((30d / 100 * width)));
views.get("lblonhand").vw.setWidth((int)((100d / 100 * width) - ((30d / 100 * width))));
//BA.debugLineNum = 65;BA.debugLine="Label4.SetTopAndBottom(56%y,63%y)"[DispatchPlanDetailPage/General script]
views.get("label4").vw.setTop((int)((56d / 100 * height)));
views.get("label4").vw.setHeight((int)((63d / 100 * height) - ((56d / 100 * height))));
//BA.debugLineNum = 66;BA.debugLine="Label4.SetLeftAndRight(0%x,30%x)"[DispatchPlanDetailPage/General script]
views.get("label4").vw.setLeft((int)((0d / 100 * width)));
views.get("label4").vw.setWidth((int)((30d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 69;BA.debugLine="lblScannedQty.SetTopAndBottom(56%y,63%y)"[DispatchPlanDetailPage/General script]
views.get("lblscannedqty").vw.setTop((int)((56d / 100 * height)));
views.get("lblscannedqty").vw.setHeight((int)((63d / 100 * height) - ((56d / 100 * height))));
//BA.debugLineNum = 70;BA.debugLine="lblScannedQty.SetLeftAndRight(30%x,100%x)"[DispatchPlanDetailPage/General script]
views.get("lblscannedqty").vw.setLeft((int)((30d / 100 * width)));
views.get("lblscannedqty").vw.setWidth((int)((100d / 100 * width) - ((30d / 100 * width))));
//BA.debugLineNum = 73;BA.debugLine="Label6.SetTopAndBottom(63%y,70%y)"[DispatchPlanDetailPage/General script]
views.get("label6").vw.setTop((int)((63d / 100 * height)));
views.get("label6").vw.setHeight((int)((70d / 100 * height) - ((63d / 100 * height))));
//BA.debugLineNum = 74;BA.debugLine="Label6.SetLeftAndRight(0%x,30%x)"[DispatchPlanDetailPage/General script]
views.get("label6").vw.setLeft((int)((0d / 100 * width)));
views.get("label6").vw.setWidth((int)((30d / 100 * width) - ((0d / 100 * width))));
//BA.debugLineNum = 78;BA.debugLine="lblUserCaptured.SetTopAndBottom(63%y,70%y)"[DispatchPlanDetailPage/General script]
views.get("lblusercaptured").vw.setTop((int)((63d / 100 * height)));
views.get("lblusercaptured").vw.setHeight((int)((70d / 100 * height) - ((63d / 100 * height))));
//BA.debugLineNum = 79;BA.debugLine="lblUserCaptured.SetLeftAndRight(30%x,100%x)"[DispatchPlanDetailPage/General script]
views.get("lblusercaptured").vw.setLeft((int)((30d / 100 * width)));
views.get("lblusercaptured").vw.setWidth((int)((100d / 100 * width) - ((30d / 100 * width))));
//BA.debugLineNum = 82;BA.debugLine="btnSubmit.SetTopAndBottom(90%y,100%y)"[DispatchPlanDetailPage/General script]
views.get("btnsubmit").vw.setTop((int)((90d / 100 * height)));
views.get("btnsubmit").vw.setHeight((int)((100d / 100 * height) - ((90d / 100 * height))));
//BA.debugLineNum = 83;BA.debugLine="btnSubmit.SetLeftAndRight(0%x,100%x)"[DispatchPlanDetailPage/General script]
views.get("btnsubmit").vw.setLeft((int)((0d / 100 * width)));
views.get("btnsubmit").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));

}
}