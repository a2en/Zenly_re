package app.zenly.locator.map.marker;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0540a;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.base.model.AvatarLoader.Request.C1333c;
import app.zenly.android.feature.polenta.graphics.drawable.SmoothRectDrawable;
import app.zenly.locator.R;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.models.C2879d0;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.core.models.C2890k;
import app.zenly.locator.core.p072ui.view.particles.C3182i;
import app.zenly.locator.core.p072ui.view.particles.C3182i.C3184b;
import app.zenly.locator.core.p072ui.view.particles.ParticleAnimation;
import app.zenly.locator.core.p072ui.view.particles.ParticleView;
import app.zenly.locator.core.util.C3200e0;
import app.zenly.locator.map.marker.p115q0.C4244b;
import app.zenly.locator.map.marker.p115q0.C4247c;
import app.zenly.locator.map.marker.p115q0.C4254e;
import app.zenly.locator.map.p109i1.C4028l1;
import app.zenly.locator.map.view.SpeedAndTotsView;
import app.zenly.locator.map.view.p117d.C4387a;
import app.zenly.locator.p143s.p146j.C5432b;
import java.util.Objects;
import p214e.p228e.C7573b;
import p250f.p251a.p252a.p253a.p254d.C7657c;
import p250f.p251a.p252a.p263b.p264a.p269h.p270a.C7706a;
import p250f.p251a.p252a.p263b.p264a.p271i.C7707a;

public class AvatarMarkerView extends MarkerView {

    /* renamed from: m0 */
    private static final float f10841m0 = (1.0f / (Resources.getSystem().getDisplayMetrics().density * 72.0f));

    /* renamed from: n0 */
    private static final TimeInterpolator f10842n0 = C7657c.m18648d(2.5f);

    /* renamed from: o0 */
    private static ValueAnimator f10843o0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(1200);

    /* renamed from: p0 */
    private static ValueAnimator f10844p0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(1200);

    /* renamed from: q0 */
    private static ValueAnimator f10845q0 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(1200);

    /* renamed from: r0 */
    private static final C7573b<AvatarMarkerView> f10846r0 = new C7573b<>();

    /* renamed from: s0 */
    private static final C7573b<AvatarMarkerView> f10847s0 = new C7573b<>();

    /* renamed from: t0 */
    private static final C7573b<AvatarMarkerView> f10848t0 = new C7573b<>();

    /* renamed from: A */
    private boolean f10849A;

    /* renamed from: B */
    private boolean f10850B;

    /* renamed from: C */
    private long f10851C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public int f10852D;

    /* renamed from: E */
    private Bitmap f10853E;

    /* renamed from: F */
    private Bitmap f10854F;

    /* renamed from: G */
    private Bitmap f10855G;

    /* renamed from: H */
    private boolean f10856H;

    /* renamed from: I */
    private int f10857I = 0;

    /* renamed from: J */
    private ParticleView f10858J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public ViewGroup f10859K;

    /* renamed from: L */
    private ImageView f10860L;

    /* renamed from: M */
    private ImageView f10861M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public TextView f10862N;

    /* renamed from: O */
    private ImageView f10863O;

    /* renamed from: P */
    private ImageView f10864P;

    /* renamed from: Q */
    private ImageView f10865Q;

    /* renamed from: R */
    private SpeedAndTotsView f10866R;

    /* renamed from: S */
    private View f10867S;

    /* renamed from: T */
    private ValueAnimator f10868T;

    /* renamed from: U */
    private ValueAnimator f10869U;

    /* renamed from: V */
    private int f10870V;

    /* renamed from: W */
    private int f10871W;

    /* renamed from: a0 */
    private int f10872a0;

    /* renamed from: b0 */
    private int f10873b0;

    /* renamed from: c0 */
    private Point f10874c0;

    /* renamed from: d0 */
    private int f10875d0;

    /* renamed from: e0 */
    private C3182i f10876e0;

    /* renamed from: f0 */
    private C4387a f10877f0;

    /* renamed from: g0 */
    private Bitmap f10878g0;

    /* renamed from: h */
    private Drawable f10879h = null;

    /* renamed from: h0 */
    private C2890k f10880h0;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C4244b f10881i = new C4244b(this);

    /* renamed from: i0 */
    private C4247c f10882i0;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f10883j;

    /* renamed from: j0 */
    private C4254e f10884j0;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f10885k;

