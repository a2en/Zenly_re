package com.facebook.imagepipeline.debug;

import com.facebook.common.references.SharedReference;

public interface CloseableReferenceLeakTracker {

    public interface Listener {
        void onCloseableReferenceLeak(SharedReference<Object> sharedReference, Throwable th);
    }

    boolean isSet();

    void setListener(Listener listener);

    void trackCloseableReferenceLeak(SharedReference<Object> sharedReference, Throwable th);
}
