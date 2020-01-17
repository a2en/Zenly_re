package p214e.p215a.p218l.p219a;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.C0271q;
import androidx.core.content.res.C0558f;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.vectordrawable.graphics.drawable.C1261b;
import androidx.vectordrawable.graphics.drawable.C1272h;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p214e.p215a.p220m.C7549b;
import p214e.p228e.C7576d;
import p214e.p228e.C7585h;

@SuppressLint({"RestrictedAPI"})
/* renamed from: e.a.l.a.a */
public class C7533a extends C7546d implements TintAwareDrawable {

    /* renamed from: s */
    private C7536c f18899s;

    /* renamed from: t */
    private C7540g f18900t;

    /* renamed from: u */
    private int f18901u;

    /* renamed from: v */
    private int f18902v;

    /* renamed from: w */
    private boolean f18903w;

    /* renamed from: e.a.l.a.a$b */
    private static class C7535b extends C7540g {

        /* renamed from: a */
        private final Animatable f18904a;

        C7535b(Animatable animatable) {
            super();
            this.f18904a = animatable;
        }

        /* renamed from: c */
        public void mo19320c() {
            this.f18904a.start();
        }

        /* renamed from: d */
        public void mo19321d() {
            this.f18904a.stop();
        }
    }

    /* renamed from: e.a.l.a.a$c */
    static class C7536c extends C7547a {

        /* renamed from: K */
        C7576d<Long> f18905K;

        /* renamed from: L */
        C7585h<Integer> f18906L;

        C7536c(C7536c cVar, C7533a aVar, Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.f18905K = cVar.f18905K;
                this.f18906L = cVar.f18906L;
                return;
            }
            this.f18905K = new C7576d<>();
            this.f18906L = new C7585h<>();
        }

