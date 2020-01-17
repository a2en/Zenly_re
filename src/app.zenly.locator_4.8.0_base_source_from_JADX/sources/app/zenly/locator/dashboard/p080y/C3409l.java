package app.zenly.locator.dashboard.p080y;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.base.model.AvatarLoader.Request;
import app.zenly.android.feature.base.model.AvatarLoader.Request.C1333c;
import app.zenly.locator.C3891l;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.dashboard.p081z.C3433k;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.dashboard.y.l */
public final class C3409l extends C7717d<C3433k> {

    /* renamed from: e */
    private AvatarLoader f9398e;

    /* renamed from: f */
    private HashMap f9399f;

    /* renamed from: app.zenly.locator.dashboard.y.l$a */
    static final class C3410a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3409l f9400e;

        C3410a(C3409l lVar) {
            this.f9400e = lVar;
        }

        public final void onClick(View view) {
            if (C3409l.m10617a(this.f9400e).mo9949i()) {
                this.f9400e.mo34491a().dispatch(C3409l.m10617a(this.f9400e).mo9948h());
            } else {
                this.f9400e.mo34491a().dispatch(C3409l.m10617a(this.f9400e).mo9946f());
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C3433k m10617a(C3409l lVar) {
        return (C3433k) lVar.mo34494c();
    }

    /* renamed from: a */
    public View mo9911a(int i) {
        if (this.f9399f == null) {
            this.f9399f = new HashMap();
        }
        View view = (View) this.f9399f.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f9399f.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        Context context = view.getContext();
        C12932j.m33815a((Object) context, "itemView.context");
        this.f9398e = new C2477e(context);
        view.setOnClickListener(new C3410a(this));
    }

    /* renamed from: f */
    public void mo6954f() {
        super.mo6954f();
        AvatarLoader avatarLoader = this.f9398e;
        if (avatarLoader != null) {
            ImageView imageView = (ImageView) mo9911a(C3891l.image);
            C12932j.m33815a((Object) imageView, "image");
            avatarLoader.clear(imageView);
            return;
        }
        C12932j.m33820c("avatarLoader");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C3433k kVar, C3433k kVar2) {
        C12932j.m33818b(kVar, "model");
        ImageView imageView = (ImageView) mo9911a(C3891l.action);
        C12932j.m33815a((Object) imageView, "action");
        imageView.setVisibility(kVar.mo9949i() ? 0 : 8);
        AvatarLoader avatarLoader = this.f9398e;
        if (avatarLoader != null) {
            Request withPlaceholderStrategy = avatarLoader.load(C2884f.m9357a(kVar.mo9947g())).withPlaceholderStrategy(C1333c.DisplayName);
            ImageView imageView2 = (ImageView) mo9911a(C3891l.image);
            C12932j.m33815a((Object) imageView2, "image");
            withPlaceholderStrategy.into(imageView2);
            return;
        }
        C12932j.m33820c("avatarLoader");
        throw null;
    }
}
