package app.zenly.android.feature.descendants.feedback;

import app.zenly.android.feature.descendants.Time;
import app.zenly.android.feature.descendants.feedback.DescendantsPrefs.C1379a;
import app.zenly.android.feature.descendants.model.C1389a;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.C7710c;

/* renamed from: app.zenly.android.feature.descendants.feedback.b */
public final class C1381b {

    /* renamed from: a */
    private final DescendantsPrefs f5035a;

    /* renamed from: b */
    private final Time f5036b;

    public C1381b(DescendantsPrefs descendantsPrefs, Time time) {
        C12932j.m33818b(descendantsPrefs, "descendantsPrefs");
        C12932j.m33818b(time, "time");
        this.f5035a = descendantsPrefs;
        this.f5036b = time;
    }

    /* renamed from: b */
    private final int m6429b(C1379a aVar, int i, boolean z) {
        int a = aVar.mo6638a();
        int b = aVar.mo6640b();
        if (a >= 0 && (a < 0 || i != a)) {
            int a2 = C7710c.m18765a(b, 10);
            if (z) {
                b = C7710c.m18769d(a2, 1);
            } else {
                b = C7710c.m18765a(a2, 1);
            }
            if (C1389a.m6433a(Math.max(0, a), i)) {
                b = C7710c.m18765a(b, 4);
            }
            this.f5035a.setHintFlags(b);
        }
        return b;
    }

    /* renamed from: a */
    public final boolean mo6647a(C1379a aVar, int i, boolean z) {
        C12932j.m33818b(aVar, "allPrefs");
        int a = aVar.mo6638a();
        boolean z2 = false;
        if (a >= 0 && i < a) {
            return false;
        }
        m6428a(i, m6429b(aVar, i, z));
        m6427a(a);
        if (i != a) {
            z2 = true;
        }
        if (z2) {
            this.f5035a.setCount(i, a);
        }
        return z2;
    }

    /* renamed from: a */
    private final void m6428a(int i, int i2) {
        if (!C7710c.m18767b(i2, 4)) {
            this.f5035a.setLastSeenLevelThreshold(C1389a.m6434b(i));
        }
    }

    /* renamed from: a */
    private final void m6427a(int i) {
        if (i < 0) {
            this.f5035a.setNewDescendantsLastSeenDate(this.f5036b.now());
        }
    }
}
