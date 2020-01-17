package com.segment.analytics;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.JsonWriter;
import com.segment.analytics.integrations.C11649a;
import com.segment.analytics.integrations.C11650b;
import com.segment.analytics.integrations.C11654c;
import com.segment.analytics.integrations.C11655d;
import com.segment.analytics.integrations.C11657e;
import com.segment.analytics.integrations.C11658f;
import com.segment.analytics.integrations.C11660g;
import com.segment.analytics.integrations.Integration;
import com.segment.analytics.integrations.Integration.Factory;
import com.segment.analytics.p326t.C11692b;
import com.segment.analytics.p326t.C11692b.C11695c;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.segment.analytics.o */
class C11674o extends Integration<Void> {

    /* renamed from: o */
    static final Factory f30266o = new C11675a();

    /* renamed from: p */
    static final Charset f30267p = Charset.forName("UTF-8");

    /* renamed from: a */
    private final Context f30268a;

    /* renamed from: b */
    private final C11662j f30269b;

    /* renamed from: c */
    private final C11624d f30270c;

    /* renamed from: d */
    private final int f30271d;

    /* renamed from: e */
    private final C11681p f30272e;

    /* renamed from: f */
    private final Handler f30273f;

    /* renamed from: g */
    private final HandlerThread f30274g;

    /* renamed from: h */
    private final C11657e f30275h;

    /* renamed from: i */
    private final Map<String, Boolean> f30276i;

    /* renamed from: j */
    private final C11621c f30277j;

    /* renamed from: k */
    private final ExecutorService f30278k;

    /* renamed from: l */
    private final ScheduledExecutorService f30279l;

    /* renamed from: m */
    final Object f30280m = new Object();

    /* renamed from: n */
    private final C11630f f30281n;

    /* renamed from: com.segment.analytics.o$a */
    static class C11675a implements Factory {
        C11675a() {
        }

        public Integration<?> create(C11685r rVar, Analytics analytics) {
            return C11674o.m30623a(analytics.mo34214a(), analytics.f30110j, analytics.f30111k, analytics.f30102b, analytics.f30103c, Collections.unmodifiableMap(analytics.f30122v), analytics.f30109i, analytics.f30118r, analytics.f30117q, analytics.mo34226b(), analytics.f30113m);
        }

        public String key() {
            return "Segment.io";
        }
    }

    /* renamed from: com.segment.analytics.o$b */
    class C11676b implements Runnable {
        C11676b() {
        }

        public void run() {
            C11674o.this.mo34319a();
        }
    }

    /* renamed from: com.segment.analytics.o$c */
    class C11677c implements Runnable {
        C11677c() {
        }

        public void run() {
            synchronized (C11674o.this.f30280m) {
                C11674o.this.mo34389c();
            }
        }
    }

    /* renamed from: com.segment.analytics.o$d */
    static class C11678d implements Closeable {

        /* renamed from: e */
        private final JsonWriter f30284e;

        /* renamed from: f */
        private final BufferedWriter f30285f;

        /* renamed from: g */
        private boolean f30286g = false;

