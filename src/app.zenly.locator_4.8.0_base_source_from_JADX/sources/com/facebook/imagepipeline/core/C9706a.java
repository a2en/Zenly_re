package com.facebook.imagepipeline.core;

import com.facebook.common.logging.C9543a;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.CloseableReference.LeakHandler;
import com.facebook.common.references.ResourceReleaser;
import com.facebook.common.references.SharedReference;
import com.facebook.imagepipeline.debug.CloseableReferenceLeakTracker;
import java.io.Closeable;
import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: com.facebook.imagepipeline.core.a */
public class C9706a {

    /* renamed from: a */
    private final LeakHandler f25395a;

    /* renamed from: com.facebook.imagepipeline.core.a$a */
    class C9707a implements LeakHandler {

        /* renamed from: a */
        final /* synthetic */ CloseableReferenceLeakTracker f25396a;

        C9707a(C9706a aVar, CloseableReferenceLeakTracker closeableReferenceLeakTracker) {
            this.f25396a = closeableReferenceLeakTracker;
        }

        public void reportLeak(SharedReference<Object> sharedReference, Throwable th) {
            this.f25396a.trackCloseableReferenceLeak(sharedReference, th);
            C9543a.m23324c("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(sharedReference)), sharedReference.mo25735c().getClass().getName(), C9706a.m23890b(th));
        }

        public boolean requiresStacktrace() {
            return this.f25396a.isSet();
        }
    }

    public C9706a(CloseableReferenceLeakTracker closeableReferenceLeakTracker) {
        this.f25395a = new C9707a(this, closeableReferenceLeakTracker);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static String m23890b(Throwable th) {
        if (th == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: a */
    public <U extends Closeable> CloseableReference<U> mo26303a(U u) {
        return CloseableReference.m23350a(u, this.f25395a);
    }

    /* renamed from: a */
    public <T> CloseableReference<T> mo26304a(T t, ResourceReleaser<T> resourceReleaser) {
        return CloseableReference.m23352a(t, resourceReleaser, this.f25395a);
    }
}
