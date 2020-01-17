package com.facebook.imagepipeline.animated.factory;

import android.graphics.Bitmap.Config;
import com.facebook.imagepipeline.common.C9698b;
import com.facebook.imagepipeline.image.C9730c;
import com.facebook.imagepipeline.image.C9732e;

public interface AnimatedImageFactory {
    C9730c decodeGif(C9732e eVar, C9698b bVar, Config config);

    C9730c decodeWebP(C9732e eVar, C9698b bVar, Config config);
}
