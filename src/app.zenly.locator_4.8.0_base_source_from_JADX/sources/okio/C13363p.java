package okio;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: okio.p */
final class C13363p implements BufferedSource {

    /* renamed from: e */
    public final C13342c f34659e = new C13342c();

    /* renamed from: f */
    public final Source f34660f;

    /* renamed from: g */
    boolean f34661g;

    /* renamed from: okio.p$a */
    class C13364a extends InputStream {
        C13364a() {
        }

        public int available() throws IOException {
            C13363p pVar = C13363p.this;
            if (!pVar.f34661g) {
                return (int) Math.min(pVar.f34659e.f34606f, 2147483647L);
            }
            throw new IOException("closed");
        }

        public void close() throws IOException {
            C13363p.this.close();
        }

        public int read() throws IOException {
            C13363p pVar = C13363p.this;
            if (!pVar.f34661g) {
                C13342c cVar = pVar.f34659e;
                if (cVar.f34606f == 0 && pVar.f34660f.read(cVar, 8192) == -1) {
                    return -1;
                }
                return C13363p.this.f34659e.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C13363p.this);
            sb.append(".inputStream()");
            return sb.toString();
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (!C13363p.this.f34661g) {
                C13370u.m35433a((long) bArr.length, (long) i, (long) i2);
                C13363p pVar = C13363p.this;
                C13342c cVar = pVar.f34659e;
                if (cVar.f34606f == 0 && pVar.f34660f.read(cVar, 8192) == -1) {
                    return -1;
                }
                return C13363p.this.f34659e.read(bArr, i, i2);
            }
            throw new IOException("closed");
        }
    }

    C13363p(Source source) {
        if (source != null) {
            this.f34660f = source;
            return;
        }
        throw new NullPointerException("source == null");
    }

    public C13342c buffer() {
        return this.f34659e;
    }

    public void close() throws IOException {
        if (!this.f34661g) {
            this.f34661g = true;
            this.f34660f.close();
            this.f34659e.clear();
        }
    }

    public boolean exhausted() throws IOException {
        if (!this.f34661g) {
            return this.f34659e.exhausted() && this.f34660f.read(this.f34659e, 8192) == -1;
        }
        throw new IllegalStateException("closed");
    }

    public C13342c getBuffer() {
        return this.f34659e;
    }

    public long indexOf(byte b) throws IOException {
        return indexOf(b, 0, Long.MAX_VALUE);
    }

    public long indexOfElement(C13346d dVar) throws IOException {
        return indexOfElement(dVar, 0);
    }

    public InputStream inputStream() {
        return new C13364a();
    }

    public boolean isOpen() {
        return !this.f34661g;
    }

    public BufferedSource peek() {
        return C13354l.m35375a((Source) new C13360n(this));
    }

    public boolean rangeEquals(long j, C13346d dVar) throws IOException {
        return rangeEquals(j, dVar, 0, dVar.mo38528g());
    }

