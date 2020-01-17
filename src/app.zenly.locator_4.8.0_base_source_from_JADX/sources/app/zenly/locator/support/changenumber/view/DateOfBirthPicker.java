package app.zenly.locator.support.changenumber.view;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.BaseSavedState;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.view.C0657l;
import app.zenly.android.base.util.C1297b;
import app.zenly.android.base.widget.LinearLayout;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.util.C3222k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

public final class DateOfBirthPicker extends LinearLayout {

    /* renamed from: v */
    private final List<EditText> f14408v;

    /* renamed from: w */
    private HashMap f14409w;

    public static final class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C5652a();

        /* renamed from: e */
        private String f14410e;

        /* renamed from: f */
        private String f14411f;

        /* renamed from: g */
        private String f14412g;

        /* renamed from: app.zenly.locator.support.changenumber.view.DateOfBirthPicker$SavedState$a */
        public static final class C5652a implements Creator<SavedState> {
            C5652a() {
            }

            public SavedState createFromParcel(Parcel parcel) {
                C12932j.m33818b(parcel, "inParcel");
                return new SavedState(parcel, null);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        /* renamed from: app.zenly.locator.support.changenumber.view.DateOfBirthPicker$SavedState$b */
        public static final class C5653b {
            private C5653b() {
            }

            public /* synthetic */ C5653b(C12928f fVar) {
                this();
            }
        }

        static {
            new C5653b(null);
        }

        public /* synthetic */ SavedState(Parcel parcel, C12928f fVar) {
            this(parcel);
        }

        /* renamed from: a */
        public final String mo13293a() {
            return this.f14412g;
        }

        /* renamed from: b */
        public final String mo13295b() {
            return this.f14411f;
        }

        /* renamed from: c */
        public final String mo13297c() {
            return this.f14410e;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C12932j.m33818b(parcel, "out");
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f14410e);
            parcel.writeString(this.f14411f);
            parcel.writeString(this.f14412g);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: a */
        public final void mo13294a(String str) {
            this.f14412g = str;
        }

        /* renamed from: b */
        public final void mo13296b(String str) {
            this.f14411f = str;
        }

        /* renamed from: c */
        public final void mo13298c(String str) {
            this.f14410e = str;
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f14410e = parcel.readString();
            this.f14411f = parcel.readString();
            this.f14412g = parcel.readString();
        }
    }

    /* renamed from: app.zenly.locator.support.changenumber.view.DateOfBirthPicker$a */
    public static final class C5654a implements TextWatcher {

        /* renamed from: e */
        final /* synthetic */ EditText f14413e;

        /* renamed from: f */
        final /* synthetic */ DateOfBirthPicker f14414f;

        public C5654a(EditText editText, DateOfBirthPicker dateOfBirthPicker) {
            this.f14413e = editText;
            this.f14414f = dateOfBirthPicker;
        }

        public void afterTextChanged(Editable editable) {
            C12932j.m33818b(editable, "s");
            int length = editable.length();
            DateOfBirthPicker dateOfBirthPicker = this.f14414f;
            EditText editText = this.f14413e;
            C12932j.m33815a((Object) editText, "editText");
            if (length >= dateOfBirthPicker.m15956a((TextView) editText)) {
                this.f14414f.m15959b();
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C12932j.m33818b(charSequence, "s");
            charSequence.toString();
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C12932j.m33818b(charSequence, "s");
        }
    }

    public DateOfBirthPicker(Context context) {
        this(context, null, 0, 6, null);
    }

