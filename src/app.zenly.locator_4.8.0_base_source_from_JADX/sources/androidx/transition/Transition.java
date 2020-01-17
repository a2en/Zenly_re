package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p214e.p228e.C7571a;
import p214e.p228e.C7576d;
import p214e.p228e.C7584g;

public abstract class Transition implements Cloneable {

    /* renamed from: K */
    private static final int[] f4534K = {2, 1, 3, 4};

    /* renamed from: L */
    private static final PathMotion f4535L = new C1204a();

    /* renamed from: M */
    private static ThreadLocal<C7571a<Animator, C1207d>> f4536M = new ThreadLocal<>();

    /* renamed from: A */
    ArrayList<Animator> f4537A = new ArrayList<>();

    /* renamed from: B */
    private int f4538B = 0;

    /* renamed from: C */
    private boolean f4539C = false;

    /* renamed from: D */
    private boolean f4540D = false;

    /* renamed from: E */
    private ArrayList<TransitionListener> f4541E = null;

    /* renamed from: F */
    private ArrayList<Animator> f4542F = new ArrayList<>();

    /* renamed from: G */
    C1239l f4543G;

    /* renamed from: H */
    private C1208e f4544H;

    /* renamed from: I */
    private C7571a<String, String> f4545I;

    /* renamed from: J */
    private PathMotion f4546J = f4535L;

    /* renamed from: e */
    private String f4547e = getClass().getName();

    /* renamed from: f */
    private long f4548f = -1;

    /* renamed from: g */
    long f4549g = -1;

    /* renamed from: h */
    private TimeInterpolator f4550h = null;

    /* renamed from: i */
    ArrayList<Integer> f4551i = new ArrayList<>();

    /* renamed from: j */
    ArrayList<View> f4552j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<String> f4553k = null;

    /* renamed from: l */
    private ArrayList<Class> f4554l = null;

    /* renamed from: m */
    private ArrayList<Integer> f4555m = null;

    /* renamed from: n */
    private ArrayList<View> f4556n = null;

    /* renamed from: o */
    private ArrayList<Class> f4557o = null;

    /* renamed from: p */
    private ArrayList<String> f4558p = null;

    /* renamed from: q */
    private ArrayList<Integer> f4559q = null;

    /* renamed from: r */
    private ArrayList<View> f4560r = null;

    /* renamed from: s */
    private ArrayList<Class> f4561s = null;

    /* renamed from: t */
    private C1242o f4562t = new C1242o();

    /* renamed from: u */
    private C1242o f4563u = new C1242o();

    /* renamed from: v */
    TransitionSet f4564v = null;

    /* renamed from: w */
    private int[] f4565w = f4534K;

    /* renamed from: x */
    private ArrayList<C1241n> f4566x;

    /* renamed from: y */
    private ArrayList<C1241n> f4567y;

    /* renamed from: z */
    boolean f4568z = false;

    public interface TransitionListener {
        void onTransitionCancel(Transition transition);

        void onTransitionEnd(Transition transition);

        void onTransitionPause(Transition transition);

        void onTransitionResume(Transition transition);

        void onTransitionStart(Transition transition);
    }

    /* renamed from: androidx.transition.Transition$a */
    static class C1204a extends PathMotion {
        C1204a() {
        }

        /* renamed from: a */
        public Path mo6002a(float f, float f2, float f3, float f4) {
            Path path = new Path();
            path.moveTo(f, f2);
            path.lineTo(f3, f4);
            return path;
        }
    }

    /* renamed from: androidx.transition.Transition$b */
    class C1205b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C7571a f4569a;

        C1205b(C7571a aVar) {
            this.f4569a = aVar;
        }

        public void onAnimationEnd(Animator animator) {
            this.f4569a.remove(animator);
            Transition.this.f4537A.remove(animator);
        }

