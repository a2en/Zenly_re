package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.OutputCallable;
import p389io.reactivex.ObservableEmitter;
import p389io.reactivex.ObservableOnSubscribe;

/* renamed from: co.znly.core.h4 */
/* compiled from: lambda */
public final /* synthetic */ class C6470h4 implements ObservableOnSubscribe {

    /* renamed from: a */
    private final /* synthetic */ OutputCallable f16048a;

    /* renamed from: b */
    private final /* synthetic */ BuilderCreator f16049b;

    public /* synthetic */ C6470h4(OutputCallable outputCallable, BuilderCreator builderCreator) {
        this.f16048a = outputCallable;
        this.f16049b = builderCreator;
    }

    public final void subscribe(ObservableEmitter observableEmitter) {
        RxProtoObservable.m17488a(this.f16048a, this.f16049b, observableEmitter);
    }
}
