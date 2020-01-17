package app.zenly.locator.p208y;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import app.zenly.locator.C3891l;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;
import kotlinx.android.extensions.LayoutContainer;

/* renamed from: app.zenly.locator.y.f */
public final class C6295f implements LayoutContainer {

    /* renamed from: a */
    private final View f15812a;

    /* renamed from: b */
    private HashMap f15813b;

    public C6295f(View view, OnClickListener onClickListener) {
        C12932j.m33818b(view, "containerView");
        C12932j.m33818b(onClickListener, "onNextClickListener");
        this.f15812a = view;
        ((TextView) mo14145a(C3891l.phone_settings_intro_next)).setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public View mo14145a(int i) {
        if (this.f15813b == null) {
            this.f15813b = new HashMap();
        }
        View view = (View) this.f15813b.get(Integer.valueOf(i));
        if (view == null) {
            View containerView = getContainerView();
            if (containerView == null) {
                return null;
            }
            view = containerView.findViewById(i);
            this.f15813b.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public View getContainerView() {
        return this.f15812a;
    }
}
