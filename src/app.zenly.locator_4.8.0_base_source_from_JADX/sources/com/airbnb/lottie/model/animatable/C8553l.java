package com.airbnb.lottie.model.animatable;

import android.graphics.PointF;
import com.airbnb.lottie.C8515e;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.animation.content.ModifierContent;
import com.airbnb.lottie.animation.keyframe.C8503n;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.p284i.C8586a;

/* renamed from: com.airbnb.lottie.model.animatable.l */
public class C8553l implements ModifierContent, ContentModel {

    /* renamed from: a */
    private final C8546e f21860a;

    /* renamed from: b */
    private final AnimatableValue<PointF, PointF> f21861b;

    /* renamed from: c */
    private final C8548g f21862c;

    /* renamed from: d */
    private final C8543b f21863d;

    /* renamed from: e */
    private final C8545d f21864e;

    /* renamed from: f */
    private final C8543b f21865f;

    /* renamed from: g */
    private final C8543b f21866g;

    /* renamed from: h */
    private final C8543b f21867h;

    /* renamed from: i */
    private final C8543b f21868i;

    public C8553l() {
        this(null, null, null, null, null, null, null, null, null);
    }

    /* renamed from: a */
    public C8503n mo23048a() {
        return new C8503n(this);
    }

    /* renamed from: b */
    public C8546e mo23049b() {
        return this.f21860a;
    }

    /* renamed from: c */
    public C8543b mo23050c() {
        return this.f21868i;
    }

    /* renamed from: d */
    public C8545d mo23051d() {
        return this.f21864e;
    }

    /* renamed from: e */
    public AnimatableValue<PointF, PointF> mo23052e() {
        return this.f21861b;
    }

    /* renamed from: f */
    public C8543b mo23053f() {
        return this.f21863d;
    }

    /* renamed from: g */
    public C8548g mo23054g() {
        return this.f21862c;
    }

    /* renamed from: h */
    public C8543b mo23055h() {
        return this.f21865f;
    }

    /* renamed from: i */
    public C8543b mo23056i() {
        return this.f21866g;
    }

    /* renamed from: j */
    public C8543b mo23057j() {
        return this.f21867h;
    }

    public Content toContent(C8515e eVar, C8586a aVar) {
        return null;
    }

    public C8553l(C8546e eVar, AnimatableValue<PointF, PointF> animatableValue, C8548g gVar, C8543b bVar, C8545d dVar, C8543b bVar2, C8543b bVar3, C8543b bVar4, C8543b bVar5) {
        this.f21860a = eVar;
        this.f21861b = animatableValue;
        this.f21862c = gVar;
        this.f21863d = bVar;
        this.f21864e = dVar;
        this.f21867h = bVar2;
        this.f21868i = bVar3;
        this.f21865f = bVar4;
        this.f21866g = bVar5;
    }
}
