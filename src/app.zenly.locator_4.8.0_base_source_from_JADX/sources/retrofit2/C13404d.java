package retrofit2;

import java.io.IOException;
import okhttp3.C13167a0;
import okhttp3.C13167a0.C13168a;
import okhttp3.C13170b0;
import okhttp3.C13321t;
import okhttp3.C13331y;
import okhttp3.Call;
import okhttp3.Callback;
import okio.BufferedSource;
import okio.C13342c;
import okio.C13349g;
import okio.C13354l;
import okio.Source;

/* renamed from: retrofit2.d */
final class C13404d<T> implements Call<T> {

    /* renamed from: e */
    private final C13433j<T, ?> f34772e;

    /* renamed from: f */
    private final Object[] f34773f;

    /* renamed from: g */
    private volatile boolean f34774g;

    /* renamed from: h */
    private Call f34775h;

    /* renamed from: i */
    private Throwable f34776i;

    /* renamed from: j */
    private boolean f34777j;

    /* renamed from: retrofit2.d$a */
    class C13405a implements Callback {

        /* renamed from: a */
        final /* synthetic */ Callback f34778a;

        C13405a(Callback callback) {
            this.f34778a = callback;
        }

        /* renamed from: a */
        private void m35494a(Throwable th) {
            try {
                this.f34778a.onFailure(C13404d.this, th);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }

        public void onFailure(Call call, IOException iOException) {
            m35494a(iOException);
        }

        public void onResponse(Call call, C13167a0 a0Var) {
            try {
                try {
                    this.f34778a.onResponse(C13404d.this, C13404d.this.mo38639a(a0Var));
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                m35494a(th2);
            }
        }
    }

    /* renamed from: retrofit2.d$b */
    static final class C13406b extends C13170b0 {

        /* renamed from: f */
        private final C13170b0 f34780f;

        /* renamed from: g */
        IOException f34781g;

        /* renamed from: retrofit2.d$b$a */
        class C13407a extends C13349g {
            C13407a(Source source) {
                super(source);
            }

            public long read(C13342c cVar, long j) throws IOException {
                try {
                    return super.read(cVar, j);
                } catch (IOException e) {
                    C13406b.this.f34781g = e;
                    throw e;
                }
            }
        }

        C13406b(C13170b0 b0Var) {
            this.f34780f = b0Var;
        }

        public void close() {
            this.f34780f.close();
        }

        /* renamed from: d */
        public long mo37827d() {
            return this.f34780f.mo37827d();
        }

        /* renamed from: e */
        public C13321t mo37828e() {
            return this.f34780f.mo37828e();
        }

        /* renamed from: f */
        public BufferedSource mo37829f() {
            return C13354l.m35375a((Source) new C13407a(this.f34780f.mo37829f()));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public void mo38640h() throws IOException {
            IOException iOException = this.f34781g;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    /* renamed from: retrofit2.d$c */
    static final class C13408c extends C13170b0 {

        /* renamed from: f */
        private final C13321t f34783f;

        /* renamed from: g */
        private final long f34784g;

        C13408c(C13321t tVar, long j) {
            this.f34783f = tVar;
            this.f34784g = j;
        }

        /* renamed from: d */
        public long mo37827d() {
            return this.f34784g;
        }

        /* renamed from: e */
        public C13321t mo37828e() {
            return this.f34783f;
        }

        /* renamed from: f */
        public BufferedSource mo37829f() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    C13404d(C13433j<T, ?> jVar, Object[] objArr) {
        this.f34772e = jVar;
        this.f34773f = objArr;
    }

    /* renamed from: a */
    private Call m35492a() throws IOException {
        Call a = this.f34772e.mo38691a(this.f34773f);
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    public void cancel() {
        Call call;
        this.f34774g = true;
        synchronized (this) {
            call = this.f34775h;
        }
        if (call != null) {
            call.cancel();
        }
    }

    public void enqueue(Callback<T> callback) {
        Call call;
        Throwable th;
        C13435k.m35594a(callback, "callback == null");
        synchronized (this) {
            if (!this.f34777j) {
                this.f34777j = true;
                call = this.f34775h;
                th = this.f34776i;
                if (call == null && th == null) {
                    try {
                        Call a = m35492a();
                        this.f34775h = a;
                        call = a;
                    } catch (Throwable th2) {
                        th = th2;
                        C13435k.m35601a(th);
                        this.f34776i = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            callback.onFailure(this, th);
            return;
        }
        if (this.f34774g) {
            call.cancel();
        }
        call.enqueue(new C13405a(callback));
    }

    public C13429h<T> execute() throws IOException {
        Call call;
        synchronized (this) {
            if (!this.f34777j) {
                this.f34777j = true;
                if (this.f34776i == null) {
                    call = this.f34775h;
                    if (call == null) {
                        try {
                            call = m35492a();
                            this.f34775h = call;
                        } catch (IOException | Error | RuntimeException e) {
                            C13435k.m35601a(e);
                            this.f34776i = e;
                            throw e;
                        }
                    }
                } else if (this.f34776i instanceof IOException) {
                    throw ((IOException) this.f34776i);
                } else if (this.f34776i instanceof RuntimeException) {
                    throw ((RuntimeException) this.f34776i);
                } else {
                    throw ((Error) this.f34776i);
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.f34774g) {
            call.cancel();
        }
        return mo38639a(call.execute());
    }

    public boolean isCanceled() {
        boolean z = true;
        if (this.f34774g) {
            return true;
        }
        synchronized (this) {
            if (this.f34775h == null || !this.f34775h.isCanceled()) {
                z = false;
            }
        }
        return z;
    }

    public synchronized boolean isExecuted() {
        return this.f34777j;
    }

    public synchronized C13331y request() {
        Call call = this.f34775h;
        if (call != null) {
            return call.request();
        } else if (this.f34776i == null) {
            try {
                Call a = m35492a();
                this.f34775h = a;
                return a.request();
            } catch (RuntimeException e) {
                e = e;
                C13435k.m35601a(e);
                this.f34776i = e;
                throw e;
            } catch (Error e2) {
                e = e2;
                C13435k.m35601a(e);
                this.f34776i = e;
                throw e;
            } catch (IOException e3) {
                this.f34776i = e3;
                throw new RuntimeException("Unable to create request.", e3);
            }
        } else if (this.f34776i instanceof IOException) {
            throw new RuntimeException("Unable to create request.", this.f34776i);
        } else if (this.f34776i instanceof RuntimeException) {
            throw ((RuntimeException) this.f34776i);
        } else {
            throw ((Error) this.f34776i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C13429h<T> mo38639a(C13167a0 a0Var) throws IOException {
        C13170b0 a = a0Var.mo37789a();
        C13168a j = a0Var.mo37799j();
        j.mo37811a((C13170b0) new C13408c(a.mo37828e(), a.mo37827d()));
        C13167a0 a2 = j.mo37816a();
        int d = a2.mo37793d();
        if (d < 200 || d >= 300) {
            try {
                return C13429h.m35547a(C13435k.m35599a(a), a2);
            } finally {
                a.close();
            }
        } else if (d == 204 || d == 205) {
            a.close();
            return C13429h.m35546a(null, a2);
        } else {
            C13406b bVar = new C13406b(a);
            try {
                return C13429h.m35546a(this.f34772e.mo38689a((C13170b0) bVar), a2);
            } catch (RuntimeException e) {
                bVar.mo38640h();
                throw e;
            }
        }
    }

    public C13404d<T> clone() {
        return new C13404d<>(this.f34772e, this.f34773f);
    }
}
