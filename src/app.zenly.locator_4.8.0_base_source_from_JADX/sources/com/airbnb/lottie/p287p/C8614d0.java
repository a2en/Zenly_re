package com.airbnb.lottie.p287p;

import android.graphics.PointF;
import com.airbnb.lottie.model.C8541a;
import com.airbnb.lottie.model.content.C8571k;
import com.airbnb.lottie.p287p.p288k0.C8630c;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8631a;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8632b;
import com.airbnb.lottie.p289q.C8657g;
import com.appsflyer.share.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.p.d0 */
public class C8614d0 implements C8626j0<C8571k> {

    /* renamed from: a */
    public static final C8614d0 f22141a = new C8614d0();

    /* renamed from: b */
    private static final C8631a f22142b = C8631a.m20077a(Constants.URL_CAMPAIGN, "v", "i", "o");

    private C8614d0() {
    }

    /* renamed from: a */
    public C8571k m20041a(C8630c cVar, float f) throws IOException {
        if (cVar.peek() == C8632b.BEGIN_ARRAY) {
            cVar.mo23227a();
        }
        cVar.mo23229b();
        List list = null;
        List list2 = null;
        List list3 = null;
        boolean z = false;
        while (cVar.mo23233f()) {
            int a = cVar.mo23225a(f22142b);
            if (a == 0) {
                z = cVar.mo23234g();
            } else if (a == 1) {
                list = C8639p.m20120e(cVar, f);
            } else if (a == 2) {
                list2 = C8639p.m20120e(cVar, f);
            } else if (a != 3) {
                cVar.mo23239l();
                cVar.mo23240m();
            } else {
                list3 = C8639p.m20120e(cVar, f);
            }
        }
        cVar.mo23231d();
        if (cVar.peek() == C8632b.END_ARRAY) {
            cVar.mo23230c();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (list.isEmpty()) {
            return new C8571k(new PointF(), false, Collections.emptyList());
        } else {
            int size = list.size();
            PointF pointF = (PointF) list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = (PointF) list.get(i);
                int i2 = i - 1;
                arrayList.add(new C8541a(C8657g.m20186a((PointF) list.get(i2), (PointF) list3.get(i2)), C8657g.m20186a(pointF2, (PointF) list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = (PointF) list.get(0);
                int i3 = size - 1;
                arrayList.add(new C8541a(C8657g.m20186a((PointF) list.get(i3), (PointF) list3.get(i3)), C8657g.m20186a(pointF3, (PointF) list2.get(0)), pointF3));
            }
            return new C8571k(pointF, z, arrayList);
        }
    }
}
