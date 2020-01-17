package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.appcompat.widget.C0269p;
import androidx.core.view.ViewCompat;
import p214e.p215a.C7524d;
import p214e.p215a.C7527g;

/* renamed from: androidx.appcompat.view.menu.n */
final class C0181n extends C0177k implements OnDismissListener, OnItemClickListener, MenuPresenter, OnKeyListener {

    /* renamed from: z */
    private static final int f718z = C7527g.abc_popup_menu_item_layout;

    /* renamed from: f */
    private final Context f719f;

    /* renamed from: g */
    private final MenuBuilder f720g;

    /* renamed from: h */
    private final C0166f f721h;

    /* renamed from: i */
    private final boolean f722i;

    /* renamed from: j */
    private final int f723j;

    /* renamed from: k */
    private final int f724k;

    /* renamed from: l */
    private final int f725l;

    /* renamed from: m */
    final C0269p f726m;

    /* renamed from: n */
    final OnGlobalLayoutListener f727n = new C0182a();

    /* renamed from: o */
    private final OnAttachStateChangeListener f728o = new C0183b();

    /* renamed from: p */
    private OnDismissListener f729p;

    /* renamed from: q */
    private View f730q;

    /* renamed from: r */
    View f731r;

    /* renamed from: s */
    private Callback f732s;

    /* renamed from: t */
    ViewTreeObserver f733t;

    /* renamed from: u */
    private boolean f734u;

    /* renamed from: v */
    private boolean f735v;

    /* renamed from: w */
    private int f736w;

    /* renamed from: x */
    private int f737x = 0;

    /* renamed from: y */
    private boolean f738y;

    /* renamed from: androidx.appcompat.view.menu.n$a */
    class C0182a implements OnGlobalLayoutListener {
        C0182a() {
        }

