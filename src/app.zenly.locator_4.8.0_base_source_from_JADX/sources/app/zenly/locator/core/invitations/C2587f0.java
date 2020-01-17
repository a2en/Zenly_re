package app.zenly.locator.core.invitations;

import kotlin.jvm.internal.C12932j;
import p213co.znly.models.FriendRequestProto$FriendRequest.C6810b;

/* renamed from: app.zenly.locator.core.invitations.f0 */
public enum C2587f0 {
    ADDFRIEND_AOZ(C6810b.SOURCE_ADDFRIEND_AOZ, "addfriend_aoz"),
    ADDFRIEND_CONTACT(C6810b.SOURCE_ADDFRIEND_CONTACT, "addfriend_contact"),
    ADDFRIEND_SUGGESTED(C6810b.SOURCE_ADDFRIEND_SUGGESTED, "addfriend_suggested"),
    BUMP(C6810b.SOURCE_BUMP, "bump"),
    CONTACT_JOINED(C6810b.SOURCE_CONTACT_JOINED, "contact_joined"),
    DASHBOARD_AOZ(C6810b.SOURCE_DASHBOARD_AOZ, "dashboard_aoz"),
    DASHBOARD_CONTACT(C6810b.SOURCE_DASHBOARD_CONTACT, "dashboard_contact"),
    DASHBOARD_SUGGESTED(C6810b.SOURCE_DASHBOARD_SUGGESTED, "dashboard_suggested"),
    FOG(C6810b.SOURCE_FOG, "fog_generic"),
    GROUP_INFO_USER_LIST(C6810b.SOURCE_GROUP_INFO_USER_LIST, "group_info_user_list"),
    MY_FRIEND_LIST(C6810b.SOURCE_MY_FRIEND_LIST, "my_friend_list"),
    ONBOARDING_AOZ(C6810b.SOURCE_ONBOARDING_AOZ, "onboarding_aoz"),
    ONBOARDING_CONTACT(C6810b.SOURCE_ONBOARDING_CONTACT, "onboarding_contact"),
    ONBOARDING_SUGGESTED(C6810b.SOURCE_ONBOARDING_SUGGESTED, "onboarding_suggested"),
    PHONE_NUMBER(C6810b.SOURCE_PHONE_NUMBER, "phone_number"),
    PROFILE_OTHER_HEADER(C6810b.SOURCE_PROFILE_OTHER_HEADER, "profile_other_header_generic"),
    PROFILE_OTHER_FRIEND_LIST(C6810b.SOURCE_PROFILE_OTHER_FRIEND_LIST, "profile_other_friend_list"),
    UNDEFINED(C6810b.SOURCE_UNKNOWN, "undefined"),
    USERNAME(C6810b.SOURCE_USERNAME, "username"),
    SOURCE_RECOMMENDATION(C6810b.SOURCE_RECOMMENDATION, "friend_recommendation"),
    REFERRER(C6810b.SOURCE_LINK_INVITE, "z_track5exp_invite_link");
    

    /* renamed from: C */
    public static final C2588a f7651C = null;

    /* renamed from: e */
    private final C6810b f7672e;

    /* renamed from: f */
    private final String f7673f;

    /* renamed from: app.zenly.locator.core.invitations.f0$a */
    public static final class C2588a {
        private C2588a() {
        }

        /* renamed from: a */
        public final C2587f0 mo8693a(C6810b bVar) {
            C2587f0 f0Var;
            C12932j.m33818b(bVar, "friendRequestSource");
            C2587f0[] values = C2587f0.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    f0Var = null;
                    break;
                }
                f0Var = values[i];
                if (f0Var.mo8692b() == bVar) {
                    break;
                }
                i++;
            }
            return f0Var != null ? f0Var : C2587f0.UNDEFINED;
        }

        public /* synthetic */ C2588a(C12928f fVar) {
            this();
        }
    }

    static {
        f7651C = new C2588a(null);
    }

    private C2587f0(C6810b bVar, String str) {
        this.f7672e = bVar;
        this.f7673f = str;
    }

    /* renamed from: a */
    public final String mo8691a() {
        return this.f7673f;
    }

    /* renamed from: b */
    public final C6810b mo8692b() {
        return this.f7672e;
    }
}
