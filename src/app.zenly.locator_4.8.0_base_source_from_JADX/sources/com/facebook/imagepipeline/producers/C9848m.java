package com.facebook.imagepipeline.producers;

/* renamed from: com.facebook.imagepipeline.producers.m */
public abstract class C9848m<I, O> extends C9796b<I> {

    /* renamed from: b */
    private final Consumer<O> f25864b;

    public C9848m(Consumer<O> consumer) {
        this.f25864b = consumer;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26617a(Throwable th) {
        this.f25864b.onFailure(th);
    }

    /* renamed from: b */
    public Consumer<O> mo26659b() {
        return this.f25864b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26614a() {
        this.f25864b.onCancellation();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26615a(float f) {
        this.f25864b.onProgressUpdate(f);
    }
}
