package com.google.firebase.internal;

import com.google.android.gms.tasks.C10693c;

@Deprecated
public interface InternalTokenProvider {
    C10693c<Object> getAccessToken(boolean z);

    String getUid();
}