        public void onGlobalLayout() {
            if (C0181n.this.isShowing() && !C0181n.this.f726m.mo1579i()) {
                View view = C0181n.this.f731r;
                if (view == null || !view.isShown()) {
                    C0181n.this.dismiss();
                } else {
                    C0181n.this.f726m.show();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.n$b */
    class C0183b implements OnAttachStateChangeListener {
        C0183b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0181n.this.f733t;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0181n.this.f733t = view.getViewTreeObserver();
                }
                C0181n nVar = C0181n.this;
                nVar.f733t.removeGlobalOnLayoutListener(nVar.f727n);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public C0181n(Context context, MenuBuilder menuBuilder, View view, int i, int i2, boolean z) {
        this.f719f = context;
        this.f720g = menuBuilder;
        this.f722i = z;
        this.f721h = new C0166f(menuBuilder, LayoutInflater.from(context), this.f722i, f718z);
        this.f724k = i;
        this.f725l = i2;
        Resources resources = context.getResources();
        this.f723j = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C7524d.abc_config_prefDialogWidth));
        this.f730q = view;
        this.f726m = new C0269p(this.f719f, null, this.f724k, this.f725l);
        menuBuilder.mo720a((MenuPresenter) this, context);
    }

    /* renamed from: c */
    private boolean m710c() {
        if (isShowing()) {
            return true;
        }
        if (!this.f734u) {
            View view = this.f730q;
            if (view != null) {
                this.f731r = view;
                this.f726m.mo1563a((OnDismissListener) this);
                this.f726m.mo1562a((OnItemClickListener) this);
                this.f726m.mo1564a(true);
                View view2 = this.f731r;
                boolean z = this.f733t == null;
                this.f733t = view2.getViewTreeObserver();
                if (z) {
                    this.f733t.addOnGlobalLayoutListener(this.f727n);
                }
                view2.addOnAttachStateChangeListener(this.f728o);
                this.f726m.mo1561a(view2);
                this.f726m.mo1573f(this.f737x);
                if (!this.f735v) {
                    this.f736w = C0177k.m682a(this.f721h, null, this.f719f, this.f723j);
                    this.f735v = true;
                }
                this.f726m.mo1571e(this.f736w);
                this.f726m.mo1575g(2);
                this.f726m.mo1560a(mo1035b());
                this.f726m.show();
                ListView listView = this.f726m.getListView();
                listView.setOnKeyListener(this);
                if (this.f738y && this.f720g.mo758h() != null) {
                    FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f719f).inflate(C7527g.abc_popup_menu_header_item_layout, listView, false);
                    TextView textView = (TextView) frameLayout.findViewById(16908310);
                    if (textView != null) {
                        textView.setText(this.f720g.mo758h());
                    }
                    frameLayout.setEnabled(false);
                    listView.addHeaderView(frameLayout, null, false);
                }
                this.f726m.mo1378a((ListAdapter) this.f721h);
                this.f726m.show();
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo873a(MenuBuilder menuBuilder) {
    }

    /* renamed from: a */
    public void mo874a(boolean z) {
        this.f721h.mo899a(z);
    }

    /* renamed from: b */
    public void mo876b(int i) {
        this.f726m.mo1559a(i);
    }

    public void dismiss() {
        if (isShowing()) {
            this.f726m.dismiss();
        }
    }

    public boolean flagActionItems() {
        return false;
    }

    public ListView getListView() {
        return this.f726m.getListView();
    }

    public boolean isShowing() {
        return !this.f734u && this.f726m.isShowing();
    }

    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        if (menuBuilder == this.f720g) {
            dismiss();
            Callback callback = this.f732s;
            if (callback != null) {
                callback.onCloseMenu(menuBuilder, z);
            }
        }
    }

    public void onDismiss() {
        this.f734u = true;
        this.f720g.close();
        ViewTreeObserver viewTreeObserver = this.f733t;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f733t = this.f731r.getViewTreeObserver();
            }
            this.f733t.removeGlobalOnLayoutListener(this.f727n);
            this.f733t = null;
        }
        this.f731r.removeOnAttachStateChangeListener(this.f728o);
        OnDismissListener onDismissListener = this.f729p;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    public Parcelable onSaveInstanceState() {
        return null;
    }

    public boolean onSubMenuSelected(C0184o oVar) {
        if (oVar.hasVisibleItems()) {
            C0178l lVar = new C0178l(this.f719f, oVar, this.f731r, this.f722i, this.f724k, this.f725l);
            lVar.mo1041a(this.f732s);
            lVar.mo1042a(C0177k.m684b((MenuBuilder) oVar));
            lVar.mo1040a(this.f729p);
            this.f729p = null;
            this.f720g.mo722a(false);
            int a = this.f726m.mo1557a();
            int d = this.f726m.mo1568d();
            if ((Gravity.getAbsoluteGravity(this.f737x, ViewCompat.m2862o(this.f730q)) & 7) == 5) {
                a += this.f730q.getWidth();
            }
            if (lVar.mo1043a(a, d)) {
                Callback callback = this.f732s;
                if (callback != null) {
                    callback.onOpenSubMenu(oVar);
                }
                return true;
            }
        }
        return false;
    }

    public void setCallback(Callback callback) {
        this.f732s = callback;
    }

    public void show() {
        if (!m710c()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    public void updateMenuView(boolean z) {
        this.f735v = false;
        C0166f fVar = this.f721h;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    /* renamed from: a */
    public void mo870a(int i) {
        this.f737x = i;
    }

    /* renamed from: b */
    public void mo877b(boolean z) {
        this.f738y = z;
    }

    /* renamed from: a */
    public void mo871a(View view) {
        this.f730q = view;
    }

    /* renamed from: a */
    public void mo872a(OnDismissListener onDismissListener) {
        this.f729p = onDismissListener;
    }

    /* renamed from: c */
    public void mo878c(int i) {
        this.f726m.mo1565b(i);
    }
}
