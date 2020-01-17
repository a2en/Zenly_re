package com.bluelinelabs.conductor.internal;

import android.os.Bundle;

/* renamed from: com.bluelinelabs.conductor.internal.d */
public class C8850d {

    /* renamed from: a */
    private int f22977a;

    /* renamed from: a */
    public int mo24077a() {
        int i = this.f22977a + 1;
        this.f22977a = i;
        return i;
    }

    /* renamed from: b */
    public void mo24079b(Bundle bundle) {
        bundle.putInt("TransactionIndexer.currentIndex", this.f22977a);
    }

    /* renamed from: a */
    public void mo24078a(Bundle bundle) {
        this.f22977a = bundle.getInt("TransactionIndexer.currentIndex");
    }
}
