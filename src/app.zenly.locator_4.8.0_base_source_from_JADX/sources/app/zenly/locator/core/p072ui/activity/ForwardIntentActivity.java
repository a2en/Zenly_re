package app.zenly.locator.core.p072ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p255e.C7660b;

/* renamed from: app.zenly.locator.core.ui.activity.ForwardIntentActivity */
public final class ForwardIntentActivity extends Activity {

    /* renamed from: e */
    public static final C3071a f8486e = new C3071a(null);

    /* renamed from: app.zenly.locator.core.ui.activity.ForwardIntentActivity$a */
    public static final class C3071a {
        private C3071a() {
        }

        /* renamed from: a */
        public final Intent mo9274a(Context context, Intent intent) {
            C12932j.m33818b(context, "context");
            C12932j.m33818b(intent, "intent");
            Intent putExtra = new Intent(context, ForwardIntentActivity.class).putExtra("android.intent.extra.INTENT", intent);
            C12932j.m33815a((Object) putExtra, "Intent(context, ForwardI…ent.EXTRA_INTENT, intent)");
            return putExtra;
        }

        public /* synthetic */ C3071a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public static final Intent m9608a(Context context, Intent intent) {
        return f8486e.mo9274a(context, intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("android.intent.extra.INTENT");
        C12932j.m33815a((Object) parcelableExtra, "intent.getParcelableExtra(Intent.EXTRA_INTENT)");
        C7660b.m18653a(this, (Intent) parcelableExtra);
        finish();
    }
}
