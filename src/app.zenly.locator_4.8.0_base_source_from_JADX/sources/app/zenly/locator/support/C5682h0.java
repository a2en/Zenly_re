package app.zenly.locator.support;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1069g;
import androidx.recyclerview.widget.RecyclerView.C1074l;
import app.zenly.android.feature.polenta.widget.ScreenBar;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.support.C5724n0.C5733d;
import app.zenly.locator.support.model.C5716j;
import app.zenly.locator.support.model.C5716j.C5717a;
import app.zenly.locator.support.p168di.C5665b;
import app.zenly.locator.support.p194u0.C5917a;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.changehandler.C8816c;
import java.util.ArrayList;
import java.util.List;
import p213co.znly.models.services.C8363x;
import p389io.reactivex.C12279e;
import p389io.reactivex.disposables.Disposable;
import p389io.reactivex.functions.Consumer;
import p389io.reactivex.p390h.p392c.C12295a;

/* renamed from: app.zenly.locator.support.h0 */
public class C5682h0 extends ZenlyController {

    /* renamed from: P */
    private C5724n0 f14453P;

    /* renamed from: Q */
    private ScreenBar f14454Q;

    /* renamed from: R */
    private ProgressBar f14455R;

    /* renamed from: S */
    private RecyclerView f14456S;

    /* renamed from: T */
    private C5684b f14457T;

    /* renamed from: U */
    private Disposable f14458U;

    /* renamed from: V */
    private C5688j0 f14459V;

    /* renamed from: app.zenly.locator.support.h0$a */
    static /* synthetic */ class C5683a {

        /* renamed from: a */
        static final /* synthetic */ int[] f14460a = new int[C5733d.values().length];

        static {
            try {
                f14460a[C5733d.SEND_FEEDBACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: app.zenly.locator.support.h0$b */
    private final class C5684b extends C1069g<C5717a> {

        /* renamed from: a */
        private List<C5716j> f14461a;

        private C5684b() {
            this.f14461a = new ArrayList();
        }

        public int getItemCount() {
            return this.f14461a.size();
        }

        /* renamed from: a */
        public void onBindViewHolder(C5717a aVar, int i) {
            aVar.mo13382a((C5716j) this.f14461a.get(i));
        }

        public C5717a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C5717a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_support_option_clickable, viewGroup, false), new C5666e(C5682h0.this));
        }

        /* synthetic */ C5684b(C5682h0 h0Var, C5683a aVar) {
            this();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo13344a(List<C8363x> list) {
            this.f14461a = (List) C12279e.m32623b((Iterable<? extends T>) list).mo36501i(C5646b.f14399e).mo36511n().mo36540a();
            notifyDataSetChanged();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        if (mo23947l() instanceof C5659d0) {
            this.f14459V = ((C5659d0) mo23947l()).mo7192B();
            C5733d c = this.f14459V.mo13356c();
            if (c != null) {
                this.f14454Q.setTitle(c.mo13427c());
                if (C5683a.f14460a[c.ordinal()] == 1) {
                    this.f14458U = this.f14453P.mo13399b().mo36507l(C5681h.f14452e).mo36428a(C12295a.m32802a()).mo36476d((Consumer<? super T>) new C5673g<Object>(this));
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        super.mo7053d(view);
        this.f14458U.dispose();
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        this.f14453P = C5665b.m15987a(context).mo13329a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.controller_ticket_category, viewGroup, false);
        this.f14454Q = (ScreenBar) inflate.findViewById(R.id.screen_bar);
        this.f14455R = (ProgressBar) inflate.findViewById(R.id.progress);
        this.f14455R.setVisibility(0);
        int dimensionPixelOffset = mo23945j().getDimensionPixelOffset(R.dimen.spacing_200);
        this.f14456S = (RecyclerView) inflate.findViewById(R.id.options);
        this.f14456S.mo5045a((C1074l) new C5917a(dimensionPixelOffset));
        this.f14457T = new C5684b(this, null);
        this.f14456S.setAdapter(this.f14457T);
        return inflate;
    }

    /* renamed from: a */
    public /* synthetic */ void mo13342a(List list) throws Exception {
        this.f14455R.setVisibility(8);
        this.f14457T.mo13344a(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m16009a(C5716j jVar) {
        C5498a.m15600a((Context) mo23920b()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        this.f14459V.mo13350a(jVar.mo13381a());
        C5690k0 k0Var = new C5690k0();
        k0Var.mo23929b(mo23947l());
        C8831g k = mo23946k();
        C8836h a = C8836h.m21058a((C8819d) k0Var);
        a.mo24026b(new C8816c());
        a.mo24023a((ControllerChangeHandler) new C8816c());
        k.mo23991a(a);
    }
}
