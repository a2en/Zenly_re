package app.zenly.android.feature.descendants.p011r;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import app.zenly.android.feature.descendants.C1388m;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.android.feature.descendants.r.c */
public final class C1404c extends C1085v {

    /* renamed from: a */
    private final TextView f5058a;

    /* renamed from: b */
    private final View f5059b;

    public C1404c(View view) {
        C12932j.m33818b(view, "root");
        super(view);
        this.f5059b = view;
        View view2 = this.f5059b;
        if (view2 != null) {
            this.f5058a = (TextView) view2;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
    }

    /* renamed from: a */
    public final void mo6663a(int i) {
        this.f5058a.setText(this.f5059b.getResources().getQuantityString(C1388m.descendantsList_churnedLabel, i, new Object[]{Integer.valueOf(i)}));
    }
}
