package app.zenly.locator.modals;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import app.zenly.android.feature.base.scheduling.C1351e;
import app.zenly.android.feature.base.scheduling.ZenlySchedulers;
import app.zenly.locator.core.analytics.tracker.AnalyticsTracker;
import app.zenly.locator.core.store.C3027g;
import app.zenly.locator.core.store.p071di.C3015a;
import app.zenly.locator.core.util.C3197d;
import app.zenly.locator.modals.C4545f2.C4546a;
import app.zenly.locator.modals.p120n2.C4629a;
import app.zenly.locator.modals.p121o2.C4656i;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5343a.C5347d;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5499a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.p143s.p160v.p161b.C5540g;
import app.zenly.locator.p207x.C6272z1;
import app.zenly.locator.recommendation.C5245d;
import app.zenly.locator.recommendation.C5245d.C5246a;
import app.zenly.locator.recommendation.C5248e;
import app.zenly.locator.recommendation.C5249f;
import app.zenly.locator.recommendation.C5265j;
import app.zenly.locator.recommendation.C5266k;
import com.bluelinelabs.conductor.C8819d;
import java.util.List;
import kotlin.C12956q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KDeclarationContainer;
import p213co.znly.core.ZenlyCore;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7142l0;
import p387h.p388a.C12143a;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Action;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.modals.q1 */
public final class C4664q1 extends ModalController {

    /* renamed from: Y */
    public static final C4665a f12417Y = new C4665a(null);

    /* renamed from: Q */
    private final ZenlySchedulers f12418Q = C1351e.m6372a(C5249f.f13535b.mo19916a("modal"));
    /* access modifiers changed from: private */

    /* renamed from: R */
    public final UserProto$User f12419R;

    /* renamed from: S */
    private final UserProto$User f12420S;

    /* renamed from: T */
    private C4629a f12421T;

    /* renamed from: U */
    private final C12275b f12422U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public C7142l0 f12423V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public boolean f12424W;

    /* renamed from: X */
    private C4656i f12425X;

    /* renamed from: app.zenly.locator.modals.q1$a */
    public static final class C4665a {
        private C4665a() {
        }

        /* renamed from: a */
        public final C4664q1 mo11878a(UserProto$User userProto$User, UserProto$User userProto$User2) throws InvalidProtocolBufferException {
            C12932j.m33818b(userProto$User, "potentialMatch");
            C12932j.m33818b(userProto$User2, "matchMaker");
            C3197d dVar = new C3197d(new Bundle());
            dVar.mo9613a("key:potentialMatch", userProto$User.toByteArray());
            dVar.mo9613a("key:matchMaker", userProto$User2.toByteArray());
            Bundle a = dVar.mo9605a();
            C12932j.m33815a((Object) a, "bundleBuilder.build()");
            return new C4664q1(a);
        }

        public /* synthetic */ C4665a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.modals.q1$b */
    static final class C4666b<T> implements Consumer<List<? extends UserProto$User>> {

        /* renamed from: e */
        final /* synthetic */ C4664q1 f12426e;

        C4666b(C4664q1 q1Var) {
            this.f12426e = q1Var;
        }

        /* renamed from: a */
        public final void accept(List<UserProto$User> list) {
            C4656i a = C4664q1.m13625a(this.f12426e);
            String a2 = C5540g.m15722a((Context) this.f12426e.mo9304A(), list);
            if (a2 != null) {
                C12932j.m33815a((Object) a2, "MutualFriendsTextFormatt…(requireActivity(), it)!!");
                C12932j.m33815a((Object) list, "it");
                a.mo11870a(a2, list);
                return;
            }
            C12932j.m33814a();
            throw null;
        }
    }

    /* renamed from: app.zenly.locator.modals.q1$c */
    static final class C4667c<T> implements Consumer<List<? extends UserProto$User>> {

        /* renamed from: e */
        public static final C4667c f12427e = new C4667c();

        C4667c() {
        }

        /* renamed from: a */
        public final void accept(List<UserProto$User> list) {
        }
    }

