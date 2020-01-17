package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty1.Getter;

/* renamed from: kotlin.jvm.internal.r */
public abstract class C12940r extends C12942t implements KProperty1 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public KCallable mo37239b() {
        C12946x.m33839a(this);
        return this;
    }

    public Object getDelegate(Object obj) {
        return ((KProperty1) mo37243e()).getDelegate(obj);
    }

    public Object invoke(Object obj) {
        return get(obj);
    }

    public Getter getGetter() {
        return ((KProperty1) mo37243e()).getGetter();
    }
}
