package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.coroutines.jvm.internal.e */
public final class C12888e {
    /* renamed from: a */
    private static final C12887d m33739a(C12884a aVar) {
        return (C12887d) aVar.getClass().getAnnotation(C12887d.class);
    }

    /* renamed from: b */
    private static final int m33741b(C12884a aVar) {
        try {
            Field declaredField = aVar.getClass().getDeclaredField("label");
            C12932j.m33815a((Object) declaredField, "field");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(aVar);
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: c */
    public static final StackTraceElement m33742c(C12884a aVar) {
        int i;
        String str;
        C12932j.m33818b(aVar, "$this$getStackTraceElementImpl");
        C12887d a = m33739a(aVar);
        if (a == null) {
            return null;
        }
        m33740a(1, a.mo37199v());
        int b = m33741b(aVar);
        if (b < 0) {
            i = -1;
        } else {
            i = a.mo37197l()[b];
        }
        String a2 = C12890g.f33464c.mo37200a(aVar);
        if (a2 == null) {
            str = a.mo37195c();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            sb.append('/');
            sb.append(a.mo37195c());
            str = sb.toString();
        }
        return new StackTraceElement(str, a.mo37198m(), a.mo37196f(), i);
    }

    /* renamed from: a */
    private static final void m33740a(int i, int i2) {
        if (i2 > i) {
            StringBuilder sb = new StringBuilder();
            sb.append("Debug metadata version mismatch. Expected: ");
            sb.append(i);
            sb.append(", got ");
            sb.append(i2);
            sb.append(". Please update the Kotlin standard library.");
            throw new IllegalStateException(sb.toString().toString());
        }
    }
}
