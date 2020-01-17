package com.google.android.material.internal;

import android.graphics.PorterDuff.Mode;
import android.view.View;
import androidx.core.view.ViewCompat;

/* renamed from: com.google.android.material.internal.h */
public class C10794h {
    /* renamed from: a */
    public static Mode m27780a(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: a */
    public static boolean m27781a(View view) {
        return ViewCompat.m2862o(view) == 1;
    }
}