        C11678d(OutputStream outputStream) {
            this.f30285f = new BufferedWriter(new OutputStreamWriter(outputStream));
            this.f30284e = new JsonWriter(this.f30285f);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C11678d mo34393a() throws IOException {
            this.f30284e.name("batch").beginArray();
            this.f30286g = false;
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C11678d mo34395b() throws IOException {
            this.f30284e.beginObject();
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public C11678d mo34396c() throws IOException {
            if (this.f30286g) {
                this.f30284e.endArray();
                return this;
            }
            throw new IOException("At least one payload must be provided.");
        }

        public void close() throws IOException {
            this.f30284e.close();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public C11678d mo34398d() throws IOException {
            this.f30284e.name("sentAt").value(C11692b.m30703a(new Date())).endObject();
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C11678d mo34394a(String str) throws IOException {
            if (this.f30286g) {
                this.f30285f.write(44);
            } else {
                this.f30286g = true;
            }
            this.f30285f.write(str);
            return this;
        }
    }

    /* renamed from: com.segment.analytics.o$e */
    static class C11679e implements C11663a {

        /* renamed from: a */
        final C11678d f30287a;

        /* renamed from: b */
        final C11630f f30288b;

        /* renamed from: c */
        int f30289c;

        /* renamed from: d */
        int f30290d;

        C11679e(C11678d dVar, C11630f fVar) {
            this.f30287a = dVar;
            this.f30288b = fVar;
        }

        public boolean read(InputStream inputStream, int i) throws IOException {
            this.f30288b.mo34297a(inputStream);
            int i2 = this.f30289c + i;
            if (i2 > 475000) {
                return false;
            }
            this.f30289c = i2;
            byte[] bArr = new byte[i];
            inputStream.read(bArr, 0, i);
            this.f30287a.mo34394a(new String(bArr, C11674o.f30267p));
            this.f30290d++;
            return true;
        }
    }

    /* renamed from: com.segment.analytics.o$f */
    static class C11680f extends Handler {

        /* renamed from: a */
        private final C11674o f30291a;

        C11680f(Looper looper, C11674o oVar) {
            super(looper);
            this.f30291a = oVar;
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.f30291a.mo34388a((C11650b) message.obj);
            } else if (i == 1) {
                this.f30291a.mo34390d();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown dispatcher message: ");
                sb.append(message.what);
                throw new AssertionError(sb.toString());
            }
        }
    }

    C11674o(Context context, C11624d dVar, C11621c cVar, ExecutorService executorService, C11662j jVar, C11681p pVar, Map<String, Boolean> map, long j, int i, C11657e eVar, C11630f fVar) {
        int i2 = i;
        this.f30268a = context;
        this.f30270c = dVar;
        this.f30278k = executorService;
        this.f30269b = jVar;
        this.f30272e = pVar;
        this.f30275h = eVar;
        this.f30276i = map;
        this.f30277j = cVar;
        this.f30271d = i2;
        this.f30279l = Executors.newScheduledThreadPool(1, new C11695c());
        this.f30281n = fVar;
        this.f30274g = new HandlerThread("Segment-SegmentDispatcher", 10);
        this.f30274g.start();
        this.f30273f = new C11680f(this.f30274g.getLooper(), this);
        this.f30279l.scheduleAtFixedRate(new C11676b(), jVar.size() >= i2 ? 0 : j, j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    static C11669m m30622a(File file, String str) throws IOException {
        C11692b.m30710a(file);
        File file2 = new File(file, str);
        try {
            return new C11669m(file2);
        } catch (IOException unused) {
            if (file2.delete()) {
                return new C11669m(file2);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Could not create queue file (");
            sb.append(str);
            sb.append(") in ");
            sb.append(file);
            sb.append(".");
            throw new IOException(sb.toString());
        }
    }

    /* renamed from: b */
    private void m30624b(C11650b bVar) {
        Handler handler = this.f30273f;
        handler.sendMessage(handler.obtainMessage(0, bVar));
    }

    /* renamed from: e */
    private boolean m30625e() {
        return this.f30269b.size() > 0 && C11692b.m30716b(this.f30268a);
    }

    /* JADX INFO: used method not loaded: com.segment.analytics.j.a(int):null, types can be incorrect */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0096, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0098, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x009a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r9.f30275h.mo34348a(r0, r2, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a2, code lost:
        com.segment.analytics.p326t.C11692b.m30709a((java.io.Closeable) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b4, code lost:
        r9.f30275h.mo34348a(r6, "Payloads were rejected by server. Marked for removal.", new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r9.f30269b.mo34362a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r2 = r9.f30275h;
        r7 = new java.lang.StringBuilder();
        r7.append(r1);
        r7.append(r5);
        r7.append(r0);
        r2.mo34348a(r6, r7.toString(), new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00dc, code lost:
        com.segment.analytics.p326t.C11692b.m30709a((java.io.Closeable) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00df, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00eb, code lost:
        com.segment.analytics.p326t.C11692b.m30709a((java.io.Closeable) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ee, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00c3 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009a A[ExcHandler: IOException (r0v3 'e' java.io.IOException A[CUSTOM_DECLARE]), PHI: r3 
      PHI: (r3v5 com.segment.analytics.d$c) = (r3v2 com.segment.analytics.d$c), (r3v7 com.segment.analytics.d$c), (r3v7 com.segment.analytics.d$c), (r3v7 com.segment.analytics.d$c) binds: [B:4:0x0018, B:5:?, B:6:0x0042, B:7:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:4:0x0018] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34389c() {
        /*
            r9 = this;
            java.lang.String r0 = " payload(s) from queue."
            java.lang.String r1 = "Unable to remove "
            java.lang.String r2 = "Error while uploading payloads"
            boolean r3 = r9.m30625e()
            if (r3 != 0) goto L_0x000d
            return
        L_0x000d:
            com.segment.analytics.integrations.e r3 = r9.f30275h
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = "Uploading payloads in queue to Segment."
            r3.mo34350c(r6, r5)
            r3 = 0
            com.segment.analytics.d r5 = r9.f30270c     // Catch:{ d -> 0x00a6, IOException -> 0x009a }
            com.segment.analytics.d$c r3 = r5.mo34291c()     // Catch:{ d -> 0x00a6, IOException -> 0x009a }
            com.segment.analytics.o$d r5 = new com.segment.analytics.o$d     // Catch:{ d -> 0x00a6, IOException -> 0x009a }
            java.io.OutputStream r6 = r3.f30199g     // Catch:{ d -> 0x00a6, IOException -> 0x009a }
            r5.<init>(r6)     // Catch:{ d -> 0x00a6, IOException -> 0x009a }
            r5.mo34395b()     // Catch:{ d -> 0x00a6, IOException -> 0x009a }
            r5.mo34393a()     // Catch:{ d -> 0x00a6, IOException -> 0x009a }
            com.segment.analytics.o$e r6 = new com.segment.analytics.o$e     // Catch:{ d -> 0x00a6, IOException -> 0x009a }
            com.segment.analytics.f r7 = r9.f30281n     // Catch:{ d -> 0x00a6, IOException -> 0x009a }
            r6.<init>(r5, r7)     // Catch:{ d -> 0x00a6, IOException -> 0x009a }
            com.segment.analytics.j r7 = r9.f30269b     // Catch:{ d -> 0x00a6, IOException -> 0x009a }
            r7.mo34363a(r6)     // Catch:{ d -> 0x00a6, IOException -> 0x009a }
            r5.mo34396c()     // Catch:{ d -> 0x00a6, IOException -> 0x009a }
            r5.mo34398d()     // Catch:{ d -> 0x00a6, IOException -> 0x009a }
            r5.close()     // Catch:{ d -> 0x00a6, IOException -> 0x009a }
            int r5 = r6.f30290d     // Catch:{ d -> 0x00a6, IOException -> 0x009a }
            r3.close()     // Catch:{ d -> 0x0096, IOException -> 0x009a }
            com.segment.analytics.p326t.C11692b.m30709a(r3)
            com.segment.analytics.j r2 = r9.f30269b     // Catch:{ IOException -> 0x007b }
            r2.mo34362a(r5)     // Catch:{ IOException -> 0x007b }
            com.segment.analytics.integrations.e r0 = r9.f30275h
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r1[r4] = r2
            r2 = 1
            com.segment.analytics.j r3 = r9.f30269b
            int r3 = r3.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "Uploaded %s payloads. %s remain in the queue."
            r0.mo34350c(r2, r1)
            com.segment.analytics.p r0 = r9.f30272e
            r0.mo34400a(r5)
            com.segment.analytics.j r0 = r9.f30269b
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x007a
            r9.mo34389c()
        L_0x007a:
            return
        L_0x007b:
            r2 = move-exception
            com.segment.analytics.integrations.e r3 = r9.f30275h
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r1)
            r6.append(r5)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r3.mo34348a(r2, r0, r1)
            return
        L_0x0096:
            r6 = move-exception
            goto L_0x00a8
        L_0x0098:
            r0 = move-exception
            goto L_0x00eb
        L_0x009a:
            r0 = move-exception
            com.segment.analytics.integrations.e r1 = r9.f30275h     // Catch:{ all -> 0x0098 }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0098 }
            r1.mo34348a(r0, r2, r4)     // Catch:{ all -> 0x0098 }
            com.segment.analytics.p326t.C11692b.m30709a(r3)
            return
        L_0x00a6:
            r6 = move-exception
            r5 = 0
        L_0x00a8:
            int r7 = r6.f30200e     // Catch:{ all -> 0x0098 }
            r8 = 400(0x190, float:5.6E-43)
            if (r7 < r8) goto L_0x00e0
            int r7 = r6.f30200e     // Catch:{ all -> 0x0098 }
            r8 = 500(0x1f4, float:7.0E-43)
            if (r7 >= r8) goto L_0x00e0
            com.segment.analytics.integrations.e r2 = r9.f30275h     // Catch:{ all -> 0x0098 }
            java.lang.String r7 = "Payloads were rejected by server. Marked for removal."
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ all -> 0x0098 }
            r2.mo34348a(r6, r7, r8)     // Catch:{ all -> 0x0098 }
            com.segment.analytics.j r2 = r9.f30269b     // Catch:{ IOException -> 0x00c3 }
            r2.mo34362a(r5)     // Catch:{ IOException -> 0x00c3 }
            goto L_0x00dc
        L_0x00c3:
            com.segment.analytics.integrations.e r2 = r9.f30275h     // Catch:{ all -> 0x0098 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0098 }
            r7.<init>()     // Catch:{ all -> 0x0098 }
            r7.append(r1)     // Catch:{ all -> 0x0098 }
            r7.append(r5)     // Catch:{ all -> 0x0098 }
            r7.append(r0)     // Catch:{ all -> 0x0098 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0098 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x0098 }
            r2.mo34348a(r6, r0, r1)     // Catch:{ all -> 0x0098 }
        L_0x00dc:
            com.segment.analytics.p326t.C11692b.m30709a(r3)
            return
        L_0x00e0:
            com.segment.analytics.integrations.e r0 = r9.f30275h     // Catch:{ all -> 0x0098 }
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ all -> 0x0098 }
            r0.mo34348a(r6, r2, r1)     // Catch:{ all -> 0x0098 }
            com.segment.analytics.p326t.C11692b.m30709a(r3)
            return
        L_0x00eb:
            com.segment.analytics.p326t.C11692b.m30709a(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.segment.analytics.C11674o.mo34389c():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo34390d() {
        if (m30625e()) {
            this.f30278k.submit(new C11677c());
        }
    }

    /* renamed from: a */
    static synchronized C11674o m30623a(Context context, C11624d dVar, C11621c cVar, ExecutorService executorService, C11681p pVar, Map<String, Boolean> map, String str, long j, int i, C11657e eVar, C11630f fVar) {
        C11662j jVar;
        C11674o oVar;
        synchronized (C11674o.class) {
            try {
                C11657e eVar2 = eVar;
                jVar = new C11665c(m30622a(context.getDir("segment-disk-queue", 0), str));
            } catch (IOException e) {
                eVar.mo34348a(e, "Could not create disk queue. Falling back to memory queue.", new Object[0]);
                jVar = new C11664b();
            }
            oVar = new C11674o(context, dVar, cVar, executorService, jVar, pVar, map, j, i, eVar, fVar);
        }
        return oVar;
    }

    /* renamed from: a */
    public void mo34274a(C11655d dVar) {
        m30624b(dVar);
    }

    /* renamed from: a */
    public void mo34322a(C11654c cVar) {
        m30624b(cVar);
    }

    /* renamed from: a */
    public void mo34275a(C11660g gVar) {
        m30624b(gVar);
    }

    /* renamed from: a */
    public void mo34321a(C11649a aVar) {
        m30624b(aVar);
    }

    /* renamed from: a */
    public void mo34323a(C11658f fVar) {
        m30624b(fVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo34388a(C11650b bVar) {
        C11685r b = bVar.mo34332b();
        LinkedHashMap linkedHashMap = new LinkedHashMap(b.size() + this.f30276i.size());
        linkedHashMap.putAll(b);
        linkedHashMap.putAll(this.f30276i);
        linkedHashMap.remove("Segment.io");
        C11685r rVar = new C11685r();
        rVar.putAll(bVar);
        rVar.put("integrations", (Object) linkedHashMap);
        if (this.f30269b.size() >= 1000) {
            synchronized (this.f30280m) {
                if (this.f30269b.size() >= 1000) {
                    this.f30275h.mo34349b("Queue is at max capacity (%s), removing oldest payload.", Integer.valueOf(this.f30269b.size()));
                    try {
                        this.f30269b.mo34362a(1);
                    } catch (IOException e) {
                        this.f30275h.mo34348a(e, "Unable to remove oldest payload from queue.", new Object[0]);
                        return;
                    }
                }
            }
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            this.f30281n.mo34298a((OutputStream) byteArrayOutputStream);
            this.f30277j.mo34285a((Map<?, ?>) rVar, (Writer) new OutputStreamWriter(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (byteArray == null || byteArray.length == 0 || byteArray.length > 15000) {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not serialize payload ");
                sb.append(rVar);
                throw new IOException(sb.toString());
            }
            this.f30269b.mo34364a(byteArray);
            this.f30275h.mo34350c("Enqueued %s payload. %s elements in the queue.", bVar, Integer.valueOf(this.f30269b.size()));
            if (this.f30269b.size() >= this.f30271d) {
                mo34390d();
            }
        } catch (IOException e2) {
            this.f30275h.mo34348a(e2, "Could not add payload %s to queue: %s.", rVar, this.f30269b);
        }
    }

    /* renamed from: a */
    public void mo34319a() {
        Handler handler = this.f30273f;
        handler.sendMessage(handler.obtainMessage(1));
    }
}
