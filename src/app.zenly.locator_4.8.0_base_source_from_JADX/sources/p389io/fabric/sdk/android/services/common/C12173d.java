package p389io.fabric.sdk.android.services.common;

import android.content.Context;
import p389io.fabric.sdk.android.C12154c;

/* renamed from: io.fabric.sdk.android.services.common.d */
class C12173d implements AdvertisingInfoStrategy {

    /* renamed from: a */
    private final Context f31655a;

    public C12173d(Context context) {
        this.f31655a = context.getApplicationContext();
    }

    /* renamed from: b */
    private Object m32224b() {
        try {
            return Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke(null, new Object[]{this.f31655a});
        } catch (Exception unused) {
            C12154c.m32113f().mo35967w("Fabric", "Could not call getAdvertisingIdInfo on com.google.android.gms.ads.identifier.AdvertisingIdClient");
            return null;
        }
    }

    /* renamed from: c */
    private boolean m32225c() {
        try {
            return ((Boolean) Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(m32224b(), new Object[0])).booleanValue();
        } catch (Exception unused) {
            C12154c.m32113f().mo35967w("Fabric", "Could not call isLimitAdTrackingEnabled on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo36053a(Context context) {
        try {
            if (((Integer) Class.forName("com.google.android.gms.common.GooglePlayServicesUtil").getMethod("isGooglePlayServicesAvailable", new Class[]{Context.class}).invoke(null, new Object[]{context})).intValue() == 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public C12170b getAdvertisingInfo() {
        if (mo36053a(this.f31655a)) {
            return new C12170b(m32223a(), m32225c());
        }
        return null;
    }

    /* renamed from: a */
    private String m32223a() {
        try {
            return (String) Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient$Info").getMethod("getId", new Class[0]).invoke(m32224b(), new Object[0]);
        } catch (Exception unused) {
            C12154c.m32113f().mo35967w("Fabric", "Could not call getId on com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
            return null;
        }
    }
}
