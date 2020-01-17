package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* renamed from: com.google.android.gms.common.internal.r */
final class C10132r extends C10109f {

    /* renamed from: e */
    private final /* synthetic */ Intent f26645e;

    /* renamed from: f */
    private final /* synthetic */ Activity f26646f;

    /* renamed from: g */
    private final /* synthetic */ int f26647g;

    C10132r(Intent intent, Activity activity, int i) {
        this.f26645e = intent;
        this.f26646f = activity;
        this.f26647g = i;
    }

    /* renamed from: a */
    public final void mo27464a() {
        Intent intent = this.f26645e;
        if (intent != null) {
            this.f26646f.startActivityForResult(intent, this.f26647g);
        }
    }
}
