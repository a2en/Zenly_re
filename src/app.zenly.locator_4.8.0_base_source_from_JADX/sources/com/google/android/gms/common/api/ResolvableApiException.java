package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.IntentSender.SendIntentException;

public class ResolvableApiException extends ApiException {
    public ResolvableApiException(Status status) {
        super(status);
    }

    /* renamed from: a */
    public void mo27051a(Activity activity, int i) throws SendIntentException {
        this.f26268e.startResolutionForResult(activity, i);
    }
}
