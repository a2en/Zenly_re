package app.zenly.locator.experimental.firstexperience;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.C1079p;
import androidx.recyclerview.widget.RecyclerView.C1082s;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

public final class PagerLayoutManager extends LinearLayoutManager {

    /* renamed from: I */
    private final int f9818I;

    public PagerLayoutManager(Context context, int i) {
        C12932j.m33818b(context, "context");
        super(context, 0, false);
        this.f9818I = i;
    }

    /* renamed from: e */
    public void mo4952e(C1079p pVar, C1082s sVar) {
        C12932j.m33818b(pVar, "recycler");
        super.mo4952e(pVar, sVar);
        int e = mo5278e();
        int i = 0;
        while (i < e) {
            View c = mo5265c(i);
            if (c != null) {
                C12932j.m33815a((Object) c, "getChildAt(childIndex)!!");
                int l = mo5298l(c);
                LayoutParams layoutParams = c.getLayoutParams();
                if (layoutParams != null) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    if (l == 0) {
                        marginLayoutParams.setMarginStart(this.f9818I);
                        marginLayoutParams.setMarginEnd(this.f9818I / 4);
                    } else if (l == mo5293j() - 1) {
                        marginLayoutParams.setMarginStart(this.f9818I / 4);
                        marginLayoutParams.setMarginEnd(this.f9818I);
                    } else {
                        marginLayoutParams.setMarginStart(this.f9818I / 4);
                        marginLayoutParams.setMarginEnd(this.f9818I / 4);
                    }
                    marginLayoutParams.width = mo5309t() - (this.f9818I * 2);
                    c.setLayoutParams(marginLayoutParams);
                    i++;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            } else {
                C12932j.m33814a();
                throw null;
            }
        }
    }
}
