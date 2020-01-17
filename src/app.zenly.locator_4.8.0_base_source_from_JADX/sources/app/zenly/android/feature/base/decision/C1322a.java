package app.zenly.android.feature.base.decision;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.android.feature.base.decision.a */
public final class C1322a {

    /* renamed from: a */
    private final Map<String, C1323b> f4927a = new HashMap();

    /* renamed from: a */
    public final boolean mo6511a(String str) {
        C12932j.m33818b(str, "featureKey");
        C1323b bVar = (C1323b) this.f4927a.get(str);
        if (bVar != null) {
            return bVar.mo6513b();
        }
        return false;
    }

    /* renamed from: a */
    public final void mo6510a(C1323b... bVarArr) {
        C12932j.m33818b(bVarArr, "features");
        int length = bVarArr.length;
        int i = 0;
        while (i < length) {
            C1323b bVar = bVarArr[i];
            String a = bVar.mo6512a();
            if (!this.f4927a.containsKey(a)) {
                this.f4927a.put(a, bVar);
                i++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Can't have two features with same key ");
                sb.append(a);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }
}
