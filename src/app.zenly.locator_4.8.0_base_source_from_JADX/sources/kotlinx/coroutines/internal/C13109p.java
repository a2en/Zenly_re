package kotlinx.coroutines.internal;

import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.internal.p */
final /* synthetic */ class C13109p {
    static {
        Runtime.getRuntime().availableProcessors();
    }

    /* renamed from: a */
    public static final String m34220a(String str) {
        C12932j.m33818b(str, "propertyName");
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
