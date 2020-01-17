package p213co.znly.core;

import java.util.Objects;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite.Builder;
import p213co.znly.zenlygocore.RxContext;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableEmitter;
import p389io.reactivex.ObservableOnSubscribe;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;

/* renamed from: co.znly.core.RxProtoObservable */
public class RxProtoObservable {

    /* renamed from: co.znly.core.RxProtoObservable$InputCallable */
    public interface InputCallable {
        RxContext call(p213co.znly.zenlygocore.RxProtoObservable rxProtoObservable);
    }

    /* renamed from: co.znly.core.RxProtoObservable$InputOutputCallable */
    public interface InputOutputCallable {
        RxContext call(p213co.znly.zenlygocore.RxProtoObservable rxProtoObservable, RxProtoObserver rxProtoObserver);
    }

    /* renamed from: co.znly.core.RxProtoObservable$OutputCallable */
    public interface OutputCallable {
        RxContext call(RxProtoObserver rxProtoObserver);
    }

    /* renamed from: co.znly.core.RxProtoObservable$TransformCallable */
    public interface TransformCallable {
        RxContext call(byte[] bArr, RxProtoObserver rxProtoObserver);
    }

    /* renamed from: a */
    static /* synthetic */ void m17488a(OutputCallable outputCallable, BuilderCreator builderCreator, ObservableEmitter observableEmitter) throws Exception {
        RxContext call = outputCallable.call(new RxProtoObserver(observableEmitter, builderCreator));
        Objects.requireNonNull(call);
        observableEmitter.setCancellable(new C6434e9(call));
    }

    public static <T extends MessageLite, U extends Builder> C12279e<T> from(OutputCallable outputCallable, BuilderCreator<U> builderCreator) {
        return C12279e.m32602a((ObservableOnSubscribe<T>) new C6470h4<T>(outputCallable, builderCreator));
    }

    public static <T extends MessageLite> void subscribe(C12279e<T> eVar, final InputCallable inputCallable) {
        eVar.subscribe(new Observer<T>() {
            private RxContext mCtx;
            private p213co.znly.zenlygocore.RxProtoObservable mObservable;

            public void onComplete() {
                this.mObservable.complete();
                this.mCtx.cancel();
            }

            public void onError(Throwable th) {
                Exception exc = new Exception(th.getMessage(), th.getCause());
                exc.setStackTrace(th.getStackTrace());
                this.mObservable.writeError(exc);
            }

            public void onSubscribe(Disposable disposable) {
                this.mObservable = new p213co.znly.zenlygocore.RxProtoObservable();
                this.mCtx = InputCallable.this.call(this.mObservable);
            }

            public void onNext(T t) {
                this.mObservable.writeNext(t.toByteArray());
            }
        });
    }

    public static <T extends MessageLite, U extends MessageLite, V extends Builder> C12279e<U> from(T t, TransformCallable transformCallable, BuilderCreator<V> builderCreator) {
        return C12279e.m32602a((ObservableOnSubscribe<T>) new C6483i4<T>(transformCallable, t.toByteArray(), builderCreator));
    }

    /* renamed from: a */
    static /* synthetic */ void m17489a(TransformCallable transformCallable, byte[] bArr, BuilderCreator builderCreator, ObservableEmitter observableEmitter) throws Exception {
        RxContext call = transformCallable.call(bArr, new RxProtoObserver(observableEmitter, builderCreator));
        Objects.requireNonNull(call);
        observableEmitter.setCancellable(new C6434e9(call));
    }

    public static <T extends MessageLite, U extends MessageLite, V extends Builder> C12279e<U> from(C12279e<T> eVar, InputOutputCallable inputOutputCallable, BuilderCreator<V> builderCreator) {
        return C12279e.m32602a((ObservableOnSubscribe<T>) new C6496j4<T>(eVar, inputOutputCallable, builderCreator));
    }
}
