package androidx.slidingpanelayout.widget;

import android.view.View;

public interface SlidingPaneLayout$PanelSlideListener {
    void onPanelClosed(View view);

    void onPanelOpened(View view);

    void onPanelSlide(View view, float f);
}
