package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.j */
public final class C12918j<T> implements Serializable {

    /* renamed from: e */
    public static final C12919a f33499e = new C12919a(null);

    /* renamed from: kotlin.j$a */
    public static final class C12919a {
        private C12919a() {
        }

        public /* synthetic */ C12919a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: kotlin.j$b */
    public static final class C12920b implements Serializable {

        /* renamed from: e */
        public final Throwable f33500e;

        public C12920b(Throwable th) {
            C12932j.m33818b(th, "exception");
            this.f33500e = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C12920b) && C12932j.m33817a((Object) this.f33500e, (Object) ((C12920b) obj).f33500e);
        }

        public int hashCode() {
            return this.f33500e.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Failure(");
            sb.append(this.f33500e);
            sb.append(')');
            return sb.toString();
        }
    }

    /* renamed from: a */
    public static Object m33783a(Object obj) {
        return obj;
    }

    /* renamed from: b */
    public static final Throwable m33784b(Object obj) {
        if (obj instanceof C12920b) {
            return ((C12920b) obj).f33500e;
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m33785c(Object obj) {
        return obj instanceof C12920b;
    }

    /* renamed from: d */
    public static final boolean m33786d(Object obj) {
        return !(obj instanceof C12920b);
    }
}
