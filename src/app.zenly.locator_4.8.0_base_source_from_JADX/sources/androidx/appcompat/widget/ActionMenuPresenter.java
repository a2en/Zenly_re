package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import androidx.appcompat.view.C0142a;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.ActionMenuItemView.C0154b;
import androidx.appcompat.view.menu.C0156b;
import androidx.appcompat.view.menu.C0169i;
import androidx.appcompat.view.menu.C0178l;
import androidx.appcompat.view.menu.C0184o;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.MenuView.ItemView;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.appcompat.widget.ActionMenuView.ActionMenuChildView;
import androidx.core.graphics.drawable.C0559a;
import androidx.core.view.ActionProvider;
import androidx.core.view.ActionProvider.SubUiVisibilityListener;
import java.util.ArrayList;
import p214e.p215a.C7521a;
import p214e.p215a.C7527g;

class ActionMenuPresenter extends C0156b implements SubUiVisibilityListener {

    /* renamed from: A */
    private final SparseBooleanArray f797A = new SparseBooleanArray();

    /* renamed from: B */
    C0196e f798B;

    /* renamed from: C */
    C0191a f799C;

    /* renamed from: D */
    C0193c f800D;

    /* renamed from: E */
    private C0192b f801E;

    /* renamed from: F */
    final C0197f f802F = new C0197f();

    /* renamed from: G */
    int f803G;

    /* renamed from: n */
    C0194d f804n;

    /* renamed from: o */
    private Drawable f805o;

    /* renamed from: p */
    private boolean f806p;

    /* renamed from: q */
    private boolean f807q;

    /* renamed from: r */
    private boolean f808r;

    /* renamed from: s */
    private int f809s;

    /* renamed from: t */
    private int f810t;

    /* renamed from: u */
    private int f811u;

    /* renamed from: v */
    private boolean f812v;

    /* renamed from: w */
    private boolean f813w;

    /* renamed from: x */
    private boolean f814x;

    /* renamed from: y */
    private boolean f815y;

    /* renamed from: z */
    private int f816z;

    @SuppressLint({"BanParcelableUsage"})
    private static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new C0190a();

        /* renamed from: e */
        public int f817e;

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$SavedState$a */
        static class C0190a implements Creator<SavedState> {
            C0190a() {
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f817e);
        }

