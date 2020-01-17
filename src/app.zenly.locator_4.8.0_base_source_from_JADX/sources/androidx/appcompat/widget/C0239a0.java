package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window.Callback;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.view.menu.C0155a;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.Toolbar.LayoutParams;
import androidx.core.view.C0661n;
import androidx.core.view.C0665o;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import p214e.p215a.C7521a;
import p214e.p215a.C7525e;
import p214e.p215a.C7526f;
import p214e.p215a.C7528h;
import p214e.p215a.C7530j;
import p214e.p215a.p216k.p217a.C7531a;

/* renamed from: androidx.appcompat.widget.a0 */
public class C0239a0 implements DecorToolbar {

    /* renamed from: a */
    Toolbar f1090a;

    /* renamed from: b */
    private int f1091b;

    /* renamed from: c */
    private View f1092c;

    /* renamed from: d */
    private Spinner f1093d;

    /* renamed from: e */
    private View f1094e;

    /* renamed from: f */
    private Drawable f1095f;

    /* renamed from: g */
    private Drawable f1096g;

    /* renamed from: h */
    private Drawable f1097h;

    /* renamed from: i */
    private boolean f1098i;

    /* renamed from: j */
    CharSequence f1099j;

    /* renamed from: k */
    private CharSequence f1100k;

    /* renamed from: l */
    private CharSequence f1101l;

    /* renamed from: m */
    Callback f1102m;

    /* renamed from: n */
    boolean f1103n;

    /* renamed from: o */
    private ActionMenuPresenter f1104o;

    /* renamed from: p */
    private int f1105p;

    /* renamed from: q */
    private int f1106q;

    /* renamed from: r */
    private Drawable f1107r;

    /* renamed from: androidx.appcompat.widget.a0$a */
    class C0240a implements OnClickListener {

        /* renamed from: e */
        final C0155a f1108e;

        C0240a() {
            C0155a aVar = new C0155a(C0239a0.this.f1090a.getContext(), 0, 16908332, 0, 0, C0239a0.this.f1099j);
            this.f1108e = aVar;
        }

