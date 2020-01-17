package com.airbnb.lottie.animation.keyframe;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import com.airbnb.lottie.model.animatable.C8553l;
import com.airbnb.lottie.model.p284i.C8586a;
import com.airbnb.lottie.value.C8659a;
import com.airbnb.lottie.value.C8661c;
import com.airbnb.lottie.value.C8662d;
import java.util.Collections;

/* renamed from: com.airbnb.lottie.animation.keyframe.n */
public class C8503n {

    /* renamed from: a */
    private final Matrix f21736a = new Matrix();

    /* renamed from: b */
    private final Matrix f21737b;

    /* renamed from: c */
    private final Matrix f21738c;

    /* renamed from: d */
    private final Matrix f21739d;

    /* renamed from: e */
    private final float[] f21740e;

    /* renamed from: f */
    private BaseKeyframeAnimation<PointF, PointF> f21741f;

    /* renamed from: g */
    private BaseKeyframeAnimation<?, PointF> f21742g;

    /* renamed from: h */
    private BaseKeyframeAnimation<C8662d, C8662d> f21743h;

    /* renamed from: i */
    private BaseKeyframeAnimation<Float, Float> f21744i;

    /* renamed from: j */
    private BaseKeyframeAnimation<Integer, Integer> f21745j;

    /* renamed from: k */
    private C8491b f21746k;

    /* renamed from: l */
    private C8491b f21747l;

    /* renamed from: m */
    private BaseKeyframeAnimation<?, Float> f21748m;

    /* renamed from: n */
    private BaseKeyframeAnimation<?, Float> f21749n;

    public C8503n(C8553l lVar) {
        this.f21741f = lVar.mo23049b() == null ? null : lVar.mo23049b().createAnimation();
        this.f21742g = lVar.mo23052e() == null ? null : lVar.mo23052e().createAnimation();
        this.f21743h = lVar.mo23054g() == null ? null : lVar.mo23054g().createAnimation();
        this.f21744i = lVar.mo23053f() == null ? null : lVar.mo23053f().createAnimation();
        this.f21746k = lVar.mo23055h() == null ? null : (C8491b) lVar.mo23055h().createAnimation();
        if (this.f21746k != null) {
            this.f21737b = new Matrix();
            this.f21738c = new Matrix();
            this.f21739d = new Matrix();
            this.f21740e = new float[9];
        } else {
            this.f21737b = null;
            this.f21738c = null;
            this.f21739d = null;
            this.f21740e = null;
        }
        this.f21747l = lVar.mo23056i() == null ? null : (C8491b) lVar.mo23056i().createAnimation();
        if (lVar.mo23051d() != null) {
            this.f21745j = lVar.mo23051d().createAnimation();
        }
        if (lVar.mo23057j() != null) {
            this.f21748m = lVar.mo23057j().createAnimation();
        } else {
            this.f21748m = null;
        }
        if (lVar.mo23050c() != null) {
            this.f21749n = lVar.mo23050c().createAnimation();
        } else {
            this.f21749n = null;
        }
    }

    /* renamed from: e */
    private void m19637e() {
        for (int i = 0; i < 9; i++) {
            this.f21740e[i] = 0.0f;
        }
    }

    /* renamed from: a */
    public void mo22918a(C8586a aVar) {
        aVar.mo23182a(this.f21745j);
        aVar.mo23182a(this.f21748m);
        aVar.mo23182a(this.f21749n);
        aVar.mo23182a(this.f21741f);
        aVar.mo23182a(this.f21742g);
        aVar.mo23182a(this.f21743h);
        aVar.mo23182a(this.f21744i);
        aVar.mo23182a((BaseKeyframeAnimation<?, ?>) this.f21746k);
        aVar.mo23182a((BaseKeyframeAnimation<?, ?>) this.f21747l);
    }

