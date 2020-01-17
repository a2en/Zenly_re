package com.facebook.drawee.view;

import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;

/* renamed from: com.facebook.drawee.view.a */
public class C9624a {

    /* renamed from: com.facebook.drawee.view.a$a */
    public static class C9625a {

        /* renamed from: a */
        public int f25081a;

        /* renamed from: b */
        public int f25082b;
    }

    /* renamed from: a */
    public static void m23643a(C9625a aVar, float f, LayoutParams layoutParams, int i, int i2) {
        if (f > 0.0f && layoutParams != null) {
            if (m23644a(layoutParams.height)) {
                aVar.f25082b = MeasureSpec.makeMeasureSpec(View.resolveSize((int) ((((float) (MeasureSpec.getSize(aVar.f25081a) - i)) / f) + ((float) i2)), aVar.f25082b), 1073741824);
            } else if (m23644a(layoutParams.width)) {
                aVar.f25081a = MeasureSpec.makeMeasureSpec(View.resolveSize((int) ((((float) (MeasureSpec.getSize(aVar.f25082b) - i2)) * f) + ((float) i)), aVar.f25081a), 1073741824);
            }
        }
    }

    /* renamed from: a */
    private static boolean m23644a(int i) {
        return i == 0 || i == -2;
    }
}
