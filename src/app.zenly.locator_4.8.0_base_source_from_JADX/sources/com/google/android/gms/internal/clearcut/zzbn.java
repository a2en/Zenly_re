package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzbn extends C10425x {

    /* renamed from: b */
    private static final Logger f27345b = Logger.getLogger(zzbn.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final boolean f27346c = C10341k3.m26212b();

    /* renamed from: a */
    C10351l0 f27347a = this;

    /* renamed from: com.google.android.gms.internal.clearcut.zzbn$a */
    static class C10443a extends zzbn {

        /* renamed from: d */
        private final byte[] f27348d;

        /* renamed from: e */
        private final int f27349e;

        /* renamed from: f */
        private final int f27350f;

        /* renamed from: g */
        private int f27351g;

        C10443a(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i + i2;
                if ((i | i2 | (bArr.length - i3)) >= 0) {
                    this.f27348d = bArr;
                    this.f27349e = i;
                    this.f27351g = i;
                    this.f27350f = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        /* renamed from: a */
        public void mo28221a() {
        }

        /* renamed from: a */
        public final void mo28222a(byte b) throws IOException {
            try {
                byte[] bArr = this.f27348d;
                int i = this.f27351g;
                this.f27351g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f27351g), Integer.valueOf(this.f27350f), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: a */
        public final void mo28225a(int i) throws IOException {
            if (i >= 0) {
                mo28239b(i);
            } else {
                mo28235a((long) i);
            }
        }

        /* renamed from: a */
        public final void mo28228a(int i, int i2) throws IOException {
            mo28239b((i << 3) | i2);
        }

        /* renamed from: a */
        public final void mo28229a(int i, long j) throws IOException {
            mo28228a(i, 0);
            mo28235a(j);
        }

        /* renamed from: a */
        public final void mo28230a(int i, C10431y yVar) throws IOException {
            mo28228a(i, 2);
            mo28253b(yVar);
        }

        /* renamed from: a */
        public final void mo28231a(int i, zzdo zzdo) throws IOException {
            mo28228a(i, 2);
            mo28255c(zzdo);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo28232a(int i, zzdo zzdo, C10359m2 m2Var) throws IOException {
            mo28228a(i, 2);
            C10368o oVar = (C10368o) zzdo;
            int a = oVar.mo27801a();
            if (a == -1) {
                a = m2Var.mo27836c(oVar);
                oVar.mo27803a(a);
            }
            mo28239b(a);
            m2Var.mo27830a(zzdo, (C10435y3) this.f27347a);
        }

        /* renamed from: a */
        public final void mo28233a(int i, String str) throws IOException {
            mo28228a(i, 2);
            mo28254b(str);
        }

        /* renamed from: a */
        public final void mo28234a(int i, boolean z) throws IOException {
            mo28228a(i, 0);
            mo28222a(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public final void mo28235a(long j) throws IOException {
            if (!zzbn.f27346c || mo28238b() < 10) {
                while ((j & -128) != 0) {
                    byte[] bArr = this.f27348d;
                    int i = this.f27351g;
                    this.f27351g = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f27348d;
                    int i2 = this.f27351g;
                    this.f27351g = i2 + 1;
                    bArr2[i2] = (byte) ((int) j);
                } catch (IndexOutOfBoundsException e) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f27351g), Integer.valueOf(this.f27350f), Integer.valueOf(1)}), e);
                }
            } else {
                while ((j & -128) != 0) {
                    byte[] bArr3 = this.f27348d;
                    int i3 = this.f27351g;
                    this.f27351g = i3 + 1;
                    C10341k3.m26204a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr4 = this.f27348d;
                int i4 = this.f27351g;
                this.f27351g = i4 + 1;
                C10341k3.m26204a(bArr4, (long) i4, (byte) ((int) j));
            }
        }

        /* renamed from: a */
        public final void mo28185a(byte[] bArr, int i, int i2) throws IOException {
            mo28245b(bArr, i, i2);
        }

        /* renamed from: b */
        public final int mo28238b() {
            return this.f27350f - this.f27351g;
        }

        /* renamed from: b */
        public final void mo28239b(int i) throws IOException {
            if (!zzbn.f27346c || mo28238b() < 10) {
                while ((i & -128) != 0) {
                    byte[] bArr = this.f27348d;
                    int i2 = this.f27351g;
                    this.f27351g = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                }
                try {
                    byte[] bArr2 = this.f27348d;
                    int i3 = this.f27351g;
                    this.f27351g = i3 + 1;
                    bArr2[i3] = (byte) i;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f27351g), Integer.valueOf(this.f27350f), Integer.valueOf(1)}), e);
                }
            } else {
                while ((i & -128) != 0) {
                    byte[] bArr3 = this.f27348d;
                    int i4 = this.f27351g;
                    this.f27351g = i4 + 1;
                    C10341k3.m26204a(bArr3, (long) i4, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr4 = this.f27348d;
                int i5 = this.f27351g;
                this.f27351g = i5 + 1;
                C10341k3.m26204a(bArr4, (long) i5, (byte) i);
            }
        }

        /* renamed from: b */
        public final void mo28240b(int i, int i2) throws IOException {
            mo28228a(i, 0);
            mo28225a(i2);
        }

        /* renamed from: b */
        public final void mo28242b(int i, C10431y yVar) throws IOException {
            mo28228a(1, 3);
            mo28247c(2, i);
            mo28230a(3, yVar);
            mo28228a(1, 4);
        }

        /* renamed from: b */
        public final void mo28243b(int i, zzdo zzdo) throws IOException {
            mo28228a(1, 3);
            mo28247c(2, i);
            mo28231a(3, zzdo);
            mo28228a(1, 4);
        }

        /* renamed from: b */
        public final void mo28253b(C10431y yVar) throws IOException {
            mo28239b(yVar.size());
            yVar.mo27903a((C10425x) this);
        }

        /* renamed from: b */
        public final void mo28254b(String str) throws IOException {
            int i = this.f27351g;
            try {
                int g = zzbn.m26696g(str.length() * 3);
                int g2 = zzbn.m26696g(str.length());
                if (g2 == g) {
                    this.f27351g = i + g2;
                    int a = C10360m3.m26326a(str, this.f27348d, this.f27351g, mo28238b());
                    this.f27351g = i;
                    mo28239b((a - i) - g2);
                    this.f27351g = a;
                    return;
                }
                mo28239b(C10360m3.m26325a((CharSequence) str));
                this.f27351g = C10360m3.m26326a(str, this.f27348d, this.f27351g, mo28238b());
            } catch (C10378p3 e) {
                this.f27351g = i;
                mo28236a(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzc((Throwable) e2);
            }
        }

        /* renamed from: b */
        public final void mo28245b(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.f27348d, this.f27351g, i2);
                this.f27351g += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f27351g), Integer.valueOf(this.f27350f), Integer.valueOf(i2)}), e);
            }
        }

        /* renamed from: c */
        public final void mo28247c(int i, int i2) throws IOException {
            mo28228a(i, 0);
            mo28239b(i2);
        }

        /* renamed from: c */
        public final void mo28248c(int i, long j) throws IOException {
            mo28228a(i, 1);
            mo28249c(j);
        }

        /* renamed from: c */
        public final void mo28249c(long j) throws IOException {
            try {
                byte[] bArr = this.f27348d;
                int i = this.f27351g;
                this.f27351g = i + 1;
                bArr[i] = (byte) ((int) j);
                byte[] bArr2 = this.f27348d;
                int i2 = this.f27351g;
                this.f27351g = i2 + 1;
                bArr2[i2] = (byte) ((int) (j >> 8));
                byte[] bArr3 = this.f27348d;
                int i3 = this.f27351g;
                this.f27351g = i3 + 1;
                bArr3[i3] = (byte) ((int) (j >> 16));
                byte[] bArr4 = this.f27348d;
                int i4 = this.f27351g;
                this.f27351g = i4 + 1;
                bArr4[i4] = (byte) ((int) (j >> 24));
                byte[] bArr5 = this.f27348d;
                int i5 = this.f27351g;
                this.f27351g = i5 + 1;
                bArr5[i5] = (byte) ((int) (j >> 32));
                byte[] bArr6 = this.f27348d;
                int i6 = this.f27351g;
                this.f27351g = i6 + 1;
                bArr6[i6] = (byte) ((int) (j >> 40));
                byte[] bArr7 = this.f27348d;
                int i7 = this.f27351g;
                this.f27351g = i7 + 1;
                bArr7[i7] = (byte) ((int) (j >> 48));
                byte[] bArr8 = this.f27348d;
                int i8 = this.f27351g;
                this.f27351g = i8 + 1;
                bArr8[i8] = (byte) ((int) (j >> 56));
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f27351g), Integer.valueOf(this.f27350f), Integer.valueOf(1)}), e);
            }
        }

        /* renamed from: c */
        public final void mo28255c(zzdo zzdo) throws IOException {
            mo28239b(zzdo.zzas());
            zzdo.zzb(this);
        }

        /* renamed from: d */
        public final int mo28256d() {
            return this.f27351g - this.f27349e;
        }

        /* JADX WARNING: type inference failed for: r0v4, types: [byte[]] */
        /* JADX WARNING: type inference failed for: r5v2, types: [byte, int] */
        /* JADX WARNING: Incorrect type for immutable var: ssa=byte[], code=null, for r0v4, types: [byte[]] */
        /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=null, for r5v2, types: [byte, int] */
        /* JADX WARNING: Unknown variable types count: 2 */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo28250d(int r5) throws java.io.IOException {
            /*
                r4 = this;
                byte[] r0 = r4.f27348d     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r1 = r4.f27351g     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r2 = r1 + 1
                r4.f27351g = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                byte r2 = (byte) r5     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                r0[r1] = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                byte[] r0 = r4.f27348d     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r1 = r4.f27351g     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r2 = r1 + 1
                r4.f27351g = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r2 = r5 >> 8
                byte r2 = (byte) r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                r0[r1] = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                byte[] r0 = r4.f27348d     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r1 = r4.f27351g     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r2 = r1 + 1
                r4.f27351g = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r2 = r5 >> 16
                byte r2 = (byte) r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                r0[r1] = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                byte[] r0 = r4.f27348d     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r1 = r4.f27351g     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r2 = r1 + 1
                r4.f27351g = r2     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                int r5 = r5 >> 24
                r0[r1] = r5     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
                return
            L_0x0032:
                r5 = move-exception
                com.google.android.gms.internal.clearcut.zzbn$zzc r0 = new com.google.android.gms.internal.clearcut.zzbn$zzc
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                int r3 = r4.f27351g
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1[r2] = r3
                int r2 = r4.f27350f
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3 = 1
                r1[r3] = r2
                r2 = 2
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1[r2] = r3
                java.lang.String r2 = "Pos: %d, limit: %d, len: %d"
                java.lang.String r1 = java.lang.String.format(r2, r1)
                r0.<init>(r1, r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.zzbn.C10443a.mo28250d(int):void");
        }

        /* renamed from: e */
        public final void mo28252e(int i, int i2) throws IOException {
            mo28228a(i, 5);
            mo28250d(i2);
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.zzbn$b */
    static final class C10444b extends C10443a {

        /* renamed from: h */
        private final ByteBuffer f27352h;

        /* renamed from: i */
        private int f27353i;

        C10444b(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.f27352h = byteBuffer;
            this.f27353i = byteBuffer.position();
        }

        /* renamed from: a */
        public final void mo28221a() {
            this.f27352h.position(this.f27353i + mo28256d());
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.zzbn$c */
    static final class C10445c extends zzbn {

        /* renamed from: d */
        private final ByteBuffer f27354d;

        /* renamed from: e */
        private final ByteBuffer f27355e;

        C10445c(ByteBuffer byteBuffer) {
            super();
            this.f27354d = byteBuffer;
            this.f27355e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            byteBuffer.position();
        }

        /* renamed from: c */
        private final void m26773c(String str) throws IOException {
            try {
                C10360m3.m26327a((CharSequence) str, this.f27355e);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: a */
        public final void mo28221a() {
            this.f27354d.position(this.f27355e.position());
        }

        /* renamed from: a */
        public final void mo28222a(byte b) throws IOException {
            try {
                this.f27355e.put(b);
            } catch (BufferOverflowException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: a */
        public final void mo28225a(int i) throws IOException {
            if (i >= 0) {
                mo28239b(i);
            } else {
                mo28235a((long) i);
            }
        }

        /* renamed from: a */
        public final void mo28228a(int i, int i2) throws IOException {
            mo28239b((i << 3) | i2);
        }

        /* renamed from: a */
        public final void mo28229a(int i, long j) throws IOException {
            mo28228a(i, 0);
            mo28235a(j);
        }

        /* renamed from: a */
        public final void mo28230a(int i, C10431y yVar) throws IOException {
            mo28228a(i, 2);
            mo28257b(yVar);
        }

        /* renamed from: a */
        public final void mo28231a(int i, zzdo zzdo) throws IOException {
            mo28228a(i, 2);
            mo28260c(zzdo);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo28232a(int i, zzdo zzdo, C10359m2 m2Var) throws IOException {
            mo28228a(i, 2);
            mo28258b(zzdo, m2Var);
        }

        /* renamed from: a */
        public final void mo28233a(int i, String str) throws IOException {
            mo28228a(i, 2);
            mo28259b(str);
        }

        /* renamed from: a */
        public final void mo28234a(int i, boolean z) throws IOException {
            mo28228a(i, 0);
            mo28222a(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public final void mo28235a(long j) throws IOException {
            while ((-128 & j) != 0) {
                this.f27355e.put((byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            try {
                this.f27355e.put((byte) ((int) j));
            } catch (BufferOverflowException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: a */
        public final void mo28185a(byte[] bArr, int i, int i2) throws IOException {
            mo28245b(bArr, i, i2);
        }

        /* renamed from: b */
        public final int mo28238b() {
            return this.f27355e.remaining();
        }

        /* renamed from: b */
        public final void mo28239b(int i) throws IOException {
            while ((i & -128) != 0) {
                this.f27355e.put((byte) ((i & 127) | 128));
                i >>>= 7;
            }
            try {
                this.f27355e.put((byte) i);
            } catch (BufferOverflowException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: b */
        public final void mo28240b(int i, int i2) throws IOException {
            mo28228a(i, 0);
            mo28225a(i2);
        }

        /* renamed from: b */
        public final void mo28242b(int i, C10431y yVar) throws IOException {
            mo28228a(1, 3);
            mo28247c(2, i);
            mo28230a(3, yVar);
            mo28228a(1, 4);
        }

        /* renamed from: b */
        public final void mo28243b(int i, zzdo zzdo) throws IOException {
            mo28228a(1, 3);
            mo28247c(2, i);
            mo28231a(3, zzdo);
            mo28228a(1, 4);
        }

        /* renamed from: b */
        public final void mo28257b(C10431y yVar) throws IOException {
            mo28239b(yVar.size());
            yVar.mo27903a((C10425x) this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo28258b(zzdo zzdo, C10359m2 m2Var) throws IOException {
            C10368o oVar = (C10368o) zzdo;
            int a = oVar.mo27801a();
            if (a == -1) {
                a = m2Var.mo27836c(oVar);
                oVar.mo27803a(a);
            }
            mo28239b(a);
            m2Var.mo27830a(zzdo, (C10435y3) this.f27347a);
        }

        /* renamed from: b */
        public final void mo28259b(String str) throws IOException {
            int position = this.f27355e.position();
            try {
                int g = zzbn.m26696g(str.length() * 3);
                int g2 = zzbn.m26696g(str.length());
                if (g2 == g) {
                    int position2 = this.f27355e.position() + g2;
                    this.f27355e.position(position2);
                    m26773c(str);
                    int position3 = this.f27355e.position();
                    this.f27355e.position(position);
                    mo28239b(position3 - position2);
                    this.f27355e.position(position3);
                    return;
                }
                mo28239b(C10360m3.m26325a((CharSequence) str));
                m26773c(str);
            } catch (C10378p3 e) {
                this.f27355e.position(position);
                mo28236a(str, e);
            } catch (IllegalArgumentException e2) {
                throw new zzc((Throwable) e2);
            }
        }

        /* renamed from: b */
        public final void mo28245b(byte[] bArr, int i, int i2) throws IOException {
            try {
                this.f27355e.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc((Throwable) e);
            } catch (BufferOverflowException e2) {
                throw new zzc((Throwable) e2);
            }
        }

        /* renamed from: c */
        public final void mo28247c(int i, int i2) throws IOException {
            mo28228a(i, 0);
            mo28239b(i2);
        }

        /* renamed from: c */
        public final void mo28248c(int i, long j) throws IOException {
            mo28228a(i, 1);
            mo28249c(j);
        }

        /* renamed from: c */
        public final void mo28249c(long j) throws IOException {
            try {
                this.f27355e.putLong(j);
            } catch (BufferOverflowException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: c */
        public final void mo28260c(zzdo zzdo) throws IOException {
            mo28239b(zzdo.zzas());
            zzdo.zzb(this);
        }

        /* renamed from: d */
        public final void mo28250d(int i) throws IOException {
            try {
                this.f27355e.putInt(i);
            } catch (BufferOverflowException e) {
                throw new zzc((Throwable) e);
            }
        }

        /* renamed from: e */
        public final void mo28252e(int i, int i2) throws IOException {
            mo28228a(i, 5);
            mo28250d(i2);
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.zzbn$d */
    static final class C10446d extends zzbn {

        /* renamed from: d */
        private final ByteBuffer f27356d;

        /* renamed from: e */
        private final ByteBuffer f27357e;

        /* renamed from: f */
        private final long f27358f;

        /* renamed from: g */
        private final long f27359g;

        /* renamed from: h */
        private final long f27360h;

        /* renamed from: i */
        private final long f27361i = (this.f27360h - 10);

        /* renamed from: j */
        private long f27362j = this.f27359g;

        C10446d(ByteBuffer byteBuffer) {
            super();
            this.f27356d = byteBuffer;
            this.f27357e = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.f27358f = C10341k3.m26194a(byteBuffer);
            this.f27359g = this.f27358f + ((long) byteBuffer.position());
            this.f27360h = this.f27358f + ((long) byteBuffer.limit());
        }

        /* renamed from: i */
        private final void m26801i(long j) {
            this.f27357e.position((int) (j - this.f27358f));
        }

        /* renamed from: a */
        public final void mo28221a() {
            this.f27356d.position((int) (this.f27362j - this.f27358f));
        }

        /* renamed from: a */
        public final void mo28222a(byte b) throws IOException {
            long j = this.f27362j;
            if (j < this.f27360h) {
                this.f27362j = 1 + j;
                C10341k3.m26196a(j, b);
                return;
            }
            throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j), Long.valueOf(this.f27360h), Integer.valueOf(1)}));
        }

        /* renamed from: a */
        public final void mo28225a(int i) throws IOException {
            if (i >= 0) {
                mo28239b(i);
            } else {
                mo28235a((long) i);
            }
        }

        /* renamed from: a */
        public final void mo28228a(int i, int i2) throws IOException {
            mo28239b((i << 3) | i2);
        }

        /* renamed from: a */
        public final void mo28229a(int i, long j) throws IOException {
            mo28228a(i, 0);
            mo28235a(j);
        }

        /* renamed from: a */
        public final void mo28230a(int i, C10431y yVar) throws IOException {
            mo28228a(i, 2);
            mo28261b(yVar);
        }

        /* renamed from: a */
        public final void mo28231a(int i, zzdo zzdo) throws IOException {
            mo28228a(i, 2);
            mo28264c(zzdo);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo28232a(int i, zzdo zzdo, C10359m2 m2Var) throws IOException {
            mo28228a(i, 2);
            mo28262b(zzdo, m2Var);
        }

        /* renamed from: a */
        public final void mo28233a(int i, String str) throws IOException {
            mo28228a(i, 2);
            mo28263b(str);
        }

        /* renamed from: a */
        public final void mo28234a(int i, boolean z) throws IOException {
            mo28228a(i, 0);
            mo28222a(z ? (byte) 1 : 0);
        }

        /* renamed from: a */
        public final void mo28235a(long j) throws IOException {
            long j2;
            if (this.f27362j <= this.f27361i) {
                while (true) {
                    int i = ((j & -128) > 0 ? 1 : ((j & -128) == 0 ? 0 : -1));
                    j2 = this.f27362j;
                    if (i == 0) {
                        break;
                    }
                    this.f27362j = j2 + 1;
                    C10341k3.m26196a(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
            } else {
                while (true) {
                    j2 = this.f27362j;
                    if (j2 >= this.f27360h) {
                        throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j2), Long.valueOf(this.f27360h), Integer.valueOf(1)}));
                    } else if ((j & -128) == 0) {
                        break;
                    } else {
                        this.f27362j = j2 + 1;
                        C10341k3.m26196a(j2, (byte) ((((int) j) & 127) | 128));
                        j >>>= 7;
                    }
                }
            }
            this.f27362j = 1 + j2;
            C10341k3.m26196a(j2, (byte) ((int) j));
        }

        /* renamed from: a */
        public final void mo28185a(byte[] bArr, int i, int i2) throws IOException {
            mo28245b(bArr, i, i2);
        }

        /* renamed from: b */
        public final int mo28238b() {
            return (int) (this.f27360h - this.f27362j);
        }

        /* renamed from: b */
        public final void mo28239b(int i) throws IOException {
            long j;
            if (this.f27362j <= this.f27361i) {
                while ((i & -128) != 0) {
                    long j2 = this.f27362j;
                    this.f27362j = j2 + 1;
                    C10341k3.m26196a(j2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                j = this.f27362j;
            } else {
                while (true) {
                    j = this.f27362j;
                    if (j >= this.f27360h) {
                        throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(j), Long.valueOf(this.f27360h), Integer.valueOf(1)}));
                    } else if ((i & -128) == 0) {
                        break;
                    } else {
                        this.f27362j = j + 1;
                        C10341k3.m26196a(j, (byte) ((i & 127) | 128));
                        i >>>= 7;
                    }
                }
            }
            this.f27362j = 1 + j;
            C10341k3.m26196a(j, (byte) i);
        }

        /* renamed from: b */
        public final void mo28240b(int i, int i2) throws IOException {
            mo28228a(i, 0);
            mo28225a(i2);
        }

        /* renamed from: b */
        public final void mo28242b(int i, C10431y yVar) throws IOException {
            mo28228a(1, 3);
            mo28247c(2, i);
            mo28230a(3, yVar);
            mo28228a(1, 4);
        }

        /* renamed from: b */
        public final void mo28243b(int i, zzdo zzdo) throws IOException {
            mo28228a(1, 3);
            mo28247c(2, i);
            mo28231a(3, zzdo);
            mo28228a(1, 4);
        }

        /* renamed from: b */
        public final void mo28261b(C10431y yVar) throws IOException {
            mo28239b(yVar.size());
            yVar.mo27903a((C10425x) this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo28262b(zzdo zzdo, C10359m2 m2Var) throws IOException {
            C10368o oVar = (C10368o) zzdo;
            int a = oVar.mo27801a();
            if (a == -1) {
                a = m2Var.mo27836c(oVar);
                oVar.mo27803a(a);
            }
            mo28239b(a);
            m2Var.mo27830a(zzdo, (C10435y3) this.f27347a);
        }

        /* renamed from: b */
        public final void mo28263b(String str) throws IOException {
            long j = this.f27362j;
            try {
                int g = zzbn.m26696g(str.length() * 3);
                int g2 = zzbn.m26696g(str.length());
                if (g2 == g) {
                    int i = ((int) (this.f27362j - this.f27358f)) + g2;
                    this.f27357e.position(i);
                    C10360m3.m26327a((CharSequence) str, this.f27357e);
                    int position = this.f27357e.position() - i;
                    mo28239b(position);
                    this.f27362j += (long) position;
                    return;
                }
                int a = C10360m3.m26325a((CharSequence) str);
                mo28239b(a);
                m26801i(this.f27362j);
                C10360m3.m26327a((CharSequence) str, this.f27357e);
                this.f27362j += (long) a;
            } catch (C10378p3 e) {
                this.f27362j = j;
                m26801i(this.f27362j);
                mo28236a(str, e);
            } catch (IllegalArgumentException e2) {
                throw new zzc((Throwable) e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzc((Throwable) e3);
            }
        }

        /* renamed from: b */
        public final void mo28245b(byte[] bArr, int i, int i2) throws IOException {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = (long) i2;
                long j2 = this.f27360h - j;
                long j3 = this.f27362j;
                if (j2 >= j3) {
                    C10341k3.m26205a(bArr, (long) i, j3, j);
                    this.f27362j += j;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Long.valueOf(this.f27362j), Long.valueOf(this.f27360h), Integer.valueOf(i2)}));
        }

        /* renamed from: c */
        public final void mo28247c(int i, int i2) throws IOException {
            mo28228a(i, 0);
            mo28239b(i2);
        }

        /* renamed from: c */
        public final void mo28248c(int i, long j) throws IOException {
            mo28228a(i, 1);
            mo28249c(j);
        }

        /* renamed from: c */
        public final void mo28249c(long j) throws IOException {
            this.f27357e.putLong((int) (this.f27362j - this.f27358f), j);
            this.f27362j += 8;
        }

        /* renamed from: c */
        public final void mo28264c(zzdo zzdo) throws IOException {
            mo28239b(zzdo.zzas());
            zzdo.zzb(this);
        }

        /* renamed from: d */
        public final void mo28250d(int i) throws IOException {
            this.f27357e.putInt((int) (this.f27362j - this.f27358f), i);
            this.f27362j += 4;
        }

        /* renamed from: e */
        public final void mo28252e(int i, int i2) throws IOException {
            mo28228a(i, 5);
            mo28250d(i2);
        }
    }

    public static class zzc extends IOException {
        zzc() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzc(String str) {
            String valueOf = String.valueOf(str);
            String str2 = "CodedOutputStream was writing to a flat byte array and ran out of space.: ";
            super(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }

        zzc(String str, Throwable th) {
            String valueOf = String.valueOf(str);
            String str2 = "CodedOutputStream was writing to a flat byte array and ran out of space.: ";
            super(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
        }

        zzc(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private zzbn() {
    }

    /* renamed from: a */
    public static int m26662a(int i, C10332j1 j1Var) {
        int e = m26689e(i);
        int a = j1Var.mo27953a();
        return e + m26696g(a) + a;
    }

    /* renamed from: a */
    public static int m26663a(C10332j1 j1Var) {
        int a = j1Var.mo27953a();
        return m26696g(a) + a;
    }

    /* renamed from: a */
    public static int m26664a(C10431y yVar) {
        int size = yVar.size();
        return m26696g(size) + size;
    }

    /* renamed from: a */
    public static int m26665a(zzdo zzdo) {
        int zzas = zzdo.zzas();
        return m26696g(zzas) + zzas;
    }

    /* renamed from: a */
    static int m26666a(zzdo zzdo, C10359m2 m2Var) {
        C10368o oVar = (C10368o) zzdo;
        int a = oVar.mo27801a();
        if (a == -1) {
            a = m2Var.mo27836c(oVar);
            oVar.mo27803a(a);
        }
        return m26696g(a) + a;
    }

    /* renamed from: a */
    public static int m26667a(String str) {
        int i;
        try {
            i = C10360m3.m26325a((CharSequence) str);
        } catch (C10378p3 unused) {
            i = str.getBytes(C10292d1.f26951a).length;
        }
        return m26696g(i) + i;
    }

    /* renamed from: a */
    public static zzbn m26668a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new C10444b(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            return C10341k3.m26215c() ? new C10446d(byteBuffer) : new C10445c(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    /* renamed from: a */
    public static zzbn m26669a(byte[] bArr) {
        return new C10443a(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public static int m26670b(double d) {
        return 8;
    }

    /* renamed from: b */
    public static int m26671b(float f) {
        return 4;
    }

    /* renamed from: b */
    public static int m26672b(int i, double d) {
        return m26689e(i) + 8;
    }

    /* renamed from: b */
    public static int m26673b(int i, float f) {
        return m26689e(i) + 4;
    }

    /* renamed from: b */
    public static int m26674b(int i, C10332j1 j1Var) {
        return (m26689e(1) << 1) + m26697g(2, i) + m26662a(3, j1Var);
    }

    /* renamed from: b */
    static int m26675b(int i, zzdo zzdo, C10359m2 m2Var) {
        return m26689e(i) + m26666a(zzdo, m2Var);
    }

    /* renamed from: b */
    public static int m26676b(int i, String str) {
        return m26689e(i) + m26667a(str);
    }

    /* renamed from: b */
    public static int m26677b(int i, boolean z) {
        return m26689e(i) + 1;
    }

    @Deprecated
    /* renamed from: b */
    public static int m26678b(zzdo zzdo) {
        return zzdo.zzas();
    }

    /* renamed from: b */
    public static int m26679b(boolean z) {
        return 1;
    }

    /* renamed from: b */
    public static int m26680b(byte[] bArr) {
        int length = bArr.length;
        return m26696g(length) + length;
    }

    /* renamed from: c */
    public static int m26681c(int i, C10431y yVar) {
        int e = m26689e(i);
        int size = yVar.size();
        return e + m26696g(size) + size;
    }

    /* renamed from: c */
    public static int m26682c(int i, zzdo zzdo) {
        return m26689e(i) + m26665a(zzdo);
    }

    @Deprecated
    /* renamed from: c */
    static int m26683c(int i, zzdo zzdo, C10359m2 m2Var) {
        int e = m26689e(i) << 1;
        C10368o oVar = (C10368o) zzdo;
        int a = oVar.mo27801a();
        if (a == -1) {
            a = m2Var.mo27836c(oVar);
            oVar.mo27803a(a);
        }
        return e + a;
    }

    /* renamed from: d */
    public static int m26685d(int i, long j) {
        return m26689e(i) + m26691e(j);
    }

    /* renamed from: d */
    public static int m26686d(int i, C10431y yVar) {
        return (m26689e(1) << 1) + m26697g(2, i) + m26681c(3, yVar);
    }

    /* renamed from: d */
    public static int m26687d(int i, zzdo zzdo) {
        return (m26689e(1) << 1) + m26697g(2, i) + m26682c(3, zzdo);
    }

    /* renamed from: d */
    public static int m26688d(long j) {
        return m26691e(j);
    }

    /* renamed from: e */
    public static int m26689e(int i) {
        return m26696g(i << 3);
    }

    /* renamed from: e */
    public static int m26690e(int i, long j) {
        return m26689e(i) + m26691e(j);
    }

    /* renamed from: e */
    public static int m26691e(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        if ((j & -16384) != 0) {
            i++;
        }
        return i;
    }

    /* renamed from: f */
    public static int m26692f(int i) {
        if (i >= 0) {
            return m26696g(i);
        }
        return 10;
    }

    /* renamed from: f */
    public static int m26693f(int i, int i2) {
        return m26689e(i) + m26692f(i2);
    }

    /* renamed from: f */
    public static int m26694f(int i, long j) {
        return m26689e(i) + m26691e(m26706i(j));
    }

    /* renamed from: f */
    public static int m26695f(long j) {
        return m26691e(m26706i(j));
    }

    /* renamed from: g */
    public static int m26696g(int i) {
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

    /* renamed from: g */
    public static int m26697g(int i, int i2) {
        return m26689e(i) + m26696g(i2);
    }

    /* renamed from: g */
    public static int m26698g(int i, long j) {
        return m26689e(i) + 8;
    }

    /* renamed from: g */
    public static int m26699g(long j) {
        return 8;
    }

    /* renamed from: h */
    public static int m26700h(int i) {
        return m26696g(m26711l(i));
    }

    /* renamed from: h */
    public static int m26701h(int i, int i2) {
        return m26689e(i) + m26696g(m26711l(i2));
    }

    /* renamed from: h */
    public static int m26702h(int i, long j) {
        return m26689e(i) + 8;
    }

    /* renamed from: h */
    public static int m26703h(long j) {
        return 8;
    }

    /* renamed from: i */
    public static int m26704i(int i) {
        return 4;
    }

    /* renamed from: i */
    public static int m26705i(int i, int i2) {
        return m26689e(i) + 4;
    }

    /* renamed from: i */
    private static long m26706i(long j) {
        return (j >> 63) ^ (j << 1);
    }

    /* renamed from: j */
    public static int m26707j(int i) {
        return 4;
    }

    /* renamed from: j */
    public static int m26708j(int i, int i2) {
        return m26689e(i) + 4;
    }

    /* renamed from: k */
    public static int m26709k(int i) {
        return m26692f(i);
    }

    /* renamed from: k */
    public static int m26710k(int i, int i2) {
        return m26689e(i) + m26692f(i2);
    }

    /* renamed from: l */
    private static int m26711l(int i) {
        return (i >> 31) ^ (i << 1);
    }

    @Deprecated
    /* renamed from: m */
    public static int m26712m(int i) {
        return m26696g(i);
    }

    /* renamed from: a */
    public abstract void mo28221a() throws IOException;

    /* renamed from: a */
    public abstract void mo28222a(byte b) throws IOException;

    /* renamed from: a */
    public final void mo28223a(double d) throws IOException {
        mo28249c(Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void mo28224a(float f) throws IOException {
        mo28250d(Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public abstract void mo28225a(int i) throws IOException;

    /* renamed from: a */
    public final void mo28226a(int i, double d) throws IOException {
        mo28248c(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void mo28227a(int i, float f) throws IOException {
        mo28252e(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public abstract void mo28228a(int i, int i2) throws IOException;

    /* renamed from: a */
    public abstract void mo28229a(int i, long j) throws IOException;

    /* renamed from: a */
    public abstract void mo28230a(int i, C10431y yVar) throws IOException;

    /* renamed from: a */
    public abstract void mo28231a(int i, zzdo zzdo) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo28232a(int i, zzdo zzdo, C10359m2 m2Var) throws IOException;

    /* renamed from: a */
    public abstract void mo28233a(int i, String str) throws IOException;

    /* renamed from: a */
    public abstract void mo28234a(int i, boolean z) throws IOException;

    /* renamed from: a */
    public abstract void mo28235a(long j) throws IOException;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo28236a(String str, C10378p3 p3Var) throws IOException {
        f27345b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", p3Var);
        byte[] bytes = str.getBytes(C10292d1.f26951a);
        try {
            mo28239b(bytes.length);
            mo28185a(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new zzc((Throwable) e);
        } catch (zzc e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public final void mo28237a(boolean z) throws IOException {
        mo28222a(z ? (byte) 1 : 0);
    }

    /* renamed from: b */
    public abstract int mo28238b();

    /* renamed from: b */
    public abstract void mo28239b(int i) throws IOException;

    /* renamed from: b */
    public abstract void mo28240b(int i, int i2) throws IOException;

    /* renamed from: b */
    public final void mo28241b(int i, long j) throws IOException {
        mo28229a(i, m26706i(j));
    }

    /* renamed from: b */
    public abstract void mo28242b(int i, C10431y yVar) throws IOException;

    /* renamed from: b */
    public abstract void mo28243b(int i, zzdo zzdo) throws IOException;

    /* renamed from: b */
    public final void mo28244b(long j) throws IOException {
        mo28235a(m26706i(j));
    }

    /* renamed from: b */
    public abstract void mo28245b(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: c */
    public final void mo28246c(int i) throws IOException {
        mo28239b(m26711l(i));
    }

    /* renamed from: c */
    public abstract void mo28247c(int i, int i2) throws IOException;

    /* renamed from: c */
    public abstract void mo28248c(int i, long j) throws IOException;

    /* renamed from: c */
    public abstract void mo28249c(long j) throws IOException;

    /* renamed from: d */
    public abstract void mo28250d(int i) throws IOException;

    /* renamed from: d */
    public final void mo28251d(int i, int i2) throws IOException {
        mo28247c(i, m26711l(i2));
    }

    /* renamed from: e */
    public abstract void mo28252e(int i, int i2) throws IOException;
}
