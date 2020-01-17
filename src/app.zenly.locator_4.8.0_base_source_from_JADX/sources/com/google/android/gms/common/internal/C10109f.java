package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.util.Log;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleFragment;

/* renamed from: com.google.android.gms.common.internal.f */
public abstract class C10109f implements OnClickListener {
    /* renamed from: a */
    public static C10109f m25455a(Activity activity, Intent intent, int i) {
        return new C10132r(intent, activity, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo27464a();

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo27464a();
        } catch (ActivityNotFoundException e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: a */
    public static C10109f m25456a(Fragment fragment, Intent intent, int i) {
        return new C10131q(intent, fragment, i);
    }

    /* renamed from: a */
    public static C10109f m25457a(LifecycleFragment lifecycleFragment, Intent intent, int i) {
        return new C10133s(intent, lifecycleFragment, i);
    }
}
