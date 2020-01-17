package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.facebook.common.internal.C9536j;
import com.facebook.common.memory.MemoryTrimmableRegistry;

@TargetApi(21)
/* renamed from: com.facebook.imagepipeline.memory.f */
public class C9750f extends BasePool<Bitmap> implements BitmapPool {
    public C9750f(MemoryTrimmableRegistry memoryTrimmableRegistry, C9745c0 c0Var, PoolStatsTracker poolStatsTracker) {
        super(memoryTrimmableRegistry, c0Var, poolStatsTracker);
        mo26452a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo26460d(int i) {
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo26462e(int i) {
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo26454b(Bitmap bitmap) {
        C9536j.m23271a(bitmap);
        return bitmap.getAllocationByteCount();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo26459c(Bitmap bitmap) {
        C9536j.m23271a(bitmap);
        return !bitmap.isRecycled() && bitmap.isMutable();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap m24200a(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Config.RGB_565);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26453a(Bitmap bitmap) {
        C9536j.m23271a(bitmap);
        bitmap.recycle();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public Bitmap m24201a(C9746d<Bitmap> dVar) {
        Bitmap bitmap = (Bitmap) super.mo26451a(dVar);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }
}
