package com.airbnb.lottie.p287p;

import android.graphics.Rect;
import com.airbnb.lottie.C8506c;
import com.airbnb.lottie.C8531f;
import com.airbnb.lottie.model.C8557c;
import com.airbnb.lottie.model.C8581d;
import com.airbnb.lottie.model.C8584g;
import com.airbnb.lottie.model.p284i.C8592d;
import com.airbnb.lottie.model.p284i.C8592d.C8593a;
import com.airbnb.lottie.p287p.p288k0.C8630c;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8631a;
import com.airbnb.lottie.p289q.C8654d;
import com.airbnb.lottie.p289q.C8658h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p214e.p228e.C7576d;
import p214e.p228e.C7585h;

/* renamed from: com.airbnb.lottie.p.t */
public class C8644t {

    /* renamed from: a */
    private static final C8631a f22205a = C8631a.m20077a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* renamed from: b */
    static C8631a f22206b = C8631a.m20077a("id", "layers", "w", "h", "p", "u");

    /* renamed from: c */
    private static final C8631a f22207c = C8631a.m20077a("list");

    /* renamed from: d */
    private static final C8631a f22208d = C8631a.m20077a("cm", "tm", "dr");

    /* renamed from: a */
    public static C8506c m20131a(C8630c cVar) throws IOException {
        ArrayList arrayList;
        HashMap hashMap;
        C8630c cVar2 = cVar;
        float a = C8658h.m20192a();
        C7576d dVar = new C7576d();
        ArrayList arrayList2 = new ArrayList();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        ArrayList arrayList3 = new ArrayList();
        C7585h hVar = new C7585h();
        C8506c cVar3 = new C8506c();
        cVar.mo23229b();
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (cVar.mo23233f()) {
            switch (cVar2.mo23225a(f22205a)) {
                case 0:
                    HashMap hashMap5 = hashMap4;
                    ArrayList arrayList4 = arrayList3;
                    i = cVar.mo23236i();
                    continue;
                case 1:
                    HashMap hashMap6 = hashMap4;
                    ArrayList arrayList5 = arrayList3;
                    i2 = cVar.mo23236i();
                    continue;
                case 2:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f = (float) cVar.mo23235h();
                    break;
                case 3:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f2 = ((float) cVar.mo23235h()) - 0.01f;
                    break;
                case 4:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    f3 = (float) cVar.mo23235h();
                    break;
                case 5:
                    String[] split = cVar.mo23238k().split("\\.");
                    if (!C8658h.m20203a(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]), 4, 4, 0)) {
                        cVar3.mo22928a("Lottie only supports bodymovin >= 4.4.0");
                        break;
                    }
                    break;
                case 6:
                    m20134a(cVar2, cVar3, (List<C8592d>) arrayList2, dVar);
                    break;
                case 7:
                    m20135a(cVar2, cVar3, (Map<String, List<C8592d>>) hashMap2, (Map<String, C8531f>) hashMap3);
                    break;
                case 8:
                    m20136a(cVar2, hashMap4);
                    break;
                case 9:
                    m20132a(cVar2, cVar3, hVar);
                    break;
                case 10:
                    m20133a(cVar2, cVar3, (List<C8584g>) arrayList3);
                    break;
                default:
                    hashMap = hashMap4;
                    arrayList = arrayList3;
                    cVar.mo23239l();
                    cVar.mo23240m();
                    break;
            }
            hashMap = hashMap4;
            arrayList = arrayList3;
            hashMap4 = hashMap;
            arrayList3 = arrayList;
            cVar2 = cVar;
        }
        HashMap hashMap7 = hashMap4;
        ArrayList arrayList6 = arrayList3;
        cVar3.mo22927a(new Rect(0, 0, (int) (((float) i) * a), (int) (((float) i2) * a)), f, f2, f3, arrayList2, dVar, hashMap2, hashMap3, hVar, hashMap4, arrayList3);
        return cVar3;
    }

    /* renamed from: a */
    private static void m20134a(C8630c cVar, C8506c cVar2, List<C8592d> list, C7576d<C8592d> dVar) throws IOException {
        cVar.mo23227a();
        int i = 0;
        while (cVar.mo23233f()) {
            C8592d a = C8643s.m20130a(cVar, cVar2);
            if (a.mo23193d() == C8593a.IMAGE) {
                i++;
            }
            list.add(a);
            dVar.mo19514c(a.mo23191b(), a);
            if (i > 4) {
                StringBuilder sb = new StringBuilder();
                sb.append("You have ");
                sb.append(i);
                sb.append(" images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                C8654d.m20155b(sb.toString());
            }
        }
        cVar.mo23230c();
    }

    /* renamed from: a */
    private static void m20135a(C8630c cVar, C8506c cVar2, Map<String, List<C8592d>> map, Map<String, C8531f> map2) throws IOException {
        cVar.mo23227a();
        while (cVar.mo23233f()) {
            ArrayList arrayList = new ArrayList();
            C7576d dVar = new C7576d();
            cVar.mo23229b();
            String str = null;
            String str2 = null;
            String str3 = null;
            int i = 0;
            int i2 = 0;
            while (cVar.mo23233f()) {
                int a = cVar.mo23225a(f22206b);
                if (a == 0) {
                    str = cVar.mo23238k();
                } else if (a == 1) {
                    cVar.mo23227a();
                    while (cVar.mo23233f()) {
                        C8592d a2 = C8643s.m20130a(cVar, cVar2);
                        dVar.mo19514c(a2.mo23191b(), a2);
                        arrayList.add(a2);
                    }
                    cVar.mo23230c();
                } else if (a == 2) {
                    i = cVar.mo23236i();
                } else if (a == 3) {
                    i2 = cVar.mo23236i();
                } else if (a == 4) {
                    str2 = cVar.mo23238k();
                } else if (a != 5) {
                    cVar.mo23239l();
                    cVar.mo23240m();
                } else {
                    str3 = cVar.mo23238k();
                }
            }
            cVar.mo23231d();
            if (str2 != null) {
                C8531f fVar = new C8531f(i, i2, str, str2, str3);
                map2.put(fVar.mo23025d(), fVar);
            } else {
                map.put(str, arrayList);
            }
        }
        cVar.mo23230c();
    }

    /* renamed from: a */
    private static void m20136a(C8630c cVar, Map<String, C8557c> map) throws IOException {
        cVar.mo23229b();
        while (cVar.mo23233f()) {
            if (cVar.mo23225a(f22207c) != 0) {
                cVar.mo23239l();
                cVar.mo23240m();
            } else {
                cVar.mo23227a();
                while (cVar.mo23233f()) {
                    C8557c a = C8627k.m20057a(cVar);
                    map.put(a.mo23062b(), a);
                }
                cVar.mo23230c();
            }
        }
        cVar.mo23231d();
    }

    /* renamed from: a */
    private static void m20132a(C8630c cVar, C8506c cVar2, C7585h<C8581d> hVar) throws IOException {
        cVar.mo23227a();
        while (cVar.mo23233f()) {
            C8581d a = C8625j.m20055a(cVar, cVar2);
            hVar.mo19622c(a.hashCode(), a);
        }
        cVar.mo23230c();
    }

    /* renamed from: a */
    private static void m20133a(C8630c cVar, C8506c cVar2, List<C8584g> list) throws IOException {
        cVar.mo23227a();
        while (cVar.mo23233f()) {
            String str = null;
            cVar.mo23229b();
            float f = 0.0f;
            float f2 = 0.0f;
            while (cVar.mo23233f()) {
                int a = cVar.mo23225a(f22208d);
                if (a == 0) {
                    str = cVar.mo23238k();
                } else if (a == 1) {
                    f = (float) cVar.mo23235h();
                } else if (a != 2) {
                    cVar.mo23239l();
                    cVar.mo23240m();
                } else {
                    f2 = (float) cVar.mo23235h();
                }
            }
            cVar.mo23231d();
            list.add(new C8584g(str, f, f2));
        }
        cVar.mo23230c();
    }
}
