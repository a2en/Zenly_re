package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build.VERSION;
import android.util.Log;
import androidx.core.graphics.drawable.C0559a;
import androidx.core.graphics.drawable.WrappedDrawable;
import java.lang.reflect.Field;
import p214e.p215a.p218l.p219a.C7545c;

@SuppressLint({"RestrictedAPI"})
/* renamed from: androidx.appcompat.widget.m */
public class C0262m {

    /* renamed from: a */
    private static final int[] f1203a = {16842912};

    /* renamed from: b */
    private static final int[] f1204b = new int[0];

    /* renamed from: c */
    public static final Rect f1205c = new Rect();

    /* renamed from: d */
    private static Class<?> f1206d;

    static {
        if (VERSION.SDK_INT >= 18) {
            try {
                f1206d = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m1079a(Drawable drawable) {
        if (VERSION.SDK_INT < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (VERSION.SDK_INT < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (VERSION.SDK_INT < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (drawable instanceof DrawableContainer) {
            ConstantState constantState = drawable.getConstantState();
            if (constantState instanceof DrawableContainerState) {
                for (Drawable a : ((DrawableContainerState) constantState).getChildren()) {
                    if (!m1079a(a)) {
                        return false;
                    }
                }
            }
        } else if (drawable instanceof WrappedDrawable) {
            return m1079a(((WrappedDrawable) drawable).getWrappedDrawable());
        } else {
            if (drawable instanceof C7545c) {
                return m1079a(((C7545c) drawable).mo19401a());
            }
            if (drawable instanceof ScaleDrawable) {
                return m1079a(((ScaleDrawable) drawable).getDrawable());
            }
        }
        return true;
    }

    /* renamed from: b */
    static void m1080b(Drawable drawable) {
        if (VERSION.SDK_INT == 21) {
            if ("android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
                m1081c(drawable);
            }
        }
    }

    /* renamed from: c */
    private static void m1081c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f1203a);
        } else {
            drawable.setState(f1204b);
        }
        drawable.setState(state);
    }

    /* renamed from: d */
    public static Rect m1082d(Drawable drawable) {
        Field[] fields;
        if (f1206d != null) {
            try {
                Drawable h = C0559a.m2656h(drawable);
                Object invoke = h.getClass().getMethod("getOpticalInsets", new Class[0]).invoke(h, new Object[0]);
                if (invoke != null) {
                    Rect rect = new Rect();
                    for (Field field : f1206d.getFields()) {
                        String name = field.getName();
                        char c = 65535;
                        switch (name.hashCode()) {
                            case -1383228885:
                                if (name.equals("bottom")) {
                                    c = 3;
                                    break;
                                }
                                break;
                            case 115029:
                                if (name.equals("top")) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (name.equals("left")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (name.equals("right")) {
                                    c = 2;
                                    break;
                                }
                                break;
                        }
                        if (c == 0) {
                            rect.left = field.getInt(invoke);
                        } else if (c == 1) {
                            rect.top = field.getInt(invoke);
                        } else if (c == 2) {
                            rect.right = field.getInt(invoke);
                        } else if (c == 3) {
                            rect.bottom = field.getInt(invoke);
                        }
                    }
                    return rect;
                }
            } catch (Exception unused) {
                Log.e("DrawableUtils", "Couldn't obtain the optical insets. Ignoring.");
            }
        }
        return f1205c;
    }

    /* renamed from: a */
    public static Mode m1078a(int i, Mode mode) {
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
}
