package com.google.android.material.bottomsheet;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.C0125c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0615a;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.C0628c;
import com.google.android.material.bottomsheet.BottomSheetBehavior.C10744c;
import p333g.p357d.p358a.p361b.C12067b;
import p333g.p357d.p358a.p361b.C12071f;
import p333g.p357d.p358a.p361b.C12073h;
import p333g.p357d.p358a.p361b.C12075j;

/* renamed from: com.google.android.material.bottomsheet.a */
public class C10746a extends C0125c {
    private BottomSheetBehavior<FrameLayout> behavior;
    private C10744c bottomSheetCallback;
    boolean cancelable;
    private boolean canceledOnTouchOutside;
    private boolean canceledOnTouchOutsideSet;

    /* renamed from: com.google.android.material.bottomsheet.a$a */
    class C10747a implements OnClickListener {
        C10747a() {
        }

        public void onClick(View view) {
            C10746a aVar = C10746a.this;
            if (aVar.cancelable && aVar.isShowing() && C10746a.this.shouldWindowCloseOnTouchOutside()) {
                C10746a.this.cancel();
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$b */
    class C10748b extends C0615a {
        C10748b() {
        }

        /* renamed from: a */
        public void mo3292a(View view, C0628c cVar) {
            super.mo3292a(view, cVar);
            if (C10746a.this.cancelable) {
                cVar.mo3317a(1048576);
                cVar.mo3344e(true);
                return;
            }
            cVar.mo3344e(false);
        }

        /* renamed from: a */
        public boolean mo3293a(View view, int i, Bundle bundle) {
            if (i == 1048576) {
                C10746a aVar = C10746a.this;
                if (aVar.cancelable) {
                    aVar.cancel();
                    return true;
                }
            }
            return super.mo3293a(view, i, bundle);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$c */
    class C10749c implements OnTouchListener {
        C10749c(C10746a aVar) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.a$d */
    class C10750d extends C10744c {
        C10750d() {
        }

        /* renamed from: a */
        public void mo7858a(View view, float f) {
        }

        /* renamed from: a */
        public void mo7859a(View view, int i) {
            if (i == 5) {
                C10746a.this.cancel();
            }
        }
    }

    public C10746a(Context context) {
        this(context, 0);
    }

    private static int getThemeResId(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C12067b.bottomSheetDialogTheme, typedValue, true)) {
            return typedValue.resourceId;
        }
        return C12075j.Theme_Design_Light_BottomSheetDialog;
    }

    private View wrapInBottomSheet(int i, View view, LayoutParams layoutParams) {
        FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C12073h.design_bottom_sheet_dialog, null);
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) frameLayout.findViewById(C12071f.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, coordinatorLayout, false);
        }
        FrameLayout frameLayout2 = (FrameLayout) coordinatorLayout.findViewById(C12071f.design_bottom_sheet);
        this.behavior = BottomSheetBehavior.m27416b(frameLayout2);
        this.behavior.mo14019a(this.bottomSheetCallback);
        this.behavior.mo30687b(this.cancelable);
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C12071f.touch_outside).setOnClickListener(new C10747a());
        ViewCompat.m2824a((View) frameLayout2, (C0615a) new C10748b());
        frameLayout2.setOnTouchListener(new C10749c(this));
        return frameLayout;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            if (VERSION.SDK_INT >= 21) {
                window.clearFlags(67108864);
                window.addFlags(Integer.MIN_VALUE);
            }
            window.setLayout(-1, -1);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
        if (bottomSheetBehavior != null && bottomSheetBehavior.mo30689c() == 5) {
            this.behavior.mo30690c(4);
        }
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.cancelable != z) {
            this.cancelable = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.behavior;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.mo30687b(z);
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.cancelable) {
            this.cancelable = true;
        }
        this.canceledOnTouchOutside = z;
        this.canceledOnTouchOutsideSet = true;
    }

    public void setContentView(int i) {
        super.setContentView(wrapInBottomSheet(i, null, null));
    }

    /* access modifiers changed from: 0000 */
    public boolean shouldWindowCloseOnTouchOutside() {
        if (!this.canceledOnTouchOutsideSet) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{16843611});
            this.canceledOnTouchOutside = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
            this.canceledOnTouchOutsideSet = true;
        }
        return this.canceledOnTouchOutside;
    }

    public C10746a(Context context, int i) {
        super(context, getThemeResId(context, i));
        this.cancelable = true;
        this.canceledOnTouchOutside = true;
        this.bottomSheetCallback = new C10750d();
        supportRequestWindowFeature(1);
    }

    public void setContentView(View view) {
        super.setContentView(wrapInBottomSheet(0, view, null));
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        super.setContentView(wrapInBottomSheet(0, view, layoutParams));
    }
}
