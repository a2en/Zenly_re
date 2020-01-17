package app.zenly.locator.support;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1069g;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import app.zenly.locator.support.C5724n0.C5733d;
import app.zenly.locator.support.model.C5718k;
import app.zenly.locator.support.p168di.C5665b;
import com.bluelinelabs.conductor.C8819d;
import com.bluelinelabs.conductor.C8831g;
import com.bluelinelabs.conductor.C8836h;
import com.bluelinelabs.conductor.ControllerChangeHandler;
import com.bluelinelabs.conductor.changehandler.C8816c;
import java.util.List;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;
import zendesk.commonui.UiConfig;
import zendesk.support.request.RequestActivity;
import zendesk.support.request.RequestUiConfig.Builder;

/* renamed from: app.zenly.locator.support.d0 */
public final class C5659d0 extends ZenlyController {

    /* renamed from: P */
    private ProgressBar f14421P;

    /* renamed from: Q */
    private View f14422Q;

    /* renamed from: R */
    private RecyclerView f14423R;

    /* renamed from: S */
    private final C5662c f14424S = new C5662c();
    /* access modifiers changed from: private */

    /* renamed from: T */
    public List<C5718k> f14425T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public C5669f0 f14426U;

    /* renamed from: V */
    private C5688j0 f14427V = new C5688j0();

    /* renamed from: app.zenly.locator.support.d0$b */
    private final class C5661b extends C1085v {

        /* renamed from: a */
        final TextView f14428a;

        /* renamed from: b */
        final TextView f14429b;

        /* renamed from: c */
        final TextView f14430c;

        /* renamed from: d */
        final ImageView f14431d;

        C5661b(C5659d0 d0Var, View view) {
            super(view);
            this.f14428a = (TextView) view.findViewById(R.id.description);
            this.f14429b = (TextView) view.findViewById(R.id.subject);
            this.f14430c = (TextView) view.findViewById(R.id.status);
            this.f14431d = (ImageView) view.findViewById(R.id.unread_icon);
        }
    }

    /* renamed from: app.zenly.locator.support.d0$c */
    private final class C5662c extends C1069g<C5661b> {
        private C5662c() {
        }

        /* renamed from: a */
        public void onBindViewHolder(C5661b bVar, int i) {
            C5718k kVar = (C5718k) C5659d0.this.f14425T.get(i);
            int a = C5724n0.m16092a(kVar.f14520e.getStatus());
            C5733d a2 = C5733d.m16152a(kVar.f14520e.getSubject());
            bVar.f14428a.setText(kVar.f14520e.getDescription());
            bVar.f14428a.setSelected(kVar.f14521f);
            bVar.f14429b.setText(a2 == null ? kVar.f14520e.getSubject() : C5659d0.this.mo23945j().getString(a2.mo13427c()));
            if (kVar.f14521f) {
                bVar.f14431d.setVisibility(0);
            } else {
                bVar.f14431d.setVisibility(8);
            }
            if (C7674a.m18692a(a)) {
                bVar.f14430c.setVisibility(0);
                bVar.f14430c.setText(a);
            } else {
                bVar.f14430c.setVisibility(8);
            }
            bVar.itemView.setOnClickListener(new C5650c(this, kVar));
        }

        public int getItemCount() {
            return C5659d0.this.f14425T.size();
        }

        public C5661b onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C5661b(C5659d0.this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_ticket, viewGroup, false));
        }

        /* renamed from: a */
        public /* synthetic */ void mo13328a(C5718k kVar, View view) {
            C5498a.m15600a((Context) C5659d0.this.mo23920b()).mo13123a(C5501c.LIGHT, C5500b.NAV);
            C5659d0.this.f14426U.mo13331a(kVar);
        }
    }

    /* renamed from: C */
    private void m15971C() {
        C5697m0 m0Var = new C5697m0();
        m0Var.mo23929b((C8819d) this);
        C8831g k = mo23946k();
        C8836h a = C8836h.m21058a((C8819d) m0Var);
        a.mo24026b(new C8816c());
        a.mo24023a((ControllerChangeHandler) new C8816c());
        k.mo23991a(a);
    }

    /* renamed from: B */
    public C5688j0 mo7192B() {
        return this.f14427V;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo7053d(View view) {
        this.f14426U.mo13332b();
        super.mo7053d(view);
    }

    /* renamed from: e */
    public /* synthetic */ void mo7061e(View view) {
        C5498a.m15600a((Context) mo23920b()).mo13123a(C5501c.LIGHT, C5500b.NAV);
        m15971C();
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7065a(Context context) {
        this.f14426U = new C5669f0(this, C5665b.m15987a(context).mo13329a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo7052b(View view) {
        super.mo7052b(view);
        this.f14426U.mo13330a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.controller_support, viewGroup, false);
        inflate.findViewById(R.id.support_create_ticket).setOnClickListener(new C5658d(this));
        this.f14423R = (RecyclerView) inflate.findViewById(R.id.support_tickets);
        this.f14423R.setItemAnimator(null);
        this.f14423R.setLayoutAnimation(null);
        this.f14423R.setAdapter(this.f14424S);
        this.f14421P = (ProgressBar) inflate.findViewById(R.id.support_tickets_progress);
        this.f14422Q = inflate.findViewById(R.id.support_tickets_empty);
        mo13326e(true);
        return inflate;
    }

    /* renamed from: d */
    public void mo13325d(String str) {
        Builder builder = RequestActivity.builder();
        builder.withRequestId(str);
        builder.withRequestSubject(mo23945j().getString(R.string.support_ticket_title));
        builder.show((Context) mo23920b(), new UiConfig[0]);
    }

    /* renamed from: e */
    public void mo13326e(boolean z) {
        if (z) {
            this.f14421P.setVisibility(0);
            this.f14422Q.setVisibility(8);
            this.f14423R.setVisibility(8);
        } else if (this.f14425T.isEmpty()) {
            this.f14421P.setVisibility(8);
            this.f14422Q.setVisibility(0);
            this.f14423R.setVisibility(8);
        } else {
            this.f14421P.setVisibility(8);
            this.f14422Q.setVisibility(8);
            this.f14423R.setVisibility(0);
        }
    }

    /* renamed from: a */
    public void mo13324a(List<C5718k> list) {
        this.f14425T = list;
        this.f14424S.notifyDataSetChanged();
    }
}
