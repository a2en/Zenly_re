package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C12932j;

public final class JobCancellationException extends CancellationException implements CopyableThrowable<JobCancellationException> {

    /* renamed from: e */
    public final Job f33629e;

    public JobCancellationException(String str, Throwable th, Job job) {
        C12932j.m33818b(str, "message");
        C12932j.m33818b(job, "job");
        super(str);
        this.f33629e = job;
        if (th != null) {
            initCause(th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (kotlin.jvm.internal.C12932j.m33817a((java.lang.Object) r3.getCause(), (java.lang.Object) getCause()) != false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r3 == r2) goto L_0x0031
            boolean r0 = r3 instanceof kotlinx.coroutines.JobCancellationException
            if (r0 == 0) goto L_0x002f
            kotlinx.coroutines.JobCancellationException r3 = (kotlinx.coroutines.JobCancellationException) r3
            java.lang.String r0 = r3.getMessage()
            java.lang.String r1 = r2.getMessage()
            boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
            if (r0 == 0) goto L_0x002f
            kotlinx.coroutines.Job r0 = r3.f33629e
            kotlinx.coroutines.Job r1 = r2.f33629e
            boolean r0 = kotlin.jvm.internal.C12932j.m33817a(r0, r1)
            if (r0 == 0) goto L_0x002f
            java.lang.Throwable r3 = r3.getCause()
            java.lang.Throwable r0 = r2.getCause()
            boolean r3 = kotlin.jvm.internal.C12932j.m33817a(r3, r0)
            if (r3 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r3 = 0
            goto L_0x0032
        L_0x0031:
            r3 = 1
        L_0x0032:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobCancellationException.equals(java.lang.Object):boolean");
    }

    public Throwable fillInStackTrace() {
        if (!C13149u.m34326b()) {
            return this;
        }
        Throwable fillInStackTrace = super.fillInStackTrace();
        C12932j.m33815a((Object) fillInStackTrace, "super.fillInStackTrace()");
        return fillInStackTrace;
    }

    public int hashCode() {
        String message = getMessage();
        if (message != null) {
            int hashCode = ((message.hashCode() * 31) + this.f33629e.hashCode()) * 31;
            Throwable cause = getCause();
            return hashCode + (cause != null ? cause.hashCode() : 0);
        }
        C12932j.m33814a();
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        sb.append(this.f33629e);
        return sb.toString();
    }

    public JobCancellationException createCopy() {
        if (!C13149u.m34326b()) {
            return null;
        }
        String message = getMessage();
        if (message != null) {
            return new JobCancellationException(message, this, this.f33629e);
        }
        C12932j.m33814a();
        throw null;
    }
}
