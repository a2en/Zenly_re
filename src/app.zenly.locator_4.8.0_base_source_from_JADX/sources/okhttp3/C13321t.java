package okhttp3;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: okhttp3.t */
public final class C13321t {

    /* renamed from: e */
    private static final Pattern f34480e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: f */
    private static final Pattern f34481f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    private final String f34482a;

    /* renamed from: b */
    private final String f34483b;

    /* renamed from: c */
    private final String f34484c;

    /* renamed from: d */
    private final String f34485d;

    private C13321t(String str, String str2, String str3, String str4) {
        this.f34482a = str;
        this.f34483b = str2;
        this.f34484c = str3;
        this.f34485d = str4;
    }

    /* renamed from: a */
    public static C13321t m35171a(String str) {
        Matcher matcher = f34480e.matcher(str);
        if (matcher.lookingAt()) {
            String lowerCase = matcher.group(1).toLowerCase(Locale.US);
            String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
            String str2 = null;
            Matcher matcher2 = f34481f.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                String str3 = "\" for: \"";
                if (matcher2.lookingAt()) {
                    String group = matcher2.group(1);
                    if (group != null && group.equalsIgnoreCase("charset")) {
                        String group2 = matcher2.group(2);
                        if (group2 != null) {
                            String str4 = "'";
                            if (group2.startsWith(str4) && group2.endsWith(str4) && group2.length() > 2) {
                                group2 = group2.substring(1, group2.length() - 1);
                            }
                        } else {
                            group2 = matcher2.group(3);
                        }
                        if (str2 == null || group2.equalsIgnoreCase(str2)) {
                            str2 = group2;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Multiple charsets defined: \"");
                            sb.append(str2);
                            sb.append("\" and: \"");
                            sb.append(group2);
                            sb.append(str3);
                            sb.append(str);
                            sb.append('\"');
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                    end = matcher2.end();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Parameter is not formatted correctly: \"");
                    sb2.append(str.substring(end));
                    sb2.append(str3);
                    sb2.append(str);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
            return new C13321t(str, lowerCase, lowerCase2, str2);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("No subtype found for: \"");
        sb3.append(str);
        sb3.append('\"');
        throw new IllegalArgumentException(sb3.toString());
    }

    /* renamed from: b */
    public static C13321t m35172b(String str) {
        try {
            return m35171a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public String mo38317c() {
        return this.f34483b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13321t) && ((C13321t) obj).f34482a.equals(this.f34482a);
    }

    public int hashCode() {
        return this.f34482a.hashCode();
    }

    public String toString() {
        return this.f34482a;
    }

    /* renamed from: b */
    public String mo38316b() {
        return this.f34484c;
    }

    /* renamed from: a */
    public Charset mo38314a() {
        return mo38315a((Charset) null);
    }

    /* renamed from: a */
    public Charset mo38315a(Charset charset) {
        try {
            return this.f34485d != null ? Charset.forName(this.f34485d) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
