package app.zenly.locator.core.manager;

import app.zenly.locator.core.models.C2912x;
import app.zenly.locator.p143s.p148l.C5448c;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.core.C7129j1;
import p213co.znly.models.core.PinContextUIProto$PinContext;
import p389io.reactivex.C12279e;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.functions.Function;
import p389io.reactivex.functions.Predicate;

/* renamed from: app.zenly.locator.core.manager.o5 */
public final class C2776o5 {

    /* renamed from: c */
    public static final C2781e f8004c = new C2781e(null);

    /* renamed from: a */
    private final C12279e<C2912x> f8005a;

    /* renamed from: b */
    private final C12279e<C2912x> f8006b;

    /* renamed from: app.zenly.locator.core.manager.o5$a */
    static final class C2777a<T> implements Predicate<PinContextUIProto$PinContext> {

        /* renamed from: e */
        public static final C2777a f8007e = new C2777a();

        C2777a() {
        }

        /* renamed from: a */
        public final boolean test(PinContextUIProto$PinContext pinContextUIProto$PinContext) {
            C12932j.m33818b(pinContextUIProto$PinContext, "it");
            return pinContextUIProto$PinContext.getIsMe();
        }
    }

    /* renamed from: app.zenly.locator.core.manager.o5$b */
    static final class C2778b<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C2778b f8008e = new C2778b();

        C2778b() {
        }

        /* renamed from: a */
        public final C2912x apply(PinContextUIProto$PinContext pinContextUIProto$PinContext) {
            C12932j.m33818b(pinContextUIProto$PinContext, "it");
            return new C2912x(pinContextUIProto$PinContext);
        }
    }

    /* renamed from: app.zenly.locator.core.manager.o5$c */
    static final class C2779c<T> implements Predicate<PinContextUIProto$PinContext> {

        /* renamed from: e */
        public static final C2779c f8009e = new C2779c();

        C2779c() {
        }

        /* renamed from: a */
        public final boolean test(PinContextUIProto$PinContext pinContextUIProto$PinContext) {
            C12932j.m33818b(pinContextUIProto$PinContext, "it");
            return !pinContextUIProto$PinContext.getIsMe();
        }
    }

    /* renamed from: app.zenly.locator.core.manager.o5$d */
    static final class C2780d<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C2780d f8010e = new C2780d();

        C2780d() {
        }

        /* renamed from: a */
        public final C2912x apply(PinContextUIProto$PinContext pinContextUIProto$PinContext) {
            C12932j.m33818b(pinContextUIProto$PinContext, "it");
            return new C2912x(pinContextUIProto$PinContext);
        }
    }

    /* renamed from: app.zenly.locator.core.manager.o5$e */
    public static final class C2781e {

        /* renamed from: app.zenly.locator.core.manager.o5$e$a */
        private static final class C2782a {

            /* renamed from: a */
            private static final C2776o5 f8011a = new C2776o5(null);

            /* renamed from: b */
            public static final C2782a f8012b = new C2782a();

            private C2782a() {
            }

            /* renamed from: a */
            public final C2776o5 mo8838a() {
                return f8011a;
            }
        }

        private C2781e() {
        }

        /* renamed from: a */
        public final C2776o5 mo8837a() {
            return C2782a.f8012b.mo8838a();
        }

        public /* synthetic */ C2781e(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.core.manager.o5$f */
    static final class C2783f<T, R> implements Function<T, ObservableSource<? extends R>> {

        /* renamed from: e */
        public static final C2783f f8013e = new C2783f();

        C2783f() {
        }

        /* renamed from: a */
        public final C12279e<PinContextUIProto$PinContext> apply(C7129j1 j1Var) {
            C12932j.m33818b(j1Var, "it");
            return C12279e.m32623b((Iterable<? extends T>) j1Var.getPinContextsList());
        }
    }

    private C2776o5() {
        C12279e l = C5448c.m15478a().pinContextStream().mo36434a((Function<? super T, ? extends ObservableSource<? extends R>>) C2783f.f8013e).mo36506l();
        C12279e<C2912x> i = l.mo36459b((Predicate<? super T>) C2777a.f8007e).mo36501i(C2778b.f8008e);
        String str = "pinContextStream\n       …{ PinContextWrapper(it) }";
        C12932j.m33815a((Object) i, str);
        this.f8005a = i;
        C12279e<C2912x> i2 = l.mo36459b((Predicate<? super T>) C2779c.f8009e).mo36501i(C2780d.f8010e);
        C12932j.m33815a((Object) i2, str);
        this.f8006b = i2;
    }

    /* renamed from: c */
    public static final C2776o5 m9258c() {
        return f8004c.mo8837a();
    }

    /* renamed from: a */
    public final C12279e<C2912x> mo8831a() {
        return this.f8006b;
    }

    /* renamed from: b */
    public final C12279e<C2912x> mo8832b() {
        return this.f8005a;
    }

    public /* synthetic */ C2776o5(C12928f fVar) {
        this();
    }
}
