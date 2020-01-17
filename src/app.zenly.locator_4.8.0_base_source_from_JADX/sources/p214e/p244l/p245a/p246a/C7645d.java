package p214e.p244l.p245a.p246a;

import android.view.animation.Interpolator;

/* renamed from: e.l.a.a.d */
abstract class C7645d implements Interpolator {

    /* renamed from: a */
    private final float[] f19269a;

    /* renamed from: b */
    private final float f19270b = (1.0f / ((float) (this.f19269a.length - 1)));

    protected C7645d(float[] fArr) {
        this.f19269a = fArr;
    }

    public float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f19269a;
        int min = Math.min((int) (((float) (fArr.length - 1)) * f), fArr.length - 2);
        float f2 = (float) min;
        float f3 = this.f19270b;
        float f4 = (f - (f2 * f3)) / f3;
        float[] fArr2 = this.f19269a;
        return fArr2[min] + (f4 * (fArr2[min + 1] - fArr2[min]));
    }
}
