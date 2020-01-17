package p389io.reactivex.internal.util;

import p389io.reactivex.Observer;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.internal.fuseable.SimplePlainQueue;
import p389io.reactivex.internal.fuseable.SimpleQueue;

/* renamed from: io.reactivex.internal.util.l */
public final class C12766l {
    /* renamed from: a */
    public static <T, U> void m33380a(SimplePlainQueue<T> simplePlainQueue, Observer<? super U> observer, boolean z, Disposable disposable, ObservableQueueDrain<T, U> observableQueueDrain) {
        int i = 1;
        while (!m33381a(observableQueueDrain.done(), simplePlainQueue.isEmpty(), observer, z, simplePlainQueue, disposable, observableQueueDrain)) {
            while (true) {
                boolean done = observableQueueDrain.done();
                Object poll = simplePlainQueue.poll();
                boolean z2 = poll == null;
                if (!m33381a(done, z2, observer, z, simplePlainQueue, disposable, observableQueueDrain)) {
                    if (z2) {
                        i = observableQueueDrain.leave(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        observableQueueDrain.accept(observer, poll);
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static <T, U> boolean m33381a(boolean z, boolean z2, Observer<?> observer, boolean z3, SimpleQueue<?> simpleQueue, Disposable disposable, ObservableQueueDrain<T, U> observableQueueDrain) {
        if (observableQueueDrain.cancelled()) {
            simpleQueue.clear();
            disposable.dispose();
            return true;
        }
        if (z) {
            if (!z3) {
                Throwable error = observableQueueDrain.error();
                if (error != null) {
                    simpleQueue.clear();
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    observer.onError(error);
                    return true;
                } else if (z2) {
                    if (disposable != null) {
                        disposable.dispose();
                    }
                    observer.onComplete();
                    return true;
                }
            } else if (z2) {
                if (disposable != null) {
                    disposable.dispose();
                }
                Throwable error2 = observableQueueDrain.error();
                if (error2 != null) {
                    observer.onError(error2);
                } else {
                    observer.onComplete();
                }
                return true;
            }
        }
        return false;
    }
}
