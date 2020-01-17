package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResult.StatusListener;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.internal.base.C10263e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
public abstract class BasePendingResult<R extends Result> extends PendingResult<R> {

    /* renamed from: n */
    static final ThreadLocal<Boolean> f26301n = new C10059w0();

    /* renamed from: a */
    private final Object f26302a;

    /* renamed from: b */
    private final C10004a<R> f26303b;

    /* renamed from: c */
    private final CountDownLatch f26304c;

    /* renamed from: d */
    private final ArrayList<StatusListener> f26305d;

    /* renamed from: e */
    private ResultCallback<? super R> f26306e;

    /* renamed from: f */
    private final AtomicReference<C10037l0> f26307f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public R f26308g;

    /* renamed from: h */
    private Status f26309h;

    /* renamed from: i */
    private volatile boolean f26310i;

    /* renamed from: j */
    private boolean f26311j;

    /* renamed from: k */
    private boolean f26312k;

    /* renamed from: l */
    private volatile C10031i0<R> f26313l;

    /* renamed from: m */
    private boolean f26314m;

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$a */
    public static class C10004a<R extends Result> extends C10263e {
        public C10004a(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        public final void mo27112a(ResultCallback<? super R> resultCallback, R r) {
            BasePendingResult.m25082a(resultCallback);
            sendMessage(obtainMessage(1, new Pair(resultCallback, r)));
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                ResultCallback resultCallback = (ResultCallback) pair.first;
                Result result = (Result) pair.second;
                try {
                    resultCallback.onResult(result);
                } catch (RuntimeException e) {
                    BasePendingResult.m25086c(result);
                    throw e;
                }
            } else if (i != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).mo27111b(Status.f26275k);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.api.internal.BasePendingResult$b */
    private final class C10005b {
        private C10005b() {
        }

        /* access modifiers changed from: protected */
        public final void finalize() throws Throwable {
            BasePendingResult.m25086c(BasePendingResult.this.f26308g);
            super.finalize();
        }

        /* synthetic */ C10005b(BasePendingResult basePendingResult, C10059w0 w0Var) {
            this();
        }
    }

    @Deprecated
    BasePendingResult() {
        this.f26302a = new Object();
        this.f26304c = new CountDownLatch(1);
        this.f26305d = new ArrayList<>();
        this.f26307f = new AtomicReference<>();
        this.f26314m = false;
        this.f26303b = new C10004a<>(Looper.getMainLooper());
        new WeakReference(null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static <R extends Result> ResultCallback<R> m25082a(ResultCallback<R> resultCallback) {
        return resultCallback;
    }

    /* renamed from: c */
    private final R m25085c() {
        R r;
        synchronized (this.f26302a) {
            C10123l.m25517b(!this.f26310i, "Result has already been consumed.");
            C10123l.m25517b(mo27109a(), "Result is not ready.");
            r = this.f26308g;
            this.f26308g = null;
            this.f26306e = null;
            this.f26310i = true;
        }
        C10037l0 l0Var = (C10037l0) this.f26307f.getAndSet(null);
        if (l0Var != null) {
            l0Var.mo27215a(this);
        }
        return r;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract R mo27107a(Status status);

    /* renamed from: a */
    public final boolean mo27109a() {
        return this.f26304c.getCount() == 0;
    }

    /* renamed from: b */
    public final void mo27111b(Status status) {
        synchronized (this.f26302a) {
            if (!mo27109a()) {
                mo27108a((R) mo27107a(status));
                this.f26312k = true;
            }
        }
    }

    /* renamed from: a */
    public final R mo27047a(long j, TimeUnit timeUnit) {
        if (j > 0) {
            C10123l.m25519c("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z = true;
        C10123l.m25517b(!this.f26310i, "Result has already been consumed.");
        if (this.f26313l != null) {
            z = false;
        }
        C10123l.m25517b(z, "Cannot await if then() has been called.");
        try {
            if (!this.f26304c.await(j, timeUnit)) {
                mo27111b(Status.f26275k);
            }
        } catch (InterruptedException unused) {
            mo27111b(Status.f26274j);
        }
        C10123l.m25517b(mo27109a(), "Result is not ready.");
        return m25085c();
    }

    /* renamed from: b */
    public final void mo27110b() {
        this.f26314m = this.f26314m || ((Boolean) f26301n.get()).booleanValue();
    }

    /* renamed from: b */
    private final void mo27152b(R r) {
        this.f26308g = r;
        this.f26304c.countDown();
        this.f26309h = this.f26308g.getStatus();
        if (this.f26311j) {
            this.f26306e = null;
        } else if (this.f26306e != null) {
            this.f26303b.removeMessages(2);
            this.f26303b.mo27112a(this.f26306e, m25085c());
        } else if (this.f26308g instanceof Releasable) {
            new C10005b(this, null);
        }
        ArrayList<StatusListener> arrayList = this.f26305d;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((StatusListener) obj).onComplete(this.f26309h);
        }
        this.f26305d.clear();
    }

    protected BasePendingResult(GoogleApiClient googleApiClient) {
        this.f26302a = new Object();
        this.f26304c = new CountDownLatch(1);
        this.f26305d = new ArrayList<>();
        this.f26307f = new AtomicReference<>();
        this.f26314m = false;
        this.f26303b = new C10004a<>(googleApiClient != null ? googleApiClient.mo27042a() : Looper.getMainLooper());
        new WeakReference(googleApiClient);
    }

    /* renamed from: a */
    public final void mo27048a(StatusListener statusListener) {
        C10123l.m25513a(statusListener != null, (Object) "Callback cannot be null.");
        synchronized (this.f26302a) {
            if (mo27109a()) {
                statusListener.onComplete(this.f26309h);
            } else {
                this.f26305d.add(statusListener);
            }
        }
    }

    /* renamed from: c */
    public static void m25086c(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException e) {
                String valueOf = String.valueOf(result);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
                sb.append("Unable to release ");
                sb.append(valueOf);
                Log.w("BasePendingResult", sb.toString(), e);
            }
        }
    }

    /* renamed from: a */
    public final void mo27108a(R r) {
        synchronized (this.f26302a) {
            if (this.f26312k || this.f26311j) {
                m25086c(r);
                return;
            }
            mo27109a();
            boolean z = true;
            C10123l.m25517b(!mo27109a(), "Results have already been set");
            if (this.f26310i) {
                z = false;
            }
            C10123l.m25517b(z, "Result has already been consumed");
            mo27152b(r);
        }
    }
}