    /* renamed from: k0 */
    private AvatarLoader f10886k0;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f10887l;

    /* renamed from: l0 */
    private C2879d0 f10888l0;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public boolean f10889m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f10890n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f10891o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f10892p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public float f10893q = 1.0f;

    /* renamed from: r */
    private float f10894r = 1.0f;

    /* renamed from: s */
    private float f10895s = 1.0f;

    /* renamed from: t */
    private float f10896t = 1.0f;

    /* renamed from: u */
    private float f10897u;

    /* renamed from: v */
    private int f10898v;

    /* renamed from: w */
    private int f10899w;

    /* renamed from: x */
    private C4140e f10900x;

    /* renamed from: y */
    private Bitmap f10901y;

    /* renamed from: z */
    private double f10902z;

    /* renamed from: app.zenly.locator.map.marker.AvatarMarkerView$a */
    class C4136a extends C5432b {
        C4136a() {
        }

        public void onAnimationCancel(Animator animator) {
            super.onAnimationCancel(animator);
            AvatarMarkerView.this.f10893q = 1.0f;
        }
    }

    /* renamed from: app.zenly.locator.map.marker.AvatarMarkerView$b */
    class C4137b extends C5432b {
        C4137b() {
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            if (AvatarMarkerView.this.f10883j) {
                AvatarMarkerView.this.f10881i.mo11249b(100, new C4166b(this));
            }
        }

        /* renamed from: a */
        public /* synthetic */ void mo10857a() {
            if (AvatarMarkerView.this.f10883j) {
                AvatarMarkerView.this.f10885k = false;
                AvatarMarkerView.this.f10859K.setVisibility(4);
                AvatarMarkerView.this.m11934r();
            }
        }
    }

    /* renamed from: app.zenly.locator.map.marker.AvatarMarkerView$c */
    class C4138c extends C5432b {
        C4138c() {
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            AvatarMarkerView.this.f10862N.setVisibility(4);
        }
    }

    /* renamed from: app.zenly.locator.map.marker.AvatarMarkerView$d */
    static /* synthetic */ class C4139d {

        /* renamed from: a */
        static final /* synthetic */ int[] f10906a = new int[C4140e.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                app.zenly.locator.map.marker.AvatarMarkerView$e[] r0 = app.zenly.locator.map.marker.AvatarMarkerView.C4140e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10906a = r0
                int[] r0 = f10906a     // Catch:{ NoSuchFieldError -> 0x0014 }
                app.zenly.locator.map.marker.AvatarMarkerView$e r1 = app.zenly.locator.map.marker.AvatarMarkerView.C4140e.City     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f10906a     // Catch:{ NoSuchFieldError -> 0x001f }
                app.zenly.locator.map.marker.AvatarMarkerView$e r1 = app.zenly.locator.map.marker.AvatarMarkerView.C4140e.LocationDisabled     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f10906a     // Catch:{ NoSuchFieldError -> 0x002a }
                app.zenly.locator.map.marker.AvatarMarkerView$e r1 = app.zenly.locator.map.marker.AvatarMarkerView.C4140e.LowPrecision     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.map.marker.AvatarMarkerView.C4139d.<clinit>():void");
        }
    }

    /* renamed from: app.zenly.locator.map.marker.AvatarMarkerView$e */
    public enum C4140e {
        City,
        LocationDisabled,
        LowPrecision
    }

    static {
        f10844p0.setInterpolator(C7657c.m18649e());
        f10844p0.setRepeatCount(-1);
        f10844p0.addUpdateListener(C4177e.f11154a);
        f10843o0.setInterpolator(C7657c.m18649e());
        f10843o0.setRepeatCount(-1);
        f10843o0.setRepeatMode(1);
        f10843o0.addUpdateListener(C4170c.f11131a);
        f10845q0.setInterpolator(C7657c.m18645c());
        f10845q0.setRepeatCount(-1);
        f10845q0.addUpdateListener(C4182g.f11181a);
    }

    public AvatarMarkerView(Context context) {
        super(context);
        m11926n();
    }

    /* renamed from: o */
    private void m11928o() {
        this.f10886k0.load(C2884f.m9353a(this.f10888l0)).withPlaceholderStrategy(C1333c.DisplayName).withFillColor(R.color.transparent).withTextColor(this.f10873b0).into(this.f10861M);
    }

