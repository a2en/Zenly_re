package com.android.volley.toolbox;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.volley.C8713d;
import com.android.volley.C8716g;
import com.android.volley.Cache;
import com.android.volley.Cache.C8702a;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.android.volley.toolbox.e */
public class C8725e implements Cache {

    /* renamed from: a */
    private final Map<String, C8726a> f22481a;

    /* renamed from: b */
    private long f22482b;

    /* renamed from: c */
    private final File f22483c;

    /* renamed from: d */
    private final int f22484d;

    /* renamed from: com.android.volley.toolbox.e$a */
    static class C8726a {

        /* renamed from: a */
        long f22485a;

        /* renamed from: b */
        final String f22486b;

        /* renamed from: c */
        final String f22487c;

        /* renamed from: d */
        final long f22488d;

        /* renamed from: e */
        final long f22489e;

        /* renamed from: f */
        final long f22490f;

        /* renamed from: g */
        final long f22491g;

        /* renamed from: h */
        final List<C8713d> f22492h;

        private C8726a(String str, String str2, long j, long j2, long j3, long j4, List<C8713d> list) {
            this.f22486b = str;
            if ("".equals(str2)) {
                str2 = null;
            }
            this.f22487c = str2;
            this.f22488d = j;
            this.f22489e = j2;
            this.f22490f = j3;
            this.f22491g = j4;
            this.f22492h = list;
        }

        /* renamed from: a */
        private static List<C8713d> m20553a(C8702a aVar) {
            List<C8713d> list = aVar.f22404h;
            if (list != null) {
                return list;
            }
            return C8730g.m20566a(aVar.f22403g);
        }

        /* renamed from: a */
        static C8726a m20552a(C8727b bVar) throws IOException {
            if (C8725e.m20544b((InputStream) bVar) == 538247942) {
                C8726a aVar = new C8726a(C8725e.m20545b(bVar), C8725e.m20545b(bVar), C8725e.m20547c((InputStream) bVar), C8725e.m20547c((InputStream) bVar), C8725e.m20547c((InputStream) bVar), C8725e.m20547c((InputStream) bVar), C8725e.m20536a(bVar));
                return aVar;
            }
            throw new IOException();
        }

