package app.zenly.locator.chat.emojis;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import app.zenly.android.base.view.C1311b;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.base.model.AvatarLoader.Request;
import app.zenly.locator.C3891l;
import app.zenly.locator.chat.panel.ChatPanelHelper;
import app.zenly.locator.chat.panel.ChatPanelHelper.C2214e;
import app.zenly.locator.chat.panel.emojis.EmojiPackController;
import app.zenly.locator.chat.view.EmojisCounterView;
import app.zenly.locator.chat.view.EmojisCounterView.C2355a;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.core.p072ui.view.PingParticleView;
import app.zenly.locator.core.p072ui.view.PingParticleView.C3129a;
import app.zenly.locator.core.p072ui.view.particles.ParticlePathAnimation.OnAnimationListener;
import app.zenly.locator.core.p072ui.view.particles.ParticleView.ParticleViewListener;
import app.zenly.locator.map.C3896a1;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import kotlinx.android.extensions.LayoutContainer;
import p213co.znly.models.UserProto$User;
import p250f.p251a.p252a.p253a.p254d.C7657c;

/* renamed from: app.zenly.locator.chat.emojis.b */
public final class C1978b implements LayoutContainer {

    /* renamed from: a */
    private final ValueAnimator f6364a;

    /* renamed from: b */
    private boolean f6365b;

    /* renamed from: c */
    private final RectF f6366c = new RectF();

    /* renamed from: d */
    private boolean f6367d;

    /* renamed from: e */
    private final PointF f6368e = new PointF();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f6369f;

    /* renamed from: g */
    private final LayoutParams f6370g;

    /* renamed from: h */
    private final LayoutParams f6371h;

    /* renamed from: i */
    private final View f6372i;

    /* renamed from: j */
    private final AvatarLoader f6373j;

    /* renamed from: k */
    private final ChatPanelHelper f6374k;

    /* renamed from: l */
    private final int f6375l;

    /* renamed from: m */
    private final int f6376m;

    /* renamed from: n */
    private HashMap f6377n;

    /* renamed from: app.zenly.locator.chat.emojis.b$a */
    static final class C1979a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C1978b f6378a;

