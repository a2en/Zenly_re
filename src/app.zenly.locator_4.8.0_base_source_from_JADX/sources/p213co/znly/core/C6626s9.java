package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p213co.znly.zenlygocore.Core;
import p213co.znly.zenlygocore.RxContext;

/* renamed from: co.znly.core.s9 */
/* compiled from: lambda */
public final /* synthetic */ class C6626s9 implements TransformCallable {

    /* renamed from: a */
    private final /* synthetic */ Core f16211a;

    public /* synthetic */ C6626s9(Core core) {
        this.f16211a = core;
    }

    public final RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver) {
        return this.f16211a.chatConversationUnMute(bArr, rxProtoObserver);
    }
}
