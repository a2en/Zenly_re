package com.bumptech.glide.p292l;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.StrictMode.ThreadPolicy.Builder;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bumptech.glide.l.a */
public final class C8872a implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final File f23127e;

    /* renamed from: f */
    private final File f23128f;

    /* renamed from: g */
    private final File f23129g;

    /* renamed from: h */
    private final File f23130h;

    /* renamed from: i */
    private final int f23131i;

    /* renamed from: j */
    private long f23132j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final int f23133k;

    /* renamed from: l */
    private long f23134l = 0;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Writer f23135m;

    /* renamed from: n */
    private final LinkedHashMap<String, C8876d> f23136n = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f23137o;

    /* renamed from: p */
    private long f23138p = 0;

    /* renamed from: q */
    final ThreadPoolExecutor f23139q;

    /* renamed from: r */
    private final Callable<Void> f23140r;

    /* renamed from: com.bumptech.glide.l.a$a */
    class C8873a implements Callable<Void> {
        C8873a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() throws java.lang.Exception {
            /*
                r4 = this;
                com.bumptech.glide.l.a r0 = com.bumptech.glide.p292l.C8872a.this
                monitor-enter(r0)
                com.bumptech.glide.l.a r1 = com.bumptech.glide.p292l.C8872a.this     // Catch:{ all -> 0x0028 }
                java.io.Writer r1 = r1.f23135m     // Catch:{ all -> 0x0028 }
                r2 = 0
                if (r1 != 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x000e:
                com.bumptech.glide.l.a r1 = com.bumptech.glide.p292l.C8872a.this     // Catch:{ all -> 0x0028 }
                r1.m21288g()     // Catch:{ all -> 0x0028 }
                com.bumptech.glide.l.a r1 = com.bumptech.glide.p292l.C8872a.this     // Catch:{ all -> 0x0028 }
                boolean r1 = r1.m21280c()     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0026
                com.bumptech.glide.l.a r1 = com.bumptech.glide.p292l.C8872a.this     // Catch:{ all -> 0x0028 }
                r1.m21286f()     // Catch:{ all -> 0x0028 }
                com.bumptech.glide.l.a r1 = com.bumptech.glide.p292l.C8872a.this     // Catch:{ all -> 0x0028 }
                r3 = 0
                r1.f23137o = r3     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p292l.C8872a.C8873a.call():java.lang.Void");
        }
    }

    /* renamed from: com.bumptech.glide.l.a$b */
    private static final class C8874b implements ThreadFactory {
        private C8874b() {
        }

        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ C8874b(C8873a aVar) {
            this();
        }
    }

    /* renamed from: com.bumptech.glide.l.a$c */
    public final class C8875c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C8876d f23142a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean[] f23143b;

        /* renamed from: c */
        private boolean f23144c;

        /* synthetic */ C8875c(C8872a aVar, C8876d dVar, C8873a aVar2) {
            this(dVar);
        }

        /* renamed from: c */
        public void mo24208c() throws IOException {
            C8872a.this.m21271a(this, true);
            this.f23144c = true;
        }

        private C8875c(C8876d dVar) {
            this.f23142a = dVar;
            this.f23143b = dVar.f23150e ? null : new boolean[C8872a.this.f23133k];
        }

        /* renamed from: a */
        public File mo24205a(int i) throws IOException {
            File b;
            synchronized (C8872a.this) {
                if (this.f23142a.f23151f == this) {
                    if (!this.f23142a.f23150e) {
                        this.f23143b[i] = true;
                    }
                    b = this.f23142a.mo24211b(i);
                    if (!C8872a.this.f23127e.exists()) {
                        C8872a.this.f23127e.mkdirs();
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            return b;
        }

        /* renamed from: b */
        public void mo24207b() {
            if (!this.f23144c) {
                try {
                    mo24206a();
                } catch (IOException unused) {
                }
            }
        }

        /* renamed from: a */
        public void mo24206a() throws IOException {
            C8872a.this.m21271a(this, false);
        }
    }

    /* renamed from: com.bumptech.glide.l.a$d */
    private final class C8876d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f23146a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long[] f23147b;

        /* renamed from: c */
        File[] f23148c;

        /* renamed from: d */
        File[] f23149d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f23150e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C8875c f23151f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public long f23152g;

        /* synthetic */ C8876d(C8872a aVar, String str, C8873a aVar2) {
            this(str);
        }

        private C8876d(String str) {
            this.f23146a = str;
            this.f23147b = new long[C8872a.this.f23133k];
            this.f23148c = new File[C8872a.this.f23133k];
            this.f23149d = new File[C8872a.this.f23133k];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i = 0; i < C8872a.this.f23133k; i++) {
                sb.append(i);
                this.f23148c[i] = new File(C8872a.this.f23127e, sb.toString());
                sb.append(".tmp");
                this.f23149d[i] = new File(C8872a.this.f23127e, sb.toString());
                sb.setLength(length);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m21306b(String[] strArr) throws IOException {
            if (strArr.length == C8872a.this.f23133k) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f23147b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        m21301a(strArr);
                        throw null;
                    }
                }
                return;
            }
            m21301a(strArr);
            throw null;
        }

        /* renamed from: a */
        public String mo24210a() throws IOException {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.f23147b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* renamed from: b */
        public File mo24211b(int i) {
            return this.f23149d[i];
        }

        /* renamed from: a */
        private IOException m21301a(String[] strArr) throws IOException {
            StringBuilder sb = new StringBuilder();
            sb.append("unexpected journal line: ");
            sb.append(Arrays.toString(strArr));
            throw new IOException(sb.toString());
        }

        /* renamed from: a */
        public File mo24209a(int i) {
            return this.f23148c[i];
        }
    }

    /* renamed from: com.bumptech.glide.l.a$e */
    public final class C8877e {

        /* renamed from: a */
        private final File[] f23154a;

        /* synthetic */ C8877e(C8872a aVar, String str, long j, File[] fileArr, long[] jArr, C8873a aVar2) {
            this(aVar, str, j, fileArr, jArr);
        }

        /* renamed from: a */
        public File mo24212a(int i) {
            return this.f23154a[i];
        }

        private C8877e(C8872a aVar, String str, long j, File[] fileArr, long[] jArr) {
            this.f23154a = fileArr;
        }
    }

    private C8872a(File file, int i, int i2, long j) {
        File file2 = file;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C8874b(null));
        this.f23139q = threadPoolExecutor;
        this.f23140r = new C8873a();
        this.f23127e = file2;
        this.f23131i = i;
        this.f23128f = new File(file2, "journal");
        this.f23129g = new File(file2, "journal.tmp");
        this.f23130h = new File(file2, "journal.bkp");
        this.f23133k = i2;
        this.f23132j = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m21288g() throws IOException {
        while (this.f23134l > this.f23132j) {
            mo24201c((String) ((Entry) this.f23136n.entrySet().iterator().next()).getKey());
        }
    }

    public synchronized void close() throws IOException {
        if (this.f23135m != null) {
            Iterator it = new ArrayList(this.f23136n.values()).iterator();
            while (it.hasNext()) {
                C8876d dVar = (C8876d) it.next();
                if (dVar.f23151f != null) {
                    dVar.f23151f.mo24206a();
                }
            }
            m21288g();
            m21275a(this.f23135m);
            this.f23135m = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m21280c() {
        int i = this.f23137o;
        return i >= 2000 && i >= this.f23136n.size();
    }

    /* renamed from: d */
    private void m21283d(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        String str3 = "unexpected journal line: ";
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f23136n.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C8876d dVar = (C8876d) this.f23136n.get(str2);
            if (dVar == null) {
                dVar = new C8876d(this, str2, null);
                this.f23136n.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f23150e = true;
                dVar.f23151f = null;
                dVar.m21306b(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f23151f = new C8875c(this, dVar, null);
            } else if (!(indexOf2 == -1 && indexOf == 4 && str.startsWith("READ"))) {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(str);
                throw new IOException(sb.toString());
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str3);
        sb2.append(str);
        throw new IOException(sb2.toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)(1:20)|21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f23137o = r0 - r9.f23136n.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        if (r1.mo24213a() != false) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        m21286f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r9.f23135m = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f23128f, true), com.bumptech.glide.p292l.C8880c.f23161a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x008c=Splitter:B:23:0x008c, B:16:0x005f=Splitter:B:16:0x005f} */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m21284e() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            com.bumptech.glide.l.b r1 = new com.bumptech.glide.l.b
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f23128f
            r2.<init>(r3)
            java.nio.charset.Charset r3 = com.bumptech.glide.p292l.C8880c.f23161a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.mo24214b()     // Catch:{ all -> 0x00ba }
            java.lang.String r3 = r1.mo24214b()     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = r1.mo24214b()     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r1.mo24214b()     // Catch:{ all -> 0x00ba }
            java.lang.String r6 = r1.mo24214b()     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00ba }
            if (r7 == 0) goto L_0x008c
            int r7 = r9.f23131i     // Catch:{ all -> 0x00ba }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00ba }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            int r4 = r9.f23133k     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00ba }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x008c
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.mo24214b()     // Catch:{ EOFException -> 0x005f }
            r9.m21283d(r2)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.l.a$d> r2 = r9.f23136n     // Catch:{ all -> 0x00ba }
            int r2 = r2.size()     // Catch:{ all -> 0x00ba }
            int r0 = r0 - r2
            r9.f23137o = r0     // Catch:{ all -> 0x00ba }
            boolean r0 = r1.mo24213a()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0072
            r9.m21286f()     // Catch:{ all -> 0x00ba }
            goto L_0x0088
        L_0x0072:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x00ba }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x00ba }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ba }
            java.io.File r4 = r9.f23128f     // Catch:{ all -> 0x00ba }
            r5 = 1
            r3.<init>(r4, r5)     // Catch:{ all -> 0x00ba }
            java.nio.charset.Charset r4 = com.bumptech.glide.p292l.C8880c.f23161a     // Catch:{ all -> 0x00ba }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x00ba }
            r0.<init>(r2)     // Catch:{ all -> 0x00ba }
            r9.f23135m = r0     // Catch:{ all -> 0x00ba }
        L_0x0088:
            com.bumptech.glide.p292l.C8880c.m21318a(r1)
            return
        L_0x008c:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00ba }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ba }
            r7.<init>()     // Catch:{ all -> 0x00ba }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00ba }
            r7.append(r2)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r3)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r5)     // Catch:{ all -> 0x00ba }
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            r7.append(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00ba }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00ba }
            r4.<init>(r0)     // Catch:{ all -> 0x00ba }
            throw r4     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            r0 = move-exception
            com.bumptech.glide.p292l.C8880c.m21318a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p292l.C8872a.m21284e():void");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: f */
    public synchronized void m21286f() throws IOException {
        if (this.f23135m != null) {
            m21275a(this.f23135m);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f23129g), C8880c.f23161a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f23131i));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f23133k));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C8876d dVar : this.f23136n.values()) {
                if (dVar.f23151f != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DIRTY ");
                    sb.append(dVar.f23146a);
                    sb.append(10);
                    bufferedWriter.write(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("CLEAN ");
                    sb2.append(dVar.f23146a);
                    sb2.append(dVar.mo24210a());
                    sb2.append(10);
                    bufferedWriter.write(sb2.toString());
                }
            }
            m21275a((Writer) bufferedWriter);
            if (this.f23128f.exists()) {
                m21274a(this.f23128f, this.f23130h, true);
            }
            m21274a(this.f23129g, this.f23128f, false);
            this.f23130h.delete();
            this.f23135m = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f23128f, true), C8880c.f23161a));
        } catch (Throwable th) {
            m21275a((Writer) bufferedWriter);
            throw th;
        }
    }

    /* renamed from: b */
    public synchronized C8877e mo24200b(String str) throws IOException {
        m21277b();
        C8876d dVar = (C8876d) this.f23136n.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f23150e) {
            return null;
        }
        for (File exists : dVar.f23148c) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.f23137o++;
        this.f23135m.append("READ");
        this.f23135m.append(' ');
        this.f23135m.append(str);
        this.f23135m.append(10);
        if (m21280c()) {
            this.f23139q.submit(this.f23140r);
        }
        C8877e eVar = new C8877e(this, str, dVar.f23152g, dVar.f23148c, dVar.f23147b, null);
        return eVar;
    }

    /* renamed from: a */
    public static C8872a m21269a(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m21274a(file2, file3, false);
                }
            }
            C8872a aVar = new C8872a(file, i, i2, j);
            if (aVar.f23128f.exists()) {
                try {
                    aVar.m21284e();
                    aVar.m21282d();
                    return aVar;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    StringBuilder sb = new StringBuilder();
                    sb.append("DiskLruCache ");
                    sb.append(file);
                    sb.append(" is corrupt: ");
                    sb.append(e.getMessage());
                    sb.append(", removing");
                    printStream.println(sb.toString());
                    aVar.mo24199a();
                }
            }
            file.mkdirs();
            C8872a aVar2 = new C8872a(file, i, i2, j);
            aVar2.m21286f();
            return aVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo24201c(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.m21277b()     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.l.a$d> r0 = r7.f23136n     // Catch:{ all -> 0x008f }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x008f }
            com.bumptech.glide.l.a$d r0 = (com.bumptech.glide.p292l.C8872a.C8876d) r0     // Catch:{ all -> 0x008f }
            r1 = 0
            if (r0 == 0) goto L_0x008d
            com.bumptech.glide.l.a$c r2 = r0.f23151f     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x0017
            goto L_0x008d
        L_0x0017:
            int r2 = r7.f23133k     // Catch:{ all -> 0x008f }
            if (r1 >= r2) goto L_0x0059
            java.io.File r2 = r0.mo24209a(r1)     // Catch:{ all -> 0x008f }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0043
            boolean r3 = r2.delete()     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x002c
            goto L_0x0043
        L_0x002c:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r0.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x008f }
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x008f }
            r8.<init>(r0)     // Catch:{ all -> 0x008f }
            throw r8     // Catch:{ all -> 0x008f }
        L_0x0043:
            long r2 = r7.f23134l     // Catch:{ all -> 0x008f }
            long[] r4 = r0.f23147b     // Catch:{ all -> 0x008f }
            r5 = r4[r1]     // Catch:{ all -> 0x008f }
            long r2 = r2 - r5
            r7.f23134l = r2     // Catch:{ all -> 0x008f }
            long[] r2 = r0.f23147b     // Catch:{ all -> 0x008f }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x008f }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x0059:
            int r0 = r7.f23137o     // Catch:{ all -> 0x008f }
            r1 = 1
            int r0 = r0 + r1
            r7.f23137o = r0     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f23135m     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "REMOVE"
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f23135m     // Catch:{ all -> 0x008f }
            r2 = 32
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f23135m     // Catch:{ all -> 0x008f }
            r0.append(r8)     // Catch:{ all -> 0x008f }
            java.io.Writer r0 = r7.f23135m     // Catch:{ all -> 0x008f }
            r2 = 10
            r0.append(r2)     // Catch:{ all -> 0x008f }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.l.a$d> r0 = r7.f23136n     // Catch:{ all -> 0x008f }
            r0.remove(r8)     // Catch:{ all -> 0x008f }
            boolean r8 = r7.m21280c()     // Catch:{ all -> 0x008f }
            if (r8 == 0) goto L_0x008b
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f23139q     // Catch:{ all -> 0x008f }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f23140r     // Catch:{ all -> 0x008f }
            r8.submit(r0)     // Catch:{ all -> 0x008f }
        L_0x008b:
            monitor-exit(r7)
            return r1
        L_0x008d:
            monitor-exit(r7)
            return r1
        L_0x008f:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p292l.C8872a.mo24201c(java.lang.String):boolean");
    }

    /* renamed from: b */
    private void m21277b() {
        if (this.f23135m == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @TargetApi(26)
    /* renamed from: b */
    private static void m21278b(Writer writer) throws IOException {
        if (VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* renamed from: d */
    private void m21282d() throws IOException {
        m21273a(this.f23129g);
        Iterator it = this.f23136n.values().iterator();
        while (it.hasNext()) {
            C8876d dVar = (C8876d) it.next();
            int i = 0;
            if (dVar.f23151f == null) {
                while (i < this.f23133k) {
                    this.f23134l += dVar.f23147b[i];
                    i++;
                }
            } else {
                dVar.f23151f = null;
                while (i < this.f23133k) {
                    m21273a(dVar.mo24209a(i));
                    m21273a(dVar.mo24211b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: a */
    private static void m21273a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    private static void m21274a(File file, File file2, boolean z) throws IOException {
        if (z) {
            m21273a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    public C8875c mo24198a(String str) throws IOException {
        return m21268a(str, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.bumptech.glide.p292l.C8872a.C8875c m21268a(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.m21277b()     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.l.a$d> r0 = r5.f23136n     // Catch:{ all -> 0x005d }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x005d }
            com.bumptech.glide.l.a$d r0 = (com.bumptech.glide.p292l.C8872a.C8876d) r0     // Catch:{ all -> 0x005d }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
            if (r0 == 0) goto L_0x001d
            long r1 = r0.f23152g     // Catch:{ all -> 0x005d }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x001f
        L_0x001d:
            monitor-exit(r5)
            return r3
        L_0x001f:
            if (r0 != 0) goto L_0x002c
            com.bumptech.glide.l.a$d r0 = new com.bumptech.glide.l.a$d     // Catch:{ all -> 0x005d }
            r0.<init>(r5, r6, r3)     // Catch:{ all -> 0x005d }
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.l.a$d> r7 = r5.f23136n     // Catch:{ all -> 0x005d }
            r7.put(r6, r0)     // Catch:{ all -> 0x005d }
            goto L_0x0034
        L_0x002c:
            com.bumptech.glide.l.a$c r7 = r0.f23151f     // Catch:{ all -> 0x005d }
            if (r7 == 0) goto L_0x0034
            monitor-exit(r5)
            return r3
        L_0x0034:
            com.bumptech.glide.l.a$c r7 = new com.bumptech.glide.l.a$c     // Catch:{ all -> 0x005d }
            r7.<init>(r5, r0, r3)     // Catch:{ all -> 0x005d }
            r0.f23151f = r7     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f23135m     // Catch:{ all -> 0x005d }
            java.lang.String r0 = "DIRTY"
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f23135m     // Catch:{ all -> 0x005d }
            r0 = 32
            r8.append(r0)     // Catch:{ all -> 0x005d }
            java.io.Writer r8 = r5.f23135m     // Catch:{ all -> 0x005d }
            r8.append(r6)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f23135m     // Catch:{ all -> 0x005d }
            r8 = 10
            r6.append(r8)     // Catch:{ all -> 0x005d }
            java.io.Writer r6 = r5.f23135m     // Catch:{ all -> 0x005d }
            m21278b(r6)     // Catch:{ all -> 0x005d }
            monitor-exit(r5)
            return r7
        L_0x005d:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p292l.C8872a.m21268a(java.lang.String, long):com.bumptech.glide.l.a$c");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0107, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m21271a(com.bumptech.glide.p292l.C8872a.C8875c r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            com.bumptech.glide.l.a$d r0 = r10.f23142a     // Catch:{ all -> 0x010e }
            com.bumptech.glide.l.a$c r1 = r0.f23151f     // Catch:{ all -> 0x010e }
            if (r1 != r10) goto L_0x0108
            r1 = 0
            if (r11 == 0) goto L_0x004d
            boolean r2 = r0.f23150e     // Catch:{ all -> 0x010e }
            if (r2 != 0) goto L_0x004d
            r2 = 0
        L_0x0015:
            int r3 = r9.f23133k     // Catch:{ all -> 0x010e }
            if (r2 >= r3) goto L_0x004d
            boolean[] r3 = r10.f23143b     // Catch:{ all -> 0x010e }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x010e }
            if (r3 == 0) goto L_0x0033
            java.io.File r3 = r0.mo24211b(r2)     // Catch:{ all -> 0x010e }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x010e }
            if (r3 != 0) goto L_0x0030
            r10.mo24206a()     // Catch:{ all -> 0x010e }
            monitor-exit(r9)
            return
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0033:
            r10.mo24206a()     // Catch:{ all -> 0x010e }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x010e }
            r11.<init>()     // Catch:{ all -> 0x010e }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x010e }
            r11.append(r2)     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x010e }
            r10.<init>(r11)     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x004d:
            int r10 = r9.f23133k     // Catch:{ all -> 0x010e }
            if (r1 >= r10) goto L_0x0081
            java.io.File r10 = r0.mo24211b(r1)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x007b
            boolean r2 = r10.exists()     // Catch:{ all -> 0x010e }
            if (r2 == 0) goto L_0x007e
            java.io.File r2 = r0.mo24209a(r1)     // Catch:{ all -> 0x010e }
            r10.renameTo(r2)     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f23147b     // Catch:{ all -> 0x010e }
            r3 = r10[r1]     // Catch:{ all -> 0x010e }
            long r5 = r2.length()     // Catch:{ all -> 0x010e }
            long[] r10 = r0.f23147b     // Catch:{ all -> 0x010e }
            r10[r1] = r5     // Catch:{ all -> 0x010e }
            long r7 = r9.f23134l     // Catch:{ all -> 0x010e }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f23134l = r7     // Catch:{ all -> 0x010e }
            goto L_0x007e
        L_0x007b:
            m21273a(r10)     // Catch:{ all -> 0x010e }
        L_0x007e:
            int r1 = r1 + 1
            goto L_0x004d
        L_0x0081:
            int r10 = r9.f23137o     // Catch:{ all -> 0x010e }
            r1 = 1
            int r10 = r10 + r1
            r9.f23137o = r10     // Catch:{ all -> 0x010e }
            r10 = 0
            r0.f23151f = r10     // Catch:{ all -> 0x010e }
            boolean r10 = r0.f23150e     // Catch:{ all -> 0x010e }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00c9
            r0.f23150e = r1     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f23135m     // Catch:{ all -> 0x010e }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f23135m     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f23135m     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.f23146a     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f23135m     // Catch:{ all -> 0x010e }
            java.lang.String r1 = r0.mo24210a()     // Catch:{ all -> 0x010e }
            r10.append(r1)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f23135m     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
            if (r11 == 0) goto L_0x00ec
            long r10 = r9.f23138p     // Catch:{ all -> 0x010e }
            r1 = 1
            long r1 = r1 + r10
            r9.f23138p = r1     // Catch:{ all -> 0x010e }
            r0.f23152g = r10     // Catch:{ all -> 0x010e }
            goto L_0x00ec
        L_0x00c9:
            java.util.LinkedHashMap<java.lang.String, com.bumptech.glide.l.a$d> r10 = r9.f23136n     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f23146a     // Catch:{ all -> 0x010e }
            r10.remove(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f23135m     // Catch:{ all -> 0x010e }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f23135m     // Catch:{ all -> 0x010e }
            r10.append(r3)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f23135m     // Catch:{ all -> 0x010e }
            java.lang.String r11 = r0.f23146a     // Catch:{ all -> 0x010e }
            r10.append(r11)     // Catch:{ all -> 0x010e }
            java.io.Writer r10 = r9.f23135m     // Catch:{ all -> 0x010e }
            r10.append(r2)     // Catch:{ all -> 0x010e }
        L_0x00ec:
            java.io.Writer r10 = r9.f23135m     // Catch:{ all -> 0x010e }
            m21278b(r10)     // Catch:{ all -> 0x010e }
            long r10 = r9.f23134l     // Catch:{ all -> 0x010e }
            long r0 = r9.f23132j     // Catch:{ all -> 0x010e }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ff
            boolean r10 = r9.m21280c()     // Catch:{ all -> 0x010e }
            if (r10 == 0) goto L_0x0106
        L_0x00ff:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f23139q     // Catch:{ all -> 0x010e }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f23140r     // Catch:{ all -> 0x010e }
            r10.submit(r11)     // Catch:{ all -> 0x010e }
        L_0x0106:
            monitor-exit(r9)
            return
        L_0x0108:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x010e }
            r10.<init>()     // Catch:{ all -> 0x010e }
            throw r10     // Catch:{ all -> 0x010e }
        L_0x010e:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p292l.C8872a.m21271a(com.bumptech.glide.l.a$c, boolean):void");
    }

    /* renamed from: a */
    public void mo24199a() throws IOException {
        close();
        C8880c.m21319a(this.f23127e);
    }

    @TargetApi(26)
    /* renamed from: a */
    private static void m21275a(Writer writer) throws IOException {
        if (VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }
}
