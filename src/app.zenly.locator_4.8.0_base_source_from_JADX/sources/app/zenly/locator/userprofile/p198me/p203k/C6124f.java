package app.zenly.locator.userprofile.p198me.p203k;

import android.view.View;
import android.view.View.OnClickListener;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.userprofile.p198me.MyProfileBindingContext;
import app.zenly.locator.userprofile.p198me.MyProfileBindingContext.VisibilityChangeCallback;
import app.zenly.locator.userprofile.p198me.p200h.C6094h;
import app.zenly.locator.userprofile.p198me.p204l.C6140g;
import com.airbnb.lottie.LottieAnimationView;
import com.snap.p327ui.event.EventDispatcher;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.C7708a;

/* renamed from: app.zenly.locator.userprofile.me.k.f */
public final class C6124f extends C7708a<MyProfileBindingContext, C6140g> {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f15389e;

    /* renamed from: f */
    private final C6126b f15390f = new C6126b(this);

    /* renamed from: g */
    private HashMap f15391g;

    /* renamed from: app.zenly.locator.userprofile.me.k.f$a */
    static final class C6125a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C6124f f15392e;

        C6125a(C6124f fVar) {
            this.f15392e = fVar;
        }

        public final void onClick(View view) {
            EventDispatcher a = this.f15392e.mo34491a();
            LottieAnimationView lottieAnimationView = (LottieAnimationView) this.f15392e.mo13956a(C3891l.profile_friendship_facts_unlockable);
            C12932j.m33815a((Object) lottieAnimationView, "profile_friendship_facts_unlockable");
            a.dispatch(new C6094h(lottieAnimationView));
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.k.f$b */
    public static final class C6126b implements VisibilityChangeCallback {

        /* renamed from: a */
        final /* synthetic */ C6124f f15393a;

        C6126b(C6124f fVar) {
            this.f15393a = fVar;
        }

        public void onVisibilityChange(boolean z) {
            this.f15393a.f15389e = z;
            if (this.f15393a.mo34495d()) {
                this.f15393a.m16942g();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m16942g() {
        LottieAnimationView lottieAnimationView = (LottieAnimationView) mo13956a(C3891l.profile_friendship_facts_unlockable);
        if (this.f15389e) {
            lottieAnimationView.setAnimation((int) R.raw.lottie_locked);
            lottieAnimationView.mo22807d();
            return;
        }
        lottieAnimationView.mo22797a();
    }

    /* renamed from: a */
    public View mo13956a(int i) {
        if (this.f15391g == null) {
            this.f15391g = new HashMap();
        }
        View view = (View) this.f15391g.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f15391g.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13942a(MyProfileBindingContext myProfileBindingContext, View view) {
        C12932j.m33818b(myProfileBindingContext, "bindingContext");
        C12932j.m33818b(view, "itemView");
        myProfileBindingContext.mo13816a(this.f15390f);
        view.setClipToOutline(true);
        view.setOnClickListener(new C6125a(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C6140g gVar, C6140g gVar2) {
        C12932j.m33818b(gVar, "model");
        m16942g();
    }
}
