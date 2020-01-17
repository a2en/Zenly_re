package app.zenly.locator.inbox;

import android.app.Activity;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import app.zenly.android.feature.polenta.widget.SearchBar;
import app.zenly.locator.core.contracts.NavigationContract;
import app.zenly.locator.view.ScreenBarBottomSheetBehavior;

public interface InboxTarget extends LifecycleOwner {
    ScreenBarBottomSheetBehavior<View> getBottomSheetBehavior();

    NavigationContract getNavigation();

    RecyclerView getRecyclerView();

    SearchBar getSearch();

    Activity getTargetActivity();
}
