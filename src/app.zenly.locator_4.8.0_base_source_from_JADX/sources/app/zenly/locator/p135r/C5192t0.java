package app.zenly.locator.p135r;

import androidx.paging.C1033j;
import androidx.paging.C1033j.C1035b;
import androidx.paging.C1033j.C1037d;
import androidx.paging.C1033j.C1038e;
import androidx.paging.C1033j.C1040g;
import app.zenly.locator.p135r.p137b1.C5138a;
import app.zenly.locator.p143s.p148l.C5448c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.C7339i;
import p213co.znly.models.core.C7144l1;

/* renamed from: app.zenly.locator.r.t0 */
public class C5192t0 extends C1033j<C5138a> {

    /* renamed from: c */
    private final ZenlyCore f13411c = C5448c.m15478a();

    /* renamed from: a */
    private List<C5138a> m14724a(int i, int i2) {
        C7144l1 contactsRange = this.f13411c.contactsRange(i, i2);
        if (contactsRange == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(contactsRange.getContactsCount());
        for (C7339i a : contactsRange.getContactsList()) {
            arrayList.add(C5138a.m14651a(a));
        }
        return arrayList;
    }

    /* renamed from: e */
    private int m14725e() {
        return this.f13411c.contactsCount();
    }

    /* renamed from: a */
    public void mo4906a(C1037d dVar, C1035b<C5138a> bVar) {
        bVar.mo4911a(m14724a(dVar.f3878a, dVar.f3879b), dVar.f3878a, m14725e());
    }

    /* renamed from: a */
    public void mo4907a(C1040g gVar, C1038e<C5138a> eVar) {
        eVar.mo4912a(m14724a(gVar.f3883a, gVar.f3884b));
    }
}
