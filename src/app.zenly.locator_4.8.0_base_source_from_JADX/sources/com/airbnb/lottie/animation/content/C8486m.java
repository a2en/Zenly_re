package com.airbnb.lottie.animation.content;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C8515e;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener;
import com.airbnb.lottie.animation.keyframe.C8503n;
import com.airbnb.lottie.model.C8582e;
import com.airbnb.lottie.model.content.C8570j;
import com.airbnb.lottie.model.p284i.C8586a;
import com.airbnb.lottie.p289q.C8657g;
import com.airbnb.lottie.value.C8661c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.airbnb.lottie.animation.content.m */
public class C8486m implements DrawingContent, C8482j, C8479h, AnimationListener, KeyPathElementContent {

    /* renamed from: a */
    private final Matrix f21679a = new Matrix();

    /* renamed from: b */
    private final Path f21680b = new Path();

    /* renamed from: c */
    private final C8515e f21681c;

    /* renamed from: d */
    private final C8586a f21682d;

    /* renamed from: e */
    private final String f21683e;

    /* renamed from: f */
    private final boolean f21684f;

    /* renamed from: g */
    private final BaseKeyframeAnimation<Float, Float> f21685g;

    /* renamed from: h */
    private final BaseKeyframeAnimation<Float, Float> f21686h;

    /* renamed from: i */
    private final C8503n f21687i;

    /* renamed from: j */
    private C8474c f21688j;

    public C8486m(C8515e eVar, C8586a aVar, C8570j jVar) {
        this.f21681c = eVar;
        this.f21682d = aVar;
        this.f21683e = jVar.mo23119b();
        this.f21684f = jVar.mo23122e();
        this.f21685g = jVar.mo23118a().createAnimation();
        aVar.mo23182a(this.f21685g);
        this.f21685g.mo22897a((AnimationListener) this);
        this.f21686h = jVar.mo23120c().createAnimation();
        aVar.mo23182a(this.f21686h);
        this.f21686h.mo22897a((AnimationListener) this);
        this.f21687i = jVar.mo23121d().mo23048a();
        this.f21687i.mo22918a(aVar);
        this.f21687i.mo22917a((AnimationListener) this);
    }

    /* renamed from: a */
    public void mo22887a(ListIterator<Content> listIterator) {
        if (this.f21688j == null) {
            while (listIterator.hasPrevious()) {
                if (listIterator.previous() == this) {
                    break;
                }
            }
            ArrayList arrayList = new ArrayList();
            while (listIterator.hasPrevious()) {
                arrayList.add(listIterator.previous());
                listIterator.remove();
            }
            Collections.reverse(arrayList);
            C8474c cVar = new C8474c(this.f21681c, this.f21682d, "Repeater", this.f21684f, arrayList, null);
            this.f21688j = cVar;
        }
    }

    public <T> void addValueCallback(T t, C8661c<T> cVar) {
        if (!this.f21687i.mo22919a(t, cVar)) {
            if (t == LottieProperty.f21559q) {
                this.f21685g.mo22898a(cVar);
            } else if (t == LottieProperty.f21560r) {
                this.f21686h.mo22898a(cVar);
            }
        }
    }

    public void draw(Canvas canvas, Matrix matrix, int i) {
        float floatValue = ((Float) this.f21685g.mo22903f()).floatValue();
        float floatValue2 = ((Float) this.f21686h.mo22903f()).floatValue();
        float floatValue3 = ((Float) this.f21687i.mo22923d().mo22903f()).floatValue() / 100.0f;
        float floatValue4 = ((Float) this.f21687i.mo22916a().mo22903f()).floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f21679a.set(matrix);
            float f = (float) i2;
            this.f21679a.preConcat(this.f21687i.mo22915a(f + floatValue2));
            this.f21688j.draw(canvas, this.f21679a, (int) (((float) i) * C8657g.m20191c(floatValue3, floatValue4, f / floatValue)));
        }
    }

    public void getBounds(RectF rectF, Matrix matrix, boolean z) {
        this.f21688j.getBounds(rectF, matrix, z);
    }

    public String getName() {
        return this.f21683e;
    }

    public void onValueChanged() {
        this.f21681c.invalidateSelf();
    }

    public void resolveKeyPath(C8582e eVar, int i, List<C8582e> list, C8582e eVar2) {
        C8657g.m20188a(eVar, i, list, eVar2, this);
    }

    public void setContents(List<Content> list, List<Content> list2) {
        this.f21688j.setContents(list, list2);
    }

    /* renamed from: a */
    public Path mo22884a() {
        Path a = this.f21688j.mo22884a();
        this.f21680b.reset();
        float floatValue = ((Float) this.f21685g.mo22903f()).floatValue();
        float floatValue2 = ((Float) this.f21686h.mo22903f()).floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.f21679a.set(this.f21687i.mo22915a(((float) i) + floatValue2));
            this.f21680b.addPath(a, this.f21679a);
        }
        return this.f21680b;
    }
}
