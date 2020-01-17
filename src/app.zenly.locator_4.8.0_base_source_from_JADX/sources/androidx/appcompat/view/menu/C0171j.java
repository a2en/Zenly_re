package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.ActionProvider.VisibilityListener;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.view.menu.j */
public class C0171j extends C0157c implements MenuItem {

    /* renamed from: d */
    private final SupportMenuItem f693d;

    /* renamed from: e */
    private Method f694e;

    /* renamed from: androidx.appcompat.view.menu.j$a */
    private class C0172a extends ActionProvider {

        /* renamed from: b */
        final android.view.ActionProvider f695b;

        C0172a(Context context, android.view.ActionProvider actionProvider) {
            super(context);
            this.f695b = actionProvider;
        }

        /* renamed from: a */
        public boolean mo1022a() {
            return this.f695b.hasSubMenu();
        }

        /* renamed from: c */
        public View mo1023c() {
            return this.f695b.onCreateActionView();
        }

        /* renamed from: d */
        public boolean mo1024d() {
            return this.f695b.onPerformDefaultAction();
        }

        /* renamed from: a */
        public void mo1021a(SubMenu subMenu) {
            this.f695b.onPrepareSubMenu(C0171j.this.mo866a(subMenu));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$b */
    private class C0173b extends C0172a implements VisibilityListener {

        /* renamed from: d */
        private ActionProvider.VisibilityListener f697d;

        C0173b(C0171j jVar, Context context, android.view.ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        /* renamed from: a */
        public View mo1025a(MenuItem menuItem) {
            return this.f695b.onCreateActionView(menuItem);
        }

        /* renamed from: b */
        public boolean mo1027b() {
            return this.f695b.isVisible();
        }

        /* renamed from: e */
        public boolean mo1028e() {
            return this.f695b.overridesItemVisibility();
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            ActionProvider.VisibilityListener visibilityListener = this.f697d;
            if (visibilityListener != null) {
                visibilityListener.onActionProviderVisibilityChanged(z);
            }
        }

        /* renamed from: a */
        public void mo1026a(ActionProvider.VisibilityListener visibilityListener) {
            this.f697d = visibilityListener;
            this.f695b.setVisibilityListener(visibilityListener != null ? this : null);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$c */
    static class C0174c extends FrameLayout implements CollapsibleActionView {

        /* renamed from: e */
        final android.view.CollapsibleActionView f698e;

        C0174c(View view) {
            super(view.getContext());
            this.f698e = (android.view.CollapsibleActionView) view;
            addView(view);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public View mo1030a() {
            return (View) this.f698e;
        }

        public void onActionViewCollapsed() {
            this.f698e.onActionViewCollapsed();
        }

        public void onActionViewExpanded() {
            this.f698e.onActionViewExpanded();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$d */
    private class C0175d implements OnActionExpandListener {

        /* renamed from: a */
        private final OnActionExpandListener f699a;

        C0175d(OnActionExpandListener onActionExpandListener) {
            this.f699a = onActionExpandListener;
        }

        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f699a.onMenuItemActionCollapse(C0171j.this.mo865a(menuItem));
        }

        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f699a.onMenuItemActionExpand(C0171j.this.mo865a(menuItem));
        }
    }

    /* renamed from: androidx.appcompat.view.menu.j$e */
    private class C0176e implements OnMenuItemClickListener {

        /* renamed from: a */
        private final OnMenuItemClickListener f701a;

        C0176e(OnMenuItemClickListener onMenuItemClickListener) {
            this.f701a = onMenuItemClickListener;
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f701a.onMenuItemClick(C0171j.this.mo865a(menuItem));
        }
    }

    public C0171j(Context context, SupportMenuItem supportMenuItem) {
        super(context);
        if (supportMenuItem != null) {
            this.f693d = supportMenuItem;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    /* renamed from: a */
    public void mo966a(boolean z) {
        try {
            if (this.f694e == null) {
                this.f694e = this.f693d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f694e.invoke(this.f693d, new Object[]{Boolean.valueOf(z)});
        } catch (Exception e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    public boolean collapseActionView() {
        return this.f693d.collapseActionView();
    }

    public boolean expandActionView() {
        return this.f693d.expandActionView();
    }

    public android.view.ActionProvider getActionProvider() {
        ActionProvider supportActionProvider = this.f693d.getSupportActionProvider();
        if (supportActionProvider instanceof C0172a) {
            return ((C0172a) supportActionProvider).f695b;
        }
        return null;
    }

    public View getActionView() {
        View actionView = this.f693d.getActionView();
        return actionView instanceof C0174c ? ((C0174c) actionView).mo1030a() : actionView;
    }

    public int getAlphabeticModifiers() {
        return this.f693d.getAlphabeticModifiers();
    }

    public char getAlphabeticShortcut() {
        return this.f693d.getAlphabeticShortcut();
    }

    public CharSequence getContentDescription() {
        return this.f693d.getContentDescription();
    }

    public int getGroupId() {
        return this.f693d.getGroupId();
    }

    public Drawable getIcon() {
        return this.f693d.getIcon();
    }

    public ColorStateList getIconTintList() {
        return this.f693d.getIconTintList();
    }

    public Mode getIconTintMode() {
        return this.f693d.getIconTintMode();
    }

    public Intent getIntent() {
        return this.f693d.getIntent();
    }

    public int getItemId() {
        return this.f693d.getItemId();
    }

    public ContextMenuInfo getMenuInfo() {
        return this.f693d.getMenuInfo();
    }

    public int getNumericModifiers() {
        return this.f693d.getNumericModifiers();
    }

    public char getNumericShortcut() {
        return this.f693d.getNumericShortcut();
    }

    public int getOrder() {
        return this.f693d.getOrder();
    }

    public SubMenu getSubMenu() {
        return mo866a(this.f693d.getSubMenu());
    }

    public CharSequence getTitle() {
        return this.f693d.getTitle();
    }

    public CharSequence getTitleCondensed() {
        return this.f693d.getTitleCondensed();
    }

    public CharSequence getTooltipText() {
        return this.f693d.getTooltipText();
    }

    public boolean hasSubMenu() {
        return this.f693d.hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return this.f693d.isActionViewExpanded();
    }

    public boolean isCheckable() {
        return this.f693d.isCheckable();
    }

    public boolean isChecked() {
        return this.f693d.isChecked();
    }

    public boolean isEnabled() {
        return this.f693d.isEnabled();
    }

    public boolean isVisible() {
        return this.f693d.isVisible();
    }

    public MenuItem setActionProvider(android.view.ActionProvider actionProvider) {
        ActionProvider actionProvider2;
        if (VERSION.SDK_INT >= 16) {
            actionProvider2 = new C0173b(this, this.f599a, actionProvider);
        } else {
            actionProvider2 = new C0172a(this.f599a, actionProvider);
        }
        SupportMenuItem supportMenuItem = this.f693d;
        if (actionProvider == null) {
            actionProvider2 = null;
        }
        supportMenuItem.setSupportActionProvider(actionProvider2);
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof android.view.CollapsibleActionView) {
            view = new C0174c(view);
        }
        this.f693d.setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f693d.setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f693d.setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f693d.setChecked(z);
        return this;
    }

    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f693d.setContentDescription(charSequence);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f693d.setEnabled(z);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f693d.setIcon(drawable);
        return this;
    }

    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f693d.setIconTintList(colorStateList);
        return this;
    }

    public MenuItem setIconTintMode(Mode mode) {
        this.f693d.setIconTintMode(mode);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f693d.setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f693d.setNumericShortcut(c);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        this.f693d.setOnActionExpandListener(onActionExpandListener != null ? new C0175d(onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f693d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new C0176e(onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f693d.setShortcut(c, c2);
        return this;
    }

    public void setShowAsAction(int i) {
        this.f693d.setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        this.f693d.setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f693d.setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f693d.setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f693d.setTooltipText(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return this.f693d.setVisible(z);
    }

    public MenuItem setAlphabeticShortcut(char c, int i) {
        this.f693d.setAlphabeticShortcut(c, i);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f693d.setIcon(i);
        return this;
    }

    public MenuItem setNumericShortcut(char c, int i) {
        this.f693d.setNumericShortcut(c, i);
        return this;
    }

    public MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f693d.setShortcut(c, c2, i, i2);
        return this;
    }

    public MenuItem setTitle(int i) {
        this.f693d.setTitle(i);
        return this;
    }

    public MenuItem setActionView(int i) {
        this.f693d.setActionView(i);
        View actionView = this.f693d.getActionView();
        if (actionView instanceof android.view.CollapsibleActionView) {
            this.f693d.setActionView((View) new C0174c(actionView));
        }
        return this;
    }
}
