package app.zenly.locator.dashboard.p080y;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import app.zenly.android.feature.base.model.C1334a.C1335a;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.glide.C2476d;
import app.zenly.locator.core.glide.p067j.C2490c;
import app.zenly.locator.core.invitations.C2545e0;
import app.zenly.locator.core.invitations.C2545e0.C2564j;
import app.zenly.locator.core.invitations.C2545e0.C2566k;
import app.zenly.locator.core.invitations.p068g0.C2594d;
import app.zenly.locator.dashboard.C3301c;
import app.zenly.locator.dashboard.C3302d;
import app.zenly.locator.dashboard.p081z.C3425d;
import app.zenly.locator.p143s.C5407g;
import app.zenly.locator.p143s.C5407g.C5408a;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.C8978i;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.C12844m;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.dashboard.y.d */
public final class C3388d extends C7717d<C3425d> {

    /* renamed from: e */
    private List<? extends View> f9370e;

    /* renamed from: f */
    private HashMap f9371f;

    /* renamed from: app.zenly.locator.dashboard.y.d$a */
    public static final class C3389a {
        private C3389a() {
        }

        public /* synthetic */ C3389a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.dashboard.y.d$b */
    static final class C3390b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C2545e0 f9372e;

        /* renamed from: f */
        final /* synthetic */ int f9373f;

        /* renamed from: g */
        final /* synthetic */ C3388d f9374g;

        C3390b(C2545e0 e0Var, int i, C3388d dVar, int i2, List list) {
            this.f9372e = e0Var;
            this.f9373f = i;
            this.f9374g = dVar;
        }

        public final void onClick(View view) {
            C5408a aVar = C5407g.f13966d;
            Context context = this.f9374g.mo34493b().getContext();
            C12932j.m33815a((Object) context, "itemView.context");
            new C2594d(aVar.mo12991a(context).mo12986h()).mo8710g(true);
            this.f9374g.mo34491a().dispatch(new C3301c(this.f9372e, this.f9373f));
        }
    }

    /* renamed from: app.zenly.locator.dashboard.y.d$c */
    static final class C3391c implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3388d f9375e;

        C3391c(C3388d dVar) {
            this.f9375e = dVar;
        }

        public final void onClick(View view) {
            C5408a aVar = C5407g.f13966d;
            Context context = this.f9375e.mo34493b().getContext();
            C12932j.m33815a((Object) context, "itemView.context");
            new C2594d(aVar.mo12991a(context).mo12986h()).mo8710g(true);
            this.f9375e.mo34491a().dispatch(C3302d.f9185a);
        }
    }

    static {
        new C3389a(null);
    }

    /* renamed from: a */
    public View mo9887a(int i) {
        if (this.f9371f == null) {
            this.f9371f = new HashMap();
        }
        View view = (View) this.f9371f.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f9371f.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        this.f9370e = C12848o.m33643b((Object[]) new View[]{mo9887a(C3891l.container_1), mo9887a(C3891l.container_2), mo9887a(C3891l.container_3), mo9887a(C3891l.container_4), mo9887a(C3891l.container_5)});
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C3425d dVar, C3425d dVar2) {
        int i;
        int i2;
        C12932j.m33818b(dVar, "model");
        List f = dVar.mo9931f();
        int i3 = 0;
        boolean z = f.size() > 5;
        if (z) {
            i = C12973l.m33890b(f.size(), 4);
        } else {
            i = f.size();
        }
        int i4 = i;
        List<? extends View> list = this.f9370e;
        String str = "containers";
        if (list != null) {
            int i5 = 0;
            for (Object next : list) {
                int i6 = i5 + 1;
                if (i5 >= 0) {
                    View view = (View) next;
                    ImageView imageView = (ImageView) view.findViewById(C3891l.logo);
                    TextView textView = (TextView) view.findViewById(C3891l.app_name);
                    if (i5 < i4) {
                        view.setVisibility(i3);
                        Context context = mo34493b().getContext();
                        C2545e0 e0Var = (C2545e0) f.get(i5);
                        if (C12932j.m33817a((Object) e0Var, (Object) C2564j.f7626e)) {
                            i2 = C2566k.f7628e.mo8683a();
                        } else {
                            i2 = e0Var.mo8683a();
                        }
                        C12932j.m33815a((Object) context, "context");
                        View view2 = view;
                        C2476d.m8582a(context).m8717a(Integer.valueOf(i2)).m8690a((Transformation<Bitmap>) new C2490c<Bitmap>(new C1335a((float) context.getResources().getDimensionPixelSize(R.dimen.corner_radius_300)))).m8691a(C8978i.f23423a).mo24173a(imageView);
                        C12932j.m33815a((Object) textView, "appName");
                        textView.setText(context.getString(e0Var.mo8687b()));
                        View view3 = view2;
                        C3390b bVar = new C3390b(e0Var, i5, this, i4, f);
                        view3.setOnClickListener(bVar);
                    } else {
                        view.setVisibility(8);
                    }
                    i5 = i6;
                    i3 = 0;
                } else {
                    C12844m.m33616c();
                    throw null;
                }
            }
            if (z) {
                List<? extends View> list2 = this.f9370e;
                if (list2 == null) {
                    C12932j.m33820c(str);
                    throw null;
                } else if (list2 != null) {
                    View view4 = (View) list2.get(list2.size() - 1);
                    TextView textView2 = (TextView) view4.findViewById(C3891l.app_name);
                    ((ImageView) view4.findViewById(C3891l.logo)).setImageResource(2131231278);
                    textView2.setText(R.string.add_friends_section_broadcastedInvite_more);
                    view4.setVisibility(0);
                    view4.setOnClickListener(new C3391c(this));
                } else {
                    C12932j.m33820c(str);
                    throw null;
                }
            }
        } else {
            C12932j.m33820c(str);
            throw null;
        }
    }
}
