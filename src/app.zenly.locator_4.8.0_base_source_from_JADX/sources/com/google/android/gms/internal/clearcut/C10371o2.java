package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.clearcut.o2 */
final class C10371o2 {

    /* renamed from: a */
    private static final Class<?> f27156a = m26396d();

    /* renamed from: b */
    private static final C10294d3<?, ?> f27157b = m26370a(false);

    /* renamed from: c */
    private static final C10294d3<?, ?> f27158c = m26370a(true);

    /* renamed from: d */
    private static final C10294d3<?, ?> f27159d = new C10308f3();

    /* renamed from: a */
    static int m26364a(int i, Object obj, C10359m2 m2Var) {
        return obj instanceof C10332j1 ? zzbn.m26662a(i, (C10332j1) obj) : zzbn.m26675b(i, (zzdo) obj, m2Var);
    }

    /* renamed from: a */
    static int m26365a(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int e = zzbn.m26689e(i) * size;
        if (list instanceof zzcx) {
            zzcx zzcx = (zzcx) list;
            while (i2 < size) {
                Object raw = zzcx.getRaw(i2);
                e += raw instanceof C10431y ? zzbn.m26664a((C10431y) raw) : zzbn.m26667a((String) raw);
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                e += obj instanceof C10431y ? zzbn.m26664a((C10431y) obj) : zzbn.m26667a((String) obj);
                i2++;
            }
        }
        return e;
    }

    /* renamed from: a */
    static int m26366a(int i, List<?> list, C10359m2 m2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = zzbn.m26689e(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            e += obj instanceof C10332j1 ? zzbn.m26663a((C10332j1) obj) : zzbn.m26666a((zzdo) obj, m2Var);
        }
        return e;
    }

    /* renamed from: a */
    static int m26367a(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return m26368a(list) + (list.size() * zzbn.m26689e(i));
    }

    /* renamed from: a */
    static int m26368a(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C10376p1) {
            C10376p1 p1Var = (C10376p1) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.m26688d(p1Var.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbn.m26688d(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public static C10294d3<?, ?> m26369a() {
        return f27157b;
    }

    /* renamed from: a */
    private static C10294d3<?, ?> m26370a(boolean z) {
        try {
            Class e = m26400e();
            if (e == null) {
                return null;
            }
            return (C10294d3) e.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static <UT, UB> UB m26371a(int i, int i2, UB ub, C10294d3<UT, UB> d3Var) {
        if (ub == null) {
            ub = d3Var.mo27866a();
        }
        d3Var.mo27868a(ub, i, (long) i2);
        return ub;
    }

    /* renamed from: a */
    static <UT, UB> UB m26372a(int i, List<Integer> list, zzck<?> zzck, UB ub, C10294d3<UT, UB> d3Var) {
        UB ub2;
        if (zzck == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator it = list.iterator();
            loop1:
            while (true) {
                ub2 = ub;
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    if (zzck.zzb(intValue) == null) {
                        ub = m26371a(i, intValue, ub2, d3Var);
                        it.remove();
                    }
                }
                break loop1;
            }
        } else {
            int size = list.size();
            ub2 = ub;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue2 = ((Integer) list.get(i3)).intValue();
                if (zzck.zzb(intValue2) != null) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue2));
                    }
                    i2++;
                } else {
                    ub2 = m26371a(i, intValue2, ub2, d3Var);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        }
        return ub2;
    }

    /* renamed from: a */
    public static void m26373a(int i, List<String> list, C10435y3 y3Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            y3Var.zza(i, list);
        }
    }

