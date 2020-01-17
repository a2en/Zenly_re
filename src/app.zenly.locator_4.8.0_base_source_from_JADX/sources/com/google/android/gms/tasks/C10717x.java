package com.google.android.gms.tasks;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.google.android.gms.tasks.x */
final class C10717x<TResult> {

    /* renamed from: a */
    private final Object f27831a = new Object();

    /* renamed from: b */
    private Queue<C10716w<TResult>> f27832b;

    /* renamed from: c */
    private boolean f27833c;

    C10717x() {
    }

    /* renamed from: a */
    public final void mo29343a(C10716w<TResult> wVar) {
        synchronized (this.f27831a) {
            if (this.f27832b == null) {
                this.f27832b = new ArrayDeque();
            }
            this.f27832b.add(wVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1 = r2.f27831a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = (com.google.android.gms.tasks.C10716w) r2.f27832b.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        r2.f27833c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        r0.onComplete(r3);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo29342a(com.google.android.gms.tasks.C10693c<TResult> r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f27831a
            monitor-enter(r0)
            java.util.Queue<com.google.android.gms.tasks.w<TResult>> r1 = r2.f27832b     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x002a
            boolean r1 = r2.f27833c     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x000c
            goto L_0x002a
        L_0x000c:
            r1 = 1
            r2.f27833c = r1     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
        L_0x0010:
            java.lang.Object r1 = r2.f27831a
            monitor-enter(r1)
            java.util.Queue<com.google.android.gms.tasks.w<TResult>> r0 = r2.f27832b     // Catch:{ all -> 0x0027 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0027 }
            com.google.android.gms.tasks.w r0 = (com.google.android.gms.tasks.C10716w) r0     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0022
            r3 = 0
            r2.f27833c = r3     // Catch:{ all -> 0x0027 }
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            return
        L_0x0022:
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            r0.onComplete(r3)
            goto L_0x0010
        L_0x0027:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            throw r3
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.tasks.C10717x.mo29342a(com.google.android.gms.tasks.c):void");
    }
}
