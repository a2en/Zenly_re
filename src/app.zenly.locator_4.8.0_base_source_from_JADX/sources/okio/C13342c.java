package okio;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* renamed from: okio.c */
public final class C13342c implements BufferedSource, BufferedSink, Cloneable, ByteChannel {

    /* renamed from: g */
    private static final byte[] f34604g = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: e */
    C13365q f34605e;

    /* renamed from: f */
    long f34606f;

    /* renamed from: okio.c$a */
    class C13343a extends OutputStream {
        C13343a() {
        }

        public void close() {
        }

        public void flush() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C13342c.this);
            sb.append(".outputStream()");
            return sb.toString();
        }

        public void write(int i) {
            C13342c.this.writeByte((int) (byte) i);
        }

        public void write(byte[] bArr, int i, int i2) {
            C13342c.this.write(bArr, i, i2);
        }
    }

    /* renamed from: okio.c$b */
    class C13344b extends InputStream {
        C13344b() {
        }

        public int available() {
            return (int) Math.min(C13342c.this.f34606f, 2147483647L);
        }

        public void close() {
        }

        public int read() {
            C13342c cVar = C13342c.this;
            if (cVar.f34606f > 0) {
                return cVar.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C13342c.this);
            sb.append(".inputStream()");
            return sb.toString();
        }

        public int read(byte[] bArr, int i, int i2) {
            return C13342c.this.read(bArr, i, i2);
        }
    }

    /* renamed from: okio.c$c */
    public static final class C13345c implements Closeable {

        /* renamed from: e */
        public C13342c f34609e;

        /* renamed from: f */
        public boolean f34610f;

        /* renamed from: g */
        private C13365q f34611g;

        /* renamed from: h */
        public long f34612h = -1;

        /* renamed from: i */
        public byte[] f34613i;

        /* renamed from: j */
        public int f34614j = -1;

        /* renamed from: k */
        public int f34615k = -1;

        /* renamed from: a */
        public final int mo38510a() {
            long j = this.f34612h;
            if (j == this.f34609e.f34606f) {
                throw new IllegalStateException();
            } else if (j == -1) {
                return mo38511a(0);
            } else {
                return mo38511a(j + ((long) (this.f34615k - this.f34614j)));
            }
        }

        public void close() {
            if (this.f34609e != null) {
                this.f34609e = null;
                this.f34611g = null;
                this.f34612h = -1;
                this.f34613i = null;
                this.f34614j = -1;
                this.f34615k = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer");
        }

        /* renamed from: a */
        public final int mo38511a(long j) {
            C13365q qVar;
            long j2;
            C13365q qVar2;
            int i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
            if (i >= 0) {
                C13342c cVar = this.f34609e;
                long j3 = cVar.f34606f;
                if (j <= j3) {
                    if (i == 0 || j == j3) {
                        this.f34611g = null;
                        this.f34612h = j;
                        this.f34613i = null;
                        this.f34614j = -1;
                        this.f34615k = -1;
                        return -1;
                    }
                    long j4 = 0;
                    C13365q qVar3 = cVar.f34605e;
                    C13365q qVar4 = this.f34611g;
                    if (qVar4 != null) {
                        long j5 = this.f34612h - ((long) (this.f34614j - qVar4.f34664b));
                        if (j5 > j) {
                            j3 = j5;
                            C13365q qVar5 = qVar4;
                            qVar4 = qVar3;
                            qVar3 = qVar5;
                        } else {
                            j4 = j5;
                        }
                    } else {
                        qVar4 = qVar3;
                    }
                    if (j3 - j > j - j4) {
                        while (true) {
                            int i2 = qVar.f34665c;
                            int i3 = qVar.f34664b;
                            if (j < ((long) (i2 - i3)) + j2) {
                                break;
                            }
                            j4 = j2 + ((long) (i2 - i3));
                            qVar4 = qVar.f34668f;
                        }
                    } else {
                        qVar = qVar3;
                        j2 = j3;
                        while (j2 > j) {
                            qVar = qVar.f34669g;
                            j2 -= (long) (qVar.f34665c - qVar.f34664b);
                        }
                    }
                    if (!this.f34610f || !qVar.f34666d) {
                        qVar2 = qVar;
                    } else {
                        qVar2 = qVar.mo38576d();
                        C13342c cVar2 = this.f34609e;
                        if (cVar2.f34605e == qVar) {
                            cVar2.f34605e = qVar2;
                        }
                        qVar.mo38571a(qVar2);
                        qVar2.f34669g.mo38574b();
                    }
                    this.f34611g = qVar2;
                    this.f34612h = j;
                    this.f34613i = qVar2.f34663a;
                    this.f34614j = qVar2.f34664b + ((int) (j - j2));
                    this.f34615k = qVar2.f34665c;
                    return this.f34615k - this.f34614j;
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format("offset=%s > size=%s", new Object[]{Long.valueOf(j), Long.valueOf(this.f34609e.f34606f)}));
        }
    }

    /* renamed from: a */
    public final C13342c mo38486a(C13342c cVar, long j, long j2) {
        if (cVar != null) {
            C13370u.m35433a(this.f34606f, j, j2);
            if (j2 == 0) {
                return this;
            }
            cVar.f34606f += j2;
            C13365q qVar = this.f34605e;
            while (true) {
                int i = qVar.f34665c;
                int i2 = qVar.f34664b;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                qVar = qVar.f34668f;
            }
            while (j2 > 0) {
                C13365q c = qVar.mo38575c();
                c.f34664b = (int) (((long) c.f34664b) + j);
                c.f34665c = Math.min(c.f34664b + ((int) j2), c.f34665c);
                C13365q qVar2 = cVar.f34605e;
                if (qVar2 == null) {
                    c.f34669g = c;
                    c.f34668f = c;
                    cVar.f34605e = c;
                } else {
                    qVar2.f34669g.mo38571a(c);
                }
                j2 -= (long) (c.f34665c - c.f34664b);
                qVar = qVar.f34668f;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    /* renamed from: b */
    public final long mo38488b() {
        return this.f34606f;
    }

    public C13342c buffer() {
        return this;
    }

    /* renamed from: c */
    public final C13346d mo38491c() {
        long j = this.f34606f;
        if (j <= 2147483647L) {
            return mo38487a((int) j);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("size > Integer.MAX_VALUE: ");
        sb.append(this.f34606f);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void clear() {
        try {
            skip(this.f34606f);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public void close() {
    }

    public BufferedSink emit() {
        return this;
    }

    public C13342c emitCompleteSegments() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13342c)) {
            return false;
        }
        C13342c cVar = (C13342c) obj;
        long j = this.f34606f;
        if (j != cVar.f34606f) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C13365q qVar = this.f34605e;
        C13365q qVar2 = cVar.f34605e;
        int i = qVar.f34664b;
        int i2 = qVar2.f34664b;
        while (j2 < this.f34606f) {
            long min = (long) Math.min(qVar.f34665c - i, qVar2.f34665c - i2);
            int i3 = i2;
            int i4 = i;
            int i5 = 0;
            while (((long) i5) < min) {
                int i6 = i4 + 1;
                int i7 = i3 + 1;
                if (qVar.f34663a[i4] != qVar2.f34663a[i3]) {
                    return false;
                }
                i5++;
                i4 = i6;
                i3 = i7;
            }
            if (i4 == qVar.f34665c) {
                qVar = qVar.f34668f;
                i = qVar.f34664b;
            } else {
                i = i4;
            }
            if (i3 == qVar2.f34665c) {
                qVar2 = qVar2.f34668f;
                i2 = qVar2.f34664b;
            } else {
                i2 = i3;
            }
            j2 += min;
        }
        return true;
    }

    public boolean exhausted() {
        return this.f34606f == 0;
    }

    public void flush() {
    }

    public C13342c getBuffer() {
        return this;
    }

    public int hashCode() {
        C13365q qVar = this.f34605e;
        if (qVar == null) {
            return 0;
        }
        int i = 1;
        do {
            for (int i2 = qVar.f34664b; i2 < qVar.f34665c; i2++) {
                i = (i * 31) + qVar.f34663a[i2];
            }
            qVar = qVar.f34668f;
        } while (qVar != this.f34605e);
        return i;
    }

    public long indexOf(byte b) {
        return indexOf(b, 0, Long.MAX_VALUE);
    }

    public long indexOfElement(C13346d dVar) {
        return indexOfElement(dVar, 0);
    }

    public InputStream inputStream() {
        return new C13344b();
    }

    public boolean isOpen() {
        return true;
    }

    public OutputStream outputStream() {
        return new C13343a();
    }

    public BufferedSource peek() {
        return C13354l.m35375a((Source) new C13360n(this));
    }

    public boolean rangeEquals(long j, C13346d dVar) {
        return rangeEquals(j, dVar, 0, dVar.mo38528g());
    }

    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public long readAll(Sink sink) throws IOException {
        long j = this.f34606f;
        if (j > 0) {
            sink.write(this, j);
        }
        return j;
    }

    public byte readByte() {
        long j = this.f34606f;
        if (j != 0) {
            C13365q qVar = this.f34605e;
            int i = qVar.f34664b;
            int i2 = qVar.f34665c;
            int i3 = i + 1;
            byte b = qVar.f34663a[i];
            this.f34606f = j - 1;
            if (i3 == i2) {
                this.f34605e = qVar.mo38574b();
                C13366r.m35401a(qVar);
            } else {
                qVar.f34664b = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    public byte[] readByteArray() {
        try {
            return readByteArray(this.f34606f);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public C13346d readByteString() {
        return new C13346d(readByteArray());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r5 != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        r1.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("Number too large: ");
        r3.append(r1.readUtf8());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        throw new java.lang.NumberFormatException(r3.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long readDecimalLong() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.f34606f
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x00b5
            r5 = -7
            r7 = 0
            r8 = r5
            r5 = 0
            r6 = 0
        L_0x0010:
            okio.q r10 = r0.f34605e
            byte[] r11 = r10.f34663a
            int r12 = r10.f34664b
            int r13 = r10.f34665c
        L_0x0018:
            if (r12 >= r13) goto L_0x0096
            byte r15 = r11[r12]
            r14 = 48
            if (r15 < r14) goto L_0x0068
            r1 = 57
            if (r15 > r1) goto L_0x0068
            int r14 = r14 - r15
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r16 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r16 < 0) goto L_0x003d
            if (r16 != 0) goto L_0x0036
            long r1 = (long) r14
            int r16 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r16 >= 0) goto L_0x0036
            goto L_0x003d
        L_0x0036:
            r1 = 10
            long r3 = r3 * r1
            long r1 = (long) r14
            long r3 = r3 + r1
            goto L_0x0072
        L_0x003d:
            okio.c r1 = new okio.c
            r1.<init>()
            r1.writeDecimalLong(r3)
            r1.writeByte(r15)
            if (r5 != 0) goto L_0x004d
            r1.readByte()
        L_0x004d:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Number too large: "
            r3.append(r4)
            java.lang.String r1 = r1.readUtf8()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L_0x0068:
            r1 = 45
            if (r15 != r1) goto L_0x0077
            if (r7 != 0) goto L_0x0077
            r1 = 1
            long r8 = r8 - r1
            r5 = 1
        L_0x0072:
            int r12 = r12 + 1
            int r7 = r7 + 1
            goto L_0x0018
        L_0x0077:
            if (r7 == 0) goto L_0x007b
            r6 = 1
            goto L_0x0096
        L_0x007b:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected leading [0-9] or '-' character but was 0x"
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r15)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0096:
            if (r12 != r13) goto L_0x00a2
            okio.q r1 = r10.mo38574b()
            r0.f34605e = r1
            okio.C13366r.m35401a(r10)
            goto L_0x00a4
        L_0x00a2:
            r10.f34664b = r12
        L_0x00a4:
            if (r6 != 0) goto L_0x00aa
            okio.q r1 = r0.f34605e
            if (r1 != 0) goto L_0x0010
        L_0x00aa:
            long r1 = r0.f34606f
            long r6 = (long) r7
            long r1 = r1 - r6
            r0.f34606f = r1
            if (r5 == 0) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            long r3 = -r3
        L_0x00b4:
            return r3
        L_0x00b5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "size == 0"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C13342c.readDecimalLong():long");
    }

    public void readFully(C13342c cVar, long j) throws EOFException {
        long j2 = this.f34606f;
        if (j2 >= j) {
            cVar.write(this, j);
        } else {
            cVar.write(this, j2);
            throw new EOFException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008f, code lost:
        if (r8 != r9) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0091, code lost:
        r15.f34605e = r6.mo38574b();
        okio.C13366r.m35401a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        r6.f34664b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
        if (r0 != false) goto L_0x00a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0074 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long readHexadecimalUnsignedLong() {
        /*
            r15 = this;
            long r0 = r15.f34606f
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00aa
            r0 = 0
            r4 = r2
            r1 = 0
        L_0x000b:
            okio.q r6 = r15.f34605e
            byte[] r7 = r6.f34663a
            int r8 = r6.f34664b
            int r9 = r6.f34665c
        L_0x0013:
            if (r8 >= r9) goto L_0x008f
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0022
            r11 = 57
            if (r10 > r11) goto L_0x0022
            int r11 = r10 + -48
            goto L_0x003a
        L_0x0022:
            r11 = 97
            if (r10 < r11) goto L_0x002f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x002f
            int r11 = r10 + -97
        L_0x002c:
            int r11 = r11 + 10
            goto L_0x003a
        L_0x002f:
            r11 = 65
            if (r10 < r11) goto L_0x0070
            r11 = 70
            if (r10 > r11) goto L_0x0070
            int r11 = r10 + -65
            goto L_0x002c
        L_0x003a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x004a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r1 = r1 + 1
            goto L_0x0013
        L_0x004a:
            okio.c r0 = new okio.c
            r0.<init>()
            r0.writeHexadecimalUnsignedLong(r4)
            r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.readUtf8()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0070:
            if (r1 == 0) goto L_0x0074
            r0 = 1
            goto L_0x008f
        L_0x0074:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x008f:
            if (r8 != r9) goto L_0x009b
            okio.q r7 = r6.mo38574b()
            r15.f34605e = r7
            okio.C13366r.m35401a(r6)
            goto L_0x009d
        L_0x009b:
            r6.f34664b = r8
        L_0x009d:
            if (r0 != 0) goto L_0x00a3
            okio.q r6 = r15.f34605e
            if (r6 != 0) goto L_0x000b
        L_0x00a3:
            long r2 = r15.f34606f
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.f34606f = r2
            return r4
        L_0x00aa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.C13342c.readHexadecimalUnsignedLong():long");
    }

    public int readInt() {
        long j = this.f34606f;
        if (j >= 4) {
            C13365q qVar = this.f34605e;
            int i = qVar.f34664b;
            int i2 = qVar.f34665c;
            if (i2 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = qVar.f34663a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i5 = i4 + 1;
            byte b2 = b | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b3 = b2 | (bArr[i5] & 255);
            this.f34606f = j - 4;
            if (i6 == i2) {
                this.f34605e = qVar.mo38574b();
                C13366r.m35401a(qVar);
            } else {
                qVar.f34664b = i6;
            }
            return b3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("size < 4: ");
        sb.append(this.f34606f);
        throw new IllegalStateException(sb.toString());
    }

    public int readIntLe() {
        return C13370u.m35430a(readInt());
    }

    public long readLong() {
        long j = this.f34606f;
        if (j >= 8) {
            C13365q qVar = this.f34605e;
            int i = qVar.f34664b;
            int i2 = qVar.f34665c;
            if (i2 - i < 8) {
                return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
            }
            byte[] bArr = qVar.f34663a;
            int i3 = i + 1;
            long j2 = (((long) bArr[i]) & 255) << 56;
            int i4 = i3 + 1;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            long j3 = ((((long) bArr[i3]) & 255) << 48) | j2 | ((((long) bArr[i4]) & 255) << 40) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 24) | ((((long) bArr[i7]) & 255) << 16) | ((((long) bArr[i8]) & 255) << 8) | (((long) bArr[i9]) & 255);
            this.f34606f = j - 8;
            if (i10 == i2) {
                this.f34605e = qVar.mo38574b();
                C13366r.m35401a(qVar);
            } else {
                qVar.f34664b = i10;
            }
            return j3;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("size < 8: ");
        sb.append(this.f34606f);
        throw new IllegalStateException(sb.toString());
    }

    public long readLongLe() {
        return C13370u.m35431a(readLong());
    }

    public short readShort() {
        long j = this.f34606f;
        if (j >= 2) {
            C13365q qVar = this.f34605e;
            int i = qVar.f34664b;
            int i2 = qVar.f34665c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = qVar.f34663a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.f34606f = j - 2;
            if (i4 == i2) {
                this.f34605e = qVar.mo38574b();
                C13366r.m35401a(qVar);
            } else {
                qVar.f34664b = i4;
            }
            return (short) b;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("size < 2: ");
        sb.append(this.f34606f);
        throw new IllegalStateException(sb.toString());
    }

    public short readShortLe() {
        return C13370u.m35432a(readShort());
    }

    public String readString(Charset charset) {
        try {
            return readString(this.f34606f, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public String readUtf8() {
        try {
            return readString(this.f34606f, C13370u.f34678a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public int readUtf8CodePoint() throws EOFException {
        byte b;
        int i;
        byte b2;
        if (this.f34606f != 0) {
            byte a = mo38482a(0);
            int i2 = 1;
            if ((a & 128) == 0) {
                b2 = a & Byte.MAX_VALUE;
                i = 1;
                b = 0;
            } else if ((a & 224) == 192) {
                b2 = a & 31;
                i = 2;
                b = 128;
            } else if ((a & 240) == 224) {
                b2 = a & 15;
                i = 3;
                b = 2048;
            } else if ((a & 248) == 240) {
                b2 = a & 7;
                i = 4;
                b = 65536;
            } else {
                skip(1);
                return 65533;
            }
            long j = (long) i;
            if (this.f34606f >= j) {
                while (i2 < i) {
                    long j2 = (long) i2;
                    byte a2 = mo38482a(j2);
                    if ((a2 & 192) == 128) {
                        b2 = (b2 << 6) | (a2 & 63);
                        i2++;
                    } else {
                        skip(j2);
                        return 65533;
                    }
                }
                skip(j);
                if (b2 > 1114111) {
                    return 65533;
                }
                if ((b2 < 55296 || b2 > 57343) && b2 >= b) {
                    return b2;
                }
                return 65533;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("size < ");
            sb.append(i);
            sb.append(": ");
            sb.append(this.f34606f);
            sb.append(" (to read code point prefixed 0x");
            sb.append(Integer.toHexString(a));
            sb.append(")");
            throw new EOFException(sb.toString());
        }
        throw new EOFException();
    }

    public String readUtf8Line() throws EOFException {
        long indexOf = indexOf(10);
        if (indexOf != -1) {
            return mo38489b(indexOf);
        }
        long j = this.f34606f;
        return j != 0 ? readUtf8(j) : null;
    }

    public String readUtf8LineStrict() throws EOFException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    public boolean request(long j) {
        return this.f34606f >= j;
    }

    public void require(long j) throws EOFException {
        if (this.f34606f < j) {
            throw new EOFException();
        }
    }

    public int select(C13359m mVar) {
        int a = mo38483a(mVar, false);
        if (a == -1) {
            return -1;
        }
        try {
            skip((long) mVar.f34647e[a].mo38528g());
            return a;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    public void skip(long j) throws EOFException {
        while (j > 0) {
            C13365q qVar = this.f34605e;
            if (qVar != null) {
                int min = (int) Math.min(j, (long) (qVar.f34665c - qVar.f34664b));
                long j2 = (long) min;
                this.f34606f -= j2;
                j -= j2;
                C13365q qVar2 = this.f34605e;
                qVar2.f34664b += min;
                if (qVar2.f34664b == qVar2.f34665c) {
                    this.f34605e = qVar2.mo38574b();
                    C13366r.m35401a(qVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public C13368t timeout() {
        return C13368t.f34674d;
    }

    public String toString() {
        return mo38491c().toString();
    }

    public long writeAll(Source source) throws IOException {
        if (source != null) {
            long j = 0;
            while (true) {
                long read = source.read(this, 8192);
                if (read == -1) {
                    return j;
                }
                j += read;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public String mo38489b(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (mo38482a(j2) == 13) {
                String readUtf8 = readUtf8(j2);
                skip(2);
                return readUtf8;
            }
        }
        String readUtf82 = readUtf8(j);
        skip(1);
        return readUtf82;
    }

    public C13342c clone() {
        C13342c cVar = new C13342c();
        if (this.f34606f == 0) {
            return cVar;
        }
        cVar.f34605e = this.f34605e.mo38575c();
        C13365q qVar = cVar.f34605e;
        qVar.f34669g = qVar;
        qVar.f34668f = qVar;
        C13365q qVar2 = this.f34605e;
        while (true) {
            qVar2 = qVar2.f34668f;
            if (qVar2 != this.f34605e) {
                cVar.f34605e.f34669g.mo38571a(qVar2.mo38575c());
            } else {
                cVar.f34606f = this.f34606f;
                return cVar;
            }
        }
    }

    public long indexOf(byte b, long j) {
        return indexOf(b, j, Long.MAX_VALUE);
    }

    public long indexOfElement(C13346d dVar, long j) {
        int i;
        int i2;
        long j2 = 0;
        if (j >= 0) {
            C13365q qVar = this.f34605e;
            if (qVar == null) {
                return -1;
            }
            long j3 = this.f34606f;
            if (j3 - j >= j) {
                while (true) {
                    j3 = j2;
                    j2 = ((long) (qVar.f34665c - qVar.f34664b)) + j3;
                    if (j2 >= j) {
                        break;
                    }
                    qVar = qVar.f34668f;
                }
            } else {
                while (j3 > j) {
                    qVar = qVar.f34669g;
                    j3 -= (long) (qVar.f34665c - qVar.f34664b);
                }
            }
            if (dVar.mo38528g() == 2) {
                byte a = dVar.mo38513a(0);
                byte a2 = dVar.mo38513a(1);
                while (j3 < this.f34606f) {
                    byte[] bArr = qVar.f34663a;
                    i = (int) ((((long) qVar.f34664b) + j) - j3);
                    int i3 = qVar.f34665c;
                    while (i < i3) {
                        byte b = bArr[i];
                        if (b == a || b == a2) {
                            i2 = qVar.f34664b;
                        } else {
                            i++;
                        }
                    }
                    j = ((long) (qVar.f34665c - qVar.f34664b)) + j3;
                    qVar = qVar.f34668f;
                    j3 = j;
                }
                return -1;
            }
            byte[] c = dVar.mo38522c();
            while (j3 < this.f34606f) {
                byte[] bArr2 = qVar.f34663a;
                int i4 = (int) ((((long) qVar.f34664b) + j) - j3);
                int i5 = qVar.f34665c;
                while (i < i5) {
                    byte b2 = bArr2[i];
                    int length = c.length;
                    int i6 = 0;
                    while (i6 < length) {
                        if (b2 == c[i6]) {
                            i2 = qVar.f34664b;
                        } else {
                            i6++;
                        }
                    }
                    i4 = i + 1;
                }
                j = ((long) (qVar.f34665c - qVar.f34664b)) + j3;
                qVar = qVar.f34668f;
                j3 = j;
            }
            return -1;
            return ((long) (i - i2)) + j3;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    public boolean rangeEquals(long j, C13346d dVar, int i, int i2) {
        if (j < 0 || i < 0 || i2 < 0 || this.f34606f - j < ((long) i2) || dVar.mo38528g() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (mo38482a(((long) i3) + j) != dVar.mo38513a(i + i3)) {
                return false;
            }
        }
        return true;
    }

    public int read(byte[] bArr, int i, int i2) {
        C13370u.m35433a((long) bArr.length, (long) i, (long) i2);
        C13365q qVar = this.f34605e;
        if (qVar == null) {
            return -1;
        }
        int min = Math.min(i2, qVar.f34665c - qVar.f34664b);
        System.arraycopy(qVar.f34663a, qVar.f34664b, bArr, i, min);
        qVar.f34664b += min;
        this.f34606f -= (long) min;
        if (qVar.f34664b == qVar.f34665c) {
            this.f34605e = qVar.mo38574b();
            C13366r.m35401a(qVar);
        }
        return min;
    }

    public C13346d readByteString(long j) throws EOFException {
        return new C13346d(readByteArray(j));
    }

    public String readUtf8LineStrict(long j) throws EOFException {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long indexOf = indexOf(10, 0, j2);
            if (indexOf != -1) {
                return mo38489b(indexOf);
            }
            if (j2 < mo38488b() && mo38482a(j2 - 1) == 13 && mo38482a(j2) == 10) {
                return mo38489b(j2);
            }
            C13342c cVar = new C13342c();
            mo38486a(cVar, 0, Math.min(32, mo38488b()));
            StringBuilder sb = new StringBuilder();
            sb.append("\\n not found: limit=");
            sb.append(Math.min(mo38488b(), j));
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

    public C13342c writeByte(int i) {
        C13365q b = mo38490b(1);
        byte[] bArr = b.f34663a;
        int i2 = b.f34665c;
        b.f34665c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f34606f++;
        return this;
    }

    public C13342c writeDecimalLong(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            writeByte(48);
            return this;
        }
        boolean z = false;
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                writeUtf8("-9223372036854775808");
                return this;
            }
            z = true;
        }
        if (j >= 100000000) {
            i2 = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i2 = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i2 = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i2 = 2;
        }
        if (z) {
            i2++;
        }
        C13365q b = mo38490b(i2);
        byte[] bArr = b.f34663a;
        int i3 = b.f34665c + i2;
        while (j != 0) {
            i3--;
            bArr[i3] = f34604g[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i3 - 1] = 45;
        }
        b.f34665c += i2;
        this.f34606f += (long) i2;
        return this;
    }

    public C13342c writeHexadecimalUnsignedLong(long j) {
        if (j == 0) {
            writeByte(48);
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C13365q b = mo38490b(numberOfTrailingZeros);
        byte[] bArr = b.f34663a;
        int i = b.f34665c;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f34604g[(int) (15 & j)];
            j >>>= 4;
        }
        b.f34665c += numberOfTrailingZeros;
        this.f34606f += (long) numberOfTrailingZeros;
        return this;
    }

    public C13342c writeInt(int i) {
        C13365q b = mo38490b(4);
        byte[] bArr = b.f34663a;
        int i2 = b.f34665c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (i & 255);
        b.f34665c = i6;
        this.f34606f += 4;
        return this;
    }

    public C13342c writeIntLe(int i) {
        writeInt(C13370u.m35430a(i));
        return this;
    }

    public C13342c writeLong(long j) {
        C13365q b = mo38490b(8);
        byte[] bArr = b.f34663a;
        int i = b.f34665c;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) ((j >>> 56) & 255));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) ((j >>> 48) & 255));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) ((j >>> 40) & 255));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) ((j >>> 32) & 255));
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) ((j >>> 24) & 255));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) ((j >>> 16) & 255));
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((int) ((j >>> 8) & 255));
        int i9 = i8 + 1;
        bArr[i8] = (byte) ((int) (j & 255));
        b.f34665c = i9;
        this.f34606f += 8;
        return this;
    }

    public C13342c writeLongLe(long j) {
        writeLong(C13370u.m35431a(j));
        return this;
    }

    public C13342c writeShort(int i) {
        C13365q b = mo38490b(2);
        byte[] bArr = b.f34663a;
        int i2 = b.f34665c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i & 255);
        b.f34665c = i4;
        this.f34606f += 2;
        return this;
    }

    public C13342c writeShortLe(int i) {
        writeShort((int) C13370u.m35432a((short) i));
        return this;
    }

    public C13342c writeUtf8CodePoint(int i) {
        if (i < 128) {
            writeByte(i);
        } else if (i < 2048) {
            writeByte((i >> 6) | 192);
            writeByte((i & 63) | 128);
        } else if (i < 65536) {
            if (i < 55296 || i > 57343) {
                writeByte((i >> 12) | 224);
                writeByte(((i >> 6) & 63) | 128);
                writeByte((i & 63) | 128);
            } else {
                writeByte(63);
            }
        } else if (i <= 1114111) {
            writeByte((i >> 18) | 240);
            writeByte(((i >> 12) & 63) | 128);
            writeByte(((i >> 6) & 63) | 128);
            writeByte((i & 63) | 128);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected code point: ");
            sb.append(Integer.toHexString(i));
            throw new IllegalArgumentException(sb.toString());
        }
        return this;
    }

    public long indexOf(byte b, long j, long j2) {
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.f34606f), Long.valueOf(j), Long.valueOf(j2)}));
        }
        long j4 = this.f34606f;
        if (j2 <= j4) {
            j4 = j2;
        }
        if (j == j4) {
            return -1;
        }
        C13365q qVar = this.f34605e;
        if (qVar == null) {
            return -1;
        }
        long j5 = this.f34606f;
        if (j5 - j >= j) {
            while (true) {
                j5 = j3;
                j3 = ((long) (qVar.f34665c - qVar.f34664b)) + j5;
                if (j3 >= j) {
                    break;
                }
                qVar = qVar.f34668f;
            }
        } else {
            while (j5 > j) {
                qVar = qVar.f34669g;
                j5 -= (long) (qVar.f34665c - qVar.f34664b);
            }
        }
        long j6 = j;
        while (j5 < j4) {
            byte[] bArr = qVar.f34663a;
            int min = (int) Math.min((long) qVar.f34665c, (((long) qVar.f34664b) + j4) - j5);
            for (int i = (int) ((((long) qVar.f34664b) + j6) - j5); i < min; i++) {
                if (bArr[i] == b) {
                    return ((long) (i - qVar.f34664b)) + j5;
                }
            }
            byte b2 = b;
            j6 = ((long) (qVar.f34665c - qVar.f34664b)) + j5;
            qVar = qVar.f34668f;
            j5 = j6;
        }
        return -1;
    }

    public byte[] readByteArray(long j) throws EOFException {
        C13370u.m35433a(this.f34606f, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            readFully(bArr);
            return bArr;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("byteCount > Integer.MAX_VALUE: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    public String readString(long j, Charset charset) throws EOFException {
        C13370u.m35433a(this.f34606f, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount > Integer.MAX_VALUE: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (j == 0) {
            return "";
        } else {
            C13365q qVar = this.f34605e;
            int i = qVar.f34664b;
            if (((long) i) + j > ((long) qVar.f34665c)) {
                return new String(readByteArray(j), charset);
            }
            String str = new String(qVar.f34663a, i, (int) j, charset);
            qVar.f34664b = (int) (((long) qVar.f34664b) + j);
            this.f34606f -= j;
            if (qVar.f34664b == qVar.f34665c) {
                this.f34605e = qVar.mo38574b();
                C13366r.m35401a(qVar);
            }
            return str;
        }
    }

    public String readUtf8(long j) throws EOFException {
        return readString(j, C13370u.f34678a);
    }

    public C13342c writeString(String str, Charset charset) {
        writeString(str, 0, str.length(), charset);
        return this;
    }

    public C13342c writeUtf8(String str) {
        writeUtf8(str, 0, str.length());
        return this;
    }

    public C13342c write(C13346d dVar) {
        if (dVar != null) {
            dVar.mo38517a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    public C13342c writeString(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("beginIndex < 0: ");
            sb.append(i);
            throw new IllegalAccessError(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("endIndex < beginIndex: ");
            sb2.append(i2);
            sb2.append(" < ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i2 > str.length()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("endIndex > string.length: ");
            sb3.append(i2);
            sb3.append(" > ");
            sb3.append(str.length());
            throw new IllegalArgumentException(sb3.toString());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (charset.equals(C13370u.f34678a)) {
            writeUtf8(str, i, i2);
            return this;
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            write(bytes, 0, bytes.length);
            return this;
        }
    }

    public C13342c writeUtf8(String str, int i, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("beginIndex < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("endIndex < beginIndex: ");
            sb2.append(i2);
            sb2.append(" < ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    C13365q b = mo38490b(1);
                    byte[] bArr = b.f34663a;
                    int i3 = b.f34665c - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                    while (i4 < min) {
                        char charAt2 = str.charAt(i4);
                        if (charAt2 >= 128) {
                            break;
                        }
                        int i5 = i4 + 1;
                        bArr[i4 + i3] = (byte) charAt2;
                        i4 = i5;
                    }
                    int i6 = i3 + i4;
                    int i7 = b.f34665c;
                    int i8 = i6 - i7;
                    b.f34665c = i7 + i8;
                    this.f34606f += (long) i8;
                    i = i4;
                } else {
                    if (charAt < 2048) {
                        writeByte((charAt >> 6) | 192);
                        writeByte((int) (charAt & '?') | 128);
                    } else if (charAt < 55296 || charAt > 57343) {
                        writeByte((charAt >> 12) | 224);
                        writeByte(((charAt >> 6) & 63) | 128);
                        writeByte((int) (charAt & '?') | 128);
                    } else {
                        int i9 = i + 1;
                        char charAt3 = i9 < i2 ? str.charAt(i9) : 0;
                        if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                            writeByte(63);
                            i = i9;
                        } else {
                            int i10 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 0;
                            writeByte((i10 >> 18) | 240);
                            writeByte(((i10 >> 12) & 63) | 128);
                            writeByte(((i10 >> 6) & 63) | 128);
                            writeByte((i10 & 63) | 128);
                            i += 2;
                        }
                    }
                    i++;
                }
            }
            return this;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("endIndex > string.length: ");
            sb3.append(i2);
            sb3.append(" > ");
            sb3.append(str.length());
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    public void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    public C13342c write(byte[] bArr) {
        if (bArr != null) {
            write(bArr, 0, bArr.length);
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C13365q mo38490b(int i) {
        C13365q qVar;
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        C13365q qVar2 = this.f34605e;
        if (qVar2 == null) {
            this.f34605e = C13366r.m35400a();
            C13365q qVar3 = this.f34605e;
            qVar3.f34669g = qVar3;
            qVar3.f34668f = qVar3;
            return qVar3;
        }
        C13365q qVar4 = qVar2.f34669g;
        if (qVar4.f34665c + i > 8192 || !qVar4.f34667e) {
            qVar = C13366r.m35400a();
            qVar4.mo38571a(qVar);
        } else {
            qVar = qVar4;
        }
        return qVar;
    }

    public C13342c write(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            C13370u.m35433a((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                C13365q b = mo38490b(1);
                int min = Math.min(i3 - i, 8192 - b.f34665c);
                System.arraycopy(bArr, i, b.f34663a, b.f34665c, min);
                i += min;
                b.f34665c += min;
            }
            this.f34606f += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        C13365q qVar = this.f34605e;
        if (qVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), qVar.f34665c - qVar.f34664b);
        byteBuffer.put(qVar.f34663a, qVar.f34664b, min);
        qVar.f34664b += min;
        this.f34606f -= (long) min;
        if (qVar.f34664b == qVar.f34665c) {
            this.f34605e = qVar.mo38574b();
            C13366r.m35401a(qVar);
        }
        return min;
    }

    /* renamed from: a */
    public final long mo38484a() {
        long j = this.f34606f;
        if (j == 0) {
            return 0;
        }
        C13365q qVar = this.f34605e.f34669g;
        int i = qVar.f34665c;
        if (i < 8192 && qVar.f34667e) {
            j -= (long) (i - qVar.f34664b);
        }
        return j;
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                C13365q b = mo38490b(1);
                int min = Math.min(i, 8192 - b.f34665c);
                byteBuffer.get(b.f34663a, b.f34665c, min);
                i -= min;
                b.f34665c += min;
            }
            this.f34606f += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: a */
    public final byte mo38482a(long j) {
        int i;
        C13370u.m35433a(this.f34606f, j, 1);
        long j2 = this.f34606f;
        if (j2 - j > j) {
            C13365q qVar = this.f34605e;
            while (true) {
                int i2 = qVar.f34665c;
                int i3 = qVar.f34664b;
                long j3 = (long) (i2 - i3);
                if (j < j3) {
                    return qVar.f34663a[i3 + ((int) j)];
                }
                j -= j3;
                qVar = qVar.f34668f;
            }
        } else {
            long j4 = j - j2;
            C13365q qVar2 = this.f34605e;
            do {
                qVar2 = qVar2.f34669g;
                int i4 = qVar2.f34665c;
                i = qVar2.f34664b;
                j4 += (long) (i4 - i);
            } while (j4 < 0);
            return qVar2.f34663a[i + ((int) j4)];
        }
    }

    public long indexOf(C13346d dVar) throws IOException {
        return indexOf(dVar, 0);
    }

    public long read(C13342c cVar, long j) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j >= 0) {
            long j2 = this.f34606f;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            cVar.write(this, j);
            return j;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public long indexOf(C13346d dVar, long j) throws IOException {
        byte[] bArr;
        C13365q qVar;
        if (dVar.mo38528g() != 0) {
            long j2 = 0;
            if (j >= 0) {
                C13365q qVar2 = this.f34605e;
                long j3 = -1;
                if (qVar2 == null) {
                    return -1;
                }
                long j4 = this.f34606f;
                if (j4 - j >= j) {
                    while (true) {
                        j4 = j2;
                        j2 = ((long) (qVar2.f34665c - qVar2.f34664b)) + j4;
                        if (j2 >= j) {
                            break;
                        }
                        qVar2 = qVar2.f34668f;
                    }
                } else {
                    while (j4 > j) {
                        qVar2 = qVar2.f34669g;
                        j4 -= (long) (qVar2.f34665c - qVar2.f34664b);
                    }
                }
                byte a = dVar.mo38513a(0);
                int g = dVar.mo38528g();
                long j5 = 1 + (this.f34606f - ((long) g));
                long j6 = j;
                C13365q qVar3 = qVar2;
                long j7 = j4;
                while (j7 < j5) {
                    byte[] bArr2 = qVar3.f34663a;
                    int min = (int) Math.min((long) qVar3.f34665c, (((long) qVar3.f34664b) + j5) - j7);
                    int i = (int) ((((long) qVar3.f34664b) + j6) - j7);
                    while (i < min) {
                        if (bArr2[i] == a) {
                            bArr = bArr2;
                            qVar = qVar3;
                            if (m35314a(qVar3, i + 1, dVar, 1, g)) {
                                return ((long) (i - qVar.f34664b)) + j7;
                            }
                        } else {
                            bArr = bArr2;
                            qVar = qVar3;
                        }
                        i++;
                        qVar3 = qVar;
                        bArr2 = bArr;
                    }
                    C13365q qVar4 = qVar3;
                    j6 = ((long) (qVar4.f34665c - qVar4.f34664b)) + j7;
                    qVar3 = qVar4.f34668f;
                    j3 = -1;
                    j7 = j6;
                }
                return j3;
            }
            throw new IllegalArgumentException("fromIndex < 0");
        }
        throw new IllegalArgumentException("bytes is empty");
    }

    public BufferedSink write(Source source, long j) throws IOException {
        while (j > 0) {
            long read = source.read(this, j);
            if (read != -1) {
                j -= read;
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    public void write(C13342c cVar, long j) {
        int i;
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (cVar != this) {
            C13370u.m35433a(cVar.f34606f, 0, j);
            while (j > 0) {
                C13365q qVar = cVar.f34605e;
                if (j < ((long) (qVar.f34665c - qVar.f34664b))) {
                    C13365q qVar2 = this.f34605e;
                    C13365q qVar3 = qVar2 != null ? qVar2.f34669g : null;
                    if (qVar3 != null && qVar3.f34667e) {
                        long j2 = ((long) qVar3.f34665c) + j;
                        if (qVar3.f34666d) {
                            i = 0;
                        } else {
                            i = qVar3.f34664b;
                        }
                        if (j2 - ((long) i) <= 8192) {
                            cVar.f34605e.mo38573a(qVar3, (int) j);
                            cVar.f34606f -= j;
                            this.f34606f += j;
                            return;
                        }
                    }
                    cVar.f34605e = cVar.f34605e.mo38570a((int) j);
                }
                C13365q qVar4 = cVar.f34605e;
                long j3 = (long) (qVar4.f34665c - qVar4.f34664b);
                cVar.f34605e = qVar4.mo38574b();
                C13365q qVar5 = this.f34605e;
                if (qVar5 == null) {
                    this.f34605e = qVar4;
                    C13365q qVar6 = this.f34605e;
                    qVar6.f34669g = qVar6;
                    qVar6.f34668f = qVar6;
                } else {
                    qVar5.f34669g.mo38571a(qVar4);
                    qVar4.mo38572a();
                }
                cVar.f34606f -= j3;
                this.f34606f += j3;
                j -= j3;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo38483a(C13359m mVar, boolean z) {
        int i;
        int i2;
        C13359m mVar2 = mVar;
        C13365q qVar = this.f34605e;
        int i3 = -2;
        if (qVar != null) {
            byte[] bArr = qVar.f34663a;
            int i4 = qVar.f34664b;
            int i5 = qVar.f34665c;
            int[] iArr = mVar2.f34648f;
            int i6 = i4;
            int i7 = i5;
            int i8 = -1;
            C13365q qVar2 = qVar;
            byte[] bArr2 = bArr;
            int i9 = 0;
            loop0:
            while (true) {
                int i10 = i9 + 1;
                int i11 = iArr[i9];
                int i12 = i10 + 1;
                int i13 = iArr[i10];
                if (i13 != -1) {
                    i8 = i13;
                }
                if (qVar2 == null) {
                    break;
                }
                if (i11 < 0) {
                    int i14 = i12 + (i11 * -1);
                    while (true) {
                        i2 = i6 + 1;
                        int i15 = i12 + 1;
                        if ((bArr2[i6] & 255) != iArr[i12]) {
                            return i8;
                        }
                        boolean z2 = i15 == i14;
                        if (i2 == i7) {
                            C13365q qVar3 = qVar2.f34668f;
                            int i16 = qVar3.f34664b;
                            bArr2 = qVar3.f34663a;
                            i7 = qVar3.f34665c;
                            if (qVar3 != qVar) {
                                int i17 = i16;
                                qVar2 = qVar3;
                                i2 = i17;
                            } else if (!z2) {
                                break loop0;
                            } else {
                                i2 = i16;
                                qVar2 = null;
                            }
                        }
                        if (z2) {
                            i = iArr[i15];
                            break;
                        }
                        i6 = i2;
                        i12 = i15;
                    }
                } else {
                    int i18 = i6 + 1;
                    byte b = bArr2[i6] & 255;
                    int i19 = i12 + i11;
                    while (i12 != i19) {
                        if (b == iArr[i12]) {
                            i = iArr[i12 + i11];
                            if (i18 == i7) {
                                C13365q qVar4 = qVar2.f34668f;
                                i2 = qVar4.f34664b;
                                byte[] bArr3 = qVar4.f34663a;
                                i7 = qVar4.f34665c;
                                bArr2 = bArr3;
                                qVar2 = qVar4 == qVar ? null : qVar4;
                            } else {
                                i2 = i18;
                            }
                        } else {
                            i12++;
                        }
                    }
                    return i8;
                }
                if (i >= 0) {
                    return i;
                }
                int i20 = -i;
                i6 = i2;
                i9 = i20;
                i3 = -2;
            }
            return z ? i3 : i8;
        } else if (z) {
            return -2;
        } else {
            return mVar2.indexOf(C13346d.f34617i);
        }
    }

    /* renamed from: a */
    private boolean m35314a(C13365q qVar, int i, C13346d dVar, int i2, int i3) {
        int i4 = qVar.f34665c;
        byte[] bArr = qVar.f34663a;
        while (i2 < i3) {
            if (i == i4) {
                qVar = qVar.f34668f;
                byte[] bArr2 = qVar.f34663a;
                int i5 = qVar.f34664b;
                bArr = bArr2;
                i = i5;
                i4 = qVar.f34665c;
            }
            if (bArr[i] != dVar.mo38513a(i2)) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    /* renamed from: a */
    public final C13346d mo38487a(int i) {
        if (i == 0) {
            return C13346d.f34617i;
        }
        return new C13367s(this, i);
    }

    /* renamed from: a */
    public final C13345c mo38485a(C13345c cVar) {
        if (cVar.f34609e == null) {
            cVar.f34609e = this;
            cVar.f34610f = true;
            return cVar;
        }
        throw new IllegalStateException("already attached to a buffer");
    }
}
