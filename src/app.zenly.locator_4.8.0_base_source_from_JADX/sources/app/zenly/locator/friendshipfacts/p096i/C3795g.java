package app.zenly.locator.friendshipfacts.p096i;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.base.model.AvatarLoader.Request;
import app.zenly.android.feature.base.model.C1334a.C1336b;
import app.zenly.locator.C3891l;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.friendshipfacts.p097j.C3799c;
import app.zenly.locator.friendshipfacts.p100m.C3816f;
import app.zenly.locator.p143s.p160v.p161b.C5521c;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;
import p250f.p251a.p252a.p263b.p264a.p269h.p270a.C7706a;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.friendshipfacts.i.g */
public final class C3795g extends C7717d<C3816f> {

    /* renamed from: e */
    private AvatarLoader f10124e;

    /* renamed from: f */
    private HashMap f10125f;

    /* renamed from: app.zenly.locator.friendshipfacts.i.g$a */
    static final class C3796a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3795g f10126e;

        /* renamed from: f */
        final /* synthetic */ C3816f f10127f;

        C3796a(C3795g gVar, C3816f fVar) {
            this.f10126e = gVar;
            this.f10127f = fVar;
        }

        public final void onClick(View view) {
            this.f10126e.mo34491a().dispatch(new C3799c(this.f10127f));
        }
    }

    /* renamed from: a */
    public View mo10360a(int i) {
        if (this.f10125f == null) {
            this.f10125f = new HashMap();
        }
        View view = (View) this.f10125f.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f10125f.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        Context context = view.getContext();
        C12932j.m33815a((Object) context, "itemView.context");
        this.f10124e = new C2477e(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C3816f fVar, C3816f fVar2) {
        C12932j.m33818b(fVar, "model");
        UserProto$User e = fVar.mo10400f().mo10382e();
        AvatarLoader avatarLoader = this.f10124e;
        if (avatarLoader != null) {
            Request withCorners = avatarLoader.load(C2884f.m9355a(e)).withCorners(new C1336b(0.4f));
            ImageView imageView = (ImageView) mo10360a(C3891l.avatar);
            C12932j.m33815a((Object) imageView, "avatar");
            withCorners.into(imageView);
            AppCompatTextView appCompatTextView = (AppCompatTextView) mo10360a(C3891l.rank);
            String str = "rank";
            C12932j.m33815a((Object) appCompatTextView, str);
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) mo10360a(C3891l.rank);
            C12932j.m33815a((Object) appCompatTextView2, str);
            Context context = appCompatTextView2.getContext();
            C12932j.m33815a((Object) context, "rank.context");
            appCompatTextView.setText(C7706a.m18754a(context, fVar.mo10402h() + 1, 0, 4, (Object) null));
            AppCompatTextView appCompatTextView3 = (AppCompatTextView) mo10360a(C3891l.title);
            C12932j.m33815a((Object) appCompatTextView3, "title");
            appCompatTextView3.setText(e.getName());
            AppCompatTextView appCompatTextView4 = (AppCompatTextView) mo10360a(C3891l.count);
            String str2 = "count";
            C12932j.m33815a((Object) appCompatTextView4, str2);
            AppCompatTextView appCompatTextView5 = (AppCompatTextView) mo10360a(C3891l.count);
            C12932j.m33815a((Object) appCompatTextView5, str2);
            Context context2 = appCompatTextView5.getContext();
            C12932j.m33815a((Object) context2, "count.context");
            appCompatTextView4.setText(C5521c.m15671b(context2, fVar.mo10401g()));
            mo34493b().setOnClickListener(new C3796a(this, fVar));
            return;
        }
        C12932j.m33820c("avatarLoader");
        throw null;
    }
}
