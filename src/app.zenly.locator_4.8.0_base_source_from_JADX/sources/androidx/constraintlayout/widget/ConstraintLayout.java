package androidx.constraintlayout.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.constraintlayout.solver.widgets.C0439e.C0443d;
import androidx.constraintlayout.solver.widgets.C0444f;
import androidx.constraintlayout.solver.widgets.C0444f.C0446b;
import androidx.constraintlayout.solver.widgets.C0447g;
import androidx.constraintlayout.solver.widgets.C0451j;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.C0419a;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure.Measurer;
import com.appsflyer.share.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import p214e.p229f.p232b.C7602f;

public class ConstraintLayout extends ViewGroup {

    /* renamed from: e */
    SparseArray<View> f2079e = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ArrayList<ConstraintHelper> f2080f = new ArrayList<>(4);

    /* renamed from: g */
    private final ArrayList<C0444f> f2081g = new ArrayList<>(100);
    /* access modifiers changed from: protected */

    /* renamed from: h */
    public C0447g f2082h = new C0447g();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f2083i = 0;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f2084j = 0;

    /* renamed from: k */
    private int f2085k = Integer.MAX_VALUE;

    /* renamed from: l */
    private int f2086l = Integer.MAX_VALUE;

    /* renamed from: m */
    protected boolean f2087m = true;

    /* renamed from: n */
    private int f2088n = 7;

    /* renamed from: o */
    private C0473c f2089o = null;

    /* renamed from: p */
    protected C0470b f2090p = null;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f2091q = -1;

    /* renamed from: r */
    private HashMap<String, Integer> f2092r = new HashMap<>();

    /* renamed from: s */
    private int f2093s = -1;

    /* renamed from: t */
    private int f2094t = -1;

    /* renamed from: u */
    private SparseArray<C0444f> f2095u = new SparseArray<>();
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C7602f f2096v;

    /* renamed from: w */
    C0466c f2097w = new C0466c(this, this);
    /* access modifiers changed from: private */

    /* renamed from: x */
    public int f2098x = 0;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public int f2099y = 0;

    public static class LayoutParams extends MarginLayoutParams {

        /* renamed from: A */
        public float f2100A = 0.5f;

        /* renamed from: B */
        public String f2101B = null;

        /* renamed from: C */
        int f2102C = 1;

        /* renamed from: D */
        public float f2103D = -1.0f;

        /* renamed from: E */
        public float f2104E = -1.0f;

        /* renamed from: F */
        public int f2105F = 0;

        /* renamed from: G */
        public int f2106G = 0;

        /* renamed from: H */
        public int f2107H = 0;

        /* renamed from: I */
        public int f2108I = 0;

        /* renamed from: J */
        public int f2109J = 0;

        /* renamed from: K */
        public int f2110K = 0;

        /* renamed from: L */
        public int f2111L = 0;

        /* renamed from: M */
        public int f2112M = 0;

        /* renamed from: N */
        public float f2113N = 1.0f;

        /* renamed from: O */
        public float f2114O = 1.0f;

        /* renamed from: P */
        public int f2115P = -1;

        /* renamed from: Q */
        public int f2116Q = -1;

        /* renamed from: R */
        public int f2117R = -1;

        /* renamed from: S */
        public boolean f2118S = false;

        /* renamed from: T */
        public boolean f2119T = false;

        /* renamed from: U */
        public String f2120U = null;

        /* renamed from: V */
        boolean f2121V = true;

        /* renamed from: W */
        boolean f2122W = true;

        /* renamed from: X */
        boolean f2123X = false;

        /* renamed from: Y */
        boolean f2124Y = false;

        /* renamed from: Z */
        boolean f2125Z = false;

        /* renamed from: a */
        public int f2126a = -1;

        /* renamed from: a0 */
        boolean f2127a0 = false;

        /* renamed from: b */
        public int f2128b = -1;

        /* renamed from: b0 */
        boolean f2129b0 = false;

        /* renamed from: c */
        public float f2130c = -1.0f;

        /* renamed from: c0 */
        int f2131c0 = -1;

        /* renamed from: d */
        public int f2132d = -1;

        /* renamed from: d0 */
        int f2133d0 = -1;

        /* renamed from: e */
        public int f2134e = -1;

        /* renamed from: e0 */
        int f2135e0 = -1;

        /* renamed from: f */
        public int f2136f = -1;

        /* renamed from: f0 */
        int f2137f0 = -1;

        /* renamed from: g */
        public int f2138g = -1;

        /* renamed from: g0 */
        int f2139g0 = -1;

        /* renamed from: h */
        public int f2140h = -1;

        /* renamed from: h0 */
        int f2141h0 = -1;

        /* renamed from: i */
        public int f2142i = -1;

        /* renamed from: i0 */
        float f2143i0 = 0.5f;

        /* renamed from: j */
        public int f2144j = -1;

        /* renamed from: j0 */
        int f2145j0;

        /* renamed from: k */
        public int f2146k = -1;

        /* renamed from: k0 */
        int f2147k0;

        /* renamed from: l */
        public int f2148l = -1;

        /* renamed from: l0 */
        float f2149l0;

        /* renamed from: m */
        public int f2150m = -1;

        /* renamed from: m0 */
        C0444f f2151m0 = new C0444f();

        /* renamed from: n */
        public int f2152n = 0;

        /* renamed from: n0 */
        public boolean f2153n0;

        /* renamed from: o */
        public float f2154o = 0.0f;

        /* renamed from: p */
        public int f2155p = -1;

        /* renamed from: q */
        public int f2156q = -1;

        /* renamed from: r */
        public int f2157r = -1;

        /* renamed from: s */
        public int f2158s = -1;

        /* renamed from: t */
        public int f2159t = -1;

        /* renamed from: u */
        public int f2160u = -1;

        /* renamed from: v */
        public int f2161v = -1;

        /* renamed from: w */
        public int f2162w = -1;

        /* renamed from: x */
        public int f2163x = -1;

        /* renamed from: y */
        public int f2164y = -1;

        /* renamed from: z */
        public float f2165z = 0.5f;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$LayoutParams$a */
        private static class C0463a {

            /* renamed from: a */
            public static final SparseIntArray f2166a = new SparseIntArray();

