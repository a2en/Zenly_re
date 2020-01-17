package com.snap.p327ui.recycling;

import android.view.View;
import com.snap.p327ui.recycling.BindingContext;
import com.snap.p327ui.recycling.factory.C11727c;
import com.snap.p327ui.recycling.p328d.C11722a;
import kotlin.jvm.internal.C12932j;

/* renamed from: com.snap.ui.recycling.a */
public abstract class C11702a<TBindingContext extends BindingContext, TData extends C11722a> extends C11721c<TData> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo13942a(TBindingContext tbindingcontext, View view);

    /* renamed from: a */
    public final void mo34452a(TBindingContext tbindingcontext, C11727c cVar, View view) {
        C12932j.m33818b(tbindingcontext, "bindingContext");
        C12932j.m33818b(cVar, "viewFactory");
        C12932j.m33818b(view, "itemView");
        super.mo34451a(view);
        mo13942a(tbindingcontext, view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
    }

    /* renamed from: a */
    public void mo34451a(View view) {
        C12932j.m33818b(view, "itemView");
        throw new UnsupportedOperationException("must call create(bindingContext, itemView)");
    }
}
