package com.facebook.common.disk;

/* renamed from: com.facebook.common.disk.a */
public class C9511a implements DiskTrimmableRegistry {

    /* renamed from: a */
    private static C9511a f24691a;

    private C9511a() {
    }

    /* renamed from: a */
    public static synchronized C9511a m23226a() {
        C9511a aVar;
        synchronized (C9511a.class) {
            if (f24691a == null) {
                f24691a = new C9511a();
            }
            aVar = f24691a;
        }
        return aVar;
    }

    public void registerDiskTrimmable(DiskTrimmable diskTrimmable) {
    }

    public void unregisterDiskTrimmable(DiskTrimmable diskTrimmable) {
    }
}
