package app.zenly.locator.onboarding;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0473c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.transition.C1236k;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import app.zenly.android.base.widget.LinearLayout;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.base.model.AvatarLoader.Request;
import app.zenly.android.feature.base.model.AvatarLoader.Request.C1332b;
import app.zenly.locator.R;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.core.p072ui.view.C3137b;
import app.zenly.locator.core.p072ui.view.StatefulLayout;
import app.zenly.locator.core.p072ui.view.StatefulLayout.C3131a;
import app.zenly.locator.core.store.api.FriendStore;
import app.zenly.locator.core.store.p071di.C3015a;
import app.zenly.locator.core.transition.C3066d;
import app.zenly.locator.core.util.C3245z;
import app.zenly.locator.onboarding.BaseSignupController.SignupListener;
import app.zenly.locator.onboarding.C4933w3.C4934a;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5499a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import com.airbnb.lottie.LottieAnimationView;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p213co.znly.models.UserProto$User;
import p213co.znly.models.core.C7174n2.C7175a;
import p250f.p251a.p252a.p263b.p264a.p269h.p270a.C7706a;

/* renamed from: app.zenly.locator.onboarding.u3 */
public final class C4916u3 extends BaseSignupController {

    /* renamed from: l0 */
    private static final long f12886l0 = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: m0 */
    private static final long f12887m0 = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: n0 */
    public static final C4917a f12888n0 = new C4917a(null);

    /* renamed from: T */
    private C4926v3 f12889T;

    /* renamed from: U */
    private ConstraintLayout f12890U;

    /* renamed from: V */
    private TextView f12891V;

    /* renamed from: W */
    private TextView f12892W;

    /* renamed from: X */
    private StatefulLayout f12893X;

    /* renamed from: Y */
    private TextView f12894Y;

    /* renamed from: Z */
    private StatefulLayout f12895Z;

    /* renamed from: a0 */
    private LinearLayout f12896a0;

    /* renamed from: b0 */
    private StatefulLayout f12897b0;

    /* renamed from: c0 */
    private TextView f12898c0;

    /* renamed from: d0 */
    private StatefulLayout f12899d0;

    /* renamed from: e0 */
    private ImageView f12900e0;

    /* renamed from: f0 */
    private LottieAnimationView f12901f0;

    /* renamed from: g0 */
    private LottieAnimationView f12902g0;

    /* renamed from: h0 */
    private AvatarLoader f12903h0;

    /* renamed from: i0 */
    private FriendStore f12904i0;
    /* access modifiers changed from: private */

    /* renamed from: j0 */
    public final Runnable f12905j0 = new C4920c(this);

    /* renamed from: k0 */
    private final TransitionSet f12906k0;

    /* renamed from: app.zenly.locator.onboarding.u3$a */
    public static final class C4917a {
        private C4917a() {
        }

        /* renamed from: a */
        public final C4916u3 mo12122a(boolean z) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("args:new_user", z);
            return new C4916u3(bundle);
        }

        public /* synthetic */ C4917a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.onboarding.u3$b */
    public static final class C4918b extends C1332b {

        /* renamed from: a */
        final /* synthetic */ C4916u3 f12907a;

        /* renamed from: app.zenly.locator.onboarding.u3$b$a */
        public static final class C4919a extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C4918b f12908a;

