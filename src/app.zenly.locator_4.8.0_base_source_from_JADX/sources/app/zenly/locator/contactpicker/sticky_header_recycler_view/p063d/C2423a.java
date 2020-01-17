package app.zenly.locator.contactpicker.sticky_header_recycler_view.p063d;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import app.zenly.locator.contactpicker.sticky_header_recycler_view.p062c.C2421a;
import app.zenly.locator.contactpicker.sticky_header_recycler_view.util.OrientationProvider;

/* renamed from: app.zenly.locator.contactpicker.sticky_header_recycler_view.d.a */
public class C2423a {

    /* renamed from: a */
    private final C2421a f7290a;

    /* renamed from: b */
    private final OrientationProvider f7291b;

    /* renamed from: c */
    private Paint f7292c;

    /* renamed from: d */
    private final Rect f7293d;

    public C2423a(OrientationProvider orientationProvider) {
        this(orientationProvider, new C2421a());
    }

    /* renamed from: a */
    public void mo8386a(RecyclerView recyclerView, Canvas canvas, View view, Rect rect, boolean z) {
        canvas.save();
        if (recyclerView.getLayoutManager().mo5285f()) {
            m8500a(this.f7293d, recyclerView, view);
            canvas.clipRect(this.f7293d);
        }
        canvas.translate((float) rect.left, (float) rect.top);
        view.draw(canvas);
        if (z) {
            canvas.drawRect(0.0f, ((float) view.getMeasuredHeight()) - 0.0f, (float) view.getMeasuredWidth(), (float) view.getMeasuredHeight(), this.f7292c);
        }
        canvas.restore();
    }

    private C2423a(OrientationProvider orientationProvider, C2421a aVar) {
        this.f7292c = new Paint(1);
        this.f7293d = new Rect();
        this.f7291b = orientationProvider;
        this.f7290a = aVar;
        this.f7292c.setColor(0);
    }

    /* renamed from: a */
    private void m8500a(Rect rect, RecyclerView recyclerView, View view) {
        this.f7290a.mo8383a(rect, view);
        if (this.f7291b.getOrientation(recyclerView) == 1) {
            rect.set(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), (recyclerView.getWidth() - recyclerView.getPaddingRight()) - rect.right, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            rect.set(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getWidth() - recyclerView.getPaddingRight(), (recyclerView.getHeight() - recyclerView.getPaddingBottom()) - rect.bottom);
        }
    }
}
