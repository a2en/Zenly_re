package app.zenly.locator.username;

import androidx.lifecycle.C0874n;
import androidx.lifecycle.C0889u;
import androidx.lifecycle.LiveData;
import app.zenly.locator.p143s.p148l.C5448c;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.vendor.com.google.protobuf.FieldMask;
import p213co.znly.core.vendor.com.google.protobuf.FieldMask.Builder;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;
import p213co.znly.models.services.C8141k3;
import p213co.znly.models.services.C8141k3.C8142a;
import p213co.znly.models.services.C8155l3;
import p387h.p388a.C12143a;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;

/* renamed from: app.zenly.locator.username.e */
public final class C5973e extends C0889u {

    /* renamed from: c */
    private final C12275b f15024c = new C12275b();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C0874n<String> f15025d = new C0874n<>();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C0874n<Boolean> f15026e = new C0874n<>();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C0874n<C8155l3> f15027f = new C0874n<>();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C0874n<Boolean> f15028g = new C0874n<>();

    /* renamed from: h */
    private final LiveData<String> f15029h = this.f15025d;

    /* renamed from: i */
    private final LiveData<Boolean> f15030i = this.f15026e;

    /* renamed from: j */
    private final LiveData<C8155l3> f15031j = this.f15027f;

    /* renamed from: k */
    private final LiveData<Boolean> f15032k = this.f15028g;

    /* renamed from: app.zenly.locator.username.e$a */
    public static final class C5974a {
        private C5974a() {
        }

        public /* synthetic */ C5974a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.username.e$b */
    static final class C5975b<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C5975b f15033e = new C5975b();

        C5975b() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32029a(th, "Unable to generate username suggestion", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.username.e$c */
    static final class C5976c<T> implements Consumer<String> {

        /* renamed from: e */
        final /* synthetic */ C5973e f15034e;

        C5976c(C5973e eVar) {
            this.f15034e = eVar;
        }

        /* renamed from: a */
        public final void accept(String str) {
            this.f15034e.f15025d.mo4395b(str);
            this.f15034e.f15026e.mo4395b(Boolean.valueOf(false));
        }
    }

    /* renamed from: app.zenly.locator.username.e$d */
    static final class C5977d<T> implements Consumer<C8155l3> {

        /* renamed from: e */
        final /* synthetic */ C5973e f15035e;

        C5977d(C5973e eVar) {
            this.f15035e = eVar;
        }

        /* renamed from: a */
        public final void accept(C8155l3 l3Var) {
            this.f15035e.f15027f.mo4395b(l3Var);
            this.f15035e.f15028g.mo4395b(Boolean.valueOf(false));
        }
    }

    /* renamed from: app.zenly.locator.username.e$e */
    static final class C5978e<T> implements Consumer<Throwable> {

        /* renamed from: e */
        final /* synthetic */ C5973e f15036e;

        C5978e(C5973e eVar) {
            this.f15036e = eVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32029a(th, "Unable to save username", new Object[0]);
            this.f15036e.f15028g.mo4395b(Boolean.valueOf(false));
        }
    }

    static {
        new C5974a(null);
    }

    /* renamed from: e */
    public final LiveData<C8155l3> mo13707e() {
        return this.f15031j;
    }

    /* renamed from: f */
    public final LiveData<Boolean> mo13708f() {
        return this.f15032k;
    }

    /* renamed from: g */
    public final LiveData<String> mo13709g() {
        return this.f15029h;
    }

    /* renamed from: b */
    public final void mo13704b(String str) {
        C12932j.m33818b(str, "newUsername");
        this.f15028g.mo4395b(Boolean.valueOf(true));
        C8142a newBuilder = C8141k3.newBuilder();
        Builder newBuilder2 = FieldMask.newBuilder();
        newBuilder2.addPaths("user.username");
        newBuilder.mo22157a((FieldMask) newBuilder2.build());
        C6925a newBuilder3 = UserProto$User.newBuilder();
        newBuilder3.mo18018a(str);
        newBuilder.mo22158a((UserProto$User) newBuilder3.build());
        this.f15024c.add(C5448c.m15478a().userUpdateWithErrors((C8141k3) newBuilder.build()).mo36428a(C12295a.m32802a()).mo36412a((Consumer<? super T>) new C5977d<Object>(this), (Consumer<? super Throwable>) new C5978e<Object>(this)));
    }

    /* renamed from: c */
    public final void mo13705c() {
        this.f15026e.mo4395b(Boolean.valueOf(true));
        this.f15024c.add(C5448c.m15478a().usernameGenerate().mo36432a((Consumer<? super Throwable>) C5975b.f15033e).mo36473c("").mo36428a(C12295a.m32802a()).mo36476d((Consumer<? super T>) new C5976c<Object>(this)));
    }

    /* renamed from: d */
    public final LiveData<Boolean> mo13706d() {
        return this.f15030i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo4269b() {
        this.f15024c.mo36401a();
        super.mo4269b();
    }
}
