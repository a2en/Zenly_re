package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow.OnDismissListener;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.core.view.C0641c;
import androidx.core.view.ViewCompat;

/* renamed from: androidx.appcompat.view.menu.l */
public class C0178l implements C0168h {

    /* renamed from: a */
    private final Context f704a;

    /* renamed from: b */
    private final MenuBuilder f705b;

    /* renamed from: c */
    private final boolean f706c;

    /* renamed from: d */
    private final int f707d;

    /* renamed from: e */
    private final int f708e;

    /* renamed from: f */
    private View f709f;

    /* renamed from: g */
    private int f710g;

    /* renamed from: h */
    private boolean f711h;

    /* renamed from: i */
    private Callback f712i;

    /* renamed from: j */
    private C0177k f713j;

    /* renamed from: k */
    private OnDismissListener f714k;

    /* renamed from: l */
    private final OnDismissListener f715l;

    /* renamed from: androidx.appcompat.view.menu.l$a */
    class C0179a implements OnDismissListener {
        C0179a() {
        }

        public void onDismiss() {
            C0178l.this.mo1046d();
        }
    }

    public C0178l(Context context, MenuBuilder menuBuilder, View view, boolean z, int i) {
        this(context, menuBuilder, view, z, i, 0);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [androidx.appcompat.view.menu.MenuPresenter, androidx.appcompat.view.menu.k] */
    /* JADX WARNING: type inference failed for: r7v0, types: [androidx.appcompat.view.menu.n] */
    /* JADX WARNING: type inference failed for: r1v12, types: [androidx.appcompat.view.menu.d] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.n] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.d] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r7v1, types: [androidx.appcompat.view.menu.n]
      assigns: [androidx.appcompat.view.menu.n, androidx.appcompat.view.menu.d]
      uses: [androidx.appcompat.view.menu.n, androidx.appcompat.view.menu.k, androidx.appcompat.view.menu.MenuPresenter, androidx.appcompat.view.menu.d]
      mth insns count: 49
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.appcompat.view.menu.C0177k m697g() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f704a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 17
            if (r2 < r3) goto L_0x001d
            r0.getRealSize(r1)
            goto L_0x0020
        L_0x001d:
            r0.getSize(r1)
        L_0x0020:
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f704a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = p214e.p215a.C7524d.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x0038:
            r0 = 0
        L_0x0039:
            if (r0 == 0) goto L_0x004c
            androidx.appcompat.view.menu.d r0 = new androidx.appcompat.view.menu.d
            android.content.Context r2 = r14.f704a
            android.view.View r3 = r14.f709f
            int r4 = r14.f707d
            int r5 = r14.f708e
            boolean r6 = r14.f706c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x005e
        L_0x004c:
            androidx.appcompat.view.menu.n r0 = new androidx.appcompat.view.menu.n
            android.content.Context r8 = r14.f704a
            androidx.appcompat.view.menu.MenuBuilder r9 = r14.f705b
            android.view.View r10 = r14.f709f
            int r11 = r14.f707d
            int r12 = r14.f708e
            boolean r13 = r14.f706c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x005e:
            androidx.appcompat.view.menu.MenuBuilder r1 = r14.f705b
            r0.mo873a(r1)
            android.widget.PopupWindow$OnDismissListener r1 = r14.f715l
            r0.mo872a(r1)
            android.view.View r1 = r14.f709f
            r0.mo871a(r1)
            androidx.appcompat.view.menu.MenuPresenter$Callback r1 = r14.f712i
            r0.setCallback(r1)
            boolean r1 = r14.f711h
            r0.mo874a(r1)
            int r1 = r14.f710g
            r0.mo870a(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0178l.m697g():androidx.appcompat.view.menu.k");
    }

    /* renamed from: a */
    public void mo1040a(OnDismissListener onDismissListener) {
        this.f714k = onDismissListener;
    }

    /* renamed from: b */
    public C0177k mo1044b() {
        if (this.f713j == null) {
            this.f713j = m697g();
        }
        return this.f713j;
    }

    /* renamed from: c */
    public boolean mo1045c() {
        C0177k kVar = this.f713j;
        return kVar != null && kVar.isShowing();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo1046d() {
        this.f713j = null;
        OnDismissListener onDismissListener = this.f714k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: e */
    public void mo1047e() {
        if (!mo1048f()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    /* renamed from: f */
    public boolean mo1048f() {
        if (mo1045c()) {
            return true;
        }
        if (this.f709f == null) {
            return false;
        }
        m696a(0, 0, false, false);
        return true;
    }

    public C0178l(Context context, MenuBuilder menuBuilder, View view, boolean z, int i, int i2) {
        this.f710g = 8388611;
        this.f715l = new C0179a();
        this.f704a = context;
        this.f705b = menuBuilder;
        this.f709f = view;
        this.f706c = z;
        this.f707d = i;
        this.f708e = i2;
    }

    /* renamed from: a */
    public void mo1039a(View view) {
        this.f709f = view;
    }

    /* renamed from: a */
    public void mo1042a(boolean z) {
        this.f711h = z;
        C0177k kVar = this.f713j;
        if (kVar != null) {
            kVar.mo874a(z);
        }
    }

    /* renamed from: a */
    public void mo1038a(int i) {
        this.f710g = i;
    }

    /* renamed from: a */
    public boolean mo1043a(int i, int i2) {
        if (mo1045c()) {
            return true;
        }
        if (this.f709f == null) {
            return false;
        }
        m696a(i, i2, true, true);
        return true;
    }

    /* renamed from: a */
    private void m696a(int i, int i2, boolean z, boolean z2) {
        C0177k b = mo1044b();
        b.mo877b(z2);
        if (z) {
            if ((C0641c.m3002a(this.f710g, ViewCompat.m2862o(this.f709f)) & 7) == 5) {
                i -= this.f709f.getWidth();
            }
            b.mo876b(i);
            b.mo878c(i2);
            int i3 = (int) ((this.f704a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            b.mo1034a(new Rect(i - i3, i2 - i3, i + i3, i2 + i3));
        }
        b.show();
    }

    /* renamed from: a */
    public void mo1037a() {
        if (mo1045c()) {
            this.f713j.dismiss();
        }
    }

    /* renamed from: a */
    public void mo1041a(Callback callback) {
        this.f712i = callback;
        C0177k kVar = this.f713j;
        if (kVar != null) {
            kVar.setCallback(callback);
        }
    }
}
