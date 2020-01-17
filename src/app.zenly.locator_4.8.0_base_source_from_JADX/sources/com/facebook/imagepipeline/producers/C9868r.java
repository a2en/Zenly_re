package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.imagepipeline.common.C9697a;
import com.facebook.imagepipeline.image.C9732e;

/* renamed from: com.facebook.imagepipeline.producers.r */
public class C9868r {

    /* renamed from: a */
    private final Consumer<C9732e> f25911a;

    /* renamed from: b */
    private final ProducerContext f25912b;

    /* renamed from: c */
    private long f25913c = 0;

    /* renamed from: d */
    private int f25914d;

    /* renamed from: e */
    private C9697a f25915e;

    public C9868r(Consumer<C9732e> consumer, ProducerContext producerContext) {
        this.f25911a = consumer;
        this.f25912b = producerContext;
    }

    /* renamed from: a */
    public Consumer<C9732e> mo26669a() {
        return this.f25911a;
    }

    /* renamed from: b */
    public ProducerContext mo26671b() {
        return this.f25912b;
    }

    /* renamed from: c */
    public String mo26672c() {
        return this.f25912b.getId();
    }

    /* renamed from: d */
    public long mo26673d() {
        return this.f25913c;
    }

    /* renamed from: e */
    public ProducerListener mo26674e() {
        return this.f25912b.getListener();
    }

    /* renamed from: f */
    public int mo26675f() {
        return this.f25914d;
    }

    /* renamed from: g */
    public C9697a mo26676g() {
        return this.f25915e;
    }

    /* renamed from: h */
    public Uri mo26677h() {
        return this.f25912b.getImageRequest().mo26743p();
    }

    /* renamed from: a */
    public void mo26670a(long j) {
        this.f25913c = j;
    }
}
