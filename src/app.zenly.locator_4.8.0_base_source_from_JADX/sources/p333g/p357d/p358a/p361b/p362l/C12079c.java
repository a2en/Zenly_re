package p333g.p357d.p358a.p361b.p362l;

import android.animation.TypeEvaluator;

/* renamed from: g.d.a.b.l.c */
public class C12079c implements TypeEvaluator<Integer> {

    /* renamed from: a */
    private static final C12079c f31465a = new C12079c();

    /* renamed from: a */
    public static C12079c m31874a() {
        return f31465a;
    }

    /* renamed from: a */
    public Integer evaluate(float f, Integer num, Integer num2) {
        int intValue = num.intValue();
        float f2 = ((float) ((intValue >> 24) & 255)) / 255.0f;
        float f3 = ((float) ((intValue >> 16) & 255)) / 255.0f;
        float f4 = ((float) ((intValue >> 8) & 255)) / 255.0f;
        float f5 = ((float) (intValue & 255)) / 255.0f;
        int intValue2 = num2.intValue();
        float f6 = ((float) ((intValue2 >> 24) & 255)) / 255.0f;
        float f7 = ((float) ((intValue2 >> 16) & 255)) / 255.0f;
        float f8 = ((float) ((intValue2 >> 8) & 255)) / 255.0f;
        float pow = (float) Math.pow((double) f3, 2.2d);
        float pow2 = (float) Math.pow((double) f4, 2.2d);
        float pow3 = (float) Math.pow((double) f5, 2.2d);
        float pow4 = pow2 + ((((float) Math.pow((double) f8, 2.2d)) - pow2) * f);
        float pow5 = pow3 + (f * (((float) Math.pow((double) (((float) (intValue2 & 255)) / 255.0f), 2.2d)) - pow3));
        float f9 = (f2 + ((f6 - f2) * f)) * 255.0f;
        return Integer.valueOf((Math.round(((float) Math.pow((double) (pow + ((((float) Math.pow((double) f7, 2.2d)) - pow) * f)), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(f9) << 24) | (Math.round(((float) Math.pow((double) pow4, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow((double) pow5, 0.45454545454545453d)) * 255.0f));
    }
}
