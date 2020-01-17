package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.common.internal.C10101c;
import com.google.android.gms.internal.base.C10262d;

/* renamed from: com.google.android.gms.common.images.b */
public abstract class C10084b {

    /* renamed from: a */
    protected int f26508a;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27348a(Context context, Bitmap bitmap, boolean z) {
        C10101c.m25429a((Object) bitmap);
        mo27350a(new BitmapDrawable(context.getResources(), bitmap), z, false, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo27350a(Drawable drawable, boolean z, boolean z2, boolean z3);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo27349a(Context context, C10262d dVar, boolean z) {
        int i = this.f26508a;
        mo27350a(i != 0 ? context.getResources().getDrawable(i) : null, z, false, false);
    }
}
