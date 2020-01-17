package kotlin.text;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C12899i;
import kotlin.C12954o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import kotlin.ranges.C12960c;
import kotlin.ranges.C12963e;
import kotlin.sequences.Sequence;

/* renamed from: kotlin.text.r */
class C13029r extends C13028q {

    /* renamed from: kotlin.text.r$a */
    static final class C13030a extends C12933k implements Function2<CharSequence, Integer, C12899i<? extends Integer, ? extends Integer>> {

        /* renamed from: f */
        final /* synthetic */ List f33619f;

        /* renamed from: g */
        final /* synthetic */ boolean f33620g;

        C13030a(List list, boolean z) {
            this.f33619f = list;
            this.f33620g = z;
            super(2);
        }

        /* renamed from: a */
        public final C12899i<Integer, Integer> mo37415a(CharSequence charSequence, int i) {
            C12932j.m33818b(charSequence, "$receiver");
            C12899i a = C13029r.m34025b(charSequence, this.f33619f, i, this.f33620g, false);
            if (a != null) {
                return C12954o.m33853a(a.mo37204c(), Integer.valueOf(((String) a.mo37205d()).length()));
            }
            return null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return mo37415a((CharSequence) obj, ((Number) obj2).intValue());
        }
    }

    /* renamed from: kotlin.text.r$b */
    static final class C13031b extends C12933k implements Function1<C12963e, String> {

        /* renamed from: f */
        final /* synthetic */ CharSequence f33621f;

        C13031b(CharSequence charSequence) {
            this.f33621f = charSequence;
            super(1);
        }

        /* renamed from: a */
        public final String invoke(C12963e eVar) {
            C12932j.m33818b(eVar, "it");
            return C13029r.m34011a(this.f33621f, eVar);
        }
    }

    /* renamed from: b */
    public static final C12963e m34026b(CharSequence charSequence) {
        C12932j.m33818b(charSequence, "$this$indices");
        return new C12963e(0, charSequence.length() - 1);
    }

