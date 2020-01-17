package app.zenly.locator.experimental.map;

import android.app.Activity;
import android.view.View;
import app.zenly.locator.p207x.C6272z1;

public interface NextUnlockController {
    void onAttach(C6272z1 z1Var, Activity activity);

    void onCreateView(View view);

    void onDetach();

    void onDisplayGathering();

    void onEnterDiscoverMode();

    void onExitDiscoverMode();

    void onGatheringCleared();

    void onViewPagerScrolled(float f, int i);
}
