package androidx.constraintlayout.motion.widget;

import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.solver.widgets.C0444f;
import androidx.constraintlayout.widget.C0467a;
import androidx.constraintlayout.widget.C0467a.C0469b;
import androidx.constraintlayout.widget.C0473c;
import androidx.constraintlayout.widget.C0473c.C0474a;
import androidx.constraintlayout.widget.C0473c.C0476c;
import androidx.constraintlayout.widget.C0473c.C0477d;
import androidx.constraintlayout.widget.C0473c.C0478e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import p214e.p229f.p230a.p231a.C7590c;

/* renamed from: androidx.constraintlayout.motion.widget.m */
class C0360m implements Comparable<C0360m> {

    /* renamed from: e */
    private float f1604e = 1.0f;

    /* renamed from: f */
    int f1605f = 0;

    /* renamed from: g */
    int f1606g;

    /* renamed from: h */
    private float f1607h = 0.0f;

    /* renamed from: i */
    private float f1608i = 0.0f;

    /* renamed from: j */
    private float f1609j = 0.0f;

    /* renamed from: k */
    public float f1610k = 0.0f;

    /* renamed from: l */
    private float f1611l = 1.0f;

    /* renamed from: m */
    private float f1612m = 1.0f;

    /* renamed from: n */
    private float f1613n = 0.0f;

    /* renamed from: o */
    private float f1614o = 0.0f;

    /* renamed from: p */
    private float f1615p = 0.0f;

    /* renamed from: q */
    private float f1616q;

    /* renamed from: r */
    private float f1617r = Float.NaN;

    /* renamed from: s */
    private float f1618s = Float.NaN;

    /* renamed from: t */
    LinkedHashMap<String, C0467a> f1619t = new LinkedHashMap<>();

    static {
        new String[]{"position", "x", "y", "width", "height", "pathRotate"};
    }

    /* renamed from: a */
    private boolean m1625a(float f, float f2) {
        boolean z = true;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            if (Float.isNaN(f) == Float.isNaN(f2)) {
                z = false;
            }
            return z;
        }
        if (Math.abs(f - f2) <= 1.0E-6f) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2332a(float f, float f2, float f3, float f4) {
    }

    /* renamed from: b */
    public void mo2338b(View view) {
        mo2332a(view.getX(), view.getY(), (float) view.getWidth(), (float) view.getHeight());
        mo2333a(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2334a(C0360m mVar, HashSet<String> hashSet) {
        String str = "alpha";
        if (m1625a(this.f1604e, mVar.f1604e)) {
            hashSet.add(str);
        }
        if (m1625a(this.f1607h, mVar.f1607h)) {
            hashSet.add("elevation");
        }
        int i = this.f1606g;
        int i2 = mVar.f1606g;
        if (i != i2 && this.f1605f == 0 && (i == 0 || i2 == 0)) {
            hashSet.add(str);
        }
        if (m1625a(this.f1608i, mVar.f1608i)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.f1617r) || !Float.isNaN(mVar.f1617r)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.f1618s) || !Float.isNaN(mVar.f1618s)) {
            hashSet.add("progress");
        }
        if (m1625a(this.f1609j, mVar.f1609j)) {
            hashSet.add("rotationX");
        }
        if (m1625a(this.f1610k, mVar.f1610k)) {
            hashSet.add("rotationY");
        }
        if (m1625a(this.f1611l, mVar.f1611l)) {
            hashSet.add("scaleX");
        }
        if (m1625a(this.f1612m, mVar.f1612m)) {
            hashSet.add("scaleY");
        }
        if (m1625a(this.f1613n, mVar.f1613n)) {
            hashSet.add("translationX");
        }
        if (m1625a(this.f1614o, mVar.f1614o)) {
            hashSet.add("translationY");
        }
        if (m1625a(this.f1615p, mVar.f1615p)) {
            hashSet.add("translationZ");
        }
    }

    /* renamed from: a */
    public int compareTo(C0360m mVar) {
        return Float.compare(this.f1616q, mVar.f1616q);
    }

    /* renamed from: a */
    public void mo2333a(View view) {
        this.f1606g = view.getVisibility();
        this.f1604e = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        if (VERSION.SDK_INT >= 21) {
            this.f1607h = view.getElevation();
        }
        this.f1608i = view.getRotation();
        this.f1609j = view.getRotationX();
        this.f1610k = view.getRotationY();
        this.f1611l = view.getScaleX();
        this.f1612m = view.getScaleY();
        view.getPivotX();
        view.getPivotY();
        this.f1613n = view.getTranslationX();
        this.f1614o = view.getTranslationY();
        if (VERSION.SDK_INT >= 21) {
            this.f1615p = view.getTranslationZ();
        }
    }

