package com.facebook.drawee.drawable;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class ScalingUtils {

    public interface ScaleType {

        /* renamed from: a */
        public static final ScaleType f24938a = C9607i.f24954j;

        /* renamed from: b */
        public static final ScaleType f24939b = C9606h.f24953j;

        /* renamed from: c */
        public static final ScaleType f24940c = C9604f.f24951j;

        /* renamed from: d */
        public static final ScaleType f24941d = C9605g.f24952j;

        /* renamed from: e */
        public static final ScaleType f24942e = C9600b.f24947j;

        /* renamed from: f */
        public static final ScaleType f24943f = C9602d.f24949j;

        /* renamed from: g */
        public static final ScaleType f24944g = C9601c.f24948j;

        /* renamed from: h */
        public static final ScaleType f24945h = C9608j.f24955j;

        /* renamed from: i */
        public static final ScaleType f24946i = C9603e.f24950j;

        Matrix getTransform(Matrix matrix, Rect rect, int i, int i2, float f, float f2);
    }

    public interface StatefulScaleType {
        Object getState();
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$a */
    public static abstract class C9599a implements ScaleType {
        /* renamed from: a */
        public abstract void mo25925a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4);

        public Matrix getTransform(Matrix matrix, Rect rect, int i, int i2, float f, float f2) {
            int i3 = i;
            int i4 = i2;
            mo25925a(matrix, rect, i3, i4, f, f2, ((float) rect.width()) / ((float) i3), ((float) rect.height()) / ((float) i4));
            return matrix;
        }
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$b */
    private static class C9600b extends C9599a {

        /* renamed from: j */
        public static final ScaleType f24947j = new C9600b();

        private C9600b() {
        }

        /* renamed from: a */
        public void mo25925a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            matrix.setTranslate((float) ((int) (((float) rect.left) + (((float) (rect.width() - i)) * 0.5f) + 0.5f)), (float) ((int) (((float) rect.top) + (((float) (rect.height() - i2)) * 0.5f) + 0.5f)));
        }

        public String toString() {
            return "center";
        }
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$c */
    private static class C9601c extends C9599a {

        /* renamed from: j */
        public static final ScaleType f24948j = new C9601c();

        private C9601c() {
        }

        /* renamed from: a */
        public void mo25925a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5;
            float f6;
            if (f4 > f3) {
                float width = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * f4)) * 0.5f);
                f6 = (float) rect.top;
                f5 = width;
                f3 = f4;
            } else {
                f5 = (float) rect.left;
                f6 = ((((float) rect.height()) - (((float) i2) * f3)) * 0.5f) + ((float) rect.top);
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (f6 + 0.5f)));
        }

        public String toString() {
            return "center_crop";
        }
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$d */
    private static class C9602d extends C9599a {

        /* renamed from: j */
        public static final ScaleType f24949j = new C9602d();

        private C9602d() {
        }

        /* renamed from: a */
        public void mo25925a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(Math.min(f3, f4), 1.0f);
            float width = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * min)) * 0.5f);
            float height = ((float) rect.top) + ((((float) rect.height()) - (((float) i2) * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height + 0.5f)));
        }

        public String toString() {
            return "center_inside";
        }
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$e */
    private static class C9603e extends C9599a {

        /* renamed from: j */
        public static final ScaleType f24950j = new C9603e();

        private C9603e() {
        }

        /* renamed from: a */
        public void mo25925a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float f5 = (float) rect.left;
            float height = ((float) rect.top) + (((float) rect.height()) - (((float) i2) * min));
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (height + 0.5f)));
        }

        public String toString() {
            return "fit_bottom_start";
        }
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$f */
    private static class C9604f extends C9599a {

        /* renamed from: j */
        public static final ScaleType f24951j = new C9604f();

        private C9604f() {
        }

        /* renamed from: a */
        public void mo25925a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float width = ((float) rect.left) + ((((float) rect.width()) - (((float) i) * min)) * 0.5f);
            float height = ((float) rect.top) + ((((float) rect.height()) - (((float) i2) * min)) * 0.5f);
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height + 0.5f)));
        }

        public String toString() {
            return "fit_center";
        }
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$g */
    private static class C9605g extends C9599a {

        /* renamed from: j */
        public static final ScaleType f24952j = new C9605g();

        private C9605g() {
        }

        /* renamed from: a */
        public void mo25925a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float width = ((float) rect.left) + (((float) rect.width()) - (((float) i) * min));
            float height = ((float) rect.top) + (((float) rect.height()) - (((float) i2) * min));
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (width + 0.5f)), (float) ((int) (height + 0.5f)));
        }

        public String toString() {
            return "fit_end";
        }
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$h */
    private static class C9606h extends C9599a {

        /* renamed from: j */
        public static final ScaleType f24953j = new C9606h();

        private C9606h() {
        }

        /* renamed from: a */
        public void mo25925a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float min = Math.min(f3, f4);
            float f5 = (float) rect.left;
            float f6 = (float) rect.top;
            matrix.setScale(min, min);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (f6 + 0.5f)));
        }

        public String toString() {
            return "fit_start";
        }
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$i */
    private static class C9607i extends C9599a {

        /* renamed from: j */
        public static final ScaleType f24954j = new C9607i();

        private C9607i() {
        }

        /* renamed from: a */
        public void mo25925a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5 = (float) rect.left;
            float f6 = (float) rect.top;
            matrix.setScale(f3, f4);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (f6 + 0.5f)));
        }

        public String toString() {
            return "fit_xy";
        }
    }

    /* renamed from: com.facebook.drawee.drawable.ScalingUtils$j */
    private static class C9608j extends C9599a {

        /* renamed from: j */
        public static final ScaleType f24955j = new C9608j();

        private C9608j() {
        }

        /* renamed from: a */
        public void mo25925a(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
            float f5;
            float f6;
            if (f4 > f3) {
                float f7 = ((float) i) * f4;
                f5 = ((float) rect.left) + Math.max(Math.min((((float) rect.width()) * 0.5f) - (f * f7), 0.0f), ((float) rect.width()) - f7);
                f6 = (float) rect.top;
                f3 = f4;
            } else {
                f5 = (float) rect.left;
                float f8 = ((float) i2) * f3;
                float height = (((float) rect.height()) * 0.5f) - (f2 * f8);
                f6 = Math.max(Math.min(height, 0.0f), ((float) rect.height()) - f8) + ((float) rect.top);
            }
            matrix.setScale(f3, f3);
            matrix.postTranslate((float) ((int) (f5 + 0.5f)), (float) ((int) (f6 + 0.5f)));
        }

        public String toString() {
            return "focus_crop";
        }
    }

    /* renamed from: a */
    public static C9623m m23570a(Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof C9623m) {
            return (C9623m) drawable;
        }
        if (drawable instanceof DrawableParent) {
            return m23570a(((DrawableParent) drawable).getDrawable());
        }
        if (drawable instanceof C9609a) {
            C9609a aVar = (C9609a) drawable;
            int a = aVar.mo25941a();
            for (int i = 0; i < a; i++) {
                C9623m a2 = m23570a(aVar.mo25942a(i));
                if (a2 != null) {
                    return a2;
                }
            }
        }
        return null;
    }
}
