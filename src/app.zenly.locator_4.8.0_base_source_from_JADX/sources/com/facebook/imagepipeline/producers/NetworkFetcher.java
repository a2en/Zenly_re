package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.producers.C9868r;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public interface NetworkFetcher<FETCH_STATE extends C9868r> {

    public interface Callback {
        void onCancellation();

        void onFailure(Throwable th);

        void onResponse(InputStream inputStream, int i) throws IOException;
    }

    FETCH_STATE createFetchState(Consumer<C9732e> consumer, ProducerContext producerContext);

    void fetch(FETCH_STATE fetch_state, Callback callback);

    Map<String, String> getExtraMap(FETCH_STATE fetch_state, int i);

    void onFetchCompletion(FETCH_STATE fetch_state, int i);

    boolean shouldPropagate(FETCH_STATE fetch_state);
}
