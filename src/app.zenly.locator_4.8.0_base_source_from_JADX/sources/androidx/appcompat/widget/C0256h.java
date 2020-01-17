package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.graphics.drawable.WrappedDrawable;

/* renamed from: androidx.appcompat.widget.h */
class C0256h {

    /* renamed from: c */
    private static final int[] f1162c = {16843067, 16843068};

    /* renamed from: a */
    private final ProgressBar f1163a;

    /* renamed from: b */
    private Bitmap f1164b;

    C0256h(ProgressBar progressBar) {
        this.f1163a = progressBar;
    }

    /* renamed from: b */
    private Shape mo1917b() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1914a(AttributeSet attributeSet, int i) {
        C0291z a = C0291z.m1196a(this.f1163a.getContext(), attributeSet, f1162c, i, 0);
        Drawable c = a.mo2108c(0);
        if (c != null) {
            this.f1163a.setIndeterminateDrawable(mo1916a(c));
        }
        Drawable c2 = a.mo2108c(1);
        if (c2 != null) {
            this.f1163a.setProgressDrawable(m1005a(c2, false));
        }
        a.mo2102a();
    }

    /* renamed from: a */
    private Drawable m1005a(Drawable drawable, boolean z) {
        if (drawable instanceof WrappedDrawable) {
            WrappedDrawable wrappedDrawable = (WrappedDrawable) drawable;
            Drawable wrappedDrawable2 = wrappedDrawable.getWrappedDrawable();
            if (wrappedDrawable2 != null) {
                wrappedDrawable.setWrappedDrawable(m1005a(wrappedDrawable2, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = m1005a(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f1164b == null) {
                this.f1164b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(mo1917b());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, TileMode.REPEAT, TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            drawable = z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    /* renamed from: a */
    private Drawable mo1916a(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable a = m1005a(animationDrawable.getFrame(i), true);
            a.setLevel(10000);
            animationDrawable2.addFrame(a, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Bitmap mo1913a() {
        return this.f1164b;
    }
}
