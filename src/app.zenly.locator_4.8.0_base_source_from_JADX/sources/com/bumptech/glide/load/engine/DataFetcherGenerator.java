package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.C8882a;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.data.DataFetcher;

interface DataFetcherGenerator {

    public interface FetcherReadyCallback {
        void onDataFetcherFailed(Key key, Exception exc, DataFetcher<?> dataFetcher, C8882a aVar);

        void onDataFetcherReady(Key key, Object obj, DataFetcher<?> dataFetcher, C8882a aVar, Key key2);

        void reschedule();
    }

    /* renamed from: a */
    boolean mo24274a();

    void cancel();
}
