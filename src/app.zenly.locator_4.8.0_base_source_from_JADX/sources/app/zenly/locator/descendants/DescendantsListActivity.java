package app.zenly.locator.descendants;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.C0819o;
import androidx.fragment.app.Fragment;
import app.zenly.android.feature.descendants.C1367b;
import app.zenly.locator.R;
import app.zenly.locator.RequiresAuthentication;
import app.zenly.locator.core.app.BaseActivity;
import kotlin.jvm.internal.C12932j;

public final class DescendantsListActivity extends BaseActivity implements RequiresAuthentication {

    /* renamed from: n */
    public static final C3503a f9486n = new C3503a(null);

    /* renamed from: app.zenly.locator.descendants.DescendantsListActivity$a */
    public static final class C3503a {
        private C3503a() {
        }

        /* renamed from: a */
        public final Intent mo9972a(Context context, int i, long j) {
            C12932j.m33818b(context, "context");
            Intent putExtra = new Intent(context, DescendantsListActivity.class).putExtra("app.zenly.locator.extra.descendantDataType", 1).putExtra("app.zenly.locator.extra.descendantCount", i).putExtra("app.zenly.locator.extra.descendantLastSeenDate", j);
            C12932j.m33815a((Object) putExtra, "Intent(context, Descenda…_SEEN_DATE, lastSeenDate)");
            return putExtra;
        }

        public /* synthetic */ C3503a(C12928f fVar) {
            this();
        }

        /* renamed from: a */
        public final Intent mo9973a(Context context, String str) {
            C12932j.m33818b(context, "context");
            C12932j.m33818b(str, "targetUuid");
            Intent putExtra = new Intent(context, DescendantsListActivity.class).putExtra("app.zenly.locator.extra.descendantDataType", 2).putExtra("app.zenly.locator.extra.topDescendantsTarget", str);
            C12932j.m33815a((Object) putExtra, "Intent(context, Descenda…DANTS_TARGET, targetUuid)");
            return putExtra;
        }
    }

    /* renamed from: a */
    public boolean mo6505a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C1367b bVar;
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("app.zenly.locator.extra.descendantDataType", 0);
        String str = "fragment:descendants";
        if (((C1367b) getSupportFragmentManager().mo4083b(str)) == null) {
            if (intExtra == 1) {
                bVar = new C1367b();
                bVar.mo6617c(1);
                bVar.mo6615b(getIntent().getIntExtra("app.zenly.locator.extra.descendantCount", 0));
                bVar.mo6612a(getIntent().getLongExtra("app.zenly.locator.extra.descendantLastSeenDate", 0));
            } else if (intExtra == 2) {
                bVar = new C1367b();
                bVar.mo6617c(2);
                String stringExtra = getIntent().getStringExtra("app.zenly.locator.extra.topDescendantsTarget");
                C12932j.m33815a((Object) stringExtra, "intent.getStringExtra(EX…A_TOP_DESCENDANTS_TARGET)");
                bVar.mo6613a(stringExtra);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid data type ");
                sb.append(intExtra);
                throw new IllegalArgumentException(sb.toString());
            }
            C0819o b = getSupportFragmentManager().mo4084b();
            b.mo4312a((int) R.id.content, (Fragment) bVar, str);
            b.mo4176a();
        }
    }
}
