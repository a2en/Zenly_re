package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.C0481f;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: androidx.constraintlayout.motion.widget.l */
public class C0358l extends C0328c {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f1585f = null;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f1586g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f1587h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f1588i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f1589j;

    /* renamed from: k */
    private View f1590k;

    /* renamed from: l */
    float f1591l;

    /* renamed from: m */
    private boolean f1592m;

    /* renamed from: n */
    private boolean f1593n;

    /* renamed from: o */
    private boolean f1594o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public float f1595p;

    /* renamed from: q */
    private Method f1596q;

    /* renamed from: r */
    private Method f1597r;

    /* renamed from: s */
    private Method f1598s;

    /* renamed from: t */
    private float f1599t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f1600u;

    /* renamed from: v */
    RectF f1601v;

    /* renamed from: w */
    RectF f1602w;

    /* renamed from: androidx.constraintlayout.motion.widget.l$a */
    private static class C0359a {

        /* renamed from: a */
        private static SparseIntArray f1603a = new SparseIntArray();

        static {
            f1603a.append(C0481f.KeyTrigger_framePosition, 8);
            f1603a.append(C0481f.KeyTrigger_onCross, 4);
            f1603a.append(C0481f.KeyTrigger_onNegativeCross, 1);
            f1603a.append(C0481f.KeyTrigger_onPositiveCross, 2);
            f1603a.append(C0481f.KeyTrigger_motionTarget, 7);
            f1603a.append(C0481f.KeyTrigger_triggerId, 6);
            f1603a.append(C0481f.KeyTrigger_triggerSlack, 5);
            f1603a.append(C0481f.KeyTrigger_motion_triggerOnCollision, 9);
            f1603a.append(C0481f.KeyTrigger_motion_postLayoutCollision, 10);
        }

