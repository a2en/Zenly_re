package com.facebook.imagepipeline.transcoder;

import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.common.C9701e;
import com.facebook.imagepipeline.common.C9702f;
import com.facebook.imagepipeline.image.C9732e;
import java.io.IOException;
import java.io.OutputStream;

public interface ImageTranscoder {
    boolean canResize(C9732e eVar, C9702f fVar, C9701e eVar2);

    boolean canTranscode(ImageFormat imageFormat);

    String getIdentifier();

    C9891b transcode(C9732e eVar, OutputStream outputStream, C9702f fVar, C9701e eVar2, ImageFormat imageFormat, Integer num) throws IOException;
}
