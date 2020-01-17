package com.crashlytics.android.core;

/* renamed from: com.crashlytics.android.core.c0 */
class C9310c0 implements C9408r0 {

    /* renamed from: a */
    private final int f24168a;

    public C9310c0(int i) {
        this.f24168a = i;
    }

    /* renamed from: a */
    public StackTraceElement[] mo25067a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.f24168a;
        if (length <= i) {
            return stackTraceElementArr;
        }
        int i2 = i / 2;
        int i3 = i - i2;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i3);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i2, stackTraceElementArr2, i3, i2);
        return stackTraceElementArr2;
    }
}
