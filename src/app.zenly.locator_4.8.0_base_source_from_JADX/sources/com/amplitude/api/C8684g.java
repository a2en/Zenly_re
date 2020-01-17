package com.amplitude.api;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import com.appsflyer.share.Constants;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* renamed from: com.amplitude.api.g */
public class C8684g {

    /* renamed from: a */
    private boolean f22345a = true;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Context f22346b;

    /* renamed from: c */
    private C8686b f22347c;

    /* renamed from: com.amplitude.api.g$b */
    private class C8686b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f22348a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f22349b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public String f22350c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f22351d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f22352e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public String f22353f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public String f22354g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public String f22355h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public String f22356i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public String f22357j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public boolean f22358k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public boolean f22359l;

        /* renamed from: m */
        private String m20397m() {
            return Build.MODEL;
        }

        /* renamed from: n */
        private String m20398n() {
            return "android";
        }

        /* renamed from: o */
        private String m20399o() {
            return VERSION.RELEASE;
        }

        /* renamed from: p */
        private String m20400p() {
            try {
                return C8684g.this.f22346b.getPackageManager().getPackageInfo(C8684g.this.f22346b.getPackageName(), 0).versionName;
            } catch (NameNotFoundException e) {
                C8687h.m20402b().mo23431a("Failed to get version name", e);
                return null;
            }
        }

        private C8686b() {
            this.f22348a = m20375b();
            this.f22350c = m20400p();
            this.f22351d = m20398n();
            this.f22352e = m20399o();
            this.f22353f = m20381e();
            this.f22354g = m20395l();
            this.f22355h = m20397m();
            this.f22356i = m20383f();
            this.f22349b = m20385g();
            this.f22357j = m20393k();
            this.f22359l = m20374a();
        }

        /* renamed from: a */
        private boolean m20374a() {
            String str = "Google Play Services Util not found!";
            String str2 = "Google Play Services not available";
            String str3 = "Failed to check GPS enabled";
            String str4 = "com.amplitude.api.DeviceInfo";
            boolean z = false;
            try {
                Integer num = (Integer) Class.forName("com.google.android.gms.common.GooglePlayServicesUtil").getMethod("isGooglePlayServicesAvailable", new Class[]{Context.class}).invoke(null, new Object[]{C8684g.this.f22346b});
                if (num != null && num.intValue() == 0) {
                    z = true;
                }
                return z;
            } catch (NoClassDefFoundError e) {
                C8681d.m20309a().mo23383d(str4, str);
                C8687h.m20402b().mo23431a(str3, e);
                return false;
            } catch (ClassNotFoundException e2) {
                C8681d.m20309a().mo23383d(str4, str);
                C8687h.m20402b().mo23431a(str3, e2);
                return false;
            } catch (NoSuchMethodException e3) {
                C8681d.m20309a().mo23383d(str4, str2);
                C8687h.m20402b().mo23431a(str3, e3);
                return false;
            } catch (InvocationTargetException e4) {
                C8681d.m20309a().mo23383d(str4, str2);
                C8687h.m20402b().mo23431a(str3, e4);
                return false;
            } catch (IllegalAccessException e5) {
                C8681d.m20309a().mo23383d(str4, str2);
                C8687h.m20402b().mo23431a(str3, e5);
                return false;
            } catch (Exception e6) {
                C8681d a = C8681d.m20309a();
                StringBuilder sb = new StringBuilder();
                sb.append("Error when checking for Google Play Services: ");
                sb.append(e6);
                a.mo23383d(str4, sb.toString());
                C8687h.m20402b().mo23431a(str3, e6);
                return false;
            }
        }

        /* renamed from: b */
        private String m20375b() {
            if ("Amazon".equals(m20395l())) {
                return m20377c();
            }
            return m20379d();
        }

        /* renamed from: c */
        private String m20377c() {
            ContentResolver contentResolver = C8684g.this.f22346b.getContentResolver();
            boolean z = false;
            if (Secure.getInt(contentResolver, "limit_ad_tracking", 0) == 1) {
                z = true;
            }
            this.f22358k = z;
            this.f22348a = Secure.getString(contentResolver, Constants.URL_ADVERTISING_ID);
            return this.f22348a;
        }

