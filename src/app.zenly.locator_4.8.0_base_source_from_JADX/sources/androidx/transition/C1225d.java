package androidx.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: androidx.transition.d */
class C1225d<T> extends Property<T, Float> {

    /* renamed from: a */
    private final Property<T, PointF> f4617a;

    /* renamed from: b */
    private final PathMeasure f4618b;

    /* renamed from: c */
    private final float f4619c;

    /* renamed from: d */
    private final float[] f4620d = new float[2];

    /* renamed from: e */
    private final PointF f4621e = new PointF();

    /* renamed from: f */
    private float f4622f;

    C1225d(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f4617a = property;
        this.f4618b = new PathMeasure(path, false);
        this.f4619c = this.f4618b.getLength();
    }

    /* renamed from: a */
    public void set(T t, Float f) {
        this.f4622f = f.floatValue();
        this.f4618b.getPosTan(this.f4619c * f.floatValue(), this.f4620d, null);
        PointF pointF = this.f4621e;
        float[] fArr = this.f4620d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.f4617a.set(t, pointF);
    }

    public Float get(T t) {
        return Float.valueOf(this.f4622f);
    }
}
