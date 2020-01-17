package androidx.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* renamed from: androidx.transition.q */
class C1244q implements C1245r {

    /* renamed from: a */
    private final ViewGroupOverlay f4652a;

    C1244q(ViewGroup viewGroup) {
        this.f4652a = viewGroup.getOverlay();
    }

    /* renamed from: a */
    public void mo6102a(Drawable drawable) {
        this.f4652a.add(drawable);
    }

    /* renamed from: b */
    public void mo6103b(Drawable drawable) {
        this.f4652a.remove(drawable);
    }

    /* renamed from: a */
    public void mo6100a(View view) {
        this.f4652a.add(view);
    }

    /* renamed from: b */
    public void mo6101b(View view) {
        this.f4652a.remove(view);
    }
}
