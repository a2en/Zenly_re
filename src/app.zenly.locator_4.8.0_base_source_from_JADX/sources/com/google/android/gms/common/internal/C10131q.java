package com.google.android.gms.common.internal;

import android.content.Intent;
import androidx.fragment.app.Fragment;

/* renamed from: com.google.android.gms.common.internal.q */
final class C10131q extends C10109f {

    /* renamed from: e */
    private final /* synthetic */ Intent f26642e;

    /* renamed from: f */
    private final /* synthetic */ Fragment f26643f;

    /* renamed from: g */
    private final /* synthetic */ int f26644g;

    C10131q(Intent intent, Fragment fragment, int i) {
        this.f26642e = intent;
        this.f26643f = fragment;
        this.f26644g = i;
    }

    /* renamed from: a */
    public final void mo27464a() {
        Intent intent = this.f26642e;
        if (intent != null) {
            this.f26643f.startActivityForResult(intent, this.f26644g);
        }
    }
}
