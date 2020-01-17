package app.zenly.locator.p017a0.p018n.p021h;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.base.model.AvatarLoader.Request;
import app.zenly.locator.C3891l;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.p017a0.p018n.p019f.C1539a;
import app.zenly.locator.p017a0.p018n.p022i.C1552b;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.a0.n.h.b */
public final class C1549b extends C7717d<C1552b> {

    /* renamed from: e */
    private AvatarLoader f5464e;

    /* renamed from: f */
    private HashMap f5465f;

    /* renamed from: app.zenly.locator.a0.n.h.b$a */
    static final class C1550a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C1549b f5466e;

        C1550a(C1549b bVar) {
            this.f5466e = bVar;
        }

        public final void onClick(View view) {
            this.f5466e.mo34491a().dispatch(new C1539a(C1549b.m6742a(this.f5466e).mo7094f()));
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C1552b m6742a(C1549b bVar) {
        return (C1552b) bVar.mo34494c();
    }

    /* renamed from: a */
    public View mo7085a(int i) {
        if (this.f5465f == null) {
            this.f5465f = new HashMap();
        }
        View view = (View) this.f5465f.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f5465f.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        Context context = view.getContext();
        C12932j.m33815a((Object) context, "itemView.context");
        this.f5464e = new C2477e(context);
        TextView textView = (TextView) mo7085a(C3891l.subtitle);
        C12932j.m33815a((Object) textView, "subtitle");
        textView.setVisibility(8);
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) mo7085a(C3891l.action_mini_2);
        String str = "action_mini_2";
        C12932j.m33815a((Object) appCompatImageButton, str);
        appCompatImageButton.setVisibility(0);
        AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) mo7085a(C3891l.action_mini_2);
        C12932j.m33815a((Object) appCompatImageButton2, str);
        appCompatImageButton2.setClickable(false);
        view.setOnClickListener(new C1550a(this));
    }

    /* renamed from: f */
    public void mo6954f() {
        AvatarLoader avatarLoader = this.f5464e;
        if (avatarLoader != null) {
            ImageView imageView = (ImageView) mo7085a(C3891l.avatar);
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
    public void mo6952a(C1552b bVar, C1552b bVar2) {
        C12932j.m33818b(bVar, "model");
        AvatarLoader avatarLoader = this.f5464e;
        if (avatarLoader != null) {
            Request load = avatarLoader.load(C2884f.m9355a(bVar.mo7094f()));
            ImageView imageView = (ImageView) mo7085a(C3891l.avatar);
            C12932j.m33815a((Object) imageView, "avatar");
            load.into(imageView);
            TextView textView = (TextView) mo7085a(C3891l.title);
            C12932j.m33815a((Object) textView, "title");
            textView.setText(bVar.mo7094f().getName());
            return;
        }
        C12932j.m33820c("avatarLoader");
        throw null;
    }
}
