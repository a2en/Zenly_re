package app.zenly.locator.map.p105e1;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import app.zenly.locator.R;
import app.zenly.locator.core.models.C2896p;
import app.zenly.locator.core.p072ui.controller.C3103g.C3106c;
import app.zenly.locator.map.p112k1.C4084a;
import app.zenly.locator.p143s.p160v.p161b.C5521c;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;

/* renamed from: app.zenly.locator.map.e1.c */
public final class C3937c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4084a f10405a;

    /* renamed from: b */
    private final C2896p f10406b;

    /* renamed from: app.zenly.locator.map.e1.c$a */
    static final class C3938a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3937c f10407e;

        C3938a(C3937c cVar) {
            this.f10407e = cVar;
        }

        public final void onClick(View view) {
            this.f10407e.f10405a.mo10752d();
        }
    }

    public C3937c(C4084a aVar, C2896p pVar) {
        C12932j.m33818b(aVar, "capsuleStatePresenter");
        this.f10405a = aVar;
        this.f10406b = pVar;
    }

    /* renamed from: a */
    public final void mo10584a(Activity activity) {
        int i;
        int i2;
        C12932j.m33818b(activity, "activity");
        if (this.f10406b != null) {
            if (this.f10405a.mo10749a()) {
                i2 = 2131231388;
                i = R.string.getNotified_cta_monitoring;
            } else {
                i2 = 2131231386;
                i = R.string.getNotified_cta_noMonitoring;
            }
            String string = activity.getString(i);
            C12932j.m33815a((Object) string, "activity.getString(actionTextKey)");
            long c = this.f10406b.f8192A.mo8929c() - System.currentTimeMillis();
            C3106c cVar = new C3106c(activity);
            cVar.mo9338a(string, null, new C3938a(this));
            cVar.mo9347d(i2);
            cVar.mo9346c(C7709b.m18763a(activity, R.string.getNotified_sleeping_title_noMonitoring, this.f10406b.f8198b.mo8942e()));
            if (c > 0) {
                cVar.mo9341b(C7709b.m18763a(activity, R.string.getNotified_sleeping_body, this.f10406b.f8198b.mo8942e(), C5521c.m15669a((Context) activity, C12973l.m33887a(c, TimeUnit.MINUTES.toMillis(1)))));
            }
            cVar.mo9344b().mo9296j(activity);
        }
    }
}
