package androidx.emoji.text;

import androidx.text.emoji.flatbuffer.C1178b;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: androidx.emoji.text.e */
class C0753e {

    /* renamed from: androidx.emoji.text.e$a */
    private static class C0754a implements C0756c {

        /* renamed from: a */
        private final ByteBuffer f3103a;

        C0754a(ByteBuffer byteBuffer) {
            this.f3103a = byteBuffer;
            this.f3103a.order(ByteOrder.BIG_ENDIAN);
        }

        /* renamed from: a */
        public int mo3740a() throws IOException {
            return this.f3103a.getInt();
        }

        /* renamed from: b */
        public long mo3742b() throws IOException {
            return C0753e.m3509a(this.f3103a.getInt());
        }

        public long getPosition() {
            return (long) this.f3103a.position();
        }

        public int readUnsignedShort() throws IOException {
            return C0753e.m3508a(this.f3103a.getShort());
        }

        /* renamed from: a */
        public void mo3741a(int i) throws IOException {
            ByteBuffer byteBuffer = this.f3103a;
            byteBuffer.position(byteBuffer.position() + i);
        }
    }

    /* renamed from: androidx.emoji.text.e$b */
    private static class C0755b {

        /* renamed from: a */
        private final long f3104a;

        C0755b(long j, long j2) {
            this.f3104a = j;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public long mo3745a() {
            return this.f3104a;
        }
    }

    /* renamed from: androidx.emoji.text.e$c */
    private interface C0756c {
        /* renamed from: a */
        int mo3740a() throws IOException;

        /* renamed from: a */
        void mo3741a(int i) throws IOException;

        /* renamed from: b */
        long mo3742b() throws IOException;

        long getPosition();

        int readUnsignedShort() throws IOException;
    }

    /* renamed from: a */
    static int m3508a(short s) {
        return s & 65535;
    }

    /* renamed from: a */
    static long m3509a(int i) {
        return ((long) i) & 4294967295L;
    }

    /* renamed from: a */
    static C1178b m3511a(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) m3510a((C0756c) new C0754a(duplicate)).mo3745a());
        return C1178b.m5760a(duplicate);
    }

    /* renamed from: a */
    private static C0755b m3510a(C0756c cVar) throws IOException {
        long j;
        cVar.mo3741a(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        String str = "Cannot read metadata.";
        if (readUnsignedShort <= 100) {
            cVar.mo3741a(6);
            int i = 0;
            while (true) {
                if (i >= readUnsignedShort) {
                    j = -1;
                    break;
                }
                int a = cVar.mo3740a();
                cVar.mo3741a(4);
                j = cVar.mo3742b();
                cVar.mo3741a(4);
                if (1835365473 == a) {
                    break;
                }
                i++;
            }
            if (j != -1) {
                cVar.mo3741a((int) (j - cVar.getPosition()));
                cVar.mo3741a(12);
                long b = cVar.mo3742b();
                for (int i2 = 0; ((long) i2) < b; i2++) {
                    int a2 = cVar.mo3740a();
                    long b2 = cVar.mo3742b();
                    long b3 = cVar.mo3742b();
                    if (1164798569 == a2 || 1701669481 == a2) {
                        return new C0755b(b2 + j, b3);
                    }
                }
            }
            throw new IOException(str);
        }
        throw new IOException(str);
    }
}
