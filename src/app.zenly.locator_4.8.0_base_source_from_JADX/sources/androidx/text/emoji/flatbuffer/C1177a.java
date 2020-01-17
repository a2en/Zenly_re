package androidx.text.emoji.flatbuffer;

import java.nio.ByteBuffer;

/* renamed from: androidx.text.emoji.flatbuffer.a */
public final class C1177a extends C1179c {
    /* renamed from: a */
    public C1177a mo5942a(int i, ByteBuffer byteBuffer) {
        mo5943b(i, byteBuffer);
        return this;
    }

    /* renamed from: b */
    public void mo5943b(int i, ByteBuffer byteBuffer) {
        this.f4489a = i;
        this.f4490b = byteBuffer;
    }

    /* renamed from: c */
    public short mo5945c() {
        int b = mo5956b(14);
        if (b != 0) {
            return this.f4490b.getShort(b + this.f4489a);
        }
        return 0;
    }

    /* renamed from: d */
    public int mo5946d() {
        int b = mo5956b(4);
        if (b != 0) {
            return this.f4490b.getInt(b + this.f4489a);
        }
        return 0;
    }

    /* renamed from: e */
    public short mo5948e() {
        int b = mo5956b(8);
        if (b != 0) {
            return this.f4490b.getShort(b + this.f4489a);
        }
        return 0;
    }

    /* renamed from: f */
    public short mo5949f() {
        int b = mo5956b(12);
        if (b != 0) {
            return this.f4490b.getShort(b + this.f4489a);
        }
        return 0;
    }

    /* renamed from: a */
    public int mo5941a() {
        int b = mo5956b(16);
        if (b != 0) {
            return mo5958d(b);
        }
        return 0;
    }

    /* renamed from: b */
    public boolean mo5944b() {
        int b = mo5956b(6);
        if (b == 0 || this.f4490b.get(b + this.f4489a) == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public int mo5947e(int i) {
        int b = mo5956b(16);
        if (b != 0) {
            return this.f4490b.getInt(mo5957c(b) + (i * 4));
        }
        return 0;
    }
}