    public DateOfBirthPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DateOfBirthPicker(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m15959b() {
        for (EditText editText : this.f14408v) {
            if (editText.getText().length() < m15956a((TextView) editText)) {
                C1297b.m6241b(editText);
                return;
            }
        }
    }

    /* renamed from: d */
    public View mo13285d(int i) {
        if (this.f14409w == null) {
            this.f14409w = new HashMap();
        }
        View view = (View) this.f14409w.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f14409w.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        super.dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        super.dispatchFreezeSelfOnly(sparseArray);
    }

    public final String getDayText() {
        EditText editText = (EditText) mo13285d(C3891l.day_view);
        C12932j.m33815a((Object) editText, "day_view");
        return editText.getText().toString();
    }

    public final String getMonthText() {
        EditText editText = (EditText) mo13285d(C3891l.month_view);
        C12932j.m33815a((Object) editText, "month_view");
        return editText.getText().toString();
    }

    public final String getYearText() {
        EditText editText = (EditText) mo13285d(C3891l.year_view);
        C12932j.m33815a((Object) editText, "year_view");
        return editText.getText().toString();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        C12932j.m33818b(parcelable, "state");
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        ((EditText) mo13285d(C3891l.year_view)).setText(savedState.mo13297c());
        ((EditText) mo13285d(C3891l.month_view)).setText(savedState.mo13295b());
        ((EditText) mo13285d(C3891l.day_view)).setText(savedState.mo13293a());
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        EditText editText = (EditText) mo13285d(C3891l.year_view);
        C12932j.m33815a((Object) editText, "year_view");
        savedState.mo13298c(editText.getText().toString());
        EditText editText2 = (EditText) mo13285d(C3891l.month_view);
        C12932j.m33815a((Object) editText2, "month_view");
        savedState.mo13296b(editText2.getText().toString());
        EditText editText3 = (EditText) mo13285d(C3891l.day_view);
        C12932j.m33815a((Object) editText3, "day_view");
        savedState.mo13294a(editText3.getText().toString());
        return savedState;
    }

    public DateOfBirthPicker(Context context, AttributeSet attributeSet, int i) {
        EditText editText;
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        this.f14408v = new ArrayList();
        LayoutInflater.from(context).inflate(R.layout.view_date_of_birth_picker, this);
        EditText editText2 = (EditText) mo13285d(C3891l.year_view);
        EditText editText3 = (EditText) mo13285d(C3891l.month_view);
        EditText editText4 = (EditText) mo13285d(C3891l.day_view);
        removeAllViews();
        String a = C3222k.m10216a(context);
        int length = a.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = a.charAt(i2);
            if (charAt == 'd') {
                editText = editText4;
            } else if (charAt == 'm') {
                editText = editText3;
            } else if (charAt == 'y') {
                editText = editText2;
            } else {
                throw new IllegalArgumentException();
            }
            addView(editText);
            this.f14408v.add(editText);
        }
        for (EditText editText5 : C12848o.m33643b((Object[]) new EditText[]{editText2, editText3, editText4})) {
            C12932j.m33815a((Object) editText5, "editText");
            editText5.addTextChangedListener(new C5654a(editText5, this));
        }
    }

    /* renamed from: a */
    public final boolean mo6846a() {
        boolean z;
        Iterator it = C0657l.m3059a(this).iterator();
        do {
            z = true;
            if (!it.hasNext()) {
                return true;
            }
            View view = (View) it.next();
            if (view != null) {
                Editable text = ((EditText) view).getText();
                C12932j.m33815a((Object) text, "(it as EditText).text");
                if (text.length() != 0) {
                    z = false;
                    continue;
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.widget.EditText");
            }
        } while (z);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final int m15956a(TextView textView) {
        LengthFilter lengthFilter;
        InputFilter[] filters = textView.getFilters();
        C12932j.m33815a((Object) filters, "filters");
        int length = filters.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                lengthFilter = null;
                break;
            }
            lengthFilter = filters[i];
            if (lengthFilter instanceof LengthFilter) {
                break;
            }
            i++;
        }
        if (lengthFilter == null) {
            return Integer.MAX_VALUE;
        }
        if (lengthFilter != null) {
            return lengthFilter.getMax();
        }
        throw new TypeCastException("null cannot be cast to non-null type android.text.InputFilter.LengthFilter");
    }
}
