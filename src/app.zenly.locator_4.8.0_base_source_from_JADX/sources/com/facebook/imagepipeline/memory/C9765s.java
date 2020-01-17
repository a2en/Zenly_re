package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.common.internal.C9536j;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.imagepipeline.memory.BasePool.InvalidSizeException;

/* renamed from: com.facebook.imagepipeline.memory.s */
public abstract class C9765s extends BasePool<MemoryChunk> {

    /* renamed from: j */
    private final int[] f25670j;

    C9765s(MemoryTrimmableRegistry memoryTrimmableRegistry, C9745c0 c0Var, PoolStatsTracker poolStatsTracker) {
        super(memoryTrimmableRegistry, c0Var, poolStatsTracker);
        SparseIntArray sparseIntArray = c0Var.f25638c;
        this.f25670j = new int[sparseIntArray.size()];
        int i = 0;
        while (true) {
            int[] iArr = this.f25670j;
            if (i < iArr.length) {
                iArr[i] = sparseIntArray.keyAt(i);
                i++;
            } else {
                mo26452a();
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract MemoryChunk m24241a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo26460d(int i) {
        int[] iArr;
        if (i > 0) {
            for (int i2 : this.f25670j) {
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

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public int mo26554f() {
        return this.f25670j[0];
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo26454b(MemoryChunk memoryChunk) {
        C9536j.m23271a(memoryChunk);
        return memoryChunk.getSize();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo26459c(MemoryChunk memoryChunk) {
        C9536j.m23271a(memoryChunk);
        return !memoryChunk.isClosed();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo26453a(MemoryChunk memoryChunk) {
        C9536j.m23271a(memoryChunk);
        memoryChunk.close();
    }
}
