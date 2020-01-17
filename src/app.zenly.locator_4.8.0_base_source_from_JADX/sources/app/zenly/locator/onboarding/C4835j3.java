package app.zenly.locator.onboarding;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.C0540a;
import app.zenly.locator.R;
import app.zenly.locator.core.util.C3191a;
import app.zenly.locator.onboarding.p125y3.C4949c;
import app.zenly.locator.p143s.p146j.C5432b;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.C10568e;
import com.google.android.gms.location.C10571f;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsRequest.C10558a;
import com.google.android.gms.location.LocationSettingsStates;
import com.google.android.gms.tasks.C10693c;
import com.google.android.gms.tasks.OnCompleteListener;
import p250f.p251a.p252a.p253a.p254d.C7657c;
import p250f.p251a.p252a.p253a.p255e.C7660b;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;
import p387h.p388a.C12143a;

/* renamed from: app.zenly.locator.onboarding.j3 */
public class C4835j3 extends BaseSignupController {
    /* access modifiers changed from: private */

    /* renamed from: T */
    public TextView f12777T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public TextView f12778U;

    /* renamed from: V */
    private ImageView f12779V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public LottieAnimationView f12780W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public AnimatorSet f12781X;

    /* renamed from: Y */
    private boolean f12782Y;

    /* renamed from: app.zenly.locator.onboarding.j3$a */
    class C4836a extends C5432b {
        C4836a() {
        }

        /* renamed from: a */
        public void mo7336a(Animator animator, boolean z) {
            super.mo7336a(animator, z);
            if (!z && C4835j3.this.mo23920b() != null) {
                C5498a.m15600a((Context) C4835j3.this.mo23920b()).mo13123a(C5501c.LIGHT, C5500b.NAV);
            }
            C4835j3.this.mo11926D();
            C4835j3.this.f12781X = null;
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            C4835j3.this.f12777T.setVisibility(8);
            C4835j3.this.f12778U.setVisibility(8);
            C4835j3.this.f12780W.setVisibility(0);
            C4835j3.this.f12780W.mo22807d();
        }
    }

    /* renamed from: app.zenly.locator.onboarding.j3$b */
    class C4837b extends C5432b {

        /* renamed from: b */
        final /* synthetic */ View f12784b;

        C4837b(C4835j3 j3Var, View view) {
            this.f12784b = view;
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f12784b.setVisibility(0);
        }
    }

    /* renamed from: F */
    private void m14107F() {
        C10568e.m27018a(mo23920b()).mo28698a(m14108G()).mo29299a((OnCompleteListener<TResult>) new C4945y1<TResult>(this));
    }

