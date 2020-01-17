package app.zenly.locator.chat.p054n5;

import android.view.View;
import android.view.View.OnClickListener;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.chat.C2382x4;
import app.zenly.locator.core.contracts.MapControllerContract.C2464g;
import app.zenly.locator.map.C3896a1;
import kotlin.C12956q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KDeclarationContainer;
import p387h.p388a.C12143a;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.chat.n5.a */
public final class C2105a {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C2464g f6599d = C2464g.AUTO;

    /* renamed from: a */
    private final ZenlySchedulers f6600a = C1351e.m6372a(C2382x4.f7181b.mo19916a("recenterPresenter"));

    /* renamed from: b */
    private final C12275b f6601b = new C12275b();

    /* renamed from: c */
    private final C2112c f6602c;

    /* renamed from: app.zenly.locator.chat.n5.a$a */
    static final class C2106a implements OnClickListener {

        /* renamed from: e */
        public static final C2106a f6603e = new C2106a();

        C2106a() {
        }

        public final void onClick(View view) {
            C3896a1.f10317n.mo10527a().mo10499a(C2105a.f6599d);
        }
    }

    /* renamed from: app.zenly.locator.chat.n5.a$b */
    public static final class C2107b {
        private C2107b() {
        }

        public /* synthetic */ C2107b(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.chat.n5.a$c */
    static final class C2108c<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C2108c f6604e = new C2108c();

        C2108c() {
        }

        /* renamed from: a */
        public final boolean mo7907a(C2464g gVar) {
            C12932j.m33818b(gVar, "mode");
            return gVar != C2105a.f6599d;
        }

        public /* bridge */ /* synthetic */ Object apply(Object obj) {
            return Boolean.valueOf(mo7907a((C2464g) obj));
        }
    }

    /* renamed from: app.zenly.locator.chat.n5.a$d */
    static final /* synthetic */ class C2109d extends C12931i implements Function1<Boolean, C12956q> {
        C2109d(C2105a aVar) {
            super(1, aVar);
        }

        /* renamed from: a */
        public final void mo7908a(boolean z) {
            ((C2105a) this.f33505f).m7852a(z);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C2105a.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "handleHeadingRequiresRecenter(Z)V";
        }

        public final String getName() {
            return "handleHeadingRequiresRecenter";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo7908a(((Boolean) obj).booleanValue());
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.chat.n5.a$e */
    static final class C2110e<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C2110e f6605e = new C2110e();

        C2110e() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32034c(th, "Unable to get heading follow mode", new Object[0]);
        }
    }

    static {
        new C2107b(null);
    }

    public C2105a(C2112c cVar) {
        C12932j.m33818b(cVar, "viewController");
        this.f6602c = cVar;
        this.f6602c.mo7910a((OnClickListener) C2106a.f6603e);
    }

    /* renamed from: b */
    public final void mo7905b() {
        this.f6601b.mo36401a();
    }

    /* renamed from: a */
    public final void mo7904a() {
        Disposable a = C3896a1.f10317n.mo10527a().mo10513d().mo36501i(C2108c.f6604e).mo36477d().mo36428a((C12286f) this.f6600a.getMainThread()).mo36412a((Consumer<? super T>) new C2111b<Object>(new C2109d(this)), (Consumer<? super Throwable>) C2110e.f6605e);
        C12932j.m33815a((Object) a, "MapManager.get().heading…llow mode\")\n            }");
        C12773a.m33432a(a, this.f6601b);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m7852a(boolean z) {
        this.f6602c.mo7911a(z);
    }
}
