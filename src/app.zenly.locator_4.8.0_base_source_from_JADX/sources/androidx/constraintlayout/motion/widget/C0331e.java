package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.C0467a;
import androidx.constraintlayout.widget.C0467a.C0469b;
import androidx.constraintlayout.widget.C0481f;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.motion.widget.e */
public class C0331e extends C0328c {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f1494f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f1495g = 0;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f1496h = -1;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public float f1497i = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public float f1498j = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public float f1499k = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f1500l = -1;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public float f1501m = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public float f1502n = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public float f1503o = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public float f1504p = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public float f1505q = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public float f1506r = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public float f1507s = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public float f1508t = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public float f1509u = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public float f1510v = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public float f1511w = Float.NaN;

    /* renamed from: androidx.constraintlayout.motion.widget.e$a */
    private static class C0332a {

        /* renamed from: a */
        private static SparseIntArray f1512a = new SparseIntArray();

        static {
            f1512a.append(C0481f.KeyCycle_motionTarget, 1);
            f1512a.append(C0481f.KeyCycle_framePosition, 2);
            f1512a.append(C0481f.KeyCycle_transitionEasing, 3);
            f1512a.append(C0481f.KeyCycle_curveFit, 4);
            f1512a.append(C0481f.KeyCycle_waveShape, 5);
            f1512a.append(C0481f.KeyCycle_wavePeriod, 6);
            f1512a.append(C0481f.KeyCycle_waveOffset, 7);
            f1512a.append(C0481f.KeyCycle_waveVariesBy, 8);
            f1512a.append(C0481f.KeyCycle_android_alpha, 9);
            f1512a.append(C0481f.KeyCycle_android_elevation, 10);
            f1512a.append(C0481f.KeyCycle_android_rotation, 11);
            f1512a.append(C0481f.KeyCycle_android_rotationX, 12);
            f1512a.append(C0481f.KeyCycle_android_rotationY, 13);
            f1512a.append(C0481f.KeyCycle_transitionPathRotate, 14);
            f1512a.append(C0481f.KeyCycle_android_scaleX, 15);
            f1512a.append(C0481f.KeyCycle_android_scaleY, 16);
            f1512a.append(C0481f.KeyCycle_android_translationX, 17);
            f1512a.append(C0481f.KeyCycle_android_translationY, 18);
            f1512a.append(C0481f.KeyCycle_android_translationZ, 19);
            f1512a.append(C0481f.KeyCycle_motionProgress, 20);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m1490b(C0331e eVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f1512a.get(index)) {
                    case 1:
                        if (typedArray.peekValue(index).type != 3) {
                            eVar.f1475b = typedArray.getResourceId(index, eVar.f1475b);
                            break;
                        } else {
                            eVar.f1476c = typedArray.getString(index);
                            break;
                        }
                    case 2:
                        eVar.f1474a = typedArray.getInt(index, eVar.f1474a);
                        break;
                    case 3:
                        eVar.f1494f = typedArray.getString(index);
                        break;
                    case 4:
                        eVar.f1495g = typedArray.getInteger(index, eVar.f1495g);
                        break;
                    case 5:
                        eVar.f1496h = typedArray.getInt(index, eVar.f1496h);
                        break;
                    case 6:
                        eVar.f1497i = typedArray.getFloat(index, eVar.f1497i);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type != 5) {
                            eVar.f1498j = typedArray.getFloat(index, eVar.f1498j);
                            break;
                        } else {
                            eVar.f1498j = typedArray.getDimension(index, eVar.f1498j);
                            break;
                        }
                    case 8:
                        eVar.f1500l = typedArray.getInt(index, eVar.f1500l);
                        break;
                    case 9:
                        eVar.f1501m = typedArray.getFloat(index, eVar.f1501m);
                        break;
                    case 10:
                        eVar.f1502n = typedArray.getDimension(index, eVar.f1502n);
                        break;
                    case 11:
                        eVar.f1503o = typedArray.getFloat(index, eVar.f1503o);
                        break;
                    case 12:
                        eVar.f1505q = typedArray.getFloat(index, eVar.f1505q);
                        break;
                    case 13:
                        eVar.f1506r = typedArray.getFloat(index, eVar.f1506r);
                        break;
                    case 14:
                        eVar.f1504p = typedArray.getFloat(index, eVar.f1504p);
                        break;
                    case 15:
                        eVar.f1507s = typedArray.getFloat(index, eVar.f1507s);
                        break;
                    case 16:
                        eVar.f1508t = typedArray.getFloat(index, eVar.f1508t);
                        break;
                    case 17:
                        eVar.f1509u = typedArray.getDimension(index, eVar.f1509u);
                        break;
                    case 18:
                        eVar.f1510v = typedArray.getDimension(index, eVar.f1510v);
                        break;
                    case 19:
                        if (VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            eVar.f1511w = typedArray.getDimension(index, eVar.f1511w);
                            break;
                        }
                    case 20:
                        eVar.f1499k = typedArray.getFloat(index, eVar.f1499k);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f1512a.get(index));
                        Log.e("KeyCycle", sb.toString());
                        break;
                }
            }
        }
    }

    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public float mo2311b(java.lang.String r3) {
        /*
            r2 = this;
            int r0 = r3.hashCode()
            switch(r0) {
                case -1249320806: goto L_0x0089;
                case -1249320805: goto L_0x007f;
                case -1225497657: goto L_0x0074;
                case -1225497656: goto L_0x0069;
                case -1225497655: goto L_0x005e;
                case -1001078227: goto L_0x0053;
                case -908189618: goto L_0x0049;
                case -908189617: goto L_0x003f;
                case -40300674: goto L_0x0035;
                case -4379043: goto L_0x002b;
                case 37232917: goto L_0x0020;
                case 92909918: goto L_0x0015;
                case 156108012: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0093
        L_0x0009:
            java.lang.String r0 = "waveOffset"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 11
            goto L_0x0094
        L_0x0015:
            java.lang.String r0 = "alpha"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 0
            goto L_0x0094
        L_0x0020:
            java.lang.String r0 = "transitionPathRotate"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 5
            goto L_0x0094
        L_0x002b:
            java.lang.String r0 = "elevation"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 1
            goto L_0x0094
        L_0x0035:
            java.lang.String r0 = "rotation"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 2
            goto L_0x0094
        L_0x003f:
            java.lang.String r0 = "scaleY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 7
            goto L_0x0094
        L_0x0049:
            java.lang.String r0 = "scaleX"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 6
            goto L_0x0094
        L_0x0053:
            java.lang.String r0 = "progress"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 12
            goto L_0x0094
        L_0x005e:
            java.lang.String r0 = "translationZ"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 10
            goto L_0x0094
        L_0x0069:
            java.lang.String r0 = "translationY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 9
            goto L_0x0094
        L_0x0074:
            java.lang.String r0 = "translationX"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 8
            goto L_0x0094
        L_0x007f:
            java.lang.String r0 = "rotationY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 4
            goto L_0x0094
        L_0x0089:
            java.lang.String r0 = "rotationX"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0093
            r0 = 3
            goto L_0x0094
        L_0x0093:
            r0 = -1
        L_0x0094:
            switch(r0) {
                case 0: goto L_0x00d4;
                case 1: goto L_0x00d1;
                case 2: goto L_0x00ce;
                case 3: goto L_0x00cb;
                case 4: goto L_0x00c8;
                case 5: goto L_0x00c5;
                case 6: goto L_0x00c2;
                case 7: goto L_0x00bf;
                case 8: goto L_0x00bc;
                case 9: goto L_0x00b9;
                case 10: goto L_0x00b6;
                case 11: goto L_0x00b3;
                case 12: goto L_0x00b0;
                default: goto L_0x0097;
            }
        L_0x0097:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "  UNKNOWN  "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "WARNING! KeyCycle"
            android.util.Log.v(r0, r3)
            r3 = 2143289344(0x7fc00000, float:NaN)
            return r3
        L_0x00b0:
            float r3 = r2.f1499k
            return r3
        L_0x00b3:
            float r3 = r2.f1498j
            return r3
        L_0x00b6:
            float r3 = r2.f1511w
            return r3
        L_0x00b9:
            float r3 = r2.f1510v
            return r3
        L_0x00bc:
            float r3 = r2.f1509u
            return r3
        L_0x00bf:
            float r3 = r2.f1508t
            return r3
        L_0x00c2:
            float r3 = r2.f1507s
            return r3
        L_0x00c5:
            float r3 = r2.f1504p
            return r3
        L_0x00c8:
            float r3 = r2.f1506r
            return r3
        L_0x00cb:
            float r3 = r2.f1505q
            return r3
        L_0x00ce:
            float r3 = r2.f1503o
            return r3
        L_0x00d1:
            float r3 = r2.f1502n
            return r3
        L_0x00d4:
            float r3 = r2.f1501m
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0331e.mo2311b(java.lang.String):float");
    }

    /* renamed from: c */
    public void mo2312c(HashMap<String, C0333f> hashMap) {
        HashMap<String, C0333f> hashMap2 = hashMap;
        for (String str : hashMap.keySet()) {
            if (str.startsWith("CUSTOM")) {
                C0467a aVar = (C0467a) this.f1477d.get(str.substring(7));
                if (aVar != null && aVar.mo2751a() == C0469b.FLOAT_TYPE) {
                    ((C0333f) hashMap2.get(str)).mo2315a(this.f1474a, this.f1496h, this.f1500l, this.f1497i, this.f1498j, aVar.mo2755b(), aVar);
                }
            }
            float b = mo2311b(str);
            if (!Float.isNaN(b)) {
                ((C0333f) hashMap2.get(str)).mo2314a(this.f1474a, this.f1496h, this.f1500l, this.f1497i, this.f1498j, b);
            }
        }
    }

    /* renamed from: a */
    public void mo2306a(Context context, AttributeSet attributeSet) {
        C0332a.m1490b(this, context.obtainStyledAttributes(attributeSet, C0481f.KeyCycle));
    }

    /* renamed from: a */
    public void mo2308a(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f1501m)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f1502n)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f1503o)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f1505q)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f1506r)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f1507s)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f1508t)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f1504p)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f1509u)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f1510v)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f1511w)) {
            hashSet.add("translationZ");
        }
        if (this.f1477d.size() > 0) {
            for (String str : this.f1477d.keySet()) {
                StringBuilder sb = new StringBuilder();
                sb.append("CUSTOM,");
                sb.append(str);
                hashSet.add(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public void mo2307a(HashMap<String, C0369s> hashMap) {
        StringBuilder sb = new StringBuilder();
        sb.append("add ");
        sb.append(hashMap.size());
        sb.append(" values");
        C0326a.m1409a("KeyCycle", sb.toString(), 2);
        for (String str : hashMap.keySet()) {
            C0369s sVar = (C0369s) hashMap.get(str);
            char c = 65535;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c = 8;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c = 9;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c = 10;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c = 12;
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c = 7;
                        break;
                    }
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        c = 2;
                        break;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c = 1;
                        break;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        c = 5;
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c = 0;
                        break;
                    }
                    break;
                case 156108012:
                    if (str.equals("waveOffset")) {
                        c = 11;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    sVar.mo2408a(this.f1474a, this.f1501m);
                    break;
                case 1:
                    sVar.mo2408a(this.f1474a, this.f1502n);
                    break;
                case 2:
                    sVar.mo2408a(this.f1474a, this.f1503o);
                    break;
                case 3:
                    sVar.mo2408a(this.f1474a, this.f1505q);
                    break;
                case 4:
                    sVar.mo2408a(this.f1474a, this.f1506r);
                    break;
                case 5:
                    sVar.mo2408a(this.f1474a, this.f1504p);
                    break;
                case 6:
                    sVar.mo2408a(this.f1474a, this.f1507s);
                    break;
                case 7:
                    sVar.mo2408a(this.f1474a, this.f1508t);
                    break;
                case 8:
                    sVar.mo2408a(this.f1474a, this.f1509u);
                    break;
                case 9:
                    sVar.mo2408a(this.f1474a, this.f1510v);
                    break;
                case 10:
                    sVar.mo2408a(this.f1474a, this.f1511w);
                    break;
                case 11:
                    sVar.mo2408a(this.f1474a, this.f1498j);
                    break;
                case 12:
                    sVar.mo2408a(this.f1474a, this.f1499k);
                    break;
                default:
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("  UNKNOWN  ");
                    sb2.append(str);
                    Log.v("WARNING KeyCycle", sb2.toString());
                    break;
            }
        }
    }
}
