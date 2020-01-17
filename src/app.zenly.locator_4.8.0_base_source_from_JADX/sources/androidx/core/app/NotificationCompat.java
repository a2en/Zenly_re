package androidx.core.app;

import android.app.Notification;
import android.app.Notification.BigPictureStyle;
import android.app.Notification.BigTextStyle;
import android.app.Notification.BubbleMetadata;
import android.app.Notification.BubbleMetadata.Builder;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;
import p214e.p234h.C7611b;

public class NotificationCompat {

    public static class Action {

        /* renamed from: a */
        final Bundle f2418a;

        /* renamed from: b */
        private final C0534i[] f2419b;

        /* renamed from: c */
        private final C0534i[] f2420c;

        /* renamed from: d */
        private boolean f2421d;

        /* renamed from: e */
        boolean f2422e;

        /* renamed from: f */
        private final int f2423f;

        /* renamed from: g */
        private final boolean f2424g;

        /* renamed from: h */
        public int f2425h;

        /* renamed from: i */
        public CharSequence f2426i;

        /* renamed from: j */
        public PendingIntent f2427j;

        public interface Extender {
            C0507a extend(C0507a aVar);
        }

        /* renamed from: androidx.core.app.NotificationCompat$Action$a */
        public static final class C0507a {
        }

        public Action(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false);
        }

        /* renamed from: a */
        public PendingIntent mo2967a() {
            return this.f2427j;
        }

        /* renamed from: b */
        public boolean mo2968b() {
            return this.f2421d;
        }

        /* renamed from: c */
        public C0534i[] mo2969c() {
            return this.f2420c;
        }

        /* renamed from: d */
        public Bundle mo2970d() {
            return this.f2418a;
        }

        /* renamed from: e */
        public int mo2971e() {
            return this.f2425h;
        }

        /* renamed from: f */
        public C0534i[] mo2972f() {
            return this.f2419b;
        }

        /* renamed from: g */
        public int mo2973g() {
            return this.f2423f;
        }

        /* renamed from: h */
        public boolean mo2974h() {
            return this.f2422e;
        }

        /* renamed from: i */
        public CharSequence mo2975i() {
            return this.f2426i;
        }

        /* renamed from: j */
        public boolean mo2976j() {
            return this.f2424g;
        }

