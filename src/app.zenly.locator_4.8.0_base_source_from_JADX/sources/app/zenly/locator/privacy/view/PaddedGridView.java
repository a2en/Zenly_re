package app.zenly.locator.privacy.view;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import app.zenly.locator.R;

public class PaddedGridView extends AdapterView<BaseAdapter> {

    /* renamed from: e */
    private final int f13232e;

    /* renamed from: f */
    private final int f13233f;

    /* renamed from: g */
    private final int f13234g;

    /* renamed from: h */
    private int f13235h;

    /* renamed from: i */
    private int f13236i;

    /* renamed from: j */
    private int f13237j;

    /* renamed from: k */
    private boolean f13238k;

    /* renamed from: l */
    private DisplayMetrics f13239l;

    /* renamed from: m */
    private BaseAdapter f13240m;

    /* renamed from: n */
    private DataSetObserver f13241n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final SparseBooleanArray f13242o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public SelectionListener f13243p;

    /* renamed from: q */
    private OnClickListener f13244q;

    public interface SelectionListener {
        void onItemCheckedStateChanged(PaddedGridView paddedGridView, int i, boolean z);
    }

    /* renamed from: app.zenly.locator.privacy.view.PaddedGridView$a */
    class C5106a extends DataSetObserver {
        C5106a() {
        }

        public void onChanged() {
            PaddedGridView.this.requestLayout();
        }

        public void onInvalidated() {
            PaddedGridView.this.requestLayout();
        }
    }

    /* renamed from: app.zenly.locator.privacy.view.PaddedGridView$b */
    class C5107b implements OnClickListener {
        C5107b() {
        }

        public void onClick(View view) {
            int indexOfChild = PaddedGridView.this.indexOfChild(view);
            boolean z = !view.isSelected();
            PaddedGridView.this.m14552a(view, z);
            PaddedGridView.this.f13242o.put(indexOfChild, z);
            if (PaddedGridView.this.f13243p != null) {
                PaddedGridView.this.f13243p.onItemCheckedStateChanged(PaddedGridView.this, indexOfChild, z);
            }
        }
    }

    public PaddedGridView(Context context) {
        this(context, null);
    }

    /* renamed from: d */
    private void m14555d() {
        View view;
        if (this.f13240m != null) {
            for (int i = 0; i < this.f13240m.getCount(); i++) {
                if (i < getChildCount()) {
                    view = this.f13240m.getView(i, getChildAt(i), this);
                } else {
                    view = this.f13240m.getView(i, null, null);
                    LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = new LayoutParams(-2, -2);
                        view.setLayoutParams(layoutParams);
                    }
                    view.measure(MeasureSpec.makeMeasureSpec(this.f13237j, 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
                    addViewInLayout(view, -1, layoutParams, true);
                }
                view.forceLayout();
                if (i < this.f13240m.getCount()) {
                    view.setOnClickListener(this.f13244q);
                } else {
                    view.setOnClickListener(null);
                }
            }
            if (getChildCount() > this.f13240m.getCount()) {
                for (int count = this.f13240m.getCount(); count < getChildCount(); count++) {
                    this.f13242o.delete(count);
                }
                removeViewsInLayout(this.f13240m.getCount(), getChildCount() - this.f13240m.getCount());
            }
        }
    }

    /* renamed from: e */
    private void m14556e() {
        for (int i = 0; i < getChildCount(); i++) {
            int i2 = this.f13235h;
            int i3 = i % i2;
            int i4 = i / i2;
            int i5 = this.f13237j;
            int i6 = this.f13232e;
            int i7 = (i5 + i6) * i3;
            int i8 = i5 + i7;
            int i9 = this.f13233f;
            int i10 = (i6 + i9) * i4;
            getChildAt(i).layout(i7, i10, i8, i9 + i10);
        }
    }

    /* renamed from: c */
    public void mo12397c() {
        for (int i = 0; i < getChildCount(); i++) {
            if (i < this.f13240m.getCount()) {
                m14551a(i, false);
            } else {
                m14552a(getChildAt(i), false);
            }
        }
    }

    public View getSelectedView() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f13238k = true;
        try {
            super.onLayout(z, i, i2, i3, i4);
            m14555d();
            m14556e();
            invalidate();
        } finally {
            this.f13238k = false;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        this.f13235h = Math.max(1, m14549a(measuredWidth));
        this.f13236i = 0;
        BaseAdapter baseAdapter = this.f13240m;
        if (baseAdapter != null) {
            this.f13236i = (int) Math.ceil((double) (((float) baseAdapter.getCount()) / ((float) this.f13235h)));
        }
        this.f13237j = (measuredWidth - (this.f13232e * Math.max(0, this.f13235h - 1))) / this.f13235h;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            getChildAt(i3).measure(MeasureSpec.makeMeasureSpec(this.f13237j, 1073741824), MeasureSpec.makeMeasureSpec(0, 0));
        }
        int i4 = this.f13237j;
        int i5 = this.f13235h;
        int max = (i4 * i5) + (this.f13232e * Math.max(0, i5 - 1));
        int i6 = this.f13233f;
        int i7 = this.f13236i;
        setMeasuredDimension(max, (i6 * i7) + (this.f13232e * Math.max(0, i7 - 1)));
    }

