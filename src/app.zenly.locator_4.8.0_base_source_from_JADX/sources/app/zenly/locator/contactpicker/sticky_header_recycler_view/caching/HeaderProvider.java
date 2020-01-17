package app.zenly.locator.contactpicker.sticky_header_recycler_view.caching;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public interface HeaderProvider {
    View getHeader(RecyclerView recyclerView, int i);

    void invalidate();
}
