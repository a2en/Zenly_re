package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.google.android.gms.dynamic.IObjectWrapper.C10182a;
import java.lang.reflect.Field;

/* renamed from: com.google.android.gms.dynamic.b */
public final class C10186b<T> extends C10182a {

    /* renamed from: a */
    private final T f26743a;

    private C10186b(T t) {
        this.f26743a = t;
    }

    /* renamed from: a */
    public static <T> IObjectWrapper m25715a(T t) {
        return new C10186b(t);
    }

    /* renamed from: a */
    public static <T> T m25716a(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof C10186b) {
            return ((C10186b) iObjectWrapper).f26743a;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        } else {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }
}
