package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.constraintlayout.widget.C0473c;
import androidx.constraintlayout.widget.C0481f;
import androidx.constraintlayout.widget.C0482g;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.share.Constants;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import p214e.p229f.p230a.p231a.C7590c;

/* renamed from: androidx.constraintlayout.motion.widget.q */
public class C0364q {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final MotionLayout f1662a;

    /* renamed from: b */
    C0482g f1663b = null;

    /* renamed from: c */
    C0366b f1664c = null;

    /* renamed from: d */
    private ArrayList<C0366b> f1665d = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public SparseArray<C0473c> f1666e = new SparseArray<>();

    /* renamed from: f */
    private SparseIntArray f1667f = new SparseIntArray();

    /* renamed from: g */
    private boolean f1668g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f1669h = 100;

    /* renamed from: i */
    private MotionEvent f1670i;

    /* renamed from: j */
    private boolean f1671j = false;

    /* renamed from: k */
    private VelocityTracker f1672k;

    /* renamed from: l */
    float f1673l;

    /* renamed from: m */
    float f1674m;

    /* renamed from: androidx.constraintlayout.motion.widget.q$a */
    class C0365a implements Interpolator {

        /* renamed from: a */
        final /* synthetic */ C7590c f1675a;

        C0365a(C0364q qVar, C7590c cVar) {
            this.f1675a = cVar;
        }

