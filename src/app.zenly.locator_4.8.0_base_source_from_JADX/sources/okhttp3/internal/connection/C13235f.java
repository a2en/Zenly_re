package okhttp3.internal.connection;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.C13167a0;
import okhttp3.C13167a0.C13168a;
import okhttp3.C13174c0;
import okhttp3.C13177e;
import okhttp3.C13316q;
import okhttp3.C13319s;
import okhttp3.C13325v;
import okhttp3.C13328w;
import okhttp3.C13331y;
import okhttp3.C13331y.C13332a;
import okhttp3.C13333z;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Interceptor.Chain;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http2.C13256a;
import okhttp3.internal.http2.C13262e;
import okhttp3.internal.http2.C13262e.C13269g;
import okhttp3.internal.http2.C13262e.C13270h;
import okhttp3.internal.http2.C13277f;
import okhttp3.internal.http2.C13281h;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import okhttp3.internal.p423ws.C13295b.C13301f;
import okhttp3.internal.tls.C13293d;
import okhttp3.p418f0.C13182c;
import okhttp3.p418f0.C13184e;
import okhttp3.p418f0.C13185f;
import okhttp3.p418f0.p419g.C13186a;
import okhttp3.p418f0.p420h.C13202e;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.C13354l;

/* renamed from: okhttp3.internal.connection.f */
public final class C13235f extends C13270h implements Connection {

    /* renamed from: b */
    public final C13237g f34069b;

    /* renamed from: c */
    private final C13174c0 f34070c;

    /* renamed from: d */
    private Socket f34071d;

    /* renamed from: e */
    private Socket f34072e;

    /* renamed from: f */
    private C13316q f34073f;

    /* renamed from: g */
    private C13328w f34074g;

    /* renamed from: h */
    private C13262e f34075h;

    /* renamed from: i */
    private BufferedSource f34076i;

    /* renamed from: j */
    private BufferedSink f34077j;

    /* renamed from: k */
    boolean f34078k;

    /* renamed from: l */
    int f34079l;

    /* renamed from: m */
    int f34080m;

    /* renamed from: n */
    private int f34081n;

    /* renamed from: o */
    private int f34082o = 1;

    /* renamed from: p */
    final List<Reference<C13241j>> f34083p = new ArrayList();

    /* renamed from: q */
    long f34084q = Long.MAX_VALUE;

    /* renamed from: okhttp3.internal.connection.f$a */
    class C13236a extends C13301f {

        /* renamed from: h */
        final /* synthetic */ C13231d f34085h;

        C13236a(C13235f fVar, boolean z, BufferedSource bufferedSource, BufferedSink bufferedSink, C13231d dVar) {
            this.f34085h = dVar;
            super(z, bufferedSource, bufferedSink);
        }

        public void close() throws IOException {
            this.f34085h.mo38002a(-1, true, true, null);
        }
    }

    public C13235f(C13237g gVar, C13174c0 c0Var) {
        this.f34069b = gVar;
        this.f34070c = c0Var;
    }

