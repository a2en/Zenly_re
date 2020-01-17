package androidx.emoji.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.text.emoji.flatbuffer.C1177a;

/* renamed from: androidx.emoji.text.a */
public class C0740a {

    /* renamed from: d */
    private static final ThreadLocal<C1177a> f3065d = new ThreadLocal<>();

    /* renamed from: a */
    private final int f3066a;

    /* renamed from: b */
    private final C0757f f3067b;

    /* renamed from: c */
    private volatile int f3068c = 0;

    C0740a(C0757f fVar, int i) {
        this.f3067b = fVar;
        this.f3066a = i;
    }

    /* renamed from: h */
    private C1177a m3465h() {
        C1177a aVar = (C1177a) f3065d.get();
        if (aVar == null) {
            aVar = new C1177a();
            f3065d.set(aVar);
        }
        this.f3067b.mo3748b().mo5951a(aVar, this.f3066a);
        return aVar;
    }

    /* renamed from: a */
    public void mo3712a(Canvas canvas, float f, float f2, Paint paint) {
        Typeface e = this.f3067b.mo3751e();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(e);
        Canvas canvas2 = canvas;
        canvas2.drawText(this.f3067b.mo3747a(), this.f3066a * 2, 2, f, f2, paint);
        paint.setTypeface(typeface);
    }

    /* renamed from: b */
    public int mo3714b() {
        return this.f3068c;
    }

    /* renamed from: c */
    public short mo3715c() {
        return m3465h().mo5945c();
    }

    /* renamed from: d */
    public int mo3716d() {
        return m3465h().mo5946d();
    }

    /* renamed from: e */
    public short mo3717e() {
        return m3465h().mo5948e();
    }

    /* renamed from: f */
    public short mo3718f() {
        return m3465h().mo5949f();
    }

    /* renamed from: g */
    public boolean mo3719g() {
        return m3465h().mo5944b();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(mo3716d()));
        sb.append(", codepoints:");
        int a = mo3710a();
        for (int i = 0; i < a; i++) {
            sb.append(Integer.toHexString(mo3711a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void mo3713a(boolean z) {
        this.f3068c = z ? 2 : 1;
    }

    /* renamed from: a */
    public int mo3711a(int i) {
        return m3465h().mo5947e(i);
    }

    /* renamed from: a */
    public int mo3710a() {
        return m3465h().mo5941a();
    }
}
