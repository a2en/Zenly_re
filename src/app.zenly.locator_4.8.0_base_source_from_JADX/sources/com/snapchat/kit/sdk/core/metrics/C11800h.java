package com.snapchat.kit.sdk.core.metrics;

import dagger.internal.C12021c;
import dagger.internal.Factory;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.snapchat.kit.sdk.core.metrics.h */
public final class C11800h implements Factory<ScheduledExecutorService> {

    /* renamed from: a */
    private static final C11800h f30564a = new C11800h();

    /* renamed from: b */
    public static Factory<ScheduledExecutorService> m30978b() {
        return f30564a;
    }

    /* renamed from: a */
    public ScheduledExecutorService get() {
        ScheduledExecutorService a = C11796d.m30971a();
        C12021c.m31671a(a, "Cannot return null from a non-@Nullable @Provides method");
        return a;
    }
}
