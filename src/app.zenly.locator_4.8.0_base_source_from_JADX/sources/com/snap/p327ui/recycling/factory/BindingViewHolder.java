package com.snap.p327ui.recycling.factory;

import android.view.View;
import com.snap.p327ui.event.EventDispatcher;
import com.snap.p327ui.recycling.C11721c;
import com.snap.p327ui.recycling.SectionController;
import com.snap.p327ui.recycling.p328d.C11722a;
import java.util.Locale;

/* renamed from: com.snap.ui.recycling.factory.BindingViewHolder */
public class BindingViewHolder<T extends C11722a, D extends SectionController> extends C11730d<T> {

    /* renamed from: d */
    private final C11721c<T> f30391d;

    /* renamed from: com.snap.ui.recycling.factory.BindingViewHolder$RecyclingCenterBindingException */
    public static class RecyclingCenterBindingException extends RuntimeException {
        public RecyclingCenterBindingException(String str, Throwable th, String str2) {
            super(str, th);
        }
    }

    BindingViewHolder(View view, C11721c<T> cVar) {
        super(view);
        this.f30391d = cVar;
    }

    /* renamed from: a */
    public void mo34510a(T t, EventDispatcher eventDispatcher, SectionController sectionController) {
        try {
            this.f30391d.mo34492a(t, this.f30399a, eventDispatcher);
            super.mo34510a(t, eventDispatcher, sectionController);
        } catch (RuntimeException e) {
            throw new RecyclingCenterBindingException(String.format(Locale.US, "Failed to onBind view of type %s", new Object[]{this.f30391d.getClass().getSimpleName()}), e, t.mo34498b());
        }
    }

    /* renamed from: c */
    public boolean mo34511c() {
        return this.f30391d.mo34496e();
    }

    /* renamed from: d */
    public void mo34512d() {
        this.f30391d.mo6954f();
        super.mo34512d();
    }

    public String toString() {
        return String.format("BindingViewHolder{%s %s %s}", new Object[]{this.itemView, mo34545a(), super.toString()});
    }
}
