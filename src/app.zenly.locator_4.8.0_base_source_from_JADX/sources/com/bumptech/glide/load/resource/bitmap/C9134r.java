package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.util.Log;
import java.io.File;

/* renamed from: com.bumptech.glide.load.resource.bitmap.r */
public final class C9134r {

    /* renamed from: d */
    private static final File f23710d = new File("/proc/self/fd");

    /* renamed from: e */
    private static volatile int f23711e = 700;

    /* renamed from: f */
    private static volatile int f23712f = 128;

    /* renamed from: g */
    private static volatile C9134r f23713g;

    /* renamed from: a */
    private final boolean f23714a = m21869c();

    /* renamed from: b */
    private int f23715b;

    /* renamed from: c */
    private boolean f23716c = true;

    C9134r() {
    }

    /* renamed from: a */
    public static C9134r m21867a() {
        if (f23713g == null) {
            synchronized (C9134r.class) {
                if (f23713g == null) {
                    f23713g = new C9134r();
                }
            }
        }
        return f23713g;
    }

    /* renamed from: b */
    private synchronized boolean m21868b() {
        int i = this.f23715b + 1;
        this.f23715b = i;
        if (i >= 50) {
            boolean z = false;
            this.f23715b = 0;
            int length = f23710d.list().length;
            if (length < f23711e) {
                z = true;
            }
            this.f23716c = z;
            if (!this.f23716c && Log.isLoggable("Downsampler", 5)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors ");
                sb.append(length);
                sb.append(", limit ");
                sb.append(f23711e);
                Log.w("Downsampler", sb.toString());
            }
        }
        return this.f23716c;
    }

    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m21869c() {
        /*
            java.lang.String r0 = android.os.Build.MODEL
            r1 = 1
            if (r0 == 0) goto L_0x0071
            int r0 = r0.length()
            r2 = 7
            if (r0 >= r2) goto L_0x000e
            goto L_0x0071
        L_0x000e:
            java.lang.String r0 = android.os.Build.MODEL
            r3 = 0
            java.lang.String r0 = r0.substring(r3, r2)
            r2 = -1
            int r4 = r0.hashCode()
            switch(r4) {
                case -1398613787: goto L_0x005a;
                case -1398431166: goto L_0x0050;
                case -1398431161: goto L_0x0046;
                case -1398431073: goto L_0x003c;
                case -1398431068: goto L_0x0032;
                case -1398343746: goto L_0x0028;
                case -1398222624: goto L_0x001e;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0064
        L_0x001e:
            java.lang.String r4 = "SM-N935"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0064
            r0 = 0
            goto L_0x0065
        L_0x0028:
            java.lang.String r4 = "SM-J720"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0064
            r0 = 1
            goto L_0x0065
        L_0x0032:
            java.lang.String r4 = "SM-G965"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0064
            r0 = 3
            goto L_0x0065
        L_0x003c:
            java.lang.String r4 = "SM-G960"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0064
            r0 = 2
            goto L_0x0065
        L_0x0046:
            java.lang.String r4 = "SM-G935"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0064
            r0 = 4
            goto L_0x0065
        L_0x0050:
            java.lang.String r4 = "SM-G930"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0064
            r0 = 5
            goto L_0x0065
        L_0x005a:
            java.lang.String r4 = "SM-A520"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0064
            r0 = 6
            goto L_0x0065
        L_0x0064:
            r0 = -1
        L_0x0065:
            switch(r0) {
                case 0: goto L_0x0069;
                case 1: goto L_0x0069;
                case 2: goto L_0x0069;
                case 3: goto L_0x0069;
                case 4: goto L_0x0069;
                case 5: goto L_0x0069;
                case 6: goto L_0x0069;
                default: goto L_0x0068;
            }
        L_0x0068:
            return r1
        L_0x0069:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r0 == r2) goto L_0x0070
            goto L_0x0071
        L_0x0070:
            r1 = 0
        L_0x0071:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C9134r.m21869c():boolean");
    }

    /* renamed from: a */
    public boolean mo24642a(int i, int i2, boolean z, boolean z2) {
        if (!z || !this.f23714a || VERSION.SDK_INT < 26 || z2 || i < f23712f || i2 < f23712f || !m21868b()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    @TargetApi(26)
    /* renamed from: a */
    public boolean mo24641a(int i, int i2, Options options, boolean z, boolean z2) {
        boolean a = mo24642a(i, i2, z, z2);
        if (a) {
            options.inPreferredConfig = Config.HARDWARE;
            options.inMutable = false;
        }
        return a;
    }
}
