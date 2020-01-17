package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* renamed from: androidx.navigation.p */
public abstract class C0978p<T> {

    /* renamed from: b */
    public static final C0978p<Integer> f3741b = new C0981c(false);

    /* renamed from: c */
    public static final C0978p<Integer> f3742c = new C0982d(false);

    /* renamed from: d */
    public static final C0978p<int[]> f3743d = new C0983e(true);

    /* renamed from: e */
    public static final C0978p<Long> f3744e = new C0984f(false);

    /* renamed from: f */
    public static final C0978p<long[]> f3745f = new C0985g(true);

    /* renamed from: g */
    public static final C0978p<Float> f3746g = new C0986h(false);

    /* renamed from: h */
    public static final C0978p<float[]> f3747h = new C0987i(true);

    /* renamed from: i */
    public static final C0978p<Boolean> f3748i = new C0988j(false);

    /* renamed from: j */
    public static final C0978p<boolean[]> f3749j = new C0989k(true);

    /* renamed from: k */
    public static final C0978p<String> f3750k = new C0979a(true);

    /* renamed from: l */
    public static final C0978p<String[]> f3751l = new C0980b(true);

    /* renamed from: a */
    private final boolean f3752a;

    /* renamed from: androidx.navigation.p$a */
    static class C0979a extends C0978p<String> {
        C0979a(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public String mo4770a() {
            return "string";
        }

        /* renamed from: a */
        public String m4399a(String str) {
            return str;
        }

        /* renamed from: b */
        public void mo4771a(Bundle bundle, String str, String str2) {
            bundle.putString(str, str2);
        }

        /* renamed from: a */
        public String m4398a(Bundle bundle, String str) {
            return (String) bundle.get(str);
        }
    }

    /* renamed from: androidx.navigation.p$b */
    static class C0980b extends C0978p<String[]> {
        C0980b(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public String mo4770a() {
            return "string[]";
        }

        /* renamed from: a */
        public void mo4771a(Bundle bundle, String str, String[] strArr) {
            bundle.putStringArray(str, strArr);
        }

        /* renamed from: a */
        public String[] m4407a(Bundle bundle, String str) {
            return (String[]) bundle.get(str);
        }

        /* renamed from: a */
        public String[] m4408a(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }
    }