        /* renamed from: d */
        private String m20379d() {
            String str = "Failed to get ADID";
            String str2 = "com.amplitude.api.DeviceInfo";
            try {
                boolean z = true;
                Object invoke = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", new Class[]{Context.class}).invoke(null, new Object[]{C8684g.this.f22346b});
                Boolean bool = (Boolean) invoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(invoke, new Object[0]);
                if (bool == null || !bool.booleanValue()) {
                    z = false;
                }
                this.f22358k = z;
                this.f22348a = (String) invoke.getClass().getMethod("getId", new Class[0]).invoke(invoke, new Object[0]);
            } catch (ClassNotFoundException e) {
                C8681d.m20309a().mo23383d(str2, "Google Play Services SDK not found!");
                C8687h.m20402b().mo23431a(str, e);
            } catch (InvocationTargetException e2) {
                C8681d.m20309a().mo23383d(str2, "Google Play Services not available");
                C8687h.m20402b().mo23431a(str, e2);
            } catch (Exception e3) {
                C8681d.m20309a().mo23379a(str2, "Encountered an error connecting to Google Play Services", e3);
                C8687h.m20402b().mo23431a(str, e3);
            }
            return this.f22348a;
        }

        /* renamed from: e */
        private String m20381e() {
            return Build.BRAND;
        }

        /* renamed from: f */
        private String m20383f() {
            try {
                return ((TelephonyManager) C8684g.this.f22346b.getSystemService("phone")).getNetworkOperatorName();
            } catch (Exception e) {
                C8687h.m20402b().mo23431a("Failed to get carrier", e);
                return null;
            }
        }

        /* renamed from: g */
        private String m20385g() {
            String i = m20389i();
            if (!C8693l.m20451a(i)) {
                return i;
            }
            String j = m20391j();
            if (!C8693l.m20451a(j)) {
                return j;
            }
            return m20387h();
        }

        /* renamed from: h */
        private String m20387h() {
            return Locale.getDefault().getCountry();
        }

        /* renamed from: i */
        private String m20389i() {
            String str = "Failed to get country from location";
            if (!C8684g.this.mo23427o()) {
                return null;
            }
            Location i = C8684g.this.mo23421i();
            if (i != null) {
                try {
                    if (Geocoder.isPresent()) {
                        List<Address> fromLocation = C8684g.this.mo23417e().getFromLocation(i.getLatitude(), i.getLongitude(), 1);
                        if (fromLocation != null) {
                            for (Address address : fromLocation) {
                                if (address != null) {
                                    return address.getCountryCode();
                                }
                            }
                        }
                    }
                } catch (IOException e) {
                    C8687h.m20402b().mo23431a(str, e);
                } catch (NullPointerException e2) {
                    C8687h.m20402b().mo23431a(str, e2);
                } catch (NoSuchMethodError e3) {
                    C8687h.m20402b().mo23431a(str, e3);
                } catch (IllegalArgumentException e4) {
                    C8687h.m20402b().mo23431a(str, e4);
                } catch (IllegalStateException e5) {
                    C8687h.m20402b().mo23431a(str, e5);
                }
            }
            return null;
        }

