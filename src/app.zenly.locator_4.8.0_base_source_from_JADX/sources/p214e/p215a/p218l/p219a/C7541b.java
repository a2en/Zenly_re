package p214e.p215a.p218l.p219a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.SparseArray;
import androidx.core.graphics.drawable.C0559a;

/* renamed from: e.a.l.a.b */
class C7541b extends Drawable implements Callback {

    /* renamed from: e */
    private C7544c f18913e;

    /* renamed from: f */
    private Rect f18914f;

    /* renamed from: g */
    private Drawable f18915g;

    /* renamed from: h */
    private Drawable f18916h;

    /* renamed from: i */
    private int f18917i = 255;

    /* renamed from: j */
    private boolean f18918j;

    /* renamed from: k */
    private int f18919k = -1;

    /* renamed from: l */
    private boolean f18920l;

    /* renamed from: m */
    private Runnable f18921m;

    /* renamed from: n */
    private long f18922n;

    /* renamed from: o */
    private long f18923o;

    /* renamed from: p */
    private C7543b f18924p;

    /* renamed from: e.a.l.a.b$a */
    class C7542a implements Runnable {
        C7542a() {
        }

        public void run() {
            C7541b.this.mo19338a(true);
            C7541b.this.invalidateSelf();
        }
    }

    /* renamed from: e.a.l.a.b$b */
    static class C7543b implements Callback {

        /* renamed from: e */
        private Callback f18926e;

        C7543b() {
        }

        /* renamed from: a */
        public C7543b mo19373a(Callback callback) {
            this.f18926e = callback;
            return this;
        }

