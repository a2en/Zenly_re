package androidx.appcompat.widget;

import android.content.Intent;
import androidx.core.view.ActionProvider;

public class ShareActionProvider extends ActionProvider {

    public interface OnShareTargetSelectedListener {
        boolean onShareTargetSelected(ShareActionProvider shareActionProvider, Intent intent);
    }
}
