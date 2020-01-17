package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.C8515e;
import com.airbnb.lottie.animation.content.C8483k;
import com.airbnb.lottie.animation.content.Content;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.animatable.C8543b;
import com.airbnb.lottie.model.p284i.C8586a;

/* renamed from: com.airbnb.lottie.model.content.h */
public class C8567h implements ContentModel {

    /* renamed from: a */
    private final String f21936a;

    /* renamed from: b */
    private final C8568a f21937b;

    /* renamed from: c */
    private final C8543b f21938c;

    /* renamed from: d */
    private final AnimatableValue<PointF, PointF> f21939d;

    /* renamed from: e */
    private final C8543b f21940e;

    /* renamed from: f */
    private final C8543b f21941f;

    /* renamed from: g */
    private final C8543b f21942g;

    /* renamed from: h */
    private final C8543b f21943h;

    /* renamed from: i */
    private final C8543b f21944i;

    /* renamed from: j */
    private final boolean f21945j;

    /* renamed from: com.airbnb.lottie.model.content.h$a */
    public enum C8568a {
        STAR(1),
        POLYGON(2);
        

        /* renamed from: e */
        private final int f21949e;

        private C8568a(int i) {
            this.f21949e = i;
        }

        /* renamed from: a */
        public static C8568a m19855a(int i) {
            C8568a[] values;
            for (C8568a aVar : values()) {
                if (aVar.f21949e == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public C8567h(String str, C8568a aVar, C8543b bVar, AnimatableValue<PointF, PointF> animatableValue, C8543b bVar2, C8543b bVar3, C8543b bVar4, C8543b bVar5, C8543b bVar6, boolean z) {
        this.f21936a = str;
        this.f21937b = aVar;
        this.f21938c = bVar;
        this.f21939d = animatableValue;
        this.f21940e = bVar2;
        this.f21941f = bVar3;
        this.f21942g = bVar4;
        this.f21943h = bVar5;
        this.f21944i = bVar6;
        this.f21945j = z;
    }

    /* renamed from: a */
    public C8543b mo23102a() {
        return this.f21941f;
    }

    /* renamed from: b */
    public C8543b mo23103b() {
        return this.f21943h;
    }

    /* renamed from: c */
    public String mo23104c() {
        return this.f21936a;
    }

    /* renamed from: d */
    public C8543b mo23105d() {
        return this.f21942g;
    }

    /* renamed from: e */
    public C8543b mo23106e() {
        return this.f21944i;
    }

    /* renamed from: f */
    public C8543b mo23107f() {
        return this.f21938c;
    }

    /* renamed from: g */
    public AnimatableValue<PointF, PointF> mo23108g() {
        return this.f21939d;
    }

    /* renamed from: h */
    public C8543b mo23109h() {
        return this.f21940e;
    }

    /* renamed from: i */
    public C8568a mo23110i() {
        return this.f21937b;
    }

    /* renamed from: j */
    public boolean mo23111j() {
        return this.f21945j;
    }

    public Content toContent(C8515e eVar, C8586a aVar) {
        return new C8483k(eVar, aVar, this);
    }
}
