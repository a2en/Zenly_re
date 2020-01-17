package com.google.android.gms.common.util.p310o;

import com.google.android.gms.common.internal.C10123l;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.gms.common.util.o.a */
public class C10178a implements ThreadFactory {

    /* renamed from: e */
    private final String f26731e;

    /* renamed from: f */
    private final ThreadFactory f26732f;

    public C10178a(String str) {
        this(str, 0);
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f26732f.newThread(new C10179b(runnable, 0));
        newThread.setName(this.f26731e);
        return newThread;
    }

    private C10178a(String str, int i) {
        this.f26732f = Executors.defaultThreadFactory();
        C10123l.m25506a(str, (Object) "Name must not be null");
        this.f26731e = str;
    }
}
