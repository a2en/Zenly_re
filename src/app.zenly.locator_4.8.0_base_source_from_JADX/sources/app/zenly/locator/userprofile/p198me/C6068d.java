package app.zenly.locator.userprofile.p198me;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import app.zenly.android.base.widget.C1315a;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.base.model.AvatarLoader.Request.C1333c;
import app.zenly.android.feature.polenta.widget.C1448b;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.contracts.NavigationContract.C2468b;
import app.zenly.locator.core.manager.C2800q5;
import app.zenly.locator.core.manager.C2800q5.C2801a;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.core.util.C3194b0;
import app.zenly.locator.core.widget.C3275i;
import app.zenly.locator.username.C5970b;
import app.zenly.locator.userprofile.p198me.p200h.C6089c;
import app.zenly.locator.userprofile.p198me.p200h.C6095i;
import app.zenly.locator.userprofile.p198me.p200h.C6096j;
import app.zenly.locator.userprofile.p198me.p200h.C6097k;
import app.zenly.locator.userprofile.p198me.p204l.C6142i;
import com.snap.p327ui.event.EventDispatcher;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p279d.C7770f;
import p389io.reactivex.C12286f;
import p389io.reactivex.disposables.C12275b;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p405m.C12773a;

/* renamed from: app.zenly.locator.userprofile.me.d */
public final class C6068d {

    /* renamed from: a */
    private ImageView f15276a;

    /* renamed from: b */
    private ProgressBar f15277b;

    /* renamed from: c */
    private View f15278c;

    /* renamed from: d */
    private TextView f15279d;

    /* renamed from: e */
    private TextView f15280e;

    /* renamed from: f */
    private TextView f15281f;

    /* renamed from: g */
    private final C6077e f15282g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final AvatarLoader f15283h;

    /* renamed from: i */
    private final C2800q5 f15284i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final EventDispatcher f15285j;

    /* renamed from: k */
    private final C12286f f15286k;

    /* renamed from: app.zenly.locator.userprofile.me.d$a */
    static final class C6069a<T> implements Consumer<C6142i> {

        /* renamed from: e */
        final /* synthetic */ C6068d f15287e;

        /* renamed from: app.zenly.locator.userprofile.me.d$a$a */
        static final class C6070a implements OnClickListener {

            /* renamed from: e */
            final /* synthetic */ C6069a f15288e;

            /* renamed from: f */
            final /* synthetic */ C6142i f15289f;

            C6070a(C6069a aVar, C6142i iVar) {
                this.f15288e = aVar;
                this.f15289f = iVar;
            }

            public final void onClick(View view) {
                EventDispatcher b = this.f15288e.f15287e.f15285j;
                String username = this.f15289f.mo13981a().getUsername();
                C12932j.m33815a((Object) username, "model.user.username");
                b.dispatch(new C6097k(username));
            }
        }

        /* renamed from: app.zenly.locator.userprofile.me.d$a$b */
        static final class C6071b implements OnClickListener {

            /* renamed from: e */
            final /* synthetic */ C6069a f15290e;

            /* renamed from: f */
            final /* synthetic */ C6142i f15291f;

            C6071b(C6069a aVar, boolean z, C6142i iVar) {
                this.f15290e = aVar;
                this.f15291f = iVar;
            }

            public final void onClick(View view) {
                EventDispatcher b = this.f15290e.f15287e.f15285j;
                String username = this.f15291f.mo13981a().getUsername();
                C12932j.m33815a((Object) username, "model.user.username");
                b.dispatch(new C6097k(username));
            }
        }

        C6069a(C6068d dVar) {
            this.f15287e = dVar;
        }

