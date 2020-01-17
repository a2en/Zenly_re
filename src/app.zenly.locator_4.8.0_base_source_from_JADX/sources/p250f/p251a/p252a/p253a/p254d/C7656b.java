package p250f.p251a.p252a.p253a.p254d;

import android.util.Property;
import kotlin.jvm.internal.C12932j;

/* renamed from: f.a.a.a.d.b */
public abstract class C7656b<T> extends Property<T, Integer> {
    public C7656b(String str) {
        C12932j.m33818b(str, "name");
        super(Integer.TYPE, str);
    }

    /* renamed from: a */
    public final void mo19791a(T t, int i) {
        mo6445b(t, i);
    }

    /* renamed from: b */
    public abstract void mo6445b(T t, int i);

    public /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        mo19791a(obj, ((Number) obj2).intValue());
    }
}
