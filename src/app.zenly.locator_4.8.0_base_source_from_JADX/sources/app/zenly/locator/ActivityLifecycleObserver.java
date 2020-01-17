package app.zenly.locator;

import p389io.reactivex.disposables.Disposable;

public interface ActivityLifecycleObserver {
    Disposable onCreate();

    Disposable onForeground();
}
