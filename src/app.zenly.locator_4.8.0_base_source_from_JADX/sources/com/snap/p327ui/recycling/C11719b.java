package com.snap.p327ui.recycling;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1074l;
import androidx.recyclerview.widget.RecyclerView.C1082s;
import com.snap.p327ui.recycling.adapter.C11703a;
import com.snap.p327ui.recycling.p328d.C11723b;
import com.snap.p327ui.seeking.C11751f;

/* renamed from: com.snap.ui.recycling.b */
public class C11719b extends C11721c<C11723b<?>> {

    /* renamed from: e */
    private C11703a f30372e;

    /* renamed from: f */
    private RecyclerView f30373f;

    /* renamed from: com.snap.ui.recycling.b$a */
    public static class C11720a extends C1074l {

        /* renamed from: a */
        final int f30374a;

        /* renamed from: b */
        final int f30375b;

        public C11720a(int i, int i2) {
            this.f30374a = i;
            this.f30375b = i2;
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1082s sVar) {
            int i;
            int i2;
            boolean z = recyclerView.getLayoutDirection() == 0;
            int e = recyclerView.mo5085e(view);
            if (z) {
                i = sVar.mo5482a() - 1;
                i2 = 0;
            } else {
                i2 = sVar.mo5482a() - 1;
                i = 0;
            }
            if (e == i2) {
                rect.left = this.f30375b;
                rect.right = 0;
            } else if (e == i) {
                rect.left = this.f30374a;
                rect.right = this.f30375b;
            } else {
                rect.left = this.f30374a;
                rect.right = 0;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        Context context = view.getContext();
        this.f30373f = (RecyclerView) view;
        this.f30373f.setLayoutManager(new LinearLayoutManager(context, 0, false));
        this.f30373f.setOverScrollMode(2);
        this.f30373f.setItemAnimator(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public RecyclerView mo34490g() {
        return this.f30373f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C11703a mo34488a(C11723b<?> bVar) {
        return new C11703a(bVar.mo34505k(), bVar.mo34501g());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C11723b<?> bVar, C11723b<?> bVar2) {
        if (this.f30372e == null) {
            this.f30372e = mo34488a(bVar);
            this.f30373f.setAdapter(this.f30372e);
            m30783b(bVar);
            this.f30373f.mo5045a((C1074l) new C11720a(bVar.mo34503i(), bVar.mo34502h()));
        } else if (bVar2 == null || bVar.mo34504j() != bVar2.mo34504j()) {
            m30783b(bVar);
        }
        this.f30372e.mo34459a(C11751f.m30863b(bVar.mo34507f()));
    }

    /* renamed from: b */
    private void m30783b(C11723b<?> bVar) {
        LayoutParams layoutParams = this.f30373f.getLayoutParams();
        layoutParams.height = bVar.mo34504j();
        this.f30373f.setLayoutParams(layoutParams);
    }
}
