package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;

/* renamed from: androidx.recyclerview.widget.o */
public abstract class C1136o {

    /* renamed from: a */
    protected final LayoutManager f4347a;

    /* renamed from: b */
    private int f4348b;

    /* renamed from: c */
    final Rect f4349c;

    /* renamed from: androidx.recyclerview.widget.o$a */
    static class C1137a extends C1136o {
        C1137a(LayoutManager layoutManager) {
            super(layoutManager, null);
        }

        /* renamed from: a */
        public int mo5745a() {
            return this.f4347a.mo5309t();
        }

        /* renamed from: b */
        public int mo5748b() {
            return this.f4347a.mo5309t() - this.f4347a.mo5306q();
        }

        /* renamed from: c */
        public int mo5751c(View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            return this.f4347a.mo5286g(view) + layoutParams.topMargin + layoutParams.bottomMargin;
        }

        /* renamed from: d */
        public int mo5753d(View view) {
            return this.f4347a.mo5282f(view) - ((LayoutParams) view.getLayoutParams()).leftMargin;
        }

        /* renamed from: e */
        public int mo5755e(View view) {
            this.f4347a.mo5231a(view, true, this.f4349c);
            return this.f4349c.right;
        }

        /* renamed from: f */
        public int mo5756f() {
            return this.f4347a.mo5305p();
        }

        /* renamed from: g */
        public int mo5758g() {
            return (this.f4347a.mo5309t() - this.f4347a.mo5305p()) - this.f4347a.mo5306q();
        }

        /* renamed from: a */
        public void mo5747a(int i) {
            this.f4347a.mo5275d(i);
        }

        /* renamed from: b */
        public int mo5749b(View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            return this.f4347a.mo5290h(view) + layoutParams.leftMargin + layoutParams.rightMargin;
        }

        /* renamed from: f */
        public int mo5757f(View view) {
            this.f4347a.mo5231a(view, true, this.f4349c);
            return this.f4349c.left;
        }

        /* renamed from: a */
        public int mo5746a(View view) {
            return this.f4347a.mo5292i(view) + ((LayoutParams) view.getLayoutParams()).rightMargin;
        }

        /* renamed from: c */
        public int mo5750c() {
            return this.f4347a.mo5306q();
        }

        /* renamed from: d */
        public int mo5752d() {
            return this.f4347a.mo5310u();
        }

        /* renamed from: e */
        public int mo5754e() {
            return this.f4347a.mo5291i();
        }
    }

    /* renamed from: androidx.recyclerview.widget.o$b */
    static class C1138b extends C1136o {
        C1138b(LayoutManager layoutManager) {
            super(layoutManager, null);
        }

        /* renamed from: a */
        public int mo5745a() {
            return this.f4347a.mo5289h();
        }

        /* renamed from: b */
        public int mo5748b() {
            return this.f4347a.mo5289h() - this.f4347a.mo5301n();
        }

        /* renamed from: c */
        public int mo5751c(View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            return this.f4347a.mo5290h(view) + layoutParams.leftMargin + layoutParams.rightMargin;
        }

        /* renamed from: d */
        public int mo5753d(View view) {
            return this.f4347a.mo5294j(view) - ((LayoutParams) view.getLayoutParams()).topMargin;
        }

        /* renamed from: e */
        public int mo5755e(View view) {
            this.f4347a.mo5231a(view, true, this.f4349c);
            return this.f4349c.bottom;
        }

        /* renamed from: f */
        public int mo5756f() {
            return this.f4347a.mo5308s();
        }

        /* renamed from: g */
        public int mo5758g() {
            return (this.f4347a.mo5289h() - this.f4347a.mo5308s()) - this.f4347a.mo5301n();
        }

        /* renamed from: a */
        public void mo5747a(int i) {
            this.f4347a.mo5280e(i);
        }

        /* renamed from: b */
        public int mo5749b(View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            return this.f4347a.mo5286g(view) + layoutParams.topMargin + layoutParams.bottomMargin;
        }

        /* renamed from: f */
        public int mo5757f(View view) {
            this.f4347a.mo5231a(view, true, this.f4349c);
            return this.f4349c.top;
        }

        /* renamed from: a */
        public int mo5746a(View view) {
            return this.f4347a.mo5279e(view) + ((LayoutParams) view.getLayoutParams()).bottomMargin;
        }

        /* renamed from: c */
        public int mo5750c() {
            return this.f4347a.mo5301n();
        }

        /* renamed from: d */
        public int mo5752d() {
            return this.f4347a.mo5291i();
        }

        /* renamed from: e */
        public int mo5754e() {
            return this.f4347a.mo5310u();
        }
    }

    /* synthetic */ C1136o(LayoutManager layoutManager, C1137a aVar) {
        this(layoutManager);
    }

    /* renamed from: a */
    public static C1136o m5539a(LayoutManager layoutManager, int i) {
        if (i == 0) {
            return m5538a(layoutManager);
        }
        if (i == 1) {
            return m5540b(layoutManager);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: b */
    public static C1136o m5540b(LayoutManager layoutManager) {
        return new C1138b(layoutManager);
    }

    /* renamed from: a */
    public abstract int mo5745a();

    /* renamed from: a */
    public abstract int mo5746a(View view);

    /* renamed from: a */
    public abstract void mo5747a(int i);

    /* renamed from: b */
    public abstract int mo5748b();

    /* renamed from: b */
    public abstract int mo5749b(View view);

    /* renamed from: c */
    public abstract int mo5750c();

    /* renamed from: c */
    public abstract int mo5751c(View view);

    /* renamed from: d */
    public abstract int mo5752d();

    /* renamed from: d */
    public abstract int mo5753d(View view);

    /* renamed from: e */
    public abstract int mo5754e();

    /* renamed from: e */
    public abstract int mo5755e(View view);

    /* renamed from: f */
    public abstract int mo5756f();

    /* renamed from: f */
    public abstract int mo5757f(View view);

    /* renamed from: g */
    public abstract int mo5758g();

    /* renamed from: h */
    public int mo5759h() {
        if (Integer.MIN_VALUE == this.f4348b) {
            return 0;
        }
        return mo5758g() - this.f4348b;
    }

    /* renamed from: i */
    public void mo5760i() {
        this.f4348b = mo5758g();
    }

    private C1136o(LayoutManager layoutManager) {
        this.f4348b = Integer.MIN_VALUE;
        this.f4349c = new Rect();
        this.f4347a = layoutManager;
    }

    /* renamed from: a */
    public static C1136o m5538a(LayoutManager layoutManager) {
        return new C1137a(layoutManager);
    }
}
