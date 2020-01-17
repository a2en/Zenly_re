package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.C0680h;
import p214e.p215a.C7521a;

public class AppCompatButton extends Button implements TintableBackgroundView, AutoSizeableTextView {

    /* renamed from: e */
    private final C0244c f849e;

    /* renamed from: f */
    private final C0259k f850f;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7521a.buttonStyle);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0244c cVar = this.f849e;
        if (cVar != null) {
            cVar.mo1866a();
        }
        C0259k kVar = this.f850f;
        if (kVar != null) {
            kVar.mo1921a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (AutoSizeableTextView.f2844a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0259k kVar = this.f850f;
        if (kVar != null) {
            return kVar.mo1934c();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (AutoSizeableTextView.f2844a) {
            return super.getAutoSizeMinTextSize();
        }
        C0259k kVar = this.f850f;
        if (kVar != null) {
            return kVar.mo1935d();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (AutoSizeableTextView.f2844a) {
            return super.getAutoSizeStepGranularity();
        }
        C0259k kVar = this.f850f;
        if (kVar != null) {
            return kVar.mo1936e();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (AutoSizeableTextView.f2844a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0259k kVar = this.f850f;
        return kVar != null ? kVar.mo1937f() : new int[0];
    }

    public int getAutoSizeTextType() {
        int i = 0;
        if (AutoSizeableTextView.f2844a) {
            if (super.getAutoSizeTextType() == 1) {
                i = 1;
            }
            return i;
        }
        C0259k kVar = this.f850f;
        if (kVar != null) {
            return kVar.mo1938g();
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0244c cVar = this.f849e;
        if (cVar != null) {
            return cVar.mo1872b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C0244c cVar = this.f849e;
        if (cVar != null) {
            return cVar.mo1874c();
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0259k kVar = this.f850f;
        if (kVar != null) {
            kVar.mo1931a(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0259k kVar = this.f850f;
        if (kVar != null && !AutoSizeableTextView.f2844a && kVar.mo1941j()) {
            this.f850f.mo1933b();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (AutoSizeableTextView.f2844a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0259k kVar = this.f850f;
        if (kVar != null) {
            kVar.mo1924a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (AutoSizeableTextView.f2844a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0259k kVar = this.f850f;
        if (kVar != null) {
            kVar.mo1932a(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (AutoSizeableTextView.f2844a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0259k kVar = this.f850f;
        if (kVar != null) {
            kVar.mo1922a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0244c cVar = this.f849e;
        if (cVar != null) {
            cVar.mo1870a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0244c cVar = this.f849e;
        if (cVar != null) {
            cVar.mo1867a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0680h.m3176a((TextView) this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        C0259k kVar = this.f850f;
        if (kVar != null) {
            kVar.mo1930a(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0244c cVar = this.f849e;
        if (cVar != null) {
            cVar.mo1873b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C0244c cVar = this.f849e;
        if (cVar != null) {
            cVar.mo1869a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0259k kVar = this.f850f;
        if (kVar != null) {
            kVar.mo1925a(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (AutoSizeableTextView.f2844a) {
            super.setTextSize(i, f);
            return;
        }
        C0259k kVar = this.f850f;
        if (kVar != null) {
            kVar.mo1923a(i, f);
        }
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(C0288w.m1192b(context), attributeSet, i);
        this.f849e = new C0244c(this);
        this.f849e.mo1871a(attributeSet, i);
        this.f850f = new C0259k(this);
        this.f850f.mo1928a(attributeSet, i);
        this.f850f.mo1921a();
    }
}
