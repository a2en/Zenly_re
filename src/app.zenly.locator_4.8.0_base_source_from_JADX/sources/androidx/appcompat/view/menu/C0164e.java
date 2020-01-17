package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.MenuPresenter.Callback;
import androidx.appcompat.view.menu.MenuView.ItemView;
import java.util.ArrayList;
import p214e.p215a.C7527g;

/* renamed from: androidx.appcompat.view.menu.e */
public class C0164e implements MenuPresenter, OnItemClickListener {

    /* renamed from: e */
    Context f639e;

    /* renamed from: f */
    LayoutInflater f640f;

    /* renamed from: g */
    MenuBuilder f641g;

    /* renamed from: h */
    ExpandedMenuView f642h;

    /* renamed from: i */
    int f643i;

    /* renamed from: j */
    int f644j;

    /* renamed from: k */
    int f645k;

    /* renamed from: l */
    private Callback f646l;

    /* renamed from: m */
    C0165a f647m;

    /* renamed from: n */
    private int f648n;

    /* renamed from: androidx.appcompat.view.menu.e$a */
    private class C0165a extends BaseAdapter {

        /* renamed from: e */
        private int f649e = -1;

        public C0165a() {
            mo892a();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo892a() {
            C0169i f = C0164e.this.f641g.mo754f();
            if (f != null) {
                ArrayList j = C0164e.this.f641g.mo762j();
                int size = j.size();
                for (int i = 0; i < size; i++) {
                    if (((C0169i) j.get(i)) == f) {
                        this.f649e = i;
                        return;
                    }
                }
            }
            this.f649e = -1;
        }

        public int getCount() {
            int size = C0164e.this.f641g.mo762j().size() - C0164e.this.f643i;
            return this.f649e < 0 ? size : size - 1;
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0164e eVar = C0164e.this;
                view = eVar.f640f.inflate(eVar.f645k, viewGroup, false);
            }
            ((ItemView) view).initialize(getItem(i), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            mo892a();
            super.notifyDataSetChanged();
        }

        public C0169i getItem(int i) {
            ArrayList j = C0164e.this.f641g.mo762j();
            int i2 = i + C0164e.this.f643i;
            int i3 = this.f649e;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return (C0169i) j.get(i2);
        }
    }

    public C0164e(Context context, int i) {
        this(i, 0);
        this.f639e = context;
        this.f640f = LayoutInflater.from(this.f639e);
    }

    /* renamed from: a */
    public ListAdapter mo888a() {
        if (this.f647m == null) {
            this.f647m = new C0165a();
        }
        return this.f647m;
    }

    /* renamed from: b */
    public void mo890b(Bundle bundle) {
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.f642h;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    public boolean collapseItemActionView(MenuBuilder menuBuilder, C0169i iVar) {
        return false;
    }

    public boolean expandItemActionView(MenuBuilder menuBuilder, C0169i iVar) {
        return false;
    }

    public boolean flagActionItems() {
        return false;
    }

    public int getId() {
        return this.f648n;
    }

    public MenuView getMenuView(ViewGroup viewGroup) {
        if (this.f642h == null) {
            this.f642h = (ExpandedMenuView) this.f640f.inflate(C7527g.abc_expanded_menu_layout, viewGroup, false);
            if (this.f647m == null) {
                this.f647m = new C0165a();
            }
            this.f642h.setAdapter(this.f647m);
            this.f642h.setOnItemClickListener(this);
        }
        return this.f642h;
    }

    public void initForMenu(Context context, MenuBuilder menuBuilder) {
        int i = this.f644j;
        if (i != 0) {
            this.f639e = new ContextThemeWrapper(context, i);
            this.f640f = LayoutInflater.from(this.f639e);
        } else if (this.f639e != null) {
            this.f639e = context;
            if (this.f640f == null) {
                this.f640f = LayoutInflater.from(this.f639e);
            }
        }
        this.f641g = menuBuilder;
        C0165a aVar = this.f647m;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        Callback callback = this.f646l;
        if (callback != null) {
            callback.onCloseMenu(menuBuilder, z);
        }
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.f641g.mo724a((MenuItem) this.f647m.getItem(i), (MenuPresenter) this, 0);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        mo889a((Bundle) parcelable);
    }

    public Parcelable onSaveInstanceState() {
        if (this.f642h == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        mo890b(bundle);
        return bundle;
    }

    public boolean onSubMenuSelected(C0184o oVar) {
        if (!oVar.hasVisibleItems()) {
            return false;
        }
        new C0167g(oVar).mo907a(null);
        Callback callback = this.f646l;
        if (callback != null) {
            callback.onOpenSubMenu(oVar);
        }
        return true;
    }

    public void setCallback(Callback callback) {
        this.f646l = callback;
    }

    public void updateMenuView(boolean z) {
        C0165a aVar = this.f647m;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public C0164e(int i, int i2) {
        this.f645k = i;
        this.f644j = i2;
    }

    /* renamed from: a */
    public void mo889a(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f642h.restoreHierarchyState(sparseParcelableArray);
        }
    }
}
