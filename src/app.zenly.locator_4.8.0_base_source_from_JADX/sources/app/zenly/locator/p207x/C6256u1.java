package app.zenly.locator.p207x;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import app.zenly.locator.core.p072ui.controller.ZenlyController;

/* renamed from: app.zenly.locator.x.u1 */
public class C6256u1 extends ZenlyController {
    public C6256u1() {
        this(Bundle.EMPTY);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new LayoutParams(-1, -1));
        return frameLayout;
    }

    /* renamed from: w */
    public boolean mo7339w() {
        return false;
    }

    public C6256u1(Bundle bundle) {
        super(bundle);
    }
}
