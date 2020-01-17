package app.zenly.locator.core.util;

import app.zenly.locator.core.models.C2896p;
import app.zenly.locator.core.store.api.C2936a0;
import app.zenly.locator.core.store.api.C2956k0;
import java.text.Collator;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;
import p213co.znly.models.C7339i;
import p213co.znly.models.PingProto$Conversation.C6818b;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7117i;

/* renamed from: app.zenly.locator.core.util.g */
public final class C3205g {

    /* renamed from: a */
    private static final C3206a f8971a = new C3206a();

    /* renamed from: b */
    private static final C3208c f8972b = new C3208c();

    /* renamed from: c */
    private static final C3207b f8973c = new C3207b();

    /* renamed from: app.zenly.locator.core.util.g$a */
    public static final class C3206a extends C3201f<C7117i> {
        C3206a() {
        }

        /* renamed from: a */
        public int compare(C7117i iVar, C7117i iVar2) {
            C12932j.m33818b(iVar, "o1");
            C12932j.m33818b(iVar2, "o2");
            return C3219h.m10210a(iVar.getModifiedAt(), iVar2.getModifiedAt());
        }
    }

    /* renamed from: app.zenly.locator.core.util.g$b */
    public static final class C3207b extends C3201f<C2896p> {
        C3207b() {
        }

        /* renamed from: a */
        public int compare(C2896p pVar, C2896p pVar2) {
            C12932j.m33818b(pVar, "o1");
            C12932j.m33818b(pVar2, "o2");
            return Double.compare(pVar2.f8209m, pVar.f8209m);
        }
    }

    /* renamed from: app.zenly.locator.core.util.g$c */
    public static final class C3208c extends C3201f<UserProto$User> {
        C3208c() {
        }

        /* renamed from: a */
        public int compare(UserProto$User userProto$User, UserProto$User userProto$User2) {
            C12932j.m33818b(userProto$User, "o1");
            C12932j.m33818b(userProto$User2, "o2");
            String avatarUrlPrefix = userProto$User.getAvatarUrlPrefix();
            C12932j.m33815a((Object) avatarUrlPrefix, "o1.avatarUrlPrefix");
            int i = 1;
            boolean z = avatarUrlPrefix.length() > 0;
            String avatarUrlPrefix2 = userProto$User2.getAvatarUrlPrefix();
            C12932j.m33815a((Object) avatarUrlPrefix2, "o2.avatarUrlPrefix");
            if (z == (avatarUrlPrefix2.length() > 0)) {
                return 0;
            }
            if (z) {
                i = -1;
            }
            return i;
        }
    }

    /* renamed from: app.zenly.locator.core.util.g$d */
    public static final class C3209d extends C3201f<C7339i> {

        /* renamed from: g */
        static final /* synthetic */ KProperty[] f8974g;

        /* renamed from: e */
        private final Lazy f8975e = C12896f.m33751a(new C3210a(this));

        /* renamed from: f */
        final /* synthetic */ Locale f8976f;

        /* renamed from: app.zenly.locator.core.util.g$d$a */
        static final class C3210a extends C12933k implements Function0<Collator> {

            /* renamed from: f */
            final /* synthetic */ C3209d f8977f;

            C3210a(C3209d dVar) {
                this.f8977f = dVar;
                super(0);
            }

            public final Collator invoke() {
                return Collator.getInstance(this.f8977f.f8976f);
            }
        }

        static {
            C12941s sVar = new C12941s(C12946x.m33834a(C3209d.class), "collator", "getCollator()Ljava/text/Collator;");
            C12946x.m33839a((C12940r) sVar);
            f8974g = new KProperty[]{sVar};
        }

        C3209d(Locale locale) {
            this.f8976f = locale;
        }

        /* renamed from: a */
        public int compare(C7339i iVar, C7339i iVar2) {
            C12932j.m33818b(iVar, "u1");
            C12932j.m33818b(iVar2, "u2");
            return mo9627a().compare(iVar.getFull(), iVar2.getFull());
        }

