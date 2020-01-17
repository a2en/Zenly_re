package okhttp3.internal.cache;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okhttp3.internal.p422io.FileSystem;
import okhttp3.p418f0.C13184e;
import okhttp3.p418f0.p420h.C13202e;
import okio.BufferedSink;
import okio.C13354l;
import okio.Sink;
import okio.Source;

/* renamed from: okhttp3.internal.cache.c */
public final class C13220c implements Closeable, Flushable {

    /* renamed from: y */
    static final Pattern f33996y = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: e */
    final FileSystem f33997e;

    /* renamed from: f */
    final File f33998f;

    /* renamed from: g */
    private final File f33999g;

    /* renamed from: h */
    private final File f34000h;

    /* renamed from: i */
    private final File f34001i;

    /* renamed from: j */
    private final int f34002j;

    /* renamed from: k */
    private long f34003k;

    /* renamed from: l */
    final int f34004l;

    /* renamed from: m */
    private long f34005m = 0;

    /* renamed from: n */
    BufferedSink f34006n;

    /* renamed from: o */
    final LinkedHashMap<String, C13225d> f34007o = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: p */
    int f34008p;

    /* renamed from: q */
    boolean f34009q;

    /* renamed from: r */
    boolean f34010r;

    /* renamed from: s */
    boolean f34011s;

    /* renamed from: t */
    boolean f34012t;

    /* renamed from: u */
    boolean f34013u;

    /* renamed from: v */
    private long f34014v = 0;

    /* renamed from: w */
    private final Executor f34015w;

    /* renamed from: x */
    private final Runnable f34016x = new C13221a();

