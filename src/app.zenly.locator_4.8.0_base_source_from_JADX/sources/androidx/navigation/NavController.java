package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.C0088b;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.app.TaskStackBuilder;
import androidx.lifecycle.C0862g.C0863a;
import androidx.lifecycle.C0862g.C0864b;
import androidx.lifecycle.C0891w;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.C0976o.C0977a;
import androidx.navigation.Navigator.Extras;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArrayList;

public class NavController {

    /* renamed from: a */
    private final Context f3630a;

    /* renamed from: b */
    private Activity f3631b;

    /* renamed from: c */
    private C0975n f3632c;

    /* renamed from: d */
    C0971k f3633d;

    /* renamed from: e */
    private Bundle f3634e;

    /* renamed from: f */
    private Parcelable[] f3635f;

    /* renamed from: g */
    private boolean f3636g;

    /* renamed from: h */
    final Deque<C0963g> f3637h = new ArrayDeque();

    /* renamed from: i */
    private LifecycleOwner f3638i;

    /* renamed from: j */
    private C0965h f3639j;

    /* renamed from: k */
    private final C0996r f3640k = new C0996r();

    /* renamed from: l */
    private final CopyOnWriteArrayList<OnDestinationChangedListener> f3641l = new CopyOnWriteArrayList<>();

    /* renamed from: m */
    private final LifecycleObserver f3642m = new LifecycleEventObserver() {
        public void onStateChanged(LifecycleOwner lifecycleOwner, C0863a aVar) {
            NavController navController = NavController.this;
            if (navController.f3633d != null) {
                for (C0963g a : navController.f3637h) {
                    a.mo4708a(aVar);
                }
            }
        }
    };

    /* renamed from: n */
    private final C0088b f3643n = new C0944a(false);

    /* renamed from: o */
    private boolean f3644o = true;

    public interface OnDestinationChangedListener {
        void onDestinationChanged(NavController navController, C0969j jVar, Bundle bundle);
    }

    /* renamed from: androidx.navigation.NavController$a */
    class C0944a extends C0088b {
        C0944a(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public void mo285a() {
            NavController.this.mo4647d();
        }
    }

    public NavController(Context context) {
        this.f3630a = context;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            } else if (context instanceof Activity) {
                this.f3631b = (Activity) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        C0996r rVar = this.f3640k;
        rVar.mo4796a((Navigator<? extends C0969j>) new C0973l<Object>(rVar));
        this.f3640k.mo4796a((Navigator<? extends C0969j>) new C0947b<Object>(this.f3630a));
    }

