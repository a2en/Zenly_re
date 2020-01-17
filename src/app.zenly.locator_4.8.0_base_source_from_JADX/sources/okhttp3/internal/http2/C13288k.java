package okhttp3.internal.http2;

import java.util.Arrays;

/* renamed from: okhttp3.internal.http2.k */
public final class C13288k {

    /* renamed from: a */
    private int f34310a;

    /* renamed from: b */
    private final int[] f34311b = new int[10];

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38171a() {
        this.f34310a = 0;
        Arrays.fill(this.f34311b, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo38173b() {
        if ((this.f34310a & 2) != 0) {
            return this.f34311b[1];
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo38176c(int i) {
        return (this.f34310a & 32) != 0 ? this.f34311b[5] : i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public boolean mo38178d(int i) {
        return ((1 << i) & this.f34310a) != 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo38174b(int i) {
        return (this.f34310a & 16) != 0 ? this.f34311b[4] : i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo38175c() {
        if ((this.f34310a & 128) != 0) {
            return this.f34311b[7];
        }
        return 65535;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo38177d() {
        return Integer.bitCount(this.f34310a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C13288k mo38170a(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f34311b;
            if (i < iArr.length) {
                this.f34310a = (1 << i) | this.f34310a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo38169a(int i) {
        return this.f34311b[i];
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo38172a(C13288k kVar) {
        for (int i = 0; i < 10; i++) {
            if (kVar.mo38178d(i)) {
                mo38170a(i, kVar.mo38169a(i));
            }
        }
    }
}
