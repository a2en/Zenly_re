package com.theartofdev.edmodo.cropper;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: com.theartofdev.edmodo.cropper.f */
final class C11939f {

    /* renamed from: a */
    private final float f31106a;

    /* renamed from: b */
    private final float f31107b;

    /* renamed from: c */
    private final float f31108c;

    /* renamed from: d */
    private final float f31109d;

    /* renamed from: e */
    private final C11941b f31110e;

    /* renamed from: f */
    private final PointF f31111f = new PointF();

    /* renamed from: com.theartofdev.edmodo.cropper.f$a */
    static /* synthetic */ class C11940a {

        /* renamed from: a */
        static final /* synthetic */ int[] f31112a = new int[C11941b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.theartofdev.edmodo.cropper.f$b[] r0 = com.theartofdev.edmodo.cropper.C11939f.C11941b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31112a = r0
                int[] r0 = f31112a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.theartofdev.edmodo.cropper.f$b r1 = com.theartofdev.edmodo.cropper.C11939f.C11941b.TOP_LEFT     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f31112a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.theartofdev.edmodo.cropper.f$b r1 = com.theartofdev.edmodo.cropper.C11939f.C11941b.TOP_RIGHT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f31112a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.theartofdev.edmodo.cropper.f$b r1 = com.theartofdev.edmodo.cropper.C11939f.C11941b.BOTTOM_LEFT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f31112a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.theartofdev.edmodo.cropper.f$b r1 = com.theartofdev.edmodo.cropper.C11939f.C11941b.BOTTOM_RIGHT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f31112a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.theartofdev.edmodo.cropper.f$b r1 = com.theartofdev.edmodo.cropper.C11939f.C11941b.LEFT     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f31112a     // Catch:{ NoSuchFieldError -> 0x004b }
                com.theartofdev.edmodo.cropper.f$b r1 = com.theartofdev.edmodo.cropper.C11939f.C11941b.TOP     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f31112a     // Catch:{ NoSuchFieldError -> 0x0056 }
                com.theartofdev.edmodo.cropper.f$b r1 = com.theartofdev.edmodo.cropper.C11939f.C11941b.RIGHT     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                int[] r0 = f31112a     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.theartofdev.edmodo.cropper.f$b r1 = com.theartofdev.edmodo.cropper.C11939f.C11941b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f31112a     // Catch:{ NoSuchFieldError -> 0x006e }
                com.theartofdev.edmodo.cropper.f$b r1 = com.theartofdev.edmodo.cropper.C11939f.C11941b.CENTER     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.C11939f.C11940a.<clinit>():void");
        }
    }

    /* renamed from: com.theartofdev.edmodo.cropper.f$b */
    public enum C11941b {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        CENTER
    }

    static {
        new Matrix();
    }

    public C11939f(C11941b bVar, C11938e eVar, float f, float f2) {
        this.f31110e = bVar;
        this.f31106a = eVar.mo35445d();
        this.f31107b = eVar.mo35444c();
        this.f31108c = eVar.mo35443b();
        this.f31109d = eVar.mo35437a();
        m31412a(eVar.mo35446e(), f, f2);
    }

    /* renamed from: a */
    private static float m31410a(float f, float f2, float f3, float f4) {
        return (f3 - f) / (f4 - f2);
    }

