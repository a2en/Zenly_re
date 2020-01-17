package p213co.znly.core;

import p213co.znly.core.vendor.com.google.protobuf.MessageLite;
import p213co.znly.core.vendor.com.google.protobuf.MessageLite.Builder;
import p389io.reactivex.ObservableEmitter;

/* renamed from: co.znly.core.RxProtoObserver */
public class RxProtoObserver<T extends MessageLite, U extends Builder> implements p213co.znly.zenlygocore.RxProtoObserver {
    private final ObservableEmitter<? super T> mEmitter;
    private final BuilderCreator<U> mInstancier;

    public RxProtoObserver(ObservableEmitter<? super T> observableEmitter, BuilderCreator<U> builderCreator) {
        this.mEmitter = observableEmitter;
        this.mInstancier = builderCreator;
    }

    public void completed() {
        if (!this.mEmitter.isDisposed()) {
            this.mEmitter.onComplete();
        }
    }

    public void error(Exception exc) {
        if (!this.mEmitter.isDisposed()) {
            this.mEmitter.onError(exc);
        }
    }

    public void next(byte[] bArr) {
        try {
            if (!this.mEmitter.isDisposed()) {
                Builder builder = (Builder) this.mInstancier.create();
                if (bArr != null) {
                    builder.mergeFrom(bArr);
                }
                this.mEmitter.onNext(builder.build());
            }
        } catch (Exception e) {
            this.mEmitter.onError(e);
        }
    }
}
