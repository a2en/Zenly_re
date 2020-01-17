package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0836r;
import androidx.transition.Transition.C1208e;
import androidx.transition.Transition.TransitionListener;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.transition.b */
public class C1217b extends C0836r {

    /* renamed from: androidx.transition.b$a */
    class C1218a extends C1208e {

        /* renamed from: a */
        final /* synthetic */ Rect f4604a;

        C1218a(C1217b bVar, Rect rect) {
            this.f4604a = rect;
        }

        /* renamed from: a */
        public Rect mo6052a(Transition transition) {
            return this.f4604a;
        }
    }

    /* renamed from: androidx.transition.b$b */
    class C1219b implements TransitionListener {

        /* renamed from: a */
        final /* synthetic */ View f4605a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f4606b;

        C1219b(C1217b bVar, View view, ArrayList arrayList) {
            this.f4605a = view;
            this.f4606b = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.mo6023b((TransitionListener) this);
            this.f4605a.setVisibility(8);
            int size = this.f4606b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f4606b.get(i)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.transition.b$c */
    class C1220c implements TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Object f4607a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f4608b;

        /* renamed from: c */
        final /* synthetic */ Object f4609c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f4610d;

        /* renamed from: e */
        final /* synthetic */ Object f4611e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f4612f;

        C1220c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f4607a = obj;
            this.f4608b = arrayList;
            this.f4609c = obj2;
            this.f4610d = arrayList2;
            this.f4611e = obj3;
            this.f4612f = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f4607a;
            if (obj != null) {
                C1217b.this.mo4337a(obj, this.f4608b, null);
            }
            Object obj2 = this.f4609c;
            if (obj2 != null) {
                C1217b.this.mo4337a(obj2, this.f4610d, null);
            }
            Object obj3 = this.f4611e;
            if (obj3 != null) {
                C1217b.this.mo4337a(obj3, this.f4612f, null);
            }
        }
    }

    /* renamed from: androidx.transition.b$d */
    class C1221d extends C1208e {

        /* renamed from: a */
        final /* synthetic */ Rect f4614a;

        C1221d(C1217b bVar, Rect rect) {
            this.f4614a = rect;
        }

        /* renamed from: a */
        public Rect mo6052a(Transition transition) {
            Rect rect = this.f4614a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f4614a;
        }
    }

    /* renamed from: a */
    public boolean mo4338a(Object obj) {
        return obj instanceof Transition;
    }

    /* renamed from: b */
    public Object mo4339b(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    /* renamed from: c */
    public Object mo4344c(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.mo6054a((Transition) obj);
        return transitionSet;
    }

    /* renamed from: a */
    public void mo4336a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int q = transitionSet.mo6004q();
                while (i < q) {
                    mo4336a((Object) transitionSet.mo6053a(i), arrayList);
                    i++;
                }
            } else if (!m5917a(transition) && C0836r.m3945a(transition.mo6044m())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.mo6007a((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo4342b(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List m = transitionSet.mo6044m();
        m.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0836r.m3944a(m, (View) arrayList.get(i));
        }
        m.add(view);
        arrayList.add(view);
        mo4336a((Object) transitionSet, arrayList);
    }

    /* renamed from: c */
    public void mo4345c(Object obj, View view) {
        if (view != null) {
            Transition transition = (Transition) obj;
            Rect rect = new Rect();
            mo4364a(view, rect);
            transition.mo6017a((C1208e) new C1218a(this, rect));
        }
    }

    /* renamed from: b */
    public Object mo4340b(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.mo6054a((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.mo6054a((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.mo6054a((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: a */
    private static boolean m5917a(Transition transition) {
        return !C0836r.m3945a(transition.mo6041j()) || !C0836r.m3945a(transition.mo6042k()) || !C0836r.m3945a(transition.mo6043l());
    }

    /* renamed from: b */
    public void mo4343b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.mo6044m().clear();
            transitionSet.mo6044m().addAll(arrayList2);
            mo4337a((Object) transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: a */
    public void mo4334a(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).mo6008a((TransitionListener) new C1219b(this, view, arrayList));
    }

    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo4329a(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4) {
        /*
            r1 = this;
            androidx.transition.Transition r2 = (androidx.transition.Transition) r2
            androidx.transition.Transition r3 = (androidx.transition.Transition) r3
            androidx.transition.Transition r4 = (androidx.transition.Transition) r4
            if (r2 == 0) goto L_0x001b
            if (r3 == 0) goto L_0x001b
            androidx.transition.TransitionSet r0 = new androidx.transition.TransitionSet
            r0.<init>()
            r0.mo6054a(r2)
            r0.mo6054a(r3)
            r2 = 1
            r0.mo6055b(r2)
            r2 = r0
            goto L_0x0023
        L_0x001b:
            if (r2 == 0) goto L_0x001e
            goto L_0x0023
        L_0x001e:
            if (r3 == 0) goto L_0x0022
            r2 = r3
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            if (r4 == 0) goto L_0x0033
            androidx.transition.TransitionSet r3 = new androidx.transition.TransitionSet
            r3.<init>()
            if (r2 == 0) goto L_0x002f
            r3.mo6054a(r2)
        L_0x002f:
            r3.mo6054a(r4)
            return r3
        L_0x0033:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C1217b.mo4329a(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: b */
    public void mo4341b(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).mo6034d(view);
        }
    }

    /* renamed from: a */
    public void mo4330a(ViewGroup viewGroup, Object obj) {
        C1236k.m5968a(viewGroup, (Transition) obj);
    }

    /* renamed from: a */
    public void mo4335a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        Transition transition = (Transition) obj;
        C1220c cVar = new C1220c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3);
        transition.mo6008a((TransitionListener) cVar);
    }

    /* renamed from: a */
    public void mo4337a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int q = transitionSet.mo6004q();
            while (i2 < q) {
                mo4337a((Object) transitionSet.mo6053a(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!m5917a(transition)) {
            List m = transition.mo6044m();
            if (m.size() == arrayList.size() && m.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i = 0;
                } else {
                    i = arrayList2.size();
                }
                while (i2 < i) {
                    transition.mo6007a((View) arrayList2.get(i2));
                    i2++;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    transition.mo6034d((View) arrayList.get(size));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo4333a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).mo6007a(view);
        }
    }

    /* renamed from: a */
    public void mo4332a(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).mo6017a((C1208e) new C1221d(this, rect));
        }
    }
}
