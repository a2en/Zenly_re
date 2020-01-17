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

/* renamed from: androidx.constraintlayout.motion.widget.j */
public class C0354j extends C0328c {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public float f1546f = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public float f1547g = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public float f1548h = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public float f1549i = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public float f1550j = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public float f1551k = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public float f1552l = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public float f1553m = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public float f1554n = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public float f1555o = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public float f1556p = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public float f1557q = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public float f1558r = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public float f1559s = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public float f1560t = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public int f1561u = 0;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f1562v = false;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public int f1563w = -1;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public int f1564x = C0328c.f1473e;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public float f1565y = Float.NaN;

    /* renamed from: androidx.constraintlayout.motion.widget.j$a */
    private static class C0355a {

        /* renamed from: a */
        private static SparseIntArray f1566a = new SparseIntArray();

        static {
            f1566a.append(C0481f.KeySpring_android_alpha, 4);
            f1566a.append(C0481f.KeySpring_android_elevation, 5);
            f1566a.append(C0481f.KeySpring_android_rotation, 6);
            f1566a.append(C0481f.KeySpring_android_rotationX, 7);
            f1566a.append(C0481f.KeySpring_android_rotationY, 8);
            f1566a.append(C0481f.KeySpring_android_scaleX, 10);
            f1566a.append(C0481f.KeySpring_transitionPathRotate, 9);
            f1566a.append(C0481f.KeySpring_motionTarget, 1);
            f1566a.append(C0481f.KeySpring_curveFit, 3);
            f1566a.append(C0481f.KeySpring_motionTriggerId, 22);
            f1566a.append(C0481f.KeySpring_framePosition, 2);
            f1566a.append(C0481f.KeySpring_android_scaleY, 11);
            f1566a.append(C0481f.KeySpring_android_translationX, 12);
            f1566a.append(C0481f.KeySpring_android_translationY, 13);
            f1566a.append(C0481f.KeySpring_android_translationZ, 14);
            f1566a.append(C0481f.KeySpring_motionProgress, 15);
            f1566a.append(C0481f.KeySpring_springPeriod, 16);
            f1566a.append(C0481f.KeySpring_springImpulse, 17);
            f1566a.append(C0481f.KeySpring_springFactor, 18);
            f1566a.append(C0481f.KeySpring_springTracks, 19);
            f1566a.append(C0481f.KeySpring_springDecay, 20);
            f1566a.append(C0481f.KeySpring_springReverseTrack, 21);
        }

