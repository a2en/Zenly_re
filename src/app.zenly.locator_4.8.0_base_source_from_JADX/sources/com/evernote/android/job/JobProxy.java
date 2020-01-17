package com.evernote.android.job;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.evernote.android.job.C9435b.C9438c;
import com.evernote.android.job.util.C9469c;
import com.evernote.android.job.util.C9471e;
import java.util.Locale;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public interface JobProxy {

    /* renamed from: com.evernote.android.job.JobProxy$a */
    public static final class C9433a {

        /* renamed from: e */
        private static final Object f24406e = new Object();

        /* renamed from: a */
        private final Context f24407a;

        /* renamed from: b */
        private final int f24408b;

        /* renamed from: c */
        private final C9469c f24409c;

        /* renamed from: d */
        private final C9447g f24410d;

        public C9433a(Service service, C9469c cVar, int i) {
            this((Context) service, cVar, i);
        }

        /* renamed from: a */
        private static long m22815a(long j, long j2) {
            long j3 = j + j2;
            boolean z = true;
            boolean z2 = (j2 ^ j) < 0;
            if ((j ^ j3) < 0) {
                z = false;
            }
            return m22816a(j3, z2 | z);
        }

        /* renamed from: a */
        private static long m22816a(long j, boolean z) {
            if (z) {
                return j;
            }
            return Long.MAX_VALUE;
        }

        /* renamed from: b */
        public static long m22821b(C9450h hVar) {
            return m22815a(m22826g(hVar), (m22823d(hVar) - m22826g(hVar)) / 2);
        }

        /* renamed from: c */
        public static long m22822c(C9450h hVar) {
            return m22815a(m22827h(hVar), (m22824e(hVar) - m22827h(hVar)) / 2);
        }

        /* renamed from: d */
        public static long m22823d(C9450h hVar) {
            if (hVar.mo25343g() > 0) {
                return hVar.mo25338c();
            }
            return hVar.mo25340e();
        }

        /* renamed from: e */
        public static long m22824e(C9450h hVar) {
            return hVar.mo25346i();
        }

        /* renamed from: f */
        public static int m22825f(C9450h hVar) {
            return hVar.mo25343g();
        }

        /* renamed from: g */
        public static long m22826g(C9450h hVar) {
            if (hVar.mo25343g() > 0) {
                return hVar.mo25338c();
            }
            return hVar.mo25350m();
        }

        /* renamed from: h */
        public static long m22827h(C9450h hVar) {
            return Math.max(1, hVar.mo25346i() - hVar.mo25344h());
        }

        C9433a(Context context, C9469c cVar, int i) {
            C9447g gVar;
            this.f24407a = context;
            this.f24408b = i;
            this.f24409c = cVar;
            try {
                gVar = C9447g.m22878a(context);
            } catch (JobManagerCreateException e) {
                this.f24409c.mo25410a((Throwable) e);
                gVar = null;
            }
            this.f24410d = gVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e5, code lost:
            return r1;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.evernote.android.job.C9450h mo25255a(boolean r13, boolean r14) {
            /*
                r12 = this;
                java.lang.Object r0 = f24406e
                monitor-enter(r0)
                com.evernote.android.job.g r1 = r12.f24410d     // Catch:{ all -> 0x00e6 }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x00e6 }
                return r2
            L_0x000a:
                com.evernote.android.job.g r1 = r12.f24410d     // Catch:{ all -> 0x00e6 }
                int r3 = r12.f24408b     // Catch:{ all -> 0x00e6 }
                r4 = 1
                com.evernote.android.job.h r1 = r1.mo25309a(r3, r4)     // Catch:{ all -> 0x00e6 }
                com.evernote.android.job.g r3 = r12.f24410d     // Catch:{ all -> 0x00e6 }
                int r5 = r12.f24408b     // Catch:{ all -> 0x00e6 }
                com.evernote.android.job.b r3 = r3.mo25314b(r5)     // Catch:{ all -> 0x00e6 }
                r5 = 0
                if (r1 == 0) goto L_0x0026
                boolean r6 = r1.mo25355r()     // Catch:{ all -> 0x00e6 }
                if (r6 == 0) goto L_0x0026
                r6 = 1
                goto L_0x0027
            L_0x0026:
                r6 = 0
            L_0x0027:
                r7 = 2
                if (r3 == 0) goto L_0x0045
                boolean r8 = r3.isFinished()     // Catch:{ all -> 0x00e6 }
                if (r8 != 0) goto L_0x0045
                com.evernote.android.job.util.c r13 = r12.f24409c     // Catch:{ all -> 0x00e6 }
                java.lang.String r14 = "Job %d is already running, %s"
                java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ all -> 0x00e6 }
                int r6 = r12.f24408b     // Catch:{ all -> 0x00e6 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00e6 }
                r3[r5] = r6     // Catch:{ all -> 0x00e6 }
                r3[r4] = r1     // Catch:{ all -> 0x00e6 }
                r13.mo25409a(r14, r3)     // Catch:{ all -> 0x00e6 }
                monitor-exit(r0)     // Catch:{ all -> 0x00e6 }
                return r2
            L_0x0045:
                if (r3 == 0) goto L_0x0061
                if (r6 != 0) goto L_0x0061
                com.evernote.android.job.util.c r14 = r12.f24409c     // Catch:{ all -> 0x00e6 }
                java.lang.String r3 = "Job %d already finished, %s"
                java.lang.Object[] r6 = new java.lang.Object[r7]     // Catch:{ all -> 0x00e6 }
                int r7 = r12.f24408b     // Catch:{ all -> 0x00e6 }
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x00e6 }
                r6[r5] = r7     // Catch:{ all -> 0x00e6 }
                r6[r4] = r1     // Catch:{ all -> 0x00e6 }
                r14.mo25409a(r3, r6)     // Catch:{ all -> 0x00e6 }
                r12.m22819a(r13)     // Catch:{ all -> 0x00e6 }
                monitor-exit(r0)     // Catch:{ all -> 0x00e6 }
                return r2
            L_0x0061:
                if (r3 == 0) goto L_0x0087
                long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00e6 }
                long r10 = r3.getFinishedTimeStamp()     // Catch:{ all -> 0x00e6 }
                long r8 = r8 - r10
                r10 = 2000(0x7d0, double:9.88E-321)
                int r3 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r3 >= 0) goto L_0x0087
                com.evernote.android.job.util.c r13 = r12.f24409c     // Catch:{ all -> 0x00e6 }
                java.lang.String r14 = "Job %d is periodic and just finished, %s"
                java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ all -> 0x00e6 }
                int r6 = r12.f24408b     // Catch:{ all -> 0x00e6 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00e6 }
                r3[r5] = r6     // Catch:{ all -> 0x00e6 }
                r3[r4] = r1     // Catch:{ all -> 0x00e6 }
                r13.mo25409a(r14, r3)     // Catch:{ all -> 0x00e6 }
                monitor-exit(r0)     // Catch:{ all -> 0x00e6 }
                return r2
            L_0x0087:
                if (r1 == 0) goto L_0x00a4
                boolean r3 = r1.mo25356s()     // Catch:{ all -> 0x00e6 }
                if (r3 == 0) goto L_0x00a4
                com.evernote.android.job.util.c r13 = r12.f24409c     // Catch:{ all -> 0x00e6 }
                java.lang.String r14 = "Request %d already started, %s"
                java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ all -> 0x00e6 }
                int r6 = r12.f24408b     // Catch:{ all -> 0x00e6 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00e6 }
                r3[r5] = r6     // Catch:{ all -> 0x00e6 }
                r3[r4] = r1     // Catch:{ all -> 0x00e6 }
                r13.mo25409a(r14, r3)     // Catch:{ all -> 0x00e6 }
                monitor-exit(r0)     // Catch:{ all -> 0x00e6 }
                return r2
            L_0x00a4:
                if (r1 == 0) goto L_0x00c7
                com.evernote.android.job.g r3 = r12.f24410d     // Catch:{ all -> 0x00e6 }
                com.evernote.android.job.f r3 = r3.mo25320e()     // Catch:{ all -> 0x00e6 }
                boolean r3 = r3.mo25302a(r1)     // Catch:{ all -> 0x00e6 }
                if (r3 == 0) goto L_0x00c7
                com.evernote.android.job.util.c r13 = r12.f24409c     // Catch:{ all -> 0x00e6 }
                java.lang.String r14 = "Request %d is in the queue to start, %s"
                java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch:{ all -> 0x00e6 }
                int r6 = r12.f24408b     // Catch:{ all -> 0x00e6 }
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00e6 }
                r3[r5] = r6     // Catch:{ all -> 0x00e6 }
                r3[r4] = r1     // Catch:{ all -> 0x00e6 }
                r13.mo25409a(r14, r3)     // Catch:{ all -> 0x00e6 }
                monitor-exit(r0)     // Catch:{ all -> 0x00e6 }
                return r2
            L_0x00c7:
                if (r1 != 0) goto L_0x00df
                com.evernote.android.job.util.c r14 = r12.f24409c     // Catch:{ all -> 0x00e6 }
                java.lang.String r1 = "Request for ID %d was null"
                java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ all -> 0x00e6 }
                int r4 = r12.f24408b     // Catch:{ all -> 0x00e6 }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x00e6 }
                r3[r5] = r4     // Catch:{ all -> 0x00e6 }
                r14.mo25409a(r1, r3)     // Catch:{ all -> 0x00e6 }
                r12.m22819a(r13)     // Catch:{ all -> 0x00e6 }
                monitor-exit(r0)     // Catch:{ all -> 0x00e6 }
                return r2
            L_0x00df:
                if (r14 == 0) goto L_0x00e4
                r12.mo25256a(r1)     // Catch:{ all -> 0x00e6 }
            L_0x00e4:
                monitor-exit(r0)     // Catch:{ all -> 0x00e6 }
                return r1
            L_0x00e6:
                r13 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x00e6 }
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.JobProxy.C9433a.mo25255a(boolean, boolean):com.evernote.android.job.h");
        }

        /* renamed from: a */
        public void mo25256a(C9450h hVar) {
            this.f24410d.mo25320e().mo25304b(hVar);
        }

        /* renamed from: a */
        public C9438c mo25254a(C9450h hVar, Bundle bundle) {
            String str;
            long currentTimeMillis = System.currentTimeMillis() - hVar.mo25349l();
            if (hVar.mo25355r()) {
                str = String.format(Locale.US, "interval %s, flex %s", new Object[]{C9471e.m23048a(hVar.mo25346i()), C9471e.m23048a(hVar.mo25344h())});
            } else if (hVar.mo25347j().mo25291c()) {
                str = String.format(Locale.US, "start %s, end %s", new Object[]{C9471e.m23048a(m22826g(hVar)), C9471e.m23048a(m22823d(hVar))});
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("delay ");
                sb.append(C9471e.m23048a(m22821b(hVar)));
                str = sb.toString();
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.f24409c.mo25417d("Running JobRequest on a main thread, this could cause stutter or ANR in your app.");
            }
            this.f24409c.mo25409a("Run job, %s, waited %s, %s", hVar, C9471e.m23048a(currentTimeMillis), str);
            C9444f e = this.f24410d.mo25320e();
            C9435b bVar = null;
            try {
                bVar = this.f24410d.mo25319d().mo25293a(hVar.mo25351n());
                if (!hVar.mo25355r()) {
                    hVar.mo25336b(true);
                }
                if (bundle == null) {
                    bundle = Bundle.EMPTY;
                }
                Future a = e.mo25299a(this.f24407a, hVar, bVar, bundle);
                if (a == null) {
                    C9438c cVar = C9438c.FAILURE;
                    if (!hVar.mo25355r()) {
                        this.f24410d.mo25321f().mo25385b(hVar);
                    } else if (hVar.mo25354q() && (bVar == null || !bVar.isDeleted())) {
                        this.f24410d.mo25321f().mo25385b(hVar);
                        hVar.mo25332a(false, false);
                    }
                    return cVar;
                }
                C9438c cVar2 = (C9438c) a.get();
                this.f24409c.mo25409a("Finished job, %s %s", hVar, cVar2);
                if (!hVar.mo25355r()) {
                    this.f24410d.mo25321f().mo25385b(hVar);
                } else if (hVar.mo25354q() && (bVar == null || !bVar.isDeleted())) {
                    this.f24410d.mo25321f().mo25385b(hVar);
                    hVar.mo25332a(false, false);
                }
                return cVar2;
            } catch (InterruptedException | ExecutionException e2) {
                this.f24409c.mo25410a(e2);
                if (bVar != null) {
                    bVar.cancel();
                    this.f24409c.mo25413b("Canceled %s", hVar);
                }
                C9438c cVar3 = C9438c.FAILURE;
                if (!hVar.mo25355r()) {
                    this.f24410d.mo25321f().mo25385b(hVar);
                } else if (hVar.mo25354q() && (bVar == null || !bVar.isDeleted())) {
                    this.f24410d.mo25321f().mo25385b(hVar);
                    hVar.mo25332a(false, false);
                }
                return cVar3;
            } catch (Throwable th) {
                if (!hVar.mo25355r()) {
                    this.f24410d.mo25321f().mo25385b(hVar);
                } else if (hVar.mo25354q() && (bVar == null || !bVar.isDeleted())) {
                    this.f24410d.mo25321f().mo25385b(hVar);
                    hVar.mo25332a(false, false);
                }
                throw th;
            }
        }

        /* renamed from: a */
        private void m22819a(boolean z) {
            if (z) {
                m22818a(this.f24407a, this.f24408b);
            }
        }

        /* renamed from: a */
        static void m22818a(Context context, int i) {
            C9439c[] values;
            for (C9439c cVar : C9439c.values()) {
                if (cVar.mo25290b(context)) {
                    try {
                        cVar.mo25287a(context).cancel(i);
                    } catch (Exception unused) {
                    }
                }
            }
        }

        /* renamed from: a */
        public static ComponentName m22817a(Context context, Intent intent) {
            return C9460k.m23011a(context, intent);
        }

        /* renamed from: a */
        public static boolean m22820a(Intent intent) {
            return C9460k.m23015a(intent);
        }
    }

    void cancel(int i);

    boolean isPlatformJobScheduled(C9450h hVar);

    void plantOneOff(C9450h hVar);

    void plantPeriodic(C9450h hVar);

    void plantPeriodicFlexSupport(C9450h hVar);
}
