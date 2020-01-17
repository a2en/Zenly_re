package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.C0680h;
import p214e.p215a.C7521a;

public class AppCompatEditText extends EditText implements TintableBackgroundView {

    /* renamed from: e */
    private final C0244c f856e;

    /* renamed from: f */
    private final C0259k f857f;

    /* renamed from: g */
    private final C0258j f858g;

    public AppCompatEditText(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0244c cVar = this.f856e;
        if (cVar != null) {
            cVar.mo1866a();
        }
        C0259k kVar = this.f857f;
        if (kVar != null) {
            kVar.mo1921a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0244c cVar = this.f856e;
        if (cVar != null) {
            return cVar.mo1872b();
        }
        return null;
    }

    public Mode getSupportBackgroundTintMode() {
        C0244c cVar = this.f856e;
        if (cVar != null) {
            return cVar.mo1874c();
        }
        return null;
    }

    public TextClassifier getTextClassifier() {
        if (VERSION.SDK_INT < 28) {
            C0258j jVar = this.f858g;
            if (jVar != null) {
                return jVar.mo1919a();
            }
        }
        return super.getTextClassifier();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C0253f.m990a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0244c cVar = this.f856e;
        if (cVar != null) {
            cVar.mo1870a(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0244c cVar = this.f856e;
        if (cVar != null) {
            cVar.mo1867a(i);
        }
    }

    public void setCustomSelectionActionModeCallback(Callback callback) {
        super.setCustomSelectionActionModeCallback(C0680h.m3176a((TextView) this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0244c cVar = this.f856e;
        if (cVar != null) {
            cVar.mo1873b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(Mode mode) {
        C0244c cVar = this.f856e;
        if (cVar != null) {
            cVar.mo1869a(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0259k kVar = this.f857f;
        if (kVar != null) {
            kVar.mo1925a(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        if (VERSION.SDK_INT < 28) {
            C0258j jVar = this.f858g;
            if (jVar != null) {
                jVar.mo1920a(textClassifier);
                return;
            }
        }
        super.setTextClassifier(textClassifier);
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7521a.editTextStyle);
    }

    public Editable getText() {
        if (VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(C0288w.m1192b(context), attributeSet, i);
        this.f856e = new C0244c(this);
        this.f856e.mo1871a(attributeSet, i);
        this.f857f = new C0259k(this);
        this.f857f.mo1928a(attributeSet, i);
        this.f857f.mo1921a();
        this.f858g = new C0258j(this);
    }
}
