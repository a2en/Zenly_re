package org.greenrobot.eventbus;

import android.util.Log;
import com.android.volley.toolbox.C8733j;

/* renamed from: org.greenrobot.eventbus.b */
final class C13372b implements Runnable {

    /* renamed from: e */
    private final C13381h f34681e = new C13381h();

    /* renamed from: f */
    private final C13373c f34682f;

    /* renamed from: g */
    private volatile boolean f34683g;

    C13372b(C13373c cVar) {
        this.f34682f = cVar;
    }

    /* renamed from: a */
    public void mo38579a(C13387m mVar, Object obj) {
        C13380g a = C13380g.m35461a(mVar, obj);
        synchronized (this) {
            this.f34681e.mo38598a(a);
            if (!this.f34683g) {
                this.f34683g = true;
                this.f34682f.mo38581a().execute(this);
            }
        }
    }

    public void run() {
        while (true) {
            try {
                C13380g a = this.f34681e.mo38597a((int) C8733j.DEFAULT_IMAGE_TIMEOUT_MS);
                if (a == null) {
                    synchronized (this) {
                        a = this.f34681e.mo38596a();
                        if (a == null) {
                            this.f34683g = false;
                            this.f34683g = false;
                            return;
                        }
                    }
                }
                this.f34682f.mo38583a(a);
            } catch (InterruptedException e) {
                String str = "Event";
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Thread.currentThread().getName());
                    sb.append(" was interruppted");
                    Log.w(str, sb.toString(), e);
                    return;
                } finally {
                    this.f34683g = false;
                }
            }
        }
    }
}
