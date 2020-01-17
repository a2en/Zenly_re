package p250f.p251a.p252a.p253a.p255e;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.C12932j;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* renamed from: f.a.a.a.e.f */
abstract class C7672f<T> implements ReadWriteProperty<Fragment, T> {

    /* renamed from: a */
    private final T f19293a;

    public C7672f(T t) {
        this.f19293a = t;
    }

    /* renamed from: a */
    public T getValue(Fragment fragment, KProperty<?> kProperty) {
        C12932j.m33818b(fragment, "thisRef");
        C12932j.m33818b(kProperty, "property");
        Bundle arguments = fragment.getArguments();
        if (arguments == null || !arguments.containsKey(kProperty.getName())) {
            return this.f19293a;
        }
        return arguments.get(kProperty.getName());
    }

    /* renamed from: a */
    public abstract void mo19804a(Bundle bundle, String str, T t);

    /* renamed from: a */
    public void setValue(Fragment fragment, KProperty<?> kProperty, T t) {
        C12932j.m33818b(fragment, "thisRef");
        C12932j.m33818b(kProperty, "property");
        Bundle arguments = fragment.getArguments();
        if (arguments == null) {
            arguments = new Bundle();
            fragment.setArguments(arguments);
        }
        C12932j.m33815a((Object) arguments, "thisRef.arguments ?: Bun….arguments = it\n        }");
        mo19804a(arguments, kProperty.getName(), t);
    }
}
