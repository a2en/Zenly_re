package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.C8515e;
import com.airbnb.lottie.animation.content.C8485l;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.animatable.C8543b;
import com.airbnb.lottie.model.animatable.C8547f;
import com.airbnb.lottie.model.p284i.C8586a;

/* renamed from: com.airbnb.lottie.model.content.i */
public class C8569i implements ContentModel {

    /* renamed from: a */
    private final String f21950a;

    /* renamed from: b */
    private final AnimatableValue<PointF, PointF> f21951b;

    /* renamed from: c */
    private final C8547f f21952c;

    /* renamed from: d */
    private final C8543b f21953d;

    /* renamed from: e */
    private final boolean f21954e;

    public C8569i(String str, AnimatableValue<PointF, PointF> animatableValue, C8547f fVar, C8543b bVar, boolean z) {
        this.f21950a = str;
        this.f21951b = animatableValue;
        this.f21952c = fVar;
        this.f21953d = bVar;
        this.f21954e = z;
    }

    /* renamed from: a */
    public C8543b mo23112a() {
        return this.f21953d;
    }

    /* renamed from: b */
    public String mo23113b() {
        return this.f21950a;
    }

    /* renamed from: c */
    public AnimatableValue<PointF, PointF> mo23114c() {
        return this.f21951b;
    }

    /* renamed from: d */
    public C8547f mo23115d() {
        return this.f21952c;
    }

    /* renamed from: e */
    public boolean mo23116e() {
        return this.f21954e;
    }

    public Content toContent(C8515e eVar, C8586a aVar) {
        return new C8485l(eVar, aVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RectangleShape{position=");
        sb.append(this.f21951b);
        sb.append(", size=");
        sb.append(this.f21952c);
        sb.append('}');
        return sb.toString();
    }
}
