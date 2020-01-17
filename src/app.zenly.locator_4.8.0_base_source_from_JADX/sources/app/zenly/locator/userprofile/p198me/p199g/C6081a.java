package app.zenly.locator.userprofile.p198me.p199g;

import java.util.List;
import kotlin.C12956q;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.core.C7210s0;
import p213co.znly.models.core.C7219t0;
import p213co.znly.models.services.C7983a5;
import p213co.znly.models.services.C8135k0;
import p213co.znly.models.services.C8149l0;
import p213co.znly.models.services.C8149l0.C8150a;
import p213co.znly.models.services.C8163m0;
import p213co.znly.models.services.C8389y4;
import p213co.znly.models.services.C8403z4;
import p213co.znly.models.services.C8403z4.C8404a;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12291g;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.Function;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.userprofile.me.g.a */
public final class C6081a {

    /* renamed from: a */
    private final C12785a<C12956q> f15312a;

    /* renamed from: b */
    private final C12785a<C12956q> f15313b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final ZenlyCore f15314c;

    /* renamed from: app.zenly.locator.userprofile.me.g.a$a */
    static final class C6082a<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C6082a f15315e = new C6082a();

        C6082a() {
        }

        /* renamed from: a */
        public final List<C7210s0> apply(C7219t0 t0Var) {
            C12932j.m33818b(t0Var, "bffs");
            return t0Var.getFriendsList();
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.g.a$b */
    static final class C6083b<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C6081a f15316e;

        /* renamed from: app.zenly.locator.userprofile.me.g.a$b$a */
        static final class C6084a<T, R> implements Function<T, R> {

            /* renamed from: e */
            public static final C6084a f15317e = new C6084a();

            C6084a() {
            }

            /* renamed from: a */
            public final List<String> apply(C8135k0 k0Var) {
                C12932j.m33818b(k0Var, "it");
                return k0Var.getUsersList();
            }
        }

        C6083b(C6081a aVar) {
            this.f15316e = aVar;
        }

        /* renamed from: a */
        public final C12279e<List<String>> apply(C12956q qVar) {
            C12932j.m33818b(qVar, "it");
            return this.f15316e.f15314c.bestFriendsHidden().mo36552d((Function<? super T, ? extends R>) C6084a.f15317e).mo36553e();
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.g.a$c */
    static final class C6085c<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        final /* synthetic */ C6081a f15318e;

        /* renamed from: app.zenly.locator.userprofile.me.g.a$c$a */
        static final class C6086a<T, R> implements Function<T, R> {

            /* renamed from: e */
            public static final C6086a f15319e = new C6086a();

            C6086a() {
            }

            /* renamed from: a */
            public final List<String> apply(C8389y4 y4Var) {
                C12932j.m33818b(y4Var, "it");
                return y4Var.getUsersList();
            }
        }

        C6085c(C6081a aVar) {
            this.f15318e = aVar;
        }

        /* renamed from: a */
        public final C12279e<List<String>> apply(C12956q qVar) {
            C12932j.m33818b(qVar, "it");
            return this.f15318e.f15314c.timeTogetherMutualLoveHidden().mo36552d((Function<? super T, ? extends R>) C6086a.f15319e).mo36553e();
        }
    }

    public C6081a(ZenlyCore zenlyCore) {
        C12932j.m33818b(zenlyCore, "core");
        this.f15314c = zenlyCore;
        C12785a<C12956q> h = C12785a.m33446h(C12956q.f33541a);
        String str = "BehaviorSubject.createDefault(Unit)";
        C12932j.m33815a((Object) h, str);
        this.f15312a = h;
        C12785a<C12956q> h2 = C12785a.m33446h(C12956q.f33541a);
        C12932j.m33815a((Object) h2, str);
        this.f15313b = h2;
    }

    /* renamed from: b */
    private final C12291g<C7983a5> m16846b(String str, boolean z) {
        ZenlyCore zenlyCore = this.f15314c;
        C8404a newBuilder = C8403z4.newBuilder();
        newBuilder.mo22344a(str);
        newBuilder.mo22345a(z);
        C12291g<C7983a5> timeTogetherMutualLoveHide = zenlyCore.timeTogetherMutualLoveHide((C8403z4) newBuilder.build());
        C12932j.m33815a((Object) timeTogetherMutualLoveHide, "core.timeTogetherMutualL…       .build()\n        )");
        return timeTogetherMutualLoveHide;
    }

    /* renamed from: c */
    public final C12279e<List<String>> mo13900c() {
        C12279e<List<String>> e = this.f15313b.mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C6085c<Object,Object>(this));
        C12932j.m33815a((Object) e, "mutualLovesHideStateChan…vable()\n                }");
        return e;
    }

    /* renamed from: d */
    public final C12291g<C7983a5> mo13902d(String str) {
        C12932j.m33818b(str, "friendUuid");
        return m16846b(str, false);
    }

    /* renamed from: e */
    public final void mo13904e() {
        this.f15313b.onNext(C12956q.f33541a);
    }

    /* renamed from: a */
    public final C12279e<List<C7210s0>> mo13896a() {
        C12279e<List<C7210s0>> c = this.f15314c.bestFriendsStream().mo36501i(C6082a.f15315e).mo36473c(C12848o.m33640a());
        C12932j.m33815a((Object) c, "core.bestFriendsStream()…orReturnItem(emptyList())");
        return c;
    }

    /* renamed from: d */
    public final void mo13903d() {
        this.f15312a.onNext(C12956q.f33541a);
    }

    /* renamed from: c */
    public final C12291g<C8163m0> mo13901c(String str) {
        C12932j.m33818b(str, "friendUuid");
        return m16845a(str, false);
    }

    /* renamed from: a */
    private final C12291g<C8163m0> m16845a(String str, boolean z) {
        ZenlyCore zenlyCore = this.f15314c;
        C8150a newBuilder = C8149l0.newBuilder();
        newBuilder.mo22161a(str);
        newBuilder.mo22162a(z);
        C12291g<C8163m0> bestFriendsHide = zenlyCore.bestFriendsHide((C8149l0) newBuilder.build());
        C12932j.m33815a((Object) bestFriendsHide, "core.bestFriendsHide(\n  …       .build()\n        )");
        return bestFriendsHide;
    }

    /* renamed from: b */
    public final C12291g<C7983a5> mo13899b(String str) {
        C12932j.m33818b(str, "friendUuid");
        return m16846b(str, true);
    }

    /* renamed from: b */
    public final C12279e<List<String>> mo13898b() {
        C12279e<List<String>> e = this.f15312a.mo36490e((Function<? super T, ? extends ObservableSource<? extends R>>) new C6083b<Object,Object>(this));
        C12932j.m33815a((Object) e, "bestFriendsHideStateChan…vable()\n                }");
        return e;
    }

    /* renamed from: a */
    public final C12291g<C8163m0> mo13897a(String str) {
        C12932j.m33818b(str, "friendUuid");
        return m16845a(str, true);
    }
}