    /* renamed from: b */
    private void m31419b(RectF rectF, float f, float f2, RectF rectF2, int i, int i2, float f3) {
        switch (C11940a.f31112a[this.f31110e.ordinal()]) {
            case 1:
                RectF rectF3 = rectF;
                RectF rectF4 = rectF2;
                float f4 = f3;
                m31420b(rectF3, f2, rectF4, f4, 0.0f, false, false);
                m31415a(rectF3, f, rectF4, f4, 0.0f, false, false);
                return;
            case 2:
                RectF rectF5 = rectF;
                RectF rectF6 = rectF2;
                m31420b(rectF5, f2, rectF6, f3, 0.0f, false, false);
                m31421b(rectF5, f, rectF6, i, f3, 0.0f, false, false);
                return;
            case 3:
                RectF rectF7 = rectF;
                RectF rectF8 = rectF2;
                m31416a(rectF7, f2, rectF8, i2, f3, 0.0f, false, false);
                m31415a(rectF7, f, rectF8, f3, 0.0f, false, false);
                return;
            case 4:
                RectF rectF9 = rectF;
                RectF rectF10 = rectF2;
                float f5 = f3;
                m31416a(rectF9, f2, rectF10, i2, f5, 0.0f, false, false);
                m31421b(rectF9, f, rectF10, i, f5, 0.0f, false, false);
                return;
            case 5:
                m31415a(rectF, f, rectF2, f3, 0.0f, false, false);
                return;
            case 6:
                m31420b(rectF, f2, rectF2, f3, 0.0f, false, false);
                return;
            case 7:
                m31421b(rectF, f, rectF2, i, f3, 0.0f, false, false);
                return;
            case 8:
                m31416a(rectF, f2, rectF2, i2, f3, 0.0f, false, false);
                return;
            default:
                return;
        }
    }

    /* renamed from: c */
    private void m31424c(RectF rectF, RectF rectF2, float f) {
        float f2 = rectF.left;
        float f3 = rectF2.left;
        if (f2 < f3 + f) {
            rectF.offset(f3 - f2, 0.0f);
        }
        float f4 = rectF.top;
        float f5 = rectF2.top;
        if (f4 < f5 + f) {
            rectF.offset(0.0f, f5 - f4);
        }
        float f6 = rectF.right;
        float f7 = rectF2.right;
        if (f6 > f7 - f) {
            rectF.offset(f7 - f6, 0.0f);
        }
        float f8 = rectF.bottom;
        float f9 = rectF2.bottom;
        if (f8 > f9 - f) {
            rectF.offset(0.0f, f9 - f8);
        }
    }

    /* renamed from: d */
    private void m31425d(RectF rectF, float f) {
        rectF.top = rectF.bottom - (rectF.width() / f);
    }

