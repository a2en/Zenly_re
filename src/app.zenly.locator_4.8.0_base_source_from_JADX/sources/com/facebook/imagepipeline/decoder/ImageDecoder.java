package com.facebook.imagepipeline.decoder;

import com.facebook.imagepipeline.common.C9698b;
import com.facebook.imagepipeline.image.C9730c;
import com.facebook.imagepipeline.image.C9732e;
import com.facebook.imagepipeline.image.QualityInfo;

public interface ImageDecoder {
    C9730c decode(C9732e eVar, int i, QualityInfo qualityInfo, C9698b bVar);
}
