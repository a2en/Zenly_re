package app.zenly.locator.dashboard;

import com.snap.p327ui.recycling.ObservableSectionController;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.C12932j;
import p333g.p378f.p380b.p381a.C12119a;

/* renamed from: app.zenly.locator.dashboard.j */
public final class C3313j {

    /* renamed from: a */
    private final C12119a f9216a = new C12119a();

    /* renamed from: b */
    private final ConcurrentHashMap<ObservableSectionController, String> f9217b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private final AtomicLong f9218c = new AtomicLong();

    /* renamed from: a */
    public final long mo9815a(ObservableSectionController observableSectionController, String str) {
        C12932j.m33818b(observableSectionController, "section");
        C12932j.m33818b(str, "key");
        String str2 = (String) this.f9217b.get(observableSectionController);
        if (str2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("section-");
            sb.append(this.f9218c.incrementAndGet());
            sb.append('#');
            str2 = sb.toString();
            String str3 = (String) this.f9217b.putIfAbsent(observableSectionController, str2);
            if (str3 != null) {
                str2 = str3;
            }
        }
        C12119a aVar = this.f9216a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(str);
        return aVar.mo35844a(sb2.toString());
    }
}
