package app.zenly.locator.map.marker;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.C0540a;
import app.zenly.android.feature.base.model.AvatarLoader.Request.C1332b;
import app.zenly.android.feature.base.model.AvatarLoader.Request.C1333c;
import app.zenly.locator.R;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.models.C2879d0;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.core.p072ui.view.particles.C3182i;
import app.zenly.locator.core.p072ui.view.particles.C3182i.C3184b;
import app.zenly.locator.core.p072ui.view.particles.ParticleAnimation;
import app.zenly.locator.core.p072ui.view.particles.ParticleView;
import app.zenly.locator.core.util.C3200e0;
import app.zenly.locator.map.view.FlameView;
import app.zenly.locator.p143s.p146j.C5432b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p250f.p251a.p252a.p253a.p254d.C7657c;
import p250f.p251a.p252a.p263b.p264a.p269h.p270a.C7706a;

public class GatheringMarkerView extends MarkerView {

    /* renamed from: T */
    private static final TimeInterpolator f10920T = C7657c.m18648d(2.5f);
    /* access modifiers changed from: private */

    /* renamed from: A */
    public FrameLayout f10921A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public ImageView f10922B;

    /* renamed from: C */
    private GradientDrawable f10923C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public int f10924D = -1;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public Member f10925E;

    /* renamed from: F */
    private Bitmap f10926F;

    /* renamed from: G */
    private int f10927G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public boolean f10928H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public int f10929I = 0;

    /* renamed from: J */
    private C4149g f10930J;

    /* renamed from: K */
    private boolean f10931K;

    /* renamed from: L */
    private Point f10932L;

    /* renamed from: M */
    private int f10933M;

    /* renamed from: N */
    private C3182i f10934N;

    /* renamed from: O */
    private boolean f10935O;
    /* access modifiers changed from: private */

    /* renamed from: P */
    public boolean f10936P;

    /* renamed from: Q */
    private final C1332b f10937Q = new C4142a();
    /* access modifiers changed from: private */

    /* renamed from: R */
    public final OnUpdateListener f10938R = new C4236o(this);

    /* renamed from: S */
    private final Runnable f10939S = new C4143b();

    /* renamed from: h */
    private C2477e f10940h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final List<Member> f10941i = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Set<View> f10942j = new HashSet();

    /* renamed from: k */
    private int f10943k;

    /* renamed from: l */
    private int f10944l;

    /* renamed from: m */
    private int f10945m;

    /* renamed from: n */
    private TextView f10946n;

    /* renamed from: o */
    private TextView f10947o;

    /* renamed from: p */
    private ImageView f10948p;

    /* renamed from: q */
    private ParticleView f10949q;

    /* renamed from: r */
    private FrameLayout f10950r;

    /* renamed from: s */
    private FrameLayout f10951s;

    /* renamed from: t */
    private AppCompatImageView f10952t;

    /* renamed from: u */
    private ImageView f10953u;

    /* renamed from: v */
    private ImageView f10954v;

    /* renamed from: w */
    private ImageView f10955w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public FlameView f10956x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public ObjectAnimator f10957y;

    /* renamed from: z */
    private FrameLayout f10958z;

    public static final class Member {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C2879d0 f10959a;

        /* renamed from: b */
        private OnUpdateListener f10960b = null;

        public interface OnUpdateListener {
            void onUpdate(C2879d0 d0Var);
        }

        public Member(C2879d0 d0Var) {
            this.f10959a = d0Var;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Member.class != obj.getClass()) {
                return false;
            }
            return this.f10959a.mo8945g().equals(((Member) obj).f10959a.mo8945g());
        }

        public int hashCode() {
            return this.f10959a.mo8945g().hashCode();
        }

        /* renamed from: a */
        public void mo10894a(C2879d0 d0Var) {
            this.f10959a = d0Var;
            OnUpdateListener onUpdateListener = this.f10960b;
            if (onUpdateListener != null) {
                onUpdateListener.onUpdate(d0Var);
            }
        }

