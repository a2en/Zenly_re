package com.google.android.material.circularreveal;

import android.animation.TypeEvaluator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.Property;
import p333g.p357d.p358a.p361b.p363m.C12087a;

public interface CircularRevealWidget extends C10763a {

    /* renamed from: com.google.android.material.circularreveal.CircularRevealWidget$b */
    public static class C10756b implements TypeEvaluator<C10759e> {

        /* renamed from: b */
        public static final TypeEvaluator<C10759e> f28014b = new C10756b();

        /* renamed from: a */
        private final C10759e f28015a = new C10759e();

        /* renamed from: a */
        public C10759e evaluate(float f, C10759e eVar, C10759e eVar2) {
            this.f28015a.mo31026a(C12087a.m31899a(eVar.f28018a, eVar2.f28018a, f), C12087a.m31899a(eVar.f28019b, eVar2.f28019b, f), C12087a.m31899a(eVar.f28020c, eVar2.f28020c, f));
            return this.f28015a;
        }
    }

    /* renamed from: com.google.android.material.circularreveal.CircularRevealWidget$c */
    public static class C10757c extends Property<CircularRevealWidget, C10759e> {

        /* renamed from: a */
        public static final Property<CircularRevealWidget, C10759e> f28016a = new C10757c("circularReveal");

        private C10757c(String str) {
            super(C10759e.class, str);
        }

        /* renamed from: a */
        public C10759e get(CircularRevealWidget circularRevealWidget) {
            return circularRevealWidget.getRevealInfo();
        }

        /* renamed from: a */
        public void set(CircularRevealWidget circularRevealWidget, C10759e eVar) {
            circularRevealWidget.setRevealInfo(eVar);
        }
    }

    /* renamed from: com.google.android.material.circularreveal.CircularRevealWidget$d */
    public static class C10758d extends Property<CircularRevealWidget, Integer> {

        /* renamed from: a */
        public static final Property<CircularRevealWidget, Integer> f28017a = new C10758d("circularRevealScrimColor");

        private C10758d(String str) {
            super(Integer.class, str);
        }

        /* renamed from: a */
        public Integer get(CircularRevealWidget circularRevealWidget) {
            return Integer.valueOf(circularRevealWidget.getCircularRevealScrimColor());
        }

        /* renamed from: a */
        public void set(CircularRevealWidget circularRevealWidget, Integer num) {
            circularRevealWidget.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* renamed from: com.google.android.material.circularreveal.CircularRevealWidget$e */
    public static class C10759e {

        /* renamed from: a */
        public float f28018a;

        /* renamed from: b */
        public float f28019b;

        /* renamed from: c */
        public float f28020c;

        /* renamed from: a */
        public void mo31026a(float f, float f2, float f3) {
            this.f28018a = f;
            this.f28019b = f2;
            this.f28020c = f3;
        }

        private C10759e() {
        }

        public C10759e(float f, float f2, float f3) {
            this.f28018a = f;
            this.f28019b = f2;
            this.f28020c = f3;
        }
    }

    void buildCircularRevealCache();

    void destroyCircularRevealCache();

    void draw(Canvas canvas);

    Drawable getCircularRevealOverlayDrawable();

    int getCircularRevealScrimColor();

    C10759e getRevealInfo();

    boolean isOpaque();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C10759e eVar);
}
