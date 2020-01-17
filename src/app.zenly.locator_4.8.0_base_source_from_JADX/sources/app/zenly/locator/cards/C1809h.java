package app.zenly.locator.cards;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import androidx.core.app.C0535j.C0536a;
import app.zenly.locator.R;
import app.zenly.locator.cards.C1815k.C1816a;
import app.zenly.locator.cards.C1815k.C1817b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p255e.C7660b;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;

/* renamed from: app.zenly.locator.cards.h */
public enum C1809h {
    ANDROID_DEFAULT("", C7674a.f19294a, C12846n.m33635a(C1814j.f6015a), "other"),
    GROUPME("com.groupme.android", 2131231330, C12846n.m33635a(C1803f.f5940a), "groupMe_direct"),
    LINE("jp.naver.line.android", 2131231338, C12846n.m33635a(C1814j.f6015a), "line_direct"),
    MESSENGER("com.facebook.orca", 2131231326, C12846n.m33635a(C1814j.f6015a), "messenger_direct"),
    SAVE("", C7674a.f19294a, C12848o.m33640a(), "save"),
    f6004p(r10, 2131231344, C12848o.m33643b((Object[]) new C1802e[]{C1816a.f6018c, C1814j.f6015a}), "twitter_direct"),
    VK("com.vkontakte.android", 2131231346, C12846n.m33635a(C1817b.f6019c), "vk_direct"),
    f6006r(r9, 2131231349, C12848o.m33643b((Object[]) new C1802e[]{C1816a.f6018c, C1814j.f6015a}), "whatsapp_direct");
    

    /* renamed from: t */
    public static final C1810a f6008t = null;

    /* renamed from: e */
    private final String f6009e;

    /* renamed from: f */
    private final int f6010f;

    /* renamed from: g */
    private final List<C1802e> f6011g;

    /* renamed from: h */
    private final String f6012h;

    /* renamed from: app.zenly.locator.cards.h$a */
    public static final class C1810a {
        private C1810a() {
        }

