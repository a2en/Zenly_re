package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;
import android.transition.Transition.TransitionListener;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p004os.CancellationSignal;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.fragment.app.q */
class C0830q extends C0836r {

    /* renamed from: androidx.fragment.app.q$a */
    class C0831a extends EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f3377a;

        C0831a(C0830q qVar, Rect rect) {
            this.f3377a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            return this.f3377a;
        }
    }

    /* renamed from: androidx.fragment.app.q$b */
    class C0832b implements TransitionListener {

        /* renamed from: a */
        final /* synthetic */ View f3378a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f3379b;

        C0832b(C0830q qVar, View view, ArrayList arrayList) {
            this.f3378a = view;
            this.f3379b = arrayList;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f3378a.setVisibility(8);
            int size = this.f3379b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f3379b.get(i)).setVisibility(0);
            }
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.fragment.app.q$c */
    class C0833c implements TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Object f3380a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f3381b;

        /* renamed from: c */
        final /* synthetic */ Object f3382c;

        /* renamed from: d */
        final /* synthetic */ ArrayList f3383d;

        /* renamed from: e */
        final /* synthetic */ Object f3384e;

        /* renamed from: f */
        final /* synthetic */ ArrayList f3385f;

        C0833c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f3380a = obj;
            this.f3381b = arrayList;
            this.f3382c = obj2;
            this.f3383d = arrayList2;
            this.f3384e = obj3;
            this.f3385f = arrayList3;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
            Object obj = this.f3380a;
            if (obj != null) {
                C0830q.this.mo4337a(obj, this.f3381b, null);
            }
            Object obj2 = this.f3382c;
            if (obj2 != null) {
                C0830q.this.mo4337a(obj2, this.f3383d, null);
            }
            Object obj3 = this.f3384e;
            if (obj3 != null) {
                C0830q.this.mo4337a(obj3, this.f3385f, null);
            }
        }
    }

    /* renamed from: androidx.fragment.app.q$d */
    class C0834d implements TransitionListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f3387a;

        C0834d(C0830q qVar, Runnable runnable) {
            this.f3387a = runnable;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.f3387a.run();
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: androidx.fragment.app.q$e */
    class C0835e extends EpicenterCallback {

        /* renamed from: a */
        final /* synthetic */ Rect f3388a;

        C0835e(C0830q qVar, Rect rect) {
            this.f3388a = rect;
        }

        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f3388a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f3388a;
        }
    }

    C0830q() {
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
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    /* renamed from: a */
    public void mo4336a(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition != null) {
            int i = 0;
            if (transition instanceof TransitionSet) {
                TransitionSet transitionSet = (TransitionSet) transition;
                int transitionCount = transitionSet.getTransitionCount();
                while (i < transitionCount) {
                    mo4336a((Object) transitionSet.getTransitionAt(i), arrayList);
                    i++;
                }
            } else if (!m3925a(transition) && C0836r.m3945a(transition.getTargets())) {
                int size = arrayList.size();
                while (i < size) {
                    transition.addTarget((View) arrayList.get(i));
                    i++;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo4342b(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0836r.m3944a(targets, (View) arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo4336a((Object) transitionSet, arrayList);
    }

    /* renamed from: c */
    public void mo4345c(Object obj, View view) {
        if (view != null) {
            Transition transition = (Transition) obj;
            Rect rect = new Rect();
            mo4364a(view, rect);
            transition.setEpicenterCallback(new C0831a(this, rect));
        }
    }

    /* renamed from: b */
    public Object mo4340b(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    /* renamed from: a */
    private static boolean m3925a(Transition transition) {
        return !C0836r.m3945a(transition.getTargetIds()) || !C0836r.m3945a(transition.getTargetNames()) || !C0836r.m3945a(transition.getTargetTypes());
    }

    /* renamed from: b */
    public void mo4343b(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo4337a((Object) transitionSet, arrayList, arrayList2);
        }
    }

    /* renamed from: a */
    public void mo4334a(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C0832b(this, view, arrayList));
    }

    /* renamed from: a */
    public Object mo4329a(Object obj, Object obj2, Object obj3) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        Transition transition3 = (Transition) obj3;
        if (transition != null && transition2 != null) {
            transition = new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        } else if (transition == null) {
            transition = transition2 != null ? transition2 : null;
        }
        if (transition3 == null) {
            return transition;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (transition != null) {
            transitionSet.addTransition(transition);
        }
        transitionSet.addTransition(transition3);
        return transitionSet;
    }

    /* renamed from: b */
    public void mo4341b(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    /* renamed from: a */
    public void mo4330a(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    /* renamed from: a */
    public void mo4335a(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        Transition transition = (Transition) obj;
        C0833c cVar = new C0833c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3);
        transition.addListener(cVar);
    }

    /* renamed from: a */
    public void mo4331a(Fragment fragment, Object obj, CancellationSignal cancellationSignal, Runnable runnable) {
        ((Transition) obj).addListener(new C0834d(this, runnable));
    }

    /* renamed from: a */
    public void mo4337a(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        int i;
        Transition transition = (Transition) obj;
        int i2 = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i2 < transitionCount) {
                mo4337a((Object) transitionSet.getTransitionAt(i2), arrayList, arrayList2);
                i2++;
            }
        } else if (!m3925a(transition)) {
            List targets = transition.getTargets();
            if (targets != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
                if (arrayList2 == null) {
                    i = 0;
                } else {
                    i = arrayList2.size();
                }
                while (i2 < i) {
                    transition.addTarget((View) arrayList2.get(i2));
                    i2++;
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    transition.removeTarget((View) arrayList.get(size));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo4333a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    /* renamed from: a */
    public void mo4332a(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C0835e(this, rect));
        }
    }
}
