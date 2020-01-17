package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* renamed from: com.google.android.gms.common.internal.s */
final class C10133s extends C10109f {

    /* renamed from: e */
    private final /* synthetic */ Intent f26648e;

    /* renamed from: f */
    private final /* synthetic */ LifecycleFragment f26649f;

    /* renamed from: g */
    private final /* synthetic */ int f26650g;

    C10133s(Intent intent, LifecycleFragment lifecycleFragment, int i) {
        this.f26648e = intent;
        this.f26649f = lifecycleFragment;
        this.f26650g = i;
    }

    /* renamed from: a */
    public final void mo27464a() {
        Intent intent = this.f26648e;
        if (intent != null) {
            this.f26649f.startActivityForResult(intent, this.f26650g);
        }
    }
}
