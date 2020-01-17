package kotlin.jvm.internal;

import java.util.Arrays;
import kotlin.KotlinNullPointerException;
import kotlin.UninitializedPropertyAccessException;

/* renamed from: kotlin.jvm.internal.j */
public class C12932j {
    private C12932j() {
    }

    /* renamed from: a */
    public static int m33811a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    /* renamed from: a */
    public static void m33814a() {
        KotlinNullPointerException kotlinNullPointerException = new KotlinNullPointerException();
        m33812a((T) kotlinNullPointerException);
        throw kotlinNullPointerException;
    }

    /* renamed from: b */
    public static void m33819b(String str) {
        UninitializedPropertyAccessException uninitializedPropertyAccessException = new UninitializedPropertyAccessException(str);
        m33812a((T) uninitializedPropertyAccessException);
        throw uninitializedPropertyAccessException;
    }

    /* renamed from: c */
    public static void m33820c(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("lateinit property ");
        sb.append(str);
        sb.append(" has not been initialized");
        m33819b(sb.toString());
        throw null;
    }

    /* renamed from: a */
    public static void m33815a(Object obj, String str) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" must not be null");
            IllegalStateException illegalStateException = new IllegalStateException(sb.toString());
            m33812a((T) illegalStateException);
            throw illegalStateException;
        }
    }

    /* renamed from: b */
    public static void m33818b(Object obj, String str) {
        if (obj == null) {
            m33816a(str);
            throw null;
        }
    }

    /* renamed from: a */
    private static void m33816a(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        StringBuilder sb = new StringBuilder();
        sb.append("Parameter specified as non-null is null: method ");
        sb.append(className);
        sb.append(".");
        sb.append(methodName);
        sb.append(", parameter ");
        sb.append(str);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(sb.toString());
        m33812a((T) illegalArgumentException);
        throw illegalArgumentException;
    }

    /* renamed from: a */
    public static boolean m33817a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    /* renamed from: a */
    private static <T extends Throwable> T m33812a(T t) {
        m33813a(t, C12932j.class.getName());
        return t;
    }

    /* renamed from: a */
    static <T extends Throwable> T m33813a(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }
}
