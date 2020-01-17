package com.airbnb.lottie.p287p;

/* renamed from: com.airbnb.lottie.p.u */
class C8645u {
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0071  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.airbnb.lottie.model.content.C8563f m20137a(com.airbnb.lottie.p287p.p288k0.C8630c r12, com.airbnb.lottie.C8506c r13) throws java.io.IOException {
        /*
            r12.mo23229b()
            r0 = 0
            r1 = 0
            r2 = r1
            r3 = r2
            r4 = 0
        L_0x0008:
            boolean r5 = r12.mo23233f()
            if (r5 == 0) goto L_0x00d7
            java.lang.String r5 = r12.mo23237j()
            int r6 = r5.hashCode()
            r7 = 111(0x6f, float:1.56E-43)
            r8 = 3
            r9 = -1
            r10 = 2
            r11 = 1
            if (r6 == r7) goto L_0x004b
            r7 = 3588(0xe04, float:5.028E-42)
            if (r6 == r7) goto L_0x0041
            r7 = 104433(0x197f1, float:1.46342E-40)
            if (r6 == r7) goto L_0x0037
            r7 = 3357091(0x3339a3, float:4.704286E-39)
            if (r6 == r7) goto L_0x002d
            goto L_0x0055
        L_0x002d:
            java.lang.String r6 = "mode"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0055
            r6 = 0
            goto L_0x0056
        L_0x0037:
            java.lang.String r6 = "inv"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0055
            r6 = 3
            goto L_0x0056
        L_0x0041:
            java.lang.String r6 = "pt"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0055
            r6 = 1
            goto L_0x0056
        L_0x004b:
            java.lang.String r6 = "o"
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x0055
            r6 = 2
            goto L_0x0056
        L_0x0055:
            r6 = -1
        L_0x0056:
            if (r6 == 0) goto L_0x0071
            if (r6 == r11) goto L_0x006c
            if (r6 == r10) goto L_0x0067
            if (r6 == r8) goto L_0x0062
            r12.mo23240m()
            goto L_0x0008
        L_0x0062:
            boolean r4 = r12.mo23234g()
            goto L_0x0008
        L_0x0067:
            com.airbnb.lottie.model.animatable.d r3 = com.airbnb.lottie.p287p.C8613d.m20036d(r12, r13)
            goto L_0x0008
        L_0x006c:
            com.airbnb.lottie.model.animatable.h r2 = com.airbnb.lottie.p287p.C8613d.m20039g(r12, r13)
            goto L_0x0008
        L_0x0071:
            java.lang.String r1 = r12.mo23238k()
            int r6 = r1.hashCode()
            r7 = 97
            if (r6 == r7) goto L_0x009a
            r7 = 105(0x69, float:1.47E-43)
            if (r6 == r7) goto L_0x0090
            r7 = 115(0x73, float:1.61E-43)
            if (r6 == r7) goto L_0x0086
            goto L_0x00a3
        L_0x0086:
            java.lang.String r6 = "s"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00a3
            r9 = 1
            goto L_0x00a3
        L_0x0090:
            java.lang.String r6 = "i"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00a3
            r9 = 2
            goto L_0x00a3
        L_0x009a:
            java.lang.String r6 = "a"
            boolean r1 = r1.equals(r6)
            if (r1 == 0) goto L_0x00a3
            r9 = 0
        L_0x00a3:
            if (r9 == 0) goto L_0x00d3
            if (r9 == r11) goto L_0x00cf
            if (r9 == r10) goto L_0x00c6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r6 = "Unknown mask mode "
            r1.append(r6)
            r1.append(r5)
            java.lang.String r5 = ". Defaulting to Add."
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.airbnb.lottie.p289q.C8654d.m20155b(r1)
            com.airbnb.lottie.model.content.f$a r1 = com.airbnb.lottie.model.content.C8563f.C8564a.MASK_MODE_ADD
            goto L_0x0008
        L_0x00c6:
            java.lang.String r1 = "Animation contains intersect masks. They are not supported but will be treated like add masks."
            r13.mo22928a(r1)
            com.airbnb.lottie.model.content.f$a r1 = com.airbnb.lottie.model.content.C8563f.C8564a.MASK_MODE_INTERSECT
            goto L_0x0008
        L_0x00cf:
            com.airbnb.lottie.model.content.f$a r1 = com.airbnb.lottie.model.content.C8563f.C8564a.MASK_MODE_SUBTRACT
            goto L_0x0008
        L_0x00d3:
            com.airbnb.lottie.model.content.f$a r1 = com.airbnb.lottie.model.content.C8563f.C8564a.MASK_MODE_ADD
            goto L_0x0008
        L_0x00d7:
            r12.mo23231d()
            com.airbnb.lottie.model.content.f r12 = new com.airbnb.lottie.model.content.f
            r12.<init>(r1, r2, r3, r4)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p287p.C8645u.m20137a(com.airbnb.lottie.p.k0.c, com.airbnb.lottie.c):com.airbnb.lottie.model.content.f");
    }
}
