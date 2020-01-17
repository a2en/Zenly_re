package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView.C1069g;

/* renamed from: androidx.recyclerview.widget.b */
public final class C1094b implements ListUpdateCallback {

    /* renamed from: e */
    private final C1069g f4201e;

    public C1094b(C1069g gVar) {
        this.f4201e = gVar;
    }

    public void onChanged(int i, int i2, Object obj) {
        this.f4201e.notifyItemRangeChanged(i, i2, obj);
    }

    public void onInserted(int i, int i2) {
        this.f4201e.notifyItemRangeInserted(i, i2);
    }

    public void onMoved(int i, int i2) {
        this.f4201e.notifyItemMoved(i, i2);
    }

    public void onRemoved(int i, int i2) {
        this.f4201e.notifyItemRangeRemoved(i, i2);
    }
}