        SavedState(Parcel parcel) {
            this.f817e = parcel.readInt();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$a */
    private class C0191a extends C0178l {
        public C0191a(Context context, C0184o oVar, View view) {
            super(context, oVar, view, false, C7521a.actionOverflowMenuStyle);
            if (!((C0169i) oVar.getItem()).mo925g()) {
                View view2 = ActionMenuPresenter.this.f804n;
                if (view2 == null) {
                    view2 = (View) ActionMenuPresenter.this.f597l;
                }
                mo1039a(view2);
            }
            mo1041a((Callback) ActionMenuPresenter.this.f802F);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo1046d() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.f799C = null;
            actionMenuPresenter.f803G = 0;
            super.mo1046d();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$b */
    private class C0192b extends C0154b {
        C0192b() {
        }

        /* renamed from: a */
        public ShowableListMenu mo697a() {
            C0191a aVar = ActionMenuPresenter.this.f799C;
            if (aVar != null) {
                return aVar.mo1044b();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$c */
    private class C0193c implements Runnable {

        /* renamed from: e */
        private C0196e f820e;

        public C0193c(C0196e eVar) {
            this.f820e = eVar;
        }

        public void run() {
            if (ActionMenuPresenter.this.f592g != null) {
                ActionMenuPresenter.this.f592g.mo715a();
            }
            View view = (View) ActionMenuPresenter.this.f597l;
            if (!(view == null || view.getWindowToken() == null || !this.f820e.mo1048f())) {
                ActionMenuPresenter.this.f798B = this.f820e;
            }
            ActionMenuPresenter.this.f800D = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d */
    private class C0194d extends AppCompatImageView implements ActionMenuChildView {

        /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$d$a */
        class C0195a extends C0266o {
            C0195a(View view, ActionMenuPresenter actionMenuPresenter) {
                super(view);
            }

            /* renamed from: a */
            public ShowableListMenu mo695a() {
                C0196e eVar = ActionMenuPresenter.this.f798B;
                if (eVar == null) {
                    return null;
                }
                return eVar.mo1044b();
            }

            /* renamed from: b */
            public boolean mo696b() {
                ActionMenuPresenter.this.mo1210h();
                return true;
            }

            /* renamed from: c */
            public boolean mo1219c() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.f800D != null) {
                    return false;
                }
                actionMenuPresenter.mo1206d();
                return true;
            }
        }

        public C0194d(Context context) {
            super(context, null, C7521a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            C0243b0.m933a(this, getContentDescription());
            setOnTouchListener(new C0195a(this, ActionMenuPresenter.this));
        }

        public boolean needsDividerAfter() {
            return false;
        }

        public boolean needsDividerBefore() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.mo1210h();
            return true;
        }

        /* access modifiers changed from: protected */
        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                C0559a.m2641a(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$e */
    private class C0196e extends C0178l {
        public C0196e(Context context, MenuBuilder menuBuilder, View view, boolean z) {
            super(context, menuBuilder, view, z, C7521a.actionOverflowMenuStyle);
            mo1038a(8388613);
            mo1041a((Callback) ActionMenuPresenter.this.f802F);
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo1046d() {
            if (ActionMenuPresenter.this.f592g != null) {
                ActionMenuPresenter.this.f592g.close();
            }
            ActionMenuPresenter.this.f798B = null;
            super.mo1046d();
        }
    }

    /* renamed from: androidx.appcompat.widget.ActionMenuPresenter$f */
    private class C0197f implements Callback {
        C0197f() {
        }

        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            if (menuBuilder instanceof C0184o) {
                menuBuilder.mo765m().mo722a(false);
            }
            Callback a = ActionMenuPresenter.this.mo858a();
            if (a != null) {
                a.onCloseMenu(menuBuilder, z);
            }
        }

        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            boolean z = false;
            if (menuBuilder == null) {
                return false;
            }
            ActionMenuPresenter.this.f803G = ((C0184o) menuBuilder).getItem().getItemId();
            Callback a = ActionMenuPresenter.this.mo858a();
            if (a != null) {
                z = a.onOpenSubMenu(menuBuilder);
            }
            return z;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, C7527g.abc_action_menu_layout, C7527g.abc_action_menu_item_layout);
    }

    public boolean flagActionItems() {
        int i;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        ActionMenuPresenter actionMenuPresenter = this;
        MenuBuilder menuBuilder = actionMenuPresenter.f592g;
        View view = null;
        int i5 = 0;
        if (menuBuilder != null) {
            arrayList = menuBuilder.mo766n();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i6 = actionMenuPresenter.f811u;
        int i7 = actionMenuPresenter.f810t;
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) actionMenuPresenter.f597l;
        int i8 = i6;
        boolean z = false;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            C0169i iVar = (C0169i) arrayList.get(i11);
            if (iVar.requiresActionButton()) {
                i9++;
            } else if (iVar.mo940i()) {
                i10++;
            } else {
                z = true;
            }
            if (actionMenuPresenter.f815y && iVar.isActionViewExpanded()) {
                i8 = 0;
            }
        }
        if (actionMenuPresenter.f807q && (z || i10 + i9 > i8)) {
            i8--;
        }
        int i12 = i8 - i9;
        SparseBooleanArray sparseBooleanArray = actionMenuPresenter.f797A;
        sparseBooleanArray.clear();
        if (actionMenuPresenter.f813w) {
            int i13 = actionMenuPresenter.f816z;
            i2 = i7 / i13;
            i3 = i13 + ((i7 % i13) / i2);
        } else {
            i3 = 0;
            i2 = 0;
        }
        int i14 = i7;
        int i15 = 0;
        int i16 = 0;
        while (i15 < i) {
            C0169i iVar2 = (C0169i) arrayList.get(i15);
            if (iVar2.requiresActionButton()) {
                View a = actionMenuPresenter.mo857a(iVar2, view, viewGroup);
                if (actionMenuPresenter.f813w) {
                    i2 -= ActionMenuView.m777a(a, i3, i2, makeMeasureSpec, i5);
                } else {
                    a.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = a.getMeasuredWidth();
                i14 -= measuredWidth;
                if (i16 != 0) {
                    measuredWidth = i16;
                }
                int groupId = iVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                iVar2.mo921d(true);
                i16 = measuredWidth;
                i4 = i;
            } else if (iVar2.mo940i()) {
                int groupId2 = iVar2.getGroupId();
                boolean z2 = sparseBooleanArray.get(groupId2);
                boolean z3 = (i12 > 0 || z2) && i14 > 0 && (!actionMenuPresenter.f813w || i2 > 0);
                boolean z4 = z3;
                i4 = i;
                if (z3) {
                    View a2 = actionMenuPresenter.mo857a(iVar2, null, viewGroup);
                    if (actionMenuPresenter.f813w) {
                        int a3 = ActionMenuView.m777a(a2, i3, i2, makeMeasureSpec, 0);
                        i2 -= a3;
                        z4 = a3 == 0 ? false : z4;
                    } else {
                        a2.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    int measuredWidth2 = a2.getMeasuredWidth();
                    i14 -= measuredWidth2;
                    if (i16 == 0) {
                        i16 = measuredWidth2;
                    }
                    z3 = z4 & (!actionMenuPresenter.f813w ? i14 + i16 > 0 : i14 >= 0);
                }
                if (z3 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z2) {
                    sparseBooleanArray.put(groupId2, false);
                    int i17 = 0;
                    while (i17 < i15) {
                        C0169i iVar3 = (C0169i) arrayList.get(i17);
                        if (iVar3.getGroupId() == groupId2) {
                            if (iVar3.mo925g()) {
                                i12++;
                            }
                            iVar3.mo921d(false);
                        }
                        i17++;
                    }
                }
                if (z3) {
                    i12--;
                }
                iVar2.mo921d(z3);
            } else {
                i4 = i;
                iVar2.mo921d(false);
                i15++;
                i = i4;
                view = null;
                i5 = 0;
                actionMenuPresenter = this;
            }
            i15++;
            i = i4;
            view = null;
            i5 = 0;
            actionMenuPresenter = this;
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo1209g() {
        C0196e eVar = this.f798B;
        return eVar != null && eVar.mo1045c();
    }

    public MenuView getMenuView(ViewGroup viewGroup) {
        MenuView menuView = this.f597l;
        MenuView menuView2 = super.getMenuView(viewGroup);
        if (menuView != menuView2) {
            ((ActionMenuView) menuView2).setPresenter(this);
        }
        return menuView2;
    }

    /* renamed from: h */
    public boolean mo1210h() {
        if (this.f807q && !mo1209g()) {
            MenuBuilder menuBuilder = this.f592g;
            if (menuBuilder != null && this.f597l != null && this.f800D == null && !menuBuilder.mo762j().isEmpty()) {
                C0196e eVar = new C0196e(this.f591f, this.f592g, this.f804n, true);
                this.f800D = new C0193c(eVar);
                ((View) this.f597l).post(this.f800D);
                super.onSubMenuSelected(null);
                return true;
            }
        }
        return false;
    }

    public void initForMenu(Context context, MenuBuilder menuBuilder) {
        super.initForMenu(context, menuBuilder);
        Resources resources = context.getResources();
        C0142a a = C0142a.m493a(context);
        if (!this.f808r) {
            this.f807q = a.mo614g();
        }
        if (!this.f814x) {
            this.f809s = a.mo609b();
        }
        if (!this.f812v) {
            this.f811u = a.mo610c();
        }
        int i = this.f809s;
        if (this.f807q) {
            if (this.f804n == null) {
                this.f804n = new C0194d(this.f590e);
                if (this.f806p) {
                    this.f804n.setImageDrawable(this.f805o);
                    this.f805o = null;
                    this.f806p = false;
                }
                int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
                this.f804n.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.f804n.getMeasuredWidth();
        } else {
            this.f804n = null;
        }
        this.f810t = i;
        this.f816z = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        mo1204b();
        super.onCloseMenu(menuBuilder, z);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).f817e;
            if (i > 0) {
                MenuItem findItem = this.f592g.findItem(i);
                if (findItem != null) {
                    onSubMenuSelected((C0184o) findItem.getSubMenu());
                }
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.f817e = this.f803G;
        return savedState;
    }

    public boolean onSubMenuSelected(C0184o oVar) {
        boolean z = false;
        if (!oVar.hasVisibleItems()) {
            return false;
        }
        C0184o oVar2 = oVar;
        while (oVar2.mo1087t() != this.f592g) {
            oVar2 = (C0184o) oVar2.mo1087t();
        }
        View a = m748a(oVar2.getItem());
        if (a == null) {
            return false;
        }
        this.f803G = oVar.getItem().getItemId();
        int size = oVar.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = oVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        this.f799C = new C0191a(this.f591f, oVar, a);
        this.f799C.mo1042a(z);
        this.f799C.mo1047e();
        super.onSubMenuSelected(oVar);
        return true;
    }

    public void onSubUiVisibilityChanged(boolean z) {
        if (z) {
            super.onSubMenuSelected(null);
            return;
        }
        MenuBuilder menuBuilder = this.f592g;
        if (menuBuilder != null) {
            menuBuilder.mo722a(false);
        }
    }

    public void updateMenuView(boolean z) {
        super.updateMenuView(z);
        ((View) this.f597l).requestLayout();
        MenuBuilder menuBuilder = this.f592g;
        boolean z2 = false;
        if (menuBuilder != null) {
            ArrayList c = menuBuilder.mo743c();
            int size = c.size();
            for (int i = 0; i < size; i++) {
                ActionProvider supportActionProvider = ((C0169i) c.get(i)).getSupportActionProvider();
                if (supportActionProvider != null) {
                    supportActionProvider.mo3253a((SubUiVisibilityListener) this);
                }
            }
        }
        MenuBuilder menuBuilder2 = this.f592g;
        ArrayList j = menuBuilder2 != null ? menuBuilder2.mo762j() : null;
        if (this.f807q && j != null) {
            int size2 = j.size();
            if (size2 == 1) {
                z2 = !((C0169i) j.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f804n == null) {
                this.f804n = new C0194d(this.f590e);
            }
            ViewGroup viewGroup = (ViewGroup) this.f804n.getParent();
            if (viewGroup != this.f597l) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f804n);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f597l;
                actionMenuView.addView(this.f804n, actionMenuView.mo1223b());
            }
        } else {
            C0194d dVar = this.f804n;
            if (dVar != null) {
                ViewParent parent = dVar.getParent();
                MenuView menuView = this.f597l;
                if (parent == menuView) {
                    ((ViewGroup) menuView).removeView(this.f804n);
                }
            }
        }
        ((ActionMenuView) this.f597l).setOverflowReserved(this.f807q);
    }

    /* renamed from: a */
    public void mo1199a(Configuration configuration) {
        if (!this.f812v) {
            this.f811u = C0142a.m493a(this.f591f).mo610c();
        }
        MenuBuilder menuBuilder = this.f592g;
        if (menuBuilder != null) {
            menuBuilder.mo740b(true);
        }
    }

    /* renamed from: b */
    public void mo1203b(boolean z) {
        this.f807q = z;
        this.f808r = true;
    }

    /* renamed from: c */
    public Drawable mo1205c() {
        C0194d dVar = this.f804n;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f806p) {
            return this.f805o;
        }
        return null;
    }

    /* renamed from: d */
    public boolean mo1206d() {
        C0193c cVar = this.f800D;
        if (cVar != null) {
            MenuView menuView = this.f597l;
            if (menuView != null) {
                ((View) menuView).removeCallbacks(cVar);
                this.f800D = null;
                return true;
            }
        }
        C0196e eVar = this.f798B;
        if (eVar == null) {
            return false;
        }
        eVar.mo1037a();
        return true;
    }

    /* renamed from: e */
    public boolean mo1207e() {
        C0191a aVar = this.f799C;
        if (aVar == null) {
            return false;
        }
        aVar.mo1037a();
        return true;
    }

    /* renamed from: f */
    public boolean mo1208f() {
        return this.f800D != null || mo1209g();
    }

    /* renamed from: b */
    public boolean mo1204b() {
        return mo1206d() | mo1207e();
    }

    /* renamed from: a */
    public void mo1202a(boolean z) {
        this.f815y = z;
    }

    /* renamed from: a */
    public void mo1200a(Drawable drawable) {
        C0194d dVar = this.f804n;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f806p = true;
        this.f805o = drawable;
    }

    /* renamed from: a */
    public View mo857a(C0169i iVar, View view, ViewGroup viewGroup) {
        View actionView = iVar.getActionView();
        if (actionView == null || iVar.mo922e()) {
            actionView = super.mo857a(iVar, view, viewGroup);
        }
        actionView.setVisibility(iVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    /* renamed from: a */
    public void mo862a(C0169i iVar, ItemView itemView) {
        itemView.initialize(iVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) itemView;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f597l);
        if (this.f801E == null) {
            this.f801E = new C0192b();
        }
        actionMenuItemView.setPopupCallback(this.f801E);
    }

    /* renamed from: a */
    public boolean mo863a(int i, C0169i iVar) {
        return iVar.mo925g();
    }

    /* renamed from: a */
    public boolean mo864a(ViewGroup viewGroup, int i) {
        if (viewGroup.getChildAt(i) == this.f804n) {
            return false;
        }
        return super.mo864a(viewGroup, i);
    }

    /* renamed from: a */
    private View m748a(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f597l;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if ((childAt instanceof ItemView) && ((ItemView) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo1201a(ActionMenuView actionMenuView) {
        this.f597l = actionMenuView;
        actionMenuView.initialize(this.f592g);
    }
}
