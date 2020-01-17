package androidx.transition;

import android.view.View;
import android.view.WindowId;

/* renamed from: androidx.transition.f0 */
class C1230f0 implements C1232g0 {

    /* renamed from: a */
    private final WindowId f4625a;

    C1230f0(View view) {
        this.f4625a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1230f0) && ((C1230f0) obj).f4625a.equals(this.f4625a);
    }

    public int hashCode() {
        return this.f4625a.hashCode();
    }
}
