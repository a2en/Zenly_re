package androidx.lifecycle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: androidx.lifecycle.w */
public class C0891w {

    /* renamed from: a */
    private final HashMap<String, C0889u> f3512a = new HashMap<>();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo4502a(String str, C0889u uVar) {
        C0889u uVar2 = (C0889u) this.f3512a.put(str, uVar);
        if (uVar2 != null) {
            uVar2.mo4269b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Set<String> mo4503b() {
        return new HashSet(this.f3512a.keySet());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C0889u mo4500a(String str) {
        return (C0889u) this.f3512a.get(str);
    }

    /* renamed from: a */
    public final void mo4501a() {
        for (C0889u a : this.f3512a.values()) {
            a.mo4499a();
        }
        this.f3512a.clear();
    }
}
