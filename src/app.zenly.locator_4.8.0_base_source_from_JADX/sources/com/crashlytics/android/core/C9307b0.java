package com.crashlytics.android.core;

/* renamed from: com.crashlytics.android.core.b0 */
class C9307b0 implements C9408r0 {

    /* renamed from: a */
    private final int f24163a;

    /* renamed from: b */
    private final C9408r0[] f24164b;

    /* renamed from: c */
    private final C9310c0 f24165c;

    public C9307b0(int i, C9408r0... r0VarArr) {
        this.f24163a = i;
        this.f24164b = r0VarArr;
        this.f24165c = new C9310c0(i);
    }

    /* renamed from: a */
    public StackTraceElement[] mo25067a(StackTraceElement[] stackTraceElementArr) {
        C9408r0[] r0VarArr;
        if (stackTraceElementArr.length <= this.f24163a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (C9408r0 r0Var : this.f24164b) {
            if (stackTraceElementArr2.length <= this.f24163a) {
                break;
            }
            stackTraceElementArr2 = r0Var.mo25067a(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > this.f24163a) {
            stackTraceElementArr2 = this.f24165c.mo25067a(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }
}
