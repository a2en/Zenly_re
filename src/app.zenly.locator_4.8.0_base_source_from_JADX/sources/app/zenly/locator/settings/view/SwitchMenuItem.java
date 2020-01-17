package app.zenly.locator.settings.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import app.zenly.locator.C3891l;
import app.zenly.locator.C3892m;
import app.zenly.locator.R;
import app.zenly.locator.core.widget.C3275i;
import java.util.HashMap;
import kotlin.jvm.internal.C12932j;

public final class SwitchMenuItem extends FrameLayout {

    /* renamed from: e */
    private OnCheckChangedListener f14270e;

    /* renamed from: f */
    private HashMap f14271f;

    public interface OnCheckChangedListener {
        void onCheckChanged(SwitchMenuItem switchMenuItem, boolean z);
    }

    public SwitchMenuItem(Context context) {
        this(context, null, 0, 6, null);
    }

    public SwitchMenuItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SwitchMenuItem(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: a */
    public View mo13208a(int i) {
        if (this.f14271f == null) {
            this.f14271f = new HashMap();
        }
        View view = (View) this.f14271f.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f14271f.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final boolean mo13209a() {
        SwitchCompat switchCompat = (SwitchCompat) mo13208a(C3891l.switch_compat);
        C12932j.m33815a((Object) switchCompat, "switch_compat");
        return switchCompat.isChecked();
    }

    public final CharSequence getDescription() {
        TextView textView = (TextView) mo13208a(C3891l.description_text_view);
        C12932j.m33815a((Object) textView, "description_text_view");
        return textView.getText();
    }

    public final OnCheckChangedListener getOnCheckChangedListener() {
        return this.f14270e;
    }

    public final CharSequence getTitle() {
        TextView textView = (TextView) mo13208a(C3891l.title_text_view);
        C12932j.m33815a((Object) textView, "title_text_view");
        return textView.getText();
    }

    public boolean performClick() {
        setChecked(!mo13209a());
        OnCheckChangedListener onCheckChangedListener = this.f14270e;
        if (onCheckChangedListener != null) {
            onCheckChangedListener.onCheckChanged(this, mo13209a());
        }
        return super.performClick();
    }

    public final void setChecked(boolean z) {
        SwitchCompat switchCompat = (SwitchCompat) mo13208a(C3891l.switch_compat);
        C12932j.m33815a((Object) switchCompat, "switch_compat");
        switchCompat.setChecked(z);
    }

    public final void setDescription(CharSequence charSequence) {
        String str = "switch_spacer";
        String str2 = "description_text_view";
        if (!(charSequence == null || charSequence.length() == 0)) {
            TextView textView = (TextView) mo13208a(C3891l.switch_spacer);
            C12932j.m33815a((Object) textView, str);
            textView.setVisibility(0);
            TextView textView2 = (TextView) mo13208a(C3891l.description_text_view);
            C12932j.m33815a((Object) textView2, str2);
            textView2.setVisibility(0);
            TextView textView3 = (TextView) mo13208a(C3891l.description_text_view);
            C12932j.m33815a((Object) textView3, str2);
            textView3.setText(charSequence);
            return;
        }
        TextView textView4 = (TextView) mo13208a(C3891l.switch_spacer);
        C12932j.m33815a((Object) textView4, str);
        textView4.setVisibility(8);
        TextView textView5 = (TextView) mo13208a(C3891l.description_text_view);
        C12932j.m33815a((Object) textView5, str2);
        textView5.setVisibility(8);
    }

    public final void setOnCheckChangedListener(OnCheckChangedListener onCheckChangedListener) {
        this.f14270e = onCheckChangedListener;
    }

    public final void setTitle(CharSequence charSequence) {
        TextView textView = (TextView) mo13208a(C3891l.title_text_view);
        C12932j.m33815a((Object) textView, "title_text_view");
        C3275i.m10386a(textView, charSequence);
    }

    public SwitchMenuItem(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        View.inflate(getContext(), R.layout.view_switch_menu_item, this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3892m.SwitchMenuItem, i, 0);
        setTitle(obtainStyledAttributes.getString(1));
        setDescription(obtainStyledAttributes.getString(0));
        obtainStyledAttributes.recycle();
        setClickable(true);
    }
}
