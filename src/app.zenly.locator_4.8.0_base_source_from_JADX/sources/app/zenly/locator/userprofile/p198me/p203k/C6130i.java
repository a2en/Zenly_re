package app.zenly.locator.userprofile.p198me.p203k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0540a;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.p143s.p160v.p161b.C5516a;
import app.zenly.locator.p143s.p160v.p161b.C5543i;
import app.zenly.locator.userprofile.p198me.MyProfileBindingContext;
import app.zenly.locator.userprofile.p198me.MyProfileBindingContext.VisibilityChangeCallback;
import app.zenly.locator.userprofile.p198me.p200h.C6092f;
import app.zenly.locator.userprofile.p198me.p200h.C6098l;
import app.zenly.locator.userprofile.p198me.p204l.C6134a;
import app.zenly.locator.userprofile.p198me.p204l.C6144k;
import com.airbnb.lottie.LottieAnimationView;
import com.snap.p327ui.event.EventDispatcher;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;
import p250f.p251a.p252a.p253a.p260i.C7685b;
import p250f.p251a.p252a.p253a.p260i.p261f.C7690a;
import p250f.p251a.p252a.p253a.p260i.p261f.C7691b;
import p250f.p251a.p252a.p263b.p264a.p272j.C7708a;
import p250f.p251a.p252a.p263b.p264a.p272j.C7710c;
import p250f.p251a.p252a.p263b.p279d.C7770f;

/* renamed from: app.zenly.locator.userprofile.me.k.i */
public final class C6130i extends C7708a<MyProfileBindingContext, C6134a<C6144k>> {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f15398e;

    /* renamed from: f */
    private final C6133c f15399f = new C6133c(this);

    /* renamed from: g */
    private HashMap f15400g;

    /* renamed from: app.zenly.locator.userprofile.me.k.i$a */
    static final class C6131a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C6130i f15401e;

        /* renamed from: f */
        final /* synthetic */ C6144k f15402f;

        C6131a(C6130i iVar, C6144k kVar) {
            this.f15401e = iVar;
            this.f15402f = kVar;
        }

