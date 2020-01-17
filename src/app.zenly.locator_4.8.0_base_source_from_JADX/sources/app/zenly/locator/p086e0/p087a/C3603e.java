package app.zenly.locator.p086e0.p087a;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import app.zenly.android.feature.base.model.AvatarLoader.Request;
import app.zenly.android.feature.base.scheduling.C1342b;
import app.zenly.locator.C3891l;
import app.zenly.locator.core.contracts.NavigationContract.C2469c;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.helper.C2509b;
import app.zenly.locator.core.invitations.C2538c0;
import app.zenly.locator.core.invitations.C2587f0;
import app.zenly.locator.core.invitations.C2623w;
import app.zenly.locator.core.invitations.C2625y;
import app.zenly.locator.core.invitations.C2625y.C2626a;
import app.zenly.locator.core.invitations.InvitationCallback;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import kotlinx.android.extensions.LayoutContainer;
import p213co.znly.models.C6947a3;
import p213co.znly.models.UserProto$User;
import p387h.p388a.C12143a;
import p389io.reactivex.C12279e;
import p389io.reactivex.C12286f;
import p389io.reactivex.ObservableSource;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.functions.Function5;
import p389io.reactivex.p405m.C12773a;
import p389io.reactivex.p405m.C12774b;

/* renamed from: app.zenly.locator.e0.a.e */
public final class C3603e implements LayoutContainer {

    /* renamed from: a */
    private final C12275b f9687a = new C12275b();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2477e f9688b;

    /* renamed from: c */
    private final View f9689c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final String f9690d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C2538c0 f9691e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C5498a f9692f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C3615f f9693g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C3592c f9694h;

    /* renamed from: i */
    private final C12279e<UserProto$User> f9695i;

    /* renamed from: j */
    private final C12279e<Boolean> f9696j;

    /* renamed from: k */
    private final C12279e<Boolean> f9697k;

    /* renamed from: l */
    private final C12279e<Long> f9698l;

    /* renamed from: m */
    private final C12279e<Boolean> f9699m;

    /* renamed from: n */
    private final C1342b f9700n;

    /* renamed from: o */
    private HashMap f9701o;

    /* renamed from: app.zenly.locator.e0.a.e$a */
    public static final class C3604a<T1, T2, T3, T4, T5, R> implements Function5<T1, T2, T3, T4, T5, R> {
        public final R apply(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
            long longValue = ((Number) t5).longValue();
            UserProto$User userProto$User = (UserProto$User) t1;
            C3573a aVar = new C3573a(((Boolean) t2).booleanValue(), ((Boolean) t4).booleanValue(), ((Boolean) t3).booleanValue(), userProto$User.getBlockRelationship() == C6947a3.f17116h, userProto$User.getPrivateMode(), longValue);
            aVar.mo10040a(userProto$User);
            return aVar;
        }
    }

    /* renamed from: app.zenly.locator.e0.a.e$b */
    static final class C3605b<T> implements Consumer<UserProto$User> {

        /* renamed from: e */
        final /* synthetic */ C3603e f9702e;

        C3605b(C3603e eVar) {
            this.f9702e = eVar;
        }

        /* renamed from: a */
        public final void accept(UserProto$User userProto$User) {
            C2477e a = this.f9702e.f9688b;
            C12932j.m33815a((Object) userProto$User, "user");
            Request load = a.load(C2884f.m9355a(userProto$User));
            AppCompatImageView appCompatImageView = (AppCompatImageView) this.f9702e.mo10080a(C3891l.user_profile_avatar);
            C12932j.m33815a((Object) appCompatImageView, "user_profile_avatar");
            load.into(appCompatImageView);
        }
    }

    /* renamed from: app.zenly.locator.e0.a.e$c */
    static final class C3606c<T> implements Consumer<C3573a> {

        /* renamed from: e */
        final /* synthetic */ C3603e f9703e;

        C3606c(C3603e eVar) {
            this.f9703e = eVar;
        }

        /* renamed from: a */
        public final void accept(C3573a aVar) {
            C3603e eVar = this.f9703e;
            C12932j.m33815a((Object) aVar, "model");
            eVar.m10897a(aVar);
        }
    }