    /* renamed from: p */
    private void m11930p() {
        int i = this.f10857I;
        if (i == 4) {
            C4244b bVar = this.f10881i;
            bVar.mo11246a(bVar.mo11247b());
        } else if (i == 6) {
            C4244b bVar2 = this.f10881i;
            bVar2.mo11246a(bVar2.mo11250c());
        } else {
            C4244b bVar3 = this.f10881i;
            bVar3.mo11246a(bVar3.mo11243a());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m11932q() {
        int i = this.f10857I;
        if ((i == 4 || i == 5) && !this.f10883j && !this.f10887l) {
            m11914h();
            this.f10882i0.mo11258b(this.f10853E);
            this.f10882i0.mo11254a(this.f10854F);
            if (this.f10857I == 5) {
                this.f10882i0.mo11252a(this.f10902z, this.f10849A);
                this.f10882i0.mo11259b(true);
            } else {
                this.f10882i0.mo11259b(false);
            }
            this.f10882i0.mo11256b();
            return;
        }
        C4247c cVar = this.f10882i0;
        if (cVar != null) {
            cVar.mo11251a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public void m11934r() {
        C4247c cVar = this.f10882i0;
        if (cVar != null) {
            cVar.mo11255a(mo10979a() && (!this.f10883j || this.f10885k) && !this.f10887l);
        }
    }

    /* renamed from: s */
    private void m11936s() {
        if (this.f10863O != null) {
            int i = this.f10857I == 1 ? 0 : 4;
            if (this.f10863O.getVisibility() != i) {
                this.f10863O.setVisibility(i);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public void m11938t() {
        if (this.f10857I == 6 && !this.f10883j && !this.f10887l) {
            m11923l();
            this.f10884j0.mo11271a(this.f10855G);
            return;
        }
        C4254e eVar = this.f10884j0;
        if (eVar != null) {
            eVar.mo11269a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m11940u() {
        if (!(mo10979a() && !this.f10883j) || this.f10878g0 == null) {
            C4387a aVar = this.f10877f0;
            if (aVar != null) {
                aVar.mo11518a(null, null, null);
                return;
            }
            return;
        }
        if (this.f10877f0 == null) {
            m11919j();
            this.f10877f0 = new C4387a(this.f10858J, 0, new C4028l1(getContext()));
        }
        this.f10877f0.mo11518a(this.f10878g0, this.f10880h0, null);
        m11941v();
    }

    /* renamed from: v */
    private void m11941v() {
        C4387a aVar = this.f10877f0;
        if (aVar != null) {
            aVar.mo11517a(this.f10860L.getX() + (((float) this.f10860L.getWidth()) / 2.0f), this.f10860L.getY());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m11942w() {
        boolean z = true;
        boolean z2 = this.f10857I == 2;
        boolean z3 = this.f10857I == 3;
        SpeedAndTotsView speedAndTotsView = this.f10866R;
        boolean z4 = speedAndTotsView != null && speedAndTotsView.mo11501b();
        if (this.f10883j || (!z2 && !z3)) {
            z = false;
        }
        if (z4 != z) {
            if (z) {
                if (this.f10866R == null) {
                    this.f10866R = (SpeedAndTotsView) m11901a((int) R.id.speed_tots, "speed_tots");
                    this.f10866R.setVisibility(4);
                }
                this.f10866R.mo11503d();
            } else {
                this.f10866R.mo11499a();
            }
        }
        if (z) {
            int i = this.f10857I;
            if (i == 2) {
                this.f10866R.mo11500a(this.f10902z, this.f10849A, this.f10850B);
            } else if (i == 3) {
                this.f10866R.setTimeOnTheSpot(this.f10851C);
            }
        }
    }

    /* renamed from: x */
    private void m11943x() {
        ImageView imageView = this.f10865Q;
        if (imageView != null) {
            imageView.setScaleX(this.f10896t);
            this.f10865Q.setScaleY(this.f10896t);
            this.f10865Q.setAlpha(this.f10897u);
        }
    }

    /* renamed from: y */
    private void m11944y() {
        Drawable drawable = this.f10879h;
        if (drawable instanceof GradientDrawable) {
            ((GradientDrawable) drawable).setColor(this.f10870V);
        } else if (drawable instanceof SmoothRectDrawable) {
            ((SmoothRectDrawable) drawable).setColor(this.f10870V);
        }
        this.f10865Q.setImageDrawable(this.f10879h);
    }

    /* renamed from: z */
    private void m11945z() {
        float f = this.f10893q * this.f10894r * this.f10895s;
        if (Math.abs(f - getScaleX()) > f10841m0 || Math.abs(f - getScaleY()) > f10841m0) {
            setScaleX(f);
            setScaleY(f);
        }
        if (this.f10891o) {
            m11943x();
        }
    }

    public View getMarkerShape() {
        return this.f10860L;
    }

    public float getSignificantAreaRadius() {
        return (((float) this.f10860L.getWidth()) / 2.0f) * this.f10894r;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f10898v, 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void setBottomLeftDecoration(int i) {
        if (i != this.f10857I) {
            this.f10857I = i;
            m11936s();
            m11942w();
            m11932q();
            m11938t();
            m11930p();
        }
    }

    public void setHeadingDestination(Bitmap bitmap) {
        if (bitmap != this.f10854F) {
            this.f10854F = bitmap;
            m11932q();
        }
    }

    public void setHeadingTraject(Bitmap bitmap) {
        if (bitmap != this.f10853E) {
            this.f10853E = bitmap;
            m11932q();
        }
    }

    public void setIcon(Bitmap bitmap) {
        if (!Objects.equals(bitmap, this.f10901y)) {
            this.f10901y = bitmap;
            if (this.f10863O == null) {
                this.f10863O = (ImageView) m11901a((int) R.id.marker_icon, "icon");
                m11936s();
            }
            this.f10863O.setImageBitmap(bitmap);
        }
    }

    public void setNotifications(int i) {
        TextView textView = this.f10862N;
        boolean z = textView != null && textView.getVisibility() == 0;
        this.f10852D = i;
        if (i != 0 && !this.f10883j) {
            String a = C7706a.m18752a(getContext(), i, 9);
            m11917i();
            if (!TextUtils.equals(a, this.f10862N.getText())) {
                this.f10862N.setText(a);
            }
            if (!z) {
                this.f10862N.setVisibility(0);
                if (mo10979a()) {
                    ViewPropertyAnimator animate = this.f10862N.animate();
                    animate.cancel();
                    this.f10862N.setScaleX(0.01f);
                    this.f10862N.setScaleY(0.01f);
                    animate.scaleX(1.0f).scaleY(1.0f).setDuration(300).setInterpolator(f10842n0).setListener(null);
                } else {
                    this.f10862N.setScaleX(1.0f);
                    this.f10862N.setScaleY(1.0f);
                }
            }
        } else if (z) {
            ViewPropertyAnimator animate2 = this.f10862N.animate();
            animate2.cancel();
            animate2.scaleX(0.01f).scaleY(0.01f).setDuration(300).setInterpolator(C7657c.m18641a()).setListener(new C4138c());
        }
    }

    public void setPrecision(C4140e eVar) {
        if (eVar != this.f10900x) {
            this.f10900x = eVar;
            if (eVar == null) {
                ImageView imageView = this.f10864P;
                if (imageView != null) {
                    imageView.setImageDrawable(null);
                }
            } else {
                m11920k();
                int i = C4139d.f10906a[eVar.ordinal()];
                if (i == 1) {
                    this.f10864P.setImageResource(2131231270);
                } else if (i == 2) {
                    this.f10864P.setImageResource(R.drawable.ic_map_location_disabled);
                } else if (i == 3) {
                    this.f10864P.setImageResource(2131231272);
                }
            }
        }
    }

    public void setPrecisionVisible(boolean z) {
        if (z || this.f10864P != null) {
            int i = z ? 0 : 4;
            m11920k();
            if (this.f10864P.getVisibility() != i) {
                this.f10864P.setVisibility(i);
            }
        }
    }

    public void setScale(float f) {
        this.f10894r = f;
        m11945z();
    }

    public void setSleepingLocation(Bitmap bitmap) {
        if (this.f10855G != bitmap) {
            this.f10855G = bitmap;
            m11938t();
        }
    }

    public void setTimeOnTheSpot(long j) {
        if (j != this.f10851C) {
            this.f10851C = j;
            m11942w();
        }
    }

    public void setUser(C2879d0 d0Var) {
        this.f10888l0 = d0Var;
        m11928o();
    }

    /* renamed from: h */
    private void m11914h() {
        if (this.f10882i0 == null) {
            this.f10882i0 = new C4247c(this);
            this.f10882i0.mo11253a(this.f10870V);
            this.f10882i0.mo11257b(this.f10872a0);
        }
    }

    /* renamed from: i */
    private void m11917i() {
        if (this.f10862N == null) {
            this.f10862N = (TextView) m11901a((int) R.id.marker_notifications, "notifications");
        }
    }

    /* renamed from: j */
    private void m11919j() {
        if (this.f10858J == null) {
            this.f10858J = (ParticleView) m11901a((int) R.id.particles, "particles");
        }
    }

    /* renamed from: k */
    private void m11920k() {
        if (this.f10864P == null) {
            this.f10864P = (ImageView) m11901a((int) R.id.marker_precision, "precision");
        }
    }

    /* renamed from: l */
    private void m11923l() {
        if (this.f10884j0 == null) {
            this.f10884j0 = new C4254e(this);
            this.f10884j0.mo11270a(this.f10870V);
            this.f10884j0.mo11272b(this.f10872a0);
        }
    }

    /* renamed from: m */
    private void m11924m() {
        this.f10868T = ValueAnimator.ofFloat(new float[]{0.01f, 1.0f}).setDuration(300);
        this.f10868T.setInterpolator(C7657c.m18650f());
        this.f10868T.addUpdateListener(new C4161a(this));
        this.f10868T.addListener(new C4136a());
        this.f10869U = ValueAnimator.ofFloat(new float[]{1.0f, 1.2f, 1.0f}).setDuration(150);
        this.f10869U.setInterpolator(C7657c.m18643b());
        this.f10869U.addUpdateListener(new C4180f(this));
    }

    /* renamed from: n */
    private void m11926n() {
        this.f10886k0 = new C2477e(getContext());
        this.f10898v = getResources().getDimensionPixelSize(R.dimen.avatar_marker_container_size);
        this.f10899w = getResources().getDimensionPixelSize(R.dimen.marker_avatar_size);
        int i = this.f10898v;
        this.f10874c0 = new Point(i / 2, i / 2);
        this.f10875d0 = getResources().getDimensionPixelSize(R.dimen.avatar_marker_sparkles_radius);
        setLayerType(0, null);
        View.inflate(getContext(), R.layout.map_view_avatar_marker, this);
        this.f10859K = (ViewGroup) findViewById(R.id.marker_expanded);
        this.f10860L = (ImageView) findViewById(R.id.marker);
        this.f10861M = (ImageView) findViewById(R.id.avatar);
        this.f10860L.addOnLayoutChangeListener(new C4174d(this));
        m11924m();
        setPivotX((float) getResources().getDimensionPixelSize(R.dimen.avatar_marker_pivot_x));
        setPivotY((float) getResources().getDimensionPixelSize(R.dimen.avatar_marker_pivot_y));
        mo10825a((int) R.color.green, (int) R.color.green_dark);
    }

    /* renamed from: c */
    public void mo10835c(boolean z) {
        boolean z2 = true;
        int i = 0;
        if ((z && !this.f10883j && mo10979a()) != f10848t0.contains(this)) {
            z2 = false;
        }
        this.f10891o = z;
        if (!z2) {
            if (!z || this.f10883j || !mo10979a()) {
                m11937s(this);
            } else {
                if (this.f10865Q == null) {
                    this.f10865Q = (ImageView) m11901a((int) R.id.pulse, "pulse");
                    this.f10879h = this.f10865Q.getDrawable().mutate();
                    m11944y();
                }
                m11931p(this);
            }
        }
        if (this.f10865Q != null) {
            if (!z || this.f10883j || !mo10979a()) {
                i = 4;
            }
            if (this.f10865Q.getVisibility() != i) {
                this.f10865Q.setVisibility(i);
            }
        }
    }

    /* renamed from: d */
    public void mo10837d(boolean z) {
        this.f10892p = z;
        if (z && !this.f10883j && mo10979a() && this.f10876e0 == null && this.f10874c0 != null) {
            Context context = getContext();
            C3184b bVar = new C3184b(this.f10874c0, this.f10875d0);
            bVar.mo9602b(C3200e0.m10183a(getContext(), 18));
            bVar.mo9601a(C3200e0.m10183a(getContext(), 42));
            this.f10876e0 = new C3182i(context, bVar);
            m11919j();
            this.f10858J.mo9542a((ParticleAnimation) this.f10876e0);
            this.f10876e0.mo9509q();
        } else if (!z || this.f10883j || !mo10979a()) {
            C3182i iVar = this.f10876e0;
            if (iVar != null) {
                iVar.mo9493a(this.f10883j);
                this.f10876e0 = null;
            }
        }
    }

    /* renamed from: e */
    public void mo10838e() {
        mo10834c();
        this.f10886k0.clear(this.f10861M);
        this.f10893q = 1.0f;
        this.f10894r = 1.0f;
        this.f10895s = 1.0f;
        this.f10896t = 1.0f;
        this.f10897u = 0.0f;
        this.f10889m = false;
        this.f10890n = false;
        this.f10891o = false;
        this.f10892p = false;
        m11945z();
        this.f10859K.setScaleX(1.0f);
        this.f10859K.setScaleY(1.0f);
        TextView textView = this.f10862N;
        if (textView != null) {
            textView.setVisibility(4);
        }
        View view = this.f10867S;
        if (view != null) {
            view.setTranslationX(0.0f);
            this.f10867S.setTranslationY(0.0f);
            this.f10867S.setVisibility(4);
        }
        ImageView imageView = this.f10865Q;
        if (imageView != null) {
            imageView.setScaleX(this.f10896t);
            this.f10865Q.setScaleY(this.f10896t);
            this.f10865Q.setAlpha(this.f10897u);
        }
        mo10825a((int) R.color.green, (int) R.color.green_dark);
        mo10830a(false, false);
        setIcon(null);
        setPrecision(null);
        setNotifications(0);
        setBottomLeftDecoration(0);
        mo10824a(0.0d, false);
        mo10833b(false);
        setTimeOnTheSpot(0);
        setHeadingDestination(null);
        setSleepingLocation(null);
        mo10827a((Bitmap) null, (C2890k) null);
    }

    /* renamed from: f */
    public /* synthetic */ void mo10840f() {
        if (!this.f10883j) {
            this.f10859K.animate().cancel();
            this.f10859K.animate().setDuration(100).scaleX(1.0f).scaleY(1.0f).setListener(new C4268z(this));
        }
    }

    /* renamed from: g */
    public void mo10841g() {
        if (!this.f10868T.isStarted()) {
            if (mo10979a()) {
                this.f10868T.start();
            } else {
                this.f10856H = true;
            }
        }
    }

    /* renamed from: r */
    private static void m11935r(AvatarMarkerView avatarMarkerView) {
        synchronized (f10847s0) {
            f10847s0.remove(avatarMarkerView);
            if (f10847s0.size() == 0 && f10843o0.isStarted()) {
                f10843o0.cancel();
            }
            if (!avatarMarkerView.f10883j) {
                avatarMarkerView.f10859K.setScaleX(1.0f);
                avatarMarkerView.f10859K.setScaleY(1.0f);
            }
        }
    }

    /* renamed from: b */
    public /* synthetic */ void mo10832b(ValueAnimator valueAnimator) {
        this.f10895s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        m11945z();
    }

    /* renamed from: a */
    public /* synthetic */ void mo10828a(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        m11941v();
    }

    /* renamed from: p */
    private static void m11931p(AvatarMarkerView avatarMarkerView) {
        synchronized (f10848t0) {
            f10848t0.add(avatarMarkerView);
            if (f10848t0.size() == 1 && !f10845q0.isStarted()) {
                avatarMarkerView.m11943x();
                f10845q0.start();
            }
        }
    }

    /* renamed from: s */
    private static void m11937s(AvatarMarkerView avatarMarkerView) {
        synchronized (f10848t0) {
            f10848t0.remove(avatarMarkerView);
            if (f10848t0.size() == 0 && f10845q0.isStarted()) {
                f10845q0.cancel();
            }
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo10826a(ValueAnimator valueAnimator) {
        this.f10893q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        m11945z();
    }

    /* renamed from: b */
    public void mo10833b(boolean z) {
        if (this.f10850B != z) {
            this.f10850B = z;
            m11942w();
        }
    }

    /* renamed from: o */
    private static void m11929o(AvatarMarkerView avatarMarkerView) {
        synchronized (f10847s0) {
            f10847s0.add(avatarMarkerView);
            if (f10847s0.size() == 1 && !f10843o0.isStarted()) {
                f10843o0.start();
            }
        }
    }

    /* renamed from: t */
    private static void m11939t(AvatarMarkerView avatarMarkerView) {
        synchronized (f10846r0) {
            f10846r0.remove(avatarMarkerView);
            if (f10846r0.size() == 0 && f10844p0.isStarted()) {
                f10844p0.cancel();
            }
        }
    }

    /* renamed from: a */
    public void mo10825a(int i, int i2) {
        if (i != this.f10871W || i2 != this.f10873b0) {
            this.f10871W = i;
            this.f10873b0 = i2;
            this.f10870V = C0540a.m2536a(getContext(), i);
            this.f10872a0 = C0540a.m2536a(getContext(), i2);
            this.f10860L.setImageTintList(ColorStateList.valueOf(this.f10870V));
            if (this.f10865Q != null) {
                m11944y();
            }
            this.f10881i.mo11244a(this.f10870V);
            this.f10881i.mo11248b(this.f10872a0);
            C4247c cVar = this.f10882i0;
            if (cVar != null) {
                cVar.mo11253a(this.f10870V);
                this.f10882i0.mo11257b(this.f10872a0);
            }
            C4254e eVar = this.f10884j0;
            if (eVar != null) {
                eVar.mo11270a(this.f10870V);
                this.f10884j0.mo11272b(this.f10872a0);
            }
            if (this.f10888l0 != null) {
                m11928o();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo10831b() {
        if (this.f10890n) {
            mo10829a(true);
        }
        if (this.f10889m) {
            mo10839e(true);
        }
        if (this.f10891o) {
            mo10835c(true);
        }
        if (this.f10892p) {
            mo10837d(true);
        }
        m11940u();
        m11934r();
        if (this.f10856H) {
            this.f10856H = false;
            mo10841g();
        }
    }

    /* renamed from: q */
    private static void m11933q(AvatarMarkerView avatarMarkerView) {
        synchronized (f10846r0) {
            f10846r0.add(avatarMarkerView);
            if (f10846r0.size() == 1 && !f10844p0.isStarted()) {
                f10844p0.start();
            }
        }
    }

    /* renamed from: d */
    public void mo10836d() {
        if (isAttachedToWindow() && !this.f10869U.isStarted()) {
            this.f10869U.start();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo10834c() {
        ValueAnimator valueAnimator = this.f10868T;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        ValueAnimator valueAnimator2 = this.f10869U;
        if (valueAnimator2 != null) {
            valueAnimator2.end();
        }
        if (this.f10891o) {
            m11937s(this);
        }
        C3182i iVar = this.f10876e0;
        if (iVar != null) {
            iVar.mo9493a(true);
            this.f10876e0 = null;
        }
        m11935r(this);
        m11939t(this);
        m11940u();
        m11934r();
    }

    /* renamed from: d */
    static /* synthetic */ void m11909d(ValueAnimator valueAnimator) {
        float f;
        float f2;
        float animatedFraction = valueAnimator.getAnimatedFraction() * 2.0f;
        if (animatedFraction <= 1.0f) {
            f2 = 1.0f - (animatedFraction * 0.08f);
            f = 1.0f - animatedFraction;
        } else {
            f = animatedFraction - 1.0f;
            f2 = 1.0f - ((1.0f - f) * 0.08f);
        }
        float f3 = 1.0f - (f * 0.08f);
        for (int i = 0; i < f10847s0.size(); i++) {
            AvatarMarkerView avatarMarkerView = (AvatarMarkerView) f10847s0.mo19488c(i);
            if (!avatarMarkerView.f10883j) {
                avatarMarkerView.f10859K.setScaleX(f2);
                avatarMarkerView.f10859K.setScaleY(f3);
            }
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m11906c(ValueAnimator valueAnimator) {
        double animatedFraction = (double) (valueAnimator.getAnimatedFraction() * 6.2831855f);
        double cos = Math.cos(animatedFraction);
        double sin = Math.sin(animatedFraction);
        for (int i = 0; i < f10846r0.size(); i++) {
            AvatarMarkerView avatarMarkerView = (AvatarMarkerView) f10846r0.mo19488c(i);
            View view = avatarMarkerView.f10867S;
            if (view != null) {
                view.setTranslationX((float) ((((double) avatarMarkerView.f10899w) * cos) / 2.0d));
                avatarMarkerView.f10867S.setTranslationY((float) ((((double) avatarMarkerView.f10899w) * sin) / 2.0d));
            }
        }
    }

    /* renamed from: a */
    public void mo10824a(double d, boolean z) {
        if (d != this.f10902z || z != this.f10849A) {
            this.f10902z = d;
            this.f10849A = z;
            m11942w();
            m11932q();
        }
    }

    /* renamed from: a */
    private View m11901a(int i, String str) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append("map:avatarMarkerView:inflate:");
            sb.append(str);
            C7707a.m18761b(sb.toString());
            return ((ViewStub) findViewById(i)).inflate();
        } finally {
            C7707a.m18759a();
        }
    }

    /* renamed from: a */
    public void mo10829a(boolean z) {
        boolean z2 = true;
        if ((z && !this.f10883j && mo10979a()) != f10847s0.contains(this)) {
            z2 = false;
        }
        this.f10890n = z;
        if (z2) {
            return;
        }
        if (!z || this.f10883j || !mo10979a()) {
            m11935r(this);
        } else {
            m11929o(this);
        }
    }

    /* renamed from: e */
    public void mo10839e(boolean z) {
        boolean z2 = true;
        int i = 0;
        if ((z && !this.f10883j && mo10979a()) != f10846r0.contains(this)) {
            z2 = false;
        }
        this.f10889m = z;
        if (!z2) {
            if (!z || this.f10883j || !mo10979a()) {
                m11939t(this);
            } else {
                if (this.f10867S == null) {
                    this.f10867S = m11901a((int) R.id.marker_spinner, "spinner");
                }
                m11933q(this);
            }
        }
        if (this.f10867S != null) {
            if (!z || this.f10883j || !mo10979a()) {
                i = 4;
            }
            if (this.f10867S.getVisibility() != i) {
                this.f10867S.setVisibility(i);
            }
        }
    }

    /* renamed from: a */
    public void mo10830a(boolean z, boolean z2) {
        if (z != this.f10883j) {
            this.f10883j = z;
            boolean z3 = this.f10883j;
            this.f10885k = z3;
            this.f10887l = !z3;
            this.f10859K.animate().cancel();
            if (z) {
                mo10835c(this.f10891o);
                mo10829a(this.f10890n);
                mo10839e(this.f10889m);
                mo10837d(this.f10892p);
                setNotifications(this.f10852D);
                m11942w();
                m11932q();
                m11938t();
                m11940u();
                if (getVisibility() == 8 || !z2 || !mo10979a()) {
                    this.f10885k = false;
                    this.f10859K.setVisibility(4);
                    this.f10859K.setScaleX(0.0f);
                    this.f10859K.setScaleY(0.0f);
                    this.f10881i.mo11249b(0, null);
                    m11934r();
                } else {
                    m11934r();
                    this.f10859K.animate().setDuration(100).scaleX(0.0f).scaleY(0.0f).setListener(new C4137b());
                }
            } else {
                this.f10859K.setVisibility(0);
                if (getVisibility() == 8 || !z2 || !mo10979a() || this.f10881i == null) {
                    this.f10887l = false;
                    this.f10881i.mo11245a(0, null);
                    this.f10859K.setScaleX(1.0f);
                    this.f10859K.setScaleY(1.0f);
                    mo10835c(this.f10891o);
                    mo10829a(this.f10890n);
                    mo10839e(this.f10889m);
                    mo10837d(this.f10892p);
                    setNotifications(this.f10852D);
                    m11942w();
                    m11932q();
                    m11938t();
                    m11940u();
                    m11934r();
                } else {
                    m11934r();
                    this.f10881i.mo11245a(100, new C4186h(this));
                }
            }
        }
    }

    /* renamed from: e */
    static /* synthetic */ void m11910e(ValueAnimator valueAnimator) {
        float animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
        float f = 0.9f * animatedFraction;
        float f2 = 1.0f - (animatedFraction * 0.31f);
        for (int i = 0; i < f10848t0.size(); i++) {
            AvatarMarkerView avatarMarkerView = (AvatarMarkerView) f10848t0.mo19488c(i);
            avatarMarkerView.f10897u = f;
            avatarMarkerView.f10896t = f2;
            avatarMarkerView.m11943x();
        }
    }

    /* renamed from: a */
    public void mo10827a(Bitmap bitmap, C2890k kVar) {
        this.f10878g0 = bitmap;
        this.f10880h0 = kVar;
        m11940u();
    }
}
