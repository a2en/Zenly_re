package app.zenly.locator.experimental.inbox;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import androidx.fragment.app.FragmentActivity;
import app.zenly.locator.R;
import app.zenly.locator.core.analytics.tracker.AnalyticsTracker;
import app.zenly.locator.core.invitations.AppShareSheetLauncherFragment.Callback;
import app.zenly.locator.core.invitations.C2538c0;
import app.zenly.locator.core.invitations.C2587f0;
import app.zenly.locator.core.invitations.C2620u;
import app.zenly.locator.core.invitations.C2623w;
import app.zenly.locator.core.invitations.C2624x;
import app.zenly.locator.core.invitations.C2625y;
import app.zenly.locator.core.invitations.FriendRequestTrackingInfo;
import app.zenly.locator.core.invitations.InvitationCallback;
import app.zenly.locator.core.invitations.MessageShareContent;
import app.zenly.locator.core.invitations.ShareResult;
import app.zenly.locator.experimental.inbox.p092i.C3708a;
import app.zenly.locator.experimental.inbox.p092i.C3709b;
import app.zenly.locator.experimental.inbox.p093j.C3710a;
import app.zenly.locator.experimental.referrer.ReferrerDetails.C3744d;
import app.zenly.locator.inbox.InboxTarget;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.p196u.p197b.C5943a;
import java.util.List;
import kotlin.Lazy;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import org.greenrobot.eventbus.C13382i;
import org.greenrobot.eventbus.ThreadMode;
import p213co.znly.models.C7339i;

/* renamed from: app.zenly.locator.experimental.inbox.b */
public final class C3689b {

    /* renamed from: a */
    private final C3699e f9903a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3697d f9904b;

    /* renamed from: c */
    private final Lazy<InboxTarget> f9905c;

    /* renamed from: app.zenly.locator.experimental.inbox.b$a */
    static final class C3690a implements OnCancelListener {

        /* renamed from: e */
        final /* synthetic */ C3689b f9906e;

        /* renamed from: f */
        final /* synthetic */ C3708a f9907f;

        C3690a(C3689b bVar, C3708a aVar) {
            this.f9906e = bVar;
            this.f9907f = aVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            this.f9906e.m11065a(this.f9907f, C3710a.NOT_INVITED);
        }
    }

    /* renamed from: app.zenly.locator.experimental.inbox.b$b */
    static final class C3691b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3689b f9908e;

        /* renamed from: f */
        final /* synthetic */ List f9909f;

        /* renamed from: g */
        final /* synthetic */ C3708a f9910g;

        /* renamed from: h */
        final /* synthetic */ Activity f9911h;

