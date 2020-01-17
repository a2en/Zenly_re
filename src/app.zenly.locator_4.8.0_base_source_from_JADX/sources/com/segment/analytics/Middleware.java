package com.segment.analytics;

import com.segment.analytics.integrations.C11650b;

public interface Middleware {

    public interface Chain {
        C11650b payload();

        void proceed(C11650b bVar);
    }

    void intercept(Chain chain);
}
