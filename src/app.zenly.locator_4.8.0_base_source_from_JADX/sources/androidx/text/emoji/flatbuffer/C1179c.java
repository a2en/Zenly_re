package androidx.text.emoji.flatbuffer;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/* renamed from: androidx.text.emoji.flatbuffer.c */
public class C1179c {

    /* renamed from: a */
    protected int f4489a;

    /* renamed from: b */
    protected ByteBuffer f4490b;

    /* renamed from: androidx.text.emoji.flatbuffer.c$a */
    static class C1180a extends ThreadLocal<CharsetDecoder> {
        C1180a() {
        }

        /* access modifiers changed from: protected */
        public CharsetDecoder initialValue() {
            return Charset.forName("UTF-8").newDecoder();
        }
    }

    /* renamed from: androidx.text.emoji.flatbuffer.c$b */
    static class C1181b extends ThreadLocal<Charset> {
        C1181b() {
        }

        /* access modifiers changed from: protected */
        public Charset initialValue() {
            return Charset.forName("UTF-8");
        }
    }

    static {
        new C1180a();
        new C1181b();
        new ThreadLocal();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo5955a(int i) {
        return i + this.f4490b.getInt(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo5956b(int i) {
        int i2 = this.f4489a;
        int i3 = i2 - this.f4490b.getInt(i2);
        if (i < this.f4490b.getShort(i3)) {
            return this.f4490b.getShort(i3 + i);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo5957c(int i) {
        int i2 = i + this.f4489a;
        return i2 + this.f4490b.getInt(i2) + 4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public int mo5958d(int i) {
        int i2 = i + this.f4489a;
        return this.f4490b.getInt(i2 + this.f4490b.getInt(i2));
    }
}
