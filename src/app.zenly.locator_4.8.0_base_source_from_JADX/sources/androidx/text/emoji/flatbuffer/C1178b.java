package androidx.text.emoji.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: androidx.text.emoji.flatbuffer.b */
public final class C1178b extends C1179c {
    /* renamed from: a */
    public static C1178b m5760a(ByteBuffer byteBuffer) {
        C1178b bVar = new C1178b();
        m5761a(byteBuffer, bVar);
        return bVar;
    }

    /* renamed from: b */
    public void mo5954b(int i, ByteBuffer byteBuffer) {
        this.f4489a = i;
        this.f4490b = byteBuffer;
    }

    /* renamed from: a */
    public static C1178b m5761a(ByteBuffer byteBuffer, C1178b bVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        bVar.mo5952a(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
        return bVar;
    }

    /* renamed from: b */
    public int mo5953b() {
        int b = mo5956b(4);
        if (b != 0) {
            return this.f4490b.getInt(b + this.f4489a);
        }
        return 0;
    }

    /* renamed from: a */
    public C1178b mo5952a(int i, ByteBuffer byteBuffer) {
        mo5954b(i, byteBuffer);
        return this;
    }

    /* renamed from: a */
    public C1177a mo5951a(C1177a aVar, int i) {
        int b = mo5956b(6);
        if (b == 0) {
            return null;
        }
        aVar.mo5942a(mo5955a(mo5957c(b) + (i * 4)), this.f4490b);
        return aVar;
    }

    /* renamed from: a */
    public int mo5950a() {
        int b = mo5956b(6);
        if (b != 0) {
            return mo5958d(b);
        }
        return 0;
    }
}