        /* JADX INFO: used method not loaded: kotlin.collections.o.b(java.lang.Object[]):null, types can be incorrect */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x005b, code lost:
            if (r11.equals("TW") != false) goto L_0x0144;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c5, code lost:
            if (r11.equals("NO") != false) goto L_0x01dd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00cf, code lost:
            if (r11.equals("NL") != false) goto L_0x01dd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0139, code lost:
            if (r11.equals("KR") != false) goto L_0x0144;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0142, code lost:
            if (r11.equals("JP") != false) goto L_0x0144;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x01d2, code lost:
            if (r11.equals("GB") != false) goto L_0x01dd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x01db, code lost:
            if (r11.equals("FR") != false) goto L_0x01dd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x020a, code lost:
            if (r11.equals("CA") != false) goto L_0x020c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
            return kotlin.collections.C12848o.m33643b((java.lang.Object[]) new app.zenly.locator.cards.C1809h[]{app.zenly.locator.cards.C1809h.f5999k, app.zenly.locator.cards.C1809h.f6000l, app.zenly.locator.cards.C1809h.f6001m, app.zenly.locator.cards.C1809h.f6004p, app.zenly.locator.cards.C1809h.f6003o, app.zenly.locator.cards.C1809h.f6006r, app.zenly.locator.cards.C1809h.f6005q, app.zenly.locator.cards.C1809h.f5998j});
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
            return kotlin.collections.C12848o.m33643b((java.lang.Object[]) new app.zenly.locator.cards.C1809h[]{app.zenly.locator.cards.C1809h.f6003o, app.zenly.locator.cards.C1809h.f5999k, app.zenly.locator.cards.C1809h.f6001m, app.zenly.locator.cards.C1809h.f6006r, app.zenly.locator.cards.C1809h.f6004p, app.zenly.locator.cards.C1809h.f6000l, app.zenly.locator.cards.C1809h.f5998j, app.zenly.locator.cards.C1809h.f6005q});
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
            return kotlin.collections.C12848o.m33643b((java.lang.Object[]) new app.zenly.locator.cards.C1809h[]{app.zenly.locator.cards.C1809h.f5999k, app.zenly.locator.cards.C1809h.f6003o, app.zenly.locator.cards.C1809h.f5998j, app.zenly.locator.cards.C1809h.f6001m, app.zenly.locator.cards.C1809h.f6006r, app.zenly.locator.cards.C1809h.f6004p, app.zenly.locator.cards.C1809h.f6005q, app.zenly.locator.cards.C1809h.f6000l});
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0051, code lost:
            if (r11.equals("US") != false) goto L_0x020c;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final java.util.List<app.zenly.locator.cards.C1809h> m7277a(java.util.Locale r11) {
            /*
                r10 = this;
                java.lang.String r11 = r11.getCountry()
                r0 = 7
                r1 = 6
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                r7 = 0
                r8 = 8
                if (r11 != 0) goto L_0x0012
                goto L_0x0233
            L_0x0012:
                int r9 = r11.hashCode()
                switch(r9) {
                    case 2142: goto L_0x0204;
                    case 2252: goto L_0x01d5;
                    case 2267: goto L_0x01cc;
                    case 2331: goto L_0x019c;
                    case 2341: goto L_0x016c;
                    case 2374: goto L_0x013c;
                    case 2407: goto L_0x0133;
                    case 2475: goto L_0x0103;
                    case 2476: goto L_0x00d3;
                    case 2494: goto L_0x00c9;
                    case 2497: goto L_0x00bf;
                    case 2627: goto L_0x008f;
                    case 2686: goto L_0x005f;
                    case 2691: goto L_0x0055;
                    case 2718: goto L_0x004b;
                    case 2744: goto L_0x001b;
                    default: goto L_0x0019;
                }
            L_0x0019:
                goto L_0x0233
            L_0x001b:
                java.lang.String r9 = "VN"
                boolean r11 = r11.equals(r9)
                if (r11 == 0) goto L_0x0233
                app.zenly.locator.cards.h[] r11 = new app.zenly.locator.cards.C1809h[r8]
                app.zenly.locator.cards.h r8 = app.zenly.locator.cards.C1809h.f5999k
                r11[r7] = r8
                app.zenly.locator.cards.h r7 = app.zenly.locator.cards.C1809h.f6006r
                r11[r6] = r7
                app.zenly.locator.cards.h r6 = app.zenly.locator.cards.C1809h.MESSENGER
                r11[r5] = r6
                app.zenly.locator.cards.h r5 = app.zenly.locator.cards.C1809h.f6004p
                r11[r4] = r5
                app.zenly.locator.cards.h r4 = app.zenly.locator.cards.C1809h.f6003o
                r11[r3] = r4
                app.zenly.locator.cards.h r3 = app.zenly.locator.cards.C1809h.LINE
                r11[r2] = r3
                app.zenly.locator.cards.h r2 = app.zenly.locator.cards.C1809h.VK
                r11[r1] = r2
                app.zenly.locator.cards.h r1 = app.zenly.locator.cards.C1809h.GROUPME
                r11[r0] = r1
                java.util.List r11 = kotlin.collections.C12848o.m33643b(r11)
                goto L_0x0259
            L_0x004b:
                java.lang.String r9 = "US"
                boolean r11 = r11.equals(r9)
                if (r11 == 0) goto L_0x0233
                goto L_0x020c
            L_0x0055:
                java.lang.String r9 = "TW"
                boolean r11 = r11.equals(r9)
                if (r11 == 0) goto L_0x0233
                goto L_0x0144
            L_0x005f:
                java.lang.String r9 = "TR"
                boolean r11 = r11.equals(r9)
                if (r11 == 0) goto L_0x0233
                app.zenly.locator.cards.h[] r11 = new app.zenly.locator.cards.C1809h[r8]
                app.zenly.locator.cards.h r8 = app.zenly.locator.cards.C1809h.f6006r
                r11[r7] = r8
                app.zenly.locator.cards.h r7 = app.zenly.locator.cards.C1809h.f5999k
                r11[r6] = r7
                app.zenly.locator.cards.h r6 = app.zenly.locator.cards.C1809h.MESSENGER
                r11[r5] = r6
                app.zenly.locator.cards.h r5 = app.zenly.locator.cards.C1809h.f6004p
                r11[r4] = r5
                app.zenly.locator.cards.h r4 = app.zenly.locator.cards.C1809h.f6003o
                r11[r3] = r4
                app.zenly.locator.cards.h r3 = app.zenly.locator.cards.C1809h.LINE
                r11[r2] = r3
                app.zenly.locator.cards.h r2 = app.zenly.locator.cards.C1809h.GROUPME
                r11[r1] = r2
                app.zenly.locator.cards.h r1 = app.zenly.locator.cards.C1809h.VK
                r11[r0] = r1
                java.util.List r11 = kotlin.collections.C12848o.m33643b(r11)
                goto L_0x0259
            L_0x008f:
                java.lang.String r9 = "RU"
                boolean r11 = r11.equals(r9)
                if (r11 == 0) goto L_0x0233
                app.zenly.locator.cards.h[] r11 = new app.zenly.locator.cards.C1809h[r8]
                app.zenly.locator.cards.h r8 = app.zenly.locator.cards.C1809h.f6006r
                r11[r7] = r8
                app.zenly.locator.cards.h r7 = app.zenly.locator.cards.C1809h.VK
                r11[r6] = r7
                app.zenly.locator.cards.h r6 = app.zenly.locator.cards.C1809h.MESSENGER
                r11[r5] = r6
                app.zenly.locator.cards.h r5 = app.zenly.locator.cards.C1809h.f5999k
                r11[r4] = r5
                app.zenly.locator.cards.h r4 = app.zenly.locator.cards.C1809h.f6003o
                r11[r3] = r4
                app.zenly.locator.cards.h r3 = app.zenly.locator.cards.C1809h.f6004p
                r11[r2] = r3
                app.zenly.locator.cards.h r2 = app.zenly.locator.cards.C1809h.LINE
                r11[r1] = r2
                app.zenly.locator.cards.h r1 = app.zenly.locator.cards.C1809h.GROUPME
                r11[r0] = r1
                java.util.List r11 = kotlin.collections.C12848o.m33643b(r11)
                goto L_0x0259
            L_0x00bf:
                java.lang.String r9 = "NO"
                boolean r11 = r11.equals(r9)
                if (r11 == 0) goto L_0x0233
                goto L_0x01dd
            L_0x00c9:
                java.lang.String r9 = "NL"
                boolean r11 = r11.equals(r9)
                if (r11 == 0) goto L_0x0233
                goto L_0x01dd
            L_0x00d3:
                java.lang.String r9 = "MY"
                boolean r11 = r11.equals(r9)
                if (r11 == 0) goto L_0x0233
                app.zenly.locator.cards.h[] r11 = new app.zenly.locator.cards.C1809h[r8]
                app.zenly.locator.cards.h r8 = app.zenly.locator.cards.C1809h.f5999k
                r11[r7] = r8
                app.zenly.locator.cards.h r7 = app.zenly.locator.cards.C1809h.f6006r
                r11[r6] = r7
                app.zenly.locator.cards.h r6 = app.zenly.locator.cards.C1809h.MESSENGER
                r11[r5] = r6
                app.zenly.locator.cards.h r5 = app.zenly.locator.cards.C1809h.f6004p
                r11[r4] = r5
                app.zenly.locator.cards.h r4 = app.zenly.locator.cards.C1809h.f6003o
                r11[r3] = r4
                app.zenly.locator.cards.h r3 = app.zenly.locator.cards.C1809h.LINE
                r11[r2] = r3
                app.zenly.locator.cards.h r2 = app.zenly.locator.cards.C1809h.VK
                r11[r1] = r2
                app.zenly.locator.cards.h r1 = app.zenly.locator.cards.C1809h.GROUPME
                r11[r0] = r1
                java.util.List r11 = kotlin.collections.C12848o.m33643b(r11)
                goto L_0x0259
            L_0x0103:
                java.lang.String r9 = "MX"
                boolean r11 = r11.equals(r9)
                if (r11 == 0) goto L_0x0233
                app.zenly.locator.cards.h[] r11 = new app.zenly.locator.cards.C1809h[r8]
                app.zenly.locator.cards.h r8 = app.zenly.locator.cards.C1809h.f6006r
                r11[r7] = r8
                app.zenly.locator.cards.h r7 = app.zenly.locator.cards.C1809h.LINE
                r11[r6] = r7
                app.zenly.locator.cards.h r6 = app.zenly.locator.cards.C1809h.f5999k
                r11[r5] = r6
                app.zenly.locator.cards.h r5 = app.zenly.locator.cards.C1809h.MESSENGER
                r11[r4] = r5
                app.zenly.locator.cards.h r4 = app.zenly.locator.cards.C1809h.f6004p
                r11[r3] = r4
                app.zenly.locator.cards.h r3 = app.zenly.locator.cards.C1809h.f6003o
                r11[r2] = r3
                app.zenly.locator.cards.h r2 = app.zenly.locator.cards.C1809h.VK
                r11[r1] = r2
                app.zenly.locator.cards.h r1 = app.zenly.locator.cards.C1809h.GROUPME
                r11[r0] = r1
                java.util.List r11 = kotlin.collections.C12848o.m33643b(r11)
                goto L_0x0259
            L_0x0133:
                java.lang.String r9 = "KR"
                boolean r11 = r11.equals(r9)
                if (r11 == 0) goto L_0x0233
                goto L_0x0144
            L_0x013c:
                java.lang.String r9 = "JP"
                boolean r11 = r11.equals(r9)
                if (r11 == 0) goto L_0x0233
            L_0x0144:
                app.zenly.locator.cards.h[] r11 = new app.zenly.locator.cards.C1809h[r8]
                app.zenly.locator.cards.h r8 = app.zenly.locator.cards.C1809h.f5999k
                r11[r7] = r8
                app.zenly.locator.cards.h r7 = app.zenly.locator.cards.C1809h.LINE
                r11[r6] = r7
                app.zenly.locator.cards.h r6 = app.zenly.locator.cards.C1809h.MESSENGER
                r11[r5] = r6
                app.zenly.locator.cards.h r5 = app.zenly.locator.cards.C1809h.f6004p
                r11[r4] = r5
                app.zenly.locator.cards.h r4 = app.zenly.locator.cards.C1809h.f6003o
                r11[r3] = r4
                app.zenly.locator.cards.h r3 = app.zenly.locator.cards.C1809h.f6006r
                r11[r2] = r3
                app.zenly.locator.cards.h r2 = app.zenly.locator.cards.C1809h.VK
                r11[r1] = r2
                app.zenly.locator.cards.h r1 = app.zenly.locator.cards.C1809h.GROUPME
                r11[r0] = r1
                java.util.List r11 = kotlin.collections.C12848o.m33643b(r11)
                goto L_0x0259
            L_0x016c:
                java.lang.String r9 = "IN"
                boolean r11 = r11.equals(r9)
                if (r11 == 0) goto L_0x0233
                app.zenly.locator.cards.h[] r11 = new app.zenly.locator.cards.C1809h[r8]
                app.zenly.locator.cards.h r8 = app.zenly.locator.cards.C1809h.f6006r
                r11[r7] = r8
                app.zenly.locator.cards.h r7 = app.zenly.locator.cards.C1809h.MESSENGER
                r11[r6] = r7
                app.zenly.locator.cards.h r6 = app.zenly.locator.cards.C1809h.f5999k
                r11[r5] = r6
                app.zenly.locator.cards.h r5 = app.zenly.locator.cards.C1809h.f6003o
                r11[r4] = r5
                app.zenly.locator.cards.h r4 = app.zenly.locator.cards.C1809h.f6004p
                r11[r3] = r4
                app.zenly.locator.cards.h r3 = app.zenly.locator.cards.C1809h.LINE
                r11[r2] = r3
                app.zenly.locator.cards.h r2 = app.zenly.locator.cards.C1809h.VK
                r11[r1] = r2
                app.zenly.locator.cards.h r1 = app.zenly.locator.cards.C1809h.GROUPME
                r11[r0] = r1
                java.util.List r11 = kotlin.collections.C12848o.m33643b(r11)
                goto L_0x0259
            L_0x019c:
                java.lang.String r9 = "ID"
                boolean r11 = r11.equals(r9)
                if (r11 == 0) goto L_0x0233
                app.zenly.locator.cards.h[] r11 = new app.zenly.locator.cards.C1809h[r8]
                app.zenly.locator.cards.h r8 = app.zenly.locator.cards.C1809h.f5999k
                r11[r7] = r8
                app.zenly.locator.cards.h r7 = app.zenly.locator.cards.C1809h.f6006r
                r11[r6] = r7
                app.zenly.locator.cards.h r6 = app.zenly.locator.cards.C1809h.MESSENGER
                r11[r5] = r6
                app.zenly.locator.cards.h r5 = app.zenly.locator.cards.C1809h.f6004p
                r11[r4] = r5
                app.zenly.locator.cards.h r4 = app.zenly.locator.cards.C1809h.f6003o
                r11[r3] = r4
                app.zenly.locator.cards.h r3 = app.zenly.locator.cards.C1809h.LINE
                r11[r2] = r3
                app.zenly.locator.cards.h r2 = app.zenly.locator.cards.C1809h.VK
                r11[r1] = r2
                app.zenly.locator.cards.h r1 = app.zenly.locator.cards.C1809h.GROUPME
                r11[r0] = r1
                java.util.List r11 = kotlin.collections.C12848o.m33643b(r11)
                goto L_0x0259
            L_0x01cc:
                java.lang.String r9 = "GB"
                boolean r11 = r11.equals(r9)
                if (r11 == 0) goto L_0x0233
                goto L_0x01dd
            L_0x01d5:
                java.lang.String r9 = "FR"
                boolean r11 = r11.equals(r9)
                if (r11 == 0) goto L_0x0233
            L_0x01dd:
                app.zenly.locator.cards.h[] r11 = new app.zenly.locator.cards.C1809h[r8]
                app.zenly.locator.cards.h r8 = app.zenly.locator.cards.C1809h.f6003o
                r11[r7] = r8
                app.zenly.locator.cards.h r7 = app.zenly.locator.cards.C1809h.f5999k
                r11[r6] = r7
                app.zenly.locator.cards.h r6 = app.zenly.locator.cards.C1809h.MESSENGER
                r11[r5] = r6
                app.zenly.locator.cards.h r5 = app.zenly.locator.cards.C1809h.f6006r
                r11[r4] = r5
                app.zenly.locator.cards.h r4 = app.zenly.locator.cards.C1809h.f6004p
                r11[r3] = r4
                app.zenly.locator.cards.h r3 = app.zenly.locator.cards.C1809h.LINE
                r11[r2] = r3
                app.zenly.locator.cards.h r2 = app.zenly.locator.cards.C1809h.GROUPME
                r11[r1] = r2
                app.zenly.locator.cards.h r1 = app.zenly.locator.cards.C1809h.VK
                r11[r0] = r1
                java.util.List r11 = kotlin.collections.C12848o.m33643b(r11)
                goto L_0x0259
            L_0x0204:
                java.lang.String r9 = "CA"
                boolean r11 = r11.equals(r9)
                if (r11 == 0) goto L_0x0233
            L_0x020c:
                app.zenly.locator.cards.h[] r11 = new app.zenly.locator.cards.C1809h[r8]
                app.zenly.locator.cards.h r8 = app.zenly.locator.cards.C1809h.f5999k
                r11[r7] = r8
                app.zenly.locator.cards.h r7 = app.zenly.locator.cards.C1809h.f6003o
                r11[r6] = r7
                app.zenly.locator.cards.h r6 = app.zenly.locator.cards.C1809h.GROUPME
                r11[r5] = r6
                app.zenly.locator.cards.h r5 = app.zenly.locator.cards.C1809h.MESSENGER
                r11[r4] = r5
                app.zenly.locator.cards.h r4 = app.zenly.locator.cards.C1809h.f6006r
                r11[r3] = r4
                app.zenly.locator.cards.h r3 = app.zenly.locator.cards.C1809h.f6004p
                r11[r2] = r3
                app.zenly.locator.cards.h r2 = app.zenly.locator.cards.C1809h.VK
                r11[r1] = r2
                app.zenly.locator.cards.h r1 = app.zenly.locator.cards.C1809h.LINE
                r11[r0] = r1
                java.util.List r11 = kotlin.collections.C12848o.m33643b(r11)
                goto L_0x0259
            L_0x0233:
                app.zenly.locator.cards.h[] r11 = new app.zenly.locator.cards.C1809h[r8]
                app.zenly.locator.cards.h r8 = app.zenly.locator.cards.C1809h.f5999k
                r11[r7] = r8
                app.zenly.locator.cards.h r7 = app.zenly.locator.cards.C1809h.MESSENGER
                r11[r6] = r7
                app.zenly.locator.cards.h r6 = app.zenly.locator.cards.C1809h.f6006r
                r11[r5] = r6
                app.zenly.locator.cards.h r5 = app.zenly.locator.cards.C1809h.f6004p
                r11[r4] = r5
                app.zenly.locator.cards.h r4 = app.zenly.locator.cards.C1809h.f6003o
                r11[r3] = r4
                app.zenly.locator.cards.h r3 = app.zenly.locator.cards.C1809h.GROUPME
                r11[r2] = r3
                app.zenly.locator.cards.h r2 = app.zenly.locator.cards.C1809h.VK
                r11[r1] = r2
                app.zenly.locator.cards.h r1 = app.zenly.locator.cards.C1809h.LINE
                r11[r0] = r1
                java.util.List r11 = kotlin.collections.C12848o.m33643b(r11)
            L_0x0259:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.cards.C1809h.C1810a.m7277a(java.util.Locale):java.util.List");
        }

        public /* synthetic */ C1810a(C12928f fVar) {
            this();
        }

        /* renamed from: a */
        public final List<C1809h> mo7473a(Activity activity, Locale locale) {
            C12932j.m33818b(activity, "activity");
            C12932j.m33818b(locale, "locale");
            List a = C12846n.m33635a(C1809h.ANDROID_DEFAULT);
            List a2 = m7277a(locale);
            ArrayList arrayList = new ArrayList();
            for (Object next : a2) {
                if (((C1809h) next).mo7470a(activity)) {
                    arrayList.add(next);
                }
            }
            return C12857w.m33670b((Collection) a, (Iterable) arrayList);
        }
    }

