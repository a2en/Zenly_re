package org.greenrobot.eventbus;

/* renamed from: org.greenrobot.eventbus.h */
final class C13381h {

    /* renamed from: a */
    private C13380g f34728a;

    /* renamed from: b */
    private C13380g f34729b;

    C13381h() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo38598a(C13380g gVar) {
        if (gVar != null) {
            try {
                if (this.f34729b != null) {
                    this.f34729b.f34727c = gVar;
                    this.f34729b = gVar;
                } else if (this.f34728a == null) {
                    this.f34729b = gVar;
                    this.f34728a = gVar;
                } else {
                    throw new IllegalStateException("Head present, but no tail");
                }
                notifyAll();
            } finally {
            }
        } else {
            throw new NullPointerException("null cannot be enqueued");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized C13380g mo38596a() {
        C13380g gVar;
        gVar = this.f34728a;
        if (this.f34728a != null) {
            this.f34728a = this.f34728a.f34727c;
            if (this.f34728a == null) {
                this.f34729b = null;
            }
        }
        return gVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized C13380g mo38597a(int i) throws InterruptedException {
        if (this.f34728a == null) {
            wait((long) i);
        }
        return mo38596a();
    }
}
