package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

/* renamed from: com.google.android.gms.internal.clearcut.z3 */
public final class C10441z3 {

    /* renamed from: a */
    private final ByteBuffer f27342a;

    /* renamed from: b */
    private zzbn f27343b;

    /* renamed from: c */
    private int f27344c;

    private C10441z3(ByteBuffer byteBuffer) {
        this.f27342a = byteBuffer;
        this.f27342a.order(ByteOrder.LITTLE_ENDIAN);
    }

    private C10441z3(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    /* renamed from: a */
    private static int m26630a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        long j = ((long) i3) + 4294967296L;
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: a */
    public static int m26631a(String str) {
        int a = m26630a((CharSequence) str);
        return m26646e(a) + a;
    }

    /* renamed from: a */
    public static C10441z3 m26632a(byte[] bArr) {
        return m26633a(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static C10441z3 m26633a(byte[] bArr, int i, int i2) {
        return new C10441z3(bArr, 0, i2);
    }

    /* renamed from: a */
    private final void m26634a(int i) throws IOException {
        byte b = (byte) i;
        if (this.f27342a.hasRemaining()) {
            this.f27342a.put(b);
            return;
        }
        throw new zzft(this.f27342a.position(), this.f27342a.limit());
    }

    /* renamed from: a */
    private static void m26635a(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int i2;
        int i3;
        if (!byteBuffer.isReadOnly()) {
            String str = "Unpaired surrogate at index ";
            int i4 = 0;
            if (byteBuffer.hasArray()) {
                try {
                    byte[] array = byteBuffer.array();
                    int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    int remaining = byteBuffer.remaining();
                    int length = charSequence.length();
                    int i5 = remaining + arrayOffset;
                    while (i4 < length) {
                        int i6 = i4 + arrayOffset;
                        if (i6 >= i5) {
                            break;
                        }
                        char charAt = charSequence.charAt(i4);
                        if (charAt >= 128) {
                            break;
                        }
                        array[i6] = (byte) charAt;
                        i4++;
                    }
                    if (i4 == length) {
                        i2 = arrayOffset + length;
                    } else {
                        i2 = arrayOffset + i4;
                        while (i4 < length) {
                            char charAt2 = charSequence.charAt(i4);
                            if (charAt2 < 128 && i2 < i5) {
                                i3 = i2 + 1;
                                array[i2] = (byte) charAt2;
                            } else if (charAt2 < 2048 && i2 <= i5 - 2) {
                                int i7 = i2 + 1;
                                array[i2] = (byte) ((charAt2 >>> 6) | 960);
                                i2 = i7 + 1;
                                array[i7] = (byte) ((charAt2 & '?') | 128);
                                i4++;
                            } else if ((charAt2 < 55296 || 57343 < charAt2) && i2 <= i5 - 3) {
                                int i8 = i2 + 1;
                                array[i2] = (byte) ((charAt2 >>> 12) | 480);
                                int i9 = i8 + 1;
                                array[i8] = (byte) (((charAt2 >>> 6) & 63) | 128);
                                i3 = i9 + 1;
                                array[i9] = (byte) ((charAt2 & '?') | 128);
                            } else if (i2 <= i5 - 4) {
                                int i10 = i4 + 1;
                                if (i10 != charSequence.length()) {
                                    char charAt3 = charSequence.charAt(i10);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        int i11 = i2 + 1;
                                        array[i2] = (byte) ((codePoint >>> 18) | 240);
                                        int i12 = i11 + 1;
                                        array[i11] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i13 = i12 + 1;
                                        array[i12] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i2 = i13 + 1;
                                        array[i13] = (byte) ((codePoint & 63) | 128);
                                        i4 = i10;
                                        i4++;
                                    } else {
                                        i4 = i10;
                                    }
                                }
                                int i14 = i4 - 1;
                                StringBuilder sb = new StringBuilder(39);
                                sb.append(str);
                                sb.append(i14);
                                throw new IllegalArgumentException(sb.toString());
                            } else {
                                StringBuilder sb2 = new StringBuilder(37);
                                sb2.append("Failed writing ");
                                sb2.append(charAt2);
                                sb2.append(" at index ");
                                sb2.append(i2);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            }
                            i2 = i3;
                            i4++;
                        }
                    }
                    byteBuffer.position(i2 - byteBuffer.arrayOffset());
                } catch (ArrayIndexOutOfBoundsException e) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e);
                    throw bufferOverflowException;
                }
            } else {
                int length2 = charSequence.length();
                while (i4 < length2) {
                    char charAt4 = charSequence.charAt(i4);
                    if (charAt4 >= 128) {
                        if (charAt4 < 2048) {
                            i = (charAt4 >>> 6) | 960;
                        } else if (charAt4 < 55296 || 57343 < charAt4) {
                            byteBuffer.put((byte) ((charAt4 >>> 12) | 480));
                            i = ((charAt4 >>> 6) & 63) | 128;
                        } else {
                            int i15 = i4 + 1;
                            if (i15 != charSequence.length()) {
                                char charAt5 = charSequence.charAt(i15);
                                if (Character.isSurrogatePair(charAt4, charAt5)) {
                                    int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                    byteBuffer.put((byte) ((codePoint2 >>> 18) | 240));
                                    byteBuffer.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                                    byteBuffer.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                                    byteBuffer.put((byte) ((codePoint2 & 63) | 128));
                                    i4 = i15;
                                    i4++;
                                } else {
                                    i4 = i15;
                                }
                            }
                            int i16 = i4 - 1;
                            StringBuilder sb3 = new StringBuilder(39);
                            sb3.append(str);
                            sb3.append(i16);
                            throw new IllegalArgumentException(sb3.toString());
                        }
                        byteBuffer.put((byte) i);
                        charAt4 = (charAt4 & '?') | 128;
                    }
                    byteBuffer.put((byte) charAt4);
                    i4++;
                }
            }
        } else {
            throw new ReadOnlyBufferException();
        }
    }