    /* renamed from: app.zenly.locator.cards.h$b */
    static final class C1811b extends C1809h {
        C1811b(String str, int i) {
            String str2 = str;
            int i2 = i;
            super(str2, i2, "com.instagram.android", 2131231335, C12846n.m33635a(C1816a.f6018c), "instagram_urlscheme", null);
        }

        /* renamed from: a */
        public void mo7469a(Activity activity, C1808g gVar) {
            C12932j.m33818b(activity, "activity");
            C12932j.m33818b(gVar, "sharingInfo");
            Intent intent = new Intent("com.instagram.share.ADD_TO_STORY");
            intent.setFlags(1);
            if (gVar.mo7464c() != null) {
                C1801d c = gVar.mo7464c();
                if (c != null) {
                    C12932j.m33815a((Object) intent.setDataAndType(c.mo7401b(), "video/*"), "intent.setDataAndType(sh…diaData!!.uri, \"video/*\")");
                } else {
                    C12932j.m33814a();
                    throw null;
                }
            } else if (gVar.mo7459a() != null) {
                C1801d a = gVar.mo7459a();
                if (a != null) {
                    intent.setDataAndType(a.mo7401b(), "image/*");
                } else {
                    C12932j.m33814a();
                    throw null;
                }
            }
            intent.putExtra("content_url", gVar.mo7462b());
            if (intent.resolveActivity(activity.getPackageManager()) != null) {
                activity.startActivity(intent);
            } else {
                C1809h.super.mo7469a(activity, gVar);
            }
        }
    }

