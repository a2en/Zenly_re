package com.crashlytics.android.answers;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.crashlytics.android.answers.w */
class C9294w implements C9282o {

    /* renamed from: b */
    static final Set<C9260c> f24141b = new C9295a();

    /* renamed from: a */
    final int f24142a;

    /* renamed from: com.crashlytics.android.answers.w$a */
    static class C9295a extends HashSet<C9260c> {
        C9295a() {
            add(C9260c.START);
            add(C9260c.RESUME);
            add(C9260c.PAUSE);
            add(C9260c.STOP);
        }
    }

    public C9294w(int i) {
        this.f24142a = i;
    }

    /* renamed from: a */
    public boolean mo25015a(C9257b0 b0Var) {
        boolean z = f24141b.contains(b0Var.f24037c) && b0Var.f24035a.f24066e == null;
        boolean z2 = Math.abs(b0Var.f24035a.f24064c.hashCode() % this.f24142a) != 0;
        if (!z || !z2) {
            return false;
        }
        return true;
    }
}
