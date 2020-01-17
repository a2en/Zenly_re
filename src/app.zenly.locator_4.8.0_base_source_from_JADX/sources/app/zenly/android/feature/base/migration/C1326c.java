package app.zenly.android.feature.base.migration;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import kotlin.ranges.C12960c;
import p214e.p228e.C7585h;

/* renamed from: app.zenly.android.feature.base.migration.c */
public final class C1326c<T> {

    /* renamed from: a */
    private final C7585h<C7585h<C1324a<T>>> f4933a = new C7585h<>();

    public C1326c(C1324a<T>... aVarArr) {
        C12932j.m33818b(aVarArr, "defaultMigrations");
        for (C1324a<T> a : aVarArr) {
            m6336a(a);
        }
    }

    /* renamed from: a */
    private final void m6336a(C1324a<T> aVar) {
        int b = aVar.mo6517b();
        int a = aVar.mo6515a();
        C7585h hVar = (C7585h) this.f4933a.mo19617a(b);
        if (hVar == null) {
            hVar = new C7585h();
            this.f4933a.mo19622c(b, hVar);
        }
        C12932j.m33815a((Object) hVar, "migrations[start] ?: Spa….put(start, it)\n        }");
        if (((C1324a) hVar.mo19617a(a)) == null) {
            hVar.mo19618a(a, aVar);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Migration (");
        sb.append(aVar.mo6517b());
        sb.append(" > ");
        sb.append(aVar.mo6515a());
        sb.append(") ");
        sb.append("already added");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final List<C1324a<T>> mo6519a(int i, int i2) {
        if (i == i2) {
            return C12848o.m33640a();
        }
        boolean z = i2 > i;
        ArrayList arrayList = new ArrayList();
        m6335a(arrayList, z, i, i2);
        return arrayList;
    }

    /* renamed from: a */
    private final ArrayList<C1324a<T>> m6335a(ArrayList<C1324a<T>> arrayList, boolean z, int i, int i2) {
        boolean z2;
        do {
            z2 = false;
            if (!(!z ? i > i2 : i < i2)) {
                return arrayList;
            }
            C7585h hVar = (C7585h) this.f4933a.mo19617a(i);
            if (hVar != null) {
                int a = hVar.mo19615a();
                C12960c c = z ? C12973l.m33893c(a - 1, 0) : C12973l.m33894d(0, a);
                int first = c.getFirst();
                int last = c.getLast();
                int a2 = c.mo37336a();
                if (a2 >= 0) {
                    if (first > last) {
                        continue;
                    }
                } else if (first < last) {
                    continue;
                }
                boolean z3 = false;
                while (true) {
                    int c2 = hVar.mo19621c(first);
                    if (!z ? !(c2 < i2 || c2 >= i) : !(c2 > i2 || c2 <= i)) {
                        arrayList.add(hVar.mo19627f(first));
                        i = c2;
                        z3 = true;
                    }
                    if (first == last) {
                        break;
                    }
                    first += a2;
                }
                z2 = z3;
                continue;
            } else {
                throw new MissingMigrationException();
            }
        } while (z2);
        throw new MissingMigrationException();
    }
}
