package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.C9700d;
import com.facebook.imagepipeline.request.C9884a;
import com.facebook.imagepipeline.request.C9884a.C9886b;

/* renamed from: com.facebook.imagepipeline.producers.i0 */
public class C9832i0 extends C9805d {
    public C9832i0(C9884a aVar, ProducerContext producerContext) {
        this(aVar, producerContext.getId(), producerContext.getListener(), producerContext.getCallerContext(), producerContext.getLowestPermittedRequestLevel(), producerContext.isPrefetch(), producerContext.isIntermediateResultExpected(), producerContext.getPriority());
    }

    public C9832i0(C9884a aVar, String str, ProducerListener producerListener, Object obj, C9886b bVar, boolean z, boolean z2, C9700d dVar) {
        super(aVar, str, producerListener, obj, bVar, z, z2, dVar);
    }
}
