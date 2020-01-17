package com.crashlytics.android.core;

import java.io.InputStream;
import p389io.fabric.sdk.android.services.network.PinningInfoProvider;

/* renamed from: com.crashlytics.android.core.p */
class C9401p implements PinningInfoProvider {

    /* renamed from: a */
    private final PinningInfoProvider f24358a;

    public C9401p(PinningInfoProvider pinningInfoProvider) {
        this.f24358a = pinningInfoProvider;
    }

    public String getKeyStorePassword() {
        return this.f24358a.getKeyStorePassword();
    }

    public InputStream getKeyStoreStream() {
        return this.f24358a.getKeyStoreStream();
    }

    public long getPinCreationTimeInMillis() {
        return -1;
    }

    public String[] getPins() {
        return this.f24358a.getPins();
    }
}
