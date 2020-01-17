package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.load.engine.bitmap_recycle.C8936k;
import com.bumptech.glide.p301o.C9217k;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.c */
abstract class C8923c<T extends C8936k> {

    /* renamed from: a */
    private final Queue<T> f23250a = C9217k.m22099a(20);

    C8923c() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract T mo24338a();

    /* renamed from: a */
    public void mo24340a(T t) {
        if (this.f23250a.size() < 20) {
            this.f23250a.offer(t);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public T mo24341b() {
        T t = (C8936k) this.f23250a.poll();
        return t == null ? mo24338a() : t;
    }
}
