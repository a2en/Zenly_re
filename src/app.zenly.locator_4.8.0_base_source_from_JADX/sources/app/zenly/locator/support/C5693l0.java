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
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.support.model.C5719l;
import app.zenly.locator.support.model.C5719l.C5720a;
import app.zenly.locator.support.p194u0.C5917a;
import com.bluelinelabs.conductor.C8819d;
import java.util.ArrayList;
import java.util.List;
import p213co.znly.models.services.C8363x;
import p389io.reactivex.C12279e;

/* renamed from: app.zenly.locator.support.l0 */
public final class C5693l0 extends ZenlyController {

    /* renamed from: P */
    private ScreenBar f14485P;

    /* renamed from: Q */
    private ScreenBar f14486Q;

    /* renamed from: R */
    private RecyclerView f14487R;

    /* renamed from: S */
    private C5695b f14488S;
    /* access modifiers changed from: private */

    /* renamed from: T */
    public C5688j0 f14489T;

    /* renamed from: app.zenly.locator.support.l0$b */
    private final class C5695b extends C1069g<C5720a> {

        /* renamed from: a */
        private List<C5719l> f14490a;

        private C5695b() {
            this.f14490a = new ArrayList();
        }

        public int getItemCount() {
            return this.f14490a.size();
        }

        /* renamed from: a */
        public void onBindViewHolder(C5720a aVar, int i) {
            aVar.mo13386a((C5719l) this.f14490a.get(i));
        }

        public C5720a onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C5720a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_support_option_checkable, viewGroup, false), new C5696m(C5693l0.this));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo13363a(List<C8363x> list) {
            this.f14490a = (List) C12279e.m32623b((Iterable<? extends T>) list).mo36501i(new C5723n(this)).mo36511n().mo36540a();
            notifyDataSetChanged();
        }

        /* renamed from: a */
        public /* synthetic */ C5719l mo13361a(C8363x xVar) throws Exception {
            return new C5719l(xVar, C5693l0.this.f14489T);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        if (mo23947l() instanceof C5659d0) {
            this.f14489T = ((C5659d0) mo23947l()).mo7192B();
            C8363x a = this.f14489T.mo13346a();
            if (a != null) {
                this.f14486Q.setTitle((CharSequence) a.getTitle());
                this.f14488S.mo13363a(a.getSubcategoriesList());
            }
        }
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        ScreenBar screenBar = this.f14485P;
        screenBar.setPadding(rect.left, rect.top, rect.right, screenBar.getPaddingBottom());
        RecyclerView recyclerView = this.f14487R;
        recyclerView.setPadding(rect.left, recyclerView.getPaddingTop(), rect.right, rect.bottom);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.controller_ticket_subcategory, viewGroup, false);
        this.f14485P = (ScreenBar) inflate.findViewById(R.id.screen_bar_layout);
        this.f14486Q = (ScreenBar) inflate.findViewById(R.id.screen_bar);
        int dimensionPixelOffset = mo23945j().getDimensionPixelOffset(R.dimen.spacing_200);
        this.f14488S = new C5695b();
        this.f14487R = (RecyclerView) inflate.findViewById(R.id.options);
        this.f14487R.mo5045a((C1074l) new C5917a(dimensionPixelOffset));
        this.f14487R.setAdapter(this.f14488S);
        return inflate;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m16049a(C5719l lVar) {
        C5498a.m15600a((Context) mo23920b()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        this.f14489T.mo13355b(lVar.mo13385a());
        this.f14488S.notifyDataSetChanged();
        mo23946k().mo23997a((C8819d) this);
    }
}
