package com.google.android.gms.internal.clearcut;

import android.content.Context;
import android.util.Log;
import com.appsflyer.share.Constants;
import com.google.android.gms.clearcut.ClearcutLogger.zza;
import com.google.android.gms.clearcut.zze;
import com.google.android.gms.common.p309i.C10079b;
import com.google.android.gms.internal.clearcut.C10385q4.C10387b;
import com.google.android.gms.internal.clearcut.C10385q4.C10387b.C10388a;
import com.google.android.gms.phenotype.C10666a;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.clearcut.c5 */
public final class C10289c5 implements zza {

    /* renamed from: b */
    private static final Charset f26939b = Charset.forName("UTF-8");

    /* renamed from: c */
    private static final C10362n f26940c;

    /* renamed from: d */
    private static final C10362n f26941d;

    /* renamed from: e */
    private static final ConcurrentHashMap<String, C10297e<C10385q4>> f26942e = new ConcurrentHashMap<>();

    /* renamed from: f */
    private static final HashMap<String, C10297e<String>> f26943f = new HashMap<>();

    /* renamed from: g */
    private static Boolean f26944g = null;

    /* renamed from: h */
    private static Long f26945h = null;

    /* renamed from: i */
    private static final C10297e<Boolean> f26946i = f26940c.mo28063a("enable_log_sampling_rules", false);

    /* renamed from: a */
    private final Context f26947a;

    static {
        String str = "com.google.android.gms.clearcut.public";
        f26940c = new C10362n(C10666a.m27182a(str)).mo28064a("gms:playlog:service:samplingrules_").mo28065b("LogSamplingRules__");
        f26941d = new C10362n(C10666a.m27182a(str)).mo28064a("gms:playlog:service:sampling_").mo28065b("LogSampling__");
    }

    public C10289c5(Context context) {
        this.f26947a = context;
        Context context2 = this.f26947a;
        if (context2 != null) {
            C10297e.m26044a(context2);
        }
    }

    /* renamed from: a */
    private static long m26007a(String str, long j) {
        if (str == null || str.isEmpty()) {
            return C10442z4.m26659a(ByteBuffer.allocate(8).putLong(j).array());
        }
        byte[] bytes = str.getBytes(f26939b);
        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 8);
        allocate.put(bytes);
        allocate.putLong(j);
        return C10442z4.m26659a(allocate.array());
    }

    /* renamed from: a */
    private static C10387b m26008a(String str) {
        String str2;
        int i;
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(44);
        if (indexOf >= 0) {
            str2 = str.substring(0, indexOf);
            i = indexOf + 1;
        } else {
            str2 = "";
            i = 0;
        }
        int indexOf2 = str.indexOf(47, i);
        String str3 = "LogSamplerImpl";
        if (indexOf2 <= 0) {
            String str4 = "Failed to parse the rule: ";
            String valueOf = String.valueOf(str);
            Log.e(str3, valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4));
            return null;
        }
        try {
            long parseLong = Long.parseLong(str.substring(i, indexOf2));
            long parseLong2 = Long.parseLong(str.substring(indexOf2 + 1));
            if (parseLong < 0 || parseLong2 < 0) {
                StringBuilder sb = new StringBuilder(72);
                sb.append("negative values not supported: ");
                sb.append(parseLong);
                sb.append(Constants.URL_PATH_DELIMITER);
                sb.append(parseLong2);
                Log.e(str3, sb.toString());
                return null;
            }
            C10388a h = C10387b.m26478h();
            h.mo28112a(str2);
            h.mo28111a(parseLong);
            h.mo28113b(parseLong2);
            return (C10387b) h.mo27817c();
        } catch (NumberFormatException e) {
            String str5 = "parseLong() failed while parsing: ";
            String valueOf2 = String.valueOf(str);
            Log.e(str3, valueOf2.length() != 0 ? str5.concat(valueOf2) : new String(str5), e);
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m26009a(long j, long j2, long j3) {
        if (j2 >= 0 && j3 > 0) {
            if ((j >= 0 ? j % j3 : (((Long.MAX_VALUE % j3) + 1) + ((j & Long.MAX_VALUE) % j3)) % j3) >= j2) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m26010a(Context context) {
        if (f26944g == null) {
            f26944g = Boolean.valueOf(C10079b.m25337a(context).mo27330a("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
        }
        return f26944g.booleanValue();
    }

    /* renamed from: b */
    private static long m26011b(Context context) {
        if (f26945h == null) {
            long j = 0;
            if (context == null) {
                return 0;
            }
            if (m26010a(context)) {
                j = C10310f5.m26109a(context.getContentResolver(), "android_id", 0);
            }
            f26945h = Long.valueOf(j);
        }
        return f26945h.longValue();
    }

    public final boolean zza(zze zze) {
        List<C10387b> list;
        zzr zzr = zze.f26248e;
        String str = zzr.f27369k;
        int i = zzr.f27365g;
        C10418v4 v4Var = zze.f26256m;
        int i2 = v4Var != null ? v4Var.f27232j : 0;
        String str2 = null;
        if (!((Boolean) f26946i.mo27883a()).booleanValue()) {
            if (str == null || str.isEmpty()) {
                str = i >= 0 ? String.valueOf(i) : null;
            }
            if (str != null) {
                Context context = this.f26947a;
                if (context != null && m26010a(context)) {
                    C10297e eVar = (C10297e) f26943f.get(str);
                    if (eVar == null) {
                        eVar = f26941d.mo28062a(str, (String) null);
                        f26943f.put(str, eVar);
                    }
                    str2 = (String) eVar.mo27883a();
                }
                C10387b a = m26008a(str2);
                if (a != null) {
                    return m26009a(m26007a(a.mo28108e(), m26011b(this.f26947a)), a.mo28109f(), a.mo28110g());
                }
            }
        } else {
            if (str == null || str.isEmpty()) {
                str = i >= 0 ? String.valueOf(i) : null;
            }
            if (str != null) {
                if (this.f26947a == null) {
                    list = Collections.emptyList();
                } else {
                    C10297e eVar2 = (C10297e) f26942e.get(str);
                    if (eVar2 == null) {
                        eVar2 = f26940c.mo28061a(str, C10385q4.m26468d(), C10296d5.f26956a);
                        C10297e eVar3 = (C10297e) f26942e.putIfAbsent(str, eVar2);
                        if (eVar3 != null) {
                            eVar2 = eVar3;
                        }
                    }
                    list = ((C10385q4) eVar2.mo27883a()).mo28105c();
                }
                for (C10387b bVar : list) {
                    if ((!bVar.mo28107d() || bVar.mo28106c() == 0 || bVar.mo28106c() == i2) && !m26009a(m26007a(bVar.mo28108e(), m26011b(this.f26947a)), bVar.mo28109f(), bVar.mo28110g())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
