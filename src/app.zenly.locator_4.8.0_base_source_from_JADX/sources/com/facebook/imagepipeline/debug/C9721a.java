package com.facebook.imagepipeline.debug;

import com.facebook.common.references.SharedReference;
import com.facebook.imagepipeline.debug.CloseableReferenceLeakTracker.Listener;

/* renamed from: com.facebook.imagepipeline.debug.a */
public class C9721a implements CloseableReferenceLeakTracker {
    public boolean isSet() {
        return false;
    }

    public void setListener(Listener listener) {
    }

    public void trackCloseableReferenceLeak(SharedReference<Object> sharedReference, Throwable th) {
    }
}
