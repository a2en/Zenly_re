package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public interface Service {

    /* renamed from: com.google.common.util.concurrent.Service$b */
    public static abstract class C11007b {
    }

    /* renamed from: com.google.common.util.concurrent.Service$c */
    public enum C11008c {
        NEW {
        },
        STARTING {
        },
        RUNNING {
        },
        STOPPING {
        },
        TERMINATED {
        },
        FAILED {
        };
    }

    void addListener(C11007b bVar, Executor executor);

    void awaitRunning();

    void awaitRunning(long j, TimeUnit timeUnit) throws TimeoutException;

    void awaitTerminated();

    void awaitTerminated(long j, TimeUnit timeUnit) throws TimeoutException;

    Throwable failureCause();

    boolean isRunning();

    Service startAsync();

    C11008c state();

    Service stopAsync();
}
