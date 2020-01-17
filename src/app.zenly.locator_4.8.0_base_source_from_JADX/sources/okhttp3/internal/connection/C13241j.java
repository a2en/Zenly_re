package okhttp3.internal.connection;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.C13177e;
import okhttp3.C13213i;
import okhttp3.C13319s;
import okhttp3.C13325v;
import okhttp3.C13331y;
import okhttp3.Call;
import okhttp3.Connection;
import okhttp3.EventListener;
import okhttp3.Interceptor.Chain;
import okhttp3.p418f0.C13182c;
import okhttp3.p418f0.C13184e;
import okhttp3.p418f0.p420h.C13202e;
import okio.C13337a;
import okio.C13368t;

/* renamed from: okhttp3.internal.connection.j */
public final class C13241j {

    /* renamed from: a */
    private final C13325v f34104a;

    /* renamed from: b */
    private final C13237g f34105b;

    /* renamed from: c */
    private final Call f34106c;

    /* renamed from: d */
    private final EventListener f34107d;

    /* renamed from: e */
    private final C13337a f34108e = new C13242a();

    /* renamed from: f */
    private Object f34109f;

    /* renamed from: g */
    private C13331y f34110g;

    /* renamed from: h */
    private C13234e f34111h;

    /* renamed from: i */
    public C13235f f34112i;

    /* renamed from: j */
    private C13231d f34113j;

    /* renamed from: k */
    private boolean f34114k;

    /* renamed from: l */
    private boolean f34115l;

    /* renamed from: m */
    private boolean f34116m;

    /* renamed from: n */
    private boolean f34117n;

    /* renamed from: o */
    private boolean f34118o;

    /* renamed from: okhttp3.internal.connection.j$a */
    class C13242a extends C13337a {
        C13242a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public void mo38069i() {
            C13241j.this.mo38061c();
        }
    }

    /* renamed from: okhttp3.internal.connection.j$b */
    static final class C13243b extends WeakReference<C13241j> {

        /* renamed from: a */
        final Object f34120a;

        C13243b(C13241j jVar, Object obj) {
            super(jVar);
            this.f34120a = obj;
        }
    }

    public C13241j(C13325v vVar, Call call) {
        this.f34104a = vVar;
        this.f34105b = C13182c.f33853a.mo37867a(vVar.mo38335f());
        this.f34106c = call;
        this.f34107d = vVar.mo38340k().create(call);
        this.f34108e.mo38542a((long) vVar.mo38332c(), TimeUnit.MILLISECONDS);
    }

