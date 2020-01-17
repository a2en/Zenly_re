package com.evernote.android.job;

import android.annotation.TargetApi;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build.VERSION;
import com.evernote.android.job.util.C9469c;
import java.io.File;

/* renamed from: com.evernote.android.job.j */
final class C9459j implements DatabaseErrorHandler {

    /* renamed from: a */
    private static final C9469c f24518a = new C9469c("DatabaseErrorHandler");

    C9459j() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo25394a(String str) {
        if (!str.equalsIgnoreCase(":memory:") && str.trim().length() != 0) {
            C9469c cVar = f24518a;
            StringBuilder sb = new StringBuilder();
            sb.append("deleting the database file: ");
            sb.append(str);
            cVar.mo25412b(sb.toString());
            try {
                File file = new File(str);
                if (VERSION.SDK_INT >= 16) {
                    mo25393a(file);
                } else {
                    mo25392a(C9447g.m22884g().mo25317c(), file);
                }
            } catch (Exception e) {
                C9469c cVar2 = f24518a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("delete failed: ");
                sb2.append(e.getMessage());
                cVar2.mo25414b(e, sb2.toString(), new Object[0]);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r0 != null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        r4 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r4.hasNext() != false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        mo25394a((java.lang.String) ((android.util.Pair) r4.next()).second);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        mo25394a(r4.getPath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0030 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002e A[ExcHandler: all (r1v2 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
      PHI: (r0v9 java.util.List) = (r0v2 java.util.List), (r0v3 java.util.List), (r0v3 java.util.List) binds: [B:5:0x0029, B:8:0x0030, B:9:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x0029] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCorruption(android.database.sqlite.SQLiteDatabase r4) {
        /*
            r3 = this;
            com.evernote.android.job.util.c r0 = f24518a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Corruption reported by sqlite on database: "
            r1.append(r2)
            java.lang.String r2 = r4.getPath()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.mo25412b(r1)
            boolean r0 = r4.isOpen()
            if (r0 != 0) goto L_0x0028
            java.lang.String r4 = r4.getPath()
            r3.mo25394a(r4)
            return
        L_0x0028:
            r0 = 0
            java.util.List r0 = r4.getAttachedDbs()     // Catch:{ SQLiteException -> 0x0030, all -> 0x002e }
            goto L_0x0030
        L_0x002e:
            r1 = move-exception
            goto L_0x0034
        L_0x0030:
            r4.close()     // Catch:{ SQLiteException -> 0x0056, all -> 0x002e }
            goto L_0x0057
        L_0x0034:
            if (r0 == 0) goto L_0x004e
            java.util.Iterator r4 = r0.iterator()
        L_0x003a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0055
            java.lang.Object r0 = r4.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            r3.mo25394a(r0)
            goto L_0x003a
        L_0x004e:
            java.lang.String r4 = r4.getPath()
            r3.mo25394a(r4)
        L_0x0055:
            throw r1
        L_0x0056:
        L_0x0057:
            if (r0 == 0) goto L_0x0071
            java.util.Iterator r4 = r0.iterator()
        L_0x005d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0078
            java.lang.Object r0 = r4.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            r3.mo25394a(r0)
            goto L_0x005d
        L_0x0071:
            java.lang.String r4 = r4.getPath()
            r3.mo25394a(r4)
        L_0x0078:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.evernote.android.job.C9459j.onCorruption(android.database.sqlite.SQLiteDatabase):void");
    }

    /* access modifiers changed from: 0000 */
    @TargetApi(16)
    /* renamed from: a */
    public void mo25393a(File file) {
        SQLiteDatabase.deleteDatabase(file);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo25392a(Context context, File file) {
        context.deleteDatabase(file.getName());
    }
}
