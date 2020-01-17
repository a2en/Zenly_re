package okio;

/* renamed from: okio.r */
final class C13366r {

    /* renamed from: a */
    static C13365q f34670a;

    /* renamed from: b */
    static long f34671b;

    private C13366r() {
    }

    /* renamed from: a */
    static C13365q m35400a() {
        synchronized (C13366r.class) {
            if (f34670a == null) {
                return new C13365q();
            }
            C13365q qVar = f34670a;
            f34670a = qVar.f34668f;
            qVar.f34668f = null;
            f34671b -= 8192;
            return qVar;
        }
    }

    /* renamed from: a */
    static void m35401a(C13365q qVar) {
        if (qVar.f34668f != null || qVar.f34669g != null) {
            throw new IllegalArgumentException();
        } else if (!qVar.f34666d) {
            synchronized (C13366r.class) {
                if (f34671b + 8192 <= 65536) {
                    f34671b += 8192;
                    qVar.f34668f = f34670a;
                    qVar.f34665c = 0;
                    qVar.f34664b = 0;
                    f34670a = qVar;
                }
            }
        }
    }
}
