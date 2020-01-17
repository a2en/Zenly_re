package com.facebook.imagepipeline.animated.base;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import java.util.Collection;
import java.util.List;

/* renamed from: com.facebook.imagepipeline.animated.base.c */
public class C9657c {

    /* renamed from: a */
    private final AnimatedImage f25229a;

    /* renamed from: b */
    private CloseableReference<Bitmap> f25230b;

    /* renamed from: c */
    private List<CloseableReference<Bitmap>> f25231c;

    /* renamed from: d */
    private int f25232d;

    C9657c(AnimatedImage animatedImage) {
        this.f25229a = animatedImage;
    }

    /* renamed from: a */
    public C9657c mo26181a(CloseableReference<Bitmap> closeableReference) {
        this.f25230b = CloseableReference.m23348a(closeableReference);
        return this;
    }

    /* renamed from: b */
    public List<CloseableReference<Bitmap>> mo26183b() {
        return CloseableReference.m23353a((Collection<CloseableReference<T>>) this.f25231c);
    }

    /* renamed from: c */
    public int mo26184c() {
        return this.f25232d;
    }

    /* renamed from: d */
    public AnimatedImage mo26185d() {
        return this.f25229a;
    }

    /* renamed from: e */
    public CloseableReference<Bitmap> mo26186e() {
        return CloseableReference.m23348a(this.f25230b);
    }

    /* renamed from: a */
    public C9657c mo26180a(int i) {
        this.f25232d = i;
        return this;
    }

    /* renamed from: a */
    public C9657c mo26182a(List<CloseableReference<Bitmap>> list) {
        this.f25231c = CloseableReference.m23353a((Collection<CloseableReference<T>>) list);
        return this;
    }

    /* renamed from: a */
    public C9656b mo26179a() {
        try {
            return new C9656b(this);
        } finally {
            CloseableReference.m23355b(this.f25230b);
            this.f25230b = null;
            CloseableReference.m23354a((Iterable<? extends CloseableReference<?>>) this.f25231c);
            this.f25231c = null;
        }
    }
}
