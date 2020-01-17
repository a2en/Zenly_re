package com.airbnb.lottie.p287p;

import android.graphics.Color;
import android.graphics.Rect;
import com.airbnb.lottie.C8506c;
import com.airbnb.lottie.model.animatable.C8543b;
import com.airbnb.lottie.model.animatable.C8551j;
import com.airbnb.lottie.model.animatable.C8552k;
import com.airbnb.lottie.model.animatable.C8553l;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.p284i.C8592d;
import com.airbnb.lottie.model.p284i.C8592d.C8593a;
import com.airbnb.lottie.model.p284i.C8592d.C8594b;
import com.airbnb.lottie.p287p.p288k0.C8630c;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8631a;
import com.airbnb.lottie.p289q.C8658h;
import com.airbnb.lottie.value.C8659a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.p.s */
public class C8643s {

    /* renamed from: a */
    private static final C8631a f22202a = C8631a.m20077a("nm", "ind", "refId", "ty", "parent", "sw", "sh", "sc", "ks", "tt", "masksProperties", "shapes", "t", "ef", "sr", "st", "w", "h", "ip", "op", "tm", "cl", "hd");

    /* renamed from: b */
    private static final C8631a f22203b = C8631a.m20077a("d", "a");

    /* renamed from: c */
    private static final C8631a f22204c = C8631a.m20077a("nm");

    /* renamed from: a */
    public static C8592d m20129a(C8506c cVar) {
        C8506c cVar2 = cVar;
        Rect a = cVar.mo22924a();
        List emptyList = Collections.emptyList();
        C8593a aVar = C8593a.PRE_COMP;
        List emptyList2 = Collections.emptyList();
        C8553l lVar = r4;
        C8553l lVar2 = new C8553l();
        C8592d dVar = new C8592d(emptyList, cVar2, "__container", -1, aVar, -1, null, emptyList2, lVar, 0, 0, 0, 0.0f, 0.0f, a.width(), a.height(), null, null, Collections.emptyList(), C8594b.NONE, null, false);
        return dVar;
    }

