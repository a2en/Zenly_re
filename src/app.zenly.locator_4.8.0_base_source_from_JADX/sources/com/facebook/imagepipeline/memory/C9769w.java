package com.facebook.imagepipeline.memory;

import com.facebook.common.memory.MemoryTrimmableRegistry;

/* renamed from: com.facebook.imagepipeline.memory.w */
public class C9769w extends C9765s {
    public C9769w(MemoryTrimmableRegistry memoryTrimmableRegistry, C9745c0 c0Var, PoolStatsTracker poolStatsTracker) {
        super(memoryTrimmableRegistry, c0Var, poolStatsTracker);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public NativeMemoryChunk m24256a(int i) {
        return new NativeMemoryChunk(i);
    }
}
