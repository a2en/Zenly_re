package okhttp3.internal.http;

import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import okhttp3.p418f0.C13184e;

/* renamed from: okhttp3.internal.http.c */
public final class C13246c {

    /* renamed from: a */
    private static final ThreadLocal<DateFormat> f34123a = new C13247a();

    /* renamed from: b */
    private static final String[] f34124b = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};

    /* renamed from: c */
    private static final DateFormat[] f34125c = new DateFormat[f34124b.length];

    /* renamed from: okhttp3.internal.http.c$a */
    class C13247a extends ThreadLocal<DateFormat> {
        C13247a() {
        }

        /* access modifiers changed from: protected */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(C13184e.f33862h);
            return simpleDateFormat;
        }
    }

    /* renamed from: a */
    public static Date m34782a(String str) {
        if (str.length() == 0) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = ((DateFormat) f34123a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        synchronized (f34124b) {
            int length = f34124b.length;
            for (int i = 0; i < length; i++) {
                DateFormat dateFormat = f34125c[i];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(f34124b[i], Locale.US);
                    dateFormat.setTimeZone(C13184e.f33862h);
                    f34125c[i] = dateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static String m34781a(Date date) {
        return ((DateFormat) f34123a.get()).format(date);
    }
}
