package app.zenly.locator.map.p109i1;

import app.zenly.locator.p143s.p148l.C5448c;
import java.util.concurrent.atomic.AtomicInteger;
import p213co.znly.core.ZenlyCore;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;

/* renamed from: app.zenly.locator.map.i1.o1 */
public abstract class C4044o1 {

    /* renamed from: a */
    protected final ZenlyCore f10629a = C5448c.m15478a();

    /* renamed from: b */
    private final C12275b f10630b = new C12275b();

    /* renamed from: c */
    private AtomicInteger f10631c = new AtomicInteger();

    protected C4044o1() {
    }

    /* renamed from: a */
    public final void mo10698a() {
        if (this.f10631c.addAndGet(1) == 1) {
            mo10700b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo10700b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo10701c() {
    }

    /* renamed from: d */
    public final void mo10702d() {
        if (this.f10631c.addAndGet(-1) != 0) {
            if (this.f10631c.get() < 0) {
                this.f10631c.set(0);
            }
            return;
        }
        this.f10630b.mo36401a();
        mo10701c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo10699a(Disposable disposable) {
        this.f10630b.add(disposable);
    }
}
