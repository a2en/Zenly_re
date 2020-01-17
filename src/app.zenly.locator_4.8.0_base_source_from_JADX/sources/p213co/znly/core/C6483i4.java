package p213co.znly.core;

import p213co.znly.core.RxProtoObservable.TransformCallable;
import p389io.reactivex.ObservableEmitter;
import p389io.reactivex.ObservableOnSubscribe;

/* renamed from: co.znly.core.i4 */
/* compiled from: lambda */
public final /* synthetic */ class C6483i4 implements ObservableOnSubscribe {

    /* renamed from: a */
    private final /* synthetic */ TransformCallable f16062a;

    /* renamed from: b */
    private final /* synthetic */ byte[] f16063b;

    /* renamed from: c */
    private final /* synthetic */ BuilderCreator f16064c;

    public /* synthetic */ C6483i4(TransformCallable transformCallable, byte[] bArr, BuilderCreator builderCreator) {
        this.f16062a = transformCallable;
        this.f16063b = bArr;
        this.f16064c = builderCreator;
    }

    public final void subscribe(ObservableEmitter observableEmitter) {
        RxProtoObservable.m17489a(this.f16062a, this.f16063b, this.f16064c, observableEmitter);
    }
}
