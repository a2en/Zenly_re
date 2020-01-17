package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import com.google.android.gms.common.internal.C10123l;

/* renamed from: com.google.android.gms.common.b */
public class C10066b extends DialogFragment {

    /* renamed from: e */
    private Dialog f26452e = null;

    /* renamed from: f */
    private OnCancelListener f26453f = null;

    /* renamed from: a */
    public static C10066b m25290a(Dialog dialog, OnCancelListener onCancelListener) {
        C10066b bVar = new C10066b();
        C10123l.m25506a(dialog, (Object) "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        bVar.f26452e = dialog2;
        if (onCancelListener != null) {
            bVar.f26453f = onCancelListener;
        }
        return bVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        OnCancelListener onCancelListener = this.f26453f;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        if (this.f26452e == null) {
            setShowsDialog(false);
        }
        return this.f26452e;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
