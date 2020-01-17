package com.facebook.imagepipeline.listener;

import com.facebook.imagepipeline.request.C9884a;
import java.util.Map;

/* renamed from: com.facebook.imagepipeline.listener.a */
public class C9734a implements RequestListener {
    public void onProducerEvent(String str, String str2, String str3) {
    }

    public void onProducerFinishWithCancellation(String str, String str2, Map<String, String> map) {
    }

    public void onProducerFinishWithFailure(String str, String str2, Throwable th, Map<String, String> map) {
    }

    public void onProducerFinishWithSuccess(String str, String str2, Map<String, String> map) {
    }

    public void onProducerStart(String str, String str2) {
    }

    public void onRequestCancellation(String str) {
    }

    public void onRequestFailure(C9884a aVar, String str, Throwable th, boolean z) {
    }

    public void onRequestStart(C9884a aVar, Object obj, String str, boolean z) {
    }

    public void onRequestSuccess(C9884a aVar, String str, boolean z) {
    }

    public void onUltimateProducerReached(String str, String str2, boolean z) {
    }

    public boolean requiresExtraMap(String str) {
        return false;
    }
}
