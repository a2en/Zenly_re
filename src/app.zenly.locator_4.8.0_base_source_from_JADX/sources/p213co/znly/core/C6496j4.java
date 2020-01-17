package p213co.znly.core;

import java.util.Objects;
import p213co.znly.core.RxProtoObservable.InputOutputCallable;
import p213co.znly.zenlygocore.RxContext;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableEmitter;
import p389io.reactivex.ObservableOnSubscribe;
import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;

/* renamed from: co.znly.core.j4 */
/* compiled from: lambda */
public final /* synthetic */ class C6496j4 implements ObservableOnSubscribe {

    /* renamed from: a */
    private final /* synthetic */ C12279e f16077a;

    /* renamed from: b */
    private final /* synthetic */ InputOutputCallable f16078b;

    /* renamed from: c */
    private final /* synthetic */ BuilderCreator f16079c;

    public /* synthetic */ C6496j4(C12279e eVar, InputOutputCallable inputOutputCallable, BuilderCreator builderCreator) {
        this.f16077a = eVar;
        this.f16078b = inputOutputCallable;
        this.f16079c = builderCreator;
    }

    public final void subscribe(ObservableEmitter observableEmitter) {
        this.f16077a.subscribe(new Observer<T>(observableEmitter, this.f16079c) {
            RxContext mCtx;
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
                this.mCtx = InputOutputCallable.this.call(this.mObservable, new RxProtoObserver(r4, r3));
                ObservableEmitter observableEmitter = r4;
                RxContext rxContext = this.mCtx;
                Objects.requireNonNull(rxContext);
                observableEmitter.setCancellable(new C6434e9(rxContext));
            }

            public void onNext(T t) {
                this.mObservable.writeNext(t.toByteArray());
            }
        });
    }
}
