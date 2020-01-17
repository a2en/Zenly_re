package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import androidx.core.content.C0540a;
import androidx.core.graphics.drawable.C0559a;
import androidx.core.internal.view.SupportMenuItem;

/* renamed from: androidx.appcompat.view.menu.a */
public class C0155a implements SupportMenuItem {

    /* renamed from: a */
    private final int f571a;

    /* renamed from: b */
    private final int f572b;

    /* renamed from: c */
    private final int f573c;

    /* renamed from: d */
    private CharSequence f574d;

    /* renamed from: e */
    private CharSequence f575e;

    /* renamed from: f */
    private Intent f576f;

    /* renamed from: g */
    private char f577g;

    /* renamed from: h */
    private int f578h = 4096;

    /* renamed from: i */
    private char f579i;

    /* renamed from: j */
    private int f580j = 4096;

    /* renamed from: k */
    private Drawable f581k;

    /* renamed from: l */
    private Context f582l;

    /* renamed from: m */
    private CharSequence f583m;

    /* renamed from: n */
    private CharSequence f584n;

    /* renamed from: o */
    private ColorStateList f585o = null;

    /* renamed from: p */
    private Mode f586p = null;

    /* renamed from: q */
    private boolean f587q = false;

    /* renamed from: r */
    private boolean f588r = false;

    /* renamed from: s */
    private int f589s = 16;

    public C0155a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f582l = context;
        this.f571a = i2;
        this.f572b = i;
        this.f573c = i4;
        this.f574d = charSequence;
    }

    /* renamed from: a */
    private void m610a() {
        if (this.f581k == null) {
            return;
        }
        if (this.f587q || this.f588r) {
            this.f581k = C0559a.m2657i(this.f581k);
            this.f581k = this.f581k.mutate();
            if (this.f587q) {
                C0559a.m2642a(this.f581k, this.f585o);
            }
            if (this.f588r) {
                C0559a.m2645a(this.f581k, this.f586p);
            }
        }
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public int getAlphabeticModifiers() {
        return this.f580j;
    }

    public char getAlphabeticShortcut() {
        return this.f579i;
    }

    public CharSequence getContentDescription() {
        return this.f583m;
    }

    public int getGroupId() {
        return this.f572b;
    }

    public Drawable getIcon() {
        return this.f581k;
    }

    public ColorStateList getIconTintList() {
        return this.f585o;
    }

    public Mode getIconTintMode() {
        return this.f586p;
    }

    public Intent getIntent() {
        return this.f576f;
    }

    public int getItemId() {
        return this.f571a;
    }

    public ContextMenuInfo getMenuInfo() {
        return null;
    }

    public int getNumericModifiers() {
        return this.f578h;
    }

    public char getNumericShortcut() {
        return this.f577g;
    }

    public int getOrder() {
        return this.f573c;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public androidx.core.view.ActionProvider getSupportActionProvider() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f574d;
    }

    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f575e;
        return charSequence != null ? charSequence : this.f574d;
    }

    public CharSequence getTooltipText() {
        return this.f584n;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f589s & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f589s & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f589s & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f589s & 8) == 0;
    }

    public boolean requiresActionButton() {
        return true;
    }

    public boolean requiresOverflow() {
        return false;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f579i = Character.toLowerCase(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f589s = z | (this.f589s & true) ? 1 : 0;
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f589s = (z ? 2 : 0) | (this.f589s & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f589s = (z ? 16 : 0) | (this.f589s & -17);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f581k = drawable;
        m610a();
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f585o = colorStateList;
        this.f587q = true;
        m610a();
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        this.f586p = mode;
        this.f588r = true;
        m610a();
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f576f = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f577g = c;
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f577g = c;
        this.f579i = Character.toLowerCase(c2);
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public SupportMenuItem setSupportActionProvider(androidx.core.view.ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f574d = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f575e = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.f589s & 8;
        if (z) {
            i = 0;
        }
        this.f589s = i2 | i;
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f579i = Character.toLowerCase(c);
        this.f580j = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public SupportMenuItem setContentDescription(CharSequence charSequence) {
        this.f583m = charSequence;
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f577g = c;
        this.f578h = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public SupportMenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f574d = this.f582l.getResources().getString(i);
        return this;
    }

    public SupportMenuItem setTooltipText(CharSequence charSequence) {
        this.f584n = charSequence;
        return this;
    }

    public SupportMenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setIcon(int i) {
        this.f581k = C0540a.m2546c(this.f582l, i);
        m610a();
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f577g = c;
        this.f578h = KeyEvent.normalizeMetaState(i);
        this.f579i = Character.toLowerCase(c2);
        this.f580j = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    public SupportMenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }
}
