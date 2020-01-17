package app.zenly.locator.core.invitations;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.C0819o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import app.zenly.android.feature.base.app.C1321b;
import app.zenly.locator.R;
import app.zenly.locator.core.manager.p069di.C2666b;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;

public final class AppShareSheetLauncherFragment extends C1321b {

    /* renamed from: i */
    public static final C2523a f7555i = new C2523a(null);

    /* renamed from: f */
    private Callback f7556f;

    /* renamed from: g */
    private boolean f7557g;

    /* renamed from: h */
    private HashMap f7558h;

    public interface Callback {
        void onShareSheetClosed(ShareResult shareResult);
    }

    /* renamed from: app.zenly.locator.core.invitations.AppShareSheetLauncherFragment$a */
    public static final class C2523a {
        private C2523a() {
        }

        /* renamed from: a */
        public final AppShareSheetLauncherFragment mo8606a(FragmentActivity fragmentActivity) {
            C12932j.m33818b(fragmentActivity, "activity");
            return (AppShareSheetLauncherFragment) fragmentActivity.getSupportFragmentManager().mo4083b("fragment:appShareSheetLauncher");
        }

        /* renamed from: b */
        public final AppShareSheetLauncherFragment mo8607b(FragmentActivity fragmentActivity) {
            C12932j.m33818b(fragmentActivity, "activity");
            String str = "fragment:appShareSheetLauncher";
            AppShareSheetLauncherFragment appShareSheetLauncherFragment = (AppShareSheetLauncherFragment) fragmentActivity.getSupportFragmentManager().mo4083b(str);
            if (appShareSheetLauncherFragment != null) {
                return appShareSheetLauncherFragment;
            }
            AppShareSheetLauncherFragment appShareSheetLauncherFragment2 = new AppShareSheetLauncherFragment();
            C0819o b = fragmentActivity.getSupportFragmentManager().mo4084b();
            b.mo4312a((int) R.id.content, (Fragment) appShareSheetLauncherFragment2, str);
            b.mo4176a();
            return appShareSheetLauncherFragment2;
        }

        public /* synthetic */ C2523a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public void mo6508a() {
        HashMap hashMap = this.f7558h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: a */
    public final void mo8605a(Intent intent, Callback callback) {
        C12932j.m33818b(intent, "intent");
        C12932j.m33818b(callback, "callback");
        if (this.f7557g) {
            callback.onShareSheetClosed(ShareResult.f7570j.mo8636a());
            return;
        }
        this.f7557g = true;
        this.f7556f = callback;
        startActivityForResult(intent, 301);
        requireActivity().overridePendingTransition(R.anim.fade_in, R.anim.stay_still);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        if (r1 != null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r1, int r2, android.content.Intent r3) {
        /*
            r0 = this;
            super.onActivityResult(r1, r2, r3)
            r2 = 301(0x12d, float:4.22E-43)
            if (r1 != r2) goto L_0x0024
            if (r3 == 0) goto L_0x0014
            java.lang.String r1 = "app.zenly.locator.extra.SHARE_STATE"
            android.os.Parcelable r1 = r3.getParcelableExtra(r1)
            app.zenly.locator.core.invitations.ShareResult r1 = (app.zenly.locator.core.invitations.ShareResult) r1
            if (r1 == 0) goto L_0x0014
            goto L_0x001a
        L_0x0014:
            app.zenly.locator.core.invitations.ShareResult$a r1 = app.zenly.locator.core.invitations.ShareResult.f7570j
            app.zenly.locator.core.invitations.ShareResult r1 = r1.mo8637b()
        L_0x001a:
            app.zenly.locator.core.invitations.AppShareSheetLauncherFragment$Callback r2 = r0.f7556f
            if (r2 == 0) goto L_0x0021
            r2.onShareSheetClosed(r1)
        L_0x0021:
            r1 = 0
            r0.f7557g = r1
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.core.invitations.AppShareSheetLauncherFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context requireContext = requireContext();
        C12932j.m33815a((Object) requireContext, "requireContext()");
        C2666b.m9049a(requireContext).mo8764b();
    }

    public void onDestroy() {
        this.f7556f = null;
        this.f7557g = false;
        super.onDestroy();
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo6508a();
    }
}
