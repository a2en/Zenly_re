package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.ha */
/* compiled from: lambda */
public final /* synthetic */ class C6476ha implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16055a;

    public /* synthetic */ C6476ha(Core core) {
        this.f16055a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16055a.contactsPhoneNumberLookup(bArr, rxProtoObserver);
    }
}
