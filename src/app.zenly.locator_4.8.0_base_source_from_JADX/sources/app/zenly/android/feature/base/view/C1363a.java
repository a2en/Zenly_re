package app.zenly.android.feature.base.view;

import android.graphics.Rect;
import android.view.View;
import androidx.core.view.C0666p;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.android.feature.base.view.a */
public final class C1363a {

    /* renamed from: app.zenly.android.feature.base.view.a$a */
    static final class C1364a implements OnApplyWindowInsetsListener {

        /* renamed from: a */
        final /* synthetic */ View f5000a;

        /* renamed from: b */
        final /* synthetic */ WindowInsetsListener f5001b;

        C1364a(View view, WindowInsetsListener windowInsetsListener) {
            this.f5000a = view;
            this.f5001b = windowInsetsListener;
        }

        public final C0666p onApplyWindowInsets(View view, C0666p pVar) {
            C12932j.m33815a((Object) pVar, "insets");
            this.f5001b.onWindowInsetsChanged(this.f5000a, new Rect(pVar.mo3444b(), pVar.mo3446d(), pVar.mo3445c(), pVar.mo3442a()));
            return pVar;
        }
    }

    /* renamed from: a */
    public static final void m6387a(View view, WindowInsetsListener windowInsetsListener) {
        C12932j.m33818b(view, "$this$setOnWindowInsetsChanged");
        ViewCompat.m2823a(view, (OnApplyWindowInsetsListener) windowInsetsListener != null ? new C1364a(view, windowInsetsListener) : null);
    }
}
