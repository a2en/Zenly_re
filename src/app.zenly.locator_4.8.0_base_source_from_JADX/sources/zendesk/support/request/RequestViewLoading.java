package zendesk.support.request;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

class RequestViewLoading extends View implements RequestView {
    public RequestViewLoading(Context context) {
        super(context);
    }

    public boolean hasUnsavedInput() {
        return false;
    }

    public boolean inflateMenu(MenuInflater menuInflater, Menu menu) {
        return false;
    }

    public boolean onOptionsItemClicked(MenuItem menuItem) {
        return false;
    }

    public RequestViewLoading(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RequestViewLoading(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