    /* renamed from: b */
    public void mo22921b(float f) {
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.f21745j;
        if (baseKeyframeAnimation != null) {
            baseKeyframeAnimation.mo22896a(f);
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.f21748m;
        if (baseKeyframeAnimation2 != null) {
            baseKeyframeAnimation2.mo22896a(f);
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation3 = this.f21749n;
        if (baseKeyframeAnimation3 != null) {
            baseKeyframeAnimation3.mo22896a(f);
        }
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation4 = this.f21741f;
        if (baseKeyframeAnimation4 != null) {
            baseKeyframeAnimation4.mo22896a(f);
        }
        BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation5 = this.f21742g;
        if (baseKeyframeAnimation5 != null) {
            baseKeyframeAnimation5.mo22896a(f);
        }
        BaseKeyframeAnimation<C8662d, C8662d> baseKeyframeAnimation6 = this.f21743h;
        if (baseKeyframeAnimation6 != null) {
            baseKeyframeAnimation6.mo22896a(f);
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation7 = this.f21744i;
        if (baseKeyframeAnimation7 != null) {
            baseKeyframeAnimation7.mo22896a(f);
        }
        C8491b bVar = this.f21746k;
        if (bVar != null) {
            bVar.mo22896a(f);
        }
        C8491b bVar2 = this.f21747l;
        if (bVar2 != null) {
            bVar2.mo22896a(f);
        }
    }

    /* renamed from: c */
    public BaseKeyframeAnimation<?, Integer> mo22922c() {
        return this.f21745j;
    }

    /* renamed from: d */
    public BaseKeyframeAnimation<?, Float> mo22923d() {
        return this.f21748m;
    }

    /* renamed from: a */
    public void mo22917a(AnimationListener animationListener) {
        BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation = this.f21745j;
        if (baseKeyframeAnimation != null) {
            baseKeyframeAnimation.mo22897a(animationListener);
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.f21748m;
        if (baseKeyframeAnimation2 != null) {
            baseKeyframeAnimation2.mo22897a(animationListener);
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation3 = this.f21749n;
        if (baseKeyframeAnimation3 != null) {
            baseKeyframeAnimation3.mo22897a(animationListener);
        }
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation4 = this.f21741f;
        if (baseKeyframeAnimation4 != null) {
            baseKeyframeAnimation4.mo22897a(animationListener);
        }
        BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation5 = this.f21742g;
        if (baseKeyframeAnimation5 != null) {
            baseKeyframeAnimation5.mo22897a(animationListener);
        }
        BaseKeyframeAnimation<C8662d, C8662d> baseKeyframeAnimation6 = this.f21743h;
        if (baseKeyframeAnimation6 != null) {
            baseKeyframeAnimation6.mo22897a(animationListener);
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation7 = this.f21744i;
        if (baseKeyframeAnimation7 != null) {
            baseKeyframeAnimation7.mo22897a(animationListener);
        }
        C8491b bVar = this.f21746k;
        if (bVar != null) {
            bVar.mo22897a(animationListener);
        }
        C8491b bVar2 = this.f21747l;
        if (bVar2 != null) {
            bVar2.mo22897a(animationListener);
        }
    }

    /* renamed from: b */
    public Matrix mo22920b() {
        float f;
        this.f21736a.reset();
        BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation = this.f21742g;
        if (baseKeyframeAnimation != null) {
            PointF pointF = (PointF) baseKeyframeAnimation.mo22903f();
            if (!(pointF.x == 0.0f && pointF.y == 0.0f)) {
                this.f21736a.preTranslate(pointF.x, pointF.y);
            }
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation2 = this.f21744i;
        if (baseKeyframeAnimation2 != null) {
            if (baseKeyframeAnimation2 instanceof C8504o) {
                f = ((Float) baseKeyframeAnimation2.mo22903f()).floatValue();
            } else {
                f = ((C8491b) baseKeyframeAnimation2).mo22907i();
            }
            if (f != 0.0f) {
                this.f21736a.preRotate(f);
            }
        }
        if (this.f21746k != null) {
            C8491b bVar = this.f21747l;
            float cos = bVar == null ? 0.0f : (float) Math.cos(Math.toRadians((double) ((-bVar.mo22907i()) + 90.0f)));
            C8491b bVar2 = this.f21747l;
            float sin = bVar2 == null ? 1.0f : (float) Math.sin(Math.toRadians((double) ((-bVar2.mo22907i()) + 90.0f)));
            float tan = (float) Math.tan(Math.toRadians((double) this.f21746k.mo22907i()));
            m19637e();
            float[] fArr = this.f21740e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f2 = -sin;
            fArr[3] = f2;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.f21737b.setValues(fArr);
            m19637e();
            float[] fArr2 = this.f21740e;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f21738c.setValues(fArr2);
            m19637e();
            float[] fArr3 = this.f21740e;
            fArr3[0] = cos;
            fArr3[1] = f2;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.f21739d.setValues(fArr3);
            this.f21738c.preConcat(this.f21737b);
            this.f21739d.preConcat(this.f21738c);
            this.f21736a.preConcat(this.f21739d);
        }
        BaseKeyframeAnimation<C8662d, C8662d> baseKeyframeAnimation3 = this.f21743h;
        if (baseKeyframeAnimation3 != null) {
            C8662d dVar = (C8662d) baseKeyframeAnimation3.mo22903f();
            if (!(dVar.mo23301a() == 1.0f && dVar.mo23303b() == 1.0f)) {
                this.f21736a.preScale(dVar.mo23301a(), dVar.mo23303b());
            }
        }
        BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation4 = this.f21741f;
        if (baseKeyframeAnimation4 != null) {
            PointF pointF2 = (PointF) baseKeyframeAnimation4.mo22903f();
            if (!(pointF2.x == 0.0f && pointF2.y == 0.0f)) {
                this.f21736a.preTranslate(-pointF2.x, -pointF2.y);
            }
        }
        return this.f21736a;
    }

    /* renamed from: a */
    public BaseKeyframeAnimation<?, Float> mo22916a() {
        return this.f21749n;
    }

    /* renamed from: a */
    public Matrix mo22915a(float f) {
        BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation = this.f21742g;
        PointF pointF = null;
        PointF pointF2 = baseKeyframeAnimation == null ? null : (PointF) baseKeyframeAnimation.mo22903f();
        BaseKeyframeAnimation<C8662d, C8662d> baseKeyframeAnimation2 = this.f21743h;
        C8662d dVar = baseKeyframeAnimation2 == null ? null : (C8662d) baseKeyframeAnimation2.mo22903f();
        this.f21736a.reset();
        if (pointF2 != null) {
            this.f21736a.preTranslate(pointF2.x * f, pointF2.y * f);
        }
        if (dVar != null) {
            double d = (double) f;
            this.f21736a.preScale((float) Math.pow((double) dVar.mo23301a(), d), (float) Math.pow((double) dVar.mo23303b(), d));
        }
        BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation3 = this.f21744i;
        if (baseKeyframeAnimation3 != null) {
            float floatValue = ((Float) baseKeyframeAnimation3.mo22903f()).floatValue();
            BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation4 = this.f21741f;
            if (baseKeyframeAnimation4 != null) {
                pointF = (PointF) baseKeyframeAnimation4.mo22903f();
            }
            Matrix matrix = this.f21736a;
            float f2 = floatValue * f;
            float f3 = 0.0f;
            float f4 = pointF == null ? 0.0f : pointF.x;
            if (pointF != null) {
                f3 = pointF.y;
            }
            matrix.preRotate(f2, f4, f3);
        }
        return this.f21736a;
    }

    /* renamed from: a */
    public <T> boolean mo22919a(T t, C8661c<T> cVar) {
        if (t == LottieProperty.f21547e) {
            BaseKeyframeAnimation<PointF, PointF> baseKeyframeAnimation = this.f21741f;
            if (baseKeyframeAnimation == null) {
                this.f21741f = new C8504o(cVar, new PointF());
            } else {
                baseKeyframeAnimation.mo22898a(cVar);
            }
        } else if (t == LottieProperty.f21548f) {
            BaseKeyframeAnimation<?, PointF> baseKeyframeAnimation2 = this.f21742g;
            if (baseKeyframeAnimation2 == null) {
                this.f21742g = new C8504o(cVar, new PointF());
            } else {
                baseKeyframeAnimation2.mo22898a(cVar);
            }
        } else if (t == LottieProperty.f21553k) {
            BaseKeyframeAnimation<C8662d, C8662d> baseKeyframeAnimation3 = this.f21743h;
            if (baseKeyframeAnimation3 == null) {
                this.f21743h = new C8504o(cVar, new C8662d());
            } else {
                baseKeyframeAnimation3.mo22898a(cVar);
            }
        } else if (t == LottieProperty.f21554l) {
            BaseKeyframeAnimation<Float, Float> baseKeyframeAnimation4 = this.f21744i;
            if (baseKeyframeAnimation4 == null) {
                this.f21744i = new C8504o(cVar, Float.valueOf(0.0f));
            } else {
                baseKeyframeAnimation4.mo22898a(cVar);
            }
        } else if (t == LottieProperty.f21545c) {
            BaseKeyframeAnimation<Integer, Integer> baseKeyframeAnimation5 = this.f21745j;
            if (baseKeyframeAnimation5 == null) {
                this.f21745j = new C8504o(cVar, Integer.valueOf(100));
            } else {
                baseKeyframeAnimation5.mo22898a(cVar);
            }
        } else {
            if (t == LottieProperty.f21567y) {
                BaseKeyframeAnimation<?, Float> baseKeyframeAnimation6 = this.f21748m;
                if (baseKeyframeAnimation6 != null) {
                    if (baseKeyframeAnimation6 == null) {
                        this.f21748m = new C8504o(cVar, Integer.valueOf(100));
                    } else {
                        baseKeyframeAnimation6.mo22898a(cVar);
                    }
                }
            }
            if (t == LottieProperty.f21568z) {
                BaseKeyframeAnimation<?, Float> baseKeyframeAnimation7 = this.f21749n;
                if (baseKeyframeAnimation7 != null) {
                    if (baseKeyframeAnimation7 == null) {
                        this.f21749n = new C8504o(cVar, Integer.valueOf(100));
                    } else {
                        baseKeyframeAnimation7.mo22898a(cVar);
                    }
                }
            }
            if (t == LottieProperty.f21555m) {
                C8491b bVar = this.f21746k;
                if (bVar != null) {
                    if (bVar == null) {
                        this.f21746k = new C8491b(Collections.singletonList(new C8659a(Float.valueOf(0.0f))));
                    }
                    this.f21746k.mo22898a(cVar);
                }
            }
            if (t == LottieProperty.f21556n) {
                C8491b bVar2 = this.f21747l;
                if (bVar2 != null) {
                    if (bVar2 == null) {
                        this.f21747l = new C8491b(Collections.singletonList(new C8659a(Float.valueOf(0.0f))));
                    }
                    this.f21747l.mo22898a(cVar);
                }
            }
            return false;
        }
        return true;
    }
}
