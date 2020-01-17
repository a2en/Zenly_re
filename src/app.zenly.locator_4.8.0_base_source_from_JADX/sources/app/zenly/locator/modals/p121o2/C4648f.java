package app.zenly.locator.modals.p121o2;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.zenly.android.base.view.C1309a;
import app.zenly.android.base.widget.C1315a;
import app.zenly.android.base.widget.LinearLayout;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.base.model.AvatarLoader.Request;
import app.zenly.locator.R;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.core.p072ui.view.C3137b;
import app.zenly.locator.core.p072ui.view.C3147g;
import app.zenly.locator.core.p072ui.view.C3150h;
import app.zenly.locator.core.p072ui.view.StatefulLayout;
import app.zenly.locator.core.p072ui.view.particles.ParticleView;
import app.zenly.locator.core.widget.C3275i;
import com.airbnb.lottie.LottieAnimationView;
import java.util.List;
import kotlin.C12956q;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import p213co.znly.models.UserProto$User;
import p250f.p251a.p252a.p253a.p254d.C7657c;
import p250f.p251a.p252a.p253a.p256f.p257a.C7678c;

/* renamed from: app.zenly.locator.modals.o2.f */
public final class C4648f extends C4655h {

    /* renamed from: A */
    private final StatefulLayout f12372A;

    /* renamed from: B */
    private final LinearLayout f12373B;

    /* renamed from: C */
    private final View f12374C;

    /* renamed from: D */
    private final AvatarLoader f12375D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public boolean f12376E;

    /* renamed from: e */
    private final ConstraintLayout f12377e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C3147g f12378f = new C3147g(this.f12377e);

    /* renamed from: g */
    private final ParticleView f12379g;

    /* renamed from: h */
    private final View f12380h;

    /* renamed from: i */
    private final View f12381i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final LottieAnimationView f12382j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final View f12383k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final View f12384l;

    /* renamed from: m */
    private final ImageView f12385m;

    /* renamed from: n */
    private final StatefulLayout f12386n;

    /* renamed from: o */
    private final TextView f12387o;

    /* renamed from: p */
    private final StatefulLayout f12388p;

    /* renamed from: q */
    private final TextView f12389q;

    /* renamed from: r */
    private final TextView f12390r;

    /* renamed from: s */
    private final TextView f12391s;

    /* renamed from: t */
    private final StatefulLayout f12392t;

    /* renamed from: u */
    private final TextView f12393u;

    /* renamed from: v */
    private final StatefulLayout f12394v;

    /* renamed from: w */
    private final TextView f12395w;

    /* renamed from: x */
    private final TextView f12396x;

    /* renamed from: y */
    private final StatefulLayout f12397y;

    /* renamed from: z */
    private final TextView f12398z;

    /* renamed from: app.zenly.locator.modals.o2.f$a */
    static final class C4649a extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ C4648f f12399f;

        C4649a(C4648f fVar) {
            this.f12399f = fVar;
            super(0);
        }

