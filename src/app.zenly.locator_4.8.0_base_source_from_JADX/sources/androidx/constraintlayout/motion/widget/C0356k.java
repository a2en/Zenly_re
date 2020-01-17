package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.C0481f;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.motion.widget.k */
public class C0356k extends C0328c {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f1567f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f1568g = -1;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public float f1569h = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public float f1570i = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public float f1571j = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public float f1572k = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public float f1573l = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public float f1574m = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public float f1575n = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public float f1576o = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public float f1577p = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public float f1578q = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public float f1579r = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public float f1580s = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public int f1581t = 0;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public float f1582u = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public float f1583v = 0.0f;

    /* renamed from: androidx.constraintlayout.motion.widget.k$a */
    private static class C0357a {

        /* renamed from: a */
        private static SparseIntArray f1584a = new SparseIntArray();

        static {
            f1584a.append(C0481f.KeyTimeCycle_android_alpha, 1);
            f1584a.append(C0481f.KeyTimeCycle_android_elevation, 2);
            f1584a.append(C0481f.KeyTimeCycle_android_rotation, 4);
            f1584a.append(C0481f.KeyTimeCycle_android_rotationX, 5);
            f1584a.append(C0481f.KeyTimeCycle_android_rotationY, 6);
            f1584a.append(C0481f.KeyTimeCycle_android_scaleX, 7);
            f1584a.append(C0481f.KeyTimeCycle_transitionPathRotate, 8);
            f1584a.append(C0481f.KeyTimeCycle_transitionEasing, 9);
            f1584a.append(C0481f.KeyTimeCycle_motionTarget, 10);
            f1584a.append(C0481f.KeyTimeCycle_framePosition, 12);
            f1584a.append(C0481f.KeyTimeCycle_curveFit, 13);
            f1584a.append(C0481f.KeyTimeCycle_android_scaleY, 14);
            f1584a.append(C0481f.KeyTimeCycle_android_translationX, 15);
            f1584a.append(C0481f.KeyTimeCycle_android_translationY, 16);
            f1584a.append(C0481f.KeyTimeCycle_android_translationZ, 17);
            f1584a.append(C0481f.KeyTimeCycle_motionProgress, 18);
            f1584a.append(C0481f.KeyTimeCycle_wavePeriod, 20);
            f1584a.append(C0481f.KeyTimeCycle_waveOffset, 21);
            f1584a.append(C0481f.KeyTimeCycle_waveShape, 19);
        }

