package p389io.fabric.sdk.android.services.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.appsflyer.share.Constants;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.services.persistence.C12246b;
import p389io.fabric.sdk.android.services.persistence.PreferenceStore;

/* renamed from: io.fabric.sdk.android.services.common.c */
class C12171c {

    /* renamed from: a */
    private final Context f31651a;

    /* renamed from: b */
    private final PreferenceStore f31652b;

    /* renamed from: io.fabric.sdk.android.services.common.c$a */
    class C12172a extends C12179g {

        /* renamed from: e */
        final /* synthetic */ C12170b f31653e;

        C12172a(C12170b bVar) {
            this.f31653e = bVar;
        }

        /* renamed from: a */
        public void mo25215a() {
            C12170b a = C12171c.this.m32217e();
            if (!this.f31653e.equals(a)) {
                C12154c.m32113f().mo35954d("Fabric", "Asychronously getting Advertising Info and storing it to preferences");
                C12171c.this.m32216c(a);
            }
        }
    }

    public C12171c(Context context) {
        this.f31651a = context.getApplicationContext();
        this.f31652b = new C12246b(context, "TwitterAdvertisingInfoPreferences");
    }

    /* renamed from: b */
    private void m32215b(C12170b bVar) {
        new Thread(new C12172a(bVar)).start();
    }

    /* access modifiers changed from: private */
    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: c */
    public void m32216c(C12170b bVar) {
        boolean a = m32214a(bVar);
        String str = "limit_ad_tracking_enabled";
        String str2 = Constants.URL_ADVERTISING_ID;
        if (a) {
            PreferenceStore preferenceStore = this.f31652b;
            preferenceStore.save(preferenceStore.edit().putString(str2, bVar.f31649a).putBoolean(str, bVar.f31650b));
            return;
        }
        PreferenceStore preferenceStore2 = this.f31652b;
        preferenceStore2.save(preferenceStore2.edit().remove(str2).remove(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public C12170b m32217e() {
        C12170b advertisingInfo = mo36051c().getAdvertisingInfo();
        String str = "Fabric";
        if (!m32214a(advertisingInfo)) {
            advertisingInfo = mo36052d().getAdvertisingInfo();
            if (!m32214a(advertisingInfo)) {
                C12154c.m32113f().mo35954d(str, "AdvertisingInfo not present");
            } else {
                C12154c.m32113f().mo35954d(str, "Using AdvertisingInfo from Service Provider");
            }
        } else {
            C12154c.m32113f().mo35954d(str, "Using AdvertisingInfo from Reflection Provider");
        }
        return advertisingInfo;
    }

    /* renamed from: d */
    public AdvertisingInfoStrategy mo36052d() {
        return new C12174e(this.f31651a);
    }

    /* renamed from: a */
    public C12170b mo36049a() {
        C12170b b = mo36050b();
        if (m32214a(b)) {
            C12154c.m32113f().mo35954d("Fabric", "Using AdvertisingInfo from Preference Store");
            m32215b(b);
            return b;
        }
        C12170b e = m32217e();
        m32216c(e);
        return e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C12170b mo36050b() {
        return new C12170b(this.f31652b.get().getString(Constants.URL_ADVERTISING_ID, ""), this.f31652b.get().getBoolean("limit_ad_tracking_enabled", false));
    }

    /* renamed from: a */
    private boolean m32214a(C12170b bVar) {
        return bVar != null && !TextUtils.isEmpty(bVar.f31649a);
    }

    /* renamed from: c */
    public AdvertisingInfoStrategy mo36051c() {
        return new C12173d(this.f31651a);
    }
}
