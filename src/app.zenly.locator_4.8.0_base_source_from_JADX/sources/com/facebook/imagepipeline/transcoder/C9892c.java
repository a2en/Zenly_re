package com.facebook.imagepipeline.transcoder;

import android.graphics.Matrix;
import com.facebook.common.internal.C9529f;
import com.facebook.imagepipeline.common.C9701e;
import com.facebook.imagepipeline.common.C9702f;
import com.facebook.imagepipeline.image.C9732e;

/* renamed from: com.facebook.imagepipeline.transcoder.c */
public class C9892c {

    /* renamed from: a */
    public static final C9529f<Integer> f25996a = C9529f.m23256a(Integer.valueOf(2), Integer.valueOf(7), Integer.valueOf(4), Integer.valueOf(5));

    /* renamed from: a */
    public static int m24713a(float f, float f2) {
        return (int) (f2 + (f * 8.0f));
    }

    /* renamed from: a */
    public static int m24715a(C9702f fVar, C9701e eVar, C9732e eVar2, boolean z) {
        if (!z || eVar == null) {
            return 8;
        }
        int b = m24719b(fVar, eVar2);
        boolean z2 = false;
        int a = f25996a.contains(Integer.valueOf(eVar2.mo26428e())) ? m24716a(fVar, eVar2) : 0;
        if (b == 90 || b == 270 || a == 5 || a == 7) {
            z2 = true;
        }
        int a2 = m24713a(m24712a(eVar, z2 ? eVar2.mo26430f() : eVar2.mo26438l(), z2 ? eVar2.mo26438l() : eVar2.mo26430f()), eVar.f25358d);
        if (a2 > 8) {
            return 8;
        }
        if (a2 < 1) {
            a2 = 1;
        }
        return a2;
    }

    /* renamed from: b */
    public static int m24719b(C9702f fVar, C9732e eVar) {
        if (!fVar.mo26273c()) {
            return 0;
        }
        int a = m24717a(eVar);
        if (fVar.mo26274d()) {
            return a;
        }
        return (a + fVar.mo26272b()) % 360;
    }

    /* renamed from: c */
    public static boolean m24721c(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: d */
    public static boolean m24722d(int i) {
        return i >= 0 && i <= 270 && i % 90 == 0;
    }

    /* renamed from: b */
    private static Matrix m24720b(int i) {
        Matrix matrix = new Matrix();
        if (i == 2) {
            matrix.setScale(-1.0f, 1.0f);
        } else if (i == 7) {
            matrix.setRotate(-90.0f);
            matrix.postScale(-1.0f, 1.0f);
        } else if (i == 4) {
            matrix.setRotate(180.0f);
            matrix.postScale(-1.0f, 1.0f);
        } else if (i != 5) {
            return null;
        } else {
            matrix.setRotate(90.0f);
            matrix.postScale(-1.0f, 1.0f);
        }
        return matrix;
    }

    /* renamed from: a */
    public static int m24716a(C9702f fVar, C9732e eVar) {
        int indexOf = f25996a.indexOf(Integer.valueOf(eVar.mo26428e()));
        if (indexOf >= 0) {
            int i = 0;
            if (!fVar.mo26274d()) {
                i = fVar.mo26272b();
            }
            int i2 = i / 90;
            C9529f<Integer> fVar2 = f25996a;
            return ((Integer) fVar2.get((indexOf + i2) % fVar2.size())).intValue();
        }
        throw new IllegalArgumentException("Only accepts inverted exif orientations");
    }

    /* renamed from: a */
    public static float m24712a(C9701e eVar, int i, int i2) {
        if (eVar == null) {
            return 1.0f;
        }
        float f = (float) i;
        float f2 = (float) i2;
        float max = Math.max(((float) eVar.f25355a) / f, ((float) eVar.f25356b) / f2);
        float f3 = f * max;
        float f4 = eVar.f25357c;
        if (f3 > f4) {
            max = f4 / f;
        }
        float f5 = f2 * max;
        float f6 = eVar.f25357c;
        if (f5 > f6) {
            max = f6 / f2;
        }
        return max;
    }

    /* renamed from: a */
    public static int m24714a(int i) {
        return Math.max(1, 8 / i);
    }

    /* renamed from: a */
    public static Matrix m24718a(C9732e eVar, C9702f fVar) {
        if (f25996a.contains(Integer.valueOf(eVar.mo26428e()))) {
            return m24720b(m24716a(fVar, eVar));
        }
        int b = m24719b(fVar, eVar);
        if (b == 0) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate((float) b);
        return matrix;
    }

    /* renamed from: a */
    private static int m24717a(C9732e eVar) {
        int i = eVar.mo26435i();
        if (i == 90 || i == 180 || i == 270) {
            return eVar.mo26435i();
        }
        return 0;
    }
}