        C8726a(String str, C8702a aVar) {
            this(str, aVar.f22398b, aVar.f22399c, aVar.f22400d, aVar.f22401e, aVar.f22402f, m20553a(aVar));
            this.f22485a = (long) aVar.f22397a.length;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C8702a mo23599a(byte[] bArr) {
            C8702a aVar = new C8702a();
            aVar.f22397a = bArr;
            aVar.f22398b = this.f22487c;
            aVar.f22399c = this.f22488d;
            aVar.f22400d = this.f22489e;
            aVar.f22401e = this.f22490f;
            aVar.f22402f = this.f22491g;
            aVar.f22403g = C8730g.m20567a(this.f22492h);
            aVar.f22404h = Collections.unmodifiableList(this.f22492h);
            return aVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo23600a(OutputStream outputStream) {
            try {
                C8725e.m20538a(outputStream, 538247942);
                C8725e.m20540a(outputStream, this.f22486b);
                C8725e.m20540a(outputStream, this.f22487c == null ? "" : this.f22487c);
                C8725e.m20539a(outputStream, this.f22488d);
                C8725e.m20539a(outputStream, this.f22489e);
                C8725e.m20539a(outputStream, this.f22490f);
                C8725e.m20539a(outputStream, this.f22491g);
                C8725e.m20542a(this.f22492h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e) {
                C8716g.m20507b("%s", e.toString());
                return false;
            }
        }
    }

    /* renamed from: com.android.volley.toolbox.e$b */
    static class C8727b extends FilterInputStream {

        /* renamed from: e */
        private final long f22493e;

        /* renamed from: f */
        private long f22494f;

        C8727b(InputStream inputStream, long j) {
            super(inputStream);
            this.f22493e = j;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public long mo23601a() {
            return this.f22493e - this.f22494f;
        }

        public int read() throws IOException {
            int read = super.read();
            if (read != -1) {
                this.f22494f++;
            }
            return read;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.f22494f += (long) read;
            }
            return read;
        }
    }

    public C8725e(File file, int i) {
        this.f22481a = new LinkedHashMap(16, 0.75f, true);
        this.f22482b = 0;
        this.f22483c = file;
        this.f22484d = i;
    }

    /* renamed from: b */
    private String m20546b(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(str.substring(0, length).hashCode());
        StringBuilder sb = new StringBuilder();
        sb.append(valueOf);
        sb.append(String.valueOf(str.substring(length).hashCode()));
        return sb.toString();
    }

    /* renamed from: c */
    private void m20548c(String str) {
        C8726a aVar = (C8726a) this.f22481a.remove(str);
        if (aVar != null) {
            this.f22482b -= aVar.f22485a;
        }
    }

    /* renamed from: a */
    public File mo23596a(String str) {
        return new File(this.f22483c, m20546b(str));
    }

    public synchronized void clear() {
        File[] listFiles = this.f22483c.listFiles();
        if (listFiles != null) {
            for (File delete : listFiles) {
                delete.delete();
            }
        }
        this.f22481a.clear();
        this.f22482b = 0;
        C8716g.m20507b("Cache cleared.", new Object[0]);
    }

    public synchronized C8702a get(String str) {
        C8727b bVar;
        C8726a aVar = (C8726a) this.f22481a.get(str);
        if (aVar == null) {
            return null;
        }
        File a = mo23596a(str);
        try {
            bVar = new C8727b(new BufferedInputStream(mo23597a(a)), a.length());
            C8726a a2 = C8726a.m20552a(bVar);
            if (!TextUtils.equals(str, a2.f22486b)) {
                C8716g.m20507b("%s: key=%s, found=%s", a.getAbsolutePath(), str, a2.f22486b);
                m20548c(str);
                bVar.close();
                return null;
            }
            C8702a a3 = aVar.mo23599a(m20543a(bVar, bVar.mo23601a()));
            bVar.close();
            return a3;
        } catch (IOException e) {
            C8716g.m20507b("%s: %s", a.getAbsolutePath(), e.toString());
            remove(str);
            return null;
        } catch (Throwable th) {
            bVar.close();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0059 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void initialize() {
        /*
            r9 = this;
            monitor-enter(r9)
            java.io.File r0 = r9.f22483c     // Catch:{ all -> 0x0061 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0061 }
            r1 = 0
            if (r0 != 0) goto L_0x0024
            java.io.File r0 = r9.f22483c     // Catch:{ all -> 0x0061 }
            boolean r0 = r0.mkdirs()     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "Unable to create cache dir %s"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0061 }
            java.io.File r3 = r9.f22483c     // Catch:{ all -> 0x0061 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x0061 }
            r2[r1] = r3     // Catch:{ all -> 0x0061 }
            com.android.volley.C8716g.m20508c(r0, r2)     // Catch:{ all -> 0x0061 }
        L_0x0022:
            monitor-exit(r9)
            return
        L_0x0024:
            java.io.File r0 = r9.f22483c     // Catch:{ all -> 0x0061 }
            java.io.File[] r0 = r0.listFiles()     // Catch:{ all -> 0x0061 }
            if (r0 != 0) goto L_0x002e
            monitor-exit(r9)
            return
        L_0x002e:
            int r2 = r0.length     // Catch:{ all -> 0x0061 }
        L_0x002f:
            if (r1 >= r2) goto L_0x005f
            r3 = r0[r1]     // Catch:{ all -> 0x0061 }
            long r4 = r3.length()     // Catch:{ IOException -> 0x0059 }
            com.android.volley.toolbox.e$b r6 = new com.android.volley.toolbox.e$b     // Catch:{ IOException -> 0x0059 }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0059 }
            java.io.InputStream r8 = r9.mo23597a(r3)     // Catch:{ IOException -> 0x0059 }
            r7.<init>(r8)     // Catch:{ IOException -> 0x0059 }
            r6.<init>(r7, r4)     // Catch:{ IOException -> 0x0059 }
            com.android.volley.toolbox.e$a r7 = com.android.volley.toolbox.C8725e.C8726a.m20552a(r6)     // Catch:{ all -> 0x0054 }
            r7.f22485a = r4     // Catch:{ all -> 0x0054 }
            java.lang.String r4 = r7.f22486b     // Catch:{ all -> 0x0054 }
            r9.m20541a(r4, r7)     // Catch:{ all -> 0x0054 }
            r6.close()     // Catch:{ IOException -> 0x0059 }
            goto L_0x005c
        L_0x0054:
            r4 = move-exception
            r6.close()     // Catch:{ IOException -> 0x0059 }
            throw r4     // Catch:{ IOException -> 0x0059 }
        L_0x0059:
            r3.delete()     // Catch:{ all -> 0x0061 }
        L_0x005c:
            int r1 = r1 + 1
            goto L_0x002f
        L_0x005f:
            monitor-exit(r9)
            return
        L_0x0061:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.C8725e.initialize():void");
    }

    public synchronized void invalidate(String str, boolean z) {
        C8702a aVar = get(str);
        if (aVar != null) {
            aVar.f22402f = 0;
            if (z) {
                aVar.f22401e = 0;
            }
            put(str, aVar);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:13|14|(1:16)|17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        if (r0.delete() == false) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        com.android.volley.C8716g.m20507b("Could not clean up file %s", r0.getAbsolutePath());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0058, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0044 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void put(java.lang.String r7, com.android.volley.Cache.C8702a r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r8.f22397a     // Catch:{ all -> 0x0059 }
            int r0 = r0.length     // Catch:{ all -> 0x0059 }
            r6.m20537a(r0)     // Catch:{ all -> 0x0059 }
            java.io.File r0 = r6.mo23596a(r7)     // Catch:{ all -> 0x0059 }
            r1 = 0
            r2 = 1
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0044 }
            java.io.OutputStream r4 = r6.mo23598b(r0)     // Catch:{ IOException -> 0x0044 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0044 }
            com.android.volley.toolbox.e$a r4 = new com.android.volley.toolbox.e$a     // Catch:{ IOException -> 0x0044 }
            r4.<init>(r7, r8)     // Catch:{ IOException -> 0x0044 }
            boolean r5 = r4.mo23600a(r3)     // Catch:{ IOException -> 0x0044 }
            if (r5 == 0) goto L_0x002e
            byte[] r8 = r8.f22397a     // Catch:{ IOException -> 0x0044 }
            r3.write(r8)     // Catch:{ IOException -> 0x0044 }
            r3.close()     // Catch:{ IOException -> 0x0044 }
            r6.m20541a(r7, r4)     // Catch:{ IOException -> 0x0044 }
            monitor-exit(r6)
            return
        L_0x002e:
            r3.close()     // Catch:{ IOException -> 0x0044 }
            java.lang.String r7 = "Failed to write header for %s"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x0044 }
            java.lang.String r3 = r0.getAbsolutePath()     // Catch:{ IOException -> 0x0044 }
            r8[r1] = r3     // Catch:{ IOException -> 0x0044 }
            com.android.volley.C8716g.m20507b(r7, r8)     // Catch:{ IOException -> 0x0044 }
            java.io.IOException r7 = new java.io.IOException     // Catch:{ IOException -> 0x0044 }
            r7.<init>()     // Catch:{ IOException -> 0x0044 }
            throw r7     // Catch:{ IOException -> 0x0044 }
        L_0x0044:
            boolean r7 = r0.delete()     // Catch:{ all -> 0x0059 }
            if (r7 != 0) goto L_0x0057
            java.lang.String r7 = "Could not clean up file %s"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ all -> 0x0059 }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ all -> 0x0059 }
            r8[r1] = r0     // Catch:{ all -> 0x0059 }
            com.android.volley.C8716g.m20507b(r7, r8)     // Catch:{ all -> 0x0059 }
        L_0x0057:
            monitor-exit(r6)
            return
        L_0x0059:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.C8725e.put(java.lang.String, com.android.volley.Cache$a):void");
    }

    public synchronized void remove(String str) {
        boolean delete = mo23596a(str).delete();
        m20548c(str);
        if (!delete) {
            C8716g.m20507b("Could not delete cache entry for key=%s, filename=%s", str, m20546b(str));
        }
    }

    /* renamed from: a */
    private void m20537a(int i) {
        long j;
        long j2 = (long) i;
        if (this.f22482b + j2 >= ((long) this.f22484d)) {
            if (C8716g.f22461b) {
                C8716g.m20509d("Pruning old cache entries.", new Object[0]);
            }
            long j3 = this.f22482b;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Iterator it = this.f22481a.entrySet().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                C8726a aVar = (C8726a) ((Entry) it.next()).getValue();
                if (mo23596a(aVar.f22486b).delete()) {
                    j = j2;
                    this.f22482b -= aVar.f22485a;
                } else {
                    j = j2;
                    String str = aVar.f22486b;
                    C8716g.m20507b("Could not delete cache entry for key=%s, filename=%s", str, m20546b(str));
                }
                it.remove();
                i2++;
                if (((float) (this.f22482b + j)) < ((float) this.f22484d) * 0.9f) {
                    break;
                }
                j2 = j;
            }
            if (C8716g.f22461b) {
                C8716g.m20509d("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.f22482b - j3), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            }
        }
    }

    /* renamed from: c */
    static long m20547c(InputStream inputStream) throws IOException {
        return ((((long) m20535a(inputStream)) & 255) << 0) | 0 | ((((long) m20535a(inputStream)) & 255) << 8) | ((((long) m20535a(inputStream)) & 255) << 16) | ((((long) m20535a(inputStream)) & 255) << 24) | ((((long) m20535a(inputStream)) & 255) << 32) | ((((long) m20535a(inputStream)) & 255) << 40) | ((((long) m20535a(inputStream)) & 255) << 48) | ((255 & ((long) m20535a(inputStream))) << 56);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public OutputStream mo23598b(File file) throws FileNotFoundException {
        return new FileOutputStream(file);
    }

    /* renamed from: b */
    static int m20544b(InputStream inputStream) throws IOException {
        return (m20535a(inputStream) << 24) | (m20535a(inputStream) << 0) | 0 | (m20535a(inputStream) << 8) | (m20535a(inputStream) << 16);
    }

    public C8725e(File file) {
        this(file, 5242880);
    }

    /* renamed from: b */
    static String m20545b(C8727b bVar) throws IOException {
        return new String(m20543a(bVar, m20547c((InputStream) bVar)), "UTF-8");
    }

    /* renamed from: a */
    private void m20541a(String str, C8726a aVar) {
        if (!this.f22481a.containsKey(str)) {
            this.f22482b += aVar.f22485a;
        } else {
            this.f22482b += aVar.f22485a - ((C8726a) this.f22481a.get(str)).f22485a;
        }
        this.f22481a.put(str, aVar);
    }

    /* renamed from: a */
    static byte[] m20543a(C8727b bVar, long j) throws IOException {
        long a = bVar.mo23601a();
        if (j >= 0 && j <= a) {
            int i = (int) j;
            if (((long) i) == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(bVar).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("streamToBytes length=");
        sb.append(j);
        sb.append(", maxLength=");
        sb.append(a);
        throw new IOException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public InputStream mo23597a(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    /* renamed from: a */
    private static int m20535a(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    /* renamed from: a */
    static void m20538a(OutputStream outputStream, int i) throws IOException {
        outputStream.write((i >> 0) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    /* renamed from: a */
    static void m20539a(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) ((int) (j >>> 0)));
        outputStream.write((byte) ((int) (j >>> 8)));
        outputStream.write((byte) ((int) (j >>> 16)));
        outputStream.write((byte) ((int) (j >>> 24)));
        outputStream.write((byte) ((int) (j >>> 32)));
        outputStream.write((byte) ((int) (j >>> 40)));
        outputStream.write((byte) ((int) (j >>> 48)));
        outputStream.write((byte) ((int) (j >>> 56)));
    }

    /* renamed from: a */
    static void m20540a(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        m20539a(outputStream, (long) bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    /* renamed from: a */
    static void m20542a(List<C8713d> list, OutputStream outputStream) throws IOException {
        if (list != null) {
            m20538a(outputStream, list.size());
            for (C8713d dVar : list) {
                m20540a(outputStream, dVar.mo23571a());
                m20540a(outputStream, dVar.mo23572b());
            }
            return;
        }
        m20538a(outputStream, 0);
    }

    /* renamed from: a */
    static List<C8713d> m20536a(C8727b bVar) throws IOException {
        int b = m20544b((InputStream) bVar);
        if (b >= 0) {
            List<C8713d> emptyList = b == 0 ? Collections.emptyList() : new ArrayList<>();
            for (int i = 0; i < b; i++) {
                emptyList.add(new C8713d(m20545b(bVar).intern(), m20545b(bVar).intern()));
            }
            return emptyList;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("readHeaderList size=");
        sb.append(b);
        throw new IOException(sb.toString());
    }
}
