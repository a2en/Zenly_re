package app.zenly.locator.descendants;

import android.app.Activity;
import android.content.Context;
import app.zenly.android.feature.descendants.DescendantsModule;
import app.zenly.android.feature.descendants.Navigation;
import app.zenly.android.feature.descendants.feedback.C1380a;
import app.zenly.android.feature.descendants.feedback.C1381b;
import app.zenly.android.feature.descendants.repository.DescendantsRepository;
import app.zenly.locator.core.glide.C2476d;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.glide.C2485i;
import app.zenly.locator.core.invitations.C2542d0;
import app.zenly.locator.core.store.p071di.C3015a;
import app.zenly.locator.experimental.referrer.ReferrerDetails.C3744d;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5343a.C5355l;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;
import p213co.znly.core.ZenlyCore;

/* renamed from: app.zenly.locator.descendants.c */
public final class C3506c implements DescendantsModule {

    /* renamed from: f */
    static final /* synthetic */ KProperty[] f9489f;

    /* renamed from: a */
    private final Lazy f9490a = C12896f.m33751a(new C3507a(this));

    /* renamed from: b */
    private final C3504a f9491b = new C3504a(this.f9493d);

    /* renamed from: c */
    private final Context f9492c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ZenlyCore f9493d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C5343a f9494e;

    /* renamed from: app.zenly.locator.descendants.c$a */
    static final class C3507a extends C12933k implements Function0<C3509d> {

        /* renamed from: f */
        final /* synthetic */ C3506c f9495f;

        C3507a(C3506c cVar) {
            this.f9495f = cVar;
            super(0);
        }

        public final C3509d invoke() {
            return new C3509d(this.f9495f.f9493d);
        }
    }

    /* renamed from: app.zenly.locator.descendants.c$b */
    public static final class C3508b implements Navigation {

        /* renamed from: a */
        final /* synthetic */ C3506c f9496a;

        C3508b(C3506c cVar) {
            this.f9496a = cVar;
        }

        public void navigateToAddFriends(Activity activity) {
            C12932j.m33818b(activity, "from");
            C5498a.m15602a(C5498a.f14119e.mo13125a(activity), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            C2542d0.f7602c.mo8682a(activity).mo8681a(C3744d.Descendants);
            this.f9496a.f9494e.mo12826a(C5355l.DESCENDANTS_LIST);
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(C3506c.class), "descendantsPrefs", "getDescendantsPrefs()Lapp/zenly/locator/descendants/ZenDescendantsPrefs;");
        C12946x.m33839a((C12940r) sVar);
        f9489f = new KProperty[]{sVar};
    }

    public C3506c(Context context, ZenlyCore zenlyCore, C5343a aVar) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(zenlyCore, "core");
        C12932j.m33818b(aVar, "analytics");
        this.f9492c = context;
        this.f9493d = zenlyCore;
        this.f9494e = aVar;
    }

    /* renamed from: a */
    private final C3509d m10690a() {
        Lazy lazy = this.f9490a;
        KProperty kProperty = f9489f[0];
        return (C3509d) lazy.getValue();
    }

    public C1380a provideDescendantsActionInterceptor() {
        return new C1380a(provideDescendantsPrefs(), provideTime());
    }

    public C1381b provideDescendantsNewCountInterceptor() {
        return new C1381b(provideDescendantsPrefs(), provideTime());
    }

    public DescendantsRepository provideDescendantsRepository() {
        return new C3523g(this.f9493d, C3015a.m9526a(this.f9492c).provideFriendStore(), C3015a.m9526a(this.f9492c).provideAlreadyOnZenlyStore());
    }

    public Navigation provideNavigation() {
        return new C3508b(this);
    }

    public C2477e provideAvatarLoader() {
        return new C2477e(this.f9492c);
    }

    public C3509d provideDescendantsPrefs() {
        return m10690a();
    }

    public C2485i provideGlide() {
        C2485i a = C2476d.m8582a(this.f9492c);
        C12932j.m33815a((Object) a, "GlideApp.with(context)");
        return a;
    }

    public C3504a provideTime() {
        return this.f9491b;
    }
}
