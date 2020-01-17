package app.zenly.android.feature.polenta.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import androidx.appcompat.widget.AppCompatRadioButton;
import app.zenly.android.base.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.C12956q;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12932j;
import p250f.p251a.p252a.p263b.p279d.C7765a;
import p250f.p251a.p252a.p263b.p279d.C7771g;

public final class SegmentedBar extends LinearLayout {

    /* renamed from: v */
    private List<String> f5254v;

    /* renamed from: w */
    private int f5255w;

    /* renamed from: x */
    private Function2<? super SegmentedBar, ? super Integer, C12956q> f5256x;

    /* renamed from: y */
    private final OnCheckedChangeListener f5257y;

    private static final class ItemView extends AppCompatRadioButton {
        public /* synthetic */ ItemView(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
            if ((i2 & 2) != 0) {
                attributeSet = null;
            }
            if ((i2 & 4) != 0) {
                i = C7765a.segmentedBarItemStyle;
            }
            this(context, attributeSet, i);
        }

        public void toggle() {
            if (!isChecked()) {
                super.toggle();
            }
        }

        public ItemView(Context context, AttributeSet attributeSet, int i) {
            C12932j.m33818b(context, "context");
            super(context, attributeSet, i);
        }
    }

    /* renamed from: app.zenly.android.feature.polenta.widget.SegmentedBar$a */
    public static final class C1445a {
        private C1445a() {
        }

        public /* synthetic */ C1445a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.android.feature.polenta.widget.SegmentedBar$b */
    static final class C1446b implements OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ SegmentedBar f5258a;