    /* renamed from: G */
    private LocationSettingsRequest m14108G() {
        LocationRequest priority = LocationRequest.create().setPriority(100);
        C10558a aVar = new C10558a();
        aVar.mo28668a(priority);
        aVar.mo28669a(true);
        return aVar.mo28670a();
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public void mo12000E() {
        this.f12781X = new AnimatorSet();
        ObjectAnimator a = m14114a(this.f12779V, 0.0f, 1.0f, 1500, C7657c.m18647d());
        ObjectAnimator a2 = m14114a(this.f12779V, 1.0f, 1.5f, 300, C7657c.m18649e());
        m14116a(a2, 1.0f, 0.0f);
        this.f12781X.playSequentially(new Animator[]{a, a2});
        this.f12781X.addListener(new C4836a());
        this.f12781X.start();
    }

    /* renamed from: I */
    private void m14110I() {
        this.f12779V.post(new C4777c2(this));
    }

    /* renamed from: J */
    private void m14111J() {
        mo23917a(new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 199);
        C4847l3.m14146j().mo12082h();
    }

    /* renamed from: K */
    private void m14112K() {
        Activity b = mo23920b();
        C10568e.m27018a(b).mo28698a(m14108G()).mo29299a((OnCompleteListener<TResult>) new C4765b2<TResult>(this, b));
    }

    /* renamed from: B */
    public int mo7192B() {
        return 40;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        super.mo7053d(view);
        AnimatorSet animatorSet = this.f12781X;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: c */
    private void m14123c(Context context) {
        if (C0540a.m2537a(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            m14107F();
        } else {
            m14111J();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        String name = this.f12511Q.getCache().getName();
        this.f12777T.setText(mo23920b().getString(R.string.permission_location_title_whereareyou, new Object[]{name}));
        if (C0540a.m2537a(view.getContext(), "android.permission.ACCESS_FINE_LOCATION") != 0) {
            return;
        }
        if (this.f12782Y) {
            m14107F();
        } else {
            m14112K();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.controller_locate, viewGroup, false);
        this.f12777T = (TextView) inflate.findViewById(R.id.whereareyou);
        this.f12778U = (TextView) inflate.findViewById(R.id.locateme);
        this.f12780W = (LottieAnimationView) inflate.findViewById(R.id.lottie_animation_view);
        this.f12779V = (ImageView) inflate.findViewById(R.id.hand_img);
        this.f12779V.setVisibility(4);
        this.f12778U.setOnClickListener(new C4954z1(this, inflate));
        return inflate;
    }

    /* renamed from: d */
    private void m14124d(Context context) {
        new Builder(context).setMessage(C7709b.m18762a(context, R.string.onboarding_permission_location_rationale)).setCancelable(false).setPositiveButton(R.string.commons_button_capok, new C4782d2(this, context)).create().show();
    }

    /* renamed from: b */
    private void m14121b(Context context) {
        this.f12782Y = true;
        this.f12778U.setText(R.string.onboarding_open_settings);
        this.f12778U.setOnClickListener(new C4755a2(context));
    }

    /* renamed from: a */
    public /* synthetic */ void mo12059a(View view, View view2) {
        C5498a.m15600a(view.getContext()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        m14123c(view2.getContext());
    }

    /* renamed from: a */
    public /* synthetic */ void mo12058a(Context context, DialogInterface dialogInterface, int i) {
        C5498a.m15600a(context).mo13123a(C5501c.LIGHT, C5500b.NAV);
        m14111J();
    }

    /* renamed from: a */
    public /* synthetic */ void mo12057a(Activity activity, C10693c cVar) {
        try {
            C10571f fVar = (C10571f) cVar.mo29310a(ApiException.class);
            C5498a.m15600a((Context) activity).mo13123a(C5501c.LIGHT, C5500b.NAV);
            mo11926D();
        } catch (ApiException unused) {
        }
    }

    /* renamed from: a */
    public /* synthetic */ void mo12060a(C10693c cVar) {
        try {
            C10571f fVar = (C10571f) cVar.mo29310a(ApiException.class);
            C4847l3.m14146j().mo12072b();
            m14110I();
        } catch (ApiException e) {
            m14119a(e);
        }
    }

    /* renamed from: a */
    private void m14119a(ApiException apiException) {
        int a = apiException.mo27035a();
        if (a == 6) {
            Activity b = mo23920b();
            try {
                ResolvableApiException resolvableApiException = (ResolvableApiException) apiException;
                if (b != null) {
                    mo23900a(200);
                    resolvableApiException.mo27051a(b, 200);
                }
            } catch (SendIntentException unused) {
                C12143a.m32032b(apiException, "Unable to start resolution", new Object[0]);
            }
        } else if (a != 8502) {
            C12143a.m32032b(apiException, "Unknown location settings problem", new Object[0]);
        } else {
            C12143a.m32032b(apiException, "Location settings change unavailable", new Object[0]);
        }
    }

    /* renamed from: a */
    public void mo8182a(int i, int i2, Intent intent) {
        super.mo8182a(i, i2, intent);
        if (i != 200) {
            return;
        }
        if (i2 == -1) {
            C4847l3.m14146j().mo12072b();
            m14110I();
        } else if (i2 == 0) {
            boolean z = false;
            try {
                LocationSettingsStates a = LocationSettingsStates.m26990a(intent);
                if (a != null && ((!a.mo28675c() || a.mo28676d()) && a.mo28677e() && !a.mo28678f())) {
                    z = true;
                }
                if (z) {
                    Activity b = mo23920b();
                    if (b != null) {
                        C4949c.m14281a(b, new C4792e2(b));
                    }
                }
            } catch (Exception e) {
                C12143a.m32034c(e, "Enable to load LocationSettingsStates", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m14117a(Activity activity, DialogInterface dialogInterface, int i) {
        C5498a.m15600a((Context) activity).mo13123a(C5501c.LIGHT, C5500b.NAV);
        C7660b.m18653a(activity, new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
    }

    /* renamed from: a */
    public void mo12056a(int i, String[] strArr, int[] iArr) {
        if (i == 199 && iArr.length > 0) {
            if (iArr[0] == 0) {
                m14107F();
                C4847l3.m14146j().mo12080f();
                return;
            }
            if (ActivityCompat.m2351a(mo23920b(), "android.permission.ACCESS_FINE_LOCATION")) {
                m14124d((Context) mo23920b());
            } else {
                m14121b((Context) mo23920b());
            }
            C4847l3.m14146j().mo12081g();
        }
    }

    /* renamed from: a */
    private ObjectAnimator m14114a(View view, float f, float f2, long j, TimeInterpolator timeInterpolator) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{f, f2}), PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{f, f2})});
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        ofPropertyValuesHolder.setDuration(j);
        ofPropertyValuesHolder.addListener(new C4837b(this, view));
        return ofPropertyValuesHolder;
    }

    /* renamed from: a */
    private void m14116a(ObjectAnimator objectAnimator, float f, float f2) {
        objectAnimator.setValues((PropertyValuesHolder[]) C3191a.m10160a(objectAnimator.getValues(), PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{f, f2})));
    }
}
