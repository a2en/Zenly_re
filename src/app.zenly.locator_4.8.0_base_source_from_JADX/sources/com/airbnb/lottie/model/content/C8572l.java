package com.airbnb.lottie.model.content;

import android.graphics.Path.FillType;
import com.airbnb.lottie.C8515e;
import com.airbnb.lottie.animation.content.C8476e;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.animatable.C8542a;
import com.airbnb.lottie.model.animatable.C8545d;
import com.airbnb.lottie.model.p284i.C8586a;

/* renamed from: com.airbnb.lottie.model.content.l */
public class C8572l implements ContentModel {

    /* renamed from: a */
    private final boolean f21963a;

    /* renamed from: b */
    private final FillType f21964b;

    /* renamed from: c */
    private final String f21965c;

    /* renamed from: d */
    private final C8542a f21966d;

    /* renamed from: e */
    private final C8545d f21967e;

    /* renamed from: f */
    private final boolean f21968f;

    public C8572l(String str, boolean z, FillType fillType, C8542a aVar, C8545d dVar, boolean z2) {
        this.f21965c = str;
        this.f21963a = z;
        this.f21964b = fillType;
        this.f21966d = aVar;
        this.f21967e = dVar;
        this.f21968f = z2;
    }

    /* renamed from: a */
    public C8542a mo23128a() {
        return this.f21966d;
    }

    /* renamed from: b */
    public FillType mo23129b() {
        return this.f21964b;
    }

    /* renamed from: c */
    public String mo23130c() {
        return this.f21965c;
    }

    /* renamed from: d */
    public C8545d mo23131d() {
        return this.f21967e;
    }

    /* renamed from: e */
    public boolean mo23132e() {
        return this.f21968f;
    }

    public Content toContent(C8515e eVar, C8586a aVar) {
        return new C8476e(eVar, aVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShapeFill{color=, fillEnabled=");
        sb.append(this.f21963a);
        sb.append('}');
        return sb.toString();
    }
}