    /* renamed from: a */
    public void mo35450a(RectF rectF, float f, float f2, RectF rectF2, int i, int i2, float f3, boolean z, float f4) {
        PointF pointF = this.f31111f;
        float f5 = f + pointF.x;
        float f6 = f2 + pointF.y;
        if (this.f31110e == C11941b.CENTER) {
            m31413a(rectF, f5, f6, rectF2, i, i2, f3);
        } else if (z) {
            m31414a(rectF, f5, f6, rectF2, i, i2, f3, f4);
        } else {
            m31419b(rectF, f5, f6, rectF2, i, i2, f3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        r3 = r3 - r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        r4 = r2.f31111f;
        r4.x = r1;
        r4.y = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r1 = r3 - r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m31412a(android.graphics.RectF r3, float r4, float r5) {
        /*
            r2 = this;
            int[] r0 = com.theartofdev.edmodo.cropper.C11939f.C11940a.f31112a
            com.theartofdev.edmodo.cropper.f$b r1 = r2.f31110e
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 0
            switch(r0) {
                case 1: goto L_0x003e;
                case 2: goto L_0x0037;
                case 3: goto L_0x0030;
                case 4: goto L_0x0029;
                case 5: goto L_0x0024;
                case 6: goto L_0x0021;
                case 7: goto L_0x001e;
                case 8: goto L_0x001b;
                case 9: goto L_0x0010;
                default: goto L_0x000e;
            }
        L_0x000e:
            r3 = 0
            goto L_0x0045
        L_0x0010:
            float r0 = r3.centerX()
            float r1 = r0 - r4
            float r3 = r3.centerY()
            goto L_0x0044
        L_0x001b:
            float r3 = r3.bottom
            goto L_0x0044
        L_0x001e:
            float r3 = r3.right
            goto L_0x0026
        L_0x0021:
            float r3 = r3.top
            goto L_0x0044
        L_0x0024:
            float r3 = r3.left
        L_0x0026:
            float r3 = r3 - r4
            r1 = r3
            goto L_0x000e
        L_0x0029:
            float r0 = r3.right
            float r1 = r0 - r4
            float r3 = r3.bottom
            goto L_0x0044
        L_0x0030:
            float r0 = r3.left
            float r1 = r0 - r4
            float r3 = r3.bottom
            goto L_0x0044
        L_0x0037:
            float r0 = r3.right
            float r1 = r0 - r4
            float r3 = r3.top
            goto L_0x0044
        L_0x003e:
            float r0 = r3.left
            float r1 = r0 - r4
            float r3 = r3.top
        L_0x0044:
            float r3 = r3 - r5
        L_0x0045:
            android.graphics.PointF r4 = r2.f31111f
            r4.x = r1
            r4.y = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.C11939f.m31412a(android.graphics.RectF, float, float):void");
    }

    /* renamed from: c */
    private void m31423c(RectF rectF, float f) {
        rectF.right = rectF.left + (rectF.height() * f);
    }

    /* renamed from: b */
    private void m31421b(RectF rectF, float f, RectF rectF2, int i, float f2, float f3, boolean z, boolean z2) {
        float f4 = (float) i;
        if (f > f4) {
            f = ((f - f4) / 1.05f) + f4;
            this.f31111f.x -= (f - f4) / 1.1f;
        }
        float f5 = rectF2.right;
        if (f > f5) {
            this.f31111f.x -= (f - f5) / 2.0f;
        }
        float f6 = rectF2.right;
        if (f6 - f < f2) {
            f = f6;
        }
        float f7 = rectF.left;
        float f8 = f - f7;
        float f9 = this.f31106a;
        if (f8 < f9) {
            f = f7 + f9;
        }
        float f10 = rectF.left;
        float f11 = f - f10;
        float f12 = this.f31108c;
        if (f11 > f12) {
            f = f10 + f12;
        }
        float f13 = rectF2.right;
        if (f13 - f < f2) {
            f = f13;
        }
        if (f3 > 0.0f) {
            float f14 = rectF.left;
            float f15 = (f - f14) / f3;
            float f16 = this.f31107b;
            if (f15 < f16) {
                f = Math.min(rectF2.right, f14 + (f16 * f3));
                f15 = (f - rectF.left) / f3;
            }
            float f17 = this.f31109d;
            if (f15 > f17) {
                f = Math.min(rectF2.right, rectF.left + (f17 * f3));
                f15 = (f - rectF.left) / f3;
            }
            if (!z || !z2) {
                if (z) {
                    float f18 = rectF.bottom;
                    float f19 = f18 - f15;
                    float f20 = rectF2.top;
                    if (f19 < f20) {
                        f = Math.min(rectF2.right, rectF.left + ((f18 - f20) * f3));
                        f15 = (f - rectF.left) / f3;
                    }
                }
                if (z2) {
                    float f21 = rectF.top;
                    float f22 = f15 + f21;
                    float f23 = rectF2.bottom;
                    if (f22 > f23) {
                        f = Math.min(f, Math.min(rectF2.right, rectF.left + ((f23 - f21) * f3)));
                    }
                }
            } else {
                f = Math.min(f, Math.min(rectF2.right, rectF.left + (rectF2.height() * f3)));
            }
        }
        rectF.right = f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        if ((r0 + r9) <= r10.bottom) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        if ((r1 + r8) <= r10.right) goto L_0x0039;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m31413a(android.graphics.RectF r7, float r8, float r9, android.graphics.RectF r10, int r11, int r12, float r13) {
        /*
            r6 = this;
            float r0 = r7.centerX()
            float r8 = r8 - r0
            float r0 = r7.centerY()
            float r9 = r9 - r0
            float r0 = r7.left
            float r1 = r0 + r8
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = 1065772646(0x3f866666, float:1.05)
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 < 0) goto L_0x002f
            float r1 = r7.right
            float r5 = r1 + r8
            float r11 = (float) r11
            int r11 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r11 > 0) goto L_0x002f
            float r0 = r0 + r8
            float r11 = r10.left
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 < 0) goto L_0x002f
            float r1 = r1 + r8
            float r11 = r10.right
            int r11 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x0039
        L_0x002f:
            float r8 = r8 / r3
            android.graphics.PointF r11 = r6.f31111f
            float r0 = r11.x
            float r1 = r8 / r2
            float r0 = r0 - r1
            r11.x = r0
        L_0x0039:
            float r11 = r7.top
            float r0 = r11 + r9
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0058
            float r0 = r7.bottom
            float r1 = r0 + r9
            float r12 = (float) r12
            int r12 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r12 > 0) goto L_0x0058
            float r11 = r11 + r9
            float r12 = r10.top
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 < 0) goto L_0x0058
            float r0 = r0 + r9
            float r11 = r10.bottom
            int r11 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x0062
        L_0x0058:
            float r9 = r9 / r3
            android.graphics.PointF r11 = r6.f31111f
            float r12 = r11.y
            float r0 = r9 / r2
            float r12 = r12 - r0
            r11.y = r12
        L_0x0062:
            r7.offset(r8, r9)
            r6.m31424c(r7, r10, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.C11939f.m31413a(android.graphics.RectF, float, float, android.graphics.RectF, int, int, float):void");
    }

    /* renamed from: a */
    private void m31414a(RectF rectF, float f, float f2, RectF rectF2, int i, int i2, float f3, float f4) {
        RectF rectF3 = rectF;
        float f5 = f;
        float f6 = f2;
        RectF rectF4 = rectF2;
        float f7 = f4;
        switch (C11940a.f31112a[this.f31110e.ordinal()]) {
            case 1:
                if (m31410a(f, f6, rectF3.right, rectF3.bottom) < f7) {
                    m31420b(rectF, f2, rectF2, f3, f4, true, false);
                    m31418b(rectF, f7);
                    return;
                }
                m31415a(rectF, f, rectF2, f3, f4, true, false);
                m31425d(rectF, f7);
                return;
            case 2:
                if (m31410a(rectF3.left, f6, f, rectF3.bottom) < f7) {
                    m31420b(rectF, f2, rectF2, f3, f4, false, true);
                    m31423c(rectF, f7);
                    return;
                }
                m31421b(rectF, f, rectF2, i, f3, f4, true, false);
                m31425d(rectF, f7);
                return;
            case 3:
                if (m31410a(f, rectF3.top, rectF3.right, f6) < f7) {
                    m31416a(rectF, f2, rectF2, i2, f3, f4, true, false);
                    m31418b(rectF, f7);
                    return;
                }
                m31415a(rectF, f, rectF2, f3, f4, false, true);
                m31411a(rectF, f7);
                return;
            case 4:
                if (m31410a(rectF3.left, rectF3.top, f, f6) < f7) {
                    m31416a(rectF, f2, rectF2, i2, f3, f4, false, true);
                    m31423c(rectF, f7);
                    return;
                }
                m31421b(rectF, f, rectF2, i, f3, f4, false, true);
                m31411a(rectF, f7);
                return;
            case 5:
                m31415a(rectF, f, rectF2, f3, f4, true, true);
                m31422b(rectF, rectF4, f7);
                return;
            case 6:
                m31420b(rectF, f2, rectF2, f3, f4, true, true);
                m31417a(rectF, rectF4, f7);
                return;
            case 7:
                m31421b(rectF, f, rectF2, i, f3, f4, true, true);
                m31422b(rectF, rectF4, f7);
                return;
            case 8:
                m31416a(rectF, f2, rectF2, i2, f3, f4, true, true);
                m31417a(rectF, rectF4, f7);
                return;
            default:
                return;
        }
    }

    /* renamed from: b */
    private void m31420b(RectF rectF, float f, RectF rectF2, float f2, float f3, boolean z, boolean z2) {
        if (f < 0.0f) {
            f /= 1.05f;
            this.f31111f.y -= f / 1.1f;
        }
        float f4 = rectF2.top;
        if (f < f4) {
            this.f31111f.y -= (f - f4) / 2.0f;
        }
        float f5 = rectF2.top;
        if (f - f5 < f2) {
            f = f5;
        }
        float f6 = rectF.bottom;
        float f7 = f6 - f;
        float f8 = this.f31107b;
        if (f7 < f8) {
            f = f6 - f8;
        }
        float f9 = rectF.bottom;
        float f10 = f9 - f;
        float f11 = this.f31109d;
        if (f10 > f11) {
            f = f9 - f11;
        }
        float f12 = rectF2.top;
        if (f - f12 < f2) {
            f = f12;
        }
        if (f3 > 0.0f) {
            float f13 = rectF.bottom;
            float f14 = (f13 - f) * f3;
            float f15 = this.f31106a;
            if (f14 < f15) {
                f = Math.max(rectF2.top, f13 - (f15 / f3));
                f14 = (rectF.bottom - f) * f3;
            }
            float f16 = this.f31108c;
            if (f14 > f16) {
                f = Math.max(rectF2.top, rectF.bottom - (f16 / f3));
                f14 = (rectF.bottom - f) * f3;
            }
            if (!z || !z2) {
                if (z) {
                    float f17 = rectF.right;
                    float f18 = f17 - f14;
                    float f19 = rectF2.left;
                    if (f18 < f19) {
                        f = Math.max(rectF2.top, rectF.bottom - ((f17 - f19) / f3));
                        f14 = (rectF.bottom - f) * f3;
                    }
                }
                if (z2) {
                    float f20 = rectF.left;
                    float f21 = f14 + f20;
                    float f22 = rectF2.right;
                    if (f21 > f22) {
                        f = Math.max(f, Math.max(rectF2.top, rectF.bottom - ((f22 - f20) / f3)));
                    }
                }
            } else {
                f = Math.max(f, Math.max(rectF2.top, rectF.bottom - (rectF2.width() / f3)));
            }
        }
        rectF.top = f;
    }

    /* renamed from: a */
    private void m31415a(RectF rectF, float f, RectF rectF2, float f2, float f3, boolean z, boolean z2) {
        if (f < 0.0f) {
            f /= 1.05f;
            this.f31111f.x -= f / 1.1f;
        }
        float f4 = rectF2.left;
        if (f < f4) {
            this.f31111f.x -= (f - f4) / 2.0f;
        }
        float f5 = rectF2.left;
        if (f - f5 < f2) {
            f = f5;
        }
        float f6 = rectF.right;
        float f7 = f6 - f;
        float f8 = this.f31106a;
        if (f7 < f8) {
            f = f6 - f8;
        }
        float f9 = rectF.right;
        float f10 = f9 - f;
        float f11 = this.f31108c;
        if (f10 > f11) {
            f = f9 - f11;
        }
        float f12 = rectF2.left;
        if (f - f12 < f2) {
            f = f12;
        }
        if (f3 > 0.0f) {
            float f13 = rectF.right;
            float f14 = (f13 - f) / f3;
            float f15 = this.f31107b;
            if (f14 < f15) {
                f = Math.max(rectF2.left, f13 - (f15 * f3));
                f14 = (rectF.right - f) / f3;
            }
            float f16 = this.f31109d;
            if (f14 > f16) {
                f = Math.max(rectF2.left, rectF.right - (f16 * f3));
                f14 = (rectF.right - f) / f3;
            }
            if (!z || !z2) {
                if (z) {
                    float f17 = rectF.bottom;
                    float f18 = f17 - f14;
                    float f19 = rectF2.top;
                    if (f18 < f19) {
                        f = Math.max(rectF2.left, rectF.right - ((f17 - f19) * f3));
                        f14 = (rectF.right - f) / f3;
                    }
                }
                if (z2) {
                    float f20 = rectF.top;
                    float f21 = f14 + f20;
                    float f22 = rectF2.bottom;
                    if (f21 > f22) {
                        f = Math.max(f, Math.max(rectF2.left, rectF.right - ((f22 - f20) * f3)));
                    }
                }
            } else {
                f = Math.max(f, Math.max(rectF2.left, rectF.right - (rectF2.height() * f3)));
            }
        }
        rectF.left = f;
    }

    /* renamed from: b */
    private void m31418b(RectF rectF, float f) {
        rectF.left = rectF.right - (rectF.height() * f);
    }

    /* renamed from: b */
    private void m31422b(RectF rectF, RectF rectF2, float f) {
        rectF.inset(0.0f, (rectF.height() - (rectF.width() / f)) / 2.0f);
        float f2 = rectF.top;
        float f3 = rectF2.top;
        if (f2 < f3) {
            rectF.offset(0.0f, f3 - f2);
        }
        float f4 = rectF.bottom;
        float f5 = rectF2.bottom;
        if (f4 > f5) {
            rectF.offset(0.0f, f5 - f4);
        }
    }

    /* renamed from: a */
    private void m31416a(RectF rectF, float f, RectF rectF2, int i, float f2, float f3, boolean z, boolean z2) {
        float f4 = (float) i;
        if (f > f4) {
            f = ((f - f4) / 1.05f) + f4;
            this.f31111f.y -= (f - f4) / 1.1f;
        }
        float f5 = rectF2.bottom;
        if (f > f5) {
            this.f31111f.y -= (f - f5) / 2.0f;
        }
        float f6 = rectF2.bottom;
        if (f6 - f < f2) {
            f = f6;
        }
        float f7 = rectF.top;
        float f8 = f - f7;
        float f9 = this.f31107b;
        if (f8 < f9) {
            f = f7 + f9;
        }
        float f10 = rectF.top;
        float f11 = f - f10;
        float f12 = this.f31109d;
        if (f11 > f12) {
            f = f10 + f12;
        }
        float f13 = rectF2.bottom;
        if (f13 - f < f2) {
            f = f13;
        }
        if (f3 > 0.0f) {
            float f14 = rectF.top;
            float f15 = (f - f14) * f3;
            float f16 = this.f31106a;
            if (f15 < f16) {
                f = Math.min(rectF2.bottom, f14 + (f16 / f3));
                f15 = (f - rectF.top) * f3;
            }
            float f17 = this.f31108c;
            if (f15 > f17) {
                f = Math.min(rectF2.bottom, rectF.top + (f17 / f3));
                f15 = (f - rectF.top) * f3;
            }
            if (!z || !z2) {
                if (z) {
                    float f18 = rectF.right;
                    float f19 = f18 - f15;
                    float f20 = rectF2.left;
                    if (f19 < f20) {
                        f = Math.min(rectF2.bottom, rectF.top + ((f18 - f20) / f3));
                        f15 = (f - rectF.top) * f3;
                    }
                }
                if (z2) {
                    float f21 = rectF.left;
                    float f22 = f15 + f21;
                    float f23 = rectF2.right;
                    if (f22 > f23) {
                        f = Math.min(f, Math.min(rectF2.bottom, rectF.top + ((f23 - f21) / f3)));
                    }
                }
            } else {
                f = Math.min(f, Math.min(rectF2.bottom, rectF.top + (rectF2.width() / f3)));
            }
        }
        rectF.bottom = f;
    }

    /* renamed from: a */
    private void m31411a(RectF rectF, float f) {
        rectF.bottom = rectF.top + (rectF.width() / f);
    }

    /* renamed from: a */
    private void m31417a(RectF rectF, RectF rectF2, float f) {
        rectF.inset((rectF.width() - (rectF.height() * f)) / 2.0f, 0.0f);
        float f2 = rectF.left;
        float f3 = rectF2.left;
        if (f2 < f3) {
            rectF.offset(f3 - f2, 0.0f);
        }
        float f4 = rectF.right;
        float f5 = rectF2.right;
        if (f4 > f5) {
            rectF.offset(f5 - f4, 0.0f);
        }
    }
}
