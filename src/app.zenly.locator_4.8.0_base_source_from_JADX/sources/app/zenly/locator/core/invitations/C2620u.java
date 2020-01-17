package app.zenly.locator.core.invitations;

import androidx.fragment.app.FragmentActivity;
import app.zenly.locator.core.invitations.AppShareSheetLauncherFragment.Callback;
import app.zenly.locator.core.invitations.p068g0.C2590a.C2591a;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.invitations.u */
public final class C2620u {

    /* renamed from: a */
    private final FragmentActivity f7723a;

    /* renamed from: app.zenly.locator.core.invitations.u$a */
    private static final class C2621a implements Callback {

        /* renamed from: a */
        public static final C2621a f7724a = new C2621a();

        private C2621a() {
        }

        public void onShareSheetClosed(ShareResult shareResult) {
            C12932j.m33818b(shareResult, "shareResult");
        }
    }

    public C2620u(FragmentActivity fragmentActivity) {
        C12932j.m33818b(fragmentActivity, "activity");
        this.f7723a = fragmentActivity;
    }

    /* renamed from: a */
    public static /* synthetic */ void m8944a(C2620u uVar, FriendRequestTrackingInfo friendRequestTrackingInfo, String str, MessageShareContent messageShareContent, C2591a aVar, C2545e0 e0Var, Callback callback, int i, Object obj) {
        uVar.mo8725a((i & 1) != 0 ? null : friendRequestTrackingInfo, str, messageShareContent, (i & 8) != 0 ? null : aVar, (i & 16) != 0 ? null : e0Var, (i & 32) != 0 ? C2621a.f7724a : callback);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0021, code lost:
        if (r12 != null) goto L_0x0030;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo8725a(app.zenly.locator.core.invitations.FriendRequestTrackingInfo r8, java.lang.String r9, app.zenly.locator.core.invitations.MessageShareContent r10, app.zenly.locator.core.invitations.p068g0.C2590a.C2591a r11, app.zenly.locator.core.invitations.C2545e0 r12, app.zenly.locator.core.invitations.AppShareSheetLauncherFragment.Callback r13) {
        /*
            r7 = this;
            java.lang.String r0 = "shareTitle"
            kotlin.jvm.internal.C12932j.m33818b(r9, r0)
            java.lang.String r0 = "shareContent"
            kotlin.jvm.internal.C12932j.m33818b(r10, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.C12932j.m33818b(r13, r0)
            app.zenly.locator.core.invitations.AppShareSheetLauncherFragment$a r0 = app.zenly.locator.core.invitations.AppShareSheetLauncherFragment.f7555i
            androidx.fragment.app.FragmentActivity r1 = r7.f7723a
            app.zenly.locator.core.invitations.AppShareSheetLauncherFragment r0 = r0.mo8606a(r1)
            if (r0 == 0) goto L_0x0033
            if (r12 == 0) goto L_0x0024
            androidx.fragment.app.FragmentActivity r1 = r7.f7723a
            android.content.Intent r12 = r12.mo8684a(r1, r10)
            if (r12 == 0) goto L_0x0024
            goto L_0x0030
        L_0x0024:
            app.zenly.locator.core.invitations.AppShareSheetActivity$a r1 = app.zenly.locator.core.invitations.AppShareSheetActivity.f7540n
            androidx.fragment.app.FragmentActivity r2 = r7.f7723a
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            android.content.Intent r12 = r1.mo8591a(r2, r3, r4, r5, r6)
        L_0x0030:
            r0.mo8605a(r12, r13)
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.invitations.C2620u.mo8725a(app.zenly.locator.core.invitations.FriendRequestTrackingInfo, java.lang.String, app.zenly.locator.core.invitations.MessageShareContent, app.zenly.locator.core.invitations.g0.a$a, app.zenly.locator.core.invitations.e0, app.zenly.locator.core.invitations.AppShareSheetLauncherFragment$Callback):void");
    }
}
