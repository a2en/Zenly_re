package app.zenly.locator.userprofile.p198me;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import app.zenly.android.feature.polenta.widget.ScreenBarLayout;
import app.zenly.android.feature.polenta.widget.ScreenBarLayout.OnCollapseListener;
import app.zenly.locator.C3279d;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.contracts.NavigationContract;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.manager.MeUserManager;
import app.zenly.locator.core.manager.p069di.C2666b;
import app.zenly.locator.core.p072ui.controller.C3103g;
import app.zenly.locator.userprofile.p198me.appicons.DialogLauncher;
import app.zenly.locator.userprofile.p198me.view.UnlockAnimationView;
import app.zenly.locator.view.ScreenBarBottomSheetBehavior;
import app.zenly.locator.view.ScreenBarBottomSheetBehavior.C6163b;
import com.bluelinelabs.conductor.C8819d;
import java.util.concurrent.Callable;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p271i.C7707a;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12291g;
import p389io.reactivex.SingleSource;
import p389io.reactivex.p406n.C12785a;

/* renamed from: app.zenly.locator.userprofile.me.b */
public final class C6063b extends C3279d<MyProfilePresenter> implements DialogLauncher, MyProfileTarget {

    /* renamed from: V */
    private final C6067c f15261V = C6067c.f15275b;

    /* renamed from: W */
    private NavigationContract f15262W;

    /* renamed from: X */
    public View f15263X;

    /* renamed from: Y */
    public RecyclerView f15264Y;

    /* renamed from: Z */
    public UnlockAnimationView f15265Z;

    /* renamed from: a0 */
    private ScreenBarBottomSheetBehavior<View> f15266a0;

    /* renamed from: b0 */
    private boolean f15267b0 = true;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public final C12785a<Boolean> f15268c0;

    /* renamed from: app.zenly.locator.userprofile.me.b$a */
    public static final class C6064a {
        private C6064a() {
        }

        public /* synthetic */ C6064a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.b$b */
    static final class C6065b<V> implements Callable<SingleSource<? extends T>> {

        /* renamed from: e */
        final /* synthetic */ C6063b f15269e;

        /* renamed from: f */
        final /* synthetic */ Context f15270f;

        C6065b(C6063b bVar, Context context) {
            this.f15269e = bVar;
            this.f15270f = context;
        }