    /* renamed from: a */
    public void mo2336a(C0474a aVar) {
        C0477d dVar = aVar.f2226b;
        this.f1605f = dVar.f2304c;
        int i = dVar.f2303b;
        this.f1606g = i;
        this.f1604e = (i == 0 || this.f1605f != 0) ? aVar.f2226b.f2305d : 0.0f;
        C0478e eVar = aVar.f2229e;
        boolean z = eVar.f2319l;
        this.f1607h = eVar.f2320m;
        this.f1608i = eVar.f2309b;
        this.f1609j = eVar.f2310c;
        this.f1610k = eVar.f2311d;
        this.f1611l = eVar.f2312e;
        this.f1612m = eVar.f2313f;
        float f = eVar.f2314g;
        float f2 = eVar.f2315h;
        this.f1613n = eVar.f2316i;
        this.f1614o = eVar.f2317j;
        this.f1615p = eVar.f2318k;
        C7590c.m18378a(aVar.f2227c.f2297c);
        C0476c cVar = aVar.f2227c;
        this.f1617r = cVar.f2301g;
        int i2 = cVar.f2299e;
        this.f1618s = aVar.f2226b.f2306e;
        for (String str : aVar.f2230f.keySet()) {
            C0467a aVar2 = (C0467a) aVar.f2230f.get(str);
            if (aVar2.mo2751a() != C0469b.STRING_TYPE) {
                this.f1619t.put(str, aVar2);
            }
        }
    }

    /* renamed from: a */
    public void mo2337a(HashMap<String, C0369s> hashMap, int i) {
        for (String str : hashMap.keySet()) {
            C0369s sVar = (C0369s) hashMap.get(str);
            char c = 65535;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c = 9;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c = 10;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c = 11;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c = 6;
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c = 7;
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c = 8;
                        break;
                    }
                    break;
                case -40300674:
                    if (str.equals("rotation")) {
                        c = 2;
                        break;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c = 1;
                        break;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        c = 5;
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            float f = 1.0f;
            float f2 = 0.0f;
            switch (c) {
                case 0:
                    if (!Float.isNaN(this.f1604e)) {
                        f = this.f1604e;
                    }
                    sVar.mo2408a(i, f);
                    break;
                case 1:
                    if (!Float.isNaN(this.f1607h)) {
                        f2 = this.f1607h;
                    }
                    sVar.mo2408a(i, f2);
                    break;
                case 2:
                    if (!Float.isNaN(this.f1608i)) {
                        f2 = this.f1608i;
                    }
                    sVar.mo2408a(i, f2);
                    break;
                case 3:
                    if (!Float.isNaN(this.f1609j)) {
                        f2 = this.f1609j;
                    }
                    sVar.mo2408a(i, f2);
                    break;
                case 4:
                    if (!Float.isNaN(this.f1610k)) {
                        f2 = this.f1610k;
                    }
                    sVar.mo2408a(i, f2);
                    break;
                case 5:
                    if (!Float.isNaN(this.f1617r)) {
                        f2 = this.f1617r;
                    }
                    sVar.mo2408a(i, f2);
                    break;
                case 6:
                    if (!Float.isNaN(this.f1618s)) {
                        f2 = this.f1618s;
                    }
                    sVar.mo2408a(i, f2);
                    break;
                case 7:
                    if (!Float.isNaN(this.f1611l)) {
                        f = this.f1611l;
                    }
                    sVar.mo2408a(i, f);
                    break;
                case 8:
                    if (!Float.isNaN(this.f1612m)) {
                        f = this.f1612m;
                    }
                    sVar.mo2408a(i, f);
                    break;
                case 9:
                    if (!Float.isNaN(this.f1613n)) {
                        f2 = this.f1613n;
                    }
                    sVar.mo2408a(i, f2);
                    break;
                case 10:
                    if (!Float.isNaN(this.f1614o)) {
                        f2 = this.f1614o;
                    }
                    sVar.mo2408a(i, f2);
                    break;
                case 11:
                    if (!Float.isNaN(this.f1615p)) {
                        f2 = this.f1615p;
                    }
                    sVar.mo2408a(i, f2);
                    break;
                default:
                    String str2 = "MotionPaths";
                    if (!str.startsWith("CUSTOM")) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("UNKNOWN spline ");
                        sb.append(str);
                        Log.e(str2, sb.toString());
                        break;
                    } else {
                        String str3 = str.split(",")[1];
                        if (!this.f1619t.containsKey(str3)) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("UNKNOWN customName ");
                            sb2.append(str3);
                            Log.e(str2, sb2.toString());
                            break;
                        } else {
                            C0467a aVar = (C0467a) this.f1619t.get(str3);
                            if (!(sVar instanceof C0371b)) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(str);
                                sb3.append(" splineSet not a CustomSet frame = ");
                                sb3.append(i);
                                sb3.append(", value");
                                sb3.append(aVar.mo2755b());
                                sb3.append(sVar);
                                Log.e(str2, sb3.toString());
                                break;
                            } else {
                                ((C0371b) sVar).mo2412a(i, aVar);
                                break;
                            }
                        }
                    }
            }
        }
    }

    /* renamed from: a */
    public void mo2335a(C0444f fVar, C0473c cVar, int i) {
        mo2332a((float) fVar.mo2528D(), (float) fVar.mo2529E(), (float) fVar.mo2525A(), (float) fVar.mo2589k());
        mo2336a(cVar.mo2775b(i));
    }
}
