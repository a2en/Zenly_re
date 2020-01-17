package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.airbnb.lottie.C8505b;
import com.airbnb.lottie.C8515e;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import com.airbnb.lottie.animation.keyframe.C8491b;
import com.airbnb.lottie.animation.keyframe.C8493d;
import com.airbnb.lottie.animation.keyframe.C8504o;
import com.airbnb.lottie.model.C8582e;
import com.airbnb.lottie.model.animatable.C8543b;
import com.airbnb.lottie.model.animatable.C8545d;
import com.airbnb.lottie.model.content.C8579p.C8580a;
import com.airbnb.lottie.model.p284i.C8586a;
import com.airbnb.lottie.p283m.C8540a;
import com.airbnb.lottie.p289q.C8657g;
import com.airbnb.lottie.p289q.C8658h;
import com.airbnb.lottie.value.C8661c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.content.a */
public abstract class C8470a implements AnimationListener, KeyPathElementContent, DrawingContent {

    /* renamed from: a */
    private final PathMeasure f21572a = new PathMeasure();

    /* renamed from: b */
    private final Path f21573b = new Path();

    /* renamed from: c */
    private final Path f21574c = new Path();

    /* renamed from: d */
    private final RectF f21575d = new RectF();

    /* renamed from: e */
    private final C8515e f21576e;

    /* renamed from: f */
    protected final C8586a f21577f;

    /* renamed from: g */
    private final List<C8472b> f21578g = new ArrayList();

    /* renamed from: h */
    private final float[] f21579h;

    /* renamed from: i */
    final Paint f21580i = new C8540a(1);

    /* renamed from: j */
    private final BaseKeyframeAnimation<?, Float> f21581j;

    /* renamed from: k */
    private final BaseKeyframeAnimation<?, Integer> f21582k;

    /* renamed from: l */
    private final List<BaseKeyframeAnimation<?, Float>> f21583l;

    /* renamed from: m */
    private final BaseKeyframeAnimation<?, Float> f21584m;

    /* renamed from: n */
    private BaseKeyframeAnimation<ColorFilter, ColorFilter> f21585n;

    /* renamed from: com.airbnb.lottie.animation.content.a$b */
    private static final class C8472b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final List<C8482j> f21586a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final C8489p f21587b;

