package p250f.p251a.p252a.p253a.p255e;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C12932j;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* renamed from: f.a.a.a.e.c */
abstract class C7661c<T> implements ReadWriteProperty<Fragment, T> {

    /* renamed from: a */
    private final T f19292a;

    public C7661c(T t) {
        this.f19292a = t;
    }

    /* renamed from: a */
    public T getValue(Fragment fragment, KProperty<?> kProperty) {
        T t;
        C12932j.m33818b(fragment, "thisRef");
        C12932j.m33818b(kProperty, "property");
        Bundle arguments = fragment.getArguments();
        if (arguments == null || !arguments.containsKey(kProperty.getName())) {
            t = this.f19292a;
        } else {
            t = arguments.get(kProperty.getName());
        }
        if (t != null) {
            return t;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public abstract void mo19795a(Bundle bundle, String str, T t);

    public /* synthetic */ C7661c(Object obj, int i, C12928f fVar) {
        if ((i & 1) != 0) {
            obj = null;
        }
        this(obj);
    }

    /* renamed from: a */
    public void setValue(Fragment fragment, KProperty<?> kProperty, T t) {
        C12932j.m33818b(fragment, "thisRef");
        C12932j.m33818b(kProperty, "property");
        C12932j.m33818b(t, "value");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
            fragment.setArguments(arguments);
        }
        C12932j.m33815a((Object) arguments, "thisRef.arguments ?: Bun….arguments = it\n        }");
        mo19795a(arguments, kProperty.getName(), t);
    }
}
