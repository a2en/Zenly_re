package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.common.internal.C9536j;
import com.facebook.common.references.ResourceReleaser;
import com.facebook.imageutils.C9896a;

/* renamed from: com.facebook.imagepipeline.memory.a */
public class C9737a {

    /* renamed from: a */
    private int f25595a;

    /* renamed from: b */
    private long f25596b;

    /* renamed from: c */
    private final int f25597c;

    /* renamed from: d */
    private final int f25598d;

    /* renamed from: e */
    private final ResourceReleaser<Bitmap> f25599e;

    /* renamed from: com.facebook.imagepipeline.memory.a$a */
    class C9738a implements ResourceReleaser<Bitmap> {
        C9738a() {
        }

        /* renamed from: a */
        public void release(Bitmap bitmap) {
            try {
                C9737a.this.mo26491a(bitmap);
            } finally {
                bitmap.recycle();
            }
        }
    }

    public C9737a(int i, int i2) {
        boolean z = true;
        C9536j.m23275a(i > 0);
        if (i2 <= 0) {
            z = false;
        }
        C9536j.m23275a(z);
        this.f25597c = i;
        this.f25598d = i2;
        this.f25599e = new C9738a();
    }

    /* renamed from: a */
    public synchronized void mo26491a(Bitmap bitmap) {
        int a = C9896a.m24733a(bitmap);
        C9536j.m23276a(this.f25595a > 0, (Object) "No bitmaps registered.");
        long j = (long) a;
        C9536j.m23277a(j <= this.f25596b, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(a), Long.valueOf(this.f25596b));
        this.f25596b -= j;
        this.f25595a--;
    }

    /* renamed from: b */
    public synchronized boolean mo26493b(Bitmap bitmap) {
        int a = C9896a.m24733a(bitmap);
        if (this.f25595a < this.f25597c) {
            long j = (long) a;
            if (this.f25596b + j <= ((long) this.f25598d)) {
                this.f25595a++;
                this.f25596b += j;
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public synchronized int mo26494c() {
        return this.f25598d;
    }

    /* renamed from: d */
    public ResourceReleaser<Bitmap> mo26495d() {
        return this.f25599e;
    }

    /* renamed from: e */
    public synchronized long mo26496e() {
        return this.f25596b;
    }

    /* renamed from: b */
    public synchronized int mo26492b() {
        return this.f25597c;
    }

    /* renamed from: a */
    public synchronized int mo26490a() {
        return this.f25595a;
    }
}
