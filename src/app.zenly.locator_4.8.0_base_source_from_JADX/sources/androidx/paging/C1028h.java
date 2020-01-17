package androidx.paging;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.paging.h */
final class C1028h<T> extends AbstractList<T> {

    /* renamed from: m */
    private static final List f3857m = new ArrayList();

    /* renamed from: e */
    private int f3858e;

    /* renamed from: f */
    private final ArrayList<List<T>> f3859f;

    /* renamed from: g */
    private int f3860g;

    /* renamed from: h */
    private int f3861h;

    /* renamed from: i */
    private int f3862i;

    /* renamed from: j */
    private int f3863j;

    /* renamed from: k */
    private int f3864k;

    /* renamed from: l */
    private int f3865l;

    /* renamed from: androidx.paging.h$a */
    interface C1029a {
        /* renamed from: a */
        void mo4824a(int i);

        /* renamed from: a */
        void mo4825a(int i, int i2);

        /* renamed from: a */
        void mo4826a(int i, int i2, int i3);

        /* renamed from: b */
        void mo4829b(int i);

        /* renamed from: b */
        void mo4830b(int i, int i2, int i3);
    }

    C1028h() {
        this.f3858e = 0;
        this.f3859f = new ArrayList<>();
        this.f3860g = 0;
        this.f3861h = 0;
        this.f3862i = 0;
        this.f3863j = 1;
        this.f3864k = 0;
        this.f3865l = 0;
    }

