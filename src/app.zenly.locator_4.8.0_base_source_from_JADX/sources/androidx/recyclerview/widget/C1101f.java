package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.f */
public class C1101f extends C1144s {
    private static final boolean DEBUG = false;
    private static TimeInterpolator sDefaultInterpolator;
    ArrayList<C1085v> mAddAnimations = new ArrayList<>();
    ArrayList<ArrayList<C1085v>> mAdditionsList = new ArrayList<>();
    ArrayList<C1085v> mChangeAnimations = new ArrayList<>();
    ArrayList<ArrayList<C1110i>> mChangesList = new ArrayList<>();
    ArrayList<C1085v> mMoveAnimations = new ArrayList<>();
    ArrayList<ArrayList<C1111j>> mMovesList = new ArrayList<>();
    private ArrayList<C1085v> mPendingAdditions = new ArrayList<>();
    private ArrayList<C1110i> mPendingChanges = new ArrayList<>();
    private ArrayList<C1111j> mPendingMoves = new ArrayList<>();
    private ArrayList<C1085v> mPendingRemovals = new ArrayList<>();
    ArrayList<C1085v> mRemoveAnimations = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.f$a */
    class C1102a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ ArrayList f4220e;

        C1102a(ArrayList arrayList) {
            this.f4220e = arrayList;
        }