    /* renamed from: app.zenly.locator.e0.a.e$d */
    static final class C3607d<T> implements Consumer<Throwable> {

        /* renamed from: e */
        public static final C3607d f9704e = new C3607d();

        C3607d() {
        }

        /* renamed from: a */
        public final void accept(Throwable th) {
            C12143a.m32032b(th, "Could not update profile other header for avatar check", new Object[0]);
        }
    }

    /* renamed from: app.zenly.locator.e0.a.e$e */
    static final class C3608e implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3603e f9705e;

        /* renamed from: f */
        final /* synthetic */ C3573a f9706f;

        C3608e(C3603e eVar, int i, int i2, C3573a aVar) {
            this.f9705e = eVar;
            this.f9706f = aVar;
        }

        public final void onClick(View view) {
            C5498a.m15602a(this.f9705e.f9692f, C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            C2538c0 d = this.f9705e.f9691e;
            C2625y a = C2626a.m8955a(C2625y.f7738e, C2587f0.PROFILE_OTHER_HEADER, this.f9706f.mo10043c(), this.f9706f.mo10047f(), null, false, 16, null);
            C12932j.m33815a((Object) view, "v");
            Context context = view.getContext();
            C12932j.m33815a((Object) context, "v.context");
            d.mo8670a(a, (InvitationCallback) new C2623w(context, false));
        }
    }

    /* renamed from: app.zenly.locator.e0.a.e$f */
    static final class C3609f implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3603e f9707e;

        /* renamed from: f */
        final /* synthetic */ C3573a f9708f;

        C3609f(C3603e eVar, C3573a aVar) {
            this.f9707e = eVar;
            this.f9708f = aVar;
        }

        public final void onClick(View view) {
            C5498a.m15602a(this.f9707e.f9692f, C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            this.f9707e.f9694h.mo10071b(this.f9708f.mo10043c());
        }
    }

    /* renamed from: app.zenly.locator.e0.a.e$g */
    static final class C3610g implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3603e f9709e;

        /* renamed from: f */
        final /* synthetic */ C3573a f9710f;

        C3610g(C3603e eVar, C3573a aVar) {
            this.f9709e = eVar;
            this.f9710f = aVar;
        }

        public final void onClick(View view) {
            C5343a.m15160U().mo12804S();
            C5498a.m15602a(this.f9709e.f9692f, C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            C3615f e = this.f9709e.f9693g;
            String username = this.f9710f.mo10043c().getUsername();
            C12932j.m33815a((Object) username, "model.user.username");
            e.mo10099a(username, this.f9710f.mo10043c().getIdCardStyleValue());
        }
    }

    /* renamed from: app.zenly.locator.e0.a.e$h */
    public static final class C3611h extends C2509b {

        /* renamed from: g */
        final /* synthetic */ C3603e f9711g;

        C3611h(C3603e eVar) {
            this.f9711g = eVar;
        }

        /* renamed from: a */
        public void mo7322a(View view) {
            C12932j.m33818b(view, "v");
            C5498a.m15602a(this.f9711g.f9692f, C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            this.f9711g.f9693g.mo10094a(C2469c.PRIVACY, this.f9711g.f9690d);
        }
    }

    /* renamed from: app.zenly.locator.e0.a.e$i */
    public static final class C3612i extends C2509b {

        /* renamed from: g */
        final /* synthetic */ C3603e f9712g;

        /* renamed from: h */
        final /* synthetic */ C3573a f9713h;

        C3612i(C3603e eVar, C3573a aVar) {
            this.f9712g = eVar;
            this.f9713h = aVar;
        }

        /* renamed from: a */
        public void mo7322a(View view) {
            C12932j.m33818b(view, "v");
            C5343a.m15160U().mo12786A();
            C5498a.m15602a(this.f9712g.f9692f, C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            C3592c b = this.f9712g.f9694h;
            String phoneNumber = this.f9713h.mo10043c().getPhoneNumber();
            C12932j.m33815a((Object) phoneNumber, "model.user.phoneNumber");
            b.mo10070a(phoneNumber);
        }
    }

