package com.airbnb.lottie.model.content;

import com.airbnb.lottie.C8515e;
import com.airbnb.lottie.animation.content.C8489p;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.animatable.C8543b;
import com.airbnb.lottie.model.p284i.C8586a;

/* renamed from: com.airbnb.lottie.model.content.p */
public class C8579p implements ContentModel {

    /* renamed from: a */
    private final String f21996a;

    /* renamed from: b */
    private final C8580a f21997b;

    /* renamed from: c */
    private final C8543b f21998c;

    /* renamed from: d */
    private final C8543b f21999d;

    /* renamed from: e */
    private final C8543b f22000e;

    /* renamed from: f */
    private final boolean f22001f;

    /* renamed from: com.airbnb.lottie.model.content.p$a */
    public enum C8580a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        /* renamed from: a */
        public static C8580a m19900a(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown trim path type ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public C8579p(String str, C8580a aVar, C8543b bVar, C8543b bVar2, C8543b bVar3, boolean z) {
        this.f21996a = str;
        this.f21997b = aVar;
        this.f21998c = bVar;
        this.f21999d = bVar2;
        this.f22000e = bVar3;
        this.f22001f = z;
    }

    /* renamed from: a */
    public C8543b mo23154a() {
        return this.f21999d;
    }

    /* renamed from: b */
    public String mo23155b() {
        return this.f21996a;
    }

    /* renamed from: c */
    public C8543b mo23156c() {
        return this.f22000e;
    }

    /* renamed from: d */
    public C8543b mo23157d() {
        return this.f21998c;
    }

    /* renamed from: e */
    public C8580a mo23158e() {
        return this.f21997b;
    }

    /* renamed from: f */
    public boolean mo23159f() {
        return this.f22001f;
    }

    public Content toContent(C8515e eVar, C8586a aVar) {
        return new C8489p(aVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trim Path: {start: ");
        sb.append(this.f21998c);
        sb.append(", end: ");
        sb.append(this.f21999d);
        sb.append(", offset: ");
        sb.append(this.f22000e);
        sb.append("}");
        return sb.toString();
    }
}
