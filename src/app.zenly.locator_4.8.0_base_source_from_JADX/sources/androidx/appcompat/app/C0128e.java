package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window.Callback;
import androidx.appcompat.app.ActionBar.OnMenuVisibilityListener;
import androidx.appcompat.view.C0152g;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.widget.C0239a0;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.Toolbar.OnMenuItemClickListener;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.app.e */
class C0128e extends ActionBar {

    /* renamed from: a */
    DecorToolbar f376a;

    /* renamed from: b */
    boolean f377b;

    /* renamed from: c */
    Callback f378c;

    /* renamed from: d */
    private boolean f379d;

    /* renamed from: e */
    private boolean f380e;

    /* renamed from: f */
    private ArrayList<OnMenuVisibilityListener> f381f = new ArrayList<>();

    /* renamed from: g */
    private final Runnable f382g = new C0129a();

    /* renamed from: h */
    private final OnMenuItemClickListener f383h = new C0130b();

    /* renamed from: androidx.appcompat.app.e$a */
    class C0129a implements Runnable {
        C0129a() {
        }

        public void run() {
            C0128e.this.mo566i();
        }
    }

    /* renamed from: androidx.appcompat.app.e$b */
    class C0130b implements OnMenuItemClickListener {
        C0130b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return C0128e.this.f378c.onMenuItemSelected(0, menuItem);
        }
    }

    /* renamed from: androidx.appcompat.app.e$c */
    private final class C0131c implements MenuPresenter.Callback {

        /* renamed from: e */
        private boolean f386e;

        C0131c() {
        }

        public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
            if (!this.f386e) {
                this.f386e = true;
                C0128e.this.f376a.dismissPopupMenus();
                Callback callback = C0128e.this.f378c;
                if (callback != null) {
                    callback.onPanelClosed(108, menuBuilder);
                }
                this.f386e = false;
            }
        }

        public boolean onOpenSubMenu(MenuBuilder menuBuilder) {
            Callback callback = C0128e.this.f378c;
            if (callback == null) {
                return false;
            }
            callback.onMenuOpened(108, menuBuilder);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.e$d */
    private final class C0132d implements MenuBuilder.Callback {
        C0132d() {
        }

        public boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
            return false;
        }

        public void onMenuModeChange(MenuBuilder menuBuilder) {
            C0128e eVar = C0128e.this;
            if (eVar.f378c == null) {
                return;
            }
            if (eVar.f376a.isOverflowMenuShowing()) {
                C0128e.this.f378c.onPanelClosed(108, menuBuilder);
            } else if (C0128e.this.f378c.onPreparePanel(0, null, menuBuilder)) {
                C0128e.this.f378c.onMenuOpened(108, menuBuilder);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.e$e */
    private class C0133e extends C0152g {
        public C0133e(Callback callback) {
            super(callback);
        }

        public View onCreatePanelView(int i) {
            if (i == 0) {
                return new View(C0128e.this.f376a.getContext());
            }
            return super.onCreatePanelView(i);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (onPreparePanel) {
                C0128e eVar = C0128e.this;
                if (!eVar.f377b) {
                    eVar.f376a.setMenuPrepared();
                    C0128e.this.f377b = true;
                }
            }
            return onPreparePanel;
        }
    }

    C0128e(Toolbar toolbar, CharSequence charSequence, Callback callback) {
        this.f376a = new C0239a0(toolbar, false);
        this.f378c = new C0133e(callback);
        this.f376a.setWindowCallback(this.f378c);
        toolbar.setOnMenuItemClickListener(this.f383h);
        this.f376a.setWindowTitle(charSequence);
    }

    /* renamed from: j */
    private Menu m400j() {
        if (!this.f379d) {
            this.f376a.setMenuCallbacks(new C0131c(), new C0132d());
            this.f379d = true;
        }
        return this.f376a.getMenu();
    }

    /* renamed from: a */
    public void mo294a(Drawable drawable) {
        this.f376a.setNavigationIcon(drawable);
    }

    /* renamed from: b */
    public void mo300b(CharSequence charSequence) {
        this.f376a.setWindowTitle(charSequence);
    }

    /* renamed from: b */
    public void mo301b(boolean z) {
    }

    /* renamed from: c */
    public void mo304c(boolean z) {
        mo564a(z ? 4 : 0, 4);
    }

    /* renamed from: d */
    public Context mo305d() {
        return this.f376a.getContext();
    }

    /* renamed from: d */
    public void mo306d(boolean z) {
    }

    /* renamed from: e */
    public boolean mo307e() {
        this.f376a.getViewGroup().removeCallbacks(this.f382g);
        ViewCompat.m2826a((View) this.f376a.getViewGroup(), this.f382g);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo308f() {
        this.f376a.getViewGroup().removeCallbacks(this.f382g);
    }

    /* renamed from: g */
    public boolean mo309g() {
        return this.f376a.showOverflowMenu();
    }

    /* renamed from: h */
    public Callback mo565h() {
        return this.f378c;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public void mo566i() {
        Menu j = m400j();
        MenuBuilder menuBuilder = j instanceof MenuBuilder ? (MenuBuilder) j : null;
        if (menuBuilder != null) {
            menuBuilder.mo775s();
        }
        try {
            j.clear();
            if (!this.f378c.onCreatePanelMenu(0, j) || !this.f378c.onPreparePanel(0, null, j)) {
                j.clear();
            }
            if (menuBuilder != null) {
                menuBuilder.mo772r();
            }
        } catch (Throwable th) {
            if (menuBuilder != null) {
                menuBuilder.mo772r();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public void mo292a(int i) {
        this.f376a.setNavigationContentDescription(i);
    }

    /* renamed from: b */
    public boolean mo302b() {
        if (!this.f376a.hasExpandedActionView()) {
            return false;
        }
        this.f376a.collapseActionView();
        return true;
    }

    /* renamed from: c */
    public int mo303c() {
        return this.f376a.getDisplayOptions();
    }

    /* renamed from: a */
    public void mo293a(Configuration configuration) {
        super.mo293a(configuration);
    }

    /* renamed from: a */
    public void mo295a(CharSequence charSequence) {
        this.f376a.setTitle(charSequence);
    }

    /* renamed from: a */
    public void mo564a(int i, int i2) {
        this.f376a.setDisplayOptions((i & i2) | ((~i2) & this.f376a.getDisplayOptions()));
    }

    /* renamed from: a */
    public boolean mo297a() {
        return this.f376a.hideOverflowMenu();
    }

    /* renamed from: a */
    public boolean mo299a(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo309g();
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo298a(int i, KeyEvent keyEvent) {
        Menu j = m400j();
        if (j == null) {
            return false;
        }
        boolean z = true;
        if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() == 1) {
            z = false;
        }
        j.setQwertyMode(z);
        return j.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: a */
    public void mo296a(boolean z) {
        if (z != this.f380e) {
            this.f380e = z;
            int size = this.f381f.size();
            for (int i = 0; i < size; i++) {
                ((OnMenuVisibilityListener) this.f381f.get(i)).onMenuVisibilityChanged(z);
            }
        }
    }
}
