package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.core.view.accessibility.C0628c;
import androidx.core.view.accessibility.C0628c.C0631c;
import androidx.recyclerview.widget.RecyclerView.C1079p;
import androidx.recyclerview.widget.RecyclerView.C1082s;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry;
import java.util.Arrays;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: I */
    boolean f3910I = false;

    /* renamed from: J */
    int f3911J = -1;

    /* renamed from: K */
    int[] f3912K;

    /* renamed from: L */
    View[] f3913L;

    /* renamed from: M */
    final SparseIntArray f3914M = new SparseIntArray();

    /* renamed from: N */
    final SparseIntArray f3915N = new SparseIntArray();

    /* renamed from: O */
    C1051b f3916O = new C1050a();

    /* renamed from: P */
    final Rect f3917P = new Rect();

    /* renamed from: Q */
    private boolean f3918Q;

    public static class LayoutParams extends androidx.recyclerview.widget.RecyclerView.LayoutParams {

        /* renamed from: e */
        int f3919e = -1;

        /* renamed from: f */
        int f3920f = 0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: e */
        public int mo4957e() {
            return this.f3919e;
        }

        /* renamed from: f */
        public int mo4958f() {
            return this.f3920f;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C1050a extends C1051b {
        /* renamed from: a */
        public int mo4959a(int i) {
            return 1;
        }

        /* renamed from: d */
        public int mo4960d(int i, int i2) {
            return i % i2;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static abstract class C1051b {

        /* renamed from: a */
        final SparseIntArray f3921a = new SparseIntArray();

        /* renamed from: b */
        final SparseIntArray f3922b = new SparseIntArray();

        /* renamed from: c */
        private boolean f3923c = false;

        /* renamed from: d */
        private boolean f3924d = false;

        /* renamed from: a */
        public abstract int mo4959a(int i);

        /* renamed from: a */
        public void mo4962a() {
            this.f3922b.clear();
        }

        /* renamed from: b */
        public void mo4964b() {
            this.f3921a.clear();
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x002f  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo4965c(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.f3924d
                r1 = 0
                if (r0 == 0) goto L_0x0026
                android.util.SparseIntArray r0 = r6.f3922b
                int r0 = m4733a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L_0x0026
                android.util.SparseIntArray r2 = r6.f3922b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.mo4963b(r0, r8)
                int r0 = r6.mo4959a(r0)
                int r0 = r0 + r4
                if (r0 != r8) goto L_0x0029
                int r0 = r2 + 1
                r2 = r0
                r0 = 0
                goto L_0x0029
            L_0x0026:
                r0 = 0
                r2 = 0
                r3 = 0
            L_0x0029:
                int r4 = r6.mo4959a(r7)
            L_0x002d:
                if (r3 >= r7) goto L_0x0042
                int r5 = r6.mo4959a(r3)
                int r0 = r0 + r5
                if (r0 != r8) goto L_0x003a
                int r2 = r2 + 1
                r0 = 0
                goto L_0x003f
            L_0x003a:
                if (r0 <= r8) goto L_0x003f
                int r2 = r2 + 1
                r0 = r5
            L_0x003f:
                int r3 = r3 + 1
                goto L_0x002d
            L_0x0042:
                int r0 = r0 + r4
                if (r0 <= r8) goto L_0x0047
                int r2 = r2 + 1
            L_0x0047:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.C1051b.mo4965c(int, int):int");
        }

        /* renamed from: d */
        public abstract int mo4960d(int i, int i2);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo4961a(int i, int i2) {
            if (!this.f3924d) {
                return mo4965c(i, i2);
            }
            int i3 = this.f3922b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int c = mo4965c(i, i2);
            this.f3922b.put(i, c);
            return c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo4963b(int i, int i2) {
            if (!this.f3923c) {
                return mo4960d(i, i2);
            }
            int i3 = this.f3921a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int d = mo4960d(i, i2);
            this.f3921a.put(i, d);
            return d;
        }

        /* renamed from: a */
        static int m4733a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo4956k(LayoutManager.m4969a(context, attributeSet, i, i2).f4072b);
    }

    /* renamed from: R */
    private void m4682R() {
        int e = mo5278e();
        for (int i = 0; i < e; i++) {
            LayoutParams layoutParams = (LayoutParams) mo5265c(i).getLayoutParams();
            int a = layoutParams.mo5321a();
            this.f3914M.put(a, layoutParams.mo4958f());
            this.f3915N.put(a, layoutParams.mo4957e());
        }
    }

    /* renamed from: S */
    private void m4683S() {
        this.f3914M.clear();
        this.f3915N.clear();
    }

    /* renamed from: T */
    private void m4684T() {
        View[] viewArr = this.f3913L;
        if (viewArr == null || viewArr.length != this.f3911J) {
            this.f3913L = new View[this.f3911J];
        }
    }

    /* renamed from: U */
    private void m4685U() {
        int i;
        int i2;
        if (mo4978L() == 1) {
            i2 = mo5309t() - mo5306q();
            i = mo5305p();
        } else {
            i2 = mo5289h() - mo5301n();
            i = mo5308s();
        }
        m4697l(i2 - i);
    }

    /* renamed from: i */
    private int m4695i(C1082s sVar) {
        int i;
        if (!(mo5278e() == 0 || sVar.mo5482a() == 0)) {
            mo4974H();
            boolean O = mo4981O();
            View b = mo4996b(!O, true);
            View a = mo4986a(!O, true);
            if (!(b == null || a == null)) {
                int a2 = this.f3916O.mo4961a(mo5298l(b), this.f3911J);
                int a3 = this.f3916O.mo4961a(mo5298l(a), this.f3911J);
                int min = Math.min(a2, a3);
                int max = Math.max(a2, a3);
                int a4 = this.f3916O.mo4961a(sVar.mo5482a() - 1, this.f3911J) + 1;
                if (this.f3938x) {
                    i = Math.max(0, (a4 - max) - 1);
                } else {
                    i = Math.max(0, min);
                }
                if (!O) {
                    return i;
                }
                return Math.round((((float) i) * (((float) Math.abs(this.f3935u.mo5746a(a) - this.f3935u.mo5753d(b))) / ((float) ((this.f3916O.mo4961a(mo5298l(a), this.f3911J) - this.f3916O.mo4961a(mo5298l(b), this.f3911J)) + 1)))) + ((float) (this.f3935u.mo5756f() - this.f3935u.mo5753d(b))));
            }
        }
        return 0;
    }

    /* renamed from: j */
    private int m4696j(C1082s sVar) {
        if (!(mo5278e() == 0 || sVar.mo5482a() == 0)) {
            mo4974H();
            View b = mo4996b(!mo4981O(), true);
            View a = mo4986a(!mo4981O(), true);
            if (!(b == null || a == null)) {
                if (!mo4981O()) {
                    return this.f3916O.mo4961a(sVar.mo5482a() - 1, this.f3911J) + 1;
                }
                int a2 = this.f3935u.mo5746a(a) - this.f3935u.mo5753d(b);
                int a3 = this.f3916O.mo4961a(mo5298l(b), this.f3911J);
                return (int) ((((float) a2) / ((float) ((this.f3916O.mo4961a(mo5298l(a), this.f3911J) - a3) + 1))) * ((float) (this.f3916O.mo4961a(sVar.mo5482a() - 1, this.f3911J) + 1)));
            }
        }
        return 0;
    }

    /* renamed from: l */
    private void m4697l(int i) {
        this.f3912K = m4691a(this.f3912K, this.f3911J, i);
    }

    /* renamed from: F */
    public boolean mo4927F() {
        return this.f3928D == null && !this.f3910I;
    }

    /* renamed from: Q */
    public int mo4928Q() {
        return this.f3911J;
    }

    /* renamed from: a */
    public int mo4930a(C1079p pVar, C1082s sVar) {
        if (this.f3933s == 1) {
            return this.f3911J;
        }
        if (sVar.mo5482a() < 1) {
            return 0;
        }
        return m4686a(pVar, sVar, sVar.mo5482a() - 1) + 1;
    }

    /* renamed from: b */
    public int mo4944b(C1079p pVar, C1082s sVar) {
        if (this.f3933s == 0) {
            return this.f3911J;
        }
        if (sVar.mo5482a() < 1) {
            return 0;
        }
        return m4686a(pVar, sVar, sVar.mo5482a() - 1) + 1;
    }

    /* renamed from: c */
    public void mo4949c(boolean z) {
        if (!z) {
            super.mo4949c(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* renamed from: d */
    public void mo4950d(RecyclerView recyclerView) {
        this.f3916O.mo4964b();
        this.f3916O.mo4962a();
    }

    /* renamed from: e */
    public void mo4952e(C1079p pVar, C1082s sVar) {
        if (sVar.mo5487d()) {
            m4682R();
        }
        super.mo4952e(pVar, sVar);
        m4683S();
    }

    /* renamed from: f */
    public int mo4953f(C1082s sVar) {
        if (this.f3918Q) {
            return m4696j(sVar);
        }
        return super.mo4953f(sVar);
    }

    /* renamed from: g */
    public void mo4955g(C1082s sVar) {
        super.mo4955g(sVar);
        this.f3910I = false;
    }

    /* renamed from: k */
    public void mo4956k(int i) {
        if (i != this.f3911J) {
            this.f3910I = true;
            if (i >= 1) {
                this.f3911J = i;
                this.f3916O.mo4964b();
                mo5217B();
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Span count should be at least 1. Provided ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: c */
    public androidx.recyclerview.widget.RecyclerView.LayoutParams mo4948c() {
        if (this.f3933s == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo4954g(int i, int i2) {
        if (this.f3933s != 1 || !mo4980N()) {
            int[] iArr = this.f3912K;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f3912K;
        int i3 = this.f3911J;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* renamed from: a */
    public void mo4936a(C1079p pVar, C1082s sVar, View view, C0628c cVar) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.mo5229a(view, cVar);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int a = m4686a(pVar, sVar, layoutParams2.mo5321a());
        if (this.f3933s == 0) {
            cVar.mo3331b((Object) C0631c.m2982a(layoutParams2.mo4957e(), layoutParams2.mo4958f(), a, 1, false, false));
        } else {
            cVar.mo3331b((Object) C0631c.m2982a(a, 1, layoutParams2.mo4957e(), layoutParams2.mo4958f(), false, false));
        }
    }

    /* renamed from: b */
    public void mo4946b(RecyclerView recyclerView, int i, int i2) {
        this.f3916O.mo4964b();
        this.f3916O.mo4962a();
    }

    /* renamed from: e */
    public int mo4951e(C1082s sVar) {
        if (this.f3918Q) {
            return m4695i(sVar);
        }
        return super.mo4951e(sVar);
    }

    /* renamed from: c */
    private int m4694c(C1079p pVar, C1082s sVar, int i) {
        if (!sVar.mo5487d()) {
            return this.f3916O.mo4959a(i);
        }
        int i2 = this.f3914M.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = pVar.mo5446a(i);
        if (a != -1) {
            return this.f3916O.mo4959a(a);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb.append(i);
        Log.w("GridLayoutManager", sb.toString());
        return 1;
    }

    /* renamed from: b */
    public int mo4943b(int i, C1079p pVar, C1082s sVar) {
        m4685U();
        m4684T();
        return super.mo4943b(i, pVar, sVar);
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        mo4956k(i);
    }

    /* renamed from: b */
    private void m4693b(C1079p pVar, C1082s sVar, C1053a aVar, int i) {
        boolean z = i == 1;
        int b = m4692b(pVar, sVar, aVar.f3945b);
        if (z) {
            while (b > 0) {
                int i2 = aVar.f3945b;
                if (i2 > 0) {
                    aVar.f3945b = i2 - 1;
                    b = m4692b(pVar, sVar, aVar.f3945b);
                } else {
                    return;
                }
            }
            return;
        }
        int a = sVar.mo5482a() - 1;
        int i3 = aVar.f3945b;
        while (i3 < a) {
            int i4 = i3 + 1;
            int b2 = m4692b(pVar, sVar, i4);
            if (b2 <= b) {
                break;
            }
            i3 = i4;
            b = b2;
        }
        aVar.f3945b = i3;
    }

    /* renamed from: c */
    public int mo4947c(C1082s sVar) {
        if (this.f3918Q) {
            return m4696j(sVar);
        }
        return super.mo4947c(sVar);
    }

    /* renamed from: a */
    public void mo4939a(RecyclerView recyclerView, int i, int i2) {
        this.f3916O.mo4964b();
        this.f3916O.mo4962a();
    }

    /* renamed from: a */
    public void mo4941a(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.f3916O.mo4964b();
        this.f3916O.mo4962a();
    }

    /* renamed from: b */
    private int m4692b(C1079p pVar, C1082s sVar, int i) {
        if (!sVar.mo5487d()) {
            return this.f3916O.mo4963b(i, this.f3911J);
        }
        int i2 = this.f3915N.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int a = pVar.mo5446a(i);
        if (a != -1) {
            return this.f3916O.mo4963b(a, this.f3911J);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
        sb.append(i);
        Log.w("GridLayoutManager", sb.toString());
        return 0;
    }

    /* renamed from: a */
    public void mo4940a(RecyclerView recyclerView, int i, int i2, int i3) {
        this.f3916O.mo4964b();
        this.f3916O.mo4962a();
    }

    /* renamed from: a */
    public androidx.recyclerview.widget.RecyclerView.LayoutParams mo4933a(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: a */
    public androidx.recyclerview.widget.RecyclerView.LayoutParams mo4934a(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* renamed from: b */
    public int mo4945b(C1082s sVar) {
        if (this.f3918Q) {
            return m4695i(sVar);
        }
        return super.mo4945b(sVar);
    }

    /* renamed from: a */
    public boolean mo4942a(androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: a */
    public void mo4935a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f3912K == null) {
            super.mo4935a(rect, i, i2);
        }
        int p = mo5305p() + mo5306q();
        int s = mo5308s() + mo5301n();
        if (this.f3933s == 1) {
            i4 = LayoutManager.m4967a(i2, rect.height() + s, mo5297l());
            int[] iArr = this.f3912K;
            i3 = LayoutManager.m4967a(i, iArr[iArr.length - 1] + p, mo5299m());
        } else {
            i3 = LayoutManager.m4967a(i, rect.width() + p, mo5299m());
            int[] iArr2 = this.f3912K;
            i4 = LayoutManager.m4967a(i2, iArr2[iArr2.length - 1] + s, mo5297l());
        }
        mo5267c(i3, i4);
    }

    /* renamed from: a */
    static int[] m4691a(int[] iArr, int i, int i2) {
        int i3;
        if (!(iArr != null && iArr.length == i + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4937a(C1079p pVar, C1082s sVar, C1053a aVar, int i) {
        super.mo4937a(pVar, sVar, aVar, i);
        m4685U();
        if (sVar.mo5482a() > 0 && !sVar.mo5487d()) {
            m4693b(pVar, sVar, aVar, i);
        }
        m4684T();
    }

    /* renamed from: a */
    public int mo4929a(int i, C1079p pVar, C1082s sVar) {
        m4685U();
        m4684T();
        return super.mo4929a(i, pVar, sVar);
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
            if (l >= 0 && l < i3 && m4692b(pVar, sVar, l) == 0) {
                if (((androidx.recyclerview.widget.RecyclerView.LayoutParams) c.getLayoutParams()).mo5323c()) {
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

    /* renamed from: a */
    private int m4686a(C1079p pVar, C1082s sVar, int i) {
        if (!sVar.mo5487d()) {
            return this.f3916O.mo4961a(i, this.f3911J);
        }
        int a = pVar.mo5446a(i);
        if (a != -1) {
            return this.f3916O.mo4961a(a, this.f3911J);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot find span size for pre layout position. ");
        sb.append(i);
        Log.w("GridLayoutManager", sb.toString());
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4938a(C1082s sVar, C1055c cVar, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i = this.f3911J;
        for (int i2 = 0; i2 < this.f3911J && cVar.mo5026a(sVar) && i > 0; i2++) {
            int i3 = cVar.f3956d;
            layoutPrefetchRegistry.addPosition(i3, Math.max(0, cVar.f3959g));
            i -= this.f3916O.mo4959a(i3);
            cVar.f3956d += cVar.f3957e;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4926a(C1079p pVar, C1082s sVar, C1055c cVar, C1054b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        C1079p pVar2 = pVar;
        C1082s sVar2 = sVar;
        C1055c cVar2 = cVar;
        C1054b bVar2 = bVar;
        int e = this.f3935u.mo5754e();
        boolean z = false;
        boolean z2 = e != 1073741824;
        int i11 = mo5278e() > 0 ? this.f3912K[this.f3911J] : 0;
        if (z2) {
            m4685U();
        }
        boolean z3 = cVar2.f3957e == 1;
        int i12 = this.f3911J;
        if (!z3) {
            i12 = m4692b(pVar2, sVar2, cVar2.f3956d) + m4694c(pVar2, sVar2, cVar2.f3956d);
        }
        int i13 = i12;
        int i14 = 0;
        while (i14 < this.f3911J && cVar2.mo5026a(sVar2) && i13 > 0) {
            int i15 = cVar2.f3956d;
            int c = m4694c(pVar2, sVar2, i15);
            if (c <= this.f3911J) {
                i13 -= c;
                if (i13 < 0) {
                    break;
                }
                View a = cVar2.mo5023a(pVar2);
                if (a == null) {
                    break;
                }
                this.f3913L[i14] = a;
                i14++;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Item at position ");
                sb.append(i15);
                sb.append(" requires ");
                sb.append(c);
                sb.append(" spans but GridLayoutManager has only ");
                sb.append(this.f3911J);
                sb.append(" spans.");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (i14 == 0) {
            bVar2.f3950b = true;
            return;
        }
        float f = 0.0f;
        m4690a(pVar2, sVar2, i14, z3);
        int i16 = 0;
        int i17 = 0;
        while (i16 < i14) {
            View view = this.f3913L[i16];
            if (cVar2.f3964l == null) {
                if (z3) {
                    mo5255b(view);
                } else {
                    mo5256b(view, (int) z);
                }
            } else if (z3) {
                mo5223a(view);
            } else {
                mo5224a(view, z ? 1 : 0);
            }
            mo5228a(view, this.f3917P);
            m4689a(view, e, z);
            int b = this.f3935u.mo5749b(view);
            if (b > i17) {
                i17 = b;
            }
            float c2 = (((float) this.f3935u.mo5751c(view)) * 1.0f) / ((float) ((LayoutParams) view.getLayoutParams()).f3920f);
            if (c2 > f) {
                f = c2;
            }
            i16++;
            z = false;
        }
        if (z2) {
            m4687a(f, i11);
            i17 = 0;
            for (int i18 = 0; i18 < i14; i18++) {
                View view2 = this.f3913L[i18];
                m4689a(view2, 1073741824, true);
                int b2 = this.f3935u.mo5749b(view2);
                if (b2 > i17) {
                    i17 = b2;
                }
            }
        }
        for (int i19 = 0; i19 < i14; i19++) {
            View view3 = this.f3913L[i19];
            if (this.f3935u.mo5749b(view3) != i17) {
                LayoutParams layoutParams = (LayoutParams) view3.getLayoutParams();
                Rect rect = layoutParams.f4076b;
                int i20 = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
                int i21 = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
                int g = mo4954g(layoutParams.f3919e, layoutParams.f3920f);
                if (this.f3933s == 1) {
                    i10 = LayoutManager.m4968a(g, 1073741824, i21, layoutParams.width, false);
                    i9 = MeasureSpec.makeMeasureSpec(i17 - i20, 1073741824);
                } else {
                    int makeMeasureSpec = MeasureSpec.makeMeasureSpec(i17 - i21, 1073741824);
                    i9 = LayoutManager.m4968a(g, 1073741824, i20, layoutParams.height, false);
                    i10 = makeMeasureSpec;
                }
                m4688a(view3, i10, i9, true);
            }
        }
        int i22 = 0;
        bVar2.f3949a = i17;
        if (this.f3933s == 1) {
            if (cVar2.f3958f == -1) {
                int i23 = cVar2.f3954b;
                i3 = i23 - i17;
                i2 = i23;
            } else {
                int i24 = cVar2.f3954b;
                i2 = i24 + i17;
                i3 = i24;
            }
            i4 = 0;
            i = 0;
        } else if (cVar2.f3958f == -1) {
            i = cVar2.f3954b;
            i4 = i - i17;
            i3 = 0;
            i2 = 0;
        } else {
            int i25 = cVar2.f3954b;
            int i26 = i25 + i17;
            i3 = 0;
            i2 = 0;
            int i27 = i25;
            i = i26;
            i4 = i27;
        }
        while (i22 < i14) {
            View view4 = this.f3913L[i22];
            LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
            if (this.f3933s != 1) {
                int s = mo5308s() + this.f3912K[layoutParams2.f3919e];
                i8 = i4;
                i7 = s;
                i5 = this.f3935u.mo5751c(view4) + s;
                i6 = i;
            } else if (mo4980N()) {
                int p = mo5305p() + this.f3912K[this.f3911J - layoutParams2.f3919e];
                i6 = p;
                i7 = i3;
                i5 = i2;
                i8 = p - this.f3935u.mo5751c(view4);
            } else {
                int p2 = mo5305p() + this.f3912K[layoutParams2.f3919e];
                i8 = p2;
                i7 = i3;
                i5 = i2;
                i6 = this.f3935u.mo5751c(view4) + p2;
            }
            mo5257b(view4, i8, i7, i6, i5);
            if (layoutParams2.mo5323c() || layoutParams2.mo5322b()) {
                bVar2.f3951c = true;
            }
            bVar2.f3952d |= view4.hasFocusable();
            i22++;
            i4 = i8;
            i3 = i7;
            i = i6;
            i2 = i5;
        }
        Arrays.fill(this.f3913L, null);
    }

    /* renamed from: a */
    private void m4689a(View view, int i, boolean z) {
        int i2;
        int i3;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.f4076b;
        int i4 = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
        int i5 = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
        int g = mo4954g(layoutParams.f3919e, layoutParams.f3920f);
        if (this.f3933s == 1) {
            i2 = LayoutManager.m4968a(g, i, i5, layoutParams.width, false);
            i3 = LayoutManager.m4968a(this.f3935u.mo5758g(), mo5291i(), i4, layoutParams.height, true);
        } else {
            int a = LayoutManager.m4968a(g, i, i4, layoutParams.height, false);
            int a2 = LayoutManager.m4968a(this.f3935u.mo5758g(), mo5310u(), i5, layoutParams.width, true);
            i3 = a;
            i2 = a2;
        }
        m4688a(view, i2, i3, z);
    }

    /* renamed from: a */
    private void m4687a(float f, int i) {
        m4697l(Math.max(Math.round(f * ((float) this.f3911J)), i));
    }

    /* renamed from: a */
    private void m4688a(View view, int i, int i2, boolean z) {
        boolean z2;
        androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams = (androidx.recyclerview.widget.RecyclerView.LayoutParams) view.getLayoutParams();
        if (z) {
            z2 = mo5263b(view, i, i2, layoutParams);
        } else {
            z2 = mo5243a(view, i, i2, layoutParams);
        }
        if (z2) {
            view.measure(i, i2);
        }
    }

    /* renamed from: a */
    private void m4690a(C1079p pVar, C1082s sVar, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = -1;
        if (z) {
            i5 = i;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = i - 1;
            i2 = -1;
        }
        while (i3 != i5) {
            View view = this.f3913L[i3];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.f3920f = m4694c(pVar, sVar, mo5298l(view));
            layoutParams.f3919e = i4;
            i4 += layoutParams.f3920f;
            i3 += i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00d7, code lost:
        if (r13 == (r2 > r8)) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00f7, code lost:
        if (r13 == r11) goto L_0x00b7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0105  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo4931a(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.C1079p r26, androidx.recyclerview.widget.RecyclerView.C1082s r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r26
            r2 = r27
            android.view.View r3 = r23.mo5266c(r24)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r5 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r5
            int r6 = r5.f3919e
            int r5 = r5.f3920f
            int r5 = r5 + r6
            android.view.View r7 = super.mo4931a(r24, r25, r26, r27)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r25
            int r7 = r0.mo5007i(r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = 1
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.f3938x
            if (r7 == r10) goto L_0x0032
            r7 = 1
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r23.mo5278e()
            int r7 = r7 - r9
            r11 = -1
            r12 = -1
            goto L_0x0045
        L_0x003e:
            int r7 = r23.mo5278e()
            r11 = r7
            r7 = 0
            r12 = 1
        L_0x0045:
            int r13 = r0.f3933s
            if (r13 != r9) goto L_0x0051
            boolean r13 = r23.mo4980N()
            if (r13 == 0) goto L_0x0051
            r13 = 1
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.m4686a(r1, r2, r7)
            r10 = r4
            r8 = -1
            r15 = 0
            r16 = 0
            r17 = -1
        L_0x005d:
            if (r7 == r11) goto L_0x0147
            int r9 = r0.m4686a(r1, r2, r7)
            android.view.View r1 = r0.mo5265c(r7)
            if (r1 != r3) goto L_0x006b
            goto L_0x0147
        L_0x006b:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0085
            if (r9 == r14) goto L_0x0085
            if (r4 == 0) goto L_0x0077
            goto L_0x0147
        L_0x0077:
            r18 = r3
            r19 = r8
            r21 = r10
            r20 = r11
            r8 = r16
            r10 = r17
            goto L_0x0133
        L_0x0085:
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r9
            int r2 = r9.f3919e
            r18 = r3
            int r3 = r9.f3920f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009d
            if (r2 != r6) goto L_0x009d
            if (r3 != r5) goto L_0x009d
            return r1
        L_0x009d:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a5
            if (r4 == 0) goto L_0x00ad
        L_0x00a5:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00b9
            if (r10 != 0) goto L_0x00b9
        L_0x00ad:
            r19 = r8
            r21 = r10
        L_0x00b1:
            r20 = r11
            r8 = r16
            r10 = r17
        L_0x00b7:
            r11 = 1
            goto L_0x0103
        L_0x00b9:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r10
            int r10 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00da
            if (r10 <= r15) goto L_0x00d0
        L_0x00cd:
            r19 = r8
            goto L_0x00b1
        L_0x00d0:
            if (r10 != r15) goto L_0x00fa
            if (r2 <= r8) goto L_0x00d6
            r10 = 1
            goto L_0x00d7
        L_0x00d6:
            r10 = 0
        L_0x00d7:
            if (r13 != r10) goto L_0x00fa
            goto L_0x00cd
        L_0x00da:
            if (r4 != 0) goto L_0x00fa
            r19 = r8
            r20 = r11
            r8 = 0
            r11 = 1
            boolean r22 = r0.mo5245a(r1, r8, r11)
            r8 = r16
            if (r22 == 0) goto L_0x0100
            if (r10 <= r8) goto L_0x00ef
            r10 = r17
            goto L_0x0103
        L_0x00ef:
            if (r10 != r8) goto L_0x0100
            r10 = r17
            if (r2 <= r10) goto L_0x00f6
            goto L_0x00f7
        L_0x00f6:
            r11 = 0
        L_0x00f7:
            if (r13 != r11) goto L_0x0102
            goto L_0x00b7
        L_0x00fa:
            r19 = r8
            r20 = r11
            r8 = r16
        L_0x0100:
            r10 = r17
        L_0x0102:
            r11 = 0
        L_0x0103:
            if (r11 == 0) goto L_0x0133
            boolean r11 = r1.hasFocusable()
            if (r11 == 0) goto L_0x0120
            int r4 = r9.f3919e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r3 = r3 - r2
            r15 = r3
            r16 = r8
            r17 = r10
            r10 = r21
            r8 = r4
            r4 = r1
            goto L_0x013b
        L_0x0120:
            int r8 = r9.f3919e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r3 = r3 - r2
            r10 = r1
            r16 = r3
            r17 = r8
            r8 = r19
            goto L_0x013b
        L_0x0133:
            r16 = r8
            r17 = r10
            r8 = r19
            r10 = r21
        L_0x013b:
            int r7 = r7 + r12
            r1 = r26
            r2 = r27
            r3 = r18
            r11 = r20
            r9 = 1
            goto L_0x005d
        L_0x0147:
            r21 = r10
            if (r4 == 0) goto L_0x014c
            goto L_0x014e
        L_0x014c:
            r4 = r21
        L_0x014e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo4931a(android.view.View, int, androidx.recyclerview.widget.RecyclerView$p, androidx.recyclerview.widget.RecyclerView$s):android.view.View");
    }
}
