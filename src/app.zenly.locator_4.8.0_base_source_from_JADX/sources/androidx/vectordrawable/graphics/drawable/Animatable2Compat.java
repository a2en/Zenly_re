package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2.AnimationCallback;
import android.graphics.drawable.Drawable;

public interface Animatable2Compat extends Animatable {

    /* renamed from: androidx.vectordrawable.graphics.drawable.Animatable2Compat$a */
    public static abstract class C1258a {

        /* renamed from: a */
        AnimationCallback f4674a;

        /* renamed from: androidx.vectordrawable.graphics.drawable.Animatable2Compat$a$a */
        class C1259a extends AnimationCallback {
            C1259a() {
            }

            public void onAnimationEnd(Drawable drawable) {
                C1258a.this.mo6128a(drawable);
            }

            public void onAnimationStart(Drawable drawable) {
                C1258a.this.mo6129b(drawable);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public AnimationCallback mo6127a() {
            if (this.f4674a == null) {
                this.f4674a = new C1259a();
            }
            return this.f4674a;
        }

        /* renamed from: a */
        public void mo6128a(Drawable drawable) {
        }

        /* renamed from: b */
        public void mo6129b(Drawable drawable) {
        }
    }

    void clearAnimationCallbacks();

    void registerAnimationCallback(C1258a aVar);

    boolean unregisterAnimationCallback(C1258a aVar);
}
