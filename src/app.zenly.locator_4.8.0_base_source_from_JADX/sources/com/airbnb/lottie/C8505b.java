package com.airbnb.lottie;

import androidx.core.p004os.C0569g;

/* renamed from: com.airbnb.lottie.b */
public class C8505b {

    /* renamed from: a */
    public static boolean f21751a = false;

    /* renamed from: b */
    private static boolean f21752b = false;

    /* renamed from: c */
    private static String[] f21753c;

    /* renamed from: d */
    private static long[] f21754d;

    /* renamed from: e */
    private static int f21755e;

    /* renamed from: f */
    private static int f21756f;

    /* renamed from: a */
    public static void m19651a(String str) {
        if (f21752b) {
            int i = f21755e;
            if (i == 20) {
                f21756f++;
                return;
            }
            f21753c[i] = str;
            f21754d[i] = System.nanoTime();
            C0569g.m2680a(str);
            f21755e++;
        }
    }

    /* renamed from: b */
    public static float m19652b(String str) {
        int i = f21756f;
        if (i > 0) {
            f21756f = i - 1;
            return 0.0f;
        } else if (!f21752b) {
            return 0.0f;
        } else {
            f21755e--;
            int i2 = f21755e;
            if (i2 == -1) {
                throw new IllegalStateException("Can't end trace section. There are none.");
            } else if (str.equals(f21753c[i2])) {
                C0569g.m2679a();
                return ((float) (System.nanoTime() - f21754d[f21755e])) / 1000000.0f;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unbalanced trace call ");
                sb.append(str);
                sb.append(". Expected ");
                sb.append(f21753c[f21755e]);
                sb.append(".");
                throw new IllegalStateException(sb.toString());
            }
        }
    }
}
