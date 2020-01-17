package app.zenly.locator.dashboard.p080y;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.glide.C2476d;
import app.zenly.locator.core.glide.p067j.C2490c;
import app.zenly.locator.core.invitations.C2545e0;
import app.zenly.locator.core.invitations.p068g0.C2594d;
import app.zenly.locator.core.invitations.p068g0.C2596e;
import app.zenly.locator.dashboard.C3301c;
import app.zenly.locator.dashboard.p081z.C3426e;
import app.zenly.locator.p143s.C5407g;
import app.zenly.locator.p143s.C5407g.C5408a;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.C8978i;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.dashboard.y.e */
public final class C3392e extends C7717d<C3426e> {

    /* renamed from: e */
    private HashMap f9376e;

    /* renamed from: app.zenly.locator.dashboard.y.e$a */
    static final class C3393a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3392e f9377e;

        /* renamed from: f */
        final /* synthetic */ View f9378f;

        C3393a(C3392e eVar, View view) {
            this.f9377e = eVar;
            this.f9378f = view;
        }

        public final void onClick(View view) {
            C5408a aVar = C5407g.f13966d;
            Context context = this.f9378f.getContext();
            C12932j.m33815a((Object) context, "itemView.context");
            new C2594d(aVar.mo12991a(context).mo12986h()).mo8710g(true);
            this.f9377e.mo34491a().dispatch(new C3301c(C3392e.m10592a(this.f9377e).mo9932f(), 0, 2, null));
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C3426e m10592a(C3392e eVar) {
        return (C3426e) eVar.mo34494c();
    }

    /* renamed from: a */
    public View mo9891a(int i) {
        if (this.f9376e == null) {
            this.f9376e = new HashMap();
        }
        View view = (View) this.f9376e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f9376e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        view.setOnClickListener(new C3393a(this, view));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C3426e eVar, C3426e eVar2) {
        C12932j.m33818b(eVar, "model");
        C2545e0 f = eVar.mo9932f();
        Context context = mo34493b().getContext();
        C12932j.m33815a((Object) context, "context");
        String a = C2596e.m8923a(f, context);
        TextView textView = (TextView) mo9891a(C3891l.title);
        C12932j.m33815a((Object) textView, "title");
        textView.setText(context.getString(R.string.map_search_section_broadcastedInvite_subline, new Object[]{a}));
        C2476d.m8583a(mo34493b()).m8717a(Integer.valueOf(f.mo8683a())).m8691a(C8978i.f23423a).m8690a((Transformation<Bitmap>) new C2490c<Bitmap>(null, 1, null)).mo24173a((ImageView) mo9891a(C3891l.logo));
    }
}
