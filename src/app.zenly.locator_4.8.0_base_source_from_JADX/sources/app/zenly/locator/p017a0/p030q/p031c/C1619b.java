package app.zenly.locator.p017a0.p030q.p031c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;
import androidx.appcompat.app.C0122a.C0123a;
import app.zenly.locator.R;
import app.zenly.locator.core.contracts.NavigationContract;
import app.zenly.locator.core.invitations.C2538c0;
import app.zenly.locator.core.invitations.C2587f0;
import app.zenly.locator.core.invitations.C2623w;
import app.zenly.locator.core.invitations.C2625y;
import app.zenly.locator.core.invitations.C2625y.C2626a;
import app.zenly.locator.core.invitations.InvitationCallback;
import app.zenly.locator.core.store.api.C2956k0;
import app.zenly.locator.p017a0.p030q.C1614a;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.userprofile.p198me.p199g.C6081a;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import org.greenrobot.eventbus.C13382i;
import org.greenrobot.eventbus.ThreadMode;
import p213co.znly.core.ZenlyCore;
import p213co.znly.models.FriendRequestProto$FriendRequest.C6812c;
import p213co.znly.models.services.C7979a3;
import p213co.znly.models.services.C7983a5;
import p213co.znly.models.services.C8163m0;
import p213co.znly.models.services.C8271s2;
import p213co.znly.models.services.C8271s2.C8272a;
import p213co.znly.models.services.C8292t2;
import p213co.znly.models.services.C8399z2;
import p213co.znly.models.services.C8399z2.C8400a;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;
import p389io.reactivex.C12286f;
import p389io.reactivex.functions.Consumer;

/* renamed from: app.zenly.locator.a0.q.c.b */
public final class C1619b {

    /* renamed from: a */
    private NavigationContract f5615a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1614a f5616b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f5617c;

    /* renamed from: d */
    private final ZenlyCore f5618d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C6081a f5619e;

    /* renamed from: f */
    private final C2538c0 f5620f;

    /* renamed from: g */
    private final C12286f f5621g;

    /* renamed from: app.zenly.locator.a0.q.c.b$a */
    static final class C1620a<T> implements Consumer<C8292t2> {

        /* renamed from: e */
        public static final C1620a f5622e = new C1620a();

        C1620a() {
        }

        /* renamed from: a */
        public final void accept(C8292t2 t2Var) {
            C5343a.m15160U().mo12907s();
        }
    }

    /* renamed from: app.zenly.locator.a0.q.c.b$b */
    static final class C1621b<T> implements Consumer<Throwable> {

        /* renamed from: e */
        final /* synthetic */ C1619b f5623e;

        C1621b(C1619b bVar) {
            this.f5623e = bVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Toast.makeText(this.f5623e.f5617c, R.string.settings_manageFriends_errorLoading, 0).show();
        }
    }

    /* renamed from: app.zenly.locator.a0.q.c.b$c */
    static final class C1622c<T> implements Consumer<C7979a3> {

        /* renamed from: e */
        public static final C1622c f5624e = new C1622c();

        C1622c() {
        }

        /* renamed from: a */
        public final void accept(C7979a3 a3Var) {
        }
    }

    /* renamed from: app.zenly.locator.a0.q.c.b$d */
    static final class C1623d<T> implements Consumer<Throwable> {

        /* renamed from: e */
        final /* synthetic */ C1619b f5625e;

        C1623d(C1619b bVar) {
            this.f5625e = bVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            Toast.makeText(this.f5625e.f5617c, R.string.settings_manageFriends_errorLoading, 0).show();
        }
    }

    /* renamed from: app.zenly.locator.a0.q.c.b$e */
    static final class C1624e implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C1619b f5626e;

        /* renamed from: f */
        final /* synthetic */ C1630c f5627f;

        /* renamed from: g */
        final /* synthetic */ String f5628g;

