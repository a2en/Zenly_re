package com.evernote.android.job;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.LruCache;
import com.evernote.android.job.util.C9469c;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.evernote.android.job.i */
class C9455i {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C9469c f24509g = new C9469c("JobStorage");

    /* renamed from: a */
    private final SharedPreferences f24510a;

    /* renamed from: b */
    private final C9457b f24511b;

    /* renamed from: c */
    private AtomicInteger f24512c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Set<String> f24513d;

    /* renamed from: e */
    private final C9458c f24514e;

    /* renamed from: f */
    private SQLiteDatabase f24515f;

    /* renamed from: com.evernote.android.job.i$a */
    class C9456a extends Thread {
        C9456a(String str) {
            super(str);
        }

        public void run() {
            HashSet hashSet;
            int i;
            synchronized (C9455i.this.f24513d) {
                hashSet = new HashSet(C9455i.this.f24513d);
            }
            Iterator it = hashSet.iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                try {
                    int parseInt = Integer.parseInt((String) it.next());
                    if (C9455i.this.m22985a((C9450h) null, parseInt)) {
                        it.remove();
                        C9455i.f24509g.mo25416c("Deleted job %d which failed to delete earlier", Integer.valueOf(parseInt));
                    } else {
                        C9455i.f24509g.mo25413b("Couldn't delete job %d which failed to delete earlier", Integer.valueOf(parseInt));
                    }
                } catch (NumberFormatException unused) {
                    it.remove();
                }
            }
            synchronized (C9455i.this.f24513d) {
                C9455i.this.f24513d.clear();
                if (hashSet.size() > 50) {
                    Iterator it2 = hashSet.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        String str = (String) it2.next();
                        int i2 = i + 1;
                        if (i > 50) {
                            break;
                        }
                        C9455i.this.f24513d.add(str);
                        i = i2;
                    }
                } else {
                    C9455i.this.f24513d.addAll(hashSet);
                }
            }
        }
    }

    /* renamed from: com.evernote.android.job.i$b */
    private class C9457b extends LruCache<Integer, C9450h> {
        public C9457b() {
            super(30);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C9450h create(Integer num) {
            return C9455i.this.m22980a(num.intValue(), true);
        }
    }

    /* renamed from: com.evernote.android.job.i$c */
    private static final class C9458c extends SQLiteOpenHelper {
        /* synthetic */ C9458c(Context context, String str, C9456a aVar) {
            this(context, str);
        }

        /* renamed from: a */
        private void m23002a(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("create table jobs (_id integer primary key, tag text not null, startMs integer, endMs integer, backoffMs integer, backoffPolicy text not null, intervalMs integer, requirementsEnforced integer, requiresCharging integer, requiresDeviceIdle integer, exact integer, networkType text not null, extras text, numFailures integer, scheduledAt integer, started integer, flexMs integer, flexSupport integer, lastRun integer, transient integer, requiresBatteryNotLow integer, requiresStorageNotLow integer);");
        }

        /* renamed from: b */
        private void m23003b(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("alter table jobs add column isTransient integer;");
        }

        /* renamed from: c */
        private void m23004c(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("alter table jobs add column flexMs integer;");
            sQLiteDatabase.execSQL("alter table jobs add column flexSupport integer;");
            ContentValues contentValues = new ContentValues();
            contentValues.put("intervalMs", Long.valueOf(C9450h.f24470i));
            StringBuilder sb = new StringBuilder();
            sb.append("intervalMs>0 AND intervalMs<");
            sb.append(C9450h.f24470i);
            sQLiteDatabase.update("jobs", contentValues, sb.toString(), new String[0]);
            sQLiteDatabase.execSQL("update jobs set flexMs = intervalMs;");
        }

        /* renamed from: d */
        private void m23005d(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("alter table jobs add column lastRun integer;");
        }

        /* renamed from: e */
        private void m23006e(SQLiteDatabase sQLiteDatabase) {
            StringBuilder sb;
            String str;
            SQLiteDatabase sQLiteDatabase2;
            SQLiteDatabase sQLiteDatabase3 = sQLiteDatabase;
            String str2 = "networkType";
            String str3 = "exact";
            String str4 = "requiresDeviceIdle";
            String str5 = "requiresCharging";
            String str6 = "requirementsEnforced";
            String str7 = "intervalMs";
            String str8 = "backoffPolicy";
            String str9 = "backoffMs";
            String str10 = "endMs";
            String str11 = "startMs";
            String str12 = "tag";
            String str13 = "_id";
            String str14 = " text not null, ";
            String str15 = " integer, ";
            String str16 = ",";
            try {
                sQLiteDatabase.beginTransaction();
                String str17 = str16;
                String str18 = "jobs_new";
                try {
                    sb = new StringBuilder();
                    String str19 = str2;
                    sb.append("create table ");
                    sb.append(str18);
                    sb.append(" (");
                    sb.append(str13);
                    sb.append(" integer primary key, ");
                    sb.append(str12);
                    sb.append(str14);
                    sb.append(str11);
                    sb.append(str15);
                    sb.append(str10);
                    sb.append(str15);
                    sb.append(str9);
                    sb.append(str15);
                    sb.append(str8);
                    sb.append(str14);
                    sb.append(str7);
                    sb.append(str15);
                    sb.append(str6);
                    sb.append(str15);
                    sb.append(str5);
                    sb.append(str15);
                    sb.append(str4);
                    sb.append(str15);
                    sb.append(str3);
                    sb.append(str15);
                    str = str19;
                    sb.append(str);
                    sb.append(str14);
                    sb.append("extras");
                    sb.append(" text, ");
                    sb.append("numFailures");
                    sb.append(str15);
                    sb.append("scheduledAt");
                    sb.append(str15);
                    sb.append("started");
                    sb.append(str15);
                    sb.append("flexMs");
                    sb.append(str15);
                    sb.append("flexSupport");
                    sb.append(str15);
                    sb.append("lastRun");
                    sb.append(" integer);");
                    sQLiteDatabase2 = sQLiteDatabase;
                } catch (Throwable th) {
                    th = th;
                    SQLiteDatabase sQLiteDatabase4 = sQLiteDatabase;
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
                try {
                    sQLiteDatabase2.execSQL(sb.toString());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("INSERT INTO ");
                    sb2.append(str18);
                    sb2.append(" SELECT ");
                    sb2.append(str13);
                    String str20 = str17;
                    sb2.append(str20);
                    sb2.append(str12);
                    sb2.append(str20);
                    sb2.append(str11);
                    sb2.append(str20);
                    sb2.append(str10);
                    sb2.append(str20);
                    sb2.append(str9);
                    sb2.append(str20);
                    sb2.append(str8);
                    sb2.append(str20);
                    sb2.append(str7);
                    sb2.append(str20);
                    sb2.append(str6);
                    sb2.append(str20);
                    sb2.append(str5);
                    sb2.append(str20);
                    sb2.append(str4);
                    sb2.append(str20);
                    sb2.append(str3);
                    sb2.append(str20);
                    sb2.append(str);
                    sb2.append(str20);
                    sb2.append("extras");
                    sb2.append(str20);
                    sb2.append("numFailures");
                    sb2.append(str20);
                    sb2.append("scheduledAt");
                    sb2.append(str20);
                    sb2.append("isTransient");
                    sb2.append(str20);
                    sb2.append("flexMs");
                    sb2.append(str20);
                    sb2.append("flexSupport");
                    sb2.append(str20);
                    sb2.append("lastRun");
                    sb2.append(" FROM ");
                    sb2.append("jobs");
                    sQLiteDatabase2.execSQL(sb2.toString());
                    sQLiteDatabase2.execSQL("DROP TABLE jobs");
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("ALTER TABLE ");
                    sb3.append(str18);
                    sb3.append(" RENAME TO ");
                    sb3.append("jobs");
                    sQLiteDatabase2.execSQL(sb3.toString());
                    sQLiteDatabase2.execSQL("alter table jobs add column transient integer;");
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase.endTransaction();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                SQLiteDatabase sQLiteDatabase5 = sQLiteDatabase3;
                sQLiteDatabase.endTransaction();
                throw th;
            }
        }

        /* renamed from: f */
        private void m23007f(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("alter table jobs add column requiresBatteryNotLow integer;");
            sQLiteDatabase.execSQL("alter table jobs add column requiresStorageNotLow integer;");
        }

        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            m23002a(sQLiteDatabase);
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            while (i < i2) {
                if (i == 1) {
                    m23003b(sQLiteDatabase);
                } else if (i == 2) {
                    m23004c(sQLiteDatabase);
                } else if (i == 3) {
                    m23005d(sQLiteDatabase);
                } else if (i == 4) {
                    m23006e(sQLiteDatabase);
                } else if (i == 5) {
                    m23007f(sQLiteDatabase);
                } else {
                    throw new IllegalStateException("not implemented");
                }
                i++;
            }
        }

        private C9458c(Context context, String str) {
            super(context, str, null, 6, new C9459j());
        }
    }

    public C9455i(Context context) {
        this(context, "evernote_jobs.db");
    }

    /* renamed from: e */
    private void m22992e() {
        new C9456a("CleanupFinishedJobsThread").start();
    }

    /* renamed from: b */
    public synchronized void mo25385b(C9450h hVar) {
        m22985a(hVar, hVar.mo25348k());
    }

    /* renamed from: c */
    public synchronized int mo25386c() {
        int incrementAndGet;
        if (this.f24512c == null) {
            this.f24512c = new AtomicInteger(mo25384b());
        }
        incrementAndGet = this.f24512c.incrementAndGet();
        int c = C9441d.m22856c();
        if (incrementAndGet < c || incrementAndGet >= 2147480000) {
            this.f24512c.set(c);
            incrementAndGet = this.f24512c.incrementAndGet();
        }
        this.f24510a.edit().putInt("JOB_ID_COUNTER_v2", incrementAndGet).apply();
        return incrementAndGet;
    }

    public C9455i(Context context, String str) {
        this.f24510a = context.getSharedPreferences("evernote_jobs", 0);
        this.f24511b = new C9457b();
        this.f24514e = new C9458c(context, str, null);
        this.f24513d = this.f24510a.getStringSet("FAILED_DELETE_IDS", new HashSet());
        if (!this.f24513d.isEmpty()) {
            m22992e();
        }
    }

    /* renamed from: d */
    private void m22991d(C9450h hVar) {
        this.f24511b.put(Integer.valueOf(hVar.mo25348k()), hVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo25384b() {
        SQLiteDatabase sQLiteDatabase;
        int i;
        try {
            sQLiteDatabase = mo25379a();
            try {
                Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT MAX(_id) FROM jobs", null);
                i = (rawQuery == null || !rawQuery.moveToFirst()) ? 0 : rawQuery.getInt(0);
                m22983a(rawQuery);
                m22984a(sQLiteDatabase);
            } catch (Exception e) {
                e = e;
                try {
                    f24509g.mo25410a((Throwable) e);
                    m22983a((Cursor) null);
                    m22984a(sQLiteDatabase);
                    i = 0;
                    return Math.max(C9441d.m22856c(), Math.max(i, this.f24510a.getInt("JOB_ID_COUNTER_v2", 0)));
                } catch (Throwable th) {
                    th = th;
                    m22983a((Cursor) null);
                    m22984a(sQLiteDatabase);
                    throw th;
                }
            }
        } catch (Exception e2) {
            e = e2;
            sQLiteDatabase = null;
            f24509g.mo25410a((Throwable) e);
            m22983a((Cursor) null);
            m22984a(sQLiteDatabase);
            i = 0;
            return Math.max(C9441d.m22856c(), Math.max(i, this.f24510a.getInt("JOB_ID_COUNTER_v2", 0)));
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = null;
            m22983a((Cursor) null);
            m22984a(sQLiteDatabase);
            throw th;
        }
        return Math.max(C9441d.m22856c(), Math.max(i, this.f24510a.getInt("JOB_ID_COUNTER_v2", 0)));
    }

    /* renamed from: a */
    public synchronized void mo25382a(C9450h hVar) {
        m22988c(hVar);
        m22991d(hVar);
    }

    /* renamed from: a */
    public synchronized void mo25383a(C9450h hVar, ContentValues contentValues) {
        m22991d(hVar);
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = mo25379a();
            sQLiteDatabase.update("jobs", contentValues, "_id=?", new String[]{String.valueOf(hVar.mo25348k())});
        } catch (Exception e) {
            try {
                f24509g.mo25411a(e, "could not update %s", hVar);
            } catch (Throwable th) {
                m22984a(sQLiteDatabase);
                throw th;
            }
        }
        m22984a(sQLiteDatabase);
    }

    /* renamed from: c */
    private void m22988c(C9450h hVar) {
        SQLiteDatabase sQLiteDatabase;
        ContentValues C = hVar.mo25330C();
        try {
            sQLiteDatabase = mo25379a();
            try {
                if (sQLiteDatabase.insertWithOnConflict("jobs", null, C, 5) >= 0) {
                    m22984a(sQLiteDatabase);
                    return;
                }
                throw new SQLException("Couldn't insert job request into database");
            } catch (Throwable th) {
                th = th;
                m22984a(sQLiteDatabase);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = null;
            m22984a(sQLiteDatabase);
            throw th;
        }
    }

    /* renamed from: a */
    public synchronized C9450h mo25380a(int i) {
        return (C9450h) this.f24511b.get(Integer.valueOf(i));
    }

    /* renamed from: b */
    private void m22987b(int i) {
        synchronized (this.f24513d) {
            this.f24513d.add(String.valueOf(i));
            this.f24510a.edit().putStringSet("FAILED_DELETE_IDS", this.f24513d).apply();
        }
    }

    /* renamed from: c */
    private boolean m22989c(int i) {
        boolean z;
        synchronized (this.f24513d) {
            z = !this.f24513d.isEmpty() && this.f24513d.contains(String.valueOf(i));
        }
        return z;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:28:0x0086=Splitter:B:28:0x0086, B:43:0x00a6=Splitter:B:43:0x00a6} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.Set<com.evernote.android.job.C9450h> mo25381a(java.lang.String r13, boolean r14) {
        /*
            r12 = this;
            monitor-enter(r12)
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ all -> 0x00ad }
            r0.<init>()     // Catch:{ all -> 0x00ad }
            r1 = 0
            r2 = 0
            boolean r3 = android.text.TextUtils.isEmpty(r13)     // Catch:{ Exception -> 0x0093, all -> 0x008f }
            if (r3 == 0) goto L_0x0017
            if (r14 == 0) goto L_0x0012
            r13 = r2
            goto L_0x0014
        L_0x0012:
            java.lang.String r13 = "ifnull(started, 0)<=0"
        L_0x0014:
            r7 = r13
            r8 = r2
            goto L_0x0036
        L_0x0017:
            if (r14 == 0) goto L_0x001c
            java.lang.String r14 = ""
            goto L_0x001e
        L_0x001c:
            java.lang.String r14 = "ifnull(started, 0)<=0 AND "
        L_0x001e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0093, all -> 0x008f }
            r3.<init>()     // Catch:{ Exception -> 0x0093, all -> 0x008f }
            r3.append(r14)     // Catch:{ Exception -> 0x0093, all -> 0x008f }
            java.lang.String r14 = "tag=?"
            r3.append(r14)     // Catch:{ Exception -> 0x0093, all -> 0x008f }
            java.lang.String r14 = r3.toString()     // Catch:{ Exception -> 0x0093, all -> 0x008f }
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ Exception -> 0x0093, all -> 0x008f }
            r3[r1] = r13     // Catch:{ Exception -> 0x0093, all -> 0x008f }
            r7 = r14
            r8 = r3
        L_0x0036:
            android.database.sqlite.SQLiteDatabase r13 = r12.mo25379a()     // Catch:{ Exception -> 0x0093, all -> 0x008f }
            java.lang.String r5 = "jobs"
            r6 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r4 = r13
            android.database.Cursor r2 = r4.query(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x008d }
            java.util.HashMap r14 = new java.util.HashMap     // Catch:{ Exception -> 0x008d }
            com.evernote.android.job.i$b r3 = r12.f24511b     // Catch:{ Exception -> 0x008d }
            java.util.Map r3 = r3.snapshot()     // Catch:{ Exception -> 0x008d }
            r14.<init>(r3)     // Catch:{ Exception -> 0x008d }
        L_0x0050:
            if (r2 == 0) goto L_0x0086
            boolean r3 = r2.moveToNext()     // Catch:{ Exception -> 0x008d }
            if (r3 == 0) goto L_0x0086
            java.lang.String r3 = "_id"
            int r3 = r2.getColumnIndex(r3)     // Catch:{ Exception -> 0x008d }
            int r3 = r2.getInt(r3)     // Catch:{ Exception -> 0x008d }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x008d }
            int r4 = r3.intValue()     // Catch:{ Exception -> 0x008d }
            boolean r4 = r12.m22989c(r4)     // Catch:{ Exception -> 0x008d }
            if (r4 != 0) goto L_0x0050
            boolean r4 = r14.containsKey(r3)     // Catch:{ Exception -> 0x008d }
            if (r4 == 0) goto L_0x007e
            java.lang.Object r3 = r14.get(r3)     // Catch:{ Exception -> 0x008d }
            r0.add(r3)     // Catch:{ Exception -> 0x008d }
            goto L_0x0050
        L_0x007e:
            com.evernote.android.job.h r3 = com.evernote.android.job.C9450h.m22911a(r2)     // Catch:{ Exception -> 0x008d }
            r0.add(r3)     // Catch:{ Exception -> 0x008d }
            goto L_0x0050
        L_0x0086:
            m22983a(r2)     // Catch:{ all -> 0x00ad }
        L_0x0089:
            m22984a(r13)     // Catch:{ all -> 0x00ad }
            goto L_0x00a3
        L_0x008d:
            r14 = move-exception
            goto L_0x0096
        L_0x008f:
            r13 = move-exception
            r14 = r13
            r13 = r2
            goto L_0x00a6
        L_0x0093:
            r13 = move-exception
            r14 = r13
            r13 = r2
        L_0x0096:
            com.evernote.android.job.util.c r3 = f24509g     // Catch:{ all -> 0x00a5 }
            java.lang.String r4 = "could not load all jobs"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00a5 }
            r3.mo25411a(r14, r4, r1)     // Catch:{ all -> 0x00a5 }
            m22983a(r2)     // Catch:{ all -> 0x00ad }
            goto L_0x0089
        L_0x00a3:
            monitor-exit(r12)
            return r0
        L_0x00a5:
            r14 = move-exception
        L_0x00a6:
            m22983a(r2)     // Catch:{ all -> 0x00ad }
            m22984a(r13)     // Catch:{ all -> 0x00ad }
            throw r14     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r13 = move-exception
            monitor-exit(r12)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.C9455i.mo25381a(java.lang.String, boolean):java.util.Set");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized boolean m22985a(C9450h hVar, int i) {
        this.f24511b.remove(Integer.valueOf(i));
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = mo25379a();
            sQLiteDatabase.delete("jobs", "_id=?", new String[]{String.valueOf(i)});
            m22984a(sQLiteDatabase);
        } catch (Exception e) {
            try {
                f24509g.mo25411a(e, "could not delete %d %s", Integer.valueOf(i), hVar);
                m22987b(i);
                return false;
            } finally {
                m22984a(sQLiteDatabase);
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public C9450h m22980a(int i, boolean z) {
        SQLiteDatabase sQLiteDatabase;
        Throwable e;
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursor;
        Cursor cursor2 = null;
        if (m22989c(i)) {
            return null;
        }
        String str = "_id=?";
        if (!z) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" AND started<=0");
                str = sb.toString();
            } catch (Exception e2) {
                e = e2;
                cursor = null;
                sQLiteDatabase2 = null;
                try {
                    f24509g.mo25411a(e, "could not load id %d", Integer.valueOf(i));
                    m22983a(cursor);
                    m22984a(sQLiteDatabase2);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    cursor2 = cursor;
                    sQLiteDatabase = sQLiteDatabase2;
                    m22983a(cursor2);
                    m22984a(sQLiteDatabase);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = null;
                m22983a(cursor2);
                m22984a(sQLiteDatabase);
                throw th;
            }
        }
        String str2 = str;
        sQLiteDatabase = mo25379a();
        try {
            cursor = sQLiteDatabase.query("jobs", null, str2, new String[]{String.valueOf(i)}, null, null, null);
            if (cursor != null) {
                try {
                    if (cursor.moveToFirst()) {
                        C9450h a = C9450h.m22911a(cursor);
                        m22983a(cursor);
                        m22984a(sQLiteDatabase);
                        return a;
                    }
                } catch (Exception e3) {
                    Throwable th3 = e3;
                    sQLiteDatabase2 = sQLiteDatabase;
                    e = th3;
                    f24509g.mo25411a(e, "could not load id %d", Integer.valueOf(i));
                    m22983a(cursor);
                    m22984a(sQLiteDatabase2);
                    return null;
                } catch (Throwable th4) {
                    th = th4;
                    cursor2 = cursor;
                    m22983a(cursor2);
                    m22984a(sQLiteDatabase);
                    throw th;
                }
            }
            m22983a(cursor);
            m22984a(sQLiteDatabase);
        } catch (Exception e4) {
            sQLiteDatabase2 = sQLiteDatabase;
            e = e4;
            cursor = null;
            f24509g.mo25411a(e, "could not load id %d", Integer.valueOf(i));
            m22983a(cursor);
            m22984a(sQLiteDatabase2);
            return null;
        } catch (Throwable th5) {
            th = th5;
            m22983a(cursor2);
            m22984a(sQLiteDatabase);
            throw th;
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public SQLiteDatabase mo25379a() {
        SQLiteDatabase sQLiteDatabase = this.f24515f;
        if (sQLiteDatabase != null) {
            return sQLiteDatabase;
        }
        try {
            return this.f24514e.getWritableDatabase();
        } catch (SQLiteCantOpenDatabaseException e) {
            f24509g.mo25410a((Throwable) e);
            new C9459j().mo25394a("evernote_jobs.db");
            return this.f24514e.getWritableDatabase();
        }
    }

    /* renamed from: a */
    private static void m22983a(Cursor cursor) {
        if (cursor != null) {
            try {
                cursor.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m22984a(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.close();
            } catch (Exception unused) {
            }
        }
    }
}
