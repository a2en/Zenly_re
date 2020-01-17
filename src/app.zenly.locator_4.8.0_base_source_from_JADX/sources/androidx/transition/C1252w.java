package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* renamed from: androidx.transition.w */
class C1252w implements C1253x {

    /* renamed from: a */
    private final ViewOverlay f4665a;

    C1252w(View view) {
        this.f4665a = view.getOverlay();
    }

    /* renamed from: a */
    public void mo6102a(Drawable drawable) {
        this.f4665a.add(drawable);
    }

    /* renamed from: b */
    public void mo6103b(Drawable drawable) {
        this.f4665a.remove(drawable);
    }
}
