package com.airbnb.lottie;

import android.graphics.Rect;
import com.airbnb.lottie.model.C8557c;
import com.airbnb.lottie.model.C8581d;
import com.airbnb.lottie.model.C8584g;
import com.airbnb.lottie.model.p284i.C8592d;
import com.airbnb.lottie.p289q.C8654d;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p214e.p228e.C7576d;
import p214e.p228e.C7585h;

/* renamed from: com.airbnb.lottie.c */
public class C8506c {

    /* renamed from: a */
    private final PerformanceTracker f21757a = new PerformanceTracker();

    /* renamed from: b */
    private final HashSet<String> f21758b = new HashSet<>();

    /* renamed from: c */
    private Map<String, List<C8592d>> f21759c;

    /* renamed from: d */
    private Map<String, C8531f> f21760d;

    /* renamed from: e */
    private Map<String, C8557c> f21761e;

    /* renamed from: f */
    private List<C8584g> f21762f;

    /* renamed from: g */
    private C7585h<C8581d> f21763g;

    /* renamed from: h */
    private C7576d<C8592d> f21764h;

    /* renamed from: i */
    private List<C8592d> f21765i;

    /* renamed from: j */
    private Rect f21766j;

    /* renamed from: k */
    private float f21767k;

    /* renamed from: l */
    private float f21768l;

    /* renamed from: m */
    private float f21769m;

    /* renamed from: n */
    private boolean f21770n;

    /* renamed from: o */
    private int f21771o = 0;

    /* renamed from: a */
    public void mo22927a(Rect rect, float f, float f2, float f3, List<C8592d> list, C7576d<C8592d> dVar, Map<String, List<C8592d>> map, Map<String, C8531f> map2, C7585h<C8581d> hVar, Map<String, C8557c> map3, List<C8584g> list2) {
        this.f21766j = rect;
        this.f21767k = f;
        this.f21768l = f2;
        this.f21769m = f3;
        this.f21765i = list;
        this.f21764h = dVar;
        this.f21759c = map;
        this.f21760d = map2;
        this.f21763g = hVar;
        this.f21761e = map3;
        this.f21762f = list2;
    }

    /* renamed from: b */
    public void mo22932b(boolean z) {
        this.f21757a.mo22869a(z);
    }

    /* renamed from: c */
    public float mo22933c() {
        return (float) ((long) ((mo22935d() / this.f21769m) * 1000.0f));
    }

    /* renamed from: d */
    public float mo22935d() {
        return this.f21768l - this.f21767k;
    }

    /* renamed from: e */
    public float mo22936e() {
        return this.f21768l;
    }

    /* renamed from: f */
    public Map<String, C8557c> mo22937f() {
        return this.f21761e;
    }

    /* renamed from: g */
    public float mo22938g() {
        return this.f21769m;
    }

    /* renamed from: h */
    public Map<String, C8531f> mo22939h() {
        return this.f21760d;
    }

    /* renamed from: i */
    public List<C8592d> mo22940i() {
        return this.f21765i;
    }

    /* renamed from: j */
    public int mo22941j() {
        return this.f21771o;
    }

    /* renamed from: k */
    public PerformanceTracker mo22942k() {
        return this.f21757a;
    }

    /* renamed from: l */
    public float mo22943l() {
        return this.f21767k;
    }

    /* renamed from: m */
    public boolean mo22944m() {
        return this.f21770n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        for (C8592d a : this.f21765i) {
            sb.append(a.mo23190a("\t"));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public C7585h<C8581d> mo22931b() {
        return this.f21763g;
    }

    /* renamed from: c */
    public List<C8592d> mo22934c(String str) {
        return (List) this.f21759c.get(str);
    }

    /* renamed from: b */
    public C8584g mo22930b(String str) {
        this.f21762f.size();
        for (int i = 0; i < this.f21762f.size(); i++) {
            C8584g gVar = (C8584g) this.f21762f.get(i);
            if (gVar.mo23174a(str)) {
                return gVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void mo22928a(String str) {
        C8654d.m20155b(str);
        this.f21758b.add(str);
    }

    /* renamed from: a */
    public void mo22929a(boolean z) {
        this.f21770n = z;
    }

    /* renamed from: a */
    public void mo22926a(int i) {
        this.f21771o += i;
    }

    /* renamed from: a */
    public C8592d mo22925a(long j) {
        return (C8592d) this.f21764h.mo19513c(j);
    }

    /* renamed from: a */
    public Rect mo22924a() {
        return this.f21766j;
    }
}
