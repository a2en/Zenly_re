package com.bumptech.glide.request.target;

import com.bumptech.glide.p301o.C9217k;

@Deprecated
/* renamed from: com.bumptech.glide.request.target.h */
public abstract class C9237h<Z> extends C9228a<Z> {

    /* renamed from: f */
    private final int f24003f;

    /* renamed from: g */
    private final int f24004g;

    public C9237h(int i, int i2) {
        this.f24003f = i;
        this.f24004g = i2;
    }

    public final void getSize(SizeReadyCallback sizeReadyCallback) {
        if (C9217k.m22104b(this.f24003f, this.f24004g)) {
            sizeReadyCallback.onSizeReady(this.f24003f, this.f24004g);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        sb.append(this.f24003f);
        sb.append(" and height: ");
        sb.append(this.f24004g);
        sb.append(", either provide dimensions in the constructor or call override()");
        throw new IllegalArgumentException(sb.toString());
    }

    public void removeCallback(SizeReadyCallback sizeReadyCallback) {
    }
}
