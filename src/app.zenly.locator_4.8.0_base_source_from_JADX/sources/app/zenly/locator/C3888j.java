package app.zenly.locator;

import android.content.Intent;
import android.content.UriMatcher;
import android.net.Uri;
import android.net.Uri.Builder;
import app.zenly.locator.core.config.C2455a;
import app.zenly.locator.p143s.p150n.C5459d;
import p213co.znly.models.PingProto$Ping2.C6824b;
import p213co.znly.models.PingProto$Ping2.C6824b.C6826b;
import p213co.znly.models.notifications.C7793b;
import p213co.znly.models.notifications.C7857w;
import p213co.znly.models.notifications.C7857w.C7859b;
import p213co.znly.models.notifications.C7862y;
import p387h.p388a.C12143a;

/* renamed from: app.zenly.locator.j */
public final class C3888j {

    /* renamed from: a */
    private static final UriMatcher f10299a = new UriMatcher(-1);

    /* renamed from: b */
    private static final Uri f10300b;

    /* renamed from: app.zenly.locator.j$a */
    static /* synthetic */ class C3889a {

        /* renamed from: a */
        static final /* synthetic */ int[] f10301a = new int[C6826b.values().length];

        /* renamed from: b */
        static final /* synthetic */ int[] f10302b = new int[C7859b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(21:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|5|6|7|(2:9|10)|11|13|14|15|16|17|19|20|21|22|23|24|25|26|28) */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0035 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0053 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0067 */
        static {
            /*
                co.znly.models.notifications.w$b[] r0 = p213co.znly.models.notifications.C7857w.C7859b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10302b = r0
                r0 = 1
                int[] r1 = f10302b     // Catch:{ NoSuchFieldError -> 0x0014 }
                co.znly.models.notifications.w$b r2 = p213co.znly.models.notifications.C7857w.C7859b.CONTACT_JOINED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                r1 = 2
                int[] r2 = f10302b     // Catch:{ NoSuchFieldError -> 0x001f }
                co.znly.models.notifications.w$b r3 = p213co.znly.models.notifications.C7857w.C7859b.DISABLE_GHOST_ACCEPTED     // Catch:{ NoSuchFieldError -> 0x001f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                r2 = 3
                int[] r3 = f10302b     // Catch:{ NoSuchFieldError -> 0x002a }
                co.znly.models.notifications.w$b r4 = p213co.znly.models.notifications.C7857w.C7859b.ENABLE_WIFI_ACCEPTED     // Catch:{ NoSuchFieldError -> 0x002a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                r3 = 4
                int[] r4 = f10302b     // Catch:{ NoSuchFieldError -> 0x0035 }
                co.znly.models.notifications.w$b r5 = p213co.znly.models.notifications.C7857w.C7859b.FRIEND_IS_BACK     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r4 = f10302b     // Catch:{ NoSuchFieldError -> 0x0040 }
                co.znly.models.notifications.w$b r5 = p213co.znly.models.notifications.C7857w.C7859b.FRIEND_REQUEST_ACCEPTED     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r6 = 5
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                co.znly.models.PingProto$Ping2$b$b[] r4 = p213co.znly.models.PingProto$Ping2.C6824b.C6826b.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f10301a = r4
                int[] r4 = f10301a     // Catch:{ NoSuchFieldError -> 0x0053 }
                co.znly.models.PingProto$Ping2$b$b r5 = p213co.znly.models.PingProto$Ping2.C6824b.C6826b.EMOJI     // Catch:{ NoSuchFieldError -> 0x0053 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0053 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0053 }
            L_0x0053:
                int[] r0 = f10301a     // Catch:{ NoSuchFieldError -> 0x005d }
                co.znly.models.PingProto$Ping2$b$b r4 = p213co.znly.models.PingProto$Ping2.C6824b.C6826b.TEXT     // Catch:{ NoSuchFieldError -> 0x005d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                int[] r0 = f10301a     // Catch:{ NoSuchFieldError -> 0x0067 }
                co.znly.models.PingProto$Ping2$b$b r1 = p213co.znly.models.PingProto$Ping2.C6824b.C6826b.MEDIA     // Catch:{ NoSuchFieldError -> 0x0067 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0067 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                int[] r0 = f10301a     // Catch:{ NoSuchFieldError -> 0x0071 }
                co.znly.models.PingProto$Ping2$b$b r1 = p213co.znly.models.PingProto$Ping2.C6824b.C6826b.REQUEST_MEDIA     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.C3888j.C3889a.<clinit>():void");
        }
    }

    static {
        String str = "app.zenly.locator";
        f10299a.addURI(str, "user/*", 1);
        f10299a.addURI(str, "conversation/*", 2);
        f10299a.addURI(str, "avatar/*", 3);
        f10299a.addURI(str, "ticket/*", 4);
        f10299a.addURI(str, "bump/*", 5);
        f10299a.addURI(str, "nofriends", 6);
        f10300b = new Builder().scheme("content").authority(str).build();
    }

    /* renamed from: a */
    public static Uri m11448a(String str, C7862y yVar) {
        return f10300b.buildUpon().appendPath("user").appendPath(str).appendQueryParameter("pt", String.valueOf(yVar.getPing().getContent(0).getType())).appendQueryParameter("nt", m11449a(yVar.getPing().getContent(0))).build();
    }

    /* renamed from: b */
    public static Uri m11452b(String str) {
        return f10300b.buildUpon().appendPath("user").appendPath(str).appendQueryParameter("cc", String.valueOf(true)).appendQueryParameter("nt", "country_change").build();
    }

    /* renamed from: c */
    public static String m11454c(Intent intent) {
        if (intent.getData() == null) {
            return null;
        }
        return intent.getData().getLastPathSegment();
    }

    /* renamed from: d */
    public static int m11455d(Intent intent) {
        Uri data = intent.getData();
        if (data == null) {
            return -1;
        }
        if (!C2455a.f7361a.contains(data.getScheme()) || !C2455a.f7362b.contains(data.getAuthority())) {
            return f10299a.match(intent.getData());
        }
        return 101;
    }

    /* renamed from: e */
    public static String m11456e(Intent intent) {
        if (intent.getData() != null) {
            try {
                return intent.getData().getQueryParameter("nt");
            } catch (Exception e) {
                C12143a.m32034c(e, "Intent parse exception", new Object[0]);
            }
        }
        return "unknown";
    }

    /* renamed from: f */
    public static C6826b m11457f(Intent intent) {
        if (intent.getData() != null) {
            try {
                return C6826b.m17582a(Integer.parseInt(intent.getData().getQueryParameter("pt")));
            } catch (Exception e) {
                C12143a.m32034c(e, "Intent parse exception", new Object[0]);
            }
        }
        return C6826b.UNKNOWN;
    }

    /* renamed from: g */
    public static boolean m11458g(Intent intent) {
        return "android.intent.action.VIEW".equals(intent.getAction()) && intent.getData() != null;
    }

    /* renamed from: a */
    private static String m11449a(C6824b bVar) {
        int i = C3889a.f10301a[bVar.getType().ordinal()];
        if (i == 1) {
            return "user_message_emoji";
        }
        if (i == 2) {
            return "user_message_text";
        }
        if (i != 3) {
            return i != 4 ? "user_message_unknown" : "user_message_request_media";
        }
        return "user_message_media";
    }

    /* renamed from: b */
    public static C5459d m11453b(Intent intent) {
        if (intent.getData() != null) {
            try {
                return new C5459d(Double.parseDouble(intent.getData().getQueryParameter("lat")), Double.parseDouble(intent.getData().getQueryParameter("lng")));
            } catch (Exception e) {
                C12143a.m32034c(e, "Intent parse exception", new Object[0]);
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Uri m11447a(String str, C7857w wVar) {
        return f10300b.buildUpon().appendPath("user").appendPath(str).appendQueryParameter("nt", m11450a(wVar)).build();
    }

    /* renamed from: a */
    private static String m11450a(C7857w wVar) {
        int i = C3889a.f10302b[wVar.getNotificationCase().ordinal()];
        if (i == 1) {
            return "user_contact_has_joined";
        }
        if (i == 2) {
            return "user_has_disable_ghost_accepted";
        }
        if (i == 3) {
            return "user_has_enable_wifi_accepted";
        }
        if (i != 4) {
            return i != 5 ? "user_unknown" : "user_has_friend_request_accepted";
        }
        return "user_has_friend_is_back";
    }

    /* renamed from: a */
    public static Uri m11446a(String str, int i) {
        String str2 = "conversation";
        return f10300b.buildUpon().appendPath(str2).appendPath(str).appendQueryParameter("pt", String.valueOf(i)).appendQueryParameter("nt", str2).build();
    }

    /* renamed from: a */
    public static Uri m11445a(String str) {
        String str2 = "avatar";
        return f10300b.buildUpon().appendPath(str2).appendPath(str).appendQueryParameter("nt", str2).build();
    }

    /* renamed from: a */
    public static Uri m11443a(long j) {
        String str = "ticket";
        return f10300b.buildUpon().appendPath(str).appendPath(Long.toString(j)).appendQueryParameter("nt", str).build();
    }

    /* renamed from: a */
    public static Uri m11444a(C7793b bVar) {
        String str = "bump";
        return f10300b.buildUpon().appendPath(str).appendPath(bVar.getBrumpInfo().getMatchId()).appendQueryParameter("lat", String.valueOf(bVar.getBrumpInfo().getLatitude())).appendQueryParameter("lng", String.valueOf(bVar.getBrumpInfo().getLongitude())).appendQueryParameter("nt", str).build();
    }

    /* renamed from: a */
    public static Uri m11442a() {
        return f10300b.buildUpon().appendPath("nofriends").build();
    }

    /* renamed from: a */
    public static boolean m11451a(Intent intent) {
        if (intent.getData() != null) {
            try {
                return Boolean.parseBoolean(intent.getData().getQueryParameter("cc"));
            } catch (Exception e) {
                C12143a.m32034c(e, "Intent parse exception", new Object[0]);
            }
        }
        return false;
    }
}
