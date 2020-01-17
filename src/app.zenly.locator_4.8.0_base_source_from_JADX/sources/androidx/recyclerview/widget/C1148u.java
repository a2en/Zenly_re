package androidx.recyclerview.widget;

import java.lang.reflect.Array;
import java.util.Comparator;

/* renamed from: androidx.recyclerview.widget.u */
public class C1148u<T> {

    /* renamed from: a */
    T[] f4362a;

    /* renamed from: b */
    private T[] f4363b;

    /* renamed from: c */
    private int f4364c;

    /* renamed from: d */
    private int f4365d;

    /* renamed from: e */
    private int f4366e;

    /* renamed from: f */
    private C1150b f4367f;

    /* renamed from: g */
    private C1149a f4368g;

    /* renamed from: h */
    private int f4369h;

    /* renamed from: i */
    private final Class<T> f4370i;

    /* renamed from: androidx.recyclerview.widget.u$a */
    public static class C1149a<T2> extends C1150b<T2> {

        /* renamed from: e */
        final C1150b<T2> f4371e;

        /* renamed from: f */
        private final C1097d f4372f = new C1097d(this.f4371e);

        public C1149a(C1150b<T2> bVar) {
            this.f4371e = bVar;
        }

        /* renamed from: a */
        public boolean mo5798a(T2 t2, T2 t22) {
            return this.f4371e.mo5798a(t2, t22);
        }

        /* renamed from: b */
        public boolean mo5799b(T2 t2, T2 t22) {
            return this.f4371e.mo5799b(t2, t22);
        }

        /* renamed from: c */
        public Object mo5800c(T2 t2, T2 t22) {
            return this.f4371e.mo5800c(t2, t22);
        }

        public int compare(T2 t2, T2 t22) {
            return this.f4371e.compare(t2, t22);
        }

        public void onChanged(int i, int i2, Object obj) {
            this.f4372f.onChanged(i, i2, obj);
        }

        public void onInserted(int i, int i2) {
            this.f4372f.onInserted(i, i2);
        }

        public void onMoved(int i, int i2) {
            this.f4372f.onMoved(i, i2);
        }

        public void onRemoved(int i, int i2) {
            this.f4372f.onRemoved(i, i2);
        }

        /* renamed from: a */
        public void mo5797a() {
            this.f4372f.mo5641a();
        }
    }

    /* renamed from: androidx.recyclerview.widget.u$b */
    public static abstract class C1150b<T2> implements Comparator<T2>, ListUpdateCallback {
        /* renamed from: a */
        public abstract boolean mo5798a(T2 t2, T2 t22);

        /* renamed from: b */
        public abstract boolean mo5799b(T2 t2, T2 t22);

        /* renamed from: c */
        public abstract Object mo5800c(T2 t2, T2 t22);

        public abstract int compare(T2 t2, T2 t22);

        public abstract void onChanged(int i, int i2, Object obj);
    }

    public C1148u(Class<T> cls, C1150b<T> bVar) {
        this(cls, bVar, 10);
    }

