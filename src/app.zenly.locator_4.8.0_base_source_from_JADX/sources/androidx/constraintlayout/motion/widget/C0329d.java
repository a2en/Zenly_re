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

/* renamed from: androidx.constraintlayout.motion.widget.d */
public class C0329d extends C0328c {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f1478f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f1479g = -1;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public boolean f1480h = false;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public float f1481i = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public float f1482j = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public float f1483k = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public float f1484l = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public float f1485m = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public float f1486n = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public float f1487o = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public float f1488p = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public float f1489q = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public float f1490r = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public float f1491s = Float.NaN;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public float f1492t = Float.NaN;

    /* renamed from: androidx.constraintlayout.motion.widget.d$a */
    private static class C0330a {

        /* renamed from: a */
        private static SparseIntArray f1493a = new SparseIntArray();

        static {
            f1493a.append(C0481f.KeyAttribute_android_alpha, 1);
            f1493a.append(C0481f.KeyAttribute_android_elevation, 2);
            f1493a.append(C0481f.KeyAttribute_android_rotation, 4);
            f1493a.append(C0481f.KeyAttribute_android_rotationX, 5);
            f1493a.append(C0481f.KeyAttribute_android_rotationY, 6);
            f1493a.append(C0481f.KeyAttribute_android_scaleX, 7);
            f1493a.append(C0481f.KeyAttribute_transitionPathRotate, 8);
            f1493a.append(C0481f.KeyAttribute_transitionEasing, 9);
            f1493a.append(C0481f.KeyAttribute_motionTarget, 10);
            f1493a.append(C0481f.KeyAttribute_framePosition, 12);
            f1493a.append(C0481f.KeyAttribute_curveFit, 13);
            f1493a.append(C0481f.KeyAttribute_android_visibility, 14);
            f1493a.append(C0481f.KeyAttribute_android_scaleY, 15);
            f1493a.append(C0481f.KeyAttribute_android_translationX, 16);
            f1493a.append(C0481f.KeyAttribute_android_translationY, 17);
            f1493a.append(C0481f.KeyAttribute_android_translationZ, 18);
            f1493a.append(C0481f.KeyAttribute_motionProgress, 19);
        }

