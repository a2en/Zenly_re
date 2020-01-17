package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.app.ActionBar.OnMenuVisibilityListener;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.ActionMode.Callback;
import androidx.appcompat.view.C0142a;
import androidx.appcompat.view.C0147e;
import androidx.appcompat.view.C0150f;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback;
import androidx.appcompat.widget.C0280t;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C0661n;
import androidx.core.view.C0665o;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorUpdateListener;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p214e.p215a.C7521a;
import p214e.p215a.C7526f;
import p214e.p215a.C7530j;

/* renamed from: androidx.appcompat.app.h */
public class C0137h extends ActionBar implements ActionBarVisibilityCallback {

    /* renamed from: B */
    private static final Interpolator f404B = new AccelerateInterpolator();

    /* renamed from: C */
    private static final Interpolator f405C = new DecelerateInterpolator();

    /* renamed from: A */
    final ViewPropertyAnimatorUpdateListener f406A = new C0140c();

    /* renamed from: a */
    Context f407a;

    /* renamed from: b */
    private Context f408b;

    /* renamed from: c */
    ActionBarOverlayLayout f409c;

    /* renamed from: d */
    ActionBarContainer f410d;

    /* renamed from: e */
    DecorToolbar f411e;

    /* renamed from: f */
    ActionBarContextView f412f;

    /* renamed from: g */
    View f413g;

    /* renamed from: h */
    C0280t f414h;

    /* renamed from: i */
    private boolean f415i;

    /* renamed from: j */
    C0141d f416j;

    /* renamed from: k */
    ActionMode f417k;

    /* renamed from: l */
    Callback f418l;

    /* renamed from: m */
    private boolean f419m;

    /* renamed from: n */
    private ArrayList<OnMenuVisibilityListener> f420n = new ArrayList<>();

    /* renamed from: o */
    private boolean f421o;

    /* renamed from: p */
    private int f422p = 0;

    /* renamed from: q */
    boolean f423q = true;

    /* renamed from: r */
    boolean f424r;

    /* renamed from: s */
    boolean f425s;

    /* renamed from: t */
    private boolean f426t;

    /* renamed from: u */
    private boolean f427u = true;

    /* renamed from: v */
    C0150f f428v;

    /* renamed from: w */
    private boolean f429w;

    /* renamed from: x */
    boolean f430x;

    /* renamed from: y */
    final ViewPropertyAnimatorListener f431y = new C0138a();

    /* renamed from: z */
    final ViewPropertyAnimatorListener f432z = new C0139b();

    /* renamed from: androidx.appcompat.app.h$a */
    class C0138a extends C0665o {
        C0138a() {
        }

