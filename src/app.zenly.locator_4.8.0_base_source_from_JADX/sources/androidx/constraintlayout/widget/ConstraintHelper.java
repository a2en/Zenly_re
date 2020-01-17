package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.constraintlayout.solver.widgets.C0444f;
import androidx.constraintlayout.solver.widgets.C0447g;
import androidx.constraintlayout.solver.widgets.C0453k;
import androidx.constraintlayout.solver.widgets.Helper;
import androidx.constraintlayout.widget.C0473c.C0474a;
import androidx.constraintlayout.widget.C0473c.C0475b;
import java.util.Arrays;
import java.util.HashMap;

public abstract class ConstraintHelper extends View {

    /* renamed from: e */
    protected int[] f2071e = new int[32];

    /* renamed from: f */
    protected int f2072f;

    /* renamed from: g */
    protected Context f2073g;

    /* renamed from: h */
    protected Helper f2074h;

    /* renamed from: i */
    protected boolean f2075i = false;

    /* renamed from: j */
    private String f2076j;

    /* renamed from: k */
    private View[] f2077k = null;

    /* renamed from: l */
    private HashMap<Integer, String> f2078l = new HashMap<>();

    public ConstraintHelper(Context context) {
        super(context);
        this.f2073g = context;
        mo2244a((AttributeSet) null);
    }

    private void setIds(String str) {
        if (str != null) {
            int i = 0;
            this.f2072f = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    m2155a(str.substring(i));
                    return;
                } else {
                    m2155a(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo2244a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0481f.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0481f.ConstraintLayout_Layout_constraint_referenced_ids) {
                    this.f2076j = obtainStyledAttributes.getString(index);
                    setIds(this.f2076j);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2682a(C0444f fVar, boolean z) {
    }

    /* renamed from: b */
    public void mo2694b(ConstraintLayout constraintLayout) {
    }

    /* renamed from: c */
    public void mo2695c(ConstraintLayout constraintLayout) {
    }

    /* renamed from: d */
    public void mo2696d(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f2076j);
        }
        Helper helper = this.f2074h;
        if (helper != null) {
            helper.removeAllIds();
            for (int i = 0; i < this.f2072f; i++) {
                int i2 = this.f2071e[i];
                View a = constraintLayout.mo2701a(i2);
                if (a == null) {
                    int childCount = constraintLayout.getChildCount();
                    String str = (String) this.f2078l.get(Integer.valueOf(i2));
                    int i3 = 0;
                    while (true) {
                        if (i3 >= childCount) {
                            break;
                        }
                        View childAt = constraintLayout.getChildAt(i3);
                        if (childAt.getId() != -1) {
                            String str2 = null;
                            try {
                                str2 = getResources().getResourceEntryName(childAt.getId());
                            } catch (NotFoundException unused) {
                            }
                            if (str != null && str.equals(str2)) {
                                this.f2071e[i] = childAt.getId();
                                this.f2078l.put(Integer.valueOf(childAt.getId()), str);
                                a = childAt;
                                break;
                            }
                        }
                        i3++;
                    }
                }
                if (a != null) {
                    this.f2074h.add(constraintLayout.mo2702a(a));
                }
            }
            this.f2074h.updateConstraints(constraintLayout.f2082h);
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2071e, this.f2072f);
    }

    public void onDraw(Canvas canvas) {
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f2075i) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f2072f = 0;
        for (int a : iArr) {
            m2154a(a);
        }
    }

    /* renamed from: a */
    private void m2154a(int i) {
        int i2 = this.f2072f + 1;
        int[] iArr = this.f2071e;
        if (i2 > iArr.length) {
            this.f2071e = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2071e;
        int i3 = this.f2072f;
        iArr2[i3] = i;
        this.f2072f = i3 + 1;
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2073g = context;
        mo2244a(attributeSet);
    }

    /* renamed from: a */
    public void mo2691a() {
        if (this.f2074h != null) {
            LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.LayoutParams) {
                ((ConstraintLayout.LayoutParams) layoutParams).f2151m0 = (C0444f) this.f2074h;
            }
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2073g = context;
        mo2244a(attributeSet);
    }

    /* renamed from: a */
    private void m2155a(String str) {
        int i;
        if (str != null && str.length() != 0 && this.f2073g != null) {
            String trim = str.trim();
            try {
                i = C0480e.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout)) {
                Object a = ((ConstraintLayout) getParent()).mo2703a(0, (Object) trim);
                if (a != null && (a instanceof Integer)) {
                    i = ((Integer) a).intValue();
                }
            }
            if (i == 0) {
                i = this.f2073g.getResources().getIdentifier(trim, "id", this.f2073g.getPackageName());
            }
            if (i != 0) {
                this.f2078l.put(Integer.valueOf(i), trim);
                m2154a(i);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Could not find id of \"");
                sb.append(trim);
                sb.append("\"");
                Log.w("ConstraintHelper", sb.toString());
            }
        }
    }

    /* renamed from: a */
    public void mo2692a(C0447g gVar, Helper helper, SparseArray<C0444f> sparseArray) {
        helper.removeAllIds();
        for (int i = 0; i < this.f2072f; i++) {
            helper.add((C0444f) sparseArray.get(this.f2071e[i]));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View[] mo2693a(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f2077k;
        if (viewArr == null || viewArr.length != this.f2072f) {
            this.f2077k = new View[this.f2072f];
        }
        for (int i = 0; i < this.f2072f; i++) {
            this.f2077k[i] = constraintLayout.mo2701a(this.f2071e[i]);
        }
        return this.f2077k;
    }

    /* renamed from: a */
    public void mo2683a(C0474a aVar, C0453k kVar, ConstraintLayout.LayoutParams layoutParams, SparseArray<C0444f> sparseArray) {
        C0475b bVar = aVar.f2228d;
        int[] iArr = bVar.f2267e0;
        if (iArr != null) {
            setReferencedIds(iArr);
            return;
        }
        String str = bVar.f2269f0;
        if (str != null && str.length() > 0) {
            C0475b bVar2 = aVar.f2228d;
            bVar2.f2267e0 = m2156a((View) this, bVar2.f2269f0);
            kVar.removeAllIds();
            int i = 0;
            while (true) {
                int[] iArr2 = aVar.f2228d.f2267e0;
                if (i < iArr2.length) {
                    C0444f fVar = (C0444f) sparseArray.get(iArr2[i]);
                    if (fVar != null) {
                        kVar.add(fVar);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private int[] m2156a(View view, String str) {
        int i;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = C0480e.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout)) {
                Object a = ((ConstraintLayout) view.getParent()).mo2703a(0, (Object) trim);
                if (a != null && (a instanceof Integer)) {
                    i = ((Integer) a).intValue();
                }
            }
            int i4 = i3 + 1;
            iArr[i3] = i;
            i2++;
            i3 = i4;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }
}
