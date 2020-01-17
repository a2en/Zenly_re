package app.zenly.locator.experimental.inbox.p094k;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.experimental.inbox.C3679a;
import app.zenly.locator.experimental.inbox.StackLayoutManager;
import app.zenly.locator.experimental.inbox.p095l.C3721b;
import app.zenly.locator.view.C6176a;
import com.snap.p327ui.recycling.adapter.C11703a;
import com.snap.p327ui.seeking.C11751f;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.experimental.inbox.k.c */
public final class C3717c extends C7717d<C3721b> {

    /* renamed from: e */
    private C11703a f9965e;

    /* renamed from: f */
    private HashMap f9966f;

    /* renamed from: app.zenly.locator.experimental.inbox.k.c$a */
    public static final class C3718a {
        private C3718a() {
        }

        public /* synthetic */ C3718a(C12928f fVar) {
            this();
        }
    }

    static {
        new C3718a(null);
    }

    /* renamed from: a */
    public View mo10247a(int i) {
        if (this.f9966f == null) {
            this.f9966f = new HashMap();
        }
        View view = (View) this.f9966f.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f9966f.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        RecyclerView recyclerView = (RecyclerView) mo10247a(C3891l.recycler_view);
        recyclerView.setOverScrollMode(2);
        Context context = view.getContext();
        C12932j.m33815a((Object) context, "itemView.context");
        StackLayoutManager stackLayoutManager = new StackLayoutManager(context);
        stackLayoutManager.mo10199j(4);
        stackLayoutManager.mo10200k(recyclerView.getResources().getDimensionPixelSize(R.dimen.spacing_100));
        stackLayoutManager.mo10197a(0.02f);
        stackLayoutManager.mo10198i(recyclerView.getResources().getDimensionPixelSize(R.dimen.spacing_100));
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(stackLayoutManager);
        recyclerView.setItemAnimator(new C3679a());
        new C6176a().mo5787a(recyclerView);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C3721b bVar, C3721b bVar2) {
        C12932j.m33818b(bVar, "model");
        C11703a aVar = this.f9965e;
        if (aVar == null) {
            aVar = new C11703a(bVar.mo10254g(), bVar.mo10253f());
            this.f9965e = aVar;
            RecyclerView recyclerView = (RecyclerView) mo10247a(C3891l.recycler_view);
            C12932j.m33815a((Object) recyclerView, "recycler_view");
            recyclerView.setAdapter(aVar);
        }
        aVar.mo34459a(C11751f.m30863b(bVar.mo10255h()));
    }
}
