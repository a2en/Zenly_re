package app.zenly.locator.core.widget;

import com.crashlytics.android.C9252a;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.widget.k */
public final class C3278k implements IViewPagerChildDrawingOrderHandler {
    public int getChildDrawingOrderFailed(ViewPager viewPager, int i, int i2, Throwable th) {
        C12932j.m33818b(viewPager, "viewPager");
        C12932j.m33818b(th, "throwable");
        StringBuilder sb = new StringBuilder();
        sb.append("\n            ViewPager.getChildDrawingOrder failed\n            ViewPager.getChildCount() = ");
        sb.append(viewPager.getChildCount());
        sb.append("\n            childCount = ");
        sb.append(i);
        sb.append("\n            i = ");
        sb.append(i2);
        sb.append("\n            isLaidOut = ");
        sb.append(viewPager.isLaidOut());
        sb.append("\n            isPopulated\n            hasPageTransformer = ");
        sb.append(viewPager.getPageTransformer() != null);
        sb.append("\n            ");
        C9252a.m22273a(C13019j.m33989c(sb.toString()));
        C9252a.m22276a(th);
        return i2;
    }

    public int getChildDrawingOrderSucceed(ViewPager viewPager, int i, int i2, int i3) {
        C12932j.m33818b(viewPager, "viewPager");
        return i3;
    }
}
