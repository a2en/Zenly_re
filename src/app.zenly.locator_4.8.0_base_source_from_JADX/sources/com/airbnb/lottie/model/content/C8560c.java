package com.airbnb.lottie.model.content;

import android.graphics.Path.FillType;
import com.airbnb.lottie.C8515e;
import com.airbnb.lottie.animation.content.C8477f;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.animatable.C8543b;
import com.airbnb.lottie.model.animatable.C8544c;
import com.airbnb.lottie.model.animatable.C8545d;
import com.airbnb.lottie.model.animatable.C8547f;
import com.airbnb.lottie.model.p284i.C8586a;

/* renamed from: com.airbnb.lottie.model.content.c */
public class C8560c implements ContentModel {

    /* renamed from: a */
    private final C8562e f21895a;

    /* renamed from: b */
    private final FillType f21896b;

    /* renamed from: c */
    private final C8544c f21897c;

    /* renamed from: d */
    private final C8545d f21898d;

    /* renamed from: e */
    private final C8547f f21899e;

    /* renamed from: f */
    private final C8547f f21900f;

    /* renamed from: g */
    private final String f21901g;

    /* renamed from: h */
    private final boolean f21902h;

    public C8560c(String str, C8562e eVar, FillType fillType, C8544c cVar, C8545d dVar, C8547f fVar, C8547f fVar2, C8543b bVar, C8543b bVar2, boolean z) {
        this.f21895a = eVar;
        this.f21896b = fillType;
        this.f21897c = cVar;
        this.f21898d = dVar;
        this.f21899e = fVar;
        this.f21900f = fVar2;
        this.f21901g = str;
        this.f21902h = z;
    }

    /* renamed from: a */
    public C8547f mo23073a() {
        return this.f21900f;
    }

    /* renamed from: b */
    public FillType mo23074b() {
        return this.f21896b;
    }

    /* renamed from: c */
    public C8544c mo23075c() {
        return this.f21897c;
    }

    /* renamed from: d */
    public C8562e mo23076d() {
        return this.f21895a;
    }

    /* renamed from: e */
    public String mo23077e() {
        return this.f21901g;
    }

    /* renamed from: f */
    public C8545d mo23078f() {
        return this.f21898d;
    }

    /* renamed from: g */
    public C8547f mo23079g() {
        return this.f21899e;
    }

    /* renamed from: h */
    public boolean mo23080h() {
        return this.f21902h;
    }

    public Content toContent(C8515e eVar, C8586a aVar) {
        return new C8477f(eVar, aVar, this);
    }
}
