package app.zenly.locator.experimental.referrer;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import app.zenly.android.feature.base.decision.C1322a;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.core.analytics.tracker.AnalyticsTracker;
import app.zenly.locator.core.invitations.C2538c0;
import app.zenly.locator.core.invitations.C2587f0;
import app.zenly.locator.core.invitations.C2623w;
import app.zenly.locator.core.invitations.C2625y;
import app.zenly.locator.core.invitations.C2625y.C2626a;
import app.zenly.locator.core.invitations.InvitationCallback;
import app.zenly.locator.decision.C3444a;
import app.zenly.locator.modals.ModalController;
import app.zenly.locator.modals.p121o2.C4655h;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5407g;
import app.zenly.locator.p143s.C5407g.C5408a;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p196u.C5942a;
import app.zenly.locator.p196u.p197b.C5943a;
import com.android.installreferrer.api.C8695a;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;
import p213co.znly.models.UserProto$User;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.experimental.referrer.c */
public final class C3751c extends ModalController {

    /* renamed from: U */
    static final /* synthetic */ KProperty[] f10037U;

    /* renamed from: V */
    public static final C3752a f10038V = new C3752a(null);

    /* renamed from: Q */
    private final ZenlySchedulers f10039Q = C1351e.m6372a(C5942a.f14960b.mo19916a("referrerModal"));

    /* renamed from: R */
    private final C12275b f10040R = new C12275b();
    /* access modifiers changed from: private */

    /* renamed from: S */
    public UserProto$User f10041S;

    /* renamed from: T */
    private final Lazy f10042T;

    /* renamed from: app.zenly.locator.experimental.referrer.c$a */
    public static final class C3752a {
        private C3752a() {
        }

        /* renamed from: a */
        public final C3751c mo10305a(String str) {
            C12932j.m33818b(str, "installReferrer");
            Bundle bundle = new Bundle();
            bundle.putString("args:install_referrer", str);
            return new C3751c(bundle);
        }

        public /* synthetic */ C3752a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.experimental.referrer.c$b */
    static final class C3753b extends C12933k implements Function0<String> {

        /* renamed from: f */
        final /* synthetic */ Bundle f10043f;

        C3753b(Bundle bundle) {
            this.f10043f = bundle;
            super(0);
        }

        public final String invoke() {
            String string = this.f10043f.getString("args:install_referrer");
            if (string != null) {
                return string;
            }
            C12932j.m33814a();
            throw null;
        }
    }

    /* renamed from: app.zenly.locator.experimental.referrer.c$c */
    static final class C3754c<T> implements Consumer<UserProto$User> {

        /* renamed from: e */
        final /* synthetic */ C3751c f10044e;

        /* renamed from: f */
        final /* synthetic */ C3755d f10045f;

        C3754c(C3751c cVar, C3755d dVar) {
            this.f10044e = cVar;
            this.f10045f = dVar;
        }

        /* renamed from: a */
        public final void accept(UserProto$User userProto$User) {
            C3751c cVar = this.f10044e;
            C12932j.m33815a((Object) userProto$User, "it");
            cVar.f10041S = userProto$User;
            this.f10045f.setAvatar(userProto$User);
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(C3751c.class), "installReferrer", "getInstallReferrer()Ljava/lang/String;");
        C12946x.m33839a((C12940r) sVar);
        f10037U = new KProperty[]{sVar};
    }

    public C3751c(Bundle bundle) {
        C12932j.m33818b(bundle, "args");
        super(bundle);
        this.f10042T = C12896f.m33751a(new C3753b(bundle));
    }

    /* renamed from: E */
    private final String m11192E() {
        Lazy lazy = this.f10042T;
        KProperty kProperty = f10037U[0];
        return (String) lazy.getValue();
    }

    /* renamed from: d */
    public static final C3751c m11194d(String str) {
        return f10038V.mo10305a(str);
    }

    /* renamed from: B */
    public void mo7192B() {
        C3756e eVar = new C3756e();
        C5343a U = C5343a.m15160U();
        C12932j.m33815a((Object) U, "Analytics.get()");
        AnalyticsTracker a = U.mo12806a();
        C12932j.m33815a((Object) a, "Analytics.get().tracker");
        C5943a aVar = new C5943a(a, C5448c.m15478a());
        Activity A = mo9304A();
        String str = "requireActivity()";
        C12932j.m33815a((Object) A, str);
        C1322a a2 = C3444a.m10686a(A);
        C8695a a3 = C8695a.m20457a((Context) mo9304A()).mo23483a();
        C12932j.m33815a((Object) a3, "InstallReferrerClient.ne…equireActivity()).build()");
        C5408a aVar2 = C5407g.f13966d;
        Activity A2 = mo9304A();
        C12932j.m33815a((Object) A2, str);
        C3748b bVar = new C3748b(eVar, aVar, a2, a3, aVar2.mo12991a(A2).mo12986h());
        bVar.mo10298a();
        super.mo7192B();
    }

    /* renamed from: C */
    public void mo10303C() {
        C2538c0 a = C2538c0.m8837a(mo9304A());
        C2626a aVar = C2625y.f7738e;
        C2587f0 f0Var = C2587f0.REFERRER;
        UserProto$User userProto$User = this.f10041S;
        if (userProto$User != null) {
            C2625y a2 = C2626a.m8955a(aVar, f0Var, userProto$User, false, null, false, 28, null);
            Activity A = mo9304A();
            C12932j.m33815a((Object) A, "requireActivity()");
            a.mo8670a(a2, (InvitationCallback) new C2623w(A, true));
            super.mo10303C();
            return;
        }
        C12932j.m33820c("referrer");
        throw null;
    }

    /* renamed from: b */
    public C4655h mo10304b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        Context context = viewGroup.getContext();
        C12932j.m33815a((Object) context, "container.context");
        C3755d dVar = new C3755d(context);
        Disposable d = C5448c.m15478a().userPublicStream(m11192E()).mo36428a((C12286f) this.f10039Q.getMainThread()).mo36452b((C12286f) this.f10039Q.getComputation()).mo36476d((Consumer<? super T>) new C3754c<Object>(this, dVar));
        C12932j.m33815a((Object) d, "ZenlyCoreProvider.get().…tAvatar(it)\n            }");
        C12773a.m33432a(d, this.f10040R);
        return dVar;
    }
}
