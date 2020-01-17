package okhttp3.p418f0;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.AccessControlException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.C13170b0;
import okhttp3.C13317r;
import okhttp3.C13317r.C13318a;
import okhttp3.C13319s;
import okhttp3.C13321t;
import okhttp3.C13333z;
import okhttp3.internal.http2.C13257b;
import okio.BufferedSource;
import okio.C13342c;
import okio.C13346d;
import okio.C13359m;
import okio.Source;

/* renamed from: okhttp3.f0.e */
public final class C13184e {

    /* renamed from: a */
    public static final byte[] f33855a = new byte[0];

    /* renamed from: b */
    public static final String[] f33856b = new String[0];

    /* renamed from: c */
    public static final C13317r f33857c = C13317r.m35096a(new String[0]);

    /* renamed from: d */
    public static final C13170b0 f33858d = C13170b0.m34434a((C13321t) null, f33855a);

    /* renamed from: e */
    private static final C13359m f33859e = C13359m.m35391a(C13346d.m35332b("efbbbf"), C13346d.m35332b("feff"), C13346d.m35332b("fffe"), C13346d.m35332b("0000ffff"), C13346d.m35332b("ffff0000"));

    /* renamed from: f */
    private static final Charset f33860f = Charset.forName("UTF-32BE");

    /* renamed from: g */
    private static final Charset f33861g = Charset.forName("UTF-32LE");

    /* renamed from: h */
    public static final TimeZone f33862h = TimeZone.getTimeZone("GMT");

    /* renamed from: i */
    public static final Comparator<String> f33863i = C13180a.f33850e;

    /* renamed from: j */
    private static final Method f33864j;

