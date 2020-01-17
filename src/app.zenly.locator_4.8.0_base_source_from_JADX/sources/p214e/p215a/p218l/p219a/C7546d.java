package p214e.p215a.p218l.p219a;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;

@SuppressLint({"RestrictedAPI"})
/* renamed from: e.a.l.a.d */
class C7546d extends C7541b {

    /* renamed from: q */
    private C7547a f18963q;

    /* renamed from: r */
    private boolean f18964r;

    /* renamed from: e.a.l.a.d$a */
    static class C7547a extends C7544c {

        /* renamed from: J */
        int[][] f18965J;

        C7547a(C7547a aVar, C7546d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.f18965J = aVar.f18965J;
            } else {
                this.f18965J = new int[mo19388c()][];
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo19432a(int[] iArr, Drawable drawable) {
            int a = mo19377a(drawable);
            this.f18965J[a] = iArr;
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public void mo19329m() {
            int[][] iArr = this.f18965J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.f18965J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.f18965J = iArr2;
        }

        public Drawable newDrawable() {
            return new C7546d(this, null);
        }

        public Drawable newDrawable(Resources resources) {
            return new C7546d(this, resources);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo19431a(int[] iArr) {
            int[][] iArr2 = this.f18965J;
            int d = mo19391d();
            for (int i = 0; i < d; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        /* renamed from: a */
        public void mo19379a(int i, int i2) {
            super.mo19379a(i, i2);
            int[][] iArr = new int[i2][];
            System.arraycopy(this.f18965J, 0, iArr, 0, i);
            this.f18965J = iArr;
        }
    }

    C7546d(C7547a aVar, Resources resources) {
        mo19314a((C7544c) new C7547a(aVar, this, resources));
        onStateChange(getState());
    }

    public void applyTheme(Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    public boolean isStateful() {
        return true;
    }

    public Drawable mutate() {
        if (!this.f18964r) {
            super.mutate();
            if (this == this) {
                this.f18963q.mo19329m();
                this.f18964r = true;
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int a = this.f18963q.mo19431a(iArr);
        if (a < 0) {
            a = this.f18963q.mo19431a(StateSet.WILD_CARD);
        }
        return mo19339a(a) || onStateChange;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int[] mo19430a(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (!(attributeNameResource == 0 || attributeNameResource == 16842960 || attributeNameResource == 16843161)) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    C7546d(C7547a aVar) {
        if (aVar != null) {
            mo19314a((C7544c) aVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C7547a m18210a() {
        return new C7547a(this.f18963q, this, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo19314a(C7544c cVar) {
        super.mo19314a(cVar);
        if (cVar instanceof C7547a) {
            this.f18963q = (C7547a) cVar;
        }
    }
}
