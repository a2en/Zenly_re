package app.zenly.android.feature.descendants.recycler;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.C1085v;

public interface ViewRenderer<T, VH extends C1085v> {
    void bindView(C1406a<? extends T> aVar, VH vh);

    VH createViewHolder(ViewGroup viewGroup);

    int getType();
}
