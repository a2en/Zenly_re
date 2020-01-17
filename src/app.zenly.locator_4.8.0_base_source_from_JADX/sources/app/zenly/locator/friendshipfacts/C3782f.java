package app.zenly.locator.friendshipfacts;

import android.content.Context;
import app.zenly.locator.p143s.C5407g;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.jvm.internal.C12940r;
import kotlin.jvm.internal.C12941s;
import kotlin.jvm.internal.C12946x;
import kotlin.reflect.KProperty;

/* renamed from: app.zenly.locator.friendshipfacts.f */
public final class C3782f implements FriendshipFactsModule {

    /* renamed from: c */
    static final /* synthetic */ KProperty[] f10108c;

    /* renamed from: a */
    private final Lazy f10109a = C12896f.m33751a(new C3783a(this));
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f10110b;

    /* renamed from: app.zenly.locator.friendshipfacts.f$a */
    static final class C3783a extends C12933k implements Function0<C3784g> {

        /* renamed from: f */
        final /* synthetic */ C3782f f10111f;

        C3783a(C3782f fVar) {
            this.f10111f = fVar;
            super(0);
        }

        public final C3784g invoke() {
            return new C3784g(C5407g.f13966d.mo12991a(this.f10111f.f10110b).mo12986h());
        }
    }

    static {
        C12941s sVar = new C12941s(C12946x.m33834a(C3782f.class), "friendshipFactsPrefs", "getFriendshipFactsPrefs()Lapp/zenly/locator/friendshipfacts/FriendshipFactsPrefs;");
        C12946x.m33839a((C12940r) sVar);
        f10108c = new KProperty[]{sVar};
    }

    public C3782f(Context context) {
        C12932j.m33818b(context, "context");
        this.f10110b = context;
    }

    /* renamed from: a */
    private final FriendshipFactsPrefs m11244a() {
        Lazy lazy = this.f10109a;
        KProperty kProperty = f10108c[0];
        return (FriendshipFactsPrefs) lazy.getValue();
    }

    public FriendshipFactsPrefs provideFriendshipFactsPrefs() {
        return m11244a();
    }
}