        public void onClick(View view) {
            C0239a0 a0Var = C0239a0.this;
            Callback callback = a0Var.f1102m;
            if (callback != null && a0Var.f1103n) {
                callback.onMenuItemSelected(0, this.f1108e);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.a0$b */
    class C0241b extends C0665o {

        /* renamed from: a */
        private boolean f1110a = false;

        /* renamed from: b */
        final /* synthetic */ int f1111b;

        C0241b(int i) {
            this.f1111b = i;
        }

        public void onAnimationCancel(View view) {
            this.f1110a = true;
        }

        public void onAnimationEnd(View view) {
            if (!this.f1110a) {
                C0239a0.this.f1090a.setVisibility(this.f1111b);
            }
        }

        public void onAnimationStart(View view) {
            C0239a0.this.f1090a.setVisibility(0);
        }
    }

    public C0239a0(Toolbar toolbar, boolean z) {
        this(toolbar, z, C7528h.abc_action_bar_up_description, C7525e.abc_ic_ab_back_material);
    }

    /* renamed from: a */
    private int m927a() {
        if (this.f1090a.getNavigationIcon() == null) {
            return 11;
        }
        this.f1107r = this.f1090a.getNavigationIcon();
        return 15;
    }

    /* renamed from: b */
    private void m929b() {
        if (this.f1093d == null) {
            this.f1093d = new AppCompatSpinner(getContext(), null, C7521a.actionDropDownStyle);
            this.f1093d.setLayoutParams(new LayoutParams(-2, -2, 8388627));
        }
    }

    /* renamed from: c */
    private void m930c() {
        if ((this.f1091b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1101l)) {
            this.f1090a.setNavigationContentDescription(this.f1106q);
        } else {
            this.f1090a.setNavigationContentDescription(this.f1101l);
        }
    }

    /* renamed from: d */
    private void m931d() {
        if ((this.f1091b & 4) != 0) {
            Toolbar toolbar = this.f1090a;
            Drawable drawable = this.f1097h;
            if (drawable == null) {
                drawable = this.f1107r;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f1090a.setNavigationIcon((Drawable) null);
    }

    /* renamed from: e */
    private void m932e() {
        Drawable drawable;
        int i = this.f1091b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f1096g;
            if (drawable == null) {
                drawable = this.f1095f;
            }
        } else {
            drawable = this.f1095f;
        }
        this.f1090a.setLogo(drawable);
    }

    public void animateToVisibility(int i) {
        C0661n nVar = setupAnimatorToVisibility(i, 200);
        if (nVar != null) {
            nVar.mo3437c();
        }
    }

    public boolean canShowOverflowMenu() {
        return this.f1090a.mo1748b();
    }

    public void collapseActionView() {
        this.f1090a.mo1749c();
    }

    public void dismissPopupMenus() {
        this.f1090a.mo1751d();
    }

    public Context getContext() {
        return this.f1090a.getContext();
    }

    public View getCustomView() {
        return this.f1094e;
    }

    public int getDisplayOptions() {
        return this.f1091b;
    }

    public int getDropdownItemCount() {
        Spinner spinner = this.f1093d;
        if (spinner != null) {
            return spinner.getCount();
        }
        return 0;
    }

    public int getDropdownSelectedPosition() {
        Spinner spinner = this.f1093d;
        if (spinner != null) {
            return spinner.getSelectedItemPosition();
        }
        return 0;
    }

    public int getHeight() {
        return this.f1090a.getHeight();
    }

    public Menu getMenu() {
        return this.f1090a.getMenu();
    }

    public int getNavigationMode() {
        return this.f1105p;
    }

    public CharSequence getSubtitle() {
        return this.f1090a.getSubtitle();
    }

    public CharSequence getTitle() {
        return this.f1090a.getTitle();
    }

    public ViewGroup getViewGroup() {
        return this.f1090a;
    }

    public int getVisibility() {
        return this.f1090a.getVisibility();
    }

    public boolean hasEmbeddedTabs() {
        return this.f1092c != null;
    }

    public boolean hasExpandedActionView() {
        return this.f1090a.mo1753f();
    }

    public boolean hasIcon() {
        return this.f1095f != null;
    }

    public boolean hasLogo() {
        return this.f1096g != null;
    }

    public boolean hideOverflowMenu() {
        return this.f1090a.mo1754g();
    }

    public void initIndeterminateProgress() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public void initProgress() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public boolean isOverflowMenuShowPending() {
        return this.f1090a.mo1788h();
    }

    public boolean isOverflowMenuShowing() {
        return this.f1090a.mo1789i();
    }

    public boolean isTitleTruncated() {
        return this.f1090a.mo1790j();
    }

    public void restoreHierarchyState(SparseArray<Parcelable> sparseArray) {
        this.f1090a.restoreHierarchyState(sparseArray);
    }

    public void saveHierarchyState(SparseArray<Parcelable> sparseArray) {
        this.f1090a.saveHierarchyState(sparseArray);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        ViewCompat.m2822a((View) this.f1090a, drawable);
    }

    public void setCollapsible(boolean z) {
        this.f1090a.setCollapsible(z);
    }

    public void setCustomView(View view) {
        View view2 = this.f1094e;
        if (!(view2 == null || (this.f1091b & 16) == 0)) {
            this.f1090a.removeView(view2);
        }
        this.f1094e = view;
        if (view != null && (this.f1091b & 16) != 0) {
            this.f1090a.addView(this.f1094e);
        }
    }

    public void setDefaultNavigationContentDescription(int i) {
        if (i != this.f1106q) {
            this.f1106q = i;
            if (TextUtils.isEmpty(this.f1090a.getNavigationContentDescription())) {
                setNavigationContentDescription(this.f1106q);
            }
        }
    }

    public void setDefaultNavigationIcon(Drawable drawable) {
        if (this.f1107r != drawable) {
            this.f1107r = drawable;
            m931d();
        }
    }

    public void setDisplayOptions(int i) {
        int i2 = this.f1091b ^ i;
        this.f1091b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m930c();
                }
                m931d();
            }
            if ((i2 & 3) != 0) {
                m932e();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1090a.setTitle(this.f1099j);
                    this.f1090a.setSubtitle(this.f1100k);
                } else {
                    this.f1090a.setTitle((CharSequence) null);
                    this.f1090a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0) {
                View view = this.f1094e;
                if (view == null) {
                    return;
                }
                if ((i & 16) != 0) {
                    this.f1090a.addView(view);
                } else {
                    this.f1090a.removeView(view);
                }
            }
        }
    }

