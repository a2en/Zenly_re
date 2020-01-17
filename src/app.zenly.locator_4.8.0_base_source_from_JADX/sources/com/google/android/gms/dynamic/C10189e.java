package com.google.android.gms.dynamic;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.google.android.gms.dynamic.e */
final class C10189e implements OnClickListener {

    /* renamed from: e */
    private final /* synthetic */ Context f26747e;

    /* renamed from: f */
    private final /* synthetic */ Intent f26748f;

    C10189e(Context context, Intent intent) {
        this.f26747e = context;
        this.f26748f = intent;
    }

    public final void onClick(View view) {
        try {
            this.f26747e.startActivity(this.f26748f);
        } catch (ActivityNotFoundException e) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
        }
    }
}
