package app.zenly.locator.inbox;

import app.zenly.locator.p143s.p148l.C5448c;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.core.C7052a2;
import p213co.znly.models.core.C7176o;
import p213co.znly.models.services.C7975a1;
import p213co.znly.models.services.C7975a1.C7976a;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.ObservableTransformer;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.inbox.k */
public final class C3846k {

    /* renamed from: a */
    private final ZenlyCore f10230a = C5448c.m15478a();

    /* renamed from: app.zenly.locator.inbox.k$a */
    public static final class C3847a {

        /* renamed from: a */
        private final C7052a2 f10231a;

        public C3847a(C7052a2 a2Var, String str) {
            C12932j.m33818b(a2Var, "objects");
            C12932j.m33818b(str, "query");
            this.f10231a = a2Var;
        }

        /* renamed from: a */
        public final C7052a2 mo10445a() {
            return this.f10231a;
        }
    }

    /* renamed from: app.zenly.locator.inbox.k$b */
    public static final class C3848b {

        /* renamed from: a */
        private final C7176o f10232a;

        public C3848b(C7176o oVar, String str) {
            C12932j.m33818b(oVar, "objects");
            C12932j.m33818b(str, "query");
            this.f10232a = oVar;
        }

        /* renamed from: a */
        public final C7176o mo10446a() {
            return this.f10232a;
        }
    }

    /* renamed from: app.zenly.locator.inbox.k$c */
    static final class C3849c<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ String f10233e;

        C3849c(String str) {
            this.f10233e = str;
        }

        /* renamed from: a */
        public final C3847a apply(C7052a2 a2Var) {
            C12932j.m33818b(a2Var, "response");
            return new C3847a(a2Var, this.f10233e);
        }
    }

    /* renamed from: app.zenly.locator.inbox.k$d */
    static final class C3850d<T, R> implements Function<T, R> {

        /* renamed from: e */
        final /* synthetic */ String f10234e;

        C3850d(String str) {
            this.f10234e = str;
        }

        /* renamed from: a */
        public final C3848b apply(C7176o oVar) {
            C12932j.m33818b(oVar, "response");
            return new C3848b(oVar, this.f10234e);
        }
    }

    /* renamed from: app.zenly.locator.inbox.k$e */
    static final class C3851e<Upstream, Downstream> implements ObservableTransformer<String, String> {

        /* renamed from: a */
        public static final C3851e f10235a = new C3851e();

        /* renamed from: app.zenly.locator.inbox.k$e$a */
        static final class C3852a<T, R> implements Function<T, R> {

            /* renamed from: e */
            public static final C3852a f10236e = new C3852a();

            C3852a() {
            }

            /* renamed from: a */
            public final String apply(String str) {
                C12932j.m33818b(str, "query");
                return (String) C12857w.m33682f(C13029r.m34014a((CharSequence) str, new String[]{"\n"}, false, 0, 6, (Object) null));
            }
        }

        /* renamed from: app.zenly.locator.inbox.k$e$b */
        static final class C3853b<T> implements Predicate<String> {

            /* renamed from: e */
            public static final C3853b f10237e = new C3853b();

            C3853b() {
            }

            /* renamed from: a */
            public final boolean test(String str) {
                C12932j.m33818b(str, "query");
                return !(str.length() == 0);
            }
        }

        C3851e() {
        }

        public final C12279e<String> apply(C12279e<String> eVar) {
            C12932j.m33818b(eVar, "upstream");
            return eVar.mo36501i(C3852a.f10236e).mo36459b((Predicate<? super T>) C3853b.f10237e);
        }
    }

    /* renamed from: a */
    public final ObservableTransformer<String, String> mo10442a() {
        return C3851e.f10235a;
    }

    /* renamed from: b */
    public final C12279e<C3848b> mo10444b(String str) {
        C12932j.m33818b(str, "query");
        C7976a newBuilder = C7975a1.newBuilder();
        C12932j.m33815a((Object) newBuilder, "request");
        newBuilder.mo22052a(str);
        newBuilder.mo22051a(15);
        C12279e<C3848b> i = this.f10230a.chatConversationsSearch((C7975a1) newBuilder.build()).mo36466c((ObservableSource<? extends T>) C12279e.m32633q()).mo36501i(new C3850d(str));
        C12932j.m33815a((Object) i, "core.chatConversationsSe…esults(response, query) }");
        return i;
    }

    /* renamed from: a */
    public final C12279e<C3847a> mo10443a(String str) {
        C12932j.m33818b(str, "query");
        C12279e<C3847a> i = this.f10230a.contactsAlreadyOnZenlySearchBatch(str).mo36501i(new C3849c(str));
        C12932j.m33815a((Object) i, "core.contactsAlreadyOnZe…esults(response, query) }");
        return i;
    }
}
