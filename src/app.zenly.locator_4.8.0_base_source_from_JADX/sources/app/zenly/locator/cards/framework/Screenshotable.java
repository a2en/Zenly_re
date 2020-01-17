package app.zenly.locator.cards.framework;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Drawable;

public interface Screenshotable {
    Bitmap takeScreenshot(Config config, Drawable drawable);
}
