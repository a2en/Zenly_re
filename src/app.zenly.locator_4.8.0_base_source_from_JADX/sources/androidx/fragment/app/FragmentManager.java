package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.C0088b;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.p004os.CancellationSignal;
import androidx.core.util.C0601c;
import androidx.fragment.app.Fragment.SavedState;
import androidx.lifecycle.C0862g.C0864b;
import androidx.lifecycle.C0891w;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p214e.p228e.C7573b;
import p214e.p243k.C7640b;

public abstract class FragmentManager {

    /* renamed from: G */
    private static boolean f3175G = false;

    /* renamed from: A */
    private ArrayList<C0793a> f3176A;

    /* renamed from: B */
    private ArrayList<Boolean> f3177B;

    /* renamed from: C */
    private ArrayList<Fragment> f3178C;

    /* renamed from: D */
    private ArrayList<C0789i> f3179D;

    /* renamed from: E */
    private C0813k f3180E;

    /* renamed from: F */
    private Runnable f3181F = new C0784d();

    /* renamed from: a */
    private final ArrayList<C0787g> f3182a = new ArrayList<>();

    /* renamed from: b */
    private boolean f3183b;

    /* renamed from: c */
    final ArrayList<Fragment> f3184c = new ArrayList<>();

    /* renamed from: d */
    final HashMap<String, C0816m> f3185d = new HashMap<>();

    /* renamed from: e */
    ArrayList<C0793a> f3186e;

    /* renamed from: f */
    private ArrayList<Fragment> f3187f;

    /* renamed from: g */
    private final C0809h f3188g = new C0809h(this);

    /* renamed from: h */
    private OnBackPressedDispatcher f3189h;

    /* renamed from: i */
    private final C0088b f3190i = new C0781a(false);

    /* renamed from: j */
    private final AtomicInteger f3191j = new AtomicInteger();

    /* renamed from: k */
    private ArrayList<OnBackStackChangedListener> f3192k;

    /* renamed from: l */
    private HashMap<Fragment, HashSet<CancellationSignal>> f3193l = new HashMap<>();

    /* renamed from: m */
    private final C0828g f3194m = new C0782b();

    /* renamed from: n */
    private final C0810i f3195n = new C0810i(this);

    /* renamed from: o */
    int f3196o = -1;

    /* renamed from: p */
    C0808g<?> f3197p;

    /* renamed from: q */
    C0805d f3198q;

    /* renamed from: r */
    private Fragment f3199r;

    /* renamed from: s */
    Fragment f3200s;

    /* renamed from: t */
    private C0807f f3201t = null;

    /* renamed from: u */
    private C0807f f3202u = new C0783c();

    /* renamed from: v */
    private boolean f3203v;

    /* renamed from: w */
    private boolean f3204w;

    /* renamed from: x */
    private boolean f3205x;

    /* renamed from: y */
    private boolean f3206y;

    /* renamed from: z */
    private boolean f3207z;

    public interface BackStackEntry {
        @Deprecated
        CharSequence getBreadCrumbShortTitle();

        @Deprecated
        int getBreadCrumbShortTitleRes();

        @Deprecated
        CharSequence getBreadCrumbTitle();

        @Deprecated
        int getBreadCrumbTitleRes();

        int getId();

        String getName();
    }

    public interface OnBackStackChangedListener {
        void onBackStackChanged();
    }

