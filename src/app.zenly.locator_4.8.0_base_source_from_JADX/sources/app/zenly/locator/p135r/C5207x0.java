package app.zenly.locator.p135r;

import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import app.zenly.locator.R;
import app.zenly.locator.core.p072ui.controller.ZenlyController;
import com.bluelinelabs.conductor.C8819d;

/* renamed from: app.zenly.locator.r.x0 */
public final class C5207x0 extends ZenlyController {
    /* renamed from: B */
    public static C5207x0 m14786B() {
        return new C5207x0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.controller_picker_success, viewGroup, false);
        inflate.setOnClickListener(new C5160d0(this));
        return inflate;
    }

    /* renamed from: e */
    public /* synthetic */ void mo7061e(View view) {
        mo23946k().mo23997a((C8819d) this);
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }
}
