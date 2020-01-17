package androidx.constraintlayout.motion.widget;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.constraintlayout.solver.widgets.C0444f;
import androidx.constraintlayout.widget.C0467a;
import androidx.constraintlayout.widget.C0473c;
import androidx.constraintlayout.widget.C0473c.C0474a;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p214e.p229f.p230a.p231a.C7588b;
import p214e.p229f.p230a.p231a.C7590c;

/* renamed from: androidx.constraintlayout.motion.widget.n */
public class C0361n {

    /* renamed from: A */
    private C0358l[] f1620A;

    /* renamed from: a */
    View f1621a;

    /* renamed from: b */
    int f1622b;

    /* renamed from: c */
    private int f1623c = -1;

    /* renamed from: d */
    private C0363p f1624d = new C0363p();

    /* renamed from: e */
    private C0363p f1625e = new C0363p();

    /* renamed from: f */
    private C0360m f1626f = new C0360m();

    /* renamed from: g */
    private C0360m f1627g = new C0360m();

    /* renamed from: h */
    private C7588b[] f1628h;

    /* renamed from: i */
    private C7588b f1629i;

    /* renamed from: j */
    float f1630j = Float.NaN;

    /* renamed from: k */
    float f1631k = 0.0f;

    /* renamed from: l */
    float f1632l = 1.0f;

    /* renamed from: m */
    private int[] f1633m;

    /* renamed from: n */
    private double[] f1634n;

    /* renamed from: o */
    private double[] f1635o;

    /* renamed from: p */
    private String[] f1636p;

    /* renamed from: q */
    private int[] f1637q;

    /* renamed from: r */
    private int f1638r = 4;

    /* renamed from: s */
    private float[] f1639s = new float[this.f1638r];

    /* renamed from: t */
    private ArrayList<C0363p> f1640t = new ArrayList<>();

    /* renamed from: u */
    private float[] f1641u = new float[1];

    /* renamed from: v */
    private ArrayList<C0328c> f1642v = new ArrayList<>();

    /* renamed from: w */
    private HashMap<String, C0400u> f1643w;

    /* renamed from: x */
    private HashMap<String, C0384t> f1644x;

    /* renamed from: y */
    private HashMap<String, C0369s> f1645y;

    /* renamed from: z */
    private HashMap<String, C0333f> f1646z;

    C0361n(View view) {
        mo2353b(view);
    }

