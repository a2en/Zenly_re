package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.C0680h;
import p214e.p215a.C7521a;
import p214e.p215a.p216k.p217a.C7531a;

public class AppCompatAutoCompleteTextView extends AutoCompleteTextView implements TintableBackgroundView {

    /* renamed from: g */
    private static final int[] f846g = {16843126};

    /* renamed from: e */
    private final C0244c f847e;

    /* renamed from: f */
    private final C0259k f848f;

    public AppCompatAutoCompleteTextView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0244c cVar = this.f847e;
        if (cVar != null) {
            cVar.mo1866a();
        }
        C0259k kVar = this.f848f;
        if (kVar != null) {
            kVar.mo1921a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0244c cVar = this.f847e;
        if (cVar != null) {
            return cVar.mo1872b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C0244c cVar = this.f847e;
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
        C0244c cVar = this.f847e;
        if (cVar != null) {
            cVar.mo1870a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0244c cVar = this.f847e;
        if (cVar != null) {
            cVar.mo1867a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0680h.m3176a((TextView) this, callback));
    }

    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(C7531a.m18133c(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0244c cVar = this.f847e;
        if (cVar != null) {
            cVar.mo1873b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C0244c cVar = this.f847e;
        if (cVar != null) {
            cVar.mo1869a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0259k kVar = this.f848f;
        if (kVar != null) {
            kVar.mo1925a(context, i);
        }
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7521a.autoCompleteTextViewStyle);
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet, int i) {
        super(C0288w.m1192b(context), attributeSet, i);
        C0291z a = C0291z.m1196a(getContext(), attributeSet, f846g, i, 0);
        if (a.mo2116g(0)) {
            setDropDownBackgroundDrawable(a.mo2106b(0));
        }
        a.mo2102a();
        this.f847e = new C0244c(this);
        this.f847e.mo1871a(attributeSet, i);
        this.f848f = new C0259k(this);
        this.f848f.mo1928a(attributeSet, i);
        this.f848f.mo1921a();
    }
}
