package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar.C0089a;
import androidx.appcompat.view.C0142a;
import p214e.p215a.C7521a;

/* renamed from: androidx.appcompat.widget.t */
public class C0280t extends HorizontalScrollView implements OnItemSelectedListener {

    /* renamed from: e */
    Runnable f1259e;

    /* renamed from: f */
    private C0283c f1260f;

    /* renamed from: g */
    LinearLayoutCompat f1261g;

    /* renamed from: h */
    private Spinner f1262h;

    /* renamed from: i */
    private boolean f1263i;

    /* renamed from: j */
    int f1264j;

    /* renamed from: k */
    int f1265k;

    /* renamed from: l */
    private int f1266l;

    /* renamed from: m */
    private int f1267m;

    /* renamed from: androidx.appcompat.widget.t$a */
    class C0281a implements Runnable {

        /* renamed from: e */
        final /* synthetic */ View f1268e;

        C0281a(View view) {
            this.f1268e = view;
        }

        public void run() {
            C0280t.this.smoothScrollTo(this.f1268e.getLeft() - ((C0280t.this.getWidth() - this.f1268e.getWidth()) / 2), 0);
            C0280t.this.f1259e = null;
        }
    }

    /* renamed from: androidx.appcompat.widget.t$b */
    private class C0282b extends BaseAdapter {
        C0282b() {
        }

        public int getCount() {
            return C0280t.this.f1261g.getChildCount();
        }

