package app.zenly.locator.block;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import app.zenly.android.feature.polenta.widget.EmptyView;
import app.zenly.locator.R;
import app.zenly.locator.core.helper.C2509b;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import app.zenly.locator.core.util.C3197d;
import app.zenly.locator.p143s.p155r.C5498a;
import app.zenly.locator.p143s.p155r.C5498a.C5499a;
import app.zenly.locator.p143s.p155r.C5498a.C5500b;
import app.zenly.locator.p143s.p155r.C5498a.C5501c;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.block.c */
public final class C1714c extends ZenlyController {

    /* renamed from: Q */
    public static final C1715a f5767Q = new C1715a(null);

    /* renamed from: P */
    private final String f5768P;

    /* renamed from: app.zenly.locator.block.c$a */
    public static final class C1715a {
        private C1715a() {
        }

        /* renamed from: a */
        public final C1714c mo7321a(String str) {
            C12932j.m33818b(str, "username");
            C3197d dVar = new C3197d(new Bundle());
            dVar.mo9610a("args:username", str);
            Bundle a = dVar.mo9605a();
            C12932j.m33815a((Object) a, "BundleBuilder(Bundle())\n…ame)\n            .build()");
            return new C1714c(a);
        }

        public /* synthetic */ C1715a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.block.c$b */
    public static final class C1716b extends C2509b {

        /* renamed from: g */
        final /* synthetic */ C1714c f5769g;

        C1716b(C1714c cVar) {
            this.f5769g = cVar;
        }

        /* renamed from: a */
        public void mo7322a(View view) {
            C12932j.m33818b(view, "v");
            C5499a aVar = C5498a.f14119e;
            Context context = view.getContext();
            C12932j.m33815a((Object) context, "v.context");
            C5498a.m15602a(aVar.mo13125a(context), C5501c.LIGHT, C5500b.NAV, 0, 4, null);
            this.f5769g.m7060B();
        }
    }

    public C1714c(Bundle bundle) {
        C12932j.m33818b(bundle, "args");
        super(bundle);
        String string = bundle.getString("args:username");
        if (string != null) {
            this.f5768P = string;
        } else {
            C12932j.m33814a();
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final void m7060B() {
        Activity b = mo23920b();
        if (b != null) {
            ((BlockUserActivity) b).mo7318f();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.block.BlockUserActivity");
    }

    public boolean handleBack() {
        m7060B();
        return true;
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        C12932j.m33818b(view, "view");
        C12932j.m33818b(rect, "insets");
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C12932j.m33818b(layoutInflater, "inflater");
        C12932j.m33818b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.controller_block_user_completed, viewGroup, false);
        EmptyView emptyView = (EmptyView) inflate.findViewById(R.id.empty_view);
        C12932j.m33815a((Object) emptyView, "content");
        String string = emptyView.getContext().getString(R.string.block_user_complete_title, new Object[]{this.f5768P});
        C12932j.m33815a((Object) string, "content.context.getStrin…complete_title, username)");
        emptyView.setTitle((CharSequence) string);
        emptyView.setOnActionClickListener(new C1716b(this));
        C12932j.m33815a((Object) inflate, "root");
        return inflate;
    }
}
