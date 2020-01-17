package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.core.p004os.C0569g;
import androidx.recyclerview.widget.RecyclerView.C1079p;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.recyclerview.widget.j */
final class C1126j implements Runnable {

    /* renamed from: i */
    static final ThreadLocal<C1126j> f4319i = new ThreadLocal<>();

    /* renamed from: j */
    static Comparator<C1129c> f4320j = new C1127a();

    /* renamed from: e */
    ArrayList<RecyclerView> f4321e = new ArrayList<>();

    /* renamed from: f */
    long f4322f;

    /* renamed from: g */
    long f4323g;

    /* renamed from: h */
    private ArrayList<C1129c> f4324h = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.j$a */
    static class C1127a implements Comparator<C1129c> {
        C1127a() {
        }

        /* renamed from: a */
        public int compare(C1129c cVar, C1129c cVar2) {
            int i = 1;
            if ((cVar.f4332d == null) != (cVar2.f4332d == null)) {
                if (cVar.f4332d != null) {
                    i = -1;
                }
                return i;
            }
            boolean z = cVar.f4329a;
            if (z != cVar2.f4329a) {
                if (z) {
                    i = -1;
                }
                return i;
            }
            int i2 = cVar2.f4330b - cVar.f4330b;
            if (i2 != 0) {
                return i2;
            }
            int i3 = cVar.f4331c - cVar2.f4331c;
            if (i3 != 0) {
                return i3;
            }
            return 0;
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* renamed from: androidx.recyclerview.widget.j$b */
    static class C1128b implements LayoutPrefetchRegistry {

        /* renamed from: a */
        int f4325a;

        /* renamed from: b */
        int f4326b;

        /* renamed from: c */
        int[] f4327c;

        /* renamed from: d */
        int f4328d;

        C1128b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5723a(int i, int i2) {
            this.f4325a = i;
            this.f4326b = i2;
        }

        public void addPosition(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f4328d * 2;
                int[] iArr = this.f4327c;
                if (iArr == null) {
                    this.f4327c = new int[4];
                    Arrays.fill(this.f4327c, -1);
                } else if (i3 >= iArr.length) {
                    this.f4327c = new int[(i3 * 2)];
                    System.arraycopy(iArr, 0, this.f4327c, 0, iArr.length);
                }
                int[] iArr2 = this.f4327c;
                iArr2[i3] = i;
                iArr2[i3 + 1] = i2;
                this.f4328d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5724a(RecyclerView recyclerView, boolean z) {
            this.f4328d = 0;
            int[] iArr = this.f4327c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            LayoutManager layoutManager = recyclerView.f4029q;
            if (recyclerView.f4027p != null && layoutManager != null && layoutManager.mo5313y()) {
                if (z) {
                    if (!recyclerView.f4011h.mo5627c()) {
                        layoutManager.mo4988a(recyclerView.f4027p.getItemCount(), (LayoutPrefetchRegistry) this);
                    }
                } else if (!recyclerView.mo5128j()) {
                    layoutManager.mo4987a(this.f4325a, this.f4326b, recyclerView.f4020l0, (LayoutPrefetchRegistry) this);
                }
                int i = this.f4328d;
                if (i > layoutManager.f4063m) {
                    layoutManager.f4063m = i;
                    layoutManager.f4064n = z;
                    recyclerView.f4007f.mo5480j();
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo5725a(int i) {
            if (this.f4327c != null) {
                int i2 = this.f4328d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f4327c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5722a() {
            int[] iArr = this.f4327c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4328d = 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.j$c */
    static class C1129c {

        /* renamed from: a */
        public boolean f4329a;

        /* renamed from: b */
        public int f4330b;

        /* renamed from: c */
        public int f4331c;

        /* renamed from: d */
        public RecyclerView f4332d;

        /* renamed from: e */
        public int f4333e;

        C1129c() {
        }

        /* renamed from: a */
        public void mo5726a() {
            this.f4329a = false;
            this.f4330b = 0;
            this.f4331c = 0;
            this.f4332d = null;
            this.f4333e = 0;
        }
    }

    C1126j() {
    }

    /* renamed from: a */
    public void mo5716a(RecyclerView recyclerView) {
        this.f4321e.add(recyclerView);
    }

    /* renamed from: b */
    public void mo5718b(RecyclerView recyclerView) {
        this.f4321e.remove(recyclerView);
    }

    public void run() {
        try {
            C0569g.m2680a("RV Prefetch");
            if (!this.f4321e.isEmpty()) {
                int size = this.f4321e.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) this.f4321e.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    mo5715a(TimeUnit.MILLISECONDS.toNanos(j) + this.f4323g);
                    this.f4322f = 0;
                    C0569g.m2679a();
                }
            }
        } finally {
            this.f4322f = 0;
            C0569g.m2679a();
        }
    }

    /* renamed from: b */
    private void m5514b(long j) {
        int i = 0;
        while (i < this.f4324h.size()) {
            C1129c cVar = (C1129c) this.f4324h.get(i);
            if (cVar.f4332d != null) {
                m5512a(cVar, j);
                cVar.mo5726a();
                i++;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5717a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f4322f == 0) {
            this.f4322f = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f4018k0.mo5723a(i, i2);
    }

    /* renamed from: a */
    private void m5510a() {
        C1129c cVar;
        int size = this.f4321e.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = (RecyclerView) this.f4321e.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f4018k0.mo5724a(recyclerView, false);
                i += recyclerView.f4018k0.f4328d;
            }
        }
        this.f4324h.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f4321e.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C1128b bVar = recyclerView2.f4018k0;
                int abs = Math.abs(bVar.f4325a) + Math.abs(bVar.f4326b);
                int i5 = i3;
                for (int i6 = 0; i6 < bVar.f4328d * 2; i6 += 2) {
                    if (i5 >= this.f4324h.size()) {
                        cVar = new C1129c();
                        this.f4324h.add(cVar);
                    } else {
                        cVar = (C1129c) this.f4324h.get(i5);
                    }
                    int i7 = bVar.f4327c[i6 + 1];
                    cVar.f4329a = i7 <= abs;
                    cVar.f4330b = abs;
                    cVar.f4331c = i7;
                    cVar.f4332d = recyclerView2;
                    cVar.f4333e = bVar.f4327c[i6];
                    i5++;
                }
                i3 = i5;
            }
        }
        Collections.sort(this.f4324h, f4320j);
    }

    /* renamed from: a */
    static boolean m5513a(RecyclerView recyclerView, int i) {
        int b = recyclerView.f4013i.mo5648b();
        for (int i2 = 0; i2 < b; i2++) {
            C1085v m = RecyclerView.m4874m(recyclerView.f4013i.mo5654d(i2));
            if (m.mPosition == i && !m.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private C1085v m5509a(RecyclerView recyclerView, int i, long j) {
        if (m5513a(recyclerView, i)) {
            return null;
        }
        C1079p pVar = recyclerView.f4007f;
        try {
            recyclerView.mo5148q();
            C1085v a = pVar.mo5448a(i, false, j);
            if (a != null) {
                if (!a.isBound() || a.isInvalid()) {
                    pVar.mo5458a(a, false);
                } else {
                    pVar.mo5463b(a.itemView);
                }
            }
            return a;
        } finally {
            recyclerView.mo5052a(false);
        }
    }

    /* renamed from: a */
    private void m5511a(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.f3985H && recyclerView.f4013i.mo5648b() != 0) {
                recyclerView.mo5179t();
            }
            C1128b bVar = recyclerView.f4018k0;
            bVar.mo5724a(recyclerView, true);
            if (bVar.f4328d != 0) {
                try {
                    C0569g.m2680a("RV Nested Prefetch");
                    recyclerView.f4020l0.mo5484a(recyclerView.f4027p);
                    for (int i = 0; i < bVar.f4328d * 2; i += 2) {
                        m5509a(recyclerView, bVar.f4327c[i], j);
                    }
                } finally {
                    C0569g.m2679a();
                }
            }
        }
    }

    /* renamed from: a */
    private void m5512a(C1129c cVar, long j) {
        C1085v a = m5509a(cVar.f4332d, cVar.f4333e, cVar.f4329a ? Long.MAX_VALUE : j);
        if (a != null && a.mNestedRecyclerView != null && a.isBound() && !a.isInvalid()) {
            m5511a((RecyclerView) a.mNestedRecyclerView.get(), j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5715a(long j) {
        m5510a();
        m5514b(j);
    }
}
