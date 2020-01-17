package app.zenly.android.feature.base.app;

import android.app.Dialog;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.C0794b;
import app.zenly.android.feature.base.view.C1363a;
import app.zenly.android.feature.base.view.WindowInsetsListener;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.android.feature.base.app.a */
public abstract class C1320a extends C0794b implements WindowInsetsListener {
    /* renamed from: a */
    public void mo4203a(Dialog dialog, int i) {
        C12932j.m33818b(dialog, "dialog");
        Window window = dialog.getWindow();
        if (window != null) {
            View decorView = window.getDecorView();
            if (decorView != null) {
                decorView.setSystemUiVisibility(1024);
            }
        }
        super.mo4203a(dialog, i);
    }

    /* renamed from: e */
    public abstract void mo6506e();

    public void onDestroyView() {
        View view = getView();
        if (view != null) {
            C1363a.m6387a(view, null);
        }
        super.onDestroyView();
        mo6506e();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12932j.m33818b(view, "view");
        super.onViewCreated(view, bundle);
        C1363a.m6387a(view, this);
        ViewCompat.m2809I(view);
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
    }
}
