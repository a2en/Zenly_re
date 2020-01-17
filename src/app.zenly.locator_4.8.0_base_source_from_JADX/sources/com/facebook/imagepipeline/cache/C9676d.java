package com.facebook.imagepipeline.cache;

import android.os.Build.VERSION;
import com.facebook.common.logging.C9543a;
import com.facebook.common.memory.C9545a;
import com.facebook.imagepipeline.cache.CountingMemoryCache.CacheTrimStrategy;

/* renamed from: com.facebook.imagepipeline.cache.d */
public class C9676d implements CacheTrimStrategy {

    /* renamed from: com.facebook.imagepipeline.cache.d$a */
    static /* synthetic */ class C9677a {

        /* renamed from: a */
        static final /* synthetic */ int[] f25291a = new int[C9545a.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                com.facebook.common.memory.a[] r0 = com.facebook.common.memory.C9545a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25291a = r0
                int[] r0 = f25291a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.facebook.common.memory.a r1 = com.facebook.common.memory.C9545a.OnCloseToDalvikHeapLimit     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f25291a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.facebook.common.memory.a r1 = com.facebook.common.memory.C9545a.OnAppBackgrounded     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f25291a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.facebook.common.memory.a r1 = com.facebook.common.memory.C9545a.OnSystemMemoryCriticallyLowWhileAppInForeground     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f25291a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.facebook.common.memory.a r1 = com.facebook.common.memory.C9545a.OnSystemLowMemoryWhileAppInForeground     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f25291a     // Catch:{ NoSuchFieldError -> 0x0040 }
                com.facebook.common.memory.a r1 = com.facebook.common.memory.C9545a.OnSystemLowMemoryWhileAppInBackground     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.cache.C9676d.C9677a.<clinit>():void");
        }
    }

    public double getTrimRatio(C9545a aVar) {
        int i = C9677a.f25291a[aVar.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3 || i == 4 || i == 5) {
                return 1.0d;
            }
            C9543a.m23325d("BitmapMemoryCacheTrimStrategy", "unknown trim type: %s", aVar);
            return 0.0d;
        } else if (VERSION.SDK_INT >= 21) {
            return C9545a.OnCloseToDalvikHeapLimit.mo25704a();
        } else {
            return 0.0d;
        }
    }
}