    /* renamed from: a */
    public static C8592d m20130a(C8630c cVar, C8506c cVar2) throws IOException {
        float f;
        ArrayList arrayList;
        C8630c cVar3 = cVar;
        C8506c cVar4 = cVar2;
        C8594b bVar = C8594b.NONE;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        cVar.mo23229b();
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(0.0f);
        C8594b bVar2 = bVar;
        C8593a aVar = null;
        String str = null;
        C8553l lVar = null;
        C8551j jVar = null;
        C8552k kVar = null;
        C8543b bVar3 = null;
        long j = -1;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 1.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        float f5 = 0.0f;
        boolean z = false;
        long j2 = 0;
        Object obj = null;
        String str2 = "UNSET";
        while (cVar.mo23233f()) {
            switch (cVar3.mo23225a(f22202a)) {
                case 0:
                    str2 = cVar.mo23238k();
                    break;
                case 1:
                    j2 = (long) cVar.mo23236i();
                    break;
                case 2:
                    str = cVar.mo23238k();
                    break;
                case 3:
                    int i6 = cVar.mo23236i();
                    if (i6 >= C8593a.UNKNOWN.ordinal()) {
                        aVar = C8593a.UNKNOWN;
                        break;
                    } else {
                        aVar = C8593a.values()[i6];
                        break;
                    }
                case 4:
                    j = (long) cVar.mo23236i();
                    break;
                case 5:
                    i = (int) (((float) cVar.mo23236i()) * C8658h.m20192a());
                    break;
                case 6:
                    i2 = (int) (((float) cVar.mo23236i()) * C8658h.m20192a());
                    break;
                case 7:
                    i3 = Color.parseColor(cVar.mo23238k());
                    break;
                case 8:
                    lVar = C8611c.m20020a(cVar, cVar2);
                    break;
                case 9:
                    bVar2 = C8594b.values()[cVar.mo23236i()];
                    cVar4.mo22926a(1);
                    break;
                case 10:
                    cVar.mo23227a();
                    while (cVar.mo23233f()) {
                        arrayList2.add(C8645u.m20137a(cVar, cVar2));
                    }
                    cVar4.mo22926a(arrayList2.size());
                    cVar.mo23230c();
                    break;
                case 11:
                    cVar.mo23227a();
                    while (cVar.mo23233f()) {
                        ContentModel a = C8619g.m20047a(cVar, cVar2);
                        if (a != null) {
                            arrayList3.add(a);
                        }
                    }
                    cVar.mo23230c();
                    break;
                case 12:
                    cVar.mo23229b();
                    while (cVar.mo23233f()) {
                        int a2 = cVar3.mo23225a(f22203b);
                        if (a2 == 0) {
                            jVar = C8613d.m20034b(cVar, cVar2);
                        } else if (a2 != 1) {
                            cVar.mo23239l();
                            cVar.mo23240m();
                        } else {
                            cVar.mo23227a();
                            if (cVar.mo23233f()) {
                                kVar = C8609b.m20017a(cVar, cVar2);
                            }
                            while (cVar.mo23233f()) {
                                cVar.mo23240m();
                            }
                            cVar.mo23230c();
                        }
                    }
                    cVar.mo23231d();
                    break;
                case 13:
                    cVar.mo23227a();
                    ArrayList arrayList4 = new ArrayList();
                    while (cVar.mo23233f()) {
                        cVar.mo23229b();
                        while (cVar.mo23233f()) {
                            if (cVar3.mo23225a(f22204c) != 0) {
                                cVar.mo23239l();
                                cVar.mo23240m();
                            } else {
                                arrayList4.add(cVar.mo23238k());
                            }
                        }
                        cVar.mo23231d();
                    }
                    cVar.mo23230c();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Lottie doesn't support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: ");
                    sb.append(arrayList4);
                    cVar4.mo22928a(sb.toString());
                    break;
                case 14:
                    f4 = (float) cVar.mo23235h();
                    break;
                case 15:
                    f5 = (float) cVar.mo23235h();
                    break;
                case 16:
                    i4 = (int) (((float) cVar.mo23236i()) * C8658h.m20192a());
                    break;
                case 17:
                    i5 = (int) (((float) cVar.mo23236i()) * C8658h.m20192a());
                    break;
                case 18:
                    f2 = (float) cVar.mo23235h();
                    break;
                case 19:
                    f3 = (float) cVar.mo23235h();
                    break;
                case 20:
                    bVar3 = C8613d.m20030a(cVar3, cVar4, false);
                    break;
                case 21:
                    obj = cVar.mo23238k();
                    break;
                case 22:
                    z = cVar.mo23234g();
                    break;
                default:
                    cVar.mo23239l();
                    cVar.mo23240m();
                    break;
            }
        }
        cVar.mo23231d();
        float f6 = f2 / f4;
        float f7 = f3 / f4;
        ArrayList arrayList5 = new ArrayList();
        if (f6 > 0.0f) {
            C8659a aVar2 = r0;
            f = f4;
            arrayList = arrayList5;
            C8659a aVar3 = new C8659a(cVar2, valueOf2, valueOf2, null, 0.0f, Float.valueOf(f6));
            arrayList.add(aVar2);
        } else {
            f = f4;
            arrayList = arrayList5;
        }
        if (f7 <= 0.0f) {
            f7 = cVar2.mo22936e();
        }
        C8506c cVar5 = cVar2;
        C8659a aVar4 = new C8659a(cVar5, valueOf, valueOf, null, f6, Float.valueOf(f7));
        arrayList.add(aVar4);
        C8659a aVar5 = new C8659a(cVar5, valueOf2, valueOf2, null, f7, Float.valueOf(Float.MAX_VALUE));
        arrayList.add(aVar5);
        if (str2.endsWith(".ai") || "ai".equals(obj)) {
            cVar4.mo22928a("Convert your Illustrator layers to shape layers.");
        }
        C8592d dVar = new C8592d(arrayList3, cVar2, str2, j2, aVar, j, str, arrayList2, lVar, i, i2, i3, f, f5, i4, i5, jVar, kVar, arrayList, bVar2, bVar3, z);
        return dVar;
    }
}