    /* renamed from: okhttp3.internal.cache.c$a */
    class C13221a implements Runnable {
        C13221a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r5.f34017e.f34013u = true;
            r5.f34017e.f34006n = okio.C13354l.m35374a(okio.C13354l.m35376a());
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0033 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                okhttp3.internal.cache.c r0 = okhttp3.internal.cache.C13220c.this
                monitor-enter(r0)
                okhttp3.internal.cache.c r1 = okhttp3.internal.cache.C13220c.this     // Catch:{ all -> 0x0045 }
                boolean r1 = r1.f34010r     // Catch:{ all -> 0x0045 }
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x000d
                r1 = 1
                goto L_0x000e
            L_0x000d:
                r1 = 0
            L_0x000e:
                okhttp3.internal.cache.c r4 = okhttp3.internal.cache.C13220c.this     // Catch:{ all -> 0x0045 }
                boolean r4 = r4.f34011s     // Catch:{ all -> 0x0045 }
                r1 = r1 | r4
                if (r1 == 0) goto L_0x0017
                monitor-exit(r0)     // Catch:{ all -> 0x0045 }
                return
            L_0x0017:
                okhttp3.internal.cache.c r1 = okhttp3.internal.cache.C13220c.this     // Catch:{ IOException -> 0x001d }
                r1.mo37981f()     // Catch:{ IOException -> 0x001d }
                goto L_0x0021
            L_0x001d:
                okhttp3.internal.cache.c r1 = okhttp3.internal.cache.C13220c.this     // Catch:{ all -> 0x0045 }
                r1.f34012t = r3     // Catch:{ all -> 0x0045 }
            L_0x0021:
                okhttp3.internal.cache.c r1 = okhttp3.internal.cache.C13220c.this     // Catch:{ IOException -> 0x0033 }
                boolean r1 = r1.mo37979d()     // Catch:{ IOException -> 0x0033 }
                if (r1 == 0) goto L_0x0043
                okhttp3.internal.cache.c r1 = okhttp3.internal.cache.C13220c.this     // Catch:{ IOException -> 0x0033 }
                r1.mo37980e()     // Catch:{ IOException -> 0x0033 }
                okhttp3.internal.cache.c r1 = okhttp3.internal.cache.C13220c.this     // Catch:{ IOException -> 0x0033 }
                r1.f34008p = r2     // Catch:{ IOException -> 0x0033 }
                goto L_0x0043
            L_0x0033:
                okhttp3.internal.cache.c r1 = okhttp3.internal.cache.C13220c.this     // Catch:{ all -> 0x0045 }
                r1.f34013u = r3     // Catch:{ all -> 0x0045 }
                okhttp3.internal.cache.c r1 = okhttp3.internal.cache.C13220c.this     // Catch:{ all -> 0x0045 }
                okio.Sink r2 = okio.C13354l.m35376a()     // Catch:{ all -> 0x0045 }
                okio.BufferedSink r2 = okio.C13354l.m35374a(r2)     // Catch:{ all -> 0x0045 }
                r1.f34006n = r2     // Catch:{ all -> 0x0045 }
            L_0x0043:
                monitor-exit(r0)     // Catch:{ all -> 0x0045 }
                return
            L_0x0045:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0045 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.C13220c.C13221a.run():void");
        }
    }

    /* renamed from: okhttp3.internal.cache.c$b */
    class C13222b extends C13227d {
        static {
            Class<C13220c> cls = C13220c.class;
        }

        C13222b(Sink sink) {
            super(sink);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo37985a(IOException iOException) {
            C13220c.this.f34009q = true;
        }
    }

    /* renamed from: okhttp3.internal.cache.c$c */
    public final class C13223c {

        /* renamed from: a */
        final C13225d f34019a;

        /* renamed from: b */
        final boolean[] f34020b;

        /* renamed from: c */
        private boolean f34021c;

        /* renamed from: okhttp3.internal.cache.c$c$a */
        class C13224a extends C13227d {
            C13224a(Sink sink) {
                super(sink);
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public void mo37985a(IOException iOException) {
                synchronized (C13220c.this) {
                    C13223c.this.mo37989c();
                }
            }
        }

        C13223c(C13225d dVar) {
            this.f34019a = dVar;
            this.f34020b = dVar.f34028e ? null : new boolean[C13220c.this.f34004l];
        }

        /* renamed from: a */
        public Sink mo37986a(int i) {
            synchronized (C13220c.this) {
                if (this.f34021c) {
                    throw new IllegalStateException();
                } else if (this.f34019a.f34029f != this) {
                    Sink a = C13354l.m35376a();
                    return a;
                } else {
                    if (!this.f34019a.f34028e) {
                        this.f34020b[i] = true;
                    }
                    try {
                        C13224a aVar = new C13224a(C13220c.this.f33997e.sink(this.f34019a.f34027d[i]));
                        return aVar;
                    } catch (FileNotFoundException unused) {
                        return C13354l.m35376a();
                    }
                }
            }
        }

        /* renamed from: b */
        public void mo37988b() throws IOException {
            synchronized (C13220c.this) {
                if (!this.f34021c) {
                    if (this.f34019a.f34029f == this) {
                        C13220c.this.mo37972a(this, true);
                    }
                    this.f34021c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo37989c() {
            if (this.f34019a.f34029f == this) {
                int i = 0;
                while (true) {
                    C13220c cVar = C13220c.this;
                    if (i < cVar.f34004l) {
                        try {
                            cVar.f33997e.delete(this.f34019a.f34027d[i]);
                        } catch (IOException unused) {
                        }
                        i++;
                    } else {
                        this.f34019a.f34029f = null;
                        return;
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo37987a() throws IOException {
            synchronized (C13220c.this) {
                if (!this.f34021c) {
                    if (this.f34019a.f34029f == this) {
                        C13220c.this.mo37972a(this, false);
                    }
                    this.f34021c = true;
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }

    /* renamed from: okhttp3.internal.cache.c$d */
    private final class C13225d {

        /* renamed from: a */
        final String f34024a;

        /* renamed from: b */
        final long[] f34025b;

        /* renamed from: c */
        final File[] f34026c;

        /* renamed from: d */
        final File[] f34027d;

        /* renamed from: e */
        boolean f34028e;

        /* renamed from: f */
        C13223c f34029f;

        /* renamed from: g */
        long f34030g;

        C13225d(String str) {
            this.f34024a = str;
            int i = C13220c.this.f34004l;
            this.f34025b = new long[i];
            this.f34026c = new File[i];
            this.f34027d = new File[i];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i2 = 0; i2 < C13220c.this.f34004l; i2++) {
                sb.append(i2);
                this.f34026c[i2] = new File(C13220c.this.f33998f, sb.toString());
                sb.append(".tmp");
                this.f34027d[i2] = new File(C13220c.this.f33998f, sb.toString());
                sb.setLength(length);
            }
        }

        /* renamed from: b */
        private IOException m34680b(String[] strArr) throws IOException {
            StringBuilder sb = new StringBuilder();
            sb.append("unexpected journal line: ");
            sb.append(Arrays.toString(strArr));
            throw new IOException(sb.toString());
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo37992a(String[] strArr) throws IOException {
            if (strArr.length == C13220c.this.f34004l) {
                int i = 0;
                while (i < strArr.length) {
                    try {
                        this.f34025b[i] = Long.parseLong(strArr[i]);
                        i++;
                    } catch (NumberFormatException unused) {
                        m34680b(strArr);
                        throw null;
                    }
                }
                return;
            }
            m34680b(strArr);
            throw null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo37991a(BufferedSink bufferedSink) throws IOException {
            for (long writeDecimalLong : this.f34025b) {
                bufferedSink.writeByte(32).writeDecimalLong(writeDecimalLong);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C13226e mo37990a() {
            if (Thread.holdsLock(C13220c.this)) {
                Source[] sourceArr = new Source[C13220c.this.f34004l];
                long[] jArr = (long[]) this.f34025b.clone();
                int i = 0;
                int i2 = 0;
                while (i2 < C13220c.this.f34004l) {
                    try {
                        sourceArr[i2] = C13220c.this.f33997e.source(this.f34026c[i2]);
                        i2++;
                    } catch (FileNotFoundException unused) {
                        while (i < C13220c.this.f34004l && sourceArr[i] != null) {
                            C13184e.m34503a((Closeable) sourceArr[i]);
                            i++;
                        }
                        try {
                            C13220c.this.mo37973a(this);
                        } catch (IOException unused2) {
                        }
                        return null;
                    }
                }
                C13226e eVar = new C13226e(this.f34024a, this.f34030g, sourceArr, jArr);
                return eVar;
            }
            throw new AssertionError();
        }
    }

    /* renamed from: okhttp3.internal.cache.c$e */
    public final class C13226e implements Closeable {

        /* renamed from: e */
        private final String f34032e;

        /* renamed from: f */
        private final long f34033f;

        /* renamed from: g */
        private final Source[] f34034g;

        C13226e(String str, long j, Source[] sourceArr, long[] jArr) {
            this.f34032e = str;
            this.f34033f = j;
            this.f34034g = sourceArr;
        }

        /* renamed from: a */
        public C13223c mo37993a() throws IOException {
            return C13220c.this.mo37970a(this.f34032e, this.f34033f);
        }

        public void close() {
            for (Source a : this.f34034g) {
                C13184e.m34503a((Closeable) a);
            }
        }

        /* renamed from: a */
        public Source mo37994a(int i) {
            return this.f34034g[i];
        }
    }

    static {
        Class<C13220c> cls = C13220c.class;
    }

    C13220c(FileSystem fileSystem, File file, int i, int i2, long j, Executor executor) {
        this.f33997e = fileSystem;
        this.f33998f = file;
        this.f34002j = i;
        this.f33999g = new File(file, "journal");
        this.f34000h = new File(file, "journal.tmp");
        this.f34001i = new File(file, "journal.bkp");
        this.f34004l = i2;
        this.f34003k = j;
        this.f34015w = executor;
    }

    /* renamed from: a */
    public static C13220c m34654a(FileSystem fileSystem, File file, int i, int i2, long j) {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        } else if (i2 > 0) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C13184e.m34500a("OkHttp DiskLruCache", true));
            C13220c cVar = new C13220c(fileSystem, file, i, i2, j, threadPoolExecutor);
            return cVar;
        } else {
            throw new IllegalArgumentException("valueCount <= 0");
        }
    }

    /* renamed from: d */
    private void m34656d(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        String str3 = "unexpected journal line: ";
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f34007o.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            C13225d dVar = (C13225d) this.f34007o.get(str2);
            if (dVar == null) {
                dVar = new C13225d(str2);
                this.f34007o.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f34028e = true;
                dVar.f34029f = null;
                dVar.mo37992a(split);
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f34029f = new C13223c(dVar);
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

    /* renamed from: g */
    private synchronized void m34658g() {
        if (isClosed()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: h */
    private BufferedSink m34659h() throws FileNotFoundException {
        return C13354l.m35374a((Sink) new C13222b(this.f33997e.appendingSink(this.f33999g)));
    }

    /* renamed from: i */
    private void m34660i() throws IOException {
        this.f33997e.delete(this.f34000h);
        Iterator it = this.f34007o.values().iterator();
        while (it.hasNext()) {
            C13225d dVar = (C13225d) it.next();
            int i = 0;
            if (dVar.f34029f == null) {
                while (i < this.f34004l) {
                    this.f34005m += dVar.f34025b[i];
                    i++;
                }
            } else {
                dVar.f34029f = null;
                while (i < this.f34004l) {
                    this.f33997e.delete(dVar.f34026c[i]);
                    this.f33997e.delete(dVar.f34027d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:16|17|(1:19)(1:20)|(2:22|33)(1:34)) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.f34008p = r0 - r9.f34007o.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006a, code lost:
        if (r1.exhausted() == false) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        mo37980e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        r9.f34006n = m34659h();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        if (r1 != null) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        m34655a((java.lang.Throwable) null, (java.lang.AutoCloseable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ad, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ae, code lost:
        if (r1 != null) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b0, code lost:
        m34655a(r0, (java.lang.AutoCloseable) r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b3, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x005d=Splitter:B:16:0x005d, B:23:0x007d=Splitter:B:23:0x007d} */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m34661j() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            okhttp3.internal.io.FileSystem r1 = r9.f33997e
            java.io.File r2 = r9.f33999g
            okio.Source r1 = r1.source(r2)
            okio.BufferedSource r1 = okio.C13354l.m35375a(r1)
            java.lang.String r2 = r1.readUtf8LineStrict()     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = r1.readUtf8LineStrict()     // Catch:{ all -> 0x00ab }
            java.lang.String r4 = r1.readUtf8LineStrict()     // Catch:{ all -> 0x00ab }
            java.lang.String r5 = r1.readUtf8LineStrict()     // Catch:{ all -> 0x00ab }
            java.lang.String r6 = r1.readUtf8LineStrict()     // Catch:{ all -> 0x00ab }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x00ab }
            if (r7 == 0) goto L_0x007d
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x00ab }
            if (r7 == 0) goto L_0x007d
            int r7 = r9.f34002j     // Catch:{ all -> 0x00ab }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x00ab }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x00ab }
            if (r4 == 0) goto L_0x007d
            int r4 = r9.f34004l     // Catch:{ all -> 0x00ab }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x00ab }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x00ab }
            if (r4 == 0) goto L_0x007d
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x00ab }
            if (r4 == 0) goto L_0x007d
            r0 = 0
        L_0x0053:
            java.lang.String r2 = r1.readUtf8LineStrict()     // Catch:{ EOFException -> 0x005d }
            r9.m34656d(r2)     // Catch:{ EOFException -> 0x005d }
            int r0 = r0 + 1
            goto L_0x0053
        L_0x005d:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.c$d> r2 = r9.f34007o     // Catch:{ all -> 0x00ab }
            int r2 = r2.size()     // Catch:{ all -> 0x00ab }
            int r0 = r0 - r2
            r9.f34008p = r0     // Catch:{ all -> 0x00ab }
            boolean r0 = r1.exhausted()     // Catch:{ all -> 0x00ab }
            if (r0 != 0) goto L_0x0070
            r9.mo37980e()     // Catch:{ all -> 0x00ab }
            goto L_0x0076
        L_0x0070:
            okio.BufferedSink r0 = r9.m34659h()     // Catch:{ all -> 0x00ab }
            r9.f34006n = r0     // Catch:{ all -> 0x00ab }
        L_0x0076:
            if (r1 == 0) goto L_0x007c
            r0 = 0
            m34655a(r0, r1)
        L_0x007c:
            return
        L_0x007d:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x00ab }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            r7.<init>()     // Catch:{ all -> 0x00ab }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x00ab }
            r7.append(r2)     // Catch:{ all -> 0x00ab }
            r7.append(r0)     // Catch:{ all -> 0x00ab }
            r7.append(r3)     // Catch:{ all -> 0x00ab }
            r7.append(r0)     // Catch:{ all -> 0x00ab }
            r7.append(r5)     // Catch:{ all -> 0x00ab }
            r7.append(r0)     // Catch:{ all -> 0x00ab }
            r7.append(r6)     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x00ab }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x00ab }
            r4.<init>(r0)     // Catch:{ all -> 0x00ab }
            throw r4     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r2 = move-exception
            if (r1 == 0) goto L_0x00b3
            m34655a(r0, r1)
        L_0x00b3:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.C13220c.m34661j():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004f, code lost:
        return null;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized okhttp3.internal.cache.C13220c.C13226e mo37974b(java.lang.String r4) throws java.io.IOException {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.mo37976c()     // Catch:{ all -> 0x0050 }
            r3.m34658g()     // Catch:{ all -> 0x0050 }
            r3.m34657e(r4)     // Catch:{ all -> 0x0050 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.c$d> r0 = r3.f34007o     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x0050 }
            okhttp3.internal.cache.c$d r0 = (okhttp3.internal.cache.C13220c.C13225d) r0     // Catch:{ all -> 0x0050 }
            r1 = 0
            if (r0 == 0) goto L_0x004e
            boolean r2 = r0.f34028e     // Catch:{ all -> 0x0050 }
            if (r2 != 0) goto L_0x001a
            goto L_0x004e
        L_0x001a:
            okhttp3.internal.cache.c$e r0 = r0.mo37990a()     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x0022
            monitor-exit(r3)
            return r1
        L_0x0022:
            int r1 = r3.f34008p     // Catch:{ all -> 0x0050 }
            int r1 = r1 + 1
            r3.f34008p = r1     // Catch:{ all -> 0x0050 }
            okio.BufferedSink r1 = r3.f34006n     // Catch:{ all -> 0x0050 }
            java.lang.String r2 = "READ"
            okio.BufferedSink r1 = r1.writeUtf8(r2)     // Catch:{ all -> 0x0050 }
            r2 = 32
            okio.BufferedSink r1 = r1.writeByte(r2)     // Catch:{ all -> 0x0050 }
            okio.BufferedSink r4 = r1.writeUtf8(r4)     // Catch:{ all -> 0x0050 }
            r1 = 10
            r4.writeByte(r1)     // Catch:{ all -> 0x0050 }
            boolean r4 = r3.mo37979d()     // Catch:{ all -> 0x0050 }
            if (r4 == 0) goto L_0x004c
            java.util.concurrent.Executor r4 = r3.f34015w     // Catch:{ all -> 0x0050 }
            java.lang.Runnable r1 = r3.f34016x     // Catch:{ all -> 0x0050 }
            r4.execute(r1)     // Catch:{ all -> 0x0050 }
        L_0x004c:
            monitor-exit(r3)
            return r0
        L_0x004e:
            monitor-exit(r3)
            return r1
        L_0x0050:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.C13220c.mo37974b(java.lang.String):okhttp3.internal.cache.c$e");
    }

    /* renamed from: c */
    public synchronized void mo37976c() throws IOException {
        if (!this.f34010r) {
            if (this.f33997e.exists(this.f34001i)) {
                if (this.f33997e.exists(this.f33999g)) {
                    this.f33997e.delete(this.f34001i);
                } else {
                    this.f33997e.rename(this.f34001i, this.f33999g);
                }
            }
            if (this.f33997e.exists(this.f33999g)) {
                try {
                    m34661j();
                    m34660i();
                    this.f34010r = true;
                    return;
                } catch (IOException e) {
                    C13202e d = C13202e.m34581d();
                    StringBuilder sb = new StringBuilder();
                    sb.append("DiskLruCache ");
                    sb.append(this.f33998f);
                    sb.append(" is corrupt: ");
                    sb.append(e.getMessage());
                    sb.append(", removing");
                    d.mo37897a(5, sb.toString(), (Throwable) e);
                    mo37971a();
                    this.f34011s = false;
                } catch (Throwable th) {
                    this.f34011s = false;
                    throw th;
                }
            }
            mo37980e();
            this.f34010r = true;
        }
    }

    public synchronized void close() throws IOException {
        C13225d[] dVarArr;
        if (this.f34010r) {
            if (!this.f34011s) {
                for (C13225d dVar : (C13225d[]) this.f34007o.values().toArray(new C13225d[this.f34007o.size()])) {
                    if (dVar.f34029f != null) {
                        dVar.f34029f.mo37987a();
                    }
                }
                mo37981f();
                this.f34006n.close();
                this.f34006n = null;
                this.f34011s = true;
                return;
            }
        }
        this.f34011s = true;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bc, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bd, code lost:
        if (r0 != null) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        m34655a(r1, (java.lang.AutoCloseable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c2, code lost:
        throw r2;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo37980e() throws java.io.IOException {
        /*
            r7 = this;
            monitor-enter(r7)
            okio.BufferedSink r0 = r7.f34006n     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x000a
            okio.BufferedSink r0 = r7.f34006n     // Catch:{ all -> 0x00c3 }
            r0.close()     // Catch:{ all -> 0x00c3 }
        L_0x000a:
            okhttp3.internal.io.FileSystem r0 = r7.f33997e     // Catch:{ all -> 0x00c3 }
            java.io.File r1 = r7.f34000h     // Catch:{ all -> 0x00c3 }
            okio.Sink r0 = r0.sink(r1)     // Catch:{ all -> 0x00c3 }
            okio.BufferedSink r0 = okio.C13354l.m35374a(r0)     // Catch:{ all -> 0x00c3 }
            r1 = 0
            java.lang.String r2 = "libcore.io.DiskLruCache"
            okio.BufferedSink r2 = r0.writeUtf8(r2)     // Catch:{ all -> 0x00ba }
            r3 = 10
            r2.writeByte(r3)     // Catch:{ all -> 0x00ba }
            java.lang.String r2 = "1"
            okio.BufferedSink r2 = r0.writeUtf8(r2)     // Catch:{ all -> 0x00ba }
            r2.writeByte(r3)     // Catch:{ all -> 0x00ba }
            int r2 = r7.f34002j     // Catch:{ all -> 0x00ba }
            long r4 = (long) r2     // Catch:{ all -> 0x00ba }
            okio.BufferedSink r2 = r0.writeDecimalLong(r4)     // Catch:{ all -> 0x00ba }
            r2.writeByte(r3)     // Catch:{ all -> 0x00ba }
            int r2 = r7.f34004l     // Catch:{ all -> 0x00ba }
            long r4 = (long) r2     // Catch:{ all -> 0x00ba }
            okio.BufferedSink r2 = r0.writeDecimalLong(r4)     // Catch:{ all -> 0x00ba }
            r2.writeByte(r3)     // Catch:{ all -> 0x00ba }
            r0.writeByte(r3)     // Catch:{ all -> 0x00ba }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.c$d> r2 = r7.f34007o     // Catch:{ all -> 0x00ba }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x00ba }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00ba }
        L_0x004c:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x00ba }
            if (r4 == 0) goto L_0x0085
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x00ba }
            okhttp3.internal.cache.c$d r4 = (okhttp3.internal.cache.C13220c.C13225d) r4     // Catch:{ all -> 0x00ba }
            okhttp3.internal.cache.c$c r5 = r4.f34029f     // Catch:{ all -> 0x00ba }
            r6 = 32
            if (r5 == 0) goto L_0x0070
            java.lang.String r5 = "DIRTY"
            okio.BufferedSink r5 = r0.writeUtf8(r5)     // Catch:{ all -> 0x00ba }
            r5.writeByte(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r4 = r4.f34024a     // Catch:{ all -> 0x00ba }
            r0.writeUtf8(r4)     // Catch:{ all -> 0x00ba }
            r0.writeByte(r3)     // Catch:{ all -> 0x00ba }
            goto L_0x004c
        L_0x0070:
            java.lang.String r5 = "CLEAN"
            okio.BufferedSink r5 = r0.writeUtf8(r5)     // Catch:{ all -> 0x00ba }
            r5.writeByte(r6)     // Catch:{ all -> 0x00ba }
            java.lang.String r5 = r4.f34024a     // Catch:{ all -> 0x00ba }
            r0.writeUtf8(r5)     // Catch:{ all -> 0x00ba }
            r4.mo37991a(r0)     // Catch:{ all -> 0x00ba }
            r0.writeByte(r3)     // Catch:{ all -> 0x00ba }
            goto L_0x004c
        L_0x0085:
            if (r0 == 0) goto L_0x008a
            m34655a(r1, r0)     // Catch:{ all -> 0x00c3 }
        L_0x008a:
            okhttp3.internal.io.FileSystem r0 = r7.f33997e     // Catch:{ all -> 0x00c3 }
            java.io.File r1 = r7.f33999g     // Catch:{ all -> 0x00c3 }
            boolean r0 = r0.exists(r1)     // Catch:{ all -> 0x00c3 }
            if (r0 == 0) goto L_0x009d
            okhttp3.internal.io.FileSystem r0 = r7.f33997e     // Catch:{ all -> 0x00c3 }
            java.io.File r1 = r7.f33999g     // Catch:{ all -> 0x00c3 }
            java.io.File r2 = r7.f34001i     // Catch:{ all -> 0x00c3 }
            r0.rename(r1, r2)     // Catch:{ all -> 0x00c3 }
        L_0x009d:
            okhttp3.internal.io.FileSystem r0 = r7.f33997e     // Catch:{ all -> 0x00c3 }
            java.io.File r1 = r7.f34000h     // Catch:{ all -> 0x00c3 }
            java.io.File r2 = r7.f33999g     // Catch:{ all -> 0x00c3 }
            r0.rename(r1, r2)     // Catch:{ all -> 0x00c3 }
            okhttp3.internal.io.FileSystem r0 = r7.f33997e     // Catch:{ all -> 0x00c3 }
            java.io.File r1 = r7.f34001i     // Catch:{ all -> 0x00c3 }
            r0.delete(r1)     // Catch:{ all -> 0x00c3 }
            okio.BufferedSink r0 = r7.m34659h()     // Catch:{ all -> 0x00c3 }
            r7.f34006n = r0     // Catch:{ all -> 0x00c3 }
            r0 = 0
            r7.f34009q = r0     // Catch:{ all -> 0x00c3 }
            r7.f34013u = r0     // Catch:{ all -> 0x00c3 }
            monitor-exit(r7)
            return
        L_0x00ba:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            r2 = move-exception
            if (r0 == 0) goto L_0x00c2
            m34655a(r1, r0)     // Catch:{ all -> 0x00c3 }
        L_0x00c2:
            throw r2     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.C13220c.mo37980e():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo37981f() throws IOException {
        while (this.f34005m > this.f34003k) {
            mo37973a((C13225d) this.f34007o.values().iterator().next());
        }
        this.f34012t = false;
    }

    public synchronized void flush() throws IOException {
        if (this.f34010r) {
            m34658g();
            mo37981f();
            this.f34006n.flush();
        }
    }

    public synchronized boolean isClosed() {
        return this.f34011s;
    }

    /* renamed from: a */
    private static /* synthetic */ void m34655a(Throwable th, AutoCloseable autoCloseable) {
        if (th != null) {
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            autoCloseable.close();
        }
    }

    /* renamed from: a */
    public C13223c mo37969a(String str) throws IOException {
        return mo37970a(str, -1);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized okhttp3.internal.cache.C13220c.C13223c mo37970a(java.lang.String r6, long r7) throws java.io.IOException {
        /*
            r5 = this;
            monitor-enter(r5)
            r5.mo37976c()     // Catch:{ all -> 0x0074 }
            r5.m34658g()     // Catch:{ all -> 0x0074 }
            r5.m34657e(r6)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.c$d> r0 = r5.f34007o     // Catch:{ all -> 0x0074 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0074 }
            okhttp3.internal.cache.c$d r0 = (okhttp3.internal.cache.C13220c.C13225d) r0     // Catch:{ all -> 0x0074 }
            r1 = -1
            r3 = 0
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
            if (r0 == 0) goto L_0x0021
            long r1 = r0.f34030g     // Catch:{ all -> 0x0074 }
            int r4 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r4 == 0) goto L_0x0023
        L_0x0021:
            monitor-exit(r5)
            return r3
        L_0x0023:
            if (r0 == 0) goto L_0x002b
            okhttp3.internal.cache.c$c r7 = r0.f34029f     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x002b
            monitor-exit(r5)
            return r3
        L_0x002b:
            boolean r7 = r5.f34012t     // Catch:{ all -> 0x0074 }
            if (r7 != 0) goto L_0x006b
            boolean r7 = r5.f34013u     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0034
            goto L_0x006b
        L_0x0034:
            okio.BufferedSink r7 = r5.f34006n     // Catch:{ all -> 0x0074 }
            java.lang.String r8 = "DIRTY"
            okio.BufferedSink r7 = r7.writeUtf8(r8)     // Catch:{ all -> 0x0074 }
            r8 = 32
            okio.BufferedSink r7 = r7.writeByte(r8)     // Catch:{ all -> 0x0074 }
            okio.BufferedSink r7 = r7.writeUtf8(r6)     // Catch:{ all -> 0x0074 }
            r8 = 10
            r7.writeByte(r8)     // Catch:{ all -> 0x0074 }
            okio.BufferedSink r7 = r5.f34006n     // Catch:{ all -> 0x0074 }
            r7.flush()     // Catch:{ all -> 0x0074 }
            boolean r7 = r5.f34009q     // Catch:{ all -> 0x0074 }
            if (r7 == 0) goto L_0x0056
            monitor-exit(r5)
            return r3
        L_0x0056:
            if (r0 != 0) goto L_0x0062
            okhttp3.internal.cache.c$d r0 = new okhttp3.internal.cache.c$d     // Catch:{ all -> 0x0074 }
            r0.<init>(r6)     // Catch:{ all -> 0x0074 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.c$d> r7 = r5.f34007o     // Catch:{ all -> 0x0074 }
            r7.put(r6, r0)     // Catch:{ all -> 0x0074 }
        L_0x0062:
            okhttp3.internal.cache.c$c r6 = new okhttp3.internal.cache.c$c     // Catch:{ all -> 0x0074 }
            r6.<init>(r0)     // Catch:{ all -> 0x0074 }
            r0.f34029f = r6     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r6
        L_0x006b:
            java.util.concurrent.Executor r6 = r5.f34015w     // Catch:{ all -> 0x0074 }
            java.lang.Runnable r7 = r5.f34016x     // Catch:{ all -> 0x0074 }
            r6.execute(r7)     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)
            return r3
        L_0x0074:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.C13220c.mo37970a(java.lang.String, long):okhttp3.internal.cache.c$c");
    }

    /* renamed from: b */
    public synchronized void mo37975b() throws IOException {
        mo37976c();
        for (C13225d a : (C13225d[]) this.f34007o.values().toArray(new C13225d[this.f34007o.size()])) {
            mo37973a(a);
        }
        this.f34012t = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        return r7;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean mo37977c(java.lang.String r7) throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            r6.mo37976c()     // Catch:{ all -> 0x0029 }
            r6.m34658g()     // Catch:{ all -> 0x0029 }
            r6.m34657e(r7)     // Catch:{ all -> 0x0029 }
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.c$d> r0 = r6.f34007o     // Catch:{ all -> 0x0029 }
            java.lang.Object r7 = r0.get(r7)     // Catch:{ all -> 0x0029 }
            okhttp3.internal.cache.c$d r7 = (okhttp3.internal.cache.C13220c.C13225d) r7     // Catch:{ all -> 0x0029 }
            r0 = 0
            if (r7 != 0) goto L_0x0017
            monitor-exit(r6)
            return r0
        L_0x0017:
            boolean r7 = r6.mo37973a(r7)     // Catch:{ all -> 0x0029 }
            if (r7 == 0) goto L_0x0027
            long r1 = r6.f34005m     // Catch:{ all -> 0x0029 }
            long r3 = r6.f34003k     // Catch:{ all -> 0x0029 }
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0027
            r6.f34012t = r0     // Catch:{ all -> 0x0029 }
        L_0x0027:
            monitor-exit(r6)
            return r7
        L_0x0029:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.C13220c.mo37977c(java.lang.String):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo37979d() {
        int i = this.f34008p;
        return i >= 2000 && i >= this.f34007o.size();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f4, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo37972a(okhttp3.internal.cache.C13220c.C13223c r10, boolean r11) throws java.io.IOException {
        /*
            r9 = this;
            monitor-enter(r9)
            okhttp3.internal.cache.c$d r0 = r10.f34019a     // Catch:{ all -> 0x00fb }
            okhttp3.internal.cache.c$c r1 = r0.f34029f     // Catch:{ all -> 0x00fb }
            if (r1 != r10) goto L_0x00f5
            r1 = 0
            if (r11 == 0) goto L_0x0047
            boolean r2 = r0.f34028e     // Catch:{ all -> 0x00fb }
            if (r2 != 0) goto L_0x0047
            r2 = 0
        L_0x000f:
            int r3 = r9.f34004l     // Catch:{ all -> 0x00fb }
            if (r2 >= r3) goto L_0x0047
            boolean[] r3 = r10.f34020b     // Catch:{ all -> 0x00fb }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00fb }
            if (r3 == 0) goto L_0x002d
            okhttp3.internal.io.FileSystem r3 = r9.f33997e     // Catch:{ all -> 0x00fb }
            java.io.File[] r4 = r0.f34027d     // Catch:{ all -> 0x00fb }
            r4 = r4[r2]     // Catch:{ all -> 0x00fb }
            boolean r3 = r3.exists(r4)     // Catch:{ all -> 0x00fb }
            if (r3 != 0) goto L_0x002a
            r10.mo37987a()     // Catch:{ all -> 0x00fb }
            monitor-exit(r9)
            return
        L_0x002a:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002d:
            r10.mo37987a()     // Catch:{ all -> 0x00fb }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fb }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fb }
            r11.<init>()     // Catch:{ all -> 0x00fb }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x00fb }
            r11.append(r2)     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00fb }
            r10.<init>(r11)     // Catch:{ all -> 0x00fb }
            throw r10     // Catch:{ all -> 0x00fb }
        L_0x0047:
            int r10 = r9.f34004l     // Catch:{ all -> 0x00fb }
            if (r1 >= r10) goto L_0x007f
            java.io.File[] r10 = r0.f34027d     // Catch:{ all -> 0x00fb }
            r10 = r10[r1]     // Catch:{ all -> 0x00fb }
            if (r11 == 0) goto L_0x0077
            okhttp3.internal.io.FileSystem r2 = r9.f33997e     // Catch:{ all -> 0x00fb }
            boolean r2 = r2.exists(r10)     // Catch:{ all -> 0x00fb }
            if (r2 == 0) goto L_0x007c
            java.io.File[] r2 = r0.f34026c     // Catch:{ all -> 0x00fb }
            r2 = r2[r1]     // Catch:{ all -> 0x00fb }
            okhttp3.internal.io.FileSystem r3 = r9.f33997e     // Catch:{ all -> 0x00fb }
            r3.rename(r10, r2)     // Catch:{ all -> 0x00fb }
            long[] r10 = r0.f34025b     // Catch:{ all -> 0x00fb }
            r3 = r10[r1]     // Catch:{ all -> 0x00fb }
            okhttp3.internal.io.FileSystem r10 = r9.f33997e     // Catch:{ all -> 0x00fb }
            long r5 = r10.size(r2)     // Catch:{ all -> 0x00fb }
            long[] r10 = r0.f34025b     // Catch:{ all -> 0x00fb }
            r10[r1] = r5     // Catch:{ all -> 0x00fb }
            long r7 = r9.f34005m     // Catch:{ all -> 0x00fb }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f34005m = r7     // Catch:{ all -> 0x00fb }
            goto L_0x007c
        L_0x0077:
            okhttp3.internal.io.FileSystem r2 = r9.f33997e     // Catch:{ all -> 0x00fb }
            r2.delete(r10)     // Catch:{ all -> 0x00fb }
        L_0x007c:
            int r1 = r1 + 1
            goto L_0x0047
        L_0x007f:
            int r10 = r9.f34008p     // Catch:{ all -> 0x00fb }
            r1 = 1
            int r10 = r10 + r1
            r9.f34008p = r10     // Catch:{ all -> 0x00fb }
            r10 = 0
            r0.f34029f = r10     // Catch:{ all -> 0x00fb }
            boolean r10 = r0.f34028e     // Catch:{ all -> 0x00fb }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00bb
            r0.f34028e = r1     // Catch:{ all -> 0x00fb }
            okio.BufferedSink r10 = r9.f34006n     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = "CLEAN"
            okio.BufferedSink r10 = r10.writeUtf8(r1)     // Catch:{ all -> 0x00fb }
            r10.writeByte(r3)     // Catch:{ all -> 0x00fb }
            okio.BufferedSink r10 = r9.f34006n     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = r0.f34024a     // Catch:{ all -> 0x00fb }
            r10.writeUtf8(r1)     // Catch:{ all -> 0x00fb }
            okio.BufferedSink r10 = r9.f34006n     // Catch:{ all -> 0x00fb }
            r0.mo37991a(r10)     // Catch:{ all -> 0x00fb }
            okio.BufferedSink r10 = r9.f34006n     // Catch:{ all -> 0x00fb }
            r10.writeByte(r2)     // Catch:{ all -> 0x00fb }
            if (r11 == 0) goto L_0x00d9
            long r10 = r9.f34014v     // Catch:{ all -> 0x00fb }
            r1 = 1
            long r1 = r1 + r10
            r9.f34014v = r1     // Catch:{ all -> 0x00fb }
            r0.f34030g = r10     // Catch:{ all -> 0x00fb }
            goto L_0x00d9
        L_0x00bb:
            java.util.LinkedHashMap<java.lang.String, okhttp3.internal.cache.c$d> r10 = r9.f34007o     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r0.f34024a     // Catch:{ all -> 0x00fb }
            r10.remove(r11)     // Catch:{ all -> 0x00fb }
            okio.BufferedSink r10 = r9.f34006n     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = "REMOVE"
            okio.BufferedSink r10 = r10.writeUtf8(r11)     // Catch:{ all -> 0x00fb }
            r10.writeByte(r3)     // Catch:{ all -> 0x00fb }
            okio.BufferedSink r10 = r9.f34006n     // Catch:{ all -> 0x00fb }
            java.lang.String r11 = r0.f34024a     // Catch:{ all -> 0x00fb }
            r10.writeUtf8(r11)     // Catch:{ all -> 0x00fb }
            okio.BufferedSink r10 = r9.f34006n     // Catch:{ all -> 0x00fb }
            r10.writeByte(r2)     // Catch:{ all -> 0x00fb }
        L_0x00d9:
            okio.BufferedSink r10 = r9.f34006n     // Catch:{ all -> 0x00fb }
            r10.flush()     // Catch:{ all -> 0x00fb }
            long r10 = r9.f34005m     // Catch:{ all -> 0x00fb }
            long r0 = r9.f34003k     // Catch:{ all -> 0x00fb }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x00ec
            boolean r10 = r9.mo37979d()     // Catch:{ all -> 0x00fb }
            if (r10 == 0) goto L_0x00f3
        L_0x00ec:
            java.util.concurrent.Executor r10 = r9.f34015w     // Catch:{ all -> 0x00fb }
            java.lang.Runnable r11 = r9.f34016x     // Catch:{ all -> 0x00fb }
            r10.execute(r11)     // Catch:{ all -> 0x00fb }
        L_0x00f3:
            monitor-exit(r9)
            return
        L_0x00f5:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00fb }
            r10.<init>()     // Catch:{ all -> 0x00fb }
            throw r10     // Catch:{ all -> 0x00fb }
        L_0x00fb:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.C13220c.mo37972a(okhttp3.internal.cache.c$c, boolean):void");
    }

    /* renamed from: e */
    private void m34657e(String str) {
        if (!f33996y.matcher(str).matches()) {
            StringBuilder sb = new StringBuilder();
            sb.append("keys must match regex [a-z0-9_-]{1,120}: \"");
            sb.append(str);
            sb.append("\"");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo37973a(C13225d dVar) throws IOException {
        C13223c cVar = dVar.f34029f;
        if (cVar != null) {
            cVar.mo37989c();
        }
        for (int i = 0; i < this.f34004l; i++) {
            this.f33997e.delete(dVar.f34026c[i]);
            long j = this.f34005m;
            long[] jArr = dVar.f34025b;
            this.f34005m = j - jArr[i];
            jArr[i] = 0;
        }
        this.f34008p++;
        this.f34006n.writeUtf8("REMOVE").writeByte(32).writeUtf8(dVar.f34024a).writeByte(10);
        this.f34007o.remove(dVar.f34024a);
        if (mo37979d()) {
            this.f34015w.execute(this.f34016x);
        }
        return true;
    }

    /* renamed from: a */
    public void mo37971a() throws IOException {
        close();
        this.f33997e.deleteContents(this.f33998f);
    }
}