    /* renamed from: d */
    private void m5624d() {
        if (this.f4363b != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    /* renamed from: a */
    public int mo5789a(T t) {
        m5624d();
        return m5619a(t, true);
    }

    /* renamed from: b */
    public void mo5794b() {
        m5624d();
        C1150b bVar = this.f4367f;
        if (bVar instanceof C1149a) {
            ((C1149a) bVar).mo5797a();
        }
        C1150b bVar2 = this.f4367f;
        C1149a aVar = this.f4368g;
        if (bVar2 == aVar) {
            this.f4367f = aVar.f4371e;
        }
    }

    /* renamed from: c */
    public int mo5795c() {
        return this.f4369h;
    }

    public C1148u(Class<T> cls, C1150b<T> bVar, int i) {
        this.f4370i = cls;
        this.f4362a = (Object[]) Array.newInstance(cls, i);
        this.f4367f = bVar;
        this.f4369h = 0;
    }

    /* renamed from: c */
    public boolean mo5796c(T t) {
        m5624d();
        return m5623b(t, true);
    }

    /* renamed from: a */
    public void mo5791a() {
        m5624d();
        C1150b bVar = this.f4367f;
        if (!(bVar instanceof C1149a)) {
            if (this.f4368g == null) {
                this.f4368g = new C1149a(bVar);
            }
            this.f4367f = this.f4368g;
        }
    }

    /* renamed from: b */
    private boolean m5623b(T t, boolean z) {
        int a = m5620a(t, this.f4362a, 0, this.f4369h, 2);
        if (a == -1) {
            return false;
        }
        m5621a(a, z);
        return true;
    }

    /* renamed from: a */
    private int m5619a(T t, boolean z) {
        int a = m5620a(t, this.f4362a, 0, this.f4369h, 1);
        if (a == -1) {
            a = 0;
        } else if (a < this.f4369h) {
            T t2 = this.f4362a[a];
            if (this.f4367f.mo5799b(t2, t)) {
                if (this.f4367f.mo5798a(t2, t)) {
                    this.f4362a[a] = t;
                    return a;
                }
                this.f4362a[a] = t;
                C1150b bVar = this.f4367f;
                bVar.onChanged(a, 1, bVar.mo5800c(t2, t));
                return a;
            }
        }
        m5622b(a, t);
        if (z) {
            this.f4367f.onInserted(a, 1);
        }
        return a;
    }

    /* renamed from: b */
    public int mo5793b(T t) {
        if (this.f4363b != null) {
            int a = m5620a(t, this.f4362a, 0, this.f4366e, 4);
            if (a != -1) {
                return a;
            }
            int a2 = m5620a(t, this.f4363b, this.f4364c, this.f4365d, 4);
            if (a2 != -1) {
                return (a2 - this.f4364c) + this.f4366e;
            }
            return -1;
        }
        return m5620a(t, this.f4362a, 0, this.f4369h, 4);
    }

    /* renamed from: b */
    private void m5622b(int i, T t) {
        int i2 = this.f4369h;
        if (i <= i2) {
            T[] tArr = this.f4362a;
            if (i2 == tArr.length) {
                T[] tArr2 = (Object[]) Array.newInstance(this.f4370i, tArr.length + 10);
                System.arraycopy(this.f4362a, 0, tArr2, 0, i);
                tArr2[i] = t;
                System.arraycopy(this.f4362a, i, tArr2, i + 1, this.f4369h - i);
                this.f4362a = tArr2;
            } else {
                System.arraycopy(tArr, i, tArr, i + 1, i2 - i);
                this.f4362a[i] = t;
            }
            this.f4369h++;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("cannot add item to ");
        sb.append(i);
        sb.append(" because size is ");
        sb.append(this.f4369h);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    /* renamed from: a */
    private void m5621a(int i, boolean z) {
        T[] tArr = this.f4362a;
        System.arraycopy(tArr, i + 1, tArr, i, (this.f4369h - i) - 1);
        this.f4369h--;
        this.f4362a[this.f4369h] = null;
        if (z) {
            this.f4367f.onRemoved(i, 1);
        }
    }

    /* renamed from: a */
    public void mo5792a(int i, T t) {
        m5624d();
        T a = mo5790a(i);
        boolean z = a == t || !this.f4367f.mo5798a(a, t);
        if (a == t || this.f4367f.compare(a, t) != 0) {
            if (z) {
                C1150b bVar = this.f4367f;
                bVar.onChanged(i, 1, bVar.mo5800c(a, t));
            }
            m5621a(i, false);
            int a2 = m5619a(t, false);
            if (i != a2) {
                this.f4367f.onMoved(i, a2);
            }
            return;
        }
        this.f4362a[i] = t;
        if (z) {
            C1150b bVar2 = this.f4367f;
            bVar2.onChanged(i, 1, bVar2.mo5800c(a, t));
        }
    }

    /* renamed from: a */
    public T mo5790a(int i) throws IndexOutOfBoundsException {
        if (i >= this.f4369h || i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("Asked to get item at ");
            sb.append(i);
            sb.append(" but size is ");
            sb.append(this.f4369h);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        T[] tArr = this.f4363b;
        if (tArr != null) {
            int i2 = this.f4366e;
            if (i >= i2) {
                return tArr[(i - i2) + this.f4364c];
            }
        }
        return this.f4362a[i];
    }

    /* renamed from: a */
    private int m5620a(T t, T[] tArr, int i, int i2, int i3) {
        while (i < i2) {
            int i4 = (i + i2) / 2;
            T t2 = tArr[i4];
            int compare = this.f4367f.compare(t2, t);
            if (compare < 0) {
                i = i4 + 1;
            } else if (compare != 0) {
                i2 = i4;
            } else if (this.f4367f.mo5799b(t2, t)) {
                return i4;
            } else {
                int a = m5618a(t, i4, i, i2);
                if (i3 == 1 && a == -1) {
                    a = i4;
                }
                return a;
            }
        }
        if (i3 != 1) {
            i = -1;
        }
        return i;
    }

    /* renamed from: a */
    private int m5618a(T t, int i, int i2, int i3) {
        T t2;
        int i4 = i - 1;
        while (i4 >= i2) {
            T t3 = this.f4362a[i4];
            if (this.f4367f.compare(t3, t) != 0) {
                break;
            } else if (this.f4367f.mo5799b(t3, t)) {
                return i4;
            } else {
                i4--;
            }
        }
        do {
            i++;
            if (i < i3) {
                t2 = this.f4362a[i];
                if (this.f4367f.compare(t2, t) != 0) {
                }
            }
            return -1;
        } while (!this.f4367f.mo5799b(t2, t));
        return i;
    }
}
