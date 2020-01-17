package app.zenly.locator.powermoves.p129d.p131e;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.powermoves.d.e.a */
public final class C5017a<A> extends LiveData<A> {

    /* renamed from: k */
    private Object f13055k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f13056l;

    /* renamed from: app.zenly.locator.powermoves.d.e.a$a */
    static final class C5018a<T> implements Observer<A> {

        /* renamed from: a */
        final /* synthetic */ C5017a f13057a;

        /* renamed from: b */
        final /* synthetic */ Observer f13058b;

        C5018a(C5017a aVar, Observer observer) {
            this.f13057a = aVar;
            this.f13058b = observer;
        }

        public final void onChanged(A a) {
            if (a != null && !this.f13057a.f13056l) {
                this.f13057a.f13056l = true;
                this.f13058b.onChanged(a);
            }
        }
    }

    /* renamed from: b */
    public final void mo12261b(LifecycleOwner lifecycleOwner, Observer<? super A> observer) {
        C12932j.m33818b(lifecycleOwner, "owner");
        C12932j.m33818b(observer, "observer");
        if (!mo4396b()) {
            mo4391a(lifecycleOwner, observer);
            return;
        }
        throw new RuntimeException("Only one active observer at a time may be subscribed");
    }

    /* renamed from: e */
    public final Object mo12263e() {
        return this.f13055k;
    }

    /* renamed from: a */
    public void mo4391a(LifecycleOwner lifecycleOwner, Observer<? super A> observer) {
        C12932j.m33818b(lifecycleOwner, "owner");
        C12932j.m33818b(observer, "observer");
        super.mo4391a(lifecycleOwner, new C5018a(this, observer));
    }

    /* renamed from: a */
    public static /* synthetic */ void m14384a(C5017a aVar, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 2) != 0) {
            obj2 = null;
        }
        aVar.mo12260a((A) obj, obj2);
    }

    /* renamed from: b */
    public static /* synthetic */ void m14387b(C5017a aVar, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 2) != 0) {
            obj2 = null;
        }
        aVar.mo12262b((A) obj, obj2);
    }

    /* renamed from: a */
    public final void mo12260a(A a, Object obj) {
        this.f13056l = false;
        mo4394a(a);
        this.f13055k = obj;
    }

    /* renamed from: b */
    public final void mo12262b(A a, Object obj) {
        this.f13056l = false;
        mo4395b(a);
        this.f13055k = obj;
    }
}