        /* renamed from: a */
        public final Collator mo9627a() {
            Lazy lazy = this.f8975e;
            KProperty kProperty = f8974g[0];
            return (Collator) lazy.getValue();
        }
    }

    /* renamed from: app.zenly.locator.core.util.g$e */
    public static final class C3211e extends C3201f<C2956k0> {

        /* renamed from: g */
        static final /* synthetic */ KProperty[] f8978g;

        /* renamed from: e */
        private final Lazy f8979e = C12896f.m33751a(new C3212a(this));

        /* renamed from: f */
        final /* synthetic */ Locale f8980f;

        /* renamed from: app.zenly.locator.core.util.g$e$a */
        static final class C3212a extends C12933k implements Function0<Collator> {

            /* renamed from: f */
            final /* synthetic */ C3211e f8981f;

            C3212a(C3211e eVar) {
                this.f8981f = eVar;
                super(0);
            }

            public final Collator invoke() {
                return Collator.getInstance(this.f8981f.f8980f);
            }
        }

        static {
            C12941s sVar = new C12941s(C12946x.m33834a(C3211e.class), "collator", "getCollator()Ljava/text/Collator;");
            C12946x.m33839a((C12940r) sVar);
            f8978g = new KProperty[]{sVar};
        }

        C3211e(Locale locale) {
            this.f8980f = locale;
        }

        /* renamed from: a */
        public int compare(C2956k0 k0Var, C2956k0 k0Var2) {
            C12932j.m33818b(k0Var, "u1");
            C12932j.m33818b(k0Var2, "u2");
            return mo9630a().compare(k0Var.mo9123c().getName(), k0Var2.mo9123c().getName());
        }

        /* renamed from: a */
        public final Collator mo9630a() {
            Lazy lazy = this.f8979e;
            KProperty kProperty = f8978g[0];
            return (Collator) lazy.getValue();
        }
    }

    /* renamed from: app.zenly.locator.core.util.g$f */
    public static final class C3213f extends C3201f<C2936a0> {

        /* renamed from: g */
        static final /* synthetic */ KProperty[] f8982g;

        /* renamed from: e */
        private final Lazy f8983e = C12896f.m33751a(new C3214a(this));

        /* renamed from: f */
        final /* synthetic */ Locale f8984f;

        /* renamed from: app.zenly.locator.core.util.g$f$a */
        static final class C3214a extends C12933k implements Function0<Collator> {

            /* renamed from: f */
            final /* synthetic */ C3213f f8985f;

            C3214a(C3213f fVar) {
                this.f8985f = fVar;
                super(0);
            }

            public final Collator invoke() {
                return Collator.getInstance(this.f8985f.f8984f);
            }
        }

        static {
            C12941s sVar = new C12941s(C12946x.m33834a(C3213f.class), "collator", "getCollator()Ljava/text/Collator;");
            C12946x.m33839a((C12940r) sVar);
            f8982g = new KProperty[]{sVar};
        }

        C3213f(Locale locale) {
            this.f8984f = locale;
        }

        /* renamed from: a */
        public int compare(C2936a0 a0Var, C2936a0 a0Var2) {
            C12932j.m33818b(a0Var, "u1");
            C12932j.m33818b(a0Var2, "u2");
            return mo9633a().compare(a0Var.mo9074a().getName(), a0Var2.mo9074a().getName());
        }

        /* renamed from: a */
        public final Collator mo9633a() {
            Lazy lazy = this.f8983e;
            KProperty kProperty = f8982g[0];
            return (Collator) lazy.getValue();
        }
    }

    /* renamed from: app.zenly.locator.core.util.g$g */
    public static final class C3215g extends C3201f<C6818b> {

        /* renamed from: g */
        static final /* synthetic */ KProperty[] f8986g;

        /* renamed from: e */
        private final Lazy f8987e = C12896f.m33751a(new C3216a(this));

        /* renamed from: f */
        final /* synthetic */ Locale f8988f;

        /* renamed from: app.zenly.locator.core.util.g$g$a */
        static final class C3216a extends C12933k implements Function0<Collator> {