    /* renamed from: app.zenly.locator.modals.q1$d */
    static final /* synthetic */ class C4668d extends C12931i implements Function1<Throwable, C12956q> {

        /* renamed from: i */
        public static final C4668d f12428i = new C4668d();

        C4668d() {
            super(1);
        }

        /* renamed from: a */
        public final void mo11881a(Throwable th) {
            C12143a.m32028a(th);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C12143a.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public final String getName() {
            return "e";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11881a((Throwable) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.modals.q1$e */
    static final class C4669e<T> implements Consumer<C7142l0> {

        /* renamed from: e */
        final /* synthetic */ C4664q1 f12429e;

        C4669e(C4664q1 q1Var) {
            this.f12429e = q1Var;
        }

        /* renamed from: a */
        public final void accept(C7142l0 l0Var) {
            this.f12429e.f12423V = l0Var;
        }
    }

    /* renamed from: app.zenly.locator.modals.q1$f */
    static final class C4670f<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C4670f f12430e = new C4670f();

        C4670f() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "Cannot get recommendations", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.modals.q1$g */
    static final class C4671g implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C4664q1 f12431e;

        C4671g(C4664q1 q1Var) {
            this.f12431e = q1Var;
        }

        public final void onClick(View view) {
            this.f12431e.mo10303C();
        }
    }

    /* renamed from: app.zenly.locator.modals.q1$h */
    static final class C4672h implements Action {

        /* renamed from: a */
        final /* synthetic */ C4664q1 f12432a;

        C4672h(C4664q1 q1Var) {
            this.f12432a = q1Var;
        }

        public final void run() {
            C8819d l = this.f12432a.mo23947l();
            if (l instanceof C6272z1) {
                ((C6272z1) l).mo14107a(this.f12432a.mo11877E());
            }
            this.f12432a.f12424W = false;
            C7142l0 c = this.f12432a.f12423V;
            if (c == null || !c.getShouldMakeRecommendations()) {
                this.f12432a.mo23946k().mo23997a((C8819d) this.f12432a);
                return;
            }
            String str = "Analytics.get().tracker";
            String str2 = "Analytics.get()";
            if (c.getPotentialMatchesCount() > 0) {
                C5343a U = C5343a.m15160U();
                C12932j.m33815a((Object) U, str2);
                AnalyticsTracker a = U.mo12806a();
                C12932j.m33815a((Object) a, str);
                new C5245d(a).mo12593a(C5246a.FRIEND_REQUEST_SENT);
                C4664q1 q1Var = this.f12432a;
                UserProto$User b = q1Var.f12419R;
                ImageView avatar = C4664q1.m13625a(this.f12432a).getAvatar();
                C12932j.m33815a((Object) avatar, "modal.getAvatar()");
                C5248e.m14906a(q1Var, b, avatar);
                return;
            }
            C5343a U2 = C5343a.m15160U();
            C12932j.m33815a((Object) U2, str2);
            AnalyticsTracker a2 = U2.mo12806a();
            C12932j.m33815a((Object) a2, str);
            new C5245d(a2).mo12595b(C5246a.FRIEND_REQUEST_SENT);
            C4664q1 q1Var2 = this.f12432a;
            C5248e.m14905a(q1Var2, q1Var2.f12419R);
        }
    }

    /* renamed from: app.zenly.locator.modals.q1$i */
    static final class C4673i<T> implements Consumer<Boolean> {

        /* renamed from: e */
        public static final C4673i f12433e = new C4673i();

        C4673i() {
        }

        /* renamed from: a */
        public final void accept(Boolean bool) {
        }
    }

    /* renamed from: app.zenly.locator.modals.q1$j */
    static final /* synthetic */ class C4674j extends C12931i implements Function1<Throwable, C12956q> {

        /* renamed from: i */
        public static final C4674j f12434i = new C4674j();

        C4674j() {
            super(1);
        }

        /* renamed from: a */
        public final void mo11886a(Throwable th) {
            C12143a.m32028a(th);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C12143a.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "e(Ljava/lang/Throwable;)V";
        }

        public final String getName() {
            return "e";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo11886a((Throwable) obj);
            return C12956q.f33541a;
        }
    }

    public C4664q1(Bundle bundle) {
        C12932j.m33818b(bundle, "args");
        super(bundle);
        byte[] byteArray = bundle.getByteArray("key:potentialMatch");
        if (byteArray != null) {
            UserProto$User parseFrom = UserProto$User.parseFrom(byteArray);
            C12932j.m33815a((Object) parseFrom, "UserProto.User.parseFrom…y(KEY_POTENTIAL_MATCH)!!)");
            this.f12419R = parseFrom;
            byte[] byteArray2 = bundle.getByteArray("key:matchMaker");
            if (byteArray2 != null) {
                UserProto$User parseFrom2 = UserProto$User.parseFrom(byteArray2);
                C12932j.m33815a((Object) parseFrom2, "UserProto.User.parseFrom…Array(KEY_MATCH_MAKER)!!)");
                this.f12420S = parseFrom2;
                this.f12422U = new C12275b();
                return;
            }
            C12932j.m33814a();
            throw null;
        }
        C12932j.m33814a();
        throw null;
    }

    /* renamed from: a */
    public static final /* synthetic */ C4656i m13625a(C4664q1 q1Var) {
        C4656i iVar = q1Var.f12425X;
        if (iVar != null) {
            return iVar;
        }
        C12932j.m33820c("modal");
        throw null;
    }

    /* renamed from: a */
    public static final C4664q1 m13626a(UserProto$User userProto$User, UserProto$User userProto$User2) throws InvalidProtocolBufferException {
        return f12417Y.mo11878a(userProto$User, userProto$User2);
    }

    /* renamed from: B */
    public void mo7192B() {
        C8819d l = mo23947l();
        if (l instanceof C6272z1) {
            ((C6272z1) l).mo14119b(mo11877E());
        }
        C4629a aVar = this.f12421T;
        if (aVar != null) {
            aVar.mo11785a(this.f12419R, false);
            C5343a.m15160U().mo12817a(C5347d.FRIEND_RECOMMENDATION);
            mo23946k().mo23997a((C8819d) this);
            return;
        }
        C12932j.m33820c("viewModel");
        throw null;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [app.zenly.locator.modals.q1$j, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r3v1, types: [app.zenly.locator.modals.r1] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo10303C() {
        /*
            r5 = this;
            boolean r0 = r5.f12424W
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            app.zenly.locator.modals.n2.a r0 = r5.f12421T
            r1 = 0
            java.lang.String r2 = "viewModel"
            if (r0 == 0) goto L_0x0052
            co.znly.models.UserProto$User r3 = r5.f12419R
            r4 = 1
            r0.mo11785a(r3, r4)
            r5.f12424W = r4
            app.zenly.locator.modals.n2.a r0 = r5.f12421T
            if (r0 == 0) goto L_0x004e
            co.znly.models.UserProto$User r1 = r5.f12419R
            io.reactivex.e r0 = r0.mo11783a(r1)
            app.zenly.android.feature.base.scheduling.ZenlySchedulers r1 = r5.f12418Q
            app.zenly.android.feature.base.scheduling.b r1 = r1.getMainThread()
            io.reactivex.e r0 = r0.mo36428a(r1)
            app.zenly.locator.modals.q1$h r1 = new app.zenly.locator.modals.q1$h
            r1.<init>(r5)
            io.reactivex.e r0 = r0.mo36430a(r1)
            app.zenly.locator.modals.q1$i r1 = app.zenly.locator.modals.C4664q1.C4673i.f12433e
            app.zenly.locator.modals.q1$j r2 = app.zenly.locator.modals.C4664q1.C4674j.f12434i
            if (r2 == 0) goto L_0x003d
            app.zenly.locator.modals.r1 r3 = new app.zenly.locator.modals.r1
            r3.<init>(r2)
            r2 = r3
        L_0x003d:
            io.reactivex.functions.Consumer r2 = (p389io.reactivex.functions.Consumer) r2
            io.reactivex.disposables.Disposable r0 = r0.mo36412a(r1, r2)
            java.lang.String r1 = "viewModel.sendFriendRequ….subscribe({}, Timber::e)"
            kotlin.jvm.internal.C12932j.m33815a(r0, r1)
            io.reactivex.disposables.b r1 = r5.f12422U
            p389io.reactivex.p405m.C12773a.m33432a(r0, r1)
            return
        L_0x004e:
            kotlin.jvm.internal.C12932j.m33820c(r2)
            throw r1
        L_0x0052:
            kotlin.jvm.internal.C12932j.m33820c(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.modals.C4664q1.mo10303C():void");
    }

    /* renamed from: E */
    public C4545f2 mo11877E() {
        C4546a aVar = C4546a.RECOMMENDATION;
        String uuid = this.f12419R.getUuid();
        C12932j.m33815a((Object) uuid, "potentialMatch.uuid");
        return new C4545f2(aVar, uuid);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo10333r() {
        this.f12422U.mo36401a();
        super.mo10333r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public void mo7097y() {
        super.mo7097y();
        C5343a.m15160U().mo12859b(C5347d.FRIEND_RECOMMENDATION);
        C5499a aVar = C5498a.f14119e;
        Activity A = mo9304A();
        C12932j.m33815a((Object) A, "requireActivity()");
        aVar.mo13125a(A).mo13124a(C5501c.HEAVY, C5500b.REWARD, 2);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [app.zenly.locator.modals.q1$d, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r5v0, types: [app.zenly.locator.modals.r1] */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public app.zenly.locator.modals.p121o2.C4655h mo10304b(android.view.LayoutInflater r7, android.view.ViewGroup r8) {
        /*
            r6 = this;
            java.lang.String r0 = "inflater"
            kotlin.jvm.internal.C12932j.m33818b(r7, r0)
            java.lang.String r7 = "container"
            kotlin.jvm.internal.C12932j.m33818b(r8, r7)
            android.content.Context r7 = r8.getContext()
            app.zenly.locator.modals.o2.i r8 = new app.zenly.locator.modals.o2.i
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C12932j.m33815a(r7, r0)
            r8.<init>(r7)
            r6.f12425X = r8
            app.zenly.locator.modals.o2.i r7 = r6.f12425X
            java.lang.String r8 = "modal"
            r0 = 0
            if (r7 == 0) goto L_0x00f1
            co.znly.models.UserProto$User r1 = r6.f12420S
            r7.setMatchMaker(r1)
            app.zenly.locator.modals.o2.i r7 = r6.f12425X
            if (r7 == 0) goto L_0x00ed
            co.znly.models.UserProto$User r1 = r6.f12419R
            r7.setPotentialMatch(r1)
            app.zenly.locator.modals.n2.a r7 = r6.f12421T
            java.lang.String r1 = "viewModel"
            if (r7 == 0) goto L_0x00e9
            co.znly.models.UserProto$User r2 = r6.f12419R
            java.lang.String r2 = r2.getUuid()
            java.lang.String r3 = "potentialMatch.uuid"
            kotlin.jvm.internal.C12932j.m33815a(r2, r3)
            io.reactivex.e r7 = r7.mo11784a(r2)
            app.zenly.android.feature.base.scheduling.ZenlySchedulers r2 = r6.f12418Q
            app.zenly.android.feature.base.scheduling.b r2 = r2.getMainThread()
            io.reactivex.e r7 = r7.mo36428a(r2)
            app.zenly.locator.modals.q1$b r2 = new app.zenly.locator.modals.q1$b
            r2.<init>(r6)
            io.reactivex.e r7 = r7.mo36455b(r2)
            app.zenly.locator.modals.q1$c r2 = app.zenly.locator.modals.C4664q1.C4667c.f12427e
            app.zenly.locator.modals.q1$d r4 = app.zenly.locator.modals.C4664q1.C4668d.f12428i
            if (r4 == 0) goto L_0x0063
            app.zenly.locator.modals.r1 r5 = new app.zenly.locator.modals.r1
            r5.<init>(r4)
            r4 = r5
        L_0x0063:
            io.reactivex.functions.Consumer r4 = (p389io.reactivex.functions.Consumer) r4
            io.reactivex.disposables.Disposable r7 = r7.mo36412a(r2, r4)
            java.lang.String r2 = "viewModel.mutualFriends(….subscribe({}, Timber::e)"
            kotlin.jvm.internal.C12932j.m33815a(r7, r2)
            io.reactivex.disposables.b r2 = r6.f12422U
            p389io.reactivex.p405m.C12773a.m33432a(r7, r2)
            android.app.Activity r7 = r6.mo9304A()
            java.lang.String r2 = "requireActivity()"
            kotlin.jvm.internal.C12932j.m33815a(r7, r2)
            app.zenly.android.feature.base.decision.a r7 = app.zenly.locator.decision.C3444a.m10686a(r7)
            java.lang.String r2 = "feature:recommendation"
            boolean r7 = r7.mo6511a(r2)
            if (r7 == 0) goto L_0x00bd
            app.zenly.locator.modals.n2.a r7 = r6.f12421T
            if (r7 == 0) goto L_0x00b9
            co.znly.models.UserProto$User r1 = r6.f12419R
            java.lang.String r1 = r1.getUuid()
            kotlin.jvm.internal.C12932j.m33815a(r1, r3)
            io.reactivex.g r7 = r7.mo11786b(r1)
            app.zenly.android.feature.base.scheduling.ZenlySchedulers r1 = r6.f12418Q
            app.zenly.android.feature.base.scheduling.b r1 = r1.getMainThread()
            io.reactivex.g r7 = r7.mo36535a(r1)
            app.zenly.locator.modals.q1$e r1 = new app.zenly.locator.modals.q1$e
            r1.<init>(r6)
            app.zenly.locator.modals.q1$f r2 = app.zenly.locator.modals.C4664q1.C4670f.f12430e
            io.reactivex.disposables.Disposable r7 = r7.mo36533a(r1, r2)
            java.lang.String r1 = "viewModel.recommendation…ons\") }\n                )"
            kotlin.jvm.internal.C12932j.m33815a(r7, r1)
            io.reactivex.disposables.b r1 = r6.f12422U
            p389io.reactivex.p405m.C12773a.m33432a(r7, r1)
            goto L_0x00bd
        L_0x00b9:
            kotlin.jvm.internal.C12932j.m33820c(r1)
            throw r0
        L_0x00bd:
            app.zenly.locator.modals.o2.i r7 = r6.f12425X
            if (r7 == 0) goto L_0x00e5
            int r1 = app.zenly.locator.C3891l.add_as_friend_button
            android.view.View r7 = r7.mo11868a(r1)
            android.widget.Button r7 = (android.widget.Button) r7
            app.zenly.locator.modals.q1$g r1 = new app.zenly.locator.modals.q1$g
            r1.<init>(r6)
            r7.setOnClickListener(r1)
            app.zenly.locator.modals.o2.i r7 = r6.f12425X
            if (r7 == 0) goto L_0x00e1
            r7.mo11869a()
            app.zenly.locator.modals.o2.i r7 = r6.f12425X
            if (r7 == 0) goto L_0x00dd
            return r7
        L_0x00dd:
            kotlin.jvm.internal.C12932j.m33820c(r8)
            throw r0
        L_0x00e1:
            kotlin.jvm.internal.C12932j.m33820c(r8)
            throw r0
        L_0x00e5:
            kotlin.jvm.internal.C12932j.m33820c(r8)
            throw r0
        L_0x00e9:
            kotlin.jvm.internal.C12932j.m33820c(r1)
            throw r0
        L_0x00ed:
            kotlin.jvm.internal.C12932j.m33820c(r8)
            throw r0
        L_0x00f1:
            kotlin.jvm.internal.C12932j.m33820c(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.modals.C4664q1.mo10304b(android.view.LayoutInflater, android.view.ViewGroup):app.zenly.locator.modals.o2.h");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        C12932j.m33818b(view, "view");
        C4656i iVar = this.f12425X;
        if (iVar != null) {
            iVar.mo11871b();
            super.mo7066c(view);
            return;
        }
        C12932j.m33820c("modal");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        C12932j.m33818b(context, "context");
        C3027g provideFriendRequestStore = C3015a.m9526a(context).provideFriendRequestStore();
        Activity A = mo9304A();
        String str = "requireActivity()";
        C12932j.m33815a((Object) A, str);
        Activity A2 = mo9304A();
        C12932j.m33815a((Object) A2, str);
        C5266k b = C5265j.m14924a(A2).mo12619b();
        ZenlyCore a = C5448c.m15478a();
        C5343a U = C5343a.m15160U();
        C12932j.m33815a((Object) U, "Analytics.get()");
        C4629a aVar = new C4629a(A, provideFriendRequestStore, b, a, U);
        this.f12421T = aVar;
    }

    /* renamed from: a */
    public void mo8182a(int i, int i2, Intent intent) {
        if (i == 101) {
            mo23946k().mo23997a((C8819d) this);
        } else {
            super.mo8182a(i, i2, intent);
        }
    }
}
