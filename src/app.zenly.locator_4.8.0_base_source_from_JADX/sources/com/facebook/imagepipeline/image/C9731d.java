package com.facebook.imagepipeline.image;

import android.graphics.Bitmap;
import com.facebook.common.internal.C9536j;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.ResourceReleaser;
import com.facebook.imageutils.C9896a;

/* renamed from: com.facebook.imagepipeline.image.d */
public class C9731d extends C9729b {

    /* renamed from: e */
    private CloseableReference<Bitmap> f25557e;

    /* renamed from: f */
    private volatile Bitmap f25558f;

    /* renamed from: g */
    private final QualityInfo f25559g;

    /* renamed from: h */
    private final int f25560h;

    /* renamed from: i */
    private final int f25561i;

    public C9731d(Bitmap bitmap, ResourceReleaser<Bitmap> resourceReleaser, QualityInfo qualityInfo, int i) {
        this(bitmap, resourceReleaser, qualityInfo, i, 0);
    }

    /* renamed from: b */
    private static int m24061b(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getWidth();
    }

    /* renamed from: g */
    private synchronized CloseableReference<Bitmap> m24062g() {
        CloseableReference<Bitmap> closeableReference;
        closeableReference = this.f25557e;
        this.f25557e = null;
        this.f25558f = null;
        return closeableReference;
    }

    /* renamed from: a */
    public int mo26406a() {
        return C9896a.m24733a(this.f25558f);
    }

    /* renamed from: c */
    public Bitmap mo26411c() {
        return this.f25558f;
    }

    public void close() {
        CloseableReference g = m24062g();
        if (g != null) {
            g.close();
        }
    }

    /* renamed from: d */
    public synchronized CloseableReference<Bitmap> mo26413d() {
        return CloseableReference.m23348a(this.f25557e);
    }

    /* renamed from: e */
    public int mo26414e() {
        return this.f25561i;
    }

    /* renamed from: f */
    public int mo26415f() {
        return this.f25560h;
    }

    public int getHeight() {
        if (this.f25560h % 180 == 0) {
            int i = this.f25561i;
            if (!(i == 5 || i == 7)) {
                return m24060a(this.f25558f);
            }
        }
        return m24061b(this.f25558f);
    }

    public QualityInfo getQualityInfo() {
        return this.f25559g;
    }

    public int getWidth() {
        if (this.f25560h % 180 == 0) {
            int i = this.f25561i;
            if (!(i == 5 || i == 7)) {
                return m24061b(this.f25558f);
            }
        }
        return m24060a(this.f25558f);
    }

    public synchronized boolean isClosed() {
        return this.f25557e == null;
    }

    public C9731d(Bitmap bitmap, ResourceReleaser<Bitmap> resourceReleaser, QualityInfo qualityInfo, int i, int i2) {
        C9536j.m23271a(bitmap);
        this.f25558f = bitmap;
        Bitmap bitmap2 = this.f25558f;
        C9536j.m23271a(resourceReleaser);
        this.f25557e = CloseableReference.m23351a(bitmap2, resourceReleaser);
        this.f25559g = qualityInfo;
        this.f25560h = i;
        this.f25561i = i2;
    }

    /* renamed from: a */
    private static int m24060a(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getHeight();
    }

    public C9731d(CloseableReference<Bitmap> closeableReference, QualityInfo qualityInfo, int i) {
        this(closeableReference, qualityInfo, i, 0);
    }

    public C9731d(CloseableReference<Bitmap> closeableReference, QualityInfo qualityInfo, int i, int i2) {
        CloseableReference<Bitmap> a = closeableReference.mo25723a();
        C9536j.m23271a(a);
        this.f25557e = a;
        this.f25558f = (Bitmap) this.f25557e.mo25724b();
        this.f25559g = qualityInfo;
        this.f25560h = i;
        this.f25561i = i2;
    }
}
