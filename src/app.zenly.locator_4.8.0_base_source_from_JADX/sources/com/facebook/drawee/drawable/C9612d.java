package com.facebook.drawee.drawable;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: com.facebook.drawee.drawable.d */
public class C9612d {
    /* renamed from: a */
    public static int m23590a(int i) {
        int i2 = i >>> 24;
        if (i2 == 255) {
            return -1;
        }
        return i2 == 0 ? -2 : -3;
    }

    /* renamed from: a */
    public static int m23591a(int i, int i2) {
        if (i2 == 255) {
            return i;
        }
        if (i2 == 0) {
            return i & 16777215;
        }
        return (i & 16777215) | ((((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24);
    }

    /* renamed from: a */
    public static Drawable m23592a(Drawable drawable) {
        if (drawable instanceof CloneableDrawable) {
            return ((CloneableDrawable) drawable).cloneDrawable();
        }
        ConstantState constantState = drawable.getConstantState();
        return constantState != null ? constantState.newDrawable() : null;
    }

    /* renamed from: a */
    public static void m23594a(Drawable drawable, Drawable drawable2) {
        if (drawable2 != null && drawable != null && drawable != drawable2) {
            drawable.setBounds(drawable2.getBounds());
            drawable.setChangingConfigurations(drawable2.getChangingConfigurations());
            drawable.setLevel(drawable2.getLevel());
            drawable.setVisible(drawable2.isVisible(), false);
            drawable.setState(drawable2.getState());
        }
    }

    /* renamed from: a */
    public static void m23595a(Drawable drawable, C9611c cVar) {
        if (drawable != null && cVar != null) {
            cVar.mo25966a(drawable);
        }
    }

    /* renamed from: a */
    public static void m23593a(Drawable drawable, Callback callback, TransformCallback transformCallback) {
        if (drawable != null) {
            drawable.setCallback(callback);
            if (drawable instanceof TransformAwareDrawable) {
                ((TransformAwareDrawable) drawable).setTransformCallback(transformCallback);
            }
        }
    }
}
