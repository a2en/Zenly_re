package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.common.internal.C9536j;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.imagepipeline.memory.BasePool.InvalidSizeException;

/* renamed from: com.facebook.imagepipeline.memory.p */
public class C9762p extends BasePool<byte[]> implements ByteArrayPool {

    /* renamed from: j */
    private final int[] f25662j;

    public C9762p(MemoryTrimmableRegistry memoryTrimmableRegistry, C9745c0 c0Var, PoolStatsTracker poolStatsTracker) {
        super(memoryTrimmableRegistry, c0Var, poolStatsTracker);
        SparseIntArray sparseIntArray = c0Var.f25638c;
        this.f25662j = new int[sparseIntArray.size()];
        for (int i = 0; i < sparseIntArray.size(); i++) {
            this.f25662j[i] = sparseIntArray.keyAt(i);
        }
        mo26452a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo26460d(int i) {
        int[] iArr;
        if (i > 0) {
            for (int i2 : this.f25662j) {
                if (i2 >= i) {
                    return i2;
                }
            }
            return i;
        }
        throw new InvalidSizeException(Integer.valueOf(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo26462e(int i) {
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo26454b(byte[] bArr) {
        C9536j.m23271a(bArr);
        return bArr.length;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public byte[] m24231a(int i) {
        return new byte[i];
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26453a(byte[] bArr) {
        C9536j.m23271a(bArr);
    }
}
