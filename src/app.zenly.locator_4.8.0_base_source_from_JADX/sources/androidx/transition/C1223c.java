package androidx.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.Property;

/* renamed from: androidx.transition.c */
class C1223c {
    /* renamed from: a */
    static <T> ObjectAnimator m5938a(T t, Property<T, PointF> property, Path path) {
        if (VERSION.SDK_INT >= 21) {
            return ObjectAnimator.ofObject(t, property, null, path);
        }
        return ObjectAnimator.ofFloat(t, new C1225d(property, path), new float[]{0.0f, 1.0f});
    }
}
