package p389io.reactivex.internal.util;

import java.util.concurrent.atomic.AtomicLong;
import p389io.reactivex.p403k.C12768a;

/* renamed from: io.reactivex.internal.util.c */
public final class C12753c {
    /* renamed from: a */
    public static long m33345a(long j, long j2) {
        long j3 = j + j2;
        if (j3 < 0) {
            return Long.MAX_VALUE;
        }
        return j3;
    }

    /* renamed from: a */
    public static long m33346a(AtomicLong atomicLong, long j) {
        long j2;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j2, m33345a(j2, j)));
        return j2;
    }

    /* renamed from: b */
    public static long m33347b(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("More produced than requested: ");
                sb.append(j3);
                C12768a.m33415b((Throwable) new IllegalStateException(sb.toString()));
                j3 = 0;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        return j3;
    }
}
