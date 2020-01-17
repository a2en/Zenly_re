package androidx.recyclerview.widget;

import androidx.core.util.C0605g;
import androidx.core.util.Pools$Pool;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.a */
class C1091a implements C1135a {

    /* renamed from: a */
    private Pools$Pool<C1093b> f4189a;

    /* renamed from: b */
    final ArrayList<C1093b> f4190b;

    /* renamed from: c */
    final ArrayList<C1093b> f4191c;

    /* renamed from: d */
    final C1092a f4192d;

    /* renamed from: e */
    Runnable f4193e;

    /* renamed from: f */
    final boolean f4194f;

    /* renamed from: g */
    final C1134n f4195g;

    /* renamed from: h */
    private int f4196h;

    /* renamed from: androidx.recyclerview.widget.a$a */
    interface C1092a {
        /* renamed from: a */
        C1085v mo5375a(int i);

        /* renamed from: a */
        void mo5376a(int i, int i2);

        /* renamed from: a */
        void mo5377a(int i, int i2, Object obj);

        /* renamed from: a */
        void mo5378a(C1093b bVar);

        /* renamed from: b */
        void mo5379b(int i, int i2);

        /* renamed from: b */
        void mo5380b(C1093b bVar);

        /* renamed from: c */
        void mo5381c(int i, int i2);