            static {
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintCircle, 2);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                f2166a.append(C0481f.ConstraintLayout_Layout_android_orientation, 1);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                f2166a.append(C0481f.ConstraintLayout_Layout_layout_constraintTag, 51);
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            int i;
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0481f.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                String str = "ConstraintLayout";
                switch (C0463a.f2166a.get(index)) {
                    case 1:
                        this.f2117R = obtainStyledAttributes.getInt(index, this.f2117R);
                        break;
                    case 2:
                        this.f2150m = obtainStyledAttributes.getResourceId(index, this.f2150m);
                        if (this.f2150m != -1) {
                            break;
                        } else {
                            this.f2150m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.f2152n = obtainStyledAttributes.getDimensionPixelSize(index, this.f2152n);
                        break;
                    case 4:
                        this.f2154o = obtainStyledAttributes.getFloat(index, this.f2154o) % 360.0f;
                        float f = this.f2154o;
                        if (f >= 0.0f) {
                            break;
                        } else {
                            this.f2154o = (360.0f - f) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f2126a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2126a);
                        break;
                    case 6:
                        this.f2128b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2128b);
                        break;
                    case 7:
                        this.f2130c = obtainStyledAttributes.getFloat(index, this.f2130c);
                        break;
                    case 8:
                        this.f2132d = obtainStyledAttributes.getResourceId(index, this.f2132d);
                        if (this.f2132d != -1) {
                            break;
                        } else {
                            this.f2132d = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        this.f2134e = obtainStyledAttributes.getResourceId(index, this.f2134e);
                        if (this.f2134e != -1) {
                            break;
                        } else {
                            this.f2134e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        this.f2136f = obtainStyledAttributes.getResourceId(index, this.f2136f);
                        if (this.f2136f != -1) {
                            break;
                        } else {
                            this.f2136f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        this.f2138g = obtainStyledAttributes.getResourceId(index, this.f2138g);
                        if (this.f2138g != -1) {
                            break;
                        } else {
                            this.f2138g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        this.f2140h = obtainStyledAttributes.getResourceId(index, this.f2140h);
                        if (this.f2140h != -1) {
                            break;
                        } else {
                            this.f2140h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        this.f2142i = obtainStyledAttributes.getResourceId(index, this.f2142i);
                        if (this.f2142i != -1) {
                            break;
                        } else {
                            this.f2142i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        this.f2144j = obtainStyledAttributes.getResourceId(index, this.f2144j);
                        if (this.f2144j != -1) {
                            break;
                        } else {
                            this.f2144j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        this.f2146k = obtainStyledAttributes.getResourceId(index, this.f2146k);
                        if (this.f2146k != -1) {
                            break;
                        } else {
                            this.f2146k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        this.f2148l = obtainStyledAttributes.getResourceId(index, this.f2148l);
                        if (this.f2148l != -1) {
                            break;
                        } else {
                            this.f2148l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        this.f2155p = obtainStyledAttributes.getResourceId(index, this.f2155p);
                        if (this.f2155p != -1) {
                            break;
                        } else {
                            this.f2155p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        this.f2156q = obtainStyledAttributes.getResourceId(index, this.f2156q);
                        if (this.f2156q != -1) {
                            break;
                        } else {
                            this.f2156q = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        this.f2157r = obtainStyledAttributes.getResourceId(index, this.f2157r);
                        if (this.f2157r != -1) {
                            break;
                        } else {
                            this.f2157r = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        this.f2158s = obtainStyledAttributes.getResourceId(index, this.f2158s);
                        if (this.f2158s != -1) {
                            break;
                        } else {
                            this.f2158s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.f2159t = obtainStyledAttributes.getDimensionPixelSize(index, this.f2159t);
                        break;
                    case 22:
                        this.f2160u = obtainStyledAttributes.getDimensionPixelSize(index, this.f2160u);
                        break;
                    case 23:
                        this.f2161v = obtainStyledAttributes.getDimensionPixelSize(index, this.f2161v);
                        break;
                    case 24:
                        this.f2162w = obtainStyledAttributes.getDimensionPixelSize(index, this.f2162w);
                        break;
                    case 25:
                        this.f2163x = obtainStyledAttributes.getDimensionPixelSize(index, this.f2163x);
                        break;
                    case 26:
                        this.f2164y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2164y);
                        break;
                    case 27:
                        this.f2118S = obtainStyledAttributes.getBoolean(index, this.f2118S);
                        break;
                    case 28:
                        this.f2119T = obtainStyledAttributes.getBoolean(index, this.f2119T);
                        break;
                    case 29:
                        this.f2165z = obtainStyledAttributes.getFloat(index, this.f2165z);
                        break;
                    case 30:
                        this.f2100A = obtainStyledAttributes.getFloat(index, this.f2100A);
                        break;
                    case 31:
                        this.f2107H = obtainStyledAttributes.getInt(index, 0);
                        if (this.f2107H != 1) {
                            break;
                        } else {
                            Log.e(str, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        }
                    case 32:
                        this.f2108I = obtainStyledAttributes.getInt(index, 0);
                        if (this.f2108I != 1) {
                            break;
                        } else {
                            Log.e(str, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        }
                    case 33:
                        try {
                            this.f2109J = obtainStyledAttributes.getDimensionPixelSize(index, this.f2109J);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f2109J) != -2) {
                                break;
                            } else {
                                this.f2109J = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f2111L = obtainStyledAttributes.getDimensionPixelSize(index, this.f2111L);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f2111L) != -2) {
                                break;
                            } else {
                                this.f2111L = -2;
                                break;
                            }
                        }
                    case 35:
                        this.f2113N = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f2113N));
                        break;
                    case 36:
                        try {
                            this.f2110K = obtainStyledAttributes.getDimensionPixelSize(index, this.f2110K);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f2110K) != -2) {
                                break;
                            } else {
                                this.f2110K = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f2112M = obtainStyledAttributes.getDimensionPixelSize(index, this.f2112M);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f2112M) != -2) {
                                break;
                            } else {
                                this.f2112M = -2;
                                break;
                            }
                        }
                    case 38:
                        this.f2114O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f2114O));
                        break;
                    case 44:
                        this.f2101B = obtainStyledAttributes.getString(index);
                        this.f2102C = -1;
                        String str2 = this.f2101B;
                        if (str2 == null) {
                            break;
                        } else {
                            int length = str2.length();
                            int indexOf = this.f2101B.indexOf(44);
                            if (indexOf <= 0 || indexOf >= length - 1) {
                                i = 0;
                            } else {
                                String substring = this.f2101B.substring(0, indexOf);
                                if (substring.equalsIgnoreCase("W")) {
                                    this.f2102C = 0;
                                } else if (substring.equalsIgnoreCase("H")) {
                                    this.f2102C = 1;
                                }
                                i = indexOf + 1;
                            }
                            int indexOf2 = this.f2101B.indexOf(58);
                            if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                String substring2 = this.f2101B.substring(i, indexOf2);
                                String substring3 = this.f2101B.substring(indexOf2 + 1);
                                if (substring2.length() > 0 && substring3.length() > 0) {
                                    try {
                                        float parseFloat = Float.parseFloat(substring2);
                                        float parseFloat2 = Float.parseFloat(substring3);
                                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                            if (this.f2102C != 1) {
                                                Math.abs(parseFloat / parseFloat2);
                                                break;
                                            } else {
                                                Math.abs(parseFloat2 / parseFloat);
                                                break;
                                            }
                                        }
                                    } catch (NumberFormatException unused5) {
                                        break;
                                    }
                                }
                            } else {
                                String substring4 = this.f2101B.substring(i);
                                if (substring4.length() <= 0) {
                                    break;
                                } else {
                                    Float.parseFloat(substring4);
                                    break;
                                }
                            }
                        }
                        break;
                    case 45:
                        this.f2103D = obtainStyledAttributes.getFloat(index, this.f2103D);
                        break;
                    case 46:
                        this.f2104E = obtainStyledAttributes.getFloat(index, this.f2104E);
                        break;
                    case 47:
                        this.f2105F = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 48:
                        this.f2106G = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 49:
                        this.f2115P = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2115P);
                        break;
                    case 50:
                        this.f2116Q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2116Q);
                        break;
                    case 51:
                        this.f2120U = obtainStyledAttributes.getString(index);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
            mo2729b();
        }

        /* renamed from: a */
        public String mo2728a() {
            return this.f2120U;
        }

