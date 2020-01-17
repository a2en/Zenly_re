package com.facebook.common.executors;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.common.executors.f */
public abstract class C9519f<T> implements Runnable {

    /* renamed from: e */
    protected final AtomicInteger f24704e = new AtomicInteger(0);

    /* renamed from: a */
    public void mo25651a() {
        if (this.f24704e.compareAndSet(0, 2)) {
            mo25656c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25652a(Exception exc);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25653a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo25654b() throws Exception;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo25655b(T t);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo25656c();

    public final void run() {
        if (this.f24704e.compareAndSet(0, 1)) {
            try {
                Object b = mo25654b();
                this.f24704e.set(3);
                try {
                    mo25655b(b);
                } finally {
                    mo25653a((T) b);
                }
            } catch (Exception e) {
                this.f24704e.set(4);
                mo25652a(e);
            }
        }
    }
}
