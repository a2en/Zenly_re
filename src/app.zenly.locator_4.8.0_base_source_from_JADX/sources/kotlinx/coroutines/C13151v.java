package kotlinx.coroutines;

import kotlin.C12918j;
import kotlin.C12918j.C12919a;
import kotlin.C12949k;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.v */
public final class C13151v {
    /* renamed from: a */
    public static final String m34330a(Continuation<?> continuation) {
        Object obj;
        C12932j.m33818b(continuation, "$this$toDebugString");
        if (continuation instanceof C13157y) {
            return continuation.toString();
        }
        try {
            C12919a aVar = C12918j.f33499e;
            StringBuilder sb = new StringBuilder();
            sb.append(continuation);
            sb.append('@');
            sb.append(m34331b(continuation));
            obj = sb.toString();
            C12918j.m33783a(obj);
        } catch (Throwable th) {
            C12919a aVar2 = C12918j.f33499e;
            obj = C12949k.m33848a(th);
            C12918j.m33783a(obj);
        }
        if (C12918j.m33784b(obj) != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(continuation.getClass().getName());
            sb2.append('@');
            sb2.append(m34331b(continuation));
            obj = sb2.toString();
        }
        return (String) obj;
    }

    /* renamed from: b */
    public static final String m34331b(Object obj) {
        C12932j.m33818b(obj, "$this$hexAddress");
        String hexString = Integer.toHexString(System.identityHashCode(obj));
        C12932j.m33815a((Object) hexString, "Integer.toHexString(System.identityHashCode(this))");
        return hexString;
    }

    /* renamed from: a */
    public static final String m34329a(Object obj) {
        C12932j.m33818b(obj, "$this$classSimpleName");
        String simpleName = obj.getClass().getSimpleName();
        C12932j.m33815a((Object) simpleName, "this::class.java.simpleName");
        return simpleName;
    }
}
