package app.zenly.locator.p017a0.p024p.p028g;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.base.model.AvatarLoader.Request;
import app.zenly.locator.C3891l;
import app.zenly.locator.p017a0.p024p.p029h.C1605a;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.a0.p.g.a */
public final class C1596a extends C1601e<C1605a> {

    /* renamed from: e */
    private HashMap f5565e;

    /* renamed from: a */
    public View mo7154a(int i) {
        if (this.f5565e == null) {
            this.f5565e = new HashMap();
        }
        View view = (View) this.f5565e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f5565e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
    }

    /* renamed from: f */
    public void mo6954f() {
        AvatarLoader h = ((C1605a) mo34494c()).mo7172h();
        ImageView imageView = (ImageView) mo7154a(C3891l.avatar);
        C12932j.m33815a((Object) imageView, "avatar");
        h.clear(imageView);
        super.mo6954f();
    }

    /* renamed from: a */
    public void mo7156a(C1605a aVar, C1605a aVar2) {
        C12932j.m33818b(aVar, "model");
        Request load = aVar.mo7172h().load(aVar.mo7171g());
        ImageView imageView = (ImageView) mo7154a(C3891l.avatar);
        C12932j.m33815a((Object) imageView, "avatar");
        load.into(imageView);
        ProgressBar progressBar = (ProgressBar) mo7154a(C3891l.avatar_progress);
        C12932j.m33815a((Object) progressBar, "avatar_progress");
        progressBar.setVisibility(aVar.mo7173i() ? 0 : 8);
    }
}
