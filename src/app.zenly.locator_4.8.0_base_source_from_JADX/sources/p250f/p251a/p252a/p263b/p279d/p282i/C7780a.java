package p250f.p251a.p252a.p263b.p279d.p282i;

import android.graphics.Path;
import android.graphics.RectF;
import kotlin.C12956q;
import kotlin.jvm.internal.C12932j;

/* renamed from: f.a.a.b.d.i.a */
public final class C7780a {

    /* renamed from: a */
    private float f19455a;

    /* renamed from: b */
    private float f19456b;

    /* renamed from: c */
    private float f19457c;

    /* renamed from: d */
    private float f19458d;

    /* renamed from: e */
    private float f19459e;

    /* renamed from: f */
    private float f19460f;

    /* renamed from: g */
    private float f19461g;

    /* renamed from: h */
    private float f19462h;

    /* renamed from: a */
    public final float mo19983a() {
        return this.f19458d;
    }

    /* renamed from: b */
    public final float mo19988b() {
        return this.f19455a;
    }

    /* renamed from: c */
    public final void mo19991c(float f) {
        this.f19455a = f;
    }

    /* renamed from: d */
    public final float mo19992d() {
        return this.f19456b;
    }

    /* renamed from: e */
    public final void mo19994e(float f) {
        this.f19456b = f;
    }

    /* renamed from: a */
    public final void mo19985a(float f) {
        this.f19458d = f;
    }

    /* renamed from: b */
    public final void mo19989b(float f) {
        this.f19459e = f;
        this.f19460f = f;
        this.f19461g = f;
        this.f19462h = f;
    }

    /* renamed from: c */
    public final float mo19990c() {
        return this.f19457c;
    }

    /* renamed from: d */
    public final void mo19993d(float f) {
        this.f19457c = f;
    }

    /* renamed from: c */
    private final float m18887c(float f, float f2, float f3) {
        float f4 = (float) 2;
        float f5 = f2 / f4;
        float f6 = f3 / f4;
        if (((double) (f / Math.min(f5, f6))) > 0.5d) {
            return 1.0f - (Math.min(1.0f, ((f / Math.min(f5, f6)) - 0.5f) / 0.4f) * 0.13877845f);
        }
        return 1.0f;
    }

    /* renamed from: a */
    public final void mo19987a(float[] fArr) {
        C12932j.m33818b(fArr, "cornerRadii");
        this.f19459e = fArr[0];
        this.f19460f = fArr[2];
        this.f19461g = fArr[4];
        this.f19462h = fArr[6];
    }

    /* renamed from: b */
    private final float m18886b(float f, float f2, float f3) {
        float f4 = (float) 2;
        float f5 = f2 / f4;
        float f6 = f3 / f4;
        if (((double) (f / Math.min(f5, f6))) > 0.6d) {
            return ((float) 1) + (Math.min(1.0f, ((f / Math.min(f5, f6)) - 0.6f) / 0.3f) * 0.042454004f);
        }
        return 1.0f;
    }

    /* renamed from: a */
    public final void mo19986a(RectF rectF) {
        C12932j.m33818b(rectF, "rect");
        this.f19455a = rectF.left;
        this.f19456b = rectF.top;
        this.f19457c = rectF.right;
        this.f19458d = rectF.bottom;
    }

    /* renamed from: a */
    public static /* synthetic */ Path m18885a(C7780a aVar, Path path, int i, Object obj) {
        if ((i & 1) != 0) {
            path = new Path();
        }
        aVar.mo19984a(path);
        return path;
    }

