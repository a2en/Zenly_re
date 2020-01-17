package p333g.p357d.p358a.p361b.p362l;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: g.d.a.b.l.g */
public class C12083g implements TypeEvaluator<Matrix> {

    /* renamed from: a */
    private final float[] f31470a = new float[9];

    /* renamed from: b */
    private final float[] f31471b = new float[9];

    /* renamed from: c */
    private final Matrix f31472c = new Matrix();

    /* renamed from: a */
    public Matrix evaluate(float f, Matrix matrix, Matrix matrix2) {
        matrix.getValues(this.f31470a);
        matrix2.getValues(this.f31471b);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.f31471b;
            float f2 = fArr[i];
            float[] fArr2 = this.f31470a;
            fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
        }
        this.f31472c.setValues(this.f31471b);
        return this.f31472c;
    }
}
