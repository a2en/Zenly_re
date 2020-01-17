package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: okio.o */
final class C13361o implements BufferedSink {

    /* renamed from: e */
    public final C13342c f34655e = new C13342c();

    /* renamed from: f */
    public final Sink f34656f;

    /* renamed from: g */
    boolean f34657g;

    /* renamed from: okio.o$a */
    class C13362a extends OutputStream {
        C13362a() {
        }

        public void close() throws IOException {
            C13361o.this.close();
        }

        public void flush() throws IOException {
            C13361o oVar = C13361o.this;
            if (!oVar.f34657g) {
                oVar.flush();
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C13361o.this);
            sb.append(".outputStream()");
            return sb.toString();
        }

        public void write(int i) throws IOException {
            C13361o oVar = C13361o.this;
            if (!oVar.f34657g) {
                oVar.f34655e.writeByte((int) (byte) i);
                C13361o.this.emitCompleteSegments();
                return;
            }
            throw new IOException("closed");
        }

        public void write(byte[] bArr, int i, int i2) throws IOException {
            C13361o oVar = C13361o.this;
            if (!oVar.f34657g) {
                oVar.f34655e.write(bArr, i, i2);
                C13361o.this.emitCompleteSegments();
                return;
            }
            throw new IOException("closed");
        }
    }

    C13361o(Sink sink) {
        if (sink != null) {
            this.f34656f = sink;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    public C13342c buffer() {
        return this.f34655e;
    }

    public void close() throws IOException {
        if (!this.f34657g) {
            try {
                if (this.f34655e.f34606f > 0) {
                    this.f34656f.write(this.f34655e, this.f34655e.f34606f);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f34656f.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.f34657g = true;
            if (th != null) {
                C13370u.m35434a(th);
                throw null;
            }
        }
    }

    public BufferedSink emit() throws IOException {
        if (!this.f34657g) {
            long b = this.f34655e.mo38488b();
            if (b > 0) {
                this.f34656f.write(this.f34655e, b);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public BufferedSink emitCompleteSegments() throws IOException {
        if (!this.f34657g) {
            long a = this.f34655e.mo38484a();
            if (a > 0) {
                this.f34656f.write(this.f34655e, a);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public void flush() throws IOException {
        if (!this.f34657g) {
            C13342c cVar = this.f34655e;
            long j = cVar.f34606f;
            if (j > 0) {
                this.f34656f.write(cVar, j);
            }
            this.f34656f.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public boolean isOpen() {
        return !this.f34657g;
    }

    public OutputStream outputStream() {
        return new C13362a();
    }

    public C13368t timeout() {
        return this.f34656f.timeout();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("buffer(");
        sb.append(this.f34656f);
        sb.append(")");
        return sb.toString();
    }

    public void write(C13342c cVar, long j) throws IOException {
        if (!this.f34657g) {
            this.f34655e.write(cVar, j);
            emitCompleteSegments();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public long writeAll(Source source) throws IOException {
        if (source != null) {
            long j = 0;
            while (true) {
                long read = source.read(this.f34655e, 8192);
                if (read == -1) {
                    return j;
                }
                j += read;
                emitCompleteSegments();
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public BufferedSink writeByte(int i) throws IOException {
        if (!this.f34657g) {
            this.f34655e.writeByte(i);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public BufferedSink writeDecimalLong(long j) throws IOException {
        if (!this.f34657g) {
            this.f34655e.writeDecimalLong(j);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public BufferedSink writeHexadecimalUnsignedLong(long j) throws IOException {
        if (!this.f34657g) {
            this.f34655e.writeHexadecimalUnsignedLong(j);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    public BufferedSink writeInt(int i) throws IOException {
        if (!this.f34657g) {
            this.f34655e.writeInt(i);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    public BufferedSink writeIntLe(int i) throws IOException {
        if (!this.f34657g) {
            this.f34655e.writeIntLe(i);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public BufferedSink writeLong(long j) throws IOException {
        if (!this.f34657g) {
            this.f34655e.writeLong(j);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public BufferedSink writeLongLe(long j) throws IOException {
        if (!this.f34657g) {
            this.f34655e.writeLongLe(j);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public BufferedSink writeShort(int i) throws IOException {
        if (!this.f34657g) {
            this.f34655e.writeShort(i);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public BufferedSink writeShortLe(int i) throws IOException {
        if (!this.f34657g) {
            this.f34655e.writeShortLe(i);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public BufferedSink writeString(String str, Charset charset) throws IOException {
        if (!this.f34657g) {
            this.f34655e.writeString(str, charset);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public BufferedSink writeUtf8(String str) throws IOException {
        if (!this.f34657g) {
            this.f34655e.writeUtf8(str);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed");
    }

    public BufferedSink writeUtf8CodePoint(int i) throws IOException {
        if (!this.f34657g) {
            this.f34655e.writeUtf8CodePoint(i);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public BufferedSink write(C13346d dVar) throws IOException {
        if (!this.f34657g) {
            this.f34655e.write(dVar);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public BufferedSink writeString(String str, int i, int i2, Charset charset) throws IOException {
        if (!this.f34657g) {
            this.f34655e.writeString(str, i, i2, charset);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public BufferedSink writeUtf8(String str, int i, int i2) throws IOException {
        if (!this.f34657g) {
            this.f34655e.writeUtf8(str, i, i2);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public BufferedSink write(byte[] bArr) throws IOException {
        if (!this.f34657g) {
            this.f34655e.write(bArr);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public BufferedSink write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f34657g) {
            this.f34655e.write(bArr, i, i2);
            emitCompleteSegments();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.f34657g) {
            int write = this.f34655e.write(byteBuffer);
            emitCompleteSegments();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    public BufferedSink write(Source source, long j) throws IOException {
        while (j > 0) {
            long read = source.read(this.f34655e, j);
            if (read != -1) {
                j -= read;
                emitCompleteSegments();
            } else {
                throw new EOFException();
            }
        }
        return this;
    }
}
