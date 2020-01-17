package app.zenly.locator.map.p105e1;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import app.zenly.locator.R;
import app.zenly.locator.core.models.C2896p;
import app.zenly.locator.core.models.C2908w.C2910b;
import app.zenly.locator.core.models.C2916z.C2918b;
import app.zenly.locator.core.p072ui.controller.C3103g.C3106c;
import app.zenly.locator.map.p112k1.C4084a;
import app.zenly.locator.map.text.C4301d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;

/* renamed from: app.zenly.locator.map.e1.b */
public final class C3934b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C4084a f10396a;

    /* renamed from: b */
    private final C2896p f10397b;

    /* renamed from: app.zenly.locator.map.e1.b$a */
    private enum C3935a {
        BODY(R.string.getNotified_heading_home_body, R.string.getNotified_heading_work_body, R.string.getNotified_heading_school_body),
        TITLE(R.string.getNotified_heading_home_title_noMonitoring, R.string.getNotified_heading_work_title_noMonitoring, R.string.getNotified_heading_school_title_noMonitoring);
        

        /* renamed from: e */
        private final int f10401e;

        /* renamed from: f */
        private final int f10402f;

        /* renamed from: g */
        private final int f10403g;

        private C3935a(int i, int i2, int i3) {
            this.f10401e = i;
            this.f10402f = i2;
            this.f10403g = i3;
        }

        /* renamed from: a */
        public final int mo10582a(C2918b bVar) {
            C12932j.m33818b(bVar, "tag");
            int i = C3933a.f10395a[bVar.ordinal()];
            if (i == 1) {
                return this.f10401e;
            }
            if (i == 2) {
                return this.f10402f;
            }
            if (i == 3) {
                return this.f10403g;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            throw new IllegalStateException("Incorrect heading destination place");
        }
    }

    /* renamed from: app.zenly.locator.map.e1.b$b */
    static final class C3936b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3934b f10404e;

        C3936b(C3934b bVar) {
            this.f10404e = bVar;
        }

        public final void onClick(View view) {
            this.f10404e.f10396a.mo10751c();
        }
    }

    public C3934b(C4084a aVar, C2896p pVar) {
        C12932j.m33818b(aVar, "capsuleStatePresenter");
        this.f10396a = aVar;
        this.f10397b = pVar;
    }

    /* renamed from: a */
    public final void mo10581a(Activity activity) {
        int i;
        int i2;
        C12932j.m33818b(activity, "activity");
        C2896p pVar = this.f10397b;
        if (pVar != null && pVar.f8222z.mo8994c()) {
            C2910b d = this.f10397b.f8222z.mo8995d();
            if (this.f10396a.mo10749a()) {
                i2 = 2131231388;
                i = R.string.getNotified_cta_monitoring;
            } else {
                i2 = 2131231386;
                i = R.string.getNotified_cta_noMonitoring;
            }
            String string = activity.getString(i);
            C12932j.m33815a((Object) string, "activity.getString(actionTextKey)");
            String a = C7709b.m18763a(activity, C3935a.TITLE.mo10582a(d.mo9005c().mo9017d()), this.f10397b.f8198b.mo8942e());
            C3106c cVar = new C3106c(activity);
            cVar.mo9338a(string, null, new C3936b(this));
            cVar.mo9347d(i2);
            cVar.mo9346c(a);
            if (d.mo9006d()) {
                long a2 = this.f10397b.f8222z.mo8995d().mo8999a() - System.currentTimeMillis();
                cVar.mo9341b(C7709b.m18763a(activity, C3935a.BODY.mo10582a(d.mo9005c().mo9017d()), this.f10397b.f8198b.mo8942e(), C4301d.f11508f.mo11334a(activity, a2)));
            }
            cVar.mo9344b().mo9296j(activity);
        }
    }
}
