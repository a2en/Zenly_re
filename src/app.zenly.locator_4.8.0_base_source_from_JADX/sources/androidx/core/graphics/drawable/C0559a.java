package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.InsetDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.core.graphics.drawable.a */
public final class C0559a {

    /* renamed from: a */
    private static Method f2614a;

    /* renamed from: b */
    private static boolean f2615b;

    /* renamed from: c */
    private static Method f2616c;

    /* renamed from: d */
    private static boolean f2617d;

    /* renamed from: a */
    public static void m2646a(Drawable drawable, boolean z) {
        if (VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(z);
        }
    }

    /* renamed from: b */
    public static void m2650b(Drawable drawable, int i) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTint(i);
        } else if (drawable instanceof TintAwareDrawable) {
            ((TintAwareDrawable) drawable).setTint(i);
        }
    }

    /* renamed from: c */
    public static int m2651c(Drawable drawable) {
        if (VERSION.SDK_INT >= 19) {
            return drawable.getAlpha();
        }
        return 0;
    }

    /* renamed from: d */
    public static ColorFilter m2652d(Drawable drawable) {
        if (VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    /* renamed from: e */
    public static int m2653e(Drawable drawable) {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            return drawable.getLayoutDirection();
        }
        if (i >= 17) {
            String str = "DrawableCompat";
            if (!f2617d) {
                try {
                    f2616c = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                    f2616c.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i(str, "Failed to retrieve getLayoutDirection() method", e);
                }
                f2617d = true;
            }
            Method method = f2616c;
            if (method != null) {
                try {
                    return ((Integer) method.invoke(drawable, new Object[0])).intValue();
                } catch (Exception e2) {
                    Log.i(str, "Failed to invoke getLayoutDirection() via reflection", e2);
                    f2616c = null;
                }
            }
        }
        return 0;
    }

    /* renamed from: f */
    public static boolean m2654f(Drawable drawable) {
        if (VERSION.SDK_INT >= 19) {
            return drawable.isAutoMirrored();
        }
        return false;
    }

    @Deprecated
    /* renamed from: g */
    public static void m2655g(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    /* renamed from: h */
    public static <T extends Drawable> T m2656h(Drawable drawable) {
        return drawable instanceof WrappedDrawable ? ((WrappedDrawable) drawable).getWrappedDrawable() : drawable;
    }

    /* renamed from: i */
    public static Drawable m2657i(Drawable drawable) {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            return drawable;
        }
        return i >= 21 ? !(drawable instanceof TintAwareDrawable) ? new C0561c(drawable) : drawable : !(drawable instanceof TintAwareDrawable) ? new C0560b(drawable) : drawable;
    }

    /* renamed from: a */
    public static void m2640a(Drawable drawable, float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setHotspot(f, f2);
        }
    }

    /* renamed from: a */
    public static void m2641a(Drawable drawable, int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    /* renamed from: b */
    public static void m2649b(Drawable drawable) {
        int i = VERSION.SDK_INT;
        if (i >= 23) {
            drawable.clearColorFilter();
        } else if (i >= 21) {
            drawable.clearColorFilter();
            if (drawable instanceof InsetDrawable) {
                m2649b(((InsetDrawable) drawable).getDrawable());
            } else if (drawable instanceof WrappedDrawable) {
                m2649b(((WrappedDrawable) drawable).getWrappedDrawable());
            } else if (drawable instanceof DrawableContainer) {
                DrawableContainerState drawableContainerState = (DrawableContainerState) ((DrawableContainer) drawable).getConstantState();
                if (drawableContainerState != null) {
                    int childCount = drawableContainerState.getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        Drawable child = drawableContainerState.getChild(i2);
                        if (child != null) {
                            m2649b(child);
                        }
                    }
                }
            }
        } else {
            drawable.clearColorFilter();
        }
    }

    /* renamed from: a */
    public static void m2642a(Drawable drawable, ColorStateList colorStateList) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTintList(colorStateList);
        } else if (drawable instanceof TintAwareDrawable) {
            ((TintAwareDrawable) drawable).setTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m2645a(Drawable drawable, Mode mode) {
        if (VERSION.SDK_INT >= 21) {
            drawable.setTintMode(mode);
        } else if (drawable instanceof TintAwareDrawable) {
            ((TintAwareDrawable) drawable).setTintMode(mode);
        }
    }

    /* renamed from: a */
    public static void m2643a(Drawable drawable, Theme theme) {
        if (VERSION.SDK_INT >= 21) {
            drawable.applyTheme(theme);
        }
    }

    /* renamed from: a */
    public static boolean m2647a(Drawable drawable) {
        if (VERSION.SDK_INT >= 21) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    /* renamed from: a */
    public static void m2644a(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        if (VERSION.SDK_INT >= 21) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        } else {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        }
    }

    /* renamed from: a */
    public static boolean m2648a(Drawable drawable, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 23) {
            return drawable.setLayoutDirection(i);
        }
        if (i2 >= 17) {
            String str = "DrawableCompat";
            if (!f2615b) {
                try {
                    f2614a = Drawable.class.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                    f2614a.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i(str, "Failed to retrieve setLayoutDirection(int) method", e);
                }
                f2615b = true;
            }
            Method method = f2614a;
            if (method != null) {
                try {
                    method.invoke(drawable, new Object[]{Integer.valueOf(i)});
                    return true;
                } catch (Exception e2) {
                    Log.i(str, "Failed to invoke setLayoutDirection(int) via reflection", e2);
                    f2614a = null;
                }
            }
        }
        return false;
    }
}
