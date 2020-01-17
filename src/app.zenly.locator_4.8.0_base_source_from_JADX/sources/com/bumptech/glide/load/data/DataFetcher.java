package com.bumptech.glide.load.data;

import com.bumptech.glide.C8859g;
import com.bumptech.glide.load.C8882a;

public interface DataFetcher<T> {

    public interface DataCallback<T> {
        void onDataReady(T t);

        void onLoadFailed(Exception exc);
    }

    void cancel();

    void cleanup();

    Class<T> getDataClass();

    C8882a getDataSource();

    void loadData(C8859g gVar, DataCallback<? super T> dataCallback);
}
