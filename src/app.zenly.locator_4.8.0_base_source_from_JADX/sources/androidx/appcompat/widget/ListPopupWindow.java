package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.PopupWindow.OnDismissListener;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.core.view.ViewCompat;
import androidx.core.widget.C0679g;
import java.lang.reflect.Method;
import p214e.p215a.C7530j;

public class ListPopupWindow implements ShowableListMenu {

    /* renamed from: J */
    private static Method f917J;

    /* renamed from: K */
    private static Method f918K;

    /* renamed from: L */
    private static Method f919L;

    /* renamed from: A */
    final C0216g f920A;

    /* renamed from: B */
    private final C0215f f921B;

    /* renamed from: C */
    private final C0214e f922C;

    /* renamed from: D */
    private final C0212c f923D;

    /* renamed from: E */
    final Handler f924E;

    /* renamed from: F */
    private final Rect f925F;

    /* renamed from: G */
    private Rect f926G;

    /* renamed from: H */
    private boolean f927H;

    /* renamed from: I */
    PopupWindow f928I;

    /* renamed from: e */
    private Context f929e;

    /* renamed from: f */
    private ListAdapter f930f;

    /* renamed from: g */
    C0263n f931g;

    /* renamed from: h */
    private int f932h;

    /* renamed from: i */
    private int f933i;

    /* renamed from: j */
    private int f934j;

    /* renamed from: k */
    private int f935k;

    /* renamed from: l */
    private int f936l;

    /* renamed from: m */
    private boolean f937m;

    /* renamed from: n */
    private boolean f938n;

    /* renamed from: o */
    private boolean f939o;

    /* renamed from: p */
    private int f940p;

    /* renamed from: q */
    private boolean f941q;

    /* renamed from: r */
    private boolean f942r;

    /* renamed from: s */
    int f943s;

    /* renamed from: t */
    private View f944t;

    /* renamed from: u */
    private int f945u;

    /* renamed from: v */
    private DataSetObserver f946v;

    /* renamed from: w */
    private View f947w;

    /* renamed from: x */
    private Drawable f948x;

    /* renamed from: y */
    private OnItemClickListener f949y;

    /* renamed from: z */
    private OnItemSelectedListener f950z;

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$a */
    class C0210a implements Runnable {
        C0210a() {
        }

