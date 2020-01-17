package com.crashlytics.android.core;

import java.util.HashMap;

/* renamed from: com.crashlytics.android.core.k0 */
class C9381k0 implements C9408r0 {

    /* renamed from: a */
    private final int f24315a;

    public C9381k0(int i) {
        this.f24315a = i;
    }

    /* renamed from: a */
    public StackTraceElement[] mo25067a(StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] a = m22665a(stackTraceElementArr, this.f24315a);
        return a.length < stackTraceElementArr.length ? a : stackTraceElementArr;
    }

    /* renamed from: a */
    private static StackTraceElement[] m22665a(StackTraceElement[] stackTraceElementArr, int i) {
        int i2;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i3 = 0;
        int i4 = 0;
        int i5 = 1;
        while (i3 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i3];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num == null || !m22664a(stackTraceElementArr, num.intValue(), i3)) {
                stackTraceElementArr2[i4] = stackTraceElementArr[i3];
                i4++;
                i2 = i3;
                i5 = 1;
            } else {
                int intValue = i3 - num.intValue();
                if (i5 < i) {
                    System.arraycopy(stackTraceElementArr, i3, stackTraceElementArr2, i4, intValue);
                    i4 += intValue;
                    i5++;
                }
                i2 = (intValue - 1) + i3;
            }
            hashMap.put(stackTraceElement, Integer.valueOf(i3));
            i3 = i2 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i4];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, stackTraceElementArr3.length);
        return stackTraceElementArr3;
    }

    /* renamed from: a */
    private static boolean m22664a(StackTraceElement[] stackTraceElementArr, int i, int i2) {
        int i3 = i2 - i;
        if (i2 + i3 > stackTraceElementArr.length) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!stackTraceElementArr[i + i4].equals(stackTraceElementArr[i2 + i4])) {
                return false;
            }
        }
        return true;
    }
}
