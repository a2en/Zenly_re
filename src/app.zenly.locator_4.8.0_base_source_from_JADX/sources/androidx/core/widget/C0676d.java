package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.ImageView;

/* renamed from: androidx.core.widget.d */
public class C0676d {
    /* renamed from: a */
    public static ColorStateList m3163a(ImageView imageView) {
        if (VERSION.SDK_INT >= 21) {
            return imageView.getImageTintList();
        }
        return imageView instanceof TintableImageSourceView ? ((TintableImageSourceView) imageView).getSupportImageTintList() : null;
    }

    /* renamed from: b */
    public static Mode m3166b(ImageView imageView) {
        if (VERSION.SDK_INT >= 21) {
            return imageView.getImageTintMode();
        }
        return imageView instanceof TintableImageSourceView ? ((TintableImageSourceView) imageView).getSupportImageTintMode() : null;
    }

    /* renamed from: a */
    public static void m3164a(ImageView imageView, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            imageView.setImageTintList(colorStateList);
            if (VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                if (drawable != null && imageView.getImageTintList() != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        } else if (imageView instanceof TintableImageSourceView) {
            ((TintableImageSourceView) imageView).setSupportImageTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m3165a(ImageView imageView, Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            imageView.setImageTintMode(mode);
            if (VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                if (drawable != null && imageView.getImageTintList() != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        } else if (imageView instanceof TintableImageSourceView) {
            ((TintableImageSourceView) imageView).setSupportImageTintMode(mode);
        }
    }
}
