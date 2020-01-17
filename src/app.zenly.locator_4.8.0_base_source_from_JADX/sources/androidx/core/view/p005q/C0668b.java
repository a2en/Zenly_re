package androidx.core.view.p005q;

import android.os.Build.VERSION;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* renamed from: androidx.core.view.q.b */
public final class C0668b {
    /* renamed from: a */
    public static Interpolator m3090a(float f, float f2, float f3, float f4) {
        if (VERSION.SDK_INT >= 21) {
            return new PathInterpolator(f, f2, f3, f4);
        }
        return new C0667a(f, f2, f3, f4);
    }
}