        public void run() {
            View f = ListPopupWindow.this.mo1572f();
            if (f != null && f.getWindowToken() != null) {
                ListPopupWindow.this.show();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$b */
    class C0211b implements OnItemSelectedListener {
        C0211b() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (i != -1) {
                C0263n nVar = ListPopupWindow.this.f931g;
                if (nVar != null) {
                    nVar.setListSelectionHidden(false);
                }
            }
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$c */
    private class C0212c implements Runnable {
        C0212c() {
        }

        public void run() {
            ListPopupWindow.this.mo1570e();
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$d */
    private class C0213d extends DataSetObserver {
        C0213d() {
        }

        public void onChanged() {
            if (ListPopupWindow.this.isShowing()) {
                ListPopupWindow.this.show();
            }
        }

        public void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$e */
    private class C0214e implements OnScrollListener {
        C0214e() {
        }

        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 1 && !ListPopupWindow.this.mo1577h() && ListPopupWindow.this.f928I.getContentView() != null) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.f924E.removeCallbacks(listPopupWindow.f920A);
                ListPopupWindow.this.f920A.run();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$f */
    private class C0215f implements OnTouchListener {
        C0215f() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0) {
                PopupWindow popupWindow = ListPopupWindow.this.f928I;
                if (popupWindow != null && popupWindow.isShowing() && x >= 0 && x < ListPopupWindow.this.f928I.getWidth() && y >= 0 && y < ListPopupWindow.this.f928I.getHeight()) {
                    ListPopupWindow listPopupWindow = ListPopupWindow.this;
                    listPopupWindow.f924E.postDelayed(listPopupWindow.f920A, 250);
                    return false;
                }
            }
            if (action == 1) {
                ListPopupWindow listPopupWindow2 = ListPopupWindow.this;
                listPopupWindow2.f924E.removeCallbacks(listPopupWindow2.f920A);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$g */
    private class C0216g implements Runnable {
        C0216g() {
        }

        public void run() {
            C0263n nVar = ListPopupWindow.this.f931g;
            if (nVar != null && ViewCompat.m2802B(nVar) && ListPopupWindow.this.f931g.getCount() > ListPopupWindow.this.f931g.getChildCount()) {
                int childCount = ListPopupWindow.this.f931g.getChildCount();
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                if (childCount <= listPopupWindow.f943s) {
                    listPopupWindow.f928I.setInputMethodMode(2);
                    ListPopupWindow.this.show();
                }
            }
        }
    }

    static {
        String str = "ListPopupWindow";
        try {
            f917J = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException unused) {
            Log.i(str, "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
        }
        try {
            f918K = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
        } catch (NoSuchMethodException unused2) {
            Log.i(str, "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
        }
        try {
            f919L = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
        } catch (NoSuchMethodException unused3) {
            Log.i(str, "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
        }
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    /* renamed from: k */
    private void mo1404k() {
        View view = this.f944t;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f944t);
            }
        }
    }

    /* renamed from: a */
    public void mo1378a(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f946v;
        if (dataSetObserver == null) {
            this.f946v = new C0213d();
        } else {
            ListAdapter listAdapter2 = this.f930f;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f930f = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f946v);
        }
        C0263n nVar = this.f931g;
        if (nVar != null) {
            nVar.setAdapter(this.f930f);
        }
    }

    /* renamed from: b */
    public void mo1565b(int i) {
        this.f935k = i;
        this.f937m = true;
    }

    /* renamed from: c */
    public Drawable mo1567c() {
        return this.f928I.getBackground();
    }

    /* renamed from: d */
    public void mo1569d(int i) {
        this.f928I.setAnimationStyle(i);
    }

    public void dismiss() {
        this.f928I.dismiss();
        mo1404k();
        this.f928I.setContentView(null);
        this.f931g = null;
        this.f924E.removeCallbacks(this.f920A);
    }

    /* renamed from: e */
    public void mo1571e(int i) {
        Drawable background = this.f928I.getBackground();
        if (background != null) {
            background.getPadding(this.f925F);
            Rect rect = this.f925F;
            this.f933i = rect.left + rect.right + i;
            return;
        }
        mo1580j(i);
    }

    /* renamed from: f */
    public View mo1572f() {
        return this.f947w;
    }

    /* renamed from: g */
    public int mo1574g() {
        return this.f933i;
    }

    public ListView getListView() {
        return this.f931g;
    }

    /* renamed from: h */
    public void mo1576h(int i) {
        this.f945u = i;
    }

    /* renamed from: i */
    public boolean mo1579i() {
        return this.f927H;
    }

    public boolean isShowing() {
        return this.f928I.isShowing();
    }

    /* renamed from: j */
    public void mo1580j(int i) {
        this.f933i = i;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        this.f928I.setBackgroundDrawable(drawable);
    }

    public void show() {
        int j = mo1403j();
        boolean h = mo1577h();
        C0679g.m3172a(this.f928I, this.f936l);
        boolean z = true;
        if (!this.f928I.isShowing()) {
            int i = this.f933i;
            if (i == -1) {
                i = -1;
            } else if (i == -2) {
                i = mo1572f().getWidth();
            }
            int i2 = this.f932h;
            if (i2 == -1) {
                j = -1;
            } else if (i2 != -2) {
                j = i2;
            }
            this.f928I.setWidth(i);
            this.f928I.setHeight(j);
            mo1990c(true);
            this.f928I.setOutsideTouchable(!this.f942r && !this.f941q);
            this.f928I.setTouchInterceptor(this.f921B);
            if (this.f939o) {
                C0679g.m3174a(this.f928I, this.f938n);
            }
            Method method = f919L;
            if (method != null) {
                try {
                    method.invoke(this.f928I, new Object[]{this.f926G});
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
            C0679g.m3173a(this.f928I, mo1572f(), this.f934j, this.f935k, this.f940p);
            this.f931g.setSelection(-1);
            if (!this.f927H || this.f931g.isInTouchMode()) {
                mo1570e();
            }
            if (!this.f927H) {
                this.f924E.post(this.f923D);
            }
        } else if (ViewCompat.m2802B(mo1572f())) {
            int i3 = this.f933i;
            if (i3 == -1) {
                i3 = -1;
            } else if (i3 == -2) {
                i3 = mo1572f().getWidth();
            }
            int i4 = this.f932h;
            if (i4 == -1) {
                if (!h) {
                    j = -1;
                }
                if (h) {
                    this.f928I.setWidth(this.f933i == -1 ? -1 : 0);
                    this.f928I.setHeight(0);
                } else {
                    this.f928I.setWidth(this.f933i == -1 ? -1 : 0);
                    this.f928I.setHeight(-1);
                }
            } else if (i4 != -2) {
                j = i4;
            }
            PopupWindow popupWindow = this.f928I;
            if (this.f942r || this.f941q) {
                z = false;
            }
            popupWindow.setOutsideTouchable(z);
            this.f928I.update(mo1572f(), this.f934j, this.f935k, i3 < 0 ? -1 : i3, j < 0 ? -1 : j);
        }
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f932h = -2;
        this.f933i = -2;
        this.f936l = 1002;
        this.f940p = 0;
        this.f941q = false;
        this.f942r = false;
        this.f943s = Integer.MAX_VALUE;
        this.f945u = 0;
        this.f920A = new C0216g();
        this.f921B = new C0215f();
        this.f922C = new C0214e();
        this.f923D = new C0212c();
        this.f925F = new Rect();
        this.f929e = context;
        this.f924E = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7530j.ListPopupWindow, i, i2);
        this.f934j = obtainStyledAttributes.getDimensionPixelOffset(C7530j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        this.f935k = obtainStyledAttributes.getDimensionPixelOffset(C7530j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        if (this.f935k != 0) {
            this.f937m = true;
        }
        obtainStyledAttributes.recycle();
        this.f928I = new AppCompatPopupWindow(context, attributeSet, i, i2);
        this.f928I.setInputMethodMode(1);
    }

    /* renamed from: c */
    private void mo1990c(boolean z) {
        Method method = f917J;
        if (method != null) {
            try {
                method.invoke(this.f928I, new Object[]{Boolean.valueOf(z)});
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    /* renamed from: j */
    private int mo1403j() {
        int i;
        int i2;
        int makeMeasureSpec;
        View view;
        int i3;
        boolean z = true;
        if (this.f931g == null) {
            Context context = this.f929e;
            new C0210a();
            this.f931g = mo1558a(context, !this.f927H);
            Drawable drawable = this.f948x;
            if (drawable != null) {
                this.f931g.setSelector(drawable);
            }
            this.f931g.setAdapter(this.f930f);
            this.f931g.setOnItemClickListener(this.f949y);
            this.f931g.setFocusable(true);
            this.f931g.setFocusableInTouchMode(true);
            this.f931g.setOnItemSelectedListener(new C0211b());
            this.f931g.setOnScrollListener(this.f922C);
            OnItemSelectedListener onItemSelectedListener = this.f950z;
            if (onItemSelectedListener != null) {
                this.f931g.setOnItemSelectedListener(onItemSelectedListener);
            }
            View view2 = this.f931g;
            View view3 = this.f944t;
            if (view3 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LayoutParams layoutParams = new LayoutParams(-1, 0, 1.0f);
                int i4 = this.f945u;
                if (i4 == 0) {
                    linearLayout.addView(view3);
                    linearLayout.addView(view2, layoutParams);
                } else if (i4 != 1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid hint position ");
                    sb.append(this.f945u);
                    Log.e("ListPopupWindow", sb.toString());
                } else {
                    linearLayout.addView(view2, layoutParams);
                    linearLayout.addView(view3);
                }
                int i5 = this.f933i;
                if (i5 >= 0) {
                    i3 = Integer.MIN_VALUE;
                } else {
                    i5 = 0;
                    i3 = 0;
                }
                view3.measure(MeasureSpec.makeMeasureSpec(i5, i3), 0);
                LayoutParams layoutParams2 = (LayoutParams) view3.getLayoutParams();
                i = view3.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                i = 0;
                view = view2;
            }
            this.f928I.setContentView(view);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f928I.getContentView();
            View view4 = this.f944t;
            if (view4 != null) {
                LayoutParams layoutParams3 = (LayoutParams) view4.getLayoutParams();
                i = view4.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                i = 0;
            }
        }
        Drawable background = this.f928I.getBackground();
        if (background != null) {
            background.getPadding(this.f925F);
            Rect rect = this.f925F;
            int i6 = rect.top;
            i2 = rect.bottom + i6;
            if (!this.f937m) {
                this.f935k = -i6;
            }
        } else {
            this.f925F.setEmpty();
            i2 = 0;
        }
        if (this.f928I.getInputMethodMode() != 2) {
            z = false;
        }
        int a = m830a(mo1572f(), this.f935k, z);
        if (this.f941q || this.f932h == -1) {
            return a + i2;
        }
        int i7 = this.f933i;
        if (i7 == -2) {
            int i8 = this.f929e.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f925F;
            makeMeasureSpec = MeasureSpec.makeMeasureSpec(i8 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i7 != -1) {
            makeMeasureSpec = MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else {
            int i9 = this.f929e.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f925F;
            makeMeasureSpec = MeasureSpec.makeMeasureSpec(i9 - (rect3.left + rect3.right), 1073741824);
        }
        int a2 = this.f931g.mo1959a(makeMeasureSpec, 0, -1, a - i, -1);
        if (a2 > 0) {
            i += i2 + this.f931g.getPaddingTop() + this.f931g.getPaddingBottom();
        }
        return a2 + i;
    }

    /* renamed from: d */
    public int mo1568d() {
        if (!this.f937m) {
            return 0;
        }
        return this.f935k;
    }

    /* renamed from: f */
    public void mo1573f(int i) {
        this.f940p = i;
    }

    /* renamed from: g */
    public void mo1575g(int i) {
        this.f928I.setInputMethodMode(i);
    }

    /* renamed from: h */
    public boolean mo1577h() {
        return this.f928I.getInputMethodMode() == 2;
    }

    /* renamed from: i */
    public void mo1578i(int i) {
        C0263n nVar = this.f931g;
        if (isShowing() && nVar != null) {
            nVar.setListSelectionHidden(false);
            nVar.setSelection(i);
            if (nVar.getChoiceMode() != 0) {
                nVar.setItemChecked(i, true);
            }
        }
    }

    /* renamed from: b */
    public void mo1566b(boolean z) {
        this.f939o = true;
        this.f938n = z;
    }

    /* renamed from: e */
    public void mo1570e() {
        C0263n nVar = this.f931g;
        if (nVar != null) {
            nVar.setListSelectionHidden(true);
            nVar.requestLayout();
        }
    }

    /* renamed from: a */
    public void mo1564a(boolean z) {
        this.f927H = z;
        this.f928I.setFocusable(z);
    }

    /* renamed from: a */
    public void mo1561a(View view) {
        this.f947w = view;
    }

    /* renamed from: a */
    public int mo1557a() {
        return this.f934j;
    }

    /* renamed from: a */
    public void mo1559a(int i) {
        this.f934j = i;
    }

    /* renamed from: a */
    public void mo1560a(Rect rect) {
        this.f926G = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: a */
    public void mo1562a(OnItemClickListener onItemClickListener) {
        this.f949y = onItemClickListener;
    }

    /* renamed from: a */
    public void mo1563a(OnDismissListener onDismissListener) {
        this.f928I.setOnDismissListener(onDismissListener);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0263n mo1558a(Context context, boolean z) {
        return new C0263n(context, z);
    }

    /* renamed from: a */
    private int m830a(View view, int i, boolean z) {
        Method method = f918K;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f928I, new Object[]{view, Integer.valueOf(i), Boolean.valueOf(z)})).intValue();
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
            }
        }
        return this.f928I.getMaxAvailableHeight(view, i);
    }
}
