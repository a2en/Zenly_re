package app.zenly.locator.core.invitations;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.C0819o;
import androidx.fragment.app.Fragment;
import app.zenly.locator.R;
import app.zenly.locator.core.app.BaseActivity;
import app.zenly.locator.core.invitations.p068g0.C2590a.C2591a;
import kotlin.jvm.internal.C12932j;

public final class AppShareSheetActivity extends BaseActivity {

    /* renamed from: n */
    public static final C2518a f7540n = new C2518a(null);

    /* renamed from: app.zenly.locator.core.invitations.AppShareSheetActivity$a */
    public static final class C2518a {
        private C2518a() {
        }

        /* renamed from: a */
        public final Intent mo8591a(Context context, FriendRequestTrackingInfo friendRequestTrackingInfo, String str, MessageShareContent messageShareContent, C2591a aVar) {
            C12932j.m33818b(context, "context");
            C12932j.m33818b(str, "shareTitle");
            C12932j.m33818b(messageShareContent, "shareContent");
            Intent putExtra = new Intent(context, AppShareSheetActivity.class).putExtra("app.zenly.locator.extra.SHARE_TRACKING_INFO", friendRequestTrackingInfo).putExtra("app.zenly.locator.extra.SHARE_TITLE", str).putExtra("app.zenly.locator.extra.SHARE_CONTENT", messageShareContent).putExtra("app.zenly.locator.extra.BROADCAST_ORIGIN", aVar != null ? aVar.name() : null);
            C12932j.m33815a((Object) putExtra, "Intent(context, AppShare…_ORIGIN, broadcast?.name)");
            return putExtra;
        }

        public /* synthetic */ C2518a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: d */
    public boolean mo6993d() {
        setResult(0, new Intent().putExtra("app.zenly.locator.extra.SHARE_STATE", ShareResult.f7570j.mo8636a()));
        return super.mo6993d();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.stay_still, R.anim.fade_out);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String str = "fragment:appShareSheet";
        if (((AppShareSheetFragment) getSupportFragmentManager().mo4083b(str)) == null) {
            AppShareSheetFragment appShareSheetFragment = new AppShareSheetFragment();
            appShareSheetFragment.mo8593a((FriendRequestTrackingInfo) getIntent().getParcelableExtra("app.zenly.locator.extra.SHARE_TRACKING_INFO"));
            String stringExtra = getIntent().getStringExtra("app.zenly.locator.extra.SHARE_TITLE");
            C12932j.m33815a((Object) stringExtra, "intent.getStringExtra(EXTRA_SHARE_TITLE)");
            appShareSheetFragment.mo8596b(stringExtra);
            Parcelable parcelableExtra = getIntent().getParcelableExtra("app.zenly.locator.extra.SHARE_CONTENT");
            C12932j.m33815a((Object) parcelableExtra, "intent.getParcelableExtr…ent>(EXTRA_SHARE_CONTENT)");
            appShareSheetFragment.mo8594a((MessageShareContent) parcelableExtra);
            appShareSheetFragment.mo8595a(getIntent().getStringExtra("app.zenly.locator.extra.BROADCAST_ORIGIN"));
            C0819o b = getSupportFragmentManager().mo4084b();
            b.mo4312a((int) R.id.content, (Fragment) appShareSheetFragment, str);
            b.mo4176a();
        }
    }
}