        /* renamed from: a */
        public static void m1608a(C0356k kVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f1584a.get(index)) {
                    case 1:
                        kVar.f1569h = typedArray.getFloat(index, kVar.f1569h);
                        break;
                    case 2:
                        kVar.f1570i = typedArray.getDimension(index, kVar.f1570i);
                        break;
                    case 4:
                        kVar.f1571j = typedArray.getFloat(index, kVar.f1571j);
                        break;
                    case 5:
                        kVar.f1572k = typedArray.getFloat(index, kVar.f1572k);
                        break;
                    case 6:
                        kVar.f1573l = typedArray.getFloat(index, kVar.f1573l);
                        break;
                    case 7:
                        kVar.f1575n = typedArray.getFloat(index, kVar.f1575n);
                        break;
                    case 8:
                        kVar.f1574m = typedArray.getFloat(index, kVar.f1574m);
                        break;
                    case 9:
                        kVar.f1567f = typedArray.getString(index);
                        break;
                    case 10:
                        if (typedArray.peekValue(index).type != 3) {
                            kVar.f1475b = typedArray.getResourceId(index, kVar.f1475b);
                            break;
                        } else {
                            kVar.f1476c = typedArray.getString(index);
                            break;
                        }
                    case 12:
                        kVar.f1474a = typedArray.getInt(index, kVar.f1474a);
                        break;
                    case 13:
                        kVar.f1568g = typedArray.getInteger(index, kVar.f1568g);
                        break;
                    case 14:
                        kVar.f1576o = typedArray.getFloat(index, kVar.f1576o);
                        break;
                    case 15:
                        kVar.f1577p = typedArray.getDimension(index, kVar.f1577p);
                        break;
                    case 16:
                        kVar.f1578q = typedArray.getDimension(index, kVar.f1578q);
                        break;
                    case 17:
                        if (VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            kVar.f1579r = typedArray.getDimension(index, kVar.f1579r);
                            break;
                        }
                    case 18:
                        kVar.f1580s = typedArray.getFloat(index, kVar.f1580s);
                        break;
                    case 19:
                        kVar.f1581t = typedArray.getInt(index, kVar.f1581t);
                        break;
                    case 20:
                        kVar.f1582u = typedArray.getFloat(index, kVar.f1582u);
                        break;
                    case 21:
                        if (typedArray.peekValue(index).type != 5) {
                            kVar.f1583v = typedArray.getFloat(index, kVar.f1583v);
                            break;
                        } else {
                            kVar.f1583v = typedArray.getDimension(index, kVar.f1583v);
                            break;
                        }
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f1584a.get(index));
                        Log.e("KeyTimeCycle", sb.toString());
                        break;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        if (r1.equals("scaleY") != false) goto L_0x00ca;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2329c(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.C0400u> r11) {
        /*
            r10 = this;
            java.util.Set r0 = r11.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01fe
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r11.get(r1)
            r3 = r2
            androidx.constraintlayout.motion.widget.u r3 = (androidx.constraintlayout.motion.widget.C0400u) r3
            java.lang.String r2 = "CUSTOM"
            boolean r2 = r1.startsWith(r2)
            r4 = 7
            if (r2 == 0) goto L_0x0042
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r2 = r10.f1477d
            java.lang.Object r1 = r2.get(r1)
            r6 = r1
            androidx.constraintlayout.widget.a r6 = (androidx.constraintlayout.widget.C0467a) r6
            if (r6 == 0) goto L_0x0008
            r4 = r3
            androidx.constraintlayout.motion.widget.u$b r4 = (androidx.constraintlayout.motion.widget.C0400u.C0402b) r4
            int r5 = r10.f1474a
            float r7 = r10.f1582u
            int r8 = r10.f1581t
            float r9 = r10.f1583v
            r4.mo2436a(r5, r6, r7, r8, r9)
            goto L_0x0008
        L_0x0042:
            r2 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x00bf;
                case -1249320805: goto L_0x00b5;
                case -1225497657: goto L_0x00aa;
                case -1225497656: goto L_0x009f;
                case -1225497655: goto L_0x0094;
                case -1001078227: goto L_0x0089;
                case -908189618: goto L_0x007f;
                case -908189617: goto L_0x0076;
                case -40300674: goto L_0x006c;
                case -4379043: goto L_0x0062;
                case 37232917: goto L_0x0057;
                case 92909918: goto L_0x004c;
                default: goto L_0x004a;
            }
        L_0x004a:
            goto L_0x00c9
        L_0x004c:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 0
            goto L_0x00ca
        L_0x0057:
            java.lang.String r4 = "transitionPathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 5
            goto L_0x00ca
        L_0x0062:
            java.lang.String r4 = "elevation"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 1
            goto L_0x00ca
        L_0x006c:
            java.lang.String r4 = "rotation"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 2
            goto L_0x00ca
        L_0x0076:
            java.lang.String r5 = "scaleY"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x00c9
            goto L_0x00ca
        L_0x007f:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 6
            goto L_0x00ca
        L_0x0089:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 11
            goto L_0x00ca
        L_0x0094:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 10
            goto L_0x00ca
        L_0x009f:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 9
            goto L_0x00ca
        L_0x00aa:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 8
            goto L_0x00ca
        L_0x00b5:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 4
            goto L_0x00ca
        L_0x00bf:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c9
            r4 = 3
            goto L_0x00ca
        L_0x00c9:
            r4 = -1
        L_0x00ca:
            switch(r4) {
                case 0: goto L_0x01e7;
                case 1: goto L_0x01d0;
                case 2: goto L_0x01b9;
                case 3: goto L_0x01a2;
                case 4: goto L_0x018b;
                case 5: goto L_0x0174;
                case 6: goto L_0x015d;
                case 7: goto L_0x0146;
                case 8: goto L_0x012f;
                case 9: goto L_0x0118;
                case 10: goto L_0x0101;
                case 11: goto L_0x00ea;
                default: goto L_0x00cd;
            }
        L_0x00cd:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UNKNOWN addValues \""
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "\""
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "KeyTimeCycles"
            android.util.Log.e(r2, r1)
            goto L_0x0008
        L_0x00ea:
            float r1 = r10.f1580s
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1474a
            float r5 = r10.f1580s
            float r6 = r10.f1582u
            int r7 = r10.f1581t
            float r8 = r10.f1583v
            r3.mo2432a(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0101:
            float r1 = r10.f1579r
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1474a
            float r5 = r10.f1579r
            float r6 = r10.f1582u
            int r7 = r10.f1581t
            float r8 = r10.f1583v
            r3.mo2432a(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0118:
            float r1 = r10.f1578q
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1474a
            float r5 = r10.f1578q
            float r6 = r10.f1582u
            int r7 = r10.f1581t
            float r8 = r10.f1583v
            r3.mo2432a(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x012f:
            float r1 = r10.f1577p
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1474a
            float r5 = r10.f1577p
            float r6 = r10.f1582u
            int r7 = r10.f1581t
            float r8 = r10.f1583v
            r3.mo2432a(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0146:
            float r1 = r10.f1576o
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1474a
            float r5 = r10.f1576o
            float r6 = r10.f1582u
            int r7 = r10.f1581t
            float r8 = r10.f1583v
            r3.mo2432a(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x015d:
            float r1 = r10.f1575n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1474a
            float r5 = r10.f1575n
            float r6 = r10.f1582u
            int r7 = r10.f1581t
            float r8 = r10.f1583v
            r3.mo2432a(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x0174:
            float r1 = r10.f1574m
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1474a
            float r5 = r10.f1574m
            float r6 = r10.f1582u
            int r7 = r10.f1581t
            float r8 = r10.f1583v
            r3.mo2432a(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x018b:
            float r1 = r10.f1573l
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1474a
            float r5 = r10.f1573l
            float r6 = r10.f1582u
            int r7 = r10.f1581t
            float r8 = r10.f1583v
            r3.mo2432a(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01a2:
            float r1 = r10.f1572k
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1474a
            float r5 = r10.f1572k
            float r6 = r10.f1582u
            int r7 = r10.f1581t
            float r8 = r10.f1583v
            r3.mo2432a(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01b9:
            float r1 = r10.f1571j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1474a
            float r5 = r10.f1571j
            float r6 = r10.f1582u
            int r7 = r10.f1581t
            float r8 = r10.f1583v
            r3.mo2432a(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01d0:
            float r1 = r10.f1570i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1474a
            float r5 = r10.f1570i
            float r6 = r10.f1582u
            int r7 = r10.f1581t
            float r8 = r10.f1583v
            r3.mo2432a(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01e7:
            float r1 = r10.f1569h
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r10.f1474a
            float r5 = r10.f1569h
            float r6 = r10.f1582u
            int r7 = r10.f1581t
            float r8 = r10.f1583v
            r3.mo2432a(r4, r5, r6, r7, r8)
            goto L_0x0008
        L_0x01fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0356k.mo2329c(java.util.HashMap):void");
    }

    /* renamed from: b */
    public void mo2310b(HashMap<String, Integer> hashMap) {
        if (this.f1568g != -1) {
            if (!Float.isNaN(this.f1569h)) {
                hashMap.put("alpha", Integer.valueOf(this.f1568g));
            }
            if (!Float.isNaN(this.f1570i)) {
                hashMap.put("elevation", Integer.valueOf(this.f1568g));
            }
            if (!Float.isNaN(this.f1571j)) {
                hashMap.put("rotation", Integer.valueOf(this.f1568g));
            }
            if (!Float.isNaN(this.f1572k)) {
                hashMap.put("rotationX", Integer.valueOf(this.f1568g));
            }
            if (!Float.isNaN(this.f1573l)) {
                hashMap.put("rotationY", Integer.valueOf(this.f1568g));
            }
            if (!Float.isNaN(this.f1577p)) {
                hashMap.put("translationX", Integer.valueOf(this.f1568g));
            }
            if (!Float.isNaN(this.f1578q)) {
                hashMap.put("translationY", Integer.valueOf(this.f1568g));
            }
            if (!Float.isNaN(this.f1579r)) {
                hashMap.put("translationZ", Integer.valueOf(this.f1568g));
            }
            if (!Float.isNaN(this.f1574m)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f1568g));
            }
            if (!Float.isNaN(this.f1575n)) {
                hashMap.put("scaleX", Integer.valueOf(this.f1568g));
            }
            if (!Float.isNaN(this.f1575n)) {
                hashMap.put("scaleY", Integer.valueOf(this.f1568g));
            }
            if (!Float.isNaN(this.f1580s)) {
                hashMap.put("progress", Integer.valueOf(this.f1568g));
            }
            if (this.f1477d.size() > 0) {
                for (String str : this.f1477d.keySet()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("CUSTOM,");
                    sb.append(str);
                    hashMap.put(sb.toString(), Integer.valueOf(this.f1568g));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2306a(Context context, AttributeSet attributeSet) {
        C0357a.m1608a(this, context.obtainStyledAttributes(attributeSet, C0481f.KeyTimeCycle));
    }

    /* renamed from: a */
    public void mo2308a(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f1569h)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f1570i)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f1571j)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f1572k)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f1573l)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f1577p)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f1578q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f1579r)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f1574m)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f1575n)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f1576o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f1580s)) {
            hashSet.add("progress");
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
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }
}
