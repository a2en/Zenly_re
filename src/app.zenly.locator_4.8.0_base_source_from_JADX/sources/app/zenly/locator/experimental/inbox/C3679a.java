package app.zenly.locator.experimental.inbox;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.C1144s;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p250f.p251a.p252a.p253a.p254d.C7657c;

/* renamed from: app.zenly.locator.experimental.inbox.a */
public class C3679a extends C1144s {

    /* renamed from: l */
    private static TimeInterpolator f9856l;

    /* renamed from: a */
    ArrayList<ArrayList<C1085v>> f9857a = new ArrayList<>();

    /* renamed from: b */
    ArrayList<ArrayList<C3688i>> f9858b = new ArrayList<>();

    /* renamed from: c */
    ArrayList<ArrayList<C3687h>> f9859c = new ArrayList<>();

    /* renamed from: d */
    ArrayList<C1085v> f9860d = new ArrayList<>();

    /* renamed from: e */
    ArrayList<C1085v> f9861e = new ArrayList<>();

    /* renamed from: f */
    ArrayList<C1085v> f9862f = new ArrayList<>();

    /* renamed from: g */
    ArrayList<C1085v> f9863g = new ArrayList<>();

    /* renamed from: h */
    private ArrayList<C1085v> f9864h = new ArrayList<>();

    /* renamed from: i */
    private ArrayList<C1085v> f9865i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<C3688i> f9866j = new ArrayList<>();

    /* renamed from: k */
    private ArrayList<C3687h> f9867k = new ArrayList<>();

    /* renamed from: app.zenly.locator.experimental.inbox.a$a */
    class C3680a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ ArrayList f9868e;

        C3680a(ArrayList arrayList) {
            this.f9868e = arrayList;
        }

