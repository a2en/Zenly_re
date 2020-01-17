package com.facebook.imagepipeline.animated.base;

/* renamed from: com.facebook.imagepipeline.animated.base.a */
public class C9653a {

    /* renamed from: a */
    public final int f25212a;

    /* renamed from: b */
    public final int f25213b;

    /* renamed from: c */
    public final int f25214c;

    /* renamed from: d */
    public final int f25215d;

    /* renamed from: e */
    public final C9654a f25216e;

    /* renamed from: f */
    public final C9655b f25217f;

    /* renamed from: com.facebook.imagepipeline.animated.base.a$a */
    public enum C9654a {
        BLEND_WITH_PREVIOUS,
        NO_BLEND
    }

    /* renamed from: com.facebook.imagepipeline.animated.base.a$b */
    public enum C9655b {
        DISPOSE_DO_NOT,
        DISPOSE_TO_BACKGROUND,
        DISPOSE_TO_PREVIOUS
    }

    public C9653a(int i, int i2, int i3, int i4, int i5, C9654a aVar, C9655b bVar) {
        this.f25212a = i2;
        this.f25213b = i3;
        this.f25214c = i4;
        this.f25215d = i5;
        this.f25216e = aVar;
        this.f25217f = bVar;
    }
}