    /* renamed from: k */
    private static final Pattern f33865k = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    static {
        Method method = null;
        C13333z.m35283a((C13321t) null, f33855a);
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Exception unused) {
        }
        f33864j = method;
    }

    /* renamed from: a */
    public static int m34483a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    /* renamed from: a */
    public static void m34504a(Throwable th, Throwable th2) {
        Method method = f33864j;
        if (method != null) {
            try {
                method.invoke(th, new Object[]{th2});
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m34516b(Source source, int i, TimeUnit timeUnit) throws IOException {
        long nanoTime = System.nanoTime();
        long c = source.timeout().mo38545d() ? source.timeout().mo38544c() - nanoTime : Long.MAX_VALUE;
        source.timeout().mo38541a(Math.min(c, timeUnit.toNanos((long) i)) + nanoTime);
        try {
            C13342c cVar = new C13342c();
            while (source.read(cVar, 8192) != -1) {
                cVar.clear();
            }
            if (c == Long.MAX_VALUE) {
                source.timeout().mo38540a();
            } else {
                source.timeout().mo38541a(nanoTime + c);
            }
            return true;
        } catch (InterruptedIOException unused) {
            if (c == Long.MAX_VALUE) {
                source.timeout().mo38540a();
            } else {
                source.timeout().mo38541a(nanoTime + c);
            }
            return false;
        } catch (Throwable th) {
            if (c == Long.MAX_VALUE) {
                source.timeout().mo38540a();
            } else {
                source.timeout().mo38541a(nanoTime + c);
            }
            throw th;
        }
    }

    /* renamed from: c */
    public static int m34518c(String str, int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            char charAt = str.charAt(i3);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i3 + 1;
            }
        }
        return i;
    }

    /* renamed from: d */
    public static String m34519d(String str, int i, int i2) {
        int b = m34512b(str, i, i2);
        return str.substring(b, m34518c(str, b, i2));
    }

    /* renamed from: c */
    public static int m34517c(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static void m34502a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: a */
    public static void m34503a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: d */
    public static boolean m34520d(String str) {
        return f33865k.matcher(str).matches();
    }

    /* renamed from: a */
    public static void m34505a(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (AssertionError e) {
                if (!m34506a(e)) {
                    throw e;
                }
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m34509a(Source source, int i, TimeUnit timeUnit) {
        try {
            return m34516b(source, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static <T> List<T> m34496a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: a */
    public static <K, V> Map<K, V> m34499a(Map<K, V> map) {
        if (map.isEmpty()) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    @SafeVarargs
    /* renamed from: a */
    public static <T> List<T> m34498a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* renamed from: b */
    public static boolean m34515b(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0 || strArr2.length == 0)) {
            for (String str : strArr) {
                for (String compare : strArr2) {
                    if (comparator.compare(str, compare) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static ThreadFactory m34500a(String str, boolean z) {
        return new C13181b(str, z);
    }

    /* renamed from: a */
    static /* synthetic */ Thread m34493a(String str, boolean z, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    /* renamed from: a */
    public static String[] m34510a(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = strArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (comparator.compare(str, strArr2[i]) == 0) {
                    arrayList.add(str);
                    break;
                } else {
                    i++;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: b */
    public static int m34512b(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != 9 && charAt != 10 && charAt != 12 && charAt != 13 && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: b */
    private static boolean m34514b(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static C13317r m34513b(List<C13257b> list) {
        C13318a aVar = new C13318a();
        for (C13257b bVar : list) {
            C13182c.f33853a.mo37871a(aVar, bVar.f34164a.mo38532j(), bVar.f34165b.mo38532j());
        }
        return aVar.mo38272a();
    }

    /* renamed from: a */
    public static String m34491a(C13319s sVar, boolean z) {
        String str;
        String str2 = ":";
        if (sVar.mo38288g().contains(str2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(sVar.mo38288g());
            sb.append("]");
            str = sb.toString();
        } else {
            str = sVar.mo38288g();
        }
        if (!z && sVar.mo38293k() == C13319s.m35125d(sVar.mo38297o())) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        sb2.append(sVar.mo38293k());
        return sb2.toString();
    }

    /* renamed from: a */
    public static boolean m34506a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    /* renamed from: a */
    public static int m34487a(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static String[] m34511a(String[] strArr, String str) {
        String[] strArr2 = new String[(strArr.length + 1)];
        System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
        strArr2[strArr2.length - 1] = str;
        return strArr2;
    }

    /* renamed from: a */
    public static int m34485a(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    public static int m34484a(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    /* renamed from: a */
    public static String m34488a(String str) {
        InetAddress inetAddress;
        if (str.contains(":")) {
            if (!str.startsWith("[") || !str.endsWith("]")) {
                inetAddress = m34494a(str, 0, str.length());
            } else {
                inetAddress = m34494a(str, 1, str.length() - 1);
            }
            if (inetAddress == null) {
                return null;
            }
            byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                return m34492a(address);
            }
            if (address.length == 4) {
                return inetAddress.getHostAddress();
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid IPv6 address: '");
            sb.append(str);
            sb.append("'");
            throw new AssertionError(sb.toString());
        }
        try {
            String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
            if (!lowerCase.isEmpty() && !m34514b(lowerCase)) {
                return lowerCase;
            }
            return null;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m34490a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* renamed from: a */
    public static Charset m34495a(BufferedSource bufferedSource, Charset charset) throws IOException {
        int select = bufferedSource.select(f33859e);
        if (select == -1) {
            return charset;
        }
        if (select == 0) {
            return StandardCharsets.UTF_8;
        }
        if (select == 1) {
            return StandardCharsets.UTF_16BE;
        }
        if (select == 2) {
            return StandardCharsets.UTF_16LE;
        }
        if (select == 3) {
            return f33860f;
        }
        if (select == 4) {
            return f33861g;
        }
        throw new AssertionError();
    }

    /* renamed from: a */
    public static int m34486a(String str, long j, TimeUnit timeUnit) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" < 0");
            throw new IllegalArgumentException(sb.toString());
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" too large.");
                throw new IllegalArgumentException(sb2.toString());
            } else if (millis != 0 || i <= 0) {
                return (int) millis;
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" too small.");
                throw new IllegalArgumentException(sb3.toString());
            }
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    /* renamed from: a */
    private static InetAddress m34494a(String str, int i, int i2) {
        byte[] bArr = new byte[16];
        int i3 = 0;
        int i4 = -1;
        int i5 = -1;
        while (true) {
            if (i >= i2) {
                break;
            } else if (i3 == bArr.length) {
                return null;
            } else {
                int i6 = i + 2;
                if (i6 > i2 || !str.regionMatches(i, "::", 0, 2)) {
                    if (i3 != 0) {
                        if (str.regionMatches(i, ":", 0, 1)) {
                            i++;
                        } else if (!str.regionMatches(i, ".", 0, 1) || !m34507a(str, i5, i2, bArr, i3 - 2)) {
                            return null;
                        } else {
                            i3 += 2;
                        }
                    }
                    i5 = i;
                } else if (i4 != -1) {
                    return null;
                } else {
                    i3 += 2;
                    i4 = i3;
                    if (i6 == i2) {
                        break;
                    }
                    i5 = i6;
                }
                i = i5;
                int i7 = 0;
                while (i < i2) {
                    int a = m34483a(str.charAt(i));
                    if (a == -1) {
                        break;
                    }
                    i7 = (i7 << 4) + a;
                    i++;
                }
                int i8 = i - i5;
                if (i8 == 0 || i8 > 4) {
                    return null;
                }
                int i9 = i3 + 1;
                bArr[i3] = (byte) ((i7 >>> 8) & 255);
                i3 = i9 + 1;
                bArr[i9] = (byte) (i7 & 255);
            }
        }
        if (i3 != bArr.length) {
            if (i4 == -1) {
                return null;
            }
            int i10 = i3 - i4;
            System.arraycopy(bArr, i4, bArr, bArr.length - i10, i10);
            Arrays.fill(bArr, i4, (bArr.length - i3) + i4, 0);
        }
        try {
            return InetAddress.getByAddress(bArr);
        } catch (UnknownHostException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    private static boolean m34507a(String str, int i, int i2, byte[] bArr, int i3) {
        int i4 = i3;
        while (i < i2) {
            if (i4 == bArr.length) {
                return false;
            }
            if (i4 != i3) {
                if (str.charAt(i) != '.') {
                    return false;
                }
                i++;
            }
            int i5 = i;
            int i6 = 0;
            while (i5 < i2) {
                char charAt = str.charAt(i5);
                if (charAt < '0' || charAt > '9') {
                    break;
                } else if (i6 == 0 && i != i5) {
                    return false;
                } else {
                    i6 = ((i6 * 10) + charAt) - 48;
                    if (i6 > 255) {
                        return false;
                    }
                    i5++;
                }
            }
            if (i5 - i == 0) {
                return false;
            }
            int i7 = i4 + 1;
            bArr[i4] = (byte) i6;
            i4 = i7;
            i = i5;
        }
        if (i4 != i3 + 4) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static String m34492a(byte[] bArr) {
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (i2 < bArr.length) {
            int i5 = i2;
            while (i5 < 16 && bArr[i5] == 0 && bArr[i5 + 1] == 0) {
                i5 += 2;
            }
            int i6 = i5 - i2;
            if (i6 > i4 && i6 >= 4) {
                i3 = i2;
                i4 = i6;
            }
            i2 = i5 + 2;
        }
        C13342c cVar = new C13342c();
        while (i < bArr.length) {
            if (i == i3) {
                cVar.writeByte(58);
                i += i4;
                if (i == 16) {
                    cVar.writeByte(58);
                }
            } else {
                if (i > 0) {
                    cVar.writeByte(58);
                }
                cVar.writeHexadecimalUnsignedLong((long) (((bArr[i] & 255) << 8) | (bArr[i + 1] & 255)));
                i += 2;
            }
        }
        return cVar.readUtf8();
    }

    /* renamed from: a */
    public static X509TrustManager m34501a() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init(null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                return (X509TrustManager) trustManagers[0];
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected default trust managers:");
            sb.append(Arrays.toString(trustManagers));
            throw new IllegalStateException(sb.toString());
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS", e);
        }
    }

    /* renamed from: a */
    public static List<C13257b> m34497a(C13317r rVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < rVar.mo38266c(); i++) {
            arrayList.add(new C13257b(rVar.mo38260a(i), rVar.mo38263b(i)));
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m34489a(String str, String str2) {
        try {
            String property = System.getProperty(str);
            if (property == null) {
                property = str2;
            }
            return property;
        } catch (AccessControlException unused) {
            return str2;
        }
    }

    /* renamed from: a */
    public static boolean m34508a(C13319s sVar, C13319s sVar2) {
        return sVar.mo38288g().equals(sVar2.mo38288g()) && sVar.mo38293k() == sVar2.mo38293k() && sVar.mo38297o().equals(sVar2.mo38297o());
    }
}
