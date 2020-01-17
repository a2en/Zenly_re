package app.zenly.locator;

import android.content.Context;
import app.zenly.android.feature.base.p009di.Provider;
import app.zenly.android.feature.descendants.C1382g;
import app.zenly.android.feature.descendants.feedback.DescendantsPrefs;
import app.zenly.locator.core.manager.C2718k5;
import app.zenly.locator.core.manager.MeUserManager;
import app.zenly.locator.core.manager.p069di.C2666b;
import app.zenly.locator.core.store.C2931a;
import app.zenly.locator.core.store.C3010c;
import app.zenly.locator.core.store.C3023e;
import app.zenly.locator.core.store.C3027g;
import app.zenly.locator.core.store.C3034i;
import app.zenly.locator.core.store.C3045k;
import app.zenly.locator.core.store.api.ContactAlreadyOnZenlyStore;
import app.zenly.locator.core.store.p071di.C3015a;
import app.zenly.locator.descendants.p084i.C3542a;
import app.zenly.locator.notifications.p122di.C4722b;
import app.zenly.locator.p143s.C5367b;
import app.zenly.locator.p143s.p144i.C5425b;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p143s.p149m.C5450a;
import app.zenly.locator.support.C5724n0;
import app.zenly.locator.support.p168di.C5665b;
import app.zenly.locator.support.p170s0.C5803a;
import app.zenly.locator.userprofile.p198me.appicons.C6052e;
import app.zenly.locator.userprofile.p198me.appicons.C6055g;
import java.util.Set;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.c */
public final class C1745c {

    /* renamed from: app.zenly.locator.c$a */
    public static final class C1746a implements Provider<C2718k5> {

        /* renamed from: a */
        final /* synthetic */ Context f5847a;

        public C1746a(Context context) {
            this.f5847a = context;
        }

        public C2718k5 get() {
            return C2666b.m9049a(this.f5847a).mo8763a();
        }
    }

    /* renamed from: app.zenly.locator.c$b */
    public static final class C1747b implements Provider<DescendantsPrefs> {

        /* renamed from: a */
        final /* synthetic */ Context f5848a;

        public C1747b(Context context) {
            this.f5848a = context;
        }

        public DescendantsPrefs get() {
            return C1382g.m6431a(this.f5848a).provideDescendantsPrefs();
        }
    }

    /* renamed from: app.zenly.locator.c$c */
    public static final class C1748c implements Provider<C5724n0> {

        /* renamed from: a */
        final /* synthetic */ Context f5849a;

        public C1748c(Context context) {
            this.f5849a = context;
        }

        public C5724n0 get() {
            return C5665b.m15987a(this.f5849a).mo13329a();
        }
    }

    /* renamed from: app.zenly.locator.c$d */
    public static final class C1749d implements Provider<ContactAlreadyOnZenlyStore> {

        /* renamed from: a */
        final /* synthetic */ Context f5850a;

        public C1749d(Context context) {
            this.f5850a = context;
        }

        public ContactAlreadyOnZenlyStore get() {
            return C3015a.m9526a(this.f5850a).provideAlreadyOnZenlyStore();
        }
    }

    /* renamed from: app.zenly.locator.c$e */
    public static final class C1750e implements Provider<C6052e> {

        /* renamed from: a */
        final /* synthetic */ Context f5851a;

        public C1750e(Context context) {
            this.f5851a = context;
        }

        public C6052e get() {
            return C6055g.m16803a(this.f5851a);
        }
    }

    /* renamed from: app.zenly.locator.c$f */
    public static final class C1751f implements Provider<C3034i> {

        /* renamed from: a */
        final /* synthetic */ Context f5852a;

        public C1751f(Context context) {
            this.f5852a = context;
        }

        public C3034i get() {
            return C3015a.m9526a(this.f5852a).provideFriendStore();
        }
    }

    /* renamed from: app.zenly.locator.c$g */
    public static final class C1752g implements Provider<C3023e> {

        /* renamed from: a */
        final /* synthetic */ Context f5853a;

        public C1752g(Context context) {
            this.f5853a = context;
        }

        public C3023e get() {
            return C3015a.m9526a(this.f5853a).provideFriendRankStore();
        }
    }

    /* renamed from: app.zenly.locator.c$h */
    public static final class C1753h implements Provider<C3027g> {

        /* renamed from: a */
        final /* synthetic */ Context f5854a;

        public C1753h(Context context) {
            this.f5854a = context;
        }

        public C3027g get() {
            return C3015a.m9526a(this.f5854a).provideFriendRequestStore();
        }
    }

    /* renamed from: app.zenly.locator.c$i */
    public static final class C1754i implements Provider<C2931a> {

        /* renamed from: a */
        final /* synthetic */ Context f5855a;

        public C1754i(Context context) {
            this.f5855a = context;
        }

        public C2931a get() {
            return C3015a.m9526a(this.f5855a).provideAlreadyOnZenlyStore();
        }
    }

    /* renamed from: app.zenly.locator.c$j */
    public static final class C1755j implements Provider<C3010c> {

        /* renamed from: a */
        final /* synthetic */ Context f5856a;

        public C1755j(Context context) {
            this.f5856a = context;
        }

        public C3010c get() {
            return C3015a.m9526a(this.f5856a).provideSoonOnZenlyStore();
        }
    }

    /* renamed from: app.zenly.locator.c$k */
    public static final class C1756k implements Provider<C3045k> {

        /* renamed from: a */
        final /* synthetic */ Context f5857a;

        public C1756k(Context context) {
            this.f5857a = context;
        }

        public C3045k get() {
            return C3015a.m9526a(this.f5857a).provideFriendshipStore();
        }
    }

    /* renamed from: app.zenly.locator.c$l */
    public static final class C1757l implements Provider<MeUserManager> {

        /* renamed from: a */
        final /* synthetic */ Context f5858a;

        public C1757l(Context context) {
            this.f5858a = context;
        }

        public MeUserManager get() {
            return C2666b.m9049a(this.f5858a).mo8764b();
        }
    }

    /* renamed from: a */
    public static final Set<AppLifecycleObserver> m7146a(Context context) {
        C12932j.m33818b(context, "context");
        return C12845m0.m33634a((Object[]) new AppLifecycleObserver[]{C4722b.m13689a(context).mo11918a(), new C5450a(context)});
    }

    /* renamed from: b */
    public static final Set<AppLifecycleObserver> m7147b(Context context) {
        C12932j.m33818b(context, "context");
        C3820i iVar = new C3820i(new C1751f(context), new C1752g(context), new C1753h(context), new C1754i(context), new C1755j(context), new C1756k(context), new C1757l(context), new C1746a(context));
        return C12845m0.m33634a((Object[]) new AppLifecycleObserver[]{new C5367b(context, C5448c.m15478a(), new C1749d(context), new C1750e(context)), iVar, new C3542a(new C1747b(context)), new C5803a(new C1748c(context)), new C5425b(context, C5448c.m15478a())});
    }
}
