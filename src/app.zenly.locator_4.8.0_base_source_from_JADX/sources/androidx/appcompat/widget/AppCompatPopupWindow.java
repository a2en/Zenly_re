package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.core.widget.C0679g;
import p214e.p215a.C7530j;

class AppCompatPopupWindow extends PopupWindow {

    /* renamed from: b */
    private static final boolean f866b = (VERSION.SDK_INT < 21);

    /* renamed from: a */
    private boolean f867a;

    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m791a(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private void m791a(Context context, AttributeSet attributeSet, int i, int i2) {
        C0291z a = C0291z.m1196a(context, attributeSet, C7530j.PopupWindow, i, i2);
        if (a.mo2116g(C7530j.PopupWindow_overlapAnchor)) {
            m792a(a.mo2103a(C7530j.PopupWindow_overlapAnchor, false));
        }
        setBackgroundDrawable(a.mo2106b(C7530j.PopupWindow_android_popupBackground));
        a.mo2102a();
    }

    public void showAsDropDown(View view, int i, int i2) {
        if (f866b && this.f867a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        if (f866b && this.f867a) {
            i2 -= view.getHeight();
        }
        super.update(view, i, i2, i3, i4);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        if (f866b && this.f867a) {
            i2 -= view.getHeight();
        }
        super.showAsDropDown(view, i, i2, i3);
    }

    /* renamed from: a */
    private void m792a(boolean z) {
        if (f866b) {
            this.f867a = z;
        } else {
            C0679g.m3174a((PopupWindow) this, z);
        }
    }
}
