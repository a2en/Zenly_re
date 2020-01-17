package p250f.p251a.p252a.p253a.p259h;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* renamed from: f.a.a.a.h.b */
final class C7681b<T> implements ReadWriteProperty<Object, T> {

    /* renamed from: a */
    private final ThreadLocal<T> f19308a;

    /* renamed from: f.a.a.a.h.b$a */
    public static final class C7682a extends ThreadLocal<T> {

        /* renamed from: a */
        final /* synthetic */ Function0 f19309a;

        C7682a(Function0 function0) {
            this.f19309a = function0;
        }

        /* access modifiers changed from: protected */
        public T initialValue() {
            return this.f19309a.invoke();
        }
    }

    public C7681b(Function0<? extends T> function0) {
        C12932j.m33818b(function0, "initializer");
        this.f19308a = new C7682a(function0);
    }

    public T getValue(Object obj, KProperty<?> kProperty) {
        C12932j.m33818b(kProperty, "property");
        T t = this.f19308a.get();
        if (t != null) {
            return t;
        }
        C12932j.m33814a();
        throw null;
    }

    public void setValue(Object obj, KProperty<?> kProperty, T t) {
        C12932j.m33818b(kProperty, "property");
        this.f19308a.set(t);
    }
}
