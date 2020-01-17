package com.amplitude.api;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDoneException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.amplitude.api.f */
class C8683f extends SQLiteOpenHelper {

    /* renamed from: h */
    static final Map<String, C8683f> f22340h = new HashMap();

    /* renamed from: i */
    private static final C8681d f22341i = C8681d.m20309a();

    /* renamed from: e */
    File f22342e;

    /* renamed from: f */
    private boolean f22343f = true;

    /* renamed from: g */
    private DatabaseResetListener f22344g;

    protected C8683f(Context context, String str) {
        super(context, m20325e(str), null, 3);
        this.f22342e = context.getDatabasePath(m20325e(str));
        C8693l.m20453b(str);
    }

    @Deprecated
    /* renamed from: a */
    static C8683f m20317a(Context context) {
        return m20318a(context, (String) null);
    }

    /* renamed from: d */
    private synchronized long m20323d(String str, String str2) {
        long j;
        SQLiteException e;
        StackOverflowError e2;
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("event", str2);
            j = mo23386a(writableDatabase, str, contentValues);
            if (j == -1) {
                try {
                    f22341i.mo23383d("com.amplitude.api.DatabaseHelper", String.format("Insert into %s failed", new Object[]{str}));
                } catch (SQLiteException e3) {
                    e = e3;
                } catch (StackOverflowError e4) {
                    e2 = e4;
                    try {
                        f22341i.mo23379a("com.amplitude.api.DatabaseHelper", String.format("addEvent to %s failed", new Object[]{str}), e2);
                        C8687h.m20402b().mo23431a(String.format("DB: Failed to addEvent: %s", new Object[]{str2}), e2);
                        m20324d();
                        close();
                        return j;
                    } catch (Throwable th) {
                        close();
                        throw th;
                    }
                }
            }
        } catch (SQLiteException e5) {
            e = e5;
            j = -1;
            f22341i.mo23379a("com.amplitude.api.DatabaseHelper", String.format("addEvent to %s failed", new Object[]{str}), e);
            C8687h.m20402b().mo23431a(String.format("DB: Failed to addEvent: %s", new Object[]{str2}), e);
            m20324d();
            close();
            return j;
        } catch (StackOverflowError e6) {
            e2 = e6;
            j = -1;
            f22341i.mo23379a("com.amplitude.api.DatabaseHelper", String.format("addEvent to %s failed", new Object[]{str}), e2);
            C8687h.m20402b().mo23431a(String.format("DB: Failed to addEvent: %s", new Object[]{str2}), e2);
            m20324d();
            close();
            return j;
        }
        close();
        return j;
    }

    /* renamed from: e */
    private static String m20325e(String str) {
        if (C8693l.m20451a(str) || str.equals("$default_instance")) {
            return "com.amplitude.api";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("com.amplitude.api_");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: f */
    private synchronized long m20326f(String str) {
        long j;
        j = 0;
        SQLiteStatement sQLiteStatement = null;
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT COUNT(*) FROM ");
            sb.append(str);
            SQLiteStatement compileStatement = readableDatabase.compileStatement(sb.toString());
            j = compileStatement.simpleQueryForLong();
            if (compileStatement != null) {
                compileStatement.close();
            }
        } catch (SQLiteException e) {
            f22341i.mo23379a("com.amplitude.api.DatabaseHelper", String.format("getNumberRows for %s failed", new Object[]{str}), e);
            C8687h.m20402b().mo23431a(String.format("DB: Failed to getNumberRows for table %s", new Object[]{str}), e);
            m20324d();
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
            }
        } catch (StackOverflowError e2) {
            try {
                f22341i.mo23379a("com.amplitude.api.DatabaseHelper", String.format("getNumberRows for %s failed", new Object[]{str}), e2);
                C8687h.m20402b().mo23431a(String.format("DB: Failed to getNumberRows for table %s", new Object[]{str}), e2);
                m20324d();
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
            } catch (Throwable th) {
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                close();
                throw th;
            }
        }
        close();
        return j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized long mo23398b(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) throws SQLiteException, StackOverflowError {
        return sQLiteDatabase.insertWithOnConflict(str, null, contentValues, 5);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public synchronized long mo23403c(String str, String str2) {
        long j;
        if (str2 == null) {
            j = mo23390a("store", str);
        } else {
            j = mo23391a("store", str, (Object) str2);
        }
        return j;
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS store (key TEXT PRIMARY KEY NOT NULL, value TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS long_store (key TEXT PRIMARY KEY NOT NULL, value INTEGER);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS events (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS identifys (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);");
        DatabaseResetListener databaseResetListener = this.f22344g;
        if (databaseResetListener != null && this.f22343f) {
            try {
                this.f22343f = false;
                databaseResetListener.onDatabaseReset(sQLiteDatabase);
            } catch (SQLiteException e) {
                f22341i.mo23379a("com.amplitude.api.DatabaseHelper", String.format("databaseReset callback failed during onCreate", new Object[0]), e);
                C8687h.m20402b().mo23431a(String.format("DB: Failed to run databaseReset callback during onCreate", new Object[0]), e);
            } catch (Throwable th) {
                this.f22343f = true;
                throw th;
            }
            this.f22343f = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        if (r7 <= 2) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r5, int r6, int r7) {
        /*
            r4 = this;
            java.lang.String r0 = "com.amplitude.api.DatabaseHelper"
            if (r6 <= r7) goto L_0x000f
            com.amplitude.api.d r6 = f22341i
            java.lang.String r7 = "onUpgrade() with invalid oldVersion and newVersion"
            r6.mo23381b(r0, r7)
            r4.m20319a(r5)
            return
        L_0x000f:
            r1 = 1
            if (r7 > r1) goto L_0x0013
            return
        L_0x0013:
            r2 = 3
            r3 = 2
            if (r6 == r1) goto L_0x0035
            if (r6 == r3) goto L_0x003d
            if (r6 == r2) goto L_0x0047
            com.amplitude.api.d r7 = f22341i
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onUpgrade() with unknown oldVersion "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r7.mo23381b(r0, r6)
            r4.m20319a(r5)
            goto L_0x0047
        L_0x0035:
            java.lang.String r6 = "CREATE TABLE IF NOT EXISTS store (key TEXT PRIMARY KEY NOT NULL, value TEXT);"
            r5.execSQL(r6)
            if (r7 > r3) goto L_0x003d
            goto L_0x0047
        L_0x003d:
            java.lang.String r6 = "CREATE TABLE IF NOT EXISTS identifys (id INTEGER PRIMARY KEY AUTOINCREMENT, event TEXT);"
            r5.execSQL(r6)
            java.lang.String r6 = "CREATE TABLE IF NOT EXISTS long_store (key TEXT PRIMARY KEY NOT NULL, value INTEGER);"
            r5.execSQL(r6)
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplitude.api.C8683f.onUpgrade(android.database.sqlite.SQLiteDatabase, int, int):void");
    }

    /* renamed from: a */
    static synchronized C8683f m20318a(Context context, String str) {
        C8683f fVar;
        synchronized (C8683f.class) {
            String b = C8693l.m20453b(str);
            fVar = (C8683f) f22340h.get(b);
            if (fVar == null) {
                fVar = new C8683f(context.getApplicationContext(), b);
                f22340h.put(b, fVar);
            }
        }
        return fVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized long mo23399b(String str) {
        return m20323d("identifys", str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public synchronized void mo23408e(long j) {
        m20321b("identifys", j);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0090 A[SYNTHETIC, Splitter:B:31:0x0090] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bd A[SYNTHETIC, Splitter:B:38:0x00bd] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c6 A[SYNTHETIC, Splitter:B:44:0x00c6] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0052=Splitter:B:23:0x0052, B:35:0x0096=Splitter:B:35:0x0096, B:28:0x0069=Splitter:B:28:0x0069} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Object mo23400b(java.lang.String r14, java.lang.String r15) {
        /*
            r13 = this;
            monitor-enter(r13)
            r0 = 0
            r1 = 0
            r2 = 1
            android.database.sqlite.SQLiteDatabase r4 = r13.getReadableDatabase()     // Catch:{ SQLiteException -> 0x0094, StackOverflowError -> 0x0067, RuntimeException -> 0x0050, all -> 0x004c }
            java.lang.String r3 = "key"
            java.lang.String r5 = "value"
            java.lang.String[] r6 = new java.lang.String[]{r3, r5}     // Catch:{ SQLiteException -> 0x0094, StackOverflowError -> 0x0067, RuntimeException -> 0x0050, all -> 0x004c }
            java.lang.String r7 = "key = ?"
            java.lang.String[] r8 = new java.lang.String[r2]     // Catch:{ SQLiteException -> 0x0094, StackOverflowError -> 0x0067, RuntimeException -> 0x0050, all -> 0x004c }
            r8[r1] = r15     // Catch:{ SQLiteException -> 0x0094, StackOverflowError -> 0x0067, RuntimeException -> 0x0050, all -> 0x004c }
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r3 = r13
            r5 = r14
            android.database.Cursor r3 = r3.mo23392a(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ SQLiteException -> 0x0094, StackOverflowError -> 0x0067, RuntimeException -> 0x0050, all -> 0x004c }
            boolean r4 = r3.moveToFirst()     // Catch:{ SQLiteException -> 0x004a, StackOverflowError -> 0x0048, RuntimeException -> 0x0046 }
            if (r4 == 0) goto L_0x003c
            java.lang.String r4 = "store"
            boolean r4 = r14.equals(r4)     // Catch:{ SQLiteException -> 0x004a, StackOverflowError -> 0x0048, RuntimeException -> 0x0046 }
            if (r4 == 0) goto L_0x0033
            java.lang.String r14 = r3.getString(r2)     // Catch:{ SQLiteException -> 0x004a, StackOverflowError -> 0x0048, RuntimeException -> 0x0046 }
            goto L_0x003b
        L_0x0033:
            long r4 = r3.getLong(r2)     // Catch:{ SQLiteException -> 0x004a, StackOverflowError -> 0x0048, RuntimeException -> 0x0046 }
            java.lang.Long r14 = java.lang.Long.valueOf(r4)     // Catch:{ SQLiteException -> 0x004a, StackOverflowError -> 0x0048, RuntimeException -> 0x0046 }
        L_0x003b:
            r0 = r14
        L_0x003c:
            if (r3 == 0) goto L_0x0041
            r3.close()     // Catch:{ all -> 0x00cd }
        L_0x0041:
            r13.close()     // Catch:{ all -> 0x00cd }
            goto L_0x00c1
        L_0x0046:
            r14 = move-exception
            goto L_0x0052
        L_0x0048:
            r4 = move-exception
            goto L_0x0069
        L_0x004a:
            r4 = move-exception
            goto L_0x0096
        L_0x004c:
            r14 = move-exception
            r3 = r0
            goto L_0x00c4
        L_0x0050:
            r14 = move-exception
            r3 = r0
        L_0x0052:
            com.amplitude.api.h r4 = com.amplitude.api.C8687h.m20402b()     // Catch:{ all -> 0x00c3 }
            java.lang.String r5 = "DB: Failed to getValue: %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00c3 }
            r2[r1] = r15     // Catch:{ all -> 0x00c3 }
            java.lang.String r15 = java.lang.String.format(r5, r2)     // Catch:{ all -> 0x00c3 }
            r4.mo23431a(r15, r14)     // Catch:{ all -> 0x00c3 }
            m20320a(r14)     // Catch:{ all -> 0x00c3 }
            throw r0
        L_0x0067:
            r4 = move-exception
            r3 = r0
        L_0x0069:
            com.amplitude.api.d r5 = f22341i     // Catch:{ all -> 0x00c3 }
            java.lang.String r6 = "com.amplitude.api.DatabaseHelper"
            java.lang.String r7 = "getValue from %s failed"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x00c3 }
            r8[r1] = r14     // Catch:{ all -> 0x00c3 }
            java.lang.String r14 = java.lang.String.format(r7, r8)     // Catch:{ all -> 0x00c3 }
            r5.mo23379a(r6, r14, r4)     // Catch:{ all -> 0x00c3 }
            com.amplitude.api.h r14 = com.amplitude.api.C8687h.m20402b()     // Catch:{ all -> 0x00c3 }
            java.lang.String r5 = "DB: Failed to getValue: %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00c3 }
            r2[r1] = r15     // Catch:{ all -> 0x00c3 }
            java.lang.String r15 = java.lang.String.format(r5, r2)     // Catch:{ all -> 0x00c3 }
            r14.mo23431a(r15, r4)     // Catch:{ all -> 0x00c3 }
            r13.m20324d()     // Catch:{ all -> 0x00c3 }
            if (r3 == 0) goto L_0x0041
            r3.close()     // Catch:{ all -> 0x00cd }
            goto L_0x0041
        L_0x0094:
            r4 = move-exception
            r3 = r0
        L_0x0096:
            com.amplitude.api.d r5 = f22341i     // Catch:{ all -> 0x00c3 }
            java.lang.String r6 = "com.amplitude.api.DatabaseHelper"
            java.lang.String r7 = "getValue from %s failed"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x00c3 }
            r8[r1] = r14     // Catch:{ all -> 0x00c3 }
            java.lang.String r14 = java.lang.String.format(r7, r8)     // Catch:{ all -> 0x00c3 }
            r5.mo23379a(r6, r14, r4)     // Catch:{ all -> 0x00c3 }
            com.amplitude.api.h r14 = com.amplitude.api.C8687h.m20402b()     // Catch:{ all -> 0x00c3 }
            java.lang.String r5 = "DB: Failed to getValue: %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x00c3 }
            r2[r1] = r15     // Catch:{ all -> 0x00c3 }
            java.lang.String r15 = java.lang.String.format(r5, r2)     // Catch:{ all -> 0x00c3 }
            r14.mo23431a(r15, r4)     // Catch:{ all -> 0x00c3 }
            r13.m20324d()     // Catch:{ all -> 0x00c3 }
            if (r3 == 0) goto L_0x0041
            r3.close()     // Catch:{ all -> 0x00cd }
            goto L_0x0041
        L_0x00c1:
            monitor-exit(r13)
            return r0
        L_0x00c3:
            r14 = move-exception
        L_0x00c4:
            if (r3 == 0) goto L_0x00c9
            r3.close()     // Catch:{ all -> 0x00cd }
        L_0x00c9:
            r13.close()     // Catch:{ all -> 0x00cd }
            throw r14     // Catch:{ all -> 0x00cd }
        L_0x00cd:
            r14 = move-exception
            monitor-exit(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplitude.api.C8683f.mo23400b(java.lang.String, java.lang.String):java.lang.Object");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public synchronized Long mo23404c(String str) {
        return (Long) mo23400b("long_store", str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public synchronized long mo23402c() {
        return mo23384a() + mo23396b();
    }

    /* renamed from: c */
    private synchronized void m20322c(String str, long j) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            StringBuilder sb = new StringBuilder();
            sb.append("id <= ");
            sb.append(j);
            writableDatabase.delete(str, sb.toString(), null);
        } catch (SQLiteException e) {
            f22341i.mo23379a("com.amplitude.api.DatabaseHelper", String.format("removeEvents from %s failed", new Object[]{str}), e);
            C8687h.m20402b().mo23431a(String.format("DB: Failed to removeEvents from table %s", new Object[]{str}), e);
            m20324d();
        } catch (StackOverflowError e2) {
            try {
                f22341i.mo23379a("com.amplitude.api.DatabaseHelper", String.format("removeEvents from %s failed", new Object[]{str}), e2);
                C8687h.m20402b().mo23431a(String.format("DB: Failed to removeEvents from table %s", new Object[]{str}), e2);
                m20324d();
            } catch (Throwable th) {
                close();
                throw th;
            }
        }
        close();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo23395a(DatabaseResetListener databaseResetListener) {
        this.f22344g = databaseResetListener;
    }

    /* renamed from: a */
    private void m20319a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS long_store");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS identifys");
        onCreate(sQLiteDatabase);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized long mo23389a(String str, Long l) {
        long j;
        if (l == null) {
            j = mo23390a("long_store", str);
        } else {
            j = mo23391a("long_store", str, (Object) l);
        }
        return j;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r2.isOpen() != false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0077, code lost:
        if (r2.isOpen() != false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0014, code lost:
        if (r2.isOpen() != false) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        close();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized long mo23391a(java.lang.String r10, java.lang.String r11, java.lang.Object r12) {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = -1
            r2 = 0
            r3 = 0
            r4 = 1
            android.database.sqlite.SQLiteDatabase r2 = r9.getWritableDatabase()     // Catch:{ SQLiteException -> 0x004b, StackOverflowError -> 0x001c }
            long r0 = r9.mo23387a(r2, r10, r11, r12)     // Catch:{ SQLiteException -> 0x004b, StackOverflowError -> 0x001c }
            if (r2 == 0) goto L_0x007a
            boolean r10 = r2.isOpen()     // Catch:{ all -> 0x0088 }
            if (r10 == 0) goto L_0x007a
        L_0x0016:
            r9.close()     // Catch:{ all -> 0x0088 }
            goto L_0x007a
        L_0x001a:
            r10 = move-exception
            goto L_0x007c
        L_0x001c:
            r12 = move-exception
            com.amplitude.api.d r5 = f22341i     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "com.amplitude.api.DatabaseHelper"
            java.lang.String r7 = "insertOrReplaceKeyValue in %s failed"
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x001a }
            r8[r3] = r10     // Catch:{ all -> 0x001a }
            java.lang.String r10 = java.lang.String.format(r7, r8)     // Catch:{ all -> 0x001a }
            r5.mo23379a(r6, r10, r12)     // Catch:{ all -> 0x001a }
            com.amplitude.api.h r10 = com.amplitude.api.C8687h.m20402b()     // Catch:{ all -> 0x001a }
            java.lang.String r5 = "DB: Failed to insertOrReplaceKeyValue %s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x001a }
            r4[r3] = r11     // Catch:{ all -> 0x001a }
            java.lang.String r11 = java.lang.String.format(r5, r4)     // Catch:{ all -> 0x001a }
            r10.mo23431a(r11, r12)     // Catch:{ all -> 0x001a }
            r9.m20324d()     // Catch:{ all -> 0x001a }
            if (r2 == 0) goto L_0x007a
            boolean r10 = r2.isOpen()     // Catch:{ all -> 0x0088 }
            if (r10 == 0) goto L_0x007a
            goto L_0x0016
        L_0x004b:
            r12 = move-exception
            com.amplitude.api.d r5 = f22341i     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "com.amplitude.api.DatabaseHelper"
            java.lang.String r7 = "insertOrReplaceKeyValue in %s failed"
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x001a }
            r8[r3] = r10     // Catch:{ all -> 0x001a }
            java.lang.String r10 = java.lang.String.format(r7, r8)     // Catch:{ all -> 0x001a }
            r5.mo23379a(r6, r10, r12)     // Catch:{ all -> 0x001a }
            com.amplitude.api.h r10 = com.amplitude.api.C8687h.m20402b()     // Catch:{ all -> 0x001a }
            java.lang.String r5 = "DB: Failed to insertOrReplaceKeyValue %s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x001a }
            r4[r3] = r11     // Catch:{ all -> 0x001a }
            java.lang.String r11 = java.lang.String.format(r5, r4)     // Catch:{ all -> 0x001a }
            r10.mo23431a(r11, r12)     // Catch:{ all -> 0x001a }
            r9.m20324d()     // Catch:{ all -> 0x001a }
            if (r2 == 0) goto L_0x007a
            boolean r10 = r2.isOpen()     // Catch:{ all -> 0x0088 }
            if (r10 == 0) goto L_0x007a
            goto L_0x0016
        L_0x007a:
            monitor-exit(r9)
            return r0
        L_0x007c:
            if (r2 == 0) goto L_0x0087
            boolean r11 = r2.isOpen()     // Catch:{ all -> 0x0088 }
            if (r11 == 0) goto L_0x0087
            r9.close()     // Catch:{ all -> 0x0088 }
        L_0x0087:
            throw r10     // Catch:{ all -> 0x0088 }
        L_0x0088:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplitude.api.C8683f.mo23391a(java.lang.String, java.lang.String, java.lang.Object):long");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public synchronized String mo23406d(String str) {
        return (String) mo23400b("store", str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public synchronized void mo23407d(long j) {
        m20322c("events", j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public synchronized void mo23405c(long j) {
        m20321b("events", j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00e9, code lost:
        if (r3.isOpen() != false) goto L_0x00eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00eb, code lost:
        close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0112, code lost:
        if (r3.isOpen() != false) goto L_0x00eb;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m20324d() {
        /*
            r10 = this;
            java.lang.String r0 = "DB: Failed to run databaseReset callback in delete"
            java.lang.String r1 = "databaseReset callback failed during delete"
            java.lang.String r2 = "com.amplitude.api.DatabaseHelper"
            r3 = 0
            r4 = 1
            r5 = 0
            r10.close()     // Catch:{ SecurityException -> 0x0069 }
            java.io.File r6 = r10.f22342e     // Catch:{ SecurityException -> 0x0069 }
            r6.delete()     // Catch:{ SecurityException -> 0x0069 }
            com.amplitude.api.DatabaseResetListener r6 = r10.f22344g
            if (r6 == 0) goto L_0x00cd
            boolean r6 = r10.f22343f
            if (r6 == 0) goto L_0x00cd
            r10.f22343f = r5
            android.database.sqlite.SQLiteDatabase r3 = r10.getWritableDatabase()     // Catch:{ SQLiteException -> 0x0035 }
            com.amplitude.api.DatabaseResetListener r6 = r10.f22344g     // Catch:{ SQLiteException -> 0x0035 }
            r6.onDatabaseReset(r3)     // Catch:{ SQLiteException -> 0x0035 }
            r10.f22343f = r4
            if (r3 == 0) goto L_0x00cd
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x00cd
        L_0x002e:
            r10.close()
            goto L_0x00cd
        L_0x0033:
            r0 = move-exception
            goto L_0x0059
        L_0x0035:
            r6 = move-exception
            com.amplitude.api.d r7 = f22341i     // Catch:{ all -> 0x0033 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = java.lang.String.format(r1, r8)     // Catch:{ all -> 0x0033 }
            r7.mo23379a(r2, r1, r6)     // Catch:{ all -> 0x0033 }
            com.amplitude.api.h r1 = com.amplitude.api.C8687h.m20402b()     // Catch:{ all -> 0x0033 }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x0033 }
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x0033 }
            r1.mo23431a(r0, r6)     // Catch:{ all -> 0x0033 }
            r10.f22343f = r4
            if (r3 == 0) goto L_0x00cd
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x00cd
            goto L_0x002e
        L_0x0059:
            r10.f22343f = r4
            if (r3 == 0) goto L_0x0066
            boolean r1 = r3.isOpen()
            if (r1 == 0) goto L_0x0066
            r10.close()
        L_0x0066:
            throw r0
        L_0x0067:
            r6 = move-exception
            goto L_0x00ce
        L_0x0069:
            r6 = move-exception
            com.amplitude.api.d r7 = f22341i     // Catch:{ all -> 0x0067 }
            java.lang.String r8 = "delete failed"
            r7.mo23379a(r2, r8, r6)     // Catch:{ all -> 0x0067 }
            com.amplitude.api.h r6 = com.amplitude.api.C8687h.m20402b()     // Catch:{ all -> 0x0067 }
            java.lang.String r7 = "DB: Failed to delete database"
            r6.mo23430a(r7)     // Catch:{ all -> 0x0067 }
            com.amplitude.api.DatabaseResetListener r6 = r10.f22344g
            if (r6 == 0) goto L_0x00cd
            boolean r6 = r10.f22343f
            if (r6 == 0) goto L_0x00cd
            r10.f22343f = r5
            android.database.sqlite.SQLiteDatabase r3 = r10.getWritableDatabase()     // Catch:{ SQLiteException -> 0x009a }
            com.amplitude.api.DatabaseResetListener r6 = r10.f22344g     // Catch:{ SQLiteException -> 0x009a }
            r6.onDatabaseReset(r3)     // Catch:{ SQLiteException -> 0x009a }
            r10.f22343f = r4
            if (r3 == 0) goto L_0x00cd
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x00cd
            goto L_0x002e
        L_0x0098:
            r0 = move-exception
            goto L_0x00bf
        L_0x009a:
            r6 = move-exception
            com.amplitude.api.d r7 = f22341i     // Catch:{ all -> 0x0098 }
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch:{ all -> 0x0098 }
            java.lang.String r1 = java.lang.String.format(r1, r8)     // Catch:{ all -> 0x0098 }
            r7.mo23379a(r2, r1, r6)     // Catch:{ all -> 0x0098 }
            com.amplitude.api.h r1 = com.amplitude.api.C8687h.m20402b()     // Catch:{ all -> 0x0098 }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x0098 }
            r1.mo23431a(r0, r6)     // Catch:{ all -> 0x0098 }
            r10.f22343f = r4
            if (r3 == 0) goto L_0x00cd
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x00cd
            goto L_0x002e
        L_0x00bf:
            r10.f22343f = r4
            if (r3 == 0) goto L_0x00cc
            boolean r1 = r3.isOpen()
            if (r1 == 0) goto L_0x00cc
            r10.close()
        L_0x00cc:
            throw r0
        L_0x00cd:
            return
        L_0x00ce:
            com.amplitude.api.DatabaseResetListener r7 = r10.f22344g
            if (r7 == 0) goto L_0x0123
            boolean r7 = r10.f22343f
            if (r7 == 0) goto L_0x0123
            r10.f22343f = r5
            android.database.sqlite.SQLiteDatabase r3 = r10.getWritableDatabase()     // Catch:{ SQLiteException -> 0x00f1 }
            com.amplitude.api.DatabaseResetListener r7 = r10.f22344g     // Catch:{ SQLiteException -> 0x00f1 }
            r7.onDatabaseReset(r3)     // Catch:{ SQLiteException -> 0x00f1 }
            r10.f22343f = r4
            if (r3 == 0) goto L_0x0123
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x0123
        L_0x00eb:
            r10.close()
            goto L_0x0123
        L_0x00ef:
            r0 = move-exception
            goto L_0x0115
        L_0x00f1:
            r7 = move-exception
            com.amplitude.api.d r8 = f22341i     // Catch:{ all -> 0x00ef }
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x00ef }
            java.lang.String r1 = java.lang.String.format(r1, r9)     // Catch:{ all -> 0x00ef }
            r8.mo23379a(r2, r1, r7)     // Catch:{ all -> 0x00ef }
            com.amplitude.api.h r1 = com.amplitude.api.C8687h.m20402b()     // Catch:{ all -> 0x00ef }
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x00ef }
            java.lang.String r0 = java.lang.String.format(r0, r2)     // Catch:{ all -> 0x00ef }
            r1.mo23431a(r0, r7)     // Catch:{ all -> 0x00ef }
            r10.f22343f = r4
            if (r3 == 0) goto L_0x0123
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L_0x0123
            goto L_0x00eb
        L_0x0115:
            r10.f22343f = r4
            if (r3 == 0) goto L_0x0122
            boolean r1 = r3.isOpen()
            if (r1 == 0) goto L_0x0122
            r10.close()
        L_0x0122:
            throw r0
        L_0x0123:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplitude.api.C8683f.m20324d():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public synchronized void mo23409f(long j) {
        m20322c("identifys", j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized List<JSONObject> mo23401b(long j, long j2) throws JSONException {
        return mo23394a("identifys", j, j2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized long mo23396b() {
        return m20326f("identifys");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized long mo23397b(long j) {
        return m20316a("identifys", j);
    }

    /* renamed from: b */
    private synchronized void m20321b(String str, long j) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            StringBuilder sb = new StringBuilder();
            sb.append("id = ");
            sb.append(j);
            writableDatabase.delete(str, sb.toString(), null);
        } catch (SQLiteException e) {
            f22341i.mo23379a("com.amplitude.api.DatabaseHelper", String.format("removeEvent from %s failed", new Object[]{str}), e);
            C8687h.m20402b().mo23431a(String.format("DB: Failed to removeEvent from table %s", new Object[]{str}), e);
            m20324d();
        } catch (StackOverflowError e2) {
            try {
                f22341i.mo23379a("com.amplitude.api.DatabaseHelper", String.format("removeEvent from %s failed", new Object[]{str}), e2);
                C8687h.m20402b().mo23431a(String.format("DB: Failed to removeEvent from table %s", new Object[]{str}), e2);
                m20324d();
            } catch (Throwable th) {
                close();
                throw th;
            }
        }
        close();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized long mo23387a(SQLiteDatabase sQLiteDatabase, String str, String str2, Object obj) throws SQLiteException, StackOverflowError {
        long b;
        ContentValues contentValues = new ContentValues();
        contentValues.put("key", str2);
        if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            contentValues.put("value", (String) obj);
        }
        b = mo23398b(sQLiteDatabase, str, contentValues);
        if (b == -1) {
            f22341i.mo23383d("com.amplitude.api.DatabaseHelper", "Insert failed");
        }
        return b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized long mo23390a(String str, String str2) {
        long j;
        j = -1;
        try {
            j = (long) getWritableDatabase().delete(str, "key=?", new String[]{str2});
            close();
        } catch (SQLiteException e) {
            f22341i.mo23379a("com.amplitude.api.DatabaseHelper", String.format("deleteKey from %s failed", new Object[]{str}), e);
            C8687h.m20402b().mo23431a(String.format("DB: Failed to deleteKey: %s", new Object[]{str2}), e);
            m20324d();
            close();
            return j;
        } catch (StackOverflowError e2) {
            try {
                f22341i.mo23379a("com.amplitude.api.DatabaseHelper", String.format("deleteKey from %s failed", new Object[]{str}), e2);
                C8687h.m20402b().mo23431a(String.format("DB: Failed to deleteKey: %s", new Object[]{str2}), e2);
                m20324d();
                close();
                return j;
            } catch (Throwable th) {
                close();
                throw th;
            }
        }
        return j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized long mo23388a(String str) {
        return m20323d("events", str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized long mo23386a(SQLiteDatabase sQLiteDatabase, String str, ContentValues contentValues) throws SQLiteException, StackOverflowError {
        return sQLiteDatabase.insert(str, null, contentValues);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized List<JSONObject> mo23393a(long j, long j2) throws JSONException {
        return mo23394a("events", j, j2);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00dc A[SYNTHETIC, Splitter:B:43:0x00dc] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0108 A[SYNTHETIC, Splitter:B:49:0x0108] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0111 A[SYNTHETIC, Splitter:B:54:0x0111] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:46:0x00e1=Splitter:B:46:0x00e1, B:40:0x00b5=Splitter:B:40:0x00b5} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List<org.json.JSONObject> mo23394a(java.lang.String r18, long r19, long r21) throws org.json.JSONException {
        /*
            r17 = this;
            r0 = r19
            r2 = r21
            monitor-enter(r17)
            java.util.LinkedList r11 = new java.util.LinkedList     // Catch:{ all -> 0x0118 }
            r11.<init>()     // Catch:{ all -> 0x0118 }
            r12 = 0
            r13 = 0
            r14 = 1
            android.database.sqlite.SQLiteDatabase r4 = r17.getReadableDatabase()     // Catch:{ SQLiteException -> 0x00e0, StackOverflowError -> 0x00b4, RuntimeException -> 0x009a }
            java.lang.String r5 = "id"
            java.lang.String r6 = "event"
            java.lang.String[] r5 = new java.lang.String[]{r5, r6}     // Catch:{ SQLiteException -> 0x00e0, StackOverflowError -> 0x00b4, RuntimeException -> 0x009a }
            r6 = 0
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x0031
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00e0, StackOverflowError -> 0x00b4, RuntimeException -> 0x009a }
            r8.<init>()     // Catch:{ SQLiteException -> 0x00e0, StackOverflowError -> 0x00b4, RuntimeException -> 0x009a }
            java.lang.String r9 = "id <= "
            r8.append(r9)     // Catch:{ SQLiteException -> 0x00e0, StackOverflowError -> 0x00b4, RuntimeException -> 0x009a }
            r8.append(r0)     // Catch:{ SQLiteException -> 0x00e0, StackOverflowError -> 0x00b4, RuntimeException -> 0x009a }
            java.lang.String r0 = r8.toString()     // Catch:{ SQLiteException -> 0x00e0, StackOverflowError -> 0x00b4, RuntimeException -> 0x009a }
            goto L_0x0032
        L_0x0031:
            r0 = r12
        L_0x0032:
            r8 = 0
            r9 = 0
            r10 = 0
            java.lang.String r15 = "id ASC"
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 < 0) goto L_0x004f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00e0, StackOverflowError -> 0x00b4, RuntimeException -> 0x009a }
            r1.<init>()     // Catch:{ SQLiteException -> 0x00e0, StackOverflowError -> 0x00b4, RuntimeException -> 0x009a }
            java.lang.String r6 = ""
            r1.append(r6)     // Catch:{ SQLiteException -> 0x00e0, StackOverflowError -> 0x00b4, RuntimeException -> 0x009a }
            r1.append(r2)     // Catch:{ SQLiteException -> 0x00e0, StackOverflowError -> 0x00b4, RuntimeException -> 0x009a }
            java.lang.String r1 = r1.toString()     // Catch:{ SQLiteException -> 0x00e0, StackOverflowError -> 0x00b4, RuntimeException -> 0x009a }
            r16 = r1
            goto L_0x0051
        L_0x004f:
            r16 = r12
        L_0x0051:
            r1 = r17
            r2 = r4
            r3 = r18
            r4 = r5
            r5 = r0
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r15
            r10 = r16
            android.database.Cursor r1 = r1.mo23392a(r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ SQLiteException -> 0x00e0, StackOverflowError -> 0x00b4, RuntimeException -> 0x009a }
        L_0x0062:
            boolean r0 = r1.moveToNext()     // Catch:{ SQLiteException -> 0x0094, StackOverflowError -> 0x0091, RuntimeException -> 0x008f }
            if (r0 == 0) goto L_0x0085
            long r2 = r1.getLong(r13)     // Catch:{ SQLiteException -> 0x0094, StackOverflowError -> 0x0091, RuntimeException -> 0x008f }
            java.lang.String r0 = r1.getString(r14)     // Catch:{ SQLiteException -> 0x0094, StackOverflowError -> 0x0091, RuntimeException -> 0x008f }
            boolean r4 = com.amplitude.api.C8693l.m20451a(r0)     // Catch:{ SQLiteException -> 0x0094, StackOverflowError -> 0x0091, RuntimeException -> 0x008f }
            if (r4 == 0) goto L_0x0077
            goto L_0x0062
        L_0x0077:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ SQLiteException -> 0x0094, StackOverflowError -> 0x0091, RuntimeException -> 0x008f }
            r4.<init>(r0)     // Catch:{ SQLiteException -> 0x0094, StackOverflowError -> 0x0091, RuntimeException -> 0x008f }
            java.lang.String r0 = "event_id"
            r4.put(r0, r2)     // Catch:{ SQLiteException -> 0x0094, StackOverflowError -> 0x0091, RuntimeException -> 0x008f }
            r11.add(r4)     // Catch:{ SQLiteException -> 0x0094, StackOverflowError -> 0x0091, RuntimeException -> 0x008f }
            goto L_0x0062
        L_0x0085:
            if (r1 == 0) goto L_0x008a
            r1.close()     // Catch:{ all -> 0x0118 }
        L_0x008a:
            r17.close()     // Catch:{ all -> 0x0118 }
            goto L_0x010d
        L_0x008f:
            r0 = move-exception
            goto L_0x009c
        L_0x0091:
            r0 = move-exception
            r12 = r1
            goto L_0x00b5
        L_0x0094:
            r0 = move-exception
            r12 = r1
            goto L_0x00e1
        L_0x0097:
            r0 = move-exception
            goto L_0x010f
        L_0x009a:
            r0 = move-exception
            r1 = r12
        L_0x009c:
            com.amplitude.api.h r2 = com.amplitude.api.C8687h.m20402b()     // Catch:{ all -> 0x00b1 }
            java.lang.String r3 = "DB: Failed to getEventsFromTable %s"
            java.lang.Object[] r4 = new java.lang.Object[r14]     // Catch:{ all -> 0x00b1 }
            r4[r13] = r18     // Catch:{ all -> 0x00b1 }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x00b1 }
            r2.mo23431a(r3, r0)     // Catch:{ all -> 0x00b1 }
            m20320a(r0)     // Catch:{ all -> 0x00b1 }
            throw r12
        L_0x00b1:
            r0 = move-exception
            r12 = r1
            goto L_0x010f
        L_0x00b4:
            r0 = move-exception
        L_0x00b5:
            com.amplitude.api.d r1 = f22341i     // Catch:{ all -> 0x0097 }
            java.lang.String r2 = "com.amplitude.api.DatabaseHelper"
            java.lang.String r3 = "getEvents from %s failed"
            java.lang.Object[] r4 = new java.lang.Object[r14]     // Catch:{ all -> 0x0097 }
            r4[r13] = r18     // Catch:{ all -> 0x0097 }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x0097 }
            r1.mo23379a(r2, r3, r0)     // Catch:{ all -> 0x0097 }
            com.amplitude.api.h r1 = com.amplitude.api.C8687h.m20402b()     // Catch:{ all -> 0x0097 }
            java.lang.String r2 = "DB: Failed to getEventsFromTable %s"
            java.lang.Object[] r3 = new java.lang.Object[r14]     // Catch:{ all -> 0x0097 }
            r3[r13] = r18     // Catch:{ all -> 0x0097 }
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x0097 }
            r1.mo23431a(r2, r0)     // Catch:{ all -> 0x0097 }
            r17.m20324d()     // Catch:{ all -> 0x0097 }
            if (r12 == 0) goto L_0x008a
            r12.close()     // Catch:{ all -> 0x0118 }
            goto L_0x008a
        L_0x00e0:
            r0 = move-exception
        L_0x00e1:
            com.amplitude.api.d r1 = f22341i     // Catch:{ all -> 0x0097 }
            java.lang.String r2 = "com.amplitude.api.DatabaseHelper"
            java.lang.String r3 = "getEvents from %s failed"
            java.lang.Object[] r4 = new java.lang.Object[r14]     // Catch:{ all -> 0x0097 }
            r4[r13] = r18     // Catch:{ all -> 0x0097 }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x0097 }
            r1.mo23379a(r2, r3, r0)     // Catch:{ all -> 0x0097 }
            com.amplitude.api.h r1 = com.amplitude.api.C8687h.m20402b()     // Catch:{ all -> 0x0097 }
            java.lang.String r2 = "DB: Failed to getEventsFromTable %s"
            java.lang.Object[] r3 = new java.lang.Object[r14]     // Catch:{ all -> 0x0097 }
            r3[r13] = r18     // Catch:{ all -> 0x0097 }
            java.lang.String r2 = java.lang.String.format(r2, r3)     // Catch:{ all -> 0x0097 }
            r1.mo23431a(r2, r0)     // Catch:{ all -> 0x0097 }
            r17.m20324d()     // Catch:{ all -> 0x0097 }
            if (r12 == 0) goto L_0x008a
            r12.close()     // Catch:{ all -> 0x0118 }
            goto L_0x008a
        L_0x010d:
            monitor-exit(r17)
            return r11
        L_0x010f:
            if (r12 == 0) goto L_0x0114
            r12.close()     // Catch:{ all -> 0x0118 }
        L_0x0114:
            r17.close()     // Catch:{ all -> 0x0118 }
            throw r0     // Catch:{ all -> 0x0118 }
        L_0x0118:
            r0 = move-exception
            monitor-exit(r17)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplitude.api.C8683f.mo23394a(java.lang.String, long, long):java.util.List");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized long mo23384a() {
        return m20326f("events");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized long mo23385a(long j) {
        return m20316a("events", j);
    }

    /* renamed from: a */
    private synchronized long m20316a(String str, long j) {
        long j2;
        SQLiteStatement sQLiteStatement = null;
        j2 = -1;
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT id FROM ");
            sb.append(str);
            sb.append(" LIMIT 1 OFFSET ");
            sb.append(j - 1);
            sQLiteStatement = readableDatabase.compileStatement(sb.toString());
            try {
                j2 = sQLiteStatement.simpleQueryForLong();
            } catch (SQLiteDoneException e) {
                f22341i.mo23380a("com.amplitude.api.DatabaseHelper", (Throwable) e);
            }
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
            }
        } catch (SQLiteException e2) {
            f22341i.mo23379a("com.amplitude.api.DatabaseHelper", String.format("getNthEventId from %s failed", new Object[]{str}), e2);
            C8687h.m20402b().mo23431a(String.format("DB: Failed to getNthEventId from table %s", new Object[]{str}), e2);
            m20324d();
            if (sQLiteStatement != null) {
                sQLiteStatement.close();
            }
        } catch (StackOverflowError e3) {
            try {
                f22341i.mo23379a("com.amplitude.api.DatabaseHelper", String.format("getNthEventId from %s failed", new Object[]{str}), e3);
                C8687h.m20402b().mo23431a(String.format("DB: Failed to getNthEventId from table %s", new Object[]{str}), e3);
                m20324d();
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
            } catch (Throwable th) {
                if (sQLiteStatement != null) {
                    sQLiteStatement.close();
                }
                close();
                throw th;
            }
        }
        close();
        return j2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Cursor mo23392a(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        return sQLiteDatabase.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
    }

    /* renamed from: a */
    private static void m20320a(RuntimeException runtimeException) {
        String message = runtimeException.getMessage();
        if (C8693l.m20451a(message) || !message.startsWith("Cursor window allocation of")) {
            throw runtimeException;
        }
        throw new CursorWindowAllocationException(message);
    }
}
