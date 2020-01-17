package app.zenly.locator.support.changenumber.view;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.BaseSavedState;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import app.zenly.android.base.widget.LinearLayout;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.p135r.p137b1.C5147g;
import java.util.HashMap;
import kotlin.C12956q;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.core.C7123i2;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;

public final class PhoneNumberPicker extends LinearLayout {

    /* renamed from: v */
    private C7123i2 f14415v;

    /* renamed from: w */
    private Function1<? super PhoneNumberPicker, C12956q> f14416w;

    /* renamed from: x */
    private HashMap f14417x;

    public static final class SavedState extends BaseSavedState {
        public static final Creator<SavedState> CREATOR = new C5655a();

        /* renamed from: e */
        private String f14418e;

        /* renamed from: app.zenly.locator.support.changenumber.view.PhoneNumberPicker$SavedState$a */
        public static final class C5655a implements Creator<SavedState> {
            C5655a() {
            }

            public SavedState createFromParcel(Parcel parcel) {
                C12932j.m33818b(parcel, "inParcel");
                return new SavedState(parcel, null);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        /* renamed from: app.zenly.locator.support.changenumber.view.PhoneNumberPicker$SavedState$b */
        public static final class C5656b {
            private C5656b() {
            }

            public /* synthetic */ C5656b(C12928f fVar) {
                this();
            }
        }

        static {
            new C5656b(null);
        }

        public /* synthetic */ SavedState(Parcel parcel, C12928f fVar) {
            this(parcel);
        }

        /* renamed from: a */
        public final String mo13317a() {
            return this.f14418e;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C12932j.m33818b(parcel, "out");
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f14418e);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        /* renamed from: a */
        public final void mo13318a(String str) {
            this.f14418e = str;
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f14418e = parcel.readString();
        }
    }

    /* renamed from: app.zenly.locator.support.changenumber.view.PhoneNumberPicker$a */
    static final class C5657a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ PhoneNumberPicker f14419e;

        C5657a(PhoneNumberPicker phoneNumberPicker) {
            this.f14419e = phoneNumberPicker;
        }

        public final void onClick(View view) {
            Function1 onPickRegionListener = this.f14419e.getOnPickRegionListener();
            if (onPickRegionListener != null) {
                C12956q qVar = (C12956q) onPickRegionListener.invoke(this.f14419e);
            }
        }
    }

    public PhoneNumberPicker(Context context) {
        this(context, null, 0, 6, null);
    }

    public PhoneNumberPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PhoneNumberPicker(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: d */
    public View mo13305d(int i) {
        if (this.f14417x == null) {
            this.f14417x = new HashMap();
        }
        View view = (View) this.f14417x.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f14417x.put(Integer.valueOf(i), findViewById);
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

    public final String getInternationalNumber() {
        StringBuilder sb = new StringBuilder();
        sb.append('+');
        sb.append(this.f14415v.getCountryDialingCode());
        sb.append(getNumber());
        return sb.toString();
    }

    public final String getNumber() {
        EditText editText = (EditText) mo13305d(C3891l.number_view);
        C12932j.m33815a((Object) editText, "number_view");
        return editText.getText().toString();
    }

    public final Function1<PhoneNumberPicker, C12956q> getOnPickRegionListener() {
        return this.f14416w;
    }

    public final C7123i2 getPhoneRegion() {
        return this.f14415v;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        C12932j.m33818b(parcelable, "state");
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        String a = savedState.mo13317a();
        if (a != null) {
            setNumber(a);
        } else {
            C12932j.m33814a();
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.mo13318a(getNumber());
        return savedState;
    }

    public final void setNumber(String str) {
        C12932j.m33818b(str, "value");
        ((EditText) mo13305d(C3891l.number_view)).setText(str);
    }

    public final void setOnPickRegionListener(Function1<? super PhoneNumberPicker, C12956q> function1) {
        this.f14416w = function1;
    }

    public final void setPhoneRegion(C7123i2 i2Var) {
        C12932j.m33818b(i2Var, "value");
        C5147g gVar = new C5147g(i2Var);
        TextView textView = (TextView) mo13305d(C3891l.prefix_number_view);
        C12932j.m33815a((Object) textView, "prefix_number_view");
        textView.setText(gVar.mo12519a());
        ImageView imageView = (ImageView) mo13305d(C3891l.prefix_flag_view);
        Context context = imageView.getContext();
        C12932j.m33815a((Object) context, "context");
        int a = gVar.mo12518a(context);
        if (C7674a.m18692a(a)) {
            imageView.setVisibility(0);
            imageView.setImageResource(a);
        } else {
            imageView.setVisibility(4);
        }
        this.f14415v = i2Var;
    }

    public PhoneNumberPicker(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        C7123i2 defaultInstance = C7123i2.getDefaultInstance();
        C12932j.m33815a((Object) defaultInstance, "TypesProto.PhoneRegion.getDefaultInstance()");
        this.f14415v = defaultInstance;
        LayoutInflater.from(context).inflate(R.layout.view_phone_number_picker, this);
        ((LinearLayout) mo13305d(C3891l.prefix_view)).setOnClickListener(new C5657a(this));
    }
}
