package okio;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

public interface BufferedSource extends Source, ReadableByteChannel {
    @Deprecated
    C13342c buffer();

    boolean exhausted() throws IOException;

    C13342c getBuffer();

    long indexOf(byte b) throws IOException;

    long indexOf(byte b, long j) throws IOException;

    long indexOf(byte b, long j, long j2) throws IOException;

    long indexOf(C13346d dVar) throws IOException;

    long indexOf(C13346d dVar, long j) throws IOException;

    long indexOfElement(C13346d dVar) throws IOException;

    long indexOfElement(C13346d dVar, long j) throws IOException;

    InputStream inputStream();

    BufferedSource peek();

    boolean rangeEquals(long j, C13346d dVar) throws IOException;

    boolean rangeEquals(long j, C13346d dVar, int i, int i2) throws IOException;

    int read(byte[] bArr) throws IOException;

    int read(byte[] bArr, int i, int i2) throws IOException;

    long readAll(Sink sink) throws IOException;

    byte readByte() throws IOException;

    byte[] readByteArray() throws IOException;

    byte[] readByteArray(long j) throws IOException;

    C13346d readByteString() throws IOException;

    C13346d readByteString(long j) throws IOException;

    long readDecimalLong() throws IOException;

    void readFully(C13342c cVar, long j) throws IOException;

    void readFully(byte[] bArr) throws IOException;

    long readHexadecimalUnsignedLong() throws IOException;

    int readInt() throws IOException;

    int readIntLe() throws IOException;

    long readLong() throws IOException;

    long readLongLe() throws IOException;

    short readShort() throws IOException;

    short readShortLe() throws IOException;

    String readString(long j, Charset charset) throws IOException;

    String readString(Charset charset) throws IOException;

    String readUtf8() throws IOException;

    String readUtf8(long j) throws IOException;

    int readUtf8CodePoint() throws IOException;

    String readUtf8Line() throws IOException;

    String readUtf8LineStrict() throws IOException;

    String readUtf8LineStrict(long j) throws IOException;

    boolean request(long j) throws IOException;

    void require(long j) throws IOException;

    int select(C13359m mVar) throws IOException;

    void skip(long j) throws IOException;
}