        /* renamed from: f */
        private static long m18150f(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo19322a(int i, int i2, Drawable drawable, boolean z) {
            int a = super.mo19377a(drawable);
            long f = m18150f(i, i2);
            long j = z ? 8589934592L : 0;
            long j2 = (long) a;
            this.f18905K.mo19507a(f, Long.valueOf(j2 | j));
            if (z) {
                this.f18905K.mo19507a(m18150f(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo19324b(int[] iArr) {
            int a = super.mo19431a(iArr);
            if (a >= 0) {
                return a;
            }
            return super.mo19431a(StateSet.WILD_CARD);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public int mo19325c(int i, int i2) {
            return (int) ((Long) this.f18905K.mo19509b(m18150f(i, i2), Long.valueOf(-1))).longValue();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo19326d(int i) {
            if (i < 0) {
                return 0;
            }
            return ((Integer) this.f18906L.mo19620b(i, Integer.valueOf(0))).intValue();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public boolean mo19328e(int i, int i2) {
            return (((Long) this.f18905K.mo19509b(m18150f(i, i2), Long.valueOf(-1))).longValue() & 8589934592L) != 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: m */
        public void mo19329m() {
            this.f18905K = this.f18905K.clone();
            this.f18906L = this.f18906L.clone();
        }

        public Drawable newDrawable() {
            return new C7533a(this, null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo19327d(int i, int i2) {
            return (((Long) this.f18905K.mo19509b(m18150f(i, i2), Long.valueOf(-1))).longValue() & 4294967296L) != 0;
        }

        public Drawable newDrawable(Resources resources) {
            return new C7533a(this, resources);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo19323a(int[] iArr, Drawable drawable, int i) {
            int a = super.mo19432a(iArr, drawable);
            this.f18906L.mo19622c(a, Integer.valueOf(i));
            return a;
        }
    }

    /* renamed from: e.a.l.a.a$d */
    private static class C7537d extends C7540g {

        /* renamed from: a */
        private final C1261b f18907a;

        C7537d(C1261b bVar) {
            super();
            this.f18907a = bVar;
        }

        /* renamed from: c */
        public void mo19320c() {
            this.f18907a.start();
        }

        /* renamed from: d */
        public void mo19321d() {
            this.f18907a.stop();
        }
    }

    /* renamed from: e.a.l.a.a$e */
    private static class C7538e extends C7540g {

        /* renamed from: a */
        private final ObjectAnimator f18908a;

        /* renamed from: b */
        private final boolean f18909b;

        C7538e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            C7539f fVar = new C7539f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
            if (VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration((long) fVar.mo19334a());
            ofInt.setInterpolator(fVar);
            this.f18909b = z2;
            this.f18908a = ofInt;
        }

        /* renamed from: a */
        public boolean mo19332a() {
            return this.f18909b;
        }

        /* renamed from: b */
        public void mo19333b() {
            this.f18908a.reverse();
        }

        /* renamed from: c */
        public void mo19320c() {
            this.f18908a.start();
        }

        /* renamed from: d */
        public void mo19321d() {
            this.f18908a.cancel();
        }
    }

    /* renamed from: e.a.l.a.a$f */
    private static class C7539f implements TimeInterpolator {

        /* renamed from: a */
        private int[] f18910a;

        /* renamed from: b */
        private int f18911b;

        /* renamed from: c */
        private int f18912c;

        C7539f(AnimationDrawable animationDrawable, boolean z) {
            mo19335a(animationDrawable, z);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo19335a(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f18911b = numberOfFrames;
            int[] iArr = this.f18910a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f18910a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f18910a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f18912c = i;
            return i;
        }

        public float getInterpolation(float f) {
            int i = (int) ((f * ((float) this.f18912c)) + 0.5f);
            int i2 = this.f18911b;
            int[] iArr = this.f18910a;
            int i3 = 0;
            while (i3 < i2 && i >= iArr[i3]) {
                i -= iArr[i3];
                i3++;
            }
            return (((float) i3) / ((float) i2)) + (i3 < i2 ? ((float) i) / ((float) this.f18912c) : 0.0f);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo19334a() {
            return this.f18912c;
        }
    }

    /* renamed from: e.a.l.a.a$g */
    private static abstract class C7540g {
        private C7540g() {
        }

        /* renamed from: a */
        public boolean mo19332a() {
            return false;
        }

        /* renamed from: b */
        public void mo19333b() {
        }

        /* renamed from: c */
        public abstract void mo19320c();

        /* renamed from: d */
        public abstract void mo19321d();
    }

    static {
        Class<C7533a> cls = C7533a.class;
    }

    public C7533a() {
        this(null, null);
    }

    /* renamed from: b */
    public static C7533a m18137b(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws IOException, XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C7533a aVar = new C7533a();
            aVar.mo19313a(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid animated-selector tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }

    /* renamed from: c */
    private void m18139c() {
        onStateChange(getState());
    }

    /* renamed from: d */
    private int m18141d(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray a = C0558f.m2618a(resources, theme, attributeSet, C7549b.AnimatedStateListDrawableItem);
        int resourceId = a.getResourceId(C7549b.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = a.getResourceId(C7549b.AnimatedStateListDrawableItem_android_drawable, -1);
        Drawable a2 = resourceId2 > 0 ? C0271q.m1117a().mo1994a(context, resourceId2) : null;
        a.recycle();
        int[] a3 = mo19430a(attributeSet);
        String str = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";
        if (a2 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(str);
                throw new XmlPullParserException(sb.toString());
            } else if (xmlPullParser.getName().equals("vector")) {
                a2 = C1272h.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else if (VERSION.SDK_INT >= 21) {
                a2 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                a2 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (a2 != null) {
            return this.f18899s.mo19323a(a3, a2, resourceId);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(xmlPullParser.getPositionDescription());
        sb2.append(str);
        throw new XmlPullParserException(sb2.toString());
    }

    /* renamed from: e */
    private int m18142e(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray a = C0558f.m2618a(resources, theme, attributeSet, C7549b.AnimatedStateListDrawableTransition);
        int resourceId = a.getResourceId(C7549b.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = a.getResourceId(C7549b.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = a.getResourceId(C7549b.AnimatedStateListDrawableTransition_android_drawable, -1);
        Drawable a2 = resourceId3 > 0 ? C0271q.m1117a().mo1994a(context, resourceId3) : null;
        boolean z = a.getBoolean(C7549b.AnimatedStateListDrawableTransition_android_reversible, false);
        a.recycle();
        String str = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";
        if (a2 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(str);
                throw new XmlPullParserException(sb.toString());
            } else if (xmlPullParser.getName().equals("animated-vector")) {
                a2 = C1261b.m6033a(context, resources, xmlPullParser, attributeSet, theme);
            } else if (VERSION.SDK_INT >= 21) {
                a2 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                a2 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
            }
        }
        if (a2 == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(xmlPullParser.getPositionDescription());
            sb2.append(str);
            throw new XmlPullParserException(sb2.toString());
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f18899s.mo19322a(resourceId, resourceId2, a2, z);
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(xmlPullParser.getPositionDescription());
            sb3.append(": <transition> tag requires 'fromId' & 'toId' attributes");
            throw new XmlPullParserException(sb3.toString());
        }
    }

    public boolean isStateful() {
        return true;
    }

    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        C7540g gVar = this.f18900t;
        if (gVar != null) {
            gVar.mo19321d();
            this.f18900t = null;
            mo19339a(this.f18901u);
            this.f18901u = -1;
            this.f18902v = -1;
        }
    }

    public Drawable mutate() {
        if (!this.f18903w) {
            super.mutate();
            if (this == this) {
                this.f18899s.mo19329m();
                this.f18903w = true;
            }
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int b = this.f18899s.mo19324b(iArr);
        boolean z = b != mo19341b() && (m18138b(b) || mo19339a(b));
        Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (this.f18900t != null && (visible || z2)) {
            if (z) {
                this.f18900t.mo19320c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    C7533a(C7536c cVar, Resources resources) {
        super(null);
        this.f18901u = -1;
        this.f18902v = -1;
        mo19314a((C7544c) new C7536c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* renamed from: c */
    private void m18140c(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 < depth && next == 3) {
                    return;
                }
                if (next == 2 && depth2 <= depth) {
                    if (xmlPullParser.getName().equals("item")) {
                        m18141d(context, resources, xmlPullParser, attributeSet, theme);
                    } else if (xmlPullParser.getName().equals("transition")) {
                        m18142e(context, resources, xmlPullParser, attributeSet, theme);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo19313a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) throws XmlPullParserException, IOException {
        TypedArray a = C0558f.m2618a(resources, theme, attributeSet, C7549b.AnimatedStateListDrawableCompat);
        setVisible(a.getBoolean(C7549b.AnimatedStateListDrawableCompat_android_visible, true), true);
        m18136a(a);
        mo19337a(resources);
        a.recycle();
        m18140c(context, resources, xmlPullParser, attributeSet, theme);
        m18139c();
    }

    /* renamed from: b */
    private boolean m18138b(int i) {
        int i2;
        C7540g gVar;
        C7540g gVar2 = this.f18900t;
        if (gVar2 == null) {
            i2 = mo19341b();
        } else if (i == this.f18901u) {
            return true;
        } else {
            if (i != this.f18902v || !gVar2.mo19332a()) {
                i2 = this.f18901u;
                gVar2.mo19321d();
            } else {
                gVar2.mo19333b();
                this.f18901u = this.f18902v;
                this.f18902v = i;
                return true;
            }
        }
        this.f18900t = null;
        this.f18902v = -1;
        this.f18901u = -1;
        C7536c cVar = this.f18899s;
        int d = cVar.mo19326d(i2);
        int d2 = cVar.mo19326d(i);
        if (!(d2 == 0 || d == 0)) {
            int c = cVar.mo19325c(d, d2);
            if (c < 0) {
                return false;
            }
            boolean e = cVar.mo19328e(d, d2);
            mo19339a(c);
            Drawable current = getCurrent();
            if (current instanceof AnimationDrawable) {
                gVar = new C7538e((AnimationDrawable) current, cVar.mo19327d(d, d2), e);
            } else if (current instanceof C1261b) {
                gVar = new C7537d((C1261b) current);
            } else if (current instanceof Animatable) {
                gVar = new C7535b((Animatable) current);
            }
            gVar.mo19320c();
            this.f18900t = gVar;
            this.f18902v = i2;
            this.f18901u = i;
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m18136a(TypedArray typedArray) {
        C7536c cVar = this.f18899s;
        if (VERSION.SDK_INT >= 21) {
            cVar.f18939d |= typedArray.getChangingConfigurations();
        }
        cVar.mo19386b(typedArray.getBoolean(C7549b.AnimatedStateListDrawableCompat_android_variablePadding, cVar.f18944i));
        cVar.mo19382a(typedArray.getBoolean(C7549b.AnimatedStateListDrawableCompat_android_constantSize, cVar.f18947l));
        cVar.mo19385b(typedArray.getInt(C7549b.AnimatedStateListDrawableCompat_android_enterFadeDuration, cVar.f18927A));
        cVar.mo19389c(typedArray.getInt(C7549b.AnimatedStateListDrawableCompat_android_exitFadeDuration, cVar.f18928B));
        setDither(typedArray.getBoolean(C7549b.AnimatedStateListDrawableCompat_android_dither, cVar.f18959x));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C7536c m18145a() {
        return new C7536c(this.f18899s, this, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo19314a(C7544c cVar) {
        super.mo19314a(cVar);
        if (cVar instanceof C7536c) {
            this.f18899s = (C7536c) cVar;
        }
    }
}
