package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow.OnDismissListener;

/* renamed from: androidx.appcompat.view.menu.k */
abstract class C0177k implements ShowableListMenu, MenuPresenter, OnItemClickListener {

    /* renamed from: e */
    private Rect f703e;

    C0177k() {
    }

    /* renamed from: a */
    public abstract void mo870a(int i);

    /* renamed from: a */
    public void mo1034a(Rect rect) {
        this.f703e = rect;
    }

    /* renamed from: a */
    public abstract void mo871a(View view);

    /* renamed from: a */
    public abstract void mo872a(OnDismissListener onDismissListener);

    /* renamed from: a */
    public abstract void mo873a(MenuBuilder menuBuilder);

    /* renamed from: a */
    public abstract void mo874a(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo875a() {
        return true;
    }

    /* renamed from: b */
    public Rect mo1035b() {
        return this.f703e;
    }

    /* renamed from: b */
    public abstract void mo876b(int i);

    /* renamed from: b */
    public abstract void mo877b(boolean z);

    /* renamed from: c */
    public abstract void mo878c(int i);

    public boolean collapseItemActionView(MenuBuilder menuBuilder, C0169i iVar) {
        return false;
    }

    public boolean expandItemActionView(MenuBuilder menuBuilder, C0169i iVar) {
        return false;
    }

    public int getId() {
        return 0;
    }

    public MenuView getMenuView(ViewGroup viewGroup) {
        throw new UnsupportedOperationException("MenuPopups manage their own views");
    }

    public void initForMenu(Context context, MenuBuilder menuBuilder) {
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        m683a(listAdapter).f651e.mo724a((MenuItem) listAdapter.getItem(i), (MenuPresenter) this, mo875a() ? 0 : 4);
    }

    /* renamed from: a */
    protected static int m682a(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        ViewGroup viewGroup2 = viewGroup;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup2 == null) {
                viewGroup2 = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup2);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: b */
    protected static boolean m684b(MenuBuilder menuBuilder) {
        int size = menuBuilder.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menuBuilder.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    protected static C0166f m683a(ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (C0166f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        }
        return (C0166f) listAdapter;
    }
}
