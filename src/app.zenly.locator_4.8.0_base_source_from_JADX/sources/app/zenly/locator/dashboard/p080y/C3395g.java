package app.zenly.locator.dashboard.p080y;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.C0122a.C0123a;
import androidx.appcompat.widget.AppCompatImageButton;
import app.zenly.android.base.widget.ViewStubWrapper;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.base.model.AvatarLoader.Request;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.core.p072ui.view.LoadingTextView;
import app.zenly.locator.dashboard.C3303e;
import app.zenly.locator.dashboard.C3306h;
import app.zenly.locator.dashboard.p075w.C3341i;
import app.zenly.locator.dashboard.p081z.C3428g;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p269h.p270a.C7706a;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.dashboard.y.g */
public final class C3395g extends C7717d<C3428g> {

    /* renamed from: e */
    private AvatarLoader f9380e;

    /* renamed from: f */
    private ViewStubWrapper<ProgressBar> f9381f;

    /* renamed from: g */
    private HashMap f9382g;

    /* renamed from: app.zenly.locator.dashboard.y.g$a */
    static final class C3396a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3395g f9383e;

        C3396a(C3395g gVar) {
            this.f9383e = gVar;
        }

        public final void onClick(View view) {
            this.f9383e.mo34491a().dispatch(new C3303e(C3395g.m10598b(this.f9383e).mo9940m(), C3395g.m10598b(this.f9383e).mo9933f()));
        }
    }

    /* renamed from: app.zenly.locator.dashboard.y.g$b */
    static final class C3397b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3395g f9384e;

        C3397b(C3395g gVar) {
            this.f9384e = gVar;
        }

        public final void onClick(View view) {
            this.f9384e.mo34491a().dispatch(new C3306h(C3395g.m10598b(this.f9384e).mo9940m(), C3395g.m10598b(this.f9384e).mo9933f(), C3395g.m10598b(this.f9384e).mo9937j() == C3341i.INVITED));
        }
    }

    /* renamed from: app.zenly.locator.dashboard.y.g$c */
    static final class C3398c implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3395g f9385e;

        C3398c(C3395g gVar) {
            this.f9385e = gVar;
        }

        public final void onClick(View view) {
            this.f9385e.mo34491a().dispatch(new C3306h(C3395g.m10598b(this.f9385e).mo9940m(), C3395g.m10598b(this.f9385e).mo9933f(), C3395g.m10598b(this.f9385e).mo9937j() == C3341i.INVITED));
        }
    }

    /* renamed from: app.zenly.locator.dashboard.y.g$d */
    static final class C3399d implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3395g f9386e;

        /* renamed from: f */
        final /* synthetic */ View f9387f;

        /* renamed from: app.zenly.locator.dashboard.y.g$d$a */
        static final class C3400a implements DialogInterface.OnClickListener {

            /* renamed from: e */
            public static final C3400a f9388e = new C3400a();

            C3400a() {
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        /* renamed from: app.zenly.locator.dashboard.y.g$d$b */
        static final class C3401b implements DialogInterface.OnClickListener {

            /* renamed from: e */
            final /* synthetic */ C3399d f9389e;

            /* renamed from: app.zenly.locator.dashboard.y.g$d$b$a */
            static final class C3402a implements Runnable {

                /* renamed from: e */
                final /* synthetic */ C3401b f9390e;

                C3402a(C3401b bVar) {
                    this.f9390e = bVar;
                }

                public final void run() {
                    this.f9390e.f9389e.f9386e.mo34491a().dispatch(C3395g.m10598b(this.f9390e.f9389e.f9386e).mo9934g());
                }
            }

            C3401b(C3399d dVar) {
                this.f9389e = dVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                AppCompatImageButton appCompatImageButton = (AppCompatImageButton) this.f9389e.f9386e.mo9894a(C3891l.dismiss_button);
                C12932j.m33815a((Object) appCompatImageButton, "dismiss_button");
                appCompatImageButton.setVisibility(4);
                C3395g.m10597a(this.f9389e.f9386e).mo6501a(0);
                this.f9389e.f9387f.animate().alpha(0.3f).withEndAction(new C3402a(this));
            }
        }

        C3399d(C3395g gVar, View view) {
            this.f9386e = gVar;
            this.f9387f = view;
        }

        public final void onClick(View view) {
            this.f9386e.mo34491a().dispatch(C3395g.m10598b(this.f9386e).mo9935h());
            if (C3395g.m10598b(this.f9386e).mo9938k()) {
                C12932j.m33815a((Object) view, "it");
                C0123a aVar = new C0123a(view.getContext());
                aVar.mo537a((CharSequence) view.getContext().getString(R.string.contactpicker_dismissableSuggested_modal_title, new Object[]{C3395g.m10598b(this.f9386e).mo9936i()}));
                aVar.mo545b(R.string.contactpicker_dismissableSuggested_modal_cancel, C3400a.f9388e);
                aVar.mo549c(R.string.contactpicker_dismissableSuggested_modal_hide, new C3401b(this));
                aVar.mo550c();
                return;
            }
            this.f9386e.mo34491a().dispatch(C3395g.m10598b(this.f9386e).mo9934g());
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ViewStubWrapper m10597a(C3395g gVar) {
        ViewStubWrapper<ProgressBar> viewStubWrapper = gVar.f9381f;
        if (viewStubWrapper != null) {
            return viewStubWrapper;
        }
        C12932j.m33820c("lazyProgressBar");
        throw null;
    }

    /* renamed from: b */
    public static final /* synthetic */ C3428g m10598b(C3395g gVar) {
        return (C3428g) gVar.mo34494c();
    }

    /* renamed from: a */
    public View mo9894a(int i) {
        if (this.f9382g == null) {
            this.f9382g = new HashMap();
        }
        View view = (View) this.f9382g.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f9382g.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: f */
    public void mo6954f() {
        super.mo6954f();
        AvatarLoader avatarLoader = this.f9380e;
        if (avatarLoader != null) {
            ImageView imageView = (ImageView) mo9894a(C3891l.avatar);
            C12932j.m33815a((Object) imageView, "avatar");
            avatarLoader.clear(imageView);
            mo34493b().animate().cancel();
            return;
        }
        C12932j.m33820c("avatarLoader");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        Context context = view.getContext();
        C12932j.m33815a((Object) context, "itemView.context");
        this.f9380e = new C2477e(context);
        view.setOnClickListener(new C3396a(this));
        ((LoadingTextView) mo9894a(C3891l.action_button)).setOnClickListener(new C3397b(this));
        ((AppCompatImageButton) mo9894a(C3891l.action_mini_1)).setOnClickListener(new C3398c(this));
        ViewStub viewStub = (ViewStub) getContainerView().findViewById(C3891l.dismiss_progress);
        C12932j.m33815a((Object) viewStub, "dismiss_progress");
        this.f9381f = new ViewStubWrapper<>(viewStub, null, 2, null);
        ((AppCompatImageButton) mo9894a(C3891l.dismiss_button)).setOnClickListener(new C3399d(this, view));
        ((TextView) mo9894a(C3891l.status)).setText(R.string.commons_label_invited_singular);
        ((LoadingTextView) mo9894a(C3891l.action_button)).setText(R.string.contacts_contactcell_button_invite);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C3428g gVar, C3428g gVar2) {
        C12932j.m33818b(gVar, "model");
        mo34493b().animate().cancel();
        mo34493b().setAlpha(1.0f);
        ViewStubWrapper<ProgressBar> viewStubWrapper = this.f9381f;
        if (viewStubWrapper != null) {
            viewStubWrapper.mo6501a(8);
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) mo9894a(C3891l.dismiss_button);
            C12932j.m33815a((Object) appCompatImageButton, "dismiss_button");
            appCompatImageButton.setVisibility(gVar.mo9941n() ? 0 : 8);
            int i = C3394f.f9379a[gVar.mo9937j().ordinal()];
            String str = "status";
            String str2 = "action_mini_1";
            String str3 = "action_button";
            if (i == 1) {
                ((LoadingTextView) mo9894a(C3891l.action_button)).mo9417a();
                LoadingTextView loadingTextView = (LoadingTextView) mo9894a(C3891l.action_button);
                C12932j.m33815a((Object) loadingTextView, str3);
                loadingTextView.setVisibility(0);
                AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) mo9894a(C3891l.action_mini_1);
                C12932j.m33815a((Object) appCompatImageButton2, str2);
                appCompatImageButton2.setVisibility(8);
                TextView textView = (TextView) mo9894a(C3891l.status);
                C12932j.m33815a((Object) textView, str);
                textView.setVisibility(8);
            } else if (i != 2) {
                ((LoadingTextView) mo9894a(C3891l.action_button)).mo9418b();
                LoadingTextView loadingTextView2 = (LoadingTextView) mo9894a(C3891l.action_button);
                C12932j.m33815a((Object) loadingTextView2, str3);
                loadingTextView2.setVisibility(0);
                AppCompatImageButton appCompatImageButton3 = (AppCompatImageButton) mo9894a(C3891l.action_mini_1);
                C12932j.m33815a((Object) appCompatImageButton3, str2);
                appCompatImageButton3.setVisibility(8);
                TextView textView2 = (TextView) mo9894a(C3891l.status);
                C12932j.m33815a((Object) textView2, str);
                textView2.setVisibility(8);
            } else {
                ((LoadingTextView) mo9894a(C3891l.action_button)).mo9418b();
                LoadingTextView loadingTextView3 = (LoadingTextView) mo9894a(C3891l.action_button);
                C12932j.m33815a((Object) loadingTextView3, str3);
                loadingTextView3.setVisibility(8);
                AppCompatImageButton appCompatImageButton4 = (AppCompatImageButton) mo9894a(C3891l.action_mini_1);
                C12932j.m33815a((Object) appCompatImageButton4, str2);
                appCompatImageButton4.setVisibility(0);
                TextView textView3 = (TextView) mo9894a(C3891l.status);
                C12932j.m33815a((Object) textView3, str);
                textView3.setVisibility(0);
            }
            String str4 = "subtitle";
            if (gVar.mo9939l() > 1) {
                TextView textView4 = (TextView) mo9894a(C3891l.subtitle);
                C12932j.m33815a((Object) textView4, str4);
                Context context = mo34493b().getContext();
                C12932j.m33815a((Object) context, "itemView.context");
                textView4.setText(C7706a.m18755b(context, gVar.mo9939l()));
                TextView textView5 = (TextView) mo9894a(C3891l.subtitle);
                C12932j.m33815a((Object) textView5, str4);
                textView5.setVisibility(0);
            } else {
                TextView textView6 = (TextView) mo9894a(C3891l.subtitle);
                C12932j.m33815a((Object) textView6, str4);
                textView6.setVisibility(8);
            }
            TextView textView7 = (TextView) mo9894a(C3891l.title);
            C12932j.m33815a((Object) textView7, "title");
            textView7.setText(gVar.mo9936i());
            AvatarLoader avatarLoader = this.f9380e;
            if (avatarLoader != null) {
                Request load = avatarLoader.load(C2884f.m9357a(gVar.mo9933f()));
                ImageView imageView = (ImageView) mo9894a(C3891l.avatar);
                C12932j.m33815a((Object) imageView, "avatar");
                load.into(imageView);
                return;
            }
            C12932j.m33820c("avatarLoader");
            throw null;
        }
        C12932j.m33820c("lazyProgressBar");
        throw null;
    }
}
