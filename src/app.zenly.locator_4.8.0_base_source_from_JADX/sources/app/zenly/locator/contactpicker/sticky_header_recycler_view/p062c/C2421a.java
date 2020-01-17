package app.zenly.locator.contactpicker.sticky_header_recycler_view.p062c;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: app.zenly.locator.contactpicker.sticky_header_recycler_view.c.a */
public class C2421a {
    /* renamed from: a */
    public void mo8383a(Rect rect, View view) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof MarginLayoutParams) {
            m8498a(rect, (MarginLayoutParams) layoutParams);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }

    /* renamed from: a */
    private void m8498a(Rect rect, MarginLayoutParams marginLayoutParams) {
        rect.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
    }
}
