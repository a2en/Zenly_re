package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;

/* renamed from: androidx.core.graphics.drawable.d */
final class C0562d extends ConstantState {

    /* renamed from: a */
    int f2626a;

    /* renamed from: b */
    ConstantState f2627b;

    /* renamed from: c */
    ColorStateList f2628c = null;

    /* renamed from: d */
    Mode f2629d = C0560b.f2618k;

    C0562d(C0562d dVar) {
        if (dVar != null) {
            this.f2626a = dVar.f2626a;
            this.f2627b = dVar.f2627b;
            this.f2628c = dVar.f2628c;
            this.f2629d = dVar.f2629d;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo3151a() {
        return this.f2627b != null;
    }

    public int getChangingConfigurations() {
        int i = this.f2626a;
        ConstantState constantState = this.f2627b;
        return i | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public Drawable newDrawable() {
        return newDrawable(null);
    }

    public Drawable newDrawable(Resources resources) {
        if (VERSION.SDK_INT >= 21) {
            return new C0561c(this, resources);
        }
        return new C0560b(this, resources);
    }
}
