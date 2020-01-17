package androidx.appcompat.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import androidx.appcompat.view.menu.MenuBuilder.ItemInvoker;
import androidx.appcompat.widget.C0291z;

public final class ExpandedMenuView extends ListView implements ItemInvoker, MenuView, OnItemClickListener {

    /* renamed from: g */
    private static final int[] f524g = {16842964, 16843049};

    /* renamed from: e */
    private MenuBuilder f525e;

    /* renamed from: f */
    private int f526f;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public int getWindowAnimations() {
        return this.f526f;
    }

    public void initialize(MenuBuilder menuBuilder) {
        this.f525e = menuBuilder;
    }

    public boolean invokeItem(C0169i iVar) {
        return this.f525e.mo723a((MenuItem) iVar, 0);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        invokeItem((C0169i) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0291z a = C0291z.m1196a(context, attributeSet, f524g, i, 0);
        if (a.mo2116g(0)) {
            setBackgroundDrawable(a.mo2106b(0));
        }
        if (a.mo2116g(1)) {
            setDivider(a.mo2106b(1));
        }
        a.mo2102a();
    }
}
