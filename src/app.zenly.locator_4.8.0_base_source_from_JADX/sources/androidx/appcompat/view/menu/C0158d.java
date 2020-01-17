package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.appcompat.widget.C0269p;
import androidx.appcompat.widget.MenuItemHoverListener;
import androidx.core.view.C0641c;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.List;
import p214e.p215a.C7524d;
import p214e.p215a.C7527g;

/* renamed from: androidx.appcompat.view.menu.d */
final class C0158d extends C0177k implements MenuPresenter, OnKeyListener, OnDismissListener {

    /* renamed from: F */
    private static final int f602F = C7527g.abc_cascading_menu_item_layout;

    /* renamed from: A */
    private boolean f603A;

    /* renamed from: B */
    private Callback f604B;

    /* renamed from: C */
    ViewTreeObserver f605C;

    /* renamed from: D */
    private OnDismissListener f606D;

    /* renamed from: E */
    boolean f607E;

    /* renamed from: f */
    private final Context f608f;

    /* renamed from: g */
    private final int f609g;

    /* renamed from: h */
    private final int f610h;

    /* renamed from: i */
    private final int f611i;

    /* renamed from: j */
    private final boolean f612j;

    /* renamed from: k */
    final Handler f613k;

    /* renamed from: l */
    private final List<MenuBuilder> f614l = new ArrayList();

    /* renamed from: m */
    final List<C0163d> f615m = new ArrayList();

    /* renamed from: n */
    final OnGlobalLayoutListener f616n = new C0159a();

    /* renamed from: o */
    private final OnAttachStateChangeListener f617o = new C0160b();

    /* renamed from: p */
    private final MenuItemHoverListener f618p = new C0161c();

    /* renamed from: q */
    private int f619q = 0;

    /* renamed from: r */
    private int f620r = 0;

    /* renamed from: s */
    private View f621s;

    /* renamed from: t */
    View f622t;

    /* renamed from: u */
    private int f623u;

    /* renamed from: v */
    private boolean f624v;

    /* renamed from: w */
    private boolean f625w;

    /* renamed from: x */
    private int f626x;

    /* renamed from: y */
    private int f627y;

    /* renamed from: z */
    private boolean f628z;

    /* renamed from: androidx.appcompat.view.menu.d$a */
    class C0159a implements OnGlobalLayoutListener {
        C0159a() {
        }

