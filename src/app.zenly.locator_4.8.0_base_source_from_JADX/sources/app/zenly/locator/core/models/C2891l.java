package app.zenly.locator.core.models;

import app.zenly.locator.core.models.C2898q.C2900b;
import app.zenly.locator.core.util.C3205g;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: app.zenly.locator.core.models.l */
public class C2891l {

    /* renamed from: a */
    private final int f8180a;

    /* renamed from: b */
    private final String[] f8181b;

    public C2891l(C2900b bVar) {
        this.f8180a = bVar.f8224a;
        ArrayList arrayList = new ArrayList(bVar.f8240l);
        Collections.sort(arrayList, C3205g.m10191b());
        this.f8181b = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.f8181b[i] = ((C2896p) arrayList.get(i)).f8198b.mo8942e();
        }
    }

    /* renamed from: a */
    public String[] mo8964a() {
        return this.f8181b;
    }

    /* renamed from: b */
    public int mo8965b() {
        return this.f8180a;
    }
}
