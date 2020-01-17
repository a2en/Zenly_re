package p213co.znly.core.contacts;

import p213co.znly.core.contacts.ContactParser.ContactListener;

/* renamed from: co.znly.core.contacts.a */
/* compiled from: lambda */
public final /* synthetic */ class C6409a implements Runnable {

    /* renamed from: e */
    private final /* synthetic */ ContactParser f15986e;

    /* renamed from: f */
    private final /* synthetic */ ContactListener f15987f;

    public /* synthetic */ C6409a(ContactParser contactParser, ContactListener contactListener) {
        this.f15986e = contactParser;
        this.f15987f = contactListener;
    }

    public final void run() {
        this.f15986e.mo14601b(this.f15987f);
    }
}
