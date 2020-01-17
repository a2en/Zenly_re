package p389io.reactivex.internal.util;

import p389io.reactivex.internal.schedulers.NonBlockingThread;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.util.d */
public final class C12754d {
    /* renamed from: a */
    public static void m33348a() {
        if (!C12768a.m33409a()) {
            return;
        }
        if ((Thread.currentThread() instanceof NonBlockingThread) || C12768a.m33416b()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Attempt to block on a Scheduler ");
            sb.append(Thread.currentThread().getName());
            sb.append(" that doesn't support blocking operators as they may lead to deadlock");
            throw new IllegalStateException(sb.toString());
        }
    }
}
