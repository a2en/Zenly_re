package androidx.recyclerview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C1079p;
import androidx.recyclerview.widget.RecyclerView.C1082s;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import java.util.List;

public class FixedItemSizeLinearLayoutManager extends LinearLayoutManager {
    public FixedItemSizeLinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: b */
    private boolean m4680b(LayoutParams layoutParams) {
        if (layoutParams.mo5322b()) {
            List<Object> list = layoutParams.f4075a.mPayloads;
            if (list == null || list.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4926a(C1079p pVar, C1082s sVar, C1055c cVar, C1054b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View a = cVar.mo5023a(pVar);
        if (a == null) {
            bVar.f3950b = true;
            return;
        }
        LayoutParams layoutParams = (LayoutParams) a.getLayoutParams();
        if (cVar.f3964l == null) {
            if (this.f3938x == (cVar.f3958f == -1)) {
                mo5255b(a);
            } else {
                mo5256b(a, 0);
            }
        } else {
            if (this.f3938x == (cVar.f3958f == -1)) {
                mo5223a(a);
            } else {
                mo5224a(a, 0);
            }
        }
        mo5225a(a, 0, 0);
        bVar.f3949a = this.f3935u.mo5749b(a);
        if (this.f3933s == 1) {
            if (mo4980N()) {
                i5 = mo5309t() - mo5306q();
                i4 = i5 - this.f3935u.mo5751c(a);
            } else {
                i4 = mo5305p();
                i5 = this.f3935u.mo5751c(a) + i4;
            }
            if (cVar.f3958f == -1) {
                int i6 = cVar.f3954b;
                i = i6;
                i2 = i5;
                i3 = i6 - bVar.f3949a;
            } else {
                int i7 = cVar.f3954b;
                i3 = i7;
                i2 = i5;
                i = bVar.f3949a + i7;
            }
        } else {
            int s = mo5308s();
            int c = this.f3935u.mo5751c(a) + s;
            if (cVar.f3958f == -1) {
                int i8 = cVar.f3954b;
                i2 = i8;
                i3 = s;
                i = c;
                i4 = i8 - bVar.f3949a;
            } else {
                int i9 = cVar.f3954b;
                i3 = s;
                i2 = bVar.f3949a + i9;
                i = c;
                i4 = i9;
            }
        }
        mo5257b(a, i4, i3, i2, i);
        if (layoutParams.mo5323c() || m4680b(layoutParams)) {
            bVar.f3951c = true;
        }
        bVar.f3952d = a.hasFocusable();
    }
}
