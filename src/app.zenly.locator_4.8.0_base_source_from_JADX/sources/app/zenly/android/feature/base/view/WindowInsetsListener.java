package app.zenly.android.feature.base.view;

import android.graphics.Rect;
import android.view.View;

public interface WindowInsetsListener {
    void onWindowInsetsChanged(View view, Rect rect);
}
