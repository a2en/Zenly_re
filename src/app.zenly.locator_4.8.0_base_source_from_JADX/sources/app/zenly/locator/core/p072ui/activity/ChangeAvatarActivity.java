package app.zenly.locator.core.p072ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.C0819o;
import androidx.fragment.app.Fragment;
import app.zenly.locator.R;
import app.zenly.locator.core.app.BaseActivity;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.core.ui.activity.ChangeAvatarActivity */
public final class ChangeAvatarActivity extends BaseActivity {

    /* renamed from: p */
    public static final C3070a f8483p = new C3070a(null);

    /* renamed from: n */
    private C3073a f8484n;

    /* renamed from: o */
    private final boolean f8485o = true;

    /* renamed from: app.zenly.locator.core.ui.activity.ChangeAvatarActivity$a */
    public static final class C3070a {
        private C3070a() {
        }

        /* renamed from: a */
        public final Intent mo9271a(Context context) {
            C12932j.m33818b(context, "context");
            return new Intent(context, ChangeAvatarActivity.class);
        }

        public /* synthetic */ C3070a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public static final Intent m9604a(Context context) {
        return f8483p.mo9271a(context);
    }

    /* renamed from: a */
    public boolean mo6505a() {
        return this.f8485o;
    }

    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.stay_still, R.anim.stay_still);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C3073a aVar = this.f8484n;
        if (aVar != null) {
            aVar.onActivityResult(i, i2, intent);
        } else {
            C12932j.m33820c("fragment");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String str = "fragment:change_avatar";
        C3073a aVar = (C3073a) getSupportFragmentManager().mo4083b(str);
        if (aVar == null) {
            aVar = new C3073a();
            C0819o b = getSupportFragmentManager().mo4084b();
            b.mo4312a((int) R.id.content, (Fragment) aVar, str);
            b.mo4176a();
        }
        this.f8484n = aVar;
    }
}
