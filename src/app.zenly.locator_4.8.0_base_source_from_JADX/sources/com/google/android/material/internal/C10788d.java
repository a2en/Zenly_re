package com.google.android.material.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: com.google.android.material.internal.d */
public class C10788d {

    /* renamed from: a */
    private static final ThreadLocal<Matrix> f28186a = new ThreadLocal<>();

    /* renamed from: b */
    private static final ThreadLocal<RectF> f28187b = new ThreadLocal<>();

    /* renamed from: a */
    public static void m27761a(ViewGroup viewGroup, View view, Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        m27763b(viewGroup, view, rect);
    }

    /* renamed from: b */
    public static void m27763b(ViewGroup viewGroup, View view, Rect rect) {
        Matrix matrix = (Matrix) f28186a.get();
        if (matrix == null) {
            matrix = new Matrix();
            f28186a.set(matrix);
        } else {
            matrix.reset();
        }
        m27762a((ViewParent) viewGroup, view, matrix);
        RectF rectF = (RectF) f28187b.get();
        if (rectF == null) {
            rectF = new RectF();
            f28187b.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    /* renamed from: a */
    private static void m27762a(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            m27762a(viewParent, view2, matrix);
            matrix.preTranslate((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
        }
        matrix.preTranslate((float) view.getLeft(), (float) view.getTop());
        if (!view.getMatrix().isIdentity()) {
            matrix.preConcat(view.getMatrix());
        }
    }
}