        /* renamed from: a */
        public C2879d0 mo10893a() {
            return this.f10959a;
        }

        /* renamed from: a */
        public void mo10895a(OnUpdateListener onUpdateListener) {
            this.f10960b = onUpdateListener;
        }
    }

    /* renamed from: app.zenly.locator.map.marker.GatheringMarkerView$a */
    class C4142a extends C1332b {
        C4142a() {
        }

        /* renamed from: a */
        public void mo6544a(Bitmap bitmap) {
            GatheringMarkerView.this.f10956x.setAvatar(bitmap);
        }

        /* renamed from: b */
        public void mo6545b() {
        }

        /* renamed from: a */
        public void mo6543a() {
            GatheringMarkerView.this.f10956x.setAvatar(null);
        }
    }

    /* renamed from: app.zenly.locator.map.marker.GatheringMarkerView$b */
    class C4143b implements Runnable {
        C4143b() {
        }

        public void run() {
            if (!GatheringMarkerView.this.f10941i.isEmpty()) {
                GatheringMarkerView.this.f10924D = GatheringMarkerView.this.f10924D + 1;
                if (GatheringMarkerView.this.f10924D > GatheringMarkerView.this.f10941i.size() - 1) {
                    GatheringMarkerView.this.f10924D = 0;
                }
                if (GatheringMarkerView.this.f10925E != null) {
                    GatheringMarkerView.this.f10925E.mo10895a((OnUpdateListener) null);
                }
                GatheringMarkerView gatheringMarkerView = GatheringMarkerView.this;
                gatheringMarkerView.f10925E = (Member) gatheringMarkerView.f10941i.get(GatheringMarkerView.this.f10924D);
                GatheringMarkerView.this.f10925E.mo10895a(GatheringMarkerView.this.f10938R);
                GatheringMarkerView gatheringMarkerView2 = GatheringMarkerView.this;
                gatheringMarkerView2.m11986a(gatheringMarkerView2.f10925E.mo10893a());
                if (GatheringMarkerView.this.mo10979a()) {
                    GatheringMarkerView.this.postDelayed(this, 1000);
                }
            }
        }
    }

    /* renamed from: app.zenly.locator.map.marker.GatheringMarkerView$c */
    class C4144c extends C5432b {

        /* renamed from: b */
        final /* synthetic */ View f10963b;

        C4144c(View view) {
            this.f10963b = view;
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            if (!GatheringMarkerView.this.f10942j.contains(this.f10963b)) {
                this.f10963b.setVisibility(4);
            }
        }
    }

    /* renamed from: app.zenly.locator.map.marker.GatheringMarkerView$d */
    class C4145d extends C5432b {
        C4145d() {
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            GatheringMarkerView.this.f10936P = false;
            GatheringMarkerView.this.m12007k();
        }
    }

    /* renamed from: app.zenly.locator.map.marker.GatheringMarkerView$e */
    class C4146e extends C5432b {
        C4146e() {
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            if (GatheringMarkerView.this.f10928H) {
                GatheringMarkerView.this.f10921A.setVisibility(4);
                GatheringMarkerView.this.f10922B.setVisibility(0);
                GatheringMarkerView.this.f10922B.animate().cancel();
                GatheringMarkerView.this.f10922B.animate().setDuration(100).alpha(1.0f).setListener(null);
            }
        }
    }

    /* renamed from: app.zenly.locator.map.marker.GatheringMarkerView$f */
    class C4147f extends C5432b {

        /* renamed from: app.zenly.locator.map.marker.GatheringMarkerView$f$a */
        class C4148a extends C5432b {
            C4148a() {
            }

            /* renamed from: a */
            public void mo7336a(Animator animator, boolean z) {
                GatheringMarkerView.this.m12007k();
            }
        }

        C4147f() {
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            if (!GatheringMarkerView.this.f10928H) {
                GatheringMarkerView.this.f10922B.setVisibility(4);
                GatheringMarkerView.this.f10921A.setVisibility(0);
                GatheringMarkerView.this.f10921A.animate().cancel();
                GatheringMarkerView.this.f10921A.animate().setDuration(100).scaleX(1.0f).scaleY(1.0f).setListener(new C4148a());
                if (GatheringMarkerView.this.f10929I == 2) {
                    GatheringMarkerView.this.m12005j();
                    GatheringMarkerView.this.f10957y.start();
                }
            }
        }
    }

    /* renamed from: app.zenly.locator.map.marker.GatheringMarkerView$g */
    public enum C4149g {
        STANDARD(R.color.orange_light, R.color.orange, R.color.orange_dark, R.color.orange, 2131231668, R.color.green, R.color.green_dark, R.color.green),
        SLEEP(R.color.cerulean_blue, R.color.cerulean_blue_dark, R.color.yellow_light, R.color.cerulean_blue, 2131231667, R.color.cerulean_blue, R.color.yellow_light, R.color.cerulean_blue);
        

        /* renamed from: e */
        final int f10972e;

        /* renamed from: f */
        final int f10973f;

        /* renamed from: g */
        final int f10974g;

        /* renamed from: h */
        final int f10975h;

        /* renamed from: i */
        final int f10976i;

        /* renamed from: j */
        final int f10977j;

        /* renamed from: k */
        final int f10978k;

        /* renamed from: l */
        final int f10979l;

        private C4149g(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f10972e = i;
            this.f10973f = i2;
            this.f10974g = i3;
            this.f10975h = i4;
            this.f10976i = i5;
            this.f10977j = i6;
            this.f10978k = i7;
            this.f10979l = i8;
        }
    }

    public GatheringMarkerView(Context context) {
        super(context);
        m11998g();
    }

    public C4149g getColors() {
        return this.f10930J;
    }

    public FlameView getFlameView() {
        return this.f10956x;
    }

    public List<Member> getMembers() {
        return new ArrayList(this.f10941i);
    }

    public float getSignificantAreaRadius() {
        return (((float) this.f10952t.getWidth()) / 2.0f) * Math.max(getScaleX(), getScaleY());
    }

    public int getStyle() {
        return this.f10929I;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f10943k, 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public void setColors(C4149g gVar) {
        if (gVar != this.f10930J) {
            this.f10930J = gVar;
            this.f10956x.setInsideColor(C0540a.m2536a(getContext(), this.f10930J.f10972e));
            this.f10956x.setOutsideColor(C0540a.m2536a(getContext(), this.f10930J.f10973f));
            this.f10951s.setBackgroundResource(gVar.f10976i);
            this.f10952t.setImageTintList(ColorStateList.valueOf(C0540a.m2536a(getContext(), this.f10930J.f10977j)));
            Member member = this.f10925E;
            if (member != null) {
                m11986a(member.f10959a);
            }
            m12003i();
        }
    }

    public void setIcon(Bitmap bitmap) {
        if (!Objects.equals(bitmap, this.f10926F)) {
            this.f10926F = bitmap;
            if (bitmap == null) {
                m11984a((View) this.f10948p, false);
            } else {
                this.f10948p.setImageBitmap(bitmap);
                m11984a((View) this.f10948p, true);
            }
        }
    }

    public void setMembers(List<Member> list) {
        this.f10941i.clear();
        if (!list.isEmpty()) {
            this.f10941i.addAll(list);
            m12009l();
        } else {
            m12011m();
            this.f10925E = null;
            m11997f();
        }
        m12001h();
    }

    public void setNotifications(int i) {
        if (i != this.f10927G) {
            this.f10927G = i;
            if (i == 0) {
                m11984a((View) this.f10947o, false);
            } else {
                String a = C7706a.m18752a(getContext(), i, 9);
                if (!TextUtils.equals(a, this.f10947o.getText())) {
                    this.f10947o.setText(a);
                }
                m11984a((View) this.f10947o, true);
            }
        }
    }

    public void setStyle(int i) {
        if (i != this.f10929I) {
            this.f10929I = i;
            if (i == 0) {
                FrameLayout frameLayout = this.f10958z;
                frameLayout.setPaddingRelative(frameLayout.getPaddingStart(), this.f10958z.getPaddingTop(), this.f10958z.getPaddingEnd(), this.f10944l);
            } else {
                FrameLayout frameLayout2 = this.f10958z;
                frameLayout2.setPaddingRelative(frameLayout2.getPaddingStart(), this.f10958z.getPaddingTop(), this.f10958z.getPaddingEnd(), this.f10945m);
            }
            if (i == 2) {
                this.f10950r.setVisibility(4);
                this.f10951s.setVisibility(4);
                this.f10956x.setVisibility(0);
                this.f10956x.setSpiralPercentage(this.f10931K ? 1.0f : 0.0f);
                m12005j();
            } else {
                this.f10956x.mo11534g();
                this.f10956x.setAvatar(null);
                this.f10956x.setVisibility(4);
                if (i == 1) {
                    this.f10950r.setVisibility(4);
                    this.f10951s.setVisibility(0);
                } else {
                    this.f10950r.setVisibility(0);
                    this.f10951s.setVisibility(4);
                }
            }
            m11997f();
            Member member = this.f10925E;
            if (member != null) {
                m11986a(member.f10959a);
            }
            m12003i();
        }
    }

    public void setUuid(String str) {
    }

    /* renamed from: b */
    private void m11991b(C2879d0 d0Var, int i, ImageView imageView, C1332b bVar) {
        if (d0Var == null) {
            m11985a(imageView, bVar);
        } else {
            m11987a(d0Var, i, imageView, bVar);
        }
    }

    /* renamed from: f */
    private void m11997f() {
        m11985a(this.f10955w, this.f10937Q);
        m11985a(this.f10954v, (C1332b) null);
        m11985a(this.f10953u, (C1332b) null);
    }

    @SuppressLint({"CutPasteId"})
    /* renamed from: g */
    private void m11998g() {
        this.f10940h = new C2477e(getContext());
        this.f10943k = getResources().getDimensionPixelSize(R.dimen.gathering_marker_size);
        int i = this.f10943k;
        this.f10932L = new Point(i / 2, i / 2);
        this.f10933M = this.f10943k / 2;
        setPivotX((float) getResources().getDimensionPixelSize(R.dimen.gathering_marker_pivot_x));
        setPivotY((float) getResources().getDimensionPixelSize(R.dimen.gathering_marker_pivot_y));
        this.f10944l = getResources().getDimensionPixelSize(R.dimen.gathering_marker_contextuals_bottom_normal);
        this.f10945m = getResources().getDimensionPixelSize(R.dimen.gathering_marker_contextuals_bottom_flame);
        View.inflate(getContext(), R.layout.map_view_gathering_marker, this);
        this.f10949q = (ParticleView) findViewById(R.id.particles);
        this.f10921A = (FrameLayout) findViewById(R.id.marker_expanded);
        this.f10922B = (ImageView) findViewById(R.id.marker_collapsed);
        this.f10958z = (FrameLayout) this.f10921A.findViewById(R.id.contextuals_container);
        this.f10946n = (TextView) this.f10921A.findViewById(R.id.counter);
        this.f10947o = (TextView) this.f10921A.findViewById(R.id.notifications);
        this.f10948p = (ImageView) this.f10921A.findViewById(R.id.icon);
        this.f10950r = (FrameLayout) this.f10921A.findViewById(R.id.normal_marker);
        this.f10952t = (AppCompatImageView) this.f10921A.findViewById(R.id.normal_marker_shape);
        this.f10951s = (FrameLayout) this.f10921A.findViewById(R.id.static_flame_marker);
        this.f10956x = (FlameView) this.f10921A.findViewById(R.id.shader_flame_marker);
        this.f10953u = (ImageView) findViewById(R.id.normal_marker_avatar);
        this.f10954v = (ImageView) findViewById(R.id.static_flame_marker_avatar);
        this.f10955w = (ImageView) findViewById(R.id.shader_flame_marker_avatar);
        this.f10957y = ObjectAnimator.ofFloat(this.f10956x, FlameView.f11676y, new float[]{0.0f, 1.0f}).setDuration(300);
        this.f10923C = new GradientDrawable();
        this.f10923C.setShape(1);
        this.f10923C.setStroke(getResources().getDimensionPixelSize(R.dimen.stroke_50), -1);
        this.f10922B.setImageDrawable(this.f10923C);
        setColors(C4149g.STANDARD);
    }

    /* renamed from: h */
    private void m12001h() {
        this.f10946n.setText(String.valueOf(this.f10941i.size()));
    }

    /* renamed from: i */
    private void m12003i() {
        if (this.f10929I == 0) {
            this.f10923C.setColor(C0540a.m2536a(getContext(), this.f10930J.f10979l));
        } else {
            this.f10923C.setColor(C0540a.m2536a(getContext(), this.f10930J.f10975h));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m12005j() {
        if (this.f10929I == 2 && !this.f10928H && mo10979a() && !this.f10956x.mo11532b()) {
            this.f10956x.mo11533f();
        } else if (this.f10956x.mo11532b()) {
            this.f10956x.mo11534g();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m12007k() {
        if (this.f10931K && !this.f10928H && !this.f10936P && mo10979a() && this.f10934N == null) {
            Context context = getContext();
            C3184b bVar = new C3184b(this.f10932L, this.f10933M);
            bVar.mo9602b(C3200e0.m10183a(getContext(), 18));
            bVar.mo9601a(C3200e0.m10183a(getContext(), 42));
            this.f10934N = new C3182i(context, bVar);
            this.f10949q.mo9542a((ParticleAnimation) this.f10934N);
            this.f10934N.mo9509q();
        } else if (!this.f10931K || this.f10928H || this.f10936P || !mo10979a()) {
            C3182i iVar = this.f10934N;
            if (iVar != null) {
                iVar.mo9493a(this.f10928H || this.f10936P);
                this.f10934N = null;
            }
        }
        this.f10956x.setSpiralPercentage(this.f10931K ? 1.0f : 0.0f);
    }

    /* renamed from: l */
    private void m12009l() {
        removeCallbacks(this.f10939S);
        this.f10939S.run();
    }

    /* renamed from: m */
    private void m12011m() {
        removeCallbacks(this.f10939S);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo10834c() {
        m12011m();
        m12005j();
        m12007k();
    }

    /* renamed from: d */
    public void mo10881d() {
        this.f10941i.clear();
        m12011m();
        m12001h();
        m11997f();
        mo10877a(false);
        setNotifications(0);
        setIcon(null);
        mo10878a(false, false);
    }

    /* renamed from: e */
    public void mo10882e() {
        if (!this.f10928H && !this.f10936P) {
            if (!mo10979a()) {
                this.f10935O = true;
                return;
            }
            this.f10936P = true;
            m12007k();
            this.f10921A.animate().cancel();
            this.f10921A.setScaleX(0.01f);
            this.f10921A.setScaleY(0.01f);
            this.f10921A.animate().setDuration(300).scaleX(1.0f).scaleY(1.0f).setListener(new C4145d()).start();
            if (this.f10929I == 2) {
                this.f10957y.start();
            }
        }
    }

    /* renamed from: b */
    public void mo10880b(Member member) {
        this.f10941i.remove(member);
        if (this.f10941i.size() == 0) {
            m12011m();
            this.f10925E = null;
            m11997f();
        }
        m12001h();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m11986a(C2879d0 d0Var) {
        int i = this.f10929I;
        if (i == 1) {
            m11991b(d0Var, this.f10930J.f10974g, this.f10954v, null);
        } else if (i != 2) {
            m11991b(d0Var, this.f10930J.f10978k, this.f10953u, null);
        } else {
            m11991b(d0Var, this.f10930J.f10974g, this.f10955w, this.f10937Q);
        }
    }

    /* renamed from: a */
    private void m11987a(C2879d0 d0Var, int i, ImageView imageView, C1332b bVar) {
        this.f10940h.load(C2884f.m9353a(d0Var)).withPlaceholderStrategy(C1333c.DisplayName).withFillColor(R.color.transparent).withTextColor(i).into(imageView, bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo10831b() {
        m12009l();
        m12005j();
        m12007k();
        if (this.f10935O) {
            this.f10935O = false;
            mo10882e();
        }
    }

    /* renamed from: a */
    private void m11985a(ImageView imageView, C1332b bVar) {
        this.f10940h.clear(imageView);
        imageView.setImageDrawable(null);
        if (bVar != null) {
            bVar.mo6543a();
        }
    }

    /* renamed from: a */
    public void mo10879a(float[] fArr) {
        View view;
        if (this.f10929I == 0) {
            view = this.f10953u;
        } else {
            view = this.f10954v;
        }
        fArr[0] = ((float) view.getWidth()) / 2.0f;
        fArr[1] = ((float) view.getHeight()) / 2.0f;
        while (view != this) {
            View view2 = (View) view.getParent();
            fArr[0] = fArr[0] + view.getX() + ((float) view2.getPaddingLeft());
            fArr[1] = fArr[1] + view.getY() + ((float) view2.getPaddingTop());
            view = view2;
        }
        getMatrix().mapPoints(fArr);
    }

    /* renamed from: a */
    public void mo10876a(Member member) {
        this.f10941i.add(member);
        if (this.f10941i.size() == 1) {
            m12009l();
        }
        m12001h();
    }

    /* renamed from: a */
    private void m11984a(View view, boolean z) {
        boolean contains = this.f10942j.contains(view);
        ViewPropertyAnimator animate = view.animate();
        if (contains && !z) {
            animate.cancel();
            this.f10942j.remove(view);
            if (!mo10979a() || this.f10928H) {
                view.setScaleX(0.01f);
                view.setScaleY(0.01f);
                view.setVisibility(4);
                return;
            }
            animate.scaleX(0.01f).scaleY(0.01f).setDuration(300).setInterpolator(C7657c.m18641a()).setListener(new C4144c(view));
        } else if (!contains && z) {
            animate.cancel();
            this.f10942j.add(view);
            view.setVisibility(0);
            if (!mo10979a() || this.f10928H) {
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                return;
            }
            animate.scaleX(1.0f).scaleY(1.0f).setDuration(300).setInterpolator(f10920T).setListener(null);
        }
    }

    /* renamed from: a */
    public void mo10877a(boolean z) {
        this.f10931K = z;
        m12007k();
    }

    /* renamed from: a */
    public void mo10878a(boolean z, boolean z2) {
        if (z != this.f10928H) {
            this.f10928H = z;
            this.f10921A.animate().cancel();
            this.f10922B.animate().cancel();
            if (z) {
                m12005j();
                m12007k();
                if (getVisibility() == 8 || !z2) {
                    this.f10921A.setVisibility(4);
                    this.f10921A.setScaleX(0.01f);
                    this.f10921A.setScaleY(0.01f);
                    this.f10922B.setAlpha(1.0f);
                    this.f10922B.setVisibility(0);
                } else {
                    this.f10921A.animate().setDuration(100).scaleX(0.01f).scaleY(0.01f).setListener(new C4146e());
                }
            } else if (getVisibility() == 8 || !z2) {
                this.f10922B.setAlpha(0.0f);
                this.f10922B.setVisibility(4);
                this.f10921A.setScaleX(1.0f);
                this.f10921A.setScaleY(1.0f);
                this.f10921A.setVisibility(0);
                m12005j();
                m12007k();
            } else {
                this.f10922B.animate().setDuration(100).alpha(0.0f).setListener(new C4147f());
            }
        }
    }
}
