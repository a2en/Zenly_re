package com.facebook.imagepipeline.drawable;

import android.graphics.drawable.Drawable;
import com.facebook.imagepipeline.image.C9730c;

public interface DrawableFactory {
    Drawable createDrawable(C9730c cVar);

    boolean supportsImageType(C9730c cVar);
}
