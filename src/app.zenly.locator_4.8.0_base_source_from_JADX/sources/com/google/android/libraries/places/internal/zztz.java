package com.google.android.libraries.places.internal;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

final class zztz implements PrivilegedExceptionAction<Unsafe> {
    zztz() {
    }

    public final /* synthetic */ Object run() throws Exception {
        Field[] declaredFields;
        Class<Unsafe> cls = Unsafe.class;
        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (cls.isInstance(obj)) {
                return (Unsafe) cls.cast(obj);
            }
        }
        return null;
    }
}
