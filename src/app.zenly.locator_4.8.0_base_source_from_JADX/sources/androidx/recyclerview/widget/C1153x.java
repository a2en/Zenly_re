package androidx.recyclerview.widget;

import android.view.View;

/* renamed from: androidx.recyclerview.widget.x */
class C1153x {

    /* renamed from: a */
    final C1155b f4374a;

    /* renamed from: b */
    C1154a f4375b = new C1154a();

    /* renamed from: androidx.recyclerview.widget.x$a */
    static class C1154a {

        /* renamed from: a */
        int f4376a = 0;

        /* renamed from: b */
        int f4377b;

        /* renamed from: c */
        int f4378c;

        /* renamed from: d */
        int f4379d;

        /* renamed from: e */
        int f4380e;

        C1154a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo5804a(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5806a(int i, int i2, int i3, int i4) {
            this.f4377b = i;
            this.f4378c = i2;
            this.f4379d = i3;
            this.f4380e = i4;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo5808b() {
            this.f4376a = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5805a(int i) {
            this.f4376a = i | this.f4376a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo5807a() {
            int i = this.f4376a;
            if ((i & 7) != 0 && (i & (mo5804a(this.f4379d, this.f4377b) << 0)) == 0) {
                return false;
            }
            int i2 = this.f4376a;
            if ((i2 & 112) != 0 && (i2 & (mo5804a(this.f4379d, this.f4378c) << 4)) == 0) {
                return false;
            }
            int i3 = this.f4376a;
            if ((i3 & 1792) != 0 && (i3 & (mo5804a(this.f4380e, this.f4377b) << 8)) == 0) {
                return false;
            }
            int i4 = this.f4376a;
            if ((i4 & 28672) == 0 || (i4 & (mo5804a(this.f4380e, this.f4378c) << 12)) != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.x$b */
    interface C1155b {
        /* renamed from: a */
        int mo5316a();

        /* renamed from: a */
        int mo5317a(View view);

        /* renamed from: a */
        View mo5318a(int i);

        /* renamed from: b */
        int mo5319b();

        /* renamed from: b */
        int mo5320b(View view);
    }

    C1153x(C1155b bVar) {
        this.f4374a = bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public View mo5802a(int i, int i2, int i3, int i4) {
        int a = this.f4374a.mo5316a();
        int b = this.f4374a.mo5319b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a2 = this.f4374a.mo5318a(i);
            this.f4375b.mo5806a(a, b, this.f4374a.mo5317a(a2), this.f4374a.mo5320b(a2));
            if (i3 != 0) {
                this.f4375b.mo5808b();
                this.f4375b.mo5805a(i3);
                if (this.f4375b.mo5807a()) {
                    return a2;
                }
            }
            if (i4 != 0) {
                this.f4375b.mo5808b();
                this.f4375b.mo5805a(i4);
                if (this.f4375b.mo5807a()) {
                    view = a2;
                }
            }
            i += i5;
        }
        return view;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5803a(View view, int i) {
        this.f4375b.mo5806a(this.f4374a.mo5316a(), this.f4374a.mo5319b(), this.f4374a.mo5317a(view), this.f4374a.mo5320b(view));
        if (i == 0) {
            return false;
        }
        this.f4375b.mo5808b();
        this.f4375b.mo5805a(i);
        return this.f4375b.mo5807a();
    }
}
