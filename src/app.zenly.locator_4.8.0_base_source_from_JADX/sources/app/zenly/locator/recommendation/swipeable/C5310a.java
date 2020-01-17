package app.zenly.locator.recommendation.swipeable;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C1085v;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import app.zenly.locator.recommendation.swipeable.touchhelper.ItemTouchHelper.C5319g;
import com.appsflyer.share.Constants;
import kotlin.C12956q;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.recommendation.swipeable.a */
public class C5310a extends C5319g {

    /* renamed from: e */
    private final OnItemSwiped f13654e;

    /* renamed from: f */
    private final OnItemSwipePercentageListener f13655f;

    /* renamed from: app.zenly.locator.recommendation.swipeable.a$a */
    public static final class C5311a implements OnItemSwiped {

        /* renamed from: a */
        final /* synthetic */ Function1 f13656a;

        C5311a(Function1 function1) {
            this.f13656a = function1;
        }

        public void onItemSwiped(int i) {
            this.f13656a.invoke(Integer.valueOf(i));
        }
    }

    /* renamed from: app.zenly.locator.recommendation.swipeable.a$b */
    public static final class C5312b implements OnItemSwipePercentageListener {

        /* renamed from: e */
        final /* synthetic */ Function2 f13657e;

        C5312b(Function2 function2) {
            this.f13657e = function2;
        }

        public void onItemSwiped(C1085v vVar, double d) {
            C12932j.m33818b(vVar, "viewHolder");
            this.f13657e.invoke(vVar, Double.valueOf(d));
        }
    }

    public C5310a(OnItemSwiped onItemSwiped, OnItemSwipePercentageListener onItemSwipePercentageListener) {
        C12932j.m33818b(onItemSwiped, "onItemSwiped");
        this.f13654e = onItemSwiped;
        this.f13655f = onItemSwipePercentageListener;
    }

    /* renamed from: d */
    private final int m15021d() {
        return 15;
    }

    /* renamed from: e */
    private final int m15022e() {
        return 12;
    }

    /* renamed from: a */
    public long mo12690a(RecyclerView recyclerView, int i, float f, float f2) {
        C12932j.m33818b(recyclerView, "recyclerView");
        LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            return ((SwipeableLayoutManager) layoutManager).mo12682H();
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.recommendation.swipeable.SwipeableLayoutManager");
    }

    /* renamed from: b */
    public float mo12693b(C1085v vVar) {
        C12932j.m33818b(vVar, "viewHolder");
        return 0.5f;
    }

    /* renamed from: b */
    public void mo12694b(C1085v vVar, int i) {
        C12932j.m33818b(vVar, "viewHolder");
        int e = m15022e();
        if (i == 4 && (e & 4) != 0) {
            this.f13654e.onItemSwiped(i);
        } else if (i == 8 && (e & 8) != 0) {
            this.f13654e.onItemSwiped(i);
        } else if (i == 1 && (e & 1) != 0) {
            this.f13654e.onItemSwiped(i);
        } else if (i == 2 && (e & 2) != 0) {
            this.f13654e.onItemSwiped(i);
        }
        vVar.itemView.invalidate();
    }

    /* renamed from: b */
    public boolean mo12695b(RecyclerView recyclerView, C1085v vVar, C1085v vVar2) {
        C12932j.m33818b(recyclerView, "recyclerView");
        C12932j.m33818b(vVar, "viewHolder");
        C12932j.m33818b(vVar2, "target");
        return false;
    }

    /* renamed from: c */
    public int mo12696c(RecyclerView recyclerView, C1085v vVar) {
        C12932j.m33818b(recyclerView, "recyclerView");
        C12932j.m33818b(vVar, "viewHolder");
        return C5319g.m15062d(0, vVar.getAdapterPosition() != 0 ? 0 : m15021d());
    }

    /* renamed from: d */
    public int mo12697d(RecyclerView recyclerView, C1085v vVar) {
        C12932j.m33818b(recyclerView, "recyclerView");
        C12932j.m33818b(vVar, "viewHolder");
        return C5319g.m15062d(0, vVar.getAdapterPosition() != 0 ? 0 : m15022e());
    }

