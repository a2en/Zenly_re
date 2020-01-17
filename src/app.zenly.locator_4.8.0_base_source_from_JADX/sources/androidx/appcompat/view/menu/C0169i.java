package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug.CapturedViewProperty;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.MenuView.ItemView;
import androidx.core.graphics.drawable.C0559a;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;
import androidx.core.view.ActionProvider.VisibilityListener;
import p214e.p215a.C7528h;
import p214e.p215a.p216k.p217a.C7531a;

/* renamed from: androidx.appcompat.view.menu.i */
public final class C0169i implements SupportMenuItem {

    /* renamed from: A */
    private View f661A;

    /* renamed from: B */
    private ActionProvider f662B;

    /* renamed from: C */
    private OnActionExpandListener f663C;

    /* renamed from: D */
    private boolean f664D = false;

    /* renamed from: E */
    private ContextMenuInfo f665E;

    /* renamed from: a */
    private final int f666a;

    /* renamed from: b */
    private final int f667b;

    /* renamed from: c */
    private final int f668c;

    /* renamed from: d */
    private final int f669d;

    /* renamed from: e */
    private CharSequence f670e;

    /* renamed from: f */
    private CharSequence f671f;

    /* renamed from: g */
    private Intent f672g;

    /* renamed from: h */
    private char f673h;

    /* renamed from: i */
    private int f674i = 4096;

    /* renamed from: j */
    private char f675j;

    /* renamed from: k */
    private int f676k = 4096;

    /* renamed from: l */
    private Drawable f677l;

    /* renamed from: m */
    private int f678m = 0;

    /* renamed from: n */
    MenuBuilder f679n;

    /* renamed from: o */
    private C0184o f680o;

    /* renamed from: p */
    private Runnable f681p;

    /* renamed from: q */
    private OnMenuItemClickListener f682q;

    /* renamed from: r */
    private CharSequence f683r;

    /* renamed from: s */
    private CharSequence f684s;

    /* renamed from: t */
    private ColorStateList f685t = null;

    /* renamed from: u */
    private Mode f686u = null;

    /* renamed from: v */
    private boolean f687v = false;

    /* renamed from: w */
    private boolean f688w = false;

    /* renamed from: x */
    private boolean f689x = false;

    /* renamed from: y */
    private int f690y = 16;

    /* renamed from: z */
    private int f691z = 0;

    /* renamed from: androidx.appcompat.view.menu.i$a */
    class C0170a implements VisibilityListener {
        C0170a() {
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C0169i iVar = C0169i.this;
            iVar.f679n.mo751d(iVar);
        }
    }

    C0169i(MenuBuilder menuBuilder, int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        this.f679n = menuBuilder;
        this.f666a = i2;
        this.f667b = i;
        this.f668c = i3;
        this.f669d = i4;
        this.f670e = charSequence;
        this.f691z = i5;
    }

    /* renamed from: a */
    private static void m651a(StringBuilder sb, int i, int i2, String str) {
        if ((i & i2) == i2) {
            sb.append(str);
        }
    }

