package androidx.appcompat.app;

import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* renamed from: androidx.appcompat.app.d */
class C0127d {

    /* renamed from: a */
    private static Field f368a;

    /* renamed from: b */
    private static boolean f369b;

    /* renamed from: c */
    private static Class f370c;

    /* renamed from: d */
    private static boolean f371d;

    /* renamed from: e */
    private static Field f372e;

    /* renamed from: f */
    private static boolean f373f;

    /* renamed from: g */
    private static Field f374g;

    /* renamed from: h */
    private static boolean f375h;

    /* renamed from: a */
    static void m395a(Resources resources) {
        int i = VERSION.SDK_INT;
        if (i < 28) {
            if (i >= 24) {
                m399d(resources);
            } else if (i >= 23) {
                m398c(resources);
            } else if (i >= 21) {
                m397b(resources);
            }
        }
    }

    /* renamed from: b */
    private static void m397b(Resources resources) {
        Map map;
        String str = "ResourcesFlusher";
        if (!f369b) {
            try {
                f368a = Resources.class.getDeclaredField("mDrawableCache");
                f368a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(str, "Could not retrieve Resources#mDrawableCache field", e);
            }
            f369b = true;
        }
        Field field = f368a;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e(str, "Could not retrieve value from Resources#mDrawableCache", e2);
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    /* renamed from: c */
    private static void m398c(Resources resources) {
        String str = "ResourcesFlusher";
        if (!f369b) {
            try {
                f368a = Resources.class.getDeclaredField("mDrawableCache");
                f368a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(str, "Could not retrieve Resources#mDrawableCache field", e);
            }
            f369b = true;
        }
        Object obj = null;
        Field field = f368a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e(str, "Could not retrieve value from Resources#mDrawableCache", e2);
            }
        }
        if (obj != null) {
            m396a(obj);
        }
    }

    /* renamed from: d */
    private static void m399d(Resources resources) {
        Object obj;
        String str = "ResourcesFlusher";
        if (!f375h) {
            try {
                f374g = Resources.class.getDeclaredField("mResourcesImpl");
                f374g.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(str, "Could not retrieve Resources#mResourcesImpl field", e);
            }
            f375h = true;
        }
        Field field = f374g;
        if (field != null) {
            Object obj2 = null;
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e2) {
                Log.e(str, "Could not retrieve value from Resources#mResourcesImpl", e2);
                obj = null;
            }
            if (obj != null) {
                if (!f369b) {
                    try {
                        f368a = obj.getClass().getDeclaredField("mDrawableCache");
                        f368a.setAccessible(true);
                    } catch (NoSuchFieldException e3) {
                        Log.e(str, "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                    }
                    f369b = true;
                }
                Field field2 = f368a;
                if (field2 != null) {
                    try {
                        obj2 = field2.get(obj);
                    } catch (IllegalAccessException e4) {
                        Log.e(str, "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                    }
                }
                if (obj2 != null) {
                    m396a(obj2);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m396a(Object obj) {
        LongSparseArray longSparseArray;
        String str = "ResourcesFlusher";
        if (!f371d) {
            try {
                f370c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e(str, "Could not find ThemedResourceCache class", e);
            }
            f371d = true;
        }
        Class cls = f370c;
        if (cls != null) {
            if (!f373f) {
                try {
                    f372e = cls.getDeclaredField("mUnthemedEntries");
                    f372e.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e(str, "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                f373f = true;
            }
            Field field = f372e;
            if (field != null) {
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e3) {
                    Log.e(str, "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }
}
