package app.zenly.locator.p017a0.p030q.p033e;

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
import app.zenly.locator.core.util.C3245z;
import app.zenly.locator.p017a0.p030q.p031c.C1630c;
import app.zenly.locator.p017a0.p030q.p034f.C1647c;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.a0.q.e.c */
public final class C1640c extends C7717d<C1647c> {

    /* renamed from: e */
    private AvatarLoader f5654e;

    /* renamed from: f */
    private HashMap f5655f;

    /* renamed from: app.zenly.locator.a0.q.e.c$a */
    static final class C1641a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C1640c f5656e;

        C1641a(C1640c cVar) {
            this.f5656e = cVar;
        }

        public final void onClick(View view) {
            this.f5656e.mo34491a().dispatch(new C1630c(C1640c.m6919a(this.f5656e)));
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C1647c m6919a(C1640c cVar) {
        return (C1647c) cVar.mo34494c();
    }

    /* renamed from: a */
    public View mo7223a(int i) {
        if (this.f5655f == null) {
            this.f5655f = new HashMap();
        }
        View view = (View) this.f5655f.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f5655f.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        Context context = view.getContext();
        C12932j.m33815a((Object) context, "itemView.context");
        this.f5654e = new C2477e(context);
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) mo7223a(C3891l.action_mini_2);
        String str = "action_mini_2";
        C12932j.m33815a((Object) appCompatImageButton, str);
        appCompatImageButton.setVisibility(0);
        AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) mo7223a(C3891l.action_mini_2);
        C12932j.m33815a((Object) appCompatImageButton2, str);
        appCompatImageButton2.setClickable(false);
        view.setOnClickListener(new C1641a(this));
    }

    /* renamed from: f */
    public void mo6954f() {
        AvatarLoader avatarLoader = this.f5654e;
        if (avatarLoader != null) {
            ImageView imageView = (ImageView) mo7223a(C3891l.avatar);
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
    public void mo6952a(C1647c cVar, C1647c cVar2) {
        String str;
        C12932j.m33818b(cVar, "model");
        AvatarLoader avatarLoader = this.f5654e;
        if (avatarLoader != null) {
            Request load = avatarLoader.load(C2884f.m9355a(cVar.mo7240f().mo9074a()));
            ImageView imageView = (ImageView) mo7223a(C3891l.avatar);
            C12932j.m33815a((Object) imageView, "avatar");
            load.into(imageView);
            TextView textView = (TextView) mo7223a(C3891l.title);
            C12932j.m33815a((Object) textView, "title");
            textView.setText(cVar.mo7240f().mo9074a().getName());
            TextView textView2 = (TextView) mo7223a(C3891l.subtitle);
            String str2 = "subtitle";
            C12932j.m33815a((Object) textView2, str2);
            Timestamp createdAt = cVar.mo7241g().mo9175a().getCreatedAt();
            C12932j.m33815a((Object) createdAt, "model.friendship.info.createdAt");
            int a = C3245z.m10280a(createdAt);
            if (a == 0) {
                TextView textView3 = (TextView) mo7223a(C3891l.subtitle);
                C12932j.m33815a((Object) textView3, str2);
                str = textView3.getContext().getString(R.string.commons_label_friendship_today);
            } else if (a == 1) {
                TextView textView4 = (TextView) mo7223a(C3891l.subtitle);
                C12932j.m33815a((Object) textView4, str2);
                str = textView4.getContext().getString(R.string.commons_label_friendship_yesterday);
            } else {
                TextView textView5 = (TextView) mo7223a(C3891l.subtitle);
                C12932j.m33815a((Object) textView5, str2);
                str = textView5.getResources().getQuantityString(R.plurals.commons_label_friendship_daysago, a, new Object[]{Integer.valueOf(a)});
            }
            textView2.setText(str);
            return;
        }
        C12932j.m33820c("avatarLoader");
        throw null;
    }
}
