package app.zenly.locator;

import p389io.reactivex.disposables.Disposable;

public interface AppLifecycleObserver {
    Disposable onForeground();

    Disposable onInitialize();
}
