package androidx.paging;

import androidx.paging.DataSource.InvalidatedCallback;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: androidx.paging.j */
public abstract class C1033j<T> extends DataSource<Integer, T> {

    /* renamed from: androidx.paging.j$a */
    static class C1034a<Value> extends C1008b<Integer, Value> {

        /* renamed from: c */
        final C1033j<Value> f3874c;

        C1034a(C1033j<Value> jVar) {
            this.f3874c = jVar;
        }

        /* renamed from: b */
        public void mo4802b(InvalidatedCallback invalidatedCallback) {
            this.f3874c.mo4802b(invalidatedCallback);
        }

        /* renamed from: c */
        public boolean mo4804c() {
            return this.f3874c.mo4804c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo4823b(int i, Value value, int i2, Executor executor, C1017a<Value> aVar) {
            int i3 = i - 1;
            if (i3 < 0) {
                this.f3874c.mo4905a(2, i3, 0, executor, aVar);
                return;
            }
            int min = Math.min(i2, i3 + 1);
            this.f3874c.mo4905a(2, (i3 - min) + 1, min, executor, aVar);
        }

        /* renamed from: a */
        public void mo4801a(InvalidatedCallback invalidatedCallback) {
            this.f3874c.mo4801a(invalidatedCallback);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4822a(Integer num, int i, int i2, boolean z, Executor executor, C1017a<Value> aVar) {
            this.f3874c.mo4908a(false, num == null ? 0 : num.intValue(), i, i2, executor, aVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo4821a(int i, Value value, int i2, Executor executor, C1017a<Value> aVar) {
            this.f3874c.mo4905a(1, i + 1, i2, executor, aVar);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public Integer m4639a(int i, Value value) {
            return Integer.valueOf(i);
        }
    }

    /* renamed from: androidx.paging.j$b */
    public static abstract class C1035b<T> {
        /* renamed from: a */
        public abstract void mo4911a(List<T> list, int i, int i2);
    }

    /* renamed from: androidx.paging.j$c */
    static class C1036c<T> extends C1035b<T> {

        /* renamed from: a */
        final C1001b<T> f3875a;

        /* renamed from: b */
        private final boolean f3876b;

        /* renamed from: c */
        private final int f3877c;

        C1036c(C1033j jVar, boolean z, int i, C1017a<T> aVar) {
            this.f3875a = new C1001b<>(jVar, 0, null, aVar);
            this.f3876b = z;
            this.f3877c = i;
            if (this.f3877c < 1) {
                throw new IllegalArgumentException("Page size must be non-negative");
            }
        }

        /* renamed from: a */
        public void mo4911a(List<T> list, int i, int i2) {
            if (!this.f3875a.mo4809a()) {
                C1001b.m4518a(list, i, i2);
                if (list.size() + i != i2 && list.size() % this.f3877c != 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("PositionalDataSource requires initial load size to be a multiple of page size to support internal tiling. loadSize ");
                    sb.append(list.size());
                    sb.append(", position ");
                    sb.append(i);
                    sb.append(", totalCount ");
                    sb.append(i2);
                    sb.append(", pageSize ");
                    sb.append(this.f3877c);
                    throw new IllegalArgumentException(sb.toString());
                } else if (this.f3876b) {
                    this.f3875a.mo4807a(new C1016e<>(list, i, (i2 - i) - list.size(), 0));
                } else {
                    this.f3875a.mo4807a(new C1016e<>(list, i));
                }
            }
        }
    }

    /* renamed from: androidx.paging.j$d */
    public static class C1037d {

        /* renamed from: a */
        public final int f3878a;

        /* renamed from: b */
        public final int f3879b;

        /* renamed from: c */
        public final int f3880c;

        public C1037d(int i, int i2, int i3, boolean z) {
            this.f3878a = i;
            this.f3879b = i2;
            this.f3880c = i3;
        }
    }

    /* renamed from: androidx.paging.j$e */
    public static abstract class C1038e<T> {
        /* renamed from: a */
        public abstract void mo4912a(List<T> list);
    }

    /* renamed from: androidx.paging.j$f */
    static class C1039f<T> extends C1038e<T> {

        /* renamed from: a */
        private C1001b<T> f3881a;

        /* renamed from: b */
        private final int f3882b;

        C1039f(C1033j jVar, int i, int i2, Executor executor, C1017a<T> aVar) {
            this.f3881a = new C1001b<>(jVar, i, executor, aVar);
            this.f3882b = i2;
        }

        /* renamed from: a */
        public void mo4912a(List<T> list) {
            if (!this.f3881a.mo4809a()) {
                this.f3881a.mo4807a(new C1016e<>(list, 0, 0, this.f3882b));
            }
        }
    }

    /* renamed from: androidx.paging.j$g */
    public static class C1040g {

        /* renamed from: a */
        public final int f3883a;

        /* renamed from: b */
        public final int f3884b;

        public C1040g(int i, int i2) {
            this.f3883a = i;
            this.f3884b = i2;
        }
    }

    /* renamed from: a */
    public abstract void mo4906a(C1037d dVar, C1035b<T> bVar);

    /* renamed from: a */
    public abstract void mo4907a(C1040g gVar, C1038e<T> eVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo4908a(boolean z, int i, int i2, int i3, Executor executor, C1017a<T> aVar) {
        C1036c cVar = new C1036c(this, z, i3, aVar);
        mo4906a(new C1037d(i, i2, i3, z), (C1035b<T>) cVar);
        cVar.f3875a.mo4808a(executor);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo4803b() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C1008b<Integer, T> mo4909d() {
        return new C1034a(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo4905a(int i, int i2, int i3, Executor executor, C1017a<T> aVar) {
        C1039f fVar = new C1039f(this, i, i2, executor, aVar);
        if (i3 == 0) {
            fVar.mo4912a(Collections.emptyList());
        } else {
            mo4907a(new C1040g(i2, i3), (C1038e<T>) fVar);
        }
    }

    /* renamed from: a */
    public static int m4630a(C1037d dVar, int i) {
        int i2 = dVar.f3878a;
        int i3 = dVar.f3879b;
        int i4 = dVar.f3880c;
        return Math.max(0, Math.min(((((i - i3) + i4) - 1) / i4) * i4, Math.round((float) (i2 / i4)) * i4));
    }

    /* renamed from: a */
    public static int m4631a(C1037d dVar, int i, int i2) {
        return Math.min(i2 - i, dVar.f3879b);
    }
}
