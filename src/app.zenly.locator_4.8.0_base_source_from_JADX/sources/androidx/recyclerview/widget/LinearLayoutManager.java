package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView.C1079p;
import androidx.recyclerview.widget.RecyclerView.C1082s;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutManager.C1060c;
import androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.SmoothScroller;
import androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider;
import java.util.List;

public class LinearLayoutManager extends LayoutManager implements ItemTouchHelper$ViewDropHandler, ScrollVectorProvider {

    /* renamed from: A */
    int f3925A;

    /* renamed from: B */
    int f3926B;

    /* renamed from: C */
    private boolean f3927C;

    /* renamed from: D */
    SavedState f3928D;

    /* renamed from: E */
    final C1053a f3929E;

    /* renamed from: F */
    private final C1054b f3930F;

    /* renamed from: G */
    private int f3931G;

    /* renamed from: H */
    private int[] f3932H;

    /* renamed from: s */
    int f3933s;

    /* renamed from: t */
    private C1055c f3934t;

    /* renamed from: u */
    C1136o f3935u;

    /* renamed from: v */
    private boolean f3936v;

    /* renamed from: w */
    private boolean f3937w;

    /* renamed from: x */
    boolean f3938x;

    /* renamed from: y */
    private boolean f3939y;

    /* renamed from: z */
    private boolean f3940z;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new C1052a();

        /* renamed from: e */
        int f3941e;

        /* renamed from: f */
        int f3942f;