    /* renamed from: androidx.navigation.p$c */
    static class C0981c extends C0978p<Integer> {
        C0981c(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public String mo4770a() {
            return "integer";
        }

        /* renamed from: a */
        public void mo4771a(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }

        /* renamed from: a */
        public Integer m4411a(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        /* renamed from: a */
        public Integer m4412a(String str) {
            if (str.startsWith("0x")) {
                return Integer.valueOf(Integer.parseInt(str.substring(2), 16));
            }
            return Integer.valueOf(Integer.parseInt(str));
        }
    }

    /* renamed from: androidx.navigation.p$d */
    static class C0982d extends C0978p<Integer> {
        C0982d(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public String mo4770a() {
            return "reference";
        }

        /* renamed from: a */
        public void mo4771a(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }

        /* renamed from: a */
        public Integer m4418a(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        /* renamed from: a */
        public Integer mo4769a(String str) {
            throw new UnsupportedOperationException("References don't support parsing string values.");
        }
    }

    /* renamed from: androidx.navigation.p$e */
    static class C0983e extends C0978p<int[]> {
        C0983e(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public String mo4770a() {
            return "integer[]";
        }

        /* renamed from: a */
        public void mo4771a(Bundle bundle, String str, int[] iArr) {
            bundle.putIntArray(str, iArr);
        }

        /* renamed from: a */
        public int[] m4428a(Bundle bundle, String str) {
            return (int[]) bundle.get(str);
        }

        /* renamed from: a */
        public int[] m4429a(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }
    }

    /* renamed from: androidx.navigation.p$f */
    static class C0984f extends C0978p<Long> {
        C0984f(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public String mo4770a() {
            return "long";
        }

        /* renamed from: a */
        public void mo4771a(Bundle bundle, String str, Long l) {
            bundle.putLong(str, l.longValue());
        }

        /* renamed from: a */
        public Long m4432a(Bundle bundle, String str) {
            return (Long) bundle.get(str);
        }

        /* renamed from: a */
        public Long m4433a(String str) {
            if (str.endsWith("L")) {
                str = str.substring(0, str.length() - 1);
            }
            if (str.startsWith("0x")) {
                return Long.valueOf(Long.parseLong(str.substring(2), 16));
            }
            return Long.valueOf(Long.parseLong(str));
        }
    }

    /* renamed from: androidx.navigation.p$g */
    static class C0985g extends C0978p<long[]> {
        C0985g(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public String mo4770a() {
            return "long[]";
        }

        /* renamed from: a */
        public void mo4771a(Bundle bundle, String str, long[] jArr) {
            bundle.putLongArray(str, jArr);
        }

        /* renamed from: a */
        public long[] m4442a(Bundle bundle, String str) {
            return (long[]) bundle.get(str);
        }

        /* renamed from: a */
        public long[] m4443a(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }
    }

    /* renamed from: androidx.navigation.p$h */
    static class C0986h extends C0978p<Float> {
        C0986h(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public String mo4770a() {
            return "float";
        }

        /* renamed from: a */
        public void mo4771a(Bundle bundle, String str, Float f) {
            bundle.putFloat(str, f.floatValue());
        }

        /* renamed from: a */
        public Float m4446a(Bundle bundle, String str) {
            return (Float) bundle.get(str);
        }

        /* renamed from: a */
        public Float m4447a(String str) {
            return Float.valueOf(Float.parseFloat(str));
        }
    }

    /* renamed from: androidx.navigation.p$i */
    static class C0987i extends C0978p<float[]> {
        C0987i(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public String mo4770a() {
            return "float[]";
        }

        /* renamed from: a */
        public void mo4771a(Bundle bundle, String str, float[] fArr) {
            bundle.putFloatArray(str, fArr);
        }

        /* renamed from: a */
        public float[] m4456a(Bundle bundle, String str) {
            return (float[]) bundle.get(str);
        }

        /* renamed from: a */
        public float[] m4457a(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }
    }

    /* renamed from: androidx.navigation.p$j */
    static class C0988j extends C0978p<Boolean> {
        C0988j(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public String mo4770a() {
            return "boolean";
        }

        /* renamed from: a */
        public void mo4771a(Bundle bundle, String str, Boolean bool) {
            bundle.putBoolean(str, bool.booleanValue());
        }

        /* renamed from: a */
        public Boolean m4460a(Bundle bundle, String str) {
            return (Boolean) bundle.get(str);
        }

        /* renamed from: a */
        public Boolean m4461a(String str) {
            if ("true".equals(str)) {
                return Boolean.valueOf(true);
            }
            if ("false".equals(str)) {
                return Boolean.valueOf(false);
            }
            throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
        }
    }

    /* renamed from: androidx.navigation.p$k */
    static class C0989k extends C0978p<boolean[]> {
        C0989k(boolean z) {
            super(z);
        }

        /* renamed from: a */
        public String mo4770a() {
            return "boolean[]";
        }

        /* renamed from: a */
        public void mo4771a(Bundle bundle, String str, boolean[] zArr) {
            bundle.putBooleanArray(str, zArr);
        }

        /* renamed from: a */
        public boolean[] m4470a(Bundle bundle, String str) {
            return (boolean[]) bundle.get(str);
        }

        /* renamed from: a */
        public boolean[] m4471a(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }
    }

    /* renamed from: androidx.navigation.p$l */
    public static final class C0990l<D extends Enum> extends C0994p<D> {

        /* renamed from: n */
        private final Class<D> f3753n;

        public C0990l(Class<D> cls) {
            super(false, cls);
            if (cls.isEnum()) {
                this.f3753n = cls;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(cls);
            sb.append(" is not an Enum type.");
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public D m4473a(String str) {
            D[] dArr;
            for (D d : (Enum[]) this.f3753n.getEnumConstants()) {
                if (d.name().equals(str)) {
                    return d;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Enum value ");
            sb.append(str);
            sb.append(" not found for type ");
            sb.append(this.f3753n.getName());
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public String mo4770a() {
            return this.f3753n.getName();
        }
    }

    /* renamed from: androidx.navigation.p$m */
    public static final class C0991m<D extends Parcelable> extends C0978p<D[]> {

        /* renamed from: m */
        private final Class<D[]> f3754m;

        public C0991m(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls)) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[L");
                    sb.append(cls.getName());
                    sb.append(";");
                    this.f3754m = Class.forName(sb.toString());
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls);
                sb2.append(" does not implement Parcelable.");
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0991m.class != obj.getClass()) {
                return false;
            }
            return this.f3754m.equals(((C0991m) obj).f3754m);
        }

        public int hashCode() {
            return this.f3754m.hashCode();
        }

        /* renamed from: a */
        public void mo4771a(Bundle bundle, String str, D[] dArr) {
            this.f3754m.cast(dArr);
            bundle.putParcelableArray(str, dArr);
        }

        /* renamed from: a */
        public D[] m4481a(Bundle bundle, String str) {
            return (Parcelable[]) bundle.get(str);
        }

        /* renamed from: a */
        public D[] m4482a(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: a */
        public String mo4770a() {
            return this.f3754m.getName();
        }
    }

    /* renamed from: androidx.navigation.p$n */
    public static final class C0992n<D> extends C0978p<D> {

        /* renamed from: m */
        private final Class<D> f3755m;

        public C0992n(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.f3755m = cls;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(cls);
            sb.append(" does not implement Parcelable or Serializable.");
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public void mo4771a(Bundle bundle, String str, D d) {
            this.f3755m.cast(d);
            if (d == null || (d instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) d);
            } else if (d instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) d);
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0992n.class != obj.getClass()) {
                return false;
            }
            return this.f3755m.equals(((C0992n) obj).f3755m);
        }

        public int hashCode() {
            return this.f3755m.hashCode();
        }

        /* renamed from: a */
        public D mo4767a(Bundle bundle, String str) {
            return bundle.get(str);
        }

        /* renamed from: a */
        public D mo4769a(String str) {
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        /* renamed from: a */
        public String mo4770a() {
            return this.f3755m.getName();
        }
    }

    /* renamed from: androidx.navigation.p$o */
    public static final class C0993o<D extends Serializable> extends C0978p<D[]> {

        /* renamed from: m */
        private final Class<D[]> f3756m;

        public C0993o(Class<D> cls) {
            super(true);
            if (Serializable.class.isAssignableFrom(cls)) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[L");
                    sb.append(cls.getName());
                    sb.append(";");
                    this.f3756m = Class.forName(sb.toString());
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls);
                sb2.append(" does not implement Serializable.");
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0993o.class != obj.getClass()) {
                return false;
            }
            return this.f3756m.equals(((C0993o) obj).f3756m);
        }

        public int hashCode() {
            return this.f3756m.hashCode();
        }

        /* JADX WARNING: type inference failed for: r4v0, types: [D[], java.lang.Object, java.io.Serializable] */
        /* JADX WARNING: Incorrect type for immutable var: ssa=D[], code=null, for r4v0, types: [D[], java.lang.Object, java.io.Serializable] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo4771a(android.os.Bundle r2, java.lang.String r3, D[] r4) {
            /*
                r1 = this;
                java.lang.Class<D[]> r0 = r1.f3756m
                r0.cast(r4)
                r2.putSerializable(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.C0978p.C0993o.mo4771a(android.os.Bundle, java.lang.String, java.io.Serializable[]):void");
        }

        /* renamed from: a */
        public D[] m4492a(Bundle bundle, String str) {
            return (Serializable[]) bundle.get(str);
        }

        /* renamed from: a */
        public D[] m4493a(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: a */
        public String mo4770a() {
            return this.f3756m.getName();
        }
    }

    /* renamed from: androidx.navigation.p$p */
    public static class C0994p<D extends Serializable> extends C0978p<D> {

        /* renamed from: m */
        private final Class<D> f3757m;

        public C0994p(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                StringBuilder sb = new StringBuilder();
                sb.append(cls);
                sb.append(" does not implement Serializable.");
                throw new IllegalArgumentException(sb.toString());
            } else if (!cls.isEnum()) {
                this.f3757m = cls;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(cls);
                sb2.append(" is an Enum. You should use EnumType instead.");
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0994p)) {
                return false;
            }
            return this.f3757m.equals(((C0994p) obj).f3757m);
        }

        public int hashCode() {
            return this.f3757m.hashCode();
        }

        /* renamed from: a */
        public void mo4771a(Bundle bundle, String str, D d) {
            this.f3757m.cast(d);
            bundle.putSerializable(str, d);
        }

        /* renamed from: a */
        public D m4496a(Bundle bundle, String str) {
            return (Serializable) bundle.get(str);
        }

        C0994p(boolean z, Class<D> cls) {
            super(z);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f3757m = cls;
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(cls);
            sb.append(" does not implement Serializable.");
            throw new IllegalArgumentException(sb.toString());
        }

        /* renamed from: a */
        public D m4497a(String str) {
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        /* renamed from: a */
        public String mo4770a() {
            return this.f3757m.getName();
        }
    }

    C0978p(boolean z) {
        this.f3752a = z;
    }

    /* renamed from: a */
    public abstract T mo4767a(Bundle bundle, String str);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public T mo4768a(Bundle bundle, String str, String str2) {
        T a = mo4769a(str2);
        mo4771a(bundle, str, a);
        return a;
    }

    /* renamed from: a */
    public abstract T mo4769a(String str);

    /* renamed from: a */
    public abstract String mo4770a();

    /* renamed from: a */
    public abstract void mo4771a(Bundle bundle, String str, T t);

    /* renamed from: b */
    public boolean mo4772b() {
        return this.f3752a;
    }

    public String toString() {
        return mo4770a();
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [androidx.navigation.p<java.lang.Float>, androidx.navigation.p] */
    /* JADX WARNING: type inference failed for: r1v7, types: [androidx.navigation.p<java.lang.Long>, androidx.navigation.p] */
    /* JADX WARNING: type inference failed for: r1v8, types: [androidx.navigation.p<java.lang.Integer>, androidx.navigation.p] */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:3|4|5) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:6|7|8) */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:9|10|11) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        f3748i.mo4769a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        return f3748i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        return f3750k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        f3744e.mo4769a(r1);
        r1 = f3744e;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        f3746g.mo4769a(r1);
        r1 = f3746g;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        return r1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0008 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0010 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0018 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static androidx.navigation.C0978p m4388b(java.lang.String r1) {
        /*
            androidx.navigation.p<java.lang.Integer> r0 = f3741b     // Catch:{ IllegalArgumentException -> 0x0008 }
            r0.mo4769a(r1)     // Catch:{ IllegalArgumentException -> 0x0008 }
            androidx.navigation.p<java.lang.Integer> r1 = f3741b     // Catch:{ IllegalArgumentException -> 0x0008 }
            return r1
        L_0x0008:
            androidx.navigation.p<java.lang.Long> r0 = f3744e     // Catch:{ IllegalArgumentException -> 0x0010 }
            r0.mo4769a(r1)     // Catch:{ IllegalArgumentException -> 0x0010 }
            androidx.navigation.p<java.lang.Long> r1 = f3744e     // Catch:{ IllegalArgumentException -> 0x0010 }
            return r1
        L_0x0010:
            androidx.navigation.p<java.lang.Float> r0 = f3746g     // Catch:{ IllegalArgumentException -> 0x0018 }
            r0.mo4769a(r1)     // Catch:{ IllegalArgumentException -> 0x0018 }
            androidx.navigation.p<java.lang.Float> r1 = f3746g     // Catch:{ IllegalArgumentException -> 0x0018 }
            return r1
        L_0x0018:
            androidx.navigation.p<java.lang.Boolean> r0 = f3748i     // Catch:{ IllegalArgumentException -> 0x0020 }
            r0.mo4769a(r1)     // Catch:{ IllegalArgumentException -> 0x0020 }
            androidx.navigation.p<java.lang.Boolean> r1 = f3748i     // Catch:{ IllegalArgumentException -> 0x0020 }
            return r1
        L_0x0020:
            androidx.navigation.p<java.lang.String> r1 = f3750k
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.C0978p.m4388b(java.lang.String):androidx.navigation.p");
    }

    /* renamed from: a */
    public static C0978p<?> m4387a(String str, String str2) {
        String str3;
        if (f3741b.mo4770a().equals(str)) {
            return f3741b;
        }
        if (f3743d.mo4770a().equals(str)) {
            return f3743d;
        }
        if (f3744e.mo4770a().equals(str)) {
            return f3744e;
        }
        if (f3745f.mo4770a().equals(str)) {
            return f3745f;
        }
        if (f3748i.mo4770a().equals(str)) {
            return f3748i;
        }
        if (f3749j.mo4770a().equals(str)) {
            return f3749j;
        }
        if (f3750k.mo4770a().equals(str)) {
            return f3750k;
        }
        if (f3751l.mo4770a().equals(str)) {
            return f3751l;
        }
        if (f3746g.mo4770a().equals(str)) {
            return f3746g;
        }
        if (f3747h.mo4770a().equals(str)) {
            return f3747h;
        }
        if (f3742c.mo4770a().equals(str)) {
            return f3742c;
        }
        if (str == null || str.isEmpty()) {
            return f3750k;
        }
        try {
            if (!str.startsWith(".") || str2 == null) {
                str3 = str;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(str);
                str3 = sb.toString();
            }
            if (str.endsWith("[]")) {
                str3 = str3.substring(0, str3.length() - 2);
                Class cls = Class.forName(str3);
                if (Parcelable.class.isAssignableFrom(cls)) {
                    return new C0991m(cls);
                }
                if (Serializable.class.isAssignableFrom(cls)) {
                    return new C0993o(cls);
                }
            } else {
                Class cls2 = Class.forName(str3);
                if (Parcelable.class.isAssignableFrom(cls2)) {
                    return new C0992n(cls2);
                }
                if (Enum.class.isAssignableFrom(cls2)) {
                    return new C0990l(cls2);
                }
                if (Serializable.class.isAssignableFrom(cls2)) {
                    return new C0994p(cls2);
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(" is not Serializable or Parcelable.");
            throw new IllegalArgumentException(sb2.toString());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    static C0978p m4386a(Object obj) {
        if (obj instanceof Integer) {
            return f3741b;
        }
        if (obj instanceof int[]) {
            return f3743d;
        }
        if (obj instanceof Long) {
            return f3744e;
        }
        if (obj instanceof long[]) {
            return f3745f;
        }
        if (obj instanceof Float) {
            return f3746g;
        }
        if (obj instanceof float[]) {
            return f3747h;
        }
        if (obj instanceof Boolean) {
            return f3748i;
        }
        if (obj instanceof boolean[]) {
            return f3749j;
        }
        if ((obj instanceof String) || obj == null) {
            return f3750k;
        }
        if (obj instanceof String[]) {
            return f3751l;
        }
        if (obj.getClass().isArray() && Parcelable.class.isAssignableFrom(obj.getClass().getComponentType())) {
            return new C0991m(obj.getClass().getComponentType());
        }
        if (obj.getClass().isArray() && Serializable.class.isAssignableFrom(obj.getClass().getComponentType())) {
            return new C0993o(obj.getClass().getComponentType());
        }
        if (obj instanceof Parcelable) {
            return new C0992n(obj.getClass());
        }
        if (obj instanceof Enum) {
            return new C0990l(obj.getClass());
        }
        if (obj instanceof Serializable) {
            return new C0994p(obj.getClass());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Object of type ");
        sb.append(obj.getClass().getName());
        sb.append(" is not supported for navigation arguments.");
        throw new IllegalArgumentException(sb.toString());
    }
}
