package androidx.navigation;

import androidx.lifecycle.C0889u;
import androidx.lifecycle.C0891w;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import java.util.HashMap;
import java.util.Iterator;
import java.util.UUID;

/* renamed from: androidx.navigation.h */
class C0965h extends C0889u {

    /* renamed from: d */
    private static final Factory f3696d = new C0966a();

    /* renamed from: c */
    private final HashMap<UUID, C0891w> f3697c = new HashMap<>();

    /* renamed from: androidx.navigation.h$a */
    static class C0966a implements Factory {
        C0966a() {
        }

        public <T extends C0889u> T create(Class<T> cls) {
            return new C0965h();
        }
    }

    C0965h() {
    }

    /* renamed from: a */
    static C0965h m4312a(C0891w wVar) {
        return (C0965h) new ViewModelProvider(wVar, f3696d).mo4415a(C0965h.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4269b() {
        for (C0891w a : this.f3697c.values()) {
            a.mo4501a();
        }
        this.f3697c.clear();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.f3697c.keySet().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4712a(UUID uuid) {
        C0891w wVar = (C0891w) this.f3697c.remove(uuid);
        if (wVar != null) {
            wVar.mo4501a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0891w mo4713b(UUID uuid) {
        C0891w wVar = (C0891w) this.f3697c.get(uuid);
        if (wVar != null) {
            return wVar;
        }
        C0891w wVar2 = new C0891w();
        this.f3697c.put(uuid, wVar2);
        return wVar2;
    }
}