    /* renamed from: b */
    public static int m26636b(int i, long j) {
        return m26643c(i) + m26644c(j);
    }

    /* renamed from: b */
    public static int m26637b(int i, C10309f4 f4Var) {
        int c = m26643c(i);
        int a = f4Var.mo27910a();
        return c + m26646e(a) + a;
    }

    /* renamed from: b */
    public static int m26638b(int i, String str) {
        return m26643c(i) + m26631a(str);
    }

    /* renamed from: b */
    public static int m26639b(int i, byte[] bArr) {
        return m26643c(i) + m26640b(bArr);
    }

    /* renamed from: b */
    public static int m26640b(byte[] bArr) {
        return m26646e(bArr.length) + bArr.length;
    }

    /* renamed from: b */
    public static long m26641b(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: b */
    private final void m26642b(int i) throws IOException {
        while ((i & -128) != 0) {
            m26634a((i & 127) | 128);
            i >>>= 7;
        }
        m26634a(i);
    }

    /* renamed from: c */
    public static int m26643c(int i) {
        return m26646e(i << 3);
    }

    /* renamed from: c */
    public static int m26644c(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    /* renamed from: d */
    public static int m26645d(int i) {
        if (i >= 0) {
            return m26646e(i);
        }
        return 10;
    }

    /* renamed from: e */
    private static int m26646e(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    /* renamed from: a */
    public final void mo28210a() {
        if (this.f27342a.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(this.f27342a.remaining())}));
        }
    }

    /* renamed from: a */
    public final void mo28211a(int i, int i2) throws IOException {
        m26642b((i << 3) | i2);
    }

    /* renamed from: a */
    public final void mo28212a(int i, long j) throws IOException {
        mo28211a(i, 0);
        mo28218a(j);
    }

    /* renamed from: a */
    public final void mo28213a(int i, C10309f4 f4Var) throws IOException {
        mo28211a(i, 2);
        if (f4Var.f26991e < 0) {
            f4Var.mo27910a();
        }
        m26642b(f4Var.f26991e);
        f4Var.mo27792a(this);
    }

    /* renamed from: a */
    public final void mo28214a(int i, zzdo zzdo) throws IOException {
        if (this.f27343b == null) {
            this.f27343b = zzbn.m26668a(this.f27342a);
        } else {
            if (this.f27344c != this.f27342a.position()) {
                this.f27343b.mo28245b(this.f27342a.array(), this.f27344c, this.f27342a.position() - this.f27344c);
            }
            zzbn zzbn = this.f27343b;
            zzbn.mo28231a(i, zzdo);
            zzbn.mo28221a();
            this.f27344c = this.f27342a.position();
        }
        this.f27344c = this.f27342a.position();
        zzbn zzbn2 = this.f27343b;
        zzbn2.mo28231a(i, zzdo);
        zzbn2.mo28221a();
        this.f27344c = this.f27342a.position();
    }

    /* renamed from: a */
    public final void mo28215a(int i, String str) throws IOException {
        mo28211a(i, 2);
        try {
            int e = m26646e(str.length());
            if (e == m26646e(str.length() * 3)) {
                int position = this.f27342a.position();
                if (this.f27342a.remaining() >= e) {
                    this.f27342a.position(position + e);
                    m26635a((CharSequence) str, this.f27342a);
                    int position2 = this.f27342a.position();
                    this.f27342a.position(position);
                    m26642b((position2 - position) - e);
                    this.f27342a.position(position2);
                    return;
                }
                throw new zzft(position + e, this.f27342a.limit());
            }
            m26642b(m26630a((CharSequence) str));
            m26635a((CharSequence) str, this.f27342a);
        } catch (BufferOverflowException e2) {
            zzft zzft = new zzft(this.f27342a.position(), this.f27342a.limit());
            zzft.initCause(e2);
            throw zzft;
        }
    }

    /* renamed from: a */
    public final void mo28216a(int i, boolean z) throws IOException {
        mo28211a(25, 0);
        byte b = z ? (byte) 1 : 0;
        if (this.f27342a.hasRemaining()) {
            this.f27342a.put(b);
            return;
        }
        throw new zzft(this.f27342a.position(), this.f27342a.limit());
    }

    /* renamed from: a */
    public final void mo28217a(int i, byte[] bArr) throws IOException {
        mo28211a(i, 2);
        m26642b(bArr.length);
        int length = bArr.length;
        if (this.f27342a.remaining() >= length) {
            this.f27342a.put(bArr, 0, length);
            return;
        }
        throw new zzft(this.f27342a.position(), this.f27342a.limit());
    }

    /* renamed from: a */
    public final void mo28218a(long j) throws IOException {
        while ((-128 & j) != 0) {
            m26634a((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m26634a((int) j);
    }

    /* renamed from: b */
    public final void mo28219b(int i, int i2) throws IOException {
        mo28211a(i, 0);
        if (i2 >= 0) {
            m26642b(i2);
        } else {
            mo28218a((long) i2);
        }
    }
}
