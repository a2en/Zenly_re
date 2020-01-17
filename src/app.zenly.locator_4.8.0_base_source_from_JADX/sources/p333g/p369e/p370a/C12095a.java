package p333g.p369e.p370a;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: g.e.a.a */
public final class C12095a implements Closeable {

    /* renamed from: s */
    static final Pattern f31492s = Pattern.compile("[a-z0-9_-]{1,64}");
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final OutputStream f31493t = new C12097b();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final File f31494e;

    /* renamed from: f */
    private final File f31495f;

    /* renamed from: g */
    private final File f31496g;

    /* renamed from: h */
    private final File f31497h;

    /* renamed from: i */
    private final int f31498i;

    /* renamed from: j */
    private long f31499j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final int f31500k;

    /* renamed from: l */
    private long f31501l = 0;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Writer f31502m;

    /* renamed from: n */
    private final LinkedHashMap<String, C12100d> f31503n = new LinkedHashMap<>(0, 0.75f, true);
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f31504o;

    /* renamed from: p */
    private long f31505p = 0;

    /* renamed from: q */
    final ThreadPoolExecutor f31506q;

    /* renamed from: r */
    private final Callable<Void> f31507r;

    /* renamed from: g.e.a.a$a */
    class C12096a implements Callable<Void> {
        C12096a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Void call() throws java.lang.Exception {
            /*
                r4 = this;
                g.e.a.a r0 = p333g.p369e.p370a.C12095a.this
                monitor-enter(r0)
                g.e.a.a r1 = p333g.p369e.p370a.C12095a.this     // Catch:{ all -> 0x0028 }
                java.io.Writer r1 = r1.f31502m     // Catch:{ all -> 0x0028 }
                r2 = 0
                if (r1 != 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x000e:
                g.e.a.a r1 = p333g.p369e.p370a.C12095a.this     // Catch:{ all -> 0x0028 }
                r1.m31933i()     // Catch:{ all -> 0x0028 }
                g.e.a.a r1 = p333g.p369e.p370a.C12095a.this     // Catch:{ all -> 0x0028 }
                boolean r1 = r1.m31927e()     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0026
                g.e.a.a r1 = p333g.p369e.p370a.C12095a.this     // Catch:{ all -> 0x0028 }
                r1.m31932h()     // Catch:{ all -> 0x0028 }
                g.e.a.a r1 = p333g.p369e.p370a.C12095a.this     // Catch:{ all -> 0x0028 }
                r3 = 0
                r1.f31504o = r3     // Catch:{ all -> 0x0028 }
            L_0x0026:
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return r2
            L_0x0028:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p333g.p369e.p370a.C12095a.C12096a.call():java.lang.Void");
        }
    }

    /* renamed from: g.e.a.a$b */
    static class C12097b extends OutputStream {
        C12097b() {
        }

        public void write(int i) throws IOException {
        }
    }

    /* renamed from: g.e.a.a$c */
    public final class C12098c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final C12100d f31509a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final boolean[] f31510b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f31511c;

        /* renamed from: g.e.a.a$c$a */
        private class C12099a extends FilterOutputStream {
            /* synthetic */ C12099a(C12098c cVar, OutputStream outputStream, C12096a aVar) {
                this(outputStream);
            }

            public void close() {
                try {
                    this.out.close();
                } catch (IOException unused) {
                    C12098c.this.f31511c = true;
                }
            }

            public void flush() {
                try {
                    this.out.flush();
                } catch (IOException unused) {
                    C12098c.this.f31511c = true;
                }
            }

            public void write(int i) {
                try {
                    this.out.write(i);
                } catch (IOException unused) {
                    C12098c.this.f31511c = true;
                }
            }

            private C12099a(OutputStream outputStream) {
                super(outputStream);
            }

            public void write(byte[] bArr, int i, int i2) {
                try {
                    this.out.write(bArr, i, i2);
                } catch (IOException unused) {
                    C12098c.this.f31511c = true;
                }
            }
        }

        /* synthetic */ C12098c(C12095a aVar, C12100d dVar, C12096a aVar2) {
            this(dVar);
        }

        private C12098c(C12100d dVar) {
            this.f31509a = dVar;
            this.f31510b = dVar.f31516c ? null : new boolean[C12095a.this.f31500k];
        }

        /* renamed from: b */
        public void mo35822b() throws IOException {
            if (this.f31511c) {
                C12095a.this.m31916a(this, false);
                C12095a.this.mo35816c(this.f31509a.f31514a);
                return;
            }
            C12095a.this.m31916a(this, true);
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0024 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.io.OutputStream mo35820a(int r4) throws java.io.IOException {
            /*
                r3 = this;
                g.e.a.a r0 = p333g.p369e.p370a.C12095a.this
                monitor-enter(r0)
                g.e.a.a$d r1 = r3.f31509a     // Catch:{ all -> 0x0046 }
                g.e.a.a$c r1 = r1.f31517d     // Catch:{ all -> 0x0046 }
                if (r1 != r3) goto L_0x0040
                g.e.a.a$d r1 = r3.f31509a     // Catch:{ all -> 0x0046 }
                boolean r1 = r1.f31516c     // Catch:{ all -> 0x0046 }
                if (r1 != 0) goto L_0x0018
                boolean[] r1 = r3.f31510b     // Catch:{ all -> 0x0046 }
                r2 = 1
                r1[r4] = r2     // Catch:{ all -> 0x0046 }
            L_0x0018:
                g.e.a.a$d r1 = r3.f31509a     // Catch:{ all -> 0x0046 }
                java.io.File r4 = r1.mo35829b(r4)     // Catch:{ all -> 0x0046 }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0024 }
                r1.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0024 }
                goto L_0x0032
            L_0x0024:
                g.e.a.a r1 = p333g.p369e.p370a.C12095a.this     // Catch:{ all -> 0x0046 }
                java.io.File r1 = r1.f31494e     // Catch:{ all -> 0x0046 }
                r1.mkdirs()     // Catch:{ all -> 0x0046 }
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x003a }
                r1.<init>(r4)     // Catch:{ FileNotFoundException -> 0x003a }
            L_0x0032:
                g.e.a.a$c$a r4 = new g.e.a.a$c$a     // Catch:{ all -> 0x0046 }
                r2 = 0
                r4.<init>(r3, r1, r2)     // Catch:{ all -> 0x0046 }
                monitor-exit(r0)     // Catch:{ all -> 0x0046 }
                return r4
            L_0x003a:
                java.io.OutputStream r4 = p333g.p369e.p370a.C12095a.f31493t     // Catch:{ all -> 0x0046 }
                monitor-exit(r0)     // Catch:{ all -> 0x0046 }
                return r4
            L_0x0040:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0046 }
                r4.<init>()     // Catch:{ all -> 0x0046 }
                throw r4     // Catch:{ all -> 0x0046 }
            L_0x0046:
                r4 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0046 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p333g.p369e.p370a.C12095a.C12098c.mo35820a(int):java.io.OutputStream");
        }

        /* renamed from: a */
        public void mo35821a() throws IOException {
            C12095a.this.m31916a(this, false);
        }
    }

    /* renamed from: g.e.a.a$d */
    private final class C12100d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String f31514a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long[] f31515b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f31516c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C12098c f31517d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public long f31518e;

        /* synthetic */ C12100d(C12095a aVar, String str, C12096a aVar2) {
            this(str);
        }

        private C12100d(String str) {
            this.f31514a = str;
            this.f31515b = new long[C12095a.this.f31500k];
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m31952b(String[] strArr) throws IOException {
            if (strArr.length == C12095a.this.f31500k) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f31515b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        m31947a(strArr);
                        throw null;
                    }
                }
                return;
            }
            m31947a(strArr);
            throw null;
        }