        Action(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, C0534i[] iVarArr, C0534i[] iVarArr2, boolean z, int i2, boolean z2, boolean z3) {
            this.f2422e = true;
            this.f2425h = i;
            this.f2426i = C0511d.m2405d(charSequence);
            this.f2427j = pendingIntent;
            if (bundle == null) {
                bundle = new Bundle();
            }
            this.f2418a = bundle;
            this.f2419b = iVarArr;
            this.f2420c = iVarArr2;
            this.f2421d = z;
            this.f2423f = i2;
            this.f2422e = z2;
            this.f2424g = z3;
        }
    }

    public interface Extender {
        C0511d extend(C0511d dVar);
    }

    /* renamed from: androidx.core.app.NotificationCompat$a */
    public static class C0508a extends C0512e {

        /* renamed from: e */
        private Bitmap f2428e;

        /* renamed from: f */
        private Bitmap f2429f;

        /* renamed from: g */
        private boolean f2430g;

        /* renamed from: a */
        public C0508a mo2979a(Bitmap bitmap) {
            this.f2429f = bitmap;
            this.f2430g = true;
            return this;
        }

        /* renamed from: b */
        public C0508a mo2981b(Bitmap bitmap) {
            this.f2428e = bitmap;
            return this;
        }

        /* renamed from: a */
        public void mo2980a(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (VERSION.SDK_INT >= 16) {
                BigPictureStyle bigPicture = new BigPictureStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(this.f2476b).bigPicture(this.f2428e);
                if (this.f2430g) {
                    bigPicture.bigLargeIcon(this.f2429f);
                }
                if (this.f2478d) {
                    bigPicture.setSummaryText(this.f2477c);
                }
            }
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$b */
    public static class C0509b extends C0512e {

        /* renamed from: e */
        private CharSequence f2431e;

        /* renamed from: a */
        public C0509b mo2982a(CharSequence charSequence) {
            this.f2431e = C0511d.m2405d(charSequence);
            return this;
        }

        /* renamed from: a */
        public void mo2980a(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (VERSION.SDK_INT >= 16) {
                BigTextStyle bigText = new BigTextStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(this.f2476b).bigText(this.f2431e);
                if (this.f2478d) {
                    bigText.setSummaryText(this.f2477c);
                }
            }
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$c */
    public static final class C0510c {
        /* renamed from: a */
        protected static BubbleMetadata m2401a(C0510c cVar) {
            if (cVar == null) {
                return null;
            }
            new Builder();
            cVar.mo2983a();
            throw null;
        }

        /* renamed from: a */
        public boolean mo2983a() {
            throw null;
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$d */
    public static class C0511d {

        /* renamed from: A */
        String f2432A;

        /* renamed from: B */
        Bundle f2433B;

        /* renamed from: C */
        int f2434C;

        /* renamed from: D */
        int f2435D;

        /* renamed from: E */
        Notification f2436E;

        /* renamed from: F */
        RemoteViews f2437F;

        /* renamed from: G */
        RemoteViews f2438G;

        /* renamed from: H */
        RemoteViews f2439H;

        /* renamed from: I */
        String f2440I;

        /* renamed from: J */
        int f2441J;

        /* renamed from: K */
        String f2442K;

        /* renamed from: L */
        long f2443L;

        /* renamed from: M */
        int f2444M;

        /* renamed from: N */
        boolean f2445N;

        /* renamed from: O */
        C0510c f2446O;

        /* renamed from: P */
        Notification f2447P;
        @Deprecated

        /* renamed from: Q */
        public ArrayList<String> f2448Q;

        /* renamed from: a */
        public Context f2449a;

        /* renamed from: b */
        public ArrayList<Action> f2450b;

        /* renamed from: c */
        ArrayList<Action> f2451c;

        /* renamed from: d */
        CharSequence f2452d;

        /* renamed from: e */
        CharSequence f2453e;

        /* renamed from: f */
        PendingIntent f2454f;

        /* renamed from: g */
        PendingIntent f2455g;

        /* renamed from: h */
        RemoteViews f2456h;

        /* renamed from: i */
        Bitmap f2457i;

        /* renamed from: j */
        CharSequence f2458j;

        /* renamed from: k */
        int f2459k;

        /* renamed from: l */
        int f2460l;

        /* renamed from: m */
        boolean f2461m;

        /* renamed from: n */
        boolean f2462n;

        /* renamed from: o */
        C0512e f2463o;

        /* renamed from: p */
        CharSequence f2464p;

        /* renamed from: q */
        CharSequence[] f2465q;

        /* renamed from: r */
        int f2466r;

        /* renamed from: s */
        int f2467s;

        /* renamed from: t */
        boolean f2468t;

        /* renamed from: u */
        String f2469u;

        /* renamed from: v */
        boolean f2470v;

        /* renamed from: w */
        String f2471w;

        /* renamed from: x */
        boolean f2472x;

        /* renamed from: y */
        boolean f2473y;

        /* renamed from: z */
        boolean f2474z;

        public C0511d(Context context, String str) {
            this.f2450b = new ArrayList<>();
            this.f2451c = new ArrayList<>();
            this.f2461m = true;
            this.f2472x = false;
            this.f2434C = 0;
            this.f2435D = 0;
            this.f2441J = 0;
            this.f2444M = 0;
            this.f2447P = new Notification();
            this.f2449a = context;
            this.f2440I = str;
            this.f2447P.when = System.currentTimeMillis();
            this.f2447P.audioStreamType = -1;
            this.f2460l = 0;
            this.f2448Q = new ArrayList<>();
            this.f2445N = true;
        }

        /* renamed from: d */
        protected static CharSequence m2405d(CharSequence charSequence) {
            if (charSequence == null) {
                return charSequence;
            }
            if (charSequence.length() > 5120) {
                charSequence = charSequence.subSequence(0, 5120);
            }
            return charSequence;
        }

        /* renamed from: a */
        public C0511d mo2987a(long j) {
            this.f2447P.when = j;
            return this;
        }

        /* renamed from: b */
        public C0511d mo2998b(CharSequence charSequence) {
            this.f2452d = m2405d(charSequence);
            return this;
        }

        /* renamed from: c */
        public C0511d mo3000c(int i) {
            this.f2447P.icon = i;
            return this;
        }

        /* renamed from: a */
        public C0511d mo2992a(CharSequence charSequence) {
            this.f2453e = m2405d(charSequence);
            return this;
        }

        /* renamed from: b */
        public C0511d mo2997b(PendingIntent pendingIntent) {
            this.f2447P.deleteIntent = pendingIntent;
            return this;
        }

        /* renamed from: c */
        public C0511d mo3001c(CharSequence charSequence) {
            this.f2447P.tickerText = m2405d(charSequence);
            return this;
        }

        /* renamed from: b */
        private Bitmap m2404b(Bitmap bitmap) {
            if (bitmap != null && VERSION.SDK_INT < 27) {
                Resources resources = this.f2449a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(C7611b.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(C7611b.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                    return bitmap;
                }
                double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
                bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
            }
            return bitmap;
        }

        /* renamed from: a */
        public C0511d mo2988a(PendingIntent pendingIntent) {
            this.f2454f = pendingIntent;
            return this;
        }

        /* renamed from: c */
        public C0511d mo3002c(boolean z) {
            m2403a(2, z);
            return this;
        }

        /* renamed from: a */
        public C0511d mo2989a(Bitmap bitmap) {
            this.f2457i = m2404b(bitmap);
            return this;
        }

        /* renamed from: a */
        public C0511d mo2990a(Uri uri) {
            Notification notification = this.f2447P;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        /* renamed from: a */
        public C0511d mo2994a(boolean z) {
            m2403a(16, z);
            return this;
        }

        /* renamed from: a */
        private void m2403a(int i, boolean z) {
            if (z) {
                Notification notification = this.f2447P;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.f2447P;
            notification2.flags = (~i) & notification2.flags;
        }

        /* renamed from: a */
        public C0511d mo2986a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f2450b.add(new Action(i, charSequence, pendingIntent));
            return this;
        }

        /* renamed from: a */
        public C0511d mo2991a(C0512e eVar) {
            if (this.f2463o != eVar) {
                this.f2463o = eVar;
                C0512e eVar2 = this.f2463o;
                if (eVar2 != null) {
                    eVar2.mo3004a(this);
                }
            }
            return this;
        }

        /* renamed from: b */
        public C0511d mo2999b(boolean z) {
            this.f2472x = z;
            return this;
        }

        /* renamed from: b */
        public C0511d mo2996b(int i) {
            this.f2460l = i;
            return this;
        }

        @Deprecated
        public C0511d(Context context) {
            this(context, null);
        }

        /* renamed from: b */
        public Bundle mo2995b() {
            if (this.f2433B == null) {
                this.f2433B = new Bundle();
            }
            return this.f2433B;
        }

        /* renamed from: a */
        public C0511d mo2985a(int i) {
            this.f2434C = i;
            return this;
        }

        /* renamed from: a */
        public C0511d mo2993a(String str) {
            this.f2440I = str;
            return this;
        }

        /* renamed from: a */
        public Notification mo2984a() {
            return new C0525f(this).mo3039a();
        }
    }

    /* renamed from: androidx.core.app.NotificationCompat$e */
    public static abstract class C0512e {

        /* renamed from: a */
        protected C0511d f2475a;

        /* renamed from: b */
        CharSequence f2476b;

        /* renamed from: c */
        CharSequence f2477c;

        /* renamed from: d */
        boolean f2478d = false;

        /* renamed from: a */
        public void mo3003a(Bundle bundle) {
        }

        /* renamed from: a */
        public abstract void mo2980a(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor);

        /* renamed from: a */
        public void mo3004a(C0511d dVar) {
            if (this.f2475a != dVar) {
                this.f2475a = dVar;
                C0511d dVar2 = this.f2475a;
                if (dVar2 != null) {
                    dVar2.mo2991a(this);
                }
            }
        }

        /* renamed from: b */
        public RemoteViews mo3005b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        /* renamed from: c */
        public RemoteViews mo3006c(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        /* renamed from: d */
        public RemoteViews mo3007d(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }
    }

    /* renamed from: a */
    public static Bundle m2385a(Notification notification) {
        int i = VERSION.SDK_INT;
        if (i >= 19) {
            return notification.extras;
        }
        if (i >= 16) {
            return C0526g.m2480a(notification);
        }
        return null;
    }
}
