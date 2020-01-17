package com.android.volley.toolbox;

import com.android.volley.C8713d;
import com.android.volley.C8715f;
import com.android.volley.C8716g;
import com.android.volley.Cache.C8702a;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TimeZone;
import java.util.TreeMap;

/* renamed from: com.android.volley.toolbox.g */
public class C8730g {
    /* renamed from: a */
    public static C8702a m20562a(C8715f fVar) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        C8715f fVar2 = fVar;
        long currentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = fVar2.f22457c;
        String str = (String) map.get("Date");
        long a = str != null ? m20561a(str) : 0;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            j2 = 0;
            int i2 = 0;
            j = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j2 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    i2 = 1;
                }
                i++;
            }
            i = i2;
            z = true;
        } else {
            j2 = 0;
            j = 0;
            z = false;
        }
        String str3 = (String) map.get("Expires");
        long a2 = str3 != null ? m20561a(str3) : 0;
        String str4 = (String) map.get("Last-Modified");
        long a3 = str4 != null ? m20561a(str4) : 0;
        String str5 = (String) map.get("ETag");
        if (z) {
            j4 = currentTimeMillis + (j2 * 1000);
            if (i == 0) {
                Long.signum(j);
                j3 = (j * 1000) + j4;
                C8702a aVar = new C8702a();
                aVar.f22397a = fVar2.f22456b;
                aVar.f22398b = str5;
                aVar.f22402f = j4;
                aVar.f22401e = j3;
                aVar.f22399c = a;
                aVar.f22400d = a3;
                aVar.f22403g = map;
                aVar.f22404h = fVar2.f22458d;
                return aVar;
            }
        } else if (a <= 0 || a2 < a) {
            j4 = 0;
        } else {
            j3 = (a2 - a) + currentTimeMillis;
            j4 = j3;
            C8702a aVar2 = new C8702a();
            aVar2.f22397a = fVar2.f22456b;
            aVar2.f22398b = str5;
            aVar2.f22402f = j4;
            aVar2.f22401e = j3;
            aVar2.f22399c = a;
            aVar2.f22400d = a3;
            aVar2.f22403g = map;
            aVar2.f22404h = fVar2.f22458d;
            return aVar2;
        }
        j3 = j4;
        C8702a aVar22 = new C8702a();
        aVar22.f22397a = fVar2.f22456b;
        aVar22.f22398b = str5;
        aVar22.f22402f = j4;
        aVar22.f22401e = j3;
        aVar22.f22399c = a;
        aVar22.f22400d = a3;
        aVar22.f22403g = map;
        aVar22.f22404h = fVar2.f22458d;
        return aVar22;
    }

    /* renamed from: a */
    public static long m20561a(String str) {
        try {
            return m20565a().parse(str).getTime();
        } catch (ParseException e) {
            C8716g.m20506a(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0;
        }
    }

    /* renamed from: a */
    static String m20563a(long j) {
        return m20565a().format(new Date(j));
    }

    /* renamed from: a */
    private static SimpleDateFormat m20565a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    /* renamed from: a */
    public static String m20564a(Map<String, String> map, String str) {
        String str2 = (String) map.get("Content-Type");
        if (str2 != null) {
            String[] split = str2.split(";", 0);
            for (int i = 1; i < split.length; i++) {
                String[] split2 = split[i].trim().split("=", 0);
                if (split2.length == 2 && split2[0].equals("charset")) {
                    return split2[1];
                }
            }
        }
        return str;
    }

    /* renamed from: a */
    static Map<String, String> m20567a(List<C8713d> list) {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (C8713d dVar : list) {
            treeMap.put(dVar.mo23571a(), dVar.mo23572b());
        }
        return treeMap;
    }

    /* renamed from: a */
    static List<C8713d> m20566a(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Entry entry : map.entrySet()) {
            arrayList.add(new C8713d((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }
}
