package okio;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: okio.m */
public final class C13359m extends AbstractList<C13346d> implements RandomAccess {

    /* renamed from: e */
    final C13346d[] f34647e;

    /* renamed from: f */
    final int[] f34648f;

    private C13359m(C13346d[] dVarArr, int[] iArr) {
        this.f34647e = dVarArr;
        this.f34648f = iArr;
    }

    /* renamed from: a */
    public static C13359m m35391a(C13346d... dVarArr) {
        if (dVarArr.length == 0) {
            return new C13359m(new C13346d[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(dVarArr));
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add(Integer.valueOf(-1));
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.set(Collections.binarySearch(arrayList, dVarArr[i2]), Integer.valueOf(i2));
        }
        if (((C13346d) arrayList.get(0)).mo38528g() != 0) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                C13346d dVar = (C13346d) arrayList.get(i3);
                int i4 = i3 + 1;
                int i5 = i4;
                while (i5 < arrayList.size()) {
                    C13346d dVar2 = (C13346d) arrayList.get(i5);
                    if (!dVar2.mo38521b(dVar)) {
                        continue;
                        break;
                    } else if (dVar2.mo38528g() == dVar.mo38528g()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("duplicate option: ");
                        sb.append(dVar2);
                        throw new IllegalArgumentException(sb.toString());
                    } else if (((Integer) arrayList2.get(i5)).intValue() > ((Integer) arrayList2.get(i3)).intValue()) {
                        arrayList.remove(i5);
                        arrayList2.remove(i5);
                    } else {
                        i5++;
                    }
                }
                i3 = i4;
            }
            C13342c cVar = new C13342c();
            m35392a(0, cVar, 0, arrayList, 0, arrayList.size(), arrayList2);
            int[] iArr = new int[m35390a(cVar)];
            for (int i6 = 0; i6 < iArr.length; i6++) {
                iArr[i6] = cVar.readInt();
            }
            if (cVar.exhausted()) {
                return new C13359m((C13346d[]) dVarArr.clone(), iArr);
            }
            throw new AssertionError();
        }
        throw new IllegalArgumentException("the empty byte string is not a supported option");
    }

    public final int size() {
        return this.f34647e.length;
    }

    public C13346d get(int i) {
        return this.f34647e[i];
    }

    /* renamed from: a */
    private static void m35392a(long j, C13342c cVar, int i, List<C13346d> list, int i2, int i3, List<Integer> list2) {
        int i4;
        int i5;
        C13342c cVar2;
        int i6;
        C13342c cVar3 = cVar;
        int i7 = i;
        List<C13346d> list3 = list;
        int i8 = i2;
        int i9 = i3;
        List<Integer> list4 = list2;
        if (i8 < i9) {
            int i10 = i8;
            while (i10 < i9) {
                if (((C13346d) list3.get(i10)).mo38528g() >= i7) {
                    i10++;
                } else {
                    throw new AssertionError();
                }
            }
            C13346d dVar = (C13346d) list.get(i2);
            C13346d dVar2 = (C13346d) list3.get(i9 - 1);
            int i11 = -1;
            if (i7 == dVar.mo38528g()) {
                i11 = ((Integer) list4.get(i8)).intValue();
                i8++;
                dVar = (C13346d) list3.get(i8);
            }
            int i12 = i8;
            if (dVar.mo38513a(i7) != dVar2.mo38513a(i7)) {
                int i13 = 1;
                for (int i14 = i12 + 1; i14 < i9; i14++) {
                    if (((C13346d) list3.get(i14 - 1)).mo38513a(i7) != ((C13346d) list3.get(i14)).mo38513a(i7)) {
                        i13++;
                    }
                }
                long a = j + ((long) m35390a(cVar)) + 2 + ((long) (i13 * 2));
                cVar3.writeInt(i13);
                cVar3.writeInt(i11);
                for (int i15 = i12; i15 < i9; i15++) {
                    byte a2 = ((C13346d) list3.get(i15)).mo38513a(i7);
                    if (i15 == i12 || a2 != ((C13346d) list3.get(i15 - 1)).mo38513a(i7)) {
                        cVar3.writeInt((int) a2 & 255);
                    }
                }
                C13342c cVar4 = new C13342c();
                int i16 = i12;
                while (i16 < i9) {
                    byte a3 = ((C13346d) list3.get(i16)).mo38513a(i7);
                    int i17 = i16 + 1;
                    int i18 = i17;
                    while (true) {
                        if (i18 >= i9) {
                            i5 = i9;
                            break;
                        } else if (a3 != ((C13346d) list3.get(i18)).mo38513a(i7)) {
                            i5 = i18;
                            break;
                        } else {
                            i18++;
                        }
                    }
                    if (i17 == i5 && i7 + 1 == ((C13346d) list3.get(i16)).mo38528g()) {
                        cVar3.writeInt(((Integer) list4.get(i16)).intValue());
                        i6 = i5;
                        cVar2 = cVar4;
                    } else {
                        cVar3.writeInt((int) ((((long) m35390a(cVar4)) + a) * -1));
                        i6 = i5;
                        cVar2 = cVar4;
                        m35392a(a, cVar4, i7 + 1, list, i16, i5, list2);
                    }
                    cVar4 = cVar2;
                    i16 = i6;
                }
                C13342c cVar5 = cVar4;
                cVar3.write(cVar5, cVar5.mo38488b());
                return;
            }
            int min = Math.min(dVar.mo38528g(), dVar2.mo38528g());
            int i19 = i7;
            int i20 = 0;
            while (i19 < min && dVar.mo38513a(i19) == dVar2.mo38513a(i19)) {
                i20++;
                i19++;
            }
            long a4 = 1 + j + ((long) m35390a(cVar)) + 2 + ((long) i20);
            cVar3.writeInt(-i20);
            cVar3.writeInt(i11);
            int i21 = i7;
            while (true) {
                i4 = i7 + i20;
                if (i21 >= i4) {
                    break;
                }
                cVar3.writeInt((int) dVar.mo38513a(i21) & 255);
                i21++;
            }
            if (i12 + 1 != i9) {
                C13342c cVar6 = new C13342c();
                cVar3.writeInt((int) ((((long) m35390a(cVar6)) + a4) * -1));
                m35392a(a4, cVar6, i4, list, i12, i3, list2);
                cVar3.write(cVar6, cVar6.mo38488b());
            } else if (i4 == ((C13346d) list3.get(i12)).mo38528g()) {
                cVar3.writeInt(((Integer) list4.get(i12)).intValue());
            } else {
                throw new AssertionError();
            }
        } else {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    private static int m35390a(C13342c cVar) {
        return (int) (cVar.mo38488b() / 4);
    }
}