        public void onGlobalLayout() {
            if (C0158d.this.isShowing() && C0158d.this.f615m.size() > 0 && !((C0163d) C0158d.this.f615m.get(0)).f636a.mo1579i()) {
                View view = C0158d.this.f622t;
                if (view == null || !view.isShown()) {
                    C0158d.this.dismiss();
                    return;
                }
                for (C0163d dVar : C0158d.this.f615m) {
                    dVar.f636a.show();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$b */
    class C0160b implements OnAttachStateChangeListener {
        C0160b() {
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0158d.this.f605C;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0158d.this.f605C = view.getViewTreeObserver();
                }
                C0158d dVar = C0158d.this;
                dVar.f605C.removeGlobalOnLayoutListener(dVar.f616n);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$c */
    class C0161c implements MenuItemHoverListener {

        /* renamed from: androidx.appcompat.view.menu.d$c$a */
        class C0162a implements Runnable {

            /* renamed from: e */
            final /* synthetic */ C0163d f632e;

            /* renamed from: f */
            final /* synthetic */ MenuItem f633f;

            /* renamed from: g */
            final /* synthetic */ MenuBuilder f634g;

            C0162a(C0163d dVar, MenuItem menuItem, MenuBuilder menuBuilder) {
                this.f632e = dVar;
                this.f633f = menuItem;
                this.f634g = menuBuilder;
            }

            public void run() {
                C0163d dVar = this.f632e;
                if (dVar != null) {
                    C0158d.this.f607E = true;
                    dVar.f637b.mo722a(false);
                    C0158d.this.f607E = false;
                }
                if (this.f633f.isEnabled() && this.f633f.hasSubMenu()) {
                    this.f634g.mo723a(this.f633f, 4);
                }
            }
        }

        C0161c() {
        }

        public void onItemHoverEnter(MenuBuilder menuBuilder, MenuItem menuItem) {
            C0163d dVar = null;
            C0158d.this.f613k.removeCallbacksAndMessages(null);
            int size = C0158d.this.f615m.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (menuBuilder == ((C0163d) C0158d.this.f615m.get(i)).f637b) {
                    break;
                } else {
                    i++;
                }
            }
            if (i != -1) {
                int i2 = i + 1;
                if (i2 < C0158d.this.f615m.size()) {
                    dVar = (C0163d) C0158d.this.f615m.get(i2);
                }
                C0158d.this.f613k.postAtTime(new C0162a(dVar, menuItem, menuBuilder), menuBuilder, SystemClock.uptimeMillis() + 200);
            }
        }

        public void onItemHoverExit(MenuBuilder menuBuilder, MenuItem menuItem) {
            C0158d.this.f613k.removeCallbacksAndMessages(menuBuilder);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.d$d */
    private static class C0163d {

        /* renamed from: a */
        public final C0269p f636a;

        /* renamed from: b */
        public final MenuBuilder f637b;

        /* renamed from: c */
        public final int f638c;

        public C0163d(C0269p pVar, MenuBuilder menuBuilder, int i) {
            this.f636a = pVar;
            this.f637b = menuBuilder;
            this.f638c = i;
        }

        /* renamed from: a */
        public ListView mo887a() {
            return this.f636a.getListView();
        }
    }

    public C0158d(Context context, View view, int i, int i2, boolean z) {
        this.f608f = context;
        this.f621s = view;
        this.f610h = i;
        this.f611i = i2;
        this.f612j = z;
        this.f628z = false;
        this.f623u = m628d();
        Resources resources = context.getResources();
        this.f609g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C7524d.abc_config_prefDialogWidth));
        this.f613k = new Handler();
    }

    /* renamed from: c */
    private C0269p m627c() {
        C0269p pVar = new C0269p(this.f608f, null, this.f610h, this.f611i);
        pVar.mo1987a(this.f618p);
        pVar.mo1562a((OnItemClickListener) this);
        pVar.mo1563a((OnDismissListener) this);
        pVar.mo1561a(this.f621s);
        pVar.mo1573f(this.f620r);
        pVar.mo1564a(true);
        pVar.mo1575g(2);
        return pVar;
    }

    /* renamed from: d */
    private int m628d() {
        return ViewCompat.m2862o(this.f621s) == 1 ? 0 : 1;
    }

    /* renamed from: a */
    public void mo874a(boolean z) {
        this.f628z = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo875a() {
        return false;
    }

    /* renamed from: b */
    public void mo876b(int i) {
        this.f624v = true;
        this.f626x = i;
    }

    public void dismiss() {
        int size = this.f615m.size();
        if (size > 0) {
            C0163d[] dVarArr = (C0163d[]) this.f615m.toArray(new C0163d[size]);
            for (int i = size - 1; i >= 0; i--) {
                C0163d dVar = dVarArr[i];
                if (dVar.f636a.isShowing()) {
                    dVar.f636a.dismiss();
                }
            }
        }
    }

    public boolean flagActionItems() {
        return false;
    }

    public ListView getListView() {
        if (this.f615m.isEmpty()) {
            return null;
        }
        List<C0163d> list = this.f615m;
        return ((C0163d) list.get(list.size() - 1)).mo887a();
    }

    public boolean isShowing() {
        return this.f615m.size() > 0 && ((C0163d) this.f615m.get(0)).f636a.isShowing();
    }

    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        int c = m626c(menuBuilder);
        if (c >= 0) {
            int i = c + 1;
            if (i < this.f615m.size()) {
                ((C0163d) this.f615m.get(i)).f637b.mo722a(false);
            }
            C0163d dVar = (C0163d) this.f615m.remove(c);
            dVar.f637b.mo739b((MenuPresenter) this);
            if (this.f607E) {
                dVar.f636a.mo1989b(null);
                dVar.f636a.mo1569d(0);
            }
            dVar.f636a.dismiss();
            int size = this.f615m.size();
            if (size > 0) {
                this.f623u = ((C0163d) this.f615m.get(size - 1)).f638c;
            } else {
                this.f623u = m628d();
            }
            if (size == 0) {
                dismiss();
                Callback callback = this.f604B;
                if (callback != null) {
                    callback.onCloseMenu(menuBuilder, true);
                }
                ViewTreeObserver viewTreeObserver = this.f605C;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f605C.removeGlobalOnLayoutListener(this.f616n);
                    }
                    this.f605C = null;
                }
                this.f622t.removeOnAttachStateChangeListener(this.f617o);
                this.f606D.onDismiss();
            } else if (z) {
                ((C0163d) this.f615m.get(0)).f637b.mo722a(false);
            }
        }
    }

    public void onDismiss() {
        C0163d dVar;
        int size = this.f615m.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = (C0163d) this.f615m.get(i);
            if (!dVar.f636a.isShowing()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.f637b.mo722a(false);
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
        for (C0163d dVar : this.f615m) {
            if (oVar == dVar.f637b) {
                dVar.mo887a().requestFocus();
                return true;
            }
        }
        if (!oVar.hasVisibleItems()) {
            return false;
        }
        mo873a((MenuBuilder) oVar);
        Callback callback = this.f604B;
        if (callback != null) {
            callback.onOpenSubMenu(oVar);
        }
        return true;
    }

    public void setCallback(Callback callback) {
        this.f604B = callback;
    }

    public void show() {
        if (!isShowing()) {
            for (MenuBuilder d : this.f614l) {
                m630d(d);
            }
            this.f614l.clear();
            this.f622t = this.f621s;
            if (this.f622t != null) {
                boolean z = this.f605C == null;
                this.f605C = this.f622t.getViewTreeObserver();
                if (z) {
                    this.f605C.addOnGlobalLayoutListener(this.f616n);
                }
                this.f622t.addOnAttachStateChangeListener(this.f617o);
            }
        }
    }

    public void updateMenuView(boolean z) {
        for (C0163d a : this.f615m) {
            C0177k.m683a(a.mo887a().getAdapter()).notifyDataSetChanged();
        }
    }

    /* renamed from: d */
    private int m629d(int i) {
        List<C0163d> list = this.f615m;
        ListView a = ((C0163d) list.get(list.size() - 1)).mo887a();
        int[] iArr = new int[2];
        a.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f622t.getWindowVisibleDisplayFrame(rect);
        if (this.f623u == 1) {
            if (iArr[0] + a.getWidth() + i > rect.right) {
                return 0;
            }
            return 1;
        } else if (iArr[0] - i < 0) {
            return 1;
        } else {
            return 0;
        }
    }

    /* renamed from: a */
    public void mo873a(MenuBuilder menuBuilder) {
        menuBuilder.mo720a((MenuPresenter) this, this.f608f);
        if (isShowing()) {
            m630d(menuBuilder);
        } else {
            this.f614l.add(menuBuilder);
        }
    }

    /* renamed from: b */
    public void mo877b(boolean z) {
        this.f603A = z;
    }

    /* renamed from: a */
    private MenuItem m624a(MenuBuilder menuBuilder, MenuBuilder menuBuilder2) {
        int size = menuBuilder.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menuBuilder.getItem(i);
            if (item.hasSubMenu() && menuBuilder2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    /* renamed from: a */
    private View m625a(C0163d dVar, MenuBuilder menuBuilder) {
        int i;
        C0166f fVar;
        MenuItem a = m624a(dVar.f637b, menuBuilder);
        if (a == null) {
            return null;
        }
        ListView a2 = dVar.mo887a();
        ListAdapter adapter = a2.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            fVar = (C0166f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (C0166f) adapter;
            i = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            } else if (a == fVar.getItem(i2)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1) {
            return null;
        }
        int firstVisiblePosition = (i2 + i) - a2.getFirstVisiblePosition();
        if (firstVisiblePosition < 0 || firstVisiblePosition >= a2.getChildCount()) {
            return null;
        }
        return a2.getChildAt(firstVisiblePosition);
    }

    /* renamed from: c */
    private int m626c(MenuBuilder menuBuilder) {
        int size = this.f615m.size();
        for (int i = 0; i < size; i++) {
            if (menuBuilder == ((C0163d) this.f615m.get(i)).f637b) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: d */
    private void m630d(MenuBuilder menuBuilder) {
        View view;
        C0163d dVar;
        int i;
        int i2;
        int i3;
        LayoutInflater from = LayoutInflater.from(this.f608f);
        C0166f fVar = new C0166f(menuBuilder, from, this.f612j, f602F);
        if (!isShowing() && this.f628z) {
            fVar.mo899a(true);
        } else if (isShowing()) {
            fVar.mo899a(C0177k.m684b(menuBuilder));
        }
        int a = C0177k.m682a(fVar, null, this.f608f, this.f609g);
        C0269p c = m627c();
        c.mo1378a((ListAdapter) fVar);
        c.mo1571e(a);
        c.mo1573f(this.f620r);
        if (this.f615m.size() > 0) {
            List<C0163d> list = this.f615m;
            dVar = (C0163d) list.get(list.size() - 1);
            view = m625a(dVar, menuBuilder);
        } else {
            dVar = null;
            view = null;
        }
        if (view != null) {
            c.mo1990c(false);
            c.mo1988a((Object) null);
            int d = m629d(a);
            boolean z = d == 1;
            this.f623u = d;
            if (VERSION.SDK_INT >= 26) {
                c.mo1561a(view);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f621s.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                if ((this.f620r & 7) == 5) {
                    iArr[0] = iArr[0] + this.f621s.getWidth();
                    iArr2[0] = iArr2[0] + view.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f620r & 5) != 5) {
                if (z) {
                    a = view.getWidth();
                }
                i3 = i - a;
                c.mo1559a(i3);
                c.mo1566b(true);
                c.mo1565b(i2);
            } else if (!z) {
                a = view.getWidth();
                i3 = i - a;
                c.mo1559a(i3);
                c.mo1566b(true);
                c.mo1565b(i2);
            }
            i3 = i + a;
            c.mo1559a(i3);
            c.mo1566b(true);
            c.mo1565b(i2);
        } else {
            if (this.f624v) {
                c.mo1559a(this.f626x);
            }
            if (this.f625w) {
                c.mo1565b(this.f627y);
            }
            c.mo1560a(mo1035b());
        }
        this.f615m.add(new C0163d(c, menuBuilder, this.f623u));
        c.show();
        ListView listView = c.getListView();
        listView.setOnKeyListener(this);
        if (dVar == null && this.f603A && menuBuilder.mo758h() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(C7527g.abc_popup_menu_header_item_layout, listView, false);
            TextView textView = (TextView) frameLayout.findViewById(16908310);
            frameLayout.setEnabled(false);
            textView.setText(menuBuilder.mo758h());
            listView.addHeaderView(frameLayout, null, false);
            c.show();
        }
    }

    /* renamed from: c */
    public void mo878c(int i) {
        this.f625w = true;
        this.f627y = i;
    }

    /* renamed from: a */
    public void mo870a(int i) {
        if (this.f619q != i) {
            this.f619q = i;
            this.f620r = C0641c.m3002a(i, ViewCompat.m2862o(this.f621s));
        }
    }

    /* renamed from: a */
    public void mo871a(View view) {
        if (this.f621s != view) {
            this.f621s = view;
            this.f620r = C0641c.m3002a(this.f619q, ViewCompat.m2862o(this.f621s));
        }
    }

    /* renamed from: a */
    public void mo872a(OnDismissListener onDismissListener) {
        this.f606D = onDismissListener;
    }
}
