package androidx.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition.C1208e;
import androidx.transition.Transition.TransitionListener;
import java.util.ArrayList;
import java.util.Iterator;

public class TransitionSet extends Transition {

    /* renamed from: N */
    private ArrayList<Transition> f4577N = new ArrayList<>();

    /* renamed from: O */
    private boolean f4578O = true;

    /* renamed from: P */
    int f4579P;

    /* renamed from: Q */
    boolean f4580Q = false;

    /* renamed from: R */
    private int f4581R = 0;

    /* renamed from: androidx.transition.TransitionSet$a */
    class C1209a extends C1235j {

        /* renamed from: a */
        final /* synthetic */ Transition f4582a;

        C1209a(TransitionSet transitionSet, Transition transition) {
            this.f4582a = transition;
        }

        public void onTransitionEnd(Transition transition) {
            this.f4582a.mo6045o();
            transition.mo6023b((TransitionListener) this);
        }
    }

    /* renamed from: androidx.transition.TransitionSet$b */
    static class C1210b extends C1235j {

        /* renamed from: a */
        TransitionSet f4583a;

        C1210b(TransitionSet transitionSet) {
            this.f4583a = transitionSet;
        }

        public void onTransitionEnd(Transition transition) {
            TransitionSet transitionSet = this.f4583a;
            transitionSet.f4579P--;
            if (transitionSet.f4579P == 0) {
                transitionSet.f4580Q = false;
                transitionSet.mo6011a();
            }
            transition.mo6023b((TransitionListener) this);
        }

        public void onTransitionStart(Transition transition) {
            TransitionSet transitionSet = this.f4583a;
            if (!transitionSet.f4580Q) {
                transitionSet.mo6046p();
                this.f4583a.f4580Q = true;
            }
        }
    }

    /* renamed from: r */
    private void m5862r() {
        C1210b bVar = new C1210b(this);
        Iterator it = this.f4577N.iterator();
        while (it.hasNext()) {
            ((Transition) it.next()).mo6008a((TransitionListener) bVar);
        }
        this.f4579P = this.f4577N.size();
    }

    /* renamed from: e */
    public void mo6036e(View view) {
        super.mo6036e(view);
        int size = this.f4577N.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f4577N.get(i)).mo6036e(view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo6045o() {
        if (this.f4577N.isEmpty()) {
            mo6046p();
            mo6011a();
            return;
        }
        m5862r();
        if (!this.f4578O) {
            for (int i = 1; i < this.f4577N.size(); i++) {
                ((Transition) this.f4577N.get(i - 1)).mo6008a((TransitionListener) new C1209a(this, (Transition) this.f4577N.get(i)));
            }
            Transition transition = (Transition) this.f4577N.get(0);
            if (transition != null) {
                transition.mo6045o();
            }
        } else {
            Iterator it = this.f4577N.iterator();
            while (it.hasNext()) {
                ((Transition) it.next()).mo6045o();
            }
        }
    }

    /* renamed from: q */
    public int mo6004q() {
        return this.f4577N.size();
    }

    /* renamed from: c */
    public void mo5963c(C1241n nVar) {
        if (mo6028b(nVar.f4646b)) {
            Iterator it = this.f4577N.iterator();
            while (it.hasNext()) {
                Transition transition = (Transition) it.next();
                if (transition.mo6028b(nVar.f4646b)) {
                    transition.mo5963c(nVar);
                    nVar.f4647c.add(transition);
                }
            }
        }
    }

    public Transition clone() {
        TransitionSet transitionSet = (TransitionSet) super.clone();
        transitionSet.f4577N = new ArrayList<>();
        int size = this.f4577N.size();
        for (int i = 0; i < size; i++) {
            transitionSet.mo6054a(((Transition) this.f4577N.get(i)).clone());
        }
        return transitionSet;
    }

    /* renamed from: d */
    public TransitionSet m5892d(View view) {
        for (int i = 0; i < this.f4577N.size(); i++) {
            ((Transition) this.f4577N.get(i)).mo6034d(view);
        }
        super.mo6034d(view);
        return this;
    }

    /* renamed from: b */
    public TransitionSet mo6055b(int i) {
        if (i == 0) {
            this.f4578O = true;
        } else if (i == 1) {
            this.f4578O = false;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid parameter for TransitionSet ordering: ");
            sb.append(i);
            throw new AndroidRuntimeException(sb.toString());
        }
        return this;
    }

    /* renamed from: a */
    public TransitionSet mo6054a(Transition transition) {
        this.f4577N.add(transition);
        transition.f4564v = this;
        long j = this.f4549g;
        if (j >= 0) {
            transition.mo6005a(j);
        }
        if ((this.f4581R & 1) != 0) {
            transition.mo6006a(mo6035e());
        }
        if ((this.f4581R & 2) != 0) {
            transition.mo6018a(mo6039h());
        }
        if ((this.f4581R & 4) != 0) {
            transition.mo6016a(mo6038g());
        }
        if ((this.f4581R & 8) != 0) {
            transition.mo6017a(mo6033d());
        }
        return this;
    }

    /* renamed from: b */
    public TransitionSet m5883b(long j) {
        super.mo6022b(j);
        return this;
    }

    /* renamed from: b */
    public TransitionSet m5884b(TransitionListener transitionListener) {
        super.mo6023b(transitionListener);
        return this;
    }

    /* renamed from: c */
    public void mo6031c(View view) {
        super.mo6031c(view);
        int size = this.f4577N.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f4577N.get(i)).mo6031c(view);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6026b(C1241n nVar) {
        super.mo6026b(nVar);
        int size = this.f4577N.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f4577N.get(i)).mo6026b(nVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public TransitionSet m5888c(ViewGroup viewGroup) {
        super.mo6030c(viewGroup);
        int size = this.f4577N.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f4577N.get(i)).mo6030c(viewGroup);
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo6027b(boolean z) {
        super.mo6027b(z);
        int size = this.f4577N.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f4577N.get(i)).mo6027b(z);
        }
    }

