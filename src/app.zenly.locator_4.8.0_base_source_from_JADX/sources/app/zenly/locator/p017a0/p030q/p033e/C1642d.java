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
import app.zenly.locator.p017a0.p030q.p031c.C1631d;
import app.zenly.locator.p017a0.p030q.p034f.C1648d;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p213co.znly.core.vendor.com.google.protobuf.Timestamp;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.a0.q.e.d */
public final class C1642d extends C7717d<C1648d> {

    /* renamed from: e */
    private AvatarLoader f5657e;

    /* renamed from: f */
    private HashMap f5658f;

    /* renamed from: app.zenly.locator.a0.q.e.d$a */
    static final class C1643a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C1642d f5659e;

        C1643a(C1642d dVar) {
            this.f5659e = dVar;
        }

        public final void onClick(View view) {
            this.f5659e.mo34491a().dispatch(new C1631d(C1642d.m6925a(this.f5659e).mo7247f()));
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C1648d m6925a(C1642d dVar) {
        return (C1648d) dVar.mo34494c();
    }

    /* renamed from: a */
    public View mo7226a(int i) {
        if (this.f5658f == null) {
            this.f5658f = new HashMap();
        }
        View view = (View) this.f5658f.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f5658f.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        Context context = view.getContext();
        C12932j.m33815a((Object) context, "itemView.context");
        this.f5657e = new C2477e(context);
        TextView textView = (TextView) mo7226a(C3891l.status);
        C12932j.m33815a((Object) textView, "status");
        textView.setVisibility(0);
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) mo7226a(C3891l.action_mini_1);
        String str = "action_mini_1";
        C12932j.m33815a((Object) appCompatImageButton, str);
        appCompatImageButton.setVisibility(0);
        AppCompatImageButton appCompatImageButton2 = (AppCompatImageButton) mo7226a(C3891l.action_mini_1);
        C12932j.m33815a((Object) appCompatImageButton2, str);
        appCompatImageButton2.setClickable(false);
        view.setOnClickListener(new C1643a(this));
    }

    /* renamed from: f */
    public void mo6954f() {
        AvatarLoader avatarLoader = this.f5657e;
        if (avatarLoader != null) {
            ImageView imageView = (ImageView) mo7226a(C3891l.avatar);
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
    public void mo6952a(C1648d dVar, C1648d dVar2) {
        String str;
        C12932j.m33818b(dVar, "model");
        AvatarLoader avatarLoader = this.f5657e;
        if (avatarLoader != null) {
            Request load = avatarLoader.load(C2884f.m9355a(dVar.mo7247f().mo9123c()));
            ImageView imageView = (ImageView) mo7226a(C3891l.avatar);
            C12932j.m33815a((Object) imageView, "avatar");
            load.into(imageView);
            TextView textView = (TextView) mo7226a(C3891l.title);
            C12932j.m33815a((Object) textView, "title");
            textView.setText(dVar.mo7247f().mo9122b().getTargetName());
            TextView textView2 = (TextView) mo7226a(C3891l.subtitle);
            String str2 = "subtitle";
            C12932j.m33815a((Object) textView2, str2);
            Object obj = dVar.mo7247f().mo9122b().getSentAt9List().get(0);
            C12932j.m33815a(obj, "model.friendRequest.request.sentAt9List[0]");
            int a = C3245z.m10280a((Timestamp) obj);
            if (a == 0) {
                TextView textView3 = (TextView) mo7226a(C3891l.subtitle);
                C12932j.m33815a((Object) textView3, str2);
                str = textView3.getContext().getString(R.string.commons_label_invitation_today);
            } else if (a == 1) {
                TextView textView4 = (TextView) mo7226a(C3891l.subtitle);
                C12932j.m33815a((Object) textView4, str2);
                str = textView4.getContext().getString(R.string.commons_label_invitation_yesterday);
            } else {
                TextView textView5 = (TextView) mo7226a(C3891l.subtitle);
                C12932j.m33815a((Object) textView5, str2);
                str = textView5.getResources().getQuantityString(R.plurals.commons_label_invitation_daysago, a, new Object[]{Integer.valueOf(a)});
            }
            textView2.setText(str);
            ((TextView) mo7226a(C3891l.status)).setText(R.string.commons_label_invited_singular);
            return;
        }
        C12932j.m33820c("avatarLoader");
        throw null;
    }
}
