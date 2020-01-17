package androidx.core.p004os;

import android.os.Build.VERSION;
import android.os.LocaleList;
import java.util.Locale;

/* renamed from: androidx.core.os.c */
public final class C0565c {

    /* renamed from: a */
    private C0567e f2634a;

    static {
        m2672a(new Locale[0]);
    }

    private C0565c(C0567e eVar) {
        this.f2634a = eVar;
    }

    /* renamed from: a */
    public static C0565c m2671a(LocaleList localeList) {
        return new C0565c(new C0568f(localeList));
    }

    public boolean equals(Object obj) {
        return (obj instanceof C0565c) && this.f2634a.equals(((C0565c) obj).f2634a);
    }

    public int hashCode() {
        return this.f2634a.hashCode();
    }

    public String toString() {
        return this.f2634a.toString();
    }

    /* renamed from: a */
    public static C0565c m2672a(Locale... localeArr) {
        if (VERSION.SDK_INT >= 24) {
            return m2671a(new LocaleList(localeArr));
        }
        return new C0565c(new C0566d(localeArr));
    }

    /* renamed from: a */
    public Locale mo3161a(int i) {
        return this.f2634a.get(i);
    }

    /* renamed from: a */
    static Locale m2673a(String str) {
        String str2 = "-";
        if (str.contains(str2)) {
            String[] split = str.split(str2, -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else {
            String str3 = "_";
            if (!str.contains(str3)) {
                return new Locale(str);
            }
            String[] split2 = str.split(str3, -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can not parse language tag: [");
        sb.append(str);
        sb.append("]");
        throw new IllegalArgumentException(sb.toString());
    }
}
