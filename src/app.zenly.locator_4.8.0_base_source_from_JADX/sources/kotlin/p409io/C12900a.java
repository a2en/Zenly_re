package kotlin.p409io;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.io.a */
public final class C12900a {
    /* renamed from: a */
    public static /* synthetic */ long m33757a(InputStream inputStream, OutputStream outputStream, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return m33756a(inputStream, outputStream, i);
    }

    /* renamed from: a */
    public static final long m33756a(InputStream inputStream, OutputStream outputStream, int i) {
        C12932j.m33818b(inputStream, "$this$copyTo");
        C12932j.m33818b(outputStream, "out");
        byte[] bArr = new byte[i];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += (long) read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    /* renamed from: a */
    public static final byte[] m33758a(InputStream inputStream) {
        C12932j.m33818b(inputStream, "$this$readBytes");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        m33757a(inputStream, byteArrayOutputStream, 0, 2, null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        C12932j.m33815a((Object) byteArray, "buffer.toByteArray()");
        return byteArray;
    }
}
