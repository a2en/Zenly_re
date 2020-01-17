package app.zenly.locator.username;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.C0819o;
import androidx.fragment.app.Fragment;
import app.zenly.locator.R;
import app.zenly.locator.core.app.BaseActivity;
import app.zenly.locator.username.UsernameInputFragment.C5953a;
import app.zenly.locator.username.UsernameInputFragment.Callback;
import app.zenly.locator.username.idcard.CardPickerFragment;
import kotlin.jvm.internal.C12932j;

public final class UsernameInputActivity extends BaseActivity {

    /* renamed from: p */
    public static final C5951a f14982p = new C5951a(null);

    /* renamed from: n */
    private int f14983n;

    /* renamed from: o */
    private final C5952b f14984o = new C5952b(this);

    /* renamed from: app.zenly.locator.username.UsernameInputActivity$a */
    public static final class C5951a {
        private C5951a() {
        }

        /* renamed from: a */
        public final Intent mo13671a(Context context, String str, String str2, int i) {
            C12932j.m33818b(context, "context");
            C12932j.m33818b(str, "userId");
            C12932j.m33818b(str2, "username");
            Intent putExtra = new Intent(context, UsernameInputActivity.class).putExtra("app.zenly.locator.extra.USER_ID", str).putExtra("app.zenly.locator.extra.USERNAME", str2).putExtra("app.zenly.locator.extra.ID_CARD_STYLE", i);
            C12932j.m33815a((Object) putExtra, "Intent(context, Username…_CARD_STYLE, idCardStyle)");
            return putExtra;
        }

        public /* synthetic */ C5951a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.username.UsernameInputActivity$b */
    public static final class C5952b implements Callback {

        /* renamed from: a */
        final /* synthetic */ UsernameInputActivity f14985a;

        C5952b(UsernameInputActivity usernameInputActivity) {
            this.f14985a = usernameInputActivity;
        }

        public void onDismissed() {
            this.f14985a.finish();
        }

        public void onUsernameChanged(String str, String str2) {
            C12932j.m33818b(str, "oldUsername");
            C12932j.m33818b(str2, "newUsername");
            this.f14985a.setResult(-1, CardPickerFragment.f15079z.mo13763a(str2));
            this.f14985a.finish();
        }
    }

    /* renamed from: a */
    public static final Intent m16514a(Context context, String str, String str2, int i) {
        return f14982p.mo13671a(context, str, str2, i);
    }

    /* renamed from: a */
    public boolean mo6505a() {
        return true;
    }

    /* renamed from: d */
    public boolean mo6993d() {
        UsernameInputFragment usernameInputFragment = (UsernameInputFragment) getSupportFragmentManager().mo4083b("fragment:username");
        return usernameInputFragment != null ? usernameInputFragment.mo13676c() : super.mo6993d();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.stay_still, R.anim.stay_still);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14983n = getIntent().getIntExtra("app.zenly.locator.extra.ID_CARD_STYLE", this.f14983n);
        setContentView((int) R.layout.activity_username_input);
        String str = "fragment:username";
        UsernameInputFragment usernameInputFragment = (UsernameInputFragment) getSupportFragmentManager().mo4083b(str);
        if (usernameInputFragment == null) {
            C5953a aVar = UsernameInputFragment.f14986r;
            String stringExtra = getIntent().getStringExtra("app.zenly.locator.extra.USER_ID");
            C12932j.m33815a((Object) stringExtra, "intent.getStringExtra(EXTRA_USER_ID)");
            String stringExtra2 = getIntent().getStringExtra("app.zenly.locator.extra.USERNAME");
            C12932j.m33815a((Object) stringExtra2, "intent.getStringExtra(EXTRA_USERNAME)");
            usernameInputFragment = aVar.mo13677a(stringExtra, stringExtra2, this.f14983n);
            C0819o b = getSupportFragmentManager().mo4084b();
            b.mo4312a((int) R.id.content_container, (Fragment) usernameInputFragment, str);
            b.mo4176a();
        }
        usernameInputFragment.mo13675a((Callback) this.f14984o);
    }
}