        /* renamed from: b */
        public void mo2729b() {
            this.f2124Y = false;
            this.f2121V = true;
            this.f2122W = true;
            if (this.width == -2 && this.f2118S) {
                this.f2121V = false;
                if (this.f2107H == 0) {
                    this.f2107H = 1;
                }
            }
            if (this.height == -2 && this.f2119T) {
                this.f2122W = false;
                if (this.f2108I == 0) {
                    this.f2108I = 1;
                }
            }
            if (this.width == 0 || this.width == -1) {
                this.f2121V = false;
                if (this.width == 0 && this.f2107H == 1) {
                    this.width = -2;
                    this.f2118S = true;
                }
            }
            if (this.height == 0 || this.height == -1) {
                this.f2122W = false;
                if (this.height == 0 && this.f2108I == 1) {
                    this.height = -2;
                    this.f2119T = true;
                }
            }
            if (this.f2130c != -1.0f || this.f2126a != -1 || this.f2128b != -1) {
                this.f2124Y = true;
                this.f2121V = true;
                this.f2122W = true;
                if (!(this.f2151m0 instanceof C0451j)) {
                    this.f2151m0 = new C0451j();
                }
                ((C0451j) this.f2151m0).mo2647B(this.f2117R);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x008a  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r7) {
            /*
                r6 = this;
                int r0 = r6.leftMargin
                int r1 = r6.rightMargin
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 17
                if (r2 < r3) goto L_0x000d
                super.resolveLayoutDirection(r7)
            L_0x000d:
                r7 = -1
                r6.f2135e0 = r7
                r6.f2137f0 = r7
                r6.f2131c0 = r7
                r6.f2133d0 = r7
                r6.f2139g0 = r7
                r6.f2141h0 = r7
                int r2 = r6.f2159t
                r6.f2139g0 = r2
                int r2 = r6.f2161v
                r6.f2141h0 = r2
                float r2 = r6.f2165z
                r6.f2143i0 = r2
                int r2 = r6.f2126a
                r6.f2145j0 = r2
                int r2 = r6.f2128b
                r6.f2147k0 = r2
                float r2 = r6.f2130c
                r6.f2149l0 = r2
                int r2 = r6.getLayoutDirection()
                r3 = 0
                r4 = 1
                if (r4 != r2) goto L_0x003c
                r2 = 1
                goto L_0x003d
            L_0x003c:
                r2 = 0
            L_0x003d:
                if (r2 == 0) goto L_0x00a0
                int r2 = r6.f2155p
                if (r2 == r7) goto L_0x0047
                r6.f2135e0 = r2
            L_0x0045:
                r3 = 1
                goto L_0x004e
            L_0x0047:
                int r2 = r6.f2156q
                if (r2 == r7) goto L_0x004e
                r6.f2137f0 = r2
                goto L_0x0045
            L_0x004e:
                int r2 = r6.f2157r
                if (r2 == r7) goto L_0x0055
                r6.f2133d0 = r2
                r3 = 1
            L_0x0055:
                int r2 = r6.f2158s
                if (r2 == r7) goto L_0x005c
                r6.f2131c0 = r2
                r3 = 1
            L_0x005c:
                int r2 = r6.f2163x
                if (r2 == r7) goto L_0x0062
                r6.f2141h0 = r2
            L_0x0062:
                int r2 = r6.f2164y
                if (r2 == r7) goto L_0x0068
                r6.f2139g0 = r2
            L_0x0068:
                r2 = 1065353216(0x3f800000, float:1.0)
                if (r3 == 0) goto L_0x0072
                float r3 = r6.f2165z
                float r3 = r2 - r3
                r6.f2143i0 = r3
            L_0x0072:
                boolean r3 = r6.f2124Y
                if (r3 == 0) goto L_0x00c4
                int r3 = r6.f2117R
                if (r3 != r4) goto L_0x00c4
                float r3 = r6.f2130c
                r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
                if (r5 == 0) goto L_0x008a
                float r2 = r2 - r3
                r6.f2149l0 = r2
                r6.f2145j0 = r7
                r6.f2147k0 = r7
                goto L_0x00c4
            L_0x008a:
                int r2 = r6.f2126a
                if (r2 == r7) goto L_0x0095
                r6.f2147k0 = r2
                r6.f2145j0 = r7
                r6.f2149l0 = r4
                goto L_0x00c4
            L_0x0095:
                int r2 = r6.f2128b
                if (r2 == r7) goto L_0x00c4
                r6.f2145j0 = r2
                r6.f2147k0 = r7
                r6.f2149l0 = r4
                goto L_0x00c4
            L_0x00a0:
                int r2 = r6.f2155p
                if (r2 == r7) goto L_0x00a6
                r6.f2133d0 = r2
            L_0x00a6:
                int r2 = r6.f2156q
                if (r2 == r7) goto L_0x00ac
                r6.f2131c0 = r2
            L_0x00ac:
                int r2 = r6.f2157r
                if (r2 == r7) goto L_0x00b2
                r6.f2135e0 = r2
            L_0x00b2:
                int r2 = r6.f2158s
                if (r2 == r7) goto L_0x00b8
                r6.f2137f0 = r2
            L_0x00b8:
                int r2 = r6.f2163x
                if (r2 == r7) goto L_0x00be
                r6.f2139g0 = r2
            L_0x00be:
                int r2 = r6.f2164y
                if (r2 == r7) goto L_0x00c4
                r6.f2141h0 = r2
            L_0x00c4:
                int r2 = r6.f2157r
                if (r2 != r7) goto L_0x010e
                int r2 = r6.f2158s
                if (r2 != r7) goto L_0x010e
                int r2 = r6.f2156q
                if (r2 != r7) goto L_0x010e
                int r2 = r6.f2155p
                if (r2 != r7) goto L_0x010e
                int r2 = r6.f2136f
                if (r2 == r7) goto L_0x00e3
                r6.f2135e0 = r2
                int r2 = r6.rightMargin
                if (r2 > 0) goto L_0x00f1
                if (r1 <= 0) goto L_0x00f1
                r6.rightMargin = r1
                goto L_0x00f1
            L_0x00e3:
                int r2 = r6.f2138g
                if (r2 == r7) goto L_0x00f1
                r6.f2137f0 = r2
                int r2 = r6.rightMargin
                if (r2 > 0) goto L_0x00f1
                if (r1 <= 0) goto L_0x00f1
                r6.rightMargin = r1
            L_0x00f1:
                int r1 = r6.f2132d
                if (r1 == r7) goto L_0x0100
                r6.f2131c0 = r1
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x010e
                if (r0 <= 0) goto L_0x010e
                r6.leftMargin = r0
                goto L_0x010e
            L_0x0100:
                int r1 = r6.f2134e
                if (r1 == r7) goto L_0x010e
                r6.f2133d0 = r1
                int r7 = r6.leftMargin
                if (r7 > 0) goto L_0x010e
                if (r0 <= 0) goto L_0x010e
                r6.leftMargin = r0
            L_0x010e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    class C0464a extends Handler {
        C0464a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            ConstraintLayout constraintLayout = ConstraintLayout.this;
            constraintLayout.mo2252a(constraintLayout.f2091q, message.arg1, message.arg2);
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    static /* synthetic */ class C0465b {

        /* renamed from: a */
        static final /* synthetic */ int[] f2168a = new int[C0446b.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                androidx.constraintlayout.solver.widgets.f$b[] r0 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2168a = r0
                int[] r0 = f2168a     // Catch:{ NoSuchFieldError -> 0x0014 }
                androidx.constraintlayout.solver.widgets.f$b r1 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.FIXED     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f2168a     // Catch:{ NoSuchFieldError -> 0x001f }
                androidx.constraintlayout.solver.widgets.f$b r1 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f2168a     // Catch:{ NoSuchFieldError -> 0x002a }
                androidx.constraintlayout.solver.widgets.f$b r1 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f2168a     // Catch:{ NoSuchFieldError -> 0x0035 }
                androidx.constraintlayout.solver.widgets.f$b r1 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0465b.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$c */
    class C0466c implements Measurer {

        /* renamed from: a */
        ConstraintLayout f2169a;

        public C0466c(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
            this.f2169a = constraintLayout2;
        }

        public boolean deprecatedMeasure(C0444f fVar) {
            int i;
            int i2;
            boolean z;
            C0444f fVar2 = fVar;
            View view = (View) fVar.mo2578e();
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int a = this.f2169a.f2098x;
            int b = this.f2169a.f2099y;
            int paddingTop = this.f2169a.getPaddingTop() + this.f2169a.getPaddingBottom();
            int paddingLeft = this.f2169a.getPaddingLeft() + this.f2169a.getPaddingRight();
            boolean z2 = this.f2169a.f2082h.mo2595n() == C0446b.WRAP_CONTENT;
            boolean z3 = this.f2169a.f2082h.mo2618y() == C0446b.WRAP_CONTENT;
            int max = Math.max(this.f2169a.f2082h.mo2525A(), this.f2169a.f2083i);
            int max2 = Math.max(this.f2169a.f2082h.mo2589k(), this.f2169a.f2084j);
            if (layoutParams.width != -2 || !layoutParams.f2121V) {
                i = MeasureSpec.makeMeasureSpec(fVar.mo2525A(), 1073741824);
            } else {
                i = ViewGroup.getChildMeasureSpec(a, paddingLeft, layoutParams.width);
            }
            if (layoutParams.height != -2 || !layoutParams.f2122W) {
                i2 = MeasureSpec.makeMeasureSpec(fVar.mo2589k(), 1073741824);
            } else {
                i2 = ViewGroup.getChildMeasureSpec(b, paddingTop, layoutParams.height);
            }
            view.measure(i, i2);
            if (this.f2169a.f2096v != null) {
                C7602f e = this.f2169a.f2096v;
                e.f19142b++;
            }
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            if (measuredWidth != fVar.mo2525A()) {
                fVar2.mo2611u(measuredWidth);
                if (z2 && fVar.mo2607t() > max) {
                    Math.max(max, fVar.mo2607t() + fVar2.mo2539a(C0443d.RIGHT).mo2514b());
                }
                z = true;
            } else {
                z = false;
            }
            if (measuredHeight != fVar.mo2589k()) {
                fVar2.mo2594m(measuredHeight);
                if (z3 && fVar.mo2573d() > max2) {
                    Math.max(max2, fVar.mo2573d() + fVar2.mo2539a(C0443d.BOTTOM).mo2514b());
                }
                z = true;
            }
            if (!layoutParams.f2123X) {
                return z;
            }
            fVar2.mo2554a(true);
            int baseline = view.getBaseline();
            if (baseline == -1 || baseline == fVar.mo2567c()) {
                return z;
            }
            fVar2.mo2588j(baseline);
            return true;
        }

        public final void didMeasures() {
            int childCount = this.f2169a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f2169a.getChildAt(i);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).mo2743a(this.f2169a);
                }
            }
            int size = this.f2169a.f2080f.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((ConstraintHelper) this.f2169a.f2080f.get(i2)).mo2695c(this.f2169a);
                }
            }
        }