        /* renamed from: a */
        public static void m1624a(C0358l lVar, TypedArray typedArray, Context context) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (f1603a.get(index)) {
                    case 1:
                        lVar.f1586g = typedArray.getString(index);
                        break;
                    case 2:
                        lVar.f1587h = typedArray.getString(index);
                        break;
                    case 4:
                        lVar.f1585f = typedArray.getString(index);
                        break;
                    case 5:
                        lVar.f1591l = typedArray.getFloat(index, lVar.f1591l);
                        break;
                    case 6:
                        lVar.f1588i = typedArray.getResourceId(index, lVar.f1588i);
                        break;
                    case 7:
                        if (typedArray.peekValue(index).type != 3) {
                            lVar.f1475b = typedArray.getResourceId(index, lVar.f1475b);
                            break;
                        } else {
                            lVar.f1476c = typedArray.getString(index);
                            break;
                        }
                    case 8:
                        lVar.f1474a = typedArray.getInteger(index, lVar.f1474a);
                        lVar.f1595p = (((float) lVar.f1474a) + 0.5f) / 100.0f;
                        break;
                    case 9:
                        lVar.f1589j = typedArray.getResourceId(index, lVar.f1589j);
                        break;
                    case 10:
                        lVar.f1600u = typedArray.getBoolean(index, lVar.f1600u);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(f1603a.get(index));
                        Log.e("KeyTrigger", sb.toString());
                        break;
                }
            }
        }
    }

    public C0358l() {
        int i = C0328c.f1473e;
        this.f1588i = i;
        this.f1589j = i;
        this.f1590k = null;
        this.f1591l = 0.1f;
        this.f1592m = true;
        this.f1593n = true;
        this.f1594o = true;
        this.f1595p = Float.NaN;
        this.f1600u = false;
        this.f1601v = new RectF();
        this.f1602w = new RectF();
        this.f1477d = new HashMap<>();
    }

    /* renamed from: a */
    public void mo2307a(HashMap<String, C0369s> hashMap) {
    }

    /* renamed from: a */
    public void mo2308a(HashSet<String> hashSet) {
    }

    /* renamed from: a */
    public void mo2306a(Context context, AttributeSet attributeSet) {
        C0359a.m1624a(this, context.obtainStyledAttributes(attributeSet, C0481f.KeyTrigger), context);
    }

    /* renamed from: a */
    private void m1613a(RectF rectF, View view, boolean z) {
        rectF.top = (float) view.getTop();
        rectF.bottom = (float) view.getBottom();
        rectF.left = (float) view.getLeft();
        rectF.right = (float) view.getRight();
        if (z) {
            view.getMatrix().mapRect(rectF);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00cc  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2330a(float r11, android.view.View r12) {
        /*
            r10 = this;
            int r0 = r10.f1589j
            int r1 = androidx.constraintlayout.motion.widget.C0328c.f1473e
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x0063
            android.view.View r0 = r10.f1590k
            if (r0 != 0) goto L_0x001a
            android.view.ViewParent r0 = r12.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = r10.f1589j
            android.view.View r0 = r0.findViewById(r1)
            r10.f1590k = r0
        L_0x001a:
            android.graphics.RectF r0 = r10.f1601v
            android.view.View r1 = r10.f1590k
            boolean r4 = r10.f1600u
            r10.m1613a(r0, r1, r4)
            android.graphics.RectF r0 = r10.f1602w
            boolean r1 = r10.f1600u
            r10.m1613a(r0, r12, r1)
            android.graphics.RectF r0 = r10.f1601v
            android.graphics.RectF r1 = r10.f1602w
            boolean r0 = r0.intersect(r1)
            if (r0 == 0) goto L_0x004b
            boolean r0 = r10.f1592m
            if (r0 == 0) goto L_0x003c
            r10.f1592m = r3
            r0 = 1
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            boolean r1 = r10.f1594o
            if (r1 == 0) goto L_0x0045
            r10.f1594o = r3
            r1 = 1
            goto L_0x0046
        L_0x0045:
            r1 = 0
        L_0x0046:
            r10.f1593n = r2
            r2 = r1
            r1 = 0
            goto L_0x0060
        L_0x004b:
            boolean r0 = r10.f1592m
            if (r0 != 0) goto L_0x0053
            r10.f1592m = r2
            r0 = 1
            goto L_0x0054
        L_0x0053:
            r0 = 0
        L_0x0054:
            boolean r1 = r10.f1593n
            if (r1 == 0) goto L_0x005c
            r10.f1593n = r3
            r1 = 1
            goto L_0x005d
        L_0x005c:
            r1 = 0
        L_0x005d:
            r10.f1594o = r2
            r2 = 0
        L_0x0060:
            r4 = r1
            goto L_0x00dd
        L_0x0063:
            boolean r0 = r10.f1592m
            r1 = 0
            if (r0 == 0) goto L_0x0079
            float r0 = r10.f1595p
            float r4 = r11 - r0
            float r5 = r10.f1599t
            float r5 = r5 - r0
            float r4 = r4 * r5
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0089
            r10.f1592m = r3
            r0 = 1
            goto L_0x008a
        L_0x0079:
            float r0 = r10.f1595p
            float r0 = r11 - r0
            float r0 = java.lang.Math.abs(r0)
            float r4 = r10.f1591l
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0089
            r10.f1592m = r2
        L_0x0089:
            r0 = 0
        L_0x008a:
            boolean r4 = r10.f1593n
            if (r4 == 0) goto L_0x00a3
            float r4 = r10.f1595p
            float r5 = r11 - r4
            float r6 = r10.f1599t
            float r6 = r6 - r4
            float r6 = r6 * r5
            int r4 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b3
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 >= 0) goto L_0x00b3
            r10.f1593n = r3
            r4 = 1
            goto L_0x00b4
        L_0x00a3:
            float r4 = r10.f1595p
            float r4 = r11 - r4
            float r4 = java.lang.Math.abs(r4)
            float r5 = r10.f1591l
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b3
            r10.f1593n = r2
        L_0x00b3:
            r4 = 0
        L_0x00b4:
            boolean r5 = r10.f1594o
            if (r5 == 0) goto L_0x00cc
            float r5 = r10.f1595p
            float r6 = r11 - r5
            float r7 = r10.f1599t
            float r7 = r7 - r5
            float r7 = r7 * r6
            int r5 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x00dc
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00dc
            r10.f1594o = r3
            goto L_0x00dd
        L_0x00cc:
            float r1 = r10.f1595p
            float r1 = r11 - r1
            float r1 = java.lang.Math.abs(r1)
            float r5 = r10.f1591l
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x00dc
            r10.f1594o = r2
        L_0x00dc:
            r2 = 0
        L_0x00dd:
            r10.f1599t = r11
            if (r4 != 0) goto L_0x00e5
            if (r0 != 0) goto L_0x00e5
            if (r2 == 0) goto L_0x00f0
        L_0x00e5:
            android.view.ViewParent r1 = r12.getParent()
            androidx.constraintlayout.motion.widget.MotionLayout r1 = (androidx.constraintlayout.motion.widget.MotionLayout) r1
            int r5 = r10.f1588i
            r1.mo2253a(r5, r2, r11)
        L_0x00f0:
            java.lang.String r11 = "Could not find method \""
            java.lang.String r1 = "Exception in call \""
            java.lang.String r5 = " "
            java.lang.String r6 = "\"on class "
            java.lang.String r7 = "KeyTrigger"
            if (r4 == 0) goto L_0x0173
            java.lang.String r4 = r10.f1586g
            if (r4 == 0) goto L_0x0173
            java.lang.reflect.Method r4 = r10.f1597r
            if (r4 != 0) goto L_0x013f
            java.lang.Class r4 = r12.getClass()     // Catch:{ NoSuchMethodException -> 0x0113 }
            java.lang.String r8 = r10.f1586g     // Catch:{ NoSuchMethodException -> 0x0113 }
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0113 }
            java.lang.reflect.Method r4 = r4.getMethod(r8, r9)     // Catch:{ NoSuchMethodException -> 0x0113 }
            r10.f1597r = r4     // Catch:{ NoSuchMethodException -> 0x0113 }
            goto L_0x013f
        L_0x0113:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r11)
            java.lang.String r8 = r10.f1586g
            r4.append(r8)
            r4.append(r6)
            java.lang.Class r8 = r12.getClass()
            java.lang.String r8 = r8.getSimpleName()
            r4.append(r8)
            r4.append(r5)
            java.lang.String r8 = androidx.constraintlayout.motion.widget.C0326a.m1407a(r12)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r7, r4)
        L_0x013f:
            java.lang.reflect.Method r4 = r10.f1597r     // Catch:{ Exception -> 0x0147 }
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0147 }
            r4.invoke(r12, r8)     // Catch:{ Exception -> 0x0147 }
            goto L_0x0173
        L_0x0147:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r8 = r10.f1586g
            r4.append(r8)
            r4.append(r6)
            java.lang.Class r8 = r12.getClass()
            java.lang.String r8 = r8.getSimpleName()
            r4.append(r8)
            r4.append(r5)
            java.lang.String r8 = androidx.constraintlayout.motion.widget.C0326a.m1407a(r12)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r7, r4)
        L_0x0173:
            if (r2 == 0) goto L_0x01ec
            java.lang.String r2 = r10.f1587h
            if (r2 == 0) goto L_0x01ec
            java.lang.reflect.Method r2 = r10.f1598s
            if (r2 != 0) goto L_0x01b8
            java.lang.Class r2 = r12.getClass()     // Catch:{ NoSuchMethodException -> 0x018c }
            java.lang.String r4 = r10.f1587h     // Catch:{ NoSuchMethodException -> 0x018c }
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x018c }
            java.lang.reflect.Method r2 = r2.getMethod(r4, r8)     // Catch:{ NoSuchMethodException -> 0x018c }
            r10.f1598s = r2     // Catch:{ NoSuchMethodException -> 0x018c }
            goto L_0x01b8
        L_0x018c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            java.lang.String r4 = r10.f1587h
            r2.append(r4)
            r2.append(r6)
            java.lang.Class r4 = r12.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r2.append(r4)
            r2.append(r5)
            java.lang.String r4 = androidx.constraintlayout.motion.widget.C0326a.m1407a(r12)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r7, r2)
        L_0x01b8:
            java.lang.reflect.Method r2 = r10.f1598s     // Catch:{ Exception -> 0x01c0 }
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01c0 }
            r2.invoke(r12, r4)     // Catch:{ Exception -> 0x01c0 }
            goto L_0x01ec
        L_0x01c0:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r4 = r10.f1587h
            r2.append(r4)
            r2.append(r6)
            java.lang.Class r4 = r12.getClass()
            java.lang.String r4 = r4.getSimpleName()
            r2.append(r4)
            r2.append(r5)
            java.lang.String r4 = androidx.constraintlayout.motion.widget.C0326a.m1407a(r12)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r7, r2)
        L_0x01ec:
            if (r0 == 0) goto L_0x0265
            java.lang.String r0 = r10.f1585f
            if (r0 == 0) goto L_0x0265
            java.lang.reflect.Method r0 = r10.f1596q
            if (r0 != 0) goto L_0x0231
            java.lang.Class r0 = r12.getClass()     // Catch:{ NoSuchMethodException -> 0x0205 }
            java.lang.String r2 = r10.f1585f     // Catch:{ NoSuchMethodException -> 0x0205 }
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0205 }
            java.lang.reflect.Method r0 = r0.getMethod(r2, r4)     // Catch:{ NoSuchMethodException -> 0x0205 }
            r10.f1596q = r0     // Catch:{ NoSuchMethodException -> 0x0205 }
            goto L_0x0231
        L_0x0205:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            java.lang.String r11 = r10.f1585f
            r0.append(r11)
            r0.append(r6)
            java.lang.Class r11 = r12.getClass()
            java.lang.String r11 = r11.getSimpleName()
            r0.append(r11)
            r0.append(r5)
            java.lang.String r11 = androidx.constraintlayout.motion.widget.C0326a.m1407a(r12)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            android.util.Log.e(r7, r11)
        L_0x0231:
            java.lang.reflect.Method r11 = r10.f1596q     // Catch:{ Exception -> 0x0239 }
            java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0239 }
            r11.invoke(r12, r0)     // Catch:{ Exception -> 0x0239 }
            goto L_0x0265
        L_0x0239:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r1)
            java.lang.String r0 = r10.f1585f
            r11.append(r0)
            r11.append(r6)
            java.lang.Class r0 = r12.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r11.append(r0)
            r11.append(r5)
            java.lang.String r12 = androidx.constraintlayout.motion.widget.C0326a.m1407a(r12)
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            android.util.Log.e(r7, r11)
        L_0x0265:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0358l.mo2330a(float, android.view.View):void");
    }
}