    public void requestLayout() {
        if (!this.f13238k) {
            super.requestLayout();
        }
    }

    public void setSelection(int i) {
    }

    public void setSelectionListener(SelectionListener selectionListener) {
        this.f13243p = selectionListener;
    }

    public PaddedGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    public void mo12396b() {
        for (int i = 0; i < getChildCount(); i++) {
            if (i < this.f13240m.getCount()) {
                m14551a(i, true);
            } else {
                m14552a(getChildAt(i), true);
            }
        }
    }

    public BaseAdapter getAdapter() {
        return this.f13240m;
    }

    public void setAdapter(BaseAdapter baseAdapter) {
        BaseAdapter baseAdapter2 = this.f13240m;
        if (baseAdapter2 != null) {
            baseAdapter2.unregisterDataSetObserver(this.f13241n);
        }
        this.f13240m = baseAdapter;
        BaseAdapter baseAdapter3 = this.f13240m;
        if (baseAdapter3 != null) {
            baseAdapter3.registerDataSetObserver(this.f13241n);
        }
        requestLayout();
    }

    public PaddedGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13238k = false;
        this.f13239l = null;
        this.f13241n = new C5106a();
        this.f13242o = new SparseBooleanArray();
        this.f13244q = new C5107b();
        this.f13233f = mo12394a(80.0f);
        this.f13234g = mo12394a(80.0f);
        this.f13232e = mo12394a(6.0f);
    }

    /* renamed from: a */
    public boolean mo12395a() {
        for (int i = 0; i < this.f13240m.getCount(); i++) {
            if (!this.f13242o.get(i, false)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    private int m14549a(int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 <= i) {
            i3++;
            int i4 = this.f13234g;
            if (i3 != 0) {
                i4 += this.f13232e;
            }
            i2 += i4;
        }
        return i3 - 1;
    }

    /* renamed from: a */
    private void m14551a(int i, boolean z) {
        if (this.f13242o.get(i) != z) {
            m14552a(getChildAt(i), z);
            this.f13242o.put(i, z);
            SelectionListener selectionListener = this.f13243p;
            if (selectionListener != null) {
                selectionListener.onItemCheckedStateChanged(this, i, z);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m14552a(View view, boolean z) {
        view.setSelected(z);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.check_box);
        if (checkBox != null) {
            checkBox.setChecked(z);
        }
    }

    /* renamed from: a */
    public int mo12394a(float f) {
        if (this.f13239l == null) {
            this.f13239l = getContext().getResources().getDisplayMetrics();
        }
        return (int) TypedValue.applyDimension(1, f, this.f13239l);
    }
}
