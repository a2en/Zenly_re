package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import androidx.fragment.app.C0794b;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.C10123l;

/* renamed from: com.google.android.gms.common.h */
public class C10077h extends C0794b {

    /* renamed from: r */
    private Dialog f26477r = null;

    /* renamed from: s */
    private OnCancelListener f26478s = null;

    /* renamed from: a */
    public Dialog mo4201a(Bundle bundle) {
        if (this.f26477r == null) {
            mo4205a(false);
        }
        return this.f26477r;
    }

    public void onCancel(DialogInterface dialogInterface) {
        OnCancelListener onCancelListener = this.f26478s;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    /* renamed from: a */
    public static C10077h m25329a(Dialog dialog, OnCancelListener onCancelListener) {
        C10077h hVar = new C10077h();
        C10123l.m25506a(dialog, (Object) "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        hVar.f26477r = dialog2;
        if (onCancelListener != null) {
            hVar.f26478s = onCancelListener;
        }
        return hVar;
    }

    /* renamed from: a */
    public void mo4204a(FragmentManager fragmentManager, String str) {
        super.mo4204a(fragmentManager, str);
    }
}