        C3691b(C3689b bVar, List list, C3708a aVar, Activity activity) {
            this.f9908e = bVar;
            this.f9909f = list;
            this.f9910g = aVar;
            this.f9911h = activity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i < 0 || i >= this.f9909f.size()) {
                this.f9908e.m11065a(this.f9910g, C3710a.NOT_INVITED);
            } else {
                this.f9908e.m11062a(this.f9911h, (String) this.f9909f.get(i), this.f9910g);
            }
        }
    }

    /* renamed from: app.zenly.locator.experimental.inbox.b$c */
    public static final class C3692c implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C3689b f9912e;

        /* renamed from: f */
        final /* synthetic */ C3708a f9913f;

        /* renamed from: g */
        final /* synthetic */ C3710a f9914g;

        public C3692c(C3689b bVar, C3708a aVar, C3710a aVar2) {
            this.f9912e = bVar;
            this.f9913f = aVar;
            this.f9914g = aVar2;
        }

        public final void run() {
            this.f9912e.f9904b.mo10227a(this.f9913f.mo10234a().mo10240d(), this.f9914g);
        }
    }

    /* renamed from: app.zenly.locator.experimental.inbox.b$d */
    public static final class C3693d extends C2623w {

        /* renamed from: c */
        final /* synthetic */ C3689b f9915c;

        /* renamed from: d */
        final /* synthetic */ C3708a f9916d;

        C3693d(C3689b bVar, C3708a aVar, Activity activity, Context context, boolean z) {
            this.f9915c = bVar;
            this.f9916d = aVar;
            super(context, z);
        }

        public void onCancel() {
            super.onCancel();
            this.f9915c.m11065a(this.f9916d, C3710a.NOT_INVITED);
        }

        public boolean onError(C2624x xVar) {
            C12932j.m33818b(xVar, "error");
            this.f9915c.m11065a(this.f9916d, C3710a.NOT_INVITED);
            return super.onError(xVar);
        }

        public void onSuccess() {
            super.onSuccess();
            C5343a U = C5343a.m15160U();
            C12932j.m33815a((Object) U, "Analytics.get()");
            AnalyticsTracker a = U.mo12806a();
            C12932j.m33815a((Object) a, "Analytics.get().tracker");
            new C5943a(a, C5448c.m15478a()).mo13643a(this.f9916d.mo10234a().mo10237a() != null);
            this.f9915c.m11065a(this.f9916d, C3710a.INVITED);
        }
    }

    /* renamed from: app.zenly.locator.experimental.inbox.b$e */
    public static final class C3694e implements Callback {

        /* renamed from: a */
        final /* synthetic */ C3689b f9917a;

        /* renamed from: b */
        final /* synthetic */ C3708a f9918b;

        C3694e(C3689b bVar, C3708a aVar) {
            this.f9917a = bVar;
            this.f9918b = aVar;
        }

        public void onShareSheetClosed(ShareResult shareResult) {
            C12932j.m33818b(shareResult, "shareResult");
            if (shareResult.mo8633c()) {
                C5343a U = C5343a.m15160U();
                C12932j.m33815a((Object) U, "Analytics.get()");
                AnalyticsTracker a = U.mo12806a();
                C12932j.m33815a((Object) a, "Analytics.get().tracker");
                new C5943a(a, C5448c.m15478a()).mo13643a(this.f9918b.mo10234a().mo10237a() != null);
                this.f9917a.m11065a(this.f9918b, C3710a.INVITED);
                return;
            }
            this.f9917a.m11065a(this.f9918b, C3710a.NOT_INVITED);
        }
    }

    public C3689b(C3699e eVar, C3697d dVar, Lazy<? extends InboxTarget> lazy) {
        C12932j.m33818b(eVar, "suggestedRepository");
        C12932j.m33818b(dVar, "suggestedInvitationRepository");
        C12932j.m33818b(lazy, "target");
        this.f9903a = eVar;
        this.f9904b = dVar;
        this.f9905c = lazy;
    }

    @C13382i(threadMode = ThreadMode.MAIN)
    public final void onAddSuggestedEvent(C3708a aVar) {
        C12932j.m33818b(aVar, "event");
        Activity targetActivity = ((InboxTarget) this.f9905c.getValue()).getTargetActivity();
        if (targetActivity != null) {
            this.f9904b.mo10227a(aVar.mo10234a().mo10240d(), C3710a.INVITING);
            if (aVar.mo10234a().mo10241e() != null) {
                C2625y a = C2625y.f7738e.mo8730a(C2587f0.ADDFRIEND_SUGGESTED, aVar.mo10234a().mo10241e(), false, null, true);
                C2538c0 a2 = C2538c0.m8837a(targetActivity);
                C3693d dVar = new C3693d(this, aVar, targetActivity, targetActivity, false);
                a2.mo8670a(a, (InvitationCallback) dVar);
                return;
            }
            C7339i a3 = aVar.mo10234a().mo10237a();
            int phoneNumbersCount = a3 != null ? a3.getPhoneNumbersCount() : 0;
            if (phoneNumbersCount > 1) {
                m11061a(targetActivity, aVar);
                return;
            }
            String str = null;
            if (phoneNumbersCount == 1) {
                C7339i a4 = aVar.mo10234a().mo10237a();
                if (a4 != null) {
                    str = a4.getPhoneNumbers(0);
                }
                m11062a(targetActivity, str, aVar);
                return;
            }
            m11062a(targetActivity, (String) null, aVar);
        }
    }

    @C13382i(threadMode = ThreadMode.MAIN)
    public final void onDismissSuggestedEvent(C3709b bVar) {
        C12932j.m33818b(bVar, "event");
        this.f9903a.mo10231a(bVar.mo10236b().mo10240d());
        if (bVar.mo10235a()) {
            C5343a U = C5343a.m15160U();
            C12932j.m33815a((Object) U, "Analytics.get()");
            AnalyticsTracker a = U.mo12806a();
            C12932j.m33815a((Object) a, "Analytics.get().tracker");
            new C5943a(a, C5448c.m15478a()).mo13648b(bVar.mo10236b().mo10237a() != null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 != null) goto L_0x0015;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m11061a(android.app.Activity r5, app.zenly.locator.experimental.inbox.p092i.C3708a r6) {
        /*
            r4 = this;
            app.zenly.locator.experimental.inbox.j.b r0 = r6.mo10234a()
            co.znly.models.i r0 = r0.mo10237a()
            if (r0 == 0) goto L_0x0011
            java.util.List r0 = r0.getPhoneNumbersList()
            if (r0 == 0) goto L_0x0011
            goto L_0x0015
        L_0x0011:
            java.util.List r0 = kotlin.collections.C12848o.m33640a()
        L_0x0015:
            androidx.appcompat.app.a$a r1 = new androidx.appcompat.app.a$a
            r1.<init>(r5)
            r2 = 2131231362(0x7f080282, float:1.8078803E38)
            r1.mo527a(r2)
            r2 = 2132018240(0x7f140440, float:1.9674781E38)
            r1.mo548c(r2)
            app.zenly.locator.experimental.inbox.b$a r2 = new app.zenly.locator.experimental.inbox.b$a
            r2.<init>(r4, r6)
            r1.mo530a(r2)
            android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
            r3 = 2131624347(0x7f0e019b, float:1.8875871E38)
            r2.<init>(r5, r3, r0)
            app.zenly.locator.experimental.inbox.b$b r3 = new app.zenly.locator.experimental.inbox.b$b
            r3.<init>(r4, r0, r6, r5)
            r1.mo536a(r2, r3)
            androidx.appcompat.app.a r5 = r1.mo542a()
            r5.show()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.experimental.inbox.C3689b.m11061a(android.app.Activity, app.zenly.locator.experimental.inbox.i.a):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m11062a(Activity activity, String str, C3708a aVar) {
        if (activity != null) {
            C2620u uVar = new C2620u((FragmentActivity) activity);
            FriendRequestTrackingInfo friendRequestTrackingInfo = new FriendRequestTrackingInfo(false, C2587f0.ADDFRIEND_SUGGESTED, true, Boolean.valueOf(false), false, Integer.valueOf(0), true);
            String string = activity.getString(R.string.sharesheet_broadcastedInvite_title);
            C12932j.m33815a((Object) string, "activity.getString(R.str…_broadcastedInvite_title)");
            C2620u.m8944a(uVar, friendRequestTrackingInfo, string, new MessageShareContent(str, C3744d.Other.mo10293b()), null, null, new C3694e(this, aVar), 24, null);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m11065a(C3708a aVar, C3710a aVar2) {
        ((InboxTarget) this.f9905c.getValue()).getRecyclerView().postDelayed(new C3692c(this, aVar, aVar2), 500);
    }
}
