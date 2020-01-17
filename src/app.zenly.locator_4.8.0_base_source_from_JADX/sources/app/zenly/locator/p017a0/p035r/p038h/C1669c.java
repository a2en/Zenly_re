package app.zenly.locator.p017a0.p035r.p038h;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.base.model.AvatarLoader.Request;
import app.zenly.locator.C3891l;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.p017a0.p035r.p036f.C1660b;
import app.zenly.locator.p017a0.p035r.p039i.C1674c;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.a0.r.h.c */
public final class C1669c extends C7717d<C1674c> {

    /* renamed from: e */
    private AvatarLoader f5709e;

    /* renamed from: f */
    private final OnCheckedChangeListener f5710f = new C1670a(this);

    /* renamed from: g */
    private HashMap f5711g;

    /* renamed from: app.zenly.locator.a0.r.h.c$a */
    static final class C1670a implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C1669c f5712a;

        C1670a(C1669c cVar) {
            this.f5712a = cVar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            this.f5712a.mo34491a().dispatch(new C1660b(C1669c.m6990a(this.f5712a), z));
        }
    }

    /* renamed from: app.zenly.locator.a0.r.h.c$b */
    static final class C1671b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C1669c f5713e;

        C1671b(C1669c cVar) {
            this.f5713e = cVar;
        }

        public final void onClick(View view) {
            ((SwitchCompat) this.f5713e.mo7270a(C3891l.friend_manager_switch)).toggle();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C1674c m6990a(C1669c cVar) {
        return (C1674c) cVar.mo34494c();
    }

    /* renamed from: a */
    public View mo7270a(int i) {
        if (this.f5711g == null) {
            this.f5711g = new HashMap();
        }
        View view = (View) this.f5711g.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f5711g.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        Context context = view.getContext();
        C12932j.m33815a((Object) context, "itemView.context");
        this.f5709e = new C2477e(context);
        view.setOnClickListener(new C1671b(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C1674c cVar, C1674c cVar2) {
        C12932j.m33818b(cVar, "model");
        TextView textView = (TextView) mo7270a(C3891l.friend_manager_name);
        C12932j.m33815a((Object) textView, "friend_manager_name");
        textView.setText(cVar.mo7285f().mo9074a().getName());
        AvatarLoader avatarLoader = this.f5709e;
        if (avatarLoader != null) {
            Request load = avatarLoader.load(C2884f.m9355a(cVar.mo7285f().mo9074a()));
            ImageView imageView = (ImageView) mo7270a(C3891l.friend_manager_avatar);
            C12932j.m33815a((Object) imageView, "friend_manager_avatar");
            load.into(imageView);
            SwitchCompat switchCompat = (SwitchCompat) mo7270a(C3891l.friend_manager_switch);
            switchCompat.setOnCheckedChangeListener(null);
            switchCompat.setChecked(cVar.mo7287h());
            switchCompat.setOnCheckedChangeListener(this.f5710f);
            switchCompat.setAlpha(cVar.mo7289i() ? 1.0f : 0.5f);
            mo34493b().setEnabled(cVar.mo7289i());
            return;
        }
        C12932j.m33820c("avatarLoader");
        throw null;
    }
}