    /* renamed from: app.zenly.locator.e0.a.e$j */
    static final class C3613j implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3603e f9714e;

        /* renamed from: f */
        final /* synthetic */ C3573a f9715f;

        C3613j(C3603e eVar, C3573a aVar) {
            this.f9714e = eVar;
            this.f9715f = aVar;
        }

        public final void onClick(View view) {
            C5498a.m15602a(this.f9714e.f9692f, C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            this.f9714e.f9694h.mo10068a(this.f9715f.mo10043c());
        }
    }

    /* renamed from: app.zenly.locator.e0.a.e$k */
    static final class C3614k implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3603e f9716e;

        /* renamed from: f */
        final /* synthetic */ C3573a f9717f;

        C3614k(C3603e eVar, C3573a aVar) {
            this.f9716e = eVar;
            this.f9717f = aVar;
        }

        public final void onClick(View view) {
            C5498a.m15602a(this.f9716e.f9692f, C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            this.f9716e.f9694h.mo10069a(this.f9717f.mo10043c(), this.f9717f.mo10044d());
        }
    }

    public C3603e(View view, String str, C2538c0 c0Var, C5498a aVar, C3615f fVar, C3592c cVar, C12279e<UserProto$User> eVar, C12279e<Boolean> eVar2, C12279e<Boolean> eVar3, C12279e<Long> eVar4, C12279e<Boolean> eVar5, C1342b bVar) {
        C12932j.m33818b(view, "containerView");
        C12932j.m33818b(str, "userUuid");
        C12932j.m33818b(c0Var, "inviteManager");
        C12932j.m33818b(aVar, "haptic");
        C12932j.m33818b(fVar, "navigation");
        C12932j.m33818b(cVar, "dialogLauncher");
        C12932j.m33818b(eVar, "userObservable");
        C12932j.m33818b(eVar2, "isUserBlockedObservable");
        C12932j.m33818b(eVar3, "isFriendObservable");
        C12932j.m33818b(eVar4, "friendsSinceObservable");
        C12932j.m33818b(eVar5, "isInvitedObservable");
        C12932j.m33818b(bVar, "uiScheduler");
        this.f9689c = view;
        this.f9690d = str;
        this.f9691e = c0Var;
        this.f9692f = aVar;
        this.f9693g = fVar;
        this.f9694h = cVar;
        this.f9695i = eVar;
        this.f9696j = eVar2;
        this.f9697k = eVar3;
        this.f9698l = eVar4;
        this.f9699m = eVar5;
        this.f9700n = bVar;
        ConstraintLayout constraintLayout = (ConstraintLayout) mo10080a(C3891l.user_profile_header);
        Context context = getContainerView().getContext();
        C12932j.m33815a((Object) context, "containerView.context");
        this.f9688b = new C2477e(context);
    }

