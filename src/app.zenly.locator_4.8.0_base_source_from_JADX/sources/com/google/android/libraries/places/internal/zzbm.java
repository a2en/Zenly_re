package com.google.android.libraries.places.internal;

import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.libraries.places.internal.zzcq;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;

abstract class zzbm<TypeT, RequestT extends zzcq> extends zzak<TypeT, RequestT> {
    private final Locale zza;
    private final String zzb;
    private final boolean zzc;
    private final zzcu zzd;

    protected zzbm(RequestT requestt, Locale locale, String str, boolean z, zzcu zzcu) {
        super(requestt);
        this.zza = locale;
        this.zzb = str;
        this.zzc = z;
        this.zzd = zzcu;
    }

    protected static void zza(Map<String, String> map, String str, Object obj, Object obj2) {
        String obj3 = obj != null ? obj.toString() : null;
        if (!TextUtils.isEmpty(obj3)) {
            map.put(str, obj3);
        }
    }

    /* access modifiers changed from: protected */
    public final Map<String, String> zzc() {
        HashMap hashMap = new HashMap();
        hashMap.put("X-Android-Package", this.zzd.zzb());
        hashMap.put("X-Android-Cert", this.zzd.zza());
        String str = this.zzc ? ".compat" : "";
        String str2 = "2.0.0";
        hashMap.put("X-Places-Android-Sdk", str.length() != 0 ? str2.concat(str) : new String(str2));
        return hashMap;
    }

    /* access modifiers changed from: protected */
    public final String zzd() {
        String str;
        Builder buildUpon = Uri.parse("https://maps.googleapis.com/").buildUpon();
        buildUpon.appendEncodedPath("maps/api/place/");
        buildUpon.appendEncodedPath(zzf());
        buildUpon.appendQueryParameter("key", this.zzb);
        Locale locale = this.zza;
        if (locale != null) {
            if (VERSION.SDK_INT < 21) {
                StringBuilder sb = new StringBuilder();
                String language = locale.getLanguage();
                if (!TextUtils.isEmpty(language)) {
                    sb.append(language);
                    String country = locale.getCountry();
                    if (!TextUtils.isEmpty(country)) {
                        sb.append("-");
                        sb.append(country);
                    }
                }
                str = sb.toString();
            } else {
                str = locale.toLanguageTag();
            }
            if (!TextUtils.isEmpty(str)) {
                buildUpon.appendQueryParameter("language", str);
            }
        }
        for (Entry entry : zze().entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon.build().toString();
    }

    /* access modifiers changed from: protected */
    public abstract Map<String, String> zze();

    /* access modifiers changed from: protected */
    public abstract String zzf();
}