    /* renamed from: a */
    public final Path mo19984a(Path path) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        Path path2 = path;
        C12932j.m33818b(path2, "path");
        path.reset();
        float f6 = this.f19457c;
        float f7 = this.f19455a;
        float f8 = f6 - f7;
        float f9 = this.f19458d;
        float f10 = this.f19456b;
        float f11 = f9 - f10;
        float a = m18884a(this.f19459e, f8, f11);
        float a2 = m18884a(this.f19460f, f8, f11);
        float a3 = m18884a(this.f19461g, f8, f11);
        float a4 = m18884a(this.f19462h, f8, f11);
        float f12 = (float) 2;
        float f13 = f8 / f12;
        path2.moveTo(f7 + f13, f10);
        if (a2 == 0.0f) {
            path2.lineTo(f7 + f8, f10);
            f2 = f13;
            f4 = f12;
            f = a4;
            f3 = a;
        } else {
            float c = m18887c(a2, f8, f11);
            float b = m18886b(a2, f8, f11);
            float f14 = a2 * 1.2819f * c;
            path2.lineTo(Math.max(f13, f8 - f14) + f7, f10);
            float f15 = f7 + f8;
            float f16 = a2 * 0.8362f * b;
            float f17 = a2 * 0.6745f;
            float f18 = a2 * 0.0464f;
            float f19 = a2 * 0.5116f;
            float f20 = a2 * 0.1336f;
            f3 = a;
            float f21 = f14;
            f2 = f13;
            f4 = f12;
            f = a4;
            path.cubicTo(f15 - f16, f10, f15 - f17, f10 + f18, f15 - f19, f10 + f20);
            float f22 = a2 * 0.3486f;
            float f23 = a2 * 0.2207f;
            path.cubicTo(f15 - f22, f10 + f23, f15 - f23, f10 + f22, f15 - f20, f10 + f19);
            path.cubicTo(f15 - f18, f10 + f17, f15, f10 + f16, f15, f10 + Math.min(f11 / f4, f21));
        }
        if (a3 == 0.0f) {
            path2.lineTo(f7 + f8, f10 + f11);
            f5 = f2;
        } else {
            float c2 = m18887c(a3, f8, f11);
            float b2 = m18886b(a3, f8, f11);
            float f24 = f7 + f8;
            path2.lineTo(f24, Math.max(f11 / 2.0f, f11 - ((1.12819f * a3) * c2)) + f10);
            float f25 = f10 + f11;
            float f26 = a3 * 0.8362f * b2;
            float f27 = a3 * 0.0464f;
            float f28 = a3 * 0.6745f;
            float f29 = a3 * 0.1336f;
            float f30 = a3 * 0.5116f;
            path.cubicTo(f24, f25 - f26, f24 - f27, f25 - f28, f24 - f29, f25 - f30);
            float f31 = a3 * 0.2207f;
            float f32 = a3 * 0.3486f;
            path.cubicTo(f24 - f31, f25 - f32, f24 - f32, f25 - f31, f24 - f30, f25 - f29);
            f5 = f2;
            path.cubicTo(f24 - f28, f25 - f27, f24 - f26, f25, f7 + Math.max(f5, f8 - ((a3 * 1.2819f) * c2)), f25);
        }
        float f33 = f;
        if (f33 == 0.0f) {
            path2.lineTo(f7, f10 + f11);
        } else {
            float c3 = m18887c(f33, f8, f11);
            float b3 = m18886b(f33, f8, f11);
            float f34 = f10 + f11;
            path2.lineTo(Math.min(f5, (f33 / 100.0f) * 128.19f * c3) + f7, f34);
            float f35 = f33 * 0.8362f * b3;
            float f36 = f33 * 0.6745f;
            float f37 = f33 * 0.0464f;
            float f38 = f33 * 0.5116f;
            float f39 = f33 * 0.1336f;
            float f40 = f34;
            path.cubicTo(f7 + f35, f34, f7 + f36, f34 - f37, f7 + f38, f34 - f39);
            float f41 = f33 * 0.3486f;
            float f42 = f33 * 0.2207f;
            path.cubicTo(f7 + f41, f40 - f42, f7 + f42, f40 - f41, f7 + f39, f40 - f38);
            path.cubicTo(f7 + f37, f40 - f36, f7, f40 - f35, f7, f10 + Math.max(f11 / f4, f11 - ((f33 * 1.2819f) * c3)));
        }
        if (f3 == 0.0f) {
            path2.lineTo(f7, f10);
        } else {
            float f43 = f3;
            float c4 = m18887c(f43, f8, f11);
            float b4 = m18886b(f43, f8, f11);
            float f44 = f43 * 1.2819f * c4;
            path2.lineTo(f7, Math.min(f11 / f4, f44) + f10);
            float f45 = f43 * 0.8362f * b4;
            float f46 = f43 * 0.0464f;
            float f47 = f43 * 0.6745f;
            float f48 = 0.1336f * f43;
            float f49 = 0.5116f * f43;
            path.cubicTo(f7, f10 + f45, f7 + f46, f10 + f47, f7 + f48, f10 + f49);
            float f50 = f43 * 0.2207f;
            float f51 = f43 * 0.3486f;
            path.cubicTo(f7 + f50, f10 + f51, f7 + f51, f10 + f50, f7 + f49, f10 + f48);
            path.cubicTo(f7 + f47, f10 + f46, f7 + f45, f10, f7 + Math.min(f5, f44), f10);
        }
        path.close();
        C12956q qVar = C12956q.f33541a;
        return path2;
    }

    /* renamed from: a */
    private final float m18884a(float f, float f2, float f3) {
        float f4 = (float) 2;
        return C12973l.m33892c(C12973l.m33892c(C12973l.m33889b(f, 0.0f), f2 / f4), f3 / f4);
    }
}
