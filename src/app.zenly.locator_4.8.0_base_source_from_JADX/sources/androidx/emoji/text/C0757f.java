package androidx.emoji.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.core.util.C0607i;
import androidx.text.emoji.flatbuffer.C1178b;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: androidx.emoji.text.f */
public final class C0757f {

    /* renamed from: a */
    private final C1178b f3105a;

    /* renamed from: b */
    private final char[] f3106b = new char[(this.f3105a.mo5950a() * 2)];

    /* renamed from: c */
    private final C0758a f3107c = new C0758a(1024);

    /* renamed from: d */
    private final Typeface f3108d;

    /* renamed from: androidx.emoji.text.f$a */
    static class C0758a {

        /* renamed from: a */
        private final SparseArray<C0758a> f3109a;

        /* renamed from: b */
        private C0740a f3110b;

        private C0758a() {
            this(1);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public C0758a mo3753a(int i) {
            SparseArray<C0758a> sparseArray = this.f3109a;
            if (sparseArray == null) {
                return null;
            }
            return (C0758a) sparseArray.get(i);
        }

        C0758a(int i) {
            this.f3109a = new SparseArray<>(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C0740a mo3752a() {
            return this.f3110b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo3754a(C0740a aVar, int i, int i2) {
            C0758a a = mo3753a(aVar.mo3711a(i));
            if (a == null) {
                a = new C0758a();
                this.f3109a.put(aVar.mo3711a(i), a);
            }
            if (i2 > i) {
                a.mo3754a(aVar, i + 1, i2);
            } else {
                a.f3110b = aVar;
            }
        }
    }

    private C0757f(Typeface typeface, C1178b bVar) {
        this.f3108d = typeface;
        this.f3105a = bVar;
        m3520a(this.f3105a);
    }

    /* renamed from: a */
    public static C0757f m3519a(Typeface typeface, ByteBuffer byteBuffer) throws IOException {
        return new C0757f(typeface, C0753e.m3511a(byteBuffer));
    }

    /* renamed from: b */
    public C1178b mo3748b() {
        return this.f3105a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo3749c() {
        return this.f3105a.mo5953b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public C0758a mo3750d() {
        return this.f3107c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public Typeface mo3751e() {
        return this.f3108d;
    }

    /* renamed from: a */
    private void m3520a(C1178b bVar) {
        int a = bVar.mo5950a();
        for (int i = 0; i < a; i++) {
            C0740a aVar = new C0740a(this, i);
            Character.toChars(aVar.mo3716d(), this.f3106b, i * 2);
            mo3746a(aVar);
        }
    }

    /* renamed from: a */
    public char[] mo3747a() {
        return this.f3106b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3746a(C0740a aVar) {
        C0607i.m2774a(aVar, (Object) "emoji metadata cannot be null");
        C0607i.m2776a(aVar.mo3710a() > 0, (Object) "invalid metadata codepoint length");
        this.f3107c.mo3754a(aVar, 0, aVar.mo3710a() - 1);
    }
}
