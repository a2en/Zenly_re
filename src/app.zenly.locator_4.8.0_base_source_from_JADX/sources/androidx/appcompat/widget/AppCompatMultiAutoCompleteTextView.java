package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import androidx.core.view.TintableBackgroundView;
import p214e.p215a.C7521a;
import p214e.p215a.p216k.p217a.C7531a;

public class AppCompatMultiAutoCompleteTextView extends MultiAutoCompleteTextView implements TintableBackgroundView {

    /* renamed from: g */
    private static final int[] f863g = {16843126};

    /* renamed from: e */
    private final C0244c f864e;

    /* renamed from: f */
    private final C0259k f865f;

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7521a.autoCompleteTextViewStyle);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0244c cVar = this.f864e;
        if (cVar != null) {
            cVar.mo1866a();
        }
        C0259k kVar = this.f865f;
        if (kVar != null) {
            kVar.mo1921a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0244c cVar = this.f864e;
        if (cVar != null) {
            return cVar.mo1872b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C0244c cVar = this.f864e;
        if (cVar != null) {
            return cVar.mo1874c();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0253f.m990a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0244c cVar = this.f864e;
        if (cVar != null) {
            cVar.mo1870a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0244c cVar = this.f864e;
        if (cVar != null) {
            cVar.mo1867a(i);
        }
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C7531a.m18133c(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0244c cVar = this.f864e;
        if (cVar != null) {
            cVar.mo1873b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C0244c cVar = this.f864e;
        if (cVar != null) {
            cVar.mo1869a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0259k kVar = this.f865f;
        if (kVar != null) {
            kVar.mo1925a(context, i);
        }
    }

    public AppCompatMultiAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0288w.m1192b(context), attributeSet, i);
        C0291z a = C0291z.m1196a(getContext(), attributeSet, f863g, i, 0);
        if (a.mo2116g(0)) {
            setDropDownBackgroundDrawable(a.mo2106b(0));
        }
        a.mo2102a();
        this.f864e = new C0244c(this);
        this.f864e.mo1871a(attributeSet, i);
        this.f865f = new C0259k(this);
        this.f865f.mo1928a(attributeSet, i);
        this.f865f.mo1921a();
    }
}
