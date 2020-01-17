package app.zenly.locator.p086e0.p087a.p090k;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.analytics.tracker.AnalyticsTracker;
import app.zenly.locator.p086e0.p087a.p088i.C3624e;
import app.zenly.locator.p086e0.p087a.p091l.C3658c;
import app.zenly.locator.p143s.C5343a;
import app.zenly.locator.recommendation.C5245d;
import app.zenly.locator.recommendation.C5245d.C5246a;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.e0.a.k.d */
public final class C3649d extends C7717d<C3658c> {

    /* renamed from: e */
    private HashMap f9784e;

    /* renamed from: app.zenly.locator.e0.a.k.d$a */
    static final class C3650a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3649d f9785e;

        C3650a(C3649d dVar) {
            this.f9785e = dVar;
        }

        public final void onClick(View view) {
            C5343a U = C5343a.m15160U();
            C12932j.m33815a((Object) U, "Analytics.get()");
            AnalyticsTracker a = U.mo12806a();
            C12932j.m33815a((Object) a, "Analytics.get().tracker");
            C5245d dVar = new C5245d(a);
            dVar.mo12592a();
            dVar.mo12595b(C5246a.PROFILE_OTHER);
            this.f9785e.mo34491a().dispatch(C3624e.f9741a);
        }
    }

    /* renamed from: a */
    public View mo10135a(int i) {
        if (this.f9784e == null) {
            this.f9784e = new HashMap();
        }
        View view = (View) this.f9784e.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f9784e.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        ((TextView) mo10135a(C3891l.recommend_friends)).setOnClickListener(new C3650a(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C3658c cVar, C3658c cVar2) {
        C12932j.m33818b(cVar, "model");
        Context context = mo34493b().getContext();
        C12932j.m33815a((Object) context, "itemView.context");
        Resources resources = context.getResources();
        TextView textView = (TextView) mo10135a(C3891l.title);
        C12932j.m33815a((Object) textView, "title");
        textView.setText(resources.getString(R.string.recommendation_profileOther_content, new Object[]{cVar.mo10160f()}));
    }
}
