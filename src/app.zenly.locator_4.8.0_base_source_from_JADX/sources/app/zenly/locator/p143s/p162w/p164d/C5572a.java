package app.zenly.locator.p143s.p162w.p164d;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import androidx.core.content.C0540a;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.view.particles.C3163c;
import app.zenly.locator.core.p072ui.view.particles.C3163c.C3165b;
import app.zenly.locator.core.p072ui.view.particles.C3163c.C3165b.C3166a;
import app.zenly.locator.core.p072ui.view.particles.C3163c.C3165b.C3167b;
import app.zenly.locator.core.p072ui.view.particles.ParticleAnimation;
import app.zenly.locator.core.p072ui.view.particles.ParticleView;
import app.zenly.locator.core.util.C3238u;
import app.zenly.locator.p143s.p155r.C5502b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;

/* renamed from: app.zenly.locator.s.w.d.a */
public class C5572a {

    /* renamed from: a */
    private static final int[] f14237a = {R.color.blue_light, R.color.pink, R.color.blue_black};

    /* renamed from: app.zenly.locator.s.w.d.a$a */
    static class C5573a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C5574b f14238e;

        /* renamed from: f */
        final /* synthetic */ Deque f14239f;

        /* renamed from: g */
        final /* synthetic */ Handler f14240g;

        C5573a(C5574b bVar, Deque deque, Handler handler) {
            this.f14238e = bVar;
            this.f14239f = deque;
            this.f14240g = handler;
        }