        public void invalidateDrawable(Drawable drawable) {
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            Callback callback = this.f18926e;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j);
            }
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Callback callback = this.f18926e;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }

        /* renamed from: a */
        public Callback mo19372a() {
            Callback callback = this.f18926e;
            this.f18926e = null;
            return callback;
        }
    }

    /* renamed from: e.a.l.a.b$c */
    static abstract class C7544c extends ConstantState {

        /* renamed from: A */
        int f18927A;

        /* renamed from: B */
        int f18928B;

        /* renamed from: C */
        boolean f18929C;

        /* renamed from: D */
        ColorFilter f18930D;

        /* renamed from: E */
        boolean f18931E;

        /* renamed from: F */
        ColorStateList f18932F;

        /* renamed from: G */
        Mode f18933G;

        /* renamed from: H */
        boolean f18934H;

        /* renamed from: I */
        boolean f18935I;

        /* renamed from: a */
        final C7541b f18936a;

        /* renamed from: b */
        Resources f18937b;

        /* renamed from: c */
        int f18938c = 160;

        /* renamed from: d */
        int f18939d;

        /* renamed from: e */
        int f18940e;

        /* renamed from: f */
        SparseArray<ConstantState> f18941f;

        /* renamed from: g */
        Drawable[] f18942g;

        /* renamed from: h */
        int f18943h;

        /* renamed from: i */
        boolean f18944i;

        /* renamed from: j */
        boolean f18945j;

        /* renamed from: k */
        Rect f18946k;

        /* renamed from: l */
        boolean f18947l;

        /* renamed from: m */
        boolean f18948m;

        /* renamed from: n */
        int f18949n;

        /* renamed from: o */
        int f18950o;

        /* renamed from: p */
        int f18951p;

        /* renamed from: q */
        int f18952q;

        /* renamed from: r */
        boolean f18953r;

        /* renamed from: s */
        int f18954s;

        /* renamed from: t */
        boolean f18955t;

        /* renamed from: u */
        boolean f18956u;

        /* renamed from: v */
        boolean f18957v;

        /* renamed from: w */
        boolean f18958w;

        /* renamed from: x */
        boolean f18959x;

        /* renamed from: y */
        boolean f18960y;

        /* renamed from: z */
        int f18961z;

        C7544c(C7544c cVar, C7541b bVar, Resources resources) {
            this.f18944i = false;
            this.f18947l = false;
            this.f18959x = true;
            this.f18927A = 0;
            this.f18928B = 0;
            this.f18936a = bVar;
            Resources resources2 = resources != null ? resources : cVar != null ? cVar.f18937b : null;
            this.f18937b = resources2;
            this.f18938c = C7541b.m18171a(resources, cVar != null ? cVar.f18938c : 0);
            if (cVar != null) {
                this.f18939d = cVar.f18939d;
                this.f18940e = cVar.f18940e;
                this.f18957v = true;
                this.f18958w = true;
                this.f18944i = cVar.f18944i;
                this.f18947l = cVar.f18947l;
                this.f18959x = cVar.f18959x;
                this.f18960y = cVar.f18960y;
                this.f18961z = cVar.f18961z;
                this.f18927A = cVar.f18927A;
                this.f18928B = cVar.f18928B;
                this.f18929C = cVar.f18929C;
                this.f18930D = cVar.f18930D;
                this.f18931E = cVar.f18931E;
                this.f18932F = cVar.f18932F;
                this.f18933G = cVar.f18933G;
                this.f18934H = cVar.f18934H;
                this.f18935I = cVar.f18935I;
                if (cVar.f18938c == this.f18938c) {
                    if (cVar.f18945j) {
                        this.f18946k = new Rect(cVar.f18946k);
                        this.f18945j = true;
                    }
                    if (cVar.f18948m) {
                        this.f18949n = cVar.f18949n;
                        this.f18950o = cVar.f18950o;
                        this.f18951p = cVar.f18951p;
                        this.f18952q = cVar.f18952q;
                        this.f18948m = true;
                    }
                }
                if (cVar.f18953r) {
                    this.f18954s = cVar.f18954s;
                    this.f18953r = true;
                }
                if (cVar.f18955t) {
                    this.f18956u = cVar.f18956u;
                    this.f18955t = true;
                }
                Drawable[] drawableArr = cVar.f18942g;
                this.f18942g = new Drawable[drawableArr.length];
                this.f18943h = cVar.f18943h;
                SparseArray<ConstantState> sparseArray = cVar.f18941f;
                if (sparseArray != null) {
                    this.f18941f = sparseArray.clone();
                } else {
                    this.f18941f = new SparseArray<>(this.f18943h);
                }
                int i = this.f18943h;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null) {
                        ConstantState constantState = drawableArr[i2].getConstantState();
                        if (constantState != null) {
                            this.f18941f.put(i2, constantState);
                        } else {
                            this.f18942g[i2] = drawableArr[i2];
                        }
                    }
                }
                return;
            }
            this.f18942g = new Drawable[10];
            this.f18943h = 0;
        }

        /* renamed from: b */
        private Drawable m18182b(Drawable drawable) {
            if (VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(this.f18961z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f18936a);
            return mutate;
        }

        /* renamed from: n */
        private void m18183n() {
            SparseArray<ConstantState> sparseArray = this.f18941f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    this.f18942g[this.f18941f.keyAt(i)] = m18182b(((ConstantState) this.f18941f.valueAt(i)).newDrawable(this.f18937b));
                }
                this.f18941f = null;
            }
        }

        /* renamed from: a */
        public final int mo19377a(Drawable drawable) {
            int i = this.f18943h;
            if (i >= this.f18942g.length) {
                mo19379a(i, i + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f18936a);
            this.f18942g[i] = drawable;
            this.f18943h++;
            this.f18940e = drawable.getChangingConfigurations() | this.f18940e;
            mo19399k();
            this.f18946k = null;
            this.f18945j = false;
            this.f18948m = false;
            this.f18957v = false;
            return i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final int mo19388c() {
            return this.f18942g.length;
        }

        public boolean canApplyTheme() {
            int i = this.f18943h;
            Drawable[] drawableArr = this.f18942g;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable == null) {
                    ConstantState constantState = (ConstantState) this.f18941f.get(i2);
                    if (constantState != null && constantState.canApplyTheme()) {
                        return true;
                    }
                } else if (drawable.canApplyTheme()) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: d */
        public final int mo19391d() {
            return this.f18943h;
        }

        /* renamed from: e */
        public final int mo19392e() {
            if (!this.f18948m) {
                mo19384b();
            }
            return this.f18950o;
        }

        /* renamed from: f */
        public final int mo19393f() {
            if (!this.f18948m) {
                mo19384b();
            }
            return this.f18952q;
        }

        /* renamed from: g */
        public final int mo19394g() {
            if (!this.f18948m) {
                mo19384b();
            }
            return this.f18951p;
        }

        public int getChangingConfigurations() {
            return this.f18939d | this.f18940e;
        }

        /* renamed from: h */
        public final Rect mo19396h() {
            if (this.f18944i) {
                return null;
            }
            if (this.f18946k != null || this.f18945j) {
                return this.f18946k;
            }
            m18183n();
            Rect rect = new Rect();
            int i = this.f18943h;
            Drawable[] drawableArr = this.f18942g;
            Rect rect2 = null;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getPadding(rect)) {
                    if (rect2 == null) {
                        rect2 = new Rect(0, 0, 0, 0);
                    }
                    int i3 = rect.left;
                    if (i3 > rect2.left) {
                        rect2.left = i3;
                    }
                    int i4 = rect.top;
                    if (i4 > rect2.top) {
                        rect2.top = i4;
                    }
                    int i5 = rect.right;
                    if (i5 > rect2.right) {
                        rect2.right = i5;
                    }
                    int i6 = rect.bottom;
                    if (i6 > rect2.bottom) {
                        rect2.bottom = i6;
                    }
                }
            }
            this.f18945j = true;
            this.f18946k = rect2;
            return rect2;
        }

        /* renamed from: i */
        public final int mo19397i() {
            if (!this.f18948m) {
                mo19384b();
            }
            return this.f18949n;
        }

        /* renamed from: j */
        public final int mo19398j() {
            if (this.f18953r) {
                return this.f18954s;
            }
            m18183n();
            int i = this.f18943h;
            Drawable[] drawableArr = this.f18942g;
            int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i2 = 1; i2 < i; i2++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
            }
            this.f18954s = opacity;
            this.f18953r = true;
            return opacity;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public void mo19399k() {
            this.f18953r = false;
            this.f18955t = false;
        }

        /* renamed from: l */
        public final boolean mo19400l() {
            return this.f18947l;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public abstract void mo19329m();

        /* renamed from: c */
        public final void mo19389c(int i) {
            this.f18928B = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo19387b(int i, int i2) {
            int i3 = this.f18943h;
            Drawable[] drawableArr = this.f18942g;
            boolean z = false;
            for (int i4 = 0; i4 < i3; i4++) {
                if (drawableArr[i4] != null) {
                    boolean layoutDirection = VERSION.SDK_INT >= 23 ? drawableArr[i4].setLayoutDirection(i) : false;
                    if (i4 == i2) {
                        z = layoutDirection;
                    }
                }
            }
            this.f18961z = i;
            return z;
        }

        /* renamed from: b */
        public final void mo19386b(boolean z) {
            this.f18944i = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo19384b() {
            this.f18948m = true;
            m18183n();
            int i = this.f18943h;
            Drawable[] drawableArr = this.f18942g;
            this.f18950o = -1;
            this.f18949n = -1;
            this.f18952q = 0;
            this.f18951p = 0;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f18949n) {
                    this.f18949n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f18950o) {
                    this.f18950o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f18951p) {
                    this.f18951p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f18952q) {
                    this.f18952q = minimumHeight;
                }
            }
        }

        /* renamed from: a */
        public final Drawable mo19378a(int i) {
            Drawable drawable = this.f18942g[i];
            if (drawable != null) {
                return drawable;
            }
            SparseArray<ConstantState> sparseArray = this.f18941f;
            if (sparseArray != null) {
                int indexOfKey = sparseArray.indexOfKey(i);
                if (indexOfKey >= 0) {
                    Drawable b = m18182b(((ConstantState) this.f18941f.valueAt(indexOfKey)).newDrawable(this.f18937b));
                    this.f18942g[i] = b;
                    this.f18941f.removeAt(indexOfKey);
                    if (this.f18941f.size() == 0) {
                        this.f18941f = null;
                    }
                    return b;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo19381a(Resources resources) {
            if (resources != null) {
                this.f18937b = resources;
                int a = C7541b.m18171a(resources, this.f18938c);
                int i = this.f18938c;
                this.f18938c = a;
                if (i != a) {
                    this.f18948m = false;
                    this.f18945j = false;
                }
            }
        }

        /* renamed from: b */
        public final void mo19385b(int i) {
            this.f18927A = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo19380a(Theme theme) {
            if (theme != null) {
                m18183n();
                int i = this.f18943h;
                Drawable[] drawableArr = this.f18942g;
                for (int i2 = 0; i2 < i; i2++) {
                    if (drawableArr[i2] != null && drawableArr[i2].canApplyTheme()) {
                        drawableArr[i2].applyTheme(theme);
                        this.f18940e |= drawableArr[i2].getChangingConfigurations();
                    }
                }
                mo19381a(theme.getResources());
            }
        }

        /* renamed from: a */
        public final void mo19382a(boolean z) {
            this.f18947l = z;
        }

        /* renamed from: a */
        public void mo19379a(int i, int i2) {
            Drawable[] drawableArr = new Drawable[i2];
            System.arraycopy(this.f18942g, 0, drawableArr, 0, i);
            this.f18942g = drawableArr;
        }

        /* renamed from: a */
        public synchronized boolean mo19383a() {
            if (this.f18957v) {
                return this.f18958w;
            }
            m18183n();
            this.f18957v = true;
            int i = this.f18943h;
            Drawable[] drawableArr = this.f18942g;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    this.f18958w = false;
                    return false;
                }
            }
            this.f18958w = true;
            return true;
        }
    }

    C7541b() {
    }

    /* renamed from: c */
    private boolean m18173c() {
        if (!isAutoMirrored() || C0559a.m2653e(this) != 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C7544c mo19312a() {
        throw null;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo19339a(int r10) {
        /*
            r9 = this;
            int r0 = r9.f18919k
            r1 = 0
            if (r10 != r0) goto L_0x0006
            return r1
        L_0x0006:
            long r2 = android.os.SystemClock.uptimeMillis()
            e.a.l.a.b$c r0 = r9.f18913e
            int r0 = r0.f18928B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L_0x002e
            android.graphics.drawable.Drawable r0 = r9.f18916h
            if (r0 == 0) goto L_0x001a
            r0.setVisible(r1, r1)
        L_0x001a:
            android.graphics.drawable.Drawable r0 = r9.f18915g
            if (r0 == 0) goto L_0x0029
            r9.f18916h = r0
            e.a.l.a.b$c r0 = r9.f18913e
            int r0 = r0.f18928B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f18923o = r0
            goto L_0x0035
        L_0x0029:
            r9.f18916h = r4
            r9.f18923o = r5
            goto L_0x0035
        L_0x002e:
            android.graphics.drawable.Drawable r0 = r9.f18915g
            if (r0 == 0) goto L_0x0035
            r0.setVisible(r1, r1)
        L_0x0035:
            if (r10 < 0) goto L_0x0055
            e.a.l.a.b$c r0 = r9.f18913e
            int r1 = r0.f18943h
            if (r10 >= r1) goto L_0x0055
            android.graphics.drawable.Drawable r0 = r0.mo19378a(r10)
            r9.f18915g = r0
            r9.f18919k = r10
            if (r0 == 0) goto L_0x005a
            e.a.l.a.b$c r10 = r9.f18913e
            int r10 = r10.f18927A
            if (r10 <= 0) goto L_0x0051
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f18922n = r2
        L_0x0051:
            r9.m18172a(r0)
            goto L_0x005a
        L_0x0055:
            r9.f18915g = r4
            r10 = -1
            r9.f18919k = r10
        L_0x005a:
            long r0 = r9.f18922n
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0067
            long r0 = r9.f18923o
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0079
        L_0x0067:
            java.lang.Runnable r0 = r9.f18921m
            if (r0 != 0) goto L_0x0073
            e.a.l.a.b$a r0 = new e.a.l.a.b$a
            r0.<init>()
            r9.f18921m = r0
            goto L_0x0076
        L_0x0073:
            r9.unscheduleSelf(r0)
        L_0x0076:
            r9.mo19338a(r10)
        L_0x0079:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p214e.p215a.p218l.p219a.C7541b.mo19339a(int):boolean");
    }

    public void applyTheme(Theme theme) {
        this.f18913e.mo19380a(theme);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo19341b() {
        return this.f18919k;
    }

    public boolean canApplyTheme() {
        return this.f18913e.canApplyTheme();
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f18915g;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f18916h;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public int getAlpha() {
        return this.f18917i;
    }

    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f18913e.getChangingConfigurations();
    }

    public final ConstantState getConstantState() {
        if (!this.f18913e.mo19383a()) {
            return null;
        }
        this.f18913e.f18939d = getChangingConfigurations();
        return this.f18913e;
    }

    public Drawable getCurrent() {
        return this.f18915g;
    }

    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f18914f;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    public int getIntrinsicHeight() {
        if (this.f18913e.mo19400l()) {
            return this.f18913e.mo19392e();
        }
        Drawable drawable = this.f18915g;
        return drawable != null ? drawable.getIntrinsicHeight() : -1;
    }

    public int getIntrinsicWidth() {
        if (this.f18913e.mo19400l()) {
            return this.f18913e.mo19397i();
        }
        Drawable drawable = this.f18915g;
        return drawable != null ? drawable.getIntrinsicWidth() : -1;
    }

    public int getMinimumHeight() {
        if (this.f18913e.mo19400l()) {
            return this.f18913e.mo19393f();
        }
        Drawable drawable = this.f18915g;
        return drawable != null ? drawable.getMinimumHeight() : 0;
    }

    public int getMinimumWidth() {
        if (this.f18913e.mo19400l()) {
            return this.f18913e.mo19394g();
        }
        Drawable drawable = this.f18915g;
        return drawable != null ? drawable.getMinimumWidth() : 0;
    }

    public int getOpacity() {
        Drawable drawable = this.f18915g;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f18913e.mo19398j();
    }

    public void getOutline(Outline outline) {
        Drawable drawable = this.f18915g;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    public boolean getPadding(Rect rect) {
        boolean z;
        Rect h = this.f18913e.mo19396h();
        if (h != null) {
            rect.set(h);
            z = (h.right | ((h.left | h.top) | h.bottom)) != 0;
        } else {
            Drawable drawable = this.f18915g;
            z = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (m18173c()) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return z;
    }

    public void invalidateDrawable(Drawable drawable) {
        C7544c cVar = this.f18913e;
        if (cVar != null) {
            cVar.mo19399k();
        }
        if (drawable == this.f18915g && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    public boolean isAutoMirrored() {
        return this.f18913e.f18929C;
    }

    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.f18916h;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f18916h = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.f18915g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f18918j) {
                this.f18915g.setAlpha(this.f18917i);
            }
        }
        if (this.f18923o != 0) {
            this.f18923o = 0;
            z = true;
        }
        if (this.f18922n != 0) {
            this.f18922n = 0;
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
    }

    public Drawable mutate() {
        if (!this.f18920l && super.mutate() == this) {
            C7544c a = mo19312a();
            a.mo19329m();
            mo19314a(a);
            this.f18920l = true;
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f18916h;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f18915g;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    public boolean onLayoutDirectionChanged(int i) {
        return this.f18913e.mo19387b(i, mo19341b());
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f18916h;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.f18915g;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f18916h;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.f18915g;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.f18915g && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (!this.f18918j || this.f18917i != i) {
            this.f18918j = true;
            this.f18917i = i;
            Drawable drawable = this.f18915g;
            if (drawable == null) {
                return;
            }
            if (this.f18922n == 0) {
                drawable.setAlpha(i);
            } else {
                mo19338a(false);
            }
        }
    }

    public void setAutoMirrored(boolean z) {
        C7544c cVar = this.f18913e;
        if (cVar.f18929C != z) {
            cVar.f18929C = z;
            Drawable drawable = this.f18915g;
            if (drawable != null) {
                C0559a.m2646a(drawable, cVar.f18929C);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        C7544c cVar = this.f18913e;
        cVar.f18931E = true;
        if (cVar.f18930D != colorFilter) {
            cVar.f18930D = colorFilter;
            Drawable drawable = this.f18915g;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        C7544c cVar = this.f18913e;
        if (cVar.f18959x != z) {
            cVar.f18959x = z;
            Drawable drawable = this.f18915g;
            if (drawable != null) {
                drawable.setDither(cVar.f18959x);
            }
        }
    }

    public void setHotspot(float f, float f2) {
        Drawable drawable = this.f18915g;
        if (drawable != null) {
            C0559a.m2640a(drawable, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.f18914f;
        if (rect == null) {
            this.f18914f = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.f18915g;
        if (drawable != null) {
            C0559a.m2641a(drawable, i, i2, i3, i4);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        C7544c cVar = this.f18913e;
        cVar.f18934H = true;
        if (cVar.f18932F != colorStateList) {
            cVar.f18932F = colorStateList;
            C0559a.m2642a(this.f18915g, colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        C7544c cVar = this.f18913e;
        cVar.f18935I = true;
        if (cVar.f18933G != mode) {
            cVar.f18933G = mode;
            C0559a.m2645a(this.f18915g, mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f18916h;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.f18915g;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.f18915g && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    /* renamed from: a */
    private void m18172a(Drawable drawable) {
        if (this.f18924p == null) {
            this.f18924p = new C7543b();
        }
        C7543b bVar = this.f18924p;
        bVar.mo19373a(drawable.getCallback());
        drawable.setCallback(bVar);
        try {
            if (this.f18913e.f18927A <= 0 && this.f18918j) {
                drawable.setAlpha(this.f18917i);
            }
            if (this.f18913e.f18931E) {
                drawable.setColorFilter(this.f18913e.f18930D);
            } else {
                if (this.f18913e.f18934H) {
                    C0559a.m2642a(drawable, this.f18913e.f18932F);
                }
                if (this.f18913e.f18935I) {
                    C0559a.m2645a(drawable, this.f18913e.f18933G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f18913e.f18959x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (VERSION.SDK_INT >= 23) {
                drawable.setLayoutDirection(getLayoutDirection());
            }
            if (VERSION.SDK_INT >= 19) {
                drawable.setAutoMirrored(this.f18913e.f18929C);
            }
            Rect rect = this.f18914f;
            if (VERSION.SDK_INT >= 21 && rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f18924p.mo19372a());
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19338a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f18918j = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f18915g
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L_0x0038
            long r9 = r13.f18922n
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 == 0) goto L_0x003a
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L_0x0022
            int r9 = r13.f18917i
            r3.setAlpha(r9)
            r13.f18922n = r7
            goto L_0x003a
        L_0x0022:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            e.a.l.a.b$c r9 = r13.f18913e
            int r9 = r9.f18927A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f18917i
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L_0x003b
        L_0x0038:
            r13.f18922n = r7
        L_0x003a:
            r3 = 0
        L_0x003b:
            android.graphics.drawable.Drawable r9 = r13.f18916h
            if (r9 == 0) goto L_0x0065
            long r10 = r13.f18923o
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0067
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L_0x0052
            r9.setVisible(r6, r6)
            r0 = 0
            r13.f18916h = r0
            r13.f18923o = r7
            goto L_0x0067
        L_0x0052:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            e.a.l.a.b$c r4 = r13.f18913e
            int r4 = r4.f18928B
            int r3 = r3 / r4
            int r4 = r13.f18917i
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L_0x0068
        L_0x0065:
            r13.f18923o = r7
        L_0x0067:
            r0 = r3
        L_0x0068:
            if (r14 == 0) goto L_0x0074
            if (r0 == 0) goto L_0x0074
            java.lang.Runnable r14 = r13.f18921m
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p214e.p215a.p218l.p219a.C7541b.mo19338a(boolean):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo19337a(Resources resources) {
        this.f18913e.mo19381a(resources);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo19314a(C7544c cVar) {
        this.f18913e = cVar;
        int i = this.f18919k;
        if (i >= 0) {
            this.f18915g = cVar.mo19378a(i);
            Drawable drawable = this.f18915g;
            if (drawable != null) {
                m18172a(drawable);
            }
        }
        this.f18916h = null;
    }

    /* renamed from: a */
    static int m18171a(Resources resources, int i) {
        if (resources != null) {
            i = resources.getDisplayMetrics().densityDpi;
        }
        if (i == 0) {
            return 160;
        }
        return i;
    }
}