    public long read(C13342c cVar, long j) throws IOException {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (!this.f34661g) {
            C13342c cVar2 = this.f34659e;
            if (cVar2.f34606f == 0 && this.f34660f.read(cVar2, 8192) == -1) {
                return -1;
            }
            return this.f34659e.read(cVar, Math.min(j, this.f34659e.f34606f));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public long readAll(Sink sink) throws IOException {
        if (sink != null) {
            long j = 0;
            while (this.f34660f.read(this.f34659e, 8192) != -1) {
                long a = this.f34659e.mo38484a();
                if (a > 0) {
                    j += a;
                    sink.write(this.f34659e, a);
                }
            }
            if (this.f34659e.mo38488b() <= 0) {
                return j;
            }
            long b = j + this.f34659e.mo38488b();
            C13342c cVar = this.f34659e;
            sink.write(cVar, cVar.mo38488b());
            return b;
        }
        throw new IllegalArgumentException("sink == null");
    }

    public byte readByte() throws IOException {
        require(1);
        return this.f34659e.readByte();
    }

    public byte[] readByteArray() throws IOException {
        this.f34659e.writeAll(this.f34660f);
        return this.f34659e.readByteArray();
    }

    public C13346d readByteString() throws IOException {
        this.f34659e.writeAll(this.f34660f);
        return this.f34659e.readByteString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long readDecimalLong() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 1
            r6.require(r0)
            r0 = 0
            r1 = 0
        L_0x0007:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.request(r3)
            if (r3 == 0) goto L_0x0040
            okio.c r3 = r6.f34659e
            long r4 = (long) r1
            byte r3 = r3.mo38482a(r4)
            r4 = 48
            if (r3 < r4) goto L_0x001f
            r4 = 57
            if (r3 <= r4) goto L_0x0026
        L_0x001f:
            if (r1 != 0) goto L_0x0028
            r4 = 45
            if (r3 == r4) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r1 = r2
            goto L_0x0007
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            goto L_0x0040
        L_0x002b:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9] or '-' character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L_0x0040:
            okio.c r0 = r6.f34659e
            long r0 = r0.readDecimalLong()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C13363p.readDecimalLong():long");
    }

    public void readFully(byte[] bArr) throws IOException {
        try {
            require((long) bArr.length);
            this.f34659e.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                C13342c cVar = this.f34659e;
                long j = cVar.f34606f;
                if (j > 0) {
                    int read = cVar.read(bArr, i, (int) j);
                    if (read != -1) {
                        i += read;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    public long readHexadecimalUnsignedLong() throws IOException {
        require(1);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!request((long) i2)) {
                break;
            }
            byte a = this.f34659e.mo38482a((long) i);
            if ((a >= 48 && a <= 57) || ((a >= 97 && a <= 102) || (a >= 65 && a <= 70))) {
                i = i2;
            } else if (i == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(a)}));
            }
        }
        return this.f34659e.readHexadecimalUnsignedLong();
    }

    public int readInt() throws IOException {
        require(4);
        return this.f34659e.readInt();
    }

    public int readIntLe() throws IOException {
        require(4);
        return this.f34659e.readIntLe();
    }

    public long readLong() throws IOException {
        require(8);
        return this.f34659e.readLong();
    }

    public long readLongLe() throws IOException {
        require(8);
        return this.f34659e.readLongLe();
    }

    public short readShort() throws IOException {
        require(2);
        return this.f34659e.readShort();
    }

    public short readShortLe() throws IOException {
        require(2);
        return this.f34659e.readShortLe();
    }

