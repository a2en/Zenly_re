package kotlinx.coroutines.internal;

import kotlin.jvm.internal.C12932j;

/* renamed from: kotlinx.coroutines.internal.q */
final /* synthetic */ class C13110q {
    /* renamed from: a */
    public static final boolean m34223a(String str, boolean z) {
        C12932j.m33818b(str, "propertyName");
        String a = C13108o.m34218a(str);
        return a != null ? Boolean.parseBoolean(a) : z;
    }

    /* renamed from: a */
    public static final int m34221a(String str, int i, int i2, int i3) {
        C12932j.m33818b(str, "propertyName");
        return (int) C13108o.m34217a(str, (long) i, (long) i2, (long) i3);
    }

    /* renamed from: a */
    public static final long m34222a(String str, long j, long j2, long j3) {
        C12932j.m33818b(str, "propertyName");
        String a = C13108o.m34218a(str);
        if (a == null) {
            return j;
        }
        Long b = C13027p.m33996b(a);
        String str2 = "System property '";
        if (b != null) {
            long longValue = b.longValue();
            if (j2 <= longValue && j3 >= longValue) {
                return longValue;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            sb.append("' should be in range ");
            sb.append(j2);
            sb.append("..");
            sb.append(j3);
            sb.append(", but is '");
            sb.append(longValue);
            sb.append('\'');
            throw new IllegalStateException(sb.toString().toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(str);
        sb2.append("' has unrecognized value '");
        sb2.append(a);
        sb2.append('\'');
        throw new IllegalStateException(sb2.toString().toString());
    }
}
