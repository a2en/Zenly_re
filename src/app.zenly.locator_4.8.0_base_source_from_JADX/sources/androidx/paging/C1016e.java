package androidx.paging;

import java.util.Collections;
import java.util.List;

/* renamed from: androidx.paging.e */
class C1016e<T> {

    /* renamed from: e */
    private static final C1016e f3815e = new C1016e(Collections.emptyList(), 0);

    /* renamed from: a */
    public final List<T> f3816a;

    /* renamed from: b */
    public final int f3817b;

    /* renamed from: c */
    public final int f3818c;

    /* renamed from: d */
    public final int f3819d;

    /* renamed from: androidx.paging.e$a */
    static abstract class C1017a<T> {
        C1017a() {
        }

        /* renamed from: a */
        public abstract void mo4834a(int i, C1016e<T> eVar);
    }

    static {
        new C1016e(Collections.emptyList(), 0);
    }

    C1016e(List<T> list, int i, int i2, int i3) {
        this.f3816a = list;
        this.f3817b = i;
        this.f3818c = i2;
        this.f3819d = i3;
    }

    /* renamed from: b */
    static <T> C1016e<T> m4553b() {
        return f3815e;
    }

    /* renamed from: a */
    public boolean mo4838a() {
        return this == f3815e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Result ");
        sb.append(this.f3817b);
        String str = ", ";
        sb.append(str);
        sb.append(this.f3816a);
        sb.append(str);
        sb.append(this.f3818c);
        sb.append(", offset ");
        sb.append(this.f3819d);
        return sb.toString();
    }

    C1016e(List<T> list, int i) {
        this.f3816a = list;
        this.f3817b = 0;
        this.f3818c = 0;
        this.f3819d = i;
    }
}
