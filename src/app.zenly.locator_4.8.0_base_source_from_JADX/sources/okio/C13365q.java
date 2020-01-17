package okio;

/* renamed from: okio.q */
final class C13365q {

    /* renamed from: a */
    final byte[] f34663a;

    /* renamed from: b */
    int f34664b;

    /* renamed from: c */
    int f34665c;

    /* renamed from: d */
    boolean f34666d;

    /* renamed from: e */
    boolean f34667e;

    /* renamed from: f */
    C13365q f34668f;

    /* renamed from: g */
    C13365q f34669g;

    C13365q() {
        this.f34663a = new byte[8192];
        this.f34667e = true;
        this.f34666d = false;
    }

    /* renamed from: a */
    public final C13365q mo38571a(C13365q qVar) {
        qVar.f34669g = this;
        qVar.f34668f = this.f34668f;
        this.f34668f.f34669g = qVar;
        this.f34668f = qVar;
        return qVar;
    }

    /* renamed from: b */
    public final C13365q mo38574b() {
        C13365q qVar = this.f34668f;
        if (qVar == this) {
            qVar = null;
        }
        C13365q qVar2 = this.f34669g;
        qVar2.f34668f = this.f34668f;
        this.f34668f.f34669g = qVar2;
        this.f34668f = null;
        this.f34669g = null;
        return qVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final C13365q mo38575c() {
        this.f34666d = true;
        C13365q qVar = new C13365q(this.f34663a, this.f34664b, this.f34665c, true, false);
        return qVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final C13365q mo38576d() {
        C13365q qVar = new C13365q((byte[]) this.f34663a.clone(), this.f34664b, this.f34665c, false, true);
        return qVar;
    }

    C13365q(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f34663a = bArr;
        this.f34664b = i;
        this.f34665c = i2;
        this.f34666d = z;
        this.f34667e = z2;
    }

    /* renamed from: a */
    public final C13365q mo38570a(int i) {
        C13365q qVar;
        if (i <= 0 || i > this.f34665c - this.f34664b) {
            throw new IllegalArgumentException();
        }
        if (i >= 1024) {
            qVar = mo38575c();
        } else {
            qVar = C13366r.m35400a();
            System.arraycopy(this.f34663a, this.f34664b, qVar.f34663a, 0, i);
        }
        qVar.f34665c = qVar.f34664b + i;
        this.f34664b += i;
        this.f34669g.mo38571a(qVar);
        return qVar;
    }

    /* renamed from: a */
    public final void mo38572a() {
        C13365q qVar = this.f34669g;
        if (qVar == this) {
            throw new IllegalStateException();
        } else if (qVar.f34667e) {
            int i = this.f34665c - this.f34664b;
            if (i <= (8192 - qVar.f34665c) + (qVar.f34666d ? 0 : qVar.f34664b)) {
                mo38573a(this.f34669g, i);
                mo38574b();
                C13366r.m35401a(this);
            }
        }
    }

    /* renamed from: a */
    public final void mo38573a(C13365q qVar, int i) {
        if (qVar.f34667e) {
            int i2 = qVar.f34665c;
            if (i2 + i > 8192) {
                if (!qVar.f34666d) {
                    int i3 = i2 + i;
                    int i4 = qVar.f34664b;
                    if (i3 - i4 <= 8192) {
                        byte[] bArr = qVar.f34663a;
                        System.arraycopy(bArr, i4, bArr, 0, i2 - i4);
                        qVar.f34665c -= qVar.f34664b;
                        qVar.f34664b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f34663a, this.f34664b, qVar.f34663a, qVar.f34665c, i);
            qVar.f34665c += i;
            this.f34664b += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
