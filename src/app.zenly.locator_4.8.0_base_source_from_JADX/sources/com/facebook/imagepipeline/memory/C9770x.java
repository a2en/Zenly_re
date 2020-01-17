package com.facebook.imagepipeline.memory;

/* renamed from: com.facebook.imagepipeline.memory.x */
public class C9770x implements PoolStatsTracker {

    /* renamed from: a */
    private static C9770x f25675a;

    private C9770x() {
    }

    /* renamed from: a */
    public static synchronized C9770x m24258a() {
        C9770x xVar;
        synchronized (C9770x.class) {
            if (f25675a == null) {
                f25675a = new C9770x();
            }
            xVar = f25675a;
        }
        return xVar;
    }

    public void onAlloc(int i) {
    }

    public void onFree(int i) {
    }

    public void onHardCapReached() {
    }

    public void onSoftCapReached() {
    }

    public void onValueRelease(int i) {
    }

    public void onValueReuse(int i) {
    }

    public void setBasePool(BasePool basePool) {
    }
}
