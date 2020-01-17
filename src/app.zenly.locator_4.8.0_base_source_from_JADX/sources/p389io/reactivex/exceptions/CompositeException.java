package p389io.reactivex.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: io.reactivex.exceptions.CompositeException */
public final class CompositeException extends RuntimeException {
    private static final long serialVersionUID = 3026362227162912146L;

    /* renamed from: e */
    private final List<Throwable> f31946e;

    /* renamed from: f */
    private final String f31947f;

    /* renamed from: g */
    private Throwable f31948g;

    /* renamed from: io.reactivex.exceptions.CompositeException$a */
    static final class C12281a extends RuntimeException {
        private static final long serialVersionUID = 3875212506787802066L;

        C12281a() {
        }

        public String getMessage() {
            return "Chain of Causes for CompositeException In Order Received =>";
        }
    }

    /* renamed from: io.reactivex.exceptions.CompositeException$b */
    static abstract class C12282b {
        C12282b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo36521a(Object obj);
    }

    /* renamed from: io.reactivex.exceptions.CompositeException$c */
    static final class C12283c extends C12282b {

        /* renamed from: a */
        private final PrintStream f31949a;

        C12283c(PrintStream printStream) {
            this.f31949a = printStream;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36521a(Object obj) {
            this.f31949a.println(obj);
        }
    }

    /* renamed from: io.reactivex.exceptions.CompositeException$d */
    static final class C12284d extends C12282b {

        /* renamed from: a */
        private final PrintWriter f31950a;

        C12284d(PrintWriter printWriter) {
            this.f31950a = printWriter;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo36521a(Object obj) {
            this.f31950a.println(obj);
        }
    }

    public CompositeException(Throwable... thArr) {
        this((Iterable<? extends Throwable>) thArr == null ? Collections.singletonList(new NullPointerException("exceptions was null")) : Arrays.asList(thArr));
    }

    /* renamed from: b */
    private List<Throwable> m32741b(Throwable th) {
        ArrayList arrayList = new ArrayList();
        Throwable cause = th.getCause();
        if (cause != null && cause != th) {
            while (true) {
                arrayList.add(cause);
                Throwable cause2 = cause.getCause();
                if (cause2 == null || cause2 == cause) {
                    break;
                }
                cause = cause2;
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public List<Throwable> mo36514a() {
        return this.f31946e;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:10|(4:13|(2:15|33)(2:16|34)|32|11)|17|18|19|20|31) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0055 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Throwable getCause() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.lang.Throwable r0 = r8.f31948g     // Catch:{ all -> 0x0060 }
            if (r0 != 0) goto L_0x005c
            io.reactivex.exceptions.CompositeException$a r0 = new io.reactivex.exceptions.CompositeException$a     // Catch:{ all -> 0x0060 }
            r0.<init>()     // Catch:{ all -> 0x0060 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0060 }
            r1.<init>()     // Catch:{ all -> 0x0060 }
            java.util.List<java.lang.Throwable> r2 = r8.f31946e     // Catch:{ all -> 0x0060 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0060 }
            r3 = r0
        L_0x0016:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0060 }
            if (r4 == 0) goto L_0x005a
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0060 }
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch:{ all -> 0x0060 }
            boolean r5 = r1.contains(r4)     // Catch:{ all -> 0x0060 }
            if (r5 == 0) goto L_0x0029
            goto L_0x0016
        L_0x0029:
            r1.add(r4)     // Catch:{ all -> 0x0060 }
            java.util.List r5 = r8.m32741b(r4)     // Catch:{ all -> 0x0060 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0060 }
        L_0x0034:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0060 }
            if (r6 == 0) goto L_0x0052
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0060 }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x0060 }
            boolean r7 = r1.contains(r6)     // Catch:{ all -> 0x0060 }
            if (r7 == 0) goto L_0x004e
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ all -> 0x0060 }
            java.lang.String r6 = "Duplicate found in causal chain so cropping to prevent loop ..."
            r4.<init>(r6)     // Catch:{ all -> 0x0060 }
            goto L_0x0034
        L_0x004e:
            r1.add(r6)     // Catch:{ all -> 0x0060 }
            goto L_0x0034
        L_0x0052:
            r3.initCause(r4)     // Catch:{ all -> 0x0055 }
        L_0x0055:
            java.lang.Throwable r3 = r8.mo36513a(r3)     // Catch:{ all -> 0x0060 }
            goto L_0x0016
        L_0x005a:
            r8.f31948g = r0     // Catch:{ all -> 0x0060 }
        L_0x005c:
            java.lang.Throwable r0 = r8.f31948g     // Catch:{ all -> 0x0060 }
            monitor-exit(r8)
            return r0
        L_0x0060:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p389io.reactivex.exceptions.CompositeException.getCause():java.lang.Throwable");
    }

    public String getMessage() {
        return this.f31947f;
    }

    public void printStackTrace() {
        printStackTrace(System.err);
    }

    /* renamed from: a */
    private void m32739a(C12282b bVar) {
        StackTraceElement[] stackTrace;
        StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append(10);
        for (StackTraceElement stackTraceElement : getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append(10);
        }
        int i = 1;
        for (Throwable th : this.f31946e) {
            sb.append("  ComposedException ");
            sb.append(i);
            sb.append(" :\n");
            m32740a(sb, th, "\t");
            i++;
        }
        bVar.mo36521a(sb.toString());
    }

    public void printStackTrace(PrintStream printStream) {
        m32739a((C12282b) new C12283c(printStream));
    }

    public void printStackTrace(PrintWriter printWriter) {
        m32739a((C12282b) new C12284d(printWriter));
    }

    public CompositeException(Iterable<? extends Throwable> iterable) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            for (Throwable th : iterable) {
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).mo36514a());
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            arrayList.addAll(linkedHashSet);
            this.f31946e = Collections.unmodifiableList(arrayList);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f31946e.size());
            sb.append(" exceptions occurred. ");
            this.f31947f = sb.toString();
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    /* renamed from: a */
    private void m32740a(StringBuilder sb, Throwable th, String str) {
        StackTraceElement[] stackTrace;
        sb.append(str);
        sb.append(th);
        sb.append(10);
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append(10);
        }
        if (th.getCause() != null) {
            sb.append("\tCaused by: ");
            m32740a(sb, th.getCause(), "");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Throwable mo36513a(Throwable th) {
        Throwable cause = th.getCause();
        if (cause == null || th == cause) {
            return th;
        }
        while (true) {
            Throwable cause2 = cause.getCause();
            if (cause2 == null || cause2 == cause) {
                return cause;
            }
            cause = cause2;
        }
        return cause;
    }
}
