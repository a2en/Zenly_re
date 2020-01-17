package okhttp3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: okhttp3.j */
public final class C13305j {

    /* renamed from: b */
    static final Comparator<String> f34388b = C13169b.f33818e;

    /* renamed from: c */
    private static final Map<String, C13305j> f34389c = new LinkedHashMap();

    /* renamed from: d */
    public static final C13305j f34390d = m35040a("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);

    /* renamed from: e */
    public static final C13305j f34391e = m35040a("TLS_RSA_WITH_AES_128_CBC_SHA", 47);

    /* renamed from: f */
    public static final C13305j f34392f = m35040a("TLS_RSA_WITH_AES_256_CBC_SHA", 53);

    /* renamed from: g */
    public static final C13305j f34393g = m35040a("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);

    /* renamed from: h */
    public static final C13305j f34394h = m35040a("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);

    /* renamed from: i */
    public static final C13305j f34395i = m35040a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);

    /* renamed from: j */
    public static final C13305j f34396j = m35040a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);

    /* renamed from: k */
    public static final C13305j f34397k = m35040a("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);

    /* renamed from: l */
    public static final C13305j f34398l = m35040a("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);

    /* renamed from: m */
    public static final C13305j f34399m = m35040a("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);

    /* renamed from: n */
    public static final C13305j f34400n = m35040a("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);

    /* renamed from: o */
    public static final C13305j f34401o = m35040a("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);

    /* renamed from: p */
    public static final C13305j f34402p = m35040a("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);

    /* renamed from: q */
    public static final C13305j f34403q = m35040a("TLS_AES_128_GCM_SHA256", 4865);

    /* renamed from: r */
    public static final C13305j f34404r = m35040a("TLS_AES_256_GCM_SHA384", 4866);

    /* renamed from: s */
    public static final C13305j f34405s = m35040a("TLS_CHACHA20_POLY1305_SHA256", 4867);

    /* renamed from: a */
    final String f34406a;

    static {
        m35040a("SSL_RSA_WITH_NULL_MD5", 1);
        m35040a("SSL_RSA_WITH_NULL_SHA", 2);
        m35040a("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        m35040a("SSL_RSA_WITH_RC4_128_MD5", 4);
        m35040a("SSL_RSA_WITH_RC4_128_SHA", 5);
        m35040a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        m35040a("SSL_RSA_WITH_DES_CBC_SHA", 9);
        m35040a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        m35040a("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        m35040a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        m35040a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        m35040a("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        m35040a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        m35040a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        m35040a("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        m35040a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        m35040a("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        m35040a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        m35040a("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        m35040a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        m35040a("TLS_KRB5_WITH_RC4_128_SHA", 32);
        m35040a("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        m35040a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        m35040a("TLS_KRB5_WITH_RC4_128_MD5", 36);
        m35040a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        m35040a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        m35040a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        m35040a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        m35040a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        m35040a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        m35040a("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        m35040a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        m35040a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        m35040a("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        m35040a("TLS_RSA_WITH_NULL_SHA256", 59);
        m35040a("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        m35040a("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        m35040a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        m35040a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        m35040a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        m35040a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        m35040a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        m35040a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        m35040a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        m35040a("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        m35040a("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        m35040a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        m35040a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        m35040a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        m35040a("TLS_PSK_WITH_RC4_128_SHA", 138);
        m35040a("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        m35040a("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        m35040a("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        m35040a("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        m35040a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        m35040a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        m35040a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        m35040a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        m35040a("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        m35040a("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        m35040a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        m35040a("TLS_FALLBACK_SCSV", 22016);
        m35040a("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        m35040a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        m35040a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        m35040a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        m35040a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        m35040a("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        m35040a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        m35040a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        m35040a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        m35040a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        m35040a("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        m35040a("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        m35040a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        m35040a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        m35040a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        m35040a("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        m35040a("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        m35040a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        m35040a("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        m35040a("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        m35040a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        m35040a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        m35040a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        m35040a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        m35040a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        m35040a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        m35040a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        m35040a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        m35040a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        m35040a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        m35040a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        m35040a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        m35040a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        m35040a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        m35040a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        m35040a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        m35040a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        m35040a("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        m35040a("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        m35040a("TLS_AES_128_CCM_SHA256", 4868);
        m35040a("TLS_AES_128_CCM_8_SHA256", 4869);
    }

    private C13305j(String str) {
        if (str != null) {
            this.f34406a = str;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    static /* synthetic */ int m35037a(String str, String str2) {
        int min = Math.min(str.length(), str2.length());
        int i = 4;
        while (true) {
            int i2 = -1;
            if (i < min) {
                char charAt = str.charAt(i);
                char charAt2 = str2.charAt(i);
                if (charAt != charAt2) {
                    if (charAt >= charAt2) {
                        i2 = 1;
                    }
                    return i2;
                }
                i++;
            } else {
                int length = str.length();
                int length2 = str2.length();
                if (length == length2) {
                    return 0;
                }
                if (length >= length2) {
                    i2 = 1;
                }
                return i2;
            }
        }
    }

    /* renamed from: b */
    private static String m35041b(String str) {
        String str2 = "TLS_";
        String str3 = "SSL_";
        if (str.startsWith(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            sb.append(str.substring(4));
            return sb.toString();
        }
        if (str.startsWith(str3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str.substring(4));
            str = sb2.toString();
        }
        return str;
    }

    public String toString() {
        return this.f34406a;
    }

    /* renamed from: a */
    public static synchronized C13305j m35039a(String str) {
        C13305j jVar;
        synchronized (C13305j.class) {
            jVar = (C13305j) f34389c.get(str);
            if (jVar == null) {
                jVar = (C13305j) f34389c.get(m35041b(str));
                if (jVar == null) {
                    jVar = new C13305j(str);
                }
                f34389c.put(str, jVar);
            }
        }
        return jVar;
    }

    /* renamed from: a */
    static List<C13305j> m35038a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String a : strArr) {
            arrayList.add(m35039a(a));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* renamed from: a */
    private static C13305j m35040a(String str, int i) {
        C13305j jVar = new C13305j(str);
        f34389c.put(str, jVar);
        return jVar;
    }

    /* renamed from: a */
    public String mo38218a() {
        return this.f34406a;
    }
}