        C1979a(C1978b bVar) {
            this.f6378a = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C12932j.m33815a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                ImageView imageView = (ImageView) this.f6378a.mo7801a(C3891l.chat_emojis_avatar);
                String str = "chat_emojis_avatar";
                C12932j.m33815a((Object) imageView, str);
                imageView.setScaleX(floatValue);
                ImageView imageView2 = (ImageView) this.f6378a.mo7801a(C3891l.chat_emojis_avatar);
                C12932j.m33815a((Object) imageView2, str);
                imageView2.setScaleY(floatValue);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: app.zenly.locator.chat.emojis.b$b */
    public static final class C1980b implements ParticleViewListener {

        /* renamed from: a */
        final /* synthetic */ C1978b f6379a;

        C1980b(C1978b bVar) {
            this.f6379a = bVar;
        }

        public void onParticlesAnimationFinish() {
            this.f6379a.f6369f = false;
            this.f6379a.m7712c();
        }

        public void onParticlesAnimationStart() {
            this.f6379a.f6369f = true;
            this.f6379a.m7712c();
        }
    }

    /* renamed from: app.zenly.locator.chat.emojis.b$c */
    static final class C1981c implements OnAnimationListener {

        /* renamed from: a */
        public static final C1981c f6380a = new C1981c();

        C1981c() {
        }

        public final void onAnimationEnd() {
            EmojiPackController.m8058C().onNext(Boolean.valueOf(true));
        }
    }

    public C1978b(View view, AvatarLoader avatarLoader, ChatPanelHelper chatPanelHelper, int i, int i2) {
        C12932j.m33818b(view, "containerView");
        C12932j.m33818b(avatarLoader, "avatarLoader");
        C12932j.m33818b(chatPanelHelper, "panel");
        this.f6372i = view;
        this.f6373j = avatarLoader;
        this.f6374k = chatPanelHelper;
        this.f6375l = i;
        this.f6376m = i2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 1.2f, 1.0f});
        ofFloat.setDuration(150);
        ofFloat.setInterpolator(C7657c.m18643b());
        ofFloat.addUpdateListener(new C1979a(this));
        this.f6364a = ofFloat;
        EmojisCounterView emojisCounterView = (EmojisCounterView) mo7801a(C3891l.emojis_counter);
        C12932j.m33815a((Object) emojisCounterView, "emojis_counter");
        ViewGroup.LayoutParams layoutParams = emojisCounterView.getLayoutParams();
        String str = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams";
        if (layoutParams != null) {
            this.f6370g = (LayoutParams) layoutParams;
            ImageView imageView = (ImageView) mo7801a(C3891l.chat_emojis_avatar);
            C12932j.m33815a((Object) imageView, "chat_emojis_avatar");
            ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
            if (layoutParams2 != null) {
                this.f6371h = (LayoutParams) layoutParams2;
                ImageView imageView2 = (ImageView) mo7801a(C3891l.chat_emojis_avatar);
                imageView2.setScaleX(0.0f);
                imageView2.setScaleY(0.0f);
                imageView2.setVisibility(4);
                ((PingParticleView) mo7801a(C3891l.ping_particle_view)).mo9541a((ParticleViewListener) new C1980b(this));
                return;
            }
            throw new TypeCastException(str);
        }
        throw new TypeCastException(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m7712c() {
        boolean z = this.f6369f && this.f6367d;
        if (z != this.f6365b) {
            this.f6365b = z;
            float f = z ? 1.0f : 0.0f;
            long j = z ? 0 : 300;
            this.f6364a.cancel();
            ViewPropertyAnimator animate = ((ImageView) mo7801a(C3891l.chat_emojis_avatar)).animate();
            animate.scaleX(f);
            animate.scaleY(f);
            animate.setStartDelay(j);
            animate.setDuration(300);
            animate.setInterpolator(C7657c.m18643b());
        }
    }

    /* renamed from: a */
    public View mo7801a(int i) {
        if (this.f6377n == null) {
            this.f6377n = new HashMap();
        }
        View view = (View) this.f6377n.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f6377n.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: b */
    public final void mo7807b(List<? extends C3129a> list) {
        C12932j.m33818b(list, "particles");
        int i = 0;
        for (C3129a aVar : list) {
            i += aVar.f8653c;
        }
        m7708a(i, true);
    }

    public View getContainerView() {
        return this.f6372i;
    }

    /* renamed from: a */
    public final void mo7805a(List<? extends C3129a> list) {
        C12932j.m33818b(list, "particles");
        m7711b();
        m7712c();
        if (list.size() == 1 && ((C3129a) list.get(0)).f8653c == 1) {
            ((PingParticleView) mo7801a(C3891l.ping_particle_view)).mo9421a(((C3129a) list.get(0)).f8652b, this.f6368e);
        } else {
            ((PingParticleView) mo7801a(C3891l.ping_particle_view)).mo9423a(list, this.f6368e);
        }
    }

    /* renamed from: b */
    public final void mo7806b(int i) {
        m7708a(i, false);
    }

    /* renamed from: b */
    private final void m7711b() {
        Object s = C3896a1.f10317n.mo10527a().mo10511c().mo13170a().mo36963s();
        if (s != null) {
            C12932j.m33815a(s, "MapManager.get().focused…itions.observable.value!!");
            List list = (List) s;
            boolean z = true;
            String str = "ping_particle_view";
            if (this.f6374k.mo8048b() == C2214e.CHAT || !(!list.isEmpty())) {
                this.f6366c.set(0.0f, 0.0f, 0.0f, 0.0f);
            } else {
                this.f6366c.set((RectF) list.get(0));
                PingParticleView pingParticleView = (PingParticleView) mo7801a(C3891l.ping_particle_view);
                C12932j.m33815a((Object) pingParticleView, str);
                C1311b.m6283a((View) pingParticleView, this.f6366c);
                PingParticleView pingParticleView2 = (PingParticleView) mo7801a(C3891l.ping_particle_view);
                C12932j.m33815a((Object) pingParticleView2, str);
                float width = (float) pingParticleView2.getWidth();
                PingParticleView pingParticleView3 = (PingParticleView) mo7801a(C3891l.ping_particle_view);
                C12932j.m33815a((Object) pingParticleView3, str);
                if (!RectF.intersects(new RectF(0.0f, 0.0f, width, (float) pingParticleView3.getHeight()), this.f6366c)) {
                    this.f6366c.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            if (this.f6366c.isEmpty()) {
                PingParticleView pingParticleView4 = (PingParticleView) mo7801a(C3891l.ping_particle_view);
                C12932j.m33815a((Object) pingParticleView4, str);
                float width2 = ((float) pingParticleView4.getWidth()) / 2.0f;
                PingParticleView pingParticleView5 = (PingParticleView) mo7801a(C3891l.ping_particle_view);
                C12932j.m33815a((Object) pingParticleView5, str);
                float height = (((float) pingParticleView5.getHeight()) / 2.0f) - (((float) this.f6374k.mo8041a()) / 2.0f);
                ImageView imageView = (ImageView) mo7801a(C3891l.chat_emojis_avatar);
                String str2 = "chat_emojis_avatar";
                C12932j.m33815a((Object) imageView, str2);
                float f = (float) imageView.getLayoutParams().width;
                ImageView imageView2 = (ImageView) mo7801a(C3891l.chat_emojis_avatar);
                C12932j.m33815a((Object) imageView2, str2);
                float f2 = f / 2.0f;
                this.f6366c.set(width2 - f2, height - ((float) imageView2.getLayoutParams().height), width2 + f2, height);
                RectF rectF = this.f6366c;
                int i = (int) rectF.left;
                int i2 = (int) rectF.top;
                if (!(i == this.f6371h.leftMargin && i2 == this.f6371h.topMargin)) {
                    LayoutParams layoutParams = this.f6371h;
                    layoutParams.leftMargin = i;
                    layoutParams.topMargin = i2;
                    ((ImageView) mo7801a(C3891l.chat_emojis_avatar)).requestLayout();
                }
            } else {
                z = false;
            }
            this.f6367d = z;
            this.f6368e.set(this.f6366c.centerX(), this.f6366c.centerY());
            return;
        }
        C12932j.m33814a();
        throw null;
    }

    /* renamed from: a */
    public final void mo7803a(Point point, Bitmap bitmap, float f) {
        C12932j.m33818b(point, "from");
        C12932j.m33818b(bitmap, "bitmap");
        m7711b();
        m7712c();
        PointF pointF = new PointF(point);
        PingParticleView pingParticleView = (PingParticleView) mo7801a(C3891l.ping_particle_view);
        C12932j.m33815a((Object) pingParticleView, "ping_particle_view");
        C1311b.m6282a((View) pingParticleView, pointF);
        ((PingParticleView) mo7801a(C3891l.ping_particle_view)).mo9422a(pointF, this.f6368e, bitmap, f, (OnAnimationListener) C1981c.f6380a);
    }

    /* renamed from: a */
    private final void m7708a(int i, boolean z) {
        m7711b();
        float centerX = this.f6366c.centerX();
        EmojisCounterView emojisCounterView = (EmojisCounterView) mo7801a(C3891l.emojis_counter);
        C12932j.m33815a((Object) emojisCounterView, "emojis_counter");
        int max = (int) Math.max(0.0f, centerX - (((float) emojisCounterView.getWidth()) / 2.0f));
        int max2 = (int) Math.max(0.0f, this.f6366c.top - ((float) this.f6375l));
        if (Math.abs(max - this.f6370g.leftMargin) > this.f6376m || Math.abs(max2 - this.f6370g.topMargin) > this.f6376m) {
            LayoutParams layoutParams = this.f6370g;
            layoutParams.leftMargin = max;
            layoutParams.topMargin = max2;
            ((EmojisCounterView) mo7801a(C3891l.emojis_counter)).requestLayout();
        }
        ((EmojisCounterView) mo7801a(C3891l.emojis_counter)).mo8279a(z ? C2355a.INBOUND : C2355a.OUTBOUND, i);
    }

    /* renamed from: a */
    public final void mo7804a(UserProto$User userProto$User) {
        C12932j.m33818b(userProto$User, "user");
        Request load = this.f6373j.load(C2884f.m9355a(userProto$User));
        ImageView imageView = (ImageView) mo7801a(C3891l.chat_emojis_avatar);
        String str = "chat_emojis_avatar";
        C12932j.m33815a((Object) imageView, str);
        load.into(imageView);
        ImageView imageView2 = (ImageView) mo7801a(C3891l.chat_emojis_avatar);
        C12932j.m33815a((Object) imageView2, str);
        imageView2.setVisibility(0);
    }

    /* renamed from: a */
    public final void mo7802a() {
        if (this.f6365b) {
            ValueAnimator valueAnimator = this.f6364a;
            C12932j.m33815a((Object) valueAnimator, "avatarBlinkAnimator");
            if (!valueAnimator.isRunning()) {
                this.f6364a.start();
            }
        }
    }
}