    /* renamed from: f */
    private boolean m4212f() {
        while (!this.f3637h.isEmpty() && (((C0963g) this.f3637h.peekLast()).mo4710b() instanceof C0971k)) {
            if (!mo4645b(((C0963g) this.f3637h.peekLast()).mo4710b().mo4734d(), true)) {
                break;
            }
        }
        if (this.f3637h.isEmpty()) {
            return false;
        }
        C0969j b = ((C0963g) this.f3637h.peekLast()).mo4710b();
        C0969j jVar = null;
        if (b instanceof FloatingWindow) {
            Iterator descendingIterator = this.f3637h.descendingIterator();
            while (true) {
                if (!descendingIterator.hasNext()) {
                    break;
                }
                C0969j b2 = ((C0963g) descendingIterator.next()).mo4710b();
                if (!(b2 instanceof C0971k) && !(b2 instanceof FloatingWindow)) {
                    jVar = b2;
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();
        Iterator descendingIterator2 = this.f3637h.descendingIterator();
        while (descendingIterator2.hasNext()) {
            C0963g gVar = (C0963g) descendingIterator2.next();
            C0864b c = gVar.mo4711c();
            C0969j b3 = gVar.mo4710b();
            if (b != null && b3.mo4734d() == b.mo4734d()) {
                C0864b bVar = C0864b.RESUMED;
                if (c != bVar) {
                    hashMap.put(gVar, bVar);
                }
                b = b.mo4736f();
            } else if (jVar == null || b3.mo4734d() != jVar.mo4734d()) {
                gVar.mo4709a(C0864b.CREATED);
            } else {
                if (c == C0864b.RESUMED) {
                    gVar.mo4709a(C0864b.STARTED);
                } else {
                    C0864b bVar2 = C0864b.STARTED;
                    if (c != bVar2) {
                        hashMap.put(gVar, bVar2);
                    }
                }
                jVar = jVar.mo4736f();
            }
        }
        for (C0963g gVar2 : this.f3637h) {
            C0864b bVar3 = (C0864b) hashMap.get(gVar2);
            if (bVar3 != null) {
                gVar2.mo4709a(bVar3);
            }
        }
        C0963g gVar3 = (C0963g) this.f3637h.peekLast();
        Iterator it = this.f3641l.iterator();
        while (it.hasNext()) {
            ((OnDestinationChangedListener) it.next()).onDestinationChanged(this, gVar3.mo4710b(), gVar3.mo4706a());
        }
        return true;
    }

    /* renamed from: g */
    private int m4213g() {
        int i = 0;
        for (C0963g b : this.f3637h) {
            if (!(b.mo4710b() instanceof C0971k)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: h */
    private void m4214h() {
        C0088b bVar = this.f3643n;
        boolean z = true;
        if (!this.f3644o || m4213g() <= 1) {
            z = false;
        }
        bVar.mo287a(z);
    }

    /* renamed from: a */
    public boolean mo4641a(int i, boolean z) {
        return mo4645b(i, z) && m4212f();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo4645b(int i, boolean z) {
        boolean z2;
        boolean z3 = false;
        if (this.f3637h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator descendingIterator = this.f3637h.descendingIterator();
        while (true) {
            if (!descendingIterator.hasNext()) {
                z2 = false;
                break;
            }
            C0969j b = ((C0963g) descendingIterator.next()).mo4710b();
            Navigator a = this.f3640k.mo4797a(b.mo4735e());
            if (z || b.mo4734d() != i) {
                arrayList.add(a);
            }
            if (b.mo4734d() == i) {
                z2 = true;
                break;
            }
        }
        if (!z2) {
            String a2 = C0969j.m4325a(this.f3630a, i);
            StringBuilder sb = new StringBuilder();
            sb.append("Ignoring popBackStack to destination ");
            sb.append(a2);
            sb.append(" as it was not found on the current back stack");
            Log.i("NavController", sb.toString());
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext() && ((Navigator) it.next()).mo4657c()) {
            C0963g gVar = (C0963g) this.f3637h.removeLast();
            gVar.mo4709a(C0864b.DESTROYED);
            C0965h hVar = this.f3639j;
            if (hVar != null) {
                hVar.mo4712a(gVar.f3690j);
            }
            z3 = true;
        }
        m4214h();
        return z3;
    }

    /* renamed from: c */
    public C0996r mo4646c() {
        return this.f3640k;
    }

    /* renamed from: d */
    public boolean mo4647d() {
        if (this.f3637h.isEmpty()) {
            return false;
        }
        return mo4641a(mo4629a().mo4734d(), true);
    }

    /* renamed from: e */
    public Bundle mo4648e() {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = new Bundle();
        for (Entry entry : this.f3640k.mo4799a().entrySet()) {
            String str = (String) entry.getKey();
            Bundle b = ((Navigator) entry.getValue()).mo4656b();
            if (b != null) {
                arrayList.add(str);
                bundle2.putBundle(str, b);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        } else {
            bundle = null;
        }
        if (!this.f3637h.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.f3637h.size()];
            int i = 0;
            for (C0963g navBackStackEntryState : this.f3637h) {
                int i2 = i + 1;
                parcelableArr[i] = new NavBackStackEntryState(navBackStackEntryState);
                i = i2;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (this.f3636g) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.f3636g);
        }
        return bundle;
    }

    /* renamed from: a */
    public void mo4631a(int i, Bundle bundle) {
        mo4639a(mo4643b().mo4752a(i), bundle);
    }

    /* renamed from: a */
    public void mo4639a(C0971k kVar, Bundle bundle) {
        C0971k kVar2 = this.f3633d;
        if (kVar2 != null) {
            mo4645b(kVar2.mo4734d(), true);
        }
        this.f3633d = kVar;
        m4211b(bundle);
    }

    /* renamed from: a */
    public boolean mo4642a(Intent intent) {
        C0971k kVar;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        int[] intArray = extras != null ? extras.getIntArray("android-support-nav:controller:deepLinkIds") : null;
        Bundle bundle = new Bundle();
        Bundle bundle2 = extras != null ? extras.getBundle("android-support-nav:controller:deepLinkExtras") : null;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        if ((intArray == null || intArray.length == 0) && intent.getData() != null) {
            C0970a a = this.f3633d.mo4724a(intent.getData());
            if (a != null) {
                intArray = a.mo4738a().mo4730a();
                bundle.putAll(a.mo4739b());
            }
        }
        if (intArray == null || intArray.length == 0) {
            return false;
        }
        String a2 = m4209a(intArray);
        if (a2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Could not find destination ");
            sb.append(a2);
            sb.append(" in the navigation graph, ignoring the deep link from ");
            sb.append(intent);
            Log.i("NavController", sb.toString());
            return false;
        }
        bundle.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
        int flags = intent.getFlags();
        int i = 268435456 & flags;
        if (i == 0 || (flags & 32768) != 0) {
            String str = "unknown destination during deep link: ";
            if (i != 0) {
                if (!this.f3637h.isEmpty()) {
                    mo4645b(this.f3633d.mo4734d(), true);
                }
                int i2 = 0;
                while (i2 < intArray.length) {
                    int i3 = i2 + 1;
                    int i4 = intArray[i2];
                    C0969j a3 = mo4630a(i4);
                    if (a3 != null) {
                        C0977a aVar = new C0977a();
                        aVar.mo4760a(0);
                        aVar.mo4764b(0);
                        m4210a(a3, bundle, aVar.mo4763a(), (Extras) null);
                        i2 = i3;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(C0969j.m4325a(this.f3630a, i4));
                        throw new IllegalStateException(sb2.toString());
                    }
                }
                return true;
            }
            C0971k kVar2 = this.f3633d;
            int i5 = 0;
            while (i5 < intArray.length) {
                int i6 = intArray[i5];
                C0969j c = i5 == 0 ? this.f3633d : kVar2.mo4743c(i6);
                if (c != null) {
                    if (i5 != intArray.length - 1) {
                        while (true) {
                            kVar = (C0971k) c;
                            if (!(kVar.mo4743c(kVar.mo4746i()) instanceof C0971k)) {
                                break;
                            }
                            c = kVar.mo4743c(kVar.mo4746i());
                        }
                        kVar2 = kVar;
                    } else {
                        Bundle a4 = c.mo4722a(bundle);
                        C0977a aVar2 = new C0977a();
                        aVar2.mo4761a(this.f3633d.mo4734d(), true);
                        aVar2.mo4760a(0);
                        aVar2.mo4764b(0);
                        m4210a(c, a4, aVar2.mo4763a(), (Extras) null);
                    }
                    i5++;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(C0969j.m4325a(this.f3630a, i6));
                    throw new IllegalStateException(sb3.toString());
                }
            }
            this.f3636g = true;
            return true;
        }
        intent.addFlags(32768);
        TaskStackBuilder a5 = TaskStackBuilder.m2443a(this.f3630a);
        a5.mo3026b(intent);
        a5.mo3024a();
        Activity activity = this.f3631b;
        if (activity != null) {
            activity.finish();
            this.f3631b.overridePendingTransition(0, 0);
        }
        return true;
    }

    /* renamed from: b */
    public C0975n mo4643b() {
        if (this.f3632c == null) {
            this.f3632c = new C0975n(this.f3630a, this.f3640k);
        }
        return this.f3632c;
    }

    /* renamed from: b */
    public void mo4644b(int i) {
        mo4631a(i, (Bundle) null);
    }

    /* renamed from: b */
    private void m4211b(Bundle bundle) {
        Bundle bundle2 = this.f3634e;
        if (bundle2 != null) {
            ArrayList stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names");
            if (stringArrayList != null) {
                Iterator it = stringArrayList.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    Navigator a = this.f3640k.mo4797a(str);
                    Bundle bundle3 = this.f3634e.getBundle(str);
                    if (bundle3 != null) {
                        a.mo4655a(bundle3);
                    }
                }
            }
        }
        Parcelable[] parcelableArr = this.f3635f;
        boolean z = false;
        if (parcelableArr != null) {
            int length = parcelableArr.length;
            int i = 0;
            while (i < length) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelableArr[i];
                C0969j a2 = mo4630a(navBackStackEntryState.mo4622b());
                if (a2 != null) {
                    Bundle a3 = navBackStackEntryState.mo4621a();
                    if (a3 != null) {
                        a3.setClassLoader(this.f3630a.getClassLoader());
                    }
                    C0963g gVar = new C0963g(this.f3630a, a2, a3, this.f3638i, this.f3639j, navBackStackEntryState.mo4624d(), navBackStackEntryState.mo4623c());
                    this.f3637h.add(gVar);
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unknown destination during restore: ");
                    sb.append(this.f3630a.getResources().getResourceName(navBackStackEntryState.mo4622b()));
                    throw new IllegalStateException(sb.toString());
                }
            }
            m4214h();
            this.f3635f = null;
        }
        if (this.f3633d != null && this.f3637h.isEmpty()) {
            if (!this.f3636g) {
                Activity activity = this.f3631b;
                if (activity != null && mo4642a(activity.getIntent())) {
                    z = true;
                }
            }
            if (!z) {
                m4210a((C0969j) this.f3633d, bundle, (C0976o) null, (Extras) null);
            }
        }
    }

    /* renamed from: a */
    private String m4209a(int[] iArr) {
        C0971k kVar;
        C0971k kVar2 = this.f3633d;
        int i = 0;
        while (i < iArr.length) {
            int i2 = iArr[i];
            C0969j c = i == 0 ? this.f3633d : kVar2.mo4743c(i2);
            if (c == null) {
                return C0969j.m4325a(this.f3630a, i2);
            }
            if (i != iArr.length - 1) {
                while (true) {
                    kVar = (C0971k) c;
                    if (!(kVar.mo4743c(kVar.mo4746i()) instanceof C0971k)) {
                        break;
                    }
                    c = kVar.mo4743c(kVar.mo4746i());
                }
                kVar2 = kVar;
            }
            i++;
        }
        return null;
    }

    /* renamed from: a */
    public C0969j mo4629a() {
        if (this.f3637h.isEmpty()) {
            return null;
        }
        return ((C0963g) this.f3637h.getLast()).mo4710b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0969j mo4630a(int i) {
        C0969j jVar;
        C0971k kVar;
        C0971k kVar2 = this.f3633d;
        if (kVar2 == null) {
            return null;
        }
        if (kVar2.mo4734d() == i) {
            return this.f3633d;
        }
        if (this.f3637h.isEmpty()) {
            jVar = this.f3633d;
        } else {
            jVar = ((C0963g) this.f3637h.getLast()).mo4710b();
        }
        if (jVar instanceof C0971k) {
            kVar = (C0971k) jVar;
        } else {
            kVar = jVar.mo4736f();
        }
        return kVar.mo4743c(i);
    }

    /* renamed from: a */
    public void mo4632a(int i, Bundle bundle, C0976o oVar) {
        mo4633a(i, bundle, oVar, (Extras) null);
    }

    /* renamed from: a */
    public void mo4633a(int i, Bundle bundle, C0976o oVar, Extras extras) {
        C0969j jVar;
        int i2;
        String str;
        if (this.f3637h.isEmpty()) {
            jVar = this.f3633d;
        } else {
            jVar = ((C0963g) this.f3637h.getLast()).mo4710b();
        }
        if (jVar != null) {
            C0950c a = jVar.mo4723a(i);
            Bundle bundle2 = null;
            if (a != null) {
                if (oVar == null) {
                    oVar = a.mo4681c();
                }
                i2 = a.mo4680b();
                Bundle a2 = a.mo4677a();
                if (a2 != null) {
                    bundle2 = new Bundle();
                    bundle2.putAll(a2);
                }
            } else {
                i2 = i;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putAll(bundle);
            }
            if (i2 == 0 && oVar != null && oVar.mo4757e() != -1) {
                mo4641a(oVar.mo4757e(), oVar.mo4758f());
            } else if (i2 != 0) {
                C0969j a3 = mo4630a(i2);
                if (a3 == null) {
                    String a4 = C0969j.m4325a(this.f3630a, i2);
                    StringBuilder sb = new StringBuilder();
                    sb.append("navigation destination ");
                    sb.append(a4);
                    if (a != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(" referenced from action ");
                        sb2.append(C0969j.m4325a(this.f3630a, i));
                        str = sb2.toString();
                    } else {
                        str = "";
                    }
                    sb.append(str);
                    sb.append(" is unknown to this NavController");
                    throw new IllegalArgumentException(sb.toString());
                }
                m4210a(a3, bundle2, oVar, extras);
            } else {
                throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo");
            }
        } else {
            throw new IllegalStateException("no current navigation node");
        }
    }

    /* renamed from: a */
    private void m4210a(C0969j jVar, Bundle bundle, C0976o oVar, Extras extras) {
        boolean b = (oVar == null || oVar.mo4757e() == -1) ? false : mo4645b(oVar.mo4757e(), oVar.mo4758f());
        Navigator a = this.f3640k.mo4797a(jVar.mo4735e());
        Bundle a2 = jVar.mo4722a(bundle);
        C0969j a3 = a.mo4654a(jVar, a2, oVar, extras);
        if (a3 != null) {
            if (!(a3 instanceof FloatingWindow)) {
                while (!this.f3637h.isEmpty() && (((C0963g) this.f3637h.peekLast()).mo4710b() instanceof FloatingWindow)) {
                    if (!mo4645b(((C0963g) this.f3637h.peekLast()).mo4710b().mo4734d(), true)) {
                        break;
                    }
                }
            }
            if (this.f3637h.isEmpty()) {
                C0963g gVar = new C0963g(this.f3630a, this.f3633d, a2, this.f3638i, this.f3639j);
                this.f3637h.add(gVar);
            }
            ArrayDeque arrayDeque = new ArrayDeque();
            C0969j jVar2 = a3;
            while (jVar2 != null && mo4630a(jVar2.mo4734d()) == null) {
                jVar2 = jVar2.mo4736f();
                if (jVar2 != null) {
                    C0963g gVar2 = new C0963g(this.f3630a, jVar2, a2, this.f3638i, this.f3639j);
                    arrayDeque.addFirst(gVar2);
                }
            }
            this.f3637h.addAll(arrayDeque);
            C0963g gVar3 = new C0963g(this.f3630a, a3, a3.mo4722a(a2), this.f3638i, this.f3639j);
            this.f3637h.add(gVar3);
        }
        m4214h();
        if (b || a3 != null) {
            m4212f();
        }
    }

    /* renamed from: a */
    public void mo4638a(NavDirections navDirections, C0976o oVar) {
        mo4632a(navDirections.getActionId(), navDirections.getArguments(), oVar);
    }

    /* renamed from: a */
    public void mo4634a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(this.f3630a.getClassLoader());
            this.f3634e = bundle.getBundle("android-support-nav:controller:navigatorState");
            this.f3635f = bundle.getParcelableArray("android-support-nav:controller:backStack");
            this.f3636g = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4636a(LifecycleOwner lifecycleOwner) {
        this.f3638i = lifecycleOwner;
        this.f3638i.getLifecycle().mo4446a(this.f3642m);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4635a(OnBackPressedDispatcher onBackPressedDispatcher) {
        if (this.f3638i != null) {
            this.f3643n.mo290c();
            onBackPressedDispatcher.mo283a(this.f3638i, this.f3643n);
            return;
        }
        throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4640a(boolean z) {
        this.f3644o = z;
        m4214h();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4637a(C0891w wVar) {
        if (this.f3637h.isEmpty()) {
            this.f3639j = C0965h.m4312a(wVar);
            return;
        }
        throw new IllegalStateException("ViewModelStore should be set before setGraph call");
    }
}