        /* renamed from: g */
        boolean f3943g;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState$a */
        static class C1052a implements Creator<SavedState> {
            C1052a() {
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo5010a() {
            return this.f3941e >= 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo5011b() {
            this.f3941e = -1;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3941e);
            parcel.writeInt(this.f3942f);
            parcel.writeInt(this.f3943g ? 1 : 0);
        }

        SavedState(Parcel parcel) {
            this.f3941e = parcel.readInt();
            this.f3942f = parcel.readInt();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            this.f3943g = z;
        }

        public SavedState(SavedState savedState) {
            this.f3941e = savedState.f3941e;
            this.f3942f = savedState.f3942f;
            this.f3943g = savedState.f3943g;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    static class C1053a {

        /* renamed from: a */
        C1136o f3944a;

        /* renamed from: b */
        int f3945b;

        /* renamed from: c */
        int f3946c;

        /* renamed from: d */
        boolean f3947d;

        /* renamed from: e */
        boolean f3948e;

        C1053a() {
            mo5019b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5016a() {
            int i;
            if (this.f3947d) {
                i = this.f3944a.mo5748b();
            } else {
                i = this.f3944a.mo5756f();
            }
            this.f3946c = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo5019b() {
            this.f3945b = -1;
            this.f3946c = Integer.MIN_VALUE;
            this.f3947d = false;
            this.f3948e = false;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("AnchorInfo{mPosition=");
            sb.append(this.f3945b);
            sb.append(", mCoordinate=");
            sb.append(this.f3946c);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.f3947d);
            sb.append(", mValid=");
            sb.append(this.f3948e);
            sb.append('}');
            return sb.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo5018a(View view, C1082s sVar) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            return !layoutParams.mo5323c() && layoutParams.mo5321a() >= 0 && layoutParams.mo5321a() < sVar.mo5482a();
        }

        /* renamed from: b */
        public void mo5020b(View view, int i) {
            int h = this.f3944a.mo5759h();
            if (h >= 0) {
                mo5017a(view, i);
                return;
            }
            this.f3945b = i;
            if (this.f3947d) {
                int b = (this.f3944a.mo5748b() - h) - this.f3944a.mo5746a(view);
                this.f3946c = this.f3944a.mo5748b() - b;
                if (b > 0) {
                    int b2 = this.f3946c - this.f3944a.mo5749b(view);
                    int f = this.f3944a.mo5756f();
                    int min = b2 - (f + Math.min(this.f3944a.mo5753d(view) - f, 0));
                    if (min < 0) {
                        this.f3946c += Math.min(b, -min);
                    }
                }
            } else {
                int d = this.f3944a.mo5753d(view);
                int f2 = d - this.f3944a.mo5756f();
                this.f3946c = d;
                if (f2 > 0) {
                    int b3 = (this.f3944a.mo5748b() - Math.min(0, (this.f3944a.mo5748b() - h) - this.f3944a.mo5746a(view))) - (d + this.f3944a.mo5749b(view));
                    if (b3 < 0) {
                        this.f3946c -= Math.min(f2, -b3);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo5017a(View view, int i) {
            if (this.f3947d) {
                this.f3946c = this.f3944a.mo5746a(view) + this.f3944a.mo5759h();
            } else {
                this.f3946c = this.f3944a.mo5753d(view);
            }
            this.f3945b = i;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    protected static class C1054b {

        /* renamed from: a */
        public int f3949a;

        /* renamed from: b */
        public boolean f3950b;

        /* renamed from: c */
        public boolean f3951c;

        /* renamed from: d */
        public boolean f3952d;

        protected C1054b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5022a() {
            this.f3949a = 0;
            this.f3950b = false;
            this.f3951c = false;
            this.f3952d = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    static class C1055c {

        /* renamed from: a */
        boolean f3953a = true;

        /* renamed from: b */
        int f3954b;

        /* renamed from: c */
        int f3955c;

        /* renamed from: d */
        int f3956d;

        /* renamed from: e */
        int f3957e;

        /* renamed from: f */
        int f3958f;

        /* renamed from: g */
        int f3959g;

        /* renamed from: h */
        int f3960h = 0;

        /* renamed from: i */
        int f3961i = 0;

        /* renamed from: j */
        boolean f3962j;

        /* renamed from: k */
        int f3963k;

        /* renamed from: l */
        List<C1085v> f3964l = null;

        /* renamed from: m */
        boolean f3965m;

        C1055c() {
        }

        /* renamed from: b */
        private View m4832b() {
            int size = this.f3964l.size();
            for (int i = 0; i < size; i++) {
                View view = ((C1085v) this.f3964l.get(i)).itemView;
                LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                if (!layoutParams.mo5323c() && this.f3956d == layoutParams.mo5321a()) {
                    mo5025a(view);
                    return view;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo5026a(C1082s sVar) {
            int i = this.f3956d;
            return i >= 0 && i < sVar.mo5482a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public View mo5023a(C1079p pVar) {
            if (this.f3964l != null) {
                return m4832b();
            }
            View d = pVar.mo5470d(this.f3956d);
            this.f3956d += this.f3957e;
            return d;
        }

        /* renamed from: a */
        public void mo5024a() {
            mo5025a((View) null);
        }

        /* renamed from: a */
        public void mo5025a(View view) {
            View b = mo5027b(view);
            if (b == null) {
                this.f3956d = -1;
            } else {
                this.f3956d = ((LayoutParams) b.getLayoutParams()).mo5321a();
            }
        }

        /* renamed from: b */
        public View mo5027b(View view) {
            int size = this.f3964l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = ((C1085v) this.f3964l.get(i2)).itemView;
                LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.mo5323c()) {
                    int a = (layoutParams.mo5321a() - this.f3956d) * this.f3957e;
                    if (a >= 0 && a < i) {
                        view2 = view3;
                        if (a == 0) {
                            break;
                        }
                        i = a;
                    }
                }
            }
            return view2;
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    /* renamed from: Q */
    private View mo4928Q() {
        return mo5003e(0, mo5278e());
    }

    /* renamed from: R */
    private View m4742R() {
        return mo5003e(mo5278e() - 1, -1);
    }

    /* renamed from: S */
    private View m4743S() {
        if (this.f3938x) {
            return mo4928Q();
        }
        return m4742R();
    }

    /* renamed from: T */
    private View m4744T() {
        if (this.f3938x) {
            return m4742R();
        }
        return mo4928Q();
    }

    /* renamed from: U */
    private View m4745U() {
        return mo5265c(this.f3938x ? 0 : mo5278e() - 1);
    }

    /* renamed from: V */
    private View m4746V() {
        return mo5265c(this.f3938x ? mo5278e() - 1 : 0);
    }

    /* renamed from: W */
    private void m4747W() {
        if (this.f3933s == 1 || !mo4980N()) {
            this.f3938x = this.f3937w;
        } else {
            this.f3938x = !this.f3937w;
        }
    }

    /* renamed from: i */
    private int m4766i(C1082s sVar) {
        if (mo5278e() == 0) {
            return 0;
        }
        mo4974H();
        C1136o oVar = this.f3935u;
        View b = mo4996b(!this.f3940z, true);
        return C1143r.m5603a(sVar, oVar, b, mo4986a(!this.f3940z, true), this, this.f3940z);
    }

    /* renamed from: k */
    private int m4769k(C1082s sVar) {
        if (mo5278e() == 0) {
            return 0;
        }
        mo4974H();
        C1136o oVar = this.f3935u;
        View b = mo4996b(!this.f3940z, true);
        return C1143r.m5605b(sVar, oVar, b, mo4986a(!this.f3940z, true), this, this.f3940z);
    }

    /* renamed from: A */
    public Parcelable mo4971A() {
        SavedState savedState = this.f3928D;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (mo5278e() > 0) {
            mo4974H();
            boolean z = this.f3936v ^ this.f3938x;
            savedState2.f3943g = z;
            if (z) {
                View U = m4745U();
                savedState2.f3942f = this.f3935u.mo5748b() - this.f3935u.mo5746a(U);
                savedState2.f3941e = mo5298l(U);
            } else {
                View V = m4746V();
                savedState2.f3941e = mo5298l(V);
                savedState2.f3942f = this.f3935u.mo5753d(V) - this.f3935u.mo5756f();
            }
        } else {
            savedState2.mo5011b();
        }
        return savedState2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: D */
    public boolean mo4972D() {
        return (mo5291i() == 1073741824 || mo5310u() == 1073741824 || !mo5311v()) ? false : true;
    }

    /* renamed from: F */
    public boolean mo4927F() {
        return this.f3928D == null && this.f3936v == this.f3939y;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G */
    public C1055c mo4973G() {
        return new C1055c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: H */
    public void mo4974H() {
        if (this.f3934t == null) {
            this.f3934t = mo4973G();
        }
    }

    /* renamed from: I */
    public int mo4975I() {
        View a = mo4985a(0, mo5278e(), true, false);
        if (a == null) {
            return -1;
        }
        return mo5298l(a);
    }

    /* renamed from: J */
    public int mo4976J() {
        View a = mo4985a(0, mo5278e(), false, true);
        if (a == null) {
            return -1;
        }
        return mo5298l(a);
    }

    /* renamed from: K */
    public int mo4977K() {
        View a = mo4985a(mo5278e() - 1, -1, false, true);
        if (a == null) {
            return -1;
        }
        return mo5298l(a);
    }

    /* renamed from: L */
    public int mo4978L() {
        return this.f3933s;
    }

    /* renamed from: M */
    public boolean mo4979M() {
        return this.f3937w;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public boolean mo4980N() {
        return mo5295k() == 1;
    }

    /* renamed from: O */
    public boolean mo4981O() {
        return this.f3940z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: P */
    public boolean mo4982P() {
        return this.f3935u.mo5752d() == 0 && this.f3935u.mo5745a() == 0;
    }

    /* renamed from: a */
    public void mo4990a(AccessibilityEvent accessibilityEvent) {
        super.mo4990a(accessibilityEvent);
        if (mo5278e() > 0) {
            accessibilityEvent.setFromIndex(mo4976J());
            accessibilityEvent.setToIndex(mo4977K());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4937a(C1079p pVar, C1082s sVar, C1053a aVar, int i) {
    }

    /* renamed from: b */
    public void mo4997b(RecyclerView recyclerView, C1079p pVar) {
        super.mo4997b(recyclerView, pVar);
        if (this.f3927C) {
            mo5261b(pVar);
            pVar.mo5450a();
        }
    }

    /* renamed from: c */
    public LayoutParams mo4948c() {
        return new LayoutParams(-2, -2);
    }

    public PointF computeScrollVectorForPosition(int i) {
        if (mo5278e() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < mo5298l(mo5265c(0))) {
            z = true;
        }
        if (z != this.f3938x) {
            i2 = -1;
        }
        if (this.f3933s == 0) {
            return new PointF((float) i2, 0.0f);
        }
        return new PointF(0.0f, (float) i2);
    }

    /* renamed from: d */
    public int mo5002d(C1082s sVar) {
        return m4766i(sVar);
    }

    /* renamed from: e */
    public void mo4952e(C1079p pVar, C1082s sVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = -1;
        if (!(this.f3928D == null && this.f3925A == -1) && sVar.mo5482a() == 0) {
            mo5261b(pVar);
            return;
        }
        SavedState savedState = this.f3928D;
        if (savedState != null && savedState.mo5010a()) {
            this.f3925A = this.f3928D.f3941e;
        }
        mo4974H();
        this.f3934t.f3953a = false;
        m4747W();
        View g = mo5287g();
        if (!this.f3929E.f3948e || this.f3925A != -1 || this.f3928D != null) {
            this.f3929E.mo5019b();
            C1053a aVar = this.f3929E;
            aVar.f3947d = this.f3938x ^ this.f3939y;
            m4759b(pVar, sVar, aVar);
            this.f3929E.f3948e = true;
        } else if (g != null && (this.f3935u.mo5753d(g) >= this.f3935u.mo5748b() || this.f3935u.mo5746a(g) <= this.f3935u.mo5756f())) {
            this.f3929E.mo5020b(g, mo5298l(g));
        }
        C1055c cVar = this.f3934t;
        cVar.f3958f = cVar.f3963k >= 0 ? 1 : -1;
        int[] iArr = this.f3932H;
        iArr[0] = 0;
        iArr[1] = 0;
        mo4991a(sVar, iArr);
        int max = Math.max(0, this.f3932H[0]) + this.f3935u.mo5756f();
        int max2 = Math.max(0, this.f3932H[1]) + this.f3935u.mo5750c();
        if (sVar.mo5487d()) {
            int i9 = this.f3925A;
            if (!(i9 == -1 || this.f3926B == Integer.MIN_VALUE)) {
                View b = mo4995b(i9);
                if (b != null) {
                    if (this.f3938x) {
                        i6 = this.f3935u.mo5748b() - this.f3935u.mo5746a(b);
                        i7 = this.f3926B;
                    } else {
                        i7 = this.f3935u.mo5753d(b) - this.f3935u.mo5756f();
                        i6 = this.f3926B;
                    }
                    int i10 = i6 - i7;
                    if (i10 > 0) {
                        max += i10;
                    } else {
                        max2 -= i10;
                    }
                }
            }
        }
        if (!this.f3929E.f3947d ? !this.f3938x : this.f3938x) {
            i8 = 1;
        }
        mo4937a(pVar, sVar, this.f3929E, i8);
        mo5235a(pVar);
        this.f3934t.f3965m = mo4982P();
        this.f3934t.f3962j = sVar.mo5487d();
        this.f3934t.f3961i = 0;
        C1053a aVar2 = this.f3929E;
        if (aVar2.f3947d) {
            m4756b(aVar2);
            C1055c cVar2 = this.f3934t;
            cVar2.f3960h = max;
            mo4983a(pVar, cVar2, sVar, false);
            C1055c cVar3 = this.f3934t;
            i2 = cVar3.f3954b;
            int i11 = cVar3.f3956d;
            int i12 = cVar3.f3955c;
            if (i12 > 0) {
                max2 += i12;
            }
            m4750a(this.f3929E);
            C1055c cVar4 = this.f3934t;
            cVar4.f3960h = max2;
            cVar4.f3956d += cVar4.f3957e;
            mo4983a(pVar, cVar4, sVar, false);
            C1055c cVar5 = this.f3934t;
            i = cVar5.f3954b;
            int i13 = cVar5.f3955c;
            if (i13 > 0) {
                m4765h(i11, i2);
                C1055c cVar6 = this.f3934t;
                cVar6.f3960h = i13;
                mo4983a(pVar, cVar6, sVar, false);
                i2 = this.f3934t.f3954b;
            }
        } else {
            m4750a(aVar2);
            C1055c cVar7 = this.f3934t;
            cVar7.f3960h = max2;
            mo4983a(pVar, cVar7, sVar, false);
            C1055c cVar8 = this.f3934t;
            i = cVar8.f3954b;
            int i14 = cVar8.f3956d;
            int i15 = cVar8.f3955c;
            if (i15 > 0) {
                max += i15;
            }
            m4756b(this.f3929E);
            C1055c cVar9 = this.f3934t;
            cVar9.f3960h = max;
            cVar9.f3956d += cVar9.f3957e;
            mo4983a(pVar, cVar9, sVar, false);
            C1055c cVar10 = this.f3934t;
            i2 = cVar10.f3954b;
            int i16 = cVar10.f3955c;
            if (i16 > 0) {
                mo4954g(i14, i);
                C1055c cVar11 = this.f3934t;
                cVar11.f3960h = i16;
                mo4983a(pVar, cVar11, sVar, false);
                i = this.f3934t.f3954b;
            }
        }
        if (mo5278e() > 0) {
            if (this.f3938x ^ this.f3939y) {
                int a = m4748a(i, pVar, sVar, true);
                i4 = i2 + a;
                i3 = i + a;
                i5 = m4755b(i4, pVar, sVar, false);
            } else {
                int b2 = m4755b(i2, pVar, sVar, true);
                i4 = i2 + b2;
                i3 = i + b2;
                i5 = m4748a(i3, pVar, sVar, false);
            }
            i2 = i4 + i5;
            i = i3 + i5;
        }
        m4758b(pVar, sVar, i2, i);
        if (!sVar.mo5487d()) {
            this.f3935u.mo5760i();
        } else {
            this.f3929E.mo5019b();
        }
        this.f3936v = this.f3939y;
    }

    /* renamed from: f */
    public void mo5004f(int i, int i2) {
        this.f3925A = i;
        this.f3926B = i2;
        SavedState savedState = this.f3928D;
        if (savedState != null) {
            savedState.mo5011b();
        }
        mo5217B();
    }

    /* renamed from: g */
    public void mo4955g(C1082s sVar) {
        super.mo4955g(sVar);
        this.f3928D = null;
        this.f3925A = -1;
        this.f3926B = Integer.MIN_VALUE;
        this.f3929E.mo5019b();
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: h */
    public int mo5005h(C1082s sVar) {
        if (sVar.mo5486c()) {
            return this.f3935u.mo5758g();
        }
        return 0;
    }

    /* renamed from: j */
    public void mo5008j(int i) {
        if (i == 0 || i == 1) {
            mo4993a((String) null);
            if (i != this.f3933s || this.f3935u == null) {
                this.f3935u = C1136o.m5539a(this, i);
                this.f3929E.f3944a = this.f3935u;
                this.f3933s = i;
                mo5217B();
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("invalid orientation:");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public void prepareForDrop(View view, View view2, int i, int i2) {
        mo4993a("Cannot drop a view during a scroll or layout calculation");
        mo4974H();
        m4747W();
        int l = mo5298l(view);
        int l2 = mo5298l(view2);
        char c = l < l2 ? (char) 1 : 65535;
        if (this.f3938x) {
            if (c == 1) {
                mo5004f(l2, this.f3935u.mo5748b() - (this.f3935u.mo5753d(view2) + this.f3935u.mo5749b(view)));
            } else {
                mo5004f(l2, this.f3935u.mo5748b() - this.f3935u.mo5746a(view2));
            }
        } else if (c == 65535) {
            mo5004f(l2, this.f3935u.mo5753d(view2));
        } else {
            mo5004f(l2, this.f3935u.mo5746a(view2) - this.f3935u.mo5749b(view));
        }
    }

    /* renamed from: x */
    public boolean mo5009x() {
        return true;
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.f3933s = 1;
        this.f3937w = false;
        this.f3938x = false;
        this.f3939y = false;
        this.f3940z = true;
        this.f3925A = -1;
        this.f3926B = Integer.MIN_VALUE;
        this.f3928D = null;
        this.f3929E = new C1053a();
        this.f3930F = new C1054b();
        this.f3931G = 2;
        this.f3932H = new int[2];
        mo5008j(i);
        mo4998b(z);
    }

    /* renamed from: c */
    public void mo4949c(boolean z) {
        mo4993a((String) null);
        if (this.f3939y != z) {
            this.f3939y = z;
            mo5217B();
        }
    }

    /* renamed from: h */
    private void m4765h(int i, int i2) {
        this.f3934t.f3955c = i2 - this.f3935u.mo5756f();
        C1055c cVar = this.f3934t;
        cVar.f3956d = i;
        cVar.f3957e = this.f3938x ? 1 : -1;
        C1055c cVar2 = this.f3934t;
        cVar2.f3958f = -1;
        cVar2.f3954b = i2;
        cVar2.f3959g = Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public void mo4989a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f3928D = (SavedState) parcelable;
            mo5217B();
        }
    }

    /* renamed from: b */
    public boolean mo4999b() {
        return this.f3933s == 1;
    }

    /* renamed from: g */
    private void mo4954g(int i, int i2) {
        this.f3934t.f3955c = this.f3935u.mo5748b() - i2;
        this.f3934t.f3957e = this.f3938x ? -1 : 1;
        C1055c cVar = this.f3934t;
        cVar.f3956d = i;
        cVar.f3958f = 1;
        cVar.f3954b = i2;
        cVar.f3959g = Integer.MIN_VALUE;
    }

    /* renamed from: b */
    public void mo4998b(boolean z) {
        mo4993a((String) null);
        if (z != this.f3937w) {
            this.f3937w = z;
            mo5217B();
        }
    }

    /* renamed from: c */
    public int mo4947c(C1082s sVar) {
        return m4769k(sVar);
    }

    /* renamed from: f */
    public int mo4953f(C1082s sVar) {
        return m4769k(sVar);
    }

    /* renamed from: f */
    private View m4761f(C1079p pVar, C1082s sVar) {
        return mo4932a(pVar, sVar, 0, mo5278e(), sVar.mo5482a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo5000c(int i, C1079p pVar, C1082s sVar) {
        if (mo5278e() == 0 || i == 0) {
            return 0;
        }
        mo4974H();
        this.f3934t.f3953a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        m4749a(i2, abs, true, sVar);
        C1055c cVar = this.f3934t;
        int a = cVar.f3959g + mo4983a(pVar, cVar, sVar, false);
        if (a < 0) {
            return 0;
        }
        if (abs > a) {
            i = i2 * a;
        }
        this.f3935u.mo5747a(-i);
        this.f3934t.f3963k = i;
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public int mo5007i(int i) {
        int i2 = -1;
        int i3 = 1;
        if (i == 1) {
            return (this.f3933s != 1 && mo4980N()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f3933s != 1 && mo4980N()) ? -1 : 1;
        }
        if (i == 17) {
            if (this.f3933s != 0) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 33) {
            if (this.f3933s != 1) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 66) {
            if (this.f3933s != 0) {
                i3 = Integer.MIN_VALUE;
            }
            return i3;
        } else if (i != 130) {
            return Integer.MIN_VALUE;
        } else {
            if (this.f3933s != 1) {
                i3 = Integer.MIN_VALUE;
            }
            return i3;
        }
    }

    /* renamed from: j */
    private int m4768j(C1082s sVar) {
        if (mo5278e() == 0) {
            return 0;
        }
        mo4974H();
        C1136o oVar = this.f3935u;
        View b = mo4996b(!this.f3940z, true);
        return C1143r.m5604a(sVar, oVar, b, mo4986a(!this.f3940z, true), this, this.f3940z, this.f3938x);
    }

    /* renamed from: a */
    public boolean mo4994a() {
        return this.f3933s == 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4991a(C1082s sVar, int[] iArr) {
        int i;
        int h = mo5005h(sVar);
        if (this.f3934t.f3958f == -1) {
            i = 0;
        } else {
            i = h;
            h = 0;
        }
        iArr[0] = h;
        iArr[1] = i;
    }

    /* renamed from: h */
    public void mo5006h(int i) {
        this.f3925A = i;
        this.f3926B = Integer.MIN_VALUE;
        SavedState savedState = this.f3928D;
        if (savedState != null) {
            savedState.mo5011b();
        }
        mo5217B();
    }

    /* renamed from: b */
    public View mo4995b(int i) {
        int e = mo5278e();
        if (e == 0) {
            return null;
        }
        int l = i - mo5298l(mo5265c(0));
        if (l >= 0 && l < e) {
            View c = mo5265c(l);
            if (mo5298l(c) == i) {
                return c;
            }
        }
        return super.mo4995b(i);
    }

    /* renamed from: g */
    private View m4762g(C1079p pVar, C1082s sVar) {
        return mo4932a(pVar, sVar, mo5278e() - 1, -1, sVar.mo5482a());
    }

    /* renamed from: a */
    public void mo4992a(RecyclerView recyclerView, C1082s sVar, int i) {
        C1131l lVar = new C1131l(recyclerView.getContext());
        lVar.setTargetPosition(i);
        mo5260b((SmoothScroller) lVar);
    }

    /* renamed from: h */
    private View m4764h(C1079p pVar, C1082s sVar) {
        if (this.f3938x) {
            return m4761f(pVar, sVar);
        }
        return m4762g(pVar, sVar);
    }

    /* renamed from: b */
    private void m4758b(C1079p pVar, C1082s sVar, int i, int i2) {
        C1079p pVar2 = pVar;
        C1082s sVar2 = sVar;
        if (sVar.mo5488e() && mo5278e() != 0 && !sVar.mo5487d() && mo4927F()) {
            List<C1085v> f = pVar.mo5475f();
            int size = f.size();
            int l = mo5298l(mo5265c(0));
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                C1085v vVar = (C1085v) f.get(i5);
                if (!vVar.isRemoved()) {
                    char c = 1;
                    if ((vVar.getLayoutPosition() < l) != this.f3938x) {
                        c = 65535;
                    }
                    if (c == 65535) {
                        i3 += this.f3935u.mo5749b(vVar.itemView);
                    } else {
                        i4 += this.f3935u.mo5749b(vVar.itemView);
                    }
                }
            }
            this.f3934t.f3964l = f;
            if (i3 > 0) {
                m4765h(mo5298l(m4746V()), i);
                C1055c cVar = this.f3934t;
                cVar.f3960h = i3;
                cVar.f3955c = 0;
                cVar.mo5024a();
                mo4983a(pVar2, this.f3934t, sVar2, false);
            }
            if (i4 > 0) {
                mo4954g(mo5298l(m4745U()), i2);
                C1055c cVar2 = this.f3934t;
                cVar2.f3960h = i4;
                cVar2.f3955c = 0;
                cVar2.mo5024a();
                mo4983a(pVar2, this.f3934t, sVar2, false);
            }
            this.f3934t.f3964l = null;
        }
    }

    /* renamed from: i */
    private View m4767i(C1079p pVar, C1082s sVar) {
        if (this.f3938x) {
            return m4762g(pVar, sVar);
        }
        return m4761f(pVar, sVar);
    }

    /* renamed from: c */
    private void m4760c(C1079p pVar, int i, int i2) {
        if (i >= 0) {
            int i3 = i - i2;
            int e = mo5278e();
            if (!this.f3938x) {
                int i4 = 0;
                while (true) {
                    if (i4 >= e) {
                        break;
                    }
                    View c = mo5265c(i4);
                    if (this.f3935u.mo5746a(c) > i3 || this.f3935u.mo5755e(c) > i3) {
                        m4751a(pVar, 0, i4);
                    } else {
                        i4++;
                    }
                }
            } else {
                int i5 = e - 1;
                for (int i6 = i5; i6 >= 0; i6--) {
                    View c2 = mo5265c(i6);
                    if (this.f3935u.mo5746a(c2) > i3 || this.f3935u.mo5755e(c2) > i3) {
                        m4751a(pVar, i5, i6);
                        return;
                    }
                }
            }
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f3933s = 1;
        this.f3937w = false;
        this.f3938x = false;
        this.f3939y = false;
        this.f3940z = true;
        this.f3925A = -1;
        this.f3926B = Integer.MIN_VALUE;
        this.f3928D = null;
        this.f3929E = new C1053a();
        this.f3930F = new C1054b();
        this.f3931G = 2;
        this.f3932H = new int[2];
        C1060c a = LayoutManager.m4969a(context, attributeSet, i, i2);
        mo5008j(a.f4071a);
        mo4998b(a.f4073c);
        mo4949c(a.f4074d);
    }

    /* renamed from: a */
    private boolean m4753a(C1079p pVar, C1082s sVar, C1053a aVar) {
        View view;
        int i;
        boolean z = false;
        if (mo5278e() == 0) {
            return false;
        }
        View g = mo5287g();
        if (g != null && aVar.mo5018a(g, sVar)) {
            aVar.mo5020b(g, mo5298l(g));
            return true;
        } else if (this.f3936v != this.f3939y) {
            return false;
        } else {
            if (aVar.f3947d) {
                view = m4764h(pVar, sVar);
            } else {
                view = m4767i(pVar, sVar);
            }
            if (view == null) {
                return false;
            }
            aVar.mo5017a(view, mo5298l(view));
            if (!sVar.mo5487d() && mo4927F()) {
                if (this.f3935u.mo5753d(view) >= this.f3935u.mo5748b() || this.f3935u.mo5746a(view) < this.f3935u.mo5756f()) {
                    z = true;
                }
                if (z) {
                    if (aVar.f3947d) {
                        i = this.f3935u.mo5748b();
                    } else {
                        i = this.f3935u.mo5756f();
                    }
                    aVar.f3946c = i;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    private boolean m4754a(C1082s sVar, C1053a aVar) {
        int i;
        boolean z = false;
        if (!sVar.mo5487d()) {
            int i2 = this.f3925A;
            if (i2 != -1) {
                if (i2 < 0 || i2 >= sVar.mo5482a()) {
                    this.f3925A = -1;
                    this.f3926B = Integer.MIN_VALUE;
                } else {
                    aVar.f3945b = this.f3925A;
                    SavedState savedState = this.f3928D;
                    if (savedState != null && savedState.mo5010a()) {
                        aVar.f3947d = this.f3928D.f3943g;
                        if (aVar.f3947d) {
                            aVar.f3946c = this.f3935u.mo5748b() - this.f3928D.f3942f;
                        } else {
                            aVar.f3946c = this.f3935u.mo5756f() + this.f3928D.f3942f;
                        }
                        return true;
                    } else if (this.f3926B == Integer.MIN_VALUE) {
                        View b = mo4995b(this.f3925A);
                        if (b == null) {
                            if (mo5278e() > 0) {
                                if ((this.f3925A < mo5298l(mo5265c(0))) == this.f3938x) {
                                    z = true;
                                }
                                aVar.f3947d = z;
                            }
                            aVar.mo5016a();
                        } else if (this.f3935u.mo5749b(b) > this.f3935u.mo5758g()) {
                            aVar.mo5016a();
                            return true;
                        } else if (this.f3935u.mo5753d(b) - this.f3935u.mo5756f() < 0) {
                            aVar.f3946c = this.f3935u.mo5756f();
                            aVar.f3947d = false;
                            return true;
                        } else if (this.f3935u.mo5748b() - this.f3935u.mo5746a(b) < 0) {
                            aVar.f3946c = this.f3935u.mo5748b();
                            aVar.f3947d = true;
                            return true;
                        } else {
                            if (aVar.f3947d) {
                                i = this.f3935u.mo5746a(b) + this.f3935u.mo5759h();
                            } else {
                                i = this.f3935u.mo5753d(b);
                            }
                            aVar.f3946c = i;
                        }
                        return true;
                    } else {
                        boolean z2 = this.f3938x;
                        aVar.f3947d = z2;
                        if (z2) {
                            aVar.f3946c = this.f3935u.mo5748b() - this.f3926B;
                        } else {
                            aVar.f3946c = this.f3935u.mo5756f() + this.f3926B;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m4759b(C1079p pVar, C1082s sVar, C1053a aVar) {
        if (!m4754a(sVar, aVar) && !m4753a(pVar, sVar, aVar)) {
            aVar.mo5016a();
            aVar.f3945b = this.f3939y ? sVar.mo5482a() - 1 : 0;
        }
    }

    /* renamed from: b */
    private int m4755b(int i, C1079p pVar, C1082s sVar, boolean z) {
        int f = i - this.f3935u.mo5756f();
        if (f <= 0) {
            return 0;
        }
        int i2 = -mo5000c(f, pVar, sVar);
        int i3 = i + i2;
        if (z) {
            int f2 = i3 - this.f3935u.mo5756f();
            if (f2 > 0) {
                this.f3935u.mo5747a(-f2);
                i2 -= f2;
            }
        }
        return i2;
    }

    /* renamed from: b */
    private void m4756b(C1053a aVar) {
        m4765h(aVar.f3945b, aVar.f3946c);
    }

    /* renamed from: b */
    public int mo4943b(int i, C1079p pVar, C1082s sVar) {
        if (this.f3933s == 0) {
            return 0;
        }
        return mo5000c(i, pVar, sVar);
    }

    /* renamed from: b */
    public int mo4945b(C1082s sVar) {
        return m4768j(sVar);
    }

    /* renamed from: b */
    private void m4757b(C1079p pVar, int i, int i2) {
        int e = mo5278e();
        if (i >= 0) {
            int a = (this.f3935u.mo5745a() - i) + i2;
            if (this.f3938x) {
                for (int i3 = 0; i3 < e; i3++) {
                    View c = mo5265c(i3);
                    if (this.f3935u.mo5753d(c) < a || this.f3935u.mo5757f(c) < a) {
                        m4751a(pVar, 0, i3);
                        return;
                    }
                }
            } else {
                int i4 = e - 1;
                int i5 = i4;
                while (true) {
                    if (i5 < 0) {
                        break;
                    }
                    View c2 = mo5265c(i5);
                    if (this.f3935u.mo5753d(c2) < a || this.f3935u.mo5757f(c2) < a) {
                        m4751a(pVar, i4, i5);
                    } else {
                        i5--;
                    }
                }
                m4751a(pVar, i4, i5);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public View mo4996b(boolean z, boolean z2) {
        if (this.f3938x) {
            return mo4985a(mo5278e() - 1, -1, z, z2);
        }
        return mo4985a(0, mo5278e(), z, z2);
    }

    /* renamed from: a */
    private int m4748a(int i, C1079p pVar, C1082s sVar, boolean z) {
        int b = this.f3935u.mo5748b() - i;
        if (b <= 0) {
            return 0;
        }
        int i2 = -mo5000c(-b, pVar, sVar);
        int i3 = i + i2;
        if (z) {
            int b2 = this.f3935u.mo5748b() - i3;
            if (b2 > 0) {
                this.f3935u.mo5747a(b2);
                return b2 + i2;
            }
        }
        return i2;
    }

    /* renamed from: a */
    private void m4750a(C1053a aVar) {
        mo4954g(aVar.f3945b, aVar.f3946c);
    }

    /* renamed from: a */
    public int mo4929a(int i, C1079p pVar, C1082s sVar) {
        if (this.f3933s == 1) {
            return 0;
        }
        return mo5000c(i, pVar, sVar);
    }

    /* renamed from: a */
    public int mo4984a(C1082s sVar) {
        return m4766i(sVar);
    }

    /* renamed from: a */
    private void m4749a(int i, int i2, boolean z, C1082s sVar) {
        int i3;
        this.f3934t.f3965m = mo4982P();
        this.f3934t.f3958f = i;
        int[] iArr = this.f3932H;
        boolean z2 = false;
        iArr[0] = 0;
        iArr[1] = 0;
        mo4991a(sVar, iArr);
        int max = Math.max(0, this.f3932H[0]);
        int max2 = Math.max(0, this.f3932H[1]);
        if (i == 1) {
            z2 = true;
        }
        this.f3934t.f3960h = z2 ? max2 : max;
        C1055c cVar = this.f3934t;
        if (!z2) {
            max = max2;
        }
        cVar.f3961i = max;
        int i4 = -1;
        if (z2) {
            this.f3934t.f3960h += this.f3935u.mo5750c();
            View U = m4745U();
            C1055c cVar2 = this.f3934t;
            if (!this.f3938x) {
                i4 = 1;
            }
            cVar2.f3957e = i4;
            C1055c cVar3 = this.f3934t;
            int l = mo5298l(U);
            C1055c cVar4 = this.f3934t;
            cVar3.f3956d = l + cVar4.f3957e;
            cVar4.f3954b = this.f3935u.mo5746a(U);
            i3 = this.f3935u.mo5746a(U) - this.f3935u.mo5748b();
        } else {
            View V = m4746V();
            this.f3934t.f3960h += this.f3935u.mo5756f();
            C1055c cVar5 = this.f3934t;
            if (this.f3938x) {
                i4 = 1;
            }
            cVar5.f3957e = i4;
            C1055c cVar6 = this.f3934t;
            int l2 = mo5298l(V);
            C1055c cVar7 = this.f3934t;
            cVar6.f3956d = l2 + cVar7.f3957e;
            cVar7.f3954b = this.f3935u.mo5753d(V);
            i3 = (-this.f3935u.mo5753d(V)) + this.f3935u.mo5756f();
        }
        C1055c cVar8 = this.f3934t;
        cVar8.f3955c = i2;
        if (z) {
            cVar8.f3955c -= i3;
        }
        this.f3934t.f3959g = i3;
    }

    /* renamed from: e */
    public int mo4951e(C1082s sVar) {
        return m4768j(sVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public View mo5003e(int i, int i2) {
        int i3;
        int i4;
        View view;
        mo4974H();
        char c = i2 > i ? 1 : i2 < i ? (char) 65535 : 0;
        if (c == 0) {
            return mo5265c(i);
        }
        if (this.f3935u.mo5753d(mo5265c(i)) < this.f3935u.mo5756f()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        if (this.f3933s == 0) {
            view = this.f4055e.mo5802a(i, i2, i4, i3);
        } else {
            view = this.f4056f.mo5802a(i, i2, i4, i3);
        }
        return view;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4938a(C1082s sVar, C1055c cVar, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i = cVar.f3956d;
        if (i >= 0 && i < sVar.mo5482a()) {
            layoutPrefetchRegistry.addPosition(i, Math.max(0, cVar.f3959g));
        }
    }

    /* renamed from: a */
    public void mo4988a(int i, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        boolean z;
        int i2;
        SavedState savedState = this.f3928D;
        int i3 = -1;
        if (savedState == null || !savedState.mo5010a()) {
            m4747W();
            z = this.f3938x;
            i2 = this.f3925A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.f3928D;
            z = savedState2.f3943g;
            i2 = savedState2.f3941e;
        }
        if (!z) {
            i3 = 1;
        }
        int i4 = i2;
        for (int i5 = 0; i5 < this.f3931G && i4 >= 0 && i4 < i; i5++) {
            layoutPrefetchRegistry.addPosition(i4, 0);
            i4 += i3;
        }
    }

    /* renamed from: a */
    public void mo4987a(int i, int i2, C1082s sVar, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        if (this.f3933s != 0) {
            i = i2;
        }
        if (mo5278e() != 0 && i != 0) {
            mo4974H();
            m4749a(i > 0 ? 1 : -1, Math.abs(i), true, sVar);
            mo4938a(sVar, this.f3934t, layoutPrefetchRegistry);
        }
    }

    /* renamed from: a */
    public void mo4993a(String str) {
        if (this.f3928D == null) {
            super.mo4993a(str);
        }
    }

    /* renamed from: a */
    private void m4751a(C1079p pVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                for (int i3 = i2 - 1; i3 >= i; i3--) {
                    mo5222a(i3, pVar);
                }
            } else {
                while (i > i2) {
                    mo5222a(i, pVar);
                    i--;
                }
            }
        }
    }

    /* renamed from: a */
    private void m4752a(C1079p pVar, C1055c cVar) {
        if (cVar.f3953a && !cVar.f3965m) {
            int i = cVar.f3959g;
            int i2 = cVar.f3961i;
            if (cVar.f3958f == -1) {
                m4757b(pVar, i, i2);
            } else {
                m4760c(pVar, i, i2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo4983a(C1079p pVar, C1055c cVar, C1082s sVar, boolean z) {
        int i = cVar.f3955c;
        int i2 = cVar.f3959g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f3959g = i2 + i;
            }
            m4752a(pVar, cVar);
        }
        int i3 = cVar.f3955c + cVar.f3960h;
        C1054b bVar = this.f3930F;
        while (true) {
            if ((!cVar.f3965m && i3 <= 0) || !cVar.mo5026a(sVar)) {
                break;
            }
            bVar.mo5022a();
            mo4926a(pVar, sVar, cVar, bVar);
            if (!bVar.f3950b) {
                cVar.f3954b += bVar.f3949a * cVar.f3958f;
                if (!bVar.f3951c || cVar.f3964l != null || !sVar.mo5487d()) {
                    int i4 = cVar.f3955c;
                    int i5 = bVar.f3949a;
                    cVar.f3955c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.f3959g;
                if (i6 != Integer.MIN_VALUE) {
                    cVar.f3959g = i6 + bVar.f3949a;
                    int i7 = cVar.f3955c;
                    if (i7 < 0) {
                        cVar.f3959g += i7;
                    }
                    m4752a(pVar, cVar);
                }
                if (z && bVar.f3952d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f3955c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4926a(C1079p pVar, C1082s sVar, C1055c cVar, C1054b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View a = cVar.mo5023a(pVar);
        if (a == null) {
            bVar.f3950b = true;
            return;
        }
        LayoutParams layoutParams = (LayoutParams) a.getLayoutParams();
        if (cVar.f3964l == null) {
            if (this.f3938x == (cVar.f3958f == -1)) {
                mo5255b(a);
            } else {
                mo5256b(a, 0);
            }
        } else {
            if (this.f3938x == (cVar.f3958f == -1)) {
                mo5223a(a);
            } else {
                mo5224a(a, 0);
            }
        }
        mo5225a(a, 0, 0);
        bVar.f3949a = this.f3935u.mo5749b(a);
        if (this.f3933s == 1) {
            if (mo4980N()) {
                i5 = mo5309t() - mo5306q();
                i4 = i5 - this.f3935u.mo5751c(a);
            } else {
                i4 = mo5305p();
                i5 = this.f3935u.mo5751c(a) + i4;
            }
            if (cVar.f3958f == -1) {
                int i6 = cVar.f3954b;
                i = i6;
                i2 = i5;
                i3 = i6 - bVar.f3949a;
            } else {
                int i7 = cVar.f3954b;
                i3 = i7;
                i2 = i5;
                i = bVar.f3949a + i7;
            }
        } else {
            int s = mo5308s();
            int c = this.f3935u.mo5751c(a) + s;
            if (cVar.f3958f == -1) {
                int i8 = cVar.f3954b;
                i2 = i8;
                i3 = s;
                i = c;
                i4 = i8 - bVar.f3949a;
            } else {
                int i9 = cVar.f3954b;
                i3 = s;
                i2 = bVar.f3949a + i9;
                i = c;
                i4 = i9;
            }
        }
        mo5257b(a, i4, i3, i2, i);
        if (layoutParams.mo5323c() || layoutParams.mo5322b()) {
            bVar.f3951c = true;
        }
        bVar.f3952d = a.hasFocusable();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo4986a(boolean z, boolean z2) {
        if (this.f3938x) {
            return mo4985a(0, mo5278e(), z, z2);
        }
        return mo4985a(mo5278e() - 1, -1, z, z2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo4932a(C1079p pVar, C1082s sVar, int i, int i2, int i3) {
        mo4974H();
        int f = this.f3935u.mo5756f();
        int b = this.f3935u.mo5748b();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View c = mo5265c(i);
            int l = mo5298l(c);
            if (l >= 0 && l < i3) {
                if (((LayoutParams) c.getLayoutParams()).mo5323c()) {
                    if (view2 == null) {
                        view2 = c;
                    }
                } else if (this.f3935u.mo5753d(c) < b && this.f3935u.mo5746a(c) >= f) {
                    return c;
                } else {
                    if (view == null) {
                        view = c;
                    }
                }
            }
            i += i4;
        }
        if (view == null) {
            view = view2;
        }
        return view;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo4985a(int i, int i2, boolean z, boolean z2) {
        mo4974H();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        if (this.f3933s == 0) {
            return this.f4055e.mo5802a(i, i2, i4, i3);
        }
        return this.f4056f.mo5802a(i, i2, i4, i3);
    }

    /* renamed from: a */
    public View mo4931a(View view, int i, C1079p pVar, C1082s sVar) {
        View view2;
        View view3;
        m4747W();
        if (mo5278e() == 0) {
            return null;
        }
        int i2 = mo5007i(i);
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        mo4974H();
        m4749a(i2, (int) (((float) this.f3935u.mo5758g()) * 0.33333334f), false, sVar);
        C1055c cVar = this.f3934t;
        cVar.f3959g = Integer.MIN_VALUE;
        cVar.f3953a = false;
        mo4983a(pVar, cVar, sVar, true);
        if (i2 == -1) {
            view2 = m4744T();
        } else {
            view2 = m4743S();
        }
        if (i2 == -1) {
            view3 = m4746V();
        } else {
            view3 = m4745U();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }
}
