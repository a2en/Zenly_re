package app.zenly.locator.friendshipfacts.p096i;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0540a;
import app.zenly.android.base.widget.C1315a;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.base.model.AvatarLoader.Request;
import app.zenly.android.feature.base.model.AvatarLoader.Request.C1333c;
import app.zenly.android.feature.base.model.C1334a.C1336b;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.friendshipfacts.p097j.C3797a;
import app.zenly.locator.friendshipfacts.p100m.C3815e;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p269h.p270a.C7706a;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.friendshipfacts.i.d */
public final class C3790d extends C7717d<C3815e> {

    /* renamed from: e */
    private AvatarLoader f10118e;

    /* renamed from: f */
    private HashMap f10119f;

    /* renamed from: app.zenly.locator.friendshipfacts.i.d$a */
    static final class C3791a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3790d f10120e;

        /* renamed from: f */
        final /* synthetic */ C3815e f10121f;

        C3791a(C3790d dVar, C3815e eVar) {
            this.f10120e = dVar;
            this.f10121f = eVar;
        }

        public final void onClick(View view) {
            this.f10120e.mo34491a().dispatch(new C3797a(this.f10121f.mo10399f()));
        }
    }

    /* renamed from: a */
    public View mo10354a(int i) {
        if (this.f10119f == null) {
            this.f10119f = new HashMap();
        }
        View view = (View) this.f10119f.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f10119f.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        Context context = view.getContext();
        C12932j.m33815a((Object) context, "itemView.context");
        this.f10118e = new C2477e(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C3815e eVar, C3815e eVar2) {
        C12932j.m33818b(eVar, "model");
        Context context = mo34493b().getContext();
        AvatarLoader avatarLoader = this.f10118e;
        if (avatarLoader != null) {
            Request withCorners = avatarLoader.load(C2884f.m9355a(eVar.mo10399f().mo10389c())).withPlaceholderStrategy(C1333c.DisplayName).withCorners(new C1336b(0.4f));
            ImageView imageView = (ImageView) mo10354a(C3891l.streak_user_avatar);
            C12932j.m33815a((Object) imageView, "streak_user_avatar");
            withCorners.into(imageView);
            TextView textView = (TextView) mo10354a(C3891l.streak_value);
            String str = "streak_value";
            C12932j.m33815a((Object) textView, str);
            C12932j.m33815a((Object) context, "context");
            textView.setText(C7706a.m18754a(context, Math.abs(eVar.mo10399f().mo10388b()), 0, 4, (Object) null));
            if (eVar.mo10399f().mo10388b() > 0) {
                TextView textView2 = (TextView) mo10354a(C3891l.streak_value);
                C12932j.m33815a((Object) textView2, str);
                C1315a.m6316a(textView2, (int) R.drawable.icon_flame_orange_dark_size_12, 0, 0, 0, 14, (Object) null);
                ((TextView) mo10354a(C3891l.streak_value)).setTextColor(C0540a.m2536a(context, (int) R.color.orange_dark));
                ((TextView) mo10354a(C3891l.streak_value)).setBackgroundResource(R.drawable.round_rect_orange_light_cr200_border_100);
            } else {
                TextView textView3 = (TextView) mo10354a(C3891l.streak_value);
                C12932j.m33815a((Object) textView3, str);
                C1315a.m6316a(textView3, (int) R.drawable.icon_skull_cerulean_blue_size_12, 0, 0, 0, 14, (Object) null);
                ((TextView) mo10354a(C3891l.streak_value)).setTextColor(C0540a.m2536a(context, (int) R.color.cerulean_blue_dark));
                ((TextView) mo10354a(C3891l.streak_value)).setBackgroundResource(R.drawable.round_rect_cerulean_blue_dark_cr200_border_100);
            }
            mo34493b().setOnClickListener(new C3791a(this, eVar));
            return;
        }
        C12932j.m33820c("avatarLoader");
        throw null;
    }
}
