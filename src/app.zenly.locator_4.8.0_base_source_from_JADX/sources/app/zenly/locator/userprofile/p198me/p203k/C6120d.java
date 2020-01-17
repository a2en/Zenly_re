package app.zenly.locator.userprofile.p198me.p203k;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.userprofile.p198me.p204l.C6138e;
import app.zenly.locator.view.C6176a;
import app.zenly.locator.view.HorizontalStackLayoutManager;
import com.snap.p327ui.recycling.adapter.C11703a;
import com.snap.p327ui.seeking.C11751f;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.userprofile.me.k.d */
public final class C6120d extends C7717d<C6138e> {

    /* renamed from: e */
    private C11703a f15384e;

    /* renamed from: f */
    private HashMap f15385f;

    /* renamed from: app.zenly.locator.userprofile.me.k.d$a */
    static final class C6121a implements OnTouchListener {

        /* renamed from: e */
        final /* synthetic */ View f15386e;

        C6121a(int i, int i2, View view) {
            this.f15386e = view;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            View view2 = this.f15386e;
            if (view2 != null) {
                return ((ViewGroup) view2).onTouchEvent(motionEvent);
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup");
        }
    }

    /* renamed from: a */
    public View mo13950a(int i) {
        if (this.f15385f == null) {
            this.f15385f = new HashMap();
        }
        View view = (View) this.f15385f.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f15385f.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.spacing_50);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(R.dimen.spacing_250);
        view.setClipToOutline(true);
        RecyclerView recyclerView = (RecyclerView) mo13950a(C3891l.recycler_view);
        recyclerView.setOverScrollMode(2);
        recyclerView.setLayoutManager(new HorizontalStackLayoutManager(dimensionPixelSize, dimensionPixelSize2, 3, 0.25f));
        recyclerView.setOnTouchListener(new C6121a(dimensionPixelSize, dimensionPixelSize2, view));
        new C6176a().mo5787a(recyclerView);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C6138e eVar, C6138e eVar2) {
        C12932j.m33818b(eVar, "model");
        C11703a aVar = this.f15384e;
        if (aVar == null) {
            aVar = new C11703a(eVar.mo13975g(), eVar.mo13974f());
            this.f15384e = aVar;
            RecyclerView recyclerView = (RecyclerView) mo13950a(C3891l.recycler_view);
            C12932j.m33815a((Object) recyclerView, "recycler_view");
            recyclerView.setAdapter(aVar);
        }
        aVar.mo34459a(C11751f.m30863b(eVar.mo13976h()));
    }
}
