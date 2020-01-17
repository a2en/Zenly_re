package app.zenly.locator.modals.p121o2;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import app.zenly.android.base.view.C1311b;
import app.zenly.android.base.widget.LinearLayout;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.locator.R;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.models.C2879d0;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.core.p072ui.view.C3137b;
import app.zenly.locator.core.p072ui.view.particles.C3182i;
import app.zenly.locator.core.p072ui.view.particles.C3182i.C3184b;
import app.zenly.locator.core.p072ui.view.particles.ParticleAnimation;
import app.zenly.locator.core.p072ui.view.particles.ParticleView;
import app.zenly.locator.core.util.C3200e0;
import app.zenly.locator.core.widget.C3275i;
import app.zenly.locator.p143s.p160v.p161b.C5540g;
import app.zenly.locator.p143s.p162w.p164d.C5572a;
import app.zenly.locator.p143s.p162w.p164d.C5572a.C5574b;
import p213co.znly.models.core.C7159m1;

/* renamed from: app.zenly.locator.modals.o2.b */
public class C4642b extends C4655h {

    /* renamed from: e */
    private final ImageView f12336e;

    /* renamed from: f */
    private final ImageView f12337f;

    /* renamed from: g */
    private final TextView f12338g;

    /* renamed from: h */
    private final TextView f12339h;

    /* renamed from: i */
    private final TextView f12340i;

    /* renamed from: j */
    private final LinearLayout f12341j;

    /* renamed from: k */
    private final TextView f12342k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final ParticleView f12343l;

    /* renamed from: m */
    private long f12344m;

    /* renamed from: n */
    private C3182i f12345n;

    /* renamed from: o */
    private final Runnable f12346o;

    /* renamed from: p */
    private final AnimatorSet f12347p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C5574b f12348q;

    /* renamed from: r */
    private boolean f12349r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f12350s;

    /* renamed from: t */
    private final AvatarLoader f12351t;

    /* renamed from: u */
    private final OnLayoutChangeListener f12352u = new C4643a();

    /* renamed from: app.zenly.locator.modals.o2.b$a */
    class C4643a implements OnLayoutChangeListener {
        C4643a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C4642b.this.f12343l.removeOnLayoutChangeListener(this);
            if (C4642b.this.f12350s) {
                C4642b bVar = C4642b.this;
                bVar.f12348q = C5572a.m15770a(bVar.f12343l, 10);
            }
        }
    }

    public C4642b(Context context) {
        super(context);
        this.f12351t = new C2477e(context);
        setClickable(true);
        setClipChildren(false);
        setClipToPadding(false);
        FrameLayout.inflate(getContext(), R.layout.modal_view_brump, this);
        this.f12337f = (ImageView) findViewById(R.id.avatar);
        this.f12338g = (TextView) findViewById(R.id.title);
        this.f12339h = (TextView) findViewById(R.id.wait);
        this.f12342k = (TextView) findViewById(R.id.btn_action);
        this.f12340i = (TextView) findViewById(R.id.friends_info);
        this.f12341j = (LinearLayout) findViewById(R.id.friends_avatars);
        this.f12336e = (ImageView) findViewById(R.id.btn_close);
        this.f12343l = (ParticleView) findViewById(R.id.particles);
        this.f12343l.addOnLayoutChangeListener(this.f12352u);
        this.f12346o = new C4641a(this);
        this.f12347p = (AnimatorSet) AnimatorInflater.loadAnimator(getContext(), R.animator.avatar_bounce);
        this.f12347p.setTarget(this.f12337f);
    }

    /* renamed from: c */
    public /* synthetic */ void mo11804c() {
        Point point = new Point(this.f12337f.getWidth() / 2, this.f12337f.getHeight() / 2);
        C1311b.m6281a(this.f12337f, point, this.f12343l);
        int width = (this.f12337f.getWidth() / 2) - C3200e0.m10183a(getContext(), 10);
        C3184b bVar = new C3184b(point, (this.f12337f.getWidth() / 2) + C3200e0.m10183a(getContext(), 20));
        bVar.mo9602b(width);
        bVar.mo9601a(width);
        this.f12345n = new C3182i(getContext(), bVar);
        this.f12343l.mo9542a((ParticleAnimation) this.f12345n);
        this.f12345n.mo9509q();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f12344m == 0) {
            this.f12344m = System.currentTimeMillis();
        }
        if (this.f12349r && this.f12345n == null) {
            long currentTimeMillis = 4000 - (System.currentTimeMillis() - this.f12344m);
            if (currentTimeMillis <= 0) {
                this.f12346o.run();
            } else {
                postDelayed(this.f12346o, currentTimeMillis);
            }
        }
        this.f12347p.start();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f12346o);
        this.f12347p.end();
        C5574b bVar = this.f12348q;
        if (bVar != null) {
            bVar.mo13186b();
            this.f12348q = null;
        }
        this.f12351t.clear(this.f12337f);
        super.onDetachedFromWindow();
    }

    public void setActionButtonText(int i) {
        setActionButtonText((CharSequence) getContext().getString(i));
    }

    public void setAvatar(C2879d0 d0Var) {
        this.f12351t.load(C2884f.m9353a(d0Var)).into(this.f12337f);
    }

    public void setCloseButtonClickListener(OnClickListener onClickListener) {
        this.f12336e.setOnClickListener(onClickListener);
    }

    public void setMutualFriends(C7159m1 m1Var) {
        this.f12340i.setText(C5540g.m15724b(this.f12340i.getContext(), m1Var.getFriendsList()));
        C3137b.m9865a(this.f12341j, m1Var.getFriendsList());
    }

    public void setPrimaryActionButtonClickListener(OnClickListener onClickListener) {
        this.f12342k.setOnClickListener(onClickListener);
    }

    public void setSecondaryActionButtonClickListener(OnClickListener onClickListener) {
    }

    public void setTitle(CharSequence charSequence) {
        this.f12338g.setText(charSequence);
    }

    public void setWaitVisible(boolean z) {
        this.f12339h.setVisibility(z ? 0 : 8);
    }

    /* renamed from: b */
    public void mo11803b() {
        this.f12349r = true;
    }

    public void setActionButtonText(CharSequence charSequence) {
        C3275i.m10386a(this.f12342k, charSequence);
    }

    /* renamed from: a */
    public void mo11802a() {
        this.f12350s = true;
    }
}
