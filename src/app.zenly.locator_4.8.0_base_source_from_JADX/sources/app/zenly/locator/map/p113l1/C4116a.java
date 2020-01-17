package app.zenly.locator.map.p113l1;

/* renamed from: app.zenly.locator.map.l1.a */
public class C4116a {
    /* renamed from: a */
    public static double[] m11841a() {
        double[] dArr = new double[16];
        m11842a(dArr);
        return dArr;
    }

    /* renamed from: b */
    public static double[] m11850b(double[] dArr, double[] dArr2, double d, double d2, double d3) {
        double[] dArr3 = dArr;
        double[] dArr4 = dArr2;
        if (dArr4 == dArr3) {
            dArr3[12] = (dArr4[0] * d) + (dArr4[4] * d2) + (dArr4[8] * d3) + dArr4[12];
            dArr3[13] = (dArr4[1] * d) + (dArr4[5] * d2) + (dArr4[9] * d3) + dArr4[13];
            dArr3[14] = (dArr4[2] * d) + (dArr4[6] * d2) + (dArr4[10] * d3) + dArr4[14];
            dArr3[15] = (dArr4[3] * d) + (dArr4[7] * d2) + (dArr4[11] * d3) + dArr4[15];
        } else {
            double d4 = dArr4[0];
            double d5 = dArr4[1];
            double d6 = dArr4[2];
            double d7 = dArr4[3];
            double d8 = dArr4[4];
            double d9 = dArr4[5];
            double d10 = dArr4[6];
            double d11 = dArr4[7];
            double d12 = dArr4[8];
            double d13 = dArr4[9];
            double d14 = dArr4[10];
            double d15 = dArr4[11];
            dArr3[0] = d4;
            dArr3[1] = d5;
            dArr3[2] = d6;
            dArr3[3] = d7;
            dArr3[4] = d8;
            dArr3[5] = d9;
            dArr3[6] = d10;
            dArr3[7] = d11;
            dArr3[8] = d12;
            dArr3[9] = d13;
            dArr3[10] = d14;
            dArr3[11] = d15;
            dArr3[12] = (d4 * d) + (d8 * d2) + (d12 * d3) + dArr4[12];
            dArr3[13] = (d5 * d) + (d9 * d2) + (d13 * d3) + dArr4[13];
            dArr3[14] = (d6 * d) + (d10 * d2) + (d14 * d3) + dArr4[14];
            dArr3[15] = (d7 * d) + (d11 * d2) + (d15 * d3) + dArr4[15];
        }
        return dArr3;
    }

    /* renamed from: c */
    public static double[] m11852c(double[] dArr, double[] dArr2, double[] dArr3) {
        m11851b(dArr, dArr2, dArr3);
        m11840a(dArr, dArr, 1.0d / dArr[3]);
        return dArr;
    }

