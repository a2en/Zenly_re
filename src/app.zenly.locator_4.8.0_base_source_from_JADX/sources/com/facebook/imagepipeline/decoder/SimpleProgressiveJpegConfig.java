package com.facebook.imagepipeline.decoder;

import com.facebook.common.internal.C9536j;
import com.facebook.imagepipeline.image.C9733f;
import com.facebook.imagepipeline.image.QualityInfo;
import java.util.Collections;
import java.util.List;

public class SimpleProgressiveJpegConfig implements ProgressiveJpegConfig {

    /* renamed from: a */
    private final DynamicValueConfig f25541a;

    public interface DynamicValueConfig {
        int getGoodEnoughScanNumber();

        List<Integer> getScansToDecode();
    }

    /* renamed from: com.facebook.imagepipeline.decoder.SimpleProgressiveJpegConfig$b */
    private static class C9723b implements DynamicValueConfig {
        private C9723b() {
        }

        public int getGoodEnoughScanNumber() {
            return 0;
        }

        public List<Integer> getScansToDecode() {
            return Collections.EMPTY_LIST;
        }
    }

    public SimpleProgressiveJpegConfig() {
        this(new C9723b());
    }

    public int getNextScanNumberToDecode(int i) {
        List scansToDecode = this.f25541a.getScansToDecode();
        if (scansToDecode == null || scansToDecode.isEmpty()) {
            return i + 1;
        }
        for (int i2 = 0; i2 < scansToDecode.size(); i2++) {
            if (((Integer) scansToDecode.get(i2)).intValue() > i) {
                return ((Integer) scansToDecode.get(i2)).intValue();
            }
        }
        return Integer.MAX_VALUE;
    }

    public QualityInfo getQualityInfo(int i) {
        return C9733f.m24099a(i, i >= this.f25541a.getGoodEnoughScanNumber(), false);
    }

    public SimpleProgressiveJpegConfig(DynamicValueConfig dynamicValueConfig) {
        C9536j.m23271a(dynamicValueConfig);
        this.f25541a = dynamicValueConfig;
    }
}
