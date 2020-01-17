package app.zenly.locator.recommendation.swipeable.touchhelper;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.ItemTouchUIUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.share.Constants;
import kotlin.jvm.internal.C12932j;

/* renamed from: app.zenly.locator.recommendation.swipeable.touchhelper.b */
public final class C5325b implements ItemTouchUIUtil {
    public void clearView(View view) {
        C12932j.m33818b(view, "view");
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        C12932j.m33818b(canvas, Constants.URL_CAMPAIGN);
        C12932j.m33818b(recyclerView, "recyclerView");
        C12932j.m33818b(view, "view");
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        C12932j.m33818b(canvas, Constants.URL_CAMPAIGN);
        C12932j.m33818b(recyclerView, "recyclerView");
        C12932j.m33818b(view, "view");
    }

    public void onSelected(View view) {
        C12932j.m33818b(view, "view");
    }
}
