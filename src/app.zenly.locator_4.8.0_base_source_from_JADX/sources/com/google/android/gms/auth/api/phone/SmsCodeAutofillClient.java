package com.google.android.gms.auth.api.phone;

import com.google.android.gms.common.api.Api.ApiOptions.C9989a;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.C10693c;

public interface SmsCodeAutofillClient extends HasApiKey<C9989a> {
    C10693c<Integer> checkPermissionState();

    C10693c<Boolean> hasOngoingSmsRequest(String str);

    C10693c<Void> startSmsCodeRetriever();
}
