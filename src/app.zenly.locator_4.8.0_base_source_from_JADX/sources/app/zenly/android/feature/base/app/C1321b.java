package app.zenly.android.feature.base.app;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import app.zenly.android.feature.base.view.C1363a;
import app.zenly.android.feature.base.view.WindowInsetsListener;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.android.feature.base.app.b */
public abstract class C1321b extends Fragment implements WindowInsetsListener {

    /* renamed from: e */
    private HashMap f4926e;

    /* renamed from: b */
    private final boolean mo6614b() {
        FragmentActivity requireActivity = requireActivity();
        if (requireActivity != null) {
            return ((BaseAppCompatActivity) requireActivity).mo6505a();
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.android.feature.base.app.BaseAppCompatActivity");
    }

    /* renamed from: a */
    public void mo6508a() {
        HashMap hashMap = this.f4926e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void onDestroyView() {
        View view = getView();
        if (view != null) {
            C1363a.m6387a(view, null);
        }
        super.onDestroyView();
        mo6508a();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12932j.m33818b(view, "view");
        super.onViewCreated(view, bundle);
        if (mo6614b()) {
            C1363a.m6387a(view, this);
            ViewCompat.m2809I(view);
        }
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
    }
}