    /* renamed from: a */
    public static double[] m11842a(double[] dArr) {
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = i % 5 == 0 ? 1.0d : 0.0d;
        }
        return dArr;
    }

    /* renamed from: a */
    public static double[] m11847a(double[] dArr, double[] dArr2, double[] dArr3) {
        double d = dArr2[0];
        double d2 = dArr2[1];
        double d3 = dArr2[2];
        double d4 = dArr2[3];
        double d5 = dArr2[4];
        double d6 = dArr2[5];
        double d7 = dArr2[6];
        double d8 = dArr2[7];
        double d9 = dArr2[8];
        double d10 = dArr2[9];
        double d11 = dArr2[10];
        double d12 = dArr2[11];
        double d13 = dArr2[12];
        double d14 = dArr2[13];
        double d15 = dArr2[14];
        double d16 = dArr2[15];
        double d17 = dArr3[0];
        double d18 = dArr3[1];
        double d19 = dArr3[2];
        double d20 = dArr3[3];
        dArr[0] = (d17 * d) + (d18 * d5) + (d19 * d9) + (d20 * d13);
        dArr[1] = (d17 * d2) + (d18 * d6) + (d19 * d10) + (d20 * d14);
        dArr[2] = (d17 * d3) + (d18 * d7) + (d19 * d11) + (d20 * d15);
        dArr[3] = (d17 * d4) + (d18 * d8) + (d19 * d12) + (d20 * d16);
        double d21 = dArr3[4];
        double d22 = dArr3[5];
        double d23 = dArr3[6];
        double d24 = dArr3[7];
        dArr[4] = (d21 * d) + (d22 * d5) + (d23 * d9) + (d24 * d13);
        dArr[5] = (d21 * d2) + (d22 * d6) + (d23 * d10) + (d24 * d14);
        dArr[6] = (d21 * d3) + (d22 * d7) + (d23 * d11) + (d24 * d15);
        dArr[7] = (d21 * d4) + (d22 * d8) + (d23 * d12) + (d24 * d16);
        double d25 = dArr3[8];
        double d26 = dArr3[9];
        double d27 = dArr3[10];
        double d28 = dArr3[11];
        dArr[8] = (d25 * d) + (d26 * d5) + (d27 * d9) + (d28 * d13);
        dArr[9] = (d25 * d2) + (d26 * d6) + (d27 * d10) + (d28 * d14);
        dArr[10] = (d25 * d3) + (d26 * d7) + (d27 * d11) + (d28 * d15);
        dArr[11] = (d25 * d4) + (d26 * d8) + (d27 * d12) + (d28 * d16);
        double d29 = dArr3[12];
        double d30 = dArr3[13];
        double d31 = dArr3[14];
        double d32 = dArr3[15];
        dArr[12] = (d * d29) + (d5 * d30) + (d9 * d31) + (d13 * d32);
        dArr[13] = (d2 * d29) + (d6 * d30) + (d10 * d31) + (d14 * d32);
        dArr[14] = (d3 * d29) + (d7 * d30) + (d11 * d31) + (d15 * d32);
        dArr[15] = (d29 * d4) + (d30 * d8) + (d31 * d12) + (d32 * d16);
        return dArr;
    }

    /* renamed from: b */
    public static double[] m11851b(double[] dArr, double[] dArr2, double[] dArr3) {
        double d = dArr2[0];
        double d2 = dArr2[1];
        double d3 = dArr2[2];
        double d4 = dArr2[3];
        dArr[0] = (dArr3[0] * d) + (dArr3[4] * d2) + (dArr3[8] * d3) + (dArr3[12] * d4);
        dArr[1] = (dArr3[1] * d) + (dArr3[5] * d2) + (dArr3[9] * d3) + (dArr3[13] * d4);
        dArr[2] = (dArr3[2] * d) + (dArr3[6] * d2) + (dArr3[10] * d3) + (dArr3[14] * d4);
        dArr[3] = (dArr3[3] * d) + (dArr3[7] * d2) + (dArr3[11] * d3) + (dArr3[15] * d4);
        return dArr;
    }

    /* renamed from: b */
    public static double[] m11849b(double[] dArr, double d) {
        double sin = Math.sin(d);
        double cos = Math.cos(d);
        double d2 = dArr[0];
        double d3 = dArr[1];
        double d4 = dArr[2];
        double d5 = dArr[3];
        double d6 = dArr[4];
        double d7 = dArr[5];
        double d8 = dArr[6];
        double d9 = dArr[7];
        dArr[0] = (d2 * cos) + (d6 * sin);
        dArr[1] = (d3 * cos) + (d7 * sin);
        dArr[2] = (d4 * cos) + (d8 * sin);
        dArr[3] = (d5 * cos) + (d9 * sin);
        dArr[4] = (d6 * cos) - (d2 * sin);
        dArr[5] = (d7 * cos) - (d3 * sin);
        dArr[6] = (d8 * cos) - (d4 * sin);
        dArr[7] = (d9 * cos) - (d5 * sin);
        return dArr;
    }

    /* renamed from: a */
    public static double[] m11845a(double[] dArr, double[] dArr2) {
        double d = dArr2[0];
        double d2 = dArr2[1];
        double d3 = dArr2[2];
        double d4 = dArr2[3];
        double d5 = dArr2[4];
        double d6 = dArr2[5];
        double d7 = dArr2[6];
        double d8 = dArr2[7];
        double d9 = dArr2[8];
        double d10 = dArr2[9];
        double d11 = dArr2[10];
        double d12 = dArr2[11];
        double d13 = dArr2[12];
        double d14 = dArr2[13];
        double d15 = dArr2[14];
        double d16 = dArr2[15];
        double d17 = (d * d6) - (d2 * d5);
        double d18 = (d * d7) - (d3 * d5);
        double d19 = (d * d8) - (d4 * d5);
        double d20 = (d2 * d7) - (d3 * d6);
        double d21 = (d2 * d8) - (d4 * d6);
        double d22 = (d3 * d8) - (d4 * d7);
        double d23 = (d9 * d14) - (d10 * d13);
        double d24 = (d9 * d15) - (d11 * d13);
        double d25 = (d9 * d16) - (d12 * d13);
        double d26 = (d10 * d15) - (d11 * d14);
        double d27 = (d10 * d16) - (d12 * d14);
        double d28 = (d11 * d16) - (d12 * d15);
        double d29 = (((((d17 * d28) - (d18 * d27)) + (d19 * d26)) + (d20 * d25)) - (d21 * d24)) + (d22 * d23);
        if (d29 == 0.0d) {
            return null;
        }
        double d30 = 1.0d / d29;
        dArr[0] = (((d6 * d28) - (d7 * d27)) + (d8 * d26)) * d30;
        dArr[1] = (((d3 * d27) - (d2 * d28)) - (d4 * d26)) * d30;
        dArr[2] = (((d14 * d22) - (d15 * d21)) + (d16 * d20)) * d30;
        dArr[3] = (((d11 * d21) - (d10 * d22)) - (d12 * d20)) * d30;
        dArr[4] = (((d7 * d25) - (d5 * d28)) - (d8 * d24)) * d30;
        dArr[5] = (((d28 * d) - (d3 * d25)) + (d4 * d24)) * d30;
        dArr[6] = (((d15 * d19) - (d13 * d22)) - (d16 * d18)) * d30;
        dArr[7] = (((d22 * d9) - (d11 * d19)) + (d12 * d18)) * d30;
        dArr[8] = (((d5 * d27) - (d6 * d25)) + (d8 * d23)) * d30;
        dArr[9] = (((d25 * d2) - (d27 * d)) - (d4 * d23)) * d30;
        dArr[10] = (((d13 * d21) - (d14 * d19)) + (d16 * d17)) * d30;
        dArr[11] = (((d19 * d10) - (d21 * d9)) - (d12 * d17)) * d30;
        dArr[12] = (((d6 * d24) - (d5 * d26)) - (d7 * d23)) * d30;
        dArr[13] = (((d * d26) - (d2 * d24)) + (d3 * d23)) * d30;
        dArr[14] = (((d14 * d18) - (d13 * d20)) - (d15 * d17)) * d30;
        dArr[15] = (((d9 * d20) - (d10 * d18)) + (d11 * d17)) * d30;
        return dArr;
    }

    /* renamed from: a */
    public static double[] m11844a(double[] dArr, double d, double d2, double d3, double d4) {
        double tan = 1.0d / Math.tan(d / 2.0d);
        double d5 = 1.0d / (d3 - d4);
        dArr[0] = tan / d2;
        dArr[1] = 0.0d;
        dArr[2] = 0.0d;
        dArr[3] = 0.0d;
        dArr[4] = 0.0d;
        dArr[5] = tan;
        dArr[6] = 0.0d;
        dArr[7] = 0.0d;
        dArr[8] = 0.0d;
        dArr[9] = 0.0d;
        dArr[10] = (d4 + d3) * d5;
        dArr[11] = -1.0d;
        dArr[12] = 0.0d;
        dArr[13] = 0.0d;
        dArr[14] = d4 * 2.0d * d3 * d5;
        dArr[15] = 0.0d;
        return dArr;
    }

    /* renamed from: a */
    public static double[] m11846a(double[] dArr, double[] dArr2, double d, double d2, double d3) {
        dArr[0] = dArr2[0] * d;
        dArr[1] = dArr2[1] * d;
        dArr[2] = dArr2[2] * d;
        dArr[3] = dArr2[3] * d;
        dArr[4] = dArr2[4] * d2;
        dArr[5] = dArr2[5] * d2;
        dArr[6] = dArr2[6] * d2;
        dArr[7] = dArr2[7] * d2;
        dArr[8] = dArr2[8] * d3;
        dArr[9] = dArr2[9] * d3;
        dArr[10] = dArr2[10] * d3;
        dArr[11] = dArr2[11] * d3;
        dArr[12] = dArr2[12];
        dArr[13] = dArr2[13];
        dArr[14] = dArr2[14];
        dArr[15] = dArr2[15];
        return dArr;
    }

    /* renamed from: a */
    public static void m11840a(double[] dArr, double[] dArr2, double d) {
        dArr[0] = dArr2[0] * d;
        dArr[1] = dArr2[1] * d;
        dArr[2] = dArr2[2] * d;
        dArr[3] = dArr2[3] * d;
    }

    /* renamed from: a */
    public static double[] m11843a(double[] dArr, double d) {
        double sin = Math.sin(d);
        double cos = Math.cos(d);
        double d2 = dArr[4];
        double d3 = dArr[5];
        double d4 = dArr[6];
        double d5 = dArr[7];
        double d6 = dArr[8];
        double d7 = dArr[9];
        double d8 = dArr[10];
        double d9 = dArr[11];
        dArr[4] = (d2 * cos) + (d6 * sin);
        dArr[5] = (d3 * cos) + (d7 * sin);
        dArr[6] = (d4 * cos) + (d8 * sin);
        dArr[7] = (d5 * cos) + (d9 * sin);
        dArr[8] = (d6 * cos) - (d2 * sin);
        dArr[9] = (d7 * cos) - (d3 * sin);
        dArr[10] = (d8 * cos) - (d4 * sin);
        dArr[11] = (d9 * cos) - (d5 * sin);
        return dArr;
    }

    /* renamed from: a */
    public static double[] m11848a(double[] dArr, double[] dArr2, double[] dArr3, double d) {
        double d2 = dArr2[0];
        double d3 = dArr2[1];
        dArr[0] = d2 + ((dArr3[0] - d2) * d);
        dArr[1] = d3 + (d * (dArr3[1] - d3));
        return dArr;
    }
}
