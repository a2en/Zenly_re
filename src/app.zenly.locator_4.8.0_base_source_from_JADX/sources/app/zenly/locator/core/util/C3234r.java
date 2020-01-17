package app.zenly.locator.core.util;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;

/* renamed from: app.zenly.locator.core.util.r */
public final class C3234r {

    /* renamed from: a */
    private static ThreadLocal<MemoryInfo> f9018a = new C3235a();

    /* renamed from: app.zenly.locator.core.util.r$a */
    static class C3235a extends ThreadLocal<MemoryInfo> {
        C3235a() {
        }

        /* access modifiers changed from: protected */
        public MemoryInfo initialValue() {
            return new MemoryInfo();
        }
    }

    /* renamed from: a */
    public static MemoryInfo m10250a(Context context) {
        MemoryInfo memoryInfo = (MemoryInfo) f9018a.get();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        return memoryInfo;
    }

    /* renamed from: b */
    public static boolean m10251b(Context context) {
        return m10250a(context).lowMemory;
    }
}
