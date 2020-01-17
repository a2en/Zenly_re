package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import okhttp3.p418f0.C13184e;

/* renamed from: okhttp3.r */
public final class C13317r {

    /* renamed from: a */
    private final String[] f34460a;

    /* renamed from: okhttp3.r$a */
    public static final class C13318a {

        /* renamed from: a */
        final List<String> f34461a = new ArrayList(20);

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C13318a mo38270a(String str) {
            String str2 = ":";
            int indexOf = str.indexOf(str2, 1);
            if (indexOf != -1) {
                mo38274b(str.substring(0, indexOf), str.substring(indexOf + 1));
                return this;
            }
            String str3 = "";
            if (str.startsWith(str2)) {
                mo38274b(str3, str.substring(1));
                return this;
            }
            mo38274b(str3, str);
            return this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public C13318a mo38274b(String str, String str2) {
            this.f34461a.add(str);
            this.f34461a.add(str2.trim());
            return this;
        }

        /* renamed from: c */
        public C13318a mo38276c(String str, String str2) {
            C13317r.m35098c(str);
            mo38274b(str, str2);
            return this;
        }

        /* renamed from: d */
        public C13318a mo38277d(String str, String str2) {
            C13317r.m35098c(str);
            C13317r.m35097a(str2, str);
            mo38275c(str);
            mo38274b(str, str2);
            return this;
        }

        /* renamed from: b */
        public String mo38273b(String str) {
            for (int size = this.f34461a.size() - 2; size >= 0; size -= 2) {
                if (str.equalsIgnoreCase((String) this.f34461a.get(size))) {
                    return (String) this.f34461a.get(size + 1);
                }
            }
            return null;
        }

        /* renamed from: c */
        public C13318a mo38275c(String str) {
            int i = 0;
            while (i < this.f34461a.size()) {
                if (str.equalsIgnoreCase((String) this.f34461a.get(i))) {
                    this.f34461a.remove(i);
                    this.f34461a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        /* renamed from: a */
        public C13318a mo38271a(String str, String str2) {
            C13317r.m35098c(str);
            C13317r.m35097a(str2, str);
            mo38274b(str, str2);
            return this;
        }

        /* renamed from: a */
        public C13317r mo38272a() {
            return new C13317r(this);
        }
    }

    C13317r(C13318a aVar) {
        List<String> list = aVar.f34461a;
        this.f34460a = (String[]) list.toArray(new String[list.size()]);
    }

    /* renamed from: a */
    public String mo38261a(String str) {
        return m35095a(this.f34460a, str);
    }

    /* renamed from: b */
    public String mo38263b(int i) {
        return this.f34460a[(i * 2) + 1];
    }

    /* renamed from: c */
    public int mo38266c() {
        return this.f34460a.length / 2;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C13317r) && Arrays.equals(((C13317r) obj).f34460a, this.f34460a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f34460a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int c = mo38266c();
        for (int i = 0; i < c; i++) {
            sb.append(mo38260a(i));
            sb.append(": ");
            sb.append(mo38263b(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    /* renamed from: c */
    static void m35098c(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (!str.isEmpty()) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= ' ' || charAt >= 127) {
                    throw new IllegalArgumentException(C13184e.m34490a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                }
            }
        } else {
            throw new IllegalArgumentException("name is empty");
        }
    }

    /* renamed from: a */
    public String mo38260a(int i) {
        return this.f34460a[i * 2];
    }

    /* renamed from: b */
    public List<String> mo38264b(String str) {
        int c = mo38266c();
        ArrayList arrayList = null;
        for (int i = 0; i < c; i++) {
            if (str.equalsIgnoreCase(mo38260a(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(mo38263b(i));
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    private C13317r(String[] strArr) {
        this.f34460a = strArr;
    }

    /* renamed from: a */
    public Set<String> mo38262a() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int c = mo38266c();
        for (int i = 0; i < c; i++) {
            treeSet.add(mo38260a(i));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    /* renamed from: a */
    private static String m35095a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    /* renamed from: b */
    public C13318a mo38265b() {
        C13318a aVar = new C13318a();
        Collections.addAll(aVar.f34461a, this.f34460a);
        return aVar;
    }

    /* renamed from: a */
    public static C13317r m35096a(String... strArr) {
        if (strArr == null) {
            throw new NullPointerException("namesAndValues == null");
        } else if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            int i = 0;
            while (i < strArr2.length) {
                if (strArr2[i] != null) {
                    strArr2[i] = strArr2[i].trim();
                    i++;
                } else {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
            }
            for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
                String str = strArr2[i2];
                String str2 = strArr2[i2 + 1];
                m35098c(str);
                m35097a(str2, str);
            }
            return new C13317r(strArr2);
        } else {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
    }

    /* renamed from: a */
    static void m35097a(String str, String str2) {
        if (str != null) {
            int length = str.length();
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    i++;
                } else {
                    throw new IllegalArgumentException(C13184e.m34490a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
                }
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("value for name ");
        sb.append(str2);
        sb.append(" == null");
        throw new NullPointerException(sb.toString());
    }
}
