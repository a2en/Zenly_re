package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.SharedElementCallback;
import androidx.core.p004os.CancellationSignal;
import androidx.core.view.C0647i;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p214e.p228e.C7571a;

/* renamed from: androidx.fragment.app.p */
class C0821p {

    /* renamed from: a */
    private static final int[] f3334a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b */
    private static final C0836r f3335b = (VERSION.SDK_INT >= 21 ? new C0830q() : null);

    /* renamed from: c */
    private static final C0836r f3336c = m3895a();

    /* renamed from: androidx.fragment.app.p$a */
    static class C0822a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C0828g f3337e;

        /* renamed from: f */
        final /* synthetic */ Fragment f3338f;

        /* renamed from: g */
        final /* synthetic */ CancellationSignal f3339g;

        C0822a(C0828g gVar, Fragment fragment, CancellationSignal cancellationSignal) {
            this.f3337e = gVar;
            this.f3338f = fragment;
            this.f3339g = cancellationSignal;
        }

        public void run() {
            this.f3337e.mo4140a(this.f3338f, this.f3339g);
        }
    }

    /* renamed from: androidx.fragment.app.p$b */
    static class C0823b implements Runnable {

        /* renamed from: e */
        final /* synthetic */ ArrayList f3340e;

        C0823b(ArrayList arrayList) {
            this.f3340e = arrayList;
        }

        public void run() {
            C0821p.m3914a(this.f3340e, 4);
        }
    }

    /* renamed from: androidx.fragment.app.p$c */
    static class C0824c implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C0828g f3341e;

        /* renamed from: f */
        final /* synthetic */ Fragment f3342f;

        /* renamed from: g */
        final /* synthetic */ CancellationSignal f3343g;

        C0824c(C0828g gVar, Fragment fragment, CancellationSignal cancellationSignal) {
            this.f3341e = gVar;
            this.f3342f = fragment;
            this.f3343g = cancellationSignal;
        }

        public void run() {
            this.f3341e.mo4140a(this.f3342f, this.f3343g);
        }
    }

    /* renamed from: androidx.fragment.app.p$d */
    static class C0825d implements Runnable {

        /* renamed from: e */
        final /* synthetic */ Object f3344e;

        /* renamed from: f */
        final /* synthetic */ C0836r f3345f;

        /* renamed from: g */
        final /* synthetic */ View f3346g;

        /* renamed from: h */
        final /* synthetic */ Fragment f3347h;

        /* renamed from: i */
        final /* synthetic */ ArrayList f3348i;

        /* renamed from: j */
        final /* synthetic */ ArrayList f3349j;

        /* renamed from: k */
        final /* synthetic */ ArrayList f3350k;

        /* renamed from: l */
        final /* synthetic */ Object f3351l;

        C0825d(Object obj, C0836r rVar, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
            this.f3344e = obj;
            this.f3345f = rVar;
            this.f3346g = view;
            this.f3347h = fragment;
            this.f3348i = arrayList;
            this.f3349j = arrayList2;
            this.f3350k = arrayList3;
            this.f3351l = obj2;
        }

        public void run() {
            Object obj = this.f3344e;
            if (obj != null) {
                this.f3345f.mo4341b(obj, this.f3346g);
                this.f3349j.addAll(C0821p.m3904a(this.f3345f, this.f3344e, this.f3347h, this.f3348i, this.f3346g));
            }
            if (this.f3350k != null) {
                if (this.f3351l != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(this.f3346g);
                    this.f3345f.mo4337a(this.f3351l, this.f3350k, arrayList);
                }
                this.f3350k.clear();
                this.f3350k.add(this.f3346g);
            }
        }
    }

    /* renamed from: androidx.fragment.app.p$e */
    static class C0826e implements Runnable {

        /* renamed from: e */
        final /* synthetic */ Fragment f3352e;

        /* renamed from: f */
        final /* synthetic */ Fragment f3353f;

        /* renamed from: g */
        final /* synthetic */ boolean f3354g;

        /* renamed from: h */
        final /* synthetic */ C7571a f3355h;

        /* renamed from: i */
        final /* synthetic */ View f3356i;

        /* renamed from: j */
        final /* synthetic */ C0836r f3357j;

        /* renamed from: k */
        final /* synthetic */ Rect f3358k;

        C0826e(Fragment fragment, Fragment fragment2, boolean z, C7571a aVar, View view, C0836r rVar, Rect rect) {
            this.f3352e = fragment;
            this.f3353f = fragment2;
            this.f3354g = z;
            this.f3355h = aVar;
            this.f3356i = view;
            this.f3357j = rVar;
            this.f3358k = rect;
        }

        public void run() {
            C0821p.m3905a(this.f3352e, this.f3353f, this.f3354g, this.f3355h, false);
            View view = this.f3356i;
            if (view != null) {
                this.f3357j.mo4364a(view, this.f3358k);
            }
        }
    }

    /* renamed from: androidx.fragment.app.p$f */
    static class C0827f implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C0836r f3359e;

        /* renamed from: f */
        final /* synthetic */ C7571a f3360f;

        /* renamed from: g */
        final /* synthetic */ Object f3361g;

        /* renamed from: h */
        final /* synthetic */ C0829h f3362h;

        /* renamed from: i */
        final /* synthetic */ ArrayList f3363i;

        /* renamed from: j */
        final /* synthetic */ View f3364j;

        /* renamed from: k */
        final /* synthetic */ Fragment f3365k;

        /* renamed from: l */
        final /* synthetic */ Fragment f3366l;

        /* renamed from: m */
        final /* synthetic */ boolean f3367m;

        /* renamed from: n */
        final /* synthetic */ ArrayList f3368n;

        /* renamed from: o */
        final /* synthetic */ Object f3369o;

        /* renamed from: p */
        final /* synthetic */ Rect f3370p;

        C0827f(C0836r rVar, C7571a aVar, Object obj, C0829h hVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
            this.f3359e = rVar;
            this.f3360f = aVar;
            this.f3361g = obj;
            this.f3362h = hVar;
            this.f3363i = arrayList;
            this.f3364j = view;
            this.f3365k = fragment;
            this.f3366l = fragment2;
            this.f3367m = z;
            this.f3368n = arrayList2;
            this.f3369o = obj2;
            this.f3370p = rect;
        }

        public void run() {
            C7571a a = C0821p.m3898a(this.f3359e, this.f3360f, this.f3361g, this.f3362h);
            if (a != null) {
                this.f3363i.addAll(a.values());
                this.f3363i.add(this.f3364j);
            }
            C0821p.m3905a(this.f3365k, this.f3366l, this.f3367m, a, false);
            Object obj = this.f3361g;
            if (obj != null) {
                this.f3359e.mo4343b(obj, this.f3368n, this.f3363i);
                View a2 = C0821p.m3893a(a, this.f3362h, this.f3369o, this.f3367m);
                if (a2 != null) {
                    this.f3359e.mo4364a(a2, this.f3370p);
                }
            }
        }
    }

    /* renamed from: androidx.fragment.app.p$g */
    interface C0828g {
        /* renamed from: a */
        void mo4140a(Fragment fragment, CancellationSignal cancellationSignal);

        /* renamed from: b */
        void mo4141b(Fragment fragment, CancellationSignal cancellationSignal);
    }

    /* renamed from: androidx.fragment.app.p$h */
    static class C0829h {

        /* renamed from: a */
        public Fragment f3371a;

        /* renamed from: b */
        public boolean f3372b;

        /* renamed from: c */
        public C0793a f3373c;

        /* renamed from: d */
        public Fragment f3374d;

        /* renamed from: e */
        public boolean f3375e;

        /* renamed from: f */
        public C0793a f3376f;

        C0829h() {
        }
    }

    /* renamed from: a */
    private static C0836r m3895a() {
        try {
            return (C0836r) Class.forName("androidx.transition.b").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static void m3920b(FragmentManager fragmentManager, int i, C0829h hVar, View view, C7571a<String, String> aVar, C0828g gVar) {
        Object obj;
        FragmentManager fragmentManager2 = fragmentManager;
        C0829h hVar2 = hVar;
        View view2 = view;
        C0828g gVar2 = gVar;
        ViewGroup viewGroup = fragmentManager2.f3198q.mo3994a() ? (ViewGroup) fragmentManager2.f3198q.mo3993a(i) : null;
        if (viewGroup != null) {
            Fragment fragment = hVar2.f3371a;
            Fragment fragment2 = hVar2.f3374d;
            C0836r a = m3896a(fragment2, fragment);
            if (a != null) {
                boolean z = hVar2.f3372b;
                boolean z2 = hVar2.f3375e;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                Object a2 = m3901a(a, fragment, z);
                Object b = m3919b(a, fragment2, z2);
                Object obj2 = a2;
                ViewGroup viewGroup2 = viewGroup;
                ArrayList arrayList3 = arrayList2;
                ArrayList arrayList4 = arrayList;
                Object b2 = m3918b(a, viewGroup, view, aVar, hVar, arrayList2, arrayList, obj2, b);
                Object obj3 = obj2;
                if (obj3 == null && b2 == null) {
                    obj = b;
                    if (obj == null) {
                        return;
                    }
                } else {
                    obj = b;
                }
                ArrayList a3 = m3904a(a, obj, fragment2, arrayList3, view2);
                ArrayList a4 = m3904a(a, obj3, fragment, arrayList4, view2);
                m3914a(a4, 4);
                Fragment fragment3 = fragment;
                ArrayList arrayList5 = a3;
                Object a5 = m3902a(a, obj3, obj, b2, fragment3, z);
                if (!(fragment2 == null || arrayList5 == null || (arrayList5.size() <= 0 && arrayList3.size() <= 0))) {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    C0828g gVar3 = gVar;
                    gVar3.mo4141b(fragment2, cancellationSignal);
                    a.mo4331a(fragment2, a5, cancellationSignal, new C0822a(gVar3, fragment2, cancellationSignal));
                }
                if (a5 != null) {
                    m3911a(a, obj, fragment2, arrayList5);
                    ArrayList a6 = a.mo4363a(arrayList4);
                    a.mo4335a(a5, obj3, a4, obj, arrayList5, b2, arrayList4);
                    ViewGroup viewGroup3 = viewGroup2;
                    a.mo4330a(viewGroup3, a5);
                    a.mo4365a(viewGroup3, arrayList3, arrayList4, a6, aVar);
                    m3914a(a4, 0);
                    a.mo4343b(b2, arrayList3, arrayList4);
                }
            }
        }
    }

    /* renamed from: a */
    static void m3907a(FragmentManager fragmentManager, ArrayList<C0793a> arrayList, ArrayList<Boolean> arrayList2, int i, int i2, boolean z, C0828g gVar) {
        FragmentManager fragmentManager2 = fragmentManager;
        ArrayList<C0793a> arrayList3 = arrayList;
        ArrayList<Boolean> arrayList4 = arrayList2;
        int i3 = i2;
        boolean z2 = z;
        if (fragmentManager2.f3196o >= 1) {
            SparseArray sparseArray = new SparseArray();
            for (int i4 = i; i4 < i3; i4++) {
                C0793a aVar = (C0793a) arrayList3.get(i4);
                if (((Boolean) arrayList4.get(i4)).booleanValue()) {
                    m3921b(aVar, sparseArray, z2);
                } else {
                    m3908a(aVar, sparseArray, z2);
                }
            }
            if (sparseArray.size() != 0) {
                View view = new View(fragmentManager2.f3197p.mo4249c());
                int size = sparseArray.size();
                for (int i5 = 0; i5 < size; i5++) {
                    int keyAt = sparseArray.keyAt(i5);
                    C7571a a = m3897a(keyAt, arrayList3, arrayList4, i, i3);
                    C0829h hVar = (C0829h) sparseArray.valueAt(i5);
                    if (z2) {
                        m3920b(fragmentManager, keyAt, hVar, view, a, gVar);
                    } else {
                        m3906a(fragmentManager, keyAt, hVar, view, a, gVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static C7571a<String, String> m3897a(int i, ArrayList<C0793a> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        ArrayList<String> arrayList3;
        ArrayList arrayList4;
        C7571a<String, String> aVar = new C7571a<>();
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            C0793a aVar2 = (C0793a) arrayList.get(i4);
            if (aVar2.mo4189b(i)) {
                boolean booleanValue = ((Boolean) arrayList2.get(i4)).booleanValue();
                ArrayList<String> arrayList5 = aVar2.f3322n;
                if (arrayList5 != null) {
                    int size = arrayList5.size();
                    if (booleanValue) {
                        arrayList3 = aVar2.f3322n;
                        arrayList4 = aVar2.f3323o;
                    } else {
                        ArrayList arrayList6 = aVar2.f3322n;
                        arrayList3 = aVar2.f3323o;
                        arrayList4 = arrayList6;
                    }
                    for (int i5 = 0; i5 < size; i5++) {
                        String str = (String) arrayList4.get(i5);
                        String str2 = (String) arrayList3.get(i5);
                        String str3 = (String) aVar.remove(str2);
                        if (str3 != null) {
                            aVar.put(str, str3);
                        } else {
                            aVar.put(str, str2);
                        }
                    }
                }
            }
        }
        return aVar;
    }

    /* renamed from: b */
    private static Object m3919b(C0836r rVar, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.getReturnTransition();
        } else {
            obj = fragment.getExitTransition();
        }
        return rVar.mo4339b(obj);
    }

    /* renamed from: b */
    private static Object m3918b(C0836r rVar, ViewGroup viewGroup, View view, C7571a<String, String> aVar, C0829h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        Object obj3;
        Object obj4;
        Rect rect;
        View view2;
        C0836r rVar2 = rVar;
        View view3 = view;
        C7571a<String, String> aVar2 = aVar;
        C0829h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        ArrayList<View> arrayList4 = arrayList2;
        Object obj5 = obj;
        Fragment fragment = hVar2.f3371a;
        Fragment fragment2 = hVar2.f3374d;
        if (fragment != null) {
            fragment.requireView().setVisibility(0);
        }
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar2.f3372b;
        if (aVar.isEmpty()) {
            obj3 = null;
        } else {
            obj3 = m3900a(rVar, fragment, fragment2, z);
        }
        C7571a b = m3917b(rVar, aVar2, obj3, hVar2);
        C7571a a = m3898a(rVar, aVar2, obj3, hVar2);
        if (aVar.isEmpty()) {
            if (b != null) {
                b.clear();
            }
            if (a != null) {
                a.clear();
            }
            obj4 = null;
        } else {
            m3915a(arrayList3, b, (Collection<String>) aVar.keySet());
            m3915a(arrayList4, a, aVar.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        m3905a(fragment, fragment2, z, b, true);
        if (obj4 != null) {
            arrayList4.add(view3);
            rVar.mo4342b(obj4, view3, arrayList3);
            m3912a(rVar, obj4, obj2, b, hVar2.f3375e, hVar2.f3376f);
            Rect rect2 = new Rect();
            View a2 = m3893a(a, hVar2, obj5, z);
            if (a2 != null) {
                rVar.mo4332a(obj5, rect2);
            }
            rect = rect2;
            view2 = a2;
        } else {
            view2 = null;
            rect = null;
        }
        C0826e eVar = new C0826e(fragment, fragment2, z, a, view2, rVar, rect);
        C0647i.m3033a(viewGroup, eVar);
        return obj4;
    }

    /* renamed from: a */
    private static void m3911a(C0836r rVar, Object obj, Fragment fragment, ArrayList<View> arrayList) {
        if (fragment != null && obj != null && fragment.mAdded && fragment.mHidden && fragment.mHiddenChanged) {
            fragment.setHideReplaced(true);
            rVar.mo4334a(obj, fragment.getView(), arrayList);
            C0647i.m3033a(fragment.mContainer, new C0823b(arrayList));
        }
    }

    /* renamed from: a */
    private static void m3906a(FragmentManager fragmentManager, int i, C0829h hVar, View view, C7571a<String, String> aVar, C0828g gVar) {
        Object obj;
        FragmentManager fragmentManager2 = fragmentManager;
        C0829h hVar2 = hVar;
        View view2 = view;
        C7571a<String, String> aVar2 = aVar;
        C0828g gVar2 = gVar;
        ViewGroup viewGroup = fragmentManager2.f3198q.mo3994a() ? (ViewGroup) fragmentManager2.f3198q.mo3993a(i) : null;
        if (viewGroup != null) {
            Fragment fragment = hVar2.f3371a;
            Fragment fragment2 = hVar2.f3374d;
            C0836r a = m3896a(fragment2, fragment);
            if (a != null) {
                boolean z = hVar2.f3372b;
                boolean z2 = hVar2.f3375e;
                Object a2 = m3901a(a, fragment, z);
                Object b = m3919b(a, fragment2, z2);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = arrayList;
                Object obj2 = b;
                Object obj3 = a2;
                C0836r rVar = a;
                Fragment fragment3 = fragment2;
                Object a3 = m3899a(a, viewGroup, view, aVar, hVar, arrayList3, arrayList2, obj3, obj2);
                Object obj4 = obj3;
                if (obj4 == null && a3 == null) {
                    obj = obj2;
                    if (obj == null) {
                        return;
                    }
                } else {
                    obj = obj2;
                }
                ArrayList arrayList4 = arrayList3;
                ArrayList a4 = m3904a(rVar, obj, fragment3, arrayList4, view2);
                Object obj5 = (a4 == null || a4.isEmpty()) ? null : obj;
                rVar.mo4333a(obj4, view2);
                Object a5 = m3902a(rVar, obj4, obj5, a3, fragment, hVar2.f3372b);
                if (!(fragment3 == null || a4 == null || (a4.size() <= 0 && arrayList4.size() <= 0))) {
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    gVar2.mo4141b(fragment3, cancellationSignal);
                    rVar.mo4331a(fragment3, a5, cancellationSignal, new C0824c(gVar2, fragment3, cancellationSignal));
                }
                if (a5 != null) {
                    ArrayList arrayList5 = new ArrayList();
                    C0836r rVar2 = rVar;
                    rVar2.mo4335a(a5, obj4, arrayList5, obj5, a4, a3, arrayList2);
                    m3910a(rVar2, viewGroup, fragment, view, arrayList2, obj4, arrayList5, obj5, a4);
                    ArrayList arrayList6 = arrayList2;
                    C7571a<String, String> aVar3 = aVar;
                    rVar.mo4366a((View) viewGroup, arrayList6, (Map<String, String>) aVar3);
                    rVar.mo4330a(viewGroup, a5);
                    rVar.mo4367a(viewGroup, arrayList6, (Map<String, String>) aVar3);
                }
            }
        }
    }

    /* renamed from: b */
    private static C7571a<String, View> m3917b(C0836r rVar, C7571a<String, String> aVar, Object obj, C0829h hVar) {
        SharedElementCallback sharedElementCallback;
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = hVar.f3374d;
        C7571a<String, View> aVar2 = new C7571a<>();
        rVar.mo4369a((Map<String, View>) aVar2, fragment.requireView());
        C0793a aVar3 = hVar.f3376f;
        if (hVar.f3375e) {
            sharedElementCallback = fragment.getEnterTransitionCallback();
            arrayList = aVar3.f3323o;
        } else {
            sharedElementCallback = fragment.getExitTransitionCallback();
            arrayList = aVar3.f3322n;
        }
        if (arrayList != null) {
            aVar2.mo19470a(arrayList);
        }
        if (sharedElementCallback != null) {
            sharedElementCallback.mo3019a((List<String>) arrayList, (Map<String, View>) aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view = (View) aVar2.get(str);
                if (view == null) {
                    aVar.remove(str);
                } else if (!str.equals(ViewCompat.m2867t(view))) {
                    aVar.put(ViewCompat.m2867t(view), (String) aVar.remove(str));
                }
            }
        } else {
            aVar.mo19470a(aVar2.keySet());
        }
        return aVar2;
    }

    /* renamed from: a */
    private static void m3910a(C0836r rVar, ViewGroup viewGroup, Fragment fragment, View view, ArrayList<View> arrayList, Object obj, ArrayList<View> arrayList2, Object obj2, ArrayList<View> arrayList3) {
        C0825d dVar = new C0825d(obj, rVar, view, fragment, arrayList, arrayList2, arrayList3, obj2);
        ViewGroup viewGroup2 = viewGroup;
        C0647i.m3033a(viewGroup, dVar);
    }

    /* renamed from: a */
    private static C0836r m3896a(Fragment fragment, Fragment fragment2) {
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object exitTransition = fragment.getExitTransition();
            if (exitTransition != null) {
                arrayList.add(exitTransition);
            }
            Object returnTransition = fragment.getReturnTransition();
            if (returnTransition != null) {
                arrayList.add(returnTransition);
            }
            Object sharedElementReturnTransition = fragment.getSharedElementReturnTransition();
            if (sharedElementReturnTransition != null) {
                arrayList.add(sharedElementReturnTransition);
            }
        }
        if (fragment2 != null) {
            Object enterTransition = fragment2.getEnterTransition();
            if (enterTransition != null) {
                arrayList.add(enterTransition);
            }
            Object reenterTransition = fragment2.getReenterTransition();
            if (reenterTransition != null) {
                arrayList.add(reenterTransition);
            }
            Object sharedElementEnterTransition = fragment2.getSharedElementEnterTransition();
            if (sharedElementEnterTransition != null) {
                arrayList.add(sharedElementEnterTransition);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        C0836r rVar = f3335b;
        if (rVar != null && m3916a(rVar, (List<Object>) arrayList)) {
            return f3335b;
        }
        C0836r rVar2 = f3336c;
        if (rVar2 != null && m3916a(rVar2, (List<Object>) arrayList)) {
            return f3336c;
        }
        if (f3335b == null && f3336c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    /* renamed from: b */
    public static void m3921b(C0793a aVar, SparseArray<C0829h> sparseArray, boolean z) {
        if (aVar.f3241r.f3198q.mo3994a()) {
            for (int size = aVar.f3309a.size() - 1; size >= 0; size--) {
                m3909a(aVar, (C0820a) aVar.f3309a.get(size), sparseArray, true, z);
            }
        }
    }

    /* renamed from: b */
    static boolean m3922b() {
        return (f3335b == null && f3336c == null) ? false : true;
    }

    /* renamed from: a */
    private static boolean m3916a(C0836r rVar, List<Object> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!rVar.mo4338a(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static Object m3900a(C0836r rVar, Fragment fragment, Fragment fragment2, boolean z) {
        Object obj;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            obj = fragment2.getSharedElementReturnTransition();
        } else {
            obj = fragment.getSharedElementEnterTransition();
        }
        return rVar.mo4344c(rVar.mo4339b(obj));
    }

    /* renamed from: a */
    private static Object m3901a(C0836r rVar, Fragment fragment, boolean z) {
        Object obj;
        if (fragment == null) {
            return null;
        }
        if (z) {
            obj = fragment.getReenterTransition();
        } else {
            obj = fragment.getEnterTransition();
        }
        return rVar.mo4339b(obj);
    }

    /* renamed from: a */
    private static void m3915a(ArrayList<View> arrayList, C7571a<String, View> aVar, Collection<String> collection) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View view = (View) aVar.mo19601d(size);
            if (collection.contains(ViewCompat.m2867t(view))) {
                arrayList.add(view);
            }
        }
    }

    /* renamed from: a */
    private static Object m3899a(C0836r rVar, ViewGroup viewGroup, View view, C7571a<String, String> aVar, C0829h hVar, ArrayList<View> arrayList, ArrayList<View> arrayList2, Object obj, Object obj2) {
        C7571a<String, String> aVar2;
        Object obj3;
        Object obj4;
        Rect rect;
        C0836r rVar2 = rVar;
        C0829h hVar2 = hVar;
        ArrayList<View> arrayList3 = arrayList;
        Object obj5 = obj;
        Fragment fragment = hVar2.f3371a;
        Fragment fragment2 = hVar2.f3374d;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        boolean z = hVar2.f3372b;
        if (aVar.isEmpty()) {
            aVar2 = aVar;
            obj3 = null;
        } else {
            obj3 = m3900a(rVar2, fragment, fragment2, z);
            aVar2 = aVar;
        }
        C7571a b = m3917b(rVar2, aVar2, obj3, hVar2);
        if (aVar.isEmpty()) {
            obj4 = null;
        } else {
            arrayList3.addAll(b.values());
            obj4 = obj3;
        }
        if (obj5 == null && obj2 == null && obj4 == null) {
            return null;
        }
        m3905a(fragment, fragment2, z, b, true);
        if (obj4 != null) {
            rect = new Rect();
            rVar2.mo4342b(obj4, view, arrayList3);
            m3912a(rVar, obj4, obj2, b, hVar2.f3375e, hVar2.f3376f);
            if (obj5 != null) {
                rVar2.mo4332a(obj5, rect);
            }
        } else {
            rect = null;
        }
        C0827f fVar = r0;
        C0827f fVar2 = new C0827f(rVar, aVar, obj4, hVar, arrayList2, view, fragment, fragment2, z, arrayList, obj, rect);
        C0647i.m3033a(viewGroup, fVar);
        return obj4;
    }

    /* renamed from: a */
    static C7571a<String, View> m3898a(C0836r rVar, C7571a<String, String> aVar, Object obj, C0829h hVar) {
        SharedElementCallback sharedElementCallback;
        ArrayList<String> arrayList;
        Fragment fragment = hVar.f3371a;
        View view = fragment.getView();
        if (aVar.isEmpty() || obj == null || view == null) {
            aVar.clear();
            return null;
        }
        C7571a<String, View> aVar2 = new C7571a<>();
        rVar.mo4369a((Map<String, View>) aVar2, view);
        C0793a aVar3 = hVar.f3373c;
        if (hVar.f3372b) {
            sharedElementCallback = fragment.getExitTransitionCallback();
            arrayList = aVar3.f3322n;
        } else {
            sharedElementCallback = fragment.getEnterTransitionCallback();
            arrayList = aVar3.f3323o;
        }
        if (arrayList != null) {
            aVar2.mo19470a(arrayList);
            aVar2.mo19470a(aVar.values());
        }
        if (sharedElementCallback != null) {
            sharedElementCallback.mo3019a((List<String>) arrayList, (Map<String, View>) aVar2);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                String str = (String) arrayList.get(size);
                View view2 = (View) aVar2.get(str);
                if (view2 == null) {
                    String a = m3903a(aVar, str);
                    if (a != null) {
                        aVar.remove(a);
                    }
                } else if (!str.equals(ViewCompat.m2867t(view2))) {
                    String a2 = m3903a(aVar, str);
                    if (a2 != null) {
                        aVar.put(a2, ViewCompat.m2867t(view2));
                    }
                }
            }
        } else {
            m3913a(aVar, aVar2);
        }
        return aVar2;
    }

    /* renamed from: a */
    private static String m3903a(C7571a<String, String> aVar, String str) {
        int size = aVar.size();
        for (int i = 0; i < size; i++) {
            if (str.equals(aVar.mo19601d(i))) {
                return (String) aVar.mo19595b(i);
            }
        }
        return null;
    }

    /* renamed from: a */
    static View m3893a(C7571a<String, View> aVar, C0829h hVar, Object obj, boolean z) {
        String str;
        C0793a aVar2 = hVar.f3373c;
        if (!(obj == null || aVar == null)) {
            ArrayList<String> arrayList = aVar2.f3322n;
            if (arrayList != null && !arrayList.isEmpty()) {
                if (z) {
                    str = (String) aVar2.f3322n.get(0);
                } else {
                    str = (String) aVar2.f3323o.get(0);
                }
                return (View) aVar.get(str);
            }
        }
        return null;
    }

    /* renamed from: a */
    private static void m3912a(C0836r rVar, Object obj, Object obj2, C7571a<String, View> aVar, boolean z, C0793a aVar2) {
        String str;
        ArrayList<String> arrayList = aVar2.f3322n;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z) {
                str = (String) aVar2.f3323o.get(0);
            } else {
                str = (String) aVar2.f3322n.get(0);
            }
            View view = (View) aVar.get(str);
            rVar.mo4345c(obj, view);
            if (obj2 != null) {
                rVar.mo4345c(obj2, view);
            }
        }
    }

    /* renamed from: a */
    private static void m3913a(C7571a<String, String> aVar, C7571a<String, View> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            if (!aVar2.containsKey((String) aVar.mo19601d(size))) {
                aVar.mo19597c(size);
            }
        }
    }

    /* renamed from: a */
    static void m3905a(Fragment fragment, Fragment fragment2, boolean z, C7571a<String, View> aVar, boolean z2) {
        SharedElementCallback sharedElementCallback;
        int i;
        if (z) {
            sharedElementCallback = fragment2.getEnterTransitionCallback();
        } else {
            sharedElementCallback = fragment.getEnterTransitionCallback();
        }
        if (sharedElementCallback != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (aVar == null) {
                i = 0;
            } else {
                i = aVar.size();
            }
            for (int i2 = 0; i2 < i; i2++) {
                arrayList2.add(aVar.mo19595b(i2));
                arrayList.add(aVar.mo19601d(i2));
            }
            if (z2) {
                sharedElementCallback.mo3020b(arrayList2, arrayList, null);
            } else {
                sharedElementCallback.mo3018a((List<String>) arrayList2, (List<View>) arrayList, null);
            }
        }
    }

    /* renamed from: a */
    static ArrayList<View> m3904a(C0836r rVar, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.getView();
        if (view2 != null) {
            rVar.mo4368a(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        rVar.mo4336a(obj, arrayList2);
        return arrayList2;
    }

    /* renamed from: a */
    static void m3914a(ArrayList<View> arrayList, int i) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((View) arrayList.get(size)).setVisibility(i);
            }
        }
    }

    /* renamed from: a */
    private static Object m3902a(C0836r rVar, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        boolean z2 = (obj == null || obj2 == null || fragment == null) ? true : z ? fragment.getAllowReturnTransitionOverlap() : fragment.getAllowEnterTransitionOverlap();
        if (z2) {
            return rVar.mo4340b(obj2, obj, obj3);
        }
        return rVar.mo4329a(obj2, obj, obj3);
    }

    /* renamed from: a */
    public static void m3908a(C0793a aVar, SparseArray<C0829h> sparseArray, boolean z) {
        int size = aVar.f3309a.size();
        for (int i = 0; i < size; i++) {
            m3909a(aVar, (C0820a) aVar.f3309a.get(i), sparseArray, false, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0039, code lost:
        if (r0.mAdded != false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x006c, code lost:
        if (r0.mPostponedAlpha >= 0.0f) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x006e, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0078, code lost:
        if (r0.mHidden == false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x008a, code lost:
        if (r0.mHidden == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x008c, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x009a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m3909a(androidx.fragment.app.C0793a r8, androidx.fragment.app.C0819o.C0820a r9, android.util.SparseArray<androidx.fragment.app.C0821p.C0829h> r10, boolean r11, boolean r12) {
        /*
            androidx.fragment.app.Fragment r0 = r9.f3327b
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r1 = r0.mContainerId
            if (r1 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r11 == 0) goto L_0x0013
            int[] r2 = f3334a
            int r9 = r9.f3326a
            r9 = r2[r9]
            goto L_0x0015
        L_0x0013:
            int r9 = r9.f3326a
        L_0x0015:
            r2 = 0
            r3 = 1
            if (r9 == r3) goto L_0x007f
            r4 = 3
            if (r9 == r4) goto L_0x0057
            r4 = 4
            if (r9 == r4) goto L_0x003f
            r4 = 5
            if (r9 == r4) goto L_0x002d
            r4 = 6
            if (r9 == r4) goto L_0x0057
            r4 = 7
            if (r9 == r4) goto L_0x007f
            r9 = 0
        L_0x0029:
            r4 = 0
            r5 = 0
            goto L_0x0092
        L_0x002d:
            if (r12 == 0) goto L_0x003c
            boolean r9 = r0.mHiddenChanged
            if (r9 == 0) goto L_0x008e
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x008e
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x008e
            goto L_0x008c
        L_0x003c:
            boolean r9 = r0.mHidden
            goto L_0x008f
        L_0x003f:
            if (r12 == 0) goto L_0x004e
            boolean r9 = r0.mHiddenChanged
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.mHidden
            if (r9 == 0) goto L_0x0070
        L_0x004d:
            goto L_0x006e
        L_0x004e:
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x0070
            goto L_0x004d
        L_0x0057:
            if (r12 == 0) goto L_0x0072
            boolean r9 = r0.mAdded
            if (r9 != 0) goto L_0x0070
            android.view.View r9 = r0.mView
            if (r9 == 0) goto L_0x0070
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x0070
            float r9 = r0.mPostponedAlpha
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0070
        L_0x006e:
            r9 = 1
            goto L_0x007b
        L_0x0070:
            r9 = 0
            goto L_0x007b
        L_0x0072:
            boolean r9 = r0.mAdded
            if (r9 == 0) goto L_0x0070
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x0070
            goto L_0x006e
        L_0x007b:
            r5 = r9
            r9 = 0
            r4 = 1
            goto L_0x0092
        L_0x007f:
            if (r12 == 0) goto L_0x0084
            boolean r9 = r0.mIsNewlyAdded
            goto L_0x008f
        L_0x0084:
            boolean r9 = r0.mAdded
            if (r9 != 0) goto L_0x008e
            boolean r9 = r0.mHidden
            if (r9 != 0) goto L_0x008e
        L_0x008c:
            r9 = 1
            goto L_0x008f
        L_0x008e:
            r9 = 0
        L_0x008f:
            r2 = r9
            r9 = 1
            goto L_0x0029
        L_0x0092:
            java.lang.Object r6 = r10.get(r1)
            androidx.fragment.app.p$h r6 = (androidx.fragment.app.C0821p.C0829h) r6
            if (r2 == 0) goto L_0x00a4
            androidx.fragment.app.p$h r6 = m3894a(r6, r10, r1)
            r6.f3371a = r0
            r6.f3372b = r11
            r6.f3373c = r8
        L_0x00a4:
            r2 = 0
            if (r12 != 0) goto L_0x00c5
            if (r9 == 0) goto L_0x00c5
            if (r6 == 0) goto L_0x00b1
            androidx.fragment.app.Fragment r9 = r6.f3374d
            if (r9 != r0) goto L_0x00b1
            r6.f3374d = r2
        L_0x00b1:
            androidx.fragment.app.FragmentManager r9 = r8.f3241r
            int r7 = r0.mState
            if (r7 >= r3) goto L_0x00c5
            int r7 = r9.f3196o
            if (r7 < r3) goto L_0x00c5
            boolean r7 = r8.f3324p
            if (r7 != 0) goto L_0x00c5
            r9.mo4105h(r0)
            r9.mo4068a(r0, r3)
        L_0x00c5:
            if (r5 == 0) goto L_0x00d7
            if (r6 == 0) goto L_0x00cd
            androidx.fragment.app.Fragment r9 = r6.f3374d
            if (r9 != 0) goto L_0x00d7
        L_0x00cd:
            androidx.fragment.app.p$h r6 = m3894a(r6, r10, r1)
            r6.f3374d = r0
            r6.f3375e = r11
            r6.f3376f = r8
        L_0x00d7:
            if (r12 != 0) goto L_0x00e3
            if (r4 == 0) goto L_0x00e3
            if (r6 == 0) goto L_0x00e3
            androidx.fragment.app.Fragment r8 = r6.f3371a
            if (r8 != r0) goto L_0x00e3
            r6.f3371a = r2
        L_0x00e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.C0821p.m3909a(androidx.fragment.app.a, androidx.fragment.app.o$a, android.util.SparseArray, boolean, boolean):void");
    }

    /* renamed from: a */
    private static C0829h m3894a(C0829h hVar, SparseArray<C0829h> sparseArray, int i) {
        if (hVar != null) {
            return hVar;
        }
        C0829h hVar2 = new C0829h();
        sparseArray.put(i, hVar2);
        return hVar2;
    }
}
