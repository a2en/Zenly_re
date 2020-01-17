package com.facebook.imagepipeline.producers;

import com.facebook.common.executors.C9519f;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.producers.j0 */
public abstract class C9836j0<T> extends C9519f<T> {

    /* renamed from: f */
    private final Consumer<T> f25824f;

    /* renamed from: g */
    private final ProducerListener f25825g;

    /* renamed from: h */
    private final String f25826h;

    /* renamed from: i */
    private final String f25827i;

    public C9836j0(Consumer<T> consumer, ProducerListener producerListener, String str, String str2) {
        this.f25824f = consumer;
        this.f25825g = producerListener;
        this.f25826h = str;
        this.f25827i = str2;
        this.f25825g.onProducerStart(this.f25827i, this.f25826h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25652a(Exception exc) {
        ProducerListener producerListener = this.f25825g;
        String str = this.f25827i;
        producerListener.onProducerFinishWithFailure(str, this.f25826h, exc, producerListener.requiresExtraMap(str) ? mo26651b(exc) : null);
        this.f25824f.onFailure(exc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Map<String, String> mo26651b(Exception exc) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo25655b(T t) {
        ProducerListener producerListener = this.f25825g;
        String str = this.f25827i;
        producerListener.onProducerFinishWithSuccess(str, this.f25826h, producerListener.requiresExtraMap(str) ? mo26612c(t) : null);
        this.f25824f.onNewResult(t, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Map<String, String> mo26612c(T t) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo25656c() {
        ProducerListener producerListener = this.f25825g;
        String str = this.f25827i;
        producerListener.onProducerFinishWithCancellation(str, this.f25826h, producerListener.requiresExtraMap(str) ? mo26652d() : null);
        this.f25824f.onCancellation();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Map<String, String> mo26652d() {
        return null;
    }
}
