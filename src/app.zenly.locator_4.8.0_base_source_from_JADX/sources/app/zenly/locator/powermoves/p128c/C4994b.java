package app.zenly.locator.powermoves.p128c;

import android.graphics.Color;

/* renamed from: app.zenly.locator.powermoves.c.b */
public final class C4994b {

    /* renamed from: a */
    public static final C4994b f13023a = new C4994b();

    private C4994b() {
    }

    /* renamed from: a */
    public final int mo12237a(int i, int i2, float f) {
        if (f >= 0.0f && f <= 1.0f) {
            int alpha = Color.alpha(i);
            int red = Color.red(i);
            int green = Color.green(i);
            int blue = Color.blue(i);
            return Color.argb((int) ((((float) (Color.alpha(i2) - alpha)) * f) + ((float) alpha)), (int) ((((float) (Color.red(i2) - red)) * f) + ((float) red)), (int) ((((float) (Color.green(i2) - green)) * f) + ((float) green)), (int) ((((float) (Color.blue(i2) - blue)) * f) + ((float) blue)));
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
