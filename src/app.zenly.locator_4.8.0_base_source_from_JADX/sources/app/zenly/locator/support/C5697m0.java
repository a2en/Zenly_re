package app.zenly.locator.support;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1069g;
import androidx.recyclerview.widget.RecyclerView.C1074l;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.util.C3227n;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.support.C5724n0.C5730c;
import app.zenly.locator.support.C5724n0.C5733d;
import app.zenly.locator.support.model.C5721m;
import app.zenly.locator.support.model.C5721m.C5722a;
import app.zenly.locator.support.p169r0.C5794a;
import app.zenly.locator.support.p194u0.C5917a;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.changehandler.C8816c;
import java.util.ArrayList;
import java.util.List;
import p389io.reactivex.C12279e;

/* renamed from: app.zenly.locator.support.m0 */
public final class C5697m0 extends ZenlyController {
    /* access modifiers changed from: private */

    /* renamed from: R */
    public static final List<C5733d> f14493R = C3227n.m10229a((T[]) new C5733d[]{C5733d.REPORT_A_PROBLEM, C5733d.SEND_FEEDBACK, C5733d.ASK_A_QUESTION, C5733d.CHANGE_PHONE_NUMBER, C5733d.DELETE_ACCOUNT});

    /* renamed from: P */
    private RecyclerView f14494P;

    /* renamed from: Q */
    private C5688j0 f14495Q;

    /* renamed from: app.zenly.locator.support.m0$a */
    static /* synthetic */ class C5698a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14496a = new int[C5733d.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                app.zenly.locator.support.n0$d[] r0 = app.zenly.locator.support.C5724n0.C5733d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14496a = r0
                int[] r0 = f14496a     // Catch:{ NoSuchFieldError -> 0x0014 }
                app.zenly.locator.support.n0$d r1 = app.zenly.locator.support.C5724n0.C5733d.REPORT_A_PROBLEM     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f14496a     // Catch:{ NoSuchFieldError -> 0x001f }
                app.zenly.locator.support.n0$d r1 = app.zenly.locator.support.C5724n0.C5733d.SEND_FEEDBACK     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f14496a     // Catch:{ NoSuchFieldError -> 0x002a }
                app.zenly.locator.support.n0$d r1 = app.zenly.locator.support.C5724n0.C5733d.ASK_A_QUESTION     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f14496a     // Catch:{ NoSuchFieldError -> 0x0035 }
                app.zenly.locator.support.n0$d r1 = app.zenly.locator.support.C5724n0.C5733d.CHANGE_PHONE_NUMBER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f14496a     // Catch:{ NoSuchFieldError -> 0x0040 }
                app.zenly.locator.support.n0$d r1 = app.zenly.locator.support.C5724n0.C5733d.DELETE_ACCOUNT     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.support.C5697m0.C5698a.<clinit>():void");
        }
    }

    /* renamed from: app.zenly.locator.support.m0$b */
    private final class C5699b extends C1069g<C5722a> {

        /* renamed from: a */
        private List<C5721m> f14497a;

        private C5699b() {
            this.f14497a = new ArrayList();
        }

        public int getItemCount() {
            return this.f14497a.size();
        }

        /* renamed from: a */
        public void onBindViewHolder(C5722a aVar, int i) {
            aVar.mo13388a((C5721m) this.f14497a.get(i));
        }

        public C5722a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C5722a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_support_option_clickable, viewGroup, false), new C5783o(C5697m0.this));
        }

        /* synthetic */ C5699b(C5697m0 m0Var, C5698a aVar) {
            this();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo13364a() {
            this.f14497a = (List) C12279e.m32623b((Iterable<? extends T>) C5697m0.f14493R).mo36501i(C5644a.f14397e).mo36511n().mo36540a();
            notifyDataSetChanged();
        }
    }

    /* renamed from: c */
    private void m16059c(C8819d dVar) {
        dVar.mo23929b(mo23947l());
        C8831g k = mo23946k();
        C8836h a = C8836h.m21058a(dVar);
        a.mo24026b(new C8816c());
        a.mo24023a((ControllerChangeHandler) new C8816c());
        k.mo23991a(a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        if (mo23947l() instanceof C5659d0) {
            this.f14495Q = ((C5659d0) mo23947l()).mo7192B();
        }
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.controller_ticket_subject, viewGroup, false);
        ((ScreenBar) inflate.findViewById(R.id.screen_bar)).setTitle((int) R.string.support_create_title);
        int dimensionPixelOffset = mo23945j().getDimensionPixelOffset(R.dimen.spacing_200);
        C5699b bVar = new C5699b(this, null);
        this.f14494P = (RecyclerView) inflate.findViewById(R.id.options);
        this.f14494P.mo5045a((C1074l) new C5917a(dimensionPixelOffset));
        this.f14494P.setAdapter(bVar);
        bVar.mo13364a();
        return inflate;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m16058a(C5721m mVar) {
        C5498a.m15600a((Context) mo23920b()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        this.f14495Q.mo13349a(mVar.mo13387a());
        int i = C5698a.f14496a[mVar.mo13387a().ordinal()];
        if (i == 1) {
            m16059c(C5919w.m16432a(C5730c.TROUBLESHOOTING));
        } else if (i == 2) {
            m16059c(new C5682h0());
        } else if (i == 3) {
            m16059c(new C5789r());
        } else if (i == 4) {
            m16059c(new C5794a());
        } else if (i == 5) {
            m16059c(new C5806t());
        }
    }
}
