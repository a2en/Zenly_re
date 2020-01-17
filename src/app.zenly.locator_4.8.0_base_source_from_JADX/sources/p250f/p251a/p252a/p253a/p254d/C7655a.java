package p250f.p251a.p252a.p253a.p254d;

import android.util.Property;
import kotlin.jvm.internal.C12932j;

/* renamed from: f.a.a.a.d.a */
public abstract class C7655a<T> extends Property<T, Float> {
    public C7655a(String str) {
        C12932j.m33818b(str, "name");
        super(Float.TYPE, str);
    }

    /* renamed from: a */
    public final void mo19789a(T t, float f) {
        mo6441b(t, f);
    }

    /* renamed from: b */
    public abstract void mo6441b(T t, float f);

    public /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        mo19789a(obj, ((Number) obj2).floatValue());
    }
}
