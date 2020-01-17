package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.C9536j;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.producers.l0 */
public class C9847l0 {

    /* renamed from: a */
    private boolean f25861a = false;

    /* renamed from: b */
    private final Deque<Runnable> f25862b;

    /* renamed from: c */
    private final Executor f25863c;

    public C9847l0(Executor executor) {
        C9536j.m23271a(executor);
        this.f25863c = executor;
        this.f25862b = new ArrayDeque();
    }

    /* renamed from: a */
    public synchronized void mo26657a(Runnable runnable) {
        if (this.f25861a) {
            this.f25862b.add(runnable);
        } else {
            this.f25863c.execute(runnable);
        }
    }

    /* renamed from: b */
    public synchronized void mo26658b(Runnable runnable) {
        this.f25862b.remove(runnable);
    }
}
