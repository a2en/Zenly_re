package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.MenuView.ItemView;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.f */
public class C0166f extends BaseAdapter {

    /* renamed from: e */
    MenuBuilder f651e;

    /* renamed from: f */
    private int f652f = -1;

    /* renamed from: g */
    private boolean f653g;

    /* renamed from: h */
    private final boolean f654h;

    /* renamed from: i */
    private final LayoutInflater f655i;

    /* renamed from: j */
    private final int f656j;

    public C0166f(MenuBuilder menuBuilder, LayoutInflater layoutInflater, boolean z, int i) {
        this.f654h = z;
        this.f655i = layoutInflater;
        this.f651e = menuBuilder;
        this.f656j = i;
        mo898a();
    }

    /* renamed from: a */
    public void mo899a(boolean z) {
        this.f653g = z;
    }

    /* renamed from: b */
    public MenuBuilder mo900b() {
        return this.f651e;
    }

    public int getCount() {
        ArrayList j = this.f654h ? this.f651e.mo762j() : this.f651e.mo766n();
        if (this.f652f < 0) {
            return j.size();
        }
        return j.size() - 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f655i.inflate(this.f656j, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f651e.mo767o() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        ItemView itemView = (ItemView) view;
        if (this.f653g) {
            listMenuItemView.setForceShowIcon(true);
        }
        itemView.initialize(getItem(i), 0);
        return view;
    }

    public void notifyDataSetChanged() {
        mo898a();
        super.notifyDataSetChanged();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo898a() {
        C0169i f = this.f651e.mo754f();
        if (f != null) {
            ArrayList j = this.f651e.mo762j();
            int size = j.size();
            for (int i = 0; i < size; i++) {
                if (((C0169i) j.get(i)) == f) {
                    this.f652f = i;
                    return;
                }
            }
        }
        this.f652f = -1;
    }

    public C0169i getItem(int i) {
        ArrayList j = this.f654h ? this.f651e.mo762j() : this.f651e.mo766n();
        int i2 = this.f652f;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C0169i) j.get(i);
    }
}
