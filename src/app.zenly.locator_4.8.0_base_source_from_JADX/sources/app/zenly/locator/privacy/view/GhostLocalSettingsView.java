package app.zenly.locator.privacy.view;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.base.model.AvatarLoader.Request.C1333c;
import app.zenly.locator.R;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.p143s.p146j.C5432b;
import app.zenly.locator.privacy.ICallBackGhostLocalSettings;
import app.zenly.locator.privacy.model.C5081c;
import app.zenly.locator.privacy.model.C5082d;
import java.util.Calendar;
import p213co.znly.models.C6980c3;
import p213co.znly.models.UserProto$User;
import p250f.p251a.p252a.p253a.p254d.C7657c;
import p250f.p251a.p252a.p253a.p256f.p257a.C7678c;

public class GhostLocalSettingsView extends RelativeLayout {

    /* renamed from: e */
    private View f13212e;

    /* renamed from: f */
    private ImageView f13213f;

    /* renamed from: g */
    private LocationGhostLocalSettingsView f13214g;

    /* renamed from: h */
    private DurationGhostLocalSettingsView f13215h;

    /* renamed from: i */
    private C5104f f13216i;

    /* renamed from: j */
    private ProgressBar f13217j;

    /* renamed from: k */
    private AvatarLoader f13218k;

    /* renamed from: app.zenly.locator.privacy.view.GhostLocalSettingsView$a */
    class C5099a extends C5432b {

        /* renamed from: b */
        final /* synthetic */ View f13219b;

        C5099a(GhostLocalSettingsView ghostLocalSettingsView, View view) {
            this.f13219b = view;
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            super.mo7336a(animator, z);
            this.f13219b.setVisibility(8);
        }
    }

    /* renamed from: app.zenly.locator.privacy.view.GhostLocalSettingsView$b */
    class C5100b extends C5432b {

        /* renamed from: b */
        final /* synthetic */ View f13220b;

        C5100b(GhostLocalSettingsView ghostLocalSettingsView, View view) {
            this.f13220b = view;
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f13220b.setVisibility(0);
        }
    }

    /* renamed from: app.zenly.locator.privacy.view.GhostLocalSettingsView$c */
    class C5101c extends C5432b {

        /* renamed from: b */
        final /* synthetic */ View f13221b;

        C5101c(GhostLocalSettingsView ghostLocalSettingsView, View view) {
            this.f13221b = view;
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            super.mo7336a(animator, z);
            this.f13221b.setVisibility(8);
        }
    }

    /* renamed from: app.zenly.locator.privacy.view.GhostLocalSettingsView$d */
    class C5102d extends C5432b {

        /* renamed from: b */
        final /* synthetic */ View f13222b;

        C5102d(GhostLocalSettingsView ghostLocalSettingsView, View view) {
            this.f13222b = view;
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f13222b.setVisibility(0);
        }
    }

    /* renamed from: app.zenly.locator.privacy.view.GhostLocalSettingsView$e */
    static /* synthetic */ class C5103e {

        /* renamed from: a */
        static final /* synthetic */ int[] f13223a = new int[C5104f.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        static {
            /*
                app.zenly.locator.privacy.view.GhostLocalSettingsView$f[] r0 = app.zenly.locator.privacy.view.GhostLocalSettingsView.C5104f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13223a = r0
                int[] r0 = f13223a     // Catch:{ NoSuchFieldError -> 0x0014 }
                app.zenly.locator.privacy.view.GhostLocalSettingsView$f r1 = app.zenly.locator.privacy.view.GhostLocalSettingsView.C5104f.LOCATION     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f13223a     // Catch:{ NoSuchFieldError -> 0x001f }
                app.zenly.locator.privacy.view.GhostLocalSettingsView$f r1 = app.zenly.locator.privacy.view.GhostLocalSettingsView.C5104f.DURATION     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.privacy.view.GhostLocalSettingsView.C5103e.<clinit>():void");
        }
    }

    /* renamed from: app.zenly.locator.privacy.view.GhostLocalSettingsView$f */
    public enum C5104f {
        LOCATION,
        DURATION
    }

    public GhostLocalSettingsView(Context context) {
        super(context);
        m14529a((AttributeSet) null);
    }

    /* renamed from: a */
    private void m14529a(AttributeSet attributeSet) {
        this.f13218k = new C2477e(getContext());
        this.f13212e = RelativeLayout.inflate(getContext(), R.layout.view_privacy_local_parent, this);
        this.f13217j = (ProgressBar) this.f13212e.findViewById(R.id.gls_progress_bar_loading);
        this.f13213f = (ImageView) this.f13212e.findViewById(R.id.gls_avatar);
        this.f13214g = (LocationGhostLocalSettingsView) this.f13212e.findViewById(R.id.gls_location_view);
        this.f13215h = (DurationGhostLocalSettingsView) this.f13212e.findViewById(R.id.gls_duration_view);
        this.f13216i = C5104f.LOCATION;
        mo12378a(this.f13216i);
        setBackgroundColor(C7678c.m18702a(getContext(), (int) R.attr.zenlyColorBackground));
    }

    /* renamed from: b */
    private ObjectAnimator m14530b(View view, long j) {
        float width = (float) getWidth();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_X, new float[]{width, 0.0f});
        ofFloat.setInterpolator(C7657c.m18648d(1.0f));
        ofFloat.setDuration(j);
        ofFloat.addListener(new C5100b(this, view));
        return ofFloat;
    }

    /* renamed from: c */
    private ObjectAnimator m14531c(View view, long j) {
        float width = (float) (getWidth() * -1);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_X, new float[]{0.0f, width});
        ofFloat.setInterpolator(C7657c.m18648d(1.0f));
        ofFloat.setDuration(j);
        ofFloat.addListener(new C5099a(this, view));
        return ofFloat;
    }

    /* renamed from: d */
    private ObjectAnimator m14532d(View view, long j) {
        float width = (float) getWidth();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_X, new float[]{0.0f, width});
        ofFloat.setInterpolator(C7657c.m18648d(1.0f));
        ofFloat.setDuration(j);
        ofFloat.addListener(new C5101c(this, view));
        return ofFloat;
    }