        public void onAnimationStart(Animator animator) {
            Transition.this.f4537A.add(animator);
        }
    }

    /* renamed from: androidx.transition.Transition$c */
    class C1206c extends AnimatorListenerAdapter {
        C1206c() {
        }

        public void onAnimationEnd(Animator animator) {
            Transition.this.mo6011a();
            animator.removeListener(this);
        }
    }

    /* renamed from: androidx.transition.Transition$d */
    private static class C1207d {

        /* renamed from: a */
        View f4572a;

        /* renamed from: b */
        String f4573b;

        /* renamed from: c */
        C1241n f4574c;

        /* renamed from: d */
        C1232g0 f4575d;

        /* renamed from: e */
        Transition f4576e;

        C1207d(View view, String str, Transition transition, C1232g0 g0Var, C1241n nVar) {
            this.f4572a = view;
            this.f4573b = str;
            this.f4574c = nVar;
            this.f4575d = g0Var;
            this.f4576e = transition;
        }
    }

    /* renamed from: androidx.transition.Transition$e */
    public static abstract class C1208e {
        /* renamed from: a */
        public abstract Rect mo6052a(Transition transition);
    }

    /* renamed from: c */
    private void m5813c(View view, boolean z) {
        if (view != null) {
            int id = view.getId();
            ArrayList<Integer> arrayList = this.f4555m;
            if (arrayList == null || !arrayList.contains(Integer.valueOf(id))) {
                ArrayList<View> arrayList2 = this.f4556n;
                if (arrayList2 == null || !arrayList2.contains(view)) {
                    ArrayList<Class> arrayList3 = this.f4557o;
                    if (arrayList3 != null) {
                        int size = arrayList3.size();
                        int i = 0;
                        while (i < size) {
                            if (!((Class) this.f4557o.get(i)).isInstance(view)) {
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        C1241n nVar = new C1241n();
                        nVar.f4646b = view;
                        if (z) {
                            mo5963c(nVar);
                        } else {
                            mo5962a(nVar);
                        }
                        nVar.f4647c.add(this);
                        mo6026b(nVar);
                        if (z) {
                            m5805a(this.f4562t, view, nVar);
                        } else {
                            m5805a(this.f4563u, view, nVar);
                        }
                    }
                    if (view instanceof ViewGroup) {
                        ArrayList<Integer> arrayList4 = this.f4559q;
                        if (arrayList4 == null || !arrayList4.contains(Integer.valueOf(id))) {
                            ArrayList<View> arrayList5 = this.f4560r;
                            if (arrayList5 == null || !arrayList5.contains(view)) {
                                ArrayList<Class> arrayList6 = this.f4561s;
                                if (arrayList6 != null) {
                                    int size2 = arrayList6.size();
                                    int i2 = 0;
                                    while (i2 < size2) {
                                        if (!((Class) this.f4561s.get(i2)).isInstance(view)) {
                                            i2++;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                ViewGroup viewGroup = (ViewGroup) view;
                                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                                    m5813c(viewGroup.getChildAt(i3), z);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: q */
    private static C7571a<Animator, C1207d> mo6004q() {
        C7571a<Animator, C1207d> aVar = (C7571a) f4536M.get();
        if (aVar != null) {
            return aVar;
        }
        C7571a<Animator, C1207d> aVar2 = new C7571a<>();
        f4536M.set(aVar2);
        return aVar2;
    }

    /* renamed from: a */
    public Animator mo5961a(ViewGroup viewGroup, C1241n nVar, C1241n nVar2) {
        return null;
    }

    /* renamed from: a */
    public Transition mo6005a(long j) {
        this.f4549g = j;
        return this;
    }

    /* renamed from: a */
    public abstract void mo5962a(C1241n nVar);

    /* renamed from: b */
    public long mo6021b() {
        return this.f4549g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public Transition mo6030c(ViewGroup viewGroup) {
        return this;
    }

    /* renamed from: c */
    public abstract void mo5963c(C1241n nVar);

    /* renamed from: d */
    public Transition mo6034d(View view) {
        this.f4552j.remove(view);
        return this;
    }

    /* renamed from: e */
    public TimeInterpolator mo6035e() {
        return this.f4550h;
    }

    /* renamed from: f */
    public String mo6037f() {
        return this.f4547e;
    }

    /* renamed from: g */
    public PathMotion mo6038g() {
        return this.f4546J;
    }

    /* renamed from: h */
    public C1239l mo6039h() {
        return this.f4543G;
    }

    /* renamed from: i */
    public long mo6040i() {
        return this.f4548f;
    }

    /* renamed from: j */
    public List<Integer> mo6041j() {
        return this.f4551i;
    }

    /* renamed from: k */
    public List<String> mo6042k() {
        return this.f4553k;
    }

    /* renamed from: l */
    public List<Class> mo6043l() {
        return this.f4554l;
    }

    /* renamed from: m */
    public List<View> mo6044m() {
        return this.f4552j;
    }

    /* renamed from: n */
    public String[] mo5964n() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo6045o() {
        mo6046p();
        C7571a q = mo6004q();
        Iterator it = this.f4542F.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (q.containsKey(animator)) {
                mo6046p();
                m5804a(animator, q);
            }
        }
        this.f4542F.clear();
        mo6011a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public void mo6046p() {
        if (this.f4538B == 0) {
            ArrayList<TransitionListener> arrayList = this.f4541E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f4541E.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((TransitionListener) arrayList2.get(i)).onTransitionStart(this);
                }
            }
            this.f4540D = false;
        }
        this.f4538B++;
    }

    public String toString() {
        return mo6010a("");
    }

    /* renamed from: a */
    public Transition mo6006a(TimeInterpolator timeInterpolator) {
        this.f4550h = timeInterpolator;
        return this;
    }

    /* renamed from: b */
    public Transition mo6022b(long j) {
        this.f4548f = j;
        return this;
    }

    public Transition clone() {
        try {
            Transition transition = (Transition) super.clone();
            transition.f4542F = new ArrayList<>();
            transition.f4562t = new C1242o();
            transition.f4563u = new C1242o();
            transition.f4566x = null;
            transition.f4567y = null;
            return transition;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public C1208e mo6033d() {
        return this.f4544H;
    }

    /* renamed from: e */
    public void mo6036e(View view) {
        if (this.f4539C) {
            if (!this.f4540D) {
                C7571a q = mo6004q();
                int size = q.size();
                C1232g0 d = C1254y.m6018d(view);
                for (int i = size - 1; i >= 0; i--) {
                    C1207d dVar = (C1207d) q.mo19601d(i);
                    if (dVar.f4572a != null && d.equals(dVar.f4575d)) {
                        C1214a.m5912b((Animator) q.mo19595b(i));
                    }
                }
                ArrayList<TransitionListener> arrayList = this.f4541E;
                if (arrayList != null && arrayList.size() > 0) {
                    ArrayList arrayList2 = (ArrayList) this.f4541E.clone();
                    int size2 = arrayList2.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((TransitionListener) arrayList2.get(i2)).onTransitionResume(this);
                    }
                }
            }
            this.f4539C = false;
        }
    }

    /* renamed from: a */
    private void m5810a(C7571a<View, C1241n> aVar, C7571a<View, C1241n> aVar2, C7576d<View> dVar, C7576d<View> dVar2) {
        int a = dVar.mo19504a();
        for (int i = 0; i < a; i++) {
            View view = (View) dVar.mo19512c(i);
            if (view != null && mo6028b(view)) {
                View view2 = (View) dVar2.mo19513c(dVar.mo19505a(i));
                if (view2 != null && mo6028b(view2)) {
                    C1241n nVar = (C1241n) aVar.get(view);
                    C1241n nVar2 = (C1241n) aVar2.get(view2);
                    if (!(nVar == null || nVar2 == null)) {
                        this.f4566x.add(nVar);
                        this.f4567y.add(nVar2);
                        aVar.remove(view);
                        aVar2.remove(view2);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m5812b(C7571a<View, C1241n> aVar, C7571a<View, C1241n> aVar2) {
        for (int size = aVar.size() - 1; size >= 0; size--) {
            View view = (View) aVar.mo19595b(size);
            if (view != null && mo6028b(view)) {
                C1241n nVar = (C1241n) aVar2.remove(view);
                if (nVar != null) {
                    View view2 = nVar.f4646b;
                    if (view2 != null && mo6028b(view2)) {
                        this.f4566x.add((C1241n) aVar.mo19597c(size));
                        this.f4567y.add(nVar);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo6028b(View view) {
        int id = view.getId();
        ArrayList<Integer> arrayList = this.f4555m;
        if (arrayList != null && arrayList.contains(Integer.valueOf(id))) {
            return false;
        }
        ArrayList<View> arrayList2 = this.f4556n;
        if (arrayList2 != null && arrayList2.contains(view)) {
            return false;
        }
        ArrayList<Class> arrayList3 = this.f4557o;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            for (int i = 0; i < size; i++) {
                if (((Class) this.f4557o.get(i)).isInstance(view)) {
                    return false;
                }
            }
        }
        if (this.f4558p != null && ViewCompat.m2867t(view) != null && this.f4558p.contains(ViewCompat.m2867t(view))) {
            return false;
        }
        if (this.f4551i.size() == 0 && this.f4552j.size() == 0) {
            ArrayList<Class> arrayList4 = this.f4554l;
            if (arrayList4 == null || arrayList4.isEmpty()) {
                ArrayList<String> arrayList5 = this.f4553k;
                if (arrayList5 == null || arrayList5.isEmpty()) {
                    return true;
                }
            }
        }
        if (this.f4551i.contains(Integer.valueOf(id)) || this.f4552j.contains(view)) {
            return true;
        }
        ArrayList<String> arrayList6 = this.f4553k;
        if (arrayList6 != null && arrayList6.contains(ViewCompat.m2867t(view))) {
            return true;
        }
        if (this.f4554l != null) {
            for (int i2 = 0; i2 < this.f4554l.size(); i2++) {
                if (((Class) this.f4554l.get(i2)).isInstance(view)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m5808a(C7571a<View, C1241n> aVar, C7571a<View, C1241n> aVar2, SparseArray<View> sparseArray, SparseArray<View> sparseArray2) {
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            View view = (View) sparseArray.valueAt(i);
            if (view != null && mo6028b(view)) {
                View view2 = (View) sparseArray2.get(sparseArray.keyAt(i));
                if (view2 != null && mo6028b(view2)) {
                    C1241n nVar = (C1241n) aVar.get(view);
                    C1241n nVar2 = (C1241n) aVar2.get(view2);
                    if (!(nVar == null || nVar2 == null)) {
                        this.f4566x.add(nVar);
                        this.f4567y.add(nVar2);
                        aVar.remove(view);
                        aVar2.remove(view2);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m5809a(C7571a<View, C1241n> aVar, C7571a<View, C1241n> aVar2, C7571a<String, View> aVar3, C7571a<String, View> aVar4) {
        int size = aVar3.size();
        for (int i = 0; i < size; i++) {
            View view = (View) aVar3.mo19601d(i);
            if (view != null && mo6028b(view)) {
                View view2 = (View) aVar4.get(aVar3.mo19595b(i));
                if (view2 != null && mo6028b(view2)) {
                    C1241n nVar = (C1241n) aVar.get(view);
                    C1241n nVar2 = (C1241n) aVar2.get(view2);
                    if (!(nVar == null || nVar2 == null)) {
                        this.f4566x.add(nVar);
                        this.f4567y.add(nVar2);
                        aVar.remove(view);
                        aVar2.remove(view2);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public void mo6031c(View view) {
        if (!this.f4540D) {
            C7571a q = mo6004q();
            int size = q.size();
            C1232g0 d = C1254y.m6018d(view);
            for (int i = size - 1; i >= 0; i--) {
                C1207d dVar = (C1207d) q.mo19601d(i);
                if (dVar.f4572a != null && d.equals(dVar.f4575d)) {
                    C1214a.m5910a((Animator) q.mo19595b(i));
                }
            }
            ArrayList<TransitionListener> arrayList = this.f4541E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f4541E.clone();
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((TransitionListener) arrayList2.get(i2)).onTransitionPause(this);
                }
            }
            this.f4539C = true;
        }
    }

    /* renamed from: b */
    public C1241n mo6024b(View view, boolean z) {
        TransitionSet transitionSet = this.f4564v;
        if (transitionSet != null) {
            return transitionSet.mo6024b(view, z);
        }
        return (C1241n) (z ? this.f4562t : this.f4563u).f4648a.get(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6025b(ViewGroup viewGroup) {
        this.f4566x = new ArrayList<>();
        this.f4567y = new ArrayList<>();
        m5806a(this.f4562t, this.f4563u);
        C7571a q = mo6004q();
        int size = q.size();
        C1232g0 d = C1254y.m6018d(viewGroup);
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = (Animator) q.mo19595b(i);
            if (animator != null) {
                C1207d dVar = (C1207d) q.get(animator);
                if (!(dVar == null || dVar.f4572a == null || !d.equals(dVar.f4575d))) {
                    C1241n nVar = dVar.f4574c;
                    View view = dVar.f4572a;
                    C1241n b = mo6024b(view, true);
                    C1241n a = mo6009a(view, true);
                    if (!(b == null && a == null) && dVar.f4576e.mo6020a(nVar, a)) {
                        if (animator.isRunning() || animator.isStarted()) {
                            animator.cancel();
                        } else {
                            q.remove(animator);
                        }
                    }
                }
            }
        }
        mo6014a(viewGroup, this.f4562t, this.f4563u, this.f4566x, this.f4567y);
        mo6045o();
    }

    /* renamed from: a */
    private void m5807a(C7571a<View, C1241n> aVar, C7571a<View, C1241n> aVar2) {
        for (int i = 0; i < aVar.size(); i++) {
            C1241n nVar = (C1241n) aVar.mo19601d(i);
            if (mo6028b(nVar.f4646b)) {
                this.f4566x.add(nVar);
                this.f4567y.add(null);
            }
        }
        for (int i2 = 0; i2 < aVar2.size(); i2++) {
            C1241n nVar2 = (C1241n) aVar2.mo19601d(i2);
            if (mo6028b(nVar2.f4646b)) {
                this.f4567y.add(nVar2);
                this.f4566x.add(null);
            }
        }
    }

    /* renamed from: c */
    public Rect mo6029c() {
        C1208e eVar = this.f4544H;
        if (eVar == null) {
            return null;
        }
        return eVar.mo6052a(this);
    }

    /* renamed from: a */
    private void m5806a(C1242o oVar, C1242o oVar2) {
        C7571a aVar = new C7571a((C7584g) oVar.f4648a);
        C7571a aVar2 = new C7571a((C7584g) oVar2.f4648a);
        int i = 0;
        while (true) {
            int[] iArr = this.f4565w;
            if (i < iArr.length) {
                int i2 = iArr[i];
                if (i2 == 1) {
                    m5812b(aVar, aVar2);
                } else if (i2 == 2) {
                    m5809a(aVar, aVar2, oVar.f4651d, oVar2.f4651d);
                } else if (i2 == 3) {
                    m5808a(aVar, aVar2, oVar.f4649b, oVar2.f4649b);
                } else if (i2 == 4) {
                    m5810a(aVar, aVar2, oVar.f4650c, oVar2.f4650c);
                }
                i++;
            } else {
                m5807a(aVar, aVar2);
                return;
            }
        }
    }

    /* renamed from: b */
    public Transition mo6023b(TransitionListener transitionListener) {
        ArrayList<TransitionListener> arrayList = this.f4541E;
        if (arrayList == null) {
            return this;
        }
        arrayList.remove(transitionListener);
        if (this.f4541E.size() == 0) {
            this.f4541E = null;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6014a(ViewGroup viewGroup, C1242o oVar, C1242o oVar2, ArrayList<C1241n> arrayList, ArrayList<C1241n> arrayList2) {
        int i;
        int i2;
        View view;
        Animator animator;
        C1241n nVar;
        C1241n nVar2;
        Animator animator2;
        ViewGroup viewGroup2 = viewGroup;
        C7571a q = mo6004q();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        long j = Long.MAX_VALUE;
        int i3 = 0;
        while (i3 < size) {
            C1241n nVar3 = (C1241n) arrayList.get(i3);
            C1241n nVar4 = (C1241n) arrayList2.get(i3);
            if (nVar3 != null && !nVar3.f4647c.contains(this)) {
                nVar3 = null;
            }
            if (nVar4 != null && !nVar4.f4647c.contains(this)) {
                nVar4 = null;
            }
            if (!(nVar3 == null && nVar4 == null)) {
                if (nVar3 == null || nVar4 == null || mo6020a(nVar3, nVar4)) {
                    Animator a = mo5961a(viewGroup2, nVar3, nVar4);
                    if (a != null) {
                        if (nVar4 != null) {
                            view = nVar4.f4646b;
                            String[] n = mo5964n();
                            if (view != null && n != null && n.length > 0) {
                                nVar2 = new C1241n();
                                nVar2.f4646b = view;
                                Animator animator3 = a;
                                i2 = size;
                                C1241n nVar5 = (C1241n) oVar2.f4648a.get(view);
                                if (nVar5 != null) {
                                    int i4 = 0;
                                    while (i4 < n.length) {
                                        int i5 = i3;
                                        C1241n nVar6 = nVar5;
                                        nVar2.f4645a.put(n[i4], nVar5.f4645a.get(n[i4]));
                                        i4++;
                                        ArrayList<C1241n> arrayList3 = arrayList2;
                                        i3 = i5;
                                        nVar5 = nVar6;
                                    }
                                }
                                i = i3;
                                int size2 = q.size();
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= size2) {
                                        animator2 = animator3;
                                        break;
                                    }
                                    C1207d dVar = (C1207d) q.get((Animator) q.mo19595b(i6));
                                    if (dVar.f4574c != null && dVar.f4572a == view && dVar.f4573b.equals(mo6037f()) && dVar.f4574c.equals(nVar2)) {
                                        animator2 = null;
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                i2 = size;
                                i = i3;
                                animator2 = a;
                                nVar2 = null;
                            }
                            animator = animator2;
                            nVar = nVar2;
                        } else {
                            Animator animator4 = a;
                            i2 = size;
                            i = i3;
                            view = nVar3.f4646b;
                            animator = animator4;
                            nVar = null;
                        }
                        if (animator != null) {
                            C1239l lVar = this.f4543G;
                            if (lVar != null) {
                                long a2 = lVar.mo6091a(viewGroup2, this, nVar3, nVar4);
                                sparseIntArray.put(this.f4542F.size(), (int) a2);
                                j = Math.min(a2, j);
                            }
                            long j2 = j;
                            C1207d dVar2 = new C1207d(view, mo6037f(), this, C1254y.m6018d(viewGroup), nVar);
                            q.put(animator, dVar2);
                            this.f4542F.add(animator);
                            j = j2;
                        }
                        i3 = i + 1;
                        size = i2;
                    }
                }
            }
            i2 = size;
            i = i3;
            i3 = i + 1;
            size = i2;
        }
        if (j != 0) {
            for (int i7 = 0; i7 < sparseIntArray.size(); i7++) {
                Animator animator5 = (Animator) this.f4542F.get(sparseIntArray.keyAt(i7));
                animator5.setStartDelay((((long) sparseIntArray.valueAt(i7)) - j) + animator5.getStartDelay());
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6026b(C1241n nVar) {
        if (this.f4543G != null && !nVar.f4645a.isEmpty()) {
            String[] a = this.f4543G.mo6077a();
            if (a != null) {
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= a.length) {
                        z = true;
                        break;
                    } else if (!nVar.f4645a.containsKey(a[i])) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (!z) {
                    this.f4543G.mo6076a(nVar);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6027b(boolean z) {
        this.f4568z = z;
    }

    /* renamed from: a */
    private void m5804a(Animator animator, C7571a<Animator, C1207d> aVar) {
        if (animator != null) {
            animator.addListener(new C1205b(aVar));
            mo6012a(animator);
        }
    }

    /* renamed from: a */
    public Transition mo6007a(View view) {
        this.f4552j.add(view);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo6015a(android.view.ViewGroup r6, boolean r7) {
        /*
            r5 = this;
            r5.mo6019a(r7)
            java.util.ArrayList<java.lang.Integer> r0 = r5.f4551i
            int r0 = r0.size()
            r1 = 0
            if (r0 > 0) goto L_0x0014
            java.util.ArrayList<android.view.View> r0 = r5.f4552j
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0029
        L_0x0014:
            java.util.ArrayList<java.lang.String> r0 = r5.f4553k
            if (r0 == 0) goto L_0x001e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0029
        L_0x001e:
            java.util.ArrayList<java.lang.Class> r0 = r5.f4554l
            if (r0 == 0) goto L_0x002e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0029
            goto L_0x002e
        L_0x0029:
            r5.m5813c(r6, r7)
            goto L_0x00aa
        L_0x002e:
            r0 = 0
        L_0x002f:
            java.util.ArrayList<java.lang.Integer> r2 = r5.f4551i
            int r2 = r2.size()
            if (r0 >= r2) goto L_0x0071
            java.util.ArrayList<java.lang.Integer> r2 = r5.f4551i
            java.lang.Object r2 = r2.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            android.view.View r2 = r6.findViewById(r2)
            if (r2 == 0) goto L_0x006e
            androidx.transition.n r3 = new androidx.transition.n
            r3.<init>()
            r3.f4646b = r2
            if (r7 == 0) goto L_0x0056
            r5.mo5963c(r3)
            goto L_0x0059
        L_0x0056:
            r5.mo5962a(r3)
        L_0x0059:
            java.util.ArrayList<androidx.transition.Transition> r4 = r3.f4647c
            r4.add(r5)
            r5.mo6026b(r3)
            if (r7 == 0) goto L_0x0069
            androidx.transition.o r4 = r5.f4562t
            m5805a(r4, r2, r3)
            goto L_0x006e
        L_0x0069:
            androidx.transition.o r4 = r5.f4563u
            m5805a(r4, r2, r3)
        L_0x006e:
            int r0 = r0 + 1
            goto L_0x002f
        L_0x0071:
            r6 = 0
        L_0x0072:
            java.util.ArrayList<android.view.View> r0 = r5.f4552j
            int r0 = r0.size()
            if (r6 >= r0) goto L_0x00aa
            java.util.ArrayList<android.view.View> r0 = r5.f4552j
            java.lang.Object r0 = r0.get(r6)
            android.view.View r0 = (android.view.View) r0
            androidx.transition.n r2 = new androidx.transition.n
            r2.<init>()
            r2.f4646b = r0
            if (r7 == 0) goto L_0x008f
            r5.mo5963c(r2)
            goto L_0x0092
        L_0x008f:
            r5.mo5962a(r2)
        L_0x0092:
            java.util.ArrayList<androidx.transition.Transition> r3 = r2.f4647c
            r3.add(r5)
            r5.mo6026b(r2)
            if (r7 == 0) goto L_0x00a2
            androidx.transition.o r3 = r5.f4562t
            m5805a(r3, r0, r2)
            goto L_0x00a7
        L_0x00a2:
            androidx.transition.o r3 = r5.f4563u
            m5805a(r3, r0, r2)
        L_0x00a7:
            int r6 = r6 + 1
            goto L_0x0072
        L_0x00aa:
            if (r7 != 0) goto L_0x00ee
            e.e.a<java.lang.String, java.lang.String> r6 = r5.f4545I
            if (r6 == 0) goto L_0x00ee
            int r6 = r6.size()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r6)
            r0 = 0
        L_0x00ba:
            if (r0 >= r6) goto L_0x00d2
            e.e.a<java.lang.String, java.lang.String> r2 = r5.f4545I
            java.lang.Object r2 = r2.mo19595b(r0)
            java.lang.String r2 = (java.lang.String) r2
            androidx.transition.o r3 = r5.f4562t
            e.e.a<java.lang.String, android.view.View> r3 = r3.f4651d
            java.lang.Object r2 = r3.remove(r2)
            r7.add(r2)
            int r0 = r0 + 1
            goto L_0x00ba
        L_0x00d2:
            if (r1 >= r6) goto L_0x00ee
            java.lang.Object r0 = r7.get(r1)
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L_0x00eb
            e.e.a<java.lang.String, java.lang.String> r2 = r5.f4545I
            java.lang.Object r2 = r2.mo19601d(r1)
            java.lang.String r2 = (java.lang.String) r2
            androidx.transition.o r3 = r5.f4562t
            e.e.a<java.lang.String, android.view.View> r3 = r3.f4651d
            r3.put(r2, r0)
        L_0x00eb:
            int r1 = r1 + 1
            goto L_0x00d2
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Transition.mo6015a(android.view.ViewGroup, boolean):void");
    }

    /* renamed from: a */
    private static void m5805a(C1242o oVar, View view, C1241n nVar) {
        oVar.f4648a.put(view, nVar);
        int id = view.getId();
        if (id >= 0) {
            if (oVar.f4649b.indexOfKey(id) >= 0) {
                oVar.f4649b.put(id, null);
            } else {
                oVar.f4649b.put(id, view);
            }
        }
        String t = ViewCompat.m2867t(view);
        if (t != null) {
            if (oVar.f4651d.containsKey(t)) {
                oVar.f4651d.put(t, null);
            } else {
                oVar.f4651d.put(t, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (oVar.f4650c.mo19517d(itemIdAtPosition) >= 0) {
                    View view2 = (View) oVar.f4650c.mo19513c(itemIdAtPosition);
                    if (view2 != null) {
                        ViewCompat.m2837b(view2, false);
                        oVar.f4650c.mo19514c(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                ViewCompat.m2837b(view, true);
                oVar.f4650c.mo19514c(itemIdAtPosition, view);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6019a(boolean z) {
        if (z) {
            this.f4562t.f4648a.clear();
            this.f4562t.f4649b.clear();
            this.f4562t.f4650c.clear();
            return;
        }
        this.f4563u.f4648a.clear();
        this.f4563u.f4649b.clear();
        this.f4563u.f4650c.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C1241n mo6009a(View view, boolean z) {
        TransitionSet transitionSet = this.f4564v;
        if (transitionSet != null) {
            return transitionSet.mo6009a(view, z);
        }
        ArrayList<C1241n> arrayList = z ? this.f4566x : this.f4567y;
        C1241n nVar = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = -1;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            C1241n nVar2 = (C1241n) arrayList.get(i2);
            if (nVar2 == null) {
                return null;
            }
            if (nVar2.f4646b == view) {
                i = i2;
                break;
            }
            i2++;
        }
        if (i >= 0) {
            nVar = (C1241n) (z ? this.f4567y : this.f4566x).get(i);
        }
        return nVar;
    }

    /* renamed from: a */
    public boolean mo6020a(C1241n nVar, C1241n nVar2) {
        if (nVar == null || nVar2 == null) {
            return false;
        }
        String[] n = mo5964n();
        if (n != null) {
            int length = n.length;
            int i = 0;
            while (i < length) {
                if (!m5811a(nVar, nVar2, n[i])) {
                    i++;
                }
            }
            return false;
        }
        for (String a : nVar.f4645a.keySet()) {
            if (m5811a(nVar, nVar2, a)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: a */
    private static boolean m5811a(C1241n nVar, C1241n nVar2, String str) {
        Object obj = nVar.f4645a.get(str);
        Object obj2 = nVar2.f4645a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return true ^ obj.equals(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6012a(Animator animator) {
        if (animator == null) {
            mo6011a();
            return;
        }
        if (mo6021b() >= 0) {
            animator.setDuration(mo6021b());
        }
        if (mo6040i() >= 0) {
            animator.setStartDelay(mo6040i());
        }
        if (mo6035e() != null) {
            animator.setInterpolator(mo6035e());
        }
        animator.addListener(new C1206c());
        animator.start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6011a() {
        this.f4538B--;
        if (this.f4538B == 0) {
            ArrayList<TransitionListener> arrayList = this.f4541E;
            if (arrayList != null && arrayList.size() > 0) {
                ArrayList arrayList2 = (ArrayList) this.f4541E.clone();
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    ((TransitionListener) arrayList2.get(i)).onTransitionEnd(this);
                }
            }
            for (int i2 = 0; i2 < this.f4562t.f4650c.mo19504a(); i2++) {
                View view = (View) this.f4562t.f4650c.mo19512c(i2);
                if (view != null) {
                    ViewCompat.m2837b(view, false);
                }
            }
            for (int i3 = 0; i3 < this.f4563u.f4650c.mo19504a(); i3++) {
                View view2 = (View) this.f4563u.f4650c.mo19512c(i3);
                if (view2 != null) {
                    ViewCompat.m2837b(view2, false);
                }
            }
            this.f4540D = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6013a(ViewGroup viewGroup) {
        C7571a q = mo6004q();
        int size = q.size();
        if (viewGroup != null) {
            C1232g0 d = C1254y.m6018d(viewGroup);
            for (int i = size - 1; i >= 0; i--) {
                C1207d dVar = (C1207d) q.mo19601d(i);
                if (!(dVar.f4572a == null || d == null || !d.equals(dVar.f4575d))) {
                    ((Animator) q.mo19595b(i)).end();
                }
            }
        }
    }

    /* renamed from: a */
    public Transition mo6008a(TransitionListener transitionListener) {
        if (this.f4541E == null) {
            this.f4541E = new ArrayList<>();
        }
        this.f4541E.add(transitionListener);
        return this;
    }

    /* renamed from: a */
    public void mo6016a(PathMotion pathMotion) {
        if (pathMotion == null) {
            this.f4546J = f4535L;
        } else {
            this.f4546J = pathMotion;
        }
    }

    /* renamed from: a */
    public void mo6017a(C1208e eVar) {
        this.f4544H = eVar;
    }

    /* renamed from: a */
    public void mo6018a(C1239l lVar) {
        this.f4543G = lVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo6010a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        String sb2 = sb.toString();
        String str2 = ") ";
        if (this.f4549g != -1) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(sb2);
            sb3.append("dur(");
            sb3.append(this.f4549g);
            sb3.append(str2);
            sb2 = sb3.toString();
        }
        if (this.f4548f != -1) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(sb2);
            sb4.append("dly(");
            sb4.append(this.f4548f);
            sb4.append(str2);
            sb2 = sb4.toString();
        }
        if (this.f4550h != null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(sb2);
            sb5.append("interp(");
            sb5.append(this.f4550h);
            sb5.append(str2);
            sb2 = sb5.toString();
        }
        if (this.f4551i.size() <= 0 && this.f4552j.size() <= 0) {
            return sb2;
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(sb2);
        sb6.append("tgts(");
        String sb7 = sb6.toString();
        String str3 = ", ";
        if (this.f4551i.size() > 0) {
            String str4 = sb7;
            for (int i = 0; i < this.f4551i.size(); i++) {
                if (i > 0) {
                    StringBuilder sb8 = new StringBuilder();
                    sb8.append(str4);
                    sb8.append(str3);
                    str4 = sb8.toString();
                }
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str4);
                sb9.append(this.f4551i.get(i));
                str4 = sb9.toString();
            }
            sb7 = str4;
        }
        if (this.f4552j.size() > 0) {
            for (int i2 = 0; i2 < this.f4552j.size(); i2++) {
                if (i2 > 0) {
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append(sb7);
                    sb10.append(str3);
                    sb7 = sb10.toString();
                }
                StringBuilder sb11 = new StringBuilder();
                sb11.append(sb7);
                sb11.append(this.f4552j.get(i2));
                sb7 = sb11.toString();
            }
        }
        StringBuilder sb12 = new StringBuilder();
        sb12.append(sb7);
        sb12.append(")");
        return sb12.toString();
    }
}