        /* renamed from: a */
        public static void m1569a(C0354j jVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f1566a.get(index)) {
                    case 1:
                        if (typedArray.peekValue(index).type == 3) {
                            jVar.f1476c = typedArray.getString(index);
                            break;
                        } else {
                            jVar.f1475b = typedArray.getResourceId(index, jVar.f1475b);
                            continue;
                        }
                    case 2:
                        jVar.f1474a = typedArray.getInt(index, jVar.f1474a);
                        continue;
                    case 3:
                        jVar.f1563w = typedArray.getInteger(index, jVar.f1563w);
                        break;
                    case 4:
                        break;
                    case 5:
                        jVar.f1547g = typedArray.getDimension(index, jVar.f1547g);
                        continue;
                    case 6:
                        jVar.f1548h = typedArray.getFloat(index, jVar.f1548h);
                        continue;
                    case 7:
                        jVar.f1549i = typedArray.getFloat(index, jVar.f1549i);
                        continue;
                    case 8:
                        jVar.f1550j = typedArray.getFloat(index, jVar.f1550j);
                        continue;
                    case 9:
                        jVar.f1551k = typedArray.getFloat(index, jVar.f1551k);
                        continue;
                    case 10:
                        jVar.f1552l = typedArray.getFloat(index, jVar.f1552l);
                        continue;
                    case 11:
                        jVar.f1553m = typedArray.getFloat(index, jVar.f1553m);
                        continue;
                    case 12:
                        jVar.f1554n = typedArray.getDimension(index, jVar.f1554n);
                        continue;
                    case 13:
                        jVar.f1555o = typedArray.getDimension(index, jVar.f1555o);
                        continue;
                    case 14:
                        if (VERSION.SDK_INT >= 21) {
                            jVar.f1556p = typedArray.getDimension(index, jVar.f1556p);
                            break;
                        } else {
                            continue;
                        }
                    case 15:
                        jVar.f1557q = typedArray.getFloat(index, jVar.f1557q);
                        continue;
                    case 16:
                        jVar.f1559s = typedArray.getFloat(index, jVar.f1559s);
                        continue;
                    case 17:
                        if (typedArray.peekValue(index).type != 5) {
                            jVar.f1560t = typedArray.getFloat(index, jVar.f1560t);
                            break;
                        } else {
                            jVar.f1560t = typedArray.getDimension(index, jVar.f1560t);
                            continue;
                        }
                    case 18:
                        jVar.f1565y = typedArray.getFloat(index, jVar.f1565y);
                        continue;
                    case 19:
                        jVar.f1561u = typedArray.getInt(index, jVar.f1561u);
                        continue;
                    case 20:
                        jVar.f1558r = typedArray.getFloat(index, jVar.f1558r);
                        continue;
                    case 21:
                        jVar.f1562v = typedArray.getBoolean(index, jVar.f1562v);
                        continue;
                    case 22:
                        jVar.f1564x = typedArray.getResourceId(index, jVar.f1564x);
                        continue;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f1566a.get(index));
                        Log.e("KeySpring", sb.toString());
                        continue;
                }
                jVar.f1546f = typedArray.getFloat(index, jVar.f1546f);
            }
        }
    }

    /* renamed from: b */
    public void mo2310b(HashMap<String, Integer> hashMap) {
        if (this.f1563w != -1) {
            if (!Float.isNaN(this.f1546f)) {
                hashMap.put("alpha", Integer.valueOf(this.f1563w));
            }
            if (!Float.isNaN(this.f1547g)) {
                hashMap.put("elevation", Integer.valueOf(this.f1563w));
            }
            if (!Float.isNaN(this.f1548h)) {
                hashMap.put("rotation", Integer.valueOf(this.f1563w));
            }
            if (!Float.isNaN(this.f1549i)) {
                hashMap.put("rotationX", Integer.valueOf(this.f1563w));
            }
            if (!Float.isNaN(this.f1550j)) {
                hashMap.put("rotationY", Integer.valueOf(this.f1563w));
            }
            if (!Float.isNaN(this.f1554n)) {
                hashMap.put("translationX", Integer.valueOf(this.f1563w));
            }
            if (!Float.isNaN(this.f1555o)) {
                hashMap.put("translationY", Integer.valueOf(this.f1563w));
            }
            if (!Float.isNaN(this.f1556p)) {
                hashMap.put("translationZ", Integer.valueOf(this.f1563w));
            }
            if (!Float.isNaN(this.f1551k)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f1563w));
            }
            if (!Float.isNaN(this.f1552l)) {
                hashMap.put("scaleX", Integer.valueOf(this.f1563w));
            }
            if (!Float.isNaN(this.f1552l)) {
                hashMap.put("scaleY", Integer.valueOf(this.f1563w));
            }
            if (!Float.isNaN(this.f1557q)) {
                hashMap.put("progress", Integer.valueOf(this.f1563w));
            }
            if (this.f1477d.size() > 0) {
                for (String str : this.f1477d.keySet()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("CUSTOM,");
                    sb.append(str);
                    hashMap.put(sb.toString(), Integer.valueOf(this.f1563w));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0082, code lost:
        if (r1.equals("scaleY") != false) goto L_0x00d0;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2328c(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.C0384t> r14) {
        /*
            r13 = this;
            java.util.Set r0 = r14.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x024c
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r14.get(r1)
            r3 = r2
            androidx.constraintlayout.motion.widget.t r3 = (androidx.constraintlayout.motion.widget.C0384t) r3
            java.lang.String r2 = "CUSTOM"
            boolean r2 = r1.startsWith(r2)
            r4 = 7
            if (r2 == 0) goto L_0x0048
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r2 = r13.f1477d
            java.lang.Object r1 = r2.get(r1)
            r6 = r1
            androidx.constraintlayout.widget.a r6 = (androidx.constraintlayout.widget.C0467a) r6
            if (r6 == 0) goto L_0x0008
            r4 = r3
            androidx.constraintlayout.motion.widget.t$b r4 = (androidx.constraintlayout.motion.widget.C0384t.C0386b) r4
            int r5 = r13.f1474a
            float r7 = r13.f1559s
            float r8 = r13.f1558r
            float r9 = r13.f1565y
            int r10 = r13.f1561u
            boolean r11 = r13.f1562v
            float r12 = r13.f1560t
            r4.mo2421a(r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0008
        L_0x0048:
            r2 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x00c5;
                case -1249320805: goto L_0x00bb;
                case -1225497657: goto L_0x00b0;
                case -1225497656: goto L_0x00a5;
                case -1225497655: goto L_0x009a;
                case -1001078227: goto L_0x008f;
                case -908189618: goto L_0x0085;
                case -908189617: goto L_0x007c;
                case -40300674: goto L_0x0072;
                case -4379043: goto L_0x0068;
                case 37232917: goto L_0x005d;
                case 92909918: goto L_0x0052;
                default: goto L_0x0050;
            }
        L_0x0050:
            goto L_0x00cf
        L_0x0052:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00cf
            r4 = 0
            goto L_0x00d0
        L_0x005d:
            java.lang.String r4 = "transitionPathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00cf
            r4 = 5
            goto L_0x00d0
        L_0x0068:
            java.lang.String r4 = "elevation"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00cf
            r4 = 1
            goto L_0x00d0
        L_0x0072:
            java.lang.String r4 = "rotation"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00cf
            r4 = 2
            goto L_0x00d0
        L_0x007c:
            java.lang.String r5 = "scaleY"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x00cf
            goto L_0x00d0
        L_0x0085:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00cf
            r4 = 6
            goto L_0x00d0
        L_0x008f:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00cf
            r4 = 11
            goto L_0x00d0
        L_0x009a:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00cf
            r4 = 10
            goto L_0x00d0
        L_0x00a5:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00cf
            r4 = 9
            goto L_0x00d0
        L_0x00b0:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00cf
            r4 = 8
            goto L_0x00d0
        L_0x00bb:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00cf
            r4 = 4
            goto L_0x00d0
        L_0x00c5:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00cf
            r4 = 3
            goto L_0x00d0
        L_0x00cf:
            r4 = -1
        L_0x00d0:
            switch(r4) {
                case 0: goto L_0x022f;
                case 1: goto L_0x0212;
                case 2: goto L_0x01f5;
                case 3: goto L_0x01d8;
                case 4: goto L_0x01bb;
                case 5: goto L_0x019e;
                case 6: goto L_0x0181;
                case 7: goto L_0x0164;
                case 8: goto L_0x0147;
                case 9: goto L_0x012a;
                case 10: goto L_0x010d;
                case 11: goto L_0x00f0;
                default: goto L_0x00d3;
            }
        L_0x00d3:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UNKNOWN addValues \""
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "\""
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "KeySprings"
            android.util.Log.e(r2, r1)
            goto L_0x0008
        L_0x00f0:
            float r1 = r13.f1557q
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r13.f1474a
            float r5 = r13.f1557q
            float r6 = r13.f1559s
            float r7 = r13.f1558r
            float r8 = r13.f1565y
            int r9 = r13.f1561u
            boolean r10 = r13.f1562v
            float r11 = r13.f1560t
            r3.mo2416a(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0008
        L_0x010d:
            float r1 = r13.f1556p
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r13.f1474a
            float r5 = r13.f1556p
            float r6 = r13.f1559s
            float r7 = r13.f1558r
            float r8 = r13.f1565y
            int r9 = r13.f1561u
            boolean r10 = r13.f1562v
            float r11 = r13.f1560t
            r3.mo2416a(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0008
        L_0x012a:
            float r1 = r13.f1555o
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r13.f1474a
            float r5 = r13.f1555o
            float r6 = r13.f1559s
            float r7 = r13.f1558r
            float r8 = r13.f1565y
            int r9 = r13.f1561u
            boolean r10 = r13.f1562v
            float r11 = r13.f1560t
            r3.mo2416a(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0008
        L_0x0147:
            float r1 = r13.f1554n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r13.f1474a
            float r5 = r13.f1554n
            float r6 = r13.f1559s
            float r7 = r13.f1558r
            float r8 = r13.f1565y
            int r9 = r13.f1561u
            boolean r10 = r13.f1562v
            float r11 = r13.f1560t
            r3.mo2416a(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0008
        L_0x0164:
            float r1 = r13.f1553m
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r13.f1474a
            float r5 = r13.f1553m
            float r6 = r13.f1559s
            float r7 = r13.f1558r
            float r8 = r13.f1565y
            int r9 = r13.f1561u
            boolean r10 = r13.f1562v
            float r11 = r13.f1560t
            r3.mo2416a(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0008
        L_0x0181:
            float r1 = r13.f1552l
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r13.f1474a
            float r5 = r13.f1552l
            float r6 = r13.f1559s
            float r7 = r13.f1558r
            float r8 = r13.f1565y
            int r9 = r13.f1561u
            boolean r10 = r13.f1562v
            float r11 = r13.f1560t
            r3.mo2416a(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0008
        L_0x019e:
            float r1 = r13.f1551k
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r13.f1474a
            float r5 = r13.f1551k
            float r6 = r13.f1559s
            float r7 = r13.f1558r
            float r8 = r13.f1565y
            int r9 = r13.f1561u
            boolean r10 = r13.f1562v
            float r11 = r13.f1560t
            r3.mo2416a(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0008
        L_0x01bb:
            float r1 = r13.f1550j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r13.f1474a
            float r5 = r13.f1550j
            float r6 = r13.f1559s
            float r7 = r13.f1558r
            float r8 = r13.f1565y
            int r9 = r13.f1561u
            boolean r10 = r13.f1562v
            float r11 = r13.f1560t
            r3.mo2416a(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0008
        L_0x01d8:
            float r1 = r13.f1549i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r13.f1474a
            float r5 = r13.f1549i
            float r6 = r13.f1559s
            float r7 = r13.f1558r
            float r8 = r13.f1565y
            int r9 = r13.f1561u
            boolean r10 = r13.f1562v
            float r11 = r13.f1560t
            r3.mo2416a(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0008
        L_0x01f5:
            float r1 = r13.f1548h
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r13.f1474a
            float r5 = r13.f1548h
            float r6 = r13.f1559s
            float r7 = r13.f1558r
            float r8 = r13.f1565y
            int r9 = r13.f1561u
            boolean r10 = r13.f1562v
            float r11 = r13.f1560t
            r3.mo2416a(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0008
        L_0x0212:
            float r1 = r13.f1547g
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r13.f1474a
            float r5 = r13.f1547g
            float r6 = r13.f1559s
            float r7 = r13.f1558r
            float r8 = r13.f1565y
            int r9 = r13.f1561u
            boolean r10 = r13.f1562v
            float r11 = r13.f1560t
            r3.mo2416a(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0008
        L_0x022f:
            float r1 = r13.f1546f
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r4 = r13.f1474a
            float r5 = r13.f1546f
            float r6 = r13.f1559s
            float r7 = r13.f1558r
            float r8 = r13.f1565y
            int r9 = r13.f1561u
            boolean r10 = r13.f1562v
            float r11 = r13.f1560t
            r3.mo2416a(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0008
        L_0x024c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0354j.mo2328c(java.util.HashMap):void");
    }

    /* renamed from: a */
    public void mo2306a(Context context, AttributeSet attributeSet) {
        C0355a.m1569a(this, context.obtainStyledAttributes(attributeSet, C0481f.KeySpring));
    }

    /* renamed from: a */
    public void mo2308a(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f1546f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f1547g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f1548h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f1549i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f1550j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f1554n)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f1555o)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f1556p)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f1551k)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f1552l)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f1553m)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f1557q)) {
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
        throw new IllegalArgumentException(" KeySprings do not support SplineSet");
    }
}
