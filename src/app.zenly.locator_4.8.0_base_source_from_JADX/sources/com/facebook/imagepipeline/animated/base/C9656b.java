package com.facebook.imagepipeline.animated.base;

import android.graphics.Bitmap;
import com.facebook.common.internal.C9536j;
import com.facebook.common.references.CloseableReference;
import java.util.List;

/* renamed from: com.facebook.imagepipeline.animated.base.b */
public class C9656b {

    /* renamed from: a */
    private final AnimatedImage f25225a;

    /* renamed from: b */
    private final int f25226b;

    /* renamed from: c */
    private CloseableReference<Bitmap> f25227c;

    /* renamed from: d */
    private List<CloseableReference<Bitmap>> f25228d;

    C9656b(C9657c cVar) {
        AnimatedImage d = cVar.mo26185d();
        C9536j.m23271a(d);
        this.f25225a = d;
        this.f25226b = cVar.mo26184c();
        this.f25227c = cVar.mo26186e();
        this.f25228d = cVar.mo26183b();
    }

    /* renamed from: a */
    public static C9656b m23730a(AnimatedImage animatedImage) {
        return new C9656b(animatedImage);
    }

    /* renamed from: b */
    public static C9657c m23731b(AnimatedImage animatedImage) {
        return new C9657c(animatedImage);
    }

    /* renamed from: c */
    public AnimatedImage mo26178c() {
        return this.f25225a;
    }

    /* renamed from: a */
    public synchronized CloseableReference<Bitmap> mo26174a(int i) {
        if (this.f25228d == null) {
            return null;
        }
        return CloseableReference.m23348a((CloseableReference) this.f25228d.get(i));
    }

    /* renamed from: b */
    public int mo26176b() {
        return this.f25226b;
    }

    /* renamed from: b */
    public synchronized boolean mo26177b(int i) {
        return (this.f25228d == null || this.f25228d.get(i) == null) ? false : true;
    }

    /* renamed from: a */
    public synchronized void mo26175a() {
        CloseableReference.m23355b(this.f25227c);
        this.f25227c = null;
        CloseableReference.m23354a((Iterable<? extends CloseableReference<?>>) this.f25228d);
        this.f25228d = null;
    }

    private C9656b(AnimatedImage animatedImage) {
        C9536j.m23271a(animatedImage);
        this.f25225a = animatedImage;
        this.f25226b = 0;
    }
}
