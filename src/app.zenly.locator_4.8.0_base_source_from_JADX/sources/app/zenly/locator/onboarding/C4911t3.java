package app.zenly.locator.onboarding;

import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import app.zenly.locator.R;

/* renamed from: app.zenly.locator.onboarding.t3 */
public class C4911t3 extends BaseSignupController {
    /* renamed from: B */
    public int mo7192B() {
        return 6;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.controller_too_young, viewGroup, false);
    }

    public void onWindowInsetsChanged(View view, Rect rect) {
        super.onWindowInsetsChanged(view, rect);
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
    }
}
