package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.content.C0540a;
import androidx.core.graphics.drawable.C0559a;
import androidx.vectordrawable.graphics.drawable.C1261b;
import androidx.vectordrawable.graphics.drawable.C1272h;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import p214e.p215a.p218l.p219a.C7533a;
import p214e.p215a.p220m.C7548a;
import p214e.p228e.C7571a;
import p214e.p228e.C7576d;
import p214e.p228e.C7577e;
import p214e.p228e.C7585h;

/* renamed from: androidx.appcompat.widget.q */
public final class C0271q {

    /* renamed from: h */
    private static final Mode f1240h = Mode.SRC_IN;

    /* renamed from: i */
    private static C0271q f1241i;

    /* renamed from: j */
    private static final C0274c f1242j = new C0274c(6);

    /* renamed from: a */
    private WeakHashMap<Context, C7585h<ColorStateList>> f1243a;

    /* renamed from: b */
    private C7571a<String, C0275d> f1244b;

    /* renamed from: c */
    private C7585h<String> f1245c;

    /* renamed from: d */
    private final WeakHashMap<Context, C7576d<WeakReference<ConstantState>>> f1246d = new WeakHashMap<>(0);

    /* renamed from: e */
    private TypedValue f1247e;

    /* renamed from: f */
    private boolean f1248f;

    /* renamed from: g */
    private C0276e f1249g;

    /* renamed from: androidx.appcompat.widget.q$a */
    static class C0272a implements C0275d {
        C0272a() {
        }

