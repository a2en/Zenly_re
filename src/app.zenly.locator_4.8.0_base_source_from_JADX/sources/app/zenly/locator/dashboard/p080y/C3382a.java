package app.zenly.locator.dashboard.p080y;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.view.C0657l;
import app.zenly.android.base.widget.LinearLayout;
import app.zenly.android.feature.base.model.AvatarLoader;
import app.zenly.android.feature.base.model.AvatarLoader.Request;
import app.zenly.android.feature.base.model.AvatarLoader.Request.C1333c;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.dashboard.C3293a;
import app.zenly.locator.dashboard.C3315l;
import app.zenly.locator.dashboard.p081z.C3421a;
import app.zenly.locator.dashboard.p081z.C3422b;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.dashboard.y.a */
public final class C3382a extends C7717d<C3422b> {

    /* renamed from: e */
    private AvatarLoader f9361e;

    /* renamed from: f */
    private HashMap f9362f;

    /* renamed from: app.zenly.locator.dashboard.y.a$a */
    static final class C3383a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3382a f9363e;

        /* renamed from: f */
        final /* synthetic */ C3422b f9364f;

        /* renamed from: g */
        final /* synthetic */ int f9365g;

        C3383a(C3382a aVar, C3422b bVar, int i) {
            this.f9363e = aVar;
            this.f9364f = bVar;
            this.f9365g = i;
        }

        public final void onClick(View view) {
            this.f9363e.mo34491a().dispatch(new C3293a((C3421a) this.f9364f.mo9928f().get(this.f9365g)));
        }
    }

    /* renamed from: app.zenly.locator.dashboard.y.a$b */
    static final class C3384b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3382a f9366e;

        C3384b(C3382a aVar) {
            this.f9366e = aVar;
        }

        public final void onClick(View view) {
            this.f9366e.mo34491a().dispatch(C3315l.f9220a);
        }
    }

    /* renamed from: a */
    public View mo9880a(int i) {
        if (this.f9362f == null) {
            this.f9362f = new HashMap();
        }
        View view = (View) this.f9362f.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f9362f.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        Context context = view.getContext();
        C12932j.m33815a((Object) context, "itemView.context");
        this.f9361e = new C2477e(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C3422b bVar, C3422b bVar2) {
        C12932j.m33818b(bVar, "model");
        LinearLayout linearLayout = (LinearLayout) mo9880a(C3891l.grid);
        String str = "grid";
        C12932j.m33815a((Object) linearLayout, str);
        int min = Math.min(linearLayout.getChildCount(), 2);
        LinearLayout linearLayout2 = (LinearLayout) mo9880a(C3891l.grid);
        C12932j.m33815a((Object) linearLayout2, str);
        View a = C0657l.m3058a(linearLayout2, 0);
        if (a != null) {
            int childCount = ((ViewGroup) a).getChildCount();
            int i = min * childCount;
            int i2 = 0;
            while (i2 < i) {
                LinearLayout linearLayout3 = (LinearLayout) mo9880a(C3891l.grid);
                C12932j.m33815a((Object) linearLayout3, str);
                View a2 = C0657l.m3058a(linearLayout3, i2 / childCount);
                if (a2 != null) {
                    LinearLayout linearLayout4 = (LinearLayout) a2;
                    View a3 = C0657l.m3058a(linearLayout4, i2 % childCount);
                    ImageView imageView = (ImageView) a3.findViewById(R.id.placeholder);
                    ImageView imageView2 = (ImageView) a3.findViewById(R.id.image);
                    linearLayout4.setVisibility(0);
                    String str2 = "image";
                    String str3 = "placeholder";
                    if (i2 < bVar.mo9928f().size()) {
                        UserProto$User a4 = ((C3421a) bVar.mo9928f().get(i2)).mo9926a();
                        C12932j.m33815a((Object) imageView, str3);
                        imageView.setVisibility(8);
                        imageView2.setVisibility(0);
                        imageView2.setContentDescription(a4.getName());
                        a3.setOnClickListener(new C3383a(this, bVar, i2));
                        AvatarLoader avatarLoader = this.f9361e;
                        if (avatarLoader != null) {
                            Request withPlaceholderStrategy = avatarLoader.load(C2884f.m9355a(a4)).withPlaceholderStrategy(C1333c.DisplayName);
                            C12932j.m33815a((Object) imageView2, str2);
                            withPlaceholderStrategy.into(imageView2);
                            a3.setActivated(false);
                        } else {
                            C12932j.m33820c("avatarLoader");
                            throw null;
                        }
                    } else {
                        C12932j.m33815a((Object) imageView, str3);
                        imageView.setVisibility(0);
                        C12932j.m33815a((Object) imageView2, str2);
                        imageView2.setVisibility(8);
                        if (i2 == bVar.mo9928f().size()) {
                            a3.setActivated(true);
                        } else {
                            a3.setActivated(false);
                        }
                        a3.setOnClickListener(new C3384b(this));
                    }
                    i2++;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type app.zenly.android.base.widget.LinearLayout");
                }
            }
            if (bVar.mo9928f().size() < childCount) {
                LinearLayout linearLayout5 = (LinearLayout) mo9880a(C3891l.grid);
                C12932j.m33815a((Object) linearLayout5, str);
                C0657l.m3058a(linearLayout5, 1).setVisibility(8);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
