package androidx.transition;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* renamed from: androidx.transition.c0 */
class C1224c0 {
    C1224c0() {
    }

    /* renamed from: a */
    public void mo6070a(View view, float f) {
        Float f2 = (Float) view.getTag(C1229f.save_non_transition_alpha);
        if (f2 != null) {
            view.setAlpha(f2.floatValue() * f);
        } else {
            view.setAlpha(f);
        }
    }

    /* renamed from: b */
    public float mo6071b(View view) {
        Float f = (Float) view.getTag(C1229f.save_non_transition_alpha);
        if (f != null) {
            return view.getAlpha() / f.floatValue();
        }
        return view.getAlpha();
    }

    /* renamed from: c */
    public void mo6072c(View view) {
        if (view.getTag(C1229f.save_non_transition_alpha) == null) {
            view.setTag(C1229f.save_non_transition_alpha, Float.valueOf(view.getAlpha()));
        }
    }

    /* renamed from: a */
    public void mo6069a(View view) {
        if (view.getVisibility() == 0) {
            view.setTag(C1229f.save_non_transition_alpha, null);
        }
    }

    /* renamed from: b */
    public void mo6067b(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo6067b(view2, matrix);
            matrix.postTranslate((float) view2.getScrollX(), (float) view2.getScrollY());
        }
        matrix.postTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }

    /* renamed from: a */
    public void mo6066a(View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            mo6066a(view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }

    /* renamed from: a */
    public void mo6068a(View view, int i, int i2, int i3, int i4) {
        view.setLeft(i);
        view.setTop(i2);
        view.setRight(i3);
        view.setBottom(i4);
    }
}
