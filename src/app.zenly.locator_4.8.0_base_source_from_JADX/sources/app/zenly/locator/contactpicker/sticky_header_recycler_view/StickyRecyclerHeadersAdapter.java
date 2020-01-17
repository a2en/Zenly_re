package app.zenly.locator.contactpicker.sticky_header_recycler_view;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.C1085v;

public interface StickyRecyclerHeadersAdapter<VH extends C1085v> {
    long getHeaderId(int i);

    int getItemCount();

    void onBindHeaderViewHolder(VH vh, int i);

    VH onCreateHeaderViewHolder(ViewGroup viewGroup);
}
