package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C8515e;
import com.airbnb.lottie.animation.content.C8474c;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.p284i.C8586a;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.content.m */
public class C8573m implements ContentModel {

    /* renamed from: a */
    private final String f21969a;

    /* renamed from: b */
    private final List<ContentModel> f21970b;

    /* renamed from: c */
    private final boolean f21971c;

    public C8573m(String str, List<ContentModel> list, boolean z) {
        this.f21969a = str;
        this.f21970b = list;
        this.f21971c = z;
    }

    /* renamed from: a */
    public List<ContentModel> mo23134a() {
        return this.f21970b;
    }

    /* renamed from: b */
    public String mo23135b() {
        return this.f21969a;
    }

    /* renamed from: c */
    public boolean mo23136c() {
        return this.f21971c;
    }

    public Content toContent(C8515e eVar, C8586a aVar) {
        return new C8474c(eVar, aVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShapeGroup{name='");
        sb.append(this.f21969a);
        sb.append("' Shapes: ");
        sb.append(Arrays.toString(this.f21970b.toArray()));
        sb.append('}');
        return sb.toString();
    }
}
