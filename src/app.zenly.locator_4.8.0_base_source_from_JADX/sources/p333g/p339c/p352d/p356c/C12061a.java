package p333g.p339c.p352d.p356c;

import com.facebook.common.internal.C9536j;
import com.facebook.datasource.C9561a;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.producers.C9796b;
import com.facebook.imagepipeline.producers.C9832i0;
import com.facebook.imagepipeline.producers.Consumer;
import com.facebook.imagepipeline.producers.Producer;
import com.facebook.imagepipeline.request.C9884a;
import com.facebook.imagepipeline.request.HasImageRequest;
import com.facebook.imagepipeline.systrace.FrescoSystrace;

/* renamed from: g.c.d.c.a */
public abstract class C12061a<T> extends C9561a<T> implements HasImageRequest {

    /* renamed from: g */
    private final C9832i0 f31454g;

    /* renamed from: h */
    private final RequestListener f31455h;

    /* renamed from: g.c.d.c.a$a */
    class C12062a extends C9796b<T> {
        C12062a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo26609a(T t, int i) {
            C12061a.this.mo35775a(t, i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo26617a(Throwable th) {
            C12061a.this.m31860b(th);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo26614a() {
            C12061a.this.m31861c();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo26615a(float f) {
            C12061a.this.mo25767a(f);
        }
    }

    protected C12061a(Producer<T> producer, C9832i0 i0Var, RequestListener requestListener) {
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24703a("AbstractProducerToDataSourceAdapter()");
        }
        this.f31454g = i0Var;
        this.f31455h = requestListener;
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24703a("AbstractProducerToDataSourceAdapter()->onRequestStart");
        }
        this.f31455h.onRequestStart(i0Var.getImageRequest(), this.f31454g.getCallerContext(), this.f31454g.getId(), this.f31454g.isPrefetch());
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24702a();
        }
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24703a("AbstractProducerToDataSourceAdapter()->produceResult");
        }
        producer.produceResults(m31859b(), i0Var);
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24702a();
        }
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24702a();
        }
    }

    /* renamed from: b */
    private Consumer<T> m31859b() {
        return new C12062a();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public synchronized void m31861c() {
        C9536j.m23279b(isClosed());
    }

    public boolean close() {
        if (!super.close()) {
            return false;
        }
        if (!super.isFinished()) {
            this.f31455h.onRequestCancellation(this.f31454g.getId());
            this.f31454g.mo26631a();
        }
        return true;
    }

    public C9884a getImageRequest() {
        return this.f31454g.getImageRequest();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m31860b(Throwable th) {
        if (super.mo25769a(th)) {
            this.f31455h.onRequestFailure(this.f31454g.getImageRequest(), this.f31454g.getId(), th, this.f31454g.isPrefetch());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35775a(T t, int i) {
        boolean a = C9796b.m24323a(i);
        if (super.mo25768a(t, a) && a) {
            this.f31455h.onRequestSuccess(this.f31454g.getImageRequest(), this.f31454g.getId(), this.f31454g.isPrefetch());
        }
    }
}
