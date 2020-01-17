package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.hb */
/* compiled from: lambda */
public final /* synthetic */ class C6477hb implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16056a;

    public /* synthetic */ C6477hb(Core core) {
        this.f16056a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16056a.descendantWorldRank(bArr, rxProtoObserver);
    }
}