    /* renamed from: a */
    private void m4600a(int i, List<T> list, int i2, int i3) {
        this.f3858e = i;
        this.f3859f.clear();
        this.f3859f.add(list);
        this.f3860g = i2;
        this.f3861h = i3;
        this.f3862i = list.size();
        this.f3863j = list.size();
        this.f3864k = 0;
        this.f3865l = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo4880b() {
        int i = this.f3860g;
        for (int size = this.f3859f.size() - 1; size >= 0; size--) {
            List list = (List) this.f3859f.get(size);
            if (list != null && list != f3857m) {
                break;
            }
            i += this.f3863j;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public T mo4882c() {
        return ((List) this.f3859f.get(0)).get(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public T mo4883d() {
        ArrayList<List<T>> arrayList = this.f3859f;
        List list = (List) arrayList.get(arrayList.size() - 1);
        return list.get(list.size() - 1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public int mo4884e() {
        return this.f3858e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo4885f() {
        return this.f3865l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public int mo4886g() {
        return this.f3864k;
    }

    public T get(int i) {
        int i2;
        if (i < 0 || i >= size()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Index: ");
            sb.append(i);
            sb.append(", Size: ");
            sb.append(size());
            throw new IndexOutOfBoundsException(sb.toString());
        }
        int i3 = i - this.f3858e;
        if (i3 >= 0 && i3 < this.f3862i) {
            if (mo4892l()) {
                int i4 = this.f3863j;
                i2 = i3 / i4;
                i3 %= i4;
            } else {
                int size = this.f3859f.size();
                i2 = 0;
                while (i2 < size) {
                    int size2 = ((List) this.f3859f.get(i2)).size();
                    if (size2 > i3) {
                        break;
                    }
                    i3 -= size2;
                    i2++;
                }
            }
            List list = (List) this.f3859f.get(i2);
            if (!(list == null || list.size() == 0)) {
                return list.get(i3);
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public int mo4888h() {
        return this.f3859f.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public int mo4889i() {
        return this.f3861h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public int mo4890j() {
        return this.f3862i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public int mo4891k() {
        return this.f3860g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public boolean mo4892l() {
        return this.f3863j > 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public C1028h<T> mo4893m() {
        return new C1028h<>(this);
    }

    public int size() {
        return this.f3858e + this.f3862i + this.f3860g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("leading ");
        sb.append(this.f3858e);
        sb.append(", storage ");
        sb.append(this.f3862i);
        sb.append(", trailing ");
        sb.append(mo4891k());
        StringBuilder sb2 = new StringBuilder(sb.toString());
        for (int i = 0; i < this.f3859f.size(); i++) {
            sb2.append(" ");
            sb2.append(this.f3859f.get(i));
        }
        return sb2.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo4881b(List<T> list, C1029a aVar) {
        int size = list.size();
        if (size != 0) {
            int i = this.f3863j;
            if (i > 0 && size != i) {
                if (this.f3859f.size() != 1 || size <= this.f3863j) {
                    this.f3863j = -1;
                } else {
                    this.f3863j = size;
                }
            }
            this.f3859f.add(0, list);
            this.f3862i += size;
            int min = Math.min(this.f3858e, size);
            int i2 = size - min;
            if (min != 0) {
                this.f3858e -= min;
            }
            this.f3861h -= i2;
            this.f3864k += size;
            aVar.mo4830b(this.f3858e, min, i2);
        }
    }

    private C1028h(C1028h<T> hVar) {
        this.f3858e = hVar.f3858e;
        this.f3859f = new ArrayList<>(hVar.f3859f);
        this.f3860g = hVar.f3860g;
        this.f3861h = hVar.f3861h;
        this.f3862i = hVar.f3862i;
        this.f3863j = hVar.f3863j;
        this.f3864k = hVar.f3864k;
        this.f3865l = hVar.f3865l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4876a(int i, List<T> list, int i2, int i3, C1029a aVar) {
        m4600a(i, list, i2, i3);
        aVar.mo4824a(size());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo4873a() {
        int i = this.f3858e;
        int size = this.f3859f.size();
        for (int i2 = 0; i2 < size; i2++) {
            List list = (List) this.f3859f.get(i2);
            if (list != null && list != f3857m) {
                break;
            }
            i += this.f3863j;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4878a(List<T> list, C1029a aVar) {
        int size = list.size();
        if (size != 0) {
            if (this.f3863j > 0) {
                ArrayList<List<T>> arrayList = this.f3859f;
                int size2 = ((List) arrayList.get(arrayList.size() - 1)).size();
                int i = this.f3863j;
                if (size2 != i || size > i) {
                    this.f3863j = -1;
                }
            }
            this.f3859f.add(list);
            this.f3862i += size;
            int min = Math.min(this.f3860g, size);
            int i2 = size - min;
            if (min != 0) {
                this.f3860g -= min;
            }
            this.f3865l += size;
            aVar.mo4826a((this.f3858e + this.f3862i) - size, min, i2);
        }
    }

    /* renamed from: b */
    private void m4601b(int i, int i2) {
        int i3;
        int i4 = this.f3858e / this.f3863j;
        if (i < i4) {
            int i5 = 0;
            while (true) {
                i3 = i4 - i;
                if (i5 >= i3) {
                    break;
                }
                this.f3859f.add(0, null);
                i5++;
            }
            int i6 = i3 * this.f3863j;
            this.f3862i += i6;
            this.f3858e -= i6;
        } else {
            i = i4;
        }
        if (i2 >= this.f3859f.size() + i) {
            int min = Math.min(this.f3860g, ((i2 + 1) - (this.f3859f.size() + i)) * this.f3863j);
            for (int size = this.f3859f.size(); size <= i2 - i; size++) {
                ArrayList<List<T>> arrayList = this.f3859f;
                arrayList.add(arrayList.size(), null);
            }
            this.f3862i += min;
            this.f3860g -= min;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4875a(int i, List<T> list, int i2, int i3, int i4, C1029a aVar) {
        int size = (list.size() + (i4 - 1)) / i4;
        int i5 = 0;
        while (i5 < size) {
            int i6 = i5 * i4;
            int i7 = i5 + 1;
            List subList = list.subList(i6, Math.min(list.size(), i7 * i4));
            if (i5 == 0) {
                m4600a(i, subList, (list.size() + i2) - subList.size(), i3);
            } else {
                mo4877a(i6 + i, subList, null);
            }
            i5 = i7;
        }
        aVar.mo4824a(size());
    }

    /* renamed from: a */
    public void mo4877a(int i, List<T> list, C1029a aVar) {
        int size = list.size();
        if (size != this.f3863j) {
            int size2 = size();
            int i2 = this.f3863j;
            boolean z = false;
            boolean z2 = i == size2 - (size2 % i2) && size < i2;
            if (this.f3860g == 0 && this.f3859f.size() == 1 && size > this.f3863j) {
                z = true;
            }
            if (!z && !z2) {
                throw new IllegalArgumentException("page introduces incorrect tiling");
            } else if (z) {
                this.f3863j = size;
            }
        }
        int i3 = i / this.f3863j;
        m4601b(i3, i3);
        int i4 = i3 - (this.f3858e / this.f3863j);
        List list2 = (List) this.f3859f.get(i4);
        if (list2 == null || list2 == f3857m) {
            this.f3859f.set(i4, list);
            if (aVar != null) {
                aVar.mo4825a(i, list.size());
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid position ");
        sb.append(i);
        sb.append(": data already loaded");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public void mo4874a(int i, int i2, int i3, C1029a aVar) {
        int i4 = this.f3863j;
        if (i3 != i4) {
            if (i3 < i4) {
                throw new IllegalArgumentException("Page size cannot be reduced");
            } else if (this.f3859f.size() == 1 && this.f3860g == 0) {
                this.f3863j = i3;
            } else {
                throw new IllegalArgumentException("Page size can change only if last page is only one present");
            }
        }
        int size = size();
        int i5 = this.f3863j;
        int i6 = ((size + i5) - 1) / i5;
        int max = Math.max((i - i2) / i5, 0);
        int min = Math.min((i + i2) / this.f3863j, i6 - 1);
        m4601b(max, min);
        int i7 = this.f3858e / this.f3863j;
        while (max <= min) {
            int i8 = max - i7;
            if (this.f3859f.get(i8) == null) {
                this.f3859f.set(i8, f3857m);
                aVar.mo4829b(max);
            }
            max++;
        }
    }

    /* renamed from: a */
    public boolean mo4879a(int i, int i2) {
        int i3 = this.f3858e / i;
        if (i2 < i3 || i2 >= this.f3859f.size() + i3) {
            return false;
        }
        List list = (List) this.f3859f.get(i2 - i3);
        if (list == null || list == f3857m) {
            return false;
        }
        return true;
    }
}
