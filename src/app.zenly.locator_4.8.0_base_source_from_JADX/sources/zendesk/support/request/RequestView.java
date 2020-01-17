package zendesk.support.request;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

interface RequestView {
    boolean hasUnsavedInput();

    boolean inflateMenu(MenuInflater menuInflater, Menu menu);

    boolean onOptionsItemClicked(MenuItem menuItem);
}
