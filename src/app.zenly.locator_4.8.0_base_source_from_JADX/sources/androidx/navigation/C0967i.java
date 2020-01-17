package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: androidx.navigation.i */
class C0967i {

    /* renamed from: f */
    private static final Pattern f3698f = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: a */
    private final ArrayList<String> f3699a = new ArrayList<>();

    /* renamed from: b */
    private final Pattern f3700b;

    /* renamed from: c */
    private final boolean f3701c;

    /* renamed from: d */
    private final boolean f3702d;

    /* renamed from: e */
    private final Map<String, C0968a> f3703e = new HashMap();

    /* renamed from: androidx.navigation.i$a */
    private static class C0968a {

        /* renamed from: a */
        private String f3704a;

        /* renamed from: b */
        private ArrayList<String> f3705b = new ArrayList<>();

        C0968a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public String mo4717a() {
            return this.f3704a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4721b(String str) {
            this.f3704a = str;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4719a(String str) {
            this.f3705b.add(str);
        }

        /* renamed from: b */
        public int mo4720b() {
            return this.f3705b.size();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public String mo4718a(int i) {
            return (String) this.f3705b.get(i);
        }
    }

    C0967i(String str) {
        Uri parse = Uri.parse(str);
        this.f3702d = parse.getQuery() != null;
        StringBuilder sb = new StringBuilder("^");
        if (!f3698f.matcher(str).find()) {
            sb.append("http[s]?://");
        }
        Pattern compile = Pattern.compile("\\{(.+?)\\}");
        String str2 = "\\E.*\\Q";
        String str3 = ".*";
        if (this.f3702d) {
            Matcher matcher = Pattern.compile("(\\?)").matcher(str);
            if (matcher.find()) {
                m4317a(str.substring(0, matcher.start()), sb, compile);
                sb.append("(.+)?");
            }
            this.f3701c = false;
            for (String str4 : parse.getQueryParameterNames()) {
                StringBuilder sb2 = new StringBuilder();
                String queryParameter = parse.getQueryParameter(str4);
                Matcher matcher2 = compile.matcher(queryParameter);
                C0968a aVar = new C0968a();
                int i = 0;
                while (matcher2.find()) {
                    aVar.mo4719a(matcher2.group(1));
                    sb2.append(Pattern.quote(queryParameter.substring(i, matcher2.start())));
                    sb2.append("(.+?)?");
                    i = matcher2.end();
                }
                if (i < queryParameter.length()) {
                    sb2.append(Pattern.quote(queryParameter.substring(i)));
                }
                aVar.mo4721b(sb2.toString().replace(str3, str2));
                this.f3703e.put(str4, aVar);
            }
        } else {
            this.f3701c = m4317a(str, sb, compile);
        }
        this.f3700b = Pattern.compile(sb.toString().replace(str3, str2));
    }

    /* renamed from: a */
    private boolean m4317a(String str, StringBuilder sb, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        boolean z = !str.contains(".*");
        int i = 0;
        while (matcher.find()) {
            this.f3699a.add(matcher.group(1));
            sb.append(Pattern.quote(str.substring(i, matcher.start())));
            sb.append("(.+?)");
            i = matcher.end();
            z = false;
        }
        if (i < str.length()) {
            sb.append(Pattern.quote(str.substring(i)));
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo4716a() {
        return this.f3701c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Bundle mo4715a(Uri uri, Map<String, C0953f> map) {
        Matcher matcher;
        Matcher matcher2 = this.f3700b.matcher(uri.toString());
        if (!matcher2.matches()) {
            return null;
        }
        Bundle bundle = new Bundle();
        int size = this.f3699a.size();
        int i = 0;
        while (i < size) {
            String str = (String) this.f3699a.get(i);
            i++;
            if (m4316a(bundle, str, Uri.decode(matcher2.group(i)), (C0953f) map.get(str))) {
                return null;
            }
        }
        if (this.f3702d) {
            for (String str2 : this.f3703e.keySet()) {
                C0968a aVar = (C0968a) this.f3703e.get(str2);
                String queryParameter = uri.getQueryParameter(str2);
                if (queryParameter != null) {
                    matcher = Pattern.compile(aVar.mo4717a()).matcher(queryParameter);
                    if (!matcher.matches()) {
                        return null;
                    }
                } else {
                    matcher = null;
                }
                int i2 = 0;
                while (true) {
                    if (i2 < aVar.mo4720b()) {
                        String decode = matcher != null ? Uri.decode(matcher.group(i2 + 1)) : null;
                        String a = aVar.mo4718a(i2);
                        C0953f fVar = (C0953f) map.get(a);
                        if (fVar != null && (decode == null || decode.replaceAll("[{}]", "").equals(a))) {
                            if (fVar.mo4684a() != null) {
                                decode = fVar.mo4684a().toString();
                            } else if (fVar.mo4689d()) {
                                decode = "@null";
                            }
                        }
                        if (m4316a(bundle, a, decode, fVar)) {
                            return null;
                        }
                        i2++;
                    }
                }
            }
        }
        return bundle;
    }

    /* renamed from: a */
    private boolean m4316a(Bundle bundle, String str, String str2, C0953f fVar) {
        if (fVar != null) {
            try {
                fVar.mo4686b().mo4768a(bundle, str, str2);
            } catch (IllegalArgumentException unused) {
                return true;
            }
        } else {
            bundle.putString(str, str2);
        }
        return false;
    }
}