        public float getInterpolation(float f) {
            return (float) this.f1675a.mo19644a((double) f);
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.q$b */
    public static class C0366b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f1676a = 0;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f1677b = 0;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public int f1678c = 0;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f1679d = null;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public int f1680e = -1;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f1681f = 400;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public float f1682g = 0.0f;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public final C0364q f1683h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public ArrayList<C0350g> f1684i = new ArrayList<>();
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C0415v f1685j = null;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public ArrayList<C0367a> f1686k = new ArrayList<>();
        /* access modifiers changed from: private */

        /* renamed from: l */
        public int f1687l = 0;

        /* renamed from: androidx.constraintlayout.motion.widget.q$b$a */
        static class C0367a implements OnClickListener {

            /* renamed from: e */
            private final C0366b f1688e;

            /* renamed from: f */
            int f1689f = -1;

            /* renamed from: g */
            int f1690g = 17;

            public C0367a(Context context, C0366b bVar, XmlPullParser xmlPullParser) {
                this.f1688e = bVar;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0481f.OnClick);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = obtainStyledAttributes.getIndex(i);
                    if (index == C0481f.OnClick_targetId) {
                        this.f1689f = obtainStyledAttributes.getResourceId(index, this.f1689f);
                    } else if (index == C0481f.OnClick_clickAction) {
                        this.f1690g = obtainStyledAttributes.getInt(index, this.f1690g);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* JADX WARNING: type inference failed for: r3v1, types: [android.view.View] */
            /* JADX WARNING: type inference failed for: r3v4, types: [android.view.View] */
            /* JADX WARNING: type inference failed for: r3v5 */
            /* JADX WARNING: Multi-variable type inference failed */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo2402a(androidx.constraintlayout.motion.widget.MotionLayout r3) {
                /*
                    r2 = this;
                    int r0 = r2.f1689f
                    r1 = -1
                    if (r0 != r1) goto L_0x0006
                    goto L_0x000a
                L_0x0006:
                    android.view.View r3 = r3.findViewById(r0)
                L_0x000a:
                    if (r3 != 0) goto L_0x0025
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.String r0 = " (*)  could not find id "
                    r3.append(r0)
                    int r0 = r2.f1689f
                    r3.append(r0)
                    java.lang.String r3 = r3.toString()
                    java.lang.String r0 = "MotionScene"
                    android.util.Log.e(r0, r3)
                    return
                L_0x0025:
                    r3.setOnClickListener(r2)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0364q.C0366b.C0367a.mo2402a(androidx.constraintlayout.motion.widget.MotionLayout):void");
            }

            /* renamed from: b */
            public void mo2404b(MotionLayout motionLayout) {
                View findViewById = motionLayout.findViewById(this.f1689f);
                if (findViewById == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(" (*)  could not find id ");
                    sb.append(this.f1689f);
                    Log.e("MotionScene", sb.toString());
                    return;
                }
                findViewById.setOnClickListener(null);
            }

            public void onClick(View view) {
                MotionLayout a = this.f1688e.f1683h.f1662a;
                C0366b bVar = this.f1688e.f1683h.f1664c;
                int i = this.f1690g;
                boolean z = ((i & 1) == 0 && (i & 256) == 0) ? false : true;
                int i2 = this.f1690g;
                boolean z2 = ((i2 & 16) == 0 && (i2 & 4096) == 0) ? false : true;
                if (z && z2) {
                    C0366b bVar2 = this.f1688e.f1683h.f1664c;
                    C0366b bVar3 = this.f1688e;
                    if (bVar2 != bVar3) {
                        a.setTransition(bVar3);
                    }
                    if (a.getCurrentState() == a.getEndState() || a.getProgress() > 0.5f) {
                        z = false;
                    } else {
                        z2 = false;
                    }
                }
                if (z) {
                    if (!mo2403a(bVar, true, a) || (this.f1690g & 1) == 0) {
                        a.setProgress(1.0f);
                    } else {
                        a.mo2256b();
                    }
                } else if (!z2) {
                } else {
                    if (!mo2403a(bVar, false, a) || (this.f1690g & 16) == 0) {
                        a.setProgress(0.0f);
                    } else {
                        a.mo2260c();
                    }
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public boolean mo2403a(C0366b bVar, boolean z, MotionLayout motionLayout) {
                C0366b bVar2 = this.f1688e;
                boolean z2 = true;
                if (bVar2 == bVar) {
                    return true;
                }
                int a = z ? bVar2.f1676a : bVar2.f1677b;
                int b = z ? this.f1688e.f1677b : this.f1688e.f1676a;
                if (motionLayout.getProgress() == 0.0f) {
                    if (motionLayout.f1404D != b) {
                        z2 = false;
                    }
                    return z2;
                } else if (motionLayout.getProgress() != 1.0f) {
                    return false;
                } else {
                    if (motionLayout.f1404D != a) {
                        z2 = false;
                    }
                    return z2;
                }
            }
        }

        C0366b(C0364q qVar) {
            this.f1683h = qVar;
        }

        /* renamed from: a */
        public void mo2401a(Context context, XmlPullParser xmlPullParser) {
            this.f1686k.add(new C0367a(context, this, xmlPullParser));
        }

        /* renamed from: a */
        public void mo2400a(int i) {
            this.f1681f = i;
        }

        /* renamed from: a */
        private void m1711a(C0364q qVar, Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0481f.Transition);
            m1710a(qVar, context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: a */
        private void m1710a(C0364q qVar, Context context, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                String str = "layout";
                if (index == C0481f.Transition_constraintSetEnd) {
                    this.f1676a = typedArray.getResourceId(index, this.f1676a);
                    if (str.equals(context.getResources().getResourceTypeName(this.f1676a))) {
                        C0473c cVar = new C0473c();
                        cVar.mo2778b(context, this.f1676a);
                        qVar.f1666e.append(this.f1676a, cVar);
                    }
                } else if (index == C0481f.Transition_constraintSetStart) {
                    this.f1677b = typedArray.getResourceId(index, this.f1677b);
                    if (str.equals(context.getResources().getResourceTypeName(this.f1677b))) {
                        C0473c cVar2 = new C0473c();
                        cVar2.mo2778b(context, this.f1677b);
                        qVar.f1666e.append(this.f1677b, cVar2);
                    }
                } else if (index == C0481f.Transition_motionInterpolator) {
                    int i2 = typedArray.peekValue(index).type;
                    if (i2 == 1) {
                        this.f1680e = typedArray.getResourceId(index, -1);
                        if (this.f1680e != -1) {
                            this.f1678c = -2;
                        }
                    } else if (i2 == 3) {
                        this.f1679d = typedArray.getString(index);
                        if (this.f1679d.indexOf(Constants.URL_PATH_DELIMITER) > 0) {
                            this.f1680e = typedArray.getResourceId(index, -1);
                            this.f1678c = -2;
                        } else {
                            this.f1678c = -1;
                        }
                    } else {
                        this.f1678c = typedArray.getInteger(index, this.f1678c);
                    }
                } else if (index == C0481f.Transition_duration) {
                    this.f1681f = typedArray.getInt(index, this.f1681f);
                } else if (index == C0481f.Transition_staggered) {
                    this.f1682g = typedArray.getFloat(index, this.f1682g);
                } else if (index == C0481f.Transition_autoTransition) {
                    this.f1687l = typedArray.getInteger(index, this.f1687l);
                }
            }
        }

        C0366b(C0364q qVar, Context context, XmlPullParser xmlPullParser) {
            this.f1681f = qVar.f1669h;
            this.f1683h = qVar;
            m1711a(qVar, context, Xml.asAttributeSet(xmlPullParser));
        }
    }

    C0364q(Context context, MotionLayout motionLayout, int i) {
        this.f1662a = motionLayout;
        m1673a(context, i);
    }

    /* renamed from: d */
    private int m1678d(int i) {
        C0482g gVar = this.f1663b;
        if (gVar != null) {
            int a = gVar.mo2801a(i, -1, -1);
            if (a != -1) {
                return a;
            }
        }
        return i;
    }

    /* renamed from: m */
    private boolean m1680m() {
        return this.f1672k != null;
    }

    /* renamed from: e */
    public Interpolator mo2391e() {
        switch (this.f1664c.f1678c) {
            case -2:
                return AnimationUtils.loadInterpolator(this.f1662a.getContext(), this.f1664c.f1680e);
            case -1:
                return new C0365a(this, C7590c.m18378a(this.f1664c.f1679d));
            case 0:
                return new AccelerateDecelerateInterpolator();
            case 1:
                return new AccelerateInterpolator();
            case 2:
                return new DecelerateInterpolator();
            case 3:
                return null;
            case 4:
                return new AnticipateInterpolator();
            case 5:
                return new BounceInterpolator();
            default:
                return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public float mo2392f() {
        C0366b bVar = this.f1664c;
        if (bVar == null || bVar.f1685j == null) {
            return 0.0f;
        }
        return this.f1664c.f1685j.mo2438a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public float mo2393g() {
        C0366b bVar = this.f1664c;
        if (bVar == null || bVar.f1685j == null) {
            return 0.0f;
        }
        return this.f1664c.f1685j.mo2442b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public boolean mo2394h() {
        C0366b bVar = this.f1664c;
        if (bVar == null || bVar.f1685j == null) {
            return false;
        }
        return this.f1664c.f1685j.mo2445c();
    }

    /* renamed from: i */
    public float mo2395i() {
        C0366b bVar = this.f1664c;
        if (bVar != null) {
            return bVar.f1682g;
        }
        return 0.0f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public int mo2396j() {
        C0366b bVar = this.f1664c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f1677b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo2397k() {
        C0366b bVar = this.f1664c;
        if (bVar != null && bVar.f1685j != null) {
            this.f1664c.f1685j.mo2446d();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public boolean mo2398l() {
        Iterator it = this.f1665d.iterator();
        do {
            boolean z = true;
            if (!it.hasNext()) {
                C0366b bVar = this.f1664c;
                if (bVar == null || bVar.f1685j == null) {
                    z = false;
                }
                return z;
            }
        } while (((C0366b) it.next()).f1685j == null);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r2 != -1) goto L_0x0018;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2377a(int r6, int r7) {
        /*
            r5 = this;
            androidx.constraintlayout.widget.g r0 = r5.f1663b
            if (r0 == 0) goto L_0x0016
            r1 = -1
            int r0 = r0.mo2801a(r6, r1, r1)
            if (r0 == r1) goto L_0x000c
            goto L_0x000d
        L_0x000c:
            r0 = r6
        L_0x000d:
            androidx.constraintlayout.widget.g r2 = r5.f1663b
            int r2 = r2.mo2801a(r7, r1, r1)
            if (r2 == r1) goto L_0x0017
            goto L_0x0018
        L_0x0016:
            r0 = r6
        L_0x0017:
            r2 = r7
        L_0x0018:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r1 = r5.f1665d
            java.util.Iterator r1 = r1.iterator()
        L_0x001e:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0045
            java.lang.Object r3 = r1.next()
            androidx.constraintlayout.motion.widget.q$b r3 = (androidx.constraintlayout.motion.widget.C0364q.C0366b) r3
            int r4 = r3.f1676a
            if (r4 != r2) goto L_0x0036
            int r4 = r3.f1677b
            if (r4 == r0) goto L_0x0042
        L_0x0036:
            int r4 = r3.f1676a
            if (r4 != r7) goto L_0x001e
            int r4 = r3.f1677b
            if (r4 != r6) goto L_0x001e
        L_0x0042:
            r5.f1664c = r3
            return
        L_0x0045:
            androidx.constraintlayout.motion.widget.q$b r6 = new androidx.constraintlayout.motion.widget.q$b
            r6.<init>(r5)
            r6.f1677b = r0
            r6.f1676a = r2
            int r7 = r5.f1669h
            r6.f1681f = r7
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r7 = r5.f1665d
            r7.add(r6)
            r5.f1664c = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0364q.mo2377a(int, int):void");
    }

    /* renamed from: b */
    public List<C0366b> mo2385b(int i) {
        int d = m1678d(i);
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f1665d.iterator();
        while (it.hasNext()) {
            C0366b bVar = (C0366b) it.next();
            if (bVar.f1677b == d || bVar.f1676a == d) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public int mo2388c() {
        C0366b bVar = this.f1664c;
        if (bVar != null) {
            return bVar.f1681f;
        }
        return this.f1669h;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public int mo2390d() {
        C0366b bVar = this.f1664c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f1676a;
    }

    /* renamed from: c */
    public void mo2389c(int i) {
        C0366b bVar = this.f1664c;
        if (bVar != null) {
            bVar.mo2400a(i);
        } else {
            this.f1669h = i;
        }
    }

    /* renamed from: b */
    public ArrayList<C0366b> mo2384b() {
        return this.f1665d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo2387b(MotionLayout motionLayout, int i) {
        if (m1680m()) {
            return false;
        }
        Iterator it = this.f1665d.iterator();
        while (it.hasNext()) {
            C0366b bVar = (C0366b) it.next();
            if (bVar.f1677b != 0) {
                if (i == bVar.f1677b && (bVar.f1687l == 4 || bVar.f1687l == 2)) {
                    motionLayout.setTransition(bVar);
                    if (bVar.f1687l == 4) {
                        motionLayout.mo2256b();
                    } else {
                        motionLayout.setProgress(1.0f);
                    }
                    return true;
                } else if (i == bVar.f1676a && (bVar.f1687l == 3 || bVar.f1687l == 1)) {
                    motionLayout.setTransition(bVar);
                    if (bVar.f1687l == 3) {
                        motionLayout.mo2260c();
                    } else {
                        motionLayout.setProgress(0.0f);
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    private void m1679e(int i) {
        int i2 = this.f1667f.get(i);
        if (i2 > 0) {
            m1679e(this.f1667f.get(i));
            ((C0473c) this.f1666e.get(i)).mo2773a((C0473c) this.f1666e.get(i2));
            this.f1667f.put(i, -1);
        }
    }

    /* renamed from: a */
    public void mo2382a(C0366b bVar) {
        this.f1664c = bVar;
    }

    /* renamed from: a */
    public void mo2380a(MotionLayout motionLayout, int i) {
        Iterator it = this.f1665d.iterator();
        while (it.hasNext()) {
            C0366b bVar = (C0366b) it.next();
            if (bVar.f1686k.size() > 0) {
                Iterator it2 = bVar.f1686k.iterator();
                while (it2.hasNext()) {
                    C0367a aVar = (C0367a) it2.next();
                    if (i == bVar.f1677b || i == bVar.f1676a) {
                        aVar.mo2402a(motionLayout);
                    } else {
                        aVar.mo2404b(motionLayout);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m1676b(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0481f.MotionScene);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C0481f.MotionScene_defaultDuration) {
                this.f1669h = obtainStyledAttributes.getInt(index, this.f1669h);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public C0366b mo2373a(int i, float f, float f2, MotionEvent motionEvent) {
        C0366b bVar = null;
        if (i != -1) {
            List<C0366b> b = mo2385b(i);
            float f3 = 0.0f;
            RectF rectF = new RectF();
            for (C0366b bVar2 : b) {
                if (this.f1662a.mo2255a(bVar2) && bVar2.f1685j != null) {
                    RectF a = bVar2.f1685j.mo2440a((ViewGroup) this.f1662a, rectF);
                    if (a == null || a.contains(motionEvent.getX(), motionEvent.getY())) {
                        float a2 = bVar2.f1685j.mo2439a(f, f2);
                        if (bVar2.f1676a == i) {
                            a2 *= -1.0f;
                        }
                        if (a2 > f3) {
                            bVar = bVar2;
                            f3 = a2;
                        }
                    }
                }
            }
            return bVar;
        } else if (!this.f1662a.mo2255a(this.f1664c)) {
            return null;
        } else {
            return this.f1664c;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo2386b(float f, float f2) {
        C0366b bVar = this.f1664c;
        if (bVar != null && bVar.f1685j != null) {
            this.f1664c.f1685j.mo2444c(f, f2);
        }
    }

    /* renamed from: a */
    public int[] mo2383a() {
        int[] iArr = new int[this.f1666e.size()];
        for (int i = 0; i < iArr.length; i++) {
            iArr[i] = this.f1666e.keyAt(i);
        }
        return iArr;
    }

    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1673a(android.content.Context r10, int r11) {
        /*
            r9 = this;
            android.content.res.Resources r0 = r10.getResources()
            android.content.res.XmlResourceParser r0 = r0.getXml(r11)
            r1 = 0
            int r2 = r0.getEventType()     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
        L_0x000d:
            r3 = 1
            if (r2 == r3) goto L_0x0120
            if (r2 == 0) goto L_0x010e
            r4 = 3
            r5 = 2
            if (r2 == r5) goto L_0x0018
            goto L_0x0111
        L_0x0018:
            java.lang.String r2 = r0.getName()     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            boolean r6 = r9.f1668g     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            if (r6 == 0) goto L_0x0036
            java.io.PrintStream r6 = java.lang.System.out     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            r7.<init>()     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            java.lang.String r8 = "parsing = "
            r7.append(r8)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            r7.append(r2)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            java.lang.String r7 = r7.toString()     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            r6.println(r7)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
        L_0x0036:
            r6 = -1
            int r7 = r2.hashCode()     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            java.lang.String r8 = "MotionScene"
            switch(r7) {
                case -1349929691: goto L_0x007a;
                case -1239391468: goto L_0x0070;
                case 269306229: goto L_0x0067;
                case 312750793: goto L_0x005d;
                case 327855227: goto L_0x0053;
                case 793277014: goto L_0x004b;
                case 1382829617: goto L_0x0041;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x0084
        L_0x0041:
            java.lang.String r3 = "StateSet"
            boolean r3 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            if (r3 == 0) goto L_0x0084
            r3 = 4
            goto L_0x0085
        L_0x004b:
            boolean r3 = r2.equals(r8)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            if (r3 == 0) goto L_0x0084
            r3 = 0
            goto L_0x0085
        L_0x0053:
            java.lang.String r3 = "OnSwipe"
            boolean r3 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            if (r3 == 0) goto L_0x0084
            r3 = 2
            goto L_0x0085
        L_0x005d:
            java.lang.String r3 = "OnClick"
            boolean r3 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            if (r3 == 0) goto L_0x0084
            r3 = 3
            goto L_0x0085
        L_0x0067:
            java.lang.String r4 = "Transition"
            boolean r4 = r2.equals(r4)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            if (r4 == 0) goto L_0x0084
            goto L_0x0085
        L_0x0070:
            java.lang.String r3 = "KeyFrameSet"
            boolean r3 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            if (r3 == 0) goto L_0x0084
            r3 = 6
            goto L_0x0085
        L_0x007a:
            java.lang.String r3 = "ConstraintSet"
            boolean r3 = r2.equals(r3)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            if (r3 == 0) goto L_0x0084
            r3 = 5
            goto L_0x0085
        L_0x0084:
            r3 = -1
        L_0x0085:
            switch(r3) {
                case 0: goto L_0x00f5;
                case 1: goto L_0x00e3;
                case 2: goto L_0x00a9;
                case 3: goto L_0x00a5;
                case 4: goto L_0x009d;
                case 5: goto L_0x0098;
                case 6: goto L_0x008a;
                default: goto L_0x0088;
            }     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
        L_0x0088:
            goto L_0x00f9
        L_0x008a:
            androidx.constraintlayout.motion.widget.g r2 = new androidx.constraintlayout.motion.widget.g     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            r2.<init>(r10, r0)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            java.util.ArrayList r3 = r1.f1684i     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            r3.add(r2)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            goto L_0x0111
        L_0x0098:
            r9.m1674a(r10, r0)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            goto L_0x0111
        L_0x009d:
            androidx.constraintlayout.widget.g r2 = new androidx.constraintlayout.widget.g     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            r2.<init>(r10, r0)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            r9.f1663b = r2     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            goto L_0x0111
        L_0x00a5:
            r1.mo2401a(r10, r0)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            goto L_0x0111
        L_0x00a9:
            if (r1 != 0) goto L_0x00d8
            android.content.res.Resources r2 = r10.getResources()     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            java.lang.String r2 = r2.getResourceEntryName(r11)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            int r3 = r0.getLineNumber()     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            java.lang.String r5 = " OnSwipe ("
            r4.append(r5)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            r4.append(r2)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            java.lang.String r2 = ".xml:"
            r4.append(r2)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            r4.append(r3)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            java.lang.String r2 = ")"
            r4.append(r2)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            java.lang.String r2 = r4.toString()     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            android.util.Log.v(r8, r2)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
        L_0x00d8:
            androidx.constraintlayout.motion.widget.v r2 = new androidx.constraintlayout.motion.widget.v     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r9.f1662a     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            r2.<init>(r10, r3, r0)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            r1.f1685j = r2     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            goto L_0x0111
        L_0x00e3:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.q$b> r1 = r9.f1665d     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            androidx.constraintlayout.motion.widget.q$b r2 = new androidx.constraintlayout.motion.widget.q$b     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            r2.<init>(r9, r10, r0)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            r1.add(r2)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            androidx.constraintlayout.motion.widget.q$b r1 = r9.f1664c     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            if (r1 != 0) goto L_0x00f3
            r9.f1664c = r2     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
        L_0x00f3:
            r1 = r2
            goto L_0x0111
        L_0x00f5:
            r9.m1676b(r10, r0)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            goto L_0x0111
        L_0x00f9:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            java.lang.String r4 = "WARNING UNKNOWN ATTRIBUTE "
            r3.append(r4)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            r3.append(r2)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            java.lang.String r2 = r3.toString()     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            android.util.Log.v(r8, r2)     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            goto L_0x0111
        L_0x010e:
            r0.getName()     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
        L_0x0111:
            int r2 = r0.next()     // Catch:{ XmlPullParserException -> 0x011c, IOException -> 0x0117 }
            goto L_0x000d
        L_0x0117:
            r10 = move-exception
            r10.printStackTrace()
            goto L_0x0120
        L_0x011c:
            r10 = move-exception
            r10.printStackTrace()
        L_0x0120:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0364q.m1673a(android.content.Context, int):void");
    }

    /* renamed from: a */
    private int m1671a(Context context, String str) {
        int i;
        if (str.contains(Constants.URL_PATH_DELIMITER)) {
            i = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
            if (this.f1668g) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder();
                sb.append("id getMap res = ");
                sb.append(i);
                printStream.println(sb.toString());
            }
        } else {
            i = -1;
        }
        if (i != -1) {
            return i;
        }
        if (str != null && str.length() > 1) {
            return Integer.parseInt(str.substring(1));
        }
        Log.e("MotionScene", "error in parsing id");
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1674a(android.content.Context r13, org.xmlpull.v1.XmlPullParser r14) {
        /*
            r12 = this;
            androidx.constraintlayout.widget.c r0 = new androidx.constraintlayout.widget.c
            r0.<init>()
            r1 = 0
            r0.mo2774a(r1)
            int r2 = r14.getAttributeCount()
            r3 = -1
            r4 = 0
            r5 = -1
            r6 = -1
        L_0x0011:
            if (r4 >= r2) goto L_0x006a
            java.lang.String r7 = r14.getAttributeName(r4)
            java.lang.String r8 = r14.getAttributeValue(r4)
            boolean r9 = r12.f1668g
            if (r9 == 0) goto L_0x0035
            java.io.PrintStream r9 = java.lang.System.out
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "id string = "
            r10.append(r11)
            r10.append(r8)
            java.lang.String r10 = r10.toString()
            r9.println(r10)
        L_0x0035:
            int r9 = r7.hashCode()
            r10 = -1496482599(0xffffffffa6cd7cd9, float:-1.4258573E-15)
            r11 = 1
            if (r9 == r10) goto L_0x004e
            r10 = 3355(0xd1b, float:4.701E-42)
            if (r9 == r10) goto L_0x0044
            goto L_0x0058
        L_0x0044:
            java.lang.String r9 = "id"
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L_0x0058
            r7 = 0
            goto L_0x0059
        L_0x004e:
            java.lang.String r9 = "deriveConstraintsFrom"
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto L_0x0058
            r7 = 1
            goto L_0x0059
        L_0x0058:
            r7 = -1
        L_0x0059:
            if (r7 == 0) goto L_0x0063
            if (r7 == r11) goto L_0x005e
            goto L_0x0067
        L_0x005e:
            int r6 = r12.m1671a(r13, r8)
            goto L_0x0067
        L_0x0063:
            int r5 = r12.m1671a(r13, r8)
        L_0x0067:
            int r4 = r4 + 1
            goto L_0x0011
        L_0x006a:
            if (r5 == r3) goto L_0x007b
            r0.mo2768a(r13, r14)
            if (r6 == r3) goto L_0x0076
            android.util.SparseIntArray r13 = r12.f1667f
            r13.put(r5, r6)
        L_0x0076:
            android.util.SparseArray<androidx.constraintlayout.widget.c> r13 = r12.f1666e
            r13.put(r5, r0)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.C0364q.m1674a(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0473c mo2374a(int i) {
        return mo2375a(i, -1, -1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0473c mo2375a(int i, int i2, int i3) {
        if (this.f1668g) {
            PrintStream printStream = System.out;
            StringBuilder sb = new StringBuilder();
            sb.append("id ");
            sb.append(i);
            printStream.println(sb.toString());
            PrintStream printStream2 = System.out;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("size ");
            sb2.append(this.f1666e.size());
            printStream2.println(sb2.toString());
        }
        C0482g gVar = this.f1663b;
        if (gVar != null) {
            int a = gVar.mo2801a(i, i2, i3);
            if (a != -1) {
                i = a;
            }
        }
        if (this.f1666e.get(i) != null) {
            return (C0473c) this.f1666e.get(i);
        }
        SparseArray<C0473c> sparseArray = this.f1666e;
        return (C0473c) sparseArray.get(sparseArray.keyAt(0));
    }

    /* renamed from: a */
    public void mo2381a(C0361n nVar) {
        C0366b bVar = this.f1664c;
        if (bVar != null) {
            Iterator it = bVar.f1684i.iterator();
            while (it.hasNext()) {
                ((C0350g) it.next()).mo2327a(nVar);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2378a(MotionEvent motionEvent, int i, MotionLayout motionLayout) {
        RectF rectF = new RectF();
        if (this.f1672k == null) {
            this.f1672k = VelocityTracker.obtain();
        }
        this.f1672k.addMovement(motionEvent);
        if (i != -1) {
            int action = motionEvent.getAction();
            boolean z = false;
            if (action == 0) {
                this.f1673l = motionEvent.getRawX();
                this.f1674m = motionEvent.getRawY();
                this.f1670i = motionEvent;
                if (this.f1664c.f1685j != null) {
                    RectF a = this.f1664c.f1685j.mo2440a((ViewGroup) this.f1662a, rectF);
                    if (a == null || a.contains(this.f1670i.getX(), this.f1670i.getY())) {
                        this.f1671j = false;
                    } else {
                        this.f1671j = true;
                    }
                    this.f1664c.f1685j.mo2447d(this.f1673l, this.f1674m);
                }
                return;
            } else if (action == 2) {
                float rawY = motionEvent.getRawY() - this.f1674m;
                float rawX = motionEvent.getRawX() - this.f1673l;
                if (((double) rawX) != 0.0d || ((double) rawY) != 0.0d) {
                    C0366b a2 = mo2373a(i, rawX, rawY, this.f1670i);
                    if (a2 != null) {
                        motionLayout.setTransition(a2);
                        RectF a3 = this.f1664c.f1685j.mo2440a((ViewGroup) this.f1662a, rectF);
                        if (a3 != null && !a3.contains(this.f1670i.getX(), this.f1670i.getY())) {
                            z = true;
                        }
                        this.f1671j = z;
                        this.f1664c.f1685j.mo2448e(this.f1673l, this.f1674m);
                    }
                } else {
                    return;
                }
            }
        }
        C0366b bVar = this.f1664c;
        if (!(bVar == null || bVar.f1685j == null || this.f1671j)) {
            this.f1664c.f1685j.mo2441a(motionEvent, this.f1672k, i, this);
        }
        this.f1673l = motionEvent.getRawX();
        this.f1674m = motionEvent.getRawY();
        if (motionEvent.getAction() == 1) {
            VelocityTracker velocityTracker = this.f1672k;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f1672k = null;
                int i2 = motionLayout.f1404D;
                if (i2 != -1) {
                    mo2387b(motionLayout, i2);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2376a(float f, float f2) {
        C0366b bVar = this.f1664c;
        if (bVar != null && bVar.f1685j != null) {
            this.f1664c.f1685j.mo2443b(f, f2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo2379a(MotionLayout motionLayout) {
        for (int i = 0; i < this.f1666e.size(); i++) {
            m1679e(this.f1666e.keyAt(i));
        }
        for (int i2 = 0; i2 < this.f1666e.size(); i2++) {
            ((C0473c) this.f1666e.valueAt(i2)).mo2786d((ConstraintLayout) motionLayout);
        }
    }
}
