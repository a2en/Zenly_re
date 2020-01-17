package com.facebook.drawee.components;

import android.os.Handler;
import android.os.Looper;
import com.facebook.common.internal.C9536j;
import java.util.HashSet;
import java.util.Set;

public class DeferredReleaser {

    /* renamed from: d */
    private static DeferredReleaser f24844d;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Set<Releasable> f24845a = new HashSet();

    /* renamed from: b */
    private final Handler f24846b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    private final Runnable f24847c = new C9585a();

    public interface Releasable {
        void release();
    }

    /* renamed from: com.facebook.drawee.components.DeferredReleaser$a */
    class C9585a implements Runnable {
        C9585a() {
        }

        public void run() {
            DeferredReleaser.m23494b();
            for (Releasable release : DeferredReleaser.this.f24845a) {
                release.release();
            }
            DeferredReleaser.this.f24845a.clear();
        }
    }

    /* renamed from: c */
    public static synchronized DeferredReleaser m23495c() {
        DeferredReleaser deferredReleaser;
        synchronized (DeferredReleaser.class) {
            if (f24844d == null) {
                f24844d = new DeferredReleaser();
            }
            deferredReleaser = f24844d;
        }
        return deferredReleaser;
    }

    /* renamed from: b */
    public void mo25831b(Releasable releasable) {
        m23494b();
        if (this.f24845a.add(releasable) && this.f24845a.size() == 1) {
            this.f24846b.post(this.f24847c);
        }
    }

    /* renamed from: a */
    public void mo25830a(Releasable releasable) {
        m23494b();
        this.f24845a.remove(releasable);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m23494b() {
        C9536j.m23279b(Looper.getMainLooper().getThread() == Thread.currentThread());
    }
}