        public void run() {
            Iterator it = this.f4220e.iterator();
            while (it.hasNext()) {
                C1111j jVar = (C1111j) it.next();
                C1101f.this.animateMoveImpl(jVar.f4254a, jVar.f4255b, jVar.f4256c, jVar.f4257d, jVar.f4258e);
            }
            this.f4220e.clear();
            C1101f.this.mMovesList.remove(this.f4220e);
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$b */
    class C1103b implements Runnable {

        /* renamed from: e */
        final /* synthetic */ ArrayList f4222e;

        C1103b(ArrayList arrayList) {
            this.f4222e = arrayList;
        }

        public void run() {
            Iterator it = this.f4222e.iterator();
            while (it.hasNext()) {
                C1101f.this.animateChangeImpl((C1110i) it.next());
            }
            this.f4222e.clear();
            C1101f.this.mChangesList.remove(this.f4222e);
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$c */
    class C1104c implements Runnable {

        /* renamed from: e */
        final /* synthetic */ ArrayList f4224e;

        C1104c(ArrayList arrayList) {
            this.f4224e = arrayList;
        }

        public void run() {
            Iterator it = this.f4224e.iterator();
            while (it.hasNext()) {
                C1101f.this.animateAddImpl((C1085v) it.next());
            }
            this.f4224e.clear();
            C1101f.this.mAdditionsList.remove(this.f4224e);
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$d */
    class C1105d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1085v f4226a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f4227b;

        /* renamed from: c */
        final /* synthetic */ View f4228c;

        C1105d(C1085v vVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4226a = vVar;
            this.f4227b = viewPropertyAnimator;
            this.f4228c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f4227b.setListener(null);
            this.f4228c.setAlpha(1.0f);
            C1101f.this.dispatchRemoveFinished(this.f4226a);
            C1101f.this.mRemoveAnimations.remove(this.f4226a);
            C1101f.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            C1101f.this.dispatchRemoveStarting(this.f4226a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$e */
    class C1106e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1085v f4230a;

        /* renamed from: b */
        final /* synthetic */ View f4231b;

        /* renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f4232c;

        C1106e(C1085v vVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f4230a = vVar;
            this.f4231b = view;
            this.f4232c = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            this.f4231b.setAlpha(1.0f);
        }

        public void onAnimationEnd(Animator animator) {
            this.f4232c.setListener(null);
            C1101f.this.dispatchAddFinished(this.f4230a);
            C1101f.this.mAddAnimations.remove(this.f4230a);
            C1101f.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            C1101f.this.dispatchAddStarting(this.f4230a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$f */
    class C1107f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1085v f4234a;

        /* renamed from: b */
        final /* synthetic */ int f4235b;

        /* renamed from: c */
        final /* synthetic */ View f4236c;

        /* renamed from: d */
        final /* synthetic */ int f4237d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f4238e;

        C1107f(C1085v vVar, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f4234a = vVar;
            this.f4235b = i;
            this.f4236c = view;
            this.f4237d = i2;
            this.f4238e = viewPropertyAnimator;
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f4235b != 0) {
                this.f4236c.setTranslationX(0.0f);
            }
            if (this.f4237d != 0) {
                this.f4236c.setTranslationY(0.0f);
            }
        }

        public void onAnimationEnd(Animator animator) {
            this.f4238e.setListener(null);
            C1101f.this.dispatchMoveFinished(this.f4234a);
            C1101f.this.mMoveAnimations.remove(this.f4234a);
            C1101f.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            C1101f.this.dispatchMoveStarting(this.f4234a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$g */
    class C1108g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1110i f4240a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f4241b;

        /* renamed from: c */
        final /* synthetic */ View f4242c;

        C1108g(C1110i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4240a = iVar;
            this.f4241b = viewPropertyAnimator;
            this.f4242c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f4241b.setListener(null);
            this.f4242c.setAlpha(1.0f);
            this.f4242c.setTranslationX(0.0f);
            this.f4242c.setTranslationY(0.0f);
            C1101f.this.dispatchChangeFinished(this.f4240a.f4248a, true);
            C1101f.this.mChangeAnimations.remove(this.f4240a.f4248a);
            C1101f.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            C1101f.this.dispatchChangeStarting(this.f4240a.f4248a, true);
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$h */
    class C1109h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1110i f4244a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f4245b;

        /* renamed from: c */
        final /* synthetic */ View f4246c;

        C1109h(C1110i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4244a = iVar;
            this.f4245b = viewPropertyAnimator;
            this.f4246c = view;
        }

        public void onAnimationEnd(Animator animator) {
            this.f4245b.setListener(null);
            this.f4246c.setAlpha(1.0f);
            this.f4246c.setTranslationX(0.0f);
            this.f4246c.setTranslationY(0.0f);
            C1101f.this.dispatchChangeFinished(this.f4244a.f4249b, false);
            C1101f.this.mChangeAnimations.remove(this.f4244a.f4249b);
            C1101f.this.dispatchFinishedWhenDone();
        }

        public void onAnimationStart(Animator animator) {
            C1101f.this.dispatchChangeStarting(this.f4244a.f4249b, false);
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$i */
    private static class C1110i {

        /* renamed from: a */
        public C1085v f4248a;

        /* renamed from: b */
        public C1085v f4249b;

        /* renamed from: c */
        public int f4250c;

        /* renamed from: d */
        public int f4251d;

        /* renamed from: e */
        public int f4252e;

        /* renamed from: f */
        public int f4253f;

        private C1110i(C1085v vVar, C1085v vVar2) {
            this.f4248a = vVar;
            this.f4249b = vVar2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ChangeInfo{oldHolder=");
            sb.append(this.f4248a);
            sb.append(", newHolder=");
            sb.append(this.f4249b);
            sb.append(", fromX=");
            sb.append(this.f4250c);
            sb.append(", fromY=");
            sb.append(this.f4251d);
            sb.append(", toX=");
            sb.append(this.f4252e);
            sb.append(", toY=");
            sb.append(this.f4253f);
            sb.append('}');
            return sb.toString();
        }

        C1110i(C1085v vVar, C1085v vVar2, int i, int i2, int i3, int i4) {
            this(vVar, vVar2);
            this.f4250c = i;
            this.f4251d = i2;
            this.f4252e = i3;
            this.f4253f = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.f$j */
    private static class C1111j {

        /* renamed from: a */
        public C1085v f4254a;

        /* renamed from: b */
        public int f4255b;

        /* renamed from: c */
        public int f4256c;

        /* renamed from: d */
        public int f4257d;

        /* renamed from: e */
        public int f4258e;

        C1111j(C1085v vVar, int i, int i2, int i3, int i4) {
            this.f4254a = vVar;
            this.f4255b = i;
            this.f4256c = i2;
            this.f4257d = i3;
            this.f4258e = i4;
        }
    }

    private void animateRemoveImpl(C1085v vVar) {
        View view = vVar.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.mRemoveAnimations.add(vVar);
        animate.setDuration(getRemoveDuration()).alpha(0.0f).setListener(new C1105d(vVar, animate, view)).start();
    }

    private void endChangeAnimation(List<C1110i> list, C1085v vVar) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C1110i iVar = (C1110i) list.get(size);
            if (endChangeAnimationIfNecessary(iVar, vVar) && iVar.f4248a == null && iVar.f4249b == null) {
                list.remove(iVar);
            }
        }
    }

    private void endChangeAnimationIfNecessary(C1110i iVar) {
        C1085v vVar = iVar.f4248a;
        if (vVar != null) {
            endChangeAnimationIfNecessary(iVar, vVar);
        }
        C1085v vVar2 = iVar.f4249b;
        if (vVar2 != null) {
            endChangeAnimationIfNecessary(iVar, vVar2);
        }
    }

    private void resetAnimation(C1085v vVar) {
        if (sDefaultInterpolator == null) {
            sDefaultInterpolator = new ValueAnimator().getInterpolator();
        }
        vVar.itemView.animate().setInterpolator(sDefaultInterpolator);
        endAnimation(vVar);
    }

    public boolean animateAdd(C1085v vVar) {
        resetAnimation(vVar);
        vVar.itemView.setAlpha(0.0f);
        this.mPendingAdditions.add(vVar);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void animateAddImpl(C1085v vVar) {
        View view = vVar.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.mAddAnimations.add(vVar);
        animate.alpha(1.0f).setDuration(getAddDuration()).setListener(new C1106e(vVar, view, animate)).start();
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
            vVar2.itemView.setAlpha(0.0f);
        }
        ArrayList<C1110i> arrayList = this.mPendingChanges;
        C1110i iVar = new C1110i(vVar, vVar2, i, i2, i3, i4);
        arrayList.add(iVar);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void animateChangeImpl(C1110i iVar) {
        View view;
        C1085v vVar = iVar.f4248a;
        View view2 = null;
        if (vVar == null) {
            view = null;
        } else {
            view = vVar.itemView;
        }
        C1085v vVar2 = iVar.f4249b;
        if (vVar2 != null) {
            view2 = vVar2.itemView;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.mChangeAnimations.add(iVar.f4248a);
            duration.translationX((float) (iVar.f4252e - iVar.f4250c));
            duration.translationY((float) (iVar.f4253f - iVar.f4251d));
            duration.alpha(0.0f).setListener(new C1108g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.mChangeAnimations.add(iVar.f4249b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new C1109h(iVar, animate, view2)).start();
        }
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
        ArrayList<C1111j> arrayList = this.mPendingMoves;
        C1111j jVar = new C1111j(vVar, translationX, translationY, i3, i4);
        arrayList.add(jVar);
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
        this.mMoveAnimations.add(vVar);
        ViewPropertyAnimator duration = animate.setDuration(getMoveDuration());
        C1107f fVar = new C1107f(vVar, i5, view, i6, animate);
        duration.setListener(fVar).start();
    }

    public boolean animateRemove(C1085v vVar) {
        resetAnimation(vVar);
        this.mPendingRemovals.add(vVar);
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
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C1111j) this.mPendingMoves.get(size)).f4254a == vVar) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(vVar);
                this.mPendingMoves.remove(size);
            }
        }
        endChangeAnimation(this.mPendingChanges, vVar);
        if (this.mPendingRemovals.remove(vVar)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(vVar);
        }
        if (this.mPendingAdditions.remove(vVar)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(vVar);
        }
        for (int size2 = this.mChangesList.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.mChangesList.get(size2);
            endChangeAnimation(arrayList, vVar);
            if (arrayList.isEmpty()) {
                this.mChangesList.remove(size2);
            }
        }
        for (int size3 = this.mMovesList.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.mMovesList.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (((C1111j) arrayList2.get(size4)).f4254a == vVar) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(vVar);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.mMovesList.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.mAdditionsList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.mAdditionsList.get(size5);
            if (arrayList3.remove(vVar)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(vVar);
                if (arrayList3.isEmpty()) {
                    this.mAdditionsList.remove(size5);
                }
            }
        }
        this.mRemoveAnimations.remove(vVar);
        this.mAddAnimations.remove(vVar);
        this.mChangeAnimations.remove(vVar);
        this.mMoveAnimations.remove(vVar);
        dispatchFinishedWhenDone();
    }

    public void endAnimations() {
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1111j jVar = (C1111j) this.mPendingMoves.get(size);
            View view = jVar.f4254a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(jVar.f4254a);
            this.mPendingMoves.remove(size);
        }
        for (int size2 = this.mPendingRemovals.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished((C1085v) this.mPendingRemovals.get(size2));
            this.mPendingRemovals.remove(size2);
        }
        int size3 = this.mPendingAdditions.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            C1085v vVar = (C1085v) this.mPendingAdditions.get(size3);
            vVar.itemView.setAlpha(1.0f);
            dispatchAddFinished(vVar);
            this.mPendingAdditions.remove(size3);
        }
        for (int size4 = this.mPendingChanges.size() - 1; size4 >= 0; size4--) {
            endChangeAnimationIfNecessary((C1110i) this.mPendingChanges.get(size4));
        }
        this.mPendingChanges.clear();
        if (isRunning()) {
            for (int size5 = this.mMovesList.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.mMovesList.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    C1111j jVar2 = (C1111j) arrayList.get(size6);
                    View view2 = jVar2.f4254a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(jVar2.f4254a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.mMovesList.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.mAdditionsList.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.mAdditionsList.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    C1085v vVar2 = (C1085v) arrayList2.get(size8);
                    vVar2.itemView.setAlpha(1.0f);
                    dispatchAddFinished(vVar2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.mAdditionsList.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.mChangesList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.mChangesList.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    endChangeAnimationIfNecessary((C1110i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.mChangesList.remove(arrayList3);
                    }
                }
            }
            cancelAll(this.mRemoveAnimations);
            cancelAll(this.mMoveAnimations);
            cancelAll(this.mAddAnimations);
            cancelAll(this.mChangeAnimations);
            dispatchAnimationsFinished();
        }
    }

    public boolean isRunning() {
        return !this.mPendingAdditions.isEmpty() || !this.mPendingChanges.isEmpty() || !this.mPendingMoves.isEmpty() || !this.mPendingRemovals.isEmpty() || !this.mMoveAnimations.isEmpty() || !this.mRemoveAnimations.isEmpty() || !this.mAddAnimations.isEmpty() || !this.mChangeAnimations.isEmpty() || !this.mMovesList.isEmpty() || !this.mAdditionsList.isEmpty() || !this.mChangesList.isEmpty();
    }

    public void runPendingAnimations() {
        boolean z = !this.mPendingRemovals.isEmpty();
        boolean z2 = !this.mPendingMoves.isEmpty();
        boolean z3 = !this.mPendingChanges.isEmpty();
        boolean z4 = !this.mPendingAdditions.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator it = this.mPendingRemovals.iterator();
            while (it.hasNext()) {
                animateRemoveImpl((C1085v) it.next());
            }
            this.mPendingRemovals.clear();
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.mPendingMoves);
                this.mMovesList.add(arrayList);
                this.mPendingMoves.clear();
                C1102a aVar = new C1102a(arrayList);
                if (z) {
                    ViewCompat.m2827a(((C1111j) arrayList.get(0)).f4254a.itemView, (Runnable) aVar, getRemoveDuration());
                } else {
                    aVar.run();
                }
            }
            if (z3) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(this.mPendingChanges);
                this.mChangesList.add(arrayList2);
                this.mPendingChanges.clear();
                C1103b bVar = new C1103b(arrayList2);
                if (z) {
                    ViewCompat.m2827a(((C1110i) arrayList2.get(0)).f4248a.itemView, (Runnable) bVar, getRemoveDuration());
                } else {
                    bVar.run();
                }
            }
            if (z4) {
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(this.mPendingAdditions);
                this.mAdditionsList.add(arrayList3);
                this.mPendingAdditions.clear();
                C1104c cVar = new C1104c(arrayList3);
                if (z || z2 || z3) {
                    long j = 0;
                    long removeDuration = z ? getRemoveDuration() : 0;
                    long moveDuration = z2 ? getMoveDuration() : 0;
                    if (z3) {
                        j = getChangeDuration();
                    }
                    ViewCompat.m2827a(((C1085v) arrayList3.get(0)).itemView, (Runnable) cVar, removeDuration + Math.max(moveDuration, j));
                } else {
                    cVar.run();
                }
            }
        }
    }

    private boolean endChangeAnimationIfNecessary(C1110i iVar, C1085v vVar) {
        boolean z = false;
        if (iVar.f4249b == vVar) {
            iVar.f4249b = null;
        } else if (iVar.f4248a != vVar) {
            return false;
        } else {
            iVar.f4248a = null;
            z = true;
        }
        vVar.itemView.setAlpha(1.0f);
        vVar.itemView.setTranslationX(0.0f);
        vVar.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(vVar, z);
        return true;
    }
}
