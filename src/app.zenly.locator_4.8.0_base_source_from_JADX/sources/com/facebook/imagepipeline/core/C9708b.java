package com.facebook.imagepipeline.core;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.facebook.imagepipeline.core.b */
public class C9708b implements ExecutorSupplier {

    /* renamed from: a */
    private final Executor f25397a = Executors.newFixedThreadPool(2, new C9717h(10, "FrescoIoBoundExecutor", true));

    /* renamed from: b */
    private final Executor f25398b;

    /* renamed from: c */
    private final Executor f25399c;

    /* renamed from: d */
    private final Executor f25400d;

    public C9708b(int i) {
        this.f25398b = Executors.newFixedThreadPool(i, new C9717h(10, "FrescoDecodeExecutor", true));
        this.f25399c = Executors.newFixedThreadPool(i, new C9717h(10, "FrescoBackgroundExecutor", true));
        this.f25400d = Executors.newFixedThreadPool(1, new C9717h(10, "FrescoLightWeightBackgroundExecutor", true));
    }

    public Executor forBackgroundTasks() {
        return this.f25399c;
    }

    public Executor forDecode() {
        return this.f25398b;
    }

    public Executor forLightweightBackgroundTasks() {
        return this.f25400d;
    }

    public Executor forLocalStorageRead() {
        return this.f25397a;
    }

    public Executor forLocalStorageWrite() {
        return this.f25397a;
    }
}
