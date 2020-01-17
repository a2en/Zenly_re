package app.zenly.locator.userprofile.p198me.p203k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.glide.C2476d;
import app.zenly.locator.core.glide.p067j.C2490c;
import app.zenly.locator.userprofile.p198me.MyProfileBindingContext;
import app.zenly.locator.userprofile.p198me.MyProfileBindingContext.VisibilityChangeCallback;
import app.zenly.locator.userprofile.p198me.appicons.C6042a;
import app.zenly.locator.userprofile.p198me.appicons.C6042a.C6044b;
import app.zenly.locator.userprofile.p198me.appicons.C6058i;
import app.zenly.locator.userprofile.p198me.p200h.C6087a;
import app.zenly.locator.userprofile.p198me.p200h.C6088b;
import app.zenly.locator.userprofile.p198me.p204l.C6135b;
import com.airbnb.lottie.LottieAnimationView;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.request.C9224d;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$UserEngagementStats;
import p213co.znly.models.UserProto$UserEngagementStats.C6929b;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;
import p250f.p251a.p252a.p253a.p256f.p257a.C7678c;
import p250f.p251a.p252a.p263b.p264a.p272j.C7708a;

/* renamed from: app.zenly.locator.userprofile.me.k.a */
public final class C6111a extends C7708a<MyProfileBindingContext, C6135b> {
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f15367e;

    /* renamed from: f */
    private final C6115d f15368f = new C6115d(this);

    /* renamed from: g */
    private HashMap f15369g;

    /* renamed from: app.zenly.locator.userprofile.me.k.a$a */
    public static final class C6112a {
        private C6112a() {
        }

        public /* synthetic */ C6112a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.k.a$b */
    static final class C6113b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C6111a f15370e;

        /* renamed from: f */
        final /* synthetic */ UserProto$UserEngagementStats f15371f;

        /* renamed from: g */
        final /* synthetic */ C6042a f15372g;

        C6113b(C6111a aVar, UserProto$UserEngagementStats userProto$UserEngagementStats, C6042a aVar2) {
            this.f15370e = aVar;
            this.f15371f = userProto$UserEngagementStats;
            this.f15372g = aVar2;
        }

