package com.facebook.imagepipeline.core;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.imagepipeline.core.h */
public class C9717h implements ThreadFactory {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final int f25490e;

    /* renamed from: f */
    private final String f25491f;

    /* renamed from: g */
    private final boolean f25492g;

    /* renamed from: h */
    private final AtomicInteger f25493h = new AtomicInteger(1);

    /* renamed from: com.facebook.imagepipeline.core.h$a */
    class C9718a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ Runnable f25494e;

        C9718a(Runnable runnable) {
            this.f25494e = runnable;
        }

        public void run() {
            try {
                Process.setThreadPriority(C9717h.this.f25490e);
            } catch (Throwable unused) {
            }
            this.f25494e.run();
        }
    }

    public C9717h(int i, String str, boolean z) {
        this.f25490e = i;
        this.f25491f = str;
        this.f25492g = z;
    }

    public Thread newThread(Runnable runnable) {
        String str;
        C9718a aVar = new C9718a(runnable);
        if (this.f25492g) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f25491f);
            sb.append("-");
            sb.append(this.f25493h.getAndIncrement());
            str = sb.toString();
        } else {
            str = this.f25491f;
        }
        return new Thread(aVar, str);
    }
}
