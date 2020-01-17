package app.zenly.locator.modals.p119m2;

import android.annotation.SuppressLint;
import android.widget.Toast;
import app.zenly.android.feature.base.decision.C1322a;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.R;
import app.zenly.locator.core.invitations.C2587f0;
import app.zenly.locator.core.invitations.C2587f0.C2588a;
import app.zenly.locator.core.store.api.C2956k0;
import app.zenly.locator.core.util.C3194b0;
import app.zenly.locator.modals.C4550g2;
import app.zenly.locator.p207x.C6272z1;
import app.zenly.locator.recommendation.C5245d;
import app.zenly.locator.recommendation.C5245d.C5246a;
import com.bluelinelabs.conductor.C8819d;
import java.util.List;
import kotlin.C12956q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KDeclarationContainer;
import p213co.znly.models.C6950b0;
import p213co.znly.models.C7339i;
import p213co.znly.models.FriendRequestProto$FriendRequest.C6810b;
import p213co.znly.models.FriendRequestProto$FriendRequest.C6812c;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7142l0;
import p213co.znly.models.reversegeocoder.C7911b;
import p213co.znly.models.services.C8214o5;
import p387h.p388a.C12143a;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.modals.m2.c */
public final class C4605c {

    /* renamed from: a */
    private final ZenlySchedulers f12260a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C7142l0 f12261b;

    /* renamed from: c */
    private final C12275b f12262c = new C12275b();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f12263d;

    /* renamed from: e */
    private final boolean f12264e = C3194b0.m10163a(this.f12270k.mo9123c());
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f12265f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f12266g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f12267h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C4597a f12268i;

    /* renamed from: j */
    private final C4621e f12269j;

    /* renamed from: k */
    private final C2956k0 f12270k;

    /* renamed from: l */
    private final C8819d f12271l;

    /* renamed from: m */
    private final C5245d f12272m;

    /* renamed from: n */
    private final C1322a f12273n;

    /* renamed from: app.zenly.locator.modals.m2.c$a */
    static final class C4606a<T> implements Consumer<C7339i> {

        /* renamed from: e */
        final /* synthetic */ C4605c f12274e;

        C4606a(C4605c cVar) {
            this.f12274e = cVar;
        }

        /* renamed from: a */
        public final void accept(C7339i iVar) {
            this.f12274e.f12263d = true;
            C4597a a = this.f12274e.f12268i;
            C12932j.m33815a((Object) iVar, "contact");
            a.mo11743a(iVar);
        }
    }

    /* renamed from: app.zenly.locator.modals.m2.c$b */
    static final class C4607b<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C4607b f12275e = new C4607b();

        C4607b() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "Cannot get contact by phone number", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.modals.m2.c$c */
    static final class C4608c implements Action {

        /* renamed from: a */
        final /* synthetic */ C4605c f12276a;

        C4608c(C4605c cVar) {
            this.f12276a = cVar;
        }

        public final void run() {
            if (!this.f12276a.f12263d) {
                this.f12276a.f12268i.mo11736F();
            }
            this.f12276a.f12267h = true;
            this.f12276a.m13483e();
        }
    }

    /* renamed from: app.zenly.locator.modals.m2.c$d */
    static final class C4609d<T> implements Consumer<C7142l0> {

        /* renamed from: e */
        final /* synthetic */ C4605c f12277e;

        C4609d(C4605c cVar) {
            this.f12277e = cVar;
        }

        /* renamed from: a */
        public final void accept(C7142l0 l0Var) {
            this.f12277e.f12261b = l0Var;
        }
    }

    /* renamed from: app.zenly.locator.modals.m2.c$e */
    static final class C4610e<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C4610e f12278e = new C4610e();

        C4610e() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "Cannot get recommendations", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.modals.m2.c$f */
    static final class C4611f<T> implements Consumer<List<? extends UserProto$User>> {

        /* renamed from: e */
        final /* synthetic */ C4605c f12279e;

        C4611f(C4605c cVar) {
            this.f12279e = cVar;
        }

        /* renamed from: a */
        public final void accept(List<UserProto$User> list) {
            this.f12279e.f12265f = list.size();
            C4597a a = this.f12279e.f12268i;
            C12932j.m33815a((Object) list, "mutualFriends");
            a.mo11745a(list);
        }
    }

    /* renamed from: app.zenly.locator.modals.m2.c$g */
    static final class C4612g<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C4612g f12280e = new C4612g();

        C4612g() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "Cannot get mutual friends", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.modals.m2.c$h */
    static final class C4613h implements Action {

        /* renamed from: a */
        final /* synthetic */ C4605c f12281a;

        C4613h(C4605c cVar) {
            this.f12281a = cVar;
        }

        public final void run() {
            this.f12281a.f12266g = true;
            this.f12281a.m13483e();
        }
    }

