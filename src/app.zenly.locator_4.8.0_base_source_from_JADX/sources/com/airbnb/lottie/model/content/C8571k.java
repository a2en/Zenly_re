package com.airbnb.lottie.model.content;

import android.graphics.PointF;
import com.airbnb.lottie.model.C8541a;
import com.airbnb.lottie.p289q.C8654d;
import com.airbnb.lottie.p289q.C8657g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.model.content.k */
public class C8571k {

    /* renamed from: a */
    private final List<C8541a> f21960a;

    /* renamed from: b */
    private PointF f21961b;

    /* renamed from: c */
    private boolean f21962c;

    public C8571k(PointF pointF, boolean z, List<C8541a> list) {
        this.f21961b = pointF;
        this.f21962c = z;
        this.f21960a = new ArrayList(list);
    }

    /* renamed from: a */
    private void m19866a(float f, float f2) {
        if (this.f21961b == null) {
            this.f21961b = new PointF();
        }
        this.f21961b.set(f, f2);
    }

    /* renamed from: b */
    public PointF mo23125b() {
        return this.f21961b;
    }

    /* renamed from: c */
    public boolean mo23126c() {
        return this.f21962c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ShapeData{numCurves=");
        sb.append(this.f21960a.size());
        sb.append("closed=");
        sb.append(this.f21962c);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public List<C8541a> mo23123a() {
        return this.f21960a;
    }

    public C8571k() {
        this.f21960a = new ArrayList();
    }

    /* renamed from: a */
    public void mo23124a(C8571k kVar, C8571k kVar2, float f) {
        if (this.f21961b == null) {
            this.f21961b = new PointF();
        }
        this.f21962c = kVar.mo23126c() || kVar2.mo23126c();
        if (kVar.mo23123a().size() != kVar2.mo23123a().size()) {
            StringBuilder sb = new StringBuilder();
            sb.append("Curves must have the same number of control points. Shape 1: ");
            sb.append(kVar.mo23123a().size());
            sb.append("\tShape 2: ");
            sb.append(kVar2.mo23123a().size());
            C8654d.m20155b(sb.toString());
        }
        int min = Math.min(kVar.mo23123a().size(), kVar2.mo23123a().size());
        if (this.f21960a.size() < min) {
            for (int size = this.f21960a.size(); size < min; size++) {
                this.f21960a.add(new C8541a());
            }
        } else if (this.f21960a.size() > min) {
            for (int size2 = this.f21960a.size() - 1; size2 >= min; size2--) {
                List<C8541a> list = this.f21960a;
                list.remove(list.size() - 1);
            }
        }
        PointF b = kVar.mo23125b();
        PointF b2 = kVar2.mo23125b();
        m19866a(C8657g.m20191c(b.x, b2.x, f), C8657g.m20191c(b.y, b2.y, f));
        for (int size3 = this.f21960a.size() - 1; size3 >= 0; size3--) {
            C8541a aVar = (C8541a) kVar.mo23123a().get(size3);
            C8541a aVar2 = (C8541a) kVar2.mo23123a().get(size3);
            PointF a = aVar.mo23039a();
            PointF b3 = aVar.mo23041b();
            PointF c = aVar.mo23043c();
            PointF a2 = aVar2.mo23039a();
            PointF b4 = aVar2.mo23041b();
            PointF c2 = aVar2.mo23043c();
            ((C8541a) this.f21960a.get(size3)).mo23040a(C8657g.m20191c(a.x, a2.x, f), C8657g.m20191c(a.y, a2.y, f));
            ((C8541a) this.f21960a.get(size3)).mo23042b(C8657g.m20191c(b3.x, b4.x, f), C8657g.m20191c(b3.y, b4.y, f));
            ((C8541a) this.f21960a.get(size3)).mo23044c(C8657g.m20191c(c.x, c2.x, f), C8657g.m20191c(c.y, c2.y, f));
        }
    }
}
