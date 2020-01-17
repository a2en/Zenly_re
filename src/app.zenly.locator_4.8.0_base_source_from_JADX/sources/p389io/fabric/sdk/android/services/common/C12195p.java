package p389io.fabric.sdk.android.services.common;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.appsflyer.share.Constants;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import p389io.fabric.sdk.android.C12154c;
import p389io.fabric.sdk.android.C12161g;
import p389io.fabric.sdk.android.Logger;

/* renamed from: io.fabric.sdk.android.services.common.p */
public class C12195p {

    /* renamed from: m */
    private static final Pattern f31700m = Pattern.compile("[^\\p{Alnum}]");

    /* renamed from: n */
    private static final String f31701n = Pattern.quote(Constants.URL_PATH_DELIMITER);

    /* renamed from: a */
    private final ReentrantLock f31702a = new ReentrantLock();

    /* renamed from: b */
    private final C12197q f31703b;

    /* renamed from: c */
    private final boolean f31704c;

    /* renamed from: d */
    private final boolean f31705d;

    /* renamed from: e */
    private final Context f31706e;

    /* renamed from: f */
    private final String f31707f;

    /* renamed from: g */
    private final String f31708g;

    /* renamed from: h */
    private final Collection<C12161g> f31709h;

    /* renamed from: i */
    C12171c f31710i;

    /* renamed from: j */
    C12170b f31711j;

    /* renamed from: k */
    boolean f31712k;

    /* renamed from: l */
    C12194o f31713l;

    /* renamed from: io.fabric.sdk.android.services.common.p$a */
    public enum C12196a {
        WIFI_MAC_ADDRESS(1),
        BLUETOOTH_MAC_ADDRESS(2),
        FONT_TOKEN(53),
        ANDROID_ID(100),
        ANDROID_DEVICE_ID(101),
        ANDROID_SERIAL(102),
        ANDROID_ADVERTISING_ID(103);
        

        /* renamed from: e */
        public final int f31722e;

        private C12196a(int i) {
            this.f31722e = i;
        }
    }

    public C12195p(Context context, String str, String str2, Collection<C12161g> collection) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        } else if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        } else if (collection != null) {
            this.f31706e = context;
            this.f31707f = str;
            this.f31708g = str2;
            this.f31709h = collection;
            this.f31703b = new C12197q();
            this.f31710i = new C12171c(context);
            this.f31713l = new C12194o();
            this.f31704c = C12180h.m32258a(context, "com.crashlytics.CollectDeviceIdentifiers", true);
            String str3 = "Fabric";
            if (!this.f31704c) {
                Logger f = C12154c.m32113f();
                StringBuilder sb = new StringBuilder();
                sb.append("Device ID collection disabled for ");
                sb.append(context.getPackageName());
                f.mo35954d(str3, sb.toString());
            }
            this.f31705d = C12180h.m32258a(context, "com.crashlytics.CollectUserIdentifiers", true);
            if (!this.f31705d) {
                Logger f2 = C12154c.m32113f();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("User information collection disabled for ");
                sb2.append(context.getPackageName());
                f2.mo35954d(str3, sb2.toString());
            }
        } else {
            throw new IllegalArgumentException("kits must not be null");
        }
    }

    /* renamed from: b */
    private String m32312b(String str) {
        return str.replaceAll(f31701n, "");
    }

    /* renamed from: m */
    private Boolean m32313m() {
        C12170b b = mo36084b();
        if (b != null) {
            return Boolean.valueOf(b.f31650b);
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo36083a() {
        return this.f31705d;
    }

    /* renamed from: c */
    public String mo36085c() {
        return this.f31707f;
    }

    /* renamed from: d */
    public String mo36086d() {
        String str = this.f31708g;
        if (str != null) {
            return str;
        }
        SharedPreferences i = C12180h.m32275i(this.f31706e);
        m32308a(i);
        String string = i.getString("crashlytics.installation.id", null);
        return string == null ? m32311b(i) : string;
    }

    /* renamed from: e */
    public Map<C12196a, String> mo36087e() {
        HashMap hashMap = new HashMap();
        for (C12161g gVar : this.f31709h) {
            if (gVar instanceof DeviceIdentifierProvider) {
                for (Entry entry : ((DeviceIdentifierProvider) gVar).getDeviceIdentifiers().entrySet()) {
                    m32310a(hashMap, (C12196a) entry.getKey(), (String) entry.getValue());
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* renamed from: f */
    public String mo36088f() {
        return this.f31703b.mo36095a(this.f31706e);
    }

    /* renamed from: g */
    public String mo36089g() {
        return String.format(Locale.US, "%s/%s", new Object[]{m32312b(Build.MANUFACTURER), m32312b(Build.MODEL)});
    }

    /* renamed from: h */
    public String mo36090h() {
        return m32312b(VERSION.INCREMENTAL);
    }

    /* renamed from: i */
    public String mo36091i() {
        return m32312b(VERSION.RELEASE);
    }

    /* renamed from: j */
    public String mo36092j() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo36091i());
        sb.append(Constants.URL_PATH_DELIMITER);
        sb.append(mo36090h());
        return sb.toString();
    }

    /* renamed from: k */
    public Boolean mo36093k() {
        if (mo36094l()) {
            return m32313m();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public boolean mo36094l() {
        return this.f31704c && !this.f31713l.mo36082e(this.f31706e);
    }

    /* renamed from: a */
    private String m32307a(String str) {
        if (str == null) {
            return null;
        }
        return f31700m.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: b */
    private String m32311b(SharedPreferences sharedPreferences) {
        String str = "crashlytics.installation.id";
        this.f31702a.lock();
        try {
            String string = sharedPreferences.getString(str, null);
            if (string == null) {
                string = m32307a(UUID.randomUUID().toString());
                sharedPreferences.edit().putString(str, string).commit();
            }
            return string;
        } finally {
            this.f31702a.unlock();
        }
    }

    /* renamed from: a */
    private void m32308a(SharedPreferences sharedPreferences) {
        C12170b b = mo36084b();
        if (b != null) {
            m32309a(sharedPreferences, b.f31649a);
        }
    }

    @SuppressLint({"CommitPrefEdits"})
    /* renamed from: a */
    private void m32309a(SharedPreferences sharedPreferences, String str) {
        String str2 = "crashlytics.advertising.id";
        this.f31702a.lock();
        try {
            if (!TextUtils.isEmpty(str)) {
                String string = sharedPreferences.getString(str2, null);
                if (TextUtils.isEmpty(string)) {
                    sharedPreferences.edit().putString(str2, str).commit();
                } else if (!string.equals(str)) {
                    sharedPreferences.edit().remove("crashlytics.installation.id").putString(str2, str).commit();
                }
                this.f31702a.unlock();
            }
        } finally {
            this.f31702a.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public synchronized C12170b mo36084b() {
        if (!this.f31712k) {
            this.f31711j = this.f31710i.mo36049a();
            this.f31712k = true;
        }
        return this.f31711j;
    }

    /* renamed from: a */
    private void m32310a(Map<C12196a, String> map, C12196a aVar, String str) {
        if (str != null) {
            map.put(aVar, str);
        }
    }
}