    /* renamed from: app.zenly.locator.modals.m2.c$i */
    static final class C4614i<T> implements Consumer<C6812c> {

        /* renamed from: e */
        public static final C4614i f12282e = new C4614i();

        C4614i() {
        }

        /* renamed from: a */
        public final void accept(C6812c cVar) {
        }
    }

    /* renamed from: app.zenly.locator.modals.m2.c$j */
    static final class C4615j<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C4615j f12283e = new C4615j();

        C4615j() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
        }
    }

    /* renamed from: app.zenly.locator.modals.m2.c$k */
    static final /* synthetic */ class C4616k extends C12931i implements Function1<C7911b, C12956q> {
        C4616k(C4605c cVar) {
            super(1, cVar);
        }

        /* renamed from: a */
        public final void mo11765a(C7911b bVar) {
            C12932j.m33818b(bVar, "p1");
            ((C4605c) this.f33505f).m13475a(bVar);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C4605c.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "processAddress(Lco/znly/models/reversegeocoder/ReverseGeoCoderProto$Address;)V";
        }

        public final String getName() {
            return "processAddress";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11765a((C7911b) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.modals.m2.c$l */
    static final /* synthetic */ class C4617l extends C12931i implements Function1<Throwable, C12956q> {
        C4617l(C4605c cVar) {
            super(1, cVar);
        }

        /* renamed from: a */
        public final void mo11766a(Throwable th) {
            C12932j.m33818b(th, "p1");
            ((C4605c) this.f33505f).m13476a(th);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C4605c.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "processAddressError(Ljava/lang/Throwable;)V";
        }

        public final String getName() {
            return "processAddressError";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11766a((Throwable) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.modals.m2.c$m */
    static final class C4618m<T> implements Consumer<C8214o5> {

        /* renamed from: e */
        final /* synthetic */ C4605c f12284e;

        C4618m(C4605c cVar) {
            this.f12284e = cVar;
        }

        /* renamed from: a */
        public final void accept(C8214o5 o5Var) {
            this.f12284e.mo11751a(C6812c.rejected);
        }
    }

    /* renamed from: app.zenly.locator.modals.m2.c$n */
    static final class C4619n<T> implements Consumer<Throwable> {

        /* renamed from: e */
        final /* synthetic */ C4605c f12285e;

        C4619n(C4605c cVar) {
            this.f12285e = cVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Toast.makeText(this.f12285e.f12268i.mo23920b(), R.string.commons_content_oopserror, 0).show();
        }
    }

    public C4605c(C4597a aVar, C4621e eVar, C2956k0 k0Var, C8819d dVar, C5245d dVar2, C1322a aVar2) {
        C12932j.m33818b(aVar, "controller");
        C12932j.m33818b(eVar, "viewModel");
        String str = "friendRequest";
        C12932j.m33818b(k0Var, str);
        C12932j.m33818b(dVar2, "recommendationAnalytics");
        C12932j.m33818b(aVar2, "decisionApi");
        this.f12268i = aVar;
        this.f12269j = eVar;
        this.f12270k = k0Var;
        this.f12271l = dVar;
        this.f12272m = dVar2;
        this.f12273n = aVar2;
        this.f12260a = C1351e.m6372a(C4550g2.f12179b.mo19916a(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m13483e() {
        if (mo11753a()) {
            this.f12268i.mo11737G();
        }
    }

    /* renamed from: d */
    public final void mo11756d() {
        C4621e eVar = this.f12269j;
        String authorUuid = this.f12270k.mo9122b().getAuthorUuid();
        C12932j.m33815a((Object) authorUuid, "friendRequest.request.authorUuid");
        Disposable a = eVar.mo11774d(authorUuid).mo36428a((C12286f) this.f12260a.getMainThread()).mo36412a((Consumer<? super T>) new C4618m<Object>(this), (Consumer<? super Throwable>) new C4619n<Object>(this));
        C12932j.m33815a((Object) a, "viewModel.userBlock(frie…T).show() }\n            )");
        C12773a.m33432a(a, this.f12262c);
    }

    /* renamed from: b */
    public final void mo11754b() {
        C12275b bVar = this.f12262c;
        String authorPhoneNumber = this.f12270k.mo9122b().getAuthorPhoneNumber();
        C12932j.m33815a((Object) authorPhoneNumber, "friendRequest.request.authorPhoneNumber");
        String authorUuid = this.f12270k.mo9122b().getAuthorUuid();
        String str = "friendRequest.request.authorUuid";
        C12932j.m33815a((Object) authorUuid, str);
        bVar.mo36403a(m13469a(authorPhoneNumber), m13480c(authorUuid));
        if (this.f12273n.mo6511a("feature:recommendation")) {
            C12275b bVar2 = this.f12262c;
            String authorUuid2 = this.f12270k.mo9122b().getAuthorUuid();
            C12932j.m33815a((Object) authorUuid2, str);
            bVar2.add(m13477b(authorUuid2));
        }
    }

    /* renamed from: c */
    public final void mo11755c() {
        this.f12263d = false;
        this.f12265f = 0;
        this.f12266g = false;
        this.f12267h = false;
        this.f12262c.mo36401a();
    }

    /* renamed from: a */
    private final Disposable m13469a(String str) {
        Disposable a = this.f12269j.mo11770a(str).mo36428a((C12286f) this.f12260a.getMainThread()).mo36413a((Consumer<? super T>) new C4606a<Object>(this), (Consumer<? super Throwable>) C4607b.f12275e, (Action) new C4608c(this));
        C12932j.m33815a((Object) a, "viewModel.contact(phoneN…          }\n            )");
        return a;
    }

    /* renamed from: c */
    private final Disposable m13480c(String str) {
        Disposable a = this.f12269j.mo11772b(str).mo36428a((C12286f) this.f12260a.getMainThread()).mo36413a((Consumer<? super T>) new C4611f<Object>(this), (Consumer<? super Throwable>) C4612g.f12280e, (Action) new C4613h(this));
        C12932j.m33815a((Object) a, "viewModel.mutualFriends(…          }\n            )");
        return a;
    }

    /* renamed from: b */
    private final Disposable m13477b(String str) {
        Disposable a = this.f12269j.mo11773c(str).mo36535a((C12286f) this.f12260a.getMainThread()).mo36533a((Consumer<? super T>) new C4609d<Object>(this), (Consumer<? super Throwable>) C4610e.f12278e);
        C12932j.m33815a((Object) a, "viewModel.recommendation…dations\") }\n            )");
        return a;
    }

    /* renamed from: a */
    public final boolean mo11753a() {
        return this.f12266g && this.f12267h;
    }

    @SuppressLint({"CheckResult"})
    /* renamed from: a */
    public final void mo11751a(C6812c cVar) {
        C12932j.m33818b(cVar, "status");
        Integer num = null;
        Boolean valueOf = !this.f12266g ? null : Boolean.valueOf(this.f12263d);
        if (this.f12267h) {
            num = Integer.valueOf(this.f12265f);
        }
        Integer num2 = num;
        C2588a aVar = C2587f0.f7651C;
        C6810b source = this.f12270k.mo9122b().getSource();
        C12932j.m33815a((Object) source, "friendRequest.request.source");
        C2587f0 a = aVar.mo8693a(source);
        C8819d dVar = this.f12271l;
        if (dVar instanceof C6272z1) {
            ((C6272z1) dVar).mo14107a(this.f12268i.mo11740J());
        }
        if (cVar == C6812c.accepted) {
            C7142l0 l0Var = this.f12261b;
            if (l0Var == null || !l0Var.getShouldMakeRecommendations()) {
                C4597a.m13442a(this.f12268i, a, valueOf, this.f12264e, num2, false, 16, null);
            } else {
                this.f12268i.mo11742a(a, valueOf, this.f12264e, num2, false);
                if (l0Var.getPotentialMatchesCount() > 0) {
                    this.f12272m.mo12593a(C5246a.FRIEND_REQUEST_ACCEPTED);
                    this.f12268i.mo11738H();
                } else {
                    this.f12272m.mo12595b(C5246a.FRIEND_REQUEST_ACCEPTED);
                    this.f12268i.mo11739I();
                }
            }
        } else {
            this.f12268i.mo11741a(a, valueOf, this.f12264e, num2);
        }
        this.f12269j.mo11771a(this.f12270k.mo9124d(), cVar).mo36412a((Consumer<? super T>) C4614i.f12282e, (Consumer<? super Throwable>) C4615j.f12283e);
    }

    /* renamed from: a */
    public final void mo11752a(C6950b0 b0Var) {
        C12932j.m33818b(b0Var, "location");
        Disposable a = this.f12269j.mo11769a(b0Var.getLatitude(), b0Var.getLongitude()).mo36428a((C12286f) this.f12260a.getMainThread()).mo36412a((Consumer<? super T>) new C4620d<Object>(new C4616k(this)), (Consumer<? super Throwable>) new C4620d<Object>(new C4617l(this)));
        C12932j.m33815a((Object) a, "viewModel.geoReverseGeoc…s, ::processAddressError)");
        C12773a.m33432a(a, this.f12262c);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m13475a(C7911b bVar) {
        String locality = bVar.getLocality();
        boolean z = false;
        String str = null;
        String locality2 = !(locality == null || locality.length() == 0) ? bVar.getLocality() : null;
        String country = bVar.getCountry();
        if (country == null || country.length() == 0) {
            z = true;
        }
        if (!z) {
            str = bVar.getCountry();
        }
        this.f12268i.mo11744a(locality2, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m13476a(Throwable th) {
        C12143a.m32032b(th, "could not reverse geocode location", new Object[0]);
        this.f12268i.mo11735E();
    }
}