    /* renamed from: d */
    private C13331y m34728d() throws IOException {
        C13332a aVar = new C13332a();
        aVar.mo38398a(this.f34070c.mo37833a().mo37854k());
        aVar.mo38395a("CONNECT", (C13333z) null);
        aVar.mo38403b("Host", C13184e.m34491a(this.f34070c.mo37833a().mo37854k(), true));
        aVar.mo38403b("Proxy-Connection", "Keep-Alive");
        aVar.mo38403b("User-Agent", C13185f.m34521a());
        C13331y a = aVar.mo38400a();
        C13168a aVar2 = new C13168a();
        aVar2.mo37815a(a);
        aVar2.mo37814a(C13328w.HTTP_1_1);
        aVar2.mo37806a(407);
        aVar2.mo37808a("Preemptive Authenticate");
        aVar2.mo37811a(C13184e.f33858d);
        aVar2.mo37818b(-1);
        aVar2.mo37807a(-1);
        aVar2.mo37819b("Proxy-Authenticate", "OkHttp-Preemptive");
        C13331y authenticate = this.f34070c.mo37833a().mo37849g().authenticate(this.f34070c, aVar2.mo37816a());
        return authenticate != null ? authenticate : a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0143 A[EDGE_INSN: B:63:0x0143->B:56:0x0143 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo38029a(int r17, int r18, int r19, int r20, boolean r21, okhttp3.Call r22, okhttp3.EventListener r23) {
        /*
            r16 = this;
            r7 = r16
            r8 = r22
            r9 = r23
            okhttp3.w r0 = r7.f34074g
            if (r0 != 0) goto L_0x0151
            okhttp3.c0 r0 = r7.f34070c
            okhttp3.e r0 = r0.mo37833a()
            java.util.List r0 = r0.mo37843b()
            okhttp3.internal.connection.c r10 = new okhttp3.internal.connection.c
            r10.<init>(r0)
            okhttp3.c0 r1 = r7.f34070c
            okhttp3.e r1 = r1.mo37833a()
            javax.net.ssl.SSLSocketFactory r1 = r1.mo37853j()
            if (r1 != 0) goto L_0x0074
            okhttp3.l r1 = okhttp3.C13307l.f34412i
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0067
            okhttp3.c0 r0 = r7.f34070c
            okhttp3.e r0 = r0.mo37833a()
            okhttp3.s r0 = r0.mo37854k()
            java.lang.String r0 = r0.mo38288g()
            okhttp3.f0.h.e r1 = okhttp3.p418f0.p420h.C13202e.m34581d()
            boolean r1 = r1.mo37904b(r0)
            if (r1 == 0) goto L_0x0046
            goto L_0x0086
        L_0x0046:
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0067:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0074:
            okhttp3.c0 r0 = r7.f34070c
            okhttp3.e r0 = r0.mo37833a()
            java.util.List r0 = r0.mo37846e()
            okhttp3.w r1 = okhttp3.C13328w.H2_PRIOR_KNOWLEDGE
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0144
        L_0x0086:
            r11 = 0
            r12 = r11
        L_0x0088:
            okhttp3.c0 r0 = r7.f34070c     // Catch:{ IOException -> 0x00f9 }
            boolean r0 = r0.mo37835c()     // Catch:{ IOException -> 0x00f9 }
            if (r0 == 0) goto L_0x00a9
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r22
            r6 = r23
            r1.m34723a(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x00f9 }
            java.net.Socket r0 = r7.f34071d     // Catch:{ IOException -> 0x00f9 }
            if (r0 != 0) goto L_0x00a4
            goto L_0x00c6
        L_0x00a4:
            r13 = r17
            r14 = r18
            goto L_0x00b0
        L_0x00a9:
            r13 = r17
            r14 = r18
            r7.m34724a(r13, r14, r8, r9)     // Catch:{ IOException -> 0x00f7 }
        L_0x00b0:
            r15 = r20
            r7.m34726a(r10, r15, r8, r9)     // Catch:{ IOException -> 0x00f5 }
            okhttp3.c0 r0 = r7.f34070c     // Catch:{ IOException -> 0x00f5 }
            java.net.InetSocketAddress r0 = r0.mo37836d()     // Catch:{ IOException -> 0x00f5 }
            okhttp3.c0 r1 = r7.f34070c     // Catch:{ IOException -> 0x00f5 }
            java.net.Proxy r1 = r1.mo37834b()     // Catch:{ IOException -> 0x00f5 }
            okhttp3.w r2 = r7.f34074g     // Catch:{ IOException -> 0x00f5 }
            r9.mo37753a(r8, r0, r1, r2)     // Catch:{ IOException -> 0x00f5 }
        L_0x00c6:
            okhttp3.c0 r0 = r7.f34070c
            boolean r0 = r0.mo37835c()
            if (r0 == 0) goto L_0x00e0
            java.net.Socket r0 = r7.f34071d
            if (r0 == 0) goto L_0x00d3
            goto L_0x00e0
        L_0x00d3:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Too many tunnel connections attempted: 21"
            r0.<init>(r1)
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            r1.<init>(r0)
            throw r1
        L_0x00e0:
            okhttp3.internal.http2.e r0 = r7.f34075h
            if (r0 == 0) goto L_0x00f4
            okhttp3.internal.connection.g r1 = r7.f34069b
            monitor-enter(r1)
            okhttp3.internal.http2.e r0 = r7.f34075h     // Catch:{ all -> 0x00f1 }
            int r0 = r0.mo38105b()     // Catch:{ all -> 0x00f1 }
            r7.f34082o = r0     // Catch:{ all -> 0x00f1 }
            monitor-exit(r1)     // Catch:{ all -> 0x00f1 }
            goto L_0x00f4
        L_0x00f1:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00f1 }
            throw r0
        L_0x00f4:
            return
        L_0x00f5:
            r0 = move-exception
            goto L_0x0100
        L_0x00f7:
            r0 = move-exception
            goto L_0x00fe
        L_0x00f9:
            r0 = move-exception
            r13 = r17
            r14 = r18
        L_0x00fe:
            r15 = r20
        L_0x0100:
            java.net.Socket r1 = r7.f34072e
            okhttp3.p418f0.C13184e.m34505a(r1)
            java.net.Socket r1 = r7.f34071d
            okhttp3.p418f0.C13184e.m34505a(r1)
            r7.f34072e = r11
            r7.f34071d = r11
            r7.f34076i = r11
            r7.f34077j = r11
            r7.f34073f = r11
            r7.f34074g = r11
            r7.f34075h = r11
            okhttp3.c0 r1 = r7.f34070c
            java.net.InetSocketAddress r3 = r1.mo37836d()
            okhttp3.c0 r1 = r7.f34070c
            java.net.Proxy r4 = r1.mo37834b()
            r5 = 0
            r1 = r23
            r2 = r22
            r6 = r0
            r1.mo37754a(r2, r3, r4, r5, r6)
            if (r12 != 0) goto L_0x0136
            okhttp3.internal.connection.RouteException r1 = new okhttp3.internal.connection.RouteException
            r1.<init>(r0)
            r12 = r1
            goto L_0x0139
        L_0x0136:
            r12.mo37997a(r0)
        L_0x0139:
            if (r21 == 0) goto L_0x0143
            boolean r0 = r10.mo38001a(r0)
            if (r0 == 0) goto L_0x0143
            goto L_0x0088
        L_0x0143:
            throw r12
        L_0x0144:
            okhttp3.internal.connection.RouteException r0 = new okhttp3.internal.connection.RouteException
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0151:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C13235f.mo38029a(int, int, int, int, boolean, okhttp3.Call, okhttp3.EventListener):void");
    }

    /* renamed from: b */
    public boolean mo38036b() {
        return this.f34075h != null;
    }

    /* renamed from: c */
    public void mo38037c() {
        synchronized (this.f34069b) {
            this.f34078k = true;
        }
    }

    public C13316q handshake() {
        return this.f34073f;
    }

    public C13328w protocol() {
        return this.f34074g;
    }

    public C13174c0 route() {
        return this.f34070c;
    }

    public Socket socket() {
        return this.f34072e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.f34070c.mo37833a().mo37854k().mo38288g());
        sb.append(":");
        sb.append(this.f34070c.mo37833a().mo37854k().mo38293k());
        sb.append(", proxy=");
        sb.append(this.f34070c.mo37834b());
        sb.append(" hostAddress=");
        sb.append(this.f34070c.mo37836d());
        sb.append(" cipherSuite=");
        C13316q qVar = this.f34073f;
        sb.append(qVar != null ? qVar.mo38253a() : "none");
        sb.append(" protocol=");
        sb.append(this.f34074g);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    private void m34723a(int i, int i2, int i3, Call call, EventListener eventListener) throws IOException {
        C13331y d = m34728d();
        C13319s g = d.mo38389g();
        int i4 = 0;
        while (i4 < 21) {
            m34724a(i, i2, call, eventListener);
            d = m34721a(i2, i3, d, g);
            if (d != null) {
                C13184e.m34505a(this.f34071d);
                this.f34071d = null;
                this.f34077j = null;
                this.f34076i = null;
                eventListener.mo37753a(call, this.f34070c.mo37836d(), this.f34070c.mo37834b(), null);
                i4++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m34724a(int i, int i2, Call call, EventListener eventListener) throws IOException {
        Socket socket;
        Proxy b = this.f34070c.mo37834b();
        C13177e a = this.f34070c.mo37833a();
        if (b.type() == Type.DIRECT || b.type() == Type.HTTP) {
            socket = a.mo37852i().createSocket();
        } else {
            socket = new Socket(b);
        }
        this.f34071d = socket;
        eventListener.mo37752a(call, this.f34070c.mo37836d(), b);
        this.f34071d.setSoTimeout(i2);
        try {
            C13202e.m34581d().mo37899a(this.f34071d, this.f34070c.mo37836d(), i);
            try {
                this.f34076i = C13354l.m35375a(C13354l.m35385b(this.f34071d));
                this.f34077j = C13354l.m35374a(C13354l.m35380a(this.f34071d));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to connect to ");
            sb.append(this.f34070c.mo37836d());
            ConnectException connectException = new ConnectException(sb.toString());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* renamed from: a */
    private void m34726a(C13230c cVar, int i, Call call, EventListener eventListener) throws IOException {
        if (this.f34070c.mo37833a().mo37853j() != null) {
            eventListener.mo37768g(call);
            m34725a(cVar);
            eventListener.mo37757a(call, this.f34073f);
            if (this.f34074g == C13328w.HTTP_2) {
                m34722a(i);
            }
        } else if (this.f34070c.mo37833a().mo37846e().contains(C13328w.H2_PRIOR_KNOWLEDGE)) {
            this.f34072e = this.f34071d;
            this.f34074g = C13328w.H2_PRIOR_KNOWLEDGE;
            m34722a(i);
        } else {
            this.f34072e = this.f34071d;
            this.f34074g = C13328w.HTTP_1_1;
        }
    }

    /* renamed from: a */
    private void m34722a(int i) throws IOException {
        this.f34072e.setSoTimeout(0);
        C13269g gVar = new C13269g(true);
        gVar.mo38114a(this.f34072e, this.f34070c.mo37833a().mo37854k().mo38288g(), this.f34076i, this.f34077j);
        gVar.mo38115a((C13270h) this);
        gVar.mo38113a(i);
        this.f34075h = gVar.mo38116a();
        this.f34075h.mo38109c();
    }

    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0139 A[Catch:{ all -> 0x012f }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x013f A[Catch:{ all -> 0x012f }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0142  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m34725a(okhttp3.internal.connection.C13230c r8) throws java.io.IOException {
        /*
            r7 = this;
            okhttp3.c0 r0 = r7.f34070c
            okhttp3.e r0 = r0.mo37833a()
            javax.net.ssl.SSLSocketFactory r1 = r0.mo37853j()
            r2 = 0
            java.net.Socket r3 = r7.f34071d     // Catch:{ AssertionError -> 0x0132 }
            okhttp3.s r4 = r0.mo37854k()     // Catch:{ AssertionError -> 0x0132 }
            java.lang.String r4 = r4.mo38288g()     // Catch:{ AssertionError -> 0x0132 }
            okhttp3.s r5 = r0.mo37854k()     // Catch:{ AssertionError -> 0x0132 }
            int r5 = r5.mo38293k()     // Catch:{ AssertionError -> 0x0132 }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ AssertionError -> 0x0132 }
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ AssertionError -> 0x0132 }
            okhttp3.l r8 = r8.mo38000a(r1)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            boolean r3 = r8.mo38224c()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            if (r3 == 0) goto L_0x0041
            okhttp3.f0.h.e r3 = okhttp3.p418f0.p420h.C13202e.m34581d()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            okhttp3.s r4 = r0.mo37854k()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.String r4 = r4.mo38288g()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.util.List r5 = r0.mo37846e()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            r3.mo37900a(r1, r4, r5)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        L_0x0041:
            r1.startHandshake()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            okhttp3.q r4 = okhttp3.C13316q.m35089a(r3)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            javax.net.ssl.HostnameVerifier r5 = r0.mo37845d()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            okhttp3.s r6 = r0.mo37854k()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.String r6 = r6.mo38288g()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            boolean r3 = r5.verify(r6, r3)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            if (r3 != 0) goto L_0x00d8
            java.util.List r8 = r4.mo38255c()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            boolean r2 = r8.isEmpty()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.String r3 = "Hostname "
            if (r2 != 0) goto L_0x00b6
            r2 = 0
            java.lang.Object r8 = r8.get(r2)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            javax.net.ssl.SSLPeerUnverifiedException r2 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            r4.<init>()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            r4.append(r3)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            okhttp3.s r0 = r0.mo37854k()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.String r0 = r0.mo38288g()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            r4.append(r0)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.String r0 = " not verified:\n    certificate: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.String r0 = okhttp3.C13213i.m34633a(r8)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            r4.append(r0)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.String r0 = "\n    DN: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.security.Principal r0 = r8.getSubjectDN()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.String r0 = r0.getName()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            r4.append(r0)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.String r0 = "\n    subjectAltNames: "
            r4.append(r0)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.util.List r8 = okhttp3.internal.tls.C13293d.m35005a(r8)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            r4.append(r8)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.String r8 = r4.toString()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            r2.<init>(r8)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            throw r2     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        L_0x00b6:
            javax.net.ssl.SSLPeerUnverifiedException r8 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            r2.<init>()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            r2.append(r3)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            okhttp3.s r0 = r0.mo37854k()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.String r0 = r0.mo38288g()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            r2.append(r0)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.String r0 = " not verified (no certificates)"
            r2.append(r0)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.String r0 = r2.toString()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            r8.<init>(r0)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            throw r8     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        L_0x00d8:
            okhttp3.i r3 = r0.mo37841a()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            okhttp3.s r0 = r0.mo37854k()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.String r0 = r0.mo38288g()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.util.List r5 = r4.mo38255c()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            r3.mo37959a(r0, r5)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            boolean r8 = r8.mo38224c()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            if (r8 == 0) goto L_0x00f9
            okhttp3.f0.h.e r8 = okhttp3.p418f0.p420h.C13202e.m34581d()     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.lang.String r2 = r8.mo37901b(r1)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        L_0x00f9:
            r7.f34072e = r1     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.net.Socket r8 = r7.f34072e     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            okio.Source r8 = okio.C13354l.m35385b(r8)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            okio.BufferedSource r8 = okio.C13354l.m35375a(r8)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            r7.f34076i = r8     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            java.net.Socket r8 = r7.f34072e     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            okio.Sink r8 = okio.C13354l.m35380a(r8)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            okio.BufferedSink r8 = okio.C13354l.m35374a(r8)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            r7.f34077j = r8     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            r7.f34073f = r4     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            if (r2 == 0) goto L_0x011c
            okhttp3.w r8 = okhttp3.C13328w.m35246a(r2)     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            goto L_0x011e
        L_0x011c:
            okhttp3.w r8 = okhttp3.C13328w.HTTP_1_1     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
        L_0x011e:
            r7.f34074g = r8     // Catch:{ AssertionError -> 0x012c, all -> 0x012a }
            if (r1 == 0) goto L_0x0129
            okhttp3.f0.h.e r8 = okhttp3.p418f0.p420h.C13202e.m34581d()
            r8.mo37915a(r1)
        L_0x0129:
            return
        L_0x012a:
            r8 = move-exception
            goto L_0x0140
        L_0x012c:
            r8 = move-exception
            r2 = r1
            goto L_0x0133
        L_0x012f:
            r8 = move-exception
            r1 = r2
            goto L_0x0140
        L_0x0132:
            r8 = move-exception
        L_0x0133:
            boolean r0 = okhttp3.p418f0.C13184e.m34506a(r8)     // Catch:{ all -> 0x012f }
            if (r0 == 0) goto L_0x013f
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x012f }
            r0.<init>(r8)     // Catch:{ all -> 0x012f }
            throw r0     // Catch:{ all -> 0x012f }
        L_0x013f:
            throw r8     // Catch:{ all -> 0x012f }
        L_0x0140:
            if (r1 == 0) goto L_0x0149
            okhttp3.f0.h.e r0 = okhttp3.p418f0.p420h.C13202e.m34581d()
            r0.mo37915a(r1)
        L_0x0149:
            okhttp3.p418f0.C13184e.m34505a(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C13235f.m34725a(okhttp3.internal.connection.c):void");
    }

    /* renamed from: a */
    private C13331y m34721a(int i, int i2, C13331y yVar, C13319s sVar) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("CONNECT ");
        sb.append(C13184e.m34491a(sVar, true));
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        while (true) {
            C13186a aVar = new C13186a(null, null, this.f34076i, this.f34077j);
            this.f34076i.timeout().mo38542a((long) i, TimeUnit.MILLISECONDS);
            this.f34077j.timeout().mo38542a((long) i2, TimeUnit.MILLISECONDS);
            aVar.mo37876a(yVar.mo38385c(), sb2);
            aVar.finishRequest();
            C13168a readResponseHeaders = aVar.readResponseHeaders(false);
            readResponseHeaders.mo37815a(yVar);
            C13167a0 a = readResponseHeaders.mo37816a();
            aVar.mo37875a(a);
            int d = a.mo37793d();
            if (d != 200) {
                if (d == 407) {
                    C13331y authenticate = this.f34070c.mo37833a().mo37849g().authenticate(this.f34070c, a);
                    if (authenticate != null) {
                        if ("close".equalsIgnoreCase(a.mo37787a("Connection"))) {
                            return authenticate;
                        }
                        yVar = authenticate;
                    } else {
                        throw new IOException("Failed to authenticate with proxy");
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Unexpected response code for CONNECT: ");
                    sb3.append(a.mo37793d());
                    throw new IOException(sb3.toString());
                }
            } else if (this.f34076i.getBuffer().exhausted() && this.f34077j.buffer().exhausted()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo38033a(C13177e eVar, List<C13174c0> list) {
        if (this.f34083p.size() >= this.f34082o || this.f34078k || !C13182c.f33853a.mo37872a(this.f34070c.mo37833a(), eVar)) {
            return false;
        }
        if (eVar.mo37854k().mo38288g().equals(route().mo37833a().mo37854k().mo38288g())) {
            return true;
        }
        if (this.f34075h == null || list == null || !m34727a(list) || eVar.mo37845d() != C13293d.f34323a || !mo38034a(eVar.mo37854k())) {
            return false;
        }
        try {
            eVar.mo37841a().mo37959a(eVar.mo37854k().mo38288g(), handshake().mo38255c());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private boolean m34727a(List<C13174c0> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C13174c0 c0Var = (C13174c0) list.get(i);
            if (c0Var.mo37834b().type() == Type.DIRECT && this.f34070c.mo37834b().type() == Type.DIRECT && this.f34070c.mo37836d().equals(c0Var.mo37836d())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo38034a(C13319s sVar) {
        if (sVar.mo38293k() != this.f34070c.mo37833a().mo37854k().mo38293k()) {
            return false;
        }
        boolean z = true;
        if (!sVar.mo38288g().equals(this.f34070c.mo37833a().mo37854k().mo38288g()) && (this.f34073f == null || !C13293d.f34323a.mo38193a(sVar.mo38288g(), (X509Certificate) this.f34073f.mo38255c().get(0)))) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public ExchangeCodec mo38026a(C13325v vVar, Chain chain) throws SocketException {
        C13262e eVar = this.f34075h;
        if (eVar != null) {
            return new C13277f(vVar, this, chain, eVar);
        }
        this.f34072e.setSoTimeout(chain.readTimeoutMillis());
        this.f34076i.timeout().mo38542a((long) chain.readTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.f34077j.timeout().mo38542a((long) chain.writeTimeoutMillis(), TimeUnit.MILLISECONDS);
        return new C13186a(vVar, this, this.f34076i, this.f34077j);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C13301f mo38027a(C13231d dVar) throws SocketException {
        this.f34072e.setSoTimeout(0);
        mo38037c();
        C13236a aVar = new C13236a(this, true, this.f34076i, this.f34077j, dVar);
        return aVar;
    }

    /* renamed from: a */
    public void mo38028a() {
        C13184e.m34505a(this.f34071d);
    }

    /* renamed from: a */
    public boolean mo38035a(boolean z) {
        int soTimeout;
        if (this.f34072e.isClosed() || this.f34072e.isInputShutdown() || this.f34072e.isOutputShutdown()) {
            return false;
        }
        C13262e eVar = this.f34075h;
        if (eVar != null) {
            return !eVar.mo38104a();
        }
        if (z) {
            try {
                soTimeout = this.f34072e.getSoTimeout();
                this.f34072e.setSoTimeout(1);
                if (this.f34076i.exhausted()) {
                    this.f34072e.setSoTimeout(soTimeout);
                    return false;
                }
                this.f34072e.setSoTimeout(soTimeout);
                return true;
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            } catch (Throwable th) {
                this.f34072e.setSoTimeout(soTimeout);
                throw th;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void mo38032a(C13281h hVar) throws IOException {
        hVar.mo38133a(C13256a.REFUSED_STREAM, (IOException) null);
    }

    /* renamed from: a */
    public void mo38031a(C13262e eVar) {
        synchronized (this.f34069b) {
            this.f34082o = eVar.mo38105b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38030a(IOException iOException) {
        synchronized (this.f34069b) {
            if (iOException instanceof StreamResetException) {
                C13256a aVar = ((StreamResetException) iOException).f34144e;
                if (aVar == C13256a.REFUSED_STREAM) {
                    this.f34081n++;
                    if (this.f34081n > 1) {
                        this.f34078k = true;
                        this.f34079l++;
                    }
                } else if (aVar != C13256a.CANCEL) {
                    this.f34078k = true;
                    this.f34079l++;
                }
            } else if (!mo38036b() || (iOException instanceof ConnectionShutdownException)) {
                this.f34078k = true;
                if (this.f34080m == 0) {
                    if (iOException != null) {
                        this.f34069b.mo38042a(this.f34070c, iOException);
                    }
                    this.f34079l++;
                }
            }
        }
    }
}