        public final void measure(C0444f fVar, C0419a aVar) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            C0444f fVar2 = fVar;
            C0419a aVar2 = aVar;
            if (fVar2 != null && fVar.mo2620z() != 8) {
                C0446b bVar = aVar2.f1765a;
                C0446b bVar2 = aVar2.f1766b;
                int i6 = aVar2.f1767c;
                int i7 = aVar2.f1768d;
                int paddingTop = this.f2169a.getPaddingTop() + this.f2169a.getPaddingBottom();
                int paddingLeft = this.f2169a.getPaddingLeft() + this.f2169a.getPaddingRight();
                int i8 = C0465b.f2168a[bVar.ordinal()];
                boolean z = true;
                if (i8 == 1) {
                    i = MeasureSpec.makeMeasureSpec(i6, 1073741824);
                } else if (i8 == 2) {
                    i = ViewGroup.getChildMeasureSpec(this.f2169a.f2098x, paddingLeft, -2);
                } else if (i8 == 3) {
                    i = ViewGroup.getChildMeasureSpec(this.f2169a.f2098x, paddingLeft, -1);
                } else if (i8 != 4) {
                    i = 0;
                } else {
                    i = ViewGroup.getChildMeasureSpec(this.f2169a.f2098x, paddingLeft, -2);
                }
                int i9 = C0465b.f2168a[bVar2.ordinal()];
                if (i9 == 1) {
                    i2 = MeasureSpec.makeMeasureSpec(i7, 1073741824);
                } else if (i9 == 2) {
                    i2 = ViewGroup.getChildMeasureSpec(this.f2169a.f2099y, paddingTop, -2);
                } else if (i9 == 3) {
                    i2 = ViewGroup.getChildMeasureSpec(this.f2169a.f2099y, paddingTop, -1);
                } else if (i9 != 4) {
                    i2 = 0;
                } else {
                    i2 = ViewGroup.getChildMeasureSpec(this.f2169a.f2099y, paddingTop, -2);
                }
                boolean z2 = bVar == C0446b.MATCH_CONSTRAINT;
                boolean z3 = bVar2 == C0446b.MATCH_CONSTRAINT;
                boolean z4 = bVar2 == C0446b.WRAP_CONTENT || bVar2 == C0446b.MATCH_PARENT || bVar2 == C0446b.FIXED;
                boolean z5 = bVar == C0446b.WRAP_CONTENT || bVar == C0446b.MATCH_PARENT || bVar == C0446b.FIXED;
                boolean z6 = z2 && fVar2.f1903P > 0.0f;
                if (!z3 || fVar2.f1903P <= 0.0f) {
                    z = false;
                }
                View view = (View) fVar.mo2578e();
                if (!z2 || fVar2.f1934k != 0 || !z3 || fVar2.f1936l != 0) {
                    view.measure(i, i2);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    int baseline = view.getBaseline();
                    int i10 = fVar2.f1940n;
                    i3 = i10 > 0 ? Math.max(i10, measuredWidth) : measuredWidth;
                    int i11 = fVar2.f1942o;
                    if (i11 > 0) {
                        i3 = Math.min(i11, i3);
                    }
                    int i12 = fVar2.f1946q;
                    int max = i12 > 0 ? Math.max(i12, measuredHeight) : measuredHeight;
                    int i13 = fVar2.f1948r;
                    if (i13 > 0) {
                        max = Math.min(i13, max);
                    }
                    if (z6 && z4) {
                        i3 = (int) ((((float) max) * fVar2.f1903P) + 0.5f);
                    } else if (z && z5) {
                        max = (int) ((((float) i3) / fVar2.f1903P) + 0.5f);
                    }
                    if (measuredWidth == i3 && measuredHeight == max) {
                        i5 = max;
                        i4 = baseline;
                    } else {
                        if (measuredWidth != i3) {
                            i = MeasureSpec.makeMeasureSpec(i3, 1073741824);
                        }
                        if (measuredHeight != max) {
                            i2 = MeasureSpec.makeMeasureSpec(max, 1073741824);
                        }
                        view.measure(i, i2);
                        int measuredWidth2 = view.getMeasuredWidth();
                        i5 = view.getMeasuredHeight();
                        i4 = view.getBaseline();
                        i3 = measuredWidth2;
                    }
                } else {
                    i5 = 0;
                    i4 = 0;
                    i3 = 0;
                }
                aVar2.f1769e = i3;
                aVar2.f1770f = i5;
                aVar2.f1771g = i4;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
            if (r11.f1934k == 1) goto L_0x0066;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x008b, code lost:
            if (r11.f1936l == 1) goto L_0x00a4;
         */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0077  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00a6  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00db  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00e0  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00e9  */
        @android.annotation.SuppressLint({"WrongCall"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void measure(androidx.constraintlayout.solver.widgets.C0444f r11, androidx.constraintlayout.solver.widgets.C0444f.C0446b r12, int r13, androidx.constraintlayout.solver.widgets.C0444f.C0446b r14, int r15) {
            /*
                r10 = this;
                if (r11 != 0) goto L_0x0003
                return
            L_0x0003:
                int r0 = r11.mo2620z()
                r1 = 8
                if (r0 != r1) goto L_0x000c
                return
            L_0x000c:
                androidx.constraintlayout.widget.ConstraintLayout r0 = r10.f2169a
                int r0 = r0.getPaddingTop()
                androidx.constraintlayout.widget.ConstraintLayout r1 = r10.f2169a
                int r1 = r1.getPaddingBottom()
                int r0 = r0 + r1
                androidx.constraintlayout.widget.ConstraintLayout r1 = r10.f2169a
                int r1 = r1.getPaddingLeft()
                androidx.constraintlayout.widget.ConstraintLayout r2 = r10.f2169a
                int r2 = r2.getPaddingRight()
                int r1 = r1 + r2
                int[] r2 = androidx.constraintlayout.widget.ConstraintLayout.C0465b.f2168a
                int r12 = r12.ordinal()
                r12 = r2[r12]
                r2 = 1073741824(0x40000000, float:2.0)
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = -1
                r7 = -2
                r8 = 0
                r9 = 1
                if (r12 == r9) goto L_0x0068
                if (r12 == r5) goto L_0x005c
                if (r12 == r4) goto L_0x0051
                if (r12 == r3) goto L_0x0042
                r12 = 0
            L_0x0040:
                r13 = 0
                goto L_0x006d
            L_0x0042:
                androidx.constraintlayout.widget.ConstraintLayout r12 = r10.f2169a
                int r12 = r12.f2098x
                int r12 = android.view.ViewGroup.getChildMeasureSpec(r12, r1, r7)
                int r13 = r11.f1934k
                if (r13 != r9) goto L_0x0040
                goto L_0x0066
            L_0x0051:
                androidx.constraintlayout.widget.ConstraintLayout r12 = r10.f2169a
                int r12 = r12.f2098x
                int r12 = android.view.ViewGroup.getChildMeasureSpec(r12, r1, r6)
                goto L_0x0040
            L_0x005c:
                androidx.constraintlayout.widget.ConstraintLayout r12 = r10.f2169a
                int r12 = r12.f2098x
                int r12 = android.view.ViewGroup.getChildMeasureSpec(r12, r1, r7)
            L_0x0066:
                r13 = 1
                goto L_0x006d
            L_0x0068:
                int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r2)
                goto L_0x0040
            L_0x006d:
                int[] r1 = androidx.constraintlayout.widget.ConstraintLayout.C0465b.f2168a
                int r14 = r14.ordinal()
                r14 = r1[r14]
                if (r14 == r9) goto L_0x00a6
                if (r14 == r5) goto L_0x0099
                if (r14 == r4) goto L_0x008e
                if (r14 == r3) goto L_0x007f
                r14 = 0
                goto L_0x00aa
            L_0x007f:
                androidx.constraintlayout.widget.ConstraintLayout r14 = r10.f2169a
                int r14 = r14.f2099y
                int r14 = android.view.ViewGroup.getChildMeasureSpec(r14, r0, r7)
                int r15 = r11.f1936l
                if (r15 != r9) goto L_0x00aa
                goto L_0x00a4
            L_0x008e:
                androidx.constraintlayout.widget.ConstraintLayout r14 = r10.f2169a
                int r14 = r14.f2099y
                int r14 = android.view.ViewGroup.getChildMeasureSpec(r14, r0, r6)
                goto L_0x00aa
            L_0x0099:
                androidx.constraintlayout.widget.ConstraintLayout r14 = r10.f2169a
                int r14 = r14.f2099y
                int r8 = android.view.ViewGroup.getChildMeasureSpec(r14, r0, r7)
                r14 = r8
            L_0x00a4:
                r8 = 1
                goto L_0x00aa
            L_0x00a6:
                int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r2)
            L_0x00aa:
                java.lang.Object r15 = r11.mo2578e()
                android.view.View r15 = (android.view.View) r15
                android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
                androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r0 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r0
                boolean r0 = r15 instanceof androidx.constraintlayout.widget.VirtualLayout
                if (r0 == 0) goto L_0x00c8
                boolean r0 = r11 instanceof androidx.constraintlayout.solver.widgets.C0461r
                if (r0 == 0) goto L_0x00c8
                r0 = r11
                androidx.constraintlayout.solver.widgets.r r0 = (androidx.constraintlayout.solver.widgets.C0461r) r0
                r1 = r15
                androidx.constraintlayout.widget.VirtualLayout r1 = (androidx.constraintlayout.widget.VirtualLayout) r1
                r1.mo2750a(r0, r12, r14)
                goto L_0x00cb
            L_0x00c8:
                r15.measure(r12, r14)
            L_0x00cb:
                int r12 = r15.getMeasuredWidth()
                int r14 = r15.getMeasuredHeight()
                r11.mo2611u(r12)
                r11.mo2594m(r14)
                if (r13 == 0) goto L_0x00de
                r11.mo2615w(r12)
            L_0x00de:
                if (r8 == 0) goto L_0x00e3
                r11.mo2613v(r14)
            L_0x00e3:
                int r12 = r15.getBaseline()
                if (r12 == r6) goto L_0x00ef
                r11.mo2554a(r9)
                r11.mo2588j(r12)
            L_0x00ef:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C0466c.measure(androidx.constraintlayout.solver.widgets.f, androidx.constraintlayout.solver.widgets.f$b, int, androidx.constraintlayout.solver.widgets.f$b, int):void");
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        new C0464a(Looper.getMainLooper());
        m2168a((AttributeSet) null, 0, 0);
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (VERSION.SDK_INT < 14) {
            onViewAdded(view);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if (childAt.getVisibility() != 8) {
                    Object tag = childAt.getTag();
                    if (tag != null && (tag instanceof String)) {
                        String[] split = ((String) tag).split(",");
                        if (split.length == 4) {
                            int parseInt = Integer.parseInt(split[0]);
                            int parseInt2 = Integer.parseInt(split[1]);
                            int i2 = (int) ((((float) parseInt) / 1080.0f) * width);
                            int i3 = (int) ((((float) parseInt2) / 1920.0f) * height);
                            int parseInt3 = (int) ((((float) Integer.parseInt(split[2])) / 1080.0f) * width);
                            int parseInt4 = (int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height);
                            Paint paint = new Paint();
                            paint.setColor(-65536);
                            float f = (float) i2;
                            float f2 = (float) (i2 + parseInt3);
                            Canvas canvas2 = canvas;
                            float f3 = (float) i3;
                            float f4 = f;
                            float f5 = f;
                            float f6 = f3;
                            Paint paint2 = paint;
                            float f7 = f2;
                            Paint paint3 = paint2;
                            canvas2.drawLine(f4, f6, f7, f3, paint3);
                            float f8 = (float) (i3 + parseInt4);
                            float f9 = f2;
                            float f10 = f8;
                            canvas2.drawLine(f9, f6, f7, f10, paint3);
                            float f11 = f8;
                            float f12 = f5;
                            canvas2.drawLine(f9, f11, f12, f10, paint3);
                            float f13 = f5;
                            canvas2.drawLine(f13, f11, f12, f3, paint3);
                            Paint paint4 = paint2;
                            paint4.setColor(-16711936);
                            Paint paint5 = paint4;
                            float f14 = f2;
                            Paint paint6 = paint5;
                            canvas2.drawLine(f13, f3, f14, f8, paint6);
                            canvas2.drawLine(f13, f8, f14, f3, paint6);
                        }
                    }
                }
            }
        }
    }

    public int getMaxHeight() {
        return this.f2086l;
    }

    public int getMaxWidth() {
        return this.f2085k;
    }

    public int getMinHeight() {
        return this.f2084j;
    }

    public int getMinWidth() {
        return this.f2083i;
    }

    public int getOptimizationLevel() {
        return this.f2082h.mo2624V();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            C0444f fVar = layoutParams.f2151m0;
            if ((childAt.getVisibility() != 8 || layoutParams.f2124Y || layoutParams.f2125Z || layoutParams.f2129b0 || isInEditMode) && !layoutParams.f2127a0) {
                int i6 = fVar.mo2585i();
                int j = fVar.mo2587j();
                int A = fVar.mo2525A() + i6;
                int k = fVar.mo2589k() + j;
                childAt.layout(i6, j, A, k);
                if (childAt instanceof Placeholder) {
                    View content = ((Placeholder) childAt).getContent();
                    if (content != null) {
                        content.setVisibility(0);
                        content.layout(i6, j, A, k);
                    }
                }
            }
        }
        int size = this.f2080f.size();
        if (size > 0) {
            for (int i7 = 0; i7 < size; i7++) {
                ((ConstraintHelper) this.f2080f.get(i7)).mo2694b(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        System.currentTimeMillis();
        this.f2098x = i;
        this.f2099y = i2;
        MeasureSpec.getMode(i);
        MeasureSpec.getSize(i);
        MeasureSpec.getMode(i2);
        MeasureSpec.getSize(i2);
        if (VERSION.SDK_INT >= 17) {
            boolean z = true;
            if (!((getContext().getApplicationInfo().flags & 4194304) != 0) || 1 != getLayoutDirection()) {
                z = false;
            }
            this.f2082h.mo2642f(z);
        }
        mo2704a(i, i2);
        int A = this.f2082h.mo2525A() + getPaddingLeft() + getPaddingRight();
        int k = this.f2082h.mo2589k() + getPaddingTop() + getPaddingBottom();
        if (VERSION.SDK_INT >= 11) {
            int resolveSizeAndState = ViewGroup.resolveSizeAndState(k, i2, 0) & 16777215;
            int min = Math.min(this.f2085k, ViewGroup.resolveSizeAndState(A, i, 0) & 16777215);
            int min2 = Math.min(this.f2086l, resolveSizeAndState);
            if (this.f2082h.mo2634a0()) {
                min |= 16777216;
            }
            if (this.f2082h.mo2627Y()) {
                min2 |= 16777216;
            }
            setMeasuredDimension(min, min2);
            this.f2093s = min;
            this.f2094t = min2;
            return;
        }
        setMeasuredDimension(A, k);
        this.f2093s = A;
        this.f2094t = k;
    }

    public void onViewAdded(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewAdded(view);
        }
        C0444f a = mo2702a(view);
        if ((view instanceof Guideline) && !(a instanceof C0451j)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.f2151m0 = new C0451j();
            layoutParams.f2124Y = true;
            ((C0451j) layoutParams.f2151m0).mo2647B(layoutParams.f2117R);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.mo2691a();
            ((LayoutParams) view.getLayoutParams()).f2125Z = true;
            if (!this.f2080f.contains(constraintHelper)) {
                this.f2080f.add(constraintHelper);
            }
        }
        this.f2079e.put(view.getId(), view);
        this.f2087m = true;
    }

    public void onViewRemoved(View view) {
        if (VERSION.SDK_INT >= 14) {
            super.onViewRemoved(view);
        }
        this.f2079e.remove(view.getId());
        C0444f a = mo2702a(view);
        this.f2082h.mo2681c(a);
        this.f2080f.remove(view);
        this.f2081g.remove(a);
        this.f2087m = true;
    }

    public void removeView(View view) {
        super.removeView(view);
        if (VERSION.SDK_INT < 14) {
            onViewRemoved(view);
        }
    }

    public void requestLayout() {
        super.requestLayout();
        this.f2087m = true;
        this.f2093s = -1;
        this.f2094t = -1;
    }

    public void setConstraintSet(C0473c cVar) {
        this.f2089o = cVar;
    }

    public void setId(int i) {
        this.f2079e.remove(getId());
        super.setId(i);
        this.f2079e.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.f2086l) {
            this.f2086l = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.f2085k) {
            this.f2085k = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.f2084j) {
            this.f2084j = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.f2083i) {
            this.f2083i = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(C0479d dVar) {
        C0470b bVar = this.f2090p;
        if (bVar != null) {
            bVar.mo2758a(dVar);
        }
    }

    public void setOptimizationLevel(int i) {
        this.f2088n = i;
        this.f2082h.mo2621A(i);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: c */
    private final C0444f mo2261c(int i) {
        C0444f fVar;
        if (i == 0) {
            return this.f2082h;
        }
        View view = (View) this.f2079e.get(i);
        if (view == null) {
            view = findViewById(i);
            if (!(view == null || view == this || view.getParent() != this)) {
                onViewAdded(view);
            }
        }
        if (view == this) {
            return this.f2082h;
        }
        if (view == null) {
            fVar = null;
        } else {
            fVar = ((LayoutParams) view.getLayoutParams()).f2151m0;
        }
        return fVar;
    }

    /* renamed from: a */
    public void mo2705a(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f2092r == null) {
                this.f2092r = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf(Constants.URL_PATH_DELIMITER);
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.f2092r.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo2257b(int i) {
        this.f2090p = new C0470b(getContext(), this, i);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: b */
    private boolean mo2256b() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            this.f2081g.clear();
            mo2248a();
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* renamed from: b */
    private void mo2258b(int i, int i2) {
        C0446b bVar;
        int i3;
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int mode2 = MeasureSpec.getMode(i2);
        int size2 = MeasureSpec.getSize(i2);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = getPaddingTop() + getPaddingBottom();
        int paddingLeft2 = getPaddingLeft() + getPaddingRight();
        C0446b bVar2 = C0446b.FIXED;
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                bVar = C0446b.WRAP_CONTENT;
            } else if (mode != 1073741824) {
                bVar = bVar2;
            } else {
                i3 = Math.min(this.f2085k, size) - paddingLeft2;
                bVar = bVar2;
            }
            i3 = 0;
        } else {
            i3 = size;
            bVar = C0446b.WRAP_CONTENT;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                bVar2 = C0446b.WRAP_CONTENT;
            } else if (mode2 == 1073741824) {
                size2 = Math.min(this.f2086l, size2) - paddingTop2;
            }
            size2 = 0;
        } else {
            bVar2 = C0446b.WRAP_CONTENT;
        }
        this.f2082h.mo2617x(paddingLeft);
        this.f2082h.mo2619y(paddingTop);
        this.f2082h.mo2600p(this.f2085k);
        this.f2082h.mo2598o(this.f2086l);
        this.f2082h.mo2604r(0);
        this.f2082h.mo2602q(0);
        this.f2082h.mo2548a(bVar);
        this.f2082h.mo2611u(i3);
        this.f2082h.mo2562b(bVar2);
        this.f2082h.mo2594m(size2);
        this.f2082h.mo2604r((this.f2083i - getPaddingLeft()) - getPaddingRight());
        this.f2082h.mo2602q((this.f2084j - getPaddingTop()) - getPaddingBottom());
    }

    /* renamed from: a */
    public Object mo2703a(int i, Object obj) {
        if (i == 0 && (obj instanceof String)) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.f2092r;
            if (hashMap != null && hashMap.containsKey(str)) {
                return this.f2092r.get(str);
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m2168a(AttributeSet attributeSet, int i, int i2) {
        this.f2082h.mo2552a((Object) this);
        this.f2082h.mo2630a((Measurer) this.f2097w);
        this.f2079e.put(getId(), this);
        this.f2089o = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0481f.ConstraintLayout_Layout, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == C0481f.ConstraintLayout_Layout_android_minWidth) {
                    this.f2083i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2083i);
                } else if (index == C0481f.ConstraintLayout_Layout_android_minHeight) {
                    this.f2084j = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2084j);
                } else if (index == C0481f.ConstraintLayout_Layout_android_maxWidth) {
                    this.f2085k = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2085k);
                } else if (index == C0481f.ConstraintLayout_Layout_android_maxHeight) {
                    this.f2086l = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2086l);
                } else if (index == C0481f.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.f2088n = obtainStyledAttributes.getInt(index, this.f2088n);
                } else if (index == C0481f.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            mo2257b(resourceId);
                        } catch (NotFoundException unused) {
                            this.f2090p = null;
                        }
                    }
                } else if (index == C0481f.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        this.f2089o = new C0473c();
                        this.f2089o.mo2778b(getContext(), resourceId2);
                    } catch (NotFoundException unused2) {
                        this.f2089o = null;
                    }
                    this.f2091q = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f2082h.mo2621A(this.f2088n);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new C0464a(Looper.getMainLooper());
        m2168a(attributeSet, 0, 0);
    }

