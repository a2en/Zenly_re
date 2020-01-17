package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.e */
class C1098e {

    /* renamed from: a */
    final C1100b f4215a;

    /* renamed from: b */
    final C1099a f4216b = new C1099a();

    /* renamed from: c */
    final List<View> f4217c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.e$a */
    static class C1099a {

        /* renamed from: a */
        long f4218a = 0;

        /* renamed from: b */
        C1099a f4219b;

        C1099a() {
        }

        /* renamed from: b */
        private void m5448b() {
            if (this.f4219b == null) {
                this.f4219b = new C1099a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5661a(int i) {
            if (i >= 64) {
                C1099a aVar = this.f4219b;
                if (aVar != null) {
                    aVar.mo5661a(i - 64);
                    return;
                }
                return;
            }
            this.f4218a &= ~(1 << i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public boolean mo5664c(int i) {
            if (i >= 64) {
                m5448b();
                return this.f4219b.mo5664c(i - 64);
            }
            return (this.f4218a & (1 << i)) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo5665d(int i) {
            if (i >= 64) {
                m5448b();
                return this.f4219b.mo5665d(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.f4218a & j) != 0;
            this.f4218a &= ~j;
            long j2 = j - 1;
            long j3 = this.f4218a;
            this.f4218a = Long.rotateRight(j3 & (~j2), 1) | (j3 & j2);
            C1099a aVar = this.f4219b;
            if (aVar != null) {
                if (aVar.mo5664c(0)) {
                    mo5666e(63);
                }
                this.f4219b.mo5665d(0);
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public void mo5666e(int i) {
            if (i >= 64) {
                m5448b();
                this.f4219b.mo5666e(i - 64);
                return;
            }
            this.f4218a |= 1 << i;
        }

        public String toString() {
            if (this.f4219b == null) {
                return Long.toBinaryString(this.f4218a);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f4219b.toString());
            sb.append("xx");
            sb.append(Long.toBinaryString(this.f4218a));
            return sb.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo5663b(int i) {
            C1099a aVar = this.f4219b;
            if (aVar == null) {
                if (i >= 64) {
                    return Long.bitCount(this.f4218a);
                }
                return Long.bitCount(this.f4218a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.f4218a & ((1 << i) - 1));
            } else {
                return aVar.mo5663b(i - 64) + Long.bitCount(this.f4218a);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5660a() {
            this.f4218a = 0;
            C1099a aVar = this.f4219b;
            if (aVar != null) {
                aVar.mo5660a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5662a(int i, boolean z) {
            if (i >= 64) {
                m5448b();
                this.f4219b.mo5662a(i - 64, z);
                return;
            }
            boolean z2 = (this.f4218a & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            long j2 = this.f4218a;
            this.f4218a = ((j2 & (~j)) << 1) | (j2 & j);
            if (z) {
                mo5666e(i);
            } else {
                mo5661a(i);
            }
            if (z2 || this.f4219b != null) {
                m5448b();
                this.f4219b.mo5662a(0, z2);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$b */
    interface C1100b {
        /* renamed from: a */
        int mo5364a();

        /* renamed from: a */
        View mo5365a(int i);

        /* renamed from: a */
        void mo5366a(View view);

        /* renamed from: a */
        void mo5367a(View view, int i);

        /* renamed from: a */
        void mo5368a(View view, int i, LayoutParams layoutParams);

        /* renamed from: b */
        C1085v mo5369b(View view);

        /* renamed from: b */
        void mo5370b();

        /* renamed from: b */
        void mo5371b(int i);

        /* renamed from: c */
        int mo5372c(View view);

        /* renamed from: c */
        void mo5373c(int i);

        /* renamed from: d */
        void mo5374d(View view);
    }

    C1098e(C1100b bVar) {
        this.f4215a = bVar;
    }

    /* renamed from: f */
    private int m5428f(int i) {
        if (i < 0) {
            return -1;
        }
        int a = this.f4215a.mo5364a();
        int i2 = i;
        while (i2 < a) {
            int b = i - (i2 - this.f4216b.mo5663b(i2));
            if (b == 0) {
                while (this.f4216b.mo5664c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    /* renamed from: g */
    private void m5429g(View view) {
        this.f4217c.add(view);
        this.f4215a.mo5366a(view);
    }

    /* renamed from: h */
    private boolean m5430h(View view) {
        if (!this.f4217c.remove(view)) {
            return false;
        }
        this.f4215a.mo5374d(view);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5647a(View view, boolean z) {
        mo5646a(view, -1, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public View mo5650b(int i) {
        int size = this.f4217c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.f4217c.get(i2);
            C1085v b = this.f4215a.mo5369b(view);
            if (b.getLayoutPosition() == i && !b.isInvalid() && !b.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public View mo5651c(int i) {
        return this.f4215a.mo5365a(m5428f(i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo5655d(View view) {
        int c = this.f4215a.mo5372c(view);
        if (c >= 0) {
            if (this.f4216b.mo5665d(c)) {
                m5430h(view);
            }
            this.f4215a.mo5373c(c);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo5656e(int i) {
        int f = m5428f(i);
        View a = this.f4215a.mo5365a(f);
        if (a != null) {
            if (this.f4216b.mo5665d(f)) {
                m5430h(a);
            }
            this.f4215a.mo5373c(f);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4216b.toString());
        sb.append(", hidden list:");
        sb.append(this.f4217c.size());
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5646a(View view, int i, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f4215a.mo5364a();
        } else {
            i2 = m5428f(i);
        }
        this.f4216b.mo5662a(i2, z);
        if (z) {
            m5429g(view);
        }
        this.f4215a.mo5367a(view, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo5652c() {
        this.f4216b.mo5660a();
        for (int size = this.f4217c.size() - 1; size >= 0; size--) {
            this.f4215a.mo5374d((View) this.f4217c.get(size));
            this.f4217c.remove(size);
        }
        this.f4215a.mo5370b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public void mo5658f(View view) {
        int c = this.f4215a.mo5372c(view);
        if (c < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("view is not a child, cannot hide ");
            sb.append(view);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.f4216b.mo5664c(c)) {
            this.f4216b.mo5661a(c);
            m5430h(view);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("trying to unhide a view that was not hidden");
            sb2.append(view);
            throw new RuntimeException(sb2.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public View mo5654d(int i) {
        return this.f4215a.mo5365a(i);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public boolean mo5657e(View view) {
        int c = this.f4215a.mo5372c(view);
        if (c == -1) {
            m5430h(view);
            return true;
        } else if (!this.f4216b.mo5664c(c)) {
            return false;
        } else {
            this.f4216b.mo5665d(c);
            m5430h(view);
            this.f4215a.mo5373c(c);
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5645a(View view, int i, LayoutParams layoutParams, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f4215a.mo5364a();
        } else {
            i2 = m5428f(i);
        }
        this.f4216b.mo5662a(i2, z);
        if (z) {
            m5429g(view);
        }
        this.f4215a.mo5368a(view, i2, layoutParams);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo5648b() {
        return this.f4215a.mo5364a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo5649b(View view) {
        int c = this.f4215a.mo5372c(view);
        if (c != -1 && !this.f4216b.mo5664c(c)) {
            return c - this.f4216b.mo5663b(c);
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo5653c(View view) {
        return this.f4217c.contains(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo5642a() {
        return this.f4215a.mo5364a() - this.f4217c.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5643a(int i) {
        int f = m5428f(i);
        this.f4216b.mo5665d(f);
        this.f4215a.mo5371b(f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5644a(View view) {
        int c = this.f4215a.mo5372c(view);
        if (c >= 0) {
            this.f4216b.mo5666e(c);
            m5429g(view);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("view is not a child, cannot hide ");
        sb.append(view);
        throw new IllegalArgumentException(sb.toString());
    }
}
