package androidx.appcompat.widget;

import android.view.MenuItem;

public class PopupMenu {

    public interface OnDismissListener {
        void onDismiss(PopupMenu popupMenu);
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }
}
