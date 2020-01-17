package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.MenuBuilder.Callback;

/* renamed from: androidx.appcompat.view.menu.o */
public class C0184o extends MenuBuilder implements SubMenu {

    /* renamed from: B */
    private MenuBuilder f741B;

    /* renamed from: C */
    private C0169i f742C;

    public C0184o(Context context, MenuBuilder menuBuilder, C0169i iVar) {
        super(context);
        this.f741B = menuBuilder;
        this.f742C = iVar;
    }

    /* renamed from: a */
    public void mo718a(Callback callback) {
        this.f741B.mo718a(callback);
    }

    /* renamed from: b */
    public boolean mo741b(C0169i iVar) {
        return this.f741B.mo741b(iVar);
    }

    /* renamed from: d */
    public String mo750d() {
        C0169i iVar = this.f742C;
        int itemId = iVar != null ? iVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.mo750d());
        sb.append(":");
        sb.append(itemId);
        return sb.toString();
    }

    public MenuItem getItem() {
        return this.f742C;
    }

    /* renamed from: m */
    public MenuBuilder mo765m() {
        return this.f741B.mo765m();
    }

    /* renamed from: o */
    public boolean mo767o() {
        return this.f741B.mo767o();
    }

    /* renamed from: p */
    public boolean mo768p() {
        return this.f741B.mo768p();
    }

    /* renamed from: q */
    public boolean mo771q() {
        return this.f741B.mo771q();
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f741B.setGroupDividerEnabled(z);
    }

    public SubMenu setHeaderIcon(Drawable drawable) {
        super.mo711a(drawable);
        return this;
    }

    public SubMenu setHeaderTitle(CharSequence charSequence) {
        super.mo713a(charSequence);
        return this;
    }

    public SubMenu setHeaderView(View view) {
        super.mo712a(view);
        return this;
    }

    public SubMenu setIcon(Drawable drawable) {
        this.f742C.setIcon(drawable);
        return this;
    }

    public void setQwertyMode(boolean z) {
        this.f741B.setQwertyMode(z);
    }

    /* renamed from: t */
    public Menu mo1087t() {
        return this.f741B;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo725a(MenuBuilder menuBuilder, MenuItem menuItem) {
        return super.mo725a(menuBuilder, menuItem) || this.f741B.mo725a(menuBuilder, menuItem);
    }

    public SubMenu setHeaderIcon(int i) {
        super.mo749d(i);
        return this;
    }

    public SubMenu setHeaderTitle(int i) {
        super.mo753e(i);
        return this;
    }

    public SubMenu setIcon(int i) {
        this.f742C.setIcon(i);
        return this;
    }

    /* renamed from: a */
    public boolean mo726a(C0169i iVar) {
        return this.f741B.mo726a(iVar);
    }
}
