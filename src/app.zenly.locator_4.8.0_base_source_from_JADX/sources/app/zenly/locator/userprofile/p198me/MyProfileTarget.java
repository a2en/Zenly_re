package app.zenly.locator.userprofile.p198me;

import android.app.Activity;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import app.zenly.locator.core.contracts.NavigationContract;
import app.zenly.locator.userprofile.p198me.view.UnlockAnimationView;

/* renamed from: app.zenly.locator.userprofile.me.MyProfileTarget */
public interface MyProfileTarget extends LifecycleOwner {
    View getContainerView();

    Activity getCurrentActivity();

    NavigationContract getNavigation();

    RecyclerView getRecyclerView();

    UnlockAnimationView getUnlockAnimationView();
}
