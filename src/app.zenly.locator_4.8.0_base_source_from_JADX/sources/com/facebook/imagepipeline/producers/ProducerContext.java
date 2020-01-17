package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.common.C9700d;
import com.facebook.imagepipeline.request.C9884a;
import com.facebook.imagepipeline.request.C9884a.C9886b;

public interface ProducerContext {
    void addCallbacks(ProducerContextCallbacks producerContextCallbacks);

    Object getCallerContext();

    String getId();

    C9884a getImageRequest();

    ProducerListener getListener();

    C9886b getLowestPermittedRequestLevel();

    C9700d getPriority();

    boolean isIntermediateResultExpected();

    boolean isPrefetch();
}
