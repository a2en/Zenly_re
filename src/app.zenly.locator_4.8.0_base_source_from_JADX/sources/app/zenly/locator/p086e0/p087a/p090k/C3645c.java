package app.zenly.locator.p086e0.p087a.p090k;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.base.model.AvatarLoader.Request;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.core.p072ui.view.LoadingTextView;
import app.zenly.locator.p086e0.p087a.p088i.C3620a;
import app.zenly.locator.p086e0.p087a.p088i.C3621b;
import app.zenly.locator.p086e0.p087a.p091l.C3657b;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p269h.p270a.C7706a;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.e0.a.k.c */
public final class C3645c extends C7717d<C3657b> {

    /* renamed from: e */
    private AvatarLoader f9779e;

    /* renamed from: f */
    private HashMap f9780f;

    /* renamed from: app.zenly.locator.e0.a.k.c$a */
    static final class C3646a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3645c f9781e;

        C3646a(C3645c cVar) {
            this.f9781e = cVar;
        }

        public final void onClick(View view) {
            this.f9781e.mo34491a().dispatch(new C3621b(C3645c.m10965a(this.f9781e).mo10153g()));
        }
    }

    /* renamed from: app.zenly.locator.e0.a.k.c$b */
    static final class C3647b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3645c f9782e;

        C3647b(C3645c cVar) {
            this.f9782e = cVar;
        }

        public final void onClick(View view) {
            ((LoadingTextView) this.f9782e.mo10130a(C3891l.action_button)).mo9417a();
            this.f9782e.mo34491a().dispatch(new C3620a(C3645c.m10965a(this.f9782e).mo10152f(), false));
        }
    }

    /* renamed from: app.zenly.locator.e0.a.k.c$c */
    static final class C3648c implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3645c f9783e;

        C3648c(C3645c cVar) {
            this.f9783e = cVar;
        }

        public final void onClick(View view) {
            this.f9783e.mo34491a().dispatch(new C3620a(C3645c.m10965a(this.f9783e).mo10152f(), true));
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C3657b m10965a(C3645c cVar) {
        return (C3657b) cVar.mo34494c();
    }

    /* renamed from: a */
    public View mo10130a(int i) {
        if (this.f9780f == null) {
            this.f9780f = new HashMap();
        }
        View view = (View) this.f9780f.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f9780f.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        Context context = view.getContext();
        C12932j.m33815a((Object) context, "itemView.context");
        this.f9779e = new C2477e(context);
        view.setOnClickListener(new C3646a(this));
        ((LoadingTextView) mo10130a(C3891l.action_button)).setOnClickListener(new C3647b(this));
        ((AppCompatImageButton) mo10130a(C3891l.action_mini_1)).setOnClickListener(new C3648c(this));
    }

    /* renamed from: f */
    public void mo6954f() {
        ((LoadingTextView) mo10130a(C3891l.action_button)).mo9418b();
        AvatarLoader avatarLoader = this.f9779e;
        if (avatarLoader != null) {
            ImageView imageView = (ImageView) mo10130a(C3891l.avatar);
            C12932j.m33815a((Object) imageView, "avatar");
            avatarLoader.clear(imageView);
            super.mo6954f();
            return;
        }
        C12932j.m33820c("avatarLoader");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C3657b bVar, C3657b bVar2) {
        C12932j.m33818b(bVar, "model");
        Resources resources = mo34493b().getResources();
        AvatarLoader avatarLoader = this.f9779e;
        if (avatarLoader != null) {
            Request load = avatarLoader.load(C2884f.m9355a(bVar.mo10152f()));
            ImageView imageView = (ImageView) mo10130a(C3891l.avatar);
            C12932j.m33815a((Object) imageView, "avatar");
            load.into(imageView);
            TextView textView = (TextView) mo10130a(C3891l.title);
            C12932j.m33815a((Object) textView, "title");
            textView.setText(bVar.mo10152f().getName());
            TextView textView2 = (TextView) mo10130a(C3891l.subtitle);
            C12932j.m33815a((Object) textView2, "subtitle");
            Context context = mo34493b().getContext();
            C12932j.m33815a((Object) context, "itemView.context");
            textView2.setText(C7706a.m18756c(context, bVar.mo10152f().getFriendsCount()));
            ((LoadingTextView) mo10130a(C3891l.action_button)).mo9418b();
            LoadingTextView loadingTextView = (LoadingTextView) mo10130a(C3891l.action_button);
            String str = "action_button";
            C12932j.m33815a((Object) loadingTextView, str);
            loadingTextView.setVisibility(8);
            AppCompatImageButton appCompatImageButton = (AppCompatImageButton) mo10130a(C3891l.action_mini_1);
            String str2 = "action_mini_1";
            C12932j.m33815a((Object) appCompatImageButton, str2);
            appCompatImageButton.setVisibility(8);
            TextView textView3 = (TextView) mo10130a(C3891l.status);
            String str3 = "status";
            C12932j.m33815a((Object) textView3, str3);
            textView3.setVisibility(0);
            if (bVar.mo10156i()) {
                TextView textView4 = (TextView) mo10130a(C3891l.status);
                C12932j.m33815a((Object) textView4, str3);
                textView4.setText(resources.getString(R.string.commons_button_you));
            } else if (bVar.mo10158k()) {
                ((TextView) mo10130a(C3891l.status)).setText(R.string.contacts_contactcell_label_private);
            } else if (bVar.mo10154h()) {
                TextView textView5 = (TextView) mo10130a(C3891l.status);
                C12932j.m33815a((Object) textView5, str3);
                textView5.setText(resources.getString(R.string.commons_label_invited_singular));
                AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) mo10130a(C3891l.action_mini_1);
                C12932j.m33815a((Object) appCompatImageButton2, str2);
                appCompatImageButton2.setVisibility(0);
            } else if (bVar.mo10157j()) {
                TextView textView6 = (TextView) mo10130a(C3891l.status);
                C12932j.m33815a((Object) textView6, str3);
                textView6.setText(resources.getString(R.string.contacts_contactcell_label_mutual));
            } else {
                TextView textView7 = (TextView) mo10130a(C3891l.status);
                C12932j.m33815a((Object) textView7, str3);
                textView7.setVisibility(8);
                LoadingTextView loadingTextView2 = (LoadingTextView) mo10130a(C3891l.action_button);
                C12932j.m33815a((Object) loadingTextView2, str);
                loadingTextView2.setVisibility(0);
            }
        } else {
            C12932j.m33820c("avatarLoader");
            throw null;
        }
    }
}
