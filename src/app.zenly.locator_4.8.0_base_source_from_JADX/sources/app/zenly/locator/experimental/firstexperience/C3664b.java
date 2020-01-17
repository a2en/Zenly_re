package app.zenly.locator.experimental.firstexperience;

import android.app.Activity;
import app.zenly.android.feature.base.decision.C1322a;
import app.zenly.locator.core.contracts.NavigationContract;
import app.zenly.locator.p196u.p197b.C5943a;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.experimental.firstexperience.b */
public abstract class C3664b {

    /* renamed from: a */
    public static final C3665a f9821a = new C3665a(null);

    /* renamed from: app.zenly.locator.experimental.firstexperience.b$a */
    public static final class C3665a {
        private C3665a() {
        }

        /* renamed from: a */
        public final C3664b mo10177a(C5943a aVar, C1322a aVar2, UserProto$User userProto$User, int i, NavigationContract navigationContract, C3677h hVar) {
            C12932j.m33818b(aVar, "analytics");
            C12932j.m33818b(aVar2, "decisionApi");
            C12932j.m33818b(userProto$User, "user");
            C12932j.m33818b(navigationContract, "navigationContract");
            C12932j.m33818b(hVar, "noFriendPreferences");
            if (aVar2.mo6511a("feature:noFriendDialogSingleFeature")) {
                C3671e eVar = new C3671e(aVar, userProto$User, i, navigationContract, hVar);
                return eVar;
            } else if (aVar2.mo6511a("feature:noFriendDialogMultipleFeature")) {
                C3674f fVar = new C3674f(aVar, userProto$User, i, navigationContract, hVar);
                return fVar;
            } else if (!aVar2.mo6511a("feature:noFriendDialogCarouselFeature")) {
                return new C3676g(aVar, userProto$User, i, hVar);
            } else {
                C3666c cVar = new C3666c(aVar, userProto$User, i, navigationContract, hVar);
                return cVar;
            }
        }

        public /* synthetic */ C3665a(C12928f fVar) {
            this();
        }
    }

    private C3664b() {
    }

    /* renamed from: a */
    public static final C3664b m11016a(C5943a aVar, C1322a aVar2, UserProto$User userProto$User, int i, NavigationContract navigationContract, C3677h hVar) {
        return f9821a.mo10177a(aVar, aVar2, userProto$User, i, navigationContract, hVar);
    }

    /* renamed from: a */
    public abstract void mo10175a(Activity activity);

    /* renamed from: a */
    public abstract boolean mo10176a();

    public /* synthetic */ C3664b(C12928f fVar) {
        this();
    }
}
