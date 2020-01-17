package app.zenly.locator.core.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.C1069g;
import androidx.recyclerview.widget.RecyclerView.C1071i;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import app.zenly.locator.R;

public class ShowMoreAdapter extends SingleAdapter<C3260b> {

    /* renamed from: i */
    private final ShowMoreCallbacks f9100i;

    /* renamed from: j */
    private boolean f9101j;

    public interface ShowMoreCallbacks {
        boolean canShowMore();

        void onShowMoreClick();
    }

    /* renamed from: app.zenly.locator.core.widget.ShowMoreAdapter$a */
    class C3259a extends C1071i {
        C3259a() {
        }

        /* renamed from: a */
        public void mo5419a() {
            ShowMoreAdapter.this.m10363a();
        }

        /* renamed from: b */
        public void mo5423b(int i, int i2) {
            ShowMoreAdapter.this.m10363a();
        }

        /* renamed from: c */
        public void mo5424c(int i, int i2) {
            ShowMoreAdapter.this.m10363a();
        }
    }

    /* renamed from: app.zenly.locator.core.widget.ShowMoreAdapter$b */
    static class C3260b extends C1085v {
        public C3260b(View view) {
            super(view);
        }
    }

    private ShowMoreAdapter(C1069g gVar, ShowMoreCallbacks showMoreCallbacks) {
        super(new C3267e(showMoreCallbacks), null);
        this.f9100i = showMoreCallbacks;
        gVar.registerAdapterDataObserver(new C3259a());
        m10363a();
    }

    public int getItemCount() {
        return this.f9101j ? 1 : 0;
    }

    /* renamed from: a */
    public static ShowMoreAdapter m10362a(C1069g gVar) {
        if (gVar instanceof ShowMoreCallbacks) {
            return new ShowMoreAdapter(gVar, (ShowMoreCallbacks) gVar);
        }
        throw new RuntimeException("adapter must implement ShowMoreCallbacks");
    }

    /* renamed from: a */
    static /* synthetic */ C3260b m10361a(ShowMoreCallbacks showMoreCallbacks, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item_show_more, viewGroup, false);
        inflate.setOnClickListener(new C3268f(showMoreCallbacks));
        return new C3260b(inflate);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m10363a() {
        boolean canShowMore = this.f9100i.canShowMore();
        if (this.f9101j != canShowMore) {
            this.f9101j = canShowMore;
            notifyDataSetChanged();
        }
    }
}
