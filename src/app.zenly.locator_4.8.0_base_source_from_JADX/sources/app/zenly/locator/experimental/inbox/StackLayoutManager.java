package app.zenly.locator.experimental.inbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.core.content.C0540a;
import androidx.recyclerview.widget.RecyclerView.C1079p;
import androidx.recyclerview.widget.RecyclerView.C1082s;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import app.zenly.locator.R;
import kotlin.jvm.internal.C12932j;

public final class StackLayoutManager extends LayoutManager {

    /* renamed from: s */
    private int f9851s = 3;

    /* renamed from: t */
    private float f9852t = 0.1f;

    /* renamed from: u */
    private int f9853u;

    /* renamed from: v */
    private int f9854v;

    /* renamed from: w */
    private final Context f9855w;

    public StackLayoutManager(Context context) {
        C12932j.m33818b(context, "context");
        this.f9855w = context;
    }

    /* renamed from: b */
    private final float m11048b(float f) {
        return Math.max(0.0f, Math.min(1.0f, f));
    }

    /* renamed from: a */
    public final void mo10197a(float f) {
        this.f9852t = Math.min(Math.max(0.0f, f), 1.0f);
    }

    /* renamed from: c */
    public LayoutParams mo4948c() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: e */
    public void mo4952e(C1079p pVar, C1082s sVar) {
        float f;
        float f2;
        float f3;
        int i;
        C12932j.m33818b(pVar, "recycler");
        mo5235a(pVar);
        if (mo5293j() >= 1) {
            int min = Math.min(this.f9851s, mo5293j()) - 1;
            if (min <= 0) {
                min = 0;
            }
            for (int i2 = min; i2 >= 0; i2--) {
                View d = pVar.mo5470d(i2);
                C12932j.m33815a((Object) d, "recycler.getViewForPosition(position)");
                mo5255b(d);
                mo5225a(d, 0, 0);
                float f4 = (float) 1;
                float f5 = (float) i2;
                float b = m11048b(f4 - (this.f9852t * f5));
                int t = mo5309t() - ((int) (((float) mo5290h(d)) * b));
                if (i2 < this.f9851s - 1) {
                    float c = m11049c(((float) this.f9854v) * f5);
                    f3 = m11048b(f4 - (this.f9852t * f5));
                    f2 = c;
                    f = 1.0f;
                } else {
                    float f6 = (float) (i2 - 1);
                    f2 = m11049c(((float) this.f9854v) * f6);
                    f3 = m11048b(f4 - (this.f9852t * f6));
                    f = 0.0f;
                }
                if (i2 == 0) {
                    i = C0540a.m2536a(this.f9855w, (int) R.color.gray_light);
                } else if (i2 != 1) {
                    i = C0540a.m2536a(this.f9855w, (int) R.color.gray_medium);
                } else {
                    i = C0540a.m2536a(this.f9855w, (int) R.color.gray);
                }
                d.setBackgroundTintList(ColorStateList.valueOf(i));
                d.setTranslationZ((float) (min - i2));
                int i3 = t / 2;
                int i4 = (int) f2;
                mo5226a(d, i3, this.f9853u + i4, i3 + ((int) (((float) mo5290h(d)) * b)), i4 + this.f9853u + ((int) (((float) mo5286g(d)) * f3)));
                d.setAlpha(f);
            }
        }
    }

    /* renamed from: i */
    public final void mo10198i(int i) {
        this.f9853u = i;
    }

    /* renamed from: j */
    public final void mo10199j(int i) {
        this.f9851s = Math.max(i, 1);
    }

    /* renamed from: k */
    public final void mo10200k(int i) {
        this.f9854v = i;
    }

    /* renamed from: x */
    public boolean mo5009x() {
        return true;
    }

    /* renamed from: c */
    private final float m11049c(float f) {
        return Math.max(0.0f, f);
    }
}
