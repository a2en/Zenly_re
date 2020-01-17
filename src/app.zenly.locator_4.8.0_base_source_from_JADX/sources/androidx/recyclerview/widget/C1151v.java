package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1148u.C1150b;
import androidx.recyclerview.widget.RecyclerView.C1069g;

/* renamed from: androidx.recyclerview.widget.v */
public abstract class C1151v<T2> extends C1150b<T2> {

    /* renamed from: e */
    final C1069g f4373e;

    public C1151v(C1069g gVar) {
        this.f4373e = gVar;
    }

    public void onChanged(int i, int i2, Object obj) {
        this.f4373e.notifyItemRangeChanged(i, i2, obj);
    }

    public void onInserted(int i, int i2) {
        this.f4373e.notifyItemRangeInserted(i, i2);
    }

    public void onMoved(int i, int i2) {
        this.f4373e.notifyItemMoved(i, i2);
    }

    public void onRemoved(int i, int i2) {
        this.f4373e.notifyItemRangeRemoved(i, i2);
    }
}
