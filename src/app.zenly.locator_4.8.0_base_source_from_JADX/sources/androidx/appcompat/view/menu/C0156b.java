package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.appcompat.view.menu.MenuView.ItemView;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.b */
public abstract class C0156b implements MenuPresenter {

    /* renamed from: e */
    protected Context f590e;

    /* renamed from: f */
    protected Context f591f;

    /* renamed from: g */
    protected MenuBuilder f592g;

    /* renamed from: h */
    protected LayoutInflater f593h;

    /* renamed from: i */
    private Callback f594i;

    /* renamed from: j */
    private int f595j;

    /* renamed from: k */
    private int f596k;

    /* renamed from: l */
    protected MenuView f597l;

    /* renamed from: m */
    private int f598m;

    public C0156b(Context context, int i, int i2) {
        this.f590e = context;
        this.f593h = LayoutInflater.from(context);
        this.f595j = i;
        this.f596k = i2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo861a(View view, int i) {
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
        ((ViewGroup) this.f597l).addView(view, i);
    }

    /* renamed from: a */
    public abstract void mo862a(C0169i iVar, ItemView itemView);

    /* renamed from: a */
    public abstract boolean mo863a(int i, C0169i iVar);

    public boolean collapseItemActionView(MenuBuilder menuBuilder, C0169i iVar) {
        return false;
    }

    public boolean expandItemActionView(MenuBuilder menuBuilder, C0169i iVar) {
        return false;
    }

    public int getId() {
        return this.f598m;
    }

    public MenuView getMenuView(ViewGroup viewGroup) {
        if (this.f597l == null) {
            this.f597l = (MenuView) this.f593h.inflate(this.f595j, viewGroup, false);
            this.f597l.initialize(this.f592g);
            updateMenuView(true);
        }
        return this.f597l;
    }

    public void initForMenu(Context context, MenuBuilder menuBuilder) {
        this.f591f = context;
        LayoutInflater.from(this.f591f);
        this.f592g = menuBuilder;
    }

    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        Callback callback = this.f594i;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, z);
        }
    }

    public boolean onSubMenuSelected(C0184o oVar) {
        Callback callback = this.f594i;
        if (callback != null) {
            return callback.onOpenSubMenu(oVar);
        }
        return false;
    }

    public void setCallback(Callback callback) {
        this.f594i = callback;
    }

    public void updateMenuView(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.f597l;
        if (viewGroup != null) {
            MenuBuilder menuBuilder = this.f592g;
            int i = 0;
            if (menuBuilder != null) {
                menuBuilder.mo737b();
                ArrayList n = this.f592g.mo766n();
                int size = n.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    C0169i iVar = (C0169i) n.get(i3);
                    if (mo863a(i2, iVar)) {
                        View childAt = viewGroup.getChildAt(i2);
                        C0169i itemData = childAt instanceof ItemView ? ((ItemView) childAt).getItemData() : null;
                        View a = mo857a(iVar, childAt, viewGroup);
                        if (iVar != itemData) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            mo861a(a, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (!mo864a(viewGroup, i)) {
                    i++;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo864a(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    /* renamed from: a */
    public Callback mo858a() {
        return this.f594i;
    }

    /* renamed from: a */
    public ItemView mo859a(ViewGroup viewGroup) {
        return (ItemView) this.f593h.inflate(this.f596k, viewGroup, false);
    }

    /* renamed from: a */
    public View mo857a(C0169i iVar, View view, ViewGroup viewGroup) {
        ItemView itemView;
        if (view instanceof ItemView) {
            itemView = (ItemView) view;
        } else {
            itemView = mo859a(viewGroup);
        }
        mo862a(iVar, itemView);
        return (View) itemView;
    }

    /* renamed from: a */
    public void mo860a(int i) {
        this.f598m = i;
    }
}
