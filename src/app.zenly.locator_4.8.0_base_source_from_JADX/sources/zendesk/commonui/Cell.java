package zendesk.commonui;

import android.app.Activity;
import android.view.View;

public interface Cell {
    boolean areContentsTheSame(Cell cell);

    boolean areItemsTheSame(Cell cell);

    void bind(View view, Activity activity);

    String getId();

    int getLayoutRes();
}
