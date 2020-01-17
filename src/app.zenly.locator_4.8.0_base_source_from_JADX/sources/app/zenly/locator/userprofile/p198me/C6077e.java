package app.zenly.locator.userprofile.p198me;

import app.zenly.locator.userprofile.p198me.p204l.C6142i;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.UserProto$User;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.BiPredicate;
import p389io.reactivex.functions.Function;

/* renamed from: app.zenly.locator.userprofile.me.e */
public final class C6077e {

    /* renamed from: a */
    private final ZenlyCore f15297a;

    /* renamed from: app.zenly.locator.userprofile.me.e$a */
    static final class C6078a<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C6078a f15298e = new C6078a();

        C6078a() {
        }

        /* renamed from: a */
        public final C6142i apply(UserProto$User userProto$User) {
            C12932j.m33818b(userProto$User, "it");
            return new C6142i(userProto$User);
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.e$b */
    static final class C6079b<T1, T2> implements BiPredicate<C6142i, C6142i> {

        /* renamed from: a */
        public static final C6079b f15299a = new C6079b();

        C6079b() {
        }

        /* renamed from: a */
        public final boolean test(C6142i iVar, C6142i iVar2) {
            C12932j.m33818b(iVar, "o");
            C12932j.m33818b(iVar2, "n");
            return iVar.mo13982a(iVar2);
        }
    }

    public C6077e(ZenlyCore zenlyCore) {
        C12932j.m33818b(zenlyCore, "core");
        this.f15297a = zenlyCore;
    }

    /* renamed from: a */
    public final C12279e<C6142i> mo13893a() {
        C12279e<C6142i> a = this.f15297a.userMeStream().mo36466c((ObservableSource<? extends T>) C12279e.m32633q()).mo36501i(C6078a.f15298e).mo36431a((BiPredicate<? super T, ? super T>) C6079b.f15299a);
        C12932j.m33815a((Object) a, "core\n            .userMe…sTheSame(n)\n            }");
        return a;
    }
}
