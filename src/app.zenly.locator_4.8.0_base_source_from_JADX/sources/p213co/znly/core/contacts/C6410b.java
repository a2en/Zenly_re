package p213co.znly.core.contacts;

import p213co.znly.core.contacts.ContactParser.ContactListener;

/* renamed from: co.znly.core.contacts.b */
/* compiled from: lambda */
public final /* synthetic */ class C6410b implements Runnable {

    /* renamed from: e */
    private final /* synthetic */ ContactParser f15988e;

    /* renamed from: f */
    private final /* synthetic */ ContactListener f15989f;

    public /* synthetic */ C6410b(ContactParser contactParser, ContactListener contactListener) {
        this.f15988e = contactParser;
        this.f15989f = contactListener;
    }

    public final void run() {
        this.f15988e.mo14600a(this.f15989f);
    }
}
