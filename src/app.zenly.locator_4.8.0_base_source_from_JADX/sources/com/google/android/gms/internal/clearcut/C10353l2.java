package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.l2 */
final class C10353l2 {

    /* renamed from: a */
    private final String f27134a;

    /* renamed from: b */
    private int f27135b = 0;

    C10353l2(String str) {
        this.f27134a = str;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo28051a() {
        return this.f27135b < this.f27134a.length();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo28052b() {
        String str = this.f27134a;
        int i = this.f27135b;
        this.f27135b = i + 1;
        char charAt = str.charAt(i);
        if (charAt < 55296) {
            return charAt;
        }
        char c = charAt & 8191;
        int i2 = 13;
        while (true) {
            String str2 = this.f27134a;
            int i3 = this.f27135b;
            this.f27135b = i3 + 1;
            char charAt2 = str2.charAt(i3);
            if (charAt2 < 55296) {
                return c | (charAt2 << i2);
            }
            c |= (charAt2 & 8191) << i2;
            i2 += 13;
        }
    }
}