        public final C12291g<MyProfilePresenter> call() {
            MeUserManager b = C2666b.m9049a(this.f15270f).mo8764b();
            C12279e d = this.f15269e.f15268c0.mo36496g().mo36477d();
            C12932j.m33815a((Object) d, "visibilitySubject.hide().distinctUntilChanged()");
            MyProfilePresenter myProfilePresenter = new MyProfilePresenter(b, d, new C2477e(this.f15270f));
            return myProfilePresenter.mo13819a((Context) new ContextThemeWrapper(this.f15270f, 2132083208)).mo36347a((SingleSource<T>) C12291g.m32767b(myProfilePresenter));
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.b$c */
    public static final class C6066c implements OnCollapseListener {

        /* renamed from: a */
        final /* synthetic */ View f15271a;

        /* renamed from: b */
        final /* synthetic */ int f15272b;

        /* renamed from: c */
        final /* synthetic */ int f15273c;

        /* renamed from: d */
        final /* synthetic */ int f15274d;

        C6066c(View view, int i, int i2, int i3) {
            this.f15271a = view;
            this.f15272b = i;
            this.f15273c = i2;
            this.f15274d = i3;
        }

        public void onCollapse(float f, int i) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) this.f15271a.findViewById(C3891l.profile_settings_button);
            String str = "view.profile_settings_button";
            C12932j.m33815a((Object) appCompatImageView, str);
            int height = appCompatImageView.getHeight();
            float f2 = (float) i;
            float f3 = 1.0f - (f2 / ((float) height));
            ConstraintLayout constraintLayout = (ConstraintLayout) this.f15271a.findViewById(C3891l.profile_avatar_layout);
            C12932j.m33815a((Object) constraintLayout, "view.profile_avatar_layout");
            int height2 = constraintLayout.getHeight();
            int i2 = this.f15272b;
            float f4 = (((float) i2) + ((1.0f - f) * ((float) (height2 - i2)))) / ((float) height2);
            float f5 = -f;
            float f6 = ((float) (height + this.f15273c)) * f5;
            float f7 = ((float) this.f15274d) * f;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) this.f15271a.findViewById(C3891l.profile_settings_button);
            C12932j.m33815a((Object) appCompatImageView2, str);
            appCompatImageView2.setAlpha(f3);
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) this.f15271a.findViewById(C3891l.profile_ghost_mode_button);
            String str2 = "view.profile_ghost_mode_button";
            C12932j.m33815a((Object) appCompatImageButton, str2);
            appCompatImageButton.setAlpha(f3);
            FrameLayout frameLayout = (FrameLayout) this.f15271a.findViewById(C3891l.profile_avatar_icon);
            C12932j.m33815a((Object) frameLayout, "view.profile_avatar_icon");
            frameLayout.setAlpha(f3);
            AppCompatTextView appCompatTextView = (AppCompatTextView) this.f15271a.findViewById(C3891l.profile_username_button);
            String str3 = "view.profile_username_button";
            C12932j.m33815a((Object) appCompatTextView, str3);
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) this.f15271a.findViewById(C3891l.profile_username_button);
            C12932j.m33815a((Object) appCompatTextView2, str3);
            appCompatTextView.setAlpha(1.0f - (f2 / ((float) appCompatTextView2.getHeight())));
            AppCompatImageView appCompatImageView3 = (AppCompatImageView) this.f15271a.findViewById(C3891l.profile_settings_button);
            C12932j.m33815a((Object) appCompatImageView3, str);
            appCompatImageView3.setTranslationY(f6);
            AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) this.f15271a.findViewById(C3891l.profile_ghost_mode_button);
            C12932j.m33815a((Object) appCompatImageButton2, str2);
            appCompatImageButton2.setTranslationY(f6);
            AppCompatTextView appCompatTextView3 = (AppCompatTextView) this.f15271a.findViewById(C3891l.profile_username_button);
            C12932j.m33815a((Object) appCompatTextView3, str3);
            appCompatTextView3.setTranslationY(f6);
            ConstraintLayout constraintLayout2 = (ConstraintLayout) this.f15271a.findViewById(C3891l.profile_avatar_layout);
            constraintLayout2.setScaleX(f4);
            constraintLayout2.setScaleY(f4);
            constraintLayout2.setTranslationY(f5 * ((float) this.f15273c));
            AppCompatTextView appCompatTextView4 = (AppCompatTextView) this.f15271a.findViewById(C3891l.profile_name);
            float f8 = 0.0f;
            appCompatTextView4.setPivotX(0.0f);
            appCompatTextView4.setPivotY(((float) appCompatTextView4.getHeight()) / 2.0f);
            float f9 = 1.0f - ((f * 4.0f) / 28.0f);
            appCompatTextView4.setScaleX(f9);
            appCompatTextView4.setScaleY(f9);
            AppCompatTextView appCompatTextView5 = (AppCompatTextView) this.f15271a.findViewById(C3891l.profile_username_link);
            String str4 = "view.profile_username_link";
            C12932j.m33815a((Object) appCompatTextView5, str4);
            if (appCompatTextView5.getVisibility() == 8) {
                f8 = f7;
            }
            appCompatTextView4.setTranslationY(f8 + f6);
            AppCompatTextView appCompatTextView6 = (AppCompatTextView) this.f15271a.findViewById(C3891l.profile_username_link);
            C12932j.m33815a((Object) appCompatTextView6, str4);
            appCompatTextView6.setTranslationY(f6 - f7);
        }
    }

    static {
        new C6064a(null);
    }

    public C6063b(Bundle bundle) {
        C12932j.m33818b(bundle, "args");
        super(bundle);
        C12785a<Boolean> h = C12785a.m33446h(Boolean.valueOf(false));
        C12932j.m33815a((Object) h, "BehaviorSubject.createDefault(false)");
        this.f15268c0 = h;
    }

    /* renamed from: H */
    private final void m16809H() {
        this.f15268c0.onNext(Boolean.valueOf(this.f15267b0 && mo9313v()));
    }

    /* renamed from: C */
    public int mo9733C() {
        return R.layout.controller_my_profile;
    }

    /* renamed from: b */
    public C12291g<MyProfilePresenter> mo9740b(Context context) {
        C12932j.m33818b(context, "context");
        C12291g<MyProfilePresenter> a = C12291g.m32765a((Callable<? extends SingleSource<? extends T>>) new C6065b<Object>(this, context));
        C12932j.m33815a((Object) a, "Single.defer {\n        v…le.just(presenter))\n    }");
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo7066c(View view) {
        C12932j.m33818b(view, "view");
        if (mo9737G()) {
            MyProfilePresenter myProfilePresenter = (MyProfilePresenter) mo9735E();
            if (myProfilePresenter != null) {
                myProfilePresenter.mo10037a();
            }
            ScreenBarBottomSheetBehavior<View> screenBarBottomSheetBehavior = this.f15266a0;
            if (screenBarBottomSheetBehavior != null) {
                screenBarBottomSheetBehavior.mo14020e();
            } else {
                C12932j.m33820c("bottomSheetBehavior");
                throw null;
            }
        }
        super.mo7066c(view);
    }

    /* renamed from: d */
    public void mo9311d(boolean z) {
        super.mo9311d(z);
        m16809H();
    }

    public void display(C3103g gVar) {
        C12932j.m33818b(gVar, "dialog");
        Activity b = mo23920b();
        if (b != null) {
            gVar.mo9296j(b);
        }
    }

    /* renamed from: e */
    public void mo7061e(View view) {
        C12932j.m33818b(view, "view");
        super.mo7061e(view);
        mo7857f(view);
        UnlockAnimationView unlockAnimationView = (UnlockAnimationView) view.findViewById(C3891l.unlock_animation_view);
        C12932j.m33815a((Object) unlockAnimationView, "view.unlock_animation_view");
        mo13879a(unlockAnimationView);
        C6163b bVar = ScreenBarBottomSheetBehavior.f15476b0;
        ScreenBarLayout screenBarLayout = (ScreenBarLayout) view.findViewById(C3891l.profile_screen_bar_layout);
        C12932j.m33815a((Object) screenBarLayout, "view.profile_screen_bar_layout");
        FrameLayout frameLayout = (FrameLayout) view.findViewById(C3891l.profile_bottom_sheet);
        C12932j.m33815a((Object) frameLayout, "view.profile_bottom_sheet");
        this.f15266a0 = C6163b.m17095a(bVar, screenBarLayout, null, null, frameLayout, false, 22, null);
        ScreenBarBottomSheetBehavior<View> screenBarBottomSheetBehavior = this.f15266a0;
        String str = "bottomSheetBehavior";
        if (screenBarBottomSheetBehavior != null) {
            screenBarBottomSheetBehavior.mo30687b(false);
            ScreenBarBottomSheetBehavior<View> screenBarBottomSheetBehavior2 = this.f15266a0;
            if (screenBarBottomSheetBehavior2 != null) {
                screenBarBottomSheetBehavior2.mo30690c(4);
                int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.spacing_75);
                int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(R.dimen.spacing_100);
                ((ScreenBarLayout) view.findViewById(C3891l.profile_screen_bar_layout)).setOnCollapseListener(new C6066c(view, view.getResources().getDimensionPixelSize(R.dimen.avatar_size_150) + view.getResources().getDimensionPixelSize(R.dimen.spacing_25) + dimensionPixelSize2, dimensionPixelSize2, dimensionPixelSize));
                RecyclerView recyclerView = (RecyclerView) view.findViewById(C3891l.recycler_view);
                C12932j.m33815a((Object) recyclerView, "view.recycler_view");
                mo13878a(recyclerView);
                getRecyclerView().setHasFixedSize(true);
                view.requestApplyInsets();
                return;
            }
            C12932j.m33820c(str);
            throw null;
        }
        C12932j.m33820c(str);
        throw null;
    }

    /* renamed from: f */
    public void mo7857f(View view) {
        C12932j.m33818b(view, "<set-?>");
        this.f15263X = view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo11369g(Activity activity) {
        C12932j.m33818b(activity, "activity");
        super.mo11369g(activity);
        this.f15267b0 = true;
        m16809H();
    }

    public View getContainerView() {
        View view = this.f15263X;
        if (view != null) {
            return view;
        }
        C12932j.m33820c("containerView");
        throw null;
    }

    public Activity getCurrentActivity() {
        return mo23920b();
    }

    public NavigationContract getNavigation() {
        return this.f15262W;
    }

    public RecyclerView getRecyclerView() {
        RecyclerView recyclerView = this.f15264Y;
        if (recyclerView != null) {
            return recyclerView;
        }
        C12932j.m33820c("recyclerView");
        throw null;
    }

    public UnlockAnimationView getUnlockAnimationView() {
        UnlockAnimationView unlockAnimationView = this.f15265Z;
        if (unlockAnimationView != null) {
            return unlockAnimationView;
        }
        C12932j.m33820c("unlockAnimationView");
        throw null;
    }

    public boolean handleBack() {
        if (!mo9737G() || !getUnlockAnimationView().mo13999a()) {
            return super.handleBack();
        }
        return true;
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        if (mo9737G()) {
            int dimensionPixelOffset = view.getResources().getDimensionPixelOffset(R.dimen.navigation_padding_bottom);
            ScreenBarBottomSheetBehavior<View> screenBarBottomSheetBehavior = this.f15266a0;
            if (screenBarBottomSheetBehavior != null) {
                rect.bottom += dimensionPixelOffset;
                screenBarBottomSheetBehavior.mo14018a(rect);
                return;
            }
            C12932j.m33820c("bottomSheetBehavior");
            throw null;
        }
    }

    public void setNavigation(NavigationContract navigationContract) {
        this.f15262W = navigationContract;
    }

    /* renamed from: B */
    public C6067c m16812B() {
        return this.f15261V;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        C12932j.m33818b(view, "view");
        super.mo7052b(view);
        if (mo23947l() instanceof NavigationContract) {
            C8819d l = mo23947l();
            if (l != null) {
                setNavigation((NavigationContract) l);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.core.contracts.NavigationContract");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo11367f(Activity activity) {
        C12932j.m33818b(activity, "activity");
        this.f15267b0 = false;
        m16809H();
        super.mo11367f(activity);
    }

    /* renamed from: a */
    public void mo13878a(RecyclerView recyclerView) {
        C12932j.m33818b(recyclerView, "<set-?>");
        this.f15264Y = recyclerView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        C12932j.m33818b(view, "view");
        setNavigation(null);
        super.mo7053d(view);
    }

    /* renamed from: a */
    public void mo13879a(UnlockAnimationView unlockAnimationView) {
        C12932j.m33818b(unlockAnimationView, "<set-?>");
        this.f15265Z = unlockAnimationView;
    }

    /* renamed from: a */
    public void mo9738a(Context context, MyProfilePresenter myProfilePresenter) {
        C12932j.m33818b(context, "context");
        C12932j.m33818b(myProfilePresenter, "presenter");
        myProfilePresenter.mo13820a(context, (MyProfileTarget) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        C7707a.m18761b("profile:onCreateView");
        try {
            return super.mo7054a(layoutInflater, viewGroup);
        } finally {
            C7707a.m18759a();
        }
    }
}
