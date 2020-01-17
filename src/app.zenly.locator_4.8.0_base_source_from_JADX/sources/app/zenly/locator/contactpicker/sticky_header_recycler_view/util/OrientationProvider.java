package app.zenly.locator.contactpicker.sticky_header_recycler_view.util;

import androidx.recyclerview.widget.RecyclerView;

public interface OrientationProvider {
    int getOrientation(RecyclerView recyclerView);

    boolean isReverseLayout(RecyclerView recyclerView);
}
