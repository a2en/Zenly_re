package app.zenly.locator.experimental.firstexperience;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.AppCompatTextView;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.contracts.NavigationContract;
import app.zenly.locator.core.p072ui.controller.C3103g.C3106c;
import app.zenly.locator.core.util.C3245z;
import app.zenly.locator.p196u.p197b.C5943a;
import app.zenly.locator.p196u.p197b.C5943a.C5944a;
import com.airbnb.lottie.LottieAnimationView;
import java.util.List;
import kotlin.C12899i;
import kotlin.C12954o;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.experimental.firstexperience.f */
public final class C3674f extends C3664b {

    /* renamed from: b */
    private final List<C12899i<Integer, Integer>> f9838b = C12848o.m33643b((Object[]) new C12899i[]{C12954o.m33853a(Integer.valueOf(R.raw.lottie_no_friend_dialog_global), Integer.valueOf(R.string.z_track3exp2var1_dialog_title_realtime)), C12954o.m33853a(Integer.valueOf(R.raw.lottie_no_friend_dialog_gathering), Integer.valueOf(R.string.z_track3exp2var1_dialog_title_hangout)), C12954o.m33853a(Integer.valueOf(R.raw.lottie_no_friend_dialog_battery), Integer.valueOf(R.string.z_track3exp2var1_dialog_title_battery)), C12954o.m33853a(Integer.valueOf(R.raw.lottie_no_friend_dialog_tots), Integer.valueOf(R.string.z_track3exp2var1_dialog_title_tots)), C12954o.m33853a(Integer.valueOf(R.raw.lottie_no_friend_dialog_speed), Integer.valueOf(R.string.z_track3exp2var1_dialog_title_speed))});
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C5943a f9839c;

    /* renamed from: d */
    private final UserProto$User f9840d;

    /* renamed from: e */
    private final int f9841e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final NavigationContract f9842f;

    /* renamed from: g */
    private final C3677h f9843g;

    /* renamed from: app.zenly.locator.experimental.firstexperience.f$a */
    static final class C3675a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3674f f9844e;

        /* renamed from: f */
        final /* synthetic */ int f9845f;

        C3675a(C3674f fVar, int i) {
            this.f9844e = fVar;
            this.f9845f = i;
        }

        public final void onClick(View view) {
            this.f9844e.f9839c.mo13641a(C5944a.f14964f, this.f9845f);
            this.f9844e.f9842f.onInboxAddFriends();
        }
    }

    /* JADX INFO: used method not loaded: kotlin.collections.o.b(java.lang.Object[]):null, types can be incorrect */
    public C3674f(C5943a aVar, UserProto$User userProto$User, int i, NavigationContract navigationContract, C3677h hVar) {
        C12932j.m33818b(aVar, "analytics");
        C12932j.m33818b(userProto$User, "user");
        C12932j.m33818b(navigationContract, "navigationContract");
        C12932j.m33818b(hVar, "noFriendPreferences");
        super(null);
        this.f9839c = aVar;
        this.f9840d = userProto$User;
        this.f9841e = i;
        this.f9842f = navigationContract;
        this.f9843g = hVar;
    }

    /* renamed from: a */
    public boolean mo10176a() {
        if (this.f9840d.getFriendsCount() == 0) {
            Timestamp createdAt = this.f9840d.getCreatedAt();
            C12932j.m33815a((Object) createdAt, "user.createdAt");
            if (C3245z.m10287f(createdAt) >= 5 && this.f9841e == 0 && this.f9843g.mo10189a() < this.f9838b.size() && this.f9843g.mo10189a() >= 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo10175a(Activity activity) {
        C12932j.m33818b(activity, "activity");
        int a = this.f9843g.mo10189a();
        if (a == 0) {
            this.f9839c.mo13646b(C5944a.f14964f);
        }
        this.f9839c.mo13647b(C5944a.f14964f, a);
        View inflate = LayoutInflater.from(activity).inflate(R.layout.dialog_no_friend_lottie, null);
        C12899i iVar = (C12899i) this.f9838b.get(a);
        C12932j.m33815a((Object) inflate, "view");
        LottieAnimationView lottieAnimationView = (LottieAnimationView) inflate.findViewById(C3891l.lottie_animation_view);
        lottieAnimationView.setAnimation(((Number) iVar.mo37204c()).intValue());
        C12932j.m33815a((Object) lottieAnimationView, "lottieAnimationView");
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.mo22807d();
        ((AppCompatTextView) inflate.findViewById(C3891l.dialog_title)).setText(((Number) iVar.mo37205d()).intValue());
        C3677h hVar = this.f9843g;
        hVar.mo10190a(hVar.mo10189a() + 1);
        C3106c cVar = new C3106c(activity);
        cVar.mo9333a(inflate);
        cVar.mo9338a(activity.getString(R.string.z_track3exp1var1_dialog_cta), null, new C3675a(this, a));
        cVar.mo9344b().mo9296j(activity);
    }
}
