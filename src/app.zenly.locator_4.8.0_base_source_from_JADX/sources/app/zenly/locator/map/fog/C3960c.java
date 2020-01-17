package app.zenly.locator.map.fog;

import android.content.Context;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.core.invitations.C2538c0;
import app.zenly.locator.core.invitations.C2587f0;
import app.zenly.locator.core.invitations.C2623w;
import app.zenly.locator.core.invitations.C2624x;
import app.zenly.locator.core.invitations.C2625y;
import app.zenly.locator.core.invitations.C2625y.C2626a;
import app.zenly.locator.core.invitations.InvitationCallback;
import app.zenly.locator.core.manager.p070t5.C2831a;
import app.zenly.locator.map.C4409z0;
import app.zenly.locator.map.fog.C3968d.C3969a;
import kotlin.C12956q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import p213co.znly.models.C7339i;
import p213co.znly.models.UserProto$User;
import p387h.p388a.C12143a;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.map.fog.c */
public final class C3960c {

    /* renamed from: a */
    private final ZenlySchedulers f10468a = C1351e.m6372a(C4409z0.f11896b.mo19916a("fogPresenter"));

    /* renamed from: b */
    private final C12275b f10469b = new C12275b();

    /* renamed from: c */
    private boolean f10470c;

    /* renamed from: d */
    private final C3943a f10471d;

    /* renamed from: e */
    private final C3968d f10472e;

    /* renamed from: f */
    private final C7339i f10473f;

    /* renamed from: g */
    private final String f10474g;

    /* renamed from: app.zenly.locator.map.fog.c$a */
    public static final class C3961a extends C2623w {

        /* renamed from: c */
        final /* synthetic */ C3960c f10475c;

        C3961a(C3960c cVar, Context context, Context context2, boolean z) {
            this.f10475c = cVar;
            super(context2, z);
        }

        public void onCancel() {
            this.f10475c.mo10614a().mo7192B();
        }

        public boolean onError(C2624x xVar) {
            C12932j.m33818b(xVar, "error");
            if (super.onError(xVar)) {
                this.f10475c.mo10614a().mo10598C();
            }
            return true;
        }

        public void onSuccess() {
            this.f10475c.mo10614a().mo10599D();
        }
    }

    /* renamed from: app.zenly.locator.map.fog.c$b */
    static final class C3962b extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ C3960c f10476f;

        /* renamed from: g */
        final /* synthetic */ C2538c0 f10477g;

        /* renamed from: h */
        final /* synthetic */ C7339i f10478h;

        /* renamed from: i */
        final /* synthetic */ Context f10479i;

        C3962b(C3960c cVar, C2538c0 c0Var, C7339i iVar, Context context) {
            this.f10476f = cVar;
            this.f10477g = c0Var;
            this.f10478h = iVar;
            this.f10479i = context;
            super(0);
        }

