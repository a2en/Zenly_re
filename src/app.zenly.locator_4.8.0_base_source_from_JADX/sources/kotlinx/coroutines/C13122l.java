package kotlinx.coroutines;

import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.l */
final class C13122l {

    /* renamed from: a */
    public final Object f33716a;

    /* renamed from: b */
    public final Object f33717b;

    /* renamed from: c */
    public final NotCompleted f33718c;

    public C13122l(Object obj, Object obj2, NotCompleted notCompleted) {
        C12932j.m33818b(notCompleted, "token");
        this.f33716a = obj;
        this.f33717b = obj2;
        this.f33718c = notCompleted;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CompletedIdempotentResult[");
        sb.append(this.f33717b);
        sb.append(']');
        return sb.toString();
    }
}
