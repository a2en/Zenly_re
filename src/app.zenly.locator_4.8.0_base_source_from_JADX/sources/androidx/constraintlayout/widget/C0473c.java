package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.motion.widget.C0326a;
import androidx.constraintlayout.solver.widgets.C0444f;
import androidx.constraintlayout.solver.widgets.C0453k;
import androidx.constraintlayout.widget.Constraints.LayoutParams;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p214e.p229f.p230a.p231a.C7590c;

/* renamed from: androidx.constraintlayout.widget.c */
public class C0473c {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final int[] f2220d = {0, 4, 8};

    /* renamed from: e */
    private static SparseIntArray f2221e = new SparseIntArray();

    /* renamed from: a */
    private HashMap<String, C0467a> f2222a = new HashMap<>();

    /* renamed from: b */
    private boolean f2223b = true;

    /* renamed from: c */
    private HashMap<Integer, C0474a> f2224c = new HashMap<>();

    /* renamed from: androidx.constraintlayout.widget.c$a */
    public static class C0474a {

        /* renamed from: a */
        int f2225a;

        /* renamed from: b */
        public final C0477d f2226b = new C0477d();

        /* renamed from: c */
        public final C0476c f2227c = new C0476c();

        /* renamed from: d */
        public final C0475b f2228d = new C0475b();

        /* renamed from: e */
        public final C0478e f2229e = new C0478e();

        /* renamed from: f */
        public HashMap<String, C0467a> f2230f = new HashMap<>();

