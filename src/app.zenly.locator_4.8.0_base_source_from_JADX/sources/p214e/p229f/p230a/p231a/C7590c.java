package p214e.p229f.p230a.p231a;

import android.util.Log;
import java.util.Arrays;

/* renamed from: e.f.a.a.c */
public class C7590c {

    /* renamed from: b */
    static C7590c f19069b = new C7590c();

    /* renamed from: c */
    public static String[] f19070c = {"standard", "accelerate", "decelerate", "linear"};

    /* renamed from: a */
    String f19071a = "identity";

    /* renamed from: e.f.a.a.c$a */
    static class C7591a extends C7590c {

        /* renamed from: h */
        private static double f19072h = 0.01d;

        /* renamed from: i */
        private static double f19073i = 1.0E-4d;

        /* renamed from: d */
        double f19074d;

        /* renamed from: e */
        double f19075e;

        /* renamed from: f */
        double f19076f;

        /* renamed from: g */
        double f19077g;

        C7591a(String str) {
            this.f19071a = str;
            int indexOf = str.indexOf(40);
            int indexOf2 = str.indexOf(44, indexOf);
            this.f19074d = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
            int i = indexOf2 + 1;
            int indexOf3 = str.indexOf(44, i);
            this.f19075e = Double.parseDouble(str.substring(i, indexOf3).trim());
            int i2 = indexOf3 + 1;
            int indexOf4 = str.indexOf(44, i2);
            this.f19076f = Double.parseDouble(str.substring(i2, indexOf4).trim());
            int i3 = indexOf4 + 1;
            this.f19077g = Double.parseDouble(str.substring(i3, str.indexOf(41, i3)).trim());
        }

        /* renamed from: c */
        private double m18381c(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.f19074d * d2 * d3 * d) + (this.f19076f * d3 * d * d) + (d * d * d);
        }

        /* renamed from: d */
        private double m18382d(double d) {
            double d2 = 1.0d - d;
            double d3 = 3.0d * d2;
            return (this.f19075e * d2 * d3 * d) + (this.f19077g * d3 * d * d) + (d * d * d);
        }

        /* renamed from: a */
        public double mo19644a(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > f19072h) {
                d2 *= 0.5d;
                d3 = m18381c(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double c = m18381c(d4);
            double d5 = d3 + d2;
            double c2 = m18381c(d5);
            double d6 = m18382d(d4);
            return (((m18382d(d5) - d6) * (d - c)) / (c2 - c)) + d6;
        }

        /* renamed from: b */
        public double mo19645b(double d) {
            double d2 = 0.5d;
            double d3 = 0.5d;
            while (d2 > f19073i) {
                d2 *= 0.5d;
                d3 = m18381c(d3) < d ? d3 + d2 : d3 - d2;
            }
            double d4 = d3 - d2;
            double c = m18381c(d4);
            double d5 = d3 + d2;
            return (m18382d(d5) - m18382d(d4)) / (m18381c(d5) - c);
        }
    }

    /* renamed from: a */
    public static C7590c m18378a(String str) {
        if (str == null) {
            return null;
        }
        if (str.startsWith("cubic")) {
            return new C7591a(str);
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1354466595:
                if (str.equals("accelerate")) {
                    c = 1;
                    break;
                }
                break;
            case -1263948740:
                if (str.equals("decelerate")) {
                    c = 2;
                    break;
                }
                break;
            case -1102672091:
                if (str.equals("linear")) {
                    c = 3;
                    break;
                }
                break;
            case 1312628413:
                if (str.equals("standard")) {
                    c = 0;
                    break;
                }
                break;
        }
        if (c == 0) {
            return new C7591a("cubic(0.4, 0.0, 0.2, 1)");
        }
        if (c == 1) {
            return new C7591a("cubic(0.4, 0.05, 0.8, 0.7)");
        }
        if (c == 2) {
            return new C7591a("cubic(0.0, 0.0, 0.2, 0.95)");
        }
        if (c == 3) {
            return new C7591a("cubic(1, 1, 0, 0)");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or ");
        sb.append(Arrays.toString(f19070c));
        Log.e("ConstraintSet", sb.toString());
        return f19069b;
    }

    /* renamed from: a */
    public double mo19644a(double d) {
        return d;
    }

    /* renamed from: b */
    public double mo19645b(double d) {
        return 1.0d;
    }

    public String toString() {
        return this.f19071a;
    }
}
