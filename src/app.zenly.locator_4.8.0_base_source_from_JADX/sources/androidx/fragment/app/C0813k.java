package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.C0889u;
import androidx.lifecycle.C0891w;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProvider.Factory;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: androidx.fragment.app.k */
final class C0813k extends C0889u {

    /* renamed from: i */
    private static final Factory f3289i = new C0814a();

    /* renamed from: c */
    private final HashMap<String, Fragment> f3290c = new HashMap<>();

    /* renamed from: d */
    private final HashMap<String, C0813k> f3291d = new HashMap<>();

    /* renamed from: e */
    private final HashMap<String, C0891w> f3292e = new HashMap<>();

    /* renamed from: f */
    private final boolean f3293f;

    /* renamed from: g */
    private boolean f3294g = false;

    /* renamed from: h */
    private boolean f3295h = false;

    /* renamed from: androidx.fragment.app.k$a */
    static class C0814a implements Factory {
        C0814a() {
        }

        public <T extends C0889u> T create(Class<T> cls) {
            return new C0813k(true);
        }
    }

    C0813k(boolean z) {
        this.f3293f = z;
    }

    /* renamed from: a */
    static C0813k m3819a(C0891w wVar) {
        return (C0813k) new ViewModelProvider(wVar, f3289i).mo4415a(C0813k.class);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4269b() {
        if (FragmentManager.m3606d(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("onCleared called for ");
            sb.append(this);
            Log.d("FragmentManager", sb.toString());
        }
        this.f3294g = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Collection<Fragment> mo4272c() {
        return this.f3290c.values();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo4274d() {
        return this.f3294g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo4275e(Fragment fragment) {
        return this.f3290c.remove(fragment.mWho) != null;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C0813k.class != obj.getClass()) {
            return false;
        }
        C0813k kVar = (C0813k) obj;
        if (!this.f3290c.equals(kVar.f3290c) || !this.f3291d.equals(kVar.f3291d) || !this.f3292e.equals(kVar.f3292e)) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public boolean mo4277f(Fragment fragment) {
        if (!this.f3290c.containsKey(fragment.mWho)) {
            return true;
        }
        if (this.f3293f) {
            return this.f3294g;
        }
        return !this.f3295h;
    }

    public int hashCode() {
        return (((this.f3290c.hashCode() * 31) + this.f3291d.hashCode()) * 31) + this.f3292e.hashCode();
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f3290c.values().iterator();
        while (true) {
            str = ", ";
            if (!it.hasNext()) {
                break;
            }
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(str);
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f3291d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(str);
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f3292e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(str);
            }
        }
        sb.append(')');
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C0813k mo4271c(Fragment fragment) {
        C0813k kVar = (C0813k) this.f3291d.get(fragment.mWho);
        if (kVar != null) {
            return kVar;
        }
        C0813k kVar2 = new C0813k(this.f3293f);
        this.f3291d.put(fragment.mWho, kVar2);
        return kVar2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C0891w mo4273d(Fragment fragment) {
        C0891w wVar = (C0891w) this.f3292e.get(fragment.mWho);
        if (wVar != null) {
            return wVar;
        }
        C0891w wVar2 = new C0891w();
        this.f3292e.put(fragment.mWho, wVar2);
        return wVar2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4267a(Fragment fragment) {
        if (this.f3290c.containsKey(fragment.mWho)) {
            return false;
        }
        this.f3290c.put(fragment.mWho, fragment);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Fragment mo4268b(String str) {
        return (Fragment) this.f3290c.get(str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4270b(Fragment fragment) {
        if (FragmentManager.m3606d(3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Clearing non-config state for ");
            sb.append(fragment);
            Log.d("FragmentManager", sb.toString());
        }
        C0813k kVar = (C0813k) this.f3291d.get(fragment.mWho);
        if (kVar != null) {
            kVar.mo4269b();
            this.f3291d.remove(fragment.mWho);
        }
        C0891w wVar = (C0891w) this.f3292e.get(fragment.mWho);
        if (wVar != null) {
            wVar.mo4501a();
            this.f3292e.remove(fragment.mWho);
        }
    }
}
