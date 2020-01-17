package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.TextView;
import p214e.p215a.C7524d;
import p214e.p215a.C7526f;
import p214e.p215a.C7527g;
import p214e.p215a.C7529i;

/* renamed from: androidx.appcompat.widget.d0 */
class C0249d0 {

    /* renamed from: a */
    private final Context f1139a;

    /* renamed from: b */
    private final View f1140b;

    /* renamed from: c */
    private final TextView f1141c;

    /* renamed from: d */
    private final LayoutParams f1142d = new LayoutParams();

    /* renamed from: e */
    private final Rect f1143e = new Rect();

    /* renamed from: f */
    private final int[] f1144f = new int[2];

    /* renamed from: g */
    private final int[] f1145g = new int[2];

    C0249d0(Context context) {
        this.f1139a = context;
        this.f1140b = LayoutInflater.from(this.f1139a).inflate(C7527g.abc_tooltip, null);
        this.f1141c = (TextView) this.f1140b.findViewById(C7526f.message);
        this.f1142d.setTitle(C0249d0.class.getSimpleName());
        this.f1142d.packageName = this.f1139a.getPackageName();
        LayoutParams layoutParams = this.f1142d;
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = C7529i.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1892a(View view, int i, int i2, boolean z, CharSequence charSequence) {
        if (mo1893b()) {
            mo1891a();
        }
        this.f1141c.setText(charSequence);
        m962a(view, i, i2, z, this.f1142d);
        ((WindowManager) this.f1139a.getSystemService("window")).addView(this.f1140b, this.f1142d);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo1893b() {
        return this.f1140b.getParent() != null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1891a() {
        if (mo1893b()) {
            ((WindowManager) this.f1139a.getSystemService("window")).removeView(this.f1140b);
        }
    }

    /* renamed from: a */
    private void m962a(View view, int i, int i2, boolean z, LayoutParams layoutParams) {
        int i3;
        int i4;
        layoutParams.token = view.getApplicationWindowToken();
        int dimensionPixelOffset = this.f1139a.getResources().getDimensionPixelOffset(C7524d.tooltip_precise_anchor_threshold);
        if (view.getWidth() < dimensionPixelOffset) {
            i = view.getWidth() / 2;
        }
        if (view.getHeight() >= dimensionPixelOffset) {
            int dimensionPixelOffset2 = this.f1139a.getResources().getDimensionPixelOffset(C7524d.tooltip_precise_anchor_extra_offset);
            i4 = i2 + dimensionPixelOffset2;
            i3 = i2 - dimensionPixelOffset2;
        } else {
            i4 = view.getHeight();
            i3 = 0;
        }
        layoutParams.gravity = 49;
        int dimensionPixelOffset3 = this.f1139a.getResources().getDimensionPixelOffset(z ? C7524d.tooltip_y_offset_touch : C7524d.tooltip_y_offset_non_touch);
        View a = m961a(view);
        if (a == null) {
            Log.e("TooltipPopup", "Cannot find app view");
            return;
        }
        a.getWindowVisibleDisplayFrame(this.f1143e);
        Rect rect = this.f1143e;
        if (rect.left < 0 && rect.top < 0) {
            Resources resources = this.f1139a.getResources();
            int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
            int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            this.f1143e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        a.getLocationOnScreen(this.f1145g);
        view.getLocationOnScreen(this.f1144f);
        int[] iArr = this.f1144f;
        int i5 = iArr[0];
        int[] iArr2 = this.f1145g;
        iArr[0] = i5 - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        layoutParams.x = (iArr[0] + i) - (a.getWidth() / 2);
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(0, 0);
        this.f1140b.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredHeight = this.f1140b.getMeasuredHeight();
        int[] iArr3 = this.f1144f;
        int i6 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
        int i7 = iArr3[1] + i4 + dimensionPixelOffset3;
        if (z) {
            if (i6 >= 0) {
                layoutParams.y = i6;
            } else {
                layoutParams.y = i7;
            }
        } else if (measuredHeight + i7 <= this.f1143e.height()) {
            layoutParams.y = i7;
        } else {
            layoutParams.y = i6;
        }
    }

    /* renamed from: a */
    private static View m961a(View view) {
        View rootView = view.getRootView();
        ViewGroup.LayoutParams layoutParams = rootView.getLayoutParams();
        if ((layoutParams instanceof LayoutParams) && ((LayoutParams) layoutParams).type == 2) {
            return rootView;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return ((Activity) context).getWindow().getDecorView();
            }
        }
        return rootView;
    }
}