        public void onAnimationEnd(View view) {
            C0137h hVar = C0137h.this;
            if (hVar.f423q) {
                View view2 = hVar.f413g;
                if (view2 != null) {
                    view2.setTranslationY(0.0f);
                    C0137h.this.f410d.setTranslationY(0.0f);
                }
            }
            C0137h.this.f410d.setVisibility(8);
            C0137h.this.f410d.setTransitioning(false);
            C0137h hVar2 = C0137h.this;
            hVar2.f428v = null;
            hVar2.mo578h();
            ActionBarOverlayLayout actionBarOverlayLayout = C0137h.this.f409c;
            if (actionBarOverlayLayout != null) {
                ViewCompat.m2809I(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.h$b */
    class C0139b extends C0665o {
        C0139b() {
        }

        public void onAnimationEnd(View view) {
            C0137h hVar = C0137h.this;
            hVar.f428v = null;
            hVar.f410d.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.h$c */
    class C0140c implements ViewPropertyAnimatorUpdateListener {
        C0140c() {
        }

        public void onAnimationUpdate(View view) {
            ((View) C0137h.this.f410d.getParent()).invalidate();
        }
    }

    /* renamed from: androidx.appcompat.app.h$d */
    public class C0141d extends ActionMode implements MenuBuilder.Callback {

        /* renamed from: g */
        private final Context f436g;

        /* renamed from: h */
        private final MenuBuilder f437h;

        /* renamed from: i */
        private Callback f438i;

        /* renamed from: j */
        private WeakReference<View> f439j;

        public C0141d(Context context, Callback callback) {
            this.f436g = context;
            this.f438i = callback;
            MenuBuilder menuBuilder = new MenuBuilder(context);
            menuBuilder.mo742c(1);
            this.f437h = menuBuilder;
            this.f437h.mo718a((MenuBuilder.Callback) this);
        }

        /* renamed from: a */
        public void mo588a() {
            C0137h hVar = C0137h.this;
            if (hVar.f416j == this) {
                if (!C0137h.m431a(hVar.f424r, hVar.f425s, false)) {
                    C0137h hVar2 = C0137h.this;
                    hVar2.f417k = this;
                    hVar2.f418l = this.f438i;
                } else {
                    this.f438i.onDestroyActionMode(this);
                }
                this.f438i = null;
                C0137h.this.mo574e(false);
                C0137h.this.f412f.mo1115a();
                C0137h.this.f411e.getViewGroup().sendAccessibilityEvent(32);
                C0137h hVar3 = C0137h.this;
                hVar3.f409c.setHideOnContentScrollEnabled(hVar3.f430x);
                C0137h.this.f416j = null;
            }
        }

        /* renamed from: b */
        public void mo595b(CharSequence charSequence) {
            C0137h.this.f412f.setTitle(charSequence);
        }

        /* renamed from: c */
        public Menu mo596c() {
            return this.f437h;
        }

        /* renamed from: d */
        public MenuInflater mo597d() {
            return new C0147e(this.f436g);
        }

        /* renamed from: e */
        public CharSequence mo598e() {
            return C0137h.this.f412f.getSubtitle();
        }

        /* renamed from: g */
        public CharSequence mo599g() {
            return C0137h.this.f412f.getTitle();
        }

        /* renamed from: i */
        public void mo600i() {
            if (C0137h.this.f416j == this) {
                this.f437h.mo775s();
                try {
                    this.f438i.onPrepareActionMode(this, this.f437h);
                } finally {
                    this.f437h.mo772r();
                }
            }
        }

        /* renamed from: j */
        public boolean mo601j() {
            return C0137h.this.f412f.mo1117b();
        }

        /* renamed from: k */
        public boolean mo602k() {
            this.f437h.mo775s();
            try {
                return this.f438i.onCreateActionMode(this, this.f437h);
            } finally {
                this.f437h.mo772r();
            }
        }

        public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            Callback callback = this.f438i;
            if (callback != null) {
                return callback.onActionItemClicked(this, menuItem);
            }
            return false;
        }

        public void onMenuModeChange(MenuBuilder menuBuilder) {
            if (this.f438i != null) {
                mo600i();
                C0137h.this.f412f.mo1119d();
            }
        }

        /* renamed from: b */
        public void mo594b(int i) {
            mo595b((CharSequence) C0137h.this.f407a.getResources().getString(i));
        }

        /* renamed from: b */
        public View mo593b() {
            WeakReference<View> weakReference = this.f439j;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        /* renamed from: a */
        public void mo590a(View view) {
            C0137h.this.f412f.setCustomView(view);
            this.f439j = new WeakReference<>(view);
        }

        /* renamed from: a */
        public void mo591a(CharSequence charSequence) {
            C0137h.this.f412f.setSubtitle(charSequence);
        }

        /* renamed from: a */
        public void mo589a(int i) {
            mo591a((CharSequence) C0137h.this.f407a.getResources().getString(i));
        }

        /* renamed from: a */
        public void mo592a(boolean z) {
            super.mo592a(z);
            C0137h.this.f412f.setTitleOptional(z);
        }
    }

    public C0137h(Activity activity, boolean z) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        m432b(decorView);
        if (!z) {
            this.f413g = decorView.findViewById(16908290);
        }
    }

    /* renamed from: a */
    private DecorToolbar m430a(View view) {
        if (view instanceof DecorToolbar) {
            return (DecorToolbar) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != null ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    static boolean m431a(boolean z, boolean z2, boolean z3) {
        if (z3) {
            return true;
        }
        return !z && !z2;
    }

    /* renamed from: b */
    private void m432b(View view) {
        this.f409c = (ActionBarOverlayLayout) view.findViewById(C7526f.decor_content_parent);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f409c;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f411e = m430a(view.findViewById(C7526f.action_bar));
        this.f412f = (ActionBarContextView) view.findViewById(C7526f.action_context_bar);
        this.f410d = (ActionBarContainer) view.findViewById(C7526f.action_bar_container);
        DecorToolbar decorToolbar = this.f411e;
        if (decorToolbar == null || this.f412f == null || this.f410d == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0137h.class.getSimpleName());
            sb.append(" can only be used with a compatible window decor layout");
            throw new IllegalStateException(sb.toString());
        }
        this.f407a = decorToolbar.getContext();
        boolean z = (this.f411e.getDisplayOptions() & 4) != 0;
        if (z) {
            this.f415i = true;
        }
        C0142a a = C0142a.m493a(this.f407a);
        mo582i(a.mo608a() || z);
        m434j(a.mo613f());
        TypedArray obtainStyledAttributes = this.f407a.obtainStyledAttributes(null, C7530j.ActionBar, C7521a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C7530j.ActionBar_hideOnContentScroll, false)) {
            mo579h(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C7530j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            mo572a((float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: j */
    private void m434j(boolean z) {
        this.f421o = z;
        if (!this.f421o) {
            this.f411e.setEmbeddedTabView(null);
            this.f410d.setTabContainer(this.f414h);
        } else {
            this.f410d.setTabContainer(null);
            this.f411e.setEmbeddedTabView(this.f414h);
        }
        boolean z2 = true;
        boolean z3 = mo581i() == 2;
        C0280t tVar = this.f414h;
        if (tVar != null) {
            if (z3) {
                tVar.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f409c;
                if (actionBarOverlayLayout != null) {
                    ViewCompat.m2809I(actionBarOverlayLayout);
                }
            } else {
                tVar.setVisibility(8);
            }
        }
        this.f411e.setCollapsible(!this.f421o && z3);
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.f409c;
        if (this.f421o || !z3) {
            z2 = false;
        }
        actionBarOverlayLayout2.setHasNonEmbeddedTabs(z2);
    }

    /* renamed from: k */
    private void m435k(boolean z) {
        if (m431a(this.f424r, this.f425s, this.f426t)) {
            if (!this.f427u) {
                this.f427u = true;
                mo577g(z);
            }
        } else if (this.f427u) {
            this.f427u = false;
            mo576f(z);
        }
    }

    /* renamed from: l */
    private void m437l() {
        if (!this.f426t) {
            this.f426t = true;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f409c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(true);
            }
            m435k(false);
        }
    }

    /* renamed from: c */
    public void mo304c(boolean z) {
        mo573a(z ? 4 : 0, 4);
    }

    /* renamed from: d */
    public void mo306d(boolean z) {
        this.f429w = z;
        if (!z) {
            C0150f fVar = this.f428v;
            if (fVar != null) {
                fVar.mo655a();
            }
        }
    }

    /* renamed from: e */
    public void mo574e(boolean z) {
        C0661n nVar;
        C0661n nVar2;
        if (z) {
            m437l();
        } else {
            m433j();
        }
        if (m436k()) {
            if (z) {
                nVar = this.f411e.setupAnimatorToVisibility(4, 100);
                nVar2 = this.f412f.mo1854a(0, 200);
            } else {
                nVar2 = this.f411e.setupAnimatorToVisibility(0, 200);
                nVar = this.f412f.mo1854a(8, 100);
            }
            C0150f fVar = new C0150f();
            fVar.mo654a(nVar, nVar2);
            fVar.mo657c();
        } else if (z) {
            this.f411e.setVisibility(4);
            this.f412f.setVisibility(0);
        } else {
            this.f411e.setVisibility(0);
            this.f412f.setVisibility(8);
        }
    }

    public void enableContentAnimations(boolean z) {
        this.f423q = z;
    }

    /* renamed from: f */
    public void mo576f(boolean z) {
        C0150f fVar = this.f428v;
        if (fVar != null) {
            fVar.mo655a();
        }
        if (this.f422p != 0 || (!this.f429w && !z)) {
            this.f431y.onAnimationEnd(null);
            return;
        }
        this.f410d.setAlpha(1.0f);
        this.f410d.setTransitioning(true);
        C0150f fVar2 = new C0150f();
        float f = (float) (-this.f410d.getHeight());
        if (z) {
            int[] iArr = {0, 0};
            this.f410d.getLocationInWindow(iArr);
            f -= (float) iArr[1];
        }
        C0661n a = ViewCompat.m2813a(this.f410d);
        a.mo3436c(f);
        a.mo3431a(this.f406A);
        fVar2.mo653a(a);
        if (this.f423q) {
            View view = this.f413g;
            if (view != null) {
                C0661n a2 = ViewCompat.m2813a(view);
                a2.mo3436c(f);
                fVar2.mo653a(a2);
            }
        }
        fVar2.mo651a(f404B);
        fVar2.mo650a(250);
        fVar2.mo652a(this.f431y);
        this.f428v = fVar2;
        fVar2.mo657c();
    }

    /* renamed from: g */
    public void mo577g(boolean z) {
        C0150f fVar = this.f428v;
        if (fVar != null) {
            fVar.mo655a();
        }
        this.f410d.setVisibility(0);
        if (this.f422p != 0 || (!this.f429w && !z)) {
            this.f410d.setAlpha(1.0f);
            this.f410d.setTranslationY(0.0f);
            if (this.f423q) {
                View view = this.f413g;
                if (view != null) {
                    view.setTranslationY(0.0f);
                }
            }
            this.f432z.onAnimationEnd(null);
        } else {
            this.f410d.setTranslationY(0.0f);
            float f = (float) (-this.f410d.getHeight());
            if (z) {
                int[] iArr = {0, 0};
                this.f410d.getLocationInWindow(iArr);
                f -= (float) iArr[1];
            }
            this.f410d.setTranslationY(f);
            C0150f fVar2 = new C0150f();
            C0661n a = ViewCompat.m2813a(this.f410d);
            a.mo3436c(0.0f);
            a.mo3431a(this.f406A);
            fVar2.mo653a(a);
            if (this.f423q) {
                View view2 = this.f413g;
                if (view2 != null) {
                    view2.setTranslationY(f);
                    C0661n a2 = ViewCompat.m2813a(this.f413g);
                    a2.mo3436c(0.0f);
                    fVar2.mo653a(a2);
                }
            }
            fVar2.mo651a(f405C);
            fVar2.mo650a(250);
            fVar2.mo652a(this.f432z);
            this.f428v = fVar2;
            fVar2.mo657c();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f409c;
        if (actionBarOverlayLayout != null) {
            ViewCompat.m2809I(actionBarOverlayLayout);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public void mo578h() {
        Callback callback = this.f418l;
        if (callback != null) {
            callback.onDestroyActionMode(this.f417k);
            this.f417k = null;
            this.f418l = null;
        }
    }

    public void hideForSystem() {
        if (!this.f425s) {
            this.f425s = true;
            m435k(true);
        }
    }

    /* renamed from: i */
    public void mo582i(boolean z) {
        this.f411e.setHomeButtonEnabled(z);
    }

    public void onContentScrollStarted() {
        C0150f fVar = this.f428v;
        if (fVar != null) {
            fVar.mo655a();
            this.f428v = null;
        }
    }

    public void onContentScrollStopped() {
    }

    public void onWindowVisibilityChanged(int i) {
        this.f422p = i;
    }

    public void showForSystem() {
        if (this.f425s) {
            this.f425s = false;
            m435k(true);
        }
    }

    /* renamed from: c */
    public int mo303c() {
        return this.f411e.getDisplayOptions();
    }

    /* renamed from: i */
    public int mo581i() {
        return this.f411e.getNavigationMode();
    }

    /* renamed from: d */
    public Context mo305d() {
        if (this.f408b == null) {
            TypedValue typedValue = new TypedValue();
            this.f407a.getTheme().resolveAttribute(C7521a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f408b = new ContextThemeWrapper(this.f407a, i);
            } else {
                this.f408b = this.f407a;
            }
        }
        return this.f408b;
    }

    /* renamed from: h */
    public void mo579h(boolean z) {
        if (!z || this.f409c.mo1139b()) {
            this.f430x = z;
            this.f409c.setHideOnContentScrollEnabled(z);
            return;
        }
        throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
    }

    /* renamed from: a */
    public void mo572a(float f) {
        ViewCompat.m2835b((View) this.f410d, f);
    }

    /* renamed from: k */
    private boolean m436k() {
        return ViewCompat.m2804D(this.f410d);
    }

    /* renamed from: a */
    public void mo293a(Configuration configuration) {
        m434j(C0142a.m493a(this.f407a).mo613f());
    }

    /* renamed from: a */
    public void mo296a(boolean z) {
        if (z != this.f419m) {
            this.f419m = z;
            int size = this.f420n.size();
            for (int i = 0; i < size; i++) {
                ((OnMenuVisibilityListener) this.f420n.get(i)).onMenuVisibilityChanged(z);
            }
        }
    }

    /* renamed from: a */
    public void mo295a(CharSequence charSequence) {
        this.f411e.setTitle(charSequence);
    }

    public C0137h(Dialog dialog) {
        new ArrayList();
        m432b(dialog.getWindow().getDecorView());
    }

    /* renamed from: a */
    public void mo573a(int i, int i2) {
        int displayOptions = this.f411e.getDisplayOptions();
        if ((i2 & 4) != 0) {
            this.f415i = true;
        }
        this.f411e.setDisplayOptions((i & i2) | ((~i2) & displayOptions));
    }

    /* renamed from: j */
    private void m433j() {
        if (this.f426t) {
            this.f426t = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f409c;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            m435k(false);
        }
    }

    /* renamed from: a */
    public ActionMode mo291a(Callback callback) {
        C0141d dVar = this.f416j;
        if (dVar != null) {
            dVar.mo588a();
        }
        this.f409c.setHideOnContentScrollEnabled(false);
        this.f412f.mo1118c();
        C0141d dVar2 = new C0141d(this.f412f.getContext(), callback);
        if (!dVar2.mo602k()) {
            return null;
        }
        this.f416j = dVar2;
        dVar2.mo600i();
        this.f412f.mo1116a(dVar2);
        mo574e(true);
        this.f412f.sendAccessibilityEvent(32);
        return dVar2;
    }

    /* renamed from: b */
    public void mo300b(CharSequence charSequence) {
        this.f411e.setWindowTitle(charSequence);
    }

    /* renamed from: b */
    public boolean mo302b() {
        DecorToolbar decorToolbar = this.f411e;
        if (decorToolbar == null || !decorToolbar.hasExpandedActionView()) {
            return false;
        }
        this.f411e.collapseActionView();
        return true;
    }

    /* renamed from: b */
    public void mo301b(boolean z) {
        if (!this.f415i) {
            mo304c(z);
        }
    }

    /* renamed from: a */
    public void mo294a(Drawable drawable) {
        this.f411e.setNavigationIcon(drawable);
    }

    /* renamed from: a */
    public void mo292a(int i) {
        this.f411e.setNavigationContentDescription(i);
    }

    /* renamed from: a */
    public boolean mo298a(int i, KeyEvent keyEvent) {
        C0141d dVar = this.f416j;
        if (dVar == null) {
            return false;
        }
        Menu c = dVar.mo596c();
        if (c == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        c.setQwertyMode(z);
        return c.performShortcut(i, keyEvent, 0);
    }
}
