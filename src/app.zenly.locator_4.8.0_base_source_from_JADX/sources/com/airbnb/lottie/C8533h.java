package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import com.airbnb.lottie.p289q.C8654d;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/* renamed from: com.airbnb.lottie.h */
public class C8533h<T> {

    /* renamed from: e */
    public static Executor f21839e = Executors.newCachedThreadPool();

    /* renamed from: a */
    private final Set<LottieListener<T>> f21840a;

    /* renamed from: b */
    private final Set<LottieListener<Throwable>> f21841b;

    /* renamed from: c */
    private final Handler f21842c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public volatile C8532g<T> f21843d;

    /* renamed from: com.airbnb.lottie.h$a */
    class C8534a implements Runnable {
        C8534a() {
        }

        public void run() {
            if (C8533h.this.f21843d != null) {
                C8532g a = C8533h.this.f21843d;
                if (a.mo23028b() != null) {
                    C8533h.this.m19781a(a.mo23028b());
                } else {
                    C8533h.this.m19782a(a.mo23027a());
                }
            }
        }
    }

    /* renamed from: com.airbnb.lottie.h$b */
    private class C8535b extends FutureTask<C8532g<T>> {
        C8535b(Callable<C8532g<T>> callable) {
            super(callable);
        }

        /* access modifiers changed from: protected */
        public void done() {
            if (!isCancelled()) {
                try {
                    C8533h.this.m19777a((C8532g) get());
                } catch (InterruptedException | ExecutionException e) {
                    C8533h.this.m19777a(new C8532g<>(e));
                }
            }
        }
    }

    public C8533h(Callable<C8532g<T>> callable) {
        this(callable, false);
    }

    /* renamed from: b */
    public synchronized C8533h<T> mo23032b(LottieListener<T> lottieListener) {
        if (!(this.f21843d == null || this.f21843d.mo23028b() == null)) {
            lottieListener.onResult(this.f21843d.mo23028b());
        }
        this.f21840a.add(lottieListener);
        return this;
    }

    /* renamed from: c */
    public synchronized C8533h<T> mo23033c(LottieListener<Throwable> lottieListener) {
        this.f21841b.remove(lottieListener);
        return this;
    }

    /* renamed from: d */
    public synchronized C8533h<T> mo23034d(LottieListener<T> lottieListener) {
        this.f21840a.remove(lottieListener);
        return this;
    }

    C8533h(Callable<C8532g<T>> callable, boolean z) {
        this.f21840a = new LinkedHashSet(1);
        this.f21841b = new LinkedHashSet(1);
        this.f21842c = new Handler(Looper.getMainLooper());
        this.f21843d = null;
        if (z) {
            try {
                m19777a((C8532g) callable.call());
            } catch (Throwable th) {
                m19777a(new C8532g<>(th));
            }
        } else {
            f21839e.execute(new C8535b(callable));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m19777a(C8532g<T> gVar) {
        if (this.f21843d == null) {
            this.f21843d = gVar;
            m19776a();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    /* renamed from: a */
    public synchronized C8533h<T> mo23031a(LottieListener<Throwable> lottieListener) {
        if (!(this.f21843d == null || this.f21843d.mo23027a() == null)) {
            lottieListener.onResult(this.f21843d.mo23027a());
        }
        this.f21841b.add(lottieListener);
        return this;
    }

    /* renamed from: a */
    private void m19776a() {
        this.f21842c.post(new C8534a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m19781a(T t) {
        for (LottieListener onResult : new ArrayList(this.f21840a)) {
            onResult.onResult(t);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m19782a(Throwable th) {
        ArrayList<LottieListener> arrayList = new ArrayList<>(this.f21841b);
        if (arrayList.isEmpty()) {
            C8654d.m20154a("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        for (LottieListener onResult : arrayList) {
            onResult.onResult(th);
        }
    }
}
