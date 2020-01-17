package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.solver.widgets.C0436b;
import androidx.constraintlayout.solver.widgets.C0444f;
import androidx.constraintlayout.solver.widgets.C0447g;
import androidx.constraintlayout.solver.widgets.C0453k;
import androidx.constraintlayout.widget.C0473c.C0474a;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;

public class Barrier extends ConstraintHelper {

    /* renamed from: m */
    private int f2068m;

    /* renamed from: n */
    private int f2069n;

    /* renamed from: o */
    private C0436b f2070o;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    /* renamed from: a */
    private void m2149a(C0444f fVar, int i, boolean z) {
        this.f2069n = i;
        if (VERSION.SDK_INT < 17) {
            int i2 = this.f2068m;
            if (i2 == 5) {
                this.f2069n = 0;
            } else if (i2 == 6) {
                this.f2069n = 1;
            }
        } else if (z) {
            int i3 = this.f2068m;
            if (i3 == 5) {
                this.f2069n = 1;
            } else if (i3 == 6) {
                this.f2069n = 0;
            }
        } else {
            int i4 = this.f2068m;
            if (i4 == 5) {
                this.f2069n = 0;
            } else if (i4 == 6) {
                this.f2069n = 1;
            }
        }
        if (fVar instanceof C0436b) {
            ((C0436b) fVar).mo2504z(this.f2069n);
        }
    }

    /* renamed from: b */
    public boolean mo2684b() {
        return this.f2070o.mo2496Q();
    }

    public int getMargin() {
        return this.f2070o.mo2498S();
    }

    public int getType() {
        return this.f2068m;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f2070o.mo2503d(z);
    }

    public void setDpMargin(int i) {
        this.f2070o.mo2493A((int) ((((float) i) * getResources().getDisplayMetrics().density) + 0.5f));
    }

    public void setMargin(int i) {
        this.f2070o.mo2493A(i);
    }

    public void setType(int i) {
        this.f2068m = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    /* renamed from: a */
    public void mo2682a(C0444f fVar, boolean z) {
        m2149a(fVar, this.f2068m, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2244a(AttributeSet attributeSet) {
        super.mo2244a(attributeSet);
        this.f2070o = new C0436b();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0481f.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0481f.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == C0481f.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f2070o.mo2503d(obtainStyledAttributes.getBoolean(index, true));
                } else if (index == C0481f.ConstraintLayout_Layout_barrierMargin) {
                    this.f2070o.mo2493A(obtainStyledAttributes.getDimensionPixelSize(index, 0));
                }
            }
        }
        this.f2074h = this.f2070o;
        mo2691a();
    }

    /* renamed from: a */
    public void mo2683a(C0474a aVar, C0453k kVar, LayoutParams layoutParams, SparseArray<C0444f> sparseArray) {
        super.mo2683a(aVar, kVar, layoutParams, sparseArray);
        if (kVar instanceof C0436b) {
            C0436b bVar = (C0436b) kVar;
            m2149a(bVar, aVar.f2228d.f2261b0, ((C0447g) kVar.mo2601q()).mo2628Z());
            bVar.mo2503d(aVar.f2228d.f2277j0);
            bVar.mo2493A(aVar.f2228d.f2263c0);
        }
    }
}
