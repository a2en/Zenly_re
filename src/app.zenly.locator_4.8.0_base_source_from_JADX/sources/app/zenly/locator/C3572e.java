package app.zenly.locator;

import android.content.Context;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.e */
public class C3572e<T> {

    /* renamed from: e */
    private T f9616e;

    /* renamed from: a */
    public void mo10038a(Context context, T t) {
        C12932j.m33818b(context, "context");
        this.f9616e = t;
    }

    /* renamed from: b */
    public final T mo10039b() {
        T t = this.f9616e;
        if (t != null) {
            return t;
        }
        C12932j.m33814a();
        throw null;
    }

    /* renamed from: a */
    public void mo10037a() {
        this.f9616e = null;
    }
}
