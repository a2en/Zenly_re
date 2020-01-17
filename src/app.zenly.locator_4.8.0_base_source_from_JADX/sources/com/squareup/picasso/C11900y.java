package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso.C11847d;

/* renamed from: com.squareup.picasso.y */
final class C11900y extends C11849a<Target> {
    C11900y(Picasso picasso, Target target, C11889s sVar, int i, int i2, Drawable drawable, String str, Object obj, int i3) {
        super(picasso, target, sVar, i, i2, i3, drawable, str, obj, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35053a(Bitmap bitmap, C11847d dVar) {
        if (bitmap != null) {
            Target target = (Target) mo35062j();
            if (target != null) {
                target.onBitmapLoaded(bitmap, dVar);
                if (bitmap.isRecycled()) {
                    throw new IllegalStateException("Target callback must not recycle bitmap!");
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo35054b() {
        Target target = (Target) mo35062j();
        if (target == null) {
            return;
        }
        if (this.f30702g != 0) {
            target.onBitmapFailed(this.f30696a.f30662e.getResources().getDrawable(this.f30702g));
        } else {
            target.onBitmapFailed(this.f30703h);
        }
    }
}
