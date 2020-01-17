package app.zenly.locator.p143s.p151o;

/* renamed from: app.zenly.locator.s.o.b */
public final class C5466b {

    /* renamed from: a */
    public static final C5466b f14065a = new C5466b();

    private C5466b() {
    }

    /* renamed from: a */
    public final int mo13085a(int i, int i2, float f) {
        float f2 = ((float) ((i >> 24) & 255)) / 255.0f;
        float f3 = ((float) ((i >> 8) & 255)) / 255.0f;
        float f4 = ((float) ((i2 >> 24) & 255)) / 255.0f;
        float f5 = ((float) ((i2 >> 16) & 255)) / 255.0f;
        float f6 = ((float) ((i2 >> 8) & 255)) / 255.0f;
        float pow = (float) Math.pow((double) (((float) ((i >> 16) & 255)) / 255.0f), 2.2d);
        float pow2 = (float) Math.pow((double) f3, 2.2d);
        float pow3 = (float) Math.pow((double) (((float) (i & 255)) / 255.0f), 2.2d);
        float pow4 = pow3 + (f * (((float) Math.pow((double) (((float) (i2 & 255)) / 255.0f), 2.2d)) - pow3));
        float f7 = (f2 + ((f4 - f2) * f)) * 255.0f;
        int round = Math.round(f7) << 24;
        return Math.round(((float) Math.pow((double) pow4, 0.45454545454545453d)) * 255.0f) | (Math.round(((float) Math.pow((double) (pow + ((((float) Math.pow((double) f5, 2.2d)) - pow) * f)), 0.45454545454545453d)) * 255.0f) << 16) | round | (Math.round(((float) Math.pow((double) (pow2 + ((((float) Math.pow((double) f6, 2.2d)) - pow2) * f)), 0.45454545454545453d)) * 255.0f) << 8);
    }
}
