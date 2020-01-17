package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import java.io.InputStream;
import java.nio.ByteBuffer;

public interface GifDecoder {

    public interface BitmapProvider {
        Bitmap obtain(int i, int i2, Config config);

        byte[] obtainByteArray(int i);

        int[] obtainIntArray(int i);

        void release(Bitmap bitmap);

        void release(byte[] bArr);

        void release(int[] iArr);
    }

    void advance();

    void clear();

    int getByteSize();

    int getCurrentFrameIndex();

    ByteBuffer getData();

    int getDelay(int i);

    int getFrameCount();

    int getHeight();

    @Deprecated
    int getLoopCount();

    int getNetscapeLoopCount();

    int getNextDelay();

    Bitmap getNextFrame();

    int getStatus();

    int getTotalIterationCount();

    int getWidth();

    int read(InputStream inputStream, int i);

    int read(byte[] bArr);

    void resetFrameIndex();

    void setData(C8861b bVar, ByteBuffer byteBuffer);

    void setData(C8861b bVar, ByteBuffer byteBuffer, int i);

    void setData(C8861b bVar, byte[] bArr);

    void setDefaultBitmapConfig(Config config);
}
