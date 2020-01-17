package com.appsflyer;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.appsflyer.AFExecutor.C87382.C87391;
import com.appsflyer.AFFacebookDeferredDeeplink.C87402;
import com.appsflyer.AFLogger.LogLevel;
import com.appsflyer.AppsFlyerProperties.EmailsCryptType;
import com.appsflyer.OneLinkHttpTask.HttpsUrlConnectionProvider;
import com.appsflyer.internal.C8752aa;
import com.appsflyer.internal.C8753ab;
import com.appsflyer.internal.C8754ac;
import com.appsflyer.internal.C8757ad;
import com.appsflyer.internal.C8762b.C8763b.C8764a;
import com.appsflyer.internal.C8769f;
import com.appsflyer.internal.C8770g;
import com.appsflyer.internal.C8770g.C87712;
import com.appsflyer.internal.C8772h;
import com.appsflyer.internal.C8774k;
import com.appsflyer.internal.C8775l;
import com.appsflyer.internal.C8775l.C8776a;
import com.appsflyer.internal.C8778m;
import com.appsflyer.internal.C8785p;
import com.appsflyer.internal.C8787q;
import com.appsflyer.internal.C8788r;
import com.appsflyer.internal.C8790s;
import com.appsflyer.internal.C8796u;
import com.appsflyer.internal.C8796u.C8797a;
import com.appsflyer.internal.C8799v;
import com.appsflyer.internal.C8800w;
import com.appsflyer.internal.C8801x;
import com.appsflyer.internal.C8802y;
import com.appsflyer.internal.C8802y.C8803a;
import com.appsflyer.share.Constants;
import com.google.android.gms.common.C10067c;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.NetworkInterface;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AppsFlyerLibCore extends AppsFlyerLib implements C8774k {
    public static final String AF_PRE_INSTALL_PATH = "AF_PRE_INSTALL_PATH";
    public static final String IS_STOP_TRACKING_USED = "is_stop_tracking_used";
    public static final String LOG_TAG = "AppsFlyer_4.10.3";
    public static final String PRE_INSTALL_SYSTEM_DEFAULT = "/data/local/tmp/pre_install.appsflyer";
    public static final String PRE_INSTALL_SYSTEM_DEFAULT_ETC = "/etc/pre_install.appsflyer";
    public static final String PRE_INSTALL_SYSTEM_RO_PROP = "ro.appsflyer.preinstall.path";

    /* renamed from: ʻ */
    private static String f22525 = null;

    /* renamed from: ʼ */
    private static final String f22526;

    /* renamed from: ˊ */
    public static AppsFlyerInAppPurchaseValidatorListener f22527 = null;

    /* renamed from: ˊॱ */
    private static final List<String> f22528 = Arrays.asList(new String[]{"is_cache"});

    /* renamed from: ˋॱ */
    private static AppsFlyerLibCore f22529 = new AppsFlyerLibCore();

    /* renamed from: ˎ */
    public static final String f22530 = "4";

    /* renamed from: ˏ */
    public static final String f22531;
    /* access modifiers changed from: private */

    /* renamed from: ˏॱ */
    public static AppsFlyerConversionListener f22532 = null;

    /* renamed from: ͺ */
    private static String f22533;
    /* access modifiers changed from: private */

    /* renamed from: ॱˊ */
    public static final List<String> f22534 = Arrays.asList(new String[]{"googleplay", "playstore", "googleplaystore"});

    /* renamed from: ᐝ */
    private static String f22535;
    public Uri latestDeepLink = null;

    /* renamed from: ʻॱ */
    private long f22536 = TimeUnit.SECONDS.toMillis(5);
    /* access modifiers changed from: private */

    /* renamed from: ʼॱ */
    public boolean f22537 = false;

    /* renamed from: ʽ */
    long f22538;
    /* access modifiers changed from: private */

    /* renamed from: ʽॱ */
    public Map<String, String> f22539;

    /* renamed from: ʾ */
    private C8797a f22540;
    /* access modifiers changed from: private */

    /* renamed from: ʿ */
    public long f22541;
    /* access modifiers changed from: private */

    /* renamed from: ˈ */
    public ScheduledExecutorService f22542 = null;

    /* renamed from: ˉ */
    private long f22543;

    /* renamed from: ˊˊ */
    private String f22544;

    /* renamed from: ˊˋ */
    private boolean f22545 = false;

    /* renamed from: ˊᐝ */
    private boolean f22546 = false;

    /* renamed from: ˋ */
    public String f22547;

    /* renamed from: ˋˊ */
    private Map<Long, String> f22548;

    /* renamed from: ˋˋ */
    private boolean f22549;

    /* renamed from: ˋᐝ */
    private C8754ac f22550 = new C8754ac();

    /* renamed from: ˌ */
    private boolean f22551 = false;

    /* renamed from: ˍ */
    private boolean f22552;

    /* renamed from: ˎˎ */
    private boolean f22553 = false;

    /* renamed from: ˎˏ */
    private boolean f22554 = false;
    /* access modifiers changed from: private */

    /* renamed from: ˏˎ */
    public JSONObject f22555;

    /* renamed from: ˏˏ */
    private String f22556;

    /* renamed from: ˑ */
    private Application f22557;

    /* renamed from: ॱ */
    public String f22558;

    /* renamed from: ॱˋ */
    private long f22559 = -1;

    /* renamed from: ॱˎ */
    private String f22560;

    /* renamed from: ॱॱ */
    public long f22561;

    /* renamed from: ॱᐝ */
    private long f22562 = -1;

    /* renamed from: ᐝॱ */
    private C8769f f22563 = null;

    /* renamed from: com.appsflyer.AppsFlyerLibCore$3 */
    static /* synthetic */ class C87433 {

        /* renamed from: ॱ */
        static final /* synthetic */ int[] f22568 = new int[EmailsCryptType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.appsflyer.AppsFlyerProperties$EmailsCryptType[] r0 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22568 = r0
                int[] r0 = f22568     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.appsflyer.AppsFlyerProperties$EmailsCryptType r1 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.SHA1     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f22568     // Catch:{ NoSuchFieldError -> 0x001f }
                com.appsflyer.AppsFlyerProperties$EmailsCryptType r1 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.MD5     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f22568     // Catch:{ NoSuchFieldError -> 0x002a }
                com.appsflyer.AppsFlyerProperties$EmailsCryptType r1 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.SHA256     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f22568     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.appsflyer.AppsFlyerProperties$EmailsCryptType r1 = com.appsflyer.AppsFlyerProperties.EmailsCryptType.NONE     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.C87433.<clinit>():void");
        }
    }

    /* renamed from: com.appsflyer.AppsFlyerLibCore$a */
    abstract class C8746a implements Runnable {

        /* renamed from: ˊ */
        private AtomicInteger f22574 = new AtomicInteger(0);

        /* renamed from: ˋ */
        private ScheduledExecutorService f22575;

        /* renamed from: ˎ */
        WeakReference<Context> f22576 = null;

        /* renamed from: ॱ */
        private String f22578;

        C8746a(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
            this.f22576 = new WeakReference<>(context);
            this.f22578 = str;
            if (scheduledExecutorService == null) {
                this.f22575 = AFExecutor.getInstance().mo23616();
            } else {
                this.f22575 = scheduledExecutorService;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:77:0x0244, code lost:
            if (r8 == null) goto L_0x0269;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:89:0x0269, code lost:
            r1.f22575.shutdown();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:90:0x026e, code lost:
            return;
         */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00a4 A[Catch:{ all -> 0x0249 }] */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00fe A[Catch:{ q -> 0x0208, all -> 0x0247 }] */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x011f A[Catch:{ q -> 0x0208, all -> 0x0247 }] */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x0213 A[Catch:{ q -> 0x0208, all -> 0x0247 }] */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x0251 A[Catch:{ all -> 0x026f }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r17 = this;
                r1 = r17
                java.lang.String r0 = "is_first_launch"
                java.lang.String r2 = "af_siteid"
                java.lang.String r3 = r1.f22578
                if (r3 == 0) goto L_0x027b
                int r3 = r3.length()
                if (r3 != 0) goto L_0x0012
                goto L_0x027b
            L_0x0012:
                com.appsflyer.AppsFlyerLibCore r3 = com.appsflyer.AppsFlyerLibCore.this
                boolean r3 = r3.isTrackingStopped()
                if (r3 == 0) goto L_0x001b
                return
            L_0x001b:
                java.util.concurrent.atomic.AtomicInteger r3 = r1.f22574
                r3.incrementAndGet()
                r3 = 0
                r4 = 0
                java.lang.ref.WeakReference<android.content.Context> r5 = r1.f22576     // Catch:{ all -> 0x0249 }
                java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0249 }
                android.content.Context r5 = (android.content.Context) r5     // Catch:{ all -> 0x0249 }
                if (r5 != 0) goto L_0x0032
                java.util.concurrent.atomic.AtomicInteger r0 = r1.f22574
                r0.decrementAndGet()
                return
            L_0x0032:
                long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0249 }
                java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0249 }
                r8.<init>(r5)     // Catch:{ all -> 0x0249 }
                java.lang.String r8 = com.appsflyer.AppsFlyerLibCore.m20640(r8)     // Catch:{ all -> 0x0249 }
                java.lang.String r8 = com.appsflyer.AppsFlyerLibCore.m20595(r5, r8)     // Catch:{ all -> 0x0249 }
                java.lang.String r9 = ""
                r10 = 1
                if (r8 == 0) goto L_0x006e
                java.util.List r11 = com.appsflyer.AppsFlyerLibCore.f22534     // Catch:{ all -> 0x0249 }
                java.lang.String r12 = r8.toLowerCase()     // Catch:{ all -> 0x0249 }
                boolean r11 = r11.contains(r12)     // Catch:{ all -> 0x0249 }
                if (r11 != 0) goto L_0x0061
                java.lang.String r11 = "-"
                java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0249 }
                java.lang.String r8 = r11.concat(r8)     // Catch:{ all -> 0x0249 }
                goto L_0x006f
            L_0x0061:
                java.lang.String r11 = "AF detected using redundant Google-Play channel for attribution - %s. Using without channel postfix."
                java.lang.Object[] r12 = new java.lang.Object[r10]     // Catch:{ all -> 0x0249 }
                r12[r4] = r8     // Catch:{ all -> 0x0249 }
                java.lang.String r8 = java.lang.String.format(r11, r12)     // Catch:{ all -> 0x0249 }
                com.appsflyer.AFLogger.afWarnLog(r8)     // Catch:{ all -> 0x0249 }
            L_0x006e:
                r8 = r9
            L_0x006f:
                java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0249 }
                r11.<init>()     // Catch:{ all -> 0x0249 }
                java.lang.String r12 = r17.mo23721()     // Catch:{ all -> 0x0249 }
                r11.append(r12)     // Catch:{ all -> 0x0249 }
                java.lang.String r12 = r5.getPackageName()     // Catch:{ all -> 0x0249 }
                r11.append(r12)     // Catch:{ all -> 0x0249 }
                r11.append(r8)     // Catch:{ all -> 0x0249 }
                java.lang.String r8 = "?devkey="
                r11.append(r8)     // Catch:{ all -> 0x0249 }
                java.lang.String r8 = r1.f22578     // Catch:{ all -> 0x0249 }
                r11.append(r8)     // Catch:{ all -> 0x0249 }
                java.lang.String r8 = "&device_id="
                r11.append(r8)     // Catch:{ all -> 0x0249 }
                java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0249 }
                r8.<init>(r5)     // Catch:{ all -> 0x0249 }
                java.lang.String r8 = com.appsflyer.internal.C8753ab.m20687(r8)     // Catch:{ all -> 0x0249 }
                r11.append(r8)     // Catch:{ all -> 0x0249 }
                com.appsflyer.internal.aa r8 = com.appsflyer.internal.C8752aa.f22603     // Catch:{ all -> 0x0249 }
                if (r8 != 0) goto L_0x00ab
                com.appsflyer.internal.aa r8 = new com.appsflyer.internal.aa     // Catch:{ all -> 0x0249 }
                r8.<init>()     // Catch:{ all -> 0x0249 }
                com.appsflyer.internal.C8752aa.f22603 = r8     // Catch:{ all -> 0x0249 }
            L_0x00ab:
                com.appsflyer.internal.aa r8 = com.appsflyer.internal.C8752aa.f22603     // Catch:{ all -> 0x0249 }
                java.lang.String r12 = r11.toString()     // Catch:{ all -> 0x0249 }
                java.lang.String r13 = "server_request"
                java.lang.String[] r9 = new java.lang.String[]{r9}     // Catch:{ all -> 0x0249 }
                r8.mo23772(r13, r12, r9)     // Catch:{ all -> 0x0249 }
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0249 }
                java.lang.String r9 = "Calling server for attribution url: "
                r8.<init>(r9)     // Catch:{ all -> 0x0249 }
                java.lang.String r9 = r11.toString()     // Catch:{ all -> 0x0249 }
                r8.append(r9)     // Catch:{ all -> 0x0249 }
                java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0249 }
                com.appsflyer.AFFacebookDeferredDeeplink.C87402.m20581(r8)     // Catch:{ all -> 0x0249 }
                java.net.URL r8 = new java.net.URL     // Catch:{ all -> 0x0249 }
                java.lang.String r9 = r11.toString()     // Catch:{ all -> 0x0249 }
                r8.<init>(r9)     // Catch:{ all -> 0x0249 }
                java.net.URLConnection r8 = r8.openConnection()     // Catch:{ all -> 0x0249 }
                java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ all -> 0x0249 }
                java.lang.String r3 = "GET"
                r8.setRequestMethod(r3)     // Catch:{ all -> 0x0247 }
                r3 = 10000(0x2710, float:1.4013E-41)
                r8.setConnectTimeout(r3)     // Catch:{ all -> 0x0247 }
                java.lang.String r3 = "Connection"
                java.lang.String r9 = "close"
                r8.setRequestProperty(r3, r9)     // Catch:{ all -> 0x0247 }
                r8.connect()     // Catch:{ all -> 0x0247 }
                int r3 = r8.getResponseCode()     // Catch:{ all -> 0x0247 }
                java.lang.String r9 = com.appsflyer.AppsFlyerLibCore.m20641(r8)     // Catch:{ all -> 0x0247 }
                com.appsflyer.internal.aa r12 = com.appsflyer.internal.C8752aa.f22603     // Catch:{ all -> 0x0247 }
                if (r12 != 0) goto L_0x0105
                com.appsflyer.internal.aa r12 = new com.appsflyer.internal.aa     // Catch:{ all -> 0x0247 }
                r12.<init>()     // Catch:{ all -> 0x0247 }
                com.appsflyer.internal.C8752aa.f22603 = r12     // Catch:{ all -> 0x0247 }
            L_0x0105:
                com.appsflyer.internal.aa r12 = com.appsflyer.internal.C8752aa.f22603     // Catch:{ all -> 0x0247 }
                java.lang.String r13 = r11.toString()     // Catch:{ all -> 0x0247 }
                java.lang.String r14 = "server_response"
                r15 = 2
                java.lang.String[] r15 = new java.lang.String[r15]     // Catch:{ all -> 0x0247 }
                java.lang.String r16 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0247 }
                r15[r4] = r16     // Catch:{ all -> 0x0247 }
                r15[r10] = r9     // Catch:{ all -> 0x0247 }
                r12.mo23772(r14, r13, r15)     // Catch:{ all -> 0x0247 }
                r12 = 200(0xc8, float:2.8E-43)
                if (r3 != r12) goto L_0x0213
                long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0247 }
                java.lang.String r3 = "appsflyerGetConversionDataTiming"
                long r11 = r11 - r6
                com.appsflyer.AppsFlyerLibCore.m20644(r5, r3, r11)     // Catch:{ all -> 0x0247 }
                java.lang.String r3 = "Attribution data: "
                java.lang.String r6 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0247 }
                java.lang.String r3 = r3.concat(r6)     // Catch:{ all -> 0x0247 }
                com.appsflyer.AFFacebookDeferredDeeplink.C87402.m20581(r3)     // Catch:{ all -> 0x0247 }
                int r3 = r9.length()     // Catch:{ all -> 0x0247 }
                if (r3 <= 0) goto L_0x023f
                if (r5 == 0) goto L_0x023f
                java.util.Map r3 = com.appsflyer.AppsFlyerLibCore.m20617(r9)     // Catch:{ all -> 0x0247 }
                java.lang.String r6 = "iscache"
                java.lang.Object r6 = r3.get(r6)     // Catch:{ all -> 0x0247 }
                java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0247 }
                if (r6 == 0) goto L_0x015f
                java.lang.String r7 = java.lang.Boolean.toString(r4)     // Catch:{ all -> 0x0247 }
                boolean r7 = r7.equals(r6)     // Catch:{ all -> 0x0247 }
                if (r7 == 0) goto L_0x015f
                java.lang.String r7 = "appsflyerConversionDataCacheExpiration"
                long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0247 }
                com.appsflyer.AppsFlyerLibCore.m20644(r5, r7, r11)     // Catch:{ all -> 0x0247 }
            L_0x015f:
                boolean r7 = r3.containsKey(r2)     // Catch:{ all -> 0x0247 }
                java.lang.String r11 = "[Invite] Detected App-Invite via channel: "
                java.lang.String r12 = "af_channel"
                if (r7 == 0) goto L_0x0196
                boolean r7 = r3.containsKey(r12)     // Catch:{ all -> 0x0247 }
                if (r7 == 0) goto L_0x0185
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0247 }
                r7.<init>(r11)     // Catch:{ all -> 0x0247 }
                java.lang.Object r13 = r3.get(r12)     // Catch:{ all -> 0x0247 }
                java.lang.String r13 = (java.lang.String) r13     // Catch:{ all -> 0x0247 }
                r7.append(r13)     // Catch:{ all -> 0x0247 }
                java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0247 }
                com.appsflyer.AFLogger.afDebugLog(r7)     // Catch:{ all -> 0x0247 }
                goto L_0x0196
            L_0x0185:
                java.lang.String r7 = "[CrossPromotion] App was installed via %s's Cross Promotion"
                java.lang.Object[] r13 = new java.lang.Object[r10]     // Catch:{ all -> 0x0247 }
                java.lang.Object r14 = r3.get(r2)     // Catch:{ all -> 0x0247 }
                r13[r4] = r14     // Catch:{ all -> 0x0247 }
                java.lang.String r7 = java.lang.String.format(r7, r13)     // Catch:{ all -> 0x0247 }
                com.appsflyer.AFLogger.afDebugLog(r7)     // Catch:{ all -> 0x0247 }
            L_0x0196:
                boolean r2 = r3.containsKey(r2)     // Catch:{ all -> 0x0247 }
                if (r2 == 0) goto L_0x01b1
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0247 }
                r2.<init>(r11)     // Catch:{ all -> 0x0247 }
                java.lang.Object r7 = r3.get(r12)     // Catch:{ all -> 0x0247 }
                java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x0247 }
                r2.append(r7)     // Catch:{ all -> 0x0247 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0247 }
                com.appsflyer.AFLogger.afDebugLog(r2)     // Catch:{ all -> 0x0247 }
            L_0x01b1:
                java.lang.String r2 = java.lang.Boolean.toString(r4)     // Catch:{ all -> 0x0247 }
                r3.put(r0, r2)     // Catch:{ all -> 0x0247 }
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0247 }
                r2.<init>(r3)     // Catch:{ all -> 0x0247 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0247 }
                java.lang.String r7 = "attributionId"
                if (r2 == 0) goto L_0x01c9
                com.appsflyer.AppsFlyerLibCore.m20604(r5, r7, r2)     // Catch:{ all -> 0x0247 }
                goto L_0x01cc
            L_0x01c9:
                com.appsflyer.AppsFlyerLibCore.m20604(r5, r7, r9)     // Catch:{ all -> 0x0247 }
            L_0x01cc:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0247 }
                java.lang.String r7 = "iscache="
                r2.<init>(r7)     // Catch:{ all -> 0x0247 }
                r2.append(r6)     // Catch:{ all -> 0x0247 }
                java.lang.String r6 = " caching conversion data"
                r2.append(r6)     // Catch:{ all -> 0x0247 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0247 }
                com.appsflyer.AFLogger.afDebugLog(r2)     // Catch:{ all -> 0x0247 }
                com.appsflyer.AppsFlyerConversionListener r2 = com.appsflyer.AppsFlyerLibCore.f22532     // Catch:{ all -> 0x0247 }
                if (r2 == 0) goto L_0x023f
                java.util.concurrent.atomic.AtomicInteger r2 = r1.f22574     // Catch:{ all -> 0x0247 }
                int r2 = r2.intValue()     // Catch:{ all -> 0x0247 }
                if (r2 > r10) goto L_0x023f
                java.util.Map r2 = com.appsflyer.AppsFlyerLibCore.m20616(r5)     // Catch:{ q -> 0x0208 }
                android.content.SharedPreferences r5 = com.appsflyer.AppsFlyerLibCore.m20625(r5)     // Catch:{ q -> 0x0208 }
                java.lang.String r6 = "sixtyDayConversionData"
                boolean r5 = r5.getBoolean(r6, r4)     // Catch:{ q -> 0x0208 }
                if (r5 != 0) goto L_0x020f
                java.lang.String r5 = java.lang.Boolean.toString(r10)     // Catch:{ q -> 0x0208 }
                r2.put(r0, r5)     // Catch:{ q -> 0x0208 }
                goto L_0x020f
            L_0x0208:
                r0 = move-exception
                java.lang.String r2 = "Exception while trying to fetch attribution data. "
                com.appsflyer.AFLogger.afErrorLog(r2, r0)     // Catch:{ all -> 0x0247 }
                r2 = r3
            L_0x020f:
                r1.mo23719(r2)     // Catch:{ all -> 0x0247 }
                goto L_0x023f
            L_0x0213:
                com.appsflyer.AppsFlyerConversionListener r0 = com.appsflyer.AppsFlyerLibCore.f22532     // Catch:{ all -> 0x0247 }
                if (r0 == 0) goto L_0x0226
                java.lang.String r0 = "Error connection to server: "
                java.lang.String r2 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0247 }
                java.lang.String r0 = r0.concat(r2)     // Catch:{ all -> 0x0247 }
                r1.mo23720(r0, r3)     // Catch:{ all -> 0x0247 }
            L_0x0226:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0247 }
                java.lang.String r2 = "AttributionIdFetcher response code: "
                r0.<init>(r2)     // Catch:{ all -> 0x0247 }
                r0.append(r3)     // Catch:{ all -> 0x0247 }
                java.lang.String r2 = "  url: "
                r0.append(r2)     // Catch:{ all -> 0x0247 }
                r0.append(r11)     // Catch:{ all -> 0x0247 }
                java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0247 }
                com.appsflyer.AFFacebookDeferredDeeplink.C87402.m20581(r0)     // Catch:{ all -> 0x0247 }
            L_0x023f:
                java.util.concurrent.atomic.AtomicInteger r0 = r1.f22574
                r0.decrementAndGet()
                if (r8 == 0) goto L_0x0269
                goto L_0x0266
            L_0x0247:
                r0 = move-exception
                goto L_0x024b
            L_0x0249:
                r0 = move-exception
                r8 = r3
            L_0x024b:
                com.appsflyer.AppsFlyerConversionListener r2 = com.appsflyer.AppsFlyerLibCore.f22532     // Catch:{ all -> 0x026f }
                if (r2 == 0) goto L_0x0258
                java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x026f }
                r1.mo23720(r2, r4)     // Catch:{ all -> 0x026f }
            L_0x0258:
                java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x026f }
                com.appsflyer.AFLogger.afErrorLog(r2, r0)     // Catch:{ all -> 0x026f }
                java.util.concurrent.atomic.AtomicInteger r0 = r1.f22574
                r0.decrementAndGet()
                if (r8 == 0) goto L_0x0269
            L_0x0266:
                r8.disconnect()
            L_0x0269:
                java.util.concurrent.ScheduledExecutorService r0 = r1.f22575
                r0.shutdown()
                return
            L_0x026f:
                r0 = move-exception
                java.util.concurrent.atomic.AtomicInteger r2 = r1.f22574
                r2.decrementAndGet()
                if (r8 == 0) goto L_0x027a
                r8.disconnect()
            L_0x027a:
                throw r0
            L_0x027b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.C8746a.run():void");
        }

        /* access modifiers changed from: protected */
        /* renamed from: ˊ */
        public abstract void mo23719(Map<String, String> map);

        /* access modifiers changed from: protected */
        /* renamed from: ˋ */
        public abstract void mo23720(String str, int i);

        /* renamed from: ˎ */
        public abstract String mo23721();
    }

    /* renamed from: com.appsflyer.AppsFlyerLibCore$b */
    class C8747b implements Runnable {

        /* renamed from: ˊ */
        private WeakReference<Context> f22579 = null;

        public C8747b(Context context) {
            this.f22579 = new WeakReference<>(context);
        }

        public final void run() {
            if (!AppsFlyerLibCore.this.f22537) {
                AppsFlyerLibCore.this.f22541 = System.currentTimeMillis();
                if (this.f22579 != null) {
                    AppsFlyerLibCore.this.f22537 = true;
                    try {
                        String r1 = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY);
                        synchronized (this.f22579) {
                            C8800w.m20769();
                            for (AFFacebookDeferredDeeplink aFFacebookDeferredDeeplink : C8800w.m20770((Context) this.f22579.get())) {
                                StringBuilder sb = new StringBuilder("resending request: ");
                                sb.append(aFFacebookDeferredDeeplink.f22509);
                                AFLogger.afInfoLog(sb.toString());
                                try {
                                    long currentTimeMillis = System.currentTimeMillis();
                                    long parseLong = Long.parseLong(aFFacebookDeferredDeeplink.f22510, 10);
                                    AppsFlyerLibCore appsFlyerLibCore = AppsFlyerLibCore.this;
                                    C8772h hVar = new C8772h();
                                    StringBuilder sb2 = new StringBuilder();
                                    sb2.append(aFFacebookDeferredDeeplink.f22509);
                                    sb2.append("&isCachedRequest=true&timeincache=");
                                    sb2.append((currentTimeMillis - parseLong) / 1000);
                                    hVar.f22723 = sb2.toString();
                                    hVar.f22719 = aFFacebookDeferredDeeplink.f22511;
                                    hVar.f22726 = r1;
                                    hVar.f22721 = this.f22579;
                                    hVar.f22714 = aFFacebookDeferredDeeplink.f22510;
                                    hVar.f22713 = false;
                                    AppsFlyerLibCore.m20645(appsFlyerLibCore, hVar);
                                } catch (Exception e) {
                                    AFLogger.afErrorLog("Failed to resend cached request", e);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        try {
                            AFLogger.afErrorLog("failed to check cache. ", e2);
                        } catch (Throwable th) {
                            AppsFlyerLibCore.this.f22537 = false;
                            throw th;
                        }
                    }
                    AppsFlyerLibCore.this.f22537 = false;
                    AppsFlyerLibCore.this.f22542.shutdown();
                    AppsFlyerLibCore.this.f22542 = null;
                }
            }
        }
    }

    /* renamed from: com.appsflyer.AppsFlyerLibCore$c */
    class C8748c implements Runnable {

        /* renamed from: ˏ */
        private C8772h f22582;

        /* synthetic */ C8748c(AppsFlyerLibCore appsFlyerLibCore, C8772h hVar, byte b) {
            this(hVar);
        }

        public final void run() {
            AppsFlyerLibCore appsFlyerLibCore = AppsFlyerLibCore.this;
            C8772h hVar = this.f22582;
            hVar.f22720 = (Context) hVar.f22721.get();
            AppsFlyerLibCore.m20632(appsFlyerLibCore, hVar);
        }

        private C8748c(C8772h hVar) {
            this.f22582 = hVar;
        }
    }

    /* renamed from: com.appsflyer.AppsFlyerLibCore$d */
    class C8749d implements Runnable {

        /* renamed from: ˊ */
        private final C8772h f22583;

        /* synthetic */ C8749d(AppsFlyerLibCore appsFlyerLibCore, C8772h hVar, byte b) {
            this(hVar);
        }

        /* JADX WARNING: type inference failed for: r2v0, types: [boolean] */
        /* JADX WARNING: type inference failed for: r2v1 */
        /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.String] */
        /* JADX WARNING: type inference failed for: r2v14 */
        /* JADX WARNING: type inference failed for: r2v15 */
        /* JADX WARNING: type inference failed for: r2v19, types: [java.lang.String] */
        /* JADX WARNING: type inference failed for: r2v22 */
        /* JADX WARNING: type inference failed for: r2v23, types: [java.lang.Object, java.lang.String] */
        /* JADX WARNING: type inference failed for: r2v24, types: [java.lang.Object, java.lang.String] */
        /* JADX WARNING: type inference failed for: r2v25 */
        /* JADX WARNING: type inference failed for: r2v26 */
        /* JADX WARNING: type inference failed for: r2v27 */
        /* JADX WARNING: type inference failed for: r2v28 */
        /* JADX WARNING: type inference failed for: r2v29 */
        /* JADX WARNING: type inference failed for: r2v30 */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x008b, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x008c, code lost:
            com.appsflyer.AFLogger.afErrorLog(r0.getMessage(), r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x0093, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0094, code lost:
            r0 = e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0095, code lost:
            r2 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00bb, code lost:
            r2.mkdir();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x00c0, code lost:
            r2 = r2.listFiles();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x00c4, code lost:
            if (r2 == null) goto L_0x00d3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x00cb, code lost:
            android.util.Log.i(com.appsflyer.AppsFlyerLibCore.LOG_TAG, "reached cache limit, not caching request");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d3, code lost:
            android.util.Log.i(com.appsflyer.AppsFlyerLibCore.LOG_TAG, "caching request...");
            r2 = new java.io.File(com.appsflyer.internal.C8800w.m20767(r5), java.lang.Long.toString(java.lang.System.currentTimeMillis()));
            r2.createNewFile();
            r3 = new java.io.OutputStreamWriter(new java.io.FileOutputStream(r2.getPath(), true));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
            r3.write("version=");
            r3.write(r1.f22512);
            r3.write(10);
            r3.write("url=");
            r3.write(r1.f22509);
            r3.write(10);
            r3.write("data=");
            r3.write(r1.f22511);
            r3.write(10);
            r3.flush();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
            r3.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x012d, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x012e, code lost:
            r6 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0130, code lost:
            r6 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
            r6.close();
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v0, types: [boolean]
          assigns: [boolean, java.lang.String]
          uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], java.lang.Object, java.lang.String]
          mth insns count: 138
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x008b A[ExcHandler: all (r0v10 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:19:0x005b] */
        /* JADX WARNING: Removed duplicated region for block: B:54:0x00bb A[Catch:{ Exception -> 0x0134 }] */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x00c0 A[Catch:{ Exception -> 0x0134 }] */
        /* JADX WARNING: Removed duplicated region for block: B:76:0x013d A[SYNTHETIC, Splitter:B:76:0x013d] */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x014a A[SYNTHETIC, Splitter:B:81:0x014a] */
        /* JADX WARNING: Unknown variable types count: 6 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r7 = this;
                com.appsflyer.internal.h r0 = r7.f22583
                java.util.Map<java.lang.String, java.lang.Object> r1 = r0.f22718
                boolean r2 = r0.f22713
                java.lang.String r3 = r0.f22723
                int r4 = r0.f22717
                android.content.Context r5 = r0.f22720
                r6 = 0
                if (r5 == 0) goto L_0x0010
                goto L_0x001d
            L_0x0010:
                java.lang.ref.WeakReference<android.content.Context> r0 = r0.f22721
                if (r0 == 0) goto L_0x001c
                java.lang.Object r0 = r0.get()
                r5 = r0
                android.content.Context r5 = (android.content.Context) r5
                goto L_0x001d
            L_0x001c:
                r5 = r6
            L_0x001d:
                com.appsflyer.AppsFlyerLibCore r0 = com.appsflyer.AppsFlyerLibCore.this
                boolean r0 = r0.isTrackingStopped()
                if (r0 == 0) goto L_0x0026
                return
            L_0x0026:
                if (r2 == 0) goto L_0x0051
                r0 = 2
                if (r4 > r0) goto L_0x0051
                com.appsflyer.AppsFlyerLibCore r0 = com.appsflyer.AppsFlyerLibCore.this
                boolean r0 = com.appsflyer.AppsFlyerLibCore.m20614(r0)
                if (r0 == 0) goto L_0x003e
                com.appsflyer.AppsFlyerLibCore r0 = com.appsflyer.AppsFlyerLibCore.this
                java.util.Map r0 = r0.f22539
                java.lang.String r2 = "rfr"
                r1.put(r2, r0)
            L_0x003e:
                com.appsflyer.AppsFlyerLibCore r0 = com.appsflyer.AppsFlyerLibCore.this
                org.json.JSONObject r0 = r0.f22555
                if (r0 == 0) goto L_0x0051
                com.appsflyer.AppsFlyerLibCore r0 = com.appsflyer.AppsFlyerLibCore.this
                org.json.JSONObject r0 = r0.f22555
                java.lang.String r2 = "fb_ddl"
                r1.put(r2, r0)
            L_0x0051:
                com.appsflyer.internal.b$b r0 = new com.appsflyer.internal.b$b
                r0.<init>(r1, r5)
                r1.putAll(r0)
                java.lang.String r0 = "appsflyerKey"
                java.lang.Object r0 = r1.get(r0)     // Catch:{ IOException -> 0x0094, all -> 0x008b }
                java.lang.String r0 = (java.lang.String) r0     // Catch:{ IOException -> 0x0094, all -> 0x008b }
                monitor-enter(r1)     // Catch:{ IOException -> 0x0094, all -> 0x008b }
                int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0085 }
                r4 = 19
                if (r2 < r4) goto L_0x006e
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0085 }
                r2.<init>(r1)     // Catch:{ all -> 0x0085 }
                goto L_0x0072
            L_0x006e:
                org.json.JSONObject r2 = com.appsflyer.internal.C8773i.m20735(r1)     // Catch:{ all -> 0x0085 }
            L_0x0072:
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0085 }
                monitor-exit(r1)     // Catch:{ all -> 0x0083 }
                com.appsflyer.AppsFlyerLibCore r1 = com.appsflyer.AppsFlyerLibCore.this     // Catch:{ IOException -> 0x0089, all -> 0x008b }
                com.appsflyer.internal.h r4 = r7.f22583     // Catch:{ IOException -> 0x0089, all -> 0x008b }
                r4.f22719 = r2     // Catch:{ IOException -> 0x0089, all -> 0x008b }
                r4.f22726 = r0     // Catch:{ IOException -> 0x0089, all -> 0x008b }
                com.appsflyer.AppsFlyerLibCore.m20645(r1, r4)     // Catch:{ IOException -> 0x0089, all -> 0x008b }
                return
            L_0x0083:
                r0 = move-exception
                goto L_0x0087
            L_0x0085:
                r0 = move-exception
                r2 = r6
            L_0x0087:
                monitor-exit(r1)     // Catch:{ IOException -> 0x0089, all -> 0x008b }
                throw r0     // Catch:{ IOException -> 0x0089, all -> 0x008b }
            L_0x0089:
                r0 = move-exception
                goto L_0x0096
            L_0x008b:
                r0 = move-exception
                java.lang.String r1 = r0.getMessage()
                com.appsflyer.AFLogger.afErrorLog(r1, r0)
                return
            L_0x0094:
                r0 = move-exception
                r2 = r6
            L_0x0096:
                java.lang.String r1 = "Exception while sending request to server. "
                com.appsflyer.AFLogger.afErrorLog(r1, r0)
                if (r2 == 0) goto L_0x014e
                if (r5 == 0) goto L_0x014e
                java.lang.String r1 = "&isCachedRequest=true&timeincache="
                boolean r1 = r3.contains(r1)
                if (r1 != 0) goto L_0x014e
                com.appsflyer.internal.C8800w.m20769()
                com.appsflyer.AFFacebookDeferredDeeplink r1 = new com.appsflyer.AFFacebookDeferredDeeplink
                java.lang.String r4 = "4.10.3"
                r1.<init>(r3, r2, r4)
                java.io.File r2 = com.appsflyer.internal.C8800w.m20767(r5)     // Catch:{ Exception -> 0x0134 }
                boolean r3 = r2.exists()     // Catch:{ Exception -> 0x0134 }
                if (r3 != 0) goto L_0x00c0
                r2.mkdir()     // Catch:{ Exception -> 0x0134 }
                goto L_0x0140
            L_0x00c0:
                java.io.File[] r2 = r2.listFiles()     // Catch:{ Exception -> 0x0134 }
                if (r2 == 0) goto L_0x00d3
                int r2 = r2.length     // Catch:{ Exception -> 0x0134 }
                r3 = 40
                if (r2 <= r3) goto L_0x00d3
                java.lang.String r1 = "AppsFlyer_4.10.3"
                java.lang.String r2 = "reached cache limit, not caching request"
                android.util.Log.i(r1, r2)     // Catch:{ Exception -> 0x0134 }
                goto L_0x0140
            L_0x00d3:
                java.lang.String r2 = "AppsFlyer_4.10.3"
                java.lang.String r3 = "caching request..."
                android.util.Log.i(r2, r3)     // Catch:{ Exception -> 0x0134 }
                java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0134 }
                java.io.File r3 = com.appsflyer.internal.C8800w.m20767(r5)     // Catch:{ Exception -> 0x0134 }
                long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0134 }
                java.lang.String r4 = java.lang.Long.toString(r4)     // Catch:{ Exception -> 0x0134 }
                r2.<init>(r3, r4)     // Catch:{ Exception -> 0x0134 }
                r2.createNewFile()     // Catch:{ Exception -> 0x0134 }
                java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x0134 }
                java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0134 }
                java.lang.String r2 = r2.getPath()     // Catch:{ Exception -> 0x0134 }
                r5 = 1
                r4.<init>(r2, r5)     // Catch:{ Exception -> 0x0134 }
                r3.<init>(r4)     // Catch:{ Exception -> 0x0134 }
                java.lang.String r2 = "version="
                r3.write(r2)     // Catch:{ Exception -> 0x0130, all -> 0x012d }
                java.lang.String r2 = r1.f22512     // Catch:{ Exception -> 0x0130, all -> 0x012d }
                r3.write(r2)     // Catch:{ Exception -> 0x0130, all -> 0x012d }
                r2 = 10
                r3.write(r2)     // Catch:{ Exception -> 0x0130, all -> 0x012d }
                java.lang.String r4 = "url="
                r3.write(r4)     // Catch:{ Exception -> 0x0130, all -> 0x012d }
                java.lang.String r4 = r1.f22509     // Catch:{ Exception -> 0x0130, all -> 0x012d }
                r3.write(r4)     // Catch:{ Exception -> 0x0130, all -> 0x012d }
                r3.write(r2)     // Catch:{ Exception -> 0x0130, all -> 0x012d }
                java.lang.String r4 = "data="
                r3.write(r4)     // Catch:{ Exception -> 0x0130, all -> 0x012d }
                java.lang.String r1 = r1.f22511     // Catch:{ Exception -> 0x0130, all -> 0x012d }
                r3.write(r1)     // Catch:{ Exception -> 0x0130, all -> 0x012d }
                r3.write(r2)     // Catch:{ Exception -> 0x0130, all -> 0x012d }
                r3.flush()     // Catch:{ Exception -> 0x0130, all -> 0x012d }
                r3.close()     // Catch:{ IOException -> 0x0140 }
                goto L_0x0140
            L_0x012d:
                r0 = move-exception
                r6 = r3
                goto L_0x0148
            L_0x0130:
                r6 = r3
                goto L_0x0134
            L_0x0132:
                r0 = move-exception
                goto L_0x0148
            L_0x0134:
                java.lang.String r1 = "AppsFlyer_4.10.3"
                java.lang.String r2 = "Could not cache request"
                android.util.Log.i(r1, r2)     // Catch:{ all -> 0x0132 }
                if (r6 == 0) goto L_0x0140
                r6.close()     // Catch:{ IOException -> 0x0140 }
            L_0x0140:
                java.lang.String r1 = r0.getMessage()
                com.appsflyer.AFLogger.afErrorLog(r1, r0)
                goto L_0x014e
            L_0x0148:
                if (r6 == 0) goto L_0x014d
                r6.close()     // Catch:{ IOException -> 0x014d }
            L_0x014d:
                throw r0
            L_0x014e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.C8749d.run():void");
        }

        private C8749d(C8772h hVar) {
            hVar.f22721 = new WeakReference<>(hVar.f22720);
            hVar.f22720 = null;
            this.f22583 = hVar;
        }
    }

    /* renamed from: com.appsflyer.AppsFlyerLibCore$e */
    class C8750e extends C8746a {
        public C8750e(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
            super(context, str, scheduledExecutorService);
        }

        /* access modifiers changed from: protected */
        /* renamed from: ˊ */
        public final void mo23719(Map<String, String> map) {
            AppsFlyerLibCore.f22532.onInstallConversionDataLoaded(map);
            AppsFlyerLibCore.m20613((Context) this.f22576.get(), "appsflyerConversionDataRequestRetries", 0);
        }

        /* access modifiers changed from: protected */
        /* renamed from: ˋ */
        public final void mo23720(String str, int i) {
            AppsFlyerLibCore.f22532.onInstallConversionFailure(str);
            if (i >= 400 && i < 500) {
                String str2 = "appsflyerConversionDataRequestRetries";
                AppsFlyerLibCore.m20613((Context) this.f22576.get(), str2, AppsFlyerLibCore.m20625((Context) this.f22576.get()).getInt(str2, 0) + 1);
            }
        }

        /* renamed from: ˎ */
        public final String mo23721() {
            return ServerConfigHandler.getUrl("https://%sapi.%s/install_data/v3/");
        }
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(f22530);
        sb.append("/androidevent?buildnumber=4.10.3&app_id=");
        f22526 = sb.toString();
        StringBuilder sb2 = new StringBuilder("https://%sattr.%s/api/v");
        sb2.append(f22526);
        f22525 = sb2.toString();
        StringBuilder sb3 = new StringBuilder("https://%st.%s/api/v");
        sb3.append(f22526);
        f22535 = sb3.toString();
        StringBuilder sb4 = new StringBuilder("https://%sevents.%s/api/v");
        sb4.append(f22526);
        f22533 = sb4.toString();
        StringBuilder sb5 = new StringBuilder("https://%sregister.%s/api/v");
        sb5.append(f22526);
        f22531 = sb5.toString();
    }

    private AppsFlyerLibCore() {
        AFVersionDeclaration.init();
    }

    public static AppsFlyerLibCore getInstance() {
        return f22529;
    }

    /* renamed from: ʼ */
    private static boolean m20596(Context context) {
        if (context != null) {
            int i = VERSION.SDK_INT;
            String str = "Failed collecting ivc data";
            if (i >= 23) {
                try {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                    for (Network networkCapabilities : connectivityManager.getAllNetworks()) {
                        NetworkCapabilities networkCapabilities2 = connectivityManager.getNetworkCapabilities(networkCapabilities);
                        if (networkCapabilities2.hasTransport(4) && !networkCapabilities2.hasCapability(15)) {
                            return true;
                        }
                    }
                    return false;
                } catch (Exception e) {
                    AFLogger.afErrorLog(str, e);
                }
            } else if (i >= 16) {
                ArrayList arrayList = new ArrayList();
                try {
                    Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
                    while (it.hasNext()) {
                        NetworkInterface networkInterface = (NetworkInterface) it.next();
                        if (networkInterface.isUp()) {
                            arrayList.add(networkInterface.getName());
                        }
                    }
                    return arrayList.contains("tun0");
                } catch (Exception e2) {
                    AFLogger.afErrorLog(str, e2);
                }
            }
        }
        return false;
    }

    /* renamed from: ʽ */
    private static float m20597(Context context) {
        float f;
        try {
            Intent registerReceiver = context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = registerReceiver.getIntExtra("level", -1);
            int intExtra2 = registerReceiver.getIntExtra("scale", -1);
            if (intExtra == -1 || intExtra2 == -1) {
                return 50.0f;
            }
            f = (((float) intExtra) / ((float) intExtra2)) * 100.0f;
            return f;
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            f = 1.0f;
        }
    }

    /* renamed from: ॱॱ */
    private static boolean m20647(Context context) {
        try {
            if (C10067c.m25293a().mo27284a(context) == 0) {
                return true;
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog("WARNING:  Google play services is unavailable. ", th);
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gms", 0);
            return true;
        } catch (NameNotFoundException e) {
            AFLogger.afErrorLog("WARNING:  Google Play Services is unavailable. ", e);
            return false;
        }
    }

    /* renamed from: ᐝ */
    private static String m20648(Context context) {
        String string = AppsFlyerProperties.getInstance().getString("api_store_value");
        if (string != null) {
            return string;
        }
        String r2 = m20600(new WeakReference<>(context), "AF_STORE");
        if (r2 != null) {
            return r2;
        }
        return null;
    }

    public void enableFacebookDeferredApplinks(boolean z) {
        this.f22554 = z;
    }

    public AppsFlyerLib enableLocationCollection(boolean z) {
        this.f22546 = z;
        return this;
    }

    @Deprecated
    public void enableUninstallTracking(String str) {
        AFLogger.afWarnLog("enableUninstallTracking() is deprecated. GCM no longer works. This API does nothing. Please follow the documentation.");
    }

    public String getAppsFlyerUID(Context context) {
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        String str = "public_api_call";
        C8752aa.f22603.mo23772(str, "getAppsFlyerUID", new String[0]);
        return C8753ab.m20687(new WeakReference(context));
    }

    public String getAttributionId(Context context) {
        try {
            C8799v vVar = new C8799v(context);
            if (vVar.f22787 == null) {
                return vVar.mo23820();
            }
            ProviderInfo resolveContentProvider = vVar.f22787.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 128);
            if (resolveContentProvider != null) {
                X509Certificate x509Certificate = (X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(vVar.f22787.getPackageManager().getPackageInfo(resolveContentProvider.packageName, 64).signatures[0].toByteArray()));
                MessageDigest instance = MessageDigest.getInstance("SHA1");
                instance.update(x509Certificate.getEncoded());
                if (Base64.encodeToString(instance.digest(), 2).equals("ijxLJi1yGs1JpL+X1SExmchvork=")) {
                    return vVar.mo23820();
                }
            }
            return null;
        } catch (Throwable th) {
            AFLogger.afErrorLog("Could not collect facebook attribution id. ", th);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public void getConversionData(Context context, final ConversionDataListener conversionDataListener) {
        f22532 = new AppsFlyerConversionListener() {
            public final void onAppOpenAttribution(Map<String, String> map) {
            }

            public final void onAttributionFailure(String str) {
            }

            public final void onInstallConversionDataLoaded(Map<String, String> map) {
                conversionDataListener.onConversionDataLoaded(map);
            }

            public final void onInstallConversionFailure(String str) {
                conversionDataListener.onConversionFailure(str);
            }
        };
    }

    public String getHostName() {
        String string = AppsFlyerProperties.getInstance().getString("custom_host");
        return string != null ? string : ServerParameters.DEFAULT_HOST;
    }

    public String getHostPrefix() {
        String string = AppsFlyerProperties.getInstance().getString("custom_host_prefix");
        return string != null ? string : "";
    }

    public String getOutOfStore(Context context) {
        String string = AppsFlyerProperties.getInstance().getString("api_store_value");
        if (string != null) {
            return string;
        }
        String r3 = m20600(new WeakReference<>(context), "AF_STORE");
        if (r3 != null) {
            return r3;
        }
        AFLogger.afInfoLog("No out-of-store value set");
        return null;
    }

    public String getSdkVersion() {
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        String str = "public_api_call";
        C8752aa.f22603.mo23772(str, "getSdkVersion", new String[0]);
        return "version: 4.10.3 (build 233)";
    }

    public void handleDeepLinkCallback(Context context, Map<String, Object> map, Uri uri) {
        final Map map2;
        String str;
        String obj = uri.toString();
        if (obj == null) {
            obj = null;
        } else if (obj.matches("fb\\d*?://authorize.*")) {
            String str2 = "access_token";
            if (obj.contains(str2)) {
                int indexOf = obj.indexOf(63);
                if (indexOf == -1) {
                    str = "";
                } else {
                    str = obj.substring(indexOf);
                }
                if (str.length() != 0) {
                    ArrayList arrayList = new ArrayList();
                    String str3 = "&";
                    if (str.contains(str3)) {
                        arrayList = new ArrayList(Arrays.asList(str.split(str3)));
                    } else {
                        arrayList.add(str);
                    }
                    StringBuilder sb = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str4 = (String) it.next();
                        if (str4.contains(str2)) {
                            it.remove();
                        } else {
                            if (sb.length() != 0) {
                                sb.append(str3);
                            } else {
                                String str5 = "?";
                                if (!str4.startsWith(str5)) {
                                    sb.append(str5);
                                }
                            }
                            sb.append(str4);
                        }
                    }
                    obj = obj.replace(str, sb.toString());
                }
            }
        }
        String str6 = "af_deeplink";
        if (!map.containsKey(str6)) {
            map.put(str6, obj);
        }
        boolean z = true;
        if (uri.getQueryParameter(str6) != null) {
            this.f22545 = "AppsFlyer_Test".equals(uri.getQueryParameter("media_source")) && Boolean.parseBoolean(uri.getQueryParameter("is_retargeting"));
            map2 = m20628(context, uri.getQuery());
            String path = uri.getPath();
            if (path != null) {
                map2.put("path", path);
            }
            String scheme = uri.getScheme();
            if (scheme != null) {
                map2.put("scheme", scheme);
            }
            String host = uri.getHost();
            if (host != null) {
                map2.put("host", host);
            }
        } else {
            map2 = new HashMap();
            map2.put("link", uri.toString());
        }
        final WeakReference weakReference = new WeakReference(context);
        C8802y yVar = new C8802y(uri, this);
        yVar.setConnProvider(new HttpsUrlConnectionProvider());
        if (TextUtils.isEmpty(yVar.f22601) || TextUtils.isEmpty(yVar.f22801)) {
            z = false;
        }
        if (z) {
            yVar.f22800 = new C8803a() {
                /* renamed from: ˋ */
                private void m20656(Map<String, String> map) {
                    if (weakReference.get() != null) {
                        AppsFlyerLibCore.m20604((Context) weakReference.get(), "deeplinkAttribution", new JSONObject(map).toString());
                    }
                }

                /* renamed from: ˊ */
                public final void mo23716(String str) {
                    if (AppsFlyerLibCore.f22532 != null) {
                        m20656(map2);
                        AppsFlyerLibCore.f22532.onAttributionFailure(str);
                    }
                }

                /* renamed from: ˏ */
                public final void mo23717(Map<String, String> map) {
                    for (String str : map.keySet()) {
                        map2.put(str, map.get(str));
                    }
                    m20656(map2);
                    AppsFlyerLibCore.m20606(map2);
                }
            };
            AFExecutor.getInstance().getThreadPoolExecutor().execute(yVar);
            return;
        }
        AppsFlyerConversionListener appsFlyerConversionListener = f22532;
        if (appsFlyerConversionListener != null) {
            try {
                appsFlyerConversionListener.onAppOpenAttribution(map2);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }

    public AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener, Context context) {
        if (context != null) {
            this.f22557 = (Application) context.getApplicationContext();
            if (m20608(context)) {
                if (this.f22563 == null) {
                    this.f22563 = new C8769f();
                    this.f22563.mo23789(context, this);
                } else {
                    AFLogger.afWarnLog("AFInstallReferrer instance already created");
                }
            }
        } else {
            AFLogger.afWarnLog("init :: context is null, Google Install Referrer will be not initialized!");
        }
        return init(str, appsFlyerConversionListener);
    }

    public boolean isPreInstalledApp(Context context) {
        try {
            if ((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 1) != 0) {
                return true;
            }
            return false;
        } catch (NameNotFoundException e) {
            AFLogger.afErrorLog("Could not check if app is pre installed", e);
        }
    }

    public boolean isTrackingStopped() {
        return this.f22551;
    }

    public void onHandleReferrer(Map<String, String> map) {
        this.f22539 = map;
    }

    public void onPause(Context context) {
        C87712.m20732(context);
        C8778m r2 = C8778m.m20741(context);
        r2.f22742.post(r2.f22737);
    }

    public void registerConversionListener(Context context, AppsFlyerConversionListener appsFlyerConversionListener) {
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        String str = "public_api_call";
        C8752aa.f22603.mo23772(str, "registerConversionListener", new String[0]);
        if (appsFlyerConversionListener != null) {
            f22532 = appsFlyerConversionListener;
        }
    }

    public void registerValidatorListener(Context context, AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener) {
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        String str = "public_api_call";
        C8752aa.f22603.mo23772(str, "registerValidatorListener", new String[0]);
        AFLogger.afDebugLog("registerValidatorListener called");
        if (appsFlyerInAppPurchaseValidatorListener == null) {
            AFLogger.afDebugLog("registerValidatorListener null listener");
        } else {
            f22527 = appsFlyerInAppPurchaseValidatorListener;
        }
    }

    public void reportTrackSession(Context context) {
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        String str = "public_api_call";
        C8752aa.f22603.mo23772(str, "reportTrackSession", new String[0]);
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        C8752aa.f22603.f22614 = false;
        C8772h hVar = new C8772h();
        hVar.f22720 = context;
        hVar.f22715 = null;
        hVar.f22727 = null;
        mo23709(hVar);
    }

    public void sendDeepLinkData(Activity activity) {
        String str = "public_api_call";
        String str2 = "sendDeepLinkData";
        if (activity != null && activity.getIntent() != null) {
            if (C8752aa.f22603 == null) {
                C8752aa.f22603 = new C8752aa();
            }
            C8752aa aaVar = C8752aa.f22603;
            StringBuilder sb = new StringBuilder("activity_intent_");
            sb.append(activity.getIntent().toString());
            aaVar.mo23772(str, str2, activity.getLocalClassName(), sb.toString());
        } else if (activity != null) {
            if (C8752aa.f22603 == null) {
                C8752aa.f22603 = new C8752aa();
            }
            C8752aa.f22603.mo23772(str, str2, activity.getLocalClassName(), "activity_intent_null");
        } else {
            if (C8752aa.f22603 == null) {
                C8752aa.f22603 = new C8752aa();
            }
            C8752aa.f22603.mo23772(str, str2, "activity_null");
        }
        try {
            Application application = activity.getApplication();
            C8772h hVar = new C8772h();
            hVar.f22720 = application;
            m20621(hVar);
            StringBuilder sb2 = new StringBuilder("getDeepLinkData with activity ");
            sb2.append(activity.getIntent().getDataString());
            AFLogger.afInfoLog(sb2.toString());
        } catch (Exception e) {
            AFLogger.afInfoLog("getDeepLinkData Exception: ".concat(String.valueOf(e)));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0191  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void sendPushNotificationData(android.app.Activity r17) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            java.lang.String r0 = "c"
            java.lang.String r3 = "pid"
            r4 = 1
            r5 = 0
            r6 = 2
            java.lang.String r7 = "public_api_call"
            java.lang.String r8 = "sendPushNotificationData"
            if (r2 == 0) goto L_0x0048
            android.content.Intent r9 = r17.getIntent()
            if (r9 == 0) goto L_0x0048
            com.appsflyer.internal.aa r9 = com.appsflyer.internal.C8752aa.f22603
            if (r9 != 0) goto L_0x0022
            com.appsflyer.internal.aa r9 = new com.appsflyer.internal.aa
            r9.<init>()
            com.appsflyer.internal.C8752aa.f22603 = r9
        L_0x0022:
            com.appsflyer.internal.aa r9 = com.appsflyer.internal.C8752aa.f22603
            java.lang.String[] r10 = new java.lang.String[r6]
            java.lang.String r11 = r17.getLocalClassName()
            r10[r5] = r11
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r11 = "activity_intent_"
            r5.<init>(r11)
            android.content.Intent r11 = r17.getIntent()
            java.lang.String r11 = r11.toString()
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            r10[r4] = r5
            r9.mo23772(r7, r8, r10)
            goto L_0x007d
        L_0x0048:
            if (r2 == 0) goto L_0x0067
            com.appsflyer.internal.aa r9 = com.appsflyer.internal.C8752aa.f22603
            if (r9 != 0) goto L_0x0055
            com.appsflyer.internal.aa r9 = new com.appsflyer.internal.aa
            r9.<init>()
            com.appsflyer.internal.C8752aa.f22603 = r9
        L_0x0055:
            com.appsflyer.internal.aa r9 = com.appsflyer.internal.C8752aa.f22603
            java.lang.String[] r10 = new java.lang.String[r6]
            java.lang.String r11 = r17.getLocalClassName()
            r10[r5] = r11
            java.lang.String r5 = "activity_intent_null"
            r10[r4] = r5
            r9.mo23772(r7, r8, r10)
            goto L_0x007d
        L_0x0067:
            com.appsflyer.internal.aa r4 = com.appsflyer.internal.C8752aa.f22603
            if (r4 != 0) goto L_0x0072
            com.appsflyer.internal.aa r4 = new com.appsflyer.internal.aa
            r4.<init>()
            com.appsflyer.internal.C8752aa.f22603 = r4
        L_0x0072:
            com.appsflyer.internal.aa r4 = com.appsflyer.internal.C8752aa.f22603
            java.lang.String r5 = "activity_null"
            java.lang.String[] r5 = new java.lang.String[]{r5}
            r4.mo23772(r7, r8, r5)
        L_0x007d:
            boolean r4 = r2 instanceof android.app.Activity
            if (r4 == 0) goto L_0x00ad
            android.content.Intent r4 = r17.getIntent()
            if (r4 == 0) goto L_0x00ad
            android.os.Bundle r7 = r4.getExtras()
            if (r7 == 0) goto L_0x00ad
            java.lang.String r8 = "af"
            java.lang.String r9 = r7.getString(r8)
            if (r9 == 0) goto L_0x00ae
            java.lang.String r10 = java.lang.String.valueOf(r9)
            java.lang.String r11 = "Push Notification received af payload = "
            java.lang.String r10 = r11.concat(r10)
            com.appsflyer.AFLogger.afInfoLog(r10)
            r7.remove(r8)
            android.content.Intent r4 = r4.putExtras(r7)
            r2.setIntent(r4)
            goto L_0x00ae
        L_0x00ad:
            r9 = 0
        L_0x00ae:
            r1.f22544 = r9
            java.lang.String r4 = r1.f22544
            if (r4 == 0) goto L_0x01c7
            long r7 = java.lang.System.currentTimeMillis()
            java.util.Map<java.lang.Long, java.lang.String> r4 = r1.f22548
            java.lang.String r9 = ")"
            if (r4 != 0) goto L_0x00cd
            java.lang.String r0 = "pushes: initializing pushes history.."
            com.appsflyer.AFLogger.afInfoLog(r0)
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.f22548 = r0
            r12 = r7
            goto L_0x017e
        L_0x00cd:
            com.appsflyer.AppsFlyerProperties r4 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0163 }
            java.lang.String r10 = "pushPayloadMaxAging"
            r11 = 1800000(0x1b7740, double:8.89318E-318)
            long r10 = r4.getLong(r10, r11)     // Catch:{ all -> 0x0163 }
            java.util.Map<java.lang.Long, java.lang.String> r4 = r1.f22548     // Catch:{ all -> 0x0163 }
            java.util.Set r4 = r4.keySet()     // Catch:{ all -> 0x0163 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0163 }
            r12 = r7
        L_0x00e5:
            boolean r14 = r4.hasNext()     // Catch:{ all -> 0x0161 }
            if (r14 == 0) goto L_0x017e
            java.lang.Object r14 = r4.next()     // Catch:{ all -> 0x0161 }
            java.lang.Long r14 = (java.lang.Long) r14     // Catch:{ all -> 0x0161 }
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch:{ all -> 0x0161 }
            java.lang.String r6 = r1.f22544     // Catch:{ all -> 0x0161 }
            r15.<init>(r6)     // Catch:{ all -> 0x0161 }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ all -> 0x0161 }
            java.util.Map<java.lang.Long, java.lang.String> r5 = r1.f22548     // Catch:{ all -> 0x0161 }
            java.lang.Object r5 = r5.get(r14)     // Catch:{ all -> 0x0161 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0161 }
            r6.<init>(r5)     // Catch:{ all -> 0x0161 }
            java.lang.Object r5 = r15.get(r3)     // Catch:{ all -> 0x0161 }
            java.lang.Object r2 = r6.get(r3)     // Catch:{ all -> 0x0161 }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0161 }
            if (r2 == 0) goto L_0x0141
            java.lang.Object r2 = r15.get(r0)     // Catch:{ all -> 0x0161 }
            java.lang.Object r5 = r6.get(r0)     // Catch:{ all -> 0x0161 }
            boolean r2 = r2.equals(r5)     // Catch:{ all -> 0x0161 }
            if (r2 == 0) goto L_0x0141
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = "PushNotificationMeasurement: A previous payload with same PID and campaign was already acknowledged! (old: "
            r0.<init>(r2)     // Catch:{ all -> 0x0161 }
            r0.append(r6)     // Catch:{ all -> 0x0161 }
            java.lang.String r2 = ", new: "
            r0.append(r2)     // Catch:{ all -> 0x0161 }
            r0.append(r15)     // Catch:{ all -> 0x0161 }
            r0.append(r9)     // Catch:{ all -> 0x0161 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0161 }
            com.appsflyer.AFLogger.afInfoLog(r0)     // Catch:{ all -> 0x0161 }
            r2 = 0
            r1.f22544 = r2     // Catch:{ all -> 0x0161 }
            return
        L_0x0141:
            r2 = 0
            long r5 = r14.longValue()     // Catch:{ all -> 0x0161 }
            long r5 = r7 - r5
            int r15 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r15 <= 0) goto L_0x0151
            java.util.Map<java.lang.Long, java.lang.String> r5 = r1.f22548     // Catch:{ all -> 0x0161 }
            r5.remove(r14)     // Catch:{ all -> 0x0161 }
        L_0x0151:
            long r5 = r14.longValue()     // Catch:{ all -> 0x0161 }
            int r15 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r15 > 0) goto L_0x015d
            long r12 = r14.longValue()     // Catch:{ all -> 0x0161 }
        L_0x015d:
            r2 = r17
            r6 = 2
            goto L_0x00e5
        L_0x0161:
            r0 = move-exception
            goto L_0x0165
        L_0x0163:
            r0 = move-exception
            r12 = r7
        L_0x0165:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Error while handling push notification measurement: "
            r2.<init>(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.appsflyer.AFLogger.afErrorLog(r2, r0)
        L_0x017e:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r2 = "pushPayloadHistorySize"
            r3 = 2
            int r0 = r0.getInt(r2, r3)
            java.util.Map<java.lang.Long, java.lang.String> r2 = r1.f22548
            int r2 = r2.size()
            if (r2 != r0) goto L_0x01ae
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "pushes: removing oldest overflowing push (oldest push:"
            r0.<init>(r2)
            r0.append(r12)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.appsflyer.AFLogger.afInfoLog(r0)
            java.util.Map<java.lang.Long, java.lang.String> r0 = r1.f22548
            java.lang.Long r2 = java.lang.Long.valueOf(r12)
            r0.remove(r2)
        L_0x01ae:
            java.util.Map<java.lang.Long, java.lang.String> r0 = r1.f22548
            java.lang.Long r2 = java.lang.Long.valueOf(r7)
            java.lang.String r3 = r1.f22544
            r0.put(r2, r3)
            android.app.Application r0 = r17.getApplication()
            com.appsflyer.internal.h r2 = new com.appsflyer.internal.h
            r2.<init>()
            r2.f22720 = r0
            r1.m20621(r2)
        L_0x01c7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.sendPushNotificationData(android.app.Activity):void");
    }

    public void setAdditionalData(HashMap<String, Object> hashMap) {
        if (hashMap != null) {
            if (C8752aa.f22603 == null) {
                C8752aa.f22603 = new C8752aa();
            }
            String str = "public_api_call";
            C8752aa.f22603.mo23772(str, "setAdditionalData", hashMap.toString());
            AppsFlyerProperties.getInstance().setCustomData(new JSONObject(hashMap).toString());
        }
    }

    public void setAndroidIdData(String str) {
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        String str2 = "public_api_call";
        C8752aa.f22603.mo23772(str2, "setAndroidIdData", str);
        this.f22547 = str;
    }

    public void setAppId(String str) {
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        String str2 = "public_api_call";
        C8752aa.f22603.mo23772(str2, "setAppId", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.APP_ID, str);
    }

    public void setAppInviteOneLink(String str) {
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        String str2 = "public_api_call";
        C8752aa.f22603.mo23772(str2, "setAppInviteOneLink", str);
        AFLogger.afInfoLog("setAppInviteOneLink = ".concat(String.valueOf(str)));
        String str3 = AppsFlyerProperties.ONELINK_ID;
        if (str == null || !str.equals(AppsFlyerProperties.getInstance().getString(str3))) {
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_DOMAIN);
            AppsFlyerProperties.getInstance().remove("onelinkVersion");
            AppsFlyerProperties.getInstance().remove(AppsFlyerProperties.ONELINK_SCHEME);
        }
        AppsFlyerProperties.getInstance().set(str3, str);
    }

    @Deprecated
    public void setAppUserId(String str) {
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        String str2 = "public_api_call";
        C8752aa.f22603.mo23772(str2, "setAppUserId", str);
        setCustomerUserId(str);
    }

    public void setCollectAndroidID(boolean z) {
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        String str = "public_api_call";
        C8752aa.f22603.mo23772(str, "setCollectAndroidID", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_ANDROID_ID, Boolean.toString(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, Boolean.toString(z));
    }

    @Deprecated
    public void setCollectFingerPrint(boolean z) {
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        String str = "public_api_call";
        C8752aa.f22603.mo23772(str, "setCollectFingerPrint", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_FINGER_PRINT, Boolean.toString(z));
    }

    public void setCollectIMEI(boolean z) {
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        String str = "public_api_call";
        C8752aa.f22603.mo23772(str, "setCollectIMEI", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_IMEI, Boolean.toString(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, Boolean.toString(z));
    }

    public void setCollectOaid(boolean z) {
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        String str = "public_api_call";
        C8752aa.f22603.mo23772(str, "setCollectOaid", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.COLLECT_OAID, Boolean.toString(z));
    }

    public void setConsumeAFDeepLinks(boolean z) {
        AppsFlyerProperties.getInstance().set("consumeAfDeepLink", z);
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        String str = "public_api_call";
        C8752aa.f22603.mo23772(str, "setConsumeAFDeepLinks: ".concat(String.valueOf(z)), new String[0]);
    }

    public void setCurrencyCode(String str) {
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        String str2 = "public_api_call";
        C8752aa.f22603.mo23772(str2, "setCurrencyCode", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.CURRENCY_CODE, str);
    }

    public void setCustomerIdAndTrack(String str, Context context) {
        if (context != null) {
            AppsFlyerProperties instance = AppsFlyerProperties.getInstance();
            String str2 = AppsFlyerProperties.AF_WAITFOR_CUSTOMERID;
            if (instance.getBoolean(str2, false) && AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID) == null) {
                setCustomerUserId(str);
                AppsFlyerProperties.getInstance().set(str2, false);
                StringBuilder sb = new StringBuilder("CustomerUserId set: ");
                sb.append(str);
                sb.append(" - Initializing AppsFlyer Tacking");
                AFLogger.afInfoLog(sb.toString(), true);
                String referrer = AppsFlyerProperties.getInstance().getReferrer(context);
                String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY);
                if (referrer == null) {
                    referrer = "";
                }
                m20630(context, string, referrer, context instanceof Activity ? ((Activity) context).getIntent() : null);
                String str3 = "afUninstallToken";
                if (AppsFlyerProperties.getInstance().getString(str3) != null) {
                    mo23711(context, AppsFlyerProperties.getInstance().getString(str3));
                }
                return;
            }
            setCustomerUserId(str);
            AFLogger.afInfoLog("waitForCustomerUserId is false; setting CustomerUserID: ".concat(String.valueOf(str)), true);
        }
    }

    public void setCustomerUserId(String str) {
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        String str2 = "public_api_call";
        C8752aa.f22603.mo23772(str2, "setCustomerUserId", str);
        AFLogger.afInfoLog("setCustomerUserId = ".concat(String.valueOf(str)));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.APP_USER_ID, str);
    }

    public void setDebugLog(boolean z) {
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        C8752aa.f22603.mo23772("public_api_call", "setDebugLog", String.valueOf(z));
        AppsFlyerProperties.getInstance().set("shouldLog", z);
        AppsFlyerProperties.getInstance().set("logLevel", (z ? LogLevel.DEBUG : LogLevel.NONE).getLevel());
    }

    /* access modifiers changed from: protected */
    public void setDeepLinkData(Intent intent) {
        if (intent != null) {
            try {
                if ("android.intent.action.VIEW".equals(intent.getAction())) {
                    this.latestDeepLink = intent.getData();
                    StringBuilder sb = new StringBuilder("Unity setDeepLinkData = ");
                    sb.append(this.latestDeepLink);
                    AFLogger.afDebugLog(sb.toString());
                }
            } catch (Throwable th) {
                AFLogger.afErrorLog("Exception while setting deeplink data (unity). ", th);
            }
        }
    }

    public void setDeviceTrackingDisabled(boolean z) {
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        String str = "public_api_call";
        C8752aa.f22603.mo23772(str, "setDeviceTrackingDisabled", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.DEVICE_TRACKING_DISABLED, z);
    }

    public void setExtension(String str) {
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        String str2 = "public_api_call";
        C8752aa.f22603.mo23772(str2, "setExtension", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EXTENSION, str);
    }

    @Deprecated
    public void setGCMProjectID(String str) {
        AFLogger.afWarnLog("setGCMProjectID() is deprecated. GCM no longer works. This API does nothing. Please follow the documentation.");
    }

    @Deprecated
    public void setGCMProjectNumber(String str) {
        AFLogger.afWarnLog("setGCMProjectNumber() is deprecated. GCM no longer works. This API does nothing. Please follow the documentation.");
    }

    public void setHost(String str, String str2) {
        if (str != null) {
            AppsFlyerProperties.getInstance().set("custom_host_prefix", str);
        }
        if (str2 == null || str2.isEmpty()) {
            AFLogger.afWarnLog("hostName cannot be null or empty");
        } else {
            AppsFlyerProperties.getInstance().set("custom_host", str2);
        }
    }

    @Deprecated
    public void setHostName(String str) {
        AppsFlyerProperties.getInstance().set("custom_host", str);
    }

    public void setImeiData(String str) {
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        String str2 = "public_api_call";
        C8752aa.f22603.mo23772(str2, "setImeiData", str);
        this.f22558 = str;
    }

    public void setIsUpdate(boolean z) {
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        String str = "public_api_call";
        C8752aa.f22603.mo23772(str, "setIsUpdate", String.valueOf(z));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.IS_UPDATE, z);
    }

    public void setLogLevel(LogLevel logLevel) {
        AppsFlyerProperties.getInstance().set("logLevel", logLevel.getLevel());
    }

    public void setMinTimeBetweenSessions(int i) {
        this.f22536 = TimeUnit.SECONDS.toMillis((long) i);
    }

    public void setOaidData(String str) {
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        String str2 = "public_api_call";
        C8752aa.f22603.mo23772(str2, "setOaidData", str);
        this.f22560 = str;
    }

    public void setOneLinkCustomDomain(String... strArr) {
        AFLogger.afDebugLog(String.format("setOneLinkCustomDomain %s", new Object[]{Arrays.toString(strArr)}));
        C8770g.f22701 = strArr;
    }

    public void setOutOfStore(String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase();
            AppsFlyerProperties.getInstance().set("api_store_value", lowerCase);
            AFLogger.afInfoLog("Store API set with value: ".concat(String.valueOf(lowerCase)), true);
            return;
        }
        AFLogger.m20588("Cannot set setOutOfStore with null");
    }

    public void setPhoneNumber(String str) {
        this.f22556 = C8757ad.m20696(str);
    }

    public void setPluginDeepLinkData(Intent intent) {
        setDeepLinkData(intent);
    }

    public void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger.afDebugLog("setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        String str4 = Constants.URL_MEDIA_SOURCE;
        if (str != null) {
            try {
                jSONObject.put(str4, str);
            } catch (JSONException e) {
                AFLogger.afErrorLog(e.getMessage(), e);
            }
        }
        if (str2 != null) {
            jSONObject.put(Constants.URL_CAMPAIGN, str2);
        }
        if (str3 != null) {
            jSONObject.put(Constants.URL_SITE_ID, str3);
        }
        if (jSONObject.has(str4)) {
            AppsFlyerProperties.getInstance().set("preInstallName", jSONObject.toString());
            return;
        }
        AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
    }

    public void setResolveDeepLinkURLs(String... strArr) {
        AFLogger.afDebugLog(String.format("setResolveDeepLinkURLs %s", new Object[]{Arrays.toString(strArr)}));
        C8770g.f22704 = strArr;
    }

    @Deprecated
    public void setUserEmail(String str) {
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        String str2 = "public_api_call";
        C8752aa.f22603.mo23772(str2, "setUserEmail", str);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.USER_EMAIL, str);
    }

    public void setUserEmails(EmailsCryptType emailsCryptType, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length + 1);
        arrayList.add(emailsCryptType.toString());
        arrayList.addAll(Arrays.asList(strArr));
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        C8752aa.f22603.mo23772("public_api_call", "setUserEmails", (String[]) arrayList.toArray(new String[(strArr.length + 1)]));
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.EMAIL_CRYPT_TYPE, emailsCryptType.getValue());
        HashMap hashMap = new HashMap();
        String str = null;
        ArrayList arrayList2 = new ArrayList();
        for (String str2 : strArr) {
            int i = C87433.f22568[emailsCryptType.ordinal()];
            if (i == 2) {
                arrayList2.add(C8757ad.m20695(str2));
                str = "md5_el_arr";
            } else if (i == 3) {
                arrayList2.add(C8757ad.m20696(str2));
                str = "sha256_el_arr";
            } else if (i != 4) {
                arrayList2.add(C8757ad.m20697(str2));
                str = "sha1_el_arr";
            } else {
                arrayList2.add(str2);
                str = "plain_el_arr";
            }
        }
        hashMap.put(str, arrayList2);
        AppsFlyerProperties.getInstance().setUserEmails(new JSONObject(hashMap).toString());
    }

    public void startTracking(Application application) {
        if (!this.f22552) {
            AFLogger.afWarnLog("ERROR: AppsFlyer SDK is not initialized! The API call 'startTracking(Application)' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
        } else {
            startTracking(application, null);
        }
    }

    public void stopTracking(boolean z, Context context) {
        File[] listFiles;
        String str = LOG_TAG;
        this.f22551 = z;
        C8800w.m20769();
        try {
            File r1 = C8800w.m20767(context);
            if (!r1.exists()) {
                r1.mkdir();
            } else {
                for (File file : r1.listFiles()) {
                    StringBuilder sb = new StringBuilder("Found cached request");
                    sb.append(file.getName());
                    Log.i(str, sb.toString());
                    C8800w.m20771(C8800w.m20768(file).f22510, context);
                }
            }
        } catch (Exception unused) {
            Log.i(str, "Could not cache request");
        }
        if (this.f22551) {
            Editor edit = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).edit();
            edit.putBoolean(IS_STOP_TRACKING_USED, true);
            edit.apply();
        }
    }

    public void trackAppLaunch(Context context, String str) {
        if (m20608(context)) {
            if (this.f22563 == null) {
                this.f22563 = new C8769f();
                this.f22563.mo23789(context, this);
            } else {
                AFLogger.afWarnLog("AFInstallReferrer instance already created");
            }
        }
        m20630(context, str, "", null);
    }

    public void trackEvent(Context context, String str, Map<String, Object> map, AppsFlyerTrackingRequestListener appsFlyerTrackingRequestListener) {
        JSONObject jSONObject = new JSONObject(map == null ? new HashMap<>() : map);
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        C8752aa.f22603.mo23772("public_api_call", "trackEvent", str, jSONObject.toString());
        C8772h hVar = new C8772h();
        hVar.f22720 = context;
        hVar.f22715 = str;
        hVar.f22727 = map;
        hVar.f22724 = appsFlyerTrackingRequestListener;
        mo23709(hVar);
    }

    public void trackLocation(Context context, double d, double d2) {
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        String str = "public_api_call";
        C8752aa.f22603.mo23772(str, "trackLocation", String.valueOf(d), String.valueOf(d2));
        HashMap hashMap = new HashMap();
        hashMap.put(AFInAppEventParameterName.LONGTITUDE, Double.toString(d2));
        hashMap.put(AFInAppEventParameterName.LATITUDE, Double.toString(d));
        C8772h hVar = new C8772h();
        hVar.f22720 = context;
        hVar.f22715 = AFInAppEventType.LOCATION_COORDINATES;
        hVar.f22727 = hashMap;
        mo23709(hVar);
    }

    public void unregisterConversionListener() {
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        String str = "public_api_call";
        C8752aa.f22603.mo23772(str, "unregisterConversionListener", new String[0]);
        f22532 = null;
    }

    public void updateServerUninstallToken(Context context, String str) {
        if (str != null) {
            C8776a.m20739(context, new C8764a(str).f22681);
        }
    }

    public void validateAndTrackInAppPurchase(Context context, String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        String str6;
        Context context2 = context;
        String str7 = str3;
        String str8 = str4;
        String str9 = str5;
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        C8752aa aaVar = C8752aa.f22603;
        String[] strArr = new String[6];
        strArr[0] = str;
        strArr[1] = str2;
        strArr[2] = str7;
        strArr[3] = str8;
        strArr[4] = str9;
        if (map == null) {
            str6 = "";
        } else {
            str6 = map.toString();
        }
        strArr[5] = str6;
        aaVar.mo23772("public_api_call", "validateAndTrackInAppPurchase", strArr);
        if (!isTrackingStopped()) {
            StringBuilder sb = new StringBuilder("Validate in app called with parameters: ");
            sb.append(str7);
            String str10 = " ";
            sb.append(str10);
            sb.append(str8);
            sb.append(str10);
            sb.append(str9);
            AFLogger.afInfoLog(sb.toString());
        }
        if (str == null || str8 == null || str2 == null || str9 == null || str7 == null) {
            AppsFlyerInAppPurchaseValidatorListener appsFlyerInAppPurchaseValidatorListener = f22527;
            if (appsFlyerInAppPurchaseValidatorListener != null) {
                appsFlyerInAppPurchaseValidatorListener.onValidateInAppFailure("Please provide purchase parameters");
                return;
            }
            return;
        }
        ScheduledThreadPoolExecutor r10 = AFExecutor.getInstance().mo23616();
        C8788r rVar = new C8788r(context.getApplicationContext(), AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY), str, str2, str3, str4, str5, map, context2 instanceof Activity ? ((Activity) context2).getIntent() : null);
        m20622(r10, rVar, 10, TimeUnit.MILLISECONDS);
    }

    public void waitForCustomerUserId(boolean z) {
        AFLogger.afInfoLog("initAfterCustomerUserID: ".concat(String.valueOf(z)), true);
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, z);
    }

    /* renamed from: ʻ */
    private static boolean m20594(Context context) {
        if ((AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_ANDROID_ID_FORCE_BY_USER, false) || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.COLLECT_IMEI_FORCE_BY_USER, false)) || !m20647(context)) {
            return true;
        }
        return false;
    }

    @Deprecated
    public void setGCMProjectNumber(Context context, String str) {
        AFLogger.afWarnLog("setGCMProjectNumber() is deprecated. GCM no longer works. This API does nothing. Please follow the documentation.");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: ˎ */
    public final void mo23712(Context context, Intent intent) {
        String str = "appsflyer_preinstall";
        if (intent.getStringExtra(str) != null) {
            getInstance();
            String stringExtra = intent.getStringExtra(str);
            try {
                if (new JSONObject(stringExtra).has(Constants.URL_MEDIA_SOURCE)) {
                    AppsFlyerProperties.getInstance().set("preInstallName", stringExtra);
                } else {
                    AFLogger.afWarnLog("Cannot set preinstall attribution data without a media source");
                }
            } catch (JSONException e) {
                AFLogger.afErrorLog("Error parsing JSON for preinstall", e);
            }
        }
        String str2 = AppsFlyerProperties.IS_MONITOR;
        String stringExtra2 = intent.getStringExtra(str2);
        if (stringExtra2 != null) {
            AFLogger.afInfoLog("Turning on monitoring.");
            AppsFlyerProperties.getInstance().set(str2, stringExtra2.equals("true"));
            m20605(context, null, "START_TRACKING", context.getPackageName());
            return;
        }
        AFLogger.afInfoLog("****** onReceive called *******");
        AppsFlyerProperties.getInstance().setOnReceiveCalled();
        String str3 = "referrer";
        String stringExtra3 = intent.getStringExtra(str3);
        AFLogger.afInfoLog("Play store referrer: ".concat(String.valueOf(stringExtra3)));
        if (stringExtra3 != null) {
            String str4 = "appsflyer-data";
            if ("AppsFlyer_Test".equals(intent.getStringExtra("TestIntegrationMode"))) {
                Editor edit = context.getApplicationContext().getSharedPreferences(str4, 0).edit();
                edit.clear();
                edit.apply();
                AppsFlyerProperties.getInstance().setFirstLaunchCalled(false);
                AFLogger.afInfoLog("Test mode started..");
                this.f22543 = System.currentTimeMillis();
            }
            Editor edit2 = context.getApplicationContext().getSharedPreferences(str4, 0).edit();
            edit2.putString(str3, stringExtra3);
            edit2.apply();
            AppsFlyerProperties.getInstance().setReferrer(stringExtra3);
            if (AppsFlyerProperties.getInstance().isFirstLaunchCalled()) {
                AFLogger.afInfoLog("onReceive: isLaunchCalled");
                if (stringExtra3 != null && stringExtra3.length() > 5) {
                    ScheduledThreadPoolExecutor r0 = AFExecutor.getInstance().mo23616();
                    C8772h hVar = new C8772h();
                    hVar.f22720 = context;
                    C8772h r9 = hVar.mo23792();
                    r9.f22721 = new WeakReference<>(r9.f22720);
                    r9.f22720 = null;
                    r9.f22725 = stringExtra3;
                    r9.f22722 = true;
                    r9.f22716 = intent;
                    m20622(r0, new C8748c(this, r9, 0), 5, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    /* renamed from: ˊ */
    private static void m20602(Context context, String str) {
        Intent intent = new Intent("com.appsflyer.testIntgrationBroadcast");
        intent.putExtra("params", str);
        if (VERSION.SDK_INT >= 26) {
            String str2 = "com.appsflyer.referrerSender";
            if (context.getPackageManager().queryBroadcastReceivers(intent, 0).toString().contains(str2)) {
                Intent intent2 = new Intent(intent);
                intent2.setComponent(new ComponentName(str2, "com.appsflyer.referrerSender.Receiver"));
                context.sendBroadcast(intent2);
            }
            return;
        }
        context.sendBroadcast(intent);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0031 A[SYNTHETIC, Splitter:B:16:0x0031] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:13:0x0028=Splitter:B:13:0x0028, B:22:0x003f=Splitter:B:22:0x003f} */
    /* renamed from: ˋ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m20609(java.io.File r4, java.lang.String r5) {
        /*
            r0 = 0
            java.util.Properties r1 = new java.util.Properties     // Catch:{ FileNotFoundException -> 0x003e, all -> 0x0026 }
            r1.<init>()     // Catch:{ FileNotFoundException -> 0x003e, all -> 0x0026 }
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ FileNotFoundException -> 0x003e, all -> 0x0026 }
            r2.<init>(r4)     // Catch:{ FileNotFoundException -> 0x003e, all -> 0x0026 }
            r1.load(r2)     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x0024 }
            java.lang.String r3 = "Found PreInstall property!"
            com.appsflyer.AFLogger.afInfoLog(r3)     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x0024 }
            java.lang.String r4 = r1.getProperty(r5)     // Catch:{ FileNotFoundException -> 0x003f, all -> 0x0024 }
            r2.close()     // Catch:{ all -> 0x001b }
            goto L_0x0023
        L_0x001b:
            r5 = move-exception
            java.lang.String r0 = r5.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r0, r5)
        L_0x0023:
            return r4
        L_0x0024:
            r4 = move-exception
            goto L_0x0028
        L_0x0026:
            r4 = move-exception
            r2 = r0
        L_0x0028:
            java.lang.String r5 = r4.getMessage()     // Catch:{ all -> 0x005a }
            com.appsflyer.AFLogger.afErrorLog(r5, r4)     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x0059
            r2.close()     // Catch:{ all -> 0x0035 }
            goto L_0x0059
        L_0x0035:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r5, r4)
            goto L_0x0059
        L_0x003e:
            r2 = r0
        L_0x003f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x005a }
            java.lang.String r1 = "PreInstall file wasn't found: "
            r5.<init>(r1)     // Catch:{ all -> 0x005a }
            java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ all -> 0x005a }
            r5.append(r4)     // Catch:{ all -> 0x005a }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x005a }
            com.appsflyer.AFLogger.afDebugLog(r4)     // Catch:{ all -> 0x005a }
            if (r2 == 0) goto L_0x0059
            r2.close()     // Catch:{ all -> 0x0035 }
        L_0x0059:
            return r0
        L_0x005a:
            r4 = move-exception
            if (r2 == 0) goto L_0x0069
            r2.close()     // Catch:{ all -> 0x0061 }
            goto L_0x0069
        L_0x0061:
            r5 = move-exception
            java.lang.String r0 = r5.getMessage()
            com.appsflyer.AFLogger.afErrorLog(r0, r5)
        L_0x0069:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.m20609(java.io.File, java.lang.String):java.lang.String");
    }

    /* renamed from: ॱ */
    private void m20646(C8772h hVar) {
        hVar.mo23792();
        boolean z = hVar.f22715 == null;
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false) && AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.APP_USER_ID) == null) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            return;
        }
        if (z) {
            if (!AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.LAUNCH_PROTECT_ENABLED, true)) {
                AFLogger.afInfoLog("Allowing multiple launches within a 5 second time window.");
            } else if (m20607()) {
                return;
            }
            this.f22559 = System.currentTimeMillis();
        }
        ScheduledThreadPoolExecutor r0 = AFExecutor.getInstance().mo23616();
        hVar.f22721 = new WeakReference<>(hVar.f22720);
        hVar.f22720 = null;
        hVar.f22722 = false;
        m20622(r0, new C8748c(this, hVar, 0), 150, TimeUnit.MILLISECONDS);
    }

    public void startTracking(Application application, String str) {
        startTracking(application, str, null);
    }

    /* renamed from: ˏ */
    private static void m20634(JSONObject jSONObject) {
        String str;
        ArrayList arrayList = new ArrayList();
        Iterator keys = jSONObject.keys();
        while (true) {
            if (!keys.hasNext()) {
                break;
            }
            try {
                JSONArray jSONArray = new JSONArray((String) jSONObject.get((String) keys.next()));
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(Long.valueOf(jSONArray.getLong(i)));
                }
            } catch (JSONException unused) {
            }
        }
        Collections.sort(arrayList);
        Iterator keys2 = jSONObject.keys();
        loop2:
        while (true) {
            str = null;
            while (keys2.hasNext() && str == null) {
                String str2 = (String) keys2.next();
                try {
                    JSONArray jSONArray2 = new JSONArray((String) jSONObject.get(str2));
                    String str3 = str;
                    int i2 = 0;
                    while (i2 < jSONArray2.length()) {
                        try {
                            if (jSONArray2.getLong(i2) != ((Long) arrayList.get(0)).longValue() && jSONArray2.getLong(i2) != ((Long) arrayList.get(1)).longValue() && jSONArray2.getLong(i2) != ((Long) arrayList.get(arrayList.size() - 1)).longValue()) {
                                i2++;
                                str3 = str2;
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                    str = str3;
                } catch (JSONException unused3) {
                }
            }
        }
        if (str != null) {
            jSONObject.remove(str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void startTracking(android.app.Application r17, java.lang.String r18, com.appsflyer.AppsFlyerTrackingRequestListener r19) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r3 = r18
            r1.f22557 = r2
            com.appsflyer.internal.aa r0 = com.appsflyer.internal.C8752aa.f22603
            if (r0 != 0) goto L_0x0013
            com.appsflyer.internal.aa r0 = new com.appsflyer.internal.aa
            r0.<init>()
            com.appsflyer.internal.C8752aa.f22603 = r0
        L_0x0013:
            com.appsflyer.internal.aa r0 = com.appsflyer.internal.C8752aa.f22603
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]
            r6 = 0
            r5[r6] = r3
            java.lang.String r7 = "startTracking"
            java.lang.String r8 = "public_api_call"
            r0.mo23772(r8, r7, r5)
            r5 = 2
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r7 = "4.10.3"
            r0[r6] = r7
            java.lang.String r7 = "233"
            r0[r4] = r7
            java.lang.String r7 = "Starting AppsFlyer Tracking: (v%s.%s)"
            java.lang.String r0 = java.lang.String.format(r7, r0)
            com.appsflyer.AFLogger.afInfoLog(r0)
            java.lang.String r0 = "Build Number: 233"
            com.appsflyer.AFLogger.afInfoLog(r0)
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            android.content.Context r7 = r17.getApplicationContext()
            r0.loadProperties(r7)
            boolean r0 = android.text.TextUtils.isEmpty(r18)
            java.lang.String r7 = "AppsFlyerKey"
            if (r0 != 0) goto L_0x0059
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            r0.set(r7, r3)
            com.appsflyer.AFFacebookDeferredDeeplink.C87402.m20580(r18)
            goto L_0x006d
        L_0x0059:
            com.appsflyer.AppsFlyerProperties r0 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = r0.getString(r7)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = "ERROR: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key either in the 'init' API method (should be called on Application's onCreate),or in the startTracking API method (should be called on Activity's onCreate)."
            com.appsflyer.AFLogger.afWarnLog(r0)
            return
        L_0x006d:
            android.content.Context r0 = r17.getBaseContext()
            android.content.pm.PackageManager r7 = r0.getPackageManager()     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r8 = r0.getPackageName()     // Catch:{ Exception -> 0x00a5 }
            android.content.pm.PackageInfo r7 = r7.getPackageInfo(r8, r6)     // Catch:{ Exception -> 0x00a5 }
            android.content.pm.ApplicationInfo r7 = r7.applicationInfo     // Catch:{ Exception -> 0x00a5 }
            int r7 = r7.flags     // Catch:{ Exception -> 0x00a5 }
            r8 = 32768(0x8000, float:4.5918E-41)
            r7 = r7 & r8
            if (r7 == 0) goto L_0x00bb
            android.content.res.Resources r7 = r0.getResources()     // Catch:{ Exception -> 0x00a5 }
            java.lang.String r8 = "appsflyer_backup_rules"
            java.lang.String r9 = "xml"
            java.lang.String r0 = r0.getPackageName()     // Catch:{ Exception -> 0x00a5 }
            int r0 = r7.getIdentifier(r8, r9, r0)     // Catch:{ Exception -> 0x00a5 }
            if (r0 == 0) goto L_0x009f
            java.lang.String r0 = "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data"
            com.appsflyer.AFLogger.afInfoLog(r0, r4)     // Catch:{ Exception -> 0x00a5 }
            goto L_0x00bb
        L_0x009f:
            java.lang.String r0 = "'allowBackup' is set to true; appsflyer_backup_rules.xml not detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules"
            com.appsflyer.AFLogger.m20588(r0)     // Catch:{ Exception -> 0x00a5 }
            goto L_0x00bb
        L_0x00a5:
            r0 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "checkBackupRules Exception: "
            r7.<init>(r8)
            java.lang.String r0 = r0.toString()
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            com.appsflyer.AFLogger.afRDLog(r0)
        L_0x00bb:
            android.content.Context r0 = r17.getBaseContext()
            boolean r7 = r1.f22554
            if (r7 == 0) goto L_0x00ec
            org.json.JSONObject r7 = r1.f22555
            if (r7 == 0) goto L_0x00cf
            int r7 = r7.length()
            if (r7 <= 0) goto L_0x00cf
            r7 = 1
            goto L_0x00d0
        L_0x00cf:
            r7 = 0
        L_0x00d0:
            if (r7 == 0) goto L_0x00d8
            boolean r7 = r16.m20623()
            if (r7 == 0) goto L_0x00ec
        L_0x00d8:
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r7 = "appsflyer-data"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r7, r6)
            java.lang.String r7 = "appsFlyerCount"
            int r0 = m20624(r0, r7, r6)
            if (r0 > r5) goto L_0x00ec
            r0 = 1
            goto L_0x00ed
        L_0x00ec:
            r0 = 0
        L_0x00ed:
            if (r0 == 0) goto L_0x019c
            android.content.Context r0 = r17.getApplicationContext()
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            r1.f22555 = r7
            long r7 = java.lang.System.currentTimeMillis()
            com.appsflyer.AppsFlyerLibCore$1 r9 = new com.appsflyer.AppsFlyerLibCore$1
            r9.<init>(r7)
            java.lang.String r7 = "com.facebook.FacebookSdk"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ NoSuchMethodException -> 0x0194, InvocationTargetException -> 0x018b, ClassNotFoundException -> 0x0182, IllegalAccessException -> 0x0179 }
            java.lang.String r8 = "sdkInitialize"
            java.lang.Class[] r10 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x0194, InvocationTargetException -> 0x018b, ClassNotFoundException -> 0x0182, IllegalAccessException -> 0x0179 }
            java.lang.Class<android.content.Context> r11 = android.content.Context.class
            r10[r6] = r11     // Catch:{ NoSuchMethodException -> 0x0194, InvocationTargetException -> 0x018b, ClassNotFoundException -> 0x0182, IllegalAccessException -> 0x0179 }
            java.lang.reflect.Method r7 = r7.getMethod(r8, r10)     // Catch:{ NoSuchMethodException -> 0x0194, InvocationTargetException -> 0x018b, ClassNotFoundException -> 0x0182, IllegalAccessException -> 0x0179 }
            java.lang.Object[] r8 = new java.lang.Object[r4]     // Catch:{ NoSuchMethodException -> 0x0194, InvocationTargetException -> 0x018b, ClassNotFoundException -> 0x0182, IllegalAccessException -> 0x0179 }
            r8[r6] = r0     // Catch:{ NoSuchMethodException -> 0x0194, InvocationTargetException -> 0x018b, ClassNotFoundException -> 0x0182, IllegalAccessException -> 0x0179 }
            r10 = 0
            r7.invoke(r10, r8)     // Catch:{ NoSuchMethodException -> 0x0194, InvocationTargetException -> 0x018b, ClassNotFoundException -> 0x0182, IllegalAccessException -> 0x0179 }
            java.lang.String r7 = "com.facebook.applinks.AppLinkData"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch:{ NoSuchMethodException -> 0x0194, InvocationTargetException -> 0x018b, ClassNotFoundException -> 0x0182, IllegalAccessException -> 0x0179 }
            java.lang.String r8 = "com.facebook.applinks.AppLinkData$CompletionHandler"
            java.lang.Class r8 = java.lang.Class.forName(r8)     // Catch:{ NoSuchMethodException -> 0x0194, InvocationTargetException -> 0x018b, ClassNotFoundException -> 0x0182, IllegalAccessException -> 0x0179 }
            java.lang.String r11 = "fetchDeferredAppLinkData"
            r12 = 3
            java.lang.Class[] r13 = new java.lang.Class[r12]     // Catch:{ NoSuchMethodException -> 0x0194, InvocationTargetException -> 0x018b, ClassNotFoundException -> 0x0182, IllegalAccessException -> 0x0179 }
            java.lang.Class<android.content.Context> r14 = android.content.Context.class
            r13[r6] = r14     // Catch:{ NoSuchMethodException -> 0x0194, InvocationTargetException -> 0x018b, ClassNotFoundException -> 0x0182, IllegalAccessException -> 0x0179 }
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            r13[r4] = r14     // Catch:{ NoSuchMethodException -> 0x0194, InvocationTargetException -> 0x018b, ClassNotFoundException -> 0x0182, IllegalAccessException -> 0x0179 }
            r13[r5] = r8     // Catch:{ NoSuchMethodException -> 0x0194, InvocationTargetException -> 0x018b, ClassNotFoundException -> 0x0182, IllegalAccessException -> 0x0179 }
            java.lang.reflect.Method r11 = r7.getMethod(r11, r13)     // Catch:{ NoSuchMethodException -> 0x0194, InvocationTargetException -> 0x018b, ClassNotFoundException -> 0x0182, IllegalAccessException -> 0x0179 }
            com.appsflyer.AFFacebookDeferredDeeplink$2 r13 = new com.appsflyer.AFFacebookDeferredDeeplink$2     // Catch:{ NoSuchMethodException -> 0x0194, InvocationTargetException -> 0x018b, ClassNotFoundException -> 0x0182, IllegalAccessException -> 0x0179 }
            r13.<init>(r7, r9)     // Catch:{ NoSuchMethodException -> 0x0194, InvocationTargetException -> 0x018b, ClassNotFoundException -> 0x0182, IllegalAccessException -> 0x0179 }
            java.lang.ClassLoader r7 = r8.getClassLoader()     // Catch:{ NoSuchMethodException -> 0x0194, InvocationTargetException -> 0x018b, ClassNotFoundException -> 0x0182, IllegalAccessException -> 0x0179 }
            java.lang.Class[] r14 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x0194, InvocationTargetException -> 0x018b, ClassNotFoundException -> 0x0182, IllegalAccessException -> 0x0179 }
            r14[r6] = r8     // Catch:{ NoSuchMethodException -> 0x0194, InvocationTargetException -> 0x018b, ClassNotFoundException -> 0x0182, IllegalAccessException -> 0x0179 }
            java.lang.Object r7 = java.lang.reflect.Proxy.newProxyInstance(r7, r14, r13)     // Catch:{ NoSuchMethodException -> 0x0194, InvocationTargetException -> 0x018b, ClassNotFoundException -> 0x0182, IllegalAccessException -> 0x0179 }
            android.content.res.Resources r8 = r0.getResources()     // Catch:{ NoSuchMethodException -> 0x0194, InvocationTargetException -> 0x018b, ClassNotFoundException -> 0x0182, IllegalAccessException -> 0x0179 }
            java.lang.String r13 = "facebook_app_id"
            java.lang.String r14 = "string"
            java.lang.String r15 = r0.getPackageName()     // Catch:{ NoSuchMethodException -> 0x0194, InvocationTargetException -> 0x018b, ClassNotFoundException -> 0x0182, IllegalAccessException -> 0x0179 }
            int r8 = r8.getIdentifier(r13, r14, r15)     // Catch:{ NoSuchMethodException -> 0x0194, InvocationTargetException -> 0x018b, ClassNotFoundException -> 0x0182, IllegalAccessException -> 0x0179 }
            java.lang.String r8 = r0.getString(r8)     // Catch:{ NoSuchMethodException -> 0x0194, InvocationTargetException -> 0x018b, ClassNotFoundException -> 0x0182, IllegalAccessException -> 0x0179 }
            boolean r13 = android.text.TextUtils.isEmpty(r8)     // Catch:{ NoSuchMethodException -> 0x0194, InvocationTargetException -> 0x018b, ClassNotFoundException -> 0x0182, IllegalAccessException -> 0x0179 }
            if (r13 == 0) goto L_0x016d
            java.lang.String r0 = "Facebook app id not defined in resources"
            r9.onAppLinkFetchFailed(r0)     // Catch:{ NoSuchMethodException -> 0x0194, InvocationTargetException -> 0x018b, ClassNotFoundException -> 0x0182, IllegalAccessException -> 0x0179 }
            goto L_0x019c
        L_0x016d:
            java.lang.Object[] r12 = new java.lang.Object[r12]     // Catch:{ NoSuchMethodException -> 0x0194, InvocationTargetException -> 0x018b, ClassNotFoundException -> 0x0182, IllegalAccessException -> 0x0179 }
            r12[r6] = r0     // Catch:{ NoSuchMethodException -> 0x0194, InvocationTargetException -> 0x018b, ClassNotFoundException -> 0x0182, IllegalAccessException -> 0x0179 }
            r12[r4] = r8     // Catch:{ NoSuchMethodException -> 0x0194, InvocationTargetException -> 0x018b, ClassNotFoundException -> 0x0182, IllegalAccessException -> 0x0179 }
            r12[r5] = r7     // Catch:{ NoSuchMethodException -> 0x0194, InvocationTargetException -> 0x018b, ClassNotFoundException -> 0x0182, IllegalAccessException -> 0x0179 }
            r11.invoke(r10, r12)     // Catch:{ NoSuchMethodException -> 0x0194, InvocationTargetException -> 0x018b, ClassNotFoundException -> 0x0182, IllegalAccessException -> 0x0179 }
            goto L_0x019c
        L_0x0179:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            r9.onAppLinkFetchFailed(r0)
            goto L_0x019c
        L_0x0182:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            r9.onAppLinkFetchFailed(r0)
            goto L_0x019c
        L_0x018b:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            r9.onAppLinkFetchFailed(r0)
            goto L_0x019c
        L_0x0194:
            r0 = move-exception
            java.lang.String r0 = r0.toString()
            r9.onAppLinkFetchFailed(r0)
        L_0x019c:
            com.appsflyer.internal.h r0 = new com.appsflyer.internal.h
            r0.<init>()
            r0.f22720 = r2
            r0.f22726 = r3
            r2 = r19
            r0.f22724 = r2
            r1.m20621(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.startTracking(android.app.Application, java.lang.String, com.appsflyer.AppsFlyerTrackingRequestListener):void");
    }

    public AppsFlyerLib init(String str, AppsFlyerConversionListener appsFlyerConversionListener) {
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        C8752aa aaVar = C8752aa.f22603;
        String[] strArr = new String[2];
        strArr[0] = str;
        strArr[1] = appsFlyerConversionListener == null ? "null" : "conversionDataListener";
        aaVar.mo23772("public_api_call", "init", strArr);
        AFLogger.m20591(String.format("Initializing AppsFlyer SDK: (v%s.%s)", new Object[]{BuildConfig.VERSION_NAME, "233"}));
        this.f22552 = true;
        AppsFlyerProperties.getInstance().set(AppsFlyerProperties.AF_KEY, str);
        C87402.m20580(str);
        f22532 = appsFlyerConversionListener;
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: ʼ */
    public static String m20595(Context context, String str) {
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
        String str2 = "CACHED_CHANNEL";
        if (sharedPreferences.contains(str2)) {
            return sharedPreferences.getString(str2, null);
        }
        m20604(context, str2, str);
        return str;
    }

    public void trackEvent(Context context, String str, Map<String, Object> map) {
        trackEvent(context, str, map, null);
    }

    /* renamed from: ˊ */
    private static void m20605(Context context, String str, String str2, String str3) {
        if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.IS_MONITOR, false)) {
            Intent intent = new Intent("com.appsflyer.MonitorBroadcast");
            intent.setPackage("com.appsflyer.nightvision");
            intent.putExtra("message", str2);
            intent.putExtra("value", str3);
            intent.putExtra("packageName", "true");
            intent.putExtra(Constants.URL_MEDIA_SOURCE, new Integer(Process.myPid()));
            intent.putExtra("eventIdentifier", str);
            intent.putExtra("sdk", BuildConfig.VERSION_NAME);
            context.sendBroadcast(intent);
        }
    }

    @Deprecated
    public String getAttributionId(ContentResolver contentResolver) {
        return getAttributionId((Context) this.f22557);
    }

    /* access modifiers changed from: private */
    /* renamed from: ˋ */
    public static void m20613(Context context, String str, int i) {
        Editor edit = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).edit();
        edit.putInt(str, i);
        edit.apply();
    }

    /* access modifiers changed from: private */
    /* renamed from: ॱ */
    public static String m20640(WeakReference<Context> weakReference) {
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.CHANNEL);
        if (string == null) {
            string = m20600(weakReference, "CHANNEL");
        }
        if (string == null || !string.equals("")) {
            return string;
        }
        return null;
    }

    public void setUserEmails(String... strArr) {
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        C8752aa.f22603.mo23772("public_api_call", "setUserEmails", strArr);
        setUserEmails(EmailsCryptType.NONE, strArr);
    }

    /* renamed from: ˏ */
    private static Map<String, String> m20628(Context context, String str) {
        String str2;
        String str3;
        String str4 = "install_time";
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] split = str.split("&");
        int length = split.length;
        int i = 0;
        boolean z = false;
        while (true) {
            str2 = "media_source";
            if (i < length) {
                String str5 = split[i];
                int indexOf = str5.indexOf("=");
                String substring = indexOf > 0 ? str5.substring(0, indexOf) : str5;
                if (!linkedHashMap.containsKey(substring)) {
                    if (substring.equals(Constants.URL_CAMPAIGN)) {
                        str2 = "campaign";
                    } else if (!substring.equals(Constants.URL_MEDIA_SOURCE)) {
                        if (substring.equals("af_prt")) {
                            z = true;
                            str2 = "agency";
                        }
                        linkedHashMap.put(substring, "");
                    }
                    substring = str2;
                    linkedHashMap.put(substring, "");
                }
                if (indexOf > 0) {
                    int i2 = indexOf + 1;
                    if (str5.length() > i2) {
                        str3 = str5.substring(i2);
                        linkedHashMap.put(substring, str3);
                        i++;
                    }
                }
                str3 = null;
                linkedHashMap.put(substring, str3);
                i++;
            } else {
                try {
                    break;
                } catch (Exception e) {
                    AFLogger.afErrorLog("Could not fetch install time. ", e);
                }
            }
        }
        if (!linkedHashMap.containsKey(str4)) {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
            long j = packageInfo.firstInstallTime;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            linkedHashMap.put(str4, simpleDateFormat.format(new Date(j)));
        }
        String str6 = "af_status";
        if (!linkedHashMap.containsKey(str6)) {
            linkedHashMap.put(str6, "Non-organic");
        }
        if (z) {
            linkedHashMap.remove(str2);
        }
        return linkedHashMap;
    }

    /* renamed from: ˋ */
    public final void mo23711(Context context, String str) {
        boolean z = AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false);
        String str2 = AppsFlyerProperties.APP_USER_ID;
        if (z && AppsFlyerProperties.getInstance().getString(str2) == null) {
            AFLogger.afInfoLog("CustomerUserId not set, Tracking is disabled", true);
            return;
        }
        HashMap hashMap = new HashMap();
        String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY);
        if (string == null) {
            AFLogger.afWarnLog("[registerUninstall] AppsFlyer's SDK cannot send any event without providing DevKey.");
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            hashMap.put("app_version_code", Integer.toString(packageInfo.versionCode));
            hashMap.put("app_version_name", packageInfo.versionName);
            hashMap.put("app_name", packageManager.getApplicationLabel(packageInfo.applicationInfo).toString());
            long j = packageInfo.firstInstallTime;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            hashMap.put("installDate", simpleDateFormat.format(new Date(j)));
        } catch (Throwable th) {
            AFLogger.afErrorLog("Exception while collecting application version info.", th);
        }
        m20631(context, (Map<String, ? super String>) hashMap);
        String string2 = AppsFlyerProperties.getInstance().getString(str2);
        if (string2 != null) {
            hashMap.put("appUserId", string2);
        }
        try {
            hashMap.put("model", Build.MODEL);
            hashMap.put("brand", Build.BRAND);
        } catch (Throwable th2) {
            AFLogger.afErrorLog("Exception while collecting device brand and model.", th2);
        }
        AppsFlyerProperties instance = AppsFlyerProperties.getInstance();
        String str3 = AppsFlyerProperties.DEVICE_TRACKING_DISABLED;
        if (instance.getBoolean(str3, false)) {
            hashMap.put(str3, "true");
        }
        C8790s r2 = C8785p.m20754(context.getContentResolver());
        if (r2 != null) {
            hashMap.put("amazon_aid", r2.f22770);
            hashMap.put("amazon_aid_limit", String.valueOf(r2.f22771));
        }
        AppsFlyerProperties instance2 = AppsFlyerProperties.getInstance();
        String str4 = ServerParameters.ADVERTISING_ID_PARAM;
        String string3 = instance2.getString(str4);
        if (string3 != null) {
            hashMap.put(str4, string3);
        }
        hashMap.put("devkey", string);
        hashMap.put("uid", C8753ab.m20687(new WeakReference(context)));
        hashMap.put("af_gcm_token", str);
        hashMap.put("launch_counter", Integer.toString(m20624(context.getApplicationContext().getSharedPreferences("appsflyer-data", 0), "appsFlyerCount", false)));
        hashMap.put("sdk", Integer.toString(VERSION.SDK_INT));
        String r13 = m20640(new WeakReference<>(context));
        if (r13 != null) {
            hashMap.put(AppsFlyerProperties.CHANNEL, r13);
        }
        try {
            C8801x xVar = new C8801x(context, isTrackingStopped());
            xVar.f22795 = hashMap;
            StringBuilder sb = new StringBuilder();
            sb.append(ServerConfigHandler.getUrl(f22531));
            sb.append(packageName);
            xVar.execute(new String[]{sb.toString()});
        } catch (Throwable th3) {
            AFLogger.afErrorLog(th3.getMessage(), th3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        if (r3 != null) goto L_0x002c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054 A[SYNTHETIC, Splitter:B:23:0x0054] */
    /* renamed from: ॱ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m20641(java.net.HttpURLConnection r7) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            java.io.InputStream r2 = r7.getErrorStream()     // Catch:{ all -> 0x0037 }
            if (r2 != 0) goto L_0x0010
            java.io.InputStream r2 = r7.getInputStream()     // Catch:{ all -> 0x0037 }
        L_0x0010:
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0037 }
            r3.<init>(r2)     // Catch:{ all -> 0x0037 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0035 }
            r2.<init>(r3)     // Catch:{ all -> 0x0035 }
        L_0x001a:
            java.lang.String r1 = r2.readLine()     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x0029
            r0.append(r1)     // Catch:{ all -> 0x0030 }
            r1 = 10
            r0.append(r1)     // Catch:{ all -> 0x0030 }
            goto L_0x001a
        L_0x0029:
            r2.close()     // Catch:{ all -> 0x005a }
        L_0x002c:
            r3.close()     // Catch:{ all -> 0x005a }
            goto L_0x005a
        L_0x0030:
            r1 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L_0x0039
        L_0x0035:
            r2 = move-exception
            goto L_0x0039
        L_0x0037:
            r2 = move-exception
            r3 = r1
        L_0x0039:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x007d }
            java.lang.String r5 = "Could not read connection response from: "
            r4.<init>(r5)     // Catch:{ all -> 0x007d }
            java.net.URL r7 = r7.getURL()     // Catch:{ all -> 0x007d }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x007d }
            r4.append(r7)     // Catch:{ all -> 0x007d }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x007d }
            com.appsflyer.AFLogger.afErrorLog(r7, r2)     // Catch:{ all -> 0x007d }
            if (r1 == 0) goto L_0x0057
            r1.close()     // Catch:{ all -> 0x005a }
        L_0x0057:
            if (r3 == 0) goto L_0x005a
            goto L_0x002c
        L_0x005a:
            java.lang.String r7 = r0.toString()
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0064 }
            r0.<init>(r7)     // Catch:{ JSONException -> 0x0064 }
            return r7
        L_0x0064:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "string_response"
            r0.put(r1, r7)     // Catch:{ JSONException -> 0x0073 }
            java.lang.String r7 = r0.toString()     // Catch:{ JSONException -> 0x0073 }
            return r7
        L_0x0073:
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            java.lang.String r7 = r7.toString()
            return r7
        L_0x007d:
            r7 = move-exception
            if (r1 == 0) goto L_0x0083
            r1.close()     // Catch:{ all -> 0x0088 }
        L_0x0083:
            if (r3 == 0) goto L_0x0088
            r3.close()     // Catch:{ all -> 0x0088 }
        L_0x0088:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.m20641(java.net.HttpURLConnection):java.lang.String");
    }

    /* renamed from: ˊ */
    private boolean m20607() {
        if (this.f22559 > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.f22559;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS Z", Locale.US);
            long j = this.f22559;
            String str = "UTC";
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(str));
            String format = simpleDateFormat.format(new Date(j));
            long j2 = this.f22562;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(str));
            String format2 = simpleDateFormat.format(new Date(j2));
            if (currentTimeMillis < this.f22536 && !isTrackingStopped()) {
                AFLogger.afInfoLog(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nThis launch is blocked: %s ms < %s ms", new Object[]{format, format2, Long.valueOf(currentTimeMillis), Long.valueOf(this.f22536)}));
                return true;
            } else if (!isTrackingStopped()) {
                AFLogger.afInfoLog(String.format(Locale.US, "Last Launch attempt: %s;\nLast successful Launch event: %s;\nSending launch (+%s ms)", new Object[]{format, format2, Long.valueOf(currentTimeMillis)}));
            }
        } else if (!isTrackingStopped()) {
            AFLogger.afInfoLog("Sending first launch for this session!");
        }
        return false;
    }

    /* renamed from: ˊ */
    private static String m20600(WeakReference<Context> weakReference, String str) {
        if (weakReference.get() == null) {
            return null;
        }
        return m20615(str, ((Context) weakReference.get()).getPackageManager(), ((Context) weakReference.get()).getPackageName());
    }

    /* renamed from: ˊ */
    private static File m20599(String str) {
        if (str != null) {
            try {
                if (str.trim().length() > 0) {
                    return new File(str.trim());
                }
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getMessage(), th);
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: ॱ */
    public static void m20644(Context context, String str, long j) {
        Editor edit = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).edit();
        edit.putLong(str, j);
        edit.apply();
    }

    /* renamed from: ˏ */
    private void m20630(Context context, String str, String str2, Intent intent) {
        C8772h hVar = new C8772h();
        hVar.f22720 = context;
        hVar.f22715 = null;
        hVar.f22726 = str;
        hVar.f22727 = null;
        hVar.f22725 = str2;
        hVar.f22716 = intent;
        hVar.f22712 = null;
        m20646(hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: ˊ */
    public static void m20604(Context context, String str, String str2) {
        Editor edit = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).edit();
        edit.putString(str, str2);
        edit.apply();
    }

    /* renamed from: ˎ */
    static void m20619(Context context, String str) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        String str2 = "extraReferrers";
        String str3 = "appsflyer-data";
        AFLogger.afDebugLog("received a new (extra) referrer: ".concat(String.valueOf(str)));
        try {
            long currentTimeMillis = System.currentTimeMillis();
            String string = context.getApplicationContext().getSharedPreferences(str3, 0).getString(str2, null);
            if (string == null) {
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray2 = new JSONArray();
                jSONObject = jSONObject2;
                jSONArray = jSONArray2;
            } else {
                jSONObject = new JSONObject(string);
                if (jSONObject.has(str)) {
                    jSONArray = new JSONArray((String) jSONObject.get(str));
                } else {
                    jSONArray = new JSONArray();
                }
            }
            if (((long) jSONArray.length()) < 5) {
                jSONArray.put(currentTimeMillis);
            }
            if (((long) jSONObject.length()) >= 4) {
                m20634(jSONObject);
            }
            jSONObject.put(str, jSONArray.toString());
            String jSONObject3 = jSONObject.toString();
            Editor edit = context.getApplicationContext().getSharedPreferences(str3, 0).edit();
            edit.putString(str2, jSONObject3);
            edit.apply();
        } catch (JSONException unused) {
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Couldn't save referrer - ");
            sb.append(str);
            sb.append(": ");
            AFLogger.afErrorLog(sb.toString(), th);
        }
    }

    /* renamed from: ॱ */
    private static void m20643(Context context) {
        int i;
        if ("OPPO".equals(Build.BRAND)) {
            i = 23;
            AFLogger.afRDLog("OPPO device found");
        } else {
            i = 18;
        }
        if (VERSION.SDK_INT < i || AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.DISABLE_KEYSTORE, false)) {
            StringBuilder sb = new StringBuilder("OS SDK is=");
            sb.append(VERSION.SDK_INT);
            sb.append("; no KeyStore usage");
            AFLogger.afRDLog(sb.toString());
            return;
        }
        StringBuilder sb2 = new StringBuilder("OS SDK is=");
        sb2.append(VERSION.SDK_INT);
        sb2.append("; use KeyStore");
        AFLogger.afRDLog(sb2.toString());
        AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(context);
        if (!aFKeystoreWrapper.mo23626()) {
            aFKeystoreWrapper.f22520 = C8753ab.m20687(new WeakReference(context));
            aFKeystoreWrapper.f22517 = 0;
            aFKeystoreWrapper.mo23625(aFKeystoreWrapper.mo23622());
        } else {
            String r4 = aFKeystoreWrapper.mo23622();
            synchronized (aFKeystoreWrapper.f22521) {
                aFKeystoreWrapper.f22517++;
                AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(r4)));
                try {
                    synchronized (aFKeystoreWrapper.f22521) {
                        aFKeystoreWrapper.f22519.deleteEntry(r4);
                    }
                } catch (KeyStoreException e) {
                    StringBuilder sb3 = new StringBuilder("Exception ");
                    sb3.append(e.getMessage());
                    sb3.append(" occurred");
                    AFLogger.afErrorLog(sb3.toString(), e);
                }
            }
            aFKeystoreWrapper.mo23625(aFKeystoreWrapper.mo23622());
        }
        AppsFlyerProperties.getInstance().set("KSAppsFlyerId", aFKeystoreWrapper.mo23623());
        AppsFlyerProperties.getInstance().set("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.mo23624()));
    }

    /* renamed from: ˊ */
    private static boolean m20608(Context context) {
        if (m20624(context.getApplicationContext().getSharedPreferences("appsflyer-data", 0), "appsFlyerCount", false) > 2) {
            AFLogger.afRDLog("Install referrer will not load, the counter > 2, ");
            return false;
        }
        try {
            Class.forName("com.android.installreferrer.api.a");
            if (C87391.m20579(context, "com.google.android.finsky.permission.BIND_GET_INSTALL_REFERRER_SERVICE")) {
                AFLogger.afDebugLog("Install referrer is allowed");
                return true;
            }
            AFLogger.afDebugLog("Install referrer is not allowed");
            return false;
        } catch (ClassNotFoundException unused) {
            AFLogger.afRDLog("Class com.android.installreferrer.api.InstallReferrerClient not found");
            return false;
        } catch (Throwable th) {
            AFLogger.afErrorLog("An error occurred while trying to verify manifest : com.android.installreferrer.api.InstallReferrerClient", th);
            return false;
        }
    }

    /* renamed from: ˏ */
    private static void m20631(Context context, Map<String, ? super String> map) {
        C8775l.m20736();
        C8776a r2 = C8775l.m20737(context);
        map.put("network", r2.f22729);
        String str = r2.f22730;
        if (str != null) {
            map.put("operator", str);
        }
        String str2 = r2.f22728;
        if (str2 != null) {
            map.put("carrier", str2);
        }
    }

    /* renamed from: ˏ */
    private static String m20626(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class}).invoke(null, new Object[]{str});
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
    /* renamed from: ˊ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23709(com.appsflyer.internal.C8772h r8) {
        /*
            r7 = this;
            android.content.Context r0 = r8.f22720
            r1 = 0
            if (r0 == 0) goto L_0x0006
            goto L_0x0012
        L_0x0006:
            java.lang.ref.WeakReference<android.content.Context> r0 = r8.f22721
            if (r0 == 0) goto L_0x0011
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            boolean r2 = r0 instanceof android.app.Activity
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x003d
            r2 = r0
            android.app.Activity r2 = (android.app.Activity) r2
            android.content.Intent r4 = r2.getIntent()
            com.appsflyer.internal.g r5 = com.appsflyer.internal.C8770g.m20730()
            int r6 = java.lang.System.identityHashCode(r2)
            r5.f22707 = r6
            android.net.Uri r1 = androidx.core.app.ActivityCompat.m2354c(r2)     // Catch:{ all -> 0x002e }
            goto L_0x0036
        L_0x002e:
            r2 = move-exception
            java.lang.String r5 = r2.getLocalizedMessage()
            com.appsflyer.AFLogger.afErrorLog(r5, r2)
        L_0x0036:
            if (r1 == 0) goto L_0x003e
            java.lang.String r1 = r1.toString()
            goto L_0x003f
        L_0x003d:
            r4 = r1
        L_0x003e:
            r1 = r3
        L_0x003f:
            com.appsflyer.AppsFlyerProperties r2 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r5 = "AppsFlyerKey"
            java.lang.String r2 = r2.getString(r5)
            if (r2 != 0) goto L_0x0051
            java.lang.String r8 = "[TrackEvent/Launch] AppsFlyer's SDK cannot send any event without providing DevKey."
            com.appsflyer.AFLogger.afWarnLog(r8)
            return
        L_0x0051:
            com.appsflyer.AppsFlyerProperties r2 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r0 = r2.getReferrer(r0)
            if (r0 != 0) goto L_0x005c
            r0 = r3
        L_0x005c:
            r8.f22725 = r0
            r8.f22716 = r4
            r8.f22712 = r1
            r7.m20646(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.mo23709(com.appsflyer.internal.h):void");
    }

    /* renamed from: ˏ */
    public static SharedPreferences m20625(Context context) {
        return context.getApplicationContext().getSharedPreferences("appsflyer-data", 0);
    }

    /* renamed from: ˏ */
    static int m20624(SharedPreferences sharedPreferences, String str, boolean z) {
        int i = sharedPreferences.getInt(str, 0);
        if (z) {
            i++;
            Editor edit = sharedPreferences.edit();
            edit.putInt(str, i);
            edit.apply();
        }
        if (C8752aa.f22603 == null) {
            C8752aa.f22603 = new C8752aa();
        }
        C8752aa aaVar = C8752aa.f22603;
        if (aaVar.f22625) {
            if (aaVar == null) {
                C8752aa.f22603 = new C8752aa();
            }
            C8752aa.f22603.mo23774(String.valueOf(i));
        }
        return i;
    }

    /* renamed from: ˎ */
    private boolean m20623() {
        try {
            return TextUtils.isEmpty((String) this.f22555.get("link"));
        } catch (JSONException e) {
            AFLogger.afErrorLog("JSONException while checking \"link\" value for fb_ddl", e);
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:133:0x0307 A[Catch:{ Exception -> 0x0320, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x031a A[Catch:{ Exception -> 0x0320, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x034f A[Catch:{ Exception -> 0x0320, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0376 A[Catch:{ Exception -> 0x0320, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x037e A[Catch:{ Exception -> 0x0320, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x039c A[Catch:{ Exception -> 0x0320, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x03ba A[Catch:{ Exception -> 0x0320, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x03f1 A[Catch:{ Exception -> 0x0320, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0405 A[Catch:{ Exception -> 0x0320, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x0411 A[Catch:{ Exception -> 0x0320, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0419 A[Catch:{ Exception -> 0x0320, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x0425 A[Catch:{ Exception -> 0x0320, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x042d A[Catch:{ Exception -> 0x0320, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0439 A[Catch:{ Exception -> 0x0320, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0448 A[Catch:{ Exception -> 0x0320, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0449 A[Catch:{ Exception -> 0x0320, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x0464 A[Catch:{ Exception -> 0x0320, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0473 A[Catch:{ Exception -> 0x0320, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0480 A[SYNTHETIC, Splitter:B:223:0x0480] */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0496 A[Catch:{ Exception -> 0x0320, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x04ab A[Catch:{ Exception -> 0x0320, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x04bc A[Catch:{ Exception -> 0x0320, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x04c2 A[Catch:{ Exception -> 0x0320, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x04d9 A[Catch:{ Exception -> 0x0320, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x04f1 A[Catch:{ Exception -> 0x0320, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x050c A[Catch:{ Exception -> 0x0320, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x053a A[Catch:{ Exception -> 0x0320, all -> 0x02b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x055b A[SYNTHETIC, Splitter:B:261:0x055b] */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x057b A[Catch:{ all -> 0x0c0f, all -> 0x0c05, NameNotFoundException -> 0x0573, all -> 0x056a, all -> 0x0c67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x058f  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0596 A[Catch:{ all -> 0x0c0f, all -> 0x0c05, NameNotFoundException -> 0x0573, all -> 0x056a, all -> 0x0c67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x062d A[Catch:{ all -> 0x0c0f, all -> 0x0c05, NameNotFoundException -> 0x0573, all -> 0x056a, all -> 0x0c67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x0638 A[Catch:{ all -> 0x0c0f, all -> 0x0c05, NameNotFoundException -> 0x0573, all -> 0x056a, all -> 0x0c67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x0651 A[Catch:{ all -> 0x0c0f, all -> 0x0c05, NameNotFoundException -> 0x0573, all -> 0x056a, all -> 0x0c67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x069e A[Catch:{ all -> 0x0c0f, all -> 0x0c05, NameNotFoundException -> 0x0573, all -> 0x056a, all -> 0x0c67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:339:0x06a4 A[Catch:{ all -> 0x0c0f, all -> 0x0c05, NameNotFoundException -> 0x0573, all -> 0x056a, all -> 0x0c67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x06af A[Catch:{ all -> 0x0c0f, all -> 0x0c05, NameNotFoundException -> 0x0573, all -> 0x056a, all -> 0x0c67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x06ca A[Catch:{ all -> 0x0c0f, all -> 0x0c05, NameNotFoundException -> 0x0573, all -> 0x056a, all -> 0x0c67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x06cd A[ADDED_TO_REGION, Catch:{ all -> 0x0c0f, all -> 0x0c05, NameNotFoundException -> 0x0573, all -> 0x056a, all -> 0x0c67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:352:0x06f0 A[Catch:{ all -> 0x0c0f, all -> 0x0c05, NameNotFoundException -> 0x0573, all -> 0x056a, all -> 0x0c67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x0705 A[Catch:{ Exception -> 0x070b }] */
    /* JADX WARNING: Removed duplicated region for block: B:395:0x07bf A[Catch:{ all -> 0x0870 }] */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x0828 A[Catch:{ all -> 0x0862 }] */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x088d A[Catch:{ all -> 0x0c0f, all -> 0x0c05, NameNotFoundException -> 0x0573, all -> 0x056a, all -> 0x0c67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:431:0x089d A[Catch:{ all -> 0x0c0f, all -> 0x0c05, NameNotFoundException -> 0x0573, all -> 0x056a, all -> 0x0c67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:434:0x08bf A[Catch:{ all -> 0x0c0f, all -> 0x0c05, NameNotFoundException -> 0x0573, all -> 0x056a, all -> 0x0c67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:436:0x08c8 A[Catch:{ all -> 0x0c0f, all -> 0x0c05, NameNotFoundException -> 0x0573, all -> 0x056a, all -> 0x0c67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:441:0x08fa A[Catch:{ all -> 0x0c0f, all -> 0x0c05, NameNotFoundException -> 0x0573, all -> 0x056a, all -> 0x0c67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:444:0x0900 A[Catch:{ all -> 0x0c0f, all -> 0x0c05, NameNotFoundException -> 0x0573, all -> 0x056a, all -> 0x0c67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:447:0x092b A[ADDED_TO_REGION, Catch:{ all -> 0x0c0f, all -> 0x0c05, NameNotFoundException -> 0x0573, all -> 0x056a, all -> 0x0c67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:453:0x093a A[Catch:{ all -> 0x0c0f, all -> 0x0c05, NameNotFoundException -> 0x0573, all -> 0x056a, all -> 0x0c67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:456:0x0965 A[Catch:{ all -> 0x0c0f, all -> 0x0c05, NameNotFoundException -> 0x0573, all -> 0x056a, all -> 0x0c67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x098b A[Catch:{ all -> 0x0c0f, all -> 0x0c05, NameNotFoundException -> 0x0573, all -> 0x056a, all -> 0x0c67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:472:0x09e9 A[Catch:{ all -> 0x0c0f, all -> 0x0c05, NameNotFoundException -> 0x0573, all -> 0x056a, all -> 0x0c67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:473:0x09eb A[Catch:{ all -> 0x0c0f, all -> 0x0c05, NameNotFoundException -> 0x0573, all -> 0x056a, all -> 0x0c67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:480:0x0a12 A[Catch:{ all -> 0x0c0f, all -> 0x0c05, NameNotFoundException -> 0x0573, all -> 0x056a, all -> 0x0c67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:483:0x0a20 A[Catch:{ all -> 0x0c0f, all -> 0x0c05, NameNotFoundException -> 0x0573, all -> 0x056a, all -> 0x0c67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:484:0x0a22 A[Catch:{ all -> 0x0c0f, all -> 0x0c05, NameNotFoundException -> 0x0573, all -> 0x056a, all -> 0x0c67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:487:0x0a5d A[Catch:{ all -> 0x0c0f, all -> 0x0c05, NameNotFoundException -> 0x0573, all -> 0x056a, all -> 0x0c67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:528:0x0c21 A[Catch:{ all -> 0x0c0f, all -> 0x0c05, NameNotFoundException -> 0x0573, all -> 0x056a, all -> 0x0c67 }] */
    /* JADX WARNING: Removed duplicated region for block: B:531:0x0c3d A[Catch:{ all -> 0x0c0f, all -> 0x0c05, NameNotFoundException -> 0x0573, all -> 0x056a, all -> 0x0c67 }] */
    /* renamed from: ˋ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.Object> mo23710(com.appsflyer.internal.C8772h r30) {
        /*
            r29 = this;
            r1 = r29
            r2 = r30
            java.lang.String r3 = "prev_event_name"
            java.lang.String r4 = "AppsFlyer_4.10.3"
            java.lang.String r5 = "preInstallName"
            android.content.Context r6 = r2.f22720
            if (r6 == 0) goto L_0x000f
            goto L_0x001b
        L_0x000f:
            java.lang.ref.WeakReference<android.content.Context> r6 = r2.f22721
            if (r6 == 0) goto L_0x001a
            java.lang.Object r6 = r6.get()
            android.content.Context r6 = (android.content.Context) r6
            goto L_0x001b
        L_0x001a:
            r6 = 0
        L_0x001b:
            java.lang.String r8 = r2.f22726
            java.lang.String r9 = r2.f22715
            org.json.JSONObject r10 = new org.json.JSONObject
            java.util.Map<java.lang.String, java.lang.Object> r11 = r2.f22727
            if (r11 != 0) goto L_0x002a
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
        L_0x002a:
            r10.<init>(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = r2.f22725
            android.content.Context r12 = r6.getApplicationContext()
            java.lang.String r13 = "appsflyer-data"
            r14 = 0
            android.content.SharedPreferences r12 = r12.getSharedPreferences(r13, r14)
            boolean r15 = r2.f22713
            android.content.Intent r14 = r2.f22716
            java.lang.String r2 = r2.f22712
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            com.appsflyer.internal.C8785p.m20753(r6, r7)
            java.util.Date r16 = new java.util.Date
            r16.<init>()
            r17 = r10
            r18 = r11
            long r10 = r16.getTime()
            r16 = r2
            java.lang.String r2 = java.lang.Long.toString(r10)
            r19 = r14
            java.lang.String r14 = "af_timestamp"
            r7.put(r14, r2)
            java.lang.String r2 = com.appsflyer.internal.C8762b.m20709(r6, r10)
            if (r2 == 0) goto L_0x0071
            java.lang.String r10 = "cksm_v1"
            r7.put(r10, r2)
        L_0x0071:
            boolean r2 = r29.isTrackingStopped()     // Catch:{ all -> 0x0c69 }
            if (r2 != 0) goto L_0x008f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c69 }
            java.lang.String r10 = "******* sendTrackingWithEvent: "
            r2.<init>(r10)     // Catch:{ all -> 0x0c69 }
            if (r15 == 0) goto L_0x0083
            java.lang.String r10 = "Launch"
            goto L_0x0084
        L_0x0083:
            r10 = r9
        L_0x0084:
            r2.append(r10)     // Catch:{ all -> 0x0c69 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0c69 }
            com.appsflyer.AFLogger.afInfoLog(r2)     // Catch:{ all -> 0x0c69 }
            goto L_0x0094
        L_0x008f:
            java.lang.String r2 = "SDK tracking has been stopped"
            com.appsflyer.AFLogger.afInfoLog(r2)     // Catch:{ all -> 0x0c69 }
        L_0x0094:
            java.lang.String r2 = "EVENT_CREATED_WITH_NAME"
            if (r15 == 0) goto L_0x009b
            java.lang.String r10 = "Launch"
            goto L_0x009c
        L_0x009b:
            r10 = r9
        L_0x009c:
            m20605(r6, r4, r2, r10)     // Catch:{ all -> 0x0c69 }
            com.appsflyer.internal.C8800w.m20769()     // Catch:{ all -> 0x0c69 }
            java.io.File r2 = com.appsflyer.internal.C8800w.m20767(r6)     // Catch:{ Exception -> 0x00b4 }
            boolean r2 = r2.exists()     // Catch:{ Exception -> 0x00b4 }
            if (r2 != 0) goto L_0x00b9
            java.io.File r2 = com.appsflyer.internal.C8800w.m20767(r6)     // Catch:{ Exception -> 0x00b4 }
            r2.mkdir()     // Catch:{ Exception -> 0x00b4 }
            goto L_0x00b9
        L_0x00b4:
            java.lang.String r2 = "Could not create cache directory"
            android.util.Log.i(r4, r2)     // Catch:{ all -> 0x0c69 }
        L_0x00b9:
            android.content.pm.PackageManager r2 = r6.getPackageManager()     // Catch:{ Exception -> 0x00fb }
            java.lang.String r10 = r6.getPackageName()     // Catch:{ Exception -> 0x00fb }
            r11 = 4096(0x1000, float:5.74E-42)
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r10, r11)     // Catch:{ Exception -> 0x00fb }
            java.lang.String[] r2 = r2.requestedPermissions     // Catch:{ Exception -> 0x00fb }
            java.util.List r2 = java.util.Arrays.asList(r2)     // Catch:{ Exception -> 0x00fb }
            java.lang.String r10 = "android.permission.INTERNET"
            boolean r10 = r2.contains(r10)     // Catch:{ Exception -> 0x00fb }
            if (r10 != 0) goto L_0x00e0
            java.lang.String r10 = "Permission android.permission.INTERNET is missing in the AndroidManifest.xml"
            com.appsflyer.AFLogger.afWarnLog(r10)     // Catch:{ Exception -> 0x00fb }
            java.lang.String r10 = "PERMISSION_INTERNET_MISSING"
            r11 = 0
            m20605(r6, r11, r10, r11)     // Catch:{ Exception -> 0x00fb }
        L_0x00e0:
            java.lang.String r10 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r10 = r2.contains(r10)     // Catch:{ Exception -> 0x00fb }
            if (r10 != 0) goto L_0x00ed
            java.lang.String r10 = "Permission android.permission.ACCESS_NETWORK_STATE is missing in the AndroidManifest.xml"
            com.appsflyer.AFLogger.afWarnLog(r10)     // Catch:{ Exception -> 0x00fb }
        L_0x00ed:
            java.lang.String r10 = "android.permission.ACCESS_WIFI_STATE"
            boolean r2 = r2.contains(r10)     // Catch:{ Exception -> 0x00fb }
            if (r2 != 0) goto L_0x0102
            java.lang.String r2 = "Permission android.permission.ACCESS_WIFI_STATE is missing in the AndroidManifest.xml"
            com.appsflyer.AFLogger.afWarnLog(r2)     // Catch:{ Exception -> 0x00fb }
            goto L_0x0102
        L_0x00fb:
            r0 = move-exception
            r2 = r0
            java.lang.String r10 = "Exception while validation permissions. "
            com.appsflyer.AFLogger.afErrorLog(r10, r2)     // Catch:{ all -> 0x0c69 }
        L_0x0102:
            java.lang.String r2 = "af_events_api"
            java.lang.String r10 = "1"
            r7.put(r2, r10)     // Catch:{ all -> 0x0c69 }
            java.lang.String r2 = "brand"
            java.lang.String r10 = android.os.Build.BRAND     // Catch:{ all -> 0x0c69 }
            r7.put(r2, r10)     // Catch:{ all -> 0x0c69 }
            java.lang.String r2 = "device"
            java.lang.String r10 = android.os.Build.DEVICE     // Catch:{ all -> 0x0c69 }
            r7.put(r2, r10)     // Catch:{ all -> 0x0c69 }
            java.lang.String r2 = "product"
            java.lang.String r10 = android.os.Build.PRODUCT     // Catch:{ all -> 0x0c69 }
            r7.put(r2, r10)     // Catch:{ all -> 0x0c69 }
            java.lang.String r2 = "sdk"
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0c69 }
            java.lang.String r10 = java.lang.Integer.toString(r10)     // Catch:{ all -> 0x0c69 }
            r7.put(r2, r10)     // Catch:{ all -> 0x0c69 }
            java.lang.String r2 = "model"
            java.lang.String r10 = android.os.Build.MODEL     // Catch:{ all -> 0x0c69 }
            r7.put(r2, r10)     // Catch:{ all -> 0x0c69 }
            java.lang.String r2 = "deviceType"
            java.lang.String r10 = android.os.Build.TYPE     // Catch:{ all -> 0x0c69 }
            r7.put(r2, r10)     // Catch:{ all -> 0x0c69 }
            java.lang.String r2 = "window"
            java.lang.Object r2 = r6.getSystemService(r2)     // Catch:{ all -> 0x0c69 }
            android.view.WindowManager r2 = (android.view.WindowManager) r2     // Catch:{ all -> 0x0c69 }
            java.lang.String r11 = ""
            r10 = 1
            if (r2 == 0) goto L_0x0168
            android.view.Display r2 = r2.getDefaultDisplay()     // Catch:{ all -> 0x0c69 }
            int r2 = r2.getRotation()     // Catch:{ all -> 0x0c69 }
            if (r2 == 0) goto L_0x0161
            if (r2 == r10) goto L_0x015e
            r10 = 2
            if (r2 == r10) goto L_0x015b
            r10 = 3
            if (r2 == r10) goto L_0x0158
            r2 = r11
            goto L_0x0163
        L_0x0158:
            java.lang.String r2 = "lr"
            goto L_0x0163
        L_0x015b:
            java.lang.String r2 = "pr"
            goto L_0x0163
        L_0x015e:
            java.lang.String r2 = "l"
            goto L_0x0163
        L_0x0161:
            java.lang.String r2 = "p"
        L_0x0163:
            java.lang.String r10 = "sc_o"
            r7.put(r10, r2)     // Catch:{ all -> 0x0c69 }
        L_0x0168:
            r2 = r11
            java.lang.String r10 = "appsFlyerCount"
            if (r15 == 0) goto L_0x022a
            android.content.Context r3 = r6.getApplicationContext()     // Catch:{ all -> 0x0c69 }
            r11 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r13, r11)     // Catch:{ all -> 0x0c69 }
            boolean r3 = r3.contains(r10)     // Catch:{ all -> 0x0c69 }
            r11 = 1
            r3 = r3 ^ r11
            if (r3 == 0) goto L_0x0198
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c69 }
            boolean r3 = r3.isOtherSdkStringDisabled()     // Catch:{ all -> 0x0c69 }
            if (r3 != 0) goto L_0x0195
            float r3 = m20597(r6)     // Catch:{ all -> 0x0c69 }
            java.lang.String r11 = "batteryLevel"
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0c69 }
            r7.put(r11, r3)     // Catch:{ all -> 0x0c69 }
        L_0x0195:
            m20643(r6)     // Catch:{ all -> 0x0c69 }
        L_0x0198:
            java.lang.String r3 = "timepassedsincelastlaunch"
            android.content.Context r11 = r6.getApplicationContext()     // Catch:{ all -> 0x0c69 }
            r22 = r4
            r4 = 0
            android.content.SharedPreferences r11 = r11.getSharedPreferences(r13, r4)     // Catch:{ all -> 0x0c69 }
            java.lang.String r4 = "AppsFlyerTimePassedSincePrevLaunch"
            r24 = r14
            r23 = r15
            r14 = 0
            long r25 = r11.getLong(r4, r14)     // Catch:{ all -> 0x0c69 }
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0c69 }
            java.lang.String r4 = "AppsFlyerTimePassedSincePrevLaunch"
            m20644(r6, r4, r14)     // Catch:{ all -> 0x0c69 }
            r20 = 0
            int r4 = (r25 > r20 ? 1 : (r25 == r20 ? 0 : -1))
            if (r4 <= 0) goto L_0x01c7
            long r14 = r14 - r25
            r25 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 / r25
            goto L_0x01c9
        L_0x01c7:
            r14 = -1
        L_0x01c9:
            java.lang.String r4 = java.lang.Long.toString(r14)     // Catch:{ all -> 0x0c69 }
            r7.put(r3, r4)     // Catch:{ all -> 0x0c69 }
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c69 }
            java.lang.String r4 = "oneLinkSlug"
            java.lang.String r3 = r3.getString(r4)     // Catch:{ all -> 0x0c69 }
            if (r3 == 0) goto L_0x01f0
            java.lang.String r4 = "onelink_id"
            r7.put(r4, r3)     // Catch:{ all -> 0x0c69 }
            java.lang.String r3 = "ol_ver"
            com.appsflyer.AppsFlyerProperties r4 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c69 }
            java.lang.String r11 = "onelinkVersion"
            java.lang.String r4 = r4.getString(r11)     // Catch:{ all -> 0x0c69 }
            r7.put(r3, r4)     // Catch:{ all -> 0x0c69 }
        L_0x01f0:
            java.lang.String r3 = "appsflyerGetConversionDataTiming"
            r14 = 0
            long r3 = r12.getLong(r3, r14)     // Catch:{ all -> 0x0c69 }
            int r11 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r11 <= 0) goto L_0x0213
            java.lang.String r11 = "gcd_timing"
            java.lang.String r3 = java.lang.Long.toString(r3)     // Catch:{ all -> 0x0c69 }
            r7.put(r11, r3)     // Catch:{ all -> 0x0c69 }
            java.lang.String r3 = "appsflyerGetConversionDataTiming"
            android.content.SharedPreferences$Editor r4 = r12.edit()     // Catch:{ all -> 0x0c69 }
            r14 = 0
            r4.putLong(r3, r14)     // Catch:{ all -> 0x0c69 }
            r4.apply()     // Catch:{ all -> 0x0c69 }
        L_0x0213:
            java.lang.String r3 = r1.f22556     // Catch:{ all -> 0x0c69 }
            if (r3 == 0) goto L_0x021e
            java.lang.String r3 = "phone"
            java.lang.String r4 = r1.f22556     // Catch:{ all -> 0x0c69 }
            r7.put(r3, r4)     // Catch:{ all -> 0x0c69 }
        L_0x021e:
            r25 = r2
            r27 = r5
            r28 = r6
            r26 = r12
            r2 = r17
            goto L_0x02cf
        L_0x022a:
            r22 = r4
            r24 = r14
            r23 = r15
            android.content.Context r4 = r6.getApplicationContext()     // Catch:{ all -> 0x0c69 }
            r11 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r13, r11)     // Catch:{ all -> 0x0c69 }
            android.content.SharedPreferences$Editor r11 = r4.edit()     // Catch:{ all -> 0x0c69 }
            r14 = 0
            java.lang.String r15 = r4.getString(r3, r14)     // Catch:{ Exception -> 0x02be }
            if (r15 == 0) goto L_0x0296
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ Exception -> 0x0289 }
            r14.<init>()     // Catch:{ Exception -> 0x0289 }
            r25 = r2
            java.lang.String r2 = "prev_event_timestamp"
            r26 = r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0281 }
            r12.<init>()     // Catch:{ Exception -> 0x0281 }
            java.lang.String r1 = "prev_event_timestamp"
            r27 = r5
            r28 = r6
            r5 = -1
            long r5 = r4.getLong(r1, r5)     // Catch:{ Exception -> 0x027f }
            r12.append(r5)     // Catch:{ Exception -> 0x027f }
            java.lang.String r1 = r12.toString()     // Catch:{ Exception -> 0x027f }
            r14.put(r2, r1)     // Catch:{ Exception -> 0x027f }
            java.lang.String r1 = "prev_event_value"
            java.lang.String r2 = "prev_event_value"
            r5 = 0
            java.lang.String r2 = r4.getString(r2, r5)     // Catch:{ Exception -> 0x027f }
            r14.put(r1, r2)     // Catch:{ Exception -> 0x027f }
            r14.put(r3, r15)     // Catch:{ Exception -> 0x027f }
            java.lang.String r1 = "prev_event"
            r7.put(r1, r14)     // Catch:{ Exception -> 0x027f }
            goto L_0x029e
        L_0x027f:
            r0 = move-exception
            goto L_0x0292
        L_0x0281:
            r0 = move-exception
            r27 = r5
            r28 = r6
            goto L_0x0292
        L_0x0287:
            r0 = move-exception
            goto L_0x028c
        L_0x0289:
            r0 = move-exception
            r25 = r2
        L_0x028c:
            r27 = r5
            r28 = r6
            r26 = r12
        L_0x0292:
            r1 = r0
            r2 = r17
            goto L_0x02ca
        L_0x0296:
            r25 = r2
            r27 = r5
            r28 = r6
            r26 = r12
        L_0x029e:
            r11.putString(r3, r9)     // Catch:{ Exception -> 0x02b7 }
            java.lang.String r1 = "prev_event_value"
            r2 = r17
            r11.putString(r1, r2)     // Catch:{ Exception -> 0x02b5 }
            java.lang.String r1 = "prev_event_timestamp"
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x02b5 }
            r11.putLong(r1, r3)     // Catch:{ Exception -> 0x02b5 }
            r11.apply()     // Catch:{ Exception -> 0x02b5 }
            goto L_0x02cf
        L_0x02b5:
            r0 = move-exception
            goto L_0x02c9
        L_0x02b7:
            r0 = move-exception
            goto L_0x02c7
        L_0x02b9:
            r0 = move-exception
            r2 = r29
            goto L_0x0c6b
        L_0x02be:
            r0 = move-exception
            r25 = r2
            r27 = r5
            r28 = r6
            r26 = r12
        L_0x02c7:
            r2 = r17
        L_0x02c9:
            r1 = r0
        L_0x02ca:
            java.lang.String r3 = "Error while processing previous event."
            com.appsflyer.AFLogger.afErrorLog(r3, r1)     // Catch:{ all -> 0x02b9 }
        L_0x02cf:
            java.lang.String r1 = "KSAppsFlyerId"
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x02b9 }
            java.lang.String r1 = r3.getString(r1)     // Catch:{ all -> 0x02b9 }
            java.lang.String r3 = "KSAppsFlyerRICounter"
            com.appsflyer.AppsFlyerProperties r4 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x02b9 }
            java.lang.String r3 = r4.getString(r3)     // Catch:{ all -> 0x02b9 }
            if (r1 == 0) goto L_0x02fb
            if (r3 == 0) goto L_0x02fb
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x02b9 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x02b9 }
            if (r4 <= 0) goto L_0x02fb
            java.lang.String r4 = "reinstallCounter"
            r7.put(r4, r3)     // Catch:{ all -> 0x02b9 }
            java.lang.String r3 = "originalAppsflyerId"
            r7.put(r3, r1)     // Catch:{ all -> 0x02b9 }
        L_0x02fb:
            java.lang.String r1 = "additionalCustomData"
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x02b9 }
            java.lang.String r1 = r3.getString(r1)     // Catch:{ all -> 0x02b9 }
            if (r1 == 0) goto L_0x030c
            java.lang.String r3 = "customData"
            r7.put(r3, r1)     // Catch:{ all -> 0x02b9 }
        L_0x030c:
            android.content.pm.PackageManager r1 = r28.getPackageManager()     // Catch:{ Exception -> 0x0320 }
            java.lang.String r3 = r28.getPackageName()     // Catch:{ Exception -> 0x0320 }
            java.lang.String r1 = r1.getInstallerPackageName(r3)     // Catch:{ Exception -> 0x0320 }
            if (r1 == 0) goto L_0x0327
            java.lang.String r3 = "installer_package"
            r7.put(r3, r1)     // Catch:{ Exception -> 0x0320 }
            goto L_0x0327
        L_0x0320:
            r0 = move-exception
            r1 = r0
            java.lang.String r3 = "Exception while getting the app's installer package. "
            com.appsflyer.AFLogger.afErrorLog(r3, r1)     // Catch:{ all -> 0x02b9 }
        L_0x0327:
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x02b9 }
            java.lang.String r3 = "sdkExtension"
            java.lang.String r1 = r1.getString(r3)     // Catch:{ all -> 0x02b9 }
            if (r1 == 0) goto L_0x033e
            int r3 = r1.length()     // Catch:{ all -> 0x02b9 }
            if (r3 <= 0) goto L_0x033e
            java.lang.String r3 = "sdkExtension"
            r7.put(r3, r1)     // Catch:{ all -> 0x02b9 }
        L_0x033e:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x02b9 }
            r6 = r28
            r1.<init>(r6)     // Catch:{ all -> 0x02b9 }
            java.lang.String r1 = m20640(r1)     // Catch:{ all -> 0x02b9 }
            java.lang.String r3 = m20595(r6, r1)     // Catch:{ all -> 0x02b9 }
            if (r3 == 0) goto L_0x0354
            java.lang.String r4 = "channel"
            r7.put(r4, r3)     // Catch:{ all -> 0x02b9 }
        L_0x0354:
            if (r3 == 0) goto L_0x035c
            boolean r4 = r3.equals(r1)     // Catch:{ all -> 0x02b9 }
            if (r4 == 0) goto L_0x0360
        L_0x035c:
            if (r3 != 0) goto L_0x0365
            if (r1 == 0) goto L_0x0365
        L_0x0360:
            java.lang.String r3 = "af_latestchannel"
            r7.put(r3, r1)     // Catch:{ all -> 0x02b9 }
        L_0x0365:
            android.content.Context r1 = r6.getApplicationContext()     // Catch:{ all -> 0x02b9 }
            r3 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r13, r3)     // Catch:{ all -> 0x02b9 }
            java.lang.String r3 = "INSTALL_STORE"
            boolean r3 = r1.contains(r3)     // Catch:{ all -> 0x02b9 }
            if (r3 == 0) goto L_0x037e
            java.lang.String r3 = "INSTALL_STORE"
            r4 = 0
            java.lang.String r1 = r1.getString(r3, r4)     // Catch:{ all -> 0x02b9 }
            goto L_0x039a
        L_0x037e:
            android.content.Context r1 = r6.getApplicationContext()     // Catch:{ all -> 0x02b9 }
            r3 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r13, r3)     // Catch:{ all -> 0x02b9 }
            boolean r1 = r1.contains(r10)     // Catch:{ all -> 0x02b9 }
            r3 = 1
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x0394
            java.lang.String r1 = m20648(r6)     // Catch:{ all -> 0x02b9 }
            goto L_0x0395
        L_0x0394:
            r1 = 0
        L_0x0395:
            java.lang.String r3 = "INSTALL_STORE"
            m20604(r6, r3, r1)     // Catch:{ all -> 0x02b9 }
        L_0x039a:
            if (r1 == 0) goto L_0x03a5
            java.lang.String r3 = "af_installstore"
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ all -> 0x02b9 }
            r7.put(r3, r1)     // Catch:{ all -> 0x02b9 }
        L_0x03a5:
            android.content.Context r1 = r6.getApplicationContext()     // Catch:{ all -> 0x02b9 }
            r3 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r13, r3)     // Catch:{ all -> 0x02b9 }
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x02b9 }
            r4 = r27
            java.lang.String r3 = r3.getString(r4)     // Catch:{ all -> 0x02b9 }
            if (r3 != 0) goto L_0x0462
            boolean r5 = r1.contains(r4)     // Catch:{ all -> 0x02b9 }
            if (r5 == 0) goto L_0x03c8
            r3 = 0
            java.lang.String r1 = r1.getString(r4, r3)     // Catch:{ all -> 0x02b9 }
            r3 = r1
            goto L_0x0459
        L_0x03c8:
            android.content.Context r1 = r6.getApplicationContext()     // Catch:{ all -> 0x02b9 }
            r5 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r13, r5)     // Catch:{ all -> 0x02b9 }
            boolean r1 = r1.contains(r10)     // Catch:{ all -> 0x02b9 }
            r5 = 1
            r1 = r1 ^ r5
            if (r1 == 0) goto L_0x0454
            java.lang.String r1 = "ro.appsflyer.preinstall.path"
            java.lang.String r1 = m20626(r1)     // Catch:{ all -> 0x02b9 }
            java.io.File r1 = m20599(r1)     // Catch:{ all -> 0x02b9 }
            if (r1 == 0) goto L_0x03ee
            boolean r3 = r1.exists()     // Catch:{ all -> 0x02b9 }
            if (r3 != 0) goto L_0x03ec
            goto L_0x03ee
        L_0x03ec:
            r3 = 0
            goto L_0x03ef
        L_0x03ee:
            r3 = 1
        L_0x03ef:
            if (r3 == 0) goto L_0x0403
            java.lang.String r1 = "AF_PRE_INSTALL_PATH"
            android.content.pm.PackageManager r3 = r6.getPackageManager()     // Catch:{ all -> 0x02b9 }
            java.lang.String r5 = r6.getPackageName()     // Catch:{ all -> 0x02b9 }
            java.lang.String r1 = m20615(r1, r3, r5)     // Catch:{ all -> 0x02b9 }
            java.io.File r1 = m20599(r1)     // Catch:{ all -> 0x02b9 }
        L_0x0403:
            if (r1 == 0) goto L_0x040e
            boolean r3 = r1.exists()     // Catch:{ all -> 0x02b9 }
            if (r3 != 0) goto L_0x040c
            goto L_0x040e
        L_0x040c:
            r3 = 0
            goto L_0x040f
        L_0x040e:
            r3 = 1
        L_0x040f:
            if (r3 == 0) goto L_0x0417
            java.lang.String r1 = "/data/local/tmp/pre_install.appsflyer"
            java.io.File r1 = m20599(r1)     // Catch:{ all -> 0x02b9 }
        L_0x0417:
            if (r1 == 0) goto L_0x0422
            boolean r3 = r1.exists()     // Catch:{ all -> 0x02b9 }
            if (r3 != 0) goto L_0x0420
            goto L_0x0422
        L_0x0420:
            r3 = 0
            goto L_0x0423
        L_0x0422:
            r3 = 1
        L_0x0423:
            if (r3 == 0) goto L_0x042b
            java.lang.String r1 = "/etc/pre_install.appsflyer"
            java.io.File r1 = m20599(r1)     // Catch:{ all -> 0x02b9 }
        L_0x042b:
            if (r1 == 0) goto L_0x0436
            boolean r3 = r1.exists()     // Catch:{ all -> 0x02b9 }
            if (r3 != 0) goto L_0x0434
            goto L_0x0436
        L_0x0434:
            r3 = 0
            goto L_0x0437
        L_0x0436:
            r3 = 1
        L_0x0437:
            if (r3 != 0) goto L_0x0445
            java.lang.String r3 = r6.getPackageName()     // Catch:{ all -> 0x02b9 }
            java.lang.String r1 = m20609(r1, r3)     // Catch:{ all -> 0x02b9 }
            if (r1 == 0) goto L_0x0445
            r3 = r1
            goto L_0x0446
        L_0x0445:
            r3 = 0
        L_0x0446:
            if (r3 == 0) goto L_0x0449
            goto L_0x0454
        L_0x0449:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x02b9 }
            r1.<init>(r6)     // Catch:{ all -> 0x02b9 }
            java.lang.String r3 = "AF_PRE_INSTALL_NAME"
            java.lang.String r3 = m20600(r1, r3)     // Catch:{ all -> 0x02b9 }
        L_0x0454:
            if (r3 == 0) goto L_0x0459
            m20604(r6, r4, r3)     // Catch:{ all -> 0x02b9 }
        L_0x0459:
            if (r3 == 0) goto L_0x0462
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x02b9 }
            r1.set(r4, r3)     // Catch:{ all -> 0x02b9 }
        L_0x0462:
            if (r3 == 0) goto L_0x046d
            java.lang.String r1 = "af_preinstall_name"
            java.lang.String r3 = r3.toLowerCase()     // Catch:{ all -> 0x02b9 }
            r7.put(r1, r3)     // Catch:{ all -> 0x02b9 }
        L_0x046d:
            java.lang.String r1 = m20648(r6)     // Catch:{ all -> 0x02b9 }
            if (r1 == 0) goto L_0x047c
            java.lang.String r3 = "af_currentstore"
            java.lang.String r1 = r1.toLowerCase()     // Catch:{ all -> 0x02b9 }
            r7.put(r3, r1)     // Catch:{ all -> 0x02b9 }
        L_0x047c:
            java.lang.String r1 = "appsflyerKey"
            if (r8 == 0) goto L_0x048a
            int r3 = r8.length()     // Catch:{ all -> 0x02b9 }
            if (r3 <= 0) goto L_0x048a
            r7.put(r1, r8)     // Catch:{ all -> 0x02b9 }
            goto L_0x049f
        L_0x048a:
            java.lang.String r3 = "AppsFlyerKey"
            com.appsflyer.AppsFlyerProperties r4 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x02b9 }
            java.lang.String r3 = r4.getString(r3)     // Catch:{ all -> 0x02b9 }
            if (r3 == 0) goto L_0x0c52
            int r4 = r3.length()     // Catch:{ all -> 0x02b9 }
            if (r4 <= 0) goto L_0x0c52
            r7.put(r1, r3)     // Catch:{ all -> 0x02b9 }
        L_0x049f:
            java.lang.String r3 = "AppUserId"
            com.appsflyer.AppsFlyerProperties r4 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x02b9 }
            java.lang.String r3 = r4.getString(r3)     // Catch:{ all -> 0x02b9 }
            if (r3 == 0) goto L_0x04b0
            java.lang.String r4 = "appUserId"
            r7.put(r4, r3)     // Catch:{ all -> 0x02b9 }
        L_0x04b0:
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x02b9 }
            java.lang.String r4 = "userEmails"
            java.lang.String r3 = r3.getString(r4)     // Catch:{ all -> 0x02b9 }
            if (r3 == 0) goto L_0x04c2
            java.lang.String r4 = "user_emails"
            r7.put(r4, r3)     // Catch:{ all -> 0x02b9 }
            goto L_0x04d7
        L_0x04c2:
            java.lang.String r3 = "userEmail"
            com.appsflyer.AppsFlyerProperties r4 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x02b9 }
            java.lang.String r3 = r4.getString(r3)     // Catch:{ all -> 0x02b9 }
            if (r3 == 0) goto L_0x04d7
            java.lang.String r4 = "sha1_el"
            java.lang.String r3 = com.appsflyer.internal.C8757ad.m20697(r3)     // Catch:{ all -> 0x02b9 }
            r7.put(r4, r3)     // Catch:{ all -> 0x02b9 }
        L_0x04d7:
            if (r9 == 0) goto L_0x04e5
            java.lang.String r3 = "eventName"
            r7.put(r3, r9)     // Catch:{ all -> 0x02b9 }
            if (r2 == 0) goto L_0x04e5
            java.lang.String r3 = "eventValue"
            r7.put(r3, r2)     // Catch:{ all -> 0x02b9 }
        L_0x04e5:
            java.lang.String r2 = "appid"
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x02b9 }
            java.lang.String r2 = r3.getString(r2)     // Catch:{ all -> 0x02b9 }
            if (r2 == 0) goto L_0x0500
            java.lang.String r2 = "appid"
            java.lang.String r3 = "appid"
            com.appsflyer.AppsFlyerProperties r4 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x02b9 }
            java.lang.String r3 = r4.getString(r3)     // Catch:{ all -> 0x02b9 }
            r7.put(r2, r3)     // Catch:{ all -> 0x02b9 }
        L_0x0500:
            java.lang.String r2 = "currencyCode"
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x02b9 }
            java.lang.String r2 = r3.getString(r2)     // Catch:{ all -> 0x02b9 }
            if (r2 == 0) goto L_0x052e
            int r3 = r2.length()     // Catch:{ all -> 0x02b9 }
            r4 = 3
            if (r3 == r4) goto L_0x0529
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x02b9 }
            java.lang.String r4 = "WARNING: currency code should be 3 characters!!! '"
            r3.<init>(r4)     // Catch:{ all -> 0x02b9 }
            r3.append(r2)     // Catch:{ all -> 0x02b9 }
            java.lang.String r4 = "' is not a legal value."
            r3.append(r4)     // Catch:{ all -> 0x02b9 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x02b9 }
            com.appsflyer.AFLogger.afWarnLog(r3)     // Catch:{ all -> 0x02b9 }
        L_0x0529:
            java.lang.String r3 = "currency"
            r7.put(r3, r2)     // Catch:{ all -> 0x02b9 }
        L_0x052e:
            java.lang.String r2 = "IS_UPDATE"
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x02b9 }
            java.lang.String r2 = r3.getString(r2)     // Catch:{ all -> 0x02b9 }
            if (r2 == 0) goto L_0x053f
            java.lang.String r3 = "isUpdate"
            r7.put(r3, r2)     // Catch:{ all -> 0x02b9 }
        L_0x053f:
            r2 = r29
            boolean r3 = r2.isPreInstalledApp(r6)     // Catch:{ all -> 0x0c67 }
            java.lang.String r4 = "af_preinstalled"
            java.lang.String r3 = java.lang.Boolean.toString(r3)     // Catch:{ all -> 0x0c67 }
            r7.put(r4, r3)     // Catch:{ all -> 0x0c67 }
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c67 }
            java.lang.String r4 = "collectFacebookAttrId"
            r5 = 1
            boolean r3 = r3.getBoolean(r4, r5)     // Catch:{ all -> 0x0c67 }
            if (r3 == 0) goto L_0x0580
            android.content.pm.PackageManager r3 = r6.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0573, all -> 0x056a }
            java.lang.String r4 = "com.facebook.katana"
            r5 = 0
            r3.getApplicationInfo(r4, r5)     // Catch:{ NameNotFoundException -> 0x0573, all -> 0x056a }
            java.lang.String r3 = r2.getAttributionId(r6)     // Catch:{ NameNotFoundException -> 0x0573, all -> 0x056a }
            goto L_0x0579
        L_0x056a:
            r0 = move-exception
            r3 = r0
            java.lang.String r4 = "Exception while collecting facebook's attribution ID. "
            com.appsflyer.AFLogger.afErrorLog(r4, r3)     // Catch:{ all -> 0x0c67 }
        L_0x0571:
            r3 = 0
            goto L_0x0579
        L_0x0573:
            java.lang.String r3 = "Exception while collecting facebook's attribution ID. "
            com.appsflyer.AFLogger.afWarnLog(r3)     // Catch:{ all -> 0x0c67 }
            goto L_0x0571
        L_0x0579:
            if (r3 == 0) goto L_0x0580
            java.lang.String r4 = "fb"
            r7.put(r4, r3)     // Catch:{ all -> 0x0c67 }
        L_0x0580:
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c67 }
            java.lang.String r4 = "deviceTrackingDisabled"
            r5 = 0
            boolean r3 = r3.getBoolean(r4, r5)     // Catch:{ all -> 0x0c67 }
            java.lang.String r4 = "true"
            if (r3 == 0) goto L_0x0596
            java.lang.String r3 = "deviceTrackingDisabled"
            r7.put(r3, r4)     // Catch:{ all -> 0x0c67 }
            goto L_0x06fa
        L_0x0596:
            android.content.Context r3 = r6.getApplicationContext()     // Catch:{ all -> 0x0c67 }
            r5 = 0
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r13, r5)     // Catch:{ all -> 0x0c67 }
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c67 }
            java.lang.String r8 = "collectIMEI"
            r11 = 1
            boolean r5 = r5.getBoolean(r8, r11)     // Catch:{ all -> 0x0c67 }
            java.lang.String r8 = "imeiCached"
            r11 = 0
            java.lang.String r8 = r3.getString(r8, r11)     // Catch:{ all -> 0x0c67 }
            if (r5 == 0) goto L_0x0622
            java.lang.String r5 = r2.f22558     // Catch:{ all -> 0x0c67 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0c67 }
            if (r5 == 0) goto L_0x0622
            boolean r5 = m20594(r6)     // Catch:{ all -> 0x0c67 }
            if (r5 == 0) goto L_0x062a
            java.lang.String r5 = "phone"
            java.lang.Object r5 = r6.getSystemService(r5)     // Catch:{ InvocationTargetException -> 0x060a, Exception -> 0x05f1 }
            android.telephony.TelephonyManager r5 = (android.telephony.TelephonyManager) r5     // Catch:{ InvocationTargetException -> 0x060a, Exception -> 0x05f1 }
            java.lang.Class r11 = r5.getClass()     // Catch:{ InvocationTargetException -> 0x060a, Exception -> 0x05f1 }
            java.lang.String r12 = "getDeviceId"
            r14 = 0
            java.lang.Class[] r15 = new java.lang.Class[r14]     // Catch:{ InvocationTargetException -> 0x060a, Exception -> 0x05f1 }
            java.lang.reflect.Method r11 = r11.getMethod(r12, r15)     // Catch:{ InvocationTargetException -> 0x060a, Exception -> 0x05f1 }
            java.lang.Object[] r12 = new java.lang.Object[r14]     // Catch:{ InvocationTargetException -> 0x060a, Exception -> 0x05f1 }
            java.lang.Object r5 = r11.invoke(r5, r12)     // Catch:{ InvocationTargetException -> 0x060a, Exception -> 0x05f1 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ InvocationTargetException -> 0x060a, Exception -> 0x05f1 }
            if (r5 == 0) goto L_0x05e1
            goto L_0x0628
        L_0x05e1:
            if (r8 == 0) goto L_0x062a
            java.lang.String r5 = "use cached IMEI: "
            java.lang.String r11 = java.lang.String.valueOf(r8)     // Catch:{ InvocationTargetException -> 0x060a, Exception -> 0x05f1 }
            java.lang.String r5 = r5.concat(r11)     // Catch:{ InvocationTargetException -> 0x060a, Exception -> 0x05f1 }
            com.appsflyer.AFLogger.afDebugLog(r5)     // Catch:{ InvocationTargetException -> 0x060a, Exception -> 0x05f1 }
            goto L_0x062b
        L_0x05f1:
            r0 = move-exception
            r5 = r0
            if (r8 == 0) goto L_0x0603
            java.lang.String r11 = "use cached IMEI: "
            java.lang.String r12 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0c67 }
            java.lang.String r11 = r11.concat(r12)     // Catch:{ all -> 0x0c67 }
            com.appsflyer.AFLogger.afDebugLog(r11)     // Catch:{ all -> 0x0c67 }
            goto L_0x0604
        L_0x0603:
            r8 = 0
        L_0x0604:
            java.lang.String r11 = "WARNING: other reason: "
            com.appsflyer.AFLogger.afErrorLog(r11, r5)     // Catch:{ all -> 0x0c67 }
            goto L_0x062b
        L_0x060a:
            if (r8 == 0) goto L_0x061b
            java.lang.String r5 = "use cached IMEI: "
            java.lang.String r11 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0c67 }
            java.lang.String r5 = r5.concat(r11)     // Catch:{ all -> 0x0c67 }
            com.appsflyer.AFLogger.afDebugLog(r5)     // Catch:{ all -> 0x0c67 }
            goto L_0x061c
        L_0x061b:
            r8 = 0
        L_0x061c:
            java.lang.String r5 = "WARNING: READ_PHONE_STATE is missing."
            com.appsflyer.AFLogger.afWarnLog(r5)     // Catch:{ all -> 0x0c67 }
            goto L_0x062b
        L_0x0622:
            java.lang.String r5 = r2.f22558     // Catch:{ all -> 0x0c67 }
            if (r5 == 0) goto L_0x062a
            java.lang.String r5 = r2.f22558     // Catch:{ all -> 0x0c67 }
        L_0x0628:
            r8 = r5
            goto L_0x062b
        L_0x062a:
            r8 = 0
        L_0x062b:
            if (r8 == 0) goto L_0x0638
            java.lang.String r5 = "imeiCached"
            m20604(r6, r5, r8)     // Catch:{ all -> 0x0c67 }
            java.lang.String r5 = "imei"
            r7.put(r5, r8)     // Catch:{ all -> 0x0c67 }
            goto L_0x063d
        L_0x0638:
            java.lang.String r5 = "IMEI was not collected."
            com.appsflyer.AFLogger.afInfoLog(r5)     // Catch:{ all -> 0x0c67 }
        L_0x063d:
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c67 }
            java.lang.String r8 = "collectAndroidId"
            r11 = 1
            boolean r5 = r5.getBoolean(r8, r11)     // Catch:{ all -> 0x0c67 }
            java.lang.String r8 = "androidIdCached"
            r11 = 0
            java.lang.String r8 = r3.getString(r8, r11)     // Catch:{ all -> 0x0c67 }
            if (r5 == 0) goto L_0x069a
            java.lang.String r5 = r2.f22547     // Catch:{ all -> 0x0c67 }
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0c67 }
            if (r5 == 0) goto L_0x069a
            boolean r5 = m20594(r6)     // Catch:{ all -> 0x0c67 }
            if (r5 == 0) goto L_0x06a1
            android.content.ContentResolver r5 = r6.getContentResolver()     // Catch:{ Exception -> 0x067e }
            java.lang.String r11 = "android_id"
            java.lang.String r5 = android.provider.Settings.Secure.getString(r5, r11)     // Catch:{ Exception -> 0x067e }
            if (r5 == 0) goto L_0x066c
            goto L_0x06a2
        L_0x066c:
            if (r8 == 0) goto L_0x067c
            java.lang.String r5 = "use cached AndroidId: "
            java.lang.String r11 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x067e }
            java.lang.String r5 = r5.concat(r11)     // Catch:{ Exception -> 0x067e }
            com.appsflyer.AFLogger.afDebugLog(r5)     // Catch:{ Exception -> 0x067e }
            goto L_0x0698
        L_0x067c:
            r8 = 0
            goto L_0x0698
        L_0x067e:
            r0 = move-exception
            r5 = r0
            if (r8 == 0) goto L_0x0690
            java.lang.String r11 = "use cached AndroidId: "
            java.lang.String r12 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0c67 }
            java.lang.String r11 = r11.concat(r12)     // Catch:{ all -> 0x0c67 }
            com.appsflyer.AFLogger.afDebugLog(r11)     // Catch:{ all -> 0x0c67 }
            goto L_0x0691
        L_0x0690:
            r8 = 0
        L_0x0691:
            java.lang.String r11 = r5.getMessage()     // Catch:{ all -> 0x0c67 }
            com.appsflyer.AFLogger.afErrorLog(r11, r5)     // Catch:{ all -> 0x0c67 }
        L_0x0698:
            r5 = r8
            goto L_0x06a2
        L_0x069a:
            java.lang.String r5 = r2.f22547     // Catch:{ all -> 0x0c67 }
            if (r5 == 0) goto L_0x06a1
            java.lang.String r5 = r2.f22547     // Catch:{ all -> 0x0c67 }
            goto L_0x06a2
        L_0x06a1:
            r5 = 0
        L_0x06a2:
            if (r5 == 0) goto L_0x06af
            java.lang.String r8 = "androidIdCached"
            m20604(r6, r8, r5)     // Catch:{ all -> 0x0c67 }
            java.lang.String r8 = "android_id"
            r7.put(r8, r5)     // Catch:{ all -> 0x0c67 }
            goto L_0x06b4
        L_0x06af:
            java.lang.String r5 = "Android ID was not collected."
            com.appsflyer.AFLogger.afInfoLog(r5)     // Catch:{ all -> 0x0c67 }
        L_0x06b4:
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c67 }
            java.lang.String r8 = "collectOAID"
            r11 = 0
            boolean r5 = r5.getBoolean(r8, r11)     // Catch:{ all -> 0x0c67 }
            java.lang.String r8 = "oaidCached"
            r11 = 0
            java.lang.String r3 = r3.getString(r8, r11)     // Catch:{ all -> 0x0c67 }
            java.lang.String r8 = r2.f22560     // Catch:{ all -> 0x0c67 }
            if (r8 == 0) goto L_0x06cd
            java.lang.String r3 = r2.f22560     // Catch:{ all -> 0x0c67 }
            goto L_0x06ee
        L_0x06cd:
            if (r5 == 0) goto L_0x06ee
            if (r3 != 0) goto L_0x06ee
            boolean r5 = com.appsflyer.internal.C8804z.m20780()     // Catch:{ all -> 0x0c67 }
            if (r5 == 0) goto L_0x06ee
            boolean r5 = com.appsflyer.internal.C8804z.m20782(r6)     // Catch:{ all -> 0x0c67 }
            if (r5 != 0) goto L_0x06ee
            java.lang.String r3 = com.appsflyer.internal.C8804z.m20781(r6)     // Catch:{ all -> 0x0c67 }
            java.lang.String r5 = "OAID was collected: "
            java.lang.String r8 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0c67 }
            java.lang.String r5 = r5.concat(r8)     // Catch:{ all -> 0x0c67 }
            com.appsflyer.AFLogger.afDebugLog(r5)     // Catch:{ all -> 0x0c67 }
        L_0x06ee:
            if (r3 == 0) goto L_0x06fa
            java.lang.String r5 = "oaidCached"
            m20604(r6, r5, r3)     // Catch:{ all -> 0x0c67 }
            java.lang.String r5 = "oaid"
            r7.put(r5, r3)     // Catch:{ all -> 0x0c67 }
        L_0x06fa:
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference     // Catch:{ Exception -> 0x070b }
            r3.<init>(r6)     // Catch:{ Exception -> 0x070b }
            java.lang.String r3 = com.appsflyer.internal.C8753ab.m20687(r3)     // Catch:{ Exception -> 0x070b }
            if (r3 == 0) goto L_0x0722
            java.lang.String r5 = "uid"
            r7.put(r5, r3)     // Catch:{ Exception -> 0x070b }
            goto L_0x0722
        L_0x070b:
            r0 = move-exception
            r3 = r0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c67 }
            java.lang.String r8 = "ERROR: could not get uid "
            r5.<init>(r8)     // Catch:{ all -> 0x0c67 }
            java.lang.String r8 = r3.getMessage()     // Catch:{ all -> 0x0c67 }
            r5.append(r8)     // Catch:{ all -> 0x0c67 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0c67 }
            com.appsflyer.AFLogger.afErrorLog(r5, r3)     // Catch:{ all -> 0x0c67 }
        L_0x0722:
            java.lang.String r3 = "lang"
            java.util.Locale r5 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0730 }
            java.lang.String r5 = r5.getDisplayLanguage()     // Catch:{ Exception -> 0x0730 }
            r7.put(r3, r5)     // Catch:{ Exception -> 0x0730 }
            goto L_0x0737
        L_0x0730:
            r0 = move-exception
            r3 = r0
            java.lang.String r5 = "Exception while collecting display language name. "
            com.appsflyer.AFLogger.afErrorLog(r5, r3)     // Catch:{ all -> 0x0c67 }
        L_0x0737:
            java.lang.String r3 = "lang_code"
            java.util.Locale r5 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0745 }
            java.lang.String r5 = r5.getLanguage()     // Catch:{ Exception -> 0x0745 }
            r7.put(r3, r5)     // Catch:{ Exception -> 0x0745 }
            goto L_0x074c
        L_0x0745:
            r0 = move-exception
            r3 = r0
            java.lang.String r5 = "Exception while collecting display language code. "
            com.appsflyer.AFLogger.afErrorLog(r5, r3)     // Catch:{ all -> 0x0c67 }
        L_0x074c:
            java.lang.String r3 = "country"
            java.util.Locale r5 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x075a }
            java.lang.String r5 = r5.getCountry()     // Catch:{ Exception -> 0x075a }
            r7.put(r3, r5)     // Catch:{ Exception -> 0x075a }
            goto L_0x0761
        L_0x075a:
            r0 = move-exception
            r3 = r0
            java.lang.String r5 = "Exception while collecting country name. "
            com.appsflyer.AFLogger.afErrorLog(r5, r3)     // Catch:{ all -> 0x0c67 }
        L_0x0761:
            java.lang.String r3 = "platformextension"
            com.appsflyer.internal.ac r5 = r2.f22550     // Catch:{ all -> 0x0c67 }
            java.lang.String r5 = r5.mo23776()     // Catch:{ all -> 0x0c67 }
            r7.put(r3, r5)     // Catch:{ all -> 0x0c67 }
            m20631(r6, r7)     // Catch:{ all -> 0x0c67 }
            java.lang.String r3 = "yyyy-MM-dd_HHmmssZ"
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x0c67 }
            java.util.Locale r8 = java.util.Locale.US     // Catch:{ all -> 0x0c67 }
            r5.<init>(r3, r8)     // Catch:{ all -> 0x0c67 }
            android.content.pm.PackageManager r3 = r6.getPackageManager()     // Catch:{ Exception -> 0x079f }
            java.lang.String r8 = r6.getPackageName()     // Catch:{ Exception -> 0x079f }
            r11 = 0
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r8, r11)     // Catch:{ Exception -> 0x079f }
            long r11 = r3.firstInstallTime     // Catch:{ Exception -> 0x079f }
            java.lang.String r3 = "installDate"
            java.lang.String r8 = "UTC"
            java.util.TimeZone r8 = java.util.TimeZone.getTimeZone(r8)     // Catch:{ Exception -> 0x079f }
            r5.setTimeZone(r8)     // Catch:{ Exception -> 0x079f }
            java.util.Date r8 = new java.util.Date     // Catch:{ Exception -> 0x079f }
            r8.<init>(r11)     // Catch:{ Exception -> 0x079f }
            java.lang.String r8 = r5.format(r8)     // Catch:{ Exception -> 0x079f }
            r7.put(r3, r8)     // Catch:{ Exception -> 0x079f }
            goto L_0x07a6
        L_0x079f:
            r0 = move-exception
            r3 = r0
            java.lang.String r8 = "Exception while collecting install date. "
            com.appsflyer.AFLogger.afErrorLog(r8, r3)     // Catch:{ all -> 0x0c67 }
        L_0x07a6:
            android.content.pm.PackageManager r3 = r6.getPackageManager()     // Catch:{ all -> 0x0878 }
            java.lang.String r8 = r6.getPackageName()     // Catch:{ all -> 0x0878 }
            r11 = 0
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r8, r11)     // Catch:{ all -> 0x0878 }
            java.lang.String r8 = "versionCode"
            r12 = r26
            int r8 = r12.getInt(r8, r11)     // Catch:{ all -> 0x0870 }
            int r14 = r3.versionCode     // Catch:{ all -> 0x0870 }
            if (r14 <= r8) goto L_0x07cb
            java.lang.String r8 = "appsflyerConversionDataRequestRetries"
            m20613(r6, r8, r11)     // Catch:{ all -> 0x0870 }
            java.lang.String r8 = "versionCode"
            int r11 = r3.versionCode     // Catch:{ all -> 0x0870 }
            m20613(r6, r8, r11)     // Catch:{ all -> 0x0870 }
        L_0x07cb:
            java.lang.String r8 = "app_version_code"
            int r11 = r3.versionCode     // Catch:{ all -> 0x0870 }
            java.lang.String r11 = java.lang.Integer.toString(r11)     // Catch:{ all -> 0x0870 }
            r7.put(r8, r11)     // Catch:{ all -> 0x0870 }
            java.lang.String r8 = "app_version_name"
            java.lang.String r11 = r3.versionName     // Catch:{ all -> 0x0870 }
            r7.put(r8, r11)     // Catch:{ all -> 0x0870 }
            long r14 = r3.firstInstallTime     // Catch:{ all -> 0x0870 }
            r11 = r9
            long r8 = r3.lastUpdateTime     // Catch:{ all -> 0x0868 }
            java.lang.String r3 = "date1"
            r17 = r1
            java.lang.String r1 = "yyyy-MM-dd_HHmmssZ"
            r22 = r11
            java.text.SimpleDateFormat r11 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x0864 }
            r26 = r4
            java.util.Locale r4 = java.util.Locale.US     // Catch:{ all -> 0x0862 }
            r11.<init>(r1, r4)     // Catch:{ all -> 0x0862 }
            java.util.Date r1 = new java.util.Date     // Catch:{ all -> 0x0862 }
            r1.<init>(r14)     // Catch:{ all -> 0x0862 }
            java.lang.String r1 = r11.format(r1)     // Catch:{ all -> 0x0862 }
            r7.put(r3, r1)     // Catch:{ all -> 0x0862 }
            java.lang.String r1 = "date2"
            java.lang.String r3 = "yyyy-MM-dd_HHmmssZ"
            java.text.SimpleDateFormat r4 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x0862 }
            java.util.Locale r11 = java.util.Locale.US     // Catch:{ all -> 0x0862 }
            r4.<init>(r3, r11)     // Catch:{ all -> 0x0862 }
            java.util.Date r3 = new java.util.Date     // Catch:{ all -> 0x0862 }
            r3.<init>(r8)     // Catch:{ all -> 0x0862 }
            java.lang.String r3 = r4.format(r3)     // Catch:{ all -> 0x0862 }
            r7.put(r1, r3)     // Catch:{ all -> 0x0862 }
            android.content.Context r1 = r6.getApplicationContext()     // Catch:{ all -> 0x0862 }
            r3 = 0
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r13, r3)     // Catch:{ all -> 0x0862 }
            java.lang.String r4 = "appsFlyerFirstInstall"
            r8 = 0
            java.lang.String r1 = r1.getString(r4, r8)     // Catch:{ all -> 0x0862 }
            if (r1 != 0) goto L_0x084f
            android.content.Context r1 = r6.getApplicationContext()     // Catch:{ all -> 0x0862 }
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r13, r3)     // Catch:{ all -> 0x0862 }
            boolean r1 = r1.contains(r10)     // Catch:{ all -> 0x0862 }
            r3 = 1
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x0848
            java.lang.String r1 = "AppsFlyer: first launch detected"
            com.appsflyer.AFLogger.afDebugLog(r1)     // Catch:{ all -> 0x0862 }
            java.util.Date r1 = new java.util.Date     // Catch:{ all -> 0x0862 }
            r1.<init>()     // Catch:{ all -> 0x0862 }
            java.lang.String r11 = r5.format(r1)     // Catch:{ all -> 0x0862 }
            r1 = r11
            goto L_0x084a
        L_0x0848:
            r1 = r25
        L_0x084a:
            java.lang.String r3 = "appsFlyerFirstInstall"
            m20604(r6, r3, r1)     // Catch:{ all -> 0x0862 }
        L_0x084f:
            java.lang.String r3 = "AppsFlyer: first launch date: "
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0862 }
            java.lang.String r3 = r3.concat(r4)     // Catch:{ all -> 0x0862 }
            com.appsflyer.AFLogger.afInfoLog(r3)     // Catch:{ all -> 0x0862 }
            java.lang.String r3 = "firstLaunchDate"
            r7.put(r3, r1)     // Catch:{ all -> 0x0862 }
            goto L_0x0887
        L_0x0862:
            r0 = move-exception
            goto L_0x0881
        L_0x0864:
            r0 = move-exception
            goto L_0x087f
        L_0x0866:
            r0 = move-exception
            goto L_0x086b
        L_0x0868:
            r0 = move-exception
            r17 = r1
        L_0x086b:
            r26 = r4
            r22 = r11
            goto L_0x0881
        L_0x0870:
            r0 = move-exception
            r17 = r1
            r26 = r4
            r22 = r9
            goto L_0x0881
        L_0x0878:
            r0 = move-exception
            r17 = r1
            r22 = r9
            r12 = r26
        L_0x087f:
            r26 = r4
        L_0x0881:
            r1 = r0
            java.lang.String r3 = "Exception while collecting app version data "
            com.appsflyer.AFLogger.afErrorLog(r3, r1)     // Catch:{ all -> 0x0c67 }
        L_0x0887:
            int r1 = r18.length()     // Catch:{ all -> 0x0c67 }
            if (r1 <= 0) goto L_0x0894
            java.lang.String r1 = "referrer"
            r3 = r18
            r7.put(r1, r3)     // Catch:{ all -> 0x0c67 }
        L_0x0894:
            java.lang.String r1 = "extraReferrers"
            r3 = 0
            java.lang.String r1 = r12.getString(r1, r3)     // Catch:{ all -> 0x0c67 }
            if (r1 == 0) goto L_0x08a2
            java.lang.String r3 = "extraReferrers"
            r7.put(r3, r1)     // Catch:{ all -> 0x0c67 }
        L_0x08a2:
            boolean r1 = com.appsflyer.internal.C8775l.C8776a.m20738(r6)     // Catch:{ all -> 0x0c67 }
            r2.f22549 = r1     // Catch:{ all -> 0x0c67 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c67 }
            java.lang.String r3 = "didConfigureTokenRefreshService="
            r1.<init>(r3)     // Catch:{ all -> 0x0c67 }
            boolean r3 = r2.f22549     // Catch:{ all -> 0x0c67 }
            r1.append(r3)     // Catch:{ all -> 0x0c67 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0c67 }
            com.appsflyer.AFLogger.afDebugLog(r1)     // Catch:{ all -> 0x0c67 }
            boolean r1 = r2.f22549     // Catch:{ all -> 0x0c67 }
            if (r1 != 0) goto L_0x08c6
            java.lang.String r1 = "tokenRefreshConfigured"
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0c67 }
            r7.put(r1, r3)     // Catch:{ all -> 0x0c67 }
        L_0x08c6:
            if (r23 == 0) goto L_0x08fa
            com.appsflyer.internal.g r1 = com.appsflyer.internal.C8770g.m20730()     // Catch:{ all -> 0x0c67 }
            r3 = r19
            r1.mo23790(r3, r6, r7)     // Catch:{ all -> 0x0c67 }
            java.lang.String r1 = r2.f22544     // Catch:{ all -> 0x0c67 }
            if (r1 == 0) goto L_0x08ed
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0c67 }
            java.lang.String r3 = r2.f22544     // Catch:{ all -> 0x0c67 }
            r1.<init>(r3)     // Catch:{ all -> 0x0c67 }
            java.lang.String r3 = "isPush"
            r4 = r26
            r1.put(r3, r4)     // Catch:{ all -> 0x0c67 }
            java.lang.String r3 = "af_deeplink"
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0c67 }
            r7.put(r3, r1)     // Catch:{ all -> 0x0c67 }
            goto L_0x08ef
        L_0x08ed:
            r4 = r26
        L_0x08ef:
            r1 = 0
            r2.f22544 = r1     // Catch:{ all -> 0x0c67 }
            java.lang.String r1 = "open_referrer"
            r3 = r16
            r7.put(r1, r3)     // Catch:{ all -> 0x0c67 }
            goto L_0x08fc
        L_0x08fa:
            r4 = r26
        L_0x08fc:
            boolean r1 = r2.f22545     // Catch:{ all -> 0x0c67 }
            if (r1 == 0) goto L_0x0916
            java.lang.String r1 = "testAppMode_retargeting"
            r7.put(r1, r4)     // Catch:{ all -> 0x0c67 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0c67 }
            r1.<init>(r7)     // Catch:{ all -> 0x0c67 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0c67 }
            m20602(r6, r1)     // Catch:{ all -> 0x0c67 }
            java.lang.String r1 = "Sent retargeting params to test app"
            com.appsflyer.AFLogger.afInfoLog(r1)     // Catch:{ all -> 0x0c67 }
        L_0x0916:
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0c67 }
            long r13 = r2.f22543     // Catch:{ all -> 0x0c67 }
            long r8 = r8 - r13
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c67 }
            java.lang.String r1 = r1.getReferrer(r6)     // Catch:{ all -> 0x0c67 }
            r13 = 30000(0x7530, double:1.4822E-319)
            int r3 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
            if (r3 > 0) goto L_0x0937
            if (r1 == 0) goto L_0x0937
            java.lang.String r3 = "AppsFlyer_Test"
            boolean r1 = r1.contains(r3)     // Catch:{ all -> 0x0c67 }
            if (r1 == 0) goto L_0x0937
            r1 = 1
            goto L_0x0938
        L_0x0937:
            r1 = 0
        L_0x0938:
            if (r1 == 0) goto L_0x0959
            java.lang.String r1 = "testAppMode"
            r7.put(r1, r4)     // Catch:{ all -> 0x0c67 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0c67 }
            r1.<init>(r7)     // Catch:{ all -> 0x0c67 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0c67 }
            m20602(r6, r1)     // Catch:{ all -> 0x0c67 }
            java.lang.String r1 = "Sent params to test app"
            com.appsflyer.AFLogger.afInfoLog(r1)     // Catch:{ all -> 0x0c67 }
            java.lang.String r1 = "Test mode ended!"
            com.appsflyer.AFLogger.afInfoLog(r1)     // Catch:{ all -> 0x0c67 }
            r8 = 0
            r2.f22543 = r8     // Catch:{ all -> 0x0c67 }
        L_0x0959:
            java.lang.String r1 = "advertiserId"
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c67 }
            java.lang.String r1 = r3.getString(r1)     // Catch:{ all -> 0x0c67 }
            if (r1 != 0) goto L_0x0981
            com.appsflyer.internal.C8785p.m20753(r6, r7)     // Catch:{ all -> 0x0c67 }
            java.lang.String r1 = "advertiserId"
            com.appsflyer.AppsFlyerProperties r3 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c67 }
            java.lang.String r1 = r3.getString(r1)     // Catch:{ all -> 0x0c67 }
            if (r1 == 0) goto L_0x097a
            java.lang.String r1 = "GAID_retry"
            r7.put(r1, r4)     // Catch:{ all -> 0x0c67 }
            goto L_0x0981
        L_0x097a:
            java.lang.String r1 = "GAID_retry"
            java.lang.String r3 = "false"
            r7.put(r1, r3)     // Catch:{ all -> 0x0c67 }
        L_0x0981:
            android.content.ContentResolver r1 = r6.getContentResolver()     // Catch:{ all -> 0x0c67 }
            com.appsflyer.internal.s r1 = com.appsflyer.internal.C8785p.m20754(r1)     // Catch:{ all -> 0x0c67 }
            if (r1 == 0) goto L_0x099d
            java.lang.String r3 = "amazon_aid"
            java.lang.String r5 = r1.f22770     // Catch:{ all -> 0x0c67 }
            r7.put(r3, r5)     // Catch:{ all -> 0x0c67 }
            java.lang.String r3 = "amazon_aid_limit"
            boolean r1 = r1.f22771     // Catch:{ all -> 0x0c67 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0c67 }
            r7.put(r3, r1)     // Catch:{ all -> 0x0c67 }
        L_0x099d:
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c67 }
            java.lang.String r1 = r1.getReferrer(r6)     // Catch:{ all -> 0x0c67 }
            if (r1 == 0) goto L_0x09ba
            int r3 = r1.length()     // Catch:{ all -> 0x0c67 }
            if (r3 <= 0) goto L_0x09ba
            java.lang.String r3 = "referrer"
            java.lang.Object r3 = r7.get(r3)     // Catch:{ all -> 0x0c67 }
            if (r3 != 0) goto L_0x09ba
            java.lang.String r3 = "referrer"
            r7.put(r3, r1)     // Catch:{ all -> 0x0c67 }
        L_0x09ba:
            java.lang.String r1 = "sentSuccessfully"
            r3 = r25
            java.lang.String r1 = r12.getString(r1, r3)     // Catch:{ all -> 0x0c67 }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x0c67 }
            java.lang.String r3 = "sentRegisterRequestToAF"
            r4 = 0
            boolean r3 = r12.getBoolean(r3, r4)     // Catch:{ all -> 0x0c67 }
            java.lang.String r4 = "registeredUninstall"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0c67 }
            r7.put(r4, r3)     // Catch:{ all -> 0x0c67 }
            r3 = r23
            int r4 = m20624(r12, r10, r3)     // Catch:{ all -> 0x0c67 }
            java.lang.String r5 = "counter"
            java.lang.String r8 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x0c67 }
            r7.put(r5, r8)     // Catch:{ all -> 0x0c67 }
            java.lang.String r5 = "iaecounter"
            if (r22 == 0) goto L_0x09eb
            r8 = 1
            goto L_0x09ec
        L_0x09eb:
            r8 = 0
        L_0x09ec:
            java.lang.String r9 = "appsFlyerInAppEventCount"
            int r8 = m20624(r12, r9, r8)     // Catch:{ all -> 0x0c67 }
            java.lang.String r8 = java.lang.Integer.toString(r8)     // Catch:{ all -> 0x0c67 }
            r7.put(r5, r8)     // Catch:{ all -> 0x0c67 }
            if (r3 == 0) goto L_0x0a1c
            r5 = 1
            if (r4 != r5) goto L_0x0a1c
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c67 }
            r5.setFirstLaunchCalled()     // Catch:{ all -> 0x0c67 }
            java.lang.String r5 = "waitForCustomerId"
            com.appsflyer.AppsFlyerProperties r8 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c67 }
            r9 = 0
            boolean r5 = r8.getBoolean(r5, r9)     // Catch:{ all -> 0x0c67 }
            if (r5 == 0) goto L_0x0a1c
            java.lang.String r5 = "wait_cid"
            r8 = 1
            java.lang.String r9 = java.lang.Boolean.toString(r8)     // Catch:{ all -> 0x0c67 }
            r7.put(r5, r9)     // Catch:{ all -> 0x0c67 }
        L_0x0a1c:
            java.lang.String r5 = "isFirstCall"
            if (r1 != 0) goto L_0x0a22
            r1 = 1
            goto L_0x0a23
        L_0x0a22:
            r1 = 0
        L_0x0a23:
            java.lang.String r1 = java.lang.Boolean.toString(r1)     // Catch:{ all -> 0x0c67 }
            r7.put(r5, r1)     // Catch:{ all -> 0x0c67 }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x0c67 }
            r1.<init>()     // Catch:{ all -> 0x0c67 }
            java.lang.String r5 = "cpu_abi"
            java.lang.String r8 = "ro.product.cpu.abi"
            java.lang.String r8 = m20626(r8)     // Catch:{ all -> 0x0c67 }
            r1.put(r5, r8)     // Catch:{ all -> 0x0c67 }
            java.lang.String r5 = "cpu_abi2"
            java.lang.String r8 = "ro.product.cpu.abi2"
            java.lang.String r8 = m20626(r8)     // Catch:{ all -> 0x0c67 }
            r1.put(r5, r8)     // Catch:{ all -> 0x0c67 }
            java.lang.String r5 = "arch"
            java.lang.String r8 = "os.arch"
            java.lang.String r8 = m20626(r8)     // Catch:{ all -> 0x0c67 }
            r1.put(r5, r8)     // Catch:{ all -> 0x0c67 }
            java.lang.String r5 = "build_display_id"
            java.lang.String r8 = "ro.build.display.id"
            java.lang.String r8 = m20626(r8)     // Catch:{ all -> 0x0c67 }
            r1.put(r5, r8)     // Catch:{ all -> 0x0c67 }
            if (r3 == 0) goto L_0x0ad6
            boolean r5 = r2.f22546     // Catch:{ all -> 0x0c67 }
            if (r5 == 0) goto L_0x0aa2
            com.appsflyer.internal.C8783o.m20750()     // Catch:{ all -> 0x0c67 }
            android.location.Location r5 = com.appsflyer.internal.C8783o.m20752(r6)     // Catch:{ all -> 0x0c67 }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x0c67 }
            r9 = 3
            r8.<init>(r9)     // Catch:{ all -> 0x0c67 }
            if (r5 == 0) goto L_0x0a97
            java.lang.String r9 = "lat"
            double r13 = r5.getLatitude()     // Catch:{ all -> 0x0c67 }
            java.lang.String r11 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0c67 }
            r8.put(r9, r11)     // Catch:{ all -> 0x0c67 }
            java.lang.String r9 = "lon"
            double r13 = r5.getLongitude()     // Catch:{ all -> 0x0c67 }
            java.lang.String r11 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0c67 }
            r8.put(r9, r11)     // Catch:{ all -> 0x0c67 }
            java.lang.String r9 = "ts"
            long r13 = r5.getTime()     // Catch:{ all -> 0x0c67 }
            java.lang.String r5 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0c67 }
            r8.put(r9, r5)     // Catch:{ all -> 0x0c67 }
        L_0x0a97:
            boolean r5 = r8.isEmpty()     // Catch:{ all -> 0x0c67 }
            if (r5 != 0) goto L_0x0aa2
            java.lang.String r5 = "loc"
            r1.put(r5, r8)     // Catch:{ all -> 0x0c67 }
        L_0x0aa2:
            com.appsflyer.internal.e r5 = com.appsflyer.internal.C8766e.m20725()     // Catch:{ all -> 0x0c67 }
            com.appsflyer.internal.e$c r5 = r5.mo23788(r6)     // Catch:{ all -> 0x0c67 }
            java.lang.String r8 = "btl"
            float r9 = r5.f22697     // Catch:{ all -> 0x0c67 }
            java.lang.String r9 = java.lang.Float.toString(r9)     // Catch:{ all -> 0x0c67 }
            r1.put(r8, r9)     // Catch:{ all -> 0x0c67 }
            java.lang.String r8 = r5.f22696     // Catch:{ all -> 0x0c67 }
            if (r8 == 0) goto L_0x0ac0
            java.lang.String r8 = "btch"
            java.lang.String r5 = r5.f22696     // Catch:{ all -> 0x0c67 }
            r1.put(r8, r5)     // Catch:{ all -> 0x0c67 }
        L_0x0ac0:
            r5 = 2
            if (r5 < r4) goto L_0x0ad6
            com.appsflyer.internal.m r4 = com.appsflyer.internal.C8778m.m20741(r6)     // Catch:{ all -> 0x0c67 }
            java.util.List r4 = r4.mo23793()     // Catch:{ all -> 0x0c67 }
            boolean r5 = r4.isEmpty()     // Catch:{ all -> 0x0c67 }
            if (r5 != 0) goto L_0x0ad6
            java.lang.String r5 = "sensors"
            r1.put(r5, r4)     // Catch:{ all -> 0x0c67 }
        L_0x0ad6:
            java.util.Map r4 = com.appsflyer.AFExecutor.C87382.m20578(r6)     // Catch:{ all -> 0x0c67 }
            java.lang.String r5 = "dim"
            r1.put(r5, r4)     // Catch:{ all -> 0x0c67 }
            java.lang.String r4 = "deviceData"
            r7.put(r4, r1)     // Catch:{ all -> 0x0c67 }
            com.appsflyer.internal.ad r1 = new com.appsflyer.internal.ad     // Catch:{ all -> 0x0c67 }
            r1.<init>()     // Catch:{ all -> 0x0c67 }
            r1 = r17
            java.lang.Object r4 = r7.get(r1)     // Catch:{ all -> 0x0c67 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0c67 }
            r5 = r24
            java.lang.Object r8 = r7.get(r5)     // Catch:{ all -> 0x0c67 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x0c67 }
            java.lang.String r9 = "uid"
            java.lang.Object r9 = r7.get(r9)     // Catch:{ all -> 0x0c67 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0c67 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c67 }
            r11.<init>()     // Catch:{ all -> 0x0c67 }
            r13 = 7
            r14 = 0
            java.lang.String r4 = r4.substring(r14, r13)     // Catch:{ all -> 0x0c67 }
            r11.append(r4)     // Catch:{ all -> 0x0c67 }
            r4 = 7
            java.lang.String r4 = r9.substring(r14, r4)     // Catch:{ all -> 0x0c67 }
            r11.append(r4)     // Catch:{ all -> 0x0c67 }
            int r4 = r8.length()     // Catch:{ all -> 0x0c67 }
            int r4 = r4 + -7
            java.lang.String r4 = r8.substring(r4)     // Catch:{ all -> 0x0c67 }
            r11.append(r4)     // Catch:{ all -> 0x0c67 }
            java.lang.String r4 = r11.toString()     // Catch:{ all -> 0x0c67 }
            java.lang.String r4 = com.appsflyer.internal.C8757ad.m20697(r4)     // Catch:{ all -> 0x0c67 }
            java.lang.String r8 = "af_v"
            r7.put(r8, r4)     // Catch:{ all -> 0x0c67 }
            com.appsflyer.internal.ad r4 = new com.appsflyer.internal.ad     // Catch:{ all -> 0x0c67 }
            r4.<init>()     // Catch:{ all -> 0x0c67 }
            java.lang.Object r1 = r7.get(r1)     // Catch:{ all -> 0x0c67 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0c67 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c67 }
            r4.<init>()     // Catch:{ all -> 0x0c67 }
            r4.append(r1)     // Catch:{ all -> 0x0c67 }
            java.lang.Object r1 = r7.get(r5)     // Catch:{ all -> 0x0c67 }
            r4.append(r1)     // Catch:{ all -> 0x0c67 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0c67 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c67 }
            r4.<init>()     // Catch:{ all -> 0x0c67 }
            r4.append(r1)     // Catch:{ all -> 0x0c67 }
            java.lang.String r1 = "uid"
            java.lang.Object r1 = r7.get(r1)     // Catch:{ all -> 0x0c67 }
            r4.append(r1)     // Catch:{ all -> 0x0c67 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0c67 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c67 }
            r4.<init>()     // Catch:{ all -> 0x0c67 }
            r4.append(r1)     // Catch:{ all -> 0x0c67 }
            java.lang.String r1 = "installDate"
            java.lang.Object r1 = r7.get(r1)     // Catch:{ all -> 0x0c67 }
            r4.append(r1)     // Catch:{ all -> 0x0c67 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0c67 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c67 }
            r4.<init>()     // Catch:{ all -> 0x0c67 }
            r4.append(r1)     // Catch:{ all -> 0x0c67 }
            java.lang.String r1 = "counter"
            java.lang.Object r1 = r7.get(r1)     // Catch:{ all -> 0x0c67 }
            r4.append(r1)     // Catch:{ all -> 0x0c67 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0c67 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0c67 }
            r4.<init>()     // Catch:{ all -> 0x0c67 }
            r4.append(r1)     // Catch:{ all -> 0x0c67 }
            java.lang.String r1 = "iaecounter"
            java.lang.Object r1 = r7.get(r1)     // Catch:{ all -> 0x0c67 }
            r4.append(r1)     // Catch:{ all -> 0x0c67 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0c67 }
            java.lang.String r1 = com.appsflyer.internal.C8757ad.m20695(r1)     // Catch:{ all -> 0x0c67 }
            java.lang.String r1 = com.appsflyer.internal.C8757ad.m20697(r1)     // Catch:{ all -> 0x0c67 }
            java.lang.String r4 = "af_v2"
            r7.put(r4, r1)     // Catch:{ all -> 0x0c67 }
            boolean r1 = m20596(r6)     // Catch:{ all -> 0x0c67 }
            java.lang.String r4 = "ivc"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0c67 }
            r7.put(r4, r1)     // Catch:{ all -> 0x0c67 }
            if (r3 == 0) goto L_0x0c19
            r1 = 0
            int r3 = m20624(r12, r10, r1)     // Catch:{ all -> 0x0c67 }
            r4 = 2
            if (r3 > r4) goto L_0x0c19
            r3 = 28260(0x6e64, float:3.96E-41)
            r4 = 24
            java.lang.Object r3 = com.appsflyer.internal.C8765c.m20723(r1, r3, r4)     // Catch:{ all -> 0x0c0f }
            java.lang.Class r3 = (java.lang.Class) r3     // Catch:{ all -> 0x0c0f }
            java.lang.String r1 = "ˏ"
            r4 = 0
            java.lang.reflect.Method r1 = r3.getMethod(r1, r4)     // Catch:{ all -> 0x0c0f }
            java.lang.Object r1 = r1.invoke(r4, r4)     // Catch:{ all -> 0x0c0f }
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x0c05 }
            r3 = 1
            r4[r3] = r7     // Catch:{ all -> 0x0c05 }
            r3 = 0
            r4[r3] = r6     // Catch:{ all -> 0x0c05 }
            r5 = 28260(0x6e64, float:3.96E-41)
            r6 = 24
            java.lang.Object r5 = com.appsflyer.internal.C8765c.m20723(r3, r5, r6)     // Catch:{ all -> 0x0c05 }
            java.lang.Class r5 = (java.lang.Class) r5     // Catch:{ all -> 0x0c05 }
            java.lang.String r6 = "ˏ"
            r8 = 2
            java.lang.Class[] r8 = new java.lang.Class[r8]     // Catch:{ all -> 0x0c05 }
            java.lang.Class<android.content.Context> r9 = android.content.Context.class
            r8[r3] = r9     // Catch:{ all -> 0x0c05 }
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            r9 = 1
            r8[r9] = r3     // Catch:{ all -> 0x0c05 }
            java.lang.reflect.Method r3 = r5.getMethod(r6, r8)     // Catch:{ all -> 0x0c05 }
            r3.invoke(r1, r4)     // Catch:{ all -> 0x0c05 }
            goto L_0x0c19
        L_0x0c05:
            r0 = move-exception
            r1 = r0
            java.lang.Throwable r3 = r1.getCause()     // Catch:{ all -> 0x0c67 }
            if (r3 == 0) goto L_0x0c0e
            throw r3     // Catch:{ all -> 0x0c67 }
        L_0x0c0e:
            throw r1     // Catch:{ all -> 0x0c67 }
        L_0x0c0f:
            r0 = move-exception
            r1 = r0
            java.lang.Throwable r3 = r1.getCause()     // Catch:{ all -> 0x0c67 }
            if (r3 == 0) goto L_0x0c18
            throw r3     // Catch:{ all -> 0x0c67 }
        L_0x0c18:
            throw r1     // Catch:{ all -> 0x0c67 }
        L_0x0c19:
            java.lang.String r1 = "is_stop_tracking_used"
            boolean r1 = r12.contains(r1)     // Catch:{ all -> 0x0c67 }
            if (r1 == 0) goto L_0x0c31
            java.lang.String r1 = "istu"
            java.lang.String r3 = "is_stop_tracking_used"
            r4 = 0
            boolean r3 = r12.getBoolean(r3, r4)     // Catch:{ all -> 0x0c67 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0c67 }
            r7.put(r1, r3)     // Catch:{ all -> 0x0c67 }
        L_0x0c31:
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c67 }
            java.lang.String r3 = "consumeAfDeepLink"
            java.lang.Object r1 = r1.getObject(r3)     // Catch:{ all -> 0x0c67 }
            if (r1 == 0) goto L_0x0c73
            com.appsflyer.AppsFlyerProperties r1 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x0c67 }
            java.lang.String r3 = "consumeAfDeepLink"
            r4 = 0
            boolean r1 = r1.getBoolean(r3, r4)     // Catch:{ all -> 0x0c67 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0c67 }
            java.lang.String r3 = "is_dp_api"
            r7.put(r3, r1)     // Catch:{ all -> 0x0c67 }
            goto L_0x0c73
        L_0x0c52:
            r2 = r29
            java.lang.String r1 = "AppsFlyer dev key is missing!!! Please use  AppsFlyerLib.getInstance().setAppsFlyerKey(...) to set it. "
            com.appsflyer.AFLogger.afInfoLog(r1)     // Catch:{ all -> 0x0c67 }
            java.lang.String r1 = "DEV_KEY_MISSING"
            r3 = r22
            r4 = 0
            m20605(r6, r3, r1, r4)     // Catch:{ all -> 0x0c67 }
            java.lang.String r1 = "AppsFlyer will not track this event."
            com.appsflyer.AFLogger.afInfoLog(r1)     // Catch:{ all -> 0x0c67 }
            return r4
        L_0x0c67:
            r0 = move-exception
            goto L_0x0c6b
        L_0x0c69:
            r0 = move-exception
            r2 = r1
        L_0x0c6b:
            r1 = r0
            java.lang.String r3 = r1.getLocalizedMessage()
            com.appsflyer.AFLogger.afErrorLog(r3, r1)
        L_0x0c73:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.mo23710(com.appsflyer.internal.h):java.util.Map");
    }

    /* renamed from: ˎ */
    public final void mo23713(WeakReference<Context> weakReference) {
        if (weakReference.get() != null) {
            AFLogger.afInfoLog("app went to background");
            SharedPreferences sharedPreferences = ((Context) weakReference.get()).getApplicationContext().getSharedPreferences("appsflyer-data", 0);
            AppsFlyerProperties.getInstance().saveProperties(sharedPreferences);
            long j = this.f22561 - this.f22538;
            HashMap hashMap = new HashMap();
            String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.AF_KEY);
            if (string == null) {
                AFLogger.afWarnLog("[callStats] AppsFlyer's SDK cannot send any event without providing DevKey.");
                return;
            }
            String string2 = AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
            AppsFlyerProperties instance = AppsFlyerProperties.getInstance();
            String str = AppsFlyerProperties.DEVICE_TRACKING_DISABLED;
            if (instance.getBoolean(str, false)) {
                hashMap.put(str, "true");
            }
            C8790s r7 = C8785p.m20754(((Context) weakReference.get()).getContentResolver());
            if (r7 != null) {
                hashMap.put("amazon_aid", r7.f22770);
                hashMap.put("amazon_aid_limit", String.valueOf(r7.f22771));
            }
            AppsFlyerProperties instance2 = AppsFlyerProperties.getInstance();
            String str2 = ServerParameters.ADVERTISING_ID_PARAM;
            String string3 = instance2.getString(str2);
            if (string3 != null) {
                hashMap.put(str2, string3);
            }
            hashMap.put("app_id", ((Context) weakReference.get()).getPackageName());
            hashMap.put("devkey", string);
            hashMap.put("uid", C8753ab.m20687(weakReference));
            hashMap.put("time_in_app", String.valueOf(j / 1000));
            hashMap.put("statType", "user_closed_app");
            hashMap.put("platform", "Android");
            hashMap.put("launch_counter", Integer.toString(m20624(sharedPreferences, "appsFlyerCount", false)));
            hashMap.put(AppsFlyerProperties.CHANNEL, m20640(weakReference));
            if (string2 == null) {
                string2 = "";
            }
            hashMap.put("originalAppsflyerId", string2);
            if (this.f22553) {
                try {
                    C8801x xVar = new C8801x(null, isTrackingStopped());
                    xVar.f22795 = hashMap;
                    String str3 = "https://%sstats.%s/stats";
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        AFLogger.afDebugLog("Main thread detected. Running callStats task in a new thread.");
                        xVar.execute(new String[]{ServerConfigHandler.getUrl(str3)});
                        return;
                    }
                    StringBuilder sb = new StringBuilder("Running callStats task (on current thread: ");
                    sb.append(Thread.currentThread().toString());
                    sb.append(" )");
                    AFLogger.afDebugLog(sb.toString());
                    xVar.onPreExecute();
                    xVar.onPostExecute(xVar.doInBackground(ServerConfigHandler.getUrl(str3)));
                } catch (Throwable th) {
                    AFLogger.afErrorLog("Could not send callStats request", th);
                }
            } else {
                AFLogger.afDebugLog("Stats call is disabled, ignore ...");
            }
        }
    }

    /* renamed from: ॱ */
    static /* synthetic */ void m20645(AppsFlyerLibCore appsFlyerLibCore, C8772h hVar) throws IOException {
        String str = hVar.f22719;
        StringBuilder sb = new StringBuilder("url: ");
        sb.append(hVar.f22723);
        AFLogger.afInfoLog(sb.toString());
        C87402.m20581("data: ".concat(String.valueOf(str)));
        Context context = hVar.f22720;
        Context context2 = null;
        if (context == null) {
            WeakReference<Context> weakReference = hVar.f22721;
            context = weakReference != null ? (Context) weakReference.get() : null;
        }
        String str2 = LOG_TAG;
        m20605(context, str2, "EVENT_DATA", str);
        try {
            appsFlyerLibCore.m20633(hVar);
        } catch (IOException e) {
            AFLogger.afErrorLog("Exception in sendRequestToServer. ", e);
            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.USE_HTTP_FALLBACK, false)) {
                hVar.f22723 = hVar.f22723.replace("https:", "http:");
                appsFlyerLibCore.m20633(hVar);
                return;
            }
            StringBuilder sb2 = new StringBuilder("failed to send requeset to server. ");
            sb2.append(e.getLocalizedMessage());
            AFLogger.afInfoLog(sb2.toString());
            Context context3 = hVar.f22720;
            if (context3 == null) {
                WeakReference<Context> weakReference2 = hVar.f22721;
                if (weakReference2 != null) {
                    context2 = (Context) weakReference2.get();
                }
            } else {
                context2 = context3;
            }
            m20605(context2, str2, "ERROR", e.getLocalizedMessage());
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x025a A[Catch:{ q -> 0x023d, all -> 0x025e }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0265  */
    /* renamed from: ˏ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m20633(com.appsflyer.internal.C8772h r23) throws java.io.IOException {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.lang.String r2 = "is_first_launch"
            java.lang.String r3 = "appsflyerConversionDataCacheExpiration"
            java.lang.String r4 = "appsflyer-data"
            java.net.URL r5 = new java.net.URL
            java.lang.String r6 = r0.f22723
            r5.<init>(r6)
            java.lang.String r6 = r0.f22719
            java.lang.String r7 = r0.f22726
            java.lang.String r8 = r0.f22714
            boolean r9 = r0.f22713
            android.content.Context r10 = r0.f22720
            if (r10 == 0) goto L_0x001e
            goto L_0x002a
        L_0x001e:
            java.lang.ref.WeakReference<android.content.Context> r10 = r0.f22721
            if (r10 == 0) goto L_0x0029
            java.lang.Object r10 = r10.get()
            android.content.Context r10 = (android.content.Context) r10
            goto L_0x002a
        L_0x0029:
            r10 = 0
        L_0x002a:
            com.appsflyer.AppsFlyerTrackingRequestListener r12 = r0.f22724
            r13 = 1
            if (r9 == 0) goto L_0x0035
            com.appsflyer.AppsFlyerConversionListener r15 = f22532
            if (r15 == 0) goto L_0x0035
            r15 = 1
            goto L_0x0036
        L_0x0035:
            r15 = 0
        L_0x0036:
            com.appsflyer.internal.aa r16 = com.appsflyer.internal.C8752aa.f22603     // Catch:{ all -> 0x0260 }
            if (r16 != 0) goto L_0x0046
            com.appsflyer.internal.aa r16 = new com.appsflyer.internal.aa     // Catch:{ all -> 0x0042 }
            r16.<init>()     // Catch:{ all -> 0x0042 }
            com.appsflyer.internal.C8752aa.f22603 = r16     // Catch:{ all -> 0x0042 }
            goto L_0x0046
        L_0x0042:
            r0 = move-exception
            r11 = 0
            goto L_0x0263
        L_0x0046:
            com.appsflyer.internal.aa r11 = com.appsflyer.internal.C8752aa.f22603     // Catch:{ all -> 0x0260 }
            java.lang.String r0 = r0.f22723     // Catch:{ all -> 0x0260 }
            java.lang.String r14 = "server_request"
            r18 = r2
            java.lang.String[] r2 = new java.lang.String[r13]     // Catch:{ all -> 0x0260 }
            r17 = 0
            r2[r17] = r6     // Catch:{ all -> 0x0260 }
            r11.mo23772(r14, r0, r2)     // Catch:{ all -> 0x0260 }
            java.net.URLConnection r0 = r5.openConnection()     // Catch:{ all -> 0x0260 }
            r11 = r0
            java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11     // Catch:{ all -> 0x0260 }
            java.lang.String r0 = "POST"
            r11.setRequestMethod(r0)     // Catch:{ all -> 0x025e }
            byte[] r0 = r6.getBytes()     // Catch:{ all -> 0x025e }
            int r0 = r0.length     // Catch:{ all -> 0x025e }
            java.lang.String r2 = "Content-Length"
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x025e }
            r11.setRequestProperty(r2, r0)     // Catch:{ all -> 0x025e }
            java.lang.String r0 = "Content-Type"
            java.lang.String r2 = "application/json"
            r11.setRequestProperty(r0, r2)     // Catch:{ all -> 0x025e }
            r0 = 10000(0x2710, float:1.4013E-41)
            r11.setConnectTimeout(r0)     // Catch:{ all -> 0x025e }
            r11.setDoOutput(r13)     // Catch:{ all -> 0x025e }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x024e }
            java.io.OutputStream r0 = r11.getOutputStream()     // Catch:{ all -> 0x024e }
            java.lang.String r14 = "UTF-8"
            r2.<init>(r0, r14)     // Catch:{ all -> 0x024e }
            r2.write(r6)     // Catch:{ all -> 0x024b }
            r2.close()     // Catch:{ all -> 0x025e }
            int r0 = r11.getResponseCode()     // Catch:{ all -> 0x025e }
            java.lang.String r2 = m20641(r11)     // Catch:{ all -> 0x025e }
            com.appsflyer.internal.aa r6 = com.appsflyer.internal.C8752aa.f22603     // Catch:{ all -> 0x025e }
            if (r6 != 0) goto L_0x00a4
            com.appsflyer.internal.aa r6 = new com.appsflyer.internal.aa     // Catch:{ all -> 0x025e }
            r6.<init>()     // Catch:{ all -> 0x025e }
            com.appsflyer.internal.C8752aa.f22603 = r6     // Catch:{ all -> 0x025e }
        L_0x00a4:
            com.appsflyer.internal.aa r6 = com.appsflyer.internal.C8752aa.f22603     // Catch:{ all -> 0x025e }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x025e }
            java.lang.String r14 = "server_response"
            r13 = 2
            java.lang.String[] r13 = new java.lang.String[r13]     // Catch:{ all -> 0x025e }
            java.lang.String r20 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x025e }
            r17 = 0
            r13[r17] = r20     // Catch:{ all -> 0x025e }
            r19 = 1
            r13[r19] = r2     // Catch:{ all -> 0x025e }
            r6.mo23772(r14, r5, r13)     // Catch:{ all -> 0x025e }
            java.lang.String r5 = "response code: "
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x025e }
            java.lang.String r5 = r5.concat(r6)     // Catch:{ all -> 0x025e }
            com.appsflyer.AFLogger.afInfoLog(r5)     // Catch:{ all -> 0x025e }
            java.lang.String r5 = "AppsFlyer_4.10.3"
            java.lang.String r6 = "SERVER_RESPONSE_CODE"
            java.lang.String r13 = java.lang.Integer.toString(r0)     // Catch:{ all -> 0x025e }
            m20605(r10, r5, r6, r13)     // Catch:{ all -> 0x025e }
            android.content.Context r5 = r10.getApplicationContext()     // Catch:{ all -> 0x025e }
            r6 = 0
            android.content.SharedPreferences r5 = r5.getSharedPreferences(r4, r6)     // Catch:{ all -> 0x025e }
            r6 = 200(0xc8, float:2.8E-43)
            if (r0 != r6) goto L_0x0181
            if (r10 == 0) goto L_0x00ed
            if (r9 == 0) goto L_0x00ed
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x025e }
            r1.f22562 = r13     // Catch:{ all -> 0x025e }
        L_0x00ed:
            if (r12 == 0) goto L_0x00f2
            r12.onTrackingRequestSuccess()     // Catch:{ all -> 0x025e }
        L_0x00f2:
            java.lang.String r0 = "afUninstallToken"
            com.appsflyer.AppsFlyerProperties r6 = com.appsflyer.AppsFlyerProperties.getInstance()     // Catch:{ all -> 0x025e }
            java.lang.String r0 = r6.getString(r0)     // Catch:{ all -> 0x025e }
            if (r0 == 0) goto L_0x012b
            java.lang.String r6 = "Uninstall Token exists: "
            java.lang.String r9 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x025e }
            java.lang.String r6 = r6.concat(r9)     // Catch:{ all -> 0x025e }
            com.appsflyer.AFLogger.afDebugLog(r6)     // Catch:{ all -> 0x025e }
            java.lang.String r6 = "sentRegisterRequestToAF"
            r9 = 0
            boolean r6 = r5.getBoolean(r6, r9)     // Catch:{ all -> 0x025e }
            if (r6 != 0) goto L_0x012b
            java.lang.String r6 = "Resending Uninstall token to AF servers: "
            java.lang.String r9 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x025e }
            java.lang.String r6 = r6.concat(r9)     // Catch:{ all -> 0x025e }
            com.appsflyer.AFLogger.afDebugLog(r6)     // Catch:{ all -> 0x025e }
            com.appsflyer.internal.b$b$a r6 = new com.appsflyer.internal.b$b$a     // Catch:{ all -> 0x025e }
            r6.<init>(r0)     // Catch:{ all -> 0x025e }
            java.lang.String r0 = r6.f22681     // Catch:{ all -> 0x025e }
            com.appsflyer.internal.C8775l.C8776a.m20739(r10, r0)     // Catch:{ all -> 0x025e }
        L_0x012b:
            android.net.Uri r0 = r1.latestDeepLink     // Catch:{ all -> 0x025e }
            if (r0 == 0) goto L_0x0132
            r6 = 0
            r1.latestDeepLink = r6     // Catch:{ all -> 0x025e }
        L_0x0132:
            if (r8 == 0) goto L_0x013a
            com.appsflyer.internal.C8800w.m20769()     // Catch:{ all -> 0x025e }
            com.appsflyer.internal.C8800w.m20771(r8, r10)     // Catch:{ all -> 0x025e }
        L_0x013a:
            if (r10 == 0) goto L_0x0173
            if (r8 != 0) goto L_0x0173
            java.lang.String r0 = "sentSuccessfully"
            java.lang.String r6 = "true"
            m20604(r10, r0, r6)     // Catch:{ all -> 0x025e }
            boolean r0 = r1.f22537     // Catch:{ all -> 0x025e }
            if (r0 != 0) goto L_0x0173
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x025e }
            long r12 = r1.f22541     // Catch:{ all -> 0x025e }
            long r8 = r8 - r12
            r12 = 15000(0x3a98, double:7.411E-320)
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0157
            goto L_0x0173
        L_0x0157:
            java.util.concurrent.ScheduledExecutorService r0 = r1.f22542     // Catch:{ all -> 0x025e }
            if (r0 != 0) goto L_0x0173
            com.appsflyer.AFExecutor r0 = com.appsflyer.AFExecutor.getInstance()     // Catch:{ all -> 0x025e }
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r0.mo23616()     // Catch:{ all -> 0x025e }
            r1.f22542 = r0     // Catch:{ all -> 0x025e }
            com.appsflyer.AppsFlyerLibCore$b r0 = new com.appsflyer.AppsFlyerLibCore$b     // Catch:{ all -> 0x025e }
            r0.<init>(r10)     // Catch:{ all -> 0x025e }
            java.util.concurrent.ScheduledExecutorService r6 = r1.f22542     // Catch:{ all -> 0x025e }
            r8 = 1
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x025e }
            m20622(r6, r0, r8, r12)     // Catch:{ all -> 0x025e }
        L_0x0173:
            org.json.JSONObject r0 = com.appsflyer.ServerConfigHandler.m20674(r2)     // Catch:{ all -> 0x025e }
            java.lang.String r2 = "send_background"
            r6 = 0
            boolean r0 = r0.optBoolean(r2, r6)     // Catch:{ all -> 0x025e }
            r1.f22553 = r0     // Catch:{ all -> 0x025e }
            goto L_0x0190
        L_0x0181:
            if (r12 == 0) goto L_0x0190
            java.lang.String r2 = "Failure: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x025e }
            java.lang.String r0 = r2.concat(r0)     // Catch:{ all -> 0x025e }
            r12.onTrackingRequestFailure(r0)     // Catch:{ all -> 0x025e }
        L_0x0190:
            java.lang.String r0 = "appsflyerConversionDataRequestRetries"
            r2 = 0
            int r0 = r5.getInt(r0, r2)     // Catch:{ all -> 0x025e }
            r8 = 0
            long r12 = r5.getLong(r3, r8)     // Catch:{ all -> 0x025e }
            java.lang.String r2 = "attributionId"
            int r6 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r6 == 0) goto L_0x01cf
            long r20 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x025e }
            long r20 = r20 - r12
            r12 = 5184000000(0x134fd9000, double:2.561236308E-314)
            int r6 = (r20 > r12 ? 1 : (r20 == r12 ? 0 : -1))
            if (r6 <= 0) goto L_0x01cf
            java.lang.String r6 = "sixtyDayConversionData"
            android.content.Context r12 = r10.getApplicationContext()     // Catch:{ all -> 0x025e }
            r13 = 0
            android.content.SharedPreferences r4 = r12.getSharedPreferences(r4, r13)     // Catch:{ all -> 0x025e }
            android.content.SharedPreferences$Editor r4 = r4.edit()     // Catch:{ all -> 0x025e }
            r12 = 1
            r4.putBoolean(r6, r12)     // Catch:{ all -> 0x025e }
            r4.apply()     // Catch:{ all -> 0x025e }
            r4 = 0
            m20604(r10, r2, r4)     // Catch:{ all -> 0x025e }
            m20644(r10, r3, r8)     // Catch:{ all -> 0x025e }
        L_0x01cf:
            r3 = 0
            java.lang.String r4 = r5.getString(r2, r3)     // Catch:{ all -> 0x025e }
            if (r4 != 0) goto L_0x01fa
            if (r7 == 0) goto L_0x01fa
            if (r15 == 0) goto L_0x01fa
            com.appsflyer.AppsFlyerConversionListener r3 = f22532     // Catch:{ all -> 0x025e }
            if (r3 == 0) goto L_0x01fa
            r3 = 5
            if (r0 > r3) goto L_0x01fa
            com.appsflyer.AFExecutor r0 = com.appsflyer.AFExecutor.getInstance()     // Catch:{ all -> 0x025e }
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r0.mo23616()     // Catch:{ all -> 0x025e }
            com.appsflyer.AppsFlyerLibCore$e r2 = new com.appsflyer.AppsFlyerLibCore$e     // Catch:{ all -> 0x025e }
            android.content.Context r3 = r10.getApplicationContext()     // Catch:{ all -> 0x025e }
            r2.<init>(r3, r7, r0)     // Catch:{ all -> 0x025e }
            r3 = 10
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x025e }
            m20622(r0, r2, r3, r5)     // Catch:{ all -> 0x025e }
            goto L_0x0245
        L_0x01fa:
            if (r7 != 0) goto L_0x0202
            java.lang.String r0 = "AppsFlyer dev key is missing."
            com.appsflyer.AFLogger.afWarnLog(r0)     // Catch:{ all -> 0x025e }
            goto L_0x0245
        L_0x0202:
            if (r15 == 0) goto L_0x0245
            com.appsflyer.AppsFlyerConversionListener r0 = f22532     // Catch:{ all -> 0x025e }
            if (r0 == 0) goto L_0x0245
            r3 = 0
            java.lang.String r0 = r5.getString(r2, r3)     // Catch:{ all -> 0x025e }
            if (r0 == 0) goto L_0x0245
            java.lang.String r0 = "appsFlyerCount"
            r2 = 0
            int r0 = m20624(r5, r0, r2)     // Catch:{ all -> 0x025e }
            r3 = 1
            if (r0 <= r3) goto L_0x0245
            java.util.Map r0 = m20616(r10)     // Catch:{ q -> 0x023d }
            if (r0 == 0) goto L_0x0245
            r3 = r18
            boolean r4 = r0.containsKey(r3)     // Catch:{ all -> 0x0234 }
            if (r4 != 0) goto L_0x022e
            java.lang.String r2 = java.lang.Boolean.toString(r2)     // Catch:{ all -> 0x0234 }
            r0.put(r3, r2)     // Catch:{ all -> 0x0234 }
        L_0x022e:
            com.appsflyer.AppsFlyerConversionListener r2 = f22532     // Catch:{ all -> 0x0234 }
            r2.onInstallConversionDataLoaded(r0)     // Catch:{ all -> 0x0234 }
            goto L_0x0245
        L_0x0234:
            r0 = move-exception
            java.lang.String r2 = r0.getLocalizedMessage()     // Catch:{ q -> 0x023d }
            com.appsflyer.AFLogger.afErrorLog(r2, r0)     // Catch:{ q -> 0x023d }
            goto L_0x0245
        L_0x023d:
            r0 = move-exception
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x025e }
            com.appsflyer.AFLogger.afErrorLog(r2, r0)     // Catch:{ all -> 0x025e }
        L_0x0245:
            if (r11 == 0) goto L_0x024a
            r11.disconnect()
        L_0x024a:
            return
        L_0x024b:
            r0 = move-exception
            r3 = r2
            goto L_0x0250
        L_0x024e:
            r0 = move-exception
            r3 = 0
        L_0x0250:
            if (r3 != 0) goto L_0x025a
            if (r12 == 0) goto L_0x025d
            java.lang.String r2 = "No Connectivity"
            r12.onTrackingRequestFailure(r2)     // Catch:{ all -> 0x025e }
            goto L_0x025d
        L_0x025a:
            r3.close()     // Catch:{ all -> 0x025e }
        L_0x025d:
            throw r0     // Catch:{ all -> 0x025e }
        L_0x025e:
            r0 = move-exception
            goto L_0x0263
        L_0x0260:
            r0 = move-exception
            r3 = 0
            r11 = r3
        L_0x0263:
            if (r11 == 0) goto L_0x0268
            r11.disconnect()
        L_0x0268:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.m20633(com.appsflyer.internal.h):void");
    }

    /* renamed from: ˊ */
    static /* synthetic */ void m20606(Map map) {
        AppsFlyerConversionListener appsFlyerConversionListener = f22532;
        if (appsFlyerConversionListener != null) {
            try {
                appsFlyerConversionListener.onAppOpenAttribution(map);
            } catch (Throwable th) {
                AFLogger.afErrorLog(th.getLocalizedMessage(), th);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ˎ */
    public static Map<String, String> m20617(String str) {
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                if (!f22528.contains(str2)) {
                    String string = jSONObject.getString(str2);
                    if (!TextUtils.isEmpty(string) && !"null".equals(string)) {
                        hashMap.put(str2, string);
                    }
                }
            }
            return hashMap;
        } catch (JSONException e) {
            AFLogger.afErrorLog(e.getMessage(), e);
            return null;
        }
    }

    /* renamed from: ˎ */
    private static String m20615(String str, PackageManager packageManager, String str2) {
        try {
            Bundle bundle = packageManager.getApplicationInfo(str2, 128).metaData;
            if (bundle == null) {
                return null;
            }
            Object obj = bundle.get(str);
            if (obj != null) {
                return obj.toString();
            }
            return null;
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("Could not find ");
            sb.append(str);
            sb.append(" value in the manifest");
            AFLogger.afErrorLog(sb.toString(), th);
            return null;
        }
    }

    /* renamed from: ˎ */
    private static void m20622(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long j, TimeUnit timeUnit) {
        if (scheduledExecutorService != null) {
            try {
                if (!scheduledExecutorService.isShutdown() && !scheduledExecutorService.isTerminated()) {
                    scheduledExecutorService.schedule(runnable, j, timeUnit);
                    return;
                }
            } catch (RejectedExecutionException e) {
                AFLogger.afErrorLog("scheduleJob failed with RejectedExecutionException Exception", e);
                return;
            } catch (Throwable th) {
                AFLogger.afErrorLog("scheduleJob failed with Exception", th);
                return;
            }
        }
        AFLogger.afWarnLog("scheduler is null, shut downed or terminated");
    }

    /* renamed from: ˎ */
    private void m20621(final C8772h hVar) {
        Context context = hVar.f22720;
        if (context == null) {
            WeakReference<Context> weakReference = hVar.f22721;
            context = weakReference != null ? (Context) weakReference.get() : null;
        }
        Application application = (Application) context;
        AppsFlyerProperties.getInstance().loadProperties(application.getApplicationContext());
        if (VERSION.SDK_INT < 14) {
            AFLogger.afInfoLog("SDK<14 call trackEvent manually");
            AFLogger.afInfoLog("onBecameForeground");
            getInstance().f22538 = System.currentTimeMillis();
            getInstance().mo23709(hVar);
            AFLogger.resetDeltaTime();
        } else if (this.f22540 == null) {
            if (C8796u.f22781 == null) {
                C8796u.f22781 = new C8796u();
            }
            this.f22540 = new C8797a() {
                /* renamed from: ˊ */
                public final void mo23714(Activity activity) {
                    if (2 > AppsFlyerLibCore.m20624(AppsFlyerLibCore.m20625((Context) activity), "appsFlyerCount", false)) {
                        C8778m r0 = C8778m.m20741(activity);
                        r0.f22742.post(r0.f22737);
                        r0.f22742.post(r0.f22743);
                    }
                    C8772h hVar = hVar;
                    hVar.f22720 = activity;
                    AFLogger.afInfoLog("onBecameForeground");
                    AppsFlyerLibCore.getInstance().f22538 = System.currentTimeMillis();
                    AppsFlyerLibCore.getInstance().mo23709(hVar);
                    AFLogger.resetDeltaTime();
                }

                /* renamed from: ॱ */
                public final void mo23715(WeakReference<Context> weakReference) {
                    C87712.m20732((Context) weakReference.get());
                    C8778m r2 = C8778m.m20741((Context) weakReference.get());
                    r2.f22742.post(r2.f22737);
                }
            };
            C8796u uVar = C8796u.f22781;
            if (uVar != null) {
                uVar.f22783 = this.f22540;
                if (VERSION.SDK_INT >= 14) {
                    application.registerActivityLifecycleCallbacks(C8796u.f22781);
                }
                return;
            }
            throw new IllegalStateException("Foreground is not initialised - invoke at least once with parameter init/get");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ˎ */
    public static Map<String, String> m20616(Context context) throws C8787q {
        String string = context.getApplicationContext().getSharedPreferences("appsflyer-data", 0).getString("attributionId", null);
        if (string != null && string.length() > 0) {
            return m20617(string);
        }
        throw new C8787q();
    }

    /* JADX WARNING: Removed duplicated region for block: B:73:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0166  */
    /* renamed from: ˏ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ void m20632(com.appsflyer.AppsFlyerLibCore r9, com.appsflyer.internal.C8772h r10) {
        /*
            android.content.Context r0 = r10.f22720
            if (r0 == 0) goto L_0x0005
            goto L_0x0011
        L_0x0005:
            java.lang.ref.WeakReference<android.content.Context> r0 = r10.f22721
            if (r0 == 0) goto L_0x0010
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            java.lang.String r1 = r10.f22715
            boolean r2 = r10.f22722
            if (r0 != 0) goto L_0x001d
            java.lang.String r9 = "sendTrackingWithEvent - got null context. skipping event/launch."
            com.appsflyer.AFLogger.afDebugLog(r9)
            return
        L_0x001d:
            android.content.Context r3 = r0.getApplicationContext()
            r4 = 0
            java.lang.String r5 = "appsflyer-data"
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r5, r4)
            com.appsflyer.AppsFlyerProperties r5 = com.appsflyer.AppsFlyerProperties.getInstance()
            r5.saveProperties(r3)
            boolean r5 = r9.isTrackingStopped()
            if (r5 != 0) goto L_0x004e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "sendTrackingWithEvent from activity: "
            r5.<init>(r6)
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = r6.getName()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.appsflyer.AFLogger.afInfoLog(r5)
        L_0x004e:
            r5 = 1
            if (r1 != 0) goto L_0x0053
            r1 = 1
            goto L_0x0054
        L_0x0053:
            r1 = 0
        L_0x0054:
            r10.f22713 = r1
            java.util.Map r6 = r9.mo23710(r10)
            java.lang.String r7 = "appsflyerKey"
            java.lang.Object r7 = r6.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x0175
            int r7 = r7.length()
            if (r7 != 0) goto L_0x006c
            goto L_0x0175
        L_0x006c:
            boolean r7 = r9.isTrackingStopped()
            if (r7 != 0) goto L_0x0077
            java.lang.String r7 = "AppsFlyerLib.sendTrackingWithEvent"
            com.appsflyer.AFLogger.afInfoLog(r7)
        L_0x0077:
            if (r1 == 0) goto L_0x0089
            if (r2 == 0) goto L_0x0082
            java.lang.String r2 = f22525
            java.lang.String r2 = com.appsflyer.ServerConfigHandler.getUrl(r2)
            goto L_0x008f
        L_0x0082:
            java.lang.String r2 = f22535
            java.lang.String r2 = com.appsflyer.ServerConfigHandler.getUrl(r2)
            goto L_0x008f
        L_0x0089:
            java.lang.String r2 = f22533
            java.lang.String r2 = com.appsflyer.ServerConfigHandler.getUrl(r2)
        L_0x008f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r2)
            java.lang.String r2 = r0.getPackageName()
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            java.lang.String r7 = "appsFlyerCount"
            int r3 = m20624(r3, r7, r4)
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r8 = "collectAndroidIdForceByUser"
            boolean r7 = r7.getBoolean(r8, r4)
            if (r7 != 0) goto L_0x00c3
            com.appsflyer.AppsFlyerProperties r7 = com.appsflyer.AppsFlyerProperties.getInstance()
            java.lang.String r8 = "collectIMEIForceByUser"
            boolean r7 = r7.getBoolean(r8, r4)
            if (r7 == 0) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            r7 = 0
            goto L_0x00c4
        L_0x00c3:
            r7 = 1
        L_0x00c4:
            if (r7 != 0) goto L_0x00ff
            java.lang.String r7 = "advertiserId"
            java.lang.Object r7 = r6.get(r7)
            if (r7 == 0) goto L_0x00ff
            java.lang.String r7 = r9.f22547     // Catch:{ Exception -> 0x00f9 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x00f9 }
            if (r7 == 0) goto L_0x00e3
            java.lang.String r7 = "android_id"
            java.lang.Object r7 = r6.remove(r7)     // Catch:{ Exception -> 0x00f9 }
            if (r7 == 0) goto L_0x00e3
            java.lang.String r7 = "validateGaidAndIMEI :: removing: android_id"
            com.appsflyer.AFLogger.afInfoLog(r7)     // Catch:{ Exception -> 0x00f9 }
        L_0x00e3:
            java.lang.String r7 = r9.f22558     // Catch:{ Exception -> 0x00f9 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x00f9 }
            if (r7 == 0) goto L_0x00ff
            java.lang.String r7 = "imei"
            java.lang.Object r7 = r6.remove(r7)     // Catch:{ Exception -> 0x00f9 }
            if (r7 == 0) goto L_0x00ff
            java.lang.String r7 = "validateGaidAndIMEI :: removing: imei"
            com.appsflyer.AFLogger.afInfoLog(r7)     // Catch:{ Exception -> 0x00f9 }
            goto L_0x00ff
        L_0x00f9:
            r7 = move-exception
            java.lang.String r8 = "failed to remove IMEI or AndroidID key from params; "
            com.appsflyer.AFLogger.afErrorLog(r8, r7)
        L_0x00ff:
            com.appsflyer.AppsFlyerLibCore$d r7 = new com.appsflyer.AppsFlyerLibCore$d
            r10.f22723 = r2
            r10.f22718 = r6
            com.appsflyer.internal.h r10 = r10.mo23792()
            r10.f22717 = r3
            r7.<init>(r9, r10, r4)
            r10 = 500(0x1f4, float:7.0E-43)
            if (r1 == 0) goto L_0x012f
            boolean r0 = m20608(r0)
            if (r0 == 0) goto L_0x012f
            java.util.Map<java.lang.String, java.lang.String> r0 = r9.f22539
            if (r0 == 0) goto L_0x0124
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0124
            r0 = 1
            goto L_0x0125
        L_0x0124:
            r0 = 0
        L_0x0125:
            if (r0 != 0) goto L_0x012f
            java.lang.String r0 = "Failed to get new referrer, wait ..."
            com.appsflyer.AFLogger.afDebugLog(r0)
            r0 = 500(0x1f4, float:7.0E-43)
            goto L_0x0130
        L_0x012f:
            r0 = 0
        L_0x0130:
            if (r1 == 0) goto L_0x0149
            boolean r1 = r9.f22554
            if (r1 == 0) goto L_0x0149
            org.json.JSONObject r9 = r9.f22555
            if (r9 == 0) goto L_0x0141
            int r9 = r9.length()
            if (r9 <= 0) goto L_0x0141
            r4 = 1
        L_0x0141:
            if (r4 != 0) goto L_0x0149
            java.lang.String r9 = "fetching Facebook deferred AppLink data, wait ..."
            com.appsflyer.AFLogger.afDebugLog(r9)
            goto L_0x014a
        L_0x0149:
            r10 = r0
        L_0x014a:
            boolean r9 = com.appsflyer.internal.C8770g.f22705
            if (r9 == 0) goto L_0x0166
            java.lang.String r9 = "ESP deeplink: execute launch on SerialExecutor"
            com.appsflyer.AFLogger.afRDLog(r9)
            com.appsflyer.AFExecutor r9 = com.appsflyer.AFExecutor.getInstance()
            java.util.concurrent.ScheduledExecutorService r0 = r9.f22504
            if (r0 != 0) goto L_0x0163
            java.util.concurrent.ThreadFactory r0 = r9.f22502
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newSingleThreadScheduledExecutor(r0)
            r9.f22504 = r0
        L_0x0163:
            java.util.concurrent.ScheduledExecutorService r9 = r9.f22504
            goto L_0x016e
        L_0x0166:
            com.appsflyer.AFExecutor r9 = com.appsflyer.AFExecutor.getInstance()
            java.util.concurrent.ScheduledThreadPoolExecutor r9 = r9.mo23616()
        L_0x016e:
            long r0 = (long) r10
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            m20622(r9, r7, r0, r10)
            return
        L_0x0175:
            java.lang.String r9 = "Not sending data yet, waiting for dev key"
            com.appsflyer.AFLogger.afDebugLog(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.AppsFlyerLibCore.m20632(com.appsflyer.AppsFlyerLibCore, com.appsflyer.internal.h):void");
    }

    /* renamed from: ˋ */
    static /* synthetic */ boolean m20614(AppsFlyerLibCore appsFlyerLibCore) {
        Map<String, String> map = appsFlyerLibCore.f22539;
        return map != null && map.size() > 0;
    }
}