    public void setDropdownParams(SpinnerAdapter spinnerAdapter, OnItemSelectedListener onItemSelectedListener) {
        m929b();
        this.f1093d.setAdapter(spinnerAdapter);
        this.f1093d.setOnItemSelectedListener(onItemSelectedListener);
    }

    public void setDropdownSelectedPosition(int i) {
        Spinner spinner = this.f1093d;
        if (spinner != null) {
            spinner.setSelection(i);
            return;
        }
        throw new IllegalStateException("Can't set dropdown selected position without an adapter");
    }

    public void setEmbeddedTabView(C0280t tVar) {
        View view = this.f1092c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f1090a;
            if (parent == toolbar) {
                toolbar.removeView(this.f1092c);
            }
        }
        this.f1092c = tVar;
        if (tVar != null && this.f1105p == 2) {
            this.f1090a.addView(this.f1092c, 0);
            LayoutParams layoutParams = (LayoutParams) this.f1092c.getLayoutParams();
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.f147a = 8388691;
            tVar.setAllowCollapse(true);
        }
    }

    public void setHomeButtonEnabled(boolean z) {
    }

    public void setIcon(int i) {
        setIcon(i != 0 ? C7531a.m18133c(getContext(), i) : null);
    }

    public void setLogo(int i) {
        setLogo(i != 0 ? C7531a.m18133c(getContext(), i) : null);
    }

    public void setMenu(Menu menu, MenuPresenter.Callback callback) {
        if (this.f1104o == null) {
            this.f1104o = new ActionMenuPresenter(this.f1090a.getContext());
            this.f1104o.mo860a(C7526f.action_menu_presenter);
        }
        this.f1104o.setCallback(callback);
        this.f1090a.mo1745a((MenuBuilder) menu, this.f1104o);
    }

    public void setMenuCallbacks(MenuPresenter.Callback callback, MenuBuilder.Callback callback2) {
        this.f1090a.mo1746a(callback, callback2);
    }

    public void setMenuPrepared() {
        this.f1103n = true;
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        this.f1101l = charSequence;
        m930c();
    }

    public void setNavigationIcon(Drawable drawable) {
        this.f1097h = drawable;
        m931d();
    }

