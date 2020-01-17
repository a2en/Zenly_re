package app.zenly.locator.block;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import app.zenly.locator.R;
import app.zenly.locator.block.C1717d.C1718a;
import app.zenly.locator.core.app.ConductorActivity;
import com.bluelinelabs.conductor.C8819d;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;

public final class BlockUserActivity extends ConductorActivity {

    /* renamed from: r */
    public static final C1711a f5761r = new C1711a(null);

    /* renamed from: o */
    private String f5762o;

    /* renamed from: p */
    private String f5763p;

    /* renamed from: q */
    private final boolean f5764q = true;

    /* renamed from: app.zenly.locator.block.BlockUserActivity$a */
    public static final class C1711a {
        private C1711a() {
        }

        /* renamed from: a */
        public final Intent mo7320a(Context context, UserProto$User userProto$User) {
            C12932j.m33818b(context, "context");
            C12932j.m33818b(userProto$User, "user");
            String str = "app.zenly.locator.extra.username";
            Intent putExtra = new Intent(context, BlockUserActivity.class).putExtra("app.zenly.locator.extra.user_uuid", userProto$User.getUuid()).putExtra(str, userProto$User.getName());
            C12932j.m33815a((Object) putExtra, "Intent(context, BlockUse…XTRA_USERNAME, user.name)");
            return putExtra;
        }

        public /* synthetic */ C1711a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public boolean mo6505a() {
        return this.f5764q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C8819d mo7317e() {
        C1718a aVar = C1717d.f5771V;
        String str = this.f5762o;
        if (str != null) {
            String str2 = this.f5763p;
            if (str2 != null) {
                return aVar.mo7323a(str, str2);
            }
            C12932j.m33820c("username");
            throw null;
        }
        C12932j.m33820c("userUuid");
        throw null;
    }

    /* renamed from: f */
    public final void mo7318f() {
        setResult(-1);
        finish();
    }

    public void finish() {
        overridePendingTransition(R.anim.slide_in_bottom, R.anim.slide_out_bottom);
        super.finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("app.zenly.locator.extra.user_uuid");
        C12932j.m33815a((Object) stringExtra, "intent.getStringExtra(EXTRA_USER_UUID)");
        this.f5762o = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("app.zenly.locator.extra.username");
        C12932j.m33815a((Object) stringExtra2, "intent.getStringExtra(EXTRA_USERNAME)");
        this.f5763p = stringExtra2;
        super.onCreate(bundle);
    }
}
