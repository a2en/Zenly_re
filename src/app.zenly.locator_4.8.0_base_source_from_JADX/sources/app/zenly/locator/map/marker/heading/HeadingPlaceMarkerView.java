package app.zenly.locator.map.marker.heading;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.core.content.C0540a;
import app.zenly.android.base.view.C1309a;
import app.zenly.android.base.view.C1311b;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.map.marker.MarkerView;
import app.zenly.locator.map.marker.heading.C4208e.C4209a;
import app.zenly.locator.map.marker.heading.C4208e.C4209a.C4210a;
import app.zenly.locator.map.marker.heading.C4208e.C4209a.C4211b;
import app.zenly.locator.map.marker.heading.C4208e.C4209a.C4212c;
import app.zenly.locator.map.marker.heading.C4208e.C4213b;
import app.zenly.locator.map.text.C4301d;
import app.zenly.locator.p143s.p149m.C5454c;
import app.zenly.locator.p143s.p160v.p161b.C5518b;
import app.zenly.locator.p143s.p160v.p161b.C5521c;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import kotlin.C12956q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p254d.C7657c;
import p250f.p251a.p252a.p253a.p260i.C7685b;
import p250f.p251a.p252a.p253a.p260i.p261f.C7690a;
import p250f.p251a.p252a.p253a.p260i.p261f.C7691b;
import p250f.p251a.p252a.p263b.p279d.C7770f;

public final class HeadingPlaceMarkerView extends MarkerView {

    /* renamed from: u */
    private static final TimeInterpolator f11220u = C7657c.m18644b(0.8f);

    /* renamed from: h */
    private C4213b f11221h;

    /* renamed from: i */
    private C4209a f11222i;

    /* renamed from: j */
    private float f11223j;

    /* renamed from: k */
    private float f11224k;

    /* renamed from: l */
    private Function0<C12956q> f11225l;

    /* renamed from: m */
    private C4193d f11226m;

    /* renamed from: n */
    private final LayoutParams f11227n;

    /* renamed from: o */
    private int f11228o;

    /* renamed from: p */
    private GradientDrawable f11229p;

    /* renamed from: q */
    private final AnimatorSet f11230q;

    /* renamed from: r */
    private C5454c f11231r;

    /* renamed from: s */
    private final C4196g f11232s;

    /* renamed from: t */
    private HashMap f11233t;

    /* renamed from: app.zenly.locator.map.marker.heading.HeadingPlaceMarkerView$a */
    public static final class C4190a implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ HeadingPlaceMarkerView f11234a;

        public C4190a(HeadingPlaceMarkerView headingPlaceMarkerView) {
            this.f11234a = headingPlaceMarkerView;
        }

        public void onAnimationCancel(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationEnd(Animator animator) {
            C12932j.m33818b(animator, "animator");
            if (this.f11234a.mo10979a()) {
                animator.start();
            }
        }

        public void onAnimationRepeat(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }
    }

    /* renamed from: app.zenly.locator.map.marker.heading.HeadingPlaceMarkerView$b */
    public static final class C4191b implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ HeadingPlaceMarkerView f11235a;

        public C4191b(HeadingPlaceMarkerView headingPlaceMarkerView) {
            this.f11235a = headingPlaceMarkerView;
        }

        public void onAnimationCancel(Animator animator) {
            C12932j.m33818b(animator, "animator");
            ImageView imageView = (ImageView) this.f11235a.mo11150a(C3891l.pulse);
            C12932j.m33815a((Object) imageView, "pulse");
            imageView.setAlpha(0.0f);
        }

        public void onAnimationEnd(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationRepeat(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }

        public void onAnimationStart(Animator animator) {
            C12932j.m33818b(animator, "animator");
        }
    }

    /* renamed from: app.zenly.locator.map.marker.heading.HeadingPlaceMarkerView$c */
    static final class C4192c implements OnLayoutChangeListener {

        /* renamed from: e */
        final /* synthetic */ HeadingPlaceMarkerView f11236e;

        C4192c(HeadingPlaceMarkerView headingPlaceMarkerView) {
            this.f11236e = headingPlaceMarkerView;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f11236e.m12499d();
        }
    }

    /* renamed from: app.zenly.locator.map.marker.heading.HeadingPlaceMarkerView$d */
    public enum C4193d {
        BOTTOM,
        NONE,
        TOP
    }

    /* renamed from: app.zenly.locator.map.marker.heading.HeadingPlaceMarkerView$e */
    public static final class C4194e {
        private C4194e() {
        }

