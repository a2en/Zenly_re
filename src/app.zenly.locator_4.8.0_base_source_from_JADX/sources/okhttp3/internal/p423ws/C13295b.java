package okhttp3.internal.p423ws;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.C13167a0;
import okhttp3.C13178e0;
import okhttp3.C13325v;
import okhttp3.C13325v.C13327b;
import okhttp3.C13328w;
import okhttp3.C13331y;
import okhttp3.C13331y.C13332a;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.EventListener;
import okhttp3.WebSocket;
import okhttp3.internal.connection.C13231d;
import okhttp3.internal.p423ws.WebSocketReader.FrameCallback;
import okhttp3.p418f0.C13182c;
import okhttp3.p418f0.C13184e;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.C13346d;

/* renamed from: okhttp3.internal.ws.b */
public final class C13295b implements WebSocket, FrameCallback {

    /* renamed from: x */
    private static final List<C13328w> f34337x = Collections.singletonList(C13328w.HTTP_1_1);

    /* renamed from: a */
    private final C13331y f34338a;

    /* renamed from: b */
    final C13178e0 f34339b;

    /* renamed from: c */
    private final Random f34340c;

    /* renamed from: d */
    private final long f34341d;

    /* renamed from: e */
    private final String f34342e;

    /* renamed from: f */
    private Call f34343f;

    /* renamed from: g */
    private final Runnable f34344g;

    /* renamed from: h */
    private WebSocketReader f34345h;

    /* renamed from: i */
    private C13303d f34346i;

    /* renamed from: j */
    private ScheduledExecutorService f34347j;

    /* renamed from: k */
    private C13301f f34348k;

    /* renamed from: l */
    private final ArrayDeque<C13346d> f34349l = new ArrayDeque<>();

    /* renamed from: m */
    private final ArrayDeque<Object> f34350m = new ArrayDeque<>();

    /* renamed from: n */
    private long f34351n;

    /* renamed from: o */
    private boolean f34352o;

    /* renamed from: p */
    private ScheduledFuture<?> f34353p;

    /* renamed from: q */
    private int f34354q = -1;

    /* renamed from: r */
    private String f34355r;

    /* renamed from: s */
    private boolean f34356s;

    /* renamed from: t */
    private int f34357t;

    /* renamed from: u */
    private int f34358u;

    /* renamed from: v */
    private int f34359v;

    /* renamed from: w */
    private boolean f34360w;

    /* renamed from: okhttp3.internal.ws.b$a */
    class C13296a implements Callback {

        /* renamed from: a */
        final /* synthetic */ C13331y f34361a;

        C13296a(C13331y yVar) {
            this.f34361a = yVar;
        }

        public void onFailure(Call call, IOException iOException) {
            C13295b.this.mo38203a((Exception) iOException, (C13167a0) null);
        }

