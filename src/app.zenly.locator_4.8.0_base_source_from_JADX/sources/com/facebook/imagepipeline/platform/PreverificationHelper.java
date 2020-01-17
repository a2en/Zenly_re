package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap.Config;
import com.facebook.soloader.C9911d;

@C9911d
class PreverificationHelper {
    PreverificationHelper() {
    }

    /* access modifiers changed from: 0000 */
    @TargetApi(26)
    @C9911d
    public boolean shouldUseHardwareBitmapConfig(Config config) {
        return config == Config.HARDWARE;
    }
}
