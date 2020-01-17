package com.facebook.common.memory;

/* renamed from: com.facebook.common.memory.a */
public enum C9545a {
    OnCloseToDalvikHeapLimit(0.5d),
    OnSystemMemoryCriticallyLowWhileAppInForeground(1.0d),
    OnSystemLowMemoryWhileAppInForeground(0.5d),
    OnSystemLowMemoryWhileAppInBackground(1.0d),
    OnAppBackgrounded(1.0d);
    

    /* renamed from: e */
    private double f24726e;

    private C9545a(double d) {
        this.f24726e = d;
    }

    /* renamed from: a */
    public double mo25704a() {
        return this.f24726e;
    }
}
