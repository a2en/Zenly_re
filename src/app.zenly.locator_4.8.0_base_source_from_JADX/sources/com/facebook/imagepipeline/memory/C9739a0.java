package com.facebook.imagepipeline.memory;

import com.facebook.common.memory.C9546b;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import com.facebook.imagepipeline.systrace.FrescoSystrace;

/* renamed from: com.facebook.imagepipeline.memory.a0 */
public class C9739a0 {

    /* renamed from: a */
    private final C9745c0 f25601a;

    /* renamed from: b */
    private final PoolStatsTracker f25602b;

    /* renamed from: c */
    private final C9745c0 f25603c;

    /* renamed from: d */
    private final MemoryTrimmableRegistry f25604d;

    /* renamed from: e */
    private final C9745c0 f25605e;

    /* renamed from: f */
    private final PoolStatsTracker f25606f;

    /* renamed from: g */
    private final C9745c0 f25607g;

    /* renamed from: h */
    private final PoolStatsTracker f25608h;

    /* renamed from: i */
    private final String f25609i;

    /* renamed from: j */
    private final int f25610j;

    /* renamed from: k */
    private final int f25611k;

    /* renamed from: l */
    private final boolean f25612l;

    /* renamed from: com.facebook.imagepipeline.memory.a0$b */
    public static class C9741b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C9745c0 f25613a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public PoolStatsTracker f25614b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C9745c0 f25615c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public MemoryTrimmableRegistry f25616d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C9745c0 f25617e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public PoolStatsTracker f25618f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C9745c0 f25619g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public PoolStatsTracker f25620h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public String f25621i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f25622j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f25623k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public boolean f25624l;

        private C9741b() {
        }

        /* renamed from: a */
        public C9739a0 mo26510a() {
            return new C9739a0(this);
        }
    }

    /* renamed from: m */
    public static C9741b m24141m() {
        return new C9741b();
    }

    /* renamed from: a */
    public int mo26498a() {
        return this.f25611k;
    }

    /* renamed from: b */
    public int mo26499b() {
        return this.f25610j;
    }

    /* renamed from: c */
    public C9745c0 mo26500c() {
        return this.f25601a;
    }

    /* renamed from: d */
    public PoolStatsTracker mo26501d() {
        return this.f25602b;
    }

    /* renamed from: e */
    public String mo26502e() {
        return this.f25609i;
    }

    /* renamed from: f */
    public C9745c0 mo26503f() {
        return this.f25603c;
    }

    /* renamed from: g */
    public C9745c0 mo26504g() {
        return this.f25605e;
    }

    /* renamed from: h */
    public PoolStatsTracker mo26505h() {
        return this.f25606f;
    }

    /* renamed from: i */
    public MemoryTrimmableRegistry mo26506i() {
        return this.f25604d;
    }

    /* renamed from: j */
    public C9745c0 mo26507j() {
        return this.f25607g;
    }

    /* renamed from: k */
    public PoolStatsTracker mo26508k() {
        return this.f25608h;
    }

    /* renamed from: l */
    public boolean mo26509l() {
        return this.f25612l;
    }

    private C9739a0(C9741b bVar) {
        C9745c0 c0Var;
        PoolStatsTracker poolStatsTracker;
        C9745c0 c0Var2;
        MemoryTrimmableRegistry memoryTrimmableRegistry;
        C9745c0 c0Var3;
        PoolStatsTracker poolStatsTracker2;
        C9745c0 c0Var4;
        PoolStatsTracker poolStatsTracker3;
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24703a("PoolConfig()");
        }
        if (bVar.f25613a == null) {
            c0Var = C9753i.m24214a();
        } else {
            c0Var = bVar.f25613a;
        }
        this.f25601a = c0Var;
        if (bVar.f25614b == null) {
            poolStatsTracker = C9770x.m24258a();
        } else {
            poolStatsTracker = bVar.f25614b;
        }
        this.f25602b = poolStatsTracker;
        if (bVar.f25615c == null) {
            c0Var2 = C9755k.m24218a();
        } else {
            c0Var2 = bVar.f25615c;
        }
        this.f25603c = c0Var2;
        if (bVar.f25616d == null) {
            memoryTrimmableRegistry = C9546b.m23343a();
        } else {
            memoryTrimmableRegistry = bVar.f25616d;
        }
        this.f25604d = memoryTrimmableRegistry;
        if (bVar.f25617e == null) {
            c0Var3 = C9756l.m24219a();
        } else {
            c0Var3 = bVar.f25617e;
        }
        this.f25605e = c0Var3;
        if (bVar.f25618f == null) {
            poolStatsTracker2 = C9770x.m24258a();
        } else {
            poolStatsTracker2 = bVar.f25618f;
        }
        this.f25606f = poolStatsTracker2;
        if (bVar.f25619g == null) {
            c0Var4 = C9754j.m24216a();
        } else {
            c0Var4 = bVar.f25619g;
        }
        this.f25607g = c0Var4;
        if (bVar.f25620h == null) {
            poolStatsTracker3 = C9770x.m24258a();
        } else {
            poolStatsTracker3 = bVar.f25620h;
        }
        this.f25608h = poolStatsTracker3;
        this.f25609i = bVar.f25621i == null ? "legacy" : bVar.f25621i;
        this.f25610j = bVar.f25622j;
        this.f25611k = bVar.f25623k > 0 ? bVar.f25623k : 4194304;
        this.f25612l = bVar.f25624l;
        if (FrescoSystrace.m24705c()) {
            FrescoSystrace.m24702a();
        }
    }
}