    public void setNavigationMode(int i) {
        int i2 = this.f1105p;
        if (i != i2) {
            if (i2 == 1) {
                Spinner spinner = this.f1093d;
                if (spinner != null) {
                    ViewParent parent = spinner.getParent();
                    Toolbar toolbar = this.f1090a;
                    if (parent == toolbar) {
                        toolbar.removeView(this.f1093d);
                    }
                }
            } else if (i2 == 2) {
                View view = this.f1092c;
                if (view != null) {
                    ViewParent parent2 = view.getParent();
                    Toolbar toolbar2 = this.f1090a;
                    if (parent2 == toolbar2) {
                        toolbar2.removeView(this.f1092c);
                    }
                }
            }
            this.f1105p = i;
            if (i == 0) {
                return;
            }
            if (i == 1) {
                m929b();
                this.f1090a.addView(this.f1093d, 0);
            } else if (i == 2) {
                View view2 = this.f1092c;
                if (view2 != null) {
                    this.f1090a.addView(view2, 0);
                    LayoutParams layoutParams = (LayoutParams) this.f1092c.getLayoutParams();
                    layoutParams.width = -2;
                    layoutParams.height = -2;
                    layoutParams.f147a = 8388691;
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid navigation mode ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1100k = charSequence;
        if ((this.f1091b & 8) != 0) {
            this.f1090a.setSubtitle(charSequence);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.f1098i = true;
        m928a(charSequence);
    }

    public void setVisibility(int i) {
        this.f1090a.setVisibility(i);
    }

    public void setWindowCallback(Callback callback) {
        this.f1102m = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f1098i) {
            m928a(charSequence);
        }
    }

    public C0661n setupAnimatorToVisibility(int i, long j) {
        C0661n a = ViewCompat.m2813a(this.f1090a);
        a.mo3427a(i == 0 ? 1.0f : 0.0f);
        a.mo3428a(j);
        a.mo3430a((ViewPropertyAnimatorListener) new C0241b(i));
        return a;
    }

    public boolean showOverflowMenu() {
        return this.f1090a.mo1792l();
    }

    public C0239a0(Toolbar toolbar, boolean z, int i, int i2) {
        this.f1105p = 0;
        this.f1106q = 0;
        this.f1090a = toolbar;
        this.f1099j = toolbar.getTitle();
        this.f1100k = toolbar.getSubtitle();
        this.f1098i = this.f1099j != null;
        this.f1097h = toolbar.getNavigationIcon();
        C0291z a = C0291z.m1196a(toolbar.getContext(), null, C7530j.ActionBar, C7521a.actionBarStyle, 0);
        this.f1107r = a.mo2106b(C7530j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence e = a.mo2112e(C7530j.ActionBar_title);
            if (!TextUtils.isEmpty(e)) {
                setTitle(e);
            }
            CharSequence e2 = a.mo2112e(C7530j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(e2)) {
                setSubtitle(e2);
            }
            Drawable b = a.mo2106b(C7530j.ActionBar_logo);
            if (b != null) {
                setLogo(b);
            }
            Drawable b2 = a.mo2106b(C7530j.ActionBar_icon);
            if (b2 != null) {
                setIcon(b2);
            }
            if (this.f1097h == null) {
                Drawable drawable = this.f1107r;
                if (drawable != null) {
                    setNavigationIcon(drawable);
                }
            }
            setDisplayOptions(a.mo2109d(C7530j.ActionBar_displayOptions, 0));
            int g = a.mo2115g(C7530j.ActionBar_customNavigationLayout, 0);
            if (g != 0) {
                setCustomView(LayoutInflater.from(this.f1090a.getContext()).inflate(g, this.f1090a, false));
                setDisplayOptions(this.f1091b | 16);
            }
            int f = a.mo2113f(C7530j.ActionBar_height, 0);
            if (f > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1090a.getLayoutParams();
                layoutParams.height = f;
                this.f1090a.setLayoutParams(layoutParams);
            }
            int b3 = a.mo2105b(C7530j.ActionBar_contentInsetStart, -1);
            int b4 = a.mo2105b(C7530j.ActionBar_contentInsetEnd, -1);
            if (b3 >= 0 || b4 >= 0) {
                this.f1090a.mo1743a(Math.max(b3, 0), Math.max(b4, 0));
            }
            int g2 = a.mo2115g(C7530j.ActionBar_titleTextStyle, 0);
            if (g2 != 0) {
                Toolbar toolbar2 = this.f1090a;
                toolbar2.mo1747b(toolbar2.getContext(), g2);
            }
            int g3 = a.mo2115g(C7530j.ActionBar_subtitleTextStyle, 0);
            if (g3 != 0) {
                Toolbar toolbar3 = this.f1090a;
                toolbar3.mo1744a(toolbar3.getContext(), g3);
            }
            int g4 = a.mo2115g(C7530j.ActionBar_popupTheme, 0);
            if (g4 != 0) {
                this.f1090a.setPopupTheme(g4);
            }
        } else {
            this.f1091b = m927a();
        }
        a.mo2102a();
        setDefaultNavigationContentDescription(i);
        this.f1101l = this.f1090a.getNavigationContentDescription();
        this.f1090a.setNavigationOnClickListener(new C0240a());
    }

    public void setIcon(Drawable drawable) {
        this.f1095f = drawable;
        m932e();
    }

    public void setLogo(Drawable drawable) {
        this.f1096g = drawable;
        m932e();
    }

    /* renamed from: a */
    private void m928a(CharSequence charSequence) {
        this.f1099j = charSequence;
        if ((this.f1091b & 8) != 0) {
            this.f1090a.setTitle(charSequence);
        }
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription((CharSequence) i == 0 ? null : getContext().getString(i));
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(i != 0 ? C7531a.m18133c(getContext(), i) : null);
    }
}
