package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.internal.view.SupportSubMenu;
import java.util.Iterator;
import java.util.Map;
import p214e.p228e.C7571a;

/* renamed from: androidx.appcompat.view.menu.c */
abstract class C0157c {

    /* renamed from: a */
    final Context f599a;

    /* renamed from: b */
    private Map<SupportMenuItem, MenuItem> f600b;

    /* renamed from: c */
    private Map<SupportSubMenu, SubMenu> f601c;

    C0157c(Context context) {
        this.f599a = context;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final MenuItem mo865a(MenuItem menuItem) {
        if (!(menuItem instanceof SupportMenuItem)) {
            return menuItem;
        }
        SupportMenuItem supportMenuItem = (SupportMenuItem) menuItem;
        if (this.f600b == null) {
            this.f600b = new C7571a();
        }
        MenuItem menuItem2 = (MenuItem) this.f600b.get(menuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        C0171j jVar = new C0171j(this.f599a, supportMenuItem);
        this.f600b.put(supportMenuItem, jVar);
        return jVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo869b(int i) {
        Map<SupportMenuItem, MenuItem> map = this.f600b;
        if (map != null) {
            Iterator it = map.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (i == ((MenuItem) it.next()).getItemId()) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final SubMenu mo866a(SubMenu subMenu) {
        if (!(subMenu instanceof SupportSubMenu)) {
            return subMenu;
        }
        SupportSubMenu supportSubMenu = (SupportSubMenu) subMenu;
        if (this.f601c == null) {
            this.f601c = new C7571a();
        }
        SubMenu subMenu2 = (SubMenu) this.f601c.get(supportSubMenu);
        if (subMenu2 == null) {
            subMenu2 = new C0185p(this.f599a, supportSubMenu);
            this.f601c.put(supportSubMenu, subMenu2);
        }
        return subMenu2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo867a() {
        Map<SupportMenuItem, MenuItem> map = this.f600b;
        if (map != null) {
            map.clear();
        }
        Map<SupportSubMenu, SubMenu> map2 = this.f601c;
        if (map2 != null) {
            map2.clear();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo868a(int i) {
        Map<SupportMenuItem, MenuItem> map = this.f600b;
        if (map != null) {
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                if (i == ((MenuItem) it.next()).getGroupId()) {
                    it.remove();
                }
            }
        }
    }
}
