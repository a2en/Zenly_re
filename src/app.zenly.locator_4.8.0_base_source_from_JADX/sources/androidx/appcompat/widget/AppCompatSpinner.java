package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.C0122a;
import androidx.appcompat.app.C0122a.C0123a;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import p214e.p215a.C7521a;
import p214e.p215a.p216k.p217a.C7531a;

public class AppCompatSpinner extends Spinner implements TintableBackgroundView {

    /* renamed from: m */
    private static final int[] f873m = {16843505};

    /* renamed from: e */
    private final C0244c f874e;

    /* renamed from: f */
    private final Context f875f;

    /* renamed from: g */
    private C0266o f876g;

    /* renamed from: h */
    private SpinnerAdapter f877h;

    /* renamed from: i */
    private final boolean f878i;

    /* renamed from: j */
    private C0209f f879j;

    /* renamed from: k */
    int f880k;

    /* renamed from: l */
    final Rect f881l;

    static class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C0200a();

        /* renamed from: e */
        boolean f882e;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$SavedState$a */
        static class C0200a implements Creator<SavedState> {
            C0200a() {
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f882e ? (byte) 1 : 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f882e = parcel.readByte() != 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$a */
    class C0201a extends C0266o {

        /* renamed from: n */
        final /* synthetic */ C0205e f883n;

        C0201a(View view, C0205e eVar) {
            this.f883n = eVar;
            super(view);
        }

        /* renamed from: a */
        public ShowableListMenu mo695a() {
            return this.f883n;
        }

        @SuppressLint({"SyntheticAccessor"})
        /* renamed from: b */
        public boolean mo696b() {
            if (!AppCompatSpinner.this.getInternalPopup().isShowing()) {
                AppCompatSpinner.this.mo1346a();
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$b */
    class C0202b implements OnGlobalLayoutListener {
        C0202b() {
        }

        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().isShowing()) {
                AppCompatSpinner.this.mo1346a();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver == null) {
                return;
            }
            if (VERSION.SDK_INT >= 16) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            } else {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$c */
    class C0203c implements C0209f, OnClickListener {

        /* renamed from: e */
        C0122a f886e;

        /* renamed from: f */
        private ListAdapter f887f;

        /* renamed from: g */
        private CharSequence f888g;

        C0203c() {
        }

        /* renamed from: a */
        public int mo1375a() {
            return 0;
        }

        /* renamed from: a */
        public void mo1378a(ListAdapter listAdapter) {
            this.f887f = listAdapter;
        }

        /* renamed from: b */
        public CharSequence mo1380b() {
            return this.f888g;
        }

        /* renamed from: c */
        public Drawable mo1382c() {
            return null;
        }

        /* renamed from: c */
        public void mo1383c(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: d */
        public int mo1384d() {
            return 0;
        }

        public void dismiss() {
            C0122a aVar = this.f886e;
            if (aVar != null) {
                aVar.dismiss();
                this.f886e = null;
            }
        }

        public boolean isShowing() {
            C0122a aVar = this.f886e;
            if (aVar != null) {
                return aVar.isShowing();
            }
            return false;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick(null, i, this.f887f.getItemId(i));
            }
            dismiss();
        }

        public void setBackgroundDrawable(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        /* renamed from: a */
        public void mo1379a(CharSequence charSequence) {
            this.f888g = charSequence;
        }

        /* renamed from: b */
        public void mo1381b(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: a */
        public void mo1377a(int i, int i2) {
            if (this.f887f != null) {
                C0123a aVar = new C0123a(AppCompatSpinner.this.getPopupContext());
                CharSequence charSequence = this.f888g;
                if (charSequence != null) {
                    aVar.mo547b(charSequence);
                }
                aVar.mo535a(this.f887f, AppCompatSpinner.this.getSelectedItemPosition(), (OnClickListener) this);
                this.f886e = aVar.mo542a();
                ListView a = this.f886e.mo522a();
                if (VERSION.SDK_INT >= 17) {
                    a.setTextDirection(i);
                    a.setTextAlignment(i2);
                }
                this.f886e.show();
            }
        }

        /* renamed from: a */
        public void mo1376a(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$d */
    private static class C0204d implements ListAdapter, SpinnerAdapter {

        /* renamed from: e */
        private SpinnerAdapter f890e;

        /* renamed from: f */
        private ListAdapter f891f;

        public C0204d(SpinnerAdapter spinnerAdapter, Theme theme) {
            this.f890e = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f891f = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                ThemedSpinnerAdapter themedSpinnerAdapter2 = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter2.getDropDownViewTheme() == null) {
                    themedSpinnerAdapter2.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f891f;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f890e;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f890e;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f890e;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f890e;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f890e;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f891f;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f890e;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f890e;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e */
    class C0205e extends ListPopupWindow implements C0209f {

        /* renamed from: M */
        private CharSequence f892M;

        /* renamed from: N */
        ListAdapter f893N;

        /* renamed from: O */
        private final Rect f894O = new Rect();

        /* renamed from: P */
        private int f895P;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$a */
        class C0206a implements OnItemClickListener {
            C0206a(AppCompatSpinner appCompatSpinner) {
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    C0205e eVar = C0205e.this;
                    AppCompatSpinner.this.performItemClick(view, i, eVar.f893N.getItemId(i));
                }
                C0205e.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$b */
        class C0207b implements OnGlobalLayoutListener {
            C0207b() {
            }

            public void onGlobalLayout() {
                C0205e eVar = C0205e.this;
                if (!eVar.mo1402b(AppCompatSpinner.this)) {
                    C0205e.this.dismiss();
                    return;
                }
                C0205e.this.mo1403j();
                C0205e.super.show();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e$c */
        class C0208c implements OnDismissListener {

            /* renamed from: e */
            final /* synthetic */ OnGlobalLayoutListener f899e;

            C0208c(OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f899e = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f899e);
                }
            }
        }

        public C0205e(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            mo1561a((View) AppCompatSpinner.this);
            mo1564a(true);
            mo1576h(0);
            mo1562a((OnItemClickListener) new C0206a(AppCompatSpinner.this));
        }

        /* renamed from: b */
        public CharSequence mo1380b() {
            return this.f892M;
        }

        /* renamed from: c */
        public void mo1383c(int i) {
            this.f895P = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public void mo1403j() {
            int i;
            Drawable c = mo1567c();
            int i2 = 0;
            if (c != null) {
                c.getPadding(AppCompatSpinner.this.f881l);
                i2 = C0254f0.m992a(AppCompatSpinner.this) ? AppCompatSpinner.this.f881l.right : -AppCompatSpinner.this.f881l.left;
            } else {
                Rect rect = AppCompatSpinner.this.f881l;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i3 = appCompatSpinner.f880k;
            if (i3 == -2) {
                int a = appCompatSpinner.mo1345a((SpinnerAdapter) this.f893N, mo1567c());
                int i4 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f881l;
                int i5 = (i4 - rect2.left) - rect2.right;
                if (a > i5) {
                    a = i5;
                }
                mo1571e(Math.max(a, (width - paddingLeft) - paddingRight));
            } else if (i3 == -1) {
                mo1571e((width - paddingLeft) - paddingRight);
            } else {
                mo1571e(i3);
            }
            if (C0254f0.m992a(AppCompatSpinner.this)) {
                i = i2 + (((width - paddingRight) - mo1574g()) - mo1404k());
            } else {
                i = i2 + paddingLeft + mo1404k();
            }
            mo1559a(i);
        }

        /* renamed from: k */
        public int mo1404k() {
            return this.f895P;
        }

        /* renamed from: a */
        public void mo1378a(ListAdapter listAdapter) {
            super.mo1378a(listAdapter);
            this.f893N = listAdapter;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public boolean mo1402b(View view) {
            return ViewCompat.m2802B(view) && view.getGlobalVisibleRect(this.f894O);
        }

        /* renamed from: a */
        public void mo1379a(CharSequence charSequence) {
            this.f892M = charSequence;
        }

        /* renamed from: a */
        public void mo1377a(int i, int i2) {
            boolean isShowing = isShowing();
            mo1403j();
            mo1575g(2);
            super.show();
            ListView listView = getListView();
            listView.setChoiceMode(1);
            if (VERSION.SDK_INT >= 17) {
                listView.setTextDirection(i);
                listView.setTextAlignment(i2);
            }
            mo1578i(AppCompatSpinner.this.getSelectedItemPosition());
            if (!isShowing) {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    C0207b bVar = new C0207b();
                    viewTreeObserver.addOnGlobalLayoutListener(bVar);
                    mo1563a((OnDismissListener) new C0208c(bVar));
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$f */
    interface C0209f {
        /* renamed from: a */
        int mo1375a();

        /* renamed from: a */
        void mo1376a(int i);

        /* renamed from: a */
        void mo1377a(int i, int i2);

        /* renamed from: a */
        void mo1378a(ListAdapter listAdapter);

        /* renamed from: a */
        void mo1379a(CharSequence charSequence);

        /* renamed from: b */
        CharSequence mo1380b();

        /* renamed from: b */
        void mo1381b(int i);

        /* renamed from: c */
        Drawable mo1382c();

        /* renamed from: c */
        void mo1383c(int i);

        /* renamed from: d */
        int mo1384d();

        void dismiss();

        boolean isShowing();

        void setBackgroundDrawable(Drawable drawable);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7521a.spinnerStyle);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo1345a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f881l);
            Rect rect = this.f881l;
            i2 += rect.left + rect.right;
        }
        return i2;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0244c cVar = this.f874e;
        if (cVar != null) {
            cVar.mo1866a();
        }
    }

    public int getDropDownHorizontalOffset() {
        C0209f fVar = this.f879j;
        if (fVar != null) {
            return fVar.mo1375a();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    public int getDropDownVerticalOffset() {
        C0209f fVar = this.f879j;
        if (fVar != null) {
            return fVar.mo1384d();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    public int getDropDownWidth() {
        if (this.f879j != null) {
            return this.f880k;
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public final C0209f getInternalPopup() {
        return this.f879j;
    }

    public Drawable getPopupBackground() {
        C0209f fVar = this.f879j;
        if (fVar != null) {
            return fVar.mo1382c();
        }
        if (VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    public Context getPopupContext() {
        return this.f875f;
    }

    public CharSequence getPrompt() {
        C0209f fVar = this.f879j;
        return fVar != null ? fVar.mo1380b() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0244c cVar = this.f874e;
        if (cVar != null) {
            return cVar.mo1872b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C0244c cVar = this.f874e;
        if (cVar != null) {
            return cVar.mo1874c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0209f fVar = this.f879j;
        if (fVar != null && fVar.isShowing()) {
            this.f879j.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f879j != null && MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo1345a(getAdapter(), getBackground())), MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f882e) {
            ViewTreeObserver viewTreeObserver = getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new C0202b());
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0209f fVar = this.f879j;
        savedState.f882e = fVar != null && fVar.isShowing();
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0266o oVar = this.f876g;
        if (oVar == null || !oVar.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        C0209f fVar = this.f879j;
        if (fVar == null) {
            return super.performClick();
        }
        if (!fVar.isShowing()) {
            mo1346a();
        }
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0244c cVar = this.f874e;
        if (cVar != null) {
            cVar.mo1870a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0244c cVar = this.f874e;
        if (cVar != null) {
            cVar.mo1867a(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        C0209f fVar = this.f879j;
        if (fVar != null) {
            fVar.mo1383c(i);
            this.f879j.mo1376a(i);
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i);
        }
    }

    public void setDropDownVerticalOffset(int i) {
        C0209f fVar = this.f879j;
        if (fVar != null) {
            fVar.mo1381b(i);
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f879j != null) {
            this.f880k = i;
        } else if (VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C0209f fVar = this.f879j;
        if (fVar != null) {
            fVar.setBackgroundDrawable(drawable);
        } else if (VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C7531a.m18133c(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        C0209f fVar = this.f879j;
        if (fVar != null) {
            fVar.mo1379a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0244c cVar = this.f874e;
        if (cVar != null) {
            cVar.mo1873b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C0244c cVar = this.f874e;
        if (cVar != null) {
            cVar.mo1869a(mode);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f878i) {
            this.f877h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f879j != null) {
            Context context = this.f875f;
            if (context == null) {
                context = getContext();
            }
            this.f879j.mo1378a((ListAdapter) new C0204d(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        if (r11 != null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004a, code lost:
        r11.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (r11 != null) goto L_0x004a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f881l = r0
            int[] r0 = p214e.p215a.C7530j.Spinner
            r1 = 0
            androidx.appcompat.widget.z r0 = androidx.appcompat.widget.C0291z.m1196a(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.c r2 = new androidx.appcompat.widget.c
            r2.<init>(r6)
            r6.f874e = r2
            if (r11 == 0) goto L_0x0022
            androidx.appcompat.view.b r2 = new androidx.appcompat.view.b
            r2.<init>(r7, r11)
            r6.f875f = r2
            goto L_0x0034
        L_0x0022:
            int r11 = p214e.p215a.C7530j.Spinner_popupTheme
            int r11 = r0.mo2115g(r11, r1)
            if (r11 == 0) goto L_0x0032
            androidx.appcompat.view.b r2 = new androidx.appcompat.view.b
            r2.<init>(r7, r11)
            r6.f875f = r2
            goto L_0x0034
        L_0x0032:
            r6.f875f = r7
        L_0x0034:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L_0x0066
            int[] r11 = f873m     // Catch:{ Exception -> 0x0053, all -> 0x0050 }
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch:{ Exception -> 0x0053, all -> 0x0050 }
            boolean r3 = r11.hasValue(r1)     // Catch:{ Exception -> 0x004e }
            if (r3 == 0) goto L_0x0048
            int r10 = r11.getInt(r1, r1)     // Catch:{ Exception -> 0x004e }
        L_0x0048:
            if (r11 == 0) goto L_0x0066
        L_0x004a:
            r11.recycle()
            goto L_0x0066
        L_0x004e:
            r3 = move-exception
            goto L_0x0055
        L_0x0050:
            r7 = move-exception
            r11 = r2
            goto L_0x0060
        L_0x0053:
            r3 = move-exception
            r11 = r2
        L_0x0055:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch:{ all -> 0x005f }
            if (r11 == 0) goto L_0x0066
            goto L_0x004a
        L_0x005f:
            r7 = move-exception
        L_0x0060:
            if (r11 == 0) goto L_0x0065
            r11.recycle()
        L_0x0065:
            throw r7
        L_0x0066:
            r11 = 1
            if (r10 == 0) goto L_0x00a3
            if (r10 == r11) goto L_0x006c
            goto L_0x00b5
        L_0x006c:
            androidx.appcompat.widget.AppCompatSpinner$e r10 = new androidx.appcompat.widget.AppCompatSpinner$e
            android.content.Context r3 = r6.f875f
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f875f
            int[] r4 = p214e.p215a.C7530j.Spinner
            androidx.appcompat.widget.z r1 = androidx.appcompat.widget.C0291z.m1196a(r3, r8, r4, r9, r1)
            int r3 = p214e.p215a.C7530j.Spinner_android_dropDownWidth
            r4 = -2
            int r3 = r1.mo2113f(r3, r4)
            r6.f880k = r3
            int r3 = p214e.p215a.C7530j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r3 = r1.mo2106b(r3)
            r10.setBackgroundDrawable(r3)
            int r3 = p214e.p215a.C7530j.Spinner_android_prompt
            java.lang.String r3 = r0.mo2110d(r3)
            r10.mo1379a(r3)
            r1.mo2102a()
            r6.f879j = r10
            androidx.appcompat.widget.AppCompatSpinner$a r1 = new androidx.appcompat.widget.AppCompatSpinner$a
            r1.<init>(r6, r10)
            r6.f876g = r1
            goto L_0x00b5
        L_0x00a3:
            androidx.appcompat.widget.AppCompatSpinner$c r10 = new androidx.appcompat.widget.AppCompatSpinner$c
            r10.<init>()
            r6.f879j = r10
            androidx.appcompat.widget.AppCompatSpinner$f r10 = r6.f879j
            int r1 = p214e.p215a.C7530j.Spinner_android_prompt
            java.lang.String r1 = r0.mo2110d(r1)
            r10.mo1379a(r1)
        L_0x00b5:
            int r10 = p214e.p215a.C7530j.Spinner_android_entries
            java.lang.CharSequence[] r10 = r0.mo2114f(r10)
            if (r10 == 0) goto L_0x00cd
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = p214e.p215a.C7527g.support_simple_spinner_dropdown_item
            r1.setDropDownViewResource(r7)
            r6.setAdapter(r1)
        L_0x00cd:
            r0.mo2102a()
            r6.f878i = r11
            android.widget.SpinnerAdapter r7 = r6.f877h
            if (r7 == 0) goto L_0x00db
            r6.setAdapter(r7)
            r6.f877h = r2
        L_0x00db:
            androidx.appcompat.widget.c r7 = r6.f874e
            r7.mo1871a(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo1346a() {
        if (VERSION.SDK_INT >= 17) {
            this.f879j.mo1377a(getTextDirection(), getTextAlignment());
        } else {
            this.f879j.mo1377a(-1, -1);
        }
    }
}
