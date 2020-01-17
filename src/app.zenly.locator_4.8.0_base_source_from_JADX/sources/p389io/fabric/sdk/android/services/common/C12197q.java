package p389io.fabric.sdk.android.services.common;

import android.content.Context;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.services.cache.C12165b;
import p389io.fabric.sdk.android.services.cache.ValueLoader;

/* renamed from: io.fabric.sdk.android.services.common.q */
public class C12197q {

    /* renamed from: a */
    private final ValueLoader<String> f31723a = new C12198a(this);

    /* renamed from: b */
    private final C12165b<String> f31724b = new C12165b<>();

    /* renamed from: io.fabric.sdk.android.services.common.q$a */
    class C12198a implements ValueLoader<String> {
        C12198a(C12197q qVar) {
        }

        public String load(Context context) throws Exception {
            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            return installerPackageName == null ? "" : installerPackageName;
        }
    }

    /* renamed from: a */
    public String mo36095a(Context context) {
        try {
            String str = (String) this.f31724b.get(context, this.f31723a);
            if ("".equals(str)) {
                str = null;
            }
            return str;
        } catch (Exception e) {
            C12154c.m32113f().mo35957e("Fabric", "Failed to determine installer package name", e);
            return null;
        }
    }
}