        C1446b(SegmentedBar segmentedBar) {
            this.f5258a = segmentedBar;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                int indexOfChild = this.f5258a.indexOfChild(compoundButton);
                if (indexOfChild != this.f5258a.getSelectedIndex()) {
                    this.f5258a.setSelectedIndex(indexOfChild);
                    Function2 onSelectedIndexChangeListener = this.f5258a.getOnSelectedIndexChangeListener();
                    if (onSelectedIndexChangeListener != null) {
                        C12956q qVar = (C12956q) onSelectedIndexChangeListener.invoke(this.f5258a, Integer.valueOf(indexOfChild));
                    }
                }
            }
        }
    }

    static {
        new C1445a(null);
    }

    public SegmentedBar(Context context) {
        this(context, null, 0, 6, null);
    }

    public SegmentedBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SegmentedBar(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = C7765a.segmentedBarStyle;
        }
        this(context, attributeSet, i);
    }

    public final List<String> getItems() {
        return this.f5254v;
    }

    public final Function2<SegmentedBar, Integer, C12956q> getOnSelectedIndexChangeListener() {
        return this.f5256x;
    }

    public final int getSelectedIndex() {
        return this.f5255w;
    }

    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setItems(java.util.List<java.lang.String> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C12932j.m33818b(r12, r0)
            r11.f5254v = r12
            java.util.List<java.lang.String> r12 = r11.f5254v
            java.util.Iterator r12 = r12.iterator()
            r0 = 0
            r1 = 0
        L_0x000f:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x0069
            java.lang.Object r2 = r12.next()
            int r3 = r1 + 1
            if (r1 < 0) goto L_0x0064
            java.lang.String r2 = (java.lang.String) r2
            int r4 = r11.getChildCount()
            if (r1 < r4) goto L_0x004c
            app.zenly.android.feature.polenta.widget.SegmentedBar$ItemView r1 = new app.zenly.android.feature.polenta.widget.SegmentedBar$ItemView
            android.content.Context r6 = r11.getContext()
            java.lang.String r4 = "context"
            kotlin.jvm.internal.C12932j.m33815a(r6, r4)
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10)
            app.zenly.android.base.widget.LinearLayout$LayoutParams r4 = new app.zenly.android.base.widget.LinearLayout$LayoutParams
            r5 = -1
            r6 = 1065353216(0x3f800000, float:1.0)
            r4.<init>(r0, r5, r6)
            r1.setLayoutParams(r4)
            android.widget.CompoundButton$OnCheckedChangeListener r4 = r11.f5257y
            r1.setOnCheckedChangeListener(r4)
            r11.addView(r1)
            goto L_0x0053
        L_0x004c:
            android.view.View r1 = r11.getChildAt(r1)
            r1.setVisibility(r0)
        L_0x0053:
            if (r1 == 0) goto L_0x005c
            app.zenly.android.feature.polenta.widget.SegmentedBar$ItemView r1 = (app.zenly.android.feature.polenta.widget.SegmentedBar.ItemView) r1
            r1.setText(r2)
            r1 = r3
            goto L_0x000f
        L_0x005c:
            kotlin.TypeCastException r12 = new kotlin.TypeCastException
            java.lang.String r0 = "null cannot be cast to non-null type app.zenly.android.feature.polenta.widget.SegmentedBar.ItemView"
            r12.<init>(r0)
            throw r12
        L_0x0064:
            kotlin.collections.C12844m.m33616c()
            r12 = 0
            throw r12
        L_0x0069:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.List<java.lang.String> r0 = r11.f5254v
            int r0 = r0.size()
            int r1 = r11.getChildCount()
        L_0x0078:
            if (r0 >= r1) goto L_0x009d
            android.view.View r2 = r11.getChildAt(r0)
            java.util.List<java.lang.String> r3 = r11.f5254v
            int r3 = r3.size()
            int r3 = r0 - r3
            r4 = 3
            java.lang.String r5 = "itemView"
            if (r3 >= r4) goto L_0x0094
            kotlin.jvm.internal.C12932j.m33815a(r2, r5)
            r3 = 8
            r2.setVisibility(r3)
            goto L_0x009a
        L_0x0094:
            kotlin.jvm.internal.C12932j.m33815a(r2, r5)
            r12.add(r2)
        L_0x009a:
            int r0 = r0 + 1
            goto L_0x0078
        L_0x009d:
            java.util.Iterator r12 = r12.iterator()
        L_0x00a1:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00b1
            java.lang.Object r0 = r12.next()
            android.view.View r0 = (android.view.View) r0
            r11.removeView(r0)
            goto L_0x00a1
        L_0x00b1:
            int r12 = r11.f5255w
            java.util.List<java.lang.String> r0 = r11.f5254v
            int r0 = r0.size()
            if (r12 < r0) goto L_0x00d6
            java.util.List<java.lang.String> r12 = r11.f5254v
            int r12 = r12.size()
            int r12 = r12 + -1
            r11.setSelectedIndex(r12)
            kotlin.jvm.functions.Function2<? super app.zenly.android.feature.polenta.widget.SegmentedBar, ? super java.lang.Integer, kotlin.q> r12 = r11.f5256x
            if (r12 == 0) goto L_0x00d6
            int r0 = r11.f5255w
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r12 = r12.invoke(r11, r0)
            kotlin.q r12 = (kotlin.C12956q) r12
        L_0x00d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: app.zenly.android.feature.polenta.widget.SegmentedBar.setItems(java.util.List):void");
    }

    public final void setOnSelectedIndexChangeListener(Function2<? super SegmentedBar, ? super Integer, C12956q> function2) {
        this.f5256x = function2;
    }

    public final void setSelectedIndex(int i) {
        int i2 = this.f5255w;
        String str = "null cannot be cast to non-null type app.zenly.android.feature.polenta.widget.SegmentedBar.ItemView";
        if (i2 != -1) {
            View childAt = getChildAt(i2);
            if (childAt != null) {
                ((ItemView) childAt).setChecked(false);
            } else {
                throw new TypeCastException(str);
            }
        }
        this.f5255w = i;
        if (i != -1) {
            View childAt2 = getChildAt(i);
            if (childAt2 != null) {
                ((ItemView) childAt2).setChecked(true);
                return;
            }
            throw new TypeCastException(str);
        }
    }

    public SegmentedBar(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        this.f5254v = C12848o.m33640a();
        this.f5255w = -1;
        this.f5257y = new C1446b(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7771g.SegmentedBar, i, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(C7771g.SegmentedBar_items);
        if (textArray != null) {
            ArrayList arrayList = new ArrayList(textArray.length);
            for (CharSequence obj : textArray) {
                arrayList.add(obj.toString());
            }
            setItems(arrayList);
        }
        setSelectedIndex(obtainStyledAttributes.getInt(C7771g.SegmentedBar_selectedIndex, -1));
        obtainStyledAttributes.recycle();
    }
}
