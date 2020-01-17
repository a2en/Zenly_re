package com.airbnb.lottie.p287p;

import com.airbnb.lottie.p287p.p288k0.C8630c.C8631a;
import com.appsflyer.share.Constants;

/* renamed from: com.airbnb.lottie.p.h0 */
class C8622h0 {

    /* renamed from: a */
    private static C8631a f22151a = C8631a.m20077a("nm", Constants.URL_CAMPAIGN, "w", "o", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b */
    private static final C8631a f22152b = C8631a.m20077a("n", "v");

    /* JADX WARNING: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x009e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.airbnb.lottie.model.content.C8575o m20051a(com.airbnb.lottie.p287p.p288k0.C8630c r17, com.airbnb.lottie.C8506c r18) throws java.io.IOException {
        /*
            r0 = r17
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x0011:
            boolean r13 = r17.mo23233f()
            if (r13 == 0) goto L_0x0115
            com.airbnb.lottie.p.k0.c$a r13 = f22151a
            int r13 = r0.mo23225a(r13)
            r14 = 1
            switch(r13) {
                case 0: goto L_0x010c;
                case 1: goto L_0x0103;
                case 2: goto L_0x00fa;
                case 3: goto L_0x00f1;
                case 4: goto L_0x00e1;
                case 5: goto L_0x00d0;
                case 6: goto L_0x00c6;
                case 7: goto L_0x00bd;
                case 8: goto L_0x0028;
                default: goto L_0x0021;
            }
        L_0x0021:
            r1 = r18
            r2 = 0
            r17.mo23240m()
            goto L_0x0011
        L_0x0028:
            r17.mo23227a()
        L_0x002b:
            boolean r13 = r17.mo23233f()
            if (r13 == 0) goto L_0x00a4
            r17.mo23229b()
            r13 = 0
            r15 = 0
        L_0x0036:
            boolean r16 = r17.mo23233f()
            if (r16 == 0) goto L_0x0057
            com.airbnb.lottie.p.k0.c$a r2 = f22152b
            int r2 = r0.mo23225a(r2)
            if (r2 == 0) goto L_0x0052
            if (r2 == r14) goto L_0x004d
            r17.mo23239l()
            r17.mo23240m()
            goto L_0x0036
        L_0x004d:
            com.airbnb.lottie.model.animatable.b r15 = com.airbnb.lottie.p287p.C8613d.m20035c(r17, r18)
            goto L_0x0036
        L_0x0052:
            java.lang.String r13 = r17.mo23238k()
            goto L_0x0036
        L_0x0057:
            r17.mo23231d()
            int r2 = r13.hashCode()
            r1 = 100
            r14 = 2
            if (r2 == r1) goto L_0x0080
            r1 = 103(0x67, float:1.44E-43)
            if (r2 == r1) goto L_0x0076
            r1 = 111(0x6f, float:1.56E-43)
            if (r2 == r1) goto L_0x006c
            goto L_0x008a
        L_0x006c:
            java.lang.String r1 = "o"
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x008a
            r1 = 0
            goto L_0x008b
        L_0x0076:
            java.lang.String r1 = "g"
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x008a
            r1 = 2
            goto L_0x008b
        L_0x0080:
            java.lang.String r1 = "d"
            boolean r1 = r13.equals(r1)
            if (r1 == 0) goto L_0x008a
            r1 = 1
            goto L_0x008b
        L_0x008a:
            r1 = -1
        L_0x008b:
            if (r1 == 0) goto L_0x009e
            r2 = 1
            if (r1 == r2) goto L_0x0095
            if (r1 == r14) goto L_0x0095
            r1 = r18
            goto L_0x00a2
        L_0x0095:
            r1 = r18
            r1.mo22929a(r2)
            r3.add(r15)
            goto L_0x00a2
        L_0x009e:
            r1 = r18
            r2 = 1
            r5 = r15
        L_0x00a2:
            r14 = 1
            goto L_0x002b
        L_0x00a4:
            r1 = r18
            r2 = 1
            r17.mo23230c()
            int r13 = r3.size()
            if (r13 != r2) goto L_0x00ba
            r2 = 0
            java.lang.Object r13 = r3.get(r2)
            r3.add(r13)
            goto L_0x0011
        L_0x00ba:
            r2 = 0
            goto L_0x0011
        L_0x00bd:
            r1 = r18
            r2 = 0
            boolean r12 = r17.mo23234g()
            goto L_0x0011
        L_0x00c6:
            r1 = r18
            r2 = 0
            double r13 = r17.mo23235h()
            float r11 = (float) r13
            goto L_0x0011
        L_0x00d0:
            r1 = r18
            r2 = 0
            com.airbnb.lottie.model.content.o$c[] r10 = com.airbnb.lottie.model.content.C8575o.C8578c.values()
            int r13 = r17.mo23236i()
            r14 = 1
            int r13 = r13 - r14
            r10 = r10[r13]
            goto L_0x0011
        L_0x00e1:
            r1 = r18
            r2 = 0
            com.airbnb.lottie.model.content.o$b[] r9 = com.airbnb.lottie.model.content.C8575o.C8577b.values()
            int r13 = r17.mo23236i()
            int r13 = r13 - r14
            r9 = r9[r13]
            goto L_0x0011
        L_0x00f1:
            r1 = r18
            r2 = 0
            com.airbnb.lottie.model.animatable.d r7 = com.airbnb.lottie.p287p.C8613d.m20036d(r17, r18)
            goto L_0x0011
        L_0x00fa:
            r1 = r18
            r2 = 0
            com.airbnb.lottie.model.animatable.b r8 = com.airbnb.lottie.p287p.C8613d.m20035c(r17, r18)
            goto L_0x0011
        L_0x0103:
            r1 = r18
            r2 = 0
            com.airbnb.lottie.model.animatable.a r6 = com.airbnb.lottie.p287p.C8613d.m20029a(r17, r18)
            goto L_0x0011
        L_0x010c:
            r1 = r18
            r2 = 0
            java.lang.String r4 = r17.mo23238k()
            goto L_0x0011
        L_0x0115:
            com.airbnb.lottie.model.content.o r13 = new com.airbnb.lottie.model.content.o
            r0 = r13
            r1 = r4
            r2 = r5
            r4 = r6
            r5 = r7
            r6 = r8
            r7 = r9
            r8 = r10
            r9 = r11
            r10 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p287p.C8622h0.m20051a(com.airbnb.lottie.p.k0.c, com.airbnb.lottie.c):com.airbnb.lottie.model.content.o");
    }
}
