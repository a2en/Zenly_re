package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.ClassLoaderCreator;
import android.os.Parcelable.Creator;
import android.text.Layout;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.C0147e;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.appcompat.view.menu.C0169i;
import androidx.appcompat.view.menu.C0184o;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.appcompat.view.menu.MenuView;
import androidx.core.view.C0641c;
import androidx.core.view.C0643e;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import java.util.ArrayList;
import java.util.List;
import p214e.p215a.C7521a;
import p214e.p215a.C7530j;
import p214e.p215a.p216k.p217a.C7531a;

public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private int f1024A;

    /* renamed from: B */
    private CharSequence f1025B;

    /* renamed from: C */
    private CharSequence f1026C;

    /* renamed from: D */
    private ColorStateList f1027D;

    /* renamed from: E */
    private ColorStateList f1028E;

    /* renamed from: F */
    private boolean f1029F;

    /* renamed from: G */
    private boolean f1030G;

    /* renamed from: H */
    private final ArrayList<View> f1031H;

    /* renamed from: I */
    private final ArrayList<View> f1032I;

    /* renamed from: J */
    private final int[] f1033J;

    /* renamed from: K */
    OnMenuItemClickListener f1034K;

    /* renamed from: L */
    private final androidx.appcompat.widget.ActionMenuView.OnMenuItemClickListener f1035L;

    /* renamed from: M */
    private C0239a0 f1036M;

    /* renamed from: N */
    private ActionMenuPresenter f1037N;

    /* renamed from: O */
    private C0236d f1038O;

    /* renamed from: P */
    private Callback f1039P;

    /* renamed from: Q */
    private MenuBuilder.Callback f1040Q;

    /* renamed from: R */
    private boolean f1041R;

    /* renamed from: S */
    private final Runnable f1042S;

    /* renamed from: e */
    private ActionMenuView f1043e;

    /* renamed from: f */
    private TextView f1044f;

    /* renamed from: g */
    private TextView f1045g;

    /* renamed from: h */
    private ImageButton f1046h;

    /* renamed from: i */
    private ImageView f1047i;

    /* renamed from: j */
    private Drawable f1048j;

    /* renamed from: k */
    private CharSequence f1049k;

    /* renamed from: l */
    ImageButton f1050l;

    /* renamed from: m */
    View f1051m;

    /* renamed from: n */
    private Context f1052n;

    /* renamed from: o */
    private int f1053o;

    /* renamed from: p */
    private int f1054p;

    /* renamed from: q */
    private int f1055q;

    /* renamed from: r */
    int f1056r;

    /* renamed from: s */
    private int f1057s;

    /* renamed from: t */
    private int f1058t;

    /* renamed from: u */
    private int f1059u;

    /* renamed from: v */
    private int f1060v;

    /* renamed from: w */
    private int f1061w;

    /* renamed from: x */
    private C0279s f1062x;

    /* renamed from: y */
    private int f1063y;

    /* renamed from: z */
    private int f1064z;

    public static class LayoutParams extends androidx.appcompat.app.ActionBar.LayoutParams {

        /* renamed from: b */
        int f1065b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1065b = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo1832a(MarginLayoutParams marginLayoutParams) {
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f1065b = 0;
            this.f147a = 8388627;
        }

        public LayoutParams(int i, int i2, int i3) {
            super(i, i2);
            this.f1065b = 0;
            this.f147a = i3;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((androidx.appcompat.app.ActionBar.LayoutParams) layoutParams);
            this.f1065b = 0;
            this.f1065b = layoutParams.f1065b;
        }

        public LayoutParams(androidx.appcompat.app.ActionBar.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1065b = 0;
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super((android.view.ViewGroup.LayoutParams) marginLayoutParams);
            this.f1065b = 0;
            mo1832a(marginLayoutParams);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1065b = 0;
        }
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new C0232a();

        /* renamed from: g */
        int f1066g;

        /* renamed from: h */
        boolean f1067h;

        /* renamed from: androidx.appcompat.widget.Toolbar$SavedState$a */
        static class C0232a implements ClassLoaderCreator<SavedState> {
            C0232a() {
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1066g = parcel.readInt();
            this.f1067h = parcel.readInt() != 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1066g);
            parcel.writeInt(this.f1067h ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$a */
    class C0233a implements androidx.appcompat.widget.ActionMenuView.OnMenuItemClickListener {
        C0233a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            OnMenuItemClickListener onMenuItemClickListener = Toolbar.this.f1034K;
            if (onMenuItemClickListener != null) {
                return onMenuItemClickListener.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$b */
    class C0234b implements Runnable {
        C0234b() {
        }

        public void run() {
            Toolbar.this.mo1792l();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$c */
    class C0235c implements OnClickListener {
        C0235c() {
        }

        public void onClick(View view) {
            Toolbar.this.mo1749c();
        }
    }

    /* renamed from: androidx.appcompat.widget.Toolbar$d */
    private class C0236d implements MenuPresenter {

        /* renamed from: e */
        MenuBuilder f1071e;

        /* renamed from: f */
        C0169i f1072f;

        C0236d() {
        }

        public boolean collapseItemActionView(MenuBuilder menuBuilder, C0169i iVar) {
            View view = Toolbar.this.f1051m;
            if (view instanceof CollapsibleActionView) {
                ((CollapsibleActionView) view).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f1051m);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f1050l);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f1051m = null;
            toolbar3.mo1741a();
            this.f1072f = null;
            Toolbar.this.requestLayout();
            iVar.mo915a(false);
            return true;
        }

        public boolean expandItemActionView(MenuBuilder menuBuilder, C0169i iVar) {
            Toolbar.this.mo1752e();
            ViewParent parent = Toolbar.this.f1050l.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f1050l);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f1050l);
            }
            Toolbar.this.f1051m = iVar.getActionView();
            this.f1072f = iVar;
            ViewParent parent2 = Toolbar.this.f1051m.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f1051m);
                }
                LayoutParams generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f147a = 8388611 | (toolbar4.f1056r & 112);
                generateDefaultLayoutParams.f1065b = 2;
                toolbar4.f1051m.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f1051m);
            }
            Toolbar.this.mo1791k();
            Toolbar.this.requestLayout();
            iVar.mo915a(true);
            View view = Toolbar.this.f1051m;
            if (view instanceof CollapsibleActionView) {
                ((CollapsibleActionView) view).onActionViewExpanded();
            }
            return true;
        }

        public boolean flagActionItems() {
            return false;
        }

        public int getId() {
            return 0;
        }

        public MenuView getMenuView(ViewGroup viewGroup) {
            return null;
        }

        public void initForMenu(Context context, MenuBuilder menuBuilder) {
            MenuBuilder menuBuilder2 = this.f1071e;
            if (menuBuilder2 != null) {
                C0169i iVar = this.f1072f;
                if (iVar != null) {
                    menuBuilder2.mo726a(iVar);
                }
            }
            this.f1071e = menuBuilder;
        }

        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        }

        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState() {
            return null;
        }

        public boolean onSubMenuSelected(C0184o oVar) {
            return false;
        }

        public void setCallback(Callback callback) {
        }

        public void updateMenuView(boolean z) {
            if (this.f1072f != null) {
                MenuBuilder menuBuilder = this.f1071e;
                boolean z2 = false;
                if (menuBuilder != null) {
                    int size = menuBuilder.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        } else if (this.f1071e.getItem(i) == this.f1072f) {
                            z2 = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                if (!z2) {
                    collapseItemActionView(this.f1071e, this.f1072f);
                }
            }
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    private MenuInflater getMenuInflater() {
        return new C0147e(getContext());
    }

    /* renamed from: m */
    private void m893m() {
        if (this.f1062x == null) {
            this.f1062x = new C0279s();
        }
    }

    /* renamed from: n */
    private void m894n() {
        if (this.f1047i == null) {
            this.f1047i = new AppCompatImageView(getContext());
        }
    }

    /* renamed from: o */
    private void m895o() {
        m896p();
        if (this.f1043e.mo1230g() == null) {
            MenuBuilder menuBuilder = (MenuBuilder) this.f1043e.getMenu();
            if (this.f1038O == null) {
                this.f1038O = new C0236d();
            }
            this.f1043e.setExpandedActionViewsExclusive(true);
            menuBuilder.mo720a((MenuPresenter) this.f1038O, this.f1052n);
        }
    }

    /* renamed from: p */
    private void m896p() {
        if (this.f1043e == null) {
            this.f1043e = new ActionMenuView(getContext());
            this.f1043e.setPopupTheme(this.f1053o);
            this.f1043e.setOnMenuItemClickListener(this.f1035L);
            this.f1043e.mo1221a(this.f1039P, this.f1040Q);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f147a = 8388613 | (this.f1056r & 112);
            this.f1043e.setLayoutParams(generateDefaultLayoutParams);
            m885a((View) this.f1043e, false);
        }
    }

    /* renamed from: q */
    private void m897q() {
        if (this.f1046h == null) {
            this.f1046h = new AppCompatImageButton(getContext(), null, C7521a.toolbarNavigationButtonStyle);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f147a = 8388611 | (this.f1056r & 112);
            this.f1046h.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    /* renamed from: r */
    private void m898r() {
        removeCallbacks(this.f1042S);
        post(this.f1042S);
    }

    /* renamed from: s */
    private boolean m899s() {
        if (!this.f1041R) {
            return false;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (m892d(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo1745a(MenuBuilder menuBuilder, ActionMenuPresenter actionMenuPresenter) {
        if (menuBuilder != null || this.f1043e != null) {
            m896p();
            MenuBuilder g = this.f1043e.mo1230g();
            if (g != menuBuilder) {
                if (g != null) {
                    g.mo739b((MenuPresenter) this.f1037N);
                    g.mo739b((MenuPresenter) this.f1038O);
                }
                if (this.f1038O == null) {
                    this.f1038O = new C0236d();
                }
                actionMenuPresenter.mo1202a(true);
                if (menuBuilder != null) {
                    menuBuilder.mo720a((MenuPresenter) actionMenuPresenter, this.f1052n);
                    menuBuilder.mo720a((MenuPresenter) this.f1038O, this.f1052n);
                } else {
                    actionMenuPresenter.initForMenu(this.f1052n, null);
                    this.f1038O.initForMenu(this.f1052n, null);
                    actionMenuPresenter.updateMenuView(true);
                    this.f1038O.updateMenuView(true);
                }
                this.f1043e.setPopupTheme(this.f1053o);
                this.f1043e.setPresenter(actionMenuPresenter);
                this.f1037N = actionMenuPresenter;
            }
        }
    }

    /* renamed from: b */
    public boolean mo1748b() {
        if (getVisibility() == 0) {
            ActionMenuView actionMenuView = this.f1043e;
            if (actionMenuView != null && actionMenuView.mo1229f()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public void mo1749c() {
        C0236d dVar = this.f1038O;
        C0169i iVar = dVar == null ? null : dVar.f1072f;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    /* renamed from: d */
    public void mo1751d() {
        ActionMenuView actionMenuView = this.f1043e;
        if (actionMenuView != null) {
            actionMenuView.mo1220a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo1752e() {
        if (this.f1050l == null) {
            this.f1050l = new AppCompatImageButton(getContext(), null, C7521a.toolbarNavigationButtonStyle);
            this.f1050l.setImageDrawable(this.f1048j);
            this.f1050l.setContentDescription(this.f1049k);
            LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f147a = 8388611 | (this.f1056r & 112);
            generateDefaultLayoutParams.f1065b = 2;
            this.f1050l.setLayoutParams(generateDefaultLayoutParams);
            this.f1050l.setOnClickListener(new C0235c());
        }
    }

    /* renamed from: f */
    public boolean mo1753f() {
        C0236d dVar = this.f1038O;
        return (dVar == null || dVar.f1072f == null) ? false : true;
    }

    /* renamed from: g */
    public boolean mo1754g() {
        ActionMenuView actionMenuView = this.f1043e;
        return actionMenuView != null && actionMenuView.mo1224c();
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f1050l;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f1050l;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C0279s sVar = this.f1062x;
        if (sVar != null) {
            return sVar.mo2048a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f1064z;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C0279s sVar = this.f1062x;
        if (sVar != null) {
            return sVar.mo2051b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        C0279s sVar = this.f1062x;
        if (sVar != null) {
            return sVar.mo2053c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        C0279s sVar = this.f1062x;
        if (sVar != null) {
            return sVar.mo2054d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f1063y;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.f1043e
            r1 = 0
            if (r0 == 0) goto L_0x0013
            androidx.appcompat.view.menu.MenuBuilder r0 = r0.mo1230g()
            if (r0 == 0) goto L_0x0013
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            if (r0 == 0) goto L_0x0025
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.f1064z
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0029
        L_0x0025:
            int r0 = r3.getContentInsetEnd()
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        if (ViewCompat.m2862o(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (ViewCompat.m2862o(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.f1063y, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1047i;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1047i;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m895o();
        return this.f1043e.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1046h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1046h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public ActionMenuPresenter getOuterActionMenuPresenter() {
        return this.f1037N;
    }

    public Drawable getOverflowIcon() {
        m895o();
        return this.f1043e.getOverflowIcon();
    }

    /* access modifiers changed from: 0000 */
    public Context getPopupContext() {
        return this.f1052n;
    }

    public int getPopupTheme() {
        return this.f1053o;
    }

    public CharSequence getSubtitle() {
        return this.f1026C;
    }

    /* access modifiers changed from: 0000 */
    public final TextView getSubtitleTextView() {
        return this.f1045g;
    }

    public CharSequence getTitle() {
        return this.f1025B;
    }

    public int getTitleMarginBottom() {
        return this.f1061w;
    }

    public int getTitleMarginEnd() {
        return this.f1059u;
    }

    public int getTitleMarginStart() {
        return this.f1058t;
    }

    public int getTitleMarginTop() {
        return this.f1060v;
    }

    /* access modifiers changed from: 0000 */
    public final TextView getTitleTextView() {
        return this.f1044f;
    }

    public DecorToolbar getWrapper() {
        if (this.f1036M == null) {
            this.f1036M = new C0239a0(this, true);
        }
        return this.f1036M;
    }

    /* renamed from: h */
    public boolean mo1788h() {
        ActionMenuView actionMenuView = this.f1043e;
        return actionMenuView != null && actionMenuView.mo1226d();
    }

    /* renamed from: i */
    public boolean mo1789i() {
        ActionMenuView actionMenuView = this.f1043e;
        return actionMenuView != null && actionMenuView.mo1228e();
    }

    /* renamed from: j */
    public boolean mo1790j() {
        TextView textView = this.f1044f;
        if (textView == null) {
            return false;
        }
        Layout layout = textView.getLayout();
        if (layout == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i = 0; i < lineCount; i++) {
            if (layout.getEllipsisCount(i) > 0) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo1791k() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (!(((LayoutParams) childAt.getLayoutParams()).f1065b == 2 || childAt == this.f1043e)) {
                removeViewAt(childCount);
                this.f1032I.add(childAt);
            }
        }
    }

    /* renamed from: l */
    public boolean mo1792l() {
        ActionMenuView actionMenuView = this.f1043e;
        return actionMenuView != null && actionMenuView.mo1237h();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1042S);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1030G = false;
        }
        if (!this.f1030G) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1030G = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1030G = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02a6 A[LOOP:0: B:101:0x02a4->B:102:0x02a6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c8 A[LOOP:1: B:104:0x02c6->B:105:0x02c8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02f3  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0302 A[LOOP:2: B:112:0x0300->B:113:0x0302, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0137  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x022c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = androidx.core.view.ViewCompat.m2862o(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.f1033J
            r11[r2] = r3
            r11[r3] = r3
            int r12 = androidx.core.view.ViewCompat.m2863p(r19)
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = 0
        L_0x003b:
            android.widget.ImageButton r13 = r0.f1046h
            boolean r13 = r0.m892d(r13)
            if (r13 == 0) goto L_0x0055
            if (r1 == 0) goto L_0x004e
            android.widget.ImageButton r13 = r0.f1046h
            int r13 = r0.m889b(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0057
        L_0x004e:
            android.widget.ImageButton r13 = r0.f1046h
            int r13 = r0.m882a(r13, r6, r11, r12)
            goto L_0x0056
        L_0x0055:
            r13 = r6
        L_0x0056:
            r14 = r10
        L_0x0057:
            android.widget.ImageButton r15 = r0.f1050l
            boolean r15 = r0.m892d(r15)
            if (r15 == 0) goto L_0x006e
            if (r1 == 0) goto L_0x0068
            android.widget.ImageButton r15 = r0.f1050l
            int r14 = r0.m889b(r15, r14, r11, r12)
            goto L_0x006e
        L_0x0068:
            android.widget.ImageButton r15 = r0.f1050l
            int r13 = r0.m882a(r15, r13, r11, r12)
        L_0x006e:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1043e
            boolean r15 = r0.m892d(r15)
            if (r15 == 0) goto L_0x0085
            if (r1 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1043e
            int r13 = r0.m882a(r15, r13, r11, r12)
            goto L_0x0085
        L_0x007f:
            androidx.appcompat.widget.ActionMenuView r15 = r0.f1043e
            int r14 = r0.m889b(r15, r14, r11, r12)
        L_0x0085:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f1051m
            boolean r13 = r0.m892d(r13)
            if (r13 == 0) goto L_0x00c2
            if (r1 == 0) goto L_0x00bc
            android.view.View r13 = r0.f1051m
            int r10 = r0.m889b(r13, r10, r11, r12)
            goto L_0x00c2
        L_0x00bc:
            android.view.View r13 = r0.f1051m
            int r2 = r0.m882a(r13, r2, r11, r12)
        L_0x00c2:
            android.widget.ImageView r13 = r0.f1047i
            boolean r13 = r0.m892d(r13)
            if (r13 == 0) goto L_0x00d9
            if (r1 == 0) goto L_0x00d3
            android.widget.ImageView r13 = r0.f1047i
            int r10 = r0.m889b(r13, r10, r11, r12)
            goto L_0x00d9
        L_0x00d3:
            android.widget.ImageView r13 = r0.f1047i
            int r2 = r0.m882a(r13, r2, r11, r12)
        L_0x00d9:
            android.widget.TextView r13 = r0.f1044f
            boolean r13 = r0.m892d(r13)
            android.widget.TextView r14 = r0.f1045g
            boolean r14 = r0.m892d(r14)
            if (r13 == 0) goto L_0x0100
            android.widget.TextView r15 = r0.f1044f
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r15 = (androidx.appcompat.widget.Toolbar.LayoutParams) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f1044f
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 + r7
            int r7 = r15.bottomMargin
            int r3 = r3 + r7
            r7 = 0
            int r3 = r3 + r7
            goto L_0x0103
        L_0x0100:
            r23 = r7
            r3 = 0
        L_0x0103:
            if (r14 == 0) goto L_0x011d
            android.widget.TextView r7 = r0.f1045g
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r7 = (androidx.appcompat.widget.Toolbar.LayoutParams) r7
            int r15 = r7.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f1045g
            int r4 = r4.getMeasuredHeight()
            int r15 = r15 + r4
            int r4 = r7.bottomMargin
            int r15 = r15 + r4
            int r3 = r3 + r15
            goto L_0x011f
        L_0x011d:
            r16 = r4
        L_0x011f:
            if (r13 != 0) goto L_0x012b
            if (r14 == 0) goto L_0x0124
            goto L_0x012b
        L_0x0124:
            r17 = r6
            r22 = r12
        L_0x0128:
            r7 = 0
            goto L_0x0296
        L_0x012b:
            if (r13 == 0) goto L_0x0130
            android.widget.TextView r4 = r0.f1044f
            goto L_0x0132
        L_0x0130:
            android.widget.TextView r4 = r0.f1045g
        L_0x0132:
            if (r14 == 0) goto L_0x0137
            android.widget.TextView r7 = r0.f1045g
            goto L_0x0139
        L_0x0137:
            android.widget.TextView r7 = r0.f1044f
        L_0x0139:
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r4 = (androidx.appcompat.widget.Toolbar.LayoutParams) r4
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r7 = (androidx.appcompat.widget.Toolbar.LayoutParams) r7
            if (r13 == 0) goto L_0x014f
            android.widget.TextView r15 = r0.f1044f
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0159
        L_0x014f:
            if (r14 == 0) goto L_0x015d
            android.widget.TextView r15 = r0.f1045g
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015d
        L_0x0159:
            r17 = r6
            r15 = 1
            goto L_0x0160
        L_0x015d:
            r17 = r6
            r15 = 0
        L_0x0160:
            int r6 = r0.f1024A
            r6 = r6 & 112(0x70, float:1.57E-43)
            r22 = r12
            r12 = 48
            if (r6 == r12) goto L_0x01a8
            r12 = 80
            if (r6 == r12) goto L_0x019a
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r3
            int r6 = r6 / 2
            int r12 = r4.topMargin
            r24 = r2
            int r2 = r0.f1060v
            r18 = r14
            int r14 = r12 + r2
            if (r6 >= r14) goto L_0x0183
            int r6 = r12 + r2
            goto L_0x0198
        L_0x0183:
            int r5 = r5 - r9
            int r5 = r5 - r3
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r4.bottomMargin
            int r3 = r0.f1061w
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x0198
            int r2 = r7.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0198:
            int r8 = r8 + r6
            goto L_0x01b7
        L_0x019a:
            r24 = r2
            r18 = r14
            int r5 = r5 - r9
            int r2 = r7.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.f1061w
            int r5 = r5 - r2
            int r8 = r5 - r3
            goto L_0x01b7
        L_0x01a8:
            r24 = r2
            r18 = r14
            int r2 = r19.getPaddingTop()
            int r3 = r4.topMargin
            int r2 = r2 + r3
            int r3 = r0.f1060v
            int r8 = r2 + r3
        L_0x01b7:
            if (r1 == 0) goto L_0x022c
            if (r15 == 0) goto L_0x01bf
            int r3 = r0.f1058t
            r1 = 1
            goto L_0x01c1
        L_0x01bf:
            r1 = 1
            r3 = 0
        L_0x01c1:
            r2 = r11[r1]
            int r3 = r3 - r2
            r2 = 0
            int r4 = java.lang.Math.max(r2, r3)
            int r10 = r10 - r4
            int r3 = -r3
            int r3 = java.lang.Math.max(r2, r3)
            r11[r1] = r3
            if (r13 == 0) goto L_0x01f7
            android.widget.TextView r1 = r0.f1044f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            android.widget.TextView r2 = r0.f1044f
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f1044f
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f1044f
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.f1059u
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f8
        L_0x01f7:
            r2 = r10
        L_0x01f8:
            if (r18 == 0) goto L_0x0220
            android.widget.TextView r1 = r0.f1045g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            int r3 = r1.topMargin
            int r8 = r8 + r3
            android.widget.TextView r3 = r0.f1045g
            int r3 = r3.getMeasuredWidth()
            int r3 = r10 - r3
            android.widget.TextView r4 = r0.f1045g
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f1045g
            r5.layout(r3, r8, r10, r4)
            int r3 = r0.f1059u
            int r3 = r10 - r3
            int r1 = r1.bottomMargin
            goto L_0x0221
        L_0x0220:
            r3 = r10
        L_0x0221:
            if (r15 == 0) goto L_0x0228
            int r1 = java.lang.Math.min(r2, r3)
            r10 = r1
        L_0x0228:
            r2 = r24
            goto L_0x0128
        L_0x022c:
            if (r15 == 0) goto L_0x0231
            int r3 = r0.f1058t
            goto L_0x0232
        L_0x0231:
            r3 = 0
        L_0x0232:
            r7 = 0
            r1 = r11[r7]
            int r3 = r3 - r1
            int r1 = java.lang.Math.max(r7, r3)
            int r2 = r24 + r1
            int r1 = -r3
            int r1 = java.lang.Math.max(r7, r1)
            r11[r7] = r1
            if (r13 == 0) goto L_0x0268
            android.widget.TextView r1 = r0.f1044f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            android.widget.TextView r3 = r0.f1044f
            int r3 = r3.getMeasuredWidth()
            int r3 = r3 + r2
            android.widget.TextView r4 = r0.f1044f
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f1044f
            r5.layout(r2, r8, r3, r4)
            int r5 = r0.f1059u
            int r3 = r3 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x0269
        L_0x0268:
            r3 = r2
        L_0x0269:
            if (r18 == 0) goto L_0x028f
            android.widget.TextView r1 = r0.f1045g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r1 = (androidx.appcompat.widget.Toolbar.LayoutParams) r1
            int r4 = r1.topMargin
            int r8 = r8 + r4
            android.widget.TextView r4 = r0.f1045g
            int r4 = r4.getMeasuredWidth()
            int r4 = r4 + r2
            android.widget.TextView r5 = r0.f1045g
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r8
            android.widget.TextView r6 = r0.f1045g
            r6.layout(r2, r8, r4, r5)
            int r5 = r0.f1059u
            int r4 = r4 + r5
            int r1 = r1.bottomMargin
            goto L_0x0290
        L_0x028f:
            r4 = r2
        L_0x0290:
            if (r15 == 0) goto L_0x0296
            int r2 = java.lang.Math.max(r3, r4)
        L_0x0296:
            java.util.ArrayList<android.view.View> r1 = r0.f1031H
            r3 = 3
            r0.m886a(r1, r3)
            java.util.ArrayList<android.view.View> r1 = r0.f1031H
            int r1 = r1.size()
            r3 = r2
            r2 = 0
        L_0x02a4:
            if (r2 >= r1) goto L_0x02b7
            java.util.ArrayList<android.view.View> r4 = r0.f1031H
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r3 = r0.m882a(r4, r3, r11, r12)
            int r2 = r2 + 1
            goto L_0x02a4
        L_0x02b7:
            r12 = r22
            java.util.ArrayList<android.view.View> r1 = r0.f1031H
            r2 = 5
            r0.m886a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.f1031H
            int r1 = r1.size()
            r2 = 0
        L_0x02c6:
            if (r2 >= r1) goto L_0x02d7
            java.util.ArrayList<android.view.View> r4 = r0.f1031H
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.m889b(r4, r10, r11, r12)
            int r2 = r2 + 1
            goto L_0x02c6
        L_0x02d7:
            java.util.ArrayList<android.view.View> r1 = r0.f1031H
            r2 = 1
            r0.m886a(r1, r2)
            java.util.ArrayList<android.view.View> r1 = r0.f1031H
            int r1 = r0.m883a(r1, r11)
            int r4 = r16 - r17
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r6 = r17 + r4
            int r2 = r1 / 2
            int r2 = r6 - r2
            int r1 = r1 + r2
            if (r2 >= r3) goto L_0x02f3
            goto L_0x02fa
        L_0x02f3:
            if (r1 <= r10) goto L_0x02f9
            int r1 = r1 - r10
            int r3 = r2 - r1
            goto L_0x02fa
        L_0x02f9:
            r3 = r2
        L_0x02fa:
            java.util.ArrayList<android.view.View> r1 = r0.f1031H
            int r1 = r1.size()
        L_0x0300:
            if (r7 >= r1) goto L_0x0311
            java.util.ArrayList<android.view.View> r2 = r0.f1031H
            java.lang.Object r2 = r2.get(r7)
            android.view.View r2 = (android.view.View) r2
            int r3 = r0.m882a(r2, r3, r11, r12)
            int r7 = r7 + 1
            goto L_0x0300
        L_0x0311:
            java.util.ArrayList<android.view.View> r1 = r0.f1031H
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        char c;
        char c2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f1033J;
        if (C0254f0.m992a(this)) {
            c2 = 1;
            c = 0;
        } else {
            c2 = 0;
            c = 1;
        }
        if (m892d(this.f1046h)) {
            m884a((View) this.f1046h, i, 0, i2, 0, this.f1057s);
            i5 = this.f1046h.getMeasuredWidth() + m879a((View) this.f1046h);
            i4 = Math.max(0, this.f1046h.getMeasuredHeight() + m888b((View) this.f1046h));
            i3 = View.combineMeasuredStates(0, this.f1046h.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (m892d(this.f1050l)) {
            m884a((View) this.f1050l, i, 0, i2, 0, this.f1057s);
            i5 = this.f1050l.getMeasuredWidth() + m879a((View) this.f1050l);
            i4 = Math.max(i4, this.f1050l.getMeasuredHeight() + m888b((View) this.f1050l));
            i3 = View.combineMeasuredStates(i3, this.f1050l.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i5);
        iArr[c2] = Math.max(0, currentContentInsetStart - i5);
        if (m892d(this.f1043e)) {
            m884a((View) this.f1043e, i, max, i2, 0, this.f1057s);
            i6 = this.f1043e.getMeasuredWidth() + m879a((View) this.f1043e);
            i4 = Math.max(i4, this.f1043e.getMeasuredHeight() + m888b((View) this.f1043e));
            i3 = View.combineMeasuredStates(i3, this.f1043e.getMeasuredState());
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = Math.max(0, currentContentInsetEnd - i6);
        if (m892d(this.f1051m)) {
            max2 += m881a(this.f1051m, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1051m.getMeasuredHeight() + m888b(this.f1051m));
            i3 = View.combineMeasuredStates(i3, this.f1051m.getMeasuredState());
        }
        if (m892d(this.f1047i)) {
            max2 += m881a((View) this.f1047i, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1047i.getMeasuredHeight() + m888b((View) this.f1047i));
            i3 = View.combineMeasuredStates(i3, this.f1047i.getMeasuredState());
        }
        int childCount = getChildCount();
        int i10 = i4;
        int i11 = max2;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((LayoutParams) childAt.getLayoutParams()).f1065b == 0 && m892d(childAt)) {
                i11 += m881a(childAt, i, i11, i2, 0, iArr);
                i10 = Math.max(i10, childAt.getMeasuredHeight() + m888b(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i13 = this.f1060v + this.f1061w;
        int i14 = this.f1058t + this.f1059u;
        if (m892d(this.f1044f)) {
            m881a((View) this.f1044f, i, i11 + i14, i2, i13, iArr);
            int measuredWidth = this.f1044f.getMeasuredWidth() + m879a((View) this.f1044f);
            i7 = this.f1044f.getMeasuredHeight() + m888b((View) this.f1044f);
            i9 = View.combineMeasuredStates(i3, this.f1044f.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i9 = i3;
            i8 = 0;
            i7 = 0;
        }
        if (m892d(this.f1045g)) {
            int i15 = i7 + i13;
            int i16 = i9;
            i8 = Math.max(i8, m881a((View) this.f1045g, i, i11 + i14, i2, i15, iArr));
            i7 += this.f1045g.getMeasuredHeight() + m888b((View) this.f1045g);
            i9 = View.combineMeasuredStates(i16, this.f1045g.getMeasuredState());
        } else {
            int i17 = i9;
        }
        int i18 = i11 + i8;
        int max3 = Math.max(i10, i7) + getPaddingTop() + getPaddingBottom();
        int i19 = i;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(i18 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i19, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(max3, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (m899s()) {
            resolveSizeAndState2 = 0;
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3548a());
        ActionMenuView actionMenuView = this.f1043e;
        MenuBuilder g = actionMenuView != null ? actionMenuView.mo1230g() : null;
        int i = savedState.f1066g;
        if (!(i == 0 || this.f1038O == null || g == null)) {
            MenuItem findItem = g.findItem(i);
            if (findItem != null) {
                findItem.expandActionView();
            }
        }
        if (savedState.f1067h) {
            m898r();
        }
    }

    public void onRtlPropertiesChanged(int i) {
        if (VERSION.SDK_INT >= 17) {
            super.onRtlPropertiesChanged(i);
        }
        m893m();
        C0279s sVar = this.f1062x;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        sVar.mo2050a(z);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0236d dVar = this.f1038O;
        if (dVar != null) {
            C0169i iVar = dVar.f1072f;
            if (iVar != null) {
                savedState.f1066g = iVar.getItemId();
            }
        }
        savedState.f1067h = mo1789i();
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1029F = false;
        }
        if (!this.f1029F) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1029F = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1029F = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C7531a.m18133c(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.f1041R = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1064z) {
            this.f1064z = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f1063y) {
            this.f1063y = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(C7531a.m18133c(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C7531a.m18133c(getContext(), i));
    }

    public void setNavigationOnClickListener(OnClickListener onClickListener) {
        m897q();
        this.f1046h.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f1034K = onMenuItemClickListener;
    }

    public void setOverflowIcon(Drawable drawable) {
        m895o();
        this.f1043e.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f1053o != i) {
            this.f1053o = i;
            if (i == 0) {
                this.f1052n = getContext();
            } else {
                this.f1052n = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f1061w = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f1059u = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f1058t = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f1060v = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7521a.toolbarStyle);
    }

    /* renamed from: b */
    public void mo1747b(Context context, int i) {
        this.f1054p = i;
        TextView textView = this.f1044f;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            mo1752e();
        }
        ImageButton imageButton = this.f1050l;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            mo1752e();
            this.f1050l.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f1050l;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f1048j);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            m894n();
            if (!m891c((View) this.f1047i)) {
                m885a((View) this.f1047i, true);
            }
        } else {
            ImageView imageView = this.f1047i;
            if (imageView != null && m891c((View) imageView)) {
                removeView(this.f1047i);
                this.f1032I.remove(this.f1047i);
            }
        }
        ImageView imageView2 = this.f1047i;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m894n();
        }
        ImageView imageView = this.f1047i;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m897q();
        }
        ImageButton imageButton = this.f1046h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m897q();
            if (!m891c((View) this.f1046h)) {
                m885a((View) this.f1046h, true);
            }
        } else {
            ImageButton imageButton = this.f1046h;
            if (imageButton != null && m891c((View) imageButton)) {
                removeView(this.f1046h);
                this.f1032I.remove(this.f1046h);
            }
        }
        ImageButton imageButton2 = this.f1046h;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1045g == null) {
                Context context = getContext();
                this.f1045g = new AppCompatTextView(context);
                this.f1045g.setSingleLine();
                this.f1045g.setEllipsize(TruncateAt.END);
                int i = this.f1055q;
                if (i != 0) {
                    this.f1045g.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1028E;
                if (colorStateList != null) {
                    this.f1045g.setTextColor(colorStateList);
                }
            }
            if (!m891c((View) this.f1045g)) {
                m885a((View) this.f1045g, true);
            }
        } else {
            TextView textView = this.f1045g;
            if (textView != null && m891c((View) textView)) {
                removeView(this.f1045g);
                this.f1032I.remove(this.f1045g);
            }
        }
        TextView textView2 = this.f1045g;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1026C = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1028E = colorStateList;
        TextView textView = this.f1045g;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1044f == null) {
                Context context = getContext();
                this.f1044f = new AppCompatTextView(context);
                this.f1044f.setSingleLine();
                this.f1044f.setEllipsize(TruncateAt.END);
                int i = this.f1054p;
                if (i != 0) {
                    this.f1044f.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1027D;
                if (colorStateList != null) {
                    this.f1044f.setTextColor(colorStateList);
                }
            }
            if (!m891c((View) this.f1044f)) {
                m885a((View) this.f1044f, true);
            }
        } else {
            TextView textView = this.f1044f;
            if (textView != null && m891c((View) textView)) {
                removeView(this.f1044f);
                this.f1032I.remove(this.f1044f);
            }
        }
        TextView textView2 = this.f1044f;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1025B = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1027D = colorStateList;
        TextView textView = this.f1044f;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1024A = 8388627;
        this.f1031H = new ArrayList<>();
        this.f1032I = new ArrayList<>();
        this.f1033J = new int[2];
        this.f1035L = new C0233a();
        this.f1042S = new C0234b();
        C0291z a = C0291z.m1196a(getContext(), attributeSet, C7530j.Toolbar, i, 0);
        this.f1054p = a.mo2115g(C7530j.Toolbar_titleTextAppearance, 0);
        this.f1055q = a.mo2115g(C7530j.Toolbar_subtitleTextAppearance, 0);
        this.f1024A = a.mo2111e(C7530j.Toolbar_android_gravity, this.f1024A);
        this.f1056r = a.mo2111e(C7530j.Toolbar_buttonGravity, 48);
        int b = a.mo2105b(C7530j.Toolbar_titleMargin, 0);
        if (a.mo2116g(C7530j.Toolbar_titleMargins)) {
            b = a.mo2105b(C7530j.Toolbar_titleMargins, b);
        }
        this.f1061w = b;
        this.f1060v = b;
        this.f1059u = b;
        this.f1058t = b;
        int b2 = a.mo2105b(C7530j.Toolbar_titleMarginStart, -1);
        if (b2 >= 0) {
            this.f1058t = b2;
        }
        int b3 = a.mo2105b(C7530j.Toolbar_titleMarginEnd, -1);
        if (b3 >= 0) {
            this.f1059u = b3;
        }
        int b4 = a.mo2105b(C7530j.Toolbar_titleMarginTop, -1);
        if (b4 >= 0) {
            this.f1060v = b4;
        }
        int b5 = a.mo2105b(C7530j.Toolbar_titleMarginBottom, -1);
        if (b5 >= 0) {
            this.f1061w = b5;
        }
        this.f1057s = a.mo2107c(C7530j.Toolbar_maxButtonHeight, -1);
        int b6 = a.mo2105b(C7530j.Toolbar_contentInsetStart, Integer.MIN_VALUE);
        int b7 = a.mo2105b(C7530j.Toolbar_contentInsetEnd, Integer.MIN_VALUE);
        int c = a.mo2107c(C7530j.Toolbar_contentInsetLeft, 0);
        int c2 = a.mo2107c(C7530j.Toolbar_contentInsetRight, 0);
        m893m();
        this.f1062x.mo2049a(c, c2);
        if (!(b6 == Integer.MIN_VALUE && b7 == Integer.MIN_VALUE)) {
            this.f1062x.mo2052b(b6, b7);
        }
        this.f1063y = a.mo2105b(C7530j.Toolbar_contentInsetStartWithNavigation, Integer.MIN_VALUE);
        this.f1064z = a.mo2105b(C7530j.Toolbar_contentInsetEndWithActions, Integer.MIN_VALUE);
        this.f1048j = a.mo2106b(C7530j.Toolbar_collapseIcon);
        this.f1049k = a.mo2112e(C7530j.Toolbar_collapseContentDescription);
        CharSequence e = a.mo2112e(C7530j.Toolbar_title);
        if (!TextUtils.isEmpty(e)) {
            setTitle(e);
        }
        CharSequence e2 = a.mo2112e(C7530j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(e2)) {
            setSubtitle(e2);
        }
        this.f1052n = getContext();
        setPopupTheme(a.mo2115g(C7530j.Toolbar_popupTheme, 0));
        Drawable b8 = a.mo2106b(C7530j.Toolbar_navigationIcon);
        if (b8 != null) {
            setNavigationIcon(b8);
        }
        CharSequence e3 = a.mo2112e(C7530j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(e3)) {
            setNavigationContentDescription(e3);
        }
        Drawable b9 = a.mo2106b(C7530j.Toolbar_logo);
        if (b9 != null) {
            setLogo(b9);
        }
        CharSequence e4 = a.mo2112e(C7530j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(e4)) {
            setLogoDescription(e4);
        }
        if (a.mo2116g(C7530j.Toolbar_titleTextColor)) {
            setTitleTextColor(a.mo2100a(C7530j.Toolbar_titleTextColor));
        }
        if (a.mo2116g(C7530j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a.mo2100a(C7530j.Toolbar_subtitleTextColor));
        }
        if (a.mo2116g(C7530j.Toolbar_menu)) {
            mo1742a(a.mo2115g(C7530j.Toolbar_menu, 0));
        }
        a.mo2102a();
    }

    /* renamed from: c */
    private int m890c(int i) {
        int i2 = i & 112;
        return (i2 == 16 || i2 == 48 || i2 == 80) ? i2 : this.f1024A & 112;
    }

    /* renamed from: d */
    private boolean m892d(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: c */
    private boolean m891c(View view) {
        return view.getParent() == this || this.f1032I.contains(view);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof androidx.appcompat.app.ActionBar.LayoutParams) {
            return new LayoutParams((androidx.appcompat.app.ActionBar.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* renamed from: b */
    private int m889b(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int a = m880a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a, max, view.getMeasuredHeight() + a);
        return max - (measuredWidth + layoutParams.leftMargin);
    }

    /* renamed from: b */
    private int m887b(int i) {
        int o = ViewCompat.m2862o(this);
        int a = C0641c.m3002a(i, o) & 7;
        if (a != 1) {
            int i2 = 3;
            if (!(a == 3 || a == 5)) {
                if (o == 1) {
                    i2 = 5;
                }
                return i2;
            }
        }
        return a;
    }

    /* renamed from: b */
    private int m888b(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: a */
    public void mo1744a(Context context, int i) {
        this.f1055q = i;
        TextView textView = this.f1045g;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: a */
    public void mo1742a(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    /* renamed from: a */
    public void mo1743a(int i, int i2) {
        m893m();
        this.f1062x.mo2052b(i, i2);
    }

    /* renamed from: a */
    private void m885a(View view, boolean z) {
        LayoutParams layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams2)) {
            layoutParams = generateLayoutParams(layoutParams2);
        } else {
            layoutParams = (LayoutParams) layoutParams2;
        }
        layoutParams.f1065b = 1;
        if (!z || this.f1051m == null) {
            addView(view, layoutParams);
            return;
        }
        view.setLayoutParams(layoutParams);
        this.f1032I.add(view);
    }

    /* renamed from: a */
    private void m884a(View view, int i, int i2, int i3, int i4, int i5) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height);
        int mode = MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: a */
    private int m881a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: a */
    private int m883a(List<View> list, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        int size = list.size();
        int i3 = i2;
        int i4 = i;
        int i5 = 0;
        int i6 = 0;
        while (i5 < size) {
            View view = (View) list.get(i5);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i7 = layoutParams.leftMargin - i4;
            int i8 = layoutParams.rightMargin - i3;
            int max = Math.max(0, i7);
            int max2 = Math.max(0, i8);
            int max3 = Math.max(0, -i7);
            i6 += max + view.getMeasuredWidth() + max2;
            i5++;
            i3 = Math.max(0, -i8);
            i4 = max3;
        }
        return i6;
    }

    /* renamed from: a */
    private int m882a(View view, int i, int[] iArr, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int a = m880a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a, max + measuredWidth, view.getMeasuredHeight() + a);
        return max + measuredWidth + layoutParams.rightMargin;
    }

    /* renamed from: a */
    private int m880a(View view, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i2 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int c = m890c(layoutParams.f147a);
        if (c == 48) {
            return getPaddingTop() - i2;
        }
        if (c == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - layoutParams.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i3 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i4 = layoutParams.topMargin;
        if (i3 < i4) {
            i3 = i4;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i3) - paddingTop;
            int i6 = layoutParams.bottomMargin;
            if (i5 < i6) {
                i3 = Math.max(0, i3 - (i6 - i5));
            }
        }
        return paddingTop + i3;
    }

    /* renamed from: a */
    private void m886a(List<View> list, int i) {
        boolean z = ViewCompat.m2862o(this) == 1;
        int childCount = getChildCount();
        int a = C0641c.m3002a(i, ViewCompat.m2862o(this));
        list.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f1065b == 0 && m892d(childAt) && m887b(layoutParams.f147a) == a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.f1065b == 0 && m892d(childAt2) && m887b(layoutParams2.f147a) == a) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: a */
    private int m879a(View view) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        return C0643e.m3007b(marginLayoutParams) + C0643e.m3006a(marginLayoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1741a() {
        for (int size = this.f1032I.size() - 1; size >= 0; size--) {
            addView((View) this.f1032I.get(size));
        }
        this.f1032I.clear();
    }

    /* renamed from: a */
    public void mo1746a(Callback callback, MenuBuilder.Callback callback2) {
        this.f1039P = callback;
        this.f1040Q = callback2;
        ActionMenuView actionMenuView = this.f1043e;
        if (actionMenuView != null) {
            actionMenuView.mo1221a(callback, callback2);
        }
    }
}
