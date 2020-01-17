package app.zenly.locator.p017a0.p024p.p025d;

import app.zenly.locator.p017a0.p024p.C1560b;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.a0.p.d.a */
public final class C1562a {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C1562a f5491b = C1560b.f5481a.mo7103a();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final C1562a f5492c = new C1562a(3, 1, 2);
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final C1562a f5493d = new C1562a(1, 2, 3);

    /* renamed from: e */
    public static final C1563a f5494e = new C1563a(null);

    /* renamed from: a */
    private final int[] f5495a;

    /* renamed from: app.zenly.locator.a0.p.d.a$a */
    public static final class C1563a {
        private C1563a() {
        }

        /* renamed from: a */
        public final C1562a mo7107a() {
            return C1562a.f5491b;
        }

        /* renamed from: b */
        public final C1562a mo7108b() {
            return C1562a.f5492c;
        }

        /* renamed from: c */
        public final C1562a mo7109c() {
            return C1562a.f5493d;
        }

        public /* synthetic */ C1563a(C12928f fVar) {
            this();
        }
    }

    public C1562a(int... iArr) {
        C12932j.m33818b(iArr, "mapping");
        this.f5495a = iArr;
    }

    /* renamed from: a */
    public final int mo7105a(int i) {
        int a = C12840k.m33567a(this.f5495a, i);
        if (a != -1) {
            return a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown preference: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public final int mo7106b(int i) {
        if (i >= 0) {
            int[] iArr = this.f5495a;
            if (i < iArr.length) {
                return iArr[i];
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown index: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
