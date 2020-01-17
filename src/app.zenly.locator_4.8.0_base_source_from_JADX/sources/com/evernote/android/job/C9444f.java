package com.evernote.android.job;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.PowerManager.WakeLock;
import android.util.LruCache;
import android.util.SparseArray;
import com.evernote.android.job.C9435b.C9438c;
import com.evernote.android.job.util.C9469c;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.evernote.android.job.f */
class C9444f {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final C9469c f24448e = new C9469c("JobExecutor");
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final long f24449f = TimeUnit.MINUTES.toMillis(3);

    /* renamed from: a */
    private final SparseArray<C9435b> f24450a = new SparseArray<>();

    /* renamed from: b */
    private final LruCache<Integer, WeakReference<C9435b>> f24451b = new LruCache<>(20);

    /* renamed from: c */
    private final SparseArray<C9438c> f24452c = new SparseArray<>();

    /* renamed from: d */
    private final Set<C9450h> f24453d = new HashSet();

    /* renamed from: com.evernote.android.job.f$b */
    private final class C9446b implements Callable<C9438c> {

        /* renamed from: e */
        private final C9435b f24454e;

        /* renamed from: f */
        private final WakeLock f24455f;

        /* renamed from: a */
        private C9438c m22876a() {
            try {
                C9438c runJob = this.f24454e.runJob();
                C9444f.f24448e.mo25416c("Finished %s", this.f24454e);
                m22877a(this.f24454e, runJob);
                return runJob;
            } catch (Throwable th) {
                C9444f.f24448e.mo25411a(th, "Crashed %s", this.f24454e);
                return this.f24454e.getResult();
            }
        }

        private C9446b(C9435b bVar) {
            this.f24454e = bVar;
            this.f24455f = C9460k.m23012a(this.f24454e.getContext(), "JobExecutor", C9444f.f24449f);
        }

        public C9438c call() throws Exception {
            String str = "Wake lock was not held after job %s was done. The job took too long to complete. This could have unintended side effects on your app.";
            try {
                C9460k.m23014a(this.f24454e.getContext(), this.f24455f, C9444f.f24449f);
                return m22876a();
            } finally {
                C9444f.this.mo25301a(this.f24454e);
                WakeLock wakeLock = this.f24455f;
                if (wakeLock == null || !wakeLock.isHeld()) {
                    C9444f.f24448e.mo25418d(str, this.f24454e);
                }
                C9460k.m23013a(this.f24455f);
            }
        }

        /* renamed from: a */
        private void m22877a(C9435b bVar, C9438c cVar) {
            C9450h c = this.f24454e.getParams().mo25282c();
            boolean z = false;
            boolean z2 = true;
            if (!c.mo25355r() && C9438c.RESCHEDULE.equals(cVar) && !bVar.isDeleted()) {
                c = c.mo25332a(true, true);
                this.f24454e.onReschedule(c.mo25348k());
            } else if (!c.mo25355r()) {
                z2 = false;
            } else if (!C9438c.SUCCESS.equals(cVar)) {
                z = true;
            }
            if (bVar.isDeleted()) {
                return;
            }
            if (z || z2) {
                c.mo25337b(z, z2);
            }
        }
    }

    /* renamed from: a */
    public synchronized Future<C9438c> mo25299a(Context context, C9450h hVar, C9435b bVar, Bundle bundle) {
        this.f24453d.remove(hVar);
        if (bVar == null) {
            f24448e.mo25418d("JobCreator returned null for tag %s", hVar.mo25351n());
            return null;
        } else if (!bVar.isFinished()) {
            bVar.setContext(context).setRequest(hVar, bundle);
            f24448e.mo25416c("Executing %s, context %s", hVar, context.getClass().getSimpleName());
            this.f24450a.put(hVar.mo25348k(), bVar);
            return C9441d.m22855b().submit(new C9446b(bVar));
        } else {
            throw new IllegalStateException(String.format(Locale.ENGLISH, "Job for tag %s was already run, a creator should always create a new Job instance", new Object[]{hVar.mo25351n()}));
        }
    }

    /* renamed from: b */
    public synchronized Set<C9435b> mo25303b() {
        return mo25298a((String) null);
    }

    /* renamed from: b */
    public synchronized void mo25304b(C9450h hVar) {
        this.f24453d.add(hVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        return r2 != null ? (com.evernote.android.job.C9435b) r2.get() : null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.evernote.android.job.C9435b mo25297a(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            android.util.SparseArray<com.evernote.android.job.b> r0 = r1.f24450a     // Catch:{ all -> 0x0025 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x0025 }
            com.evernote.android.job.b r0 = (com.evernote.android.job.C9435b) r0     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r1)
            return r0
        L_0x000d:
            android.util.LruCache<java.lang.Integer, java.lang.ref.WeakReference<com.evernote.android.job.b>> r0 = r1.f24451b     // Catch:{ all -> 0x0025 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0025 }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x0025 }
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch:{ all -> 0x0025 }
            if (r2 == 0) goto L_0x0022
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0025 }
            com.evernote.android.job.b r2 = (com.evernote.android.job.C9435b) r2     // Catch:{ all -> 0x0025 }
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            monitor-exit(r1)
            return r2
        L_0x0025:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.C9444f.mo25297a(int):com.evernote.android.job.b");
    }

    /* renamed from: a */
    public synchronized Set<C9435b> mo25298a(String str) {
        HashSet hashSet;
        hashSet = new HashSet();
        for (int i = 0; i < this.f24450a.size(); i++) {
            C9435b bVar = (C9435b) this.f24450a.valueAt(i);
            if (str == null || str.equals(bVar.getParams().mo25283d())) {
                hashSet.add(bVar);
            }
        }
        for (WeakReference weakReference : this.f24451b.snapshot().values()) {
            C9435b bVar2 = (C9435b) weakReference.get();
            if (bVar2 != null) {
                if (str == null || str.equals(bVar2.getParams().mo25283d())) {
                    hashSet.add(bVar2);
                }
            }
        }
        return hashSet;
    }

    /* renamed from: a */
    public SparseArray<C9438c> mo25296a() {
        return this.f24452c.clone();
    }

    /* renamed from: a */
    public synchronized boolean mo25302a(C9450h hVar) {
        boolean z;
        if (hVar != null) {
            if (this.f24453d.contains(hVar)) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized void mo25301a(C9435b bVar) {
        int b = bVar.getParams().mo25281b();
        this.f24450a.remove(b);
        mo25300a(this.f24451b);
        this.f24452c.put(b, bVar.getResult());
        this.f24451b.put(Integer.valueOf(b), new WeakReference(bVar));
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"UseSparseArrays"})
    /* renamed from: a */
    public void mo25300a(LruCache<Integer, WeakReference<C9435b>> lruCache) {
        HashMap hashMap = new HashMap(lruCache.snapshot());
        for (Integer num : hashMap.keySet()) {
            if (hashMap.get(num) == null || ((WeakReference) hashMap.get(num)).get() == null) {
                lruCache.remove(num);
            }
        }
    }
}
