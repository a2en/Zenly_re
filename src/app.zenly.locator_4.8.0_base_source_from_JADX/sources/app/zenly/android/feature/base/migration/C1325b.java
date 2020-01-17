package app.zenly.android.feature.base.migration;

import java.util.Arrays;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.android.feature.base.migration.b */
public final class C1325b<T> {

    /* renamed from: a */
    private final C1326c<T> f4932a;

    public C1325b(C1326c<T> cVar) {
        C12932j.m33818b(cVar, "migrationSet");
        this.f4932a = cVar;
    }

    /* renamed from: a */
    public final void mo6518a(T t, int i, int i2) {
        for (C1324a a : this.f4932a.mo6519a(i, i2)) {
            a.mo6516a(t);
        }
    }

    public C1325b(C1324a<T>... aVarArr) {
        C12932j.m33818b(aVarArr, "migrations");
        this(new C1326c<>((C1324a[]) Arrays.copyOf(aVarArr, aVarArr.length)));
    }
}
