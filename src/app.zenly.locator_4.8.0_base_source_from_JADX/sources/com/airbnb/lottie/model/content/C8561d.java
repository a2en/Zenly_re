package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C8515e;
import com.airbnb.lottie.animation.content.C8478g;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.animatable.C8543b;
import com.airbnb.lottie.model.animatable.C8544c;
import com.airbnb.lottie.model.animatable.C8545d;
import com.airbnb.lottie.model.animatable.C8547f;
import com.airbnb.lottie.model.content.C8575o.C8577b;
import com.airbnb.lottie.model.content.C8575o.C8578c;
import com.airbnb.lottie.model.p284i.C8586a;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.content.d */
public class C8561d implements ContentModel {

    /* renamed from: a */
    private final String f21903a;

    /* renamed from: b */
    private final C8562e f21904b;

    /* renamed from: c */
    private final C8544c f21905c;

    /* renamed from: d */
    private final C8545d f21906d;

    /* renamed from: e */
    private final C8547f f21907e;

    /* renamed from: f */
    private final C8547f f21908f;

    /* renamed from: g */
    private final C8543b f21909g;

    /* renamed from: h */
    private final C8577b f21910h;

    /* renamed from: i */
    private final C8578c f21911i;

    /* renamed from: j */
    private final float f21912j;

    /* renamed from: k */
    private final List<C8543b> f21913k;

    /* renamed from: l */
    private final C8543b f21914l;

    /* renamed from: m */
    private final boolean f21915m;

    public C8561d(String str, C8562e eVar, C8544c cVar, C8545d dVar, C8547f fVar, C8547f fVar2, C8543b bVar, C8577b bVar2, C8578c cVar2, float f, List<C8543b> list, C8543b bVar3, boolean z) {
        this.f21903a = str;
        this.f21904b = eVar;
        this.f21905c = cVar;
        this.f21906d = dVar;
        this.f21907e = fVar;
        this.f21908f = fVar2;
        this.f21909g = bVar;
        this.f21910h = bVar2;
        this.f21911i = cVar2;
        this.f21912j = f;
        this.f21913k = list;
        this.f21914l = bVar3;
        this.f21915m = z;
    }

    /* renamed from: a */
    public C8577b mo23081a() {
        return this.f21910h;
    }

    /* renamed from: b */
    public C8543b mo23082b() {
        return this.f21914l;
    }

    /* renamed from: c */
    public C8547f mo23083c() {
        return this.f21908f;
    }

    /* renamed from: d */
    public C8544c mo23084d() {
        return this.f21905c;
    }

    /* renamed from: e */
    public C8562e mo23085e() {
        return this.f21904b;
    }

    /* renamed from: f */
    public C8578c mo23086f() {
        return this.f21911i;
    }

    /* renamed from: g */
    public List<C8543b> mo23087g() {
        return this.f21913k;
    }

    /* renamed from: h */
    public float mo23088h() {
        return this.f21912j;
    }

    /* renamed from: i */
    public String mo23089i() {
        return this.f21903a;
    }

    /* renamed from: j */
    public C8545d mo23090j() {
        return this.f21906d;
    }

    /* renamed from: k */
    public C8547f mo23091k() {
        return this.f21907e;
    }

    /* renamed from: l */
    public C8543b mo23092l() {
        return this.f21909g;
    }

    /* renamed from: m */
    public boolean mo23093m() {
        return this.f21915m;
    }

    public Content toContent(C8515e eVar, C8586a aVar) {
        return new C8478g(eVar, aVar, this);
    }
}
