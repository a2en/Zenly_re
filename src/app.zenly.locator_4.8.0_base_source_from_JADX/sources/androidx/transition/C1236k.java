package androidx.transition;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.transition.Transition.TransitionListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p214e.p228e.C7571a;

/* renamed from: androidx.transition.k */
public class C1236k {

    /* renamed from: a */
    private static Transition f4635a = new AutoTransition();

    /* renamed from: b */
    private static ThreadLocal<WeakReference<C7571a<ViewGroup, ArrayList<Transition>>>> f4636b = new ThreadLocal<>();

    /* renamed from: c */
    static ArrayList<ViewGroup> f4637c = new ArrayList<>();

    /* renamed from: androidx.transition.k$a */
    private static class C1237a implements OnPreDrawListener, OnAttachStateChangeListener {

        /* renamed from: e */
        Transition f4638e;

        /* renamed from: f */
        ViewGroup f4639f;

        /* renamed from: androidx.transition.k$a$a */
        class C1238a extends C1235j {

            /* renamed from: a */
            final /* synthetic */ C7571a f4640a;

            C1238a(C7571a aVar) {
                this.f4640a = aVar;
            }

            public void onTransitionEnd(Transition transition) {
                ((ArrayList) this.f4640a.get(C1237a.this.f4639f)).remove(transition);
            }
        }

        C1237a(Transition transition, ViewGroup viewGroup) {
            this.f4638e = transition;
            this.f4639f = viewGroup;
        }

        /* renamed from: a */
        private void m5973a() {
            this.f4639f.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f4639f.removeOnAttachStateChangeListener(this);
        }

        public boolean onPreDraw() {
            m5973a();
            if (!C1236k.f4637c.remove(this.f4639f)) {
                return true;
            }
            C7571a a = C1236k.m5966a();
            ArrayList arrayList = (ArrayList) a.get(this.f4639f);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList();
                a.put(this.f4639f, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f4638e);
            this.f4638e.mo6008a((TransitionListener) new C1238a(a));
            this.f4638e.mo6015a(this.f4639f, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).mo6036e(this.f4639f);
                }
            }
            this.f4638e.mo6025b(this.f4639f);
            return true;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            m5973a();
            C1236k.f4637c.remove(this.f4639f);
            ArrayList arrayList = (ArrayList) C1236k.m5966a().get(this.f4639f);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).mo6036e(this.f4639f);
                }
            }
            this.f4638e.mo6019a(true);
        }
    }

    /* renamed from: a */
    private static void m5969a(C1233h hVar, Transition transition) {
        ViewGroup c = hVar.mo6089c();
        if (f4637c.contains(c)) {
            return;
        }
        if (transition == null) {
            hVar.mo6087a();
            return;
        }
        f4637c.add(c);
        Transition clone = transition.clone();
        clone.mo6030c(c);
        C1233h a = C1233h.m5955a(c);
        if (a != null && a.mo6090d()) {
            clone.mo6027b(true);
        }
        m5972c(c, clone);
        hVar.mo6087a();
        m5970b(c, clone);
    }

    /* renamed from: b */
    private static void m5970b(ViewGroup viewGroup, Transition transition) {
        if (transition != null && viewGroup != null) {
            C1237a aVar = new C1237a(transition, viewGroup);
            viewGroup.addOnAttachStateChangeListener(aVar);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
        }
    }

    /* renamed from: c */
    private static void m5972c(ViewGroup viewGroup, Transition transition) {
        ArrayList arrayList = (ArrayList) m5966a().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).mo6031c((View) viewGroup);
            }
        }
        if (transition != null) {
            transition.mo6015a(viewGroup, true);
        }
        C1233h a = C1233h.m5955a(viewGroup);
        if (a != null) {
            a.mo6088b();
        }
    }

    /* renamed from: b */
    public static void m5971b(C1233h hVar, Transition transition) {
        m5969a(hVar, transition);
    }

    /* renamed from: a */
    static C7571a<ViewGroup, ArrayList<Transition>> m5966a() {
        WeakReference weakReference = (WeakReference) f4636b.get();
        if (weakReference != null) {
            C7571a<ViewGroup, ArrayList<Transition>> aVar = (C7571a) weakReference.get();
            if (aVar != null) {
                return aVar;
            }
        }
        C7571a<ViewGroup, ArrayList<Transition>> aVar2 = new C7571a<>();
        f4636b.set(new WeakReference(aVar2));
        return aVar2;
    }

    /* renamed from: a */
    public static void m5968a(ViewGroup viewGroup, Transition transition) {
        if (!f4637c.contains(viewGroup) && ViewCompat.m2804D(viewGroup)) {
            f4637c.add(viewGroup);
            if (transition == null) {
                transition = f4635a;
            }
            Transition clone = transition.clone();
            m5972c(viewGroup, clone);
            C1233h.m5956a(viewGroup, null);
            m5970b(viewGroup, clone);
        }
    }

    /* renamed from: a */
    public static void m5967a(ViewGroup viewGroup) {
        f4637c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) m5966a().get(viewGroup);
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                ((Transition) arrayList2.get(size)).mo6013a(viewGroup);
            }
        }
    }
}
