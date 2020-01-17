package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.s */
class C0279s {

    /* renamed from: a */
    private int f1251a = 0;

    /* renamed from: b */
    private int f1252b = 0;

    /* renamed from: c */
    private int f1253c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f1254d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f1255e = 0;

    /* renamed from: f */
    private int f1256f = 0;

    /* renamed from: g */
    private boolean f1257g = false;

    /* renamed from: h */
    private boolean f1258h = false;

    C0279s() {
    }

    /* renamed from: a */
    public int mo2048a() {
        return this.f1257g ? this.f1251a : this.f1252b;
    }

    /* renamed from: b */
    public int mo2051b() {
        return this.f1251a;
    }

    /* renamed from: c */
    public int mo2053c() {
        return this.f1252b;
    }

    /* renamed from: d */
    public int mo2054d() {
        return this.f1257g ? this.f1252b : this.f1251a;
    }

    /* renamed from: a */
    public void mo2049a(int i, int i2) {
        this.f1258h = false;
        if (i != Integer.MIN_VALUE) {
            this.f1255e = i;
            this.f1251a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1256f = i2;
            this.f1252b = i2;
        }
    }

    /* renamed from: b */
    public void mo2052b(int i, int i2) {
        this.f1253c = i;
        this.f1254d = i2;
        this.f1258h = true;
        if (this.f1257g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1251a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1252b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1251a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1252b = i2;
        }
    }

    /* renamed from: a */
    public void mo2050a(boolean z) {
        if (z != this.f1257g) {
            this.f1257g = z;
            if (!this.f1258h) {
                this.f1251a = this.f1255e;
                this.f1252b = this.f1256f;
            } else if (z) {
                int i = this.f1254d;
                if (i == Integer.MIN_VALUE) {
                    i = this.f1255e;
                }
                this.f1251a = i;
                int i2 = this.f1253c;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.f1256f;
                }
                this.f1252b = i2;
            } else {
                int i3 = this.f1253c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = this.f1255e;
                }
                this.f1251a = i3;
                int i4 = this.f1254d;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = this.f1256f;
                }
                this.f1252b = i4;
            }
        }
    }
}
