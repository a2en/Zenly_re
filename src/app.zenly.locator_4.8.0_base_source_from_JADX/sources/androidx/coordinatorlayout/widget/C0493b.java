package androidx.coordinatorlayout.widget;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: androidx.coordinatorlayout.widget.b */
public class C0493b {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f2383a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f2384b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m2342a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m2344b(viewGroup, view, rect);
    }

    /* renamed from: b */
    static void m2344b(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = (Matrix) f2383a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f2383a.set(matrix);
        } else {
            matrix.reset();
        }
        m2343a((ViewParent) viewGroup, view, matrix);
        RectF rectF = (RectF) f2384b.get();
        if (rectF == null) {
            rectF = new RectF();
            f2384b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: a */
    private static void m2343a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m2343a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
