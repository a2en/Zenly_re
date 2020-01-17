package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C8515e;
import com.airbnb.lottie.animation.content.C8486m;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.animatable.C8543b;
import com.airbnb.lottie.model.animatable.C8553l;
import com.airbnb.lottie.model.p284i.C8586a;

/* renamed from: com.airbnb.lottie.model.content.j */
public class C8570j implements ContentModel {

    /* renamed from: a */
    private final String f21955a;

    /* renamed from: b */
    private final C8543b f21956b;

    /* renamed from: c */
    private final C8543b f21957c;

    /* renamed from: d */
    private final C8553l f21958d;

    /* renamed from: e */
    private final boolean f21959e;

    public C8570j(String str, C8543b bVar, C8543b bVar2, C8553l lVar, boolean z) {
        this.f21955a = str;
        this.f21956b = bVar;
        this.f21957c = bVar2;
        this.f21958d = lVar;
        this.f21959e = z;
    }

    /* renamed from: a */
    public C8543b mo23118a() {
        return this.f21956b;
    }

    /* renamed from: b */
    public String mo23119b() {
        return this.f21955a;
    }

    /* renamed from: c */
    public C8543b mo23120c() {
        return this.f21957c;
    }

    /* renamed from: d */
    public C8553l mo23121d() {
        return this.f21958d;
    }

    /* renamed from: e */
    public boolean mo23122e() {
        return this.f21959e;
    }

    public Content toContent(C8515e eVar, C8586a aVar) {
        return new C8486m(eVar, aVar, this);
    }
}
