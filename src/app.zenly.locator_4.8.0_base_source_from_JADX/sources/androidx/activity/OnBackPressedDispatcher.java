package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.C0862g;
import androidx.lifecycle.C0862g.C0863a;
import androidx.lifecycle.C0862g.C0864b;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {

    /* renamed from: a */
    private final Runnable f137a;

    /* renamed from: b */
    final ArrayDeque<C0088b> f138b = new ArrayDeque<>();

    private class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, C0087a {

        /* renamed from: e */
        private final C0862g f139e;

        /* renamed from: f */
        private final C0088b f140f;

        /* renamed from: g */
        private C0087a f141g;

        LifecycleOnBackPressedCancellable(C0862g gVar, C0088b bVar) {
            this.f139e = gVar;
            this.f140f = bVar;
            gVar.mo4446a(this);
        }

        public void cancel() {
            this.f139e.mo4447b(this);
            this.f140f.mo288b(this);
            C0087a aVar = this.f141g;
            if (aVar != null) {
                aVar.cancel();
                this.f141g = null;
            }
        }

        public void onStateChanged(LifecycleOwner lifecycleOwner, C0863a aVar) {
            if (aVar == C0863a.ON_START) {
                this.f141g = OnBackPressedDispatcher.this.mo281a(this.f140f);
            } else if (aVar == C0863a.ON_STOP) {
                C0087a aVar2 = this.f141g;
                if (aVar2 != null) {
                    aVar2.cancel();
                }
            } else if (aVar == C0863a.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$a */
    private class C0086a implements C0087a {

        /* renamed from: e */
        private final C0088b f143e;

        C0086a(C0088b bVar) {
            this.f143e = bVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f138b.remove(this.f143e);
            this.f143e.mo288b(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f137a = runnable;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0087a mo281a(C0088b bVar) {
        this.f138b.add(bVar);
        C0086a aVar = new C0086a(bVar);
        bVar.mo286a((C0087a) aVar);
        return aVar;
    }

    @SuppressLint({"LambdaLast"})
    /* renamed from: a */
    public void mo283a(LifecycleOwner lifecycleOwner, C0088b bVar) {
        C0862g lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.mo4445a() != C0864b.DESTROYED) {
            bVar.mo286a((C0087a) new LifecycleOnBackPressedCancellable(lifecycle, bVar));
        }
    }

    /* renamed from: a */
    public void mo282a() {
        Iterator descendingIterator = this.f138b.descendingIterator();
        while (descendingIterator.hasNext()) {
            C0088b bVar = (C0088b) descendingIterator.next();
            if (bVar.mo289b()) {
                bVar.mo285a();
                return;
            }
        }
        Runnable runnable = this.f137a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
