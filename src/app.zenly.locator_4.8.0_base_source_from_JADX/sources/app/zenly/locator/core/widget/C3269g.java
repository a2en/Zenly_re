package app.zenly.locator.core.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView.C1069g;
import androidx.recyclerview.widget.RecyclerView.C1071i;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import app.zenly.locator.R;
import app.zenly.locator.core.widget.SingleAdapter.Delegate;

/* renamed from: app.zenly.locator.core.widget.g */
public class C3269g extends SingleAdapter<C3272c> {

    /* renamed from: i */
    private C1069g f9120i;

    /* renamed from: j */
    private final C1071i f9121j = new C3271b();

    /* renamed from: app.zenly.locator.core.widget.g$a */
    static class C3270a implements Delegate<C3272c> {

        /* renamed from: a */
        final /* synthetic */ int f9122a;

        C3270a(int i) {
            this.f9122a = i;
        }

        /* renamed from: a */
        public void bindViewHolder(C3272c cVar) {
            cVar.f9124a.setText(this.f9122a);
        }

        public C3272c createViewHolder(ViewGroup viewGroup) {
            return new C3272c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_section, viewGroup, false));
        }
    }

    /* renamed from: app.zenly.locator.core.widget.g$b */
    class C3271b extends C1071i {
        C3271b() {
        }

        /* renamed from: a */
        public void mo5419a() {
            C3269g.this.m10377a();
        }

        /* renamed from: b */
        public void mo5423b(int i, int i2) {
            C3269g.this.m10377a();
        }

        /* renamed from: c */
        public void mo5424c(int i, int i2) {
            C3269g.this.m10377a();
        }
    }

    /* renamed from: app.zenly.locator.core.widget.g$c */
    static class C3272c extends C1085v {

        /* renamed from: a */
        final TextView f9124a;

        C3272c(View view) {
            super(view);
            this.f9124a = (TextView) view.findViewById(R.id.title);
        }
    }

    private C3269g(Delegate<C3272c> delegate, C1069g gVar) {
        super(delegate);
        if (gVar != null) {
            this.f9120i = gVar;
            gVar.registerAdapterDataObserver(this.f9121j);
        }
        m10377a();
    }

    /* renamed from: a */
    public static C3269g m10376a(int i, C1069g gVar) {
        return new C3269g(new C3270a(i), gVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10377a() {
        C1069g gVar = this.f9120i;
        mo9717a(gVar != null && gVar.getItemCount() > 0);
    }
}
