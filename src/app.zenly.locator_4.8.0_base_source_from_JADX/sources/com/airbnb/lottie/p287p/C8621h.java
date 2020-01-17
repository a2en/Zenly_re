package com.airbnb.lottie.p287p;

import com.airbnb.lottie.model.C8555b;
import com.airbnb.lottie.model.C8555b.C8556a;
import com.airbnb.lottie.p287p.p288k0.C8630c;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8631a;
import java.io.IOException;

/* renamed from: com.airbnb.lottie.p.h */
public class C8621h implements C8626j0<C8555b> {

    /* renamed from: a */
    public static final C8621h f22149a = new C8621h();

    /* renamed from: b */
    private static final C8631a f22150b = C8631a.m20077a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private C8621h() {
    }

    /* renamed from: a */
    public C8555b m20050a(C8630c cVar, float f) throws IOException {
        C8556a aVar = C8556a.CENTER;
        cVar.mo23229b();
        C8556a aVar2 = aVar;
        String str = null;
        String str2 = null;
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        while (cVar.mo23233f()) {
            switch (cVar.mo23225a(f22150b)) {
                case 0:
                    str = cVar.mo23238k();
                    break;
                case 1:
                    str2 = cVar.mo23238k();
                    break;
                case 2:
                    d = cVar.mo23235h();
                    break;
                case 3:
                    int i4 = cVar.mo23236i();
                    if (i4 <= C8556a.CENTER.ordinal() && i4 >= 0) {
                        aVar2 = C8556a.values()[i4];
                        break;
                    } else {
                        aVar2 = C8556a.CENTER;
                        break;
                    }
                case 4:
                    i = cVar.mo23236i();
                    break;
                case 5:
                    d2 = cVar.mo23235h();
                    break;
                case 6:
                    d3 = cVar.mo23235h();
                    break;
                case 7:
                    i2 = C8639p.m20114a(cVar);
                    break;
                case 8:
                    i3 = C8639p.m20114a(cVar);
                    break;
                case 9:
                    d4 = cVar.mo23235h();
                    break;
                case 10:
                    z = cVar.mo23234g();
                    break;
                default:
                    cVar.mo23239l();
                    cVar.mo23240m();
                    break;
            }
        }
        C8630c cVar2 = cVar;
        cVar.mo23231d();
        C8555b bVar = new C8555b(str, str2, d, aVar2, i, d2, d3, i2, i3, d4, z);
        return bVar;
    }
}