    /* renamed from: app.zenly.locator.cards.h$c */
    static final class C1812c extends C1809h {
        C1812c(String str, int i) {
            String str2 = "com.snapchat.android";
            String str3 = str;
            int i2 = i;
            super(str3, i2, str2, 2131231343, C12848o.m33643b((Object[]) new C1802e[]{C1816a.f6018c, C1814j.f6015a}), "snap_direct", null);
        }

        /* renamed from: a */
        public boolean mo7470a(Activity activity) {
            C12932j.m33818b(activity, "activity");
            return C1813i.f6014b.isAvailable() && C1809h.super.mo7470a(activity);
        }

        /* renamed from: a */
        public void mo7469a(Activity activity, C1808g gVar) {
            C12932j.m33818b(activity, "activity");
            C12932j.m33818b(gVar, "sharingInfo");
            C1813i.f6014b.share(activity, gVar);
        }
    }

    /* JADX INFO: used method not loaded: kotlin.collections.o.b(java.lang.Object[]):null, types can be incorrect */
    static {
        f6008t = new C1810a(null);
    }

    private C1809h(String str, int i, List<? extends C1802e> list, String str2) {
        this.f6009e = str;
        this.f6010f = i;
        this.f6011g = list;
        this.f6012h = str2;
    }

    /* renamed from: a */
    public final String mo7468a() {
        return this.f6012h;
    }

