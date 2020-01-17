package app.zenly.locator.friendshipfacts;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import app.zenly.locator.friendshipfacts.FriendshipFactsPrefs.C3764a;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;
import p389io.reactivex.C12279e;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.friendshipfacts.g */
public final class C3784g implements FriendshipFactsPrefs {

    /* renamed from: a */
    private final C12785a<C3764a> f10112a;

    /* renamed from: b */
    private final SharedPreferences f10113b;

    /* renamed from: app.zenly.locator.friendshipfacts.g$a */
    public static final class C3785a {
        private C3785a() {
        }

        public /* synthetic */ C3785a(C12928f fVar) {
            this();
        }
    }

    static {
        new C3785a(null);
    }

    public C3784g(SharedPreferences sharedPreferences) {
        C12932j.m33818b(sharedPreferences, "sharedPreferences");
        this.f10113b = sharedPreferences;
        C12785a<C3764a> h = C12785a.m33446h(m11245a());
        C12932j.m33815a((Object) h, "BehaviorSubject.createDefault(state)");
        this.f10112a = h;
    }

    /* renamed from: a */
    private final C3764a m11245a() {
        return C3764a.f10069k.mo10332a(this.f10113b.getInt("prefs:friendshipFacts:state", C3764a.LOCKED.mo10331a()));
    }

    public C3764a currentState() {
        return m11245a();
    }

    public C12279e<C3764a> observeState() {
        C12279e<C3764a> g = this.f10112a.mo36496g();
        C12932j.m33815a((Object) g, "snapshot.hide()");
        return g;
    }

    public void onFriendshipFactsVisited() {
        if (m11245a() == C3764a.UNLOCKABLE || m11245a() == C3764a.UNKNOWN) {
            m11246a(C3764a.UNLOCKED);
        }
    }

    public void onUserLogged(UserProto$User userProto$User) {
        C12932j.m33818b(userProto$User, "user");
        if (userProto$User.getFriendsCount() < 8) {
            return;
        }
        if (m11245a() == C3764a.LOCKED) {
            m11246a(C3764a.UNLOCKABLE);
        } else if (m11245a() == C3764a.UNKNOWN) {
            m11246a(C3764a.UNLOCKED);
        }
    }

    public void onUserUpdate(UserProto$User userProto$User, boolean z) {
        C3764a aVar;
        C12932j.m33818b(userProto$User, "user");
        if (userProto$User.getFriendsCount() >= 8) {
            int i = C3786h.f10114a[m11245a().ordinal()];
            if (i == 1) {
                aVar = C3764a.UNLOCKED;
            } else if (i != 2) {
                aVar = m11245a();
            } else {
                aVar = C3764a.UNLOCKABLE;
            }
            m11246a(aVar);
        }
    }

    public void reset() {
        m11246a(C3764a.LOCKED);
    }

    /* renamed from: a */
    private final void m11246a(C3764a aVar) {
        if (aVar != m11245a()) {
            Editor edit = this.f10113b.edit();
            C12932j.m33815a((Object) edit, "this");
            edit.putInt("prefs:friendshipFacts:state", aVar.mo10331a());
            edit.apply();
            this.f10112a.onNext(aVar);
        }
    }
}