    /* renamed from: a */
    private void mo2248a() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            C0444f a = mo2702a(getChildAt(i));
            if (a != null) {
                a.mo2534J();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    mo2705a(0, (Object) resourceName, (Object) Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    mo2261c(childAt.getId()).mo2553a(resourceName);
                } catch (NotFoundException unused) {
                }
            }
        } else {
            this.f2082h.mo2553a("root");
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                try {
                    String resourceName2 = getResources().getResourceName(childAt2.getId());
                    mo2705a(0, (Object) resourceName2, (Object) Integer.valueOf(childAt2.getId()));
                    int indexOf2 = resourceName2.indexOf(47);
                    if (indexOf2 != -1) {
                        resourceName2 = resourceName2.substring(indexOf2 + 1);
                    }
                    mo2261c(childAt2.getId()).mo2553a(resourceName2);
                } catch (NotFoundException unused2) {
                }
            }
        }
        if (this.f2091q != -1) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt3 = getChildAt(i4);
                if (childAt3.getId() == this.f2091q && (childAt3 instanceof Constraints)) {
                    this.f2089o = ((Constraints) childAt3).getConstraintSet();
                }
            }
        }
        C0473c cVar = this.f2089o;
        if (cVar != null) {
            cVar.mo2771a(this, true);
        }
        this.f2082h.mo2679T();
        int size = this.f2080f.size();
        if (size > 0) {
            for (int i5 = 0; i5 < size; i5++) {
                ((ConstraintHelper) this.f2080f.get(i5)).mo2696d(this);
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            if (childAt4 instanceof Placeholder) {
                ((Placeholder) childAt4).mo2744b(this);
            }
        }
        this.f2095u.clear();
        this.f2095u.put(0, this.f2082h);
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            this.f2095u.put(childAt5.getId(), mo2702a(childAt5));
        }
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt6 = getChildAt(i8);
            C0444f a2 = mo2702a(childAt6);
            if (a2 != null) {
                LayoutParams layoutParams = (LayoutParams) childAt6.getLayoutParams();
                this.f2082h.add(a2);
                mo2706a(isInEditMode, childAt6, a2, layoutParams, this.f2095u);
            }
        }
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new C0464a(Looper.getMainLooper());
        m2168a(attributeSet, i, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        new C0464a(Looper.getMainLooper());
        m2168a(attributeSet, i, i2);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0227  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2706a(boolean r26, android.view.View r27, androidx.constraintlayout.solver.widgets.C0444f r28, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r29, android.util.SparseArray<androidx.constraintlayout.solver.widgets.C0444f> r30) {
        /*
            r25 = this;
            r0 = r25
            r1 = r27
            r7 = r28
            r8 = r29
            r9 = r30
            r29.mo2729b()
            r10 = 0
            r8.f2153n0 = r10
            int r2 = r27.getVisibility()
            r7.mo2608t(r2)
            boolean r2 = r8.f2127a0
            r11 = 1
            if (r2 == 0) goto L_0x0024
            r7.mo2566b(r11)
            r2 = 8
            r7.mo2608t(r2)
        L_0x0024:
            r7.mo2552a(r1)
            boolean r2 = r8.f2122W
            if (r2 == 0) goto L_0x002f
            boolean r2 = r8.f2121V
            if (r2 != 0) goto L_0x0034
        L_0x002f:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.f> r2 = r0.f2081g
            r2.add(r7)
        L_0x0034:
            boolean r2 = r1 instanceof androidx.constraintlayout.widget.ConstraintHelper
            if (r2 == 0) goto L_0x0043
            androidx.constraintlayout.widget.ConstraintHelper r1 = (androidx.constraintlayout.widget.ConstraintHelper) r1
            androidx.constraintlayout.solver.widgets.g r2 = r0.f2082h
            boolean r2 = r2.mo2628Z()
            r1.mo2682a(r7, r2)
        L_0x0043:
            boolean r1 = r8.f2124Y
            r2 = 17
            r12 = -1
            if (r1 == 0) goto L_0x0076
            r1 = r7
            androidx.constraintlayout.solver.widgets.j r1 = (androidx.constraintlayout.solver.widgets.C0451j) r1
            int r3 = r8.f2145j0
            int r4 = r8.f2147k0
            float r5 = r8.f2149l0
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 >= r2) goto L_0x005d
            int r3 = r8.f2126a
            int r4 = r8.f2128b
            float r5 = r8.f2130c
        L_0x005d:
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0068
            r1.mo2651e(r5)
            goto L_0x02d2
        L_0x0068:
            if (r3 == r12) goto L_0x006f
            r1.mo2504z(r3)
            goto L_0x02d2
        L_0x006f:
            if (r4 == r12) goto L_0x02d2
            r1.mo2646A(r4)
            goto L_0x02d2
        L_0x0076:
            int r1 = r8.f2131c0
            int r3 = r8.f2133d0
            int r4 = r8.f2135e0
            int r5 = r8.f2137f0
            int r6 = r8.f2139g0
            int r13 = r8.f2141h0
            float r14 = r8.f2143i0
            int r15 = android.os.Build.VERSION.SDK_INT
            if (r15 >= r2) goto L_0x00bc
            int r1 = r8.f2132d
            int r2 = r8.f2134e
            int r4 = r8.f2136f
            int r5 = r8.f2138g
            int r3 = r8.f2159t
            int r6 = r8.f2161v
            float r14 = r8.f2165z
            if (r1 != r12) goto L_0x00a5
            if (r2 != r12) goto L_0x00a5
            int r13 = r8.f2156q
            if (r13 == r12) goto L_0x00a0
            r1 = r13
            goto L_0x00a5
        L_0x00a0:
            int r13 = r8.f2155p
            if (r13 == r12) goto L_0x00a5
            r2 = r13
        L_0x00a5:
            if (r4 != r12) goto L_0x00b8
            if (r5 != r12) goto L_0x00b8
            int r13 = r8.f2157r
            if (r13 == r12) goto L_0x00ae
            goto L_0x00b9
        L_0x00ae:
            int r13 = r8.f2158s
            if (r13 == r12) goto L_0x00b8
            r15 = r6
            r5 = r14
            r6 = r3
            r14 = r13
            r13 = r4
            goto L_0x00c4
        L_0x00b8:
            r13 = r4
        L_0x00b9:
            r15 = r6
            r6 = r3
            goto L_0x00bf
        L_0x00bc:
            r2 = r3
            r15 = r13
            r13 = r4
        L_0x00bf:
            r24 = r14
            r14 = r5
            r5 = r24
        L_0x00c4:
            int r3 = r8.f2150m
            if (r3 == r12) goto L_0x00d9
            java.lang.Object r1 = r9.get(r3)
            androidx.constraintlayout.solver.widgets.f r1 = (androidx.constraintlayout.solver.widgets.C0444f) r1
            if (r1 == 0) goto L_0x0211
            float r2 = r8.f2154o
            int r3 = r8.f2152n
            r7.mo2550a(r1, r2, r3)
            goto L_0x0211
        L_0x00d9:
            if (r1 == r12) goto L_0x00f6
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            androidx.constraintlayout.solver.widgets.f r3 = (androidx.constraintlayout.solver.widgets.C0444f) r3
            if (r3 == 0) goto L_0x00f4
            androidx.constraintlayout.solver.widgets.e$d r4 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.LEFT
            int r2 = r8.leftMargin
            r1 = r28
            r16 = r2
            r2 = r4
            r10 = r5
            r5 = r16
            r1.mo2544a(r2, r3, r4, r5, r6)
            goto L_0x010d
        L_0x00f4:
            r10 = r5
            goto L_0x010d
        L_0x00f6:
            r10 = r5
            if (r2 == r12) goto L_0x010d
            java.lang.Object r1 = r9.get(r2)
            r3 = r1
            androidx.constraintlayout.solver.widgets.f r3 = (androidx.constraintlayout.solver.widgets.C0444f) r3
            if (r3 == 0) goto L_0x010d
            androidx.constraintlayout.solver.widgets.e$d r2 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.LEFT
            androidx.constraintlayout.solver.widgets.e$d r4 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.RIGHT
            int r5 = r8.leftMargin
            r1 = r28
            r1.mo2544a(r2, r3, r4, r5, r6)
        L_0x010d:
            if (r13 == r12) goto L_0x0125
            java.lang.Object r1 = r9.get(r13)
            r3 = r1
            androidx.constraintlayout.solver.widgets.f r3 = (androidx.constraintlayout.solver.widgets.C0444f) r3
            if (r3 == 0) goto L_0x013b
            androidx.constraintlayout.solver.widgets.e$d r2 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.RIGHT
            androidx.constraintlayout.solver.widgets.e$d r4 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.LEFT
            int r5 = r8.rightMargin
            r1 = r28
            r6 = r15
            r1.mo2544a(r2, r3, r4, r5, r6)
            goto L_0x013b
        L_0x0125:
            if (r14 == r12) goto L_0x013b
            java.lang.Object r1 = r9.get(r14)
            r3 = r1
            androidx.constraintlayout.solver.widgets.f r3 = (androidx.constraintlayout.solver.widgets.C0444f) r3
            if (r3 == 0) goto L_0x013b
            androidx.constraintlayout.solver.widgets.e$d r4 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.RIGHT
            int r5 = r8.rightMargin
            r1 = r28
            r2 = r4
            r6 = r15
            r1.mo2544a(r2, r3, r4, r5, r6)
        L_0x013b:
            int r1 = r8.f2140h
            if (r1 == r12) goto L_0x0155
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            androidx.constraintlayout.solver.widgets.f r3 = (androidx.constraintlayout.solver.widgets.C0444f) r3
            if (r3 == 0) goto L_0x016f
            androidx.constraintlayout.solver.widgets.e$d r4 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.TOP
            int r5 = r8.topMargin
            int r6 = r8.f2160u
            r1 = r28
            r2 = r4
            r1.mo2544a(r2, r3, r4, r5, r6)
            goto L_0x016f
        L_0x0155:
            int r1 = r8.f2142i
            if (r1 == r12) goto L_0x016f
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            androidx.constraintlayout.solver.widgets.f r3 = (androidx.constraintlayout.solver.widgets.C0444f) r3
            if (r3 == 0) goto L_0x016f
            androidx.constraintlayout.solver.widgets.e$d r2 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.TOP
            androidx.constraintlayout.solver.widgets.e$d r4 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.BOTTOM
            int r5 = r8.topMargin
            int r6 = r8.f2160u
            r1 = r28
            r1.mo2544a(r2, r3, r4, r5, r6)
        L_0x016f:
            int r1 = r8.f2144j
            if (r1 == r12) goto L_0x018a
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            androidx.constraintlayout.solver.widgets.f r3 = (androidx.constraintlayout.solver.widgets.C0444f) r3
            if (r3 == 0) goto L_0x01a3
            androidx.constraintlayout.solver.widgets.e$d r2 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.BOTTOM
            androidx.constraintlayout.solver.widgets.e$d r4 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.TOP
            int r5 = r8.bottomMargin
            int r6 = r8.f2162w
            r1 = r28
            r1.mo2544a(r2, r3, r4, r5, r6)
            goto L_0x01a3
        L_0x018a:
            int r1 = r8.f2146k
            if (r1 == r12) goto L_0x01a3
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            androidx.constraintlayout.solver.widgets.f r3 = (androidx.constraintlayout.solver.widgets.C0444f) r3
            if (r3 == 0) goto L_0x01a3
            androidx.constraintlayout.solver.widgets.e$d r4 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.BOTTOM
            int r5 = r8.bottomMargin
            int r6 = r8.f2162w
            r1 = r28
            r2 = r4
            r1.mo2544a(r2, r3, r4, r5, r6)
        L_0x01a3:
            int r1 = r8.f2148l
            if (r1 == r12) goto L_0x0200
            android.util.SparseArray<android.view.View> r2 = r0.f2079e
            java.lang.Object r1 = r2.get(r1)
            android.view.View r1 = (android.view.View) r1
            int r2 = r8.f2148l
            java.lang.Object r2 = r9.get(r2)
            androidx.constraintlayout.solver.widgets.f r2 = (androidx.constraintlayout.solver.widgets.C0444f) r2
            if (r2 == 0) goto L_0x0200
            if (r1 == 0) goto L_0x0200
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            boolean r3 = r3 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r3 == 0) goto L_0x0200
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r1
            r8.f2123X = r11
            r1.f2123X = r11
            androidx.constraintlayout.solver.widgets.e$d r3 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.BASELINE
            androidx.constraintlayout.solver.widgets.e r17 = r7.mo2539a(r3)
            androidx.constraintlayout.solver.widgets.e$d r3 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.BASELINE
            androidx.constraintlayout.solver.widgets.e r18 = r2.mo2539a(r3)
            r19 = 0
            r20 = -1
            androidx.constraintlayout.solver.widgets.e$c r21 = androidx.constraintlayout.solver.widgets.C0439e.C0442c.STRONG
            r22 = 0
            r23 = 1
            r17.mo2512a(r18, r19, r20, r21, r22, r23)
            r7.mo2554a(r11)
            androidx.constraintlayout.solver.widgets.f r1 = r1.f2151m0
            r1.mo2554a(r11)
            androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.TOP
            androidx.constraintlayout.solver.widgets.e r1 = r7.mo2539a(r1)
            r1.mo2523k()
            androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.BOTTOM
            androidx.constraintlayout.solver.widgets.e r1 = r7.mo2539a(r1)
            r1.mo2523k()
        L_0x0200:
            r1 = 0
            int r2 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r2 < 0) goto L_0x0208
            r7.mo2540a(r10)
        L_0x0208:
            float r2 = r8.f2100A
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x0211
            r7.mo2569c(r2)
        L_0x0211:
            if (r26 == 0) goto L_0x0222
            int r1 = r8.f2115P
            if (r1 != r12) goto L_0x021b
            int r1 = r8.f2116Q
            if (r1 == r12) goto L_0x0222
        L_0x021b:
            int r1 = r8.f2115P
            int r2 = r8.f2116Q
            r7.mo2570c(r1, r2)
        L_0x0222:
            boolean r1 = r8.f2121V
            r2 = -2
            if (r1 != 0) goto L_0x024f
            int r1 = r8.width
            if (r1 != r12) goto L_0x0245
            androidx.constraintlayout.solver.widgets.f$b r1 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.MATCH_PARENT
            r7.mo2548a(r1)
            androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.LEFT
            androidx.constraintlayout.solver.widgets.e r1 = r7.mo2539a(r1)
            int r3 = r8.leftMargin
            r1.f1856e = r3
            androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.RIGHT
            androidx.constraintlayout.solver.widgets.e r1 = r7.mo2539a(r1)
            int r3 = r8.rightMargin
            r1.f1856e = r3
            goto L_0x0262
        L_0x0245:
            androidx.constraintlayout.solver.widgets.f$b r1 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.MATCH_CONSTRAINT
            r7.mo2548a(r1)
            r1 = 0
            r7.mo2611u(r1)
            goto L_0x0262
        L_0x024f:
            androidx.constraintlayout.solver.widgets.f$b r1 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.FIXED
            r7.mo2548a(r1)
            int r1 = r8.width
            r7.mo2611u(r1)
            int r1 = r8.width
            if (r1 != r2) goto L_0x0262
            androidx.constraintlayout.solver.widgets.f$b r1 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.WRAP_CONTENT
            r7.mo2548a(r1)
        L_0x0262:
            boolean r1 = r8.f2122W
            if (r1 != 0) goto L_0x028e
            int r1 = r8.height
            if (r1 != r12) goto L_0x0284
            androidx.constraintlayout.solver.widgets.f$b r1 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.MATCH_PARENT
            r7.mo2562b(r1)
            androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.TOP
            androidx.constraintlayout.solver.widgets.e r1 = r7.mo2539a(r1)
            int r2 = r8.topMargin
            r1.f1856e = r2
            androidx.constraintlayout.solver.widgets.e$d r1 = androidx.constraintlayout.solver.widgets.C0439e.C0443d.BOTTOM
            androidx.constraintlayout.solver.widgets.e r1 = r7.mo2539a(r1)
            int r2 = r8.bottomMargin
            r1.f1856e = r2
            goto L_0x02a1
        L_0x0284:
            androidx.constraintlayout.solver.widgets.f$b r1 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.MATCH_CONSTRAINT
            r7.mo2562b(r1)
            r1 = 0
            r7.mo2594m(r1)
            goto L_0x02a1
        L_0x028e:
            androidx.constraintlayout.solver.widgets.f$b r1 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.FIXED
            r7.mo2562b(r1)
            int r1 = r8.height
            r7.mo2594m(r1)
            int r1 = r8.height
            if (r1 != r2) goto L_0x02a1
            androidx.constraintlayout.solver.widgets.f$b r1 = androidx.constraintlayout.solver.widgets.C0444f.C0446b.WRAP_CONTENT
            r7.mo2562b(r1)
        L_0x02a1:
            java.lang.String r1 = r8.f2101B
            if (r1 == 0) goto L_0x02a8
            r7.mo2565b(r1)
        L_0x02a8:
            float r1 = r8.f2103D
            r7.mo2559b(r1)
            float r1 = r8.f2104E
            r7.mo2575d(r1)
            int r1 = r8.f2105F
            r7.mo2596n(r1)
            int r1 = r8.f2106G
            r7.mo2606s(r1)
            int r1 = r8.f2107H
            int r2 = r8.f2109J
            int r3 = r8.f2111L
            float r4 = r8.f2113N
            r7.mo2542a(r1, r2, r3, r4)
            int r1 = r8.f2108I
            int r2 = r8.f2110K
            int r3 = r8.f2112M
            float r4 = r8.f2114O
            r7.mo2561b(r1, r2, r3, r4)
        L_0x02d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.mo2706a(boolean, android.view.View, androidx.constraintlayout.solver.widgets.f, androidx.constraintlayout.widget.ConstraintLayout$LayoutParams, android.util.SparseArray):void");
    }

    /* renamed from: a */
    public final C0444f mo2702a(View view) {
        C0444f fVar;
        if (view == this) {
            return this.f2082h;
        }
        if (view == null) {
            fVar = null;
        } else {
            fVar = ((LayoutParams) view.getLayoutParams()).f2151m0;
        }
        return fVar;
    }

    /* renamed from: a */
    public void mo2704a(int i, int i2) {
        if (this.f2087m) {
            this.f2087m = false;
            if (mo2256b()) {
                this.f2082h.mo2641e0();
            }
        }
        mo2258b(i, i2);
        this.f2082h.mo2629a(this.f2088n, MeasureSpec.getMode(i), MeasureSpec.getSize(i), MeasureSpec.getMode(i2), MeasureSpec.getSize(i2), this.f2093s, this.f2094t);
    }

    /* renamed from: a */
    public void mo2252a(int i, int i2, int i3) {
        C0470b bVar = this.f2090p;
        if (bVar != null) {
            bVar.mo2757a(i, (float) i2, (float) i3);
        }
    }

    /* renamed from: a */
    public View mo2701a(int i) {
        return (View) this.f2079e.get(i);
    }
}
