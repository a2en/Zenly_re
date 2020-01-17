package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.text.C0588d;
import androidx.core.text.C0588d.C0589a;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.C0680h;
import androidx.core.widget.TintableCompoundDrawablesView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p214e.p215a.p216k.p217a.C7531a;
import p214e.p234h.p235e.C7619d;

public class AppCompatTextView extends TextView implements TintableBackgroundView, TintableCompoundDrawablesView, AutoSizeableTextView {
    private final C0244c mBackgroundTintHelper;
    private Future<C0588d> mPrecomputedTextFuture;
    private final C0258j mTextClassifierHelper;
    private final C0259k mTextHelper;

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<C0588d> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                C0680h.m3182a((TextView) this, (C0588d) future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0244c cVar = this.mBackgroundTintHelper;
        if (cVar != null) {
            cVar.mo1866a();
        }
        C0259k kVar = this.mTextHelper;
        if (kVar != null) {
            kVar.mo1921a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (AutoSizeableTextView.f2844a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0259k kVar = this.mTextHelper;
        if (kVar != null) {
            return kVar.mo1934c();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (AutoSizeableTextView.f2844a) {
            return super.getAutoSizeMinTextSize();
        }
        C0259k kVar = this.mTextHelper;
        if (kVar != null) {
            return kVar.mo1935d();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (AutoSizeableTextView.f2844a) {
            return super.getAutoSizeStepGranularity();
        }
        C0259k kVar = this.mTextHelper;
        if (kVar != null) {
            return kVar.mo1936e();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (AutoSizeableTextView.f2844a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0259k kVar = this.mTextHelper;
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
        C0259k kVar = this.mTextHelper;
        if (kVar != null) {
            return kVar.mo1938g();
        }
        return 0;
    }

    public int getFirstBaselineToTopHeight() {
        return C0680h.m3184b(this);
    }

    public int getLastBaselineToBottomHeight() {
        return C0680h.m3186c(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0244c cVar = this.mBackgroundTintHelper;
        if (cVar != null) {
            return cVar.mo1872b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C0244c cVar = this.mBackgroundTintHelper;
        if (cVar != null) {
            return cVar.mo1874c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.mo1939h();
    }

    public Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.mo1940i();
    }

    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        if (VERSION.SDK_INT < 28) {
            C0258j jVar = this.mTextClassifierHelper;
            if (jVar != null) {
                return jVar.mo1919a();
            }
        }
        return super.getTextClassifier();
    }

    public C0589a getTextMetricsParamsCompat() {
        return C0680h.m3190e(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0253f.m990a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        C0259k kVar = this.mTextHelper;
        if (kVar != null) {
            kVar.mo1931a(z, i, i2, i3, i4);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C0259k kVar = this.mTextHelper;
        if (kVar != null && !AutoSizeableTextView.f2844a && kVar.mo1941j()) {
            this.mTextHelper.mo1933b();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (AutoSizeableTextView.f2844a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        C0259k kVar = this.mTextHelper;
        if (kVar != null) {
            kVar.mo1924a(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (AutoSizeableTextView.f2844a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        C0259k kVar = this.mTextHelper;
        if (kVar != null) {
            kVar.mo1932a(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (AutoSizeableTextView.f2844a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        C0259k kVar = this.mTextHelper;
        if (kVar != null) {
            kVar.mo1922a(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0244c cVar = this.mBackgroundTintHelper;
        if (cVar != null) {
            cVar.mo1870a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0244c cVar = this.mBackgroundTintHelper;
        if (cVar != null) {
            cVar.mo1867a(i);
        }
    }

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0259k kVar = this.mTextHelper;
        if (kVar != null) {
            kVar.mo1942k();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0259k kVar = this.mTextHelper;
        if (kVar != null) {
            kVar.mo1942k();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0259k kVar = this.mTextHelper;
        if (kVar != null) {
            kVar.mo1942k();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0259k kVar = this.mTextHelper;
        if (kVar != null) {
            kVar.mo1942k();
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0680h.m3176a((TextView) this, callback));
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            C0680h.m3177a((TextView) this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            C0680h.m3185b(this, i);
        }
    }

    public void setLineHeight(int i) {
        C0680h.m3187c(this, i);
    }

    public void setPrecomputedText(C0588d dVar) {
        C0680h.m3182a((TextView) this, dVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0244c cVar = this.mBackgroundTintHelper;
        if (cVar != null) {
            cVar.mo1873b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C0244c cVar = this.mBackgroundTintHelper;
        if (cVar != null) {
            cVar.mo1869a(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.mo1926a(colorStateList);
        this.mTextHelper.mo1921a();
    }

    public void setSupportCompoundDrawablesTintMode(Mode mode) {
        this.mTextHelper.mo1927a(mode);
        this.mTextHelper.mo1921a();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0259k kVar = this.mTextHelper;
        if (kVar != null) {
            kVar.mo1925a(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        if (VERSION.SDK_INT < 28) {
            C0258j jVar = this.mTextClassifierHelper;
            if (jVar != null) {
                jVar.mo1920a(textClassifier);
                return;
            }
        }
        super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(Future<C0588d> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0589a aVar) {
        C0680h.m3181a((TextView) this, aVar);
    }

    public void setTextSize(int i, float f) {
        if (AutoSizeableTextView.f2844a) {
            super.setTextSize(i, f);
            return;
        }
        C0259k kVar = this.mTextHelper;
        if (kVar != null) {
            kVar.mo1923a(i, f);
        }
    }

    public void setTypeface(Typeface typeface, int i) {
        Typeface a = (typeface == null || i <= 0) ? null : C7619d.m18512a(getContext(), typeface, i);
        if (a != null) {
            typeface = a;
        }
        super.setTypeface(typeface, i);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0288w.m1192b(context), attributeSet, i);
        this.mBackgroundTintHelper = new C0244c(this);
        this.mBackgroundTintHelper.mo1871a(attributeSet, i);
        this.mTextHelper = new C0259k(this);
        this.mTextHelper.mo1928a(attributeSet, i);
        this.mTextHelper.mo1921a();
        this.mTextClassifierHelper = new C0258j(this);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable c = i != 0 ? C7531a.m18133c(context, i) : null;
        Drawable c2 = i2 != 0 ? C7531a.m18133c(context, i2) : null;
        Drawable c3 = i3 != 0 ? C7531a.m18133c(context, i3) : null;
        if (i4 != 0) {
            drawable = C7531a.m18133c(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(c, c2, c3, drawable);
        C0259k kVar = this.mTextHelper;
        if (kVar != null) {
            kVar.mo1942k();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable c = i != 0 ? C7531a.m18133c(context, i) : null;
        Drawable c2 = i2 != 0 ? C7531a.m18133c(context, i2) : null;
        Drawable c3 = i3 != 0 ? C7531a.m18133c(context, i3) : null;
        if (i4 != 0) {
            drawable = C7531a.m18133c(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(c, c2, c3, drawable);
        C0259k kVar = this.mTextHelper;
        if (kVar != null) {
            kVar.mo1942k();
        }
    }
}