        public final void invoke() {
            this.f10477g.mo8670a(C2625y.f7738e.mo8731a(C2587f0.FOG, this.f10478h, false), this.f10476f.m11583a(this.f10479i));
        }
    }

    /* renamed from: app.zenly.locator.map.fog.c$c */
    static final class C3963c extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ C3960c f10480f;

        /* renamed from: g */
        final /* synthetic */ C2538c0 f10481g;

        /* renamed from: h */
        final /* synthetic */ UserProto$User f10482h;

        /* renamed from: i */
        final /* synthetic */ boolean f10483i;

        /* renamed from: j */
        final /* synthetic */ int f10484j;

        /* renamed from: k */
        final /* synthetic */ Context f10485k;

        C3963c(C3960c cVar, C2538c0 c0Var, UserProto$User userProto$User, boolean z, int i, Context context) {
            this.f10480f = cVar;
            this.f10481g = c0Var;
            this.f10482h = userProto$User;
            this.f10483i = z;
            this.f10484j = i;
            this.f10485k = context;
            super(0);
        }

        public final void invoke() {
            this.f10481g.mo8670a(C2626a.m8955a(C2625y.f7738e, C2587f0.FOG, this.f10482h, this.f10483i, Integer.valueOf(this.f10484j), false, 16, null), this.f10480f.m11583a(this.f10485k));
        }
    }

    /* renamed from: app.zenly.locator.map.fog.c$d */
    static final class C3964d<T> implements Consumer<C3969a> {

        /* renamed from: e */
        final /* synthetic */ C3960c f10486e;

        C3964d(C3960c cVar) {
            this.f10486e = cVar;
        }

        /* renamed from: a */
        public final void accept(C3969a aVar) {
            C3960c cVar = this.f10486e;
            C12932j.m33815a((Object) aVar, "userInfo");
            cVar.m11586a(aVar);
        }
    }

    /* renamed from: app.zenly.locator.map.fog.c$e */
    static final class C3965e<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C3965e f10487e = new C3965e();

        C3965e() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "Failed getting user with contact and friends", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.map.fog.c$f */
    static final class C3966f<T> implements Consumer<C2831a> {

        /* renamed from: e */
        final /* synthetic */ C3960c f10488e;

        C3966f(C3960c cVar) {
            this.f10488e = cVar;
        }

        /* renamed from: a */
        public final void accept(C2831a aVar) {
            C3943a a = this.f10488e.mo10614a();
            C12932j.m33815a((Object) aVar, "friend");
            String str = aVar.mo8858c().f8197a;
            C12932j.m33815a((Object) str, "friend.friend.uuid");
            a.mo10603d(str);
        }
    }

    /* renamed from: app.zenly.locator.map.fog.c$g */
    static final class C3967g<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C3967g f10489e = new C3967g();

        C3967g() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "Failed getting friendship validity", new Object[0]);
        }
    }

    public C3960c(C3943a aVar, C3968d dVar, C7339i iVar, String str) {
        C12932j.m33818b(aVar, "controller");
        C12932j.m33818b(dVar, "viewModel");
        this.f10471d = aVar;
        this.f10472e = dVar;
        this.f10473f = iVar;
        this.f10474g = str;
    }

    /* renamed from: b */
    public final boolean mo10617b() {
        return this.f10470c;
    }

    /* renamed from: c */
    public final void mo10618c() {
        String str = this.f10474g;
        if (str != null) {
            Disposable a = this.f10472e.mo10625a(str).mo36477d().mo36428a((C12286f) this.f10468a.getMainThread()).mo36412a((Consumer<? super T>) new C3964d<Object>(this), (Consumer<? super Throwable>) C3965e.f10487e);
            C12932j.m33815a((Object) a, "viewModel.fogUserInfoObs…nds\") }\n                )");
            C12773a.m33432a(a, this.f10469b);
            Disposable a2 = this.f10472e.mo10627b(this.f10474g).mo36428a((C12286f) this.f10468a.getMainThread()).mo36412a((Consumer<? super T>) new C3966f<Object>(this), (Consumer<? super Throwable>) C3967g.f10489e);
            C12932j.m33815a((Object) a2, "viewModel.friendshipVali…ity\") }\n                )");
            C12773a.m33432a(a2, this.f10469b);
            return;
        }
        C7339i iVar = this.f10473f;
        if (iVar != null) {
            this.f10470c = true;
            this.f10471d.mo10601a(iVar);
        }
    }

    /* renamed from: d */
    public final void mo10619d() {
        this.f10469b.mo36401a();
    }

    /* renamed from: a */
    public final C3943a mo10614a() {
        return this.f10471d;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final InvitationCallback m11583a(Context context) {
        return new C3961a(this, context, context, false);
    }

    /* renamed from: a */
    public final void mo10616a(C2538c0 c0Var, Context context, C7339i iVar) {
        C12932j.m33818b(c0Var, "inviteManager");
        C12932j.m33818b(context, "context");
        C12932j.m33818b(iVar, "contact");
        this.f10471d.mo10602a((Function0<C12956q>) new C3962b<C12956q>(this, c0Var, iVar, context));
    }

    /* renamed from: a */
    public final void mo10615a(C2538c0 c0Var, Context context, UserProto$User userProto$User, boolean z, int i) {
        C12932j.m33818b(c0Var, "inviteManager");
        C12932j.m33818b(context, "context");
        C12932j.m33818b(userProto$User, "user");
        C3943a aVar = this.f10471d;
        C3963c cVar = new C3963c(this, c0Var, userProto$User, z, i, context);
        aVar.mo10602a((Function0<C12956q>) cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m11586a(C3969a aVar) {
        boolean a = this.f10472e.mo10626a(aVar.mo10634e());
        this.f10470c = true;
        this.f10471d.mo10600a(aVar, a);
    }

    /* renamed from: a */
    public final long mo10613a(long j) {
        return this.f10472e.mo10624a(j);
    }
}
