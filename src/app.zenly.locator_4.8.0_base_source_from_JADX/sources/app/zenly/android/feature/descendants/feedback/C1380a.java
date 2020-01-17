package app.zenly.android.feature.descendants.feedback;

import app.zenly.android.feature.descendants.Time;
import app.zenly.android.feature.descendants.feedback.DescendantsPrefs.C1379a;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.C7710c;

/* renamed from: app.zenly.android.feature.descendants.feedback.a */
public final class C1380a {

    /* renamed from: a */
    private final DescendantsPrefs f5033a;

    /* renamed from: b */
    private final Time f5034b;

    public C1380a(DescendantsPrefs descendantsPrefs, Time time) {
        C12932j.m33818b(descendantsPrefs, "descendantsPrefs");
        C12932j.m33818b(time, "time");
        this.f5033a = descendantsPrefs;
        this.f5034b = time;
    }

    /* renamed from: a */
    public final boolean mo6646a(C1379a aVar, int i) {
        C12932j.m33818b(aVar, "allPrefs");
        int d = C7710c.m18769d(aVar.mo6640b(), i);
        boolean z = aVar.mo6640b() != d;
        if (z) {
            this.f5033a.setHintFlags(d);
            if (C7710c.m18767b(i, 8)) {
                this.f5033a.setNewDescendantsLastSeenDate(this.f5034b.now());
            }
        }
        return z;
    }
}