    /* renamed from: a */
    public Transition mo6053a(int i) {
        if (i < 0 || i >= this.f4577N.size()) {
            return null;
        }
        return (Transition) this.f4577N.get(i);
    }

    /* renamed from: a */
    public TransitionSet m5868a(long j) {
        super.mo6005a(j);
        if (this.f4549g >= 0) {
            int size = this.f4577N.size();
            for (int i = 0; i < size; i++) {
                ((Transition) this.f4577N.get(i)).mo6005a(j);
            }
        }
        return this;
    }

    /* renamed from: a */
    public TransitionSet m5869a(TimeInterpolator timeInterpolator) {
        this.f4581R |= 1;
        ArrayList<Transition> arrayList = this.f4577N;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Transition) this.f4577N.get(i)).mo6006a(timeInterpolator);
            }
        }
        super.mo6006a(timeInterpolator);
        return this;
    }

    /* renamed from: a */
    public TransitionSet m5870a(View view) {
        for (int i = 0; i < this.f4577N.size(); i++) {
            ((Transition) this.f4577N.get(i)).mo6007a(view);
        }
        super.mo6007a(view);
        return this;
    }

    /* renamed from: a */
    public TransitionSet m5871a(TransitionListener transitionListener) {
        super.mo6008a(transitionListener);
        return this;
    }

    /* renamed from: a */
    public void mo6016a(PathMotion pathMotion) {
        super.mo6016a(pathMotion);
        this.f4581R |= 4;
        for (int i = 0; i < this.f4577N.size(); i++) {
            ((Transition) this.f4577N.get(i)).mo6016a(pathMotion);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6014a(ViewGroup viewGroup, C1242o oVar, C1242o oVar2, ArrayList<C1241n> arrayList, ArrayList<C1241n> arrayList2) {
        long i = mo6040i();
        int size = this.f4577N.size();
        for (int i2 = 0; i2 < size; i2++) {
            Transition transition = (Transition) this.f4577N.get(i2);
            if (i > 0 && (this.f4578O || i2 == 0)) {
                long i3 = transition.mo6040i();
                if (i3 > 0) {
                    transition.mo6022b(i3 + i);
                } else {
                    transition.mo6022b(i);
                }
            }
            transition.mo6014a(viewGroup, oVar, oVar2, arrayList, arrayList2);
        }
    }

    /* renamed from: a */
    public void mo5962a(C1241n nVar) {
        if (mo6028b(nVar.f4646b)) {
            Iterator it = this.f4577N.iterator();
            while (it.hasNext()) {
                Transition transition = (Transition) it.next();
                if (transition.mo6028b(nVar.f4646b)) {
                    transition.mo5962a(nVar);
                    nVar.f4647c.add(transition);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo6013a(ViewGroup viewGroup) {
        super.mo6013a(viewGroup);
        int size = this.f4577N.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f4577N.get(i)).mo6013a(viewGroup);
        }
    }

    /* renamed from: a */
    public void mo6018a(C1239l lVar) {
        super.mo6018a(lVar);
        this.f4581R |= 2;
        int size = this.f4577N.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f4577N.get(i)).mo6018a(lVar);
        }
    }

    /* renamed from: a */
    public void mo6017a(C1208e eVar) {
        super.mo6017a(eVar);
        this.f4581R |= 8;
        int size = this.f4577N.size();
        for (int i = 0; i < size; i++) {
            ((Transition) this.f4577N.get(i)).mo6017a(eVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public String mo6010a(String str) {
        String a = super.mo6010a(str);
        for (int i = 0; i < this.f4577N.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.append("\n");
            Transition transition = (Transition) this.f4577N.get(i);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("  ");
            sb.append(transition.mo6010a(sb2.toString()));
            a = sb.toString();
        }
        return a;
    }
}
