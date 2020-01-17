package androidx.appcompat.app;

import android.content.Context;
import android.graphics.drawable.Drawable;

public interface ActionBarDrawerToggle$Delegate {
    Context getActionBarThemedContext();

    Drawable getThemeUpIndicator();

    boolean isNavigationVisible();

    void setActionBarDescription(int i);

    void setActionBarUpIndicator(Drawable drawable, int i);
}