        /* renamed from: a */
        public Drawable mo2001a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C7533a.m18137b(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.q$b */
    private static class C0273b implements C0275d {
        C0273b() {
        }

        /* renamed from: a */
        public Drawable mo2001a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C1261b.m6033a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.q$c */
    private static class C0274c extends C7577e<Integer, PorterDuffColorFilter> {
        public C0274c(int i) {
            super(i);
        }

        /* renamed from: b */
        private static int m1138b(int i, Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public PorterDuffColorFilter mo2002a(int i, Mode mode) {
            return (PorterDuffColorFilter) mo19526b(Integer.valueOf(m1138b(i, mode)));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public PorterDuffColorFilter mo2003a(int i, Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) mo19521a(Integer.valueOf(m1138b(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: androidx.appcompat.widget.q$d */
    private interface C0275d {
        /* renamed from: a */
        Drawable mo2001a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme);
    }

    /* renamed from: androidx.appcompat.widget.q$e */
    interface C0276e {
        /* renamed from: a */
        ColorStateList mo1898a(Context context, int i);

        /* renamed from: a */
        Mode mo1899a(int i);

        /* renamed from: a */
        Drawable mo1900a(C0271q qVar, Context context, int i);

        /* renamed from: a */
        boolean mo1901a(Context context, int i, Drawable drawable);

        /* renamed from: b */
        boolean mo1902b(Context context, int i, Drawable drawable);
    }

    /* renamed from: androidx.appcompat.widget.q$f */
    private static class C0277f implements C0275d {
        C0277f() {
        }

        /* renamed from: a */
        public Drawable mo2001a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C1272h.createFromXmlInner(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    /* renamed from: a */
    public static synchronized C0271q m1117a() {
        C0271q qVar;
        synchronized (C0271q.class) {
            if (f1241i == null) {
                f1241i = new C0271q();
                m1120a(f1241i);
            }
            qVar = f1241i;
        }
        return qVar;
    }

    /* renamed from: c */
    private Drawable m1125c(Context context, int i) {
        Drawable drawable;
        if (this.f1247e == null) {
            this.f1247e = new TypedValue();
        }
        TypedValue typedValue = this.f1247e;
        context.getResources().getValue(i, typedValue, true);
        long a = m1112a(typedValue);
        Drawable a2 = m1116a(context, a);
        if (a2 != null) {
            return a2;
        }
        C0276e eVar = this.f1249g;
        if (eVar == null) {
            drawable = null;
        } else {
            drawable = eVar.mo1900a(this, context, i);
        }
        if (drawable != null) {
            drawable.setChangingConfigurations(typedValue.changingConfigurations);
            m1122a(context, a, drawable);
        }
        return drawable;
    }

    /* renamed from: d */
    private ColorStateList m1126d(Context context, int i) {
        WeakHashMap<Context, C7585h<ColorStateList>> weakHashMap = this.f1243a;
        if (weakHashMap == null) {
            return null;
        }
        C7585h hVar = (C7585h) weakHashMap.get(context);
        if (hVar != null) {
            return (ColorStateList) hVar.mo19617a(i);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009a A[Catch:{ Exception -> 0x00a2 }] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m1127e(android.content.Context r11, int r12) {
        /*
            r10 = this;
            e.e.a<java.lang.String, androidx.appcompat.widget.q$d> r0 = r10.f1244b
            r1 = 0
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00b2
            e.e.h<java.lang.String> r0 = r10.f1245c
            java.lang.String r2 = "appcompat_skip_skip"
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.mo19617a(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r3 = r2.equals(r0)
            if (r3 != 0) goto L_0x0027
            if (r0 == 0) goto L_0x002f
            e.e.a<java.lang.String, androidx.appcompat.widget.q$d> r3 = r10.f1244b
            java.lang.Object r0 = r3.get(r0)
            if (r0 != 0) goto L_0x002f
        L_0x0027:
            return r1
        L_0x0028:
            e.e.h r0 = new e.e.h
            r0.<init>()
            r10.f1245c = r0
        L_0x002f:
            android.util.TypedValue r0 = r10.f1247e
            if (r0 != 0) goto L_0x003a
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r10.f1247e = r0
        L_0x003a:
            android.util.TypedValue r0 = r10.f1247e
            android.content.res.Resources r1 = r11.getResources()
            r3 = 1
            r1.getValue(r12, r0, r3)
            long r4 = m1112a(r0)
            android.graphics.drawable.Drawable r6 = r10.m1116a(r11, r4)
            if (r6 == 0) goto L_0x004f
            return r6
        L_0x004f:
            java.lang.CharSequence r7 = r0.string
            if (r7 == 0) goto L_0x00aa
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = ".xml"
            boolean r7 = r7.endsWith(r8)
            if (r7 == 0) goto L_0x00aa
            android.content.res.XmlResourceParser r1 = r1.getXml(r12)     // Catch:{ Exception -> 0x00a2 }
            android.util.AttributeSet r7 = android.util.Xml.asAttributeSet(r1)     // Catch:{ Exception -> 0x00a2 }
        L_0x0067:
            int r8 = r1.next()     // Catch:{ Exception -> 0x00a2 }
            r9 = 2
            if (r8 == r9) goto L_0x0071
            if (r8 == r3) goto L_0x0071
            goto L_0x0067
        L_0x0071:
            if (r8 != r9) goto L_0x009a
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x00a2 }
            e.e.h<java.lang.String> r8 = r10.f1245c     // Catch:{ Exception -> 0x00a2 }
            r8.mo19618a(r12, r3)     // Catch:{ Exception -> 0x00a2 }
            e.e.a<java.lang.String, androidx.appcompat.widget.q$d> r8 = r10.f1244b     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r8.get(r3)     // Catch:{ Exception -> 0x00a2 }
            androidx.appcompat.widget.q$d r3 = (androidx.appcompat.widget.C0271q.C0275d) r3     // Catch:{ Exception -> 0x00a2 }
            if (r3 == 0) goto L_0x008f
            android.content.res.Resources$Theme r8 = r11.getTheme()     // Catch:{ Exception -> 0x00a2 }
            android.graphics.drawable.Drawable r1 = r3.mo2001a(r11, r1, r7, r8)     // Catch:{ Exception -> 0x00a2 }
            r6 = r1
        L_0x008f:
            if (r6 == 0) goto L_0x00aa
            int r0 = r0.changingConfigurations     // Catch:{ Exception -> 0x00a2 }
            r6.setChangingConfigurations(r0)     // Catch:{ Exception -> 0x00a2 }
            r10.m1122a(r11, r4, r6)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00aa
        L_0x009a:
            org.xmlpull.v1.XmlPullParserException r11 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r0 = "No start tag found"
            r11.<init>(r0)     // Catch:{ Exception -> 0x00a2 }
            throw r11     // Catch:{ Exception -> 0x00a2 }
        L_0x00a2:
            r11 = move-exception
            java.lang.String r0 = "ResourceManagerInternal"
            java.lang.String r1 = "Exception while inflating drawable"
            android.util.Log.e(r0, r1, r11)
        L_0x00aa:
            if (r6 != 0) goto L_0x00b1
            e.e.h<java.lang.String> r11 = r10.f1245c
            r11.mo19618a(r12, r2)
        L_0x00b1:
            return r6
        L_0x00b2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0271q.m1127e(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized ColorStateList mo2000b(Context context, int i) {
        ColorStateList d;
        d = m1126d(context, i);
        if (d == null) {
            d = this.f1249g == null ? null : this.f1249g.mo1898a(context, i);
            if (d != null) {
                m1118a(context, i, d);
            }
        }
        return d;
    }

    /* renamed from: a */
    private static void m1120a(C0271q qVar) {
        if (VERSION.SDK_INT < 24) {
            qVar.m1121a("vector", (C0275d) new C0277f());
            qVar.m1121a("animated-vector", (C0275d) new C0273b());
            qVar.m1121a("animated-selector", (C0275d) new C0272a());
        }
    }

    /* renamed from: b */
    private void m1124b(Context context) {
        if (!this.f1248f) {
            this.f1248f = true;
            Drawable a = mo1994a(context, C7548a.abc_vector_test);
            if (a == null || !m1123a(a)) {
                this.f1248f = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo1998a(C0276e eVar) {
        this.f1249g = eVar;
    }

    /* renamed from: a */
    public synchronized Drawable mo1994a(Context context, int i) {
        return mo1995a(context, i, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized Drawable mo1995a(Context context, int i, boolean z) {
        Drawable e;
        m1124b(context);
        e = m1127e(context, i);
        if (e == null) {
            e = m1125c(context, i);
        }
        if (e == null) {
            e = C0540a.m2546c(context, i);
        }
        if (e != null) {
            e = m1115a(context, i, z, e);
        }
        if (e != null) {
            C0262m.m1080b(e);
        }
        return e;
    }

    /* renamed from: a */
    public synchronized void mo1997a(Context context) {
        C7576d dVar = (C7576d) this.f1246d.get(context);
        if (dVar != null) {
            dVar.clear();
        }
    }

    /* renamed from: a */
    private static long m1112a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    /* renamed from: a */
    private Drawable m1115a(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList b = mo2000b(context, i);
        if (b != null) {
            if (C0262m.m1079a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable i2 = C0559a.m2657i(drawable);
            C0559a.m2642a(i2, b);
            Mode a = mo1993a(i);
            if (a == null) {
                return i2;
            }
            C0559a.m2645a(i2, a);
            return i2;
        }
        C0276e eVar = this.f1249g;
        if ((eVar == null || !eVar.mo1902b(context, i, drawable)) && !mo1999a(context, i, drawable) && z) {
            return null;
        }
        return drawable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized android.graphics.drawable.Drawable m1116a(android.content.Context r4, long r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap<android.content.Context, e.e.d<java.lang.ref.WeakReference<android.graphics.drawable.Drawable$ConstantState>>> r0 = r3.f1246d     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002d }
            e.e.d r0 = (p214e.p228e.C7576d) r0     // Catch:{ all -> 0x002d }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r3)
            return r1
        L_0x000e:
            java.lang.Object r2 = r0.mo19513c(r5)     // Catch:{ all -> 0x002d }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x002b
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0028
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x002d }
            android.graphics.drawable.Drawable r4 = r2.newDrawable(r4)     // Catch:{ all -> 0x002d }
            monitor-exit(r3)
            return r4
        L_0x0028:
            r0.mo19511b(r5)     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r3)
            return r1
        L_0x002d:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0271q.m1116a(android.content.Context, long):android.graphics.drawable.Drawable");
    }

    /* renamed from: a */
    private synchronized boolean m1122a(Context context, long j, Drawable drawable) {
        ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        C7576d dVar = (C7576d) this.f1246d.get(context);
        if (dVar == null) {
            dVar = new C7576d();
            this.f1246d.put(context, dVar);
        }
        dVar.mo19514c(j, new WeakReference(constantState));
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized Drawable mo1996a(Context context, C0252e0 e0Var, int i) {
        Drawable e = m1127e(context, i);
        if (e == null) {
            e = e0Var.mo1903a(i);
        }
        if (e == null) {
            return null;
        }
        return m1115a(context, i, false, e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo1999a(Context context, int i, Drawable drawable) {
        C0276e eVar = this.f1249g;
        return eVar != null && eVar.mo1901a(context, i, drawable);
    }

    /* renamed from: a */
    private void m1121a(String str, C0275d dVar) {
        if (this.f1244b == null) {
            this.f1244b = new C7571a<>();
        }
        this.f1244b.put(str, dVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Mode mo1993a(int i) {
        C0276e eVar = this.f1249g;
        if (eVar == null) {
            return null;
        }
        return eVar.mo1899a(i);
    }

    /* renamed from: a */
    private void m1118a(Context context, int i, ColorStateList colorStateList) {
        if (this.f1243a == null) {
            this.f1243a = new WeakHashMap<>();
        }
        C7585h hVar = (C7585h) this.f1243a.get(context);
        if (hVar == null) {
            hVar = new C7585h();
            this.f1243a.put(context, hVar);
        }
        hVar.mo19618a(i, colorStateList);
    }

    /* renamed from: a */
    static void m1119a(Drawable drawable, C0289x xVar, int[] iArr) {
        if (!C0262m.m1079a(drawable) || drawable.mutate() == drawable) {
            if (xVar.f1311d || xVar.f1310c) {
                drawable.setColorFilter(m1114a(xVar.f1311d ? xVar.f1308a : null, xVar.f1310c ? xVar.f1309b : f1240h, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    /* renamed from: a */
    private static PorterDuffColorFilter m1114a(ColorStateList colorStateList, Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return m1113a(colorStateList.getColorForState(iArr, 0), mode);
    }

    /* renamed from: a */
    public static synchronized PorterDuffColorFilter m1113a(int i, Mode mode) {
        PorterDuffColorFilter a;
        synchronized (C0271q.class) {
            a = f1242j.mo2002a(i, mode);
            if (a == null) {
                a = new PorterDuffColorFilter(i, mode);
                f1242j.mo2003a(i, mode, a);
            }
        }
        return a;
    }

    /* renamed from: a */
    private static boolean m1123a(Drawable drawable) {
        if (!(drawable instanceof C1272h)) {
            if (!"android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
                return false;
            }
        }
        return true;
    }
}
