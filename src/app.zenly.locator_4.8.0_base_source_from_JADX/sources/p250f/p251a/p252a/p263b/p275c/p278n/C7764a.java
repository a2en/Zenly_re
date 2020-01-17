package p250f.p251a.p252a.p263b.p275c.p278n;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1074l;
import androidx.recyclerview.widget.RecyclerView.C1082s;
import kotlin.jvm.internal.C12932j;

/* renamed from: f.a.a.b.c.n.a */
public final class C7764a extends C1074l {

    /* renamed from: a */
    private final int f19436a;

    /* renamed from: b */
    private int f19437b;

    public C7764a(int i, int i2) {
        this.f19436a = i;
        this.f19437b = i2;
    }

    /* renamed from: a */
    public final void mo19980a(int i) {
        this.f19437b = i;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1082s sVar) {
        C12932j.m33818b(rect, "outRect");
        C12932j.m33818b(view, "view");
        C12932j.m33818b(recyclerView, "parent");
        C12932j.m33818b(sVar, "state");
        int e = recyclerView.mo5085e(view);
        int a = sVar.mo5482a();
        int i = this.f19437b;
        int i2 = a / i;
        int i3 = e % i;
        int i4 = e / i;
        int i5 = 0;
        rect.left = i3 > 0 ? this.f19436a : 0;
        rect.right = i3 < this.f19437b + -1 ? this.f19436a : 0;
        rect.top = i4 > 0 ? this.f19436a : 0;
        if (i4 <= i2 - 1) {
            i5 = this.f19436a;
        }
        rect.bottom = i5;
    }
}
