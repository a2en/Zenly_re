package app.zenly.locator.core.util;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: app.zenly.locator.core.util.e0 */
public class C3200e0 {
    /* renamed from: a */
    public static float m10181a(Context context, float f) {
        return f * context.getResources().getDisplayMetrics().density;
    }

    /* renamed from: b */
    private static int m10186b(Context context, int i) {
        return (int) (((float) i) * (context != null ? context.getResources() : Resources.getSystem()).getDisplayMetrics().density);
    }

    /* renamed from: a */
    public static int m10183a(Context context, int i) {
        return m10186b(context, i);
    }

    @Deprecated
    /* renamed from: a */
    public static int m10182a(int i) {
        return m10186b(null, i);
    }

    /* renamed from: a */
    public static boolean m10185a(View view, MotionEvent motionEvent) {
        boolean z = false;
        if (view.getVisibility() == 8) {
            return false;
        }
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int width = view.getWidth();
        int height = view.getHeight();
        if (rawX >= i && rawX <= i + width && rawY >= i2 && rawY <= i2 + height) {
            z = true;
        }
        return z;
    }

    /* renamed from: a */
    public static void m10184a(View[] viewArr, int i) {
        for (View visibility : viewArr) {
            visibility.setVisibility(i);
        }
    }
}
