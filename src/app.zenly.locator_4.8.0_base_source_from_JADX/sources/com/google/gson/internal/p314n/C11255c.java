package com.google.gson.internal.p314n;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* renamed from: com.google.gson.internal.n.c */
final class C11255c extends C11254b {

    /* renamed from: d */
    private static Class f29055d;

    /* renamed from: b */
    private final Object f29056b = m28853c();

    /* renamed from: c */
    private final Field f29057c = m28852b();

    C11255c() {
    }

    /* renamed from: c */
    private static Object m28853c() {
        try {
            f29055d = Class.forName("sun.misc.Unsafe");
            Field declaredField = f29055d.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo32652a(AccessibleObject accessibleObject) {
        if (!mo32653b(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Gson couldn't modify fields for ");
                sb.append(accessibleObject);
                sb.append("\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.");
                throw new JsonIOException(sb.toString(), e);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo32653b(AccessibleObject accessibleObject) {
        if (!(this.f29056b == null || this.f29057c == null)) {
            try {
                long longValue = ((Long) f29055d.getMethod("objectFieldOffset", new Class[]{Field.class}).invoke(this.f29056b, new Object[]{this.f29057c})).longValue();
                f29055d.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE}).invoke(this.f29056b, new Object[]{accessibleObject, Long.valueOf(longValue), Boolean.valueOf(true)});
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: b */
    private static Field m28852b() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }
}