        public Object getItem(int i) {
            return ((C0284d) C0280t.this.f1261g.getChildAt(i)).mo2072a();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return C0280t.this.mo2055a((C0089a) getItem(i), true);
            }
            ((C0284d) view).mo2073a((C0089a) getItem(i));
            return view;
        }
    }

    /* renamed from: androidx.appcompat.widget.t$c */
    private class C0283c implements OnClickListener {
        C0283c() {
        }

        public void onClick(View view) {
            ((C0284d) view).mo2072a().mo319e();
            int childCount = C0280t.this.f1261g.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = C0280t.this.f1261g.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.t$d */
    private class C0284d extends LinearLayout {

        /* renamed from: e */
        private final int[] f1272e = {16842964};

        /* renamed from: f */
        private C0089a f1273f;

        /* renamed from: g */
        private TextView f1274g;

        /* renamed from: h */
        private ImageView f1275h;

        /* renamed from: i */
        private View f1276i;

        public C0284d(Context context, C0089a aVar, boolean z) {
            super(context, null, C7521a.actionBarTabStyle);
            this.f1273f = aVar;
            C0291z a = C0291z.m1196a(context, null, this.f1272e, C7521a.actionBarTabStyle, 0);
            if (a.mo2116g(0)) {
                setBackgroundDrawable(a.mo2106b(0));
            }
            a.mo2102a();
            if (z) {
                setGravity(8388627);
            }
            mo2074b();
        }

        /* renamed from: a */
        public void mo2073a(C0089a aVar) {
            this.f1273f = aVar;
            mo2074b();
        }

        /* renamed from: b */
        public void mo2074b() {
            C0089a aVar = this.f1273f;
            View b = aVar.mo316b();
            CharSequence charSequence = null;
            if (b != null) {
                ViewParent parent = b.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b);
                    }
                    addView(b);
                }
                this.f1276i = b;
                TextView textView = this.f1274g;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1275h;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1275h.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1276i;
            if (view != null) {
                removeView(view);
                this.f1276i = null;
            }
            Drawable c = aVar.mo317c();
            CharSequence d = aVar.mo318d();
            if (c != null) {
                if (this.f1275h == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LayoutParams layoutParams = new LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f1275h = appCompatImageView;
                }
                this.f1275h.setImageDrawable(c);
                this.f1275h.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1275h;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1275h.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(d);
            if (z) {
                if (this.f1274g == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, C7521a.actionBarTabTextStyle);
                    appCompatTextView.setEllipsize(TruncateAt.END);
                    LayoutParams layoutParams2 = new LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f1274g = appCompatTextView;
                }
                this.f1274g.setText(d);
                this.f1274g.setVisibility(0);
            } else {
                TextView textView2 = this.f1274g;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1274g.setText(null);
                }
            }
            ImageView imageView3 = this.f1275h;
            if (imageView3 != null) {
                imageView3.setContentDescription(aVar.mo315a());
            }
            if (!z) {
                charSequence = aVar.mo315a();
            }
            C0243b0.m933a(this, charSequence);
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (C0280t.this.f1264j > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = C0280t.this.f1264j;
                if (measuredWidth > i3) {
                    super.onMeasure(MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
                }
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }

        /* renamed from: a */
        public C0089a mo2072a() {
            return this.f1273f;
        }
    }

    static {
        new DecelerateInterpolator();
    }

    /* renamed from: a */
    private Spinner m1155a() {
        AppCompatSpinner appCompatSpinner = new AppCompatSpinner(getContext(), null, C7521a.actionDropDownStyle);
        appCompatSpinner.setLayoutParams(new LinearLayoutCompat.LayoutParams(-2, -1));
        appCompatSpinner.setOnItemSelectedListener(this);
        return appCompatSpinner;
    }

    /* renamed from: b */
    private boolean m1156b() {
        Spinner spinner = this.f1262h;
        return spinner != null && spinner.getParent() == this;
    }

    /* renamed from: c */
    private void m1157c() {
        if (!m1156b()) {
            if (this.f1262h == null) {
                this.f1262h = m1155a();
            }
            removeView(this.f1261g);
            addView(this.f1262h, new ViewGroup.LayoutParams(-2, -1));
            if (this.f1262h.getAdapter() == null) {
                this.f1262h.setAdapter(new C0282b());
            }
            Runnable runnable = this.f1259e;
            if (runnable != null) {
                removeCallbacks(runnable);
                this.f1259e = null;
            }
            this.f1262h.setSelection(this.f1267m);
        }
    }

    /* renamed from: d */
    private boolean m1158d() {
        if (!m1156b()) {
            return false;
        }
        removeView(this.f1262h);
        addView(this.f1261g, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1262h.getSelectedItemPosition());
        return false;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1259e;
        if (runnable != null) {
            post(runnable);
        }
    }

    /* access modifiers changed from: protected */
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0142a a = C0142a.m493a(getContext());
        setContentHeight(a.mo612e());
        this.f1265k = a.mo611d();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1259e;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((C0284d) view).mo2072a().mo319e();
    }

    public void onMeasure(int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f1261g.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f1264j = -1;
        } else {
            if (childCount > 2) {
                this.f1264j = (int) (((float) MeasureSpec.getSize(i)) * 0.4f);
            } else {
                this.f1264j = MeasureSpec.getSize(i) / 2;
            }
            this.f1264j = Math.min(this.f1264j, this.f1265k);
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(this.f1266l, 1073741824);
        if (z2 || !this.f1263i) {
            z = false;
        }
        if (z) {
            this.f1261g.measure(0, makeMeasureSpec);
            if (this.f1261g.getMeasuredWidth() > MeasureSpec.getSize(i)) {
                m1157c();
            } else {
                m1158d();
            }
        } else {
            m1158d();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (z2 && measuredWidth != measuredWidth2) {
            setTabSelected(this.f1267m);
        }
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f1263i = z;
    }

    public void setContentHeight(int i) {
        this.f1266l = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.f1267m = i;
        int childCount = this.f1261g.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f1261g.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                mo2056a(i);
            }
            i2++;
        }
        Spinner spinner = this.f1262h;
        if (spinner != null && i >= 0) {
            spinner.setSelection(i);
        }
    }

    /* renamed from: a */
    public void mo2056a(int i) {
        View childAt = this.f1261g.getChildAt(i);
        Runnable runnable = this.f1259e;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        this.f1259e = new C0281a(childAt);
        post(this.f1259e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0284d mo2055a(C0089a aVar, boolean z) {
        C0284d dVar = new C0284d(getContext(), aVar, z);
        if (z) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1266l));
        } else {
            dVar.setFocusable(true);
            if (this.f1260f == null) {
                this.f1260f = new C0283c();
            }
            dVar.setOnClickListener(this.f1260f);
        }
        return dVar;
    }
}
