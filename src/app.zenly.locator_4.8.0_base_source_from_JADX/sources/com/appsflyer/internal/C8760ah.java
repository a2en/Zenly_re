package com.appsflyer.internal;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.appsflyer.internal.ah */
public final class C8760ah extends FilterInputStream {

    /* renamed from: ˊ */
    private static final int[] f22650 = C8761ai.f22670;

    /* renamed from: ˋ */
    private static final int[] f22651 = C8761ai.f22668;

    /* renamed from: ˎ */
    private static final byte[] f22652 = C8761ai.f22669;

    /* renamed from: ˏ */
    private static final int[] f22653 = C8761ai.f22667;

    /* renamed from: ॱ */
    private static final int[] f22654 = C8761ai.f22666;

    /* renamed from: ʻ */
    private final int f22655;

    /* renamed from: ʼ */
    private final byte[][] f22656;

    /* renamed from: ʽ */
    private final byte[] f22657 = new byte[16];

    /* renamed from: ˊॱ */
    private int f22658 = 16;

    /* renamed from: ˋॱ */
    private final byte[] f22659 = new byte[16];

    /* renamed from: ˏॱ */
    private int f22660 = 16;

    /* renamed from: ͺ */
    private int f22661 = Integer.MAX_VALUE;

    /* renamed from: ॱॱ */
    private final int[] f22662 = new int[4];

    /* renamed from: ᐝ */
    private final int[] f22663;

    public C8760ah(InputStream inputStream, int i, byte[] bArr, byte[][] bArr2) {
        super(inputStream);
        this.f22655 = i;
        this.f22663 = C8761ai.m20704(bArr, i);
        this.f22656 = m20701(bArr2);
    }