    /* renamed from: a */
    public static void m26374a(int i, List<?> list, C10435y3 y3Var, C10359m2 m2Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            y3Var.mo28021b(i, list, m2Var);
        }
    }

    /* renamed from: a */
    public static void m26375a(int i, List<Double> list, C10435y3 y3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            y3Var.zzg(i, list, z);
        }
    }

    /* renamed from: a */
    static <T, UT, UB> void m26376a(C10294d3<UT, UB> d3Var, T t, T t2) {
        d3Var.mo27870a((Object) t, d3Var.mo27875c(d3Var.mo27874c(t), d3Var.mo27874c(t2)));
    }

    /* renamed from: a */
    static <T, FT extends zzca<FT>> void m26377a(C10375p0<FT> p0Var, T t, T t2) {
        C10402t0 a = p0Var.mo28075a((Object) t2);
        if (!a.mo28129b()) {
            p0Var.mo28078b(t).mo28128a(a);
        }
    }

    /* renamed from: a */
    static <T> void m26378a(C10415v1 v1Var, T t, T t2, long j) {
        C10341k3.m26202a((Object) t, j, v1Var.zzb(C10341k3.m26225f(t, j), C10341k3.m26225f(t2, j)));
    }

    /* renamed from: a */
    public static void m26379a(Class<?> cls) {
        if (!C10273b1.class.isAssignableFrom(cls)) {
            Class<?> cls2 = f27156a;
            if (cls2 != null && !cls2.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
            }
        }
    }

    /* renamed from: a */
    public static boolean m26380a(int i, int i2, int i3) {
        if (i2 < 40) {
            return true;
        }
        long j = (long) i3;
        return ((((long) i2) - ((long) i)) + 1) + 9 <= ((2 * j) + 3) + ((j + 3) * 3);
    }

    /* renamed from: a */
    static boolean m26381a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    static int m26382b(int i, List<C10431y> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e = size * zzbn.m26689e(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            e += zzbn.m26664a((C10431y) list.get(i2));
        }
        return e;
    }

    /* renamed from: b */
    static int m26383b(int i, List<zzdo> list, C10359m2 m2Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzbn.m26683c(i, (zzdo) list.get(i3), m2Var);
        }
        return i2;
    }

    /* renamed from: b */
    static int m26384b(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m26385b(list) + (size * zzbn.m26689e(i));
    }

    /* renamed from: b */
    static int m26385b(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C10376p1) {
            C10376p1 p1Var = (C10376p1) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.m26691e(p1Var.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbn.m26691e(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static C10294d3<?, ?> m26386b() {
        return f27158c;
    }

    /* renamed from: b */
    public static void m26387b(int i, List<C10431y> list, C10435y3 y3Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            y3Var.zzb(i, list);
        }
    }

    /* renamed from: b */
    public static void m26388b(int i, List<?> list, C10435y3 y3Var, C10359m2 m2Var) throws IOException {
        if (list != null && !list.isEmpty()) {
            y3Var.mo28015a(i, list, m2Var);
        }
    }

    /* renamed from: b */
    public static void m26389b(int i, List<Float> list, C10435y3 y3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            y3Var.zzf(i, list, z);
        }
    }

    /* renamed from: c */
    static int m26390c(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m26391c(list) + (size * zzbn.m26689e(i));
    }

    /* renamed from: c */
    static int m26391c(List<Long> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C10376p1) {
            C10376p1 p1Var = (C10376p1) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.m26695f(p1Var.getLong(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbn.m26695f(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public static C10294d3<?, ?> m26392c() {
        return f27159d;
    }

    /* renamed from: c */
    public static void m26393c(int i, List<Long> list, C10435y3 y3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            y3Var.zzc(i, list, z);
        }
    }

    /* renamed from: d */
    static int m26394d(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m26395d(list) + (size * zzbn.m26689e(i));
    }

    /* renamed from: d */
    static int m26395d(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C10285c1) {
            C10285c1 c1Var = (C10285c1) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.m26709k(c1Var.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbn.m26709k(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: d */
    private static Class<?> m26396d() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m26397d(int i, List<Long> list, C10435y3 y3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            y3Var.zzd(i, list, z);
        }
    }

    /* renamed from: e */
    static int m26398e(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m26399e(list) + (size * zzbn.m26689e(i));
    }

    /* renamed from: e */
    static int m26399e(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C10285c1) {
            C10285c1 c1Var = (C10285c1) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.m26692f(c1Var.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbn.m26692f(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: e */
    private static Class<?> m26400e() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: e */
    public static void m26401e(int i, List<Long> list, C10435y3 y3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            y3Var.zzn(i, list, z);
        }
    }

    /* renamed from: f */
    static int m26402f(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m26403f(list) + (size * zzbn.m26689e(i));
    }

    /* renamed from: f */
    static int m26403f(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C10285c1) {
            C10285c1 c1Var = (C10285c1) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.m26696g(c1Var.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbn.m26696g(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: f */
    public static void m26404f(int i, List<Long> list, C10435y3 y3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            y3Var.zze(i, list, z);
        }
    }

    /* renamed from: g */
    static int m26405g(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return m26406g(list) + (size * zzbn.m26689e(i));
    }

    /* renamed from: g */
    static int m26406g(List<Integer> list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C10285c1) {
            C10285c1 c1Var = (C10285c1) list;
            i = 0;
            while (i2 < size) {
                i += zzbn.m26700h(c1Var.getInt(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzbn.m26700h(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    /* renamed from: g */
    public static void m26407g(int i, List<Long> list, C10435y3 y3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            y3Var.zzl(i, list, z);
        }
    }

    /* renamed from: h */
    static int m26408h(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbn.m26705i(i, 0);
    }

    /* renamed from: h */
    static int m26409h(List<?> list) {
        return list.size() << 2;
    }

    /* renamed from: h */
    public static void m26410h(int i, List<Integer> list, C10435y3 y3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            y3Var.zza(i, list, z);
        }
    }

    /* renamed from: i */
    static int m26411i(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbn.m26698g(i, 0);
    }

    /* renamed from: i */
    static int m26412i(List<?> list) {
        return list.size() << 3;
    }

    /* renamed from: i */
    public static void m26413i(int i, List<Integer> list, C10435y3 y3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            y3Var.zzj(i, list, z);
        }
    }

    /* renamed from: j */
    static int m26414j(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * zzbn.m26677b(i, true);
    }

    /* renamed from: j */
    static int m26415j(List<?> list) {
        return list.size();
    }

    /* renamed from: j */
    public static void m26416j(int i, List<Integer> list, C10435y3 y3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            y3Var.zzm(i, list, z);
        }
    }

    /* renamed from: k */
    public static void m26417k(int i, List<Integer> list, C10435y3 y3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            y3Var.zzb(i, list, z);
        }
    }

    /* renamed from: l */
    public static void m26418l(int i, List<Integer> list, C10435y3 y3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            y3Var.zzk(i, list, z);
        }
    }

    /* renamed from: m */
    public static void m26419m(int i, List<Integer> list, C10435y3 y3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            y3Var.zzh(i, list, z);
        }
    }

    /* renamed from: n */
    public static void m26420n(int i, List<Boolean> list, C10435y3 y3Var, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            y3Var.zzi(i, list, z);
        }
    }
}
