package androidx.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build.VERSION;
import android.util.Property;

/* renamed from: androidx.transition.e */
class C1227e {
    /* renamed from: a */
    static PropertyValuesHolder m5953a(Property<?, PointF> property, Path path) {
        if (VERSION.SDK_INT >= 21) {
            return PropertyValuesHolder.ofObject(property, null, path);
        }
        return PropertyValuesHolder.ofFloat(new C1225d(property, path), new float[]{0.0f, 1.0f});
    }
}
