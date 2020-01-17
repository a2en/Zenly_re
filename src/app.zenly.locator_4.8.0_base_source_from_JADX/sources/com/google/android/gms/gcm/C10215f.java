package com.google.android.gms.gcm;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.gcm.f */
final class C10215f implements ThreadFactory {

    /* renamed from: e */
    private final AtomicInteger f26819e = new AtomicInteger(1);

    C10215f(GcmTaskService gcmTaskService) {
    }

    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f26819e.getAndIncrement();
        StringBuilder sb = new StringBuilder(20);
        sb.append("gcm-task#");
        sb.append(andIncrement);
        Thread thread = new Thread(runnable, sb.toString());
        thread.setPriority(4);
        return thread;
    }
}
