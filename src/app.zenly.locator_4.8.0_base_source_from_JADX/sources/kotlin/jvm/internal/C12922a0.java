package kotlin.jvm.internal;

import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;

/* renamed from: kotlin.jvm.internal.a0 */
public class C12922a0 {
    /* renamed from: a */
    private static <T extends Throwable> T m33790a(T t) {
        C12932j.m33813a(t, C12922a0.class.getName());
        return t;
    }

    /* renamed from: b */
    public static boolean m33793b(Object obj, int i) {
        return (obj instanceof Function) && m33787a(obj) == i;
    }

    /* renamed from: a */
    public static void m33791a(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" cannot be cast to ");
        sb.append(str);
        m33792a(sb.toString());
        throw null;
    }

    /* renamed from: a */
    public static void m33792a(String str) {
        m33788a(new ClassCastException(str));
        throw null;
    }

    /* renamed from: a */
    public static ClassCastException m33788a(ClassCastException classCastException) {
        m33790a((T) classCastException);
        throw classCastException;
    }

    /* renamed from: a */
    public static int m33787a(Object obj) {
        if (obj instanceof FunctionBase) {
            return ((FunctionBase) obj).getArity();
        }
        if (obj instanceof Function0) {
            return 0;
        }
        if (obj instanceof Function1) {
            return 1;
        }
        if (obj instanceof Function2) {
            return 2;
        }
        if (obj instanceof Function3) {
            return 3;
        }
        if (obj instanceof Function4) {
            return 4;
        }
        if (obj instanceof Function5) {
            return 5;
        }
        if (obj instanceof Function6) {
            return 6;
        }
        if (obj instanceof Function7) {
            return 7;
        }
        if (obj instanceof Function8) {
            return 8;
        }
        if (obj instanceof Function9) {
            return 9;
        }
        if (obj instanceof Function10) {
            return 10;
        }
        if (obj instanceof Function11) {
            return 11;
        }
        if (obj instanceof Function12) {
            return 12;
        }
        if (obj instanceof Function13) {
            return 13;
        }
        if (obj instanceof Function14) {
            return 14;
        }
        if (obj instanceof Function15) {
            return 15;
        }
        if (obj instanceof Function16) {
            return 16;
        }
        if (obj instanceof Function17) {
            return 17;
        }
        if (obj instanceof Function18) {
            return 18;
        }
        if (obj instanceof Function19) {
            return 19;
        }
        if (obj instanceof Function20) {
            return 20;
        }
        if (obj instanceof Function21) {
            return 21;
        }
        return obj instanceof Function22 ? 22 : -1;
    }

    /* renamed from: a */
    public static Object m33789a(Object obj, int i) {
        if (obj == null || m33793b(obj, i)) {
            return obj;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("kotlin.jvm.functions.Function");
        sb.append(i);
        m33791a(obj, sb.toString());
        throw null;
    }
}
