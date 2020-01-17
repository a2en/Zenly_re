package androidx.navigation;

import android.os.Bundle;

/* renamed from: androidx.navigation.c */
public final class C0950c {

    /* renamed from: a */
    private final int f3654a;

    /* renamed from: b */
    private C0976o f3655b;

    /* renamed from: c */
    private Bundle f3656c;

    public C0950c(int i) {
        this(i, null);
    }

    /* renamed from: a */
    public void mo4679a(C0976o oVar) {
        this.f3655b = oVar;
    }

    /* renamed from: b */
    public int mo4680b() {
        return this.f3654a;
    }

    /* renamed from: c */
    public C0976o mo4681c() {
        return this.f3655b;
    }

    public C0950c(int i, C0976o oVar) {
        this(i, oVar, null);
    }

    /* renamed from: a */
    public Bundle mo4677a() {
        return this.f3656c;
    }

    public C0950c(int i, C0976o oVar, Bundle bundle) {
        this.f3654a = i;
        this.f3655b = oVar;
        this.f3656c = bundle;
    }

    /* renamed from: a */
    public void mo4678a(Bundle bundle) {
        this.f3656c = bundle;
    }
}