        private C8472b(C8489p pVar) {
            this.f21586a = new ArrayList();
            this.f21587b = pVar;
        }
    }

    C8470a(C8515e eVar, C8586a aVar, Cap cap, Join join, float f, C8545d dVar, C8543b bVar, List<C8543b> list, C8543b bVar2) {
        this.f21576e = eVar;
        this.f21577f = aVar;
        this.f21580i.setStyle(Style.STROKE);
        this.f21580i.setStrokeCap(cap);
        this.f21580i.setStrokeJoin(join);
        this.f21580i.setStrokeMiter(f);
        this.f21582k = dVar.createAnimation();
        this.f21581j = bVar.createAnimation();
        if (bVar2 == null) {
            this.f21584m = null;
        } else {
            this.f21584m = bVar2.createAnimation();
        }
        this.f21583l = new ArrayList(list.size());
        this.f21579h = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f21583l.add(((C8543b) list.get(i)).createAnimation());
        }
        aVar.mo23182a(this.f21582k);
        aVar.mo23182a(this.f21581j);
        for (int i2 = 0; i2 < this.f21583l.size(); i2++) {
            aVar.mo23182a((BaseKeyframeAnimation) this.f21583l.get(i2));
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.f21584m;
        if (baseKeyframeAnimation != null) {
            aVar.mo23182a(baseKeyframeAnimation);
        }
        this.f21582k.mo22897a((AnimationListener) this);
        this.f21581j.mo22897a((AnimationListener) this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((BaseKeyframeAnimation) this.f21583l.get(i3)).mo22897a((AnimationListener) this);
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation2 = this.f21584m;
        if (baseKeyframeAnimation2 != null) {
            baseKeyframeAnimation2.mo22897a((AnimationListener) this);
        }
    }

    /* renamed from: a */
    private void m19546a(Canvas canvas, C8472b bVar, Matrix matrix) {
        String str = "StrokeContent#applyTrimPath";
        C8505b.m19651a(str);
        if (bVar.f21587b == null) {
            C8505b.m19652b(str);
            return;
        }
        this.f21573b.reset();
        for (int size = bVar.f21586a.size() - 1; size >= 0; size--) {
            this.f21573b.addPath(((C8482j) bVar.f21586a.get(size)).mo22884a(), matrix);
        }
        this.f21572a.setPath(this.f21573b, false);
        float length = this.f21572a.getLength();
        while (this.f21572a.nextContour()) {
            length += this.f21572a.getLength();
        }
        float floatValue = (((Float) bVar.f21587b.mo22890c().mo22903f()).floatValue() * length) / 360.0f;
        float floatValue2 = ((((Float) bVar.f21587b.mo22891d().mo22903f()).floatValue() * length) / 100.0f) + floatValue;
        float floatValue3 = ((((Float) bVar.f21587b.mo22889b().mo22903f()).floatValue() * length) / 100.0f) + floatValue;
        float f = 0.0f;
        for (int size2 = bVar.f21586a.size() - 1; size2 >= 0; size2--) {
            this.f21574c.set(((C8482j) bVar.f21586a.get(size2)).mo22884a());
            this.f21574c.transform(matrix);
            this.f21572a.setPath(this.f21574c, false);
            float length2 = this.f21572a.getLength();
            float f2 = 1.0f;
            if (floatValue3 > length) {
                float f3 = floatValue3 - length;
                if (f3 < f + length2 && f < f3) {
                    C8658h.m20200a(this.f21574c, floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f, Math.min(f3 / length2, 1.0f), 0.0f);
                    canvas.drawPath(this.f21574c, this.f21580i);
                    f += length2;
                }
            }
            float f4 = f + length2;
            if (f4 >= floatValue2 && f <= floatValue3) {
                if (f4 > floatValue3 || floatValue2 >= f) {
                    float f5 = floatValue2 < f ? 0.0f : (floatValue2 - f) / length2;
                    if (floatValue3 <= f4) {
                        f2 = (floatValue3 - f) / length2;
                    }
                    C8658h.m20200a(this.f21574c, f5, f2, 0.0f);
                    canvas.drawPath(this.f21574c, this.f21580i);
                } else {
                    canvas.drawPath(this.f21574c, this.f21580i);
                }
            }
            f += length2;
        }
        C8505b.m19652b(str);
    }

    public <T> void addValueCallback(T t, C8661c<T> cVar) {
        if (t == LottieProperty.f21546d) {
            this.f21582k.mo22898a(cVar);
        } else if (t == LottieProperty.f21557o) {
            this.f21581j.mo22898a(cVar);
        } else if (t != LottieProperty.f21541B) {
        } else {
            if (cVar == null) {
                this.f21585n = null;
                return;
            }
            this.f21585n = new C8504o(cVar);
            this.f21585n.mo22897a((AnimationListener) this);
            this.f21577f.mo23182a(this.f21585n);
        }
    }

    public void draw(Canvas canvas, Matrix matrix, int i) {
        String str = "StrokeContent#draw";
        C8505b.m19651a(str);
        if (C8658h.m20205b(matrix)) {
            C8505b.m19652b(str);
            return;
        }
        this.f21580i.setAlpha(C8657g.m20185a((int) ((((((float) i) / 255.0f) * ((float) ((C8493d) this.f21582k).mo22907i())) / 100.0f) * 255.0f), 0, 255));
        this.f21580i.setStrokeWidth(((C8491b) this.f21581j).mo22907i() * C8658h.m20194a(matrix));
        if (this.f21580i.getStrokeWidth() <= 0.0f) {
            C8505b.m19652b(str);
            return;
        }
        m19547a(matrix);
        BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.f21585n;
        if (baseKeyframeAnimation != null) {
            this.f21580i.setColorFilter((ColorFilter) baseKeyframeAnimation.mo22903f());
        }
        for (int i2 = 0; i2 < this.f21578g.size(); i2++) {
            C8472b bVar = (C8472b) this.f21578g.get(i2);
            if (bVar.f21587b != null) {
                m19546a(canvas, bVar, matrix);
            } else {
                String str2 = "StrokeContent#buildPath";
                C8505b.m19651a(str2);
                this.f21573b.reset();
                for (int size = bVar.f21586a.size() - 1; size >= 0; size--) {
                    this.f21573b.addPath(((C8482j) bVar.f21586a.get(size)).mo22884a(), matrix);
                }
                C8505b.m19652b(str2);
                String str3 = "StrokeContent#drawPath";
                C8505b.m19651a(str3);
                canvas.drawPath(this.f21573b, this.f21580i);
                C8505b.m19652b(str3);
            }
        }
        C8505b.m19652b(str);
    }

    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        String str = "StrokeContent#getBounds";
        C8505b.m19651a(str);
        this.f21573b.reset();
        for (int i = 0; i < this.f21578g.size(); i++) {
            C8472b bVar = (C8472b) this.f21578g.get(i);
            for (int i2 = 0; i2 < bVar.f21586a.size(); i2++) {
                this.f21573b.addPath(((C8482j) bVar.f21586a.get(i2)).mo22884a(), matrix);
            }
        }
        this.f21573b.computeBounds(this.f21575d, false);
        float i3 = ((C8491b) this.f21581j).mo22907i();
        RectF rectF2 = this.f21575d;
        float f = i3 / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.f21575d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C8505b.m19652b(str);
    }

    public void onValueChanged() {
        this.f21576e.invalidateSelf();
    }

    public void resolveKeyPath(C8582e eVar, int i, List<C8582e> list, C8582e eVar2) {
        C8657g.m20188a(eVar, i, list, eVar2, this);
    }

    public void setContents(List<Content> list, List<Content> list2) {
        C8489p pVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            Content content = (Content) list.get(size);
            if (content instanceof C8489p) {
                C8489p pVar2 = (C8489p) content;
                if (pVar2.mo22892e() == C8580a.INDIVIDUALLY) {
                    pVar = pVar2;
                }
            }
        }
        if (pVar != null) {
            pVar.mo22888a(this);
        }
        C8472b bVar = null;
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            Content content2 = (Content) list2.get(size2);
            if (content2 instanceof C8489p) {
                C8489p pVar3 = (C8489p) content2;
                if (pVar3.mo22892e() == C8580a.INDIVIDUALLY) {
                    if (bVar != null) {
                        this.f21578g.add(bVar);
                    }
                    bVar = new C8472b(pVar3);
                    pVar3.mo22888a(this);
                }
            }
            if (content2 instanceof C8482j) {
                if (bVar == null) {
                    bVar = new C8472b(pVar);
                }
                bVar.f21586a.add((C8482j) content2);
            }
        }
        if (bVar != null) {
            this.f21578g.add(bVar);
        }
    }

    /* renamed from: a */
    private void m19547a(Matrix matrix) {
        String str = "StrokeContent#applyDashPattern";
        C8505b.m19651a(str);
        if (this.f21583l.isEmpty()) {
            C8505b.m19652b(str);
            return;
        }
        float a = C8658h.m20194a(matrix);
        for (int i = 0; i < this.f21583l.size(); i++) {
            this.f21579h[i] = ((Float) ((BaseKeyframeAnimation) this.f21583l.get(i)).mo22903f()).floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.f21579h;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.f21579h;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
            float[] fArr3 = this.f21579h;
            fArr3[i] = fArr3[i] * a;
        }
        BaseKeyframeAnimation<?, Float> baseKeyframeAnimation = this.f21584m;
        this.f21580i.setPathEffect(new DashPathEffect(this.f21579h, baseKeyframeAnimation == null ? 0.0f : a * ((Float) baseKeyframeAnimation.mo22903f()).floatValue()));
        C8505b.m19652b(str);
    }
}
