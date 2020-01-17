package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.C9536j;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.references.ResourceReleaser;

/* renamed from: com.facebook.imagepipeline.memory.o */
public class C9759o {

    /* renamed from: a */
    private final ResourceReleaser<byte[]> f25659a;

    /* renamed from: b */
    final C9761b f25660b;

    /* renamed from: com.facebook.imagepipeline.memory.o$a */
    class C9760a implements ResourceReleaser<byte[]> {
        C9760a() {
        }

        /* renamed from: a */
        public void release(byte[] bArr) {
            C9759o.this.mo26545a(bArr);
        }
    }

    /* renamed from: com.facebook.imagepipeline.memory.o$b */
    static class C9761b extends C9762p {
        public C9761b(MemoryTrimmableRegistry memoryTrimmableRegistry, C9745c0 c0Var, PoolStatsTracker poolStatsTracker) {
            super(memoryTrimmableRegistry, c0Var, poolStatsTracker);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public C9746d<byte[]> mo26464f(int i) {
            mo26462e(i);
            return new C9771y(i, this.f25580c.f25640e, 0);
        }
    }

    public C9759o(MemoryTrimmableRegistry memoryTrimmableRegistry, C9745c0 c0Var) {
        C9536j.m23275a(c0Var.f25640e > 0);
        this.f25660b = new C9761b(memoryTrimmableRegistry, c0Var, C9770x.m24258a());
        this.f25659a = new C9760a();
    }

    /* renamed from: a */
    public CloseableReference<byte[]> mo26544a(int i) {
        return CloseableReference.m23351a(this.f25660b.get(i), this.f25659a);
    }

    /* renamed from: a */
    public void mo26545a(byte[] bArr) {
        this.f25660b.release(bArr);
    }
}
