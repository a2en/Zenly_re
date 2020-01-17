package app.zenly.locator.support;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import app.zenly.locator.R;
import app.zenly.locator.core.app.ConductorActivity;
import app.zenly.locator.core.contracts.NavigationContract;
import app.zenly.locator.support.p168di.C5665b;
import com.bluelinelabs.conductor.C8819d;
import com.google.android.libraries.places.api.Places;

public final class SupportActivity extends ConductorActivity {

    /* renamed from: o */
    private C5724n0 f14396o;

    /* renamed from: a */
    public static Intent m15947a(Context context) {
        return new Intent(context, SupportActivity.class);
    }

    /* renamed from: a */
    public boolean mo6505a() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C8819d mo7317e() {
        return new C5659d0();
    }

    /* renamed from: f */
    public void mo13280f() {
        setResult(-1);
        finish();
    }

    public void finish() {
        overridePendingTransition(R.anim.stay_still, R.anim.slide_out_bottom);
        super.finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14396o = C5665b.m15987a(this).mo13329a();
        this.f14396o.mo13406f();
        if (!Places.isInitialized()) {
            Places.initialize(this, getString(R.string.config_places_token));
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f14396o.mo13407g();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        this.f14396o.mo13396a();
        super.onStop();
    }

    /* renamed from: a */
    public static Intent m15948a(Context context, String str) {
        return m15947a(context).putExtra("app.zenly.locator.extra.TICKET_ID", str);
    }

    /* renamed from: a */
    public static void m15949a(NavigationContract navigationContract, int i, int i2) {
        if (i == 401 && i2 == -1) {
            navigationContract.onMapRequested();
        }
    }
}