        public final void invoke() {
            float f = 0.0f;
            this.f12399f.f12378f.mo2763a(this.f12399f.f12382j.getId(), this.f12399f.f12376E ? 0.0f : 1.0f);
            C3147g e = this.f12399f.f12378f;
            int id = this.f12399f.f12384l.getId();
            if (this.f12399f.f12376E) {
                f = 1.0f;
            }
            e.mo2763a(id, f);
            int i = 2;
            if (this.f12399f.getAvatar().getTop() - (this.f12399f.f12383k.getHeight() / 2) < 0) {
                if (this.f12399f.f12376E) {
                    this.f12399f.f12378f.mo2764a(this.f12399f.getAvatar().getId(), 4);
                } else {
                    this.f12399f.f12378f.mo2765a(this.f12399f.getAvatar().getId(), 4, this.f12399f.f12383k.getId(), 4);
                }
            }
            this.f12399f.f12378f.mo2782c(this.f12399f.getAvatar().getId(), this.f12399f.f12383k.getWidth() * (this.f12399f.f12376E ? 2 : 1));
            C3147g e2 = this.f12399f.f12378f;
            int id2 = this.f12399f.getAvatar().getId();
            int height = this.f12399f.f12383k.getHeight();
            if (!this.f12399f.f12376E) {
                i = 1;
            }
            e2.mo2777b(id2, height * i);
        }
    }

    /* renamed from: app.zenly.locator.modals.o2.f$b */
    static final class C4650b extends C12933k implements Function0<C12956q> {

        /* renamed from: f */
        final /* synthetic */ C4648f f12400f;

        C4650b(C4648f fVar) {
            this.f12400f = fVar;
            super(0);
        }

        public final void invoke() {
            this.f12400f.f12378f.mo2785d(this.f12400f.getAvatar().getId(), 0);
        }
    }

    /* renamed from: app.zenly.locator.modals.o2.f$c */
    public static final class C4651c implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C4648f f12401e;

        public C4651c(C4648f fVar) {
            this.f12401e = fVar;
        }

        public final void run() {
            this.f12401e.f12382j.mo22807d();
        }
    }

    /* renamed from: app.zenly.locator.modals.o2.f$d */
    static final class C4652d implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C4648f f12402e;

        C4652d(C4648f fVar) {
            this.f12402e = fVar;
        }

        public final void onClick(View view) {
            this.f12402e.setAvatarExpand(false);
        }
    }

    /* renamed from: app.zenly.locator.modals.o2.f$e */
    static final class C4653e implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C4648f f12403e;

        C4653e(C4648f fVar) {
            this.f12403e = fVar;
        }

        public final void onClick(View view) {
            C4648f fVar = this.f12403e;
            fVar.setAvatarExpand(!fVar.f12376E);
        }
    }

    public C4648f(Context context) {
        C12932j.m33818b(context, "context");
        super(context);
        setBackgroundColor(C7678c.m18702a(context, (int) R.attr.zenlyColorBackground));
        View.inflate(context, R.layout.modal_view_friend_request, this);
        View findViewById = findViewById(R.id.modal_layout);
        C12932j.m33815a((Object) findViewById, "findViewById(R.id.modal_layout)");
        this.f12377e = (ConstraintLayout) findViewById;
        View findViewById2 = findViewById(R.id.modal_top);
        C12932j.m33815a((Object) findViewById2, "findViewById(R.id.modal_top)");
        this.f12380h = findViewById2;
        View findViewById3 = findViewById(R.id.modal_bottom);
        C12932j.m33815a((Object) findViewById3, "findViewById(R.id.modal_bottom)");
        this.f12381i = findViewById3;
        View findViewById4 = findViewById(R.id.modal_particles);
        C12932j.m33815a((Object) findViewById4, "findViewById(R.id.modal_particles)");
        this.f12379g = (ParticleView) findViewById4;
        View findViewById5 = findViewById(R.id.modal_avatar_lottie);
        C12932j.m33815a((Object) findViewById5, "findViewById(R.id.modal_avatar_lottie)");
        this.f12382j = (LottieAnimationView) findViewById5;
        View findViewById6 = findViewById(R.id.modal_avatar_container);
        C12932j.m33815a((Object) findViewById6, "findViewById(R.id.modal_avatar_container)");
        this.f12383k = findViewById6;
        View findViewById7 = findViewById(R.id.modal_avatar_gradient);
        C12932j.m33815a((Object) findViewById7, "findViewById(R.id.modal_avatar_gradient)");
        this.f12384l = findViewById7;
        View findViewById8 = findViewById(R.id.modal_avatar);
        C12932j.m33815a((Object) findViewById8, "findViewById(R.id.modal_avatar)");
        this.f12385m = (ImageView) findViewById8;
        View findViewById9 = findViewById(R.id.modal_title_layout);
        C12932j.m33815a((Object) findViewById9, "findViewById(R.id.modal_title_layout)");
        this.f12386n = (StatefulLayout) findViewById9;
        View findViewById10 = findViewById(R.id.modal_title);
        C12932j.m33815a((Object) findViewById10, "findViewById(R.id.modal_title)");
        this.f12387o = (TextView) findViewById10;
        View findViewById11 = findViewById(R.id.modal_subtitle_layout);
        C12932j.m33815a((Object) findViewById11, "findViewById(R.id.modal_subtitle_layout)");
        this.f12388p = (StatefulLayout) findViewById11;
        View findViewById12 = findViewById(R.id.modal_subtitle_global);
        C12932j.m33815a((Object) findViewById12, "findViewById(R.id.modal_subtitle_global)");
        this.f12389q = (TextView) findViewById12;
        View findViewById13 = findViewById(R.id.modal_subtitle_city);
        C12932j.m33815a((Object) findViewById13, "findViewById(R.id.modal_subtitle_city)");
        this.f12390r = (TextView) findViewById13;
        View findViewById14 = findViewById(R.id.modal_subtitle_country);
        C12932j.m33815a((Object) findViewById14, "findViewById(R.id.modal_subtitle_country)");
        this.f12391s = (TextView) findViewById14;
        View findViewById15 = findViewById(R.id.modal_details_layout);
        C12932j.m33815a((Object) findViewById15, "findViewById(R.id.modal_details_layout)");
        this.f12392t = (StatefulLayout) findViewById15;
        View findViewById16 = findViewById(R.id.modal_details);
        C12932j.m33815a((Object) findViewById16, "findViewById(R.id.modal_details)");
        this.f12393u = (TextView) findViewById16;
        View findViewById17 = findViewById(R.id.modal_action_layout);
        C12932j.m33815a((Object) findViewById17, "findViewById(R.id.modal_action_layout)");
        this.f12394v = (StatefulLayout) findViewById17;
        View findViewById18 = findViewById(R.id.modal_action_primary);
        C12932j.m33815a((Object) findViewById18, "findViewById(R.id.modal_action_primary)");
        this.f12395w = (TextView) findViewById18;
        View findViewById19 = findViewById(R.id.modal_action_secondary);
        C12932j.m33815a((Object) findViewById19, "findViewById(R.id.modal_action_secondary)");
        this.f12396x = (TextView) findViewById19;
        View findViewById20 = findViewById(R.id.modal_body_text_layout);
        C12932j.m33815a((Object) findViewById20, "findViewById(R.id.modal_body_text_layout)");
        this.f12397y = (StatefulLayout) findViewById20;
        View findViewById21 = findViewById(R.id.modal_body_text);
        C12932j.m33815a((Object) findViewById21, "findViewById(R.id.modal_body_text)");
        this.f12398z = (TextView) findViewById21;
        View findViewById22 = findViewById(R.id.modal_mutual_friends_avatars_layout);
        C12932j.m33815a((Object) findViewById22, "findViewById(R.id.modal_…l_friends_avatars_layout)");
        this.f12372A = (StatefulLayout) findViewById22;
        View findViewById23 = findViewById(R.id.modal_mutual_friends_avatars);
        C12932j.m33815a((Object) findViewById23, "findViewById(R.id.modal_mutual_friends_avatars)");
        this.f12373B = (LinearLayout) findViewById23;
        View findViewById24 = findViewById(R.id.modal_close);
        C12932j.m33815a((Object) findViewById24, "findViewById(R.id.modal_close)");
        this.f12374C = findViewById24;
        this.f12375D = new C2477e(context);
    }

    /* renamed from: k */
    private final void m13596k() {
        C3150h.m9893a(this.f12378f, Long.valueOf(500), null, new C4649a(this), 2, null);
    }

    /* renamed from: l */
    private final void m13597l() {
        boolean z = (this.f12396x.getVisibility() == 0 && this.f12395w.getVisibility() == 0) ? false : true;
        TextView[] textViewArr = {this.f12395w, this.f12396x};
        int length = textViewArr.length;
        int i = 0;
        while (i < length) {
            LayoutParams layoutParams = textViewArr[i].getLayoutParams();
            if (layoutParams != null) {
                ((ConstraintLayout.LayoutParams) layoutParams).width = z ? -2 : 0;
                i++;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
    }

    /* access modifiers changed from: private */
    public final void setAvatarExpand(boolean z) {
        this.f12376E = z;
        m13596k();
        this.f12384l.setClickable(this.f12376E);
    }

    /* renamed from: f */
    public final void mo11844f() {
        this.f12378f.mo9479a(this.f12372A);
    }

    /* renamed from: g */
    public final void mo11845g() {
        this.f12378f.mo9479a(this.f12397y);
    }

    public final ImageView getAvatar() {
        return this.f12385m;
    }

    public final ParticleView getParticles() {
        return this.f12379g;
    }

    /* renamed from: h */
    public final void mo11848h() {
        this.f12378f.mo9479a(this.f12392t);
    }

    /* renamed from: i */
    public final void mo11849i() {
        this.f12378f.mo9479a(this.f12388p);
    }

    /* renamed from: j */
    public final void mo11850j() {
        this.f12378f.mo9479a(this.f12386n);
    }

    public final void setActionPrimary(String str) {
        C3275i.m10386a(this.f12395w, (CharSequence) str);
        m13597l();
        this.f12378f.mo9483b(this.f12394v);
    }

    public final void setActionSecondary(String str) {
        C3275i.m10386a(this.f12396x, (CharSequence) str);
        m13597l();
        this.f12378f.mo9483b(this.f12394v);
    }

    public final void setAvatar(UserProto$User userProto$User) {
        C12932j.m33818b(userProto$User, "user");
        this.f12382j.postDelayed(new C4651c(this), 1500);
        this.f12384l.setOnClickListener(new C4652d(this));
        this.f12384l.setClickable(this.f12376E);
        this.f12385m.setOnClickListener(new C4653e(this));
        Request load = this.f12375D.load(C2884f.m9355a(userProto$User));
        Context context = this.f12385m.getContext();
        C12932j.m33815a((Object) context, "avatar.context");
        load.withOverride(context.getResources().getDimensionPixelSize(R.dimen.avatar_size_400) * 2).into(this.f12385m);
    }

    public final void setBody(String str) {
        this.f12398z.setText(str);
        this.f12398z.setVisibility(0);
        this.f12378f.mo9483b(this.f12397y);
    }

    public void setCloseButtonClickListener(OnClickListener onClickListener) {
        C12932j.m33818b(onClickListener, "listener");
        this.f12374C.setOnClickListener(onClickListener);
    }

    public final void setFriends(List<UserProto$User> list) {
        C12932j.m33818b(list, "friends");
        this.f12373B.setVisibility(0);
        C3137b.m9865a(this.f12373B, list);
        this.f12378f.mo9483b(this.f12372A);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        StatefulLayout[] statefulLayoutArr;
        for (StatefulLayout statefulLayout : new StatefulLayout[]{this.f12386n, this.f12388p, this.f12392t, this.f12394v, this.f12397y, this.f12372A}) {
            statefulLayout.setPadding(i, statefulLayout.getPaddingTop(), i3, statefulLayout.getPaddingBottom());
        }
        this.f12380h.setMinimumHeight(i2);
        this.f12381i.setMinimumHeight(i4);
    }

    public void setPrimaryActionButtonClickListener(OnClickListener onClickListener) {
        C12932j.m33818b(onClickListener, "listener");
        this.f12395w.setOnClickListener(onClickListener);
    }

    public void setSecondaryActionButtonClickListener(OnClickListener onClickListener) {
        C12932j.m33818b(onClickListener, "listener");
        this.f12396x.setOnClickListener(onClickListener);
    }

    public final void setTitle(String str) {
        C12932j.m33818b(str, "text");
        this.f12387o.setText(str);
        this.f12378f.mo9483b(this.f12386n);
    }

    /* renamed from: b */
    public final void mo11840b() {
        if (this.f12396x.getVisibility() != 0) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f12395w, C1309a.f4895a, new float[]{1.0f, 1.2f, 1.0f});
            ofFloat.setInterpolator(C7657c.m18650f());
            ofFloat.setDuration(600);
            ofFloat.setStartDelay(1000);
            ofFloat.start();
        }
    }

    /* renamed from: c */
    public final boolean mo11841c() {
        if (!this.f12376E) {
            return false;
        }
        setAvatarExpand(false);
        return true;
    }

    /* renamed from: d */
    public final boolean mo11842d() {
        return this.f12378f.mo9484c();
    }

    /* renamed from: e */
    public final boolean mo11843e() {
        CharSequence text = this.f12389q.getText();
        C12932j.m33815a((Object) text, "subtitleGlobal.text");
        if (text.length() > 0) {
            return true;
        }
        CharSequence text2 = this.f12390r.getText();
        C12932j.m33815a((Object) text2, "subtitleCity.text");
        if (text2.length() > 0) {
            return true;
        }
        CharSequence text3 = this.f12391s.getText();
        C12932j.m33815a((Object) text3, "subtitleCountry.text");
        return text3.length() > 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11837a() {
        /*
            r9 = this;
            android.widget.TextView r0 = r9.f12387o
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r1 = "title.text"
            kotlin.jvm.internal.C12932j.m33815a(r0, r1)
            int r0 = r0.length()
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            boolean r3 = r9.mo11843e()
            android.widget.TextView r4 = r9.f12395w
            java.lang.CharSequence r4 = r4.getText()
            java.lang.String r5 = "actionPrimary.text"
            kotlin.jvm.internal.C12932j.m33815a(r4, r5)
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x002d
            r4 = 1
            goto L_0x002e
        L_0x002d:
            r4 = 0
        L_0x002e:
            if (r4 != 0) goto L_0x0049
            android.widget.TextView r4 = r9.f12396x
            java.lang.CharSequence r4 = r4.getText()
            java.lang.String r5 = "actionSecondary.text"
            kotlin.jvm.internal.C12932j.m33815a(r4, r5)
            int r4 = r4.length()
            if (r4 <= 0) goto L_0x0043
            r4 = 1
            goto L_0x0044
        L_0x0043:
            r4 = 0
        L_0x0044:
            if (r4 == 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r4 = 0
            goto L_0x004a
        L_0x0049:
            r4 = 1
        L_0x004a:
            android.widget.TextView r5 = r9.f12398z
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L_0x0054
            r5 = 1
            goto L_0x0055
        L_0x0054:
            r5 = 0
        L_0x0055:
            app.zenly.android.base.widget.LinearLayout r6 = r9.f12373B
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x005f
            r6 = 1
            goto L_0x0060
        L_0x005f:
            r6 = 0
        L_0x0060:
            android.widget.TextView r7 = r9.f12393u
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L_0x0069
            r1 = 1
        L_0x0069:
            app.zenly.locator.core.ui.view.g r7 = r9.f12378f
            app.zenly.locator.core.ui.view.StatefulLayout r8 = r9.f12386n
            r7.mo9480a(r8, r0)
            app.zenly.locator.core.ui.view.g r0 = r9.f12378f
            app.zenly.locator.core.ui.view.StatefulLayout r7 = r9.f12388p
            r0.mo9480a(r7, r3)
            app.zenly.locator.core.ui.view.g r0 = r9.f12378f
            app.zenly.locator.core.ui.view.StatefulLayout r3 = r9.f12397y
            r0.mo9480a(r3, r5)
            app.zenly.locator.core.ui.view.g r0 = r9.f12378f
            app.zenly.locator.core.ui.view.StatefulLayout r3 = r9.f12394v
            r0.mo9480a(r3, r4)
            app.zenly.locator.core.ui.view.g r0 = r9.f12378f
            app.zenly.locator.core.ui.view.StatefulLayout r3 = r9.f12372A
            r0.mo9480a(r3, r6)
            app.zenly.locator.core.ui.view.g r0 = r9.f12378f
            app.zenly.locator.core.ui.view.StatefulLayout r3 = r9.f12392t
            r0.mo9480a(r3, r1)
            app.zenly.locator.core.ui.view.g r0 = r9.f12378f
            app.zenly.locator.modals.o2.f$b r1 = new app.zenly.locator.modals.o2.f$b
            r1.<init>(r9)
            r3 = 0
            app.zenly.locator.core.p072ui.view.C3147g.m9884a(r0, r3, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.modals.p121o2.C4648f.mo11837a():void");
    }

    /* renamed from: a */
    public static /* synthetic */ void m13590a(C4648f fVar, Integer num, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        fVar.mo11839a(num, str, str2);
    }

    /* renamed from: a */
    public final void mo11839a(Integer num, String str, String str2) {
        TextView textView = this.f12389q;
        C3275i.m10386a(textView, (CharSequence) num != null ? textView.getContext().getString(num.intValue()) : null);
        C3275i.m10386a(this.f12390r, (CharSequence) str);
        C3275i.m10386a(this.f12391s, (CharSequence) str2);
        this.f12378f.mo9483b(this.f12388p);
    }

    /* renamed from: a */
    public final void mo11838a(int i, int i2) {
        C3275i.m10384a(this.f12393u, i);
        this.f12393u.setVisibility(0);
        C1315a.m6316a(this.f12393u, i2, 0, 0, 0, 14, (Object) null);
        this.f12378f.mo9483b(this.f12392t);
    }
}
