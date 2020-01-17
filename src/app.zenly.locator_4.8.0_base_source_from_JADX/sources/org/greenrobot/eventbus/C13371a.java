package org.greenrobot.eventbus;

/* renamed from: org.greenrobot.eventbus.a */
class C13371a implements Runnable {

    /* renamed from: e */
    private final C13381h f34679e = new C13381h();

    /* renamed from: f */
    private final C13373c f34680f;

    C13371a(C13373c cVar) {
        this.f34680f = cVar;
    }

    /* renamed from: a */
    public void mo38577a(C13387m mVar, Object obj) {
        this.f34679e.mo38598a(C13380g.m35461a(mVar, obj));
        this.f34680f.mo38581a().execute(this);
    }

    public void run() {
        C13380g a = this.f34679e.mo38596a();
        if (a != null) {
            this.f34680f.mo38583a(a);
            return;
        }
        throw new IllegalStateException("No pending post available");
    }
}