        public final void onClick(View view) {
            this.f15370e.mo34491a().dispatch(new C6087a(this.f15371f, this.f15372g, C6042a.f15221k));
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.k.a$c */
    static final class C6114c implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C6111a f15373e;

        /* renamed from: f */
        final /* synthetic */ C6042a f15374f;

        /* renamed from: g */
        final /* synthetic */ C6042a f15375g;

        /* renamed from: h */
        final /* synthetic */ LottieAnimationView f15376h;

        /* renamed from: i */
        final /* synthetic */ UserProto$UserEngagementStats f15377i;

        C6114c(C6111a aVar, C6042a aVar2, C6042a aVar3, LottieAnimationView lottieAnimationView, UserProto$UserEngagementStats userProto$UserEngagementStats) {
            this.f15373e = aVar;
            this.f15374f = aVar2;
            this.f15375g = aVar3;
            this.f15376h = lottieAnimationView;
            this.f15377i = userProto$UserEngagementStats;
        }

        public final void onClick(View view) {
            C6042a aVar = this.f15374f;
            C6042a aVar2 = C6042a.f15221k;
            if ((aVar == aVar2 && this.f15375g == aVar2) || !C6111a.m16912b(this.f15373e).mo13971f().mo13867a(this.f15374f, this.f15375g)) {
                this.f15373e.mo34491a().dispatch(new C6087a(this.f15377i, this.f15374f, this.f15375g));
                return;
            }
            C6111a.m16912b(this.f15373e).mo13971f().mo13869b(this.f15375g);
            this.f15373e.mo34491a().dispatch(new C6088b(this.f15374f, this.f15375g, this.f15376h));
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.k.a$d */
    public static final class C6115d implements VisibilityChangeCallback {

        /* renamed from: a */
        final /* synthetic */ C6111a f15378a;

        C6115d(C6111a aVar) {
            this.f15378a = aVar;
        }

        public void onVisibilityChange(boolean z) {
            this.f15378a.f15367e = z;
            if (this.f15378a.mo34495d()) {
                this.f15378a.m16914g();
            }
        }
    }

    static {
        new C6112a(null);
    }

    /* renamed from: b */
    public static final /* synthetic */ C6135b m16912b(C6111a aVar) {
        return (C6135b) aVar.mo34494c();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m16914g() {
        UserProto$UserEngagementStats g = ((C6135b) mo34494c()).mo13972g();
        C6044b bVar = C6042a.f15226p;
        C6929b level = g.getLevel();
        C12932j.m33815a((Object) level, "userEngagement.level");
        C6042a a = bVar.mo13857a(level);
        AppCompatImageView appCompatImageView = (AppCompatImageView) mo13939a(C3891l.profile_app_icon_1);
        C12932j.m33815a((Object) appCompatImageView, "profile_app_icon_1");
        m16907a(appCompatImageView, a, C6042a.f15221k);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) mo13939a(C3891l.profile_app_icon_2);
        String str = "profile_app_icon_2";
        C12932j.m33815a((Object) lottieAnimationView, str);
        m16907a(lottieAnimationView, a, C6042a.f15222l);
        LottieAnimationView lottieAnimationView2 = (LottieAnimationView) mo13939a(C3891l.profile_app_icon_3);
        String str2 = "profile_app_icon_3";
        C12932j.m33815a((Object) lottieAnimationView2, str2);
        m16907a(lottieAnimationView2, a, C6042a.f15223m);
        LottieAnimationView lottieAnimationView3 = (LottieAnimationView) mo13939a(C3891l.profile_app_icon_4);
        String str3 = "profile_app_icon_4";
        C12932j.m33815a((Object) lottieAnimationView3, str3);
        m16907a(lottieAnimationView3, a, C6042a.f15224n);
        m16910a(g);
        ((AppCompatImageView) mo13939a(C3891l.profile_app_icon_1)).setOnClickListener(new C6113b(this, g, a));
        LottieAnimationView lottieAnimationView4 = (LottieAnimationView) mo13939a(C3891l.profile_app_icon_2);
        C12932j.m33815a((Object) lottieAnimationView4, str);
        m16911a(lottieAnimationView4, g, a, C6042a.f15222l);
        LottieAnimationView lottieAnimationView5 = (LottieAnimationView) mo13939a(C3891l.profile_app_icon_3);
        C12932j.m33815a((Object) lottieAnimationView5, str2);
        m16911a(lottieAnimationView5, g, a, C6042a.f15223m);
        LottieAnimationView lottieAnimationView6 = (LottieAnimationView) mo13939a(C3891l.profile_app_icon_4);
        C12932j.m33815a((Object) lottieAnimationView6, str3);
        m16911a(lottieAnimationView6, g, a, C6042a.f15224n);
    }

    /* renamed from: a */
    public View mo13939a(int i) {
        if (this.f15369g == null) {
            this.f15369g = new HashMap();
        }
        View view = (View) this.f15369g.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f15369g.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo13942a(MyProfileBindingContext myProfileBindingContext, View view) {
        C12932j.m33818b(myProfileBindingContext, "bindingContext");
        C12932j.m33818b(view, "itemView");
        myProfileBindingContext.mo13816a(this.f15368f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C6135b bVar, C6135b bVar2) {
        C12932j.m33818b(bVar, "model");
        m16914g();
    }

    /* renamed from: a */
    private final void m16907a(ImageView imageView, C6042a aVar, C6042a aVar2) {
        int i;
        String str = "target.context";
        if (((C6135b) mo34494c()).mo13971f().mo13867a(aVar, aVar2)) {
            Context context = imageView.getContext();
            C12932j.m33815a((Object) context, str);
            i = C7678c.m18705c(context, R.attr.zenlyIconPrimaryBackground);
            Context context2 = imageView.getContext();
            C12932j.m33815a((Object) context2, str);
            imageView.setImageTintList(ColorStateList.valueOf(C7678c.m18702a(context2, (int) R.attr.zenlyButtonPrimaryTextColor)));
            if (imageView != null) {
                LottieAnimationView lottieAnimationView = (LottieAnimationView) imageView;
                lottieAnimationView.setImageResource(C7674a.f19294a);
                lottieAnimationView.setAnimation((int) R.raw.lottie_locked);
                if (this.f15367e) {
                    lottieAnimationView.mo22807d();
                } else {
                    lottieAnimationView.mo22797a();
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.airbnb.lottie.LottieAnimationView");
            }
        } else {
            Context context3 = imageView.getContext();
            C12932j.m33815a((Object) context3, str);
            int c = C7678c.m18705c(context3, R.attr.zenlyIconTertiaryBackground);
            LottieAnimationView lottieAnimationView2 = (LottieAnimationView) (!(imageView instanceof LottieAnimationView) ? null : imageView);
            if (lottieAnimationView2 != null) {
                lottieAnimationView2.clearAnimation();
            }
            if (aVar.mo13852a(aVar2)) {
                imageView.setImageTintList(null);
                m16906a(aVar2.getProfileIcon(), imageView);
            } else {
                Context context4 = imageView.getContext();
                C12932j.m33815a((Object) context4, str);
                imageView.setImageTintList(ColorStateList.valueOf(C7678c.m18702a(context4, (int) R.attr.zenlyButtonTertiaryTextColor)));
                imageView.setImageResource(R.drawable.icon_lock_size_56);
            }
            i = c;
        }
        imageView.setBackgroundResource(i);
    }

    /* renamed from: a */
    private final void m16906a(int i, ImageView imageView) {
        Context context = mo34493b().getContext();
        C12932j.m33815a((Object) context, "itemView.context");
        C2476d.m8583a(mo34493b()).m8717a(Integer.valueOf(i)).m8693a(((C9224d) ((C9224d) new C9224d().mo8522b(context.getResources().getDimensionPixelSize(R.dimen.grid_size_350))).mo8516a((Transformation<Bitmap>) new C2490c<Bitmap>(null, 1, null))).mo8525e()).mo24173a(imageView);
    }

    /* renamed from: a */
    private final void m16910a(UserProto$UserEngagementStats userProto$UserEngagementStats) {
        Context context = mo34493b().getContext();
        int a = C6058i.m16808a(userProto$UserEngagementStats);
        String str = "profile_icons_description";
        if (a < 2) {
            AppCompatTextView appCompatTextView = (AppCompatTextView) mo13939a(C3891l.profile_icons_description);
            C12932j.m33815a((Object) appCompatTextView, str);
            appCompatTextView.setVisibility(8);
            return;
        }
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) mo13939a(C3891l.profile_icons_description);
        C12932j.m33815a((Object) appCompatTextView2, str);
        appCompatTextView2.setVisibility(0);
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) mo13939a(C3891l.profile_icons_description);
        C12932j.m33815a((Object) appCompatTextView3, str);
        C12932j.m33815a((Object) context, "context");
        appCompatTextView3.setText(context.getResources().getQuantityString(R.plurals.profile_streak, a, new Object[]{Integer.valueOf(a)}));
    }

    /* renamed from: a */
    private final void m16911a(LottieAnimationView lottieAnimationView, UserProto$UserEngagementStats userProto$UserEngagementStats, C6042a aVar, C6042a aVar2) {
        C6114c cVar = new C6114c(this, aVar, aVar2, lottieAnimationView, userProto$UserEngagementStats);
        lottieAnimationView.setOnClickListener(cVar);
    }
}