    /* renamed from: b */
    private IOException m34763b(IOException iOException) {
        if (this.f34117n || !this.f34108e.mo38478h()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* renamed from: a */
    public void mo38057a() {
        this.f34109f = C13202e.m34581d().mo37895a("response.body().close()");
        this.f34107d.mo37759b(this.f34106c);
    }

    /* renamed from: c */
    public void mo38061c() {
        C13231d dVar;
        C13235f fVar;
        synchronized (this.f34105b) {
            this.f34116m = true;
            dVar = this.f34113j;
            if (this.f34111h == null || this.f34111h.mo38021a() == null) {
                fVar = this.f34112i;
            } else {
                fVar = this.f34111h.mo38021a();
            }
        }
        if (dVar != null) {
            dVar.mo38006a();
        } else if (fVar != null) {
            fVar.mo38028a();
        }
    }

    /* renamed from: d */
    public void mo38062d() {
        synchronized (this.f34105b) {
            if (!this.f34118o) {
                this.f34113j = null;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    /* renamed from: e */
    public boolean mo38063e() {
        boolean z;
        synchronized (this.f34105b) {
            z = this.f34113j != null;
        }
        return z;
    }

    /* renamed from: f */
    public boolean mo38064f() {
        boolean z;
        synchronized (this.f34105b) {
            z = this.f34116m;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public Socket mo38065g() {
        int i = 0;
        int size = this.f34112i.f34083p.size();
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (((Reference) this.f34112i.f34083p.get(i)).get() == this) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            C13235f fVar = this.f34112i;
            fVar.f34083p.remove(i);
            this.f34112i = null;
            if (!fVar.f34083p.isEmpty()) {
                return null;
            }
            fVar.f34084q = System.nanoTime();
            if (this.f34105b.mo38044a(fVar)) {
                return fVar.socket();
            }
            return null;
        }
        throw new IllegalStateException();
    }

    /* renamed from: h */
    public C13368t mo38066h() {
        return this.f34108e;
    }

    /* renamed from: i */
    public void mo38067i() {
        if (!this.f34117n) {
            this.f34117n = true;
            this.f34108e.mo38478h();
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: j */
    public void mo38068j() {
        this.f34108e.mo38477g();
    }

    /* renamed from: a */
    public void mo38059a(C13331y yVar) {
        C13331y yVar2 = this.f34110g;
        if (yVar2 != null) {
            if (C13184e.m34508a(yVar2.mo38389g(), yVar.mo38389g()) && this.f34111h.mo38023b()) {
                return;
            }
            if (this.f34113j != null) {
                throw new IllegalStateException();
            } else if (this.f34111h != null) {
                m34761a((IOException) null, true);
                this.f34111h = null;
            }
        }
        this.f34110g = yVar;
        C13234e eVar = new C13234e(this, this.f34105b, m34762a(yVar.mo38389g()), this.f34106c, this.f34107d);
        this.f34111h = eVar;
    }

    /* renamed from: b */
    public boolean mo38060b() {
        return this.f34111h.mo38024c() && this.f34111h.mo38023b();
    }

    /* renamed from: a */
    private C13177e m34762a(C13319s sVar) {
        C13213i iVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (sVar.mo38289h()) {
            SSLSocketFactory A = this.f34104a.mo38328A();
            hostnameVerifier = this.f34104a.mo38343n();
            sSLSocketFactory = A;
            iVar = this.f34104a.mo38333d();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            iVar = null;
        }
        C13177e eVar = new C13177e(sVar.mo38288g(), sVar.mo38293k(), this.f34104a.mo38339j(), this.f34104a.mo38355z(), sSLSocketFactory, hostnameVerifier, iVar, this.f34104a.mo38351v(), this.f34104a.mo38350u(), this.f34104a.mo38349t(), this.f34104a.mo38336g(), this.f34104a.mo38352w());
        return eVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C13231d mo38056a(Chain chain, boolean z) {
        synchronized (this.f34105b) {
            if (this.f34118o) {
                throw new IllegalStateException("released");
            } else if (this.f34113j != null) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
        }
        C13231d dVar = new C13231d(this, this.f34106c, this.f34107d, this.f34111h, this.f34111h.mo38022a(this.f34104a, chain, z));
        synchronized (this.f34105b) {
            this.f34113j = dVar;
            this.f34114k = false;
            this.f34115l = false;
        }
        return dVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38058a(C13235f fVar) {
        if (this.f34112i == null) {
            this.f34112i = fVar;
            fVar.f34083p.add(new C13243b(this, this.f34109f));
            return;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
        if (r1 == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003a, code lost:
        r6 = m34761a(r6, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003e, code lost:
        return r6;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.io.IOException mo38055a(okhttp3.internal.connection.C13231d r3, boolean r4, boolean r5, java.io.IOException r6) {
        /*
            r2 = this;
            okhttp3.internal.connection.g r0 = r2.f34105b
            monitor-enter(r0)
            okhttp3.internal.connection.d r1 = r2.f34113j     // Catch:{ all -> 0x003f }
            if (r3 == r1) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            return r6
        L_0x0009:
            r3 = 0
            r1 = 1
            if (r4 == 0) goto L_0x0013
            boolean r4 = r2.f34114k     // Catch:{ all -> 0x003f }
            r4 = r4 ^ r1
            r2.f34114k = r1     // Catch:{ all -> 0x003f }
            goto L_0x0014
        L_0x0013:
            r4 = 0
        L_0x0014:
            if (r5 == 0) goto L_0x001d
            boolean r5 = r2.f34115l     // Catch:{ all -> 0x003f }
            if (r5 != 0) goto L_0x001b
            r4 = 1
        L_0x001b:
            r2.f34115l = r1     // Catch:{ all -> 0x003f }
        L_0x001d:
            boolean r5 = r2.f34114k     // Catch:{ all -> 0x003f }
            if (r5 == 0) goto L_0x0036
            boolean r5 = r2.f34115l     // Catch:{ all -> 0x003f }
            if (r5 == 0) goto L_0x0036
            if (r4 == 0) goto L_0x0036
            okhttp3.internal.connection.d r4 = r2.f34113j     // Catch:{ all -> 0x003f }
            okhttp3.internal.connection.f r4 = r4.mo38009b()     // Catch:{ all -> 0x003f }
            int r5 = r4.f34080m     // Catch:{ all -> 0x003f }
            int r5 = r5 + r1
            r4.f34080m = r5     // Catch:{ all -> 0x003f }
            r4 = 0
            r2.f34113j = r4     // Catch:{ all -> 0x003f }
            goto L_0x0037
        L_0x0036:
            r1 = 0
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            if (r1 == 0) goto L_0x003e
            java.io.IOException r6 = r2.m34761a(r6, r3)
        L_0x003e:
            return r6
        L_0x003f:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.connection.C13241j.mo38055a(okhttp3.internal.connection.d, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    /* renamed from: a */
    public IOException mo38054a(IOException iOException) {
        synchronized (this.f34105b) {
            this.f34118o = true;
        }
        return m34761a(iOException, false);
    }

    /* renamed from: a */
    private IOException m34761a(IOException iOException, boolean z) {
        C13235f fVar;
        Socket g;
        boolean z2;
        boolean z3;
        synchronized (this.f34105b) {
            if (z) {
                if (this.f34113j != null) {
                    throw new IllegalStateException("cannot release connection while it is in use");
                }
            }
            fVar = this.f34112i;
            g = (this.f34112i == null || this.f34113j != null || (!z && !this.f34118o)) ? null : mo38065g();
            if (this.f34112i != null) {
                fVar = null;
            }
            z2 = true;
            z3 = this.f34118o && this.f34113j == null;
        }
        C13184e.m34505a(g);
        if (fVar != null) {
            this.f34107d.mo37762b(this.f34106c, (Connection) fVar);
        }
        if (z3) {
            if (iOException == null) {
                z2 = false;
            }
            iOException = m34763b(iOException);
            if (z2) {
                this.f34107d.mo37749a(this.f34106c, iOException);
            } else {
                this.f34107d.mo37747a(this.f34106c);
            }
        }
        return iOException;
    }
}
