package app.zenly.locator.core.widget;

public interface IViewPagerChildDrawingOrderHandler {
    int getChildDrawingOrderFailed(ViewPager viewPager, int i, int i2, Throwable th);

    int getChildDrawingOrderSucceed(ViewPager viewPager, int i, int i2, int i3);
}
