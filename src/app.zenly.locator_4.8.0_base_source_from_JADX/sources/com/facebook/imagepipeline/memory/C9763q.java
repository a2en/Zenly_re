package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.facebook.common.memory.C9545a;
import com.facebook.common.memory.MemoryTrimmableRegistry;

/* renamed from: com.facebook.imagepipeline.memory.q */
public class C9763q implements BitmapPool {

    /* renamed from: a */
    protected final C9772z<Bitmap> f25663a = new C9744c();

    /* renamed from: b */
    private final int f25664b;

    /* renamed from: c */
    private int f25665c;

    /* renamed from: d */
    private final PoolStatsTracker f25666d;

    /* renamed from: e */
    private int f25667e;

    public C9763q(int i, int i2, PoolStatsTracker poolStatsTracker, MemoryTrimmableRegistry memoryTrimmableRegistry) {
        this.f25664b = i;
        this.f25665c = i2;
        this.f25666d = poolStatsTracker;
        if (memoryTrimmableRegistry != null) {
            memoryTrimmableRegistry.registerMemoryTrimmable(this);
        }
    }

    /* renamed from: a */
    private Bitmap m24236a(int i) {
        this.f25666d.onAlloc(i);
        return Bitmap.createBitmap(1, i, Config.ALPHA_8);
    }

    /* renamed from: b */
    private synchronized void m24237b(int i) {
        while (true) {
            if (this.f25667e <= i) {
                break;
            }
            Bitmap bitmap = (Bitmap) this.f25663a.pop();
            if (bitmap == null) {
                break;
            }
            int a = this.f25663a.mo26521a(bitmap);
            this.f25667e -= a;
            this.f25666d.onFree(a);
        }
    }

    public void trim(C9545a aVar) {
        m24237b((int) (((double) this.f25664b) * (1.0d - aVar.mo25704a())));
    }

    public synchronized Bitmap get(int i) {
        if (this.f25667e > this.f25664b) {
            m24237b(this.f25664b);
        }
        Bitmap bitmap = (Bitmap) this.f25663a.get(i);
        if (bitmap != null) {
            int a = this.f25663a.mo26521a(bitmap);
            this.f25667e -= a;
            this.f25666d.onValueReuse(a);
            return bitmap;
        }
        return m24236a(i);
    }

    /* renamed from: a */
    public void release(Bitmap bitmap) {
        int a = this.f25663a.mo26521a(bitmap);
        if (a <= this.f25665c) {
            this.f25666d.onValueRelease(a);
            this.f25663a.put(bitmap);
            synchronized (this) {
                this.f25667e += a;
            }
        }
    }
}
