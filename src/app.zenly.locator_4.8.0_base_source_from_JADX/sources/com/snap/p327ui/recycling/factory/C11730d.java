package com.snap.p327ui.recycling.factory;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import com.snap.p327ui.event.EventDispatcher;
import com.snap.p327ui.recycling.SectionController;
import com.snap.p327ui.recycling.p328d.C11722a;

/* renamed from: com.snap.ui.recycling.factory.d */
public class C11730d<TModel extends C11722a> extends C1085v {

    /* renamed from: a */
    protected TModel f30399a;

    /* renamed from: b */
    protected SectionController f30400b;

    /* renamed from: c */
    private boolean f30401c;

    public C11730d(View view) {
        super(view);
    }

    /* renamed from: a */
    public void mo34510a(TModel tmodel, EventDispatcher eventDispatcher, SectionController sectionController) {
        this.itemView.setContentDescription(tmodel.mo34497a());
        this.f30399a = tmodel;
        this.f30400b = sectionController;
        SectionController sectionController2 = this.f30400b;
        if (sectionController2 != null) {
            sectionController2.onViewBound(this.itemView, this.f30399a);
        }
        this.f30401c = true;
    }

    /* renamed from: b */
    public boolean mo34546b() {
        return this.f30401c;
    }

    /* renamed from: c */
    public boolean mo34511c() {
        return false;
    }

    /* renamed from: d */
    public void mo34512d() {
        SectionController sectionController = this.f30400b;
        if (sectionController != null) {
            sectionController.onViewRecycled(this.itemView, this.f30399a);
            this.f30400b = null;
        }
        this.f30399a = null;
    }

    public String toString() {
        return String.format("ViewModelViewHolder{%s %s %s}", new Object[]{this.itemView, this.f30399a, super.toString()});
    }

    /* renamed from: a */
    public C11722a mo34545a() {
        return this.f30399a;
    }
}
