package com.mapbox.android.core.location;

public interface LocationEngineCallback<T> {
    void onFailure(Exception exc);

    void onSuccess(T t);
}
