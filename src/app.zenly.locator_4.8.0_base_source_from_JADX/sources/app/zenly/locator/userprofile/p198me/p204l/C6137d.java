package app.zenly.locator.userprofile.p198me.p204l;

import app.zenly.locator.userprofile.p198me.C6080f;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7210s0;

/* renamed from: app.zenly.locator.userprofile.me.l.d */
public final class C6137d extends C11722a {

    /* renamed from: f */
    private final C7210s0 f15410f;

    public C6137d(long j, C7210s0 s0Var) {
        C12932j.m33818b(s0Var, "bestFriend");
        super(C6080f.BEST_FRIENDS_ITEM, j);
        this.f15410f = s0Var;
    }

    /* renamed from: a */
    public boolean mo7088a(C11722a aVar) {
        if (aVar != null) {
            C6137d dVar = (C6137d) aVar;
            UserProto$User friend = this.f15410f.getFriend();
            String str = "bestFriend.friend";
            C12932j.m33815a((Object) friend, str);
            String uuid = friend.getUuid();
            UserProto$User friend2 = dVar.f15410f.getFriend();
            String str2 = "viewModel.bestFriend.friend";
            C12932j.m33815a((Object) friend2, str2);
            if (C12932j.m33817a((Object) uuid, (Object) friend2.getUuid())) {
                UserProto$User friend3 = this.f15410f.getFriend();
                C12932j.m33815a((Object) friend3, str);
                int avatarVersion = friend3.getAvatarVersion();
                UserProto$User friend4 = dVar.f15410f.getFriend();
                C12932j.m33815a((Object) friend4, str2);
                if (avatarVersion == friend4.getAvatarVersion()) {
                    return true;
                }
            }
            return false;
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.userprofile.me.viewmodels.MyProfileBestFriendsItemViewModel");
    }

    /* renamed from: f */
    public final C7210s0 mo13973f() {
        return this.f15410f;
    }
}
