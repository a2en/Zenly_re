package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C8515e;
import com.airbnb.lottie.animation.content.C8487n;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.animatable.C8549h;
import com.airbnb.lottie.model.p284i.C8586a;

/* renamed from: com.airbnb.lottie.model.content.n */
public class C8574n implements ContentModel {

    /* renamed from: a */
    private final String f21972a;

    /* renamed from: b */
    private final int f21973b;

    /* renamed from: c */
    private final C8549h f21974c;

    /* renamed from: d */
    private final boolean f21975d;

    public C8574n(String str, int i, C8549h hVar, boolean z) {
        this.f21972a = str;
        this.f21973b = i;
        this.f21974c = hVar;
        this.f21975d = z;
    }

    /* renamed from: a */
    public String mo23138a() {
        return this.f21972a;
    }

    /* renamed from: b */
    public C8549h mo23139b() {
        return this.f21974c;
    }

    /* renamed from: c */
    public boolean mo23140c() {
        return this.f21975d;
    }

    public Content toContent(C8515e eVar, C8586a aVar) {
        return new C8487n(eVar, aVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShapePath{name=");
        sb.append(this.f21972a);
        sb.append(", index=");
        sb.append(this.f21973b);
        sb.append('}');
        return sb.toString();
    }
}
