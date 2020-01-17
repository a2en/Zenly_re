package app.zenly.locator.recommendation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.C0819o;
import androidx.fragment.app.Fragment;
import app.zenly.locator.R;
import app.zenly.locator.core.app.BaseActivity;
import app.zenly.locator.recommendation.C5216a.C5217a;
import app.zenly.locator.recommendation.C5234b.C5235a;
import app.zenly.locator.recommendation.C5250g.C5251a;
import kotlin.jvm.internal.C12932j;

public final class RecommendationActivity extends BaseActivity {

    /* renamed from: o */
    public static final C5215a f13462o = new C5215a(null);

    /* renamed from: n */
    private final boolean f13463n = true;

    /* renamed from: app.zenly.locator.recommendation.RecommendationActivity$a */
    public static final class C5215a {
        private C5215a() {
        }

        /* renamed from: a */
        public static /* synthetic */ Intent m14843a(C5215a aVar, Context context, String str, String str2, String str3, int i, Object obj) {
            if ((i & 8) != 0) {
                str3 = "fragment:recommendationIntroduction";
            }
            return aVar.mo12543a(context, str, str2, str3);
        }

        public /* synthetic */ C5215a(C12928f fVar) {
            this();
        }

        /* renamed from: a */
        public final Intent mo12543a(Context context, String str, String str2, String str3) {
            C12932j.m33818b(context, "context");
            C12932j.m33818b(str, "userUuid");
            C12932j.m33818b(str2, "name");
            C12932j.m33818b(str3, "fragmentTag");
            Intent putExtra = new Intent(context, RecommendationActivity.class).putExtra("app.zenly.locator.extra.USER_UUID", str).putExtra("app.zenly.locator.extra.USER_NAME", str2).putExtra("app.zenly.locator.extra.FRAGMENT_TAG", str3);
            C12932j.m33815a((Object) putExtra, "Intent(context, Recommen…RAGMENT_TAG, fragmentTag)");
            return putExtra;
        }
    }

    /* renamed from: a */
    public boolean mo6505a() {
        return this.f13463n;
    }

    /* renamed from: e */
    public final void mo7317e() {
        C0819o b = getSupportFragmentManager().mo4084b();
        C5235a aVar = C5234b.f13503q;
        String stringExtra = getIntent().getStringExtra("app.zenly.locator.extra.USER_UUID");
        C12932j.m33815a((Object) stringExtra, "intent.getStringExtra(EXTRA_USER_UUID)");
        String stringExtra2 = getIntent().getStringExtra("app.zenly.locator.extra.USER_NAME");
        C12932j.m33815a((Object) stringExtra2, "intent.getStringExtra(EXTRA_USER_NAME)");
        b.mo4321b(R.id.content, aVar.mo12576a(stringExtra, stringExtra2), "fragment:recommendationFriendsOther");
        b.mo4176a();
    }

    /* renamed from: f */
    public final void mo12541f() {
        C0819o b = getSupportFragmentManager().mo4084b();
        C5217a aVar = C5216a.f13465y;
        String stringExtra = getIntent().getStringExtra("app.zenly.locator.extra.USER_UUID");
        C12932j.m33815a((Object) stringExtra, "intent.getStringExtra(EXTRA_USER_UUID)");
        String stringExtra2 = getIntent().getStringExtra("app.zenly.locator.extra.USER_NAME");
        C12932j.m33815a((Object) stringExtra2, "intent.getStringExtra(EXTRA_USER_NAME)");
        b.mo4321b(R.id.content, aVar.mo12548a(stringExtra, stringExtra2), "fragment:recommendationFriends");
        b.mo4176a();
    }

    public void finish() {
        setResult(-1);
        super.finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            String stringExtra = getIntent().getStringExtra("app.zenly.locator.extra.FRAGMENT_TAG");
            String str = "intent.getStringExtra(EXTRA_USER_NAME)";
            String str2 = "app.zenly.locator.extra.USER_NAME";
            String str3 = "intent.getStringExtra(EXTRA_USER_UUID)";
            String str4 = "app.zenly.locator.extra.USER_UUID";
            if (stringExtra != null && stringExtra.hashCode() == -1202669506) {
                String str5 = "fragment:recommendationFriendsOther";
                if (stringExtra.equals(str5)) {
                    if (((C5234b) getSupportFragmentManager().mo4083b(str5)) == null) {
                        C5235a aVar = C5234b.f13503q;
                        String stringExtra2 = getIntent().getStringExtra(str4);
                        C12932j.m33815a((Object) stringExtra2, str3);
                        String stringExtra3 = getIntent().getStringExtra(str2);
                        C12932j.m33815a((Object) stringExtra3, str);
                        C5234b a = aVar.mo12576a(stringExtra2, stringExtra3);
                        C0819o b = getSupportFragmentManager().mo4084b();
                        b.mo4312a((int) R.id.content, (Fragment) a, str5);
                        b.mo4176a();
                        return;
                    }
                    return;
                }
            }
            postponeEnterTransition();
            String str6 = "fragment:recommendationIntroduction";
            if (((C5250g) getSupportFragmentManager().mo4083b(str6)) == null) {
                C5251a aVar2 = C5250g.f13537s;
                String stringExtra4 = getIntent().getStringExtra(str4);
                C12932j.m33815a((Object) stringExtra4, str3);
                String stringExtra5 = getIntent().getStringExtra(str2);
                C12932j.m33815a((Object) stringExtra5, str);
                C5250g a2 = aVar2.mo12602a(stringExtra4, stringExtra5);
                C0819o b2 = getSupportFragmentManager().mo4084b();
                b2.mo4312a((int) R.id.content, (Fragment) a2, str6);
                b2.mo4176a();
            }
        }
    }
}
