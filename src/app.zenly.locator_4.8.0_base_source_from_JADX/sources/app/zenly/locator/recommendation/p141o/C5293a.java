package app.zenly.locator.recommendation.p141o;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.base.model.AvatarLoader.Request;
import app.zenly.locator.C3891l;
import app.zenly.locator.recommendation.C5264i;
import app.zenly.locator.recommendation.p139m.C5289a;
import app.zenly.locator.recommendation.p142p.C5300a;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.recommendation.o.a */
public final class C5293a extends C7717d<C5300a> {

    /* renamed from: e */
    private AvatarLoader f13610e;

    /* renamed from: f */
    private HashMap f13611f;

    /* renamed from: app.zenly.locator.recommendation.o.a$a */
    static final class C5294a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C5293a f13612e;

        /* renamed from: f */
        final /* synthetic */ C5300a f13613f;

        C5294a(C5293a aVar, C5300a aVar2) {
            this.f13612e = aVar;
            this.f13613f = aVar2;
        }

        public final void onClick(View view) {
            if (!this.f13613f.mo12671f()) {
                CheckBox checkBox = (CheckBox) this.f13612e.mo12663a(C3891l.check_box);
                String str = "check_box";
                C12932j.m33815a((Object) checkBox, str);
                boolean z = !checkBox.isChecked();
                this.f13613f.mo12670a(z);
                this.f13612e.mo34491a().dispatch(new C5289a(this.f13613f.mo12672g().getId(), z));
                CheckBox checkBox2 = (CheckBox) this.f13612e.mo12663a(C3891l.check_box);
                C12932j.m33815a((Object) checkBox2, str);
                checkBox2.setChecked(z);
            }
        }
    }

    /* renamed from: a */
    public View mo12663a(int i) {
        if (this.f13611f == null) {
            this.f13611f = new HashMap();
        }
        View view = (View) this.f13611f.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f13611f.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        Context context = view.getContext();
        C12932j.m33815a((Object) context, "context");
        this.f13610e = C5264i.m14923a(context).mo12618a();
    }

    /* renamed from: f */
    public void mo6954f() {
        AvatarLoader avatarLoader = this.f13610e;
        if (avatarLoader != null) {
            ImageView imageView = (ImageView) mo12663a(C3891l.avatar);
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
    public void mo6952a(C5300a aVar, C5300a aVar2) {
        C12932j.m33818b(aVar, "model");
        TextView textView = (TextView) mo12663a(C3891l.title);
        C12932j.m33815a((Object) textView, "title");
        textView.setText(aVar.mo12672g().getName());
        mo34493b().setOnClickListener(new C5294a(this, aVar));
        String str = "mutual_friend";
        String str2 = "check_box";
        if (aVar.mo12671f()) {
            TextView textView2 = (TextView) mo12663a(C3891l.mutual_friend);
            C12932j.m33815a((Object) textView2, str);
            textView2.setVisibility(0);
            CheckBox checkBox = (CheckBox) mo12663a(C3891l.check_box);
            C12932j.m33815a((Object) checkBox, str2);
            checkBox.setVisibility(4);
        } else {
            TextView textView3 = (TextView) mo12663a(C3891l.mutual_friend);
            C12932j.m33815a((Object) textView3, str);
            textView3.setVisibility(4);
            CheckBox checkBox2 = (CheckBox) mo12663a(C3891l.check_box);
            C12932j.m33815a((Object) checkBox2, str2);
            checkBox2.setVisibility(0);
            CheckBox checkBox3 = (CheckBox) mo12663a(C3891l.check_box);
            C12932j.m33815a((Object) checkBox3, str2);
            checkBox3.setChecked(aVar.mo12673h());
        }
        AvatarLoader avatarLoader = this.f13610e;
        if (avatarLoader != null) {
            Request load = avatarLoader.load(aVar.mo12672g().getAvatar());
            ImageView imageView = (ImageView) mo12663a(C3891l.avatar);
            C12932j.m33815a((Object) imageView, "avatar");
            load.into(imageView);
            return;
        }
        C12932j.m33820c("avatarLoader");
        throw null;
    }
}
