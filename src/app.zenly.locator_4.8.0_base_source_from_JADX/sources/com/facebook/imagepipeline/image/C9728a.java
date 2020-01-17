package com.facebook.imagepipeline.image;

import com.facebook.imagepipeline.animated.base.C9656b;

/* renamed from: com.facebook.imagepipeline.image.a */
public class C9728a extends C9730c {

    /* renamed from: e */
    private C9656b f25556e;

    public C9728a(C9656b bVar) {
        this.f25556e = bVar;
    }

    /* renamed from: a */
    public synchronized int mo26406a() {
        return isClosed() ? 0 : this.f25556e.mo26178c().getSizeInBytes();
    }

    /* renamed from: b */
    public boolean mo26407b() {
        return true;
    }

    /* renamed from: c */
    public synchronized C9656b mo26408c() {
        return this.f25556e;
    }

    public void close() {
        synchronized (this) {
            if (this.f25556e != null) {
                C9656b bVar = this.f25556e;
                this.f25556e = null;
                bVar.mo26175a();
            }
        }
    }

    public synchronized int getHeight() {
        return isClosed() ? 0 : this.f25556e.mo26178c().getHeight();
    }

    public synchronized int getWidth() {
        return isClosed() ? 0 : this.f25556e.mo26178c().getWidth();
    }

    public synchronized boolean isClosed() {
        return this.f25556e == null;
    }
}