        /* renamed from: a */
        public static void m1448a(C0329d dVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f1493a.get(index)) {
                    case 1:
                        dVar.f1481i = typedArray.getFloat(index, dVar.f1481i);
                        break;
                    case 2:
                        dVar.f1482j = typedArray.getDimension(index, dVar.f1482j);
                        break;
                    case 4:
                        dVar.f1483k = typedArray.getFloat(index, dVar.f1483k);
                        break;
                    case 5:
                        dVar.f1484l = typedArray.getFloat(index, dVar.f1484l);
                        break;
                    case 6:
                        dVar.f1485m = typedArray.getFloat(index, dVar.f1485m);
                        break;
                    case 7:
                        dVar.f1487o = typedArray.getFloat(index, dVar.f1487o);
                        break;
                    case 8:
                        dVar.f1486n = typedArray.getFloat(index, dVar.f1486n);
                        break;
                    case 9:
                        dVar.f1478f = typedArray.getString(index);
                        break;
                    case 10:
                        if (typedArray.peekValue(index).type != 3) {
                            dVar.f1475b = typedArray.getResourceId(index, dVar.f1475b);
                            break;
                        } else {
                            dVar.f1476c = typedArray.getString(index);
                            break;
                        }
                    case 12:
                        dVar.f1474a = typedArray.getInt(index, dVar.f1474a);
                        break;
                    case 13:
                        dVar.f1479g = typedArray.getInteger(index, dVar.f1479g);
                        break;
                    case 14:
                        dVar.f1480h = typedArray.getBoolean(index, dVar.f1480h);
                        break;
                    case 15:
                        dVar.f1488p = typedArray.getFloat(index, dVar.f1488p);
                        break;
                    case 16:
                        dVar.f1489q = typedArray.getDimension(index, dVar.f1489q);
                        break;
                    case 17:
                        dVar.f1490r = typedArray.getDimension(index, dVar.f1490r);
                        break;
                    case 18:
                        if (VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            dVar.f1491s = typedArray.getDimension(index, dVar.f1491s);
                            break;
                        }
                    case 19:
                        dVar.f1492t = typedArray.getFloat(index, dVar.f1492t);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f1493a.get(index));
                        Log.e("KeyAttribute", sb.toString());
                        break;
                }
            }
        }
    }

    /* renamed from: b */
    public void mo2310b(HashMap<String, Integer> hashMap) {
        if (this.f1479g != -1) {
            if (!Float.isNaN(this.f1481i)) {
                hashMap.put("alpha", Integer.valueOf(this.f1479g));
            }
            if (!Float.isNaN(this.f1482j)) {
                hashMap.put("elevation", Integer.valueOf(this.f1479g));
            }
            if (!Float.isNaN(this.f1483k)) {
                hashMap.put("rotation", Integer.valueOf(this.f1479g));
            }
            if (!Float.isNaN(this.f1484l)) {
                hashMap.put("rotationX", Integer.valueOf(this.f1479g));
            }
            if (!Float.isNaN(this.f1485m)) {
                hashMap.put("rotationY", Integer.valueOf(this.f1479g));
            }
            if (!Float.isNaN(this.f1489q)) {
                hashMap.put("translationX", Integer.valueOf(this.f1479g));
            }
            if (!Float.isNaN(this.f1490r)) {
                hashMap.put("translationY", Integer.valueOf(this.f1479g));
            }
            if (!Float.isNaN(this.f1491s)) {
                hashMap.put("translationZ", Integer.valueOf(this.f1479g));
            }
            if (!Float.isNaN(this.f1486n)) {
                hashMap.put("transitionPathRotate", Integer.valueOf(this.f1479g));
            }
            if (!Float.isNaN(this.f1487o)) {
                hashMap.put("scaleX", Integer.valueOf(this.f1479g));
            }
            if (!Float.isNaN(this.f1488p)) {
                hashMap.put("scaleY", Integer.valueOf(this.f1479g));
            }
            if (!Float.isNaN(this.f1492t)) {
                hashMap.put("progress", Integer.valueOf(this.f1479g));
            }
            if (this.f1477d.size() > 0) {
                for (String str : this.f1477d.keySet()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("CUSTOM,");
                    sb.append(str);
                    hashMap.put(sb.toString(), Integer.valueOf(this.f1479g));
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2306a(Context context, AttributeSet attributeSet) {
        C0330a.m1448a(this, context.obtainStyledAttributes(attributeSet, C0481f.KeyAttribute));
    }

    /* renamed from: a */
    public void mo2308a(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f1481i)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.f1482j)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.f1483k)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f1484l)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.f1485m)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.f1489q)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.f1490r)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.f1491s)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.f1486n)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f1487o)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.f1487o)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.f1492t)) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
        if (r1.equals("scaleY") != false) goto L_0x00c1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2307a(java.util.HashMap<java.lang.String, androidx.constraintlayout.motion.widget.C0369s> r7) {
        /*
            r6 = this;
            java.util.Set r0 = r7.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0008:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01ad
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r7.get(r1)
            androidx.constraintlayout.motion.widget.s r2 = (androidx.constraintlayout.motion.widget.C0369s) r2
            java.lang.String r3 = "CUSTOM"
            boolean r3 = r1.startsWith(r3)
            r4 = 7
            if (r3 == 0) goto L_0x0039
            java.lang.String r1 = r1.substring(r4)
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r3 = r6.f1477d
            java.lang.Object r1 = r3.get(r1)
            androidx.constraintlayout.widget.a r1 = (androidx.constraintlayout.widget.C0467a) r1
            if (r1 == 0) goto L_0x0008
            androidx.constraintlayout.motion.widget.s$b r2 = (androidx.constraintlayout.motion.widget.C0369s.C0371b) r2
            int r3 = r6.f1474a
            r2.mo2412a(r3, r1)
            goto L_0x0008
        L_0x0039:
            r3 = -1
            int r5 = r1.hashCode()
            switch(r5) {
                case -1249320806: goto L_0x00b6;
                case -1249320805: goto L_0x00ac;
                case -1225497657: goto L_0x00a1;
                case -1225497656: goto L_0x0096;
                case -1225497655: goto L_0x008b;
                case -1001078227: goto L_0x0080;
                case -908189618: goto L_0x0076;
                case -908189617: goto L_0x006d;
                case -40300674: goto L_0x0063;
                case -4379043: goto L_0x0059;
                case 37232917: goto L_0x004e;
                case 92909918: goto L_0x0043;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x00c0
        L_0x0043:
            java.lang.String r4 = "alpha"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 0
            goto L_0x00c1
        L_0x004e:
            java.lang.String r4 = "transitionPathRotate"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 5
            goto L_0x00c1
        L_0x0059:
            java.lang.String r4 = "elevation"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 1
            goto L_0x00c1
        L_0x0063:
            java.lang.String r4 = "rotation"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 2
            goto L_0x00c1
        L_0x006d:
            java.lang.String r5 = "scaleY"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x00c0
            goto L_0x00c1
        L_0x0076:
            java.lang.String r4 = "scaleX"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 6
            goto L_0x00c1
        L_0x0080:
            java.lang.String r4 = "progress"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 11
            goto L_0x00c1
        L_0x008b:
            java.lang.String r4 = "translationZ"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 10
            goto L_0x00c1
        L_0x0096:
            java.lang.String r4 = "translationY"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 9
            goto L_0x00c1
        L_0x00a1:
            java.lang.String r4 = "translationX"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 8
            goto L_0x00c1
        L_0x00ac:
            java.lang.String r4 = "rotationY"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 4
            goto L_0x00c1
        L_0x00b6:
            java.lang.String r4 = "rotationX"
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L_0x00c0
            r4 = 3
            goto L_0x00c1
        L_0x00c0:
            r4 = -1
        L_0x00c1:
            switch(r4) {
                case 0: goto L_0x019c;
                case 1: goto L_0x018b;
                case 2: goto L_0x017a;
                case 3: goto L_0x0169;
                case 4: goto L_0x0158;
                case 5: goto L_0x0147;
                case 6: goto L_0x0136;
                case 7: goto L_0x0125;
                case 8: goto L_0x0114;
                case 9: goto L_0x0103;
                case 10: goto L_0x00f2;
                case 11: goto L_0x00e1;
                default: goto L_0x00c4;
            }
        L_0x00c4:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "UNKNOWN addValues \""
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "\""
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "KeyAttributes"
            android.util.Log.v(r2, r1)
            goto L_0x0008
        L_0x00e1:
            float r1 = r6.f1492t
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1474a
            float r3 = r6.f1492t
            r2.mo2408a(r1, r3)
            goto L_0x0008
        L_0x00f2:
            float r1 = r6.f1491s
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1474a
            float r3 = r6.f1491s
            r2.mo2408a(r1, r3)
            goto L_0x0008
        L_0x0103:
            float r1 = r6.f1490r
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1474a
            float r3 = r6.f1490r
            r2.mo2408a(r1, r3)
            goto L_0x0008
        L_0x0114:
            float r1 = r6.f1489q
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1474a
            float r3 = r6.f1489q
            r2.mo2408a(r1, r3)
            goto L_0x0008
        L_0x0125:
            float r1 = r6.f1488p
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1474a
            float r3 = r6.f1488p
            r2.mo2408a(r1, r3)
            goto L_0x0008
        L_0x0136:
            float r1 = r6.f1487o
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1474a
            float r3 = r6.f1487o
            r2.mo2408a(r1, r3)
            goto L_0x0008
        L_0x0147:
            float r1 = r6.f1486n
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1474a
            float r3 = r6.f1486n
            r2.mo2408a(r1, r3)
            goto L_0x0008
        L_0x0158:
            float r1 = r6.f1485m
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1474a
            float r3 = r6.f1485m
            r2.mo2408a(r1, r3)
            goto L_0x0008
        L_0x0169:
            float r1 = r6.f1484l
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1474a
            float r3 = r6.f1484l
            r2.mo2408a(r1, r3)
            goto L_0x0008
        L_0x017a:
            float r1 = r6.f1483k
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1474a
            float r3 = r6.f1483k
            r2.mo2408a(r1, r3)
            goto L_0x0008
        L_0x018b:
            float r1 = r6.f1482j
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1474a
            float r3 = r6.f1482j
            r2.mo2408a(r1, r3)
            goto L_0x0008
        L_0x019c:
            float r1 = r6.f1481i
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L_0x0008
            int r1 = r6.f1474a
            float r3 = r6.f1481i
            r2.mo2408a(r1, r3)
            goto L_0x0008
        L_0x01ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0329d.mo2307a(java.util.HashMap):void");
    }
}
