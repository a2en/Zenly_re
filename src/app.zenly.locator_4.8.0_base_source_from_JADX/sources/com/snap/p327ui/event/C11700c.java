package com.snap.p327ui.event;

import androidx.core.p004os.C0569g;
import org.greenrobot.eventbus.C13373c;
import org.greenrobot.eventbus.C13377d;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.C12276c;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Action;

/* renamed from: com.snap.ui.event.c */
public class C11700c implements Disposable {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C13373c f30325e;

    /* renamed from: f */
    private final C12275b f30326f = new C12275b();

    /* renamed from: g */
    private final EventDispatcher f30327g = new C11701a();

    /* renamed from: com.snap.ui.event.c$a */
    class C11701a implements EventDispatcher {
        C11701a() {
        }

        public void dispatch(Object obj) {
            if (!C11700c.this.isDisposed()) {
                C0569g.m2680a("RxBus:post");
                try {
                    C11700c.this.f30325e.mo38582a(obj);
                } finally {
                    C0569g.m2679a();
                }
            }
        }
    }

    public C11700c() {
        C13377d b = C13373c.m35447b();
        b.mo38592c(false);
        b.mo38593d(true);
        b.mo38590a(false);
        b.mo38591b(false);
        this.f30325e = b.mo38589a();
    }

    /* renamed from: b */
    public Disposable mo34449b(Object obj) {
        C0569g.m2680a("RxBus:subscribe");
        try {
            this.f30325e.mo38585b(obj);
            Disposable a = C12276c.m32593a((Action) new C11697a(this, obj));
            this.f30326f.add(a);
            return a;
        } finally {
            C0569g.m2679a();
        }
    }

    public void dispose() {
        this.f30326f.dispose();
    }

    public boolean isDisposed() {
        return this.f30326f.isDisposed();
    }

    /* renamed from: a */
    public EventDispatcher mo34447a() {
        return this.f30327g;
    }

    /* renamed from: a */
    public /* synthetic */ void mo34448a(Object obj) throws Exception {
        this.f30325e.mo38586c(obj);
    }
}
