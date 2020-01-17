package androidx.core.p004os;

import java.util.HashSet;
import java.util.Locale;

/* renamed from: androidx.core.os.d */
final class C0566d implements C0567e {

    /* renamed from: b */
    private static final Locale[] f2635b = new Locale[0];

    /* renamed from: a */
    private final Locale[] f2636a;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        C0565c.m2673a("en-Latn");
    }

    C0566d(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f2636a = f2635b;
            return;
        }
        Locale[] localeArr2 = new Locale[localeArr.length];
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < localeArr.length) {
            Locale locale = localeArr[i];
            String str = "list[";
            if (locale == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(i);
                sb2.append("] is null");
                throw new NullPointerException(sb2.toString());
            } else if (!hashSet.contains(locale)) {
                Locale locale2 = (Locale) locale.clone();
                localeArr2[i] = locale2;
                m2675a(sb, locale2);
                if (i < localeArr.length - 1) {
                    sb.append(',');
                }
                hashSet.add(locale2);
                i++;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(i);
                sb3.append("] is a repetition");
                throw new IllegalArgumentException(sb3.toString());
            }
        }
        this.f2636a = localeArr2;
        sb.toString();
    }

    /* renamed from: a */
    static void m2675a(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country != null && !country.isEmpty()) {
            sb.append('-');
            sb.append(locale.getCountry());
        }
    }

    /* renamed from: a */
    public Object mo3165a() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0566d)) {
            return false;
        }
        Locale[] localeArr = ((C0566d) obj).f2636a;
        if (this.f2636a.length != localeArr.length) {
            return false;
        }
        int i = 0;
        while (true) {
            Locale[] localeArr2 = this.f2636a;
            if (i >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
            i++;
        }
    }

    public Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f2636a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public int hashCode() {
        int i = 1;
        int i2 = 0;
        while (true) {
            Locale[] localeArr = this.f2636a;
            if (i2 >= localeArr.length) {
                return i;
            }
            i = (i * 31) + localeArr[i2].hashCode();
            i2++;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f2636a;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < this.f2636a.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