    public C5310a(Function1<? super Integer, C12956q> function1, Function2<? super C1085v, ? super Double, C12956q> function2) {
        C12932j.m33818b(function1, "onItemSwiped");
        C12932j.m33818b(function2, "onItemSwipedPercentageListener");
        this((OnItemSwiped) new C5311a(function1), (OnItemSwipePercentageListener) new C5312b(function2));
    }

    /* renamed from: a */
    public void mo12691a(Canvas canvas, RecyclerView recyclerView, C1085v vVar, float f, float f2, int i, boolean z) {
        RecyclerView recyclerView2 = recyclerView;
        C1085v vVar2 = vVar;
        C12932j.m33818b(canvas, Constants.URL_CAMPAIGN);
        C12932j.m33818b(recyclerView2, "recyclerView");
        C12932j.m33818b(vVar2, "viewHolder");
        super.mo12691a(canvas, recyclerView, vVar, f, f2, i, z);
        double min = Math.min(1.0d, Math.sqrt((double) ((f * f) + (f2 * f2))) / ((double) m15020c(vVar2)));
        double max = (double) Math.max(-1.0f, Math.min(1.0f, f / ((float) recyclerView.getMeasuredWidth())));
        View view = vVar2.itemView;
        if (view instanceof OnItemSwipePercentageListener) {
            if (view != null) {
                ((OnItemSwipePercentageListener) view).onItemSwiped(vVar2, max);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.recommendation.swipeable.OnItemSwipePercentageListener");
            }
        }
        OnItemSwipePercentageListener onItemSwipePercentageListener = this.f13655f;
        if (onItemSwipePercentageListener != null) {
            onItemSwipePercentageListener.onItemSwiped(vVar2, max);
        }
        LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            SwipeableLayoutManager swipeableLayoutManager = (SwipeableLayoutManager) layoutManager;
            int childCount = recyclerView.getChildCount();
            if (vVar.getAdapterPosition() == 0) {
                View view2 = vVar2.itemView;
                view2.setRotation(((float) swipeableLayoutManager.mo12681G()) * (f / ((float) recyclerView.getMeasuredWidth())));
                view2.setScaleX(1.0f);
                view2.setScaleY(1.0f);
            }
            int childCount2 = recyclerView.getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                View childAt = recyclerView2.getChildAt(i2);
                C12932j.m33815a((Object) childAt, "getChildAt(index)");
                int i3 = (childCount - i2) - 1;
                if (i3 > 0) {
                    float J = swipeableLayoutManager.mo12684J();
                    float max2 = Math.max(0.0f, Math.min(1.0f, (float) (((double) (((float) 1) - (((float) i3) * J))) + (((double) J) * min))));
                    childAt.setScaleX(max2);
                    if (i3 < swipeableLayoutManager.mo12683I() - 1) {
                        childAt.setScaleY(max2);
                        int K = swipeableLayoutManager.mo12685K();
                        childAt.setTranslationY(Math.max(0.0f, (float) (((double) (i3 * K)) - (((double) K) * min))));
                        childAt.setAlpha(1.0f);
                    } else {
                        childAt.setAlpha(((float) min) * 1.0f);
                    }
                }
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.recommendation.swipeable.SwipeableLayoutManager");
    }

    /* renamed from: c */
    private final float m15020c(C1085v vVar) {
        View view = vVar.itemView;
        C12932j.m33815a((Object) view, "viewHolder.itemView");
        return ((float) view.getWidth()) * 0.9f;
    }

    /* renamed from: a */
    public void mo12692a(RecyclerView recyclerView, C1085v vVar) {
        C12932j.m33818b(recyclerView, "recyclerView");
        C12932j.m33818b(vVar, "viewHolder");
        super.mo12692a(recyclerView, vVar);
        View view = vVar.itemView;
        view.setRotation(0.0f);
        view.setAlpha(1.0f);
        view.setTranslationX(1.0f);
        view.setTranslationY(1.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
    }
}