        public /* synthetic */ C4194e(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.map.marker.heading.HeadingPlaceMarkerView$f */
    static final class C4195f implements Runnable {

        /* renamed from: e */
        final /* synthetic */ HeadingPlaceMarkerView f11241e;

        C4195f(HeadingPlaceMarkerView headingPlaceMarkerView) {
            this.f11241e = headingPlaceMarkerView;
        }

        public final void run() {
            ((ImageView) this.f11241e.mo11150a(C3891l.pulse)).requestLayout();
        }
    }

    /* renamed from: app.zenly.locator.map.marker.heading.HeadingPlaceMarkerView$g */
    public static final class C4196g implements Runnable {

        /* renamed from: e */
        private final long f11242e = TimeUnit.MINUTES.toMillis(15);

        /* renamed from: f */
        private final long f11243f = TimeUnit.HOURS.toMillis(1);

        /* renamed from: g */
        final /* synthetic */ HeadingPlaceMarkerView f11244g;

        /* renamed from: h */
        final /* synthetic */ Context f11245h;

        C4196g(HeadingPlaceMarkerView headingPlaceMarkerView, Context context) {
            this.f11244g = headingPlaceMarkerView;
            this.f11245h = context;
        }

        /* renamed from: a */
        private final String m12505a(C4210a aVar) {
            long currentTimeMillis = System.currentTimeMillis() - aVar.mo11203b();
            if (currentTimeMillis >= this.f11243f) {
                return C5518b.m15655c(this.f11245h, aVar.mo11203b());
            }
            long j = this.f11242e;
            long j2 = ((currentTimeMillis / j) + 1) * j;
            Context context = this.f11245h;
            String string = context.getString(R.string.contextView_capsule_heading_departure_timeFormatterLess, new Object[]{C5521c.m15669a(context, j2)});
            C12932j.m33815a((Object) string, "context.getString(\n     …bucket)\n                )");
            return string;
        }

        public void run() {
            this.f11244g.removeCallbacks(this);
            C4213b place = this.f11244g.getPlace();
            C4209a info = this.f11244g.getInfo();
            String str = "callout";
            if (this.f11244g.getCalloutVisibility() == C4193d.NONE || place == null || (info instanceof C4211b)) {
                TextView textView = (TextView) this.f11244g.mo11150a(C3891l.callout);
                C12932j.m33815a((Object) textView, str);
                textView.setVisibility(8);
                return;
            }
            C7685b bVar = new C7685b();
            String a = m12507a(place, info);
            if (a != null) {
                C7690a aVar = new C7690a(this.f11245h, R.color.gray_black, 0, 4, null);
                bVar.mo19897a((Object) aVar);
                bVar.mo19897a((Object) new C7691b(this.f11245h, C7770f.TextAppearance_Capsule));
                bVar.mo19896a((CharSequence) a);
                bVar.mo19899c();
                bVar.mo19899c();
            }
            String a2 = m12506a(info);
            if (a2 != null) {
                if (a != null) {
                    bVar.mo19896a((CharSequence) "\n");
                }
                C7690a aVar2 = new C7690a(this.f11245h, R.color.gray_dark, 0, 4, null);
                bVar.mo19897a((Object) aVar2);
                bVar.mo19897a((Object) new C7691b(this.f11245h, C7770f.TextAppearance_Subtitle));
                bVar.mo19896a((CharSequence) a2);
                bVar.mo19899c();
                bVar.mo19899c();
            }
            if (bVar.mo19900d() > 0) {
                TextView textView2 = (TextView) this.f11244g.mo11150a(C3891l.callout);
                C12932j.m33815a((Object) textView2, str);
                textView2.setText(bVar.mo19893a());
                TextView textView3 = (TextView) this.f11244g.mo11150a(C3891l.callout);
                C12932j.m33815a((Object) textView3, str);
                textView3.setVisibility(0);
                if (this.f11244g.mo10979a()) {
                    this.f11244g.postDelayed(this, TimeUnit.MINUTES.toMillis(1));
                }
            } else {
                TextView textView4 = (TextView) this.f11244g.mo11150a(C3891l.callout);
                C12932j.m33815a((Object) textView4, str);
                textView4.setVisibility(8);
            }
        }

        /* renamed from: a */
        private final String m12507a(C4213b bVar, C4209a aVar) {
            String str;
            boolean z = aVar instanceof C4210a;
            Object obj = z ? ((C4210a) aVar).mo11202a() : aVar instanceof C4212c ? ((C4212c) aVar).mo11207a() : null;
            if (obj != null) {
                int i = C4215f.f11308a[bVar.ordinal()];
                if (i == 1) {
                    str = this.f11245h.getString(R.string.map_callout_heading_title_home, new Object[]{obj});
                } else if (i == 2) {
                    str = this.f11245h.getString(R.string.map_callout_heading_title_school, new Object[]{obj});
                } else if (i != 3) {
                    str = null;
                } else {
                    str = this.f11245h.getString(R.string.map_callout_heading_title_work, new Object[]{obj});
                }
                if (str != null) {
                    return str;
                }
            }
            if (z) {
                return this.f11245h.getString(R.string.map_callout_heading_title_unknown_departure);
            }
            if (aVar instanceof C4212c) {
                return this.f11245h.getString(R.string.map_callout_heading_title_unknown_arrival);
            }
            return null;
        }

        /* renamed from: a */
        private final String m12506a(C4209a aVar) {
            if (aVar instanceof C4210a) {
                C4210a aVar2 = (C4210a) aVar;
                String a = aVar2.mo11202a();
                if (a == null) {
                    return null;
                }
                String a2 = m12505a(aVar2);
                return this.f11245h.getString(R.string.map_callout_heading_subtitle_left, new Object[]{a, a2});
            } else if (aVar instanceof C4212c) {
                C4212c cVar = (C4212c) aVar;
                String a3 = cVar.mo11207a();
                if (a3 == null) {
                    return null;
                }
                String a4 = C4301d.f11508f.mo11334a(this.f11245h, cVar.mo11208b() - System.currentTimeMillis());
                return this.f11245h.getString(R.string.map_callout_heading_subtitle_arrival, new Object[]{a3, a4});
            } else if (aVar instanceof C4211b) {
                return null;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }

        /* renamed from: a */
        public final void mo11173a() {
            this.f11244g.removeCallbacks(this);
        }
    }

    static {
        new C4194e(null);
    }

    public /* synthetic */ HeadingPlaceMarkerView(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m12499d() {
        C4213b bVar = this.f11221h;
        if (bVar != null) {
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) mo11150a(C3891l.drawee);
            String str = "drawee";
            C12932j.m33815a((Object) simpleDraweeView, str);
            int width = (int) (((float) simpleDraweeView.getWidth()) * bVar.mo11212a());
            SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) mo11150a(C3891l.drawee);
            C12932j.m33815a((Object) simpleDraweeView2, str);
            Point point = new Point(width, (int) (((float) simpleDraweeView2.getHeight()) * bVar.mo11213b()));
            SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) mo11150a(C3891l.drawee);
            C12932j.m33815a((Object) simpleDraweeView3, str);
            C1311b.m6281a(simpleDraweeView3, point, this);
            float f = 0.0f;
            float width2 = getWidth() > 0 ? ((float) point.x) / ((float) getWidth()) : 0.0f;
            if (getHeight() > 0) {
                f = ((float) point.y) / ((float) getHeight());
            }
            if (!(width2 == this.f11223j && f == this.f11224k)) {
                this.f11223j = width2;
                this.f11224k = f;
                Function0<C12956q> function0 = this.f11225l;
                if (function0 != null) {
                    C12956q qVar = (C12956q) function0.invoke();
                }
            }
            int width3 = point.x - (getWidth() / 2);
            int height = point.y - (getHeight() / 2);
            LayoutParams layoutParams = this.f11227n;
            if (width3 != layoutParams.leftMargin || height != layoutParams.topMargin) {
                LayoutParams layoutParams2 = this.f11227n;
                layoutParams2.leftMargin = width3;
                layoutParams2.topMargin = height;
                ((ImageView) mo11150a(C3891l.pulse)).post(new C4195f(this));
            }
        }
    }