    /* renamed from: c */
    public static final int m34030c(CharSequence charSequence) {
        C12932j.m33818b(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    /* renamed from: d */
    public static final Sequence<String> m34031d(CharSequence charSequence) {
        C12932j.m33818b(charSequence, "$this$lineSequence");
        return m34028b(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, (Object) null);
    }

    /* renamed from: e */
    public static final List<String> m34032e(CharSequence charSequence) {
        C12932j.m33818b(charSequence, "$this$lines");
        return C12990j.m33935g(m34031d(charSequence));
    }

    /* renamed from: f */
    public static CharSequence m34033f(CharSequence charSequence) {
        C12932j.m33818b(charSequence, "$this$trim");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean a = C13003a.m33944a(charSequence.charAt(!z ? i : length));
            if (!z) {
                if (!a) {
                    z = true;
                } else {
                    i++;
                }
            } else if (!a) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    /* renamed from: a */
    public static final String m34011a(CharSequence charSequence, C12963e eVar) {
        C12932j.m33818b(charSequence, "$this$substring");
        C12932j.m33818b(eVar, "range");
        return charSequence.subSequence(eVar.getStart().intValue(), eVar.getEndInclusive().intValue() + 1).toString();
    }

    /* renamed from: b */
    public static boolean m34029b(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C12932j.m33818b(charSequence, "$this$startsWith");
        C12932j.m33818b(charSequence2, "prefix");
        if (!z && (charSequence instanceof String) && (charSequence2 instanceof String)) {
            return C13028q.m34003a((String) charSequence, (String) charSequence2, false, 2, null);
        }
        return m34020a(charSequence, 0, charSequence2, 0, charSequence2.length(), z);
    }

    /* renamed from: a */
    public static final boolean m34020a(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        C12932j.m33818b(charSequence, "$this$regionMatchesImpl");
        C12932j.m33818b(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C13004b.m33945a(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static final int m34010a(CharSequence charSequence, char[] cArr, int i, boolean z) {
        boolean z2;
        C12932j.m33818b(charSequence, "$this$indexOfAny");
        C12932j.m33818b(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            int a = C12973l.m33885a(i, 0);
            int c = m34030c(charSequence);
            if (a <= c) {
                while (true) {
                    char charAt = charSequence.charAt(a);
                    int length = cArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z2 = false;
                            break;
                        } else if (C13004b.m33945a(cArr[i2], charAt, z)) {
                            z2 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (!z2) {
                        if (a == c) {
                            break;
                        }
                        a++;
                    } else {
                        return a;
                    }
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(C12840k.m33566a(cArr), i);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final C12899i<Integer, String> m34025b(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        Object obj;
        Object obj2;
        C12899i<Integer, String> iVar = null;
        if (z || collection.size() != 1) {
            C12960c eVar = !z2 ? new C12963e(C12973l.m33885a(i, 0), charSequence.length()) : C12973l.m33893c(C12973l.m33890b(i, m34030c(charSequence)), 0);
            if (charSequence instanceof String) {
                int first = eVar.getFirst();
                int last = eVar.getLast();
                int a = eVar.mo37336a();
                if (a < 0 ? first >= last : first <= last) {
                    while (true) {
                        Iterator it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            String str = (String) obj2;
                            if (C13028q.m34001a(str, 0, (String) charSequence, first, str.length(), z)) {
                                break;
                            }
                        }
                        String str2 = (String) obj2;
                        if (str2 == null) {
                            if (first == last) {
                                break;
                            }
                            first += a;
                        } else {
                            return C12954o.m33853a(Integer.valueOf(first), str2);
                        }
                    }
                }
            } else {
                int first2 = eVar.getFirst();
                int last2 = eVar.getLast();
                int a2 = eVar.mo37336a();
                if (a2 < 0 ? first2 >= last2 : first2 <= last2) {
                    while (true) {
                        Iterator it2 = collection.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            String str3 = (String) obj;
                            if (m34020a((CharSequence) str3, 0, charSequence, first2, str3.length(), z)) {
                                break;
                            }
                        }
                        String str4 = (String) obj;
                        if (str4 == null) {
                            if (first2 == last2) {
                                break;
                            }
                            first2 += a2;
                        } else {
                            return C12954o.m33853a(Integer.valueOf(first2), str4);
                        }
                    }
                }
            }
            return null;
        }
        String str5 = (String) C12857w.m33685h((Iterable<? extends T>) collection);
        CharSequence charSequence2 = charSequence;
        String str6 = str5;
        int i2 = i;
        int a3 = !z2 ? m34009a(charSequence2, str6, i2, false, 4, (Object) null) : m34024b(charSequence2, str6, i2, false, 4, (Object) null);
        if (a3 >= 0) {
            iVar = C12954o.m33853a(Integer.valueOf(a3), str5);
        }
        return iVar;
    }

    /* renamed from: a */
    static /* synthetic */ int m34007a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        return m34006a(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    /* renamed from: a */
    private static final int m34006a(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C12960c cVar;
        if (!z2) {
            cVar = new C12963e(C12973l.m33885a(i, 0), C12973l.m33890b(i2, charSequence.length()));
        } else {
            cVar = C12973l.m33893c(C12973l.m33890b(i, m34030c(charSequence)), C12973l.m33885a(i2, 0));
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int first = cVar.getFirst();
            int last = cVar.getLast();
            int a = cVar.mo37336a();
            if (a < 0 ? first >= last : first <= last) {
                while (true) {
                    if (!m34020a(charSequence2, 0, charSequence, first, charSequence2.length(), z)) {
                        if (first == last) {
                            break;
                        }
                        first += a;
                    } else {
                        return first;
                    }
                }
            }
        } else {
            int first2 = cVar.getFirst();
            int last2 = cVar.getLast();
            int a2 = cVar.mo37336a();
            if (a2 < 0 ? first2 >= last2 : first2 <= last2) {
                while (true) {
                    if (!C13028q.m34001a((String) charSequence2, 0, (String) charSequence, first2, charSequence2.length(), z)) {
                        if (first2 == last2) {
                            break;
                        }
                        first2 += a2;
                    } else {
                        return first2;
                    }
                }
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static /* synthetic */ int m34024b(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m34030c(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m34023b(charSequence, str, i, z);
    }

    /* renamed from: a */
    public static /* synthetic */ int m34005a(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m34004a(charSequence, c, i, z);
    }

    /* renamed from: b */
    public static final int m34023b(CharSequence charSequence, String str, int i, boolean z) {
        C12932j.m33818b(charSequence, "$this$lastIndexOf");
        C12932j.m33818b(str, "string");
        if (z || !(charSequence instanceof String)) {
            return m34006a(charSequence, (CharSequence) str, i, 0, z, true);
        }
        return ((String) charSequence).lastIndexOf(str, i);
    }

    /* renamed from: a */
    public static final int m34004a(CharSequence charSequence, char c, int i, boolean z) {
        C12932j.m33818b(charSequence, "$this$indexOf");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return m34010a(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: b */
    public static /* synthetic */ Sequence m34028b(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m34027b(charSequence, strArr, z, i);
    }

    /* renamed from: a */
    public static /* synthetic */ int m34009a(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m34008a(charSequence, str, i, z);
    }

    /* renamed from: b */
    public static final Sequence<String> m34027b(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C12932j.m33818b(charSequence, "$this$splitToSequence");
        C12932j.m33818b(strArr, "delimiters");
        return C12990j.m33930c(m34017a(charSequence, strArr, 0, z, i, 2, null), new C13031b(charSequence));
    }

    /* renamed from: a */
    public static final int m34008a(CharSequence charSequence, String str, int i, boolean z) {
        C12932j.m33818b(charSequence, "$this$indexOf");
        C12932j.m33818b(str, "string");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return m34007a(charSequence, str, i, charSequence.length(), z, false, 16, null);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m34022a(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m34021a(charSequence, charSequence2, z);
    }

    /* renamed from: a */
    public static final boolean m34021a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        C12932j.m33818b(charSequence, "$this$contains");
        C12932j.m33818b(charSequence2, "other");
        if (charSequence2 instanceof String) {
            if (m34009a(charSequence, (String) charSequence2, 0, z, 2, (Object) null) >= 0) {
                return true;
            }
        } else {
            if (m34007a(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) >= 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m34019a(CharSequence charSequence, char c, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m34018a(charSequence, c, z);
    }

    /* renamed from: a */
    public static final boolean m34018a(CharSequence charSequence, char c, boolean z) {
        C12932j.m33818b(charSequence, "$this$contains");
        return m34005a(charSequence, c, 0, z, 2, (Object) null) >= 0;
    }

    /* renamed from: a */
    static /* synthetic */ Sequence m34017a(CharSequence charSequence, String[] strArr, int i, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return m34016a(charSequence, strArr, i, z, i2);
    }

    /* renamed from: a */
    private static final Sequence<C12963e> m34016a(CharSequence charSequence, String[] strArr, int i, boolean z, int i2) {
        if (i2 >= 0) {
            return new C13006d(charSequence, i, i2, new C13030a(C12838j.m33557a(strArr), z));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Limit must be non-negative, but was ");
        sb.append(i2);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* renamed from: a */
    public static /* synthetic */ List m34014a(CharSequence charSequence, String[] strArr, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m34013a(charSequence, strArr, z, i);
    }

    /* renamed from: a */
    public static final List<String> m34013a(CharSequence charSequence, String[] strArr, boolean z, int i) {
        C12932j.m33818b(charSequence, "$this$split");
        C12932j.m33818b(strArr, "delimiters");
        if (strArr.length == 1) {
            boolean z2 = false;
            String str = strArr[0];
            if (str.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                return m34012a(charSequence, str, z, i);
            }
        }
        Iterable<C12963e> b = C12990j.m33927b(m34017a(charSequence, strArr, 0, z, i, 2, null));
        ArrayList arrayList = new ArrayList(C12850p.m33647a(b, 10));
        for (C12963e a : b) {
            arrayList.add(m34011a(charSequence, a));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static final List<String> m34012a(CharSequence charSequence, String str, boolean z, int i) {
        int i2 = 0;
        if (i >= 0) {
            int a = m34008a(charSequence, str, 0, z);
            if (a == -1 || i == 1) {
                return C12846n.m33635a(charSequence.toString());
            }
            boolean z2 = i > 0;
            int i3 = 10;
            if (z2) {
                i3 = C12973l.m33890b(i, 10);
            }
            ArrayList arrayList = new ArrayList(i3);
            do {
                arrayList.add(charSequence.subSequence(i2, a).toString());
                i2 = str.length() + a;
                if (z2 && arrayList.size() == i - 1) {
                    break;
                }
                a = m34008a(charSequence, str, i2, z);
            } while (a != -1);
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Limit must be non-negative, but was ");
        sb.append(i);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }
}