    public void setCallback(ICallBackGhostLocalSettings iCallBackGhostLocalSettings) {
        LocationGhostLocalSettingsView locationGhostLocalSettingsView = this.f13214g;
        if (locationGhostLocalSettingsView != null) {
            locationGhostLocalSettingsView.setCallback(iCallBackGhostLocalSettings);
        }
        DurationGhostLocalSettingsView durationGhostLocalSettingsView = this.f13215h;
        if (durationGhostLocalSettingsView != null) {
            durationGhostLocalSettingsView.setCallback(iCallBackGhostLocalSettings);
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setClickable(z);
        LocationGhostLocalSettingsView locationGhostLocalSettingsView = this.f13214g;
        if (locationGhostLocalSettingsView != null) {
            locationGhostLocalSettingsView.setEnabled(z);
        }
        DurationGhostLocalSettingsView durationGhostLocalSettingsView = this.f13215h;
        if (durationGhostLocalSettingsView != null) {
            durationGhostLocalSettingsView.setEnabled(z);
        }
    }

    public void setPrivacyState(C5082d dVar) {
        LocationGhostLocalSettingsView locationGhostLocalSettingsView = this.f13214g;
        if (locationGhostLocalSettingsView != null) {
            locationGhostLocalSettingsView.setPrivacyPrecision(dVar);
        }
    }

    /* renamed from: a */
    public void mo12381a(boolean z) {
        ProgressBar progressBar = this.f13217j;
        if (progressBar != null) {
            progressBar.setVisibility(z ? 0 : 8);
        }
    }

    /* renamed from: a */
    public void mo12378a(C5104f fVar) {
        mo12379a(fVar, false);
    }

    /* renamed from: a */
    private ObjectAnimator m14528a(View view, long j) {
        float width = (float) (getWidth() * -1);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.TRANSLATION_X, new float[]{width, 0.0f});
        ofFloat.setInterpolator(C7657c.m18648d(1.0f));
        ofFloat.setDuration(j);
        ofFloat.addListener(new C5102d(this, view));
        return ofFloat;
    }

    /* renamed from: a */
    public void mo12379a(C5104f fVar, boolean z) {
        this.f13216i = fVar;
        int i = 0;
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            int i2 = C5103e.f13223a[this.f13216i.ordinal()];
            if (i2 == 1) {
                animatorSet.playTogether(new Animator[]{m14532d(this.f13215h, 500), m14528a((View) this.f13214g, 500)});
            } else if (i2 == 2) {
                animatorSet.playTogether(new Animator[]{m14531c(this.f13214g, 500), m14530b(this.f13215h, 500)});
            }
            animatorSet.start();
            return;
        }
        this.f13214g.setVisibility(this.f13216i == C5104f.LOCATION ? 0 : 8);
        DurationGhostLocalSettingsView durationGhostLocalSettingsView = this.f13215h;
        if (this.f13216i != C5104f.DURATION) {
            i = 8;
        }
        durationGhostLocalSettingsView.setVisibility(i);
    }

    /* renamed from: a */
    public void mo12380a(UserProto$User userProto$User, C6980c3 c3Var, C5082d dVar) {
        if (!(this.f13213f == null || userProto$User == null)) {
            this.f13218k.load(C2884f.m9355a(userProto$User)).withPlaceholderStrategy(C1333c.DisplayName).into(this.f13213f);
        }
        LocationGhostLocalSettingsView locationGhostLocalSettingsView = this.f13214g;
        if (!(locationGhostLocalSettingsView == null || userProto$User == null)) {
            locationGhostLocalSettingsView.setTitleWithUserName(userProto$User.getName());
            this.f13214g.mo12387a(dVar);
        }
        DurationGhostLocalSettingsView durationGhostLocalSettingsView = this.f13215h;
        if (durationGhostLocalSettingsView != null && c3Var != null) {
            if (dVar != C5082d.Frozen) {
                durationGhostLocalSettingsView.setTitle((int) R.string.settings_ghost_title_frozenexpired);
            } else if (c3Var.getGhostedUntil().getSeconds() <= 0 || C5081c.m14491b((c3Var.getGhostedUntil().getSeconds() * 1000) - Calendar.getInstance().getTimeInMillis())) {
                this.f13215h.setTitle((int) R.string.settings_ghost_title_frozenexpired);
            } else {
                this.f13215h.setTitleWithTimeStamp((c3Var.getGhostedUntil().getSeconds() * 1000) - Calendar.getInstance().getTimeInMillis());
            }
        }
    }

    /* renamed from: a */
    public boolean mo12382a() {
        return this.f13216i == C5104f.LOCATION;
    }
}
