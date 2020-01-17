package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;
import java.util.concurrent.TimeUnit;

public abstract class PendingResult<R extends Result> {

    public interface StatusListener {
        void onComplete(Status status);
    }

    /* renamed from: a */
    public abstract R mo27047a(long j, TimeUnit timeUnit);

    /* renamed from: a */
    public abstract void mo27048a(StatusListener statusListener);
}