    /* renamed from: a */
    public View mo10080a(int i) {
        if (this.f9701o == null) {
            this.f9701o = new HashMap();
        }
        View view = (View) this.f9701o.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f9701o.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public View getContainerView() {
        return this.f9689c;
    }

    /* renamed from: b */
    public final void mo10082b() {
        this.f9687a.mo36401a();
    }

    /* renamed from: a */
    public final void mo10081a() {
        Disposable d = this.f9695i.mo36428a((C12286f) this.f9700n.mo6569a("user")).mo36476d((Consumer<? super T>) new C3605b<Object>(this));
        C12932j.m33815a((Object) d, "userObservable.observeOn…ile_avatar)\n            }");
        C12773a.m33432a(d, this.f9687a);
        C12774b bVar = C12774b.f33320a;
        Disposable a = C12279e.m32607a((ObservableSource<? extends T1>) this.f9695i, (ObservableSource<? extends T2>) this.f9697k, (ObservableSource<? extends T3>) this.f9696j, (ObservableSource<? extends T4>) this.f9699m, (ObservableSource<? extends T5>) this.f9698l, (Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R>) new C3604a<Object,Object,Object,Object,Object,Object>()).mo36477d().mo36428a((C12286f) this.f9700n.mo6569a("viewModel")).mo36412a((Consumer<? super T>) new C3606c<Object>(this), (Consumer<? super Throwable>) C3607d.f9704e);
        C12932j.m33815a((Object) a, "viewModelObservable\n    …der for avatar check\") })");
        C12773a.m33432a(a, this.f9687a);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x02a1  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m10897a(app.zenly.locator.p086e0.p087a.C3573a r15) {
        /*
            r14 = this;
            int r0 = app.zenly.locator.C3891l.user_profile_name
            android.view.View r0 = r14.mo10080a(r0)
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            java.lang.String r1 = "user_profile_name"
            kotlin.jvm.internal.C12932j.m33815a(r0, r1)
            co.znly.models.UserProto$User r1 = r15.mo10043c()
            java.lang.String r1 = r1.getName()
            r0.setText(r1)
            int r0 = app.zenly.locator.C3891l.user_profile_avatar
            android.view.View r0 = r14.mo10080a(r0)
            androidx.appcompat.widget.AppCompatImageView r0 = (androidx.appcompat.widget.AppCompatImageView) r0
            app.zenly.locator.e0.a.e$f r1 = new app.zenly.locator.e0.a.e$f
            r1.<init>(r14, r15)
            r0.setOnClickListener(r1)
            int r0 = app.zenly.locator.C3891l.user_profile_state_text
            android.view.View r0 = r14.mo10080a(r0)
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            java.lang.String r1 = "user_profile_state_text"
            kotlin.jvm.internal.C12932j.m33815a(r0, r1)
            android.content.Context r0 = r0.getContext()
            boolean r2 = r15.mo10041a()
            r3 = 1
            r4 = 8
            r5 = 0
            java.lang.String r6 = "it"
            java.lang.String r7 = "user_profile_state_layout"
            if (r2 == 0) goto L_0x0086
            int r2 = app.zenly.locator.C3891l.user_profile_state_text
            android.view.View r2 = r14.mo10080a(r2)
            androidx.appcompat.widget.AppCompatTextView r2 = (androidx.appcompat.widget.AppCompatTextView) r2
            kotlin.jvm.internal.C12932j.m33815a(r2, r1)
            r2.setVisibility(r5)
            int r2 = app.zenly.locator.C3891l.user_profile_state_text
            android.view.View r2 = r14.mo10080a(r2)
            androidx.appcompat.widget.AppCompatTextView r2 = (androidx.appcompat.widget.AppCompatTextView) r2
            kotlin.jvm.internal.C12932j.m33815a(r2, r1)
            r1 = 2132018443(0x7f14050b, float:1.9675193E38)
            java.lang.Object[] r8 = new java.lang.Object[r3]
            co.znly.models.UserProto$User r9 = r15.mo10043c()
            java.lang.String r9 = r9.getName()
            r8[r5] = r9
            java.lang.String r0 = r0.getString(r1, r8)
            r2.setText(r0)
            int r0 = app.zenly.locator.C3891l.user_profile_state_layout
            android.view.View r0 = r14.mo10080a(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            kotlin.jvm.internal.C12932j.m33815a(r0, r7)
            r0.setVisibility(r4)
            goto L_0x01a6
        L_0x0086:
            boolean r2 = r15.mo10044d()
            if (r2 == 0) goto L_0x00d9
            int r2 = app.zenly.locator.C3891l.user_profile_state_text
            android.view.View r2 = r14.mo10080a(r2)
            androidx.appcompat.widget.AppCompatTextView r2 = (androidx.appcompat.widget.AppCompatTextView) r2
            kotlin.jvm.internal.C12932j.m33815a(r2, r1)
            r2.setVisibility(r5)
            int r2 = app.zenly.locator.C3891l.user_profile_state_text
            android.view.View r2 = r14.mo10080a(r2)
            androidx.appcompat.widget.AppCompatTextView r2 = (androidx.appcompat.widget.AppCompatTextView) r2
            kotlin.jvm.internal.C12932j.m33815a(r2, r1)
            r1 = 2132018445(0x7f14050d, float:1.9675197E38)
            java.lang.Object[] r8 = new java.lang.Object[r3]
            co.znly.models.UserProto$User r9 = r15.mo10043c()
            java.lang.String r9 = r9.getName()
            r8[r5] = r9
            java.lang.String r0 = r0.getString(r1, r8)
            r2.setText(r0)
            int r0 = app.zenly.locator.C3891l.user_profile_state_layout
            android.view.View r0 = r14.mo10080a(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            kotlin.jvm.internal.C12932j.m33815a(r0, r7)
            r0.setVisibility(r5)
            int r0 = app.zenly.locator.C3891l.user_profile_state_button
            android.view.View r0 = r14.mo10080a(r0)
            androidx.appcompat.widget.AppCompatImageButton r0 = (androidx.appcompat.widget.AppCompatImageButton) r0
            r1 = 2131231390(0x7f08029e, float:1.807886E38)
            r0.setImageResource(r1)
            goto L_0x01a6
        L_0x00d9:
            boolean r2 = r15.mo10048g()
            if (r2 == 0) goto L_0x0124
            boolean r2 = r15.mo10045e()
            if (r2 != 0) goto L_0x0124
            int r2 = app.zenly.locator.C3891l.user_profile_state_text
            android.view.View r2 = r14.mo10080a(r2)
            androidx.appcompat.widget.AppCompatTextView r2 = (androidx.appcompat.widget.AppCompatTextView) r2
            kotlin.jvm.internal.C12932j.m33815a(r2, r1)
            r2.setVisibility(r5)
            int r2 = app.zenly.locator.C3891l.user_profile_state_text
            android.view.View r2 = r14.mo10080a(r2)
            androidx.appcompat.widget.AppCompatTextView r2 = (androidx.appcompat.widget.AppCompatTextView) r2
            kotlin.jvm.internal.C12932j.m33815a(r2, r1)
            r1 = 2132018444(0x7f14050c, float:1.9675195E38)
            java.lang.Object[] r8 = new java.lang.Object[r3]
            co.znly.models.UserProto$User r9 = r15.mo10043c()
            java.lang.String r9 = r9.getName()
            r8[r5] = r9
            java.lang.String r0 = r0.getString(r1, r8)
            r2.setText(r0)
            int r0 = app.zenly.locator.C3891l.user_profile_state_layout
            android.view.View r0 = r14.mo10080a(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            kotlin.jvm.internal.C12932j.m33815a(r0, r7)
            r0.setVisibility(r4)
            goto L_0x01a6
        L_0x0124:
            boolean r2 = r15.mo10045e()
            if (r2 == 0) goto L_0x018a
            int r1 = app.zenly.locator.C3891l.user_profile_state_text
            android.view.View r1 = r14.mo10080a(r1)
            androidx.appcompat.widget.AppCompatTextView r1 = (androidx.appcompat.widget.AppCompatTextView) r1
            long r8 = r15.mo10042b()
            co.znly.core.vendor.com.google.protobuf.Timestamp r2 = app.zenly.locator.core.util.C3245z.m10282a(r8)
            boolean r8 = app.zenly.locator.core.util.C3245z.m10286e(r2)
            if (r8 != 0) goto L_0x0175
            kotlin.jvm.internal.C12932j.m33815a(r1, r6)
            int r2 = app.zenly.locator.core.util.C3245z.m10280a(r2)
            if (r2 != 0) goto L_0x0151
            r2 = 2132017447(0x7f140127, float:1.9673173E38)
            java.lang.String r0 = r0.getString(r2)
            goto L_0x016e
        L_0x0151:
            if (r2 != r3) goto L_0x015b
            r2 = 2132017448(0x7f140128, float:1.9673175E38)
            java.lang.String r0 = r0.getString(r2)
            goto L_0x016e
        L_0x015b:
            android.content.res.Resources r0 = r1.getResources()
            r8 = 2131886110(0x7f12001e, float:1.940679E38)
            java.lang.Object[] r9 = new java.lang.Object[r3]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r2)
            r9[r5] = r10
            java.lang.String r0 = r0.getQuantityString(r8, r2, r9)
        L_0x016e:
            r1.setText(r0)
            r1.setVisibility(r5)
            goto L_0x017b
        L_0x0175:
            kotlin.jvm.internal.C12932j.m33815a(r1, r6)
            r1.setVisibility(r4)
        L_0x017b:
            int r0 = app.zenly.locator.C3891l.user_profile_state_layout
            android.view.View r0 = r14.mo10080a(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            kotlin.jvm.internal.C12932j.m33815a(r0, r7)
            r0.setVisibility(r4)
            goto L_0x01a6
        L_0x018a:
            int r0 = app.zenly.locator.C3891l.user_profile_state_text
            android.view.View r0 = r14.mo10080a(r0)
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            kotlin.jvm.internal.C12932j.m33815a(r0, r1)
            r0.setVisibility(r4)
            int r0 = app.zenly.locator.C3891l.user_profile_state_layout
            android.view.View r0 = r14.mo10080a(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            kotlin.jvm.internal.C12932j.m33815a(r0, r7)
            r0.setVisibility(r4)
        L_0x01a6:
            int r0 = app.zenly.locator.C3891l.user_profile_settings_button
            android.view.View r0 = r14.mo10080a(r0)
            androidx.appcompat.widget.AppCompatImageView r0 = (androidx.appcompat.widget.AppCompatImageView) r0
            java.lang.String r1 = "user_profile_settings_button"
            kotlin.jvm.internal.C12932j.m33815a(r0, r1)
            r0.setVisibility(r5)
            r0 = 2
            androidx.appcompat.widget.AppCompatImageView[] r0 = new androidx.appcompat.widget.AppCompatImageView[r0]
            int r1 = app.zenly.locator.C3891l.user_profile_ghost_mode_button
            android.view.View r1 = r14.mo10080a(r1)
            androidx.appcompat.widget.AppCompatImageView r1 = (androidx.appcompat.widget.AppCompatImageView) r1
            r0[r5] = r1
            int r1 = app.zenly.locator.C3891l.user_profile_phonecall_button
            android.view.View r1 = r14.mo10080a(r1)
            androidx.appcompat.widget.AppCompatImageView r1 = (androidx.appcompat.widget.AppCompatImageView) r1
            r0[r3] = r1
            int r1 = r0.length
            r2 = 0
        L_0x01cf:
            if (r2 >= r1) goto L_0x01e6
            r7 = r0[r2]
            kotlin.jvm.internal.C12932j.m33815a(r7, r6)
            boolean r8 = r15.mo10045e()
            if (r8 == 0) goto L_0x01de
            r8 = 0
            goto L_0x01e0
        L_0x01de:
            r8 = 8
        L_0x01e0:
            r7.setVisibility(r8)
            int r2 = r2 + 1
            goto L_0x01cf
        L_0x01e6:
            int r0 = app.zenly.locator.C3891l.user_profile_add_button
            android.view.View r0 = r14.mo10080a(r0)
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            java.lang.String r1 = "user_profile_add_button"
            kotlin.jvm.internal.C12932j.m33815a(r0, r1)
            boolean r1 = r15.mo10041a()
            if (r1 != 0) goto L_0x020c
            boolean r1 = r15.mo10044d()
            if (r1 != 0) goto L_0x020c
            boolean r1 = r15.mo10048g()
            if (r1 != 0) goto L_0x020c
            boolean r1 = r15.mo10045e()
            if (r1 != 0) goto L_0x020c
            r4 = 0
        L_0x020c:
            r0.setVisibility(r4)
            boolean r0 = r15.mo10045e()
            java.lang.String r1 = "user_profile_username_link"
            if (r0 == 0) goto L_0x025b
            co.znly.models.UserProto$User r0 = r15.mo10043c()
            java.lang.String r0 = r0.getUsername()
            if (r0 == 0) goto L_0x0229
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0228
            goto L_0x0229
        L_0x0228:
            r3 = 0
        L_0x0229:
            if (r3 != 0) goto L_0x025b
            int r0 = app.zenly.locator.C3891l.user_profile_username_link
            android.view.View r0 = r14.mo10080a(r0)
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            kotlin.jvm.internal.C12932j.m33815a(r0, r1)
            co.znly.models.UserProto$User r1 = r15.mo10043c()
            java.lang.String r1 = r1.getUsername()
            java.lang.String r2 = "model.user.username"
            kotlin.jvm.internal.C12932j.m33815a(r1, r2)
            java.lang.String r1 = app.zenly.locator.username.C5970b.m16566a(r1)
            r0.setText(r1)
            int r0 = app.zenly.locator.C3891l.user_profile_username_link
            android.view.View r0 = r14.mo10080a(r0)
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            app.zenly.locator.e0.a.e$g r1 = new app.zenly.locator.e0.a.e$g
            r1.<init>(r14, r15)
            r0.setOnClickListener(r1)
            goto L_0x026a
        L_0x025b:
            int r0 = app.zenly.locator.C3891l.user_profile_username_link
            android.view.View r0 = r14.mo10080a(r0)
            androidx.appcompat.widget.AppCompatTextView r0 = (androidx.appcompat.widget.AppCompatTextView) r0
            kotlin.jvm.internal.C12932j.m33815a(r0, r1)
            r1 = 0
            r0.setText(r1)
        L_0x026a:
            boolean r0 = r15.mo10045e()
            if (r0 == 0) goto L_0x02a1
            int r0 = app.zenly.locator.C3891l.user_profile_ghost_mode_button
            android.view.View r0 = r14.mo10080a(r0)
            androidx.appcompat.widget.AppCompatImageView r0 = (androidx.appcompat.widget.AppCompatImageView) r0
            app.zenly.locator.e0.a.e$h r1 = new app.zenly.locator.e0.a.e$h
            r1.<init>(r14)
            r0.setOnClickListener(r1)
            int r0 = app.zenly.locator.C3891l.user_profile_phonecall_button
            android.view.View r0 = r14.mo10080a(r0)
            androidx.appcompat.widget.AppCompatImageView r0 = (androidx.appcompat.widget.AppCompatImageView) r0
            app.zenly.locator.e0.a.e$i r1 = new app.zenly.locator.e0.a.e$i
            r1.<init>(r14, r15)
            r0.setOnClickListener(r1)
            int r0 = app.zenly.locator.C3891l.user_profile_settings_button
            android.view.View r0 = r14.mo10080a(r0)
            androidx.appcompat.widget.AppCompatImageView r0 = (androidx.appcompat.widget.AppCompatImageView) r0
            app.zenly.locator.e0.a.e$j r1 = new app.zenly.locator.e0.a.e$j
            r1.<init>(r14, r15)
            r0.setOnClickListener(r1)
            goto L_0x02e5
        L_0x02a1:
            int r0 = app.zenly.locator.C3891l.user_profile_settings_button
            android.view.View r0 = r14.mo10080a(r0)
            androidx.appcompat.widget.AppCompatImageView r0 = (androidx.appcompat.widget.AppCompatImageView) r0
            app.zenly.locator.e0.a.e$k r1 = new app.zenly.locator.e0.a.e$k
            r1.<init>(r14, r15)
            r0.setOnClickListener(r1)
            boolean r0 = r15.mo10047f()
            if (r0 == 0) goto L_0x02be
            r0 = 2131231508(0x7f080314, float:1.80791E38)
            r1 = 2132017452(0x7f14012c, float:1.9673183E38)
            goto L_0x02c4
        L_0x02be:
            r0 = 2131231363(0x7f080283, float:1.8078805E38)
            r1 = 2132017543(0x7f140187, float:1.9673367E38)
        L_0x02c4:
            int r2 = app.zenly.locator.C3891l.user_profile_add_button
            android.view.View r2 = r14.mo10080a(r2)
            androidx.appcompat.widget.AppCompatTextView r2 = (androidx.appcompat.widget.AppCompatTextView) r2
            kotlin.jvm.internal.C12932j.m33815a(r2, r6)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 14
            r13 = 0
            r7 = r2
            r8 = r0
            app.zenly.android.base.widget.C1315a.m6316a(r7, r8, r9, r10, r11, r12, r13)
            r2.setText(r1)
            app.zenly.locator.e0.a.e$e r3 = new app.zenly.locator.e0.a.e$e
            r3.<init>(r14, r0, r1, r15)
            r2.setOnClickListener(r3)
        L_0x02e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.p086e0.p087a.C3603e.m10897a(app.zenly.locator.e0.a.a):void");
    }
}
