package com.appsflyer.internal;

/* renamed from: com.appsflyer.internal.s */
public final class C8790s {

    /* renamed from: ˊ */
    private C8791e f22769;

    /* renamed from: ˋ */
    public String f22770;

    /* renamed from: ॱ */
    public boolean f22771;

    /* renamed from: com.appsflyer.internal.s$e */
    enum C8791e {
        GOOGLE(0),
        AMAZON(1);
        

        /* renamed from: ˏ */
        private int f22775;

        private C8791e(int i) {
            this.f22775 = i;
        }

        public final String toString() {
            return String.valueOf(this.f22775);
        }
    }

    C8790s(C8791e eVar, String str, boolean z) {
        this.f22769 = eVar;
        this.f22770 = str;
        this.f22771 = z;
    }

    public final String toString() {
        return String.format("%s,%s", new Object[]{this.f22770, Boolean.valueOf(this.f22771)});
    }
}
