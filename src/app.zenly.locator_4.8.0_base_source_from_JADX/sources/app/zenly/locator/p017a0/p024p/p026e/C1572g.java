package app.zenly.locator.p017a0.p024p.p026e;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import app.zenly.locator.R;
import app.zenly.locator.core.contracts.NavigationContract;
import app.zenly.locator.core.p072ui.activity.ChangeAvatarActivity;
import app.zenly.locator.p017a0.C1514h;
import app.zenly.locator.p017a0.C1521j;
import app.zenly.locator.p017a0.C1522k;
import app.zenly.locator.p017a0.C1526m;
import app.zenly.locator.p017a0.p018n.C1530b;
import app.zenly.locator.p017a0.p023o.C1553a;
import app.zenly.locator.p017a0.p024p.p025d.C1562a;
import app.zenly.locator.p017a0.p024p.p025d.C1565c;
import app.zenly.locator.p017a0.p030q.C1614a;
import app.zenly.locator.p017a0.p035r.C1657e;
import app.zenly.locator.p017a0.p040s.C1681b;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.C5343a.C5363t;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.p143s.p162w.C5566b;
import app.zenly.locator.p208y.C6288c;
import app.zenly.locator.p208y.C6288c.C6291c;
import app.zenly.locator.powermoves.PowerMovesActivity;
import app.zenly.locator.username.UsernameInputActivity;
import app.zenly.locator.username.UsernameInputActivity.C5951a;
import app.zenly.locator.username.idcard.CardPickerActivity;
import app.zenly.locator.username.idcard.CardPickerActivity.C5991a;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.changehandler.C8816c;
import java.util.concurrent.TimeUnit;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import org.greenrobot.eventbus.C13382i;
import org.greenrobot.eventbus.ThreadMode;
import p213co.znly.core.romutils.ResolutionSolver;
import p213co.znly.core.vendor.com.google.protobuf.GeneratedMessageLite;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.UserProto$User.C6925a;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;

/* renamed from: app.zenly.locator.a0.p.e.g */
public final class C1572g {

    /* renamed from: a */
    private final C8831g f5510a = this.f5512c.mo23946k();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Activity f5511b;

    /* renamed from: c */
    private final C8819d f5512c;

    /* renamed from: d */
    private final C1565c f5513d;

    /* renamed from: app.zenly.locator.a0.p.e.g$a */
    public static final class C1573a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C1572g f5514e;

        /* renamed from: f */
        final /* synthetic */ Intent f5515f;

        public C1573a(C1572g gVar, Intent intent) {
            this.f5514e = gVar;
            this.f5515f = intent;
        }

