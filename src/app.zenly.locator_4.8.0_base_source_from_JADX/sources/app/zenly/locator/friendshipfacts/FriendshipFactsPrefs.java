package app.zenly.locator.friendshipfacts;

import p213co.znly.models.UserProto$User;
import p389io.reactivex.C12279e;

public interface FriendshipFactsPrefs {

    /* renamed from: app.zenly.locator.friendshipfacts.FriendshipFactsPrefs$a */
    public enum C3764a {
        UNKNOWN(1),
        LOCKED(2),
        UNLOCKABLE(3),
        UNLOCKED(4);
        

        /* renamed from: k */
        public static final C3765a f10069k = null;

        /* renamed from: e */
        private final int f10070e;

        /* renamed from: app.zenly.locator.friendshipfacts.FriendshipFactsPrefs$a$a */
        public static final class C3765a {
            private C3765a() {
            }

            /* renamed from: a */
            public final C3764a mo10332a(int i) {
                if (i == C3764a.LOCKED.mo10331a()) {
                    return C3764a.LOCKED;
                }
                if (i == C3764a.UNLOCKABLE.mo10331a()) {
                    return C3764a.UNLOCKABLE;
                }
                if (i == C3764a.UNLOCKED.mo10331a()) {
                    return C3764a.UNLOCKED;
                }
                return C3764a.UNKNOWN;
            }

            public /* synthetic */ C3765a(C12928f fVar) {
                this();
            }
        }

        static {
            f10069k = new C3765a(null);
        }

        private C3764a(int i) {
            this.f10070e = i;
        }

        /* renamed from: a */
        public final int mo10331a() {
            return this.f10070e;
        }
    }

    C3764a currentState();

    C12279e<C3764a> observeState();

    void onFriendshipFactsVisited();

    void onUserLogged(UserProto$User userProto$User);

    void onUserUpdate(UserProto$User userProto$User, boolean z);

    void reset();
}