        public final void onClick(View view) {
            EventDispatcher a = this.f15401e.mo34491a();
            String uuid = this.f15402f.mo13992n().getUuid();
            C12932j.m33815a((Object) uuid, "model.user.uuid");
            a.dispatch(new C6092f(uuid, this.f15402f.mo13989k(), this.f15402f.mo13986h()));
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.k.i$b */
    static final class C6132b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C6130i f15403e;

        /* renamed from: f */
        final /* synthetic */ boolean f15404f;

        /* renamed from: g */
        final /* synthetic */ C6144k f15405g;

        C6132b(C6130i iVar, boolean z, C6144k kVar) {
            this.f15403e = iVar;
            this.f15404f = z;
            this.f15405g = kVar;
        }

        public final void onClick(View view) {
            this.f15403e.mo34491a().dispatch(new C6098l(this.f15404f, this.f15405g));
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.k.i$c */
    public static final class C6133c implements VisibilityChangeCallback {

        /* renamed from: a */
        final /* synthetic */ C6130i f15406a;

        C6133c(C6130i iVar) {
            this.f15406a = iVar;
        }

        public void onVisibilityChange(boolean z) {
            this.f15406a.f15398e = z;
            if (this.f15406a.mo34495d()) {
                C6130i iVar = this.f15406a;
                iVar.mo6952a(C6130i.m16956a(iVar), null);
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C6134a m16956a(C6130i iVar) {
        return (C6134a) iVar.mo34494c();
    }

    /* renamed from: c */
    private final boolean m16963c(C6144k kVar) {
        return C7710c.m18767b(kVar.mo13986h().mo6640b(), 8);
    }

    /* renamed from: a */
    public View mo13965a(int i) {
        if (this.f15400g == null) {
            this.f15400g = new HashMap();
        }
        View view = (View) this.f15400g.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f15400g.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: b */
    private final void m16961b(C6144k kVar) {
        int i;
        int j = 3 - kVar.mo13988j();
        boolean z = j > 0;
        String str = "profile_watchers_background_image";
        if (z) {
            ((AppCompatTextView) mo13965a(C3891l.profile_watchers_title)).setText(R.string.profile_watchers_locked_title);
            i = R.plurals.profile_watchers_locked_subtitle;
            AppCompatImageView appCompatImageView = (AppCompatImageView) mo13965a(C3891l.profile_watchers_background_image);
            C12932j.m33815a((Object) appCompatImageView, str);
            appCompatImageView.setVisibility(0);
            ConstraintLayout constraintLayout = (ConstraintLayout) mo13965a(C3891l.profile_watchers);
            C12932j.m33815a((Object) constraintLayout, "profile_watchers");
            constraintLayout.setClipToOutline(true);
            ((AppCompatImageView) mo13965a(C3891l.profile_watchers_background_image)).setImageResource(2131231498);
        } else {
            ((AppCompatTextView) mo13965a(C3891l.profile_watchers_title)).setText(R.string.profile_fame_title);
            i = R.plurals.profile_watchers_content;
            j = kVar.mo13990l();
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) mo13965a(C3891l.profile_watchers_background_image);
            C12932j.m33815a((Object) appCompatImageView2, str);
            appCompatImageView2.setVisibility(8);
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) mo13965a(C3891l.profile_watchers_subtitle);
        C12932j.m33815a((Object) appCompatTextView, "profile_watchers_subtitle");
        m16958a((TextView) appCompatTextView, i, j);
        ((ConstraintLayout) mo13965a(C3891l.profile_watchers)).setOnClickListener(new C6132b(this, z, kVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13942a(MyProfileBindingContext myProfileBindingContext, View view) {
        C12932j.m33818b(myProfileBindingContext, "bindingContext");
        C12932j.m33818b(view, "itemView");
        myProfileBindingContext.mo13816a(this.f15399f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C6134a<C6144k> aVar, C6134a<C6144k> aVar2) {
        C12932j.m33818b(aVar, "model");
        m16960a((C6144k) aVar.mo13970f());
        m16961b((C6144k) aVar.mo13970f());
    }

    /* renamed from: a */
    private final void m16960a(C6144k kVar) {
        int max = Math.max(0, kVar.mo13986h().mo6638a());
        kVar.mo13987i().mo6647a(kVar.mo13986h(), max, this.f15398e);
        boolean c = m16963c(kVar);
        ConstraintLayout constraintLayout = (ConstraintLayout) mo13965a(C3891l.profile_descendants);
        C12932j.m33815a((Object) constraintLayout, "profile_descendants");
        constraintLayout.setSelected(c);
        String str = "profile_descendants_subtitle";
        if (c) {
            ((AppCompatTextView) mo13965a(C3891l.profile_descendants_title)).setText(R.string.profile_descendants_new);
            AppCompatTextView appCompatTextView = (AppCompatTextView) mo13965a(C3891l.profile_descendants_subtitle);
            C12932j.m33815a((Object) appCompatTextView, str);
            appCompatTextView.setVisibility(8);
        } else {
            ((AppCompatTextView) mo13965a(C3891l.profile_descendants_title)).setText(max == 0 ? R.string.profile_descendants_empty : R.string.profile_descendants_title);
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) mo13965a(C3891l.profile_descendants_subtitle);
            C12932j.m33815a((Object) appCompatTextView2, str);
            appCompatTextView2.setVisibility(0);
        }
        String str2 = "profile_descendants_lottie";
        if (!this.f15398e || !c) {
            LottieAnimationView lottieAnimationView = (LottieAnimationView) mo13965a(C3891l.profile_descendants_lottie);
            C12932j.m33815a((Object) lottieAnimationView, str2);
            lottieAnimationView.setVisibility(8);
            ((LottieAnimationView) mo13965a(C3891l.profile_descendants_lottie)).mo22797a();
        } else {
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) mo13965a(C3891l.profile_descendants_lottie);
            C12932j.m33815a((Object) lottieAnimationView2, str2);
            lottieAnimationView2.setVisibility(0);
            ((LottieAnimationView) mo13965a(C3891l.profile_descendants_lottie)).mo22807d();
        }
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) mo13965a(C3891l.profile_descendants_subtitle);
        C12932j.m33815a((Object) appCompatTextView3, str);
        AppCompatTextView appCompatTextView4 = (AppCompatTextView) mo13965a(C3891l.profile_descendants_subtitle);
        C12932j.m33815a((Object) appCompatTextView4, str);
        Context context = appCompatTextView4.getContext();
        C12932j.m33815a((Object) context, "profile_descendants_subtitle.context");
        appCompatTextView3.setText(C5516a.m15639a(context, (long) max));
        ((ConstraintLayout) mo13965a(C3891l.profile_descendants)).setOnClickListener(new C6131a(this, kVar));
    }

    /* renamed from: a */
    private final CharSequence m16957a(Context context, int i, int i2) {
        if (!C7674a.m18692a(i)) {
            return "%s";
        }
        String quantityString = context.getResources().getQuantityString(i, i2);
        C12932j.m33815a((Object) quantityString, "resources.getQuantityString(pluralsRes, value)");
        return quantityString;
    }

    /* renamed from: a */
    private final void m16958a(TextView textView, int i, int i2) {
        ColorStateList b = C0540a.m2543b(textView.getContext(), (int) R.color.selector_text_color_primary_with_select_button_primary);
        if (b != null) {
            C12932j.m33815a((Object) b, "ContextCompat.getColorSt…_select_button_primary)!!");
            Context context = textView.getContext();
            String str = "context";
            C12932j.m33815a((Object) context, str);
            CharSequence a = m16957a(context, i, i2);
            C7685b bVar = new C7685b();
            bVar.mo19897a((Object) new C7690a(b, null, 2, null));
            Context context2 = textView.getContext();
            C12932j.m33815a((Object) context2, str);
            bVar.mo19897a((Object) new C7691b(context2, C7770f.TextAppearance_LCD));
            Context context3 = textView.getContext();
            C12932j.m33815a((Object) context3, str);
            bVar.mo19896a((CharSequence) C5516a.m15639a(context3, (long) i2));
            bVar.mo19899c();
            bVar.mo19899c();
            textView.setText(C5543i.m15727a(a, "", bVar.mo19893a()));
            return;
        }
        C12932j.m33814a();
        throw null;
    }
}
