package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.ua */
/* compiled from: lambda */
public final /* synthetic */ class C6658ua implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16238a;

    public /* synthetic */ C6658ua(Core core) {
        this.f16238a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16238a.chatDeleteMessage(bArr, rxProtoObserver);
    }
}
