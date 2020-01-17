package app.zenly.locator.experimental.firstexperience;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import app.zenly.locator.R;
import app.zenly.locator.core.contracts.NavigationContract;
import app.zenly.locator.core.p072ui.controller.C3103g.C3106c;
import app.zenly.locator.core.p072ui.controller.DraggableDialogController.ExitListener;
import app.zenly.locator.core.util.C3245z;
import app.zenly.locator.p196u.p197b.C5943a;
import app.zenly.locator.p196u.p197b.C5943a.C5944a;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.experimental.firstexperience.e */
public final class C3671e extends C3664b {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5943a f9831b;

    /* renamed from: c */
    private final UserProto$User f9832c;

    /* renamed from: d */
    private final int f9833d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final NavigationContract f9834e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C3677h f9835f;

    /* renamed from: app.zenly.locator.experimental.firstexperience.e$a */
    static final class C3672a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3671e f9836e;

        C3672a(C3671e eVar) {
            this.f9836e = eVar;
        }

        public final void onClick(View view) {
            this.f9836e.f9831b.mo13640a(C5944a.f14963e);
            this.f9836e.f9834e.onInboxAddFriends();
        }
    }

    /* renamed from: app.zenly.locator.experimental.firstexperience.e$b */
    static final class C3673b implements ExitListener {

        /* renamed from: a */
        final /* synthetic */ C3671e f9837a;

        C3673b(C3671e eVar) {
            this.f9837a = eVar;
        }

        public final void onExit() {
            this.f9837a.f9835f.mo10191a(true);
        }
    }

    public C3671e(C5943a aVar, UserProto$User userProto$User, int i, NavigationContract navigationContract, C3677h hVar) {
        C12932j.m33818b(aVar, "analytics");
        C12932j.m33818b(userProto$User, "user");
        C12932j.m33818b(navigationContract, "navigationContract");
        C12932j.m33818b(hVar, "noFriendPreferences");
        super(null);
        this.f9831b = aVar;
        this.f9832c = userProto$User;
        this.f9833d = i;
        this.f9834e = navigationContract;
        this.f9835f = hVar;
    }

    /* renamed from: a */
    public boolean mo10176a() {
        if (this.f9832c.getFriendsCount() == 0) {
            Timestamp createdAt = this.f9832c.getCreatedAt();
            C12932j.m33815a((Object) createdAt, "user.createdAt");
            if (C3245z.m10287f(createdAt) >= 5 && this.f9833d == 0 && !this.f9835f.mo10193b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo10175a(Activity activity) {
        C12932j.m33818b(activity, "activity");
        this.f9831b.mo13646b(C5944a.f14963e);
        this.f9831b.mo13650c(C5944a.f14963e);
        C3106c cVar = new C3106c(activity);
        cVar.mo9349f((int) R.string.z_track3exp1var1_dialog_title);
        cVar.mo9333a(LayoutInflater.from(activity).inflate(R.layout.dialog_no_friend, null));
        cVar.mo9338a(activity.getString(R.string.z_track3exp1var1_dialog_cta), null, new C3672a(this));
        cVar.mo9300a((ExitListener) new C3673b(this)).mo9344b().mo9296j(activity);
    }
}
