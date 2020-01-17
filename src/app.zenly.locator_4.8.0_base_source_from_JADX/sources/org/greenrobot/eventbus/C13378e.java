package org.greenrobot.eventbus;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* renamed from: org.greenrobot.eventbus.e */
final class C13378e extends Handler {

    /* renamed from: a */
    private final C13381h f34720a = new C13381h();

    /* renamed from: b */
    private final int f34721b;

    /* renamed from: c */
    private final C13373c f34722c;

    /* renamed from: d */
    private boolean f34723d;

    C13378e(C13373c cVar, Looper looper, int i) {
        super(looper);
        this.f34722c = cVar;
        this.f34721b = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38594a(C13387m mVar, Object obj) {
        C13380g a = C13380g.m35461a(mVar, obj);
        synchronized (this) {
            this.f34720a.mo38598a(a);
            if (!this.f34723d) {
                this.f34723d = true;
                if (!sendMessage(obtainMessage())) {
                    throw new EventBusException("Could not send handler message");
                }
            }
        }
    }

    public void handleMessage(Message message) {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            do {
                C13380g a = this.f34720a.mo38596a();
                if (a == null) {
                    synchronized (this) {
                        a = this.f34720a.mo38596a();
                        if (a == null) {
                            this.f34723d = false;
                            this.f34723d = false;
                            return;
                        }
                    }
                }
                this.f34722c.mo38583a(a);
            } while (SystemClock.uptimeMillis() - uptimeMillis < ((long) this.f34721b));
            if (sendMessage(obtainMessage())) {
                this.f34723d = true;
                return;
            }
            throw new EventBusException("Could not send handler message");
        } catch (Throwable th) {
            this.f34723d = false;
            throw th;
        }
    }
}
