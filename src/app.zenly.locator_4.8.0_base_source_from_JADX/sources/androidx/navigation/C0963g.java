package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.C0862g;
import androidx.lifecycle.C0862g.C0863a;
import androidx.lifecycle.C0862g.C0864b;
import androidx.lifecycle.C0869k;
import androidx.lifecycle.C0886s;
import androidx.lifecycle.C0891w;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.C1161a;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import java.util.UUID;

/* renamed from: androidx.navigation.g */
public final class C0963g implements LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner {

    /* renamed from: e */
    private final Context f3685e;

    /* renamed from: f */
    private final C0969j f3686f;

    /* renamed from: g */
    private final Bundle f3687g;

    /* renamed from: h */
    private final C0869k f3688h;

    /* renamed from: i */
    private final C1161a f3689i;

    /* renamed from: j */
    final UUID f3690j;

    /* renamed from: k */
    private C0864b f3691k;

    /* renamed from: l */
    private C0864b f3692l;

    /* renamed from: m */
    private C0965h f3693m;

    /* renamed from: n */
    private Factory f3694n;

    /* renamed from: androidx.navigation.g$a */
    static /* synthetic */ class C0964a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3695a = new int[C0863a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                androidx.lifecycle.g$a[] r0 = androidx.lifecycle.C0862g.C0863a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3695a = r0
                int[] r0 = f3695a     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.lifecycle.g$a r1 = androidx.lifecycle.C0862g.C0863a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f3695a     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.lifecycle.g$a r1 = androidx.lifecycle.C0862g.C0863a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f3695a     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.lifecycle.g$a r1 = androidx.lifecycle.C0862g.C0863a.ON_START     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f3695a     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.lifecycle.g$a r1 = androidx.lifecycle.C0862g.C0863a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f3695a     // Catch:{ NoSuchFieldError -> 0x0040 }
                androidx.lifecycle.g$a r1 = androidx.lifecycle.C0862g.C0863a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f3695a     // Catch:{ NoSuchFieldError -> 0x004b }
                androidx.lifecycle.g$a r1 = androidx.lifecycle.C0862g.C0863a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f3695a     // Catch:{ NoSuchFieldError -> 0x0056 }
                androidx.lifecycle.g$a r1 = androidx.lifecycle.C0862g.C0863a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.C0963g.C0964a.<clinit>():void");
        }
    }

    C0963g(Context context, C0969j jVar, Bundle bundle, LifecycleOwner lifecycleOwner, C0965h hVar) {
        this(context, jVar, bundle, lifecycleOwner, hVar, UUID.randomUUID(), null);
    }

    /* renamed from: d */
    private void m4305d() {
        if (this.f3691k.ordinal() < this.f3692l.ordinal()) {
            this.f3688h.mo4451a(this.f3691k);
        } else {
            this.f3688h.mo4451a(this.f3692l);
        }
    }

    /* renamed from: a */
    public Bundle mo4706a() {
        return this.f3687g;
    }

    /* renamed from: b */
    public C0969j mo4710b() {
        return this.f3686f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C0864b mo4711c() {
        return this.f3692l;
    }

    public Factory getDefaultViewModelProviderFactory() {
        if (this.f3694n == null) {
            this.f3694n = new C0886s((Application) this.f3685e.getApplicationContext(), this, this.f3687g);
        }
        return this.f3694n;
    }

    public C0862g getLifecycle() {
        return this.f3688h;
    }

    public SavedStateRegistry getSavedStateRegistry() {
        return this.f3689i.mo5831a();
    }

    public C0891w getViewModelStore() {
        C0965h hVar = this.f3693m;
        if (hVar != null) {
            return hVar.mo4713b(this.f3690j);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    /* renamed from: b */
    private static C0864b m4304b(C0863a aVar) {
        switch (C0964a.f3695a[aVar.ordinal()]) {
            case 1:
            case 2:
                return C0864b.CREATED;
            case 3:
            case 4:
                return C0864b.STARTED;
            case 5:
                return C0864b.RESUMED;
            case 6:
                return C0864b.DESTROYED;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected event value ");
                sb.append(aVar);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4709a(C0864b bVar) {
        this.f3692l = bVar;
        m4305d();
    }

    C0963g(Context context, C0969j jVar, Bundle bundle, LifecycleOwner lifecycleOwner, C0965h hVar, UUID uuid, Bundle bundle2) {
        this.f3688h = new C0869k(this);
        this.f3689i = C1161a.m5683a((SavedStateRegistryOwner) this);
        this.f3691k = C0864b.CREATED;
        this.f3692l = C0864b.RESUMED;
        this.f3685e = context;
        this.f3690j = uuid;
        this.f3686f = jVar;
        this.f3687g = bundle;
        this.f3693m = hVar;
        this.f3689i.mo5832a(bundle2);
        if (lifecycleOwner != null) {
            this.f3691k = lifecycleOwner.getLifecycle().mo4445a();
        }
        m4305d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4708a(C0863a aVar) {
        this.f3691k = m4304b(aVar);
        m4305d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4707a(Bundle bundle) {
        this.f3689i.mo5833b(bundle);
    }
}
