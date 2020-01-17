package com.facebook.imagepipeline.producers;

public interface Consumer<T> {
    void onCancellation();

    void onFailure(Throwable th);

    void onNewResult(T t, int i);

    void onProgressUpdate(float f);
}
