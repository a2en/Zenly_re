package androidx.core.p004os;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: androidx.core.os.f */
final class C0568f implements C0567e {

    /* renamed from: a */
    private final LocaleList f2637a;

    C0568f(LocaleList localeList) {
        this.f2637a = localeList;
    }

    /* renamed from: a */
    public Object mo3165a() {
        return this.f2637a;
    }

    public boolean equals(Object obj) {
        return this.f2637a.equals(((C0567e) obj).mo3165a());
    }

    public Locale get(int i) {
        return this.f2637a.get(i);
    }

    public int hashCode() {
        return this.f2637a.hashCode();
    }

    public String toString() {
        return this.f2637a.toString();
    }
}