    /* renamed from: b */
    public int mo916b() {
        return this.f669d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public char mo918c() {
        return this.f679n.mo768p() ? this.f675j : this.f673h;
    }

    public boolean collapseActionView() {
        if ((this.f691z & 8) == 0) {
            return false;
        }
        if (this.f661A == null) {
            return true;
        }
        OnActionExpandListener onActionExpandListener = this.f663C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f679n.mo726a(this);
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public String mo920d() {
        char c = mo918c();
        if (c == 0) {
            return "";
        }
        Resources resources = this.f679n.mo752e().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f679n.mo752e()).hasPermanentMenuKey()) {
            sb.append(resources.getString(C7528h.abc_prepend_shortcut_label));
        }
        int i = this.f679n.mo768p() ? this.f676k : this.f674i;
        m651a(sb, i, 65536, resources.getString(C7528h.abc_menu_meta_shortcut_label));
        m651a(sb, i, 4096, resources.getString(C7528h.abc_menu_ctrl_shortcut_label));
        m651a(sb, i, 2, resources.getString(C7528h.abc_menu_alt_shortcut_label));
        m651a(sb, i, 1, resources.getString(C7528h.abc_menu_shift_shortcut_label));
        m651a(sb, i, 4, resources.getString(C7528h.abc_menu_sym_shortcut_label));
        m651a(sb, i, 8, resources.getString(C7528h.abc_menu_function_shortcut_label));
        if (c == 8) {
            sb.append(resources.getString(C7528h.abc_menu_delete_shortcut_label));
        } else if (c == 10) {
            sb.append(resources.getString(C7528h.abc_menu_enter_shortcut_label));
        } else if (c != ' ') {
            sb.append(c);
        } else {
            sb.append(resources.getString(C7528h.abc_menu_space_shortcut_label));
        }
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo923e(boolean z) {
        int i = this.f690y;
        this.f690y = (z ? 0 : 8) | (i & -9);
        if (i != this.f690y) {
            return true;
        }
        return false;
    }

    public boolean expandActionView() {
        if (!mo922e()) {
            return false;
        }
        OnActionExpandListener onActionExpandListener = this.f663C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f679n.mo741b(this);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo924f() {
        OnMenuItemClickListener onMenuItemClickListener = this.f682q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        MenuBuilder menuBuilder = this.f679n;
        if (menuBuilder.mo725a(menuBuilder, (MenuItem) this)) {
            return true;
        }
        Runnable runnable = this.f681p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f672g != null) {
            try {
                this.f679n.mo752e().startActivity(this.f672g);
                return true;
            } catch (ActivityNotFoundException e) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e);
            }
        }
        ActionProvider actionProvider = this.f662B;
        if (actionProvider == null || !actionProvider.mo1024d()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public boolean mo925g() {
        return (this.f690y & 32) == 32;
    }

    public android.view.ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    public View getActionView() {
        View view = this.f661A;
        if (view != null) {
            return view;
        }
        ActionProvider actionProvider = this.f662B;
        if (actionProvider == null) {
            return null;
        }
        this.f661A = actionProvider.mo1025a((MenuItem) this);
        return this.f661A;
    }

    public int getAlphabeticModifiers() {
        return this.f676k;
    }

    public char getAlphabeticShortcut() {
        return this.f675j;
    }

    public CharSequence getContentDescription() {
        return this.f683r;
    }

    public int getGroupId() {
        return this.f667b;
    }

    public Drawable getIcon() {
        Drawable drawable = this.f677l;
        if (drawable != null) {
            return m650a(drawable);
        }
        if (this.f678m == 0) {
            return null;
        }
        Drawable c = C7531a.m18133c(this.f679n.mo752e(), this.f678m);
        this.f678m = 0;
        this.f677l = c;
        return m650a(c);
    }

    public ColorStateList getIconTintList() {
        return this.f685t;
    }

    public Mode getIconTintMode() {
        return this.f686u;
    }

    public Intent getIntent() {
        return this.f672g;
    }

    @CapturedViewProperty
    public int getItemId() {
        return this.f666a;
    }

    public ContextMenuInfo getMenuInfo() {
        return this.f665E;
    }

    public int getNumericModifiers() {
        return this.f674i;
    }

    public char getNumericShortcut() {
        return this.f673h;
    }

    public int getOrder() {
        return this.f668c;
    }

    public SubMenu getSubMenu() {
        return this.f680o;
    }

    public ActionProvider getSupportActionProvider() {
        return this.f662B;
    }

    @CapturedViewProperty
    public CharSequence getTitle() {
        return this.f670e;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f671f;
        if (charSequence == null) {
            charSequence = this.f670e;
        }
        return (VERSION.SDK_INT >= 18 || charSequence == null || (charSequence instanceof String)) ? charSequence : charSequence.toString();
    }

    public CharSequence getTooltipText() {
        return this.f684s;
    }

    /* renamed from: h */
    public boolean mo938h() {
        return (this.f690y & 4) != 0;
    }

    public boolean hasSubMenu() {
        return this.f680o != null;
    }

    /* renamed from: i */
    public boolean mo940i() {
        return (this.f691z & 1) == 1;
    }

    public boolean isActionViewExpanded() {
        return this.f664D;
    }

    public boolean isCheckable() {
        return (this.f690y & 1) == 1;
    }

    public boolean isChecked() {
        return (this.f690y & 2) == 2;
    }

    public boolean isEnabled() {
        return (this.f690y & 16) != 0;
    }

    public boolean isVisible() {
        ActionProvider actionProvider = this.f662B;
        boolean z = true;
        if (actionProvider == null || !actionProvider.mo1028e()) {
            if ((this.f690y & 8) != 0) {
                z = false;
            }
            return z;
        }
        if ((this.f690y & 8) != 0 || !this.f662B.mo1027b()) {
            z = false;
        }
        return z;
    }

    /* renamed from: j */
    public boolean mo945j() {
        return this.f679n.mo763k();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public boolean mo946k() {
        return this.f679n.mo771q() && mo918c() != 0;
    }

    /* renamed from: l */
    public boolean mo947l() {
        return (this.f691z & 4) == 4;
    }

    public boolean requiresActionButton() {
        return (this.f691z & 2) == 2;
    }

    public boolean requiresOverflow() {
        return !requiresActionButton() && !mo940i();
    }

    public MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    public MenuItem setAlphabeticShortcut(char c) {
        if (this.f675j == c) {
            return this;
        }
        this.f675j = Character.toLowerCase(c);
        this.f679n.mo740b(false);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        int i = this.f690y;
        this.f690y = z | (i & true) ? 1 : 0;
        if (i != this.f690y) {
            this.f679n.mo740b(false);
        }
        return this;
    }

    public MenuItem setChecked(boolean z) {
        if ((this.f690y & 4) != 0) {
            this.f679n.mo717a((MenuItem) this);
        } else {
            mo917b(z);
        }
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        if (z) {
            this.f690y |= 16;
        } else {
            this.f690y &= -17;
        }
        this.f679n.mo740b(false);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f678m = 0;
        this.f677l = drawable;
        this.f689x = true;
        this.f679n.mo740b(false);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f685t = colorStateList;
        this.f687v = true;
        this.f689x = true;
        this.f679n.mo740b(false);
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        this.f686u = mode;
        this.f688w = true;
        this.f689x = true;
        this.f679n.mo740b(false);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f672g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        if (this.f673h == c) {
            return this;
        }
        this.f673h = c;
        this.f679n.mo740b(false);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        this.f663C = onActionExpandListener;
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f682q = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f673h = c;
        this.f675j = Character.toLowerCase(c2);
        this.f679n.mo740b(false);
        return this;
    }

    public void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.f691z = i;
            this.f679n.mo744c(this);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    public SupportMenuItem setSupportActionProvider(ActionProvider actionProvider) {
        ActionProvider actionProvider2 = this.f662B;
        if (actionProvider2 != null) {
            actionProvider2.mo3254f();
        }
        this.f661A = null;
        this.f662B = actionProvider;
        this.f679n.mo740b(true);
        ActionProvider actionProvider3 = this.f662B;
        if (actionProvider3 != null) {
            actionProvider3.mo1026a((VisibilityListener) new C0170a());
        }
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f670e = charSequence;
        this.f679n.mo740b(false);
        C0184o oVar = this.f680o;
        if (oVar != null) {
            oVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f671f = charSequence;
        this.f679n.mo740b(false);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        if (mo923e(z)) {
            this.f679n.mo751d(this);
        }
        return this;
    }

    public String toString() {
        CharSequence charSequence = this.f670e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    /* renamed from: a */
    public void mo914a(C0184o oVar) {
        this.f680o = oVar;
        oVar.setHeaderTitle(getTitle());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo917b(boolean z) {
        int i = this.f690y;
        this.f690y = (z ? 2 : 0) | (i & -3);
        if (i != this.f690y) {
            this.f679n.mo740b(false);
        }
    }

    /* renamed from: c */
    public void mo919c(boolean z) {
        this.f690y = (z ? 4 : 0) | (this.f690y & -5);
    }

    public SupportMenuItem setContentDescription(CharSequence charSequence) {
        this.f683r = charSequence;
        this.f679n.mo740b(false);
        return this;
    }

    public SupportMenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public SupportMenuItem setTooltipText(CharSequence charSequence) {
        this.f684s = charSequence;
        this.f679n.mo740b(false);
        return this;
    }

    public SupportMenuItem setActionView(View view) {
        this.f661A = view;
        this.f662B = null;
        if (view != null && view.getId() == -1) {
            int i = this.f666a;
            if (i > 0) {
                view.setId(i);
            }
        }
        this.f679n.mo744c(this);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public CharSequence mo911a(ItemView itemView) {
        if (itemView == null || !itemView.prefersCondensedTitle()) {
            return getTitle();
        }
        return getTitleCondensed();
    }

    /* renamed from: e */
    public boolean mo922e() {
        if ((this.f691z & 8) == 0) {
            return false;
        }
        if (this.f661A == null) {
            ActionProvider actionProvider = this.f662B;
            if (actionProvider != null) {
                this.f661A = actionProvider.mo1025a((MenuItem) this);
            }
        }
        if (this.f661A != null) {
            return true;
        }
        return false;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.f675j == c && this.f676k == i) {
            return this;
        }
        this.f675j = Character.toLowerCase(c);
        this.f676k = KeyEvent.normalizeMetaState(i);
        this.f679n.mo740b(false);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        if (this.f673h == c && this.f674i == i) {
            return this;
        }
        this.f673h = c;
        this.f674i = KeyEvent.normalizeMetaState(i);
        this.f679n.mo740b(false);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f673h = c;
        this.f674i = KeyEvent.normalizeMetaState(i);
        this.f675j = Character.toLowerCase(c2);
        this.f676k = KeyEvent.normalizeMetaState(i2);
        this.f679n.mo740b(false);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f677l = null;
        this.f678m = i;
        this.f689x = true;
        this.f679n.mo740b(false);
        return this;
    }

    public MenuItem setTitle(int i) {
        setTitle((CharSequence) this.f679n.mo752e().getString(i));
        return this;
    }

    /* renamed from: a */
    private Drawable m650a(Drawable drawable) {
        if (drawable != null && this.f689x && (this.f687v || this.f688w)) {
            drawable = C0559a.m2657i(drawable).mutate();
            if (this.f687v) {
                C0559a.m2642a(drawable, this.f685t);
            }
            if (this.f688w) {
                C0559a.m2645a(drawable, this.f686u);
            }
            this.f689x = false;
        }
        return drawable;
    }

    public SupportMenuItem setActionView(int i) {
        Context e = this.f679n.mo752e();
        setActionView(LayoutInflater.from(e).inflate(i, new LinearLayout(e), false));
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo913a(ContextMenuInfo contextMenuInfo) {
        this.f665E = contextMenuInfo;
    }

    /* renamed from: a */
    public void mo912a() {
        this.f679n.mo744c(this);
    }

    /* renamed from: a */
    public void mo915a(boolean z) {
        this.f664D = z;
        this.f679n.mo740b(false);
    }

    /* renamed from: d */
    public void mo921d(boolean z) {
        if (z) {
            this.f690y |= 32;
        } else {
            this.f690y &= -33;
        }
    }
}
