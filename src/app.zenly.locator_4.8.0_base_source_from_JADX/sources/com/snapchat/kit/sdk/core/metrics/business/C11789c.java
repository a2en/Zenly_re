package com.snapchat.kit.sdk.core.metrics.business;

import android.os.Build.VERSION;
import com.snapchat.kit.sdk.core.metrics.C11772a;
import com.snapchat.kit.sdk.core.metrics.MetricQueue;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent;
import com.snapchat.kit.sdk.core.metrics.model.ServerEvent.Builder;

/* renamed from: com.snapchat.kit.sdk.core.metrics.business.c */
public class C11789c implements MetricQueue<ServerEvent> {

    /* renamed from: a */
    private final C11794h f30548a;

    /* renamed from: b */
    private final C11772a<ServerEvent> f30549b;

    C11789c(C11794h hVar, C11772a<ServerEvent> aVar) {
        this.f30548a = hVar;
        this.f30549b = aVar;
    }

    /* renamed from: a */
    public void push(ServerEvent serverEvent) {
        Builder os_type = serverEvent.newBuilder().sequence_id(Long.valueOf(this.f30548a.mo34665b())).os_type("Android");
        String str = VERSION.RELEASE;
        if (str == null) {
            str = "";
        }
        this.f30549b.push(os_type.os_version(str).build());
    }
}
