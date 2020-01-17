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
import app.zenly.locator.dashboard.C3320q;
import app.zenly.locator.dashboard.C3323t;
import app.zenly.locator.dashboard.p081z.C3437o;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p269h.p270a.C7706a;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.dashboard.y.n */
public final class C3413n extends C7717d<C3437o> {

    /* renamed from: e */
    private AvatarLoader f9404e;

    /* renamed from: f */
    private ViewStubWrapper<ProgressBar> f9405f;

    /* renamed from: g */
    private HashMap f9406g;

    /* renamed from: app.zenly.locator.dashboard.y.n$a */
    static final class C3414a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3413n f9407e;

        C3414a(C3413n nVar) {
            this.f9407e = nVar;
        }

        public final void onClick(View view) {
            this.f9407e.mo34491a().dispatch(new C3320q(C3413n.m10630b(this.f9407e).mo9958j(), C3413n.m10630b(this.f9407e).mo9959k(), C3413n.m10630b(this.f9407e).mo9961m()));
        }
    }

    /* renamed from: app.zenly.locator.dashboard.y.n$b */
    static final class C3415b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3413n f9408e;

        C3415b(C3413n nVar) {
            this.f9408e = nVar;
        }

        public final void onClick(View view) {
            ((LoadingTextView) this.f9408e.mo9917a(C3891l.action_button)).mo9417a();
            this.f9408e.mo34491a().dispatch(new C3323t(C3413n.m10630b(this.f9408e)));
        }
    }

    /* renamed from: app.zenly.locator.dashboard.y.n$c */
    static final class C3416c implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3413n f9409e;

        C3416c(C3413n nVar) {
            this.f9409e = nVar;
        }

        public final void onClick(View view) {
            this.f9409e.mo34491a().dispatch(new C3323t(C3413n.m10630b(this.f9409e)));
        }
    }

    /* renamed from: app.zenly.locator.dashboard.y.n$d */
    static final class C3417d implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3413n f9410e;

        /* renamed from: f */
        final /* synthetic */ View f9411f;

        /* renamed from: app.zenly.locator.dashboard.y.n$d$a */
        static final class C3418a implements DialogInterface.OnClickListener {

            /* renamed from: e */
            public static final C3418a f9412e = new C3418a();

            C3418a() {
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        /* renamed from: app.zenly.locator.dashboard.y.n$d$b */
        static final class C3419b implements DialogInterface.OnClickListener {

            /* renamed from: e */
            final /* synthetic */ C3417d f9413e;

            /* renamed from: app.zenly.locator.dashboard.y.n$d$b$a */
            static final class C3420a implements Runnable {

                /* renamed from: e */
                final /* synthetic */ C3419b f9414e;

                C3420a(C3419b bVar) {
                    this.f9414e = bVar;
                }

                public final void run() {
                    this.f9414e.f9413e.f9410e.mo34491a().dispatch(C3413n.m10630b(this.f9414e.f9413e.f9410e).mo9954f());
                }
            }

            C3419b(C3417d dVar) {
                this.f9413e = dVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                AppCompatImageButton appCompatImageButton = (AppCompatImageButton) this.f9413e.f9410e.mo9917a(C3891l.dismiss_button);
                C12932j.m33815a((Object) appCompatImageButton, "dismiss_button");
                appCompatImageButton.setVisibility(4);
                C3413n.m10629a(this.f9413e.f9410e).mo6501a(0);
                this.f9413e.f9411f.animate().alpha(0.3f).withEndAction(new C3420a(this));
            }
        }

        C3417d(C3413n nVar, View view) {
            this.f9410e = nVar;
            this.f9411f = view;
        }

        public final void onClick(View view) {
            this.f9410e.mo34491a().dispatch(C3413n.m10630b(this.f9410e).mo9955g());
            if (C3413n.m10630b(this.f9410e).mo9957i()) {
                C12932j.m33815a((Object) view, "it");
                C0123a aVar = new C0123a(view.getContext());
                aVar.mo537a((CharSequence) view.getContext().getString(R.string.contactpicker_dismissableSuggested_modal_title, new Object[]{C3413n.m10630b(this.f9410e).mo9956h()}));
                aVar.mo545b(R.string.contactpicker_dismissableSuggested_modal_cancel, C3418a.f9412e);
                aVar.mo549c(R.string.contactpicker_dismissableSuggested_modal_hide, new C3419b(this));
                aVar.mo550c();
                return;
            }
            this.f9410e.mo34491a().dispatch(C3413n.m10630b(this.f9410e).mo9954f());
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ViewStubWrapper m10629a(C3413n nVar) {
        ViewStubWrapper<ProgressBar> viewStubWrapper = nVar.f9405f;
        if (viewStubWrapper != null) {
            return viewStubWrapper;
        }
        C12932j.m33820c("lazyProgressBar");
        throw null;
    }

    /* renamed from: b */
    public static final /* synthetic */ C3437o m10630b(C3413n nVar) {
        return (C3437o) nVar.mo34494c();
    }

    /* renamed from: a */
    public View mo9917a(int i) {
        if (this.f9406g == null) {
            this.f9406g = new HashMap();
        }
        View view = (View) this.f9406g.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f9406g.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: f */
    public void mo6954f() {
        mo34493b().animate().cancel();
        AvatarLoader avatarLoader = this.f9404e;
        if (avatarLoader != null) {
            ImageView imageView = (ImageView) mo9917a(C3891l.avatar);
            C12932j.m33815a((Object) imageView, "avatar");
            avatarLoader.clear(imageView);
            super.mo6954f();
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
        this.f9404e = new C2477e(context);
        view.setOnClickListener(new C3414a(this));
        ((LoadingTextView) mo9917a(C3891l.action_button)).setOnClickListener(new C3415b(this));
        ((AppCompatImageButton) mo9917a(C3891l.action_mini_1)).setOnClickListener(new C3416c(this));
        ViewStub viewStub = (ViewStub) getContainerView().findViewById(C3891l.dismiss_progress);
        C12932j.m33815a((Object) viewStub, "dismiss_progress");
        this.f9405f = new ViewStubWrapper<>(viewStub, null, 2, null);
        ((AppCompatImageButton) mo9917a(C3891l.dismiss_button)).setOnClickListener(new C3417d(this, view));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C3437o oVar, C3437o oVar2) {
        C12932j.m33818b(oVar, "model");
        mo34493b().animate().cancel();
        mo34493b().setAlpha(1.0f);
        ((LoadingTextView) mo9917a(C3891l.action_button)).mo9418b();
        ViewStubWrapper<ProgressBar> viewStubWrapper = this.f9405f;
        if (viewStubWrapper != null) {
            viewStubWrapper.mo6501a(8);
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) mo9917a(C3891l.dismiss_button);
            C12932j.m33815a((Object) appCompatImageButton, "dismiss_button");
            appCompatImageButton.setVisibility(oVar.mo9960l() ? 0 : 8);
            String str = "status";
            String str2 = "action_mini_1";
            String str3 = "action_button";
            if (oVar.mo9962n()) {
                LoadingTextView loadingTextView = (LoadingTextView) mo9917a(C3891l.action_button);
                C12932j.m33815a((Object) loadingTextView, str3);
                loadingTextView.setVisibility(8);
                AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) mo9917a(C3891l.action_mini_1);
                C12932j.m33815a((Object) appCompatImageButton2, str2);
                appCompatImageButton2.setVisibility(8);
                ((TextView) mo9917a(C3891l.status)).setText(R.string.contacts_contactcell_label_private);
                TextView textView = (TextView) mo9917a(C3891l.status);
                C12932j.m33815a((Object) textView, str);
                textView.setVisibility(0);
            } else if (oVar.mo9961m()) {
                LoadingTextView loadingTextView2 = (LoadingTextView) mo9917a(C3891l.action_button);
                C12932j.m33815a((Object) loadingTextView2, str3);
                loadingTextView2.setVisibility(8);
                AppCompatImageButton appCompatImageButton3 = (AppCompatImageButton) mo9917a(C3891l.action_mini_1);
                C12932j.m33815a((Object) appCompatImageButton3, str2);
                appCompatImageButton3.setVisibility(8);
                TextView textView2 = (TextView) mo9917a(C3891l.status);
                C12932j.m33815a((Object) textView2, str);
                textView2.setVisibility(8);
            } else if (oVar.mo9963o()) {
                LoadingTextView loadingTextView3 = (LoadingTextView) mo9917a(C3891l.action_button);
                C12932j.m33815a((Object) loadingTextView3, str3);
                loadingTextView3.setVisibility(8);
                AppCompatImageButton appCompatImageButton4 = (AppCompatImageButton) mo9917a(C3891l.action_mini_1);
                C12932j.m33815a((Object) appCompatImageButton4, str2);
                appCompatImageButton4.setVisibility(0);
                ((TextView) mo9917a(C3891l.status)).setText(R.string.commons_label_invited_singular);
                TextView textView3 = (TextView) mo9917a(C3891l.status);
                C12932j.m33815a((Object) textView3, str);
                textView3.setVisibility(0);
            } else {
                LoadingTextView loadingTextView4 = (LoadingTextView) mo9917a(C3891l.action_button);
                C12932j.m33815a((Object) loadingTextView4, str3);
                loadingTextView4.setVisibility(0);
                AppCompatImageButton appCompatImageButton5 = (AppCompatImageButton) mo9917a(C3891l.action_mini_1);
                C12932j.m33815a((Object) appCompatImageButton5, str2);
                appCompatImageButton5.setVisibility(8);
                TextView textView4 = (TextView) mo9917a(C3891l.status);
                C12932j.m33815a((Object) textView4, str);
                textView4.setVisibility(8);
            }
            TextView textView5 = (TextView) mo9917a(C3891l.title);
            C12932j.m33815a((Object) textView5, "title");
            textView5.setText(oVar.mo9956h());
            AvatarLoader avatarLoader = this.f9404e;
            if (avatarLoader != null) {
                Request load = avatarLoader.load(C2884f.m9355a(oVar.mo9959k()));
                ImageView imageView = (ImageView) mo9917a(C3891l.avatar);
                C12932j.m33815a((Object) imageView, "avatar");
                load.into(imageView);
                TextView textView6 = (TextView) mo9917a(C3891l.subtitle);
                String str4 = "subtitle";
                C12932j.m33815a((Object) textView6, str4);
                TextView textView7 = (TextView) mo9917a(C3891l.subtitle);
                C12932j.m33815a((Object) textView7, str4);
                Context context = textView7.getContext();
                C12932j.m33815a((Object) context, "subtitle.context");
                textView6.setText(C7706a.m18757d(context, oVar.mo9959k().getFriendsCount()));
                return;
            }
            C12932j.m33820c("avatarLoader");
            throw null;
        }
        C12932j.m33820c("lazyProgressBar");
        throw null;
    }
}
