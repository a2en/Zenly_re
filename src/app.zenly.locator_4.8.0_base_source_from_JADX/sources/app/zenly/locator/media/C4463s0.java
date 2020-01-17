package app.zenly.locator.media;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.p143s.p148l.C5448c;
import com.bluelinelabs.conductor.C8819d;
import kotlin.jvm.internal.C12932j;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.media.s0 */
public final class C4463s0 extends ZenlyController {

    /* renamed from: P */
    private final String f12034P;

    /* renamed from: app.zenly.locator.media.s0$a */
    public static final class C4464a {
        private C4464a() {
        }

        public /* synthetic */ C4464a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.media.s0$b */
    static final class C4465b<T> implements Consumer<Integer> {

        /* renamed from: e */
        public static final C4465b f12035e = new C4465b();

        C4465b() {
        }

        /* renamed from: a */
        public final void accept(Integer num) {
        }
    }

    /* renamed from: app.zenly.locator.media.s0$c */
    static final class C4466c<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C4466c f12036e = new C4466c();

        C4466c() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
        }
    }

    /* renamed from: app.zenly.locator.media.s0$d */
    static final class C4467d implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C4463s0 f12037e;

        C4467d(C4463s0 s0Var) {
            this.f12037e = s0Var;
        }

        public final void run() {
            this.f12037e.mo23946k().mo23997a((C8819d) this.f12037e);
        }
    }

    static {
        new C4464a(null);
    }

    public C4463s0(Bundle bundle) {
        super(bundle);
        this.f12034P = bundle != null ? bundle.getString("KEY_TARGET_UUID") : null;
    }

    /* renamed from: B */
    public final String mo7192B() {
        return this.f12034P;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.controller_expired_request, viewGroup, false);
        C12932j.m33815a((Object) inflate, "inflater.inflate(R.layou…equest, container, false)");
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        C12932j.m33818b(view, "view");
        super.mo7052b(view);
        if (this.f12034P != null) {
            C5448c.m15478a().requestMediaRead(this.f12034P).mo36412a((Consumer<? super T>) C4465b.f12035e, (Consumer<? super Throwable>) C4466c.f12036e);
        }
        view.postDelayed(new C4467d(this), 2000);
    }
}