        C1624e(C1619b bVar, C1630c cVar, String str) {
            this.f5626e = bVar;
            this.f5627f = cVar;
            this.f5628g = str;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String str = "userUuid";
            if (i != 0) {
                if (i == 1) {
                    if (this.f5627f.mo7212a().mo7242h() || this.f5627f.mo7212a().mo7244i()) {
                        C1619b bVar = this.f5626e;
                        String str2 = this.f5628g;
                        C12932j.m33815a((Object) str2, str);
                        bVar.m6877a(str2);
                    }
                }
            } else if (this.f5627f.mo7212a().mo7242h()) {
                C1619b bVar2 = this.f5626e;
                String str3 = this.f5628g;
                C12932j.m33815a((Object) str3, str);
                bVar2.m6883c(str3);
            } else if (this.f5627f.mo7212a().mo7244i()) {
                C1619b bVar3 = this.f5626e;
                String str4 = this.f5628g;
                C12932j.m33815a((Object) str4, str);
                bVar3.m6885d(str4);
            } else {
                C1619b bVar4 = this.f5626e;
                String str5 = this.f5628g;
                C12932j.m33815a((Object) str5, str);
                bVar4.m6877a(str5);
            }
        }
    }

    /* renamed from: app.zenly.locator.a0.q.c.b$f */
    static final class C1625f implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C1619b f5629e;

        /* renamed from: f */
        final /* synthetic */ C1631d f5630f;

        C1625f(C1619b bVar, C1631d dVar) {
            this.f5629e = bVar;
            this.f5630f = dVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == 0) {
                this.f5629e.m6876a(this.f5630f.mo7213a());
            } else if (i == 1) {
                this.f5629e.m6880b(this.f5630f.mo7213a().mo9124d());
            }
        }
    }

    /* renamed from: app.zenly.locator.a0.q.c.b$g */
    static final class C1626g<T> implements Consumer<C8163m0> {

        /* renamed from: e */
        final /* synthetic */ C1619b f5631e;

        C1626g(C1619b bVar) {
            this.f5631e = bVar;
        }

        /* renamed from: a */
        public final void accept(C8163m0 m0Var) {
            this.f5631e.f5619e.mo13903d();
            this.f5631e.f5616b.mo7192B();
        }
    }

    /* renamed from: app.zenly.locator.a0.q.c.b$h */
    static final class C1627h<T> implements Consumer<Throwable> {

        /* renamed from: e */
        final /* synthetic */ C1619b f5632e;

        C1627h(C1619b bVar) {
            this.f5632e = bVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            this.f5632e.f5616b.mo7194D();
            Toast.makeText(this.f5632e.f5617c, R.string.settings_manageFriends_errorLoading, 0).show();
        }
    }

    /* renamed from: app.zenly.locator.a0.q.c.b$i */
    static final class C1628i<T> implements Consumer<C7983a5> {

        /* renamed from: e */
        final /* synthetic */ C1619b f5633e;

        C1628i(C1619b bVar) {
            this.f5633e = bVar;
        }

        /* renamed from: a */
        public final void accept(C7983a5 a5Var) {
            this.f5633e.f5619e.mo13904e();
            this.f5633e.f5616b.mo7192B();
        }
    }

    /* renamed from: app.zenly.locator.a0.q.c.b$j */
    static final class C1629j<T> implements Consumer<Throwable> {

        /* renamed from: e */
        final /* synthetic */ C1619b f5634e;

        C1629j(C1619b bVar) {
            this.f5634e = bVar;
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            this.f5634e.f5616b.mo7194D();
            Toast.makeText(this.f5634e.f5617c, R.string.settings_manageFriends_errorLoading, 0).show();
        }
    }

    public C1619b(C1614a aVar, Context context, ZenlyCore zenlyCore, C6081a aVar2, C2538c0 c0Var, C12286f fVar) {
        C12932j.m33818b(aVar, "controller");
        C12932j.m33818b(context, "context");
        C12932j.m33818b(zenlyCore, "core");
        C12932j.m33818b(aVar2, "bffRepository");
        C12932j.m33818b(c0Var, "inviteManager");
        C12932j.m33818b(fVar, "uiScheduler");
        this.f5616b = aVar;
        this.f5617c = context;
        this.f5618d = zenlyCore;
        this.f5619e = aVar2;
        this.f5620f = c0Var;
        this.f5621g = fVar;
    }

    @C13382i(threadMode = ThreadMode.MAIN)
    public final void onAddFriendsCLick(C1618a aVar) {
        C12932j.m33818b(aVar, "event");
        C5498a.m15602a(C5498a.f14119e.mo13125a(this.f5617c), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
        NavigationContract navigationContract = this.f5615a;
        if (navigationContract != null) {
            navigationContract.onInboxAddFriends();
        }
    }

    @C13382i(threadMode = ThreadMode.MAIN)
    public final void onFriendClick(C1630c cVar) {
        int i;
        C12932j.m33818b(cVar, "event");
        C5498a.m15602a(C5498a.f14119e.mo13125a(this.f5617c), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
        String string = this.f5617c.getString(R.string.commons_button_cancelcap);
        C12932j.m33815a((Object) string, "context.getString(R.stri…commons_button_cancelcap)");
        List c = C12848o.m33645c(C7709b.m18762a(this.f5617c, R.string.settings_manage_alert_button_deletefriend), string);
        if (cVar.mo7212a().mo7242h()) {
            i = R.string.settings_managefriends_contextual_unhideBestFriends;
        } else if (cVar.mo7212a().mo7244i()) {
            i = R.string.settings_managefriends_contextual_allowMutualLove;
        } else {
            i = C7674a.f19294a;
        }
        if (C7674a.m18692a(i)) {
            String string2 = this.f5617c.getString(i);
            C12932j.m33815a((Object) string2, "context.getString(unhideResId)");
            c.add(0, string2);
        }
        String uuid = cVar.mo7212a().mo7240f().mo9074a().getUuid();
        C0123a aVar = new C0123a(this.f5617c);
        aVar.mo547b((CharSequence) this.f5617c.getString(R.string.settings_mange_alert_title_managefriend, new Object[]{cVar.mo7212a().mo7240f().mo9074a().getName()}));
        Object[] array = c.toArray(new String[0]);
        if (array != null) {
            aVar.mo541a((CharSequence[]) array, (OnClickListener) new C1624e(this, cVar, uuid));
            aVar.mo550c();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    @C13382i(threadMode = ThreadMode.MAIN)
    public final void onInvitedClick(C1631d dVar) {
        C12932j.m33818b(dVar, "event");
        C5498a.m15602a(C5498a.f14119e.mo13125a(this.f5617c), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
        String[] strArr = {this.f5617c.getString(R.string.map_callout_button_remind), C7709b.m18762a(this.f5617c, R.string.settings_manage_alert_button_deleteinvite), this.f5617c.getString(R.string.commons_button_cancelcap)};
        C0123a aVar = new C0123a(this.f5617c);
        aVar.mo547b((CharSequence) this.f5617c.getString(R.string.settings_mange_alert_title_managefriend, new Object[]{dVar.mo7213a().mo9122b().getTargetName()}));
        aVar.mo541a((CharSequence[]) strArr, (OnClickListener) new C1625f(this, dVar));
        aVar.mo550c();
    }

    /* access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    /* renamed from: d */
    public final void m6885d(String str) {
        this.f5616b.mo7193C();
        this.f5619e.mo13902d(str).mo36535a(this.f5621g).mo36533a((Consumer<? super T>) new C1628i<Object>(this), (Consumer<? super Throwable>) new C1629j<Object>(this));
    }

    /* access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    /* renamed from: b */
    public final void m6880b(String str) {
        C8400a newBuilder = C8399z2.newBuilder();
        newBuilder.setUuid(str);
        newBuilder.mo22342a(C6812c.canceled);
        this.f5618d.friendRequestRespond((C8399z2) newBuilder.build()).mo36428a(this.f5621g).mo36412a((Consumer<? super T>) C1622c.f5624e, (Consumer<? super Throwable>) new C1623d<Object>(this));
    }

    /* access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    /* renamed from: c */
    public final void m6883c(String str) {
        this.f5616b.mo7193C();
        this.f5619e.mo13901c(str).mo36535a(this.f5621g).mo36533a((Consumer<? super T>) new C1626g<Object>(this), (Consumer<? super Throwable>) new C1627h<Object>(this));
    }

    /* renamed from: a */
    public final void mo7198a(NavigationContract navigationContract) {
        this.f5615a = navigationContract;
    }

    /* access modifiers changed from: private */
    @SuppressLint({"CheckResult"})
    /* renamed from: a */
    public final void m6877a(String str) {
        C8272a newBuilder = C8271s2.newBuilder();
        newBuilder.setUuid(str);
        this.f5618d.friendDelete((C8271s2) newBuilder.build()).mo36428a(this.f5621g).mo36412a((Consumer<? super T>) C1620a.f5622e, (Consumer<? super Throwable>) new C1621b<Object>(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m6876a(C2956k0 k0Var) {
        C2538c0 c0Var = this.f5620f;
        C2626a aVar = C2625y.f7738e;
        C2587f0 f0Var = C2587f0.MY_FRIEND_LIST;
        String targetUuid = k0Var.mo9122b().getTargetUuid();
        C12932j.m33815a((Object) targetUuid, "friendRequest.request.targetUuid");
        String targetName = k0Var.mo9122b().getTargetName();
        C12932j.m33815a((Object) targetName, "friendRequest.request.targetName");
        c0Var.mo8670a(aVar.mo8732a(f0Var, targetUuid, targetName, true), (InvitationCallback) new C2623w(this.f5617c, true));
    }
}