        public C0474a clone() {
            C0474a aVar = new C0474a();
            aVar.f2228d.mo2791a(this.f2228d);
            aVar.f2227c.mo2793a(this.f2227c);
            aVar.f2226b.mo2795a(this.f2226b);
            aVar.f2229e.mo2797a(this.f2229e);
            aVar.f2225a = this.f2225a;
            return aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m2247a(ConstraintHelper constraintHelper, int i, LayoutParams layoutParams) {
            m2246a(i, layoutParams);
            if (constraintHelper instanceof Barrier) {
                C0475b bVar = this.f2228d;
                bVar.f2265d0 = 1;
                Barrier barrier = (Barrier) constraintHelper;
                bVar.f2261b0 = barrier.getType();
                this.f2228d.f2267e0 = barrier.getReferencedIds();
                this.f2228d.f2263c0 = barrier.getMargin();
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m2246a(int i, LayoutParams layoutParams) {
            m2245a(i, (ConstraintLayout.LayoutParams) layoutParams);
            this.f2226b.f2305d = layoutParams.f2172o0;
            C0478e eVar = this.f2229e;
            eVar.f2309b = layoutParams.f2175r0;
            eVar.f2310c = layoutParams.f2176s0;
            eVar.f2311d = layoutParams.f2177t0;
            eVar.f2312e = layoutParams.f2178u0;
            eVar.f2313f = layoutParams.f2179v0;
            eVar.f2314g = layoutParams.f2180w0;
            eVar.f2315h = layoutParams.f2181x0;
            eVar.f2316i = layoutParams.f2182y0;
            eVar.f2317j = layoutParams.f2183z0;
            eVar.f2318k = layoutParams.f2171A0;
            eVar.f2320m = layoutParams.f2174q0;
            eVar.f2319l = layoutParams.f2173p0;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m2245a(int i, ConstraintLayout.LayoutParams layoutParams) {
            this.f2225a = i;
            C0475b bVar = this.f2228d;
            bVar.f2272h = layoutParams.f2132d;
            bVar.f2274i = layoutParams.f2134e;
            bVar.f2276j = layoutParams.f2136f;
            bVar.f2278k = layoutParams.f2138g;
            bVar.f2279l = layoutParams.f2140h;
            bVar.f2280m = layoutParams.f2142i;
            bVar.f2281n = layoutParams.f2144j;
            bVar.f2282o = layoutParams.f2146k;
            bVar.f2283p = layoutParams.f2148l;
            bVar.f2284q = layoutParams.f2155p;
            bVar.f2285r = layoutParams.f2156q;
            bVar.f2286s = layoutParams.f2157r;
            bVar.f2287t = layoutParams.f2158s;
            bVar.f2288u = layoutParams.f2165z;
            bVar.f2289v = layoutParams.f2100A;
            bVar.f2290w = layoutParams.f2101B;
            bVar.f2291x = layoutParams.f2150m;
            bVar.f2292y = layoutParams.f2152n;
            bVar.f2293z = layoutParams.f2154o;
            bVar.f2232A = layoutParams.f2115P;
            bVar.f2233B = layoutParams.f2116Q;
            bVar.f2234C = layoutParams.f2117R;
            bVar.f2270g = layoutParams.f2130c;
            bVar.f2266e = layoutParams.f2126a;
            bVar.f2268f = layoutParams.f2128b;
            bVar.f2262c = layoutParams.width;
            this.f2228d.f2264d = layoutParams.height;
            C0475b bVar2 = this.f2228d;
            bVar2.f2235D = layoutParams.leftMargin;
            bVar2.f2236E = layoutParams.rightMargin;
            bVar2.f2237F = layoutParams.topMargin;
            bVar2.f2238G = layoutParams.bottomMargin;
            bVar2.f2247P = layoutParams.f2104E;
            bVar2.f2248Q = layoutParams.f2103D;
            bVar2.f2250S = layoutParams.f2106G;
            bVar2.f2249R = layoutParams.f2105F;
            boolean z = layoutParams.f2118S;
            bVar2.f2273h0 = z;
            bVar2.f2275i0 = layoutParams.f2119T;
            bVar2.f2251T = layoutParams.f2107H;
            bVar2.f2252U = layoutParams.f2108I;
            bVar2.f2273h0 = z;
            bVar2.f2253V = layoutParams.f2111L;
            bVar2.f2254W = layoutParams.f2112M;
            bVar2.f2255X = layoutParams.f2109J;
            bVar2.f2256Y = layoutParams.f2110K;
            bVar2.f2257Z = layoutParams.f2113N;
            bVar2.f2259a0 = layoutParams.f2114O;
            bVar2.f2271g0 = layoutParams.f2120U;
            bVar2.f2242K = layoutParams.f2160u;
            bVar2.f2244M = layoutParams.f2162w;
            bVar2.f2241J = layoutParams.f2159t;
            bVar2.f2243L = layoutParams.f2161v;
            bVar2.f2246O = layoutParams.f2163x;
            bVar2.f2245N = layoutParams.f2164y;
            if (VERSION.SDK_INT >= 17) {
                bVar2.f2239H = layoutParams.getMarginEnd();
                this.f2228d.f2240I = layoutParams.getMarginStart();
            }
        }

        /* renamed from: a */
        public void mo2788a(ConstraintLayout.LayoutParams layoutParams) {
            C0475b bVar = this.f2228d;
            layoutParams.f2132d = bVar.f2272h;
            layoutParams.f2134e = bVar.f2274i;
            layoutParams.f2136f = bVar.f2276j;
            layoutParams.f2138g = bVar.f2278k;
            layoutParams.f2140h = bVar.f2279l;
            layoutParams.f2142i = bVar.f2280m;
            layoutParams.f2144j = bVar.f2281n;
            layoutParams.f2146k = bVar.f2282o;
            layoutParams.f2148l = bVar.f2283p;
            layoutParams.f2155p = bVar.f2284q;
            layoutParams.f2156q = bVar.f2285r;
            layoutParams.f2157r = bVar.f2286s;
            layoutParams.f2158s = bVar.f2287t;
            layoutParams.leftMargin = bVar.f2235D;
            layoutParams.rightMargin = bVar.f2236E;
            layoutParams.topMargin = bVar.f2237F;
            layoutParams.bottomMargin = bVar.f2238G;
            layoutParams.f2163x = bVar.f2246O;
            layoutParams.f2164y = bVar.f2245N;
            layoutParams.f2160u = bVar.f2242K;
            layoutParams.f2162w = bVar.f2244M;
            layoutParams.f2165z = bVar.f2288u;
            layoutParams.f2100A = bVar.f2289v;
            layoutParams.f2150m = bVar.f2291x;
            layoutParams.f2152n = bVar.f2292y;
            layoutParams.f2154o = bVar.f2293z;
            layoutParams.f2101B = bVar.f2290w;
            layoutParams.f2115P = bVar.f2232A;
            layoutParams.f2116Q = bVar.f2233B;
            layoutParams.f2104E = bVar.f2247P;
            layoutParams.f2103D = bVar.f2248Q;
            layoutParams.f2106G = bVar.f2250S;
            layoutParams.f2105F = bVar.f2249R;
            layoutParams.f2118S = bVar.f2273h0;
            layoutParams.f2119T = bVar.f2275i0;
            layoutParams.f2107H = bVar.f2251T;
            layoutParams.f2108I = bVar.f2252U;
            layoutParams.f2111L = bVar.f2253V;
            layoutParams.f2112M = bVar.f2254W;
            layoutParams.f2109J = bVar.f2255X;
            layoutParams.f2110K = bVar.f2256Y;
            layoutParams.f2113N = bVar.f2257Z;
            layoutParams.f2114O = bVar.f2259a0;
            layoutParams.f2117R = bVar.f2234C;
            layoutParams.f2130c = bVar.f2270g;
            layoutParams.f2126a = bVar.f2266e;
            layoutParams.f2128b = bVar.f2268f;
            layoutParams.width = bVar.f2262c;
            layoutParams.height = bVar.f2264d;
            String str = bVar.f2271g0;
            if (str != null) {
                layoutParams.f2120U = str;
            }
            if (VERSION.SDK_INT >= 17) {
                layoutParams.setMarginStart(this.f2228d.f2240I);
                layoutParams.setMarginEnd(this.f2228d.f2239H);
            }
            layoutParams.mo2729b();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$b */
    public static class C0475b {

        /* renamed from: k0 */
        private static SparseIntArray f2231k0 = new SparseIntArray();

        /* renamed from: A */
        public int f2232A = -1;

        /* renamed from: B */
        public int f2233B = -1;

        /* renamed from: C */
        public int f2234C = -1;

        /* renamed from: D */
        public int f2235D = -1;

        /* renamed from: E */
        public int f2236E = -1;

        /* renamed from: F */
        public int f2237F = -1;

        /* renamed from: G */
        public int f2238G = -1;

        /* renamed from: H */
        public int f2239H = -1;

        /* renamed from: I */
        public int f2240I = -1;

        /* renamed from: J */
        public int f2241J = -1;

        /* renamed from: K */
        public int f2242K = -1;

        /* renamed from: L */
        public int f2243L = -1;

        /* renamed from: M */
        public int f2244M = -1;

        /* renamed from: N */
        public int f2245N = -1;

        /* renamed from: O */
        public int f2246O = -1;

        /* renamed from: P */
        public float f2247P = -1.0f;

        /* renamed from: Q */
        public float f2248Q = -1.0f;

        /* renamed from: R */
        public int f2249R = 0;

        /* renamed from: S */
        public int f2250S = 0;

        /* renamed from: T */
        public int f2251T = 0;

        /* renamed from: U */
        public int f2252U = 0;

        /* renamed from: V */
        public int f2253V = -1;

        /* renamed from: W */
        public int f2254W = -1;

        /* renamed from: X */
        public int f2255X = -1;

        /* renamed from: Y */
        public int f2256Y = -1;

        /* renamed from: Z */
        public float f2257Z = 1.0f;

        /* renamed from: a */
        public boolean f2258a = false;

        /* renamed from: a0 */
        public float f2259a0 = 1.0f;

        /* renamed from: b */
        public boolean f2260b = false;

        /* renamed from: b0 */
        public int f2261b0 = -1;

        /* renamed from: c */
        public int f2262c;

        /* renamed from: c0 */
        public int f2263c0 = 0;

        /* renamed from: d */
        public int f2264d;

        /* renamed from: d0 */
        public int f2265d0 = -1;

        /* renamed from: e */
        public int f2266e = -1;

        /* renamed from: e0 */
        public int[] f2267e0;

        /* renamed from: f */
        public int f2268f = -1;

        /* renamed from: f0 */
        public String f2269f0;

        /* renamed from: g */
        public float f2270g = -1.0f;

        /* renamed from: g0 */
        public String f2271g0;

        /* renamed from: h */
        public int f2272h = -1;

        /* renamed from: h0 */
        public boolean f2273h0 = false;

        /* renamed from: i */
        public int f2274i = -1;

        /* renamed from: i0 */
        public boolean f2275i0 = false;

        /* renamed from: j */
        public int f2276j = -1;

        /* renamed from: j0 */
        public boolean f2277j0 = true;

        /* renamed from: k */
        public int f2278k = -1;

        /* renamed from: l */
        public int f2279l = -1;

        /* renamed from: m */
        public int f2280m = -1;

        /* renamed from: n */
        public int f2281n = -1;

        /* renamed from: o */
        public int f2282o = -1;

        /* renamed from: p */
        public int f2283p = -1;

        /* renamed from: q */
        public int f2284q = -1;

        /* renamed from: r */
        public int f2285r = -1;

        /* renamed from: s */
        public int f2286s = -1;

        /* renamed from: t */
        public int f2287t = -1;

        /* renamed from: u */
        public float f2288u = 0.5f;

        /* renamed from: v */
        public float f2289v = 0.5f;

        /* renamed from: w */
        public String f2290w = null;

        /* renamed from: x */
        public int f2291x = -1;

        /* renamed from: y */
        public int f2292y = 0;

        /* renamed from: z */
        public float f2293z = 0.0f;

        static {
            f2231k0.append(C0481f.Layout_layout_constraintLeft_toLeftOf, 24);
            f2231k0.append(C0481f.Layout_layout_constraintLeft_toRightOf, 25);
            f2231k0.append(C0481f.Layout_layout_constraintRight_toLeftOf, 28);
            f2231k0.append(C0481f.Layout_layout_constraintRight_toRightOf, 29);
            f2231k0.append(C0481f.Layout_layout_constraintTop_toTopOf, 35);
            f2231k0.append(C0481f.Layout_layout_constraintTop_toBottomOf, 34);
            f2231k0.append(C0481f.Layout_layout_constraintBottom_toTopOf, 4);
            f2231k0.append(C0481f.Layout_layout_constraintBottom_toBottomOf, 3);
            f2231k0.append(C0481f.Layout_layout_constraintBaseline_toBaselineOf, 1);
            f2231k0.append(C0481f.Layout_layout_editor_absoluteX, 6);
            f2231k0.append(C0481f.Layout_layout_editor_absoluteY, 7);
            f2231k0.append(C0481f.Layout_layout_constraintGuide_begin, 17);
            f2231k0.append(C0481f.Layout_layout_constraintGuide_end, 18);
            f2231k0.append(C0481f.Layout_layout_constraintGuide_percent, 19);
            f2231k0.append(C0481f.Layout_android_orientation, 26);
            f2231k0.append(C0481f.Layout_layout_constraintStart_toEndOf, 31);
            f2231k0.append(C0481f.Layout_layout_constraintStart_toStartOf, 32);
            f2231k0.append(C0481f.Layout_layout_constraintEnd_toStartOf, 10);
            f2231k0.append(C0481f.Layout_layout_constraintEnd_toEndOf, 9);
            f2231k0.append(C0481f.Layout_layout_goneMarginLeft, 13);
            f2231k0.append(C0481f.Layout_layout_goneMarginTop, 16);
            f2231k0.append(C0481f.Layout_layout_goneMarginRight, 14);
            f2231k0.append(C0481f.Layout_layout_goneMarginBottom, 11);
            f2231k0.append(C0481f.Layout_layout_goneMarginStart, 15);
            f2231k0.append(C0481f.Layout_layout_goneMarginEnd, 12);
            f2231k0.append(C0481f.Layout_layout_constraintVertical_weight, 38);
            f2231k0.append(C0481f.Layout_layout_constraintHorizontal_weight, 37);
            f2231k0.append(C0481f.Layout_layout_constraintHorizontal_chainStyle, 39);
            f2231k0.append(C0481f.Layout_layout_constraintVertical_chainStyle, 40);
            f2231k0.append(C0481f.Layout_layout_constraintHorizontal_bias, 20);
            f2231k0.append(C0481f.Layout_layout_constraintVertical_bias, 36);
            f2231k0.append(C0481f.Layout_layout_constraintDimensionRatio, 5);
            f2231k0.append(C0481f.Layout_layout_constraintLeft_creator, 76);
            f2231k0.append(C0481f.Layout_layout_constraintTop_creator, 76);
            f2231k0.append(C0481f.Layout_layout_constraintRight_creator, 76);
            f2231k0.append(C0481f.Layout_layout_constraintBottom_creator, 76);
            f2231k0.append(C0481f.Layout_layout_constraintBaseline_creator, 76);
            f2231k0.append(C0481f.Layout_android_layout_marginLeft, 23);
            f2231k0.append(C0481f.Layout_android_layout_marginRight, 27);
            f2231k0.append(C0481f.Layout_android_layout_marginStart, 30);
            f2231k0.append(C0481f.Layout_android_layout_marginEnd, 8);
            f2231k0.append(C0481f.Layout_android_layout_marginTop, 33);
            f2231k0.append(C0481f.Layout_android_layout_marginBottom, 2);
            f2231k0.append(C0481f.Layout_android_layout_width, 22);
            f2231k0.append(C0481f.Layout_android_layout_height, 21);
            f2231k0.append(C0481f.Layout_layout_constraintCircle, 61);
            f2231k0.append(C0481f.Layout_layout_constraintCircleRadius, 62);
            f2231k0.append(C0481f.Layout_layout_constraintCircleAngle, 63);
            f2231k0.append(C0481f.Layout_layout_constraintWidth_percent, 69);
            f2231k0.append(C0481f.Layout_layout_constraintHeight_percent, 70);
            f2231k0.append(C0481f.Layout_chainUseRtl, 71);
            f2231k0.append(C0481f.Layout_barrierDirection, 72);
            f2231k0.append(C0481f.Layout_barrierMargin, 73);
            f2231k0.append(C0481f.Layout_constraint_referenced_ids, 74);
            f2231k0.append(C0481f.Layout_barrierAllowsGoneWidgets, 75);
        }

        /* renamed from: a */
        public void mo2791a(C0475b bVar) {
            this.f2258a = bVar.f2258a;
            this.f2262c = bVar.f2262c;
            this.f2260b = bVar.f2260b;
            this.f2264d = bVar.f2264d;
            this.f2266e = bVar.f2266e;
            this.f2268f = bVar.f2268f;
            this.f2270g = bVar.f2270g;
            this.f2272h = bVar.f2272h;
            this.f2274i = bVar.f2274i;
            this.f2276j = bVar.f2276j;
            this.f2278k = bVar.f2278k;
            this.f2279l = bVar.f2279l;
            this.f2280m = bVar.f2280m;
            this.f2281n = bVar.f2281n;
            this.f2282o = bVar.f2282o;
            this.f2283p = bVar.f2283p;
            this.f2284q = bVar.f2284q;
            this.f2285r = bVar.f2285r;
            this.f2286s = bVar.f2286s;
            this.f2287t = bVar.f2287t;
            this.f2288u = bVar.f2288u;
            this.f2289v = bVar.f2289v;
            this.f2290w = bVar.f2290w;
            this.f2291x = bVar.f2291x;
            this.f2292y = bVar.f2292y;
            this.f2293z = bVar.f2293z;
            this.f2232A = bVar.f2232A;
            this.f2233B = bVar.f2233B;
            this.f2234C = bVar.f2234C;
            this.f2235D = bVar.f2235D;
            this.f2236E = bVar.f2236E;
            this.f2237F = bVar.f2237F;
            this.f2238G = bVar.f2238G;
            this.f2239H = bVar.f2239H;
            this.f2240I = bVar.f2240I;
            this.f2241J = bVar.f2241J;
            this.f2242K = bVar.f2242K;
            this.f2243L = bVar.f2243L;
            this.f2244M = bVar.f2244M;
            this.f2245N = bVar.f2245N;
            this.f2246O = bVar.f2246O;
            this.f2247P = bVar.f2247P;
            this.f2248Q = bVar.f2248Q;
            this.f2249R = bVar.f2249R;
            this.f2250S = bVar.f2250S;
            this.f2251T = bVar.f2251T;
            this.f2252U = bVar.f2252U;
            this.f2253V = bVar.f2253V;
            this.f2254W = bVar.f2254W;
            this.f2255X = bVar.f2255X;
            this.f2256Y = bVar.f2256Y;
            this.f2257Z = bVar.f2257Z;
            this.f2259a0 = bVar.f2259a0;
            this.f2261b0 = bVar.f2261b0;
            this.f2263c0 = bVar.f2263c0;
            this.f2265d0 = bVar.f2265d0;
            this.f2271g0 = bVar.f2271g0;
            int[] iArr = bVar.f2267e0;
            if (iArr != null) {
                this.f2267e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f2267e0 = null;
            }
            this.f2269f0 = bVar.f2269f0;
            this.f2273h0 = bVar.f2273h0;
            this.f2275i0 = bVar.f2275i0;
            this.f2277j0 = bVar.f2277j0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2790a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0481f.Layout);
            this.f2260b = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = f2231k0.get(index);
                switch (i2) {
                    case 1:
                        this.f2283p = C0473c.m2216b(obtainStyledAttributes, index, this.f2283p);
                        break;
                    case 2:
                        this.f2238G = obtainStyledAttributes.getDimensionPixelSize(index, this.f2238G);
                        break;
                    case 3:
                        this.f2282o = C0473c.m2216b(obtainStyledAttributes, index, this.f2282o);
                        break;
                    case 4:
                        this.f2281n = C0473c.m2216b(obtainStyledAttributes, index, this.f2281n);
                        break;
                    case 5:
                        this.f2290w = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.f2232A = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2232A);
                        break;
                    case 7:
                        this.f2233B = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2233B);
                        break;
                    case 8:
                        this.f2239H = obtainStyledAttributes.getDimensionPixelSize(index, this.f2239H);
                        break;
                    case 9:
                        this.f2287t = C0473c.m2216b(obtainStyledAttributes, index, this.f2287t);
                        break;
                    case 10:
                        this.f2286s = C0473c.m2216b(obtainStyledAttributes, index, this.f2286s);
                        break;
                    case 11:
                        this.f2244M = obtainStyledAttributes.getDimensionPixelSize(index, this.f2244M);
                        break;
                    case 12:
                        this.f2245N = obtainStyledAttributes.getDimensionPixelSize(index, this.f2245N);
                        break;
                    case 13:
                        this.f2241J = obtainStyledAttributes.getDimensionPixelSize(index, this.f2241J);
                        break;
                    case 14:
                        this.f2243L = obtainStyledAttributes.getDimensionPixelSize(index, this.f2243L);
                        break;
                    case 15:
                        this.f2246O = obtainStyledAttributes.getDimensionPixelSize(index, this.f2246O);
                        break;
                    case 16:
                        this.f2242K = obtainStyledAttributes.getDimensionPixelSize(index, this.f2242K);
                        break;
                    case 17:
                        this.f2266e = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2266e);
                        break;
                    case 18:
                        this.f2268f = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2268f);
                        break;
                    case 19:
                        this.f2270g = obtainStyledAttributes.getFloat(index, this.f2270g);
                        break;
                    case 20:
                        this.f2288u = obtainStyledAttributes.getFloat(index, this.f2288u);
                        break;
                    case 21:
                        this.f2264d = obtainStyledAttributes.getLayoutDimension(index, this.f2264d);
                        break;
                    case 22:
                        this.f2262c = obtainStyledAttributes.getLayoutDimension(index, this.f2262c);
                        break;
                    case 23:
                        this.f2235D = obtainStyledAttributes.getDimensionPixelSize(index, this.f2235D);
                        break;
                    case 24:
                        this.f2272h = C0473c.m2216b(obtainStyledAttributes, index, this.f2272h);
                        break;
                    case 25:
                        this.f2274i = C0473c.m2216b(obtainStyledAttributes, index, this.f2274i);
                        break;
                    case 26:
                        this.f2234C = obtainStyledAttributes.getInt(index, this.f2234C);
                        break;
                    case 27:
                        this.f2236E = obtainStyledAttributes.getDimensionPixelSize(index, this.f2236E);
                        break;
                    case 28:
                        this.f2276j = C0473c.m2216b(obtainStyledAttributes, index, this.f2276j);
                        break;
                    case 29:
                        this.f2278k = C0473c.m2216b(obtainStyledAttributes, index, this.f2278k);
                        break;
                    case 30:
                        this.f2240I = obtainStyledAttributes.getDimensionPixelSize(index, this.f2240I);
                        break;
                    case 31:
                        this.f2284q = C0473c.m2216b(obtainStyledAttributes, index, this.f2284q);
                        break;
                    case 32:
                        this.f2285r = C0473c.m2216b(obtainStyledAttributes, index, this.f2285r);
                        break;
                    case 33:
                        this.f2237F = obtainStyledAttributes.getDimensionPixelSize(index, this.f2237F);
                        break;
                    case 34:
                        this.f2280m = C0473c.m2216b(obtainStyledAttributes, index, this.f2280m);
                        break;
                    case 35:
                        this.f2279l = C0473c.m2216b(obtainStyledAttributes, index, this.f2279l);
                        break;
                    case 36:
                        this.f2289v = obtainStyledAttributes.getFloat(index, this.f2289v);
                        break;
                    case 37:
                        this.f2248Q = obtainStyledAttributes.getFloat(index, this.f2248Q);
                        break;
                    case 38:
                        this.f2247P = obtainStyledAttributes.getFloat(index, this.f2247P);
                        break;
                    case 39:
                        this.f2249R = obtainStyledAttributes.getInt(index, this.f2249R);
                        break;
                    case 40:
                        this.f2250S = obtainStyledAttributes.getInt(index, this.f2250S);
                        break;
                    default:
                        switch (i2) {
                            case 56:
                                this.f2253V = obtainStyledAttributes.getDimensionPixelSize(index, this.f2253V);
                                break;
                            case 57:
                                this.f2254W = obtainStyledAttributes.getDimensionPixelSize(index, this.f2254W);
                                break;
                            case 58:
                                this.f2255X = obtainStyledAttributes.getDimensionPixelSize(index, this.f2255X);
                                break;
                            case 59:
                                this.f2256Y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2256Y);
                                break;
                            default:
                                switch (i2) {
                                    case 61:
                                        this.f2291x = C0473c.m2216b(obtainStyledAttributes, index, this.f2291x);
                                        break;
                                    case 62:
                                        this.f2292y = obtainStyledAttributes.getDimensionPixelSize(index, this.f2292y);
                                        break;
                                    case 63:
                                        this.f2293z = obtainStyledAttributes.getFloat(index, this.f2293z);
                                        break;
                                    default:
                                        String str = "   ";
                                        String str2 = "ConstraintSet";
                                        switch (i2) {
                                            case 69:
                                                this.f2257Z = obtainStyledAttributes.getFloat(index, 1.0f);
                                                continue;
                                            case 70:
                                                this.f2259a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                                continue;
                                            case 71:
                                                Log.e(str2, "CURRENTLY UNSUPPORTED");
                                                continue;
                                            case 72:
                                                this.f2261b0 = obtainStyledAttributes.getInt(index, this.f2261b0);
                                                continue;
                                            case 73:
                                                this.f2263c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.f2263c0);
                                                continue;
                                            case 74:
                                                this.f2269f0 = obtainStyledAttributes.getString(index);
                                                continue;
                                            case 75:
                                                this.f2277j0 = obtainStyledAttributes.getBoolean(index, this.f2277j0);
                                                continue;
                                            case 76:
                                                break;
                                            case 77:
                                                this.f2271g0 = obtainStyledAttributes.getString(index);
                                                break;
                                            default:
                                                StringBuilder sb = new StringBuilder();
                                                sb.append("Unknown attribute 0x");
                                                sb.append(Integer.toHexString(index));
                                                sb.append(str);
                                                sb.append(f2231k0.get(index));
                                                Log.w(str2, sb.toString());
                                                continue;
                                        }
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append("unused attribute 0x");
                                        sb2.append(Integer.toHexString(index));
                                        sb2.append(str);
                                        sb2.append(f2231k0.get(index));
                                        Log.w(str2, sb2.toString());
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$c */
    public static class C0476c {

        /* renamed from: h */
        private static SparseIntArray f2294h = new SparseIntArray();

        /* renamed from: a */
        public boolean f2295a = false;

        /* renamed from: b */
        public int f2296b = -1;

        /* renamed from: c */
        public String f2297c = null;

        /* renamed from: d */
        public int f2298d = -1;

        /* renamed from: e */
        public int f2299e = 0;

        /* renamed from: f */
        public float f2300f = Float.NaN;

        /* renamed from: g */
        public float f2301g = Float.NaN;

        static {
            f2294h.append(C0481f.Motion_motionPathRotate, 1);
            f2294h.append(C0481f.Motion_pathMotionArc, 2);
            f2294h.append(C0481f.Motion_transitionEasing, 3);
            f2294h.append(C0481f.Motion_drawPath, 4);
            f2294h.append(C0481f.Motion_animate_relativeTo, 5);
            f2294h.append(C0481f.Motion_motionStagger, 6);
        }

        /* renamed from: a */
        public void mo2793a(C0476c cVar) {
            this.f2295a = cVar.f2295a;
            this.f2296b = cVar.f2296b;
            this.f2297c = cVar.f2297c;
            this.f2298d = cVar.f2298d;
            this.f2299e = cVar.f2299e;
            this.f2301g = cVar.f2301g;
            this.f2300f = cVar.f2300f;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2792a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0481f.Motion);
            this.f2295a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f2294h.get(index)) {
                    case 1:
                        this.f2301g = obtainStyledAttributes.getFloat(index, this.f2301g);
                        break;
                    case 2:
                        this.f2298d = obtainStyledAttributes.getInt(index, this.f2298d);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type != 3) {
                            this.f2297c = C7590c.f19070c[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        } else {
                            this.f2297c = obtainStyledAttributes.getString(index);
                            break;
                        }
                    case 4:
                        this.f2299e = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f2296b = C0473c.m2216b(obtainStyledAttributes, index, this.f2296b);
                        break;
                    case 6:
                        this.f2300f = obtainStyledAttributes.getFloat(index, this.f2300f);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$d */
    public static class C0477d {

        /* renamed from: a */
        public boolean f2302a = false;

        /* renamed from: b */
        public int f2303b = 0;

        /* renamed from: c */
        public int f2304c = 0;

        /* renamed from: d */
        public float f2305d = 1.0f;

        /* renamed from: e */
        public float f2306e = Float.NaN;

        /* renamed from: a */
        public void mo2795a(C0477d dVar) {
            this.f2302a = dVar.f2302a;
            this.f2303b = dVar.f2303b;
            this.f2305d = dVar.f2305d;
            this.f2306e = dVar.f2306e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2794a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0481f.PropertySet);
            this.f2302a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0481f.PropertySet_android_alpha) {
                    this.f2305d = obtainStyledAttributes.getFloat(index, this.f2305d);
                } else if (index == C0481f.PropertySet_android_visibility) {
                    this.f2303b = obtainStyledAttributes.getInt(index, this.f2303b);
                    this.f2303b = C0473c.f2220d[this.f2303b];
                } else if (index == C0481f.PropertySet_visibilityMode) {
                    this.f2304c = obtainStyledAttributes.getInt(index, this.f2304c);
                } else if (index == C0481f.PropertySet_motionProgress) {
                    this.f2306e = obtainStyledAttributes.getFloat(index, this.f2306e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: androidx.constraintlayout.widget.c$e */
    public static class C0478e {

        /* renamed from: n */
        private static SparseIntArray f2307n = new SparseIntArray();

        /* renamed from: a */
        public boolean f2308a = false;

        /* renamed from: b */
        public float f2309b = 0.0f;

        /* renamed from: c */
        public float f2310c = 0.0f;

        /* renamed from: d */
        public float f2311d = 0.0f;

        /* renamed from: e */
        public float f2312e = 1.0f;

        /* renamed from: f */
        public float f2313f = 1.0f;

        /* renamed from: g */
        public float f2314g = Float.NaN;

        /* renamed from: h */
        public float f2315h = Float.NaN;

        /* renamed from: i */
        public float f2316i = 0.0f;

        /* renamed from: j */
        public float f2317j = 0.0f;

        /* renamed from: k */
        public float f2318k = 0.0f;

        /* renamed from: l */
        public boolean f2319l = false;

        /* renamed from: m */
        public float f2320m = 0.0f;

        static {
            f2307n.append(C0481f.Transform_android_rotation, 1);
            f2307n.append(C0481f.Transform_android_rotationX, 2);
            f2307n.append(C0481f.Transform_android_rotationY, 3);
            f2307n.append(C0481f.Transform_android_scaleX, 4);
            f2307n.append(C0481f.Transform_android_scaleY, 5);
            f2307n.append(C0481f.Transform_android_transformPivotX, 6);
            f2307n.append(C0481f.Transform_android_transformPivotY, 7);
            f2307n.append(C0481f.Transform_android_translationX, 8);
            f2307n.append(C0481f.Transform_android_translationY, 9);
            f2307n.append(C0481f.Transform_android_translationZ, 10);
            f2307n.append(C0481f.Transform_android_elevation, 11);
        }

        /* renamed from: a */
        public void mo2797a(C0478e eVar) {
            this.f2309b = eVar.f2309b;
            this.f2310c = eVar.f2310c;
            this.f2311d = eVar.f2311d;
            this.f2312e = eVar.f2312e;
            this.f2313f = eVar.f2313f;
            this.f2314g = eVar.f2314g;
            this.f2315h = eVar.f2315h;
            this.f2316i = eVar.f2316i;
            this.f2317j = eVar.f2317j;
            this.f2318k = eVar.f2318k;
            this.f2319l = eVar.f2319l;
            this.f2320m = eVar.f2320m;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2796a(Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0481f.Transform);
            this.f2308a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                switch (f2307n.get(index)) {
                    case 1:
                        this.f2309b = obtainStyledAttributes.getFloat(index, this.f2309b);
                        break;
                    case 2:
                        this.f2310c = obtainStyledAttributes.getFloat(index, this.f2310c);
                        break;
                    case 3:
                        this.f2311d = obtainStyledAttributes.getFloat(index, this.f2311d);
                        break;
                    case 4:
                        this.f2312e = obtainStyledAttributes.getFloat(index, this.f2312e);
                        break;
                    case 5:
                        this.f2313f = obtainStyledAttributes.getFloat(index, this.f2313f);
                        break;
                    case 6:
                        this.f2314g = obtainStyledAttributes.getFloat(index, this.f2314g);
                        break;
                    case 7:
                        this.f2315h = obtainStyledAttributes.getFloat(index, this.f2315h);
                        break;
                    case 8:
                        this.f2316i = obtainStyledAttributes.getDimension(index, this.f2316i);
                        break;
                    case 9:
                        this.f2317j = obtainStyledAttributes.getDimension(index, this.f2317j);
                        break;
                    case 10:
                        if (VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            this.f2318k = obtainStyledAttributes.getDimension(index, this.f2318k);
                            break;
                        }
                    case 11:
                        if (VERSION.SDK_INT < 21) {
                            break;
                        } else {
                            this.f2319l = true;
                            this.f2320m = obtainStyledAttributes.getDimension(index, this.f2320m);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    static {
        f2221e.append(C0481f.Constraint_layout_constraintLeft_toLeftOf, 25);
        f2221e.append(C0481f.Constraint_layout_constraintLeft_toRightOf, 26);
        f2221e.append(C0481f.Constraint_layout_constraintRight_toLeftOf, 29);
        f2221e.append(C0481f.Constraint_layout_constraintRight_toRightOf, 30);
        f2221e.append(C0481f.Constraint_layout_constraintTop_toTopOf, 36);
        f2221e.append(C0481f.Constraint_layout_constraintTop_toBottomOf, 35);
        f2221e.append(C0481f.Constraint_layout_constraintBottom_toTopOf, 4);
        f2221e.append(C0481f.Constraint_layout_constraintBottom_toBottomOf, 3);
        f2221e.append(C0481f.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        f2221e.append(C0481f.Constraint_layout_editor_absoluteX, 6);
        f2221e.append(C0481f.Constraint_layout_editor_absoluteY, 7);
        f2221e.append(C0481f.Constraint_layout_constraintGuide_begin, 17);
        f2221e.append(C0481f.Constraint_layout_constraintGuide_end, 18);
        f2221e.append(C0481f.Constraint_layout_constraintGuide_percent, 19);
        f2221e.append(C0481f.Constraint_android_orientation, 27);
        f2221e.append(C0481f.Constraint_layout_constraintStart_toEndOf, 32);
        f2221e.append(C0481f.Constraint_layout_constraintStart_toStartOf, 33);
        f2221e.append(C0481f.Constraint_layout_constraintEnd_toStartOf, 10);
        f2221e.append(C0481f.Constraint_layout_constraintEnd_toEndOf, 9);
        f2221e.append(C0481f.Constraint_layout_goneMarginLeft, 13);
        f2221e.append(C0481f.Constraint_layout_goneMarginTop, 16);
        f2221e.append(C0481f.Constraint_layout_goneMarginRight, 14);
        f2221e.append(C0481f.Constraint_layout_goneMarginBottom, 11);
        f2221e.append(C0481f.Constraint_layout_goneMarginStart, 15);
        f2221e.append(C0481f.Constraint_layout_goneMarginEnd, 12);
        f2221e.append(C0481f.Constraint_layout_constraintVertical_weight, 40);
        f2221e.append(C0481f.Constraint_layout_constraintHorizontal_weight, 39);
        f2221e.append(C0481f.Constraint_layout_constraintHorizontal_chainStyle, 41);
        f2221e.append(C0481f.Constraint_layout_constraintVertical_chainStyle, 42);
        f2221e.append(C0481f.Constraint_layout_constraintHorizontal_bias, 20);
        f2221e.append(C0481f.Constraint_layout_constraintVertical_bias, 37);
        f2221e.append(C0481f.Constraint_layout_constraintDimensionRatio, 5);
        f2221e.append(C0481f.Constraint_layout_constraintLeft_creator, 80);
        f2221e.append(C0481f.Constraint_layout_constraintTop_creator, 80);
        f2221e.append(C0481f.Constraint_layout_constraintRight_creator, 80);
        f2221e.append(C0481f.Constraint_layout_constraintBottom_creator, 80);
        f2221e.append(C0481f.Constraint_layout_constraintBaseline_creator, 80);
        f2221e.append(C0481f.Constraint_android_layout_marginLeft, 24);
        f2221e.append(C0481f.Constraint_android_layout_marginRight, 28);
        f2221e.append(C0481f.Constraint_android_layout_marginStart, 31);
        f2221e.append(C0481f.Constraint_android_layout_marginEnd, 8);
        f2221e.append(C0481f.Constraint_android_layout_marginTop, 34);
        f2221e.append(C0481f.Constraint_android_layout_marginBottom, 2);
        f2221e.append(C0481f.Constraint_android_layout_width, 23);
        f2221e.append(C0481f.Constraint_android_layout_height, 21);
        f2221e.append(C0481f.Constraint_android_visibility, 22);
        f2221e.append(C0481f.Constraint_android_alpha, 43);
        f2221e.append(C0481f.Constraint_android_elevation, 44);
        f2221e.append(C0481f.Constraint_android_rotationX, 45);
        f2221e.append(C0481f.Constraint_android_rotationY, 46);
        f2221e.append(C0481f.Constraint_android_rotation, 60);
        f2221e.append(C0481f.Constraint_android_scaleX, 47);
        f2221e.append(C0481f.Constraint_android_scaleY, 48);
        f2221e.append(C0481f.Constraint_android_transformPivotX, 49);
        f2221e.append(C0481f.Constraint_android_transformPivotY, 50);
        f2221e.append(C0481f.Constraint_android_translationX, 51);
        f2221e.append(C0481f.Constraint_android_translationY, 52);
        f2221e.append(C0481f.Constraint_android_translationZ, 53);
        f2221e.append(C0481f.Constraint_layout_constraintWidth_default, 54);
        f2221e.append(C0481f.Constraint_layout_constraintHeight_default, 55);
        f2221e.append(C0481f.Constraint_layout_constraintWidth_max, 56);
        f2221e.append(C0481f.Constraint_layout_constraintHeight_max, 57);
        f2221e.append(C0481f.Constraint_layout_constraintWidth_min, 58);
        f2221e.append(C0481f.Constraint_layout_constraintHeight_min, 59);
        f2221e.append(C0481f.Constraint_layout_constraintCircle, 61);
        f2221e.append(C0481f.Constraint_layout_constraintCircleRadius, 62);
        f2221e.append(C0481f.Constraint_layout_constraintCircleAngle, 63);
        f2221e.append(C0481f.Constraint_animate_relativeTo, 64);
        f2221e.append(C0481f.Constraint_transitionEasing, 65);
        f2221e.append(C0481f.Constraint_drawPath, 66);
        f2221e.append(C0481f.Constraint_transitionPathRotate, 67);
        f2221e.append(C0481f.Constraint_motionStagger, 79);
        f2221e.append(C0481f.Constraint_android_id, 38);
        f2221e.append(C0481f.Constraint_progress, 68);
        f2221e.append(C0481f.Constraint_layout_constraintWidth_percent, 69);
        f2221e.append(C0481f.Constraint_layout_constraintHeight_percent, 70);
        f2221e.append(C0481f.Constraint_chainUseRtl, 71);
        f2221e.append(C0481f.Constraint_barrierDirection, 72);
        f2221e.append(C0481f.Constraint_barrierMargin, 73);
        f2221e.append(C0481f.Constraint_constraint_referenced_ids, 74);
        f2221e.append(C0481f.Constraint_barrierAllowsGoneWidgets, 75);
        f2221e.append(C0481f.Constraint_pathMotionArc, 76);
        f2221e.append(C0481f.Constraint_layout_constraintTag, 77);
        f2221e.append(C0481f.Constraint_visibilityMode, 78);
    }

    /* renamed from: f */
    private C0474a m2217f(int i) {
        if (!this.f2224c.containsKey(Integer.valueOf(i))) {
            this.f2224c.put(Integer.valueOf(i), new C0474a());
        }
        return (C0474a) this.f2224c.get(Integer.valueOf(i));
    }

    /* renamed from: g */
    private String m2218g(int i) {
        switch (i) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    /* renamed from: b */
    public C0474a mo2775b(int i) {
        return m2217f(i);
    }

    /* renamed from: c */
    public void mo2783c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f2224c.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f2223b || id != -1) {
                if (!this.f2224c.containsKey(Integer.valueOf(id))) {
                    this.f2224c.put(Integer.valueOf(id), new C0474a());
                }
                C0474a aVar = (C0474a) this.f2224c.get(Integer.valueOf(id));
                aVar.f2230f = C0467a.m2195a(this.f2222a, childAt);
                aVar.m2245a(id, layoutParams);
                aVar.f2226b.f2303b = childAt.getVisibility();
                if (VERSION.SDK_INT >= 17) {
                    aVar.f2226b.f2305d = childAt.getAlpha();
                    aVar.f2229e.f2309b = childAt.getRotation();
                    aVar.f2229e.f2310c = childAt.getRotationX();
                    aVar.f2229e.f2311d = childAt.getRotationY();
                    aVar.f2229e.f2312e = childAt.getScaleX();
                    aVar.f2229e.f2313f = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                        C0478e eVar = aVar.f2229e;
                        eVar.f2314g = pivotX;
                        eVar.f2315h = pivotY;
                    }
                    aVar.f2229e.f2316i = childAt.getTranslationX();
                    aVar.f2229e.f2317j = childAt.getTranslationY();
                    if (VERSION.SDK_INT >= 21) {
                        aVar.f2229e.f2318k = childAt.getTranslationZ();
                        C0478e eVar2 = aVar.f2229e;
                        if (eVar2.f2319l) {
                            eVar2.f2320m = childAt.getElevation();
                        }
                    }
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f2228d.f2277j0 = barrier.mo2684b();
                    aVar.f2228d.f2267e0 = barrier.getReferencedIds();
                    aVar.f2228d.f2261b0 = barrier.getType();
                    aVar.f2228d.f2263c0 = barrier.getMargin();
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: d */
    public void mo2786d(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = constraintLayout.getChildAt(i);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f2223b || id != -1) {
                if (!this.f2224c.containsKey(Integer.valueOf(id))) {
                    this.f2224c.put(Integer.valueOf(id), new C0474a());
                }
                C0474a aVar = (C0474a) this.f2224c.get(Integer.valueOf(id));
                if (!aVar.f2228d.f2260b) {
                    aVar.m2245a(id, layoutParams);
                    if (childAt instanceof ConstraintHelper) {
                        aVar.f2228d.f2267e0 = ((ConstraintHelper) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            aVar.f2228d.f2277j0 = barrier.mo2684b();
                            aVar.f2228d.f2261b0 = barrier.getType();
                            aVar.f2228d.f2263c0 = barrier.getMargin();
                        }
                    }
                    aVar.f2228d.f2260b = true;
                }
                C0477d dVar = aVar.f2226b;
                if (!dVar.f2302a) {
                    dVar.f2303b = childAt.getVisibility();
                    aVar.f2226b.f2305d = childAt.getAlpha();
                    aVar.f2226b.f2302a = true;
                }
                if (VERSION.SDK_INT >= 17) {
                    C0478e eVar = aVar.f2229e;
                    if (!eVar.f2308a) {
                        eVar.f2308a = true;
                        eVar.f2309b = childAt.getRotation();
                        aVar.f2229e.f2310c = childAt.getRotationX();
                        aVar.f2229e.f2311d = childAt.getRotationY();
                        aVar.f2229e.f2312e = childAt.getScaleX();
                        aVar.f2229e.f2313f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (!(((double) pivotX) == 0.0d && ((double) pivotY) == 0.0d)) {
                            C0478e eVar2 = aVar.f2229e;
                            eVar2.f2314g = pivotX;
                            eVar2.f2315h = pivotY;
                        }
                        aVar.f2229e.f2316i = childAt.getTranslationX();
                        aVar.f2229e.f2317j = childAt.getTranslationY();
                        if (VERSION.SDK_INT >= 21) {
                            aVar.f2229e.f2318k = childAt.getTranslationZ();
                            C0478e eVar3 = aVar.f2229e;
                            if (eVar3.f2319l) {
                                eVar3.f2320m = childAt.getElevation();
                            }
                        }
                    }
                }
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: e */
    public int mo2787e(int i) {
        return m2217f(i).f2228d.f2262c;
    }

    /* renamed from: b */
    public void mo2779b(ConstraintLayout constraintLayout) {
        mo2771a(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
    }

    /* renamed from: a */
    public void mo2773a(C0473c cVar) {
        for (Integer num : cVar.f2224c.keySet()) {
            int intValue = num.intValue();
            C0474a aVar = (C0474a) cVar.f2224c.get(num);
            if (!this.f2224c.containsKey(Integer.valueOf(intValue))) {
                this.f2224c.put(Integer.valueOf(intValue), new C0474a());
            }
            C0474a aVar2 = (C0474a) this.f2224c.get(Integer.valueOf(intValue));
            C0475b bVar = aVar2.f2228d;
            if (!bVar.f2260b) {
                bVar.mo2791a(aVar.f2228d);
            }
            C0477d dVar = aVar2.f2226b;
            if (!dVar.f2302a) {
                dVar.mo2795a(aVar.f2226b);
            }
            C0478e eVar = aVar2.f2229e;
            if (!eVar.f2308a) {
                eVar.mo2797a(aVar.f2229e);
            }
            C0476c cVar2 = aVar2.f2227c;
            if (!cVar2.f2295a) {
                cVar2.mo2793a(aVar.f2227c);
            }
        }
    }

    /* renamed from: b */
    public void mo2776b(int i, float f) {
        m2217f(i).f2229e.f2312e = f;
    }

    /* renamed from: b */
    public void mo2777b(int i, int i2) {
        m2217f(i).f2228d.f2264d = i2;
    }

    /* renamed from: b */
    public void mo2778b(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    C0474a a = m2212a(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        a.f2228d.f2258a = true;
                    }
                    this.f2224c.put(Integer.valueOf(a.f2225a), a);
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public void mo2767a(Context context, int i) {
        mo2783c((ConstraintLayout) LayoutInflater.from(context).inflate(i, null));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m2216b(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* renamed from: a */
    public void mo2772a(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.f2224c.clear();
        int i = 0;
        while (i < childCount) {
            View childAt = constraints.getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (!this.f2223b || id != -1) {
                if (!this.f2224c.containsKey(Integer.valueOf(id))) {
                    this.f2224c.put(Integer.valueOf(id), new C0474a());
                }
                C0474a aVar = (C0474a) this.f2224c.get(Integer.valueOf(id));
                if (childAt instanceof ConstraintHelper) {
                    aVar.m2247a((ConstraintHelper) childAt, id, layoutParams);
                }
                aVar.m2246a(id, layoutParams);
                i++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    /* renamed from: a */
    public void mo2770a(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            if (!this.f2224c.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder();
                sb.append("id unknown ");
                sb.append(C0326a.m1407a(childAt));
                Log.v("ConstraintSet", sb.toString());
            } else if (this.f2223b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (this.f2224c.containsKey(Integer.valueOf(id))) {
                C0467a.m2197a(childAt, ((C0474a) this.f2224c.get(Integer.valueOf(id))).f2230f);
            }
        }
    }

    /* renamed from: c */
    public int mo2780c(int i) {
        return m2217f(i).f2226b.f2303b;
    }

    /* renamed from: c */
    public void mo2781c(int i, float f) {
        m2217f(i).f2229e.f2313f = f;
    }

    /* renamed from: c */
    public void mo2782c(int i, int i2) {
        m2217f(i).f2228d.f2262c = i2;
    }

    /* renamed from: a */
    public void mo2769a(ConstraintHelper constraintHelper, C0444f fVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<C0444f> sparseArray) {
        int id = constraintHelper.getId();
        if (this.f2224c.containsKey(Integer.valueOf(id))) {
            C0474a aVar = (C0474a) this.f2224c.get(Integer.valueOf(id));
            if (fVar instanceof C0453k) {
                constraintHelper.mo2683a(aVar, (C0453k) fVar, layoutParams, sparseArray);
            }
        }
    }

    /* renamed from: d */
    public void mo2785d(int i, int i2) {
        m2217f(i).f2226b.f2303b = i2;
    }

    /* renamed from: d */
    public int mo2784d(int i) {
        return m2217f(i).f2226b.f2304c;
    }

    /* renamed from: a */
    public void mo2766a(int i, ConstraintLayout.LayoutParams layoutParams) {
        if (this.f2224c.containsKey(Integer.valueOf(i))) {
            ((C0474a) this.f2224c.get(Integer.valueOf(i))).mo2788a(layoutParams);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2771a(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.f2224c.keySet());
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            int id = childAt.getId();
            String str = "ConstraintSet";
            if (!this.f2224c.containsKey(Integer.valueOf(id))) {
                StringBuilder sb = new StringBuilder();
                sb.append("id unknown ");
                sb.append(C0326a.m1407a(childAt));
                Log.w(str, sb.toString());
            } else if (this.f2223b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else if (id != -1) {
                if (this.f2224c.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    C0474a aVar = (C0474a) this.f2224c.get(Integer.valueOf(id));
                    if (childAt instanceof Barrier) {
                        aVar.f2228d.f2265d0 = 1;
                    }
                    int i2 = aVar.f2228d.f2265d0;
                    if (i2 != -1 && i2 == 1) {
                        Barrier barrier = (Barrier) childAt;
                        barrier.setId(id);
                        barrier.setType(aVar.f2228d.f2261b0);
                        barrier.setMargin(aVar.f2228d.f2263c0);
                        barrier.setAllowsGoneWidget(aVar.f2228d.f2277j0);
                        C0475b bVar = aVar.f2228d;
                        int[] iArr = bVar.f2267e0;
                        if (iArr != null) {
                            barrier.setReferencedIds(iArr);
                        } else {
                            String str2 = bVar.f2269f0;
                            if (str2 != null) {
                                bVar.f2267e0 = m2215a((View) barrier, str2);
                                barrier.setReferencedIds(aVar.f2228d.f2267e0);
                            }
                        }
                    }
                    ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                    layoutParams.mo2729b();
                    aVar.mo2788a(layoutParams);
                    if (z) {
                        C0467a.m2197a(childAt, aVar.f2230f);
                    }
                    childAt.setLayoutParams(layoutParams);
                    C0477d dVar = aVar.f2226b;
                    if (dVar.f2304c == 0) {
                        childAt.setVisibility(dVar.f2303b);
                    }
                    if (VERSION.SDK_INT >= 17) {
                        childAt.setAlpha(aVar.f2226b.f2305d);
                        childAt.setRotation(aVar.f2229e.f2309b);
                        childAt.setRotationX(aVar.f2229e.f2310c);
                        childAt.setRotationY(aVar.f2229e.f2311d);
                        childAt.setScaleX(aVar.f2229e.f2312e);
                        childAt.setScaleY(aVar.f2229e.f2313f);
                        if (!Float.isNaN(aVar.f2229e.f2314g)) {
                            childAt.setPivotX(aVar.f2229e.f2314g);
                        }
                        if (!Float.isNaN(aVar.f2229e.f2315h)) {
                            childAt.setPivotY(aVar.f2229e.f2315h);
                        }
                        childAt.setTranslationX(aVar.f2229e.f2316i);
                        childAt.setTranslationY(aVar.f2229e.f2317j);
                        if (VERSION.SDK_INT >= 21) {
                            childAt.setTranslationZ(aVar.f2229e.f2318k);
                            C0478e eVar = aVar.f2229e;
                            if (eVar.f2319l) {
                                childAt.setElevation(eVar.f2320m);
                            }
                        }
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("WARNING NO CONSTRAINTS for view ");
                    sb2.append(id);
                    Log.v(str, sb2.toString());
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C0474a aVar2 = (C0474a) this.f2224c.get(num);
            int i3 = aVar2.f2228d.f2265d0;
            if (i3 != -1 && i3 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                C0475b bVar2 = aVar2.f2228d;
                int[] iArr2 = bVar2.f2267e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str3 = bVar2.f2269f0;
                    if (str3 != null) {
                        bVar2.f2267e0 = m2215a((View) barrier2, str3);
                        barrier2.setReferencedIds(aVar2.f2228d.f2267e0);
                    }
                }
                barrier2.setType(aVar2.f2228d.f2261b0);
                barrier2.setMargin(aVar2.f2228d.f2263c0);
                ConstraintLayout.LayoutParams generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                barrier2.mo2691a();
                aVar2.mo2788a(generateDefaultLayoutParams);
                constraintLayout.addView(barrier2, generateDefaultLayoutParams);
            }
            if (aVar2.f2228d.f2258a) {
                Guideline guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                ConstraintLayout.LayoutParams generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                aVar2.mo2788a(generateDefaultLayoutParams2);
                constraintLayout.addView(guideline, generateDefaultLayoutParams2);
            }
        }
    }

    /* renamed from: a */
    public void mo2765a(int i, int i2, int i3, int i4) {
        if (!this.f2224c.containsKey(Integer.valueOf(i))) {
            this.f2224c.put(Integer.valueOf(i), new C0474a());
        }
        C0474a aVar = (C0474a) this.f2224c.get(Integer.valueOf(i));
        String str = "right to ";
        String str2 = " undefined";
        switch (i2) {
            case 1:
                if (i4 == 1) {
                    C0475b bVar = aVar.f2228d;
                    bVar.f2272h = i3;
                    bVar.f2274i = -1;
                    return;
                } else if (i4 == 2) {
                    C0475b bVar2 = aVar.f2228d;
                    bVar2.f2274i = i3;
                    bVar2.f2272h = -1;
                    return;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("left to ");
                    sb.append(m2218g(i4));
                    sb.append(str2);
                    throw new IllegalArgumentException(sb.toString());
                }
            case 2:
                if (i4 == 1) {
                    C0475b bVar3 = aVar.f2228d;
                    bVar3.f2276j = i3;
                    bVar3.f2278k = -1;
                    return;
                } else if (i4 == 2) {
                    C0475b bVar4 = aVar.f2228d;
                    bVar4.f2278k = i3;
                    bVar4.f2276j = -1;
                    return;
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(m2218g(i4));
                    sb2.append(str2);
                    throw new IllegalArgumentException(sb2.toString());
                }
            case 3:
                if (i4 == 3) {
                    C0475b bVar5 = aVar.f2228d;
                    bVar5.f2279l = i3;
                    bVar5.f2280m = -1;
                    bVar5.f2283p = -1;
                    return;
                } else if (i4 == 4) {
                    C0475b bVar6 = aVar.f2228d;
                    bVar6.f2280m = i3;
                    bVar6.f2279l = -1;
                    bVar6.f2283p = -1;
                    return;
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str);
                    sb3.append(m2218g(i4));
                    sb3.append(str2);
                    throw new IllegalArgumentException(sb3.toString());
                }
            case 4:
                if (i4 == 4) {
                    C0475b bVar7 = aVar.f2228d;
                    bVar7.f2282o = i3;
                    bVar7.f2281n = -1;
                    bVar7.f2283p = -1;
                    return;
                } else if (i4 == 3) {
                    C0475b bVar8 = aVar.f2228d;
                    bVar8.f2281n = i3;
                    bVar8.f2282o = -1;
                    bVar8.f2283p = -1;
                    return;
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append(m2218g(i4));
                    sb4.append(str2);
                    throw new IllegalArgumentException(sb4.toString());
                }
            case 5:
                if (i4 == 5) {
                    C0475b bVar9 = aVar.f2228d;
                    bVar9.f2283p = i3;
                    bVar9.f2282o = -1;
                    bVar9.f2281n = -1;
                    bVar9.f2279l = -1;
                    bVar9.f2280m = -1;
                    return;
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(m2218g(i4));
                sb5.append(str2);
                throw new IllegalArgumentException(sb5.toString());
            case 6:
                if (i4 == 6) {
                    C0475b bVar10 = aVar.f2228d;
                    bVar10.f2285r = i3;
                    bVar10.f2284q = -1;
                    return;
                } else if (i4 == 7) {
                    C0475b bVar11 = aVar.f2228d;
                    bVar11.f2284q = i3;
                    bVar11.f2285r = -1;
                    return;
                } else {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(str);
                    sb6.append(m2218g(i4));
                    sb6.append(str2);
                    throw new IllegalArgumentException(sb6.toString());
                }
            case 7:
                if (i4 == 7) {
                    C0475b bVar12 = aVar.f2228d;
                    bVar12.f2287t = i3;
                    bVar12.f2286s = -1;
                    return;
                } else if (i4 == 6) {
                    C0475b bVar13 = aVar.f2228d;
                    bVar13.f2286s = i3;
                    bVar13.f2287t = -1;
                    return;
                } else {
                    StringBuilder sb7 = new StringBuilder();
                    sb7.append(str);
                    sb7.append(m2218g(i4));
                    sb7.append(str2);
                    throw new IllegalArgumentException(sb7.toString());
                }
            default:
                StringBuilder sb8 = new StringBuilder();
                sb8.append(m2218g(i2));
                sb8.append(" to ");
                sb8.append(m2218g(i4));
                sb8.append(" unknown");
                throw new IllegalArgumentException(sb8.toString());
        }
    }

    /* renamed from: a */
    public void mo2764a(int i, int i2) {
        if (this.f2224c.containsKey(Integer.valueOf(i))) {
            C0474a aVar = (C0474a) this.f2224c.get(Integer.valueOf(i));
            switch (i2) {
                case 1:
                    C0475b bVar = aVar.f2228d;
                    bVar.f2274i = -1;
                    bVar.f2272h = -1;
                    bVar.f2235D = -1;
                    bVar.f2241J = -1;
                    return;
                case 2:
                    C0475b bVar2 = aVar.f2228d;
                    bVar2.f2278k = -1;
                    bVar2.f2276j = -1;
                    bVar2.f2236E = -1;
                    bVar2.f2243L = -1;
                    return;
                case 3:
                    C0475b bVar3 = aVar.f2228d;
                    bVar3.f2280m = -1;
                    bVar3.f2279l = -1;
                    bVar3.f2237F = -1;
                    bVar3.f2242K = -1;
                    return;
                case 4:
                    C0475b bVar4 = aVar.f2228d;
                    bVar4.f2281n = -1;
                    bVar4.f2282o = -1;
                    bVar4.f2238G = -1;
                    bVar4.f2244M = -1;
                    return;
                case 5:
                    aVar.f2228d.f2283p = -1;
                    return;
                case 6:
                    C0475b bVar5 = aVar.f2228d;
                    bVar5.f2284q = -1;
                    bVar5.f2285r = -1;
                    bVar5.f2240I = -1;
                    bVar5.f2246O = -1;
                    return;
                case 7:
                    C0475b bVar6 = aVar.f2228d;
                    bVar6.f2286s = -1;
                    bVar6.f2287t = -1;
                    bVar6.f2239H = -1;
                    bVar6.f2245N = -1;
                    return;
                default:
                    throw new IllegalArgumentException("unknown constraint");
            }
        }
    }

    /* renamed from: a */
    public int mo2762a(int i) {
        return m2217f(i).f2228d.f2264d;
    }

    /* renamed from: a */
    public void mo2763a(int i, float f) {
        m2217f(i).f2226b.f2305d = f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:96:0x017b, code lost:
        continue;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2768a(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            r9 = this;
            int r0 = r11.getEventType()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r1 = 0
            r2 = r1
        L_0x0006:
            r3 = 1
            if (r0 == r3) goto L_0x018a
            if (r0 == 0) goto L_0x0178
            java.lang.String r4 = "Constraint"
            r5 = 3
            r6 = 2
            if (r0 == r6) goto L_0x0036
            if (r0 == r5) goto L_0x0015
            goto L_0x017b
        L_0x0015:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r3 = "ConstraintSet"
            boolean r3 = r3.equals(r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r3 == 0) goto L_0x0022
            return
        L_0x0022:
            boolean r0 = r0.equalsIgnoreCase(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x017b
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.c$a> r0 = r9.f2224c     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r3 = r2.f2225a     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.put(r3, r2)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r2 = r1
            goto L_0x017b
        L_0x0036:
            java.lang.String r0 = r11.getName()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r7 = -1
            int r8 = r0.hashCode()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            switch(r8) {
                case -2025855158: goto L_0x0087;
                case -1984451626: goto L_0x007d;
                case -1269513683: goto L_0x0073;
                case -1238332596: goto L_0x0069;
                case -71750448: goto L_0x005f;
                case 1331510167: goto L_0x0055;
                case 1791837707: goto L_0x004b;
                case 1803088381: goto L_0x0043;
                default: goto L_0x0042;
            }     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x0042:
            goto L_0x0091
        L_0x0043:
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0091
            r0 = 0
            goto L_0x0092
        L_0x004b:
            java.lang.String r4 = "CustomAttribute"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0091
            r0 = 7
            goto L_0x0092
        L_0x0055:
            java.lang.String r4 = "Barrier"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0091
            r0 = 2
            goto L_0x0092
        L_0x005f:
            java.lang.String r4 = "Guideline"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0091
            r0 = 1
            goto L_0x0092
        L_0x0069:
            java.lang.String r4 = "Transform"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0091
            r0 = 4
            goto L_0x0092
        L_0x0073:
            java.lang.String r4 = "PropertySet"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0091
            r0 = 3
            goto L_0x0092
        L_0x007d:
            java.lang.String r4 = "Motion"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0091
            r0 = 6
            goto L_0x0092
        L_0x0087:
            java.lang.String r4 = "Layout"
            boolean r0 = r0.equals(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            if (r0 == 0) goto L_0x0091
            r0 = 5
            goto L_0x0092
        L_0x0091:
            r0 = -1
        L_0x0092:
            java.lang.String r4 = "XML parser error must be within a Constraint "
            switch(r0) {
                case 0: goto L_0x016f;
                case 1: goto L_0x015e;
                case 2: goto L_0x0151;
                case 3: goto L_0x012c;
                case 4: goto L_0x0107;
                case 5: goto L_0x00e1;
                case 6: goto L_0x00bb;
                case 7: goto L_0x0099;
                default: goto L_0x0097;
            }
        L_0x0097:
            goto L_0x017b
        L_0x0099:
            if (r2 == 0) goto L_0x00a2
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.a> r0 = r2.f2230f     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.C0467a.m2196a(r10, r11, r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x00a2:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.append(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.append(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r11 = r0.toString()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x00bb:
            if (r2 == 0) goto L_0x00c8
            androidx.constraintlayout.widget.c$c r0 = r2.f2227c     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.mo2792a(r10, r3)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x00c8:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.append(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.append(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r11 = r0.toString()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x00e1:
            if (r2 == 0) goto L_0x00ee
            androidx.constraintlayout.widget.c$b r0 = r2.f2228d     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.mo2790a(r10, r3)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x00ee:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.append(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.append(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r11 = r0.toString()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x0107:
            if (r2 == 0) goto L_0x0113
            androidx.constraintlayout.widget.c$e r0 = r2.f2229e     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.mo2796a(r10, r3)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x0113:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.append(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.append(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r11 = r0.toString()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x012c:
            if (r2 == 0) goto L_0x0138
            androidx.constraintlayout.widget.c$d r0 = r2.f2226b     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.mo2794a(r10, r3)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x0138:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.<init>()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.append(r4)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            int r11 = r11.getLineNumber()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.append(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            java.lang.String r11 = r0.toString()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r10.<init>(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            throw r10     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x0151:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.c$a r2 = r9.m2212a(r10, r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.c$b r0 = r2.f2228d     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.f2265d0 = r3     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x015e:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.c$a r2 = r9.m2212a(r10, r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.c$b r0 = r2.f2228d     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.f2258a = r3     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.c$b r0 = r2.f2228d     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            r0.f2260b = r3     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x016f:
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r11)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            androidx.constraintlayout.widget.c$a r2 = r9.m2212a(r10, r0)     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x017b
        L_0x0178:
            r11.getName()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
        L_0x017b:
            int r0 = r11.next()     // Catch:{ XmlPullParserException -> 0x0186, IOException -> 0x0181 }
            goto L_0x0006
        L_0x0181:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x018a
        L_0x0186:
            r10 = move-exception
            r10.printStackTrace()
        L_0x018a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.C0473c.mo2768a(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* renamed from: a */
    private C0474a m2212a(Context context, AttributeSet attributeSet) {
        C0474a aVar = new C0474a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0481f.Constraint);
        m2213a(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* renamed from: a */
    private void m2213a(Context context, C0474a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index != C0481f.Constraint_android_id) {
                aVar.f2227c.f2295a = true;
                aVar.f2228d.f2260b = true;
                aVar.f2226b.f2302a = true;
                aVar.f2229e.f2308a = true;
            }
            int i2 = f2221e.get(index);
            switch (i2) {
                case 1:
                    C0475b bVar = aVar.f2228d;
                    bVar.f2283p = m2216b(typedArray, index, bVar.f2283p);
                    break;
                case 2:
                    C0475b bVar2 = aVar.f2228d;
                    bVar2.f2238G = typedArray.getDimensionPixelSize(index, bVar2.f2238G);
                    break;
                case 3:
                    C0475b bVar3 = aVar.f2228d;
                    bVar3.f2282o = m2216b(typedArray, index, bVar3.f2282o);
                    break;
                case 4:
                    C0475b bVar4 = aVar.f2228d;
                    bVar4.f2281n = m2216b(typedArray, index, bVar4.f2281n);
                    break;
                case 5:
                    aVar.f2228d.f2290w = typedArray.getString(index);
                    break;
                case 6:
                    C0475b bVar5 = aVar.f2228d;
                    bVar5.f2232A = typedArray.getDimensionPixelOffset(index, bVar5.f2232A);
                    break;
                case 7:
                    C0475b bVar6 = aVar.f2228d;
                    bVar6.f2233B = typedArray.getDimensionPixelOffset(index, bVar6.f2233B);
                    break;
                case 8:
                    C0475b bVar7 = aVar.f2228d;
                    bVar7.f2239H = typedArray.getDimensionPixelSize(index, bVar7.f2239H);
                    break;
                case 9:
                    C0475b bVar8 = aVar.f2228d;
                    bVar8.f2287t = m2216b(typedArray, index, bVar8.f2287t);
                    break;
                case 10:
                    C0475b bVar9 = aVar.f2228d;
                    bVar9.f2286s = m2216b(typedArray, index, bVar9.f2286s);
                    break;
                case 11:
                    C0475b bVar10 = aVar.f2228d;
                    bVar10.f2244M = typedArray.getDimensionPixelSize(index, bVar10.f2244M);
                    break;
                case 12:
                    C0475b bVar11 = aVar.f2228d;
                    bVar11.f2245N = typedArray.getDimensionPixelSize(index, bVar11.f2245N);
                    break;
                case 13:
                    C0475b bVar12 = aVar.f2228d;
                    bVar12.f2241J = typedArray.getDimensionPixelSize(index, bVar12.f2241J);
                    break;
                case 14:
                    C0475b bVar13 = aVar.f2228d;
                    bVar13.f2243L = typedArray.getDimensionPixelSize(index, bVar13.f2243L);
                    break;
                case 15:
                    C0475b bVar14 = aVar.f2228d;
                    bVar14.f2246O = typedArray.getDimensionPixelSize(index, bVar14.f2246O);
                    break;
                case 16:
                    C0475b bVar15 = aVar.f2228d;
                    bVar15.f2242K = typedArray.getDimensionPixelSize(index, bVar15.f2242K);
                    break;
                case 17:
                    C0475b bVar16 = aVar.f2228d;
                    bVar16.f2266e = typedArray.getDimensionPixelOffset(index, bVar16.f2266e);
                    break;
                case 18:
                    C0475b bVar17 = aVar.f2228d;
                    bVar17.f2268f = typedArray.getDimensionPixelOffset(index, bVar17.f2268f);
                    break;
                case 19:
                    C0475b bVar18 = aVar.f2228d;
                    bVar18.f2270g = typedArray.getFloat(index, bVar18.f2270g);
                    break;
                case 20:
                    C0475b bVar19 = aVar.f2228d;
                    bVar19.f2288u = typedArray.getFloat(index, bVar19.f2288u);
                    break;
                case 21:
                    C0475b bVar20 = aVar.f2228d;
                    bVar20.f2264d = typedArray.getLayoutDimension(index, bVar20.f2264d);
                    break;
                case 22:
                    C0477d dVar = aVar.f2226b;
                    dVar.f2303b = typedArray.getInt(index, dVar.f2303b);
                    C0477d dVar2 = aVar.f2226b;
                    dVar2.f2303b = f2220d[dVar2.f2303b];
                    break;
                case 23:
                    C0475b bVar21 = aVar.f2228d;
                    bVar21.f2262c = typedArray.getLayoutDimension(index, bVar21.f2262c);
                    break;
                case 24:
                    C0475b bVar22 = aVar.f2228d;
                    bVar22.f2235D = typedArray.getDimensionPixelSize(index, bVar22.f2235D);
                    break;
                case 25:
                    C0475b bVar23 = aVar.f2228d;
                    bVar23.f2272h = m2216b(typedArray, index, bVar23.f2272h);
                    break;
                case 26:
                    C0475b bVar24 = aVar.f2228d;
                    bVar24.f2274i = m2216b(typedArray, index, bVar24.f2274i);
                    break;
                case 27:
                    C0475b bVar25 = aVar.f2228d;
                    bVar25.f2234C = typedArray.getInt(index, bVar25.f2234C);
                    break;
                case 28:
                    C0475b bVar26 = aVar.f2228d;
                    bVar26.f2236E = typedArray.getDimensionPixelSize(index, bVar26.f2236E);
                    break;
                case 29:
                    C0475b bVar27 = aVar.f2228d;
                    bVar27.f2276j = m2216b(typedArray, index, bVar27.f2276j);
                    break;
                case 30:
                    C0475b bVar28 = aVar.f2228d;
                    bVar28.f2278k = m2216b(typedArray, index, bVar28.f2278k);
                    break;
                case 31:
                    C0475b bVar29 = aVar.f2228d;
                    bVar29.f2240I = typedArray.getDimensionPixelSize(index, bVar29.f2240I);
                    break;
                case 32:
                    C0475b bVar30 = aVar.f2228d;
                    bVar30.f2284q = m2216b(typedArray, index, bVar30.f2284q);
                    break;
                case 33:
                    C0475b bVar31 = aVar.f2228d;
                    bVar31.f2285r = m2216b(typedArray, index, bVar31.f2285r);
                    break;
                case 34:
                    C0475b bVar32 = aVar.f2228d;
                    bVar32.f2237F = typedArray.getDimensionPixelSize(index, bVar32.f2237F);
                    break;
                case 35:
                    C0475b bVar33 = aVar.f2228d;
                    bVar33.f2280m = m2216b(typedArray, index, bVar33.f2280m);
                    break;
                case 36:
                    C0475b bVar34 = aVar.f2228d;
                    bVar34.f2279l = m2216b(typedArray, index, bVar34.f2279l);
                    break;
                case 37:
                    C0475b bVar35 = aVar.f2228d;
                    bVar35.f2289v = typedArray.getFloat(index, bVar35.f2289v);
                    break;
                case 38:
                    aVar.f2225a = typedArray.getResourceId(index, aVar.f2225a);
                    break;
                case 39:
                    C0475b bVar36 = aVar.f2228d;
                    bVar36.f2248Q = typedArray.getFloat(index, bVar36.f2248Q);
                    break;
                case 40:
                    C0475b bVar37 = aVar.f2228d;
                    bVar37.f2247P = typedArray.getFloat(index, bVar37.f2247P);
                    break;
                case 41:
                    C0475b bVar38 = aVar.f2228d;
                    bVar38.f2249R = typedArray.getInt(index, bVar38.f2249R);
                    break;
                case 42:
                    C0475b bVar39 = aVar.f2228d;
                    bVar39.f2250S = typedArray.getInt(index, bVar39.f2250S);
                    break;
                case 43:
                    C0477d dVar3 = aVar.f2226b;
                    dVar3.f2305d = typedArray.getFloat(index, dVar3.f2305d);
                    break;
                case 44:
                    if (VERSION.SDK_INT < 21) {
                        break;
                    } else {
                        C0478e eVar = aVar.f2229e;
                        eVar.f2319l = true;
                        eVar.f2320m = typedArray.getDimension(index, eVar.f2320m);
                        break;
                    }
                case 45:
                    C0478e eVar2 = aVar.f2229e;
                    eVar2.f2310c = typedArray.getFloat(index, eVar2.f2310c);
                    break;
                case 46:
                    C0478e eVar3 = aVar.f2229e;
                    eVar3.f2311d = typedArray.getFloat(index, eVar3.f2311d);
                    break;
                case 47:
                    C0478e eVar4 = aVar.f2229e;
                    eVar4.f2312e = typedArray.getFloat(index, eVar4.f2312e);
                    break;
                case 48:
                    C0478e eVar5 = aVar.f2229e;
                    eVar5.f2313f = typedArray.getFloat(index, eVar5.f2313f);
                    break;
                case 49:
                    C0478e eVar6 = aVar.f2229e;
                    eVar6.f2314g = typedArray.getFloat(index, eVar6.f2314g);
                    break;
                case 50:
                    C0478e eVar7 = aVar.f2229e;
                    eVar7.f2315h = typedArray.getFloat(index, eVar7.f2315h);
                    break;
                case 51:
                    C0478e eVar8 = aVar.f2229e;
                    eVar8.f2316i = typedArray.getDimension(index, eVar8.f2316i);
                    break;
                case 52:
                    C0478e eVar9 = aVar.f2229e;
                    eVar9.f2317j = typedArray.getDimension(index, eVar9.f2317j);
                    break;
                case 53:
                    if (VERSION.SDK_INT < 21) {
                        break;
                    } else {
                        C0478e eVar10 = aVar.f2229e;
                        eVar10.f2318k = typedArray.getDimension(index, eVar10.f2318k);
                        break;
                    }
                default:
                    String str = "   ";
                    String str2 = "ConstraintSet";
                    switch (i2) {
                        case 60:
                            C0478e eVar11 = aVar.f2229e;
                            eVar11.f2309b = typedArray.getFloat(index, eVar11.f2309b);
                            break;
                        case 61:
                            C0475b bVar40 = aVar.f2228d;
                            bVar40.f2291x = m2216b(typedArray, index, bVar40.f2291x);
                            break;
                        case 62:
                            C0475b bVar41 = aVar.f2228d;
                            bVar41.f2292y = typedArray.getDimensionPixelSize(index, bVar41.f2292y);
                            break;
                        case 63:
                            C0475b bVar42 = aVar.f2228d;
                            bVar42.f2293z = typedArray.getFloat(index, bVar42.f2293z);
                            break;
                        case 64:
                            C0476c cVar = aVar.f2227c;
                            cVar.f2296b = m2216b(typedArray, index, cVar.f2296b);
                            break;
                        case 65:
                            if (typedArray.peekValue(index).type != 3) {
                                aVar.f2227c.f2297c = C7590c.f19070c[typedArray.getInteger(index, 0)];
                                break;
                            } else {
                                aVar.f2227c.f2297c = typedArray.getString(index);
                                break;
                            }
                        case 66:
                            aVar.f2227c.f2299e = typedArray.getInt(index, 0);
                            break;
                        case 67:
                            C0476c cVar2 = aVar.f2227c;
                            cVar2.f2301g = typedArray.getFloat(index, cVar2.f2301g);
                            break;
                        case 68:
                            C0477d dVar4 = aVar.f2226b;
                            dVar4.f2306e = typedArray.getFloat(index, dVar4.f2306e);
                            break;
                        case 69:
                            aVar.f2228d.f2257Z = typedArray.getFloat(index, 1.0f);
                            break;
                        case 70:
                            aVar.f2228d.f2259a0 = typedArray.getFloat(index, 1.0f);
                            break;
                        case 71:
                            Log.e(str2, "CURRENTLY UNSUPPORTED");
                            break;
                        case 72:
                            C0475b bVar43 = aVar.f2228d;
                            bVar43.f2261b0 = typedArray.getInt(index, bVar43.f2261b0);
                            break;
                        case 73:
                            C0475b bVar44 = aVar.f2228d;
                            bVar44.f2263c0 = typedArray.getDimensionPixelSize(index, bVar44.f2263c0);
                            break;
                        case 74:
                            aVar.f2228d.f2269f0 = typedArray.getString(index);
                            break;
                        case 75:
                            C0475b bVar45 = aVar.f2228d;
                            bVar45.f2277j0 = typedArray.getBoolean(index, bVar45.f2277j0);
                            break;
                        case 76:
                            C0476c cVar3 = aVar.f2227c;
                            cVar3.f2298d = typedArray.getInt(index, cVar3.f2298d);
                            break;
                        case 77:
                            aVar.f2228d.f2271g0 = typedArray.getString(index);
                            break;
                        case 78:
                            C0477d dVar5 = aVar.f2226b;
                            dVar5.f2304c = typedArray.getInt(index, dVar5.f2304c);
                            break;
                        case 79:
                            C0476c cVar4 = aVar.f2227c;
                            cVar4.f2300f = typedArray.getFloat(index, cVar4.f2300f);
                            break;
                        case 80:
                            StringBuilder sb = new StringBuilder();
                            sb.append("unused attribute 0x");
                            sb.append(Integer.toHexString(index));
                            sb.append(str);
                            sb.append(f2221e.get(index));
                            Log.w(str2, sb.toString());
                            break;
                        default:
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Unknown attribute 0x");
                            sb2.append(Integer.toHexString(index));
                            sb2.append(str);
                            sb2.append(f2221e.get(index));
                            Log.w(str2, sb2.toString());
                            break;
                    }
            }
        }
    }

    /* renamed from: a */
    private int[] m2215a(View view, String str) {
        int i;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C0480e.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout)) {
                Object a = ((ConstraintLayout) view.getParent()).mo2703a(0, (Object) trim);
                if (a != null && (a instanceof Integer)) {
                    i = ((Integer) a).intValue();
                }
            }
            int i4 = i3 + 1;
            iArr[i3] = i;
            i2++;
            i3 = i4;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    /* renamed from: a */
    public void mo2774a(boolean z) {
        this.f2223b = z;
    }
}