        public void run() {
            Iterator it = this.f9868e.iterator();
            while (it.hasNext()) {
                C3688i iVar = (C3688i) it.next();
                C3679a.this.animateMoveImpl(iVar.f9898a, iVar.f9899b, iVar.f9900c, iVar.f9901d, iVar.f9902e);
            }
            this.f9868e.clear();
            C3679a.this.f9858b.remove(this.f9868e);
        }
    }

    /* renamed from: app.zenly.locator.experimental.inbox.a$b */
    class C3681b implements Runnable {

        /* renamed from: e */
        final /* synthetic */ ArrayList f9870e;

        C3681b(ArrayList arrayList) {
            this.f9870e = arrayList;
        }

        public void run() {
            Iterator it = this.f9870e.iterator();
            while (it.hasNext()) {
                C3679a.this.mo10201a((C3687h) it.next());
            }
            this.f9870e.clear();
            C3679a.this.f9859c.remove(this.f9870e);
        }
    }

    /* renamed from: app.zenly.locator.experimental.inbox.a$c */
    class C3682c implements Runnable {

        /* renamed from: e */
        final /* synthetic */ ArrayList f9872e;

        C3682c(ArrayList arrayList) {
            this.f9872e = arrayList;
        }

        public void run() {
            Iterator it = this.f9872e.iterator();
            while (it.hasNext()) {
                C3679a.this.animateAddImpl((C1085v) it.next());
            }
            this.f9872e.clear();
            C3679a.this.f9857a.remove(this.f9872e);
        }
    }

    /* renamed from: app.zenly.locator.experimental.inbox.a$d */
    class C3683d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1085v f9874a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f9875b;

        /* renamed from: c */
        final /* synthetic */ View f9876c;

        C3683d(C1085v vVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f9874a = vVar;
            this.f9875b = viewPropertyAnimator;
            this.f9876c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f9875b.setListener(null);
            this.f9876c.setAlpha(1.0f);
            this.f9876c.setTranslationY(0.0f);
            C3679a.this.dispatchRemoveFinished(this.f9874a);
            C3679a.this.f9862f.remove(this.f9874a);
            C3679a.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            C3679a.this.dispatchRemoveStarting(this.f9874a);
        }
    }

    /* renamed from: app.zenly.locator.experimental.inbox.a$e */
    class C3684e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1085v f9878a;

        /* renamed from: b */
        final /* synthetic */ int f9879b;

        /* renamed from: c */
        final /* synthetic */ View f9880c;

        /* renamed from: d */
        final /* synthetic */ int f9881d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f9882e;

        C3684e(C1085v vVar, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f9878a = vVar;
            this.f9879b = i;
            this.f9880c = view;
            this.f9881d = i2;
            this.f9882e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f9879b != 0) {
                this.f9880c.setTranslationX(0.0f);
            }
            if (this.f9881d != 0) {
                this.f9880c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f9882e.setListener(null);
            C3679a.this.dispatchMoveFinished(this.f9878a);
            C3679a.this.f9861e.remove(this.f9878a);
            C3679a.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            C3679a.this.dispatchMoveStarting(this.f9878a);
        }
    }

    /* renamed from: app.zenly.locator.experimental.inbox.a$f */
    class C3685f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C3687h f9884a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f9885b;

        /* renamed from: c */
        final /* synthetic */ View f9886c;

        C3685f(C3687h hVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f9884a = hVar;
            this.f9885b = viewPropertyAnimator;
            this.f9886c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f9885b.setListener(null);
            this.f9886c.setAlpha(1.0f);
            this.f9886c.setTranslationX(0.0f);
            this.f9886c.setTranslationY(0.0f);
            C3679a.this.dispatchChangeFinished(this.f9884a.f9892a, true);
            C3679a.this.f9863g.remove(this.f9884a.f9892a);
            C3679a.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            C3679a.this.dispatchChangeStarting(this.f9884a.f9892a, true);
        }
    }

    /* renamed from: app.zenly.locator.experimental.inbox.a$g */
    class C3686g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C3687h f9888a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f9889b;

        /* renamed from: c */
        final /* synthetic */ View f9890c;

        C3686g(C3687h hVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f9888a = hVar;
            this.f9889b = viewPropertyAnimator;
            this.f9890c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f9889b.setListener(null);
            this.f9890c.setAlpha(1.0f);
            this.f9890c.setTranslationX(0.0f);
            this.f9890c.setTranslationY(0.0f);
            C3679a.this.dispatchChangeFinished(this.f9888a.f9893b, false);
            C3679a.this.f9863g.remove(this.f9888a.f9893b);
            C3679a.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            C3679a.this.dispatchChangeStarting(this.f9888a.f9893b, false);
        }
    }

    /* renamed from: app.zenly.locator.experimental.inbox.a$h */
    private static class C3687h {

        /* renamed from: a */
        public C1085v f9892a;

        /* renamed from: b */
        public C1085v f9893b;

        /* renamed from: c */
        public int f9894c;

        /* renamed from: d */
        public int f9895d;

        /* renamed from: e */
        public int f9896e;

        /* renamed from: f */
        public int f9897f;

        private C3687h(C1085v vVar, C1085v vVar2) {
            this.f9892a = vVar;
            this.f9893b = vVar2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ChangeInfo{oldHolder=");
            sb.append(this.f9892a);
            sb.append(", newHolder=");
            sb.append(this.f9893b);
            sb.append(", fromX=");
            sb.append(this.f9894c);
            sb.append(", fromY=");
            sb.append(this.f9895d);
            sb.append(", toX=");
            sb.append(this.f9896e);
            sb.append(", toY=");
            sb.append(this.f9897f);
            sb.append('}');
            return sb.toString();
        }

        C3687h(C1085v vVar, C1085v vVar2, int i, int i2, int i3, int i4) {
            this(vVar, vVar2);
            this.f9894c = i;
            this.f9895d = i2;
            this.f9896e = i3;
            this.f9897f = i4;
        }
    }

    /* renamed from: app.zenly.locator.experimental.inbox.a$i */
    private static class C3688i {

        /* renamed from: a */
        public C1085v f9898a;

        /* renamed from: b */
        public int f9899b;

        /* renamed from: c */
        public int f9900c;

        /* renamed from: d */
        public int f9901d;

        /* renamed from: e */
        public int f9902e;

        C3688i(C1085v vVar, int i, int i2, int i3, int i4) {
            this.f9898a = vVar;
            this.f9899b = i;
            this.f9900c = i2;
            this.f9901d = i3;
            this.f9902e = i4;
        }
    }

    private void animateRemoveImpl(C1085v vVar) {
        View view = vVar.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.f9862f.add(vVar);
        animate.setDuration(getRemoveDuration()).alpha(0.0f).translationY(((float) view.getHeight()) * -0.75f).setListener(new C3683d(vVar, animate, view)).start();
    }

    /* renamed from: b */
    private void m11058b(C3687h hVar) {
        C1085v vVar = hVar.f9892a;
        if (vVar != null) {
            m11057a(hVar, vVar);
        }
        C1085v vVar2 = hVar.f9893b;
        if (vVar2 != null) {
            m11057a(hVar, vVar2);
        }
    }

    private void endChangeAnimation(List<C3687h> list, C1085v vVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C3687h hVar = (C3687h) list.get(size);
            if (m11057a(hVar, vVar) && hVar.f9892a == null && hVar.f9893b == null) {
                list.remove(hVar);
            }
        }
    }

    private void resetAnimation(C1085v vVar) {
        if (f9856l == null) {
            f9856l = new ValueAnimator().getInterpolator();
        }
        vVar.itemView.animate().setInterpolator(f9856l);
        endAnimation(vVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo10201a(C3687h hVar) {
        View view;
        C1085v vVar = hVar.f9892a;
        View view2 = null;
        if (vVar == null) {
            view = null;
        } else {
            view = vVar.itemView;
        }
        C1085v vVar2 = hVar.f9893b;
        if (vVar2 != null) {
            view2 = vVar2.itemView;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.f9863g.add(hVar.f9892a);
            duration.translationX((float) (hVar.f9896e - hVar.f9894c));
            duration.setInterpolator(C7657c.m18641a());
            duration.translationY((float) (hVar.f9897f - hVar.f9895d));
            duration.setListener(new C3685f(hVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.f9863g.add(hVar.f9893b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).setListener(new C3686g(hVar, animate, view2)).start();
        }
    }

    public boolean animateAdd(C1085v vVar) {
        resetAnimation(vVar);
        this.f9865i.add(vVar);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void animateAddImpl(C1085v vVar) {
        dispatchAddFinished(vVar);
        dispatchFinishedWhenDone();
    }

    public boolean animateChange(C1085v vVar, C1085v vVar2, int i, int i2, int i3, int i4) {
        if (vVar == vVar2) {
            return animateMove(vVar, i, i2, i3, i4);
        }
        float translationX = vVar.itemView.getTranslationX();
        float translationY = vVar.itemView.getTranslationY();
        float alpha = vVar.itemView.getAlpha();
        resetAnimation(vVar);
        int i5 = (int) (((float) (i3 - i)) - translationX);
        int i6 = (int) (((float) (i4 - i2)) - translationY);
        vVar.itemView.setTranslationX(translationX);
        vVar.itemView.setTranslationY(translationY);
        vVar.itemView.setAlpha(alpha);
        if (vVar2 != null) {
            resetAnimation(vVar2);
            vVar2.itemView.setTranslationX((float) (-i5));
            vVar2.itemView.setTranslationY((float) (-i6));
            vVar2.itemView.setAlpha(1.0f);
        }
        ArrayList<C3687h> arrayList = this.f9867k;
        C3687h hVar = new C3687h(vVar, vVar2, i, i2, i3, i4);
        arrayList.add(hVar);
        return true;
    }

    public boolean animateMove(C1085v vVar, int i, int i2, int i3, int i4) {
        View view = vVar.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) vVar.itemView.getTranslationY());
        resetAnimation(vVar);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            dispatchMoveFinished(vVar);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX((float) (-i5));
        }
        if (i6 != 0) {
            view.setTranslationY((float) (-i6));
        }
        ArrayList<C3688i> arrayList = this.f9866j;
        C3688i iVar = new C3688i(vVar, translationX, translationY, i3, i4);
        arrayList.add(iVar);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void animateMoveImpl(C1085v vVar, int i, int i2, int i3, int i4) {
        View view = vVar.itemView;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.f9861e.add(vVar);
        ViewPropertyAnimator duration = animate.setDuration(getMoveDuration());
        C3684e eVar = new C3684e(vVar, i5, view, i6, animate);
        duration.setListener(eVar).start();
    }

    public boolean animateRemove(C1085v vVar) {
        resetAnimation(vVar);
        this.f9864h.add(vVar);
        return true;
    }

    public boolean canReuseUpdatedViewHolder(C1085v vVar, List<Object> list) {
        return !list.isEmpty() || super.canReuseUpdatedViewHolder(vVar, list);
    }

    /* access modifiers changed from: 0000 */
    public void cancelAll(List<C1085v> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((C1085v) list.get(size)).itemView.animate().cancel();
        }
    }

    /* access modifiers changed from: 0000 */
    public void dispatchFinishedWhenDone() {
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    public void endAnimation(C1085v vVar) {
        View view = vVar.itemView;
        view.animate().cancel();
        int size = this.f9866j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C3688i) this.f9866j.get(size)).f9898a == vVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(vVar);
                this.f9866j.remove(size);
            }
        }
        endChangeAnimation(this.f9867k, vVar);
        if (this.f9864h.remove(vVar)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(vVar);
        }
        if (this.f9865i.remove(vVar)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(vVar);
        }
        for (int size2 = this.f9859c.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f9859c.get(size2);
            endChangeAnimation(arrayList, vVar);
            if (arrayList.isEmpty()) {
                this.f9859c.remove(size2);
            }
        }
        for (int size3 = this.f9858b.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f9858b.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C3688i) arrayList2.get(size4)).f9898a == vVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(vVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f9858b.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f9857a.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f9857a.get(size5);
            if (arrayList3.remove(vVar)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(vVar);
                if (arrayList3.isEmpty()) {
                    this.f9857a.remove(size5);
                }
            }
        }
        this.f9862f.remove(vVar);
        this.f9860d.remove(vVar);
        this.f9863g.remove(vVar);
        this.f9861e.remove(vVar);
        dispatchFinishedWhenDone();
    }

    public void endAnimations() {
        int size = this.f9866j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C3688i iVar = (C3688i) this.f9866j.get(size);
            View view = iVar.f9898a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(iVar.f9898a);
            this.f9866j.remove(size);
        }
        for (int size2 = this.f9864h.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished((C1085v) this.f9864h.get(size2));
            this.f9864h.remove(size2);
        }
        int size3 = this.f9865i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            C1085v vVar = (C1085v) this.f9865i.get(size3);
            vVar.itemView.setAlpha(1.0f);
            dispatchAddFinished(vVar);
            this.f9865i.remove(size3);
        }
        for (int size4 = this.f9867k.size() - 1; size4 >= 0; size4--) {
            m11058b((C3687h) this.f9867k.get(size4));
        }
        this.f9867k.clear();
        if (isRunning()) {
            for (int size5 = this.f9858b.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f9858b.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C3688i iVar2 = (C3688i) arrayList.get(size6);
                    View view2 = iVar2.f9898a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(iVar2.f9898a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f9858b.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f9857a.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f9857a.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    C1085v vVar2 = (C1085v) arrayList2.get(size8);
                    vVar2.itemView.setAlpha(1.0f);
                    dispatchAddFinished(vVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f9857a.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f9859c.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f9859c.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    m11058b((C3687h) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f9859c.remove(arrayList3);
                    }
                }
            }
            cancelAll(this.f9862f);
            cancelAll(this.f9861e);
            cancelAll(this.f9860d);
            cancelAll(this.f9863g);
            dispatchAnimationsFinished();
        }
    }

    public long getAddDuration() {
        return 250;
    }

    public long getMoveDuration() {
        return 250;
    }

    public long getRemoveDuration() {
        return 250;
    }

    public boolean isRunning() {
        return !this.f9865i.isEmpty() || !this.f9867k.isEmpty() || !this.f9866j.isEmpty() || !this.f9864h.isEmpty() || !this.f9861e.isEmpty() || !this.f9862f.isEmpty() || !this.f9860d.isEmpty() || !this.f9863g.isEmpty() || !this.f9858b.isEmpty() || !this.f9857a.isEmpty() || !this.f9859c.isEmpty();
    }

    public void runPendingAnimations() {
        boolean z = !this.f9864h.isEmpty();
        boolean z2 = !this.f9866j.isEmpty();
        boolean z3 = !this.f9867k.isEmpty();
        boolean z4 = !this.f9865i.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator it = this.f9864h.iterator();
            while (it.hasNext()) {
                animateRemoveImpl((C1085v) it.next());
            }
            this.f9864h.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f9866j);
                this.f9858b.add(arrayList);
                this.f9866j.clear();
                C3680a aVar = new C3680a(arrayList);
                if (z) {
                    ViewCompat.m2826a(((C3688i) arrayList.get(0)).f9898a.itemView, (Runnable) aVar);
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.f9867k);
                this.f9859c.add(arrayList2);
                this.f9867k.clear();
                C3681b bVar = new C3681b(arrayList2);
                if (z) {
                    ViewCompat.m2826a(((C3687h) arrayList2.get(0)).f9892a.itemView, (Runnable) bVar);
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.f9865i);
                this.f9857a.add(arrayList3);
                this.f9865i.clear();
                C3682c cVar = new C3682c(arrayList3);
                if (z || z2 || z3) {
                    ViewCompat.m2826a(((C1085v) arrayList3.get(0)).itemView, (Runnable) cVar);
                } else {
                    cVar.run();
                }
            }
        }
    }

    /* renamed from: a */
    private boolean m11057a(C3687h hVar, C1085v vVar) {
        boolean z = false;
        if (hVar.f9893b == vVar) {
            hVar.f9893b = null;
        } else if (hVar.f9892a != vVar) {
            return false;
        } else {
            hVar.f9892a = null;
            z = true;
        }
        vVar.itemView.setAlpha(1.0f);
        vVar.itemView.setTranslationX(0.0f);
        vVar.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(vVar, z);
        return true;
    }
}
