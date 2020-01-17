package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bumptech.glide.load.resource.bitmap.u */
public class C9137u extends FilterInputStream {

    /* renamed from: e */
    private volatile byte[] f23720e;

    /* renamed from: f */
    private int f23721f;

    /* renamed from: g */
    private int f23722g;

    /* renamed from: h */
    private int f23723h;

    /* renamed from: i */
    private int f23724i;

    /* renamed from: j */
    private final ArrayPool f23725j;

    /* renamed from: com.bumptech.glide.load.resource.bitmap.u$a */
    static class C9138a extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        C9138a(String str) {
            super(str);
        }
    }

    public C9137u(InputStream inputStream, ArrayPool arrayPool) {
        this(inputStream, arrayPool, 65536);
    }

    /* renamed from: b */
    private static IOException m21876b() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    /* renamed from: a */
    public synchronized void mo24645a() {
        this.f23722g = this.f23720e.length;
    }

    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = this.in;
        if (this.f23720e == null || inputStream == null) {
            m21876b();
            throw null;
        }
        return (this.f23721f - this.f23724i) + inputStream.available();
    }

    public void close() throws IOException {
        if (this.f23720e != null) {
            this.f23725j.put(this.f23720e);
            this.f23720e = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public synchronized void mark(int i) {
        this.f23722g = Math.max(this.f23722g, i);
        this.f23723h = this.f23724i;
    }

    public boolean markSupported() {
        return true;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0026=Splitter:B:19:0x0026, B:11:0x0019=Splitter:B:11:0x0019, B:28:0x003b=Splitter:B:28:0x003b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read() throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f23720e     // Catch:{ all -> 0x003f }
            java.io.InputStream r1 = r6.in     // Catch:{ all -> 0x003f }
            r2 = 0
            if (r0 == 0) goto L_0x003b
            if (r1 == 0) goto L_0x003b
            int r3 = r6.f23724i     // Catch:{ all -> 0x003f }
            int r4 = r6.f23721f     // Catch:{ all -> 0x003f }
            r5 = -1
            if (r3 < r4) goto L_0x0019
            int r1 = r6.m21875a(r1, r0)     // Catch:{ all -> 0x003f }
            if (r1 != r5) goto L_0x0019
            monitor-exit(r6)
            return r5
        L_0x0019:
            byte[] r1 = r6.f23720e     // Catch:{ all -> 0x003f }
            if (r0 == r1) goto L_0x0026
            byte[] r0 = r6.f23720e     // Catch:{ all -> 0x003f }
            if (r0 == 0) goto L_0x0022
            goto L_0x0026
        L_0x0022:
            m21876b()     // Catch:{ all -> 0x003f }
            throw r2
        L_0x0026:
            int r1 = r6.f23721f     // Catch:{ all -> 0x003f }
            int r2 = r6.f23724i     // Catch:{ all -> 0x003f }
            int r1 = r1 - r2
            if (r1 <= 0) goto L_0x0039
            int r1 = r6.f23724i     // Catch:{ all -> 0x003f }
            int r2 = r1 + 1
            r6.f23724i = r2     // Catch:{ all -> 0x003f }
            byte r0 = r0[r1]     // Catch:{ all -> 0x003f }
            r0 = r0 & 255(0xff, float:3.57E-43)
            monitor-exit(r6)
            return r0
        L_0x0039:
            monitor-exit(r6)
            return r5
        L_0x003b:
            m21876b()     // Catch:{ all -> 0x003f }
            throw r2
        L_0x003f:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C9137u.read():int");
    }

    public synchronized void release() {
        if (this.f23720e != null) {
            this.f23725j.put(this.f23720e);
            this.f23720e = null;
        }
    }

    public synchronized void reset() throws IOException {
        if (this.f23720e == null) {
            throw new IOException("Stream is closed");
        } else if (-1 != this.f23723h) {
            this.f23724i = this.f23723h;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Mark has been invalidated, pos: ");
            sb.append(this.f23724i);
            sb.append(" markLimit: ");
            sb.append(this.f23722g);
            throw new C9138a(sb.toString());
        }
    }

    public synchronized long skip(long j) throws IOException {
        if (j < 1) {
            return 0;
        }
        byte[] bArr = this.f23720e;
        if (bArr != null) {
            InputStream inputStream = this.in;
            if (inputStream == null) {
                m21876b();
                throw null;
            } else if (((long) (this.f23721f - this.f23724i)) >= j) {
                this.f23724i = (int) (((long) this.f23724i) + j);
                return j;
            } else {
                long j2 = ((long) this.f23721f) - ((long) this.f23724i);
                this.f23724i = this.f23721f;
                if (this.f23723h == -1 || j > ((long) this.f23722g)) {
                    return j2 + inputStream.skip(j - j2);
                } else if (m21875a(inputStream, bArr) == -1) {
                    return j2;
                } else {
                    if (((long) (this.f23721f - this.f23724i)) >= j - j2) {
                        this.f23724i = (int) ((((long) this.f23724i) + j) - j2);
                        return j;
                    }
                    long j3 = (j2 + ((long) this.f23721f)) - ((long) this.f23724i);
                    this.f23724i = this.f23721f;
                    return j3;
                }
            }
        } else {
            m21876b();
            throw null;
        }
    }

    C9137u(InputStream inputStream, ArrayPool arrayPool, int i) {
        super(inputStream);
        this.f23723h = -1;
        this.f23725j = arrayPool;
        this.f23720e = (byte[]) arrayPool.get(i, byte[].class);
    }

    /* renamed from: a */
    private int m21875a(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f23723h;
        if (i != -1) {
            int i2 = this.f23724i - i;
            int i3 = this.f23722g;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.f23721f == bArr.length) {
                    int length = bArr.length * 2;
                    if (length > i3) {
                        length = i3;
                    }
                    byte[] bArr2 = (byte[]) this.f23725j.get(length, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f23720e = bArr2;
                    this.f23725j.put(bArr);
                    bArr = bArr2;
                } else {
                    int i4 = this.f23723h;
                    if (i4 > 0) {
                        System.arraycopy(bArr, i4, bArr, 0, bArr.length - i4);
                    }
                }
                this.f23724i -= this.f23723h;
                this.f23723h = 0;
                this.f23721f = 0;
                int i5 = this.f23724i;
                int read = inputStream.read(bArr, i5, bArr.length - i5);
                int i6 = this.f23724i;
                if (read > 0) {
                    i6 += read;
                }
                this.f23721f = i6;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.f23723h = -1;
            this.f23724i = 0;
            this.f23721f = read2;
        }
        return read2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0051, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x005e, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized int read(byte[] r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.f23720e     // Catch:{ all -> 0x009c }
            r1 = 0
            if (r0 == 0) goto L_0x0098
            if (r9 != 0) goto L_0x000b
            r7 = 0
            monitor-exit(r6)
            return r7
        L_0x000b:
            java.io.InputStream r2 = r6.in     // Catch:{ all -> 0x009c }
            if (r2 == 0) goto L_0x0094
            int r3 = r6.f23724i     // Catch:{ all -> 0x009c }
            int r4 = r6.f23721f     // Catch:{ all -> 0x009c }
            if (r3 >= r4) goto L_0x003c
            int r3 = r6.f23721f     // Catch:{ all -> 0x009c }
            int r4 = r6.f23724i     // Catch:{ all -> 0x009c }
            int r3 = r3 - r4
            if (r3 < r9) goto L_0x001e
            r3 = r9
            goto L_0x0023
        L_0x001e:
            int r3 = r6.f23721f     // Catch:{ all -> 0x009c }
            int r4 = r6.f23724i     // Catch:{ all -> 0x009c }
            int r3 = r3 - r4
        L_0x0023:
            int r4 = r6.f23724i     // Catch:{ all -> 0x009c }
            java.lang.System.arraycopy(r0, r4, r7, r8, r3)     // Catch:{ all -> 0x009c }
            int r4 = r6.f23724i     // Catch:{ all -> 0x009c }
            int r4 = r4 + r3
            r6.f23724i = r4     // Catch:{ all -> 0x009c }
            if (r3 == r9) goto L_0x003a
            int r4 = r2.available()     // Catch:{ all -> 0x009c }
            if (r4 != 0) goto L_0x0036
            goto L_0x003a
        L_0x0036:
            int r8 = r8 + r3
            int r3 = r9 - r3
            goto L_0x003d
        L_0x003a:
            monitor-exit(r6)
            return r3
        L_0x003c:
            r3 = r9
        L_0x003d:
            int r4 = r6.f23723h     // Catch:{ all -> 0x009c }
            r5 = -1
            if (r4 != r5) goto L_0x0052
            int r4 = r0.length     // Catch:{ all -> 0x009c }
            if (r3 < r4) goto L_0x0052
            int r4 = r2.read(r7, r8, r3)     // Catch:{ all -> 0x009c }
            if (r4 != r5) goto L_0x0084
            if (r3 != r9) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            int r5 = r9 - r3
        L_0x0050:
            monitor-exit(r6)
            return r5
        L_0x0052:
            int r4 = r6.m21875a(r2, r0)     // Catch:{ all -> 0x009c }
            if (r4 != r5) goto L_0x005f
            if (r3 != r9) goto L_0x005b
            goto L_0x005d
        L_0x005b:
            int r5 = r9 - r3
        L_0x005d:
            monitor-exit(r6)
            return r5
        L_0x005f:
            byte[] r4 = r6.f23720e     // Catch:{ all -> 0x009c }
            if (r0 == r4) goto L_0x006c
            byte[] r0 = r6.f23720e     // Catch:{ all -> 0x009c }
            if (r0 == 0) goto L_0x0068
            goto L_0x006c
        L_0x0068:
            m21876b()     // Catch:{ all -> 0x009c }
            throw r1
        L_0x006c:
            int r4 = r6.f23721f     // Catch:{ all -> 0x009c }
            int r5 = r6.f23724i     // Catch:{ all -> 0x009c }
            int r4 = r4 - r5
            if (r4 < r3) goto L_0x0075
            r4 = r3
            goto L_0x007a
        L_0x0075:
            int r4 = r6.f23721f     // Catch:{ all -> 0x009c }
            int r5 = r6.f23724i     // Catch:{ all -> 0x009c }
            int r4 = r4 - r5
        L_0x007a:
            int r5 = r6.f23724i     // Catch:{ all -> 0x009c }
            java.lang.System.arraycopy(r0, r5, r7, r8, r4)     // Catch:{ all -> 0x009c }
            int r5 = r6.f23724i     // Catch:{ all -> 0x009c }
            int r5 = r5 + r4
            r6.f23724i = r5     // Catch:{ all -> 0x009c }
        L_0x0084:
            int r3 = r3 - r4
            if (r3 != 0) goto L_0x0089
            monitor-exit(r6)
            return r9
        L_0x0089:
            int r5 = r2.available()     // Catch:{ all -> 0x009c }
            if (r5 != 0) goto L_0x0092
            int r9 = r9 - r3
            monitor-exit(r6)
            return r9
        L_0x0092:
            int r8 = r8 + r4
            goto L_0x003d
        L_0x0094:
            m21876b()     // Catch:{ all -> 0x009c }
            throw r1
        L_0x0098:
            m21876b()     // Catch:{ all -> 0x009c }
            throw r1
        L_0x009c:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C9137u.read(byte[], int, int):int");
    }
}
