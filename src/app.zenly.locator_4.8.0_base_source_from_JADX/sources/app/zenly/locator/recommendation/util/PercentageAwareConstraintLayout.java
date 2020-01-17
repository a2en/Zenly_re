package app.zenly.locator.recommendation.util;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import app.zenly.locator.recommendation.swipeable.OnItemSwipePercentageListener;
import kotlin.C12956q;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12933k;

public final class PercentageAwareConstraintLayout extends ConstraintLayout implements OnItemSwipePercentageListener {

    /* renamed from: z */
    private Function2<? super C1085v, ? super Double, C12956q> f13724z;

    /* renamed from: app.zenly.locator.recommendation.util.PercentageAwareConstraintLayout$a */
    static final class C5326a extends C12933k implements Function2<C1085v, Double, C12956q> {

        /* renamed from: f */
        public static final C5326a f13725f = new C5326a();

        C5326a() {
            super(2);
        }

        /* renamed from: a */
        public final void mo12753a(C1085v vVar, double d) {
            C12932j.m33818b(vVar, "<anonymous parameter 0>");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo12753a((C1085v) obj, ((Number) obj2).doubleValue());
            return C12956q.f33541a;
        }
    }

    public PercentageAwareConstraintLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public PercentageAwareConstraintLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PercentageAwareConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final Function2<C1085v, Double, C12956q> getOnItemSwipePercentageListener() {
        return this.f13724z;
    }

    public void onItemSwiped(C1085v vVar, double d) {
        C12932j.m33818b(vVar, "viewHolder");
        this.f13724z.invoke(vVar, Double.valueOf(d));
    }

    public final void setOnItemSwipePercentageListener(Function2<? super C1085v, ? super Double, C12956q> function2) {
        C12932j.m33818b(function2, "<set-?>");
        this.f13724z = function2;
    }

    public PercentageAwareConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        this.f13724z = C5326a.f13725f;
    }
}
