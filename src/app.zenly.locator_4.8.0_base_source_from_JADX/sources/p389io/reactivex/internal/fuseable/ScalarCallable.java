package p389io.reactivex.internal.fuseable;

import java.util.concurrent.Callable;

/* renamed from: io.reactivex.internal.fuseable.ScalarCallable */
public interface ScalarCallable<T> extends Callable<T> {
    T call();
}
