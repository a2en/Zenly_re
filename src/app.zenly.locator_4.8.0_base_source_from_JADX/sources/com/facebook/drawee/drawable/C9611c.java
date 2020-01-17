package com.facebook.drawee.drawable;

import android.annotation.SuppressLint;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.drawee.drawable.c */
public class C9611c {

    /* renamed from: a */
    private int f24966a = -1;

    /* renamed from: b */
    private boolean f24967b = false;

    /* renamed from: c */
    private ColorFilter f24968c = null;

    /* renamed from: d */
    private int f24969d = -1;

    /* renamed from: e */
    private int f24970e = -1;

    /* renamed from: a */
    public void mo25964a(int i) {
        this.f24966a = i;
    }

    /* renamed from: b */
    public void mo25968b(boolean z) {
        this.f24970e = z ? 1 : 0;
    }

    /* renamed from: a */
    public void mo25965a(ColorFilter colorFilter) {
        this.f24968c = colorFilter;
        this.f24967b = true;
    }

    /* renamed from: a */
    public void mo25967a(boolean z) {
        this.f24969d = z ? 1 : 0;
    }

    @SuppressLint({"Range"})
    /* renamed from: a */
    public void mo25966a(Drawable drawable) {
        if (drawable != null) {
            int i = this.f24966a;
            if (i != -1) {
                drawable.setAlpha(i);
            }
            if (this.f24967b) {
                drawable.setColorFilter(this.f24968c);
            }
            int i2 = this.f24969d;
            boolean z = true;
            if (i2 != -1) {
                drawable.setDither(i2 != 0);
            }
            int i3 = this.f24970e;
            if (i3 != -1) {
                if (i3 == 0) {
                    z = false;
                }
                drawable.setFilterBitmap(z);
            }
        }
    }
}
