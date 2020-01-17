package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* renamed from: androidx.transition.i */
public class C1234i extends C1226d0 {

    /* renamed from: b */
    private float f4633b = 3.0f;

    /* renamed from: c */
    private int f4634c = 80;

    /* renamed from: a */
    public void mo6093a(int i) {
        this.f4634c = i;
    }

    /* renamed from: a */
    public void mo6092a(float f) {
        if (f != 0.0f) {
            this.f4633b = f;
            return;
        }
        throw new IllegalArgumentException("propagationSpeed may not be 0");
    }

    /* renamed from: a */
    public long mo6091a(ViewGroup viewGroup, Transition transition, C1241n nVar, C1241n nVar2) {
        int i;
        int i2;
        int i3;
        C1241n nVar3 = nVar;
        if (nVar3 == null && nVar2 == null) {
            return 0;
        }
        Rect c = transition.mo6029c();
        if (nVar2 == null || mo6078b(nVar3) == 0) {
            i = -1;
        } else {
            nVar3 = nVar2;
            i = 1;
        }
        int c2 = mo6079c(nVar3);
        int d = mo6080d(nVar3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(viewGroup.getTranslationX());
        int round2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = round + viewGroup.getWidth();
        int height = round2 + viewGroup.getHeight();
        if (c != null) {
            i3 = c.centerX();
            i2 = c.centerY();
        } else {
            i3 = (round + width) / 2;
            i2 = (round2 + height) / 2;
        }
        float a = ((float) m5961a(viewGroup, c2, d, i3, i2, round, round2, width, height)) / ((float) m5962a(viewGroup));
        long b = transition.mo6021b();
        if (b < 0) {
            b = 300;
        }
        return (long) Math.round((((float) (b * ((long) i))) / this.f4633b) * a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r4 != false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r4 != false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r0 = 3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m5961a(android.view.View r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
        /*
            r6 = this;
            int r0 = r6.f4634c
            r1 = 5
            r2 = 3
            r3 = 0
            r4 = 1
            r5 = 8388611(0x800003, float:1.1754948E-38)
            if (r0 != r5) goto L_0x0019
            int r7 = androidx.core.view.ViewCompat.m2862o(r7)
            if (r7 != r4) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r4 = 0
        L_0x0013:
            if (r4 == 0) goto L_0x0017
        L_0x0015:
            r0 = 5
            goto L_0x0029
        L_0x0017:
            r0 = 3
            goto L_0x0029
        L_0x0019:
            r5 = 8388613(0x800005, float:1.175495E-38)
            if (r0 != r5) goto L_0x0029
            int r7 = androidx.core.view.ViewCompat.m2862o(r7)
            if (r7 != r4) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r4 = 0
        L_0x0026:
            if (r4 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0029:
            if (r0 == r2) goto L_0x0051
            if (r0 == r1) goto L_0x0048
            r7 = 48
            if (r0 == r7) goto L_0x003f
            r7 = 80
            if (r0 == r7) goto L_0x0036
            goto L_0x0059
        L_0x0036:
            int r9 = r9 - r13
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r3 = r9 + r7
            goto L_0x0059
        L_0x003f:
            int r15 = r15 - r9
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r3 = r15 + r7
            goto L_0x0059
        L_0x0048:
            int r8 = r8 - r12
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r3 = r8 + r7
            goto L_0x0059
        L_0x0051:
            int r14 = r14 - r8
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r3 = r14 + r7
        L_0x0059:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C1234i.m5961a(android.view.View, int, int, int, int, int, int, int, int):int");
    }

    /* renamed from: a */
    private int m5962a(ViewGroup viewGroup) {
        int i = this.f4634c;
        if (i == 3 || i == 5 || i == 8388611 || i == 8388613) {
            return viewGroup.getWidth();
        }
        return viewGroup.getHeight();
    }
}