    /* renamed from: ˏ */
    private static byte[][] m20701(byte[][] bArr) {
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = new byte[bArr[i].length];
            for (int i2 = 0; i2 < bArr[i].length; i2++) {
                bArr2[i][bArr[i][i2]] = (byte) i2;
            }
        }
        return bArr2;
    }

    /* renamed from: ॱ */
    private void m20702(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.f22662;
        char c = 1;
        byte b = (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.f22663;
        iArr[0] = b ^ iArr2[0];
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((((bArr[8] << 24) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8)) | (bArr[11] & 255)) ^ iArr2[2];
        iArr[3] = iArr2[3] ^ ((((bArr[12] << 24) | ((bArr[13] & 255) << 16)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255));
        int i = 1;
        int i2 = 4;
        while (i < this.f22655) {
            int[] iArr3 = f22653;
            int[] iArr4 = this.f22662;
            byte[][] bArr3 = this.f22656;
            int i3 = iArr3[iArr4[bArr3[0][0]] >>> 24];
            int[] iArr5 = f22651;
            int i4 = i3 ^ iArr5[(iArr4[bArr3[c][0]] >>> 16) & 255];
            int[] iArr6 = f22654;
            int i5 = iArr6[(iArr4[bArr3[2][0]] >>> 8) & 255] ^ i4;
            int[] iArr7 = f22650;
            int i6 = iArr7[iArr4[bArr3[3][0]] & 255] ^ i5;
            int[] iArr8 = this.f22663;
            int i7 = i6 ^ iArr8[i2];
            int i8 = ((iArr6[(iArr4[bArr3[2][c]] >>> 8) & 255] ^ (iArr3[iArr4[bArr3[0][c]] >>> 24] ^ iArr5[(iArr4[bArr3[c][c]] >>> 16) & 255])) ^ iArr7[iArr4[bArr3[3][c]] & 255]) ^ iArr8[i2 + 1];
            int i9 = (((iArr5[(iArr4[bArr3[c][2]] >>> 16) & 255] ^ iArr3[iArr4[bArr3[0][2]] >>> 24]) ^ iArr6[(iArr4[bArr3[2][2]] >>> 8) & 255]) ^ iArr7[iArr4[bArr3[3][2]] & 255]) ^ iArr8[i2 + 2];
            int i10 = (((iArr3[iArr4[bArr3[0][3]] >>> 24] ^ iArr5[(iArr4[bArr3[1][3]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr3[2][3]] >>> 8) & 255]) ^ iArr7[iArr4[bArr3[3][3]] & 255]) ^ iArr8[i2 + 3];
            iArr4[0] = i7;
            iArr4[1] = i8;
            iArr4[2] = i9;
            iArr4[3] = i10;
            i++;
            i2 += 4;
            c = 1;
        }
        int[] iArr9 = this.f22663;
        int i11 = iArr9[i2];
        byte[] bArr4 = f22652;
        int[] iArr10 = this.f22662;
        byte[][] bArr5 = this.f22656;
        bArr2[0] = (byte) (bArr4[iArr10[bArr5[0][0]] >>> 24] ^ (i11 >>> 24));
        bArr2[1] = (byte) (bArr4[(iArr10[bArr5[1][0]] >>> 16) & 255] ^ (i11 >>> 16));
        bArr2[2] = (byte) (bArr4[(iArr10[bArr5[2][0]] >>> 8) & 255] ^ (i11 >>> 8));
        bArr2[3] = (byte) (i11 ^ bArr4[iArr10[bArr5[3][0]] & 255]);
        int i12 = iArr9[i2 + 1];
        bArr2[4] = (byte) (bArr4[iArr10[bArr5[0][1]] >>> 24] ^ (i12 >>> 24));
        bArr2[5] = (byte) (bArr4[(iArr10[bArr5[1][1]] >>> 16) & 255] ^ (i12 >>> 16));
        bArr2[6] = (byte) (bArr4[(iArr10[bArr5[2][1]] >>> 8) & 255] ^ (i12 >>> 8));
        bArr2[7] = (byte) (i12 ^ bArr4[iArr10[bArr5[3][1]] & 255]);
        int i13 = iArr9[i2 + 2];
        bArr2[8] = (byte) (bArr4[iArr10[bArr5[0][2]] >>> 24] ^ (i13 >>> 24));
        bArr2[9] = (byte) (bArr4[(iArr10[bArr5[1][2]] >>> 16) & 255] ^ (i13 >>> 16));
        bArr2[10] = (byte) (bArr4[(iArr10[bArr5[2][2]] >>> 8) & 255] ^ (i13 >>> 8));
        bArr2[11] = (byte) (i13 ^ bArr4[iArr10[bArr5[3][2]] & 255]);
        int i14 = iArr9[i2 + 3];
        bArr2[12] = (byte) (bArr4[iArr10[bArr5[0][3]] >>> 24] ^ (i14 >>> 24));
        bArr2[13] = (byte) (bArr4[(iArr10[bArr5[1][3]] >>> 16) & 255] ^ (i14 >>> 16));
        bArr2[14] = (byte) (bArr4[(iArr10[bArr5[2][3]] >>> 8) & 255] ^ (i14 >>> 8));
        bArr2[15] = (byte) (i14 ^ bArr4[iArr10[bArr5[3][3]] & 255]);
    }

    public final int available() throws IOException {
        return this.f22658 - this.f22660;
    }

    public final void close() throws IOException {
        super.close();
    }

    public final synchronized void mark(int i) {
    }

    public final boolean markSupported() {
        return false;
    }

    public final int read() throws IOException {
        m20700();
        int i = this.f22660;
        if (i >= this.f22658) {
            return -1;
        }
        byte[] bArr = this.f22659;
        this.f22660 = i + 1;
        return bArr[i] & 255;
    }

    public final synchronized void reset() throws IOException {
    }

    public final long skip(long j) throws IOException {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = i;
        while (i4 < i3) {
            m20700();
            int i5 = this.f22660;
            if (i5 < this.f22658) {
                int i6 = i4 + 1;
                byte[] bArr2 = this.f22659;
                this.f22660 = i5 + 1;
                bArr[i4] = bArr2[i5];
                i4 = i6;
            } else if (i4 == i) {
                return -1;
            } else {
                return i2 - (i3 - i4);
            }
        }
        return i2;
    }

    /* renamed from: ˏ */
    private int m20700() throws IOException {
        if (this.f22661 == Integer.MAX_VALUE) {
            this.f22661 = this.in.read();
        }
        int i = 16;
        if (this.f22660 == 16) {
            this.f22657[0] = (byte) this.f22661;
            int i2 = 1;
            do {
                i2 += this.in.read(this.f22657, i2, 16 - i2);
            } while (i2 < 16);
            m20702(this.f22657, this.f22659);
            this.f22661 = this.in.read();
            this.f22660 = 0;
            if (this.f22661 < 0) {
                i = 16 - (this.f22659[15] & 255);
            }
            this.f22658 = i;
        }
        return this.f22658;
    }
}
