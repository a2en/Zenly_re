package com.google.android.gms.common.api.internal;

import android.os.Bundle;

public interface ConnectionCallbacks {
    void onConnected(Bundle bundle);

    void onConnectionSuspended(int i);
}
