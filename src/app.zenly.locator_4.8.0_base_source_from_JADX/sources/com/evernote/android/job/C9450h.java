package com.evernote.android.job;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import com.evernote.android.job.util.C9469c;
import com.evernote.android.job.util.C9470d;
import com.evernote.android.job.util.support.C9473b;
import java.util.concurrent.TimeUnit;

/* renamed from: com.evernote.android.job.h */
public final class C9450h {

    /* renamed from: g */
    public static final C9452b f24468g = C9452b.EXPONENTIAL;

    /* renamed from: h */
    public static final C9454d f24469h = C9454d.ANY;

    /* renamed from: i */
    public static final long f24470i = TimeUnit.MINUTES.toMillis(15);

    /* renamed from: j */
    public static final long f24471j = TimeUnit.MINUTES.toMillis(5);
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final C9469c f24472k = new C9469c("JobRequest");

    /* renamed from: a */
    private final C9453c f24473a;

    /* renamed from: b */
    private int f24474b;

    /* renamed from: c */
    private long f24475c;

    /* renamed from: d */
    private boolean f24476d;

    /* renamed from: e */
    private boolean f24477e;

    /* renamed from: f */
    private long f24478f;

    /* renamed from: com.evernote.android.job.h$a */
    static /* synthetic */ class C9451a {

        /* renamed from: a */
        static final /* synthetic */ int[] f24479a = new int[C9452b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                com.evernote.android.job.h$b[] r0 = com.evernote.android.job.C9450h.C9452b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f24479a = r0
                int[] r0 = f24479a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.evernote.android.job.h$b r1 = com.evernote.android.job.C9450h.C9452b.LINEAR     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f24479a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.evernote.android.job.h$b r1 = com.evernote.android.job.C9450h.C9452b.EXPONENTIAL     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.C9450h.C9451a.<clinit>():void");
        }
    }

    /* renamed from: com.evernote.android.job.h$b */
    public enum C9452b {
        LINEAR,
        EXPONENTIAL
    }

    /* renamed from: com.evernote.android.job.h$c */
    public static final class C9453c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f24483a;

        /* renamed from: b */
        final String f24484b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public long f24485c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public long f24486d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public long f24487e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C9452b f24488f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public long f24489g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public long f24490h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public boolean f24491i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public boolean f24492j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public boolean f24493k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public boolean f24494l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public boolean f24495m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public boolean f24496n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public C9454d f24497o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public C9473b f24498p;
        /* access modifiers changed from: private */

        /* renamed from: q */
        public String f24499q;
        /* access modifiers changed from: private */

        /* renamed from: r */
        public boolean f24500r;
        /* access modifiers changed from: private */

        /* renamed from: s */
        public boolean f24501s;
        /* access modifiers changed from: private */

        /* renamed from: t */
        public Bundle f24502t;