        /* renamed from: d */
        void mo5383d(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.a$b */
    static class C1093b {

        /* renamed from: a */
        int f4197a;

        /* renamed from: b */
        int f4198b;

        /* renamed from: c */
        Object f4199c;

        /* renamed from: d */
        int f4200d;

        C1093b(int i, int i2, int i3, Object obj) {
            this.f4197a = i;
            this.f4198b = i2;
            this.f4200d = i3;
            this.f4199c = obj;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public String mo5633a() {
            int i = this.f4197a;
            if (i == 1) {
                return "add";
            }
            if (i == 2) {
                return "rm";
            }
            if (i != 4) {
                return i != 8 ? "??" : "mv";
            }
            return "up";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1093b.class != obj.getClass()) {
                return false;
            }
            C1093b bVar = (C1093b) obj;
            int i = this.f4197a;
            if (i != bVar.f4197a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f4200d - this.f4198b) == 1 && this.f4200d == bVar.f4198b && this.f4198b == bVar.f4200d) {
                return true;
            }
            if (this.f4200d != bVar.f4200d || this.f4198b != bVar.f4198b) {
                return false;
            }
            Object obj2 = this.f4199c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f4199c)) {
                    return false;
                }
            } else if (bVar.f4199c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f4197a * 31) + this.f4198b) * 31) + this.f4200d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            sb.append(mo5633a());
            sb.append(",s:");
            sb.append(this.f4198b);
            sb.append("c:");
            sb.append(this.f4200d);
            sb.append(",p:");
            sb.append(this.f4199c);
            sb.append("]");
            return sb.toString();
        }
    }

    C1091a(C1092a aVar) {
        this(aVar, false);
    }

    /* renamed from: b */
    private void m5388b(C1093b bVar) {
        m5395g(bVar);
    }

    /* renamed from: c */
    private void m5389c(C1093b bVar) {
        m5395g(bVar);
    }

    /* renamed from: d */
    private void m5391d(C1093b bVar) {
        char c;
        boolean z;
        boolean z2;
        int i = bVar.f4198b;
        int i2 = bVar.f4200d + i;
        int i3 = 0;
        char c2 = 65535;
        int i4 = i;
        while (i4 < i2) {
            if (this.f4192d.mo5375a(i4) != null || m5392d(i4)) {
                if (c2 == 0) {
                    m5394f(mo5617a(2, i, i3, null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    m5395g(mo5617a(2, i, i3, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i4 -= i3;
                i2 -= i3;
                i3 = 1;
            } else {
                i3++;
            }
            i4++;
            c2 = c;
        }
        if (i3 != bVar.f4200d) {
            mo5619a(bVar);
            bVar = mo5617a(2, i, i3, null);
        }
        if (c2 == 0) {
            m5394f(bVar);
        } else {
            m5395g(bVar);
        }
    }

    /* renamed from: g */
    private void m5395g(C1093b bVar) {
        this.f4191c.add(bVar);
        int i = bVar.f4197a;
        if (i == 1) {
            this.f4192d.mo5381c(bVar.f4198b, bVar.f4200d);
        } else if (i == 2) {
            this.f4192d.mo5379b(bVar.f4198b, bVar.f4200d);
        } else if (i == 4) {
            this.f4192d.mo5377a(bVar.f4198b, bVar.f4200d, bVar.f4199c);
        } else if (i == 8) {
            this.f4192d.mo5376a(bVar.f4198b, bVar.f4200d);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown update op type for ");
            sb.append(bVar);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5618a() {
        int size = this.f4191c.size();
        for (int i = 0; i < size; i++) {
            this.f4192d.mo5380b((C1093b) this.f4191c.get(i));
        }
        mo5621a((List<C1093b>) this.f4191c);
        this.f4196h = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo5631e() {
        this.f4195g.mo5742a(this.f4190b);
        int size = this.f4190b.size();
        for (int i = 0; i < size; i++) {
            C1093b bVar = (C1093b) this.f4190b.get(i);
            int i2 = bVar.f4197a;
            if (i2 == 1) {
                m5388b(bVar);
            } else if (i2 == 2) {
                m5391d(bVar);
            } else if (i2 == 4) {
                m5393e(bVar);
            } else if (i2 == 8) {
                m5389c(bVar);
            }
            Runnable runnable = this.f4193e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f4190b.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo5632f() {
        mo5621a((List<C1093b>) this.f4190b);
        mo5621a((List<C1093b>) this.f4191c);
        this.f4196h = 0;
    }

    C1091a(C1092a aVar, boolean z) {
        this.f4189a = new C0605g(30);
        this.f4190b = new ArrayList<>();
        this.f4191c = new ArrayList<>();
        this.f4196h = 0;
        this.f4192d = aVar;
        this.f4194f = z;
        this.f4195g = new C1134n(this);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo5624b(int i) {
        return mo5616a(i, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo5627c() {
        return this.f4190b.size() > 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo5626b(int i, int i2) {
        boolean z = false;
        if (i2 < 1) {
            return false;
        }
        this.f4190b.add(mo5617a(1, i, i2, null));
        this.f4196h |= 1;
        if (this.f4190b.size() == 1) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo5628c(int i) {
        return (i & this.f4196h) != 0;
    }

    /* renamed from: f */
    private void m5394f(C1093b bVar) {
        int i;
        int i2 = bVar.f4197a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int d = m5390d(bVar.f4198b, i2);
        int i3 = bVar.f4198b;
        int i4 = bVar.f4197a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("op should be remove or update.");
            sb.append(bVar);
            throw new IllegalArgumentException(sb.toString());
        }
        int i5 = d;
        int i6 = i3;
        int i7 = 1;
        for (int i8 = 1; i8 < bVar.f4200d; i8++) {
            int d2 = m5390d(bVar.f4198b + (i * i8), bVar.f4197a);
            int i9 = bVar.f4197a;
            if (i9 == 2 ? d2 == i5 : i9 == 4 && d2 == i5 + 1) {
                i7++;
            } else {
                C1093b a = mo5617a(bVar.f4197a, i5, i7, bVar.f4199c);
                mo5620a(a, i6);
                mo5619a(a);
                if (bVar.f4197a == 4) {
                    i6 += i7;
                }
                i5 = d2;
                i7 = 1;
            }
        }
        Object obj = bVar.f4199c;
        mo5619a(bVar);
        if (i7 > 0) {
            C1093b a2 = mo5617a(bVar.f4197a, i5, i7, obj);
            mo5620a(a2, i6);
            mo5619a(a2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo5629c(int i, int i2) {
        boolean z = false;
        if (i2 < 1) {
            return false;
        }
        this.f4190b.add(mo5617a(2, i, i2, null));
        this.f4196h |= 2;
        if (this.f4190b.size() == 1) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5620a(C1093b bVar, int i) {
        this.f4192d.mo5378a(bVar);
        int i2 = bVar.f4197a;
        if (i2 == 2) {
            this.f4192d.mo5383d(i, bVar.f4200d);
        } else if (i2 == 4) {
            this.f4192d.mo5377a(i, bVar.f4200d, bVar.f4199c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5625b() {
        mo5618a();
        int size = this.f4190b.size();
        for (int i = 0; i < size; i++) {
            C1093b bVar = (C1093b) this.f4190b.get(i);
            int i2 = bVar.f4197a;
            if (i2 == 1) {
                this.f4192d.mo5380b(bVar);
                this.f4192d.mo5381c(bVar.f4198b, bVar.f4200d);
            } else if (i2 == 2) {
                this.f4192d.mo5380b(bVar);
                this.f4192d.mo5383d(bVar.f4198b, bVar.f4200d);
            } else if (i2 == 4) {
                this.f4192d.mo5380b(bVar);
                this.f4192d.mo5377a(bVar.f4198b, bVar.f4200d, bVar.f4199c);
            } else if (i2 == 8) {
                this.f4192d.mo5380b(bVar);
                this.f4192d.mo5376a(bVar.f4198b, bVar.f4200d);
            }
            Runnable runnable = this.f4193e;
            if (runnable != null) {
                runnable.run();
            }
        }
        mo5621a((List<C1093b>) this.f4190b);
        this.f4196h = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo5616a(int i, int i2) {
        int size = this.f4191c.size();
        while (i2 < size) {
            C1093b bVar = (C1093b) this.f4191c.get(i2);
            int i3 = bVar.f4197a;
            if (i3 == 8) {
                int i4 = bVar.f4198b;
                if (i4 == i) {
                    i = bVar.f4200d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f4200d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f4198b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f4200d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f4200d;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: e */
    private void m5393e(C1093b bVar) {
        int i = bVar.f4198b;
        int i2 = bVar.f4200d + i;
        int i3 = i;
        int i4 = 0;
        char c = 65535;
        while (i < i2) {
            if (this.f4192d.mo5375a(i) != null || m5392d(i)) {
                if (c == 0) {
                    m5394f(mo5617a(4, i3, i4, bVar.f4199c));
                    i3 = i;
                    i4 = 0;
                }
                c = 1;
            } else {
                if (c == 1) {
                    m5395g(mo5617a(4, i3, i4, bVar.f4199c));
                    i3 = i;
                    i4 = 0;
                }
                c = 0;
            }
            i4++;
            i++;
        }
        if (i4 != bVar.f4200d) {
            Object obj = bVar.f4199c;
            mo5619a(bVar);
            bVar = mo5617a(4, i3, i4, obj);
        }
        if (c == 0) {
            m5394f(bVar);
        } else {
            m5395g(bVar);
        }
    }

    /* renamed from: d */
    private int m5390d(int i, int i2) {
        for (int size = this.f4191c.size() - 1; size >= 0; size--) {
            C1093b bVar = (C1093b) this.f4191c.get(size);
            int i3 = bVar.f4197a;
            if (i3 == 8) {
                int i4 = bVar.f4198b;
                int i5 = bVar.f4200d;
                if (i4 >= i5) {
                    int i6 = i5;
                    i5 = i4;
                    i4 = i6;
                }
                if (i < i4 || i > i5) {
                    int i7 = bVar.f4198b;
                    if (i < i7) {
                        if (i2 == 1) {
                            bVar.f4198b = i7 + 1;
                            bVar.f4200d++;
                        } else if (i2 == 2) {
                            bVar.f4198b = i7 - 1;
                            bVar.f4200d--;
                        }
                    }
                } else {
                    int i8 = bVar.f4198b;
                    if (i4 == i8) {
                        if (i2 == 1) {
                            bVar.f4200d++;
                        } else if (i2 == 2) {
                            bVar.f4200d--;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            bVar.f4198b = i8 + 1;
                        } else if (i2 == 2) {
                            bVar.f4198b = i8 - 1;
                        }
                        i--;
                    }
                }
            } else {
                int i9 = bVar.f4198b;
                if (i9 <= i) {
                    if (i3 == 1) {
                        i -= bVar.f4200d;
                    } else if (i3 == 2) {
                        i += bVar.f4200d;
                    }
                } else if (i2 == 1) {
                    bVar.f4198b = i9 + 1;
                } else if (i2 == 2) {
                    bVar.f4198b = i9 - 1;
                }
            }
        }
        for (int size2 = this.f4191c.size() - 1; size2 >= 0; size2--) {
            C1093b bVar2 = (C1093b) this.f4191c.get(size2);
            if (bVar2.f4197a == 8) {
                int i10 = bVar2.f4200d;
                if (i10 == bVar2.f4198b || i10 < 0) {
                    this.f4191c.remove(size2);
                    mo5619a(bVar2);
                }
            } else if (bVar2.f4200d <= 0) {
                this.f4191c.remove(size2);
                mo5619a(bVar2);
            }
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5623a(int i, int i2, Object obj) {
        boolean z = false;
        if (i2 < 1) {
            return false;
        }
        this.f4190b.add(mo5617a(4, i, i2, obj));
        this.f4196h |= 4;
        if (this.f4190b.size() == 1) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5622a(int i, int i2, int i3) {
        boolean z = false;
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.f4190b.add(mo5617a(8, i, i2, null));
            this.f4196h |= 8;
            if (this.f4190b.size() == 1) {
                z = true;
            }
            return z;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* renamed from: a */
    public int mo5615a(int i) {
        int size = this.f4190b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1093b bVar = (C1093b) this.f4190b.get(i2);
            int i3 = bVar.f4197a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f4198b;
                    if (i4 <= i) {
                        int i5 = bVar.f4200d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f4198b;
                    if (i6 == i) {
                        i = bVar.f4200d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f4200d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f4198b <= i) {
                i += bVar.f4200d;
            }
        }
        return i;
    }

    /* renamed from: a */
    public C1093b mo5617a(int i, int i2, int i3, Object obj) {
        C1093b bVar = (C1093b) this.f4189a.acquire();
        if (bVar == null) {
            return new C1093b(i, i2, i3, obj);
        }
        bVar.f4197a = i;
        bVar.f4198b = i2;
        bVar.f4200d = i3;
        bVar.f4199c = obj;
        return bVar;
    }

    /* renamed from: d */
    private boolean m5392d(int i) {
        int size = this.f4191c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1093b bVar = (C1093b) this.f4191c.get(i2);
            int i3 = bVar.f4197a;
            if (i3 == 8) {
                if (mo5616a(bVar.f4200d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f4198b;
                int i5 = bVar.f4200d + i4;
                while (i4 < i5) {
                    if (mo5616a(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo5619a(C1093b bVar) {
        if (!this.f4194f) {
            bVar.f4199c = null;
            this.f4189a.release(bVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5621a(List<C1093b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo5619a((C1093b) list.get(i));
        }
        list.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo5630d() {
        return !this.f4191c.isEmpty() && !this.f4190b.isEmpty();
    }
}
