package com.google.android.gms.clearcut;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.android.volley.toolbox.C8733j;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.ApiOptions.C9989a;
import com.google.android.gms.common.api.Api.C9990a;
import com.google.android.gms.common.api.Api.C9993d;
import com.google.android.gms.common.api.C9998c;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C10123l;
import com.google.android.gms.common.util.C10169f;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.clearcut.C10271b;
import com.google.android.gms.internal.clearcut.C10289c5;
import com.google.android.gms.internal.clearcut.C10314g2;
import com.google.android.gms.internal.clearcut.C10355l4;
import com.google.android.gms.internal.clearcut.C10418v4;
import com.google.android.gms.internal.clearcut.C10436y4;
import com.google.android.gms.internal.clearcut.zzr;
import java.util.ArrayList;
import java.util.TimeZone;

public final class ClearcutLogger {

    /* renamed from: m */
    private static final C9993d<C10436y4> f26221m = new C9993d<>();

    /* renamed from: n */
    private static final C9990a<C10436y4, C9989a> f26222n = new C9985a();
    @Deprecated

    /* renamed from: o */
    public static final Api<C9989a> f26223o = new Api<>("ClearcutLogger.API", f26222n, f26221m);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f26224a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final String f26225b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f26226c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f26227d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f26228e = -1;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f26229f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final boolean f26230g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C10355l4 f26231h = C10355l4.DEFAULT;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final zzb f26232i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Clock f26233j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C9984b f26234k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final zza f26235l;

    /* renamed from: com.google.android.gms.clearcut.ClearcutLogger$a */
    public class C9983a {

        /* renamed from: a */
        private int f26236a;

        /* renamed from: b */
        private String f26237b;

        /* renamed from: c */
        private String f26238c;

        /* renamed from: d */
        private String f26239d;

        /* renamed from: e */
        private C10355l4 f26240e;

        /* renamed from: f */
        private boolean f26241f;

        /* renamed from: g */
        private final C10418v4 f26242g;

        /* renamed from: h */
        private boolean f26243h;

        private C9983a(ClearcutLogger clearcutLogger, byte[] bArr) {
            this(bArr, (zzb) null);
        }

        private C9983a(byte[] bArr, zzb zzb) {
            this.f26236a = ClearcutLogger.this.f26228e;
            this.f26237b = ClearcutLogger.this.f26227d;
            this.f26238c = ClearcutLogger.this.f26229f;
            ClearcutLogger clearcutLogger = ClearcutLogger.this;
            this.f26239d = null;
            this.f26240e = clearcutLogger.f26231h;
            this.f26241f = true;
            this.f26242g = new C10418v4();
            this.f26243h = false;
            this.f26238c = ClearcutLogger.this.f26229f;
            this.f26239d = null;
            this.f26242g.f27248z = C10271b.m25915a(ClearcutLogger.this.f26224a);
            this.f26242g.f27229g = ClearcutLogger.this.f26233j.currentTimeMillis();
            this.f26242g.f27230h = ClearcutLogger.this.f26233j.elapsedRealtime();
            C10418v4 v4Var = this.f26242g;
            ClearcutLogger.this.f26234k;
            v4Var.f27242t = (long) (TimeZone.getDefault().getOffset(this.f26242g.f27229g) / C8733j.DEFAULT_IMAGE_TIMEOUT_MS);
            if (bArr != null) {
                this.f26242g.f27237o = bArr;
            }
        }

        /* synthetic */ C9983a(ClearcutLogger clearcutLogger, byte[] bArr, C9985a aVar) {
            this(clearcutLogger, bArr);
        }

        /* renamed from: a */
        public void mo26971a() {
            if (!this.f26243h) {
                this.f26243h = true;
                zzr zzr = new zzr(ClearcutLogger.this.f26225b, ClearcutLogger.this.f26226c, this.f26236a, this.f26237b, this.f26238c, this.f26239d, ClearcutLogger.this.f26230g, this.f26240e);
                zze zze = new zze(zzr, this.f26242g, null, null, ClearcutLogger.m25016a(null), null, ClearcutLogger.m25016a(null), null, null, this.f26241f);
                if (ClearcutLogger.this.f26235l.zza(zze)) {
                    ClearcutLogger.this.f26232i.zzb(zze);
                } else {
                    C9998c.m25073a(Status.f26273i, null);
                }
            } else {
                throw new IllegalStateException("do not reuse LogEventBuilder");
            }
        }
    }

    /* renamed from: com.google.android.gms.clearcut.ClearcutLogger$b */
    public static class C9984b {
    }

    public interface zza {
        boolean zza(zze zze);
    }

    public interface zzb {
        byte[] zza();
    }

    private ClearcutLogger(Context context, int i, String str, String str2, String str3, boolean z, zzb zzb2, Clock clock, C9984b bVar, zza zza2) {
        this.f26224a = context;
        this.f26225b = context.getPackageName();
        this.f26226c = m25013a(context);
        this.f26228e = -1;
        this.f26227d = str;
        this.f26229f = str2;
        this.f26230g = z;
        this.f26232i = zzb2;
        this.f26233j = clock;
        this.f26234k = new C9984b();
        this.f26231h = C10355l4.DEFAULT;
        this.f26235l = zza2;
        if (z) {
            C10123l.m25513a(str2 == null, (Object) "can't be anonymous with an upload account");
        }
    }

    /* renamed from: a */
    private static int m25013a(Context context) {
        int i = 0;
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), i).versionCode;
        } catch (NameNotFoundException e) {
            Log.wtf("ClearcutLogger", "This can't happen.", e);
            return i;
        }
    }

    /* renamed from: a */
    public static ClearcutLogger m25015a(Context context, String str) {
        ClearcutLogger clearcutLogger = new ClearcutLogger(context, -1, str, null, null, true, C10314g2.m26121a(context), C10169f.m25664a(), null, new C10289c5(context));
        return clearcutLogger;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static int[] m25016a(ArrayList<Integer> arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            int i3 = i2 + 1;
            iArr[i2] = ((Integer) obj).intValue();
            i2 = i3;
        }
        return iArr;
    }

    /* renamed from: a */
    public final C9983a mo26970a(byte[] bArr) {
        return new C9983a(this, bArr, (C9985a) null);
    }
}