        public final void run() {
            this.f5514e.f5511b.startActivity(this.f5515f);
        }
    }

    public C1572g(Activity activity, C8819d dVar, C1565c cVar) {
        C12932j.m33818b(activity, "context");
        C12932j.m33818b(dVar, "controller");
        C12932j.m33818b(cVar, "repository");
        this.f5511b = activity;
        this.f5512c = dVar;
        this.f5513d = cVar;
    }

    @C13382i(threadMode = ThreadMode.MAIN)
    public final void onEditAvatarEvent(C1566a aVar) {
        C12932j.m33818b(aVar, "event");
        Activity activity = this.f5511b;
        activity.startActivity(ChangeAvatarActivity.f8483p.mo9271a(activity));
    }

    @C13382i(threadMode = ThreadMode.MAIN)
    public final void onEditBirthdayEvent(C1567b bVar) {
        C12932j.m33818b(bVar, "event");
        C1514h hVar = new C1514h();
        hVar.mo23929b(this.f5512c.mo23947l());
        C8831g gVar = this.f5510a;
        C8836h a = C8836h.m21058a((C8819d) hVar);
        a.mo24026b(new C8816c(false));
        a.mo24023a((ControllerChangeHandler) new C8816c());
        gVar.mo23991a(a);
    }

    @C13382i(threadMode = ThreadMode.MAIN)
    public final void onEditDisplayNameEvent(C1568c cVar) {
        C12932j.m33818b(cVar, "event");
        C8831g gVar = this.f5510a;
        C8836h a = C8836h.m21058a((C8819d) new C1521j(cVar.mo7121a()));
        a.mo24026b(new C8816c(false));
        a.mo24023a((ControllerChangeHandler) new C8816c());
        gVar.mo23991a(a);
    }

    @C13382i(threadMode = ThreadMode.MAIN)
    public final void onEditMapOptionsEvent(C1569d dVar) {
        C12932j.m33818b(dVar, "event");
        int a = dVar.mo7122a();
        if (a == 0) {
            C5498a.m15602a(C5498a.f14119e.mo13125a(this.f5511b), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            this.f5513d.mo7118a(C1562a.f5494e.mo7107a().mo7106b(dVar.mo7123b()));
            m6788a();
        } else if (a == 1) {
            C5498a.m15602a(C5498a.f14119e.mo13125a(this.f5511b), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            this.f5513d.mo7119b(C1562a.f5494e.mo7108b().mo7106b(dVar.mo7123b()));
        } else {
            throw new IllegalArgumentException();
        }
    }

    @C13382i(threadMode = ThreadMode.MAIN)
    public final void onEditUnitsFormattingEvent(C1570e eVar) {
        C12932j.m33818b(eVar, "event");
        if (eVar.mo7124a() == 0) {
            C5498a.m15602a(C5498a.f14119e.mo13125a(this.f5511b), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            this.f5513d.mo7120c(C1562a.f5494e.mo7109c().mo7106b(eVar.mo7125b()));
            return;
        }
        throw new IllegalArgumentException();
    }

    @C13382i(threadMode = ThreadMode.MAIN)
    public final void onEditUsernameEvent(C1571f fVar) {
        Intent intent;
        C12932j.m33818b(fVar, "event");
        C5343a.m15160U().mo12839a(fVar.mo7126a().getUsername(), C5363t.SETTINGS_CELL_TAP);
        UserProto$User a = fVar.mo7126a();
        String username = a.getUsername();
        String str = "user.username";
        if (username == null || username.length() == 0) {
            C5951a aVar = UsernameInputActivity.f14982p;
            Activity activity = this.f5511b;
            String uuid = a.getUuid();
            C12932j.m33815a((Object) uuid, "user.uuid");
            String username2 = a.getUsername();
            C12932j.m33815a((Object) username2, str);
            intent = aVar.mo13671a(activity, uuid, username2, a.getIdCardStyleValue());
        } else {
            C5991a aVar2 = CardPickerActivity.f15073r;
            Activity activity2 = this.f5511b;
            String username3 = a.getUsername();
            C12932j.m33815a((Object) username3, str);
            intent = aVar2.mo13753a(activity2, username3, a.getIdCardStyleValue());
        }
        this.f5511b.startActivity(intent);
        this.f5511b.overridePendingTransition(R.anim.fade_in, R.anim.stay_still);
    }

    @C13382i(threadMode = ThreadMode.MAIN)
    public final void onManageFriendsEvent(C1574h hVar) {
        C12932j.m33818b(hVar, "event");
        C1614a aVar = new C1614a();
        aVar.mo23929b(this.f5512c.mo23947l());
        C8831g gVar = this.f5510a;
        C8836h a = C8836h.m21058a((C8819d) aVar);
        a.mo24026b(new C8816c(false));
        a.mo24023a((ControllerChangeHandler) new C8816c());
        gVar.mo23991a(a);
    }

    @C13382i(threadMode = ThreadMode.MAIN)
    public final void onOpenBlockedUsersEvent(C1575i iVar) {
        C12932j.m33818b(iVar, "event");
        C8831g gVar = this.f5510a;
        C8836h a = C8836h.m21058a((C8819d) new C1530b());
        a.mo24026b(new C8816c(false));
        a.mo24023a((ControllerChangeHandler) new C8816c());
        gVar.mo23991a(a);
    }

    @C13382i(threadMode = ThreadMode.MAIN)
    public final void onOpenDataSafetyEvent(C1576j jVar) {
        C12932j.m33818b(jVar, "event");
        C8831g gVar = this.f5510a;
        C8836h a = C8836h.m21058a((C8819d) C1553a.f5470P.mo7098a());
        a.mo24026b(new C8816c(false));
        a.mo24023a((ControllerChangeHandler) new C8816c());
        gVar.mo23991a(a);
    }

    @C13382i(threadMode = ThreadMode.MAIN)
    public final void onOpenNotificationEvent(C1577k kVar) {
        C12932j.m33818b(kVar, "event");
        C8831g gVar = this.f5510a;
        C8836h a = C8836h.m21058a((C8819d) new C1657e());
        a.mo24026b(new C8816c(false));
        a.mo24023a((ControllerChangeHandler) new C8816c());
        gVar.mo23991a(a);
    }

    @C13382i(threadMode = ThreadMode.MAIN)
    public final void onOpenPhoneSettingsEvent(C1578l lVar) {
        C12932j.m33818b(lVar, "event");
        C6288c.f15796c.mo14142a().mo14140b(C6291c.SETTINGS, ResolutionSolver.get().getResolutions(this.f5511b).size());
        C8831g gVar = this.f5510a;
        C8836h a = C8836h.m21058a((C8819d) C1681b.f5730P.mo7296a());
        a.mo24026b(new C8816c(false));
        a.mo24023a((ControllerChangeHandler) new C8816c());
        gVar.mo23991a(a);
    }

    @C13382i(threadMode = ThreadMode.MAIN)
    public final void onOpenPowerMoves(C1579m mVar) {
        C12932j.m33818b(mVar, "event");
        Activity activity = this.f5511b;
        activity.startActivity(new Intent(activity, PowerMovesActivity.class));
    }

    @C13382i(threadMode = ThreadMode.MAIN)
    public final void onOpenPrivacySettingsEvent(C1580n nVar) {
        C12932j.m33818b(nVar, "event");
        C8831g gVar = this.f5510a;
        C8836h a = C8836h.m21058a((C8819d) new C1522k());
        a.mo24026b(new C8816c(false));
        a.mo24023a((ControllerChangeHandler) new C8816c());
        gVar.mo23991a(a);
    }

    @C13382i(threadMode = ThreadMode.MAIN)
    public final void onOpenSupportEvent(C1581o oVar) {
        C12932j.m33818b(oVar, "event");
        if (this.f5512c.mo23947l() instanceof NavigationContract) {
            C8819d l = this.f5512c.mo23947l();
            if (l != null) {
                ((NavigationContract) l).displaySupport();
                this.f5511b.overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.core.contracts.NavigationContract");
        }
    }

    @C13382i(threadMode = ThreadMode.MAIN)
    public final void onOpenWebUrlEvent(C1582p pVar) {
        C12932j.m33818b(pVar, "event");
        C8831g gVar = this.f5510a;
        C8836h a = C8836h.m21058a((C8819d) C5566b.f14227Q.mo13178a(pVar.mo7144a()));
        a.mo24026b(new C8816c(false));
        a.mo24023a((ControllerChangeHandler) new C8816c());
        gVar.mo23991a(a);
    }

    @C13382i(threadMode = ThreadMode.MAIN)
    public final void onToggleSkiSlopesEvent(C1584r rVar) {
        C12932j.m33818b(rVar, "event");
        C6925a newBuilder = UserProto$User.newBuilder();
        newBuilder.mo18021c(rVar.mo7145a());
        GeneratedMessageLite build = newBuilder.build();
        C12932j.m33815a((Object) build, "user.build()");
        C1526m.m6704f((UserProto$User) build, this.f5511b);
    }

    /* renamed from: a */
    private final void m6788a() {
        Intent launchIntentForPackage = this.f5511b.getPackageManager().getLaunchIntentForPackage(this.f5511b.getPackageName());
        if (launchIntentForPackage != null) {
            Intent addFlags = launchIntentForPackage.addFlags(67108864);
            C12932j.m33815a((Object) addFlags, "context.packageManager.g….FLAG_ACTIVITY_CLEAR_TOP)");
            this.f5511b.finish();
            Window window = this.f5511b.getWindow();
            C12932j.m33815a((Object) window, "context.window");
            View decorView = window.getDecorView();
            C12932j.m33815a((Object) decorView, "context.window.decorView");
            decorView.postDelayed(new C1573a(this, addFlags), TimeUnit.SECONDS.toMillis(2));
            Activity activity = this.f5511b;
            Toast.makeText(activity, C7709b.m18762a(activity, R.string.settings_configure_map_provider_need_restart), 1).show();
            return;
        }
        C12932j.m33814a();
        throw null;
    }
}