        /* renamed from: a */
        public String mo35828a() throws IOException {
            long[] jArr;
            StringBuilder sb = new StringBuilder();
            for (long j : this.f31515b) {
                sb.append(' ');
                sb.append(j);
            }
            return sb.toString();
        }

        /* renamed from: b */
        public File mo35829b(int i) {
            File d = C12095a.this.f31494e;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f31514a);
            sb.append(".");
            sb.append(i);
            sb.append(".tmp");
            return new File(d, sb.toString());
        }

        /* renamed from: a */
        private IOException m31947a(String[] strArr) throws IOException {
            StringBuilder sb = new StringBuilder();
            sb.append("unexpected journal line: ");
            sb.append(Arrays.toString(strArr));
            throw new IOException(sb.toString());
        }

        /* renamed from: a */
        public File mo35827a(int i) {
            File d = C12095a.this.f31494e;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f31514a);
            sb.append(".");
            sb.append(i);
            return new File(d, sb.toString());
        }
    }

    /* renamed from: g.e.a.a$e */
    public final class C12101e implements Closeable {

        /* renamed from: e */
        private final InputStream[] f31520e;

        /* renamed from: f */
        private final long[] f31521f;

        /* synthetic */ C12101e(C12095a aVar, String str, long j, InputStream[] inputStreamArr, long[] jArr, C12096a aVar2) {
            this(aVar, str, j, inputStreamArr, jArr);
        }

        /* renamed from: a */
        public InputStream mo35830a(int i) {
            return this.f31520e[i];
        }

        /* renamed from: b */
        public long mo35831b(int i) {
            return this.f31521f[i];
        }

        public void close() {
            for (InputStream a : this.f31520e) {
                C12104c.m31964a((Closeable) a);
            }
        }

        private C12101e(C12095a aVar, String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.f31520e = inputStreamArr;
            this.f31521f = jArr;
        }
    }

    private C12095a(File file, int i, int i2, long j) {
        File file2 = file;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
        this.f31506q = threadPoolExecutor;
        this.f31507r = new C12096a();
        this.f31494e = file2;
        this.f31498i = i;
        this.f31495f = new File(file2, "journal");
        this.f31496g = new File(file2, "journal.tmp");
        this.f31497h = new File(file2, "journal.bkp");
        this.f31500k = i2;
        this.f31499j = j;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f31504o = r0 - r9.f31503n.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x006c=Splitter:B:20:0x006c, B:16:0x005f=Splitter:B:16:0x005f} */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m31931g() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            g.e.a.b r1 = new g.e.a.b
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f31495f
            r2.<init>(r3)
            java.nio.charset.Charset r3 = p333g.p369e.p370a.C12104c.f31528a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.mo35833a()     // Catch:{ all -> 0x009a }
            java.lang.String r3 = r1.mo35833a()     // Catch:{ all -> 0x009a }
            java.lang.String r4 = r1.mo35833a()     // Catch:{ all -> 0x009a }
            java.lang.String r5 = r1.mo35833a()     // Catch:{ all -> 0x009a }
            java.lang.String r6 = r1.mo35833a()     // Catch:{ all -> 0x009a }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x009a }
            if (r7 == 0) goto L_0x006c
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x009a }
            if (r7 == 0) goto L_0x006c
            int r7 = r9.f31498i     // Catch:{ all -> 0x009a }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x009a }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x009a }
            if (r4 == 0) goto L_0x006c
            int r4 = r9.f31500k     // Catch:{ all -> 0x009a }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x009a }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x009a }
            if (r4 == 0) goto L_0x006c
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x009a }
            if (r4 == 0) goto L_0x006c
            r0 = 0
        L_0x0055:
            java.lang.String r2 = r1.mo35833a()     // Catch:{ EOFException -> 0x005f }
            r9.m31925d(r2)     // Catch:{ EOFException -> 0x005f }
            int r0 = r0 + 1
            goto L_0x0055
        L_0x005f:
            java.util.LinkedHashMap<java.lang.String, g.e.a.a$d> r2 = r9.f31503n     // Catch:{ all -> 0x009a }
            int r2 = r2.size()     // Catch:{ all -> 0x009a }
            int r0 = r0 - r2
            r9.f31504o = r0     // Catch:{ all -> 0x009a }
            p333g.p369e.p370a.C12104c.m31964a(r1)
            return
        L_0x006c:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x009a }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x009a }
            r7.<init>()     // Catch:{ all -> 0x009a }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x009a }
            r7.append(r2)     // Catch:{ all -> 0x009a }
            r7.append(r0)     // Catch:{ all -> 0x009a }
            r7.append(r3)     // Catch:{ all -> 0x009a }
            r7.append(r0)     // Catch:{ all -> 0x009a }
            r7.append(r5)     // Catch:{ all -> 0x009a }
            r7.append(r0)     // Catch:{ all -> 0x009a }
            r7.append(r6)     // Catch:{ all -> 0x009a }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x009a }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x009a }
            r4.<init>(r0)     // Catch:{ all -> 0x009a }
            throw r4     // Catch:{ all -> 0x009a }
        L_0x009a:
            r0 = move-exception
            p333g.p369e.p370a.C12104c.m31964a(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p333g.p369e.p370a.C12095a.m31931g():void");
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: h */
    public synchronized void m31932h() throws IOException {
        if (this.f31502m != null) {
            this.f31502m.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f31496g), C12104c.f31528a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f31498i));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f31500k));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (C12100d dVar : this.f31503n.values()) {
                if (dVar.f31517d != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DIRTY ");
                    sb.append(dVar.f31514a);
                    sb.append(10);
                    bufferedWriter.write(sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("CLEAN ");
                    sb2.append(dVar.f31514a);
                    sb2.append(dVar.mo35828a());
                    sb2.append(10);
                    bufferedWriter.write(sb2.toString());
                }
            }
            bufferedWriter.close();
            if (this.f31495f.exists()) {
                m31919a(this.f31495f, this.f31497h, true);
            }
            m31919a(this.f31496g, this.f31495f, false);
            this.f31497h.delete();
            this.f31502m = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f31495f, true), C12104c.f31528a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m31933i() throws IOException {
        while (this.f31501l > this.f31499j) {
            mo35816c((String) ((Entry) this.f31503n.entrySet().iterator().next()).getKey());
        }
    }

    public synchronized void close() throws IOException {
        if (this.f31502m != null) {
            Iterator it = new ArrayList(this.f31503n.values()).iterator();
            while (it.hasNext()) {
                C12100d dVar = (C12100d) it.next();
                if (dVar.f31517d != null) {
                    dVar.f31517d.mo35821a();
                }
            }
            m31933i();
            this.f31502m.close();
            this.f31502m = null;
        }
    }

    /* renamed from: d */
    private void m31925d(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        String str3 = "unexpected journal line: ";
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f31503n.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C12100d dVar = (C12100d) this.f31503n.get(str2);
            if (dVar == null) {
                dVar = new C12100d(this, str2, null);
                this.f31503n.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f31516c = true;
                dVar.f31517d = null;
                dVar.m31952b(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f31517d = new C12098c(this, dVar, null);
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

    /* access modifiers changed from: private */
    /* renamed from: e */
    public boolean m31927e() {
        int i = this.f31504o;
        return i >= 2000 && i >= this.f31503n.size();
    }

    /* renamed from: f */
    private void m31929f() throws IOException {
        m31918a(this.f31496g);
        Iterator it = this.f31503n.values().iterator();
        while (it.hasNext()) {
            C12100d dVar = (C12100d) it.next();
            int i = 0;
            if (dVar.f31517d == null) {
                while (i < this.f31500k) {
                    this.f31501l += dVar.f31515b[i];
                    i++;
                }
            } else {
                dVar.f31517d = null;
                while (i < this.f31500k) {
                    m31918a(dVar.mo35827a(i));
                    m31918a(dVar.mo35829b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:32|33|28|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r11.f31504o++;
        r1 = r11.f31502m;
        r2 = new java.lang.StringBuilder();
        r2.append("READ ");
        r2.append(r12);
        r2.append(10);
        r1.append(r2.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0059, code lost:
        if (m31927e() == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005b, code lost:
        r11.f31506q.submit(r11.f31507r);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0062, code lost:
        r3 = new p333g.p369e.p370a.C12095a.C12101e(r11, r12, p333g.p369e.p370a.C12095a.C12100d.m31953c(r0), r8, p333g.p369e.p370a.C12095a.C12100d.m31950a(r0), null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0074, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0086, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0075 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p333g.p369e.p370a.C12095a.C12101e mo35814b(java.lang.String r12) throws java.io.IOException {
        /*
            r11 = this;
            monitor-enter(r11)
            r11.m31924d()     // Catch:{ all -> 0x0087 }
            r11.m31926e(r12)     // Catch:{ all -> 0x0087 }
            java.util.LinkedHashMap<java.lang.String, g.e.a.a$d> r0 = r11.f31503n     // Catch:{ all -> 0x0087 }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ all -> 0x0087 }
            g.e.a.a$d r0 = (p333g.p369e.p370a.C12095a.C12100d) r0     // Catch:{ all -> 0x0087 }
            r1 = 0
            if (r0 != 0) goto L_0x0014
            monitor-exit(r11)
            return r1
        L_0x0014:
            boolean r2 = r0.f31516c     // Catch:{ all -> 0x0087 }
            if (r2 != 0) goto L_0x001c
            monitor-exit(r11)
            return r1
        L_0x001c:
            int r2 = r11.f31500k     // Catch:{ all -> 0x0087 }
            java.io.InputStream[] r8 = new java.io.InputStream[r2]     // Catch:{ all -> 0x0087 }
            r2 = 0
            r3 = 0
        L_0x0022:
            int r4 = r11.f31500k     // Catch:{ FileNotFoundException -> 0x0075 }
            if (r3 >= r4) goto L_0x0034
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0075 }
            java.io.File r5 = r0.mo35827a(r3)     // Catch:{ FileNotFoundException -> 0x0075 }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x0075 }
            r8[r3] = r4     // Catch:{ FileNotFoundException -> 0x0075 }
            int r3 = r3 + 1
            goto L_0x0022
        L_0x0034:
            int r1 = r11.f31504o     // Catch:{ all -> 0x0087 }
            int r1 = r1 + 1
            r11.f31504o = r1     // Catch:{ all -> 0x0087 }
            java.io.Writer r1 = r11.f31502m     // Catch:{ all -> 0x0087 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0087 }
            r2.<init>()     // Catch:{ all -> 0x0087 }
            java.lang.String r3 = "READ "
            r2.append(r3)     // Catch:{ all -> 0x0087 }
            r2.append(r12)     // Catch:{ all -> 0x0087 }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x0087 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0087 }
            r1.append(r2)     // Catch:{ all -> 0x0087 }
            boolean r1 = r11.m31927e()     // Catch:{ all -> 0x0087 }
            if (r1 == 0) goto L_0x0062
            java.util.concurrent.ThreadPoolExecutor r1 = r11.f31506q     // Catch:{ all -> 0x0087 }
            java.util.concurrent.Callable<java.lang.Void> r2 = r11.f31507r     // Catch:{ all -> 0x0087 }
            r1.submit(r2)     // Catch:{ all -> 0x0087 }
        L_0x0062:
            g.e.a.a$e r1 = new g.e.a.a$e     // Catch:{ all -> 0x0087 }
            long r6 = r0.f31518e     // Catch:{ all -> 0x0087 }
            long[] r9 = r0.f31515b     // Catch:{ all -> 0x0087 }
            r10 = 0
            r3 = r1
            r4 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r8, r9, r10)     // Catch:{ all -> 0x0087 }
            monitor-exit(r11)
            return r1
        L_0x0075:
            int r12 = r11.f31500k     // Catch:{ all -> 0x0087 }
            if (r2 >= r12) goto L_0x0085
            r12 = r8[r2]     // Catch:{ all -> 0x0087 }
            if (r12 == 0) goto L_0x0085
            r12 = r8[r2]     // Catch:{ all -> 0x0087 }
            p333g.p369e.p370a.C12104c.m31964a(r12)     // Catch:{ all -> 0x0087 }
            int r2 = r2 + 1
            goto L_0x0075
        L_0x0085:
            monitor-exit(r11)
            return r1
        L_0x0087:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p333g.p369e.p370a.C12095a.mo35814b(java.lang.String):g.e.a.a$e");
    }

    /* renamed from: e */
    private void m31926e(String str) {
        if (!f31492s.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder();
            sb.append("keys must match regex [a-z0-9_-]{1,64}: \"");
            sb.append(str);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0090, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0092, code lost:
        return false;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo35816c(java.lang.String r8) throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            r7.m31924d()     // Catch:{ all -> 0x0093 }
            r7.m31926e(r8)     // Catch:{ all -> 0x0093 }
            java.util.LinkedHashMap<java.lang.String, g.e.a.a$d> r0 = r7.f31503n     // Catch:{ all -> 0x0093 }
            java.lang.Object r0 = r0.get(r8)     // Catch:{ all -> 0x0093 }
            g.e.a.a$d r0 = (p333g.p369e.p370a.C12095a.C12100d) r0     // Catch:{ all -> 0x0093 }
            r1 = 0
            if (r0 == 0) goto L_0x0091
            g.e.a.a$c r2 = r0.f31517d     // Catch:{ all -> 0x0093 }
            if (r2 == 0) goto L_0x001a
            goto L_0x0091
        L_0x001a:
            int r2 = r7.f31500k     // Catch:{ all -> 0x0093 }
            if (r1 >= r2) goto L_0x005c
            java.io.File r2 = r0.mo35827a(r1)     // Catch:{ all -> 0x0093 }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x0093 }
            if (r3 == 0) goto L_0x0046
            boolean r3 = r2.delete()     // Catch:{ all -> 0x0093 }
            if (r3 == 0) goto L_0x002f
            goto L_0x0046
        L_0x002f:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x0093 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0093 }
            r0.<init>()     // Catch:{ all -> 0x0093 }
            java.lang.String r1 = "failed to delete "
            r0.append(r1)     // Catch:{ all -> 0x0093 }
            r0.append(r2)     // Catch:{ all -> 0x0093 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0093 }
            r8.<init>(r0)     // Catch:{ all -> 0x0093 }
            throw r8     // Catch:{ all -> 0x0093 }
        L_0x0046:
            long r2 = r7.f31501l     // Catch:{ all -> 0x0093 }
            long[] r4 = r0.f31515b     // Catch:{ all -> 0x0093 }
            r5 = r4[r1]     // Catch:{ all -> 0x0093 }
            long r2 = r2 - r5
            r7.f31501l = r2     // Catch:{ all -> 0x0093 }
            long[] r2 = r0.f31515b     // Catch:{ all -> 0x0093 }
            r3 = 0
            r2[r1] = r3     // Catch:{ all -> 0x0093 }
            int r1 = r1 + 1
            goto L_0x001a
        L_0x005c:
            int r0 = r7.f31504o     // Catch:{ all -> 0x0093 }
            r1 = 1
            int r0 = r0 + r1
            r7.f31504o = r0     // Catch:{ all -> 0x0093 }
            java.io.Writer r0 = r7.f31502m     // Catch:{ all -> 0x0093 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0093 }
            r2.<init>()     // Catch:{ all -> 0x0093 }
            java.lang.String r3 = "REMOVE "
            r2.append(r3)     // Catch:{ all -> 0x0093 }
            r2.append(r8)     // Catch:{ all -> 0x0093 }
            r3 = 10
            r2.append(r3)     // Catch:{ all -> 0x0093 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0093 }
            r0.append(r2)     // Catch:{ all -> 0x0093 }
            java.util.LinkedHashMap<java.lang.String, g.e.a.a$d> r0 = r7.f31503n     // Catch:{ all -> 0x0093 }
            r0.remove(r8)     // Catch:{ all -> 0x0093 }
            boolean r8 = r7.m31927e()     // Catch:{ all -> 0x0093 }
            if (r8 == 0) goto L_0x008f
            java.util.concurrent.ThreadPoolExecutor r8 = r7.f31506q     // Catch:{ all -> 0x0093 }
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.f31507r     // Catch:{ all -> 0x0093 }
            r8.submit(r0)     // Catch:{ all -> 0x0093 }
        L_0x008f:
            monitor-exit(r7)
            return r1
        L_0x0091:
            monitor-exit(r7)
            return r1
        L_0x0093:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p333g.p369e.p370a.C12095a.mo35816c(java.lang.String):boolean");
    }

    /* renamed from: a */
    public static C12095a m31914a(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m31919a(file2, file3, false);
                }
            }
            C12095a aVar = new C12095a(file, i, i2, j);
            if (aVar.f31495f.exists()) {
                try {
                    aVar.m31931g();
                    aVar.m31929f();
                    aVar.f31502m = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(aVar.f31495f, true), C12104c.f31528a));
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
                    aVar.mo35813a();
                }
            }
            file.mkdirs();
            C12095a aVar2 = new C12095a(file, i, i2, j);
            aVar2.m31932h();
            return aVar2;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* renamed from: b */
    public File mo35815b() {
        return this.f31494e;
    }

    /* renamed from: d */
    private void m31924d() {
        if (this.f31502m == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: a */
    private static void m31918a(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    private static void m31919a(File file, File file2, boolean z) throws IOException {
        if (z) {
            m31918a(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: a */
    public C12098c mo35812a(String str) throws IOException {
        return m31913a(str, -1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized p333g.p369e.p370a.C12095a.C12098c m31913a(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.m31924d()     // Catch:{ all -> 0x0061 }
            r5.m31926e(r6)     // Catch:{ all -> 0x0061 }
            java.util.LinkedHashMap<java.lang.String, g.e.a.a$d> r0 = r5.f31503n     // Catch:{ all -> 0x0061 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0061 }
            g.e.a.a$d r0 = (p333g.p369e.p370a.C12095a.C12100d) r0     // Catch:{ all -> 0x0061 }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0022
            if (r0 == 0) goto L_0x0020
            long r1 = r0.f31518e     // Catch:{ all -> 0x0061 }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0022
        L_0x0020:
            monitor-exit(r5)
            return r3
        L_0x0022:
            if (r0 != 0) goto L_0x002f
            g.e.a.a$d r0 = new g.e.a.a$d     // Catch:{ all -> 0x0061 }
            r0.<init>(r5, r6, r3)     // Catch:{ all -> 0x0061 }
            java.util.LinkedHashMap<java.lang.String, g.e.a.a$d> r7 = r5.f31503n     // Catch:{ all -> 0x0061 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0061 }
            goto L_0x0037
        L_0x002f:
            g.e.a.a$c r7 = r0.f31517d     // Catch:{ all -> 0x0061 }
            if (r7 == 0) goto L_0x0037
            monitor-exit(r5)
            return r3
        L_0x0037:
            g.e.a.a$c r7 = new g.e.a.a$c     // Catch:{ all -> 0x0061 }
            r7.<init>(r5, r0, r3)     // Catch:{ all -> 0x0061 }
            r0.f31517d = r7     // Catch:{ all -> 0x0061 }
            java.io.Writer r8 = r5.f31502m     // Catch:{ all -> 0x0061 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            r0.<init>()     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = "DIRTY "
            r0.append(r1)     // Catch:{ all -> 0x0061 }
            r0.append(r6)     // Catch:{ all -> 0x0061 }
            r6 = 10
            r0.append(r6)     // Catch:{ all -> 0x0061 }
            java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x0061 }
            r8.write(r6)     // Catch:{ all -> 0x0061 }
            java.io.Writer r6 = r5.f31502m     // Catch:{ all -> 0x0061 }
            r6.flush()     // Catch:{ all -> 0x0061 }
            monitor-exit(r5)
            return r7
        L_0x0061:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p333g.p369e.p370a.C12095a.m31913a(java.lang.String, long):g.e.a.a$c");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0109, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void m31916a(p333g.p369e.p370a.C12095a.C12098c r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            g.e.a.a$d r0 = r10.f31509a     // Catch:{ all -> 0x0110 }
            g.e.a.a$c r1 = r0.f31517d     // Catch:{ all -> 0x0110 }
            if (r1 != r10) goto L_0x010a
            r1 = 0
            if (r11 == 0) goto L_0x004d
            boolean r2 = r0.f31516c     // Catch:{ all -> 0x0110 }
            if (r2 != 0) goto L_0x004d
            r2 = 0
        L_0x0015:
            int r3 = r9.f31500k     // Catch:{ all -> 0x0110 }
            if (r2 >= r3) goto L_0x004d
            boolean[] r3 = r10.f31510b     // Catch:{ all -> 0x0110 }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x0110 }
            if (r3 == 0) goto L_0x0033
            java.io.File r3 = r0.mo35829b(r2)     // Catch:{ all -> 0x0110 }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x0110 }
            if (r3 != 0) goto L_0x0030
            r10.mo35821a()     // Catch:{ all -> 0x0110 }
            monitor-exit(r9)
            return
        L_0x0030:
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0033:
            r10.mo35821a()     // Catch:{ all -> 0x0110 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0110 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0110 }
            r11.<init>()     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x0110 }
            r11.append(r2)     // Catch:{ all -> 0x0110 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0110 }
            r10.<init>(r11)     // Catch:{ all -> 0x0110 }
            throw r10     // Catch:{ all -> 0x0110 }
        L_0x004d:
            int r10 = r9.f31500k     // Catch:{ all -> 0x0110 }
            if (r1 >= r10) goto L_0x0081
            java.io.File r10 = r0.mo35829b(r1)     // Catch:{ all -> 0x0110 }
            if (r11 == 0) goto L_0x007b
            boolean r2 = r10.exists()     // Catch:{ all -> 0x0110 }
            if (r2 == 0) goto L_0x007e
            java.io.File r2 = r0.mo35827a(r1)     // Catch:{ all -> 0x0110 }
            r10.renameTo(r2)     // Catch:{ all -> 0x0110 }
            long[] r10 = r0.f31515b     // Catch:{ all -> 0x0110 }
            r3 = r10[r1]     // Catch:{ all -> 0x0110 }
            long r5 = r2.length()     // Catch:{ all -> 0x0110 }
            long[] r10 = r0.f31515b     // Catch:{ all -> 0x0110 }
            r10[r1] = r5     // Catch:{ all -> 0x0110 }
            long r7 = r9.f31501l     // Catch:{ all -> 0x0110 }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f31501l = r7     // Catch:{ all -> 0x0110 }
            goto L_0x007e
        L_0x007b:
            m31918a(r10)     // Catch:{ all -> 0x0110 }
        L_0x007e:
            int r1 = r1 + 1
            goto L_0x004d
        L_0x0081:
            int r10 = r9.f31504o     // Catch:{ all -> 0x0110 }
            r1 = 1
            int r10 = r10 + r1
            r9.f31504o = r10     // Catch:{ all -> 0x0110 }
            r10 = 0
            r0.f31517d = r10     // Catch:{ all -> 0x0110 }
            boolean r10 = r0.f31516c     // Catch:{ all -> 0x0110 }
            r10 = r10 | r11
            r2 = 10
            if (r10 == 0) goto L_0x00c8
            r0.f31516c = r1     // Catch:{ all -> 0x0110 }
            java.io.Writer r10 = r9.f31502m     // Catch:{ all -> 0x0110 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0110 }
            r1.<init>()     // Catch:{ all -> 0x0110 }
            java.lang.String r3 = "CLEAN "
            r1.append(r3)     // Catch:{ all -> 0x0110 }
            java.lang.String r3 = r0.f31514a     // Catch:{ all -> 0x0110 }
            r1.append(r3)     // Catch:{ all -> 0x0110 }
            java.lang.String r3 = r0.mo35828a()     // Catch:{ all -> 0x0110 }
            r1.append(r3)     // Catch:{ all -> 0x0110 }
            r1.append(r2)     // Catch:{ all -> 0x0110 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0110 }
            r10.write(r1)     // Catch:{ all -> 0x0110 }
            if (r11 == 0) goto L_0x00ee
            long r10 = r9.f31505p     // Catch:{ all -> 0x0110 }
            r1 = 1
            long r1 = r1 + r10
            r9.f31505p = r1     // Catch:{ all -> 0x0110 }
            r0.f31518e = r10     // Catch:{ all -> 0x0110 }
            goto L_0x00ee
        L_0x00c8:
            java.util.LinkedHashMap<java.lang.String, g.e.a.a$d> r10 = r9.f31503n     // Catch:{ all -> 0x0110 }
            java.lang.String r11 = r0.f31514a     // Catch:{ all -> 0x0110 }
            r10.remove(r11)     // Catch:{ all -> 0x0110 }
            java.io.Writer r10 = r9.f31502m     // Catch:{ all -> 0x0110 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0110 }
            r11.<init>()     // Catch:{ all -> 0x0110 }
            java.lang.String r1 = "REMOVE "
            r11.append(r1)     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = r0.f31514a     // Catch:{ all -> 0x0110 }
            r11.append(r0)     // Catch:{ all -> 0x0110 }
            r11.append(r2)     // Catch:{ all -> 0x0110 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x0110 }
            r10.write(r11)     // Catch:{ all -> 0x0110 }
        L_0x00ee:
            java.io.Writer r10 = r9.f31502m     // Catch:{ all -> 0x0110 }
            r10.flush()     // Catch:{ all -> 0x0110 }
            long r10 = r9.f31501l     // Catch:{ all -> 0x0110 }
            long r0 = r9.f31499j     // Catch:{ all -> 0x0110 }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x0101
            boolean r10 = r9.m31927e()     // Catch:{ all -> 0x0110 }
            if (r10 == 0) goto L_0x0108
        L_0x0101:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.f31506q     // Catch:{ all -> 0x0110 }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.f31507r     // Catch:{ all -> 0x0110 }
            r10.submit(r11)     // Catch:{ all -> 0x0110 }
        L_0x0108:
            monitor-exit(r9)
            return
        L_0x010a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0110 }
            r10.<init>()     // Catch:{ all -> 0x0110 }
            throw r10     // Catch:{ all -> 0x0110 }
        L_0x0110:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p333g.p369e.p370a.C12095a.m31916a(g.e.a.a$c, boolean):void");
    }

    /* renamed from: a */
    public void mo35813a() throws IOException {
        close();
        C12104c.m31965a(this.f31494e);
    }
}