    /* renamed from: d */
    private float m1637d() {
        float[] fArr = new float[2];
        float f = 1.0f / ((float) 99);
        double d = 0.0d;
        double d2 = 0.0d;
        int i = 0;
        float f2 = 0.0f;
        while (i < 100) {
            float f3 = ((float) i) * f;
            double d3 = (double) f3;
            C7590c cVar = this.f1624d.f1648e;
            float f4 = Float.NaN;
            Iterator it = this.f1640t.iterator();
            float f5 = 0.0f;
            while (it.hasNext()) {
                C0363p pVar = (C0363p) it.next();
                C7590c cVar2 = pVar.f1648e;
                float f6 = f;
                if (cVar2 != null) {
                    float f7 = pVar.f1650g;
                    if (f7 < f3) {
                        f5 = f7;
                        cVar = cVar2;
                    } else if (Float.isNaN(f4)) {
                        f4 = pVar.f1650g;
                    }
                }
                f = f6;
            }
            float f8 = f;
            if (cVar != null) {
                if (Float.isNaN(f4)) {
                    f4 = 1.0f;
                }
                float f9 = f4 - f5;
                d3 = (double) ((((float) cVar.mo19644a((double) ((f3 - f5) / f9))) * f9) + f5);
            }
            this.f1628h[0].mo19630a(d3, this.f1634n);
            this.f1624d.mo2368a(this.f1633m, this.f1634n, fArr, 0);
            if (i > 0) {
                f2 = (float) (((double) f2) + Math.hypot(d2 - ((double) fArr[1]), d - ((double) fArr[0])));
            }
            d = (double) fArr[0];
            d2 = (double) fArr[1];
            i++;
            f = f8;
        }
        return f2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0363p mo2342a(int i) {
        return (C0363p) this.f1640t.get(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public float mo2352b() {
        return this.f1625e.f1652i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public float mo2355c() {
        return this.f1625e.f1653j;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(" start: x: ");
        sb.append(this.f1624d.f1652i);
        String str = " y: ";
        sb.append(str);
        sb.append(this.f1624d.f1653j);
        sb.append(" end: x: ");
        sb.append(this.f1625e.f1652i);
        sb.append(str);
        sb.append(this.f1625e.f1653j);
        return sb.toString();
    }

    /* renamed from: b */
    private void m1636b(C0363p pVar) {
        pVar.mo2360a((float) ((int) this.f1621a.getX()), (float) ((int) this.f1621a.getY()), (float) this.f1621a.getWidth(), (float) this.f1621a.getHeight());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2350a(float[] fArr, int i) {
        float[] fArr2 = fArr;
        int i2 = i;
        float f = 1.0f;
        float f2 = 1.0f / ((float) (i2 - 1));
        HashMap<String, C0369s> hashMap = this.f1645y;
        String str = "translationX";
        C0333f fVar = null;
        C0369s sVar = hashMap == null ? null : (C0369s) hashMap.get(str);
        HashMap<String, C0369s> hashMap2 = this.f1645y;
        String str2 = "translationY";
        C0369s sVar2 = hashMap2 == null ? null : (C0369s) hashMap2.get(str2);
        HashMap<String, C0333f> hashMap3 = this.f1646z;
        C0333f fVar2 = hashMap3 == null ? null : (C0333f) hashMap3.get(str);
        HashMap<String, C0333f> hashMap4 = this.f1646z;
        if (hashMap4 != null) {
            fVar = (C0333f) hashMap4.get(str2);
        }
        int i3 = 0;
        while (i3 < i2) {
            float f3 = ((float) i3) * f2;
            float f4 = 0.0f;
            if (this.f1632l != f) {
                if (f3 < this.f1631k) {
                    f3 = 0.0f;
                }
                float f5 = this.f1631k;
                if (f3 > f5 && ((double) f3) < 1.0d) {
                    f3 = (f3 - f5) * this.f1632l;
                }
            }
            double d = (double) f3;
            C7590c cVar = this.f1624d.f1648e;
            float f6 = Float.NaN;
            Iterator it = this.f1640t.iterator();
            while (it.hasNext()) {
                C0363p pVar = (C0363p) it.next();
                C7590c cVar2 = pVar.f1648e;
                if (cVar2 != null) {
                    C7590c cVar3 = cVar2;
                    float f7 = pVar.f1650g;
                    if (f7 < f3) {
                        f4 = f7;
                        cVar = cVar3;
                    } else if (Float.isNaN(f6)) {
                        f6 = pVar.f1650g;
                    }
                }
                int i4 = i;
            }
            if (cVar != null) {
                if (Float.isNaN(f6)) {
                    f6 = 1.0f;
                }
                float f8 = f6 - f4;
                d = (double) ((((float) cVar.mo19644a((double) ((f3 - f4) / f8))) * f8) + f4);
            }
            this.f1628h[0].mo19630a(d, this.f1634n);
            C7588b bVar = this.f1629i;
            if (bVar != null) {
                double[] dArr = this.f1634n;
                if (dArr.length > 0) {
                    bVar.mo19630a(d, dArr);
                }
            }
            int i5 = i3 * 2;
            this.f1624d.mo2368a(this.f1633m, this.f1634n, fArr2, i5);
            if (fVar2 != null) {
                fArr2[i5] = fArr2[i5] + fVar2.mo2313a(f3);
            } else if (sVar != null) {
                fArr2[i5] = fArr2[i5] + sVar.mo2406a(f3);
            }
            if (fVar != null) {
                int i6 = i5 + 1;
                fArr2[i6] = fArr2[i6] + fVar.mo2313a(f3);
            } else if (sVar2 != null) {
                int i7 = i5 + 1;
                fArr2[i7] = fArr2[i7] + sVar2.mo2406a(f3);
            }
            i3++;
            i2 = i;
            f = 1.0f;
        }
    }

    /* renamed from: b */
    public void mo2353b(View view) {
        this.f1621a = view;
        this.f1622b = view.getId();
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.LayoutParams) {
            ((ConstraintLayout.LayoutParams) layoutParams).mo2728a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2354b(C0444f fVar, C0473c cVar) {
        C0363p pVar = this.f1624d;
        pVar.f1650g = 0.0f;
        pVar.f1651h = 0.0f;
        m1636b(pVar);
        this.f1624d.mo2360a((float) fVar.mo2528D(), (float) fVar.mo2529E(), (float) fVar.mo2525A(), (float) fVar.mo2589k());
        C0474a b = cVar.mo2775b(this.f1622b);
        this.f1624d.mo2366a(b);
        this.f1630j = b.f2227c.f2300f;
        this.f1626f.mo2335a(fVar, cVar, this.f1622b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo2341a(float[] fArr, int[] iArr) {
        if (fArr == null) {
            return 0;
        }
        double[] a = this.f1628h[0].mo19632a();
        if (iArr != null) {
            Iterator it = this.f1640t.iterator();
            int i = 0;
            while (it.hasNext()) {
                int i2 = i + 1;
                iArr[i] = ((C0363p) it.next()).f1659p;
                i = i2;
            }
        }
        int i3 = 0;
        for (double a2 : a) {
            this.f1628h[0].mo19630a(a2, this.f1634n);
            this.f1624d.mo2368a(this.f1633m, this.f1634n, fArr, i3);
            i3 += 2;
        }
        return i3 / 2;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2344a(float f, float[] fArr, int i) {
        this.f1628h[0].mo19630a((double) m1634a(f, (float[]) null), this.f1634n);
        this.f1624d.mo2370b(this.f1633m, this.f1634n, fArr, i);
    }

    /* renamed from: a */
    private void m1635a(C0363p pVar) {
        int binarySearch = Collections.binarySearch(this.f1640t, pVar);
        if (binarySearch == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(" KeyPath positon \"");
            sb.append(pVar.f1651h);
            sb.append("\" outside of range");
            Log.e("MotionController", sb.toString());
        }
        this.f1640t.add((-binarySearch) - 1, pVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2349a(ArrayList<C0328c> arrayList) {
        this.f1642v.addAll(arrayList);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2347a(C0328c cVar) {
        this.f1642v.add(cVar);
    }

    /* renamed from: a */
    public void mo2345a(int i, int i2, float f) {
        ArrayList arrayList;
        C0384t tVar;
        C0400u uVar;
        C0369s sVar;
        Class<double> cls = double.class;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashMap hashMap = new HashMap();
        this.f1626f.mo2334a(this.f1627g, hashSet3);
        ArrayList<C0328c> arrayList2 = this.f1642v;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                C0328c cVar = (C0328c) it.next();
                if (cVar instanceof C0351h) {
                    C0351h hVar = (C0351h) cVar;
                    C0363p pVar = new C0363p(i, i2, hVar, this.f1624d, this.f1625e);
                    m1635a(pVar);
                    int i3 = hVar.f1545f;
                    if (i3 != C0328c.f1473e) {
                        this.f1623c = i3;
                    }
                } else if (cVar instanceof C0331e) {
                    cVar.mo2308a(hashSet4);
                } else if (cVar instanceof C0356k) {
                    cVar.mo2308a(hashSet2);
                } else if (cVar instanceof C0354j) {
                    cVar.mo2308a(hashSet);
                } else if (cVar instanceof C0358l) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((C0358l) cVar);
                } else {
                    cVar.mo2310b(hashMap);
                    cVar.mo2308a(hashSet3);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.f1620A = (C0358l[]) arrayList.toArray(new C0358l[0]);
        }
        String str = ",";
        String str2 = "CUSTOM,";
        char c = 1;
        if (!hashSet3.isEmpty()) {
            this.f1645y = new HashMap<>();
            Iterator it2 = hashSet3.iterator();
            while (it2.hasNext()) {
                String str3 = (String) it2.next();
                if (str3.startsWith(str2)) {
                    SparseArray sparseArray = new SparseArray();
                    String str4 = str3.split(str)[c];
                    Iterator it3 = this.f1642v.iterator();
                    while (it3.hasNext()) {
                        C0328c cVar2 = (C0328c) it3.next();
                        HashMap<String, C0467a> hashMap2 = cVar2.f1477d;
                        if (hashMap2 != null) {
                            C0467a aVar = (C0467a) hashMap2.get(str4);
                            if (aVar != null) {
                                sparseArray.append(cVar2.f1474a, aVar);
                            }
                        }
                    }
                    sVar = C0369s.m1730a(str3, sparseArray);
                } else {
                    sVar = C0369s.m1731b(str3);
                }
                if (sVar != null) {
                    sVar.mo2410a(str3);
                    this.f1645y.put(str3, sVar);
                }
                c = 1;
            }
            ArrayList<C0328c> arrayList3 = this.f1642v;
            if (arrayList3 != null) {
                Iterator it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    C0328c cVar3 = (C0328c) it4.next();
                    if (cVar3 instanceof C0329d) {
                        cVar3.mo2307a(this.f1645y);
                    }
                }
            }
            this.f1626f.mo2337a(this.f1645y, 0);
            this.f1627g.mo2337a(this.f1645y, 100);
            for (String str5 : this.f1645y.keySet()) {
                ((C0369s) this.f1645y.get(str5)).mo2407a(hashMap.containsKey(str5) ? ((Integer) hashMap.get(str5)).intValue() : 0);
            }
        }
        if (!hashSet2.isEmpty()) {
            this.f1643w = new HashMap<>();
            Iterator it5 = hashSet2.iterator();
            while (it5.hasNext()) {
                String str6 = (String) it5.next();
                if (str6.startsWith(str2)) {
                    SparseArray sparseArray2 = new SparseArray();
                    String str7 = str6.split(str)[1];
                    Iterator it6 = this.f1642v.iterator();
                    while (it6.hasNext()) {
                        C0328c cVar4 = (C0328c) it6.next();
                        HashMap<String, C0467a> hashMap3 = cVar4.f1477d;
                        if (hashMap3 != null) {
                            C0467a aVar2 = (C0467a) hashMap3.get(str7);
                            if (aVar2 != null) {
                                sparseArray2.append(cVar4.f1474a, aVar2);
                            }
                        }
                    }
                    uVar = C0400u.m1791a(str6, sparseArray2);
                } else {
                    uVar = C0400u.m1792b(str6);
                }
                if (uVar != null) {
                    uVar.mo2433a(str6);
                    this.f1643w.put(str6, uVar);
                }
            }
            ArrayList<C0328c> arrayList4 = this.f1642v;
            if (arrayList4 != null) {
                Iterator it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    C0328c cVar5 = (C0328c) it7.next();
                    if (cVar5 instanceof C0356k) {
                        ((C0356k) cVar5).mo2329c(this.f1643w);
                    }
                }
            }
            for (String str8 : this.f1643w.keySet()) {
                ((C0400u) this.f1643w.get(str8)).mo2431a(hashMap.containsKey(str8) ? ((Integer) hashMap.get(str8)).intValue() : 0);
            }
        }
        if (!hashSet.isEmpty()) {
            this.f1644x = new HashMap<>();
            Iterator it8 = hashSet.iterator();
            while (it8.hasNext()) {
                String str9 = (String) it8.next();
                if (str9.startsWith(str2)) {
                    SparseArray sparseArray3 = new SparseArray();
                    String str10 = str9.split(str)[1];
                    Iterator it9 = this.f1642v.iterator();
                    while (it9.hasNext()) {
                        C0328c cVar6 = (C0328c) it9.next();
                        HashMap<String, C0467a> hashMap4 = cVar6.f1477d;
                        if (hashMap4 != null) {
                            C0467a aVar3 = (C0467a) hashMap4.get(str10);
                            if (aVar3 != null) {
                                sparseArray3.append(cVar6.f1474a, aVar3);
                            }
                        }
                    }
                    tVar = C0384t.m1758a(str9, sparseArray3);
                } else {
                    tVar = C0384t.m1759b(str9);
                }
                if (tVar != null) {
                    tVar.mo2418a(str9);
                    this.f1644x.put(str9, tVar);
                }
            }
            ArrayList<C0328c> arrayList5 = this.f1642v;
            if (arrayList5 != null) {
                Iterator it10 = arrayList5.iterator();
                while (it10.hasNext()) {
                    C0328c cVar7 = (C0328c) it10.next();
                    if (cVar7 instanceof C0354j) {
                        ((C0354j) cVar7).mo2328c(this.f1644x);
                    }
                }
            }
            for (String str11 : this.f1644x.keySet()) {
                ((C0384t) this.f1644x.get(str11)).mo2415a(hashMap.containsKey(str11) ? ((Integer) hashMap.get(str11)).intValue() : 0);
            }
        }
        C0363p[] pVarArr = new C0363p[(this.f1640t.size() + 2)];
        pVarArr[0] = this.f1624d;
        pVarArr[pVarArr.length - 1] = this.f1625e;
        if (this.f1640t.size() > 0 && this.f1623c == -1) {
            this.f1623c = 0;
        }
        Iterator it11 = this.f1640t.iterator();
        int i4 = 1;
        while (it11.hasNext()) {
            int i5 = i4 + 1;
            pVarArr[i4] = (C0363p) it11.next();
            i4 = i5;
        }
        HashSet hashSet5 = new HashSet();
        for (String str12 : this.f1625e.f1658o.keySet()) {
            if (this.f1624d.f1658o.containsKey(str12)) {
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append(str12);
                if (!hashSet3.contains(sb.toString())) {
                    hashSet5.add(str12);
                }
            }
        }
        this.f1636p = (String[]) hashSet5.toArray(new String[0]);
        this.f1637q = new int[this.f1636p.length];
        int i6 = 0;
        while (true) {
            String[] strArr = this.f1636p;
            if (i6 >= strArr.length) {
                break;
            }
            String str13 = strArr[i6];
            this.f1637q[i6] = 1;
            int i7 = 0;
            while (true) {
                if (i7 >= pVarArr.length) {
                    break;
                } else if (pVarArr[i6].f1658o.containsKey(str13)) {
                    this.f1637q[i6] = ((C0467a) pVarArr[i6].f1658o.get(str13)).mo2756c();
                    break;
                } else {
                    i7++;
                }
            }
            i6++;
        }
        boolean z = pVarArr[0].f1657n != C0328c.f1473e;
        boolean[] zArr = new boolean[(18 + this.f1636p.length)];
        for (int i8 = 1; i8 < pVarArr.length; i8++) {
            pVarArr[i8].mo2365a(pVarArr[i8 - 1], zArr, this.f1636p, z);
        }
        int i9 = 0;
        for (int i10 = 1; i10 < zArr.length; i10++) {
            if (zArr[i10]) {
                i9++;
            }
        }
        this.f1633m = new int[i9];
        int[] iArr = this.f1633m;
        this.f1634n = new double[iArr.length];
        this.f1635o = new double[iArr.length];
        int i11 = 0;
        for (int i12 = 1; i12 < zArr.length; i12++) {
            if (zArr[i12]) {
                int i13 = i11 + 1;
                this.f1633m[i11] = i12;
                i11 = i13;
            }
        }
        double[][] dArr = (double[][]) Array.newInstance(cls, new int[]{pVarArr.length, this.f1633m.length});
        double[] dArr2 = new double[pVarArr.length];
        for (int i14 = 0; i14 < pVarArr.length; i14++) {
            pVarArr[i14].mo2367a(dArr[i14], this.f1633m);
            dArr2[i14] = (double) pVarArr[i14].f1650g;
        }
        int i15 = 0;
        while (true) {
            int[] iArr2 = this.f1633m;
            if (i15 >= iArr2.length) {
                break;
            }
            if (iArr2[i15] < C0363p.f1647s.length) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(C0363p.f1647s[this.f1633m[i15]]);
                sb2.append(" [");
                String sb3 = sb2.toString();
                for (int i16 = 0; i16 < pVarArr.length; i16++) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(sb3);
                    sb4.append(dArr[i16][i15]);
                    sb3 = sb4.toString();
                }
            }
            i15++;
        }
        this.f1628h = new C7588b[(this.f1636p.length + 1)];
        int i17 = 0;
        while (true) {
            String[] strArr2 = this.f1636p;
            if (i17 >= strArr2.length) {
                break;
            }
            String str14 = strArr2[i17];
            double[] dArr3 = null;
            int i18 = 0;
            double[][] dArr4 = null;
            for (int i19 = 0; i19 < pVarArr.length; i19++) {
                if (pVarArr[i19].mo2371b(str14)) {
                    if (dArr4 == null) {
                        dArr3 = new double[pVarArr.length];
                        dArr4 = (double[][]) Array.newInstance(cls, new int[]{pVarArr.length, pVarArr[i19].mo2358a(str14)});
                    }
                    dArr3[i18] = (double) pVarArr[i19].f1650g;
                    pVarArr[i19].mo2359a(str14, dArr4[i18], 0);
                    i18++;
                }
            }
            i17++;
            this.f1628h[i17] = C7588b.m18366a(this.f1623c, Arrays.copyOf(dArr3, i18), (double[][]) Arrays.copyOf(dArr4, i18));
        }
        this.f1628h[0] = C7588b.m18366a(this.f1623c, dArr2, dArr);
        if (pVarArr[0].f1657n != C0328c.f1473e) {
            int length = pVarArr.length;
            int[] iArr3 = new int[length];
            double[] dArr5 = new double[length];
            double[][] dArr6 = (double[][]) Array.newInstance(cls, new int[]{length, 2});
            for (int i20 = 0; i20 < length; i20++) {
                iArr3[i20] = pVarArr[i20].f1657n;
                dArr5[i20] = (double) pVarArr[i20].f1650g;
                dArr6[i20][0] = (double) pVarArr[i20].f1652i;
                dArr6[i20][1] = (double) pVarArr[i20].f1653j;
            }
            this.f1629i = C7588b.m18367a(iArr3, dArr5, dArr6);
        }
        float f2 = Float.NaN;
        this.f1646z = new HashMap<>();
        if (this.f1642v != null) {
            Iterator it12 = hashSet4.iterator();
            while (it12.hasNext()) {
                String str15 = (String) it12.next();
                C0333f b = C0333f.m1491b(str15);
                if (b != null) {
                    if (b.mo2318a() && Float.isNaN(f2)) {
                        f2 = m1637d();
                    }
                    b.mo2317a(str15);
                    this.f1646z.put(str15, b);
                }
            }
            Iterator it13 = this.f1642v.iterator();
            while (it13.hasNext()) {
                C0328c cVar8 = (C0328c) it13.next();
                if (cVar8 instanceof C0331e) {
                    ((C0331e) cVar8).mo2312c(this.f1646z);
                }
            }
            for (C0333f b2 : this.f1646z.values()) {
                b2.mo2319b(f2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2346a(View view) {
        C0363p pVar = this.f1624d;
        pVar.f1650g = 0.0f;
        pVar.f1651h = 0.0f;
        pVar.mo2360a(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        this.f1626f.mo2338b(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2348a(C0444f fVar, C0473c cVar) {
        C0363p pVar = this.f1625e;
        pVar.f1650g = 1.0f;
        pVar.f1651h = 1.0f;
        m1636b(pVar);
        this.f1625e.mo2360a((float) fVar.mo2528D(), (float) fVar.mo2529E(), (float) fVar.mo2525A(), (float) fVar.mo2589k());
        this.f1625e.mo2366a(cVar.mo2775b(this.f1622b));
        this.f1627g.mo2335a(fVar, cVar, this.f1622b);
    }

    /* renamed from: a */
    private float m1634a(float f, float[] fArr) {
        float f2 = 0.0f;
        float f3 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else if (((double) this.f1632l) != 1.0d) {
            if (f < this.f1631k) {
                f = 0.0f;
            }
            float f4 = this.f1631k;
            if (f > f4 && ((double) f) < 1.0d) {
                f = (f - f4) * this.f1632l;
            }
        }
        C7590c cVar = this.f1624d.f1648e;
        float f5 = Float.NaN;
        Iterator it = this.f1640t.iterator();
        while (it.hasNext()) {
            C0363p pVar = (C0363p) it.next();
            C7590c cVar2 = pVar.f1648e;
            if (cVar2 != null) {
                float f6 = pVar.f1650g;
                if (f6 < f) {
                    cVar = cVar2;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = pVar.f1650g;
                }
            }
        }
        if (cVar != null) {
            if (!Float.isNaN(f5)) {
                f3 = f5;
            }
            float f7 = f3 - f2;
            double d = (double) ((f - f2) / f7);
            f = (((float) cVar.mo19644a(d)) * f7) + f2;
            if (fArr != null) {
                fArr[0] = (float) cVar.mo19645b(d);
            }
        }
        return f;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0118 A[LOOP:4: B:47:0x0113->B:49:0x0118, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0139 A[EDGE_INSN: B:96:0x0139->B:50:0x0139 ?: BREAK  
    EDGE_INSN: B:96:0x0139->B:50:0x0139 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo2351a(android.view.View r23, float r24, long r25) {
        /*
            r22 = this;
            r0 = r22
            r10 = r23
            r8 = r25
            r1 = 0
            r2 = r24
            float r11 = r0.m1634a(r2, r1)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.s> r2 = r0.f1645y
            if (r2 == 0) goto L_0x0029
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0019:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0029
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.motion.widget.s r3 = (androidx.constraintlayout.motion.widget.C0369s) r3
            r3.mo2409a(r10, r11)
            goto L_0x0019
        L_0x0029:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.u> r2 = r0.f1643w
            r12 = 0
            if (r2 == 0) goto L_0x0054
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
            r4 = r1
            r3 = 0
        L_0x0038:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0052
            java.lang.Object r5 = r2.next()
            androidx.constraintlayout.motion.widget.u r5 = (androidx.constraintlayout.motion.widget.C0400u) r5
            boolean r6 = r5 instanceof androidx.constraintlayout.motion.widget.C0400u.C0404d
            if (r6 == 0) goto L_0x004c
            r4 = r5
            androidx.constraintlayout.motion.widget.u$d r4 = (androidx.constraintlayout.motion.widget.C0400u.C0404d) r4
            goto L_0x0038
        L_0x004c:
            boolean r5 = r5.mo2434a(r10, r11, r8)
            r3 = r3 | r5
            goto L_0x0038
        L_0x0052:
            r13 = r4
            goto L_0x0056
        L_0x0054:
            r13 = r1
            r3 = 0
        L_0x0056:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.t> r2 = r0.f1644x
            if (r2 == 0) goto L_0x007c
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0062:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x007c
            java.lang.Object r4 = r2.next()
            androidx.constraintlayout.motion.widget.t r4 = (androidx.constraintlayout.motion.widget.C0384t) r4
            boolean r5 = r4 instanceof androidx.constraintlayout.motion.widget.C0384t.C0388d
            if (r5 == 0) goto L_0x0076
            r1 = r4
            androidx.constraintlayout.motion.widget.t$d r1 = (androidx.constraintlayout.motion.widget.C0384t.C0388d) r1
            goto L_0x0062
        L_0x0076:
            boolean r4 = r4.mo2419a(r10, r11, r8)
            r3 = r3 | r4
            goto L_0x0062
        L_0x007c:
            r14 = r1
            r15 = r3
            e.f.a.a.b[] r1 = r0.f1628h
            r16 = 1
            if (r1 == 0) goto L_0x0175
            r1 = r1[r12]
            double r6 = (double) r11
            double[] r2 = r0.f1634n
            r1.mo19630a(r6, r2)
            e.f.a.a.b[] r1 = r0.f1628h
            r1 = r1[r12]
            double[] r2 = r0.f1635o
            r1.mo19633b(r6, r2)
            e.f.a.a.b r1 = r0.f1629i
            if (r1 == 0) goto L_0x00a8
            double[] r2 = r0.f1634n
            int r3 = r2.length
            if (r3 <= 0) goto L_0x00a8
            r1.mo19630a(r6, r2)
            e.f.a.a.b r1 = r0.f1629i
            double[] r2 = r0.f1635o
            r1.mo19633b(r6, r2)
        L_0x00a8:
            androidx.constraintlayout.motion.widget.p r1 = r0.f1624d
            int[] r3 = r0.f1633m
            double[] r4 = r0.f1634n
            double[] r5 = r0.f1635o
            r17 = 0
            r2 = r23
            r18 = r6
            r6 = r17
            r1.mo2363a(r2, r3, r4, r5, r6)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.s> r1 = r0.f1645y
            if (r1 == 0) goto L_0x00e6
            java.util.Collection r1 = r1.values()
            java.util.Iterator r17 = r1.iterator()
        L_0x00c7:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x00e6
            java.lang.Object r1 = r17.next()
            androidx.constraintlayout.motion.widget.s r1 = (androidx.constraintlayout.motion.widget.C0369s) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.motion.widget.C0369s.C0373d
            if (r2 == 0) goto L_0x00c7
            androidx.constraintlayout.motion.widget.s$d r1 = (androidx.constraintlayout.motion.widget.C0369s.C0373d) r1
            double[] r2 = r0.f1635o
            r4 = r2[r12]
            r6 = r2[r16]
            r2 = r23
            r3 = r11
            r1.mo2413a(r2, r3, r4, r6)
            goto L_0x00c7
        L_0x00e6:
            if (r13 == 0) goto L_0x00fd
            double[] r1 = r0.f1635o
            r6 = r1[r12]
            r20 = r1[r16]
            r1 = r13
            r2 = r23
            r3 = r11
            r4 = r25
            r8 = r20
            boolean r1 = r1.mo2437a(r2, r3, r4, r6, r8)
        L_0x00fa:
            r1 = r1 | r15
            r15 = r1
            goto L_0x0112
        L_0x00fd:
            if (r14 == 0) goto L_0x0112
            double[] r1 = r0.f1635o
            r6 = r1[r12]
            r20 = r1[r16]
            r1 = r14
            r2 = r23
            r3 = r11
            r4 = r25
            r8 = r20
            boolean r1 = r1.mo2422a(r2, r3, r4, r6, r8)
            goto L_0x00fa
        L_0x0112:
            r1 = 1
        L_0x0113:
            e.f.a.a.b[] r2 = r0.f1628h
            int r3 = r2.length
            if (r1 >= r3) goto L_0x0139
            r2 = r2[r1]
            float[] r3 = r0.f1639s
            r4 = r18
            r2.mo19631a(r4, r3)
            androidx.constraintlayout.motion.widget.p r2 = r0.f1624d
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.a> r2 = r2.f1658o
            java.lang.String[] r3 = r0.f1636p
            int r6 = r1 + -1
            r3 = r3[r6]
            java.lang.Object r2 = r2.get(r3)
            androidx.constraintlayout.widget.a r2 = (androidx.constraintlayout.widget.C0467a) r2
            float[] r3 = r0.f1639s
            r2.mo2752a(r10, r3)
            int r1 = r1 + 1
            goto L_0x0113
        L_0x0139:
            androidx.constraintlayout.motion.widget.m r1 = r0.f1626f
            int r2 = r1.f1605f
            if (r2 != 0) goto L_0x0163
            r2 = 0
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x014a
            int r1 = r1.f1606g
            r10.setVisibility(r1)
            goto L_0x0163
        L_0x014a:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0158
            androidx.constraintlayout.motion.widget.m r1 = r0.f1627g
            int r1 = r1.f1606g
            r10.setVisibility(r1)
            goto L_0x0163
        L_0x0158:
            androidx.constraintlayout.motion.widget.m r2 = r0.f1627g
            int r2 = r2.f1606g
            int r1 = r1.f1606g
            if (r2 == r1) goto L_0x0163
            r10.setVisibility(r12)
        L_0x0163:
            androidx.constraintlayout.motion.widget.l[] r1 = r0.f1620A
            if (r1 == 0) goto L_0x01c1
            r1 = 0
        L_0x0168:
            androidx.constraintlayout.motion.widget.l[] r2 = r0.f1620A
            int r3 = r2.length
            if (r1 >= r3) goto L_0x01c1
            r2 = r2[r1]
            r2.mo2330a(r11, r10)
            int r1 = r1 + 1
            goto L_0x0168
        L_0x0175:
            androidx.constraintlayout.motion.widget.p r1 = r0.f1624d
            float r2 = r1.f1652i
            androidx.constraintlayout.motion.widget.p r3 = r0.f1625e
            float r4 = r3.f1652i
            float r4 = r4 - r2
            float r4 = r4 * r11
            float r2 = r2 + r4
            float r4 = r1.f1653j
            float r5 = r3.f1653j
            float r5 = r5 - r4
            float r5 = r5 * r11
            float r4 = r4 + r5
            float r5 = r1.f1654k
            float r6 = r3.f1654k
            float r7 = r6 - r5
            float r7 = r7 * r11
            float r7 = r7 + r5
            float r1 = r1.f1655l
            float r3 = r3.f1655l
            float r8 = r3 - r1
            float r8 = r8 * r11
            float r8 = r8 + r1
            r9 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r9
            int r13 = (int) r2
            float r4 = r4 + r9
            int r9 = (int) r4
            float r2 = r2 + r7
            int r2 = (int) r2
            float r4 = r4 + r8
            int r4 = (int) r4
            int r7 = r2 - r13
            int r8 = r4 - r9
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x01b1
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x01be
        L_0x01b1:
            r1 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r1)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r1)
            r10.measure(r3, r1)
        L_0x01be:
            r10.layout(r13, r9, r2, r4)
        L_0x01c1:
            java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.f> r1 = r0.f1646z
            if (r1 == 0) goto L_0x01f0
            java.util.Collection r1 = r1.values()
            java.util.Iterator r8 = r1.iterator()
        L_0x01cd:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x01f0
            java.lang.Object r1 = r8.next()
            androidx.constraintlayout.motion.widget.f r1 = (androidx.constraintlayout.motion.widget.C0333f) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.motion.widget.C0333f.C0339f
            if (r2 == 0) goto L_0x01ec
            androidx.constraintlayout.motion.widget.f$f r1 = (androidx.constraintlayout.motion.widget.C0333f.C0339f) r1
            double[] r2 = r0.f1635o
            r4 = r2[r12]
            r6 = r2[r16]
            r2 = r23
            r3 = r11
            r1.mo2326a(r2, r3, r4, r6)
            goto L_0x01cd
        L_0x01ec:
            r1.mo2316a(r10, r11)
            goto L_0x01cd
        L_0x01f0:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0361n.mo2351a(android.view.View, float, long):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2343a(float f, float f2, float f3, float[] fArr) {
        int i = 0;
        if (this.f1628h != null) {
            double a = (double) m1634a(f, this.f1641u);
            this.f1628h[0].mo19633b(a, this.f1635o);
            this.f1628h[0].mo19630a(a, this.f1634n);
            float f4 = this.f1641u[0];
            while (true) {
                double[] dArr = this.f1635o;
                if (i < dArr.length) {
                    dArr[i] = dArr[i] * ((double) f4);
                    i++;
                } else {
                    this.f1624d.mo2361a(f2, f3, fArr, this.f1633m, dArr, this.f1634n);
                    return;
                }
            }
        } else {
            C0363p pVar = this.f1625e;
            float f5 = pVar.f1652i;
            C0363p pVar2 = this.f1624d;
            float f6 = f5 - pVar2.f1652i;
            float f7 = pVar.f1653j - pVar2.f1653j;
            float f8 = (pVar.f1655l - pVar2.f1655l) + f7;
            fArr[0] = (f6 * (1.0f - f2)) + (((pVar.f1654k - pVar2.f1654k) + f6) * f2);
            fArr[1] = (f7 * (1.0f - f3)) + (f8 * f3);
        }
    }

    /* renamed from: a */
    public int mo2340a() {
        int i = this.f1624d.f1649f;
        Iterator it = this.f1640t.iterator();
        while (it.hasNext()) {
            i = Math.max(i, ((C0363p) it.next()).f1649f);
        }
        return Math.max(i, this.f1625e.f1649f);
    }
}
