package app.zenly.locator.cards.p046m;

import app.zenly.android.feature.descendants.repository.DescendantsRepository;
import app.zenly.locator.cards.models.WorldRankingCard;
import app.zenly.locator.cards.p045l.C1845l;
import app.zenly.locator.core.store.api.C2936a0;
import app.zenly.locator.core.store.api.FriendStore;
import kotlin.C12956q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12931i;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KDeclarationContainer;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.UserProto$User;
import p387h.p388a.C12143a;
import p389io.reactivex.C12291g;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.functions.Function;

/* renamed from: app.zenly.locator.cards.m.b */
public final class C1852b {

    /* renamed from: a */
    private C12275b f6073a;

    /* renamed from: b */
    private final ZenlyCore f6074b;

    /* renamed from: c */
    private final FriendStore f6075c;

    /* renamed from: d */
    private final DescendantsRepository f6076d;

    /* renamed from: e */
    private final WorldRankingCard f6077e;

    /* renamed from: f */
    private final C1845l f6078f;

    /* renamed from: app.zenly.locator.cards.m.b$a */
    static final class C1853a<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C1853a f6079e = new C1853a();

        C1853a() {
        }

        /* renamed from: a */
        public final UserProto$User apply(C2936a0 a0Var) {
            C12932j.m33818b(a0Var, "friend");
            return a0Var.mo9074a();
        }
    }

    /* renamed from: app.zenly.locator.cards.m.b$b */
    static final /* synthetic */ class C1854b extends C12931i implements Function1<Integer, C12956q> {
        C1854b(C1845l lVar) {
            super(1, lVar);
        }

        /* renamed from: a */
        public final void mo7508a(int i) {
            ((C1845l) this.f33505f).mo7497b(i);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C1845l.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "showRanking(I)V";
        }

        public final String getName() {
            return "showRanking";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo7508a(((Number) obj).intValue());
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.cards.m.b$c */
    static final /* synthetic */ class C1855c extends C12931i implements Function1<Throwable, C12956q> {

        /* renamed from: i */
        public static final C1855c f6080i = new C1855c();

        C1855c() {
            super(1);
        }

        /* renamed from: a */
        public final void mo7509a(Throwable th) {
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
            mo7509a((Throwable) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.cards.m.b$d */
    static final /* synthetic */ class C1856d extends C12931i implements Function1<UserProto$User, C12956q> {
        C1856d(C1845l lVar) {
            super(1, lVar);
        }

        /* renamed from: a */
        public final void mo7510a(UserProto$User userProto$User) {
            C12932j.m33818b(userProto$User, "p1");
            ((C1845l) this.f33505f).mo7496a(userProto$User);
        }

        /* renamed from: d */
        public final KDeclarationContainer mo6620d() {
            return C12946x.m33834a(C1845l.class);
        }

        /* renamed from: f */
        public final String mo6621f() {
            return "displayAvatar(Lco/znly/models/UserProto$User;)V";
        }

        public final String getName() {
            return "displayAvatar";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo7510a((UserProto$User) obj);
            return C12956q.f33541a;
        }
    }

    /* renamed from: app.zenly.locator.cards.m.b$e */
    static final /* synthetic */ class C1857e extends C12931i implements Function1<Throwable, C12956q> {

        /* renamed from: i */
        public static final C1857e f6081i = new C1857e();

        C1857e() {
            super(1);
        }

        /* renamed from: a */
        public final void mo7511a(Throwable th) {
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
            mo7511a((Throwable) obj);
            return C12956q.f33541a;
        }
    }

    public C1852b(ZenlyCore zenlyCore, FriendStore friendStore, DescendantsRepository descendantsRepository, WorldRankingCard worldRankingCard, C1845l lVar) {
        C12932j.m33818b(zenlyCore, "core");
        C12932j.m33818b(friendStore, "friendStore");
        C12932j.m33818b(descendantsRepository, "descendantsRepository");
        C12932j.m33818b(worldRankingCard, "worldRankingCard");
        C12932j.m33818b(lVar, "view");
        this.f6074b = zenlyCore;
        this.f6075c = friendStore;
        this.f6076d = descendantsRepository;
        this.f6077e = worldRankingCard;
        this.f6078f = lVar;
    }

    /* renamed from: c */
    private final C12291g<UserProto$User> m7373c() {
        if (this.f6077e.mo7580h()) {
            C12291g<UserProto$User> f = this.f6074b.userMeStream().mo36495f();
            C12932j.m33815a((Object) f, "core\n                .us…          .firstOrError()");
            return f;
        }
        C12291g<UserProto$User> f2 = this.f6075c.friend(this.f6077e.mo7578f()).mo36501i(C1853a.f6079e).mo36495f();
        C12932j.m33815a((Object) f2, "friendStore\n            …          .firstOrError()");
        return f2;
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [app.zenly.locator.cards.m.b$c, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v11, types: [app.zenly.locator.cards.m.b$e, kotlin.jvm.functions.Function1] */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: type inference failed for: r4v0, types: [app.zenly.locator.cards.m.c] */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX WARNING: type inference failed for: r3v2, types: [app.zenly.locator.cards.m.c] */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo7505a() {
        /*
            r5 = this;
            io.reactivex.disposables.b r0 = new io.reactivex.disposables.b
            r0.<init>()
            r5.f6073a = r0
            app.zenly.android.feature.descendants.repository.DescendantsRepository r0 = r5.f6076d
            app.zenly.locator.cards.models.WorldRankingCard r1 = r5.f6077e
            int r1 = r1.mo7577e()
            io.reactivex.g r0 = r0.getWorldwideRank(r1)
            io.reactivex.f r1 = p389io.reactivex.p390h.p392c.C12295a.m32802a()
            io.reactivex.g r0 = r0.mo36535a(r1)
            app.zenly.locator.cards.m.b$b r1 = new app.zenly.locator.cards.m.b$b
            app.zenly.locator.cards.l.l r2 = r5.f6078f
            r1.<init>(r2)
            app.zenly.locator.cards.m.c r2 = new app.zenly.locator.cards.m.c
            r2.<init>(r1)
            app.zenly.locator.cards.m.b$c r1 = app.zenly.locator.cards.p046m.C1852b.C1855c.f6080i
            if (r1 == 0) goto L_0x0031
            app.zenly.locator.cards.m.c r3 = new app.zenly.locator.cards.m.c
            r3.<init>(r1)
            r1 = r3
        L_0x0031:
            io.reactivex.functions.Consumer r1 = (p389io.reactivex.functions.Consumer) r1
            io.reactivex.disposables.Disposable r0 = r0.mo36533a(r2, r1)
            java.lang.String r1 = "descendantsRepository.ge…::showRanking, Timber::e)"
            kotlin.jvm.internal.C12932j.m33815a(r0, r1)
            io.reactivex.disposables.b r1 = r5.f6073a
            r2 = 0
            if (r1 == 0) goto L_0x007d
            p389io.reactivex.p405m.C12773a.m33432a(r0, r1)
            io.reactivex.g r0 = r5.m7373c()
            io.reactivex.f r1 = p389io.reactivex.p390h.p392c.C12295a.m32802a()
            io.reactivex.g r0 = r0.mo36535a(r1)
            app.zenly.locator.cards.m.b$d r1 = new app.zenly.locator.cards.m.b$d
            app.zenly.locator.cards.l.l r3 = r5.f6078f
            r1.<init>(r3)
            app.zenly.locator.cards.m.c r3 = new app.zenly.locator.cards.m.c
            r3.<init>(r1)
            app.zenly.locator.cards.m.b$e r1 = app.zenly.locator.cards.p046m.C1852b.C1857e.f6081i
            if (r1 == 0) goto L_0x0066
            app.zenly.locator.cards.m.c r4 = new app.zenly.locator.cards.m.c
            r4.<init>(r1)
            r1 = r4
        L_0x0066:
            io.reactivex.functions.Consumer r1 = (p389io.reactivex.functions.Consumer) r1
            io.reactivex.disposables.Disposable r0 = r0.mo36533a(r3, r1)
            java.lang.String r1 = "getUserForAvatarSingle()…displayAvatar, Timber::e)"
            kotlin.jvm.internal.C12932j.m33815a(r0, r1)
            io.reactivex.disposables.b r1 = r5.f6073a
            if (r1 == 0) goto L_0x0079
            p389io.reactivex.p405m.C12773a.m33432a(r0, r1)
            return
        L_0x0079:
            kotlin.jvm.internal.C12932j.m33814a()
            throw r2
        L_0x007d:
            kotlin.jvm.internal.C12932j.m33814a()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.cards.p046m.C1852b.mo7505a():void");
    }

    /* renamed from: b */
    public final void mo7506b() {
        C12275b bVar = this.f6073a;
        if (bVar != null) {
            bVar.dispose();
        }
    }
}
