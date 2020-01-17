package androidx.core.view;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import java.lang.reflect.Field;

/* renamed from: androidx.core.view.d */
public final class C0642d {

    /* renamed from: a */
    private static Field f2809a;

    /* renamed from: b */
    private static boolean f2810b;

    /* renamed from: a */
    private static void m3004a(LayoutInflater layoutInflater, Factory2 factory2) {
        String str = "; inflation may have unexpected results.";
        String str2 = "LayoutInflaterCompatHC";
        if (!f2810b) {
            try {
                f2809a = LayoutInflater.class.getDeclaredField("mFactory2");
                f2809a.setAccessible(true);
            } catch (NoSuchFieldException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("forceSetFactory2 Could not find field 'mFactory2' on class ");
                sb.append(LayoutInflater.class.getName());
                sb.append(str);
                Log.e(str2, sb.toString(), e);
            }
            f2810b = true;
        }
        Field field = f2809a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("forceSetFactory2 could not set the Factory2 on LayoutInflater ");
                sb2.append(layoutInflater);
                sb2.append(str);
                Log.e(str2, sb2.toString(), e2);
            }
        }
    }

    /* renamed from: b */
    public static void m3005b(LayoutInflater layoutInflater, Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (VERSION.SDK_INT < 21) {
            Factory factory = layoutInflater.getFactory();
            if (factory instanceof Factory2) {
                m3004a(layoutInflater, (Factory2) factory);
            } else {
                m3004a(layoutInflater, factory2);
            }
        }
    }
}
