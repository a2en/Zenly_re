package app.zenly.locator.inbox.p102n;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import app.zenly.android.feature.polenta.widget.EmptyView;
import app.zenly.locator.R;
import app.zenly.locator.inbox.C3835d;
import app.zenly.locator.inbox.p103o.C3885b;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5499a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.C7709b;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.inbox.n.c */
public final class C3880c extends C7717d<C3885b> {

    /* renamed from: app.zenly.locator.inbox.n.c$a */
    static final class C3881a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C3880c f10287e;

        C3881a(C3880c cVar, View view) {
            this.f10287e = cVar;
        }

        public final void onClick(View view) {
            C5499a aVar = C5498a.f14119e;
            C12932j.m33815a((Object) view, "v");
            Context context = view.getContext();
            C12932j.m33815a((Object) context, "v.context");
            C5498a.m15602a(aVar.mo13125a(context), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            this.f10287e.mo34491a().dispatch(C3835d.f10212a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C3885b bVar, C3885b bVar2) {
        C12932j.m33818b(bVar, "model");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        EmptyView emptyView = (EmptyView) view;
        Context context = emptyView.getContext();
        C12932j.m33815a((Object) context, "itemView.context");
        emptyView.setSubtitle((CharSequence) C7709b.m18762a(context, R.string.inbox_empty_state_subtitle));
        emptyView.setOnActionClickListener(new C3881a(this, view));
    }
}
