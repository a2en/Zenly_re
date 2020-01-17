package app.zenly.locator.inbox.p102n;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.base.model.AvatarLoader.Request;
import app.zenly.locator.C3891l;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.inbox.C3845j;
import app.zenly.locator.inbox.p103o.C3887d;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5499a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.p143s.p160v.p161b.C5541h;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.inbox.n.d */
public final class C3882d extends C7717d<C3887d> {

    /* renamed from: e */
    private final C5541h f10288e = new C5541h(0, null, 3, null);

    /* renamed from: f */
    private AvatarLoader f10289f;

    /* renamed from: app.zenly.locator.inbox.n.d$a */
    static final class C3883a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3882d f10290e;

        /* renamed from: f */
        final /* synthetic */ View f10291f;

        C3883a(C3882d dVar, View view) {
            this.f10290e = dVar;
            this.f10291f = view;
        }

        public final void onClick(View view) {
            C5499a aVar = C5498a.f14119e;
            Context context = this.f10291f.getContext();
            C12932j.m33815a((Object) context, "itemView.context");
            C5498a.m15602a(aVar.mo13125a(context), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            this.f10290e.mo34491a().dispatch(new C3845j(C3882d.m11422a(this.f10290e)));
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C3887d m11422a(C3882d dVar) {
        return (C3887d) dVar.mo34494c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        Context context = view.getContext();
        C12932j.m33815a((Object) context, "itemView.context");
        this.f10289f = new C2477e(context);
        view.setHapticFeedbackEnabled(false);
        view.setOnClickListener(new C3883a(this, view));
    }

    /* renamed from: f */
    public void mo6954f() {
        AvatarLoader avatarLoader = this.f10289f;
        if (avatarLoader != null) {
            ImageView imageView = (ImageView) mo34493b().findViewById(C3891l.avatar);
            C12932j.m33815a((Object) imageView, "itemView.avatar");
            avatarLoader.clear(imageView);
            super.mo6954f();
            return;
        }
        C12932j.m33820c("avatarLoader");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C3887d dVar, C3887d dVar2) {
        C12932j.m33818b(dVar, "model");
        AvatarLoader avatarLoader = this.f10289f;
        if (avatarLoader != null) {
            Request load = avatarLoader.load(dVar.mo10486f());
            ImageView imageView = (ImageView) mo34493b().findViewById(C3891l.avatar);
            C12932j.m33815a((Object) imageView, "itemView.avatar");
            load.into(imageView);
            C5541h hVar = this.f10288e;
            AppCompatTextView appCompatTextView = (AppCompatTextView) mo34493b().findViewById(C3891l.title);
            C12932j.m33815a((Object) appCompatTextView, "itemView.title");
            hVar.mo13161a(appCompatTextView, dVar.mo10488h(), "");
            return;
        }
        C12932j.m33820c("avatarLoader");
        throw null;
    }
}
