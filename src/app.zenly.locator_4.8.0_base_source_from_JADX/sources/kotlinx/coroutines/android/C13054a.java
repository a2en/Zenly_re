package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import kotlin.C12956q;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;

/* renamed from: kotlinx.coroutines.android.a */
public final class C13054a extends C13058b implements Delay {
    private volatile C13054a _immediate;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Handler f33633e;

    /* renamed from: f */
    private final String f33634f;

    /* renamed from: g */
    private final boolean f33635g;

    /* renamed from: kotlinx.coroutines.android.a$a */
    public static final class C13055a implements DisposableHandle {

        /* renamed from: e */
        final /* synthetic */ C13054a f33636e;

        /* renamed from: f */
        final /* synthetic */ Runnable f33637f;

        C13055a(C13054a aVar, Runnable runnable) {
            this.f33636e = aVar;
            this.f33637f = runnable;
        }

        public void dispose() {
            this.f33636e.f33633e.removeCallbacks(this.f33637f);
        }
    }

    /* renamed from: kotlinx.coroutines.android.a$b */
    public static final class C13056b implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C13054a f33638e;

        /* renamed from: f */
        final /* synthetic */ CancellableContinuation f33639f;

        public C13056b(C13054a aVar, CancellableContinuation cancellableContinuation) {
            this.f33638e = aVar;
            this.f33639f = cancellableContinuation;
        }

        public final void run() {
            this.f33639f.resumeUndispatched(this.f33638e, C12956q.f33541a);
        }
    }

    /* renamed from: kotlinx.coroutines.android.a$c */
    static final class C13057c extends C12933k implements Function1<Throwable, C12956q> {

        /* renamed from: f */
        final /* synthetic */ C13054a f33640f;

        /* renamed from: g */
        final /* synthetic */ Runnable f33641g;

        C13057c(C13054a aVar, Runnable runnable) {
            this.f33640f = aVar;
            this.f33641g = runnable;
            super(1);
        }

        /* renamed from: a */
        public final void mo37501a(Throwable th) {
            this.f33640f.f33633e.removeCallbacks(this.f33641g);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo37501a((Throwable) obj);
            return C12956q.f33541a;
        }
    }

    private C13054a(Handler handler, String str, boolean z) {
        C13054a aVar = null;
        super(null);
        this.f33633e = handler;
        this.f33634f = str;
        this.f33635g = z;
        if (this.f33635g) {
            aVar = this;
        }
        this._immediate = aVar;
        if (this._immediate == null) {
            this._immediate = new C13054a(this.f33633e, this.f33634f, true);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13054a) && ((C13054a) obj).f33633e == this.f33633e;
    }

    public int hashCode() {
        return System.identityHashCode(this.f33633e);
    }

    public DisposableHandle invokeOnTimeout(long j, Runnable runnable) {
        C12932j.m33818b(runnable, "block");
        this.f33633e.postDelayed(runnable, C12973l.m33891b(j, 4611686018427387903L));
        return new C13055a(this, runnable);
    }

    public void scheduleResumeAfterDelay(long j, CancellableContinuation<? super C12956q> cancellableContinuation) {
        C12932j.m33818b(cancellableContinuation, "continuation");
        C13056b bVar = new C13056b(this, cancellableContinuation);
        this.f33633e.postDelayed(bVar, C12973l.m33891b(j, 4611686018427387903L));
        cancellableContinuation.invokeOnCancellation(new C13057c(this, bVar));
    }

    public String toString() {
        String str = this.f33634f;
        if (str == null) {
            String handler = this.f33633e.toString();
            C12932j.m33815a((Object) handler, "handler.toString()");
            return handler;
        } else if (!this.f33635g) {
            return str;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f33634f);
            sb.append(" [immediate]");
            return sb.toString();
        }
    }

    /* renamed from: a */
    public boolean mo37496a(CoroutineContext coroutineContext) {
        C12932j.m33818b(coroutineContext, "context");
        return !this.f33635g || (C12932j.m33817a((Object) Looper.myLooper(), (Object) this.f33633e.getLooper()) ^ true);
    }

    /* renamed from: a */
    public void mo37495a(CoroutineContext coroutineContext, Runnable runnable) {
        C12932j.m33818b(coroutineContext, "context");
        C12932j.m33818b(runnable, "block");
        this.f33633e.post(runnable);
    }

    public C13054a(Handler handler, String str) {
        C12932j.m33818b(handler, "handler");
        this(handler, str, false);
    }
}
