package com.bumptech.glide.p301o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.bumptech.glide.o.a */
public final class C9203a {

    /* renamed from: a */
    private static final AtomicReference<byte[]> f23863a = new AtomicReference<>();

    /* renamed from: com.bumptech.glide.o.a$a */
    private static class C9204a extends InputStream {

        /* renamed from: e */
        private final ByteBuffer f23864e;

        /* renamed from: f */
        private int f23865f = -1;

        C9204a(ByteBuffer byteBuffer) {
            this.f23864e = byteBuffer;
        }

        public int available() {
            return this.f23864e.remaining();
        }

        public synchronized void mark(int i) {
            this.f23865f = this.f23864e.position();
        }

        public boolean markSupported() {
            return true;
        }

        public int read() {
            if (!this.f23864e.hasRemaining()) {
                return -1;
            }
            return this.f23864e.get() & 255;
        }

        public synchronized void reset() throws IOException {
            if (this.f23865f != -1) {
                this.f23864e.position(this.f23865f);
            } else {
                throw new IOException("Cannot reset to unset mark position");
            }
        }

        public long skip(long j) throws IOException {
            if (!this.f23864e.hasRemaining()) {
                return -1;
            }
            long min = Math.min(j, (long) available());
            ByteBuffer byteBuffer = this.f23864e;
            byteBuffer.position((int) (((long) byteBuffer.position()) + min));
            return min;
        }

        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (!this.f23864e.hasRemaining()) {
                return -1;
            }
            int min = Math.min(i2, available());
            this.f23864e.get(bArr, i, min);
            return min;
        }
    }

    /* renamed from: com.bumptech.glide.o.a$b */
    static final class C9205b {

        /* renamed from: a */
        final int f23866a;

        /* renamed from: b */
        final int f23867b;

        /* renamed from: c */
        final byte[] f23868c;

        C9205b(byte[] bArr, int i, int i2) {
            this.f23868c = bArr;
            this.f23866a = i;
            this.f23867b = i2;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|(2:12|13)|14|15|16) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x002f */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004e A[SYNTHETIC, Splitter:B:29:0x004e] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0055 A[SYNTHETIC, Splitter:B:33:0x0055] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer m22056a(java.io.File r9) throws java.io.IOException {
        /*
            r0 = 0
            long r5 = r9.length()     // Catch:{ all -> 0x004a }
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 > 0) goto L_0x0042
            r1 = 0
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x003a
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ all -> 0x004a }
            java.lang.String r1 = "r"
            r7.<init>(r9, r1)     // Catch:{ all -> 0x004a }
            java.nio.channels.FileChannel r9 = r7.getChannel()     // Catch:{ all -> 0x0038 }
            java.nio.channels.FileChannel$MapMode r2 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0033 }
            r3 = 0
            r1 = r9
            java.nio.MappedByteBuffer r0 = r1.map(r2, r3, r5)     // Catch:{ all -> 0x0033 }
            java.nio.MappedByteBuffer r0 = r0.load()     // Catch:{ all -> 0x0033 }
            if (r9 == 0) goto L_0x002f
            r9.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            r7.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            return r0
        L_0x0033:
            r0 = move-exception
            r8 = r0
            r0 = r9
            r9 = r8
            goto L_0x004c
        L_0x0038:
            r9 = move-exception
            goto L_0x004c
        L_0x003a:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x004a }
            java.lang.String r1 = "File unsuitable for memory mapping"
            r9.<init>(r1)     // Catch:{ all -> 0x004a }
            throw r9     // Catch:{ all -> 0x004a }
        L_0x0042:
            java.io.IOException r9 = new java.io.IOException     // Catch:{ all -> 0x004a }
            java.lang.String r1 = "File too large to map into memory"
            r9.<init>(r1)     // Catch:{ all -> 0x004a }
            throw r9     // Catch:{ all -> 0x004a }
        L_0x004a:
            r9 = move-exception
            r7 = r0
        L_0x004c:
            if (r0 == 0) goto L_0x0053
            r0.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0053
        L_0x0052:
        L_0x0053:
            if (r7 == 0) goto L_0x0058
            r7.close()     // Catch:{ IOException -> 0x0058 }
        L_0x0058:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p301o.C9203a.m22056a(java.io.File):java.nio.ByteBuffer");
    }

    /* renamed from: b */
    public static byte[] m22059b(ByteBuffer byteBuffer) {
        C9205b a = m22055a(byteBuffer);
        if (a != null && a.f23866a == 0 && a.f23867b == a.f23868c.length) {
            return byteBuffer.array();
        }
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        byte[] bArr = new byte[asReadOnlyBuffer.limit()];
        asReadOnlyBuffer.position(0);
        asReadOnlyBuffer.get(bArr);
        return bArr;
    }

    /* renamed from: c */
    public static InputStream m22060c(ByteBuffer byteBuffer) {
        return new C9204a(byteBuffer);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|(2:6|7)|8|9|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b A[SYNTHETIC, Splitter:B:15:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0032 A[SYNTHETIC, Splitter:B:19:0x0032] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m22058a(java.nio.ByteBuffer r4, java.io.File r5) throws java.io.IOException {
        /*
            r0 = 0
            r4.position(r0)
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0027 }
            java.lang.String r3 = "rw"
            r2.<init>(r5, r3)     // Catch:{ all -> 0x0027 }
            java.nio.channels.FileChannel r1 = r2.getChannel()     // Catch:{ all -> 0x0025 }
            r1.write(r4)     // Catch:{ all -> 0x0025 }
            r1.force(r0)     // Catch:{ all -> 0x0025 }
            r1.close()     // Catch:{ all -> 0x0025 }
            r2.close()     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0021
            r1.close()     // Catch:{ IOException -> 0x0021 }
        L_0x0021:
            r2.close()     // Catch:{ IOException -> 0x0024 }
        L_0x0024:
            return
        L_0x0025:
            r4 = move-exception
            goto L_0x0029
        L_0x0027:
            r4 = move-exception
            r2 = r1
        L_0x0029:
            if (r1 == 0) goto L_0x0030
            r1.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0030
        L_0x002f:
        L_0x0030:
            if (r2 == 0) goto L_0x0035
            r2.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p301o.C9203a.m22058a(java.nio.ByteBuffer, java.io.File):void");
    }

    /* renamed from: a */
    public static ByteBuffer m22057a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] bArr = (byte[]) f23863a.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[16384];
        }
        while (true) {
            int read = inputStream.read(bArr);
            if (read >= 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                f23863a.set(bArr);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                return (ByteBuffer) ByteBuffer.allocateDirect(byteArray.length).put(byteArray).position(0);
            }
        }
    }

    /* renamed from: a */
    private static C9205b m22055a(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly() || !byteBuffer.hasArray()) {
            return null;
        }
        return new C9205b(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
    }
}