            /* renamed from: f */
            final /* synthetic */ C3215g f8989f;

            C3216a(C3215g gVar) {
                this.f8989f = gVar;
                super(0);
            }

            public final Collator invoke() {
                return Collator.getInstance(this.f8989f.f8988f);
            }
        }

        static {
            C12941s sVar = new C12941s(C12946x.m33834a(C3215g.class), "collator", "getCollator()Ljava/text/Collator;");
            C12946x.m33839a((C12940r) sVar);
            f8986g = new KProperty[]{sVar};
        }

        C3215g(Locale locale) {
            this.f8988f = locale;
        }

        /* renamed from: a */
        public int compare(C6818b bVar, C6818b bVar2) {
            C12932j.m33818b(bVar, "u1");
            C12932j.m33818b(bVar2, "u2");
            return mo9636a().compare(bVar.getNickname(), bVar2.getNickname());
        }

        /* renamed from: a */
        public final Collator mo9636a() {
            Lazy lazy = this.f8987e;
            KProperty kProperty = f8986g[0];
            return (Collator) lazy.getValue();
        }
    }

    /* renamed from: app.zenly.locator.core.util.g$h */
    public static final class C3217h extends C3201f<UserProto$User> {

        /* renamed from: g */
        static final /* synthetic */ KProperty[] f8990g;

        /* renamed from: e */
        private final Lazy f8991e = C12896f.m33751a(new C3218a(this));

        /* renamed from: f */
        final /* synthetic */ Locale f8992f;

        /* renamed from: app.zenly.locator.core.util.g$h$a */
        static final class C3218a extends C12933k implements Function0<Collator> {

            /* renamed from: f */
            final /* synthetic */ C3217h f8993f;

            C3218a(C3217h hVar) {
                this.f8993f = hVar;
                super(0);
            }

            public final Collator invoke() {
                return Collator.getInstance(this.f8993f.f8992f);
            }
        }

        static {
            C12941s sVar = new C12941s(C12946x.m33834a(C3217h.class), "collator", "getCollator()Ljava/text/Collator;");
            C12946x.m33839a((C12940r) sVar);
            f8990g = new KProperty[]{sVar};
        }

        C3217h(Locale locale) {
            this.f8992f = locale;
        }

        /* renamed from: a */
        public int compare(UserProto$User userProto$User, UserProto$User userProto$User2) {
            C12932j.m33818b(userProto$User, "u1");
            C12932j.m33818b(userProto$User2, "u2");
            return mo9639a().compare(userProto$User.getName(), userProto$User2.getName());
        }

        /* renamed from: a */
        public final Collator mo9639a() {
            Lazy lazy = this.f8991e;
            KProperty kProperty = f8990g[0];
            return (Collator) lazy.getValue();
        }
    }

    static {
        new C3205g();
    }

    private C3205g() {
    }

    /* renamed from: a */
    public static final C3201f<C7339i> m10190a(Locale locale) {
        C12932j.m33818b(locale, "locale");
        return new C3209d(locale);
    }

    /* renamed from: b */
    public static final C3201f<C2956k0> m10192b(Locale locale) {
        C12932j.m33818b(locale, "locale");
        return new C3211e(locale);
    }

    /* renamed from: c */
    public static final C3201f<C2936a0> m10194c(Locale locale) {
        C12932j.m33818b(locale, "locale");
        return new C3213f(locale);
    }

    /* renamed from: d */
    public static final C3201f<C6818b> m10195d(Locale locale) {
        C12932j.m33818b(locale, "locale");
        return new C3215g(locale);
    }

    /* renamed from: e */
    public static final C3201f<UserProto$User> m10196e(Locale locale) {
        C12932j.m33818b(locale, "locale");
        return new C3217h(locale);
    }

    /* renamed from: a */
    public static final C3201f<C7117i> m10189a() {
        return f8971a;
    }

    /* renamed from: b */
    public static final C3201f<C2896p> m10191b() {
        return f8973c;
    }

    /* renamed from: c */
    public static final C3201f<UserProto$User> m10193c() {
        return f8972b;
    }
}
