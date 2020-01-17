package com.mapbox.android.gestures;

/* renamed from: com.mapbox.android.gestures.f */
class C11293f {
    C11293f() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo32823a(int i, int i2, int i3) {
        long a = m29084a(i2, i3);
        long j = (long) i;
        if (j == a) {
            return false;
        }
        while (a != 0) {
            if (j == (255 & a)) {
                return false;
            }
            a >>= 8;
        }
        return true;
    }

    /* renamed from: a */
    private long m29084a(int i, int i2) {
        long j;
        if (i2 == 0) {
            j = 0;
        } else if (Math.abs(i - i2) > 1) {
            return 255;
        } else {
            if (i > i2) {
                j = 5;
            } else if (i < i2) {
                return 255;
            } else {
                j = ((i == 1 ? 1 : 6) << 8) + 2;
            }
        }
        return j;
    }
}
