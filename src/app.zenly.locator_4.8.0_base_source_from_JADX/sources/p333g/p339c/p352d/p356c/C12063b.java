package p333g.p339c.p352d.p356c;

import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.producers.C9832i0;
import com.facebook.imagepipeline.producers.Producer;
import com.facebook.imagepipeline.systrace.FrescoSystrace;

/* renamed from: g.c.d.c.b */
public class C12063b<T> extends C12061a<CloseableReference<T>> {
    private C12063b(Producer<CloseableReference<T>> producer, C9832i0 i0Var, RequestListener requestListener) {
        super(producer, i0Var, requestListener);
    }

    public CloseableReference<T> getResult() {
        return CloseableReference.m23348a((CloseableReference) super.getResult());
    }

    /* renamed from: a */
    public static <T> DataSource<CloseableReference<T>> m31867a(Producer<CloseableReference<T>> producer, C9832i0 i0Var, RequestListener requestListener) {
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24703a("CloseableProducerToDataSourceAdapter#create");
        }
        C12063b bVar = new C12063b(producer, i0Var, requestListener);
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24702a();
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo25766a(CloseableReference<T> closeableReference) {
        CloseableReference.m23355b(closeableReference);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35775a(CloseableReference<T> closeableReference, int i) {
        super.mo35775a(CloseableReference.m23348a(closeableReference), i);
    }
}
