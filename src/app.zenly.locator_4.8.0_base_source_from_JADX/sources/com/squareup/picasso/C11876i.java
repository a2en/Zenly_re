package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.Picasso.C11847d;

/* renamed from: com.squareup.picasso.i */
class C11876i extends C11849a<ImageView> {

    /* renamed from: m */
    Callback f30765m;

    C11876i(Picasso picasso, ImageView imageView, C11889s sVar, int i, int i2, int i3, Drawable drawable, String str, Object obj, Callback callback, boolean z) {
        super(picasso, imageView, sVar, i, i2, i3, drawable, str, obj, z);
        this.f30765m = callback;
    }

    /* renamed from: a */
    public void mo35053a(Bitmap bitmap, C11847d dVar) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.f30698c.get();
            if (imageView != null) {
                Picasso picasso = this.f30696a;
                Bitmap bitmap2 = bitmap;
                C11847d dVar2 = dVar;
                C11886q.m31215a(imageView, picasso.f30662e, bitmap2, dVar2, this.f30699d, picasso.f30670m);
                Callback callback = this.f30765m;
                if (callback != null) {
                    callback.onSuccess();
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    /* renamed from: b */
    public void mo35054b() {
        ImageView imageView = (ImageView) this.f30698c.get();
        if (imageView != null) {
            int i = this.f30702g;
            if (i != 0) {
                imageView.setImageResource(i);
            } else {
                Drawable drawable = this.f30703h;
                if (drawable != null) {
                    imageView.setImageDrawable(drawable);
                }
            }
            Callback callback = this.f30765m;
            if (callback != null) {
                callback.onError();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35052a() {
        super.mo35052a();
        if (this.f30765m != null) {
            this.f30765m = null;
        }
    }
}
