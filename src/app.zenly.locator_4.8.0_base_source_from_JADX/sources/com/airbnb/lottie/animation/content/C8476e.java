package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C8505b;
import com.airbnb.lottie.C8515e;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import com.airbnb.lottie.animation.keyframe.C8490a;
import com.airbnb.lottie.animation.keyframe.C8504o;
import com.airbnb.lottie.model.C8582e;
import com.airbnb.lottie.model.content.C8572l;
import com.airbnb.lottie.model.p284i.C8586a;
import com.airbnb.lottie.p283m.C8540a;
import com.airbnb.lottie.p289q.C8657g;
import com.airbnb.lottie.value.C8661c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.content.e */
public class C8476e implements DrawingContent, AnimationListener, KeyPathElementContent {

    /* renamed from: a */
    private final Path f21608a = new Path();

    /* renamed from: b */
    private final Paint f21609b = new C8540a(1);

    /* renamed from: c */
    private final C8586a f21610c;

    /* renamed from: d */
    private final String f21611d;

    /* renamed from: e */
    private final boolean f21612e;

    /* renamed from: f */
    private final List<C8482j> f21613f = new ArrayList();

    /* renamed from: g */
    private final BaseKeyframeAnimation<Integer, Integer> f21614g;

    /* renamed from: h */
    private final BaseKeyframeAnimation<Integer, Integer> f21615h;

    /* renamed from: i */
    private BaseKeyframeAnimation<ColorFilter, ColorFilter> f21616i;

    /* renamed from: j */
    private final C8515e f21617j;

    public C8476e(C8515e eVar, C8586a aVar, C8572l lVar) {
        this.f21610c = aVar;
        this.f21611d = lVar.mo23130c();
        this.f21612e = lVar.mo23132e();
        this.f21617j = eVar;
        if (lVar.mo23128a() == null || lVar.mo23131d() == null) {
            this.f21614g = null;
            this.f21615h = null;
            return;
        }
        this.f21608a.setFillType(lVar.mo23129b());
        this.f21614g = lVar.mo23128a().createAnimation();
        this.f21614g.mo22897a((AnimationListener) this);
        aVar.mo23182a(this.f21614g);
        this.f21615h = lVar.mo23131d().createAnimation();
        this.f21615h.mo22897a((AnimationListener) this);
        aVar.mo23182a(this.f21615h);
    }

    public <T> void addValueCallback(T t, C8661c<T> cVar) {
        if (t == LottieProperty.f21543a) {
            this.f21614g.mo22898a(cVar);
        } else if (t == LottieProperty.f21546d) {
            this.f21615h.mo22898a(cVar);
        } else if (t != LottieProperty.f21541B) {
        } else {
            if (cVar == null) {
                this.f21616i = null;
                return;
            }
            this.f21616i = new C8504o(cVar);
            this.f21616i.mo22897a((AnimationListener) this);
            this.f21610c.mo23182a(this.f21616i);
        }
    }

    public void draw(Canvas canvas, Matrix matrix, int i) {
        if (!this.f21612e) {
            String str = "FillContent#draw";
            C8505b.m19651a(str);
            this.f21609b.setColor(((C8490a) this.f21614g).mo22907i());
            this.f21609b.setAlpha(C8657g.m20185a((int) ((((((float) i) / 255.0f) * ((float) ((Integer) this.f21615h.mo22903f()).intValue())) / 100.0f) * 255.0f), 0, 255));
            BaseKeyframeAnimation<ColorFilter, ColorFilter> baseKeyframeAnimation = this.f21616i;
            if (baseKeyframeAnimation != null) {
                this.f21609b.setColorFilter((ColorFilter) baseKeyframeAnimation.mo22903f());
            }
            this.f21608a.reset();
            for (int i2 = 0; i2 < this.f21613f.size(); i2++) {
                this.f21608a.addPath(((C8482j) this.f21613f.get(i2)).mo22884a(), matrix);
            }
            canvas.drawPath(this.f21608a, this.f21609b);
            C8505b.m19652b(str);
        }
    }

    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        this.f21608a.reset();
        for (int i = 0; i < this.f21613f.size(); i++) {
            this.f21608a.addPath(((C8482j) this.f21613f.get(i)).mo22884a(), matrix);
        }
        this.f21608a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public String getName() {
        return this.f21611d;
    }

    public void onValueChanged() {
        this.f21617j.invalidateSelf();
    }

    public void resolveKeyPath(C8582e eVar, int i, List<C8582e> list, C8582e eVar2) {
        C8657g.m20188a(eVar, i, list, eVar2, this);
    }

    public void setContents(List<Content> list, List<Content> list2) {
        for (int i = 0; i < list2.size(); i++) {
            Content content = (Content) list2.get(i);
            if (content instanceof C8482j) {
                this.f21613f.add((C8482j) content);
            }
        }
    }
}
