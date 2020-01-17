package com.github.chrisbanes.photoview;

import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

/* renamed from: com.github.chrisbanes.photoview.e */
class C9965e {

    /* renamed from: com.github.chrisbanes.photoview.e$a */
    static /* synthetic */ class C9966a {

        /* renamed from: a */
        static final /* synthetic */ int[] f26164a = new int[ScaleType.values().length];

        static {
            try {
                f26164a[ScaleType.MATRIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: a */
    static int m24968a(int i) {
        return (i & 65280) >> 8;
    }

    /* renamed from: a */
    static void m24969a(float f, float f2, float f3) {
        if (f >= f2) {
            throw new IllegalArgumentException("Minimum zoom has to be less than Medium zoom. Call setMinimumZoom() with a more appropriate value");
        } else if (f2 >= f3) {
            throw new IllegalArgumentException("Medium zoom has to be less than Maximum zoom. Call setMaximumZoom() with a more appropriate value");
        }
    }

    /* renamed from: a */
    static boolean m24971a(ImageView imageView) {
        return imageView.getDrawable() != null;
    }

    /* renamed from: a */
    static boolean m24970a(ScaleType scaleType) {
        if (scaleType == null) {
            return false;
        }
        if (C9966a.f26164a[scaleType.ordinal()] != 1) {
            return true;
        }
        throw new IllegalStateException("Matrix scale type is not supported");
    }
}
