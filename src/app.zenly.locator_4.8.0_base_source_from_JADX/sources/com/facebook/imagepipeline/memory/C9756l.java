package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView.ItemAnimator;

/* renamed from: com.facebook.imagepipeline.memory.l */
public class C9756l {
    /* renamed from: a */
    public static C9745c0 m24219a() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(1024, 5);
        sparseIntArray.put(ItemAnimator.FLAG_MOVED, 5);
        sparseIntArray.put(4096, 5);
        sparseIntArray.put(8192, 5);
        sparseIntArray.put(16384, 5);
        sparseIntArray.put(32768, 5);
        sparseIntArray.put(65536, 5);
        sparseIntArray.put(131072, 5);
        sparseIntArray.put(262144, 2);
        sparseIntArray.put(524288, 2);
        sparseIntArray.put(1048576, 2);
        return new C9745c0(m24221c(), m24220b(), sparseIntArray);
    }

    /* renamed from: b */
    private static int m24220b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return min / 2;
        }
        return (min / 4) * 3;
    }

    /* renamed from: c */
    private static int m24221c() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return 3145728;
        }
        return min < 33554432 ? 6291456 : 12582912;
    }
}
