package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import com.bumptech.glide.load.C8885d;
import com.bumptech.glide.load.C9011f;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.bumptech.glide.load.resource.gif.i */
public class C9163i implements ResourceDecoder<InputStream, C9156c> {

    /* renamed from: a */
    private final List<ImageHeaderParser> f23790a;

    /* renamed from: b */
    private final ResourceDecoder<ByteBuffer, C9156c> f23791b;

    /* renamed from: c */
    private final ArrayPool f23792c;

    public C9163i(List<ImageHeaderParser> list, ResourceDecoder<ByteBuffer, C9156c> resourceDecoder, ArrayPool arrayPool) {
        this.f23790a = list;
        this.f23791b = resourceDecoder;
        this.f23792c = arrayPool;
    }

    /* renamed from: a */
    public boolean handles(InputStream inputStream, C9011f fVar) throws IOException {
        return !((Boolean) fVar.mo24517a(C9162h.f23789b)).booleanValue() && C8885d.m21329b(this.f23790a, inputStream, this.f23792c) == ImageType.GIF;
    }

    /* renamed from: a */
    public Resource<C9156c> decode(InputStream inputStream, int i, int i2, C9011f fVar) throws IOException {
        byte[] a = m21949a(inputStream);
        if (a == null) {
            return null;
        }
        return this.f23791b.decode(ByteBuffer.wrap(a), i, i2, fVar);
    }

    /* renamed from: a */
    private static byte[] m21949a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            String str = "StreamGifDecoder";
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Error reading data from stream", e);
            }
            return null;
        }
    }
}
