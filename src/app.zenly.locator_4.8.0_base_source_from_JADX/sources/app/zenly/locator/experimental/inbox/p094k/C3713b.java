package app.zenly.locator.experimental.inbox.p094k;

import android.content.Context;
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
import app.zenly.locator.experimental.inbox.p092i.C3708a;
import app.zenly.locator.experimental.inbox.p092i.C3709b;
import app.zenly.locator.experimental.inbox.p095l.C3720a;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p269h.p270a.C7706a;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.experimental.inbox.k.b */
public final class C3713b extends C7717d<C3720a> {

    /* renamed from: e */
    private AvatarLoader f9958e;

    /* renamed from: f */
    private HashMap f9959f;

    /* renamed from: app.zenly.locator.experimental.inbox.k.b$a */
    static final class C3714a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3713b f9960e;

        C3714a(C3713b bVar) {
            this.f9960e = bVar;
        }

        public final void onClick(View view) {
            this.f9960e.mo34491a().dispatch(new C3709b(C3713b.m11104a(this.f9960e).mo10252g(), true));
        }
    }

    /* renamed from: app.zenly.locator.experimental.inbox.k.b$b */
    public static final class C3715b implements Runnable {

        /* renamed from: e */
        final /* synthetic */ C3713b f9961e;

        /* renamed from: f */
        final /* synthetic */ C3720a f9962f;

        public C3715b(C3713b bVar, C3720a aVar) {
            this.f9961e = bVar;
            this.f9962f = aVar;
        }

        public final void run() {
            this.f9961e.mo34491a().dispatch(new C3709b(this.f9962f.mo10252g(), false));
        }
    }

    /* renamed from: app.zenly.locator.experimental.inbox.k.b$c */
    static final class C3716c implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3713b f9963e;

        /* renamed from: f */
        final /* synthetic */ C3720a f9964f;

        C3716c(C3713b bVar, C3720a aVar) {
            this.f9963e = bVar;
            this.f9964f = aVar;
        }

        public final void onClick(View view) {
            this.f9963e.mo34491a().dispatch(new C3708a(this.f9964f.mo10252g()));
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C3720a m11104a(C3713b bVar) {
        return (C3720a) bVar.mo34494c();
    }

    /* renamed from: c */
    private final void m11107c(C3720a aVar) {
        if (aVar.mo10252g().mo10241e() != null) {
            ((LoadingTextView) mo10242a(C3891l.action_button)).setText(R.string.contacts_contactcell_button_add);
        } else {
            ((LoadingTextView) mo10242a(C3891l.action_button)).setText(R.string.contacts_contactcell_button_invite);
        }
        ((LoadingTextView) mo10242a(C3891l.action_button)).setOnClickListener(new C3716c(this, aVar));
        int i = C3712a.f9957a[aVar.mo10251f().ordinal()];
        String str = "status";
        String str2 = "action_button";
        if (i == 1) {
            ((LoadingTextView) mo10242a(C3891l.action_button)).mo9417a();
            LoadingTextView loadingTextView = (LoadingTextView) mo10242a(C3891l.action_button);
            C12932j.m33815a((Object) loadingTextView, str2);
            loadingTextView.setVisibility(0);
            TextView textView = (TextView) mo10242a(C3891l.status);
            C12932j.m33815a((Object) textView, str);
            textView.setVisibility(8);
        } else if (i == 2) {
            ((LoadingTextView) mo10242a(C3891l.action_button)).mo9418b();
            LoadingTextView loadingTextView2 = (LoadingTextView) mo10242a(C3891l.action_button);
            C12932j.m33815a((Object) loadingTextView2, str2);
            loadingTextView2.setVisibility(0);
            TextView textView2 = (TextView) mo10242a(C3891l.status);
            C12932j.m33815a((Object) textView2, str);
            textView2.setVisibility(8);
        } else if (i == 3) {
            ((LoadingTextView) mo10242a(C3891l.action_button)).mo9418b();
            LoadingTextView loadingTextView3 = (LoadingTextView) mo10242a(C3891l.action_button);
            C12932j.m33815a((Object) loadingTextView3, str2);
            loadingTextView3.setVisibility(8);
            TextView textView3 = (TextView) mo10242a(C3891l.status);
            C12932j.m33815a((Object) textView3, str);
            textView3.setVisibility(0);
            LoadingTextView loadingTextView4 = (LoadingTextView) mo10242a(C3891l.action_button);
            C12932j.m33815a((Object) loadingTextView4, str2);
            loadingTextView4.postDelayed(new C3715b(this, aVar), 1000);
        }
    }

    /* renamed from: a */
    public View mo10242a(int i) {
        if (this.f9959f == null) {
            this.f9959f = new HashMap();
        }
        View view = (View) this.f9959f.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f9959f.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        Context context = view.getContext();
        C12932j.m33815a((Object) context, "itemView.context");
        this.f9958e = new C2477e(context);
        ((AppCompatImageButton) mo10242a(C3891l.dismiss_button)).setOnClickListener(new C3714a(this));
    }

    /* renamed from: f */
    public void mo6954f() {
        AvatarLoader avatarLoader = this.f9958e;
        if (avatarLoader != null) {
            ImageView imageView = (ImageView) mo10242a(C3891l.avatar);
            C12932j.m33815a((Object) imageView, "avatar");
            avatarLoader.clear(imageView);
            super.mo6954f();
            return;
        }
        C12932j.m33820c("avatarLoader");
        throw null;
    }

    /* renamed from: b */
    private final void m11106b(C3720a aVar) {
        int c = aVar.mo10252g().mo10239c();
        String str = "subtitle";
        if (c > 0) {
            TextView textView = (TextView) mo10242a(C3891l.subtitle);
            C12932j.m33815a((Object) textView, str);
            TextView textView2 = (TextView) mo10242a(C3891l.subtitle);
            C12932j.m33815a((Object) textView2, str);
            Context context = textView2.getContext();
            C12932j.m33815a((Object) context, "subtitle.context");
            textView.setText(C7706a.m18757d(context, c));
            TextView textView3 = (TextView) mo10242a(C3891l.subtitle);
            C12932j.m33815a((Object) textView3, str);
            textView3.setVisibility(0);
            return;
        }
        TextView textView4 = (TextView) mo10242a(C3891l.subtitle);
        C12932j.m33815a((Object) textView4, str);
        textView4.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C3720a aVar, C3720a aVar2) {
        C12932j.m33818b(aVar, "model");
        m11105a(aVar);
        m11106b(aVar);
        m11107c(aVar);
    }

    /* renamed from: a */
    private final void m11105a(C3720a aVar) {
        TextView textView = (TextView) mo10242a(C3891l.title);
        C12932j.m33815a((Object) textView, "title");
        textView.setText(aVar.mo10252g().mo10238b());
        String str = "avatarLoader";
        String str2 = "avatar";
        if (aVar.mo10252g().mo10241e() != null) {
            AvatarLoader avatarLoader = this.f9958e;
            if (avatarLoader != null) {
                Request withTextColor = avatarLoader.load(C2884f.m9355a(aVar.mo10252g().mo10241e())).withFillColor(R.color.gray).withTextColor(R.color.blue_black);
                ImageView imageView = (ImageView) mo10242a(C3891l.avatar);
                C12932j.m33815a((Object) imageView, str2);
                withTextColor.into(imageView);
                return;
            }
            C12932j.m33820c(str);
            throw null;
        } else if (aVar.mo10252g().mo10237a() != null) {
            AvatarLoader avatarLoader2 = this.f9958e;
            if (avatarLoader2 != null) {
                Request withTextColor2 = avatarLoader2.load(C2884f.m9357a(aVar.mo10252g().mo10237a())).withFillColor(R.color.gray).withTextColor(R.color.blue_black);
                ImageView imageView2 = (ImageView) mo10242a(C3891l.avatar);
                C12932j.m33815a((Object) imageView2, str2);
                withTextColor2.into(imageView2);
                return;
            }
            C12932j.m33820c(str);
            throw null;
        }
    }
}
