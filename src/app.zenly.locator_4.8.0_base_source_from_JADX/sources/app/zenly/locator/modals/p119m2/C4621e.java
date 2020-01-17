package app.zenly.locator.modals.p119m2;

import app.zenly.locator.block.C1713b;
import app.zenly.locator.core.util.C3194b0;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p210z.p212c.C6332i.C6334b;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.C7339i;
import p213co.znly.models.FriendRequestProto$FriendRequest;
import p213co.znly.models.FriendRequestProto$FriendRequest.C6812c;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7135k0;
import p213co.znly.models.core.C7135k0.C7136a;
import p213co.znly.models.core.C7142l0;
import p213co.znly.models.core.C7159m1;
import p213co.znly.models.reversegeocoder.C7911b;
import p213co.znly.models.services.C7979a3;
import p213co.znly.models.services.C8189n5;
import p213co.znly.models.services.C8189n5.C8190a;
import p213co.znly.models.services.C8214o5;
import p213co.znly.models.services.C8399z2;
import p213co.znly.models.services.C8399z2.C8400a;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12291g;
import p389io.reactivex.functions.Function;

/* renamed from: app.zenly.locator.modals.m2.e */
public final class C4621e {

    /* renamed from: a */
    private final ZenlyCore f12287a = C5448c.m15478a();

    /* renamed from: app.zenly.locator.modals.m2.e$a */
    static final class C4622a<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C4622a f12288e = new C4622a();

        C4622a() {
        }

        /* renamed from: a */
        public final C6812c apply(C7979a3 a3Var) {
            C12932j.m33818b(a3Var, "response");
            FriendRequestProto$FriendRequest friendRequest = a3Var.getFriendRequest();
            C12932j.m33815a((Object) friendRequest, "response.friendRequest");
            return friendRequest.getStatus();
        }
    }

    /* renamed from: app.zenly.locator.modals.m2.e$b */
    static final class C4623b<T, R> implements Function<T, R> {

        /* renamed from: e */
        public static final C4623b f12289e = new C4623b();

        /* renamed from: app.zenly.locator.modals.m2.e$b$a */
        public static final class C4624a<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                UserProto$User userProto$User = (UserProto$User) t2;
                String str = "user";
                C12932j.m33815a((Object) userProto$User, str);
                Boolean valueOf = Boolean.valueOf(C3194b0.m10163a(userProto$User));
                UserProto$User userProto$User2 = (UserProto$User) t;
                C12932j.m33815a((Object) userProto$User2, str);
                return C12998b.m33940a(valueOf, Boolean.valueOf(C3194b0.m10163a(userProto$User2)));
            }
        }

        C4623b() {
        }

        /* renamed from: a */
        public final List<UserProto$User> apply(C7159m1 m1Var) {
            C12932j.m33818b(m1Var, "mutualFriendsState");
            List friendsList = m1Var.getFriendsList();
            C12932j.m33815a((Object) friendsList, "mutualFriendsState.friendsList");
            List<UserProto$User> d = C12857w.m33678d((Collection) friendsList);
            if (d.size() > 1) {
                C12853s.m33649a(d, new C4624a());
            }
            return d;
        }
    }

    /* renamed from: a */
    public final C12279e<C7339i> mo11770a(String str) {
        C12932j.m33818b(str, "phoneNumber");
        C12279e<C7339i> contactsByPhoneNumber = this.f12287a.contactsByPhoneNumber(str);
        C12932j.m33815a((Object) contactsByPhoneNumber, "core.contactsByPhoneNumber(phoneNumber)");
        return contactsByPhoneNumber;
    }

    /* renamed from: b */
    public final C12279e<List<UserProto$User>> mo11772b(String str) {
        C12932j.m33818b(str, "userUuid");
        C12279e<List<UserProto$User>> i = this.f12287a.userPublicMutualFriendsState(str).mo36501i(C4623b.f12289e);
        C12932j.m33815a((Object) i, "core.userPublicMutualFri…    friends\n            }");
        return i;
    }

    /* renamed from: c */
    public final C12291g<C7142l0> mo11773c(String str) {
        C12932j.m33818b(str, "newComerUuid");
        C7136a newBuilder = C7135k0.newBuilder();
        newBuilder.mo19124a(str);
        C12291g<C7142l0> recoPotentialMatches = this.f12287a.recoPotentialMatches((C7135k0) newBuilder.build());
        C12932j.m33815a((Object) recoPotentialMatches, "core.recoPotentialMatches(request)");
        return recoPotentialMatches;
    }

    /* renamed from: d */
    public final C12279e<C8214o5> mo11774d(String str) {
        C12932j.m33818b(str, "userUuid");
        C8190a newBuilder = C8189n5.newBuilder();
        newBuilder.mo22166a(str);
        newBuilder.mo22165a(C1713b.m7059a(C6334b.MULTIPLE_INVITES));
        C12279e<C8214o5> userBlock = this.f12287a.userBlock((C8189n5) newBuilder.build());
        C12932j.m33815a((Object) userBlock, "core.userBlock(request)");
        return userBlock;
    }

    /* renamed from: a */
    public final C12279e<C6812c> mo11771a(String str, C6812c cVar) {
        C12932j.m33818b(str, "friendRequestUuid");
        C12932j.m33818b(cVar, "status");
        C8400a newBuilder = C8399z2.newBuilder();
        newBuilder.setUuid(str);
        C12932j.m33815a((Object) newBuilder, "this");
        newBuilder.mo22342a(cVar);
        C12279e<C6812c> i = this.f12287a.friendRequestRespond((C8399z2) newBuilder.build()).mo36501i(C4622a.f12288e);
        C12932j.m33815a((Object) i, "core.friendRequestRespon…se.friendRequest.status }");
        return i;
    }

    /* renamed from: a */
    public final C12279e<C7911b> mo11769a(double d, double d2) {
        C12279e<C7911b> geoReverseGeocodeAdminAreas = this.f12287a.geoReverseGeocodeAdminAreas(d, d2);
        C12932j.m33815a((Object) geoReverseGeocodeAdminAreas, "core.geoReverseGeocodeAd…reas(latitude, longitude)");
        return geoReverseGeocodeAdminAreas;
    }
}
