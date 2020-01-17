package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView.C1069g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.g */
public class C1112g {

    /* renamed from: a */
    private static final Comparator<C1119g> f4259a = new C1113a();

    /* renamed from: androidx.recyclerview.widget.g$a */
    static class C1113a implements Comparator<C1119g> {
        C1113a() {
        }

        /* renamed from: a */
        public int compare(C1119g gVar, C1119g gVar2) {
            int i = gVar.f4274a - gVar2.f4274a;
            return i == 0 ? gVar.f4275b - gVar2.f4275b : i;
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$b */
    public static abstract class C1114b {
        public abstract boolean areContentsTheSame(int i, int i2);

        public abstract boolean areItemsTheSame(int i, int i2);

        public Object getChangePayload(int i, int i2) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* renamed from: androidx.recyclerview.widget.g$c */
    public static class C1115c {

        /* renamed from: a */
        private final List<C1119g> f4260a;

        /* renamed from: b */
        private final int[] f4261b;

        /* renamed from: c */
        private final int[] f4262c;

        /* renamed from: d */
        private final C1114b f4263d;

        /* renamed from: e */
        private final int f4264e;

        /* renamed from: f */
        private final int f4265f;

        /* renamed from: g */
        private final boolean f4266g;

        C1115c(C1114b bVar, List<C1119g> list, int[] iArr, int[] iArr2, boolean z) {
            this.f4260a = list;
            this.f4261b = iArr;
            this.f4262c = iArr2;
            Arrays.fill(this.f4261b, 0);
            Arrays.fill(this.f4262c, 0);
            this.f4263d = bVar;
            this.f4264e = bVar.getOldListSize();
            this.f4265f = bVar.getNewListSize();
            this.f4266g = z;
            m5472a();
            m5476b();
        }

        /* renamed from: a */
        private void m5472a() {
            C1119g gVar = this.f4260a.isEmpty() ? null : (C1119g) this.f4260a.get(0);
            if (gVar == null || gVar.f4274a != 0 || gVar.f4275b != 0) {
                C1119g gVar2 = new C1119g();
                gVar2.f4274a = 0;
                gVar2.f4275b = 0;
                gVar2.f4277d = false;
                gVar2.f4276c = 0;
                gVar2.f4278e = false;
                this.f4260a.add(0, gVar2);
            }
        }

        /* renamed from: b */
        private void m5476b() {
            int i = this.f4264e;
            int i2 = this.f4265f;
            for (int size = this.f4260a.size() - 1; size >= 0; size--) {
                C1119g gVar = (C1119g) this.f4260a.get(size);
                int i3 = gVar.f4274a;
                int i4 = gVar.f4276c;
                int i5 = i3 + i4;
                int i6 = gVar.f4275b + i4;
                if (this.f4266g) {
                    while (i > i5) {
                        m5473a(i, i2, size);
                        i--;
                    }
                    while (i2 > i6) {
                        m5477b(i, i2, size);
                        i2--;
                    }
                }
                for (int i7 = 0; i7 < gVar.f4276c; i7++) {
                    int i8 = gVar.f4274a + i7;
                    int i9 = gVar.f4275b + i7;
                    int i10 = this.f4263d.areContentsTheSame(i8, i9) ? 1 : 2;
                    this.f4261b[i8] = (i9 << 5) | i10;
                    this.f4262c[i9] = (i8 << 5) | i10;
                }
                i = gVar.f4274a;
                i2 = gVar.f4275b;
            }
        }

        /* renamed from: a */
        private void m5473a(int i, int i2, int i3) {
            if (this.f4261b[i - 1] == 0) {
                m5475a(i, i2, i3, false);
            }
        }

        /* renamed from: a */
        public int mo5695a(int i) {
            if (i < 0 || i >= this.f4264e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Index out of bounds - passed position = ");
                sb.append(i);
                sb.append(", old list size = ");
                sb.append(this.f4264e);
                throw new IndexOutOfBoundsException(sb.toString());
            }
            int i2 = this.f4261b[i];
            if ((i2 & 31) == 0) {
                return -1;
            }
            return i2 >> 5;
        }

        /* renamed from: a */
        private boolean m5475a(int i, int i2, int i3, boolean z) {
            int i4;
            int i5;
            if (z) {
                i2--;
                i5 = i;
                i4 = i2;
            } else {
                i5 = i - 1;
                i4 = i5;
            }
            while (i3 >= 0) {
                C1119g gVar = (C1119g) this.f4260a.get(i3);
                int i6 = gVar.f4274a;
                int i7 = gVar.f4276c;
                int i8 = i6 + i7;
                int i9 = gVar.f4275b + i7;
                int i10 = 8;
                if (z) {
                    for (int i11 = i5 - 1; i11 >= i8; i11--) {
                        if (this.f4263d.areItemsTheSame(i11, i4)) {
                            if (!this.f4263d.areContentsTheSame(i11, i4)) {
                                i10 = 4;
                            }
                            this.f4262c[i4] = (i11 << 5) | 16;
                            this.f4261b[i11] = (i4 << 5) | i10;
                            return true;
                        }
                    }
                    continue;
                } else {
                    for (int i12 = i2 - 1; i12 >= i9; i12--) {
                        if (this.f4263d.areItemsTheSame(i4, i12)) {
                            if (!this.f4263d.areContentsTheSame(i4, i12)) {
                                i10 = 4;
                            }
                            int i13 = i - 1;
                            this.f4261b[i13] = (i12 << 5) | 16;
                            this.f4262c[i12] = (i13 << 5) | i10;
                            return true;
                        }
                    }
                    continue;
                }
                i5 = gVar.f4274a;
                i2 = gVar.f4275b;
                i3--;
            }
            return false;
        }

        /* renamed from: b */
        private void m5477b(int i, int i2, int i3) {
            if (this.f4262c[i2 - 1] == 0) {
                m5475a(i, i2, i3, true);
            }
        }

        /* renamed from: b */
        private void m5478b(List<C1117e> list, ListUpdateCallback listUpdateCallback, int i, int i2, int i3) {
            if (!this.f4266g) {
                listUpdateCallback.onRemoved(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.f4261b[i5] & 31;
                if (i6 == 0) {
                    listUpdateCallback.onRemoved(i + i4, 1);
                    for (C1117e eVar : list) {
                        eVar.f4268b--;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = this.f4261b[i5] >> 5;
                    C1117e a = m5471a(list, i7, false);
                    listUpdateCallback.onMoved(i + i4, a.f4268b - 1);
                    if (i6 == 4) {
                        listUpdateCallback.onChanged(a.f4268b - 1, 1, this.f4263d.getChangePayload(i5, i7));
                    }
                } else if (i6 == 16) {
                    list.add(new C1117e(i5, i + i4, true));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unknown flag for pos ");
                    sb.append(i5);
                    sb.append(" ");
                    sb.append(Long.toBinaryString((long) i6));
                    throw new IllegalStateException(sb.toString());
                }
            }
        }

        /* renamed from: a */
        public void mo5697a(C1069g gVar) {
            mo5696a((ListUpdateCallback) new C1094b(gVar));
        }

        /* renamed from: a */
        public void mo5696a(ListUpdateCallback listUpdateCallback) {
            C1097d dVar;
            if (listUpdateCallback instanceof C1097d) {
                dVar = (C1097d) listUpdateCallback;
            } else {
                dVar = new C1097d(listUpdateCallback);
            }
            ArrayList arrayList = new ArrayList();
            int i = this.f4264e;
            int i2 = this.f4265f;
            for (int size = this.f4260a.size() - 1; size >= 0; size--) {
                C1119g gVar = (C1119g) this.f4260a.get(size);
                int i3 = gVar.f4276c;
                int i4 = gVar.f4274a + i3;
                int i5 = gVar.f4275b + i3;
                if (i4 < i) {
                    m5478b(arrayList, dVar, i4, i - i4, i4);
                }
                if (i5 < i2) {
                    m5474a(arrayList, dVar, i4, i2 - i5, i5);
                }
                for (int i6 = i3 - 1; i6 >= 0; i6--) {
                    int[] iArr = this.f4261b;
                    int i7 = gVar.f4274a;
                    if ((iArr[i7 + i6] & 31) == 2) {
                        dVar.onChanged(i7 + i6, 1, this.f4263d.getChangePayload(i7 + i6, gVar.f4275b + i6));
                    }
                }
                i = gVar.f4274a;
                i2 = gVar.f4275b;
            }
            dVar.mo5641a();
        }

        /* renamed from: a */
        private static C1117e m5471a(List<C1117e> list, int i, boolean z) {
            int size = list.size() - 1;
            while (size >= 0) {
                C1117e eVar = (C1117e) list.get(size);
                if (eVar.f4267a == i && eVar.f4269c == z) {
                    list.remove(size);
                    while (size < list.size()) {
                        C1117e eVar2 = (C1117e) list.get(size);
                        eVar2.f4268b += z ? 1 : -1;
                        size++;
                    }
                    return eVar;
                }
                size--;
            }
            return null;
        }

        /* renamed from: a */
        private void m5474a(List<C1117e> list, ListUpdateCallback listUpdateCallback, int i, int i2, int i3) {
            if (!this.f4266g) {
                listUpdateCallback.onInserted(i, i2);
                return;
            }
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = i3 + i4;
                int i6 = this.f4262c[i5] & 31;
                if (i6 == 0) {
                    listUpdateCallback.onInserted(i, 1);
                    for (C1117e eVar : list) {
                        eVar.f4268b++;
                    }
                } else if (i6 == 4 || i6 == 8) {
                    int i7 = this.f4262c[i5] >> 5;
                    listUpdateCallback.onMoved(m5471a(list, i7, true).f4268b, i);
                    if (i6 == 4) {
                        listUpdateCallback.onChanged(i, 1, this.f4263d.getChangePayload(i7, i5));
                    }
                } else if (i6 == 16) {
                    list.add(new C1117e(i5, i, false));
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unknown flag for pos ");
                    sb.append(i5);
                    sb.append(" ");
                    sb.append(Long.toBinaryString((long) i6));
                    throw new IllegalStateException(sb.toString());
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$d */
    public static abstract class C1116d<T> {
        /* renamed from: a */
        public abstract boolean mo5698a(T t, T t2);

        /* renamed from: b */
        public abstract boolean mo5699b(T t, T t2);

        /* renamed from: c */
        public Object mo5700c(T t, T t2) {
            return null;
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$e */
    private static class C1117e {

        /* renamed from: a */
        int f4267a;

        /* renamed from: b */
        int f4268b;

        /* renamed from: c */
        boolean f4269c;

        public C1117e(int i, int i2, boolean z) {
            this.f4267a = i;
            this.f4268b = i2;
            this.f4269c = z;
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$f */
    static class C1118f {

        /* renamed from: a */
        int f4270a;

        /* renamed from: b */
        int f4271b;

        /* renamed from: c */
        int f4272c;

        /* renamed from: d */
        int f4273d;

        public C1118f() {
        }

        public C1118f(int i, int i2, int i3, int i4) {
            this.f4270a = i;
            this.f4271b = i2;
            this.f4272c = i3;
            this.f4273d = i4;
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$g */
    static class C1119g {

        /* renamed from: a */
        int f4274a;

        /* renamed from: b */
        int f4275b;

        /* renamed from: c */
        int f4276c;

        /* renamed from: d */
        boolean f4277d;

        /* renamed from: e */
        boolean f4278e;

        C1119g() {
        }
    }

    /* renamed from: a */
    public static C1115c m5467a(C1114b bVar) {
        return m5468a(bVar, true);
    }

    /* renamed from: a */
    public static C1115c m5468a(C1114b bVar, boolean z) {
        C1118f fVar;
        int oldListSize = bVar.getOldListSize();
        int newListSize = bVar.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C1118f(0, oldListSize, 0, newListSize));
        int abs = Math.abs(oldListSize - newListSize) + oldListSize + newListSize;
        int i = abs * 2;
        int[] iArr = new int[i];
        int[] iArr2 = new int[i];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C1118f fVar2 = (C1118f) arrayList2.remove(arrayList2.size() - 1);
            C1119g a = m5469a(bVar, fVar2.f4270a, fVar2.f4271b, fVar2.f4272c, fVar2.f4273d, iArr, iArr2, abs);
            if (a != null) {
                if (a.f4276c > 0) {
                    arrayList.add(a);
                }
                a.f4274a += fVar2.f4270a;
                a.f4275b += fVar2.f4272c;
                if (arrayList3.isEmpty()) {
                    fVar = new C1118f();
                } else {
                    fVar = (C1118f) arrayList3.remove(arrayList3.size() - 1);
                }
                fVar.f4270a = fVar2.f4270a;
                fVar.f4272c = fVar2.f4272c;
                if (a.f4278e) {
                    fVar.f4271b = a.f4274a;
                    fVar.f4273d = a.f4275b;
                } else if (a.f4277d) {
                    fVar.f4271b = a.f4274a - 1;
                    fVar.f4273d = a.f4275b;
                } else {
                    fVar.f4271b = a.f4274a;
                    fVar.f4273d = a.f4275b - 1;
                }
                arrayList2.add(fVar);
                if (!a.f4278e) {
                    int i2 = a.f4274a;
                    int i3 = a.f4276c;
                    fVar2.f4270a = i2 + i3;
                    fVar2.f4272c = a.f4275b + i3;
                } else if (a.f4277d) {
                    int i4 = a.f4274a;
                    int i5 = a.f4276c;
                    fVar2.f4270a = i4 + i5 + 1;
                    fVar2.f4272c = a.f4275b + i5;
                } else {
                    int i6 = a.f4274a;
                    int i7 = a.f4276c;
                    fVar2.f4270a = i6 + i7;
                    fVar2.f4272c = a.f4275b + i7 + 1;
                }
                arrayList2.add(fVar2);
            } else {
                arrayList3.add(fVar2);
            }
        }
        Collections.sort(arrayList, f4259a);
        C1115c cVar = new C1115c(bVar, arrayList, iArr, iArr2, z);
        return cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r1[r13 - 1] < r1[r13 + r5]) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ba, code lost:
        if (r2[r13 - 1] < r2[r13 + 1]) goto L_0x00c7;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static androidx.recyclerview.widget.C1112g.C1119g m5469a(androidx.recyclerview.widget.C1112g.C1114b r19, int r20, int r21, int r22, int r23, int[] r24, int[] r25, int r26) {
        /*
            r0 = r19
            r1 = r24
            r2 = r25
            int r3 = r21 - r20
            int r4 = r23 - r22
            r5 = 1
            if (r3 < r5) goto L_0x0133
            if (r4 >= r5) goto L_0x0011
            goto L_0x0133
        L_0x0011:
            int r6 = r3 - r4
            int r7 = r3 + r4
            int r7 = r7 + r5
            int r7 = r7 / 2
            int r8 = r26 - r7
            int r8 = r8 - r5
            int r9 = r26 + r7
            int r9 = r9 + r5
            r10 = 0
            java.util.Arrays.fill(r1, r8, r9, r10)
            int r8 = r8 + r6
            int r9 = r9 + r6
            java.util.Arrays.fill(r2, r8, r9, r3)
            int r8 = r6 % 2
            if (r8 == 0) goto L_0x002d
            r8 = 1
            goto L_0x002e
        L_0x002d:
            r8 = 0
        L_0x002e:
            r9 = 0
        L_0x002f:
            if (r9 > r7) goto L_0x012b
            int r11 = -r9
            r12 = r11
        L_0x0033:
            if (r12 > r9) goto L_0x00a2
            if (r12 == r11) goto L_0x004d
            if (r12 == r9) goto L_0x0045
            int r13 = r26 + r12
            int r14 = r13 + -1
            r14 = r1[r14]
            int r13 = r13 + r5
            r13 = r1[r13]
            if (r14 >= r13) goto L_0x0045
            goto L_0x004d
        L_0x0045:
            int r13 = r26 + r12
            int r13 = r13 - r5
            r13 = r1[r13]
            int r13 = r13 + r5
            r14 = 1
            goto L_0x0053
        L_0x004d:
            int r13 = r26 + r12
            int r13 = r13 + r5
            r13 = r1[r13]
            r14 = 0
        L_0x0053:
            int r15 = r13 - r12
        L_0x0055:
            if (r13 >= r3) goto L_0x006a
            if (r15 >= r4) goto L_0x006a
            int r10 = r20 + r13
            int r5 = r22 + r15
            boolean r5 = r0.areItemsTheSame(r10, r5)
            if (r5 == 0) goto L_0x006a
            int r13 = r13 + 1
            int r15 = r15 + 1
            r5 = 1
            r10 = 0
            goto L_0x0055
        L_0x006a:
            int r5 = r26 + r12
            r1[r5] = r13
            if (r8 == 0) goto L_0x009c
            int r10 = r6 - r9
            r13 = 1
            int r10 = r10 + r13
            if (r12 < r10) goto L_0x009c
            int r10 = r6 + r9
            int r10 = r10 - r13
            if (r12 > r10) goto L_0x009c
            r10 = r1[r5]
            r13 = r2[r5]
            if (r10 < r13) goto L_0x009c
            androidx.recyclerview.widget.g$g r0 = new androidx.recyclerview.widget.g$g
            r0.<init>()
            r3 = r2[r5]
            r0.f4274a = r3
            int r3 = r0.f4274a
            int r3 = r3 - r12
            r0.f4275b = r3
            r1 = r1[r5]
            r2 = r2[r5]
            int r1 = r1 - r2
            r0.f4276c = r1
            r0.f4277d = r14
            r5 = 0
            r0.f4278e = r5
            return r0
        L_0x009c:
            r5 = 0
            int r12 = r12 + 2
            r5 = 1
            r10 = 0
            goto L_0x0033
        L_0x00a2:
            r5 = 0
            r10 = r11
        L_0x00a4:
            if (r10 > r9) goto L_0x0120
            int r12 = r10 + r6
            int r13 = r9 + r6
            if (r12 == r13) goto L_0x00c6
            int r13 = r11 + r6
            if (r12 == r13) goto L_0x00bd
            int r13 = r26 + r12
            int r14 = r13 + -1
            r14 = r2[r14]
            r15 = 1
            int r13 = r13 + r15
            r13 = r2[r13]
            if (r14 >= r13) goto L_0x00be
            goto L_0x00c7
        L_0x00bd:
            r15 = 1
        L_0x00be:
            int r13 = r26 + r12
            int r13 = r13 + r15
            r13 = r2[r13]
            int r13 = r13 - r15
            r14 = 1
            goto L_0x00cd
        L_0x00c6:
            r15 = 1
        L_0x00c7:
            int r13 = r26 + r12
            int r13 = r13 - r15
            r13 = r2[r13]
            r14 = 0
        L_0x00cd:
            int r16 = r13 - r12
        L_0x00cf:
            if (r13 <= 0) goto L_0x00ec
            if (r16 <= 0) goto L_0x00ec
            int r17 = r20 + r13
            int r5 = r17 + -1
            int r17 = r22 + r16
            r18 = r3
            int r3 = r17 + -1
            boolean r3 = r0.areItemsTheSame(r5, r3)
            if (r3 == 0) goto L_0x00ee
            int r13 = r13 + -1
            int r16 = r16 + -1
            r3 = r18
            r5 = 0
            r15 = 1
            goto L_0x00cf
        L_0x00ec:
            r18 = r3
        L_0x00ee:
            int r3 = r26 + r12
            r2[r3] = r13
            if (r8 != 0) goto L_0x0119
            if (r12 < r11) goto L_0x0119
            if (r12 > r9) goto L_0x0119
            r5 = r1[r3]
            r13 = r2[r3]
            if (r5 < r13) goto L_0x0119
            androidx.recyclerview.widget.g$g r0 = new androidx.recyclerview.widget.g$g
            r0.<init>()
            r4 = r2[r3]
            r0.f4274a = r4
            int r4 = r0.f4274a
            int r4 = r4 - r12
            r0.f4275b = r4
            r1 = r1[r3]
            r2 = r2[r3]
            int r1 = r1 - r2
            r0.f4276c = r1
            r0.f4277d = r14
            r3 = 1
            r0.f4278e = r3
            return r0
        L_0x0119:
            r3 = 1
            int r10 = r10 + 2
            r3 = r18
            r5 = 0
            goto L_0x00a4
        L_0x0120:
            r18 = r3
            r3 = 1
            int r9 = r9 + 1
            r3 = r18
            r5 = 1
            r10 = 0
            goto L_0x002f
        L_0x012b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "DiffUtil hit an unexpected case while trying to calculate the optimal path. Please make sure your data is not changing during the diff calculation."
            r0.<init>(r1)
            throw r0
        L_0x0133:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.C1112g.m5469a(androidx.recyclerview.widget.g$b, int, int, int, int, int[], int[], int):androidx.recyclerview.widget.g$g");
    }
}
