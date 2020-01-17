package app.zenly.locator.p017a0.p024p.p028g;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C0657l;
import app.zenly.android.base.widget.LinearLayout;
import app.zenly.android.feature.polenta.widget.SegmentedBar;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.p017a0.p024p.p029h.C1608d;
import app.zenly.locator.p017a0.p024p.p029h.C1610e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.C12956q;
import kotlin.TypeCastException;
import kotlin.collections.C12844m;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;
import p250f.p251a.p252a.p263b.p264a.p272j.p273g.C7717d;

/* renamed from: app.zenly.locator.a0.p.g.d */
public final class C1599d extends C7717d<C1610e> {

    /* renamed from: e */
    private LayoutInflater f5568e;

    /* renamed from: f */
    private HashMap f5569f;

    /* renamed from: app.zenly.locator.a0.p.g.d$a */
    static final class C1600a extends C12933k implements Function2<SegmentedBar, Integer, C12956q> {

        /* renamed from: f */
        final /* synthetic */ int f5570f;

        /* renamed from: g */
        final /* synthetic */ C1599d f5571g;

        C1600a(int i, C1599d dVar) {
            this.f5570f = i;
            this.f5571g = dVar;
            super(2);
        }

        /* renamed from: a */
        public final void mo7163a(SegmentedBar segmentedBar, int i) {
            C12932j.m33818b(segmentedBar, "<anonymous parameter 0>");
            this.f5571g.m6819a(this.f5570f, i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo7163a((SegmentedBar) obj, ((Number) obj2).intValue());
            return C12956q.f33541a;
        }
    }

    /* renamed from: a */
    public View mo7161a(int i) {
        if (this.f5569f == null) {
            this.f5569f = new HashMap();
        }
        View view = (View) this.f5569f.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f5569f.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo6953b(View view) {
        C12932j.m33818b(view, "itemView");
        LayoutInflater from = LayoutInflater.from(view.getContext());
        C12932j.m33815a((Object) from, "LayoutInflater.from(itemView.context)");
        this.f5568e = from;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6952a(C1610e eVar, C1610e eVar2) {
        C12932j.m33818b(eVar, "model");
        ((TextView) mo7161a(C3891l.title)).setText(eVar.mo7183h());
        LinearLayout linearLayout = (LinearLayout) mo7161a(C3891l.bars_container);
        String str = "bars_container";
        C12932j.m33815a((Object) linearLayout, str);
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            C12932j.m33815a((Object) childAt, "getChildAt(index)");
            childAt.setVisibility(8);
        }
        int i2 = 0;
        for (Object next : eVar.mo7182g()) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C1608d dVar = (C1608d) next;
                LinearLayout linearLayout2 = (LinearLayout) mo7161a(C3891l.bars_container);
                C12932j.m33815a((Object) linearLayout2, str);
                if (i2 >= linearLayout2.getChildCount()) {
                    LayoutInflater layoutInflater = this.f5568e;
                    if (layoutInflater != null) {
                        layoutInflater.inflate(R.layout.list_item_settings_segmented_bar__bar, (LinearLayout) mo7161a(C3891l.bars_container), true);
                    } else {
                        C12932j.m33820c("inflater");
                        throw null;
                    }
                }
                LinearLayout linearLayout3 = (LinearLayout) mo7161a(C3891l.bars_container);
                C12932j.m33815a((Object) linearLayout3, str);
                View a = C0657l.m3058a(linearLayout3, i2);
                if (a != null) {
                    SegmentedBar segmentedBar = (SegmentedBar) a;
                    segmentedBar.setVisibility(0);
                    segmentedBar.setOnSelectedIndexChangeListener(new C1600a(i2, this));
                    List<Number> a2 = dVar.mo7176a();
                    ArrayList arrayList = new ArrayList(C12850p.m33647a(a2, 10));
                    for (Number intValue : a2) {
                        arrayList.add(segmentedBar.getContext().getString(intValue.intValue()));
                    }
                    segmentedBar.setItems(arrayList);
                    segmentedBar.setSelectedIndex(dVar.mo7177b());
                    i2 = i3;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type app.zenly.android.feature.polenta.widget.SegmentedBar");
                }
            } else {
                C12844m.m33616c();
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m6819a(int i, int i2) {
        mo34491a().dispatch(((C1610e) mo34494c()).mo7181f().invoke(Integer.valueOf(i), Integer.valueOf(i2)));
    }
}