    /* renamed from: androidx.fragment.app.FragmentManager$a */
    class C0781a extends C0088b {
        C0781a(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public void mo285a() {
            FragmentManager.this.mo4128v();
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$b */
    class C0782b implements C0828g {
        C0782b() {
        }

        /* renamed from: a */
        public void mo4140a(Fragment fragment, CancellationSignal cancellationSignal) {
            if (!cancellationSignal.mo3157b()) {
                FragmentManager.this.mo4086b(fragment, cancellationSignal);
            }
        }

        /* renamed from: b */
        public void mo4141b(Fragment fragment, CancellationSignal cancellationSignal) {
            FragmentManager.this.mo4069a(fragment, cancellationSignal);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$c */
    class C0783c extends C0807f {
        C0783c() {
        }

        /* renamed from: a */
        public Fragment mo4142a(ClassLoader classLoader, String str) {
            C0808g<?> gVar = FragmentManager.this.f3197p;
            return gVar.mo4223a(gVar.mo4249c(), str, null);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$d */
    class C0784d implements Runnable {
        C0784d() {
        }

        public void run() {
            FragmentManager.this.mo4095c(true);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$e */
    class C0785e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3212a;

        /* renamed from: b */
        final /* synthetic */ View f3213b;

        /* renamed from: c */
        final /* synthetic */ Fragment f3214c;

        C0785e(FragmentManager fragmentManager, ViewGroup viewGroup, View view, Fragment fragment) {
            this.f3212a = viewGroup;
            this.f3213b = view;
            this.f3214c = fragment;
        }

        public void onAnimationEnd(Animator animator) {
            this.f3212a.endViewTransition(this.f3213b);
            animator.removeListener(this);
            Fragment fragment = this.f3214c;
            View view = fragment.mView;
            if (view != null && fragment.mHidden) {
                view.setVisibility(8);
            }
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$f */
    public static abstract class C0786f {
        /* renamed from: a */
        public abstract void mo4145a(FragmentManager fragmentManager, Fragment fragment);

        /* renamed from: a */
        public abstract void mo4146a(FragmentManager fragmentManager, Fragment fragment, Context context);

        /* renamed from: a */
        public abstract void mo4147a(FragmentManager fragmentManager, Fragment fragment, Bundle bundle);

        /* renamed from: a */
        public abstract void mo4148a(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle);

        /* renamed from: b */
        public abstract void mo4149b(FragmentManager fragmentManager, Fragment fragment);

        /* renamed from: b */
        public abstract void mo4150b(FragmentManager fragmentManager, Fragment fragment, Context context);

        /* renamed from: b */
        public abstract void mo4151b(FragmentManager fragmentManager, Fragment fragment, Bundle bundle);

        /* renamed from: c */
        public abstract void mo4152c(FragmentManager fragmentManager, Fragment fragment);

        /* renamed from: c */
        public abstract void mo4153c(FragmentManager fragmentManager, Fragment fragment, Bundle bundle);

        /* renamed from: d */
        public abstract void mo4154d(FragmentManager fragmentManager, Fragment fragment);

        /* renamed from: d */
        public abstract void mo4155d(FragmentManager fragmentManager, Fragment fragment, Bundle bundle);

        /* renamed from: e */
        public abstract void mo4156e(FragmentManager fragmentManager, Fragment fragment);

        /* renamed from: f */
        public abstract void mo4157f(FragmentManager fragmentManager, Fragment fragment);

        /* renamed from: g */
        public abstract void mo4158g(FragmentManager fragmentManager, Fragment fragment);
    }

    /* renamed from: androidx.fragment.app.FragmentManager$g */
    interface C0787g {
        /* renamed from: a */
        boolean mo4159a(ArrayList<C0793a> arrayList, ArrayList<Boolean> arrayList2);
    }

    /* renamed from: androidx.fragment.app.FragmentManager$h */
    private class C0788h implements C0787g {

        /* renamed from: a */
        final String f3215a;

        /* renamed from: b */
        final int f3216b;

        /* renamed from: c */
        final int f3217c;

        C0788h(String str, int i, int i2) {
            this.f3215a = str;
            this.f3216b = i;
            this.f3217c = i2;
        }

        /* renamed from: a */
        public boolean mo4159a(ArrayList<C0793a> arrayList, ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f3200s;
            if (fragment != null && this.f3216b < 0 && this.f3215a == null && fragment.getChildFragmentManager().mo4132z()) {
                return false;
            }
            return FragmentManager.this.mo4082a(arrayList, arrayList2, this.f3215a, this.f3216b, this.f3217c);
        }
    }

    /* renamed from: androidx.fragment.app.FragmentManager$i */
    static class C0789i implements C0779e {

        /* renamed from: a */
        final boolean f3219a;

        /* renamed from: b */
        final C0793a f3220b;

        /* renamed from: c */
        private int f3221c;

        C0789i(C0793a aVar, boolean z) {
            this.f3219a = z;
            this.f3220b = aVar;
        }

        /* renamed from: a */
        public void mo3995a() {
            this.f3221c++;
        }

        /* renamed from: b */
        public void mo3996b() {
            this.f3221c--;
            if (this.f3221c == 0) {
                this.f3220b.f3241r.mo4056B();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo4160c() {
            C0793a aVar = this.f3220b;
            aVar.f3241r.mo4075a(aVar, this.f3219a, false, false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo4161d() {
            boolean z = this.f3221c > 0;
            FragmentManager fragmentManager = this.f3220b.f3241r;
            int size = fragmentManager.f3184c.size();
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) fragmentManager.f3184c.get(i);
                fragment.setOnStartEnterTransitionListener(null);
                if (z && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            C0793a aVar = this.f3220b;
            aVar.f3241r.mo4075a(aVar, this.f3219a, !z, true);
        }

        /* renamed from: e */
        public boolean mo4162e() {
            return this.f3221c == 0;
        }
    }

    /* renamed from: C */
    private void m3584C() {
        this.f3185d.values().removeAll(Collections.singleton(null));
    }

    /* renamed from: D */
    private void m3585D() {
        if (mo4130x()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    /* renamed from: E */
    private void m3586E() {
        this.f3183b = false;
        this.f3177B.clear();
        this.f3176A.clear();
    }

    /* renamed from: F */
    private void m3587F() {
        if (this.f3207z) {
            this.f3207z = false;
            m3591J();
        }
    }

    /* renamed from: G */
    private void m3588G() {
        for (C0816m mVar : this.f3185d.values()) {
            if (mVar != null) {
                Fragment f = mVar.mo4300f();
                if (this.f3193l.get(f) != null) {
                    m3608q(f);
                    mo4068a(f, f.getStateAfterAnimating());
                }
            }
        }
    }

    /* renamed from: H */
    private void m3589H() {
        if (this.f3179D != null) {
            while (!this.f3179D.isEmpty()) {
                ((C0789i) this.f3179D.remove(0)).mo4161d();
            }
        }
    }

    /* renamed from: I */
    private void m3590I() {
        if (this.f3192k != null) {
            for (int i = 0; i < this.f3192k.size(); i++) {
                ((OnBackStackChangedListener) this.f3192k.get(i)).onBackStackChanged();
            }
        }
    }

    /* renamed from: J */
    private void m3591J() {
        for (C0816m mVar : this.f3185d.values()) {
            if (mVar != null) {
                mo4111k(mVar.mo4300f());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (mo4118o() <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (mo4103g(r3.f3199r) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.mo287a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r3.f3190i;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m3592K() {
        /*
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$g> r0 = r3.f3182a
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$g> r1 = r3.f3182a     // Catch:{ all -> 0x002a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != 0) goto L_0x0013
            androidx.activity.b r1 = r3.f3190i     // Catch:{ all -> 0x002a }
            r1.mo287a(r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            androidx.activity.b r0 = r3.f3190i
            int r1 = r3.mo4118o()
            if (r1 <= 0) goto L_0x0025
            androidx.fragment.app.Fragment r1 = r3.f3199r
            boolean r1 = r3.mo4103g(r1)
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r0.mo287a(r2)
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.m3592K():void");
    }

    /* renamed from: a */
    private void m3596a(RuntimeException runtimeException) {
        String str = "FragmentManager";
        Log.e(str, runtimeException.getMessage());
        Log.e(str, "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0601c(str));
        C0808g<?> gVar = this.f3197p;
        String str2 = "Failed dumping state";
        String str3 = "  ";
        if (gVar != null) {
            try {
                gVar.mo4033a(str3, (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e(str, str2, e);
            }
        } else {
            try {
                mo4078a(str3, (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e(str, str2, e2);
            }
        }
        throw runtimeException;
    }

    /* renamed from: d */
    static boolean m3606d(int i) {
        return f3175G || Log.isLoggable("FragmentManager", i);
    }

    /* renamed from: e */
    static int m3607e(int i) {
        if (i == 4097) {
            return 8194;
        }
        if (i != 4099) {
            return i != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    /* renamed from: r */
    private void m3609r(Fragment fragment) {
        if (fragment.mView != null) {
            C0803d a = C0798c.m3756a(this.f3197p.mo4249c(), this.f3198q, fragment, !fragment.mHidden);
            if (a != null) {
                Animator animator = a.f3272b;
                if (animator != null) {
                    animator.setTarget(fragment.mView);
                    if (!fragment.mHidden) {
                        fragment.mView.setVisibility(0);
                    } else if (fragment.isHideReplaced()) {
                        fragment.setHideReplaced(false);
                    } else {
                        ViewGroup viewGroup = fragment.mContainer;
                        View view = fragment.mView;
                        viewGroup.startViewTransition(view);
                        a.f3272b.addListener(new C0785e(this, viewGroup, view, fragment));
                    }
                    a.f3272b.start();
                }
            }
            if (a != null) {
                fragment.mView.startAnimation(a.f3271a);
                a.f3271a.start();
            }
            fragment.mView.setVisibility((!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8);
            if (fragment.isHideReplaced()) {
                fragment.setHideReplaced(false);
            }
        }
        if (fragment.mAdded && m3615x(fragment)) {
            this.f3203v = true;
        }
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    /* renamed from: s */
    private void m3610s(Fragment fragment) {
        fragment.performDestroyView();
        this.f3195n.mo4266g(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.mo4395b(null);
        fragment.mInLayout = false;
    }

    /* renamed from: u */
    private Fragment m3612u(Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        View view = fragment.mView;
        if (!(viewGroup == null || view == null)) {
            for (int indexOf = this.f3184c.indexOf(fragment) - 1; indexOf >= 0; indexOf--) {
                Fragment fragment2 = (Fragment) this.f3184c.get(indexOf);
                if (fragment2.mContainer == viewGroup && fragment2.mView != null) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    /* renamed from: y */
    private void m3616y(Fragment fragment) {
        if (mo4060a(fragment.mWho) != null) {
            if (m3606d(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Removed fragment from active set ");
                sb.append(fragment);
                Log.v("FragmentManager", sb.toString());
            }
            for (C0816m mVar : this.f3185d.values()) {
                if (mVar != null) {
                    Fragment f = mVar.mo4300f();
                    if (fragment.mWho.equals(f.mTargetWho)) {
                        f.mTarget = fragment;
                        f.mTargetWho = null;
                    }
                }
            }
            this.f3185d.put(fragment.mWho, null);
            mo4115m(fragment);
            String str = fragment.mTargetWho;
            if (str != null) {
                fragment.mTarget = mo4060a(str);
            }
            fragment.initState();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: A */
    public Parcelable mo4055A() {
        ArrayList<String> arrayList;
        m3589H();
        m3588G();
        mo4095c(true);
        this.f3204w = true;
        BackStackState[] backStackStateArr = null;
        if (this.f3185d.isEmpty()) {
            return null;
        }
        ArrayList<FragmentState> arrayList2 = new ArrayList<>(this.f3185d.size());
        Iterator it = this.f3185d.values().iterator();
        boolean z = false;
        while (true) {
            String str = ": ";
            String str2 = " was removed from the FragmentManager";
            String str3 = "Failure saving state: active ";
            String str4 = "FragmentManager";
            if (it.hasNext()) {
                C0816m mVar = (C0816m) it.next();
                if (mVar != null) {
                    Fragment f = mVar.mo4300f();
                    if (f.mFragmentManager == this) {
                        FragmentState k = mVar.mo4305k();
                        arrayList2.add(k);
                        if (m3606d(2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Saved state of ");
                            sb.append(f);
                            sb.append(str);
                            sb.append(k.f3239q);
                            Log.v(str4, sb.toString());
                        }
                        z = true;
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str3);
                        sb2.append(f);
                        sb2.append(str2);
                        m3596a((RuntimeException) new IllegalStateException(sb2.toString()));
                        throw null;
                    }
                }
            } else if (!z) {
                if (m3606d(2)) {
                    Log.v(str4, "saveAllState: no fragments!");
                }
                return null;
            } else {
                int size = this.f3184c.size();
                if (size > 0) {
                    arrayList = new ArrayList<>(size);
                    Iterator it2 = this.f3184c.iterator();
                    while (it2.hasNext()) {
                        Fragment fragment = (Fragment) it2.next();
                        arrayList.add(fragment.mWho);
                        if (fragment.mFragmentManager != this) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(str3);
                            sb3.append(fragment);
                            sb3.append(str2);
                            m3596a((RuntimeException) new IllegalStateException(sb3.toString()));
                            throw null;
                        } else if (m3606d(2)) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("saveAllState: adding fragment (");
                            sb4.append(fragment.mWho);
                            sb4.append("): ");
                            sb4.append(fragment);
                            Log.v(str4, sb4.toString());
                        }
                    }
                } else {
                    arrayList = null;
                }
                ArrayList<C0793a> arrayList3 = this.f3186e;
                if (arrayList3 != null) {
                    int size2 = arrayList3.size();
                    if (size2 > 0) {
                        backStackStateArr = new BackStackState[size2];
                        for (int i = 0; i < size2; i++) {
                            backStackStateArr[i] = new BackStackState((C0793a) this.f3186e.get(i));
                            if (m3606d(2)) {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("saveAllState: adding back stack #");
                                sb5.append(i);
                                sb5.append(str);
                                sb5.append(this.f3186e.get(i));
                                Log.v(str4, sb5.toString());
                            }
                        }
                    }
                }
                FragmentManagerState fragmentManagerState = new FragmentManagerState();
                fragmentManagerState.f3222e = arrayList2;
                fragmentManagerState.f3223f = arrayList;
                fragmentManagerState.f3224g = backStackStateArr;
                fragmentManagerState.f3225h = this.f3191j.get();
                Fragment fragment2 = this.f3200s;
                if (fragment2 != null) {
                    fragmentManagerState.f3226i = fragment2.mWho;
                }
                return fragmentManagerState;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: B */
    public void mo4056B() {
        synchronized (this.f3182a) {
            boolean z = false;
            boolean z2 = this.f3179D != null && !this.f3179D.isEmpty();
            if (this.f3182a.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.f3197p.mo4250d().removeCallbacks(this.f3181F);
                this.f3197p.mo4250d().post(this.f3181F);
                m3592K();
            }
        }
    }

    /* renamed from: b */
    public C0819o mo4084b() {
        return new C0793a(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo4093c(Fragment fragment) {
        if (m3606d(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("attach: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            if (!this.f3184c.contains(fragment)) {
                if (m3606d(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("add from attach: ");
                    sb2.append(fragment);
                    Log.v("FragmentManager", sb2.toString());
                }
                synchronized (this.f3184c) {
                    this.f3184c.add(fragment);
                }
                fragment.mAdded = true;
                if (m3615x(fragment)) {
                    this.f3203v = true;
                    return;
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Fragment already added: ");
            sb3.append(fragment);
            throw new IllegalStateException(sb3.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public C0891w mo4098e(Fragment fragment) {
        return this.f3180E.mo4273d(fragment);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo4101f(Fragment fragment) {
        if (m3606d(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("hide: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
            m3617z(fragment);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public boolean mo4103g(Fragment fragment) {
        boolean z = true;
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        if (!fragment.equals(fragmentManager.mo4127u()) || !mo4103g(fragmentManager.f3199r)) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo4105h(Fragment fragment) {
        if (mo4060a(fragment.mWho) == null) {
            C0816m mVar = new C0816m(this.f3195n, fragment);
            mVar.mo4295a(this.f3197p.mo4249c().getClassLoader());
            this.f3185d.put(fragment.mWho, mVar);
            if (fragment.mRetainInstanceChangedWhileDetached) {
                if (fragment.mRetainInstance) {
                    mo4085b(fragment);
                } else {
                    mo4115m(fragment);
                }
                fragment.mRetainInstanceChangedWhileDetached = false;
            }
            if (m3606d(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Added fragment to active set ");
                sb.append(fragment);
                Log.v("FragmentManager", sb.toString());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo4107i(Fragment fragment) {
        if (!this.f3185d.containsKey(fragment.mWho)) {
            if (m3606d(3)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Ignoring moving ");
                sb.append(fragment);
                sb.append(" to state ");
                sb.append(this.f3196o);
                sb.append("since it is not added to ");
                sb.append(this);
                Log.d("FragmentManager", sb.toString());
            }
            return;
        }
        mo4109j(fragment);
        if (fragment.mView != null) {
            Fragment u = m3612u(fragment);
            if (u != null) {
                View view = u.mView;
                ViewGroup viewGroup = fragment.mContainer;
                int indexOfChild = viewGroup.indexOfChild(view);
                int indexOfChild2 = viewGroup.indexOfChild(fragment.mView);
                if (indexOfChild2 < indexOfChild) {
                    viewGroup.removeViewAt(indexOfChild2);
                    viewGroup.addView(fragment.mView, indexOfChild);
                }
            }
            if (fragment.mIsNewlyAdded && fragment.mContainer != null) {
                float f = fragment.mPostponedAlpha;
                if (f > 0.0f) {
                    fragment.mView.setAlpha(f);
                }
                fragment.mPostponedAlpha = 0.0f;
                fragment.mIsNewlyAdded = false;
                C0803d a = C0798c.m3756a(this.f3197p.mo4249c(), this.f3198q, fragment, true);
                if (a != null) {
                    Animation animation = a.f3271a;
                    if (animation != null) {
                        fragment.mView.startAnimation(animation);
                    } else {
                        a.f3272b.setTarget(fragment.mView);
                        a.f3272b.start();
                    }
                }
            }
        }
        if (fragment.mHiddenChanged) {
            m3609r(fragment);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo4109j(Fragment fragment) {
        mo4068a(fragment, this.f3196o);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo4111k(Fragment fragment) {
        if (fragment.mDeferStart) {
            if (this.f3183b) {
                this.f3207z = true;
            } else {
                fragment.mDeferStart = false;
                mo4068a(fragment, this.f3196o);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo4113l(Fragment fragment) {
        if (m3606d(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("remove: ");
            sb.append(fragment);
            sb.append(" nesting=");
            sb.append(fragment.mBackStackNesting);
            Log.v("FragmentManager", sb.toString());
        }
        boolean z = !fragment.isInBackStack();
        if (!fragment.mDetached || z) {
            synchronized (this.f3184c) {
                this.f3184c.remove(fragment);
            }
            if (m3615x(fragment)) {
                this.f3203v = true;
            }
            fragment.mAdded = false;
            fragment.mRemoving = true;
            m3617z(fragment);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo4115m(Fragment fragment) {
        String str = "FragmentManager";
        if (mo4130x()) {
            if (m3606d(2)) {
                Log.v(str, "Ignoring removeRetainedFragment as the state is already saved");
            }
            return;
        }
        if (this.f3180E.mo4275e(fragment) && m3606d(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Removed ");
            sb.append(fragment);
            Log.v(str, sb.toString());
        }
    }

    /* renamed from: n */
    public boolean mo4117n() {
        boolean c = mo4095c(true);
        m3589H();
        return c;
    }

    /* renamed from: o */
    public int mo4118o() {
        ArrayList<C0793a> arrayList = this.f3186e;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public void mo4121p(Fragment fragment) {
        if (m3606d(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("show: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    /* renamed from: q */
    public List<Fragment> mo4122q() {
        List<Fragment> list;
        if (this.f3184c.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f3184c) {
            list = (List) this.f3184c.clone();
        }
        return list;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public Fragment mo4125t() {
        return this.f3199r;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f3199r;
        String str = "}";
        String str2 = "{";
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append(str2);
            sb.append(Integer.toHexString(System.identityHashCode(this.f3199r)));
            sb.append(str);
        } else {
            sb.append(this.f3197p.getClass().getSimpleName());
            sb.append(str2);
            sb.append(Integer.toHexString(System.identityHashCode(this.f3197p)));
            sb.append(str);
        }
        sb.append("}}");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public void mo4128v() {
        mo4095c(true);
        if (this.f3190i.mo289b()) {
            mo4132z();
        } else {
            this.f3189h.mo282a();
        }
    }

    /* renamed from: w */
    public boolean mo4129w() {
        return this.f3206y;
    }

    /* renamed from: x */
    public boolean mo4130x() {
        return this.f3204w || this.f3205x;
    }

    /* renamed from: z */
    public boolean mo4132z() {
        return m3599a((String) null, -1, 0);
    }

    /* renamed from: t */
    private void m3611t(Fragment fragment) {
        if (fragment != null && fragment.equals(mo4060a(fragment.mWho))) {
            fragment.performPrimaryNavigationFragmentChanged();
        }
    }

    /* renamed from: w */
    private ViewGroup m3614w(Fragment fragment) {
        if (fragment.mContainerId > 0 && this.f3198q.mo3994a()) {
            View a = this.f3198q.mo3993a(fragment.mContainerId);
            if (a instanceof ViewGroup) {
                return (ViewGroup) a;
            }
        }
        return null;
    }

    /* renamed from: x */
    private boolean m3615x(Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.mo4094c();
    }

    /* renamed from: z */
    private void m3617z(Fragment fragment) {
        ViewGroup w = m3614w(fragment);
        if (w != null) {
            if (w.getTag(C7640b.visible_removing_fragment_view_tag) == null) {
                w.setTag(C7640b.visible_removing_fragment_view_tag, fragment);
            }
            ((Fragment) w.getTag(C7640b.visible_removing_fragment_view_tag)).setNextAnim(fragment.getNextAnim());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4086b(Fragment fragment, CancellationSignal cancellationSignal) {
        HashSet hashSet = (HashSet) this.f3193l.get(fragment);
        if (hashSet != null && hashSet.remove(cancellationSignal) && hashSet.isEmpty()) {
            this.f3193l.remove(fragment);
            if (fragment.mState < 3) {
                m3610s(fragment);
                mo4068a(fragment, fragment.getStateAfterAnimating());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo4097d(Fragment fragment) {
        if (m3606d(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("detach: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (m3606d(2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("remove from detach: ");
                    sb2.append(fragment);
                    Log.v("FragmentManager", sb2.toString());
                }
                synchronized (this.f3184c) {
                    this.f3184c.remove(fragment);
                }
                if (m3615x(fragment)) {
                    this.f3203v = true;
                }
                fragment.mAdded = false;
                m3617z(fragment);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo4099e() {
        this.f3204w = false;
        this.f3205x = false;
        m3603c(1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public void mo4108j() {
        m3592K();
        m3611t(this.f3200s);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public void mo4119o(Fragment fragment) {
        if (fragment == null || (fragment.equals(mo4060a(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f3200s;
            this.f3200s = fragment;
            m3611t(fragment2);
            m3611t(this.f3200s);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(fragment);
        sb.append(" is not an active fragment of FragmentManager ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: n */
    public SavedState mo4116n(Fragment fragment) {
        C0816m mVar = (C0816m) this.f3185d.get(fragment.mWho);
        if (mVar != null && mVar.mo4300f().equals(fragment)) {
            return mVar.mo4304j();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(fragment);
        sb.append(" is not currently in the FragmentManager");
        m3596a((RuntimeException) new IllegalStateException(sb.toString()));
        throw null;
    }

    /* renamed from: v */
    private C0813k m3613v(Fragment fragment) {
        return this.f3180E.mo4271c(fragment);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo4102g() {
        m3603c(1);
    }

    /* renamed from: p */
    public C0807f mo4120p() {
        C0807f fVar = this.f3201t;
        if (fVar != null) {
            return fVar;
        }
        Fragment fragment = this.f3199r;
        if (fragment != null) {
            return fragment.mFragmentManager.mo4120p();
        }
        return this.f3202u;
    }

    /* renamed from: q */
    private void m3608q(Fragment fragment) {
        HashSet hashSet = (HashSet) this.f3193l.get(fragment);
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((CancellationSignal) it.next()).mo3155a();
            }
            hashSet.clear();
            m3610s(fragment);
            this.f3193l.remove(fragment);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo4100f() {
        this.f3206y = true;
        mo4095c(true);
        m3603c(-1);
        this.f3197p = null;
        this.f3198q = null;
        this.f3199r = null;
        if (this.f3189h != null) {
            this.f3190i.mo290c();
            this.f3189h = null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo4110k() {
        this.f3204w = false;
        this.f3205x = false;
        m3603c(4);
    }

    /* renamed from: u */
    public Fragment mo4127u() {
        return this.f3200s;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo4114m() {
        this.f3205x = true;
        m3603c(2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4085b(Fragment fragment) {
        String str = "FragmentManager";
        if (mo4130x()) {
            if (m3606d(2)) {
                Log.v(str, "Ignoring addRetainedFragment as the state is already saved");
            }
            return;
        }
        if (this.f3180E.mo4267a(fragment) && m3606d(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Updating retained Fragments: Added ");
            sb.append(fragment);
            Log.v(str, sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public C0810i mo4124s() {
        return this.f3195n;
    }

    /* renamed from: a */
    public void mo4077a(String str, int i) {
        mo4073a((C0787g) new C0788h(str, -1, i), false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo4104h() {
        for (int i = 0; i < this.f3184c.size(); i++) {
            Fragment fragment = (Fragment) this.f3184c.get(i);
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    /* renamed from: a */
    public void mo4061a(int i, int i2) {
        if (i >= 0) {
            mo4073a((C0787g) new C0788h(null, i, i2), false);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bad id: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: y */
    public void mo4131y() {
        this.f3204w = false;
        this.f3205x = false;
        int size = this.f3184c.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) this.f3184c.get(i);
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    /* renamed from: a */
    private boolean m3599a(String str, int i, int i2) {
        mo4095c(false);
        m3605d(true);
        Fragment fragment = this.f3200s;
        if (fragment != null && i < 0 && str == null && fragment.getChildFragmentManager().mo4132z()) {
            return true;
        }
        boolean a = mo4082a(this.f3176A, this.f3177B, str, i, i2);
        if (a) {
            this.f3183b = true;
            try {
                m3604c(this.f3176A, this.f3177B);
            } finally {
                m3586E();
            }
        }
        m3592K();
        m3587F();
        m3584C();
        return a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo4089b(int i) {
        return this.f3196o >= i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public void mo4112l() {
        this.f3204w = false;
        this.f3205x = false;
        m3603c(3);
    }

    /* renamed from: d */
    private void m3605d(boolean z) {
        if (this.f3183b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.f3197p == null) {
            if (this.f3206y) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.f3197p.mo4250d().getLooper()) {
            if (!z) {
                m3585D();
            }
            if (this.f3176A == null) {
                this.f3176A = new ArrayList<>();
                this.f3177B = new ArrayList<>();
            }
            this.f3183b = true;
            try {
                m3597a(null, null);
            } finally {
                this.f3183b = false;
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* renamed from: b */
    public Fragment mo4083b(String str) {
        if (str != null) {
            for (int size = this.f3184c.size() - 1; size >= 0; size--) {
                Fragment fragment = (Fragment) this.f3184c.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (C0816m mVar : this.f3185d.values()) {
                if (mVar != null) {
                    Fragment f = mVar.mo4300f();
                    if (str.equals(f.mTag)) {
                        return f;
                    }
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Fragment mo4092c(String str) {
        for (C0816m mVar : this.f3185d.values()) {
            if (mVar != null) {
                Fragment findFragmentByWho = mVar.mo4300f().findFragmentByWho(str);
                if (findFragmentByWho != null) {
                    return findFragmentByWho;
                }
            }
        }
        return null;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo4095c(boolean z) {
        m3605d(z);
        boolean z2 = false;
        while (m3602b(this.f3176A, this.f3177B)) {
            this.f3183b = true;
            try {
                m3604c(this.f3176A, this.f3177B);
                m3586E();
                z2 = true;
            } catch (Throwable th) {
                m3586E();
                throw th;
            }
        }
        m3592K();
        m3587F();
        m3584C();
        return z2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4087b(C0787g gVar, boolean z) {
        if (!z || (this.f3197p != null && !this.f3206y)) {
            m3605d(z);
            if (gVar.mo4159a(this.f3176A, this.f3177B)) {
                this.f3183b = true;
                try {
                    m3604c(this.f3176A, this.f3177B);
                } finally {
                    m3586E();
                }
            }
            m3592K();
            m3587F();
            m3584C();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: r */
    public Factory2 mo4123r() {
        return this.f3188g;
    }

    /* renamed from: c */
    private void m3604c(ArrayList<C0793a> arrayList, ArrayList<Boolean> arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                m3597a(arrayList, arrayList2);
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!((C0793a) arrayList.get(i)).f3324p) {
                        if (i2 != i) {
                            m3601b(arrayList, arrayList2, i2, i);
                        }
                        i2 = i + 1;
                        if (((Boolean) arrayList2.get(i)).booleanValue()) {
                            while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0793a) arrayList.get(i2)).f3324p) {
                                i2++;
                            }
                        }
                        m3601b(arrayList, arrayList2, i, i2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    m3601b(arrayList, arrayList2, i2, size);
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    /* renamed from: a */
    public void mo4072a(OnBackStackChangedListener onBackStackChangedListener) {
        if (this.f3192k == null) {
            this.f3192k = new ArrayList<>();
        }
        this.f3192k.add(onBackStackChangedListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo4106i() {
        m3603c(3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4069a(Fragment fragment, CancellationSignal cancellationSignal) {
        if (this.f3193l.get(fragment) == null) {
            this.f3193l.put(fragment, new HashSet());
        }
        ((HashSet) this.f3193l.get(fragment)).add(cancellationSignal);
    }

    /* renamed from: b */
    private void m3601b(ArrayList<C0793a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        int i3;
        ArrayList<C0793a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i4 = i;
        int i5 = i2;
        boolean z = ((C0793a) arrayList3.get(i4)).f3324p;
        ArrayList<Fragment> arrayList5 = this.f3178C;
        if (arrayList5 == null) {
            this.f3178C = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.f3178C.addAll(this.f3184c);
        Fragment u = mo4127u();
        boolean z2 = false;
        for (int i6 = i4; i6 < i5; i6++) {
            C0793a aVar = (C0793a) arrayList3.get(i6);
            if (!((Boolean) arrayList4.get(i6)).booleanValue()) {
                u = aVar.mo4177a(this.f3178C, u);
            } else {
                u = aVar.mo4187b(this.f3178C, u);
            }
            z2 = z2 || aVar.f3315g;
        }
        this.f3178C.clear();
        if (!z) {
            C0821p.m3907a(this, arrayList, arrayList2, i, i2, false, this.f3194m);
        }
        m3598a(arrayList, arrayList2, i, i2);
        if (z) {
            C7573b bVar = new C7573b();
            m3595a(bVar);
            int a = m3593a(arrayList, arrayList2, i, i2, bVar);
            m3600b(bVar);
            i3 = a;
        } else {
            i3 = i5;
        }
        if (i3 != i4 && z) {
            C0821p.m3907a(this, arrayList, arrayList2, i, i3, true, this.f3194m);
            mo4062a(this.f3196o, true);
        }
        while (i4 < i5) {
            C0793a aVar2 = (C0793a) arrayList3.get(i4);
            if (((Boolean) arrayList4.get(i4)).booleanValue() && aVar2.f3243t >= 0) {
                aVar2.f3243t = -1;
            }
            aVar2.mo4199h();
            i4++;
        }
        if (z2) {
            m3590I();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo4096d() {
        this.f3204w = false;
        this.f3205x = false;
        m3603c(2);
    }

    /* renamed from: a */
    public void mo4064a(Bundle bundle, String str, Fragment fragment) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment ");
        sb.append(fragment);
        sb.append(" is not currently in the FragmentManager");
        m3596a((RuntimeException) new IllegalStateException(sb.toString()));
        throw null;
    }

    /* renamed from: a */
    public Fragment mo4059a(Bundle bundle, String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment a = mo4060a(string);
        if (a != null) {
            return a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Fragment no longer exists for key ");
        sb.append(str);
        sb.append(": unique id ");
        sb.append(string);
        m3596a((RuntimeException) new IllegalStateException(sb.toString()));
        throw null;
    }

    /* renamed from: a */
    static Fragment m3594a(View view) {
        Object tag = view.getTag(C7640b.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    private void m3603c(int i) {
        try {
            this.f3183b = true;
            mo4062a(i, false);
            this.f3183b = false;
            mo4095c(true);
        } catch (Throwable th) {
            this.f3183b = false;
            throw th;
        }
    }

    /* renamed from: a */
    public void mo4078a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("    ");
        String sb2 = sb.toString();
        if (!this.f3185d.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (C0816m mVar : this.f3185d.values()) {
                printWriter.print(str);
                if (mVar != null) {
                    Fragment f = mVar.mo4300f();
                    printWriter.println(f);
                    f.dump(sb2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f3184c.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                Fragment fragment = (Fragment) this.f3184c.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList<Fragment> arrayList = this.f3187f;
        if (arrayList != null) {
            int size2 = arrayList.size();
            if (size2 > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (int i2 = 0; i2 < size2; i2++) {
                    Fragment fragment2 = (Fragment) this.f3187f.get(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i2);
                    printWriter.print(": ");
                    printWriter.println(fragment2.toString());
                }
            }
        }
        ArrayList<C0793a> arrayList2 = this.f3186e;
        if (arrayList2 != null) {
            int size3 = arrayList2.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (int i3 = 0; i3 < size3; i3++) {
                    C0793a aVar = (C0793a) this.f3186e.get(i3);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.mo4182a(sb2, printWriter);
                }
            }
        }
        printWriter.print(str);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Back Stack Index: ");
        sb3.append(this.f3191j.get());
        printWriter.println(sb3.toString());
        synchronized (this.f3182a) {
            int size4 = this.f3182a.size();
            if (size4 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size4; i4++) {
                    C0787g gVar = (C0787g) this.f3182a.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(gVar);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f3197p);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f3198q);
        if (this.f3199r != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f3199r);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f3196o);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f3204w);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3205x);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f3206y);
        if (this.f3203v) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f3203v);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo4094c() {
        boolean z = false;
        for (C0816m mVar : this.f3185d.values()) {
            if (mVar != null) {
                z = m3615x(mVar.mo4300f());
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m3600b(C7573b<Fragment> bVar) {
        int size = bVar.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) bVar.mo19488c(i);
            if (!fragment.mAdded) {
                View requireView = fragment.requireView();
                fragment.mPostponedAlpha = requireView.getAlpha();
                requireView.setAlpha(0.0f);
            }
        }
    }

    /* renamed from: b */
    private boolean m3602b(ArrayList<C0793a> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this.f3182a) {
            if (this.f3182a.isEmpty()) {
                return false;
            }
            boolean z = false;
            for (int i = 0; i < this.f3182a.size(); i++) {
                z |= ((C0787g) this.f3182a.get(i)).mo4159a(arrayList, arrayList2);
            }
            this.f3182a.clear();
            this.f3197p.mo4250d().removeCallbacks(this.f3181F);
            return z;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4088b(boolean z) {
        for (int size = this.f3184c.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f3184c.get(size);
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo4090b(Menu menu) {
        if (this.f3196o < 1) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f3184c.size(); i++) {
            Fragment fragment = (Fragment) this.f3184c.get(i);
            if (fragment != null && fragment.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo4091b(MenuItem menuItem) {
        if (this.f3196o < 1) {
            return false;
        }
        for (int i = 0; i < this.f3184c.size(); i++) {
            Fragment fragment = (Fragment) this.f3184c.get(i);
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r1 != 3) goto L_0x0204;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0107  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4068a(androidx.fragment.app.Fragment r13, int r14) {
        /*
            r12 = this;
            java.util.HashMap<java.lang.String, androidx.fragment.app.m> r0 = r12.f3185d
            java.lang.String r1 = r13.mWho
            java.lang.Object r0 = r0.get(r1)
            androidx.fragment.app.m r0 = (androidx.fragment.app.C0816m) r0
            if (r0 != 0) goto L_0x0013
            androidx.fragment.app.m r0 = new androidx.fragment.app.m
            androidx.fragment.app.i r1 = r12.f3195n
            r0.<init>(r1, r13)
        L_0x0013:
            int r1 = r0.mo4296b()
            int r14 = java.lang.Math.min(r14, r1)
            int r1 = r13.mState
            r2 = 0
            java.lang.String r3 = "FragmentManager"
            r4 = -1
            r5 = 2
            r6 = 3
            r7 = 1
            if (r1 > r14) goto L_0x010c
            boolean r1 = r13.mFromLayout
            if (r1 == 0) goto L_0x002f
            boolean r1 = r13.mInLayout
            if (r1 != 0) goto L_0x002f
            return
        L_0x002f:
            int r1 = r13.mState
            if (r1 >= r14) goto L_0x003e
            java.util.HashMap<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r1 = r12.f3193l
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x003e
            r12.m3608q(r13)
        L_0x003e:
            int r1 = r13.mState
            if (r1 == r4) goto L_0x004c
            if (r1 == 0) goto L_0x00e9
            if (r1 == r7) goto L_0x00ee
            if (r1 == r5) goto L_0x0100
            if (r1 == r6) goto L_0x0105
            goto L_0x0204
        L_0x004c:
            if (r14 <= r4) goto L_0x00e9
            boolean r1 = m3606d(r6)
            if (r1 == 0) goto L_0x0068
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r8 = "moveto ATTACHED: "
            r1.append(r8)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r3, r1)
        L_0x0068:
            androidx.fragment.app.Fragment r1 = r13.mTarget
            java.lang.String r8 = " that does not belong to this FragmentManager!"
            java.lang.String r9 = " declared target fragment "
            java.lang.String r10 = "Fragment "
            if (r1 == 0) goto L_0x00b0
            java.lang.String r11 = r1.mWho
            androidx.fragment.app.Fragment r11 = r12.mo4060a(r11)
            boolean r1 = r1.equals(r11)
            if (r1 == 0) goto L_0x0090
            androidx.fragment.app.Fragment r1 = r13.mTarget
            int r11 = r1.mState
            if (r11 >= r7) goto L_0x0087
            r12.mo4068a(r1, r7)
        L_0x0087:
            androidx.fragment.app.Fragment r1 = r13.mTarget
            java.lang.String r1 = r1.mWho
            r13.mTargetWho = r1
            r13.mTarget = r2
            goto L_0x00b0
        L_0x0090:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r13)
            r0.append(r9)
            androidx.fragment.app.Fragment r13 = r13.mTarget
            r0.append(r13)
            r0.append(r8)
            java.lang.String r13 = r0.toString()
            r14.<init>(r13)
            throw r14
        L_0x00b0:
            java.lang.String r1 = r13.mTargetWho
            if (r1 == 0) goto L_0x00e2
            androidx.fragment.app.Fragment r1 = r12.mo4060a(r1)
            if (r1 == 0) goto L_0x00c2
            int r2 = r1.mState
            if (r2 >= r7) goto L_0x00e2
            r12.mo4068a(r1, r7)
            goto L_0x00e2
        L_0x00c2:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r10)
            r0.append(r13)
            r0.append(r9)
            java.lang.String r13 = r13.mTargetWho
            r0.append(r13)
            r0.append(r8)
            java.lang.String r13 = r0.toString()
            r14.<init>(r13)
            throw r14
        L_0x00e2:
            androidx.fragment.app.g<?> r1 = r12.f3197p
            androidx.fragment.app.Fragment r2 = r12.f3199r
            r0.mo4293a(r1, r12, r2)
        L_0x00e9:
            if (r14 <= 0) goto L_0x00ee
            r0.mo4297c()
        L_0x00ee:
            if (r14 <= r4) goto L_0x00f3
            r0.mo4299e()
        L_0x00f3:
            if (r14 <= r7) goto L_0x0100
            androidx.fragment.app.d r1 = r12.f3198q
            r0.mo4292a(r1)
            r0.mo4291a()
            r0.mo4302h()
        L_0x0100:
            if (r14 <= r5) goto L_0x0105
            r0.mo4307m()
        L_0x0105:
            if (r14 <= r6) goto L_0x0204
            r0.mo4303i()
            goto L_0x0204
        L_0x010c:
            if (r1 <= r14) goto L_0x0204
            r8 = 0
            if (r1 == 0) goto L_0x01d2
            if (r1 == r7) goto L_0x01ad
            if (r1 == r5) goto L_0x0126
            if (r1 == r6) goto L_0x0121
            r9 = 4
            if (r1 == r9) goto L_0x011c
            goto L_0x0204
        L_0x011c:
            if (r14 >= r9) goto L_0x0121
            r0.mo4301g()
        L_0x0121:
            if (r14 >= r6) goto L_0x0126
            r0.mo4308n()
        L_0x0126:
            if (r14 >= r5) goto L_0x01ad
            boolean r1 = m3606d(r6)
            if (r1 == 0) goto L_0x0142
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "movefrom ACTIVITY_CREATED: "
            r1.append(r5)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r3, r1)
        L_0x0142:
            android.view.View r1 = r13.mView
            if (r1 == 0) goto L_0x0155
            androidx.fragment.app.g<?> r1 = r12.f3197p
            boolean r1 = r1.mo4035b(r13)
            if (r1 == 0) goto L_0x0155
            android.util.SparseArray<android.os.Parcelable> r1 = r13.mSavedViewState
            if (r1 != 0) goto L_0x0155
            r0.mo4306l()
        L_0x0155:
            android.view.View r1 = r13.mView
            if (r1 == 0) goto L_0x019e
            android.view.ViewGroup r5 = r13.mContainer
            if (r5 == 0) goto L_0x019e
            r5.endViewTransition(r1)
            android.view.View r1 = r13.mView
            r1.clearAnimation()
            boolean r1 = r13.isRemovingParent()
            if (r1 != 0) goto L_0x019e
            int r1 = r12.f3196o
            r5 = 0
            if (r1 <= r4) goto L_0x018e
            boolean r1 = r12.f3206y
            if (r1 != 0) goto L_0x018e
            android.view.View r1 = r13.mView
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x018e
            float r1 = r13.mPostponedAlpha
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x018e
            androidx.fragment.app.g<?> r1 = r12.f3197p
            android.content.Context r1 = r1.mo4249c()
            androidx.fragment.app.d r2 = r12.f3198q
            androidx.fragment.app.c$d r2 = androidx.fragment.app.C0798c.m3756a(r1, r2, r13, r8)
        L_0x018e:
            r13.mPostponedAlpha = r5
            if (r2 == 0) goto L_0x0197
            androidx.fragment.app.p$g r1 = r12.f3194m
            androidx.fragment.app.C0798c.m3757a(r13, r2, r1)
        L_0x0197:
            android.view.ViewGroup r1 = r13.mContainer
            android.view.View r2 = r13.mView
            r1.removeView(r2)
        L_0x019e:
            java.util.HashMap<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r1 = r12.f3193l
            java.lang.Object r1 = r1.get(r13)
            if (r1 != 0) goto L_0x01aa
            r12.m3610s(r13)
            goto L_0x01ad
        L_0x01aa:
            r13.setStateAfterAnimating(r14)
        L_0x01ad:
            if (r14 >= r7) goto L_0x01d2
            boolean r1 = r12.f3206y
            if (r1 == 0) goto L_0x01be
            java.util.HashMap<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r1 = r12.f3193l
            java.lang.Object r1 = r1.get(r13)
            if (r1 == 0) goto L_0x01be
            r12.m3608q(r13)
        L_0x01be:
            java.util.HashMap<androidx.fragment.app.Fragment, java.util.HashSet<androidx.core.os.CancellationSignal>> r1 = r12.f3193l
            java.lang.Object r1 = r1.get(r13)
            if (r1 == 0) goto L_0x01cb
            r13.setStateAfterAnimating(r14)
            r14 = 1
            goto L_0x01d2
        L_0x01cb:
            androidx.fragment.app.g<?> r1 = r12.f3197p
            androidx.fragment.app.k r2 = r12.f3180E
            r0.mo4294a(r1, r2)
        L_0x01d2:
            if (r14 >= 0) goto L_0x0204
            boolean r1 = r13.mRemoving
            if (r1 == 0) goto L_0x01df
            boolean r1 = r13.isInBackStack()
            if (r1 != 0) goto L_0x01df
            goto L_0x01e0
        L_0x01df:
            r7 = 0
        L_0x01e0:
            r0.mo4298d()
            if (r7 != 0) goto L_0x0201
            androidx.fragment.app.k r0 = r12.f3180E
            boolean r0 = r0.mo4277f(r13)
            if (r0 == 0) goto L_0x01ee
            goto L_0x0201
        L_0x01ee:
            java.lang.String r0 = r13.mTargetWho
            if (r0 == 0) goto L_0x0204
            androidx.fragment.app.Fragment r0 = r12.mo4060a(r0)
            if (r0 == 0) goto L_0x0204
            boolean r1 = r0.getRetainInstance()
            if (r1 == 0) goto L_0x0204
            r13.mTarget = r0
            goto L_0x0204
        L_0x0201:
            r12.m3616y(r13)
        L_0x0204:
            int r0 = r13.mState
            if (r0 == r14) goto L_0x0236
            boolean r0 = m3606d(r6)
            if (r0 == 0) goto L_0x0234
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "moveToState: Fragment state for "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r1 = " not updated inline; expected state "
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = " found "
            r0.append(r1)
            int r1 = r13.mState
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
        L_0x0234:
            r13.mState = r14
        L_0x0236:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.mo4068a(androidx.fragment.app.Fragment, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4071a(Fragment fragment, boolean z) {
        ViewGroup w = m3614w(fragment);
        if (w != null && (w instanceof FragmentContainerView)) {
            ((FragmentContainerView) w).setDrawDisappearingViewsLast(!z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4062a(int i, boolean z) {
        if (this.f3197p == null && i != -1) {
            throw new IllegalStateException("No activity");
        } else if (z || i != this.f3196o) {
            this.f3196o = i;
            int size = this.f3184c.size();
            for (int i2 = 0; i2 < size; i2++) {
                mo4107i((Fragment) this.f3184c.get(i2));
            }
            for (C0816m mVar : this.f3185d.values()) {
                if (mVar != null) {
                    Fragment f = mVar.mo4300f();
                    if (!f.mIsNewlyAdded) {
                        mo4107i(f);
                    }
                }
            }
            m3591J();
            if (this.f3203v) {
                C0808g<?> gVar = this.f3197p;
                if (gVar != null && this.f3196o == 4) {
                    gVar.mo4038g();
                    this.f3203v = false;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4067a(Fragment fragment) {
        if (m3606d(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("add: ");
            sb.append(fragment);
            Log.v("FragmentManager", sb.toString());
        }
        mo4105h(fragment);
        if (fragment.mDetached) {
            return;
        }
        if (!this.f3184c.contains(fragment)) {
            synchronized (this.f3184c) {
                this.f3184c.add(fragment);
            }
            fragment.mAdded = true;
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (m3615x(fragment)) {
                this.f3203v = true;
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Fragment already added: ");
        sb2.append(fragment);
        throw new IllegalStateException(sb2.toString());
    }

    /* renamed from: a */
    public Fragment mo4058a(int i) {
        for (int size = this.f3184c.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f3184c.get(size);
            if (fragment != null && fragment.mFragmentId == i) {
                return fragment;
            }
        }
        for (C0816m mVar : this.f3185d.values()) {
            if (mVar != null) {
                Fragment f = mVar.mo4300f();
                if (f.mFragmentId == i) {
                    return f;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Fragment mo4060a(String str) {
        C0816m mVar = (C0816m) this.f3185d.get(str);
        if (mVar != null) {
            return mVar.mo4300f();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4073a(C0787g gVar, boolean z) {
        if (!z) {
            if (this.f3197p != null) {
                m3585D();
            } else if (this.f3206y) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.f3182a) {
            if (this.f3197p != null) {
                this.f3182a.add(gVar);
                mo4056B();
            } else if (!z) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo4057a() {
        return this.f3191j.getAndIncrement();
    }

    /* renamed from: a */
    private void m3597a(ArrayList<C0793a> arrayList, ArrayList<Boolean> arrayList2) {
        ArrayList<C0789i> arrayList3 = this.f3179D;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i = 0;
        while (i < size) {
            C0789i iVar = (C0789i) this.f3179D.get(i);
            if (arrayList != null && !iVar.f3219a) {
                int indexOf = arrayList.indexOf(iVar.f3220b);
                if (!(indexOf == -1 || arrayList2 == null || !((Boolean) arrayList2.get(indexOf)).booleanValue())) {
                    this.f3179D.remove(i);
                    i--;
                    size--;
                    iVar.mo4160c();
                    i++;
                }
            }
            if (iVar.mo4162e() || (arrayList != null && iVar.f3220b.mo4184a(arrayList, 0, arrayList.size()))) {
                this.f3179D.remove(i);
                i--;
                size--;
                if (arrayList != null && !iVar.f3219a) {
                    int indexOf2 = arrayList.indexOf(iVar.f3220b);
                    if (!(indexOf2 == -1 || arrayList2 == null || !((Boolean) arrayList2.get(indexOf2)).booleanValue())) {
                        iVar.mo4160c();
                    }
                }
                iVar.mo4161d();
            }
            i++;
        }
    }

    /* renamed from: a */
    private int m3593a(ArrayList<C0793a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, C7573b<Fragment> bVar) {
        int i3 = i2;
        for (int i4 = i2 - 1; i4 >= i; i4--) {
            C0793a aVar = (C0793a) arrayList.get(i4);
            boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
            if (aVar.mo4198g() && !aVar.mo4184a(arrayList, i4 + 1, i2)) {
                if (this.f3179D == null) {
                    this.f3179D = new ArrayList<>();
                }
                C0789i iVar = new C0789i(aVar, booleanValue);
                this.f3179D.add(iVar);
                aVar.mo4181a((C0779e) iVar);
                if (booleanValue) {
                    aVar.mo4197f();
                } else {
                    aVar.mo4192c(false);
                }
                i3--;
                if (i4 != i3) {
                    arrayList.remove(i4);
                    arrayList.add(i3, aVar);
                }
                m3595a(bVar);
            }
        }
        return i3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4075a(C0793a aVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            aVar.mo4192c(z3);
        } else {
            aVar.mo4197f();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(aVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            C0821p.m3907a(this, arrayList, arrayList2, 0, 1, true, this.f3194m);
        }
        if (z3) {
            mo4062a(this.f3196o, true);
        }
        for (C0816m mVar : this.f3185d.values()) {
            if (mVar != null) {
                Fragment f = mVar.mo4300f();
                if (f.mView != null && f.mIsNewlyAdded && aVar.mo4189b(f.mContainerId)) {
                    float f2 = f.mPostponedAlpha;
                    if (f2 > 0.0f) {
                        f.mView.setAlpha(f2);
                    }
                    if (z3) {
                        f.mPostponedAlpha = 0.0f;
                    } else {
                        f.mPostponedAlpha = -1.0f;
                        f.mIsNewlyAdded = false;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m3598a(ArrayList<C0793a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2) {
        while (i < i2) {
            C0793a aVar = (C0793a) arrayList.get(i);
            boolean z = true;
            if (((Boolean) arrayList2.get(i)).booleanValue()) {
                aVar.mo4179a(-1);
                if (i != i2 - 1) {
                    z = false;
                }
                aVar.mo4192c(z);
            } else {
                aVar.mo4179a(1);
                aVar.mo4197f();
            }
            i++;
        }
    }

    /* renamed from: a */
    private void m3595a(C7573b<Fragment> bVar) {
        int i = this.f3196o;
        if (i >= 1) {
            int min = Math.min(i, 3);
            int size = this.f3184c.size();
            for (int i2 = 0; i2 < size; i2++) {
                Fragment fragment = (Fragment) this.f3184c.get(i2);
                if (fragment.mState < min) {
                    mo4068a(fragment, min);
                    if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                        bVar.add(fragment);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4074a(C0793a aVar) {
        if (this.f3186e == null) {
            this.f3186e = new ArrayList<>();
        }
        this.f3186e.add(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4082a(ArrayList<C0793a> arrayList, ArrayList<Boolean> arrayList2, String str, int i, int i2) {
        int i3;
        ArrayList<C0793a> arrayList3 = this.f3186e;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i < 0 && (i2 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f3186e.remove(size));
            arrayList2.add(Boolean.valueOf(true));
        } else {
            if (str != null || i >= 0) {
                i3 = this.f3186e.size() - 1;
                while (i3 >= 0) {
                    C0793a aVar = (C0793a) this.f3186e.get(i3);
                    if ((str != null && str.equals(aVar.getName())) || (i >= 0 && i == aVar.f3243t)) {
                        break;
                    }
                    i3--;
                }
                if (i3 < 0) {
                    return false;
                }
                if ((i2 & 1) != 0) {
                    while (true) {
                        i3--;
                        if (i3 < 0) {
                            break;
                        }
                        C0793a aVar2 = (C0793a) this.f3186e.get(i3);
                        if ((str == null || !str.equals(aVar2.getName())) && (i < 0 || i != aVar2.f3243t)) {
                            break;
                        }
                    }
                }
            } else {
                i3 = -1;
            }
            if (i3 == this.f3186e.size() - 1) {
                return false;
            }
            for (int size2 = this.f3186e.size() - 1; size2 > i3; size2--) {
                arrayList.add(this.f3186e.remove(size2));
                arrayList2.add(Boolean.valueOf(true));
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4065a(Parcelable parcelable) {
        C0816m mVar;
        if (parcelable != null) {
            FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
            if (fragmentManagerState.f3222e != null) {
                this.f3185d.clear();
                Iterator it = fragmentManagerState.f3222e.iterator();
                while (it.hasNext()) {
                    FragmentState fragmentState = (FragmentState) it.next();
                    if (fragmentState != null) {
                        Fragment b = this.f3180E.mo4268b(fragmentState.f3228f);
                        if (b != null) {
                            if (m3606d(2)) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("restoreSaveState: re-attaching retained ");
                                sb.append(b);
                                Log.v("FragmentManager", sb.toString());
                            }
                            mVar = new C0816m(this.f3195n, b, fragmentState);
                        } else {
                            mVar = new C0816m(this.f3195n, this.f3197p.mo4249c().getClassLoader(), mo4120p(), fragmentState);
                        }
                        Fragment f = mVar.mo4300f();
                        f.mFragmentManager = this;
                        if (m3606d(2)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("restoreSaveState: active (");
                            sb2.append(f.mWho);
                            sb2.append("): ");
                            sb2.append(f);
                            Log.v("FragmentManager", sb2.toString());
                        }
                        mVar.mo4295a(this.f3197p.mo4249c().getClassLoader());
                        this.f3185d.put(f.mWho, mVar);
                    }
                }
                for (Fragment fragment : this.f3180E.mo4272c()) {
                    if (!this.f3185d.containsKey(fragment.mWho)) {
                        if (m3606d(2)) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Discarding retained Fragment ");
                            sb3.append(fragment);
                            sb3.append(" that was not found in the set of active Fragments ");
                            sb3.append(fragmentManagerState.f3222e);
                            Log.v("FragmentManager", sb3.toString());
                        }
                        mo4068a(fragment, 1);
                        fragment.mRemoving = true;
                        mo4068a(fragment, -1);
                    }
                }
                this.f3184c.clear();
                ArrayList<String> arrayList = fragmentManagerState.f3223f;
                if (arrayList != null) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        String str = (String) it2.next();
                        Fragment a = mo4060a(str);
                        if (a != null) {
                            a.mAdded = true;
                            if (m3606d(2)) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("restoreSaveState: added (");
                                sb4.append(str);
                                sb4.append("): ");
                                sb4.append(a);
                                Log.v("FragmentManager", sb4.toString());
                            }
                            if (!this.f3184c.contains(a)) {
                                synchronized (this.f3184c) {
                                    this.f3184c.add(a);
                                }
                            } else {
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append("Already added ");
                                sb5.append(a);
                                throw new IllegalStateException(sb5.toString());
                            }
                        } else {
                            StringBuilder sb6 = new StringBuilder();
                            sb6.append("No instantiated fragment for (");
                            sb6.append(str);
                            sb6.append(")");
                            m3596a((RuntimeException) new IllegalStateException(sb6.toString()));
                            throw null;
                        }
                    }
                }
                BackStackState[] backStackStateArr = fragmentManagerState.f3224g;
                if (backStackStateArr != null) {
                    this.f3186e = new ArrayList<>(backStackStateArr.length);
                    int i = 0;
                    while (true) {
                        BackStackState[] backStackStateArr2 = fragmentManagerState.f3224g;
                        if (i >= backStackStateArr2.length) {
                            break;
                        }
                        C0793a a2 = backStackStateArr2[i].mo3816a(this);
                        if (m3606d(2)) {
                            StringBuilder sb7 = new StringBuilder();
                            sb7.append("restoreAllState: back stack #");
                            sb7.append(i);
                            sb7.append(" (index ");
                            sb7.append(a2.f3243t);
                            sb7.append("): ");
                            sb7.append(a2);
                            Log.v("FragmentManager", sb7.toString());
                            PrintWriter printWriter = new PrintWriter(new C0601c("FragmentManager"));
                            a2.mo4183a("  ", printWriter, false);
                            printWriter.close();
                        }
                        this.f3186e.add(a2);
                        i++;
                    }
                } else {
                    this.f3186e = null;
                }
                this.f3191j.set(fragmentManagerState.f3225h);
                String str2 = fragmentManagerState.f3226i;
                if (str2 != null) {
                    this.f3200s = mo4060a(str2);
                    m3611t(this.f3200s);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v8, types: [androidx.lifecycle.LifecycleOwner] */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4076a(androidx.fragment.app.C0808g<?> r3, androidx.fragment.app.C0805d r4, androidx.fragment.app.Fragment r5) {
        /*
            r2 = this;
            androidx.fragment.app.g<?> r0 = r2.f3197p
            if (r0 != 0) goto L_0x004d
            r2.f3197p = r3
            r2.f3198q = r4
            r2.f3199r = r5
            androidx.fragment.app.Fragment r4 = r2.f3199r
            if (r4 == 0) goto L_0x0011
            r2.m3592K()
        L_0x0011:
            boolean r4 = r3 instanceof androidx.activity.OnBackPressedDispatcherOwner
            if (r4 == 0) goto L_0x0028
            r4 = r3
            androidx.activity.OnBackPressedDispatcherOwner r4 = (androidx.activity.OnBackPressedDispatcherOwner) r4
            androidx.activity.OnBackPressedDispatcher r0 = r4.getOnBackPressedDispatcher()
            r2.f3189h = r0
            if (r5 == 0) goto L_0x0021
            r4 = r5
        L_0x0021:
            androidx.activity.OnBackPressedDispatcher r0 = r2.f3189h
            androidx.activity.b r1 = r2.f3190i
            r0.mo283a(r4, r1)
        L_0x0028:
            if (r5 == 0) goto L_0x0033
            androidx.fragment.app.FragmentManager r3 = r5.mFragmentManager
            androidx.fragment.app.k r3 = r3.m3613v(r5)
            r2.f3180E = r3
            goto L_0x004c
        L_0x0033:
            boolean r4 = r3 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r4 == 0) goto L_0x0044
            androidx.lifecycle.ViewModelStoreOwner r3 = (androidx.lifecycle.ViewModelStoreOwner) r3
            androidx.lifecycle.w r3 = r3.getViewModelStore()
            androidx.fragment.app.k r3 = androidx.fragment.app.C0813k.m3819a(r3)
            r2.f3180E = r3
            goto L_0x004c
        L_0x0044:
            androidx.fragment.app.k r3 = new androidx.fragment.app.k
            r4 = 0
            r3.<init>(r4)
            r2.f3180E = r3
        L_0x004c:
            return
        L_0x004d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Already attached"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.mo4076a(androidx.fragment.app.g, androidx.fragment.app.d, androidx.fragment.app.Fragment):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4079a(boolean z) {
        for (int size = this.f3184c.size() - 1; size >= 0; size--) {
            Fragment fragment = (Fragment) this.f3184c.get(size);
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4063a(Configuration configuration) {
        for (int i = 0; i < this.f3184c.size(); i++) {
            Fragment fragment = (Fragment) this.f3184c.get(i);
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4080a(Menu menu, MenuInflater menuInflater) {
        if (this.f3196o < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z = false;
        for (int i = 0; i < this.f3184c.size(); i++) {
            Fragment fragment = (Fragment) this.f3184c.get(i);
            if (fragment != null && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z = true;
            }
        }
        if (this.f3187f != null) {
            for (int i2 = 0; i2 < this.f3187f.size(); i2++) {
                Fragment fragment2 = (Fragment) this.f3187f.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f3187f = arrayList;
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4081a(MenuItem menuItem) {
        if (this.f3196o < 1) {
            return false;
        }
        for (int i = 0; i < this.f3184c.size(); i++) {
            Fragment fragment = (Fragment) this.f3184c.get(i);
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4066a(Menu menu) {
        if (this.f3196o >= 1) {
            for (int i = 0; i < this.f3184c.size(); i++) {
                Fragment fragment = (Fragment) this.f3184c.get(i);
                if (fragment != null) {
                    fragment.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4070a(Fragment fragment, C0864b bVar) {
        if (!fragment.equals(mo4060a(fragment.mWho)) || !(fragment.mHost == null || fragment.mFragmentManager == this)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Fragment ");
            sb.append(fragment);
            sb.append(" is not an active fragment of FragmentManager ");
            sb.append(this);
            throw new IllegalArgumentException(sb.toString());
        }
        fragment.mMaxState = bVar;
    }
}
