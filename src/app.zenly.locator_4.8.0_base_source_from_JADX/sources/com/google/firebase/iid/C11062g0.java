package com.google.firebase.iid;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.g0 */
final class C11062g0 {

    /* renamed from: a */
    private static final Executor f28701a = C11066i0.f28711a;

    /* renamed from: a */
    static Executor m28492a() {
        return f28701a;
    }

    /* renamed from: b */
    static Executor m28493b() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), C11068j0.f28712e);
        return threadPoolExecutor;
    }

    /* renamed from: a */
    static final /* synthetic */ Thread m28491a(Runnable runnable) {
        return new Thread(runnable, "firebase-iid-executor");
    }
}
