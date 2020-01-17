package app.zenly.locator.p135r.p137b1;

import android.text.TextUtils;
import app.zenly.locator.core.invitations.C2545e0;
import app.zenly.locator.core.store.api.C2935a;
import app.zenly.locator.core.store.api.C2936a0;
import app.zenly.locator.core.store.api.C2949h;
import app.zenly.locator.core.store.api.C2956k0;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.sequences.Sequence;
import p213co.znly.models.C7339i;
import p213co.znly.models.C7434p;
import p213co.znly.models.FriendRequestProto$FriendRequest;
import p213co.znly.models.FriendRequestProto$FriendRequest.C6812c;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.r.b1.f */
public final class C5145f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C5144e f13356a;

    /* renamed from: app.zenly.locator.r.b1.f$a */
    static final class C5146a extends C12933k implements Function1<String, UserProto$User> {

        /* renamed from: f */
        final /* synthetic */ C5145f f13357f;

        C5146a(C5145f fVar) {
            this.f13357f = fVar;
            super(1);
        }

        /* renamed from: a */
        public final UserProto$User invoke(String str) {
            C2936a0 a0Var = (C2936a0) this.f13357f.f13356a.f13350e.get(str);
            if (a0Var != null) {
                return a0Var.mo9074a();
            }
            return null;
        }
    }

    public C5145f(C5144e eVar) {
        C12932j.m33818b(eVar, "state");
        this.f13356a = eVar;
    }

    /* renamed from: b */
    public final Collection<C2935a> mo12510b() {
        return this.f13356a.f13346a.values();
    }

    /* renamed from: c */
    public final boolean mo12512c() {
        return this.f13356a.f13354i;
    }

    /* renamed from: d */
    public final boolean mo12513d() {
        return this.f13356a.f13355j;
    }

    /* renamed from: e */
    public final UserProto$User mo12514e() {
        return this.f13356a.f13353h;
    }

    /* renamed from: f */
    public final List<C2545e0> mo12515f() {
        List<C2545e0> list = this.f13356a.f13352g;
        C12932j.m33815a((Object) list, "state.mSharingOptions");
        return list;
    }

    /* renamed from: g */
    public final Collection<C7434p> mo12516g() {
        List<C7434p> list = this.f13356a.f13351f;
        C12932j.m33815a((Object) list, "state.mSuggested");
        return list;
    }

    /* renamed from: a */
    public final Collection<C7339i> mo12508a() {
        return this.f13356a.f13348c.values();
    }

    /* renamed from: b */
    public final int mo12509b(C7339i iVar) {
        C12932j.m33818b(iVar, "contact");
        C2949h hVar = (C2949h) this.f13356a.f13347b.get(iVar.getDeviceContactId());
        if (hVar != null) {
            return hVar.mo9105b();
        }
        return 0;
    }

    /* renamed from: a */
    public final UserProto$User mo12507a(C7339i iVar) {
        C12932j.m33818b(iVar, "contact");
        C2935a aVar = (C2935a) this.f13356a.f13346a.get(iVar.getDeviceContactId());
        if (aVar != null) {
            return aVar.mo9070b();
        }
        return null;
    }

    /* renamed from: b */
    public final boolean mo12511b(C5139b bVar) {
        C12932j.m33818b(bVar, "contactToCheck");
        List<C2956k0> list = this.f13356a.f13349d;
        C12932j.m33815a((Object) list, "state.mFriendRequests");
        FriendRequestProto$FriendRequest a = m14689a(list, bVar);
        return a != null && m14690a(a);
    }

    /* renamed from: a */
    public final UserProto$User mo12506a(C5139b bVar) {
        C12932j.m33818b(bVar, "model");
        C7339i a = bVar.mo12471a();
        if (a != null) {
            List phoneNumbersList = a.getPhoneNumbersList();
            if (phoneNumbersList != null) {
                Sequence b = C12857w.m33671b((Iterable) phoneNumbersList);
                if (b != null) {
                    Sequence d = C12990j.m33932d(b, new C5146a(this));
                    if (d != null) {
                        return (UserProto$User) C12990j.m33933e(d);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private final FriendRequestProto$FriendRequest m14689a(List<C2956k0> list, C5139b bVar) {
        for (C2956k0 b : list) {
            FriendRequestProto$FriendRequest b2 = b.mo9122b();
            UserProto$User g = bVar.mo12484g();
            if (g != null && TextUtils.equals(g.getUuid(), b2.getTargetUuid())) {
                return b2;
            }
        }
        return null;
    }

    /* renamed from: a */
    private final boolean m14690a(FriendRequestProto$FriendRequest friendRequestProto$FriendRequest) {
        return (friendRequestProto$FriendRequest.getStatus() == C6812c.canceled || friendRequestProto$FriendRequest.getStatus() == C6812c.accepted) ? false : true;
    }
}
