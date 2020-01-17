package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.internal.view.SupportSubMenu;

/* renamed from: androidx.appcompat.view.menu.p */
class C0185p extends C0180m implements SubMenu {

    /* renamed from: e */
    private final SupportSubMenu f743e;

    C0185p(Context context, SupportSubMenu supportSubMenu) {
        super(context, supportSubMenu);
        this.f743e = supportSubMenu;
    }

    public void clearHeader() {
        this.f743e.clearHeader();
    }

    public MenuItem getItem() {
        return mo865a(this.f743e.getItem());
    }

    public SubMenu setHeaderIcon(int i) {
        this.f743e.setHeaderIcon(i);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        this.f743e.setHeaderTitle(i);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        this.f743e.setHeaderView(view);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f743e.setIcon(i);
        return this;
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f743e.setHeaderIcon(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f743e.setHeaderTitle(charSequence);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f743e.setIcon(drawable);
        return this;
    }
}
