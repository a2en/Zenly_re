package app.zenly.locator.core.p072ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;

/* renamed from: app.zenly.locator.core.ui.view.SpanningGridLayoutManager */
public class SpanningGridLayoutManager extends GridLayoutManager {
    public SpanningGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: R */
    private int m9831R() {
        return (mo5309t() - mo5307r()) - mo5303o();
    }

    /* renamed from: S */
    private int m9832S() {
        return (mo5289h() - mo5301n()) - mo5308s();
    }

    /* renamed from: b */
    private LayoutParams m9833b(LayoutParams layoutParams) {
        if (mo4978L() == 0) {
            layoutParams.width = (int) Math.round(((double) m9831R()) / Math.ceil((double) (mo5293j() / mo4928Q())));
        } else if (mo4978L() == 1) {
            layoutParams.height = (int) Math.round(((double) m9832S()) / Math.ceil((double) (mo5293j() / mo4928Q())));
        }
        return layoutParams;
    }

    /* renamed from: a */
    public LayoutParams mo4933a(Context context, AttributeSet attributeSet) {
        LayoutParams a = super.mo4933a(context, attributeSet);
        m9833b(a);
        return a;
    }

    /* renamed from: a */
    public boolean mo4994a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo4999b() {
        return false;
    }

    /* renamed from: c */
    public LayoutParams mo4948c() {
        LayoutParams c = super.mo4948c();
        m9833b(c);
        return c;
    }

    public SpanningGridLayoutManager(Context context, int i) {
        super(context, i);
    }

    /* renamed from: a */
    public LayoutParams mo4934a(ViewGroup.LayoutParams layoutParams) {
        LayoutParams a = super.mo4934a(layoutParams);
        m9833b(a);
        return a;
    }

    /* renamed from: a */
    public boolean mo4942a(LayoutParams layoutParams) {
        return super.mo4942a(layoutParams);
    }
}