        public void run() {
            if (!this.f14238e.mo13185a()) {
                ((C3163c) this.f14239f.poll()).mo9509q();
                if (this.f14239f.size() > 0) {
                    this.f14240g.postDelayed(this, 200);
                    return;
                }
                return;
            }
            while (this.f14239f.size() > 0) {
                ((C3163c) this.f14239f.poll()).mo9493a(true);
            }
        }
    }

    /* renamed from: app.zenly.locator.s.w.d.a$b */
    public static class C5574b {

        /* renamed from: a */
        private boolean f14241a;

        /* renamed from: b */
        private final C5502b f14242b;

        /* synthetic */ C5574b(C5502b bVar, C5573a aVar) {
            this(bVar);
        }

        /* renamed from: a */
        public boolean mo13185a() {
            return this.f14241a;
        }

        /* renamed from: b */
        public void mo13186b() {
            this.f14241a = true;
            this.f14242b.mo13130a();
        }

        private C5574b(C5502b bVar) {
            this.f14242b = bVar;
        }
    }

    /* renamed from: app.zenly.locator.s.w.d.a$c */
    private static class C5575c implements Comparable<C5575c> {

        /* renamed from: e */
        public final C5576a f14243e;

        /* renamed from: f */
        public final long f14244f;

        /* renamed from: app.zenly.locator.s.w.d.a$c$a */
        enum C5576a {
            EXPLODE(50, 255),
            FLASH(10, 80),
            LAUNCH(50, 130);
            

            /* renamed from: e */
            public final long f14249e;

            /* renamed from: f */
            public final int f14250f;

            private C5576a(long j, int i) {
                this.f14249e = j;
                this.f14250f = i;
            }
        }

        public C5575c(C5576a aVar, long j) {
            this.f14243e = aVar;
            this.f14244f = j;
        }

        /* renamed from: a */
        public long mo13188a() {
            return this.f14244f + this.f14243e.f14249e;
        }

        /* renamed from: a */
        public int compareTo(C5575c cVar) {
            return Long.compare(this.f14244f, cVar.f14244f);
        }
    }

    /* renamed from: a */
    public static C5574b m15769a(ParticleView particleView) {
        return m15771a(particleView, new Rect(0, 0, particleView.getWidth(), particleView.getHeight()), 6);
    }

    /* renamed from: a */
    public static C5574b m15770a(ParticleView particleView, int i) {
        return m15771a(particleView, new Rect(0, 0, particleView.getWidth(), particleView.getHeight()), i);
    }

    /* renamed from: a */
    public static C5574b m15771a(ParticleView particleView, Rect rect, int i) {
        Rect rect2 = rect;
        int i2 = i;
        Handler handler = new Handler();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList<C5575c> arrayList = new ArrayList<>();
        Point point = new Point(rect.centerX(), rect2.bottom);
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int[] iArr2 = f14237a;
            iArr[i3] = C0540a.m2536a(particleView.getContext(), iArr2[i3 % iArr2.length]);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            int a = C3238u.m10270a(i4, i2);
            int i5 = iArr[a];
            iArr[a] = iArr[i4];
            iArr[i4] = i5;
        }
        int i6 = 0;
        while (i6 < i2) {
            int a2 = C3238u.m10270a(rect2.left, rect2.right);
            int i7 = rect2.top;
            int i8 = rect2.bottom;
            C3166a aVar = new C3166a(point, new Point(a2, i7 + C3238u.m10270a((i8 - i7) / 5, (i8 - i7) / 4)), C3238u.m10270a(rect.width() / 2, rect.width()));
            aVar.mo9582a(iArr[i6]);
            C3165b a3 = aVar.mo9583a();
            C3163c cVar = new C3163c(particleView.getContext(), a3);
            particleView.mo9542a((ParticleAnimation) cVar);
            arrayDeque.add(cVar);
            long j = ((long) i6) * 200;
            arrayList.add(new C5575c(C5576a.LAUNCH, j));
            int i9 = i6;
            arrayList.add(new C5575c(C5576a.EXPLODE, j + a3.mo9580a()));
            int i10 = 0;
            while (i10 < a3.mo9581b().size()) {
                if (i10 % i2 == 0 || i10 == a3.mo9581b().size() - 1) {
                    arrayList.add(new C5575c(C5576a.FLASH, j + ((C3167b) a3.mo9581b().get(i10)).mo9584a()));
                }
                i10++;
                Rect rect3 = rect;
                i2 = i;
            }
            i6 = i9 + 1;
            rect2 = rect;
            i2 = i;
        }
        ParticleView particleView2 = particleView;
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        C5575c cVar2 = null;
        for (C5575c cVar3 : arrayList) {
            if (cVar2 == null || cVar3.f14244f > cVar2.mo13188a()) {
                if (cVar2 != null) {
                    arrayList2.add(Long.valueOf(cVar3.f14244f - cVar2.mo13188a()));
                    arrayList3.add(Integer.valueOf(0));
                }
                arrayList2.add(Long.valueOf(cVar3.f14243e.f14249e));
                arrayList3.add(Integer.valueOf(cVar3.f14243e.f14250f));
            } else if (cVar3.f14243e.f14250f <= cVar2.f14243e.f14250f) {
                cVar3 = cVar2;
            } else if (cVar3.f14244f == cVar2.f14244f) {
                arrayList2.remove(arrayList2.size() - 1);
                arrayList2.add(Long.valueOf(cVar3.f14243e.f14249e));
                arrayList3.remove(arrayList3.size() - 1);
                arrayList3.add(Integer.valueOf(cVar3.f14243e.f14250f));
            } else {
                arrayList2.remove(arrayList2.size() - 1);
                arrayList2.add(Long.valueOf(cVar3.f14244f - cVar2.f14244f));
                arrayList2.add(Long.valueOf(cVar3.f14243e.f14249e));
                arrayList3.add(Integer.valueOf(cVar3.f14243e.f14250f));
            }
            cVar2 = cVar3;
        }
        long[] jArr = new long[arrayList2.size()];
        int[] iArr3 = new int[arrayList2.size()];
        for (int i11 = 0; i11 < jArr.length; i11++) {
            jArr[i11] = ((Long) arrayList2.get(i11)).longValue();
            iArr3[i11] = ((Integer) arrayList3.get(i11)).intValue();
        }
        C5502b a4 = C5502b.m15610a(particleView.getContext());
        C5574b bVar = new C5574b(a4, null);
        new C5573a(bVar, arrayDeque, handler).run();
        a4.mo13132a(jArr, iArr3, -1);
        return bVar;
    }
}