        /* renamed from: a */
        public final void accept(C6142i iVar) {
            String str;
            this.f15287e.f15283h.load(C2884f.m9355a(iVar.mo13981a())).withPlaceholderStrategy(C1333c.DisplayName).into(C6068d.m16830c(this.f15287e));
            boolean z = false;
            C6068d.m16831d(this.f15287e).setVisibility(C3194b0.m10163a(iVar.mo13981a()) ? 8 : 0);
            C6068d.m16833f(this.f15287e).setText(iVar.mo13981a().getName());
            TextView h = C6068d.m16835h(this.f15287e);
            h.setOnClickListener(new C6070a(this, iVar));
            String username = iVar.mo13981a().getUsername();
            String str2 = "model.user.username";
            if (!(username == null || username.length() == 0)) {
                String username2 = iVar.mo13981a().getUsername();
                C12932j.m33815a((Object) username2, str2);
                str = C5970b.m16566a(username2);
            } else {
                str = null;
            }
            C3275i.m10386a(h, (CharSequence) str);
            boolean z2 = iVar.mo13981a().getFriendsCount() >= 3;
            TextView g = C6068d.m16834g(this.f15287e);
            C1448b.m6544a(g, z2 ? C7770f.Button_Small_Secondary : C7770f.Button_Small_Tertiary);
            g.setOnClickListener(new C6071b(this, z2, iVar));
            g.setText(R.string.profile_id);
            String username3 = iVar.mo13981a().getUsername();
            C12932j.m33815a((Object) username3, str2);
            if (username3.length() > 0) {
                z = true;
            }
            C1315a.m6316a(g, z ? 2131231576 : 2131231429, 0, 0, 0, 14, (Object) null);
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.d$b */
    static final class C6072b<T> implements Consumer<C2801a> {

        /* renamed from: e */
        final /* synthetic */ C6068d f15292e;

        C6072b(C6068d dVar) {
            this.f15292e = dVar;
        }

        /* renamed from: a */
        public final void accept(C2801a aVar) {
            C6068d.m16832e(this.f15292e).setVisibility(aVar == C2801a.UPLOAD ? 0 : 8);
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.d$c */
    static final class C6073c implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C6068d f15293e;

        C6073c(C6068d dVar) {
            this.f15293e = dVar;
        }

        public final void onClick(View view) {
            this.f15293e.f15285j.dispatch(C6089c.f15326a);
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.d$d */
    static final class C6074d implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C6068d f15294e;

        C6074d(C6068d dVar) {
            this.f15294e = dVar;
        }

        public final void onClick(View view) {
            this.f15294e.f15285j.dispatch(C6096j.f15336a);
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.d$e */
    static final class C6075e implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C6068d f15295e;

        C6075e(C6068d dVar) {
            this.f15295e = dVar;
        }

        public final void onClick(View view) {
            this.f15295e.f15285j.dispatch(new C6095i(C2468b.PRIVACY));
        }
    }

    /* renamed from: app.zenly.locator.userprofile.me.d$f */
    static final class C6076f implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C6068d f15296e;

        C6076f(C6068d dVar) {
            this.f15296e = dVar;
        }

        public final void onClick(View view) {
            this.f15296e.f15285j.dispatch(new C6095i(C2468b.SETTINGS));
        }
    }

    public C6068d(C6077e eVar, AvatarLoader avatarLoader, C2800q5 q5Var, EventDispatcher eventDispatcher, C12286f fVar) {
        C12932j.m33818b(eVar, "viewModelProvider");
        C12932j.m33818b(avatarLoader, "avatarLoader");
        C12932j.m33818b(q5Var, "userAvatarManager");
        C12932j.m33818b(eventDispatcher, "eventDispatcher");
        C12932j.m33818b(fVar, "uiScheduler");
        this.f15282g = eVar;
        this.f15283h = avatarLoader;
        this.f15284i = q5Var;
        this.f15285j = eventDispatcher;
        this.f15286k = fVar;
    }

    /* renamed from: c */
    public static final /* synthetic */ ImageView m16830c(C6068d dVar) {
        ImageView imageView = dVar.f15276a;
        if (imageView != null) {
            return imageView;
        }
        C12932j.m33820c("profileAvatar");
        throw null;
    }

    /* renamed from: d */
    public static final /* synthetic */ View m16831d(C6068d dVar) {
        View view = dVar.f15278c;
        if (view != null) {
            return view;
        }
        C12932j.m33820c("profileAvatarIcon");
        throw null;
    }

    /* renamed from: e */
    public static final /* synthetic */ ProgressBar m16832e(C6068d dVar) {
        ProgressBar progressBar = dVar.f15277b;
        if (progressBar != null) {
            return progressBar;
        }
        C12932j.m33820c("profileAvatarProgress");
        throw null;
    }

    /* renamed from: f */
    public static final /* synthetic */ TextView m16833f(C6068d dVar) {
        TextView textView = dVar.f15279d;
        if (textView != null) {
            return textView;
        }
        C12932j.m33820c("profileName");
        throw null;
    }

    /* renamed from: g */
    public static final /* synthetic */ TextView m16834g(C6068d dVar) {
        TextView textView = dVar.f15281f;
        if (textView != null) {
            return textView;
        }
        C12932j.m33820c("profileUsernameButton");
        throw null;
    }

    /* renamed from: h */
    public static final /* synthetic */ TextView m16835h(C6068d dVar) {
        TextView textView = dVar.f15280e;
        if (textView != null) {
            return textView;
        }
        C12932j.m33820c("profileUsernameLink");
        throw null;
    }

    /* renamed from: a */
    public final void mo13883a(View view) {
        C12932j.m33818b(view, "containerView");
        ImageView imageView = (ImageView) view.findViewById(C3891l.profile_avatar);
        C12932j.m33815a((Object) imageView, "containerView.profile_avatar");
        this.f15276a = imageView;
        ProgressBar progressBar = (ProgressBar) view.findViewById(C3891l.profile_avatar_progress);
        C12932j.m33815a((Object) progressBar, "containerView.profile_avatar_progress");
        this.f15277b = progressBar;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(C3891l.profile_avatar_icon);
        C12932j.m33815a((Object) frameLayout, "containerView.profile_avatar_icon");
        this.f15278c = frameLayout;
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(C3891l.profile_name);
        C12932j.m33815a((Object) appCompatTextView, "containerView.profile_name");
        this.f15279d = appCompatTextView;
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) view.findViewById(C3891l.profile_username_link);
        C12932j.m33815a((Object) appCompatTextView2, "containerView.profile_username_link");
        this.f15280e = appCompatTextView2;
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) view.findViewById(C3891l.profile_username_button);
        C12932j.m33815a((Object) appCompatTextView3, "containerView.profile_username_button");
        this.f15281f = appCompatTextView3;
        ImageView imageView2 = this.f15276a;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new C6073c(this));
            TextView textView = this.f15279d;
            if (textView != null) {
                textView.setOnClickListener(new C6074d(this));
                ((AppCompatImageButton) view.findViewById(C3891l.profile_ghost_mode_button)).setOnClickListener(new C6075e(this));
                ((AppCompatImageView) view.findViewById(C3891l.profile_settings_button)).setOnClickListener(new C6076f(this));
                return;
            }
            C12932j.m33820c("profileName");
            throw null;
        }
        C12932j.m33820c("profileAvatar");
        throw null;
    }

    /* renamed from: b */
    public final Disposable mo13884b() {
        C12275b bVar = new C12275b();
        Disposable d = this.f15282g.mo13893a().mo36428a(this.f15286k).mo36476d((Consumer<? super T>) new C6069a<Object>(this));
        C12932j.m33815a((Object) d, "viewModelProvider.getVie…          }\n            }");
        C12773a.m33432a(d, bVar);
        Disposable d2 = this.f15284i.mo8845b().mo36428a(this.f15286k).mo36476d((Consumer<? super T>) new C6072b<Object>(this));
        C12932j.m33815a((Object) d2, "userAvatarManager.state\n…          }\n            }");
        C12773a.m33432a(d2, bVar);
        return bVar;
    }

    /* renamed from: a */
    public final void mo13882a() {
        AvatarLoader avatarLoader = this.f15283h;
        ImageView imageView = this.f15276a;
        if (imageView != null) {
            avatarLoader.clear(imageView);
        } else {
            C12932j.m33820c("profileAvatar");
            throw null;
        }
    }
}
