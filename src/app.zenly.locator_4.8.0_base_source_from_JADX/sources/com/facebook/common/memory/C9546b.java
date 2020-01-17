package com.facebook.common.memory;

/* renamed from: com.facebook.common.memory.b */
public class C9546b implements MemoryTrimmableRegistry {

    /* renamed from: a */
    private static C9546b f24727a;

    /* renamed from: a */
    public static synchronized C9546b m23343a() {
        C9546b bVar;
        synchronized (C9546b.class) {
            if (f24727a == null) {
                f24727a = new C9546b();
            }
            bVar = f24727a;
        }
        return bVar;
    }

    public void registerMemoryTrimmable(MemoryTrimmable memoryTrimmable) {
    }

    public void unregisterMemoryTrimmable(MemoryTrimmable memoryTrimmable) {
    }
}
