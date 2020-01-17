package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty0.Getter;

/* renamed from: kotlin.jvm.internal.p */
public abstract class C12938p extends C12942t implements KProperty0 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public KCallable mo37239b() {
        C12946x.m33838a(this);
        return this;
    }

    public Object getDelegate() {
        return ((KProperty0) mo37243e()).getDelegate();
    }

    public Object invoke() {
        return get();
    }

    public Getter getGetter() {
        return ((KProperty0) mo37243e()).getGetter();
    }
}
