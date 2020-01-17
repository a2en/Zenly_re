package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.C0661n;
import androidx.core.view.C0665o;
import androidx.core.view.ViewPropertyAnimatorListener;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.appcompat.view.f */
public class C0150f {

    /* renamed from: a */
    final ArrayList<C0661n> f502a = new ArrayList<>();

    /* renamed from: b */
    private long f503b = -1;

    /* renamed from: c */
    private Interpolator f504c;

    /* renamed from: d */
    ViewPropertyAnimatorListener f505d;

    /* renamed from: e */
    private boolean f506e;

    /* renamed from: f */
    private final C0665o f507f = new C0151a();

    /* renamed from: androidx.appcompat.view.f$a */
    class C0151a extends C0665o {

        /* renamed from: a */
        private boolean f508a = false;

        /* renamed from: b */
        private int f509b = 0;

        C0151a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo658a() {
            this.f509b = 0;
            this.f508a = false;
            C0150f.this.mo656b();
        }

        public void onAnimationEnd(View view) {
            int i = this.f509b + 1;
            this.f509b = i;
            if (i == C0150f.this.f502a.size()) {
                ViewPropertyAnimatorListener viewPropertyAnimatorListener = C0150f.this.f505d;
                if (viewPropertyAnimatorListener != null) {
                    viewPropertyAnimatorListener.onAnimationEnd(null);
                }
                mo658a();
            }
        }

        public void onAnimationStart(View view) {
            if (!this.f508a) {
                this.f508a = true;
                ViewPropertyAnimatorListener viewPropertyAnimatorListener = C0150f.this.f505d;
                if (viewPropertyAnimatorListener != null) {
                    viewPropertyAnimatorListener.onAnimationStart(null);
                }
            }
        }
    }

    /* renamed from: a */
    public C0150f mo653a(C0661n nVar) {
        if (!this.f506e) {
            this.f502a.add(nVar);
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo656b() {
        this.f506e = false;
    }

    /* renamed from: c */
    public void mo657c() {
        if (!this.f506e) {
            Iterator it = this.f502a.iterator();
            while (it.hasNext()) {
                C0661n nVar = (C0661n) it.next();
                long j = this.f503b;
                if (j >= 0) {
                    nVar.mo3428a(j);
                }
                Interpolator interpolator = this.f504c;
                if (interpolator != null) {
                    nVar.mo3429a(interpolator);
                }
                if (this.f505d != null) {
                    nVar.mo3430a((ViewPropertyAnimatorListener) this.f507f);
                }
                nVar.mo3437c();
            }
            this.f506e = true;
        }
    }

    /* renamed from: a */
    public C0150f mo654a(C0661n nVar, C0661n nVar2) {
        this.f502a.add(nVar);
        nVar2.mo3435b(nVar.mo3433b());
        this.f502a.add(nVar2);
        return this;
    }

    /* renamed from: a */
    public void mo655a() {
        if (this.f506e) {
            Iterator it = this.f502a.iterator();
            while (it.hasNext()) {
                ((C0661n) it.next()).mo3432a();
            }
            this.f506e = false;
        }
    }

    /* renamed from: a */
    public C0150f mo650a(long j) {
        if (!this.f506e) {
            this.f503b = j;
        }
        return this;
    }

    /* renamed from: a */
    public C0150f mo651a(Interpolator interpolator) {
        if (!this.f506e) {
            this.f504c = interpolator;
        }
        return this;
    }

    /* renamed from: a */
    public C0150f mo652a(ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (!this.f506e) {
            this.f505d = viewPropertyAnimatorListener;
        }
        return this;
    }
}
