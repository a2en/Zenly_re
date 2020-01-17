package com.snap.p327ui.recycling.adapter;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.C1082s;

/* renamed from: com.snap.ui.recycling.adapter.LoopingAdapter$LoopingLayoutManager */
public class LoopingAdapter$LoopingLayoutManager extends LinearLayoutManager {

    /* renamed from: I */
    private boolean f30329I;

    /* renamed from: a */
    public boolean mo4994a() {
        return super.mo4994a() && !this.f30329I;
    }

    /* renamed from: f */
    public void mo5004f(int i, int i2) {
        super.mo5004f(i, i2);
    }

    /* renamed from: g */
    public void mo4955g(C1082s sVar) {
        super.mo4955g(sVar);
        this.f30329I = false;
        mo5241a(true);
    }

    /* renamed from: h */
    public void mo5006h(int i) {
        super.mo5006h(i);
    }
}