        public void onResponse(Call call, C13167a0 a0Var) {
            C13231d a = C13182c.f33853a.mo37866a(a0Var);
            try {
                C13295b.this.mo38205a(a0Var, a);
                C13301f g = a.mo38015g();
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OkHttp WebSocket ");
                    sb.append(this.f34361a.mo38389g().mo38296n());
                    C13295b.this.mo38204a(sb.toString(), g);
                    C13295b.this.f34339b.mo37859a((WebSocket) C13295b.this, a0Var);
                    C13295b.this.mo38208b();
                } catch (Exception e) {
                    C13295b.this.mo38203a(e, (C13167a0) null);
                }
            } catch (IOException e2) {
                if (a != null) {
                    a.mo38019k();
                }
                C13295b.this.mo38203a((Exception) e2, a0Var);
                C13184e.m34503a((Closeable) a0Var);
            }
        }
    }

    /* renamed from: okhttp3.internal.ws.b$b */
    final class C13297b implements Runnable {
        C13297b() {
        }

        public void run() {
            C13295b.this.cancel();
        }
    }

    /* renamed from: okhttp3.internal.ws.b$c */
    static final class C13298c {

        /* renamed from: a */
        final int f34364a;

        /* renamed from: b */
        final C13346d f34365b;

        /* renamed from: c */
        final long f34366c;

        C13298c(int i, C13346d dVar, long j) {
            this.f34364a = i;
            this.f34365b = dVar;
            this.f34366c = j;
        }
    }

    /* renamed from: okhttp3.internal.ws.b$d */
    static final class C13299d {

        /* renamed from: a */
        final int f34367a;

        /* renamed from: b */
        final C13346d f34368b;

        C13299d(int i, C13346d dVar) {
            this.f34367a = i;
            this.f34368b = dVar;
        }
    }

    /* renamed from: okhttp3.internal.ws.b$e */
    private final class C13300e implements Runnable {
        C13300e() {
        }

        public void run() {
            C13295b.this.mo38210d();
        }
    }

    /* renamed from: okhttp3.internal.ws.b$f */
    public static abstract class C13301f implements Closeable {

        /* renamed from: e */
        public final boolean f34370e;

        /* renamed from: f */
        public final BufferedSource f34371f;

        /* renamed from: g */
        public final BufferedSink f34372g;

        public C13301f(boolean z, BufferedSource bufferedSource, BufferedSink bufferedSink) {
            this.f34370e = z;
            this.f34371f = bufferedSource;
            this.f34372g = bufferedSink;
        }
    }

    public C13295b(C13331y yVar, C13178e0 e0Var, Random random, long j) {
        if ("GET".equals(yVar.mo38387e())) {
            this.f34338a = yVar;
            this.f34339b = e0Var;
            this.f34340c = random;
            this.f34341d = j;
            byte[] bArr = new byte[16];
            random.nextBytes(bArr);
            this.f34342e = C13346d.m35331a(bArr).mo38515a();
            this.f34344g = new C13294a(this);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Request must be GET: ");
        sb.append(yVar.mo38387e());
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: e */
    private void m35018e() {
        ScheduledExecutorService scheduledExecutorService = this.f34347j;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.execute(this.f34344g);
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo38202a() {
        do {
            try {
            } catch (IOException e) {
                mo38203a((Exception) e, (C13167a0) null);
                return;
            }
        } while (mo38209c());
    }

    /* renamed from: b */
    public void mo38208b() throws IOException {
        while (this.f34354q == -1) {
            this.f34345h.mo38195a();
        }
    }

    /* JADX INFO: used method not loaded: okhttp3.internal.ws.d.a(int, long):null, types can be incorrect */
    /* JADX INFO: used method not loaded: okhttp3.internal.ws.d.a(int, okio.d):null, types can be incorrect */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (r2 == null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r0.mo38217b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0058, code lost:
        if ((r5 instanceof okhttp3.internal.p423ws.C13295b.C13299d) == false) goto L_0x0086;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005a, code lost:
        r1 = ((okhttp3.internal.p423ws.C13295b.C13299d) r5).f34368b;
        r0 = okio.C13354l.m35374a(r0.mo38213a(((okhttp3.internal.p423ws.C13295b.C13299d) r5).f34367a, (long) r1.mo38528g()));
        r0.write(r1);
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        monitor-enter(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r11.f34351n -= (long) r1.mo38528g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0081, code lost:
        monitor-exit(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0088, code lost:
        if ((r5 instanceof okhttp3.internal.p423ws.C13295b.C13298c) == false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008a, code lost:
        r5 = (okhttp3.internal.p423ws.C13295b.C13298c) r5;
        r0.mo38215a(r5.f34364a, r5.f34365b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0093, code lost:
        if (r4 == null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0095, code lost:
        r11.f34339b.mo37856a((okhttp3.WebSocket) r11, r1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009a, code lost:
        okhttp3.p418f0.C13184e.m34503a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009e, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a4, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a6, code lost:
        okhttp3.p418f0.C13184e.m34503a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00a9, code lost:
        throw r0;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo38209c() throws java.io.IOException {
        /*
            r11 = this;
            monitor-enter(r11)
            boolean r0 = r11.f34356s     // Catch:{ all -> 0x00aa }
            r1 = 0
            if (r0 == 0) goto L_0x0008
            monitor-exit(r11)     // Catch:{ all -> 0x00aa }
            return r1
        L_0x0008:
            okhttp3.internal.ws.d r0 = r11.f34346i     // Catch:{ all -> 0x00aa }
            java.util.ArrayDeque<okio.d> r2 = r11.f34349l     // Catch:{ all -> 0x00aa }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x00aa }
            okio.d r2 = (okio.C13346d) r2     // Catch:{ all -> 0x00aa }
            r3 = -1
            r4 = 0
            if (r2 != 0) goto L_0x004c
            java.util.ArrayDeque<java.lang.Object> r5 = r11.f34350m     // Catch:{ all -> 0x00aa }
            java.lang.Object r5 = r5.poll()     // Catch:{ all -> 0x00aa }
            boolean r6 = r5 instanceof okhttp3.internal.p423ws.C13295b.C13298c     // Catch:{ all -> 0x00aa }
            if (r6 == 0) goto L_0x0046
            int r1 = r11.f34354q     // Catch:{ all -> 0x00aa }
            java.lang.String r6 = r11.f34355r     // Catch:{ all -> 0x00aa }
            if (r1 == r3) goto L_0x0031
            okhttp3.internal.ws.b$f r3 = r11.f34348k     // Catch:{ all -> 0x00aa }
            r11.f34348k = r4     // Catch:{ all -> 0x00aa }
            java.util.concurrent.ScheduledExecutorService r4 = r11.f34347j     // Catch:{ all -> 0x00aa }
            r4.shutdown()     // Catch:{ all -> 0x00aa }
            r4 = r3
            goto L_0x004f
        L_0x0031:
            java.util.concurrent.ScheduledExecutorService r3 = r11.f34347j     // Catch:{ all -> 0x00aa }
            okhttp3.internal.ws.b$b r7 = new okhttp3.internal.ws.b$b     // Catch:{ all -> 0x00aa }
            r7.<init>()     // Catch:{ all -> 0x00aa }
            r8 = r5
            okhttp3.internal.ws.b$c r8 = (okhttp3.internal.p423ws.C13295b.C13298c) r8     // Catch:{ all -> 0x00aa }
            long r8 = r8.f34366c     // Catch:{ all -> 0x00aa }
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x00aa }
            java.util.concurrent.ScheduledFuture r3 = r3.schedule(r7, r8, r10)     // Catch:{ all -> 0x00aa }
            r11.f34353p = r3     // Catch:{ all -> 0x00aa }
            goto L_0x004f
        L_0x0046:
            if (r5 != 0) goto L_0x004a
            monitor-exit(r11)     // Catch:{ all -> 0x00aa }
            return r1
        L_0x004a:
            r6 = r4
            goto L_0x004e
        L_0x004c:
            r5 = r4
            r6 = r5
        L_0x004e:
            r1 = -1
        L_0x004f:
            monitor-exit(r11)     // Catch:{ all -> 0x00aa }
            if (r2 == 0) goto L_0x0056
            r0.mo38217b(r2)     // Catch:{ all -> 0x00a5 }
            goto L_0x009a
        L_0x0056:
            boolean r2 = r5 instanceof okhttp3.internal.p423ws.C13295b.C13299d     // Catch:{ all -> 0x00a5 }
            if (r2 == 0) goto L_0x0086
            r1 = r5
            okhttp3.internal.ws.b$d r1 = (okhttp3.internal.p423ws.C13295b.C13299d) r1     // Catch:{ all -> 0x00a5 }
            okio.d r1 = r1.f34368b     // Catch:{ all -> 0x00a5 }
            okhttp3.internal.ws.b$d r5 = (okhttp3.internal.p423ws.C13295b.C13299d) r5     // Catch:{ all -> 0x00a5 }
            int r2 = r5.f34367a     // Catch:{ all -> 0x00a5 }
            int r3 = r1.mo38528g()     // Catch:{ all -> 0x00a5 }
            long r5 = (long) r3     // Catch:{ all -> 0x00a5 }
            okio.Sink r0 = r0.mo38213a(r2, r5)     // Catch:{ all -> 0x00a5 }
            okio.BufferedSink r0 = okio.C13354l.m35374a(r0)     // Catch:{ all -> 0x00a5 }
            r0.write(r1)     // Catch:{ all -> 0x00a5 }
            r0.close()     // Catch:{ all -> 0x00a5 }
            monitor-enter(r11)     // Catch:{ all -> 0x00a5 }
            long r2 = r11.f34351n     // Catch:{ all -> 0x0083 }
            int r0 = r1.mo38528g()     // Catch:{ all -> 0x0083 }
            long r0 = (long) r0     // Catch:{ all -> 0x0083 }
            long r2 = r2 - r0
            r11.f34351n = r2     // Catch:{ all -> 0x0083 }
            monitor-exit(r11)     // Catch:{ all -> 0x0083 }
            goto L_0x009a
        L_0x0083:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0083 }
            throw r0     // Catch:{ all -> 0x00a5 }
        L_0x0086:
            boolean r2 = r5 instanceof okhttp3.internal.p423ws.C13295b.C13298c     // Catch:{ all -> 0x00a5 }
            if (r2 == 0) goto L_0x009f
            okhttp3.internal.ws.b$c r5 = (okhttp3.internal.p423ws.C13295b.C13298c) r5     // Catch:{ all -> 0x00a5 }
            int r2 = r5.f34364a     // Catch:{ all -> 0x00a5 }
            okio.d r3 = r5.f34365b     // Catch:{ all -> 0x00a5 }
            r0.mo38215a(r2, r3)     // Catch:{ all -> 0x00a5 }
            if (r4 == 0) goto L_0x009a
            okhttp3.e0 r0 = r11.f34339b     // Catch:{ all -> 0x00a5 }
            r0.mo37856a(r11, r1, r6)     // Catch:{ all -> 0x00a5 }
        L_0x009a:
            r0 = 1
            okhttp3.p418f0.C13184e.m34503a(r4)
            return r0
        L_0x009f:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x00a5 }
            r0.<init>()     // Catch:{ all -> 0x00a5 }
            throw r0     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r0 = move-exception
            okhttp3.p418f0.C13184e.m34503a(r4)
            throw r0
        L_0x00aa:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x00aa }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p423ws.C13295b.mo38209c():boolean");
    }

    public void cancel() {
        this.f34343f.cancel();
    }

    public boolean close(int i, String str) {
        return mo38207a(i, str, 60000);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (r1 == -1) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("sent ping but didn't receive pong within ");
        r2.append(r7.f34341d);
        r2.append("ms (after ");
        r2.append(r1 - 1);
        r2.append(" successful ping/pongs)");
        mo38203a((java.lang.Exception) new java.net.SocketTimeoutException(r2.toString()), (okhttp3.C13167a0) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0.mo38216a(okio.C13346d.f34617i);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        mo38203a((java.lang.Exception) r0, (okhttp3.C13167a0) null);
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo38210d() {
        /*
            r7 = this;
            monitor-enter(r7)
            boolean r0 = r7.f34356s     // Catch:{ all -> 0x0053 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r7)     // Catch:{ all -> 0x0053 }
            return
        L_0x0007:
            okhttp3.internal.ws.d r0 = r7.f34346i     // Catch:{ all -> 0x0053 }
            boolean r1 = r7.f34360w     // Catch:{ all -> 0x0053 }
            r2 = -1
            if (r1 == 0) goto L_0x0011
            int r1 = r7.f34357t     // Catch:{ all -> 0x0053 }
            goto L_0x0012
        L_0x0011:
            r1 = -1
        L_0x0012:
            int r3 = r7.f34357t     // Catch:{ all -> 0x0053 }
            r4 = 1
            int r3 = r3 + r4
            r7.f34357t = r3     // Catch:{ all -> 0x0053 }
            r7.f34360w = r4     // Catch:{ all -> 0x0053 }
            monitor-exit(r7)     // Catch:{ all -> 0x0053 }
            r3 = 0
            if (r1 == r2) goto L_0x0048
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "sent ping but didn't receive pong within "
            r2.append(r5)
            long r5 = r7.f34341d
            r2.append(r5)
            java.lang.String r5 = "ms (after "
            r2.append(r5)
            int r1 = r1 - r4
            r2.append(r1)
            java.lang.String r1 = " successful ping/pongs)"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            r7.mo38203a(r0, r3)
            return
        L_0x0048:
            okio.d r1 = okio.C13346d.f34617i     // Catch:{ IOException -> 0x004e }
            r0.mo38216a(r1)     // Catch:{ IOException -> 0x004e }
            goto L_0x0052
        L_0x004e:
            r0 = move-exception
            r7.mo38203a(r0, r3)
        L_0x0052:
            return
        L_0x0053:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0053 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p423ws.C13295b.mo38210d():void");
    }

    public void onReadClose(int i, String str) {
        Closeable closeable;
        if (i != -1) {
            synchronized (this) {
                if (this.f34354q == -1) {
                    this.f34354q = i;
                    this.f34355r = str;
                    if (!this.f34352o || !this.f34350m.isEmpty()) {
                        closeable = null;
                    } else {
                        closeable = this.f34348k;
                        this.f34348k = null;
                        if (this.f34353p != null) {
                            this.f34353p.cancel(false);
                        }
                        this.f34347j.shutdown();
                    }
                } else {
                    throw new IllegalStateException("already closed");
                }
            }
            try {
                this.f34339b.mo37861b(this, i, str);
                if (closeable != null) {
                    this.f34339b.mo37856a((WebSocket) this, i, str);
                }
            } finally {
                C13184e.m34503a(closeable);
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void onReadMessage(String str) throws IOException {
        this.f34339b.mo37857a((WebSocket) this, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0023, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void onReadPing(okio.C13346d r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f34356s     // Catch:{ all -> 0x0024 }
            if (r0 != 0) goto L_0x0022
            boolean r0 = r1.f34352o     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0012
            java.util.ArrayDeque<java.lang.Object> r0 = r1.f34350m     // Catch:{ all -> 0x0024 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0012
            goto L_0x0022
        L_0x0012:
            java.util.ArrayDeque<okio.d> r0 = r1.f34349l     // Catch:{ all -> 0x0024 }
            r0.add(r2)     // Catch:{ all -> 0x0024 }
            r1.m35018e()     // Catch:{ all -> 0x0024 }
            int r2 = r1.f34358u     // Catch:{ all -> 0x0024 }
            int r2 = r2 + 1
            r1.f34358u = r2     // Catch:{ all -> 0x0024 }
            monitor-exit(r1)
            return
        L_0x0022:
            monitor-exit(r1)
            return
        L_0x0024:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p423ws.C13295b.onReadPing(okio.d):void");
    }

    public synchronized void onReadPong(C13346d dVar) {
        this.f34359v++;
        this.f34360w = false;
    }

    public synchronized long queueSize() {
        return this.f34351n;
    }

    public C13331y request() {
        return this.f34338a;
    }

    public boolean send(String str) {
        if (str != null) {
            return m35017a(C13346d.m35334d(str), 1);
        }
        throw new NullPointerException("text == null");
    }

    public void onReadMessage(C13346d dVar) throws IOException {
        this.f34339b.mo37860a((WebSocket) this, dVar);
    }

    /* renamed from: a */
    public void mo38206a(C13325v vVar) {
        C13327b r = vVar.mo38347r();
        r.mo38361a(EventListener.f33789a);
        r.mo38369b(f34337x);
        C13325v a = r.mo38367a();
        C13332a f = this.f34338a.mo38388f();
        String str = "Upgrade";
        f.mo38403b(str, "websocket");
        f.mo38403b("Connection", str);
        f.mo38403b("Sec-WebSocket-Key", this.f34342e);
        f.mo38403b("Sec-WebSocket-Version", "13");
        C13331y a2 = f.mo38400a();
        this.f34343f = C13182c.f33853a.mo37865a(a, a2);
        this.f34343f.enqueue(new C13296a(a2));
    }

    public boolean send(C13346d dVar) {
        if (dVar != null) {
            return m35017a(dVar, 2);
        }
        throw new NullPointerException("bytes == null");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38205a(C13167a0 a0Var, C13231d dVar) throws IOException {
        String str = "'";
        if (a0Var.mo37793d() == 101) {
            String a = a0Var.mo37787a("Connection");
            String str2 = "Upgrade";
            if (str2.equalsIgnoreCase(a)) {
                String a2 = a0Var.mo37787a(str2);
                if ("websocket".equalsIgnoreCase(a2)) {
                    String a3 = a0Var.mo37787a("Sec-WebSocket-Accept");
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f34342e);
                    sb.append("258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
                    String a4 = C13346d.m35334d(sb.toString()).mo38525e().mo38515a();
                    if (!a4.equals(a3)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Expected 'Sec-WebSocket-Accept' header value '");
                        sb2.append(a4);
                        sb2.append("' but was '");
                        sb2.append(a3);
                        sb2.append(str);
                        throw new ProtocolException(sb2.toString());
                    } else if (dVar == null) {
                        throw new ProtocolException("Web Socket exchange missing: bad interceptor?");
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Expected 'Upgrade' header value 'websocket' but was '");
                    sb3.append(a2);
                    sb3.append(str);
                    throw new ProtocolException(sb3.toString());
                }
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Expected 'Connection' header value 'Upgrade' but was '");
                sb4.append(a);
                sb4.append(str);
                throw new ProtocolException(sb4.toString());
            }
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Expected HTTP 101 response but was '");
            sb5.append(a0Var.mo37793d());
            sb5.append(" ");
            sb5.append(a0Var.mo37797h());
            sb5.append(str);
            throw new ProtocolException(sb5.toString());
        }
    }

    /* renamed from: a */
    public void mo38204a(String str, C13301f fVar) throws IOException {
        synchronized (this) {
            this.f34348k = fVar;
            this.f34346i = new C13303d(fVar.f34370e, fVar.f34372g, this.f34340c);
            this.f34347j = new ScheduledThreadPoolExecutor(1, C13184e.m34500a(str, false));
            if (this.f34341d != 0) {
                this.f34347j.scheduleAtFixedRate(new C13300e(), this.f34341d, this.f34341d, TimeUnit.MILLISECONDS);
            }
            if (!this.f34350m.isEmpty()) {
                m35018e();
            }
        }
        this.f34345h = new WebSocketReader(fVar.f34370e, fVar.f34371f, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean m35017a(okio.C13346d r7, int r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.f34356s     // Catch:{ all -> 0x003e }
            r1 = 0
            if (r0 != 0) goto L_0x003c
            boolean r0 = r6.f34352o     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x000b
            goto L_0x003c
        L_0x000b:
            long r2 = r6.f34351n     // Catch:{ all -> 0x003e }
            int r0 = r7.mo38528g()     // Catch:{ all -> 0x003e }
            long r4 = (long) r0     // Catch:{ all -> 0x003e }
            long r2 = r2 + r4
            r4 = 16777216(0x1000000, double:8.289046E-317)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0022
            r7 = 1001(0x3e9, float:1.403E-42)
            r8 = 0
            r6.close(r7, r8)     // Catch:{ all -> 0x003e }
            monitor-exit(r6)
            return r1
        L_0x0022:
            long r0 = r6.f34351n     // Catch:{ all -> 0x003e }
            int r2 = r7.mo38528g()     // Catch:{ all -> 0x003e }
            long r2 = (long) r2     // Catch:{ all -> 0x003e }
            long r0 = r0 + r2
            r6.f34351n = r0     // Catch:{ all -> 0x003e }
            java.util.ArrayDeque<java.lang.Object> r0 = r6.f34350m     // Catch:{ all -> 0x003e }
            okhttp3.internal.ws.b$d r1 = new okhttp3.internal.ws.b$d     // Catch:{ all -> 0x003e }
            r1.<init>(r8, r7)     // Catch:{ all -> 0x003e }
            r0.add(r1)     // Catch:{ all -> 0x003e }
            r6.m35018e()     // Catch:{ all -> 0x003e }
            r7 = 1
            monitor-exit(r6)
            return r7
        L_0x003c:
            monitor-exit(r6)
            return r1
        L_0x003e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p423ws.C13295b.m35017a(okio.d, int):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public synchronized boolean mo38207a(int i, String str, long j) {
        C13302c.m35030b(i);
        C13346d dVar = null;
        if (str != null) {
            dVar = C13346d.m35334d(str);
            if (((long) dVar.mo38528g()) > 123) {
                StringBuilder sb = new StringBuilder();
                sb.append("reason.size() > 123: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (!this.f34356s) {
            if (!this.f34352o) {
                this.f34352o = true;
                this.f34350m.add(new C13298c(i, dVar, j));
                m35018e();
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r3.f34339b.mo37858a((okhttp3.WebSocket) r3, (java.lang.Throwable) r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002d, code lost:
        okhttp3.p418f0.C13184e.m34503a((java.io.Closeable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        throw r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo38203a(java.lang.Exception r4, okhttp3.C13167a0 r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f34356s     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            return
        L_0x0007:
            r0 = 1
            r3.f34356s = r0     // Catch:{ all -> 0x0031 }
            okhttp3.internal.ws.b$f r0 = r3.f34348k     // Catch:{ all -> 0x0031 }
            r1 = 0
            r3.f34348k = r1     // Catch:{ all -> 0x0031 }
            java.util.concurrent.ScheduledFuture<?> r1 = r3.f34353p     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x0019
            java.util.concurrent.ScheduledFuture<?> r1 = r3.f34353p     // Catch:{ all -> 0x0031 }
            r2 = 0
            r1.cancel(r2)     // Catch:{ all -> 0x0031 }
        L_0x0019:
            java.util.concurrent.ScheduledExecutorService r1 = r3.f34347j     // Catch:{ all -> 0x0031 }
            if (r1 == 0) goto L_0x0022
            java.util.concurrent.ScheduledExecutorService r1 = r3.f34347j     // Catch:{ all -> 0x0031 }
            r1.shutdown()     // Catch:{ all -> 0x0031 }
        L_0x0022:
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            okhttp3.e0 r1 = r3.f34339b     // Catch:{ all -> 0x002c }
            r1.mo37858a(r3, r4, r5)     // Catch:{ all -> 0x002c }
            okhttp3.p418f0.C13184e.m34503a(r0)
            return
        L_0x002c:
            r4 = move-exception
            okhttp3.p418f0.C13184e.m34503a(r0)
            throw r4
        L_0x0031:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p423ws.C13295b.mo38203a(java.lang.Exception, okhttp3.a0):void");
    }
}
