package app.zenly.android.base.view;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.android.base.view.b */
public final class C1311b {

    /* renamed from: a */
    private static final int[] f4896a = new int[2];

    /* renamed from: b */
    private static final int[] f4897b = new int[2];

    /* renamed from: a */
    public static final void m6278a(View view) {
        C12932j.m33818b(view, "$this$removeFromParent");
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    /* renamed from: b */
    public static final void m6284b(View view, RectF rectF) {
        C12932j.m33818b(view, "$this$offsetRectToWindowCoords");
        C12932j.m33818b(rectF, "rect");
        view.getLocationInWindow(f4896a);
        float f = rectF.left;
        int[] iArr = f4896a;
        rectF.left = f + ((float) iArr[0]);
        rectF.right += (float) iArr[0];
        rectF.top += (float) iArr[1];
        rectF.bottom += (float) iArr[1];
    }

    /* renamed from: a */
    public static final void m6282a(View view, PointF pointF) {
        C12932j.m33818b(view, "$this$offsetPointInWindowToMyCoords");
        C12932j.m33818b(pointF, "pointInWindow");
        view.getLocationInWindow(f4896a);
        float f = pointF.x;
        int[] iArr = f4896a;
        pointF.x = f - ((float) iArr[0]);
        pointF.y -= (float) iArr[1];
    }

    /* renamed from: a */
    public static final void m6283a(View view, RectF rectF) {
        C12932j.m33818b(view, "$this$offsetRectInWindowToMyCoords");
        C12932j.m33818b(rectF, "rectInWindow");
        view.getLocationInWindow(f4896a);
        float f = rectF.left;
        int[] iArr = f4896a;
        rectF.left = f - ((float) iArr[0]);
        rectF.right -= (float) iArr[0];
        rectF.top -= (float) iArr[1];
        rectF.bottom -= (float) iArr[1];
    }

    /* renamed from: a */
    public static final void m6280a(View view, Point point) {
        C12932j.m33818b(view, "$this$offsetPointToWindowCoords");
        C12932j.m33818b(point, "point");
        view.getLocationInWindow(f4896a);
        int i = point.x;
        int[] iArr = f4896a;
        point.x = i + iArr[0];
        point.y += iArr[1];
    }

    /* renamed from: a */
    public static final void m6281a(View view, Point point, View view2) {
        C12932j.m33818b(view, "$this$offsetPointToViewCoords");
        C12932j.m33818b(point, "point");
        C12932j.m33818b(view2, "toView");
        if (view.getWindowToken() == view2.getWindowToken()) {
            view.getLocationInWindow(f4896a);
            view2.getLocationInWindow(f4897b);
            int i = point.x;
            int[] iArr = f4896a;
            int i2 = iArr[0];
            int[] iArr2 = f4897b;
            point.x = i + (i2 - iArr2[0]);
            point.y += iArr[1] - iArr2[1];
            return;
        }
        throw new IllegalArgumentException("Both toView and the receiver must belong to the same Window.");
    }

    /* renamed from: a */
    public static final void m6279a(View view, int i) {
        C12932j.m33818b(view, "$this$setPaddingRelative");
        view.setPaddingRelative(i, i, i, i);
    }
}