    public String readString(Charset charset) throws IOException {
        if (charset != null) {
            this.f34659e.writeAll(this.f34660f);
            return this.f34659e.readString(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public String readUtf8() throws IOException {
        this.f34659e.writeAll(this.f34660f);
        return this.f34659e.readUtf8();
    }

    public int readUtf8CodePoint() throws IOException {
        require(1);
        byte a = this.f34659e.mo38482a(0);
        if ((a & 224) == 192) {
            require(2);
        } else if ((a & 240) == 224) {
            require(3);
        } else if ((a & 248) == 240) {
            require(4);
        }
        return this.f34659e.readUtf8CodePoint();
    }

    public String readUtf8Line() throws IOException {
        long indexOf = indexOf(10);
        if (indexOf != -1) {
            return this.f34659e.mo38489b(indexOf);
        }
        long j = this.f34659e.f34606f;
        return j != 0 ? readUtf8(j) : null;
    }

    public String readUtf8LineStrict() throws IOException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    public boolean request(long j) throws IOException {
        C13342c cVar;
        if (j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (!this.f34661g) {
            do {
                cVar = this.f34659e;
                if (cVar.f34606f >= j) {
                    return true;
                }
            } while (this.f34660f.read(cVar, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public void require(long j) throws IOException {
        if (!request(j)) {
            throw new EOFException();
        }
    }

    public int select(C13359m mVar) throws IOException {
        if (!this.f34661g) {
            do {
                int a = this.f34659e.mo38483a(mVar, true);
                if (a == -1) {
                    return -1;
                }
                if (a != -2) {
                    this.f34659e.skip((long) mVar.f34647e[a].mo38528g());
                    return a;
                }
            } while (this.f34660f.read(this.f34659e, 8192) != -1);
            return -1;
        }
        throw new IllegalStateException("closed");
    }

    public void skip(long j) throws IOException {
        if (!this.f34661g) {
            while (j > 0) {
                C13342c cVar = this.f34659e;
                if (cVar.f34606f == 0 && this.f34660f.read(cVar, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f34659e.mo38488b());
                this.f34659e.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public C13368t timeout() {
        return this.f34660f.timeout();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("buffer(");
        sb.append(this.f34660f);
        sb.append(")");
        return sb.toString();
    }

    public long indexOf(byte b, long j) throws IOException {
        return indexOf(b, j, Long.MAX_VALUE);
    }

    public long indexOfElement(C13346d dVar, long j) throws IOException {
        if (!this.f34661g) {
            while (true) {
                long indexOfElement = this.f34659e.indexOfElement(dVar, j);
                if (indexOfElement != -1) {
                    return indexOfElement;
                }
                C13342c cVar = this.f34659e;
                long j2 = cVar.f34606f;
                if (this.f34660f.read(cVar, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, j2);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public boolean rangeEquals(long j, C13346d dVar, int i, int i2) throws IOException {
        if (this.f34661g) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || i < 0 || i2 < 0 || dVar.mo38528g() - i < i2) {
            return false;
        } else {
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = ((long) i3) + j;
                if (!request(1 + j2) || this.f34659e.mo38482a(j2) != dVar.mo38513a(i + i3)) {
                    return false;
                }
            }
            return true;
        }
    }

    public String readUtf8LineStrict(long j) throws IOException {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            long indexOf = indexOf(10, 0, j2);
            if (indexOf != -1) {
                return this.f34659e.mo38489b(indexOf);
            }
            if (j2 < Long.MAX_VALUE && request(j2) && this.f34659e.mo38482a(j2 - 1) == 13 && request(1 + j2) && this.f34659e.mo38482a(j2) == 10) {
                return this.f34659e.mo38489b(j2);
            }
            C13342c cVar = new C13342c();
            C13342c cVar2 = this.f34659e;
            cVar2.mo38486a(cVar, 0, Math.min(32, cVar2.mo38488b()));
            StringBuilder sb = new StringBuilder();
            sb.append("\\n not found: limit=");
            sb.append(Math.min(this.f34659e.mo38488b(), j));
            sb.append(" content=");
            sb.append(cVar.readByteString().mo38520b());
            sb.append(8230);
            throw new EOFException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("limit < 0: ");
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString());
    }

    public long indexOf(byte b, long j, long j2) throws IOException {
        if (this.f34661g) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        } else {
            while (j < j2) {
                long indexOf = this.f34659e.indexOf(b, j, j2);
                if (indexOf == -1) {
                    C13342c cVar = this.f34659e;
                    long j3 = cVar.f34606f;
                    if (j3 >= j2 || this.f34660f.read(cVar, 8192) == -1) {
                        break;
                    }
                    j = Math.max(j, j3);
                } else {
                    return indexOf;
                }
            }
            return -1;
        }
    }

    public byte[] readByteArray(long j) throws IOException {
        require(j);
        return this.f34659e.readByteArray(j);
    }

    public C13346d readByteString(long j) throws IOException {
        require(j);
        return this.f34659e.readByteString(j);
    }

    public String readUtf8(long j) throws IOException {
        require(j);
        return this.f34659e.readUtf8(j);
    }

    public String readString(long j, Charset charset) throws IOException {
        require(j);
        if (charset != null) {
            return this.f34659e.readString(j, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public void readFully(C13342c cVar, long j) throws IOException {
        try {
            require(j);
            this.f34659e.readFully(cVar, j);
        } catch (EOFException e) {
            cVar.writeAll(this.f34659e);
            throw e;
        }
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        long j = (long) i2;
        C13370u.m35433a((long) bArr.length, (long) i, j);
        C13342c cVar = this.f34659e;
        if (cVar.f34606f == 0 && this.f34660f.read(cVar, 8192) == -1) {
            return -1;
        }
        return this.f34659e.read(bArr, i, (int) Math.min(j, this.f34659e.f34606f));
    }

    public long indexOf(C13346d dVar) throws IOException {
        return indexOf(dVar, 0);
    }

    public long indexOf(C13346d dVar, long j) throws IOException {
        if (!this.f34661g) {
            while (true) {
                long indexOf = this.f34659e.indexOf(dVar, j);
                if (indexOf != -1) {
                    return indexOf;
                }
                C13342c cVar = this.f34659e;
                long j2 = cVar.f34606f;
                if (this.f34660f.read(cVar, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, (j2 - ((long) dVar.mo38528g())) + 1);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        C13342c cVar = this.f34659e;
        if (cVar.f34606f == 0 && this.f34660f.read(cVar, 8192) == -1) {
            return -1;
        }
        return this.f34659e.read(byteBuffer);
    }
}
