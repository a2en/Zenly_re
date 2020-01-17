package com.google.android.material.internal;

import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: com.google.android.material.internal.e */
public class C10789e {

    /* renamed from: a */
    private static Method f28188a;

    /* renamed from: b */
    private static boolean f28189b;

    /* renamed from: a */
    public static boolean m27764a(DrawableContainer drawableContainer, ConstantState constantState) {
        return m27765b(drawableContainer, constantState);
    }

    /* renamed from: b */
    private static boolean m27765b(DrawableContainer drawableContainer, ConstantState constantState) {
        String str = "DrawableUtils";
        if (!f28189b) {
            try {
                f28188a = DrawableContainer.class.getDeclaredMethod("setConstantState", new Class[]{DrawableContainerState.class});
                f28188a.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.e(str, "Could not fetch setConstantState(). Oh well.");
            }
            f28189b = true;
        }
        Method method = f28188a;
        if (method != null) {
            try {
                method.invoke(drawableContainer, new Object[]{constantState});
                return true;
            } catch (Exception unused2) {
                Log.e(str, "Could not invoke setConstantState(). Oh well.");
            }
        }
        return false;
    }
}