            C4919a(C4918b bVar) {
                this.f12908a = bVar;
            }

            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                ViewPropertyAnimator startDelay = C4916u3.m14238c(this.f12908a.f12907a).animate().alpha(0.0f).setStartDelay(300);
                C12932j.m33815a((Object) startDelay, "successAnim.animate()\n  …      .setStartDelay(300)");
                startDelay.setDuration(150);
            }
        }

        C4918b(C4916u3 u3Var) {
            this.f12907a = u3Var;
        }

        /* renamed from: a */
        public void mo6544a(Bitmap bitmap) {
            C12932j.m33818b(bitmap, "bitmap");
            super.mo6544a(bitmap);
            C4916u3.m14238c(this.f12907a).mo22798a((AnimatorListener) new C4919a(this));
            C4916u3.m14239d(this.f12907a).mo22807d();
            C4916u3.m14238c(this.f12907a).mo22807d();
        }

        /* renamed from: b */
        public void mo6545b() {
            super.mo6545b();
            C4916u3.m14239d(this.f12907a).mo22807d();
            C4916u3.m14238c(this.f12907a).mo22807d();
        }
    }

    /* renamed from: app.zenly.locator.onboarding.u3$c */
    static final class C4920c implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C4916u3 f12909e;

        C4920c(C4916u3 u3Var) {
            this.f12909e = u3Var;
        }

        public final void run() {
            C5499a aVar = C5498a.f14119e;
            Context context = C4916u3.m14240e(this.f12909e).getContext();
            C12932j.m33815a((Object) context, "view.context");
            C5498a.m15602a(aVar.mo13125a(context), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            this.f12909e.mo11926D();
        }
    }

    /* renamed from: app.zenly.locator.onboarding.u3$d */
    static final class C4921d implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C4916u3 f12910e;

        C4921d(C4916u3 u3Var) {
            this.f12910e = u3Var;
        }

        public final void onClick(View view) {
            C4916u3.m14237b(this.f12910e).mo12129a();
            this.f12910e.f12905j0.run();
        }
    }

    public C4916u3(Bundle bundle) {
        C12932j.m33818b(bundle, "args");
        super(bundle);
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.mo6054a(C3066d.m9601a());
        transitionSet.mo6054a((Transition) C3066d.m9602b());
        C12932j.m33815a((Object) transitionSet, "TransitionSet()\n        …ion(Transitions.bounceIn)");
        this.f12906k0 = transitionSet;
    }

    /* renamed from: J */
    private final void m14233J() {
        StatefulLayout statefulLayout = this.f12893X;
        String str = "usernameLayout";
        if (statefulLayout != null) {
            statefulLayout.setState(C3131a.LOADING);
            StatefulLayout statefulLayout2 = this.f12895Z;
            String str2 = "friendCountLayout";
            if (statefulLayout2 != null) {
                statefulLayout2.setState(C3131a.LOADING);
                StatefulLayout statefulLayout3 = this.f12897b0;
                String str3 = "avatarFriendsLayout";
                if (statefulLayout3 != null) {
                    statefulLayout3.setState(C3131a.LOADING);
                    StatefulLayout statefulLayout4 = this.f12899d0;
                    String str4 = "joinedSinceLayout";
                    if (statefulLayout4 != null) {
                        statefulLayout4.setState(C3131a.LOADING);
                        SignupListener signupListener = this.f12511Q;
                        String str5 = "welcomeBack";
                        if (signupListener != null) {
                            C7175a cache = signupListener.getCache();
                            if (cache != null) {
                                String name = cache.getName();
                                if (name != null) {
                                    TextView textView = this.f12891V;
                                    if (textView == null) {
                                        C12932j.m33820c(str5);
                                        throw null;
                                    } else if (textView != null) {
                                        textView.setText(textView.getContext().getString(R.string.signup_relog_title, new Object[]{name}));
                                    } else {
                                        C12932j.m33820c(str5);
                                        throw null;
                                    }
                                }
                            }
                        }
                        C0473c cVar = new C0473c();
                        ConstraintLayout constraintLayout = this.f12890U;
                        String str6 = "view";
                        if (constraintLayout != null) {
                            cVar.mo2783c(constraintLayout);
                            ImageView imageView = this.f12900e0;
                            if (imageView != null) {
                                cVar.mo2785d(imageView.getId(), 0);
                                TextView textView2 = this.f12891V;
                                if (textView2 != null) {
                                    cVar.mo2785d(textView2.getId(), 0);
                                    StatefulLayout statefulLayout5 = this.f12893X;
                                    if (statefulLayout5 != null) {
                                        cVar.mo2785d(statefulLayout5.getId(), 0);
                                        StatefulLayout statefulLayout6 = this.f12895Z;
                                        if (statefulLayout6 != null) {
                                            cVar.mo2785d(statefulLayout6.getId(), 0);
                                            StatefulLayout statefulLayout7 = this.f12897b0;
                                            if (statefulLayout7 != null) {
                                                cVar.mo2785d(statefulLayout7.getId(), 0);
                                                StatefulLayout statefulLayout8 = this.f12899d0;
                                                if (statefulLayout8 != null) {
                                                    cVar.mo2785d(statefulLayout8.getId(), 0);
                                                    ConstraintLayout constraintLayout2 = this.f12890U;
                                                    if (constraintLayout2 != null) {
                                                        C1236k.m5968a((ViewGroup) constraintLayout2, (Transition) this.f12906k0);
                                                        ConstraintLayout constraintLayout3 = this.f12890U;
                                                        if (constraintLayout3 != null) {
                                                            cVar.mo2779b(constraintLayout3);
                                                        } else {
                                                            C12932j.m33820c(str6);
                                                            throw null;
                                                        }
                                                    } else {
                                                        C12932j.m33820c(str6);
                                                        throw null;
                                                    }
                                                } else {
                                                    C12932j.m33820c(str4);
                                                    throw null;
                                                }
                                            } else {
                                                C12932j.m33820c(str3);
                                                throw null;
                                            }
                                        } else {
                                            C12932j.m33820c(str2);
                                            throw null;
                                        }
                                    } else {
                                        C12932j.m33820c(str);
                                        throw null;
                                    }
                                } else {
                                    C12932j.m33820c(str5);
                                    throw null;
                                }
                            } else {
                                C12932j.m33820c("avatar");
                                throw null;
                            }
                        } else {
                            C12932j.m33820c(str6);
                            throw null;
                        }
                    } else {
                        C12932j.m33820c(str4);
                        throw null;
                    }
                } else {
                    C12932j.m33820c(str3);
                    throw null;
                }
            } else {
                C12932j.m33820c(str2);
                throw null;
            }
        } else {
            C12932j.m33820c(str);
            throw null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ C4926v3 m14237b(C4916u3 u3Var) {
        C4926v3 v3Var = u3Var.f12889T;
        if (v3Var != null) {
            return v3Var;
        }
        C12932j.m33820c("presenter");
        throw null;
    }

    /* renamed from: c */
    public static final /* synthetic */ LottieAnimationView m14238c(C4916u3 u3Var) {
        LottieAnimationView lottieAnimationView = u3Var.f12902g0;
        if (lottieAnimationView != null) {
            return lottieAnimationView;
        }
        C12932j.m33820c("successAnim");
        throw null;
    }

    /* renamed from: d */
    public static final /* synthetic */ LottieAnimationView m14239d(C4916u3 u3Var) {
        LottieAnimationView lottieAnimationView = u3Var.f12901f0;
        if (lottieAnimationView != null) {
            return lottieAnimationView;
        }
        C12932j.m33820c("successParticleAnim");
        throw null;
    }

    /* renamed from: e */
    public static final /* synthetic */ ConstraintLayout m14240e(C4916u3 u3Var) {
        ConstraintLayout constraintLayout = u3Var.f12890U;
        if (constraintLayout != null) {
            return constraintLayout;
        }
        C12932j.m33820c("view");
        throw null;
    }

    /* renamed from: e */
    public static final C4916u3 m14241e(boolean z) {
        return f12888n0.mo12122a(z);
    }

    /* renamed from: B */
    public int mo7192B() {
        return 32;
    }

    /* renamed from: E */
    public final void mo12000E() {
        LottieAnimationView lottieAnimationView = this.f12902g0;
        if (lottieAnimationView != null) {
            lottieAnimationView.mo22807d();
        } else {
            C12932j.m33820c("successAnim");
            throw null;
        }
    }

    /* renamed from: F */
    public final void mo12117F() {
        C4926v3 v3Var = this.f12889T;
        if (v3Var != null) {
            v3Var.mo12131c();
            m14233J();
            return;
        }
        C12932j.m33820c("presenter");
        throw null;
    }

    /* renamed from: G */
    public final boolean mo12118G() {
        ConstraintLayout constraintLayout = this.f12890U;
        if (constraintLayout != null) {
            return constraintLayout.removeCallbacks(this.f12905j0);
        }
        C12932j.m33820c("view");
        throw null;
    }

    /* renamed from: H */
    public final void mo12119H() {
        m14235a(f12886l0);
    }

    /* renamed from: I */
    public final void mo12120I() {
        m14235a(f12887m0);
    }

    public boolean handleBack() {
        return true;
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        C12932j.m33818b(context, "context");
        this.f12904i0 = C3015a.m9526a(context).provideFriendStore();
        boolean z = mo23933c().getBoolean("args:new_user", true);
        FriendStore friendStore = this.f12904i0;
        if (friendStore != null) {
            this.f12889T = new C4926v3(friendStore, this, z);
        } else {
            C12932j.m33820c("friendStore");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        C12932j.m33818b(view, "view");
        super.mo7052b(view);
        C4926v3 v3Var = this.f12889T;
        if (v3Var != null) {
            v3Var.mo12132d();
        } else {
            C12932j.m33820c("presenter");
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        C12932j.m33818b(view, "view");
        C4926v3 v3Var = this.f12889T;
        if (v3Var != null) {
            v3Var.mo12133e();
            super.mo7066c(view);
            return;
        }
        C12932j.m33820c("presenter");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        C12932j.m33818b(view, "view");
        C4926v3 v3Var = this.f12889T;
        if (v3Var != null) {
            v3Var.mo12129a();
            super.mo7053d(view);
            return;
        }
        C12932j.m33820c("presenter");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.controller_welcome, viewGroup, false);
        if (inflate != null) {
            this.f12890U = (ConstraintLayout) inflate;
            ConstraintLayout constraintLayout = this.f12890U;
            String str = "view";
            if (constraintLayout != null) {
                View findViewById = constraintLayout.findViewById(R.id.welcome_welcome_back);
                C12932j.m33815a((Object) findViewById, "view.findViewById(R.id.welcome_welcome_back)");
                this.f12891V = (TextView) findViewById;
                ConstraintLayout constraintLayout2 = this.f12890U;
                if (constraintLayout2 != null) {
                    View findViewById2 = constraintLayout2.findViewById(R.id.welcome_username);
                    C12932j.m33815a((Object) findViewById2, "view.findViewById(R.id.welcome_username)");
                    this.f12892W = (TextView) findViewById2;
                    ConstraintLayout constraintLayout3 = this.f12890U;
                    if (constraintLayout3 != null) {
                        View findViewById3 = constraintLayout3.findViewById(R.id.welcome_username_layout);
                        C12932j.m33815a((Object) findViewById3, "view.findViewById(R.id.welcome_username_layout)");
                        this.f12893X = (StatefulLayout) findViewById3;
                        ConstraintLayout constraintLayout4 = this.f12890U;
                        if (constraintLayout4 != null) {
                            View findViewById4 = constraintLayout4.findViewById(R.id.welcome_friend_count);
                            C12932j.m33815a((Object) findViewById4, "view.findViewById(R.id.welcome_friend_count)");
                            this.f12894Y = (TextView) findViewById4;
                            ConstraintLayout constraintLayout5 = this.f12890U;
                            if (constraintLayout5 != null) {
                                View findViewById5 = constraintLayout5.findViewById(R.id.welcome_friend_count_layout);
                                C12932j.m33815a((Object) findViewById5, "view.findViewById(R.id.w…come_friend_count_layout)");
                                this.f12895Z = (StatefulLayout) findViewById5;
                                ConstraintLayout constraintLayout6 = this.f12890U;
                                if (constraintLayout6 != null) {
                                    View findViewById6 = constraintLayout6.findViewById(R.id.welcome_friend_avatars);
                                    C12932j.m33815a((Object) findViewById6, "view.findViewById(R.id.welcome_friend_avatars)");
                                    this.f12896a0 = (LinearLayout) findViewById6;
                                    ConstraintLayout constraintLayout7 = this.f12890U;
                                    if (constraintLayout7 != null) {
                                        View findViewById7 = constraintLayout7.findViewById(R.id.welcome_friend_avatars_layout);
                                        C12932j.m33815a((Object) findViewById7, "view.findViewById(R.id.w…me_friend_avatars_layout)");
                                        this.f12897b0 = (StatefulLayout) findViewById7;
                                        ConstraintLayout constraintLayout8 = this.f12890U;
                                        if (constraintLayout8 != null) {
                                            View findViewById8 = constraintLayout8.findViewById(R.id.welcome_joined_since);
                                            C12932j.m33815a((Object) findViewById8, "view.findViewById(R.id.welcome_joined_since)");
                                            this.f12898c0 = (TextView) findViewById8;
                                            ConstraintLayout constraintLayout9 = this.f12890U;
                                            if (constraintLayout9 != null) {
                                                View findViewById9 = constraintLayout9.findViewById(R.id.welcome_joined_since_layout);
                                                C12932j.m33815a((Object) findViewById9, "view.findViewById(R.id.w…come_joined_since_layout)");
                                                this.f12899d0 = (StatefulLayout) findViewById9;
                                                ConstraintLayout constraintLayout10 = this.f12890U;
                                                if (constraintLayout10 != null) {
                                                    View findViewById10 = constraintLayout10.findViewById(R.id.welcome_avatar);
                                                    C12932j.m33815a((Object) findViewById10, "view.findViewById(R.id.welcome_avatar)");
                                                    this.f12900e0 = (ImageView) findViewById10;
                                                    ConstraintLayout constraintLayout11 = this.f12890U;
                                                    if (constraintLayout11 != null) {
                                                        View findViewById11 = constraintLayout11.findViewById(R.id.success_particles);
                                                        C12932j.m33815a((Object) findViewById11, "view.findViewById(R.id.success_particles)");
                                                        this.f12901f0 = (LottieAnimationView) findViewById11;
                                                        ConstraintLayout constraintLayout12 = this.f12890U;
                                                        if (constraintLayout12 != null) {
                                                            View findViewById12 = constraintLayout12.findViewById(R.id.success_animation);
                                                            C12932j.m33815a((Object) findViewById12, "view.findViewById(R.id.success_animation)");
                                                            this.f12902g0 = (LottieAnimationView) findViewById12;
                                                            ConstraintLayout constraintLayout13 = this.f12890U;
                                                            if (constraintLayout13 != null) {
                                                                Context context = constraintLayout13.getContext();
                                                                C12932j.m33815a((Object) context, "view.context");
                                                                this.f12903h0 = new C2477e(context);
                                                                C4926v3 v3Var = this.f12889T;
                                                                if (v3Var != null) {
                                                                    v3Var.mo12130b();
                                                                    ConstraintLayout constraintLayout14 = this.f12890U;
                                                                    if (constraintLayout14 != null) {
                                                                        constraintLayout14.setOnClickListener(new C4921d(this));
                                                                        ConstraintLayout constraintLayout15 = this.f12890U;
                                                                        if (constraintLayout15 != null) {
                                                                            return constraintLayout15;
                                                                        }
                                                                        C12932j.m33820c(str);
                                                                        throw null;
                                                                    }
                                                                    C12932j.m33820c(str);
                                                                    throw null;
                                                                }
                                                                C12932j.m33820c("presenter");
                                                                throw null;
                                                            }
                                                            C12932j.m33820c(str);
                                                            throw null;
                                                        }
                                                        C12932j.m33820c(str);
                                                        throw null;
                                                    }
                                                    C12932j.m33820c(str);
                                                    throw null;
                                                }
                                                C12932j.m33820c(str);
                                                throw null;
                                            }
                                            C12932j.m33820c(str);
                                            throw null;
                                        }
                                        C12932j.m33820c(str);
                                        throw null;
                                    }
                                    C12932j.m33820c(str);
                                    throw null;
                                }
                                C12932j.m33820c(str);
                                throw null;
                            }
                            C12932j.m33820c(str);
                            throw null;
                        }
                        C12932j.m33820c(str);
                        throw null;
                    }
                    C12932j.m33820c(str);
                    throw null;
                }
                C12932j.m33820c(str);
                throw null;
            }
            C12932j.m33820c(str);
            throw null;
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
    }

    /* renamed from: a */
    private final void m14235a(long j) {
        ConstraintLayout constraintLayout = this.f12890U;
        if (constraintLayout != null) {
            constraintLayout.postDelayed(this.f12905j0, j);
        } else {
            C12932j.m33820c("view");
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo12121a(C4934a aVar) {
        String str;
        C12932j.m33818b(aVar, "userMeWithFriends");
        UserProto$User b = aVar.mo12140b();
        AvatarLoader avatarLoader = this.f12903h0;
        if (avatarLoader != null) {
            Request load = avatarLoader.load(C2884f.m9355a(b));
            ImageView imageView = this.f12900e0;
            String str2 = "avatar";
            if (imageView != null) {
                Context context = imageView.getContext();
                C12932j.m33815a((Object) context, "avatar.context");
                Request withOverride = load.withOverride(context.getResources().getDimensionPixelSize(R.dimen.avatar_size_400));
                ImageView imageView2 = this.f12900e0;
                if (imageView2 != null) {
                    withOverride.into(imageView2, new C4918b(this));
                    C0473c cVar = new C0473c();
                    ConstraintLayout constraintLayout = this.f12890U;
                    String str3 = "view";
                    if (constraintLayout != null) {
                        cVar.mo2783c(constraintLayout);
                        TextView textView = this.f12892W;
                        String str4 = "username";
                        if (textView != null) {
                            Context context2 = textView.getContext();
                            String username = b.getUsername();
                            String str5 = "usernameLayout";
                            if (TextUtils.isEmpty(username)) {
                                StatefulLayout statefulLayout = this.f12893X;
                                if (statefulLayout != null) {
                                    cVar.mo2785d(statefulLayout.getId(), 8);
                                    StatefulLayout statefulLayout2 = this.f12893X;
                                    if (statefulLayout2 != null) {
                                        statefulLayout2.setState(C3131a.EMPTY);
                                    } else {
                                        C12932j.m33820c(str5);
                                        throw null;
                                    }
                                } else {
                                    C12932j.m33820c(str5);
                                    throw null;
                                }
                            } else {
                                TextView textView2 = this.f12892W;
                                if (textView2 != null) {
                                    textView2.setText(username);
                                    StatefulLayout statefulLayout3 = this.f12893X;
                                    if (statefulLayout3 != null) {
                                        cVar.mo2785d(statefulLayout3.getId(), 0);
                                        StatefulLayout statefulLayout4 = this.f12893X;
                                        if (statefulLayout4 != null) {
                                            statefulLayout4.setState(C3131a.DATA);
                                        } else {
                                            C12932j.m33820c(str5);
                                            throw null;
                                        }
                                    } else {
                                        C12932j.m33820c(str5);
                                        throw null;
                                    }
                                } else {
                                    C12932j.m33820c(str4);
                                    throw null;
                                }
                            }
                            int friendsCount = b.getFriendsCount();
                            String str6 = "context";
                            String str7 = "friendCountLayout";
                            if (friendsCount == 0) {
                                StatefulLayout statefulLayout5 = this.f12895Z;
                                if (statefulLayout5 != null) {
                                    cVar.mo2785d(statefulLayout5.getId(), 8);
                                    StatefulLayout statefulLayout6 = this.f12895Z;
                                    if (statefulLayout6 != null) {
                                        statefulLayout6.setState(C3131a.EMPTY);
                                    } else {
                                        C12932j.m33820c(str7);
                                        throw null;
                                    }
                                } else {
                                    C12932j.m33820c(str7);
                                    throw null;
                                }
                            } else {
                                StatefulLayout statefulLayout7 = this.f12895Z;
                                if (statefulLayout7 != null) {
                                    cVar.mo2785d(statefulLayout7.getId(), 0);
                                    TextView textView3 = this.f12894Y;
                                    if (textView3 != null) {
                                        C12932j.m33815a((Object) context2, str6);
                                        textView3.setText(C7706a.m18756c(context2, friendsCount));
                                        StatefulLayout statefulLayout8 = this.f12895Z;
                                        if (statefulLayout8 != null) {
                                            statefulLayout8.setState(C3131a.DATA);
                                        } else {
                                            C12932j.m33820c(str7);
                                            throw null;
                                        }
                                    } else {
                                        C12932j.m33820c("friendCount");
                                        throw null;
                                    }
                                } else {
                                    C12932j.m33820c(str7);
                                    throw null;
                                }
                            }
                            List a = aVar.mo12139a();
                            LinearLayout linearLayout = this.f12896a0;
                            if (linearLayout != null) {
                                linearLayout.removeAllViews();
                                String str8 = "avatarFriendsLayout";
                                if (a.isEmpty()) {
                                    StatefulLayout statefulLayout9 = this.f12897b0;
                                    if (statefulLayout9 != null) {
                                        cVar.mo2785d(statefulLayout9.getId(), 8);
                                        StatefulLayout statefulLayout10 = this.f12897b0;
                                        if (statefulLayout10 != null) {
                                            statefulLayout10.setState(C3131a.EMPTY);
                                        } else {
                                            C12932j.m33820c(str8);
                                            throw null;
                                        }
                                    } else {
                                        C12932j.m33820c(str8);
                                        throw null;
                                    }
                                } else {
                                    StatefulLayout statefulLayout11 = this.f12897b0;
                                    if (statefulLayout11 != null) {
                                        cVar.mo2785d(statefulLayout11.getId(), 0);
                                        m14236a(aVar.mo12139a());
                                        StatefulLayout statefulLayout12 = this.f12897b0;
                                        if (statefulLayout12 != null) {
                                            statefulLayout12.setState(C3131a.DATA);
                                        } else {
                                            C12932j.m33820c(str8);
                                            throw null;
                                        }
                                    } else {
                                        C12932j.m33820c(str8);
                                        throw null;
                                    }
                                }
                                Timestamp createdAt = b.getCreatedAt();
                                C12932j.m33815a((Object) createdAt, "userMe.createdAt");
                                int a2 = C3245z.m10280a(createdAt);
                                TextView textView4 = this.f12898c0;
                                if (textView4 != null) {
                                    if (a2 == 0) {
                                        str = context2.getString(R.string.signup_relog_daysCount_today);
                                    } else if (a2 != 1) {
                                        C12932j.m33815a((Object) context2, str6);
                                        str = context2.getResources().getQuantityString(R.plurals.signup_relog_daysCount_generic, a2, new Object[]{Integer.valueOf(a2)});
                                    } else {
                                        str = context2.getString(R.string.signup_relog_daysCount_yesterday);
                                    }
                                    textView4.setText(str);
                                    StatefulLayout statefulLayout13 = this.f12899d0;
                                    if (statefulLayout13 != null) {
                                        statefulLayout13.setState(C3131a.DATA);
                                        TextView textView5 = this.f12891V;
                                        String str9 = "welcomeBack";
                                        if (textView5 == null) {
                                            C12932j.m33820c(str9);
                                            throw null;
                                        } else if (textView5 != null) {
                                            textView5.setText(textView5.getContext().getString(R.string.signup_relog_title, new Object[]{b.getName()}));
                                            ConstraintLayout constraintLayout2 = this.f12890U;
                                            if (constraintLayout2 != null) {
                                                C1236k.m5968a((ViewGroup) constraintLayout2, (Transition) this.f12906k0);
                                                ConstraintLayout constraintLayout3 = this.f12890U;
                                                if (constraintLayout3 != null) {
                                                    cVar.mo2779b(constraintLayout3);
                                                } else {
                                                    C12932j.m33820c(str3);
                                                    throw null;
                                                }
                                            } else {
                                                C12932j.m33820c(str3);
                                                throw null;
                                            }
                                        } else {
                                            C12932j.m33820c(str9);
                                            throw null;
                                        }
                                    } else {
                                        C12932j.m33820c("joinedSinceLayout");
                                        throw null;
                                    }
                                } else {
                                    C12932j.m33820c("joinedSince");
                                    throw null;
                                }
                            } else {
                                C12932j.m33820c("avatarFriends");
                                throw null;
                            }
                        } else {
                            C12932j.m33820c(str4);
                            throw null;
                        }
                    } else {
                        C12932j.m33820c(str3);
                        throw null;
                    }
                } else {
                    C12932j.m33820c(str2);
                    throw null;
                }
            } else {
                C12932j.m33820c(str2);
                throw null;
            }
        } else {
            C12932j.m33820c("avatarLoader");
            throw null;
        }
    }

    /* renamed from: a */
    private final void m14236a(List<UserProto$User> list) {
        LinearLayout linearLayout = this.f12896a0;
        if (linearLayout != null) {
            C3137b.m9865a(linearLayout, list);
        } else {
            C12932j.m33820c("avatarFriends");
            throw null;
        }
    }
}
