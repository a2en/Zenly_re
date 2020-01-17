package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class JobIntentService extends Service {

    /* renamed from: k */
    static final Object f2391k = new Object();

    /* renamed from: l */
    static final HashMap<ComponentName, C0506h> f2392l = new HashMap<>();

    /* renamed from: e */
    C0499b f2393e;

    /* renamed from: f */
    C0506h f2394f;

    /* renamed from: g */
    C0498a f2395g;

    /* renamed from: h */
    boolean f2396h = false;

    /* renamed from: i */
    boolean f2397i = false;

    /* renamed from: j */
    final ArrayList<C0501d> f2398j;

    /* renamed from: androidx.core.app.JobIntentService$a */
    final class C0498a extends AsyncTask<Void, Void, Void> {
        C0498a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                C0502e a = JobIntentService.this.mo2939a();
                if (a == null) {
                    return null;
                }
                JobIntentService.this.mo2940a(a.getIntent());
                a.complete();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            JobIntentService.this.mo2944d();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onCancelled(Void voidR) {
            JobIntentService.this.mo2944d();
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$b */
    interface C0499b {
        /* renamed from: a */
        IBinder mo2955a();

        /* renamed from: b */
        C0502e mo2956b();
    }

    /* renamed from: androidx.core.app.JobIntentService$c */
    static final class C0500c extends C0506h {

        /* renamed from: d */
        private final Context f2400d;

        /* renamed from: e */
        private final WakeLock f2401e;

        /* renamed from: f */
        private final WakeLock f2402f;

        /* renamed from: g */
        boolean f2403g;

        /* renamed from: h */
        boolean f2404h;

        C0500c(Context context, ComponentName componentName) {
            super(componentName);
            this.f2400d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            StringBuilder sb = new StringBuilder();
            sb.append(componentName.getClassName());
            sb.append(":launch");
            this.f2401e = powerManager.newWakeLock(1, sb.toString());
            this.f2401e.setReferenceCounted(false);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(componentName.getClassName());
            sb2.append(":run");
            this.f2402f = powerManager.newWakeLock(1, sb2.toString());
            this.f2402f.setReferenceCounted(false);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2958a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f2415a);
            if (this.f2400d.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.f2403g) {
                        this.f2403g = true;
                        if (!this.f2404h) {
                            this.f2401e.acquire(60000);
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo2959b() {
            synchronized (this) {
                if (!this.f2404h) {
                    this.f2404h = true;
                    this.f2402f.acquire(600000);
                    this.f2401e.release();
                }
            }
        }

        /* renamed from: c */
        public void mo2960c() {
            synchronized (this) {
                this.f2403g = false;
            }
        }

        /* renamed from: a */
        public void mo2957a() {
            synchronized (this) {
                if (this.f2404h) {
                    if (this.f2403g) {
                        this.f2401e.acquire(60000);
                    }
                    this.f2404h = false;
                    this.f2402f.release();
                }
            }
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$d */
    final class C0501d implements C0502e {

        /* renamed from: a */
        final Intent f2405a;

        /* renamed from: b */
        final int f2406b;

        C0501d(Intent intent, int i) {
            this.f2405a = intent;
            this.f2406b = i;
        }

        public void complete() {
            JobIntentService.this.stopSelf(this.f2406b);
        }

        public Intent getIntent() {
            return this.f2405a;
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$e */
    interface C0502e {
        void complete();

        Intent getIntent();
    }

    /* renamed from: androidx.core.app.JobIntentService$f */
    static final class C0503f extends JobServiceEngine implements C0499b {

        /* renamed from: a */
        final JobIntentService f2408a;

        /* renamed from: b */
        final Object f2409b = new Object();

        /* renamed from: c */
        JobParameters f2410c;

        /* renamed from: androidx.core.app.JobIntentService$f$a */
        final class C0504a implements C0502e {

            /* renamed from: a */
            final JobWorkItem f2411a;

            C0504a(JobWorkItem jobWorkItem) {
                this.f2411a = jobWorkItem;
            }

            public void complete() {
                synchronized (C0503f.this.f2409b) {
                    if (C0503f.this.f2410c != null) {
                        C0503f.this.f2410c.completeWork(this.f2411a);
                    }
                }
            }

            public Intent getIntent() {
                return this.f2411a.getIntent();
            }
        }

        C0503f(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f2408a = jobIntentService;
        }

        /* renamed from: a */
        public IBinder mo2955a() {
            return getBinder();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
            r1.getIntent().setExtrasClassLoader(r3.f2408a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
            return new androidx.core.app.JobIntentService.C0503f.C0504a(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r1 == null) goto L_0x0026;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.core.app.JobIntentService.C0502e mo2956b() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f2409b
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r3.f2410c     // Catch:{ all -> 0x0027 }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                return r2
            L_0x000a:
                android.app.job.JobParameters r1 = r3.f2410c     // Catch:{ all -> 0x0027 }
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ all -> 0x0027 }
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                if (r1 == 0) goto L_0x0026
                android.content.Intent r0 = r1.getIntent()
                androidx.core.app.JobIntentService r2 = r3.f2408a
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                androidx.core.app.JobIntentService$f$a r0 = new androidx.core.app.JobIntentService$f$a
                r0.<init>(r1)
                return r0
            L_0x0026:
                return r2
            L_0x0027:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0027 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.JobIntentService.C0503f.mo2956b():androidx.core.app.JobIntentService$e");
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f2410c = jobParameters;
            this.f2408a.mo2941a(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean b = this.f2408a.mo2942b();
            synchronized (this.f2409b) {
                this.f2410c = null;
            }
            return b;
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$g */
    static final class C0505g extends C0506h {

        /* renamed from: d */
        private final JobInfo f2413d;

        /* renamed from: e */
        private final JobScheduler f2414e;

        C0505g(Context context, ComponentName componentName, int i) {
            super(componentName);
            mo2965a(i);
            this.f2413d = new Builder(i, this.f2415a).setOverrideDeadline(0).build();
            this.f2414e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2958a(Intent intent) {
            this.f2414e.enqueue(this.f2413d, new JobWorkItem(intent));
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$h */
    static abstract class C0506h {

        /* renamed from: a */
        final ComponentName f2415a;

        /* renamed from: b */
        boolean f2416b;

        /* renamed from: c */
        int f2417c;

        C0506h(ComponentName componentName) {
            this.f2415a = componentName;
        }

        /* renamed from: a */
        public void mo2957a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2965a(int i) {
            if (!this.f2416b) {
                this.f2416b = true;
                this.f2417c = i;
            } else if (this.f2417c != i) {
                StringBuilder sb = new StringBuilder();
                sb.append("Given job ID ");
                sb.append(i);
                sb.append(" is different than previous ");
                sb.append(this.f2417c);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo2958a(Intent intent);

        /* renamed from: b */
        public void mo2959b() {
        }

        /* renamed from: c */
        public void mo2960c() {
        }
    }

    public JobIntentService() {
        if (VERSION.SDK_INT >= 26) {
            this.f2398j = null;
        } else {
            this.f2398j = new ArrayList<>();
        }
    }

    /* renamed from: a */
    public static void m2361a(Context context, Class cls, int i, Intent intent) {
        m2360a(context, new ComponentName(context, cls), i, intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo2940a(Intent intent);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo2942b() {
        C0498a aVar = this.f2395g;
        if (aVar != null) {
            aVar.cancel(this.f2396h);
        }
        return mo2943c();
    }

    /* renamed from: c */
    public boolean mo2943c() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo2944d() {
        ArrayList<C0501d> arrayList = this.f2398j;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f2395g = null;
                if (this.f2398j != null && this.f2398j.size() > 0) {
                    mo2941a(false);
                } else if (!this.f2397i) {
                    this.f2394f.mo2957a();
                }
            }
        }
    }

    public IBinder onBind(Intent intent) {
        C0499b bVar = this.f2393e;
        if (bVar != null) {
            return bVar.mo2955a();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (VERSION.SDK_INT >= 26) {
            this.f2393e = new C0503f(this);
            this.f2394f = null;
            return;
        }
        this.f2393e = null;
        this.f2394f = m2359a((Context) this, new ComponentName(this, getClass()), false, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList<C0501d> arrayList = this.f2398j;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f2397i = true;
                this.f2394f.mo2957a();
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.f2398j == null) {
            return 2;
        }
        this.f2394f.mo2960c();
        synchronized (this.f2398j) {
            ArrayList<C0501d> arrayList = this.f2398j;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C0501d(intent, i2));
            mo2941a(true);
        }
        return 3;
    }

    /* renamed from: a */
    public static void m2360a(Context context, ComponentName componentName, int i, Intent intent) {
        if (intent != null) {
            synchronized (f2391k) {
                C0506h a = m2359a(context, componentName, true, i);
                a.mo2965a(i);
                a.mo2958a(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    /* renamed from: a */
    static C0506h m2359a(Context context, ComponentName componentName, boolean z, int i) {
        C0506h hVar;
        C0506h hVar2 = (C0506h) f2392l.get(componentName);
        if (hVar2 != null) {
            return hVar2;
        }
        if (VERSION.SDK_INT < 26) {
            hVar = new C0500c(context, componentName);
        } else if (z) {
            hVar = new C0505g(context, componentName, i);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        C0506h hVar3 = hVar;
        f2392l.put(componentName, hVar3);
        return hVar3;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2941a(boolean z) {
        if (this.f2395g == null) {
            this.f2395g = new C0498a();
            C0506h hVar = this.f2394f;
            if (hVar != null && z) {
                hVar.mo2959b();
            }
            this.f2395g.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0502e mo2939a() {
        C0499b bVar = this.f2393e;
        if (bVar != null) {
            return bVar.mo2956b();
        }
        synchronized (this.f2398j) {
            if (this.f2398j.size() <= 0) {
                return null;
            }
            C0502e eVar = (C0502e) this.f2398j.remove(0);
            return eVar;
        }
    }
}
