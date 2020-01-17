package p389io.reactivex.p402j;

import java.util.concurrent.TimeUnit;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.internal.operators.observable.C12555d;
import p389io.reactivex.internal.operators.observable.C12664s0;
import p389io.reactivex.internal.operators.observable.C12679u0;
import p389io.reactivex.internal.operators.observable.ObservablePublishClassic;
import p389io.reactivex.internal.util.C12755e;
import p389io.reactivex.p393i.p394a.C12324b;
import p389io.reactivex.p403k.C12768a;
import p389io.reactivex.schedulers.C12802a;

/* renamed from: io.reactivex.j.a */
public abstract class C12767a<T> extends C12279e<T> {
    /* renamed from: t */
    private C12767a<T> m33382t() {
        return this instanceof ObservablePublishClassic ? C12768a.m33402a((C12767a<T>) new C12664s0<T>(((ObservablePublishClassic) this).publishSource())) : this;
    }

    /* renamed from: a */
    public final C12279e<T> mo36943a(int i, long j, TimeUnit timeUnit, C12286f fVar) {
        C12324b.m32833a(i, "subscriberCount");
        C12324b.m32836a(timeUnit, "unit is null");
        C12324b.m32836a(fVar, "scheduler is null");
        C12679u0 u0Var = new C12679u0(m33382t(), i, j, timeUnit, fVar);
        return C12768a.m33396a((C12279e<T>) u0Var);
    }

    /* renamed from: e */
    public abstract void mo36790e(Consumer<? super Disposable> consumer);

    /* renamed from: f */
    public final C12279e<T> mo36945f(int i) {
        return mo36943a(i, 0, TimeUnit.NANOSECONDS, C12802a.m33493d());
    }

    /* renamed from: r */
    public final Disposable mo36946r() {
        C12755e eVar = new C12755e();
        mo36790e(eVar);
        return eVar.f33265e;
    }

    /* renamed from: s */
    public C12279e<T> mo36947s() {
        return C12768a.m33396a((C12279e<T>) new C12679u0<T>(m33382t()));
    }

    /* renamed from: a */
    public C12279e<T> mo36944a(int i, Consumer<? super Disposable> consumer) {
        if (i > 0) {
            return C12768a.m33396a((C12279e<T>) new C12555d<T>(this, i, consumer));
        }
        mo36790e(consumer);
        return C12768a.m33402a(this);
    }
}
