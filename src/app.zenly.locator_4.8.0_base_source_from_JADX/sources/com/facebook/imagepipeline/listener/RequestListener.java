package com.facebook.imagepipeline.listener;

import com.facebook.imagepipeline.producers.ProducerListener;
import com.facebook.imagepipeline.request.C9884a;

public interface RequestListener extends ProducerListener {
    void onRequestCancellation(String str);

    void onRequestFailure(C9884a aVar, String str, Throwable th, boolean z);

    void onRequestStart(C9884a aVar, Object obj, String str, boolean z);

    void onRequestSuccess(C9884a aVar, String str, boolean z);
}
