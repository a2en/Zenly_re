package app.zenly.locator.support.p194u0;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1074l;
import androidx.recyclerview.widget.RecyclerView.C1082s;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.support.u0.a */
public final class C5917a extends C1074l {

    /* renamed from: a */
    private final int f14925a;

    public C5917a(int i) {
        this.f14925a = i;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1082s sVar) {
        C12932j.m33818b(rect, "outRect");
        C12932j.m33818b(view, "view");
        C12932j.m33818b(recyclerView, "parent");
        C12932j.m33818b(sVar, "state");
        int i = this.f14925a;
        rect.left = i;
        rect.right = i;
        rect.bottom = i;
        if (recyclerView.mo5085e(view) == 0) {
            rect.top = this.f14925a;
        }
    }
}
