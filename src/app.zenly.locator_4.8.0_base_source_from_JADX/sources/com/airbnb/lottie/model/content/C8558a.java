package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.C8515e;
import com.airbnb.lottie.animation.content.C8475d;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.animatable.C8547f;
import com.airbnb.lottie.model.p284i.C8586a;

/* renamed from: com.airbnb.lottie.model.content.a */
public class C8558a implements ContentModel {

    /* renamed from: a */
    private final String f21888a;

    /* renamed from: b */
    private final AnimatableValue<PointF, PointF> f21889b;

    /* renamed from: c */
    private final C8547f f21890c;

    /* renamed from: d */
    private final boolean f21891d;

    /* renamed from: e */
    private final boolean f21892e;

    public C8558a(String str, AnimatableValue<PointF, PointF> animatableValue, C8547f fVar, boolean z, boolean z2) {
        this.f21888a = str;
        this.f21889b = animatableValue;
        this.f21890c = fVar;
        this.f21891d = z;
        this.f21892e = z2;
    }

    /* renamed from: a */
    public String mo23064a() {
        return this.f21888a;
    }

    /* renamed from: b */
    public AnimatableValue<PointF, PointF> mo23065b() {
        return this.f21889b;
    }

    /* renamed from: c */
    public C8547f mo23066c() {
        return this.f21890c;
    }

    /* renamed from: d */
    public boolean mo23067d() {
        return this.f21892e;
    }

    /* renamed from: e */
    public boolean mo23068e() {
        return this.f21891d;
    }

    public Content toContent(C8515e eVar, C8586a aVar) {
        return new C8475d(eVar, aVar, this);
    }
}
