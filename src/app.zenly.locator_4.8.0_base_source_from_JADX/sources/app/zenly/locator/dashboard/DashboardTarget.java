package app.zenly.locator.dashboard;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.locator.core.contracts.NavigationContract;
import app.zenly.locator.dashboard.p074a0.C3294a;
import app.zenly.locator.dashboard.p074a0.C3299b;

public interface DashboardTarget extends LifecycleOwner {
    Activity getCurrentActivity();

    C3299b getDashboardState();

    NavigationContract getNavigation();

    RecyclerView getRecyclerView();

    boolean getResetDashboardOnClose();

    ScreenBar getScreenBar();

    C3294a getSearchBarController();

    void setDashboardState(C3299b bVar);

    void setNavigation(NavigationContract navigationContract);

    void setResetDashboardOnClose(boolean z);
}