        /* renamed from: j */
        private String m20391j() {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) C8684g.this.f22346b.getSystemService("phone");
                if (telephonyManager.getPhoneType() != 2) {
                    String networkCountryIso = telephonyManager.getNetworkCountryIso();
                    if (networkCountryIso != null) {
                        return networkCountryIso.toUpperCase(Locale.US);
                    }
                }
            } catch (Exception e) {
                C8687h.m20402b().mo23431a("Failed to get country from network", e);
            }
            return null;
        }

        /* renamed from: k */
        private String m20393k() {
            return Locale.getDefault().getLanguage();
        }

        /* renamed from: l */
        private String m20395l() {
            return Build.MANUFACTURER;
        }
    }

    public C8684g(Context context) {
        this.f22346b = context;
    }

    /* renamed from: q */
    public static String m20354q() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: r */
    private C8686b m20355r() {
        if (this.f22347c == null) {
            this.f22347c = new C8686b();
        }
        return this.f22347c;
    }

    /* renamed from: b */
    public String mo23414b() {
        return m20355r().f22353f;
    }

    /* renamed from: c */
    public String mo23415c() {
        return m20355r().f22356i;
    }

    /* renamed from: d */
    public String mo23416d() {
        return m20355r().f22349b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public Geocoder mo23417e() {
        return new Geocoder(this.f22346b, Locale.ENGLISH);
    }

    /* renamed from: f */
    public String mo23418f() {
        return m20355r().f22357j;
    }

    /* renamed from: g */
    public String mo23419g() {
        return m20355r().f22354g;
    }

    /* renamed from: h */
    public String mo23420h() {
        return m20355r().f22355h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0032 A[SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.location.Location mo23421i() {
        /*
            r8 = this;
            java.lang.String r0 = "Failed to get most recent location"
            boolean r1 = r8.mo23427o()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            android.content.Context r1 = r8.f22346b
            java.lang.String r3 = "location"
            java.lang.Object r1 = r1.getSystemService(r3)
            android.location.LocationManager r1 = (android.location.LocationManager) r1
            if (r1 != 0) goto L_0x0017
            return r2
        L_0x0017:
            r3 = 1
            java.util.List r3 = r1.getProviders(r3)     // Catch:{ SecurityException -> 0x001d }
            goto L_0x0026
        L_0x001d:
            r3 = move-exception
            com.amplitude.api.h r4 = com.amplitude.api.C8687h.m20402b()
            r4.mo23431a(r0, r3)
            r3 = r2
        L_0x0026:
            if (r3 != 0) goto L_0x0029
            return r2
        L_0x0029:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0032:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x005b
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            android.location.Location r5 = r1.getLastKnownLocation(r5)     // Catch:{ IllegalArgumentException -> 0x004c, SecurityException -> 0x0043 }
            goto L_0x0055
        L_0x0043:
            r5 = move-exception
            com.amplitude.api.h r6 = com.amplitude.api.C8687h.m20402b()
            r6.mo23431a(r0, r5)
            goto L_0x0054
        L_0x004c:
            r5 = move-exception
            com.amplitude.api.h r6 = com.amplitude.api.C8687h.m20402b()
            r6.mo23431a(r0, r5)
        L_0x0054:
            r5 = r2
        L_0x0055:
            if (r5 == 0) goto L_0x0032
            r4.add(r5)
            goto L_0x0032
        L_0x005b:
            r0 = -1
            java.util.Iterator r3 = r4.iterator()
        L_0x0061:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x007b
            java.lang.Object r4 = r3.next()
            android.location.Location r4 = (android.location.Location) r4
            long r5 = r4.getTime()
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x0061
            long r0 = r4.getTime()
            r2 = r4
            goto L_0x0061
        L_0x007b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amplitude.api.C8684g.mo23421i():android.location.Location");
    }

    /* renamed from: j */
    public String mo23422j() {
        return m20355r().f22351d;
    }

    /* renamed from: k */
    public String mo23423k() {
        return m20355r().f22352e;
    }

    /* renamed from: l */
    public String mo23424l() {
        return m20355r().f22350c;
    }

    /* renamed from: m */
    public boolean mo23425m() {
        return m20355r().f22359l;
    }

    /* renamed from: n */
    public boolean mo23426n() {
        return m20355r().f22358k;
    }

    /* renamed from: o */
    public boolean mo23427o() {
        return this.f22345a;
    }

    /* renamed from: p */
    public void mo23428p() {
        m20355r();
    }

    /* renamed from: a */
    public String mo23412a() {
        return m20355r().f22348a;
    }

    /* renamed from: a */
    public void mo23413a(boolean z) {
        this.f22345a = z;
    }
}