    /* renamed from: e */
    private final void m12500e() {
        C5454c cVar = this.f11231r;
        if (cVar != null) {
            cVar.mo13042c();
        }
    }

    /* renamed from: f */
    private final void m12501f() {
        C5454c cVar = this.f11231r;
        if (cVar != null) {
            cVar.mo13043d();
        }
    }

    private final void setPulseColor(int i) {
        this.f11228o = i;
        this.f11229p.setColor(ColorStateList.valueOf(i));
    }

    /* renamed from: a */
    public View mo11150a(int i) {
        if (this.f11233t == null) {
            this.f11233t = new HashMap();
        }
        View view = (View) this.f11233t.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f11233t.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo10831b() {
        m12500e();
        this.f11232s.run();
        this.f11230q.start();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo10834c() {
        m12501f();
        this.f11232s.mo11173a();
        this.f11230q.cancel();
    }

    public final float getAnchorX() {
        return this.f11223j;
    }

    public final float getAnchorY() {
        return this.f11224k;
    }

    public final C4193d getCalloutVisibility() {
        return this.f11226m;
    }

    public final C4209a getInfo() {
        return this.f11222i;
    }

    public final Function0<C12956q> getOnAnchorChange() {
        return this.f11225l;
    }

    public final C4213b getPlace() {
        return this.f11221h;
    }

    public final RectF getTouchRect() {
        Point point = new Point();
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) mo11150a(C3891l.drawee);
        String str = "drawee";
        C12932j.m33815a((Object) simpleDraweeView, str);
        C1311b.m6281a(simpleDraweeView, point, this);
        SimpleDraweeView simpleDraweeView2 = (SimpleDraweeView) mo11150a(C3891l.drawee);
        C12932j.m33815a((Object) simpleDraweeView2, str);
        int width = simpleDraweeView2.getWidth();
        SimpleDraweeView simpleDraweeView3 = (SimpleDraweeView) mo11150a(C3891l.drawee);
        C12932j.m33815a((Object) simpleDraweeView3, str);
        Point point2 = new Point(width, simpleDraweeView3.getHeight());
        SimpleDraweeView simpleDraweeView4 = (SimpleDraweeView) mo11150a(C3891l.drawee);
        C12932j.m33815a((Object) simpleDraweeView4, str);
        C1311b.m6281a(simpleDraweeView4, point2, this);
        return new RectF(getX() + ((float) point.x), getY() + ((float) point.y), getX() + ((float) point2.x), getY() + ((float) point2.y));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m12499d();
    }

    public final void setCalloutVisibility(C4193d dVar) {
        C12932j.m33818b(dVar, "value");
        this.f11226m = dVar;
        String str = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
        String str2 = "callout";
        if (dVar == C4193d.TOP) {
            TextView textView = (TextView) mo11150a(C3891l.callout);
            C12932j.m33815a((Object) textView, str2);
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            if (layoutParams != null) {
                LayoutParams layoutParams2 = (LayoutParams) layoutParams;
                layoutParams2.f2142i = -1;
                layoutParams2.f2144j = R.id.drawee;
                ((TextView) mo11150a(C3891l.callout)).requestLayout();
            } else {
                throw new TypeCastException(str);
            }
        } else if (dVar == C4193d.BOTTOM) {
            TextView textView2 = (TextView) mo11150a(C3891l.callout);
            C12932j.m33815a((Object) textView2, str2);
            ViewGroup.LayoutParams layoutParams3 = textView2.getLayoutParams();
            if (layoutParams3 != null) {
                LayoutParams layoutParams4 = (LayoutParams) layoutParams3;
                layoutParams4.f2142i = R.id.drawee;
                layoutParams4.f2144j = -1;
                ((TextView) mo11150a(C3891l.callout)).requestLayout();
            } else {
                throw new TypeCastException(str);
            }
        }
        this.f11232s.run();
    }

    public final void setInfo(C4209a aVar) {
        C12932j.m33818b(aVar, "value");
        this.f11222i = aVar;
        if (aVar instanceof C4210a) {
            setPulseColor(C0540a.m2536a(getContext(), (int) R.color.gray_medium));
        } else if (aVar instanceof C4212c) {
            setPulseColor(C0540a.m2536a(getContext(), (int) R.color.blue));
        } else {
            boolean z = aVar instanceof C4211b;
        }
        this.f11232s.run();
    }

    public final void setOnAnchorChange(Function0<C12956q> function0) {
        this.f11225l = function0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x004d, code lost:
        if (r2.getLayoutParams().height != r1) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setPlace(app.zenly.locator.map.marker.heading.C4208e.C4213b r5) {
        /*
            r4 = this;
            app.zenly.locator.map.marker.heading.e$b r0 = r4.f11221h
            if (r5 != r0) goto L_0x0005
            return
        L_0x0005:
            r4.m12501f()
            r0 = 0
            r4.f11231r = r0
            r4.f11221h = r5
            if (r5 == 0) goto L_0x009b
            android.content.Context r0 = r4.getContext()
            int r1 = r5.mo11216e()
            int r0 = app.zenly.locator.core.util.C3200e0.m10183a(r0, r1)
            android.content.Context r1 = r4.getContext()
            int r2 = r5.mo11215d()
            int r1 = app.zenly.locator.core.util.C3200e0.m10183a(r1, r2)
            int r2 = app.zenly.locator.C3891l.drawee
            android.view.View r2 = r4.mo11150a(r2)
            com.facebook.drawee.view.SimpleDraweeView r2 = (com.facebook.drawee.view.SimpleDraweeView) r2
            java.lang.String r3 = "drawee"
            kotlin.jvm.internal.C12932j.m33815a(r2, r3)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            int r2 = r2.width
            if (r2 != r0) goto L_0x004f
            int r2 = app.zenly.locator.C3891l.drawee
            android.view.View r2 = r4.mo11150a(r2)
            com.facebook.drawee.view.SimpleDraweeView r2 = (com.facebook.drawee.view.SimpleDraweeView) r2
            kotlin.jvm.internal.C12932j.m33815a(r2, r3)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            int r2 = r2.height
            if (r2 == r1) goto L_0x007c
        L_0x004f:
            int r2 = app.zenly.locator.C3891l.drawee
            android.view.View r2 = r4.mo11150a(r2)
            com.facebook.drawee.view.SimpleDraweeView r2 = (com.facebook.drawee.view.SimpleDraweeView) r2
            kotlin.jvm.internal.C12932j.m33815a(r2, r3)
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            r2.width = r0
            int r0 = app.zenly.locator.C3891l.drawee
            android.view.View r0 = r4.mo11150a(r0)
            com.facebook.drawee.view.SimpleDraweeView r0 = (com.facebook.drawee.view.SimpleDraweeView) r0
            kotlin.jvm.internal.C12932j.m33815a(r0, r3)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            r0.height = r1
            int r0 = app.zenly.locator.C3891l.drawee
            android.view.View r0 = r4.mo11150a(r0)
            com.facebook.drawee.view.SimpleDraweeView r0 = (com.facebook.drawee.view.SimpleDraweeView) r0
            r0.requestLayout()
        L_0x007c:
            app.zenly.locator.s.m.c r0 = new app.zenly.locator.s.m.c
            int r1 = app.zenly.locator.C3891l.drawee
            android.view.View r1 = r4.mo11150a(r1)
            com.facebook.drawee.view.SimpleDraweeView r1 = (com.facebook.drawee.view.SimpleDraweeView) r1
            kotlin.jvm.internal.C12932j.m33815a(r1, r3)
            int r5 = r5.mo11214c()
            r0.<init>(r1, r5)
            r4.f11231r = r0
            boolean r5 = r4.mo10979a()
            if (r5 == 0) goto L_0x009b
            r4.m12500e()
        L_0x009b:
            r4.m12499d()
            app.zenly.locator.map.marker.heading.HeadingPlaceMarkerView$g r5 = r4.f11232s
            r5.run()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.marker.heading.HeadingPlaceMarkerView.setPlace(app.zenly.locator.map.marker.heading.e$b):void");
    }

    public HeadingPlaceMarkerView(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        View.inflate(getContext(), R.layout.map_view_context_heading_marker, this);
        ((SimpleDraweeView) mo11150a(C3891l.drawee)).addOnLayoutChangeListener(new C4192c(this));
        this.f11222i = C4211b.f11294a;
        this.f11223j = 0.5f;
        this.f11224k = 0.5f;
        this.f11226m = C4193d.NONE;
        ImageView imageView = (ImageView) mo11150a(C3891l.pulse);
        C12932j.m33815a((Object) imageView, "pulse");
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            this.f11227n = (LayoutParams) layoutParams;
            this.f11228o = -16777216;
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(ColorStateList.valueOf(this.f11228o));
            ((ImageView) mo11150a(C3891l.pulse)).setImageDrawable(gradientDrawable);
            this.f11229p = gradientDrawable;
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(new Animator[]{ObjectAnimator.ofFloat((ImageView) mo11150a(C3891l.pulse), View.ALPHA, new float[]{0.0f, 0.5f, 0.0f}), ObjectAnimator.ofFloat((ImageView) mo11150a(C3891l.pulse), C1309a.f4895a, new float[]{0.0f, 1.0f})});
            animatorSet.setDuration(2500);
            animatorSet.setInterpolator(f11220u);
            animatorSet.addListener(new C4190a(this));
            animatorSet.addListener(new C4191b(this));
            this.f11230q = animatorSet;
            this.f11232s = new C4196g(this, context);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public SimpleDraweeView getMarkerShape() {
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) mo11150a(C3891l.drawee);
        if (simpleDraweeView != null) {
            return simpleDraweeView;
        }
        C12932j.m33814a();
        throw null;
    }
}
