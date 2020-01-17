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
import app.zenly.locator.dashboard.p081z.C3434l;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.dashboard.y.m */
public final class C3411m extends C7717d<C3434l> {

    /* renamed from: e */
    private AvatarLoader f9401e;

    /* renamed from: f */
    private HashMap f9402f;

    /* renamed from: app.zenly.locator.dashboard.y.m$a */
    static final class C3412a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3411m f9403e;

        C3412a(C3411m mVar) {
            this.f9403e = mVar;
        }

        public final void onClick(View view) {
            if (C3411m.m10623a(this.f9403e).mo9953i()) {
                this.f9403e.mo34491a().dispatch(C3411m.m10623a(this.f9403e).mo9951g());
            } else {
                this.f9403e.mo34491a().dispatch(C3411m.m10623a(this.f9403e).mo9950f());
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C3434l m10623a(C3411m mVar) {
        return (C3434l) mVar.mo34494c();
    }

    /* renamed from: a */
    public View mo9914a(int i) {
        if (this.f9402f == null) {
            this.f9402f = new HashMap();
        }
        View view = (View) this.f9402f.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f9402f.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        Context context = view.getContext();
        C12932j.m33815a((Object) context, "itemView.context");
        this.f9401e = new C2477e(context);
        view.setOnClickListener(new C3412a(this));
    }

    /* renamed from: f */
    public void mo6954f() {
        super.mo6954f();
        AvatarLoader avatarLoader = this.f9401e;
        if (avatarLoader != null) {
            ImageView imageView = (ImageView) mo9914a(C3891l.image);
            C12932j.m33815a((Object) imageView, "image");
            avatarLoader.clear(imageView);
            return;
        }
        C12932j.m33820c("avatarLoader");
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C3434l lVar, C3434l lVar2) {
        C12932j.m33818b(lVar, "model");
        ImageView imageView = (ImageView) mo9914a(C3891l.action);
        C12932j.m33815a((Object) imageView, "action");
        imageView.setVisibility(lVar.mo9953i() ? 0 : 8);
        AvatarLoader avatarLoader = this.f9401e;
        if (avatarLoader != null) {
            Request withPlaceholderStrategy = avatarLoader.load(C2884f.m9355a(lVar.mo9952h())).withPlaceholderStrategy(C1333c.DisplayName);
            ImageView imageView2 = (ImageView) mo9914a(C3891l.image);
            C12932j.m33815a((Object) imageView2, "image");
            withPlaceholderStrategy.into(imageView2);
            return;
        }
        C12932j.m33820c("avatarLoader");
        throw null;
    }
}