    /* renamed from: b */
    public final int mo7471b() {
        return this.f6010f;
    }

    /* renamed from: c */
    public final List<C1802e> mo7472c() {
        return this.f6011g;
    }

    /* renamed from: b */
    private final Intent m7271b(Activity activity, C1808g gVar) {
        C0536a a = gVar.mo7458a(activity);
        if (this.f6009e.length() > 0) {
            Intent b = a.mo3057b();
            C12932j.m33815a((Object) b, "sharingIntent");
            b.setPackage(this.f6009e);
            return b;
        }
        a.mo3053a((int) R.string.chat_button_send);
        Intent a2 = a.mo3052a();
        C12932j.m33815a((Object) a2, "intentBuilder.createChooserIntent()");
        return a2;
    }

    /* renamed from: a */
    public boolean mo7470a(Activity activity) {
        C12932j.m33818b(activity, "activity");
        int i = 0;
        try {
            return activity.getPackageManager().getApplicationInfo(this.f6009e, i).enabled;
        } catch (NameNotFoundException unused) {
            return i;
        }
    }

    /* renamed from: a */
    public void mo7469a(Activity activity, C1808g gVar) {
        C12932j.m33818b(activity, "activity");
        C12932j.m33818b(gVar, "sharingInfo");
        Intent b = m7271b(activity, gVar);
        b.addFlags(1);
        C7660b.m18654a((Context) activity, b, (int) R.string.commons_noApplicationFound);
    }
}