        /* synthetic */ C9453c(Cursor cursor, C9451a aVar) throws Exception {
            this(cursor);
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || C9453c.class != obj.getClass()) {
                return false;
            }
            if (this.f24483a != ((C9453c) obj).f24483a) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return this.f24483a;
        }

        /* synthetic */ C9453c(C9453c cVar, C9451a aVar) {
            this(cVar);
        }

        /* renamed from: b */
        public C9453c mo25373b(boolean z) {
            this.f24494l = z;
            return this;
        }

        /* renamed from: c */
        public C9453c mo25374c(boolean z) {
            this.f24492j = z;
            return this;
        }

        /* renamed from: d */
        public C9453c mo25375d(boolean z) {
            this.f24493k = z;
            return this;
        }

        /* renamed from: e */
        public C9453c mo25376e(boolean z) {
            this.f24500r = z;
            return this;
        }

        /* synthetic */ C9453c(C9453c cVar, boolean z, C9451a aVar) {
            this(cVar, z);
        }

        /* renamed from: b */
        public C9453c mo25372b() {
            mo25365a(1);
            return this;
        }

        public C9453c(String str) {
            this.f24502t = Bundle.EMPTY;
            C9470d.m23044a(str);
            this.f24484b = str;
            this.f24483a = -8765;
            this.f24485c = -1;
            this.f24486d = -1;
            this.f24487e = 30000;
            this.f24488f = C9450h.f24468g;
            this.f24497o = C9450h.f24469h;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m22948a(ContentValues contentValues) {
            contentValues.put("_id", Integer.valueOf(this.f24483a));
            contentValues.put("tag", this.f24484b);
            contentValues.put("startMs", Long.valueOf(this.f24485c));
            contentValues.put("endMs", Long.valueOf(this.f24486d));
            contentValues.put("backoffMs", Long.valueOf(this.f24487e));
            contentValues.put("backoffPolicy", this.f24488f.toString());
            contentValues.put("intervalMs", Long.valueOf(this.f24489g));
            contentValues.put("flexMs", Long.valueOf(this.f24490h));
            contentValues.put("requirementsEnforced", Boolean.valueOf(this.f24491i));
            contentValues.put("requiresCharging", Boolean.valueOf(this.f24492j));
            contentValues.put("requiresDeviceIdle", Boolean.valueOf(this.f24493k));
            contentValues.put("requiresBatteryNotLow", Boolean.valueOf(this.f24494l));
            contentValues.put("requiresStorageNotLow", Boolean.valueOf(this.f24495m));
            contentValues.put("exact", Boolean.valueOf(this.f24496n));
            contentValues.put("networkType", this.f24497o.toString());
            C9473b bVar = this.f24498p;
            String str = "extras";
            if (bVar != null) {
                contentValues.put(str, bVar.mo25448b());
            } else if (!TextUtils.isEmpty(this.f24499q)) {
                contentValues.put(str, this.f24499q);
            }
            contentValues.put("transient", Boolean.valueOf(this.f24501s));
        }

        private C9453c(Cursor cursor) throws Exception {
            this.f24502t = Bundle.EMPTY;
            this.f24483a = cursor.getInt(cursor.getColumnIndex("_id"));
            this.f24484b = cursor.getString(cursor.getColumnIndex("tag"));
            this.f24485c = cursor.getLong(cursor.getColumnIndex("startMs"));
            this.f24486d = cursor.getLong(cursor.getColumnIndex("endMs"));
            this.f24487e = cursor.getLong(cursor.getColumnIndex("backoffMs"));
            try {
                this.f24488f = C9452b.valueOf(cursor.getString(cursor.getColumnIndex("backoffPolicy")));
            } catch (Throwable th) {
                C9450h.f24472k.mo25410a(th);
                this.f24488f = C9450h.f24468g;
            }
            this.f24489g = cursor.getLong(cursor.getColumnIndex("intervalMs"));
            this.f24490h = cursor.getLong(cursor.getColumnIndex("flexMs"));
            boolean z = true;
            this.f24491i = cursor.getInt(cursor.getColumnIndex("requirementsEnforced")) > 0;
            this.f24492j = cursor.getInt(cursor.getColumnIndex("requiresCharging")) > 0;
            this.f24493k = cursor.getInt(cursor.getColumnIndex("requiresDeviceIdle")) > 0;
            this.f24494l = cursor.getInt(cursor.getColumnIndex("requiresBatteryNotLow")) > 0;
            this.f24495m = cursor.getInt(cursor.getColumnIndex("requiresStorageNotLow")) > 0;
            this.f24496n = cursor.getInt(cursor.getColumnIndex("exact")) > 0;
            try {
                this.f24497o = C9454d.valueOf(cursor.getString(cursor.getColumnIndex("networkType")));
            } catch (Throwable th2) {
                C9450h.f24472k.mo25410a(th2);
                this.f24497o = C9450h.f24469h;
            }
            this.f24499q = cursor.getString(cursor.getColumnIndex("extras"));
            if (cursor.getInt(cursor.getColumnIndex("transient")) <= 0) {
                z = false;
            }
            this.f24501s = z;
        }

        /* renamed from: a */
        public C9453c mo25366a(long j, long j2) {
            C9470d.m23047b(j, "startInMs must be greater than 0");
            this.f24485c = j;
            C9470d.m23042a(j2, j, Long.MAX_VALUE, "endInMs");
            this.f24486d = j2;
            if (this.f24485c > 6148914691236517204L) {
                C9450h.f24472k.mo25416c("startInMs reduced from %d days to %d days", Long.valueOf(TimeUnit.MILLISECONDS.toDays(this.f24485c)), Long.valueOf(TimeUnit.MILLISECONDS.toDays(6148914691236517204L)));
                this.f24485c = 6148914691236517204L;
            }
            if (this.f24486d > 6148914691236517204L) {
                C9450h.f24472k.mo25416c("endInMs reduced from %d days to %d days", Long.valueOf(TimeUnit.MILLISECONDS.toDays(this.f24486d)), Long.valueOf(TimeUnit.MILLISECONDS.toDays(6148914691236517204L)));
                this.f24486d = 6148914691236517204L;
            }
            return this;
        }

        /* renamed from: a */
        public C9453c mo25369a(C9473b bVar) {
            if (bVar == null) {
                this.f24498p = null;
                this.f24499q = null;
            } else {
                this.f24498p = new C9473b(bVar);
            }
            return this;
        }

        /* renamed from: a */
        public C9453c mo25370a(boolean z) {
            this.f24491i = z;
            return this;
        }

        private C9453c(C9453c cVar) {
            this(cVar, false);
        }

        /* renamed from: a */
        public C9453c mo25368a(C9454d dVar) {
            this.f24497o = dVar;
            return this;
        }

        private C9453c(C9453c cVar, boolean z) {
            int i;
            this.f24502t = Bundle.EMPTY;
            if (z) {
                i = -8765;
            } else {
                i = cVar.f24483a;
            }
            this.f24483a = i;
            this.f24484b = cVar.f24484b;
            this.f24485c = cVar.f24485c;
            this.f24486d = cVar.f24486d;
            this.f24487e = cVar.f24487e;
            this.f24488f = cVar.f24488f;
            this.f24489g = cVar.f24489g;
            this.f24490h = cVar.f24490h;
            this.f24491i = cVar.f24491i;
            this.f24492j = cVar.f24492j;
            this.f24493k = cVar.f24493k;
            this.f24494l = cVar.f24494l;
            this.f24495m = cVar.f24495m;
            this.f24496n = cVar.f24496n;
            this.f24497o = cVar.f24497o;
            this.f24498p = cVar.f24498p;
            this.f24499q = cVar.f24499q;
            this.f24500r = cVar.f24500r;
            this.f24501s = cVar.f24501s;
            this.f24502t = cVar.f24502t;
        }

        /* renamed from: a */
        public C9453c mo25365a(long j) {
            this.f24496n = true;
            if (j > 6148914691236517204L) {
                C9450h.f24472k.mo25416c("exactInMs clamped from %d days to %d days", Long.valueOf(TimeUnit.MILLISECONDS.toDays(j)), Long.valueOf(TimeUnit.MILLISECONDS.toDays(6148914691236517204L)));
                j = 6148914691236517204L;
            }
            mo25366a(j, j);
            return this;
        }

        /* renamed from: a */
        public C9453c mo25367a(long j, C9452b bVar) {
            C9470d.m23047b(j, "backoffMs must be > 0");
            this.f24487e = j;
            C9470d.m23045a(bVar);
            this.f24488f = bVar;
            return this;
        }

        /* renamed from: a */
        public C9450h mo25371a() {
            C9470d.m23044a(this.f24484b);
            C9470d.m23047b(this.f24487e, "backoffMs must be > 0");
            C9470d.m23045a(this.f24488f);
            C9470d.m23045a(this.f24497o);
            long j = this.f24489g;
            if (j > 0) {
                C9470d.m23042a(j, C9450h.m22910G(), Long.MAX_VALUE, "intervalMs");
                C9470d.m23042a(this.f24490h, C9450h.m22909F(), this.f24489g, "flexMs");
                if (this.f24489g < C9450h.f24470i || this.f24490h < C9450h.f24471j) {
                    C9450h.f24472k.mo25418d("AllowSmallerIntervals enabled, this will crash on Android N and later, interval %d (minimum is %d), flex %d (minimum is %d)", Long.valueOf(this.f24489g), Long.valueOf(C9450h.f24470i), Long.valueOf(this.f24490h), Long.valueOf(C9450h.f24471j));
                }
            }
            if (this.f24496n && this.f24489g > 0) {
                throw new IllegalArgumentException("Can't call setExact() on a periodic job.");
            } else if (this.f24496n && this.f24485c != this.f24486d) {
                throw new IllegalArgumentException("Can't call setExecutionWindow() for an exact job.");
            } else if (this.f24496n && (this.f24491i || this.f24493k || this.f24492j || !C9450h.f24469h.equals(this.f24497o) || this.f24494l || this.f24495m)) {
                throw new IllegalArgumentException("Can't require any condition for an exact job.");
            } else if (this.f24489g <= 0 && (this.f24485c == -1 || this.f24486d == -1)) {
                throw new IllegalArgumentException("You're trying to build a job with no constraints, this is not allowed.");
            } else if (this.f24489g > 0 && (this.f24485c != -1 || this.f24486d != -1)) {
                throw new IllegalArgumentException("Can't call setExecutionWindow() on a periodic job.");
            } else if (this.f24489g <= 0 || (this.f24487e == 30000 && C9450h.f24468g.equals(this.f24488f))) {
                if (this.f24489g <= 0 && (this.f24485c > 3074457345618258602L || this.f24486d > 3074457345618258602L)) {
                    C9450h.f24472k.mo25417d("Attention: your execution window is too large. This could result in undesired behavior, see https://github.com/evernote/android-job/wiki/FAQ");
                }
                if (this.f24489g <= 0 && this.f24485c > TimeUnit.DAYS.toMillis(365)) {
                    C9450h.f24472k.mo25418d("Warning: job with tag %s scheduled over a year in the future", this.f24484b);
                }
                int i = this.f24483a;
                String str = "id can't be negative";
                if (i != -8765) {
                    C9470d.m23041a(i, str);
                }
                C9453c cVar = new C9453c(this);
                if (this.f24483a == -8765) {
                    cVar.f24483a = C9447g.m22884g().mo25321f().mo25386c();
                    C9470d.m23041a(cVar.f24483a, str);
                }
                return new C9450h(cVar, null);
            } else {
                throw new IllegalArgumentException("A periodic job will not respect any back-off policy, so calling setBackoffCriteria() with setPeriodic() is an error.");
            }
        }
    }

    /* renamed from: com.evernote.android.job.h$d */
    public enum C9454d {
        ANY,
        CONNECTED,
        UNMETERED,
        NOT_ROAMING,
        METERED
    }

    /* synthetic */ C9450h(C9453c cVar, C9451a aVar) {
        this(cVar);
    }

    /* renamed from: E */
    private static Context m22908E() {
        return C9447g.m22884g().mo25317c();
    }

    /* renamed from: F */
    static long m22909F() {
        return C9441d.m22858e() ? TimeUnit.SECONDS.toMillis(30) : f24471j;
    }

    /* renamed from: G */
    static long m22910G() {
        return C9441d.m22858e() ? TimeUnit.MINUTES.toMillis(1) : f24470i;
    }

    /* renamed from: A */
    public boolean mo25328A() {
        return this.f24473a.f24495m;
    }

    /* renamed from: B */
    public int mo25329B() {
        C9447g.m22884g().mo25312a(this);
        return mo25348k();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: C */
    public ContentValues mo25330C() {
        ContentValues contentValues = new ContentValues();
        this.f24473a.m22948a(contentValues);
        contentValues.put("numFailures", Integer.valueOf(this.f24474b));
        contentValues.put("scheduledAt", Long.valueOf(this.f24475c));
        contentValues.put("started", Boolean.valueOf(this.f24476d));
        contentValues.put("flexSupport", Boolean.valueOf(this.f24477e));
        contentValues.put("lastRun", Long.valueOf(this.f24478f));
        return contentValues;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo25333a(long j) {
        this.f24475c = j;
    }

    /* renamed from: b */
    public long mo25335b() {
        return this.f24473a.f24487e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public long mo25338c() {
        long j = 0;
        if (mo25355r()) {
            return 0;
        }
        int i = C9451a.f24479a[mo25339d().ordinal()];
        if (i == 1) {
            j = ((long) this.f24474b) * mo25335b();
        } else if (i != 2) {
            throw new IllegalStateException("not implemented");
        } else if (this.f24474b != 0) {
            j = (long) (((double) mo25335b()) * Math.pow(2.0d, (double) (this.f24474b - 1)));
        }
        return Math.min(j, TimeUnit.HOURS.toMillis(5));
    }

    /* renamed from: d */
    public C9452b mo25339d() {
        return this.f24473a.f24488f;
    }

    /* renamed from: e */
    public long mo25340e() {
        return this.f24473a.f24486d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9450h.class != obj.getClass()) {
            return false;
        }
        return this.f24473a.equals(((C9450h) obj).f24473a);
    }

    /* renamed from: f */
    public C9473b mo25342f() {
        if (this.f24473a.f24498p == null && !TextUtils.isEmpty(this.f24473a.f24499q)) {
            C9453c cVar = this.f24473a;
            cVar.f24498p = C9473b.m23087a(cVar.f24499q);
        }
        return this.f24473a.f24498p;
    }

    /* renamed from: g */
    public int mo25343g() {
        return this.f24474b;
    }

    /* renamed from: h */
    public long mo25344h() {
        return this.f24473a.f24490h;
    }

    public int hashCode() {
        return this.f24473a.hashCode();
    }

    /* renamed from: i */
    public long mo25346i() {
        return this.f24473a.f24489g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public C9439c mo25347j() {
        return this.f24473a.f24496n ? C9439c.V_14 : C9439c.m22847d(m22908E());
    }

    /* renamed from: k */
    public int mo25348k() {
        return this.f24473a.f24483a;
    }

    /* renamed from: l */
    public long mo25349l() {
        return this.f24475c;
    }

    /* renamed from: m */
    public long mo25350m() {
        return this.f24473a.f24485c;
    }

    /* renamed from: n */
    public String mo25351n() {
        return this.f24473a.f24484b;
    }

    /* renamed from: o */
    public Bundle mo25352o() {
        return this.f24473a.f24502t;
    }

    /* renamed from: p */
    public boolean mo25353p() {
        return this.f24473a.f24496n;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: q */
    public boolean mo25354q() {
        return this.f24477e;
    }

    /* renamed from: r */
    public boolean mo25355r() {
        return mo25346i() > 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: s */
    public boolean mo25356s() {
        return this.f24476d;
    }

    /* renamed from: t */
    public boolean mo25357t() {
        return this.f24473a.f24501s;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("request{id=");
        sb.append(mo25348k());
        sb.append(", tag=");
        sb.append(mo25351n());
        sb.append(", transient=");
        sb.append(mo25357t());
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: u */
    public boolean mo25359u() {
        return this.f24473a.f24500r;
    }

    /* renamed from: v */
    public C9454d mo25360v() {
        return this.f24473a.f24497o;
    }

    /* renamed from: w */
    public boolean mo25361w() {
        return this.f24473a.f24491i;
    }

    /* renamed from: x */
    public boolean mo25362x() {
        return this.f24473a.f24494l;
    }

    /* renamed from: y */
    public boolean mo25363y() {
        return this.f24473a.f24492j;
    }

    /* renamed from: z */
    public boolean mo25364z() {
        return this.f24473a.f24493k;
    }

    private C9450h(C9453c cVar) {
        this.f24473a = cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo25334a(boolean z) {
        this.f24477e = z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo25337b(boolean z, boolean z2) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            this.f24474b++;
            contentValues.put("numFailures", Integer.valueOf(this.f24474b));
        }
        if (z2) {
            this.f24478f = C9441d.m22853a().currentTimeMillis();
            contentValues.put("lastRun", Long.valueOf(this.f24478f));
        }
        C9447g.m22884g().mo25321f().mo25383a(this, contentValues);
    }

    /* renamed from: a */
    public C9453c mo25331a() {
        long j = this.f24475c;
        C9447g.m22884g().mo25313a(mo25348k());
        C9453c cVar = new C9453c(this.f24473a, (C9451a) null);
        this.f24476d = false;
        if (!mo25355r()) {
            long currentTimeMillis = C9441d.m22853a().currentTimeMillis() - j;
            cVar.mo25366a(Math.max(1, mo25350m() - currentTimeMillis), Math.max(1, mo25340e() - currentTimeMillis));
        }
        return cVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo25336b(boolean z) {
        this.f24476d = z;
        ContentValues contentValues = new ContentValues();
        contentValues.put("started", Boolean.valueOf(this.f24476d));
        C9447g.m22884g().mo25321f().mo25383a(this, contentValues);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C9450h mo25332a(boolean z, boolean z2) {
        C9450h a = new C9453c(this.f24473a, z2, null).mo25371a();
        if (z) {
            a.f24474b = this.f24474b + 1;
        }
        try {
            a.mo25329B();
        } catch (Exception e) {
            f24472k.mo25410a((Throwable) e);
        }
        return a;
    }

    /* renamed from: a */
    static C9450h m22911a(Cursor cursor) throws Exception {
        C9450h a = new C9453c(cursor, (C9451a) null).mo25371a();
        a.f24474b = cursor.getInt(cursor.getColumnIndex("numFailures"));
        a.f24475c = cursor.getLong(cursor.getColumnIndex("scheduledAt"));
        boolean z = true;
        a.f24476d = cursor.getInt(cursor.getColumnIndex("started")) > 0;
        if (cursor.getInt(cursor.getColumnIndex("flexSupport")) <= 0) {
            z = false;
        }
        a.f24477e = z;
        a.f24478f = cursor.getLong(cursor.getColumnIndex("lastRun"));
        C9470d.m23041a(a.f24474b, "failure count can't be negative");
        C9470d.m23043a(a.f24475c, "scheduled at can't be negative");
        return a;
    }
}
