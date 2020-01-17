package p213co.znly.core.vendor.com.google.protobuf;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;

/* renamed from: co.znly.core.vendor.com.google.protobuf.ByteBufferWriter */
final class ByteBufferWriter {
    private static final ThreadLocal<SoftReference<byte[]>> BUFFER = new ThreadLocal<>();
    private static final float BUFFER_REALLOCATION_THRESHOLD = 0.5f;
    private static final int MAX_CACHED_BUFFER_SIZE = 16384;
    private static final int MIN_CACHED_BUFFER_SIZE = 1024;

    private ByteBufferWriter() {
    }

    static void clearCachedBuffer() {
        BUFFER.set(null);
    }

    private static byte[] getBuffer() {
        SoftReference softReference = (SoftReference) BUFFER.get();
        if (softReference == null) {
            return null;
        }
        return (byte[]) softReference.get();
    }

    private static byte[] getOrCreateBuffer(int i) {
        int max = Math.max(i, MIN_CACHED_BUFFER_SIZE);
        byte[] buffer = getBuffer();
        if (buffer == null || needToReallocate(max, buffer.length)) {
            buffer = new byte[max];
            if (max <= MAX_CACHED_BUFFER_SIZE) {
                setBuffer(buffer);
            }
        }
        return buffer;
    }

    private static boolean needToReallocate(int i, int i2) {
        return i2 < i && ((float) i2) < ((float) i) * BUFFER_REALLOCATION_THRESHOLD;
    }

    private static void setBuffer(byte[] bArr) {
        BUFFER.set(new SoftReference(bArr));
    }

    static void write(ByteBuffer byteBuffer, OutputStream outputStream) throws IOException {
        int position = byteBuffer.position();
        try {
            if (byteBuffer.hasArray()) {
                outputStream.write(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            } else if (outputStream instanceof FileOutputStream) {
                ((FileOutputStream) outputStream).getChannel().write(byteBuffer);
            } else {
                byte[] orCreateBuffer = getOrCreateBuffer(byteBuffer.remaining());
                while (byteBuffer.hasRemaining()) {
                    int min = Math.min(byteBuffer.remaining(), orCreateBuffer.length);
                    byteBuffer.get(orCreateBuffer, 0, min);
                    outputStream.write(orCreateBuffer, 0, min);
                }
            }
        } finally {
            byteBuffer.position(position);
        }
    }
}
