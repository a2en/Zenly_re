package zendesk.belvedere;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: zendesk.belvedere.p */
class C13529p extends AsyncTask<Uri, Void, List<MediaResult>> {

    /* renamed from: a */
    private final WeakReference<C13492c<List<MediaResult>>> f35073a;

    /* renamed from: b */
    private final Context f35074b;

    /* renamed from: c */
    private final C13530q f35075c;

    /* renamed from: d */
    private final String f35076d;

    private C13529p(Context context, C13530q qVar, C13492c<List<MediaResult>> cVar, String str) {
        this.f35074b = context;
        this.f35075c = qVar;
        this.f35076d = str;
        this.f35073a = new WeakReference<>(cVar);
    }

    /* renamed from: a */
    static void m35835a(Context context, C13530q qVar, C13492c<List<MediaResult>> cVar, List<Uri> list) {
        m35836a(context, qVar, cVar, list, null);
    }

    /* renamed from: a */
    static void m35836a(Context context, C13530q qVar, C13492c<List<MediaResult>> cVar, List<Uri> list, String str) {
        new C13529p(context, qVar, cVar, str).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Uri[]) list.toArray(new Uri[list.size()]));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005b, code lost:
        r12 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005f, code lost:
        r12 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0098, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0099, code lost:
        r1 = r0;
        r12 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009d, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009e, code lost:
        r25 = r15;
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a4, code lost:
        r25 = r15;
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0155, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0156, code lost:
        zendesk.belvedere.C13480L.m35693a(r5, r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0160, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0161, code lost:
        zendesk.belvedere.C13480L.m35693a(r5, r3, r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0147 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0098 A[ExcHandler: all (r0v31 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:8:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0107 A[SYNTHETIC, Splitter:B:65:0x0107] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0112 A[SYNTHETIC, Splitter:B:70:0x0112] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0133 A[SYNTHETIC, Splitter:B:80:0x0133] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x013e A[SYNTHETIC, Splitter:B:85:0x013e] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0151 A[SYNTHETIC, Splitter:B:91:0x0151] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x015c A[SYNTHETIC, Splitter:B:96:0x015c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<zendesk.belvedere.MediaResult> doInBackground(android.net.Uri... r27) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            java.lang.String r3 = "Error closing FileOutputStream"
            java.lang.String r4 = "Error closing InputStream"
            java.lang.String r5 = "Belvedere"
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r0 = 1048576(0x100000, float:1.469368E-39)
            byte[] r7 = new byte[r0]
            int r8 = r2.length
            r0 = 0
            r11 = r0
            r12 = r11
            r10 = 0
        L_0x0018:
            if (r10 >= r8) goto L_0x0166
            r15 = r2[r10]
            android.content.Context r0 = r1.f35074b     // Catch:{ FileNotFoundException -> 0x011d, IOException -> 0x00f1 }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ FileNotFoundException -> 0x011d, IOException -> 0x00f1 }
            java.io.InputStream r11 = r0.openInputStream(r15)     // Catch:{ FileNotFoundException -> 0x011d, IOException -> 0x00f1 }
            zendesk.belvedere.q r0 = r1.f35075c     // Catch:{ FileNotFoundException -> 0x011d, IOException -> 0x00f1 }
            android.content.Context r13 = r1.f35074b     // Catch:{ FileNotFoundException -> 0x011d, IOException -> 0x00f1 }
            java.lang.String r14 = r1.f35076d     // Catch:{ FileNotFoundException -> 0x011d, IOException -> 0x00f1 }
            java.io.File r14 = r0.mo38910a(r13, r15, r14)     // Catch:{ FileNotFoundException -> 0x011d, IOException -> 0x00f1 }
            r0 = 2
            if (r11 == 0) goto L_0x00aa
            if (r14 == 0) goto L_0x00aa
            java.util.Locale r13 = java.util.Locale.US     // Catch:{ FileNotFoundException -> 0x011d, IOException -> 0x00f1 }
            java.lang.String r9 = "Copying media file into private cache - Uri: %s - Dest: %s"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ FileNotFoundException -> 0x011d, IOException -> 0x00f1 }
            r17 = 0
            r0[r17] = r15     // Catch:{ FileNotFoundException -> 0x011d, IOException -> 0x00f1 }
            r16 = 1
            r0[r16] = r14     // Catch:{ FileNotFoundException -> 0x011d, IOException -> 0x00f1 }
            java.lang.String r0 = java.lang.String.format(r13, r9, r0)     // Catch:{ FileNotFoundException -> 0x011d, IOException -> 0x00f1 }
            zendesk.belvedere.C13480L.m35692a(r5, r0)     // Catch:{ FileNotFoundException -> 0x011d, IOException -> 0x00f1 }
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x011d, IOException -> 0x00f1 }
            r9.<init>(r14)     // Catch:{ FileNotFoundException -> 0x011d, IOException -> 0x00f1 }
        L_0x004f:
            int r0 = r11.read(r7)     // Catch:{ FileNotFoundException -> 0x00a3, IOException -> 0x009d, all -> 0x0098 }
            if (r0 <= 0) goto L_0x0062
            r12 = 0
            r9.write(r7, r12, r0)     // Catch:{ FileNotFoundException -> 0x005e, IOException -> 0x005a, all -> 0x0098 }
            goto L_0x004f
        L_0x005a:
            r0 = move-exception
            r12 = r9
            goto L_0x00f2
        L_0x005e:
            r0 = move-exception
            r12 = r9
            goto L_0x011e
        L_0x0062:
            android.content.Context r0 = r1.f35074b     // Catch:{ FileNotFoundException -> 0x00a3, IOException -> 0x009d, all -> 0x0098 }
            zendesk.belvedere.MediaResult r0 = zendesk.belvedere.C13530q.m35843b(r0, r15)     // Catch:{ FileNotFoundException -> 0x00a3, IOException -> 0x009d, all -> 0x0098 }
            zendesk.belvedere.MediaResult r12 = new zendesk.belvedere.MediaResult     // Catch:{ FileNotFoundException -> 0x00a3, IOException -> 0x009d, all -> 0x0098 }
            zendesk.belvedere.q r13 = r1.f35075c     // Catch:{ FileNotFoundException -> 0x00a3, IOException -> 0x009d, all -> 0x0098 }
            android.content.Context r2 = r1.f35074b     // Catch:{ FileNotFoundException -> 0x00a3, IOException -> 0x009d, all -> 0x0098 }
            android.net.Uri r2 = r13.mo38908a(r2, r14)     // Catch:{ FileNotFoundException -> 0x00a3, IOException -> 0x009d, all -> 0x0098 }
            java.lang.String r17 = r14.getName()     // Catch:{ FileNotFoundException -> 0x00a3, IOException -> 0x009d, all -> 0x0098 }
            java.lang.String r18 = r0.mo38842c()     // Catch:{ FileNotFoundException -> 0x00a3, IOException -> 0x009d, all -> 0x0098 }
            long r19 = r0.mo38848f()     // Catch:{ FileNotFoundException -> 0x00a3, IOException -> 0x009d, all -> 0x0098 }
            long r21 = r0.mo38850h()     // Catch:{ FileNotFoundException -> 0x00a3, IOException -> 0x009d, all -> 0x0098 }
            long r23 = r0.mo38841b()     // Catch:{ FileNotFoundException -> 0x00a3, IOException -> 0x009d, all -> 0x0098 }
            r13 = r12
            r1 = 1
            r25 = r15
            r15 = r2
            r16 = r25
            r13.<init>(r14, r15, r16, r17, r18, r19, r21, r23)     // Catch:{ FileNotFoundException -> 0x0096, IOException -> 0x0094, all -> 0x0098 }
            r6.add(r12)     // Catch:{ FileNotFoundException -> 0x0096, IOException -> 0x0094, all -> 0x0098 }
            goto L_0x00d2
        L_0x0094:
            r0 = move-exception
            goto L_0x00a1
        L_0x0096:
            r0 = move-exception
            goto L_0x00a7
        L_0x0098:
            r0 = move-exception
            r1 = r0
            r12 = r9
            goto L_0x014f
        L_0x009d:
            r0 = move-exception
            r25 = r15
            r1 = 1
        L_0x00a1:
            r12 = r9
            goto L_0x00f5
        L_0x00a3:
            r0 = move-exception
            r25 = r15
            r1 = 1
        L_0x00a7:
            r12 = r9
            goto L_0x0121
        L_0x00aa:
            r25 = r15
            r1 = 1
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ FileNotFoundException -> 0x00ec, IOException -> 0x00ea }
            java.lang.String r9 = "Unable to resolve uri. InputStream null = %s, File null = %s"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ FileNotFoundException -> 0x00ec, IOException -> 0x00ea }
            if (r11 != 0) goto L_0x00b7
            r13 = 1
            goto L_0x00b8
        L_0x00b7:
            r13 = 0
        L_0x00b8:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)     // Catch:{ FileNotFoundException -> 0x00ec, IOException -> 0x00ea }
            r15 = 0
            r0[r15] = r13     // Catch:{ FileNotFoundException -> 0x00ec, IOException -> 0x00ea }
            if (r14 != 0) goto L_0x00c3
            r13 = 1
            goto L_0x00c4
        L_0x00c3:
            r13 = 0
        L_0x00c4:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r13)     // Catch:{ FileNotFoundException -> 0x00ec, IOException -> 0x00ea }
            r0[r1] = r13     // Catch:{ FileNotFoundException -> 0x00ec, IOException -> 0x00ea }
            java.lang.String r0 = java.lang.String.format(r2, r9, r0)     // Catch:{ FileNotFoundException -> 0x00ec, IOException -> 0x00ea }
            zendesk.belvedere.C13480L.m35696c(r5, r0)     // Catch:{ FileNotFoundException -> 0x00ec, IOException -> 0x00ea }
            r9 = r12
        L_0x00d2:
            if (r11 == 0) goto L_0x00dd
            r11.close()     // Catch:{ IOException -> 0x00d8 }
            goto L_0x00dd
        L_0x00d8:
            r0 = move-exception
            r1 = r0
            zendesk.belvedere.C13480L.m35693a(r5, r4, r1)
        L_0x00dd:
            if (r9 == 0) goto L_0x00e8
            r9.close()     // Catch:{ IOException -> 0x00e3 }
            goto L_0x00e8
        L_0x00e3:
            r0 = move-exception
            r1 = r0
            zendesk.belvedere.C13480L.m35693a(r5, r3, r1)
        L_0x00e8:
            r12 = r9
            goto L_0x011b
        L_0x00ea:
            r0 = move-exception
            goto L_0x00f5
        L_0x00ec:
            r0 = move-exception
            goto L_0x0121
        L_0x00ee:
            r0 = move-exception
            r1 = r0
            goto L_0x014f
        L_0x00f1:
            r0 = move-exception
        L_0x00f2:
            r25 = r15
            r1 = 1
        L_0x00f5:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x00ee }
            java.lang.String r9 = "IO Error copying file, uri: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00ee }
            r13 = 0
            r1[r13] = r25     // Catch:{ all -> 0x00ee }
            java.lang.String r1 = java.lang.String.format(r2, r9, r1)     // Catch:{ all -> 0x00ee }
            zendesk.belvedere.C13480L.m35693a(r5, r1, r0)     // Catch:{ all -> 0x00ee }
            if (r11 == 0) goto L_0x0110
            r11.close()     // Catch:{ IOException -> 0x010b }
            goto L_0x0110
        L_0x010b:
            r0 = move-exception
            r1 = r0
            zendesk.belvedere.C13480L.m35693a(r5, r4, r1)
        L_0x0110:
            if (r12 == 0) goto L_0x011b
            r12.close()     // Catch:{ IOException -> 0x0116 }
            goto L_0x011b
        L_0x0116:
            r0 = move-exception
            r1 = r0
            zendesk.belvedere.C13480L.m35693a(r5, r3, r1)
        L_0x011b:
            r13 = 0
            goto L_0x0147
        L_0x011d:
            r0 = move-exception
        L_0x011e:
            r25 = r15
            r1 = 1
        L_0x0121:
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x00ee }
            java.lang.String r9 = "File not found error copying file, uri: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00ee }
            r13 = 0
            r1[r13] = r25     // Catch:{ all -> 0x00ee }
            java.lang.String r1 = java.lang.String.format(r2, r9, r1)     // Catch:{ all -> 0x00ee }
            zendesk.belvedere.C13480L.m35693a(r5, r1, r0)     // Catch:{ all -> 0x00ee }
            if (r11 == 0) goto L_0x013c
            r11.close()     // Catch:{ IOException -> 0x0137 }
            goto L_0x013c
        L_0x0137:
            r0 = move-exception
            r1 = r0
            zendesk.belvedere.C13480L.m35693a(r5, r4, r1)
        L_0x013c:
            if (r12 == 0) goto L_0x0147
            r12.close()     // Catch:{ IOException -> 0x0142 }
            goto L_0x0147
        L_0x0142:
            r0 = move-exception
            r1 = r0
            zendesk.belvedere.C13480L.m35693a(r5, r3, r1)
        L_0x0147:
            int r10 = r10 + 1
            r1 = r26
            r2 = r27
            goto L_0x0018
        L_0x014f:
            if (r11 == 0) goto L_0x015a
            r11.close()     // Catch:{ IOException -> 0x0155 }
            goto L_0x015a
        L_0x0155:
            r0 = move-exception
            r2 = r0
            zendesk.belvedere.C13480L.m35693a(r5, r4, r2)
        L_0x015a:
            if (r12 == 0) goto L_0x0165
            r12.close()     // Catch:{ IOException -> 0x0160 }
            goto L_0x0165
        L_0x0160:
            r0 = move-exception
            r2 = r0
            zendesk.belvedere.C13480L.m35693a(r5, r3, r2)
        L_0x0165:
            throw r1
        L_0x0166:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.belvedere.C13529p.doInBackground(android.net.Uri[]):java.util.List");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(List<MediaResult> list) {
        super.onPostExecute(list);
        C13492c cVar = (C13492c) this.f35073a.get();
        if (cVar != null) {
            cVar.internalSuccess(list);
        } else {
            C13480L.m35696c("Belvedere", "Callback null");
        }
    }
}
