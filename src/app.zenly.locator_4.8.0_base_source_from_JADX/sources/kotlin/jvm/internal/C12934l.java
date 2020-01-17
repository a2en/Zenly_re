package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KMutableProperty1.Setter;
import kotlin.reflect.KProperty1.Getter;

/* renamed from: kotlin.jvm.internal.l */
public abstract class C12934l extends C12936n implements KMutableProperty1 {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public KCallable mo37239b() {
        C12946x.m33837a(this);
        return this;
    }

    public Object getDelegate(Object obj) {
        return ((KMutableProperty1) mo37243e()).getDelegate(obj);
    }

    public Object invoke(Object obj) {
        return get(obj);
    }

    public Getter getGetter() {
        return ((KMutableProperty1) mo37243e()).getGetter();
    }

    public Setter getSetter() {
        return ((KMutableProperty1) mo37243e()).getSetter();
    }
}
